package com.google.firebase;

/* loaded from: classes.dex */
public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        aat.a(str, (Object) "Detail message must not be empty");
    }
}
