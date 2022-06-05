package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class SignInHubActivity extends FragmentActivity {
    private static boolean a = false;
    private boolean b = false;
    private SignInConfiguration c;
    private boolean d;
    private int e;
    private Intent f;

    private final void a() {
        getSupportLoaderManager().initLoader(0, null, new uk(this));
        a = false;
    }

    private final void a(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        a = false;
    }

    private final void a(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.c);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.b = true;
            a(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.b) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount == null || signInAccount.b == null) {
                if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    a(intExtra);
                    return;
                }
            } else {
                GoogleSignInAccount googleSignInAccount = signInAccount.b;
                uc a2 = uc.a(this);
                GoogleSignInOptions googleSignInOptions = this.c.a;
                if (googleSignInAccount != null) {
                    a2.a(googleSignInOptions, googleSignInAccount);
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.d = true;
                    this.e = i2;
                    this.f = intent;
                    a();
                    return;
                }
                throw null;
            }
        }
        a(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action != null) {
            if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
                a(12500);
                return;
            } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                Bundle bundleExtra = intent.getBundleExtra("config");
                if (bundleExtra != null) {
                    SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
                    if (signInConfiguration == null) {
                        setResult(0);
                        finish();
                        return;
                    }
                    this.c = signInConfiguration;
                    if (bundle == null) {
                        if (a) {
                            setResult(0);
                            a(12502);
                            return;
                        }
                        a = true;
                        a(action);
                        return;
                    }
                    boolean z = bundle.getBoolean("signingInGoogleApiClients");
                    this.d = z;
                    if (!z) {
                        return;
                    }
                    this.e = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    if (intent2 != null) {
                        this.f = intent2;
                        a();
                        return;
                    }
                    throw null;
                }
                throw null;
            } else {
                String valueOf = String.valueOf(intent.getAction());
                if (valueOf.length() != 0) {
                    "Unknown action: ".concat(valueOf);
                } else {
                    new String("Unknown action: ");
                }
                finish();
                return;
            }
        }
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.d);
        if (this.d) {
            bundle.putInt("signInResultCode", this.e);
            bundle.putParcelable("signInResultData", this.f);
        }
    }
}
