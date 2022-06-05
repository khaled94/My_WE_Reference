package defpackage;

/* renamed from: cqa  reason: default package */
/* loaded from: classes2.dex */
public enum cqa {
    DEFAULT { // from class: cqa.1
        @Override // defpackage.cqa
        public final cpv serialize(Long l) {
            if (l == null) {
                return cpw.a;
            }
            return new cpy(l);
        }
    },
    STRING { // from class: cqa.2
        @Override // defpackage.cqa
        public final cpv serialize(Long l) {
            if (l == null) {
                return cpw.a;
            }
            return new cpy(l.toString());
        }
    };

    public abstract cpv serialize(Long l);
}
