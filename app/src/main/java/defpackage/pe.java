package defpackage;

import android.os.Bundle;
import android.view.View;
import defpackage.lz;
import defpackage.oq;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J \u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewOnClickListener;", "Landroid/view/View$OnClickListener;", "hostView", "Landroid/view/View;", "rootView", "activityName", "", "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", "baseListener", "hostViewWeakReference", "Ljava/lang/ref/WeakReference;", "rootViewWeakReference", "onClick", "", "view", "predictAndProcess", "pathID", "buttonText", "viewData", "Lorg/json/JSONObject;", "process", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pe  reason: default package */
/* loaded from: classes2.dex */
public final class pe implements View.OnClickListener {
    public static final a a = new a((byte) 0);
    private static final Set<Integer> f = new HashSet();
    private final View.OnClickListener b;
    private final WeakReference<View> c;
    private final WeakReference<View> d;
    private final String e;

    public /* synthetic */ pe(View view, View view2, String str, byte b2) {
        this(view, view2, str);
    }

    public static final /* synthetic */ String a(pe peVar) {
        if (qx.a(pe.class)) {
            return null;
        }
        try {
            return peVar.e;
        } catch (Throwable th) {
            qx.a(th, pe.class);
            return null;
        }
    }

    public static final /* synthetic */ Set a() {
        if (qx.a(pe.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            qx.a(th, pe.class);
            return null;
        }
    }

    private pe(View view, View view2, String str) {
        String a2;
        this.b = nt.g(view);
        this.c = new WeakReference<>(view2);
        this.d = new WeakReference<>(view);
        if (str != null) {
            String lowerCase = str.toLowerCase();
            dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            a2 = dsg.a(lowerCase, "activity", "");
            this.e = a2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (qx.a(this)) {
            return;
        }
        try {
            dqc.d(view, "view");
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            if (qx.a(this)) {
                return;
            }
            View view2 = this.c.get();
            View view3 = this.d.get();
            if (view2 != null && view3 != null) {
                try {
                    String b2 = pb.b(view3);
                    String a2 = pa.a(view3, b2);
                    if (a2 == null) {
                        return;
                    }
                    String a3 = pa.a(a2);
                    boolean z = true;
                    if (a3 == null) {
                        z = false;
                    } else if (!dqc.a((Object) a3, (Object) "other")) {
                        qi.a(new a.RunnableC0045a(a3, b2));
                    }
                    if (z) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", pb.a(view2, view3));
                    jSONObject.put("screenname", this.e);
                    if (qx.a(this)) {
                        return;
                    }
                    try {
                        qi.a(new b(jSONObject, b2, a2));
                    } catch (Throwable th) {
                        qx.a(th, this);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            qx.a(th2, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pe$b */
    /* loaded from: classes2.dex */
    static final class b implements Runnable {
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        b(JSONObject jSONObject, String str, String str2) {
            this.b = jSONObject;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] a;
            if (qx.a(this)) {
                return;
            }
            try {
                String f = qi.f(ly.k());
                if (f == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = f.toLowerCase();
                dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
                float[] a2 = oz.a(this.b, lowerCase);
                String a3 = oz.a(this.c, pe.a(pe.this), lowerCase);
                if (a2 == null || (a = oq.a(oq.a.MTML_APP_EVENT_PREDICTION, new float[][]{a2}, new String[]{a3})) == null) {
                    return;
                }
                String str = a[0];
                pa.a(this.d, str);
                if (!(!dqc.a((Object) str, (Object) "other"))) {
                    return;
                }
                a aVar = pe.a;
                a.a(str, this.c, a2);
            } catch (Exception unused) {
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u000fJ \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewOnClickListener$Companion;", "", "()V", "API_ENDPOINT", "", "OTHER_EVENT", "viewsAttachedListener", "", "", "attachListener", "", "hostView", "Landroid/view/View;", "rootView", "activityName", "attachListener$facebook_core_release", "processPredictedResult", "predictedEvent", "buttonText", "dense", "", "queryHistoryAndProcess", "", "pathID", "sendPredictedResult", "eventToPost", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pe$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
        /* renamed from: pe$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class RunnableC0045a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            RunnableC0045a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (qx.a(this)) {
                    return;
                }
                try {
                    a aVar = pe.a;
                    a.a(this.a, this.b, new float[0]);
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        }

        private static void b(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : fArr) {
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                lz.c cVar = lz.k;
                dqi dqiVar = dqi.a;
                String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{ly.m()}, 1));
                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                lz a = lz.c.a((lk) null, format, (JSONObject) null, (lz.b) null);
                a.a(bundle);
                lz.k.a(a);
            } catch (JSONException unused) {
            }
        }

        public static final /* synthetic */ void a(String str, String str2, float[] fArr) {
            if (!pc.a(str)) {
                if (!pc.b(str)) {
                    return;
                }
                b(str, str2, fArr);
                return;
            }
            mv mvVar = new na(ly.k()).a;
            if (qx.a(mvVar)) {
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                mvVar.a(str, bundle);
            } catch (Throwable th) {
                qx.a(th, mvVar);
            }
        }
    }
}
