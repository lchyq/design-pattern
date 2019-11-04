package com.lucheng.design.pattern.structure.appearacne;

/**
 * 模拟物流系统
 */
public class ShippingService {
    public boolean returnShipping(GiftPoint giftPoint){
        System.out.println("获取"+giftPoint.getName()+"订单编号");
        return true;
    }
}
