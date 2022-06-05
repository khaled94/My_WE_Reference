package com.google.android.gms.measurement.module;

import android.content.Context;

/* loaded from: classes.dex */
public class Analytics {
    private static volatile Analytics a;
    private final bql b;

    public static Analytics getInstance(Context context) {
        if (a == null) {
            synchronized (Analytics.class) {
                if (a == null) {
                    a = new Analytics(bql.a(context, (baz) null));
                }
            }
        }
        return a;
    }

    private Analytics(bql bqlVar) {
        aat.a(bqlVar);
        this.b = bqlVar;
    }
}
