package com.ucare.we.model;

/* loaded from: classes2.dex */
public class UserType {
    @cqh(a = "primaryOffer")
    private String primaryOffer;
    @cqh(a = "subType")
    private String subType;
    @cqh(a = "type")
    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getSubType() {
        return this.subType;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public String getPrimaryOffer() {
        return this.primaryOffer;
    }

    public void setPrimaryOffer(String str) {
        this.primaryOffer = str;
    }
}
