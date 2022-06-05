package defpackage;

import defpackage.dla;
import defpackage.dlp;
import io.realm.RealmFieldType;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: dln  reason: default package */
/* loaded from: classes2.dex */
final class dln extends dlp {
    private final dlp.a h;
    private final String i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dln(dlp.a aVar, String str, String str2, Set<RealmFieldType> set) {
        super(str2, set);
        this.i = str;
        this.h = aVar;
    }

    @Override // defpackage.dlp
    protected final void a(List<String> list) {
        int size = list.size();
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        String str = null;
        RealmFieldType realmFieldType = null;
        String str2 = this.i;
        int i = 0;
        while (i < size) {
            str = list.get(i);
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("Invalid query: Field descriptor contains an empty field.  A field description may not begin with or contain adjacent periods ('.').");
            }
            dla b = this.h.b();
            if (b == null) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: class '%s' not found in this schema.", str2));
            }
            dla.a aVar = b.a.get(str);
            if (aVar == null) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' not found in class '%s'.", str, str2));
            }
            RealmFieldType realmFieldType2 = aVar.b;
            if (i < size - 1) {
                a(str2, str, realmFieldType2);
                str2 = aVar.c;
            }
            jArr[i] = aVar.a;
            jArr2[i] = realmFieldType2 != RealmFieldType.LINKING_OBJECTS ? 0L : this.h.c();
            i++;
            realmFieldType = realmFieldType2;
        }
        a(str2, str, realmFieldType, jArr, jArr2);
    }
}
