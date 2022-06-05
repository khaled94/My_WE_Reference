package com.ucare.we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class DeviceTypeActivity_ViewBinding implements Unbinder {
    private DeviceTypeActivity a;

    public DeviceTypeActivity_ViewBinding(DeviceTypeActivity deviceTypeActivity, View view) {
        this.a = deviceTypeActivity;
        deviceTypeActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        deviceTypeActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        deviceTypeActivity.rvDeviceType = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.rvDeviceType, "field 'rvDeviceType'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DeviceTypeActivity deviceTypeActivity = this.a;
        if (deviceTypeActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        deviceTypeActivity.imgBackButton = null;
        deviceTypeActivity.txtTitle = null;
        deviceTypeActivity.rvDeviceType = null;
    }
}
