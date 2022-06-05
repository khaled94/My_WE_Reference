package com.ucare.we.model.AutoRechargeModel;

import com.ucare.we.model.SignInModel.GroupID;

/* loaded from: classes2.dex */
public class GetAutoRechargeDefaultValuesRequestBody extends GroupID {
    @cqh(a = "amount")
    int amount;
    @cqh(a = "day")
    int day;

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
