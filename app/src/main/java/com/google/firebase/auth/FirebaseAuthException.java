package com.google.firebase.auth;

import com.google.firebase.FirebaseException;

/* loaded from: classes.dex */
public class FirebaseAuthException extends FirebaseException {
    private final String a;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        this.a = aat.a(str);
    }
}
