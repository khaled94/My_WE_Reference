package com.ucare.we.model.routerusernameandpassword;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class RouterUserNameAndPasswordRequest {
    @cqh(a = "body")
    private RouterUserNameAndPasswordRequestBody body;
    @cqh(a = "header")
    private RequestHeader header;

    public RouterUserNameAndPasswordRequestBody getBody() {
        return this.body;
    }

    public void setBody(RouterUserNameAndPasswordRequestBody routerUserNameAndPasswordRequestBody) {
        this.body = routerUserNameAndPasswordRequestBody;
    }

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }
}
