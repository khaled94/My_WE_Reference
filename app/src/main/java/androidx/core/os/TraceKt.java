package androidx.core.os;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"trace", ExifInterface.GPS_DIRECTION_TRUE, "sectionName", "", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, dov<? extends T> dovVar) {
        dqc.d(str, "sectionName");
        dqc.d(dovVar, "block");
        TraceCompat.beginSection(str);
        try {
            return dovVar.invoke();
        } finally {
            TraceCompat.endSection();
        }
    }
}
