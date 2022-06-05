package defpackage;

import io.realm.RealmFieldType;
import io.realm.internal.Table;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: dlo  reason: default package */
/* loaded from: classes2.dex */
final class dlo extends dlp {
    private final Table h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dlo(Table table, String str, Set<RealmFieldType> set) {
        super(str, set);
        this.h = table;
    }

    @Override // defpackage.dlp
    protected final void a(List<String> list) {
        int size = list.size();
        long[] jArr = new long[size];
        Table table = this.h;
        String str = null;
        String str2 = null;
        RealmFieldType realmFieldType = null;
        for (int i = 0; i < size; i++) {
            str2 = list.get(i);
            if (str2 == null || str2.length() <= 0) {
                throw new IllegalArgumentException("Invalid query: Field descriptor contains an empty field.  A field description may not begin with or contain adjacent periods ('.').");
            }
            str = Table.b(table.a());
            long a = table.a(str2);
            if (a < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' not found in table '%s'.", str2, str));
            }
            realmFieldType = table.a(a);
            if (i < size - 1) {
                a(str, str2, realmFieldType);
                table = new Table(table.d, table.nativeGetLinkTarget(table.b, a));
            }
            jArr[i] = a;
        }
        a(str, str2, realmFieldType, jArr, new long[size]);
    }
}
