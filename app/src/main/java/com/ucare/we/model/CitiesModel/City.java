package com.ucare.we.model.CitiesModel;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class City implements Parcelable {
    public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() { // from class: com.ucare.we.model.CitiesModel.City.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final City createFromParcel(Parcel parcel) {
            return new City(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final City[] newArray(int i) {
            return new City[i];
        }
    };
    @cqh(a = "cityArabic")
    public String cityArabic;
    @cqh(a = "cityEnglish")
    public String cityEnglish;
    @cqh(a = "cityId")
    public int cityId;
    @cqh(a = "visible")
    public int visible;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public City() {
    }

    protected City(Parcel parcel) {
        this.cityArabic = parcel.readString();
        this.cityEnglish = parcel.readString();
        this.cityId = parcel.readInt();
        this.visible = parcel.readInt();
    }

    public String getCityArabic() {
        return this.cityArabic;
    }

    public void setCityArabic(String str) {
        this.cityArabic = str;
    }

    public String getCityEnglish() {
        return this.cityEnglish;
    }

    public void setCityEnglish(String str) {
        this.cityEnglish = str;
    }

    public int getCityId() {
        return this.cityId;
    }

    public void setCityId(int i) {
        this.cityId = i;
    }

    public int getVisible() {
        return this.visible;
    }

    public void setVisible(int i) {
        this.visible = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cityArabic);
        parcel.writeString(this.cityEnglish);
        parcel.writeInt(this.cityId);
        parcel.writeInt(this.visible);
    }
}
