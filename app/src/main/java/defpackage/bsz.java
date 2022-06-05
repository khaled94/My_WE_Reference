package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsz  reason: default package */
/* loaded from: classes2.dex */
public final class bsz implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ bva b;
    private final /* synthetic */ bsx c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bsz(bsx bsxVar, AtomicReference atomicReference, bva bvaVar) {
        this.c = bsxVar;
        this.a = atomicReference;
        this.b = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar;
        synchronized (this.a) {
            try {
                bozVar = this.c.b;
            } catch (RemoteException e) {
                this.c.q().c.a("Failed to get app instance id", e);
                this.a.notify();
            }
            if (bozVar == null) {
                this.c.q().c.a("Failed to get app instance id");
                this.a.notify();
                return;
            }
            this.a.set(bozVar.c(this.b));
            String str = (String) this.a.get();
            if (str != null) {
                this.c.e().a(str);
                this.c.r().k.a(str);
            }
            this.c.z();
            this.a.notify();
        }
    }
}
