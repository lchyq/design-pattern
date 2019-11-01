package com.lucheng.design.pattern.creational.singerlon;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例模式
 * 适用于 单利对象比较多
 * 适用于 该容器在项目初始化阶段就初始化好的场景
 */
public class ContanerInstance {
    private  static Map<String,Object> container = new HashMap<String,Object>();
    public static void setInstance(String key,Object value){
        if(!container.containsKey(key)){
            container.put(key,value);
        }else{
            throw  new RuntimeException("该单例对象已经存在");
        }
    }
    public static Object getInstance(String key){
        return container.get(key);
    }
    //避免创建多个单例容器
    private ContanerInstance(){}
}
