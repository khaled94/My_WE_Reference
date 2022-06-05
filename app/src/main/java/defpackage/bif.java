package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* renamed from: bif  reason: default package */
/* loaded from: classes2.dex */
public class bif {
    protected final Intent a;

    public bif(String str) {
        Intent intent = new Intent(str);
        this.a = intent;
        intent.setPackage("com.google.android.gms");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Intent a(Activity activity) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Resources.Theme theme = activity.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        if (theme.resolveAttribute(16843827, typedValue, true) && !this.a.hasExtra("primary_color")) {
            this.a.putExtra("primary_color", typedValue.data);
        }
        if (theme.resolveAttribute(16843828, typedValue2, true) && !this.a.hasExtra("primary_color_dark")) {
            this.a.putExtra("primary_color_dark", typedValue2.data);
        }
        ux.a();
        ux.e(activity);
        return this.a;
    }
}
