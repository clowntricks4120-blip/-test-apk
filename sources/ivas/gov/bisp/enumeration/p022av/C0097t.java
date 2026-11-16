package ivas.gov.bisp.enumeration.p022av;

import android.text.TextUtils;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.av.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0097t {
    private static int a = 0;
    private static int b = 1;
    public final String c;
    public final String d;

    public C0097t(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 35) + (i2 | 35);
        int i4 = i3 % 128;
        b = i4;
        boolean z = false;
        if (i3 % 2 != 0 ? this == obj : this == obj) {
            int i5 = ((i4 & 108) + (i4 | 108)) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
            }
            return true;
        }
        Object obj2 = null;
        if (obj != null) {
            int i7 = i4 + 75;
            a = i7 % 128;
            int i8 = i7 % 2;
            if (C0097t.class == obj.getClass()) {
                int i9 = a + 15;
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    String str = ((C0097t) obj).c;
                    obj2.hashCode();
                    throw null;
                }
                C0097t c0097t = (C0097t) obj;
                if (TextUtils.equals(this.c, c0097t.c)) {
                    int i10 = b;
                    int i11 = (i10 & 119) + (i10 | 119);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    if (!TextUtils.equals(this.d, c0097t.d)) {
                        int i13 = b;
                        int i14 = i13 & 59;
                        int i15 = ((i13 | 59) & (~i14)) + (i14 << 1);
                        a = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        z = true;
                    }
                } else {
                    int i17 = b;
                    int i18 = i17 & 59;
                    int i19 = ((i17 | 59) & (~i18)) + (i18 << 1);
                    a = i19 % 128;
                    int i110 = i19 % 2;
                }
                int i20 = a;
                int i21 = i20 & 49;
                int i22 = -(-((i20 ^ 49) | i21));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                int i24 = i23 % 2;
                return z;
            }
        }
        int i25 = a + 23;
        b = i25 % 128;
        if (i25 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = ((i2 | 41) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            j.w("Header[name=").append(this.c);
            obj.hashCode();
            throw null;
        }
        StringBuilder sbW = j.w("Header[name=");
        sbW.append(this.c);
        int i5 = b;
        int i6 = ((i5 | 123) << 1) - (((~i5) & 123) | (i5 & (-124)));
        a = i6 % 128;
        if (i6 % 2 != 0) {
            sbW.append(",value=");
            throw null;
        }
        sbW.append(",value=");
        String strU = j.u(sbW, this.d, "]");
        int i7 = a;
        int i8 = (i7 & 15) + (i7 | 15);
        b = i8 % 128;
        int i9 = i8 % 2;
        return strU;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = i3 + ((i2 ^ 125) | i3);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.hashCode();
            this.d.hashCode();
            throw null;
        }
        int iHashCode = this.c.hashCode();
        int iHashCode2 = this.d.hashCode();
        int i5 = a;
        int i6 = ((i5 | 53) << 1) - (((~i5) & 53) | (i5 & (-54)));
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = -(~(-(-(iHashCode * 31))));
        int i10 = ((iHashCode2 & i9) + (i9 | iHashCode2)) - 1;
        int i11 = i7 & 73;
        int i12 = (i11 - (~(-(-((i7 ^ 73) | i11))))) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 1 / 0;
        }
        return i10;
    }
}
