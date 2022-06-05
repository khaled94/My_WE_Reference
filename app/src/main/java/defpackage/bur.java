package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.apn;
import defpackage.apv;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: bur  reason: default package */
/* loaded from: classes2.dex */
public final class bur extends buk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bur(buj bujVar) {
        super(bujVar);
    }

    @Override // defpackage.buk
    protected final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(apv.k.a aVar, Object obj) {
        aat.a(obj);
        aVar.a().b().c();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            q().c.a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(apv.e.a aVar, Object obj) {
        aat.a(obj);
        aVar.a().b().c();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            q().c.a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(apv.c cVar, String str) {
        apv.e a = a(cVar, str);
        if (a != null) {
            if (!a.a()) {
                if (a.b()) {
                    return Long.valueOf(a.zzwp);
                }
                if (!a.c()) {
                    return null;
                }
                return Double.valueOf(a.zzwt);
            }
            return a.zzwr;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(apv.c.a aVar, String str, Object obj) {
        List<apv.e> a = aVar.a();
        int i = 0;
        while (true) {
            if (i >= a.size()) {
                i = -1;
                break;
            } else if (str.equals(a.get(i).zzwk)) {
                break;
            } else {
                i++;
            }
        }
        apv.e.a a2 = apv.e.d().a(str);
        if (obj instanceof Long) {
            a2.a(((Long) obj).longValue());
        }
        if (i >= 0) {
            aVar.a(i, a2);
        } else {
            aVar.a(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(apv.f fVar) {
        ati<apv.e> atiVar;
        Iterator<apv.k> it;
        Long l;
        if (fVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (apv.g gVar : fVar.zzwv) {
            if (gVar != null) {
                a(sb, 1);
                sb.append("bundle {\n");
                if ((gVar.zzue & 1) != 0) {
                    a(sb, 1, "protocol_version", Integer.valueOf(gVar.zzwy));
                }
                a(sb, 1, "platform", gVar.zzxg);
                if ((gVar.zzue & 16384) != 0) {
                    a(sb, 1, "gmp_version", Long.valueOf(gVar.zzxo));
                }
                if ((gVar.zzue & 32768) != 0) {
                    a(sb, 1, "uploading_gmp_version", Long.valueOf(gVar.zzxp));
                }
                if ((gVar.zzwx & 16) != 0) {
                    a(sb, 1, "dynamite_version", Long.valueOf(gVar.zzym));
                }
                if ((gVar.zzue & 536870912) != 0) {
                    a(sb, 1, "config_version", Long.valueOf(gVar.zzye));
                }
                a(sb, 1, "gmp_app_id", gVar.zzxw);
                a(sb, 1, "admob_app_id", gVar.zzyj);
                a(sb, 1, "app_id", gVar.zzxm);
                a(sb, 1, "app_version", gVar.zzxn);
                if ((gVar.zzue & 33554432) != 0) {
                    a(sb, 1, "app_version_major", Integer.valueOf(gVar.zzya));
                }
                a(sb, 1, "firebase_instance_id", gVar.zzxz);
                if ((gVar.zzue & 524288) != 0) {
                    a(sb, 1, "dev_cert_hash", Long.valueOf(gVar.zzxt));
                }
                a(sb, 1, "app_store", gVar.zzxl);
                if ((gVar.zzue & 2) != 0) {
                    a(sb, 1, "upload_timestamp_millis", Long.valueOf(gVar.zzxb));
                }
                if ((gVar.zzue & 4) != 0) {
                    a(sb, 1, "start_timestamp_millis", Long.valueOf(gVar.zzxc));
                }
                if (gVar.a()) {
                    a(sb, 1, "end_timestamp_millis", Long.valueOf(gVar.zzxd));
                }
                if ((gVar.zzue & 16) != 0) {
                    a(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(gVar.zzxe));
                }
                if ((gVar.zzue & 32) != 0) {
                    a(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(gVar.zzxf));
                }
                a(sb, 1, "app_instance_id", gVar.zzxs);
                a(sb, 1, "resettable_device_id", gVar.zzxq);
                a(sb, 1, "device_id", gVar.zzyd);
                a(sb, 1, "ds_id", gVar.zzyg);
                if ((gVar.zzue & 131072) != 0) {
                    a(sb, 1, "limited_ad_tracking", Boolean.valueOf(gVar.zzxr));
                }
                a(sb, 1, "os_version", gVar.zzxh);
                a(sb, 1, "device_model", gVar.zzxi);
                a(sb, 1, "user_default_language", gVar.zzxj);
                if ((gVar.zzue & 1024) != 0) {
                    a(sb, 1, "time_zone_offset_minutes", Integer.valueOf(gVar.zzxk));
                }
                if ((gVar.zzue & 1048576) != 0) {
                    a(sb, 1, "bundle_sequential_index", Integer.valueOf(gVar.zzxu));
                }
                if ((gVar.zzue & 8388608) != 0) {
                    a(sb, 1, "service_upload", Boolean.valueOf(gVar.zzxx));
                }
                a(sb, 1, "health_monitor", gVar.zzxv);
                if (((gVar.zzue & BasicMeasure.EXACTLY) != 0) && gVar.zzyf != 0) {
                    a(sb, 1, "android_id", Long.valueOf(gVar.zzyf));
                }
                if (gVar.b()) {
                    a(sb, 1, "retry_counter", Integer.valueOf(gVar.zzyi));
                }
                ati<apv.k> atiVar2 = gVar.zzxa;
                if (atiVar2 != null) {
                    Iterator<apv.k> it2 = atiVar2.iterator();
                    while (it2.hasNext()) {
                        apv.k next = it2.next();
                        if (next != null) {
                            a(sb, 2);
                            sb.append("user_property {\n");
                            if (next.a()) {
                                it = it2;
                                l = Long.valueOf(next.zzzc);
                            } else {
                                it = it2;
                                l = null;
                            }
                            a(sb, 2, "set_timestamp_millis", l);
                            a(sb, 2, "name", n().c(next.zzwk));
                            a(sb, 2, "string_value", next.zzwr);
                            a(sb, 2, "int_value", next.c() ? Long.valueOf(next.zzwp) : null);
                            a(sb, 2, "double_value", next.d() ? Double.valueOf(next.zzwt) : null);
                            a(sb, 2);
                            sb.append("}\n");
                            it2 = it;
                        }
                    }
                }
                ati<apv.a> atiVar3 = gVar.zzxy;
                String str = gVar.zzxm;
                if (atiVar3 != null) {
                    for (apv.a aVar : atiVar3) {
                        if (aVar != null) {
                            a(sb, 2);
                            sb.append("audience_membership {\n");
                            if ((aVar.zzue & 1) != 0) {
                                a(sb, 2, "audience_id", Integer.valueOf(aVar.zzwb));
                            }
                            if ((aVar.zzue & 8) != 0) {
                                a(sb, 2, "new_audience", Boolean.valueOf(aVar.zzwe));
                            }
                            a(sb, "current_data", aVar.a(), str);
                            a(sb, "previous_data", aVar.b(), str);
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                ati<apv.c> atiVar4 = gVar.zzwz;
                if (atiVar4 != null) {
                    for (apv.c cVar : atiVar4) {
                        if (cVar != null) {
                            a(sb, 2);
                            sb.append("event {\n");
                            a(sb, 2, "name", n().a(cVar.zzwk));
                            if (cVar.b()) {
                                a(sb, 2, "timestamp_millis", Long.valueOf(cVar.zzwl));
                            }
                            if ((cVar.zzue & 4) != 0) {
                                a(sb, 2, "previous_timestamp_millis", Long.valueOf(cVar.zzwm));
                            }
                            if ((cVar.zzue & 8) != 0) {
                                a(sb, 2, "count", Integer.valueOf(cVar.zzwn));
                            }
                            if (cVar.a() != 0 && (atiVar = cVar.zzwj) != null) {
                                for (apv.e eVar : atiVar) {
                                    if (eVar != null) {
                                        a(sb, 3);
                                        sb.append("param {\n");
                                        a(sb, 3, "name", n().b(eVar.zzwk));
                                        a(sb, 3, "string_value", eVar.zzwr);
                                        a(sb, 3, "int_value", eVar.b() ? Long.valueOf(eVar.zzwp) : null);
                                        a(sb, 3, "double_value", eVar.c() ? Double.valueOf(eVar.zzwt) : null);
                                        a(sb, 3);
                                        sb.append("}\n");
                                    }
                                }
                            }
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                a(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(apn.a aVar) {
        if (aVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (aVar.a()) {
            a(sb, 0, "filter_id", Integer.valueOf(aVar.zzuf));
        }
        a(sb, 0, "event_name", n().a(aVar.zzug));
        String a = a(aVar.zzuk, aVar.zzul, aVar.zzum);
        if (!a.isEmpty()) {
            a(sb, 0, "filter_type", a);
        }
        a(sb, 1, "event_count_filter", aVar.b());
        sb.append("  filters {\n");
        for (apn.b bVar : aVar.zzuh) {
            a(sb, 2, bVar);
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(apn.d dVar) {
        if (dVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (dVar.a()) {
            a(sb, 0, "filter_id", Integer.valueOf(dVar.zzuf));
        }
        a(sb, 0, "property_name", n().c(dVar.zzvh));
        String a = a(dVar.zzuk, dVar.zzul, dVar.zzum);
        if (!a.isEmpty()) {
            a(sb, 0, "filter_type", a);
        }
        a(sb, 1, dVar.b());
        sb.append("}\n");
        return sb.toString();
    }

    private static String a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private final void a(StringBuilder sb, String str, apv.i iVar, String str2) {
        if (iVar == null) {
            return;
        }
        a(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (iVar.zzyw.size() != 0) {
            a(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l : iVar.zzyw) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (iVar.a() != 0) {
            a(sb, 4);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : iVar.zzyv) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (s().e(str2)) {
            if (iVar.b() != 0) {
                a(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i5 = 0;
                for (apv.b bVar : iVar.zzyx) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(bVar.a() ? Integer.valueOf(bVar.zzwg) : null);
                    sb.append(":");
                    sb.append(bVar.b() ? Long.valueOf(bVar.zzwh) : null);
                    i5 = i6;
                }
                sb.append("}\n");
            }
            if (iVar.c() != 0) {
                a(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i7 = 0;
                for (apv.j jVar : iVar.zzyy) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jVar.a() ? Integer.valueOf(jVar.zzwg) : null);
                    sb.append(": [");
                    int i9 = 0;
                    for (Long l3 : jVar.zzza) {
                        long longValue = l3.longValue();
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue);
                        i9 = i10;
                    }
                    sb.append("]");
                    i7 = i8;
                }
                sb.append("}\n");
            }
        }
        a(sb, 3);
        sb.append("}\n");
    }

    private static void a(StringBuilder sb, int i, String str, apn.c cVar) {
        if (cVar == null) {
            return;
        }
        a(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (cVar.a()) {
            a(sb, i, "comparison_type", cVar.b().name());
        }
        if (cVar.c()) {
            a(sb, i, "match_as_float", Boolean.valueOf(cVar.zzuv));
        }
        a(sb, i, "comparison_value", cVar.zzuw);
        a(sb, i, "min_comparison_value", cVar.zzux);
        a(sb, i, "max_comparison_value", cVar.zzuy);
        a(sb, i);
        sb.append("}\n");
    }

    private final void a(StringBuilder sb, int i, apn.b bVar) {
        if (bVar == null) {
            return;
        }
        a(sb, i);
        sb.append("filter {\n");
        if (bVar.e()) {
            a(sb, i, "complement", Boolean.valueOf(bVar.zzur));
        }
        a(sb, i, "param_name", n().b(bVar.zzus));
        int i2 = i + 1;
        apn.e b = bVar.b();
        if (b != null) {
            a(sb, i2);
            sb.append("string_filter");
            sb.append(" {\n");
            if (b.a()) {
                a(sb, i2, "match_type", b.b().name());
            }
            a(sb, i2, "expression", b.zzvm);
            if ((b.zzue & 4) != 0) {
                a(sb, i2, "case_sensitive", Boolean.valueOf(b.zzvn));
            }
            if (b.d() > 0) {
                a(sb, i2 + 1);
                sb.append("expression_list {\n");
                for (String str : b.zzvo) {
                    a(sb, i2 + 2);
                    sb.append(str);
                    sb.append("\n");
                }
                sb.append("}\n");
            }
            a(sb, i2);
            sb.append("}\n");
        }
        a(sb, i2, "number_filter", bVar.d());
        a(sb, i);
        sb.append("}\n");
    }

    private static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        a(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends Parcelable> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            q().c.a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(bli bliVar, bva bvaVar) {
        aat.a(bliVar);
        aat.a(bvaVar);
        return !TextUtils.isEmpty(bvaVar.b) || !TextUtils.isEmpty(bvaVar.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Long> a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Long> a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                q().f.a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    q().f.a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(l().a() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(byte[] bArr) {
        aat.a(bArr);
        o().c();
        MessageDigest h = buv.h();
        if (h == null) {
            q().c.a("Failed to get MD5");
            return 0L;
        }
        return buv.a(h.digest(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] b(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            q().c.a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] c(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            q().c.a("Failed to gzip content", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Integer> e() {
        Map<String, String> a = blk.a(this.b.m());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = blk.P.a(null).intValue();
        for (Map.Entry<String, String> entry : a.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            q().f.a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    q().f.a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        return null;
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bur f() {
        return super.f();
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bvc g() {
        return super.g();
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bvk h() {
        return super.h();
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bqf i() {
        return super.i();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apv.e a(apv.c cVar, String str) {
        for (apv.e eVar : cVar.zzwj) {
            if (eVar.zzwk.equals(str)) {
                return eVar;
            }
        }
        return null;
    }
}
