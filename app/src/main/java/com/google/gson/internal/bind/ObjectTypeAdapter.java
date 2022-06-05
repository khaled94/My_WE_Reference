package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ObjectTypeAdapter extends cqd<Object> {
    private static final cqe a = b(cqb.DOUBLE);
    private final Gson b;
    private final cqc c;

    /* synthetic */ ObjectTypeAdapter(Gson gson, cqc cqcVar, byte b) {
        this(gson, cqcVar);
    }

    private ObjectTypeAdapter(Gson gson, cqc cqcVar) {
        this.b = gson;
        this.c = cqcVar;
    }

    private static cqe b(final cqc cqcVar) {
        return new cqe() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // defpackage.cqe
            public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
                if (crbVar.a == Object.class) {
                    return new ObjectTypeAdapter(gson, cqc.this, (byte) 0);
                }
                return null;
            }
        };
    }

    public static cqe a(cqc cqcVar) {
        if (cqcVar == cqb.DOUBLE) {
            return a;
        }
        return b(cqcVar);
    }

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // defpackage.cqd
    public final Object a(JsonReader jsonReader) throws IOException {
        switch (AnonymousClass2.a[jsonReader.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(a(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case 2:
                cqq cqqVar = new cqq();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    cqqVar.put(jsonReader.nextName(), a(jsonReader));
                }
                jsonReader.endObject();
                return cqqVar;
            case 3:
                return jsonReader.nextString();
            case 4:
                return this.c.readNumber(jsonReader);
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // defpackage.cqd
    public final void a(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        cqd a2 = this.b.a((Class) obj.getClass());
        if (a2 instanceof ObjectTypeAdapter) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        a2.a(jsonWriter, obj);
    }
}
