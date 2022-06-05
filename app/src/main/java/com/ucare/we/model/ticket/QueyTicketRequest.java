package com.ucare.we.model.ticket;

import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class QueyTicketRequest {
    @cqh(a = "currentPageNo")
    @cqf
    private String currentPageNo;
    @cqh(a = "endTime")
    @cqf
    private String endTime;
    @cqh(a = "pageLength")
    @cqf
    private String pageLength;
    @cqh(a = "requestNo")
    @cqf
    private String requestNo;
    @cqh(a = "serviceNo")
    @cqf
    private String serviceNo;
    @cqh(a = "startTime")
    @cqf
    private String startTime;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    @cqf
    private String status;

    public String getRequestNo() {
        return this.requestNo;
    }

    public void setRequestNo(String str) {
        this.requestNo = str;
    }

    public String getServiceNo() {
        return this.serviceNo;
    }

    public void setServiceNo(String str) {
        this.serviceNo = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public String getPageLength() {
        return this.pageLength;
    }

    public void setPageLength(String str) {
        this.pageLength = str;
    }

    public String getCurrentPageNo() {
        return this.currentPageNo;
    }

    public void setCurrentPageNo(String str) {
        this.currentPageNo = str;
    }
}
