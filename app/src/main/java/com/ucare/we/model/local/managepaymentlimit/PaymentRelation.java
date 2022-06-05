package com.ucare.we.model.local.managepaymentlimit;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ucare/we/model/local/managepaymentlimit/PaymentRelation;", "", "paymentRelId", "", "serviceNumber", "", "limitValueType", "limitValue", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getLimitValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLimitValueType", "()Ljava/lang/String;", "getPaymentRelId", "getServiceNumber", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/ucare/we/model/local/managepaymentlimit/PaymentRelation;", "equals", "", "other", "hashCode", "", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentRelation {
    @cqh(a = "limitValue")
    private final Long limitValue;
    @cqh(a = "limitValueType")
    private final String limitValueType;
    @cqh(a = "paymentRelId")
    private final Long paymentRelId;
    @cqh(a = "serviceNumber")
    private final String serviceNumber;

    public PaymentRelation() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ PaymentRelation copy$default(PaymentRelation paymentRelation, Long l, String str, String str2, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = paymentRelation.paymentRelId;
        }
        if ((i & 2) != 0) {
            str = paymentRelation.serviceNumber;
        }
        if ((i & 4) != 0) {
            str2 = paymentRelation.limitValueType;
        }
        if ((i & 8) != 0) {
            l2 = paymentRelation.limitValue;
        }
        return paymentRelation.copy(l, str, str2, l2);
    }

    public final Long component1() {
        return this.paymentRelId;
    }

    public final String component2() {
        return this.serviceNumber;
    }

    public final String component3() {
        return this.limitValueType;
    }

    public final Long component4() {
        return this.limitValue;
    }

    public final PaymentRelation copy(Long l, String str, String str2, Long l2) {
        return new PaymentRelation(l, str, str2, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentRelation)) {
            return false;
        }
        PaymentRelation paymentRelation = (PaymentRelation) obj;
        return dqc.a(this.paymentRelId, paymentRelation.paymentRelId) && dqc.a((Object) this.serviceNumber, (Object) paymentRelation.serviceNumber) && dqc.a((Object) this.limitValueType, (Object) paymentRelation.limitValueType) && dqc.a(this.limitValue, paymentRelation.limitValue);
    }

    public final int hashCode() {
        Long l = this.paymentRelId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.serviceNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.limitValueType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.limitValue;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "PaymentRelation(paymentRelId=" + this.paymentRelId + ", serviceNumber=" + ((Object) this.serviceNumber) + ", limitValueType=" + ((Object) this.limitValueType) + ", limitValue=" + this.limitValue + ')';
    }

    public PaymentRelation(Long l, String str, String str2, Long l2) {
        this.paymentRelId = l;
        this.serviceNumber = str;
        this.limitValueType = str2;
        this.limitValue = l2;
    }

    public /* synthetic */ PaymentRelation(Long l, String str, String str2, Long l2, int i, dpx dpxVar) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? -1L : l2);
    }

    public final Long getPaymentRelId() {
        return this.paymentRelId;
    }

    public final String getServiceNumber() {
        return this.serviceNumber;
    }

    public final String getLimitValueType() {
        return this.limitValueType;
    }

    public final Long getLimitValue() {
        return this.limitValue;
    }
}
