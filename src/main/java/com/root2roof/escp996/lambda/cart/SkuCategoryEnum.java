package com.root2roof.escp996.lambda.cart;

/**
 * Category enum.
 *
 * @author Suz1
 * @date 2020/7/17 12:56 上午
 */
public enum SkuCategoryEnum {
    /**
     * clothing
     */
    CLOTHING(10, "服装类"),
    /**
     * e stuff
     */
    ELECTRONIC(20, "数码产品类"),
    /**
     * sports
     */
    SPORTS(30, "运动类"),
    /**
     * book
     */
    BOOKS(40, "图书类");

    /**
     * Code
     */
    private Integer code;
    /**
     * Category Name
     */
    private String  Name;


    SkuCategoryEnum(Integer code, String name) {
        this.code = code;
        Name = name;
    }

}
