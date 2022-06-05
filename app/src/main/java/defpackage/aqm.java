package defpackage;

import android.content.Context;
import androidx.core.content.PermissionChecker;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aqm  reason: default package */
/* loaded from: classes.dex */
public final class aqm implements aqi {
    static aqm a;
    final Context b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqm a(Context context) {
        aqm aqmVar;
        synchronized (aqm.class) {
            if (a == null) {
                a = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new aqm(context) : new aqm();
            }
            aqmVar = a;
        }
        return aqmVar;
    }

    private aqm(Context context) {
        this.b = context;
        context.getContentResolver().registerContentObserver(aqc.a, true, new aqo());
    }

    private aqm() {
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final String a(String str) {
        if (this.b == null) {
            return null;
        }
        try {
            return (String) aqk.a(new aqj(this, str) { // from class: aql
                private final aqm a;
                private final String b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                    this.b = str;
                }

                @Override // defpackage.aqj
                public final Object a() {
                    aqm aqmVar = this.a;
                    return aqc.a(aqmVar.b.getContentResolver(), this.b);
                }
            });
        } catch (SecurityException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Unable to read GServices for: ".concat(valueOf);
            } else {
                new String("Unable to read GServices for: ");
            }
            return null;
        }
    }
}
