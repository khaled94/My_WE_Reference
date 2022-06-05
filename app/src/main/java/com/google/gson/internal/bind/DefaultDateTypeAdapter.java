package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends cqd<T> {
    private final a<T> a;
    private final List<DateFormat> b;

    @Override // defpackage.cqd
    public final /* synthetic */ void a(JsonWriter jsonWriter, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.b) {
            jsonWriter.value(this.b.get(0).format(date));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a<T extends Date> {
        public static final a<Date> a = new a<Date>(Date.class) { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.a.1
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
            protected final Date a(Date date) {
                return date;
            }
        };
        private final Class<T> b;

        protected abstract T a(Date date);

        /* JADX INFO: Access modifiers changed from: protected */
        public a(Class<T> cls) {
            this.b = cls;
        }
    }

    private Date a(String str) {
        synchronized (this.b) {
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
    }

    public final String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // defpackage.cqd
    public final /* synthetic */ Object a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.a.a(a(jsonReader.nextString()));
    }
}
