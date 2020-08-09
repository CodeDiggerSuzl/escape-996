package com.root2roof.escp996.guavaframework;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import org.junit.Before;
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
    static ArrayList<Integer> list;

    public static void removeOneElement(List<Integer> list) {
        list.remove(0);
    }

    public static void main(String[] args) {

        List<Integer> newList = Collections.unmodifiableList(list);
        removeOneElement(newList);
        System.out.println(list);
    }

    @Before
    public void init() {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void guavaListTest() {
        ImmutableSet<Integer> set = ImmutableSet.copyOf(list);
        ImmutableList<ArrayList<Integer>> immutableList = ImmutableList.of(list);
        ImmutableList<Object> build = ImmutableList.builder()
                .add(1)
                .addAll(Sets.newHashSet(234, 34))
                .add(4).build();
        System.out.println(build.toString());
    }
}
