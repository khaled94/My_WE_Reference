package com.ucare.we.model;

/* loaded from: classes2.dex */
public class BalanceTransferFinalizeResponseBody {
    @cqh(a = "newBalance")
    private float newBalance;
    @cqh(a = "oldBalance")
    private float oldBalance;

    public BalanceTransferFinalizeResponseBody(int i, int i2) {
        this.oldBalance = i;
        this.newBalance = i2;
    }

    public float getOldBalance() {
        return this.oldBalance;
    }

    public void setOldBalance(float f) {
        this.oldBalance = f;
    }

    public float getNewBalance() {
        return this.newBalance;
    }

    public void setNewBalance(int i) {
        this.newBalance = i;
    }
}
