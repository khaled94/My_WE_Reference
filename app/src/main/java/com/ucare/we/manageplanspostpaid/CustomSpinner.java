package com.ucare.we.manageplanspostpaid;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;

/* loaded from: classes2.dex */
public class CustomSpinner extends Spinner {
    private a a;
    private boolean b = false;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    public CustomSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        this.b = true;
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
        return super.performClick();
    }

    public void setSpinnerEventsListener(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!this.b || !z) {
            return;
        }
        this.b = false;
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }
}
