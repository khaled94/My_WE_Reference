package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public class SqlTimestampTypeAdapter extends cqd<Timestamp> {
    public static final cqe a = new cqe() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // defpackage.cqe
        public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
            if (crbVar.a == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.a((Class) Date.class), (byte) 0);
            }
            return null;
        }
    };
    private final cqd<Date> b;

    /* synthetic */ SqlTimestampTypeAdapter(cqd cqdVar, byte b) {
        this(cqdVar);
    }

    @Override // defpackage.cqd
    public final /* bridge */ /* synthetic */ void a(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.b.a(jsonWriter, timestamp);
    }

    private SqlTimestampTypeAdapter(cqd<Date> cqdVar) {
        this.b = cqdVar;
    }

    @Override // defpackage.cqd
    public final /* synthetic */ Timestamp a(JsonReader jsonReader) throws IOException {
        Date a2 = this.b.a(jsonReader);
        if (a2 != null) {
            return new Timestamp(a2.getTime());
        }
        return null;
    }
}
