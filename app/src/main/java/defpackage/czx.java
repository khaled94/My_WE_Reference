package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.ucare.we.AddMoreBundlesActivity;
import com.ucare.we.App;
import com.ucare.we.AssociatedNumbersActivity;
import com.ucare.we.BalanceActivity;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.BalanceRechargeCurrentNumberActivity;
import com.ucare.we.BalanceRechargeCurrentNumberCardActivity;
import com.ucare.we.BalanceRechargeNumberCreditActivity;
import com.ucare.we.BalanceRechargeOtherNumberActivity;
import com.ucare.we.BalanceRechargeSuccessfullyActivity;
import com.ucare.we.BalanceTransferActivity;
import com.ucare.we.BalanceTransferSuccessfullyActivity;
import com.ucare.we.ChangeMainPlanActivity;
import com.ucare.we.CreditCardInitActivity;
import com.ucare.we.DeviceTypeActivity;
import com.ucare.we.EditTicketActivity;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.FAQActivity;
import com.ucare.we.FamilyMoreDetailActivity;
import com.ucare.we.GenericActivity;
import com.ucare.we.GiftActivity;
import com.ucare.we.GpsEnableActivity;
import com.ucare.we.HelpAndSupport_Activity;
import com.ucare.we.ManageBundleActivity;
import com.ucare.we.ManagePlansActivity;
import com.ucare.we.ModifyPasswordActivity;
import com.ucare.we.NeedInstallationActivity;
import com.ucare.we.NewRequestActivity;
import com.ucare.we.PayBillActivity;
import com.ucare.we.PayBillMainActivity;
import com.ucare.we.PrepaidPaymentActivity;
import com.ucare.we.PrivacyPolicyActivity;
import com.ucare.we.QueryTicketActivity;
import com.ucare.we.QuickLoginActivity;
import com.ucare.we.QuotaTransfer.QuotaTransferActivity;
import com.ucare.we.RenewMainPlanActivity;
import com.ucare.we.RequestDeviceActivity;
import com.ucare.we.RequestRouterUserNamePasswordActivity;
import com.ucare.we.ServiceTicketActivity;
import com.ucare.we.SettingActivity;
import com.ucare.we.SliderCoachMarkActivity;
import com.ucare.we.SocialMediaActivity;
import com.ucare.we.SplashActivity;
import com.ucare.we.StoreLocatorActivity;
import com.ucare.we.SubscribeToBundleActivity;
import com.ucare.we.SuccessHandlerActivity;
import com.ucare.we.SuspendAndResumeActivity;
import com.ucare.we.SuspendAndResumeDurationSelectActivity;
import com.ucare.we.SuspendAndResumeSelectReasonAcitivity;
import com.ucare.we.TicketsListActivity;
import com.ucare.we.TroubleOrServicesRequestTicketActivity;
import com.ucare.we.TroubleTicketSelectTypeActivity;
import com.ucare.we.UnSubscribeFromBundleActivity;
import com.ucare.we.UsageDetailsScreenActivity;
import com.ucare.we.WebViewActivity;
import com.ucare.we.addaccount.AddAccountActivity;
import com.ucare.we.adslbalanceservices.ADSLBalanceServicesActivity;
import com.ucare.we.autopayment.AutoPayment_RechargeBill_Activity;
import com.ucare.we.balancetransfer.BalanceTransferPostPaidActivity;
import com.ucare.we.balancetransferhistory.BalanceTransferHistoryActivity;
import com.ucare.we.bankcardpaymentpostpaid.PostpaidPaymentActivity;
import com.ucare.we.billlimit.BillLimitActivity;
import com.ucare.we.billservices.BillServicesActivity;
import com.ucare.we.billsummary.BillSummaryActivity;
import com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity;
import com.ucare.we.chatwithus.ChatWithUsActivity;
import com.ucare.we.chooserequest.ChooseRequestActivity;
import com.ucare.we.confirmswitchingaccount.ConfirmSwitchingAccountActivity;
import com.ucare.we.dev.RequestStatusResponseActivity;
import com.ucare.we.familynumber.AddNewFamilyNumberConfirmActivity;
import com.ucare.we.familynumber.AddNewFamilyNumberSuccessActivity;
import com.ucare.we.familynumber.ConfirmDeleteFamilyNumberActivity;
import com.ucare.we.familynumber.FamilyNumberActivity;
import com.ucare.we.fragment.ResumeFragment;
import com.ucare.we.genericconfirmationscreen.GenericConfirmationActivity;
import com.ucare.we.helpandsupport.HelpAndSupportActivity;
import com.ucare.we.livechat.LiveChatActivity;
import com.ucare.we.loginwithanotheraccount.LoginWithAnotherAccountActivity;
import com.ucare.we.manageplanspostpaid.ManagePlanMoreDetails;
import com.ucare.we.manageplanspostpaid.ManagePostPaidPlanActivity;
import com.ucare.we.manageplanspostpaid.MigrateToPlanConfirmationActivity;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.morebundle.ConfirmRenewalExtraActivity;
import com.ucare.we.morebundle.ConfirmUnsubscribeFromMoreBundleActivity;
import com.ucare.we.morebundle.FCMMSISDNPicker.FMCMSISDNPickerActivity;
import com.ucare.we.morebundle.FamilySelectMoreBundlesActivity;
import com.ucare.we.morebundle.FamilySubscribeToMoreBundleActivity;
import com.ucare.we.morebundle.MoreBundleActivity;
import com.ucare.we.morebundle.SelectMoreBundlesActivity;
import com.ucare.we.morebundle.SubscribeToAddOnConfirmation;
import com.ucare.we.morebundle.SubscribeToMoreBundleActivity;
import com.ucare.we.newHome.features.AnonymousNewHomeActivity;
import com.ucare.we.newHome.features.HomeActivity;
import com.ucare.we.paybillautheduser.PayBillForUserActivity;
import com.ucare.we.paybillpaymentmethod.HomeCollectionActivity;
import com.ucare.we.paybillpaymentmethod.PaymentMethodActivity;
import com.ucare.we.paybillpostpaid.PayBillPostPaidActivity;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.VoucherPayBillPostPaidActivity;
import com.ucare.we.paymenthistory.PaymentHistoryPostPaidActivity;
import com.ucare.we.preferrednumber.AddNewPreferredNumberConfirmActivity;
import com.ucare.we.preferrednumber.AddNewPreferredNumberSuccessActivity;
import com.ucare.we.preferrednumber.ConfirmDeletePreferredNumberActivity;
import com.ucare.we.preferrednumber.PreferedNumberActivity;
import com.ucare.we.presentation.RegionalProducts.RegionalProductsActivity;
import com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity;
import com.ucare.we.presentation.adslprepaid.ADSLPrePaidMainActivity;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import com.ucare.we.presentation.auth.signup.SignUpActivity;
import com.ucare.we.presentation.contactus.ContactUsActivity;
import com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity;
import com.ucare.we.presentation.corporateadslprepaid.CorporateADSLPrePaidMainActivity;
import com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity;
import com.ucare.we.presentation.corporateprepaid.CorporatePrePaidMainActivity;
import com.ucare.we.presentation.deactivatefbb.DeactivationConfirmationActivity;
import com.ucare.we.presentation.deactivatefbb.DeactivationResponseActivity;
import com.ucare.we.presentation.deactivatefbb.TermsConditionActivity;
import com.ucare.we.presentation.family.CreateFamilyGroupConfirmationActivity;
import com.ucare.we.presentation.family.FamilySelectMoreBundleActivity;
import com.ucare.we.presentation.family.FamilySharedAddons.FamilySelectAddonsActivity;
import com.ucare.we.presentation.family.FamilySharedAddons.FamilySubscribeAddonsActivity;
import com.ucare.we.presentation.family.creategroup.CreateFamilyGroupPlansActivity;
import com.ucare.we.presentation.family.groupConsumptionSharedDetails.GroupDetailsActivity;
import com.ucare.we.presentation.family.groupinfo.GroupInfoActivity;
import com.ucare.we.presentation.family.groupinfo.ManageGroupActivity;
import com.ucare.we.presentation.family.groupinfo.managebundle.ManageFamilyBundleActivity;
import com.ucare.we.presentation.family.groupinfo.managemembers.ManageMembersActivity;
import com.ucare.we.presentation.family.groupinfo.managemembers.addmember.AddMemberActivity;
import com.ucare.we.presentation.family.groupinfo.managemembers.consumptionlimit.ConsumptionLimitActivity;
import com.ucare.we.presentation.family.groupinfo.managemembers.managegrouppaymentrelation.ManageMemberLimitsActivity;
import com.ucare.we.presentation.family.groupinfo.managemembers.paymentlimit.PaymentLimitActivity;
import com.ucare.we.presentation.family.groupinfo.transferablepackages.TransferablePackagesActivity;
import com.ucare.we.presentation.family.offersAddons.FamilyOffersAddonsActivity;
import com.ucare.we.presentation.fmcuser.FMCMSISDNSelector.FMCMSISDNSelector;
import com.ucare.we.presentation.fmcuser.FMCMainActivity;
import com.ucare.we.presentation.genericconfirmation.GlobalConfirmationActivity;
import com.ucare.we.presentation.inbox.NotificationInboxActivity;
import com.ucare.we.presentation.inboxdetails.NotificationInboxDetailsActivity;
import com.ucare.we.presentation.offers.OffersAndExtraActivity;
import com.ucare.we.presentation.offers.UnNavigateResponseActivityFamily;
import com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity;
import com.ucare.we.presentation.paymenthistory.PaymentHistoryActivity;
import com.ucare.we.presentation.postpaid.PostPaidMainActivity;
import com.ucare.we.presentation.prepaid.MainActivity;
import com.ucare.we.presentation.profile.myaccount.MyAccountActivity;
import com.ucare.we.presentation.profile.postpaidprofile.DisableAutoPayConfirmationActivity;
import com.ucare.we.presentation.profile.postpaidprofile.EnableAutoPayTopG.EnableAutoPayTopGActivity;
import com.ucare.we.presentation.profile.postpaidprofile.ShowCreditCardConfirmationCodeActivity;
import com.ucare.we.presentation.promisetopayandsalefny.PromiseToPayAndSalefnyActivity;
import com.ucare.we.presentation.requeststatus.RequestStatusActivity;
import com.ucare.we.presentation.requiredbalance.RequiredBalanceActivity;
import com.ucare.we.presentation.search.SearchActivity;
import com.ucare.we.presentation.submitnewrequest.SubmitNewRequestActivity;
import com.ucare.we.presentation.success.SuccessRegisterActivity;
import com.ucare.we.presentation.switchaccount.CancelAccessConfirmationActivity;
import com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity;
import com.ucare.we.presentation.ussdddetails.USSDDetails;
import com.ucare.we.presentation.wepay.WePayActivity;
import com.ucare.we.switchaccount.ChooseAccountActivity;
import com.ucare.we.ui.BalanceTransferConfirmationActivity;
import dagger.Module;
import dagger.Provides;
import defpackage.efo;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@Module(includes = {dac.class}, injects = {App.class, MainActivity.class, ChatWithUsActivity.class, PayBillMainActivity.class, djy.class, djb.class, djw.class, Locale.class, eaw.class, efo.class, diq.class, dir.class, dio.class, SignInActivity.class, SignUpActivity.class, ddj.class, ddn.class, ddo.class, ddk.class, dge.class, PrepaidPaymentActivity.class, djx.class, QuickLoginActivity.class, PayBillForUserActivity.class, PostPaidMainActivity.class, dhu.class, dhm.class, dhs.class, dil.class, ManagePlansActivity.class, SocialMediaActivity.class, LiveChatActivity.class, BalanceActivity.class, PaymentHistoryActivity.class, dgd.class, dhp.class, dia.class, dfw.class, dfp.class, dfk.class, des.class, dff.class, dfb.class, dew.class, dey.class, dev.class, ddw.class, dhy.class, dhj.class, dgc.class, BalanceTransferActivity.class, BalanceTransferConfirmationActivity.class, BalanceTransferSuccessfullyActivity.class, dja.class, dgf.class, dbs.class, SettingActivity.class, czk.class, dgm.class, dfy.class, dft.class, dah.class, MyAccountActivity.class, ManageBundleActivity.class, dag.class, BalanceRechargeActivity.class, BalanceRechargeCurrentNumberActivity.class, RequiredBalanceActivity.class, BalanceRechargeCurrentNumberCardActivity.class, BalanceRechargeOtherNumberActivity.class, BalanceRechargeNumberCreditActivity.class, CreditCardInitActivity.class, FamilySelectMoreBundleActivity.class, ddy.class, FAQActivity.class, ChooseAccountActivity.class, AddAccountActivity.class, dhw.class, din.class, SplashActivity.class, NotificationInboxDetailsActivity.class, djg.class, czf.class, daf.class, AssociatedNumbersActivity.class, ModifyPasswordActivity.class, did.class, dga.class, RenewMainPlanActivity.class, UnSubscribeFromBundleActivity.class, AddMoreBundlesActivity.class, czg.class, ErrorHandlerActivity.class, ChangeMainPlanActivity.class, GiftActivity.class, SuccessRegisterActivity.class, SubscribeToBundleActivity.class, dhn.class, cxh.class, dih.class, cxf.class, cxa.class, cwx.class, SummarizedLineUsageItem.class, czy.class, UnNavigateResponseActivity.class, dae.class, SuccessHandlerActivity.class, ManagePostPaidPlanActivity.class, dan.class, BillServicesActivity.class, cya.class, BalanceTransferPostPaidActivity.class, PaymentMethodActivity.class, PayBillPostPaidActivity.class, BillSummaryActivity.class, PaymentHistoryPostPaidActivity.class, VoucherPayBillPostPaidActivity.class, PostpaidPaymentActivity.class, cxu.class, dch.class, dcc.class, MigrateToPlanConfirmationActivity.class, dam.class, CreateFamilyGroupPlansActivity.class, GroupDetailsActivity.class, GroupInfoActivity.class, ManageMembersActivity.class, PaymentLimitActivity.class, ConsumptionLimitActivity.class, AddMemberActivity.class, ManageMemberLimitsActivity.class, ManageFamilyBundleActivity.class, TransferablePackagesActivity.class, FamilyOffersAddonsActivity.class, ManageGroupActivity.class, cxn.class, HelpAndSupportActivity.class, dcf.class, czw.class, ChooseRequestActivity.class, cyi.class, SubmitNewRequestActivity.class, dgz.class, RequestStatusActivity.class, cyd.class, dgv.class, SwitchAccountPostPaidActivity.class, dhe.class, BillLimitActivity.class, cxw.class, PreferedNumberActivity.class, dcz.class, FamilyNumberActivity.class, cyu.class, HomeActivity.class, dcb.class, dce.class, ConfirmSwitchingAccountActivity.class, ConfirmDeletePreferredNumberActivity.class, AddNewPreferredNumberConfirmActivity.class, AddNewPreferredNumberSuccessActivity.class, AddNewFamilyNumberConfirmActivity.class, AddNewFamilyNumberSuccessActivity.class, ConfirmDeleteFamilyNumberActivity.class, dhf.class, cxe.class, MoreBundleActivity.class, daz.class, ConfirmUnsubscribeFromMoreBundleActivity.class, SelectMoreBundlesActivity.class, FamilySelectMoreBundlesActivity.class, dbd.class, SubscribeToMoreBundleActivity.class, FamilySubscribeToMoreBundleActivity.class, ConfirmDownloadingBillSummaryActivity.class, dgl.class, LoginWithAnotherAccountActivity.class, ResponseActivity.class, HomeCollectionActivity.class, RequestStatusResponseActivity.class, ConfirmRenewalExtraActivity.class, dca.class, SubscribeToAddOnConfirmation.class, CancelAccessConfirmationActivity.class, dgk.class, UnNavigateResponseActivity.class, com.ucare.we.presentation.offers.UnNavigateResponseActivity.class, UnNavigateResponseActivityFamily.class, PrivacyPolicyActivity.class, BalanceRechargeSuccessfullyActivity.class, djc.class, dbi.class, dax.class, dbw.class, cxz.class, CorporatePostPaidMainActivity.class, WePayActivity.class, ddu.class, CorporatePrePaidMainActivity.class, ddv.class, DisableAutoPayConfirmationActivity.class, UsageDetailsScreenActivity.class, WebViewActivity.class, SliderCoachMarkActivity.class, dba.class, ShowCreditCardConfirmationCodeActivity.class, EnableAutoPayTopGActivity.class, dgh.class, ContactUsActivity.class, ddr.class, czh.class, cze.class, czt.class, czo.class, SearchActivity.class, cyy.class, czr.class, ADSLPostPaidMainActivity.class, dde.class, ADSLPrePaidMainActivity.class, ddf.class, GenericConfirmationActivity.class, ddl.class, GenericActivity.class, RequestRouterUserNamePasswordActivity.class, RequestDeviceActivity.class, DeactivationConfirmationActivity.class, TermsConditionActivity.class, DeactivationResponseActivity.class, DeviceTypeActivity.class, NeedInstallationActivity.class, SuspendAndResumeActivity.class, SuspendAndResumeDurationSelectActivity.class, SuspendAndResumeSelectReasonAcitivity.class, ServiceTicketActivity.class, OffersAndExtraActivity.class, PayBillActivity.class, cxj.class, ADSLBalanceServicesActivity.class, QuotaTransferActivity.class, cwl.class, cwn.class, cwo.class, BalanceTransferHistoryActivity.class, cxr.class, NewRequestActivity.class, TroubleOrServicesRequestTicketActivity.class, dij.class, TroubleTicketSelectTypeActivity.class, PromiseToPayAndSalefnyActivity.class, dgq.class, ResumeFragment.class, czl.class, QueryTicketActivity.class, dii.class, ResumeFragment.class, czj.class, FamilyMoreDetailActivity.class, TicketsListActivity.class, PromiseToPayAndSalefnyActivity.class, TicketsListActivity.class, EditTicketActivity.class, DisableAutoPayConfirmationActivity.class, CorporateADSLPrePaidMainActivity.class, CorporateADSLPostPaidMainActivity.class, StoreLocatorActivity.class, ddt.class, dds.class, ManagePlanMoreDetails.class, USSDDetails.class, dan.class, FMCMSISDNPickerActivity.class, dat.class, dfs.class, FMCMainActivity.class, GlobalConfirmationActivity.class, FMCMSISDNSelector.class, GpsEnableActivity.class, SubscribeToAddOnConfirmation.class, HelpAndSupport_Activity.class, NotificationInboxActivity.class, PayBillNumberTypeActivity.class, AutoPayment_RechargeBill_Activity.class, cxl.class, cxm.class, RegionalProductsActivity.class, CreateFamilyGroupConfirmationActivity.class, FamilySelectAddonsActivity.class, deb.class, FamilySubscribeAddonsActivity.class, dee.class, CreateFamilyGroupConfirmationActivity.class, StoreLocatorActivity.class, cwg.class, AnonymousNewHomeActivity.class, dbo.class, dbq.class}, library = true)
/* renamed from: czx  reason: default package */
/* loaded from: classes2.dex */
public final class czx {
    private App a;

    public czx(App app) {
        this.a = app;
    }

    @Provides
    @Singleton
    public final Context a() {
        return this.a;
    }

    @Provides
    @Singleton
    public final eaw b() {
        djk.a().i().a(90L, TimeUnit.SECONDS);
        djk.a().i().b(90L, TimeUnit.SECONDS);
        djk.a().i().c(90L, TimeUnit.SECONDS);
        return djk.a();
    }

    @Provides
    @Singleton
    public final efo a(eaw eawVar) {
        return new efo.a().a("https://api-my.te.eg/").a(eft.a()).a(eawVar).a();
    }

    @Provides
    @Singleton
    public final diq a(efo efoVar) {
        return (diq) efoVar.a(diq.class);
    }

    @Provides
    @Singleton
    public final dir b(efo efoVar) {
        djk.b().i().a(30L, TimeUnit.SECONDS);
        djk.b().i().b(30L, TimeUnit.SECONDS);
        djk.b().i().c(30L, TimeUnit.SECONDS);
        return (dir) new efo.a().a("https://api-my.te.eg/").a(eft.a()).a(djk.b()).a().a(dir.class);
    }

    @Provides
    @Singleton
    public final SharedPreferences a(Context context) {
        try {
            return EncryptedSharedPreferences.create(ly.k(), context.getPackageName(), new MasterKey.Builder(ly.k()).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (GeneralSecurityException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Provides
    @Singleton
    public final djw c() {
        return new djw();
    }

    @Provides
    @Singleton
    public final djb d() {
        return new djb();
    }

    @Provides
    public final Locale e() {
        return Locale.getDefault();
    }

    @Provides
    @Singleton
    public final dio f() {
        return new dio();
    }

    @Provides
    @Singleton
    public final dhu g() {
        return new dhu();
    }

    @Provides
    @Singleton
    public final dhm h() {
        return new dhm();
    }

    @Provides
    @Singleton
    public final dhs i() {
        return new dhs();
    }

    @Provides
    @Singleton
    public final dil j() {
        return new dil();
    }

    @Provides
    @Singleton
    public final dia k() {
        return new dia();
    }

    @Provides
    @Singleton
    public final dhp l() {
        return new dhp();
    }

    @Provides
    @Singleton
    public final dfw m() {
        return new dfw();
    }

    @Provides
    @Singleton
    public final dew n() {
        return new dew();
    }

    @Provides
    @Singleton
    public final dey o() {
        return new dey();
    }

    @Provides
    @Singleton
    public final dfp p() {
        return new dfp();
    }

    @Provides
    @Singleton
    public final ddw q() {
        return new ddw();
    }

    @Provides
    @Singleton
    public final dhj r() {
        return new dhj();
    }

    @Provides
    @Singleton
    public final dgc s() {
        return new dgc();
    }

    @Provides
    @Singleton
    public final dja t() {
        return new dja();
    }

    @Provides
    @Singleton
    public final din u() {
        return new din();
    }

    @Provides
    @Singleton
    public final dhw v() {
        return new dhw();
    }

    @Provides
    @Singleton
    public final djg w() {
        return new djg();
    }

    @Provides
    @Singleton
    public final did x() {
        return new did();
    }

    @Provides
    @Singleton
    public final dga y() {
        return new dga();
    }

    @Provides
    @Singleton
    public final dhn z() {
        return new dhn();
    }

    @Provides
    @Singleton
    public final dih A() {
        return new dih();
    }

    @Provides
    @Singleton
    public final dbp c(efo efoVar) {
        return new dbp(new dbn(new cwc((cvt) efoVar.a(cvt.class))));
    }

    @Provides
    @Singleton
    public final cwb a(cvt cvtVar) {
        return new cwc(cvtVar);
    }

    @Provides
    @Singleton
    public final dbn a(cwb cwbVar) {
        return new dbn(cwbVar);
    }

    @Provides
    @Singleton
    public final cvt d(efo efoVar) {
        return (cvt) efoVar.a(cvt.class);
    }

    @Provides
    @Singleton
    public final ViewModelProvider.Factory a(dbn dbnVar) {
        return new dbl(dbnVar);
    }
}
