package defpackage;

import com.google.gson.Gson;
import defpackage.efc;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: eft  reason: default package */
/* loaded from: classes2.dex */
public final class eft extends efc.a {
    private final Gson a;

    public static eft a() {
        return a(new Gson());
    }

    private static eft a(Gson gson) {
        return new eft(gson);
    }

    private eft(Gson gson) {
        this.a = gson;
    }

    @Override // defpackage.efc.a
    public final efc<ebd, ?> a(Type type, Annotation[] annotationArr, efo efoVar) {
        return new efv(this.a, this.a.a((crb) crb.a(type)));
    }

    @Override // defpackage.efc.a
    public final efc<?, ebb> a(Type type) {
        return new efu(this.a, this.a.a((crb) crb.a(type)));
    }
}
