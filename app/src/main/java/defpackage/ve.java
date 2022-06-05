package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.ArraySet;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import defpackage.aaf;
import defpackage.vc;
import defpackage.vc.d;
import defpackage.vf;
import defpackage.vq;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: ve  reason: default package */
/* loaded from: classes2.dex */
public abstract class ve<O extends vc.d> {
    private final String a;
    public final Context b;
    protected final O c;
    public final vo<O> d;
    public final Looper e;
    public final int f;
    @NotOnlyInitialized
    public final vf g;
    protected final vs h;
    private final vc<O> i;
    private final wd j;

    /* renamed from: ve$a */
    /* loaded from: classes2.dex */
    public static class a {
        public static final a a = new C0051a().a();
        public final wd b;
        public final Looper c;

        /* renamed from: ve$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0051a {
            Looper a;
            private wd b;

            public final C0051a a(wd wdVar) {
                aat.a(wdVar, "StatusExceptionMapper must not be null.");
                this.b = wdVar;
                return this;
            }

            public final a a() {
                if (this.b == null) {
                    this.b = new vn();
                }
                if (this.a == null) {
                    this.a = Looper.getMainLooper();
                }
                return new a(this.b, this.a, (byte) 0);
            }
        }

        private a(wd wdVar, Looper looper) {
            this.b = wdVar;
            this.c = looper;
        }

        /* synthetic */ a(wd wdVar, Looper looper, byte b) {
            this(wdVar, looper);
        }
    }

    public ve(Activity activity, vc<O> vcVar, O o, a aVar) {
        this(activity, activity, vcVar, o, aVar);
    }

    private final <TResult, A extends vc.b> bwl<TResult> a(int i, wf<A, TResult> wfVar) {
        bwm bwmVar = new bwm();
        this.h.a(this, i, wfVar, bwmVar, this.j);
        return bwmVar.a;
    }

    private final <A extends vc.b, T extends vq.a<? extends vi, A>> T a(int i, T t) {
        t.b();
        this.h.a(this, i, (vq.a<? extends vi, vc.b>) t);
        return t;
    }

    public final vc.f a(Looper looper, xr<O> xrVar) {
        vc.f a2 = ((vc.a) aat.a(this.i.a)).a(this.b, looper, d().a(), (aaf) this.c, (vf.b) xrVar, (vf.c) xrVar);
        String str = this.a;
        if (str != null && (a2 instanceof aad)) {
            ((aad) a2).j = str;
        }
        if (str != null && (a2 instanceof vy)) {
            ((vy) a2).d = str;
        }
        return a2;
    }

    public final <A extends vc.b, T extends vq.a<? extends vi, A>> T a(T t) {
        a(0, (int) t);
        return t;
    }

    public final <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t) {
        a(1, (int) t);
        return t;
    }

    public final aaf.a d() {
        Set<Scope> set;
        GoogleSignInAccount a2;
        aaf.a aVar = new aaf.a();
        O o = this.c;
        Account account = null;
        if (!(o instanceof vc.d.b) || (a2 = ((vc.d.b) o).a()) == null) {
            O o2 = this.c;
            if (o2 instanceof vc.d.a) {
                account = ((vc.d.a) o2).a();
            }
        } else {
            String str = a2.d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        aVar.a = account;
        O o3 = this.c;
        if (o3 instanceof vc.d.b) {
            GoogleSignInAccount a3 = ((vc.d.b) o3).a();
            if (a3 == null) {
                set = Collections.emptySet();
            } else {
                set = a3.a();
            }
        } else {
            set = Collections.emptySet();
        }
        if (aVar.b == null) {
            aVar.b = new ArraySet<>();
        }
        aVar.b.addAll(set);
        aVar.d = this.b.getClass().getName();
        aVar.c = this.b.getPackageName();
        return aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ve(android.app.Activity r3, defpackage.vc<O> r4, O r5, defpackage.wd r6) {
        /*
            r2 = this;
            ve$a$a r0 = new ve$a$a
            r0.<init>()
            r0.a(r6)
            android.os.Looper r6 = r3.getMainLooper()
            java.lang.String r1 = "Looper must not be null."
            defpackage.aat.a(r6, r1)
            r0.a = r6
            ve$a r6 = r0.a()
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve.<init>(android.app.Activity, vc, vc$d, wd):void");
    }

    public final <TResult, A extends vc.b> bwl<TResult> a(wf<A, TResult> wfVar) {
        return a(2, wfVar);
    }

    public final <TResult, A extends vc.b> bwl<TResult> b(wf<A, TResult> wfVar) {
        return a(0, wfVar);
    }

    public final <TResult, A extends vc.b> bwl<TResult> c(wf<A, TResult> wfVar) {
        return a(1, wfVar);
    }

    private ve(Context context, Activity activity, vc<O> vcVar, O o, a aVar) {
        aat.a(context, "Null context is not permitted.");
        aat.a(vcVar, "Api must not be null.");
        aat.a(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.b = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.a = str;
        this.i = vcVar;
        this.c = o;
        this.e = aVar.c;
        this.d = new vo<>(this.i, this.c, this.a);
        this.g = new xv(this);
        vs a2 = vs.a(this.b);
        this.h = a2;
        this.f = a2.c.getAndIncrement();
        this.j = aVar.b;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            wk.a(activity, this.h, (vo<?>) this.d);
        }
        Handler handler = this.h.f;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public ve(Context context, vc<O> vcVar, O o, a aVar) {
        this(context, null, vcVar, o, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ve(android.content.Context r2, defpackage.vc<O> r3, O r4, defpackage.wd r5) {
        /*
            r1 = this;
            ve$a$a r0 = new ve$a$a
            r0.<init>()
            r0.a(r5)
            ve$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve.<init>(android.content.Context, vc, vc$d, wd):void");
    }
}
