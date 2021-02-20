package com.sweet.reflect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author sweet
 * @description fastjson <= 1.2.24
 * @date 2021/2/18 10:42
 */
public class FastJsonDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        user.setName("summer");
        String str1 = JSONObject.toJSONString(user);
        // 转化的时候加入一个序列化的特征 写入类名
        // feature = 特征
        String str2 = JSONObject.toJSONString(user, SerializerFeature.WriteClassName);
        // str2输入结果会输出 @type+类名
        // 由此可知@type是用于解析JSON时的用于指定类
        System.out.println(str1);
        System.out.println(str2);
        //如果fastjson解析内容时没有配置，会默认使用缺省配置
        //查看parse方法 可以设置断点看看不同之处和相同之处
        Object parse1 = JSON.parse(str1);
        Object parse2 = JSON.parse(str2);
        //结果不一样
        System.out.println("@type: " + parse1.getClass().getName());
        System.out.println("str1's parse1: " + parse1);
        System.out.println("@type: " + parse2.getClass().getName());
        System.out.println("str2's parse2: " + parse2);
    }
}

class User {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
