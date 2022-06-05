package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: gc  reason: default package */
/* loaded from: classes2.dex */
public final class gc implements ci<InputStream> {
    private final ek a;

    @Override // defpackage.ci
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, File file, cm cmVar) {
        return a(inputStream, file);
    }

    public gc(ek ekVar) {
        this.a = ekVar;
    }

    private boolean a(InputStream inputStream, File file) {
        Throwable th;
        byte[] bArr = (byte[]) this.a.a(65536, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        this.a.a((ek) bArr);
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.a.a((ek) bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                z = true;
                fileOutputStream2.close();
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
        } catch (Throwable th3) {
            th = th3;
        }
        this.a.a((ek) bArr);
        return z;
    }
}
