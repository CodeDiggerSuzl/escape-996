package com.root2roof.escp996.lambda.cart;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 使用 lambda 进行判断
 *
 * @author Suz1
 * @date 2020/7/18 1:14 上午
 */
@Slf4j
public class TestUsingLambda {
    @Test
    public void filterSkusUsingLambda() {
        List<Sku> filterSkuList = CartService.filterSkuList(CartService.getCart(),
                (sku -> sku.getTotalPrice() > 200));
        log.info(JSON.toJSONString(filterSkuList, true));
    }
}
