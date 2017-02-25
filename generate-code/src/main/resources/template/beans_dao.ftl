<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="${className}Mapper" class="org.mybatis.spring.mapper.MapperFactoryBean">
        <property name="mapperInterface" value="${mapperPackage}.${className_Java}Mapper"/>
        <property name="sqlSessionFactory" ref="defaultSqlSessionFactory" />
    </bean>
</beans>