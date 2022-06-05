package com.ucare.we.model.BalanceTransferHistoryModel;

import com.ucare.we.model.MainRequestsHeader;

/* loaded from: classes2.dex */
public class BalanceTransferHistoryRequest {
    @cqh(a = "body")
    BalanceTransferHistoryRequestBody body;
    @cqh(a = "header")
    private MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public BalanceTransferHistoryRequestBody getBody() {
        return this.body;
    }

    public void setBody(BalanceTransferHistoryRequestBody balanceTransferHistoryRequestBody) {
        this.body = balanceTransferHistoryRequestBody;
    }
}
