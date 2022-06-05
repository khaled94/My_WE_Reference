package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* renamed from: fp  reason: default package */
/* loaded from: classes2.dex */
public class fp implements ck {
    public final fq b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public fp(URL url) {
        this(url, fq.b);
    }

    public fp(String str) {
        this(str, fq.b);
    }

    private fp(URL url, fq fqVar) {
        this.c = (URL) lf.a(url, "Argument must not be null");
        this.d = null;
        this.b = (fq) lf.a(fqVar, "Argument must not be null");
    }

    private fp(String str, fq fqVar) {
        this.c = null;
        this.d = lf.a(str);
        this.b = (fq) lf.a(fqVar, "Argument must not be null");
    }

    private String a() {
        String str = this.d;
        return str != null ? str : ((URL) lf.a(this.c, "Argument must not be null")).toString();
    }

    public String toString() {
        return a();
    }

    @Override // defpackage.ck
    public boolean equals(Object obj) {
        if (obj instanceof fp) {
            fp fpVar = (fp) obj;
            if (a().equals(fpVar.a()) && this.b.equals(fpVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ck
    public int hashCode() {
        if (this.h == 0) {
            int hashCode = a().hashCode();
            this.h = hashCode;
            this.h = (hashCode * 31) + this.b.hashCode();
        }
        return this.h;
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = a().getBytes(a);
        }
        messageDigest.update(this.g);
    }
}
