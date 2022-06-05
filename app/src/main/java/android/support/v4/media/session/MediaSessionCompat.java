package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {
    public final MediaControllerCompat a;

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Token[] newArray(int i) {
                return new Token[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }
        };
        public final Object a;
        public h b;
        Bundle c;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, null, (byte) 0);
        }

        private Token(Object obj, h hVar) {
            this(obj, hVar, (byte) 0);
        }

        private Token(Object obj, h hVar, byte b) {
            this.a = obj;
            this.b = hVar;
            this.c = null;
        }

        public static Token a(Object obj) {
            return a(obj, null);
        }

        public static Token a(Object obj, h hVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(j.a(obj), hVar);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.a);
            }
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.a;
            if (obj2 == null) {
                return token.a == null;
            }
            Object obj3 = token.a;
            if (obj3 != null) {
                return obj2.equals(obj3);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        };
        private final MediaDescriptionCompat a;
        private final long b;
        private Object c;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat != null) {
                if (j == -1) {
                    throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
                }
                this.a = mediaDescriptionCompat;
                this.b = j;
                this.c = obj;
                return;
            }
            throw new IllegalArgumentException("Description cannot be null.");
        }

        QueueItem(Parcel parcel) {
            this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.b = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
            parcel.writeLong(this.b);
        }

        public static List<QueueItem> a(List<?> list) {
            QueueItem queueItem;
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj == null || Build.VERSION.SDK_INT < 21) {
                    queueItem = null;
                } else {
                    MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) obj;
                    queueItem = new QueueItem(obj, MediaDescriptionCompat.a(queueItem2.getDescription()), queueItem2.getQueueId());
                }
                arrayList.add(queueItem);
            }
            return arrayList;
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
        }
    }

    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }
        };
        ResultReceiver a;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
        }
    }
}
