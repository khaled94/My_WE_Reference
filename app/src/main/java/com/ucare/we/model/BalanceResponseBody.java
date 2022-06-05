package com.ucare.we.model;

/* loaded from: classes2.dex */
public class BalanceResponseBody {
    @cqh(a = "balance")
    private float balance;
    @cqh(a = "msisdn")
    private String msisdn;

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(long j) {
        this.balance = (float) j;
    }
}
