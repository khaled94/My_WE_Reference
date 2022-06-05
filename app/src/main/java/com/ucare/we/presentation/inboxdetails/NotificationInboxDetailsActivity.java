package com.ucare.we.presentation.inboxdetails;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ucare.we.R;
import com.ucare.we.model.remote.NotificationInboxResponseBody;
import com.ucare.we.model.remote.PushNotificationInbox;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class NotificationInboxDetailsActivity extends czy implements dfv {
    @Inject
    djw a;
    @Inject
    dfw b;
    private ImageView c;
    private Button d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private ConstraintLayout i;

    public static /* synthetic */ void lambda$4VB5aRIFDRcMBepf7eUr6ALv0Z8(NotificationInboxDetailsActivity notificationInboxDetailsActivity, View view) {
        notificationInboxDetailsActivity.a(view);
    }

    @Override // defpackage.dfv
    public final void a(NotificationInboxResponseBody notificationInboxResponseBody) {
    }

    @Override // defpackage.dfv
    public final void a(String str) {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.activity_notification_inbox_details);
        a(getString(R.string.inbox), false, false);
        TextView textView = (TextView) findViewById(R.id.txtTitle);
        this.h = textView;
        textView.setText(getString(R.string.inbox));
        this.i = (ConstraintLayout) findViewById(R.id.mainLayout);
        this.d = (Button) findViewById(R.id.btn_current_number);
        this.c = (ImageView) findViewById(R.id.imgBackButton);
        this.e = (TextView) findViewById(R.id.tvTitle);
        this.f = (TextView) findViewById(R.id.tvBody);
        this.g = (TextView) findViewById(R.id.tvDate);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.inboxdetails.-$$Lambda$NotificationInboxDetailsActivity$4VB5aRIFDRcMBepf7eUr6ALv0Z8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationInboxDetailsActivity.lambda$4VB5aRIFDRcMBepf7eUr6ALv0Z8(NotificationInboxDetailsActivity.this, view);
            }
        });
        PushNotificationInbox pushNotificationInbox = (PushNotificationInbox) getIntent().getParcelableExtra("inboxDetails");
        this.e.setText(pushNotificationInbox.getTitle());
        this.f.setText(pushNotificationInbox.getBody());
        this.g.setText(pushNotificationInbox.getTimestamp());
        this.d.setText(this.a.m());
        this.b.a(this);
        this.b.a(pushNotificationInbox.getId().intValue());
        String body = pushNotificationInbox.getBody();
        int i = 0;
        while (true) {
            if (i >= body.length()) {
                z = false;
                break;
            }
            int codePointAt = body.codePointAt(i);
            if (codePointAt >= 1536 && codePointAt <= 1760) {
                z = true;
                break;
            }
            i += Character.charCount(codePointAt);
        }
        if (z) {
            this.f.setTextDirection(1);
        } else {
            this.f.setTextDirection(0);
        }
    }

    public /* synthetic */ void a(View view) {
        finish();
    }
}
