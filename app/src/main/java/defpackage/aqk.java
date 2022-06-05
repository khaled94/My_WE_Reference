package defpackage;

import android.os.Binder;

/* renamed from: aqk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aqk {
    public static <V> V a(aqj<V> aqjVar) {
        try {
            return aqjVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return aqjVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
