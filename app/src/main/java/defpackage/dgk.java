package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ucare.we.R;

/* renamed from: dgk  reason: default package */
/* loaded from: classes2.dex */
public class dgk extends dae {
    View.OnClickListener a = new View.OnClickListener() { // from class: dgk.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgk.this.finish();
            dgk.this.setResult(-1);
        }
    };
    private TextView b;
    private TextView c;

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_home_collection_enabled);
        this.b = (TextView) findViewById(R.id.txtOK);
        this.c = (TextView) findViewById(R.id.txtCancel);
        this.b.setOnClickListener(this.a);
    }
}
