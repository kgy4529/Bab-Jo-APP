package com.amitshekhar.tflite.users;

import com.google.gson.annotations.SerializedName;

//데이터를 오브젝트로 변환, json으로 서버로 보낼 데이터를 정려

public class LoginRequest {
    @SerializedName("user_email")
    public String user_email;

    @SerializedName("user_pwd")
    public String user_pwd;

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public LoginRequest(String user_email, String user_pwd) {
        this.user_email = user_email;
        this.user_pwd = user_pwd;
    }
}
