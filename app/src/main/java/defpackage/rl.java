package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import defpackage.rs;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rl  reason: default package */
/* loaded from: classes2.dex */
public final class rl extends rx {
    public static final Parcelable.Creator<rl> CREATOR = new Parcelable.Creator() { // from class: rl.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rl[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new rl(parcel);
        }
    };
    private static ScheduledThreadPoolExecutor a;

    @Override // defpackage.rx
    public final String a() {
        return "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rl(rs rsVar) {
        super(rsVar);
    }

    public final void d_() {
        e().a(rs.d.a(e().g, "User canceled log in."));
    }

    public static synchronized ScheduledThreadPoolExecutor c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (rl.class) {
            if (a == null) {
                a = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = a;
        }
        return scheduledThreadPoolExecutor;
    }

    protected rl(Parcel parcel) {
        super(parcel);
    }

    @Override // defpackage.rx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    @Override // defpackage.rx
    public final int a(rs.c cVar) {
        FragmentActivity activity = e().c.getActivity();
        if (activity == null || activity.isFinishing()) {
            return 1;
        }
        rk rkVar = new rk();
        rkVar.show(activity.getSupportFragmentManager(), "login_with_facebook");
        rkVar.a(cVar);
        return 1;
    }
}
