package defpackage;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: aef  reason: default package */
/* loaded from: classes.dex */
public final class aef {
    private static String a;
    private static int b;

    private aef() {
    }

    public static String a() {
        BufferedReader bufferedReader;
        Throwable th;
        if (a == null) {
            int i = b;
            if (i == 0) {
                i = Process.myPid();
                b = i;
            }
            String str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            str = null;
            if (i > 0) {
                try {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("/proc/");
                    sb.append(i);
                    sb.append("/cmdline");
                    String sb2 = sb.toString();
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(sb2));
                        try {
                            String readLine = bufferedReader.readLine();
                            aat.a(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            aed.a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                aed.a(bufferedReader);
            }
            a = str;
        }
        return a;
    }
}
