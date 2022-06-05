package com.ucare.we.model.local.family;

/* loaded from: classes2.dex */
public class ManageFamilyMemberRequestBody {
    @cqh(a = "actionType")
    private String actionType;
    @cqh(a = "groupId")
    private String groupId;
    @cqh(a = "membersMsisdn")
    private String membersMsisdn;

    public ManageFamilyMemberRequestBody(String str, String str2, String str3) {
        this.actionType = str;
        this.membersMsisdn = str2;
        this.groupId = str3;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public String getActionType() {
        return this.actionType;
    }

    public void setActionType(String str) {
        this.actionType = str;
    }

    public String getMembersMsisdn() {
        return this.membersMsisdn;
    }

    public void setMembersMsisdn(String str) {
        this.membersMsisdn = str;
    }
}
