package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class DateTypeAdapter extends cqd<Date> {
    public static final cqe a = new cqe() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // defpackage.cqe
        public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
            if (crbVar.a == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> b;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (cqn.b()) {
            this.b.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US));
        }
    }

    private synchronized Date a(String str) {
        for (DateFormat dateFormat : this.b) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return cqw.a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.b.get(0).format(date));
        }
    }

    @Override // defpackage.cqd
    public final /* synthetic */ Date a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return a(jsonReader.nextString());
    }
}
