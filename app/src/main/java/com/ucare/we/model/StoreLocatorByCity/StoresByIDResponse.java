package com.ucare.we.model.StoreLocatorByCity;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class StoresByIDResponse implements Parcelable {
    public static final Parcelable.Creator<StoresByIDResponse> CREATOR = new Parcelable.Creator<StoresByIDResponse>() { // from class: com.ucare.we.model.StoreLocatorByCity.StoresByIDResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoresByIDResponse createFromParcel(Parcel parcel) {
            return new StoresByIDResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoresByIDResponse[] newArray(int i) {
            return new StoresByIDResponse[i];
        }
    };
    @cqh(a = "arabicAddress")
    public String arabicAddress;
    @cqh(a = "arabicName")
    public String arabicName;
    @cqh(a = "arabicWorkingDays_Hours")
    public String arabicWorkingDays_Hours;
    @cqh(a = "englishAddress")
    public String englishAddress;
    @cqh(a = "englishName")
    public String englishName;
    @cqh(a = "englishWorkingDays_Hours")
    public String englishWorkingDays_Hours;
    @cqh(a = "latitude")
    public String latitude;
    @cqh(a = "longitude")
    public String longitude;
    @cqh(a = "storeId")
    public int storeId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected StoresByIDResponse(Parcel parcel) {
        this.arabicAddress = parcel.readString();
        this.arabicName = parcel.readString();
        this.englishAddress = parcel.readString();
        this.englishName = parcel.readString();
        this.latitude = parcel.readString();
        this.longitude = parcel.readString();
        this.storeId = parcel.readInt();
        this.arabicWorkingDays_Hours = parcel.readString();
        this.englishWorkingDays_Hours = parcel.readString();
    }

    public String getArabicAddress() {
        return this.arabicAddress;
    }

    public void setArabicAddress(String str) {
        this.arabicAddress = str;
    }

    public String getArabicName() {
        return this.arabicName;
    }

    public void setArabicName(String str) {
        this.arabicName = str;
    }

    public String getEnglishAddress() {
        return this.englishAddress;
    }

    public void setEnglishAddress(String str) {
        this.englishAddress = str;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public void setEnglishName(String str) {
        this.englishName = str;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public int getStoreId() {
        return this.storeId;
    }

    public void setStoreId(int i) {
        this.storeId = i;
    }

    public String getArabicWorkingDays_Hours() {
        return this.arabicWorkingDays_Hours;
    }

    public void setArabicWorkingDays_Hours(String str) {
        this.arabicWorkingDays_Hours = str;
    }

    public String getEnglishWorkingDays_Hours() {
        return this.englishWorkingDays_Hours;
    }

    public void setEnglishWorkingDays_Hours(String str) {
        this.englishWorkingDays_Hours = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.arabicAddress);
        parcel.writeString(this.arabicName);
        parcel.writeString(this.englishAddress);
        parcel.writeString(this.englishName);
        parcel.writeString(this.latitude);
        parcel.writeString(this.longitude);
        parcel.writeInt(this.storeId);
        parcel.writeString(this.arabicWorkingDays_Hours);
        parcel.writeString(this.englishWorkingDays_Hours);
    }
}
