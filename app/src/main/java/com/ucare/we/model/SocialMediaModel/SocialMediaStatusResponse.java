package com.ucare.we.model.SocialMediaModel;

import com.ucare.we.model.ResponseHeader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SocialMediaStatusResponse {
    @cqh(a = "header")
    ResponseHeader header;
    @cqh(a = "body")
    ArrayList<ProviderStatusObject> providerStatusObjects;

    public ResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseHeader responseHeader) {
        this.header = responseHeader;
    }

    public ArrayList<ProviderStatusObject> getProviderStatusObjects() {
        return this.providerStatusObjects;
    }

    public void setProviderStatusObjects(ArrayList<ProviderStatusObject> arrayList) {
        this.providerStatusObjects = arrayList;
    }
}
