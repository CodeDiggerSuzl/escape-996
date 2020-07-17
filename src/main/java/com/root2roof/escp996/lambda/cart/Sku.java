package com.root2roof.escp996.lambda.cart;

/**
 * 商品信息
 *
 * @author Suz1
 * @date 2020/7/17 12:40 上午
 */
public class Sku {
    /**
     * id
     */
    private Integer skuId;
    /**
     * name
     */
    private String  skuName;
    /**
     * price
     */
    private Double  skuPrice;
    /**
     * total cnt
     */
    private Integer totalNum;
    /**
     * total
     */
    private Double  totalPrice;
    /**
     * category
     */
    private Enum    skuCategory;

    public Sku(Integer skuId, String skuName, Double skuPrice, Integer totalNum, Double totalPrice, Enum skuCategory) {
        this.skuId = skuId;
        this.skuName = skuName;
        this.skuPrice = skuPrice;
        this.totalNum = totalNum;
        this.totalPrice = totalPrice;
        this.skuCategory = skuCategory;
    }

    public Sku(Integer skuId, String skuName, Double skuPrice, Integer totalNum, Enum skuCategory) {
        this.skuId = skuId;
        this.skuName = skuName;
        this.skuPrice = skuPrice;
        this.totalNum = totalNum;
        this.skuCategory = skuCategory;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Enum getSkuCategory() {
        return skuCategory;
    }

    public void setSkuCategory(Enum skuCategory) {
        this.skuCategory = skuCategory;
    }

}
