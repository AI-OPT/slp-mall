package com.ai.slp.mall.util;

import com.ai.slp.mall.constants.ShopCartConstants;

/**
 * ipass中mcs工具
 * Created by jackieliu on 16/5/17.
 */
public class IPassMcsUtils {
    public static String genShopCartUserId(String tenantId,String userId){
        return ShopCartConstants.CART_POINTS+":"+tenantId+":"+userId;
    }
}
