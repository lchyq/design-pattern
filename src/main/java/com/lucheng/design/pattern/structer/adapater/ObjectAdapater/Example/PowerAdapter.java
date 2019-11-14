package com.lucheng.design.pattern.structer.adapater.ObjectAdapater.Example;

/**
 * 电源适配器
 * 优先使用对象适配器模式
 * 因为java是单继承
 */
public class PowerAdapter implements DC5 {
    private Dw220 dw220 = new Dw220();
    @Override
    public void dc5() {
        int inPutPower = dw220.D220();
        System.out.println("对象适配器模式，输入电压是"+inPutPower);
        int outPutPower = inPutPower / 44;
        System.out.println("对象适配器模式，输出电压是"+outPutPower);
    }
}
