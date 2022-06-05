package com.ucare.we.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class StoreResponseBody implements Parcelable {
    public static final Parcelable.Creator<StoreResponseBody> CREATOR = new Parcelable.Creator<StoreResponseBody>() { // from class: com.ucare.we.model.StoreResponseBody.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreResponseBody createFromParcel(Parcel parcel) {
            return new StoreResponseBody(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreResponseBody[] newArray(int i) {
            return new StoreResponseBody[i];
        }
    };
    @cqh(a = "arBranchAddress")
    private String arBranchAddress;
    @cqh(a = "arBranchName")
    private String arBranchName;
    @cqh(a = "branchId")
    private int branchId;
    @cqh(a = "distanceFromSourceLocation")
    private String distanceFromSourceLocation;
    @cqh(a = "enBranchAddress")
    private String enBranchAddress;
    @cqh(a = "enBranchName")
    private String enBranchName;
    @cqh(a = "latitude")
    private double latitude;
    @cqh(a = "longitude")
    private double longitude;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StoreResponseBody() {
    }

    protected StoreResponseBody(Parcel parcel) {
        this.arBranchName = parcel.readString();
        this.enBranchName = parcel.readString();
        this.arBranchAddress = parcel.readString();
        this.enBranchAddress = parcel.readString();
        this.longitude = parcel.readDouble();
        this.latitude = parcel.readDouble();
        this.distanceFromSourceLocation = parcel.readString();
        this.branchId = parcel.readInt();
    }

    public String getArBranchName() {
        return this.arBranchName;
    }

    public void setArBranchName(String str) {
        this.arBranchName = str;
    }

    public String getEnBranchName() {
        return this.enBranchName;
    }

    public void setEnBranchName(String str) {
        this.enBranchName = str;
    }

    public String getArBranchAddress() {
        return this.arBranchAddress;
    }

    public void setArBranchAddress(String str) {
        this.arBranchAddress = str;
    }

    public String getEnBranchAddress() {
        return this.enBranchAddress;
    }

    public void setEnBranchAddress(String str) {
        this.enBranchAddress = str;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public String getDistanceFromSourceLocation() {
        return this.distanceFromSourceLocation;
    }

    public void setDistanceFromSourceLocation(String str) {
        this.distanceFromSourceLocation = str;
    }

    public int getBranchId() {
        return this.branchId;
    }

    public void setBranchId(int i) {
        this.branchId = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.arBranchName);
        parcel.writeString(this.enBranchName);
        parcel.writeString(this.arBranchAddress);
        parcel.writeString(this.enBranchAddress);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.latitude);
        parcel.writeString(this.distanceFromSourceLocation);
        parcel.writeInt(this.branchId);
    }
}
