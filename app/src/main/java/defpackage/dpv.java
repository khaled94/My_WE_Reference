package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001OB\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010F\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u00020\u00122\b\u0010M\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010N\u001a\u000201H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010 \u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u0015R\u001a\u0010\"\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0014\u001a\u0004\b\"\u0010\u0015R\u001a\u0010$\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0014\u001a\u0004\b$\u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u001e\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R(\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0014\u001a\u0004\b6\u0010\u000bR\u0016\u00107\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00103R \u00109\u001a\b\u0012\u0004\u0012\u00020:0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u000bR \u0010=\u001a\b\u0012\u0004\u0012\u00020>0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0014\u001a\u0004\b@\u0010\u000bR\u001c\u0010A\u001a\u0004\u0018\u00010B8VX\u0097\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0014\u001a\u0004\bD\u0010E¨\u0006P"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()V", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isFun", "isFun$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "isValue", "isValue$annotations", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses$annotations", "getSealedSubclasses", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "error", "", "hashCode", "", "isInstance", "value", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: dpv  reason: default package */
/* loaded from: classes2.dex */
public final class dpv implements dpu, drg<Object> {
    public static final a a = new a((byte) 0);
    private static final Map<Class<? extends dlt<?>>, Integer> c;
    private static final HashMap<String, String> d;
    private static final HashMap<String, String> e;
    private static final HashMap<String, String> f;
    private static final Map<String, String> g;
    private final Class<?> b;

    public dpv(Class<?> cls) {
        dqc.d(cls, "jClass");
        this.b = cls;
    }

    @Override // defpackage.dpu
    public final Class<?> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dpv) && dqc.a(dot.b(this), dot.b((drg) obj));
    }

    public final int hashCode() {
        return dot.b(this).hashCode();
    }

    public final String toString() {
        return this.b.toString() + " (Kotlin reflection is not available)";
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005R&\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "()V", "FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "classFqNames", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "getClassQualifiedName", "jClass", "getClassSimpleName", "isInstance", "", "value", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    /* renamed from: dpv$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        LinkedHashMap linkedHashMap;
        String f2;
        String f3;
        List b = dmq.b(dov.class, dow.class, dph.class, dpl.class, dpm.class, dpn.class, dpo.class, dpp.class, dpq.class, dpr.class, dox.class, doy.class, doz.class, dpa.class, dpb.class, dpc.class, dpd.class, dpe.class, dpf.class, dpg.class, dpi.class, dpj.class, dpk.class);
        ArrayList arrayList = new ArrayList(dmq.a((Iterable) b));
        int i = 0;
        for (Object obj : b) {
            int i2 = i + 1;
            if (i < 0) {
                dmq.a();
            }
            arrayList.add(dme.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        ArrayList arrayList2 = arrayList;
        dqc.d(arrayList2, "$this$toMap");
        ArrayList arrayList3 = arrayList2;
        int size = arrayList3.size();
        if (size == 0) {
            linkedHashMap = dnh.a();
        } else if (size == 1) {
            dma dmaVar = (dma) arrayList2.get(0);
            dqc.d(dmaVar, "pair");
            linkedHashMap = Collections.singletonMap(dmaVar.a, dmaVar.b);
            dqc.b(linkedHashMap, "java.util.Collections.si…(pair.first, pair.second)");
        } else {
            linkedHashMap = new LinkedHashMap(dnh.a(arrayList3.size()));
            dqc.d(arrayList2, "$this$toMap");
            dqc.d(linkedHashMap, "destination");
            dnh.a(linkedHashMap, arrayList2);
        }
        c = linkedHashMap;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(d);
        hashMap3.putAll(e);
        Collection<String> values = d.values();
        dqc.b(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            dqc.b(str, "kotlinName");
            f3 = dsg.f(str, str);
            sb.append(f3);
            sb.append("CompanionObject");
            dma a2 = dme.a(sb.toString(), str + ".Companion");
            hashMap3.put(a2.a, a2.b);
        }
        for (Map.Entry<Class<? extends dlt<?>>, Integer> entry : c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function".concat(String.valueOf(entry.getValue().intValue())));
        }
        f = hashMap3;
        HashMap<String, String> hashMap4 = hashMap3;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(dnh.a(hashMap4.size()));
        Iterator<T> it = hashMap4.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            f2 = dsg.f((String) entry2.getValue(), r2);
            linkedHashMap2.put(key, f2);
        }
        g = linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.drg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            java.lang.Class<?> r0 = r7.b
            java.lang.String r1 = "jClass"
            defpackage.dqc.d(r0, r1)
            boolean r1 = r0.isAnonymousClass()
            r2 = 0
            if (r1 == 0) goto Lf
            return r2
        Lf:
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L90
            java.lang.String r1 = r0.getSimpleName()
            java.lang.reflect.Method r3 = r0.getEnclosingMethod()
            java.lang.String r4 = "$"
            java.lang.String r5 = "name"
            if (r3 == 0) goto L42
            defpackage.dqc.b(r1, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = r3.getName()
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            java.lang.String r3 = defpackage.dsg.e(r1, r3)
            if (r3 != 0) goto L40
            goto L42
        L40:
            r2 = r3
            goto L62
        L42:
            java.lang.reflect.Constructor r0 = r0.getEnclosingConstructor()
            if (r0 == 0) goto L62
            defpackage.dqc.b(r1, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = defpackage.dsg.e(r1, r0)
        L62:
            if (r2 != 0) goto Lda
            defpackage.dqc.b(r1, r5)
            java.lang.String r0 = "$this$substringAfter"
            defpackage.dqc.d(r1, r0)
            java.lang.String r0 = "missingDelimiterValue"
            defpackage.dqc.d(r1, r0)
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 36
            r3 = 0
            r4 = 6
            int r0 = defpackage.dsg.a(r0, r2, r3, r4)
            r2 = -1
            if (r0 != r2) goto L80
            return r1
        L80:
            int r0 = r0 + 1
            int r2 = r1.length()
            java.lang.String r0 = r1.substring(r0, r2)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            defpackage.dqc.b(r0, r1)
            return r0
        L90:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto Lc7
            java.lang.Class r0 = r0.getComponentType()
            java.lang.String r1 = "componentType"
            defpackage.dqc.b(r0, r1)
            boolean r1 = r0.isPrimitive()
            java.lang.String r3 = "Array"
            if (r1 == 0) goto Lc4
            java.util.Map<java.lang.String, java.lang.String> r1 = defpackage.dpv.g
            java.lang.String r0 = r0.getName()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
        Lc4:
            if (r2 != 0) goto Lda
            return r3
        Lc7:
            java.util.Map<java.lang.String, java.lang.String> r1 = defpackage.dpv.g
            java.lang.String r2 = r0.getName()
            java.lang.Object r1 = r1.get(r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lda
            java.lang.String r2 = r0.getSimpleName()
        Lda:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpv.b():java.lang.String");
    }

    @Override // defpackage.dre
    public final List<Annotation> getAnnotations() {
        throw new dou();
    }
}
