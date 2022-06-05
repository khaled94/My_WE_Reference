package defpackage;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aey  reason: default package */
/* loaded from: classes.dex */
public abstract class aey extends adh {
    private final int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public aey(byte[] bArr) {
        aat.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.adi
    public final int a() {
        return this.a;
    }

    @Override // defpackage.adi
    public final afn b() {
        return afp.a(d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] d();

    public final boolean equals(Object obj) {
        afn b;
        if (obj != null && (obj instanceof adi)) {
            try {
                adi adiVar = (adi) obj;
                if (adiVar.a() != this.a || (b = adiVar.b()) == null) {
                    return false;
                }
                return Arrays.equals(d(), (byte[]) afp.a(b));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
