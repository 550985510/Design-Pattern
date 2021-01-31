package com.tangdou.builder.demo;

import com.tangdou.builder.demo.enums.SizeType;
import com.tangdou.builder.demo.food.burger.ZingerBurger;
import com.tangdou.builder.demo.food.drink.IceCola;
import com.tangdou.builder.demo.food.snack.FrenchFries;

/**
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
