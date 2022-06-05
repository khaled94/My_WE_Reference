package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btl  reason: default package */
/* loaded from: classes2.dex */
public final class btl implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ bva e;
    private final /* synthetic */ bsx f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btl(bsx bsxVar, AtomicReference atomicReference, String str, String str2, String str3, bva bvaVar) {
        this.f = bsxVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar;
        synchronized (this.a) {
            try {
                bozVar = this.f.b;
            } catch (RemoteException e) {
                this.f.q().c.a("Failed to get conditional properties", bpi.a(this.b), this.c, e);
                this.a.set(Collections.emptyList());
                this.a.notify();
            }
            if (bozVar == null) {
                this.f.q().c.a("Failed to get conditional properties", bpi.a(this.b), this.c, this.d);
                this.a.set(Collections.emptyList());
                this.a.notify();
                return;
            }
            if (TextUtils.isEmpty(this.b)) {
                this.a.set(bozVar.a(this.c, this.d, this.e));
            } else {
                this.a.set(bozVar.a(this.b, this.c, this.d));
            }
            this.f.z();
            this.a.notify();
        }
    }
}
