package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class MapTypeAdapterFactory implements cqe {
    final boolean a = false;
    private final cqm b;

    public MapTypeAdapterFactory(cqm cqmVar) {
        this.b = cqmVar;
    }

    /* loaded from: classes.dex */
    final class Adapter<K, V> extends cqd<Map<K, V>> {
        private final cqd<K> b;
        private final cqd<V> c;
        private final cqr<? extends Map<K, V>> d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!MapTypeAdapterFactory.this.a) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.c.a(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    cpv a = this.b.a((cqd<K>) entry2.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry2.getValue());
                    z |= (a instanceof cpt) || (a instanceof cpx);
                }
                if (z) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        jsonWriter.beginArray();
                        cqs.a((cpv) arrayList.get(i), jsonWriter);
                        this.c.a(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    cpv cpvVar = (cpv) arrayList.get(i);
                    if (cpvVar instanceof cpy) {
                        cpy g = cpvVar.g();
                        if (g.a instanceof Number) {
                            str = String.valueOf(g.a());
                        } else if (g.a instanceof Boolean) {
                            str = Boolean.toString(g.f());
                        } else if (g.a instanceof String) {
                            str = g.b();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (!(cpvVar instanceof cpw)) {
                        throw new AssertionError();
                    } else {
                        str = "null";
                    }
                    jsonWriter.name(str);
                    this.c.a(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
            }
        }

        public Adapter(Gson gson, Type type, cqd<K> cqdVar, Type type2, cqd<V> cqdVar2, cqr<? extends Map<K, V>> cqrVar) {
            this.b = new TypeAdapterRuntimeTypeWrapper(gson, cqdVar, type);
            this.c = new TypeAdapterRuntimeTypeWrapper(gson, cqdVar2, type2);
            this.d = cqrVar;
        }

        @Override // defpackage.cqd
        public final /* synthetic */ Object a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> a = this.d.a();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K a2 = this.b.a(jsonReader);
                    if (a.put(a2, this.c.a(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: ".concat(String.valueOf(a2)));
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    cqo.INSTANCE.promoteNameToValue(jsonReader);
                    K a3 = this.b.a(jsonReader);
                    if (a.put(a3, this.c.a(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: ".concat(String.valueOf(a3)));
                    }
                }
                jsonReader.endObject();
            }
            return a;
        }
    }

    @Override // defpackage.cqe
    public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
        cqd<Boolean> cqdVar;
        Type type = crbVar.b;
        if (!Map.class.isAssignableFrom(crbVar.a)) {
            return null;
        }
        Type[] b = cql.b(type, cql.b(type));
        Type type2 = b[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            cqdVar = TypeAdapters.f;
        } else {
            cqdVar = gson.a((crb) crb.a(type2));
        }
        cqd<T> a = gson.a((crb) crb.a(b[1]));
        cqr<T> a2 = this.b.a(crbVar);
        return new Adapter(gson, b[0], cqdVar, b[1], a, a2);
    }
}
