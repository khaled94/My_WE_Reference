package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bru  reason: default package */
/* loaded from: classes2.dex */
public final class bru implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ long c;
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ String h = null;
    private final /* synthetic */ brs i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bru(brs brsVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.i = brsVar;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
