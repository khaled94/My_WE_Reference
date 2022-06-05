package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: jf  reason: default package */
/* loaded from: classes2.dex */
public final class jf extends Fragment {
    final ir a;
    final jh b;
    bv c;
    Fragment d;
    private final Set<jf> e;
    private jf f;

    public jf() {
        this(new ir());
    }

    private jf(ir irVar) {
        this.b = new a();
        this.e = new HashSet();
        this.a = irVar;
    }

    final Set<jf> a() {
        if (equals(this.f)) {
            return Collections.unmodifiableSet(this.e);
        }
        if (this.f == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (jf jfVar : this.f.a()) {
            if (a(jfVar.getParentFragment())) {
                hashSet.add(jfVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private boolean a(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 != null) {
                if (parentFragment2.equals(parentFragment)) {
                    return true;
                }
                fragment = fragment.getParentFragment();
            } else {
                return false;
            }
        }
    }

    private void b() {
        jf jfVar = this.f;
        if (jfVar != null) {
            jfVar.e.remove(this);
            this.f = null;
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            b();
            jf a2 = bo.a(activity).e.a(activity.getFragmentManager());
            this.f = a2;
            if (equals(a2)) {
                return;
            }
            this.f.e.add(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        b();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a.a();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a.b();
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.c();
        b();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        if (parentFragment == null) {
            parentFragment = this.d;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: jf$a */
    /* loaded from: classes2.dex */
    class a implements jh {
        a() {
        }

        @Override // defpackage.jh
        public final Set<bv> a() {
            Set<jf> a = jf.this.a();
            HashSet hashSet = new HashSet(a.size());
            for (jf jfVar : a) {
                if (jfVar.c != null) {
                    hashSet.add(jfVar.c);
                }
            }
            return hashSet;
        }

        public final String toString() {
            return super.toString() + "{fragment=" + jf.this + "}";
        }
    }
}
