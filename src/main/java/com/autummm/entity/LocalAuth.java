package com.autummm.entity;

import java.util.Date;

public class LocalAuth {
    //本地用户id
    private Long localAuthId;
    //用户名称
    private String username;
    //密码
    private String password;
    //创建时间
    private Date createTime;
    //上次登录时间
    private Date lastTime;
    //用户
    private PersonInfo personInfo;

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public LocalAuth(Long localAuthId, String username, String password, Date createTime, Date lastTime, PersonInfo personInfo) {
        this.localAuthId = localAuthId;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.lastTime = lastTime;
        this.personInfo = personInfo;
    }

    public LocalAuth() {
    }
}
