package com.sweet.reflect.demo;

import com.alibaba.fastjson.JSON;

/**
 * @author sweet
 * @description
 * @date 2021/2/7 11:58
 */
public class FastJsonTestMain {
    public static void main(String[] args) {
        String jsonStr = "{\"@type\":\"com.sweet.FastJsonTest\", \"t1\":\"t1\", \"t2\":2, \"t3\":1, \"t4\":{}, \"t5\":{}\n}";
        Object obj = JSON.parse(jsonStr);
        System.out.println(obj.toString());
    }
}
