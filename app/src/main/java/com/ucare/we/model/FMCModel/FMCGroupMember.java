package com.ucare.we.model.FMCModel;

import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class FMCGroupMember {
    @cqh(a = "joinTime")
    String joinTime;
    @cqh(a = "name")
    String name;
    @cqh(a = "networkType")
    String networkType;
    @cqh(a = "paidType")
    String paidType;
    @cqh(a = "serviceNumber")
    String serviceNumber;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    String status;

    public String getServiceNumber() {
        return this.serviceNumber;
    }

    public void setServiceNumber(String str) {
        this.serviceNumber = str;
    }

    public String getPaidType() {
        return this.paidType;
    }

    public void setPaidType(String str) {
        this.paidType = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getJoinTime() {
        return this.joinTime;
    }

    public void setJoinTime(String str) {
        this.joinTime = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public void setNetworkType(String str) {
        this.networkType = str;
    }
}
