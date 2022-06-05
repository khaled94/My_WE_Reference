package com.ucare.we.model.AutoPaymentModel;

/* loaded from: classes2.dex */
public class AutoPaymentAddCreditCardInitializeResponseBody {
    @cqh(a = "ccIdentifier")
    String ccIdentifier;
    @cqh(a = "hashcode")
    String hashcode;
    @cqh(a = "maskedNumber")
    String maskedMsisdn;
    @cqh(a = "topgManageCCTransactionId")
    String topgManageCCTransactionId;

    public String getTopgManageCCTransactionId() {
        return this.topgManageCCTransactionId;
    }

    public void setTopgManageCCTransactionId(String str) {
        this.topgManageCCTransactionId = str;
    }

    public String getHashcode() {
        return this.hashcode;
    }

    public void setHashcode(String str) {
        this.hashcode = str;
    }

    public String getCcIdentifier() {
        return this.ccIdentifier;
    }

    public void setCcIdentifier(String str) {
        this.ccIdentifier = str;
    }

    public String getMaskedMsisdn() {
        return this.maskedMsisdn;
    }

    public void setMaskedMsisdn(String str) {
        this.maskedMsisdn = str;
    }
}
