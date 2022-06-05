package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics a;
    private final bql b;
    private final bbb c;
    private final boolean d;
    private final Object e;

    public static FirebaseAnalytics getInstance(Context context) {
        if (a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (a == null) {
                    if (bbb.b(context)) {
                        a = new FirebaseAnalytics(bbb.a(context));
                    } else {
                        a = new FirebaseAnalytics(bql.a(context, (baz) null));
                    }
                }
            }
        }
        return a;
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.d) {
            bbb bbbVar = this.c;
            bbbVar.a(new aop(bbbVar, activity, str, str2));
        } else if (!bve.a()) {
            this.b.q().f.a("setCurrentScreen must be called from the main thread");
        } else {
            this.b.h().a(activity, str, str2);
        }
    }

    private FirebaseAnalytics(bql bqlVar) {
        aat.a(bqlVar);
        this.b = bqlVar;
        this.c = null;
        this.d = false;
        this.e = new Object();
    }

    private FirebaseAnalytics(bbb bbbVar) {
        aat.a(bbbVar);
        this.b = null;
        this.c = bbbVar;
        this.d = true;
        this.e = new Object();
    }

    public final String getFirebaseInstanceId() {
        FirebaseInstanceId.a().b();
        return FirebaseInstanceId.d();
    }

    public static bsk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        bbb a2;
        if (bbb.b(context) && (a2 = bbb.a(context, bundle)) != null) {
            return new chf(a2);
        }
        return null;
    }
}
