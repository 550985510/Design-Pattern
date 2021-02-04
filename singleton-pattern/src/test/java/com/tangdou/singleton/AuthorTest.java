package com.tangdou.singleton;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 木叶丸
 * @date 2018/12/3 21:52
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class AuthorTest {

    @Test
    public void getAuthor() {
        Author author = Author.getInstance();
        log.info("{}", author.getName());
        LazyAuthor instance = LazyAuthor.getInstance();
        log.info("{}", instance.getName());
        LazyAuthor instanceSecured = LazyAuthor.getInstanceSecured();
        log.info("{}", instanceSecured.getName());
        LazyAuthor instanceByNestedClass = LazyAuthor.getInstanceByNestedClass();
        log.info("{}", instanceByNestedClass.getName());
        LazyAuthor instanceByCas = LazyAuthor.getInstanceByCas();
        log.info("{}", instanceByCas.getName());
    }

    @Test
    public void testArr() {
        int[] arr = {3,5,7,9};
        this.sort(arr, 0, arr.length - 1);
        log.info("结果{}", findKth(arr, 1));
    }

    private int findKth(int[] arr, int k) {
        int a = 1;
        for (int anArr : arr) {
            if (anArr % 2 != 0) {
                if (a == k) {
                    return anArr;
                }
                a++;
            }
        }
        return 0;
    }

    private void sort(int[] a, int low, int height) {
        int i = low, j = height;
        if (i > j) return;
        int m = a[i];
        while (i < j) {
            while (i < j && a[j] > m) {
                j--;
            }
            while (i < j && a[i] <= m) {
                i++;
            }
            if (i < j) {
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }
        }
        m = a[i];
        a[i] = a[low];
        a[low] = m;
        sort(a, low, i - 1);
        sort(a, i + 1, height);
    }

}
