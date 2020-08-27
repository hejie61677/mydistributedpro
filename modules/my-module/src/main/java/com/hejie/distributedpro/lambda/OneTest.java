package com.hejie.distributedpro.lambda;

import com.hejie.distributedpro.myinterface.AmdChecker;
import com.hejie.distributedpro.pojo.AmdYesEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: my-module
 * @Description: lambda练习1
 * @Author: hejie
 * @Create: 2020-07-09 09:49
 */
public class OneTest {

    static String[] amdNames = {"Ryzen5-3600X", "Ryzen7-3700X", "Ryzen9-3900X"};

    public static void main(String[] args) {
        //匿名类正常写法
        AmdChecker amdChecker1 = new AmdChecker() {
            @Override
            public boolean check(AmdYesEntity amdYesEntity) {
                return amdYesEntity.coreNum > 10 && amdYesEntity.frequency < 5.0;
            }
        };
        //把new AmdChecker(),方法名,方法返回类型信息去掉
        //只保留方法参数和方法体
        //参数和方法体之间加上符号 ->
        AmdChecker amdChecker2 = (AmdYesEntity amdYesEntity) -> {
            return amdYesEntity.coreNum > 10 && amdYesEntity.frequency < 5.0;
        };
        //把return和{}去掉
        AmdChecker amdChecker3 = (AmdYesEntity amdYesEntity) -> amdYesEntity.coreNum > 10 && amdYesEntity.frequency < 5.0;
        //把参数类型和圆括号去掉
        AmdChecker amdChecker4 = amd -> amd.coreNum > 10 && amd.frequency < 5.0;

        cpuFilter(initAmdInfo(), amdChecker1);
        cpuFilter(initAmdInfo(), amdYesEntity -> amdYesEntity.coreNum > 6 && amdYesEntity.threadNum < 20);
        //调用静态方法
        cpuFilter(initAmdInfo(), OneTest::CheckedCpu);
        //调用对象方法
        OneTest oneTest = new OneTest();
        cpuFilter(initAmdInfo(), oneTest::CheckedCpu1);
        //调用容器内方法
        cpuFilter(initAmdInfo(), AmdYesEntity::matched);
    }

    private static boolean CheckedCpu(AmdYesEntity amdYesEntity) {
        return amdYesEntity.cpuName.equals("Ryzen5-3600X") && amdYesEntity.frequency < 5.0;
    }

    private boolean CheckedCpu1(AmdYesEntity amdYesEntity) {
        return amdYesEntity.cpuName.equals("Ryzen5-3600X") && amdYesEntity.frequency < 5.0;
    }

    private static void cpuFilter(List<AmdYesEntity> amdYesEntities, AmdChecker amdChecker) {
        for (AmdYesEntity amdYesEntity : amdYesEntities) {
            if (amdChecker.check(amdYesEntity)) {
                System.out.println(amdYesEntity);
            }
        }
    }

    static List<AmdYesEntity> initAmdInfo() {

        List<AmdYesEntity> amdEntities = new ArrayList<>();
        amdEntities.add(new AmdYesEntity(amdNames[0], 6, 12, 4.4));
        amdEntities.add(new AmdYesEntity(amdNames[1], 8, 16, 4.4));
        amdEntities.add(new AmdYesEntity(amdNames[2], 12, 24, 4.6));

        return amdEntities;
    }


}
