package com.ucare.we.model.local.family;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ucare/we/model/local/family/GetMemberRequestBody;", "", "groupId", "", "pagination", "Lcom/ucare/we/model/local/family/PaginationModel;", "(Ljava/lang/String;Lcom/ucare/we/model/local/family/PaginationModel;)V", "getGroupId", "()Ljava/lang/String;", "getPagination", "()Lcom/ucare/we/model/local/family/PaginationModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GetMemberRequestBody {
    @cqh(a = "groupId")
    private final String groupId;
    @cqh(a = "pagination")
    private final PaginationModel pagination;

    public static /* synthetic */ GetMemberRequestBody copy$default(GetMemberRequestBody getMemberRequestBody, String str, PaginationModel paginationModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getMemberRequestBody.groupId;
        }
        if ((i & 2) != 0) {
            paginationModel = getMemberRequestBody.pagination;
        }
        return getMemberRequestBody.copy(str, paginationModel);
    }

    public final String component1() {
        return this.groupId;
    }

    public final PaginationModel component2() {
        return this.pagination;
    }

    public final GetMemberRequestBody copy(String str, PaginationModel paginationModel) {
        dqc.d(str, "groupId");
        dqc.d(paginationModel, "pagination");
        return new GetMemberRequestBody(str, paginationModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMemberRequestBody)) {
            return false;
        }
        GetMemberRequestBody getMemberRequestBody = (GetMemberRequestBody) obj;
        return dqc.a((Object) this.groupId, (Object) getMemberRequestBody.groupId) && dqc.a(this.pagination, getMemberRequestBody.pagination);
    }

    public final int hashCode() {
        return (this.groupId.hashCode() * 31) + this.pagination.hashCode();
    }

    public final String toString() {
        return "GetMemberRequestBody(groupId=" + this.groupId + ", pagination=" + this.pagination + ')';
    }

    public GetMemberRequestBody(String str, PaginationModel paginationModel) {
        dqc.d(str, "groupId");
        dqc.d(paginationModel, "pagination");
        this.groupId = str;
        this.pagination = paginationModel;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final PaginationModel getPagination() {
        return this.pagination;
    }
}
