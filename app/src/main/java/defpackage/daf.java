package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import defpackage.dag;

/* renamed from: daf  reason: default package */
/* loaded from: classes2.dex */
public class daf extends dab {
    dag.a a;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_screen_slide_page, viewGroup, false);
        if (this.a != null) {
            ((ImageView) viewGroup2.findViewById(R.id.slider_icon)).setImageDrawable(getResources().getDrawable(this.a.a));
            ((TextView) viewGroup2.findViewById(R.id.slider_text_large)).setText(this.a.b);
            ((TextView) viewGroup2.findViewById(R.id.slider_text_small)).setText(this.a.c);
        }
        return viewGroup2;
    }
}
