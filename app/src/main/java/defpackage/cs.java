package defpackage;

import android.content.res.AssetManager;
import defpackage.cu;
import java.io.IOException;

/* renamed from: cs  reason: default package */
/* loaded from: classes2.dex */
public abstract class cs<T> implements cu<T> {
    private final String a;
    private final AssetManager b;
    private T c;

    protected abstract T a(AssetManager assetManager, String str) throws IOException;

    protected abstract void a(T t) throws IOException;

    @Override // defpackage.cu
    public final void c() {
    }

    public cs(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.cu
    public final void a(bt btVar, cu.a<? super T> aVar) {
        try {
            T a = a(this.b, this.a);
            this.c = a;
            aVar.a((cu.a<? super T>) a);
        } catch (IOException e) {
            aVar.a((Exception) e);
        }
    }

    @Override // defpackage.cu
    public final void b() {
        T t = this.c;
        if (t == null) {
            return;
        }
        try {
            a(t);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.cu
    public final cf d() {
        return cf.LOCAL;
    }
}
