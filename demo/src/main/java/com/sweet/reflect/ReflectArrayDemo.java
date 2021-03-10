package com.sweet.reflect;

import java.lang.reflect.Array;

/**
 * @author sweet
 * @description 测试 JNI, 字段描述符（JavaNative Interface FieldDescriptors)
 * @date 2021/3/10 09:07
 */
public class ReflectArrayDemo {
    public static void main(String[] args) throws Exception{

        //1
        TestDemo[] arr = new TestDemo[3];
        Class clazz1 = arr.getClass();

        //2
        Class clazz2 = Array.newInstance(TestDemo.class, 0).getClass();

        //3
        Class clazz3 = Class.forName("[Lcom.sweet.reflect.TestDemo;");

        //4
        TestDemo[][] arr2 = new TestDemo[2][2];
        Class clazz4 = arr2.getClass();

        //5
        Class clazz5 = Array.newInstance(Array.newInstance(TestDemo.class, 2).getClass(),2).getClass();

        //6
        Class clazz6 = Class.forName("[[Lcom.sweet.reflect.TestDemo;");

        System.out.println("clazz1: " + clazz1);
        System.out.println("clazz2: " + clazz2);
        System.out.println("clazz3: " + clazz3);
        System.out.println("clazz4: " + clazz4);
        System.out.println("clazz5: " + clazz5);
        System.out.println("clazz6: " + clazz6);

    }
}

class TestDemo {

    private String name;

    public TestDemo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}