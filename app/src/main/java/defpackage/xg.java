package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import defpackage.vc;
import defpackage.vq;

/* renamed from: xg  reason: default package */
/* loaded from: classes2.dex */
public interface xg {
    <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t);

    void a();

    void a(int i);

    void a(Bundle bundle);

    void a(ConnectionResult connectionResult, vc<?> vcVar, boolean z);

    <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t);

    void b();

    boolean d();
}
