package ivas.gov.bisp.enumeration.p004ad;

import ivas.gov.bisp.enumeration.p003ac.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class R extends C0087m {
    private static int a = 0x00000000;
    private static int b = 0x00000001;
    public ArrayList<C0087m> ag = new ArrayList<>();

    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    public void v() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-22)) | ((~i2) & 21)) - (~(-(-((i2 & 21) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.ag.clear();
        super.v();
        int i5 = b + 69;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    public void x(e eVar) {
        int size;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 121;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            super.x(eVar);
            size = this.ag.size();
            i = 1;
        } else {
            super.x(eVar);
            size = this.ag.size();
            i = 0;
        }
        int i4 = a;
        int i5 = i4 & 83;
        int i6 = -(-(i4 | 83));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        while (i < size) {
            int i9 = b;
            int i10 = i9 & 99;
            int i11 = (i9 | 99) & (~i10);
            int i12 = i10 << 1;
            int i13 = (i11 & i12) + (i11 | i12);
            a = i13 % 128;
            int i14 = i13 % 2;
            this.ag.get(i).x(eVar);
            int i15 = i & 1;
            i = (i15 - (~(-(-((i ^ 1) | i15))))) - 1;
            int i16 = a;
            int i17 = i16 | 51;
            int i18 = ((i17 << 1) - (~(-((~(i16 & 51)) & i17)))) - 1;
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a + 75;
        b = i20 % 128;
        int i21 = i20 % 2;
    }

    public void F() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 61) + (i2 | 61);
        a = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<C0087m> arrayList = this.ag;
        if (arrayList == null) {
            int i5 = (i2 ^ 27) + ((i2 & 27) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        int size = arrayList.size();
        int i6 = a + 35;
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (i8 < size) {
            int i9 = b;
            int i10 = ((i9 ^ 8) + ((i9 & 8) << 1)) - 1;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                this.ag.get(i8);
                throw null;
            }
            C0087m c0087m = this.ag.get(i8);
            if (c0087m instanceof R) {
                int i11 = a + 55;
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    ((R) c0087m).F();
                    throw null;
                }
                ((R) c0087m).F();
                int i12 = b;
                int i13 = i12 & 83;
                int i14 = -(-((i12 ^ 83) | i13));
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = (i8 & (-2)) | ((~i8) & 1);
            int i18 = (i8 & 1) << 1;
            i8 = ((i18 & i17) << 1) + (i17 ^ i18);
            int i19 = a;
            int i20 = i19 & 43;
            int i21 = -(-((i19 ^ 43) | i20));
            int i22 = (i20 & i21) + (i21 | i20);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 4 / 3;
            }
        }
        int i24 = b + 97;
        a = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
    }
}
