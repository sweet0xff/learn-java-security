package com.sweet.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author sweet
 * @description
 * @date 2021/2/20 09:27
 */
public class ProcessBuilderDemo {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("java.lang.ProcessBuilder");

        //接收数组参数
//        ((ProcessBuilder) clazz.getConstructor(List.class).newInstance(Arrays.asList("open","-a","Calculator"))).start();

//        Method method = clazz.getMethod("start");
//        Constructor<?> constructor = clazz.getConstructor(List.class);
//        Object object = constructor.newInstance(Arrays.asList("open","-a","Calculator"));
//        method.invoke(object);


        //接收可变参数 注意newInstance()参数是二维数组
        ((ProcessBuilder) clazz.getConstructor(String[].class).newInstance(new String[][]{{"open", "-a", "Calculator"}})).start();

        Constructor<?> constructor = clazz.getConstructor(String[].class);
        Method method = clazz.getMethod("start");
        Object object = constructor.newInstance(new String[][]{{"open", "-a", "Calculator"}});
        method.invoke(object);
    }
}
