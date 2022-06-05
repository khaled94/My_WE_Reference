package com.ucare.we.model.FamilyNumberModel;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ViewFamilyNumberResponse {
    @cqh(a = "body")
    private ArrayList<ViewFamilyNumberResponseBody> body;
    @cqh(a = "header")
    private ViewFamilyNumberResponseHeader header;

    public ViewFamilyNumberResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(ViewFamilyNumberResponseHeader viewFamilyNumberResponseHeader) {
        this.header = viewFamilyNumberResponseHeader;
    }

    public ArrayList<ViewFamilyNumberResponseBody> getBody() {
        return this.body;
    }

    public void setBody(ArrayList<ViewFamilyNumberResponseBody> arrayList) {
        this.body = arrayList;
    }
}
