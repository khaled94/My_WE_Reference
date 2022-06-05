package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardFinalizeRequest;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardFinalizeRequestBody;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardFinalizeRequestHeader;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardInitializeRequest;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardInitializeRequestBody;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardInitializeRequestHeader;
import com.ucare.we.model.AutoRechargeModel.UpdateAutoRechargeRequest;
import com.ucare.we.model.AutoRechargeModel.UpdateAutoRechargeRequestBody;
import com.ucare.we.model.BalanceTransferHistoryModel.BalanceTransferHistoryRequest;
import com.ucare.we.model.BalanceTransferHistoryModel.BalanceTransferHistoryRequestBody;
import com.ucare.we.model.BillLimitModel.RequestSetBillLimitBody;
import com.ucare.we.model.BillLimitModel.RequestSetBillLimitHeader;
import com.ucare.we.model.BillLimitModel.RequestViewBillLimit;
import com.ucare.we.model.BillLimitModel.RequestViewBillLimitBody;
import com.ucare.we.model.BillLimitModel.RequestViewBillLimitHeader;
import com.ucare.we.model.BillLimitModel.SetBillLimitRequest;
import com.ucare.we.model.BillSummaryModel.RequestDownloadInvoiceFromUrl;
import com.ucare.we.model.BillSummaryModel.RequestDownloadInvoiceFromUrlBody;
import com.ucare.we.model.BillSummaryModel.RequestFinalizeBillSummary;
import com.ucare.we.model.BillSummaryModel.RequestFinalizeBillSummaryBody;
import com.ucare.we.model.DefaultRequest;
import com.ucare.we.model.FMCModel.FMCMembersRequest;
import com.ucare.we.model.FMCModel.FMCMembersRequestBody;
import com.ucare.we.model.FMCModel.PaginationModel;
import com.ucare.we.model.FirebaseNotificationModel.FirebaseNotificationRequest;
import com.ucare.we.model.FirebaseNotificationModel.FirebaseNotificationRequestBody;
import com.ucare.we.model.GetProfileRequest;
import com.ucare.we.model.Header;
import com.ucare.we.model.HomeCollection.HomeCollectionRequest;
import com.ucare.we.model.HomeCollection.HomeCollectionRequestBody;
import com.ucare.we.model.LoginRequest;
import com.ucare.we.model.MainPlanRequest;
import com.ucare.we.model.MainRequestsHeader;
import com.ucare.we.model.MigrateModel.MigrateOffers;
import com.ucare.we.model.MigrateModel.MigrateRequest;
import com.ucare.we.model.MigrateModel.MigrateRequestBody;
import com.ucare.we.model.MoreBundleModel.Offer;
import com.ucare.we.model.MoreBundleModel.RequestRetrieveMoreBundle;
import com.ucare.we.model.MoreBundleModel.RequestRetrieveMoreBundleBody;
import com.ucare.we.model.MoreBundleModel.RequestRetrieveMoreBundleHeader;
import com.ucare.we.model.MoreBundleModel.RequestUnsubscribeFromMoreBundle;
import com.ucare.we.model.MoreBundleModel.RequestUnsubscribeFromMoreBundleBody;
import com.ucare.we.model.MoreBundleModel.RequestUnsubscribeFromMoreBundleHeader;
import com.ucare.we.model.MoreBundleModel.RequestViewMoreBundle;
import com.ucare.we.model.MoreBundleModel.RequestViewMoreBundleBody;
import com.ucare.we.model.MoreBundleModel.RequestViewMoreBundleHeader;
import com.ucare.we.model.PaymentHistoryPostPaidRequestBody;
import com.ucare.we.model.PaymentHistoryRequest;
import com.ucare.we.model.PreferedNumberModel.AddPreferredNumberRequest;
import com.ucare.we.model.PreferedNumberModel.AddPreferredNumberRequestBody;
import com.ucare.we.model.PreferedNumberModel.AddPreferredNumberRequestHeader;
import com.ucare.we.model.PreferedNumberModel.ViewPreferredNumberRequest;
import com.ucare.we.model.PreferedNumberModel.ViewPreferredNumberRequestBody;
import com.ucare.we.model.PreferedNumberModel.ViewPreferredNumberRequestHeader;
import com.ucare.we.model.ProfileContactInfo.UpdateContactInfoRequest;
import com.ucare.we.model.ProfileContactInfo.UpdateContactInfoRequestBody;
import com.ucare.we.model.RegionalProducts.RegionalProductDismissRequest;
import com.ucare.we.model.RenewMainOfferModel.RenewMainOfferRequest;
import com.ucare.we.model.RenewMainOfferModel.RenewMainOfferRequestBody;
import com.ucare.we.model.RequestHeader;
import com.ucare.we.model.SocialMediaModel.LinkToSocialRequest;
import com.ucare.we.model.SocialMediaModel.LinkToSocialRequestBody;
import com.ucare.we.model.SubmitTicketModel.SubmitTicketRequest;
import com.ucare.we.model.SubmitTicketModel.SubmitTicketRequestBody;
import com.ucare.we.model.SwitchAccountModel.NumberAccessFinalizeRequest;
import com.ucare.we.model.SwitchAccountModel.NumberAccessFinalizeRequestBody;
import com.ucare.we.model.SwitchAccountModel.NumberAccessInitializeRequest;
import com.ucare.we.model.SwitchAccountModel.NumberAccessInitializeRequestBody;
import com.ucare.we.model.TicketStatus.GetTicketBody;
import com.ucare.we.model.TicketStatus.GetTicketRequest;
import com.ucare.we.model.TransferAmountBody;
import com.ucare.we.model.TransferAmountRequest;
import com.ucare.we.model.UpdateProfileMail;
import com.ucare.we.model.UpdateProfileMailBody;
import com.ucare.we.model.passwordBody;
import defpackage.au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: djl  reason: default package */
/* loaded from: classes2.dex */
public final class djl {
    private static djl e;
    private Context aF;
    public at b;
    private final String f = "locale";
    private final String g = "msisdn";
    private final String h = "Jwt";
    private final String i = "api/user/login";
    private final String j = "api/line/servicesandfeatures";
    private final String k = "api/services/list/offers";
    private final String l = "api/regional/offers";
    private final String m = "api/line/postpaid/balance";
    private final String n = "api/line/transferbalance/init";
    private final String o = "api/user/profile/postpiad";
    private final String p = "api/user/profile/prepaid";
    private final String q = "api/billing/queryOpenInvoices";
    private final String r = "api/billing/queryinvoices";
    private final String s = "api/billing/initqueryinvoicesURL";
    private final String t = "api/billing/finalizequeryinvoicesURL";
    private final String u = "api/payment/paymenthistory";
    private final String v = "api/payment/pay/unregisteredcard/initiate";
    private final String w = "api/payment/pay/voucher";
    private final String x = "api/services/homecollection";
    private final String y = "api/social/link";
    private final String z = "api/social/enableLogin";
    private final String A = "api/social/login";
    private final String B = "api/social/unlink";
    private final String C = "api/social/status";
    private final String D = "api/services/change/mainoffers";
    private final String E = "api/files/read?fileName=SRTypes.json";
    private final String F = "api/files/read?fileName=";
    private final String G = "api/files/read?fileName=permission.json";
    private final String H = "api/customerservice/ticket/status";
    private final String I = "api/line/associatedlines";
    private final String J = "api/customerservice/ticket/submit";
    private final String K = "api/account/initiate";
    private final String L = "api/account/finalize";
    private final String M = "api/line/consumptionlimit";
    private final String N = "api/friendsandfamily/viewmembers";
    private final String O = "api/friendsandfamily/addmember";
    private final String P = "api/services/list/offers/subscribed";
    private final String Q = "api/services/list/offers/addon";
    private final String R = "api/services/change/suppoffers";
    private final String S = "api/line/subscribtion/manage";
    private final String T = "api/friendsandfamily/deletemember";
    private final String U = "api/friendsandfamily/status";
    private final String V = "api/cug/viewmembers";
    private final String W = "api/cug/addmember";
    private final String X = "api/cug/deletemember";
    private final String Y = "api/line/manageconsumptionlimit";
    private final String Z = "api/user/status";
    private final String aa = "api/user/switch";
    private final String ab = "api/user/profile/postpaid/customerinfo/update";
    private final String ac = "api/autopayment/checkstatus";
    private final String ad = "api/services/homecollection/status";
    private final String ae = "api/autopayment/deactivate";
    private final String af = "api/autopayment/activate";
    private final String ag = "api/user/contactinfo/update";
    private final String ah = "api/line/freeunit/transfer/init";
    private final String ai = "api/line/freeunit/transfer/finalize";
    private final String aj = "api/line/freeunit/transfer/options";
    private final String ak = "api/creditcard/deactivate";
    private final String al = "api/creditcard/initate/addorupdate";
    private final String am = "api/creditcard/finalize/addorupdate";
    private final String an = "api/autopayment/activate";
    private final String ao = "api/creditcard/deactivate";
    private final String ap = "api/creditcard/details/initiate";
    private final String aq = "api/creditcard/details/finalize";
    private final String ar = "api/configurations/mobile";
    private final String as = "api/billing/downloadfromurl";
    private final String at = "api/payment/transferhistory";
    private final String au = "api/autopayment/prepaid/manage";
    private final String av = "api/creditcard/initate/addorupdate";
    private final String aw = "api/autopayment/prepaid/default";
    private final String ax = "api/creditcard/finalize/addorupdate";
    private final String ay = "https://te.eg/WebServices/REST/Store/getCities";
    private final String az = "https://te.eg/WebServices/REST/Store/getAreaByCityId/";
    private final String aA = "https://te.eg/WebServices/REST/Store/getStoreByAreaid/";
    private final String aB = "api/fmc/groupmemebers";
    private final String aC = "api/files/read?fileName=tt_status.json";
    private final String aD = "api/line/promisetopay/status";
    private final String aE = "api/family/create-family-group";
    private dio aG = new dio();
    public djb c = new djb();
    public djw d = new djw();
    public Gson a = new Gson();

    /* renamed from: djl$a */
    /* loaded from: classes2.dex */
    public enum a {
        MAIN_PLAN,
        AVAILABLE_PLANS,
        PROFILE
    }

    private djl(Context context) {
        this.aF = context;
        djj.a();
        this.b = bm.a(context, null);
    }

    public static synchronized djl a(Context context) {
        djl djlVar;
        synchronized (djl.class) {
            if (e == null) {
                e = new djl(context.getApplicationContext());
            }
            djlVar = e;
        }
        return djlVar;
    }

    public final void a() {
        this.b.a("api/line/servicesandfeatures");
    }

    public final void a(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        Header header = new Header();
        header.locale = this.c.c.k();
        header.msisdn = this.d.m();
        passwordBody passwordbody = new passwordBody();
        passwordbody.password = this.d.n();
        bj bjVar = new bj("https://api-my.te.eg/api/user/login", new JSONObject(this.a.a(new LoginRequest(header, passwordbody))), bVar, aVar) { // from class: djl.1
            @Override // defpackage.as
            public final Map<String, String> c() {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.h());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void b(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestViewMoreBundle requestViewMoreBundle = new RequestViewMoreBundle();
        RequestViewMoreBundleHeader requestViewMoreBundleHeader = new RequestViewMoreBundleHeader();
        requestViewMoreBundleHeader.setLocale(this.c.c.k());
        requestViewMoreBundleHeader.setMsisdn(this.d.m());
        requestViewMoreBundle.setHeader(requestViewMoreBundleHeader);
        RequestViewMoreBundleBody requestViewMoreBundleBody = new RequestViewMoreBundleBody();
        if (this.d.O()) {
            requestViewMoreBundleBody.setGroupId(this.d.N());
        }
        requestViewMoreBundle.setBody(requestViewMoreBundleBody);
        bj bjVar = new bj("https://api-my.te.eg/api/services/list/offers", new JSONObject(this.a.a(requestViewMoreBundle)), bVar, aVar) { // from class: djl.12
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void c(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        DefaultRequest defaultRequest = new DefaultRequest();
        defaultRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/regional/offers", new JSONObject(this.a.a(defaultRequest)), bVar, aVar) { // from class: djl.22
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.h = false;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void d(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        MainPlanRequest mainPlanRequest = new MainPlanRequest();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        mainPlanRequest.setHeader(mainRequestsHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/line/postpaid/balance", new JSONObject(this.a.a(mainPlanRequest)), bVar, aVar) { // from class: djl.33
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(String str, String str2, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        TransferAmountRequest transferAmountRequest = new TransferAmountRequest();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        transferAmountRequest.setHeader(mainRequestsHeader);
        transferAmountRequest.setBody(new TransferAmountBody(str, this.d.m(), str2));
        bj bjVar = new bj("https://api-my.te.eg/api/line/transferbalance/init", new JSONObject(this.a.a(transferAmountRequest)), bVar, aVar) { // from class: djl.43
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void e(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        GetProfileRequest getProfileRequest = new GetProfileRequest();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        getProfileRequest.setHeader(mainRequestsHeader);
        JSONObject jSONObject = new JSONObject(this.a.a(getProfileRequest));
        this.d.I();
        bj bjVar = new bj("https://api-my.te.eg/api/user/profile/postpiad", jSONObject, bVar, aVar) { // from class: djl.53
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void f(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        GetProfileRequest getProfileRequest = new GetProfileRequest();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        getProfileRequest.setHeader(mainRequestsHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/user/profile/prepaid", new JSONObject(this.a.a(getProfileRequest)), bVar, aVar) { // from class: djl.63
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void g(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        GetProfileRequest getProfileRequest = new GetProfileRequest();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        getProfileRequest.setHeader(mainRequestsHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/billing/queryOpenInvoices", new JSONObject(this.a.a(getProfileRequest)), bVar, aVar) { // from class: djl.74
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void h(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        GetProfileRequest getProfileRequest = new GetProfileRequest();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        getProfileRequest.setHeader(mainRequestsHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/billing/queryinvoices", new JSONObject(this.a.a(getProfileRequest)), bVar, aVar) { // from class: djl.76
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void i(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        GetProfileRequest getProfileRequest = new GetProfileRequest();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        getProfileRequest.setHeader(mainRequestsHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/billing/initqueryinvoicesURL", new JSONObject(this.a.a(getProfileRequest)), bVar, aVar) { // from class: djl.2
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestFinalizeBillSummary requestFinalizeBillSummary = new RequestFinalizeBillSummary();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        requestFinalizeBillSummary.setHeader(mainRequestsHeader);
        RequestFinalizeBillSummaryBody requestFinalizeBillSummaryBody = new RequestFinalizeBillSummaryBody();
        requestFinalizeBillSummaryBody.setConfirmationCode(str);
        requestFinalizeBillSummary.setBody(requestFinalizeBillSummaryBody);
        bj bjVar = new bj("https://api-my.te.eg/api/billing/finalizequeryinvoicesURL", new JSONObject(this.a.a(requestFinalizeBillSummary)), bVar, aVar) { // from class: djl.3
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void b(String str, au.b<byte[]> bVar, au.a aVar) throws JSONException {
        RequestDownloadInvoiceFromUrl requestDownloadInvoiceFromUrl = new RequestDownloadInvoiceFromUrl();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        requestDownloadInvoiceFromUrl.setHeader(mainRequestsHeader);
        RequestDownloadInvoiceFromUrlBody requestDownloadInvoiceFromUrlBody = new RequestDownloadInvoiceFromUrlBody();
        requestDownloadInvoiceFromUrlBody.setUrl(str);
        requestDownloadInvoiceFromUrl.setBody(requestDownloadInvoiceFromUrlBody);
        String a2 = this.a.a(requestDownloadInvoiceFromUrl);
        new JSONObject(a2);
        cyg cygVar = new cyg("https://api-my.te.eg/api/billing/downloadfromurl", a2, bVar, aVar) { // from class: djl.4
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        cygVar.l = a.MAIN_PLAN;
        cygVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) cygVar);
    }

    public final void b(String str, String str2, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        PaymentHistoryRequest paymentHistoryRequest = new PaymentHistoryRequest();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        PaymentHistoryPostPaidRequestBody paymentHistoryPostPaidRequestBody = new PaymentHistoryPostPaidRequestBody();
        paymentHistoryPostPaidRequestBody.setPaymentHistoryStartDate(str);
        paymentHistoryPostPaidRequestBody.setPaymentHistoryEndDate(str2);
        paymentHistoryRequest.setHeader(mainRequestsHeader);
        paymentHistoryRequest.setBody(paymentHistoryPostPaidRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/payment/paymenthistory", new JSONObject(this.a.a(paymentHistoryRequest)), bVar, aVar) { // from class: djl.5
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(String str, String str2, String str3, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        BalanceTransferHistoryRequest balanceTransferHistoryRequest = new BalanceTransferHistoryRequest();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        if (TextUtils.isEmpty(str)) {
            mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        } else {
            mainRequestsHeader.setMsisdn(Integer.parseInt(str));
        }
        BalanceTransferHistoryRequestBody balanceTransferHistoryRequestBody = new BalanceTransferHistoryRequestBody();
        balanceTransferHistoryRequestBody.setStartDate(str2);
        balanceTransferHistoryRequestBody.setEndDate(str3);
        balanceTransferHistoryRequest.setHeader(mainRequestsHeader);
        balanceTransferHistoryRequest.setBody(balanceTransferHistoryRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/payment/transferhistory", new JSONObject(this.a.a(balanceTransferHistoryRequest)), bVar, aVar) { // from class: djl.6
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void j(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        HomeCollectionRequestBody homeCollectionRequestBody = new HomeCollectionRequestBody();
        homeCollectionRequestBody.actionType = "add";
        HomeCollectionRequest homeCollectionRequest = new HomeCollectionRequest();
        homeCollectionRequest.setHeader(mainRequestsHeader);
        homeCollectionRequest.setBody(homeCollectionRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/services/homecollection", new JSONObject(this.a.a(homeCollectionRequest)), bVar, aVar) { // from class: djl.10
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void k(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        HomeCollectionRequestBody homeCollectionRequestBody = new HomeCollectionRequestBody();
        homeCollectionRequestBody.actionType = "delete";
        HomeCollectionRequest homeCollectionRequest = new HomeCollectionRequest();
        homeCollectionRequest.setHeader(mainRequestsHeader);
        homeCollectionRequest.setBody(homeCollectionRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/services/homecollection", new JSONObject(this.a.a(homeCollectionRequest)), bVar, aVar) { // from class: djl.11
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(MigrateOffers migrateOffers, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        MigrateRequestBody migrateRequestBody = new MigrateRequestBody();
        migrateRequestBody.offerId = migrateOffers.offerId;
        migrateRequestBody.parentOfferId = migrateOffers.parentOfferId;
        MigrateRequest migrateRequest = new MigrateRequest();
        migrateRequest.setHeader(requestHeader);
        migrateRequest.setBody(migrateRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/services/change/mainoffers", new JSONObject(this.a.a(migrateRequest)), bVar, aVar) { // from class: djl.13
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void c(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        GetTicketBody getTicketBody = new GetTicketBody();
        getTicketBody.setTicketNumber(str);
        GetTicketRequest getTicketRequest = new GetTicketRequest();
        getTicketRequest.setHeader(requestHeader);
        getTicketRequest.setBody(getTicketBody);
        bj bjVar = new bj("https://api-my.te.eg/api/customerservice/ticket/status", new JSONObject(this.a.a(getTicketRequest)), bVar, aVar) { // from class: djl.14
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(SubmitTicketRequestBody submitTicketRequestBody, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        SubmitTicketRequest submitTicketRequest = new SubmitTicketRequest();
        submitTicketRequest.setBody(submitTicketRequestBody);
        submitTicketRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/customerservice/ticket/submit", new JSONObject(this.a.a(submitTicketRequest)), bVar, aVar) { // from class: djl.15
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void l(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.C());
        GetTicketRequest getTicketRequest = new GetTicketRequest();
        getTicketRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/line/associatedlines", new JSONObject(this.a.a(getTicketRequest)), bVar, aVar) { // from class: djl.16
            @Override // defpackage.as
            public final Map<String, String> c() {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.J());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void d(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        NumberAccessInitializeRequest numberAccessInitializeRequest = new NumberAccessInitializeRequest();
        NumberAccessInitializeRequestBody numberAccessInitializeRequestBody = new NumberAccessInitializeRequestBody();
        numberAccessInitializeRequestBody.setSourceMsisdn(this.d.m());
        numberAccessInitializeRequestBody.setTargetMsisdn(str);
        numberAccessInitializeRequest.setBody(numberAccessInitializeRequestBody);
        numberAccessInitializeRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/account/initiate", new JSONObject(this.a.a(numberAccessInitializeRequest)), bVar, aVar) { // from class: djl.17
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void b(String str, String str2, String str3, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        NumberAccessFinalizeRequest numberAccessFinalizeRequest = new NumberAccessFinalizeRequest();
        numberAccessFinalizeRequest.setHeader(requestHeader);
        NumberAccessFinalizeRequestBody numberAccessFinalizeRequestBody = new NumberAccessFinalizeRequestBody();
        numberAccessFinalizeRequestBody.actionType = str3;
        numberAccessFinalizeRequestBody.confirmationCode = str;
        numberAccessFinalizeRequestBody.sourceMsisdn = this.d.r();
        numberAccessFinalizeRequestBody.targetMsisdn = str2;
        numberAccessFinalizeRequest.setBody(numberAccessFinalizeRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/account/finalize", new JSONObject(this.a.a(numberAccessFinalizeRequest)), bVar, aVar) { // from class: djl.18
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                djl.this.d.J();
                hashMap.put("Jwt", djl.this.d.J());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void e(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        SetBillLimitRequest setBillLimitRequest = new SetBillLimitRequest();
        RequestSetBillLimitHeader requestSetBillLimitHeader = new RequestSetBillLimitHeader();
        requestSetBillLimitHeader.setLocale(this.c.c.k());
        requestSetBillLimitHeader.setMsisdn(this.d.m());
        setBillLimitRequest.setHeader(requestSetBillLimitHeader);
        RequestSetBillLimitBody requestSetBillLimitBody = new RequestSetBillLimitBody();
        requestSetBillLimitBody.setActionType("add");
        if (this.aG.l() && this.d.X().size() > 0) {
            requestSetBillLimitBody.setMobileNumber(this.d.X().get(0));
        } else {
            requestSetBillLimitBody.setMobileNumber(this.d.m());
        }
        requestSetBillLimitBody.setConsumptionLimit(str);
        requestSetBillLimitBody.setNotifyLimit(String.valueOf(Math.round(Integer.valueOf(str).intValue() / 1.0f)));
        requestSetBillLimitBody.setServiceType("");
        setBillLimitRequest.setBody(requestSetBillLimitBody);
        bj bjVar = new bj("https://api-my.te.eg/api/line/manageconsumptionlimit", new JSONObject(this.a.a(setBillLimitRequest)), bVar, aVar) { // from class: djl.20
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void m(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestViewBillLimit requestViewBillLimit = new RequestViewBillLimit();
        RequestViewBillLimitHeader requestViewBillLimitHeader = new RequestViewBillLimitHeader();
        requestViewBillLimitHeader.setLocale(this.c.c.k());
        requestViewBillLimitHeader.setMsisdn(this.d.m());
        requestViewBillLimit.setHeader(requestViewBillLimitHeader);
        RequestViewBillLimitBody requestViewBillLimitBody = new RequestViewBillLimitBody();
        if (this.aG.l() && this.d.X().size() > 0) {
            requestViewBillLimitBody.setMsisdn(this.d.X().get(0));
        } else {
            requestViewBillLimitBody.setMsisdn(this.d.m());
        }
        requestViewBillLimit.setBody(requestViewBillLimitBody);
        bj bjVar = new bj("https://api-my.te.eg/api/line/consumptionlimit", new JSONObject(this.a.a(requestViewBillLimit)), bVar, aVar) { // from class: djl.21
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(boolean z, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestViewMoreBundle requestViewMoreBundle = new RequestViewMoreBundle();
        RequestViewMoreBundleHeader requestViewMoreBundleHeader = new RequestViewMoreBundleHeader();
        requestViewMoreBundleHeader.setLocale(this.c.c.k());
        if (this.aG.l() && !TextUtils.isEmpty(this.d.W()) && !this.d.W().equalsIgnoreCase(this.aF.getString(R.string.fmc_group_tag))) {
            requestViewMoreBundleHeader.setMsisdn(this.d.W());
        } else {
            requestViewMoreBundleHeader.setMsisdn(this.d.m());
        }
        requestViewMoreBundle.setHeader(requestViewMoreBundleHeader);
        RequestViewMoreBundleBody requestViewMoreBundleBody = new RequestViewMoreBundleBody();
        if (z) {
            requestViewMoreBundleBody.setGroupId(this.d.N());
            requestViewMoreBundleHeader.setMsisdn(this.d.m());
        }
        requestViewMoreBundle.setBody(requestViewMoreBundleBody);
        bj bjVar = new bj("https://api-my.te.eg/api/services/list/offers/subscribed", new JSONObject(this.a.a(requestViewMoreBundle)), bVar, aVar) { // from class: djl.23
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void b(boolean z, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        this.d.I();
        RequestRetrieveMoreBundle requestRetrieveMoreBundle = new RequestRetrieveMoreBundle();
        RequestRetrieveMoreBundleHeader requestRetrieveMoreBundleHeader = new RequestRetrieveMoreBundleHeader();
        requestRetrieveMoreBundleHeader.setLocale(this.c.c.k());
        if (this.aG.l() && !TextUtils.isEmpty(this.d.W()) && !this.d.W().equalsIgnoreCase(this.aF.getString(R.string.fmc_group_tag))) {
            requestRetrieveMoreBundleHeader.setMsisdn(this.d.W());
        } else {
            requestRetrieveMoreBundleHeader.setMsisdn(this.d.m());
        }
        requestRetrieveMoreBundle.setHeader(requestRetrieveMoreBundleHeader);
        RequestRetrieveMoreBundleBody requestRetrieveMoreBundleBody = new RequestRetrieveMoreBundleBody();
        if (z) {
            requestRetrieveMoreBundleHeader.setMsisdn(this.d.m());
            requestRetrieveMoreBundleBody.setGroupId(this.d.N());
        }
        requestRetrieveMoreBundle.setBody(requestRetrieveMoreBundleBody);
        bj bjVar = new bj("https://api-my.te.eg/api/services/list/offers/addon", new JSONObject(this.a.a(requestRetrieveMoreBundle)), bVar, aVar) { // from class: djl.24
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(100000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(ArrayList<Offer> arrayList, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        this.d.I();
        RequestUnsubscribeFromMoreBundle requestUnsubscribeFromMoreBundle = new RequestUnsubscribeFromMoreBundle();
        RequestUnsubscribeFromMoreBundleHeader requestUnsubscribeFromMoreBundleHeader = new RequestUnsubscribeFromMoreBundleHeader();
        requestUnsubscribeFromMoreBundleHeader.setLocale(this.c.c.k());
        if (this.aG.l() && !TextUtils.isEmpty(this.d.W()) && !this.d.W().equalsIgnoreCase(this.aF.getString(R.string.fmc_group_tag))) {
            requestUnsubscribeFromMoreBundleHeader.setMsisdn(this.d.W());
        } else {
            requestUnsubscribeFromMoreBundleHeader.setMsisdn(this.d.m());
        }
        requestUnsubscribeFromMoreBundle.setHeader(requestUnsubscribeFromMoreBundleHeader);
        RequestUnsubscribeFromMoreBundleBody requestUnsubscribeFromMoreBundleBody = new RequestUnsubscribeFromMoreBundleBody();
        if (this.aG.l() && !TextUtils.isEmpty(this.d.W())) {
            if (this.d.W().equalsIgnoreCase(this.aF.getString(R.string.fmc_group_tag))) {
                requestUnsubscribeFromMoreBundleBody.setMsisdn(this.d.m());
                requestUnsubscribeFromMoreBundleBody.setGroupId(this.d.N());
            } else {
                requestUnsubscribeFromMoreBundleBody.setMsisdn(this.d.W());
            }
        } else {
            requestUnsubscribeFromMoreBundleBody.setMsisdn(this.d.m());
        }
        requestUnsubscribeFromMoreBundleBody.setOffers(arrayList);
        requestUnsubscribeFromMoreBundle.setBody(requestUnsubscribeFromMoreBundleBody);
        bj bjVar = new bj("https://api-my.te.eg/api/services/change/suppoffers", new JSONObject(this.a.a(requestUnsubscribeFromMoreBundle)), bVar, aVar) { // from class: djl.25
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void f(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        ViewPreferredNumberRequest viewPreferredNumberRequest = new ViewPreferredNumberRequest();
        ViewPreferredNumberRequestHeader viewPreferredNumberRequestHeader = new ViewPreferredNumberRequestHeader();
        viewPreferredNumberRequestHeader.setLocale(this.c.c.k());
        if (TextUtils.isEmpty(str)) {
            viewPreferredNumberRequestHeader.setMsisdn(this.d.m());
        } else {
            viewPreferredNumberRequestHeader.setMsisdn(str);
        }
        viewPreferredNumberRequest.setHeader(viewPreferredNumberRequestHeader);
        viewPreferredNumberRequest.setBody(new ViewPreferredNumberRequestBody());
        bj bjVar = new bj("https://api-my.te.eg/api/friendsandfamily/viewmembers", new JSONObject(this.a.a(viewPreferredNumberRequest)), bVar, aVar) { // from class: djl.26
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void c(String str, String str2, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        AddPreferredNumberRequest addPreferredNumberRequest = new AddPreferredNumberRequest();
        AddPreferredNumberRequestHeader addPreferredNumberRequestHeader = new AddPreferredNumberRequestHeader();
        addPreferredNumberRequestHeader.setLocale(this.c.c.k());
        if (TextUtils.isEmpty(str)) {
            addPreferredNumberRequestHeader.setMsisdn(this.d.m());
        } else {
            addPreferredNumberRequestHeader.setMsisdn(str);
        }
        addPreferredNumberRequest.setHeader(addPreferredNumberRequestHeader);
        AddPreferredNumberRequestBody addPreferredNumberRequestBody = new AddPreferredNumberRequestBody();
        addPreferredNumberRequestBody.setMobileNumber(str2);
        addPreferredNumberRequest.setBody(addPreferredNumberRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/friendsandfamily/addmember", new JSONObject(this.a.a(addPreferredNumberRequest)), bVar, aVar) { // from class: djl.27
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void g(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        SetBillLimitRequest setBillLimitRequest = new SetBillLimitRequest();
        RequestSetBillLimitHeader requestSetBillLimitHeader = new RequestSetBillLimitHeader();
        requestSetBillLimitHeader.setLocale(this.c.c.k());
        requestSetBillLimitHeader.setMsisdn(this.d.m());
        setBillLimitRequest.setHeader(requestSetBillLimitHeader);
        RequestSetBillLimitBody requestSetBillLimitBody = new RequestSetBillLimitBody();
        requestSetBillLimitBody.setActionType("delete");
        if (this.aG.l() && this.d.X().size() > 0) {
            requestSetBillLimitBody.setMobileNumber(this.d.X().get(0));
        } else {
            requestSetBillLimitBody.setMobileNumber(this.d.m());
        }
        requestSetBillLimitBody.setConsumptionLimit(str);
        requestSetBillLimitBody.setNotifyLimit(str);
        requestSetBillLimitBody.setServiceType("");
        setBillLimitRequest.setBody(requestSetBillLimitBody);
        bj bjVar = new bj("https://api-my.te.eg/api/line/manageconsumptionlimit", new JSONObject(this.a.a(setBillLimitRequest)), bVar, aVar) { // from class: djl.32
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void h(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        SetBillLimitRequest setBillLimitRequest = new SetBillLimitRequest();
        RequestSetBillLimitHeader requestSetBillLimitHeader = new RequestSetBillLimitHeader();
        requestSetBillLimitHeader.setLocale(this.c.c.k());
        requestSetBillLimitHeader.setMsisdn(this.d.m());
        setBillLimitRequest.setHeader(requestSetBillLimitHeader);
        RequestSetBillLimitBody requestSetBillLimitBody = new RequestSetBillLimitBody();
        requestSetBillLimitBody.setActionType("update");
        if (this.aG.l() && this.d.X().size() > 0) {
            requestSetBillLimitBody.setMobileNumber(this.d.X().get(0));
        } else {
            requestSetBillLimitBody.setMobileNumber(this.d.m());
        }
        requestSetBillLimitBody.setConsumptionLimit(str);
        requestSetBillLimitBody.setNotifyLimit(str);
        requestSetBillLimitBody.setServiceType("");
        setBillLimitRequest.setBody(requestSetBillLimitBody);
        bj bjVar = new bj("https://api-my.te.eg/api/line/manageconsumptionlimit", new JSONObject(this.a.a(setBillLimitRequest)), bVar, aVar) { // from class: djl.34
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void i(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        UpdateProfileMail updateProfileMail = new UpdateProfileMail();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        updateProfileMail.setHeader(mainRequestsHeader);
        UpdateProfileMailBody updateProfileMailBody = new UpdateProfileMailBody();
        updateProfileMailBody.email = str;
        updateProfileMail.setBody(updateProfileMailBody);
        bj bjVar = new bj("https://api-my.te.eg/api/user/profile/postpaid/customerinfo/update", new JSONObject(this.a.a(updateProfileMail)), bVar, aVar) { // from class: djl.36
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void j(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        SetBillLimitRequest setBillLimitRequest = new SetBillLimitRequest();
        RequestSetBillLimitHeader requestSetBillLimitHeader = new RequestSetBillLimitHeader();
        requestSetBillLimitHeader.setLocale(this.c.c.k());
        if (TextUtils.isEmpty(str)) {
            requestSetBillLimitHeader.setMsisdn(this.d.m());
        } else {
            requestSetBillLimitHeader.setMsisdn(str);
        }
        setBillLimitRequest.setHeader(requestSetBillLimitHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/friendsandfamily/status", new JSONObject(this.a.a(setBillLimitRequest)), bVar, aVar) { // from class: djl.37
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void n(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        SetBillLimitRequest setBillLimitRequest = new SetBillLimitRequest();
        RequestSetBillLimitHeader requestSetBillLimitHeader = new RequestSetBillLimitHeader();
        requestSetBillLimitHeader.setLocale(this.c.c.k());
        requestSetBillLimitHeader.setMsisdn(this.d.m());
        requestSetBillLimitHeader.setCustomerId(djv.a("customerId", ""));
        setBillLimitRequest.setHeader(requestSetBillLimitHeader);
        setBillLimitRequest.setBody(new RequestSetBillLimitBody());
        bj bjVar = new bj("https://api-my.te.eg/api/autopayment/checkstatus", new JSONObject(this.a.a(setBillLimitRequest)), bVar, aVar) { // from class: djl.38
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void o(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        SetBillLimitRequest setBillLimitRequest = new SetBillLimitRequest();
        RequestSetBillLimitHeader requestSetBillLimitHeader = new RequestSetBillLimitHeader();
        requestSetBillLimitHeader.setLocale(this.c.c.k());
        requestSetBillLimitHeader.setMsisdn(this.d.m());
        setBillLimitRequest.setHeader(requestSetBillLimitHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/services/homecollection/status", new JSONObject(this.a.a(setBillLimitRequest)), bVar, aVar) { // from class: djl.39
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void p(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        DefaultRequest defaultRequest = new DefaultRequest();
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setCustomerId(djv.a("customerId", ""));
        requestHeader.setMsisdn(this.d.m());
        defaultRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/autopayment/deactivate", new JSONObject(this.a.a(defaultRequest)), bVar, aVar) { // from class: djl.40
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void q(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        DefaultRequest defaultRequest = new DefaultRequest();
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setCustomerId(djv.a("customerId", ""));
        requestHeader.setMsisdn(this.d.m());
        defaultRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/creditcard/deactivate", new JSONObject(this.a.a(defaultRequest)), bVar, aVar) { // from class: djl.41
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void r(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        AutoPaymentAddCreditCardInitializeRequest autoPaymentAddCreditCardInitializeRequest = new AutoPaymentAddCreditCardInitializeRequest();
        AutoPaymentAddCreditCardInitializeRequestHeader autoPaymentAddCreditCardInitializeRequestHeader = new AutoPaymentAddCreditCardInitializeRequestHeader();
        autoPaymentAddCreditCardInitializeRequestHeader.setLocale(this.c.c.k());
        autoPaymentAddCreditCardInitializeRequestHeader.setCustomerId(djv.a("customerId", ""));
        autoPaymentAddCreditCardInitializeRequestHeader.setMsisdn(this.d.m());
        autoPaymentAddCreditCardInitializeRequest.setHeader(autoPaymentAddCreditCardInitializeRequestHeader);
        AutoPaymentAddCreditCardInitializeRequestBody autoPaymentAddCreditCardInitializeRequestBody = new AutoPaymentAddCreditCardInitializeRequestBody();
        autoPaymentAddCreditCardInitializeRequestBody.setOperationType("add");
        autoPaymentAddCreditCardInitializeRequestBody.setRedirectionURL("https://my.te.eg/#/payment/autopayment");
        autoPaymentAddCreditCardInitializeRequest.setBody(autoPaymentAddCreditCardInitializeRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/creditcard/initate/addorupdate", new JSONObject(this.a.a(autoPaymentAddCreditCardInitializeRequest)), bVar, aVar) { // from class: djl.42
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(int i, int i2, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        AutoPaymentAddCreditCardInitializeRequest autoPaymentAddCreditCardInitializeRequest = new AutoPaymentAddCreditCardInitializeRequest();
        AutoPaymentAddCreditCardInitializeRequestHeader autoPaymentAddCreditCardInitializeRequestHeader = new AutoPaymentAddCreditCardInitializeRequestHeader();
        autoPaymentAddCreditCardInitializeRequestHeader.setLocale(this.c.c.k());
        autoPaymentAddCreditCardInitializeRequestHeader.setCustomerId(djv.a("customerId", ""));
        autoPaymentAddCreditCardInitializeRequestHeader.setMsisdn(this.d.m());
        autoPaymentAddCreditCardInitializeRequest.setHeader(autoPaymentAddCreditCardInitializeRequestHeader);
        AutoPaymentAddCreditCardInitializeRequestBody autoPaymentAddCreditCardInitializeRequestBody = new AutoPaymentAddCreditCardInitializeRequestBody();
        autoPaymentAddCreditCardInitializeRequestBody.setOperationType("add");
        autoPaymentAddCreditCardInitializeRequestBody.setRedirectionURL("https://my.te.eg/#/payment/autopayment");
        autoPaymentAddCreditCardInitializeRequestBody.setAutoRechargeDay(i2);
        autoPaymentAddCreditCardInitializeRequestBody.setAutoRechargeAmount(i);
        autoPaymentAddCreditCardInitializeRequest.setBody(autoPaymentAddCreditCardInitializeRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/creditcard/initate/addorupdate", new JSONObject(this.a.a(autoPaymentAddCreditCardInitializeRequest)), bVar, aVar) { // from class: djl.44
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void s(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        AutoPaymentAddCreditCardInitializeRequest autoPaymentAddCreditCardInitializeRequest = new AutoPaymentAddCreditCardInitializeRequest();
        AutoPaymentAddCreditCardInitializeRequestHeader autoPaymentAddCreditCardInitializeRequestHeader = new AutoPaymentAddCreditCardInitializeRequestHeader();
        autoPaymentAddCreditCardInitializeRequestHeader.setLocale(this.c.c.k());
        autoPaymentAddCreditCardInitializeRequestHeader.setCustomerId(djv.a("customerId", ""));
        autoPaymentAddCreditCardInitializeRequestHeader.setMsisdn(this.d.m());
        autoPaymentAddCreditCardInitializeRequest.setHeader(autoPaymentAddCreditCardInitializeRequestHeader);
        AutoPaymentAddCreditCardInitializeRequestBody autoPaymentAddCreditCardInitializeRequestBody = new AutoPaymentAddCreditCardInitializeRequestBody();
        autoPaymentAddCreditCardInitializeRequestBody.setOperationType("update");
        autoPaymentAddCreditCardInitializeRequestBody.setRedirectionURL("https://my.te.eg/#/payment/autopayment");
        autoPaymentAddCreditCardInitializeRequest.setBody(autoPaymentAddCreditCardInitializeRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/creditcard/initate/addorupdate", new JSONObject(this.a.a(autoPaymentAddCreditCardInitializeRequest)), bVar, aVar) { // from class: djl.45
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void t(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        AutoPaymentAddCreditCardInitializeRequest autoPaymentAddCreditCardInitializeRequest = new AutoPaymentAddCreditCardInitializeRequest();
        AutoPaymentAddCreditCardInitializeRequestHeader autoPaymentAddCreditCardInitializeRequestHeader = new AutoPaymentAddCreditCardInitializeRequestHeader();
        autoPaymentAddCreditCardInitializeRequestHeader.setLocale(this.c.c.k());
        autoPaymentAddCreditCardInitializeRequestHeader.setCustomerId(djv.a("customerId", ""));
        autoPaymentAddCreditCardInitializeRequestHeader.setMsisdn(this.d.m());
        autoPaymentAddCreditCardInitializeRequest.setHeader(autoPaymentAddCreditCardInitializeRequestHeader);
        JSONObject jSONObject = new JSONObject(this.a.a(autoPaymentAddCreditCardInitializeRequest));
        this.d.I();
        bj bjVar = new bj("https://api-my.te.eg/api/autopayment/prepaid/default", jSONObject, bVar, aVar) { // from class: djl.46
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(boolean z, String str, String str2, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        AutoPaymentAddCreditCardFinalizeRequest autoPaymentAddCreditCardFinalizeRequest = new AutoPaymentAddCreditCardFinalizeRequest();
        AutoPaymentAddCreditCardFinalizeRequestHeader autoPaymentAddCreditCardFinalizeRequestHeader = new AutoPaymentAddCreditCardFinalizeRequestHeader();
        autoPaymentAddCreditCardFinalizeRequestHeader.setLocale(this.c.c.k());
        autoPaymentAddCreditCardFinalizeRequestHeader.setCustomerId(djv.a("customerId", ""));
        autoPaymentAddCreditCardFinalizeRequestHeader.setMsisdn(this.d.m());
        autoPaymentAddCreditCardFinalizeRequest.setHeader(autoPaymentAddCreditCardFinalizeRequestHeader);
        AutoPaymentAddCreditCardFinalizeRequestBody autoPaymentAddCreditCardFinalizeRequestBody = new AutoPaymentAddCreditCardFinalizeRequestBody();
        autoPaymentAddCreditCardFinalizeRequestBody.setTopgManageCCTransactionId(str);
        autoPaymentAddCreditCardFinalizeRequestBody.setValidateConfirmation(z);
        autoPaymentAddCreditCardFinalizeRequestBody.setConfirmationCode(str2);
        autoPaymentAddCreditCardFinalizeRequest.setBody(autoPaymentAddCreditCardFinalizeRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/creditcard/finalize/addorupdate", new JSONObject(this.a.a(autoPaymentAddCreditCardFinalizeRequest)), bVar, aVar) { // from class: djl.47
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void u(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        DefaultRequest defaultRequest = new DefaultRequest();
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        defaultRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/creditcard/details/initiate", new JSONObject(this.a.a(defaultRequest)), bVar, aVar) { // from class: djl.48
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void k(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestFinalizeBillSummary requestFinalizeBillSummary = new RequestFinalizeBillSummary();
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(this.c.c.k());
        mainRequestsHeader.setCustomerId(djv.a("customerId", ""));
        mainRequestsHeader.setMsisdn(Integer.parseInt(this.d.m()));
        requestFinalizeBillSummary.setHeader(mainRequestsHeader);
        RequestFinalizeBillSummaryBody requestFinalizeBillSummaryBody = new RequestFinalizeBillSummaryBody();
        requestFinalizeBillSummaryBody.setConfirmationCode(str);
        requestFinalizeBillSummary.setBody(requestFinalizeBillSummaryBody);
        bj bjVar = new bj("https://api-my.te.eg/api/creditcard/details/finalize", new JSONObject(this.a.a(requestFinalizeBillSummary)), bVar, aVar) { // from class: djl.49
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void d(String str, String str2, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RenewMainOfferRequest renewMainOfferRequest = new RenewMainOfferRequest();
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        RenewMainOfferRequestBody renewMainOfferRequestBody = new RenewMainOfferRequestBody();
        renewMainOfferRequestBody.setParentOfferId(str2);
        renewMainOfferRequestBody.setOfferId(str);
        renewMainOfferRequest.setBody(renewMainOfferRequestBody);
        renewMainOfferRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/services/change/mainoffers", new JSONObject(this.a.a(renewMainOfferRequest)), bVar, aVar) { // from class: djl.50
            @Override // defpackage.as
            public final Map<String, String> c() {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(String str, String str2, boolean z, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        LinkToSocialRequestBody linkToSocialRequestBody = new LinkToSocialRequestBody();
        linkToSocialRequestBody.setProviderName(str2);
        linkToSocialRequestBody.setSocialUserToken(str);
        linkToSocialRequestBody.setSocialLogin(z);
        if (str2.equalsIgnoreCase("FACEBOOK")) {
            linkToSocialRequestBody.setTokenType(0);
        } else {
            linkToSocialRequestBody.setTokenType(1);
        }
        LinkToSocialRequest linkToSocialRequest = new LinkToSocialRequest();
        linkToSocialRequest.setHeader(requestHeader);
        linkToSocialRequest.setBody(linkToSocialRequestBody);
        JSONObject jSONObject = new JSONObject(this.a.a(linkToSocialRequest));
        this.d.I();
        bj bjVar = new bj("https://api-my.te.eg/api/social/link", jSONObject, bVar, aVar) { // from class: djl.51
            @Override // defpackage.as
            public final Map<String, String> c() {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void l(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        LinkToSocialRequestBody linkToSocialRequestBody = new LinkToSocialRequestBody();
        linkToSocialRequestBody.setProviderName(str);
        LinkToSocialRequest linkToSocialRequest = new LinkToSocialRequest();
        linkToSocialRequest.setHeader(requestHeader);
        linkToSocialRequest.setBody(linkToSocialRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/social/unlink", new JSONObject(this.a.a(linkToSocialRequest)), bVar, aVar) { // from class: djl.52
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void v(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        DefaultRequest defaultRequest = new DefaultRequest();
        defaultRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/social/status", new JSONObject(this.a.a(defaultRequest)), bVar, aVar) { // from class: djl.54
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(int i, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        String str = "https://api-my.te.eg/api/user/signup/initiate";
        if (i == 1) {
            str = "https://api-my.te.eg/api/user/resetpassword/initiate";
        }
        String str2 = str;
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        DefaultRequest defaultRequest = new DefaultRequest();
        defaultRequest.setHeader(requestHeader);
        bj bjVar = new bj(str2, new JSONObject(this.a.a(defaultRequest)), bVar, aVar) { // from class: djl.55
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.h());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void m(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        LinkToSocialRequestBody linkToSocialRequestBody = new LinkToSocialRequestBody();
        linkToSocialRequestBody.setProviderName(str);
        LinkToSocialRequest linkToSocialRequest = new LinkToSocialRequest();
        linkToSocialRequest.setHeader(requestHeader);
        linkToSocialRequest.setBody(linkToSocialRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/social/enableLogin", new JSONObject(this.a.a(linkToSocialRequest)), bVar, aVar) { // from class: djl.56
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void e(String str, String str2, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        if (this.d.k().equals("")) {
            this.d.c("en");
        }
        requestHeader.setLocale(this.c.c.k());
        LinkToSocialRequestBody linkToSocialRequestBody = new LinkToSocialRequestBody();
        linkToSocialRequestBody.setProviderName(str2);
        linkToSocialRequestBody.setSocialUserToken(str);
        if (str2.equalsIgnoreCase("GOOGLE") || str2.equalsIgnoreCase("HUAWEI")) {
            linkToSocialRequestBody.setTokenType(1);
        } else {
            linkToSocialRequestBody.setTokenType(0);
        }
        LinkToSocialRequest linkToSocialRequest = new LinkToSocialRequest();
        linkToSocialRequest.setHeader(requestHeader);
        linkToSocialRequest.setBody(linkToSocialRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/social/login", new JSONObject(this.a.a(linkToSocialRequest)), bVar, aVar) { // from class: djl.57
            @Override // defpackage.as
            public final Map<String, String> c() {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.h());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void a(FirebaseNotificationRequestBody firebaseNotificationRequestBody, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        if (TextUtils.isEmpty(firebaseNotificationRequestBody.getFireBaseToken())) {
            return;
        }
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        FirebaseNotificationRequest firebaseNotificationRequest = new FirebaseNotificationRequest();
        firebaseNotificationRequest.setHeader(requestHeader);
        firebaseNotificationRequest.setBody(firebaseNotificationRequestBody);
        JSONObject jSONObject = new JSONObject(this.a.a(firebaseNotificationRequest));
        this.d.I();
        bj bjVar = new bj("https://api-my.te.eg/api/pushnotification/addorupdateordelete", jSONObject, bVar, aVar) { // from class: djl.58
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void f(String str, String str2, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        UpdateContactInfoRequestBody updateContactInfoRequestBody = new UpdateContactInfoRequestBody();
        updateContactInfoRequestBody.setContactNumber(str2);
        updateContactInfoRequestBody.setPreferredLanguage(str);
        UpdateContactInfoRequest updateContactInfoRequest = new UpdateContactInfoRequest();
        updateContactInfoRequest.setHeader(requestHeader);
        updateContactInfoRequest.setBody(updateContactInfoRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/user/contactinfo/update", new JSONObject(this.a.a(updateContactInfoRequest)), bVar, aVar) { // from class: djl.60
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void w(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        DefaultRequest defaultRequest = new DefaultRequest();
        defaultRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/services/salfny", new JSONObject(this.a.a(defaultRequest)), bVar, aVar) { // from class: djl.61
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void n(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        RegionalProductDismissRequest regionalProductDismissRequest = new RegionalProductDismissRequest();
        regionalProductDismissRequest.setHeader(requestHeader);
        regionalProductDismissRequest.setBody(str);
        bj bjVar = new bj("https://api-my.te.eg/api/regional/offers/dismiss", new JSONObject(this.a.a(regionalProductDismissRequest)), bVar, aVar) { // from class: djl.64
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void o(String str, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        SetBillLimitRequest setBillLimitRequest = new SetBillLimitRequest();
        RequestSetBillLimitHeader requestSetBillLimitHeader = new RequestSetBillLimitHeader();
        requestSetBillLimitHeader.setLocale(this.c.c.k());
        requestSetBillLimitHeader.setMsisdn(str);
        setBillLimitRequest.setHeader(requestSetBillLimitHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/user/switch", new JSONObject(this.a.a(setBillLimitRequest)), bVar, aVar) { // from class: djl.66
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.J());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void b(int i, int i2, au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        UpdateAutoRechargeRequest updateAutoRechargeRequest = new UpdateAutoRechargeRequest();
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        updateAutoRechargeRequest.setHeader(requestHeader);
        UpdateAutoRechargeRequestBody updateAutoRechargeRequestBody = new UpdateAutoRechargeRequestBody();
        updateAutoRechargeRequestBody.setAction("modify");
        updateAutoRechargeRequestBody.setAmount(i2);
        updateAutoRechargeRequestBody.setDay(i);
        updateAutoRechargeRequest.setBody(updateAutoRechargeRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/autopayment/prepaid/manage", new JSONObject(this.a.a(updateAutoRechargeRequest)), bVar, aVar) { // from class: djl.70
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void x(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        UpdateAutoRechargeRequest updateAutoRechargeRequest = new UpdateAutoRechargeRequest();
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        updateAutoRechargeRequest.setHeader(requestHeader);
        UpdateAutoRechargeRequestBody updateAutoRechargeRequestBody = new UpdateAutoRechargeRequestBody();
        updateAutoRechargeRequestBody.setAction("delete");
        updateAutoRechargeRequest.setBody(updateAutoRechargeRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/autopayment/prepaid/manage", new JSONObject(this.a.a(updateAutoRechargeRequest)), bVar, aVar) { // from class: djl.71
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void y(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        FMCMembersRequest fMCMembersRequest = new FMCMembersRequest();
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        fMCMembersRequest.setHeader(requestHeader);
        FMCMembersRequestBody fMCMembersRequestBody = new FMCMembersRequestBody();
        fMCMembersRequestBody.setGroupId(this.d.N());
        PaginationModel paginationModel = new PaginationModel();
        paginationModel.setBeginRecord(0);
        paginationModel.setRecordsInPage(0);
        fMCMembersRequestBody.setPaginationModel(paginationModel);
        fMCMembersRequest.setFmcMembersRequestBody(fMCMembersRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/fmc/groupmemebers", new JSONObject(this.a.a(fMCMembersRequest)), bVar, aVar) { // from class: djl.72
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }

    public final void z(au.b<JSONObject> bVar, au.a aVar) throws JSONException {
        DefaultRequest defaultRequest = new DefaultRequest();
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setLocale(this.c.c.k());
        requestHeader.setMsisdn(this.d.m());
        defaultRequest.setHeader(requestHeader);
        bj bjVar = new bj("https://api-my.te.eg/api/line/promisetopay/status", new JSONObject(this.a.a(defaultRequest)), bVar, aVar) { // from class: djl.73
            @Override // defpackage.as
            public final Map<String, String> c() throws AuthFailureError {
                HashMap hashMap = new HashMap();
                hashMap.put("Jwt", djl.this.d.I());
                return hashMap;
            }
        };
        bjVar.l = a.MAIN_PLAN;
        bjVar.j = new am(60000, 0, 0.0f);
        this.b.a((as) bjVar);
    }
}
