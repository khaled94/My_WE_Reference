package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdv;
import defpackage.cff;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: ccr  reason: default package */
/* loaded from: classes2.dex */
abstract class ccr implements ces {
    /* synthetic */ ccr(byte b) {
        this();
    }

    private ccr() {
    }

    /* renamed from: ccr$a */
    /* loaded from: classes2.dex */
    static final class a extends ccr {
        private final boolean a = true;
        private final byte[] b;
        private int c;
        private final int d;
        private int e;
        private int f;
        private int g;

        public a(ByteBuffer byteBuffer) {
            super((byte) 0);
            this.b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.c = arrayOffset;
            this.d = arrayOffset;
            this.e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean u() {
            return this.c == this.e;
        }

        @Override // defpackage.ces
        public final int a() throws IOException {
            if (u()) {
                return Integer.MAX_VALUE;
            }
            int v = v();
            this.f = v;
            if (v != this.g) {
                return cff.b(v);
            }
            return Integer.MAX_VALUE;
        }

        @Override // defpackage.ces
        public final int b() {
            return this.f;
        }

        @Override // defpackage.ces
        public final boolean c() throws IOException {
            int i;
            if (u() || (i = this.f) == this.g) {
                return false;
            }
            int a = cff.a(i);
            if (a == 0) {
                int i2 = this.e;
                int i3 = this.c;
                if (i2 - i3 >= 10) {
                    byte[] bArr = this.b;
                    int i4 = 0;
                    while (i4 < 10) {
                        int i5 = i3 + 1;
                        if (bArr[i3] >= 0) {
                            this.c = i5;
                            break;
                        }
                        i4++;
                        i3 = i5;
                    }
                }
                for (int i6 = 0; i6 < 10; i6++) {
                    if (y() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.c();
            } else if (a == 1) {
                a(8);
                return true;
            } else if (a == 2) {
                a(v());
                return true;
            } else if (a != 3) {
                if (a == 5) {
                    a(4);
                    return true;
                }
                throw InvalidProtocolBufferException.f();
            } else {
                int i7 = this.g;
                this.g = cff.a(cff.b(this.f), 4);
                while (a() != Integer.MAX_VALUE && c()) {
                }
                if (this.f != this.g) {
                    throw InvalidProtocolBufferException.h();
                }
                this.g = i7;
                return true;
            }
        }

        @Override // defpackage.ces
        public final double d() throws IOException {
            c(1);
            return Double.longBitsToDouble(A());
        }

        @Override // defpackage.ces
        public final float e() throws IOException {
            c(5);
            return Float.intBitsToFloat(z());
        }

        @Override // defpackage.ces
        public final long f() throws IOException {
            c(0);
            return w();
        }

        @Override // defpackage.ces
        public final long g() throws IOException {
            c(0);
            return w();
        }

        @Override // defpackage.ces
        public final int h() throws IOException {
            c(0);
            return v();
        }

        @Override // defpackage.ces
        public final long i() throws IOException {
            c(1);
            return A();
        }

        @Override // defpackage.ces
        public final int j() throws IOException {
            c(5);
            return z();
        }

        @Override // defpackage.ces
        public final boolean k() throws IOException {
            c(0);
            return v() != 0;
        }

        @Override // defpackage.ces
        public final String l() throws IOException {
            return a(false);
        }

        @Override // defpackage.ces
        public final String m() throws IOException {
            return a(true);
        }

        private String a(boolean z) throws IOException {
            c(2);
            int v = v();
            if (v == 0) {
                return "";
            }
            b(v);
            if (z) {
                byte[] bArr = this.b;
                int i = this.c;
                if (!cfe.a(bArr, i, i + v)) {
                    throw InvalidProtocolBufferException.i();
                }
            }
            String str = new String(this.b, this.c, v, cdm.a);
            this.c += v;
            return str;
        }

        @Override // defpackage.ces
        public final <T> T a(Class<T> cls, cdb cdbVar) throws IOException {
            c(2);
            return (T) c(ceo.a().a((Class) cls), cdbVar);
        }

        @Override // defpackage.ces
        public final <T> T a(cet<T> cetVar, cdb cdbVar) throws IOException {
            c(2);
            return (T) c(cetVar, cdbVar);
        }

        private <T> T c(cet<T> cetVar, cdb cdbVar) throws IOException {
            int v = v();
            b(v);
            int i = this.e;
            int i2 = this.c + v;
            this.e = i2;
            try {
                T a = cetVar.a();
                cetVar.a(a, this, cdbVar);
                cetVar.d(a);
                if (this.c == i2) {
                    return a;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.e = i;
            }
        }

        @Override // defpackage.ces
        public final <T> T b(Class<T> cls, cdb cdbVar) throws IOException {
            c(3);
            return (T) d(ceo.a().a((Class) cls), cdbVar);
        }

        @Override // defpackage.ces
        public final <T> T b(cet<T> cetVar, cdb cdbVar) throws IOException {
            c(3);
            return (T) d(cetVar, cdbVar);
        }

        private <T> T d(cet<T> cetVar, cdb cdbVar) throws IOException {
            int i = this.g;
            this.g = cff.a(cff.b(this.f), 4);
            try {
                T a = cetVar.a();
                cetVar.a(a, this, cdbVar);
                cetVar.d(a);
                if (this.f == this.g) {
                    return a;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.g = i;
            }
        }

        @Override // defpackage.ces
        public final ccu n() throws IOException {
            ccu ccuVar;
            c(2);
            int v = v();
            if (v == 0) {
                return ccu.a;
            }
            b(v);
            if (this.a) {
                ccuVar = ccu.b(this.b, this.c, v);
            } else {
                ccuVar = ccu.a(this.b, this.c, v);
            }
            this.c += v;
            return ccuVar;
        }

        @Override // defpackage.ces
        public final int o() throws IOException {
            c(0);
            return v();
        }

        @Override // defpackage.ces
        public final int p() throws IOException {
            c(0);
            return v();
        }

        @Override // defpackage.ces
        public final int q() throws IOException {
            c(5);
            return z();
        }

        @Override // defpackage.ces
        public final long r() throws IOException {
            c(1);
            return A();
        }

        @Override // defpackage.ces
        public final int s() throws IOException {
            c(0);
            return ccv.e(v());
        }

        @Override // defpackage.ces
        public final long t() throws IOException {
            c(0);
            return ccv.a(w());
        }

        @Override // defpackage.ces
        public final void a(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof ccy) {
                ccy ccyVar = (ccy) list;
                int a = cff.a(this.f);
                if (a == 1) {
                    do {
                        ccyVar.a(d());
                        if (u()) {
                            return;
                        }
                        i2 = this.c;
                    } while (v() == this.f);
                    this.c = i2;
                    return;
                } else if (a == 2) {
                    int v = v();
                    d(v);
                    int i3 = this.c + v;
                    while (this.c < i3) {
                        ccyVar.a(Double.longBitsToDouble(C()));
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            int a2 = cff.a(this.f);
            if (a2 == 1) {
                do {
                    list.add(Double.valueOf(d()));
                    if (u()) {
                        return;
                    }
                    i = this.c;
                } while (v() == this.f);
                this.c = i;
            } else if (a2 == 2) {
                int v2 = v();
                d(v2);
                int i4 = this.c + v2;
                while (this.c < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(C())));
                }
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // defpackage.ces
        public final void b(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdi) {
                cdi cdiVar = (cdi) list;
                int a = cff.a(this.f);
                if (a == 2) {
                    int v = v();
                    e(v);
                    int i3 = this.c + v;
                    while (this.c < i3) {
                        cdiVar.a(Float.intBitsToFloat(B()));
                    }
                    return;
                } else if (a == 5) {
                    do {
                        cdiVar.a(e());
                        if (u()) {
                            return;
                        }
                        i2 = this.c;
                    } while (v() == this.f);
                    this.c = i2;
                    return;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            int a2 = cff.a(this.f);
            if (a2 == 2) {
                int v2 = v();
                e(v2);
                int i4 = this.c + v2;
                while (this.c < i4) {
                    list.add(Float.valueOf(Float.intBitsToFloat(B())));
                }
            } else if (a2 == 5) {
                do {
                    list.add(Float.valueOf(e()));
                    if (u()) {
                        return;
                    }
                    i = this.c;
                } while (v() == this.f);
                this.c = i;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // defpackage.ces
        public final void c(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdt) {
                cdt cdtVar = (cdt) list;
                int a = cff.a(this.f);
                if (a == 0) {
                    do {
                        cdtVar.a(f());
                        if (u()) {
                            return;
                        }
                        i2 = this.c;
                    } while (v() == this.f);
                    this.c = i2;
                    return;
                } else if (a == 2) {
                    int v = this.c + v();
                    while (this.c < v) {
                        cdtVar.a(w());
                    }
                    f(v);
                    return;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            int a2 = cff.a(this.f);
            if (a2 == 0) {
                do {
                    list.add(Long.valueOf(f()));
                    if (u()) {
                        return;
                    }
                    i = this.c;
                } while (v() == this.f);
                this.c = i;
            } else if (a2 == 2) {
                int v2 = this.c + v();
                while (this.c < v2) {
                    list.add(Long.valueOf(w()));
                }
                f(v2);
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // defpackage.ces
        public final void d(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdt) {
                cdt cdtVar = (cdt) list;
                int a = cff.a(this.f);
                if (a == 0) {
                    do {
                        cdtVar.a(g());
                        if (u()) {
                            return;
                        }
                        i2 = this.c;
                    } while (v() == this.f);
                    this.c = i2;
                    return;
                } else if (a == 2) {
                    int v = this.c + v();
                    while (this.c < v) {
                        cdtVar.a(w());
                    }
                    f(v);
                    return;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            int a2 = cff.a(this.f);
            if (a2 == 0) {
                do {
                    list.add(Long.valueOf(g()));
                    if (u()) {
                        return;
                    }
                    i = this.c;
                } while (v() == this.f);
                this.c = i;
            } else if (a2 == 2) {
                int v2 = this.c + v();
                while (this.c < v2) {
                    list.add(Long.valueOf(w()));
                }
                f(v2);
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // defpackage.ces
        public final void e(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdl) {
                cdl cdlVar = (cdl) list;
                int a = cff.a(this.f);
                if (a == 0) {
                    do {
                        cdlVar.c(h());
                        if (u()) {
                            return;
                        }
                        i2 = this.c;
                    } while (v() == this.f);
                    this.c = i2;
                    return;
                } else if (a == 2) {
                    int v = this.c + v();
                    while (this.c < v) {
                        cdlVar.c(v());
                    }
                    f(v);
                    return;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            int a2 = cff.a(this.f);
            if (a2 == 0) {
                do {
                    list.add(Integer.valueOf(h()));
                    if (u()) {
                        return;
                    }
                    i = this.c;
                } while (v() == this.f);
                this.c = i;
            } else if (a2 == 2) {
                int v2 = this.c + v();
                while (this.c < v2) {
                    list.add(Integer.valueOf(v()));
                }
                f(v2);
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // defpackage.ces
        public final void f(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdt) {
                cdt cdtVar = (cdt) list;
                int a = cff.a(this.f);
                if (a == 1) {
                    do {
                        cdtVar.a(i());
                        if (u()) {
                            return;
                        }
                        i2 = this.c;
                    } while (v() == this.f);
                    this.c = i2;
                    return;
                } else if (a == 2) {
                    int v = v();
                    d(v);
                    int i3 = this.c + v;
                    while (this.c < i3) {
                        cdtVar.a(C());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            int a2 = cff.a(this.f);
            if (a2 == 1) {
                do {
                    list.add(Long.valueOf(i()));
                    if (u()) {
                        return;
                    }
                    i = this.c;
                } while (v() == this.f);
                this.c = i;
            } else if (a2 == 2) {
                int v2 = v();
                d(v2);
                int i4 = this.c + v2;
                while (this.c < i4) {
                    list.add(Long.valueOf(C()));
                }
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // defpackage.ces
        public final void g(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdl) {
                cdl cdlVar = (cdl) list;
                int a = cff.a(this.f);
                if (a == 2) {
                    int v = v();
                    e(v);
                    int i3 = this.c + v;
                    while (this.c < i3) {
                        cdlVar.c(B());
                    }
                    return;
                } else if (a == 5) {
                    do {
                        cdlVar.c(j());
                        if (u()) {
                            return;
                        }
                        i2 = this.c;
                    } while (v() == this.f);
                    this.c = i2;
                    return;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            int a2 = cff.a(this.f);
            if (a2 == 2) {
                int v2 = v();
                e(v2);
                int i4 = this.c + v2;
                while (this.c < i4) {
                    list.add(Integer.valueOf(B()));
                }
            } else if (a2 == 5) {
                do {
                    list.add(Integer.valueOf(j()));
                    if (u()) {
                        return;
                    }
                    i = this.c;
                } while (v() == this.f);
                this.c = i;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // defpackage.ces
        public final void h(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (list instanceof ccs) {
                ccs ccsVar = (ccs) list;
                int a = cff.a(this.f);
                if (a != 0) {
                    if (a == 2) {
                        int v = this.c + v();
                        while (this.c < v) {
                            ccsVar.a(v() != 0);
                        }
                        f(v);
                        return;
                    }
                    throw InvalidProtocolBufferException.f();
                }
                do {
                    ccsVar.a(k());
                    if (u()) {
                        return;
                    }
                    i2 = this.c;
                } while (v() == this.f);
                this.c = i2;
                return;
            }
            int a2 = cff.a(this.f);
            if (a2 != 0) {
                if (a2 == 2) {
                    int v2 = this.c + v();
                    while (this.c < v2) {
                        list.add(Boolean.valueOf(v() != 0));
                    }
                    f(v2);
                    return;
                }
                throw InvalidProtocolBufferException.f();
            }
            do {
                list.add(Boolean.valueOf(k()));
                if (u()) {
                    return;
                }
                i = this.c;
            } while (v() == this.f);
            this.c = i;
        }

        @Override // defpackage.ces
        public final void i(List<String> list) throws IOException {
            a(list, false);
        }

        @Override // defpackage.ces
        public final void j(List<String> list) throws IOException {
            a(list, true);
        }

        private void a(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (cff.a(this.f) != 2) {
                throw InvalidProtocolBufferException.f();
            }
            if ((list instanceof cdr) && !z) {
                cdr cdrVar = (cdr) list;
                do {
                    cdrVar.a(n());
                    if (u()) {
                        return;
                    }
                    i2 = this.c;
                } while (v() == this.f);
                this.c = i2;
                return;
            }
            do {
                list.add(a(z));
                if (u()) {
                    return;
                }
                i = this.c;
            } while (v() == this.f);
            this.c = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ces
        public final <T> void a(List<T> list, cet<T> cetVar, cdb cdbVar) throws IOException {
            int i;
            if (cff.a(this.f) != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int i2 = this.f;
            do {
                list.add(c(cetVar, cdbVar));
                if (u()) {
                    return;
                }
                i = this.c;
            } while (v() == i2);
            this.c = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ces
        public final <T> void b(List<T> list, cet<T> cetVar, cdb cdbVar) throws IOException {
            int i;
            if (cff.a(this.f) != 3) {
                throw InvalidProtocolBufferException.f();
            }
            int i2 = this.f;
            do {
                list.add(d(cetVar, cdbVar));
                if (u()) {
                    return;
                }
                i = this.c;
            } while (v() == i2);
            this.c = i;
        }

        @Override // defpackage.ces
        public final void k(List<ccu> list) throws IOException {
            int i;
            if (cff.a(this.f) != 2) {
                throw InvalidProtocolBufferException.f();
            }
            do {
                list.add(n());
                if (u()) {
                    return;
                }
                i = this.c;
            } while (v() == this.f);
            this.c = i;
        }

        @Override // defpackage.ces
        public final void l(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdl) {
                cdl cdlVar = (cdl) list;
                int a = cff.a(this.f);
                if (a != 0) {
                    if (a == 2) {
                        int v = this.c + v();
                        while (this.c < v) {
                            cdlVar.c(v());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.f();
                }
                do {
                    cdlVar.c(o());
                    if (u()) {
                        return;
                    }
                    i2 = this.c;
                } while (v() == this.f);
                this.c = i2;
                return;
            }
            int a2 = cff.a(this.f);
            if (a2 != 0) {
                if (a2 == 2) {
                    int v2 = this.c + v();
                    while (this.c < v2) {
                        list.add(Integer.valueOf(v()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.f();
            }
            do {
                list.add(Integer.valueOf(o()));
                if (u()) {
                    return;
                }
                i = this.c;
            } while (v() == this.f);
            this.c = i;
        }

        @Override // defpackage.ces
        public final void m(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdl) {
                cdl cdlVar = (cdl) list;
                int a = cff.a(this.f);
                if (a != 0) {
                    if (a == 2) {
                        int v = this.c + v();
                        while (this.c < v) {
                            cdlVar.c(v());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.f();
                }
                do {
                    cdlVar.c(p());
                    if (u()) {
                        return;
                    }
                    i2 = this.c;
                } while (v() == this.f);
                this.c = i2;
                return;
            }
            int a2 = cff.a(this.f);
            if (a2 != 0) {
                if (a2 == 2) {
                    int v2 = this.c + v();
                    while (this.c < v2) {
                        list.add(Integer.valueOf(v()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.f();
            }
            do {
                list.add(Integer.valueOf(p()));
                if (u()) {
                    return;
                }
                i = this.c;
            } while (v() == this.f);
            this.c = i;
        }

        @Override // defpackage.ces
        public final void n(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdl) {
                cdl cdlVar = (cdl) list;
                int a = cff.a(this.f);
                if (a == 2) {
                    int v = v();
                    e(v);
                    int i3 = this.c + v;
                    while (this.c < i3) {
                        cdlVar.c(B());
                    }
                    return;
                } else if (a == 5) {
                    do {
                        cdlVar.c(q());
                        if (u()) {
                            return;
                        }
                        i2 = this.c;
                    } while (v() == this.f);
                    this.c = i2;
                    return;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            int a2 = cff.a(this.f);
            if (a2 == 2) {
                int v2 = v();
                e(v2);
                int i4 = this.c + v2;
                while (this.c < i4) {
                    list.add(Integer.valueOf(B()));
                }
            } else if (a2 == 5) {
                do {
                    list.add(Integer.valueOf(q()));
                    if (u()) {
                        return;
                    }
                    i = this.c;
                } while (v() == this.f);
                this.c = i;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // defpackage.ces
        public final void o(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdt) {
                cdt cdtVar = (cdt) list;
                int a = cff.a(this.f);
                if (a == 1) {
                    do {
                        cdtVar.a(r());
                        if (u()) {
                            return;
                        }
                        i2 = this.c;
                    } while (v() == this.f);
                    this.c = i2;
                    return;
                } else if (a == 2) {
                    int v = v();
                    d(v);
                    int i3 = this.c + v;
                    while (this.c < i3) {
                        cdtVar.a(C());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            int a2 = cff.a(this.f);
            if (a2 == 1) {
                do {
                    list.add(Long.valueOf(r()));
                    if (u()) {
                        return;
                    }
                    i = this.c;
                } while (v() == this.f);
                this.c = i;
            } else if (a2 == 2) {
                int v2 = v();
                d(v2);
                int i4 = this.c + v2;
                while (this.c < i4) {
                    list.add(Long.valueOf(C()));
                }
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // defpackage.ces
        public final void p(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdl) {
                cdl cdlVar = (cdl) list;
                int a = cff.a(this.f);
                if (a != 0) {
                    if (a == 2) {
                        int v = this.c + v();
                        while (this.c < v) {
                            cdlVar.c(ccv.e(v()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.f();
                }
                do {
                    cdlVar.c(s());
                    if (u()) {
                        return;
                    }
                    i2 = this.c;
                } while (v() == this.f);
                this.c = i2;
                return;
            }
            int a2 = cff.a(this.f);
            if (a2 != 0) {
                if (a2 == 2) {
                    int v2 = this.c + v();
                    while (this.c < v2) {
                        list.add(Integer.valueOf(ccv.e(v())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.f();
            }
            do {
                list.add(Integer.valueOf(s()));
                if (u()) {
                    return;
                }
                i = this.c;
            } while (v() == this.f);
            this.c = i;
        }

        @Override // defpackage.ces
        public final void q(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof cdt) {
                cdt cdtVar = (cdt) list;
                int a = cff.a(this.f);
                if (a != 0) {
                    if (a == 2) {
                        int v = this.c + v();
                        while (this.c < v) {
                            cdtVar.a(ccv.a(w()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.f();
                }
                do {
                    cdtVar.a(t());
                    if (u()) {
                        return;
                    }
                    i2 = this.c;
                } while (v() == this.f);
                this.c = i2;
                return;
            }
            int a2 = cff.a(this.f);
            if (a2 != 0) {
                if (a2 == 2) {
                    int v2 = this.c + v();
                    while (this.c < v2) {
                        list.add(Long.valueOf(ccv.a(w())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.f();
            }
            do {
                list.add(Long.valueOf(t()));
                if (u()) {
                    return;
                }
                i = this.c;
            } while (v() == this.f);
            this.c = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ces
        public final <K, V> void a(Map<K, V> map, cdv.a<K, V> aVar, cdb cdbVar) throws IOException {
            c(2);
            int v = v();
            b(v);
            int i = this.e;
            this.e = this.c + v;
            try {
                Object obj = aVar.b;
                Object obj2 = aVar.d;
                while (true) {
                    int a = a();
                    if (a == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (a == 1) {
                        obj = a(aVar.a, (Class<?>) null, (cdb) null);
                    } else if (a == 2) {
                        obj2 = a(aVar.c, aVar.d.getClass(), cdbVar);
                    } else {
                        try {
                            if (!c()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!c()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    }
                }
            } finally {
                this.e = i;
            }
        }

        private Object a(cff.a aVar, Class<?> cls, cdb cdbVar) throws IOException {
            switch (AnonymousClass1.a[aVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(k());
                case 2:
                    return n();
                case 3:
                    return Double.valueOf(d());
                case 4:
                    return Integer.valueOf(p());
                case 5:
                    return Integer.valueOf(j());
                case 6:
                    return Long.valueOf(i());
                case 7:
                    return Float.valueOf(e());
                case 8:
                    return Integer.valueOf(h());
                case 9:
                    return Long.valueOf(g());
                case 10:
                    return a(cls, cdbVar);
                case 11:
                    return Integer.valueOf(q());
                case 12:
                    return Long.valueOf(r());
                case 13:
                    return Integer.valueOf(s());
                case 14:
                    return Long.valueOf(t());
                case 15:
                    return a(true);
                case 16:
                    return Integer.valueOf(o());
                case 17:
                    return Long.valueOf(f());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private int v() throws IOException {
            int i;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == i2) {
                throw InvalidProtocolBufferException.a();
            }
            byte[] bArr = this.b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.c = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return (int) x();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                                if (bArr[i7] < 0) {
                                                    throw InvalidProtocolBufferException.c();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.c = i5;
                return i;
            }
        }

        private long w() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == i2) {
                throw InvalidProtocolBufferException.a();
            }
            byte[] bArr = this.b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.c = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return x();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i5 = i7;
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            long j4 = i9;
                            int i10 = i5 + 1;
                            long j5 = j4 ^ (bArr[i5] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5 = i10 + 1;
                                long j6 = j5 ^ (bArr[i10] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j5 = j6 ^ (bArr[i5] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j6 = j5 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i11 = i5 + 1;
                                            long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i5 = i11 + 1;
                                                if (bArr[i11] < 0) {
                                                    throw InvalidProtocolBufferException.c();
                                                }
                                            } else {
                                                i5 = i11;
                                            }
                                            j = j7;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                            }
                            j = j5 ^ j3;
                            i5 = i10;
                        }
                    }
                    this.c = i5;
                    return j;
                }
                i = i6 ^ (-128);
                j = i;
                this.c = i5;
                return j;
            }
        }

        private long x() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte y = y();
                j |= (y & Byte.MAX_VALUE) << i;
                if ((y & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        private byte y() throws IOException {
            int i = this.c;
            if (i == this.e) {
                throw InvalidProtocolBufferException.a();
            }
            byte[] bArr = this.b;
            this.c = i + 1;
            return bArr[i];
        }

        private int z() throws IOException {
            b(4);
            return B();
        }

        private long A() throws IOException {
            b(8);
            return C();
        }

        private int B() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long C() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        private void a(int i) throws IOException {
            b(i);
            this.c += i;
        }

        private void b(int i) throws IOException {
            if (i < 0 || i > this.e - this.c) {
                throw InvalidProtocolBufferException.a();
            }
        }

        private void c(int i) throws IOException {
            if (cff.a(this.f) == i) {
                return;
            }
            throw InvalidProtocolBufferException.f();
        }

        private void d(int i) throws IOException {
            b(i);
            if ((i & 7) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.h();
        }

        private void e(int i) throws IOException {
            b(i);
            if ((i & 3) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.h();
        }

        private void f(int i) throws IOException {
            if (this.c == i) {
                return;
            }
            throw InvalidProtocolBufferException.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ccr$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cff.a.values().length];
            a = iArr;
            try {
                iArr[cff.a.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cff.a.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cff.a.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cff.a.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[cff.a.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[cff.a.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[cff.a.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[cff.a.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[cff.a.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[cff.a.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[cff.a.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[cff.a.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[cff.a.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[cff.a.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[cff.a.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[cff.a.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[cff.a.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }
}
