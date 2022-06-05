package defpackage;

import defpackage.ear;
import defpackage.eav;
import defpackage.efj;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: efm  reason: default package */
/* loaded from: classes2.dex */
public final class efm {
    final String a;
    final boolean b;
    private final Method c;
    private final eas d;
    private final String e;
    private final ear f;
    private final eau g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final efj<?>[] k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public efm(a aVar) {
        this.c = aVar.b;
        this.d = aVar.a.b;
        this.a = aVar.n;
        this.e = aVar.r;
        this.f = aVar.s;
        this.g = aVar.t;
        this.h = aVar.o;
        this.i = aVar.p;
        this.j = aVar.q;
        this.k = aVar.v;
        this.b = aVar.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eba a(Object[] objArr) throws IOException {
        efj<?>[] efjVarArr = this.k;
        int length = objArr.length;
        if (length != efjVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + efjVarArr.length + ")");
        }
        efl eflVar = new efl(this.a, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        if (this.b) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            efjVarArr[i].a(eflVar, objArr[i]);
        }
        return eflVar.a().a((Class<? super Class>) eff.class, (Class) new eff(this.c, arrayList)).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: efm$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        final efo a;
        final Method b;
        final Annotation[] c;
        final Annotation[][] d;
        final Type[] e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        String n;
        boolean o;
        boolean p;
        boolean q;
        String r;
        ear s;
        eau t;
        Set<String> u;
        efj<?>[] v;
        boolean w;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(efo efoVar, Method method) {
            this.a = efoVar;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(String str, String str2, boolean z) {
            String str3 = this.n;
            if (str3 == null) {
                this.n = str;
                this.o = z;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (x.matcher(substring).find()) {
                        throw efs.a(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.r = str2;
                Matcher matcher = x.matcher(str2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (matcher.find()) {
                    linkedHashSet.add(matcher.group(1));
                }
                this.u = linkedHashSet;
                return;
            }
            throw efs.a(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final ear a(String[] strArr) {
            ear.a aVar = new ear.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw efs.a(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.t = eau.a(trim);
                    } catch (IllegalArgumentException e) {
                        throw efs.a(this.b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final efj<?> a(int i, Type type, Annotation[] annotationArr, boolean z) {
            efj<?> efjVar;
            if (annotationArr != null) {
                efjVar = null;
                for (Annotation annotation : annotationArr) {
                    efj<?> a = a(i, type, annotationArr, annotation);
                    if (a != null) {
                        if (efjVar != null) {
                            throw efs.a(this.b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        efjVar = a;
                    }
                }
            } else {
                efjVar = null;
            }
            if (efjVar == null) {
                if (z) {
                    try {
                        if (efs.a(type) == dnu.class) {
                            this.w = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw efs.a(this.b, i, "No Retrofit annotation found.", new Object[0]);
            }
            return efjVar;
        }

        private efj<?> a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof egu) {
                a(i, type);
                if (this.m) {
                    throw efs.a(this.b, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.i) {
                    throw efs.a(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.j) {
                    throw efs.a(this.b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw efs.a(this.b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw efs.a(this.b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.r != null) {
                    throw efs.a(this.b, i, "@Url cannot be used with @%s URL", this.n);
                }
                this.m = true;
                if (type == eas.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new efj.n(this.b, i);
                }
                throw efs.a(this.b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            } else if (annotation instanceof ego) {
                a(i, type);
                if (this.j) {
                    throw efs.a(this.b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw efs.a(this.b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw efs.a(this.b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.m) {
                    throw efs.a(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.r == null) {
                    throw efs.a(this.b, i, "@Path can only be used with relative url on @%s", this.n);
                }
                this.i = true;
                ego egoVar = (ego) annotation;
                String a = egoVar.a();
                if (!y.matcher(a).matches()) {
                    throw efs.a(this.b, i, "@Path parameter name must match %s. Found: %s", x.pattern(), a);
                }
                if (!this.u.contains(a)) {
                    throw efs.a(this.b, i, "URL \"%s\" does not contain \"{%s}\".", this.r, a);
                }
                return new efj.i(this.b, i, a, this.a.b(type, annotationArr), egoVar.b());
            } else if (annotation instanceof egp) {
                a(i, type);
                egp egpVar = (egp) annotation;
                String a2 = egpVar.a();
                boolean b = egpVar.b();
                Class<?> a3 = efs.a(type);
                this.j = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw efs.a(this.b, i, a3.getSimpleName() + " must include generic type (e.g., " + a3.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new efj.j(a2, this.a.b(efs.a(0, (ParameterizedType) type), annotationArr), b).a();
                } else if (a3.isArray()) {
                    return new efj.j(a2, this.a.b(a(a3.getComponentType()), annotationArr), b).b();
                } else {
                    return new efj.j(a2, this.a.b(type, annotationArr), b);
                }
            } else if (annotation instanceof egr) {
                a(i, type);
                boolean a4 = ((egr) annotation).a();
                Class<?> a5 = efs.a(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw efs.a(this.b, i, a5.getSimpleName() + " must include generic type (e.g., " + a5.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new efj.l(this.a.b(efs.a(0, (ParameterizedType) type), annotationArr), a4).a();
                } else if (a5.isArray()) {
                    return new efj.l(this.a.b(a(a5.getComponentType()), annotationArr), a4).b();
                } else {
                    return new efj.l(this.a.b(type, annotationArr), a4);
                }
            } else if (annotation instanceof egq) {
                a(i, type);
                Class<?> a6 = efs.a(type);
                this.l = true;
                if (!Map.class.isAssignableFrom(a6)) {
                    throw efs.a(this.b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type a7 = efs.a(type, a6, (Class<?>) Map.class);
                if (!(a7 instanceof ParameterizedType)) {
                    throw efs.a(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) a7;
                Type a8 = efs.a(0, parameterizedType);
                if (String.class != a8) {
                    throw efs.a(this.b, i, "@QueryMap keys must be of type String: ".concat(String.valueOf(a8)), new Object[0]);
                }
                return new efj.k(this.b, i, this.a.b(efs.a(1, parameterizedType), annotationArr), ((egq) annotation).a());
            } else if (annotation instanceof ege) {
                a(i, type);
                String a9 = ((ege) annotation).a();
                Class<?> a10 = efs.a(type);
                if (Iterable.class.isAssignableFrom(a10)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw efs.a(this.b, i, a10.getSimpleName() + " must include generic type (e.g., " + a10.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new efj.d(a9, this.a.b(efs.a(0, (ParameterizedType) type), annotationArr)).a();
                } else if (a10.isArray()) {
                    return new efj.d(a9, this.a.b(a(a10.getComponentType()), annotationArr)).b();
                } else {
                    return new efj.d(a9, this.a.b(type, annotationArr));
                }
            } else if (annotation instanceof egf) {
                if (type == ear.class) {
                    return new efj.f(this.b, i);
                }
                a(i, type);
                Class<?> a11 = efs.a(type);
                if (!Map.class.isAssignableFrom(a11)) {
                    throw efs.a(this.b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type a12 = efs.a(type, a11, (Class<?>) Map.class);
                if (!(a12 instanceof ParameterizedType)) {
                    throw efs.a(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) a12;
                Type a13 = efs.a(0, parameterizedType2);
                if (String.class != a13) {
                    throw efs.a(this.b, i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(a13)), new Object[0]);
                }
                return new efj.e(this.b, i, this.a.b(efs.a(1, parameterizedType2), annotationArr));
            } else if (annotation instanceof efy) {
                a(i, type);
                if (!this.p) {
                    throw efs.a(this.b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                efy efyVar = (efy) annotation;
                String a14 = efyVar.a();
                boolean b2 = efyVar.b();
                this.f = true;
                Class<?> a15 = efs.a(type);
                if (Iterable.class.isAssignableFrom(a15)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw efs.a(this.b, i, a15.getSimpleName() + " must include generic type (e.g., " + a15.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new efj.b(a14, this.a.b(efs.a(0, (ParameterizedType) type), annotationArr), b2).a();
                } else if (a15.isArray()) {
                    return new efj.b(a14, this.a.b(a(a15.getComponentType()), annotationArr), b2).b();
                } else {
                    return new efj.b(a14, this.a.b(type, annotationArr), b2);
                }
            } else if (annotation instanceof efz) {
                a(i, type);
                if (!this.p) {
                    throw efs.a(this.b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> a16 = efs.a(type);
                if (!Map.class.isAssignableFrom(a16)) {
                    throw efs.a(this.b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type a17 = efs.a(type, a16, (Class<?>) Map.class);
                if (!(a17 instanceof ParameterizedType)) {
                    throw efs.a(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) a17;
                Type a18 = efs.a(0, parameterizedType3);
                if (String.class != a18) {
                    throw efs.a(this.b, i, "@FieldMap keys must be of type String: ".concat(String.valueOf(a18)), new Object[0]);
                }
                efc b3 = this.a.b(efs.a(1, parameterizedType3), annotationArr);
                this.f = true;
                return new efj.c(this.b, i, b3, ((efz) annotation).a());
            } else if (annotation instanceof egm) {
                a(i, type);
                if (!this.q) {
                    throw efs.a(this.b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                egm egmVar = (egm) annotation;
                this.g = true;
                String a19 = egmVar.a();
                Class<?> a20 = efs.a(type);
                if (a19.isEmpty()) {
                    if (Iterable.class.isAssignableFrom(a20)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw efs.a(this.b, i, a20.getSimpleName() + " must include generic type (e.g., " + a20.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!eav.b.class.isAssignableFrom(efs.a(efs.a(0, (ParameterizedType) type)))) {
                            throw efs.a(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else {
                            return efj.m.a.a();
                        }
                    } else if (a20.isArray()) {
                        if (!eav.b.class.isAssignableFrom(a20.getComponentType())) {
                            throw efs.a(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return efj.m.a.b();
                    } else if (eav.b.class.isAssignableFrom(a20)) {
                        return efj.m.a;
                    } else {
                        throw efs.a(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                }
                ear a21 = ear.a("Content-Disposition", "form-data; name=\"" + a19 + "\"", "Content-Transfer-Encoding", egmVar.b());
                if (Iterable.class.isAssignableFrom(a20)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw efs.a(this.b, i, a20.getSimpleName() + " must include generic type (e.g., " + a20.getSimpleName() + "<String>)", new Object[0]);
                    }
                    Type a22 = efs.a(0, (ParameterizedType) type);
                    if (eav.b.class.isAssignableFrom(efs.a(a22))) {
                        throw efs.a(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new efj.g(this.b, i, a21, this.a.a(a22, annotationArr, this.c)).a();
                } else if (a20.isArray()) {
                    Class<?> a23 = a(a20.getComponentType());
                    if (eav.b.class.isAssignableFrom(a23)) {
                        throw efs.a(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new efj.g(this.b, i, a21, this.a.a(a23, annotationArr, this.c)).b();
                } else if (eav.b.class.isAssignableFrom(a20)) {
                    throw efs.a(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                } else {
                    return new efj.g(this.b, i, a21, this.a.a(type, annotationArr, this.c));
                }
            } else if (annotation instanceof egn) {
                a(i, type);
                if (!this.q) {
                    throw efs.a(this.b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.g = true;
                Class<?> a24 = efs.a(type);
                if (!Map.class.isAssignableFrom(a24)) {
                    throw efs.a(this.b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type a25 = efs.a(type, a24, (Class<?>) Map.class);
                if (!(a25 instanceof ParameterizedType)) {
                    throw efs.a(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) a25;
                Type a26 = efs.a(0, parameterizedType4);
                if (String.class != a26) {
                    throw efs.a(this.b, i, "@PartMap keys must be of type String: ".concat(String.valueOf(a26)), new Object[0]);
                }
                Type a27 = efs.a(1, parameterizedType4);
                if (eav.b.class.isAssignableFrom(efs.a(a27))) {
                    throw efs.a(this.b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                }
                return new efj.h(this.b, i, this.a.a(a27, annotationArr, this.c), ((egn) annotation).a());
            } else if (annotation instanceof efw) {
                a(i, type);
                if (this.p || this.q) {
                    throw efs.a(this.b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.h) {
                    throw efs.a(this.b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    efc a28 = this.a.a(type, annotationArr, this.c);
                    this.h = true;
                    return new efj.a(this.b, i, a28);
                } catch (RuntimeException e) {
                    throw efs.a(this.b, e, i, "Unable to create @Body converter for %s", type);
                }
            } else if (!(annotation instanceof egt)) {
                return null;
            } else {
                a(i, type);
                Class<?> a29 = efs.a(type);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    efj<?> efjVar = this.v[i2];
                    if ((efjVar instanceof efj.o) && ((efj.o) efjVar).a.equals(a29)) {
                        throw efs.a(this.b, i, "@Tag type " + a29.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new efj.o(a29);
            }
        }

        private void a(int i, Type type) {
            if (!efs.d(type)) {
                return;
            }
            throw efs.a(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }
    }
}
