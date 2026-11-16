package ivas.gov.bisp.enumeration.aM;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public class y implements W {
    private static int a = 1;
    private static int b;
    public final WindowId c;

    public y(View view) {
        this.c = view.getWindowId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0045  */
    public boolean equals(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (obj instanceof y) {
            int i6 = (i4 & 49) + (i4 | 49);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (((y) obj).c.equals(this.c)) {
                int i8 = a;
                int i9 = i8 & 117;
                int i10 = i9 + ((i8 ^ 117) | i9);
                b = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i8 & 55;
                int i13 = i12 + ((i8 ^ 55) | i12);
                b = i13 % 128;
                int i14 = i13 % 2;
                z = true;
            } else {
                int i15 = b;
                int i16 = (((i15 | 72) << 1) - (i15 ^ 72)) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                z = false;
            }
        } else {
            int i18 = b;
            int i19 = (((i18 | 72) << 1) - (i18 ^ 72)) - 1;
            a = i19 % 128;
            int i110 = i19 % 2;
            z = false;
        }
        int i20 = b;
        int i21 = (i20 & (-18)) | ((~i20) & 17);
        int i22 = (i20 & 17) << 1;
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 77) | (i2 & 77)) << 1;
        int i4 = -(((~i2) & 77) | (i2 & (-78)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.c.hashCode();
            throw null;
        }
        int iHashCode = this.c.hashCode();
        int i6 = b;
        int i7 = i6 & 113;
        int i8 = ((i6 ^ 113) | i7) << 1;
        int i9 = -((i6 | 113) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return iHashCode;
    }
}
