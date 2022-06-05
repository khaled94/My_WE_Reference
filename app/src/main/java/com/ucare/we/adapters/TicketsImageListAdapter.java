package com.ucare.we.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ucare.we.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class TicketsImageListAdapter extends RecyclerView.Adapter<MyViewHolder> {
    dhq a;
    ArrayList<Bitmap> b;
    private Context c = this.c;
    private Context c = this.c;

    /* loaded from: classes2.dex */
    public class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder a;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.a = myViewHolder;
            myViewHolder.ticketImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.circleView, "field 'ticketImageView'", ImageView.class);
            myViewHolder.closeTextView = (ImageView) Utils.findRequiredViewAsType(view, R.id.cloaseTextView, "field 'closeTextView'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MyViewHolder myViewHolder = this.a;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.a = null;
            myViewHolder.ticketImageView = null;
            myViewHolder.closeTextView = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(MyViewHolder myViewHolder, final int i) {
        MyViewHolder myViewHolder2 = myViewHolder;
        myViewHolder2.closeTextView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.TicketsImageListAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TicketsImageListAdapter.this.a.b(i);
            }
        });
        myViewHolder2.ticketImageView.setImageBitmap(this.a.a(i));
    }

    public TicketsImageListAdapter(dhq dhqVar) {
        this.a = dhqVar;
        this.b = dhqVar.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    /* loaded from: classes2.dex */
    class MyViewHolder extends RecyclerView.ViewHolder {
        final View a;
        @BindView(R.id.cloaseTextView)
        ImageView closeTextView;
        @BindView(R.id.circleView)
        ImageView ticketImageView;

        MyViewHolder(View view) {
            super(view);
            this.a = view;
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tickets_image_adapter_content, viewGroup, false));
    }
}
