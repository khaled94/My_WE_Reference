package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends cqd<Object> {
    public static final cqe a = new cqe() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // defpackage.cqe
        public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
            Type type = crbVar.b;
            if ((type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray())) {
                Type d = cql.d(type);
                return new ArrayTypeAdapter(gson, gson.a((crb) crb.a(d)), cql.b(d));
            }
            return null;
        }
    };
    private final Class<E> b;
    private final cqd<E> c;

    public ArrayTypeAdapter(Gson gson, cqd<E> cqdVar, Class<E> cls) {
        this.c = new TypeAdapterRuntimeTypeWrapper(gson, cqdVar, cls);
        this.b = cls;
    }

    @Override // defpackage.cqd
    public final Object a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.c.a(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cqd
    public final void a(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.a(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
