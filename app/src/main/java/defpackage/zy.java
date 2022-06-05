package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import defpackage.abd;

/* renamed from: zy  reason: default package */
/* loaded from: classes2.dex */
public class zy<T extends abd> extends zu<T> {
    private static final String[] b = {"data"};
    private final Parcelable.Creator<T> c;

    public zy(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.c = creator;
    }

    @Override // defpackage.zv
    public final /* synthetic */ Object a(int i) {
        DataHolder dataHolder = (DataHolder) aat.a(this.a);
        byte[] a = dataHolder.a("data", i, dataHolder.a(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(a, 0, a.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.c.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
