package com.root2roof.escp996.lambda.cart;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Suz1
 * @date 2020/7/18 12:20 上午
 */
@Slf4j
public class TestNotUsingLambda {

    @Test /* 使用实例或者匿名内部类来进行策略的定制*/
    public void testFilterSkuList() {
        List<Sku> skus = CartService.filterSkuList(CartService.getCart(), /*new SkuBookCategoryPredicate()*/ new SkuPredicate() {
            @Override
            public boolean test(Sku sku) {
                return SkuCategoryEnum.SPORTS.equals(sku.getSkuCategory());
            }
        });
        log.info(JSON.toJSONString(skus, true));
    }

    @Test
    public void testFilterByCategory() {
        List<Sku> filterList = CartService.filterSkuByCategory(SkuCategoryEnum.BOOKS);
        log.info(JSON.toJSONString(filterList, true));
    }

    @Test
    public void testFilterElectricUsingForLoop() {
        List<Sku> filterElectronicGoods = CartService.filterElectronicGoods(CartService.getCart());
        log.info(JSON.toJSONString(filterElectronicGoods, true));
    }
}
