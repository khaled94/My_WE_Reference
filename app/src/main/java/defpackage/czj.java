package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.R;
import com.ucare.we.SuspendAndResumeDurationSelectActivity;
import com.ucare.we.SuspendAndResumeSelectReasonAcitivity;
import com.ucare.we.genericconfirmationscreen.GenericConfirmationActivity;
import com.ucare.we.model.suspendandresume.SubmitSuspendAndResume;
import com.ucare.we.model.suspendandresume.SuspendAndResumeReasonAndDurationResponse;
import com.ucare.we.model.suspendandresume.SuspendAndResumeResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import javax.inject.Inject;

/* renamed from: czj  reason: default package */
/* loaded from: classes2.dex */
public class czj extends dab implements dcs {
    @Inject
    dii a;
    @Inject
    djg b;
    SuspendAndResumeReasonAndDurationResponse c;
    TextView e;
    TextView f;
    Button g;
    Button h;
    TextView i;
    TextView j;
    @Inject
    dio k;
    Activity p;
    dcs q;
    @Inject
    djw r;
    int d = 3;
    String l = "";
    String m = "";
    String n = "";
    String o = "";

    @Override // defpackage.dcs
    public final void a() {
    }

    @Override // defpackage.dcs
    public final void a(SuspendAndResumeResponse suspendAndResumeResponse) {
    }

    @Override // defpackage.dcs
    public final void a(String str) {
    }

    public static czj b(SuspendAndResumeReasonAndDurationResponse suspendAndResumeReasonAndDurationResponse) {
        czj czjVar = new czj();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUSPEND_RESUME_REASON_DURATION", suspendAndResumeReasonAndDurationResponse);
        czjVar.setArguments(bundle);
        return czjVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.suspend_resume_service_fragment, viewGroup, false);
        this.e = (TextView) inflate.findViewById(R.id.suspendOrResumeReasonHint);
        this.f = (TextView) inflate.findViewById(R.id.suspendOrResumeDurationHint);
        this.g = (Button) inflate.findViewById(R.id.reactivte);
        this.h = (Button) inflate.findViewById(R.id.recharge);
        this.i = (TextView) inflate.findViewById(R.id.suspendReason);
        this.j = (TextView) inflate.findViewById(R.id.suspend_duration);
        this.p = getActivity();
        this.q = (dcs) getActivity();
        this.a.f = this;
        this.c = (SuspendAndResumeReasonAndDurationResponse) getArguments().getParcelable("SUSPEND_RESUME_REASON_DURATION");
        this.g.setAlpha(0.6f);
        this.g.setEnabled(false);
        if (this.k.d()) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        this.f.setText(getString(R.string.suspend_duration));
        this.e.setText(getString(R.string.suspend_reason));
        this.g.setText(getString(R.string.suspend));
        this.h.setOnClickListener(new View.OnClickListener() { // from class: czj.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czj.this.startActivity(new Intent(czj.this.p, BalanceRechargeActivity.class));
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: czj.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent(czj.this.p, SuspendAndResumeDurationSelectActivity.class);
                if (czj.this.k.h()) {
                    intent.putParcelableArrayListExtra("DURATION", czj.this.c.getCorp_durations());
                } else {
                    intent.putParcelableArrayListExtra("DURATION", czj.this.c.getDurations());
                }
                intent.putExtra("DURATION_VALUE", czj.this.m);
                czj.this.startActivityForResult(intent, 2);
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: czj.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent(czj.this.p, SuspendAndResumeSelectReasonAcitivity.class);
                if (czj.this.k.h()) {
                    intent.putParcelableArrayListExtra("SUSPEND_RESUME_LIST", czj.this.c.getCorpSuspend());
                } else {
                    intent.putParcelableArrayListExtra("SUSPEND_RESUME_LIST", czj.this.c.getSuspend());
                }
                intent.putExtra("SUSPEND_VALUE_ID", czj.this.l);
                intent.putExtra("SUSPEND_AND_RESUME_DURATION_VALUE", czj.this.o);
                czj.this.startActivityForResult(intent, 1);
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: czj.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (czj.this.l.isEmpty() || czj.this.m.isEmpty()) {
                    return;
                }
                Intent intent = new Intent(czj.this.p, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", czj.this.getString(R.string.suspend_title));
                intent.putExtra("confirmation_hint", czj.this.getString(R.string.suspend_hit));
                czj.this.startActivityForResult(intent, 3);
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (intent == null) {
                return;
            }
            this.o = intent.getStringExtra("SUSPEND_AND_RESUME_DURATION_VALUE");
            String stringExtra = intent.getStringExtra("SUSPEND_VALUE_ID");
            this.l = stringExtra;
            if (!stringExtra.isEmpty()) {
                this.i.setText(this.o);
            }
        } else if (i == 2) {
            if (intent == null) {
                return;
            }
            this.m = intent.getStringExtra("SUSPEND_AND_RESUME_DURATION_VALUE_IN_MONTH");
            this.n = intent.getStringExtra("SUSPEND_AND_RESUME_DURATION_VALUE_IN_DAYS");
            if (!this.m.isEmpty()) {
                this.j.setText(this.m);
            }
        } else if (i == 3 && i2 == -1) {
            if (this.p.getWindow() == null) {
                return;
            }
            this.b.a(this.p, getString(R.string.loading));
            SubmitSuspendAndResume submitSuspendAndResume = new SubmitSuspendAndResume();
            submitSuspendAndResume.setActionType("suspend");
            submitSuspendAndResume.setReason(this.l);
            submitSuspendAndResume.setDuration(Integer.valueOf(Integer.parseInt(this.n)));
            this.a.a(submitSuspendAndResume);
        }
        if (this.l.isEmpty() || this.m.isEmpty()) {
            return;
        }
        this.g.setAlpha(1.0f);
        this.g.setEnabled(true);
    }

    @Override // defpackage.dcs
    public final void a(SuspendAndResumeReasonAndDurationResponse suspendAndResumeReasonAndDurationResponse) {
        this.b.a();
        this.c = suspendAndResumeReasonAndDurationResponse;
    }

    @Override // defpackage.dcs
    public final void b(String str) {
        this.b.a();
        UnNavigateResponseActivity.a(this.p, str, getString(R.string.please_try_again), true);
        this.q.a();
    }

    @Override // defpackage.dcs
    public final void c(String str) {
        UnNavigateResponseActivity.a(this.p, getString(R.string.successfully), str, false);
        this.q.a();
    }

    @Override // defpackage.dcs
    public final void d(String str) {
        UnNavigateResponseActivity.a(this.p, str, getString(R.string.please_try_again), true);
        this.q.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.b.a();
    }
}
