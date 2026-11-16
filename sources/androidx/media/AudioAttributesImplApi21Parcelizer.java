package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(ivas.gov.bisp.enumeration.C.j jVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) jVar.p(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = jVar.m(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, ivas.gov.bisp.enumeration.C.j jVar) {
        Objects.requireNonNull(jVar);
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        jVar.r(1);
        jVar.v(audioAttributes);
        int i = audioAttributesImplApi21.b;
        jVar.r(2);
        jVar.w(i);
    }
}
