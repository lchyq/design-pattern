package com.lucheng.design.pattern.creational.singerlon;

import javax.sound.midi.Soundbank;

public class T implements Runnable {
    @Override
    public void run(){
        StaticSingelon staticSingelon = StaticSingelon.getInstance();
        System.out.println("current thread:"+Thread.currentThread().getName()+" "+staticSingelon);
    }
}
