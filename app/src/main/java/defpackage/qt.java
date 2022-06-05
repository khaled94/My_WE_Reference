package defpackage;

import defpackage.lz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0012\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0007¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0007¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0007¢\u0006\u0002\u0010\u001dJ\u001c\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J$\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u001c\u0010*\u001a\u00020$2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentUtility;", "", "()V", "ANALYSIS_REPORT_PREFIX", "", "ANR_REPORT_PREFIX", "CODELESS_PREFIX", "CRASH_REPORT_PREFIX", "CRASH_SHIELD_PREFIX", "ERROR_REPORT_PREFIX", "FBSDK_PREFIX", "INSTRUMENT_DIR", "SUGGESTED_EVENTS_PREFIX", "THREAD_CHECK_PREFIX", "deleteFile", "", "filename", "getCause", "e", "", "getInstrumentReportDir", "Ljava/io/File;", "getStackTrace", "thread", "Ljava/lang/Thread;", "isSDKRelatedException", "isSDKRelatedThread", "listAnrReportFiles", "", "()[Ljava/io/File;", "listExceptionAnalysisReportFiles", "listExceptionReportFiles", "readFile", "Lorg/json/JSONObject;", "deleteOnException", "sendReports", "", "key", "reports", "Lorg/json/JSONArray;", "callback", "Lcom/facebook/GraphRequest$Callback;", "writeFile", "content", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qt  reason: default package */
/* loaded from: classes2.dex */
public final class qt {
    public static final qt a = new qt();

    private qt() {
    }

    public static final String a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return String.valueOf(th.getCause());
    }

    public static final String b(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final String a(Thread thread) {
        dqc.d(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final boolean c(Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                dqc.b(stackTraceElement, "element");
                String className = stackTraceElement.getClassName();
                dqc.b(className, "element.className");
                if (dsg.c(className, "com.facebook")) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean b(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                dqc.b(stackTraceElement, "element");
                String className = stackTraceElement.getClassName();
                dqc.b(className, "element.className");
                if (dsg.c(className, "com.facebook")) {
                    String className2 = stackTraceElement.getClassName();
                    dqc.b(className2, "element.className");
                    if (!dsg.c(className2, "com.facebook.appevents.codeless")) {
                        String className3 = stackTraceElement.getClassName();
                        dqc.b(className3, "element.className");
                        if (!dsg.c(className3, "com.facebook.appevents.suggestedevents")) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    dqc.b(methodName, "element.methodName");
                    if (!dsg.c(methodName, "onClick")) {
                        String methodName2 = stackTraceElement.getMethodName();
                        dqc.b(methodName2, "element.methodName");
                        if (!dsg.c(methodName2, "onItemClick")) {
                            String methodName3 = stackTraceElement.getMethodName();
                            dqc.b(methodName3, "element.methodName");
                            if (!dsg.c(methodName3, "onTouch")) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public static final File[] a() {
        File d = d();
        if (d == null) {
            return new File[0];
        }
        File[] listFiles = d.listFiles(a.a);
        return listFiles == null ? new File[0] : listFiles;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qt$a */
    /* loaded from: classes2.dex */
    static final class a implements FilenameFilter {
        public static final a a = new a();

        a() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            dqc.b(str, "name");
            dqi dqiVar = dqi.a;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            return new dsf(format).a(str);
        }
    }

    public static final File[] b() {
        File d = d();
        if (d == null) {
            return new File[0];
        }
        File[] listFiles = d.listFiles(b.a);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qt$b */
    /* loaded from: classes2.dex */
    public static final class b implements FilenameFilter {
        public static final b a = new b();

        b() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            dqc.b(str, "name");
            dqi dqiVar = dqi.a;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            return new dsf(format).a(str);
        }
    }

    public static final File[] c() {
        File d = d();
        if (d == null) {
            return new File[0];
        }
        File[] listFiles = d.listFiles(c.a);
        return listFiles == null ? new File[0] : listFiles;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qt$c */
    /* loaded from: classes2.dex */
    static final class c implements FilenameFilter {
        public static final c a = new c();

        c() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            dqc.b(str, "name");
            dqi dqiVar = dqi.a;
            String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
            dqc.b(format, "java.lang.String.format(format, *args)");
            return new dsf(format).a(str);
        }
    }

    public static final JSONObject a(String str) {
        File d = d();
        if (d != null && str != null) {
            try {
                return new JSONObject(qi.a((InputStream) new FileInputStream(new File(d, str))));
            } catch (Exception unused) {
                b(str);
            }
        }
        return null;
    }

    public static final void a(String str, String str2) {
        File d = d();
        if (d == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(d, str));
            byte[] bytes = str2.getBytes(dsd.a);
            dqc.b(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static final boolean b(String str) {
        File d = d();
        if (d == null || str == null) {
            return false;
        }
        return new File(d, str).delete();
    }

    public static final void a(String str, JSONArray jSONArray, lz.b bVar) {
        dqc.d(jSONArray, "reports");
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject g = qi.g();
            if (g != null) {
                Iterator<String> keys = g.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, g.get(next));
                }
            }
            lz.c cVar = lz.k;
            dqi dqiVar = dqi.a;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{ly.m()}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            lz.c.a((lk) null, format, jSONObject, bVar).a();
        } catch (JSONException unused) {
        }
    }

    public static final File d() {
        File file = new File(ly.k().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }
}
