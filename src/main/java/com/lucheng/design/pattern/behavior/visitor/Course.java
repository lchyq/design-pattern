package com.lucheng.design.pattern.behavior.visitor;

public abstract class Course {
    protected String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void accept(Visitor visitor);
}
