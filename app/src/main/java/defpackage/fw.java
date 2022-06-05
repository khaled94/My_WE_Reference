package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: fw  reason: default package */
/* loaded from: classes2.dex */
public interface fw<Model, Data> {
    a<Data> a(Model model, int i, int i2, cm cmVar);

    boolean a(Model model);

    /* renamed from: fw$a */
    /* loaded from: classes2.dex */
    public static class a<Data> {
        public final ck a;
        public final List<ck> b;
        public final cu<Data> c;

        public a(ck ckVar, cu<Data> cuVar) {
            this(ckVar, Collections.emptyList(), cuVar);
        }

        private a(ck ckVar, List<ck> list, cu<Data> cuVar) {
            this.a = (ck) lf.a(ckVar, "Argument must not be null");
            this.b = (List) lf.a(list, "Argument must not be null");
            this.c = (cu) lf.a(cuVar, "Argument must not be null");
        }
    }
}
