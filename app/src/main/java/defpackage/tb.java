package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import defpackage.vc;
import java.util.Arrays;

/* renamed from: tb  reason: default package */
/* loaded from: classes2.dex */
public final class tb {
    public static final vc.g g = new vc.g();
    public static final vc.g h = new vc.g();
    private static final vc.a i = new ur();
    private static final vc.a j = new us();
    @Deprecated
    public static final vc<td> a = tc.a;
    public static final vc<a> b = new vc<>("Auth.CREDENTIALS_API", i, g);
    public static final vc<GoogleSignInOptions> c = new vc<>("Auth.GOOGLE_SIGN_IN_API", j, h);
    @Deprecated
    public static final ti d = tc.b;
    public static final te e = new aie();
    public static final tk f = new tu();

    @Deprecated
    /* renamed from: tb$a */
    /* loaded from: classes2.dex */
    public static class a implements vc.d.f {
        public static final a a = new a(new C0049a());
        public final boolean b;
        public final String c;
        private final String d = null;

        @Deprecated
        /* renamed from: tb$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0049a {
            protected Boolean a;
            protected String b;

            public C0049a() {
                this.a = Boolean.FALSE;
            }

            public final C0049a a(String str) {
                this.b = str;
                return this;
            }

            public C0049a(a aVar) {
                this.a = Boolean.FALSE;
                a.a();
                this.a = Boolean.valueOf(aVar.b);
                this.b = aVar.c;
            }
        }

        public a(C0049a c0049a) {
            this.b = c0049a.a.booleanValue();
            this.c = c0049a.b;
        }

        static /* bridge */ /* synthetic */ String a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aar.a(null, null) && this.b == aVar.b && aar.a(this.c, aVar.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.b), this.c});
        }
    }

    private tb() {
    }
}
