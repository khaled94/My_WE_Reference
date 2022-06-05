package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", ExifInterface.LONGITUDE_EAST, "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: dnw  reason: default package */
/* loaded from: classes2.dex */
public interface dnw {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", ExifInterface.LONGITUDE_EAST, "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    /* renamed from: dnw$c */
    /* loaded from: classes2.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r, dph<? super R, ? super b, ? extends R> dphVar);

    <E extends b> E get(c<E> cVar);

    dnw minusKey(c<?> cVar);

    dnw plus(dnw dnwVar);

    @Metadata(k = 3, mv = {1, 5, 1})
    /* renamed from: dnw$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 5, 1})
        /* renamed from: dnw$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0027a extends dqd implements dph<dnw, b, dnw> {
            public static final C0027a a = new C0027a();

            C0027a() {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [dnt] */
            /* JADX WARN: Type inference failed for: r1v3, types: [dnt] */
            /* JADX WARN: Type inference failed for: r4v4, types: [dnt] */
            @Override // defpackage.dph
            public final /* synthetic */ dnw invoke(dnw dnwVar, b bVar) {
                dnw dnwVar2 = dnwVar;
                b bVar2 = bVar;
                dqc.d(dnwVar2, "acc");
                dqc.d(bVar2, "element");
                dnw minusKey = dnwVar2.minusKey(bVar2.getKey());
                if (minusKey != dnx.a) {
                    dnv dnvVar = (dnv) minusKey.get(dnv.a);
                    if (dnvVar == null) {
                        bVar2 = new dnt(minusKey, bVar2);
                    } else {
                        dnw minusKey2 = minusKey.minusKey(dnv.a);
                        bVar2 = minusKey2 == dnx.a ? new dnt(bVar2, dnvVar) : new dnt(new dnt(minusKey2, bVar2), dnvVar);
                    }
                }
                return bVar2;
            }
        }

        public static dnw a(dnw dnwVar, dnw dnwVar2) {
            dqc.d(dnwVar2, "context");
            return dnwVar2 == dnx.a ? dnwVar : (dnw) dnwVar2.fold(dnwVar, C0027a.a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", ExifInterface.LONGITUDE_EAST, "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    /* renamed from: dnw$b */
    /* loaded from: classes2.dex */
    public interface b extends dnw {
        @Override // defpackage.dnw
        <E extends b> E get(c<E> cVar);

        c<?> getKey();

        @Metadata(k = 3, mv = {1, 5, 1})
        /* renamed from: dnw$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public static dnw a(b bVar, dnw dnwVar) {
                dqc.d(dnwVar, "context");
                return a.a(bVar, dnwVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> cVar) {
                dqc.d(cVar, "key");
                if (dqc.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static <R> R a(b bVar, R r, dph<? super R, ? super b, ? extends R> dphVar) {
                dqc.d(dphVar, "operation");
                return dphVar.invoke(r, bVar);
            }

            public static dnw b(b bVar, c<?> cVar) {
                dqc.d(cVar, "key");
                return dqc.a(bVar.getKey(), cVar) ? dnx.a : bVar;
            }
        }
    }
}
