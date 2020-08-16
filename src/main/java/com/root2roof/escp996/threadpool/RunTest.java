package com.root2roof.escp996.threadpool;

import com.root2roof.escp996.utils.Utils;
import org.junit.Test;

import java.util.concurrent.*;

/**
 * 向线程池中提交数据.
 *
 * @author Suz1
 * @date 2020/8/9 11:14 下午
 */
public class RunTest {
    @Test
    public void submitTest() throws ExecutionException, InterruptedException {
        // create a thread pool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        // use submit submit a task,
        Future<Integer> future = cachedThreadPool.submit(() -> {
            Thread.sleep(TimeUnit.SECONDS.toSeconds(1));
            return 2 * 5;
        });
        // future.get() is a blocking method, until the method is done
        Integer integer = future.get();
        Utils.printJson(integer);
    }

    @Test
    public void executorTest() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        // no return result and will not throw any exception, cause input is a Runnable interface
        fixedThreadPool.execute(() -> {
            try {
                Thread.sleep(TimeUnit.SECONDS.toSeconds(2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int num = 2 * 5;
            System.out.println("执行结果:" + num);
        });

    }
}
