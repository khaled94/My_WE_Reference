package defpackage;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import defpackage.cl;
import java.security.MessageDigest;

/* renamed from: cm  reason: default package */
/* loaded from: classes2.dex */
public final class cm implements ck {
    private final ArrayMap<cl<?>, Object> b = new kw();

    public final void a(cm cmVar) {
        this.b.putAll((SimpleArrayMap<? extends cl<?>, ? extends Object>) cmVar.b);
    }

    public final <T> cm a(cl<T> clVar, T t) {
        this.b.put(clVar, t);
        return this;
    }

    public final <T> T a(cl<T> clVar) {
        return this.b.containsKey(clVar) ? (T) this.b.get(clVar) : clVar.a;
    }

    @Override // defpackage.ck
    public final boolean equals(Object obj) {
        if (obj instanceof cm) {
            return this.b.equals(((cm) obj).b);
        }
        return false;
    }

    @Override // defpackage.ck
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
        for (int i = 0; i < this.b.size(); i++) {
            cl<?> keyAt = this.b.keyAt(i);
            Object valueAt = this.b.valueAt(i);
            cl.a<?> aVar = keyAt.b;
            if (keyAt.d == null) {
                keyAt.d = keyAt.c.getBytes(ck.a);
            }
            aVar.a(keyAt.d, valueAt, messageDigest);
        }
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
