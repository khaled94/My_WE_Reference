package com.android.volley;

/* loaded from: classes.dex */
public class VolleyError extends Exception {
    public final ar a;
    public long b;

    public VolleyError() {
        this.a = null;
    }

    public VolleyError(ar arVar) {
        this.a = arVar;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.a = null;
    }
}
