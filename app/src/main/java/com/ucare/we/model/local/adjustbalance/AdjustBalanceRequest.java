package com.ucare.we.model.local.adjustbalance;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ucare/we/model/local/adjustbalance/AdjustBalanceRequest;", "", "groupId", "", "mappingCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "getMappingCode", "setMappingCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AdjustBalanceRequest {
    @cqh(a = "groupId")
    private String groupId;
    @cqh(a = "mappingCode")
    private String mappingCode;

    public static /* synthetic */ AdjustBalanceRequest copy$default(AdjustBalanceRequest adjustBalanceRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adjustBalanceRequest.groupId;
        }
        if ((i & 2) != 0) {
            str2 = adjustBalanceRequest.mappingCode;
        }
        return adjustBalanceRequest.copy(str, str2);
    }

    public final String component1() {
        return this.groupId;
    }

    public final String component2() {
        return this.mappingCode;
    }

    public final AdjustBalanceRequest copy(String str, String str2) {
        dqc.d(str, "groupId");
        dqc.d(str2, "mappingCode");
        return new AdjustBalanceRequest(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustBalanceRequest)) {
            return false;
        }
        AdjustBalanceRequest adjustBalanceRequest = (AdjustBalanceRequest) obj;
        return dqc.a((Object) this.groupId, (Object) adjustBalanceRequest.groupId) && dqc.a((Object) this.mappingCode, (Object) adjustBalanceRequest.mappingCode);
    }

    public final int hashCode() {
        return (this.groupId.hashCode() * 31) + this.mappingCode.hashCode();
    }

    public final String toString() {
        return "AdjustBalanceRequest(groupId=" + this.groupId + ", mappingCode=" + this.mappingCode + ')';
    }

    public AdjustBalanceRequest(String str, String str2) {
        dqc.d(str, "groupId");
        dqc.d(str2, "mappingCode");
        this.groupId = str;
        this.mappingCode = str2;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final void setGroupId(String str) {
        dqc.d(str, "<set-?>");
        this.groupId = str;
    }

    public final String getMappingCode() {
        return this.mappingCode;
    }

    public final void setMappingCode(String str) {
        dqc.d(str, "<set-?>");
        this.mappingCode = str;
    }
}
