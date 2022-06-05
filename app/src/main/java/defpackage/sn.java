package defpackage;

import android.net.Uri;
import android.os.Parcel;
import androidx.exifinterface.media.ExifInterface;
import defpackage.sn;
import defpackage.so;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0000*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004:\u0001%B\u001b\b\u0014\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\u0010\u0006B\u000f\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001fH\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/facebook/share/model/ShareContent;", "P", ExifInterface.LONGITUDE_EAST, "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/model/ShareModel;", "builder", "(Lcom/facebook/share/model/ShareContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "contentUrl", "Landroid/net/Uri;", "getContentUrl", "()Landroid/net/Uri;", "pageId", "", "getPageId", "()Ljava/lang/String;", "peopleIds", "", "getPeopleIds", "()Ljava/util/List;", "placeId", "getPlaceId", "ref", "getRef", "shareHashtag", "Lcom/facebook/share/model/ShareHashtag;", "getShareHashtag", "()Lcom/facebook/share/model/ShareHashtag;", "describeContents", "", "readUnmodifiableStringList", "writeToParcel", "", "out", "flags", "Builder", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: sn  reason: default package */
/* loaded from: classes2.dex */
public abstract class sn<P extends sn<P, E>, E extends Object<P, E>> implements sr {
    public final Uri a;
    public final so b;
    private final List<String> c;
    private final String d;
    private final String e;
    private final String f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public sn(Parcel parcel) {
        dqc.d(parcel, "parcel");
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.c = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.b = new so.a().a(parcel).a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        dqc.d(parcel, "out");
        parcel.writeParcelable(this.a, 0);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.b, 0);
    }
}
