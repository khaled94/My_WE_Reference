package defpackage;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.StoreResponseBody;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: cxh  reason: default package */
/* loaded from: classes2.dex */
public final class cxh extends cwt {
    @Inject
    djb a;
    private a b;
    private ArrayList<StoreResponseBody> c;

    /* renamed from: cxh$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(StoreResponseBody storeResponseBody);
    }

    @Override // defpackage.cwt, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return a(viewGroup);
    }

    public cxh(a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.cwt
    public final b a(ViewGroup viewGroup) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adsl_item_store, viewGroup, false));
    }

    @Override // defpackage.cwt
    /* renamed from: a */
    public final void onBindViewHolder(b bVar, int i) {
        StoreResponseBody storeResponseBody = this.c.get(i);
        if (this.a.f()) {
            if (storeResponseBody.getArBranchName() != null) {
                bVar.a.setText(a(Html.fromHtml(storeResponseBody.getArBranchName()).toString()));
            } else {
                bVar.a.setText(storeResponseBody.getArBranchName());
            }
            if (storeResponseBody.getArBranchAddress() != null) {
                bVar.b.setText(a(Html.fromHtml(storeResponseBody.getArBranchAddress()).toString()));
                return;
            } else {
                bVar.b.setText(storeResponseBody.getArBranchAddress());
                return;
            }
        }
        if (storeResponseBody.getEnBranchName() != null) {
            bVar.a.setText(a(Html.fromHtml(storeResponseBody.getEnBranchName()).toString()));
        } else {
            bVar.a.setText(storeResponseBody.getEnBranchName());
        }
        if (storeResponseBody.getEnBranchAddress() != null) {
            bVar.b.setText(a(Html.fromHtml(storeResponseBody.getEnBranchAddress()).toString()));
        } else {
            bVar.b.setText(storeResponseBody.getEnBranchAddress());
        }
    }

    @Override // defpackage.cwt, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<StoreResponseBody> arrayList = this.c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void a(ArrayList<StoreResponseBody> arrayList) {
        this.c = arrayList;
        notifyDataSetChanged();
    }

    private static String a(String str) {
        return str.replace("\n", "");
    }

    /* renamed from: cxh$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView a;
        public final TextView b;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_store_name);
            this.b = (TextView) view.findViewById(R.id.tv_store_address);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            cxh.this.b.a((StoreResponseBody) cxh.this.c.get(adapterPosition));
        }
    }
}
