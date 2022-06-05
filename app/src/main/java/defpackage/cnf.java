package defpackage;

import android.os.Bundle;
import com.google.firebase.iid.zzak;

/* renamed from: cnf  reason: default package */
/* loaded from: classes2.dex */
public final class cnf extends cnh<Void> {
    public cnf(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cnh
    public final boolean a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cnh
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a((cnf) null);
        } else {
            a(new zzak(4, "Invalid response to one way request"));
        }
    }
}
