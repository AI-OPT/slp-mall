package com.ai.slp.mall.api.shopcart.param;

import com.ai.opt.base.vo.BaseResponse;

import java.util.List;

/**
 * 购物车商品操作结果
 *
 * Date: 2016年5月16日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author liutong5
 */
public class CartProdOptRes extends BaseResponse {
    /**
     * 购物车里商品数
     */
    private Long prodNum;
    /**
     * 购物车里商品的总数量
     */
    private Long prodTotal;
    /**
     * 删除商品总数,删除操作返回信息
     */
    private int delProdTotal;
    /**
     * 删除成功数量,删除操作返回信息
     */
    private int delSuccessNum;
    /**
     * 删除失败商品标识集合,删除操作返回信息
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

    public Long getProdNum() {
        return prodNum;
    }

    public void setProdNum(Long prodNum) {
        this.prodNum = prodNum;
    }

    public Long getProdTotal() {
        return prodTotal;
    }

    public void setProdTotal(Long prodTotal) {
        this.prodTotal = prodTotal;
    }
}
