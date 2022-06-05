package defpackage;

import android.content.Context;
import android.os.Bundle;
import defpackage.bbb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bba  reason: default package */
/* loaded from: classes.dex */
public final class bba extends bbb.a {
    private final /* synthetic */ String c = null;
    private final /* synthetic */ String d = null;
    private final /* synthetic */ Context e;
    private final /* synthetic */ Bundle f;
    private final /* synthetic */ bbb g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bba(bbb bbbVar, Context context, Bundle bundle) {
        super(bbbVar);
        this.g = bbbVar;
        this.e = context;
        this.f = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: RemoteException -> 0x0098, TryCatch #0 {RemoteException -> 0x0098, blocks: (B:3:0x0002, B:5:0x0017, B:7:0x0028, B:13:0x003d, B:15:0x0052, B:17:0x0058, B:19:0x0066, B:30:0x007b), top: B:35:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: RemoteException -> 0x0098, TryCatch #0 {RemoteException -> 0x0098, blocks: (B:3:0x0002, B:5:0x0017, B:7:0x0028, B:13:0x003d, B:15:0x0052, B:17:0x0058, B:19:0x0066, B:30:0x007b), top: B:35:0x0002 }] */
    @Override // defpackage.bbb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            bbb r2 = r14.g     // Catch: android.os.RemoteException -> L98
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.os.RemoteException -> L98
            r3.<init>()     // Catch: android.os.RemoteException -> L98
            defpackage.bbb.a(r2, r3)     // Catch: android.os.RemoteException -> L98
            java.lang.String r2 = r14.c     // Catch: android.os.RemoteException -> L98
            java.lang.String r3 = r14.d     // Catch: android.os.RemoteException -> L98
            boolean r2 = defpackage.bbb.a(r2, r3)     // Catch: android.os.RemoteException -> L98
            r3 = 0
            if (r2 == 0) goto L25
            java.lang.String r3 = r14.d     // Catch: android.os.RemoteException -> L98
            java.lang.String r2 = r14.c     // Catch: android.os.RemoteException -> L98
            bbb r4 = r14.g     // Catch: android.os.RemoteException -> L98
            java.lang.String r4 = defpackage.bbb.b(r4)     // Catch: android.os.RemoteException -> L98
            r10 = r2
            r11 = r3
            r9 = r4
            goto L28
        L25:
            r9 = r3
            r10 = r9
            r11 = r10
        L28:
            android.content.Context r2 = r14.e     // Catch: android.os.RemoteException -> L98
            defpackage.bbb.c(r2)     // Catch: android.os.RemoteException -> L98
            java.lang.Boolean r2 = defpackage.bbb.b()     // Catch: android.os.RemoteException -> L98
            boolean r2 = r2.booleanValue()     // Catch: android.os.RemoteException -> L98
            if (r2 != 0) goto L3c
            if (r10 == 0) goto L3a
            goto L3c
        L3a:
            r2 = 0
            goto L3d
        L3c:
            r2 = 1
        L3d:
            bbb r3 = r14.g     // Catch: android.os.RemoteException -> L98
            bbb r4 = r14.g     // Catch: android.os.RemoteException -> L98
            android.content.Context r5 = r14.e     // Catch: android.os.RemoteException -> L98
            axz r4 = r4.a(r5, r2)     // Catch: android.os.RemoteException -> L98
            defpackage.bbb.a(r3, r4)     // Catch: android.os.RemoteException -> L98
            bbb r3 = r14.g     // Catch: android.os.RemoteException -> L98
            axz r3 = defpackage.bbb.c(r3)     // Catch: android.os.RemoteException -> L98
            if (r3 != 0) goto L58
            bbb r2 = r14.g     // Catch: android.os.RemoteException -> L98
            defpackage.bbb.b(r2)     // Catch: android.os.RemoteException -> L98
            return
        L58:
            android.content.Context r3 = r14.e     // Catch: android.os.RemoteException -> L98
            int r3 = defpackage.bbb.d(r3)     // Catch: android.os.RemoteException -> L98
            android.content.Context r4 = r14.e     // Catch: android.os.RemoteException -> L98
            int r4 = defpackage.bbb.e(r4)     // Catch: android.os.RemoteException -> L98
            if (r2 == 0) goto L71
            int r2 = java.lang.Math.max(r3, r4)     // Catch: android.os.RemoteException -> L98
            if (r4 >= r3) goto L6e
            r3 = 1
            goto L6f
        L6e:
            r3 = 0
        L6f:
            r8 = r3
            goto L7b
        L71:
            if (r3 <= 0) goto L74
            r4 = r3
        L74:
            if (r3 <= 0) goto L78
            r2 = 1
            goto L79
        L78:
            r2 = 0
        L79:
            r8 = r2
            r2 = r4
        L7b:
            baz r13 = new baz     // Catch: android.os.RemoteException -> L98
            r4 = 16250(0x3f7a, double:8.0286E-320)
            long r6 = (long) r2     // Catch: android.os.RemoteException -> L98
            android.os.Bundle r12 = r14.f     // Catch: android.os.RemoteException -> L98
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch: android.os.RemoteException -> L98
            bbb r2 = r14.g     // Catch: android.os.RemoteException -> L98
            axz r2 = defpackage.bbb.c(r2)     // Catch: android.os.RemoteException -> L98
            android.content.Context r3 = r14.e     // Catch: android.os.RemoteException -> L98
            afn r3 = defpackage.afp.a(r3)     // Catch: android.os.RemoteException -> L98
            long r4 = r14.a     // Catch: android.os.RemoteException -> L98
            r2.initialize(r3, r13, r4)     // Catch: android.os.RemoteException -> L98
            return
        L98:
            r2 = move-exception
            bbb r3 = r14.g
            defpackage.bbb.a(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.a():void");
    }
}
