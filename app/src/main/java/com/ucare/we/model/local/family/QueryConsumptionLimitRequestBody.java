package com.ucare.we.model.local.family;

/* loaded from: classes2.dex */
public class QueryConsumptionLimitRequestBody {
    @cqh(a = "groupId")
    private String groupId;
    @cqh(a = "serviceNumber")
    private String serviceNumber;

    public QueryConsumptionLimitRequestBody(String str, String str2) {
        this.groupId = str;
        this.serviceNumber = str2;
    }

    public String getServiceNumber() {
        return this.serviceNumber;
    }

    public void setServiceNumber(String str) {
        this.serviceNumber = str;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }
}
