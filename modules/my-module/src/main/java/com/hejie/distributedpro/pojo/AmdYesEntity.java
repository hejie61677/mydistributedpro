package com.hejie.distributedpro.pojo;

/**
 * @Program: myroot
 * @Description:
 * @Author: hejie
 * @Create: 2020-07-09 10:02
 */
public class AmdYesEntity {

    public String cpuName;
    public int coreNum;
    public int threadNum;
    public double frequency;

    public AmdYesEntity(String cpuName, int coreNum, int threadNum, double frequency) {
        this.cpuName = cpuName;
        this.coreNum = coreNum;
        this.threadNum = threadNum;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "AmdYesEntity{" +
                "cpuName='" + cpuName + '\'' +
                ", coreNum=" + coreNum +
                ", threadNum=" + threadNum +
                ", frequency=" + frequency +
                '}';
    }

    public boolean matched() {
        return this.coreNum>10;
    }
}
