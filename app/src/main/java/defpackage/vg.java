package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.vi;
import java.util.concurrent.TimeUnit;

/* renamed from: vg  reason: default package */
/* loaded from: classes2.dex */
public abstract class vg<R extends vi> {

    /* renamed from: vg$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Status status);
    }

    public abstract R a(long j, TimeUnit timeUnit);

    public void a(a aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(vj<? super R> vjVar);
}
