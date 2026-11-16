package androidx.media;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(ivas.gov.bisp.enumeration.C.j jVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = jVar.m(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = jVar.m(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = jVar.m(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = jVar.m(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, ivas.gov.bisp.enumeration.C.j jVar) {
        Objects.requireNonNull(jVar);
        int i = audioAttributesImplBase.a;
        jVar.r(1);
        jVar.w(i);
        int i2 = audioAttributesImplBase.b;
        jVar.r(2);
        jVar.w(i2);
        int i3 = audioAttributesImplBase.c;
        jVar.r(3);
        jVar.w(i3);
        int i4 = audioAttributesImplBase.d;
        jVar.r(4);
        jVar.w(i4);
    }
}
