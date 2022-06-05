package defpackage;

import androidx.collection.ArrayMap;
import defpackage.apn;
import defpackage.apv;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bvc  reason: default package */
/* loaded from: classes2.dex */
public final class bvc extends buk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bvc(buj bujVar) {
        super(bujVar);
    }

    @Override // defpackage.buk
    protected final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x095f  */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.apv.a> a(java.lang.String r86, java.util.List<defpackage.apv.c> r87, java.util.List<defpackage.apv.k> r88) {
        /*
            Method dump skipped, instructions count: 4036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvc.a(java.lang.String, java.util.List, java.util.List):java.util.List");
    }

    private final Boolean a(apn.d dVar, apv.k kVar) {
        apn.b b = dVar.b();
        boolean z = b.zzur;
        if (kVar.c()) {
            if (!b.c()) {
                q().f.a("No number filter for long property. property", n().c(kVar.zzwk));
                return null;
            }
            return a(a(kVar.zzwp, b.d()), z);
        } else if (kVar.d()) {
            if (!b.c()) {
                q().f.a("No number filter for double property. property", n().c(kVar.zzwk));
                return null;
            }
            return a(a(kVar.zzwt, b.d()), z);
        } else if (kVar.b()) {
            if (!b.a()) {
                if (!b.c()) {
                    q().f.a("No string or number filter defined. property", n().c(kVar.zzwk));
                } else if (bur.a(kVar.zzwr)) {
                    return a(a(kVar.zzwr, b.d()), z);
                } else {
                    q().f.a("Invalid user property value for Numeric number filter. property, value", n().c(kVar.zzwk), kVar.zzwr);
                }
                return null;
            }
            return a(a(kVar.zzwr, b.b()), z);
        } else {
            q().f.a("User property has no value, property", n().c(kVar.zzwk));
            return null;
        }
    }

    private static Boolean a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    private final Boolean a(String str, apn.e eVar) {
        String str2;
        List<String> list;
        aat.a(eVar);
        if (str == null || !eVar.a() || eVar.b() == apn.e.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (eVar.b() == apn.e.a.IN_LIST) {
            if (eVar.d() == 0) {
                return null;
            }
        } else if (!eVar.c()) {
            return null;
        }
        apn.e.a b = eVar.b();
        boolean z = eVar.zzvn;
        if (!z && b != apn.e.a.REGEXP && b != apn.e.a.IN_LIST) {
            str2 = eVar.zzvm.toUpperCase(Locale.ENGLISH);
        } else {
            str2 = eVar.zzvm;
        }
        String str3 = str2;
        if (eVar.d() == 0) {
            list = null;
        } else {
            List<String> list2 = eVar.zzvo;
            if (!z) {
                ArrayList arrayList = new ArrayList(list2.size());
                for (String str4 : list2) {
                    arrayList.add(str4.toUpperCase(Locale.ENGLISH));
                }
                list2 = Collections.unmodifiableList(arrayList);
            }
            list = list2;
        }
        return a(str, b, z, str3, list, b == apn.e.a.REGEXP ? str3 : null);
    }

    private final Boolean a(String str, apn.e.a aVar, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (aVar == apn.e.a.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != apn.e.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (bvb.a[aVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    q().f.a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    private static Boolean a(long j, apn.c cVar) {
        try {
            return a(new BigDecimal(j), cVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean a(double d, apn.c cVar) {
        try {
            return a(new BigDecimal(d), cVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean a(String str, apn.c cVar) {
        if (!bur.a(str)) {
            return null;
        }
        try {
            return a(new BigDecimal(str), cVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (((r11.zzue & 16) != 0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
        if (r2 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Boolean a(java.math.BigDecimal r10, defpackage.apn.c r11, double r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvc.a(java.math.BigDecimal, apn$c, double):java.lang.Boolean");
    }

    private static List<apv.b> a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            arrayList.add((apv.b) ((ata) apv.b.c().a(intValue).a(map.get(Integer.valueOf(intValue)).longValue()).v()));
        }
        return arrayList;
    }

    private static void a(Map<Integer, Long> map, int i, long j) {
        Long l = map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }

    private static void b(Map<Integer, List<Long>> map, int i, long j) {
        List<Long> list = map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }

    private final Boolean a(apn.a aVar, String str, List<apv.e> list, long j) {
        Boolean bool;
        if ((aVar.zzue & 8) != 0) {
            Boolean a = a(j, aVar.b());
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return Boolean.FALSE;
            }
        }
        HashSet hashSet = new HashSet();
        for (apn.b bVar : aVar.zzuh) {
            if (bVar.zzus.isEmpty()) {
                q().f.a("null or empty param name in filter. event", n().a(str));
                return null;
            }
            hashSet.add(bVar.zzus);
        }
        ArrayMap arrayMap = new ArrayMap();
        for (apv.e eVar : list) {
            if (hashSet.contains(eVar.zzwk)) {
                if (eVar.b()) {
                    arrayMap.put(eVar.zzwk, eVar.b() ? Long.valueOf(eVar.zzwp) : null);
                } else if (eVar.c()) {
                    arrayMap.put(eVar.zzwk, eVar.c() ? Double.valueOf(eVar.zzwt) : null);
                } else if (eVar.a()) {
                    arrayMap.put(eVar.zzwk, eVar.zzwr);
                } else {
                    q().f.a("Unknown value for param. event, param", n().a(str), n().b(eVar.zzwk));
                    return null;
                }
            }
        }
        for (apn.b bVar2 : aVar.zzuh) {
            boolean z = bVar2.e() && bVar2.zzur;
            String str2 = bVar2.zzus;
            if (str2.isEmpty()) {
                q().f.a("Event has empty param name. event", n().a(str));
                return null;
            }
            V v = arrayMap.get(str2);
            if (v instanceof Long) {
                if (!bVar2.c()) {
                    q().f.a("No number filter for long param. event, param", n().a(str), n().b(str2));
                    return null;
                }
                Boolean a2 = a(((Long) v).longValue(), bVar2.d());
                if (a2 == null) {
                    return null;
                }
                if (a2.booleanValue() == z) {
                    return Boolean.FALSE;
                }
            } else if (v instanceof Double) {
                if (!bVar2.c()) {
                    q().f.a("No number filter for double param. event, param", n().a(str), n().b(str2));
                    return null;
                }
                Boolean a3 = a(((Double) v).doubleValue(), bVar2.d());
                if (a3 == null) {
                    return null;
                }
                if (a3.booleanValue() == z) {
                    return Boolean.FALSE;
                }
            } else if (v instanceof String) {
                if (bVar2.a()) {
                    bool = a((String) v, bVar2.b());
                } else if (bVar2.c()) {
                    String str3 = (String) v;
                    if (bur.a(str3)) {
                        bool = a(str3, bVar2.d());
                    } else {
                        q().f.a("Invalid param value for number filter. event, param", n().a(str), n().b(str2));
                        return null;
                    }
                } else {
                    q().f.a("No filter for String param. event, param", n().a(str), n().b(str2));
                    return null;
                }
                if (bool == null) {
                    return null;
                }
                if (bool.booleanValue() == z) {
                    return Boolean.FALSE;
                }
            } else {
                if (v == 0) {
                    q().k.a("Missing param for filter. event, param", n().a(str), n().b(str2));
                    return Boolean.FALSE;
                }
                q().f.a("Unknown param type. event, param", n().a(str), n().b(str2));
                return null;
            }
        }
        return Boolean.TRUE;
    }
}
