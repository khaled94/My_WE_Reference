package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ucare.we.R;
import com.ucare.we.chooserequest.ChooseRequestActivity;
import javax.inject.Inject;

/* renamed from: czw  reason: default package */
/* loaded from: classes2.dex */
public class czw extends dab {
    @Inject
    djb a;
    @Inject
    dhn b;
    private TextView f;
    private TextView g;
    private TextView h;
    private Context j;
    View.OnClickListener c = new View.OnClickListener() { // from class: czw.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent;
            if (czw.this.b.f != null) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(czw.this.b.f.getLiveChat()));
            } else {
                intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3="));
            }
            czw.this.startActivity(intent);
        }
    };
    View.OnClickListener d = new View.OnClickListener() { // from class: czw.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent;
            if (czw.this.a.f()) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.te.eg/wps/portal/te/Personal/Help%20And%20Support%20l/FAQ/!ut/p/z1/lZLLbsIwEEW_hQXLaCYx9WNpkfJoSqMCKcQbZEJcUhGTSFbVz6-zRBGgeGf5XOnOGYOCPSirf6tv7aqr1Rd_zxU9JJ9xFKZzTOYJ5yhXi-Vku0gjlBR2DwGOoAblU0GFB5YxijXz-Whgvg90ebxzJMIXKFCFdY07Q-7KMZ7LSzNGo9vuoSmqE-QvaASPChNoHepggoQFRySngKDQjGjOj6X2RdTDrp2KWyBNPogHRIzTGQ1xxXpAX8azcTalhdwrYXd7vFPYDBzt7dkS_C-pftpWSa_yal3552B_67KpsyyrOaHrVxNvTb2To9E_iwxP4g!!/dz/d5/L0lHSkovd0RNQUZrQUVnQSEhLzROVkUvYXI!/"));
            } else {
                intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.te.eg/wps/portal/te/Personal/Help%20And%20Support%20l/FAQ/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8zivQNdjAz93Q283b0tLAwcfT08TUI8_I0MHM30w_EqsDDQjyJJv7-lmSVQgaeLgWWQOVC_EYn6MRWA9BvgAI4GQP1ReK0A-QBVgb-3nzFQgaWLgbObmaGBrzmGAkw_EHJFcGKRfkFuaGiEQaanrqOiIgDRIIvM/dz/d5/L0lHSkovd0RNQUZrQUVnQSEhLzROVkUvZW4!/?1dmy&urile=wcm%3apath%3a%2FTE%2FHelp%2FFAQ%2F"));
            }
            czw.this.startActivity(intent);
        }
    };
    private String i = "https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3=";
    View.OnClickListener e = new View.OnClickListener() { // from class: czw.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            czw.this.j.startActivity(new Intent(czw.this.j, ChooseRequestActivity.class));
        }
    };

    public static czw a() {
        Bundle bundle = new Bundle();
        czw czwVar = new czw();
        czwVar.setArguments(bundle);
        return czwVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.help_and_support_fragment, viewGroup, false);
        this.f = (TextView) inflate.findViewById(R.id.txtLiveChat);
        this.g = (TextView) inflate.findViewById(R.id.txtSubmitRequest);
        this.h = (TextView) inflate.findViewById(R.id.txtFAQ);
        this.f.setOnClickListener(this.c);
        this.g.setOnClickListener(this.e);
        this.h.setOnClickListener(this.d);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.j = getActivity();
    }
}
