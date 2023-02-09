package com.tangdou.future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * @author 崔航
 * @date 2023/2/9 15:10
 */
public class CompletableFutureDemo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<CompletableFuture<Boolean>> futures = list.stream().map(CompletableFutureDemo::subOrderInterceptor).collect(Collectors.toCollection(() -> new ArrayList<>(list.size())));
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
        int i = 1;
        for (CompletableFuture<Boolean> future : futures) {
            try {
                Boolean success = future.get();
                System.out.println("当前线程号[" + i++ + "]运算结果["  + success + "]");
            } catch (InterruptedException | ExecutionException ignored) {

            }
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static CompletableFuture<Boolean> subOrderInterceptor(Integer number) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000 * number);
                return true;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            }
        });
    }
}
