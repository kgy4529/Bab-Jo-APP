package com.amitshekhar.tflite.users;

import com.google.gson.annotations.SerializedName;

public class JoinReqRes {
    @SerializedName("user_seq")
    public String user_seq;
    @SerializedName("user_email")
    public String user_email;
    @SerializedName("user_pwd")
    public String user_pwd;
    @SerializedName("user_nm")
    public String user_nm;
    @SerializedName("user_sex")
    public String user_sex;
    @SerializedName("user_age")
    public String user_age;

    public String getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(String user_seq) {
        this.user_seq = user_seq;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_nm() {
        return user_nm;
    }

    public void setUser_nm(String user_nm) {
        this.user_nm = user_nm;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }
    public JoinReqRes(String user_seq, String user_email, String user_pwd, String user_nm, String user_sex,String user_age){
        this.user_seq = user_seq;
        this.user_email = user_email;
        this.user_pwd = user_pwd;
        this.user_nm = user_nm;
        this.user_sex = user_sex;
        this.user_age = user_age;

    }
}
