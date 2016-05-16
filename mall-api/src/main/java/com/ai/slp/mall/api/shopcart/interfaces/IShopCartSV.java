package com.ai.slp.mall.api.shopcart.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfoResponse;
import com.ai.slp.mall.api.shopcart.param.*;

/**
 * 购物车服务
 *
 * Date: 2016年5月16日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author liutong5
 */
public interface IShopCartSV {

    /**
     * 购物车中添加商品
     *
     * @param cartProd 购物车添加商品信息
     * @return 添加结果
     * @throws BusinessException
     * @throws SystemException
     * @author liutng5
     * @ApiCode SHOP_CART_0100
     */
    public BaseResponse addProd(CartProd cartProd)
        throws BusinessException,SystemException;
    @interface AddProd{}

    /**
     * 查询用户的购物车信息
     *
     * @param userInfo 用户信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author liutng5
     * @ApiCode SHOP_CART_0101
     */
    public PageInfoResponse<CartProdInfo> queryCartOfUser(UserInfo userInfo)throws BusinessException,SystemException;
    @interface QueryCartOfUser{}

    /**
     * 调整购物车内商品数量
     *
     * @param cartProd 购物车更新商品信息
     * @return 操作结果
     * @throws BusinessException
     * @throws SystemException
     * @author liutng5
     * @ApiCode SHOP_CART_0102
     */
    public BaseResponse updateProdNum(CartProd cartProd) throws BusinessException,SystemException;
    @interface UpdateProdNum{}

    /**
     * 删除购物车商品,单个和批量都可以
     *
     * @param multiCartProd 购物车商品删除信息
     * @return 删除操作结果
     * @throws BusinessException
     * @throws SystemException
     * @author liutng5
     * @ApiCode SHOP_CART_0103
     */
    public MultiProdDelRes deleteMultiProd(MultiCartProd multiCartProd)throws BusinessException,SystemException;
    @interface DeleteMultiProd{}
}
