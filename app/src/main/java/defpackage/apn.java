package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import defpackage.ata;

/* renamed from: apn  reason: default package */
/* loaded from: classes.dex */
public final class apn {

    /* renamed from: apn$a */
    /* loaded from: classes.dex */
    public static final class a extends ata<a, C0013a> implements auk {
        private static final a zzun;
        private static volatile aur<a> zzuo;
        public int zzue;
        public int zzuf;
        public String zzug = "";
        public ati<b> zzuh = auw.d();
        private boolean zzui;
        private c zzuj;
        public boolean zzuk;
        public boolean zzul;
        public boolean zzum;

        private a() {
        }

        /* renamed from: apn$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0013a extends ata.a<a, C0013a> implements auk {
            private C0013a() {
                super(a.zzun);
            }

            public final String a() {
                return ((a) this.a).zzug;
            }

            public final C0013a a(String str) {
                s();
                a.a((a) this.a, str);
                return this;
            }

            public final int b() {
                return ((a) this.a).zzuh.size();
            }

            public final b a(int i) {
                return ((a) this.a).zzuh.get(i);
            }

            public final C0013a a(int i, b bVar) {
                s();
                a.a((a) this.a, i, bVar);
                return this;
            }

            /* synthetic */ C0013a(byte b) {
                this();
            }
        }

        public final boolean a() {
            return (this.zzue & 1) != 0;
        }

        public final c b() {
            c cVar = this.zzuj;
            return cVar == null ? c.d() : cVar;
        }

        public static a a(byte[] bArr, asn asnVar) throws zzfi {
            return (a) ata.a(zzun, bArr, asnVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apm.a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0013a((byte) 0);
                case 3:
                    return a(zzun, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzue", "zzuf", "zzug", "zzuh", b.class, "zzui", "zzuj", "zzuk", "zzul", "zzum"});
                case 4:
                    return zzun;
                case 5:
                    aur<a> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (a.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzun);
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

        public static aur<a> c() {
            return (aur) zzun.a(ata.d.g);
        }

        static {
            a aVar = new a();
            zzun = aVar;
            ata.a(a.class, aVar);
        }

        static /* synthetic */ void a(a aVar, String str) {
            if (str == null) {
                throw null;
            }
            aVar.zzue |= 2;
            aVar.zzug = str;
        }

        static /* synthetic */ void a(a aVar, int i, b bVar) {
            if (bVar == null) {
                throw null;
            }
            if (!aVar.zzuh.a()) {
                aVar.zzuh = ata.a(aVar.zzuh);
            }
            aVar.zzuh.set(i, bVar);
        }
    }

    /* renamed from: apn$b */
    /* loaded from: classes.dex */
    public static final class b extends ata<b, a> implements auk {
        private static volatile aur<b> zzuo;
        private static final b zzut;
        private int zzue;
        private e zzup;
        private c zzuq;
        public boolean zzur;
        public String zzus = "";

        private b() {
        }

        /* renamed from: apn$b$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<b, a> implements auk {
            private a() {
                super(b.zzut);
            }

            public final a a(String str) {
                s();
                b.a((b) this.a, str);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public final boolean a() {
            return (this.zzue & 1) != 0;
        }

        public final e b() {
            e eVar = this.zzup;
            return eVar == null ? e.e() : eVar;
        }

        public final boolean c() {
            return (this.zzue & 2) != 0;
        }

        public final c d() {
            c cVar = this.zzuq;
            return cVar == null ? c.d() : cVar;
        }

        public final boolean e() {
            return (this.zzue & 4) != 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apm.a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzut, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzue", "zzup", "zzuq", "zzur", "zzus"});
                case 4:
                    return zzut;
                case 5:
                    aur<b> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (b.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzut);
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

        public static b f() {
            return zzut;
        }

        static {
            b bVar = new b();
            zzut = bVar;
            ata.a(b.class, bVar);
        }

        static /* synthetic */ void a(b bVar, String str) {
            if (str == null) {
                throw null;
            }
            bVar.zzue |= 8;
            bVar.zzus = str;
        }
    }

    /* renamed from: apn$c */
    /* loaded from: classes.dex */
    public static final class c extends ata<c, a> implements auk {
        private static volatile aur<c> zzuo;
        private static final c zzuz;
        public int zzue;
        private int zzuu;
        public boolean zzuv;
        public String zzuw = "";
        public String zzux = "";
        public String zzuy = "";

        /* renamed from: apn$c$b */
        /* loaded from: classes.dex */
        public enum b implements atf {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private static final ate<b> zzvf = new apo();
            private final int value;

            @Override // defpackage.atf
            public final int zzlg() {
                return this.value;
            }

            public static b zzf(int i) {
                if (i != 0) {
                    if (i == 1) {
                        return LESS_THAN;
                    }
                    if (i == 2) {
                        return GREATER_THAN;
                    }
                    if (i == 3) {
                        return EQUAL;
                    }
                    if (i == 4) {
                        return BETWEEN;
                    }
                    return null;
                }
                return UNKNOWN_COMPARISON_TYPE;
            }

            public static ath zzlh() {
                return app.a;
            }

            b(int i) {
                this.value = i;
            }
        }

        private c() {
        }

        /* renamed from: apn$c$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<c, a> implements auk {
            private a() {
                super(c.zzuz);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public final boolean a() {
            return (this.zzue & 1) != 0;
        }

        public final b b() {
            b zzf = b.zzf(this.zzuu);
            return zzf == null ? b.UNKNOWN_COMPARISON_TYPE : zzf;
        }

        public final boolean c() {
            return (this.zzue & 2) != 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apm.a[i - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzuz, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzue", "zzuu", b.zzlh(), "zzuv", "zzuw", "zzux", "zzuy"});
                case 4:
                    return zzuz;
                case 5:
                    aur<c> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (c.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzuz);
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

        public static c d() {
            return zzuz;
        }

        static {
            c cVar = new c();
            zzuz = cVar;
            ata.a(c.class, cVar);
        }
    }

    /* renamed from: apn$d */
    /* loaded from: classes.dex */
    public static final class d extends ata<d, a> implements auk {
        private static volatile aur<d> zzuo;
        private static final d zzvj;
        public int zzue;
        public int zzuf;
        public boolean zzuk;
        public boolean zzul;
        public boolean zzum;
        public String zzvh = "";
        private b zzvi;

        private d() {
        }

        /* renamed from: apn$d$a */
        /* loaded from: classes.dex */
        public static final class a extends ata.a<d, a> implements auk {
            private a() {
                super(d.zzvj);
            }

            public final a a(String str) {
                s();
                d.a((d) this.a, str);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        public final boolean a() {
            return (this.zzue & 1) != 0;
        }

        public final b b() {
            b bVar = this.zzvi;
            return bVar == null ? b.f() : bVar;
        }

        public static d a(byte[] bArr, asn asnVar) throws zzfi {
            return (d) ata.a(zzvj, bArr, asnVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apm.a[i - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(zzvj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzue", "zzuf", "zzvh", "zzvi", "zzuk", "zzul", "zzum"});
                case 4:
                    return zzvj;
                case 5:
                    aur<d> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (d.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzvj);
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

        public static aur<d> c() {
            return (aur) zzvj.a(ata.d.g);
        }

        static {
            d dVar = new d();
            zzvj = dVar;
            ata.a(d.class, dVar);
        }

        static /* synthetic */ void a(d dVar, String str) {
            if (str == null) {
                throw null;
            }
            dVar.zzue |= 2;
            dVar.zzvh = str;
        }
    }

    /* renamed from: apn$e */
    /* loaded from: classes.dex */
    public static final class e extends ata<e, b> implements auk {
        private static volatile aur<e> zzuo;
        private static final e zzvp;
        public int zzue;
        private int zzvl;
        public boolean zzvn;
        public String zzvm = "";
        public ati<String> zzvo = auw.d();

        /* renamed from: apn$e$a */
        /* loaded from: classes.dex */
        public enum a implements atf {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private static final ate<a> zzvf = new apr();
            private final int value;

            @Override // defpackage.atf
            public final int zzlg() {
                return this.value;
            }

            public static a zzh(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static ath zzlh() {
                return apq.a;
            }

            a(int i) {
                this.value = i;
            }
        }

        private e() {
        }

        /* renamed from: apn$e$b */
        /* loaded from: classes.dex */
        public static final class b extends ata.a<e, b> implements auk {
            private b() {
                super(e.zzvp);
            }

            /* synthetic */ b(byte b) {
                this();
            }
        }

        public final boolean a() {
            return (this.zzue & 1) != 0;
        }

        public final a b() {
            a zzh = a.zzh(this.zzvl);
            return zzh == null ? a.UNKNOWN_MATCH_TYPE : zzh;
        }

        public final boolean c() {
            return (this.zzue & 2) != 0;
        }

        public final int d() {
            return this.zzvo.size();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (apm.a[i - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new b((byte) 0);
                case 3:
                    return a(zzvp, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzue", "zzvl", a.zzlh(), "zzvm", "zzvn", "zzvo"});
                case 4:
                    return zzvp;
                case 5:
                    aur<e> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (e.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzvp);
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

        public static e e() {
            return zzvp;
        }

        static {
            e eVar = new e();
            zzvp = eVar;
            ata.a(e.class, eVar);
        }
    }
}
