package com.ucare.we.model.AutoPaymentModel;

import com.ucare.we.model.SignInModel.GroupID;

/* loaded from: classes2.dex */
public class AutoPaymentAddCreditCardInitializeRequestBody extends GroupID {
    @cqh(a = "autoRechargeAmount")
    private int autoRechargeAmount;
    @cqh(a = "autoRechargeDay")
    private int autoRechargeDay;
    @cqh(a = "operationType")
    private String operationType;
    @cqh(a = "redirectionURL")
    private String redirectionURL;

    public int getAutoRechargeDay() {
        return this.autoRechargeDay;
    }

    public void setAutoRechargeDay(int i) {
        this.autoRechargeDay = i;
    }

    public int getAutoRechargeAmount() {
        return this.autoRechargeAmount;
    }

    public void setAutoRechargeAmount(int i) {
        this.autoRechargeAmount = i;
    }

    public String getOperationType() {
        return this.operationType;
    }

    public void setOperationType(String str) {
        this.operationType = str;
    }

    public String getRedirectionURL() {
        return this.redirectionURL;
    }

    public void setRedirectionURL(String str) {
        this.redirectionURL = str;
    }
}
