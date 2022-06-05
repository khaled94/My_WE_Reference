package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.cht;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: cjf  reason: default package */
/* loaded from: classes2.dex */
public abstract class cjf<ResultT, CallbackT> implements cid<ciu, ResultT> {
    protected final int a;
    protected cgw c;
    protected chm d;
    protected CallbackT e;
    protected clc f;
    protected cje<ResultT> g;
    protected Executor i;
    protected alf j;
    protected ald k;
    protected alb l;
    protected alo m;
    protected String n;
    protected String o;
    protected chh p;
    protected String q;
    protected String r;
    protected ala s;
    protected boolean t;
    boolean u;
    boolean v;
    private ResultT w;
    private Status x;
    final cjh b = new cjh(this);
    protected final List<cht.b> h = new ArrayList();

    public cjf(int i) {
        this.a = i;
    }

    public abstract void d();

    public final cjf<ResultT, CallbackT> a(cgw cgwVar) {
        this.c = (cgw) aat.a(cgwVar, "firebaseApp cannot be null");
        return this;
    }

    public final cjf<ResultT, CallbackT> a(chm chmVar) {
        this.d = (chm) aat.a(chmVar, "firebaseUser cannot be null");
        return this;
    }

    public final cjf<ResultT, CallbackT> a(CallbackT callbackt) {
        this.e = (CallbackT) aat.a(callbackt, "external callback cannot be null");
        return this;
    }

    public final cjf<ResultT, CallbackT> a(clc clcVar) {
        this.f = (clc) aat.a(clcVar, "external failure callback cannot be null");
        return this;
    }

    @Override // defpackage.cid
    public final cid<ciu, ResultT> c() {
        this.t = true;
        return this;
    }

    public final void b(ResultT resultt) {
        this.u = true;
        this.v = true;
        this.w = resultt;
        this.g.a(resultt, null);
    }

    public final void a(Status status) {
        this.u = true;
        this.v = false;
        this.x = status;
        this.g.a(null, status);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(cjf cjfVar) {
        cjfVar.d();
        aat.b(cjfVar.u, "no success or failure set on method implementation");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(cjf cjfVar, Status status) {
        clc clcVar = cjfVar.f;
        if (clcVar != null) {
            clcVar.a(status);
        }
    }
}
