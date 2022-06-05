package com.isapanah.awesomespinner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSpinner;

/* loaded from: classes.dex */
public class spinnerDefaultSelection extends AppCompatSpinner {
    int a = 0;

    public spinnerDefaultSelection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public void setSelection(int i) {
        super.setSelection(i);
        if (i == getSelectedItemPosition() && this.a == i) {
            getOnItemSelectedListener().onItemSelected(null, null, i, 0L);
        }
        this.a = i;
    }
}
