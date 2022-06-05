package defpackage;

import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* renamed from: cqb  reason: default package */
/* loaded from: classes2.dex */
public enum cqb implements cqc {
    DOUBLE { // from class: cqb.1
        @Override // defpackage.cqc
        public final Double readNumber(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: cqb.2
        @Override // defpackage.cqc
        public final Number readNumber(JsonReader jsonReader) throws IOException {
            return new cqp(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: cqb.3
        @Override // defpackage.cqc
        public final Number readNumber(JsonReader jsonReader) throws IOException, JsonParseException {
            String nextString = jsonReader.nextString();
            try {
                try {
                    return Long.valueOf(Long.parseLong(nextString));
                } catch (NumberFormatException e) {
                    throw new JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPath(), e);
                }
            } catch (NumberFormatException unused) {
                Double valueOf = Double.valueOf(nextString);
                if ((!valueOf.isInfinite() && !valueOf.isNaN()) || jsonReader.isLenient()) {
                    return valueOf;
                }
                throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPath());
            }
        }
    },
    BIG_DECIMAL { // from class: cqb.4
        @Override // defpackage.cqc
        public final BigDecimal readNumber(JsonReader jsonReader) throws IOException {
            String nextString = jsonReader.nextString();
            try {
                return new BigDecimal(nextString);
            } catch (NumberFormatException e) {
                throw new JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPath(), e);
            }
        }
    }
}
