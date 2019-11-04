package com.lucheng.design.pattern.structure.appearacne;

/**
 * 外观模式类
 * 屏蔽复杂的系统减调用
 * 提供简单的对外接口
 * 提供服务
 */
public class GiftExchangeService {
    //模拟spring自动注入
    private ApplyService applyService = new ApplyService();
    private StoreService storeService = new StoreService();
    private ShippingService shippingService = new ShippingService();
    public void giftExchange(GiftPoint giftPoint){
        if(applyService.apply(giftPoint)){
            if (storeService.subStore(giftPoint)){
                shippingService.returnShipping(giftPoint);
            }
        }
    }
}
