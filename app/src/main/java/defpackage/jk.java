package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jk  reason: default package */
/* loaded from: classes2.dex */
public class jk extends Fragment {
    final ir a;
    final jh b;
    bv c;
    Fragment d;
    private final Set<jk> e;
    private jk f;

    public jk() {
        this(new ir());
    }

    private jk(ir irVar) {
        this.b = new a();
        this.e = new HashSet();
        this.a = irVar;
    }

    final Set<jk> a() {
        jk jkVar = this.f;
        if (jkVar == null) {
            return Collections.emptySet();
        }
        if (equals(jkVar)) {
            return Collections.unmodifiableSet(this.e);
        }
        HashSet hashSet = new HashSet();
        for (jk jkVar2 : this.f.a()) {
            if (a(jkVar2.b())) {
                hashSet.add(jkVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private Fragment b() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.d;
    }

    private boolean a(Fragment fragment) {
        Fragment b = b();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment != null) {
                if (parentFragment.equals(b)) {
                    return true;
                }
                fragment = fragment.getParentFragment();
            } else {
                return false;
            }
        }
    }

    private void c() {
        jk jkVar = this.f;
        if (jkVar != null) {
            jkVar.e.remove(this);
            this.f = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        try {
            Context context2 = getContext();
            c();
            jk a2 = bo.a(context2).e.a(fragmentManager);
            this.f = a2;
            if (equals(a2)) {
                return;
            }
            this.f.e.add(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.d = null;
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + b() + "}";
    }

    /* renamed from: jk$a */
    /* loaded from: classes2.dex */
    class a implements jh {
        a() {
        }

        @Override // defpackage.jh
        public final Set<bv> a() {
            Set<jk> a = jk.this.a();
            HashSet hashSet = new HashSet(a.size());
            for (jk jkVar : a) {
                if (jkVar.c != null) {
                    hashSet.add(jkVar.c);
                }
            }
            return hashSet;
        }

        public final String toString() {
            return super.toString() + "{fragment=" + jk.this + "}";
        }
    }
}
