package com.root2roof.escp996.guavaframework;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.root2roof.escp996.Utils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Guava List utils.
 *
 * @author Suz1
 * @date 2020/8/9 6:23 下午
 */
public class GuavaCollectionUtilsTest {
    private static final Set SET1 = Sets.newHashSet(1, 2, 3, 4);
    private static final Set SET2 = Sets.newHashSet(1, 8, 7, 6);

    @Test
    public void unionTest() {
        Set<Integer> union = Sets.union(SET2, SET1);
        System.out.println(union);
        Set<Integer> intersection = Sets.intersection(SET2, SET1);
        System.out.println(intersection);
        System.out.println(Sets.difference(SET1, SET2));
        System.out.println(Sets.symmetricDifference(SET1, SET2));
    }

    @Test
    public void powerSet() {
        Set set = Sets.powerSet(SET1);
        System.out.println(JSON.toJSONString(set));
    }

    @Test
    public void cartesianProduct() {
        Set set = Sets.cartesianProduct(SET1, SET2);
        System.out.println(JSON.toJSONString(set));
    }

    @Test
    public void listsTest() {
        ArrayList<Integer> list = Lists.newArrayList(0, 2, 1, 3, 4);
        List<List<Integer>> partition = Lists.partition(list, 2);
        Utils.printJson(partition);

        // reverse
        List<Integer> reverse = Lists.reverse(list);
        Utils.printJson(reverse);
    }
}
