package com.ucare.we.presentation.inbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.remote.NotificationInboxResponseBody;
import com.ucare.we.model.remote.PushNotificationInbox;
import com.ucare.we.presentation.inboxdetails.NotificationInboxDetailsActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class NotificationInboxActivity extends czy implements dfv {
    @Inject
    dfw a;
    @Inject
    djw b;
    @Inject
    djg c;
    private ImageView d;
    private ImageView e;
    private TextView f;
    private Button g;
    private RecyclerView h;
    private dfu i;

    /* renamed from: lambda$39_-FFAr9fzOadtEg-Aavcj5f4Q */
    public static /* synthetic */ void m54lambda$39_FFAr9fzOadtEgAavcj5f4Q(NotificationInboxActivity notificationInboxActivity, View view, PushNotificationInbox pushNotificationInbox) {
        notificationInboxActivity.a(view, pushNotificationInbox);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_notification_inbox);
        a(getString(R.string.inbox), false, false);
        this.d = (ImageView) findViewById(R.id.imgBackButton);
        this.e = (ImageView) findViewById(R.id.iv_close);
        this.f = (TextView) findViewById(R.id.tvEmpty);
        this.h = (RecyclerView) findViewById(R.id.rvNotificationsInbox);
        this.i = new dfu();
        this.h.setLayoutManager(new LinearLayoutManager(this));
        this.h.setAdapter(this.i);
        dfu.a(new djn() { // from class: com.ucare.we.presentation.inbox.-$$Lambda$NotificationInboxActivity$39_-FFAr9fzOadtEg-Aavcj5f4Q
            @Override // defpackage.djn
            public final void onItemClickedListener(View view, Object obj) {
                NotificationInboxActivity.m54lambda$39_FFAr9fzOadtEgAavcj5f4Q(NotificationInboxActivity.this, view, (PushNotificationInbox) obj);
            }
        });
        this.g.setText(this.b.m());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.c.a(this, getString(R.string.loading));
        this.a.a("all");
        this.a.a(this);
    }

    @Override // defpackage.dfv
    public final void a(NotificationInboxResponseBody notificationInboxResponseBody) {
        new Gson().a(notificationInboxResponseBody);
        this.c.a();
        if (notificationInboxResponseBody.getPushNotificationInbox().size() == 0) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        this.i.a(notificationInboxResponseBody.getPushNotificationInbox());
    }

    @Override // defpackage.dfv
    public final void a(String str) {
        this.c.a();
    }

    public /* synthetic */ void a(View view, PushNotificationInbox pushNotificationInbox) {
        Intent intent = new Intent(this, NotificationInboxDetailsActivity.class);
        intent.putExtra("inboxDetails", pushNotificationInbox);
        startActivity(intent);
    }
}
