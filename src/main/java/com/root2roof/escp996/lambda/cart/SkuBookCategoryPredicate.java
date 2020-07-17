package com.root2roof.escp996.lambda.cart;

/**
 * 图书策略类
 *
 * @author Suz1
 * @date 2020/7/18 1:01 上午
 */
public class SkuBookCategoryPredicate implements SkuPredicate {

    @Override
    public boolean test(Sku sku) {
        return SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory());
    }
}
