package com.hejie.distributedpro.lambda;

import com.hejie.distributedpro.pojo.AmdYesEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Program: my-module
 * @Description: lambda练习2
 * @Author: hejie
 * @Create: 2020-07-13 09:52
 */
public class ThreeTest {

    public static void main(String[] args) {
        List<AmdYesEntity> amdYesEntities = OneTest.initAmdInfo();
        String[] amdNames = OneTest.amdNames;
        //聚合操作
//        for (AmdYesEntity amdYesEntity : amdYesEntities) {
//            if (amdYesEntity.coreNum > 0) {
//                System.out.println(amdYesEntity.toString());
//            }
//        }
        amdYesEntities.stream().filter(
                     amdYesEntity -> amdYesEntity.coreNum > 0
                ).forEach(
                        amdYesEntity -> System.out.println(amdYesEntity.toString()));

        //管道源是集合
        amdYesEntities.forEach(amdYesEntity -> System.out.println(amdYesEntity.cpuName));
        //管道源是数组
        Arrays.stream(amdNames).forEach(System.out::println);

    }


}
