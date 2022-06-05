package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import defpackage.vc;
import defpackage.vq;

/* renamed from: bik  reason: default package */
/* loaded from: classes2.dex */
public class bik extends bgv {
    private static final String a = bik.class.getSimpleName();
    private final c b;
    private final b c;
    private final f d;
    private final e e;
    private final d f;

    /* renamed from: bik$a */
    /* loaded from: classes2.dex */
    public static abstract class a<R extends vi, A extends vc.f> extends vq.a<R, A> {
        public a(vc vcVar, vf vfVar) {
            super(vcVar, vfVar);
        }
    }

    /* renamed from: bik$c */
    /* loaded from: classes2.dex */
    public static abstract class c<A extends vc.f> extends a<bgr, A> {
    }

    /* renamed from: bik$e */
    /* loaded from: classes2.dex */
    public static abstract class e<A extends vc.f> extends a<Status, A> {
    }

    @Deprecated
    /* renamed from: bik$f */
    /* loaded from: classes2.dex */
    public static abstract class f<A extends vc.f> extends a<bfm, A> {
    }

    /* renamed from: bik$b */
    /* loaded from: classes2.dex */
    public static abstract class b<A extends vc.f> extends a<bgm, A> {
        public b(vc vcVar, vf vfVar) {
            super(vcVar, vfVar);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public final /* synthetic */ vi a(Status status) {
            return new bgm(DataHolder.b(status.i));
        }
    }

    /* renamed from: bik$d */
    /* loaded from: classes2.dex */
    public static abstract class d<A extends vc.f> extends a<bgp, A> {
        public d(vc vcVar, vf vfVar) {
            super(vcVar, vfVar);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public final /* synthetic */ vi a(Status status) {
            return new bgp(DataHolder.b(status.i));
        }
    }

    public bik(b bVar) {
        this.b = null;
        this.c = bVar;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public bik(d dVar) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = dVar;
    }

    @Override // defpackage.bia
    public final void a(DataHolder dataHolder) throws RemoteException {
        aat.b(this.b != null, "placeEstimator cannot be null");
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                new Throwable();
            }
            this.b.b(Status.c);
            return;
        }
        Bundle bundle = dataHolder.e;
        this.b.a((c) new bgr(dataHolder, bundle == null ? 100 : bgr.a(bundle)));
    }

    @Override // defpackage.bia
    public final void b(DataHolder dataHolder) throws RemoteException {
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                new Throwable();
            }
            this.c.b(Status.c);
            return;
        }
        this.c.a((b) new bgm(dataHolder));
    }

    @Override // defpackage.bia
    public final void c(DataHolder dataHolder) throws RemoteException {
        vq.a aVar = null;
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                new Throwable();
            }
            aVar.b(Status.c);
            return;
        }
        aVar.a((vq.a) new bfm(dataHolder));
    }

    @Override // defpackage.bia
    public final void a(Status status) throws RemoteException {
        this.e.a((e) status);
    }

    @Override // defpackage.bia
    public final void d(DataHolder dataHolder) throws RemoteException {
        this.f.a((d) new bgp(dataHolder));
    }
}
