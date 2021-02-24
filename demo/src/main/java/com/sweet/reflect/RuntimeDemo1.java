package com.sweet.reflect;

import java.lang.reflect.Method;

public class RuntimeDemo1 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java.lang.Runtime");

        Method getRuntimeMethod = clazz.getMethod("getRuntime", new Class[0]);

        Object runtimeObject = getRuntimeMethod.invoke(clazz, new Class[0]);

        Method execMethod = clazz.getMethod("exec", new Class[]{String.class});

        execMethod.invoke(runtimeObject, new String[]{"open -a Calculator"});

    }
}
