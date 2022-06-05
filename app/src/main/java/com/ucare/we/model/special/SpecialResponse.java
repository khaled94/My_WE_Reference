package com.ucare.we.model.special;

import com.ucare.we.model.Header;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SpecialResponse {
    @cqh(a = "body")
    private ArrayList<SpecialList> mBody;
    @cqh(a = "header")
    private Header mHeader;

    public ArrayList<SpecialList> getBody() {
        return this.mBody;
    }

    public void setBody(ArrayList<SpecialList> arrayList) {
        this.mBody = arrayList;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public void setHeader(Header header) {
        this.mHeader = header;
    }
}
