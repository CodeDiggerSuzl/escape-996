package com.root2roof.escp996.stream;

import com.alibaba.fastjson.JSON;
import com.root2roof.escp996.lambda.cart.CartService;
import com.root2roof.escp996.lambda.cart.Sku;
import com.root2roof.escp996.lambda.cart.SkuCategoryEnum;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * @author Suz1
 * @date 2020/7/21 12:25 上午
 */
public class StreamHandlerTest {
    private List<Sku> list;

    @Before
    public void init() {
        list = CartService.getCart();
    }

    @Test
    public void handleCart() {
        AtomicReference<Double> sumRef = new AtomicReference<>(0.0);
        List<String> resultSkuNameList = list.stream()
                // 打印商品信息
                .peek(sku -> System.out.println(JSON.toJSONString(sku, true)))
                // 过滤
                .filter(sku -> !SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory()))
                // 排序
                .sorted(Comparator.comparing(Sku::getTotalPrice).reversed())
                // get only 2
                .limit(2)
                .peek(sku -> sumRef.set(sumRef.get() + sku.getTotalPrice()))
                .map(Sku::getSkuName)
                .collect(Collectors.toList());

        System.out.println(resultSkuNameList);
        System.out.println(sumRef);
    }
}
