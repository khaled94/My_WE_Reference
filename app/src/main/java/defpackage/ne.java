package defpackage;

import android.app.Activity;
import android.content.Context;
import defpackage.ng;
import defpackage.nh;
import defpackage.pg;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/appevents/aam/MetadataIndexer;", "", "()V", "TAG", "", "enabled", "", "enable", "", "onActivityResumed", "activity", "Landroid/app/Activity;", "updateRules", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ne  reason: default package */
/* loaded from: classes2.dex */
public final class ne {
    public static final ne a = new ne();
    private static final String b = ne.class.getCanonicalName();
    private static boolean c;

    private ne() {
    }

    public static final /* synthetic */ void a(ne neVar) {
        pv a2;
        String str;
        if (qx.a(ne.class)) {
            return;
        }
        try {
            if (qx.a(neVar) || (a2 = pw.a(ly.m(), false)) == null || (str = a2.j) == null) {
                return;
            }
            ng.a aVar = ng.a;
            dqc.d(str, "rulesFromServer");
            try {
                ng.d().clear();
                ng.a.a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            qx.a(th, ne.class);
        }
    }

    public static final /* synthetic */ void b() {
        if (qx.a(ne.class)) {
            return;
        }
        try {
            c = true;
        } catch (Throwable th) {
            qx.a(th, ne.class);
        }
    }

    public static final void a(Activity activity) {
        if (qx.a(ne.class)) {
            return;
        }
        try {
            dqc.d(activity, "activity");
            try {
                if (!c) {
                    return;
                }
                ng.a aVar = ng.a;
                if (ng.a.a().isEmpty()) {
                    return;
                }
                nh.a aVar2 = nh.a;
                dqc.d(activity, "activity");
                int hashCode = activity.hashCode();
                Map a2 = nh.a();
                Integer valueOf = Integer.valueOf(hashCode);
                Object obj = a2.get(valueOf);
                if (obj == null) {
                    obj = new nh(activity, (byte) 0);
                    a2.put(valueOf, obj);
                }
                nh.a((nh) obj);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            qx.a(th, ne.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ne$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static final a a = new a();

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                Context k = ly.k();
                pg.a aVar = pg.e;
                dqc.d(k, "context");
                pg a2 = pg.a.a(k);
                if (a2 != null && a2.c) {
                    return;
                }
                ne.a(ne.a);
                ne neVar = ne.a;
                ne.b();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void a() {
        try {
            if (qx.a(ne.class)) {
                return;
            }
            try {
                ly.a().execute(a.a);
            } catch (Exception e) {
                qi.a(b, e);
            }
        } catch (Throwable th) {
            qx.a(th, ne.class);
        }
    }
}
