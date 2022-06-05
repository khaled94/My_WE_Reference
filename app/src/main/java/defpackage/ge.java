package defpackage;

import defpackage.cu;
import defpackage.fw;

/* renamed from: ge  reason: default package */
/* loaded from: classes2.dex */
public final class ge<Model> implements fw<Model, Model> {
    private static final ge<?> a = new ge<>();

    @Override // defpackage.fw
    public final boolean a(Model model) {
        return true;
    }

    public static <T> ge<T> a() {
        return (ge<T>) a;
    }

    @Override // defpackage.fw
    public final fw.a<Model> a(Model model, int i, int i2, cm cmVar) {
        return new fw.a<>(new ku(model), new b(model));
    }

    /* renamed from: ge$b */
    /* loaded from: classes2.dex */
    static class b<Model> implements cu<Model> {
        private final Model a;

        @Override // defpackage.cu
        public final void b() {
        }

        @Override // defpackage.cu
        public final void c() {
        }

        b(Model model) {
            this.a = model;
        }

        @Override // defpackage.cu
        public final void a(bt btVar, cu.a<? super Model> aVar) {
            aVar.a((cu.a<? super Model>) ((Model) this.a));
        }

        @Override // defpackage.cu
        public final Class<Model> a() {
            return (Class<Model>) this.a.getClass();
        }

        @Override // defpackage.cu
        public final cf d() {
            return cf.LOCAL;
        }
    }

    /* renamed from: ge$a */
    /* loaded from: classes2.dex */
    public static class a<Model> implements fx<Model, Model> {
        private static final a<?> a = new a<>();

        public static <T> a<T> a() {
            return (a<T>) a;
        }

        @Override // defpackage.fx
        public final fw<Model, Model> a(ga gaVar) {
            return ge.a();
        }
    }
}
