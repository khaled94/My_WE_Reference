package com.android.volley;

import android.content.Intent;

/* loaded from: classes.dex */
public class AuthFailureError extends VolleyError {
    private Intent c;

    public AuthFailureError() {
    }

    public AuthFailureError(ar arVar) {
        super(arVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.c != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
