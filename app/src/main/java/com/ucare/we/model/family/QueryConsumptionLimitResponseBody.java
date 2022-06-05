package com.ucare.we.model.family;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class QueryConsumptionLimitResponseBody {
    @cqh(a = "groupId")
    private String groupId;
    @cqh(a = "serviceNumber")
    private String serviceNumber;
    @cqh(a = "sharedLimitDetails")
    ArrayList<FamilySharedLimitDetails> sharedLimitDetails;

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

    public ArrayList<FamilySharedLimitDetails> getSharedLimitDetails() {
        return this.sharedLimitDetails;
    }

    public void setSharedLimitDetails(ArrayList<FamilySharedLimitDetails> arrayList) {
        this.sharedLimitDetails = arrayList;
    }
}
