package io.realm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface RealmModule {
    boolean allClasses() default false;

    dkx classNamingPolicy() default dkx.NO_POLICY;

    Class<?>[] classes() default {};

    dkx fieldNamingPolicy() default dkx.NO_POLICY;

    boolean library() default false;
}
