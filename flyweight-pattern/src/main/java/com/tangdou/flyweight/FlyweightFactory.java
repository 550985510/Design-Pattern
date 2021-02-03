package com.tangdou.flyweight;

import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 崔航
 * @date 2021/2/3 16:29
 */
public class FlyweightFactory {

    private static final Map<Long, DataFlyweight> DATA_FLYWEIGHT_MAP = new HashMap<>(16);
    private static final Map<Long, UserFlyweight> USER_FLYWEIGHT_MAP = new HashMap<>(16);

    public static DataFlyweight produceDataFlyweight(Long id) {
        DataFlyweight flyweight = DATA_FLYWEIGHT_MAP.get(id);
        if (ObjectUtils.isEmpty(flyweight)) {
            flyweight = new DataFlyweight(id);
            DATA_FLYWEIGHT_MAP.put(id, flyweight);
        }
        return flyweight;
    }

    public static UserFlyweight produceUserFlyweight(Long id) {
        UserFlyweight flyweight = USER_FLYWEIGHT_MAP.get(id);
        if (ObjectUtils.isEmpty(flyweight)) {
            flyweight = new UserFlyweight(id);
            USER_FLYWEIGHT_MAP.put(id, flyweight);
        }
        return flyweight;
    }
}
