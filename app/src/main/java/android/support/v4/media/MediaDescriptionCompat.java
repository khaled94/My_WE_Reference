package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }
    };
    final String a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence d;
    private final Bitmap e;
    private final Uri f;
    private final Bundle g;
    private final Uri h;
    private Object i;

    /* loaded from: classes.dex */
    public static final class a {
        String a;
        CharSequence b;
        CharSequence c;
        CharSequence d;
        Bitmap e;
        Uri f;
        Bundle g;
        Uri h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.e = (Bitmap) parcel.readParcelable(classLoader);
        this.f = (Uri) parcel.readParcelable(classLoader);
        this.g = parcel.readBundle(classLoader);
        this.h = (Uri) parcel.readParcelable(classLoader);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object obj;
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            TextUtils.writeToParcel(this.d, parcel, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            parcel.writeBundle(this.g);
            parcel.writeParcelable(this.h, i);
            return;
        }
        if (this.i != null || Build.VERSION.SDK_INT < 21) {
            obj = this.i;
        } else {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.a);
            builder.setTitle(this.b);
            builder.setSubtitle(this.c);
            builder.setDescription(this.d);
            builder.setIconBitmap(this.e);
            builder.setIconUri(this.f);
            Bundle bundle = this.g;
            if (Build.VERSION.SDK_INT < 23 && this.h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
            }
            builder.setExtras(bundle);
            if (Build.VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.h);
            }
            obj = builder.build();
            this.i = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r11) {
        /*
            r0 = 0
            if (r11 == 0) goto L8c
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L8c
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            r2 = r11
            android.media.MediaDescription r2 = (android.media.MediaDescription) r2
            java.lang.String r3 = r2.getMediaId()
            r1.a = r3
            java.lang.CharSequence r3 = r2.getTitle()
            r1.b = r3
            java.lang.CharSequence r3 = r2.getSubtitle()
            r1.c = r3
            java.lang.CharSequence r3 = r2.getDescription()
            r1.d = r3
            android.graphics.Bitmap r3 = r2.getIconBitmap()
            r1.e = r3
            android.net.Uri r3 = r2.getIconUri()
            r1.f = r3
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L47
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L48
        L47:
            r5 = r0
        L48:
            if (r5 == 0) goto L60
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5a
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5a
            goto L61
        L5a:
            r3.remove(r4)
            r3.remove(r6)
        L60:
            r0 = r3
        L61:
            r1.g = r0
            if (r5 == 0) goto L68
            r1.h = r5
            goto L74
        L68:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r0 < r3) goto L74
            android.net.Uri r0 = r2.getMediaUri()
            r1.h = r0
        L74:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r3 = r1.a
            java.lang.CharSequence r4 = r1.b
            java.lang.CharSequence r5 = r1.c
            java.lang.CharSequence r6 = r1.d
            android.graphics.Bitmap r7 = r1.e
            android.net.Uri r8 = r1.f
            android.os.Bundle r9 = r1.g
            android.net.Uri r10 = r1.h
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.i = r11
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }
}
