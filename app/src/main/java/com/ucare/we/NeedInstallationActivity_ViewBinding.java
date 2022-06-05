package com.ucare.we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class NeedInstallationActivity_ViewBinding implements Unbinder {
    private NeedInstallationActivity a;

    public NeedInstallationActivity_ViewBinding(NeedInstallationActivity needInstallationActivity, View view) {
        this.a = needInstallationActivity;
        needInstallationActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        needInstallationActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        needInstallationActivity.needInstallationRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.selectValueRecyclerView, "field 'needInstallationRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        NeedInstallationActivity needInstallationActivity = this.a;
        if (needInstallationActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        needInstallationActivity.imgBackButton = null;
        needInstallationActivity.txtTitle = null;
        needInstallationActivity.needInstallationRecyclerView = null;
    }
}
