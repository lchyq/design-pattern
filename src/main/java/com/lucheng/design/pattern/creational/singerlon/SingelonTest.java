package com.lucheng.design.pattern.creational.singerlon;

/**
 * 懒汉式-单例模式
 * 存在线程安全问题
 * 会导致 singelonTest 被创建多份
 * synchronized 开销比较大
 */
public class SingelonTest {
    private static SingelonTest singelonTest = null;
    private SingelonTest(){}
    public synchronized static SingelonTest getInstance(){
        if(singelonTest == null){
            singelonTest = new SingelonTest();
        }
        return singelonTest;
    }
}
