package com.ucare.we;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class SocialMediaActivity extends czy implements View.OnClickListener {
    @Inject
    dhn a;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_social_media);
        a(getString(R.string.follow_us), false, false);
        findViewById(R.id.imgBackButton).setOnClickListener(this);
        findViewById(R.id.imageButtonFacebook).setOnClickListener(this);
        findViewById(R.id.imageButtonGooglePlus).setOnClickListener(this);
        findViewById(R.id.imageButtonInstagram).setOnClickListener(this);
        findViewById(R.id.imageButtonLinkedIn).setOnClickListener(this);
        findViewById(R.id.imageButtonTwitter).setOnClickListener(this);
        findViewById(R.id.imageButtonYoutube).setOnClickListener(this);
        ((TextView) findViewById(R.id.txtTitle)).setText(getString(R.string.follow_us));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id == R.id.imageButtonFacebook) {
            if (this.a.f == null) {
                a(getString(R.string.facebook));
            } else {
                a(this.a.f.getFacebook());
            }
        } else if (id == R.id.imageButtonGooglePlus) {
            if (this.a.f == null) {
                a(getString(R.string.googleplus));
            } else {
                a(this.a.f.getGooglePlus());
            }
        } else if (id == R.id.imageButtonInstagram) {
            if (this.a.f == null) {
                a(getString(R.string.instagram));
            } else {
                a(this.a.f.getInstagram());
            }
        } else if (id == R.id.imageButtonLinkedIn) {
            if (this.a.f == null) {
                a(getString(R.string.linkedin));
            } else {
                a(this.a.f.getLinkedin());
            }
        } else if (id == R.id.imageButtonTwitter) {
            if (this.a.f == null) {
                a(getString(R.string.twitter));
            } else {
                a(this.a.f.getTwitter());
            }
        } else if (id != R.id.imageButtonYoutube) {
        } else {
            if (this.a.f == null) {
                a(getString(R.string.youtube));
            } else {
                a(this.a.f.getYoutube());
            }
        }
    }

    private void a(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, getString(R.string.error), 0).show();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
