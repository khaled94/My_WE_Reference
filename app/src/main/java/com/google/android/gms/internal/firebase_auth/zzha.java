package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzha extends alw {
    private static final Logger a = Logger.getLogger(zzha.class.getName());
    private static final boolean b = ama.a();

    /* loaded from: classes.dex */
    public static class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private zzha() {
    }
}
