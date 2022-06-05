package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.R;
import defpackage.lz;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: sj  reason: default package */
/* loaded from: classes2.dex */
public class sj extends DialogFragment {
    private static ScheduledThreadPoolExecutor f;
    private ProgressBar a;
    private TextView b;
    private Dialog c;
    private volatile a d;
    private volatile ScheduledFuture e;
    private sn g;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a aVar;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null && (aVar = (a) bundle.getParcelable("request_state")) != null) {
            a(aVar);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.c = new Dialog(getActivity(), R.style.com_facebook_auth_dialog);
        Bundle bundle2 = null;
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.a = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.b = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: sj.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (qx.a(this)) {
                    return;
                }
                try {
                    sj.this.c.dismiss();
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        });
        ((TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        this.c.setContentView(inflate);
        sn snVar = this.g;
        if (snVar != null) {
            if (snVar instanceof sp) {
                bundle2 = sm.a((sp) snVar);
            } else if (snVar instanceof st) {
                bundle2 = sm.a((st) snVar);
            }
        }
        Bundle bundle3 = bundle2;
        if (bundle3 == null || bundle3.size() == 0) {
            a(new lx(0, "", "Failed to get share content"));
        }
        bundle3.putString("access_token", qj.b() + "|" + qj.c());
        bundle3.putString("device_info", pf.b());
        new lz((lk) null, "device/share", bundle3, md.POST, new lz.b() { // from class: sj.2
            @Override // defpackage.lz.b
            public final void a(mc mcVar) {
                lx lxVar = mcVar.c;
                if (lxVar != null) {
                    sj.this.a(lxVar);
                    return;
                }
                JSONObject jSONObject = mcVar.b;
                a aVar = new a();
                try {
                    aVar.a = jSONObject.getString("user_code");
                    aVar.b = jSONObject.getLong("expires_in");
                    sj.this.a(aVar);
                } catch (JSONException unused) {
                    sj.this.a(new lx(0, "", "Malformed server response"));
                }
            }
        }, (byte) 0).a();
        return this.c;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.e != null) {
            this.e.cancel(true);
        }
        a(new Intent());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.d != null) {
            bundle.putParcelable("request_state", this.d);
        }
    }

    private void a(Intent intent) {
        if (this.d != null) {
            pf.c(this.d.a);
        }
        lx lxVar = (lx) intent.getParcelableExtra("error");
        if (lxVar != null) {
            Toast.makeText(getContext(), lxVar.a(), 0).show();
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    private void a() {
        if (isAdded()) {
            getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    public final void a(sn snVar) {
        this.g = snVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(lx lxVar) {
        a();
        Intent intent = new Intent();
        intent.putExtra("error", lxVar);
        a(intent);
    }

    private static synchronized ScheduledThreadPoolExecutor b() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (sj.class) {
            if (f == null) {
                f = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f;
        }
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        this.d = aVar;
        this.b.setText(aVar.a);
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        this.e = b().schedule(new Runnable() { // from class: sj.3
            @Override // java.lang.Runnable
            public final void run() {
                if (qx.a(this)) {
                    return;
                }
                try {
                    sj.this.c.dismiss();
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        }, aVar.b, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sj$a */
    /* loaded from: classes2.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: sj.a.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ a[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        String a;
        long b;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        a() {
        }

        protected a(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeLong(this.b);
        }
    }
}
