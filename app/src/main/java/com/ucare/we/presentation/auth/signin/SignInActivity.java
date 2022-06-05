package com.ucare.we.presentation.auth.signin;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.PayBillActivity;
import com.ucare.we.R;
import com.ucare.we.model.SignInModel.SignInResponse;
import com.ucare.we.newHome.features.AnonymousNewHomeActivity;
import com.ucare.we.newHome.features.HomeActivity;
import com.ucare.we.presentation.auth.signup.SignUpActivity;
import defpackage.lu;
import defpackage.rw;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 ¹\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002¹\u0001B\u0005¢\u0006\u0002\u0010\u0005J\n\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0002J\u001b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000f\u0010\u008b\u0001\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u0001H\u0002J\n\u0010\u008e\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u008f\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u0090\u0001\u001a\u00030\u0089\u0001H\u0002J\t\u0010\u0091\u0001\u001a\u00020OH\u0002J\u0007\u0010\u0092\u0001\u001a\u00020OJ\n\u0010\u0093\u0001\u001a\u00030\u0089\u0001H\u0016J\u0014\u0010\u0094\u0001\u001a\u00030\u0089\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0016J*\u0010\u0097\u0001\u001a\u00030\u0089\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u0001H\u0016J'\u0010\u009d\u0001\u001a\u00030\u0089\u00012\b\u0010\u009e\u0001\u001a\u00030\u0099\u00012\b\u0010\u009f\u0001\u001a\u00030\u0099\u00012\u0007\u0010 \u0001\u001a\u00020^H\u0016J\u0014\u0010¡\u0001\u001a\u00030\u0089\u00012\b\u0010\u009e\u0001\u001a\u00030\u0099\u0001H\u0016J\u001d\u0010¡\u0001\u001a\u00030\u0089\u00012\b\u0010\u009e\u0001\u001a\u00030\u0099\u00012\u0007\u0010¢\u0001\u001a\u00020OH\u0016J\n\u0010£\u0001\u001a\u00030\u0089\u0001H\u0016J\u0014\u0010¤\u0001\u001a\u00030\u0089\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0016J\u0016\u0010§\u0001\u001a\u00030\u0089\u00012\n\u0010¨\u0001\u001a\u0005\u0018\u00010©\u0001H\u0014J\n\u0010ª\u0001\u001a\u00030\u0089\u0001H\u0014J\n\u0010«\u0001\u001a\u00030\u0089\u0001H\u0014J\n\u0010¬\u0001\u001a\u00030\u0089\u0001H\u0014J\n\u0010\u00ad\u0001\u001a\u00030\u0089\u0001H\u0014J\u0013\u0010®\u0001\u001a\u00030\u0089\u00012\u0007\u0010¯\u0001\u001a\u000209H\u0002J\u0013\u0010°\u0001\u001a\u00030\u0089\u00012\u0007\u0010¯\u0001\u001a\u000209H\u0002J\u0013\u0010±\u0001\u001a\u00030\u0089\u00012\u0007\u0010¯\u0001\u001a\u000209H\u0002J\u0012\u0010²\u0001\u001a\u00030\u0089\u00012\u0006\u0010&\u001a\u00020'H\u0002J\u0013\u0010²\u0001\u001a\u00030\u0089\u00012\u0007\u0010³\u0001\u001a\u00020OH\u0016J\n\u0010´\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010µ\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010¶\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010·\u0001\u001a\u00030\u0089\u0001H\u0002J\t\u0010¸\u0001\u001a\u00020OH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u000209X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u000209X\u0082.¢\u0006\u0002\n\u0000R \u0010=\u001a\b\u0012\u0004\u0012\u00020?0>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u000e\u0010J\u001a\u00020KX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010P\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR\u001a\u0010X\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010R\"\u0004\bZ\u0010TR\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010]\u001a\u0004\u0018\u00010^X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010R\"\u0004\be\u0010TR\u001a\u0010f\u001a\u00020OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u000e\u0010k\u001a\u00020;X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010l\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001c\u0010r\u001a\u0004\u0018\u00010sX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001e\u0010x\u001a\u00020y8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R \u0010~\u001a\u0004\u0018\u00010\u007fX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u000f\u0010\u0084\u0001\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0085\u0001\u001a\u00030\u0086\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0087\u0001\u001a\u00030\u0086\u0001X\u0082.¢\u0006\u0002\n\u0000¨\u0006º\u0001"}, d2 = {"Lcom/ucare/we/presentation/auth/signin/SignInActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/ucare/we/provider/AuthenticationListener;", "Lcom/ucare/we/presentation/auth/signin/SignInView;", "()V", "activityLauncher", "Lcom/ucare/we/view/ActivityLauncher;", "getActivityLauncher", "()Lcom/ucare/we/view/ActivityLauncher;", "setActivityLauncher", "(Lcom/ucare/we/view/ActivityLauncher;)V", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "btnDiscoverWe", "Landroidx/appcompat/widget/AppCompatButton;", "btnLoginUsingFacebook", "Landroidx/appcompat/widget/AppCompatImageView;", "btnLoginUsingGoogle", "btnLoginUsingHuawei", "btnPayBill", "btnSignIn", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "setCallbackManager", "(Lcom/facebook/CallbackManager;)V", "configurationProvider", "Lcom/ucare/we/provider/ConfigurationProvider;", "getConfigurationProvider", "()Lcom/ucare/we/provider/ConfigurationProvider;", "setConfigurationProvider", "(Lcom/ucare/we/provider/ConfigurationProvider;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "encryptionUtils", "Lcom/ucare/we/util/EncryptionUtils;", "getEncryptionUtils", "()Lcom/ucare/we/util/EncryptionUtils;", "setEncryptionUtils", "(Lcom/ucare/we/util/EncryptionUtils;)V", "errorHandler", "Lcom/ucare/we/util/ErrorHandler;", "getErrorHandler", "()Lcom/ucare/we/util/ErrorHandler;", "setErrorHandler", "(Lcom/ucare/we/util/ErrorHandler;)V", "etPassword", "Lcom/google/android/material/textfield/TextInputEditText;", "etServiceNumber", "Lcom/google/android/material/textfield/TextInputLayout;", "etUserName", "fbCallbackManager", "Lcom/facebook/FacebookCallback;", "Lcom/facebook/login/LoginResult;", "getFbCallbackManager", "()Lcom/facebook/FacebookCallback;", "setFbCallbackManager", "(Lcom/facebook/FacebookCallback;)V", "fbLoginManager", "Lcom/facebook/login/LoginManager;", "getFbLoginManager", "()Lcom/facebook/login/LoginManager;", "setFbLoginManager", "(Lcom/facebook/login/LoginManager;)V", "gso", "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;", "ibLoginActivity_discoverWE", "imgBackButton", "isPasswordEdited", "", "loginUsingFacebookClickListener", "getLoginUsingFacebookClickListener", "()Landroid/view/View$OnClickListener;", "setLoginUsingFacebookClickListener", "(Landroid/view/View$OnClickListener;)V", "loginUsingGHuaweiClickListener", "getLoginUsingGHuaweiClickListener", "setLoginUsingGHuaweiClickListener", "loginUsingGoogleClickListener", "getLoginUsingGoogleClickListener", "setLoginUsingGoogleClickListener", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "myString", "", "getMyString", "()Ljava/lang/String;", "setMyString", "(Ljava/lang/String;)V", "onClickListener", "getOnClickListener", "setOnClickListener", "passwordChanged", "getPasswordChanged", "()Z", "setPasswordChanged", "(Z)V", "password_input_layout", "permissionProvider", "Lcom/ucare/we/presentation/paybillnumbertype/PermissionProvider;", "getPermissionProvider", "()Lcom/ucare/we/presentation/paybillnumbertype/PermissionProvider;", "setPermissionProvider", "(Lcom/ucare/we/presentation/paybillnumbertype/PermissionProvider;)V", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "signInPresenter", "Lcom/ucare/we/presentation/auth/signin/SignInPresenter;", "getSignInPresenter", "()Lcom/ucare/we/presentation/auth/signin/SignInPresenter;", "setSignInPresenter", "(Lcom/ucare/we/presentation/auth/signin/SignInPresenter;)V", "tvForgetPassword", "tvNotHaveAccount", "Landroidx/appcompat/widget/AppCompatTextView;", "tvSignUp", "forgetPassword", "", "handleSignInResult", "completedTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "hideError", "hideProgress", "initializeSocialMediaData", "isValidPass", "isValidPhone", "loginFailed", "loginSuccess", "signInResponse", "Lcom/ucare/we/model/SignInModel/SignInResponse;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAuthenticationFailure", "authenticationType", "failureReason", "failureMessage", "onAuthenticationSuccess", "showBonus", "onBackPressed", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "setActiveEffect", "text", "setErrorEffect", "setSuccessEffect", "showProgress", "show", "signIn", "signInGoogleAccount", "signInHuaweiAccount", "signUp", "validateInput", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SignInActivity extends czy implements View.OnClickListener, ddh, dhk {
    public static final a a = new a((byte) 0);
    private Context A;
    private ProgressDialog B;
    private boolean C;
    private tl D;
    private GoogleSignInOptions E;
    private rw F;
    private lu G;
    private View.OnClickListener H = new View.OnClickListener() { // from class: com.ucare.we.presentation.auth.signin.-$$Lambda$SignInActivity$8VsB-0Yybh20r8hY8tpxlPQyakc
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SignInActivity.m34lambda$8VsB0Yybh20r8hY8tpxlPQyakc(SignInActivity.this, view);
        }
    };
    private View.OnClickListener I = new View.OnClickListener() { // from class: com.ucare.we.presentation.auth.signin.-$$Lambda$SignInActivity$KnJfq4FUY9RZlALx8c_CPXzk1zQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SignInActivity.lambda$KnJfq4FUY9RZlALx8c_CPXzk1zQ(SignInActivity.this, view);
        }
    };
    private View.OnClickListener J = new View.OnClickListener() { // from class: com.ucare.we.presentation.auth.signin.-$$Lambda$SignInActivity$nzZrd2bkCChUPpus_VhrwKibaRY
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SignInActivity.lambda$nzZrd2bkCChUPpus_VhrwKibaRY(SignInActivity.this, view);
        }
    };
    private View.OnClickListener K = new View.OnClickListener() { // from class: com.ucare.we.presentation.auth.signin.-$$Lambda$SignInActivity$djcoouhSGh6WC6JhGD91jf1fu84
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SignInActivity.lambda$djcoouhSGh6WC6JhGD91jf1fu84(SignInActivity.this, view);
        }
    };
    private lw<ry> L = new b();
    @Inject
    public dio b;
    @Inject
    public dhn c;
    @Inject
    public dgc d;
    @Inject
    public djx e;
    @Inject
    public dja f;
    public diz g;
    @Inject
    public djg h;
    ddg i;
    private AppCompatImageView j;
    private AppCompatImageView k;
    private AppCompatImageView l;
    private TextInputLayout m;
    private TextInputLayout n;
    private AppCompatTextView o;
    private AppCompatButton p;
    private AppCompatButton q;
    private TextInputEditText r;
    private TextInputEditText s;
    private AppCompatButton t;
    private AppCompatTextView u;
    private AppCompatButton x;
    private AppCompatButton y;
    private AppCompatImageView z;

    public static final void d(SignInActivity signInActivity, View view) {
        dqc.d(signInActivity, "this$0");
    }

    /* renamed from: lambda$8VsB-0Yybh20r8hY8tpxlPQyakc */
    public static /* synthetic */ void m34lambda$8VsB0Yybh20r8hY8tpxlPQyakc(SignInActivity signInActivity, View view) {
        a(signInActivity, view);
    }

    public static /* synthetic */ void lambda$KnJfq4FUY9RZlALx8c_CPXzk1zQ(SignInActivity signInActivity, View view) {
        b(signInActivity, view);
    }

    public static /* synthetic */ void lambda$L6T_PjgzHzitbI0Cp37Fkp0MFn8(SignInActivity signInActivity, View view, boolean z) {
        a(signInActivity, view, z);
    }

    public static /* synthetic */ void lambda$P__A3knObvgUu3ERuhajHRxzOw4(SignInActivity signInActivity, View view, boolean z) {
        b(signInActivity, view, z);
    }

    public static /* synthetic */ void lambda$djcoouhSGh6WC6JhGD91jf1fu84(SignInActivity signInActivity, View view) {
        d(signInActivity, view);
    }

    public static /* synthetic */ boolean lambda$ejkr5hhqsH5fMo5HD80Jet4aHS8(SignInActivity signInActivity, TextView textView, int i, KeyEvent keyEvent) {
        return a(signInActivity, textView, i, keyEvent);
    }

    public static /* synthetic */ void lambda$nzZrd2bkCChUPpus_VhrwKibaRY(SignInActivity signInActivity, View view) {
        c(signInActivity, view);
    }

    @Override // defpackage.ddh
    public final void a() {
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    private dio b() {
        dio dioVar = this.b;
        if (dioVar != null) {
            return dioVar;
        }
        dqc.a("authenticationProvider");
        throw null;
    }

    private dhn c() {
        dhn dhnVar = this.c;
        if (dhnVar != null) {
            return dhnVar;
        }
        dqc.a("configurationProvider");
        throw null;
    }

    private djx d() {
        djx djxVar = this.e;
        if (djxVar != null) {
            return djxVar;
        }
        dqc.a("activityLauncher");
        throw null;
    }

    private diz e() {
        diz dizVar = this.g;
        if (dizVar != null) {
            return dizVar;
        }
        dqc.a("encryptionUtils");
        throw null;
    }

    private djg f() {
        djg djgVar = this.h;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    public static final void a(SignInActivity signInActivity, View view) {
        dqc.d(signInActivity, "this$0");
        signInActivity.startActivity(new Intent(signInActivity, PayBillActivity.class));
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sign_in_new);
        p();
        SignInActivity signInActivity = this;
        this.A = signInActivity;
        this.i = new ddg(signInActivity, this);
        View findViewById = findViewById(R.id.btn_sign_in);
        dqc.b(findViewById, "findViewById(R.id.btn_sign_in)");
        this.x = (AppCompatButton) findViewById;
        View findViewById2 = findViewById(R.id.ibLoginActivity_discoverWE);
        dqc.b(findViewById2, "findViewById(R.id.ibLoginActivity_discoverWE)");
        this.y = (AppCompatButton) findViewById2;
        diz dizVar = new diz();
        dqc.d(dizVar, "<set-?>");
        this.g = dizVar;
        View findViewById3 = findViewById(R.id.ibLoginActivity_discoverWE);
        dqc.b(findViewById3, "findViewById(R.id.ibLoginActivity_discoverWE)");
        this.q = (AppCompatButton) findViewById3;
        View findViewById4 = findViewById(R.id.tv_sign_up);
        dqc.b(findViewById4, "findViewById(R.id.tv_sign_up)");
        this.u = (AppCompatTextView) findViewById4;
        View findViewById5 = findViewById(R.id.etMobile);
        dqc.b(findViewById5, "findViewById(R.id.etMobile)");
        this.s = (TextInputEditText) findViewById5;
        View findViewById6 = findViewById(R.id.et_password);
        dqc.b(findViewById6, "findViewById(R.id.et_password)");
        this.r = (TextInputEditText) findViewById6;
        View findViewById7 = findViewById(R.id.imgBackButton);
        dqc.b(findViewById7, "findViewById(R.id.imgBackButton)");
        this.z = (AppCompatImageView) findViewById7;
        View findViewById8 = findViewById(R.id.tv_dont_have_account);
        dqc.b(findViewById8, "findViewById(R.id.tv_dont_have_account)");
        this.o = (AppCompatTextView) findViewById8;
        View findViewById9 = findViewById(R.id.tv_forget_Password);
        dqc.b(findViewById9, "findViewById(R.id.tv_forget_Password)");
        AppCompatButton appCompatButton = (AppCompatButton) findViewById9;
        this.p = appCompatButton;
        if (appCompatButton != null) {
            SignInActivity signInActivity2 = this;
            appCompatButton.setOnClickListener(signInActivity2);
            AppCompatButton appCompatButton2 = this.y;
            if (appCompatButton2 == null) {
                dqc.a("ibLoginActivity_discoverWE");
                throw null;
            }
            appCompatButton2.setOnClickListener(signInActivity2);
            AppCompatButton appCompatButton3 = this.x;
            if (appCompatButton3 == null) {
                dqc.a("btnSignIn");
                throw null;
            }
            appCompatButton3.setOnClickListener(signInActivity2);
            AppCompatButton appCompatButton4 = this.q;
            if (appCompatButton4 == null) {
                dqc.a("btnDiscoverWe");
                throw null;
            }
            appCompatButton4.setOnClickListener(signInActivity2);
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null) {
                dqc.a("tvSignUp");
                throw null;
            }
            appCompatTextView.setOnClickListener(signInActivity2);
            AppCompatImageView appCompatImageView = this.z;
            if (appCompatImageView == null) {
                dqc.a("imgBackButton");
                throw null;
            }
            appCompatImageView.setOnClickListener(signInActivity2);
            View findViewById10 = findViewById(R.id.imgPayBill);
            dqc.b(findViewById10, "findViewById(R.id.imgPayBill)");
            AppCompatButton appCompatButton5 = (AppCompatButton) findViewById10;
            this.t = appCompatButton5;
            if (appCompatButton5 != null) {
                appCompatButton5.setOnClickListener(this.H);
                View findViewById11 = findViewById(R.id.password_input_layout);
                dqc.b(findViewById11, "findViewById(R.id.password_input_layout)");
                this.m = (TextInputLayout) findViewById11;
                View findViewById12 = findViewById(R.id.etServiceNumber);
                dqc.b(findViewById12, "findViewById(R.id.etServiceNumber)");
                this.n = (TextInputLayout) findViewById12;
                View findViewById13 = findViewById(R.id.btnLoginUsingGoogle);
                dqc.b(findViewById13, "findViewById(R.id.btnLoginUsingGoogle)");
                this.k = (AppCompatImageView) findViewById13;
                View findViewById14 = findViewById(R.id.btnLoginUsingFacebook);
                dqc.b(findViewById14, "findViewById(R.id.btnLoginUsingFacebook)");
                this.j = (AppCompatImageView) findViewById14;
                TextInputEditText textInputEditText = this.s;
                if (textInputEditText == null) {
                    dqc.a("etUserName");
                    throw null;
                }
                textInputEditText.setCustomSelectionActionModeCallback(new c());
                TextInputEditText textInputEditText2 = this.s;
                if (textInputEditText2 == null) {
                    dqc.a("etUserName");
                    throw null;
                }
                textInputEditText2.setLongClickable(false);
                TextInputEditText textInputEditText3 = this.s;
                if (textInputEditText3 == null) {
                    dqc.a("etUserName");
                    throw null;
                }
                textInputEditText3.setTextIsSelectable(false);
                TextInputEditText textInputEditText4 = this.r;
                if (textInputEditText4 == null) {
                    dqc.a("etPassword");
                    throw null;
                }
                textInputEditText4.setCustomSelectionActionModeCallback(new d());
                TextInputEditText textInputEditText5 = this.r;
                if (textInputEditText5 == null) {
                    dqc.a("etPassword");
                    throw null;
                }
                textInputEditText5.setLongClickable(false);
                TextInputEditText textInputEditText6 = this.r;
                if (textInputEditText6 == null) {
                    dqc.a("etPassword");
                    throw null;
                }
                textInputEditText6.setTextIsSelectable(false);
                View findViewById15 = findViewById(R.id.btnLoginUsingHuawei);
                dqc.b(findViewById15, "findViewById(R.id.btnLoginUsingHuawei)");
                this.l = (AppCompatImageView) findViewById15;
                Typeface createFromAsset = Typeface.createFromAsset(getAssets(), "quicksand_regular.ttf");
                TextInputLayout textInputLayout = this.m;
                if (textInputLayout == null) {
                    dqc.a("password_input_layout");
                    throw null;
                }
                textInputLayout.setTypeface(createFromAsset);
                TextInputEditText textInputEditText7 = this.r;
                if (textInputEditText7 == null) {
                    dqc.a("etPassword");
                    throw null;
                }
                textInputEditText7.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.ucare.we.presentation.auth.signin.-$$Lambda$SignInActivity$ejkr5hhqsH5fMo5HD80Jet4aHS8
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        return SignInActivity.lambda$ejkr5hhqsH5fMo5HD80Jet4aHS8(SignInActivity.this, textView, i, keyEvent);
                    }
                });
                boolean booleanExtra = getIntent().getBooleanExtra("passwordChanged", false);
                this.C = booleanExtra;
                if (booleanExtra) {
                    TextInputEditText textInputEditText8 = this.s;
                    if (textInputEditText8 == null) {
                        dqc.a("etUserName");
                        throw null;
                    }
                    textInputEditText8.setText(getIntent().getStringExtra("mobile"));
                    AppCompatButton appCompatButton6 = this.q;
                    if (appCompatButton6 == null) {
                        dqc.a("btnDiscoverWe");
                        throw null;
                    }
                    appCompatButton6.setVisibility(8);
                    TextInputEditText textInputEditText9 = this.s;
                    if (textInputEditText9 == null) {
                        dqc.a("etUserName");
                        throw null;
                    }
                    textInputEditText9.setKeyListener(null);
                    AppCompatButton appCompatButton7 = this.p;
                    if (appCompatButton7 == null) {
                        dqc.a("tvForgetPassword");
                        throw null;
                    }
                    appCompatButton7.setVisibility(4);
                    AppCompatTextView appCompatTextView2 = this.o;
                    if (appCompatTextView2 == null) {
                        dqc.a("tvNotHaveAccount");
                        throw null;
                    }
                    appCompatTextView2.setVisibility(4);
                    AppCompatTextView appCompatTextView3 = this.u;
                    if (appCompatTextView3 == null) {
                        dqc.a("tvSignUp");
                        throw null;
                    } else {
                        appCompatTextView3.setVisibility(4);
                        n().i(getIntent().getStringExtra("mobile"));
                    }
                } else if (n().r() != null) {
                    TextInputEditText textInputEditText10 = this.s;
                    if (textInputEditText10 == null) {
                        dqc.a("etUserName");
                        throw null;
                    }
                    textInputEditText10.setText(n().r());
                }
                TextInputEditText textInputEditText11 = this.s;
                if (textInputEditText11 != null) {
                    textInputEditText11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.presentation.auth.signin.-$$Lambda$SignInActivity$L6T_PjgzHzitbI0Cp37Fkp0MFn8
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            SignInActivity.lambda$L6T_PjgzHzitbI0Cp37Fkp0MFn8(SignInActivity.this, view, z);
                        }
                    });
                    TextInputEditText textInputEditText12 = this.r;
                    if (textInputEditText12 != null) {
                        textInputEditText12.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.presentation.auth.signin.-$$Lambda$SignInActivity$P__A3knObvgUu3ERuhajHRxzOw4
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view, boolean z) {
                                SignInActivity.lambda$P__A3knObvgUu3ERuhajHRxzOw4(SignInActivity.this, view, z);
                            }
                        });
                        try {
                            if (!c().f.getFeature_socialMedia()) {
                                return;
                            }
                            this.F = rw.a();
                            lu.a aVar = lu.a.a;
                            this.G = lu.a.a();
                            if (diw.a(this)) {
                                GoogleSignInOptions c2 = new GoogleSignInOptions.a(GoogleSignInOptions.a).a(getString(R.string.we_google_app_id)).b(getString(R.string.we_google_app_id)).a().c();
                                dqc.b(c2, "Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)\n                .requestIdToken(getString(R.string.we_google_app_id))\n                .requestServerAuthCode(getString(R.string.we_google_app_id))\n                .requestEmail()\n                .build()");
                                this.E = c2;
                                SignInActivity signInActivity3 = this;
                                if (c2 == null) {
                                    dqc.a("gso");
                                    throw null;
                                }
                                this.D = tj.a((Activity) signInActivity3, c2);
                            } else {
                                AppCompatImageView appCompatImageView2 = this.k;
                                if (appCompatImageView2 == null) {
                                    dqc.a("btnLoginUsingGoogle");
                                    throw null;
                                }
                                appCompatImageView2.setVisibility(8);
                            }
                            if (diw.b(this)) {
                                AppCompatImageView appCompatImageView3 = this.l;
                                if (appCompatImageView3 == null) {
                                    dqc.a("btnLoginUsingHuawei");
                                    throw null;
                                }
                                appCompatImageView3.setVisibility(0);
                            } else {
                                AppCompatImageView appCompatImageView4 = this.l;
                                if (appCompatImageView4 == null) {
                                    dqc.a("btnLoginUsingHuawei");
                                    throw null;
                                }
                                appCompatImageView4.setVisibility(8);
                            }
                            AppCompatImageView appCompatImageView5 = this.j;
                            if (appCompatImageView5 == null) {
                                dqc.a("btnLoginUsingFacebook");
                                throw null;
                            }
                            appCompatImageView5.setOnClickListener(this.I);
                            AppCompatImageView appCompatImageView6 = this.k;
                            if (appCompatImageView6 == null) {
                                dqc.a("btnLoginUsingGoogle");
                                throw null;
                            }
                            appCompatImageView6.setOnClickListener(this.J);
                            rw rwVar = this.F;
                            if (rwVar != null) {
                                rwVar.a(this.G, this.L);
                            }
                            AppCompatImageView appCompatImageView7 = this.l;
                            if (appCompatImageView7 != null) {
                                appCompatImageView7.setOnClickListener(this.K);
                                return;
                            } else {
                                dqc.a("btnLoginUsingHuawei");
                                throw null;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    dqc.a("etPassword");
                    throw null;
                }
                dqc.a("etUserName");
                throw null;
            }
            dqc.a("btnPayBill");
            throw null;
        }
        dqc.a("tvForgetPassword");
        throw null;
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"com/ucare/we/presentation/auth/signin/SignInActivity$onCreate$1", "Landroid/view/ActionMode$Callback;", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onPrepareActionMode", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            dqc.d(actionMode, "mode");
            dqc.d(menuItem, "item");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            dqc.d(actionMode, "mode");
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            dqc.d(actionMode, "mode");
            dqc.d(menu, "menu");
            return false;
        }

        c() {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            dqc.d(actionMode, "mode");
            dqc.d(menu, "menu");
            menu.clear();
            return false;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"com/ucare/we/presentation/auth/signin/SignInActivity$onCreate$2", "Landroid/view/ActionMode$Callback;", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onPrepareActionMode", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            dqc.d(actionMode, "mode");
            dqc.d(menuItem, "item");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            dqc.d(actionMode, "mode");
            dqc.d(menu, "menu");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            dqc.d(actionMode, "mode");
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            dqc.d(actionMode, "mode");
            dqc.d(menu, "menu");
            return false;
        }

        d() {
        }
    }

    public static final boolean a(SignInActivity signInActivity, TextView textView, int i, KeyEvent keyEvent) {
        dqc.d(signInActivity, "this$0");
        if ((i == 6 || i == 0) && keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0) {
            signInActivity.g();
            return true;
        }
        return false;
    }

    public static final void a(SignInActivity signInActivity, View view, boolean z) {
        dqc.d(signInActivity, "this$0");
        if (!z) {
            signInActivity.i();
            return;
        }
        TextInputLayout textInputLayout = signInActivity.n;
        if (textInputLayout == null) {
            dqc.a("etServiceNumber");
            throw null;
        }
        textInputLayout.setError(null);
        TextInputEditText textInputEditText = signInActivity.s;
        if (textInputEditText == null) {
            dqc.a("etUserName");
            throw null;
        }
        signInActivity.c(textInputEditText);
        TextInputEditText textInputEditText2 = signInActivity.r;
        if (textInputEditText2 == null) {
            dqc.a("etPassword");
            throw null;
        }
        textInputEditText2.clearFocus();
        TextInputLayout textInputLayout2 = signInActivity.m;
        if (textInputLayout2 != null) {
            textInputLayout2.clearFocus();
        } else {
            dqc.a("password_input_layout");
            throw null;
        }
    }

    public static final void b(SignInActivity signInActivity, View view, boolean z) {
        dqc.d(signInActivity, "this$0");
        if (!z) {
            signInActivity.j();
            return;
        }
        TextInputLayout textInputLayout = signInActivity.m;
        if (textInputLayout == null) {
            dqc.a("password_input_layout");
            throw null;
        }
        textInputLayout.setError(null);
        TextInputEditText textInputEditText = signInActivity.r;
        if (textInputEditText == null) {
            dqc.a("etPassword");
            throw null;
        }
        signInActivity.c(textInputEditText);
        TextInputEditText textInputEditText2 = signInActivity.s;
        if (textInputEditText2 == null) {
            dqc.a("etUserName");
            throw null;
        }
        textInputEditText2.clearFocus();
        TextInputLayout textInputLayout2 = signInActivity.n;
        if (textInputLayout2 != null) {
            textInputLayout2.clearFocus();
        } else {
            dqc.a("etServiceNumber");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dqc.d(view, "view");
        switch (view.getId()) {
            case R.id.btn_sign_in /* 2131362047 */:
                g();
                return;
            case R.id.ibLoginActivity_discoverWE /* 2131362319 */:
                d().b(this, AnonymousNewHomeActivity.class);
                setResult(0);
                break;
            case R.id.imgBackButton /* 2131362351 */:
                break;
            case R.id.tv_forget_Password /* 2131363132 */:
                Intent intent = new Intent(this, SignUpActivity.class);
                intent.putExtra("mode", 1);
                TextInputEditText textInputEditText = this.s;
                if (textInputEditText == null) {
                    dqc.a("etUserName");
                    throw null;
                }
                intent.putExtra("mobile", String.valueOf(textInputEditText.getText()));
                startActivity(intent);
                return;
            case R.id.tv_sign_up /* 2131363172 */:
                djx d2 = d();
                if (d2 == null) {
                    return;
                }
                d2.a(0, this, SignUpActivity.class);
                return;
            default:
                return;
        }
        finish();
    }

    private final void g() {
        String str;
        if (!k()) {
            return;
        }
        dio b2 = b();
        if (TextUtils.isEmpty(b2 == null ? null : b2.p)) {
            dio b3 = b();
            if (b3 == null) {
                return;
            }
            b3.b();
            return;
        }
        TextInputEditText textInputEditText = this.s;
        if (textInputEditText == null) {
            dqc.a("etUserName");
            throw null;
        }
        String valueOf = String.valueOf(textInputEditText.getText());
        TextInputEditText textInputEditText2 = this.r;
        if (textInputEditText2 == null) {
            dqc.a("etPassword");
            throw null;
        }
        String valueOf2 = String.valueOf(textInputEditText2.getText());
        a(this);
        try {
            n().g("************");
            e();
            str = diz.a(valueOf2, this);
        } catch (Exception unused) {
            str = "";
        }
        if (this.C) {
            b().a(valueOf, str, false);
        } else {
            b().a(valueOf, str);
        }
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        b(false);
        if (i == 0) {
            g();
        } else if (i != 1) {
        } else {
            if (c().f == null) {
                c().a();
                dgc dgcVar = this.d;
                if (dgcVar != null) {
                    dgcVar.b();
                } else {
                    dqc.a("permissionProvider");
                    throw null;
                }
            }
            h();
            if (!b().l()) {
                if (b().d()) {
                    if (!b().f() || !b().h()) {
                        if (!b().f() || b().h()) {
                            if (!b().g() || !b().h()) {
                                if (!b().g() || b().h()) {
                                    return;
                                }
                                d().b(this, HomeActivity.class);
                                setResult(-1);
                                finish();
                                return;
                            }
                            d().b(this, HomeActivity.class);
                            setResult(-1);
                            finish();
                            return;
                        }
                        d().b(this, HomeActivity.class);
                        setResult(-1);
                        finish();
                        return;
                    }
                    d().b(this, HomeActivity.class);
                    setResult(-1);
                    finish();
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
                                d().b(this, HomeActivity.class);
                                setResult(-1);
                                finish();
                                return;
                            }
                            d().b(this, HomeActivity.class);
                            setResult(-1);
                            finish();
                            return;
                        }
                        d().b(this, HomeActivity.class);
                        setResult(-1);
                        finish();
                        return;
                    }
                    d().b(this, HomeActivity.class);
                    setResult(-1);
                    finish();
                    return;
                }
            }
            d().b(this, HomeActivity.class);
            setResult(-1);
            finish();
        }
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        dqc.d(str, "failureMessage");
        ErrorHandlerActivity.a(this, str, i2);
        h();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ProgressDialog progressDialog = this.B;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.dismiss();
        }
        b().g = null;
        super.onDestroy();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        b().g = null;
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        b().g = this;
        super.onResume();
    }

    private final void a(Context context) {
        ProgressDialog progressDialog = this.B;
        if (progressDialog != null) {
            if (dqc.a(progressDialog == null ? null : Boolean.valueOf(progressDialog.isShowing()), Boolean.TRUE)) {
                h();
            }
        }
        ProgressDialog progressDialog2 = new ProgressDialog(context);
        this.B = progressDialog2;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getString(R.string.authenticating));
        }
        ProgressDialog progressDialog3 = this.B;
        if (progressDialog3 != null) {
            progressDialog3.setCancelable(false);
        }
        ProgressDialog progressDialog4 = this.B;
        if (progressDialog4 != null) {
            progressDialog4.show();
        }
    }

    private final void h() {
        ProgressDialog progressDialog = this.B;
        if (progressDialog == null || progressDialog == null) {
            return;
        }
        progressDialog.dismiss();
    }

    private boolean i() {
        TextInputEditText textInputEditText = this.s;
        if (textInputEditText == null) {
            dqc.a("etUserName");
            throw null;
        } else if (TextUtils.isEmpty(String.valueOf(textInputEditText.getText()))) {
            TextInputLayout textInputLayout = this.n;
            if (textInputLayout == null) {
                dqc.a("etServiceNumber");
                throw null;
            }
            textInputLayout.setError(getResources().getString(R.string.no_mobile_number));
            TextInputEditText textInputEditText2 = this.s;
            if (textInputEditText2 != null) {
                a(textInputEditText2);
                return false;
            }
            dqc.a("etUserName");
            throw null;
        } else {
            TextInputEditText textInputEditText3 = this.s;
            if (textInputEditText3 == null) {
                dqc.a("etUserName");
                throw null;
            }
            if (!dsg.c(String.valueOf(textInputEditText3.getText()), "027")) {
                TextInputEditText textInputEditText4 = this.s;
                if (textInputEditText4 == null) {
                    dqc.a("etUserName");
                    throw null;
                } else if (String.valueOf(textInputEditText4.getText()).length() < getResources().getInteger(R.integer.mobile_number)) {
                    TextInputLayout textInputLayout2 = this.n;
                    if (textInputLayout2 == null) {
                        dqc.a("etServiceNumber");
                        throw null;
                    }
                    textInputLayout2.setError(getResources().getString(R.string.default_service_number_validation));
                    TextInputEditText textInputEditText5 = this.s;
                    if (textInputEditText5 != null) {
                        a(textInputEditText5);
                        return false;
                    }
                    dqc.a("etUserName");
                    throw null;
                }
            }
            TextInputEditText textInputEditText6 = this.s;
            if (textInputEditText6 == null) {
                dqc.a("etUserName");
                throw null;
            }
            String valueOf = String.valueOf(textInputEditText6.getText());
            if (valueOf == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = valueOf.substring(0, 1);
            dqc.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (!dsg.b(substring, "0")) {
                TextInputEditText textInputEditText7 = this.s;
                if (textInputEditText7 == null) {
                    dqc.a("etUserName");
                    throw null;
                }
                String valueOf2 = String.valueOf(textInputEditText7.getText());
                if (valueOf2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String substring2 = valueOf2.substring(0, 1);
                dqc.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (!dsg.b(substring2, "٠")) {
                    TextInputLayout textInputLayout3 = this.n;
                    if (textInputLayout3 == null) {
                        dqc.a("etServiceNumber");
                        throw null;
                    }
                    textInputLayout3.setError(getResources().getString(R.string.add_account_number_validation));
                    TextInputEditText textInputEditText8 = this.s;
                    if (textInputEditText8 != null) {
                        a(textInputEditText8);
                        return false;
                    }
                    dqc.a("etUserName");
                    throw null;
                }
            }
            TextInputEditText textInputEditText9 = this.s;
            if (textInputEditText9 == null) {
                dqc.a("etUserName");
                throw null;
            }
            b(textInputEditText9);
            TextInputLayout textInputLayout4 = this.n;
            if (textInputLayout4 != null) {
                textInputLayout4.setError(null);
                return true;
            }
            dqc.a("etServiceNumber");
            throw null;
        }
    }

    private final boolean j() {
        TextInputEditText textInputEditText = this.r;
        if (textInputEditText == null) {
            dqc.a("etPassword");
            throw null;
        } else if (TextUtils.isEmpty(String.valueOf(textInputEditText.getText()))) {
            TextInputLayout textInputLayout = this.m;
            if (textInputLayout == null) {
                dqc.a("password_input_layout");
                throw null;
            }
            textInputLayout.setError(getResources().getString(R.string.no_password));
            TextInputEditText textInputEditText2 = this.r;
            if (textInputEditText2 != null) {
                a(textInputEditText2);
                return false;
            }
            dqc.a("etPassword");
            throw null;
        } else {
            TextInputEditText textInputEditText3 = this.r;
            if (textInputEditText3 == null) {
                dqc.a("etPassword");
                throw null;
            } else if (String.valueOf(textInputEditText3.getText()).length() < 8) {
                TextInputLayout textInputLayout2 = this.m;
                if (textInputLayout2 == null) {
                    dqc.a("password_input_layout");
                    throw null;
                }
                textInputLayout2.setError(getResources().getString(R.string.password_length));
                TextInputEditText textInputEditText4 = this.r;
                if (textInputEditText4 != null) {
                    a(textInputEditText4);
                    return false;
                }
                dqc.a("etPassword");
                throw null;
            } else {
                TextInputEditText textInputEditText5 = this.r;
                if (textInputEditText5 == null) {
                    dqc.a("etPassword");
                    throw null;
                }
                b(textInputEditText5);
                TextInputLayout textInputLayout3 = this.m;
                if (textInputLayout3 != null) {
                    textInputLayout3.setError(null);
                    return true;
                }
                dqc.a("password_input_layout");
                throw null;
            }
        }
    }

    private final boolean k() {
        return i() && j();
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/ucare/we/presentation/auth/signin/SignInActivity$fbCallbackManager$1", "Lcom/facebook/FacebookCallback;", "Lcom/facebook/login/LoginResult;", "onCancel", "", "onError", "error", "Lcom/facebook/FacebookException;", "onSuccess", "loginResult", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements lw<ry> {
        b() {
            SignInActivity.this = r1;
        }

        @Override // defpackage.lw
        public final /* synthetic */ void a(ry ryVar) {
            ry ryVar2 = ryVar;
            dqc.d(ryVar2, "loginResult");
            lk lkVar = ryVar2.a;
            ddg ddgVar = SignInActivity.this.i;
            if (ddgVar != null) {
                ddgVar.a(lkVar.e, "FACEBOOK");
            }
        }

        @Override // defpackage.lw
        public final void a(FacebookException facebookException) {
            dqc.d(facebookException, "error");
            String.valueOf(facebookException.getMessage());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        Context context = this.A;
        dqc.a(context);
        uc.a(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        lu luVar = this.G;
        if (luVar != null) {
            luVar.a(i, i2, intent);
        }
        if (i == 10) {
            bwl<GoogleSignInAccount> a2 = tj.a(intent);
            dqc.b(a2, "getSignedInAccountFromIntent(data)");
            try {
                GoogleSignInAccount a3 = a2.a(ApiException.class);
                String str = a3 == null ? null : a3.c;
                ddg ddgVar = this.i;
                if (ddgVar == null) {
                    return;
                }
                ddgVar.a(str, "GOOGLE");
            } catch (ApiException e) {
                dqc.a("=> Google", (Object) e.getMessage());
            }
        }
    }

    @Override // defpackage.ddh
    public final void b(boolean z) {
        if (z) {
            djg f = f();
            if (f == null) {
                return;
            }
            Context context = this.A;
            f.a(context, context == null ? null : context.getString(R.string.loading));
            return;
        }
        djg f2 = f();
        if (f2 == null) {
            return;
        }
        f2.a();
    }

    @Override // defpackage.ddh
    public final void a(SignInResponse signInResponse) {
        djw n;
        dqc.d(signInResponse, "signInResponse");
        b(true);
        djw n2 = n();
        if (dqc.a((Object) (n2 == null ? null : n2.k()), (Object) "") && (n = n()) != null) {
            n.c("en");
        }
        djw n3 = n();
        if (n3 != null) {
            n3.i(signInResponse.getHeader().getMsisdn());
        }
        djw n4 = n();
        if (n4 != null) {
            n4.k("PREPAID");
        }
        djw n5 = n();
        if (n5 != null) {
            n5.d(signInResponse.getHeader().getMsisdn());
        }
        djw n6 = n();
        if (n6 != null) {
            n6.l("PREPAID");
        }
        djw n7 = n();
        if (n7 != null) {
            n7.n(signInResponse.getHeader().getMsisdn());
        }
        djw n8 = n();
        if (n8 != null) {
            n8.o(signInResponse.getHeader().getMsisdn());
        }
        dio b2 = b();
        if (b2 != null) {
            b2.a(signInResponse);
        }
        djv.b("jwt", signInResponse.getBody().getJwt());
        djw n9 = n();
        if (n9 != null) {
            n9.u(signInResponse.getBody().getJwt());
        }
        djv.b("customerId", signInResponse.getHeader().getCustomerId());
        djw n10 = n();
        if (n10 != null) {
            n10.w(signInResponse.getBody().getGroupFmc().getId());
        }
        djw n11 = n();
        if (n11 != null) {
            Boolean registered = signInResponse.getBody().getUserProperties().getRegistered();
            dqc.b(registered, "signInResponse.body.userProperties.registered");
            n11.r(registered.booleanValue());
        }
        djw n12 = n();
        if (n12 != null) {
            n12.o(signInResponse.getBody().getGroupFmc().isSubscribed());
        }
        djw n13 = n();
        if (n13 != null) {
            n13.x(new Gson().a(signInResponse.getBody().getGroupFamily()));
        }
        djw n14 = n();
        if (n14 != null) {
            n14.p(signInResponse.getBody().isIptv());
        }
        djw n15 = n();
        if (n15 != null) {
            n15.b(signInResponse.getBody().getAssociatedLines());
        }
        djw n16 = n();
        if (n16 != null) {
            n16.k(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ucare/we/presentation/auth/signin/SignInActivity$Companion;", "", "()V", "PASSWORD_LEGTH", "", "RC_SIGN_IN", "RC_SIGN_IN_HUAWEI", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    private final void a(TextInputEditText textInputEditText) {
        Resources resources;
        Context context = this.A;
        textInputEditText.setBackgroundDrawable(context == null ? null : context.getDrawable(R.drawable.text_input_white_background_error));
        Context context2 = this.A;
        if (context2 == null || (resources = context2.getResources()) == null) {
            return;
        }
        textInputEditText.setHintTextColor(resources.getColor(R.color.color_grey_new));
    }

    private final void b(TextInputEditText textInputEditText) {
        Resources resources;
        Context context = this.A;
        textInputEditText.setBackgroundDrawable(context == null ? null : context.getDrawable(R.drawable.text_input_white_background_success));
        Context context2 = this.A;
        if (context2 == null || (resources = context2.getResources()) == null) {
            return;
        }
        textInputEditText.setHintTextColor(resources.getColor(R.color.color_grey_new));
    }

    private final void c(TextInputEditText textInputEditText) {
        Resources resources;
        Context context = this.A;
        textInputEditText.setBackgroundDrawable(context == null ? null : context.getDrawable(R.drawable.text_input_white_background_focused));
        Context context2 = this.A;
        if (context2 == null || (resources = context2.getResources()) == null) {
            return;
        }
        textInputEditText.setHintTextColor(resources.getColor(R.color.color_grey_new));
    }

    public static final void b(SignInActivity signInActivity, View view) {
        dqc.d(signInActivity, "this$0");
        rw rwVar = signInActivity.F;
        if (rwVar != null) {
            List b2 = dmq.b(NotificationCompat.CATEGORY_EMAIL, "public_profile");
            rw.a(b2);
            rwVar.a(new rw.a(signInActivity), rwVar.a(new rt(b2, (byte) 0)));
        }
    }

    public static final void c(SignInActivity signInActivity, View view) {
        dqc.d(signInActivity, "this$0");
        tl tlVar = signInActivity.D;
        signInActivity.startActivityForResult(tlVar == null ? null : tlVar.a(), 10);
    }
}
