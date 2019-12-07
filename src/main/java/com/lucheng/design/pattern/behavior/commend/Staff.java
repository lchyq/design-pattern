package com.lucheng.design.pattern.behavior.commend;

import java.util.ArrayList;
import java.util.List;

/**
 * 类似于Thread 线程类
 */
public class Staff {
    private static final List<Commend> COMMEND_LIST = new ArrayList<>();

    public void addCommend(Commend commend){
        COMMEND_LIST.add(commend);
    }

    public void executeCommend(){
        for (Commend commend : COMMEND_LIST){
            commend.execute();
        }
        COMMEND_LIST.clear();
    }
}
