package com.tangdou.observer.observer;

import com.tangdou.observer.model.OrderStatus;
import com.tangdou.observer.model.OrderStatusAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * 数据库策略构造器
 * @author 崔航
 * @date 2020/8/17 17:40
 */
@Component
public class ObserverManager implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private final MultiValueMap<OrderStatus, Observer> observerMap = new LinkedMultiValueMap<>(16);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void notify(OrderStatus orderStatus, String orderNo) {
        List<Observer> observers = observerMap.get(orderStatus);
        observers.forEach(observer -> observer.handle(orderNo));
    }

    @PostConstruct
    public void postConstruct() {
        Map<String, Observer> beansOfType = applicationContext.getBeansOfType(Observer.class);
        for (Map.Entry<String, Observer> stringMessageBuilderEntry : beansOfType.entrySet()) {
            Observer observer = stringMessageBuilderEntry.getValue();
            if (observer.getClass().isAnnotationPresent(OrderStatusAnnotation.class)) {
                OrderStatusAnnotation annotation = observer.getClass().getAnnotation(OrderStatusAnnotation.class);
                if (ObjectUtils.isEmpty(annotation)) {
                    continue;
                }
                OrderStatus[] status = annotation.value();
                for (OrderStatus orderStatus : status) {
                    observerMap.add(orderStatus, observer);
                }
            }
        }
    }
}
