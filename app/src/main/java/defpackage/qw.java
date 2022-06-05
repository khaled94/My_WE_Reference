package defpackage;

import defpackage.lz;
import defpackage.qp;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "previousHandler", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "uncaughtException", "", "t", "Ljava/lang/Thread;", "e", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qw  reason: default package */
/* loaded from: classes2.dex */
public final class qw implements Thread.UncaughtExceptionHandler {
    public static final a a = new a((byte) 0);
    private static final String c = qw.class.getCanonicalName();
    private static qw d;
    private final Thread.UncaughtExceptionHandler b;

    public /* synthetic */ qw(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, byte b) {
        this(uncaughtExceptionHandler);
    }

    private qw(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        dqc.d(thread, "t");
        dqc.d(th, "e");
        if (qt.c(th)) {
            qo.a(th);
            qp.a.a(th, qp.c.CrashReport).b();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler$Companion;", "", "()V", "MAX_CRASH_REPORT_NUM", "", "TAG", "", "instance", "Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "enable", "", "sendExceptionReports", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qw$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/facebook/internal/instrument/InstrumentData;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 5, 1})
        /* renamed from: qw$a$b */
        /* loaded from: classes2.dex */
        public static final class b<T> implements Comparator {
            public static final b a = new b();

            b() {
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                qp qpVar = (qp) obj2;
                dqc.b(qpVar, "o2");
                return ((qp) obj).a(qpVar);
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final synchronized void a() {
            if (ly.p() && !qi.h()) {
                File[] c = qt.c();
                ArrayList arrayList = new ArrayList(c.length);
                for (File file : c) {
                    arrayList.add(qp.a.a(file));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((qp) obj).a()) {
                        arrayList2.add(obj);
                    }
                }
                List a = dmq.a((Iterable) arrayList2, (Comparator) b.a);
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = drb.a(0, Math.min(a.size(), 5)).iterator();
                while (it.hasNext()) {
                    jSONArray.put(a.get(((dnf) it).nextInt()));
                }
                qt.a("crash_reports", jSONArray, new C0046a(a));
            }
            if (qw.d != null) {
                String unused = qw.c;
                return;
            }
            qw.d = new qw(Thread.getDefaultUncaughtExceptionHandler(), (byte) 0);
            Thread.setDefaultUncaughtExceptionHandler(qw.d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
        /* renamed from: qw$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0046a implements lz.b {
            final /* synthetic */ List a;

            C0046a(List list) {
                this.a = list;
            }

            @Override // defpackage.lz.b
            public final void a(mc mcVar) {
                JSONObject jSONObject;
                dqc.d(mcVar, "response");
                try {
                    if (mcVar.c != null || (jSONObject = mcVar.a) == null || !jSONObject.getBoolean("success")) {
                        return;
                    }
                    for (qp qpVar : this.a) {
                        qpVar.c();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}
