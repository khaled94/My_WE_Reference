package com.ucare.we.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class MainPlanResponseBody implements Parcelable {
    public static final Parcelable.Creator<MainPlanResponseBody> CREATOR = new Parcelable.Creator<MainPlanResponseBody>() { // from class: com.ucare.we.model.MainPlanResponseBody.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MainPlanResponseBody createFromParcel(Parcel parcel) {
            return new MainPlanResponseBody(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MainPlanResponseBody[] newArray(int i) {
            return new MainPlanResponseBody[i];
        }
    };
    @cqh(a = "addOn")
    private boolean addOn;
    @cqh(a = "bundleService")
    private String bundleService;
    @cqh(a = "mainPlan")
    private boolean mainPlan;
    @cqh(a = "price")
    private float price;
    @cqh(a = "primaryService")
    private String primaryService;
    @cqh(a = "remainingDaysForRenewal")
    private int remainingDaysForRenewal;
    @cqh(a = "renewalDate")
    private String renewalDate;
    @cqh(a = "serviceId")
    private String serviceId;
    @cqh(a = "serviceName")
    private String serviceName;
    @cqh(a = "serviceStatusCode")
    private String serviceStatusCode;
    @cqh(a = "serviceStatusDesc")
    private String serviceStatusDesc;
    @cqh(a = "subscriptionDate")
    private String subscriptionDate;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MainPlanResponseBody() {
    }

    protected MainPlanResponseBody(Parcel parcel) {
        this.serviceId = parcel.readString();
        this.serviceName = parcel.readString();
        this.serviceStatusCode = parcel.readString();
        this.serviceStatusDesc = parcel.readString();
        this.bundleService = parcel.readString();
        this.primaryService = parcel.readString();
        this.subscriptionDate = parcel.readString();
        this.renewalDate = parcel.readString();
        this.remainingDaysForRenewal = parcel.readInt();
        boolean z = true;
        this.mainPlan = parcel.readByte() != 0;
        this.addOn = parcel.readByte() == 0 ? false : z;
        this.price = parcel.readFloat();
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public String getServiceStatusCode() {
        return this.serviceStatusCode;
    }

    public void setServiceStatusCode(String str) {
        this.serviceStatusCode = str;
    }

    public String getServiceStatusDesc() {
        return this.serviceStatusDesc;
    }

    public void setServiceStatusDesc(String str) {
        this.serviceStatusDesc = str;
    }

    public String getBundleService() {
        return this.bundleService;
    }

    public void setBundleService(String str) {
        this.bundleService = str;
    }

    public String getPrimaryService() {
        return this.primaryService;
    }

    public void setPrimaryService(String str) {
        this.primaryService = str;
    }

    public String getSubscriptionDate() {
        return this.subscriptionDate;
    }

    public void setSubscriptionDate(String str) {
        this.subscriptionDate = str;
    }

    public String getRenewalDate() {
        return this.renewalDate;
    }

    public void setRenewalDate(String str) {
        this.renewalDate = str;
    }

    public int getRemainingDaysForRenewal() {
        return this.remainingDaysForRenewal;
    }

    public void setRemainingDaysForRenewal(int i) {
        this.remainingDaysForRenewal = i;
    }

    public boolean isMainPlan() {
        return this.mainPlan;
    }

    public void setMainPlan(boolean z) {
        this.mainPlan = z;
    }

    public boolean isAddOn() {
        return this.addOn;
    }

    public void setAddOn(boolean z) {
        this.addOn = z;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float f) {
        this.price = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.serviceId);
        parcel.writeString(this.serviceName);
        parcel.writeString(this.serviceStatusCode);
        parcel.writeString(this.serviceStatusDesc);
        parcel.writeString(this.bundleService);
        parcel.writeString(this.primaryService);
        parcel.writeString(this.subscriptionDate);
        parcel.writeString(this.renewalDate);
        parcel.writeInt(this.remainingDaysForRenewal);
        parcel.writeByte(this.mainPlan ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.addOn ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.price);
    }
}
