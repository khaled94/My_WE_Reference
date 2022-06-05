package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import defpackage.ebd;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/* renamed from: efv  reason: default package */
/* loaded from: classes2.dex */
final class efv<T> implements efc<ebd, T> {
    private final Gson a;
    private final cqd<T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public efv(Gson gson, cqd<T> cqdVar) {
        this.a = gson;
        this.b = cqdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public T a(ebd ebdVar) throws IOException {
        Gson gson = this.a;
        Reader reader = ebdVar.a;
        if (reader == null) {
            edw d = ebdVar.d();
            eau a = ebdVar.a();
            reader = new ebd.a(d, a != null ? a.a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8);
            ebdVar.a = reader;
        }
        JsonReader a2 = gson.a(reader);
        try {
            T a3 = this.b.a(a2);
            if (a2.peek() == JsonToken.END_DOCUMENT) {
                return a3;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            ebdVar.close();
        }
    }
}
