package com.tangdou.groovy.loader;

import groovy.lang.GroovyClassLoader;
import org.apache.tomcat.util.codec.binary.Base64;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.nio.charset.StandardCharsets;


/**
 * @author 崔航
 * @date 2023/2/3 9:59
 */
@Component
public class GroovyLoader implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private static final GroovyClassLoader GROOVY_CLASS_LOADER;

    static {
        CompilerConfiguration compilerConfiguration = new CompilerConfiguration();
        compilerConfiguration.setSourceEncoding("UTF-8");
        GROOVY_CLASS_LOADER = new GroovyClassLoader(Thread.currentThread().getContextClassLoader(), compilerConfiguration);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public Object getBean(String beanName, String scriptBase64) {
        Object bean = this.getBean(beanName);
        if (!ObjectUtils.isEmpty(bean)) {
            return bean;
        }
        String script = new String(Base64.decodeBase64(scriptBase64), StandardCharsets.UTF_8);
        Class<?> clz = GROOVY_CLASS_LOADER.parseClass(script);
        AbstractBeanDefinition definition = BeanDefinitionBuilder.genericBeanDefinition(clz).getRawBeanDefinition();
        ((BeanDefinitionRegistry)((AbstractApplicationContext)applicationContext).getBeanFactory()).registerBeanDefinition(beanName, definition);
        return this.getBean(beanName);
    }

    private Object getBean(String beanName) {
        try {
            return applicationContext.getBean(beanName);
        } catch (Exception e) {
            return null;
        }
    }
}
