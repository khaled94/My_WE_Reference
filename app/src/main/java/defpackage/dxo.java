package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n\u001a/\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a&\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/BroadcastChannel;", "broadcastIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "start", "Lkotlinx/coroutines/CoroutineStart;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 5, 1}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: dxo  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class dxo {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @dog(b = "Channels.kt", c = {51, 62}, d = "emitAllImpl$FlowKt__ChannelsKt", e = "kotlinx.coroutines.flow.FlowKt__ChannelsKt")
    /* renamed from: dxo$a */
    /* loaded from: classes2.dex */
    public static final class a<T> extends doe {
        Object a;
        Object b;
        boolean c;
        /* synthetic */ Object d;
        int e;

        a(dnu<? super a> dnuVar) {
            super(dnuVar);
        }

        @Override // defpackage.doc
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return dxo.a(null, null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:17:0x0047, B:23:0x0060, B:25:0x0066, B:31:0x0075, B:32:0x0076), top: B:44:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:17:0x0047, B:23:0x0060, B:25:0x0066, B:31:0x0075, B:32:0x0076), top: B:44:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(defpackage.dxm<? super T> r6, defpackage.dxc<? extends T> r7, boolean r8, defpackage.dnu<? super defpackage.dmg> r9) {
        /*
            boolean r0 = r9 instanceof defpackage.dxo.a
            if (r0 == 0) goto L14
            r0 = r9
            dxo$a r0 = (defpackage.dxo.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.e
            int r9 = r9 - r2
            r0.e = r9
            goto L19
        L14:
            dxo$a r0 = new dxo$a
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.d
            dny r1 = defpackage.dny.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            boolean r6 = r0.c
            java.lang.Object r7 = r0.b
            dxc r7 = (defpackage.dxc) r7
            java.lang.Object r8 = r0.a
            dxm r8 = (defpackage.dxm) r8
        L31:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L4e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            boolean r6 = r0.c
            java.lang.Object r7 = r0.b
            dxc r7 = (defpackage.dxc) r7
            java.lang.Object r8 = r0.a
            dxm r8 = (defpackage.dxm) r8
            dwt r9 = (defpackage.dwt) r9     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r9 = r9.b     // Catch: java.lang.Throwable -> L4c
            goto L60
        L4c:
            r8 = move-exception
            goto L8d
        L4e:
            r0.a = r6     // Catch: java.lang.Throwable -> L89
            r0.b = r7     // Catch: java.lang.Throwable -> L89
            r0.c = r8     // Catch: java.lang.Throwable -> L89
            r0.e = r4     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r7.a_(r0)     // Catch: java.lang.Throwable -> L89
            if (r9 != r1) goto L5d
            return r1
        L5d:
            r5 = r8
            r8 = r6
            r6 = r5
        L60:
            boolean r2 = defpackage.dwt.b(r9)     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L76
            java.lang.Throwable r8 = defpackage.dwt.d(r9)     // Catch: java.lang.Throwable -> L4c
            if (r8 != 0) goto L75
            if (r6 == 0) goto L72
            r6 = 0
            defpackage.dwu.a(r7, r6)
        L72:
            dmg r6 = defpackage.dmg.a
            return r6
        L75:
            throw r8     // Catch: java.lang.Throwable -> L4c
        L76:
            java.lang.Object r9 = defpackage.dwt.c(r9)     // Catch: java.lang.Throwable -> L4c
            r0.a = r8     // Catch: java.lang.Throwable -> L4c
            r0.b = r7     // Catch: java.lang.Throwable -> L4c
            r0.c = r6     // Catch: java.lang.Throwable -> L4c
            r0.e = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r9 = r8.emit(r9, r0)     // Catch: java.lang.Throwable -> L4c
            if (r9 != r1) goto L31
            return r1
        L89:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L8d:
            throw r8     // Catch: java.lang.Throwable -> L8e
        L8e:
            r9 = move-exception
            if (r6 == 0) goto L94
            defpackage.dwu.a(r7, r8)
        L94:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxo.a(dxm, dxc, boolean, dnu):java.lang.Object");
    }
}
