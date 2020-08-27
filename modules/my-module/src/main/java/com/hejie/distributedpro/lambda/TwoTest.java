package com.hejie.distributedpro.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Program: my-module
 * @Description: lambda练习2
 * @Author: hejie
 * @Create: 2020-07-09 16:30
 */
public class TwoTest {

    public static void main(String[] args) {
        //1 匿名类
        Supplier<List> supplier = new Supplier<List>() {
            @Override
            public List get() {
                return new ArrayList();
            }
        };
        List list1 = getList(supplier);

        //2 Lambda表达式
        List list2 = getList(()->new ArrayList());

        //3 引用构造器(2的简化版)
        List list3 = getList(ArrayList::new);

        System.out.println(list1 + "|" + list2 + "|" + list3);

    }

    private static List getList(Supplier<List> supplier) {
        return supplier.get();
    }
}
