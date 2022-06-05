package com.ucare.we.model.BalanceTransferHistoryModel;

import com.ucare.we.model.Header;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class BalanceTransferHistoryResponse {
    @cqh(a = "body")
    public ArrayList<BalanceTransferHistoryItem> body;
    @cqh(a = "header")
    public Header header;

    public Header getHeader() {
        return this.header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public ArrayList<BalanceTransferHistoryItem> getBody() {
        return this.body;
    }

    public void setBody(ArrayList<BalanceTransferHistoryItem> arrayList) {
        this.body = arrayList;
    }
}
