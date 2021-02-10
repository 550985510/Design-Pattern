package com.tangdou.state.status;

import com.tangdou.state.model.ArticleStatus;
import com.tangdou.state.model.ArticleStatusAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据库策略构造器
 * @author 崔航
 * @date 2020/8/17 17:40
 */
@Component
public class StatusManager implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private final Map<ArticleStatus, Status> statusMap = new HashMap<>(16);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public Status get(ArticleStatus articleStatus) {
        return statusMap.get(articleStatus);
    }

    @PostConstruct
    public void postConstruct() {
        Map<String, Status> beansOfType = applicationContext.getBeansOfType(Status.class);
        for (Map.Entry<String, Status> stringMessageBuilderEntry : beansOfType.entrySet()) {
            Status value = stringMessageBuilderEntry.getValue();
            if (value.getClass().isAnnotationPresent(ArticleStatusAnnotation.class)) {
                ArticleStatusAnnotation annotation = value.getClass().getAnnotation(ArticleStatusAnnotation.class);
                if (ObjectUtils.isEmpty(annotation)) {
                    continue;
                }
                ArticleStatus status = annotation.value();
                statusMap.put(status, value);
            }
        }
    }
}
