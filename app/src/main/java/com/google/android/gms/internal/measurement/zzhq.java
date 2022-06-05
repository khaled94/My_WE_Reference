package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzhq extends RuntimeException {
    private final List<String> a = null;

    public zzhq() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
