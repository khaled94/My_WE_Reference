package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: cqg  reason: default package */
/* loaded from: classes2.dex */
public @interface cqg {
    Class<?> a();

    boolean b() default true;
}
