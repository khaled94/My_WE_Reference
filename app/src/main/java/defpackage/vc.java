package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import defpackage.aad;
import defpackage.vc.d;
import defpackage.vf;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: vc  reason: default package */
/* loaded from: classes2.dex */
public final class vc<O extends d> {
    final a<?, O> a;
    public final g<?> b;
    public final String c;

    /* renamed from: vc$a */
    /* loaded from: classes2.dex */
    public static abstract class a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, aaf aafVar, O o, vf.b bVar, vf.c cVar) {
            return a(context, looper, aafVar, (aaf) o, (vr) bVar, (vz) cVar);
        }

        public T a(Context context, Looper looper, aaf aafVar, O o, vr vrVar, vz vzVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: vc$b */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* renamed from: vc$c */
    /* loaded from: classes2.dex */
    public static class c<C extends b> {
    }

    /* renamed from: vc$d */
    /* loaded from: classes2.dex */
    public interface d {
        public static final C0050d i = new C0050d((byte) 0);

        /* renamed from: vc$d$a */
        /* loaded from: classes2.dex */
        public interface a extends c, e {
            Account a();
        }

        /* renamed from: vc$d$b */
        /* loaded from: classes2.dex */
        public interface b extends c {
            GoogleSignInAccount a();
        }

        /* renamed from: vc$d$c */
        /* loaded from: classes2.dex */
        public interface c extends d {
        }

        /* renamed from: vc$d$d  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0050d implements e {
            private C0050d() {
            }

            /* synthetic */ C0050d(byte b) {
            }
        }

        /* renamed from: vc$d$e */
        /* loaded from: classes2.dex */
        public interface e extends d {
        }

        /* renamed from: vc$d$f */
        /* loaded from: classes2.dex */
        public interface f extends c, e {
        }
    }

    /* renamed from: vc$e */
    /* loaded from: classes2.dex */
    public static abstract class e<T extends b, O> {
        public List<Scope> a() {
            return Collections.emptyList();
        }
    }

    /* renamed from: vc$f */
    /* loaded from: classes2.dex */
    public interface f extends b {
        int a();

        void a(aad.c cVar);

        void a(aad.e eVar);

        void a(aal aalVar, Set<Scope> set);

        void a(String str);

        void a(String str, PrintWriter printWriter);

        Intent b();

        boolean e();

        String f();

        String g();

        Set<Scope> h();

        void i();

        boolean j();

        boolean k();

        boolean l();

        boolean m();

        uw[] n();
    }

    /* renamed from: vc$g */
    /* loaded from: classes2.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> vc(String str, a<C, O> aVar, g<C> gVar) {
        aat.a(aVar, "Cannot construct an Api with a null ClientBuilder");
        aat.a(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }
}
