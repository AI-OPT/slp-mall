package com.ai.slp.mall.util;


import com.ai.opt.sdk.components.sequence.util.SeqUtil;

public final class SequenceUtil {

    /**
     * 购物车中商品明细序列
     */
    private static final String ORD_OD_CART_PROD$PROD_DETAL_ID$SEQ = "ORD_OD_CART_PROD$PROD_DETAL_ID$SEQ";


    public static Long genCartId(){
        return SeqUtil.getNewId(ORD_OD_CART_PROD$PROD_DETAL_ID$SEQ);
    }
}
