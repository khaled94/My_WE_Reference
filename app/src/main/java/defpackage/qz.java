package defpackage;

import androidx.core.app.NotificationCompat;
import defpackage.lz;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportHandler;", "", "()V", "MAX_ERROR_REPORT_NUM", "", "enable", "", "listErrorReportFiles", "", "Ljava/io/File;", "()[Ljava/io/File;", "save", NotificationCompat.CATEGORY_MESSAGE, "", "sendErrorReports", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qz  reason: default package */
/* loaded from: classes2.dex */
public final class qz {
    public static final qz a = new qz();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/facebook/internal/instrument/errorreport/ErrorReportData;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qz$b */
    /* loaded from: classes2.dex */
    static final class b<T> implements Comparator {
        public static final b a = new b();

        b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            qy qyVar = (qy) obj2;
            dqc.b(qyVar, "o2");
            dqc.d(qyVar, "data");
            Long l = ((qy) obj).b;
            if (l != null) {
                long longValue = l.longValue();
                Long l2 = qyVar.b;
                if (l2 == null) {
                    return 1;
                }
                return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
            }
            return -1;
        }
    }

    private qz() {
    }

    public static final void a(String str) {
        try {
            qy qyVar = new qy(str);
            if (!qyVar.a()) {
                return;
            }
            qt.a(qyVar.a, qyVar.toString());
        } catch (Exception unused) {
        }
    }

    public static final void a() {
        File[] fileArr;
        if (!ly.p() || qi.h()) {
            return;
        }
        File d = qt.d();
        if (d == null) {
            fileArr = new File[0];
        } else {
            fileArr = d.listFiles(a.a);
            dqc.b(fileArr, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            qy qyVar = new qy(file);
            if (qyVar.a()) {
                arrayList.add(qyVar);
            }
        }
        ArrayList arrayList2 = arrayList;
        b bVar = b.a;
        dqc.d(arrayList2, "$this$sortWith");
        dqc.d(bVar, "comparator");
        if (arrayList2.size() > 1) {
            Collections.sort(arrayList2, bVar);
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        qt.a("error_reports", jSONArray, new c(arrayList));
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qz$a */
    /* loaded from: classes2.dex */
    static final class a implements FilenameFilter {
        public static final a a = new a();

        a() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            dqc.b(str, "name");
            dqi dqiVar = dqi.a;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            return new dsf(format).a(str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qz$c */
    /* loaded from: classes2.dex */
    static final class c implements lz.b {
        final /* synthetic */ ArrayList a;

        c(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // defpackage.lz.b
        public final void a(mc mcVar) {
            JSONObject jSONObject;
            dqc.d(mcVar, "response");
            try {
                if (mcVar.c != null || (jSONObject = mcVar.a) == null || !jSONObject.getBoolean("success")) {
                    return;
                }
                for (qy qyVar : this.a) {
                    qt.b(qyVar.a);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
