package com.ucare.we.model.local.managepaymentlimit;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010JV\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f¨\u0006$"}, d2 = {"Lcom/ucare/we/model/local/managepaymentlimit/ManageConsumptionLimitRequestBody;", "", "serviceNumber", "", "groupId", "freeUnitType", "measureUnitId", "actionType", "limitAmount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)V", "getActionType", "()Ljava/lang/String;", "getFreeUnitType", "getGroupId", "getLimitAmount", "()Ljava/lang/Float;", "setLimitAmount", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getMeasureUnitId", "getServiceNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)Lcom/ucare/we/model/local/managepaymentlimit/ManageConsumptionLimitRequestBody;", "equals", "", "other", "hashCode", "", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ManageConsumptionLimitRequestBody {
    @cqh(a = "actionType")
    private final String actionType;
    @cqh(a = "freeUnitType")
    private final String freeUnitType;
    @cqh(a = "groupId")
    private final String groupId;
    @cqh(a = "limitAmount")
    private Float limitAmount;
    @cqh(a = "measureUnitId")
    private final String measureUnitId;
    @cqh(a = "serviceNumber")
    private final String serviceNumber;

    public ManageConsumptionLimitRequestBody() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ManageConsumptionLimitRequestBody copy$default(ManageConsumptionLimitRequestBody manageConsumptionLimitRequestBody, String str, String str2, String str3, String str4, String str5, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = manageConsumptionLimitRequestBody.serviceNumber;
        }
        if ((i & 2) != 0) {
            str2 = manageConsumptionLimitRequestBody.groupId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = manageConsumptionLimitRequestBody.freeUnitType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = manageConsumptionLimitRequestBody.measureUnitId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = manageConsumptionLimitRequestBody.actionType;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            f = manageConsumptionLimitRequestBody.limitAmount;
        }
        return manageConsumptionLimitRequestBody.copy(str, str6, str7, str8, str9, f);
    }

    public final String component1() {
        return this.serviceNumber;
    }

    public final String component2() {
        return this.groupId;
    }

    public final String component3() {
        return this.freeUnitType;
    }

    public final String component4() {
        return this.measureUnitId;
    }

    public final String component5() {
        return this.actionType;
    }

    public final Float component6() {
        return this.limitAmount;
    }

    public final ManageConsumptionLimitRequestBody copy(String str, String str2, String str3, String str4, String str5, Float f) {
        return new ManageConsumptionLimitRequestBody(str, str2, str3, str4, str5, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManageConsumptionLimitRequestBody)) {
            return false;
        }
        ManageConsumptionLimitRequestBody manageConsumptionLimitRequestBody = (ManageConsumptionLimitRequestBody) obj;
        return dqc.a((Object) this.serviceNumber, (Object) manageConsumptionLimitRequestBody.serviceNumber) && dqc.a((Object) this.groupId, (Object) manageConsumptionLimitRequestBody.groupId) && dqc.a((Object) this.freeUnitType, (Object) manageConsumptionLimitRequestBody.freeUnitType) && dqc.a((Object) this.measureUnitId, (Object) manageConsumptionLimitRequestBody.measureUnitId) && dqc.a((Object) this.actionType, (Object) manageConsumptionLimitRequestBody.actionType) && dqc.a(this.limitAmount, manageConsumptionLimitRequestBody.limitAmount);
    }

    public final int hashCode() {
        String str = this.serviceNumber;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.groupId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.freeUnitType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.measureUnitId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.limitAmount;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "ManageConsumptionLimitRequestBody(serviceNumber=" + ((Object) this.serviceNumber) + ", groupId=" + ((Object) this.groupId) + ", freeUnitType=" + ((Object) this.freeUnitType) + ", measureUnitId=" + ((Object) this.measureUnitId) + ", actionType=" + ((Object) this.actionType) + ", limitAmount=" + this.limitAmount + ')';
    }

    public ManageConsumptionLimitRequestBody(String str, String str2, String str3, String str4, String str5, Float f) {
        this.serviceNumber = str;
        this.groupId = str2;
        this.freeUnitType = str3;
        this.measureUnitId = str4;
        this.actionType = str5;
        this.limitAmount = f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ManageConsumptionLimitRequestBody(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.Float r10, int r11, defpackage.dpx r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            java.lang.String r0 = ""
            if (r12 == 0) goto L8
            r12 = r0
            goto L9
        L8:
            r12 = r5
        L9:
            r5 = r11 & 2
            if (r5 == 0) goto Lf
            r1 = r0
            goto L10
        Lf:
            r1 = r6
        L10:
            r5 = r11 & 4
            if (r5 == 0) goto L16
            r2 = r0
            goto L17
        L16:
            r2 = r7
        L17:
            r5 = r11 & 8
            if (r5 == 0) goto L1d
            r3 = r0
            goto L1e
        L1d:
            r3 = r8
        L1e:
            r5 = r11 & 16
            if (r5 == 0) goto L23
            goto L24
        L23:
            r0 = r9
        L24:
            r5 = r11 & 32
            if (r5 == 0) goto L29
            r10 = 0
        L29:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r3
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ucare.we.model.local.managepaymentlimit.ManageConsumptionLimitRequestBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, int, dpx):void");
    }

    public final String getServiceNumber() {
        return this.serviceNumber;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getFreeUnitType() {
        return this.freeUnitType;
    }

    public final String getMeasureUnitId() {
        return this.measureUnitId;
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final Float getLimitAmount() {
        return this.limitAmount;
    }

    public final void setLimitAmount(Float f) {
        this.limitAmount = f;
    }
}
