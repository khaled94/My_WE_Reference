package defpackage;

import io.realm.internal.OsSharedRealm;
import io.realm.log.RealmLog;
import java.io.Closeable;

/* renamed from: dkl  reason: default package */
/* loaded from: classes2.dex */
public abstract class dkl implements Closeable {
    static final dlm a = dlm.a();
    public static final b e = new b();
    final long b;
    protected final dks c;
    public OsSharedRealm d;
    private dkq f;
    private boolean g;

    /* renamed from: dkl$a */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    public String a() {
        return this.c.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        dkq dkqVar = this.f;
        if (dkqVar != null) {
            dkqVar.a(this);
        } else {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f = null;
        OsSharedRealm osSharedRealm = this.d;
        if (osSharedRealm == null || !this.g) {
            return;
        }
        osSharedRealm.close();
        this.d = null;
    }

    protected void finalize() throws Throwable {
        OsSharedRealm osSharedRealm;
        if (this.g && (osSharedRealm = this.d) != null && !osSharedRealm.isClosed()) {
            RealmLog.a("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.c.b);
            dkq dkqVar = this.f;
            if (dkqVar != null && !dkqVar.a.getAndSet(true)) {
                dkq.b.add(dkqVar);
            }
        }
        super.finalize();
    }

    /* renamed from: dkl$b */
    /* loaded from: classes2.dex */
    public static final class b extends ThreadLocal<a> {
        b() {
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ a initialValue() {
            return new a();
        }
    }
}
