package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: cxc  reason: default package */
/* loaded from: classes2.dex */
public class cxc extends ArrayAdapter<a> implements Filterable {
    private static final String a = cxc.class.getSimpleName();
    private vf b;
    private AutocompleteFilter c = null;
    private LatLngBounds d;
    private ArrayList<a> e;
    private czi f;

    public cxc(Context context, LatLngBounds latLngBounds, czi cziVar) {
        super(context, 17367043);
        this.d = latLngBounds;
        this.f = cziVar;
    }

    public final void a(vf vfVar) {
        if (vfVar == null || !vfVar.f()) {
            this.b = null;
        } else {
            this.b = vfVar;
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.e.size();
    }

    /* renamed from: a */
    public final a getItem(int i) {
        return this.e.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new Filter() { // from class: cxc.1
            @Override // android.widget.Filter
            protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (charSequence != null) {
                    cxc cxcVar = cxc.this;
                    cxcVar.e = cxc.a(cxcVar, charSequence);
                    if (cxc.this.e != null) {
                        filterResults.values = cxc.this.e;
                        filterResults.count = cxc.this.e.size();
                    }
                }
                return filterResults;
            }

            @Override // android.widget.Filter
            protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                if (filterResults != null && filterResults.count > 0) {
                    cxc.this.notifyDataSetChanged();
                } else {
                    cxc.this.notifyDataSetInvalidated();
                }
            }
        };
    }

    /* renamed from: cxc$a */
    /* loaded from: classes2.dex */
    public class a {
        public CharSequence a;
        public CharSequence b;

        a(CharSequence charSequence, CharSequence charSequence2) {
            this.a = charSequence;
            this.b = charSequence2;
        }

        public final String toString() {
            return this.b.toString();
        }
    }

    static /* synthetic */ ArrayList a(cxc cxcVar, CharSequence charSequence) {
        if (cxcVar.b != null) {
            cxcVar.f.a();
            bgm a2 = bgs.c.a(cxcVar.b, charSequence.toString(), cxcVar.d, cxcVar.c).a(15L, TimeUnit.SECONDS);
            if (!a2.a().c()) {
                a2.b();
                return null;
            }
            Iterator<bgl> it = a2.iterator();
            ArrayList arrayList = new ArrayList(a2.c());
            while (it.hasNext()) {
                bgl next = it.next();
                arrayList.add(new a(next.b(), next.a()));
            }
            a2.b();
            return arrayList;
        }
        return null;
    }
}
