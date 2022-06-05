package com.ucare.we.model.PreferedNumberModel;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ViewPreferredNumberResponse {
    @cqh(a = "body")
    private ArrayList<ViewPreferredNumberResponseBody> body;
    @cqh(a = "header")
    private ViewPreferredNumberResponseHeader header;

    public ViewPreferredNumberResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(ViewPreferredNumberResponseHeader viewPreferredNumberResponseHeader) {
        this.header = viewPreferredNumberResponseHeader;
    }

    public ArrayList<ViewPreferredNumberResponseBody> getBody() {
        return this.body;
    }

    public void setBody(ArrayList<ViewPreferredNumberResponseBody> arrayList) {
        this.body = arrayList;
    }
}
