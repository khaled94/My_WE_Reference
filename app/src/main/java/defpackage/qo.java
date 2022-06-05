package defpackage;

import defpackage.lz;
import defpackage.pr;
import defpackage.qp;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\r\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/instrument/ExceptionAnalyzer;", "", "()V", "enabled", "", "enable", "", "execute", "e", "", "isDebug", "isDebug$facebook_core_release", "sendExceptionAnalysisReports", "sendExceptionAnalysisReports$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qo  reason: default package */
/* loaded from: classes2.dex */
public final class qo {
    public static final qo a = new qo();
    private static boolean b;

    private qo() {
    }

    public static final void a() {
        b = true;
        if (!ly.p() || qi.h()) {
            return;
        }
        File[] b2 = qt.b();
        ArrayList arrayList = new ArrayList();
        for (File file : b2) {
            qp a2 = qp.a.a(file);
            if (a2.a()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", a2.toString());
                    lz.c cVar = lz.k;
                    dqi dqiVar = dqi.a;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{ly.m()}, 1));
                    dqc.b(format, "java.lang.String.format(format, *args)");
                    arrayList.add(lz.c.a((lk) null, format, jSONObject, new a(a2)));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new mb(arrayList).a();
    }

    public static final void a(Throwable th) {
        if (!b || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        dqc.b(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            dqc.b(stackTraceElement, "it");
            String className = stackTraceElement.getClassName();
            dqc.b(className, "it.className");
            pr.b a2 = pr.a(className);
            if (a2 != pr.b.Unknown) {
                pr.b(a2);
                hashSet.add(a2.toString());
            }
        }
        if (!ly.p()) {
            return;
        }
        HashSet hashSet2 = hashSet;
        if (!(!hashSet2.isEmpty())) {
            return;
        }
        qp.a.a(new JSONArray((Collection) hashSet2)).b();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qo$a */
    /* loaded from: classes2.dex */
    static final class a implements lz.b {
        final /* synthetic */ qp a;

        a(qp qpVar) {
            this.a = qpVar;
        }

        @Override // defpackage.lz.b
        public final void a(mc mcVar) {
            JSONObject jSONObject;
            dqc.d(mcVar, "response");
            try {
                if (mcVar.c != null || (jSONObject = mcVar.a) == null || !jSONObject.getBoolean("success")) {
                    return;
                }
                this.a.c();
            } catch (JSONException unused) {
            }
        }
    }
}
