package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: cpf  reason: default package */
/* loaded from: classes2.dex */
final class cpf implements Closeable {
    bwl<Bitmap> a;
    private final URL b;
    private volatile InputStream c;

    public static cpf a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new cpf(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Not downloading image, bad URL: ".concat(valueOf);
            } else {
                new String("Not downloading image, bad URL: ");
            }
            return null;
        }
    }

    private cpf(URL url) {
        this.b = url;
    }

    public final Bitmap a() throws IOException {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        try {
            InputStream inputStream = this.b.openConnection().getInputStream();
            InputStream a = aml.a(inputStream);
            this.c = inputStream;
            Bitmap decodeStream = BitmapFactory.decodeStream(a);
            if (decodeStream == null) {
                String valueOf2 = String.valueOf(this.b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb2.append("Failed to decode image: ");
                sb2.append(valueOf2);
                throw new IOException(sb2.toString());
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf3 = String.valueOf(this.b);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 31);
                sb3.append("Successfully downloaded image: ");
                sb3.append(valueOf3);
            }
            a(null, a);
            if (inputStream != null) {
                a(null, inputStream);
            }
            return decodeStream;
        } catch (IOException e) {
            String valueOf4 = String.valueOf(this.b);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 26);
            sb4.append("Failed to download image: ");
            sb4.append(valueOf4);
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        amm.a(this.c);
    }

    private static /* synthetic */ void a(Throwable th, InputStream inputStream) {
        if (th == null) {
            inputStream.close();
            return;
        }
        try {
            inputStream.close();
        } catch (Throwable th2) {
            amp.a(th, th2);
        }
    }
}
