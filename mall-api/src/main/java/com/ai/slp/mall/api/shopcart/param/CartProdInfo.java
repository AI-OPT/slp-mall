package com.ai.slp.mall.api.shopcart.param;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 购物车中商品信息
 *
 * Date: 2016年5月16日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author liutong5
 */
public class CartProdInfo implements Serializable{
    /**
     * 商品名称
     */
    private String prodName;
    /**
     * SKU单品标识
     */
    private String skuId;
    /**
     * 数量
     */
    private int buyNum;
    /**
     * 商品状态
     */
    private String state;
    /**
     * 库存可用量
     */
    private Long usableNum;
    /**
     * 商品图片标识
     */
    private String vfsId;
    /**
     * 添加时间
     */
    private Timestamp insertTime;
    /**
     * 销售价,单位:厘
     */
    private Long salePrice;

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getUsableNum() {
        return usableNum;
    }

    public void setUsableNum(Long usableNum) {
        this.usableNum = usableNum;
    }

    public String getVfsId() {
        return vfsId;
    }

    public void setVfsId(String vfsId) {
        this.vfsId = vfsId;
    }

    public Timestamp getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Timestamp insertTime) {
        this.insertTime = insertTime;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }
}
