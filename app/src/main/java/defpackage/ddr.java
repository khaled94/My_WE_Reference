package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.net.MailTo;
import com.ucare.we.R;

/* renamed from: ddr  reason: default package */
/* loaded from: classes2.dex */
public class ddr extends dab {
    View.OnClickListener a = new View.OnClickListener() { // from class: ddr.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:111"));
            ddr.this.startActivity(intent);
        }
    };
    View.OnClickListener b = new View.OnClickListener() { // from class: ddr.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:19777"));
            ddr.this.startActivity(intent);
        }
    };
    View.OnClickListener c = new View.OnClickListener() { // from class: ddr.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:01555000111"));
            ddr.this.startActivity(intent);
        }
    };
    View.OnClickListener d = new View.OnClickListener() { // from class: ddr.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME + Uri.encode("Customer.care@te.eg")));
            intent.putExtra("android.intent.extra.SUBJECT", "");
            intent.putExtra("android.intent.extra.TEXT", "");
            ddr.this.startActivity(Intent.createChooser(intent, "Send email via..."));
        }
    };
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private ImageView i;

    public static ddr a() {
        return new ddr();
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_contact_us, viewGroup, false);
        this.i = (ImageView) inflate.findViewById(R.id.imgBackButton);
        this.e = (TextView) inflate.findViewById(R.id.tv_call_111);
        this.f = (TextView) inflate.findViewById(R.id.tv_call_19777);
        this.g = (TextView) inflate.findViewById(R.id.tv_call_015);
        this.h = (TextView) inflate.findViewById(R.id.tv_customer_email);
        this.e.setOnClickListener(this.a);
        this.f.setOnClickListener(this.b);
        this.g.setOnClickListener(this.c);
        this.h.setOnClickListener(this.d);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((czy) getActivity()).a(getString(R.string.contact_us), false, false);
    }
}
