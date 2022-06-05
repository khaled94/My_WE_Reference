package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\f\r\u000eB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ucare/mywe/core/common/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "Error", "Loading", "Success", "Lcom/ucare/mywe/core/common/Resource$Success;", "Lcom/ucare/mywe/core/common/Resource$Error;", "Lcom/ucare/mywe/core/common/Resource$Loading;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: cvs  reason: default package */
/* loaded from: classes2.dex */
public abstract class cvs<T> {
    private final T a;
    private final String b;

    public /* synthetic */ cvs(Object obj, String str, byte b2) {
        this(obj, str);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ucare/mywe/core/common/Resource$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ucare/mywe/core/common/Resource;", "data", "(Ljava/lang/Object;)V", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: cvs$c */
    /* loaded from: classes2.dex */
    public static final class c<T> extends cvs<T> {
        public c(T t) {
            super(t);
        }
    }

    public /* synthetic */ cvs(Object obj) {
        this(obj, null, (byte) 0);
    }

    private cvs(T t, String str) {
        this.a = t;
        this.b = str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ucare/mywe/core/common/Resource$Error;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ucare/mywe/core/common/Resource;", "message", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: cvs$a */
    /* loaded from: classes2.dex */
    public static final class a<T> extends cvs<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private a(String str) {
            super(null, str, (byte) 0);
            dqc.d(str, "message");
        }

        public /* synthetic */ a(String str, byte b) {
            this(str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ucare/mywe/core/common/Resource$Loading;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ucare/mywe/core/common/Resource;", "data", "(Ljava/lang/Object;)V", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: cvs$b */
    /* loaded from: classes2.dex */
    public static final class b<T> extends cvs<T> {
        public b() {
            this((byte) 0);
        }

        public /* synthetic */ b(byte b) {
            this((char) 0);
        }

        private b(char c) {
            super(null);
        }
    }
}
