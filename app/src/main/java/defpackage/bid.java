package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.R;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.bic;

@Deprecated
/* renamed from: bid  reason: default package */
/* loaded from: classes2.dex */
public class bid extends Fragment {
    private View a;
    private View b;
    private EditText c;
    private boolean d;
    private LatLngBounds e;
    private AutocompleteFilter f;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.place_autocomplete_fragment, viewGroup, false);
        this.a = inflate.findViewById(R.id.place_autocomplete_search_button);
        this.b = inflate.findViewById(R.id.place_autocomplete_clear_button);
        this.c = (EditText) inflate.findViewById(R.id.place_autocomplete_search_input);
        bih bihVar = new bih(this);
        this.a.setOnClickListener(bihVar);
        this.c.setOnClickListener(bihVar);
        this.b.setOnClickListener(new big(this));
        a();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.a = null;
        this.b = null;
        this.c = null;
        super.onDestroyView();
    }

    public final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
        a();
    }

    private final void a() {
        this.b.setVisibility(this.c.getText().toString().isEmpty() ^ true ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        this.d = false;
        if (i == 30421) {
            if (i2 == -1) {
                FragmentActivity activity = getActivity();
                aat.a(intent, "intent must not be null");
                aat.a(activity, "context must not be null");
                a(((bgo) abe.a(intent, "selected_place", PlaceEntity.CREATOR)).a().toString());
            } else if (i2 == 2) {
                FragmentActivity activity2 = getActivity();
                aat.a(intent, "intent must not be null");
                aat.a(activity2, "context must not be null");
                abe.a(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(bid bidVar) {
        int i;
        try {
            Intent a = new bic.a().a(bidVar.e).a(bidVar.f).a(bidVar.c.getText().toString()).a().a(bidVar.getActivity());
            bidVar.d = true;
            bidVar.startActivityForResult(a, 30421);
            i = -1;
        } catch (GooglePlayServicesNotAvailableException e) {
            i = e.a;
        } catch (GooglePlayServicesRepairableException e2) {
            i = e2.a;
        }
        if (i != -1) {
            ux.a().b(bidVar.getActivity(), i, 30422, null);
        }
    }
}
