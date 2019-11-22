package com.lucheng.design.pattern.structure.component;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * 课程目录
 */
public class CourseCatelog extends CatelogComponent {
    private String name;
    private List<CatelogComponent> items = new ArrayList<>();
    public CourseCatelog (String name,Integer level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatelogComponent catelogComponent) {
        items.add(catelogComponent);
    }

    @Override
    public void remove(CatelogComponent catelogComponent) {
        items.remove(catelogComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getContent() {
        for(int i = 0; i < level;i++){
            out.print(" ");
        }
        out.println("name:"+name);
        items.stream().forEach(i -> i.getContent());
    }

    @Override
    public void print() {
        out.println("name:"+name);
        items.stream().forEach(i -> i.getContent());
    }
}
