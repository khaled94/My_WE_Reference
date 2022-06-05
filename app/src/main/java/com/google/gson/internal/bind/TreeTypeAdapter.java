package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends cqd<T> {
    final Gson a;
    private final cpz<T> b;
    private final cpu<T> c;
    private final crb<T> d;
    private final cqe e;
    private final TreeTypeAdapter<T>.a f = new a(this, (byte) 0);
    private cqd<T> g;

    public TreeTypeAdapter(cpz<T> cpzVar, cpu<T> cpuVar, Gson gson, crb<T> crbVar, cqe cqeVar) {
        this.b = cpzVar;
        this.c = cpuVar;
        this.a = gson;
        this.d = crbVar;
        this.e = cqeVar;
    }

    @Override // defpackage.cqd
    public final T a(JsonReader jsonReader) throws IOException {
        if (this.c == null) {
            return b().a(jsonReader);
        }
        if (!(cqs.a(jsonReader) instanceof cpw)) {
            return this.c.a();
        }
        return null;
    }

    @Override // defpackage.cqd
    public final void a(JsonWriter jsonWriter, T t) throws IOException {
        cpz<T> cpzVar = this.b;
        if (cpzVar == null) {
            b().a(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            cqs.a(cpzVar.a(), jsonWriter);
        }
    }

    private cqd<T> b() {
        cqd<T> cqdVar = this.g;
        if (cqdVar != null) {
            return cqdVar;
        }
        cqd<T> a2 = this.a.a(this.e, this.d);
        this.g = a2;
        return a2;
    }

    /* loaded from: classes.dex */
    static final class SingleTypeFactory implements cqe {
        private final crb<?> a;
        private final boolean b;
        private final Class<?> c;
        private final cpz<?> d;
        private final cpu<?> e;

        @Override // defpackage.cqe
        public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
            boolean z;
            crb<?> crbVar2 = this.a;
            if (crbVar2 != null) {
                z = crbVar2.equals(crbVar) || (this.b && this.a.b == crbVar.a);
            } else {
                z = this.c.isAssignableFrom(crbVar.a);
            }
            if (z) {
                return new TreeTypeAdapter(this.d, this.e, gson, crbVar, this);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    final class a {
        private a() {
        }

        /* synthetic */ a(TreeTypeAdapter treeTypeAdapter, byte b) {
            this();
        }
    }
}
