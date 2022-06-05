package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: blb  reason: default package */
/* loaded from: classes2.dex */
public final class blb {
    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(bpi bpiVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        String[] split;
        if (bpiVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!a(bpiVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            if (bpiVar == null) {
                throw new IllegalArgumentException("Monitor must not be null");
            }
            Set<String> a = a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!a.remove(str4)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                    sb.append("Table ");
                    sb.append(str);
                    sb.append(" is missing required column: ");
                    sb.append(str4);
                    throw new SQLiteException(sb.toString());
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!a.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (a.isEmpty()) {
                return;
            }
            bpiVar.f.a("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
        } catch (SQLiteException e) {
            bpiVar.c.a("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    private static boolean a(bpi bpiVar, SQLiteDatabase sQLiteDatabase, String str) {
        if (bpiVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                if (cursor != null) {
                    cursor.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                bpiVar.f.a("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(bpi bpiVar, SQLiteDatabase sQLiteDatabase) {
        if (bpiVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            bpiVar.f.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            bpiVar.f.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            bpiVar.f.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        bpiVar.f.a("Failed to turn on database write permission for owner");
    }
}
