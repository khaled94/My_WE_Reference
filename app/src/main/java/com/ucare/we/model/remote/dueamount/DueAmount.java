package com.ucare.we.model.remote.dueamount;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class DueAmount implements Parcelable {
    public static final Parcelable.Creator<DueAmount> CREATOR = new Parcelable.Creator<DueAmount>() { // from class: com.ucare.we.model.remote.dueamount.DueAmount.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DueAmount createFromParcel(Parcel parcel) {
            return new DueAmount(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DueAmount[] newArray(int i) {
            return new DueAmount[i];
        }
    };
    @cqh(a = "amount")
    @cqf
    private Double amount;
    @cqh(a = "display")
    private Boolean display;
    @cqh(a = "offers")
    @cqf
    private ArrayList<Offer> offers;
    @cqh(a = "otherDues")
    @cqf
    private Double otherDues;
    @cqh(a = "tax")
    @cqf
    private Double tax;
    @cqh(a = "taxAmount")
    @cqf
    private Double taxAmount;
    @cqh(a = "taxOperand")
    @cqf
    private Double taxOperand;
    @cqh(a = "totalAmount")
    @cqf
    private Double totalAmount;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected DueAmount(Parcel parcel) {
        this.offers = null;
        if (parcel.readByte() == 0) {
            this.tax = null;
        } else {
            this.tax = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.taxOperand = null;
        } else {
            this.taxOperand = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.amount = null;
        } else {
            this.amount = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.taxAmount = null;
        } else {
            this.taxAmount = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.otherDues = null;
        } else {
            this.otherDues = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.totalAmount = null;
        } else {
            this.totalAmount = Double.valueOf(parcel.readDouble());
        }
        this.offers = parcel.createTypedArrayList(Offer.CREATOR);
    }

    public static Parcelable.Creator<DueAmount> getCREATOR() {
        return CREATOR;
    }

    public Double getTax() {
        return this.tax;
    }

    public void setTax(Double d) {
        this.tax = d;
    }

    public Double getTaxOperand() {
        return this.taxOperand;
    }

    public void setTaxOperand(Double d) {
        this.taxOperand = d;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double d) {
        this.amount = d;
    }

    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(Double d) {
        this.taxAmount = d;
    }

    public Double getOtherDues() {
        return this.otherDues;
    }

    public void setOtherDues(Double d) {
        this.otherDues = d;
    }

    public Double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(Double d) {
        this.totalAmount = d;
    }

    public ArrayList<Offer> getOffers() {
        return this.offers;
    }

    public void setOffers(ArrayList<Offer> arrayList) {
        this.offers = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.tax == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.tax.doubleValue());
        }
        if (this.taxOperand == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.taxOperand.doubleValue());
        }
        if (this.amount == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.amount.doubleValue());
        }
        if (this.taxAmount == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.taxAmount.doubleValue());
        }
        if (this.otherDues == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.otherDues.doubleValue());
        }
        if (this.totalAmount == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.totalAmount.doubleValue());
        }
        parcel.writeTypedList(this.offers);
    }

    public Boolean getDisplay() {
        return this.display;
    }

    public void setDisplay(Boolean bool) {
        this.display = bool;
    }
}
