package com.ucare.we.model.QuotaTransferModel;

import com.ucare.we.model.BalanceTransferFinalizeRequestBody;
import com.ucare.we.model.MainRequestsHeader;

/* loaded from: classes2.dex */
public class QuotaTransferFinalizeRequest {
    @cqh(a = "body")
    BalanceTransferFinalizeRequestBody body;
    @cqh(a = "header")
    MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public BalanceTransferFinalizeRequestBody getBody() {
        return this.body;
    }

    public void setBody(BalanceTransferFinalizeRequestBody balanceTransferFinalizeRequestBody) {
        this.body = balanceTransferFinalizeRequestBody;
    }
}
