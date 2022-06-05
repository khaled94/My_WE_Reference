package defpackage;

import android.content.Context;
import androidx.core.content.ContextCompat;
import defpackage.it;

/* renamed from: iw  reason: default package */
/* loaded from: classes2.dex */
public final class iw implements iu {
    @Override // defpackage.iu
    public final it a(Context context, it.a aVar) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            return new iv(context, aVar);
        }
        return new je();
    }
}
