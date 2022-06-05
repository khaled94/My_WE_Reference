package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final uw a;

    public UnsupportedApiCallException(uw uwVar) {
        this.a = uwVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.a);
        String.valueOf(valueOf).length();
        return "Missing ".concat(String.valueOf(valueOf));
    }
}
