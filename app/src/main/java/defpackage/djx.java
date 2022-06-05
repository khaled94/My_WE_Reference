package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: djx  reason: default package */
/* loaded from: classes2.dex */
public final class djx extends czz implements dhk {
    public static int a = 102;
    public static int b = 105;
    @Inject
    dio c;
    private Activity d;

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    public final void a(int i, Activity activity, Class<?> cls) {
        if (activity == null) {
            return;
        }
        this.d = activity;
        Intent intent = new Intent(activity, cls);
        intent.putExtra("mode", i);
        activity.startActivity(intent);
    }

    public final void a(Activity activity, Class<?> cls) {
        if (activity == null) {
            return;
        }
        this.d = activity;
        Intent intent = new Intent(activity, cls);
        intent.putExtra("subscribe", true);
        activity.startActivity(intent);
    }

    public final void a(Activity activity, String str, int i, Class<?> cls) {
        if (activity == null) {
            return;
        }
        this.d = activity;
        Intent intent = new Intent(activity, cls);
        intent.putExtra("errorMessage", str);
        intent.putExtra("tokenExpired", i);
        activity.startActivity(intent);
    }

    public final void a(MainPlanResponseBody mainPlanResponseBody, Activity activity, Class<?> cls) {
        if (activity == null) {
            return;
        }
        this.d = activity;
        Intent intent = new Intent(activity, cls);
        intent.putExtra("mainPlan", mainPlanResponseBody);
        activity.startActivity(intent);
    }

    public final void a(String str, Activity activity, Class<?> cls) {
        if (activity == null) {
            return;
        }
        this.d = activity;
        Intent intent = new Intent(activity, cls);
        intent.putExtra("targetNumber", str);
        activity.startActivity(intent);
    }

    public final void a(String str, Activity activity, Class<?> cls, String str2) {
        this.d = activity;
        Intent intent = new Intent(activity, cls);
        intent.putExtra("targetNumber", str);
        intent.putExtra("amount", str2);
        activity.startActivity(intent);
    }

    public final void b(Activity activity, Class<?> cls) {
        if (activity == null) {
            return;
        }
        this.d = activity;
        activity.startActivity(new Intent(activity, cls));
    }

    public static void a(Activity activity, Class<?> cls, String str) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, cls);
        intent.putExtra("balance", str);
        activity.startActivity(intent);
    }

    public static void a(Activity activity, String str, Class<?> cls, String str2) {
        Intent intent = new Intent(activity, cls);
        intent.putExtra("successMessageDetails", str);
        intent.putExtra("successMessage", str2);
        intent.putExtra("refresh", true);
        activity.startActivity(intent);
    }

    public static void b(Activity activity, String str, Class<?> cls, String str2) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, cls);
        intent.putExtra("successMessageDetails", str);
        intent.putExtra("successMessage", str2);
        activity.startActivity(intent);
    }

    public static void a(Activity activity, Class<?> cls, String str, String str2, String str3) {
        Intent intent = new Intent(activity, cls);
        intent.putExtra("amount", str);
        intent.putExtra("targetNumber", str2);
        intent.putExtra("maskedNumber", str3);
        activity.startActivity(intent);
    }

    public static void a(Activity activity, Class<?> cls, ArrayList<AssociatedNumberResponseBody> arrayList) {
        Intent intent = new Intent(activity, cls);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("associatedNumbers", arrayList);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        Activity activity;
        if (i == 1 && (activity = this.d) != null) {
            activity.finish();
        }
    }
}
