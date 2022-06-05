package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btn  reason: default package */
/* loaded from: classes2.dex */
public final class btn implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ bva f;
    private final /* synthetic */ bsx g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btn(bsx bsxVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, bva bvaVar) {
        this.g = bsxVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar;
        synchronized (this.a) {
            try {
                bozVar = this.g.b;
            } catch (RemoteException e) {
                this.g.q().c.a("Failed to get user properties", bpi.a(this.b), this.c, e);
                this.a.set(Collections.emptyList());
                this.a.notify();
            }
            if (bozVar == null) {
                this.g.q().c.a("Failed to get user properties", bpi.a(this.b), this.c, this.d);
                this.a.set(Collections.emptyList());
                this.a.notify();
                return;
            }
            if (TextUtils.isEmpty(this.b)) {
                this.a.set(bozVar.a(this.c, this.d, this.e, this.f));
            } else {
                this.a.set(bozVar.a(this.b, this.c, this.d, this.e));
            }
            this.g.z();
            this.a.notify();
        }
    }
}
