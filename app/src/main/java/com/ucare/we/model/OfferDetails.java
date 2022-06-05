package com.ucare.we.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class OfferDetails implements Parcelable {
    public static final Parcelable.Creator<OfferDetails> CREATOR = new Parcelable.Creator<OfferDetails>() { // from class: com.ucare.we.model.OfferDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfferDetails createFromParcel(Parcel parcel) {
            return new OfferDetails(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfferDetails[] newArray(int i) {
            return new OfferDetails[i];
        }
    };
    @cqh(a = "bssOfferId")
    private String bssOfferId;
    @cqh(a = "iconUrl")
    private String iconUrl;
    @cqh(a = "id")
    private double id;
    @cqh(a = "type")
    private String type;
    @cqh(a = "urlAr")
    private String urlAr;
    @cqh(a = "urlEn")
    private String urlEn;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public OfferDetails(double d, String str, String str2, String str3, String str4, String str5) {
        this.id = d;
        this.bssOfferId = str;
        this.urlEn = str2;
        this.urlAr = str3;
        this.type = str4;
        this.iconUrl = str5;
    }

    protected OfferDetails(Parcel parcel) {
        this.id = parcel.readDouble();
        this.bssOfferId = parcel.readString();
        this.urlEn = parcel.readString();
        this.urlAr = parcel.readString();
        this.type = parcel.readString();
        this.iconUrl = parcel.readString();
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public double getId() {
        return this.id;
    }

    public void setId(double d) {
        this.id = d;
    }

    public String getBssOfferId() {
        return this.bssOfferId;
    }

    public void setBssOfferId(String str) {
        this.bssOfferId = str;
    }

    public String getUrlEn() {
        return this.urlEn;
    }

    public void setUrlEn(String str) {
        this.urlEn = str;
    }

    public String getUrlAr() {
        return this.urlAr;
    }

    public void setUrlAr(String str) {
        this.urlAr = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.id);
        parcel.writeString(this.bssOfferId);
        parcel.writeString(this.urlEn);
        parcel.writeString(this.urlAr);
        parcel.writeString(this.type);
        parcel.writeString(this.iconUrl);
    }
}
