package com.ucare.we.model.ticket;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TroubleTicketsResponseTypes {
    @cqh(a = "broadbandTroubleTicket")
    @cqf
    private ArrayList<Category> ADSLCategories = null;
    @cqh(a = "mobileTroubleTicket")
    @cqf
    private ArrayList<Category> MobileCategories = null;
    @cqh(a = "mobileServiceRequest")
    @cqf
    private ArrayList<Category> mobileServiceRequest = null;
    @cqh(a = "broadbandServiceRequest")
    @cqf
    private ArrayList<Category> broadbandServiceRequest = null;
    @cqh(a = "requestDevice")
    @cqf
    private ArrayList<Category> requestDeviceArrayList = null;
    @cqh(a = "anonymousServiceRequest")
    @cqf
    private ArrayList<Category> anonymousServiceRequestArrayList = null;

    public ArrayList<Category> getRequestDeviceArrayList() {
        return this.requestDeviceArrayList;
    }

    public void setRequestDeviceArrayList(ArrayList<Category> arrayList) {
        this.requestDeviceArrayList = arrayList;
    }

    public ArrayList<Category> getAnonymousServiceRequestArrayList() {
        return this.anonymousServiceRequestArrayList;
    }

    public void setAnonymousServiceRequestArrayList(ArrayList<Category> arrayList) {
        this.anonymousServiceRequestArrayList = arrayList;
    }

    public ArrayList<Category> getADSLCategories() {
        return this.ADSLCategories;
    }

    public void setADSLCategories(ArrayList<Category> arrayList) {
        this.ADSLCategories = arrayList;
    }

    public ArrayList<Category> getMobileCategories() {
        return this.MobileCategories;
    }

    public void setMobileCategories(ArrayList<Category> arrayList) {
        this.MobileCategories = arrayList;
    }

    public ArrayList<Category> getMobileServiceRequest() {
        return this.mobileServiceRequest;
    }

    public void setMobileServiceRequest(ArrayList<Category> arrayList) {
        this.mobileServiceRequest = arrayList;
    }

    public ArrayList<Category> getBroadbandServiceRequest() {
        return this.broadbandServiceRequest;
    }

    public void setBroadbandServiceRequest(ArrayList<Category> arrayList) {
        this.broadbandServiceRequest = arrayList;
    }
}
