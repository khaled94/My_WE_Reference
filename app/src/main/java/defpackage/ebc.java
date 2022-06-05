package defpackage;

import defpackage.ear;
import java.io.Closeable;

/* renamed from: ebc  reason: default package */
/* loaded from: classes2.dex */
public final class ebc implements Closeable {
    public final eba a;
    public final eay b;
    public final int c;
    public final String d;
    public final eaq e;
    public final ear f;
    public final ebd g;
    final ebc h;
    final ebc i;
    public final ebc j;
    public final long k;
    public final long l;
    final ebt m;
    private volatile eac n;

    ebc(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f.a();
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
    }

    public final eba a() {
        return this.a;
    }

    public final eay b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean d() {
        int i = this.c;
        return i >= 200 && i < 300;
    }

    public final String e() {
        return this.d;
    }

    public final eaq f() {
        return this.e;
    }

    public final ear g() {
        return this.f;
    }

    public final ebd h() {
        return this.g;
    }

    public final a i() {
        return new a(this);
    }

    public final ebc j() {
        return this.h;
    }

    public final ebc k() {
        return this.i;
    }

    public final eac l() {
        eac eacVar = this.n;
        if (eacVar != null) {
            return eacVar;
        }
        eac a2 = eac.a(this.f);
        this.n = a2;
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ebd ebdVar = this.g;
        if (ebdVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        ebdVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.c + ", message=" + this.d + ", url=" + this.a.a + '}';
    }

    /* renamed from: ebc$a */
    /* loaded from: classes2.dex */
    public static class a {
        public eba a;
        public eay b;
        public int c;
        public String d;
        public eaq e;
        public ear.a f;
        public ebd g;
        ebc h;
        ebc i;
        public ebc j;
        public long k;
        public long l;
        ebt m;

        public a() {
            this.c = -1;
            this.f = new ear.a();
        }

        a(ebc ebcVar) {
            this.c = -1;
            this.a = ebcVar.a;
            this.b = ebcVar.b;
            this.c = ebcVar.c;
            this.d = ebcVar.d;
            this.e = ebcVar.e;
            this.f = ebcVar.f.b();
            this.g = ebcVar.g;
            this.h = ebcVar.h;
            this.i = ebcVar.i;
            this.j = ebcVar.j;
            this.k = ebcVar.k;
            this.l = ebcVar.l;
            this.m = ebcVar.m;
        }

        public final a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public final a a(ear earVar) {
            this.f = earVar.b();
            return this;
        }

        public final a a(ebc ebcVar) {
            if (ebcVar != null) {
                a("networkResponse", ebcVar);
            }
            this.h = ebcVar;
            return this;
        }

        public final a b(ebc ebcVar) {
            if (ebcVar != null) {
                a("cacheResponse", ebcVar);
            }
            this.i = ebcVar;
            return this;
        }

        private static void a(String str, ebc ebcVar) {
            if (ebcVar.g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (ebcVar.h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (ebcVar.i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (ebcVar.j == null) {
            } else {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public final ebc a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.c < 0) {
                throw new IllegalStateException("code < 0: " + this.c);
            } else if (this.d == null) {
                throw new IllegalStateException("message == null");
            } else {
                return new ebc(this);
            }
        }
    }

    public final String a(String str) {
        String a2 = this.f.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }
}
