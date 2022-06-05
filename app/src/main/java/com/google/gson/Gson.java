package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class Gson {
    private static final crb<?> t = crb.a(Object.class);
    final List<cqe> a;
    final Excluder b;
    final cpr c;
    final Map<Type, cps<?>> d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    final boolean i;
    final boolean j;
    final boolean k;
    final String l;
    final int m;
    final int n;
    final cqa o;
    final List<cqe> p;
    final List<cqe> q;
    final cqc r;
    final cqc s;
    private final ThreadLocal<Map<crb<?>, FutureTypeAdapter<?>>> u;
    private final Map<crb<?>, cqd<?>> v;
    private final cqm w;
    private final JsonAdapterAnnotationTypeAdapterFactory x;

    public Gson() {
        this(Excluder.a, cpq.IDENTITY, Collections.emptyMap(), cqa.DEFAULT, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), cqb.DOUBLE, cqb.LAZILY_PARSED_NUMBER);
    }

    private Gson(Excluder excluder, cpr cprVar, Map<Type, cps<?>> map, cqa cqaVar, List<cqe> list, List<cqe> list2, List<cqe> list3, cqc cqcVar, cqc cqcVar2) {
        final cqd<Number> cqdVar;
        this.u = new ThreadLocal<>();
        this.v = new ConcurrentHashMap();
        this.b = excluder;
        this.c = cprVar;
        this.d = map;
        this.w = new cqm(map);
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = false;
        this.j = false;
        this.k = false;
        this.o = cqaVar;
        this.l = null;
        this.m = 2;
        this.n = 2;
        this.p = list;
        this.q = list2;
        this.r = cqcVar;
        this.s = cqcVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.V);
        arrayList.add(ObjectTypeAdapter.a(cqcVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.B);
        arrayList.add(TypeAdapters.m);
        arrayList.add(TypeAdapters.g);
        arrayList.add(TypeAdapters.i);
        arrayList.add(TypeAdapters.k);
        if (cqaVar == cqa.DEFAULT) {
            cqdVar = TypeAdapters.t;
        } else {
            cqdVar = new cqd<Number>() { // from class: com.google.gson.Gson.3
                @Override // defpackage.cqd
                public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        jsonWriter.nullValue();
                    } else {
                        jsonWriter.value(number2.toString());
                    }
                }

                @Override // defpackage.cqd
                public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    return Long.valueOf(jsonReader.nextLong());
                }
            };
        }
        arrayList.add(TypeAdapters.a(Long.TYPE, Long.class, cqdVar));
        arrayList.add(TypeAdapters.a(Double.TYPE, Double.class, new cqd<Number>() { // from class: com.google.gson.Gson.1
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.a(number2.doubleValue());
                jsonWriter.value(number2);
            }

            @Override // defpackage.cqd
            public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Double.valueOf(jsonReader.nextDouble());
            }
        }));
        arrayList.add(TypeAdapters.a(Float.TYPE, Float.class, new cqd<Number>() { // from class: com.google.gson.Gson.2
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.a(number2.floatValue());
                jsonWriter.value(number2);
            }

            @Override // defpackage.cqd
            public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float) jsonReader.nextDouble());
            }
        }));
        arrayList.add(NumberTypeAdapter.a(cqcVar2));
        arrayList.add(TypeAdapters.o);
        arrayList.add(TypeAdapters.q);
        arrayList.add(TypeAdapters.a(AtomicLong.class, new cqd<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                cqd.this.a(jsonWriter, Long.valueOf(atomicLong.get()));
            }

            @Override // defpackage.cqd
            public final /* synthetic */ AtomicLong a(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number) cqd.this.a(jsonReader)).longValue());
            }
        }.a()));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, new cqd<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                jsonWriter.beginArray();
                int length = atomicLongArray2.length();
                for (int i = 0; i < length; i++) {
                    cqd.this.a(jsonWriter, Long.valueOf(atomicLongArray2.get(i)));
                }
                jsonWriter.endArray();
            }

            @Override // defpackage.cqd
            public final /* synthetic */ AtomicLongArray a(JsonReader jsonReader) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList2.add(Long.valueOf(((Number) cqd.this.a(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList2.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.a()));
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.x);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.z));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.A));
        arrayList.add(TypeAdapters.H);
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.T);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.d);
        arrayList.add(DateTypeAdapter.a);
        arrayList.add(TypeAdapters.R);
        if (cra.a) {
            arrayList.add(cra.e);
            arrayList.add(cra.d);
            arrayList.add(cra.f);
        }
        arrayList.add(ArrayTypeAdapter.a);
        arrayList.add(TypeAdapters.b);
        arrayList.add(new CollectionTypeAdapterFactory(this.w));
        arrayList.add(new MapTypeAdapterFactory(this.w));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(this.w);
        this.x = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.W);
        arrayList.add(new ReflectiveTypeAdapterFactory(this.w, cprVar, excluder, this.x));
        this.a = Collections.unmodifiableList(arrayList);
    }

    static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> cqd<T> a(crb<T> crbVar) {
        cqd<T> cqdVar = (cqd<T>) this.v.get(crbVar == null ? t : crbVar);
        if (cqdVar != null) {
            return cqdVar;
        }
        Map<crb<?>, FutureTypeAdapter<?>> map = this.u.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.u.set(map);
            z = true;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(crbVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(crbVar, futureTypeAdapter2);
            for (cqe cqeVar : this.a) {
                cqd<T> a = cqeVar.a(this, crbVar);
                if (a != null) {
                    if (futureTypeAdapter2.a != null) {
                        throw new AssertionError();
                    }
                    futureTypeAdapter2.a = a;
                    this.v.put(crbVar, a);
                    return a;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle ".concat(String.valueOf(crbVar)));
        } finally {
            map.remove(crbVar);
            if (z) {
                this.u.remove();
            }
        }
    }

    public final <T> cqd<T> a(cqe cqeVar, crb<T> crbVar) {
        if (!this.a.contains(cqeVar)) {
            cqeVar = this.x;
        }
        boolean z = false;
        for (cqe cqeVar2 : this.a) {
            if (z) {
                cqd<T> a = cqeVar2.a(this, crbVar);
                if (a != null) {
                    return a;
                }
            } else if (cqeVar2 == cqeVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(crbVar)));
    }

    public final <T> cqd<T> a(Class<T> cls) {
        return a((crb) crb.a((Class) cls));
    }

    public final String a(Object obj) {
        if (obj == null) {
            cpw cpwVar = cpw.a;
            StringWriter stringWriter = new StringWriter();
            try {
                JsonWriter a = a((Writer) stringWriter);
                boolean isLenient = a.isLenient();
                a.setLenient(true);
                boolean isHtmlSafe = a.isHtmlSafe();
                a.setHtmlSafe(this.h);
                boolean serializeNulls = a.getSerializeNulls();
                a.setSerializeNulls(this.e);
                try {
                    cqs.a(cpwVar, a);
                    a.setLenient(isLenient);
                    a.setHtmlSafe(isHtmlSafe);
                    a.setSerializeNulls(serializeNulls);
                    return stringWriter.toString();
                } catch (IOException e) {
                    throw new JsonIOException(e);
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            JsonWriter a2 = a((Writer) stringWriter2);
            cqd a3 = a((crb) crb.a((Type) cls));
            boolean isLenient2 = a2.isLenient();
            a2.setLenient(true);
            boolean isHtmlSafe2 = a2.isHtmlSafe();
            a2.setHtmlSafe(this.h);
            boolean serializeNulls2 = a2.getSerializeNulls();
            a2.setSerializeNulls(this.e);
            try {
                try {
                    a3.a(a2, obj);
                    a2.setLenient(isLenient2);
                    a2.setHtmlSafe(isHtmlSafe2);
                    a2.setSerializeNulls(serializeNulls2);
                    return stringWriter2.toString();
                } catch (IOException e4) {
                    throw new JsonIOException(e4);
                }
            } catch (AssertionError e5) {
                AssertionError assertionError2 = new AssertionError("AssertionError (GSON 2.8.9): " + e5.getMessage());
                assertionError2.initCause(e5);
                throw assertionError2;
            }
        } catch (IOException e6) {
            throw new JsonIOException(e6);
        }
    }

    public final JsonWriter a(Writer writer) throws IOException {
        if (this.g) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.i) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.e);
        return jsonWriter;
    }

    public final JsonReader a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.j);
        return jsonReader;
    }

    public final <T> T a(String str, Class<T> cls) throws JsonSyntaxException {
        Object a = a(str, (Type) cls);
        if (cls == Integer.TYPE) {
            cls = (Class<T>) Integer.class;
        } else if (cls == Float.TYPE) {
            cls = (Class<T>) Float.class;
        } else if (cls == Byte.TYPE) {
            cls = (Class<T>) Byte.class;
        } else if (cls == Double.TYPE) {
            cls = (Class<T>) Double.class;
        } else if (cls == Long.TYPE) {
            cls = (Class<T>) Long.class;
        } else if (cls == Character.TYPE) {
            cls = (Class<T>) Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = (Class<T>) Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = (Class<T>) Short.class;
        } else if (cls == Void.TYPE) {
            cls = (Class<T>) Void.class;
        }
        return cls.cast(a);
    }

    public final <T> T a(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) a(new StringReader(str), type);
    }

    private <T> T a(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        JsonReader a = a(reader);
        T t2 = (T) a(a, type);
        a(t2, a);
        return t2;
    }

    private static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                    return;
                }
                throw new JsonIOException("JSON document was not fully consumed.");
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    private <T> T a(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z = false;
                    T a = a((crb) crb.a(type)).a(jsonReader);
                    jsonReader.setLenient(isLenient);
                    return a;
                } catch (IOException e) {
                    throw new JsonSyntaxException(e);
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new JsonSyntaxException(e3);
                }
                jsonReader.setLenient(isLenient);
                return null;
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class FutureTypeAdapter<T> extends cqd<T> {
        cqd<T> a;

        FutureTypeAdapter() {
        }

        @Override // defpackage.cqd
        public final T a(JsonReader jsonReader) throws IOException {
            cqd<T> cqdVar = this.a;
            if (cqdVar == null) {
                throw new IllegalStateException();
            }
            return cqdVar.a(jsonReader);
        }

        @Override // defpackage.cqd
        public final void a(JsonWriter jsonWriter, T t) throws IOException {
            cqd<T> cqdVar = this.a;
            if (cqdVar == null) {
                throw new IllegalStateException();
            }
            cqdVar.a(jsonWriter, t);
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.e + ",factories:" + this.a + ",instanceCreators:" + this.w + "}";
    }
}
