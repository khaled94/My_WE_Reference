package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import defpackage.apn;
import defpackage.apv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bvk  reason: default package */
/* loaded from: classes2.dex */
public final class bvk extends buk {
    private static final String[] a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] c = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] d = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"};
    private static final String[] e = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] f = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] g = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] h = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] i = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final bug k = new bug(l());
    private final bvl j = new bvl(this, m(), "google_app_measurement.db");

    /* JADX INFO: Access modifiers changed from: package-private */
    public bvk(buj bujVar) {
        super(bujVar);
    }

    @Override // defpackage.buk
    protected final boolean d() {
        return false;
    }

    public final void e() {
        t();
        x().beginTransaction();
    }

    public final void v() {
        t();
        x().setTransactionSuccessful();
    }

    public final void w() {
        t();
        x().endTransaction();
    }

    private final long b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = x().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                q().c.a("Database error", str, e2);
                throw e2;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final long a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = x().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e2) {
                q().c.a("Database error", str, e2);
                throw e2;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase x() {
        c();
        try {
            return this.j.getWritableDatabase();
        } catch (SQLiteException e2) {
            q().f.a("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ble a(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.a(java.lang.String, java.lang.String):ble");
    }

    public final void a(ble bleVar) {
        aat.a(bleVar);
        c();
        t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", bleVar.a);
        contentValues.put("name", bleVar.b);
        contentValues.put("lifetime_count", Long.valueOf(bleVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(bleVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(bleVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(bleVar.g));
        contentValues.put("last_bundled_day", bleVar.h);
        contentValues.put("last_sampled_complex_event_id", bleVar.i);
        contentValues.put("last_sampling_rate", bleVar.j);
        if (s().d(bleVar.a, blk.aw)) {
            contentValues.put("current_session_count", Long.valueOf(bleVar.e));
        }
        contentValues.put("last_exempt_from_sampling", (bleVar.k == null || !bleVar.k.booleanValue()) ? null : 1L);
        try {
            if (x().insertWithOnConflict("events", null, contentValues, 5) != -1) {
                return;
            }
            q().c.a("Failed to insert/update event aggregates (got -1). appId", bpi.a(bleVar.a));
        } catch (SQLiteException e2) {
            q().c.a("Error storing event aggregates. appId", bpi.a(bleVar.a), e2);
        }
    }

    public final void b(String str, String str2) {
        aat.a(str);
        aat.a(str2);
        c();
        t();
        try {
            q().k.a("Deleted user attribute rows", Integer.valueOf(x().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e2) {
            q().c.a("Error deleting user attribute. appId", bpi.a(str), n().c(str2), e2);
        }
    }

    public final boolean a(bus busVar) {
        aat.a(busVar);
        c();
        t();
        if (c(busVar.a, busVar.c) == null) {
            if (buv.a(busVar.c)) {
                if (b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{busVar.a}) >= 25) {
                    return false;
                }
            } else if (s().d(busVar.a, blk.ah)) {
                if (!"_npa".equals(busVar.c) && b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{busVar.a, busVar.b}) >= 25) {
                    return false;
                }
            } else if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{busVar.a, busVar.b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", busVar.a);
        contentValues.put("origin", busVar.b);
        contentValues.put("name", busVar.c);
        contentValues.put("set_timestamp", Long.valueOf(busVar.d));
        a(contentValues, "value", busVar.e);
        try {
            if (x().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                q().c.a("Failed to insert/update user property (got -1). appId", bpi.a(busVar.a));
            }
        } catch (SQLiteException e2) {
            q().c.a("Error storing user property. appId", bpi.a(busVar.a), e2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bus c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            defpackage.aat.a(r19)
            defpackage.aat.a(r20)
            r18.c()
            r18.t()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.x()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L80
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L80
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L80
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L80
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L80
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L80
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L78
            if (r3 != 0) goto L3f
            if (r10 == 0) goto L3e
            r10.close()
        L3e:
            return r9
        L3f:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L78
            r11 = r18
            java.lang.Object r7 = r11.a(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> La1
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> La1
            bus r0 = new bus     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> La1
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> La1
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> La1
            if (r1 == 0) goto L6c
            bpi r1 = r18.q()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> La1
            bpk r1 = r1.c     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> La1
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = defpackage.bpi.a(r19)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> La1
            r1.a(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> La1
        L6c:
            if (r10 == 0) goto L71
            r10.close()
        L71:
            return r0
        L72:
            r0 = move-exception
            goto L84
        L74:
            r0 = move-exception
            r11 = r18
            goto La2
        L78:
            r0 = move-exception
            r11 = r18
            goto L84
        L7c:
            r0 = move-exception
            r11 = r18
            goto La3
        L80:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L84:
            bpi r1 = r18.q()     // Catch: java.lang.Throwable -> La1
            bpk r1 = r1.c     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = defpackage.bpi.a(r19)     // Catch: java.lang.Throwable -> La1
            bpg r4 = r18.n()     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = r4.c(r8)     // Catch: java.lang.Throwable -> La1
            r1.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La1
            if (r10 == 0) goto La0
            r10.close()
        La0:
            return r9
        La1:
            r0 = move-exception
        La2:
            r9 = r10
        La3:
            if (r9 == 0) goto La8
            r9.close()
        La8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.c(java.lang.String, java.lang.String):bus");
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009a: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:30:0x009a */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.bus> a(java.lang.String r14) {
        /*
            r13 = this;
            defpackage.aat.a(r14)
            r13.c()
            r13.t()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.x()     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            r12 = 0
            r6[r12] = r14     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            boolean r3 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            if (r3 != 0) goto L3f
            if (r2 == 0) goto L3e
            r2.close()
        L3e:
            return r0
        L3f:
            java.lang.String r7 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            java.lang.String r3 = r2.getString(r11)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            if (r3 != 0) goto L4b
            java.lang.String r3 = ""
        L4b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            r3 = 3
            java.lang.Object r10 = r13.a(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            if (r10 != 0) goto L68
            bpi r3 = r13.q()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            bpk r3 = r3.c     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = defpackage.bpi.a(r14)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            r3.a(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            goto L72
        L68:
            bus r3 = new bus     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            r0.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
        L72:
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L99
            if (r3 != 0) goto L3f
            if (r2 == 0) goto L7d
            r2.close()
        L7d:
            return r0
        L7e:
            r0 = move-exception
            goto L84
        L80:
            r14 = move-exception
            goto L9b
        L82:
            r0 = move-exception
            r2 = r1
        L84:
            bpi r3 = r13.q()     // Catch: java.lang.Throwable -> L99
            bpk r3 = r3.c     // Catch: java.lang.Throwable -> L99
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = defpackage.bpi.a(r14)     // Catch: java.lang.Throwable -> L99
            r3.a(r4, r14, r0)     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L98
            r2.close()
        L98:
            return r1
        L99:
            r14 = move-exception
            r1 = r2
        L9b:
            if (r1 == 0) goto La0
            r1.close()
        La0:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.a(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        q().c.a("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.bus> a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean a(bvd bvdVar) {
        aat.a(bvdVar);
        c();
        t();
        if (c(bvdVar.a, bvdVar.c.a) != null || b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{bvdVar.a}) < 1000) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", bvdVar.a);
            contentValues.put("origin", bvdVar.b);
            contentValues.put("name", bvdVar.c.a);
            a(contentValues, "value", bvdVar.c.a());
            contentValues.put("active", Boolean.valueOf(bvdVar.e));
            contentValues.put("trigger_event_name", bvdVar.f);
            contentValues.put("trigger_timeout", Long.valueOf(bvdVar.h));
            o();
            contentValues.put("timed_out_event", buv.a((Parcelable) bvdVar.g));
            contentValues.put("creation_timestamp", Long.valueOf(bvdVar.d));
            o();
            contentValues.put("triggered_event", buv.a((Parcelable) bvdVar.i));
            contentValues.put("triggered_timestamp", Long.valueOf(bvdVar.c.b));
            contentValues.put("time_to_live", Long.valueOf(bvdVar.j));
            o();
            contentValues.put("expired_event", buv.a((Parcelable) bvdVar.k));
            try {
                if (x().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                    q().c.a("Failed to insert/update conditional user property (got -1)", bpi.a(bvdVar.a));
                }
            } catch (SQLiteException e2) {
                q().c.a("Error storing conditional user property", bpi.a(bvdVar.a), e2);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bvd d(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.d(java.lang.String, java.lang.String):bvd");
    }

    public final int e(String str, String str2) {
        aat.a(str);
        aat.a(str2);
        c();
        t();
        try {
            return x().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            q().c.a("Error deleting conditional property", bpi.a(str), n().c(str2), e2);
            return 0;
        }
    }

    public final List<bvd> b(String str, String str2, String str3) {
        aat.a(str);
        c();
        t();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        q().c.a("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.bvd> a(java.lang.String r25, java.lang.String[] r26) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.a(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0173 A[Catch: SQLiteException -> 0x027c, all -> 0x02a3, TryCatch #1 {all -> 0x02a3, blocks: (B:11:0x006d, B:13:0x00cc, B:18:0x00d6, B:22:0x00f3, B:26:0x0112, B:30:0x0131, B:34:0x0150, B:37:0x0173, B:38:0x0178, B:42:0x019e, B:46:0x01bd, B:49:0x01d7, B:50:0x01db, B:52:0x01e6, B:57:0x01f0, B:59:0x01fb, B:64:0x0205, B:67:0x021a, B:68:0x021e, B:70:0x0229, B:72:0x0249, B:74:0x024d, B:76:0x0254, B:77:0x0256, B:79:0x0267, B:92:0x028e), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d7 A[Catch: SQLiteException -> 0x027c, all -> 0x02a3, TryCatch #1 {all -> 0x02a3, blocks: (B:11:0x006d, B:13:0x00cc, B:18:0x00d6, B:22:0x00f3, B:26:0x0112, B:30:0x0131, B:34:0x0150, B:37:0x0173, B:38:0x0178, B:42:0x019e, B:46:0x01bd, B:49:0x01d7, B:50:0x01db, B:52:0x01e6, B:57:0x01f0, B:59:0x01fb, B:64:0x0205, B:67:0x021a, B:68:0x021e, B:70:0x0229, B:72:0x0249, B:74:0x024d, B:76:0x0254, B:77:0x0256, B:79:0x0267, B:92:0x028e), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fb A[Catch: SQLiteException -> 0x027c, all -> 0x02a3, TryCatch #1 {all -> 0x02a3, blocks: (B:11:0x006d, B:13:0x00cc, B:18:0x00d6, B:22:0x00f3, B:26:0x0112, B:30:0x0131, B:34:0x0150, B:37:0x0173, B:38:0x0178, B:42:0x019e, B:46:0x01bd, B:49:0x01d7, B:50:0x01db, B:52:0x01e6, B:57:0x01f0, B:59:0x01fb, B:64:0x0205, B:67:0x021a, B:68:0x021e, B:70:0x0229, B:72:0x0249, B:74:0x024d, B:76:0x0254, B:77:0x0256, B:79:0x0267, B:92:0x028e), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021a A[Catch: SQLiteException -> 0x027c, all -> 0x02a3, TryCatch #1 {all -> 0x02a3, blocks: (B:11:0x006d, B:13:0x00cc, B:18:0x00d6, B:22:0x00f3, B:26:0x0112, B:30:0x0131, B:34:0x0150, B:37:0x0173, B:38:0x0178, B:42:0x019e, B:46:0x01bd, B:49:0x01d7, B:50:0x01db, B:52:0x01e6, B:57:0x01f0, B:59:0x01fb, B:64:0x0205, B:67:0x021a, B:68:0x021e, B:70:0x0229, B:72:0x0249, B:74:0x024d, B:76:0x0254, B:77:0x0256, B:79:0x0267, B:92:0x028e), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0229 A[Catch: SQLiteException -> 0x027c, all -> 0x02a3, TryCatch #1 {all -> 0x02a3, blocks: (B:11:0x006d, B:13:0x00cc, B:18:0x00d6, B:22:0x00f3, B:26:0x0112, B:30:0x0131, B:34:0x0150, B:37:0x0173, B:38:0x0178, B:42:0x019e, B:46:0x01bd, B:49:0x01d7, B:50:0x01db, B:52:0x01e6, B:57:0x01f0, B:59:0x01fb, B:64:0x0205, B:67:0x021a, B:68:0x021e, B:70:0x0229, B:72:0x0249, B:74:0x024d, B:76:0x0254, B:77:0x0256, B:79:0x0267, B:92:0x028e), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0267 A[Catch: SQLiteException -> 0x027c, all -> 0x02a3, TRY_LEAVE, TryCatch #1 {all -> 0x02a3, blocks: (B:11:0x006d, B:13:0x00cc, B:18:0x00d6, B:22:0x00f3, B:26:0x0112, B:30:0x0131, B:34:0x0150, B:37:0x0173, B:38:0x0178, B:42:0x019e, B:46:0x01bd, B:49:0x01d7, B:50:0x01db, B:52:0x01e6, B:57:0x01f0, B:59:0x01fb, B:64:0x0205, B:67:0x021a, B:68:0x021e, B:70:0x0229, B:72:0x0249, B:74:0x024d, B:76:0x0254, B:77:0x0256, B:79:0x0267, B:92:0x028e), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bqb b(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.b(java.lang.String):bqb");
    }

    public final void a(bqb bqbVar) {
        aat.a(bqbVar);
        c();
        t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", bqbVar.a());
        contentValues.put("app_instance_id", bqbVar.b());
        contentValues.put("gmp_app_id", bqbVar.c());
        contentValues.put("resettable_device_id_hash", bqbVar.e());
        contentValues.put("last_bundle_index", Long.valueOf(bqbVar.p()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(bqbVar.g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(bqbVar.h()));
        contentValues.put("app_version", bqbVar.i());
        contentValues.put("app_store", bqbVar.k());
        contentValues.put("gmp_version", Long.valueOf(bqbVar.l()));
        contentValues.put("dev_cert_hash", Long.valueOf(bqbVar.m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(bqbVar.o()));
        bqbVar.a.p().c();
        contentValues.put("day", Long.valueOf(bqbVar.c));
        bqbVar.a.p().c();
        contentValues.put("daily_public_events_count", Long.valueOf(bqbVar.d));
        bqbVar.a.p().c();
        contentValues.put("daily_events_count", Long.valueOf(bqbVar.e));
        bqbVar.a.p().c();
        contentValues.put("daily_conversions_count", Long.valueOf(bqbVar.f));
        contentValues.put("config_fetched_time", Long.valueOf(bqbVar.q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(bqbVar.r()));
        contentValues.put("app_version_int", Long.valueOf(bqbVar.j()));
        contentValues.put("firebase_instance_id", bqbVar.f());
        bqbVar.a.p().c();
        contentValues.put("daily_error_events_count", Long.valueOf(bqbVar.g));
        bqbVar.a.p().c();
        contentValues.put("daily_realtime_events_count", Long.valueOf(bqbVar.h));
        contentValues.put("health_monitor_sample", bqbVar.t());
        contentValues.put("android_id", Long.valueOf(bqbVar.u()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(bqbVar.v()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(bqbVar.w()));
        contentValues.put("admob_app_id", bqbVar.d());
        contentValues.put("dynamite_version", Long.valueOf(bqbVar.n()));
        if (bqbVar.y() != null) {
            if (bqbVar.y().size() == 0) {
                q().f.a("Safelisted events should not be an empty list. appId", bqbVar.a());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", bqbVar.y()));
            }
        }
        try {
            SQLiteDatabase x = x();
            if (x.update("apps", contentValues, "app_id = ?", new String[]{bqbVar.a()}) != 0 || x.insertWithOnConflict("apps", null, contentValues, 5) != -1) {
                return;
            }
            q().c.a("Failed to insert/update app (got -1). appId", bpi.a(bqbVar.a()));
        } catch (SQLiteException e2) {
            q().c.a("Error storing app. appId", bpi.a(bqbVar.a()), e2);
        }
    }

    public final long c(String str) {
        aat.a(str);
        c();
        t();
        try {
            return x().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, s().b(str, blk.s))))});
        } catch (SQLiteException e2) {
            q().c.a("Error deleting over the limit events. appId", bpi.a(str), e2);
            return 0L;
        }
    }

    public final bvj a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        aat.a(str);
        c();
        t();
        String[] strArr = {str};
        bvj bvjVar = new bvj();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase x = x();
                Cursor query = x.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    q().f.a("Not updating daily counts, app is not known. appId", bpi.a(str));
                    if (query != null) {
                        query.close();
                    }
                    return bvjVar;
                }
                if (query.getLong(0) == j) {
                    bvjVar.b = query.getLong(1);
                    bvjVar.a = query.getLong(2);
                    bvjVar.c = query.getLong(3);
                    bvjVar.d = query.getLong(4);
                    bvjVar.e = query.getLong(5);
                }
                if (z) {
                    bvjVar.b++;
                }
                if (z2) {
                    bvjVar.a++;
                }
                if (z3) {
                    bvjVar.c++;
                }
                if (z4) {
                    bvjVar.d++;
                }
                if (z5) {
                    bvjVar.e++;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(bvjVar.a));
                contentValues.put("daily_events_count", Long.valueOf(bvjVar.b));
                contentValues.put("daily_conversions_count", Long.valueOf(bvjVar.c));
                contentValues.put("daily_error_events_count", Long.valueOf(bvjVar.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(bvjVar.e));
                x.update("apps", contentValues, "app_id=?", strArr);
                if (query != null) {
                    query.close();
                }
                return bvjVar;
            } catch (SQLiteException e2) {
                q().c.a("Error updating daily counts. appId", bpi.a(str), e2);
                if (0 != 0) {
                    cursor.close();
                }
                return bvjVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] d(java.lang.String r11) {
        /*
            r10 = this;
            defpackage.aat.a(r11)
            r10.c()
            r10.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.x()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteException -> L54
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteException -> L54
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteException -> L54
            r9 = 0
            r5[r9] = r11     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteException -> L54
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteException -> L54
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L50 java.lang.Throwable -> L6b
            if (r2 != 0) goto L31
            if (r1 == 0) goto L30
            r1.close()
        L30:
            return r0
        L31:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L50 java.lang.Throwable -> L6b
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L50 java.lang.Throwable -> L6b
            if (r3 == 0) goto L4a
            bpi r3 = r10.q()     // Catch: android.database.sqlite.SQLiteException -> L50 java.lang.Throwable -> L6b
            bpk r3 = r3.c     // Catch: android.database.sqlite.SQLiteException -> L50 java.lang.Throwable -> L6b
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = defpackage.bpi.a(r11)     // Catch: android.database.sqlite.SQLiteException -> L50 java.lang.Throwable -> L6b
            r3.a(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L50 java.lang.Throwable -> L6b
        L4a:
            if (r1 == 0) goto L4f
            r1.close()
        L4f:
            return r2
        L50:
            r2 = move-exception
            goto L56
        L52:
            r11 = move-exception
            goto L6d
        L54:
            r2 = move-exception
            r1 = r0
        L56:
            bpi r3 = r10.q()     // Catch: java.lang.Throwable -> L6b
            bpk r3 = r3.c     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = defpackage.bpi.a(r11)     // Catch: java.lang.Throwable -> L6b
            r3.a(r4, r11, r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6a
            r1.close()
        L6a:
            return r0
        L6b:
            r11 = move-exception
            r0 = r1
        L6d:
            if (r0 == 0) goto L72
            r0.close()
        L72:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.d(java.lang.String):byte[]");
    }

    public final boolean a(apv.g gVar, boolean z) {
        c();
        t();
        aat.a(gVar);
        aat.a(gVar.zzxm);
        aat.b(gVar.a());
        A();
        long a2 = l().a();
        if (gVar.zzxd < a2 - bvf.h() || gVar.zzxd > bvf.h() + a2) {
            q().f.a("Storing bundle outside of the max uploading time span. appId, now, timestamp", bpi.a(gVar.zzxm), Long.valueOf(a2), Long.valueOf(gVar.zzxd));
        }
        try {
            byte[] c2 = f().c(gVar.i());
            q().k.a("Saving bundle, size", Integer.valueOf(c2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", gVar.zzxm);
            contentValues.put("bundle_end_timestamp", Long.valueOf(gVar.zzxd));
            contentValues.put("data", c2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (gVar.b()) {
                contentValues.put("retry_count", Integer.valueOf(gVar.zzyi));
            }
            try {
                if (x().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                q().c.a("Failed to insert bundle (got -1). appId", bpi.a(gVar.zzxm));
                return false;
            } catch (SQLiteException e2) {
                q().c.a("Error storing bundle. appId", bpi.a(gVar.zzxm), e2);
                return false;
            }
        } catch (IOException e3) {
            q().c.a("Data loss. Failed to serialize bundle. appId", bpi.a(gVar.zzxm), e3);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String y() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.x()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3c
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3c
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            bpi r3 = r6.q()     // Catch: java.lang.Throwable -> L3c
            bpk r3 = r3.c     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r2)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            r1 = move-exception
        L3d:
            if (r0 == 0) goto L42
            r0.close()
        L42:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.y():java.lang.String");
    }

    public final boolean z() {
        return b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final List<Pair<apv.g, Long>> a(String str, int i2, int i3) {
        byte[] b;
        c();
        t();
        aat.a(i2 > 0);
        aat.a(i3 > 0);
        aat.a(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = x().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
                if (!query.moveToFirst()) {
                    List<Pair<apv.g, Long>> emptyList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                do {
                    long j = query.getLong(0);
                    try {
                        b = f().b(query.getBlob(1));
                    } catch (IOException e2) {
                        q().c.a("Failed to unzip queued bundle. appId", bpi.a(str), e2);
                    }
                    if (!arrayList.isEmpty() && b.length + i4 > i3) {
                        break;
                    }
                    try {
                        apv.g.a aVar = (apv.g.a) apv.g.c().a(b, asn.b());
                        if (!query.isNull(2)) {
                            aVar.g(query.getInt(2));
                        }
                        i4 += b.length;
                        arrayList.add(Pair.create((apv.g) ((ata) aVar.v()), Long.valueOf(j)));
                    } catch (IOException e3) {
                        q().c.a("Failed to merge queued bundle. appId", bpi.a(str), e3);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i4 <= i3);
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e4) {
                q().c.a("Error querying bundles. appId", bpi.a(str), e4);
                List<Pair<apv.g, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A() {
        int delete;
        c();
        t();
        if (!O()) {
            return;
        }
        long a2 = r().g.a();
        long b = l().b();
        if (Math.abs(b - a2) <= blk.B.a(null).longValue()) {
            return;
        }
        r().g.a(b);
        c();
        t();
        if (!O() || (delete = x().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(l().a()), String.valueOf(bvf.h())})) <= 0) {
            return;
        }
        q().k.a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(List<Long> list) {
        c();
        t();
        aat.a(list);
        if (list.size() != 0) {
            if (!O()) {
                return;
            }
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (b(sb3.toString(), (String[]) null) > 0) {
                q().f.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase x = x();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                x.execSQL(sb4.toString());
                return;
            } catch (SQLiteException e2) {
                q().c.a("Error incrementing retry count. error", e2);
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, apy[] apyVarArr) {
        boolean z;
        t();
        c();
        aat.a(str);
        aat.a(apyVarArr);
        SQLiteDatabase x = x();
        x.beginTransaction();
        try {
            t();
            c();
            aat.a(str);
            SQLiteDatabase x2 = x();
            x2.delete("property_filters", "app_id=?", new String[]{str});
            x2.delete("event_filters", "app_id=?", new String[]{str});
            for (apy apyVar : apyVarArr) {
                t();
                c();
                aat.a(str);
                aat.a(apyVar);
                aat.a(apyVar.c);
                aat.a(apyVar.b);
                if (apyVar.a == null) {
                    q().f.a("Audience with no ID. appId", bpi.a(str));
                } else {
                    int intValue = apyVar.a.intValue();
                    apn.a[] aVarArr = apyVar.c;
                    int length = aVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (!aVarArr[i2].a()) {
                                q().f.a("Event filter with no ID. Audience definition ignored. appId, audienceId", bpi.a(str), apyVar.a);
                                break;
                            }
                            i2++;
                        } else {
                            apn.d[] dVarArr = apyVar.b;
                            int length2 = dVarArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length2) {
                                    if (!dVarArr[i3].a()) {
                                        q().f.a("Property filter with no ID. Audience definition ignored. appId, audienceId", bpi.a(str), apyVar.a);
                                        break;
                                    }
                                    i3++;
                                } else {
                                    apn.a[] aVarArr2 = apyVar.c;
                                    int length3 = aVarArr2.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= length3) {
                                            z = true;
                                            break;
                                        } else if (!a(str, intValue, aVarArr2[i4])) {
                                            z = false;
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (z) {
                                        apn.d[] dVarArr2 = apyVar.b;
                                        int length4 = dVarArr2.length;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= length4) {
                                                break;
                                            } else if (!a(str, intValue, dVarArr2[i5])) {
                                                z = false;
                                                break;
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        t();
                                        c();
                                        aat.a(str);
                                        SQLiteDatabase x3 = x();
                                        x3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                        x3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (apy apyVar2 : apyVarArr) {
                arrayList.add(apyVar2.a);
            }
            a(str, arrayList);
            x.setTransactionSuccessful();
        } finally {
            x.endTransaction();
        }
    }

    private final boolean a(String str, int i2, apn.a aVar) {
        t();
        c();
        aat.a(str);
        aat.a(aVar);
        Integer num = null;
        if (!TextUtils.isEmpty(aVar.zzug)) {
            byte[] i3 = aVar.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i2));
            contentValues.put("filter_id", aVar.a() ? Integer.valueOf(aVar.zzuf) : null);
            contentValues.put("event_name", aVar.zzug);
            if (s().d(str, blk.av)) {
                contentValues.put("session_scoped", (aVar.zzue & 64) != 0 ? Boolean.valueOf(aVar.zzum) : null);
            }
            contentValues.put("data", i3);
            try {
                if (x().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    q().c.a("Failed to insert event filter (got -1). appId", bpi.a(str));
                }
                return true;
            } catch (SQLiteException e2) {
                q().c.a("Error storing event filter. appId", bpi.a(str), e2);
                return false;
            }
        }
        bpk bpkVar = q().f;
        Object a2 = bpi.a(str);
        Integer valueOf = Integer.valueOf(i2);
        if (aVar.a()) {
            num = Integer.valueOf(aVar.zzuf);
        }
        bpkVar.a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a2, valueOf, String.valueOf(num));
        return false;
    }

    private final boolean a(String str, int i2, apn.d dVar) {
        t();
        c();
        aat.a(str);
        aat.a(dVar);
        Integer num = null;
        if (!TextUtils.isEmpty(dVar.zzvh)) {
            byte[] i3 = dVar.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i2));
            contentValues.put("filter_id", dVar.a() ? Integer.valueOf(dVar.zzuf) : null);
            contentValues.put("property_name", dVar.zzvh);
            if (s().d(str, blk.av)) {
                contentValues.put("session_scoped", (dVar.zzue & 32) != 0 ? Boolean.valueOf(dVar.zzum) : null);
            }
            contentValues.put("data", i3);
            try {
                if (x().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                q().c.a("Failed to insert property filter (got -1). appId", bpi.a(str));
                return false;
            } catch (SQLiteException e2) {
                q().c.a("Error storing property filter. appId", bpi.a(str), e2);
                return false;
            }
        }
        bpk bpkVar = q().f;
        Object a2 = bpi.a(str);
        Integer valueOf = Integer.valueOf(i2);
        if (dVar.a()) {
            num = Integer.valueOf(dVar.zzuf);
        }
        bpkVar.a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a2, valueOf, String.valueOf(num));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<defpackage.apn.a>> f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.t()
            r12.c()
            defpackage.aat.a(r13)
            defpackage.aat.a(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.x()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            if (r1 != 0) goto L42
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            if (r14 == 0) goto L41
            r14.close()
        L41:
            return r13
        L42:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            asn r2 = defpackage.asn.b()     // Catch: java.io.IOException -> L6e android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            apn$a r1 = defpackage.apn.a.a(r1, r2)     // Catch: java.io.IOException -> L6e android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            if (r3 != 0) goto L6a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
        L6a:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            goto L7e
        L6e:
            r1 = move-exception
            bpi r2 = r12.q()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            bpk r2 = r2.c     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = defpackage.bpi.a(r13)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            r2.a(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
        L7e:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            if (r1 != 0) goto L42
            if (r14 == 0) goto L89
            r14.close()
        L89:
            return r0
        L8a:
            r0 = move-exception
            goto L90
        L8c:
            r13 = move-exception
            goto La7
        L8e:
            r0 = move-exception
            r14 = r9
        L90:
            bpi r1 = r12.q()     // Catch: java.lang.Throwable -> La5
            bpk r1 = r1.c     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = defpackage.bpi.a(r13)     // Catch: java.lang.Throwable -> La5
            r1.a(r2, r13, r0)     // Catch: java.lang.Throwable -> La5
            if (r14 == 0) goto La4
            r14.close()
        La4:
            return r9
        La5:
            r13 = move-exception
            r9 = r14
        La7:
            if (r9 == 0) goto Lac
            r9.close()
        Lac:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<defpackage.apn.d>> g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.t()
            r12.c()
            defpackage.aat.a(r13)
            defpackage.aat.a(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.x()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            if (r1 != 0) goto L42
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            if (r14 == 0) goto L41
            r14.close()
        L41:
            return r13
        L42:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            asn r2 = defpackage.asn.b()     // Catch: java.io.IOException -> L6e android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            apn$d r1 = defpackage.apn.d.a(r1, r2)     // Catch: java.io.IOException -> L6e android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            if (r3 != 0) goto L6a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
        L6a:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            goto L7e
        L6e:
            r1 = move-exception
            bpi r2 = r12.q()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            bpk r2 = r2.c     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = defpackage.bpi.a(r13)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            r2.a(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
        L7e:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L8a java.lang.Throwable -> La5
            if (r1 != 0) goto L42
            if (r14 == 0) goto L89
            r14.close()
        L89:
            return r0
        L8a:
            r0 = move-exception
            goto L90
        L8c:
            r13 = move-exception
            goto La7
        L8e:
            r0 = move-exception
            r14 = r9
        L90:
            bpi r1 = r12.q()     // Catch: java.lang.Throwable -> La5
            bpk r1 = r1.c     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = defpackage.bpi.a(r13)     // Catch: java.lang.Throwable -> La5
            r1.a(r2, r13, r0)     // Catch: java.lang.Throwable -> La5
            if (r14 == 0) goto La4
            r14.close()
        La4:
            return r9
        La5:
            r13 = move-exception
            r9 = r14
        La7:
            if (r9 == 0) goto Lac
            r9.close()
        Lac:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> e(java.lang.String r8) {
        /*
            r7 = this;
            r7.t()
            r7.c()
            defpackage.aat.a(r8)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.x()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r6 = 1
            r4[r6] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            if (r3 != 0) goto L32
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r8
        L32:
            int r3 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            if (r4 != 0) goto L4e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
        L4e:
            int r3 = r1.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L80
            if (r3 != 0) goto L32
            if (r1 == 0) goto L64
            r1.close()
        L64:
            return r0
        L65:
            r0 = move-exception
            goto L6b
        L67:
            r8 = move-exception
            goto L82
        L69:
            r0 = move-exception
            r1 = r2
        L6b:
            bpi r3 = r7.q()     // Catch: java.lang.Throwable -> L80
            bpk r3 = r3.c     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = defpackage.bpi.a(r8)     // Catch: java.lang.Throwable -> L80
            r3.a(r4, r8, r0)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L7f
            r1.close()
        L7f:
            return r2
        L80:
            r8 = move-exception
            r2 = r1
        L82:
            if (r2 == 0) goto L87
            r2.close()
        L87:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.e(java.lang.String):java.util.Map");
    }

    private final boolean a(String str, List<Integer> list) {
        aat.a(str);
        t();
        c();
        SQLiteDatabase x = x();
        try {
            long b = b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, s().b(str, blk.I)));
            if (b <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return x.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            q().c.a("Database error querying filters. appId", bpi.a(str), e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, defpackage.apv.i> f(java.lang.String r12) {
        /*
            r11 = this;
            r11.t()
            r11.c()
            defpackage.aat.a(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.x()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r10 = 0
            r4[r10] = r12     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            if (r1 != 0) goto L33
            if (r0 == 0) goto L32
            r0.close()
        L32:
            return r8
        L33:
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
        L38:
            int r2 = r0.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            byte[] r3 = r0.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            asn r4 = defpackage.asn.b()     // Catch: java.io.IOException -> L50 android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            apv$i r3 = defpackage.apv.i.a(r3, r4)     // Catch: java.io.IOException -> L50 android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            goto L64
        L50:
            r3 = move-exception
            bpi r4 = r11.q()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            bpk r4 = r4.c     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = defpackage.bpi.a(r12)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            r4.a(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
        L64:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L8b
            if (r2 != 0) goto L38
            if (r0 == 0) goto L6f
            r0.close()
        L6f:
            return r1
        L70:
            r1 = move-exception
            goto L76
        L72:
            r12 = move-exception
            goto L8d
        L74:
            r1 = move-exception
            r0 = r8
        L76:
            bpi r2 = r11.q()     // Catch: java.lang.Throwable -> L8b
            bpk r2 = r2.c     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = defpackage.bpi.a(r12)     // Catch: java.lang.Throwable -> L8b
            r2.a(r3, r12, r1)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            return r8
        L8b:
            r12 = move-exception
            r8 = r0
        L8d:
            if (r8 == 0) goto L92
            r8.close()
        L92:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.f(java.lang.String):java.util.Map");
    }

    private static void a(ContentValues contentValues, String str, Object obj) {
        aat.a(str);
        aat.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final Object a(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            q().c.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type == 4) {
                q().c.a("Loaded invalid blob type value, ignoring it");
                return null;
            }
            q().c.a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
    }

    public final long B() {
        return a("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long h(String str, String str2) {
        Throwable th;
        SQLiteException e2;
        long a2;
        aat.a(str);
        aat.a(str2);
        c();
        t();
        SQLiteDatabase x = x();
        x.beginTransaction();
        long j = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
                sb.append("select ");
                sb.append(str2);
                sb.append(" from app2 where app_id=?");
                try {
                    a2 = a(sb.toString(), new String[]{str}, -1L);
                    if (a2 == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (x.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            q().c.a("Failed to insert column (got -1). appId", bpi.a(str), str2);
                            x.endTransaction();
                            return -1L;
                        }
                        a2 = 0;
                    }
                } catch (SQLiteException e3) {
                    e2 = e3;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + a2));
                    if (x.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        q().c.a("Failed to update column (got 0). appId", bpi.a(str), str2);
                        x.endTransaction();
                        return -1L;
                    }
                    x.setTransactionSuccessful();
                    x.endTransaction();
                    return a2;
                } catch (SQLiteException e4) {
                    e2 = e4;
                    j = a2;
                    q().c.a("Error inserting column. appId", bpi.a(str), str2, e2);
                    x.endTransaction();
                    return j;
                }
            } catch (Throwable th2) {
                th = th2;
                x.endTransaction();
                throw th;
            }
        } catch (SQLiteException e5) {
            e2 = e5;
        } catch (Throwable th3) {
            th = th3;
            x.endTransaction();
            throw th;
        }
    }

    public final long C() {
        return a("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long a(apv.g gVar) throws IOException {
        c();
        t();
        aat.a(gVar);
        aat.a(gVar.zzxm);
        byte[] i2 = gVar.i();
        long a2 = f().a(i2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gVar.zzxm);
        contentValues.put("metadata_fingerprint", Long.valueOf(a2));
        contentValues.put("metadata", i2);
        try {
            x().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return a2;
        } catch (SQLiteException e2) {
            q().c.a("Error storing raw event metadata. appId", bpi.a(gVar.zzxm), e2);
            throw e2;
        }
    }

    public final boolean D() {
        return b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean E() {
        return b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long g(String str) {
        aat.a(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(long r5) {
        /*
            r4 = this;
            r4.c()
            r4.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.x()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3c java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            bpi r6 = r4.q()     // Catch: android.database.sqlite.SQLiteException -> L3c java.lang.Throwable -> L53
            bpk r6 = r6.k     // Catch: android.database.sqlite.SQLiteException -> L3c java.lang.Throwable -> L53
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3c java.lang.Throwable -> L53
            if (r5 == 0) goto L31
            r5.close()
        L31:
            return r0
        L32:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3c java.lang.Throwable -> L53
            if (r5 == 0) goto L3b
            r5.close()
        L3b:
            return r6
        L3c:
            r6 = move-exception
            goto L42
        L3e:
            r6 = move-exception
            goto L55
        L40:
            r6 = move-exception
            r5 = r0
        L42:
            bpi r1 = r4.q()     // Catch: java.lang.Throwable -> L53
            bpk r1 = r1.c     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Error selecting expired configs"
            r1.a(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L52
            r5.close()
        L52:
            return r0
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.a(long):java.lang.String");
    }

    public final long F() {
        Cursor cursor = null;
        try {
            try {
                cursor = x().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e2) {
                q().c.a("Error querying raw events", e2);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0081: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:30:0x0081 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<defpackage.apv.c, java.lang.Long> a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.c()
            r7.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.x()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            if (r2 != 0) goto L35
            bpi r8 = r7.q()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            bpk r8 = r8.k     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            if (r1 == 0) goto L34
            r1.close()
        L34:
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            asn r4 = defpackage.asn.b()     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            apv$c r8 = defpackage.apv.c.a(r2, r4)     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            android.util.Pair r8 = android.util.Pair.create(r8, r3)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            if (r1 == 0) goto L52
            r1.close()
        L52:
            return r8
        L53:
            r2 = move-exception
            bpi r3 = r7.q()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            bpk r3 = r3.c     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = defpackage.bpi.a(r8)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            r3.a(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L80
            if (r1 == 0) goto L68
            r1.close()
        L68:
            return r0
        L69:
            r8 = move-exception
            goto L6f
        L6b:
            r8 = move-exception
            goto L82
        L6d:
            r8 = move-exception
            r1 = r0
        L6f:
            bpi r9 = r7.q()     // Catch: java.lang.Throwable -> L80
            bpk r9 = r9.c     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = "Error selecting main event"
            r9.a(r2, r8)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L7f
            r1.close()
        L7f:
            return r0
        L80:
            r8 = move-exception
            r0 = r1
        L82:
            if (r0 == 0) goto L87
            r0.close()
        L87:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final boolean a(String str, Long l, long j, apv.c cVar) {
        c();
        t();
        aat.a(cVar);
        aat.a(str);
        aat.a(l);
        byte[] i2 = cVar.i();
        q().k.a("Saving complex main event, appId, data size", n().a(str), Integer.valueOf(i2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", i2);
        try {
            if (x().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            q().c.a("Failed to insert complex main event (got -1). appId", bpi.a(str));
            return false;
        } catch (SQLiteException e2) {
            q().c.a("Error storing complex main event. appId", bpi.a(str), e2);
            return false;
        }
    }

    public final boolean a(blf blfVar, long j, boolean z) {
        c();
        t();
        aat.a(blfVar);
        aat.a(blfVar.a);
        apv.c.a b = apv.c.c().b(blfVar.d);
        Iterator<String> it = blfVar.e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            apv.e.a a2 = apv.e.d().a(next);
            f().a(a2, blfVar.e.a(next));
            b.a(a2);
        }
        byte[] i2 = ((apv.c) ((ata) b.v())).i();
        q().k.a("Saving event, name, data size", n().a(blfVar.b), Integer.valueOf(i2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", blfVar.a);
        contentValues.put("name", blfVar.b);
        contentValues.put("timestamp", Long.valueOf(blfVar.c));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", i2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (x().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            q().c.a("Failed to insert raw event (got -1). appId", bpi.a(blfVar.a));
            return false;
        } catch (SQLiteException e2) {
            q().c.a("Error storing raw event. appId", bpi.a(blfVar.a), e2);
            return false;
        }
    }

    private final boolean O() {
        return m().getDatabasePath("google_app_measurement.db").exists();
    }
}
