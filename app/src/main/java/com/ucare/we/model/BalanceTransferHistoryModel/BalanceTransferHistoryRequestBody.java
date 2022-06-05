package com.ucare.we.model.BalanceTransferHistoryModel;

/* loaded from: classes2.dex */
public class BalanceTransferHistoryRequestBody {
    @cqh(a = "endDate")
    String endDate;
    @cqh(a = "startDate")
    String startDate;

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String str) {
        this.endDate = str;
    }
}
