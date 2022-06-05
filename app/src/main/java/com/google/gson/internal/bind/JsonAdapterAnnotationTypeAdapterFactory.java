package com.google.gson.internal.bind;

import com.google.gson.Gson;

/* loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements cqe {
    private final cqm a;

    public JsonAdapterAnnotationTypeAdapterFactory(cqm cqmVar) {
        this.a = cqmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqd<?> a(cqm cqmVar, Gson gson, crb<?> crbVar, cqg cqgVar) {
        cqd<?> cqdVar;
        Object a = cqmVar.a(crb.a((Class) cqgVar.a())).a();
        if (a instanceof cqd) {
            cqdVar = (cqd) a;
        } else if (a instanceof cqe) {
            cqdVar = ((cqe) a).a(gson, crbVar);
        } else {
            boolean z = a instanceof cpz;
            if (z || (a instanceof cpu)) {
                cpu cpuVar = null;
                cpz cpzVar = z ? (cpz) a : null;
                if (a instanceof cpu) {
                    cpuVar = (cpu) a;
                }
                cqdVar = new TreeTypeAdapter<>(cpzVar, cpuVar, gson, crbVar, null);
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a.getClass().getName() + " as a @JsonAdapter for " + crbVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (cqdVar == null || !cqgVar.b()) ? cqdVar : cqdVar.a();
    }

    @Override // defpackage.cqe
    public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
        cqg cqgVar = (cqg) crbVar.a.getAnnotation(cqg.class);
        if (cqgVar == null) {
            return null;
        }
        return (cqd<T>) a(this.a, gson, crbVar, cqgVar);
    }
}
