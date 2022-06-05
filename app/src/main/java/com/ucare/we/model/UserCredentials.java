package com.ucare.we.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class UserCredentials implements Parcelable {
    public static final Parcelable.Creator<UserCredentials> CREATOR = new Parcelable.Creator<UserCredentials>() { // from class: com.ucare.we.model.UserCredentials.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserCredentials createFromParcel(Parcel parcel) {
            return new UserCredentials(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserCredentials[] newArray(int i) {
            return new UserCredentials[i];
        }
    };
    @cqh(a = "customerName")
    private String customerName;
    @cqh(a = "mobileNumber")
    private String mobileNumber;
    @cqh(a = "passWord")
    private String passWord;
    @cqh(a = "providerType")
    private String provider;
    @cqh(a = "providerToken")
    private String token;
    @cqh(a = "userRole")
    private String userRole;
    @cqh(a = "userStatus")
    private String userStatus;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UserCredentials() {
        this.userStatus = "PREPAID";
        this.userRole = "";
        this.token = "";
        this.provider = "";
    }

    public UserCredentials(String str, String str2) {
        this.userStatus = "PREPAID";
        this.userRole = "";
        this.token = "";
        this.provider = "";
        this.mobileNumber = str;
        this.customerName = str;
        this.passWord = str2;
        this.userStatus = "PREPAID";
    }

    public UserCredentials(String str, String str2, String str3, String str4) {
        this.userStatus = "PREPAID";
        this.userRole = "";
        this.token = "";
        this.provider = "";
        this.mobileNumber = str;
        this.passWord = str2;
        this.userStatus = "PREPAID";
        this.provider = str4;
        this.token = str3;
    }

    public UserCredentials(String str, String str2, String str3) {
        this.userStatus = "PREPAID";
        this.userRole = "";
        this.token = "";
        this.provider = "";
        this.mobileNumber = str;
        this.passWord = str2;
        this.customerName = str3;
    }

    protected UserCredentials(Parcel parcel) {
        this.userStatus = "PREPAID";
        this.userRole = "";
        this.token = "";
        this.provider = "";
        this.mobileNumber = parcel.readString();
        this.customerName = parcel.readString();
        this.passWord = parcel.readString();
        this.userStatus = parcel.readString();
        this.token = parcel.readString();
        this.provider = parcel.readString();
    }

    public static Parcelable.Creator<UserCredentials> getCREATOR() {
        return CREATOR;
    }

    public String getUserRole() {
        return this.userRole;
    }

    public void setUserRole(String str) {
        this.userRole = str;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String str) {
        this.customerName = str;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String str) {
        this.passWord = str;
    }

    public String getUserStatus() {
        return this.userStatus;
    }

    public void setUserStatus(String str) {
        this.userStatus = str;
    }

    public String getUserRole(String str) {
        return this.userRole;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mobileNumber);
        parcel.writeString(this.customerName);
        parcel.writeString(this.passWord);
        parcel.writeString(this.userStatus);
        parcel.writeString(this.token);
        parcel.writeString(this.provider);
    }
}
