package defpackage;

import android.os.Looper;

/* renamed from: dll  reason: default package */
/* loaded from: classes2.dex */
public final class dll implements dky {
    public static boolean a = false;
    private final Looper b = Looper.myLooper();
    private final boolean c;

    public dll() {
        String name = Thread.currentThread().getName();
        this.c = name != null && name.startsWith("IntentService[");
    }

    @Override // defpackage.dky
    public final boolean a() {
        return c() && !this.c;
    }

    @Override // defpackage.dky
    public final void b() {
        if (!c()) {
            throw new IllegalStateException("");
        }
        if (this.c) {
            throw new IllegalStateException("");
        }
    }

    private boolean c() {
        return this.b != null;
    }
}
