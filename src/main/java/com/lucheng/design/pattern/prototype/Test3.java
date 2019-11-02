package com.lucheng.design.pattern.prototype;

import com.lucheng.design.pattern.creational.singerlon.HungreySingelon;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 克隆模式破坏单例模式
 */
public class Test3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungreySingelon hungreySingelon = HungreySingelon.getInstance();
        Method method = hungreySingelon.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungreySingelon hungreySingelon1 = (HungreySingelon) method.invoke(hungreySingelon);
        System.out.println(hungreySingelon);
        System.out.println(hungreySingelon1);
        System.out.println(hungreySingelon == hungreySingelon1);
    }
}
