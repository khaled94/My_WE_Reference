package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.common.R;
import defpackage.lz;
import defpackage.qi;
import defpackage.rs;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rk  reason: default package */
/* loaded from: classes2.dex */
public class rk extends DialogFragment {
    private View a;
    private TextView b;
    private TextView c;
    private rl d;
    private volatile ma f;
    private volatile ScheduledFuture g;
    private volatile a h;
    private AtomicBoolean e = new AtomicBoolean();
    private boolean i = false;
    private boolean j = false;
    private rs.c k = null;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a aVar;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.d = (rl) ((ru) ((FacebookActivity) getActivity()).a).a.d();
        if (bundle != null && (aVar = (a) bundle.getParcelable("request_state")) != null) {
            a(aVar);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getActivity(), R.style.com_facebook_auth_dialog) { // from class: rk.1
            @Override // android.app.Dialog
            public final void onBackPressed() {
                super.onBackPressed();
            }
        };
        dialog.setContentView(a(pf.c() && !this.j));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.i) {
            a();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.h != null) {
            bundle.putParcelable("request_state", this.h);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.i = true;
        this.e.set(true);
        super.onDestroyView();
        if (this.f != null) {
            this.f.cancel(true);
        }
        if (this.g != null) {
            this.g.cancel(true);
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(rs.c cVar) {
        this.k = cVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", cVar.b));
        String str = cVar.g;
        if (str != null) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = cVar.i;
        if (str2 != null) {
            bundle.putString("target_user_id", str2);
        }
        bundle.putString("access_token", qj.b() + "|" + qj.c());
        bundle.putString("device_info", pf.a());
        new lz((lk) null, "device/login", bundle, md.POST, new lz.b() { // from class: rk.2
            @Override // defpackage.lz.b
            public final void a(mc mcVar) {
                if (rk.this.i) {
                    return;
                }
                if (mcVar.c != null) {
                    rk.this.a(mcVar.c.a);
                    return;
                }
                JSONObject jSONObject = mcVar.b;
                a aVar = new a();
                try {
                    String string = jSONObject.getString("user_code");
                    aVar.b = string;
                    aVar.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", string);
                    aVar.c = jSONObject.getString("code");
                    aVar.d = jSONObject.getLong("interval");
                    rk.this.a(aVar);
                } catch (JSONException e) {
                    rk.this.a(new FacebookException(e));
                }
            }
        }, (byte) 0).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        this.h = aVar;
        this.b.setText(aVar.b);
        this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), pf.b(aVar.a)), (Drawable) null, (Drawable) null);
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        if (!this.j && pf.a(aVar.b)) {
            new na(getContext()).a("fb_smart_login_service");
        }
        if (aVar.a()) {
            c();
        } else {
            b();
        }
    }

    protected final View a(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(b(z), (ViewGroup) null);
        this.a = inflate.findViewById(R.id.progress_bar);
        this.b = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: rk.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (qx.a(this)) {
                    return;
                }
                try {
                    rk.this.a();
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        });
        TextView textView = (TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions);
        this.c = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    private static int b(boolean z) {
        return z ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.h.e = new Date().getTime();
        this.f = d().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.g = rl.c().schedule(new Runnable() { // from class: rk.4
            @Override // java.lang.Runnable
            public final void run() {
                if (qx.a(this)) {
                    return;
                }
                try {
                    rk.this.b();
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        }, this.h.d, TimeUnit.SECONDS);
    }

    private lz d() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.h.c);
        return new lz((lk) null, "device/login_status", bundle, md.POST, new lz.b() { // from class: rk.5
            @Override // defpackage.lz.b
            public final void a(mc mcVar) {
                if (rk.this.e.get()) {
                    return;
                }
                lx lxVar = mcVar.c;
                if (lxVar != null) {
                    int i = lxVar.d;
                    if (i != 1349152) {
                        switch (i) {
                            case 1349172:
                            case 1349174:
                                rk.this.c();
                                return;
                            case 1349173:
                                rk.this.a();
                                return;
                            default:
                                rk.this.a(mcVar.c.a);
                                return;
                        }
                    }
                    if (rk.this.h != null) {
                        pf.c(rk.this.h.b);
                    }
                    if (rk.this.k != null) {
                        rk rkVar = rk.this;
                        rkVar.a(rkVar.k);
                        return;
                    }
                    rk.this.a();
                    return;
                }
                try {
                    JSONObject jSONObject = mcVar.b;
                    rk.a(rk.this, jSONObject.getString("access_token"), Long.valueOf(jSONObject.getLong("expires_in")), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                } catch (JSONException e) {
                    rk.this.a(new FacebookException(e));
                }
            }
        }, (byte) 0);
    }

    protected final void a(FacebookException facebookException) {
        if (!this.e.compareAndSet(false, true)) {
            return;
        }
        if (this.h != null) {
            pf.c(this.h.b);
        }
        rl rlVar = this.d;
        rlVar.e().a(rs.d.a(rlVar.e().g, (String) null, facebookException.getMessage()));
        getDialog().dismiss();
    }

    protected final void a() {
        if (!this.e.compareAndSet(false, true)) {
            return;
        }
        if (this.h != null) {
            pf.c(this.h.b);
        }
        rl rlVar = this.d;
        if (rlVar != null) {
            rlVar.d_();
        }
        getDialog().dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rk$a */
    /* loaded from: classes2.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: rk.a.1
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
        String b;
        String c;
        long d;
        long e;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        a() {
        }

        protected a(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readLong();
            this.e = parcel.readLong();
        }

        public final boolean a() {
            return this.e != 0 && (new Date().getTime() - this.e) - (this.d * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }
    }

    static /* synthetic */ void a(rk rkVar, final String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = l.longValue() != 0 ? new Date(new Date().getTime() + (l.longValue() * 1000)) : null;
        if (l2.longValue() != 0 && l2 != null) {
            date = new Date(l2.longValue() * 1000);
        }
        new lz(new lk(str, ly.m(), "0", null, null, null, null, date2, date), "me", bundle, md.GET, new lz.b() { // from class: rk.8
            @Override // defpackage.lz.b
            public final void a(mc mcVar) {
                if (rk.this.e.get()) {
                    return;
                }
                if (mcVar.c != null) {
                    rk.this.a(mcVar.c.a);
                    return;
                }
                try {
                    JSONObject jSONObject = mcVar.b;
                    String string = jSONObject.getString("id");
                    qi.b c = qi.c(jSONObject);
                    String string2 = jSONObject.getString("name");
                    pf.c(rk.this.h.b);
                    if (pw.a(ly.m()).c.contains(qh.RequireConfirm) && !rk.this.j) {
                        rk.this.j = true;
                        rk.a(rk.this, string, c, str, string2, date2, date);
                        return;
                    }
                    rk.a(rk.this, string, c, str, date2, date);
                } catch (JSONException e) {
                    rk.this.a(new FacebookException(e));
                }
            }
        }, (byte) 0).a();
    }

    static /* synthetic */ void a(rk rkVar, String str, qi.b bVar, String str2, Date date, Date date2) {
        rl rlVar = rkVar.d;
        rlVar.e().a(rs.d.a(rlVar.e().g, new lk(str2, ly.m(), str, bVar.a, bVar.b, bVar.c, lo.DEVICE_AUTH, date, date2)));
        rkVar.getDialog().dismiss();
    }

    static /* synthetic */ void a(rk rkVar, final String str, final qi.b bVar, final String str2, String str3, final Date date, final Date date2) {
        String string = rkVar.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
        String string2 = rkVar.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
        String string3 = rkVar.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, str3);
        AlertDialog.Builder builder = new AlertDialog.Builder(rkVar.getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: rk.7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                rk.a(rk.this, str, bVar, str2, date, date2);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: rk.6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                rk.this.getDialog().setContentView(rk.this.a(false));
                rk rkVar2 = rk.this;
                rkVar2.a(rkVar2.k);
            }
        });
        builder.create().show();
    }
}
