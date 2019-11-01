package com.lucheng.design.pattern.prototype;

import java.util.Date;

public class Person implements Cloneable {
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthday=" + birthday +
                '}'+super.toString();
    }
//    @Override
//    protected Object clone() throws CloneNotSupportedException{
//        Person person = (Person) super.clone();
//        person.setBirthday((Date) person.getBirthday().clone());
//        return person;
//    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
