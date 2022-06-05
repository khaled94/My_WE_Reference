package com.ucare.we;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.os.EnvironmentCompat;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.gson.Gson;
import com.ucare.we.SplashActivity;
import com.ucare.we.model.ConfigurationResponseBody;
import com.ucare.we.model.SignInModel.SignInResponse;
import com.ucare.we.model.remote.UpdateConfiguration;
import com.ucare.we.newHome.features.HomeActivity;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import defpackage.w;
import java.io.File;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0085\u0001B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010W\u001a\u00020XH\u0002J\u0010\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020XH\u0002J\u0010\u0010]\u001a\u00020X2\u0006\u0010^\u001a\u00020_H\u0002J\b\u0010`\u001a\u00020XH\u0016J\u0010\u0010a\u001a\u00020X2\u0006\u0010b\u001a\u00020cH\u0016J \u0010d\u001a\u00020X2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020iH\u0016J\u0010\u0010j\u001a\u00020X2\u0006\u0010e\u001a\u00020fH\u0016J\u0018\u0010j\u001a\u00020X2\u0006\u0010e\u001a\u00020f2\u0006\u0010k\u001a\u00020\tH\u0016J\u0012\u0010l\u001a\u00020X2\b\u0010m\u001a\u0004\u0018\u00010iH\u0016J\u0010\u0010n\u001a\u00020X2\u0006\u0010o\u001a\u00020pH\u0016J\u0012\u0010q\u001a\u00020X2\b\u0010r\u001a\u0004\u0018\u00010sH\u0014J\u001a\u0010t\u001a\u00020X2\b\u0010u\u001a\u0004\u0018\u00010i2\u0006\u0010v\u001a\u00020fH\u0016J\b\u0010w\u001a\u00020XH\u0014J\u0012\u0010x\u001a\u00020X2\b\u0010m\u001a\u0004\u0018\u00010iH\u0016J\u0012\u0010y\u001a\u00020X2\b\u0010o\u001a\u0004\u0018\u00010zH\u0016J\u0010\u0010{\u001a\u00020X2\u0006\u0010o\u001a\u00020pH\u0002J\b\u0010|\u001a\u00020XH\u0002J\u0010\u0010}\u001a\u00020X2\u0006\u0010~\u001a\u00020\tH\u0016J\u0010\u0010\u007f\u001a\u00020X2\u0006\u0010v\u001a\u00020fH\u0016J\t\u0010\u0080\u0001\u001a\u00020XH\u0002J\t\u0010\u0081\u0001\u001a\u00020XH\u0002J\t\u0010\u0082\u0001\u001a\u00020XH\u0002J\t\u0010\u0083\u0001\u001a\u00020XH\u0002J\t\u0010\u0084\u0001\u001a\u00020XH\u0002R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082.¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u000b\"\u0004\bJ\u0010\rR\u000e\u0010K\u001a\u00020LX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020LX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020LX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020LX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010P\u001a\u0004\u0018\u00010QX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u000e\u0010V\u001a\u000203X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0086\u0001"}, d2 = {"Lcom/ucare/we/SplashActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Lcom/ucare/we/provider/AuthenticationListener;", "Lcom/ucare/we/presentation/auth/signin/SignInView;", "Lcom/ucare/we/provider/ConfigurationsListener;", "Lcom/ucare/we/provider/UpdateConfigurationListener;", "Lcom/ucare/we/util/onSessionExpired;", "()V", "aBoolean", "", "getABoolean", "()Z", "setABoolean", "(Z)V", "activityLauncher", "Lcom/ucare/we/view/ActivityLauncher;", "getActivityLauncher", "()Lcom/ucare/we/view/ActivityLauncher;", "setActivityLauncher", "(Lcom/ucare/we/view/ActivityLauncher;)V", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "cTimer", "Landroid/os/CountDownTimer;", "getCTimer", "()Landroid/os/CountDownTimer;", "setCTimer", "(Landroid/os/CountDownTimer;)V", "configurationProvider", "Lcom/ucare/we/provider/ConfigurationProvider;", "getConfigurationProvider", "()Lcom/ucare/we/provider/ConfigurationProvider;", "setConfigurationProvider", "(Lcom/ucare/we/provider/ConfigurationProvider;)V", "corporatePermissionProvider", "Lcom/ucare/we/provider/CorporatePermissionProvider;", "getCorporatePermissionProvider", "()Lcom/ucare/we/provider/CorporatePermissionProvider;", "setCorporatePermissionProvider", "(Lcom/ucare/we/provider/CorporatePermissionProvider;)V", "frmBackGround", "Landroid/view/ViewGroup;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "logo", "Landroid/widget/ImageView;", "notificationPresenter", "Lcom/ucare/we/firebasenotification/NotificationPresenter;", "getNotificationPresenter", "()Lcom/ucare/we/firebasenotification/NotificationPresenter;", "setNotificationPresenter", "(Lcom/ucare/we/firebasenotification/NotificationPresenter;)V", "permissionProvider", "Lcom/ucare/we/presentation/paybillnumbertype/PermissionProvider;", "getPermissionProvider", "()Lcom/ucare/we/presentation/paybillnumbertype/PermissionProvider;", "setPermissionProvider", "(Lcom/ucare/we/presentation/paybillnumbertype/PermissionProvider;)V", "positiveButtonCallback", "Lcom/afollestad/materialdialogs/MaterialDialog$SingleButtonCallback;", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "retryToCheckVersionTimerBoolean", "getRetryToCheckVersionTimerBoolean", "setRetryToCheckVersionTimerBoolean", "scaleFitLogo", "Landroid/animation/Animator$AnimatorListener;", "scaleIOutLogo", "scaleInLogo", "showSlogan", "signInPresenter", "Lcom/ucare/we/presentation/auth/signin/SignInPresenter;", "getSignInPresenter", "()Lcom/ucare/we/presentation/auth/signin/SignInPresenter;", "setSignInPresenter", "(Lcom/ucare/we/presentation/auth/signin/SignInPresenter;)V", "slogan", "cancelTimer", "", "centralizingLogo", "view", "Landroid/view/View;", "getStarted", "hideSystemUIAndNavigation", "activity", "Landroid/app/Activity;", "loginFailed", "loginSuccess", "signInResponse", "Lcom/ucare/we/model/SignInModel/SignInResponse;", "onAuthenticationFailure", "authenticationType", "", "failureReason", "failureMessage", "", "onAuthenticationSuccess", "showBonus", "onConfigurationFailure", "errrorMessage", "onConfigurationSuccess", "configuration", "Lcom/ucare/we/model/ConfigurationResponseBody;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginResponse", "jsonResponse", "which", "onStop", "onUpdateConfigurationFailure", "onUpdateConfigurationSuccess", "Lcom/ucare/we/model/remote/UpdateConfiguration;", "setFeatureConfigurationFlag", "showFailedToGetUpdateDialog", "showProgress", "show", "startLogin", "startScaleFit", "startScaleIn", "startScaleOut", "startShowSlogan", "startTimer", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SplashActivity extends czy implements ddh, dhk, dho, dik, dju {
    public static final a a = new a((byte) 0);
    @Inject
    public dio c;
    @Inject
    public djg d;
    @Inject
    public djx e;
    @Inject
    public dhn f;
    @Inject
    public dhp g;
    @Inject
    public dgc h;
    ddg i;
    private CountDownTimer k;
    private ImageView m;
    private ImageView n;
    private ViewGroup o;
    boolean b = true;
    private boolean j = true;
    private final Handler l = new Handler(Looper.getMainLooper());
    private final Animator.AnimatorListener p = new e();
    private final Animator.AnimatorListener q = new b();
    private final Animator.AnimatorListener r = new c();
    private final Animator.AnimatorListener s = new d();
    private w.i t = new w.i() { // from class: com.ucare.we.-$$Lambda$SplashActivity$j-bnUDyoL0RbaoUeJl6xF7dIJOE
        @Override // defpackage.w.i
        public final void onClick(w wVar, s sVar) {
            SplashActivity.m7lambda$jbnUDyoL0RbaoUeJl6xF7dIJOE(SplashActivity.this, wVar, sVar);
        }
    };

    public static /* synthetic */ void lambda$Mddl36IvTHj_TSZif_wdIkgY4JM(SplashActivity splashActivity) {
        e(splashActivity);
    }

    public static /* synthetic */ void lambda$Wj6na_KJnR4TUkwogJW4krsD6FU(SplashActivity splashActivity) {
        f(splashActivity);
    }

    /* renamed from: lambda$j-bnUDyoL0RbaoUeJl6xF7dIJOE */
    public static /* synthetic */ void m7lambda$jbnUDyoL0RbaoUeJl6xF7dIJOE(SplashActivity splashActivity, w wVar, s sVar) {
        a(splashActivity, wVar, sVar);
    }

    public static /* synthetic */ void lambda$syvsCbHdxSfNUjXn3f7QgmxoXAI(SplashActivity splashActivity) {
        g(splashActivity);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    @Override // defpackage.dju
    public final void b(int i) {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ucare/we/SplashActivity$Companion;", "", "()V", "PERMISSION_REQUEST_PHONE_STATE", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    public final dio b() {
        dio dioVar = this.c;
        if (dioVar != null) {
            return dioVar;
        }
        dqc.a("authenticationProvider");
        throw null;
    }

    private djg f() {
        djg djgVar = this.d;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    private djx g() {
        djx djxVar = this.e;
        if (djxVar != null) {
            return djxVar;
        }
        dqc.a("activityLauncher");
        throw null;
    }

    public final dhn c() {
        dhn dhnVar = this.f;
        if (dhnVar != null) {
            return dhnVar;
        }
        dqc.a("configurationProvider");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ucare/we/SplashActivity$showSlogan$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements Animator.AnimatorListener {
        /* renamed from: lambda$tJmpsz-UoliRwBJAQ2CnAFe1lk0 */
        public static /* synthetic */ void m8lambda$tJmpszUoliRwBJAQ2CnAFe1lk0(SplashActivity splashActivity) {
            a(splashActivity);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            dqc.d(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            dqc.d(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            dqc.d(animator, "animator");
        }

        e() {
            SplashActivity.this = r1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            dqc.d(animator, "animator");
            Handler handler = new Handler(Looper.getMainLooper());
            final SplashActivity splashActivity = SplashActivity.this;
            handler.post(new Runnable() { // from class: com.ucare.we.-$$Lambda$SplashActivity$e$tJmpsz-UoliRwBJAQ2CnAFe1lk0
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.e.m8lambda$tJmpszUoliRwBJAQ2CnAFe1lk0(SplashActivity.this);
                }
            });
        }

        public static final void a(SplashActivity splashActivity) {
            boolean z;
            dqc.d(splashActivity, "this$0");
            SplashActivity splashActivity2 = splashActivity;
            String str = Build.TAGS;
            boolean z2 = false;
            boolean z3 = str != null && str.contains("test-keys");
            boolean a = dji.a();
            boolean a2 = dji.a("eu.chainfire.supersu", splashActivity2);
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            int i = 0;
            while (true) {
                if (i >= 8) {
                    z = false;
                    break;
                }
                String str2 = strArr[i];
                if (new File(str2 + "su").exists()) {
                    z = true;
                    break;
                }
                i++;
            }
            boolean z4 = z || dji.a(new String[]{"/system/xbin/which", "su"}) || dji.a(new String[]{"which", "su"});
            StringBuilder sb = new StringBuilder("isTestBuild: ");
            sb.append(z3);
            sb.append(" hasSuperuserAPK: ");
            sb.append(a);
            sb.append(" hasChainfiresupersu: ");
            sb.append(a2);
            sb.append(" hasSU: ");
            sb.append(z4);
            boolean z5 = z3 || a || a2 || z4;
            if ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith(EnvironmentCompat.MEDIA_UNKNOWN) || Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu") || Build.HARDWARE.equals("vbox86") || Build.HARDWARE.toLowerCase().contains("nox") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MODEL.toLowerCase().contains("droid4x") || Build.MANUFACTURER.contains("Genymotion") || Build.PRODUCT.contains("sdk_google") || Build.PRODUCT.contains("google_sdk") || Build.PRODUCT.contains("sdk") || Build.PRODUCT.contains("sdk_x86") || Build.PRODUCT.contains("vbox86p") || Build.PRODUCT.contains("emulator") || Build.PRODUCT.contains("simulator") || Build.PRODUCT.toLowerCase().contains("nox") || Build.BOARD.toLowerCase().contains("nox") || Build.BOOTLOADER.toLowerCase().contains("nox") || Build.SERIAL.toLowerCase().contains("nox")) {
                z2 = true;
            }
            if (!z2) {
                if (!(!z5)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                splashActivity.b().a((dhk) splashActivity);
                splashActivity.i = new ddg(splashActivity2, splashActivity);
                splashActivity.c().h = splashActivity;
                splashActivity.c().j = splashActivity;
                splashActivity.b().b();
                SplashActivity.a(splashActivity);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/ucare/we/SplashActivity$scaleFitLogo$1", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "onAnimationUpdate", "Landroid/animation/ValueAnimator;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        }

        b() {
            SplashActivity.this = r1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SplashActivity.b(SplashActivity.this);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/ucare/we/SplashActivity$scaleIOutLogo$1", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "onAnimationUpdate", "Landroid/animation/ValueAnimator;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        }

        c() {
            SplashActivity.this = r1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SplashActivity.c(SplashActivity.this);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/ucare/we/SplashActivity$scaleInLogo$1", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "onAnimationUpdate", "Landroid/animation/ValueAnimator;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        }

        d() {
            SplashActivity.this = r1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SplashActivity.d(SplashActivity.this);
        }
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        setTheme(R.style.AppTheme);
        setContentView(getLayoutInflater().inflate(R.layout.activity_splash, (ViewGroup) null, false));
        n().m(false);
        View findViewById = findViewById(R.id.frmBackGround);
        dqc.b(findViewById, "findViewById(R.id.frmBackGround)");
        this.o = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.logo);
        dqc.b(findViewById2, "findViewById(R.id.logo)");
        this.m = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.slogan);
        dqc.b(findViewById3, "findViewById(R.id.slogan)");
        this.n = (ImageView) findViewById3;
        ImageView imageView = this.m;
        if (imageView == null) {
            dqc.a("logo");
            throw null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.SCALE_X, 0.8f);
        ofFloat.setDuration(300L);
        ImageView imageView2 = this.m;
        if (imageView2 == null) {
            dqc.a("logo");
            throw null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, View.SCALE_Y, 0.8f);
        ofFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(this.s);
        animatorSet.start();
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (i == 0) {
            if (c().f != null) {
                return;
            }
            c().a();
            dgc dgcVar = this.h;
            if (dgcVar != null) {
                dgcVar.b();
                dhp dhpVar = this.g;
                if (dhpVar != null) {
                    dhpVar.a();
                    return;
                } else {
                    dqc.a("corporatePermissionProvider");
                    throw null;
                }
            }
            dqc.a("permissionProvider");
            throw null;
        } else if (i != 1) {
        } else {
            if (!b().l()) {
                if (b().d()) {
                    if (!b().f() || !b().h()) {
                        if (!b().f() || b().h()) {
                            if (!b().g() || !b().h()) {
                                if (!b().g() || b().h()) {
                                    return;
                                }
                                g().b(this, HomeActivity.class);
                                setResult(-1);
                                return;
                            }
                            g().b(this, HomeActivity.class);
                            setResult(-1);
                            return;
                        }
                        g().b(this, HomeActivity.class);
                        setResult(-1);
                        return;
                    }
                    g().b(this, HomeActivity.class);
                    setResult(-1);
                    return;
                } else if (!b().e()) {
                    return;
                } else {
                    if (!b().f() || !b().h()) {
                        if (!b().f() || b().h()) {
                            if (!b().g() || !b().h()) {
                                if (!b().g() || b().h()) {
                                    return;
                                }
                                g().b(this, HomeActivity.class);
                                setResult(-1);
                                finish();
                                return;
                            }
                            g().b(this, HomeActivity.class);
                            setResult(-1);
                            finish();
                            return;
                        }
                        g().b(this, HomeActivity.class);
                        setResult(-1);
                        finish();
                        return;
                    }
                    g().b(this, HomeActivity.class);
                    setResult(-1);
                    finish();
                    return;
                }
            }
            g().b(this, HomeActivity.class);
            setResult(-1);
            finish();
        }
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        Intent intent;
        dqc.d(str, "failureMessage");
        if (i != 0) {
            if (i != 1 || !this.j) {
                return;
            }
            f().a();
            if (n().i()) {
                intent = new Intent(this, SignInActivity.class);
            } else {
                intent = new Intent(this, QuickLoginActivity.class);
            }
            startActivity(intent);
            this.j = false;
            finish();
        } else if (this.b) {
            this.l.postDelayed(new Runnable() { // from class: com.ucare.we.-$$Lambda$SplashActivity$Mddl36IvTHj_TSZif_wdIkgY4JM
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.lambda$Mddl36IvTHj_TSZif_wdIkgY4JM(SplashActivity.this);
                }
            }, CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        } else {
            h();
        }
    }

    public static final void e(SplashActivity splashActivity) {
        dqc.d(splashActivity, "this$0");
        splashActivity.b().b();
    }

    @Override // defpackage.dho
    public final void a(ConfigurationResponseBody configurationResponseBody) {
        dqc.d(configurationResponseBody, "configuration");
        new Gson().a(configurationResponseBody);
        this.b = false;
        i();
        n().a(configurationResponseBody.getFeatureBalanceTransfer());
        n().b(configurationResponseBody.getFeatureBalanceTransferHistory());
        n().d(configurationResponseBody.getFeatureQoutatransfer());
        n().e(configurationResponseBody.isFeature_autopay());
        n().f(configurationResponseBody.getFeatureRequestdevice());
        n().g(configurationResponseBody.getFeatureSuspendandResume());
        n().h(configurationResponseBody.getFeatureRequestUserNameAndPW());
        n().i(configurationResponseBody.getFeatureTT());
        n().j(configurationResponseBody.getFeatureSalfny());
        c().b();
    }

    @Override // defpackage.dho
    public final void d() {
        if (this.b) {
            this.l.postDelayed(new Runnable() { // from class: com.ucare.we.-$$Lambda$SplashActivity$Wj6na_KJnR4TUkwogJW4krsD6FU
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.lambda$Wj6na_KJnR4TUkwogJW4krsD6FU(SplashActivity.this);
                }
            }, CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        } else {
            h();
        }
    }

    public static final void f(SplashActivity splashActivity) {
        dqc.d(splashActivity, "this$0");
        splashActivity.b().b();
    }

    private final void h() {
        f().a();
        new w.a(this).a(getString(R.string.network_failure)).b().b(getString(R.string.failed_to_check_auto_update_error_msg)).c().e();
    }

    public static final void a(SplashActivity splashActivity, w wVar, s sVar) {
        dqc.d(splashActivity, "this$0");
        dqc.d(wVar, "dialog");
        dqc.d(sVar, "which");
        String androidForcedUpdateAppUrl = splashActivity.c().g.getAndroidForcedUpdateAppUrl();
        String str = androidForcedUpdateAppUrl;
        if (!(str == null || str.length() == 0)) {
            splashActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(androidForcedUpdateAppUrl)));
        }
    }

    @Override // defpackage.ddh
    public final void b(boolean z) {
        if (z) {
            f().a(this, getString(R.string.loading));
        } else {
            f().a();
        }
    }

    @Override // defpackage.ddh
    public final void a(SignInResponse signInResponse) {
        dqc.d(signInResponse, "signInResponse");
        if (dqc.a((Object) n().k(), (Object) "")) {
            n().c("en");
        }
        n().i(signInResponse.getHeader().getMsisdn());
        n().k("PREPAID");
        n().d(signInResponse.getHeader().getMsisdn());
        n().e(signInResponse.getBody().getCustomerName());
        n().l("PREPAID");
        n().n(signInResponse.getHeader().getMsisdn());
        n().o(signInResponse.getHeader().getMsisdn());
        b().a(signInResponse);
        djv.b("jwt", signInResponse.getBody().getJwt());
        n().u(signInResponse.getBody().getJwt());
        djv.b("customerId", signInResponse.getHeader().getCustomerId());
        n().w(signInResponse.getBody().getGroupFmc().getId());
        djw n = n();
        Boolean registered = signInResponse.getBody().getUserProperties().getRegistered();
        dqc.b(registered, "signInResponse.body.userProperties.registered");
        n.r(registered.booleanValue());
        n().o(signInResponse.getBody().getGroupFmc().isSubscribed());
        n().x(new Gson().a(signInResponse.getBody().getGroupFamily()));
        n().p(signInResponse.getBody().isIptv());
        n().b(signInResponse.getBody().getAssociatedLines());
        n().k(false);
    }

    @Override // defpackage.ddh
    public final void a() {
        n().q("");
        n().s("");
        startActivity(new Intent(this, QuickLoginActivity.class));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        f().a();
        i();
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ucare/we/SplashActivity$startTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f extends CountDownTimer {
        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(30000L, 1000L);
            SplashActivity.this = r5;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            SplashActivity.this.b = false;
        }
    }

    private final void i() {
        CountDownTimer countDownTimer = this.k;
        if (countDownTimer == null || countDownTimer == null) {
            return;
        }
        countDownTimer.cancel();
    }

    @Override // defpackage.dik
    public final void a(UpdateConfiguration updateConfiguration) {
        new Gson().a(updateConfiguration);
        if ((updateConfiguration == null ? null : updateConfiguration.getAndroidForcedUpdateMinVersion()) != null) {
            String androidForcedUpdateMinVersion = updateConfiguration.getAndroidForcedUpdateMinVersion();
            dqc.b(androidForcedUpdateMinVersion, "configuration.androidForcedUpdateMinVersion");
            if (202205200 < Long.parseLong(androidForcedUpdateMinVersion)) {
                new w.a(this).a(getString(R.string.update_available)).b().b(getString(R.string.update_app)).c().a(this.t).c(getString(R.string.update_text)).e();
                return;
            }
        }
        if (!TextUtils.isEmpty(n().E())) {
            ddg ddgVar = this.i;
            if (ddgVar == null) {
                return;
            }
            ddgVar.a(n().E(), "FACEBOOK");
        } else if (!TextUtils.isEmpty(n().G())) {
            ddg ddgVar2 = this.i;
            if (ddgVar2 == null) {
                return;
            }
            ddgVar2.a(n().G(), "GOOGLE");
        } else if (!TextUtils.isEmpty(n().F())) {
            ddg ddgVar3 = this.i;
            if (ddgVar3 == null) {
                return;
            }
            ddgVar3.a(n().F(), "HUAWEI");
        } else if (TextUtils.isEmpty(b().p)) {
            b().b();
        } else {
            dio b2 = b();
            String r = b2.e.r();
            String t = b2.e.t();
            b2.e.p("");
            TextUtils.isEmpty(b2.p);
            boolean z = true;
            if (b2.e.r() == null || b2.e.t() == null) {
                z = false;
            } else {
                b2.a(r, t, true);
            }
            if (z) {
                return;
            }
            g().b(this, QuickLoginActivity.class);
            finish();
        }
    }

    @Override // defpackage.dik
    public final void e() {
        if (this.b) {
            this.l.postDelayed(new Runnable() { // from class: com.ucare.we.-$$Lambda$SplashActivity$syvsCbHdxSfNUjXn3f7QgmxoXAI
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.lambda$syvsCbHdxSfNUjXn3f7QgmxoXAI(SplashActivity.this);
                }
            }, CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        } else {
            h();
        }
    }

    public static final void g(SplashActivity splashActivity) {
        dqc.d(splashActivity, "this$0");
        splashActivity.b().b();
    }

    public static final /* synthetic */ void a(SplashActivity splashActivity) {
        f fVar = new f();
        splashActivity.k = fVar;
        if (fVar != null) {
            fVar.start();
        }
    }

    public static final /* synthetic */ void b(SplashActivity splashActivity) {
        ImageView imageView = splashActivity.n;
        if (imageView == null) {
            dqc.a("slogan");
            throw null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.addListener(splashActivity.p);
        ofFloat.start();
    }

    public static final /* synthetic */ void c(SplashActivity splashActivity) {
        ImageView imageView = splashActivity.m;
        if (imageView == null) {
            dqc.a("logo");
            throw null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.SCALE_X, 1.0f);
        ofFloat.setDuration(300L);
        ImageView imageView2 = splashActivity.m;
        if (imageView2 == null) {
            dqc.a("logo");
            throw null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, View.SCALE_Y, 1.0f);
        ofFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(splashActivity.q);
        animatorSet.start();
    }

    public static final /* synthetic */ void d(SplashActivity splashActivity) {
        ImageView imageView = splashActivity.m;
        if (imageView == null) {
            dqc.a("logo");
            throw null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.SCALE_X, 1.4f);
        ofFloat.setDuration(300L);
        ImageView imageView2 = splashActivity.m;
        if (imageView2 == null) {
            dqc.a("logo");
            throw null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, View.SCALE_Y, 1.4f);
        ofFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(splashActivity.r);
        animatorSet.start();
    }
}
