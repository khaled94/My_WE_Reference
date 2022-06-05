package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: bpl  reason: default package */
/* loaded from: classes2.dex */
public final class bpl extends buk {
    final SSLSocketFactory a;

    public bpl(buj bujVar) {
        super(bujVar);
        this.a = Build.VERSION.SDK_INT < 19 ? new buu() : null;
    }

    @Override // defpackage.buk
    protected final boolean d() {
        return false;
    }

    public final boolean e() {
        NetworkInfo networkInfo;
        t();
        try {
            networkInfo = ((ConnectivityManager) m().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bur f() {
        return super.f();
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bvc g() {
        return super.g();
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bvk h() {
        return super.h();
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bqf i() {
        return super.i();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ blc k() {
        return super.k();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ ady l() {
        return super.l();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpg n() {
        return super.n();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ buv o() {
        return super.o();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bqe p() {
        return super.p();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bpi q() {
        return super.q();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpq r() {
        return super.r();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bvf s() {
        return super.s();
    }
}
