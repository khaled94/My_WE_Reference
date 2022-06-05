package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cpa  reason: default package */
/* loaded from: classes2.dex */
public final class cpa extends abb {
    public static final Parcelable.Creator<cpa> CREATOR = new cpg();
    public Bundle a;
    public a b;

    public cpa(Bundle bundle) {
        this.a = bundle;
    }

    /* renamed from: cpa$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final String a;
        public final String b;
        private final String c;
        private final String[] d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;

        private a(Bundle bundle) {
            this.a = cpb.a(bundle, "gcm.n.title");
            this.c = cpb.d(bundle, "gcm.n.title");
            this.d = a(bundle, "gcm.n.title");
            this.b = cpb.a(bundle, "gcm.n.body");
            this.e = cpb.d(bundle, "gcm.n.body");
            this.f = a(bundle, "gcm.n.body");
            this.g = cpb.a(bundle, "gcm.n.icon");
            this.i = cpb.c(bundle);
            this.j = cpb.a(bundle, "gcm.n.tag");
            this.k = cpb.a(bundle, "gcm.n.color");
            this.l = cpb.a(bundle, "gcm.n.click_action");
            this.m = cpb.a(bundle, "gcm.n.android_channel_id");
            this.n = cpb.d(bundle);
            this.h = cpb.a(bundle, "gcm.n.image");
        }

        private static String[] a(Bundle bundle, String str) {
            Object[] b = cpb.b(bundle, str);
            if (b == null) {
                return null;
            }
            String[] strArr = new String[b.length];
            for (int i = 0; i < b.length; i++) {
                strArr[i] = String.valueOf(b[i]);
            }
            return strArr;
        }

        public /* synthetic */ a(Bundle bundle, byte b) {
            this(bundle);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a);
        abc.b(parcel, a2);
    }
}
