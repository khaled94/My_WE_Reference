package defpackage;

/* renamed from: ebi  reason: default package */
/* loaded from: classes2.dex */
public abstract class ebi implements Runnable {
    protected final String e;

    protected abstract void b();

    public ebi(String str, Object... objArr) {
        this.e = ebk.a(str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.e);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
