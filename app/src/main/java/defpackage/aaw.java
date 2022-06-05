package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.R;

/* renamed from: aaw  reason: default package */
/* loaded from: classes.dex */
public final class aaw {
    private final Resources a;
    private final String b;

    public aaw(Context context) {
        aat.a(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public final String a(String str) {
        int identifier = this.a.getIdentifier(str, TypedValues.Custom.S_STRING, this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
