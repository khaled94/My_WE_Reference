package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements cqe {
    private final cqm a;
    private final cpr b;
    private final Excluder c;
    private final JsonAdapterAnnotationTypeAdapterFactory d;
    private final cqy e = cqy.a();

    public ReflectiveTypeAdapterFactory(cqm cqmVar, cpr cprVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.a = cqmVar;
        this.b = cprVar;
        this.c = excluder;
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.reflect.Field r9, boolean r10) {
        /*
            r8 = this;
            com.google.gson.internal.Excluder r0 = r8.c
            java.lang.Class r1 = r9.getType()
            boolean r1 = r0.a(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            boolean r1 = r0.a(r10)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            if (r1 != 0) goto Lb2
            int r1 = r0.c
            int r4 = r9.getModifiers()
            r1 = r1 & r4
            if (r1 == 0) goto L26
        L23:
            r9 = 1
            goto Laf
        L26:
            double r4 = r0.b
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L45
            java.lang.Class<cqi> r1 = defpackage.cqi.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            cqi r1 = (defpackage.cqi) r1
            java.lang.Class<cqj> r4 = defpackage.cqj.class
            java.lang.annotation.Annotation r4 = r9.getAnnotation(r4)
            cqj r4 = (defpackage.cqj) r4
            boolean r1 = r0.a(r1, r4)
            if (r1 != 0) goto L45
            goto L23
        L45:
            boolean r1 = r9.isSynthetic()
            if (r1 == 0) goto L4c
            goto L23
        L4c:
            boolean r1 = r0.e
            if (r1 == 0) goto L6a
            java.lang.Class<cqf> r1 = defpackage.cqf.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            cqf r1 = (defpackage.cqf) r1
            if (r1 == 0) goto L23
            if (r10 == 0) goto L63
            boolean r1 = r1.a()
            if (r1 != 0) goto L6a
            goto L69
        L63:
            boolean r1 = r1.b()
            if (r1 != 0) goto L6a
        L69:
            goto L23
        L6a:
            boolean r1 = r0.d
            if (r1 != 0) goto L79
            java.lang.Class r1 = r9.getType()
            boolean r1 = com.google.gson.internal.Excluder.c(r1)
            if (r1 == 0) goto L79
            goto L23
        L79:
            java.lang.Class r1 = r9.getType()
            boolean r1 = com.google.gson.internal.Excluder.b(r1)
            if (r1 == 0) goto L84
            goto L23
        L84:
            if (r10 == 0) goto L89
            java.util.List<cpo> r10 = r0.f
            goto L8b
        L89:
            java.util.List<cpo> r10 = r0.g
        L8b:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto Lae
            cpp r0 = new cpp
            r0.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        L9a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lae
            java.lang.Object r10 = r9.next()
            cpo r10 = (defpackage.cpo) r10
            boolean r10 = r10.a()
            if (r10 == 0) goto L9a
            goto L23
        Lae:
            r9 = 0
        Laf:
            if (r9 != 0) goto Lb2
            return r3
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a(java.lang.reflect.Field, boolean):boolean");
    }

    private List<String> a(Field field) {
        cqh cqhVar = (cqh) field.getAnnotation(cqh.class);
        if (cqhVar == null) {
            return Collections.singletonList(this.b.translateName(field));
        }
        String a2 = cqhVar.a();
        String[] b = cqhVar.b();
        if (b.length == 0) {
            return Collections.singletonList(a2);
        }
        ArrayList arrayList = new ArrayList(b.length + 1);
        arrayList.add(a2);
        for (String str : b) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private Map<String, a> a(final Gson gson, crb<?> crbVar, Class<?> cls) {
        Class<?> cls2;
        crb<?> crbVar2;
        Field[] fieldArr;
        int i;
        int i2;
        Type type;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type2 = crbVar.b;
        Class<?> cls3 = cls;
        crb<?> crbVar3 = crbVar;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i3 = 0;
            while (i3 < length) {
                final Field field = declaredFields[i3];
                boolean a2 = reflectiveTypeAdapterFactory.a(field, true);
                boolean a3 = reflectiveTypeAdapterFactory.a(field, z);
                if (a2 || a3) {
                    reflectiveTypeAdapterFactory.e.a(field);
                    Type a4 = cql.a(crbVar3.b, cls3, field.getGenericType());
                    List<String> a5 = reflectiveTypeAdapterFactory.a(field);
                    int size = a5.size();
                    crbVar2 = crbVar3;
                    a aVar = null;
                    int i4 = 0;
                    while (i4 < size) {
                        Type type3 = type2;
                        String str = a5.get(i4);
                        boolean z2 = i4 != 0 ? false : a2;
                        final crb<?> a6 = crb.a(a4);
                        Class<? super Object> cls4 = a6.a;
                        boolean z3 = (cls4 instanceof Class) && cls4.isPrimitive();
                        cqg cqgVar = (cqg) field.getAnnotation(cqg.class);
                        cqd<?> a7 = cqgVar != null ? JsonAdapterAnnotationTypeAdapterFactory.a(reflectiveTypeAdapterFactory.a, gson, a6, cqgVar) : null;
                        boolean z4 = a7 != null;
                        if (a7 == null) {
                            a7 = gson.a((crb) a6);
                        }
                        final cqd<?> cqdVar = a7;
                        int i5 = i4;
                        int i6 = size;
                        List<String> list = a5;
                        Field field2 = field;
                        int i7 = i3;
                        final boolean z5 = z4;
                        int i8 = length;
                        Field[] fieldArr2 = declaredFields;
                        Class<?> cls5 = cls3;
                        final boolean z6 = z3;
                        a aVar2 = (a) linkedHashMap.put(str, new a(str, z2, a3) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
                            final void a(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
                                (z5 ? cqdVar : new TypeAdapterRuntimeTypeWrapper(gson, cqdVar, a6.b)).a(jsonWriter, field.get(obj));
                            }

                            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
                            final void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
                                Object a8 = cqdVar.a(jsonReader);
                                if (a8 != null || !z6) {
                                    field.set(obj, a8);
                                }
                            }

                            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
                            public final boolean a(Object obj) throws IOException, IllegalAccessException {
                                return this.i && field.get(obj) != obj;
                            }
                        });
                        if (aVar == null) {
                            aVar = aVar2;
                        }
                        i4 = i5 + 1;
                        reflectiveTypeAdapterFactory = this;
                        cls3 = cls5;
                        a2 = z2;
                        type2 = type3;
                        length = i8;
                        size = i6;
                        a5 = list;
                        field = field2;
                        i3 = i7;
                        declaredFields = fieldArr2;
                    }
                    i = i3;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    if (aVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + aVar.h);
                    }
                } else {
                    i = i3;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    crbVar2 = crbVar3;
                }
                i3 = i + 1;
                reflectiveTypeAdapterFactory = this;
                crbVar3 = crbVar2;
                cls3 = cls2;
                type2 = type;
                length = i2;
                declaredFields = fieldArr;
                z = false;
            }
            Class<?> cls6 = cls3;
            crbVar3 = crb.a(cql.a(crbVar3.b, cls6, cls6.getGenericSuperclass()));
            cls3 = crbVar3.a;
            reflectiveTypeAdapterFactory = this;
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        final String h;
        final boolean i;
        final boolean j;

        abstract void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        abstract void a(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        abstract boolean a(Object obj) throws IOException, IllegalAccessException;

        protected a(String str, boolean z, boolean z2) {
            this.h = str;
            this.i = z;
            this.j = z2;
        }
    }

    /* loaded from: classes.dex */
    public static final class Adapter<T> extends cqd<T> {
        private final cqr<T> a;
        private final Map<String, a> b;

        Adapter(cqr<T> cqrVar, Map<String, a> map) {
            this.a = cqrVar;
            this.b = map;
        }

        @Override // defpackage.cqd
        public final T a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T a = this.a.a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    a aVar = this.b.get(jsonReader.nextName());
                    if (aVar != null && aVar.j) {
                        aVar.a(jsonReader, a);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // defpackage.cqd
        public final void a(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (a aVar : this.b.values()) {
                    if (aVar.a(t)) {
                        jsonWriter.name(aVar.h);
                        aVar.a(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    @Override // defpackage.cqe
    public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
        Class<? super T> cls = crbVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new Adapter(this.a.a(crbVar), a(gson, crbVar, cls));
    }
}
