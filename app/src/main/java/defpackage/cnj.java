package defpackage;

import android.os.Bundle;

/* renamed from: cnj  reason: default package */
/* loaded from: classes2.dex */
final class cnj extends cnh<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public cnj(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cnh
    public final boolean a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cnh
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a((cnj) bundle2);
    }
}
