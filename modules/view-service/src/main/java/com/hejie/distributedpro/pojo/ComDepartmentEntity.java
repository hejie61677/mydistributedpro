package com.hejie.distributedpro.pojo;

/**
 * @Program: myroot
 * @Description: 机构实体类
 * @Author: hejie
 * @Create: 2020-06-12 17:01
 */
public class ComDepartmentEntity {

    private String dep_no;
    private String dep_name;
    private String up_dep_no;
    private String up_br_no;
    private String dep_manager;
    private String dep_phone;
    private String dep_type;
    private int dep_lvl;
    private String cur_dep_no;
    private String is_gather;
    private String dep_addr;

    public String getDep_no() {
        return dep_no;
    }

    public void setDep_no(String dep_no) {
        this.dep_no = dep_no;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getUp_dep_no() {
        return up_dep_no;
    }

    public void setUp_dep_no(String up_dep_no) {
        this.up_dep_no = up_dep_no;
    }

    public String getUp_br_no() {
        return up_br_no;
    }

    public void setUp_br_no(String up_br_no) {
        this.up_br_no = up_br_no;
    }

    public String getDep_manager() {
        return dep_manager;
    }

    public void setDep_manager(String dep_manager) {
        this.dep_manager = dep_manager;
    }

    public String getDep_phone() {
        return dep_phone;
    }

    public void setDep_phone(String dep_phone) {
        this.dep_phone = dep_phone;
    }

    public String getDep_type() {
        return dep_type;
    }

    public void setDep_type(String dep_type) {
        this.dep_type = dep_type;
    }

    public int getDep_lvl() {
        return dep_lvl;
    }

    public void setDep_lvl(int dep_lvl) {
        this.dep_lvl = dep_lvl;
    }

    public String getCur_dep_no() {
        return cur_dep_no;
    }

    public void setCur_dep_no(String cur_dep_no) {
        this.cur_dep_no = cur_dep_no;
    }

    public String getIs_gather() {
        return is_gather;
    }

    public void setIs_gather(String is_gather) {
        this.is_gather = is_gather;
    }

    public String getDep_addr() {
        return dep_addr;
    }

    public void setDep_addr(String dep_addr) {
        this.dep_addr = dep_addr;
    }

    @Override
    public String toString() {
        return "ComDepartmentEntity{" +
                "dep_no='" + dep_no + '\'' +
                ", dep_name='" + dep_name + '\'' +
                ", up_dep_no='" + up_dep_no + '\'' +
                ", up_br_no='" + up_br_no + '\'' +
                ", dep_manager='" + dep_manager + '\'' +
                ", dep_phone='" + dep_phone + '\'' +
                ", dep_type='" + dep_type + '\'' +
                ", dep_lvl=" + dep_lvl +
                ", cur_dep_no='" + cur_dep_no + '\'' +
                ", is_gather='" + is_gather + '\'' +
                ", dep_addr='" + dep_addr + '\'' +
                '}';
    }

}
