package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: acg  reason: default package */
/* loaded from: classes.dex */
public abstract class acg extends acp<Boolean> {
    public final int a;
    public final Bundle b;
    final /* synthetic */ aad c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acg(aad aadVar, int i, Bundle bundle) {
        super(aadVar, Boolean.TRUE);
        this.c = aadVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected abstract boolean b();

    @Override // defpackage.acp
    protected final /* synthetic */ void a() {
        PendingIntent pendingIntent = null;
        if (this.a == 0) {
            if (b()) {
                return;
            }
            this.c.a(1, (int) null);
            a(new ConnectionResult(8, null));
            return;
        }
        this.c.a(1, (int) null);
        Bundle bundle = this.b;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        a(new ConnectionResult(this.a, pendingIntent));
    }
}
