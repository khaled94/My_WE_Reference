package com.ucare.we.presentation.offers;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class OffersAndExtraActivity_ViewBinding implements Unbinder {
    private OffersAndExtraActivity a;

    public OffersAndExtraActivity_ViewBinding(OffersAndExtraActivity offersAndExtraActivity, View view) {
        this.a = offersAndExtraActivity;
        offersAndExtraActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        offersAndExtraActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        offersAndExtraActivity.offerRelativeLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.offerRelativeLayout, "field 'offerRelativeLayout'", RelativeLayout.class);
        offersAndExtraActivity.extraRelativeLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.extraRelativeLayout, "field 'extraRelativeLayout'", RelativeLayout.class);
        offersAndExtraActivity.offerRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.offer_recyclerView, "field 'offerRecyclerView'", RecyclerView.class);
        offersAndExtraActivity.extraRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.extra_recyclerView, "field 'extraRecyclerView'", RecyclerView.class);
        offersAndExtraActivity.offerLoadingTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.offer_loadingTextView, "field 'offerLoadingTextView'", TextView.class);
        offersAndExtraActivity.extraLoadingTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.extraLoadingTextView, "field 'extraLoadingTextView'", TextView.class);
        offersAndExtraActivity.offerSwipeRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.offerSwipeRefreshLayout, "field 'offerSwipeRefreshLayout'", SwipeRefreshLayout.class);
        offersAndExtraActivity.extraSwipeRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.extraSwipeRefreshLayout, "field 'extraSwipeRefreshLayout'", SwipeRefreshLayout.class);
        offersAndExtraActivity.offersRadioButton = (RadioButton) Utils.findRequiredViewAsType(view, R.id.offersRadioButton, "field 'offersRadioButton'", RadioButton.class);
        offersAndExtraActivity.extraRadioButton = (RadioButton) Utils.findRequiredViewAsType(view, R.id.extraRadioButton, "field 'extraRadioButton'", RadioButton.class);
        offersAndExtraActivity.offerTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.offerTextView, "field 'offerTextView'", TextView.class);
        offersAndExtraActivity.extraTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.extraTextView, "field 'extraTextView'", TextView.class);
        offersAndExtraActivity.offerListTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.offer_listTitle, "field 'offerListTitle'", TextView.class);
        offersAndExtraActivity.extraListTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.extra_listTitle, "field 'extraListTitle'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OffersAndExtraActivity offersAndExtraActivity = this.a;
        if (offersAndExtraActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        offersAndExtraActivity.imgBackButton = null;
        offersAndExtraActivity.txtTitle = null;
        offersAndExtraActivity.offerRelativeLayout = null;
        offersAndExtraActivity.extraRelativeLayout = null;
        offersAndExtraActivity.offerRecyclerView = null;
        offersAndExtraActivity.extraRecyclerView = null;
        offersAndExtraActivity.offerLoadingTextView = null;
        offersAndExtraActivity.extraLoadingTextView = null;
        offersAndExtraActivity.offerSwipeRefreshLayout = null;
        offersAndExtraActivity.extraSwipeRefreshLayout = null;
        offersAndExtraActivity.offersRadioButton = null;
        offersAndExtraActivity.extraRadioButton = null;
        offersAndExtraActivity.offerTextView = null;
        offersAndExtraActivity.extraTextView = null;
        offersAndExtraActivity.offerListTitle = null;
        offersAndExtraActivity.extraListTitle = null;
    }
}
