package androidx.core.util;

import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a3\u0010\u0007\u001a\u00020\b*\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000\u001a\u0014\u0010\u000f\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0011\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"readBytes", "", "Landroid/util/AtomicFile;", "readText", "", "charset", "Ljava/nio/charset/Charset;", "tryWrite", "", "block", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", "name", "out", "writeBytes", "array", "writeText", "text", "core-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AtomicFileKt {
    public static final void tryWrite(AtomicFile atomicFile, dow<? super FileOutputStream, dmg> dowVar) {
        dqc.d(atomicFile, "<this>");
        dqc.d(dowVar, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            dqc.b(startWrite, "stream");
            dowVar.invoke(startWrite);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static /* synthetic */ void writeText$default(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = dsd.a;
        }
        writeText(atomicFile, str, charset);
    }

    public static final void writeText(AtomicFile atomicFile, String str, Charset charset) {
        dqc.d(atomicFile, "<this>");
        dqc.d(str, "text");
        dqc.d(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        dqc.b(bytes, "(this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static final byte[] readBytes(AtomicFile atomicFile) {
        dqc.d(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        dqc.b(readFully, "readFully()");
        return readFully;
    }

    public static /* synthetic */ String readText$default(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = dsd.a;
        }
        return readText(atomicFile, charset);
    }

    public static final String readText(AtomicFile atomicFile, Charset charset) {
        dqc.d(atomicFile, "<this>");
        dqc.d(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        dqc.b(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static final void writeBytes(AtomicFile atomicFile, byte[] bArr) {
        dqc.d(atomicFile, "<this>");
        dqc.d(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            dqc.b(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }
}
