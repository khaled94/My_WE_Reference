package com.ucare.we.confirmswitchingaccount;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.Header;
import com.ucare.we.model.RefreshLoginResponse;
import com.ucare.we.model.StatusModel.StatusResponse;
import com.ucare.we.model.StatusModel.StatusResponseBody;
import com.ucare.we.model.SwitchAccountModel.FinalizeNumberResponse;
import com.ucare.we.model.SwitchAccountModel.RequestNumberAccessResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.util.OTPView;
import defpackage.au;
import javax.inject.Inject;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\bH\u0002J\u0012\u0010A\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010C\u001a\u00020?H\u0002J\b\u0010D\u001a\u00020?H\u0002J\u0010\u0010E\u001a\u00020?2\u0006\u0010F\u001a\u00020GH\u0002J\"\u0010H\u001a\u00020?2\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0012\u0010M\u001a\u00020?2\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\b\u0010P\u001a\u00020?H\u0014J\u0018\u0010Q\u001a\u00020?2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u0005H\u0016J\b\u0010T\u001a\u00020?H\u0014J\u0012\u0010U\u001a\u00020\b2\b\u0010V\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010W\u001a\u00020?H\u0002J\b\u0010X\u001a\u00020?H\u0002J\u0010\u0010Y\u001a\u00020?2\u0006\u0010S\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\"0\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017R\u000e\u00105\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020;X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020;X\u0082.¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/ucare/we/confirmswitchingaccount/ConfirmSwitchingAccountActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "Lcom/ucare/we/util/onSessionExpired;", "()V", "FINALIZE", "", "RESEND", "associateJWT", "", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "corporatePermissionProvider", "Lcom/ucare/we/provider/CorporatePermissionProvider;", "getCorporatePermissionProvider", "()Lcom/ucare/we/provider/CorporatePermissionProvider;", "setCorporatePermissionProvider", "(Lcom/ucare/we/provider/CorporatePermissionProvider;)V", "dialStatusErrorListener", "Lcom/android/volley/Response$ErrorListener;", "dialStatusSuccessListener", "Lcom/android/volley/Response$Listener;", "Lorg/json/JSONObject;", "maskedMsisdn", "okClickListener", "getOkClickListener", "setOkClickListener", "otpView", "Lcom/ucare/we/util/OTPView;", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "requestGrantAccessErrorListener", "requestGrantAccessSuccessListener", "kotlin.jvm.PlatformType", "resendSMSClickListener", "getResendSMSClickListener", "setResendSMSClickListener", "smsErrorListener", "smsSuccessListener", "smsVerificationReceiver", "Landroid/content/BroadcastReceiver;", "targetMSISDN", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "txtResendSMS", "autoFetchCode", "", "confirmationCode", "getDialStatus", "dial", "getExtras", "initViews", "navigateToNumberView", "statusResponse", "Lcom/ucare/we/model/StatusModel/StatusResponse;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLoginResponse", "jsonResponse", "which", "onStart", "parseOneTimeCode", "message", "setListeners", "smsListener", "startLogin", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfirmSwitchingAccountActivity extends dae implements dju {
    @Inject
    public dhp a;
    @Inject
    public dio b;
    @Inject
    public djg c;
    private String d;
    private String g;
    private TextView i;
    private TextView j;
    private Button k;
    private Button l;
    private TextView m;
    private OTPView n;
    private String o;
    private final int e = 1;
    private final int f = 2;
    private View.OnClickListener h = new View.OnClickListener() { // from class: com.ucare.we.confirmswitchingaccount.-$$Lambda$ConfirmSwitchingAccountActivity$3IdwejQ8GrbN2D_i8F2SQSzQ8HI
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmSwitchingAccountActivity.lambda$3IdwejQ8GrbN2D_i8F2SQSzQ8HI(ConfirmSwitchingAccountActivity.this, view);
        }
    };
    private final au.b<JSONObject> p = new au.b() { // from class: com.ucare.we.confirmswitchingaccount.-$$Lambda$ConfirmSwitchingAccountActivity$bCy3lzcqHeiJBXu3kSHc0VMHk5Y
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            ConfirmSwitchingAccountActivity.lambda$bCy3lzcqHeiJBXu3kSHc0VMHk5Y(ConfirmSwitchingAccountActivity.this, (JSONObject) obj);
        }
    };
    private final au.a q = new au.a() { // from class: com.ucare.we.confirmswitchingaccount.-$$Lambda$ConfirmSwitchingAccountActivity$jKYIjnY8CWvuGkAv8vnUHDrWq-Q
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ConfirmSwitchingAccountActivity.m19lambda$jKYIjnY8CWvuGkAv8vnUHDrWqQ(ConfirmSwitchingAccountActivity.this, volleyError);
        }
    };
    private final au.b<JSONObject> r = new au.b() { // from class: com.ucare.we.confirmswitchingaccount.-$$Lambda$ConfirmSwitchingAccountActivity$Tgfa2Ec2kCWkVp8jT1AtRDlX4Ss
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            ConfirmSwitchingAccountActivity.lambda$Tgfa2Ec2kCWkVp8jT1AtRDlX4Ss(ConfirmSwitchingAccountActivity.this, (JSONObject) obj);
        }
    };
    private final au.a s = new au.a() { // from class: com.ucare.we.confirmswitchingaccount.-$$Lambda$ConfirmSwitchingAccountActivity$Kj1kcWaIj6yk7vjHtfwWfqDZnmk
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ConfirmSwitchingAccountActivity.lambda$Kj1kcWaIj6yk7vjHtfwWfqDZnmk(ConfirmSwitchingAccountActivity.this, volleyError);
        }
    };
    private View.OnClickListener t = new View.OnClickListener() { // from class: com.ucare.we.confirmswitchingaccount.-$$Lambda$ConfirmSwitchingAccountActivity$DGCXiBE5t4nKJh-8KDy60eXAKyo
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmSwitchingAccountActivity.m17lambda$DGCXiBE5t4nKJh8KDy60eXAKyo(ConfirmSwitchingAccountActivity.this, view);
        }
    };
    private final au.b<JSONObject> u = new au.b() { // from class: com.ucare.we.confirmswitchingaccount.-$$Lambda$ConfirmSwitchingAccountActivity$dJJmCVmmtlJZsHucRy6JxaBkZ94
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            ConfirmSwitchingAccountActivity.lambda$dJJmCVmmtlJZsHucRy6JxaBkZ94(ConfirmSwitchingAccountActivity.this, (JSONObject) obj);
        }
    };
    private final au.a x = $$Lambda$ConfirmSwitchingAccountActivity$dzs4jMTct_p2EmN9MyO3noQytHk.INSTANCE;
    private View.OnClickListener y = new View.OnClickListener() { // from class: com.ucare.we.confirmswitchingaccount.-$$Lambda$ConfirmSwitchingAccountActivity$iheu6lrqUzdwP-C6mJG0taMs1WY
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmSwitchingAccountActivity.m18lambda$iheu6lrqUzdwPC6mJG0taMs1WY(ConfirmSwitchingAccountActivity.this, view);
        }
    };
    private final BroadcastReceiver z = new c();

    public static final void a(VolleyError volleyError) {
    }

    public static /* synthetic */ void lambda$3IdwejQ8GrbN2D_i8F2SQSzQ8HI(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, View view) {
        a(confirmSwitchingAccountActivity, view);
    }

    /* renamed from: lambda$DGCXiBE5t4nKJh-8KDy60eXAKyo */
    public static /* synthetic */ void m17lambda$DGCXiBE5t4nKJh8KDy60eXAKyo(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, View view) {
        b(confirmSwitchingAccountActivity, view);
    }

    public static /* synthetic */ void lambda$Kj1kcWaIj6yk7vjHtfwWfqDZnmk(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, VolleyError volleyError) {
        b(confirmSwitchingAccountActivity, volleyError);
    }

    public static /* synthetic */ void lambda$Tgfa2Ec2kCWkVp8jT1AtRDlX4Ss(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, JSONObject jSONObject) {
        b(confirmSwitchingAccountActivity, jSONObject);
    }

    public static /* synthetic */ void lambda$VyjM0Ib6OHTaVeb6q1XTsz9nyCs(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity) {
        b(confirmSwitchingAccountActivity);
    }

    public static /* synthetic */ void lambda$bCy3lzcqHeiJBXu3kSHc0VMHk5Y(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, JSONObject jSONObject) {
        a(confirmSwitchingAccountActivity, jSONObject);
    }

    public static /* synthetic */ void lambda$dJJmCVmmtlJZsHucRy6JxaBkZ94(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, JSONObject jSONObject) {
        c(confirmSwitchingAccountActivity, jSONObject);
    }

    /* renamed from: lambda$iheu6lrqUzdwP-C6mJG0taMs1WY */
    public static /* synthetic */ void m18lambda$iheu6lrqUzdwPC6mJG0taMs1WY(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, View view) {
        c(confirmSwitchingAccountActivity, view);
    }

    /* renamed from: lambda$jKYIjnY8CWvuGkAv8vnUHDrWq-Q */
    public static /* synthetic */ void m19lambda$jKYIjnY8CWvuGkAv8vnUHDrWqQ(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, VolleyError volleyError) {
        a(confirmSwitchingAccountActivity, volleyError);
    }

    private djg a() {
        djg djgVar = this.c;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    public static final void a(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, View view) {
        dqc.d(confirmSwitchingAccountActivity, "this$0");
        confirmSwitchingAccountActivity.finish();
    }

    public static final void a(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, JSONObject jSONObject) {
        dqc.d(confirmSwitchingAccountActivity, "this$0");
        confirmSwitchingAccountActivity.a().a();
        Gson gson = new Gson();
        RefreshLoginResponse refreshLoginResponse = (RefreshLoginResponse) gson.a(jSONObject.toString(), (Class<Object>) RefreshLoginResponse.class);
        gson.a(refreshLoginResponse);
        if (refreshLoginResponse == null || refreshLoginResponse.header == null || !dqc.a((Object) refreshLoginResponse.header.responseCode, (Object) "0")) {
            return;
        }
        confirmSwitchingAccountActivity.n().w("");
        confirmSwitchingAccountActivity.n().r(false);
        confirmSwitchingAccountActivity.n().x("");
        confirmSwitchingAccountActivity.n().o(false);
        confirmSwitchingAccountActivity.n().p(false);
        confirmSwitchingAccountActivity.n().A("");
        confirmSwitchingAccountActivity.n().y("");
        confirmSwitchingAccountActivity.n().z("");
        confirmSwitchingAccountActivity.n().p("");
        confirmSwitchingAccountActivity.d = refreshLoginResponse.body.jwt;
        confirmSwitchingAccountActivity.n().u(confirmSwitchingAccountActivity.d);
        confirmSwitchingAccountActivity.n().w(refreshLoginResponse.body.getGroupFmc().getId());
        djw n = confirmSwitchingAccountActivity.n();
        Boolean registered = refreshLoginResponse.body.getUserProperties().getRegistered();
        dqc.b(registered, "refreshLoginResponse.body.userProperties.registered");
        n.r(registered.booleanValue());
        confirmSwitchingAccountActivity.n().o(refreshLoginResponse.body.getGroupFmc().isSubscribed());
        confirmSwitchingAccountActivity.n().x(new Gson().a(refreshLoginResponse.body.getGroupFamily()));
        confirmSwitchingAccountActivity.n().p(refreshLoginResponse.body.isIptv());
        StatusResponse statusResponse = new StatusResponse();
        statusResponse.header = refreshLoginResponse.header;
        statusResponse.body = new StatusResponseBody();
        statusResponse.body.type = refreshLoginResponse.body.type;
        statusResponse.body.role = refreshLoginResponse.body.role;
        confirmSwitchingAccountActivity.n().d(statusResponse.header.msisdn);
    }

    public static final void a(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, VolleyError volleyError) {
        dqc.d(confirmSwitchingAccountActivity, "this$0");
        confirmSwitchingAccountActivity.a().a();
        new Gson();
    }

    public static final void b(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, JSONObject jSONObject) {
        Header header;
        dqc.d(confirmSwitchingAccountActivity, "this$0");
        confirmSwitchingAccountActivity.a().a();
        FinalizeNumberResponse finalizeNumberResponse = (FinalizeNumberResponse) new Gson().a(jSONObject.toString(), (Class<Object>) FinalizeNumberResponse.class);
        if (finalizeNumberResponse != null && finalizeNumberResponse.header != null && dqc.a((Object) finalizeNumberResponse.header.responseCode, (Object) "0")) {
            ResponseActivity.a(confirmSwitchingAccountActivity, confirmSwitchingAccountActivity.getString(R.string.successfully), finalizeNumberResponse.header.responseMessage, false);
            if (finalizeNumberResponse.body == null || dqc.a((Object) finalizeNumberResponse.body.jwt, (Object) "")) {
                return;
            }
            confirmSwitchingAccountActivity.n().r();
            String r = confirmSwitchingAccountActivity.n().r();
            try {
                String.valueOf(r);
                confirmSwitchingAccountActivity.a().a(confirmSwitchingAccountActivity, confirmSwitchingAccountActivity.getString(R.string.loading));
                djl.a(confirmSwitchingAccountActivity).o(r, confirmSwitchingAccountActivity.p, confirmSwitchingAccountActivity.q);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (finalizeNumberResponse != null && finalizeNumberResponse.header != null && dqc.a((Object) finalizeNumberResponse.header.responseCode, (Object) "1200")) {
            confirmSwitchingAccountActivity.b(confirmSwitchingAccountActivity.f);
        } else {
            UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
            ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity2 = confirmSwitchingAccountActivity;
            String str = null;
            if (finalizeNumberResponse != null && (header = finalizeNumberResponse.header) != null) {
                str = header.responseMessage;
            }
            UnNavigateResponseActivity.a.a(confirmSwitchingAccountActivity2, str, confirmSwitchingAccountActivity.getString(R.string.please_try_again), true);
        }
    }

    public static final void b(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, VolleyError volleyError) {
        dqc.d(confirmSwitchingAccountActivity, "this$0");
        confirmSwitchingAccountActivity.a().a();
        UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
        UnNavigateResponseActivity.a.a(confirmSwitchingAccountActivity, confirmSwitchingAccountActivity.getString(R.string.error), confirmSwitchingAccountActivity.getString(R.string.please_try_again), true);
    }

    public static final void b(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, View view) {
        dqc.d(confirmSwitchingAccountActivity, "this$0");
        OTPView oTPView = confirmSwitchingAccountActivity.n;
        if (oTPView == null) {
            dqc.a("otpView");
            throw null;
        }
        String stringFromFields = oTPView.getStringFromFields();
        int length = stringFromFields.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = dqc.a(stringFromFields.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        String obj = stringFromFields.subSequence(i, length + 1).toString();
        if (TextUtils.isEmpty(obj)) {
            return;
        }
        try {
            confirmSwitchingAccountActivity.a().a(confirmSwitchingAccountActivity, confirmSwitchingAccountActivity.getString(R.string.loading));
            djl.a(confirmSwitchingAccountActivity).b(obj, confirmSwitchingAccountActivity.o, "add", confirmSwitchingAccountActivity.r, confirmSwitchingAccountActivity.s);
        } catch (Exception e) {
            e.printStackTrace();
            String.valueOf(e.getMessage());
        }
    }

    public static final void c(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, JSONObject jSONObject) {
        dqc.d(confirmSwitchingAccountActivity, "this$0");
        dqc.d(jSONObject, "response");
        RequestNumberAccessResponse requestNumberAccessResponse = (RequestNumberAccessResponse) new Gson().a(jSONObject.toString(), (Class<Object>) RequestNumberAccessResponse.class);
        if (requestNumberAccessResponse != null && requestNumberAccessResponse.header != null && dqc.a((Object) requestNumberAccessResponse.header.responseCode, (Object) "0")) {
            Toast.makeText(confirmSwitchingAccountActivity, requestNumberAccessResponse.header.responseMessage, 0).show();
        } else if (requestNumberAccessResponse == null || requestNumberAccessResponse.header == null || !dqc.a((Object) requestNumberAccessResponse.header.responseCode, (Object) "1200")) {
        } else {
            confirmSwitchingAccountActivity.b(confirmSwitchingAccountActivity.e);
        }
    }

    public static final void c(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity, View view) {
        dqc.d(confirmSwitchingAccountActivity, "this$0");
        try {
            djl.a(confirmSwitchingAccountActivity).d(confirmSwitchingAccountActivity.o, confirmSwitchingAccountActivity.u, confirmSwitchingAccountActivity.x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirm_switching_account);
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            this.o = extras == null ? null : extras.getString(TypedValues.Attributes.S_TARGET);
            Bundle extras2 = getIntent().getExtras();
            this.g = extras2 == null ? null : extras2.getString("maskedMsisdn");
        }
        View findViewById = findViewById(R.id.btn_ok);
        dqc.b(findViewById, "findViewById(R.id.btn_ok)");
        Button button = (Button) findViewById;
        this.k = button;
        if (button != null) {
            button.setEnabled(false);
            Button button2 = this.k;
            if (button2 == null) {
                dqc.a("btnOK");
                throw null;
            }
            button2.setAlpha(0.15f);
            View findViewById2 = findViewById(R.id.btn_cancel);
            dqc.b(findViewById2, "findViewById(R.id.btn_cancel)");
            this.l = (Button) findViewById2;
            View findViewById3 = findViewById(R.id.otp_view);
            dqc.b(findViewById3, "findViewById(R.id.otp_view)");
            this.n = (OTPView) findViewById3;
            View findViewById4 = findViewById(R.id.txtResendSMS);
            dqc.b(findViewById4, "findViewById(R.id.txtResendSMS)");
            this.m = (TextView) findViewById4;
            View findViewById5 = findViewById(R.id.txtMessageDetails);
            dqc.b(findViewById5, "findViewById(R.id.txtMessageDetails)");
            this.j = (TextView) findViewById5;
            View findViewById6 = findViewById(R.id.txtMessage);
            dqc.b(findViewById6, "findViewById(R.id.txtMessage)");
            TextView textView = (TextView) findViewById6;
            this.i = textView;
            if (textView != null) {
                textView.setText(getString(R.string.confirmation_title));
                TextView textView2 = this.j;
                if (textView2 == null) {
                    dqc.a("txtMessageDetails");
                    throw null;
                }
                textView2.setText(getString(R.string.confirmation_text));
                if (this.g != null) {
                    if (dsg.b(n().k(), "ar")) {
                        TextView textView3 = this.j;
                        if (textView3 == null) {
                            dqc.a("txtMessageDetails");
                            throw null;
                        }
                        textView3.setText(getString(R.string.switch_account_confirmation_code_hint_p1) + ((Object) djm.d(this.g)) + getString(R.string.switch_account_confirmation_code_hint_p2));
                    } else {
                        TextView textView4 = this.j;
                        if (textView4 == null) {
                            dqc.a("txtMessageDetails");
                            throw null;
                        }
                        textView4.setText(getString(R.string.switch_account_confirmation_code_hint_p1) + ((Object) this.g) + getString(R.string.switch_account_confirmation_code_hint_p2));
                    }
                }
                Button button3 = this.k;
                if (button3 == null) {
                    dqc.a("btnOK");
                    throw null;
                }
                button3.setOnClickListener(this.t);
                Button button4 = this.l;
                if (button4 == null) {
                    dqc.a("btnCancel");
                    throw null;
                }
                button4.setOnClickListener(this.h);
                TextView textView5 = this.m;
                if (textView5 == null) {
                    dqc.a("txtResendSMS");
                    throw null;
                }
                textView5.setOnClickListener(this.y);
                OTPView oTPView = this.n;
                if (oTPView == null) {
                    dqc.a("otpView");
                    throw null;
                }
                oTPView.setOnCharacterUpdatedListener(new a());
                OTPView oTPView2 = this.n;
                if (oTPView2 != null) {
                    oTPView2.setOnFinishListener(new b());
                    return;
                } else {
                    dqc.a("otpView");
                    throw null;
                }
            }
            dqc.a("txtMessage");
            throw null;
        }
        dqc.a("btnOK");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "isUpdated", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends dqd implements dow<Boolean, dmg> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            ConfirmSwitchingAccountActivity.this = r1;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(Boolean bool) {
            Boolean bool2 = bool;
            dqc.a(bool2);
            if (!bool2.booleanValue()) {
                Button button = ConfirmSwitchingAccountActivity.this.k;
                if (button != null) {
                    button.setEnabled(false);
                    Button button2 = ConfirmSwitchingAccountActivity.this.k;
                    if (button2 == null) {
                        dqc.a("btnOK");
                        throw null;
                    }
                    button2.setAlpha(0.15f);
                } else {
                    dqc.a("btnOK");
                    throw null;
                }
            } else {
                Button button3 = ConfirmSwitchingAccountActivity.this.k;
                if (button3 != null) {
                    button3.setEnabled(true);
                    Button button4 = ConfirmSwitchingAccountActivity.this.k;
                    if (button4 == null) {
                        dqc.a("btnOK");
                        throw null;
                    }
                    button4.setAlpha(1.0f);
                } else {
                    dqc.a("btnOK");
                    throw null;
                }
            }
            return dmg.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "s", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class b extends dqd implements dow<String, dmg> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            ConfirmSwitchingAccountActivity.this = r1;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(String str) {
            String str2 = str;
            dqc.d(str2, "s");
            String str3 = str2;
            int length = str3.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = dqc.a(str3.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            if (str3.subSequence(i, length + 1).toString().length() != 6) {
                Button button = ConfirmSwitchingAccountActivity.this.k;
                if (button != null) {
                    button.setEnabled(false);
                    Button button2 = ConfirmSwitchingAccountActivity.this.k;
                    if (button2 == null) {
                        dqc.a("btnOK");
                        throw null;
                    }
                    button2.setAlpha(0.15f);
                } else {
                    dqc.a("btnOK");
                    throw null;
                }
            } else {
                Button button3 = ConfirmSwitchingAccountActivity.this.k;
                if (button3 != null) {
                    button3.setEnabled(true);
                    Button button4 = ConfirmSwitchingAccountActivity.this.k;
                    if (button4 == null) {
                        dqc.a("btnOK");
                        throw null;
                    }
                    button4.setAlpha(1.0f);
                } else {
                    dqc.a("btnOK");
                    throw null;
                }
            }
            return dmg.a;
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        dqc.d(str, "jsonResponse");
        if (i == this.e) {
            try {
                djl.a(this).d(this.o, this.u, this.x);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i != this.f) {
        } else {
            OTPView oTPView = this.n;
            if (oTPView == null) {
                dqc.a("otpView");
                throw null;
            }
            String stringFromFields = oTPView.getStringFromFields();
            int length = stringFromFields.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = dqc.a(stringFromFields.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i2++;
                }
            }
            String obj = stringFromFields.subSequence(i2, length + 1).toString();
            if (TextUtils.isEmpty(obj)) {
                return;
            }
            try {
                a().a(this, getString(R.string.loading));
                djl.a(this).b(obj, this.o, "add", this.r, this.s);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ucare/we/confirmswitchingaccount/ConfirmSwitchingAccountActivity$smsVerificationReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends BroadcastReceiver {
        c() {
            ConfirmSwitchingAccountActivity.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            dqc.d(context, "context");
            dqc.d(intent, "intent");
            if (dqc.a((Object) "com.google.android.gms.auth.api.phone.SMS_RETRIEVED", (Object) intent.getAction())) {
                Bundle extras = intent.getExtras();
                Intent intent2 = null;
                Status status = (Status) (extras == null ? null : extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS"));
                Integer valueOf = status == null ? null : Integer.valueOf(status.i);
                if (valueOf == null || valueOf.intValue() != 0) {
                    if (valueOf == null) {
                        return;
                    }
                    valueOf.intValue();
                    return;
                }
                if (ConfirmSwitchingAccountActivity.this.getCallingActivity() != null) {
                    ComponentName callingActivity = ConfirmSwitchingAccountActivity.this.getCallingActivity();
                    if (!dqc.a((Object) (callingActivity == null ? null : callingActivity.getPackageName()), (Object) "com.ucare.we")) {
                        return;
                    }
                }
                if (extras != null) {
                    intent2 = (Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                }
                try {
                    ConfirmSwitchingAccountActivity.this.startActivityForResult(intent2, 499);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 499 && i2 == -1) {
            String stringExtra = intent == null ? null : intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            String str = "";
            if (stringExtra != null) {
                String a2 = new dsf("[^0-9]").a(stringExtra, str);
                if (a2 != null) {
                    str = a2;
                }
            }
            OTPView oTPView = this.n;
            if (oTPView == null) {
                dqc.a("otpView");
                throw null;
            }
            oTPView.setText(str);
            Button button = this.k;
            if (button == null) {
                dqc.a("btnOK");
                throw null;
            }
            button.setEnabled(true);
            Button button2 = this.k;
            if (button2 == null) {
                dqc.a("btnOK");
                throw null;
            }
            button2.setAlpha(1.0f);
            Button button3 = this.k;
            if (button3 != null) {
                button3.post(new Runnable() { // from class: com.ucare.we.confirmswitchingaccount.-$$Lambda$ConfirmSwitchingAccountActivity$VyjM0Ib6OHTaVeb6q1XTsz9nyCs
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConfirmSwitchingAccountActivity.lambda$VyjM0Ib6OHTaVeb6q1XTsz9nyCs(ConfirmSwitchingAccountActivity.this);
                    }
                });
            } else {
                dqc.a("btnOK");
                throw null;
            }
        }
    }

    public static final void a(bwl bwlVar) {
        Exception a2;
        dqc.d(bwlVar, "listener");
        if (bwlVar.e() || (a2 = bwlVar.a()) == null) {
            return;
        }
        a2.printStackTrace();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        registerReceiver(this.z, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
        bwl<Void> a2 = tf.a((Activity) this).a();
        dqc.b(a2, "getClient(this).startSmsUserConsent(null)");
        a2.a($$Lambda$ConfirmSwitchingAccountActivity$zf6glS4VBPfs3EhFePJuTgeZFVc.INSTANCE);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.z);
    }

    public static final void b(ConfirmSwitchingAccountActivity confirmSwitchingAccountActivity) {
        dqc.d(confirmSwitchingAccountActivity, "this$0");
        Button button = confirmSwitchingAccountActivity.k;
        if (button != null) {
            button.performClick();
        } else {
            dqc.a("btnOK");
            throw null;
        }
    }
}
