package com.ucare.we.model.BalanceTransferHistoryModel;

/* loaded from: classes2.dex */
public class BalanceTransferHistoryItem {
    @cqh(a = "amount")
    String amount;
    @cqh(a = "date")
    String date;
    @cqh(a = "msisdn")
    String msisdn;

    public String getDate() {
        return this.date;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public String getMsisnd() {
        return this.msisdn;
    }

    public void setMsisnd(String str) {
        this.msisdn = str;
    }
}
