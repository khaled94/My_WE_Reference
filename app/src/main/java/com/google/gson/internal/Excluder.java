package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Excluder implements cqe, Cloneable {
    public static final Excluder a = new Excluder();
    public boolean e;
    public double b = -1.0d;
    public int c = 136;
    public boolean d = true;
    public List<cpo> f = Collections.emptyList();
    public List<cpo> g = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean a(Class<?> cls) {
        if (this.b == -1.0d || a((cqi) cls.getAnnotation(cqi.class), (cqj) cls.getAnnotation(cqj.class))) {
            return (!this.d && c(cls)) || b(cls);
        }
        return true;
    }

    public final boolean a(boolean z) {
        for (cpo cpoVar : z ? this.f : this.g) {
            if (cpoVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || d(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    private static boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean a(cqi cqiVar, cqj cqjVar) {
        return a(cqiVar) && a(cqjVar);
    }

    private boolean a(cqi cqiVar) {
        return cqiVar == null || cqiVar.a() <= this.b;
    }

    private boolean a(cqj cqjVar) {
        return cqjVar == null || cqjVar.a() > this.b;
    }

    @Override // defpackage.cqe
    public final <T> cqd<T> a(final Gson gson, final crb<T> crbVar) {
        boolean a2 = a(crbVar.a);
        final boolean z = a2 || a(true);
        final boolean z2 = a2 || a(false);
        if (z || z2) {
            return new cqd<T>() { // from class: com.google.gson.internal.Excluder.1
                private cqd<T> f;

                /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
                @Override // defpackage.cqd
                public final T a(JsonReader jsonReader) throws IOException {
                    if (z2) {
                        jsonReader.skipValue();
                        return null;
                    }
                    return b().a(jsonReader);
                }

                @Override // defpackage.cqd
                public final void a(JsonWriter jsonWriter, T t) throws IOException {
                    if (z) {
                        jsonWriter.nullValue();
                    } else {
                        b().a(jsonWriter, t);
                    }
                }

                private cqd<T> b() {
                    cqd<T> cqdVar = this.f;
                    if (cqdVar != 0) {
                        return cqdVar;
                    }
                    cqd<T> a3 = gson.a(Excluder.this, crbVar);
                    this.f = a3;
                    return a3;
                }
            };
        }
        return null;
    }
}
