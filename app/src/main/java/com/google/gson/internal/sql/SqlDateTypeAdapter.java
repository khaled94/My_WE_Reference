package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public final class SqlDateTypeAdapter extends cqd<Date> {
    public static final cqe a = new cqe() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // defpackage.cqe
        public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
            if (crbVar.a == Date.class) {
                return new SqlDateTypeAdapter((byte) 0);
            }
            return null;
        }
    };
    private final DateFormat b;

    /* synthetic */ SqlDateTypeAdapter(byte b) {
        this();
    }

    private SqlDateTypeAdapter() {
        this.b = new SimpleDateFormat("MMM d, yyyy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized Date a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.b.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(date == null ? null : this.b.format((java.util.Date) date));
    }
}
