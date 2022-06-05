package com.ucare.we.model.AutoPaymentModel;

/* loaded from: classes2.dex */
public class AutoPaymentAddCreditCardInitializeResponse {
    @cqh(a = "body")
    AutoPaymentAddCreditCardInitializeResponseBody body;
    @cqh(a = "header")
    AutoPaymentAddCreditCardInitializeResponseHeader header;

    public AutoPaymentAddCreditCardInitializeResponseBody getBody() {
        return this.body;
    }

    public void setBody(AutoPaymentAddCreditCardInitializeResponseBody autoPaymentAddCreditCardInitializeResponseBody) {
        this.body = autoPaymentAddCreditCardInitializeResponseBody;
    }

    public AutoPaymentAddCreditCardInitializeResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(AutoPaymentAddCreditCardInitializeResponseHeader autoPaymentAddCreditCardInitializeResponseHeader) {
        this.header = autoPaymentAddCreditCardInitializeResponseHeader;
    }
}
