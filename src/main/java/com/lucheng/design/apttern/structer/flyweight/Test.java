package com.lucheng.design.apttern.structer.flyweight;

public class Test {
    private static  final String departments[] = {"RD","PM","PO","UI"};
    public static void main(String[] args) {
        ManagerFactory managerFactory = new ManagerFactory();
        for(int i = 0;i < 10;i++){
            Manager manager = managerFactory.getManager(departments[(int) Math.random() * departments.length]);
            manager.makePaper();
        }
    }
}
