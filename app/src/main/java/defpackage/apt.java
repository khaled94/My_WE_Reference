package defpackage;

import defpackage.ata;

/* renamed from: apt  reason: default package */
/* loaded from: classes.dex */
public final class apt {

    /* renamed from: apt$a */
    /* loaded from: classes.dex */
    public static final class a extends ata<a, C0014a> implements auk {
        private static volatile aur<a> zzuo;
        private static final a zzwa;
        private int zzue;
        public String zzvy = "";
        public String zzvz = "";

        private a() {
        }

        /* renamed from: apt$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0014a extends ata.a<a, C0014a> implements auk {
            private C0014a() {
                super(a.zzwa);
            }

            /* synthetic */ C0014a(byte b) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.ata
        public final Object a(int i) {
            switch (aps.a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0014a((byte) 0);
                case 3:
                    return a(zzwa, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzue", "zzvy", "zzvz"});
                case 4:
                    return zzwa;
                case 5:
                    aur<a> aurVar = zzuo;
                    if (aurVar == null) {
                        synchronized (a.class) {
                            aurVar = zzuo;
                            if (aurVar == null) {
                                aurVar = new ata.c<>(zzwa);
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

        public static aur<a> a() {
            return (aur) zzwa.a(ata.d.g);
        }

        static {
            a aVar = new a();
            zzwa = aVar;
            ata.a(a.class, aVar);
        }
    }
}
