package defpackage;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.Comparator;

@Deprecated
/* renamed from: bgr  reason: default package */
/* loaded from: classes2.dex */
public final class bgr extends zu<Object> implements vi {
    private static final Comparator<bhc> b = new bij();
    private final String c;
    private final int d;
    private final Status e;
    private final boolean f;

    public static int a(Bundle bundle) {
        return bundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
    }

    public bgr(DataHolder dataHolder, int i) {
        this(dataHolder, i, (byte) 0);
    }

    private bgr(DataHolder dataHolder, int i, byte b2) {
        super(dataHolder);
        this.e = bgu.b(dataHolder.d);
        switch (i) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                this.d = i;
                this.f = false;
                if (dataHolder != null && dataHolder.e != null) {
                    this.c = dataHolder.e.getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
                    return;
                } else {
                    this.c = null;
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid source: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.vi
    public final Status a() {
        return this.e;
    }

    public final String toString() {
        return aar.a(this).a(NotificationCompat.CATEGORY_STATUS, this.e).a("attributions", this.c).toString();
    }

    @Override // defpackage.zv
    public final /* synthetic */ Object a(int i) {
        return new bhe(this.a, i);
    }
}
