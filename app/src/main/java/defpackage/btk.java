package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btk  reason: default package */
/* loaded from: classes2.dex */
public final class btk implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ bva c;
    private final /* synthetic */ bas d;
    private final /* synthetic */ bsx e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btk(bsx bsxVar, String str, String str2, bva bvaVar, bas basVar) {
        this.e = bsxVar;
        this.a = str;
        this.b = str2;
        this.c = bvaVar;
        this.d = basVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            boz bozVar = this.e.b;
            if (bozVar == null) {
                this.e.q().c.a("Failed to get conditional properties", this.a, this.b);
                return;
            }
            arrayList = buv.b(bozVar.a(this.a, this.b, this.c));
            this.e.z();
        } catch (RemoteException e) {
            this.e.q().c.a("Failed to get conditional properties", this.a, this.b, e);
        } finally {
            this.e.o().a(this.d, arrayList);
        }
    }
}
