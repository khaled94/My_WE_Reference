package com.ucare.we.model.remote.dueamount;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class Offer implements Parcelable {
    public static final Parcelable.Creator<Offer> CREATOR = new Parcelable.Creator<Offer>() { // from class: com.ucare.we.model.remote.dueamount.Offer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Offer createFromParcel(Parcel parcel) {
            return new Offer(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Offer[] newArray(int i) {
            return new Offer[i];
        }
    };
    @cqh(a = "addOn")
    @cqf
    private Boolean addOn;
    @cqh(a = "expiryDate")
    @cqf
    private String expiryDate;
    @cqh(a = "fmc")
    @cqf
    private Boolean fmc;
    @cqh(a = "iptv")
    @cqf
    private Boolean iptv;
    @cqh(a = "main")
    @cqf
    private Boolean main;
    @cqh(a = "offerArName")
    @cqf
    private String offerArName;
    @cqh(a = "offerDetails")
    @cqf
    private OfferDetails offerDetails;
    @cqh(a = "offerEnName")
    @cqf
    private String offerEnName;
    @cqh(a = "offerId")
    @cqf
    private String offerId;
    @cqh(a = "price")
    @cqf
    private Double price;
    @cqh(a = "primary")
    @cqf
    private Boolean primary;
    @cqh(a = "remainingDaysForRenewal")
    @cqf
    private Integer remainingDaysForRenewal;
    @cqh(a = "renewable")
    @cqf
    private Boolean renewable;
    @cqh(a = "renewalDate")
    @cqf
    private String renewalDate;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    @cqf
    private String status;
    @cqh(a = "statusCode")
    @cqf
    private String statusCode;
    @cqh(a = "subscriptionDate")
    @cqf
    private String subscriptionDate;
    @cqh(a = "vas")
    @cqf
    private Boolean vas;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Offer() {
    }

    protected Offer(Parcel parcel) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        this.offerId = parcel.readString();
        this.offerEnName = parcel.readString();
        this.offerArName = parcel.readString();
        this.subscriptionDate = parcel.readString();
        this.renewalDate = parcel.readString();
        this.expiryDate = parcel.readString();
        Boolean bool7 = null;
        if (parcel.readByte() == 0) {
            this.remainingDaysForRenewal = null;
        } else {
            this.remainingDaysForRenewal = Integer.valueOf(parcel.readInt());
        }
        byte readByte = parcel.readByte();
        boolean z = false;
        if (readByte == 0) {
            bool = null;
        } else {
            bool = Boolean.valueOf(readByte == 1);
        }
        this.primary = bool;
        byte readByte2 = parcel.readByte();
        if (readByte2 == 0) {
            bool2 = null;
        } else {
            bool2 = Boolean.valueOf(readByte2 == 1);
        }
        this.main = bool2;
        byte readByte3 = parcel.readByte();
        if (readByte3 == 0) {
            bool3 = null;
        } else {
            bool3 = Boolean.valueOf(readByte3 == 1);
        }
        this.addOn = bool3;
        byte readByte4 = parcel.readByte();
        if (readByte4 == 0) {
            bool4 = null;
        } else {
            bool4 = Boolean.valueOf(readByte4 == 1);
        }
        this.vas = bool4;
        if (parcel.readByte() == 0) {
            this.price = null;
        } else {
            this.price = Double.valueOf(parcel.readDouble());
        }
        byte readByte5 = parcel.readByte();
        if (readByte5 == 0) {
            bool5 = null;
        } else {
            bool5 = Boolean.valueOf(readByte5 == 1);
        }
        this.renewable = bool5;
        this.status = parcel.readString();
        this.statusCode = parcel.readString();
        byte readByte6 = parcel.readByte();
        if (readByte6 == 0) {
            bool6 = null;
        } else {
            bool6 = Boolean.valueOf(readByte6 == 1);
        }
        this.fmc = bool6;
        byte readByte7 = parcel.readByte();
        if (readByte7 != 0) {
            bool7 = Boolean.valueOf(readByte7 == 1 ? true : z);
        }
        this.iptv = bool7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.offerId);
        parcel.writeString(this.offerEnName);
        parcel.writeString(this.offerArName);
        parcel.writeString(this.subscriptionDate);
        parcel.writeString(this.renewalDate);
        parcel.writeString(this.expiryDate);
        int i2 = 0;
        if (this.remainingDaysForRenewal == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.remainingDaysForRenewal.intValue());
        }
        Boolean bool = this.primary;
        parcel.writeByte((byte) (bool == null ? 0 : bool.booleanValue() ? 1 : 2));
        Boolean bool2 = this.main;
        parcel.writeByte((byte) (bool2 == null ? 0 : bool2.booleanValue() ? 1 : 2));
        Boolean bool3 = this.addOn;
        parcel.writeByte((byte) (bool3 == null ? 0 : bool3.booleanValue() ? 1 : 2));
        Boolean bool4 = this.vas;
        parcel.writeByte((byte) (bool4 == null ? 0 : bool4.booleanValue() ? 1 : 2));
        if (this.price == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.price.doubleValue());
        }
        Boolean bool5 = this.renewable;
        parcel.writeByte((byte) (bool5 == null ? 0 : bool5.booleanValue() ? 1 : 2));
        parcel.writeString(this.status);
        parcel.writeString(this.statusCode);
        Boolean bool6 = this.fmc;
        parcel.writeByte((byte) (bool6 == null ? 0 : bool6.booleanValue() ? 1 : 2));
        Boolean bool7 = this.iptv;
        if (bool7 != null) {
            i2 = bool7.booleanValue() ? 1 : 2;
        }
        parcel.writeByte((byte) i2);
    }

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String str) {
        this.offerId = str;
    }

    public String getOfferEnName() {
        return this.offerEnName;
    }

    public void setOfferEnName(String str) {
        this.offerEnName = str;
    }

    public String getOfferArName() {
        return this.offerArName;
    }

    public void setOfferArName(String str) {
        this.offerArName = str;
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

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(String str) {
        this.expiryDate = str;
    }

    public Integer getRemainingDaysForRenewal() {
        return this.remainingDaysForRenewal;
    }

    public void setRemainingDaysForRenewal(Integer num) {
        this.remainingDaysForRenewal = num;
    }

    public Boolean getPrimary() {
        return this.primary;
    }

    public void setPrimary(Boolean bool) {
        this.primary = bool;
    }

    public Boolean getMain() {
        return this.main;
    }

    public void setMain(Boolean bool) {
        this.main = bool;
    }

    public Boolean getAddOn() {
        return this.addOn;
    }

    public void setAddOn(Boolean bool) {
        this.addOn = bool;
    }

    public Boolean getVas() {
        return this.vas;
    }

    public void setVas(Boolean bool) {
        this.vas = bool;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double d) {
        this.price = d;
    }

    public Boolean getRenewable() {
        return this.renewable;
    }

    public void setRenewable(Boolean bool) {
        this.renewable = bool;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String str) {
        this.statusCode = str;
    }

    public Boolean getFmc() {
        return this.fmc;
    }

    public void setFmc(Boolean bool) {
        this.fmc = bool;
    }

    public Boolean getIptv() {
        return this.iptv;
    }

    public void setIptv(Boolean bool) {
        this.iptv = bool;
    }

    public OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }
}
