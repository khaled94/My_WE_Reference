package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ckq  reason: default package */
/* loaded from: classes2.dex */
public class ckq extends chm {
    public static final Parcelable.Creator<ckq> CREATOR = new ckp();
    List<ckm> a;
    String b;
    public cks c;
    public boolean d;
    public cll e;
    cjx f;
    private alf g;
    private ckm h;
    private String i;
    private String j;
    private List<String> k;
    private Boolean l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ckq(alf alfVar, ckm ckmVar, String str, String str2, List<ckm> list, List<String> list2, String str3, Boolean bool, cks cksVar, boolean z, cll cllVar, cjx cjxVar) {
        this.g = alfVar;
        this.h = ckmVar;
        this.i = str;
        this.j = str2;
        this.a = list;
        this.k = list2;
        this.b = str3;
        this.l = bool;
        this.c = cksVar;
        this.d = z;
        this.e = cllVar;
        this.f = cjxVar;
    }

    public ckq(cgw cgwVar, List<? extends chw> list) {
        aat.a(cgwVar);
        this.i = cgwVar.b();
        this.j = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.b = ExifInterface.GPS_MEASUREMENT_2D;
        a(list);
    }

    @Override // defpackage.chm
    public final String g() {
        Map map;
        alf alfVar = this.g;
        if (alfVar == null || alfVar.b == null || (map = (Map) cjw.a(this.g.b).a.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // defpackage.chw
    public final String m() {
        return this.h.b;
    }

    @Override // defpackage.chm
    public final cgw f() {
        return cgw.a(this.i);
    }

    @Override // defpackage.chm
    public final String a() {
        return this.h.a;
    }

    @Override // defpackage.chm
    public final boolean b() {
        String str;
        Boolean bool = this.l;
        if (bool == null || bool.booleanValue()) {
            alf alfVar = this.g;
            if (alfVar != null) {
                Map map = (Map) cjw.a(alfVar.b).a.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z = true;
            if (d().size() > 1 || (str != null && str.equals("custom"))) {
                z = false;
            }
            this.l = Boolean.valueOf(z);
        }
        return this.l.booleanValue();
    }

    @Override // defpackage.chm
    public final List<String> c() {
        return this.k;
    }

    @Override // defpackage.chm
    public final chm a(List<? extends chw> list) {
        aat.a(list);
        this.a = new ArrayList(list.size());
        this.k = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            chw chwVar = list.get(i);
            if (chwVar.m().equals("firebase")) {
                this.h = (ckm) chwVar;
            } else {
                this.k.add(chwVar.m());
            }
            this.a.add((ckm) chwVar);
        }
        if (this.h == null) {
            this.h = this.a.get(0);
        }
        return this;
    }

    @Override // defpackage.chm
    public final List<? extends chw> d() {
        return this.a;
    }

    @Override // defpackage.chm
    public final alf h() {
        return this.g;
    }

    @Override // defpackage.chm
    public final String j() {
        return h().b;
    }

    @Override // defpackage.chm
    public final String i() {
        return this.g.b();
    }

    @Override // defpackage.chm
    public final void a(alf alfVar) {
        this.g = (alf) aat.a(alfVar);
    }

    @Override // defpackage.chm
    public final chn k() {
        return this.c;
    }

    @Override // defpackage.chm
    public final void b(List<clw> list) {
        this.f = cjx.a(list);
    }

    @Override // defpackage.chm
    public final /* synthetic */ clu l() {
        return new cku(this);
    }

    @Override // defpackage.chm
    public final /* synthetic */ chm e() {
        this.l = Boolean.FALSE;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, h(), i);
        abc.a(parcel, 2, this.h, i);
        abc.a(parcel, 3, this.i);
        abc.a(parcel, 4, this.j);
        abc.c(parcel, 5, this.a);
        abc.b(parcel, 6, c());
        abc.a(parcel, 7, this.b);
        abc.a(parcel, 8, Boolean.valueOf(b()));
        abc.a(parcel, 9, k(), i);
        abc.a(parcel, 10, this.d);
        abc.a(parcel, 11, this.e, i);
        abc.a(parcel, 12, this.f, i);
        abc.b(parcel, a);
    }
}
