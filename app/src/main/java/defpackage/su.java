package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\tB\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004B\u0011\b\u0010\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/share/model/ShareOpenGraphObject;", "Lcom/facebook/share/model/ShareOpenGraphValueContainer;", "Lcom/facebook/share/model/ShareOpenGraphObject$Builder;", "builder", "(Lcom/facebook/share/model/ShareOpenGraphObject$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "Builder", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: su  reason: default package */
/* loaded from: classes2.dex */
public final class su extends sv<su, Object> {
    public static final a a = new a((byte) 0);
    public static final Parcelable.Creator<su> CREATOR = new b();

    public su(Parcel parcel) {
        super(parcel);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/model/ShareOpenGraphObject$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/ShareOpenGraphObject;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: su$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/share/model/ShareOpenGraphObject$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/ShareOpenGraphObject;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/share/model/ShareOpenGraphObject;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: su$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<su> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ su createFromParcel(Parcel parcel) {
            dqc.d(parcel, "parcel");
            return new su(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ su[] newArray(int i) {
            return new su[i];
        }
    }
}
