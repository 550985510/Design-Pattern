package com.tangdou.state;

import com.tangdou.ApplicationStarter;
import com.tangdou.state.model.Article;
import com.tangdou.state.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 崔航
 * @date 2021/2/10 14:53
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class StateTest {

    @Resource
    private ArticleService articleService;

    @Test
    public void test() {
        Article article = new Article(1L, "方法论", "王大锤", "略");
        articleService.add(article);
        articleService.edit(1L, "方法论第二部", "啥也没有");
        articleService.submitApproval(article.getId());
        articleService.pass(article.getId());
        articleService.withdraw(article.getId());
    }
}
