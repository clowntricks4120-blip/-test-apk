package androidx.media;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(ivas.gov.bisp.enumeration.C.j jVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        ivas.gov.bisp.enumeration.C.h hVarQ = audioAttributesCompat.b;
        if (jVar.c(1)) {
            hVarQ = jVar.q();
        }
        audioAttributesCompat.b = (AudioAttributesImpl) hVarQ;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, ivas.gov.bisp.enumeration.C.j jVar) {
        Objects.requireNonNull(jVar);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.b;
        jVar.r(1);
        jVar.y(audioAttributesImpl);
    }
}
