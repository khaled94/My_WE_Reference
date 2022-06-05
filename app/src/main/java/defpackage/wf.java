package defpackage;

import android.os.RemoteException;
import defpackage.vc;
import defpackage.vc.b;

/* renamed from: wf  reason: default package */
/* loaded from: classes2.dex */
public abstract class wf<A extends vc.b, ResultT> {
    final uw[] a;
    final boolean b;
    final int c;

    /* renamed from: wf$a */
    /* loaded from: classes2.dex */
    public static class a<A extends vc.b, ResultT> {
        public wb<A, bwm<ResultT>> a;
        public uw[] c;
        public boolean b = true;
        public int d = 0;

        private a() {
        }

        /* synthetic */ a(byte b) {
        }

        public final wf<A, ResultT> a() {
            aat.a(this.a != null, "execute parameter required");
            return new yo(this, this.c, this.b, this.d);
        }
    }

    @Deprecated
    public wf() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public wf(uw[] uwVarArr, boolean z, int i) {
        this.a = uwVarArr;
        boolean z2 = false;
        if (uwVarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static <A extends vc.b, ResultT> a<A, ResultT> a() {
        return new a<>((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(A a2, bwm<ResultT> bwmVar) throws RemoteException;
}
