package com.ucare.we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class SuspendAndResumeDurationSelectActivity_ViewBinding implements Unbinder {
    private SuspendAndResumeDurationSelectActivity a;

    public SuspendAndResumeDurationSelectActivity_ViewBinding(SuspendAndResumeDurationSelectActivity suspendAndResumeDurationSelectActivity, View view) {
        this.a = suspendAndResumeDurationSelectActivity;
        suspendAndResumeDurationSelectActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        suspendAndResumeDurationSelectActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        suspendAndResumeDurationSelectActivity.selectValueRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.selectValueRecyclerView, "field 'selectValueRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SuspendAndResumeDurationSelectActivity suspendAndResumeDurationSelectActivity = this.a;
        if (suspendAndResumeDurationSelectActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        suspendAndResumeDurationSelectActivity.imgBackButton = null;
        suspendAndResumeDurationSelectActivity.txtTitle = null;
        suspendAndResumeDurationSelectActivity.selectValueRecyclerView = null;
    }
}
