package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.ucare.we.App;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: djb  reason: default package */
/* loaded from: classes2.dex */
public final class djb extends czz {
    @Inject
    Context a;
    @Inject
    public Locale b;
    @Inject
    public djw c;

    public final void a() {
        String b = this.c.b(this.b.getLanguage());
        if (b == null || g().equals(b)) {
            return;
        }
        a(App.a(), b);
    }

    public final void c() {
        this.c.c("ar");
        a(this.a, "ar");
    }

    public final void d() {
        this.c.c("en");
        a(this.a, "en");
    }

    public final boolean e() {
        return g().equals("ar");
    }

    public final boolean f() {
        return g().equals("ar");
    }

    public final String g() {
        Configuration configuration = this.a.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            return configuration.getLocales().get(0).getLanguage();
        }
        return configuration.locale.getLanguage();
    }

    public static void a(Context context, String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public final void b() {
        if (this.c.k().equals("ar")) {
            this.c.c("en");
            a(this.a, "en");
            return;
        }
        this.c.c("ar");
        a(this.a, "ar");
    }
}
