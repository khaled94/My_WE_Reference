package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: cqs  reason: default package */
/* loaded from: classes2.dex */
public final class cqs {
    private cqs() {
        throw new UnsupportedOperationException();
    }

    public static cpv a(JsonReader jsonReader) throws JsonParseException {
        EOFException e;
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            try {
                return TypeAdapters.U.a(jsonReader);
            } catch (EOFException e3) {
                e = e3;
                if (z) {
                    return cpw.a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e4) {
            throw new JsonSyntaxException(e4);
        } catch (IOException e5) {
            throw new JsonIOException(e5);
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }

    public static void a(cpv cpvVar, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.U.a(jsonWriter, cpvVar);
    }
}
