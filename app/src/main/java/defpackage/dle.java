package defpackage;

import io.realm.internal.NativeObjectReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: dle  reason: default package */
/* loaded from: classes2.dex */
public final class dle {
    private static final ReferenceQueue<dlf> b = new ReferenceQueue<>();
    private static final Thread c = new Thread(new dlc(b));
    public static final dle a = new dle();

    static {
        c.setName("RealmFinalizingDaemon");
        c.start();
    }

    public final void a(dlf dlfVar) {
        new NativeObjectReference(this, dlfVar, b);
    }
}
