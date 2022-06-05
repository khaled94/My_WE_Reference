package com.ucare.we.model.AutoPaymentModel;

/* loaded from: classes2.dex */
public class AutoPaymentAddCreditCardFinalizeRequestBody {
    @cqh(a = "confirmationCode")
    String confirmationCode;
    @cqh(a = "topgManageCCTransactionId")
    String topgManageCCTransactionId;
    @cqh(a = "validateConfirmation")
    boolean validateConfirmation;

    public boolean isValidateConfirmation() {
        return this.validateConfirmation;
    }

    public void setValidateConfirmation(boolean z) {
        this.validateConfirmation = z;
    }

    public String getTopgManageCCTransactionId() {
        return this.topgManageCCTransactionId;
    }

    public void setTopgManageCCTransactionId(String str) {
        this.topgManageCCTransactionId = str;
    }

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    public void setConfirmationCode(String str) {
        this.confirmationCode = str;
    }
}
