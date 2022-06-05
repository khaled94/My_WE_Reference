package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cqu  reason: default package */
/* loaded from: classes2.dex */
public final class cqu extends JsonReader {
    private static final Reader a = new Reader() { // from class: cqu.1
        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }
    };
    private static final Object b = new Object();
    private Object[] c;
    private int d;
    private String[] e;
    private int[] f;

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() throws IOException {
        a(JsonToken.BEGIN_ARRAY);
        a(((cpt) a()).iterator());
        this.f[this.d - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() throws IOException {
        a(JsonToken.END_ARRAY);
        b();
        b();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() throws IOException {
        a(JsonToken.BEGIN_OBJECT);
        a(((cpx) a()).a.entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() throws IOException {
        a(JsonToken.END_OBJECT);
        b();
        b();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() throws IOException {
        while (this.d != 0) {
            Object a2 = a();
            if (a2 instanceof Iterator) {
                boolean z = this.c[this.d - 2] instanceof cpx;
                Iterator it = (Iterator) a2;
                if (!it.hasNext()) {
                    return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
                } else if (z) {
                    return JsonToken.NAME;
                } else {
                    a(it.next());
                }
            } else if (a2 instanceof cpx) {
                return JsonToken.BEGIN_OBJECT;
            } else {
                if (a2 instanceof cpt) {
                    return JsonToken.BEGIN_ARRAY;
                }
                if (a2 instanceof cpy) {
                    cpy cpyVar = (cpy) a2;
                    if (cpyVar.a instanceof String) {
                        return JsonToken.STRING;
                    }
                    if (cpyVar.a instanceof Boolean) {
                        return JsonToken.BOOLEAN;
                    }
                    if (cpyVar.a instanceof Number) {
                        return JsonToken.NUMBER;
                    }
                    throw new AssertionError();
                } else if (a2 instanceof cpw) {
                    return JsonToken.NULL;
                } else {
                    if (a2 == b) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return JsonToken.END_DOCUMENT;
    }

    public final Object a() {
        return this.c[this.d - 1];
    }

    private Object b() {
        Object[] objArr = this.c;
        int i = this.d - 1;
        this.d = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + c());
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) a()).next();
        String str = (String) entry.getKey();
        this.e[this.d - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.STRING && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + peek + c());
        }
        String b2 = ((cpy) b()).b();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return b2;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() throws IOException {
        a(JsonToken.BOOLEAN);
        boolean f = ((cpy) b()).f();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return f;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() throws IOException {
        a(JsonToken.NULL);
        b();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.NUMBER && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + c());
        }
        double c = ((cpy) a()).c();
        if (!isLenient() && (Double.isNaN(c) || Double.isInfinite(c))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(c)));
        }
        b();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return c;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.NUMBER && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + c());
        }
        long d = ((cpy) a()).d();
        b();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.NUMBER && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + c());
        }
        int e = ((cpy) a()).e();
        b();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return e;
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c = new Object[]{b};
        this.d = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.e[this.d - 2] = "null";
        } else {
            b();
            int i = this.d;
            if (i > 0) {
                this.e[i - 1] = "null";
            }
        }
        int i2 = this.d;
        if (i2 > 0) {
            int[] iArr = this.f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return getClass().getSimpleName() + c();
    }

    public final void a(Object obj) {
        int i = this.d;
        Object[] objArr = this.c;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.c = Arrays.copyOf(objArr, i2);
            this.f = Arrays.copyOf(this.f, i2);
            this.e = (String[]) Arrays.copyOf(this.e, i2);
        }
        Object[] objArr2 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.d;
            if (i < i2) {
                Object[] objArr = this.c;
                if (objArr[i] instanceof cpt) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        sb.append('[');
                        sb.append(this.f[i]);
                        sb.append(']');
                    }
                } else if ((objArr[i] instanceof cpx) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('.');
                    String[] strArr = this.e;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    private String c() {
        return " at path " + getPath();
    }
}
