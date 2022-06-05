package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bx  reason: default package */
/* loaded from: classes2.dex */
public final class bx implements Closeable {
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private long g;
    private Writer j;
    private int l;
    private long i = 0;
    private final LinkedHashMap<String, c> k = new LinkedHashMap<>(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a((byte) 0));
    private final Callable<Void> n = new Callable<Void>() { // from class: bx.1
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (bx.this) {
                if (bx.this.j == null) {
                    return null;
                }
                bx.this.f();
                if (bx.this.d()) {
                    bx.this.c();
                    bx.this.l = 0;
                }
                return null;
            }
        }
    };
    private final int f = 1;
    private final int h = 1;

    private bx(File file, long j) {
        this.b = file;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
        this.g = j;
    }

    public static bx a(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                a(file2, file3, false);
            }
        }
        bx bxVar = new bx(file, j);
        if (bxVar.c.exists()) {
            try {
                bxVar.a();
                bxVar.b();
                return bxVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                bxVar.close();
                bz.a(bxVar.b);
            }
        }
        file.mkdirs();
        bx bxVar2 = new bx(file, j);
        bxVar2.c();
        return bxVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(r5)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.a():void");
    }

    private void b() throws IOException {
        a(this.d);
        Iterator<c> it = this.k.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.h) {
                    this.i += next.b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.h) {
                    a(next.c[i]);
                    a(next.d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() throws IOException {
        if (this.j != null) {
            a(this.j);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), bz.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.h));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (c cVar : this.k.values()) {
            if (cVar.f != null) {
                bufferedWriter.write("DIRTY " + cVar.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + cVar.a + cVar.a() + '\n');
            }
        }
        a(bufferedWriter);
        if (this.c.exists()) {
            a(this.c, this.e, true);
        }
        a(this.d, this.c, false);
        this.e.delete();
        this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), bz.a));
    }

    private static void a(File file) throws IOException {
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException();
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    public final synchronized d a(String str) throws IOException {
        e();
        c cVar = this.k.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.e) {
            return null;
        }
        for (File file : cVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.l++;
        this.j.append((CharSequence) "READ");
        this.j.append(' ');
        this.j.append((CharSequence) str);
        this.j.append('\n');
        if (d()) {
            this.a.submit(this.n);
        }
        return new d(this, str, cVar.g, cVar.c, cVar.b, (byte) 0);
    }

    public final synchronized b b(String str) throws IOException {
        e();
        c cVar = this.k.get(str);
        if (cVar == null) {
            cVar = new c(this, str, (byte) 0);
            this.k.put(str, cVar);
        } else if (cVar.f != null) {
            return null;
        }
        b bVar = new b(this, cVar, (byte) 0);
        cVar.f = bVar;
        this.j.append((CharSequence) "DIRTY");
        this.j.append(' ');
        this.j.append((CharSequence) str);
        this.j.append('\n');
        b(this.j);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }

    private synchronized boolean c(String str) throws IOException {
        e();
        c cVar = this.k.get(str);
        if (cVar != null && cVar.f == null) {
            for (int i = 0; i < this.h; i++) {
                File file = cVar.c[i];
                if (file.exists() && !file.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(file)));
                }
                this.i -= cVar.b[i];
                cVar.b[i] = 0;
            }
            this.l++;
            this.j.append((CharSequence) "REMOVE");
            this.j.append(' ');
            this.j.append((CharSequence) str);
            this.j.append('\n');
            this.k.remove(str);
            if (d()) {
                this.a.submit(this.n);
            }
            return true;
        }
        return false;
    }

    private void e() {
        if (this.j != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.j == null) {
            return;
        }
        Iterator it = new ArrayList(this.k.values()).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f != null) {
                cVar.f.b();
            }
        }
        f();
        a(this.j);
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws IOException {
        while (this.i > this.g) {
            c(this.k.entrySet().iterator().next().getKey());
        }
    }

    private static void a(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void b(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: bx$d */
    /* loaded from: classes2.dex */
    public final class d {
        public final File[] a;
        private final String c;
        private final long d;
        private final long[] e;

        /* synthetic */ d(bx bxVar, String str, long j, File[] fileArr, long[] jArr, byte b) {
            this(str, j, fileArr, jArr);
        }

        private d(String str, long j, File[] fileArr, long[] jArr) {
            this.c = str;
            this.d = j;
            this.a = fileArr;
            this.e = jArr;
        }
    }

    /* renamed from: bx$b */
    /* loaded from: classes2.dex */
    public final class b {
        final c a;
        final boolean[] b;
        public boolean c;

        /* synthetic */ b(bx bxVar, c cVar, byte b) {
            this(cVar);
        }

        private b(c cVar) {
            this.a = cVar;
            this.b = cVar.e ? null : new boolean[bx.this.h];
        }

        public final File a() throws IOException {
            File file;
            synchronized (bx.this) {
                if (this.a.f != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.e) {
                    this.b[0] = true;
                }
                file = this.a.d[0];
                bx.this.b.mkdirs();
            }
            return file;
        }

        public final void b() throws IOException {
            bx.this.a(this, false);
        }

        public final void c() {
            if (!this.c) {
                try {
                    b();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bx$c */
    /* loaded from: classes2.dex */
    public final class c {
        final String a;
        final long[] b;
        File[] c;
        File[] d;
        boolean e;
        b f;
        long g;

        /* synthetic */ c(bx bxVar, String str, byte b) {
            this(str);
        }

        private c(String str) {
            this.a = str;
            this.b = new long[bx.this.h];
            this.c = new File[bx.this.h];
            this.d = new File[bx.this.h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < bx.this.h; i++) {
                sb.append(i);
                this.c[i] = new File(bx.this.b, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(bx.this.b, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        final void a(String[] strArr) throws IOException {
            if (strArr.length != bx.this.h) {
                throw b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw b(strArr);
                }
            }
        }

        private static IOException b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
    }

    /* renamed from: bx$a */
    /* loaded from: classes2.dex */
    static final class a implements ThreadFactory {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(b bVar, boolean z) throws IOException {
        c cVar = bVar.a;
        if (cVar.f != bVar) {
            throw new IllegalStateException();
        }
        if (z && !cVar.e) {
            for (int i = 0; i < this.h; i++) {
                if (!bVar.b[i]) {
                    bVar.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                } else if (!cVar.d[i].exists()) {
                    bVar.b();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.h; i2++) {
            File file = cVar.d[i2];
            if (z) {
                if (file.exists()) {
                    File file2 = cVar.c[i2];
                    file.renameTo(file2);
                    long j = cVar.b[i2];
                    long length = file2.length();
                    cVar.b[i2] = length;
                    this.i = (this.i - j) + length;
                }
            } else {
                a(file);
            }
        }
        this.l++;
        cVar.f = null;
        if (!(cVar.e | z)) {
            this.k.remove(cVar.a);
            this.j.append((CharSequence) "REMOVE");
            this.j.append(' ');
            this.j.append((CharSequence) cVar.a);
            this.j.append('\n');
        } else {
            cVar.e = true;
            this.j.append((CharSequence) "CLEAN");
            this.j.append(' ');
            this.j.append((CharSequence) cVar.a);
            this.j.append((CharSequence) cVar.a());
            this.j.append('\n');
            if (z) {
                long j2 = this.m;
                this.m = 1 + j2;
                cVar.g = j2;
            }
        }
        b(this.j);
        if (this.i > this.g || d()) {
            this.a.submit(this.n);
        }
    }
}
