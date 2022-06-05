package com.ucare.we.model.MoreBundleModel;

/* loaded from: classes2.dex */
public class Offer {
    @cqh(a = "actionType")
    String actionType;
    @cqh(a = "id")
    String id;

    public Offer(String str, String str2) {
        this.id = str;
        this.actionType = str2;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getActionType() {
        return this.actionType;
    }

    public void setActionType(String str) {
        this.actionType = str;
    }
}
