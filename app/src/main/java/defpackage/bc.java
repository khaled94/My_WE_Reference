package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.ak;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bc  reason: default package */
/* loaded from: classes2.dex */
public final class bc implements ak {
    private final Map<String, a> a;
    private long b;
    private final File c;
    private final int d;

    private bc(File file) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = file;
        this.d = 5242880;
    }

    public bc(File file, byte b2) {
        this(file);
    }

    @Override // defpackage.ak
    public final synchronized ak.a a(String str) {
        a aVar = this.a.get(str);
        if (aVar == null) {
            return null;
        }
        File d = d(str);
        try {
            b bVar = new b(new BufferedInputStream(a(d)), d.length());
            try {
                a a2 = a.a(bVar);
                if (!TextUtils.equals(str, a2.b)) {
                    ax.b("%s: key=%s, found=%s", d.getAbsolutePath(), str, a2.b);
                    e(str);
                    return null;
                }
                byte[] a3 = a(bVar, bVar.a());
                ak.a aVar2 = new ak.a();
                aVar2.a = a3;
                aVar2.b = aVar.c;
                aVar2.c = aVar.d;
                aVar2.d = aVar.e;
                aVar2.e = aVar.f;
                aVar2.f = aVar.g;
                aVar2.g = be.a(aVar.h);
                aVar2.h = Collections.unmodifiableList(aVar.h);
                return aVar2;
            } finally {
                bVar.close();
            }
        } catch (IOException e) {
            ax.b("%s: %s", d.getAbsolutePath(), e.toString());
            b(str);
            return null;
        }
    }

    @Override // defpackage.ak
    public final synchronized void a() {
        long length;
        b bVar;
        if (!this.c.exists()) {
            if (!this.c.mkdirs()) {
                ax.c("Unable to create cache dir %s", this.c.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.c.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                bVar = new b(new BufferedInputStream(a(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                a a2 = a.a(bVar);
                a2.a = length;
                a(a2.b, a2);
                bVar.close();
            } catch (Throwable th) {
                bVar.close();
                throw th;
                break;
            }
        }
    }

    @Override // defpackage.ak
    public final synchronized void a(String str, ak.a aVar) {
        long j;
        Iterator<Map.Entry<String, a>> it;
        long length = aVar.a.length;
        if (this.b + length >= this.d) {
            if (ax.b) {
                ax.a("Pruning old cache entries.", new Object[0]);
            }
            long j2 = this.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, a>> it2 = this.a.entrySet().iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    j = j2;
                    break;
                }
                a value = it2.next().getValue();
                if (d(value.b).delete()) {
                    j = j2;
                    it = it2;
                    this.b -= value.a;
                } else {
                    j = j2;
                    it = it2;
                    ax.b("Could not delete cache entry for key=%s, filename=%s", value.b, c(value.b));
                }
                it.remove();
                i++;
                if (((float) (this.b + length)) < this.d * 0.9f) {
                    break;
                }
                j2 = j;
                it2 = it;
            }
            if (ax.b) {
                ax.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
        File d = d(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
            a aVar2 = new a(str, aVar);
            if (!aVar2.a(bufferedOutputStream)) {
                bufferedOutputStream.close();
                ax.b("Failed to write header for %s", d.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.a);
            bufferedOutputStream.close();
            a(str, aVar2);
        } catch (IOException unused) {
            if (d.delete()) {
                return;
            }
            ax.b("Could not clean up file %s", d.getAbsolutePath());
        }
    }

    private synchronized void b(String str) {
        boolean delete = d(str).delete();
        e(str);
        if (!delete) {
            ax.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
        }
    }

    private static String c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    private File d(String str) {
        return new File(this.c, c(str));
    }

    private void a(String str, a aVar) {
        if (!this.a.containsKey(str)) {
            this.b += aVar.a;
        } else {
            this.b += aVar.a - this.a.get(str).a;
        }
        this.a.put(str, aVar);
    }

    private void e(String str) {
        a remove = this.a.remove(str);
        if (remove != null) {
            this.b -= remove.a;
        }
    }

    private static byte[] a(b bVar, long j) throws IOException {
        long a2 = bVar.a();
        if (j >= 0 && j <= a2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + a2);
    }

    private static InputStream a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc$a */
    /* loaded from: classes2.dex */
    public static class a {
        long a;
        final String b;
        final String c;
        final long d;
        final long e;
        final long f;
        final long g;
        final List<ao> h;

        private a(String str, String str2, long j, long j2, long j3, long j4, List<ao> list) {
            this.b = str;
            this.c = "".equals(str2) ? null : str2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        a(java.lang.String r13, defpackage.ak.a r14) {
            /*
                r12 = this;
                java.lang.String r2 = r14.b
                long r3 = r14.c
                long r5 = r14.d
                long r7 = r14.e
                long r9 = r14.f
                java.util.List<ao> r0 = r14.h
                if (r0 == 0) goto L11
                java.util.List<ao> r0 = r14.h
                goto L17
            L11:
                java.util.Map<java.lang.String, java.lang.String> r0 = r14.g
                java.util.List r0 = defpackage.be.a(r0)
            L17:
                r11 = r0
                r0 = r12
                r1 = r13
                r0.<init>(r1, r2, r3, r5, r7, r9, r11)
                byte[] r13 = r14.a
                int r13 = r13.length
                long r13 = (long) r13
                r12.a = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.a.<init>(java.lang.String, ak$a):void");
        }

        static a a(b bVar) throws IOException {
            if (bc.a((InputStream) bVar) != 538247942) {
                throw new IOException();
            }
            return new a(bc.a(bVar), bc.a(bVar), bc.b((InputStream) bVar), bc.b((InputStream) bVar), bc.b((InputStream) bVar), bc.b((InputStream) bVar), bc.b(bVar));
        }

        final boolean a(OutputStream outputStream) {
            try {
                bc.a(outputStream, 538247942);
                bc.a(outputStream, this.b);
                bc.a(outputStream, this.c == null ? "" : this.c);
                bc.a(outputStream, this.d);
                bc.a(outputStream, this.e);
                bc.a(outputStream, this.f);
                bc.a(outputStream, this.g);
                List<ao> list = this.h;
                if (list != null) {
                    bc.a(outputStream, list.size());
                    for (ao aoVar : list) {
                        bc.a(outputStream, aoVar.a);
                        bc.a(outputStream, aoVar.b);
                    }
                } else {
                    bc.a(outputStream, 0);
                }
                outputStream.flush();
                return true;
            } catch (IOException e) {
                ax.b("%s", e.toString());
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc$b */
    /* loaded from: classes2.dex */
    public static class b extends FilterInputStream {
        private final long a;
        private long b;

        b(InputStream inputStream, long j) {
            super(inputStream);
            this.a = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.b++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.b += read;
            }
            return read;
        }

        final long a() {
            return this.a - this.b;
        }
    }

    private static int c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static int a(InputStream inputStream) throws IOException {
        return (c(inputStream) << 24) | (c(inputStream) << 0) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16);
    }

    static void a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static long b(InputStream inputStream) throws IOException {
        return ((c(inputStream) & 255) << 0) | 0 | ((c(inputStream) & 255) << 8) | ((c(inputStream) & 255) << 16) | ((c(inputStream) & 255) << 24) | ((c(inputStream) & 255) << 32) | ((c(inputStream) & 255) << 40) | ((c(inputStream) & 255) << 48) | ((255 & c(inputStream)) << 56);
    }

    static void a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String a(b bVar) throws IOException {
        return new String(a(bVar, b((InputStream) bVar)), "UTF-8");
    }

    static List<ao> b(b bVar) throws IOException {
        int a2 = a((InputStream) bVar);
        List<ao> emptyList = a2 == 0 ? Collections.emptyList() : new ArrayList<>(a2);
        for (int i = 0; i < a2; i++) {
            emptyList.add(new ao(a(bVar).intern(), a(bVar).intern()));
        }
        return emptyList;
    }
}
