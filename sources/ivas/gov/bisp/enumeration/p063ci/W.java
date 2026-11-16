package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class W extends Q {
    private static int a = 1;
    private static int b;

    public W() {
    }

    public W(C0270p c0270p) {
        super(c0270p);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = ((i2 ^ 47) | i3) << 1;
        int i5 = -((i2 | 47) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        aVar.x(z, 48, this.c);
        int i8 = b;
        int i9 = i8 & 9;
        int i10 = (i8 | 9) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 74) << 1) - (i2 ^ 74)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int length = this.c.length;
        int i5 = b;
        int i6 = i5 & 73;
        int i7 = (((i5 | 73) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = b;
            int i12 = i11 & 47;
            int i13 = (i11 ^ 47) | i12;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            O oF = this.c[i9].f();
            int i16 = b;
            int i17 = ((i16 ^ 100) + ((i16 & 100) << 1)) - 1;
            a = i17 % 128;
            int i18 = i17 % 2;
            int iJ = oF.j();
            if (i18 == 0) {
                int i19 = (i10 ^ iJ) + ((i10 & iJ) << 1);
                int i20 = (i9 & (-5)) + (i9 | (-5));
                i9 = (i20 ^ 70) + ((i20 & 70) << 1);
                i10 = i19;
            } else {
                int i21 = -(-iJ);
                int i22 = ((~i21) & i10) | ((~i10) & i21);
                int i23 = (i10 & i21) << 1;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                int i25 = (i9 & 126) + (i9 | 126);
                int i26 = (i25 & (-124)) + (i25 | (-124));
                i9 = (i26 ^ (-1)) + (i26 << 1);
                i10 = i24;
            }
            int i27 = a;
            int i28 = i27 & 105;
            int i29 = (((i27 ^ 105) | i28) << 1) - ((i27 | 105) & (~i28));
            b = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = (i10 & 2) + (i10 | 2);
        int i32 = (((i31 | 3) << 1) - (i31 ^ 3)) - 1;
        int i33 = b;
        int i34 = ((i33 | 17) << 1) - (i33 ^ 17);
        a = i34 % 128;
        int i35 = i34 % 2;
        return i32;
    }
}
