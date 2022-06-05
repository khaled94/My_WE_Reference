package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.UserCredentials;
import defpackage.dit;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0013\u001a\u00020\t2\n\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ucare/we/switchaccount/adapter/MyAccountsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ucare/we/model/UserCredentials;", "Lcom/ucare/we/switchaccount/adapter/MyAccountsAdapter$MyAccountsViewHolder;", "repository", "Lcom/ucare/we/util/prefs/Repository;", "(Lcom/ucare/we/util/prefs/Repository;)V", "deleteAccount", "Lkotlin/Function1;", "", "getDeleteAccount$app_googleProductionRelease", "()Lkotlin/jvm/functions/Function1;", "setDeleteAccount$app_googleProductionRelease", "(Lkotlin/jvm/functions/Function1;)V", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "selectAccount", "getSelectAccount$app_googleProductionRelease", "setSelectAccount$app_googleProductionRelease", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyAccountsViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dit */
/* loaded from: classes2.dex */
public final class dit extends ListAdapter<UserCredentials, a> {
    final djw a;
    public dow<? super UserCredentials, dmg> b = c.a;
    public dow<? super UserCredentials, dmg> c = b.a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        dqc.d(aVar, "holder");
        UserCredentials item = getItem(i);
        dqc.b(item, "getItem(position)");
        aVar.a(item, this.b, this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_switch_account, viewGroup, false);
        dqc.b(inflate, "from(parent.context).inflate(R.layout.item_switch_account, parent, false)");
        return new a(this, inflate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dit(djw djwVar) {
        super(new diu());
        dqc.d(djwVar, "repository");
        this.a = djwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ucare/we/model/UserCredentials;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dit$c */
    /* loaded from: classes2.dex */
    public static final class c extends dqd implements dow<UserCredentials, dmg> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(UserCredentials userCredentials) {
            dqc.d(userCredentials, "$noName_0");
            return dmg.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ucare/we/model/UserCredentials;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dit$b */
    /* loaded from: classes2.dex */
    public static final class b extends dqd implements dow<UserCredentials, dmg> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(UserCredentials userCredentials) {
            dqc.d(userCredentials, "$noName_0");
            return dmg.a;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n¨\u0006\f"}, d2 = {"Lcom/ucare/we/switchaccount/adapter/MyAccountsAdapter$MyAccountsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ucare/we/switchaccount/adapter/MyAccountsAdapter;Landroid/view/View;)V", "bind", "", "item", "Lcom/ucare/we/model/UserCredentials;", "selectAccount", "Lkotlin/Function1;", "deleteAccount", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dit$a */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.ViewHolder {
        final /* synthetic */ dit a;

        public static final void a(View view) {
        }

        public static final void b(View view) {
        }

        public static /* synthetic */ void lambda$7fZIOjnNhtSUcuV1Tc071ccVJlg(dow dowVar, UserCredentials userCredentials, View view) {
            b(dowVar, userCredentials, view);
        }

        public static /* synthetic */ void lambda$XudVcCfHM4XwdRldLXEIC1JkwwI(dow dowVar, UserCredentials userCredentials, View view) {
            a(dowVar, userCredentials, view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dit ditVar, View view) {
            super(view);
            dqc.d(ditVar, "this$0");
            dqc.d(view, "view");
            this.a = ditVar;
        }

        public final void a(final UserCredentials userCredentials, final dow<? super UserCredentials, dmg> dowVar, final dow<? super UserCredentials, dmg> dowVar2) {
            dqc.d(userCredentials, "item");
            dqc.d(dowVar, "selectAccount");
            dqc.d(dowVar2, "deleteAccount");
            View view = this.itemView;
            dit ditVar = this.a;
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_account);
            if (getAdapterPosition() == 0) {
                imageView.setImageResource(R.drawable.ic_current_account);
                ((TextView) this.itemView.findViewById(R.id.btn_delete)).setVisibility(4);
                this.itemView.findViewById(R.id.btn_view).setVisibility(4);
                ((TextView) this.itemView.findViewById(R.id.btn_login)).setVisibility(4);
                ((TextView) this.itemView.findViewById(R.id.tv_number)).setOnClickListener($$Lambda$dit$a$PFswgPCDY9RtJEHm3ebL8MabK6w.INSTANCE);
            } else {
                imageView.setImageResource(R.drawable.ic_account);
                ((TextView) this.itemView.findViewById(R.id.btn_delete)).setVisibility(0);
                ((TextView) this.itemView.findViewById(R.id.btn_delete)).setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dit$a$XudVcCfHM4XwdRldLXEIC1JkwwI
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        dit.a.lambda$XudVcCfHM4XwdRldLXEIC1JkwwI(dow.this, userCredentials, view2);
                    }
                });
                ((TextView) this.itemView.findViewById(R.id.btn_login)).setVisibility(0);
                ((TextView) this.itemView.findViewById(R.id.btn_login)).setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dit$a$7fZIOjnNhtSUcuV1Tc071ccVJlg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        dit.a.lambda$7fZIOjnNhtSUcuV1Tc071ccVJlg(dow.this, userCredentials, view2);
                    }
                });
                ((TextView) this.itemView.findViewById(R.id.tv_number)).setOnClickListener($$Lambda$dit$a$Q4z89mApcjmRHIuVvKNdr2kxos.INSTANCE);
                if (userCredentials.getMobileNumber().equals(ditVar.a.r())) {
                    ((TextView) this.itemView.findViewById(R.id.btn_delete)).setVisibility(4);
                    this.itemView.findViewById(R.id.btn_view).setVisibility(4);
                }
            }
            ((TextView) view.findViewById(R.id.tv_title)).setText(userCredentials.getCustomerName());
            ((TextView) view.findViewById(R.id.tv_number)).setText(userCredentials.getMobileNumber());
        }

        public static final void a(dow dowVar, UserCredentials userCredentials, View view) {
            dqc.d(dowVar, "$deleteAccount");
            dqc.d(userCredentials, "$item");
            dowVar.invoke(userCredentials);
        }

        public static final void b(dow dowVar, UserCredentials userCredentials, View view) {
            dqc.d(dowVar, "$selectAccount");
            dqc.d(userCredentials, "$item");
            dowVar.invoke(userCredentials);
        }
    }
}
