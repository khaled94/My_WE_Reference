package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ucare.we.R;

/* renamed from: czd  reason: default package */
/* loaded from: classes2.dex */
public class czd extends Fragment {
    TextView a;
    ImageView b;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_get_started, viewGroup, false);
        this.b = (ImageView) inflate.findViewById(R.id.iv_content);
        this.a = (TextView) inflate.findViewById(R.id.tv_description);
        int i = getArguments().getInt("resourceId", 0);
        int i2 = getArguments().getInt("description", 0);
        this.b.setImageResource(i);
        this.a.setText(getString(i2));
        return inflate;
    }
}
