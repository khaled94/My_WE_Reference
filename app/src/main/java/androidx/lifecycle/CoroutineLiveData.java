package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u0013\u001a\u00020\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u000bH\u0014J\b\u0010\u001d\u001a\u00020\u000bH\u0014R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MediatorLiveData;", "context", "Lkotlin/coroutines/CoroutineContext;", "timeoutInMs", "", "block", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "blockRunner", "Landroidx/lifecycle/BlockRunner;", "emittedSource", "Landroidx/lifecycle/EmittedSource;", "clearSource", "clearSource$lifecycle_livedata_ktx_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "Lkotlinx/coroutines/DisposableHandle;", "source", "Landroidx/lifecycle/LiveData;", "emitSource$lifecycle_livedata_ktx_release", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActive", "onInactive", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    private BlockRunner<T> blockRunner;
    private EmittedSource emittedSource;

    public /* synthetic */ CoroutineLiveData(dnx dnxVar, long j, dph dphVar, int i, dpx dpxVar) {
        this((i & 1) != 0 ? dnx.a : dnxVar, (i & 2) != 0 ? CoroutineLiveDataKt.DEFAULT_TIMEOUT : j, dphVar);
    }

    public CoroutineLiveData(dnw dnwVar, long j, dph<? super LiveDataScope<T>, ? super dnu<? super dmg>, ? extends Object> dphVar) {
        dqc.d(dnwVar, "context");
        dqc.d(dphVar, "block");
        this.blockRunner = new BlockRunner<>(this, dphVar, j, dud.a(dup.b().a().plus(dnwVar).plus(dwa.a((dvi) dnwVar.get(dvi.b)))), new AnonymousClass1());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, k = 3, mv = {1, 4, 0})
    /* renamed from: androidx.lifecycle.CoroutineLiveData$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends dqd implements dov<dmg> {
        AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.dov
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CoroutineLiveData.this.blockRunner = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public final void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public final void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emitSource$lifecycle_livedata_ktx_release(androidx.lifecycle.LiveData<T> r7, defpackage.dnu<? super defpackage.duq> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L14
            r0 = r8
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            dny r1 = defpackage.dny.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r7 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r7 = (androidx.lifecycle.CoroutineLiveData) r7
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$1
            androidx.lifecycle.LiveData r7 = (androidx.lifecycle.LiveData) r7
            java.lang.Object r8 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r8 = (androidx.lifecycle.CoroutineLiveData) r8
            r5 = r8
            r8 = r7
            r7 = r5
            goto L4f
        L40:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.clearSource$lifecycle_livedata_ktx_release(r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r8 = r7
            r7 = r6
        L4f:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r8 = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(r7, r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            androidx.lifecycle.EmittedSource r8 = (androidx.lifecycle.EmittedSource) r8
            r7.emittedSource = r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.emitSource$lifecycle_livedata_ktx_release(androidx.lifecycle.LiveData, dnu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clearSource$lifecycle_livedata_ktx_release(defpackage.dnu<? super defpackage.dmg> r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L14
            r0 = r4
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r4 = r0.label
            int r4 = r4 - r2
            r0.label = r4
            goto L19
        L14:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r3, r4)
        L19:
            dny r4 = defpackage.dny.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.lang.Object r4 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r4 = (androidx.lifecycle.CoroutineLiveData) r4
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2f:
            androidx.lifecycle.EmittedSource r1 = r3.emittedSource
            if (r1 == 0) goto L3e
            r0.L$0 = r3
            r0.label = r2
            java.lang.Object r0 = r1.disposeNow(r0)
            if (r0 != r4) goto L3e
            return r4
        L3e:
            r4 = r3
        L3f:
            r0 = 0
            r4.emittedSource = r0
            dmg r4 = defpackage.dmg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.clearSource$lifecycle_livedata_ktx_release(dnu):java.lang.Object");
    }
}
