package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* renamed from: zx  reason: default package */
/* loaded from: classes2.dex */
public abstract class zx {
    protected final DataHolder a;
    protected int b;
    private int c;

    public zx(DataHolder dataHolder, int i) {
        this.a = (DataHolder) aat.a(dataHolder);
        a(i);
    }

    private void a(int i) {
        boolean z = false;
        if (i >= 0 && i < this.a.g) {
            z = true;
        }
        aat.b(z);
        this.b = i;
        this.c = this.a.a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float a(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.c[i2].getFloat(i, dataHolder.b.getInt(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.c[i2].getInt(i, dataHolder.b.getInt(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.c[i2].getString(i, dataHolder.b.getInt(str));
    }

    public final boolean d(String str) {
        return this.a.b.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.c[i2].isNull(i, dataHolder.b.getInt(str));
    }

    public boolean equals(Object obj) {
        if (obj instanceof zx) {
            zx zxVar = (zx) obj;
            if (aar.a(Integer.valueOf(zxVar.b), Integer.valueOf(this.b)) && aar.a(Integer.valueOf(zxVar.c), Integer.valueOf(this.c)) && zxVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] f(String str) {
        return this.a.a(str, this.b, this.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
