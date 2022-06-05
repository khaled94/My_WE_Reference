package com.ucare.we.model.local.family;

/* loaded from: classes2.dex */
public class SubscribedFamilyOffersRequestBody {
    @cqh(a = "groupId")
    private String groupId;

    public SubscribedFamilyOffersRequestBody(String str) {
        this.groupId = str;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }
}
