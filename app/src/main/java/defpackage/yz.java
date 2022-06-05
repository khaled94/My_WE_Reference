package defpackage;

import com.google.android.gms.common.ConnectionResult;
import defpackage.vf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yz  reason: default package */
/* loaded from: classes2.dex */
public final class yz implements vf.c {
    public final int a;
    public final vf b;
    public final vf.c c;
    final /* synthetic */ za d;

    public yz(za zaVar, int i, vf vfVar, vf.c cVar) {
        this.d = zaVar;
        this.a = i;
        this.b = vfVar;
        this.c = cVar;
    }

    @Override // defpackage.vz
    public final void a(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        String.valueOf(valueOf).length();
        "beginFailureResolution for ".concat(String.valueOf(valueOf));
        this.d.b(connectionResult, this.a);
    }
}
