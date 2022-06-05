package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: dji  reason: default package */
/* loaded from: classes2.dex */
public final class dji {
    public static boolean a() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean a(String[] strArr) {
        BufferedReader bufferedReader;
        Throwable th;
        boolean z = false;
        Process process = null;
        try {
            Process exec = Runtime.getRuntime().exec(strArr);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                try {
                    if (bufferedReader.readLine() != null) {
                        z = true;
                    }
                    if (exec != null) {
                        exec.destroy();
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.getMessage();
                        e.printStackTrace();
                    }
                    return z;
                } catch (Exception unused) {
                    process = exec;
                    if (process != null) {
                        process.destroy();
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.getMessage();
                            e2.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    process = exec;
                    if (process != null) {
                        process.destroy();
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e3.getMessage();
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Exception unused3) {
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }
}
