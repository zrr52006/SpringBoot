package com.itheima.domain;

import java.util.Date;

/**
 * @author ：zhangrr
 * @date ：Created in 2021/1/31 16:43
 * @description：
 * @modified By：
 * @version:
 */
public class User {

    private Integer id;
    private String  username;
    private Date birthday;
    private String Sex;
    private String address;
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", Sex='" + Sex + '\'' +
                ", address='" + address + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
