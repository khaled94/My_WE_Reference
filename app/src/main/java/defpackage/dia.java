package defpackage;

import android.content.Context;
import com.ucare.we.R;
import com.ucare.we.model.CardRechargeRequestBody;
import com.ucare.we.model.CardRechargeResponseBody;
import com.ucare.we.model.CreditCardFinalizeRequestBody;
import com.ucare.we.model.CreditCardFinalizeResponseBody;
import com.ucare.we.model.CreditCardInitResponseBody;
import com.ucare.we.model.PaymentHistoryRequestBody;
import com.ucare.we.model.PaymentHistoryResponseBody;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* renamed from: dia  reason: default package */
/* loaded from: classes2.dex */
public final class dia extends czz {
    @Inject
    protected diq a;
    @Inject
    dio c;
    @Inject
    djb d;
    @Inject
    djw e;
    @Inject
    Context f;
    private List<PaymentHistoryResponseBody> k;
    protected efa<ServerResponse<CardRechargeResponseBody>> g = new efa<ServerResponse<CardRechargeResponseBody>>() { // from class: dia.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<CardRechargeResponseBody>> eeyVar, efn<ServerResponse<CardRechargeResponseBody>> efnVar) {
            dia.a(dia.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<CardRechargeResponseBody>> eeyVar, Throwable th) {
            dia.a(dia.this, th);
        }
    };
    protected efa<ServerResponse<CreditCardInitResponseBody>> h = new efa<ServerResponse<CreditCardInitResponseBody>>() { // from class: dia.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<CreditCardInitResponseBody>> eeyVar, efn<ServerResponse<CreditCardInitResponseBody>> efnVar) {
            dia.b(dia.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<CreditCardInitResponseBody>> eeyVar, Throwable th) {
            dia.b(dia.this, th);
        }
    };
    protected efa<ServerResponse<CreditCardFinalizeResponseBody>> i = new efa<ServerResponse<CreditCardFinalizeResponseBody>>() { // from class: dia.3
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<CreditCardFinalizeResponseBody>> eeyVar, efn<ServerResponse<CreditCardFinalizeResponseBody>> efnVar) {
            dia.c(dia.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<CreditCardFinalizeResponseBody>> eeyVar, Throwable th) {
            dia.c(dia.this, th);
        }
    };
    protected efa<ServerResponse<List<PaymentHistoryResponseBody>>> j = new efa<ServerResponse<List<PaymentHistoryResponseBody>>>() { // from class: dia.4
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<PaymentHistoryResponseBody>>> eeyVar, efn<ServerResponse<List<PaymentHistoryResponseBody>>> efnVar) {
            dia.d(dia.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<PaymentHistoryResponseBody>>> eeyVar, Throwable th) {
            dia.d(dia.this, th);
        }
    };
    protected List<dhz> b = new ArrayList();

    public final void a(dhz dhzVar) {
        if (!this.b.contains(dhzVar)) {
            this.b.add(dhzVar);
        }
    }

    public final void b(dhz dhzVar) {
        this.b.remove(dhzVar);
    }

    public final void a(String str, String str2) {
        this.a.C("https://api-my.te.eg/api/payment/rechargehistory", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.c.k(), new PaymentHistoryRequestBody(this.e.m(), str, str2))).a(this.j);
    }

    public final void b(String str, String str2) {
        CardRechargeRequestBody cardRechargeRequestBody = new CardRechargeRequestBody();
        cardRechargeRequestBody.setSourceMobileNumber(this.e.m());
        cardRechargeRequestBody.setTargetMobileNumber(str2);
        cardRechargeRequestBody.setVoucherNumber(str);
        this.a.R("https://api-my.te.eg/api/payment/pay/voucher", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.c.k(), cardRechargeRequestBody)).a(this.g);
    }

    public final void a(String str) {
        CardRechargeRequestBody cardRechargeRequestBody = new CardRechargeRequestBody();
        cardRechargeRequestBody.setSourceMobileNumber(this.e.m());
        cardRechargeRequestBody.setTargetMobileNumber(this.e.m());
        cardRechargeRequestBody.setVoucherNumber(str);
        this.a.R("https://api-my.te.eg/api/payment/pay/voucher", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.c.k(), cardRechargeRequestBody)).a(this.g);
    }

    public final void a(String str, String str2, String str3) {
        CreditCardFinalizeRequestBody creditCardFinalizeRequestBody = new CreditCardFinalizeRequestBody();
        creditCardFinalizeRequestBody.setHashCode(str);
        creditCardFinalizeRequestBody.setTransactionID(str2);
        creditCardFinalizeRequestBody.setTargetMobileNumber(str3);
        this.a.S("https://api-my.te.eg/api/payment/pay/unregisteredcard/finalize", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.c.k(), creditCardFinalizeRequestBody)).a(this.i);
    }

    static /* synthetic */ void a(dia diaVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dhz dhzVar : diaVar.b) {
                    dhzVar.a();
                }
                return;
            }
            for (dhz dhzVar2 : diaVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhzVar2.b(1200, header.getResponseMessage());
                } else {
                    dhzVar2.b(0, header.getResponseMessage());
                }
            }
            return;
        }
        for (dhz dhzVar3 : diaVar.b) {
            dhzVar3.b(0, diaVar.f.getString(R.string.generic_error));
        }
    }

    static /* synthetic */ void a(dia diaVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dhz dhzVar : diaVar.b) {
                    dhzVar.b(0, diaVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dhz dhzVar2 : diaVar.b) {
                dhzVar2.b(0, diaVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void b(dia diaVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dhz dhzVar : diaVar.b) {
                    dhzVar.a((CreditCardInitResponseBody) serverResponse.getBody());
                }
                return;
            }
            for (dhz dhzVar2 : diaVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhzVar2.c(1200, header.getResponseMessage());
                } else {
                    dhzVar2.c(0, header.getResponseMessage());
                }
            }
            return;
        }
        for (dhz dhzVar3 : diaVar.b) {
            dhzVar3.c(0, diaVar.f.getString(R.string.please_try_again));
        }
    }

    static /* synthetic */ void b(dia diaVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dhz dhzVar : diaVar.b) {
                    dhzVar.c(0, diaVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dhz dhzVar2 : diaVar.b) {
                dhzVar2.c(0, diaVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void c(dia diaVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dhz dhzVar : diaVar.b) {
                    serverResponse.getBody();
                    dhzVar.b();
                }
                return;
            }
            for (dhz dhzVar2 : diaVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhzVar2.d(1200, diaVar.f.getString(R.string.bill_payment_Error_alert_message));
                } else {
                    dhzVar2.d(0, diaVar.f.getString(R.string.bill_payment_Error_alert_message));
                }
            }
        }
    }

    static /* synthetic */ void c(dia diaVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dhz dhzVar : diaVar.b) {
                    dhzVar.d(0, diaVar.f.getString(R.string.bill_payment_Error_alert_message));
                }
                return;
            }
            for (dhz dhzVar2 : diaVar.b) {
                dhzVar2.d(0, diaVar.f.getString(R.string.bill_payment_Error_alert_message));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void d(dia diaVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                diaVar.k = (List) ((ServerResponse) efnVar.b).getBody();
                for (dhz dhzVar : diaVar.b) {
                    dhzVar.a(diaVar.k);
                }
                return;
            }
            for (dhz dhzVar2 : diaVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhzVar2.a(1200, header.getResponseMessage());
                } else {
                    dhzVar2.a(0, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void d(dia diaVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dhz dhzVar : diaVar.b) {
                    dhzVar.a(0, diaVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dhz dhzVar2 : diaVar.b) {
                dhzVar2.a(0, diaVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
