package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.Scope;
import defpackage.vc;
import defpackage.vq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* renamed from: vf  reason: default package */
/* loaded from: classes2.dex */
public abstract class vf {
    private static final Set<vf> a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: vf$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private Account a;
        private int d;
        private View e;
        private String f;
        private String g;
        private final Context i;
        private vu k;
        private c m;
        private Looper n;
        private final Set<Scope> b = new HashSet();
        private final Set<Scope> c = new HashSet();
        private final Map<vc<?>, abm> h = new ArrayMap();
        private final Map<vc<?>, vc.d> j = new ArrayMap();
        private int l = -1;
        private ux o = ux.a();
        private vc.a<? extends bwe, bvn> p = bwd.c;
        private final ArrayList<b> q = new ArrayList<>();
        private final ArrayList<c> r = new ArrayList<>();

        public a(Context context) {
            this.i = context;
            this.n = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        public final a a(FragmentActivity fragmentActivity, c cVar) {
            vu vuVar = new vu(fragmentActivity);
            aat.a(true, (Object) "clientId must be non-negative");
            this.l = 0;
            this.m = cVar;
            this.k = vuVar;
            return this;
        }

        public final a a(vc<? extends vc.d.e> vcVar) {
            aat.a(vcVar, "Api must not be null");
            this.j.put(vcVar, null);
            List<Scope> a = ((vc.e) aat.a(vcVar.a, "Base client builder must not be null")).a();
            this.c.addAll(a);
            this.b.addAll(a);
            return this;
        }

        public final a a(b bVar) {
            aat.a(bVar, "Listener must not be null");
            this.q.add(bVar);
            return this;
        }

        public final vf a() {
            boolean z;
            aat.a(!this.j.isEmpty(), "must call addApi() to add at least one API");
            bvn bvnVar = bvn.a;
            if (this.j.containsKey(bwd.g)) {
                bvnVar = (bvn) this.j.get(bwd.g);
            }
            aaf aafVar = new aaf(this.a, this.b, this.h, this.d, this.e, this.f, this.g, bvnVar);
            Map<vc<?>, abm> map = aafVar.d;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            Iterator<vc<?>> it = this.j.keySet().iterator();
            vc<?> vcVar = null;
            while (true) {
                boolean z2 = false;
                if (it.hasNext()) {
                    vc<?> next = it.next();
                    vc.d dVar = this.j.get(next);
                    if (map.get(next) != null) {
                        z2 = true;
                    }
                    arrayMap.put(next, Boolean.valueOf(z2));
                    zi ziVar = new zi(next, z2);
                    arrayList.add(ziVar);
                    vc.f a = ((vc.a) aat.a(next.a)).a(this.i, this.n, aafVar, (aaf) dVar, (b) ziVar, (c) ziVar);
                    arrayMap2.put(next.b, a);
                    if (a.e()) {
                        if (vcVar != null) {
                            String str = next.c;
                            String str2 = vcVar.c;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                            sb.append(str);
                            sb.append(" cannot be used with ");
                            sb.append(str2);
                            throw new IllegalStateException(sb.toString());
                        }
                        vcVar = next;
                    }
                } else {
                    if (vcVar != null) {
                        z = true;
                        aat.b(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", vcVar.c);
                        aat.b(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", vcVar.c);
                    } else {
                        z = true;
                    }
                    xf xfVar = new xf(this.i, new ReentrantLock(), this.n, aafVar, this.o, this.p, arrayMap, this.q, this.r, arrayMap2, this.l, xf.a(arrayMap2.values(), z), arrayList);
                    synchronized (vf.a) {
                        vf.a.add(xfVar);
                    }
                    if (this.l >= 0) {
                        za.b(this.k).a(this.l, xfVar, this.m);
                    }
                    return xfVar;
                }
            }
        }
    }

    @Deprecated
    /* renamed from: vf$b */
    /* loaded from: classes2.dex */
    public interface b extends vr {
    }

    @Deprecated
    /* renamed from: vf$c */
    /* loaded from: classes2.dex */
    public interface c extends vz {
    }

    public static Set<vf> b() {
        Set<vf> set;
        synchronized (a) {
            set = a;
        }
        return set;
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(FragmentActivity fragmentActivity);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void a(c cVar);

    public void a(ys ysVar) {
        throw new UnsupportedOperationException();
    }

    public boolean a(wc wcVar) {
        throw new UnsupportedOperationException();
    }

    public <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void b(c cVar);

    public void b(ys ysVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void c();

    public abstract void d();

    public void e() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean f();
}
