package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.ucare.we.R;
import com.ucare.we.model.remote.CorporatePermissionResponseBody;
import java.io.IOException;
import javax.inject.Inject;

/* renamed from: dhp  reason: default package */
/* loaded from: classes2.dex */
public final class dhp extends czz {
    @Inject
    protected diq a;
    protected dib b;
    @Inject
    public djw c;
    @Inject
    dio d;
    @Inject
    djb e;
    @Inject
    Context f;
    public CorporatePermissionResponseBody g;
    protected efa<CorporatePermissionResponseBody> h = new efa<CorporatePermissionResponseBody>() { // from class: dhp.1
        @Override // defpackage.efa
        public final void a(eey<CorporatePermissionResponseBody> eeyVar, efn<CorporatePermissionResponseBody> efnVar) {
            dhp dhpVar = dhp.this;
            if (efnVar.a.d()) {
                dhpVar.g = efnVar.b;
            } else {
                Toast.makeText(dhpVar.f, dhpVar.f.getString(R.string.generic_error), 0).show();
            }
        }

        @Override // defpackage.efa
        public final void a(eey<CorporatePermissionResponseBody> eeyVar, Throwable th) {
            dhp.a(dhp.this, th);
        }
    };

    public final void a() {
        this.a.a("https://api-my.te.eg/api/files/read/?fileName=c-permissions.json", this.d.p).a(this.h);
    }

    public final Boolean b() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getMigrateButton() == null || !this.g.getMigrateButton().contains(this.c.w())) ? false : true);
    }

    public final Boolean c() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getCreateTicketSideMenuItem() == null || !this.g.getCreateTicketSideMenuItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean d() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getRequestDeviceSideMenuItem() == null || !this.g.getRequestDeviceSideMenuItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean e() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getAutoRechargeButton() == null || !this.g.getAutoRechargeButton().contains(this.c.w())) ? false : true);
    }

    public final Boolean f() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getAutoPayButton() == null || !this.g.getAutoPayButton().contains(this.c.w())) ? false : true);
    }

    public final Boolean g() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getPaymentHistoryButton() == null || !this.g.getPaymentHistoryButton().contains(this.c.w())) ? false : true);
    }

    public final Boolean h() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getDownloadBillButton() == null || !this.g.getDownloadBillButton().contains(this.c.w())) ? false : true);
    }

    public final Boolean i() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getQuotaTransferButton() == null || !this.g.getQuotaTransferButton().contains(this.c.w())) ? false : true);
    }

    public final Boolean j() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getBalanceTransferButton() == null || !this.g.getBalanceTransferButton().contains(this.c.w())) ? false : true);
    }

    public final Boolean k() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getRechargeAccountButton() == null || !this.g.getRechargeAccountButton().contains(this.c.w())) ? false : true);
    }

    public final Boolean l() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getPaymentAccountButton() == null || !this.g.getPaymentAccountButton().contains(this.c.w())) ? false : true);
    }

    public final Boolean m() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getQueryOutStanding() == null || !this.g.getQueryOutStanding().contains(this.c.w())) ? false : true);
    }

    public final Boolean n() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getAnonymousRechargeSearchItem() == null || !this.g.getAnonymousRechargeSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean o() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getBillSummarySearchItem() == null || !this.g.getBillSummarySearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean p() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getBillPaymentSearchItem() == null || !this.g.getBillPaymentSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean q() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getBalanceDetailsSearchItem() == null || !this.g.getBalanceDetailsSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean r() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getBillLimitSearchItem() == null || !this.g.getBillLimitSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean s() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getChangePlanSearchItem() == null || !this.g.getChangePlanSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean t() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getOffersAndExtrasSearchItem() == null || !this.g.getOffersAndExtrasSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean u() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getUsageSearchItemrechargeSearchItem() == null || !this.g.getUsageSearchItemrechargeSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean v() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getFavoriteNumbersSearchItem() == null || !this.g.getFavoriteNumbersSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean w() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getSubmitServiceTicketSearchItem() == null || !this.g.getSubmitServiceTicketSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean x() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getSubmitTroubleTicketSearchItem() == null || !this.g.getSubmitTroubleTicketSearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean y() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getRequestQuerySearchItem() == null || !this.g.getRequestQuerySearchItem().contains(this.c.w())) ? false : true);
    }

    public final Boolean z() {
        CorporatePermissionResponseBody corporatePermissionResponseBody = this.g;
        return Boolean.valueOf((corporatePermissionResponseBody == null || corporatePermissionResponseBody.getRouterUsernameAndPasswordSearchItem() == null || !this.g.getRouterUsernameAndPasswordSearchItem().contains(this.c.w())) ? false : true);
    }

    static /* synthetic */ void a(dhp dhpVar, Throwable th) {
        th.getMessage();
        try {
            if (dhpVar.b == null) {
                return;
            }
            if (!djm.a()) {
                dhpVar.f.getString(R.string.check_network_connection);
            } else {
                dhpVar.f.getString(R.string.error_contacting_server);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
