package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kv  reason: default package */
/* loaded from: classes2.dex */
public final class kv {
    private static final AtomicReference<byte[]> a = new AtomicReference<>();

    private kv() {
    }

    public static ByteBuffer a(File file) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return load;
            } catch (Throwable th2) {
                th = th2;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static void a(ByteBuffer byteBuffer, File file) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        c(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static InputStream b(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    public static ByteBuffer a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: kv$b */
    /* loaded from: classes2.dex */
    static final class b {
        final int a;
        final int b;
        final byte[] c;

        b(byte[] bArr, int i, int i2) {
            this.c = bArr;
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: kv$a */
    /* loaded from: classes2.dex */
    static class a extends InputStream {
        private final ByteBuffer a;
        private int b = -1;

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.a.remaining();
        }

        @Override // java.io.InputStream
        public final int read() {
            if (!this.a.hasRemaining()) {
                return -1;
            }
            return this.a.get() & 255;
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i) {
            this.b = this.a.position();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            if (!this.a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.a.get(bArr, i, min);
            return min;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            if (this.b == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.a.position(this.b);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            if (!this.a.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j, available());
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position((int) (byteBuffer.position() + min));
            return min;
        }
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        b bVar = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.b == bVar.c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        c(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }
}
