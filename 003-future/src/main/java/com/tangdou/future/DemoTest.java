package com.tangdou.future;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 崔航
 * @date 2023/2/9 17:36
 */
public class DemoTest {

    public static void main(String[] args) {
        List<Order> list = new ArrayList<>(5);

        list.add(Order.builder().cityId(1).build());
        list.add(Order.builder().cityId(1).build());
        list.add(Order.builder().cityId(1).build());
        list.add(Order.builder().cityId(2).build());
        list.add(Order.builder().cityId(2).build());
        Map<Integer, Long> collect = list.stream().map(Order::getCityId).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    @Builder
    @Data
    public static class Order {
        private Integer cityId;
    }
}
