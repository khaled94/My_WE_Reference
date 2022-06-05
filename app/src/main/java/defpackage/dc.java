package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import defpackage.cu;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: dc  reason: default package */
/* loaded from: classes2.dex */
public abstract class dc<T> implements cu<T> {
    private final Uri a;
    private final ContentResolver b;
    private T c;

    protected abstract T a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    protected abstract void a(T t) throws IOException;

    @Override // defpackage.cu
    public final void c() {
    }

    public dc(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    @Override // defpackage.cu
    public final void a(bt btVar, cu.a<? super T> aVar) {
        try {
            T a = a(this.a, this.b);
            this.c = a;
            aVar.a((cu.a<? super T>) a);
        } catch (FileNotFoundException e) {
            aVar.a((Exception) e);
        }
    }

    @Override // defpackage.cu
    public final void b() {
        T t = this.c;
        if (t != null) {
            try {
                a(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.cu
    public final cf d() {
        return cf.LOCAL;
    }
}
