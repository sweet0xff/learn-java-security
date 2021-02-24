package com.sweet.reflect;

import java.lang.reflect.Method;

/**
 * @author sweet
 * @description
 * @date 2021/2/23 20:32
 */
public class RuntimeDemo2 {
    public static void main(String[] args) throws Exception {
        Class clazz = Runtime.class;
        Method getRuntimeMethod = clazz.getMethod("getRuntime", null);
//        Object object = getRuntimeMethod.invoke(clazz, new Object[0]);
//        Object object = getRuntimeMethod.invoke(null, new Class[0]);
//        Object object = getRuntimeMethod.invoke(clazz, new Class[0]);
        Object object = getRuntimeMethod.invoke(null, null);
        ((Runtime)object).exec("open -a Calculator");
    }
}
