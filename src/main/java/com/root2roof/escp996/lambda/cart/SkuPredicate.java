package com.root2roof.escp996.lambda.cart;

/**
 * Sku predicate interface
 *
 * @author Suz1
 * @date 2020/7/18 12:53 上午
 */
public interface SkuPredicate {
    /**
     * Choose the judge rule
     *
     * @param sku sku to be test
     * @return pass the test or not
     */
    boolean test(Sku sku);
}
