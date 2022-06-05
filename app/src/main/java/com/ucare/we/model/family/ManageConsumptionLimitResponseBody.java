package com.ucare.we.model.family;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ManageConsumptionLimitResponseBody {
    @cqh(a = "actionType")
    private String actionType;
    @cqh(a = "freeUnitType")
    private String freeUnitType;
    @cqh(a = "groupId")
    private String groupId;
    @cqh(a = "limitAmount")
    private String limitAmount;
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

    public String getFreeUnitType() {
        return this.freeUnitType;
    }

    public void setFreeUnitType(String str) {
        this.freeUnitType = str;
    }

    public String getActionType() {
        return this.actionType;
    }

    public void setActionType(String str) {
        this.actionType = str;
    }

    public String getLimitAmount() {
        return this.limitAmount;
    }

    public void setLimitAmount(String str) {
        this.limitAmount = str;
    }

    public ArrayList<FamilySharedLimitDetails> getSharedLimitDetails() {
        return this.sharedLimitDetails;
    }

    public void setSharedLimitDetails(ArrayList<FamilySharedLimitDetails> arrayList) {
        this.sharedLimitDetails = arrayList;
    }
}
