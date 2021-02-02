package com.tangdou.composite;

import com.tangdou.ApplicationStarter;
import com.tangdou.composite.filter.FilterType;
import com.tangdou.composite.node.NodeLinked;
import com.tangdou.composite.node.RuleNode;
import com.tangdou.composite.node.result.ResultNode;
import com.tangdou.composite.user.User;
import com.tangdou.composite.user.attribute.AgeGroup;
import com.tangdou.composite.user.attribute.Gender;
import com.tangdou.composite.user.attribute.Occupation;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2021/2/2 21:03
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class CompositeTest {

    @Before
    public void init() {
        //模拟页面规则配置
        //规则链：性别->年龄->职业
        //初始化规则树
        //模拟数据库自增id
        Long rootId = 1L, genderId = 100_000L, ageId = 200_000L, occupationId = 300_000L;
        Database.insertRule(new RuleNode(rootId, FilterType.GENDER_FILTER));
        for (Gender gender : Gender.values()) {
            genderId++;
            Database.insertRule(new RuleNode(genderId, FilterType.AGE_FILTER));
            Database.insertNodeLinked(new NodeLinked(rootId, genderId, false, gender));
            for (AgeGroup ageGroup : AgeGroup.values()) {
                ageId++;
                Database.insertRule(new RuleNode(ageId, FilterType.OCCUPATION_FILTER));
                Database.insertNodeLinked(new NodeLinked(genderId, ageId, false, ageGroup));
                for (Occupation occupation : Occupation.values()) {
                    occupationId++;
                    Database.insertResult(new ResultNode(occupationId, rootId + "||" + genderId + "||" + ageId + "||" + occupationId));
                    Database.insertNodeLinked(new NodeLinked(ageId, occupationId, true, occupation));
                }
            }
        }
    }

    @Test
    public void test() {
        User user = new User();
        user.setAge(25);
        user.setGender(Gender.FEMALE);
        user.setOccupation(Occupation.SINGER);
        ResultNode resultNode = RuleEngine.process(1L, user);
        log.info("{}", resultNode);
        user.setOccupation(Occupation.DOCTOR);
        ResultNode resultNode2 = RuleEngine.process(1L, user);
        log.info("{}", resultNode2);
        user.setOccupation(Occupation.PROGRAMMER);
        ResultNode resultNode3 = RuleEngine.process(1L, user);
        log.info("{}", resultNode3);
        user.setAge(99);
        ResultNode resultNode4 = RuleEngine.process(1L, user);
        log.info("{}", resultNode4);
    }
}
