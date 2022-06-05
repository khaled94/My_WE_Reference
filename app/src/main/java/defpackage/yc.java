package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yc  reason: default package */
/* loaded from: classes2.dex */
public final class yc<T> implements bwh<T> {
    private final vs a;
    private final int b;
    private final vo<?> c;
    private final long d;
    private final long e;

    private yc(vs vsVar, int i, vo<?> voVar, long j, long j2) {
        this.a = vsVar;
        this.b = i;
        this.c = voVar;
        this.d = j;
        this.e = j2;
    }

    private static aag a(xr<?> xrVar, aad<?> aadVar, int i) {
        int[] iArr;
        int[] iArr2;
        aag r = aadVar.r();
        if (r == null || !r.b || ((iArr = r.d) != null ? !adv.a(iArr, i) : !((iArr2 = r.f) == null || !adv.a(iArr2, i))) || xrVar.h >= r.e) {
            return null;
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> yc<T> a(vs vsVar, int i, vo<?> voVar) {
        if (!vsVar.e()) {
            return null;
        }
        aav aavVar = aau.a().a;
        boolean z = true;
        if (aavVar != null) {
            if (!aavVar.b) {
                return null;
            }
            boolean z2 = aavVar.c;
            xr a = vsVar.a(voVar);
            if (a != null) {
                if (!(a.a instanceof aad)) {
                    return null;
                }
                aad aadVar = (aad) a.a;
                if (aadVar.x() && !aadVar.k()) {
                    aag a2 = a(a, aadVar, i);
                    if (a2 == null) {
                        return null;
                    }
                    a.h++;
                    z = a2.c;
                }
            }
            z = z2;
        }
        return new yc<>(vsVar, i, voVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
    }

    @Override // defpackage.bwh
    public final void onComplete(bwl<T> bwlVar) {
        xr a;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        if (!this.a.e()) {
            return;
        }
        aav aavVar = aau.a().a;
        if ((aavVar != null && !aavVar.b) || (a = this.a.a(this.c)) == null || !(a.a instanceof aad)) {
            return;
        }
        aad aadVar = (aad) a.a;
        boolean z = true;
        int i6 = 0;
        boolean z2 = this.d > 0;
        int i7 = aadVar.i;
        if (aavVar != null) {
            z2 &= aavVar.c;
            int i8 = aavVar.d;
            int i9 = aavVar.e;
            i3 = aavVar.a;
            if (aadVar.x() && !aadVar.k()) {
                aag a2 = a(a, aadVar, this.b);
                if (a2 == null) {
                    return;
                }
                if (!a2.c || this.d <= 0) {
                    z = false;
                }
                i9 = a2.e;
                z2 = z;
            }
            i2 = i8;
            i = i9;
        } else {
            i3 = 0;
            i2 = 5000;
            i = 100;
        }
        vs vsVar = this.a;
        if (bwlVar.e()) {
            i4 = 0;
        } else {
            if (bwlVar.c()) {
                i6 = 100;
            } else {
                Exception a3 = bwlVar.a();
                if (a3 instanceof ApiException) {
                    Status a4 = ((ApiException) a3).a();
                    int i10 = a4.i;
                    ConnectionResult connectionResult = a4.k;
                    i4 = connectionResult == null ? -1 : connectionResult.c;
                    i6 = i10;
                } else {
                    i6 = 101;
                }
            }
            i4 = -1;
        }
        if (z2) {
            long j3 = this.d;
            long currentTimeMillis = System.currentTimeMillis();
            i5 = (int) (SystemClock.elapsedRealtime() - this.e);
            j2 = j3;
            j = currentTimeMillis;
        } else {
            j2 = 0;
            j = 0;
            i5 = -1;
        }
        aaq aaqVar = new aaq(this.b, i6, i4, j2, j, null, null, i7, i5);
        long j4 = i2;
        Handler handler = vsVar.f;
        handler.sendMessage(handler.obtainMessage(18, new yd(aaqVar, i3, j4, i)));
    }
}
