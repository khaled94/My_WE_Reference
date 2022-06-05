package com.ucare.we.model;

/* loaded from: classes2.dex */
public class AutoLoginRequestBody {
    @cqh(a = "encryptedUuid")
    private String encryptedUuid;
    @cqh(a = "uuid")
    private String uuid;

    public AutoLoginRequestBody(String str, String str2) {
        this.encryptedUuid = str;
        this.uuid = str2;
    }

    public String getEncryptedUuid() {
        return this.encryptedUuid;
    }

    public String getUuid() {
        return this.uuid;
    }
}
