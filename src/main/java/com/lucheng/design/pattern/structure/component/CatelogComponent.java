package com.lucheng.design.pattern.structure.component;

/**
 * 课程目录组件
 */
public class CatelogComponent {
    public Integer level;
    public void add(CatelogComponent catelogComponent){
        throw new UnsupportedOperationException("不支持该操作！");
    }
    public void remove(CatelogComponent catelogComponent){
        throw new UnsupportedOperationException("不支持该操作！");
    }
    public String getName(){
        throw new UnsupportedOperationException("不支持该操作！");
    }
    public Integer getPrice(){
        throw new UnsupportedOperationException("不支持该操作！");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持该操作！");
    }

    public void getContent(){
        throw new UnsupportedOperationException("不支持该操作");
    }

    public Integer getLevel() {
        return level;
    }
}
