package defpackage;

import androidx.core.util.Pools;
import defpackage.lh;
import defpackage.lj;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: fg  reason: default package */
/* loaded from: classes2.dex */
public final class fg {
    private final lc<ck, String> a = new lc<>(1000);
    private final Pools.Pool<a> b = lh.a(10, new lh.a<a>() { // from class: fg.1
        @Override // defpackage.lh.a
        public final /* synthetic */ a a() {
            return b();
        }

        private static a b() {
            try {
                return new a(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    });

    public final String a(ck ckVar) {
        String b;
        synchronized (this.a) {
            b = this.a.b(ckVar);
        }
        if (b == null) {
            b = b(ckVar);
        }
        synchronized (this.a) {
            this.a.b(ckVar, b);
        }
        return b;
    }

    private String b(ck ckVar) {
        a aVar = (a) lf.a(this.b.acquire(), "Argument must not be null");
        try {
            ckVar.a(aVar.a);
            return lg.a(aVar.a.digest());
        } finally {
            this.b.release(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fg$a */
    /* loaded from: classes2.dex */
    public static final class a implements lh.c {
        final MessageDigest a;
        private final lj b = new lj.a();

        a(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // defpackage.lh.c
        public final lj a_() {
            return this.b;
        }
    }
}
