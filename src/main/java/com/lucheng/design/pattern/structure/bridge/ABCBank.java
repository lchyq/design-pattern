package com.lucheng.design.pattern.structure.bridge;

/**
 * 具体的抽象类-中国农业银行
 */
public class ABCBank extends ABank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("这是中国农业银行的账号");
        account.openAccount();
        return account;
    }
}
