package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements cqe {
    private final cqm a;

    public CollectionTypeAdapterFactory(cqm cqmVar) {
        this.a = cqmVar;
    }

    /* loaded from: classes.dex */
    static final class Adapter<E> extends cqd<Collection<E>> {
        private final cqd<E> a;
        private final cqr<? extends Collection<E>> b;

        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E e : collection) {
                this.a.a(jsonWriter, e);
            }
            jsonWriter.endArray();
        }

        public Adapter(Gson gson, Type type, cqd<E> cqdVar, cqr<? extends Collection<E>> cqrVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, cqdVar, type);
            this.b = cqrVar;
        }

        @Override // defpackage.cqd
        public final /* synthetic */ Object a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> a = this.b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                a.add(this.a.a(jsonReader));
            }
            jsonReader.endArray();
            return a;
        }
    }

    @Override // defpackage.cqe
    public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
        Type type = crbVar.b;
        Class<? super T> cls = crbVar.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a = cql.a(type, (Class<?>) cls);
        return new Adapter(gson, a, gson.a((crb) crb.a(a)), this.a.a(crbVar));
    }
}
