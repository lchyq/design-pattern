package com.lucheng.design.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Cache implements Cloneable {
    private ArrayList<Person> list;
    public Cache(ArrayList<Person> list){
        this.list = list;
    }

    public ArrayList<Person>  getList() {
        return list;
    }

    public void setList(ArrayList<Person> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Cache{" +
                "list=" + list +
                '}'+super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cache cache = (Cache) super.clone();
        cache.setList((ArrayList<Person>) cache.getList().clone());
        return cache;
    }
}
