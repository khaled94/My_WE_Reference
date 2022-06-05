package com.ucare.we.model.BillSummaryModel;

import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class ResponseBillSummaryBody {
    @cqh(a = "amount")
    float amount;
    @cqh(a = "billCycleBeginTime")
    String billCycleBeginTime;
    @cqh(a = "billCycleEndTime")
    String billCycleEndTime;
    @cqh(a = "billCycleId")
    String billCycleId;
    @cqh(a = "dueDate")
    String dueDate;
    @cqh(a = "invoiceDate")
    String invoiceDate;
    @cqh(a = "invoiceNo")
    String invoiceNo;
    @cqh(a = "invoiceURL")
    String invoiceURL;
    @cqh(a = "openAmount")
    float openAmount;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    String status;

    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public void setInvoiceNo(String str) {
        this.invoiceNo = str;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(String str) {
        this.invoiceDate = str;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String str) {
        this.dueDate = str;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float f) {
        this.amount = f;
    }

    public float getOpenAmount() {
        return this.openAmount;
    }

    public void setOpenAmount(float f) {
        this.openAmount = f;
    }

    public String getBillCycleId() {
        return this.billCycleId;
    }

    public void setBillCycleId(String str) {
        this.billCycleId = str;
    }

    public String getBillCycleBeginTime() {
        return this.billCycleBeginTime;
    }

    public void setBillCycleBeginTime(String str) {
        this.billCycleBeginTime = str;
    }

    public String getBillCycleEndTime() {
        return this.billCycleEndTime;
    }

    public void setBillCycleEndTime(String str) {
        this.billCycleEndTime = str;
    }

    public String getInvoiceURL() {
        return this.invoiceURL;
    }

    public void setInvoiceURL(String str) {
        this.invoiceURL = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
