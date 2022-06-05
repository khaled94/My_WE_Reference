package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cht  reason: default package */
/* loaded from: classes2.dex */
public final class cht {

    /* renamed from: cht$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        private static final adj a = new adj("PhoneAuthProvider", new String[0]);

        public static void a() {
            a.a("Sms auto retrieval timed-out.", new Object[0]);
        }
    }

    /* renamed from: cht$a */
    /* loaded from: classes2.dex */
    public static class a extends abb {
        public static final Parcelable.Creator<a> CREATOR = new clj();

        public static a a() {
            return new a();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            abc.b(parcel, abc.a(parcel, 20293));
        }
    }
}
