package com.ucare.we.model.AutoPaymentModel;

/* loaded from: classes2.dex */
public class AutoPaymentAddCreditCardFinalizeRequest {
    @cqh(a = "body")
    AutoPaymentAddCreditCardFinalizeRequestBody body;
    @cqh(a = "header")
    AutoPaymentAddCreditCardFinalizeRequestHeader header;

    public AutoPaymentAddCreditCardFinalizeRequestBody getBody() {
        return this.body;
    }

    public void setBody(AutoPaymentAddCreditCardFinalizeRequestBody autoPaymentAddCreditCardFinalizeRequestBody) {
        this.body = autoPaymentAddCreditCardFinalizeRequestBody;
    }

    public AutoPaymentAddCreditCardFinalizeRequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(AutoPaymentAddCreditCardFinalizeRequestHeader autoPaymentAddCreditCardFinalizeRequestHeader) {
        this.header = autoPaymentAddCreditCardFinalizeRequestHeader;
    }
}
