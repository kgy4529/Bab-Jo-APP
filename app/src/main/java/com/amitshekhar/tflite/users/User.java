package com.amitshekhar.tflite.users;

import java.io.Serializable;

public class User implements Serializable {
    // Member Variable----------------------------------------------
    private  static final long serialVersionID= 1L;
    private String UserName;
    private String UserEmail;
    private String UserSex;
    private String UserAge;
    private String UserSeq;

    // Constructor (생성자)--------------------------------------------

    public User(String userSeq, String UserEmail, String UserName, String UserSex, String UserAge) {
        this.UserSeq = userSeq;
        this.UserName = UserName;
        this.UserEmail = UserEmail;
        this.UserSex = UserSex;
        this.UserAge = UserAge;
    }

    // Getter/Setter

    public String getUserSeq() {
        return UserSeq;
    }

    public void setUserSeq(String userSeq) {
        UserSeq = userSeq;
    }

    public String getUserName() { return UserName; }

    public void setUserName(String userName) { UserName = userName; }

    public String getUserEmail() { return UserEmail; }

    public void setUserEmail(String userEmail) { UserEmail = userEmail; }

    public String getUserSex() { return UserSex; }

    public void setUserSex(String userSex) { UserSex = userSex; }

    public String getUserAge() { return UserAge; }

    public void setUserAge(String userAge) { UserAge = userAge; }
}
