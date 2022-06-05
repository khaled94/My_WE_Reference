package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;

/* renamed from: bpe  reason: default package */
/* loaded from: classes2.dex */
public final class bpe extends brc {
    private final bpd a = new bpd(this, m(), "google_app_measurement_local.db");
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpe(bql bqlVar) {
        super(bqlVar);
    }

    @Override // defpackage.brc
    protected final boolean t() {
        return false;
    }

    public final void v() {
        c();
        try {
            int delete = y().delete("messages", null, null) + 0;
            if (delete <= 0) {
                return;
            }
            q().k.a("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            q().c.a("Error resetting local analytics data. error", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpe.a(int, byte[]):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(4:189|47|(7:215|49|175|50|212|51|(3:210|53|224)(1:223))(3:211|59|(6:216|61|182|62|63|(3:214|68|227)(1:226))(2:213|(6:220|72|177|73|74|(3:218|79|229)(1:228))(3:217|82|(3:221|84|230)(3:219|85|231))))|222)|181|45) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d3, code lost:
        r13 = r23;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0254 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.abb> w() {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpe.w():java.util.List");
    }

    public final boolean x() {
        c();
        if (!this.b && z()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase y = y();
                        if (y == null) {
                            this.b = true;
                            if (y != null) {
                                y.close();
                            }
                            return false;
                        }
                        y.beginTransaction();
                        y.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        y.setTransactionSuccessful();
                        y.endTransaction();
                        if (y != null) {
                            y.close();
                        }
                        return true;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e) {
                    q().c.a("Error deleting app launch break from local database", e);
                    this.b = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    q().c.a("Error deleting app launch break from local database", e2);
                    this.b = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            q().f.a("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    private static long a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1L;
            }
            cursor.close();
            return -1L;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final SQLiteDatabase y() throws SQLiteException {
        if (this.b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.b = true;
        return null;
    }

    private final boolean z() {
        return m().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bkz d() {
        return super.d();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ brs e() {
        return super.e();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bpa f() {
        return super.f();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bsx g() {
        return super.g();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bss h() {
        return super.h();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bpe i() {
        return super.i();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bty j() {
        return super.j();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ blc k() {
        return super.k();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ ady l() {
        return super.l();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpg n() {
        return super.n();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ buv o() {
        return super.o();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bqe p() {
        return super.p();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bpi q() {
        return super.q();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpq r() {
        return super.r();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bvf s() {
        return super.s();
    }
}
