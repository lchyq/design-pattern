package com.lucheng.design.pattern.structure.bridge;

/**
 * 此处的aBank就是一个 "抽象类"
 * 因为此处的银行可以扩展为多个所以将aBank设置为abstract
 */
public abstract class ABank {
    protected Account account;
    public ABank (Account account){
        this.account = account;
    }

    //这是一个委托方法，委托给具体行为的子类来执行
    //也就是委托给具体的accout来执行
    public abstract Account openAccount();
}
