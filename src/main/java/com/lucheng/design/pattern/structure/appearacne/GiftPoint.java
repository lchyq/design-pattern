package com.lucheng.design.pattern.structure.appearacne;

/**
 * 积分兑换class
 */
public class GiftPoint {
    private String name;
    private Integer pointNum;
    public GiftPoint (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPointNum() {
        return pointNum;
    }

    public void setPointNum(Integer pointNum) {
        this.pointNum = pointNum;
    }

    @Override
    public String toString() {
        return "GiftPoint{" +
                "name='" + name + '\'' +
                ", pointNum=" + pointNum +
                '}';
    }
}
