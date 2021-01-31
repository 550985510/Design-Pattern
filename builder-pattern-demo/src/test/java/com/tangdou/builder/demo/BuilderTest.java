package com.tangdou.builder.demo;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2021/1/31 15:52
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BuilderTest {

    @Test
    public void test() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.childrenMeal();
        meal.showItems();
    }
}
