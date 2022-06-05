package com.ucare.we.model.usagedetails;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class SummarizedLineUsageItem implements Parcelable {
    public static final Parcelable.Creator<SummarizedLineUsageItem> CREATOR = new Parcelable.Creator<SummarizedLineUsageItem>() { // from class: com.ucare.we.model.usagedetails.SummarizedLineUsageItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SummarizedLineUsageItem createFromParcel(Parcel parcel) {
            return new SummarizedLineUsageItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SummarizedLineUsageItem[] newArray(int i) {
            return new SummarizedLineUsageItem[i];
        }
    };
    @cqh(a = "arabicDisplayName")
    private String arabicDisplayName;
    @cqh(a = "englishDisplayName")
    private String englishDisplayName;
    @cqh(a = "freeAmount")
    private float freeAmount;
    @cqh(a = "groupArName")
    private String groupArName;
    @cqh(a = "groupEnName")
    private String groupEnName;
    @cqh(a = "initialTotalAmount")
    private float initialTotalAmount;
    @cqh(a = "measureUnitArName")
    private String measureUnitArName;
    @cqh(a = "measureUnitEnName")
    private String measureUnitEnName;
    @cqh(a = "mesaureUnitId")
    private String mesaureUnitId;
    @cqh(a = "summaryGroupName")
    private String summaryGroupName;
    @cqh(a = "tabId")
    private Long tabId;
    @cqh(a = "token")
    private String token;
    @cqh(a = "usagePercentage")
    private float usagePercentage;
    @cqh(a = "usedAmount")
    private float usedAmount;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SummarizedLineUsageItem(String str, String str2, String str3, float f, float f2, float f3, float f4, String str4, String str5, String str6, String str7, Long l, String str8, String str9) {
        this.mesaureUnitId = str;
        this.englishDisplayName = str2;
        this.arabicDisplayName = str3;
        this.initialTotalAmount = f;
        this.freeAmount = f2;
        this.usagePercentage = f3;
        this.usedAmount = f4;
        this.measureUnitEnName = str4;
        this.measureUnitArName = str5;
        this.groupEnName = str6;
        this.groupArName = str7;
        this.tabId = l;
        this.summaryGroupName = str8;
        this.token = str9;
    }

    protected SummarizedLineUsageItem(Parcel parcel) {
        this.mesaureUnitId = parcel.readString();
        this.englishDisplayName = parcel.readString();
        this.arabicDisplayName = parcel.readString();
        this.initialTotalAmount = parcel.readFloat();
        this.freeAmount = parcel.readFloat();
        this.usagePercentage = parcel.readFloat();
        this.usedAmount = parcel.readFloat();
        this.measureUnitEnName = parcel.readString();
        this.measureUnitArName = parcel.readString();
        this.groupEnName = parcel.readString();
        this.groupArName = parcel.readString();
        if (parcel.readByte() == 0) {
            this.tabId = null;
        } else {
            this.tabId = Long.valueOf(parcel.readLong());
        }
        this.summaryGroupName = parcel.readString();
        this.token = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mesaureUnitId);
        parcel.writeString(this.englishDisplayName);
        parcel.writeString(this.arabicDisplayName);
        parcel.writeFloat(this.initialTotalAmount);
        parcel.writeFloat(this.freeAmount);
        parcel.writeFloat(this.usagePercentage);
        parcel.writeFloat(this.usedAmount);
        parcel.writeString(this.measureUnitEnName);
        parcel.writeString(this.measureUnitArName);
        parcel.writeString(this.groupEnName);
        parcel.writeString(this.groupArName);
        if (this.tabId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.tabId.longValue());
        }
        parcel.writeString(this.summaryGroupName);
        parcel.writeString(this.token);
    }

    public String getSummaryGroupName() {
        return this.summaryGroupName;
    }

    public void setSummaryGroupName(String str) {
        this.summaryGroupName = str;
    }

    public Long getTabId() {
        return this.tabId;
    }

    public void setTabId(Long l) {
        this.tabId = l;
    }

    public String getGroupEnName() {
        return this.groupEnName;
    }

    public void setGroupEnName(String str) {
        this.groupEnName = str;
    }

    public String getGroupArName() {
        return this.groupArName;
    }

    public void setGroupArName(String str) {
        this.groupArName = str;
    }

    public String getMesaureUnitId() {
        return this.mesaureUnitId;
    }

    public void setMesaureUnitId(String str) {
        this.mesaureUnitId = str;
    }

    public String getEnglishDisplayName() {
        return this.englishDisplayName;
    }

    public void setEnglishDisplayName(String str) {
        this.englishDisplayName = str;
    }

    public String getArabicDisplayName() {
        return this.arabicDisplayName;
    }

    public void setArabicDisplayName(String str) {
        this.arabicDisplayName = str;
    }

    public float getInitialTotalAmount() {
        return this.initialTotalAmount;
    }

    public void setInitialTotalAmount(float f) {
        this.initialTotalAmount = f;
    }

    public float getFreeAmount() {
        return this.freeAmount;
    }

    public void setFreeAmount(float f) {
        this.freeAmount = f;
    }

    public float getUsagePercentage() {
        return this.usagePercentage;
    }

    public void setUsagePercentage(float f) {
        this.usagePercentage = f;
    }

    public float getUsedAmount() {
        return this.usedAmount;
    }

    public void setUsedAmount(float f) {
        this.usedAmount = f;
    }

    public String getMeasureUnitEnName() {
        return this.measureUnitEnName;
    }

    public void setMeasureUnitEnName(String str) {
        this.measureUnitEnName = str;
    }

    public String getMeasureUnitArName() {
        return this.measureUnitArName;
    }

    public void setMeasureUnitArName(String str) {
        this.measureUnitArName = str;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
