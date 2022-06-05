package defpackage;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\"\u00020\u0001¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0011\u001a\u00020\u00122\n\u0010\u0018\u001a\u00060\bj\u0002`\tJ\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001J\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/facebook/internal/Logger;", "", "behavior", "Lcom/facebook/LoggingBehavior;", "tag", "", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V", "contents", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "", "priority", "getPriority", "()I", "setPriority", "(I)V", "append", "", TypedValues.Custom.S_STRING, "format", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "stringBuilder", "appendKeyValue", "key", "getContents", "log", "logString", "shouldLog", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qc  reason: default package */
/* loaded from: classes2.dex */
public final class qc {
    public static final a a = new a((byte) 0);
    private static final HashMap<String, String> f = new HashMap<>();
    private final mf b;
    private final String c;
    private int e = 3;
    private StringBuilder d = new StringBuilder();

    public qc(mf mfVar, String str) {
        dqc.d(mfVar, "behavior");
        dqc.d(str, "tag");
        this.b = mfVar;
        this.c = "FacebookSDK." + qj.a(str, "tag");
    }

    public final void a() {
        String sb = this.d.toString();
        dqc.b(sb, "contents.toString()");
        b(sb);
        this.d = new StringBuilder();
    }

    private void b(String str) {
        dqc.d(str, TypedValues.Custom.S_STRING);
        a.a(this.b, this.e, this.c, str);
    }

    public final void a(String str, Object obj) {
        dqc.d(str, "key");
        dqc.d(obj, "value");
        a("  %s:\t%s\n", str, obj);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007JA\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/Logger$Companion;", "", "()V", "LOG_TAG_BASE", "", "stringsToReplace", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "log", "", "behavior", "Lcom/facebook/LoggingBehavior;", "priority", "", "tag", TypedValues.Custom.S_STRING, "format", "args", "", "(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "registerAccessToken", "accessToken", "registerStringToReplace", "original", "replace", "replaceStrings", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qc$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        private synchronized void a(String str, String str2) {
            dqc.d(str, "original");
            dqc.d(str2, "replace");
            qc.f.put(str, str2);
        }

        public final synchronized void a(String str) {
            dqc.d(str, "accessToken");
            if (!ly.a(mf.INCLUDE_ACCESS_TOKENS)) {
                a(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final void a(mf mfVar, String str, String str2) {
            dqc.d(mfVar, "behavior");
            dqc.d(str, "tag");
            dqc.d(str2, TypedValues.Custom.S_STRING);
            a(mfVar, 3, str, str2);
        }

        public final void a(mf mfVar, String str, String str2, Object... objArr) {
            dqc.d(mfVar, "behavior");
            dqc.d(str, "tag");
            dqc.d(str2, "format");
            dqc.d(objArr, "args");
            if (ly.a(mfVar)) {
                dqi dqiVar = dqi.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                dqc.b(format, "java.lang.String.format(format, *args)");
                a(mfVar, 3, str, format);
            }
        }

        public final void a(mf mfVar, int i, String str, String str2) {
            dqc.d(mfVar, "behavior");
            dqc.d(str, "tag");
            dqc.d(str2, TypedValues.Custom.S_STRING);
            if (ly.a(mfVar)) {
                String b = b(str2);
                if (!dsg.c(str, "FacebookSDK.")) {
                    str = "FacebookSDK.".concat(String.valueOf(str));
                }
                Log.println(i, str, b);
                if (mfVar != mf.DEVELOPER_ERRORS) {
                    return;
                }
                new Exception().printStackTrace();
            }
        }

        private final synchronized String b(String str) {
            for (Map.Entry entry : qc.f.entrySet()) {
                str = dsg.a(str, (String) entry.getKey(), (String) entry.getValue());
            }
            return str;
        }
    }

    public final void a(String str) {
        dqc.d(str, TypedValues.Custom.S_STRING);
        if (ly.a(this.b)) {
            this.d.append(str);
        }
    }

    private void a(String str, Object... objArr) {
        dqc.d(str, "format");
        dqc.d(objArr, "args");
        if (ly.a(this.b)) {
            StringBuilder sb = this.d;
            dqi dqiVar = dqi.a;
            Object[] copyOf = Arrays.copyOf(objArr, 2);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            dqc.b(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
    }
}
