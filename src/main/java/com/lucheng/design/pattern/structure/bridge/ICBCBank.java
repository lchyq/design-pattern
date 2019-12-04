package com.lucheng.design.pattern.structure.bridge;

/**
 * 中国工商银行具体抽象类
 */
public class ICBCBank extends ABank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("这是工商银行的账号");
        account.openAccount();
        return account;
    }
}
