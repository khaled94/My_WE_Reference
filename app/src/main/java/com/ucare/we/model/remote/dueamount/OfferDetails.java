package com.ucare.we.model.remote.dueamount;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class OfferDetails implements Parcelable {
    public static final Parcelable.Creator<OfferDetails> CREATOR = new Parcelable.Creator<OfferDetails>() { // from class: com.ucare.we.model.remote.dueamount.OfferDetails.1
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
    @cqf
    private String bssOfferId;
    @cqh(a = "iconUrl")
    private String iconUrl;
    @cqh(a = "id")
    @cqf
    private Integer id;
    @cqh(a = "type")
    @cqf
    private String type;
    @cqh(a = "urlAr")
    @cqf
    private String urlAr;
    @cqh(a = "urlEn")
    @cqf
    private String urlEn;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected OfferDetails(Parcel parcel) {
        if (parcel.readByte() == 0) {
            this.id = null;
        } else {
            this.id = Integer.valueOf(parcel.readInt());
        }
        this.bssOfferId = parcel.readString();
        this.urlEn = parcel.readString();
        this.urlAr = parcel.readString();
        this.type = parcel.readString();
        this.iconUrl = parcel.readString();
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
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
        if (this.id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.id.intValue());
        }
        parcel.writeString(this.bssOfferId);
        parcel.writeString(this.urlEn);
        parcel.writeString(this.urlAr);
        parcel.writeString(this.type);
        parcel.writeString(this.iconUrl);
    }
}
