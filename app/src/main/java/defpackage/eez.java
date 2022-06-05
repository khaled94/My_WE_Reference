package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: eez  reason: default package */
/* loaded from: classes2.dex */
public interface eez<R, T> {

    /* renamed from: eez$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract eez<?, ?> a(Type type, Annotation[] annotationArr);
    }

    T a(eey<R> eeyVar);

    Type a();
}
