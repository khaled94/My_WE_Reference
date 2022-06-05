package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public final class SqlTimeTypeAdapter extends cqd<Time> {
    public static final cqe a = new cqe() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // defpackage.cqe
        public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
            if (crbVar.a == Time.class) {
                return new SqlTimeTypeAdapter((byte) 0);
            }
            return null;
        }
    };
    private final DateFormat b;

    /* synthetic */ SqlTimeTypeAdapter(byte b) {
        this();
    }

    private SqlTimeTypeAdapter() {
        this.b = new SimpleDateFormat("hh:mm:ss a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized Time a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.b.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(JsonWriter jsonWriter, Time time) throws IOException {
        jsonWriter.value(time == null ? null : this.b.format((Date) time));
    }
}
