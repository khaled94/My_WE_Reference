package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.remote.PushNotificationInbox;
import defpackage.dfu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dfu */
/* loaded from: classes2.dex */
public final class dfu extends RecyclerView.Adapter<a> {
    public static djn<PushNotificationInbox> a;
    List<PushNotificationInbox> b = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        aVar.a(this.b.get(i));
    }

    public static void a(djn<PushNotificationInbox> djnVar) {
        a = djnVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    public final void a(List<PushNotificationInbox> list) {
        this.b = list;
        notifyDataSetChanged();
    }

    /* renamed from: dfu$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.ViewHolder {
        private final TextView a;
        private final TextView b;
        private final TextView c;
        private final ConstraintLayout d;
        private final View e;

        public static /* synthetic */ void lambda$XMWWX5kzSCatFoi4OtNcpEjy_ow(PushNotificationInbox pushNotificationInbox, View view) {
            a(pushNotificationInbox, view);
        }

        public a(View view) {
            super(view);
            this.e = view;
            this.a = (TextView) view.findViewById(R.id.tvTitle);
            this.b = (TextView) view.findViewById(R.id.tvBody);
            this.c = (TextView) view.findViewById(R.id.tvDate);
            this.d = (ConstraintLayout) view.findViewById(R.id.clBg);
        }

        final void a(final PushNotificationInbox pushNotificationInbox) {
            this.a.setText(pushNotificationInbox.getTitle());
            this.b.setText(pushNotificationInbox.getBody());
            this.c.setText(pushNotificationInbox.getTimestamp());
            this.e.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dfu$a$XMWWX5kzSCatFoi4OtNcpEjy_ow
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dfu.a.lambda$XMWWX5kzSCatFoi4OtNcpEjy_ow(PushNotificationInbox.this, view);
                }
            });
            if (Build.VERSION.SDK_INT < 16) {
                if (pushNotificationInbox.getRead().booleanValue()) {
                    ConstraintLayout constraintLayout = this.d;
                    constraintLayout.setBackgroundDrawable(ContextCompat.getDrawable(constraintLayout.getContext(), R.drawable.border_notification_inbox_white));
                    return;
                }
                ConstraintLayout constraintLayout2 = this.d;
                constraintLayout2.setBackgroundDrawable(ContextCompat.getDrawable(constraintLayout2.getContext(), R.drawable.border_notification_inbox));
            } else if (pushNotificationInbox.getRead().booleanValue()) {
                ConstraintLayout constraintLayout3 = this.d;
                constraintLayout3.setBackground(ContextCompat.getDrawable(constraintLayout3.getContext(), R.drawable.border_notification_inbox_white));
            } else {
                ConstraintLayout constraintLayout4 = this.d;
                constraintLayout4.setBackground(ContextCompat.getDrawable(constraintLayout4.getContext(), R.drawable.border_notification_inbox));
            }
        }

        public static /* synthetic */ void a(PushNotificationInbox pushNotificationInbox, View view) {
            dfu.a.onItemClickedListener(view, pushNotificationInbox);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_notification_inbox, viewGroup, false));
    }
}
