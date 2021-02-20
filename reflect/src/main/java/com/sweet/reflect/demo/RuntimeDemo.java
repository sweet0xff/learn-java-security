package com.sweet.reflect.demo;

import java.lang.reflect.Method;

public class RuntimeDemo {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("java.lang.Runtime");

        Object object = clazz.getMethod("getRuntime").invoke(clazz);

        Method exec = clazz.getMethod("exec", String.class);

        Object invoke = exec.invoke(object, "open -a Calculator");

    }
}
