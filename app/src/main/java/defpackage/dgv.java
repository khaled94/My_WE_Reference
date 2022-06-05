package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.ucare.we.R;
import com.ucare.we.model.TicketStatus.GetTicketStatusResponseBody;
import javax.inject.Inject;

/* renamed from: dgv  reason: default package */
/* loaded from: classes2.dex */
public class dgv extends dab implements dgx, dju {
    @Inject
    djw a;
    View.OnClickListener b = new View.OnClickListener() { // from class: dgv.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String trim = dgv.this.c.getText().toString().trim();
            if (!trim.equals("")) {
                dgv.this.e.a(trim);
            }
        }
    };
    private EditText c;
    private Button d;
    private dgw e;
    private LinearLayout f;
    private TextView g;
    private TextView h;
    private Context i;

    public static dgv a() {
        Bundle bundle = new Bundle();
        dgv dgvVar = new dgv();
        dgvVar.setArguments(bundle);
        return dgvVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.request_status_fragment, viewGroup, false);
        this.c = (EditText) inflate.findViewById(R.id.edtRequestNumber);
        this.d = (Button) inflate.findViewById(R.id.btnSearch);
        this.f = (LinearLayout) inflate.findViewById(R.id.lnrStatus);
        this.g = (TextView) inflate.findViewById(R.id.txtDate);
        this.h = (TextView) inflate.findViewById(R.id.txtStatus);
        this.d.setOnClickListener(this.b);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.i = activity;
        this.e = new dgw(activity, this, this);
    }

    @Override // defpackage.dgx
    public final void a(GetTicketStatusResponseBody getTicketStatusResponseBody) {
        this.f.setVisibility(0);
        this.g.setText(getTicketStatusResponseBody.ticketTime);
        if (getTicketStatusResponseBody.status.equals("0")) {
            if (this.a.k().equalsIgnoreCase("en")) {
                this.h.setText(getTicketStatusResponseBody.statusDescEn);
            } else {
                this.h.setText(getTicketStatusResponseBody.statusDescAr);
            }
        } else if (getTicketStatusResponseBody.status.equals("1")) {
            if (this.a.k().equalsIgnoreCase("en")) {
                this.h.setText(getTicketStatusResponseBody.statusDescEn);
            } else {
                this.h.setText(getTicketStatusResponseBody.statusDescAr);
            }
        } else if (getTicketStatusResponseBody.status.equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            if (this.a.k().equalsIgnoreCase("en")) {
                this.h.setText(getTicketStatusResponseBody.statusDescEn);
            } else {
                this.h.setText(getTicketStatusResponseBody.statusDescAr);
            }
        } else if (!getTicketStatusResponseBody.status.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
        } else {
            if (this.a.k().equalsIgnoreCase("en")) {
                this.h.setText(getTicketStatusResponseBody.statusDescEn);
            } else {
                this.h.setText(getTicketStatusResponseBody.statusDescAr);
            }
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.i, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        String trim = this.c.getText().toString().trim();
        if (!trim.equals("")) {
            this.e.a(trim);
        }
    }
}
