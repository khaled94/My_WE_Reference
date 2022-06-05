package defpackage;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: cra  reason: default package */
/* loaded from: classes2.dex */
public final class cra {
    public static final boolean a;
    public static final DefaultDateTypeAdapter.a<? extends Date> b;
    public static final DefaultDateTypeAdapter.a<? extends Date> c;
    public static final cqe d;
    public static final cqe e;
    public static final cqe f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new DefaultDateTypeAdapter.a<java.sql.Date>(java.sql.Date.class) { // from class: cra.1
                @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
                public final /* synthetic */ java.sql.Date a(Date date) {
                    return new java.sql.Date(date.getTime());
                }
            };
            c = new DefaultDateTypeAdapter.a<Timestamp>(Timestamp.class) { // from class: cra.2
                @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
                public final /* synthetic */ Timestamp a(Date date) {
                    return new Timestamp(date.getTime());
                }
            };
            d = SqlDateTypeAdapter.a;
            e = SqlTimeTypeAdapter.a;
            f = SqlTimestampTypeAdapter.a;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }

    private cra() {
    }
}
