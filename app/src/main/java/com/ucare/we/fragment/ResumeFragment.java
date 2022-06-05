package com.ucare.we.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.R;
import com.ucare.we.model.suspendandresume.SubmitSuspendAndResume;
import com.ucare.we.model.suspendandresume.SuspendAndResumeReasonAndDurationResponse;
import com.ucare.we.model.suspendandresume.SuspendAndResumeResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ResumeFragment extends dab implements dcs {
    @Inject
    djw a;
    @Inject
    dii b;
    @Inject
    djg c;
    SuspendAndResumeResponse d;
    dcs e;
    Activity f;
    @Inject
    dio g;
    @BindView(R.id.reactivte)
    Button reactivteButton;
    @BindView(R.id.recharge)
    Button rechargeButton;

    @Override // defpackage.dcs
    public final void a() {
    }

    @Override // defpackage.dcs
    public final void a(SuspendAndResumeReasonAndDurationResponse suspendAndResumeReasonAndDurationResponse) {
    }

    @Override // defpackage.dcs
    public final void b(String str) {
    }

    public static ResumeFragment b() {
        ResumeFragment resumeFragment = new ResumeFragment();
        resumeFragment.setArguments(new Bundle());
        return resumeFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.resume_fragment, viewGroup, false);
        ButterKnife.bind(this, inflate);
        this.f = getActivity();
        this.e = (dcs) getActivity();
        this.b.f = this;
        this.reactivteButton.setText(getString(R.string.reactivate_Service));
        this.reactivteButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.fragment.ResumeFragment.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResumeFragment.this.c.a(ResumeFragment.this.f, ResumeFragment.this.getString(R.string.loading));
                SubmitSuspendAndResume submitSuspendAndResume = new SubmitSuspendAndResume();
                submitSuspendAndResume.setActionType("resume");
                submitSuspendAndResume.setReason("1");
                ResumeFragment.this.b.a(submitSuspendAndResume);
            }
        });
        if (this.g.d()) {
            this.rechargeButton.setVisibility(0);
        } else {
            this.rechargeButton.setVisibility(8);
        }
        this.rechargeButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.fragment.ResumeFragment.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResumeFragment.this.startActivity(new Intent(ResumeFragment.this.f, BalanceRechargeActivity.class));
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // defpackage.dcs
    public final void a(String str) {
        this.c.a();
        UnNavigateResponseActivity.a(getActivity(), str, getString(R.string.please_try_again), true);
        this.e.a();
    }

    @Override // defpackage.dcs
    public final void c(String str) {
        UnNavigateResponseActivity.a(getActivity(), getString(R.string.successfully), str, false);
        this.c.a();
        this.e.a();
    }

    @Override // defpackage.dcs
    public final void d(String str) {
        UnNavigateResponseActivity.a(getActivity(), str, getString(R.string.please_try_again), true);
        this.c.a();
        this.e.a();
    }

    @Override // defpackage.dcs
    public final void a(SuspendAndResumeResponse suspendAndResumeResponse) {
        this.d = suspendAndResumeResponse;
        this.c.a();
        this.reactivteButton.setText(getString(R.string.reactivate_Service));
    }
}
