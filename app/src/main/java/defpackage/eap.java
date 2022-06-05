package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: eap  reason: default package */
/* loaded from: classes2.dex */
public final class eap extends ebb {
    private static final eau a = eau.a("application/x-www-form-urlencoded");
    private final List<String> b;
    private final List<String> c;

    public eap(List<String> list, List<String> list2) {
        this.b = ebk.a(list);
        this.c = ebk.a(list2);
    }

    @Override // defpackage.ebb
    public final eau a() {
        return a;
    }

    @Override // defpackage.ebb
    public final long b() {
        return a((edv) null, true);
    }

    @Override // defpackage.ebb
    public final void a(edv edvVar) throws IOException {
        a(edvVar, false);
    }

    private long a(edv edvVar, boolean z) {
        edu eduVar;
        if (z) {
            eduVar = new edu();
        } else {
            eduVar = edvVar.b();
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                eduVar.h(38);
            }
            eduVar.b(this.b.get(i));
            eduVar.h(61);
            eduVar.b(this.c.get(i));
        }
        if (z) {
            long j = eduVar.b;
            eduVar.q();
            return j;
        }
        return 0L;
    }

    /* renamed from: eap$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final List<String> a;
        public final List<String> b;
        private final Charset c;

        public a() {
            this((byte) 0);
        }

        private a(byte b) {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = null;
        }

        public final a a(String str, String str2) {
            if (str != null) {
                if (str2 == null) {
                    throw new NullPointerException("value == null");
                }
                this.a.add(eas.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.c));
                this.b.add(eas.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.c));
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public final a b(String str, String str2) {
            if (str != null) {
                if (str2 == null) {
                    throw new NullPointerException("value == null");
                }
                this.a.add(eas.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.c));
                this.b.add(eas.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.c));
                return this;
            }
            throw new NullPointerException("name == null");
        }
    }
}
