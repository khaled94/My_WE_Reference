package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: sy  reason: default package */
/* loaded from: classes2.dex */
public final class sy extends Thread {
    private final /* synthetic */ Map a;

    public sy(Map map) {
        this.a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String message;
        StringBuilder sb;
        String str;
        Exception e;
        new ta();
        Map map = this.a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, (String) map.get(str2));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(uri);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e2) {
            e = e2;
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
        } catch (IndexOutOfBoundsException e3) {
            message = e3.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message).length());
            str = "Error while parsing ping URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
        } catch (RuntimeException e4) {
            e = e4;
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
        }
    }
}
