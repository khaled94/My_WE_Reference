package com.ucare.we.model.AutoPaymentModel;

/* loaded from: classes2.dex */
public class AutoPaymentAddCreditCardFinalizeResponse {
    @cqh(a = "body")
    AutoPaymentAddCreditCardFinalizeResponseBody body;
    @cqh(a = "header")
    AutoPaymentAddCreditCardFinalizeResponseHeader header;

    public AutoPaymentAddCreditCardFinalizeResponseBody getBody() {
        return this.body;
    }

    public void setBody(AutoPaymentAddCreditCardFinalizeResponseBody autoPaymentAddCreditCardFinalizeResponseBody) {
        this.body = autoPaymentAddCreditCardFinalizeResponseBody;
    }

    public AutoPaymentAddCreditCardFinalizeResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(AutoPaymentAddCreditCardFinalizeResponseHeader autoPaymentAddCreditCardFinalizeResponseHeader) {
        this.header = autoPaymentAddCreditCardFinalizeResponseHeader;
    }
}
