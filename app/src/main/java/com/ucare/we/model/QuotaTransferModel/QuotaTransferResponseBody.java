package com.ucare.we.model.QuotaTransferModel;

/* loaded from: classes2.dex */
public class QuotaTransferResponseBody {
    @cqh(a = "currentAmount")
    String currentAmount;
    @cqh(a = "oldAmount")
    String oldAmount;

    public String getOldAmount() {
        return this.oldAmount;
    }

    public void setOldAmount(String str) {
        this.oldAmount = str;
    }

    public String getCurrentAmount() {
        return this.currentAmount;
    }

    public void setCurrentAmount(String str) {
        this.currentAmount = str;
    }
}
