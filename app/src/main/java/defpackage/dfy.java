package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ucare.we.BalanceActivity;
import com.ucare.we.HelpAndSupport_Activity;
import com.ucare.we.NewRequestActivity;
import com.ucare.we.R;
import com.ucare.we.RequestDeviceActivity;
import com.ucare.we.RequestRouterUserNamePasswordActivity;
import com.ucare.we.SettingActivity;
import com.ucare.we.SocialMediaActivity;
import com.ucare.we.StoreLocatorActivity;
import com.ucare.we.SuspendAndResumeActivity;
import com.ucare.we.adslbalanceservices.ADSLBalanceServicesActivity;
import com.ucare.we.billlimit.BillLimitActivity;
import com.ucare.we.billservices.BillServicesActivity;
import com.ucare.we.chatwithus.ChatWithUsActivity;
import com.ucare.we.familynumber.FamilyNumberActivity;
import com.ucare.we.preferrednumber.PreferedNumberActivity;
import com.ucare.we.presentation.deactivatefbb.DeactivationConfirmationActivity;
import com.ucare.we.presentation.fmcuser.FMCMSISDNSelector.FMCMSISDNSelector;
import com.ucare.we.presentation.inbox.NotificationInboxActivity;
import com.ucare.we.presentation.offers.OffersAndExtraActivity;
import com.ucare.we.presentation.profile.myaccount.MyAccountActivity;
import com.ucare.we.presentation.ussdddetails.USSDDetails;
import com.ucare.we.presentation.wepay.WePayActivity;
import defpackage.dgp;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 Å\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Å\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u00ad\u0001\u001a\u00030®\u0001J\u0016\u0010¯\u0001\u001a\u00030®\u00012\n\u0010°\u0001\u001a\u0005\u0018\u00010±\u0001H\u0002J(\u0010²\u0001\u001a\u00030®\u00012\u0007\u0010³\u0001\u001a\u00020\f2\u0007\u0010´\u0001\u001a\u00020\f2\n\u0010µ\u0001\u001a\u0005\u0018\u00010¶\u0001H\u0016J\u0013\u0010·\u0001\u001a\u00030®\u00012\u0007\u0010¸\u0001\u001a\u00020\fH\u0016J.\u0010¹\u0001\u001a\u0005\u0018\u00010±\u00012\b\u0010º\u0001\u001a\u00030»\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010½\u00012\n\u0010¾\u0001\u001a\u0005\u0018\u00010¿\u0001H\u0016J\u001f\u0010À\u0001\u001a\u00030®\u00012\n\u0010Á\u0001\u001a\u0005\u0018\u00010Â\u00012\u0007\u0010Ã\u0001\u001a\u00020\fH\u0016J\u0013\u0010Ä\u0001\u001a\u00030®\u00012\u0007\u0010Ã\u0001\u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u001a\u0010&\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\u001a\u0010)\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR\u001a\u0010;\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\b\"\u0004\b=\u0010\nR\u001a\u0010>\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\b\"\u0004\b@\u0010\nR\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\nR\u001c\u0010J\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010P\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\u001c\u0010S\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR\u001c\u0010V\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR\u001c\u0010Y\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010OR\u001c\u0010\\\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010M\"\u0004\b^\u0010OR\u001c\u0010_\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010M\"\u0004\ba\u0010OR\u001c\u0010b\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010M\"\u0004\bd\u0010OR\u001c\u0010e\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010M\"\u0004\bg\u0010OR\u001c\u0010h\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010M\"\u0004\bj\u0010OR\u001c\u0010k\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010M\"\u0004\bm\u0010OR\u001c\u0010n\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010M\"\u0004\bp\u0010OR\u001c\u0010q\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010M\"\u0004\bs\u0010OR\u001c\u0010t\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010M\"\u0004\bv\u0010OR\u001c\u0010w\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010M\"\u0004\by\u0010OR\u001c\u0010z\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010M\"\u0004\b|\u0010OR\u001c\u0010}\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010M\"\u0004\b\u007f\u0010OR\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010M\"\u0005\b\u0082\u0001\u0010OR\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010M\"\u0005\b\u0085\u0001\u0010OR\u001d\u0010\u0086\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\b\"\u0005\b\u0088\u0001\u0010\nR\u001d\u0010\u0089\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\b\"\u0005\b\u008b\u0001\u0010\nR\u001d\u0010\u008c\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\b\"\u0005\b\u008e\u0001\u0010\nR\u001d\u0010\u008f\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\b\"\u0005\b\u0091\u0001\u0010\nR$\u0010\u0092\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001d\u0010\u0098\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010\b\"\u0005\b\u009a\u0001\u0010\nR\u001d\u0010\u009b\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010\b\"\u0005\b\u009d\u0001\u0010\nR\u001d\u0010\u009e\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010\b\"\u0005\b \u0001\u0010\nR\"\u0010¡\u0001\u001a\u0005\u0018\u00010¢\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u001d\u0010§\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010\b\"\u0005\b©\u0001\u0010\nR\u001d\u0010ª\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010\b\"\u0005\b¬\u0001\u0010\n¨\u0006Æ\u0001"}, d2 = {"Lcom/ucare/we/presentation/more/MoreFragment;", "Lcom/ucare/we/injection/BaseFragment;", "Lcom/ucare/we/util/onSessionExpired;", "Lcom/ucare/we/presentation/profile/postpaidprofile/SelectLanguageBottomSheet$IBottomSheetListener;", "()V", "FollowClickListener", "Landroid/view/View$OnClickListener;", "getFollowClickListener", "()Landroid/view/View$OnClickListener;", "setFollowClickListener", "(Landroid/view/View$OnClickListener;)V", "PREFERRED_NUMBER_FMC", "", "getPREFERRED_NUMBER_FMC", "()I", "REQUEST_USERNAME_AND_PASSWORD_FMC", "getREQUEST_USERNAME_AND_PASSWORD_FMC", "USSDCodeClickListener", "getUSSDCodeClickListener", "setUSSDCodeClickListener", "activityLauncher", "Lcom/ucare/we/view/ActivityLauncher;", "getActivityLauncher", "()Lcom/ucare/we/view/ActivityLauncher;", "setActivityLauncher", "(Lcom/ucare/we/view/ActivityLauncher;)V", "appSettingsClickListener", "getAppSettingsClickListener", "setAppSettingsClickListener", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "balanceServicesClickListener", "getBalanceServicesClickListener", "setBalanceServicesClickListener", "billConsumptionClickListener", "getBillConsumptionClickListener", "setBillConsumptionClickListener", "chatBot", "getChatBot", "setChatBot", "configurationProvider", "Lcom/ucare/we/provider/ConfigurationProvider;", "getConfigurationProvider", "()Lcom/ucare/we/provider/ConfigurationProvider;", "setConfigurationProvider", "(Lcom/ucare/we/provider/ConfigurationProvider;)V", "corporatePermissionProvider", "Lcom/ucare/we/provider/CorporatePermissionProvider;", "getCorporatePermissionProvider", "()Lcom/ucare/we/provider/CorporatePermissionProvider;", "setCorporatePermissionProvider", "(Lcom/ucare/we/provider/CorporatePermissionProvider;)V", "deactivatingClickListener", "getDeactivatingClickListener", "setDeactivatingClickListener", "fAQClickListener", "getFAQClickListener", "setFAQClickListener", "icSuspendReactivateServiceListener", "getIcSuspendReactivateServiceListener", "setIcSuspendReactivateServiceListener", "iconServices", "Landroid/widget/ImageView;", "getIconServices", "()Landroid/widget/ImageView;", "setIconServices", "(Landroid/widget/ImageView;)V", "inboxClickListener", "getInboxClickListener", "setInboxClickListener", "llBillLimit", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getLlBillLimit", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "setLlBillLimit", "(Landroidx/appcompat/widget/LinearLayoutCompat;)V", "llDeactivateFBB", "getLlDeactivateFBB", "setLlDeactivateFBB", "llFollowUs", "getLlFollowUs", "setLlFollowUs", "llInbox", "getLlInbox", "setLlInbox", "llMoreAppSettings", "getLlMoreAppSettings", "setLlMoreAppSettings", "llMoreBalanceServices", "getLlMoreBalanceServices", "setLlMoreBalanceServices", "llMoreHelpSupport", "getLlMoreHelpSupport", "setLlMoreHelpSupport", "llMoreLogout", "getLlMoreLogout", "setLlMoreLogout", "llMoreServices", "getLlMoreServices", "setLlMoreServices", "llMoreStoreLocator", "getLlMoreStoreLocator", "setLlMoreStoreLocator", "llOpenMyAccount", "getLlOpenMyAccount", "setLlOpenMyAccount", "llPreferredNumbers", "getLlPreferredNumbers", "setLlPreferredNumbers", "llRequestDevice", "getLlRequestDevice", "setLlRequestDevice", "llRequestSubmit", "getLlRequestSubmit", "setLlRequestSubmit", "llSuspendReactivateService", "getLlSuspendReactivateService", "setLlSuspendReactivateService", "llUseFullCode", "getLlUseFullCode", "setLlUseFullCode", "llWePay", "getLlWePay", "setLlWePay", "llofferAndExtras", "getLlofferAndExtras", "setLlofferAndExtras", "llrequestUserNameAndPassword", "getLlrequestUserNameAndPassword", "setLlrequestUserNameAndPassword", "logoutClickListener", "getLogoutClickListener", "setLogoutClickListener", "newRequestListener", "getNewRequestListener", "setNewRequestListener", "offerAndExtrasListener", "getOfferAndExtrasListener", "setOfferAndExtrasListener", "preferredNumbersClickListener", "getPreferredNumbersClickListener", "setPreferredNumbersClickListener", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "requestDeviceListener", "getRequestDeviceListener", "setRequestDeviceListener", "requestUserNameAndPasswordListener", "getRequestUserNameAndPasswordListener", "setRequestUserNameAndPasswordListener", "storeLocatorListener", "getStoreLocatorListener", "setStoreLocatorListener", "tvBalanceBillServices", "Landroid/widget/TextView;", "getTvBalanceBillServices", "()Landroid/widget/TextView;", "setTvBalanceBillServices", "(Landroid/widget/TextView;)V", "txtFamilyNumbersClickListener", "getTxtFamilyNumbersClickListener", "setTxtFamilyNumbersClickListener", "wePayListener", "getWePayListener", "setWePayListener", "featureVisibilityBasedConfig", "", "initViews", "view", "Landroid/view/View;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onButtonClickListener", "buttonId", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLoginResponse", "jsonResponse", "", "which", "startLogin", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dfy */
/* loaded from: classes2.dex */
public final class dfy extends dab implements dgp.a, dju {
    public static final a a = new a((byte) 0);
    private LinearLayoutCompat A;
    private TextView B;
    private ImageView C;
    @Inject
    public dhp b;
    @Inject
    public dhn c;
    @Inject
    public djx d;
    @Inject
    public djw e;
    @Inject
    public dio f;
    private LinearLayoutCompat i;
    private LinearLayoutCompat j;
    private LinearLayoutCompat k;
    private LinearLayoutCompat l;
    private LinearLayoutCompat m;
    private LinearLayoutCompat n;
    private LinearLayoutCompat o;
    private LinearLayoutCompat p;
    private LinearLayoutCompat q;
    private LinearLayoutCompat r;
    private LinearLayoutCompat s;
    private LinearLayoutCompat t;
    private LinearLayoutCompat u;
    private LinearLayoutCompat v;
    private LinearLayoutCompat w;
    private LinearLayoutCompat x;
    private LinearLayoutCompat y;
    private LinearLayoutCompat z;
    private final int g = 90;
    private final int h = 92;
    private View.OnClickListener D = new View.OnClickListener() { // from class: -$$Lambda$dfy$3O3_Ai03UUdY3lM7i100PGCmObU
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$3O3_Ai03UUdY3lM7i100PGCmObU(dfy.this, view);
        }
    };
    private View.OnClickListener E = new View.OnClickListener() { // from class: -$$Lambda$dfy$rHhHFvJdCS0cH0L0ueM2D5CFhms
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$rHhHFvJdCS0cH0L0ueM2D5CFhms(dfy.this, view);
        }
    };
    private View.OnClickListener F = new View.OnClickListener() { // from class: -$$Lambda$dfy$ernKn5PeQhF921-xGwEnATTcY1E
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.m113lambda$ernKn5PeQhF921xGwEnATTcY1E(dfy.this, view);
        }
    };
    private View.OnClickListener G = new View.OnClickListener() { // from class: -$$Lambda$dfy$8I8mvee5Bamzv7Ma1vNazsNLHWY
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$8I8mvee5Bamzv7Ma1vNazsNLHWY(dfy.this, view);
        }
    };
    private View.OnClickListener H = new View.OnClickListener() { // from class: -$$Lambda$dfy$jFXOmS9L1ai23mYhknhQmiTHv_s
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$jFXOmS9L1ai23mYhknhQmiTHv_s(dfy.this, view);
        }
    };
    private View.OnClickListener I = new View.OnClickListener() { // from class: -$$Lambda$dfy$Woti96OKzSbJv-HfAkzylZXZ-z8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.m112lambda$Woti96OKzSbJvHfAkzylZXZz8(dfy.this, view);
        }
    };
    private View.OnClickListener J = new View.OnClickListener() { // from class: -$$Lambda$dfy$x-ed9jic-5ZfAT7LKA3v9q1Rd28
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.m114lambda$xed9jic5ZfAT7LKA3v9q1Rd28(dfy.this, view);
        }
    };
    private View.OnClickListener K = new View.OnClickListener() { // from class: -$$Lambda$dfy$UVngvDdazApI6n4y995rkIOTGA0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$UVngvDdazApI6n4y995rkIOTGA0(dfy.this, view);
        }
    };
    private View.OnClickListener L = new View.OnClickListener() { // from class: -$$Lambda$dfy$hltjOFtyWiLSjQLAuNem63n1Wg4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$hltjOFtyWiLSjQLAuNem63n1Wg4(dfy.this, view);
        }
    };
    private View.OnClickListener M = new View.OnClickListener() { // from class: -$$Lambda$dfy$DsyvsPiCQhuDhlsEN9q9im1Ix5Y
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$DsyvsPiCQhuDhlsEN9q9im1Ix5Y(dfy.this, view);
        }
    };
    private View.OnClickListener N = new View.OnClickListener() { // from class: -$$Lambda$dfy$oqQmcBSNlMdrm1qBmJ6vOfA23TQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$oqQmcBSNlMdrm1qBmJ6vOfA23TQ(dfy.this, view);
        }
    };
    private View.OnClickListener O = new View.OnClickListener() { // from class: -$$Lambda$dfy$G9Zs_HeMSRqPbxvPbsgXEFykxyc
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$G9Zs_HeMSRqPbxvPbsgXEFykxyc(dfy.this, view);
        }
    };
    private View.OnClickListener P = new View.OnClickListener() { // from class: -$$Lambda$dfy$oi79NDkYj0fdurtEN0mCdzw9uXQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$oi79NDkYj0fdurtEN0mCdzw9uXQ(dfy.this, view);
        }
    };
    private View.OnClickListener Q = new View.OnClickListener() { // from class: -$$Lambda$dfy$Rmy2tMy3Zecs7MWzD04hHyPVosU
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$Rmy2tMy3Zecs7MWzD04hHyPVosU(dfy.this, view);
        }
    };
    private View.OnClickListener R = new View.OnClickListener() { // from class: -$$Lambda$dfy$ankTRT_8y8qNzAv7h4nIoirjOUA
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$ankTRT_8y8qNzAv7h4nIoirjOUA(dfy.this, view);
        }
    };
    private View.OnClickListener S = new View.OnClickListener() { // from class: -$$Lambda$dfy$f7rUjvLQHxzYxpkl8JfeLoz524U
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$f7rUjvLQHxzYxpkl8JfeLoz524U(dfy.this, view);
        }
    };
    private View.OnClickListener T = new View.OnClickListener() { // from class: -$$Lambda$dfy$E73RQJXONqrgHKH7Xl1mCf485zs
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$E73RQJXONqrgHKH7Xl1mCf485zs(dfy.this, view);
        }
    };
    private View.OnClickListener U = new View.OnClickListener() { // from class: -$$Lambda$dfy$Pu5mpY_tQLHCIfu7lEg5Z1fSRmU
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$Pu5mpY_tQLHCIfu7lEg5Z1fSRmU(dfy.this, view);
        }
    };
    private View.OnClickListener V = new View.OnClickListener() { // from class: -$$Lambda$dfy$g8lCHh2WYqZSnK5nvOoGx_ZrNjs
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfy.lambda$g8lCHh2WYqZSnK5nvOoGx_ZrNjs(dfy.this, view);
        }
    };

    public static /* synthetic */ void lambda$3O3_Ai03UUdY3lM7i100PGCmObU(dfy dfyVar, View view) {
        b(dfyVar, view);
    }

    public static /* synthetic */ void lambda$8I8mvee5Bamzv7Ma1vNazsNLHWY(dfy dfyVar, View view) {
        e(dfyVar, view);
    }

    public static /* synthetic */ void lambda$DsyvsPiCQhuDhlsEN9q9im1Ix5Y(dfy dfyVar, View view) {
        k(dfyVar, view);
    }

    public static /* synthetic */ void lambda$E73RQJXONqrgHKH7Xl1mCf485zs(dfy dfyVar, View view) {
        r(dfyVar, view);
    }

    public static /* synthetic */ void lambda$G9Zs_HeMSRqPbxvPbsgXEFykxyc(dfy dfyVar, View view) {
        m(dfyVar, view);
    }

    public static /* synthetic */ void lambda$Pu5mpY_tQLHCIfu7lEg5Z1fSRmU(dfy dfyVar, View view) {
        s(dfyVar, view);
    }

    public static /* synthetic */ void lambda$Rmy2tMy3Zecs7MWzD04hHyPVosU(dfy dfyVar, View view) {
        o(dfyVar, view);
    }

    public static /* synthetic */ void lambda$UVngvDdazApI6n4y995rkIOTGA0(dfy dfyVar, View view) {
        i(dfyVar, view);
    }

    public static /* synthetic */ void lambda$WcwPW939vR9nZTqKFz2RWnL5QPY(dfy dfyVar, View view) {
        a(dfyVar, view);
    }

    /* renamed from: lambda$Woti96OKzSbJv-HfAkzylZXZ-z8 */
    public static /* synthetic */ void m112lambda$Woti96OKzSbJvHfAkzylZXZz8(dfy dfyVar, View view) {
        g(dfyVar, view);
    }

    public static /* synthetic */ void lambda$ankTRT_8y8qNzAv7h4nIoirjOUA(dfy dfyVar, View view) {
        p(dfyVar, view);
    }

    /* renamed from: lambda$ernKn5PeQhF921-xGwEnATTcY1E */
    public static /* synthetic */ void m113lambda$ernKn5PeQhF921xGwEnATTcY1E(dfy dfyVar, View view) {
        d(dfyVar, view);
    }

    public static /* synthetic */ void lambda$f7rUjvLQHxzYxpkl8JfeLoz524U(dfy dfyVar, View view) {
        q(dfyVar, view);
    }

    public static /* synthetic */ void lambda$g8lCHh2WYqZSnK5nvOoGx_ZrNjs(dfy dfyVar, View view) {
        t(dfyVar, view);
    }

    public static /* synthetic */ void lambda$hltjOFtyWiLSjQLAuNem63n1Wg4(dfy dfyVar, View view) {
        j(dfyVar, view);
    }

    public static /* synthetic */ void lambda$jFXOmS9L1ai23mYhknhQmiTHv_s(dfy dfyVar, View view) {
        f(dfyVar, view);
    }

    public static /* synthetic */ void lambda$oi79NDkYj0fdurtEN0mCdzw9uXQ(dfy dfyVar, View view) {
        n(dfyVar, view);
    }

    public static /* synthetic */ void lambda$oqQmcBSNlMdrm1qBmJ6vOfA23TQ(dfy dfyVar, View view) {
        l(dfyVar, view);
    }

    public static /* synthetic */ void lambda$rHhHFvJdCS0cH0L0ueM2D5CFhms(dfy dfyVar, View view) {
        c(dfyVar, view);
    }

    /* renamed from: lambda$x-ed9jic-5ZfAT7LKA3v9q1Rd28 */
    public static /* synthetic */ void m114lambda$xed9jic5ZfAT7LKA3v9q1Rd28(dfy dfyVar, View view) {
        h(dfyVar, view);
    }

    private dhp a() {
        dhp dhpVar = this.b;
        if (dhpVar != null) {
            return dhpVar;
        }
        dqc.a("corporatePermissionProvider");
        throw null;
    }

    private dhn b() {
        dhn dhnVar = this.c;
        if (dhnVar != null) {
            return dhnVar;
        }
        dqc.a("configurationProvider");
        throw null;
    }

    private djx c() {
        djx djxVar = this.d;
        if (djxVar != null) {
            return djxVar;
        }
        dqc.a("activityLauncher");
        throw null;
    }

    private djw d() {
        djw djwVar = this.e;
        if (djwVar != null) {
            return djwVar;
        }
        dqc.a("repository");
        throw null;
    }

    private dio e() {
        dio dioVar = this.f;
        if (dioVar != null) {
            return dioVar;
        }
        dqc.a("authenticationProvider");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        LinearLayoutCompat linearLayoutCompat4;
        LinearLayoutCompat linearLayoutCompat5;
        LinearLayoutCompat linearLayoutCompat6;
        dqc.d(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_more, viewGroup, false);
        Boolean bool = null;
        this.j = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llMoreServices);
        this.A = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llMoreBalanceServices);
        this.B = inflate == null ? null : (TextView) inflate.findViewById(R.id.tvBalanceBillServices);
        this.C = inflate == null ? null : (ImageView) inflate.findViewById(R.id.icon_services);
        this.k = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llBillLimit);
        this.l = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llRequestDevice);
        this.m = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llPreferredNumbers);
        this.n = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llSuspendReactivateService);
        this.y = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llrequestUserNameAndPassword);
        this.z = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llMoreStoreLocator);
        this.o = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llofferAndExtras);
        this.p = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llInbox);
        this.q = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llWePay);
        this.r = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llMoreHelpSupport);
        this.s = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llUseFullCode);
        this.t = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llRequestSubmit);
        this.u = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llDeactivateFBB);
        this.v = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llFollowUs);
        this.w = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llMoreAppSettings);
        this.x = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llMoreLogout);
        this.i = inflate == null ? null : (LinearLayoutCompat) inflate.findViewById(R.id.llOpenMyAccount);
        TextView textView = inflate == null ? null : (TextView) inflate.findViewById(R.id.tvContactNumber);
        if (textView != null) {
            LinearLayoutCompat linearLayoutCompat7 = this.i;
            if (linearLayoutCompat7 != null) {
                linearLayoutCompat7.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dfy$WcwPW939vR9nZTqKFz2RWnL5QPY
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dfy.lambda$WcwPW939vR9nZTqKFz2RWnL5QPY(dfy.this, view);
                    }
                });
            }
            String m = d().m();
            if (!(m == null || m.length() == 0)) {
                textView.setText(d().m().toString());
            }
            LinearLayoutCompat linearLayoutCompat8 = this.l;
            if (linearLayoutCompat8 != null) {
                linearLayoutCompat8.setOnClickListener(this.N);
            }
            LinearLayoutCompat linearLayoutCompat9 = this.A;
            if (linearLayoutCompat9 != null) {
                linearLayoutCompat9.setOnClickListener(this.R);
            }
            LinearLayoutCompat linearLayoutCompat10 = this.k;
            if (linearLayoutCompat10 != null) {
                linearLayoutCompat10.setOnClickListener(this.D);
            }
            LinearLayoutCompat linearLayoutCompat11 = this.s;
            if (linearLayoutCompat11 != null) {
                linearLayoutCompat11.setOnClickListener(this.E);
            }
            LinearLayoutCompat linearLayoutCompat12 = this.q;
            if (linearLayoutCompat12 != null) {
                linearLayoutCompat12.setOnClickListener(this.G);
            }
            LinearLayoutCompat linearLayoutCompat13 = this.r;
            if (linearLayoutCompat13 != null) {
                linearLayoutCompat13.setOnClickListener(this.H);
            }
            LinearLayoutCompat linearLayoutCompat14 = this.v;
            if (linearLayoutCompat14 != null) {
                linearLayoutCompat14.setOnClickListener(this.J);
            }
            LinearLayoutCompat linearLayoutCompat15 = this.w;
            if (linearLayoutCompat15 != null) {
                linearLayoutCompat15.setOnClickListener(this.K);
            }
            LinearLayoutCompat linearLayoutCompat16 = this.n;
            if (linearLayoutCompat16 != null) {
                linearLayoutCompat16.setOnClickListener(this.M);
            }
            LinearLayoutCompat linearLayoutCompat17 = this.y;
            if (linearLayoutCompat17 != null) {
                linearLayoutCompat17.setOnClickListener(this.U);
            }
            LinearLayoutCompat linearLayoutCompat18 = this.m;
            if (linearLayoutCompat18 != null) {
                linearLayoutCompat18.setOnClickListener(this.V);
            }
            LinearLayoutCompat linearLayoutCompat19 = this.o;
            if (linearLayoutCompat19 != null) {
                linearLayoutCompat19.setOnClickListener(this.P);
            }
            LinearLayoutCompat linearLayoutCompat20 = this.t;
            if (linearLayoutCompat20 != null) {
                linearLayoutCompat20.setOnClickListener(this.O);
            }
            LinearLayoutCompat linearLayoutCompat21 = this.x;
            if (linearLayoutCompat21 != null) {
                linearLayoutCompat21.setOnClickListener(this.S);
            }
            LinearLayoutCompat linearLayoutCompat22 = this.z;
            if (linearLayoutCompat22 != null) {
                linearLayoutCompat22.setOnClickListener(this.Q);
            }
            LinearLayoutCompat linearLayoutCompat23 = this.u;
            if (linearLayoutCompat23 != null) {
                linearLayoutCompat23.setOnClickListener(this.T);
            }
            if (e().l()) {
                LinearLayoutCompat linearLayoutCompat24 = this.u;
                if (linearLayoutCompat24 != null) {
                    linearLayoutCompat24.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat25 = this.l;
                if (linearLayoutCompat25 != null) {
                    linearLayoutCompat25.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat26 = this.A;
                if (linearLayoutCompat26 != null) {
                    linearLayoutCompat26.setVisibility(0);
                }
                LinearLayoutCompat linearLayoutCompat27 = this.j;
                if (linearLayoutCompat27 != null) {
                    linearLayoutCompat27.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat28 = this.y;
                if (linearLayoutCompat28 != null) {
                    linearLayoutCompat28.setVisibility((e().g() || d().Y().size() > 0) ? 0 : 8);
                }
            } else if (e().d()) {
                if (e().f() && e().h()) {
                    LinearLayoutCompat linearLayoutCompat29 = this.u;
                    if (linearLayoutCompat29 != null) {
                        linearLayoutCompat29.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat30 = this.A;
                    if (linearLayoutCompat30 != null) {
                        linearLayoutCompat30.setVisibility(0);
                    }
                    LinearLayoutCompat linearLayoutCompat31 = this.m;
                    if (linearLayoutCompat31 != null) {
                        linearLayoutCompat31.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat32 = this.l;
                    if (linearLayoutCompat32 != null) {
                        linearLayoutCompat32.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat33 = this.j;
                    if (linearLayoutCompat33 != null) {
                        linearLayoutCompat33.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat34 = this.k;
                    if (linearLayoutCompat34 != null) {
                        linearLayoutCompat34.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat35 = this.j;
                    if (linearLayoutCompat35 != null) {
                        linearLayoutCompat35.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat36 = this.y;
                    if (linearLayoutCompat36 != null) {
                        linearLayoutCompat36.setVisibility(8);
                    }
                } else if (e().f() && !e().h()) {
                    LinearLayoutCompat linearLayoutCompat37 = this.A;
                    if (linearLayoutCompat37 != null) {
                        linearLayoutCompat37.setVisibility(0);
                    }
                    LinearLayoutCompat linearLayoutCompat38 = this.u;
                    if (linearLayoutCompat38 != null) {
                        linearLayoutCompat38.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat39 = this.m;
                    if (linearLayoutCompat39 != null) {
                        linearLayoutCompat39.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat40 = this.l;
                    if (linearLayoutCompat40 != null) {
                        linearLayoutCompat40.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat41 = this.j;
                    if (linearLayoutCompat41 != null) {
                        linearLayoutCompat41.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat42 = this.k;
                    if (linearLayoutCompat42 != null) {
                        linearLayoutCompat42.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat43 = this.y;
                    if (linearLayoutCompat43 != null) {
                        linearLayoutCompat43.setVisibility(8);
                    }
                } else if (e().g() && e().h()) {
                    LinearLayoutCompat linearLayoutCompat44 = this.j;
                    if (linearLayoutCompat44 != null) {
                        linearLayoutCompat44.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat45 = this.k;
                    if (linearLayoutCompat45 != null) {
                        linearLayoutCompat45.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat46 = this.l;
                    if (linearLayoutCompat46 != null) {
                        linearLayoutCompat46.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat47 = this.s;
                    if (linearLayoutCompat47 != null) {
                        linearLayoutCompat47.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat48 = this.l;
                    if (linearLayoutCompat48 != null) {
                        linearLayoutCompat48.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat49 = this.A;
                    if (linearLayoutCompat49 != null) {
                        linearLayoutCompat49.setVisibility(0);
                    }
                    LinearLayoutCompat linearLayoutCompat50 = this.m;
                    if (linearLayoutCompat50 != null) {
                        linearLayoutCompat50.setVisibility(8);
                    }
                    if (e().j()) {
                        LinearLayoutCompat linearLayoutCompat51 = this.u;
                        if (linearLayoutCompat51 != null) {
                            linearLayoutCompat51.setVisibility(0);
                        }
                    } else {
                        LinearLayoutCompat linearLayoutCompat52 = this.u;
                        if (linearLayoutCompat52 != null) {
                            linearLayoutCompat52.setVisibility(8);
                        }
                    }
                } else if (e().g() && !e().h()) {
                    LinearLayoutCompat linearLayoutCompat53 = this.j;
                    if (linearLayoutCompat53 != null) {
                        linearLayoutCompat53.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat54 = this.k;
                    if (linearLayoutCompat54 != null) {
                        linearLayoutCompat54.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat55 = this.s;
                    if (linearLayoutCompat55 != null) {
                        linearLayoutCompat55.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat56 = this.A;
                    if (linearLayoutCompat56 != null) {
                        linearLayoutCompat56.setVisibility(0);
                    }
                    LinearLayoutCompat linearLayoutCompat57 = this.m;
                    if (linearLayoutCompat57 != null) {
                        linearLayoutCompat57.setVisibility(8);
                    }
                }
            } else if (!e().e()) {
                LinearLayoutCompat linearLayoutCompat58 = this.j;
                if (linearLayoutCompat58 != null) {
                    linearLayoutCompat58.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat59 = this.l;
                if (linearLayoutCompat59 != null) {
                    linearLayoutCompat59.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat60 = this.m;
                if (linearLayoutCompat60 != null) {
                    linearLayoutCompat60.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat61 = this.A;
                if (linearLayoutCompat61 != null) {
                    linearLayoutCompat61.setVisibility(0);
                }
                LinearLayoutCompat linearLayoutCompat62 = this.u;
                if (linearLayoutCompat62 != null) {
                    linearLayoutCompat62.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat63 = this.y;
                if (linearLayoutCompat63 != null) {
                    linearLayoutCompat63.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat64 = this.y;
                if (linearLayoutCompat64 != null) {
                    linearLayoutCompat64.setVisibility(8);
                }
            } else if (e().f() && e().h()) {
                LinearLayoutCompat linearLayoutCompat65 = this.j;
                if (linearLayoutCompat65 != null) {
                    linearLayoutCompat65.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat66 = this.k;
                if (linearLayoutCompat66 != null) {
                    linearLayoutCompat66.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat67 = this.m;
                if (linearLayoutCompat67 != null) {
                    linearLayoutCompat67.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat68 = this.u;
                if (linearLayoutCompat68 != null) {
                    linearLayoutCompat68.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat69 = this.n;
                if (linearLayoutCompat69 != null) {
                    linearLayoutCompat69.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat70 = this.l;
                if (linearLayoutCompat70 != null) {
                    linearLayoutCompat70.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat71 = this.y;
                if (linearLayoutCompat71 != null) {
                    linearLayoutCompat71.setVisibility(8);
                }
                if (a().g != null) {
                    List<String> offersAndExtrasSideMenuItem = a().g.getOffersAndExtrasSideMenuItem();
                    if (dqc.a(offersAndExtrasSideMenuItem == null ? null : Boolean.valueOf(offersAndExtrasSideMenuItem.contains(d().w())), Boolean.FALSE) && (linearLayoutCompat6 = this.o) != null) {
                        linearLayoutCompat6.setVisibility(8);
                    }
                }
            } else if (e().f() && !e().h()) {
                LinearLayoutCompat linearLayoutCompat72 = this.j;
                if (linearLayoutCompat72 != null) {
                    linearLayoutCompat72.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat73 = this.y;
                if (linearLayoutCompat73 != null) {
                    linearLayoutCompat73.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat74 = this.u;
                if (linearLayoutCompat74 != null) {
                    linearLayoutCompat74.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat75 = this.A;
                if (linearLayoutCompat75 != null) {
                    linearLayoutCompat75.setVisibility(0);
                }
                TextView textView2 = this.B;
                if (textView2 != null) {
                    textView2.setText(getText(R.string.bill_services));
                }
                LinearLayoutCompat linearLayoutCompat76 = this.l;
                if (linearLayoutCompat76 != null) {
                    linearLayoutCompat76.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat77 = this.n;
                if (linearLayoutCompat77 != null) {
                    linearLayoutCompat77.setVisibility(8);
                }
            } else if (e().g() && e().h()) {
                LinearLayoutCompat linearLayoutCompat78 = this.j;
                if (linearLayoutCompat78 != null) {
                    linearLayoutCompat78.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat79 = this.l;
                if (linearLayoutCompat79 != null) {
                    linearLayoutCompat79.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat80 = this.k;
                if (linearLayoutCompat80 != null) {
                    linearLayoutCompat80.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat81 = this.s;
                if (linearLayoutCompat81 != null) {
                    linearLayoutCompat81.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat82 = this.m;
                if (linearLayoutCompat82 != null) {
                    linearLayoutCompat82.setVisibility(8);
                }
                if ((e().k() || e().i()) && (linearLayoutCompat5 = this.o) != null) {
                    linearLayoutCompat5.setVisibility(8);
                }
                if (e().j()) {
                    LinearLayoutCompat linearLayoutCompat83 = this.u;
                    if (linearLayoutCompat83 != null) {
                        linearLayoutCompat83.setVisibility(0);
                    }
                } else {
                    LinearLayoutCompat linearLayoutCompat84 = this.u;
                    if (linearLayoutCompat84 != null) {
                        linearLayoutCompat84.setVisibility(8);
                    }
                }
            } else if (e().g() && !e().h()) {
                LinearLayoutCompat linearLayoutCompat85 = this.j;
                if (linearLayoutCompat85 != null) {
                    linearLayoutCompat85.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat86 = this.l;
                if (linearLayoutCompat86 != null) {
                    linearLayoutCompat86.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat87 = this.A;
                if (linearLayoutCompat87 != null) {
                    linearLayoutCompat87.setVisibility(0);
                }
                LinearLayoutCompat linearLayoutCompat88 = this.m;
                if (linearLayoutCompat88 != null) {
                    linearLayoutCompat88.setVisibility(8);
                }
                LinearLayoutCompat linearLayoutCompat89 = this.s;
                if (linearLayoutCompat89 != null) {
                    linearLayoutCompat89.setVisibility(8);
                }
            }
            if (e().e()) {
                TextView textView3 = this.B;
                if (textView3 != null) {
                    textView3.setText(getString(R.string.bill_services));
                }
                ImageView imageView = this.C;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ic_bill_services);
                }
            } else if (e().d()) {
                TextView textView4 = this.B;
                if (textView4 != null) {
                    textView4.setText(getString(R.string.balance_services));
                }
                ImageView imageView2 = this.C;
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.ic_balance_services);
                }
            }
            if (!e().d() || !e().h() || e().g()) {
                try {
                    if ((!d().f() || d().Q() || !b().f.isFeature_suspendandresume_ADSL() || !b().f.isFeatureSuspendandResume()) && (linearLayoutCompat = this.n) != null) {
                        linearLayoutCompat.setVisibility(8);
                    }
                } catch (Exception unused) {
                    LinearLayoutCompat linearLayoutCompat90 = this.n;
                    if (linearLayoutCompat90 != null) {
                        linearLayoutCompat90.setVisibility(8);
                    }
                }
            } else {
                try {
                    if ((!d().f() || d().Q() || !b().f.isFeatureSuspendandResume()) && (linearLayoutCompat4 = this.n) != null) {
                        linearLayoutCompat4.setVisibility(8);
                    }
                } catch (Exception unused2) {
                    LinearLayoutCompat linearLayoutCompat91 = this.n;
                    if (linearLayoutCompat91 != null) {
                        linearLayoutCompat91.setVisibility(8);
                    }
                }
            }
            if (e().g() && e().e() && !e().l()) {
                try {
                    if (!b().f.isFeature_bill_limit_ADSL() && (linearLayoutCompat3 = this.k) != null) {
                        linearLayoutCompat3.setVisibility(8);
                    }
                } catch (Exception unused3) {
                    LinearLayoutCompat linearLayoutCompat92 = this.k;
                    if (linearLayoutCompat92 != null) {
                        linearLayoutCompat92.setVisibility(8);
                    }
                }
            }
            Boolean c = a().c();
            dqc.b(c, "corporatePermissionProvider.createTicketSideMenuItem");
            if (c.booleanValue()) {
                LinearLayoutCompat linearLayoutCompat93 = this.t;
                if (linearLayoutCompat93 != null) {
                    linearLayoutCompat93.setVisibility(0);
                }
            } else {
                LinearLayoutCompat linearLayoutCompat94 = this.t;
                if (linearLayoutCompat94 != null) {
                    linearLayoutCompat94.setVisibility(8);
                }
            }
            Boolean c2 = a().c();
            dqc.b(c2, "corporatePermissionProvider.createTicketSideMenuItem");
            if (c2.booleanValue()) {
                LinearLayoutCompat linearLayoutCompat95 = this.t;
                if (linearLayoutCompat95 != null) {
                    linearLayoutCompat95.setVisibility(0);
                }
            } else {
                LinearLayoutCompat linearLayoutCompat96 = this.t;
                if (linearLayoutCompat96 != null) {
                    linearLayoutCompat96.setVisibility(8);
                }
            }
            if (!d().g() && (linearLayoutCompat2 = this.y) != null) {
                linearLayoutCompat2.setVisibility(8);
            }
            if (e().h()) {
                if (a().g != null) {
                    List<String> suspendAndResumeSideMenuItem = a().g.getSuspendAndResumeSideMenuItem();
                    if (suspendAndResumeSideMenuItem != null) {
                        bool = Boolean.valueOf(suspendAndResumeSideMenuItem.contains(d().w()));
                    }
                    if (dqc.a(bool, Boolean.TRUE)) {
                        LinearLayoutCompat linearLayoutCompat97 = this.n;
                        if (linearLayoutCompat97 != null) {
                            linearLayoutCompat97.setVisibility(0);
                        }
                    }
                }
                LinearLayoutCompat linearLayoutCompat98 = this.n;
                if (linearLayoutCompat98 != null) {
                    linearLayoutCompat98.setVisibility(8);
                }
            }
            return inflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public static final void a(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), MyAccountActivity.class);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ucare/we/presentation/more/MoreFragment$Companion;", "", "()V", "newInstance", "Landroidx/fragment/app/Fragment;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dfy$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    public static final void b(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), BillLimitActivity.class);
    }

    public static final void c(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), USSDDetails.class);
    }

    public static final void d(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), ChatWithUsActivity.class);
    }

    public static final void e(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), WePayActivity.class);
    }

    public static final void f(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), HelpAndSupport_Activity.class);
    }

    public static final void g(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), FamilyNumberActivity.class);
    }

    public static final void h(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), SocialMediaActivity.class);
    }

    public static final void i(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), SettingActivity.class);
    }

    public static final void j(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), NotificationInboxActivity.class);
    }

    public static final void k(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), SuspendAndResumeActivity.class);
    }

    public static final void l(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), RequestDeviceActivity.class);
    }

    public static final void m(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), NewRequestActivity.class);
    }

    public static final void n(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), OffersAndExtraActivity.class);
    }

    public static final void o(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.c().b(dfyVar.getActivity(), StoreLocatorActivity.class);
    }

    public static final void p(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        if (dfyVar.e().d()) {
            if (dfyVar.e().g()) {
                dfyVar.c();
                djx.a(dfyVar.getActivity(), ADSLBalanceServicesActivity.class, String.valueOf(dfyVar.d().z()));
                return;
            }
            dfyVar.c();
            djx.a(dfyVar.getActivity(), BalanceActivity.class, String.valueOf(dfyVar.d().z()));
        } else if (!dfyVar.e().e()) {
        } else {
            if (dfyVar.e().g()) {
                dfyVar.startActivity(new Intent(dfyVar.getActivity(), ADSLBalanceServicesActivity.class));
            } else {
                dfyVar.c().b(dfyVar.getActivity(), BillServicesActivity.class);
            }
        }
    }

    public static final void q(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        dfyVar.e().a(dfyVar.getActivity());
    }

    public static final void r(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        DeactivationConfirmationActivity.a aVar = DeactivationConfirmationActivity.a;
        DeactivationConfirmationActivity.a.a(dfyVar.getContext());
    }

    public static final void s(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        if (dfyVar.e().l()) {
            Intent intent = new Intent(dfyVar.getActivity(), FMCMSISDNSelector.class);
            intent.putExtra("FMC_NUMBER_TYPE", 2);
            dfyVar.startActivityForResult(intent, dfyVar.h);
            return;
        }
        dfyVar.c().b(dfyVar.getActivity(), RequestRouterUserNamePasswordActivity.class);
    }

    public static final void t(dfy dfyVar, View view) {
        dqc.d(dfyVar, "this$0");
        if (dfyVar.e().l()) {
            Intent intent = new Intent(dfyVar.getActivity(), FMCMSISDNSelector.class);
            intent.putExtra("FMC_NUMBER_TYPE", 1);
            dfyVar.startActivityForResult(intent, dfyVar.g);
            return;
        }
        dfyVar.c().b(dfyVar.getActivity(), PreferedNumberActivity.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.g) {
            if (intent == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("FMC_SELECTED_MSISDN");
            Intent intent2 = new Intent(getActivity(), PreferedNumberActivity.class);
            intent2.putExtra("FMC_SELECTED_MSISDN", stringExtra);
            startActivity(intent2);
        } else if (i != this.h || intent == null) {
        } else {
            String stringExtra2 = intent.getStringExtra("FMC_SELECTED_MSISDN");
            Intent intent3 = new Intent(getActivity(), RequestRouterUserNamePasswordActivity.class);
            intent3.putExtra("FMC_SELECTED_MSISDN", stringExtra2);
            startActivity(intent3);
        }
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
}
