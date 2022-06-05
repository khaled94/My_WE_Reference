package com.ucare.we;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class GenericActivity_ViewBinding implements Unbinder {
    private GenericActivity a;

    public GenericActivity_ViewBinding(GenericActivity genericActivity, View view) {
        this.a = genericActivity;
        genericActivity.toolbar = (Toolbar) Utils.findRequiredViewAsType(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        genericActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        genericActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        genericActivity.frameLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.frameLayout, "field 'frameLayout'", FrameLayout.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        GenericActivity genericActivity = this.a;
        if (genericActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        genericActivity.toolbar = null;
        genericActivity.imgBackButton = null;
        genericActivity.txtTitle = null;
        genericActivity.frameLayout = null;
    }
}
