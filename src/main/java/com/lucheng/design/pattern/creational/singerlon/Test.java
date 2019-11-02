package com.lucheng.design.pattern.creational.singerlon;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
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
//        HungreySingelon HungreySingelon = com.lucheng.design.pattern.creational.singerlon.HungreySingelon.getInstance();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:\\singelon.txt"));
//        objectOutputStream.writeObject(HungreySingelon);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\singelon.txt"));
//        HungreySingelon newhungreySingelon = (HungreySingelon)ois.readObject();
//        System.out.println(HungreySingelon == newhungreySingelon);

        //利用反射攻击来破坏单例模式
//        HungreySingelon HungreySingelon = com.lucheng.design.pattern.creational.singerlon.HungreySingelon.getInstance();
//        Class clazz = HungreySingelon.getClass();
//        Constructor constructor = clazz.getDeclaredConstructor();
        //因为构造函数是私有的，所有改变权限，来完成反射攻击
//        constructor.setAccessible(true);
//        com.lucheng.design.pattern.creational.singerlon.HungreySingelon hungreySingelon1 = (com.lucheng.design.pattern.creational.singerlon.HungreySingelon) constructor.newInstance();
//        System.out.println(HungreySingelon);
//        System.out.println(hungreySingelon1);
//        System.out.println(HungreySingelon == hungreySingelon1);

        //枚举方式创建单例模式 不会被序列化破坏
//        EnumInstance enumInstance = EnumInstance.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\singelon.txt"));
//        oos.writeObject(enumInstance);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\singelon.txt"));
//        EnumInstance e = (EnumInstance) ois.readObject();
//        System.out.println(enumInstance);
//        System.out.println(e);
//        System.out.println(enumInstance == e);

        //枚举方式的单利模式可以避免反射攻击
//        Class c = EnumInstance.class;
//        Constructor constructor = c.getDeclaredConstructor();//报错是因为 没有获取到无参构造器，通过源码可知，enum中没有无参构造器
//        Constructor constructor1 = c.getDeclaredConstructor(String.class,int.class);
//        constructor1.setAccessible(true);
//        EnumInstance enumInstance = (EnumInstance) constructor1.newInstance();
        //报错可知 Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
        //	at java.lang.reflect.Constructor.newInstance(Constructor.java:417) enum不可以被反射调用
//        if ((clazz.getModifiers() & Modifier.ENUM) != 0)
//            throw new IllegalArgumentException("Cannot reflectively create enum objects");
        //由jdk源码可知，此处的处理方式，与我们使用饿汉式避免反射攻击时的处理方式一致

    }
}
