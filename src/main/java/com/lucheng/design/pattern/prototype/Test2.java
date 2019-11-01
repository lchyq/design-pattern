package com.lucheng.design.pattern.prototype;

import java.util.Date;

/**
 * 深拷贝-在有嵌套关系的class中，需要分别实现每个依赖对象的clone()
 */
public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setBirthday(new Date(0l));
        Person p = (Person) person.clone();
        System.out.println(person);
        System.out.println(p);

        System.out.println("--------------------------");

        person.getBirthday().setTime(111111111111111l);
        System.out.println(person);
        System.out.println(p);
    }
}
