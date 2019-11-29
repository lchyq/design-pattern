package com.lucheng.design.pattern.structure.agent.springdatasourceproxy;

/**
 * 基于spring的分表
 * AbstractRoutingDataSource 分库中两个重要的属性
 *     private Map<Object, Object> targetDataSources;
 *     private Object defaultTargetDataSource;
 */
//public class DataSourceStaticProxy extends org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource {
//    @Override
//    public Object determineCurrentLookupKey(){
//        return DbSourceContextHolder.getDbType();
//    }

//    模拟数据源bean配置
//    此两行配置为真实的db配置，此处省略
//    <bean id="db0"/>
//    <bean id="db1"/>

//    配置分库路由对象
//    <bean id="dataSource" class="com.lucheng.design.pattern.structure.agent.springdatasourceproxy.DataSourceStaticProxy">
    //    <property name="targetDataSources">
    //          <map key-type="String">
    //              <entry value-ref="db0" key="db0"/>
    //              <entry value-ref="db1" key="db1"/>
    //          </map>
    //    </property>
    //    <property name="defaultTargetDataSource" ref="db0">
    //    </property>
//    </bean>
//    将dataSource 配置到mybatis的sqlsessionfactory中
//}
