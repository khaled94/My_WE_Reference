package com.ucare.we.model.ticket;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class QueryTicketResponse implements Parcelable {
    public static final Parcelable.Creator<QueryTicketResponse> CREATOR = new Parcelable.Creator<QueryTicketResponse>() { // from class: com.ucare.we.model.ticket.QueryTicketResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QueryTicketResponse createFromParcel(Parcel parcel) {
            return new QueryTicketResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QueryTicketResponse[] newArray(int i) {
            return new QueryTicketResponse[i];
        }
    };
    @cqh(a = "customerName")
    @cqf
    private String customerName;
    @cqh(a = "fullName")
    @cqf
    private String fullName;
    @cqh(a = "requestNo")
    @cqf
    private String requestNo;
    @cqh(a = "requestStatus")
    @cqf
    private String requestStatus;
    @cqh(a = "serviceNo")
    @cqf
    private String serviceNo;
    @cqh(a = "srTypeNameAr")
    @cqf
    private String srTypeNameAr;
    @cqh(a = "srTypeNameEn")
    @cqf
    private String srTypeNameEn;
    @cqh(a = "statusDescAr")
    @cqf
    private String statusDescAr;
    @cqh(a = "statusDescEn")
    @cqf
    private String statusDescEn;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public QueryTicketResponse() {
    }

    protected QueryTicketResponse(Parcel parcel) {
        this.customerName = parcel.readString();
        this.serviceNo = parcel.readString();
        this.requestNo = parcel.readString();
        this.requestStatus = parcel.readString();
        this.fullName = parcel.readString();
        this.statusDescEn = parcel.readString();
        this.statusDescAr = parcel.readString();
        this.srTypeNameAr = parcel.readString();
        this.srTypeNameEn = parcel.readString();
    }

    public static Parcelable.Creator<QueryTicketResponse> getCREATOR() {
        return CREATOR;
    }

    public String getSrTypeNameEn() {
        return this.srTypeNameEn;
    }

    public void setSrTypeNameEn(String str) {
        this.srTypeNameEn = str;
    }

    public String getSrTypeNameAr() {
        return this.srTypeNameAr;
    }

    public void setSrTypeNameAr(String str) {
        this.srTypeNameAr = str;
    }

    public String getStatusDescEn() {
        return this.statusDescEn;
    }

    public void setStatusDescEn(String str) {
        this.statusDescEn = str;
    }

    public String getStatusDescAr() {
        return this.statusDescAr;
    }

    public void setStatusDescAr(String str) {
        this.statusDescAr = str;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String str) {
        this.customerName = str;
    }

    public String getServiceNo() {
        return this.serviceNo;
    }

    public void setServiceNo(String str) {
        this.serviceNo = str;
    }

    public String getRequestNo() {
        return this.requestNo;
    }

    public void setRequestNo(String str) {
        this.requestNo = str;
    }

    public String getRequestStatus() {
        return this.requestStatus;
    }

    public void setRequestStatus(String str) {
        this.requestStatus = str;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String str) {
        this.fullName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.customerName);
        parcel.writeString(this.serviceNo);
        parcel.writeString(this.requestNo);
        parcel.writeString(this.requestStatus);
        parcel.writeString(this.fullName);
        parcel.writeString(this.statusDescEn);
        parcel.writeString(this.statusDescAr);
        parcel.writeString(this.srTypeNameAr);
        parcel.writeString(this.srTypeNameEn);
    }
}
