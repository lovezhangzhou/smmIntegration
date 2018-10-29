package com.zzl.pojo;

public class UserBean {


    private Integer u_Id;
    private String u_name;
    private String u_pwd;
    private String u_sex;
    private Integer u_age;
    private String a_ddress;

    public UserBean(){}

    public UserBean(Integer u_Id, String u_name, String u_pwd, String u_sex, String a_ddress) {
        this.u_Id = u_Id;
        this.u_name = u_name;
        this.u_pwd = u_pwd;
        this.u_sex = u_sex;
        this.a_ddress = a_ddress;
    }

    public UserBean(Integer u_Id, String u_name, String u_pwd, String u_sex, Integer u_age, String a_ddress) {
        this.u_Id = u_Id;
        this.u_name = u_name;
        this.u_pwd = u_pwd;
        this.u_sex = u_sex;
        this.u_age = u_age;
        this.a_ddress = a_ddress;
    }


    public Integer getU_Id() {
        return u_Id;
    }

    public void setU_Id(Integer u_Id) {
        this.u_Id = u_Id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public Integer getU_age() {
        return u_age;
    }

    public void setU_age(Integer u_age) {
        this.u_age = u_age;
    }

    public String getA_ddress() {
        return a_ddress;
    }

    public void setA_ddress(String a_ddress) {
        this.a_ddress = a_ddress;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "u_Id=" + u_Id +
                ", u_name='" + u_name + '\'' +
                ", u_pwd='" + u_pwd + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_age=" + u_age +
                ", a_ddress='" + a_ddress + '\'' +
                '}';
    }
}
