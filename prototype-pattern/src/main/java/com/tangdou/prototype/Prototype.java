package com.tangdou.prototype;

import lombok.Data;
import org.springframework.util.ObjectUtils;

import java.util.*;

/**
 * 原型对象
 * @author 崔航
 * @date 2021/2/1 10:49
 */
@Data
public class Prototype implements Cloneable {

    private String username;

    private String password;

    private Map<String, Integer> map;

    private List<Integer> list;

    public Prototype(Map<String, Integer> map, List<Integer> list) {
        System.out.println("我是原型的构造方法");
        //模拟从数据库获取配置信息
        Properties properties = PropertiesUtil.get("prototype.yaml");
        if (!ObjectUtils.isEmpty(properties)) {
            this.username = properties.getProperty("username");
            this.password = properties.getProperty("password");
        }
        this.map = map;
        this.list = list;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Prototype clone() {
        try {
            Prototype prototype = (Prototype) super.clone();
            //深度拷贝
            prototype.map = (Map<String, Integer>) ((HashMap<String, Integer>) this.map).clone();
            prototype.list = (List<Integer>) ((ArrayList<Integer>) this.list).clone();
            return prototype;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
