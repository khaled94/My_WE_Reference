package defpackage;

import defpackage.ead;
import defpackage.eex;
import defpackage.eez;
import defpackage.efc;
import defpackage.efe;
import defpackage.efm;
import defpackage.efs;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: efo  reason: default package */
/* loaded from: classes2.dex */
public final class efo {
    final ead.a a;
    final eas b;
    final List<efc.a> c;
    final List<eez.a> d;
    final Executor e;
    final boolean f;
    private final Map<Method, efp<?>> g = new ConcurrentHashMap();

    efo(ead.a aVar, eas easVar, List<efc.a> list, List<eez.a> list2, Executor executor, boolean z) {
        this.a = aVar;
        this.b = easVar;
        this.c = list;
        this.d = list2;
        this.e = executor;
        this.f = z;
    }

    public final <T> T a(final Class<T> cls) {
        b(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: efo.1
            private final efk c = efk.a();
            private final Object[] d = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.d;
                }
                if (this.c.a(method)) {
                    return this.c.a(method, cls, obj, objArr);
                }
                return efo.this.a(method).a(objArr);
            }
        });
    }

    private void b(Class<?> cls) {
        Method[] declaredMethods;
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (!this.f) {
            return;
        }
        efk a2 = efk.a();
        for (Method method : cls.getDeclaredMethods()) {
            if (!a2.a(method) && !Modifier.isStatic(method.getModifiers())) {
                a(method);
            }
        }
    }

    final efp<?> a(Method method) {
        efp<?> efpVar;
        Annotation[] annotationArr;
        Type type;
        boolean z;
        efp<?> efpVar2 = this.g.get(method);
        if (efpVar2 != null) {
            return efpVar2;
        }
        synchronized (this.g) {
            efpVar = this.g.get(method);
            if (efpVar == null) {
                efm.a aVar = new efm.a(this, method);
                for (Annotation annotation : aVar.c) {
                    if (annotation instanceof efx) {
                        aVar.a("DELETE", ((efx) annotation).a(), false);
                    } else if (annotation instanceof egb) {
                        aVar.a("GET", ((egb) annotation).a(), false);
                    } else if (annotation instanceof egc) {
                        aVar.a("HEAD", ((egc) annotation).a(), false);
                    } else if (annotation instanceof egj) {
                        aVar.a("PATCH", ((egj) annotation).a(), true);
                    } else if (annotation instanceof egk) {
                        aVar.a("POST", ((egk) annotation).a(), true);
                    } else if (annotation instanceof egl) {
                        aVar.a("PUT", ((egl) annotation).a(), true);
                    } else if (annotation instanceof egi) {
                        aVar.a("OPTIONS", ((egi) annotation).a(), false);
                    } else if (annotation instanceof egd) {
                        egd egdVar = (egd) annotation;
                        aVar.a(egdVar.a(), egdVar.b(), egdVar.c());
                    } else if (annotation instanceof egg) {
                        String[] a2 = ((egg) annotation).a();
                        if (a2.length == 0) {
                            throw efs.a(aVar.b, "@Headers annotation is empty.", new Object[0]);
                        }
                        aVar.s = aVar.a(a2);
                    } else if (annotation instanceof egh) {
                        if (aVar.p) {
                            throw efs.a(aVar.b, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        aVar.q = true;
                    } else if (!(annotation instanceof ega)) {
                        continue;
                    } else if (aVar.q) {
                        throw efs.a(aVar.b, "Only one encoding annotation is allowed.", new Object[0]);
                    } else {
                        aVar.p = true;
                    }
                }
                if (aVar.n == null) {
                    throw efs.a(aVar.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!aVar.o) {
                    if (aVar.q) {
                        throw efs.a(aVar.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar.p) {
                        throw efs.a(aVar.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = aVar.d.length;
                aVar.v = new efj[length];
                int i = length - 1;
                int i2 = 0;
                while (i2 < length) {
                    aVar.v[i2] = aVar.a(i2, aVar.e[i2], aVar.d[i2], i2 == i);
                    i2++;
                }
                if (aVar.r == null && !aVar.m) {
                    throw efs.a(aVar.b, "Missing either @%s URL or @Url parameter.", aVar.n);
                }
                if (!aVar.p && !aVar.q && !aVar.o && aVar.h) {
                    throw efs.a(aVar.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (aVar.p && !aVar.f) {
                    throw efs.a(aVar.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar.q && !aVar.g) {
                    throw efs.a(aVar.b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                efm efmVar = new efm(aVar);
                Type genericReturnType = method.getGenericReturnType();
                if (efs.d(genericReturnType)) {
                    throw efs.a(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
                }
                if (genericReturnType == Void.TYPE) {
                    throw efs.a(method, "Service methods cannot return void.", new Object[0]);
                }
                boolean z2 = efmVar.b;
                Annotation[] annotations = method.getAnnotations();
                if (z2) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type a3 = efs.a((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
                    if (efs.a(a3) != efn.class || !(a3 instanceof ParameterizedType)) {
                        z = false;
                    } else {
                        a3 = efs.a(0, (ParameterizedType) a3);
                        z = true;
                    }
                    type = new efs.b(null, eey.class, a3);
                    annotations = efr.a(annotations);
                } else {
                    type = method.getGenericReturnType();
                    z = false;
                }
                eez a4 = efe.a(this, method, type, annotations);
                Type a5 = a4.a();
                if (a5 == ebc.class) {
                    throw efs.a(method, "'" + efs.a(a5).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                } else if (a5 == efn.class) {
                    throw efs.a(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                } else {
                    if (efmVar.a.equals("HEAD") && !Void.class.equals(a5)) {
                        throw efs.a(method, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    efc a6 = efe.a(this, method, a5);
                    ead.a aVar2 = this.a;
                    if (!z2) {
                        efpVar = new efe.a<>(efmVar, aVar2, a6, a4);
                    } else if (z) {
                        efpVar = new efe.c<>(efmVar, aVar2, a6, a4);
                    } else {
                        efpVar = new efe.b<>(efmVar, aVar2, a6, a4);
                    }
                    this.g.put(method, efpVar);
                }
            }
        }
        return efpVar;
    }

    public final <T> efc<T, ebb> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return b(type, annotationArr, annotationArr2);
    }

    private <T> efc<T, ebb> b(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.c.indexOf(null) + 1;
        int size = this.c.size();
        for (int i = indexOf; i < size; i++) {
            efc<T, ebb> efcVar = (efc<T, ebb>) this.c.get(i).a(type);
            if (efcVar != null) {
                return efcVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> efc<ebd, T> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.c.indexOf(null) + 1;
        int size = this.c.size();
        for (int i = indexOf; i < size; i++) {
            efc<ebd, T> efcVar = (efc<ebd, T>) this.c.get(i).a(type, annotationArr, this);
            if (efcVar != null) {
                return efcVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> efc<T, String> b(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.c.get(i);
        }
        return eex.d.a;
    }

    /* renamed from: efo$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final efk a;
        private ead.a b;
        private eas c;
        private final List<efc.a> d;
        private final List<eez.a> e;
        private Executor f;
        private boolean g;

        private a(efk efkVar) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = efkVar;
        }

        public a() {
            this(efk.a());
        }

        public final a a(eaw eawVar) {
            return a((ead.a) Objects.requireNonNull(eawVar, "client == null"));
        }

        private a a(ead.a aVar) {
            this.b = (ead.a) Objects.requireNonNull(aVar, "factory == null");
            return this;
        }

        public final a a(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return a(eas.e(str));
        }

        private a a(eas easVar) {
            Objects.requireNonNull(easVar, "baseUrl == null");
            List<String> list = easVar.d;
            if (!"".equals(list.get(list.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: ".concat(String.valueOf(easVar)));
            }
            this.c = easVar;
            return this;
        }

        public final a a(efc.a aVar) {
            this.d.add((efc.a) Objects.requireNonNull(aVar, "factory == null"));
            return this;
        }

        public final efo a() {
            if (this.c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            ead.a aVar = this.b;
            if (aVar == null) {
                aVar = new eaw();
            }
            ead.a aVar2 = aVar;
            Executor executor = this.f;
            if (executor == null) {
                executor = this.a.b();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.addAll(this.a.a(executor2));
            ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.a.d());
            arrayList2.add(new eex());
            arrayList2.addAll(this.d);
            arrayList2.addAll(this.a.c());
            return new efo(aVar2, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.g);
        }
    }
}
