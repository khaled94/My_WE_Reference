package com.ucare.we.model.SignInModel;

/* loaded from: classes2.dex */
public class GroupsModel {
    @cqh(a = "fmc")
    GroupFMCModel groupFMC;
    @cqh(a = "family")
    GroupFamilyModel groupFamily;

    public GroupFamilyModel getGroupFamily() {
        return this.groupFamily;
    }

    public void setGroupFamily(GroupFamilyModel groupFamilyModel) {
        this.groupFamily = groupFamilyModel;
    }

    public GroupFMCModel getGroupFMC() {
        return this.groupFMC;
    }

    public void setGroupFMC(GroupFMCModel groupFMCModel) {
        this.groupFMC = groupFMCModel;
    }
}
