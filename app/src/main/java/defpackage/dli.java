package defpackage;

import io.realm.internal.OsResults;
import io.realm.internal.OsSharedRealm;
import java.lang.ref.WeakReference;

/* renamed from: dli  reason: default package */
/* loaded from: classes2.dex */
public final class dli {
    public OsResults a;
    public WeakReference<a> b;
    public boolean c;
    private OsSharedRealm d;
    private dkr<dli> e;

    /* renamed from: dli$a */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public final void a() {
        this.a.a(this, this.e);
        this.a = null;
        this.e = null;
        this.d.removePendingRow(this);
    }
}
