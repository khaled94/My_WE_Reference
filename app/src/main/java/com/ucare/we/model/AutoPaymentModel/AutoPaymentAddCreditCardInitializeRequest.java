package com.ucare.we.model.AutoPaymentModel;

/* loaded from: classes2.dex */
public class AutoPaymentAddCreditCardInitializeRequest {
    @cqh(a = "body")
    AutoPaymentAddCreditCardInitializeRequestBody body;
    @cqh(a = "header")
    AutoPaymentAddCreditCardInitializeRequestHeader header;

    public AutoPaymentAddCreditCardInitializeRequestBody getBody() {
        return this.body;
    }

    public void setBody(AutoPaymentAddCreditCardInitializeRequestBody autoPaymentAddCreditCardInitializeRequestBody) {
        this.body = autoPaymentAddCreditCardInitializeRequestBody;
    }

    public AutoPaymentAddCreditCardInitializeRequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(AutoPaymentAddCreditCardInitializeRequestHeader autoPaymentAddCreditCardInitializeRequestHeader) {
        this.header = autoPaymentAddCreditCardInitializeRequestHeader;
    }
}
