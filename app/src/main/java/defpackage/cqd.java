package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: cqd  reason: default package */
/* loaded from: classes2.dex */
public abstract class cqd<T> {
    public abstract T a(JsonReader jsonReader) throws IOException;

    public abstract void a(JsonWriter jsonWriter, T t) throws IOException;

    public final cqd<T> a() {
        return new cqd<T>() { // from class: com.google.gson.TypeAdapter$1
            @Override // defpackage.cqd
            public final void a(JsonWriter jsonWriter, T t) throws IOException {
                if (t == 0) {
                    jsonWriter.nullValue();
                } else {
                    cqd.this.a(jsonWriter, t);
                }
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
            @Override // defpackage.cqd
            public final T a(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return cqd.this.a(jsonReader);
            }
        };
    }

    public final cpv a(T t) {
        try {
            cqv cqvVar = new cqv();
            a(cqvVar, t);
            if (!cqvVar.a.isEmpty()) {
                throw new IllegalStateException("Expected one JSON element but was " + cqvVar.a);
            }
            return cqvVar.b;
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }
}
