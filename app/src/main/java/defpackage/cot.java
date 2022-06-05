package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationRequestCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cot  reason: default package */
/* loaded from: classes2.dex */
public final class cot {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static cmy a(Context context, String str) {
        cmy cmyVar = new cmy(cmx.a(), System.currentTimeMillis());
        cmy a = a(context, str, cmyVar, true);
        if (a == null || a.equals(cmyVar)) {
            a(context, str, cmyVar);
            return cmyVar;
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cmy b(Context context, String str) throws cov {
        cov e;
        cmy c;
        try {
            c = c(context, str);
        } catch (cov e2) {
            e = e2;
        }
        if (c != null) {
            a(context, str, c);
            return c;
        }
        e = null;
        try {
            cmy a = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (a != null) {
                a(context, str, a, false);
                return a;
            }
        } catch (cov e3) {
            e = e3;
        }
        if (e != null) {
            throw e;
        }
        return null;
    }

    private static KeyPair a(String str, String str2) throws cov {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                throw new cov(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new cov(e2);
        }
    }

    private static cmy c(Context context, String str) throws cov {
        File d = d(context, str);
        if (!d.exists()) {
            return null;
        }
        try {
            return a(d);
        } catch (cov | IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
            }
            try {
                return a(d);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                throw new cov(e2);
            }
        }
    }

    private static cmy a(Context context, String str, cmy cmyVar, boolean z) {
        String encodeToString;
        String encodeToString2;
        Properties properties = new Properties();
        encodeToString = Base64.encodeToString(cmyVar.a.getPublic().getEncoded(), 11);
        properties.setProperty("pub", encodeToString);
        encodeToString2 = Base64.encodeToString(cmyVar.a.getPrivate().getEncoded(), 11);
        properties.setProperty("pri", encodeToString2);
        properties.setProperty("cre", String.valueOf(cmyVar.b));
        File d = d(context, str);
        try {
            d.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(d, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            channel.lock();
            if (z && channel.size() > 0) {
                try {
                    channel.position(0L);
                    cmy a = a(channel);
                    if (channel != null) {
                        a((Throwable) null, channel);
                    }
                    a((Throwable) null, randomAccessFile);
                    return a;
                } catch (cov | IOException e) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                        sb.append("Tried reading key pair before writing new one, but failed with: ");
                        sb.append(valueOf);
                    }
                }
            }
            channel.position(0L);
            properties.store(Channels.newOutputStream(channel), (String) null);
            if (channel != null) {
                a((Throwable) null, channel);
            }
            a((Throwable) null, randomAccessFile);
            return cmyVar;
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb2.append("Failed to write key: ");
            sb2.append(valueOf2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File a(Context context) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context);
        return (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) ? context.getFilesDir() : noBackupFilesDir;
    }

    private static File d(Context context, String str) {
        String sb;
        if (TextUtils.isEmpty(str)) {
            sb = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb2 = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb2.append("com.google.InstanceId_");
                sb2.append(encodeToString);
                sb2.append(".properties");
                sb = sb2.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(a(context), sb);
    }

    private static cmy a(File file) throws cov, IOException {
        try {
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.lock(0L, LocationRequestCompat.PASSIVE_INTERVAL, true);
            cmy a = a(channel);
            th = null;
            if (channel != null) {
                a(th, channel);
            }
            return a;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    private static cmy a(FileChannel fileChannel) throws cov, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new cov("Invalid properties file");
        }
        try {
            return new cmy(a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new cov(e);
        }
    }

    private static cmy a(SharedPreferences sharedPreferences, String str) throws cov {
        String string = sharedPreferences.getString(cnt.a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(cnt.a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new cmy(a(string, string2), b(sharedPreferences, str));
    }

    private static void a(Context context, String str, cmy cmyVar) {
        String encodeToString;
        String encodeToString2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (cmyVar.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (cov unused) {
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String a = cnt.a(str, "|P|");
        encodeToString = Base64.encodeToString(cmyVar.a.getPublic().getEncoded(), 11);
        edit.putString(a, encodeToString);
        String a2 = cnt.a(str, "|K|");
        encodeToString2 = Base64.encodeToString(cmyVar.a.getPrivate().getEncoded(), 11);
        edit.putString(a2, encodeToString2);
        edit.putString(cnt.a(str, "cre"), String.valueOf(cmyVar.b));
        edit.commit();
    }

    private static long b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(cnt.a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    private static /* synthetic */ void a(Throwable th, FileChannel fileChannel) {
        if (th == null) {
            fileChannel.close();
            return;
        }
        try {
            fileChannel.close();
        } catch (Throwable th2) {
            amp.a(th, th2);
        }
    }

    private static /* synthetic */ void a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th == null) {
            randomAccessFile.close();
            return;
        }
        try {
            randomAccessFile.close();
        } catch (Throwable th2) {
            amp.a(th, th2);
        }
    }

    private static /* synthetic */ void a(Throwable th, FileInputStream fileInputStream) {
        if (th == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th2) {
            amp.a(th, th2);
        }
    }
}
