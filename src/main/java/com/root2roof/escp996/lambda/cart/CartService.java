package com.root2roof.escp996.lambda.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Cart Service
 *
 * @author Suz1
 * @date 2020/7/17 12:53 上午
 */
public class CartService {
    private static final List<Sku> CART_SKU_LIST = new ArrayList<Sku>() {
        // prod added to the cart
        {
            add(new Sku(33324234, "HHKB", 1699.99, 1, 1699.99, SkuCategoryEnum.ELECTRONIC));
            add(new Sku(1231, "PS5", 5999.99, 1, 5999.99, SkuCategoryEnum.ELECTRONIC));
            add(new Sku(23123, "算法 4", 99d, 1, 99d, SkuCategoryEnum.BOOKS));
            add(new Sku(2342, "T恤", 99d, 1, 99d, SkuCategoryEnum.CLOTHING));
            add(new Sku(893, "football", 100.0, 1, 100.1, SkuCategoryEnum.SPORTS));
        }
    };

    /** Get all products in cart */
    public static List<Sku> getCart() {
        return CART_SKU_LIST;
    }

    /**
     * V 1.0.0
     * 获取全部的电子产品
     *
     * @return electric goods
     */
    public static List<Sku> filterElectronicGoods(List<Sku> lists) {
        List<Sku> result = new ArrayList<>(5);
        for (Sku good : lists) {
            // 如果是电子产品类
            if (SkuCategoryEnum.ELECTRONIC.equals(good.getSkuCategory())) {
                result.add(good);
            }
        }
        return result;
    }

    /**
     * V 1.0.0 通过类型进行过滤
     *
     * @param category 过滤的类型
     * @return 某类型的数据集合
     */
    public static List<Sku> filterSkuByCategory(SkuCategoryEnum category) {
        ArrayList<Sku> result = new ArrayList<>(5);
        for (Sku single : CART_SKU_LIST) {
            if (category.equals(single.getSkuCategory())) {
                result.add(single);
            }
        }
        return result;
    }

    /**
     * 使用不同的判断标准对sku 进行过滤
     *
     * @param cartList  总 list
     * @param predicate 不同的判断策略 类似策略模式
     * @return 过滤后的 list
     */
    public static List<Sku> filterSkuList(List<Sku> cartList, SkuPredicate predicate) {
        ArrayList<Sku> result = new ArrayList<>(5);
        for (Sku single : CART_SKU_LIST) {
            // 格局不同的判断策略进行判断
            if (predicate.test(single)) {
                result.add(single);
            }
        }
        return result;
    }

}
