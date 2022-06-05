package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ze  reason: default package */
/* loaded from: classes2.dex */
public final class ze implements Runnable {
    final /* synthetic */ zf a;
    private final zc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ze(zf zfVar, zc zcVar) {
        this.a = zfVar;
        this.b = zcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.c) {
            return;
        }
        ConnectionResult connectionResult = this.b.b;
        if (connectionResult.a()) {
            this.a.a.startActivityForResult(GoogleApiActivity.a(this.a.a(), (PendingIntent) aat.a(connectionResult.d), this.b.a, false), 1);
            return;
        }
        zf zfVar = this.a;
        if (zfVar.e.a(zfVar.a(), connectionResult.c, (String) null) != null) {
            zf zfVar2 = this.a;
            ux uxVar = zfVar2.e;
            Activity a = zfVar2.a();
            vv vvVar = this.a.a;
            int i = connectionResult.c;
            zf zfVar3 = this.a;
            Dialog a2 = ux.a(a, i, abr.a(vvVar, uxVar.a(a, i, "d")), zfVar3);
            if (a2 == null) {
                return;
            }
            ux.a(a, a2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, zfVar3);
        } else if (connectionResult.c == 18) {
            Activity a3 = this.a.a();
            zf zfVar4 = this.a;
            ProgressBar progressBar = new ProgressBar(a3, null, 16842874);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(a3);
            builder.setView(progressBar);
            builder.setMessage(abn.b(a3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            ux.a(a3, create, "GooglePlayServicesUpdatingDialog", zfVar4);
            ux.a(this.a.a().getApplicationContext(), new zd(this, create));
        } else {
            this.a.c(connectionResult, this.b.a);
        }
    }
}
