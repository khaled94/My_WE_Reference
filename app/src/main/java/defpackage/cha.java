package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: cha  reason: default package */
/* loaded from: classes2.dex */
public class cha implements cgz {
    private static volatile cgz b;
    final Map<String, Object> a = new ConcurrentHashMap();
    private final AppMeasurement c;

    private cha(AppMeasurement appMeasurement) {
        aat.a(appMeasurement);
        this.c = appMeasurement;
    }

    public static cgz a(cgw cgwVar, Context context, cmt cmtVar) {
        aat.a(cgwVar);
        aat.a(context);
        aat.a(cmtVar);
        aat.a(context.getApplicationContext());
        if (b == null) {
            synchronized (cha.class) {
                if (b == null) {
                    Bundle bundle = new Bundle(1);
                    if (cgwVar.f()) {
                        cmtVar.a(cgv.class, che.a, chd.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cgwVar.e());
                    }
                    b = new cha(AppMeasurement.a(context, bundle));
                }
            }
        }
        return b;
    }

    @Override // defpackage.cgz
    public final void a(String str, String str2, Bundle bundle) {
        if (chc.a(str) && chc.a(str2, bundle) && chc.a(str, str2, bundle)) {
            this.c.logEventInternal(str, str2, bundle);
        }
    }

    @Override // defpackage.cgz
    public final void a(String str, String str2, Object obj) {
        if (chc.a(str) && chc.a(str, str2)) {
            AppMeasurement appMeasurement = this.c;
            aat.a(str);
            if (appMeasurement.c) {
                appMeasurement.b.a(str, str2, obj);
            } else {
                appMeasurement.a.d().a(str, str2, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void a(cmq cmqVar) {
        boolean z = ((cgv) cmqVar.b).a;
        synchronized (cha.class) {
            AppMeasurement appMeasurement = ((cha) b).c;
            if (appMeasurement.c) {
                appMeasurement.b.a(z);
            } else {
                appMeasurement.a.d().b(z);
            }
        }
    }
}
