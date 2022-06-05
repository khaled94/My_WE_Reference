package defpackage;

import com.android.volley.VolleyError;
import defpackage.ak;

/* renamed from: au  reason: default package */
/* loaded from: classes.dex */
public final class au<T> {
    public final T a;
    public final ak.a b;
    public final VolleyError c;
    public boolean d;

    /* renamed from: au$a */
    /* loaded from: classes.dex */
    public interface a {
        void onErrorResponse(VolleyError volleyError);
    }

    /* renamed from: au$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        void onResponse(T t);
    }

    public static <T> au<T> a(T t, ak.a aVar) {
        return new au<>(t, aVar);
    }

    public static <T> au<T> a(VolleyError volleyError) {
        return new au<>(volleyError);
    }

    private au(T t, ak.a aVar) {
        this.d = false;
        this.a = t;
        this.b = aVar;
        this.c = null;
    }

    private au(VolleyError volleyError) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = volleyError;
    }
}
