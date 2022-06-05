package defpackage;

import defpackage.au;
import java.io.UnsupportedEncodingException;

/* renamed from: bk  reason: default package */
/* loaded from: classes2.dex */
public abstract class bk<T> extends as<T> {
    private static final String m = String.format("application/json; charset=%s", "utf-8");
    private final Object n = new Object();
    private au.b<T> o;
    private final String p;

    @Override // defpackage.as
    public abstract au<T> a(ar arVar);

    public bk(int i, String str, String str2, au.b<T> bVar, au.a aVar) {
        super(i, str, aVar);
        this.o = bVar;
        this.p = str2;
    }

    @Override // defpackage.as
    public final void a() {
        super.a();
        synchronized (this.n) {
            this.o = null;
        }
    }

    @Override // defpackage.as
    public final void a(T t) {
        au.b<T> bVar;
        synchronized (this.n) {
            bVar = this.o;
        }
        if (bVar != null) {
            bVar.onResponse(t);
        }
    }

    @Override // defpackage.as
    @Deprecated
    public final byte[] e() {
        return g();
    }

    @Override // defpackage.as
    public final String f() {
        return m;
    }

    @Override // defpackage.as
    public final byte[] g() {
        try {
            if (this.p != null) {
                return this.p.getBytes("utf-8");
            }
            return null;
        } catch (UnsupportedEncodingException unused) {
            ax.e("Unsupported Encoding while trying to get the bytes of %s using %s", this.p, "utf-8");
            return null;
        }
    }

    @Override // defpackage.as
    @Deprecated
    public final String d() {
        return m;
    }
}
