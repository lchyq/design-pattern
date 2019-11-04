package com.lucheng.design.pattern.structure.appearacne;

/**
 * 外观模式client
 */
public class Test {
    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(new GiftPoint("T-shirt"));
    }
}
