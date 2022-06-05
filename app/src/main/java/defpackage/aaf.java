package defpackage;

import android.accounts.Account;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: aaf  reason: default package */
/* loaded from: classes.dex */
public final class aaf {
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    public final Map<vc<?>, abm> d;
    public final String e;
    final String f;
    public final bvn g;
    public Integer h;
    private final int i;
    private final View j;

    /* renamed from: aaf$a */
    /* loaded from: classes.dex */
    public static final class a {
        public Account a;
        public ArraySet<Scope> b;
        public String c;
        public String d;
        private bvn e = bvn.a;

        public final aaf a() {
            return new aaf(this.a, this.b, null, 0, null, this.c, this.d, this.e);
        }
    }

    public aaf(Account account, Set<Scope> set, Map<vc<?>, abm> map, int i, View view, String str, String str2, bvn bvnVar) {
        this.a = account;
        this.b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.d = map == null ? Collections.emptyMap() : map;
        this.j = view;
        this.i = i;
        this.e = str;
        this.f = str2;
        this.g = bvnVar == null ? bvn.a : bvnVar;
        HashSet hashSet = new HashSet(this.b);
        for (abm abmVar : this.d.values()) {
            hashSet.addAll(abmVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
