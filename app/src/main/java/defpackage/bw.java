package defpackage;

import defpackage.bw;

/* renamed from: bw  reason: default package */
/* loaded from: classes2.dex */
public abstract class bw<CHILD extends bw<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    kq<? super TranscodeType> a = ko.a();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
