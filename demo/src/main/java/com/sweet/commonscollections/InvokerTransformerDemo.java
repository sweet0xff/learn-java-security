package com.sweet.commonscollections;

import org.apache.commons.collections.functors.InvokerTransformer;

/**
 * @author sweet
 * @description
 * @date 2021/2/20 14:25
 */
public class InvokerTransformerDemo {
    public static void main(String[] args) throws Exception {
        String methodName = "exec";
        Class[] paramType = new Class[]{String.class};
        Object[] arg = new Object[] {"open -a Calculator"};
        InvokerTransformer invokerTransformer = new InvokerTransformer(methodName, paramType, arg);

        Object runtimeObject = Class.forName("java.lang.Runtime").getMethod("getRuntime");
        invokerTransformer.transform(runtimeObject);
    }
}
