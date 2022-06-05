package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.Registry;
import defpackage.bo;
import java.util.List;
import java.util.Map;

/* renamed from: bq  reason: default package */
/* loaded from: classes2.dex */
public final class bq extends ContextWrapper {
    static final bw<?, ?> a = new bn();
    public final ek b;
    public final Registry c;
    final List<ka<Object>> d;
    final Map<Class<?>, bw<?, ?>> e;
    final du f;
    public final br g;
    public final int h;
    private final kk i;
    private final bo.a j;
    private kb k;

    public bq(Context context, ek ekVar, Registry registry, kk kkVar, bo.a aVar, Map<Class<?>, bw<?, ?>> map, List<ka<Object>> list, du duVar, br brVar, int i) {
        super(context.getApplicationContext());
        this.b = ekVar;
        this.c = registry;
        this.i = kkVar;
        this.j = aVar;
        this.d = list;
        this.e = map;
        this.f = duVar;
        this.g = brVar;
        this.h = i;
    }

    public final synchronized kb a() {
        if (this.k == null) {
            kb a2 = this.j.a();
            a2.t = true;
            this.k = a2;
        }
        return this.k;
    }
}
