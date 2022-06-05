package com.google.firebase.auth;

/* loaded from: classes.dex */
public final class FirebaseAuthWeakPasswordException extends FirebaseAuthInvalidCredentialsException {
    private final String a;

    public FirebaseAuthWeakPasswordException(String str, String str2, String str3) {
        super(str, str2);
        this.a = str3;
    }
}
