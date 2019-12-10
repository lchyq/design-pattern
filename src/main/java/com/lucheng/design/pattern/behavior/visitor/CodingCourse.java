package com.lucheng.design.pattern.behavior.visitor;

public class CodingCourse extends Course{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CodingCourse(String name) {
        super(name);
    }

    @Override
    protected void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
