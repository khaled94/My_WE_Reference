package com.ucare.we.model.local.groupidrequest;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ucare/we/model/local/groupidrequest/GroupIdRequest;", "", "groupId", "", "(Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "setGroupId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GroupIdRequest {
    @cqh(a = "groupId")
    private String groupId;

    public static /* synthetic */ GroupIdRequest copy$default(GroupIdRequest groupIdRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupIdRequest.groupId;
        }
        return groupIdRequest.copy(str);
    }

    public final String component1() {
        return this.groupId;
    }

    public final GroupIdRequest copy(String str) {
        dqc.d(str, "groupId");
        return new GroupIdRequest(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupIdRequest) && dqc.a((Object) this.groupId, (Object) ((GroupIdRequest) obj).groupId);
    }

    public final int hashCode() {
        return this.groupId.hashCode();
    }

    public final String toString() {
        return "GroupIdRequest(groupId=" + this.groupId + ')';
    }

    public GroupIdRequest(String str) {
        dqc.d(str, "groupId");
        this.groupId = str;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final void setGroupId(String str) {
        dqc.d(str, "<set-?>");
        this.groupId = str;
    }
}
