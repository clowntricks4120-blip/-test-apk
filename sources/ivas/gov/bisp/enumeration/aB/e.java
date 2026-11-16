package ivas.gov.bisp.enumeration.aB;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements z {
    private static int a = 0;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:12:0x006e  */
    @Override // ivas.gov.bisp.enumeration.aB.z
    public final boolean b(List<? extends ivas.gov.bisp.enumeration.p061cg.r> list, List<z.bbj> list2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = (i2 ^ 11) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.O.r.n(list, "senders");
        int size = list.size();
        int i7 = a;
        int i8 = (i7 & (-74)) | ((~i7) & 73);
        int i9 = -(-((i7 & 73) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        boolean z = false;
        int size2 = list2.size();
        boolean z2 = i11 != 0;
        int i12 = b;
        int i13 = (-2) - (((i12 & 38) + (i12 | 38)) ^ (-1));
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        if (size == size2) {
            int i16 = i14 & 47;
            int i17 = (i14 ^ 47) | i16;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            boolean zIsEmpty = list.isEmpty();
            if ((((~(zIsEmpty ? 1 : 0)) & 1) ^ ((zIsEmpty ? 1 : 0) & (-2))) == 0) {
                int i20 = a;
                int i21 = i20 & 123;
                int i22 = (i20 | 123) & (~i21);
                int i23 = i21 << 1;
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                b = i24 % 128;
                int i25 = i24 % 2;
            } else {
                z = z2;
            }
        } else {
            int i26 = a;
            int i27 = i26 & 123;
            int i28 = (i26 | 123) & (~i27);
            int i29 = i27 << 1;
            int i210 = ((i28 | i29) << 1) - (i28 ^ i29);
            b = i210 % 128;
            int i211 = i210 % 2;
        }
        int i30 = a;
        int i31 = i30 & 107;
        int i32 = (i30 | 107) & (~i31);
        int i33 = i31 << 1;
        int i34 = (i32 & i33) + (i32 | i33);
        b = i34 % 128;
        if (i34 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
