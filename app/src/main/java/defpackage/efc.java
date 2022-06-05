package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: efc  reason: default package */
/* loaded from: classes2.dex */
public interface efc<F, T> {

    /* renamed from: efc$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public efc<?, ebb> a(Type type) {
            return null;
        }

        public efc<ebd, ?> a(Type type, Annotation[] annotationArr, efo efoVar) {
            return null;
        }
    }

    T a(F f) throws IOException;
}
