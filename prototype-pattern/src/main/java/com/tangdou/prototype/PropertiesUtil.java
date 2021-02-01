package com.tangdou.prototype;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 崔航
 * @date 2021/2/1 10:46
 */
public class PropertiesUtil {

    public static Properties get(String name) {
        try {
            return PropertiesLoaderUtils.loadProperties(new EncodedResource(new ClassPathResource(name), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
