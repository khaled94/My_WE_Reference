package com.ucare.we.model.extras;

import com.ucare.we.model.Header;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ExtrasResponse {
    @cqh(a = "body")
    private ArrayList<ExtrasList> mBody;
    @cqh(a = "header")
    private Header mHeader;

    public ArrayList<ExtrasList> getBody() {
        return this.mBody;
    }

    public void setBody(ArrayList<ExtrasList> arrayList) {
        this.mBody = arrayList;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public void setHeader(Header header) {
        this.mHeader = header;
    }
}
