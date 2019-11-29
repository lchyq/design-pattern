package com.lucheng.design.pattern.structure.agent.springdatasourceproxy;

/**
 * 构建基于线程隔离的db数据源缓存
 * dbType 相当于在spring中配置的数据源beanId
 */
public class DbSourceContextHolder {
    private static final ThreadLocal<String> DB_context = new ThreadLocal<>();

    public static String getDbType(){
        return DB_context.get();
    }

    public static void setDbType(String dbType){
        DB_context.set(dbType);
    }

    public static void clearDbType(){
        DB_context.remove();
    }
}
