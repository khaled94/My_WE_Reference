package defpackage;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: i  reason: default package */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: i$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(int i, int i2, int i3, int i4, int i5);

        void a(Object obj);

        void a(List<?> list);

        void b();

        void b(Object obj);

        void c();

        void d();
    }

    /* renamed from: i$b */
    /* loaded from: classes2.dex */
    public static class b<T extends a> extends MediaController.Callback {
        protected final T a;

        public b(T t) {
            this.a = t;
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionDestroyed() {
            this.a.a();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.a.b();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            this.a.a(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.a.b(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.a.a(list);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.a.c();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.a.d();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            int i;
            T t = this.a;
            int playbackType = playbackInfo.getPlaybackType();
            AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
            if ((audioAttributes.getFlags() & 1) != 1) {
                if ((audioAttributes.getFlags() & 4) != 4) {
                    switch (audioAttributes.getUsage()) {
                        case 1:
                        case 11:
                        case 12:
                        case 14:
                        default:
                            i = 3;
                            break;
                        case 2:
                            i = 0;
                            break;
                        case 3:
                            i = 8;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i = 5;
                            break;
                        case 6:
                            i = 2;
                            break;
                        case 13:
                            i = 1;
                            break;
                    }
                } else {
                    i = 6;
                }
            } else {
                i = 7;
            }
            t.a(playbackType, i, playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }

    private i() {
    }
}
