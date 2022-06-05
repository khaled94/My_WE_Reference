package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import defpackage.apv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: buj  reason: default package */
/* loaded from: classes2.dex */
public class buj implements brk {
    private static volatile buj f;
    bsr a;
    final bql b;
    List<Runnable> c;
    int d;
    int e;
    private bqf g;
    private bpl h;
    private bvk i;
    private bpo j;
    private buf k;
    private bvc l;
    private final bur m;
    private boolean n;
    private boolean o;
    private boolean p;
    private long q;
    private boolean r;
    private boolean s;
    private boolean t;
    private FileLock u;
    private FileChannel v;
    private List<Long> w;
    private List<Long> x;
    private long y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: buj$a */
    /* loaded from: classes2.dex */
    public class a implements bvm {
        apv.g a;
        List<Long> b;
        List<apv.c> c;
        private long d;

        private a() {
        }

        @Override // defpackage.bvm
        public final void a(apv.g gVar) {
            aat.a(gVar);
            this.a = gVar;
        }

        @Override // defpackage.bvm
        public final boolean a(long j, apv.c cVar) {
            aat.a(cVar);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() <= 0 || a(this.c.get(0)) == a(cVar)) {
                long o = this.d + cVar.o();
                if (o >= Math.max(0, blk.l.a(null).intValue())) {
                    return false;
                }
                this.d = o;
                this.c.add(cVar);
                this.b.add(Long.valueOf(j));
                return this.c.size() < Math.max(1, blk.m.a(null).intValue());
            }
            return false;
        }

        /* synthetic */ a(buj bujVar, byte b) {
            this();
        }

        private static long a(apv.c cVar) {
            return ((cVar.zzwl / 1000) / 60) / 60;
        }
    }

    public static buj a(Context context) {
        aat.a(context);
        aat.a(context.getApplicationContext());
        if (f == null) {
            synchronized (buj.class) {
                if (f == null) {
                    f = new buj(new bup(context));
                }
            }
        }
        return f;
    }

    private buj(bup bupVar) {
        this(bupVar, (byte) 0);
    }

    private buj(bup bupVar, byte b) {
        this.n = false;
        aat.a(bupVar);
        this.b = bql.a(bupVar.a, (baz) null);
        this.y = -1L;
        bur burVar = new bur(this);
        burVar.u();
        this.m = burVar;
        bpl bplVar = new bpl(this);
        bplVar.u();
        this.h = bplVar;
        bqf bqfVar = new bqf(this);
        bqfVar.u();
        this.g = bqfVar;
        this.b.p().a(new bum(this, bupVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        this.b.p().c();
        d().A();
        if (this.b.b().d.a() == 0) {
            this.b.b().d.a(this.b.l().a());
        }
        j();
    }

    @Override // defpackage.brk
    public final bpi q() {
        return this.b.q();
    }

    @Override // defpackage.brk
    public final bqe p() {
        return this.b.p();
    }

    public final bqf b() {
        a(this.g);
        return this.g;
    }

    public final bpl c() {
        a(this.h);
        return this.h;
    }

    public final bvk d() {
        a(this.i);
        return this.i;
    }

    private final bpo n() {
        bpo bpoVar = this.j;
        if (bpoVar != null) {
            return bpoVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final buf o() {
        a(this.k);
        return this.k;
    }

    public final bvc e() {
        a(this.l);
        return this.l;
    }

    public final bur f() {
        a(this.m);
        return this.m;
    }

    @Override // defpackage.brk
    public final Context m() {
        return this.b.m();
    }

    @Override // defpackage.brk
    public final ady l() {
        return this.b.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.b.p().c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (this.n) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(buk bukVar) {
        if (bukVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (bukVar.j()) {
            return;
        }
        String valueOf = String.valueOf(bukVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private final long r() {
        long a2 = this.b.l().a();
        bpq b = this.b.b();
        b.w();
        b.c();
        long a3 = b.h.a();
        if (a3 == 0) {
            a3 = 1 + b.o().g().nextInt(86400000);
            b.h.a(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bli bliVar, String str) {
        bqb b = d().b(str);
        if (b == null || TextUtils.isEmpty(b.i())) {
            this.b.q().j.a("No app data available; dropping event", str);
            return;
        }
        Boolean b2 = b(b);
        if (b2 == null) {
            if (!"_ui".equals(bliVar.a)) {
                this.b.q().f.a("Could not find package. appId", bpi.a(str));
            }
        } else if (!b2.booleanValue()) {
            this.b.q().c.a("App version does not match; dropping event. appId", bpi.a(str));
            return;
        }
        a(bliVar, new bva(str, b.c(), b.i(), b.j(), b.k(), b.l(), b.m(), (String) null, b.o(), false, b.f(), b.u(), 0L, 0, b.v(), b.w(), false, b.d(), b.x(), b.n(), b.y()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bli bliVar, bva bvaVar) {
        List<bvd> list;
        List<bvd> list2;
        List<bvd> list3;
        bli bliVar2 = bliVar;
        aat.a(bvaVar);
        aat.a(bvaVar.a);
        g();
        h();
        String str = bvaVar.a;
        long j = bliVar2.d;
        f();
        if (!bur.a(bliVar, bvaVar)) {
            return;
        }
        if (!bvaVar.h) {
            c(bvaVar);
            return;
        }
        if (this.b.e.d(str, blk.au) && bvaVar.u != null) {
            if (bvaVar.u.contains(bliVar2.a)) {
                Bundle a2 = bliVar2.b.a();
                a2.putLong("ga_safelisted", 1L);
                bliVar2 = new bli(bliVar2.a, new blh(a2), bliVar2.c, bliVar2.d);
            } else {
                this.b.q().j.a("Dropping non-safelisted event. appId, event name, origin", str, bliVar2.a, bliVar2.c);
                return;
            }
        }
        d().e();
        try {
            bvk d = d();
            aat.a(str);
            d.c();
            d.t();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                d.q().f.a("Invalid time querying timed out conditional properties", bpi.a(str), Long.valueOf(j));
                list = Collections.emptyList();
            } else {
                list = d.a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
            }
            for (bvd bvdVar : list) {
                if (bvdVar != null) {
                    this.b.q().j.a("User property timed out", bvdVar.a, this.b.f().c(bvdVar.c.a), bvdVar.c.a());
                    if (bvdVar.g != null) {
                        b(new bli(bvdVar.g, j), bvaVar);
                    }
                    d().e(str, bvdVar.c.a);
                }
            }
            bvk d2 = d();
            aat.a(str);
            d2.c();
            d2.t();
            if (i < 0) {
                d2.q().f.a("Invalid time querying expired conditional properties", bpi.a(str), Long.valueOf(j));
                list2 = Collections.emptyList();
            } else {
                list2 = d2.a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(list2.size());
            for (bvd bvdVar2 : list2) {
                if (bvdVar2 != null) {
                    this.b.q().j.a("User property expired", bvdVar2.a, this.b.f().c(bvdVar2.c.a), bvdVar2.c.a());
                    d().b(str, bvdVar2.c.a);
                    if (bvdVar2.k != null) {
                        arrayList.add(bvdVar2.k);
                    }
                    d().e(str, bvdVar2.c.a);
                }
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                b(new bli((bli) obj, j), bvaVar);
            }
            bvk d3 = d();
            String str2 = bliVar2.a;
            aat.a(str);
            aat.a(str2);
            d3.c();
            d3.t();
            if (i < 0) {
                d3.q().f.a("Invalid time querying triggered conditional properties", bpi.a(str), d3.n().a(str2), Long.valueOf(j));
                list3 = Collections.emptyList();
            } else {
                list3 = d3.a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
            }
            ArrayList arrayList3 = new ArrayList(list3.size());
            for (bvd bvdVar3 : list3) {
                if (bvdVar3 != null) {
                    buq buqVar = bvdVar3.c;
                    bus busVar = new bus(bvdVar3.a, bvdVar3.b, buqVar.a, j, buqVar.a());
                    if (d().a(busVar)) {
                        this.b.q().j.a("User property triggered", bvdVar3.a, this.b.f().c(busVar.c), busVar.e);
                    } else {
                        this.b.q().c.a("Too many active user properties, ignoring", bpi.a(bvdVar3.a), this.b.f().c(busVar.c), busVar.e);
                    }
                    if (bvdVar3.i != null) {
                        arrayList3.add(bvdVar3.i);
                    }
                    bvdVar3.c = new buq(busVar);
                    bvdVar3.e = true;
                    d().a(bvdVar3);
                }
            }
            b(bliVar2, bvaVar);
            ArrayList arrayList4 = arrayList3;
            int size2 = arrayList4.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList4.get(i3);
                i3++;
                b(new bli((bli) obj2, j), bvaVar);
            }
            d().v();
        } finally {
            d().w();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:55|(1:57)(1:58)|59|(8:64|65|72|(1:74)|76|(0)|81|(0)(0))|66|244|67|71|65|72|(0)|76|(0)|81|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x07cb, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022c, code lost:
        r7.q().c.a("Error pruning currencies. appId", defpackage.bpi.a(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025f A[Catch: all -> 0x0880, TryCatch #0 {all -> 0x0880, blocks: (B:31:0x0101, B:34:0x0110, B:38:0x011e, B:41:0x0130, B:43:0x0147, B:48:0x0160, B:49:0x0165, B:50:0x0180, B:51:0x018a, B:53:0x0190, B:55:0x019e, B:57:0x01aa, B:58:0x01af, B:59:0x01b4, B:61:0x01bf, B:64:0x01c6, B:66:0x01f4, B:67:0x0211, B:70:0x022c, B:71:0x023b, B:72:0x0255, B:74:0x025f, B:78:0x0294, B:81:0x02a3, B:83:0x02e2, B:85:0x02e7, B:86:0x02fe, B:90:0x030f, B:92:0x0324, B:94:0x032b, B:95:0x0342, B:99:0x0365, B:103:0x038b, B:104:0x03a2, B:108:0x03b2, B:111:0x03d5, B:112:0x03f3, B:115:0x03fd, B:117:0x0409, B:119:0x0415, B:121:0x041b, B:122:0x0426, B:124:0x042e, B:126:0x043c, B:128:0x0448, B:129:0x0450, B:131:0x045c, B:132:0x0471, B:134:0x049c, B:137:0x04ac, B:140:0x04e6, B:141:0x04f6, B:142:0x0504, B:144:0x053d, B:145:0x0542, B:147:0x054a, B:148:0x054f, B:150:0x0557, B:151:0x055c, B:153:0x0565, B:154:0x056b, B:156:0x0578, B:157:0x057d, B:159:0x058a, B:161:0x0594, B:163:0x059c, B:164:0x05a2, B:166:0x05aa, B:167:0x05af, B:169:0x05b7, B:170:0x05bc, B:172:0x05cf, B:174:0x05d9, B:175:0x05dc, B:177:0x05f2, B:179:0x05f6, B:181:0x0601, B:182:0x060d, B:184:0x061f, B:186:0x0623, B:188:0x0635, B:189:0x064d, B:191:0x0653, B:192:0x0668, B:193:0x066b, B:195:0x06b3, B:197:0x06b9, B:199:0x06bf, B:200:0x06c2, B:202:0x06ce, B:203:0x0735, B:205:0x073f, B:206:0x0746, B:208:0x0750, B:209:0x0757, B:210:0x0762, B:212:0x0768, B:214:0x0799, B:215:0x07a9, B:217:0x07b1, B:218:0x07b7, B:220:0x07bd, B:224:0x07d0, B:226:0x07f8, B:230:0x080b, B:232:0x0811, B:234:0x0815, B:235:0x082b, B:237:0x083f), top: B:243:0x0101, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0294 A[Catch: all -> 0x0880, TRY_LEAVE, TryCatch #0 {all -> 0x0880, blocks: (B:31:0x0101, B:34:0x0110, B:38:0x011e, B:41:0x0130, B:43:0x0147, B:48:0x0160, B:49:0x0165, B:50:0x0180, B:51:0x018a, B:53:0x0190, B:55:0x019e, B:57:0x01aa, B:58:0x01af, B:59:0x01b4, B:61:0x01bf, B:64:0x01c6, B:66:0x01f4, B:67:0x0211, B:70:0x022c, B:71:0x023b, B:72:0x0255, B:74:0x025f, B:78:0x0294, B:81:0x02a3, B:83:0x02e2, B:85:0x02e7, B:86:0x02fe, B:90:0x030f, B:92:0x0324, B:94:0x032b, B:95:0x0342, B:99:0x0365, B:103:0x038b, B:104:0x03a2, B:108:0x03b2, B:111:0x03d5, B:112:0x03f3, B:115:0x03fd, B:117:0x0409, B:119:0x0415, B:121:0x041b, B:122:0x0426, B:124:0x042e, B:126:0x043c, B:128:0x0448, B:129:0x0450, B:131:0x045c, B:132:0x0471, B:134:0x049c, B:137:0x04ac, B:140:0x04e6, B:141:0x04f6, B:142:0x0504, B:144:0x053d, B:145:0x0542, B:147:0x054a, B:148:0x054f, B:150:0x0557, B:151:0x055c, B:153:0x0565, B:154:0x056b, B:156:0x0578, B:157:0x057d, B:159:0x058a, B:161:0x0594, B:163:0x059c, B:164:0x05a2, B:166:0x05aa, B:167:0x05af, B:169:0x05b7, B:170:0x05bc, B:172:0x05cf, B:174:0x05d9, B:175:0x05dc, B:177:0x05f2, B:179:0x05f6, B:181:0x0601, B:182:0x060d, B:184:0x061f, B:186:0x0623, B:188:0x0635, B:189:0x064d, B:191:0x0653, B:192:0x0668, B:193:0x066b, B:195:0x06b3, B:197:0x06b9, B:199:0x06bf, B:200:0x06c2, B:202:0x06ce, B:203:0x0735, B:205:0x073f, B:206:0x0746, B:208:0x0750, B:209:0x0757, B:210:0x0762, B:212:0x0768, B:214:0x0799, B:215:0x07a9, B:217:0x07b1, B:218:0x07b7, B:220:0x07bd, B:224:0x07d0, B:226:0x07f8, B:230:0x080b, B:232:0x0811, B:234:0x0815, B:235:0x082b, B:237:0x083f), top: B:243:0x0101, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e2 A[Catch: all -> 0x0880, TryCatch #0 {all -> 0x0880, blocks: (B:31:0x0101, B:34:0x0110, B:38:0x011e, B:41:0x0130, B:43:0x0147, B:48:0x0160, B:49:0x0165, B:50:0x0180, B:51:0x018a, B:53:0x0190, B:55:0x019e, B:57:0x01aa, B:58:0x01af, B:59:0x01b4, B:61:0x01bf, B:64:0x01c6, B:66:0x01f4, B:67:0x0211, B:70:0x022c, B:71:0x023b, B:72:0x0255, B:74:0x025f, B:78:0x0294, B:81:0x02a3, B:83:0x02e2, B:85:0x02e7, B:86:0x02fe, B:90:0x030f, B:92:0x0324, B:94:0x032b, B:95:0x0342, B:99:0x0365, B:103:0x038b, B:104:0x03a2, B:108:0x03b2, B:111:0x03d5, B:112:0x03f3, B:115:0x03fd, B:117:0x0409, B:119:0x0415, B:121:0x041b, B:122:0x0426, B:124:0x042e, B:126:0x043c, B:128:0x0448, B:129:0x0450, B:131:0x045c, B:132:0x0471, B:134:0x049c, B:137:0x04ac, B:140:0x04e6, B:141:0x04f6, B:142:0x0504, B:144:0x053d, B:145:0x0542, B:147:0x054a, B:148:0x054f, B:150:0x0557, B:151:0x055c, B:153:0x0565, B:154:0x056b, B:156:0x0578, B:157:0x057d, B:159:0x058a, B:161:0x0594, B:163:0x059c, B:164:0x05a2, B:166:0x05aa, B:167:0x05af, B:169:0x05b7, B:170:0x05bc, B:172:0x05cf, B:174:0x05d9, B:175:0x05dc, B:177:0x05f2, B:179:0x05f6, B:181:0x0601, B:182:0x060d, B:184:0x061f, B:186:0x0623, B:188:0x0635, B:189:0x064d, B:191:0x0653, B:192:0x0668, B:193:0x066b, B:195:0x06b3, B:197:0x06b9, B:199:0x06bf, B:200:0x06c2, B:202:0x06ce, B:203:0x0735, B:205:0x073f, B:206:0x0746, B:208:0x0750, B:209:0x0757, B:210:0x0762, B:212:0x0768, B:214:0x0799, B:215:0x07a9, B:217:0x07b1, B:218:0x07b7, B:220:0x07bd, B:224:0x07d0, B:226:0x07f8, B:230:0x080b, B:232:0x0811, B:234:0x0815, B:235:0x082b, B:237:0x083f), top: B:243:0x0101, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(defpackage.bli r36, defpackage.bva r37) {
        /*
            Method dump skipped, instructions count: 2186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buj.b(bli, bva):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        bqb b;
        String str;
        g();
        h();
        this.t = true;
        try {
            Boolean bool = this.b.i().c;
            if (bool == null) {
                this.b.q().f.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                this.b.q().c.a("Upload called in the client side when service should be used");
            } else if (this.q > 0) {
                j();
            } else {
                g();
                if (this.w != null) {
                    this.b.q().k.a("Uploading requested multiple times");
                } else if (!c().e()) {
                    this.b.q().k.a("Network not connected, ignoring upload request");
                    j();
                } else {
                    long a2 = this.b.l().a();
                    a(a2 - bvf.i());
                    long a3 = this.b.b().d.a();
                    if (a3 != 0) {
                        this.b.q().j.a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a2 - a3)));
                    }
                    String y = d().y();
                    if (!TextUtils.isEmpty(y)) {
                        if (this.y == -1) {
                            this.y = d().F();
                        }
                        List<Pair<apv.g, Long>> a4 = d().a(y, this.b.e.b(y, blk.j), Math.max(0, this.b.e.b(y, blk.k)));
                        if (!a4.isEmpty()) {
                            Iterator<Pair<apv.g, Long>> it = a4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    break;
                                }
                                apv.g gVar = (apv.g) it.next().first;
                                if (!TextUtils.isEmpty(gVar.zzxq)) {
                                    str = gVar.zzxq;
                                    break;
                                }
                            }
                            if (str != null) {
                                int i = 0;
                                while (true) {
                                    if (i >= a4.size()) {
                                        break;
                                    }
                                    apv.g gVar2 = (apv.g) a4.get(i).first;
                                    if (!TextUtils.isEmpty(gVar2.zzxq) && !gVar2.zzxq.equals(str)) {
                                        a4 = a4.subList(0, i);
                                        break;
                                    }
                                    i++;
                                }
                            }
                            apv.f.a a5 = apv.f.a();
                            int size = a4.size();
                            ArrayList arrayList = new ArrayList(a4.size());
                            boolean z = bvf.t() && this.b.e.d(y);
                            for (int i2 = 0; i2 < size; i2++) {
                                apv.g.a n = ((apv.g) a4.get(i2).first).n();
                                arrayList.add((Long) a4.get(i2).second);
                                n.l().a(a2).b(false);
                                if (!z) {
                                    n.q();
                                }
                                if (this.b.e.d(y, blk.ap)) {
                                    n.k(f().a(((apv.g) ((ata) n.v())).i()));
                                }
                                a5.a(n);
                            }
                            String a6 = this.b.q().a(2) ? f().a((apv.f) ((ata) a5.v())) : null;
                            f();
                            byte[] i3 = ((apv.f) ((ata) a5.v())).i();
                            String a7 = blk.t.a(null);
                            try {
                                URL url = new URL(a7);
                                aat.a(!arrayList.isEmpty());
                                if (this.w != null) {
                                    this.b.q().c.a("Set uploading progress before finishing the previous upload");
                                } else {
                                    this.w = new ArrayList(arrayList);
                                }
                                this.b.b().e.a(a2);
                                String str2 = "?";
                                if (size > 0) {
                                    str2 = a5.a().zzxm;
                                }
                                this.b.q().k.a("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(i3.length), a6);
                                this.s = true;
                                bpl c = c();
                                bul bulVar = new bul(this, y);
                                c.c();
                                c.t();
                                aat.a(url);
                                aat.a(i3);
                                aat.a(bulVar);
                                c.p().b(new bpp(c, y, url, i3, null, bulVar));
                            } catch (MalformedURLException unused) {
                                this.b.q().c.a("Failed to parse upload URL. Not uploading. appId", bpi.a(y), a7);
                            }
                        }
                    } else {
                        this.y = -1L;
                        String a8 = d().a(a2 - bvf.i());
                        if (!TextUtils.isEmpty(a8) && (b = d().b(a8)) != null) {
                            a(b);
                        }
                    }
                }
            }
        } finally {
            this.t = false;
            t();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:425:0x0bb9, code lost:
        if (r5 != r14) goto L426;
     */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x022e: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:86:0x022d */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0255 A[Catch: all -> 0x0e58, TryCatch #14 {all -> 0x0e58, blocks: (B:3:0x000b, B:23:0x0084, B:37:0x00d9, B:44:0x0124, B:59:0x01ac, B:66:0x01e9, B:73:0x0207, B:82:0x0225, B:97:0x024e, B:98:0x0251, B:100:0x0255, B:106:0x0263, B:107:0x0289, B:110:0x029d, B:113:0x02c3, B:115:0x02f4, B:121:0x0308, B:123:0x0312, B:125:0x033c, B:128:0x0352, B:135:0x0374, B:138:0x037e, B:141:0x0388, B:158:0x03b5, B:161:0x03bf, B:163:0x03cb, B:164:0x03ee, B:166:0x03fb, B:168:0x0420, B:172:0x042f, B:174:0x045d, B:175:0x0489, B:177:0x04b9, B:179:0x04bf, B:182:0x04cb, B:184:0x04fc, B:185:0x0515, B:187:0x051b, B:189:0x0527, B:190:0x0532, B:193:0x053b, B:196:0x0542, B:198:0x0549, B:199:0x0568, B:200:0x057f, B:203:0x0591, B:204:0x059d, B:207:0x05a7, B:210:0x05b7, B:213:0x05c6, B:216:0x05cc, B:218:0x05d8, B:220:0x05e4, B:224:0x0603, B:228:0x0615, B:230:0x061b, B:233:0x0626, B:236:0x062f, B:239:0x064a, B:241:0x065a, B:243:0x0666, B:246:0x067a, B:248:0x068c, B:250:0x069a, B:254:0x06b6, B:256:0x06c4, B:259:0x06d9, B:261:0x06eb, B:263:0x06f9, B:270:0x0719, B:272:0x0723, B:274:0x0729, B:275:0x073f, B:277:0x0752, B:278:0x0768, B:280:0x0771, B:281:0x0785, B:286:0x079e, B:288:0x07aa, B:290:0x07b3, B:291:0x07bb, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:300:0x07de, B:301:0x07e4, B:302:0x07e7, B:305:0x07ff, B:306:0x0807, B:308:0x080d, B:313:0x0822, B:314:0x082d, B:315:0x0832, B:317:0x0842, B:318:0x084d, B:320:0x085d, B:322:0x087a, B:324:0x0888, B:326:0x088e, B:328:0x0898, B:329:0x08c9, B:331:0x08cf, B:333:0x08db, B:334:0x08e0, B:337:0x08e6, B:338:0x08e9, B:346:0x0954, B:348:0x096f, B:349:0x097e, B:351:0x0982, B:353:0x098e, B:354:0x0996, B:356:0x099a, B:358:0x09a2, B:359:0x09b0, B:360:0x09bb, B:365:0x09fc, B:366:0x0a02, B:368:0x0a08, B:370:0x0a18, B:372:0x0a1c, B:380:0x0a35, B:383:0x0a49, B:386:0x0a7a, B:388:0x0a8c, B:390:0x0ab1, B:391:0x0ad7, B:399:0x0b0f, B:401:0x0b20, B:403:0x0b24, B:405:0x0b28, B:407:0x0b2c, B:408:0x0b38, B:411:0x0b43, B:413:0x0b5f, B:414:0x0b68, B:421:0x0b9f, B:46:0x012d), top: B:543:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0263 A[Catch: all -> 0x0e58, TryCatch #14 {all -> 0x0e58, blocks: (B:3:0x000b, B:23:0x0084, B:37:0x00d9, B:44:0x0124, B:59:0x01ac, B:66:0x01e9, B:73:0x0207, B:82:0x0225, B:97:0x024e, B:98:0x0251, B:100:0x0255, B:106:0x0263, B:107:0x0289, B:110:0x029d, B:113:0x02c3, B:115:0x02f4, B:121:0x0308, B:123:0x0312, B:125:0x033c, B:128:0x0352, B:135:0x0374, B:138:0x037e, B:141:0x0388, B:158:0x03b5, B:161:0x03bf, B:163:0x03cb, B:164:0x03ee, B:166:0x03fb, B:168:0x0420, B:172:0x042f, B:174:0x045d, B:175:0x0489, B:177:0x04b9, B:179:0x04bf, B:182:0x04cb, B:184:0x04fc, B:185:0x0515, B:187:0x051b, B:189:0x0527, B:190:0x0532, B:193:0x053b, B:196:0x0542, B:198:0x0549, B:199:0x0568, B:200:0x057f, B:203:0x0591, B:204:0x059d, B:207:0x05a7, B:210:0x05b7, B:213:0x05c6, B:216:0x05cc, B:218:0x05d8, B:220:0x05e4, B:224:0x0603, B:228:0x0615, B:230:0x061b, B:233:0x0626, B:236:0x062f, B:239:0x064a, B:241:0x065a, B:243:0x0666, B:246:0x067a, B:248:0x068c, B:250:0x069a, B:254:0x06b6, B:256:0x06c4, B:259:0x06d9, B:261:0x06eb, B:263:0x06f9, B:270:0x0719, B:272:0x0723, B:274:0x0729, B:275:0x073f, B:277:0x0752, B:278:0x0768, B:280:0x0771, B:281:0x0785, B:286:0x079e, B:288:0x07aa, B:290:0x07b3, B:291:0x07bb, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:300:0x07de, B:301:0x07e4, B:302:0x07e7, B:305:0x07ff, B:306:0x0807, B:308:0x080d, B:313:0x0822, B:314:0x082d, B:315:0x0832, B:317:0x0842, B:318:0x084d, B:320:0x085d, B:322:0x087a, B:324:0x0888, B:326:0x088e, B:328:0x0898, B:329:0x08c9, B:331:0x08cf, B:333:0x08db, B:334:0x08e0, B:337:0x08e6, B:338:0x08e9, B:346:0x0954, B:348:0x096f, B:349:0x097e, B:351:0x0982, B:353:0x098e, B:354:0x0996, B:356:0x099a, B:358:0x09a2, B:359:0x09b0, B:360:0x09bb, B:365:0x09fc, B:366:0x0a02, B:368:0x0a08, B:370:0x0a18, B:372:0x0a1c, B:380:0x0a35, B:383:0x0a49, B:386:0x0a7a, B:388:0x0a8c, B:390:0x0ab1, B:391:0x0ad7, B:399:0x0b0f, B:401:0x0b20, B:403:0x0b24, B:405:0x0b28, B:407:0x0b2c, B:408:0x0b38, B:411:0x0b43, B:413:0x0b5f, B:414:0x0b68, B:421:0x0b9f, B:46:0x012d), top: B:543:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05a7 A[Catch: all -> 0x0e58, TRY_ENTER, TryCatch #14 {all -> 0x0e58, blocks: (B:3:0x000b, B:23:0x0084, B:37:0x00d9, B:44:0x0124, B:59:0x01ac, B:66:0x01e9, B:73:0x0207, B:82:0x0225, B:97:0x024e, B:98:0x0251, B:100:0x0255, B:106:0x0263, B:107:0x0289, B:110:0x029d, B:113:0x02c3, B:115:0x02f4, B:121:0x0308, B:123:0x0312, B:125:0x033c, B:128:0x0352, B:135:0x0374, B:138:0x037e, B:141:0x0388, B:158:0x03b5, B:161:0x03bf, B:163:0x03cb, B:164:0x03ee, B:166:0x03fb, B:168:0x0420, B:172:0x042f, B:174:0x045d, B:175:0x0489, B:177:0x04b9, B:179:0x04bf, B:182:0x04cb, B:184:0x04fc, B:185:0x0515, B:187:0x051b, B:189:0x0527, B:190:0x0532, B:193:0x053b, B:196:0x0542, B:198:0x0549, B:199:0x0568, B:200:0x057f, B:203:0x0591, B:204:0x059d, B:207:0x05a7, B:210:0x05b7, B:213:0x05c6, B:216:0x05cc, B:218:0x05d8, B:220:0x05e4, B:224:0x0603, B:228:0x0615, B:230:0x061b, B:233:0x0626, B:236:0x062f, B:239:0x064a, B:241:0x065a, B:243:0x0666, B:246:0x067a, B:248:0x068c, B:250:0x069a, B:254:0x06b6, B:256:0x06c4, B:259:0x06d9, B:261:0x06eb, B:263:0x06f9, B:270:0x0719, B:272:0x0723, B:274:0x0729, B:275:0x073f, B:277:0x0752, B:278:0x0768, B:280:0x0771, B:281:0x0785, B:286:0x079e, B:288:0x07aa, B:290:0x07b3, B:291:0x07bb, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:300:0x07de, B:301:0x07e4, B:302:0x07e7, B:305:0x07ff, B:306:0x0807, B:308:0x080d, B:313:0x0822, B:314:0x082d, B:315:0x0832, B:317:0x0842, B:318:0x084d, B:320:0x085d, B:322:0x087a, B:324:0x0888, B:326:0x088e, B:328:0x0898, B:329:0x08c9, B:331:0x08cf, B:333:0x08db, B:334:0x08e0, B:337:0x08e6, B:338:0x08e9, B:346:0x0954, B:348:0x096f, B:349:0x097e, B:351:0x0982, B:353:0x098e, B:354:0x0996, B:356:0x099a, B:358:0x09a2, B:359:0x09b0, B:360:0x09bb, B:365:0x09fc, B:366:0x0a02, B:368:0x0a08, B:370:0x0a18, B:372:0x0a1c, B:380:0x0a35, B:383:0x0a49, B:386:0x0a7a, B:388:0x0a8c, B:390:0x0ab1, B:391:0x0ad7, B:399:0x0b0f, B:401:0x0b20, B:403:0x0b24, B:405:0x0b28, B:407:0x0b2c, B:408:0x0b38, B:411:0x0b43, B:413:0x0b5f, B:414:0x0b68, B:421:0x0b9f, B:46:0x012d), top: B:543:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05cc A[Catch: all -> 0x0e58, TryCatch #14 {all -> 0x0e58, blocks: (B:3:0x000b, B:23:0x0084, B:37:0x00d9, B:44:0x0124, B:59:0x01ac, B:66:0x01e9, B:73:0x0207, B:82:0x0225, B:97:0x024e, B:98:0x0251, B:100:0x0255, B:106:0x0263, B:107:0x0289, B:110:0x029d, B:113:0x02c3, B:115:0x02f4, B:121:0x0308, B:123:0x0312, B:125:0x033c, B:128:0x0352, B:135:0x0374, B:138:0x037e, B:141:0x0388, B:158:0x03b5, B:161:0x03bf, B:163:0x03cb, B:164:0x03ee, B:166:0x03fb, B:168:0x0420, B:172:0x042f, B:174:0x045d, B:175:0x0489, B:177:0x04b9, B:179:0x04bf, B:182:0x04cb, B:184:0x04fc, B:185:0x0515, B:187:0x051b, B:189:0x0527, B:190:0x0532, B:193:0x053b, B:196:0x0542, B:198:0x0549, B:199:0x0568, B:200:0x057f, B:203:0x0591, B:204:0x059d, B:207:0x05a7, B:210:0x05b7, B:213:0x05c6, B:216:0x05cc, B:218:0x05d8, B:220:0x05e4, B:224:0x0603, B:228:0x0615, B:230:0x061b, B:233:0x0626, B:236:0x062f, B:239:0x064a, B:241:0x065a, B:243:0x0666, B:246:0x067a, B:248:0x068c, B:250:0x069a, B:254:0x06b6, B:256:0x06c4, B:259:0x06d9, B:261:0x06eb, B:263:0x06f9, B:270:0x0719, B:272:0x0723, B:274:0x0729, B:275:0x073f, B:277:0x0752, B:278:0x0768, B:280:0x0771, B:281:0x0785, B:286:0x079e, B:288:0x07aa, B:290:0x07b3, B:291:0x07bb, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:300:0x07de, B:301:0x07e4, B:302:0x07e7, B:305:0x07ff, B:306:0x0807, B:308:0x080d, B:313:0x0822, B:314:0x082d, B:315:0x0832, B:317:0x0842, B:318:0x084d, B:320:0x085d, B:322:0x087a, B:324:0x0888, B:326:0x088e, B:328:0x0898, B:329:0x08c9, B:331:0x08cf, B:333:0x08db, B:334:0x08e0, B:337:0x08e6, B:338:0x08e9, B:346:0x0954, B:348:0x096f, B:349:0x097e, B:351:0x0982, B:353:0x098e, B:354:0x0996, B:356:0x099a, B:358:0x09a2, B:359:0x09b0, B:360:0x09bb, B:365:0x09fc, B:366:0x0a02, B:368:0x0a08, B:370:0x0a18, B:372:0x0a1c, B:380:0x0a35, B:383:0x0a49, B:386:0x0a7a, B:388:0x0a8c, B:390:0x0ab1, B:391:0x0ad7, B:399:0x0b0f, B:401:0x0b20, B:403:0x0b24, B:405:0x0b28, B:407:0x0b2c, B:408:0x0b38, B:411:0x0b43, B:413:0x0b5f, B:414:0x0b68, B:421:0x0b9f, B:46:0x012d), top: B:543:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x065a A[Catch: all -> 0x0e58, TryCatch #14 {all -> 0x0e58, blocks: (B:3:0x000b, B:23:0x0084, B:37:0x00d9, B:44:0x0124, B:59:0x01ac, B:66:0x01e9, B:73:0x0207, B:82:0x0225, B:97:0x024e, B:98:0x0251, B:100:0x0255, B:106:0x0263, B:107:0x0289, B:110:0x029d, B:113:0x02c3, B:115:0x02f4, B:121:0x0308, B:123:0x0312, B:125:0x033c, B:128:0x0352, B:135:0x0374, B:138:0x037e, B:141:0x0388, B:158:0x03b5, B:161:0x03bf, B:163:0x03cb, B:164:0x03ee, B:166:0x03fb, B:168:0x0420, B:172:0x042f, B:174:0x045d, B:175:0x0489, B:177:0x04b9, B:179:0x04bf, B:182:0x04cb, B:184:0x04fc, B:185:0x0515, B:187:0x051b, B:189:0x0527, B:190:0x0532, B:193:0x053b, B:196:0x0542, B:198:0x0549, B:199:0x0568, B:200:0x057f, B:203:0x0591, B:204:0x059d, B:207:0x05a7, B:210:0x05b7, B:213:0x05c6, B:216:0x05cc, B:218:0x05d8, B:220:0x05e4, B:224:0x0603, B:228:0x0615, B:230:0x061b, B:233:0x0626, B:236:0x062f, B:239:0x064a, B:241:0x065a, B:243:0x0666, B:246:0x067a, B:248:0x068c, B:250:0x069a, B:254:0x06b6, B:256:0x06c4, B:259:0x06d9, B:261:0x06eb, B:263:0x06f9, B:270:0x0719, B:272:0x0723, B:274:0x0729, B:275:0x073f, B:277:0x0752, B:278:0x0768, B:280:0x0771, B:281:0x0785, B:286:0x079e, B:288:0x07aa, B:290:0x07b3, B:291:0x07bb, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:300:0x07de, B:301:0x07e4, B:302:0x07e7, B:305:0x07ff, B:306:0x0807, B:308:0x080d, B:313:0x0822, B:314:0x082d, B:315:0x0832, B:317:0x0842, B:318:0x084d, B:320:0x085d, B:322:0x087a, B:324:0x0888, B:326:0x088e, B:328:0x0898, B:329:0x08c9, B:331:0x08cf, B:333:0x08db, B:334:0x08e0, B:337:0x08e6, B:338:0x08e9, B:346:0x0954, B:348:0x096f, B:349:0x097e, B:351:0x0982, B:353:0x098e, B:354:0x0996, B:356:0x099a, B:358:0x09a2, B:359:0x09b0, B:360:0x09bb, B:365:0x09fc, B:366:0x0a02, B:368:0x0a08, B:370:0x0a18, B:372:0x0a1c, B:380:0x0a35, B:383:0x0a49, B:386:0x0a7a, B:388:0x0a8c, B:390:0x0ab1, B:391:0x0ad7, B:399:0x0b0f, B:401:0x0b20, B:403:0x0b24, B:405:0x0b28, B:407:0x0b2c, B:408:0x0b38, B:411:0x0b43, B:413:0x0b5f, B:414:0x0b68, B:421:0x0b9f, B:46:0x012d), top: B:543:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0719 A[Catch: all -> 0x0e58, TryCatch #14 {all -> 0x0e58, blocks: (B:3:0x000b, B:23:0x0084, B:37:0x00d9, B:44:0x0124, B:59:0x01ac, B:66:0x01e9, B:73:0x0207, B:82:0x0225, B:97:0x024e, B:98:0x0251, B:100:0x0255, B:106:0x0263, B:107:0x0289, B:110:0x029d, B:113:0x02c3, B:115:0x02f4, B:121:0x0308, B:123:0x0312, B:125:0x033c, B:128:0x0352, B:135:0x0374, B:138:0x037e, B:141:0x0388, B:158:0x03b5, B:161:0x03bf, B:163:0x03cb, B:164:0x03ee, B:166:0x03fb, B:168:0x0420, B:172:0x042f, B:174:0x045d, B:175:0x0489, B:177:0x04b9, B:179:0x04bf, B:182:0x04cb, B:184:0x04fc, B:185:0x0515, B:187:0x051b, B:189:0x0527, B:190:0x0532, B:193:0x053b, B:196:0x0542, B:198:0x0549, B:199:0x0568, B:200:0x057f, B:203:0x0591, B:204:0x059d, B:207:0x05a7, B:210:0x05b7, B:213:0x05c6, B:216:0x05cc, B:218:0x05d8, B:220:0x05e4, B:224:0x0603, B:228:0x0615, B:230:0x061b, B:233:0x0626, B:236:0x062f, B:239:0x064a, B:241:0x065a, B:243:0x0666, B:246:0x067a, B:248:0x068c, B:250:0x069a, B:254:0x06b6, B:256:0x06c4, B:259:0x06d9, B:261:0x06eb, B:263:0x06f9, B:270:0x0719, B:272:0x0723, B:274:0x0729, B:275:0x073f, B:277:0x0752, B:278:0x0768, B:280:0x0771, B:281:0x0785, B:286:0x079e, B:288:0x07aa, B:290:0x07b3, B:291:0x07bb, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:300:0x07de, B:301:0x07e4, B:302:0x07e7, B:305:0x07ff, B:306:0x0807, B:308:0x080d, B:313:0x0822, B:314:0x082d, B:315:0x0832, B:317:0x0842, B:318:0x084d, B:320:0x085d, B:322:0x087a, B:324:0x0888, B:326:0x088e, B:328:0x0898, B:329:0x08c9, B:331:0x08cf, B:333:0x08db, B:334:0x08e0, B:337:0x08e6, B:338:0x08e9, B:346:0x0954, B:348:0x096f, B:349:0x097e, B:351:0x0982, B:353:0x098e, B:354:0x0996, B:356:0x099a, B:358:0x09a2, B:359:0x09b0, B:360:0x09bb, B:365:0x09fc, B:366:0x0a02, B:368:0x0a08, B:370:0x0a18, B:372:0x0a1c, B:380:0x0a35, B:383:0x0a49, B:386:0x0a7a, B:388:0x0a8c, B:390:0x0ab1, B:391:0x0ad7, B:399:0x0b0f, B:401:0x0b20, B:403:0x0b24, B:405:0x0b28, B:407:0x0b2c, B:408:0x0b38, B:411:0x0b43, B:413:0x0b5f, B:414:0x0b68, B:421:0x0b9f, B:46:0x012d), top: B:543:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0729 A[Catch: all -> 0x0e58, TryCatch #14 {all -> 0x0e58, blocks: (B:3:0x000b, B:23:0x0084, B:37:0x00d9, B:44:0x0124, B:59:0x01ac, B:66:0x01e9, B:73:0x0207, B:82:0x0225, B:97:0x024e, B:98:0x0251, B:100:0x0255, B:106:0x0263, B:107:0x0289, B:110:0x029d, B:113:0x02c3, B:115:0x02f4, B:121:0x0308, B:123:0x0312, B:125:0x033c, B:128:0x0352, B:135:0x0374, B:138:0x037e, B:141:0x0388, B:158:0x03b5, B:161:0x03bf, B:163:0x03cb, B:164:0x03ee, B:166:0x03fb, B:168:0x0420, B:172:0x042f, B:174:0x045d, B:175:0x0489, B:177:0x04b9, B:179:0x04bf, B:182:0x04cb, B:184:0x04fc, B:185:0x0515, B:187:0x051b, B:189:0x0527, B:190:0x0532, B:193:0x053b, B:196:0x0542, B:198:0x0549, B:199:0x0568, B:200:0x057f, B:203:0x0591, B:204:0x059d, B:207:0x05a7, B:210:0x05b7, B:213:0x05c6, B:216:0x05cc, B:218:0x05d8, B:220:0x05e4, B:224:0x0603, B:228:0x0615, B:230:0x061b, B:233:0x0626, B:236:0x062f, B:239:0x064a, B:241:0x065a, B:243:0x0666, B:246:0x067a, B:248:0x068c, B:250:0x069a, B:254:0x06b6, B:256:0x06c4, B:259:0x06d9, B:261:0x06eb, B:263:0x06f9, B:270:0x0719, B:272:0x0723, B:274:0x0729, B:275:0x073f, B:277:0x0752, B:278:0x0768, B:280:0x0771, B:281:0x0785, B:286:0x079e, B:288:0x07aa, B:290:0x07b3, B:291:0x07bb, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:300:0x07de, B:301:0x07e4, B:302:0x07e7, B:305:0x07ff, B:306:0x0807, B:308:0x080d, B:313:0x0822, B:314:0x082d, B:315:0x0832, B:317:0x0842, B:318:0x084d, B:320:0x085d, B:322:0x087a, B:324:0x0888, B:326:0x088e, B:328:0x0898, B:329:0x08c9, B:331:0x08cf, B:333:0x08db, B:334:0x08e0, B:337:0x08e6, B:338:0x08e9, B:346:0x0954, B:348:0x096f, B:349:0x097e, B:351:0x0982, B:353:0x098e, B:354:0x0996, B:356:0x099a, B:358:0x09a2, B:359:0x09b0, B:360:0x09bb, B:365:0x09fc, B:366:0x0a02, B:368:0x0a08, B:370:0x0a18, B:372:0x0a1c, B:380:0x0a35, B:383:0x0a49, B:386:0x0a7a, B:388:0x0a8c, B:390:0x0ab1, B:391:0x0ad7, B:399:0x0b0f, B:401:0x0b20, B:403:0x0b24, B:405:0x0b28, B:407:0x0b2c, B:408:0x0b38, B:411:0x0b43, B:413:0x0b5f, B:414:0x0b68, B:421:0x0b9f, B:46:0x012d), top: B:543:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x073f A[Catch: all -> 0x0e58, TryCatch #14 {all -> 0x0e58, blocks: (B:3:0x000b, B:23:0x0084, B:37:0x00d9, B:44:0x0124, B:59:0x01ac, B:66:0x01e9, B:73:0x0207, B:82:0x0225, B:97:0x024e, B:98:0x0251, B:100:0x0255, B:106:0x0263, B:107:0x0289, B:110:0x029d, B:113:0x02c3, B:115:0x02f4, B:121:0x0308, B:123:0x0312, B:125:0x033c, B:128:0x0352, B:135:0x0374, B:138:0x037e, B:141:0x0388, B:158:0x03b5, B:161:0x03bf, B:163:0x03cb, B:164:0x03ee, B:166:0x03fb, B:168:0x0420, B:172:0x042f, B:174:0x045d, B:175:0x0489, B:177:0x04b9, B:179:0x04bf, B:182:0x04cb, B:184:0x04fc, B:185:0x0515, B:187:0x051b, B:189:0x0527, B:190:0x0532, B:193:0x053b, B:196:0x0542, B:198:0x0549, B:199:0x0568, B:200:0x057f, B:203:0x0591, B:204:0x059d, B:207:0x05a7, B:210:0x05b7, B:213:0x05c6, B:216:0x05cc, B:218:0x05d8, B:220:0x05e4, B:224:0x0603, B:228:0x0615, B:230:0x061b, B:233:0x0626, B:236:0x062f, B:239:0x064a, B:241:0x065a, B:243:0x0666, B:246:0x067a, B:248:0x068c, B:250:0x069a, B:254:0x06b6, B:256:0x06c4, B:259:0x06d9, B:261:0x06eb, B:263:0x06f9, B:270:0x0719, B:272:0x0723, B:274:0x0729, B:275:0x073f, B:277:0x0752, B:278:0x0768, B:280:0x0771, B:281:0x0785, B:286:0x079e, B:288:0x07aa, B:290:0x07b3, B:291:0x07bb, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:300:0x07de, B:301:0x07e4, B:302:0x07e7, B:305:0x07ff, B:306:0x0807, B:308:0x080d, B:313:0x0822, B:314:0x082d, B:315:0x0832, B:317:0x0842, B:318:0x084d, B:320:0x085d, B:322:0x087a, B:324:0x0888, B:326:0x088e, B:328:0x0898, B:329:0x08c9, B:331:0x08cf, B:333:0x08db, B:334:0x08e0, B:337:0x08e6, B:338:0x08e9, B:346:0x0954, B:348:0x096f, B:349:0x097e, B:351:0x0982, B:353:0x098e, B:354:0x0996, B:356:0x099a, B:358:0x09a2, B:359:0x09b0, B:360:0x09bb, B:365:0x09fc, B:366:0x0a02, B:368:0x0a08, B:370:0x0a18, B:372:0x0a1c, B:380:0x0a35, B:383:0x0a49, B:386:0x0a7a, B:388:0x0a8c, B:390:0x0ab1, B:391:0x0ad7, B:399:0x0b0f, B:401:0x0b20, B:403:0x0b24, B:405:0x0b28, B:407:0x0b2c, B:408:0x0b38, B:411:0x0b43, B:413:0x0b5f, B:414:0x0b68, B:421:0x0b9f, B:46:0x012d), top: B:543:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0e3b  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0e52 A[Catch: all -> 0x0e56, TRY_ENTER, TryCatch #11 {all -> 0x0e56, blocks: (B:463:0x0cc3, B:464:0x0cd9, B:466:0x0ce1, B:468:0x0ceb, B:469:0x0cef, B:470:0x0cf2, B:476:0x0d02, B:477:0x0d06, B:478:0x0d09, B:480:0x0d33, B:481:0x0d37, B:482:0x0d3a, B:483:0x0d41, B:485:0x0d47, B:487:0x0d55, B:490:0x0d5a, B:491:0x0d64, B:493:0x0d6e, B:494:0x0d74, B:495:0x0d89, B:496:0x0d9a, B:497:0x0db1, B:500:0x0db9, B:501:0x0dbe, B:502:0x0dce, B:504:0x0de8, B:505:0x0dff, B:506:0x0e07, B:509:0x0e18, B:510:0x0e27, B:516:0x0e3c, B:522:0x0e52, B:523:0x0e55), top: B:539:0x0025, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024e A[Catch: all -> 0x0e58, TRY_ENTER, TryCatch #14 {all -> 0x0e58, blocks: (B:3:0x000b, B:23:0x0084, B:37:0x00d9, B:44:0x0124, B:59:0x01ac, B:66:0x01e9, B:73:0x0207, B:82:0x0225, B:97:0x024e, B:98:0x0251, B:100:0x0255, B:106:0x0263, B:107:0x0289, B:110:0x029d, B:113:0x02c3, B:115:0x02f4, B:121:0x0308, B:123:0x0312, B:125:0x033c, B:128:0x0352, B:135:0x0374, B:138:0x037e, B:141:0x0388, B:158:0x03b5, B:161:0x03bf, B:163:0x03cb, B:164:0x03ee, B:166:0x03fb, B:168:0x0420, B:172:0x042f, B:174:0x045d, B:175:0x0489, B:177:0x04b9, B:179:0x04bf, B:182:0x04cb, B:184:0x04fc, B:185:0x0515, B:187:0x051b, B:189:0x0527, B:190:0x0532, B:193:0x053b, B:196:0x0542, B:198:0x0549, B:199:0x0568, B:200:0x057f, B:203:0x0591, B:204:0x059d, B:207:0x05a7, B:210:0x05b7, B:213:0x05c6, B:216:0x05cc, B:218:0x05d8, B:220:0x05e4, B:224:0x0603, B:228:0x0615, B:230:0x061b, B:233:0x0626, B:236:0x062f, B:239:0x064a, B:241:0x065a, B:243:0x0666, B:246:0x067a, B:248:0x068c, B:250:0x069a, B:254:0x06b6, B:256:0x06c4, B:259:0x06d9, B:261:0x06eb, B:263:0x06f9, B:270:0x0719, B:272:0x0723, B:274:0x0729, B:275:0x073f, B:277:0x0752, B:278:0x0768, B:280:0x0771, B:281:0x0785, B:286:0x079e, B:288:0x07aa, B:290:0x07b3, B:291:0x07bb, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:300:0x07de, B:301:0x07e4, B:302:0x07e7, B:305:0x07ff, B:306:0x0807, B:308:0x080d, B:313:0x0822, B:314:0x082d, B:315:0x0832, B:317:0x0842, B:318:0x084d, B:320:0x085d, B:322:0x087a, B:324:0x0888, B:326:0x088e, B:328:0x0898, B:329:0x08c9, B:331:0x08cf, B:333:0x08db, B:334:0x08e0, B:337:0x08e6, B:338:0x08e9, B:346:0x0954, B:348:0x096f, B:349:0x097e, B:351:0x0982, B:353:0x098e, B:354:0x0996, B:356:0x099a, B:358:0x09a2, B:359:0x09b0, B:360:0x09bb, B:365:0x09fc, B:366:0x0a02, B:368:0x0a08, B:370:0x0a18, B:372:0x0a1c, B:380:0x0a35, B:383:0x0a49, B:386:0x0a7a, B:388:0x0a8c, B:390:0x0ab1, B:391:0x0ad7, B:399:0x0b0f, B:401:0x0b20, B:403:0x0b24, B:405:0x0b28, B:407:0x0b2c, B:408:0x0b38, B:411:0x0b43, B:413:0x0b5f, B:414:0x0b68, B:421:0x0b9f, B:46:0x012d), top: B:543:0x000b, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a(long r53) {
        /*
            Method dump skipped, instructions count: 3683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buj.a(long):boolean");
    }

    private final void a(apv.g.a aVar, long j, boolean z) {
        bus busVar;
        String str = z ? "_se" : "_lte";
        bus c = d().c(aVar.k(), str);
        if (c == null || c.e == null) {
            busVar = new bus(aVar.k(), "auto", str, this.b.l().a(), Long.valueOf(j));
        } else {
            busVar = new bus(aVar.k(), "auto", str, this.b.l().a(), Long.valueOf(((Long) c.e).longValue() + j));
        }
        apv.k kVar = (apv.k) ((ata) apv.k.e().a(str).a(this.b.l().a()).b(((Long) busVar.e).longValue()).v());
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= aVar.f()) {
                break;
            } else if (str.equals(aVar.c(i).zzwk)) {
                aVar.a(i, kVar);
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (!z2) {
            aVar.a(kVar);
        }
        if (j > 0) {
            d().a(busVar);
            this.b.q().j.a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", busVar.e);
        }
    }

    private final boolean a(apv.c.a aVar, apv.c.a aVar2) {
        aat.a("_e".equals(aVar.c()));
        f();
        apv.e a2 = bur.a((apv.c) ((ata) aVar.v()), "_sc");
        String str = null;
        String str2 = a2 == null ? null : a2.zzwr;
        f();
        apv.e a3 = bur.a((apv.c) ((ata) aVar2.v()), "_pc");
        if (a3 != null) {
            str = a3.zzwr;
        }
        if (str == null || !str.equals(str2)) {
            return false;
        }
        f();
        apv.e a4 = bur.a((apv.c) ((ata) aVar.v()), "_et");
        if (a4.b() && a4.zzwp > 0) {
            long j = a4.zzwp;
            f();
            apv.e a5 = bur.a((apv.c) ((ata) aVar2.v()), "_et");
            if (a5 != null && a5.zzwp > 0) {
                j += a5.zzwp;
            }
            f();
            bur.a(aVar2, "_et", Long.valueOf(j));
            f();
            bur.a(aVar, "_fr", (Object) 1L);
        }
        return true;
    }

    private static void a(apv.c.a aVar, String str) {
        List<apv.e> a2 = aVar.a();
        for (int i = 0; i < a2.size(); i++) {
            if (str.equals(a2.get(i).zzwk)) {
                aVar.b(i);
                return;
            }
        }
    }

    private static void a(apv.c.a aVar, int i, String str) {
        List<apv.e> a2 = aVar.a();
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if ("_err".equals(a2.get(i2).zzwk)) {
                return;
            }
        }
        aVar.a((apv.e) ((ata) apv.e.d().a("_err").a(i).v())).a((apv.e) ((ata) apv.e.d().a("_ev").b(str).v()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014e, code lost:
        r9.b.b().f.a(r9.b.l().a());
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r10, java.lang.Throwable r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buj.a(int, java.lang.Throwable, byte[]):void");
    }

    private final boolean s() {
        g();
        h();
        return d().D() || !TextUtils.isEmpty(d().y());
    }

    private final void a(bqb bqbVar) {
        g();
        if (TextUtils.isEmpty(bqbVar.c()) && (!bvf.v() || TextUtils.isEmpty(bqbVar.d()))) {
            a(bqbVar.a(), 204, null, null, null);
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        String c = bqbVar.c();
        if (TextUtils.isEmpty(c) && bvf.v()) {
            c = bqbVar.d();
        }
        ArrayMap arrayMap = null;
        Uri.Builder encodedAuthority = builder.scheme(blk.h.a(null)).encodedAuthority(blk.i.a(null));
        String valueOf = String.valueOf(c);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", bqbVar.b()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "16250");
        String uri = builder.build().toString();
        try {
            URL url = new URL(uri);
            this.b.q().k.a("Fetching remote configuration", bqbVar.a());
            apz a2 = b().a(bqbVar.a());
            String b = b().b(bqbVar.a());
            if (a2 != null && !TextUtils.isEmpty(b)) {
                arrayMap = new ArrayMap();
                arrayMap.put("If-Modified-Since", b);
            }
            this.r = true;
            bpl c2 = c();
            String a3 = bqbVar.a();
            buo buoVar = new buo(this);
            c2.c();
            c2.t();
            aat.a(url);
            aat.a(buoVar);
            c2.p().b(new bpp(c2, a3, url, null, arrayMap, buoVar));
        } catch (MalformedURLException unused) {
            this.b.q().c.a("Failed to parse config URL. Not fetching. appId", bpi.a(bqbVar.a()), uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r6.b.b().f.a(r6.b.l().a());
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115 A[Catch: all -> 0x0164, TryCatch #1 {all -> 0x016d, blocks: (B:4:0x000c, B:5:0x000e, B:56:0x0157, B:6:0x0027, B:15:0x0043, B:20:0x005d, B:27:0x00aa, B:28:0x00bf, B:31:0x00c7, B:34:0x00d3, B:36:0x00d9, B:41:0x00e6, B:42:0x00ee, B:44:0x00f8, B:45:0x00ff, B:47:0x0115, B:48:0x0123, B:49:0x0139, B:51:0x0143, B:53:0x0149, B:54:0x014d, B:55:0x0150), top: B:62:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123 A[Catch: all -> 0x0164, TryCatch #1 {all -> 0x016d, blocks: (B:4:0x000c, B:5:0x000e, B:56:0x0157, B:6:0x0027, B:15:0x0043, B:20:0x005d, B:27:0x00aa, B:28:0x00bf, B:31:0x00c7, B:34:0x00d3, B:36:0x00d9, B:41:0x00e6, B:42:0x00ee, B:44:0x00f8, B:45:0x00ff, B:47:0x0115, B:48:0x0123, B:49:0x0139, B:51:0x0143, B:53:0x0149, B:54:0x014d, B:55:0x0150), top: B:62:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buj.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buj.j():void");
    }

    private final void t() {
        g();
        if (this.r || this.s || this.t) {
            this.b.q().k.a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.r), Boolean.valueOf(this.s), Boolean.valueOf(this.t));
            return;
        }
        this.b.q().k.a("Stopping uploading service(s)");
        List<Runnable> list = this.c;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        this.c.clear();
    }

    private final Boolean b(bqb bqbVar) {
        try {
            if (bqbVar.j() != -2147483648L) {
                if (bqbVar.j() == aep.a(this.b.m()).b(bqbVar.a(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = aep.a(this.b.m()).b(bqbVar.a(), 0).versionName;
                if (bqbVar.i() != null && bqbVar.i().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final boolean u() {
        FileLock fileLock;
        g();
        if (this.b.e.d(null, blk.aD) && (fileLock = this.u) != null && fileLock.isValid()) {
            this.b.q().k.a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.b.m().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.v = channel;
            FileLock tryLock = channel.tryLock();
            this.u = tryLock;
            if (tryLock != null) {
                this.b.q().k.a("Storage concurrent access okay");
                return true;
            }
            this.b.q().c.a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.b.q().c.a("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            this.b.q().c.a("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            this.b.q().f.a("Storage lock already acquired", e3);
            return false;
        }
    }

    private final int a(FileChannel fileChannel) {
        g();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.b.q().c.a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                this.b.q().f.a("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e) {
            this.b.q().c.a("Failed to read from channel", e);
            return 0;
        }
    }

    private final boolean a(int i, FileChannel fileChannel) {
        g();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.b.q().c.a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.b.q().c.a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.b.q().c.a("Failed to write to channel", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        g();
        h();
        if (!this.p) {
            this.p = true;
            g();
            h();
            if ((this.b.e.d(null, blk.ak) || v()) && u()) {
                int a2 = a(this.v);
                int y = this.b.k().y();
                g();
                if (a2 > y) {
                    this.b.q().c.a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a2), Integer.valueOf(y));
                } else if (a2 < y) {
                    if (a(y, this.v)) {
                        this.b.q().k.a("Storage version upgraded. Previous, current version", Integer.valueOf(a2), Integer.valueOf(y));
                    } else {
                        this.b.q().c.a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a2), Integer.valueOf(y));
                    }
                }
            }
        }
        if (this.o || this.b.e.d(null, blk.ak)) {
            return;
        }
        this.b.q().i.a("This instance being marked as an uploader");
        this.o = true;
        j();
    }

    private final boolean v() {
        g();
        h();
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bva bvaVar) {
        if (this.w != null) {
            ArrayList arrayList = new ArrayList();
            this.x = arrayList;
            arrayList.addAll(this.w);
        }
        bvk d = d();
        String str = bvaVar.a;
        aat.a(str);
        d.c();
        d.t();
        try {
            SQLiteDatabase x = d.x();
            String[] strArr = {str};
            int delete = x.delete("apps", "app_id=?", strArr) + 0 + x.delete("events", "app_id=?", strArr) + x.delete("user_attributes", "app_id=?", strArr) + x.delete("conditional_properties", "app_id=?", strArr) + x.delete("raw_events", "app_id=?", strArr) + x.delete("raw_events_metadata", "app_id=?", strArr) + x.delete("queue", "app_id=?", strArr) + x.delete("audience_filter_values", "app_id=?", strArr) + x.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                d.q().k.a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            d.q().c.a("Error resetting analytics data. appId, error", bpi.a(str), e);
        }
        bva a2 = a(this.b.m(), bvaVar.a, bvaVar.b, bvaVar.h, bvaVar.o, bvaVar.p, bvaVar.m, bvaVar.r);
        if (bvaVar.h) {
            b(a2);
        }
    }

    private final bva a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4;
        String str5;
        int i;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.b.q().c.a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str4 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.b.q().c.a("Error retrieving installer package name. appId", bpi.a(str));
            str4 = "Unknown";
        }
        if (str4 == null) {
            str4 = "manual_install";
        } else if ("com.android.vending".equals(str4)) {
            str4 = "";
        }
        String str6 = str4;
        try {
            PackageInfo b = aep.a(context).b(str, 0);
            if (b != null) {
                CharSequence b2 = aep.a(context).b(str);
                if (!TextUtils.isEmpty(b2)) {
                    b2.toString();
                }
                String str7 = b.versionName;
                i = b.versionCode;
                str5 = str7;
            } else {
                i = Integer.MIN_VALUE;
                str5 = "Unknown";
            }
            return new bva(str, str2, str5, i, str6, 16250L, this.b.e().a(context, str), (String) null, z, false, "", 0L, this.b.e.f(str) ? j : 0L, 0, z2, z3, false, str3, (Boolean) null, 0L, (List<String>) null);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.b.q().c.a("Error retrieving newly installed package info. appId, appName", bpi.a(str), "Unknown");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(buq buqVar, bva bvaVar) {
        ble a2;
        g();
        h();
        if (!TextUtils.isEmpty(bvaVar.b) || !TextUtils.isEmpty(bvaVar.r)) {
            if (!bvaVar.h) {
                c(bvaVar);
                return;
            }
            int c = this.b.e().c(buqVar.a);
            if (c != 0) {
                this.b.e();
                this.b.e().a(bvaVar.a, c, "_ev", buv.a(buqVar.a, 24, true), buqVar.a != null ? buqVar.a.length() : 0);
                return;
            }
            int b = this.b.e().b(buqVar.a, buqVar.a());
            if (b != 0) {
                this.b.e();
                String a3 = buv.a(buqVar.a, 24, true);
                Object a4 = buqVar.a();
                this.b.e().a(bvaVar.a, b, "_ev", a3, (a4 == null || (!(a4 instanceof String) && !(a4 instanceof CharSequence))) ? 0 : String.valueOf(a4).length());
                return;
            }
            this.b.e();
            Object c2 = buv.c(buqVar.a, buqVar.a());
            if (c2 == null) {
                return;
            }
            if ("_sid".equals(buqVar.a) && this.b.e.i(bvaVar.a)) {
                long j = buqVar.b;
                String str = buqVar.e;
                long j2 = 0;
                bus c3 = d().c(bvaVar.a, "_sno");
                if (c3 != null && (c3.e instanceof Long)) {
                    j2 = ((Long) c3.e).longValue();
                } else {
                    if (c3 != null) {
                        this.b.q().f.a("Retrieved last session number from database does not contain a valid (long) value", c3.e);
                    }
                    if (this.b.e.d(bvaVar.a, blk.ac) && (a2 = d().a(bvaVar.a, "_s")) != null) {
                        j2 = a2.c;
                        this.b.q().k.a("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                }
                a(new buq("_sno", j, Long.valueOf(j2 + 1), str), bvaVar);
            }
            bus busVar = new bus(bvaVar.a, buqVar.e, buqVar.a, buqVar.b, c2);
            this.b.q().j.a("Setting user property", this.b.f().c(busVar.c), c2);
            d().e();
            try {
                c(bvaVar);
                boolean a5 = d().a(busVar);
                d().v();
                if (a5) {
                    this.b.q().j.a("User property set", this.b.f().c(busVar.c), busVar.e);
                } else {
                    this.b.q().c.a("Too many unique user properties are set. Ignoring user property", this.b.f().c(busVar.c), busVar.e);
                    this.b.e().a(bvaVar.a, 9, (String) null, (String) null, 0);
                }
            } finally {
                d().w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(buq buqVar, bva bvaVar) {
        g();
        h();
        if (!TextUtils.isEmpty(bvaVar.b) || !TextUtils.isEmpty(bvaVar.r)) {
            if (!bvaVar.h) {
                c(bvaVar);
            } else if (this.b.e.d(bvaVar.a, blk.ah)) {
                if ("_npa".equals(buqVar.a) && bvaVar.s != null) {
                    this.b.q().j.a("Falling back to manifest metadata value for ad personalization");
                    a(new buq("_npa", this.b.l().a(), Long.valueOf(bvaVar.s.booleanValue() ? 1L : 0L), "auto"), bvaVar);
                    return;
                }
                this.b.q().j.a("Removing user property", this.b.f().c(buqVar.a));
                d().e();
                try {
                    c(bvaVar);
                    d().b(bvaVar.a, buqVar.a);
                    d().v();
                    this.b.q().j.a("User property removed", this.b.f().c(buqVar.a));
                } finally {
                }
            } else {
                this.b.q().j.a("Removing user property", this.b.f().c(buqVar.a));
                d().e();
                try {
                    c(bvaVar);
                    d().b(bvaVar.a, buqVar.a);
                    d().v();
                    this.b.q().j.a("User property removed", this.b.f().c(buqVar.a));
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(bva bvaVar) {
        String str;
        int i;
        ble bleVar;
        String str2;
        long j;
        long j2;
        PackageInfo packageInfo;
        String str3;
        ApplicationInfo applicationInfo;
        boolean z;
        bus c;
        g();
        h();
        aat.a(bvaVar);
        aat.a(bvaVar.a);
        if (!TextUtils.isEmpty(bvaVar.b) || !TextUtils.isEmpty(bvaVar.r)) {
            bqb b = d().b(bvaVar.a);
            if (b != null && TextUtils.isEmpty(b.c()) && !TextUtils.isEmpty(bvaVar.b)) {
                b.h(0L);
                d().a(b);
                b().d(bvaVar.a);
            }
            if (!bvaVar.h) {
                c(bvaVar);
                return;
            }
            long j3 = bvaVar.m;
            if (j3 == 0) {
                j3 = this.b.l().a();
            }
            if (this.b.e.d(bvaVar.a, blk.ah)) {
                this.b.j().g();
            }
            int i2 = bvaVar.n;
            if (i2 != 0 && i2 != 1) {
                this.b.q().f.a("Incorrect app type, assuming installed app. appId, appType", bpi.a(bvaVar.a), Integer.valueOf(i2));
                i2 = 0;
            }
            d().e();
            try {
                if (!this.b.e.d(bvaVar.a, blk.ah) || ((c = d().c(bvaVar.a, "_npa")) != null && !"auto".equals(c.b))) {
                    str = "_sysu";
                    i = 1;
                } else if (bvaVar.s != null) {
                    str = "_sysu";
                    i = 1;
                    buq buqVar = new buq("_npa", j3, Long.valueOf(bvaVar.s.booleanValue() ? 1L : 0L), "auto");
                    if (c == null || !c.e.equals(buqVar.c)) {
                        a(buqVar, bvaVar);
                    }
                } else {
                    str = "_sysu";
                    i = 1;
                    if (c != null) {
                        b(new buq("_npa", j3, null, "auto"), bvaVar);
                    }
                }
                bqb b2 = d().b(bvaVar.a);
                if (b2 != null) {
                    this.b.e();
                    if (buv.a(bvaVar.b, b2.c(), bvaVar.r, b2.d())) {
                        this.b.q().f.a("New GMP App Id passed in. Removing cached database data. appId", bpi.a(b2.a()));
                        bvk d = d();
                        String a2 = b2.a();
                        d.t();
                        d.c();
                        aat.a(a2);
                        try {
                            SQLiteDatabase x = d.x();
                            String[] strArr = new String[i];
                            strArr[0] = a2;
                            int delete = x.delete("events", "app_id=?", strArr) + 0 + x.delete("user_attributes", "app_id=?", strArr) + x.delete("conditional_properties", "app_id=?", strArr) + x.delete("apps", "app_id=?", strArr) + x.delete("raw_events", "app_id=?", strArr) + x.delete("raw_events_metadata", "app_id=?", strArr) + x.delete("event_filters", "app_id=?", strArr) + x.delete("property_filters", "app_id=?", strArr) + x.delete("audience_filter_values", "app_id=?", strArr);
                            if (delete > 0) {
                                d.q().k.a("Deleted application data. app, records", a2, Integer.valueOf(delete));
                            }
                        } catch (SQLiteException e) {
                            d.q().c.a("Error deleting application data. appId, error", bpi.a(a2), e);
                        }
                        b2 = null;
                    }
                }
                if (b2 != null) {
                    if (b2.j() != -2147483648L) {
                        if (b2.j() != bvaVar.j) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_pv", b2.i());
                            a(new bli("_au", new blh(bundle), "auto", j3), bvaVar);
                        }
                    } else if (b2.i() != null && !b2.i().equals(bvaVar.c)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("_pv", b2.i());
                        a(new bli("_au", new blh(bundle2), "auto", j3), bvaVar);
                    }
                }
                c(bvaVar);
                if (i2 == 0) {
                    bleVar = d().a(bvaVar.a, "_f");
                } else {
                    bleVar = i2 == i ? d().a(bvaVar.a, "_v") : null;
                }
                if (bleVar == null) {
                    long j4 = ((j3 / 3600000) + 1) * 3600000;
                    if (i2 == 0) {
                        str2 = "_et";
                        a(new buq("_fot", j3, Long.valueOf(j4), "auto"), bvaVar);
                        if (this.b.e.g(bvaVar.b)) {
                            g();
                            this.b.i.a(bvaVar.a);
                        }
                        g();
                        h();
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("_c", 1L);
                        bundle3.putLong("_r", 1L);
                        bundle3.putLong("_uwa", 0L);
                        bundle3.putLong("_pfo", 0L);
                        bundle3.putLong("_sys", 0L);
                        String str4 = str;
                        bundle3.putLong(str4, 0L);
                        if (this.b.e.k(bvaVar.a)) {
                            j2 = 1;
                            bundle3.putLong(str2, 1L);
                        } else {
                            j2 = 1;
                        }
                        if (bvaVar.q) {
                            bundle3.putLong("_dac", j2);
                        }
                        if (this.b.m().getPackageManager() == null) {
                            this.b.q().c.a("PackageManager is null, first open report might be inaccurate. appId", bpi.a(bvaVar.a));
                        } else {
                            try {
                                packageInfo = aep.a(this.b.m()).b(bvaVar.a, 0);
                            } catch (PackageManager.NameNotFoundException e2) {
                                this.b.q().c.a("Package info is null, first open report might be inaccurate. appId", bpi.a(bvaVar.a), e2);
                                packageInfo = null;
                            }
                            if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                str3 = str4;
                            } else {
                                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                    bundle3.putLong("_uwa", 1L);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                str3 = str4;
                                a(new buq("_fi", j3, Long.valueOf(z ? 1L : 0L), "auto"), bvaVar);
                            }
                            try {
                                applicationInfo = aep.a(this.b.m()).a(bvaVar.a, 0);
                            } catch (PackageManager.NameNotFoundException e3) {
                                this.b.q().c.a("Application info is null, first open report might be inaccurate. appId", bpi.a(bvaVar.a), e3);
                                applicationInfo = null;
                            }
                            if (applicationInfo != null) {
                                if ((applicationInfo.flags & 1) != 0) {
                                    bundle3.putLong("_sys", 1L);
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle3.putLong(str3, 1L);
                                }
                            }
                        }
                        bvk d2 = d();
                        String str5 = bvaVar.a;
                        aat.a(str5);
                        d2.c();
                        d2.t();
                        long h = d2.h(str5, "first_open_count");
                        if (h >= 0) {
                            bundle3.putLong("_pfo", h);
                        }
                        a(new bli("_f", new blh(bundle3), "auto", j3), bvaVar);
                    } else {
                        str2 = "_et";
                        if (i2 == 1) {
                            a(new buq("_fvt", j3, Long.valueOf(j4), "auto"), bvaVar);
                            g();
                            h();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("_c", 1L);
                            bundle4.putLong("_r", 1L);
                            if (this.b.e.k(bvaVar.a)) {
                                j = 1;
                                bundle4.putLong(str2, 1L);
                            } else {
                                j = 1;
                            }
                            if (bvaVar.q) {
                                bundle4.putLong("_dac", j);
                            }
                            a(new bli("_v", new blh(bundle4), "auto", j3), bvaVar);
                        }
                    }
                    if (!this.b.e.d(bvaVar.a, blk.ag)) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong(str2, 1L);
                        if (this.b.e.k(bvaVar.a)) {
                            bundle5.putLong("_fr", 1L);
                        }
                        a(new bli("_e", new blh(bundle5), "auto", j3), bvaVar);
                    }
                } else if (bvaVar.i) {
                    a(new bli("_cd", new blh(new Bundle()), "auto", j3), bvaVar);
                }
                d().v();
            } finally {
                d().w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bva a(String str) {
        bqb b = d().b(str);
        if (b == null || TextUtils.isEmpty(b.i())) {
            this.b.q().j.a("No app data available; dropping", str);
            return null;
        }
        Boolean b2 = b(b);
        if (b2 != null && !b2.booleanValue()) {
            this.b.q().c.a("App version does not match; dropping. appId", bpi.a(str));
            return null;
        }
        return new bva(str, b.c(), b.i(), b.j(), b.k(), b.l(), b.m(), (String) null, b.o(), false, b.f(), b.u(), 0L, 0, b.v(), b.w(), false, b.d(), b.x(), b.n(), b.y());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bvd bvdVar, bva bvaVar) {
        aat.a(bvdVar);
        aat.a(bvdVar.a);
        aat.a(bvdVar.b);
        aat.a(bvdVar.c);
        aat.a(bvdVar.c.a);
        g();
        h();
        if (!TextUtils.isEmpty(bvaVar.b) || !TextUtils.isEmpty(bvaVar.r)) {
            if (!bvaVar.h) {
                c(bvaVar);
                return;
            }
            bvd bvdVar2 = new bvd(bvdVar);
            boolean z = false;
            bvdVar2.e = false;
            d().e();
            try {
                bvd d = d().d(bvdVar2.a, bvdVar2.c.a);
                if (d != null && !d.b.equals(bvdVar2.b)) {
                    this.b.q().f.a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.b.f().c(bvdVar2.c.a), bvdVar2.b, d.b);
                }
                if (d != null && d.e) {
                    bvdVar2.b = d.b;
                    bvdVar2.d = d.d;
                    bvdVar2.h = d.h;
                    bvdVar2.f = d.f;
                    bvdVar2.i = d.i;
                    bvdVar2.e = d.e;
                    bvdVar2.c = new buq(bvdVar2.c.a, d.c.b, bvdVar2.c.a(), d.c.e);
                } else if (TextUtils.isEmpty(bvdVar2.f)) {
                    bvdVar2.c = new buq(bvdVar2.c.a, bvdVar2.d, bvdVar2.c.a(), bvdVar2.c.e);
                    bvdVar2.e = true;
                    z = true;
                }
                if (bvdVar2.e) {
                    buq buqVar = bvdVar2.c;
                    bus busVar = new bus(bvdVar2.a, bvdVar2.b, buqVar.a, buqVar.b, buqVar.a());
                    if (d().a(busVar)) {
                        this.b.q().j.a("User property updated immediately", bvdVar2.a, this.b.f().c(busVar.c), busVar.e);
                    } else {
                        this.b.q().c.a("(2)Too many active user properties, ignoring", bpi.a(bvdVar2.a), this.b.f().c(busVar.c), busVar.e);
                    }
                    if (z && bvdVar2.i != null) {
                        b(new bli(bvdVar2.i, bvdVar2.d), bvaVar);
                    }
                }
                if (d().a(bvdVar2)) {
                    this.b.q().j.a("Conditional property added", bvdVar2.a, this.b.f().c(bvdVar2.c.a), bvdVar2.c.a());
                } else {
                    this.b.q().c.a("Too many conditional properties, ignoring", bpi.a(bvdVar2.a), this.b.f().c(bvdVar2.c.a), bvdVar2.c.a());
                }
                d().v();
            } finally {
                d().w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(bvd bvdVar, bva bvaVar) {
        aat.a(bvdVar);
        aat.a(bvdVar.a);
        aat.a(bvdVar.c);
        aat.a(bvdVar.c.a);
        g();
        h();
        if (!TextUtils.isEmpty(bvaVar.b) || !TextUtils.isEmpty(bvaVar.r)) {
            if (!bvaVar.h) {
                c(bvaVar);
                return;
            }
            d().e();
            try {
                c(bvaVar);
                bvd d = d().d(bvdVar.a, bvdVar.c.a);
                if (d != null) {
                    this.b.q().j.a("Removing conditional user property", bvdVar.a, this.b.f().c(bvdVar.c.a));
                    d().e(bvdVar.a, bvdVar.c.a);
                    if (d.e) {
                        d().b(bvdVar.a, bvdVar.c.a);
                    }
                    if (bvdVar.k != null) {
                        Bundle bundle = null;
                        if (bvdVar.k.b != null) {
                            bundle = bvdVar.k.b.a();
                        }
                        b(this.b.e().a(bvdVar.a, bvdVar.k.a, bundle, d.b, bvdVar.k.d), bvaVar);
                    }
                } else {
                    this.b.q().f.a("Conditional user property doesn't exist", bpi.a(bvdVar.a), this.b.f().c(bvdVar.c.a));
                }
                d().v();
            } finally {
                d().w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bqb c(defpackage.bva r11) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buj.c(bva):bqb");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(bva bvaVar) {
        try {
            return (String) this.b.p().a(new bun(this, bvaVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.b.q().c.a("Failed to get app instance id. appId", bpi.a(bvaVar.a), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(buj bujVar) {
        bujVar.b.p().c();
        bvk bvkVar = new bvk(bujVar);
        bvkVar.u();
        bujVar.i = bvkVar;
        bujVar.b.e.a = bujVar.g;
        bvc bvcVar = new bvc(bujVar);
        bvcVar.u();
        bujVar.l = bvcVar;
        bsr bsrVar = new bsr(bujVar);
        bsrVar.u();
        bujVar.a = bsrVar;
        buf bufVar = new buf(bujVar);
        bufVar.u();
        bujVar.k = bufVar;
        bujVar.j = new bpo(bujVar);
        if (bujVar.d != bujVar.e) {
            bujVar.b.q().c.a("Not all upload components initialized", Integer.valueOf(bujVar.d), Integer.valueOf(bujVar.e));
        }
        bujVar.n = true;
    }
}
