package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import defpackage.vf;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: za  reason: default package */
/* loaded from: classes2.dex */
public final class za extends zf {
    private final SparseArray<yz> b = new SparseArray<>();

    private za(vv vvVar) {
        super(vvVar, ux.a());
        this.a.a("AutoManageHelper", this);
    }

    private final yz b(int i) {
        if (this.b.size() <= i) {
            return null;
        }
        SparseArray<yz> sparseArray = this.b;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    public static za b(vu vuVar) {
        vv a = a(vuVar);
        za zaVar = (za) a.a("AutoManageHelper", za.class);
        return zaVar != null ? zaVar : new za(a);
    }

    public final void a(int i) {
        yz yzVar = this.b.get(i);
        this.b.remove(i);
        if (yzVar != null) {
            yzVar.b.b(yzVar);
            yzVar.b.d();
        }
    }

    public final void a(int i, vf vfVar, vf.c cVar) {
        aat.a(vfVar, "GoogleApiClient instance cannot be null");
        boolean z = this.b.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        aat.b(z, sb.toString());
        zc zcVar = this.d.get();
        boolean z2 = this.c;
        String valueOf = String.valueOf(zcVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        yz yzVar = new yz(this, i, vfVar, cVar);
        vfVar.a(yzVar);
        this.b.put(i, yzVar);
        if (!this.c || zcVar != null) {
            return;
        }
        "connecting ".concat(vfVar.toString());
        vfVar.c();
    }

    @Override // defpackage.zf
    protected final void a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        yz yzVar = this.b.get(i);
        if (yzVar == null) {
            return;
        }
        a(i);
        vf.c cVar = yzVar.c;
        if (cVar == null) {
            return;
        }
        cVar.a(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.b.size(); i++) {
            yz b = b(i);
            if (b != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(b.a);
                printWriter.println(":");
                b.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // defpackage.zf, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c() {
        super.c();
        boolean z = this.c;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        if (this.d.get() == null) {
            for (int i = 0; i < this.b.size(); i++) {
                yz b = b(i);
                if (b != null) {
                    b.b.c();
                }
            }
        }
    }

    @Override // defpackage.zf, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        super.d();
        for (int i = 0; i < this.b.size(); i++) {
            yz b = b(i);
            if (b != null) {
                b.b.d();
            }
        }
    }

    @Override // defpackage.zf
    protected final void e() {
        for (int i = 0; i < this.b.size(); i++) {
            yz b = b(i);
            if (b != null) {
                b.b.c();
            }
        }
    }
}
