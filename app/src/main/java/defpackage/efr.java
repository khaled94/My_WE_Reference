package defpackage;

import java.lang.annotation.Annotation;

/* renamed from: efr  reason: default package */
/* loaded from: classes2.dex */
final class efr implements efq {
    private static final efq a = new efr();

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    efr() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Annotation[] a(Annotation[] annotationArr) {
        if (efs.a(annotationArr, efq.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return efq.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof efq;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + efq.class.getName() + "()";
    }
}
