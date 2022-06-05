package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import defpackage.vc;
import defpackage.vf;
import java.util.Collections;
import java.util.Set;

/* renamed from: aai  reason: default package */
/* loaded from: classes.dex */
public abstract class aai<T extends IInterface> extends aad<T> implements abu, vc.f {
    private final Set<Scope> a;
    protected final aaf l;
    private final Account m;

    @Override // defpackage.vc.f
    public final Set<Scope> h() {
        return m() ? this.a : Collections.emptySet();
    }

    @Override // defpackage.aad
    public final Account o() {
        return this.m;
    }

    @Override // defpackage.aad
    protected final Set<Scope> t() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public aai(Context context, Looper looper, int i, aaf aafVar, vf.b bVar, vf.c cVar) {
        this(context, looper, i, aafVar, (vr) bVar, (vz) cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aai(Context context, Looper looper, int i, aaf aafVar, vr vrVar, vz vzVar) {
        this(context, looper, aaj.a(context), ux.a(), i, aafVar, (vr) aat.a(vrVar), (vz) aat.a(vzVar));
    }

    private aai(Context context, Looper looper, aaj aajVar, ux uxVar, int i, aaf aafVar, vr vrVar, vz vzVar) {
        super(context, looper, aajVar, uxVar, i, vrVar == null ? null : new abs(vrVar), vzVar == null ? null : new abt(vzVar), aafVar.f);
        this.l = aafVar;
        this.m = aafVar.a;
        Set<Scope> set = aafVar.c;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.a = set;
    }
}
