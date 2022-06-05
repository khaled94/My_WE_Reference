package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes.dex */
public final class NumberTypeAdapter extends cqd<Number> {
    private static final cqe a = b(cqb.LAZILY_PARSED_NUMBER);
    private final cqc b;

    @Override // defpackage.cqd
    public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }

    private NumberTypeAdapter(cqc cqcVar) {
        this.b = cqcVar;
    }

    private static cqe b(cqc cqcVar) {
        return new cqe() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // defpackage.cqe
            public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
                if (crbVar.a == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    public static cqe a(cqc cqcVar) {
        if (cqcVar == cqb.LAZILY_PARSED_NUMBER) {
            return a;
        }
        return b(cqcVar);
    }

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // defpackage.cqd
    public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i = AnonymousClass2.a[peek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return null;
        } else if (i == 2 || i == 3) {
            return this.b.readNumber(jsonReader);
        } else {
            throw new JsonSyntaxException("Expecting number, got: ".concat(String.valueOf(peek)));
        }
    }
}
