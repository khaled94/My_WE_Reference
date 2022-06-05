package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ucare.we.R;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\r"}, d2 = {"Lcom/ucare/we/injection/TransparentActivity;", "Lcom/ucare/we/injection/BaseActivity;", "()V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "initToolbar", "title", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dae */
/* loaded from: classes2.dex */
public class dae extends czy {
    public static /* synthetic */ void lambda$N9j2kUhxMYGp9tD__ZfdUIshxEA(dae daeVar, View view) {
        a(daeVar, view);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 26) {
            setRequestedOrientation(1);
        }
    }

    @Override // defpackage.czy, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        dqc.d(context, "newBase");
        dad.a().a.inject(this);
        if (Build.VERSION.SDK_INT >= 26) {
            Configuration configuration = context.getResources().getConfiguration();
            Locale locale = new Locale(o().g());
            Locale.setDefault(locale);
            configuration.setLocale(locale);
            context = context.createConfigurationContext(configuration);
            dqc.b(context, "newBase.createConfigurationContext(config)");
        }
        super.attachBaseContext(context);
    }

    public final void a(String str) {
        dqc.d(str, "title");
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        collapsingToolbarLayout.setTitle(str);
        toolbar.setNavigationIcon(R.drawable.ic_back_arrow_icon);
        setSupportActionBar(toolbar);
        Typeface font = ResourcesCompat.getFont(this, R.font.montserrat_bold);
        collapsingToolbarLayout.setCollapsedTitleTypeface(font);
        collapsingToolbarLayout.setExpandedTitleTypeface(font);
        ActionBar supportActionBar = getSupportActionBar();
        dqc.a(supportActionBar);
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        ActionBar supportActionBar2 = getSupportActionBar();
        dqc.a(supportActionBar2);
        supportActionBar2.setDisplayShowTitleEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dae$N9j2kUhxMYGp9tD__ZfdUIshxEA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dae.lambda$N9j2kUhxMYGp9tD__ZfdUIshxEA(dae.this, view);
            }
        });
        ((AppBarLayout) findViewById(R.id.app_bar)).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) $$Lambda$dae$sv5hcGK4krlGB8BbFRnCPWZzA0.INSTANCE);
    }

    public static final void a(dae daeVar, View view) {
        dqc.d(daeVar, "this$0");
        daeVar.finish();
    }

    public static final void a(AppBarLayout appBarLayout, int i) {
        Math.abs(i);
        appBarLayout.getTotalScrollRange();
    }
}
