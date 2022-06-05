package io.realm.internal.core;

import defpackage.dlp;
import io.realm.RealmFieldType;
import io.realm.internal.Table;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class QueryDescriptor {
    private final boolean[] ascendings;
    private final long[][] columnIndices;
    private final Table table;
    public static final Set<RealmFieldType> SORT_VALID_FIELD_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(RealmFieldType.BOOLEAN, RealmFieldType.INTEGER, RealmFieldType.FLOAT, RealmFieldType.DOUBLE, RealmFieldType.STRING, RealmFieldType.DATE)));
    public static final Set<RealmFieldType> DISTINCT_VALID_FIELD_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(RealmFieldType.BOOLEAN, RealmFieldType.INTEGER, RealmFieldType.STRING, RealmFieldType.DATE)));

    public static QueryDescriptor getInstanceForSort(dlp.a aVar, Table table, String str, dkw dkwVar) {
        return getInstanceForSort(aVar, table, new String[]{str}, new dkw[]{dkwVar});
    }

    public static QueryDescriptor getInstanceForSort(dlp.a aVar, Table table, String[] strArr, dkw[] dkwVarArr) {
        if (dkwVarArr == null || dkwVarArr.length == 0) {
            throw new IllegalArgumentException("You must provide at least one sort order.");
        }
        if (strArr.length != dkwVarArr.length) {
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
        return getInstance(aVar, table, strArr, dkwVarArr, dlp.d, SORT_VALID_FIELD_TYPES, "Sort is not supported");
    }

    public static QueryDescriptor getInstanceForDistinct(dlp.a aVar, Table table, String str) {
        return getInstanceForDistinct(aVar, table, new String[]{str});
    }

    public static QueryDescriptor getInstanceForDistinct(dlp.a aVar, Table table, String[] strArr) {
        return getInstance(aVar, table, strArr, null, dlp.e, DISTINCT_VALID_FIELD_TYPES, "Distinct is not supported");
    }

    private static QueryDescriptor getInstance(dlp.a aVar, Table table, String[] strArr, dkw[] dkwVarArr, Set<RealmFieldType> set, Set<RealmFieldType> set2, String str) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("You must provide at least one field name.");
        }
        long[][] jArr = new long[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            dlp a = dlp.a(aVar, table, strArr[i], set);
            checkFieldType(a, set2, str, strArr[i]);
            a.b();
            jArr[i] = Arrays.copyOf(a.g, a.g.length);
        }
        return new QueryDescriptor(table, jArr, dkwVarArr);
    }

    public static QueryDescriptor getTestInstance(Table table, long[] jArr) {
        return new QueryDescriptor(table, new long[][]{jArr}, null);
    }

    private static void checkFieldType(dlp dlpVar, Set<RealmFieldType> set, String str, String str2) {
        if (set.contains(dlpVar.a())) {
            return;
        }
        Locale locale = Locale.US;
        dlpVar.b();
        throw new IllegalArgumentException(String.format(locale, "%s on '%s' field '%s' in '%s'.", str, dlpVar.a(), dlpVar.f, str2));
    }

    private QueryDescriptor(Table table, long[][] jArr, dkw[] dkwVarArr) {
        this.table = table;
        this.columnIndices = jArr;
        if (dkwVarArr != null) {
            this.ascendings = new boolean[dkwVarArr.length];
            for (int i = 0; i < dkwVarArr.length; i++) {
                this.ascendings[i] = dkwVarArr[i].getValue();
            }
            return;
        }
        this.ascendings = null;
    }

    public long[][] getColumnIndices() {
        return this.columnIndices;
    }

    public boolean[] getAscendings() {
        return this.ascendings;
    }

    private long getTablePtr() {
        return this.table.getNativePtr();
    }
}
