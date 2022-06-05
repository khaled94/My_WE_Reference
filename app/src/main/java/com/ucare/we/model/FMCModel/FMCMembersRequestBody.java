package com.ucare.we.model.FMCModel;

/* loaded from: classes2.dex */
public class FMCMembersRequestBody {
    @cqh(a = "groupId")
    String groupId;
    @cqh(a = "pagination")
    PaginationModel paginationModel;

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public PaginationModel getPaginationModel() {
        return this.paginationModel;
    }

    public void setPaginationModel(PaginationModel paginationModel) {
        this.paginationModel = paginationModel;
    }
}
