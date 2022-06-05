package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: zp  reason: default package */
/* loaded from: classes2.dex */
final class zp implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ zq c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zp(zq zqVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = zqVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zq zqVar = this.c;
        i = zqVar.c;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            bundle = zqVar.d;
            if (bundle != null) {
                bundle3 = zqVar.d;
                bundle2 = bundle3.getBundle(this.b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.a(bundle2);
        }
        i2 = this.c.c;
        if (i2 >= 2) {
            this.a.c();
        }
        i3 = this.c.c;
        if (i3 >= 3) {
            this.a.b();
        }
        i4 = this.c.c;
        if (i4 >= 4) {
            this.a.d();
        }
        i5 = this.c.c;
        if (i5 >= 5) {
        }
    }
}
