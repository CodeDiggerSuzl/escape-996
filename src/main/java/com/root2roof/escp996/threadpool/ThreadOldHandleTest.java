package com.root2roof.escp996.threadpool;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Suz1
 * @date 2020/8/9 7:48 下午
 */
public class ThreadOldHandleTest {
    /**
     * 原始的处理方法 Word -> PDF, 处理时间很长的过程
     */
    @Test
    public void oldHandle() throws InterruptedException {
        // 使用循环来模拟很多用户的请求
        for (int req = 1; req <= 100; req++) {
            // use thread
            new Thread(() -> {
                System.out.println("文件处理开始");
                try {
                    Thread.sleep(TimeUnit.SECONDS.toSeconds(30));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("文件处理结束");

            }).start();
        }
        Thread.sleep(1000L * 1000);
    }

    @Test
    public void newHandleTest() throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            threadPool.execute(() -> {
                System.out.println("文件处理开始");
                try {
                    Thread.sleep(TimeUnit.SECONDS.toSeconds(30));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("----文件处理结束----");
            });
        }
        Thread.sleep(1000L * 1000);


    }

}
