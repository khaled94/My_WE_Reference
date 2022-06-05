package com.ucare.we.presentation.profile.myaccount;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.appbar.AppBarLayout;
import com.ucare.we.R;
import com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\u0012\u0010,\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020*H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ucare/we/presentation/profile/myaccount/MyAccountActivity;", "Lcom/ucare/we/injection/BaseActivity;", "()V", "activityLauncher", "Lcom/ucare/we/view/ActivityLauncher;", "getActivityLauncher", "()Lcom/ucare/we/view/ActivityLauncher;", "setActivityLauncher", "(Lcom/ucare/we/view/ActivityLauncher;)V", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "backClickListener", "Landroid/view/View$OnClickListener;", "getBackClickListener", "()Landroid/view/View$OnClickListener;", "setBackClickListener", "(Landroid/view/View$OnClickListener;)V", "btnManageYourNumber", "Landroid/widget/Button;", "imgBackButton", "Landroid/widget/ImageView;", "ivClose", "ivCloseExpanded", "nestedScrollView", "Landroidx/core/widget/NestedScrollView;", "scroll", "", "getScroll", "()I", "setScroll", "(I)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "tvContactNumber", "Landroid/widget/TextView;", "initViews", "", "loadFragment", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setListeners", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MyAccountActivity extends czy {
    @Inject
    public djx a;
    @Inject
    public dio b;
    private View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.myaccount.-$$Lambda$MyAccountActivity$VKnKq2HlhB_AfEchkKbvxrNIYMY
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MyAccountActivity.lambda$VKnKq2HlhB_AfEchkKbvxrNIYMY(MyAccountActivity.this, view);
        }
    };
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private Toolbar g;
    private Button h;
    private TextView i;
    private AppBarLayout j;
    private NestedScrollView k;
    private int l;

    public static /* synthetic */ void lambda$4XYE7QCJtNAbilrsXTmHFvBahLk(MyAccountActivity myAccountActivity, View view) {
        b(myAccountActivity, view);
    }

    public static /* synthetic */ void lambda$VKnKq2HlhB_AfEchkKbvxrNIYMY(MyAccountActivity myAccountActivity, View view) {
        a(myAccountActivity, view);
    }

    public static /* synthetic */ void lambda$YVRtXTiOFEaDWdKRxLVMprx9Lg0(MyAccountActivity myAccountActivity, View view) {
        c(myAccountActivity, view);
    }

    public static /* synthetic */ void lambda$mza5Edt65buSPNCMg_ki10jbRUk(MyAccountActivity myAccountActivity, AppBarLayout appBarLayout, int i) {
        a(myAccountActivity, appBarLayout, i);
    }

    public static /* synthetic */ void lambda$oHkS0Knk62EyJAYYyRi_kmhNE1Y(MyAccountActivity myAccountActivity, View view) {
        d(myAccountActivity, view);
    }

    public static final void a(MyAccountActivity myAccountActivity, View view) {
        dqc.d(myAccountActivity, "this$0");
        myAccountActivity.finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_account);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.g = toolbar;
        setSupportActionBar(toolbar);
        this.d = (ImageView) findViewById(R.id.ivMoreClose);
        this.h = (Button) findViewById(R.id.btnManageYourNumber);
        this.i = (TextView) findViewById(R.id.tvContactNumber);
        this.j = (AppBarLayout) findViewById(R.id.app_bar);
        this.k = (NestedScrollView) findViewById(R.id.nestedscrolllayout);
        Button button = this.h;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.myaccount.-$$Lambda$MyAccountActivity$4XYE7QCJtNAbilrsXTmHFvBahLk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyAccountActivity.lambda$4XYE7QCJtNAbilrsXTmHFvBahLk(MyAccountActivity.this, view);
                }
            });
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(n().m());
        }
        this.e = (ImageView) findViewById(R.id.iv_close);
        this.f = (ImageView) findViewById(R.id.iv_close_expanded);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.myaccount.-$$Lambda$MyAccountActivity$YVRtXTiOFEaDWdKRxLVMprx9Lg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyAccountActivity.lambda$YVRtXTiOFEaDWdKRxLVMprx9Lg0(MyAccountActivity.this, view);
                }
            });
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.myaccount.-$$Lambda$MyAccountActivity$oHkS0Knk62EyJAYYyRi_kmhNE1Y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyAccountActivity.lambda$oHkS0Knk62EyJAYYyRi_kmhNE1Y(MyAccountActivity.this, view);
                }
            });
        }
        AppBarLayout appBarLayout = this.j;
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.ucare.we.presentation.profile.myaccount.-$$Lambda$MyAccountActivity$mza5Edt65buSPNCMg_ki10jbRUk
                @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                public final void onOffsetChanged(AppBarLayout appBarLayout2, int i) {
                    MyAccountActivity.lambda$mza5Edt65buSPNCMg_ki10jbRUk(MyAccountActivity.this, appBarLayout2, i);
                }
            });
        }
        dio dioVar = this.b;
        if (dioVar != null) {
            Fragment a = dioVar.e() ? dgm.a() : dgq.a();
            dqc.b(a, "newInstance()");
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            dqc.b(supportFragmentManager, "supportFragmentManager");
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            dqc.b(beginTransaction, "fragmentManager.beginTransaction()");
            beginTransaction.replace(R.id.lnrLayoutContainer, a).commit();
            return;
        }
        dqc.a("authenticationProvider");
        throw null;
    }

    public static final void c(MyAccountActivity myAccountActivity, View view) {
        dqc.d(myAccountActivity, "this$0");
        myAccountActivity.finish();
    }

    public static final void d(MyAccountActivity myAccountActivity, View view) {
        dqc.d(myAccountActivity, "this$0");
        myAccountActivity.finish();
    }

    public static final void a(MyAccountActivity myAccountActivity, AppBarLayout appBarLayout, int i) {
        NestedScrollView nestedScrollView;
        dqc.d(myAccountActivity, "this$0");
        if (i / appBarLayout.getTotalScrollRange() > 0.9d && appBarLayout != null) {
            appBarLayout.setVisibility(8);
        }
        if (Math.abs(i) - appBarLayout.getTotalScrollRange() == 0) {
            Toolbar toolbar = myAccountActivity.g;
            if (toolbar != null) {
                toolbar.setVisibility(0);
            }
            int i2 = myAccountActivity.l + 1;
            myAccountActivity.l = i2;
            if (i2 != 1 || (nestedScrollView = myAccountActivity.k) == null) {
                return;
            }
            djt.a(nestedScrollView, Float.valueOf(60.0f));
        } else if (i == 0) {
            Toolbar toolbar2 = myAccountActivity.g;
            if (toolbar2 != null) {
                toolbar2.setVisibility(8);
            }
            NestedScrollView nestedScrollView2 = myAccountActivity.k;
            if (nestedScrollView2 == null) {
                return;
            }
            djt.a(nestedScrollView2, Float.valueOf(1.0f));
        } else {
            Toolbar toolbar3 = myAccountActivity.g;
            if (toolbar3 != null) {
                toolbar3.setVisibility(8);
            }
            NestedScrollView nestedScrollView3 = myAccountActivity.k;
            if (nestedScrollView3 == null) {
                return;
            }
            djt.a(nestedScrollView3, Float.valueOf(1.0f));
        }
    }

    public static final void b(MyAccountActivity myAccountActivity, View view) {
        dqc.d(myAccountActivity, "this$0");
        djx djxVar = myAccountActivity.a;
        if (djxVar == null) {
            dqc.a("activityLauncher");
            throw null;
        } else {
            djxVar.b(myAccountActivity, SwitchAccountPostPaidActivity.class);
        }
    }
}
