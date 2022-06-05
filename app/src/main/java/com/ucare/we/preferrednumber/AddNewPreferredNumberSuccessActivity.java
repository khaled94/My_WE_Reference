package com.ucare.we.preferrednumber;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class AddNewPreferredNumberSuccessActivity extends dae {
    View.OnClickListener a = new View.OnClickListener() { // from class: com.ucare.we.preferrednumber.AddNewPreferredNumberSuccessActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AddNewPreferredNumberSuccessActivity.this.finish();
        }
    };
    private TextView b;
    private TextView c;

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_new_preferred_number_success);
        this.b = (TextView) findViewById(R.id.txtOK);
        this.c = (TextView) findViewById(R.id.txtCancel);
        this.b.setOnClickListener(this.a);
    }
}
