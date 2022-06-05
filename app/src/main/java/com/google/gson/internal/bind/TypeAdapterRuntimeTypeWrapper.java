package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends cqd<T> {
    private final Gson a;
    private final cqd<T> b;
    private final Type c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapterRuntimeTypeWrapper(Gson gson, cqd<T> cqdVar, Type type) {
        this.a = gson;
        this.b = cqdVar;
        this.c = type;
    }

    @Override // defpackage.cqd
    public final T a(JsonReader jsonReader) throws IOException {
        return this.b.a(jsonReader);
    }

    @Override // defpackage.cqd
    public final void a(JsonWriter jsonWriter, T t) throws IOException {
        cqd<T> cqdVar = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            cqdVar = this.a.a((crb) crb.a(type));
            if (cqdVar instanceof ReflectiveTypeAdapterFactory.Adapter) {
                cqd<T> cqdVar2 = this.b;
                if (!(cqdVar2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    cqdVar = cqdVar2;
                }
            }
        }
        cqdVar.a(jsonWriter, t);
    }
}
