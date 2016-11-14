package com.yinrong.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 以静态变量保存Spring Application， 可以在任何代码任何地方任何时候取出ApplicationContext
 *
 * @author LiPenghui
 *
 */
public class SpringContextHolder implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    private static Logger logger = LoggerFactory.getLogger(SpringContextHolder.class);
    /**
     * 实现ApplicationContextAware接口的context注入函数，将其存入静态变量
     */
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
        logger.debug("SpringContextHolder注入ApplicationContext");
    }

    /**
     * 获取存储在静态变量中的ApplicationContext
     *
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        checkApplicationContext();
        return applicationContext;
    }

    /**
     * 从静态变量ApplicationContext中获取Bean，自动转型为所赋值对象的类型
     * @param <T>
     * @param name
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name){
        checkApplicationContext();
        return (T) applicationContext.getBean(name);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> clazz){
        checkApplicationContext();
        return (T) applicationContext.getBeansOfType(clazz);
    }
    /**
     * 清除ApplicationContext静态变量.
     */
    public static void cleanApplicationContext(){
        applicationContext=null;
    }
    /**
     * 检查是否获取到了ApplicationContext
     */
    private static void checkApplicationContext() {
        if (applicationContext == null) {
            throw new IllegalStateException(
                    "applicationContext未注入,请在applicationContext.xml中定义SpringContextHolder");
        }
    }
}