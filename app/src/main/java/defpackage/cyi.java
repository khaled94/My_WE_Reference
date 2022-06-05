package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.ucare.we.R;
import com.ucare.we.presentation.requeststatus.RequestStatusActivity;
import com.ucare.we.presentation.submitnewrequest.SubmitNewRequestActivity;

/* renamed from: cyi  reason: default package */
/* loaded from: classes2.dex */
public class cyi extends dab {
    View.OnClickListener a = new View.OnClickListener() { // from class: cyi.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cyi.this.e.startActivity(new Intent(cyi.this.e, RequestStatusActivity.class));
        }
    };
    View.OnClickListener b = new View.OnClickListener() { // from class: cyi.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cyi.this.e.startActivity(new Intent(cyi.this.e, SubmitNewRequestActivity.class));
        }
    };
    private Button c;
    private Button d;
    private Context e;

    public static cyi a() {
        Bundle bundle = new Bundle();
        cyi cyiVar = new cyi();
        cyiVar.setArguments(bundle);
        return cyiVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.choose_request_fragment, viewGroup, false);
        this.c = (Button) inflate.findViewById(R.id.btnNewRequest);
        this.d = (Button) inflate.findViewById(R.id.btnRequestStatus);
        this.c.setOnClickListener(this.b);
        this.d.setOnClickListener(this.a);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.e = getActivity();
    }
}
