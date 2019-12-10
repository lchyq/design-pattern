package com.lucheng.design.pattern.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式+工厂
 */
public class PromoteStrategyFactory {
    private static final Map<PromoteStrategyKey,PromoteStrategy> localMap = new HashMap<>();
    static {
        //类初始化时，初始化 localMap
    }
    private interface PromoteStrategyKey{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
    }
}
