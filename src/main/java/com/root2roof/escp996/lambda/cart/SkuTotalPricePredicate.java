package com.root2roof.escp996.lambda.cart;

/**
 * Total price
 *
 * @author Suz1
 * @date 2020/7/18 1:01 上午
 */
public class SkuTotalPricePredicate implements SkuPredicate {

    @Override
    public boolean test(Sku sku) {
        return sku.getTotalPrice() > 200;
    }
}
