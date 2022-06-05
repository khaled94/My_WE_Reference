package com.ucare.we.model.local.managegrouppaymentrelation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ucare/we/model/local/managegrouppaymentrelation/ManageGroupPaymentRelationRequest;", "", "groupId", "", "serviceNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getServiceNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ManageGroupPaymentRelationRequest {
    @cqh(a = "groupId")
    private final String groupId;
    @cqh(a = "serviceNumber")
    private final String serviceNumber;

    public static /* synthetic */ ManageGroupPaymentRelationRequest copy$default(ManageGroupPaymentRelationRequest manageGroupPaymentRelationRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = manageGroupPaymentRelationRequest.groupId;
        }
        if ((i & 2) != 0) {
            str2 = manageGroupPaymentRelationRequest.serviceNumber;
        }
        return manageGroupPaymentRelationRequest.copy(str, str2);
    }

    public final String component1() {
        return this.groupId;
    }

    public final String component2() {
        return this.serviceNumber;
    }

    public final ManageGroupPaymentRelationRequest copy(String str, String str2) {
        dqc.d(str2, "serviceNumber");
        return new ManageGroupPaymentRelationRequest(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManageGroupPaymentRelationRequest)) {
            return false;
        }
        ManageGroupPaymentRelationRequest manageGroupPaymentRelationRequest = (ManageGroupPaymentRelationRequest) obj;
        return dqc.a((Object) this.groupId, (Object) manageGroupPaymentRelationRequest.groupId) && dqc.a((Object) this.serviceNumber, (Object) manageGroupPaymentRelationRequest.serviceNumber);
    }

    public final int hashCode() {
        String str = this.groupId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.serviceNumber.hashCode();
    }

    public final String toString() {
        return "ManageGroupPaymentRelationRequest(groupId=" + ((Object) this.groupId) + ", serviceNumber=" + this.serviceNumber + ')';
    }

    public ManageGroupPaymentRelationRequest(String str, String str2) {
        dqc.d(str2, "serviceNumber");
        this.groupId = str;
        this.serviceNumber = str2;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getServiceNumber() {
        return this.serviceNumber;
    }
}
