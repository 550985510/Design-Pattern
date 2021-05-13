package com.tangdou.strategy.spring;

import com.tangdou.strategy.AssignmentStrategy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 崔航
 * @date 2021/5/13 10:26
 */
@Component
public class StrategyFactory {

    /**
     * spring会根据component指定的名称自动注入到map
     */
    @Resource
    Map<String, AssignmentStrategy> strategyMap = new HashMap<>(16);

    public AssignmentStrategy getStrategy(String component) {
        AssignmentStrategy strategy = strategyMap.get(component);
        if(strategy == null) {
            throw new RuntimeException("no strategy defined");
        }
        return strategy;
    }
}
