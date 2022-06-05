package com.google.android.gms.common;

/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {
    private final int a;

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.a = i;
    }
}
