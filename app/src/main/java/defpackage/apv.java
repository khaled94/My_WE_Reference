package defpackage;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.android.gms.internal.measurement.zzfi;
import defpackage.ata;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: apv  reason: default package */
/* loaded from: classes.dex */
public final class apv {

    /* renamed from: apv$a */
    /* loaded from: classes.dex */
    public static final class a extends ata<a, C0015a> implements auk {
        private static volatile aur<a> zzuo;
        private static final a zzwf;
        public int zzue;
        public int zzwb;
        private i zzwc;
        private i zzwd;
        public boolean zzwe;

        private a() {
        }

        /* renamed from: apv$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0015a extends ata.a<a, C0015a> implements auk {
            private C0015a() {
                super(a.zzwf);
            }

            public final C0015a a(int i) {
                s();
                a.a((a) this.a, i);
                return this;
            }

            public final i a() {
                return ((a) this.a).a();
            }

            public final C0015a a(i.a aVar) {
                s();
                a.a((a) this.a, aVar);
                return this;
            }

            public final boolean b() {
                return (((a) this.a).zzue & 4) != 0;
            }

            public final i c() {
                return ((a) this.a).b();
            }

            public final C0015a a(i iVar) {
                s();
                a.a((a) this.a, iVar);
                return this;
            }

            public final C0015a a(boolean z) {
                s();
                a.a((a) this.a, z);
                return this;
            }

            /* synthetic */ C0015a(byte b) {
                this();
            }
        }

        public final i a() {
            i iVar = this.zzwc;
            return iVar == null ? i.e() : iVar;
        }

        public final i b() {
            i iVar = this.zzwd;
            return iVar == null ? i.e() : iVar;
        }

        public static C0015a c() {
            return zzwf.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0015a((byte) 0);
                case 3:
                    return a(zzwf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzue", "zzwb", "zzwc", "zzwd", "zzwe"});
                case 4:
                    return zzwf;
                case 5:
                    aur<a> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (a.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzwf);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            a aVar = new a();
            zzwf = aVar;
            ata.a(a.class, aVar);
        }

        static /* synthetic */ void a(a aVar, int i) {
            aVar.zzue |= 1;
            aVar.zzwb = i;
        }

        static /* synthetic */ void a(a aVar, i.a aVar2) {
            aVar.zzwc = aVar2.v();
            aVar.zzue |= 2;
        }

        static /* synthetic */ void a(a aVar, i iVar) {
            if (iVar == null) {
                throw null;
            }
            aVar.zzwd = iVar;
            aVar.zzue |= 4;
        }

        static /* synthetic */ void a(a aVar, boolean z) {
            aVar.zzue |= 8;
            aVar.zzwe = z;
        }
    }

    /* renamed from: apv$b */
    /* loaded from: classes.dex */
    public static final class b extends ata<b, a> implements auk {
        private static volatile aur<b> zzuo;
        private static final b zzwi;
        private int zzue;
        public int zzwg;
        public long zzwh;

        private b() {
        }

        /* renamed from: apv$b$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<b, a> implements auk {
            private a() {
                super(b.zzwi);
            }

            public final a a(int i) {
                s();
                b.a((b) this.a, i);
                return this;
            }

            public final a a(long j) {
                s();
                b.a((b) this.a, j);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public final boolean a() {
            return (this.zzue & 1) != 0;
        }

        public final boolean b() {
            return (this.zzue & 2) != 0;
        }

        public static a c() {
            return zzwi.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzwi, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzue", "zzwg", "zzwh"});
                case 4:
                    return zzwi;
                case 5:
                    aur<b> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (b.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzwi);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            b bVar = new b();
            zzwi = bVar;
            ata.a(b.class, bVar);
        }

        static /* synthetic */ void a(b bVar, int i) {
            bVar.zzue |= 1;
            bVar.zzwg = i;
        }

        static /* synthetic */ void a(b bVar, long j) {
            bVar.zzue |= 2;
            bVar.zzwh = j;
        }
    }

    /* renamed from: apv$c */
    /* loaded from: classes.dex */
    public static final class c extends ata<c, a> implements auk {
        private static volatile aur<c> zzuo;
        private static final c zzwo;
        public int zzue;
        public ati<e> zzwj = auw.d();
        public String zzwk = "";
        public long zzwl;
        public long zzwm;
        public int zzwn;

        private c() {
        }

        /* renamed from: apv$c$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<c, a> implements auk {
            private a() {
                super(c.zzwo);
            }

            public final List<e> a() {
                return Collections.unmodifiableList(((c) this.a).zzwj);
            }

            public final int b() {
                return ((c) this.a).a();
            }

            public final e a(int i) {
                return ((c) this.a).zzwj.get(i);
            }

            public final a a(int i, e eVar) {
                s();
                c.a((c) this.a, i, eVar);
                return this;
            }

            public final a a(int i, e.a aVar) {
                s();
                c.a((c) this.a, i, aVar);
                return this;
            }

            public final a a(e eVar) {
                s();
                c.a((c) this.a, eVar);
                return this;
            }

            public final a a(e.a aVar) {
                s();
                c.a((c) this.a, aVar);
                return this;
            }

            public final a b(int i) {
                s();
                c.a((c) this.a, i);
                return this;
            }

            public final String c() {
                return ((c) this.a).zzwk;
            }

            public final a a(String str) {
                s();
                c.a((c) this.a, str);
                return this;
            }

            public final boolean d() {
                return ((c) this.a).b();
            }

            public final long e() {
                return ((c) this.a).zzwl;
            }

            public final a a(long j) {
                s();
                c.a((c) this.a, j);
                return this;
            }

            public final long f() {
                return ((c) this.a).zzwm;
            }

            public final a b(long j) {
                s();
                c.b((c) this.a, j);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public final int a() {
            return this.zzwj.size();
        }

        private final void e() {
            if (!this.zzwj.a()) {
                this.zzwj = ata.a(this.zzwj);
            }
        }

        public final boolean b() {
            return (this.zzue & 2) != 0;
        }

        public static c a(byte[] bArr, asn asnVar) throws zzfi {
            return (c) ata.a(zzwo, bArr, asnVar);
        }

        public static a c() {
            return zzwo.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzwo, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzue", "zzwj", e.class, "zzwk", "zzwl", "zzwm", "zzwn"});
                case 4:
                    return zzwo;
                case 5:
                    aur<c> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (c.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzwo);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            c cVar = new c();
            zzwo = cVar;
            ata.a(c.class, cVar);
        }

        static /* synthetic */ void a(c cVar, int i, e eVar) {
            if (eVar == null) {
                throw null;
            }
            cVar.e();
            cVar.zzwj.set(i, eVar);
        }

        static /* synthetic */ void a(c cVar, int i, e.a aVar) {
            cVar.e();
            cVar.zzwj.set(i, aVar.v());
        }

        static /* synthetic */ void a(c cVar, e eVar) {
            if (eVar == null) {
                throw null;
            }
            cVar.e();
            cVar.zzwj.add(eVar);
        }

        static /* synthetic */ void a(c cVar, e.a aVar) {
            cVar.e();
            cVar.zzwj.add(aVar.v());
        }

        static /* synthetic */ void a(c cVar, int i) {
            cVar.e();
            cVar.zzwj.remove(i);
        }

        static /* synthetic */ void a(c cVar, String str) {
            if (str == null) {
                throw null;
            }
            cVar.zzue |= 1;
            cVar.zzwk = str;
        }

        static /* synthetic */ void a(c cVar, long j) {
            cVar.zzue |= 2;
            cVar.zzwl = j;
        }

        static /* synthetic */ void b(c cVar, long j) {
            cVar.zzue |= 4;
            cVar.zzwm = j;
        }
    }

    /* renamed from: apv$d */
    /* loaded from: classes.dex */
    public static final class d extends ata<d, a> implements auk {
        private static volatile aur<d> zzuo;
        private static final d zzwq;
        private int zzue;
        private String zzwk = "";
        private long zzwp;

        private d() {
        }

        /* renamed from: apv$d$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<d, a> implements auk {
            private a() {
                super(d.zzwq);
            }

            public final a a(String str) {
                s();
                d.a((d) this.a, str);
                return this;
            }

            public final a a(long j) {
                s();
                d.a((d) this.a, j);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public static a a() {
            return zzwq.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzwq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzue", "zzwk", "zzwp"});
                case 4:
                    return zzwq;
                case 5:
                    aur<d> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (d.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzwq);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            d dVar = new d();
            zzwq = dVar;
            ata.a(d.class, dVar);
        }

        static /* synthetic */ void a(d dVar, String str) {
            if (str == null) {
                throw null;
            }
            dVar.zzue |= 1;
            dVar.zzwk = str;
        }

        static /* synthetic */ void a(d dVar, long j) {
            dVar.zzue |= 2;
            dVar.zzwp = j;
        }
    }

    /* renamed from: apv$e */
    /* loaded from: classes.dex */
    public static final class e extends ata<e, a> implements auk {
        private static volatile aur<e> zzuo;
        private static final e zzwu;
        private int zzue;
        public long zzwp;
        private float zzws;
        public double zzwt;
        public String zzwk = "";
        public String zzwr = "";

        private e() {
        }

        /* renamed from: apv$e$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<e, a> implements auk {
            private a() {
                super(e.zzwu);
            }

            public final a a(String str) {
                s();
                e.a((e) this.a, str);
                return this;
            }

            public final a b(String str) {
                s();
                e.b((e) this.a, str);
                return this;
            }

            public final a a() {
                s();
                e.a((e) this.a);
                return this;
            }

            public final a a(long j) {
                s();
                e.a((e) this.a, j);
                return this;
            }

            public final a b() {
                s();
                e.b((e) this.a);
                return this;
            }

            public final a a(double d) {
                s();
                e.a((e) this.a, d);
                return this;
            }

            public final a c() {
                s();
                e.c((e) this.a);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public final boolean a() {
            return (this.zzue & 2) != 0;
        }

        public final boolean b() {
            return (this.zzue & 4) != 0;
        }

        public final boolean c() {
            return (this.zzue & 16) != 0;
        }

        public static a d() {
            return zzwu.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzwu, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004", new Object[]{"zzue", "zzwk", "zzwr", "zzwp", "zzws", "zzwt"});
                case 4:
                    return zzwu;
                case 5:
                    aur<e> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (e.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzwu);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            e eVar = new e();
            zzwu = eVar;
            ata.a(e.class, eVar);
        }

        static /* synthetic */ void a(e eVar, String str) {
            if (str == null) {
                throw null;
            }
            eVar.zzue |= 1;
            eVar.zzwk = str;
        }

        static /* synthetic */ void b(e eVar, String str) {
            if (str == null) {
                throw null;
            }
            eVar.zzue |= 2;
            eVar.zzwr = str;
        }

        static /* synthetic */ void a(e eVar) {
            eVar.zzue &= -3;
            eVar.zzwr = zzwu.zzwr;
        }

        static /* synthetic */ void a(e eVar, long j) {
            eVar.zzue |= 4;
            eVar.zzwp = j;
        }

        static /* synthetic */ void b(e eVar) {
            eVar.zzue &= -5;
            eVar.zzwp = 0L;
        }

        static /* synthetic */ void a(e eVar, double d) {
            eVar.zzue |= 16;
            eVar.zzwt = d;
        }

        static /* synthetic */ void c(e eVar) {
            eVar.zzue &= -17;
            eVar.zzwt = 0.0d;
        }
    }

    /* renamed from: apv$f */
    /* loaded from: classes.dex */
    public static final class f extends ata<f, a> implements auk {
        private static volatile aur<f> zzuo;
        private static final f zzww;
        public ati<g> zzwv = auw.d();

        private f() {
        }

        /* renamed from: apv$f$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<f, a> implements auk {
            private a() {
                super(f.zzww);
            }

            public final g a() {
                return ((f) this.a).zzwv.get(0);
            }

            public final a a(g.a aVar) {
                s();
                f.a((f) this.a, aVar);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public static a a() {
            return zzww.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzww, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzwv", g.class});
                case 4:
                    return zzww;
                case 5:
                    aur<f> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (f.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzww);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            f fVar = new f();
            zzww = fVar;
            ata.a(f.class, fVar);
        }

        static /* synthetic */ void a(f fVar, g.a aVar) {
            if (!fVar.zzwv.a()) {
                fVar.zzwv = ata.a(fVar.zzwv);
            }
            fVar.zzwv.add(aVar.v());
        }
    }

    /* renamed from: apv$g */
    /* loaded from: classes.dex */
    public static final class g extends ata<g, a> implements auk {
        private static volatile aur<g> zzuo;
        private static final g zzyo;
        public int zzue;
        public int zzwx;
        public int zzwy;
        public long zzxb;
        public long zzxc;
        public long zzxd;
        public long zzxe;
        public long zzxf;
        public int zzxk;
        public long zzxo;
        public long zzxp;
        public boolean zzxr;
        public long zzxt;
        public int zzxu;
        public boolean zzxx;
        public int zzya;
        private int zzyb;
        private int zzyc;
        public long zzye;
        public long zzyf;
        public int zzyi;
        private h zzyk;
        public long zzym;
        private long zzyn;
        public ati<c> zzwz = auw.d();
        public ati<k> zzxa = auw.d();
        public String zzxg = "";
        public String zzxh = "";
        public String zzxi = "";
        public String zzxj = "";
        public String zzxl = "";
        public String zzxm = "";
        public String zzxn = "";
        public String zzxq = "";
        public String zzxs = "";
        public String zzxv = "";
        public String zzxw = "";
        public ati<a> zzxy = auw.d();
        public String zzxz = "";
        public String zzyd = "";
        public String zzyg = "";
        private String zzyh = "";
        public String zzyj = "";
        private atg zzyl = atd.d();

        private g() {
        }

        /* renamed from: apv$g$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<g, a> implements auk {
            private a() {
                super(g.zzyo);
            }

            public final a a() {
                s();
                g.a((g) this.a);
                return this;
            }

            public final List<c> b() {
                return Collections.unmodifiableList(((g) this.a).zzwz);
            }

            public final int c() {
                return ((g) this.a).zzwz.size();
            }

            public final c a(int i) {
                return ((g) this.a).zzwz.get(i);
            }

            public final a a(int i, c.a aVar) {
                s();
                g.a((g) this.a, i, aVar);
                return this;
            }

            public final a a(c.a aVar) {
                s();
                g.a((g) this.a, aVar);
                return this;
            }

            public final a a(Iterable<? extends c> iterable) {
                s();
                g.a((g) this.a, iterable);
                return this;
            }

            public final a d() {
                s();
                g.b((g) this.a);
                return this;
            }

            public final a b(int i) {
                s();
                g.a((g) this.a, i);
                return this;
            }

            public final List<k> e() {
                return Collections.unmodifiableList(((g) this.a).zzxa);
            }

            public final int f() {
                return ((g) this.a).zzxa.size();
            }

            public final k c(int i) {
                return ((g) this.a).zzxa.get(i);
            }

            public final a a(int i, k kVar) {
                s();
                g.a((g) this.a, i, kVar);
                return this;
            }

            public final a a(k kVar) {
                s();
                g.a((g) this.a, kVar);
                return this;
            }

            public final a a(k.a aVar) {
                s();
                g.a((g) this.a, aVar);
                return this;
            }

            public final a b(Iterable<? extends k> iterable) {
                s();
                g.b((g) this.a, iterable);
                return this;
            }

            public final a a(long j) {
                s();
                g.a((g) this.a, j);
                return this;
            }

            public final long g() {
                return ((g) this.a).zzxc;
            }

            public final a b(long j) {
                s();
                g.b((g) this.a, j);
                return this;
            }

            public final long h() {
                return ((g) this.a).zzxd;
            }

            public final a c(long j) {
                s();
                g.c((g) this.a, j);
                return this;
            }

            public final a d(long j) {
                s();
                g.d((g) this.a, j);
                return this;
            }

            public final a i() {
                s();
                g.c((g) this.a);
                return this;
            }

            public final a e(long j) {
                s();
                g.e((g) this.a, j);
                return this;
            }

            public final a j() {
                s();
                g.d((g) this.a);
                return this;
            }

            public final a a(String str) {
                s();
                g.a((g) this.a, str);
                return this;
            }

            public final a b(String str) {
                s();
                g.b((g) this.a, str);
                return this;
            }

            public final a c(String str) {
                s();
                g.c((g) this.a, str);
                return this;
            }

            public final a d(String str) {
                s();
                g.d((g) this.a, str);
                return this;
            }

            public final a d(int i) {
                s();
                g.b((g) this.a, i);
                return this;
            }

            public final a e(String str) {
                s();
                g.e((g) this.a, str);
                return this;
            }

            public final String k() {
                return ((g) this.a).zzxm;
            }

            public final a f(String str) {
                s();
                g.f((g) this.a, str);
                return this;
            }

            public final a g(String str) {
                s();
                g.g((g) this.a, str);
                return this;
            }

            public final a f(long j) {
                s();
                g.f((g) this.a, j);
                return this;
            }

            public final a l() {
                s();
                g.e((g) this.a);
                return this;
            }

            public final a h(String str) {
                s();
                g.h((g) this.a, str);
                return this;
            }

            public final a a(boolean z) {
                s();
                g.a((g) this.a, z);
                return this;
            }

            public final a i(String str) {
                s();
                g.i((g) this.a, str);
                return this;
            }

            public final a g(long j) {
                s();
                g.g((g) this.a, j);
                return this;
            }

            public final a e(int i) {
                s();
                g.c((g) this.a, i);
                return this;
            }

            public final a j(String str) {
                s();
                g.j((g) this.a, str);
                return this;
            }

            public final a h_() {
                s();
                g.f((g) this.a);
                return this;
            }

            public final String n() {
                return ((g) this.a).zzxw;
            }

            public final a k(String str) {
                s();
                g.k((g) this.a, str);
                return this;
            }

            public final a b(boolean z) {
                s();
                g.b((g) this.a, z);
                return this;
            }

            public final a c(Iterable<? extends a> iterable) {
                s();
                g.c((g) this.a, iterable);
                return this;
            }

            public final a o() {
                s();
                g.g((g) this.a);
                return this;
            }

            public final a l(String str) {
                s();
                g.l((g) this.a, str);
                return this;
            }

            public final a f(int i) {
                s();
                g.d((g) this.a, i);
                return this;
            }

            public final a m(String str) {
                s();
                g.m((g) this.a, str);
                return this;
            }

            public final a h(long j) {
                s();
                g.h((g) this.a, j);
                return this;
            }

            public final a i(long j) {
                s();
                g.i((g) this.a, j);
                return this;
            }

            public final a p() {
                s();
                g.e();
                return this;
            }

            public final a q() {
                s();
                g.h((g) this.a);
                return this;
            }

            public final a g(int i) {
                s();
                g.e((g) this.a, i);
                return this;
            }

            public final a n(String str) {
                s();
                g.n((g) this.a, str);
                return this;
            }

            public final a a(h.a aVar) {
                s();
                g.a((g) this.a, aVar);
                return this;
            }

            public final a d(Iterable<? extends Integer> iterable) {
                s();
                g.d((g) this.a, iterable);
                return this;
            }

            public final a j(long j) {
                s();
                g.j((g) this.a, j);
                return this;
            }

            public final a k(long j) {
                s();
                g.k((g) this.a, j);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        private final void f() {
            if (!this.zzwz.a()) {
                this.zzwz = ata.a(this.zzwz);
            }
        }

        private final void g() {
            if (!this.zzxa.a()) {
                this.zzxa = ata.a(this.zzxa);
            }
        }

        public final boolean a() {
            return (this.zzue & 8) != 0;
        }

        public final boolean b() {
            return (this.zzwx & 2) != 0;
        }

        public static g a(byte[] bArr, asn asnVar) throws zzfi {
            return (g) ata.a(zzyo, bArr, asnVar);
        }

        public static a c() {
            return zzyo.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new g();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzyo, "\u0001*\u0000\u0002\u0001/*\u0000\u0004\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0002\u0001\u0005\u0002\u0002\u0006\u0002\u0003\u0007\u0002\u0005\b\b\u0006\t\b\u0007\n\b\b\u000b\b\t\f\u0004\n\r\b\u000b\u000e\b\f\u0010\b\r\u0011\u0002\u000e\u0012\u0002\u000f\u0013\b\u0010\u0014\u0007\u0011\u0015\b\u0012\u0016\u0002\u0013\u0017\u0004\u0014\u0018\b\u0015\u0019\b\u0016\u001a\u0002\u0004\u001c\u0007\u0017\u001d\u001b\u001e\b\u0018\u001f\u0004\u0019 \u0004\u001a!\u0004\u001b\"\b\u001c#\u0002\u001d$\u0002\u001e%\b\u001f&\b '\u0004!)\b\",\t#-\u001d.\u0002$/\u0002%", new Object[]{"zzue", "zzwx", "zzwy", "zzwz", c.class, "zzxa", k.class, "zzxb", "zzxc", "zzxd", "zzxf", "zzxg", "zzxh", "zzxi", "zzxj", "zzxk", "zzxl", "zzxm", "zzxn", "zzxo", "zzxp", "zzxq", "zzxr", "zzxs", "zzxt", "zzxu", "zzxv", "zzxw", "zzxe", "zzxx", "zzxy", a.class, "zzxz", "zzya", "zzyb", "zzyc", "zzyd", "zzye", "zzyf", "zzyg", "zzyh", "zzyi", "zzyj", "zzyk", "zzyl", "zzym", "zzyn"});
                case 4:
                    return zzyo;
                case 5:
                    aur<g> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (g.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzyo);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            g gVar = new g();
            zzyo = gVar;
            ata.a(g.class, gVar);
        }

        static /* synthetic */ void a(g gVar) {
            gVar.zzue |= 1;
            gVar.zzwy = 1;
        }

        static /* synthetic */ void a(g gVar, int i, c.a aVar) {
            gVar.f();
            gVar.zzwz.set(i, aVar.v());
        }

        static /* synthetic */ void a(g gVar, c.a aVar) {
            gVar.f();
            gVar.zzwz.add(aVar.v());
        }

        static /* synthetic */ void a(g gVar, Iterable iterable) {
            gVar.f();
            arj.a(iterable, gVar.zzwz);
        }

        static /* synthetic */ void b(g gVar) {
            gVar.zzwz = auw.d();
        }

        static /* synthetic */ void a(g gVar, int i) {
            gVar.f();
            gVar.zzwz.remove(i);
        }

        static /* synthetic */ void a(g gVar, int i, k kVar) {
            if (kVar == null) {
                throw null;
            }
            gVar.g();
            gVar.zzxa.set(i, kVar);
        }

        static /* synthetic */ void a(g gVar, k kVar) {
            if (kVar == null) {
                throw null;
            }
            gVar.g();
            gVar.zzxa.add(kVar);
        }

        static /* synthetic */ void a(g gVar, k.a aVar) {
            gVar.g();
            gVar.zzxa.add(aVar.v());
        }

        static /* synthetic */ void b(g gVar, Iterable iterable) {
            gVar.g();
            arj.a(iterable, gVar.zzxa);
        }

        static /* synthetic */ void a(g gVar, long j) {
            gVar.zzue |= 2;
            gVar.zzxb = j;
        }

        static /* synthetic */ void b(g gVar, long j) {
            gVar.zzue |= 4;
            gVar.zzxc = j;
        }

        static /* synthetic */ void c(g gVar, long j) {
            gVar.zzue |= 8;
            gVar.zzxd = j;
        }

        static /* synthetic */ void d(g gVar, long j) {
            gVar.zzue |= 16;
            gVar.zzxe = j;
        }

        static /* synthetic */ void c(g gVar) {
            gVar.zzue &= -17;
            gVar.zzxe = 0L;
        }

        static /* synthetic */ void e(g gVar, long j) {
            gVar.zzue |= 32;
            gVar.zzxf = j;
        }

        static /* synthetic */ void d(g gVar) {
            gVar.zzue &= -33;
            gVar.zzxf = 0L;
        }

        static /* synthetic */ void a(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 64;
            gVar.zzxg = str;
        }

        static /* synthetic */ void b(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 128;
            gVar.zzxh = str;
        }

        static /* synthetic */ void c(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 256;
            gVar.zzxi = str;
        }

        static /* synthetic */ void d(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 512;
            gVar.zzxj = str;
        }

        static /* synthetic */ void b(g gVar, int i) {
            gVar.zzue |= 1024;
            gVar.zzxk = i;
        }

        static /* synthetic */ void e(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 2048;
            gVar.zzxl = str;
        }

        static /* synthetic */ void f(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 4096;
            gVar.zzxm = str;
        }

        static /* synthetic */ void g(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 8192;
            gVar.zzxn = str;
        }

        static /* synthetic */ void f(g gVar, long j) {
            gVar.zzue |= 16384;
            gVar.zzxo = j;
        }

        static /* synthetic */ void e(g gVar) {
            gVar.zzue |= 32768;
            gVar.zzxp = 16250L;
        }

        static /* synthetic */ void h(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 65536;
            gVar.zzxq = str;
        }

        static /* synthetic */ void a(g gVar, boolean z) {
            gVar.zzue |= 131072;
            gVar.zzxr = z;
        }

        static /* synthetic */ void i(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 262144;
            gVar.zzxs = str;
        }

        static /* synthetic */ void g(g gVar, long j) {
            gVar.zzue |= 524288;
            gVar.zzxt = j;
        }

        static /* synthetic */ void c(g gVar, int i) {
            gVar.zzue |= 1048576;
            gVar.zzxu = i;
        }

        static /* synthetic */ void j(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 2097152;
            gVar.zzxv = str;
        }

        static /* synthetic */ void f(g gVar) {
            gVar.zzue &= -2097153;
            gVar.zzxv = zzyo.zzxv;
        }

        static /* synthetic */ void k(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 4194304;
            gVar.zzxw = str;
        }

        static /* synthetic */ void b(g gVar, boolean z) {
            gVar.zzue |= 8388608;
            gVar.zzxx = z;
        }

        static /* synthetic */ void c(g gVar, Iterable iterable) {
            if (!gVar.zzxy.a()) {
                gVar.zzxy = ata.a(gVar.zzxy);
            }
            arj.a(iterable, gVar.zzxy);
        }

        static /* synthetic */ void g(g gVar) {
            gVar.zzxy = auw.d();
        }

        static /* synthetic */ void l(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= 16777216;
            gVar.zzxz = str;
        }

        static /* synthetic */ void d(g gVar, int i) {
            gVar.zzue |= 33554432;
            gVar.zzya = i;
        }

        static /* synthetic */ void m(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzue |= SQLiteDatabase.CREATE_IF_NECESSARY;
            gVar.zzyd = str;
        }

        static /* synthetic */ void h(g gVar, long j) {
            gVar.zzue |= 536870912;
            gVar.zzye = j;
        }

        static /* synthetic */ void i(g gVar, long j) {
            gVar.zzue |= BasicMeasure.EXACTLY;
            gVar.zzyf = j;
        }

        static /* synthetic */ void e() {
            throw null;
        }

        static /* synthetic */ void h(g gVar) {
            gVar.zzue &= Integer.MAX_VALUE;
            gVar.zzyg = zzyo.zzyg;
        }

        static /* synthetic */ void e(g gVar, int i) {
            gVar.zzwx |= 2;
            gVar.zzyi = i;
        }

        static /* synthetic */ void n(g gVar, String str) {
            if (str == null) {
                throw null;
            }
            gVar.zzwx |= 4;
            gVar.zzyj = str;
        }

        static /* synthetic */ void a(g gVar, h.a aVar) {
            gVar.zzyk = aVar.v();
            gVar.zzwx |= 8;
        }

        static /* synthetic */ void d(g gVar, Iterable iterable) {
            if (!gVar.zzyl.a()) {
                atg atgVar = gVar.zzyl;
                int size = atgVar.size();
                gVar.zzyl = atgVar.b(size == 0 ? 10 : size << 1);
            }
            arj.a(iterable, gVar.zzyl);
        }

        static /* synthetic */ void j(g gVar, long j) {
            gVar.zzwx |= 16;
            gVar.zzym = j;
        }

        static /* synthetic */ void k(g gVar, long j) {
            gVar.zzwx |= 32;
            gVar.zzyn = j;
        }
    }

    /* renamed from: apv$h */
    /* loaded from: classes.dex */
    public static final class h extends ata<h, a> implements auk {
        private static volatile aur<h> zzuo;
        private static final h zzyr;
        private int zzue;
        private int zzyp = 1;
        private ati<d> zzyq = auw.d();

        /* renamed from: apv$h$b */
        /* loaded from: classes.dex */
        public enum b implements atf {
            RADS(1),
            PROVISIONING(2);
            
            private static final ate<b> zzvf = new apw();
            private final int value;

            @Override // defpackage.atf
            public final int zzlg() {
                return this.value;
            }

            public static b zzad(int i) {
                if (i != 1) {
                    if (i == 2) {
                        return PROVISIONING;
                    }
                    return null;
                }
                return RADS;
            }

            public static ath zzlh() {
                return apx.a;
            }

            b(int i) {
                this.value = i;
            }
        }

        private h() {
        }

        /* renamed from: apv$h$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<h, a> implements auk {
            private a() {
                super(h.zzyr);
            }

            public final a a(d.a aVar) {
                s();
                h.a((h) this.a, aVar);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public static a a() {
            return zzyr.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new h();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzyr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzue", "zzyp", b.zzlh(), "zzyq", d.class});
                case 4:
                    return zzyr;
                case 5:
                    aur<h> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (h.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzyr);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            h hVar = new h();
            zzyr = hVar;
            ata.a(h.class, hVar);
        }

        static /* synthetic */ void a(h hVar, d.a aVar) {
            if (!hVar.zzyq.a()) {
                hVar.zzyq = ata.a(hVar.zzyq);
            }
            hVar.zzyq.add(aVar.v());
        }
    }

    /* renamed from: apv$i */
    /* loaded from: classes.dex */
    public static final class i extends ata<i, a> implements auk {
        private static volatile aur<i> zzuo;
        private static final i zzyz;
        public atj zzyv = atv.d();
        public atj zzyw = atv.d();
        public ati<b> zzyx = auw.d();
        public ati<j> zzyy = auw.d();

        private i() {
        }

        /* renamed from: apv$i$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<i, a> implements auk {
            private a() {
                super(i.zzyz);
            }

            public final a a(Iterable<? extends Long> iterable) {
                s();
                i.a((i) this.a, iterable);
                return this;
            }

            public final a a() {
                s();
                i.a((i) this.a);
                return this;
            }

            public final a b(Iterable<? extends Long> iterable) {
                s();
                i.b((i) this.a, iterable);
                return this;
            }

            public final a b() {
                s();
                i.b((i) this.a);
                return this;
            }

            public final a c(Iterable<? extends b> iterable) {
                s();
                i.c((i) this.a, iterable);
                return this;
            }

            public final a a(int i) {
                s();
                i.a((i) this.a, i);
                return this;
            }

            public final a d(Iterable<? extends j> iterable) {
                s();
                i.d((i) this.a, iterable);
                return this;
            }

            public final a b(int i) {
                s();
                i.b((i) this.a, i);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public final int a() {
            return this.zzyv.size();
        }

        public final int b() {
            return this.zzyx.size();
        }

        private final void g() {
            if (!this.zzyx.a()) {
                this.zzyx = ata.a(this.zzyx);
            }
        }

        public final int c() {
            return this.zzyy.size();
        }

        private final void s() {
            if (!this.zzyy.a()) {
                this.zzyy = ata.a(this.zzyy);
            }
        }

        public static i a(byte[] bArr, asn asnVar) throws zzfi {
            return (i) ata.a(zzyz, bArr, asnVar);
        }

        public static a d() {
            return zzyz.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new i();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzyz, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzyv", "zzyw", "zzyx", b.class, "zzyy", j.class});
                case 4:
                    return zzyz;
                case 5:
                    aur<i> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (i.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzyz);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static i e() {
            return zzyz;
        }

        static {
            i iVar = new i();
            zzyz = iVar;
            ata.a(i.class, iVar);
        }

        static /* synthetic */ void a(i iVar, Iterable iterable) {
            if (!iVar.zzyv.a()) {
                iVar.zzyv = ata.a(iVar.zzyv);
            }
            arj.a(iterable, iVar.zzyv);
        }

        static /* synthetic */ void a(i iVar) {
            iVar.zzyv = atv.d();
        }

        static /* synthetic */ void b(i iVar, Iterable iterable) {
            if (!iVar.zzyw.a()) {
                iVar.zzyw = ata.a(iVar.zzyw);
            }
            arj.a(iterable, iVar.zzyw);
        }

        static /* synthetic */ void b(i iVar) {
            iVar.zzyw = atv.d();
        }

        static /* synthetic */ void c(i iVar, Iterable iterable) {
            iVar.g();
            arj.a(iterable, iVar.zzyx);
        }

        static /* synthetic */ void a(i iVar, int i) {
            iVar.g();
            iVar.zzyx.remove(i);
        }

        static /* synthetic */ void d(i iVar, Iterable iterable) {
            iVar.s();
            arj.a(iterable, iVar.zzyy);
        }

        static /* synthetic */ void b(i iVar, int i) {
            iVar.s();
            iVar.zzyy.remove(i);
        }
    }

    /* renamed from: apv$j */
    /* loaded from: classes.dex */
    public static final class j extends ata<j, a> implements auk {
        private static volatile aur<j> zzuo;
        private static final j zzzb;
        private int zzue;
        public int zzwg;
        public atj zzza = atv.d();

        private j() {
        }

        /* renamed from: apv$j$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<j, a> implements auk {
            private a() {
                super(j.zzzb);
            }

            public final a a(int i) {
                s();
                j.a((j) this.a, i);
                return this;
            }

            public final a a(long j) {
                s();
                j.a((j) this.a, j);
                return this;
            }

            public final a a(Iterable<? extends Long> iterable) {
                s();
                j.a((j) this.a, iterable);
                return this;
            }

            public final a a() {
                s();
                j.a((j) this.a);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public final boolean a() {
            return (this.zzue & 1) != 0;
        }

        public final int b() {
            return this.zzza.size();
        }

        public final long b(int i) {
            return this.zzza.b(i);
        }

        private final void e() {
            if (!this.zzza.a()) {
                this.zzza = ata.a(this.zzza);
            }
        }

        public static a c() {
            return zzzb.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new j();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzue", "zzwg", "zzza"});
                case 4:
                    return zzzb;
                case 5:
                    aur<j> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (j.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzzb);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            j jVar = new j();
            zzzb = jVar;
            ata.a(j.class, jVar);
        }

        static /* synthetic */ void a(j jVar, int i) {
            jVar.zzue |= 1;
            jVar.zzwg = i;
        }

        static /* synthetic */ void a(j jVar, long j) {
            jVar.e();
            jVar.zzza.a(j);
        }

        static /* synthetic */ void a(j jVar, Iterable iterable) {
            jVar.e();
            arj.a(iterable, jVar.zzza);
        }

        static /* synthetic */ void a(j jVar) {
            jVar.zzza = atv.d();
        }
    }

    /* renamed from: apv$k */
    /* loaded from: classes.dex */
    public static final class k extends ata<k, a> implements auk {
        private static volatile aur<k> zzuo;
        private static final k zzzd;
        private int zzue;
        public long zzwp;
        private float zzws;
        public double zzwt;
        public long zzzc;
        public String zzwk = "";
        public String zzwr = "";

        private k() {
        }

        /* renamed from: apv$k$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<k, a> implements auk {
            private a() {
                super(k.zzzd);
            }

            public final a a(long j) {
                s();
                k.a((k) this.a, j);
                return this;
            }

            public final a a(String str) {
                s();
                k.a((k) this.a, str);
                return this;
            }

            public final a b(String str) {
                s();
                k.b((k) this.a, str);
                return this;
            }

            public final a a() {
                s();
                k.a((k) this.a);
                return this;
            }

            public final a b(long j) {
                s();
                k.b((k) this.a, j);
                return this;
            }

            public final a b() {
                s();
                k.b((k) this.a);
                return this;
            }

            public final a a(double d) {
                s();
                k.a((k) this.a, d);
                return this;
            }

            public final a c() {
                s();
                k.c((k) this.a);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public final boolean a() {
            return (this.zzue & 1) != 0;
        }

        public final boolean b() {
            return (this.zzue & 4) != 0;
        }

        public final boolean c() {
            return (this.zzue & 8) != 0;
        }

        public final boolean d() {
            return (this.zzue & 32) != 0;
        }

        public static a e() {
            return zzzd.l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apu.a[i - 1]) {
                case 1:
                    return new k();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{"zzue", "zzzc", "zzwk", "zzwr", "zzwp", "zzws", "zzwt"});
                case 4:
                    return zzzd;
                case 5:
                    aur<k> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (k.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzzd);
                                zzuo = aurVar;
                            }
                        }
                    }
                    return aurVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            k kVar = new k();
            zzzd = kVar;
            ata.a(k.class, kVar);
        }

        static /* synthetic */ void a(k kVar, long j) {
            kVar.zzue |= 1;
            kVar.zzzc = j;
        }

        static /* synthetic */ void a(k kVar, String str) {
            if (str == null) {
                throw null;
            }
            kVar.zzue |= 2;
            kVar.zzwk = str;
        }

        static /* synthetic */ void b(k kVar, String str) {
            if (str == null) {
                throw null;
            }
            kVar.zzue |= 4;
            kVar.zzwr = str;
        }

        static /* synthetic */ void a(k kVar) {
            kVar.zzue &= -5;
            kVar.zzwr = zzzd.zzwr;
        }

        static /* synthetic */ void b(k kVar, long j) {
            kVar.zzue |= 8;
            kVar.zzwp = j;
        }

        static /* synthetic */ void b(k kVar) {
            kVar.zzue &= -9;
            kVar.zzwp = 0L;
        }

        static /* synthetic */ void a(k kVar, double d) {
            kVar.zzue |= 32;
            kVar.zzwt = d;
        }

        static /* synthetic */ void c(k kVar) {
            kVar.zzue &= -33;
            kVar.zzwt = 0.0d;
        }
    }
}
