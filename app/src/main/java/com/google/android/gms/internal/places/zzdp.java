package com.google.android.gms.internal.places;

import java.util.List;

/* loaded from: classes.dex */
public final class zzdp extends RuntimeException {
    private final List<String> a = null;

    public zzdp() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
