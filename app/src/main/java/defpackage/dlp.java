package defpackage;

import io.realm.RealmFieldType;
import io.realm.internal.Table;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: dlp  reason: default package */
/* loaded from: classes2.dex */
public abstract class dlp {
    public static final Set<RealmFieldType> a;
    public static final Set<RealmFieldType> b;
    public static final Set<RealmFieldType> c;
    public static final Set<RealmFieldType> d;
    public String f;
    public long[] g;
    private final List<String> i;
    private final Set<RealmFieldType> j;
    private final Set<RealmFieldType> k;
    private RealmFieldType l;
    private long[] m;
    private static final Pattern h = Pattern.compile("\\.");
    public static final Set<RealmFieldType> e = Collections.emptySet();

    /* renamed from: dlp$a */
    /* loaded from: classes2.dex */
    public interface a {
        boolean a();

        dla b();

        long c();
    }

    protected abstract void a(List<String> list);

    static {
        HashSet hashSet = new HashSet(3);
        hashSet.add(RealmFieldType.OBJECT);
        hashSet.add(RealmFieldType.LIST);
        hashSet.add(RealmFieldType.LINKING_OBJECTS);
        a = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(RealmFieldType.OBJECT);
        hashSet2.add(RealmFieldType.LIST);
        b = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(RealmFieldType.LIST);
        c = Collections.unmodifiableSet(hashSet3);
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(RealmFieldType.OBJECT);
        d = Collections.unmodifiableSet(hashSet4);
    }

    public static dlp a(a aVar, Table table, String str, Set<RealmFieldType> set) {
        if (aVar == null || !aVar.a()) {
            if (set == null) {
                set = b;
            }
            return new dlo(table, str, set);
        }
        String b2 = Table.b(table.a());
        if (set == null) {
            set = a;
        }
        return new dln(aVar, b2, str, set);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dlp(String str, Set<RealmFieldType> set) {
        List<String> list;
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("Invalid query: field name is empty");
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf != str.length() - 1) {
            if (lastIndexOf >= 0) {
                list = Arrays.asList(h.split(str));
            } else {
                list = Collections.singletonList(str);
            }
            this.i = list;
            if (list.size() <= 0) {
                throw new IllegalArgumentException("Invalid query: Empty field descriptor");
            }
            this.j = set;
            this.k = null;
            return;
        }
        throw new IllegalArgumentException("Invalid query: field name must not end with a period ('.')");
    }

    public final RealmFieldType a() {
        b();
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str, String str2, RealmFieldType realmFieldType) {
        a(str, str2, realmFieldType, this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str, String str2, RealmFieldType realmFieldType, long[] jArr, long[] jArr2) {
        Set<RealmFieldType> set = this.k;
        if (set != null && set.size() > 0) {
            a(str, str2, realmFieldType, this.k);
        }
        this.f = str2;
        this.l = realmFieldType;
        this.g = jArr;
        this.m = jArr2;
    }

    private static void a(String str, String str2, RealmFieldType realmFieldType, Set<RealmFieldType> set) {
        if (set.contains(realmFieldType)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' in class '%s' is of invalid type '%s'.", str2, str, realmFieldType.toString()));
    }

    public final void b() {
        if (this.l == null) {
            a(this.i);
        }
    }
}
