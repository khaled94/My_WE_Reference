package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.R;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: vt  reason: default package */
/* loaded from: classes2.dex */
public final class vt {
    private static final Object a = new Object();
    private static vt b;
    private final String c;
    private final Status d;
    private final boolean e;
    private final boolean f;

    private vt(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", TypedValues.Custom.S_INT, resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z2 = integer == 0;
            z = integer == 0 ? false : z;
            this.f = z2;
        } else {
            this.f = false;
        }
        this.e = z;
        String b2 = acm.b(context);
        b2 = b2 == null ? new aaw(context).a("google_app_id") : b2;
        if (TextUtils.isEmpty(b2)) {
            this.d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.c = null;
            return;
        }
        this.c = b2;
        this.d = Status.a;
    }

    public static Status a(Context context) {
        Status status;
        aat.a(context, "Context must not be null.");
        synchronized (a) {
            if (b == null) {
                b = new vt(context);
            }
            status = b.d;
        }
        return status;
    }

    public static String a() {
        return a("getGoogleAppId").c;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").f;
    }

    private static vt a(String str) {
        vt vtVar;
        synchronized (a) {
            vtVar = b;
            if (vtVar == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return vtVar;
    }
}
