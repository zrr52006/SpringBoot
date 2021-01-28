package com.itheima.domain;

/**
 * @author ：zhangrr
 * @date ：Created in 2021/1/28 21:52
 * @description：
 * @modified By：
 * @version:
 */
public class ResultMap {
    public  UserModel um;
    public Integer status;
    public String  statusTxt;

    public UserModel getUm() {
        return um;
    }

    public void setUm(UserModel um) {
        this.um = um;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusTxt() {
        return statusTxt;
    }

    public void setStatusTxt(String statusTxt) {
        this.statusTxt = statusTxt;
    }

    public ResultMap(UserModel um, Integer status, String statusTxt) {
        this.um = um;
        this.status = status;
        this.statusTxt = statusTxt;
    }

    public ResultMap() {
    }
}
