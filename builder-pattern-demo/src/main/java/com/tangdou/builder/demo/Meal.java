package com.tangdou.builder.demo;

import com.tangdou.builder.demo.food.Food;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 餐食
 * @author 崔航
 * @date 2021/1/31 15:30
 */
public class Meal {

    private final List<Food> items = new ArrayList<>();

    public void addItem(Food item){
        items.add(item);
    }

    private Double totalPrice(){
        return items.stream().mapToDouble(Food::price).sum();
    }

    public void showItems(){
        for (Food item : items) {
            System.out.print("品类 : " + item.name());
            System.out.print(", 包装 : " + item.packing().name());
            if (!ObjectUtils.isEmpty(item.accessory())) {
                System.out.print(", 赠品 : " + item.accessory().name()
                        + "(" + item.accessory().number() + item.accessory().unit() + ")");
            }
            System.out.println(", 单价 : " + item.price());
        }
        System.out.println("总价 ：" + this.totalPrice());
    }
}
