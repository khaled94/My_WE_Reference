package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.remote.familygroupmember.GroupMember;
import de.hdodenhof.circleimageview.CircleImageView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fJU\u0010\u0017\u001a\u00020\u000e2M\u0010\u0005\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006RW\u0010\u0005\u001aK\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupInfoMembersAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupInfoMembersAdapter$ItemViewHolder;", "()V", "clickListener", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "clickedView", "item", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewClicked", "view", "setOnClickListener", "ItemViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dem  reason: default package */
/* loaded from: classes2.dex */
public final class dem extends ListAdapter<GroupMember, a> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        dqc.d(aVar, "holder");
        GroupMember item = getItem(i);
        dqc.b(item, "getItem(position)");
        GroupMember groupMember = item;
        dqc.d(groupMember, "item");
        aVar.a.setText(groupMember.getContactNameOnDevice());
        aVar.b.setText(groupMember.getServiceNumber());
        aVar.d.setImageBitmap(groupMember.getContactImageOnDevice());
        aVar.c.setVisibility(groupMember.isOwnerView());
        aVar.a.setVisibility(groupMember.isMemberNameEmpty());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_group_info_members, viewGroup, false);
        dqc.b(inflate, "from(parent.context)\n                .inflate(R.layout.item_group_info_members, parent, false)");
        return new a(this, inflate);
    }

    public dem() {
        super(new del());
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupInfoMembersAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupInfoMembersAdapter;Landroid/view/View;)V", "btnOwnerView", "Landroid/widget/Button;", "ivMemberAvatar", "Lde/hdodenhof/circleimageview/CircleImageView;", "tvMemberContact", "Landroid/widget/TextView;", "tvMemberName", "bind", "", "item", "Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dem$a */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.ViewHolder {
        final TextView a;
        final TextView b;
        final Button c;
        final CircleImageView d;
        final /* synthetic */ dem e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dem demVar, View view) {
            super(view);
            dqc.d(demVar, "this$0");
            dqc.d(view, "itemView");
            this.e = demVar;
            View findViewById = view.findViewById(R.id.tvMemberName);
            dqc.b(findViewById, "itemView.findViewById(R.id.tvMemberName)");
            this.a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvMemberContact);
            dqc.b(findViewById2, "itemView.findViewById(R.id.tvMemberContact)");
            this.b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.btnOwnerView);
            dqc.b(findViewById3, "itemView.findViewById(R.id.btnOwnerView)");
            this.c = (Button) findViewById3;
            View findViewById4 = view.findViewById(R.id.ivMemberAvatar);
            dqc.b(findViewById4, "itemView.findViewById(R.id.ivMemberAvatar)");
            this.d = (CircleImageView) findViewById4;
        }
    }
}
