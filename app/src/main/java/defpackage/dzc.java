package defpackage;

import defpackage.dnw;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "updateState", "Lkotlinx/coroutines/internal/ThreadState;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: dzc  reason: default package */
/* loaded from: classes2.dex */
public final class dzc {
    public static final dyy a = new dyy("NO_THREAD_ELEMENTS");
    private static final dph<Object, dnw.b, Object> b = a.a;
    private static final dph<dwb<?>, dnw.b, dwb<?>> c = b.a;
    private static final dph<dzh, dnw.b, dzh> d = c.a;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<no name provided>", "", "countOrElement", "element", "Lkotlin/coroutines/CoroutineContext$Element;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dzc$a */
    /* loaded from: classes2.dex */
    static final class a extends dqd implements dph<Object, dnw.b, Object> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // defpackage.dph
        public final /* synthetic */ Object invoke(Object obj, dnw.b bVar) {
            dnw.b bVar2 = bVar;
            if (bVar2 instanceof dwb) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? bVar2 : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/ThreadContextElement;", "found", "element", "Lkotlin/coroutines/CoroutineContext$Element;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dzc$b */
    /* loaded from: classes2.dex */
    static final class b extends dqd implements dph<dwb<?>, dnw.b, dwb<?>> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // defpackage.dph
        public final /* bridge */ /* synthetic */ dwb<?> invoke(dwb<?> dwbVar, dnw.b bVar) {
            dwb<?> dwbVar2 = dwbVar;
            dnw.b bVar2 = bVar;
            if (dwbVar2 != null) {
                return dwbVar2;
            }
            if (!(bVar2 instanceof dwb)) {
                return null;
            }
            return (dwb) bVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/internal/ThreadState;", "state", "element", "Lkotlin/coroutines/CoroutineContext$Element;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dzc$c */
    /* loaded from: classes2.dex */
    static final class c extends dqd implements dph<dzh, dnw.b, dzh> {
        public static final c a = new c();

        c() {
            super(2);
        }

        @Override // defpackage.dph
        public final /* synthetic */ dzh invoke(dzh dzhVar, dnw.b bVar) {
            dzh dzhVar2 = dzhVar;
            dnw.b bVar2 = bVar;
            if (bVar2 instanceof dwb) {
                dwb<Object> dwbVar = (dwb) bVar2;
                dzhVar2.b[dzhVar2.d] = dwbVar.a(dzhVar2.a);
                dwb<Object>[] dwbVarArr = dzhVar2.c;
                int i = dzhVar2.d;
                dzhVar2.d = i + 1;
                dwbVarArr[i] = dwbVar;
            }
            return dzhVar2;
        }
    }

    public static final Object a(dnw dnwVar) {
        Object fold = dnwVar.fold(0, b);
        dqc.a(fold);
        return fold;
    }

    public static final Object a(dnw dnwVar, Object obj) {
        if (obj == null) {
            obj = a(dnwVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return dnwVar.fold(new dzh(dnwVar, ((Number) obj).intValue()), d);
        }
        return ((dwb) obj).a(dnwVar);
    }

    public static final void b(dnw dnwVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof dzh) {
            dzh dzhVar = (dzh) obj;
            int length = dzhVar.c.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                dwb<Object> dwbVar = dzhVar.c[length];
                dqc.a(dwbVar);
                dwbVar.a((dwb<Object>) dzhVar.b[length]);
                if (i < 0) {
                    return;
                }
                length = i;
            }
        } else {
            Object fold = dnwVar.fold(null, c);
            if (fold == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((dwb) fold).a((dwb) obj);
        }
    }
}
