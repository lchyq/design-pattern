package com.lucheng.design.pattern.creational.singerlon;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Thread thread = new Thread(new T());
        Thread thread2 = new Thread(new T());
        thread.start();
        thread2.start();
//        ExecutorService executorService = Executors.newFixedThreadPool(200);
//        for(int i = 0;i < 200;i++) {
//            executorService.submit(new T());
//        }

        //利用序列化，反序列化来破坏单例模式
//        hungreySingelon hungreySingelon = com.lucheng.design.pattern.creational.singerlon.hungreySingelon.getInstance();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:\\singelon.txt"));
//        objectOutputStream.writeObject(hungreySingelon);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\singelon.txt"));
//        hungreySingelon newhungreySingelon = (hungreySingelon)ois.readObject();
//        System.out.println(hungreySingelon == newhungreySingelon);

        //利用反射攻击来破坏单例模式
//        hungreySingelon hungreySingelon = com.lucheng.design.pattern.creational.singerlon.hungreySingelon.getInstance();
//        Class clazz = hungreySingelon.getClass();
//        Constructor constructor = clazz.getDeclaredConstructor();
        //因为构造函数是私有的，所有改变权限，来完成反射攻击
//        constructor.setAccessible(true);
//        com.lucheng.design.pattern.creational.singerlon.hungreySingelon hungreySingelon1 = (com.lucheng.design.pattern.creational.singerlon.hungreySingelon) constructor.newInstance();
//        System.out.println(hungreySingelon);
//        System.out.println(hungreySingelon1);
//        System.out.println(hungreySingelon == hungreySingelon1);
    }
}
