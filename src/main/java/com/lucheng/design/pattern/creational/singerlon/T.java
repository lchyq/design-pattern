package com.lucheng.design.pattern.creational.singerlon;

import javax.sound.midi.Soundbank;

public class T implements Runnable {
    @Override
    public void run(){
        DoubleCheckSingelon doubleCheckSingelon = DoubleCheckSingelon.getInstance();
        System.out.println("current thread:"+Thread.currentThread().getName()+" "+doubleCheckSingelon);
    }
}
