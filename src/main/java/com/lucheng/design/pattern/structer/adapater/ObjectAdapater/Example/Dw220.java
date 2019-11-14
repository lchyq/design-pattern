package com.lucheng.design.pattern.structer.adapater.ObjectAdapater.Example;

import javax.sound.midi.Soundbank;

/**
 * 被适配者 220v交流电
 */
public class Dw220 {
    public int D220(){
        int power = 220;
        System.out.println("交流电220V");
        return power;
    }
}
