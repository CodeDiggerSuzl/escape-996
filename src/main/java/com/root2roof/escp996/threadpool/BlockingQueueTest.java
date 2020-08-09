package com.root2roof.escp996.threadpool;

import com.root2roof.escp996.Utils;
import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;

/**
 * Blocking queue test.
 *
 * @author Suz1
 * @date 2020/8/9 9:18 下午
 */
public class BlockingQueueTest {
    /**
     *
     */
    @Test
    public void arrQueueTest() throws InterruptedException {
        ArrayBlockingQueue<Integer> arrayQ = new ArrayBlockingQueue<>(10);
        for (int i = 0; i < 20; i++) {
            arrayQ.put(i);
            // 到 10 的时候就阻塞了
            Utils.printJson("Putting " + i + "into arrayBlockingQueue");
        }
    }

    @Test
    public void linkedListQueueTest() throws InterruptedException {
        LinkedBlockingDeque<Integer> intQ = new LinkedBlockingDeque<>(10);

        for (int i = 0; i < 20; i++) {
            intQ.put(i);
            // 到 10 的时候就阻塞了
            Utils.printJson("Putting " + i + "into LinkedBlockingDeque");
        }
    }

    @Test
    public void syncBlockingQueueTest() {
        SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>();
        new Thread(() -> {
            try {
                synchronousQueue.put(1);
                synchronousQueue.put(2);

                Utils.printJson("insert ----- done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                synchronousQueue.take();
                Utils.printJson("take done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
