package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: dse  reason: default package */
/* loaded from: classes2.dex */
public final class dse implements drq<dra> {
    final CharSequence a;
    final int b = 0;
    final int c;
    final dph<CharSequence, Integer, dma<Integer, Integer>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public dse(CharSequence charSequence, int i, dph<? super CharSequence, ? super Integer, dma<Integer, Integer>> dphVar) {
        dqc.d(charSequence, "input");
        dqc.d(dphVar, "getNextMatch");
        this.a = charSequence;
        this.c = i;
        this.d = dphVar;
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    /* renamed from: dse$a */
    /* loaded from: classes2.dex */
    public static final class a implements dqk, Iterator<dra> {
        private int b = -1;
        private int c;
        private int d;
        private dra e;
        private int f;

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        a() {
            int a = drb.a(dse.this.b, 0, dse.this.a.length());
            this.c = a;
            this.d = a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r0 < r6.a.c) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.d
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.b = r1
                r0 = 0
                r6.e = r0
                return
            Lb:
                dse r0 = defpackage.dse.this
                int r0 = r0.c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L1e
                int r0 = r6.f
                int r0 = r0 + r3
                r6.f = r0
                dse r4 = defpackage.dse.this
                int r4 = r4.c
                if (r0 >= r4) goto L2a
            L1e:
                int r0 = r6.d
                dse r4 = defpackage.dse.this
                java.lang.CharSequence r4 = r4.a
                int r4 = r4.length()
                if (r0 <= r4) goto L3e
            L2a:
                int r0 = r6.c
                dra r1 = new dra
                dse r4 = defpackage.dse.this
                java.lang.CharSequence r4 = r4.a
                int r4 = defpackage.dsg.d(r4)
                r1.<init>(r0, r4)
                r6.e = r1
                r6.d = r2
                goto L89
            L3e:
                dse r0 = defpackage.dse.this
                dph<java.lang.CharSequence, java.lang.Integer, dma<java.lang.Integer, java.lang.Integer>> r0 = r0.d
                dse r4 = defpackage.dse.this
                java.lang.CharSequence r4 = r4.a
                int r5 = r6.d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                dma r0 = (defpackage.dma) r0
                if (r0 != 0) goto L68
                int r0 = r6.c
                dra r1 = new dra
                dse r4 = defpackage.dse.this
                java.lang.CharSequence r4 = r4.a
                int r4 = defpackage.dsg.d(r4)
                r1.<init>(r0, r4)
                r6.e = r1
                r6.d = r2
                goto L89
            L68:
                A r2 = r0.a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.c
                dra r4 = defpackage.drb.a(r4, r2)
                r6.e = r4
                int r2 = r2 + r0
                r6.c = r2
                if (r0 != 0) goto L86
                r1 = 1
            L86:
                int r2 = r2 + r1
                r6.d = r2
            L89:
                r6.b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dse.a.a():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ dra next() {
            if (this.b == -1) {
                a();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            dra draVar = this.e;
            if (draVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            this.e = null;
            this.b = -1;
            return draVar;
        }
    }

    @Override // defpackage.drq
    public final Iterator<dra> iterator() {
        return new a();
    }
}
