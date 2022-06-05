package defpackage;

/* renamed from: eao */
/* loaded from: classes2.dex */
public abstract class eao {
    public static final eao a = new eao() { // from class: eao.1
    };

    /* renamed from: eao$a */
    /* loaded from: classes2.dex */
    public interface a {
        eao create(ead eadVar);
    }

    public static /* synthetic */ eao a(eao eaoVar, ead eadVar) {
        return eaoVar;
    }

    /* renamed from: lambda$L38ptZOFylDr5Qt-JVUhMC-ukrA */
    public static /* synthetic */ eao m121lambda$L38ptZOFylDr5QtJVUhMCukrA(eao eaoVar, ead eadVar) {
        return a(eaoVar, eadVar);
    }

    public static a a(eao eaoVar) {
        return new a() { // from class: -$$Lambda$eao$L38ptZOFylDr5Qt-JVUhMC-ukrA
            @Override // defpackage.eao.a
            public final eao create(ead eadVar) {
                return eao.m121lambda$L38ptZOFylDr5QtJVUhMCukrA(eao.this, eadVar);
            }
        };
    }
}
