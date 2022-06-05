package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import defpackage.ak;
import defpackage.au;
import defpackage.ax;
import java.util.Collections;
import java.util.Map;

/* renamed from: as  reason: default package */
/* loaded from: classes.dex */
public abstract class as<T> implements Comparable<as<T>> {
    public final int a;
    public final String b;
    final int c;
    final Object d;
    au.a e;
    Integer f;
    at g;
    public boolean h;
    public boolean i;
    public aw j;
    public ak.a k;
    public Object l;
    private final ax.a m;
    private boolean n;
    private boolean o;
    private a p;

    /* renamed from: as$a */
    /* loaded from: classes.dex */
    interface a {
        void a(as<?> asVar);

        void a(as<?> asVar, au<?> auVar);
    }

    /* renamed from: as$b */
    /* loaded from: classes.dex */
    public enum b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static VolleyError a(VolleyError volleyError) {
        return volleyError;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract au<T> a(ar arVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(T t);

    @Deprecated
    public byte[] e() throws AuthFailureError {
        return null;
    }

    public String f() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public byte[] g() throws AuthFailureError {
        return null;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        as asVar = (as) obj;
        b bVar = b.NORMAL;
        b bVar2 = b.NORMAL;
        if (bVar == bVar2) {
            return this.f.intValue() - asVar.f.intValue();
        }
        return bVar2.ordinal() - bVar.ordinal();
    }

    public as(int i, String str, au.a aVar) {
        Uri parse;
        String host;
        this.m = ax.a.a ? new ax.a() : null;
        this.d = new Object();
        this.h = true;
        int i2 = 0;
        this.n = false;
        this.o = false;
        this.i = false;
        this.k = null;
        this.a = i;
        this.b = str;
        this.e = aVar;
        this.j = new am();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.c = i2;
    }

    public final void a(String str) {
        if (ax.a.a) {
            this.m.a(str, Thread.currentThread().getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(final String str) {
        at atVar = this.g;
        if (atVar != null) {
            atVar.b(this);
        }
        if (ax.a.a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: as.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        as.this.m.a(str, id);
                        as.this.m.a(toString());
                    }
                });
                return;
            }
            this.m.a(str, id);
            this.m.a(toString());
        }
    }

    public void a() {
        synchronized (this.d) {
            this.n = true;
            this.e = null;
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.d) {
            z = this.n;
        }
        return z;
    }

    public Map<String, String> c() throws AuthFailureError {
        return Collections.emptyMap();
    }

    @Deprecated
    public String d() {
        return f();
    }

    public final int h() {
        return this.j.a();
    }

    public final void i() {
        synchronized (this.d) {
            this.o = true;
        }
    }

    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = this.o;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(a aVar) {
        synchronized (this.d) {
            this.p = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(au<?> auVar) {
        a aVar;
        synchronized (this.d) {
            aVar = this.p;
        }
        if (aVar != null) {
            aVar.a(this, auVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        a aVar;
        synchronized (this.d) {
            aVar = this.p;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(this.c);
        StringBuilder sb = new StringBuilder();
        sb.append(this.n ? "[X] " : "[ ] ");
        sb.append(this.b);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(b.NORMAL);
        sb.append(" ");
        sb.append(this.f);
        return sb.toString();
    }
}
