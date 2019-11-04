package com.lucheng.design.pattern.structure.appearacne;

/**
 * 模拟审核系统
 */
public class ApplyService {
    public boolean apply(GiftPoint giftPoint){
        System.out.println(giftPoint.getName()+"审核通过");
        return true;
    }
}
