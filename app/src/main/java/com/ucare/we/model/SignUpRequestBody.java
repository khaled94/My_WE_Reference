package com.ucare.we.model;

/* loaded from: classes2.dex */
public class SignUpRequestBody {
    @cqh(a = "confirmationCode")
    private String confirmationCode;
    @cqh(a = "password")
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    public void setConfirmationCode(String str) {
        this.confirmationCode = str;
    }
}
