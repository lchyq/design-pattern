package com.lucheng.design.pattern.behavior.visitor;

public class FreeCourse extends Course {
    public FreeCourse(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
