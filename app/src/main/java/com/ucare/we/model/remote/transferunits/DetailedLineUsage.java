package com.ucare.we.model.remote.transferunits;

import android.os.Parcel;
import android.os.Parcelable;
import com.ucare.we.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\rHÆ\u0003J\u00ad\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\t\u0010O\u001a\u00020\rHÖ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020\rHÖ\u0001J\t\u0010U\u001a\u00020\u0005HÖ\u0001J\u0019\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001fR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001fR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001fR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001fR\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001fR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001fR\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001fR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001fR\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001fR\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001fR\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001cR\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001c¨\u0006["}, d2 = {"Lcom/ucare/we/model/remote/transferunits/DetailedLineUsage;", "Landroid/os/Parcelable;", "freeAmount", "", "freeUnitArName", "", "freeUnitEnName", "initialTotalAmount", "itemCode", "measureUnitArName", "measureUnitEnName", "measureUnitId", "remainingDaysForRenewal", "", "renewalDate", "serviceId", "serviceType", "subscriptionDate", "summaryGroupName", "usagePercentage", "usedAmount", "(DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "expireDate", "getExpireDate", "()Ljava/lang/String;", "getFreeAmount", "()D", "setFreeAmount", "(D)V", "getFreeUnitArName", "setFreeUnitArName", "(Ljava/lang/String;)V", "getFreeUnitEnName", "setFreeUnitEnName", "getInitialTotalAmount", "setInitialTotalAmount", "getItemCode", "setItemCode", "getMeasureUnitArName", "setMeasureUnitArName", "getMeasureUnitEnName", "setMeasureUnitEnName", "getMeasureUnitId", "setMeasureUnitId", "getRemainingDaysForRenewal", "()I", "setRemainingDaysForRenewal", "(I)V", "getRenewalDate", "setRenewalDate", "getServiceId", "setServiceId", "getServiceType", "setServiceType", "getSubscriptionDate", "setSubscriptionDate", "getSummaryGroupName", "setSummaryGroupName", "getUsagePercentage", "setUsagePercentage", "getUsedAmount", "setUsedAmount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DetailedLineUsage implements Parcelable {
    public static final Parcelable.Creator<DetailedLineUsage> CREATOR = new Creator();
    @cqh(a = "freeAmount")
    @cqf
    private double freeAmount;
    @cqh(a = "freeUnitArName")
    @cqf
    private String freeUnitArName;
    @cqh(a = "freeUnitEnName")
    @cqf
    private String freeUnitEnName;
    @cqh(a = "initialTotalAmount")
    @cqf
    private double initialTotalAmount;
    @cqh(a = "itemCode")
    @cqf
    private String itemCode;
    @cqh(a = "measureUnitArName")
    @cqf
    private String measureUnitArName;
    @cqh(a = "measureUnitEnName")
    @cqf
    private String measureUnitEnName;
    @cqh(a = "measureUnitId")
    @cqf
    private String measureUnitId;
    @cqh(a = "remainingDaysForRenewal")
    @cqf
    private int remainingDaysForRenewal;
    @cqh(a = "renewalDate")
    @cqf
    private String renewalDate;
    @cqh(a = "serviceId")
    @cqf
    private String serviceId;
    @cqh(a = "serviceType")
    @cqf
    private String serviceType;
    @cqh(a = "subscriptionDate")
    @cqf
    private String subscriptionDate;
    @cqh(a = "summaryGroupName")
    @cqf
    private String summaryGroupName;
    @cqh(a = "usagePercentage")
    @cqf
    private double usagePercentage;
    @cqh(a = "usedAmount")
    @cqf
    private double usedAmount;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<DetailedLineUsage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DetailedLineUsage createFromParcel(Parcel parcel) {
            dqc.d(parcel, "parcel");
            return new DetailedLineUsage(parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DetailedLineUsage[] newArray(int i) {
            return new DetailedLineUsage[i];
        }
    }

    public final double component1() {
        return this.freeAmount;
    }

    public final String component10() {
        return this.renewalDate;
    }

    public final String component11() {
        return this.serviceId;
    }

    public final String component12() {
        return this.serviceType;
    }

    public final String component13() {
        return this.subscriptionDate;
    }

    public final String component14() {
        return this.summaryGroupName;
    }

    public final double component15() {
        return this.usagePercentage;
    }

    public final double component16() {
        return this.usedAmount;
    }

    public final String component2() {
        return this.freeUnitArName;
    }

    public final String component3() {
        return this.freeUnitEnName;
    }

    public final double component4() {
        return this.initialTotalAmount;
    }

    public final String component5() {
        return this.itemCode;
    }

    public final String component6() {
        return this.measureUnitArName;
    }

    public final String component7() {
        return this.measureUnitEnName;
    }

    public final String component8() {
        return this.measureUnitId;
    }

    public final int component9() {
        return this.remainingDaysForRenewal;
    }

    public final DetailedLineUsage copy(double d, String str, String str2, double d2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, String str11, double d3, double d4) {
        dqc.d(str3, "itemCode");
        dqc.d(str4, "measureUnitArName");
        dqc.d(str5, "measureUnitEnName");
        dqc.d(str6, "measureUnitId");
        dqc.d(str7, "renewalDate");
        dqc.d(str8, "serviceId");
        dqc.d(str9, "serviceType");
        dqc.d(str10, "subscriptionDate");
        dqc.d(str11, "summaryGroupName");
        return new DetailedLineUsage(d, str, str2, d2, str3, str4, str5, str6, i, str7, str8, str9, str10, str11, d3, d4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailedLineUsage)) {
            return false;
        }
        DetailedLineUsage detailedLineUsage = (DetailedLineUsage) obj;
        return dqc.a(Double.valueOf(this.freeAmount), Double.valueOf(detailedLineUsage.freeAmount)) && dqc.a((Object) this.freeUnitArName, (Object) detailedLineUsage.freeUnitArName) && dqc.a((Object) this.freeUnitEnName, (Object) detailedLineUsage.freeUnitEnName) && dqc.a(Double.valueOf(this.initialTotalAmount), Double.valueOf(detailedLineUsage.initialTotalAmount)) && dqc.a((Object) this.itemCode, (Object) detailedLineUsage.itemCode) && dqc.a((Object) this.measureUnitArName, (Object) detailedLineUsage.measureUnitArName) && dqc.a((Object) this.measureUnitEnName, (Object) detailedLineUsage.measureUnitEnName) && dqc.a((Object) this.measureUnitId, (Object) detailedLineUsage.measureUnitId) && this.remainingDaysForRenewal == detailedLineUsage.remainingDaysForRenewal && dqc.a((Object) this.renewalDate, (Object) detailedLineUsage.renewalDate) && dqc.a((Object) this.serviceId, (Object) detailedLineUsage.serviceId) && dqc.a((Object) this.serviceType, (Object) detailedLineUsage.serviceType) && dqc.a((Object) this.subscriptionDate, (Object) detailedLineUsage.subscriptionDate) && dqc.a((Object) this.summaryGroupName, (Object) detailedLineUsage.summaryGroupName) && dqc.a(Double.valueOf(this.usagePercentage), Double.valueOf(detailedLineUsage.usagePercentage)) && dqc.a(Double.valueOf(this.usedAmount), Double.valueOf(detailedLineUsage.usedAmount));
    }

    public final int hashCode() {
        int doubleToLongBits = Double.doubleToLongBits(this.freeAmount) * 31;
        String str = this.freeUnitArName;
        int i = 0;
        int hashCode = (doubleToLongBits + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.freeUnitEnName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((((((((((((((((((((hashCode + i) * 31) + Double.doubleToLongBits(this.initialTotalAmount)) * 31) + this.itemCode.hashCode()) * 31) + this.measureUnitArName.hashCode()) * 31) + this.measureUnitEnName.hashCode()) * 31) + this.measureUnitId.hashCode()) * 31) + this.remainingDaysForRenewal) * 31) + this.renewalDate.hashCode()) * 31) + this.serviceId.hashCode()) * 31) + this.serviceType.hashCode()) * 31) + this.subscriptionDate.hashCode()) * 31) + this.summaryGroupName.hashCode()) * 31) + Double.doubleToLongBits(this.usagePercentage)) * 31) + Double.doubleToLongBits(this.usedAmount);
    }

    public final String toString() {
        return "DetailedLineUsage(freeAmount=" + this.freeAmount + ", freeUnitArName=" + ((Object) this.freeUnitArName) + ", freeUnitEnName=" + ((Object) this.freeUnitEnName) + ", initialTotalAmount=" + this.initialTotalAmount + ", itemCode=" + this.itemCode + ", measureUnitArName=" + this.measureUnitArName + ", measureUnitEnName=" + this.measureUnitEnName + ", measureUnitId=" + this.measureUnitId + ", remainingDaysForRenewal=" + this.remainingDaysForRenewal + ", renewalDate=" + this.renewalDate + ", serviceId=" + this.serviceId + ", serviceType=" + this.serviceType + ", subscriptionDate=" + this.subscriptionDate + ", summaryGroupName=" + this.summaryGroupName + ", usagePercentage=" + this.usagePercentage + ", usedAmount=" + this.usedAmount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dqc.d(parcel, "out");
        parcel.writeDouble(this.freeAmount);
        parcel.writeString(this.freeUnitArName);
        parcel.writeString(this.freeUnitEnName);
        parcel.writeDouble(this.initialTotalAmount);
        parcel.writeString(this.itemCode);
        parcel.writeString(this.measureUnitArName);
        parcel.writeString(this.measureUnitEnName);
        parcel.writeString(this.measureUnitId);
        parcel.writeInt(this.remainingDaysForRenewal);
        parcel.writeString(this.renewalDate);
        parcel.writeString(this.serviceId);
        parcel.writeString(this.serviceType);
        parcel.writeString(this.subscriptionDate);
        parcel.writeString(this.summaryGroupName);
        parcel.writeDouble(this.usagePercentage);
        parcel.writeDouble(this.usedAmount);
    }

    public DetailedLineUsage(double d, String str, String str2, double d2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, String str11, double d3, double d4) {
        dqc.d(str3, "itemCode");
        dqc.d(str4, "measureUnitArName");
        dqc.d(str5, "measureUnitEnName");
        dqc.d(str6, "measureUnitId");
        dqc.d(str7, "renewalDate");
        dqc.d(str8, "serviceId");
        dqc.d(str9, "serviceType");
        dqc.d(str10, "subscriptionDate");
        dqc.d(str11, "summaryGroupName");
        this.freeAmount = d;
        this.freeUnitArName = str;
        this.freeUnitEnName = str2;
        this.initialTotalAmount = d2;
        this.itemCode = str3;
        this.measureUnitArName = str4;
        this.measureUnitEnName = str5;
        this.measureUnitId = str6;
        this.remainingDaysForRenewal = i;
        this.renewalDate = str7;
        this.serviceId = str8;
        this.serviceType = str9;
        this.subscriptionDate = str10;
        this.summaryGroupName = str11;
        this.usagePercentage = d3;
        this.usedAmount = d4;
    }

    public final double getFreeAmount() {
        return this.freeAmount;
    }

    public final void setFreeAmount(double d) {
        this.freeAmount = d;
    }

    public final String getFreeUnitArName() {
        return this.freeUnitArName;
    }

    public final void setFreeUnitArName(String str) {
        this.freeUnitArName = str;
    }

    public final String getFreeUnitEnName() {
        return this.freeUnitEnName;
    }

    public final void setFreeUnitEnName(String str) {
        this.freeUnitEnName = str;
    }

    public final double getInitialTotalAmount() {
        return this.initialTotalAmount;
    }

    public final void setInitialTotalAmount(double d) {
        this.initialTotalAmount = d;
    }

    public final String getItemCode() {
        return this.itemCode;
    }

    public final void setItemCode(String str) {
        dqc.d(str, "<set-?>");
        this.itemCode = str;
    }

    public final String getMeasureUnitArName() {
        return this.measureUnitArName;
    }

    public final void setMeasureUnitArName(String str) {
        dqc.d(str, "<set-?>");
        this.measureUnitArName = str;
    }

    public final String getMeasureUnitEnName() {
        return this.measureUnitEnName;
    }

    public final void setMeasureUnitEnName(String str) {
        dqc.d(str, "<set-?>");
        this.measureUnitEnName = str;
    }

    public final String getMeasureUnitId() {
        return this.measureUnitId;
    }

    public final void setMeasureUnitId(String str) {
        dqc.d(str, "<set-?>");
        this.measureUnitId = str;
    }

    public final int getRemainingDaysForRenewal() {
        return this.remainingDaysForRenewal;
    }

    public final void setRemainingDaysForRenewal(int i) {
        this.remainingDaysForRenewal = i;
    }

    public final String getRenewalDate() {
        return this.renewalDate;
    }

    public final void setRenewalDate(String str) {
        dqc.d(str, "<set-?>");
        this.renewalDate = str;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final void setServiceId(String str) {
        dqc.d(str, "<set-?>");
        this.serviceId = str;
    }

    public final String getServiceType() {
        return this.serviceType;
    }

    public final void setServiceType(String str) {
        dqc.d(str, "<set-?>");
        this.serviceType = str;
    }

    public final String getSubscriptionDate() {
        return this.subscriptionDate;
    }

    public final void setSubscriptionDate(String str) {
        dqc.d(str, "<set-?>");
        this.subscriptionDate = str;
    }

    public final String getSummaryGroupName() {
        return this.summaryGroupName;
    }

    public final void setSummaryGroupName(String str) {
        dqc.d(str, "<set-?>");
        this.summaryGroupName = str;
    }

    public final double getUsagePercentage() {
        return this.usagePercentage;
    }

    public final void setUsagePercentage(double d) {
        this.usagePercentage = d;
    }

    public final double getUsedAmount() {
        return this.usedAmount;
    }

    public final void setUsedAmount(double d) {
        this.usedAmount = d;
    }

    public final String getExpireDate() {
        return djq.a().getString(R.string.expiryDate) + ' ' + this.renewalDate;
    }
}
