package com.root2roof.escp996.stream;

import com.alibaba.fastjson.JSON;
import com.root2roof.escp996.lambda.cart.CartService;
import com.root2roof.escp996.lambda.cart.Sku;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 常见收集器
 *
 * @author Suz1
 * @date 2020/8/9 1:31 下午
 */
public class StreamCollectorTest {
    List<Sku> list = CartService.getCart();

    @Test
    public void toListTest() {
        List<Sku> collect = list.stream()
                .filter(sku -> sku.getTotalPrice() > 200)
                .collect(Collectors.toList());

    }

    @Test
    public void groupTest() {
        // 分组条件,结果集合
        Map<Enum, List<Sku>> enumListMap = list.stream()
                .collect(Collectors.groupingBy(Sku::getSkuCategory));
        System.out.println(JSON.toJSONString(enumListMap, true));
    }

    @Test
    public void partitionTest() {
        Map<Boolean, List<Sku>> map = list.stream().collect(Collectors.partitioningBy(sku -> sku.getTotalPrice() > 200));
        System.out.println(JSON.toJSONString(map, true));
    }
}
