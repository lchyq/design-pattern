package com.lucheng.design.pattern.structure.bridge;

/**
 * 桥接模式
 * 核心在于-抽象与实现分离，抽象与实现之前相互组合来达到不同的效果
 */
public class Test {
    public static void main(String[] args) {
        ABank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcDepositAccount = icbcBank.openAccount();
        icbcDepositAccount.showAccountType();
    }
}
