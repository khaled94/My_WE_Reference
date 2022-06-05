package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.remote.familygroupmember.GroupMember;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.den;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fJU\u0010\u0017\u001a\u00020\u000e2M\u0010\u0005\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006RW\u0010\u0005\u001aK\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupMembersAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupMembersAdapter$ItemViewHolder;", "()V", "clickListener", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "clickedView", "item", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewClicked", "view", "setOnClickListener", "ItemViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: den */
/* loaded from: classes2.dex */
public final class den extends ListAdapter<GroupMember, a> {
    public dpl<? super View, ? super GroupMember, ? super Integer, dmg> a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        dqc.d(aVar, "holder");
        GroupMember item = getItem(i);
        dqc.b(item, "getItem(position)");
        aVar.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.groupinfo_member_layout, viewGroup, false);
        dqc.b(inflate, "from(parent.context)\n                .inflate(R.layout.groupinfo_member_layout, parent, false)");
        return new a(this, inflate);
    }

    public den() {
        super(new deo());
    }

    public final void a(View view, GroupMember groupMember, int i) {
        dqc.d(view, "view");
        dpl<? super View, ? super GroupMember, ? super Integer, dmg> dplVar = this.a;
        if (dplVar != null) {
            dplVar.a(view, groupMember, Integer.valueOf(i));
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupMembersAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupMembersAdapter;Landroid/view/View;)V", "btnOwnerView", "Landroid/widget/Button;", "dividerRemoveMember", "Landroidx/appcompat/widget/LinearLayoutCompat;", "ivMemberAvatar", "Lde/hdodenhof/circleimageview/CircleImageView;", "tvMemberContact", "Landroid/widget/TextView;", "tvMemberName", "tvRemoveMember", "tvSetLimit", "bind", "", "item", "Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: den$a */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.ViewHolder {
        final /* synthetic */ den a;
        private final TextView b;
        private final TextView c;
        private final TextView d;
        private final TextView e;
        private final Button f;
        private final CircleImageView g;
        private final LinearLayoutCompat h;

        public static /* synthetic */ void lambda$ffoKx3j7LSz_OrFnePB2TehTrmg(den denVar, GroupMember groupMember, a aVar, View view) {
            b(denVar, groupMember, aVar, view);
        }

        /* renamed from: lambda$lPt9s9uNOY-aGKSk3I8YcyQbFMY */
        public static /* synthetic */ void m108lambda$lPt9s9uNOYaGKSk3I8YcyQbFMY(den denVar, GroupMember groupMember, a aVar, View view) {
            a(denVar, groupMember, aVar, view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(den denVar, View view) {
            super(view);
            dqc.d(denVar, "this$0");
            dqc.d(view, "itemView");
            this.a = denVar;
            View findViewById = view.findViewById(R.id.tvMemberName);
            dqc.b(findViewById, "itemView.findViewById(R.id.tvMemberName)");
            this.b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvMemberContact);
            dqc.b(findViewById2, "itemView.findViewById(R.id.tvMemberContact)");
            this.c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvSetLimit);
            dqc.b(findViewById3, "itemView.findViewById(R.id.tvSetLimit)");
            this.d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRemoveMember);
            dqc.b(findViewById4, "itemView.findViewById(R.id.tvRemoveMember)");
            this.e = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.btnOwnerView);
            dqc.b(findViewById5, "itemView.findViewById(R.id.btnOwnerView)");
            this.f = (Button) findViewById5;
            View findViewById6 = view.findViewById(R.id.ivMemberAvatar);
            dqc.b(findViewById6, "itemView.findViewById(R.id.ivMemberAvatar)");
            this.g = (CircleImageView) findViewById6;
            View findViewById7 = view.findViewById(R.id.dividerRemoveMember);
            dqc.b(findViewById7, "itemView.findViewById(R.id.dividerRemoveMember)");
            this.h = (LinearLayoutCompat) findViewById7;
        }

        public final void a(final GroupMember groupMember) {
            dqc.d(groupMember, "item");
            this.b.setText(groupMember.getContactNameOnDevice());
            this.c.setText(groupMember.getServiceNumber());
            this.e.setVisibility(groupMember.getRemoveView());
            this.h.setVisibility(groupMember.getRemoveView());
            this.f.setVisibility(groupMember.isOwnerView());
            this.b.setVisibility(groupMember.isMemberNameEmpty());
            this.g.setImageBitmap(groupMember.getContactImageOnDevice());
            TextView textView = this.e;
            final den denVar = this.a;
            textView.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$den$a$lPt9s9uNOY-aGKSk3I8YcyQbFMY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    den.a.m108lambda$lPt9s9uNOYaGKSk3I8YcyQbFMY(den.this, groupMember, this, view);
                }
            });
            TextView textView2 = this.d;
            final den denVar2 = this.a;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$den$a$ffoKx3j7LSz_OrFnePB2TehTrmg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    den.a.lambda$ffoKx3j7LSz_OrFnePB2TehTrmg(den.this, groupMember, this, view);
                }
            });
        }

        public static final void a(den denVar, GroupMember groupMember, a aVar, View view) {
            dqc.d(denVar, "this$0");
            dqc.d(groupMember, "$item");
            dqc.d(aVar, "this$1");
            dqc.b(view, "it");
            denVar.a(view, groupMember, aVar.getAdapterPosition());
        }

        public static final void b(den denVar, GroupMember groupMember, a aVar, View view) {
            dqc.d(denVar, "this$0");
            dqc.d(groupMember, "$item");
            dqc.d(aVar, "this$1");
            dqc.b(view, "it");
            denVar.a(view, groupMember, aVar.getAdapterPosition());
        }
    }
}
