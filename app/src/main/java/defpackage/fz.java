package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import defpackage.cu;
import defpackage.fw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: fz  reason: default package */
/* loaded from: classes2.dex */
final class fz<Model, Data> implements fw<Model, Data> {
    private final List<fw<Model, Data>> a;
    private final Pools.Pool<List<Throwable>> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fz(List<fw<Model, Data>> list, Pools.Pool<List<Throwable>> pool) {
        this.a = list;
        this.b = pool;
    }

    @Override // defpackage.fw
    public final fw.a<Data> a(Model model, int i, int i2, cm cmVar) {
        fw.a<Data> a2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        ck ckVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            fw<Model, Data> fwVar = this.a.get(i3);
            if (fwVar.a(model) && (a2 = fwVar.a(model, i, i2, cmVar)) != null) {
                ckVar = a2.a;
                arrayList.add(a2.c);
            }
        }
        if (arrayList.isEmpty() || ckVar == null) {
            return null;
        }
        return new fw.a<>(ckVar, new a(arrayList, this.b));
    }

    @Override // defpackage.fw
    public final boolean a(Model model) {
        for (fw<Model, Data> fwVar : this.a) {
            if (fwVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }

    /* renamed from: fz$a */
    /* loaded from: classes2.dex */
    static class a<Data> implements cu<Data>, cu.a<Data> {
        private final List<cu<Data>> a;
        private final Pools.Pool<List<Throwable>> b;
        private int c = 0;
        private bt d;
        private cu.a<? super Data> e;
        private List<Throwable> f;
        private boolean g;

        a(List<cu<Data>> list, Pools.Pool<List<Throwable>> pool) {
            this.b = pool;
            lf.a(list);
            this.a = list;
        }

        @Override // defpackage.cu
        public final void a(bt btVar, cu.a<? super Data> aVar) {
            this.d = btVar;
            this.e = aVar;
            this.f = this.b.acquire();
            this.a.get(this.c).a(btVar, this);
            if (this.g) {
                c();
            }
        }

        @Override // defpackage.cu
        public final void b() {
            List<Throwable> list = this.f;
            if (list != null) {
                this.b.release(list);
            }
            this.f = null;
            for (cu<Data> cuVar : this.a) {
                cuVar.b();
            }
        }

        @Override // defpackage.cu
        public final void c() {
            this.g = true;
            for (cu<Data> cuVar : this.a) {
                cuVar.c();
            }
        }

        @Override // defpackage.cu
        public final Class<Data> a() {
            return this.a.get(0).a();
        }

        @Override // defpackage.cu
        public final cf d() {
            return this.a.get(0).d();
        }

        @Override // defpackage.cu.a
        public final void a(Data data) {
            if (data != null) {
                this.e.a((cu.a<? super Data>) data);
            } else {
                e();
            }
        }

        @Override // defpackage.cu.a
        public final void a(Exception exc) {
            ((List) lf.a(this.f, "Argument must not be null")).add(exc);
            e();
        }

        private void e() {
            if (this.g) {
                return;
            }
            if (this.c < this.a.size() - 1) {
                this.c++;
                a(this.d, this.e);
                return;
            }
            lf.a(this.f, "Argument must not be null");
            this.e.a((Exception) new GlideException("Fetch failed", new ArrayList(this.f)));
        }
    }
}
