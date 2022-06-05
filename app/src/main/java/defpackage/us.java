package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import defpackage.vc;
import defpackage.vf;
import java.util.Collections;
import java.util.List;

/* renamed from: us  reason: default package */
/* loaded from: classes2.dex */
final class us extends vc.a {
    @Override // defpackage.vc.a
    public final /* synthetic */ vc.f a(Context context, Looper looper, aaf aafVar, Object obj, vf.b bVar, vf.c cVar) {
        return new tv(context, looper, aafVar, (GoogleSignInOptions) obj, bVar, cVar);
    }

    @Override // defpackage.vc.e
    public final /* synthetic */ List a() {
        return Collections.emptyList();
    }
}
