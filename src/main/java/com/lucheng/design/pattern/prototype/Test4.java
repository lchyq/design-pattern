package com.lucheng.design.pattern.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 当对象中有jdk中的集合类 时
 * 需要复写对象中的clone()，并调用对应
 * 集合的克隆方法，对应集合的克隆方法本身已经
 * 避免了浅克隆带来的风险
 */
public class Test4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.list中的元素是jdk常量
//        ArrayList<String> list = new ArrayList<>();
//        list.add(new String("123"));
//        Cache cache = new Cache(list);
//        Cache cloneCache = (Cache) cache.clone();
//        list.clear();
//        list.add(new String("223"));
//        System.out.println(cache);
//        System.out.println(cloneCache);

        //2.list中的元素是对象
        //集合中是对象的时候，就不要再使用原型模式了
        ArrayList<Person> list = new ArrayList<>();
        Person person = new Person();
        person.setBirthday(new Date(0l));
        list.add(person);
        Cache cache = new Cache(list);
        Cache cache1 = (Cache) cache.clone();
        cache.getList().get(0).getBirthday().setTime(2l);
        System.out.println(cache);
        System.out.println(cache1);
    }
}
