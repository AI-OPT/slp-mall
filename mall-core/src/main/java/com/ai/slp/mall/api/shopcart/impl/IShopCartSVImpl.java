package com.ai.slp.mall.api.shopcart.impl;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfoResponse;
import com.ai.slp.mall.api.shopcart.interfaces.IShopCartSV;
import com.ai.slp.mall.api.shopcart.param.*;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jackieliu on 16/5/16.
 */
@Service
@Transactional
public class IShopCartSVImpl implements IShopCartSV {
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
    @Override
    public BaseResponse addProd(CartProd cartProd) throws BusinessException, SystemException {
        return null;
    }

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
    @Override
    public PageInfoResponse<CartProdInfo> queryCartOfUser(UserInfo userInfo) throws BusinessException, SystemException {
        return null;
    }

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
    @Override
    public BaseResponse updateProdNum(CartProd cartProd) throws BusinessException, SystemException {
        return null;
    }

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
    @Override
    public MultiProdDelRes deleteMultiProd(MultiCartProd multiCartProd) throws BusinessException, SystemException {
        return null;
    }
}
