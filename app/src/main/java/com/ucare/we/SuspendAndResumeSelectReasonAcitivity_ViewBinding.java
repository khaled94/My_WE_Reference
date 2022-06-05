package com.ucare.we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class SuspendAndResumeSelectReasonAcitivity_ViewBinding implements Unbinder {
    private SuspendAndResumeSelectReasonAcitivity a;

    public SuspendAndResumeSelectReasonAcitivity_ViewBinding(SuspendAndResumeSelectReasonAcitivity suspendAndResumeSelectReasonAcitivity, View view) {
        this.a = suspendAndResumeSelectReasonAcitivity;
        suspendAndResumeSelectReasonAcitivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        suspendAndResumeSelectReasonAcitivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        suspendAndResumeSelectReasonAcitivity.selectValueRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.selectValueRecyclerView, "field 'selectValueRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SuspendAndResumeSelectReasonAcitivity suspendAndResumeSelectReasonAcitivity = this.a;
        if (suspendAndResumeSelectReasonAcitivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        suspendAndResumeSelectReasonAcitivity.imgBackButton = null;
        suspendAndResumeSelectReasonAcitivity.txtTitle = null;
        suspendAndResumeSelectReasonAcitivity.selectValueRecyclerView = null;
    }
}
