package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class D extends L {
    private static int a = 1;
    private static int b;

    public D(i iVar) {
        super(iVar);
    }

    public D(C0270p c0270p) {
        super(c0270p, false);
    }

    public D(boolean z, i[] iVarArr) {
        super(z, iVarArr);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = (i2 | 53) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        i[] iVarArr = this.c;
        if (i7 != 0) {
            aVar.x(z, 111, iVarArr);
        } else {
            aVar.x(z, 49, iVarArr);
        }
        int i8 = b;
        int i9 = (((i8 | 44) << 1) - (i8 ^ 44)) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-122)) | ((~i2) & 121);
        int i4 = (i2 & 121) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        i[] iVarArr = this.c;
        int length = i6 == 0 ? iVarArr.length : iVarArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = a;
            int i10 = (i9 ^ 115) + ((i9 & 115) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            int iJ = this.c[i7].f().j();
            int i12 = b;
            int i13 = i12 & 27;
            int i14 = (i12 ^ 27) | i13;
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            int i16 = i15 % 2;
            i8 += iJ;
            i7 = (-2) - ((i7 + 2) ^ (-1));
            int i17 = (-2) - ((i12 + 48) ^ (-1));
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = i8 & 2;
        int i20 = (~i19) & (i8 | 2);
        int i21 = i19 << 1;
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1) + 2;
        int i23 = b;
        int i24 = i23 & 105;
        int i25 = ((i23 ^ 105) | i24) << 1;
        int i26 = -((i23 | 105) & (~i24));
        int i27 = (i25 & i26) + (i26 | i25);
        a = i27 % 128;
        if (i27 % 2 != 0) {
            return i22;
        }
        throw null;
    }
}
