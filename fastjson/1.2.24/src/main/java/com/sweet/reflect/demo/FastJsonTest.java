package com.sweet.reflect.demo;

import java.util.Properties;

/**
 * @author sweet
 * @description
 * @date 2021/2/7 11:17
 */
public class FastJsonTest {
    public String t1;
    private int t2;
    private Boolean t3;
    private Properties t4;
    private Properties t5;

    public FastJsonTest() {
        System.out.println("FastJsonTest() is called");
    }

    public void setT1(String t1) {
        System.out.println("setT1() is called");
        this.t1 = t1;
    }

    public void setT2(int t2) {
        System.out.println("setT2() is called");
        this.t2 = t2;
    }

    public void setT5(Properties t5) {
        System.out.println("setT5() is called");
        this.t5 = t5;
    }

    public String getT1() {
        System.out.println("getT1() is called");
        return t1;
    }

    public int getT2() {
        System.out.println("getT2() is called");
        return t2;
    }

    public Boolean getT3() {
        System.out.println("getT3() is called");
        return t3;
    }

    public Properties getT4() {
        System.out.println("getT4() is called");
        return t4;
    }

    public Properties getT5() {
        System.out.println("getT5() is called");
        return t5;
    }

    @Override
    public String toString() {
        return "FastJsonTest{" +
                "t1='" + t1 + '\'' +
                ", t2=" + t2 +
                ", t3=" + t3 +
                ", t4=" + t4 +
                ", t5=" + t5 +
                '}';
    }
}
