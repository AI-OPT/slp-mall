package com.ai.slp.mall.api.shopcart.param;

import com.ai.opt.base.vo.BaseInfo;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * 购物车商品批量操作信息
 *
 * Date: 2016年5月16日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author liutong5
 */
public class MultiCartProd extends BaseInfo {
    /**
     * 用户ID,必填
     */
    @NotBlank(message = "用户ID不能为空")
    private String userId;

    /**
     * 商品标识集合,必填
     */
    @NotNull(message = "商品标识集合不能为空")
    @Size(message = "商品集合不能为空",min = 1)
    private List<String> skuIdList;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getSkuIdList() {
        return skuIdList;
    }

    public void setSkuIdList(List<String> skuIdList) {
        this.skuIdList = skuIdList;
    }
}
