package com.lucheng.design.pattern.structure.appearacne;

/**
 * 模拟库存系统
 */
public class StoreService {
    public boolean subStore(GiftPoint giftPoint){
        System.out.println(giftPoint.getName()+"库存减1");
        return true;
    }
}
