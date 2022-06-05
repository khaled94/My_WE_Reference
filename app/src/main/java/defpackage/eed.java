package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: eed  reason: default package */
/* loaded from: classes2.dex */
public final class eed {
    static final Logger a = Logger.getLogger(eed.class.getName());

    private eed() {
    }

    public static edw a(een eenVar) {
        return new eei(eenVar);
    }

    public static edv a(eem eemVar) {
        return new eeh(eemVar);
    }

    public static eem a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        final eds c = c(socket);
        final OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        final eem eemVar = new eem() { // from class: eed.1
            @Override // defpackage.eem
            public final void a_(edu eduVar, long j) throws IOException {
                eep.a(eduVar.b, 0L, j);
                while (j > 0) {
                    eeo.this.f();
                    eej eejVar = eduVar.a;
                    int min = (int) Math.min(j, eejVar.c - eejVar.b);
                    outputStream.write(eejVar.a, eejVar.b, min);
                    eejVar.b += min;
                    long j2 = min;
                    j -= j2;
                    eduVar.b -= j2;
                    if (eejVar.b == eejVar.c) {
                        eduVar.a = eejVar.b();
                        eek.a(eejVar);
                    }
                }
            }

            @Override // defpackage.eem, java.io.Flushable
            public final void flush() throws IOException {
                outputStream.flush();
            }

            @Override // defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                outputStream.close();
            }

            @Override // defpackage.eem
            public final eeo a() {
                return eeo.this;
            }

            public final String toString() {
                return "sink(" + outputStream + ")";
            }
        };
        return new eem() { // from class: eds.1
            @Override // defpackage.eem
            public final void a_(edu eduVar, long j) throws IOException {
                eep.a(eduVar.b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j > 0) {
                        eej eejVar = eduVar.a;
                        while (true) {
                            if (j2 >= 65536) {
                                break;
                            }
                            j2 += eejVar.c - eejVar.b;
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                            eejVar = eejVar.f;
                        }
                        c.A_();
                        try {
                            try {
                                eemVar.a_(eduVar, j2);
                                j -= j2;
                                c.a(true);
                            } catch (IOException e) {
                                throw c.b(e);
                            }
                        } catch (Throwable th) {
                            c.a(false);
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // defpackage.eem, java.io.Flushable
            public final void flush() throws IOException {
                c.A_();
                try {
                    try {
                        eemVar.flush();
                        c.a(true);
                    } catch (IOException e) {
                        throw c.b(e);
                    }
                } catch (Throwable th) {
                    c.a(false);
                    throw th;
                }
            }

            @Override // defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                c.A_();
                try {
                    try {
                        eemVar.close();
                        c.a(true);
                    } catch (IOException e) {
                        throw c.b(e);
                    }
                } catch (Throwable th) {
                    c.a(false);
                    throw th;
                }
            }

            @Override // defpackage.eem
            public final eeo a() {
                return c;
            }

            public final String toString() {
                return "AsyncTimeout.sink(" + eemVar + ")";
            }
        };
    }

    public static een a(InputStream inputStream) {
        return a(inputStream, new eeo());
    }

    private static een a(final InputStream inputStream, final eeo eeoVar) {
        if (inputStream != null) {
            if (eeoVar == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new een() { // from class: eed.2
                @Override // defpackage.een
                public final long a(edu eduVar, long j) throws IOException {
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i >= 0) {
                        if (i == 0) {
                            return 0L;
                        }
                        try {
                            eeo.this.f();
                            eej e = eduVar.e(1);
                            int read = inputStream.read(e.a, e.c, (int) Math.min(j, 8192 - e.c));
                            if (read == -1) {
                                return -1L;
                            }
                            e.c += read;
                            long j2 = read;
                            eduVar.b += j2;
                            return j2;
                        } catch (AssertionError e2) {
                            if (!eed.a(e2)) {
                                throw e2;
                            }
                            throw new IOException(e2);
                        }
                    }
                    throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                }

                @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    inputStream.close();
                }

                @Override // defpackage.een
                public final eeo a() {
                    return eeo.this;
                }

                public final String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }

    public static een a(File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileInputStream(file));
    }

    public static een b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        final eds c = c(socket);
        final een a2 = a(socket.getInputStream(), c);
        return new een() { // from class: eds.2
            @Override // defpackage.een
            public final long a(edu eduVar, long j) throws IOException {
                c.A_();
                try {
                    try {
                        long a3 = a2.a(eduVar, j);
                        c.a(true);
                        return a3;
                    } catch (IOException e) {
                        throw c.b(e);
                    }
                } catch (Throwable th) {
                    c.a(false);
                    throw th;
                }
            }

            @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                c.A_();
                try {
                    try {
                        a2.close();
                        c.a(true);
                    } catch (IOException e) {
                        throw c.b(e);
                    }
                } catch (Throwable th) {
                    c.a(false);
                    throw th;
                }
            }

            @Override // defpackage.een
            public final eeo a() {
                return c;
            }

            public final String toString() {
                return "AsyncTimeout.source(" + a2 + ")";
            }
        };
    }

    private static eds c(final Socket socket) {
        return new eds() { // from class: eed.3
            @Override // defpackage.eds
            protected final IOException a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // defpackage.eds
            protected final void a() {
                try {
                    socket.close();
                } catch (AssertionError e) {
                    if (eed.a(e)) {
                        Logger logger = eed.a;
                        Level level = Level.WARNING;
                        logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e);
                        return;
                    }
                    throw e;
                } catch (Exception e2) {
                    Logger logger2 = eed.a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e2);
                }
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
