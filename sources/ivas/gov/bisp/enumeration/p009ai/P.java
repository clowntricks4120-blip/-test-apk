package ivas.gov.bisp.enumeration.p009ai;

import android.graphics.Typeface;
import android.os.Handler;
import ivas.gov.bisp.enumeration.p006af.h;

/* JADX INFO: loaded from: classes.dex */
public class P {
    private static int a = 0;
    private static int b = 1;
    public final h c;
    public final Handler d;

    public P(h hVar, Handler handler) {
        this.c = hVar;
        this.d = handler;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[PHI: r1
  0x0031: PHI (r1v15 int) = (r1v4 int), (r1v16 int) binds: [B:8:0x001c, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e A[PHI: r1
  0x001e: PHI (r1v5 int) = (r1v4 int), (r1v16 int) binds: [B:8:0x001c, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public void c(x.aVW avw) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = b + 39;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            i = avw.b;
            int i4 = 75 / 0;
            if (i == 0) {
                int i5 = b;
                int i6 = i5 & 17;
                int i7 = (i5 ^ 17) | i6;
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                a = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                int i10 = b;
                int i11 = i10 ^ 19;
                int i12 = (((i10 & 19) | i11) << 1) - i11;
                a = i12 % 128;
                int i13 = i12 % 2;
                z = false;
            }
        } else {
            i = avw.b;
            if (i == 0) {
                int i14 = b;
                int i15 = i14 & 17;
                int i16 = (i14 ^ 17) | i15;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                a = i17 % 128;
                int i18 = i17 % 2;
                z = true;
            } else {
                int i19 = b;
                int i110 = i19 ^ 19;
                int i111 = (((i19 & 19) | i110) << 1) - i110;
                a = i111 % 128;
                int i112 = i111 % 2;
                z = false;
            }
        }
        if (!z) {
            h hVar = this.c;
            Handler handler = this.d;
            z zVar = new z(this, hVar, i);
            int i20 = a;
            int i21 = (i20 ^ 75) + ((i20 & 75) << 1);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                handler.post(zVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            handler.post(zVar);
            int i22 = a;
            int i23 = i22 & 87;
            int i24 = -(-((i22 ^ 87) | i23));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
            return;
        }
        Typeface typeface = avw.a;
        h hVar2 = this.c;
        Handler handler2 = this.d;
        RunnableC0091p runnableC0091p = new RunnableC0091p(this, hVar2, typeface);
        int i27 = a;
        int i28 = i27 & 21;
        int i29 = (i27 ^ 21) | i28;
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        b = i30 % 128;
        int i31 = i30 % 2;
        handler2.post(runnableC0091p);
        int i32 = b;
        int i33 = (i32 & (-20)) | ((~i32) & 19);
        int i34 = -(-((i32 & 19) << 1));
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        a = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 94 / 0;
        }
    }
}
