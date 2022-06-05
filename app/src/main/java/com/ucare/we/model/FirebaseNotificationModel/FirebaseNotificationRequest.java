package com.ucare.we.model.FirebaseNotificationModel;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class FirebaseNotificationRequest {
    @cqh(a = "body")
    FirebaseNotificationRequestBody body;
    @cqh(a = "header")
    RequestHeader header;

    public FirebaseNotificationRequestBody getBody() {
        return this.body;
    }

    public void setBody(FirebaseNotificationRequestBody firebaseNotificationRequestBody) {
        this.body = firebaseNotificationRequestBody;
    }

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }
}
