package defpackage;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cqv  reason: default package */
/* loaded from: classes2.dex */
public final class cqv extends JsonWriter {
    private static final Writer c = new Writer() { // from class: cqv.1
        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }
    };
    private static final cpy d = new cpy("closed");
    public final List<cpv> a = new ArrayList();
    public cpv b = cpw.a;
    private String e;

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() throws IOException {
    }

    public cqv() {
        super(c);
    }

    private cpv a() {
        List<cpv> list = this.a;
        return list.get(list.size() - 1);
    }

    private void a(cpv cpvVar) {
        if (this.e == null) {
            if (this.a.isEmpty()) {
                this.b = cpvVar;
                return;
            }
            cpv a = a();
            if (a instanceof cpt) {
                ((cpt) a).a(cpvVar);
                return;
            }
            throw new IllegalStateException();
        }
        if (!(cpvVar instanceof cpw) || getSerializeNulls()) {
            ((cpx) a()).a(this.e, cpvVar);
        }
        this.e = null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() throws IOException {
        cpt cptVar = new cpt();
        a(cptVar);
        this.a.add(cptVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() throws IOException {
        if (this.a.isEmpty() || this.e != null) {
            throw new IllegalStateException();
        }
        if (a() instanceof cpt) {
            List<cpv> list = this.a;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() throws IOException {
        cpx cpxVar = new cpx();
        a(cpxVar);
        this.a.add(cpxVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() throws IOException {
        if (this.a.isEmpty() || this.e != null) {
            throw new IllegalStateException();
        }
        if (a() instanceof cpx) {
            List<cpv> list = this.a;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.a.isEmpty() || this.e != null) {
            throw new IllegalStateException();
        }
        if (a() instanceof cpx) {
            this.e = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        a(new cpy(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() throws IOException {
        a(cpw.a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) throws IOException {
        a(new cpy(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        a(new cpy(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d2) throws IOException {
        if (!isLenient() && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(d2)));
        }
        a(new cpy(Double.valueOf(d2)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) throws IOException {
        a(new cpy(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        a(new cpy(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.a.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.a.add(d);
    }
}
