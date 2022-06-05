package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;

@Deprecated
/* renamed from: bic  reason: default package */
/* loaded from: classes2.dex */
public final class bic extends bie {
    private bic() {
    }

    /* renamed from: bic$a */
    /* loaded from: classes2.dex */
    public static class a extends bif {
        public a() {
            super("com.google.android.gms.location.places.ui.AUTOCOMPLETE");
            this.a.putExtra("gmscore_client_jar_version", ux.a);
            this.a.putExtra("mode", 2);
            this.a.putExtra("origin", 2);
        }

        public final a a(LatLngBounds latLngBounds) {
            if (latLngBounds != null) {
                this.a.putExtra("bounds", latLngBounds);
            } else {
                this.a.removeExtra("bounds");
            }
            return this;
        }

        public final a a(AutocompleteFilter autocompleteFilter) {
            if (autocompleteFilter != null) {
                this.a.putExtra("filter", autocompleteFilter);
            } else {
                this.a.removeExtra("filter");
            }
            return this;
        }

        public final a a() {
            this.a.putExtra("origin", 1);
            return this;
        }

        public final a a(String str) {
            if (str != null) {
                this.a.putExtra("initial_query", str);
            } else {
                this.a.removeExtra("initial_query");
            }
            return this;
        }

        @Override // defpackage.bif
        public final Intent a(Activity activity) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
            return super.a(activity);
        }
    }
}
