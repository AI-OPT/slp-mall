package com.ai.slp.mall.api.shopcart.param;

import com.ai.opt.base.vo.BaseInfo;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 购物车商品信息
 *
 * Date: 2016年5月16日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author liutong5
 */
public class CartProd extends BaseInfo {
    /**
     * 用户ID,必填
     */
    @NotBlank(message = "用户ID不能为空")
    private String userId;

    /**
     * 单品ID,必填
     */
    @NotBlank(message = "单品ID不能为空")
    private String skuId;

    /**
     * 数量,大于0,必填
     */
    @NotNull(message = "数量不能为空")
    @Min(value = 1,message = "商品数量不能小于1")
    private Long buyNum;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Long getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Long buyNum) {
        this.buyNum = buyNum;
    }
}

