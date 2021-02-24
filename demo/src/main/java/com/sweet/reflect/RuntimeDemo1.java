package com.sweet.reflect;

import java.lang.reflect.Method;

public class RuntimeDemo1 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java.lang.Runtime");

        // 方法没有参数时可以用 new Class[0] 或者 null
        Method getRuntimeMethod = clazz.getMethod("getRuntime", null);
//        Method getRuntimeMethod = clazz.getMethod("getRuntime", new Class[0]);

//        Object runtimeObject = getRuntimeMethod.invoke(clazz, null);
        Object runtimeObject = getRuntimeMethod.invoke(clazz, new Object[0]);

        //Method execMethod = clazz.getMethod("exec", new Class[]{String.class});
        Method execMethod = clazz.getMethod("exec", String.class);

        execMethod.invoke(runtimeObject, new String[]{"open -a Calculator"});

    }
}
