package com.ucare.we.presentation.offers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.R;
import com.ucare.we.presentation.family.groupinfo.managemembers.ManageMembersActivity;
import com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 U2\u00020\u0001:\u0001UB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020OH\u0002J\u0012\u0010Q\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010SH\u0014J\b\u0010T\u001a\u00020OH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u001a\u0010:\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00105\"\u0004\bD\u00107R\u001a\u0010E\u001a\u00020FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010H\"\u0004\bM\u0010J¨\u0006V"}, d2 = {"Lcom/ucare/we/presentation/offers/UnNavigateResponseActivityFamily;", "Lcom/ucare/we/injection/TransparentActivity;", "()V", "Message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "MessageDetails", "getMessageDetails", "setMessageDetails", "activityLauncher", "Lcom/ucare/we/view/ActivityLauncher;", "getActivityLauncher", "()Lcom/ucare/we/view/ActivityLauncher;", "setActivityLauncher", "(Lcom/ucare/we/view/ActivityLauncher;)V", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "btnAddMemeber", "Landroid/widget/Button;", "getBtnAddMemeber", "()Landroid/widget/Button;", "setBtnAddMemeber", "(Landroid/widget/Button;)V", "btnManageMember", "getBtnManageMember", "setBtnManageMember", "btnOk", "getBtnOk", "setBtnOk", "btnRecharge", "getBtnRecharge", "setBtnRecharge", "configurationProvider", "Lcom/ucare/we/provider/ConfigurationProvider;", "getConfigurationProvider", "()Lcom/ucare/we/provider/ConfigurationProvider;", "setConfigurationProvider", "(Lcom/ucare/we/provider/ConfigurationProvider;)V", "imgStatus", "Landroid/widget/ImageView;", "getImgStatus", "()Landroid/widget/ImageView;", "setImgStatus", "(Landroid/widget/ImageView;)V", "isError", "", "()Z", "setError", "(Z)V", "isShowingAddMember", "setShowingAddMember", "isShowingGroup", "setShowingGroup", "permissionProvider", "Lcom/ucare/we/presentation/paybillnumbertype/PermissionProvider;", "getPermissionProvider", "()Lcom/ucare/we/presentation/paybillnumbertype/PermissionProvider;", "setPermissionProvider", "(Lcom/ucare/we/presentation/paybillnumbertype/PermissionProvider;)V", "showRecharge", "getShowRecharge", "setShowRecharge", "txtMessage", "Landroid/widget/TextView;", "getTxtMessage", "()Landroid/widget/TextView;", "setTxtMessage", "(Landroid/widget/TextView;)V", "txtMessageDetail", "getTxtMessageDetail", "setTxtMessageDetail", "getExtras", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setData", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UnNavigateResponseActivityFamily extends dae {
    public static final a a = new a((byte) 0);
    @Inject
    public djx b;
    @Inject
    public dhn c;
    @Inject
    public dgc d;
    public Button e;
    public Button f;
    public Button g;
    public TextView h;
    public TextView i;
    public Button j;
    public ImageView k;
    @Inject
    public dio l;
    private String m = "";
    private String n = "";
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;

    public static /* synthetic */ void lambda$CwdcV6iFNWAlEmm52wvkHJixHQk(UnNavigateResponseActivityFamily unNavigateResponseActivityFamily, View view) {
        d(unNavigateResponseActivityFamily, view);
    }

    public static /* synthetic */ void lambda$GKHzUVeHzZA2YIMVZ3XaiOoCmLA(UnNavigateResponseActivityFamily unNavigateResponseActivityFamily, View view) {
        c(unNavigateResponseActivityFamily, view);
    }

    public static /* synthetic */ void lambda$TfaZkDQiHXJyt7hjMhYaGLdklxY(UnNavigateResponseActivityFamily unNavigateResponseActivityFamily, View view) {
        a(unNavigateResponseActivityFamily, view);
    }

    public static /* synthetic */ void lambda$h7ipbxje6aIZ3lIv3gO6vjzi3pU(UnNavigateResponseActivityFamily unNavigateResponseActivityFamily, View view) {
        b(unNavigateResponseActivityFamily, view);
    }

    private Button a() {
        Button button = this.e;
        if (button != null) {
            return button;
        }
        dqc.a("btnOk");
        throw null;
    }

    private Button b() {
        Button button = this.f;
        if (button != null) {
            return button;
        }
        dqc.a("btnAddMemeber");
        throw null;
    }

    private Button c() {
        Button button = this.g;
        if (button != null) {
            return button;
        }
        dqc.a("btnRecharge");
        throw null;
    }

    private TextView d() {
        TextView textView = this.i;
        if (textView != null) {
            return textView;
        }
        dqc.a("txtMessageDetail");
        throw null;
    }

    private Button e() {
        Button button = this.j;
        if (button != null) {
            return button;
        }
        dqc.a("btnManageMember");
        throw null;
    }

    private ImageView f() {
        ImageView imageView = this.k;
        if (imageView != null) {
            return imageView;
        }
        dqc.a("imgStatus");
        throw null;
    }

    private dio g() {
        dio dioVar = this.l;
        if (dioVar != null) {
            return dioVar;
        }
        dqc.a("authenticationProvider");
        throw null;
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.activity_voucher_success_popup);
        View findViewById = findViewById(R.id.btn_done_transfer);
        dqc.b(findViewById, "findViewById(R.id.btn_done_transfer)");
        Button button = (Button) findViewById;
        dqc.d(button, "<set-?>");
        this.e = button;
        View findViewById2 = findViewById(R.id.btn_recharge_payment);
        dqc.b(findViewById2, "findViewById(R.id.btn_recharge_payment)");
        Button button2 = (Button) findViewById2;
        dqc.d(button2, "<set-?>");
        this.g = button2;
        View findViewById3 = findViewById(R.id.btnAddMemeber);
        dqc.b(findViewById3, "findViewById(R.id.btnAddMemeber)");
        Button button3 = (Button) findViewById3;
        dqc.d(button3, "<set-?>");
        this.f = button3;
        View findViewById4 = findViewById(R.id.txtMessage);
        dqc.b(findViewById4, "findViewById(R.id.txtMessage)");
        TextView textView = (TextView) findViewById4;
        dqc.d(textView, "<set-?>");
        this.h = textView;
        View findViewById5 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById5, "findViewById(R.id.txtMessageDetails)");
        TextView textView2 = (TextView) findViewById5;
        dqc.d(textView2, "<set-?>");
        this.i = textView2;
        View findViewById6 = findViewById(R.id.btnManageMember);
        dqc.b(findViewById6, "findViewById(R.id.btnManageMember)");
        Button button4 = (Button) findViewById6;
        dqc.d(button4, "<set-?>");
        this.j = button4;
        View findViewById7 = findViewById(R.id.imgStatus);
        dqc.b(findViewById7, "findViewById(R.id.imgStatus)");
        ImageView imageView = (ImageView) findViewById7;
        dqc.d(imageView, "<set-?>");
        this.k = imageView;
        d().setVisibility(8);
        findViewById(R.id.container_popup);
        findViewById(R.id.bg_container_popup);
        Bundle extras = getIntent().getExtras();
        String str = "";
        if (extras != null && (string = extras.getString("success_msg")) != null) {
            str = string;
        }
        this.m = str;
        Bundle extras2 = getIntent().getExtras();
        this.r = extras2 == null ? false : extras2.getBoolean("showRecharge");
        Bundle extras3 = getIntent().getExtras();
        Boolean bool = null;
        this.n = extras3 == null ? null : extras3.getString("success_msg_details");
        Bundle extras4 = getIntent().getExtras();
        this.o = extras4 == null ? false : extras4.getBoolean("isError");
        Bundle extras5 = getIntent().getExtras();
        this.p = extras5 == null ? false : extras5.getBoolean("isShowingAddMember");
        Bundle extras6 = getIntent().getExtras();
        this.q = extras6 == null ? false : extras6.getBoolean("removegroup");
        TextView textView3 = this.h;
        if (textView3 != null) {
            textView3.setText(this.m);
            if (this.p) {
                b().setVisibility(0);
            } else {
                b().setVisibility(8);
            }
            if (this.q && this.o) {
                e().setVisibility(0);
            } else {
                e().setVisibility(8);
            }
            if (!this.r) {
                d().setText(this.n);
                d().setVisibility(0);
            }
            if (this.o) {
                f().setImageResource(R.drawable.ic_error_vector);
                c().setVisibility(0);
                a().setText(getString(R.string.popup_cancel));
            } else {
                f().setImageResource(R.drawable.ic_success_vector);
                a().setText(getString(R.string.ok));
            }
            boolean z = true;
            if (!g().g() || !g().h() || !g().d()) {
                z = false;
            }
            if (z) {
                if (this.r) {
                    dgc dgcVar = this.d;
                    if (dgcVar != null) {
                        List<String> errorViewRechargeButton = dgcVar.a().getErrorViewRechargeButton();
                        if (errorViewRechargeButton != null) {
                            bool = Boolean.valueOf(errorViewRechargeButton.contains(n().w()));
                        }
                        if (dqc.a(bool, Boolean.TRUE)) {
                            c().setVisibility(0);
                        }
                    } else {
                        dqc.a("permissionProvider");
                        throw null;
                    }
                }
                c().setVisibility(8);
            } else if (this.r) {
                c().setVisibility(0);
            } else {
                c().setVisibility(8);
            }
            a().setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$UnNavigateResponseActivityFamily$TfaZkDQiHXJyt7hjMhYaGLdklxY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnNavigateResponseActivityFamily.lambda$TfaZkDQiHXJyt7hjMhYaGLdklxY(UnNavigateResponseActivityFamily.this, view);
                }
            });
            e().setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$UnNavigateResponseActivityFamily$h7ipbxje6aIZ3lIv3gO6vjzi3pU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnNavigateResponseActivityFamily.lambda$h7ipbxje6aIZ3lIv3gO6vjzi3pU(UnNavigateResponseActivityFamily.this, view);
                }
            });
            b().setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$UnNavigateResponseActivityFamily$GKHzUVeHzZA2YIMVZ3XaiOoCmLA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnNavigateResponseActivityFamily.lambda$GKHzUVeHzZA2YIMVZ3XaiOoCmLA(UnNavigateResponseActivityFamily.this, view);
                }
            });
            c().setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$UnNavigateResponseActivityFamily$CwdcV6iFNWAlEmm52wvkHJixHQk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnNavigateResponseActivityFamily.lambda$CwdcV6iFNWAlEmm52wvkHJixHQk(UnNavigateResponseActivityFamily.this, view);
                }
            });
            if (dsg.b(n().v(), "postpaid")) {
                c().setVisibility(8);
                c().setText(getString(R.string.pay_bill));
                return;
            }
            c().setText(getString(R.string.recharge));
            return;
        }
        dqc.a("txtMessage");
        throw null;
    }

    public static final void a(UnNavigateResponseActivityFamily unNavigateResponseActivityFamily, View view) {
        dqc.d(unNavigateResponseActivityFamily, "this$0");
        Intent intent = new Intent();
        intent.putExtra("fromAddMemberClick", false);
        unNavigateResponseActivityFamily.setResult(-1, intent);
        unNavigateResponseActivityFamily.finish();
    }

    public static final void b(UnNavigateResponseActivityFamily unNavigateResponseActivityFamily, View view) {
        dqc.d(unNavigateResponseActivityFamily, "this$0");
        Intent intent = new Intent(unNavigateResponseActivityFamily, ManageMembersActivity.class);
        intent.setFlags(536870912);
        unNavigateResponseActivityFamily.startActivity(intent);
        unNavigateResponseActivityFamily.finish();
    }

    public static final void c(UnNavigateResponseActivityFamily unNavigateResponseActivityFamily, View view) {
        dqc.d(unNavigateResponseActivityFamily, "this$0");
        Intent intent = new Intent();
        intent.putExtra("fromAddMemberClick", true);
        unNavigateResponseActivityFamily.setResult(-1, intent);
        unNavigateResponseActivityFamily.finish();
    }

    public static final void d(UnNavigateResponseActivityFamily unNavigateResponseActivityFamily, View view) {
        dqc.d(unNavigateResponseActivityFamily, "this$0");
        if (dsg.b(unNavigateResponseActivityFamily.n().v(), "postpaid")) {
            unNavigateResponseActivityFamily.startActivity(new Intent(unNavigateResponseActivityFamily, PayBillNumberTypeActivity.class));
        } else {
            unNavigateResponseActivityFamily.startActivity(new Intent(unNavigateResponseActivityFamily, BalanceRechargeActivity.class));
        }
        unNavigateResponseActivityFamily.finish();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\bH\u0007J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\bH\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0007JD\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0007¨\u0006\u0013"}, d2 = {"Lcom/ucare/we/presentation/offers/UnNavigateResponseActivityFamily$Companion;", "", "()V", "showToResponse", "", "context", "Landroid/content/Context;", "isShowingAddMember", "", NotificationCompat.CATEGORY_MESSAGE, "", "msgDetails", "isError", "showRecharge", "showToResponseFamily", "Landroidx/appcompat/app/AppCompatActivity;", "activityResultCode", "", "isRemovingGroup", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }
}
