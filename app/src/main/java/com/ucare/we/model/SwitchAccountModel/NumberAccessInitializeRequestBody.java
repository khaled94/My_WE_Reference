package com.ucare.we.model.SwitchAccountModel;

/* loaded from: classes2.dex */
public class NumberAccessInitializeRequestBody {
    @cqh(a = "sourceMsisdn")
    private String sourceMsisdn;
    @cqh(a = "targetMsisdn")
    private String targetMsisdn;

    public String getSourceMsisdn() {
        return this.sourceMsisdn;
    }

    public void setSourceMsisdn(String str) {
        this.sourceMsisdn = str;
    }

    public String getTargetMsisdn() {
        return this.targetMsisdn;
    }

    public void setTargetMsisdn(String str) {
        this.targetMsisdn = str;
    }
}
