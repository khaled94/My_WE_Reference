package com.ucare.we.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class PaymentHistoryResponseBody implements Parcelable {
    public static final Parcelable.Creator<PaymentHistoryResponseBody> CREATOR = new Parcelable.Creator<PaymentHistoryResponseBody>() { // from class: com.ucare.we.model.PaymentHistoryResponseBody.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentHistoryResponseBody createFromParcel(Parcel parcel) {
            return new PaymentHistoryResponseBody(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentHistoryResponseBody[] newArray(int i) {
            return new PaymentHistoryResponseBody[i];
        }
    };
    @cqh(a = "newBalanceAmount")
    private float newBalanceAmount;
    @cqh(a = "oldBalanceAmount")
    private float oldBalanceAmount;
    @cqh(a = "rechargeChannel")
    private String rechargeChannel;
    @cqh(a = "rechargeLogAmount")
    private float rechargeLogAmount;
    @cqh(a = "rechargeLogDate")
    private String rechargeLogDate;
    @cqh(a = "rechargeLogId")
    private double rechargeLogId;
    @cqh(a = "rechargeType")
    private String rechargeType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PaymentHistoryResponseBody() {
    }

    protected PaymentHistoryResponseBody(Parcel parcel) {
        this.rechargeLogId = parcel.readInt();
        this.rechargeLogDate = parcel.readString();
        this.rechargeLogAmount = parcel.readFloat();
        this.rechargeType = parcel.readString();
        this.rechargeChannel = parcel.readString();
        this.oldBalanceAmount = parcel.readFloat();
        this.newBalanceAmount = parcel.readFloat();
    }

    public double getRechargeLogId() {
        return this.rechargeLogId;
    }

    public void setRechargeLogId(int i) {
        this.rechargeLogId = i;
    }

    public String getRechargeLogDate() {
        return this.rechargeLogDate;
    }

    public void setRechargeLogDate(String str) {
        this.rechargeLogDate = str;
    }

    public float getRechargeLogAmount() {
        return this.rechargeLogAmount;
    }

    public void setRechargeLogAmount(float f) {
        this.rechargeLogAmount = f;
    }

    public String getRechargeType() {
        return this.rechargeType;
    }

    public void setRechargeType(String str) {
        this.rechargeType = str;
    }

    public String getRechargeChannel() {
        return this.rechargeChannel;
    }

    public void setRechargeChannel(String str) {
        this.rechargeChannel = str;
    }

    public float getOldBalanceAmount() {
        return this.oldBalanceAmount;
    }

    public void setOldBalanceAmount(float f) {
        this.oldBalanceAmount = f;
    }

    public float getNewBalanceAmount() {
        return this.newBalanceAmount;
    }

    public void setNewBalanceAmount(float f) {
        this.newBalanceAmount = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.rechargeLogId);
        parcel.writeString(this.rechargeLogDate);
        parcel.writeFloat(this.rechargeLogAmount);
        parcel.writeString(this.rechargeType);
        parcel.writeString(this.rechargeChannel);
        parcel.writeFloat(this.oldBalanceAmount);
        parcel.writeFloat(this.newBalanceAmount);
    }
}
