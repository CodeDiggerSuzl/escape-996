package com.root2roof.escp996.stream;

import com.alibaba.fastjson.JSON;
import com.root2roof.escp996.lambda.cart.CartService;
import com.root2roof.escp996.lambda.cart.Sku;
import com.root2roof.escp996.lambda.cart.SkuCategoryEnum;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

/**
 * 集合流的各种操作
 *
 * @author Suz1
 * @date 2020/8/9 12:56 上午
 */
public class StreamOperatorTest {
    List<Sku> list;

    @Before
    public void init() {
        list = CartService.getCart();
    }

    /**
     * filter
     */
    @Test
    public void filterTest() {
        list.stream()
                .filter(sku -> SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory()))
                .forEach(this::printJson);
    }

    @Test
    public void mapTest() {
        list.stream().map(Sku::getSkuCategory).forEach(this::printJson);
    }

    /**
     * flatmap 返回一个新的流会和其他流进行合并 将对象转换成流
     */
    @Test
    public void flatMapTest() {
        list.stream()
                .flatMap(sku -> Arrays.stream(sku.getSkuName().split("")))
                .forEach(this::printJson);
    }

    /**
     * peek 中间操作, forEach 终端操作
     */
    @Test
    public void peekTest() {
        list.stream().peek(sku -> System.out.println(sku.getSkuName())).forEach(this::printJson);
    }

    /** 下面是有状态的中间操作 */
    @Test
    public void sortTest() {
        list.stream().sorted(Comparator.comparing(Sku::getTotalPrice).reversed())
                .forEach(this::printJson);
    }

    @Test
    public void distinctTest() {
        list.stream()
                .map(Sku::getSkuCategory)
                .distinct()
                .forEach(this::printJson);
    }

    /**
     * skip the first n number
     * <p>
     * limit 取前几条数据
     * <p>
     * 两个结合可以进行<b>分页</b>
     */
    @Test
    public void skipTest() {
        list.stream().
                sorted(Comparator.comparing(Sku::getTotalPrice))
                // 第 2 页, 每页 2 条
                .skip(1 * 2)
                .skip(2)
                .forEach(this::printJson);
    }

    /** -------------------- 终端操作 -------------------- */

    @Test
    public void allMatchTest() {
        // all match 终端短路操作
        boolean allMatch = list.stream().allMatch(sku -> sku.getTotalPrice() > 1000);
        this.printJson(allMatch);
    }

    @Test
    public void anyMatchTest() {
        boolean anyMatch = list.stream().anyMatch(sku -> sku.getTotalPrice() > 100);
    }

    @Test
    public void noneMatchTest() {
        boolean noneMatch = list.stream().noneMatch(sku -> sku.getTotalPrice() > 100);
    }

    /**
     * match 都是短路终端操作
     * findFirst/findAny 也是短路终端操作,但是 findAny 是随机匹配
     * 下面是非短路终端操作
     */
    @Test
    public void maxTest() {
        OptionalDouble maxTotalPrice = list.stream()
                .mapToDouble(Sku::getTotalPrice)
                .min();
        ///                .max();
        this.printJson(maxTotalPrice.isPresent() ? maxTotalPrice.getAsDouble() : maxTotalPrice.orElse(0.0));
    }

    @Test
    public void countTest() {
        // 统计个数
        long count = list.stream().count();
        System.out.println(count);
    }

    private void printJson(Object o) {
        System.out.println(JSON.toJSONString(o));
    }
}
