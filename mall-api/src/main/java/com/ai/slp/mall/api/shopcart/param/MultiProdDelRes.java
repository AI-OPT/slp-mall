package com.ai.slp.mall.api.shopcart.param;

import com.ai.opt.base.vo.BaseResponse;

import java.util.List;

/**
 * 购物车商品批量删除结果
 *
 * Date: 2016年5月16日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author liutong5
 */
public class MultiProdDelRes extends BaseResponse {
    /**
     * 删除商品总数
     */
    private int delProdTotal;
    /**
     * 删除成功数量
     */
    private int delSuccessNum;
    /**
     * 删除失败商品标识集合
     */
    private List<String> failProdIdList;

    public int getDelProdTotal() {
        return delProdTotal;
    }

    public void setDelProdTotal(int delProdTotal) {
        this.delProdTotal = delProdTotal;
    }

    public int getDelSuccessNum() {
        return delSuccessNum;
    }

    public void setDelSuccessNum(int delSuccessNum) {
        this.delSuccessNum = delSuccessNum;
    }

    public List<String> getFailProdIdList() {
        return failProdIdList;
    }

    public void setFailProdIdList(List<String> failProdIdList) {
        this.failProdIdList = failProdIdList;
    }
}
