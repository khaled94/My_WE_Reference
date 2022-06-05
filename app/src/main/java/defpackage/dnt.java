package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dnw;
import defpackage.dqf;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", ExifInterface.LONGITUDE_EAST, "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: dnt  reason: default package */
/* loaded from: classes2.dex */
public final class dnt implements dnw, Serializable {
    private final dnw a;
    private final dnw.b b;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 5, 1})
    /* renamed from: dnt$b */
    /* loaded from: classes2.dex */
    static final class b extends dqd implements dph<String, dnw.b, String> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // defpackage.dph
        public final /* synthetic */ String invoke(String str, dnw.b bVar) {
            String str2 = str;
            dnw.b bVar2 = bVar;
            dqc.d(str2, "acc");
            dqc.d(bVar2, "element");
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: dnt$c */
    /* loaded from: classes2.dex */
    static final class c extends dqd implements dph<dmg, dnw.b, dmg> {
        final /* synthetic */ dnw[] a;
        final /* synthetic */ dqf.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(dnw[] dnwVarArr, dqf.a aVar) {
            super(2);
            this.a = dnwVarArr;
            this.b = aVar;
        }

        @Override // defpackage.dph
        public final /* synthetic */ dmg invoke(dmg dmgVar, dnw.b bVar) {
            dnw.b bVar2 = bVar;
            dqc.d(dmgVar, "<anonymous parameter 0>");
            dqc.d(bVar2, "element");
            dnw[] dnwVarArr = this.a;
            dqf.a aVar = this.b;
            int i = aVar.a;
            aVar.a = i + 1;
            dnwVarArr[i] = bVar2;
            return dmg.a;
        }
    }

    public dnt(dnw dnwVar, dnw.b bVar) {
        dqc.d(dnwVar, "left");
        dqc.d(bVar, "element");
        this.a = dnwVar;
        this.b = bVar;
    }

    @Override // defpackage.dnw
    public final dnw plus(dnw dnwVar) {
        dqc.d(dnwVar, "context");
        return dnw.a.a(this, dnwVar);
    }

    @Override // defpackage.dnw
    public final <E extends dnw.b> E get(dnw.c<E> cVar) {
        dqc.d(cVar, "key");
        dnw dnwVar = this;
        while (true) {
            dnt dntVar = (dnt) dnwVar;
            E e = (E) dntVar.b.get(cVar);
            if (e != null) {
                return e;
            }
            dnwVar = dntVar.a;
            if (!(dnwVar instanceof dnt)) {
                return (E) dnwVar.get(cVar);
            }
        }
    }

    @Override // defpackage.dnw
    public final <R> R fold(R r, dph<? super R, ? super dnw.b, ? extends R> dphVar) {
        dqc.d(dphVar, "operation");
        return dphVar.invoke((Object) this.a.fold(r, dphVar), this.b);
    }

    @Override // defpackage.dnw
    public final dnw minusKey(dnw.c<?> cVar) {
        dqc.d(cVar, "key");
        if (this.b.get(cVar) != null) {
            return this.a;
        }
        dnw minusKey = this.a.minusKey(cVar);
        return minusKey == this.a ? this : minusKey == dnx.a ? this.b : new dnt(minusKey, this.b);
    }

    private final int a() {
        dnt dntVar = this;
        int i = 2;
        while (true) {
            dnw dnwVar = dntVar.a;
            if (!(dnwVar instanceof dnt)) {
                dnwVar = null;
            }
            dntVar = (dnt) dnwVar;
            if (dntVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean a(dnw.b bVar) {
        return dqc.a(get(bVar.getKey()), bVar);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof dnt) {
                dnt dntVar = (dnt) obj;
                if (dntVar.a() == a()) {
                    dnt dntVar2 = this;
                    while (true) {
                        if (!dntVar.a(dntVar2.b)) {
                            z = false;
                            break;
                        }
                        dnw dnwVar = dntVar2.a;
                        if (dnwVar instanceof dnt) {
                            dntVar2 = (dnt) dnwVar;
                        } else if (dnwVar == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        } else {
                            z = dntVar.a((dnw.b) dnwVar);
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    public final String toString() {
        return "[" + ((String) fold("", b.a)) + "]";
    }

    private final Object writeReplace() {
        int a2 = a();
        dnw[] dnwVarArr = new dnw[a2];
        dqf.a aVar = new dqf.a();
        boolean z = false;
        aVar.a = 0;
        fold(dmg.a, new c(dnwVarArr, aVar));
        if (aVar.a == a2) {
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return new a(dnwVarArr);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    /* renamed from: dnt$a */
    /* loaded from: classes2.dex */
    static final class a implements Serializable {
        public static final C0026a a = new C0026a((byte) 0);
        private final dnw[] b;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
        /* renamed from: dnt$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0026a {
            private C0026a() {
            }

            public /* synthetic */ C0026a(byte b) {
                this();
            }
        }

        public a(dnw[] dnwVarArr) {
            dqc.d(dnwVarArr, "elements");
            this.b = dnwVarArr;
        }

        private final Object readResolve() {
            dnw[] dnwVarArr = this.b;
            dnw dnwVar = dnx.a;
            for (dnw dnwVar2 : dnwVarArr) {
                dnwVar = dnwVar.plus(dnwVar2);
            }
            return dnwVar;
        }
    }
}
