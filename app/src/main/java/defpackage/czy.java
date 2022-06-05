package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ucare.we.App;
import com.ucare.we.R;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J \u0010\u0016\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0018\u0010\u001a\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0010H\u0014J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0010R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006'"}, d2 = {"Lcom/ucare/we/injection/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "initInboxToolbar", "title", "", "initToolbar", "closeButton", "", "smallHeader", "initToolbar_addons", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "renderTitleLocale", "collapsingToolbarLayout", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "setLocale", "locale", "Ljava/util/Locale;", "showTransparentBounds", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: czy */
/* loaded from: classes2.dex */
public class czy extends AppCompatActivity {
    @Inject
    public djw v;
    @Inject
    public djb w;

    /* renamed from: lambda$IMw0thda7HDSop0cuXvB-rr_5f0 */
    public static /* synthetic */ void m81lambda$IMw0thda7HDSop0cuXvBrr_5f0(czy czyVar, View view) {
        b(czyVar, view);
    }

    public static /* synthetic */ void lambda$NC6DNCLuLxHEmJ2qRn7W0Ock9rY(czy czyVar, View view) {
        a(czyVar, view);
    }

    public static /* synthetic */ void lambda$dDvJL4VytRdnm9W3SaySrsdMr3s(czy czyVar, View view) {
        c(czyVar, view);
    }

    public final djw n() {
        djw djwVar = this.v;
        if (djwVar != null) {
            return djwVar;
        }
        dqc.a("repository");
        throw null;
    }

    public final djb o() {
        djb djbVar = this.w;
        if (djbVar != null) {
            return djbVar;
        }
        dqc.a("languageSwitcher");
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a(new Locale(n().b("en")));
        super.onCreate(bundle);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
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

    private static void a(Locale locale) {
        dqc.d(locale, "locale");
        Locale.setDefault(locale);
        Resources resources = App.a().getResources();
        Configuration configuration = resources.getConfiguration();
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(locale);
        } else {
            configuration.locale = locale;
        }
        dqc.a("Base ", (Object) locale.getLanguage());
        String language = locale.getLanguage();
        App.a();
        djv.b("LANGUAGE", language);
        App.a().getResources().updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    public final void a(String str, boolean z, boolean z2) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        dqc.b(collapsingToolbarLayout, "collapsingToolbarLayout");
        a(collapsingToolbarLayout);
        collapsingToolbarLayout.setTitle(str);
        setSupportActionBar(toolbar);
        Typeface font = ResourcesCompat.getFont(this, R.font.montserrat_bold);
        collapsingToolbarLayout.setCollapsedTitleTypeface(font);
        collapsingToolbarLayout.setExpandedTitleTypeface(font);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(true);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$czy$NC6DNCLuLxHEmJ2qRn7W0Ock9rY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czy.lambda$NC6DNCLuLxHEmJ2qRn7W0Ock9rY(czy.this, view);
            }
        });
        if (z2) {
            collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBarSmall);
        } else {
            collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        }
        if (z) {
            ImageView imageView = (ImageView) findViewById(R.id.iv_close_expanded);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$czy$IMw0thda7HDSop0cuXvB-rr_5f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czy.m81lambda$IMw0thda7HDSop0cuXvBrr_5f0(czy.this, view);
                }
            });
            ActionBar supportActionBar2 = getSupportActionBar();
            dqc.a(supportActionBar2);
            supportActionBar2.setDisplayHomeAsUpEnabled(false);
            toolbar.setContentInsetsRelative(djr.a(16), djr.a(0));
            return;
        }
        ActionBar supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationIcon(R.drawable.ic_back_arrow_icon);
    }

    public static final void a(czy czyVar, View view) {
        dqc.d(czyVar, "this$0");
        czyVar.finish();
    }

    public static final void b(czy czyVar, View view) {
        dqc.d(czyVar, "this$0");
        czyVar.finish();
    }

    public final void f(String str) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        dqc.b(collapsingToolbarLayout, "collapsingToolbarLayout");
        a(collapsingToolbarLayout);
        collapsingToolbarLayout.setTitle(str);
        setSupportActionBar(toolbar);
        Typeface font = ResourcesCompat.getFont(this, R.font.montserrat_bold);
        collapsingToolbarLayout.setCollapsedTitleTypeface(font);
        collapsingToolbarLayout.setExpandedTitleTypeface(font);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(true);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$czy$dDvJL4VytRdnm9W3SaySrsdMr3s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czy.lambda$dDvJL4VytRdnm9W3SaySrsdMr3s(czy.this, view);
            }
        });
        dqc.a((Object) str);
        if (str.length() > 25) {
            collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.CollapsedAppBarMoreAddons);
        } else {
            collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationIcon(R.drawable.ic_back_arrow_icon);
    }

    public static final void c(czy czyVar, View view) {
        dqc.d(czyVar, "this$0");
        czyVar.finish();
    }

    public final void a(CollapsingToolbarLayout collapsingToolbarLayout) {
        if (o().f()) {
            collapsingToolbarLayout.setCollapsedTitleGravity(5);
            collapsingToolbarLayout.setExpandedTitleGravity(85);
            return;
        }
        collapsingToolbarLayout.setCollapsedTitleGravity(3);
        collapsingToolbarLayout.setExpandedTitleGravity(83);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        a(new Locale(n().b("en")));
    }

    public final void p() {
        int i = Build.VERSION.SDK_INT;
        if (21 <= i && i <= 29) {
            getWindow().setStatusBarColor(0);
            getWindow().clearFlags(67108864);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().getDecorView().setSystemUiVisibility(1280);
        } else if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setStatusBarColor(0);
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            ViewCompat.setOnApplyWindowInsetsListener((ConstraintLayout) findViewById(R.id.root), $$Lambda$czy$LQbh3c43SyG9Q4Oy3UvtShO4e0.INSTANCE);
        }
    }

    public static final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        dqc.b(insets, "windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = insets.left;
        layoutParams2.bottomMargin = insets.bottom;
        layoutParams2.rightMargin = insets.right;
        dmg dmgVar = dmg.a;
        view.setLayoutParams(layoutParams2);
        return WindowInsetsCompat.CONSUMED;
    }
}
