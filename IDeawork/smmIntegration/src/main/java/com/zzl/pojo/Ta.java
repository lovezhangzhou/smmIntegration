package com.zzl.pojo;

public class Ta {

    private Integer tid;
    private String tname;

    public Ta(){}

    public Ta(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Ta{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
