package defpackage;

import android.os.Build;
import java.io.File;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u0001:\u0003,-.B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001b\b\u0012\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rB\u000f\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010%\u001a\u00020&J\u0011\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010*\u001a\u00020&J\b\u0010+\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0010\u0010 \u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0004\n\u0002\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData;", "", "features", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)V", "e", "", "t", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "(Ljava/lang/Throwable;Lcom/facebook/internal/instrument/InstrumentData$Type;)V", "anrCause", "", "st", "(Ljava/lang/String;Ljava/lang/String;)V", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "analysisReportParameters", "Lorg/json/JSONObject;", "getAnalysisReportParameters", "()Lorg/json/JSONObject;", "appVersion", "cause", "exceptionReportParameters", "getExceptionReportParameters", "featureNames", "filename", "isValid", "", "()Z", "parameters", "getParameters", "stackTrace", "timestamp", "", "Ljava/lang/Long;", "type", "clear", "", "compareTo", "", "data", "save", "toString", "Builder", "Companion", "Type", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qp  reason: default package */
/* loaded from: classes2.dex */
public final class qp {
    public static final b a = new b((byte) 0);
    private String b;
    private c c;
    private JSONArray d;
    private String e;
    private String f;
    private String g;
    private Long h;

    public /* synthetic */ qp(File file, byte b2) {
        this(file);
    }

    public /* synthetic */ qp(String str, String str2, byte b2) {
        this(str, str2);
    }

    public /* synthetic */ qp(Throwable th, c cVar, byte b2) {
        this(th, cVar);
    }

    public /* synthetic */ qp(JSONArray jSONArray, byte b2) {
        this(jSONArray);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "(Ljava/lang/String;I)V", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "toString", "Unknown", "Analysis", "AnrReport", "CrashReport", "CrashShield", "ThreadCheck", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qp$c */
    /* loaded from: classes2.dex */
    public enum c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        @Override // java.lang.Enum
        public final String toString() {
            int i = qq.$EnumSwitchMapping$0[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }

        public final String getLogPrefix() {
            int i = qq.$EnumSwitchMapping$1[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }
    }

    private qp(JSONArray jSONArray) {
        this.c = c.Analysis;
        this.h = Long.valueOf(System.currentTimeMillis() / 1000);
        this.d = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(this.h));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        dqc.b(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.b = stringBuffer2;
    }

    private qp(Throwable th, c cVar) {
        this.c = cVar;
        this.e = qi.b();
        this.f = qt.a(th);
        this.g = qt.b(th);
        this.h = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.getLogPrefix());
        stringBuffer.append(String.valueOf(this.h));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        dqc.b(stringBuffer2, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.b = stringBuffer2;
    }

    private qp(String str, String str2) {
        this.c = c.AnrReport;
        this.e = qi.b();
        this.f = str;
        this.g = str2;
        this.h = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(this.h));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        dqc.b(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.b = stringBuffer2;
    }

    private qp(File file) {
        c cVar;
        String name = file.getName();
        dqc.b(name, "file.name");
        this.b = name;
        if (dsg.c(name, "crash_log_")) {
            cVar = c.CrashReport;
        } else if (dsg.c(name, "shield_log_")) {
            cVar = c.CrashShield;
        } else if (dsg.c(name, "thread_check_log_")) {
            cVar = c.ThreadCheck;
        } else if (dsg.c(name, "analysis_log_")) {
            cVar = c.Analysis;
        } else if (dsg.c(name, "anr_log_")) {
            cVar = c.AnrReport;
        } else {
            cVar = c.Unknown;
        }
        this.c = cVar;
        JSONObject a2 = qt.a(this.b);
        if (a2 != null) {
            this.h = Long.valueOf(a2.optLong("timestamp", 0L));
            this.e = a2.optString("app_version", null);
            this.f = a2.optString("reason", null);
            this.g = a2.optString("callstack", null);
            this.d = a2.optJSONArray("feature_names");
        }
    }

    public final int a(qp qpVar) {
        dqc.d(qpVar, "data");
        Long l = this.h;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = qpVar.h;
            if (l2 == null) {
                return 1;
            }
            return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
        }
        return -1;
    }

    public final boolean a() {
        c cVar = this.c;
        if (cVar != null) {
            int i = qr.$EnumSwitchMapping$0[cVar.ordinal()];
            return i != 1 ? i != 2 ? ((i != 3 && i != 4 && i != 5) || this.g == null || this.h == null) ? false : true : (this.g == null || this.f == null || this.h == null) ? false : true : (this.d == null || this.h == null) ? false : true;
        }
        return false;
    }

    public final void b() {
        if (!a()) {
            return;
        }
        qt.a(this.b, toString());
    }

    public final void c() {
        qt.b(this.b);
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.d != null) {
                jSONObject.put("feature_names", this.d);
            }
            if (this.h != null) {
                jSONObject.put("timestamp", this.h);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            if (this.e != null) {
                jSONObject.put("app_version", this.e);
            }
            if (this.h != null) {
                jSONObject.put("timestamp", this.h);
            }
            if (this.f != null) {
                jSONObject.put("reason", this.f);
            }
            if (this.g != null) {
                jSONObject.put("callstack", this.g);
            }
            if (this.c != null) {
                jSONObject.put("type", this.c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Builder;", "", "()V", "build", "Lcom/facebook/internal/instrument/InstrumentData;", "anrCause", "", "st", "e", "", "t", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "features", "Lorg/json/JSONArray;", "load", "file", "Ljava/io/File;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qp$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final qp a(File file) {
            dqc.d(file, "file");
            return new qp(file, (byte) 0);
        }

        public static final qp a(Throwable th, c cVar) {
            dqc.d(cVar, "t");
            return new qp(th, cVar, (byte) 0);
        }

        public static final qp a(JSONArray jSONArray) {
            dqc.d(jSONArray, "features");
            return new qp(jSONArray, (byte) 0);
        }

        public static final qp a(String str, String str2) {
            return new qp(str, str2, (byte) 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Companion;", "", "()V", "PARAM_APP_VERSION", "", "PARAM_CALLSTACK", "PARAM_DEVICE_MODEL", "PARAM_DEVICE_OS", "PARAM_FEATURE_NAMES", "PARAM_REASON", "PARAM_TIMESTAMP", "PARAM_TYPE", "UNKNOWN", "getType", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "filename", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qp$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r2 = this;
            qp$c r0 = r2.c
            if (r0 != 0) goto L5
            goto L1c
        L5:
            int[] r1 = defpackage.qr.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L23
            r1 = 2
            if (r0 == r1) goto L1e
            r1 = 3
            if (r0 == r1) goto L1e
            r1 = 4
            if (r0 == r1) goto L1e
            r1 = 5
            if (r0 == r1) goto L1e
        L1c:
            r0 = 0
            goto L27
        L1e:
            org.json.JSONObject r0 = r2.e()
            goto L27
        L23:
            org.json.JSONObject r0 = r2.d()
        L27:
            if (r0 != 0) goto L38
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JSONObject().toString()"
            defpackage.dqc.b(r0, r1)
            return r0
        L38:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "params.toString()"
            defpackage.dqc.b(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp.toString():java.lang.String");
    }
}
