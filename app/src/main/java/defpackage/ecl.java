package defpackage;

import androidx.core.os.EnvironmentCompat;
import defpackage.ear;
import defpackage.ebc;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* renamed from: ecl  reason: default package */
/* loaded from: classes2.dex */
public final class ecl implements ecc {
    final eaw a;
    final ebv b;
    final edw c;
    final edv d;
    ear f;
    int e = 0;
    private long g = 262144;

    public ecl(eaw eawVar, ebv ebvVar, edw edwVar, edv edvVar) {
        this.a = eawVar;
        this.b = ebvVar;
        this.c = edwVar;
        this.d = edvVar;
    }

    @Override // defpackage.ecc
    public final ebv a() {
        return this.b;
    }

    @Override // defpackage.ecc
    public final eem a(eba ebaVar, long j) throws IOException {
        if ("chunked".equalsIgnoreCase(ebaVar.a("Transfer-Encoding"))) {
            if (this.e != 1) {
                throw new IllegalStateException("state: " + this.e);
            }
            this.e = 2;
            return new b();
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else {
            if (this.e != 1) {
                throw new IllegalStateException("state: " + this.e);
            }
            this.e = 2;
            return new e(this, (byte) 0);
        }
    }

    @Override // defpackage.ecc
    public final void d() {
        ebv ebvVar = this.b;
        if (ebvVar != null) {
            ebk.a(ebvVar.c);
        }
    }

    @Override // defpackage.ecc
    public final void a(eba ebaVar) throws IOException {
        Proxy.Type type = this.b.b.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(ebaVar.b);
        sb.append(' ');
        if (!ebaVar.a.c() && type == Proxy.Type.HTTP) {
            sb.append(ebaVar.a);
        } else {
            sb.append(eci.a(ebaVar.a));
        }
        sb.append(" HTTP/1.1");
        a(ebaVar.c, sb.toString());
    }

    @Override // defpackage.ecc
    public final long a(ebc ebcVar) {
        if (!ece.b(ebcVar)) {
            return 0L;
        }
        if (!"chunked".equalsIgnoreCase(ebcVar.a("Transfer-Encoding"))) {
            return ece.a(ebcVar);
        }
        return -1L;
    }

    @Override // defpackage.ecc
    public final een b(ebc ebcVar) {
        if (!ece.b(ebcVar)) {
            return a(0L);
        }
        if (!"chunked".equalsIgnoreCase(ebcVar.a("Transfer-Encoding"))) {
            long a2 = ece.a(ebcVar);
            if (a2 != -1) {
                return a(a2);
            }
            if (this.e != 4) {
                throw new IllegalStateException("state: " + this.e);
            }
            this.e = 5;
            this.b.d();
            return new f(this, (byte) 0);
        }
        eas easVar = ebcVar.a.a;
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new c(easVar);
    }

    @Override // defpackage.ecc
    public final void b() throws IOException {
        this.d.flush();
    }

    @Override // defpackage.ecc
    public final void c() throws IOException {
        this.d.flush();
    }

    public final void a(ear earVar, String str) throws IOException {
        if (this.e != 0) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.d.b(str).b("\r\n");
        int length = earVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            this.d.b(earVar.a(i)).b(": ").b(earVar.b(i)).b("\r\n");
        }
        this.d.b("\r\n");
        this.e = 1;
    }

    @Override // defpackage.ecc
    public final ebc.a a(boolean z) throws IOException {
        int i = this.e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.e);
        }
        try {
            eck a2 = eck.a(e());
            ebc.a aVar = new ebc.a();
            aVar.b = a2.a;
            aVar.c = a2.b;
            aVar.d = a2.c;
            ebc.a a3 = aVar.a(f());
            if (z && a2.b == 100) {
                return null;
            }
            if (a2.b == 100) {
                this.e = 3;
                return a3;
            }
            this.e = 4;
            return a3;
        } catch (EOFException e2) {
            ebv ebvVar = this.b;
            throw new IOException("unexpected end of stream on ".concat(String.valueOf(ebvVar != null ? ebvVar.b.a.a.i() : EnvironmentCompat.MEDIA_UNKNOWN)), e2);
        }
    }

    private String e() throws IOException {
        String e2 = this.c.e(this.g);
        this.g -= e2.length();
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ear f() throws IOException {
        ear.a aVar = new ear.a();
        while (true) {
            String e2 = e();
            if (e2.length() != 0) {
                ebg.a.a(aVar, e2);
            } else {
                return aVar.a();
            }
        }
    }

    public final een a(long j) {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new d(j);
    }

    /* renamed from: ecl$e */
    /* loaded from: classes2.dex */
    final class e implements eem {
        private final eea b;
        private boolean c;

        private e() {
            this.b = new eea(ecl.this.d.a());
        }

        /* synthetic */ e(ecl eclVar, byte b) {
            this();
        }

        @Override // defpackage.eem
        public final eeo a() {
            return this.b;
        }

        @Override // defpackage.eem
        public final void a_(edu eduVar, long j) throws IOException {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            ebk.a(eduVar.b, j);
            ecl.this.d.a_(eduVar, j);
        }

        @Override // defpackage.eem, java.io.Flushable
        public final void flush() throws IOException {
            if (this.c) {
                return;
            }
            ecl.this.d.flush();
        }

        @Override // defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.c) {
                return;
            }
            this.c = true;
            ecl.a(this.b);
            ecl.this.e = 3;
        }
    }

    /* renamed from: ecl$b */
    /* loaded from: classes2.dex */
    final class b implements eem {
        private final eea b;
        private boolean c;

        b() {
            this.b = new eea(ecl.this.d.a());
        }

        @Override // defpackage.eem
        public final eeo a() {
            return this.b;
        }

        @Override // defpackage.eem
        public final void a_(edu eduVar, long j) throws IOException {
            if (!this.c) {
                if (j == 0) {
                    return;
                }
                ecl.this.d.k(j);
                ecl.this.d.b("\r\n");
                ecl.this.d.a_(eduVar, j);
                ecl.this.d.b("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }

        @Override // defpackage.eem, java.io.Flushable
        public final synchronized void flush() throws IOException {
            if (this.c) {
                return;
            }
            ecl.this.d.flush();
        }

        @Override // defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            if (this.c) {
                return;
            }
            this.c = true;
            ecl.this.d.b("0\r\n\r\n");
            ecl.a(this.b);
            ecl.this.e = 3;
        }
    }

    /* renamed from: ecl$a */
    /* loaded from: classes2.dex */
    abstract class a implements een {
        protected final eea a;
        protected boolean b;

        private a() {
            this.a = new eea(ecl.this.c.a());
        }

        /* synthetic */ a(ecl eclVar, byte b) {
            this();
        }

        @Override // defpackage.een
        public final eeo a() {
            return this.a;
        }

        @Override // defpackage.een
        public long a(edu eduVar, long j) throws IOException {
            try {
                return ecl.this.c.a(eduVar, j);
            } catch (IOException e) {
                ecl.this.b.d();
                b();
                throw e;
            }
        }

        final void b() {
            if (ecl.this.e == 6) {
                return;
            }
            if (ecl.this.e != 5) {
                throw new IllegalStateException("state: " + ecl.this.e);
            }
            ecl.a(this.a);
            ecl.this.e = 6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ecl$d */
    /* loaded from: classes2.dex */
    public class d extends a {
        private long e;

        d(long j) {
            super(ecl.this, (byte) 0);
            this.e = j;
            if (j == 0) {
                b();
            }
        }

        @Override // defpackage.ecl.a, defpackage.een
        public final long a(edu eduVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.e;
            if (j2 == 0) {
                return -1L;
            }
            long a = super.a(eduVar, Math.min(j2, j));
            if (a == -1) {
                ecl.this.b.d();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j3 = this.e - a;
            this.e = j3;
            if (j3 == 0) {
                b();
            }
            return a;
        }

        @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.e != 0 && !ebk.a(this, TimeUnit.MILLISECONDS)) {
                ecl.this.b.d();
                b();
            }
            this.b = true;
        }
    }

    /* renamed from: ecl$c */
    /* loaded from: classes2.dex */
    class c extends a {
        private final eas e;
        private long f = -1;
        private boolean g = true;

        c(eas easVar) {
            super(ecl.this, (byte) 0);
            this.e = easVar;
        }

        @Override // defpackage.ecl.a, defpackage.een
        public final long a(edu eduVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (!this.g) {
                return -1L;
            }
            long j2 = this.f;
            if (j2 == 0 || j2 == -1) {
                if (this.f != -1) {
                    ecl.this.c.o();
                }
                try {
                    this.f = ecl.this.c.l();
                    String trim = ecl.this.c.o().trim();
                    if (this.f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f + trim + "\"");
                    }
                    if (this.f == 0) {
                        this.g = false;
                        ecl eclVar = ecl.this;
                        eclVar.f = eclVar.f();
                        ece.a(ecl.this.a.k, this.e, ecl.this.f);
                        b();
                    }
                    if (!this.g) {
                        return -1L;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long a = super.a(eduVar, Math.min(j, this.f));
            if (a == -1) {
                ecl.this.b.d();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            this.f -= a;
            return a;
        }

        @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.g && !ebk.a(this, TimeUnit.MILLISECONDS)) {
                ecl.this.b.d();
                b();
            }
            this.b = true;
        }
    }

    /* renamed from: ecl$f */
    /* loaded from: classes2.dex */
    class f extends a {
        private boolean e;

        private f() {
            super(ecl.this, (byte) 0);
        }

        /* synthetic */ f(ecl eclVar, byte b) {
            this();
        }

        @Override // defpackage.ecl.a, defpackage.een
        public final long a(edu eduVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (this.e) {
                return -1L;
            }
            long a = super.a(eduVar, j);
            if (a != -1) {
                return a;
            }
            this.e = true;
            b();
            return -1L;
        }

        @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.b) {
                return;
            }
            if (!this.e) {
                b();
            }
            this.b = true;
        }
    }

    static /* synthetic */ void a(eea eeaVar) {
        eeo eeoVar = eeaVar.a;
        eeo eeoVar2 = eeo.c;
        if (eeoVar2 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        eeaVar.a = eeoVar2;
        eeoVar.D_();
        eeoVar.d();
    }
}
