package com.ucare.we.model.AutoRechargeModel;

/* loaded from: classes2.dex */
public class UpdateAutoRechargeRequestBody {
    @cqh(a = "action")
    String action;
    @cqh(a = "amount")
    int amount;
    @cqh(a = "day")
    int day;

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int i) {
        this.amount = i;
    }
}
