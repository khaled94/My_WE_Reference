package com.ucare.we.model;

/* loaded from: classes2.dex */
public class ModifyPasswordRequestBody {
    @cqh(a = "newPassword")
    private String newPassword;
    @cqh(a = "password")
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public void setNewPassword(String str) {
        this.newPassword = str;
    }
}
