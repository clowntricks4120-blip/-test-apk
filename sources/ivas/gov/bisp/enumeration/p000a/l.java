package ivas.gov.bisp.enumeration.p000a;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l implements t {
    private static int a = 1;
    private static int b;
    public String c;
    public int d;
    public int e;

    public l(String str, int i, int i2) {
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 5) | (i2 & 5)) << 1) - (((~i2) & 5) | (i2 & (-6)));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.d;
        int i7 = (i4 ^ 121) + ((i4 & 121) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int iHash = Objects.hash(this.c, Integer.valueOf(i6), Integer.valueOf(this.e));
        int i9 = b + 62;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return iHash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = (i2 | 45) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        boolean z = false;
        if (i6 % 2 == 0 ? this == obj : this == obj) {
            int i8 = i7 & 53;
            int i9 = (((i7 ^ 53) | i8) << 1) - ((~i8) & (i7 | 53));
            a = i9 % 128;
            boolean z2 = i9 % 2 != 0;
            int i10 = ((i7 | 97) << 1) - (i7 ^ 97);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 80 / 0;
            }
            return z2;
        }
        if (!(obj instanceof l)) {
            int i12 = (i7 & 5) + (i7 | 5);
            a = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        l lVar = (l) obj;
        String str = this.c;
        String str2 = lVar.c;
        int i14 = i7 + 7;
        a = i14 % 128;
        int i15 = i14 % 2;
        if (!TextUtils.equals(str, str2)) {
            int i16 = a + 59;
            b = i16 % 128;
            int i17 = i16 % 2;
        } else {
            int i18 = a;
            int i19 = (i18 ^ 75) + ((i18 & 75) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = this.d;
            if (i20 != 0) {
                int i22 = 14 / 0;
                if (i21 == lVar.d) {
                    if (this.e != lVar.e) {
                        z = true;
                    }
                }
            } else if (i21 == lVar.d) {
                if (this.e != lVar.e) {
                    z = true;
                }
            }
            int i110 = a + 59;
            b = i110 % 128;
            int i111 = i110 % 2;
        }
        int i23 = b;
        int i24 = i23 & 37;
        int i25 = (((i23 | 37) & (~i24)) - (~(i24 << 1))) - 1;
        a = i25 % 128;
        int i26 = i25 % 2;
        return z;
    }
}
