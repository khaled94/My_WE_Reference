package com.ucare.we.model.local.managepaymentlimit;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ucare/we/model/local/managepaymentlimit/ManagePaymentLimitRequestBody;", "", "groupId", "", "paymentRelation", "Lcom/ucare/we/model/local/managepaymentlimit/PaymentRelation;", "actionType", "(Ljava/lang/String;Lcom/ucare/we/model/local/managepaymentlimit/PaymentRelation;Ljava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "getGroupId", "getPaymentRelation", "()Lcom/ucare/we/model/local/managepaymentlimit/PaymentRelation;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ManagePaymentLimitRequestBody {
    @cqh(a = "actionType")
    private final String actionType;
    @cqh(a = "groupId")
    private final String groupId;
    @cqh(a = "paymentRelation")
    private final PaymentRelation paymentRelation;

    public ManagePaymentLimitRequestBody() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ManagePaymentLimitRequestBody copy$default(ManagePaymentLimitRequestBody managePaymentLimitRequestBody, String str, PaymentRelation paymentRelation, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managePaymentLimitRequestBody.groupId;
        }
        if ((i & 2) != 0) {
            paymentRelation = managePaymentLimitRequestBody.paymentRelation;
        }
        if ((i & 4) != 0) {
            str2 = managePaymentLimitRequestBody.actionType;
        }
        return managePaymentLimitRequestBody.copy(str, paymentRelation, str2);
    }

    public final String component1() {
        return this.groupId;
    }

    public final PaymentRelation component2() {
        return this.paymentRelation;
    }

    public final String component3() {
        return this.actionType;
    }

    public final ManagePaymentLimitRequestBody copy(String str, PaymentRelation paymentRelation, String str2) {
        return new ManagePaymentLimitRequestBody(str, paymentRelation, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagePaymentLimitRequestBody)) {
            return false;
        }
        ManagePaymentLimitRequestBody managePaymentLimitRequestBody = (ManagePaymentLimitRequestBody) obj;
        return dqc.a((Object) this.groupId, (Object) managePaymentLimitRequestBody.groupId) && dqc.a(this.paymentRelation, managePaymentLimitRequestBody.paymentRelation) && dqc.a((Object) this.actionType, (Object) managePaymentLimitRequestBody.actionType);
    }

    public final int hashCode() {
        String str = this.groupId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentRelation paymentRelation = this.paymentRelation;
        int hashCode2 = (hashCode + (paymentRelation == null ? 0 : paymentRelation.hashCode())) * 31;
        String str2 = this.actionType;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ManagePaymentLimitRequestBody(groupId=" + ((Object) this.groupId) + ", paymentRelation=" + this.paymentRelation + ", actionType=" + ((Object) this.actionType) + ')';
    }

    public ManagePaymentLimitRequestBody(String str, PaymentRelation paymentRelation, String str2) {
        this.groupId = str;
        this.paymentRelation = paymentRelation;
        this.actionType = str2;
    }

    public /* synthetic */ ManagePaymentLimitRequestBody(String str, PaymentRelation paymentRelation, String str2, int i, dpx dpxVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : paymentRelation, (i & 4) != 0 ? "" : str2);
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final PaymentRelation getPaymentRelation() {
        return this.paymentRelation;
    }

    public final String getActionType() {
        return this.actionType;
    }
}
