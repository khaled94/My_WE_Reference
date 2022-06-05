package defpackage;

import defpackage.lz;
import defpackage.qp;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/internal/instrument/anrreport/ANRHandler;", "", "()V", "MAX_ANR_REPORT_NUM", "", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enable", "", "sendANRReports", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qv  reason: default package */
/* loaded from: classes2.dex */
public final class qv {
    public static final qv a = new qv();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/facebook/internal/instrument/InstrumentData;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qv$b */
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

    private qv() {
    }

    public static final synchronized void a() {
        synchronized (qv.class) {
            if (qx.a(qv.class)) {
                return;
            }
            if (b.getAndSet(true)) {
                return;
            }
            if (ly.p() && !qx.a(qv.class)) {
                try {
                    if (!qi.h()) {
                        File[] a2 = qt.a();
                        ArrayList arrayList = new ArrayList(a2.length);
                        for (File file : a2) {
                            arrayList.add(qp.a.a(file));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (((qp) obj).a()) {
                                arrayList2.add(obj);
                            }
                        }
                        List a3 = dmq.a((Iterable) arrayList2, (Comparator) b.a);
                        JSONArray jSONArray = new JSONArray();
                        Iterator<Integer> it = drb.a(0, Math.min(a3.size(), 5)).iterator();
                        while (it.hasNext()) {
                            jSONArray.put(a3.get(((dnf) it).nextInt()));
                        }
                        qt.a("anr_reports", jSONArray, new a(a3));
                    }
                } catch (Throwable th) {
                    qx.a(th, qv.class);
                }
            }
            qu.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qv$a */
    /* loaded from: classes2.dex */
    public static final class a implements lz.b {
        final /* synthetic */ List a;

        a(List list) {
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
