package com.alibaba.dubbo.common;

import java.util.Iterator;
import java.util.Map;

/**
 * @author yunjie.du
 * @date 2016/10/19 18:33
 */
public class BaseTest {

    protected void print(Iterable<?> iterable) {
        Iterator<?> iterator = iterable.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println("[{}]{}" + (++i) + iterator.next());
        }
    }

    protected <T> void print(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[{}]{}" + (i + 1) + arr[i]);
        }
    }

    protected void print(Map<?, ?> map) {
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("[{}]key={},value={}" + (++i) + entry.getKey() + entry.getValue());
        }
    }

    protected void logRes(Object res) {
        System.out.println("res={}" + res);
    }

}
