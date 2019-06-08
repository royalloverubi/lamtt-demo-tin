package com.nhannt.snef.model;

import java.io.Serializable;

public class Account implements Serializable {

    private int accountId;
    private String username;
    private String password;
    private String accountName;
    private String email;
    private String phone;
    private int roleid;
    private String avatar;
    private boolean status;
    private int locationid;

    public Account() {
    }

    public Account(int accountId, String username, String password, String accountName, String email, String phone, int roleid, String avatar, boolean status, int locationid) {
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.accountName = accountName;
        this.email = email;
        this.phone = phone;
        this.roleid = roleid;
        this.avatar = avatar;
        this.status = status;
        this.locationid = locationid;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }
}
