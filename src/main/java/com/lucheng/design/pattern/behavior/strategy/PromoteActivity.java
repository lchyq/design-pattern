package com.lucheng.design.pattern.behavior.strategy;

public class PromoteActivity {
    private PromoteStrategy promoteStrategy;
    public PromoteActivity(PromoteStrategy promoteStrategy){
        this.promoteStrategy = promoteStrategy;
    }
    public void doPromoteStrategy(){
        promoteStrategy.doPromote();
    }
}
