package com.tangdou.builder.demo;

import com.tangdou.builder.demo.enums.SizeType;
import com.tangdou.builder.demo.food.burger.ZingerBurger;
import com.tangdou.builder.demo.food.drink.IceCola;
import com.tangdou.builder.demo.food.snack.FrenchFries;

/**
 * 将特定的构造算法封装在builder类中
 * 根据需要创建不同的builder类或方法
 * 将业务（构造算法）和实体（结构）分开
 * @author 崔航
 * @date 2021/1/31 15:47
 */
public class MealBuilder {

    /**
     * 儿童套餐
     * @return 儿童套餐
     */
    Meal childrenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ZingerBurger());
        meal.addItem(new FrenchFries(SizeType.MEDIUM));
        meal.addItem(new IceCola(SizeType.MEDIUM));
        return meal;
    }
}
