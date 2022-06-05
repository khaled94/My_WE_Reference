package defpackage;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.remote.NotificationInboxResponseBody;
import com.ucare.we.model.remote.PushNotificationInbox;
import com.ucare.we.presentation.inboxdetails.NotificationInboxDetailsActivity;
import com.ucare.we.view.FabBottomNavigation;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J&\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u001dH\u0016J\u001a\u00101\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ucare/we/presentation/inbox/InboxFragment;", "Lcom/ucare/we/injection/BaseFragment;", "Lcom/ucare/we/presentation/inbox/NotificationInboxListener;", "()V", "btnCurrentNumber", "Landroid/widget/Button;", "faBottomBar", "Lcom/ucare/we/view/FabBottomNavigation;", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "notificationInboxAdapter", "Lcom/ucare/we/presentation/inbox/NotificationInboxAdapter;", "notificationInboxProvider", "Lcom/ucare/we/presentation/inbox/NotificationInboxProvider;", "getNotificationInboxProvider", "()Lcom/ucare/we/presentation/inbox/NotificationInboxProvider;", "setNotificationInboxProvider", "(Lcom/ucare/we/presentation/inbox/NotificationInboxProvider;)V", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "rvNotificationsInbox", "Landroidx/recyclerview/widget/RecyclerView;", "tvEmpty", "Landroid/widget/TextView;", "initAdapter", "", "initViews", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGetNotificationInboxFailure", "failureReason", "", "failureMessage", "", "onGetNotificationInboxSuccess", "notificationsInboxResponseBodyList", "Lcom/ucare/we/model/remote/NotificationInboxResponseBody;", "onResume", "onViewCreated", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dft */
/* loaded from: classes2.dex */
public final class dft extends dab implements dfv {
    @Inject
    public dfw a;
    @Inject
    public djw b;
    private TextView c;
    private Button d;
    private RecyclerView e;
    private dfu f;
    private FabBottomNavigation g;
    private FloatingActionButton h;

    /* renamed from: lambda$HDpXyX-V-s_LkksHlif_HVwQhGU */
    public static /* synthetic */ void m111lambda$HDpXyXVs_LkksHlif_HVwQhGU(dft dftVar, View view, PushNotificationInbox pushNotificationInbox) {
        a(dftVar, view, pushNotificationInbox);
    }

    @Override // defpackage.dfv
    public final void a(String str) {
        dqc.d(str, "failureMessage");
    }

    private dfw a() {
        dfw dfwVar = this.a;
        if (dfwVar != null) {
            return dfwVar;
        }
        dqc.a("notificationInboxProvider");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dqc.d(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_notification_inbox, viewGroup, false);
        dqc.b(inflate, "view");
        this.d = (Button) inflate.findViewById(R.id.btn_current_number);
        this.g = (FabBottomNavigation) requireActivity().findViewById(R.id.fab_bottom_bar);
        this.h = (FloatingActionButton) requireActivity().findViewById(R.id.fab);
        this.c = (TextView) inflate.findViewById(R.id.tvEmpty);
        this.e = (RecyclerView) inflate.findViewById(R.id.rvNotificationsInbox);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        dqc.d(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.ucare.we.injection.BaseActivity");
        }
        czy czyVar = (czy) activity;
        String string = getString(R.string.inbox);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) czyVar.findViewById(R.id.toolbar_layout);
        dqc.b(collapsingToolbarLayout, "collapsingToolbarLayout");
        czyVar.a(collapsingToolbarLayout);
        collapsingToolbarLayout.setTitle(string);
        czyVar.setSupportActionBar((Toolbar) czyVar.findViewById(R.id.toolbar));
        Typeface font = ResourcesCompat.getFont(czyVar, R.font.montserrat_bold);
        collapsingToolbarLayout.setCollapsedTitleTypeface(font);
        collapsingToolbarLayout.setExpandedTitleTypeface(font);
        ActionBar supportActionBar = czyVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(true);
        }
        ActionBar supportActionBar2 = czyVar.getSupportActionBar();
        if (supportActionBar2 == null) {
            return;
        }
        supportActionBar2.setDisplayHomeAsUpEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f = new dfu();
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.e;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f);
        }
        if (this.f != null) {
            dfu.a(new djn() { // from class: -$$Lambda$dft$HDpXyX-V-s_LkksHlif_HVwQhGU
                @Override // defpackage.djn
                public final void onItemClickedListener(View view, Object obj) {
                    dft.m111lambda$HDpXyXVs_LkksHlif_HVwQhGU(dft.this, view, (PushNotificationInbox) obj);
                }
            });
        }
        Button button = this.d;
        if (button != null) {
            djw djwVar = this.b;
            if (djwVar != null) {
                button.setText(djwVar.m());
            } else {
                dqc.a("repository");
                throw null;
            }
        }
        a().a("all");
        a().a(this);
    }

    @Override // defpackage.dfv
    public final void a(NotificationInboxResponseBody notificationInboxResponseBody) {
        dqc.d(notificationInboxResponseBody, "notificationsInboxResponseBodyList");
        new Gson().a(notificationInboxResponseBody);
        if (notificationInboxResponseBody.getPushNotificationInbox().size() == 0) {
            TextView textView = this.c;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        dfu dfuVar = this.f;
        if (dfuVar != null) {
            dfuVar.a(notificationInboxResponseBody.getPushNotificationInbox());
        }
    }

    public static final void a(dft dftVar, View view, PushNotificationInbox pushNotificationInbox) {
        dqc.d(dftVar, "this$0");
        Intent intent = new Intent(dftVar.getContext(), NotificationInboxDetailsActivity.class);
        intent.putExtra("inboxDetails", pushNotificationInbox);
        dftVar.startActivity(intent);
    }
}
