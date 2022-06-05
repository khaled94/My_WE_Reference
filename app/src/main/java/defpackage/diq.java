package defpackage;

import com.ucare.we.model.AutoLoginRequestBody;
import com.ucare.we.model.BalanceResponseBody;
import com.ucare.we.model.BalanceTransferFinalizeRequestBody;
import com.ucare.we.model.BalanceTransferFinalizeResponseBody;
import com.ucare.we.model.BalanceTransferInitRequestBody;
import com.ucare.we.model.BalanceTransferInitResponseBody;
import com.ucare.we.model.CardRechargeRequestBody;
import com.ucare.we.model.CardRechargeResponseBody;
import com.ucare.we.model.ConfigurationResponseBody;
import com.ucare.we.model.CreditCardFinalizeRequestBody;
import com.ucare.we.model.CreditCardFinalizeResponseBody;
import com.ucare.we.model.DefaultResponse;
import com.ucare.we.model.DeviceTypes;
import com.ucare.we.model.LoginInfo;
import com.ucare.we.model.LoginRequestBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.ModifyPasswordRequestBody;
import com.ucare.we.model.PaymentHistoryRequestBody;
import com.ucare.we.model.PaymentHistoryResponseBody;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import com.ucare.we.model.ProfileInfoResponseBody;
import com.ucare.we.model.RenewMainPlanRequestBody;
import com.ucare.we.model.SendConfirmationResponseBody;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.SignUpRequestBody;
import com.ucare.we.model.SignUpResponsBody;
import com.ucare.we.model.StoreRequestBody;
import com.ucare.we.model.StoreResponseBody;
import com.ucare.we.model.UserStatusResponseBody;
import com.ucare.we.model.checkavailability.CheckAvailabilityResponse;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.family.FamilyChangeMainPlanBody;
import com.ucare.we.model.family.FamilyCreateGroupRequestBody;
import com.ucare.we.model.family.FamilyCreateGroupResponseBody;
import com.ucare.we.model.family.FamilyOffersAddonsResponseBody;
import com.ucare.we.model.family.FamilyPlansResponseBody;
import com.ucare.we.model.family.ManageConsumptionLimitMembersResponseBody;
import com.ucare.we.model.family.QueryConsumptionLimitResponseBody;
import com.ucare.we.model.local.DeactivationFbbRequestBody;
import com.ucare.we.model.local.NotificationInboxRequestBody;
import com.ucare.we.model.local.adjustbalance.AdjustBalanceRequest;
import com.ucare.we.model.local.family.FamilyPrimaryOffersRequestBody;
import com.ucare.we.model.local.family.FamilySuppOffersRequestBody;
import com.ucare.we.model.local.family.GetMemberRequestBody;
import com.ucare.we.model.local.family.ManageFamilyMemberRequestBody;
import com.ucare.we.model.local.family.QueryConsumptionLimitRequestBody;
import com.ucare.we.model.local.family.SubscribedFamilyOffersRequestBody;
import com.ucare.we.model.local.groupidrequest.GroupIdRequest;
import com.ucare.we.model.local.managegrouppaymentrelation.ManageGroupPaymentRelationRequest;
import com.ucare.we.model.local.managepaymentlimit.ManageConsumptionLimitRequestBody;
import com.ucare.we.model.local.managepaymentlimit.ManagePaymentLimitRequestBody;
import com.ucare.we.model.local.transferablepackagesrequest.TransferablePackagesRequest;
import com.ucare.we.model.remote.CorporatePermissionResponseBody;
import com.ucare.we.model.remote.NotificationInboxResponseBody;
import com.ucare.we.model.remote.PermissionResponseBody;
import com.ucare.we.model.remote.dueamount.DueAmount;
import com.ucare.we.model.remote.familygroupmember.FamilyGroupMember;
import com.ucare.we.model.remote.faqlist.FaqListResponseBody;
import com.ucare.we.model.remote.grouppaymentrelation.FamilyPaymentRelationResponse;
import com.ucare.we.model.remote.pushnotification.NotificationCount;
import com.ucare.we.model.remote.subscribedoffers.FamilySubscribedOffer;
import com.ucare.we.model.remote.transferpackage.TransferablePackages;
import com.ucare.we.model.remote.transferunits.TransferUnitResponse;
import com.ucare.we.model.routerusernameandpassword.RouterUserNameAndPasswordResponseBody;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.suspendandresume.SubmitSuspendAndResume;
import com.ucare.we.model.suspendandresume.SuspendAndResumeReasonAndDurationResponse;
import com.ucare.we.model.suspendandresume.SuspendAndResumeResponse;
import com.ucare.we.model.ticket.QueryTicketResponse;
import com.ucare.we.model.ticket.TroubleTicketsResponseTypes;
import com.ucare.we.model.usagedetails.HomePageResponseBody;
import java.util.ArrayList;
import java.util.List;

/* renamed from: diq  reason: default package */
/* loaded from: classes2.dex */
public interface diq {
    @egk
    eey<ServerResponse<ProfileInfoResponseBody>> A(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse> B(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<SignUpRequestBody> serverRequest);

    @egk
    eey<ServerResponse<List<PaymentHistoryResponseBody>>> C(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<PaymentHistoryRequestBody> serverRequest);

    @egk
    eey<ServerResponse<NotificationInboxResponseBody>> D(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<NotificationInboxRequestBody> serverRequest);

    @egk
    eey<ServerResponse<String>> E(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<DeactivationFbbRequestBody> serverRequest);

    @egk
    eey<ServerResponse<ArrayList<FaqListResponseBody>>> F(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<NotificationCount>> G(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse> H(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<Integer> serverRequest);

    @egk
    eey<ServerResponse<SuspendAndResumeResponse>> I(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<String> serverRequest);

    @egk
    eey<ServerResponse<String>> J(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<SubmitSuspendAndResume> serverRequest);

    @egk
    eey<ServerResponse<BalanceTransferInitResponseBody>> K(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<BalanceTransferInitRequestBody> serverRequest);

    @egk
    eey<ServerResponse<BalanceTransferFinalizeResponseBody>> L(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<BalanceTransferFinalizeRequestBody> serverRequest);

    @egk
    eey<ServerResponse<HomePageResponseBody>> M(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<ArrayList<ExtrasList>>> N(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<CheckAvailabilityResponse>> O(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<ArrayList<SpecialList>>> P(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<List<MainPlanResponseBody>>> Q(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<CardRechargeResponseBody>> R(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<CardRechargeRequestBody> serverRequest);

    @egk
    eey<ServerResponse<CreditCardFinalizeResponseBody>> S(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<CreditCardFinalizeRequestBody> serverRequest);

    @egk
    eey<ServerResponse<ArrayList<DeviceTypes>>> T(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse> U(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<ModifyPasswordRequestBody> serverRequest);

    @egk
    eey<ServerResponse<List<PlansAndBundlesResponseBody>>> V(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<String>> W(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<RenewMainPlanRequestBody> serverRequest);

    @egk
    eey<ServerResponse<String>> X(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<RenewMainPlanRequestBody> serverRequest);

    @egk
    eey<ServerResponse<ConfigurationResponseBody>> Y(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<List<StoreResponseBody>>> Z(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<StoreRequestBody> serverRequest);

    @egb
    eey<ServerResponse<LoginInfo>> a(@egu String str);

    @egk
    eey<ServerResponse<String>> a(@egu String str, @efw ebb ebbVar, @ege(a = "Jwt") String str2);

    @egb
    eey<CorporatePermissionResponseBody> a(@egu String str, @ege(a = "Jwt") String str2);

    @egk
    eey<ServerResponse<DueAmount>> a(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<String> serverRequest);

    @egb
    eey<ServerResponse<String>> a(@egu String str, @ege(a = "Jwt") String str2, @ege(a = "msisdn-no-cc") String str3, @ege(a = "uuid") String str4);

    @egk
    eey<ServerResponse<LoginInfo>> aa(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<AutoLoginRequestBody> serverRequest);

    @egb
    eey<DefaultResponse> b(@egu String str, @ege(a = "Jwt") String str2);

    @egk
    eey<ServerResponse<UserStatusResponseBody>> b(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<String> serverRequest);

    @egb
    eey<PermissionResponseBody> c(@egu String str, @ege(a = "Jwt") String str2);

    @egk
    eey<ServerResponse<LoginInfo>> c(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<LoginRequestBody> serverRequest);

    @egb
    eey<SuspendAndResumeReasonAndDurationResponse> d(@egu String str, @ege(a = "Jwt") String str2);

    @egk
    eey<ServerResponse<SignUpResponsBody>> d(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<SignUpRequestBody> serverRequest);

    @egb
    eey<TroubleTicketsResponseTypes> e(@egu String str, @ege(a = "Jwt") String str2);

    @egk
    eey<ServerResponse<SendConfirmationResponseBody>> e(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<BalanceResponseBody>> f(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<String>> g(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<ManageFamilyMemberRequestBody> serverRequest);

    @egk
    eey<ServerResponse<TransferUnitResponse>> h(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<GroupIdRequest> serverRequest);

    @egk
    eey<ServerResponse<ArrayList<TransferablePackages>>> i(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<TransferablePackagesRequest> serverRequest);

    @egk
    eey<ServerResponse> j(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<AdjustBalanceRequest> serverRequest);

    @egk
    eey<ServerResponse<ArrayList<FamilyPaymentRelationResponse>>> k(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<ManageGroupPaymentRelationRequest> serverRequest);

    @egk
    eey<ServerResponse<FamilyGroupMember>> l(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<GetMemberRequestBody> serverRequest);

    @egk
    eey<ServerResponse<FamilyCreateGroupResponseBody>> m(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<FamilyCreateGroupRequestBody> serverRequest);

    @egk
    eey<ServerResponse<ArrayList<FamilyPlansResponseBody>>> n(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<FamilyPrimaryOffersRequestBody> serverRequest);

    @egk
    eey<ServerResponse<FamilyOffersAddonsResponseBody>> o(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<FamilyPrimaryOffersRequestBody> serverRequest);

    @egk
    eey<ddz> p(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<FamilyPrimaryOffersRequestBody> serverRequest);

    @egk
    eey<ServerResponse<String>> q(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<FamilySuppOffersRequestBody> serverRequest);

    @egk
    eey<ServerResponse<QueryConsumptionLimitResponseBody>> r(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<QueryConsumptionLimitRequestBody> serverRequest);

    @egk
    eey<ServerResponse<ManageConsumptionLimitMembersResponseBody>> s(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<FamilyPrimaryOffersRequestBody> serverRequest);

    @egk
    eey<ServerResponse<String>> t(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<ManageConsumptionLimitRequestBody> serverRequest);

    @egk
    eey<ServerResponse<String>> u(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<ManagePaymentLimitRequestBody> serverRequest);

    @egk
    eey<ServerResponse<ArrayList<FamilySubscribedOffer>>> v(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<SubscribedFamilyOffersRequestBody> serverRequest);

    @egk
    eey<ServerResponse> w(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest<FamilyChangeMainPlanBody> serverRequest);

    @egk
    eey<ServerResponse<String>> x(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<ArrayList<QueryTicketResponse>>> y(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);

    @egk
    eey<ServerResponse<RouterUserNameAndPasswordResponseBody>> z(@egu String str, @ege(a = "Jwt") String str2, @efw ServerRequest serverRequest);
}
