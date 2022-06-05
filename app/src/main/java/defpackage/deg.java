package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import java.util.List;
import javax.inject.Inject;

/* renamed from: deg  reason: default package */
/* loaded from: classes2.dex */
public final class deg extends RecyclerView.Adapter<a> {
    @Inject
    dio a;
    djw b = new djw();
    private Context c;
    private List<String> d;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r2.isEmpty() == false) goto L6;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void onBindViewHolder(defpackage.deg.a r8, int r9) {
        /*
            r7 = this;
            deg$a r8 = (defpackage.deg.a) r8
            java.util.List<java.lang.String> r0 = r7.d
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            android.content.Context r0 = defpackage.djq.a()
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r1)
            if (r0 != 0) goto L62
            android.content.Context r0 = defpackage.djq.a()
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.net.Uri r0 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI
            java.lang.String r2 = android.net.Uri.encode(r9)
            android.net.Uri r2 = android.net.Uri.withAppendedPath(r0, r2)
            java.lang.String r0 = "display_name"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)
            r2 = 0
            if (r1 != 0) goto L3a
        L38:
            r9 = r2
            goto L5c
        L3a:
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L48
            int r0 = r1.getColumnIndex(r0)
            java.lang.String r2 = r1.getString(r0)
        L48:
            if (r1 == 0) goto L53
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L53
            r1.close()
        L53:
            if (r2 == 0) goto L5c
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L5c
            goto L38
        L5c:
            android.widget.TextView r8 = r8.a
            r8.setText(r9)
            return
        L62:
            android.widget.TextView r8 = r8.a
            r8.setText(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deg.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public deg(Context context, List<String> list) {
        this.c = context;
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    /* renamed from: deg$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        TextView a;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_number);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.migrate_plan_numlist_item, viewGroup, false));
    }
}
