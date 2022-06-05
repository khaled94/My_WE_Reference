package defpackage;

import android.util.Log;
import defpackage.bx;
import defpackage.ex;
import defpackage.ez;
import java.io.File;
import java.io.IOException;

/* renamed from: fb  reason: default package */
/* loaded from: classes2.dex */
public final class fb implements ex {
    private final File b;
    private final long c;
    private bx e;
    private final ez d = new ez();
    private final fg a = new fg();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public fb(File file, long j) {
        this.b = file;
        this.c = j;
    }

    private synchronized bx a() throws IOException {
        if (this.e == null) {
            this.e = bx.a(this.b, this.c);
        }
        return this.e;
    }

    @Override // defpackage.ex
    public final File a(ck ckVar) {
        String a = this.a.a(ckVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder("Get: Obtained: ");
            sb.append(a);
            sb.append(" for for Key: ");
            sb.append(ckVar);
        }
        try {
            bx.d a2 = a().a(a);
            if (a2 == null) {
                return null;
            }
            return a2.a[0];
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.ex
    public final void a(ck ckVar, ex.b bVar) {
        ez.a aVar;
        String a = this.a.a(ckVar);
        ez ezVar = this.d;
        synchronized (ezVar) {
            aVar = ezVar.a.get(a);
            if (aVar == null) {
                aVar = ezVar.b.a();
                ezVar.a.put(a, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder("Put: Obtained: ");
                sb.append(a);
                sb.append(" for for Key: ");
                sb.append(ckVar);
            }
            try {
                bx a2 = a();
                if (a2.a(a) == null) {
                    bx.b b = a2.b(a);
                    if (b == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(String.valueOf(a)));
                    }
                    try {
                        if (bVar.a(b.a())) {
                            bx.this.a(b, true);
                            b.c = true;
                        }
                        b.c();
                    } catch (Throwable th) {
                        b.c();
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
        } finally {
            this.d.a(a);
        }
    }
}
