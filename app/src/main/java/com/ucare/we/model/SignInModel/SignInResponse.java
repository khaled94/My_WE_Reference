package com.ucare.we.model.SignInModel;

import com.ucare.we.model.LoginInfo;
import com.ucare.we.model.ResponseHeader;

/* loaded from: classes2.dex */
public class SignInResponse {
    @cqh(a = "body")
    LoginInfo body;
    @cqh(a = "header")
    public ResponseHeader header;

    public ResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseHeader responseHeader) {
        this.header = responseHeader;
    }

    public LoginInfo getBody() {
        return this.body;
    }

    public void setBody(LoginInfo loginInfo) {
        this.body = loginInfo;
    }
}
