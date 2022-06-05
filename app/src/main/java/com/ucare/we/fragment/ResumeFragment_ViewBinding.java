package com.ucare.we.fragment;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class ResumeFragment_ViewBinding implements Unbinder {
    private ResumeFragment a;

    public ResumeFragment_ViewBinding(ResumeFragment resumeFragment, View view) {
        this.a = resumeFragment;
        resumeFragment.reactivteButton = (Button) Utils.findRequiredViewAsType(view, R.id.reactivte, "field 'reactivteButton'", Button.class);
        resumeFragment.rechargeButton = (Button) Utils.findRequiredViewAsType(view, R.id.recharge, "field 'rechargeButton'", Button.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ResumeFragment resumeFragment = this.a;
        if (resumeFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        resumeFragment.reactivteButton = null;
        resumeFragment.rechargeButton = null;
    }
}
