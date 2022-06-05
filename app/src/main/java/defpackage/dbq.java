package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ucare.we.HelpAndSupport_Activity;
import com.ucare.we.NewRequestActivity;
import com.ucare.we.R;
import com.ucare.we.RequestDeviceActivity;
import com.ucare.we.RequestRouterUserNamePasswordActivity;
import com.ucare.we.SettingActivity;
import com.ucare.we.SocialMediaActivity;
import com.ucare.we.StoreLocatorActivity;
import com.ucare.we.SuspendAndResumeActivity;
import com.ucare.we.billlimit.BillLimitActivity;
import com.ucare.we.chatwithus.ChatWithUsActivity;
import com.ucare.we.familynumber.FamilyNumberActivity;
import com.ucare.we.preferrednumber.PreferedNumberActivity;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import com.ucare.we.presentation.deactivatefbb.DeactivationConfirmationActivity;
import com.ucare.we.presentation.inbox.NotificationInboxActivity;
import com.ucare.we.presentation.offers.OffersAndExtraActivity;
import com.ucare.we.presentation.profile.myaccount.MyAccountActivity;
import com.ucare.we.presentation.ussdddetails.USSDDetails;
import com.ucare.we.presentation.wepay.WePayActivity;
import defpackage.dgp;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0088\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010t\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010wH\u0002J\u0010\u0010x\u001a\u00020u2\u0006\u0010y\u001a\u00020zH\u0016J\u0012\u0010{\u001a\u00020u2\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J)\u0010~\u001a\u0004\u0018\u00010w2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u00012\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J\u001e\u0010\u0083\u0001\u001a\u00020u2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020zH\u0016J\u0012\u0010\u0087\u0001\u001a\u00020u2\u0007\u0010\u0086\u0001\u001a\u00020zH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR\u001a\u00102\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\nR\u001a\u00105\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR\u001a\u00108\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u001c\u0010D\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R\u001c\u0010G\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010>\"\u0004\bI\u0010@R\u001c\u0010J\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\u001c\u0010M\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010>\"\u0004\bO\u0010@R\u001c\u0010P\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010@R\u001a\u0010S\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\b\"\u0004\bU\u0010\nR\u001a\u0010V\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\b\"\u0004\bX\u0010\nR\u001a\u0010Y\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\b\"\u0004\b[\u0010\nR\u001a\u0010\\\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\b\"\u0004\b^\u0010\nR\u001e\u0010_\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\b\"\u0004\bg\u0010\nR\u001a\u0010h\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\b\"\u0004\bj\u0010\nR\u001a\u0010k\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\b\"\u0004\bm\u0010\nR\u001a\u0010n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\b\"\u0004\bp\u0010\nR\u001a\u0010q\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\b\"\u0004\bs\u0010\n¨\u0006\u0089\u0001"}, d2 = {"Lcom/ucare/we/newHome/features/anonymousUserMoreFragment;", "Lcom/ucare/we/injection/BaseFragment;", "Lcom/ucare/we/util/onSessionExpired;", "Lcom/ucare/we/presentation/profile/postpaidprofile/SelectLanguageBottomSheet$IBottomSheetListener;", "()V", "FollowClickListener", "Landroid/view/View$OnClickListener;", "getFollowClickListener", "()Landroid/view/View$OnClickListener;", "setFollowClickListener", "(Landroid/view/View$OnClickListener;)V", "USSDCodeClickListener", "getUSSDCodeClickListener", "setUSSDCodeClickListener", "activityLauncher", "Lcom/ucare/we/view/ActivityLauncher;", "getActivityLauncher", "()Lcom/ucare/we/view/ActivityLauncher;", "setActivityLauncher", "(Lcom/ucare/we/view/ActivityLauncher;)V", "appSettingsClickListener", "getAppSettingsClickListener", "setAppSettingsClickListener", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "billConsumptionClickListener", "getBillConsumptionClickListener", "setBillConsumptionClickListener", "btn_signin", "Landroid/widget/Button;", "getBtn_signin", "()Landroid/widget/Button;", "setBtn_signin", "(Landroid/widget/Button;)V", "chatBot", "getChatBot", "setChatBot", "corporatePermissionProvider", "Lcom/ucare/we/provider/CorporatePermissionProvider;", "getCorporatePermissionProvider", "()Lcom/ucare/we/provider/CorporatePermissionProvider;", "setCorporatePermissionProvider", "(Lcom/ucare/we/provider/CorporatePermissionProvider;)V", "deactivatingClickListener", "getDeactivatingClickListener", "setDeactivatingClickListener", "fAQClickListener", "getFAQClickListener", "setFAQClickListener", "icSuspendReactivateServiceListener", "getIcSuspendReactivateServiceListener", "setIcSuspendReactivateServiceListener", "inboxClickListener", "getInboxClickListener", "setInboxClickListener", "llFollowUs", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getLlFollowUs", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "setLlFollowUs", "(Landroidx/appcompat/widget/LinearLayoutCompat;)V", "llMoreAppSettings", "getLlMoreAppSettings", "setLlMoreAppSettings", "llMoreHelpSupport", "getLlMoreHelpSupport", "setLlMoreHelpSupport", "llMoreStoreLocator", "getLlMoreStoreLocator", "setLlMoreStoreLocator", "llOpenMyAccount", "getLlOpenMyAccount", "setLlOpenMyAccount", "llUseFullCode", "getLlUseFullCode", "setLlUseFullCode", "llWePay", "getLlWePay", "setLlWePay", "logoutClickListener", "getLogoutClickListener", "setLogoutClickListener", "newRequestListener", "getNewRequestListener", "setNewRequestListener", "offerAndExtrasListener", "getOfferAndExtrasListener", "setOfferAndExtrasListener", "preferredNumbersClickListener", "getPreferredNumbersClickListener", "setPreferredNumbersClickListener", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "requestDeviceListener", "getRequestDeviceListener", "setRequestDeviceListener", "requestUserNameAndPasswordListener", "getRequestUserNameAndPasswordListener", "setRequestUserNameAndPasswordListener", "storeLocatorListener", "getStoreLocatorListener", "setStoreLocatorListener", "txtFamilyNumbersClickListener", "getTxtFamilyNumbersClickListener", "setTxtFamilyNumbersClickListener", "wePayListener", "getWePayListener", "setWePayListener", "initViews", "", "view", "Landroid/view/View;", "onButtonClickListener", "buttonId", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoginResponse", "jsonResponse", "", "which", "startLogin", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dbq */
/* loaded from: classes2.dex */
public final class dbq extends dab implements dgp.a, dju {
    public static final a a = new a((byte) 0);
    @Inject
    public dhp b;
    @Inject
    public djx c;
    @Inject
    public djw d;
    @Inject
    public dio e;
    private LinearLayoutCompat f;
    private LinearLayoutCompat g;
    private LinearLayoutCompat h;
    private LinearLayoutCompat i;
    private LinearLayoutCompat j;
    private LinearLayoutCompat k;
    private LinearLayoutCompat l;
    private Button m;
    private View.OnClickListener n = new View.OnClickListener() { // from class: -$$Lambda$dbq$vri00GTdskYyCzLnUOMU3d9myMA
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$vri00GTdskYyCzLnUOMU3d9myMA(dbq.this, view);
        }
    };
    private View.OnClickListener o = new View.OnClickListener() { // from class: -$$Lambda$dbq$4OxrB2kRM_g0hPvNlDihTC0o9UU
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$4OxrB2kRM_g0hPvNlDihTC0o9UU(dbq.this, view);
        }
    };
    private View.OnClickListener p = new View.OnClickListener() { // from class: -$$Lambda$dbq$3qznAp-pkG4qnzphtujbMzVrDAs
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.m91lambda$3qznAppkG4qnzphtujbMzVrDAs(dbq.this, view);
        }
    };
    private View.OnClickListener q = new View.OnClickListener() { // from class: -$$Lambda$dbq$0Leb8Jp4SCerEMUtDNXQa9rhC_E
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$0Leb8Jp4SCerEMUtDNXQa9rhC_E(dbq.this, view);
        }
    };
    private View.OnClickListener r = new View.OnClickListener() { // from class: -$$Lambda$dbq$P8h06klwNF4P0chbDDJjn4Qwljg
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$P8h06klwNF4P0chbDDJjn4Qwljg(dbq.this, view);
        }
    };
    private View.OnClickListener s = new View.OnClickListener() { // from class: -$$Lambda$dbq$WcUBQe5zZYiFH_tE2AtwJwBoSK8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$WcUBQe5zZYiFH_tE2AtwJwBoSK8(dbq.this, view);
        }
    };
    private View.OnClickListener t = new View.OnClickListener() { // from class: -$$Lambda$dbq$zEzWR6NlAXu9Vy3MM5TEaap4mXE
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$zEzWR6NlAXu9Vy3MM5TEaap4mXE(dbq.this, view);
        }
    };
    private View.OnClickListener u = new View.OnClickListener() { // from class: -$$Lambda$dbq$LR7PogWqv6AjX6aecozJ2Zk-L5c
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.m94lambda$LR7PogWqv6AjX6aecozJ2ZkL5c(dbq.this, view);
        }
    };
    private View.OnClickListener v = new View.OnClickListener() { // from class: -$$Lambda$dbq$rZnC-ftKBpTVVH46P5uJz-7jNdo
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.m98lambda$rZnCftKBpTVVH46P5uJz7jNdo(dbq.this, view);
        }
    };
    private View.OnClickListener w = new View.OnClickListener() { // from class: -$$Lambda$dbq$K3QF49Z91RNHoqjEf--DzGpa7XY
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.m93lambda$K3QF49Z91RNHoqjEfDzGpa7XY(dbq.this, view);
        }
    };
    private View.OnClickListener x = new View.OnClickListener() { // from class: -$$Lambda$dbq$mtvO1A3W4jc17mvqd-J8K3LfAtg
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.m96lambda$mtvO1A3W4jc17mvqdJ8K3LfAtg(dbq.this, view);
        }
    };
    private View.OnClickListener y = new View.OnClickListener() { // from class: -$$Lambda$dbq$6C6ai_14UZvBP3NyzCs980bAPGQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$6C6ai_14UZvBP3NyzCs980bAPGQ(dbq.this, view);
        }
    };
    private View.OnClickListener z = new View.OnClickListener() { // from class: -$$Lambda$dbq$pBmbwvb3_4d_2I9wlRlO595HH4o
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$pBmbwvb3_4d_2I9wlRlO595HH4o(dbq.this, view);
        }
    };
    private View.OnClickListener A = new View.OnClickListener() { // from class: -$$Lambda$dbq$FJ_A42ThZnvrvM3n70vlEM42mqQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$FJ_A42ThZnvrvM3n70vlEM42mqQ(dbq.this, view);
        }
    };
    private View.OnClickListener B = new View.OnClickListener() { // from class: -$$Lambda$dbq$N-zKVUdAh313V56y7vQfBvhEsbw
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.m95lambda$NzKVUdAh313V56y7vQfBvhEsbw(dbq.this, view);
        }
    };
    private View.OnClickListener C = new View.OnClickListener() { // from class: -$$Lambda$dbq$gVduNBT0iMDoENW87LB8qp1HwHg
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$gVduNBT0iMDoENW87LB8qp1HwHg(dbq.this, view);
        }
    };
    private View.OnClickListener D = new View.OnClickListener() { // from class: -$$Lambda$dbq$GXek-27nL7qE5FPeradb_kC_p1o
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.m92lambda$GXek27nL7qE5FPeradb_kC_p1o(dbq.this, view);
        }
    };
    private View.OnClickListener E = new View.OnClickListener() { // from class: -$$Lambda$dbq$sLV82ODbo8luAvTKCZgBcUS4b8w
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbq.lambda$sLV82ODbo8luAvTKCZgBcUS4b8w(dbq.this, view);
        }
    };

    public static /* synthetic */ void lambda$0Leb8Jp4SCerEMUtDNXQa9rhC_E(dbq dbqVar, View view) {
        f(dbqVar, view);
    }

    /* renamed from: lambda$3qznAp-pkG4qnzphtujbMzVrDAs */
    public static /* synthetic */ void m91lambda$3qznAppkG4qnzphtujbMzVrDAs(dbq dbqVar, View view) {
        e(dbqVar, view);
    }

    public static /* synthetic */ void lambda$4OxrB2kRM_g0hPvNlDihTC0o9UU(dbq dbqVar, View view) {
        d(dbqVar, view);
    }

    public static /* synthetic */ void lambda$6C6ai_14UZvBP3NyzCs980bAPGQ(dbq dbqVar, View view) {
        n(dbqVar, view);
    }

    public static /* synthetic */ void lambda$FJ_A42ThZnvrvM3n70vlEM42mqQ(dbq dbqVar, View view) {
        p(dbqVar, view);
    }

    /* renamed from: lambda$GXek-27nL7qE5FPeradb_kC_p1o */
    public static /* synthetic */ void m92lambda$GXek27nL7qE5FPeradb_kC_p1o(dbq dbqVar, View view) {
        s(dbqVar, view);
    }

    /* renamed from: lambda$K3QF49Z91RNHoqjEf--DzGpa7XY */
    public static /* synthetic */ void m93lambda$K3QF49Z91RNHoqjEfDzGpa7XY(dbq dbqVar, View view) {
        l(dbqVar, view);
    }

    /* renamed from: lambda$LR7PogWqv6AjX6aecozJ2Zk-L5c */
    public static /* synthetic */ void m94lambda$LR7PogWqv6AjX6aecozJ2ZkL5c(dbq dbqVar, View view) {
        j(dbqVar, view);
    }

    /* renamed from: lambda$N-zKVUdAh313V56y7vQfBvhEsbw */
    public static /* synthetic */ void m95lambda$NzKVUdAh313V56y7vQfBvhEsbw(dbq dbqVar, View view) {
        q(dbqVar, view);
    }

    public static /* synthetic */ void lambda$P8h06klwNF4P0chbDDJjn4Qwljg(dbq dbqVar, View view) {
        g(dbqVar, view);
    }

    public static /* synthetic */ void lambda$WcUBQe5zZYiFH_tE2AtwJwBoSK8(dbq dbqVar, View view) {
        h(dbqVar, view);
    }

    public static /* synthetic */ void lambda$gVduNBT0iMDoENW87LB8qp1HwHg(dbq dbqVar, View view) {
        r(dbqVar, view);
    }

    /* renamed from: lambda$mtvO1A3W4jc17mvqd-J8K3LfAtg */
    public static /* synthetic */ void m96lambda$mtvO1A3W4jc17mvqdJ8K3LfAtg(dbq dbqVar, View view) {
        m(dbqVar, view);
    }

    /* renamed from: lambda$nEpLS-YlI1EAEIrgtvl01ns9FEc */
    public static /* synthetic */ void m97lambda$nEpLSYlI1EAEIrgtvl01ns9FEc(dbq dbqVar, View view) {
        b(dbqVar, view);
    }

    public static /* synthetic */ void lambda$pBmbwvb3_4d_2I9wlRlO595HH4o(dbq dbqVar, View view) {
        o(dbqVar, view);
    }

    /* renamed from: lambda$rZnC-ftKBpTVVH46P5uJz-7jNdo */
    public static /* synthetic */ void m98lambda$rZnCftKBpTVVH46P5uJz7jNdo(dbq dbqVar, View view) {
        k(dbqVar, view);
    }

    public static /* synthetic */ void lambda$sCLTT_Y6vaGRajCRpvIGPo2JprE(dbq dbqVar, View view) {
        a(dbqVar, view);
    }

    public static /* synthetic */ void lambda$sLV82ODbo8luAvTKCZgBcUS4b8w(dbq dbqVar, View view) {
        t(dbqVar, view);
    }

    public static /* synthetic */ void lambda$vri00GTdskYyCzLnUOMU3d9myMA(dbq dbqVar, View view) {
        c(dbqVar, view);
    }

    public static /* synthetic */ void lambda$zEzWR6NlAXu9Vy3MM5TEaap4mXE(dbq dbqVar, View view) {
        i(dbqVar, view);
    }

    private djx a() {
        djx djxVar = this.c;
        if (djxVar != null) {
            return djxVar;
        }
        dqc.a("activityLauncher");
        throw null;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dqc.d(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.anonymous_more_fragment, viewGroup, false);
        TextView textView = null;
        this.l = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llMoreStoreLocator);
        this.g = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llWePay);
        this.m = inflate == null ? null : (Button) inflate.findViewById(R.id.btn_sign_in);
        this.h = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llMoreHelpSupport);
        this.i = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llUseFullCode);
        this.j = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llFollowUs);
        this.k = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llMoreAppSettings);
        this.f = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llOpenMyAccount);
        if (inflate != null) {
            textView = (TextView) inflate.findViewById(R.id.tvContactNumber);
        }
        if (textView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        LinearLayoutCompat linearLayoutCompat = this.f;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dbq$sCLTT_Y6vaGRajCRpvIGPo2JprE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dbq.lambda$sCLTT_Y6vaGRajCRpvIGPo2JprE(dbq.this, view);
                }
            });
        }
        Button button = this.m;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dbq$nEpLS-YlI1EAEIrgtvl01ns9FEc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dbq.m97lambda$nEpLSYlI1EAEIrgtvl01ns9FEc(dbq.this, view);
                }
            });
        }
        LinearLayoutCompat linearLayoutCompat2 = this.i;
        if (linearLayoutCompat2 != null) {
            linearLayoutCompat2.setOnClickListener(this.o);
        }
        LinearLayoutCompat linearLayoutCompat3 = this.g;
        if (linearLayoutCompat3 != null) {
            linearLayoutCompat3.setOnClickListener(this.q);
        }
        LinearLayoutCompat linearLayoutCompat4 = this.h;
        if (linearLayoutCompat4 != null) {
            linearLayoutCompat4.setOnClickListener(this.r);
        }
        LinearLayoutCompat linearLayoutCompat5 = this.j;
        if (linearLayoutCompat5 != null) {
            linearLayoutCompat5.setOnClickListener(this.t);
        }
        LinearLayoutCompat linearLayoutCompat6 = this.k;
        if (linearLayoutCompat6 != null) {
            linearLayoutCompat6.setOnClickListener(this.u);
        }
        LinearLayoutCompat linearLayoutCompat7 = this.l;
        if (linearLayoutCompat7 != null) {
            linearLayoutCompat7.setOnClickListener(this.C);
        }
        return inflate;
    }

    public static final void a(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), MyAccountActivity.class);
    }

    public static final void b(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), SignInActivity.class);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ucare/we/newHome/features/anonymousUserMoreFragment$Companion;", "", "()V", "newInstance", "Landroidx/fragment/app/Fragment;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dbq$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    public static final void c(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), BillLimitActivity.class);
    }

    public static final void d(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), USSDDetails.class);
    }

    public static final void e(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), ChatWithUsActivity.class);
    }

    public static final void f(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), WePayActivity.class);
    }

    public static final void g(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().a(2, dbqVar.getActivity(), HelpAndSupport_Activity.class);
    }

    public static final void h(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), FamilyNumberActivity.class);
    }

    public static final void i(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), SocialMediaActivity.class);
    }

    public static final void j(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), SettingActivity.class);
    }

    public static final void k(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), NotificationInboxActivity.class);
    }

    public static final void l(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), SuspendAndResumeActivity.class);
    }

    public static final void m(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), RequestDeviceActivity.class);
    }

    public static final void n(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), RequestRouterUserNamePasswordActivity.class);
    }

    public static final void o(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), NewRequestActivity.class);
    }

    public static final void p(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), PreferedNumberActivity.class);
    }

    public static final void q(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), OffersAndExtraActivity.class);
    }

    public static final void r(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dbqVar.a().b(dbqVar.getActivity(), StoreLocatorActivity.class);
    }

    public static final void t(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        DeactivationConfirmationActivity.a aVar = DeactivationConfirmationActivity.a;
        DeactivationConfirmationActivity.a.a(dbqVar.getContext());
    }

    @Override // defpackage.dju
    public final void b(int i) {
        throw new dlz("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        throw new dlz("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // defpackage.dgp.a
    public final void a(int i) {
        throw new dlz("An operation is not implemented: ".concat("Not yet implemented"));
    }

    public static final void s(dbq dbqVar, View view) {
        dqc.d(dbqVar, "this$0");
        dio dioVar = dbqVar.e;
        if (dioVar == null) {
            dqc.a("authenticationProvider");
            throw null;
        } else if (dioVar == null) {
        } else {
            dioVar.a(dbqVar.getActivity());
        }
    }
}
