package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yk  reason: default package */
/* loaded from: classes2.dex */
public final class yk implements Runnable {
    final /* synthetic */ yn a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yk(yn ynVar) {
        this.a = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym ymVar;
        ymVar = this.a.h;
        ymVar.b(new ConnectionResult(4));
    }
}
