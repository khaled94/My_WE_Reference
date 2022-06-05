package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public final class TypeAdapters {
    public static final cqd<StringBuilder> C;
    public static final cqe D;
    public static final cqd<StringBuffer> E;
    public static final cqe F;
    public static final cqd<URL> G;
    public static final cqe H;
    public static final cqd<URI> I;
    public static final cqe J;
    public static final cqd<InetAddress> K;
    public static final cqe L;
    public static final cqd<UUID> M;
    public static final cqe N;
    public static final cqd<Currency> O;
    public static final cqe P;
    public static final cqd<Calendar> Q;
    public static final cqe R;
    public static final cqd<Locale> S;
    public static final cqe T;
    public static final cqd<cpv> U;
    public static final cqe V;
    public static final cqd<Class> a;
    public static final cqe b;
    public static final cqd<BitSet> c;
    public static final cqe d;
    public static final cqd<AtomicInteger> n;
    public static final cqe o;
    public static final cqd<AtomicBoolean> p;
    public static final cqe q;
    public static final cqd<AtomicIntegerArray> r;
    public static final cqe s;
    public static final cqd<Boolean> e = new cqd<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ Boolean a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
            } else {
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
        }
    };
    public static final cqd<Boolean> f = new cqd<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Boolean bool) throws IOException {
            Boolean bool2 = bool;
            jsonWriter.value(bool2 == null ? "null" : bool2.toString());
        }

        @Override // defpackage.cqd
        public final /* synthetic */ Boolean a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Boolean.valueOf(jsonReader.nextString());
        }
    };
    public static final cqe g = a(Boolean.TYPE, Boolean.class, e);
    public static final cqd<Number> h = new cqd<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
        @Override // defpackage.cqd
        public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
            return b(jsonReader);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }

        private static Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    };
    public static final cqe i = a(Byte.TYPE, Byte.class, h);
    public static final cqd<Number> j = new cqd<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
        @Override // defpackage.cqd
        public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
            return b(jsonReader);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }

        private static Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    };
    public static final cqe k = a(Short.TYPE, Short.class, j);
    public static final cqd<Number> l = new cqd<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
        @Override // defpackage.cqd
        public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
            return b(jsonReader);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }

        private static Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    };
    public static final cqe m = a(Integer.TYPE, Integer.class, l);
    public static final cqd<Number> t = new cqd<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
        @Override // defpackage.cqd
        public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
            return b(jsonReader);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }

        private static Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    };
    public static final cqd<Number> u = new cqd<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }
    };
    public static final cqd<Number> v = new cqd<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ Number a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }
    };
    public static final cqd<Character> w = new cqd<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Character ch) throws IOException {
            Character ch2 = ch;
            jsonWriter.value(ch2 == null ? null : String.valueOf(ch2));
        }

        @Override // defpackage.cqd
        public final /* synthetic */ Character a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if (nextString.length() != 1) {
                throw new JsonSyntaxException("Expecting character, got: ".concat(String.valueOf(nextString)));
            }
            return Character.valueOf(nextString.charAt(0));
        }
    };
    public static final cqe x = a(Character.TYPE, Character.class, w);
    public static final cqd<String> y = new cqd<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ String a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.BOOLEAN) {
                return Boolean.toString(jsonReader.nextBoolean());
            } else {
                return jsonReader.nextString();
            }
        }
    };
    public static final cqd<BigDecimal> z = new cqd<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
        @Override // defpackage.cqd
        public final /* synthetic */ BigDecimal a(JsonReader jsonReader) throws IOException {
            return b(jsonReader);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }

        private static BigDecimal b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    };
    public static final cqd<BigInteger> A = new cqd<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
        @Override // defpackage.cqd
        public final /* synthetic */ BigInteger a(JsonReader jsonReader) throws IOException {
            return b(jsonReader);
        }

        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }

        private static BigInteger b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    };
    public static final cqe B = a(String.class, y);
    public static final cqe W = new cqe() { // from class: com.google.gson.internal.bind.TypeAdapters.28
        @Override // defpackage.cqe
        public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
            Class<? super T> cls = crbVar.a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new EnumTypeAdapter(cls);
        }
    };

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    static {
        cqd<Class> a2 = new cqd<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }

            @Override // defpackage.cqd
            public final /* synthetic */ Class a(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.a();
        a = a2;
        b = a(Class.class, a2);
        cqd<BitSet> a3 = new cqd<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // defpackage.cqd
            public final /* synthetic */ BitSet a(JsonReader jsonReader) throws IOException {
                return b(jsonReader);
            }

            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                BitSet bitSet2 = bitSet;
                jsonWriter.beginArray();
                int length = bitSet2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.value(bitSet2.get(i2) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
                if (r7.nextInt() != 0) goto L22;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.util.BitSet b(com.google.gson.stream.JsonReader r7) throws java.io.IOException {
                /*
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r7.beginArray()
                    com.google.gson.stream.JsonToken r1 = r7.peek()
                    r2 = 0
                    r3 = 0
                Le:
                    com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                    if (r1 == r4) goto L67
                    int[] r4 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.a
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L55
                    r6 = 2
                    if (r4 == r6) goto L50
                    r6 = 3
                    if (r4 != r6) goto L40
                    java.lang.String r1 = r7.nextString()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                    if (r1 == 0) goto L2e
                    goto L5b
                L2e:
                    r5 = 0
                    goto L5b
                L30:
                    com.google.gson.JsonSyntaxException r7 = new com.google.gson.JsonSyntaxException
                    java.lang.String r0 = java.lang.String.valueOf(r1)
                    java.lang.String r1 = "Error: Expecting: bitset number value (1, 0), Found: "
                    java.lang.String r0 = r1.concat(r0)
                    r7.<init>(r0)
                    throw r7
                L40:
                    com.google.gson.JsonSyntaxException r7 = new com.google.gson.JsonSyntaxException
                    java.lang.String r0 = java.lang.String.valueOf(r1)
                    java.lang.String r1 = "Invalid bitset value type: "
                    java.lang.String r0 = r1.concat(r0)
                    r7.<init>(r0)
                    throw r7
                L50:
                    boolean r5 = r7.nextBoolean()
                    goto L5b
                L55:
                    int r1 = r7.nextInt()
                    if (r1 == 0) goto L2e
                L5b:
                    if (r5 == 0) goto L60
                    r0.set(r3)
                L60:
                    int r3 = r3 + 1
                    com.google.gson.stream.JsonToken r1 = r7.peek()
                    goto Le
                L67:
                    r7.endArray()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.b(com.google.gson.stream.JsonReader):java.util.BitSet");
            }
        }.a();
        c = a3;
        d = a(BitSet.class, a3);
        cqd<AtomicInteger> a4 = new cqd<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // defpackage.cqd
            public final /* synthetic */ AtomicInteger a(JsonReader jsonReader) throws IOException {
                return b(jsonReader);
            }

            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }

            private static AtomicInteger b(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }
        }.a();
        n = a4;
        o = a(AtomicInteger.class, a4);
        cqd<AtomicBoolean> a5 = new cqd<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }

            @Override // defpackage.cqd
            public final /* synthetic */ AtomicBoolean a(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }
        }.a();
        p = a5;
        q = a(AtomicBoolean.class, a5);
        cqd<AtomicIntegerArray> a6 = new cqd<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // defpackage.cqd
            public final /* synthetic */ AtomicIntegerArray a(JsonReader jsonReader) throws IOException {
                return b(jsonReader);
            }

            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
                jsonWriter.beginArray();
                int length = atomicIntegerArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.value(atomicIntegerArray2.get(i2));
                }
                jsonWriter.endArray();
            }

            private static AtomicIntegerArray b(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }
        }.a();
        r = a6;
        s = a(AtomicIntegerArray.class, a6);
        cqd<StringBuilder> cqdVar = new cqd<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
                StringBuilder sb2 = sb;
                jsonWriter.value(sb2 == null ? null : sb2.toString());
            }

            @Override // defpackage.cqd
            public final /* synthetic */ StringBuilder a(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuilder(jsonReader.nextString());
            }
        };
        C = cqdVar;
        D = a(StringBuilder.class, cqdVar);
        cqd<StringBuffer> cqdVar2 = new cqd<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                jsonWriter.value(stringBuffer2 == null ? null : stringBuffer2.toString());
            }

            @Override // defpackage.cqd
            public final /* synthetic */ StringBuffer a(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuffer(jsonReader.nextString());
            }
        };
        E = cqdVar2;
        F = a(StringBuffer.class, cqdVar2);
        cqd<URL> cqdVar3 = new cqd<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, URL url) throws IOException {
                URL url2 = url;
                jsonWriter.value(url2 == null ? null : url2.toExternalForm());
            }

            @Override // defpackage.cqd
            public final /* synthetic */ URL a(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (!"null".equals(nextString)) {
                    return new URL(nextString);
                }
                return null;
            }
        };
        G = cqdVar3;
        H = a(URL.class, cqdVar3);
        cqd<URI> cqdVar4 = new cqd<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // defpackage.cqd
            public final /* synthetic */ URI a(JsonReader jsonReader) throws IOException {
                return b(jsonReader);
            }

            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, URI uri) throws IOException {
                URI uri2 = uri;
                jsonWriter.value(uri2 == null ? null : uri2.toASCIIString());
            }

            private static URI b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if (!"null".equals(nextString)) {
                        return new URI(nextString);
                    }
                    return null;
                } catch (URISyntaxException e2) {
                    throw new JsonIOException(e2);
                }
            }
        };
        I = cqdVar4;
        J = a(URI.class, cqdVar4);
        cqd<InetAddress> cqdVar5 = new cqd<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                jsonWriter.value(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }

            @Override // defpackage.cqd
            public final /* synthetic */ InetAddress a(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return InetAddress.getByName(jsonReader.nextString());
            }
        };
        K = cqdVar5;
        L = b(InetAddress.class, cqdVar5);
        cqd<UUID> cqdVar6 = new cqd<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                jsonWriter.value(uuid2 == null ? null : uuid2.toString());
            }

            @Override // defpackage.cqd
            public final /* synthetic */ UUID a(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return UUID.fromString(jsonReader.nextString());
            }
        };
        M = cqdVar6;
        N = a(UUID.class, cqdVar6);
        cqd<Currency> a7 = new cqd<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }

            @Override // defpackage.cqd
            public final /* synthetic */ Currency a(JsonReader jsonReader) throws IOException {
                return Currency.getInstance(jsonReader.nextString());
            }
        }.a();
        O = a7;
        P = a(Currency.class, a7);
        final cqd<Calendar> cqdVar7 = new cqd<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(calendar2.get(1));
                jsonWriter.name("month");
                jsonWriter.value(calendar2.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(calendar2.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(calendar2.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(calendar2.get(12));
                jsonWriter.name("second");
                jsonWriter.value(calendar2.get(13));
                jsonWriter.endObject();
            }

            @Override // defpackage.cqd
            public final /* synthetic */ Calendar a(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i2 = nextInt;
                    } else if ("month".equals(nextName)) {
                        i3 = nextInt;
                    } else if ("dayOfMonth".equals(nextName)) {
                        i4 = nextInt;
                    } else if ("hourOfDay".equals(nextName)) {
                        i5 = nextInt;
                    } else if ("minute".equals(nextName)) {
                        i6 = nextInt;
                    } else if ("second".equals(nextName)) {
                        i7 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }
        };
        Q = cqdVar7;
        R = new cqe() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            public String toString() {
                return "Factory[type=" + r1.getName() + "+" + r2.getName() + ",adapter=" + cqdVar7 + "]";
            }

            @Override // defpackage.cqe
            public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
                Class<? super T> cls = crbVar.a;
                if (cls == r1 || cls == r2) {
                    return cqdVar7;
                }
                return null;
            }
        };
        cqd<Locale> cqdVar8 = new cqd<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // defpackage.cqd
            public final /* synthetic */ void a(JsonWriter jsonWriter, Locale locale) throws IOException {
                Locale locale2 = locale;
                jsonWriter.value(locale2 == null ? null : locale2.toString());
            }

            @Override // defpackage.cqd
            public final /* synthetic */ Locale a(JsonReader jsonReader) throws IOException {
                String str = null;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, str);
            }
        };
        S = cqdVar8;
        T = a(Locale.class, cqdVar8);
        cqd<cpv> cqdVar9 = new cqd<cpv>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b */
            public cpv a(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof cqu) {
                    cqu cquVar = (cqu) jsonReader;
                    JsonToken peek = cquVar.peek();
                    if (peek == JsonToken.NAME || peek == JsonToken.END_ARRAY || peek == JsonToken.END_OBJECT || peek == JsonToken.END_DOCUMENT) {
                        throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
                    }
                    cpv cpvVar = (cpv) cquVar.a();
                    cquVar.skipValue();
                    return cpvVar;
                }
                switch (AnonymousClass34.a[jsonReader.peek().ordinal()]) {
                    case 1:
                        return new cpy(new cqp(jsonReader.nextString()));
                    case 2:
                        return new cpy(Boolean.valueOf(jsonReader.nextBoolean()));
                    case 3:
                        return new cpy(jsonReader.nextString());
                    case 4:
                        jsonReader.nextNull();
                        return cpw.a;
                    case 5:
                        cpt cptVar = new cpt();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            cptVar.a(a(jsonReader));
                        }
                        jsonReader.endArray();
                        return cptVar;
                    case 6:
                        cpx cpxVar = new cpx();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            cpxVar.a(jsonReader.nextName(), a(jsonReader));
                        }
                        jsonReader.endObject();
                        return cpxVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(JsonWriter jsonWriter, cpv cpvVar) throws IOException {
                if (cpvVar == null || (cpvVar instanceof cpw)) {
                    jsonWriter.nullValue();
                } else if (cpvVar instanceof cpy) {
                    cpy g2 = cpvVar.g();
                    if (g2.a instanceof Number) {
                        jsonWriter.value(g2.a());
                    } else if (g2.a instanceof Boolean) {
                        jsonWriter.value(g2.f());
                    } else {
                        jsonWriter.value(g2.b());
                    }
                } else {
                    boolean z2 = cpvVar instanceof cpt;
                    if (z2) {
                        jsonWriter.beginArray();
                        if (z2) {
                            Iterator<cpv> it = ((cpt) cpvVar).iterator();
                            while (it.hasNext()) {
                                a(jsonWriter, it.next());
                            }
                            jsonWriter.endArray();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(cpvVar)));
                    }
                    boolean z3 = cpvVar instanceof cpx;
                    if (z3) {
                        jsonWriter.beginObject();
                        if (z3) {
                            for (Map.Entry<String, cpv> entry : ((cpx) cpvVar).a.entrySet()) {
                                jsonWriter.name(entry.getKey());
                                a(jsonWriter, entry.getValue());
                            }
                            jsonWriter.endObject();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(cpvVar)));
                    }
                    throw new IllegalArgumentException("Couldn't write " + cpvVar.getClass());
                }
            }
        };
        U = cqdVar9;
        V = b(cpv.class, cqdVar9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.bind.TypeAdapters$34  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass34 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    static final class EnumTypeAdapter<T extends Enum<T>> extends cqd<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        @Override // defpackage.cqd
        public final /* synthetic */ void a(JsonWriter jsonWriter, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            jsonWriter.value(r3 == null ? null : this.b.get(r3));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EnumTypeAdapter(Class<T> cls) {
            Field[] declaredFields;
            try {
                for (final Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.google.gson.internal.bind.TypeAdapters.EnumTypeAdapter.1
                            @Override // java.security.PrivilegedAction
                            public final /* synthetic */ Void run() {
                                field.setAccessible(true);
                                return null;
                            }
                        });
                        Enum r4 = (Enum) field.get(null);
                        String name = r4.name();
                        cqh cqhVar = (cqh) field.getAnnotation(cqh.class);
                        if (cqhVar != null) {
                            name = cqhVar.a();
                            for (String str : cqhVar.b()) {
                                this.a.put(str, r4);
                            }
                        }
                        this.a.put(name, r4);
                        this.b.put(r4, name);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // defpackage.cqd
        public final /* synthetic */ Object a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return this.a.get(jsonReader.nextString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$29  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass29 implements cqe {
        final /* synthetic */ crb a;
        final /* synthetic */ cqd b;

        @Override // defpackage.cqe
        public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
            if (crbVar.equals(this.a)) {
                return this.b;
            }
            return null;
        }
    }

    public static <TT> cqe a(final Class<TT> cls, final cqd<TT> cqdVar) {
        return new cqe() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + cqdVar + "]";
            }

            @Override // defpackage.cqe
            public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
                if (crbVar.a == cls) {
                    return cqdVar;
                }
                return null;
            }
        };
    }

    public static <TT> cqe a(final Class<TT> cls, final Class<TT> cls2, final cqd<? super TT> cqdVar) {
        return new cqe() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + cqdVar + "]";
            }

            @Override // defpackage.cqe
            public final <T> cqd<T> a(Gson gson, crb<T> crbVar) {
                Class<? super T> cls3 = crbVar.a;
                if (cls3 == cls || cls3 == cls2) {
                    return cqdVar;
                }
                return null;
            }
        };
    }

    private static <T1> cqe b(final Class<T1> cls, final cqd<T1> cqdVar) {
        return new cqe() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + cqdVar + "]";
            }

            @Override // defpackage.cqe
            public final <T2> cqd<T2> a(Gson gson, crb<T2> crbVar) {
                final Class<? super T2> cls2 = crbVar.a;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                return (cqd<T2>) new cqd<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.33.1
                    @Override // defpackage.cqd
                    public final void a(JsonWriter jsonWriter, T1 t1) throws IOException {
                        cqdVar.a(jsonWriter, t1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T1] */
                    @Override // defpackage.cqd
                    public final T1 a(JsonReader jsonReader) throws IOException {
                        ?? a2 = cqdVar.a(jsonReader);
                        if (a2 == 0 || cls2.isInstance(a2)) {
                            return a2;
                        }
                        throw new JsonSyntaxException("Expected a " + cls2.getName() + " but was " + a2.getClass().getName());
                    }
                };
            }
        };
    }
}
