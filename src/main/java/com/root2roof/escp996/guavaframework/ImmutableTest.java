package com.root2roof.escp996.guavaframework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 不可变集合使用
 *
 * @author Suz1
 * @date 2020/8/9 4:26 下午
 */
public class ImmutableTest {
    public static void removeOneElement(List<Integer> list) {
        list.remove(0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> newList = Collections.unmodifiableList(list);
        removeOneElement(newList);
        System.out.println(list);
    }

    @Test
    public void guavaListTest() {
        ImmutableSet.copyOf()
    }
}
