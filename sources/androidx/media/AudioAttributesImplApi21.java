package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.support.v4.media.session.IMediaSession;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(IMediaSession.Stub.TRANSACTION_previous)
class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.a.equals(((AudioAttributesImplApi21) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("AudioAttributesCompat: audioattributes=");
        sbW.append(this.a);
        return sbW.toString();
    }
}
