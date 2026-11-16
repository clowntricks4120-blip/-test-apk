package ivas.gov.bisp.enumeration.B;

import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.N;
import ivas.gov.bisp.enumeration.p004ad.O;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class am extends Y {
    private static int a = 0;
    private static int b = 1;
    public ArrayList<Y> m;
    public int n;

    /* JADX WARN: Code duplicated, block: B:61:0x0257  */
    public am(C0087m c0087m, int i) {
        C0087m c0087m2;
        Y y;
        int i2;
        ArrayList<Y> arrayList;
        int size;
        Y y2;
        super(c0087m);
        this.m = new ArrayList<>();
        this.h = i;
        C0087m c0087m3 = this.e;
        C0087m c0087mM = c0087m3.m(i);
        int i3 = 2 % 2;
        while (true) {
            C0087m c0087m4 = c0087mM;
            c0087m2 = c0087m3;
            c0087m3 = c0087m4;
            if (c0087m3 == null) {
                break;
            }
            int i4 = a;
            int i5 = i4 & 7;
            int i6 = -(-((i4 ^ 7) | i5));
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            c0087mM = c0087m3.m(this.h);
            int i9 = b;
            int i10 = i9 & 89;
            int i11 = -(-(i9 | 89));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        this.e = c0087m2;
        ArrayList<Y> arrayList2 = this.m;
        int i14 = this.h;
        int i15 = a;
        int i16 = i15 & 75;
        int i17 = (((i15 | 75) & (~i16)) - (~(i16 << 1))) - 1;
        int i18 = i17 % 128;
        b = i18;
        int i19 = i17 % 2;
        Object obj = null;
        if (i14 == 0) {
            int i20 = i18 & 123;
            int i21 = (i18 | 123) & (~i20);
            int i22 = -(-(i20 << 1));
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            if (i23 % 2 != 0) {
                D d = c0087m2.g;
                throw null;
            }
            y = c0087m2.g;
            int i24 = a;
            int i25 = ((i24 | 23) << 1) - (((~i24) & 23) | (i24 & (-24)));
            b = i25 % 128;
            int i26 = i25 % 2;
        } else if (i14 == 1) {
            int i27 = (((i18 ^ 5) | (i18 & 5)) << 1) - (((~i18) & 5) | (i18 & (-6)));
            a = i27 % 128;
            if (i27 % 2 != 0) {
                X x = c0087m2.i;
                throw null;
            }
            y = c0087m2.i;
            int i28 = a + 69;
            b = i28 % 128;
            int i29 = i28 % 2;
        } else {
            int i30 = (i18 & (-64)) | ((~i18) & 63);
            int i31 = -(-((i18 & 63) << 1));
            int i32 = (i30 & i31) + (i30 | i31);
            a = i32 % 128;
            int i33 = i32 % 2;
            y = null;
        }
        arrayList2.add(y);
        int i34 = this.h;
        int i35 = b + 107;
        a = i35 % 128;
        if (i35 % 2 != 0) {
            c0087m2.l(i34);
            obj.hashCode();
            throw null;
        }
        C0087m c0087mL = c0087m2.l(i34);
        int i36 = a;
        int i37 = i36 & 23;
        int i38 = -(-(i36 | 23));
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        b = i39 % 128;
        int i40 = i39 % 2;
        while (c0087mL != null) {
            int i41 = a;
            int i42 = ((i41 | 88) << 1) - (i41 ^ 88);
            int i43 = (i42 ^ (-1)) + (i42 << 1);
            b = i43 % 128;
            int i44 = i43 % 2;
            ArrayList<Y> arrayList3 = this.m;
            int i45 = this.h;
            if (i45 == 0) {
                int i46 = a + 23;
                b = i46 % 128;
                int i47 = i46 % 2;
                y2 = c0087mL.g;
                int i48 = a;
                int i49 = i48 & 119;
                int i50 = (((i48 ^ 119) | i49) << 1) - ((i48 | 119) & (~i49));
                b = i50 % 128;
                int i51 = i50 % 2;
            } else if (i45 == 1) {
                int i52 = a;
                int i53 = (i52 & 85) + (i52 | 85);
                b = i53 % 128;
                if (i53 % 2 == 0) {
                    y2 = c0087mL.i;
                    int i54 = 37 / 0;
                } else {
                    y2 = c0087mL.i;
                }
                int i55 = b;
                int i56 = i55 & 5;
                int i57 = (i55 | 5) & (~i56);
                int i58 = i56 << 1;
                int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                a = i59 % 128;
                int i60 = i59 % 2;
            } else {
                int i61 = a;
                int i62 = (i61 & 89) + (i61 | 89);
                b = i62 % 128;
                int i63 = i62 % 2;
                y2 = null;
            }
            arrayList3.add(y2);
            c0087mL = c0087mL.l(this.h);
            int i64 = a;
            int i65 = i64 | 81;
            int i66 = i65 << 1;
            int i67 = -(i65 & (~(i64 & 81)));
            int i68 = (i66 & i67) + (i67 | i66);
            b = i68 % 128;
            if (i68 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i69 = i64 & 111;
            int i70 = i69 + ((i64 ^ 111) | i69);
            b = i70 % 128;
            int i71 = i70 % 2;
        }
        int i72 = (-2) - ((b + 16) ^ (-1));
        a = i72 % 128;
        int i73 = i72 % 2;
        for (Y y3 : this.m) {
            int i74 = b;
            int i75 = i74 ^ 105;
            int i76 = (i74 & 105) << 1;
            int i77 = (i75 & i76) + (i76 | i75);
            a = i77 % 128;
            int i78 = i77 % 2;
            int i79 = this.h;
            int i80 = a;
            int i81 = i80 & 43;
            int i82 = (i80 ^ 43) | i81;
            int i83 = (i81 & i82) + (i81 | i82);
            b = i83 % 128;
            if (i83 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i79 == 0) {
                y3.e.e = this;
                int i84 = b;
                int i85 = i84 & 107;
                int i86 = -(-((i84 ^ 107) | i85));
                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                a = i87 % 128;
                int i88 = i87 % 2;
            } else if (i79 == 1) {
                int i89 = i80 & 41;
                int i90 = -(-((i80 ^ 41) | i89));
                int i91 = (i89 & i90) + (i89 | i90);
                b = i91 % 128;
                if (i91 % 2 == 0) {
                    y3.e.f = this;
                    throw null;
                }
                y3.e.f = this;
                int i92 = b;
                int i93 = (i92 ^ 54) + ((i92 & 54) << 1);
                int i94 = (i93 ^ (-1)) + (i93 << 1);
                a = i94 % 128;
                int i95 = i94 % 2;
            } else {
                continue;
            }
        }
        if (this.h == 0) {
            int i96 = a + 83;
            b = i96 % 128;
            if (i96 % 2 == 0) {
                boolean z = ((O) this.e.N).ak;
                obj.hashCode();
                throw null;
            }
            if (((O) this.e.N).ak) {
                int i97 = b;
                int i98 = (-2) - (((i97 & 74) + (i97 | 74)) ^ (-1));
                int i99 = i98 % 128;
                a = i99;
                int i100 = i98 % 2;
                int i101 = (-2) - ((i99 + 114) ^ (-1));
                b = i101 % 128;
                int i102 = i101 % 2;
                if (this.m.size() > 1) {
                    int i103 = b;
                    int i104 = i103 & 9;
                    int i105 = -(-((i103 ^ 9) | i104));
                    int i106 = (i104 & i105) + (i105 | i104);
                    a = i106 % 128;
                    if (i106 % 2 != 0) {
                        arrayList = this.m;
                        size = arrayList.size();
                        int i107 = 1 / 0;
                    } else {
                        arrayList = this.m;
                        size = arrayList.size();
                    }
                    int i108 = a;
                    int i109 = i108 | 79;
                    int i110 = i109 << 1;
                    int i111 = -((~(i108 & 79)) & i109);
                    int i112 = (i110 & i111) + (i111 | i110);
                    b = i112 % 128;
                    this.e = i112 % 2 == 0 ? arrayList.get((((size | 1) << 1) - (size ^ 1)) - 1).e : arrayList.get(size - 1).e;
                    int i113 = a;
                    int i114 = i113 & 91;
                    int i115 = -(-((i113 ^ 91) | i114));
                    int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                    b = i116 % 128;
                    int i117 = i116 % 2;
                }
            } else {
                int i118 = b;
                int i119 = ((i118 ^ 57) | (i118 & 57)) << 1;
                int i120 = -(((~i118) & 57) | (i118 & (-58)));
                int i121 = (i119 & i120) + (i120 | i119);
                a = i121 % 128;
                int i122 = i121 % 2;
            }
        } else {
            int i1110 = b;
            int i1111 = ((i1110 ^ 57) | (i1110 & 57)) << 1;
            int i123 = -(((~i1110) & 57) | (i1110 & (-58)));
            int i124 = (i1111 & i123) + (i123 | i1111);
            a = i124 % 128;
            int i125 = i124 % 2;
        }
        if (this.h == 0) {
            int i126 = b + 29;
            a = i126 % 128;
            if (i126 % 2 != 0) {
                i2 = this.e.aa;
                int i127 = 58 / 0;
            } else {
                i2 = this.e.aa;
            }
            int i128 = a;
            int i129 = ((((i128 ^ 1) | (i128 & 1)) << 1) - (~(-(((~i128) & 1) | (i128 & (-2)))))) - 1;
            b = i129 % 128;
            int i130 = i129 % 2;
        } else {
            i2 = this.e.ab;
            int i131 = b + 99;
            a = i131 % 128;
            int i132 = i131 % 2;
        }
        this.n = i2;
        int i133 = a;
        int i134 = i133 & 95;
        int i135 = (i134 - (~(-(-((i133 ^ 95) | i134))))) - 1;
        b = i135 % 128;
        if (i135 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public void i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 17) << 1) - (i2 ^ 17);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 33;
        int i7 = (((i4 | 33) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < this.m.size()) {
            int i10 = b;
            int i11 = (i10 ^ 37) + ((i10 & 37) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            this.m.get(i9).i();
            int i13 = b;
            int i14 = (((i13 ^ 81) | (i13 & 81)) << 1) - (((~i13) & 81) | (i13 & (-82)));
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            int i17 = (i9 & (-13)) | ((~i9) & 12);
            int i18 = (i9 & 12) << 1;
            int i19 = (i17 & i18) + (i18 | i17);
            int i20 = i19 & (-11);
            int i21 = (i19 ^ (-11)) | i20;
            i9 = (i20 | i21) + (i20 & i21);
            int i22 = (i15 & 61) + (i15 | 61);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = a;
        int i25 = ((i24 | 119) << 1) - (i24 ^ 119);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 62 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public long l() {
        int size;
        long j;
        int i;
        Y y;
        long j2;
        long j3;
        int i2 = 2 % 2;
        int i3 = (-2) - ((b + 2) ^ (-1));
        a = i3 % 128;
        int i4 = 0;
        if (i3 % 2 != 0) {
            size = this.m.size();
            j = 1;
            i = 1;
        } else {
            size = this.m.size();
            j = 0;
            i = 0;
        }
        while (i < size) {
            int i5 = a;
            int i6 = i5 & 97;
            int i7 = (i6 - (~(-(-((i5 ^ 97) | i6))))) - 1;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                y = this.m.get(i);
                int i8 = 36 / i4;
            } else {
                y = this.m.get(i);
            }
            long j4 = y.k.h;
            long jL = y.l();
            int i9 = a;
            int i10 = (i9 | 93) << 1;
            int i11 = -((93 & (~i9)) | (i9 & (-94)));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = y.c.h;
            if (i13 == 0) {
                j2 = i14;
                int i15 = 50 / i4;
            } else {
                j2 = i14;
            }
            int i16 = b;
            int i17 = ((~i16) & 103) | (i16 & (-104));
            int i18 = (i16 & 103) << 1;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                j3 = j2 % ((j - j4) ^ jL);
                int i20 = i & 107;
                i = (((~i20) & (i | 107)) - (~(-(-(i20 << 1))))) - 1;
            } else {
                j3 = j2 + jL + j + j4;
                int i21 = (i & 109) | ((~i) & (-110));
                int i22 = -(-((i & (-110)) << 1));
                int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                i = (((i23 | 112) << 1) - (i23 ^ 112)) - 1;
            }
            j = j3;
            i4 = 0;
        }
        int i24 = a;
        int i25 = i24 | 113;
        int i26 = i25 << 1;
        int i27 = -((~(i24 & 113)) & i25);
        int i28 = (i26 & i27) + (i27 | i26);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 30 / 0;
        }
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public boolean m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 99) << 1) - (i2 ^ 99);
        a = i3 % 128;
        int i4 = i3 % 2;
        int size = this.m.size();
        int i5 = b;
        int i6 = (((i5 ^ 83) | (i5 & 83)) << 1) - (((~i5) & 83) | (i5 & (-84)));
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (i8 < size) {
            int i9 = b + 21;
            a = i9 % 128;
            Object obj = null;
            if (i9 % 2 != 0) {
                this.m.get(i8).m();
                obj.hashCode();
                throw null;
            }
            if (!this.m.get(i8).m()) {
                int i10 = b;
                int i11 = (i10 & (-6)) | ((~i10) & 5);
                int i12 = -(-((i10 & 5) << 1));
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                a = i13 % 128;
                int i14 = i13 % 2;
                int i15 = (i10 & 98) + (i10 | 98);
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            i8++;
            int i17 = b;
            int i18 = i17 & 69;
            int i19 = (i17 | 69) & (~i18);
            int i20 = i18 << 1;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = b;
        int i24 = (-2) - (((i23 & 26) + (i23 | 26)) ^ (-1));
        a = i24 % 128;
        int i25 = i24 % 2;
        return true;
    }

    public final C0087m p() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = ((i2 ^ 15) | i3) << 1;
        int i5 = -((~i3) & (i2 | 15));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2 != 0 ? 1 : 0;
        int i8 = ((i2 | 99) << 1) - (i2 ^ 99);
        a = i8 % 128;
        int i9 = i8 % 2;
        while (i7 < this.m.size()) {
            int i10 = a;
            int i11 = i10 & 101;
            int i12 = (i10 | 101) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                C0087m c0087m = this.m.get(i7).e;
                throw null;
            }
            C0087m c0087m2 = this.m.get(i7).e;
            int i15 = a;
            int i16 = i15 & 29;
            int i17 = (i15 | 29) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = (i17 & i18) + (i17 | i18);
            b = i19 % 128;
            int i20 = i19 % 2;
            if (c0087m2.Y != 8) {
                int i21 = b;
                int i22 = i21 + 47;
                a = i22 % 128;
                int i23 = i22 % 2;
                int i24 = (i21 & 99) + (i21 | 99);
                a = i24 % 128;
                int i25 = i24 % 2;
                return c0087m2;
            }
            i7++;
            int i26 = a;
            int i27 = (((i26 | 56) << 1) - (i26 ^ 56)) - 1;
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = b;
        int i30 = (i29 ^ 37) + ((i29 & 37) << 1);
        a = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 0 / 0;
        }
        return null;
    }

    public final C0087m o() {
        int i = 2 % 2;
        int i2 = a + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        int size = (-2) - (this.m.size() ^ (-1));
        int i4 = b;
        int i5 = (-2) - (((i4 ^ 118) + ((i4 & 118) << 1)) ^ (-1));
        a = i5 % 128;
        int i6 = i5 % 2;
        while (size >= 0) {
            int i7 = b;
            int i8 = i7 & 7;
            int i9 = i8 + ((i7 ^ 7) | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            Y y = this.m.get(size);
            if (i10 != 0) {
                int i11 = 43 / 0;
            }
            int i12 = b;
            int i13 = i12 & 105;
            int i14 = ((i12 | 105) & (~i13)) + (i13 << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            C0087m c0087m = y.e;
            if (c0087m.Y != 8) {
                int i16 = b;
                int i17 = ((i16 ^ 69) | (i16 & 69)) << 1;
                int i18 = -((i16 & (-70)) | ((~i16) & 69));
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                a = i19 % 128;
                int i20 = i19 % 2;
                int i21 = (i16 & 125) + (i16 | 125);
                a = i21 % 128;
                int i22 = i21 % 2;
                return c0087m;
            }
            int i23 = size & (-14);
            int i24 = (i23 - (~((size ^ (-14)) | i23))) - 1;
            int i25 = (i24 & (-14)) | ((~i24) & 13);
            int i26 = (i24 & 13) << 1;
            size = ((i25 & i26) << 1) + (i25 ^ i26);
            int i27 = a;
            int i28 = i27 & 97;
            int i29 = -(-(i27 | 97));
            int i30 = (i28 & i29) + (i29 | i28);
            b = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = b;
        int i33 = (((i32 | 2) << 1) - (i32 ^ 2)) - 1;
        a = i33 % 128;
        if (i33 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01a9 A[PHI: r6
  0x01a9: PHI (r6v46 ivas.gov.bisp.enumeration.ad.m) = (r6v45 ivas.gov.bisp.enumeration.ad.m), (r6v60 ivas.gov.bisp.enumeration.ad.m) binds: [B:39:0x01a7, B:36:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02d0 A[PHI: r6
  0x02d0: PHI (r6v23 ivas.gov.bisp.enumeration.ad.m) = (r6v22 ivas.gov.bisp.enumeration.ad.m), (r6v32 ivas.gov.bisp.enumeration.ad.m) binds: [B:71:0x02ce, B:68:0x02c7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.B.Y
    public void g() {
        C0087m c0087mO;
        int i;
        C0087m c0087mO2;
        s sVar;
        int i2;
        List<s> list;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 21;
        int i6 = i5 + ((i4 ^ 21) | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        Iterator<Y> it = this.m.iterator();
        int i8 = a;
        int i9 = (((i8 ^ 123) | (i8 & 123)) << 1) - (((~i8) & 123) | (i8 & (-124)));
        b = i9 % 128;
        int i10 = i9 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int size = this.m.size();
                if (size <= 0) {
                    int i11 = b;
                    int i12 = (-2) - (((i11 ^ 30) + ((i11 & 30) << 1)) ^ (-1));
                    a = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 64 / 0;
                        return;
                    }
                    return;
                }
                C0087m c0087m = this.m.get(0).e;
                int i14 = b;
                int i15 = (i14 ^ 100) + ((i14 & 100) << 1);
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                ArrayList<Y> arrayList = this.m;
                int i18 = ((size ^ (-1)) | size) << 1;
                int i19 = -(~size);
                C0087m c0087m2 = arrayList.get((i18 ^ i19) + ((i19 & i18) << 1)).e;
                int i20 = a;
                int i21 = ((i20 & (-100)) | ((~i20) & 99)) + ((i20 & 99) << 1);
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = this.h;
                    obj.hashCode();
                    throw null;
                }
                if (this.h == 0) {
                    N n = c0087m.B;
                    N n2 = c0087m2.C;
                    int i23 = b;
                    int i24 = ((i23 | 9) << 1) - (i23 ^ 9);
                    a = i24 % 128;
                    s sVarC = i24 % 2 != 0 ? c(n, 1) : c(n, 0);
                    int iD = n.d();
                    C0087m c0087mP = p();
                    int i25 = a;
                    int i26 = ((i25 | 55) << 1) - (i25 ^ 55);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    if (c0087mP != null) {
                        int i28 = i25 & 125;
                        int i29 = -(-((i25 ^ 125) | i28));
                        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        iD = c0087mP.B.d();
                        int i32 = b;
                        int i33 = (((i32 ^ 23) | (i32 & 23)) << 1) - (((~i32) & 23) | (i32 & (-24)));
                        a = i33 % 128;
                        int i34 = i33 % 2;
                    }
                    if (sVarC != null) {
                        int i35 = b;
                        int i36 = i35 & 37;
                        int i37 = -(-((i35 ^ 37) | i36));
                        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                        a = i38 % 128;
                        int i39 = i38 % 2;
                        s sVar2 = this.k;
                        sVar2.n.add(sVarC);
                        int i40 = a;
                        int i41 = (i40 ^ 67) + ((i40 & 67) << 1);
                        b = i41 % 128;
                        if (i41 % 2 == 0) {
                            sVar2.h = iD;
                            List<V> list2 = sVarC.m;
                            throw null;
                        }
                        sVar2.h = iD;
                        List<V> list3 = sVarC.m;
                        int i42 = (-2) - ((a + 28) ^ (-1));
                        b = i42 % 128;
                        int i43 = i42 % 2;
                        list3.add(sVar2);
                        int i44 = b + 1;
                        a = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    s sVarC2 = c(n2, 0);
                    int iD2 = n2.d();
                    int i46 = a;
                    int i47 = (i46 & 124) + (i46 | 124);
                    int i48 = (i47 ^ (-1)) + (i47 << 1);
                    b = i48 % 128;
                    if (i48 % 2 == 0) {
                        c0087mO2 = o();
                        int i49 = 25 / 0;
                        if (c0087mO2 != null) {
                            iD2 = c0087mO2.C.d();
                            int i50 = a + 49;
                            b = i50 % 128;
                            int i51 = i50 % 2;
                        }
                    } else {
                        c0087mO2 = o();
                        if (c0087mO2 != null) {
                            iD2 = c0087mO2.C.d();
                            int i52 = a + 49;
                            b = i52 % 128;
                            int i53 = i52 % 2;
                        }
                    }
                    if (sVarC2 != null) {
                        int i54 = a;
                        int i55 = i54 & 103;
                        int i56 = -(-((i54 ^ 103) | i55));
                        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                        b = i57 % 128;
                        if (i57 % 2 == 0) {
                            sVar = this.c;
                            i2 = -iD2;
                            list = sVar.n;
                            int i58 = 28 / 0;
                        } else {
                            sVar = this.c;
                            i2 = -iD2;
                            list = sVar.n;
                        }
                        int i59 = a;
                        int i60 = (-2) - (((i59 & 114) + (i59 | 114)) ^ (-1));
                        b = i60 % 128;
                        if (i60 % 2 == 0) {
                            list.add(sVarC2);
                            sVar.h = i2;
                            throw null;
                        }
                        list.add(sVarC2);
                        sVar.h = i2;
                        sVarC2.m.add(sVar);
                        int i61 = a;
                        int i62 = i61 ^ 117;
                        int i63 = ((i61 & 117) | i62) << 1;
                        int i64 = -i62;
                        i = (i63 & i64) + (i63 | i64);
                        b = i % 128;
                        int i65 = i % 2;
                    }
                } else {
                    N n3 = c0087m.A;
                    N n4 = c0087m2.E;
                    int i66 = b;
                    int i67 = ((i66 & 54) + (i66 | 54)) - 1;
                    a = i67 % 128;
                    s sVarC3 = i67 % 2 != 0 ? c(n3, 1) : c(n3, 1);
                    int iD3 = n3.d();
                    C0087m c0087mP2 = p();
                    if (c0087mP2 != null) {
                        int i68 = b;
                        int i69 = ((i68 & 90) + (i68 | 90)) - 1;
                        a = i69 % 128;
                        int i70 = i69 % 2;
                        iD3 = c0087mP2.A.d();
                        int i71 = b;
                        int i72 = ((i71 ^ 7) | (i71 & 7)) << 1;
                        int i73 = -(((~i71) & 7) | (i71 & (-8)));
                        int i74 = (i72 & i73) + (i73 | i72);
                        a = i74 % 128;
                        int i75 = i74 % 2;
                    }
                    if (sVarC3 != null) {
                        int i76 = a;
                        int i77 = ((i76 | 24) << 1) - (i76 ^ 24);
                        int i78 = (i77 ^ (-1)) + (i77 << 1);
                        b = i78 % 128;
                        int i79 = i78 % 2;
                        s sVar3 = this.k;
                        sVar3.n.add(sVarC3);
                        int i80 = b + 69;
                        a = i80 % 128;
                        if (i80 % 2 != 0) {
                            sVar3.h = iD3;
                            sVarC3.m.add(sVar3);
                            throw null;
                        }
                        sVar3.h = iD3;
                        sVarC3.m.add(sVar3);
                        int i81 = a + 125;
                        b = i81 % 128;
                        int i82 = i81 % 2;
                    }
                    s sVarC4 = c(n4, 1);
                    int iD4 = n4.d();
                    int i83 = a;
                    int i84 = i83 & 97;
                    int i85 = (i83 | 97) & (~i84);
                    int i86 = i84 << 1;
                    int i87 = ((i85 | i86) << 1) - (i85 ^ i86);
                    b = i87 % 128;
                    if (i87 % 2 == 0) {
                        c0087mO = o();
                        int i88 = 71 / 0;
                        if (c0087mO != null) {
                            iD4 = c0087mO.E.d();
                            int i89 = b;
                            int i90 = ((i89 | 25) << 1) - (i89 ^ 25);
                            a = i90 % 128;
                            int i91 = i90 % 2;
                        }
                    } else {
                        c0087mO = o();
                        if (c0087mO != null) {
                            iD4 = c0087mO.E.d();
                            int i810 = b;
                            int i92 = ((i810 | 25) << 1) - (i810 ^ 25);
                            a = i92 % 128;
                            int i93 = i92 % 2;
                        }
                    }
                    if (sVarC4 != null) {
                        int i94 = a;
                        int i95 = ((i94 | 35) << 1) - (i94 ^ 35);
                        b = i95 % 128;
                        if (i95 % 2 == 0) {
                            this.c.n.add(sVarC4);
                            obj.hashCode();
                            throw null;
                        }
                        s sVar4 = this.c;
                        sVar4.n.add(sVarC4);
                        sVar4.h = -iD4;
                        sVarC4.m.add(sVar4);
                        int i96 = a;
                        int i97 = i96 & 67;
                        int i98 = (((i96 ^ 67) | i97) << 1) - ((~i97) & (i96 | 67));
                        b = i98 % 128;
                        int i99 = i98 % 2;
                        int i100 = i96 & 71;
                        int i101 = -(-((i96 ^ 71) | i100));
                        i = ((i100 | i101) << 1) - (i101 ^ i100);
                        b = i % 128;
                        int i610 = i % 2;
                    }
                }
                this.k.d = this;
                this.c.d = this;
                int i102 = a;
                int i103 = i102 & 105;
                int i104 = i103 + ((i102 ^ 105) | i103);
                b = i104 % 128;
                if (i104 % 2 == 0) {
                    int i105 = 12 / 0;
                    return;
                }
                return;
            }
            int i106 = a;
            int i107 = (i106 ^ 77) + ((i106 & 77) << 1);
            b = i107 % 128;
            if (i107 % 2 == 0) {
                it.next().g();
                throw null;
            }
            it.next().g();
            int i108 = a;
            int i109 = (i108 & (-76)) | ((~i108) & 75);
            int i110 = -(-((i108 & 75) << 1));
            int i111 = (i109 & i110) + (i110 | i109);
            b = i111 % 128;
            int i112 = i111 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public void h() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = (((i2 | 63) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.f = null;
            this.m.iterator();
            throw null;
        }
        this.f = null;
        Iterator<Y> it = this.m.iterator();
        int i5 = a;
        int i6 = i5 ^ 57;
        int i7 = (i5 & 57) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        while (it.hasNext()) {
            int i10 = b;
            int i11 = i10 & 83;
            int i12 = ((((i10 ^ 83) | i11) << 1) - (~(-((i10 | 83) & (~i11))))) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                it.next().h();
                throw null;
            }
            it.next().h();
            int i13 = a;
            int i14 = (-2) - ((((i13 | 44) << 1) - (i13 ^ 44)) ^ (-1));
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b + 93;
        a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 42 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[PHI: r1
  0x0040: PHI (r1v23 java.lang.StringBuilder) = (r1v6 java.lang.StringBuilder), (r1v24 java.lang.StringBuilder) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r1
  0x002b: PHI (r1v7 java.lang.StringBuilder) = (r1v6 java.lang.StringBuilder), (r1v24 java.lang.StringBuilder) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public String toString() {
        StringBuilder sbW;
        String str;
        Iterator<Y> it;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 59) - (~(i2 | 59))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            sbW = j.w("ChainRun ");
            int i4 = 56 / 0;
            if (this.h == 0) {
                int i5 = a;
                int i6 = i5 & 65;
                int i7 = -(-((i5 ^ 65) | i6));
                int i8 = (i6 & i7) + (i7 | i6);
                b = i8 % 128;
                int i9 = i8 % 2;
                str = "horizontal : ";
            } else {
                int i10 = a;
                int i11 = (i10 & 19) + (i10 | 19);
                b = i11 % 128;
                int i12 = i11 % 2;
                str = "vertical : ";
            }
        } else {
            sbW = j.w("ChainRun ");
            if (this.h == 0) {
                int i13 = a;
                int i14 = i13 & 65;
                int i15 = -(-((i13 ^ 65) | i14));
                int i16 = (i14 & i15) + (i15 | i14);
                b = i16 % 128;
                int i17 = i16 % 2;
                str = "horizontal : ";
            } else {
                int i18 = a;
                int i19 = (i18 & 19) + (i18 | 19);
                b = i19 % 128;
                int i110 = i19 % 2;
                str = "vertical : ";
            }
        }
        sbW.append(str);
        String string = sbW.toString();
        int i20 = b;
        int i21 = i20 & 105;
        int i22 = ((i20 ^ 105) | i21) << 1;
        int i23 = -((i20 | 105) & (~i21));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            it = this.m.iterator();
            int i25 = 20 / 0;
        } else {
            it = this.m.iterator();
        }
        while (it.hasNext()) {
            int i26 = a;
            int i27 = i26 & 123;
            int i28 = i26 | 123;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            b = i29 % 128;
            int i30 = i29 % 2;
            Y next = it.next();
            String strR = j.r(string, "<");
            StringBuilder sb = new StringBuilder();
            sb.append(strR);
            int i31 = b;
            int i32 = i31 & 89;
            int i33 = -(-((i31 ^ 89) | i32));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            a = i34 % 128;
            if (i34 % 2 != 0) {
                sb.append(next);
                string = j.r(sb.toString(), "> ");
                int i35 = 92 / 0;
            } else {
                sb.append(next);
                string = j.r(sb.toString(), "> ");
            }
            int i36 = a;
            int i37 = i36 & 117;
            int i38 = (((i36 ^ 117) | i37) << 1) - ((i36 | 117) & (~i37));
            b = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = b;
        int i41 = (((i40 | 9) << 1) - (~(-(((~i40) & 9) | (i40 & (-10)))))) - 1;
        a = i41 % 128;
        if (i41 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:155:0x0450  */
    /* JADX WARN: Code duplicated, block: B:170:0x04d9 A[PHI: r1
  0x04d9: PHI (r1v134 int) = (r1v132 int), (r1v140 int), (r1v140 int) binds: [B:162:0x0491, B:167:0x04c1, B:168:0x04c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0511  */
    /* JADX WARN: Code duplicated, block: B:187:0x0529 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x052b  */
    /* JADX WARN: Code duplicated, block: B:189:0x052e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0534  */
    /* JADX WARN: Code duplicated, block: B:194:0x0538  */
    /* JADX WARN: Code duplicated, block: B:196:0x0548  */
    /* JADX WARN: Code duplicated, block: B:197:0x0565  */
    /* JADX WARN: Code duplicated, block: B:198:0x057a  */
    /* JADX WARN: Code duplicated, block: B:200:0x057d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0581  */
    /* JADX WARN: Code duplicated, block: B:203:0x0584  */
    /* JADX WARN: Code duplicated, block: B:206:0x058a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x058c  */
    /* JADX WARN: Code duplicated, block: B:208:0x059d  */
    /* JADX WARN: Code duplicated, block: B:211:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:213:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:217:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:219:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:221:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:222:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:226:0x0606  */
    /* JADX WARN: Code duplicated, block: B:227:0x0614  */
    /* JADX WARN: Code duplicated, block: B:230:0x0629  */
    /* JADX WARN: Code duplicated, block: B:231:0x062f  */
    /* JADX WARN: Code duplicated, block: B:234:0x063d  */
    /* JADX WARN: Code duplicated, block: B:236:0x065c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0678  */
    /* JADX WARN: Code duplicated, block: B:239:0x0684  */
    /* JADX WARN: Code duplicated, block: B:241:0x068a  */
    /* JADX WARN: Code duplicated, block: B:242:0x0690  */
    /* JADX WARN: Code duplicated, block: B:251:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:253:0x06da  */
    /* JADX WARN: Code duplicated, block: B:255:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:258:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:260:0x070b  */
    /* JADX WARN: Code duplicated, block: B:263:0x0711 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x0713  */
    /* JADX WARN: Code duplicated, block: B:265:0x072a  */
    /* JADX WARN: Code duplicated, block: B:268:0x073b  */
    /* JADX WARN: Code duplicated, block: B:270:0x075d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0769  */
    /* JADX WARN: Code duplicated, block: B:275:0x076d  */
    /* JADX WARN: Code duplicated, block: B:276:0x0778  */
    /* JADX WARN: Code duplicated, block: B:281:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:283:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:284:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:285:0x07da  */
    /* JADX WARN: Code duplicated, block: B:288:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:289:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:296:0x0825  */
    /* JADX WARN: Code duplicated, block: B:297:0x083d  */
    /* JADX WARN: Code duplicated, block: B:299:0x084a  */
    /* JADX WARN: Code duplicated, block: B:300:0x0859  */
    /* JADX WARN: Code duplicated, block: B:306:0x087d  */
    /* JADX WARN: Code duplicated, block: B:308:0x089c  */
    /* JADX WARN: Code duplicated, block: B:310:0x089f  */
    /* JADX WARN: Code duplicated, block: B:312:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:314:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:315:0x08be  */
    /* JADX WARN: Code duplicated, block: B:317:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:320:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:324:0x0909  */
    /* JADX WARN: Code duplicated, block: B:327:0x090d  */
    /* JADX WARN: Code duplicated, block: B:328:0x0917  */
    /* JADX WARN: Code duplicated, block: B:331:0x0935 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:332:0x0937  */
    /* JADX WARN: Code duplicated, block: B:334:0x0946  */
    /* JADX WARN: Code duplicated, block: B:335:0x094b  */
    /* JADX WARN: Code duplicated, block: B:336:0x0960  */
    /* JADX WARN: Code duplicated, block: B:339:0x0973  */
    /* JADX WARN: Code duplicated, block: B:340:0x099b  */
    /* JADX WARN: Code duplicated, block: B:344:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:345:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:347:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:349:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:351:0x09df  */
    /* JADX WARN: Code duplicated, block: B:352:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:355:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:365:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:367:0x0a22  */
    /* JADX WARN: Code duplicated, block: B:371:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:372:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:376:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:418:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0765 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x09e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0a25 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:? A[RETURN, SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.B.Y, ivas.gov.bisp.enumeration.B.V
    public void b(V v) {
        int i;
        boolean z;
        int i2;
        Object obj;
        float f;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Y y;
        C0015y c0015y;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Y y2;
        int i34;
        C0015y c0015y2;
        int iMin;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        s sVar;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        Y y3;
        C0015y c0015y3;
        int i46;
        boolean z3;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        float f3;
        int i58;
        float f4;
        int i59;
        int i60;
        boolean z4;
        boolean z5;
        int i61;
        int i62;
        int i63 = 2;
        int i64 = 2 % 2;
        s sVar2 = this.k;
        if (sVar2.l) {
            int i65 = a;
            int i66 = 1;
            int i67 = (i65 ^ 3) + ((i65 & 3) << 1);
            b = i67 % 128;
            int i68 = i67 % 2;
            s sVar3 = this.c;
            if (sVar3.l) {
                int i69 = a + 47;
                b = i69 % 128;
                int i70 = i69 % 2;
                C0087m c0087m = this.e.N;
                if (c0087m != null) {
                    int i71 = a;
                    int i72 = i71 ^ 79;
                    int i73 = -(-((i71 & 79) << 1));
                    int i74 = (i72 & i73) + (i73 | i72);
                    b = i74 % 128;
                    int i75 = i74 % 2;
                    if (c0087m instanceof O) {
                        z = ((O) c0087m).ak;
                        int i76 = b + 67;
                        a = i76 % 128;
                        int i77 = i76 % 2;
                    } else {
                        int i78 = b;
                        int i79 = i78 ^ 87;
                        i = (((i78 & 87) | i79) << 1) - i79;
                        a = i % 128;
                        if (i % 2 != 0) {
                            int i80 = 4 % 4;
                        }
                        z = false;
                    }
                } else {
                    int i710 = b;
                    int i711 = i710 ^ 87;
                    i = (((i710 & 87) | i711) << 1) - i711;
                    a = i % 128;
                    if (i % 2 != 0) {
                        int i81 = 4 % 4;
                    }
                    z = false;
                }
                int i82 = sVar3.j;
                int i83 = -sVar2.j;
                int i84 = i82 & i83;
                int i85 = ((i83 | i82) & (~i84)) + (i84 << 1);
                int size = this.m.size();
                int i86 = 0;
                while (true) {
                    i2 = 8;
                    if (i86 >= size) {
                        i86 = -1;
                        break;
                    }
                    C0087m c0087m2 = this.m.get(i86).e;
                    int i87 = b;
                    int i88 = i87 & 67;
                    int i89 = ((i87 | 67) & (~i88)) + (i88 << 1);
                    a = i89 % 128;
                    int i90 = i89 % 2;
                    if (c0087m2.Y != 8) {
                        break;
                    } else {
                        i86 = ((i86 | 1) << 1) - (i86 ^ 1);
                    }
                }
                int i91 = size - 1;
                int i92 = i91;
                while (true) {
                    if (i92 < 0) {
                        i92 = -1;
                        break;
                    }
                    if (this.m.get(i92).e.Y != 8) {
                        break;
                    }
                    int i93 = a + 3;
                    b = i93 % 128;
                    if (i93 % 2 == 0) {
                        int i94 = i92 ^ 70;
                        int i95 = (i92 & 70) << 1;
                        i92 = ((i95 & i94) << 1) + (i94 ^ i95);
                    } else {
                        int i96 = ((i92 | 4) << 1) - (i92 ^ 4);
                        i92 = ((i96 | (-5)) << 1) - (i96 ^ (-5));
                    }
                }
                int i97 = 0;
                while (true) {
                    int i98 = 113;
                    obj = null;
                    if (i97 >= i63) {
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    int i99 = a;
                    int i100 = i99 & 19;
                    int i101 = (~i100) & (i99 | 19);
                    int i102 = -(-(i100 << i66));
                    int i103 = (i101 & i102) + (i102 | i101);
                    b = i103 % 128;
                    if (i103 % i63 == 0) {
                        i59 = i66;
                        i60 = i59;
                    } else {
                        i59 = 0;
                        i60 = 0;
                    }
                    int i104 = i59;
                    int i105 = i60;
                    f = 0.0f;
                    int i106 = 0;
                    i5 = 0;
                    while (i106 < size) {
                        int i107 = a;
                        int i108 = ((i107 & (-114)) | ((~i107) & i98)) + ((i107 & i98) << i66);
                        b = i108 % 128;
                        if (i108 % i63 == 0) {
                            this.m.get(i106);
                            obj.hashCode();
                            throw null;
                        }
                        Y y4 = this.m.get(i106);
                        C0087m c0087m3 = y4.e;
                        if (c0087m3.Y != i2) {
                            int i109 = i105 & 1;
                            i105 = ((~i109) & (i105 | 1)) + (i109 << i66);
                            if (i106 > 0 && i106 >= i86) {
                                int i110 = -(-y4.k.h);
                                int i111 = i5 ^ i110;
                                int i112 = (i5 & i110) << i66;
                                i5 = ((i111 | i112) << i66) - (i112 ^ i111);
                            }
                            C0015y c0015y4 = y4.i;
                            int i113 = c0015y4.j;
                            if (y4.g != 3) {
                                int i114 = a;
                                int i115 = (((i114 | 64) << 1) - (i114 ^ 64)) - 1;
                                b = i115 % 128;
                                int i116 = i115 % 2;
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                int i117 = this.h;
                                if (i117 == 0 && !c0087m3.g.i.l) {
                                    return;
                                }
                                if (i117 == 1 && !c0087m3.i.i.l) {
                                    return;
                                }
                                z5 = z4;
                                i61 = 1;
                            } else {
                                z5 = z4;
                                i61 = 1;
                                if (y4.d == 1 && i97 == 0) {
                                    i113 = c0015y4.f41o;
                                    int i118 = i104 & 1;
                                    i104 = (((~i118) & (i104 | 1)) - (~(i118 << 1))) - 1;
                                } else if (!(!c0015y4.l)) {
                                }
                                z5 = true;
                            }
                            if (z5) {
                                i5 = (i5 - (~(-(-i113)))) - i61;
                            } else {
                                int i119 = a + 99;
                                b = i119 % 128;
                                if (i119 % 2 == 0) {
                                    i62 = i104 >>> 1;
                                } else {
                                    int i120 = i104 & 1;
                                    i62 = i120 + ((i104 ^ 1) | i120);
                                }
                                float f5 = c0087m3.ac[this.h];
                                if (f5 >= 0.0f) {
                                    f += f5;
                                }
                                i104 = i62;
                            }
                            if (i106 < i91) {
                                int i121 = b + 49;
                                a = i121 % 128;
                                if (i121 % 2 != 0) {
                                    throw null;
                                }
                                if (i106 < i92) {
                                    int i122 = -(~(-(-(-y4.c.h))));
                                    int i123 = (i5 ^ i122) + ((i122 & i5) << 1);
                                    i5 = (i123 ^ (-1)) + (i123 << 1);
                                }
                            } else {
                                continue;
                            }
                        }
                        int i124 = (-2) - (((i106 ^ 92) + ((i106 & 92) << 1)) ^ (-1));
                        int i125 = i124 & (-90);
                        int i126 = ((i124 ^ (-90)) | i125) << 1;
                        int i127 = -((i124 | (-90)) & (~i125));
                        i106 = (i126 & i127) + (i127 | i126);
                        i63 = 2;
                        i66 = 1;
                        i2 = 8;
                        i98 = 113;
                    }
                    if (i5 >= i85) {
                        int i128 = a;
                        int i129 = i128 & 19;
                        int i130 = ((((i128 ^ 19) | i129) << 1) - (~(-((i128 | 19) & (~i129))))) - 1;
                        int i131 = i130 % 128;
                        b = i131;
                        int i132 = i130 % 2;
                        if (i104 != 0) {
                            int i133 = i131 + 49;
                            a = i133 % 128;
                            if (i133 % 2 != 0) {
                                int i134 = i97 & 187;
                                int i135 = -(-(i97 | 187));
                                int i136 = (i134 & i135) + (i134 | i135);
                                int i137 = i136 & (-67);
                                i97 = (((i136 ^ (-67)) | i137) << 1) - ((~i137) & (i136 | (-67)));
                            } else {
                                i97 = (i97 & 1) + (i97 | 1);
                            }
                            i63 = 2;
                            i66 = 1;
                            i2 = 8;
                        }
                    }
                    i3 = i104;
                    i4 = i105;
                    break;
                }
                int i138 = this.k.j;
                if (z) {
                    int i139 = b;
                    int i140 = i139 & 9;
                    int i141 = i140 + ((i139 ^ 9) | i140);
                    a = i141 % 128;
                    if (i141 % 2 != 0) {
                        i138 = this.c.j;
                        int i142 = 91 / 0;
                    } else {
                        i138 = this.c.j;
                    }
                }
                if (i5 > i85) {
                    int i143 = a;
                    int i144 = ((i143 | 108) << 1) - (i143 ^ 108);
                    int i145 = (i144 ^ (-1)) + (i144 << 1);
                    int i146 = i145 % 128;
                    b = i146;
                    if (i145 % 2 == 0) {
                        f4 = ((i5 % i85) - 2.0f) - 0.5f;
                    } else {
                        int i147 = -(~(-i85));
                        f4 = (((-2) - (((i5 & i147) + (i147 | i5)) ^ (-1))) / 2.0f) + 0.5f;
                    }
                    int i148 = (int) f4;
                    if (z) {
                        int i149 = i146 & 119;
                        int i150 = (i146 ^ 119) | i149;
                        int i151 = (i149 ^ i150) + ((i150 & i149) << 1);
                        a = i151 % 128;
                        int i152 = i151 % 2;
                        int i153 = -(~(-(-i148)));
                        i138 = ((i138 ^ i153) + ((i138 & i153) << 1)) - 1;
                    } else {
                        int i154 = -i148;
                        int i155 = i138 & i154;
                        i138 = ((i138 ^ i154) | i155) + i155;
                    }
                }
                if (i3 > 0) {
                    int i156 = -i5;
                    int i157 = i85 & i156;
                    float f6 = (i157 - (~((i156 ^ i85) | i157))) - 1;
                    int i158 = (int) ((f6 / i3) + 0.5f);
                    int i159 = 0;
                    int i160 = 0;
                    while (i159 < size) {
                        Y y5 = this.m.get(i159);
                        int i161 = a;
                        int i162 = i5;
                        int i163 = (((i161 & (-110)) | (109 & (~i161))) - (~(-(-((i161 & 109) << 1))))) - 1;
                        b = i163 % 128;
                        int i164 = i163 % 2;
                        C0087m c0087m4 = y5.e;
                        int i165 = i158;
                        if (c0087m4.Y != 8) {
                            int i166 = a;
                            int i167 = i166 ^ 105;
                            int i168 = (((i166 & 105) | i167) << 1) - i167;
                            b = i168 % 128;
                            int i169 = i168 % 2;
                            if (y5.g == 3) {
                                C0015y c0015y5 = y5.i;
                                if (c0015y5.l) {
                                    z = z;
                                    i4 = i4;
                                    i138 = i138;
                                    i57 = i160;
                                    f3 = f6;
                                } else {
                                    if (f > 0.0f) {
                                        int i170 = a;
                                        int i171 = (i170 ^ 63) + ((i170 & 63) << 1);
                                        b = i171 % 128;
                                        int i172 = i171 % 2;
                                        float f7 = c0087m4.ac[this.h];
                                        int i173 = b;
                                        int i174 = i173 & 53;
                                        int i175 = (i173 ^ 53) | i174;
                                        int i176 = (i174 ^ i175) + ((i174 & i175) << 1);
                                        a = i176 % 128;
                                        int i177 = i176 % 2;
                                        i58 = (int) (((f7 * f6) / f) + 0.5f);
                                        int i178 = ((i173 ^ 25) | (i173 & 25)) << 1;
                                        int i179 = -((i173 & (-26)) | (25 & (~i173)));
                                        int i180 = ((i178 | i179) << 1) - (i178 ^ i179);
                                        a = i180 % 128;
                                        int i181 = i180 % 2;
                                    } else {
                                        i58 = i165;
                                    }
                                    if (this.h == 0) {
                                        int i182 = c0087m4.f65o;
                                        int iMax = Math.max(c0087m4.p, y5.d == 1 ? Math.min(i58, c0015y5.f41o) : i58);
                                        if (i182 > 0) {
                                            int i183 = a;
                                            int i184 = i183 & 81;
                                            int i185 = (i184 - (~((i183 ^ 81) | i184))) - 1;
                                            b = i185 % 128;
                                            int i186 = i185 % 2;
                                            iMax = Math.min(i182, iMax);
                                        }
                                        if (iMax != i58) {
                                            int i187 = b + 17;
                                            a = i187 % 128;
                                            if (i187 % 2 == 0) {
                                                int i188 = i160;
                                                int i189 = i188 ^ 1;
                                                int i190 = -(-((i188 & 1) << 1));
                                                i160 = ((i189 | i190) << 1) - (i189 ^ i190);
                                            }
                                            i58 = iMax;
                                        }
                                        i57 = i160;
                                        f3 = f6;
                                    } else {
                                        i57 = i160;
                                        int i191 = c0087m4.t;
                                        f3 = f6;
                                        int iMax2 = Math.max(c0087m4.r, y5.d == 1 ? Math.min(i58, c0015y5.f41o) : i58);
                                        if (i191 > 0) {
                                            iMax2 = Math.min(i191, iMax2);
                                        }
                                        if (iMax2 != i58) {
                                            int i192 = (i57 | 1) << 1;
                                            int i193 = -(((~i57) & 1) | (i57 & (-2)));
                                            i57 = (i192 | i193) + (i192 & i193);
                                            i58 = iMax2;
                                        }
                                    }
                                    y5.i.e(i58);
                                }
                            } else {
                                z = z;
                                i4 = i4;
                                i138 = i138;
                                i57 = i160;
                                f3 = f6;
                            }
                        } else {
                            z = z;
                            i4 = i4;
                            i138 = i138;
                            i57 = i160;
                            f3 = f6;
                        }
                        i159++;
                        f6 = f3;
                        i158 = i165;
                        i5 = i162;
                        i138 = i138;
                        z = z;
                        i160 = i57;
                        i4 = i4;
                    }
                    z2 = z;
                    i6 = i4;
                    i7 = i138;
                    int i194 = i5;
                    int i195 = i160;
                    if (i195 > 0) {
                        int i196 = -i195;
                        int i197 = (i3 & i196) + (i3 | i196);
                        int i198 = 0;
                        int i199 = 0;
                        while (i199 < size) {
                            Y y6 = this.m.get(i199);
                            if (y6.e.Y == 8) {
                                i56 = 1;
                            } else {
                                if (i199 > 0 && i199 >= i86) {
                                    int i200 = -(-y6.k.h);
                                    int i201 = ((i198 ^ i200) | (i198 & i200)) << 1;
                                    int i202 = -(((~i198) & i200) | ((~i200) & i198));
                                    i198 = ((i202 & i201) << 1) + (i201 ^ i202);
                                }
                                int i203 = -(~(-(-y6.i.j)));
                                int i204 = (i198 ^ i203) + ((i198 & i203) << 1);
                                i198 = (i204 ^ (-1)) + (i204 << 1);
                                if (i199 >= i91 || i199 >= i92) {
                                    i56 = 1;
                                } else {
                                    int i205 = -(~(-(-(-y6.c.h))));
                                    int i206 = i198 ^ i205;
                                    int i207 = i198 & i205;
                                    i56 = 1;
                                    int i208 = i206 + (i207 << 1);
                                    i198 = (i208 ^ (-1)) + (i208 << 1);
                                }
                            }
                            int i209 = ((i199 | 109) << i56) - (i199 ^ 109);
                            i199 = ((i209 | (-108)) << i56) - (i209 ^ (-108));
                        }
                        i5 = i198;
                        i3 = i197;
                    } else {
                        i5 = i194;
                    }
                    if (this.n == 2) {
                        int i210 = b;
                        int i211 = ((i210 & 90) + (i210 | 90)) - 1;
                        a = i211 % 128;
                        int i212 = i211 % 2;
                        if (i195 == 0) {
                            i8 = 0;
                            this.n = 0;
                        }
                    }
                    if (i5 > i85) {
                        this.n = 2;
                    }
                    if (i6 > 0 && i3 == 0) {
                        int i213 = b + 50;
                        i55 = (i213 ^ (-1)) + (i213 << 1);
                        a = i55 % 128;
                        if (i55 % 2 == 0) {
                            throw null;
                        }
                        if (i86 == i92) {
                            this.n = 2;
                        }
                    }
                    i9 = this.n;
                    if (i9 == 1) {
                        i41 = i6;
                        if (i41 > 1) {
                            int i214 = a + 84;
                            i54 = (i214 ^ (-1)) + (i214 << 1);
                            b = i54 % 128;
                            if (i54 % 2 == 0) {
                                int i215 = i85 / i5;
                                int i216 = -(~i41);
                                int i217 = -(((-2) & i216) + ((-2) | i216));
                                int i218 = ((i215 ^ i217) | (i215 & i217)) << 1;
                                int i219 = -(((~i215) & i217) | ((~i217) & i215));
                                i42 = ((i218 | i219) << 1) - (i219 ^ i218);
                            } else {
                                int i220 = -(~(-i5));
                                i42 = ((-2) - ((((i85 | i220) << 1) - (i85 ^ i220)) ^ (-1))) / ((i41 ^ (-1)) + (i41 << 1));
                            }
                        } else if (i41 == 1) {
                            i42 = (i85 - i5) / 2;
                        } else {
                            i42 = i8;
                        }
                        if (i3 > 0) {
                            i42 = i8;
                        }
                        i43 = i8;
                        i44 = i7;
                        while (i43 < size) {
                            if (z2) {
                                int i221 = i43 + 2;
                                int i222 = -((i221 ^ (-1)) + (i221 << 1));
                                i45 = ((size & i222) - (~(-(-(i222 | size))))) - 1;
                            } else {
                                i45 = i43;
                            }
                            y3 = this.m.get(i45);
                            if (y3.e.Y == 8) {
                                int i223 = b;
                                int i224 = i223 & 25;
                                i53 = i224 + ((i223 ^ 25) | i224);
                                a = i53 % 128;
                                if (i53 % 2 == 0) {
                                    y3.k.e(i44);
                                    s sVar4 = y3.c;
                                    throw null;
                                }
                                y3.k.e(i44);
                                y3.c.e(i44);
                            } else {
                                if (i43 > 0) {
                                    int i225 = b;
                                    int i226 = (i225 & 95) + (i225 | 95);
                                    a = i226 % 128;
                                    int i227 = i226 % 2;
                                    i52 = -i42;
                                    if (z2) {
                                        i44 = (i44 ^ i52) + ((i52 & i44) << 1);
                                    } else {
                                        int i228 = -i52;
                                        i44 = ((((~i228) & i44) | ((~i44) & i228)) - (~(-(-((i228 & i44) << 1))))) - 1;
                                    }
                                }
                                if (i43 > 0 && i43 >= i86) {
                                    if (z2) {
                                        int i229 = -y3.k.h;
                                        int i230 = i44 & i229;
                                        int i231 = (i229 ^ i44) | i230;
                                        i50 = i230 ^ i231;
                                        i51 = i231 & i230;
                                        i49 = 1;
                                    } else {
                                        i49 = 1;
                                        int i232 = y3.k.h;
                                        int i233 = ((~i232) & i44) | ((~i44) & i232);
                                        int i234 = -(-((i232 & i44) << 1));
                                        i50 = i233 ^ i234;
                                        i51 = i234 & i233;
                                    }
                                    i44 = i50 + (i51 << i49);
                                }
                                if (z2) {
                                    y3.c.e(i44);
                                } else {
                                    y3.k.e(i44);
                                }
                                c0015y3 = y3.i;
                                i46 = c0015y3.j;
                                if (y3.g == 3) {
                                    int i235 = b;
                                    int i236 = ((i235 ^ 47) | (i235 & 47)) << 1;
                                    int i237 = -(((~i235) & 47) | (i235 & (-48)));
                                    int i238 = (i236 & i237) + (i237 | i236);
                                    a = i238 % 128;
                                    int i239 = i238 % 2;
                                    if (y3.d == 1) {
                                        i46 = c0015y3.f41o;
                                        int i240 = b;
                                        int i241 = ((((i240 ^ 121) | (i240 & 121)) << 1) - (~(-(((~i240) & 121) | (i240 & (-122)))))) - 1;
                                        a = i241 % 128;
                                        int i242 = i241 % 2;
                                    }
                                }
                                if (z2) {
                                    int i243 = -i46;
                                    int i244 = i44 & i243;
                                    int i245 = (i243 ^ i44) | i244;
                                    z3 = true;
                                    i44 = ((i244 | i245) << 1) - (i245 ^ i244);
                                } else {
                                    z3 = true;
                                    i44 = (i44 - (~i46)) - 1;
                                }
                                if (z2) {
                                    y3.k.e(i44);
                                } else {
                                    y3.c.e(i44);
                                }
                                y3.j = z3;
                                if (i43 >= i91 && i43 < i92) {
                                    if (z2) {
                                        i47 = 1;
                                        i48 = (-2) - (((i44 - (~(-(~(-(-y3.c.h)))))) - 1) ^ (-1));
                                    } else {
                                        i47 = 1;
                                        int i246 = i44 - (~(-y3.c.h));
                                        i48 = (i246 ^ (-1)) + (i246 << 1);
                                    }
                                    i44 = i48;
                                }
                                int i247 = ((((i43 ^ (-31)) | (i43 & (-31))) << i47) - (~(-((i43 & 30) | ((~i43) & (-31)))))) - i47;
                                int i248 = i247 & 32;
                                i43 = i248 + ((i247 ^ 32) | i248);
                            }
                            i47 = 1;
                            int i249 = ((((i43 ^ (-31)) | (i43 & (-31))) << i47) - (~(-((i43 & 30) | ((~i43) & (-31)))))) - i47;
                            int i2410 = i249 & 32;
                            i43 = i2410 + ((i249 ^ 32) | i2410);
                        }
                        return;
                    }
                    i10 = i6;
                    if (i9 == 0) {
                        int i250 = b;
                        int i251 = i250 & 123;
                        i29 = i251 + ((i250 ^ 123) | i251);
                        a = i29 % 128;
                        if (i29 % 2 != 0) {
                            i30 = (i85 % i5) * (i10 >> 1);
                            if (i3 > 0) {
                                i30 = i8;
                            }
                        } else {
                            int i252 = -i5;
                            int i253 = (((i85 ^ i252) | (i85 & i252)) << 1) - (((~i85) & i252) | ((~i252) & i85));
                            int i254 = i10 & 1;
                            i30 = i253 / (i254 + ((i10 ^ 1) | i254));
                            if (i3 > 0) {
                                i30 = i8;
                            }
                        }
                        i31 = i8;
                        i32 = i7;
                        while (i31 < size) {
                            if (z2) {
                                int i255 = i31 & 1;
                                int i256 = -(-((i31 ^ 1) | i255));
                                int i257 = -((i255 ^ i256) + ((i255 & i256) << 1));
                                int i258 = size & i257;
                                int i259 = i257 | size;
                                i33 = (i258 ^ i259) + ((i259 & i258) << 1);
                            } else {
                                i33 = i31;
                            }
                            y2 = this.m.get(i33);
                            if (y2.e.Y == 8) {
                                int i260 = b + 113;
                                a = i260 % 128;
                                int i261 = i260 % 2;
                                y2.k.e(i32);
                                sVar = y2.c;
                                int i262 = b;
                                i40 = (i262 & 109) + (i262 | 109);
                                a = i40 % 128;
                                if (i40 % 2 == 0) {
                                    sVar.e(i32);
                                    throw null;
                                }
                                sVar.e(i32);
                                i37 = 1;
                            } else {
                                if (z2) {
                                    int i263 = -i30;
                                    i34 = ((i32 & i263) - (~(-(-(i263 | i32))))) - 1;
                                } else {
                                    int i264 = i32 & i30;
                                    int i265 = (i32 | i30) & (~i264);
                                    int i266 = i264 << 1;
                                    i34 = ((i265 | i266) << 1) - (i265 ^ i266);
                                }
                                if (i31 > 0 && i31 >= i86) {
                                    int i267 = b;
                                    int i268 = i267 & 31;
                                    int i269 = ((i267 ^ 31) | i268) << 1;
                                    int i270 = -((i267 | 31) & (~i268));
                                    int i271 = ((i269 | i270) << 1) - (i270 ^ i269);
                                    i38 = i271 % 128;
                                    a = i38;
                                    int i272 = i271 % 2;
                                    if (z2) {
                                        int i273 = i38 ^ 27;
                                        int i274 = -(-((i38 & 27) << 1));
                                        i39 = (i273 & i274) + (i274 | i273);
                                        b = i39 % 128;
                                        if (i39 % 2 == 0) {
                                            int i275 = i34 - (~y2.k.h);
                                            i34 = (i275 << 1) + (i275 ^ (-1));
                                        } else {
                                            int i276 = -y2.k.h;
                                            int i277 = i34 | i276;
                                            int i278 = i277 << 1;
                                            int i279 = -((~(i276 & i34)) & i277);
                                            i34 = ((i278 | i279) << 1) - (i279 ^ i278);
                                        }
                                    } else {
                                        int i280 = -(~(-(-y2.k.h)));
                                        i34 = (((i34 | i280) << 1) - (i280 ^ i34)) - 1;
                                    }
                                }
                                if (!z2) {
                                    y2.k.e(i34);
                                } else {
                                    int i281 = b;
                                    int i282 = i281 & 109;
                                    int i283 = (i281 ^ 109) | i282;
                                    int i284 = (i282 ^ i283) + ((i283 & i282) << 1);
                                    a = i284 % 128;
                                    int i285 = i284 % 2;
                                    y2.c.e(i34);
                                }
                                c0015y2 = y2.i;
                                iMin = c0015y2.j;
                                if (y2.g == 3 && y2.d == 1) {
                                    iMin = Math.min(iMin, c0015y2.f41o);
                                }
                                if (z2) {
                                    int i286 = a;
                                    int i287 = i286 & 107;
                                    int i288 = (((i286 ^ 107) | i287) << 1) - ((i286 | 107) & (~i287));
                                    b = i288 % 128;
                                    int i289 = i288 % 2;
                                    i36 = i34 - iMin;
                                    i35 = 1;
                                } else {
                                    int i290 = i34 ^ iMin;
                                    int i291 = iMin & i34;
                                    i35 = 1;
                                    int i292 = i291 << 1;
                                    i36 = ((i290 | i292) << 1) - (i290 ^ i292);
                                }
                                if (z2) {
                                    int i293 = a + i35;
                                    b = i293 % 128;
                                    int i294 = i293 % 2;
                                    y2.k.e(i36);
                                } else {
                                    y2.c.e(i36);
                                }
                                if (i31 < i91 || i31 >= i92) {
                                    i37 = 1;
                                    i32 = i36;
                                } else if (z2) {
                                    int i295 = -(-y2.c.h);
                                    i37 = 1;
                                    i32 = (i36 ^ i295) + ((i295 & i36) << 1);
                                } else {
                                    i37 = 1;
                                    int i296 = -y2.c.h;
                                    i32 = ((i36 | i296) << 1) - (i296 ^ i36);
                                }
                            }
                            int i297 = (i31 | (-115)) << i37;
                            int i298 = -((i31 & 114) | ((~i31) & (-115)));
                            int i299 = (i297 & i298) + (i297 | i298);
                            int i300 = i299 ^ 116;
                            int i301 = ((i299 & 116) | i300) << 1;
                            int i302 = -i300;
                            i31 = (i301 ^ i302) + ((i302 & i301) << 1);
                        }
                        return;
                    }
                    if (i9 == 2) {
                        if (this.h == 0) {
                            int i303 = a;
                            int i304 = i303 & 75;
                            i28 = (((i303 ^ 75) | i304) << 1) - ((i303 | 75) & (~i304));
                            b = i28 % 128;
                            if (i28 % 2 != 0) {
                                float f8 = this.e.W;
                                obj.hashCode();
                                throw null;
                            }
                            f2 = this.e.W;
                        } else {
                            f2 = this.e.af;
                        }
                        if (!(!z2)) {
                            int i305 = b;
                            int i306 = ((i305 ^ 126) + ((i305 & 126) << 1)) - 1;
                            a = i306 % 128;
                            int i307 = i306 % 2;
                            f2 = 1.0f - f2;
                        }
                        int i308 = -i5;
                        float f9 = ((((i85 | i308) << 1) - (i85 ^ i308)) * f2) + 0.5f;
                        i11 = a;
                        int i309 = i11 ^ 121;
                        int i310 = -(-((i11 & 121) << 1));
                        int i311 = (i309 ^ i310) + ((i309 & i310) << 1);
                        b = i311 % 128;
                        int i312 = i311 % 2;
                        i12 = (int) f9;
                        if (i12 >= 0 || i3 > 0) {
                            i12 = i8;
                        }
                        i13 = -i12;
                        if (z2) {
                            int i313 = -(~i13);
                            i14 = ((i7 & i313) + (i7 | i313)) - 1;
                        } else {
                            int i314 = -i13;
                            int i315 = i7 ^ i314;
                            int i316 = -(-((i7 & i314) << 1));
                            i14 = (i315 ^ i316) + ((i316 & i315) << 1);
                            int i317 = i11 + 52;
                            int i318 = (i317 ^ (-1)) + (i317 << 1);
                            b = i318 % 128;
                            int i319 = i318 % 2;
                        }
                        i15 = i8;
                        while (i15 < size) {
                            if (z2) {
                                int i320 = b;
                                i27 = (i320 & 11) + (i320 | 11);
                                a = i27 % 128;
                                if (i27 % 2 != 0) {
                                    i16 = size / (i15 << 1);
                                } else {
                                    int i321 = i15 & 1;
                                    int i322 = (size - (~(-(~(-((i321 - (~((i15 ^ 1) | i321))) - 1)))))) - 1;
                                    i16 = (i322 << 1) + (i322 ^ (-1));
                                }
                            } else {
                                i16 = i15;
                            }
                            y = this.m.get(i16);
                            if (y.e.Y == 8) {
                                int i323 = a;
                                int i324 = (i323 | 73) << 1;
                                int i325 = -(((~i323) & 73) | (i323 & (-74)));
                                int i326 = (i324 & i325) + (i325 | i324);
                                b = i326 % 128;
                                int i327 = i326 % 2;
                                y.k.e(i14);
                                y.c.e(i14);
                                i23 = i14;
                                i24 = 1;
                            } else {
                                if (i15 > 0 && i15 >= i86) {
                                    if (!(!z2)) {
                                        int i328 = -y.k.h;
                                        int i329 = i14 & i328;
                                        int i330 = (i14 ^ i328) | i329;
                                        i14 = ((i330 & i329) << 1) + (i329 ^ i330);
                                    } else {
                                        int i331 = y.k.h;
                                        i14 = ((i14 | i331) << 1) - (i14 ^ i331);
                                    }
                                }
                                if (z2) {
                                    i25 = b + 73;
                                    a = i25 % 128;
                                    if (i25 % 2 == 0) {
                                        y.c.e(i14);
                                        throw null;
                                    }
                                    y.c.e(i14);
                                    int i332 = a;
                                    int i333 = i332 & 17;
                                    i26 = i333 + ((i332 ^ 17) | i333);
                                    b = i26 % 128;
                                    if (i26 % 2 == 0) {
                                        int i334 = 2 / 4;
                                    }
                                } else {
                                    y.k.e(i14);
                                }
                                c0015y = y.i;
                                i17 = c0015y.j;
                                int i335 = y.g;
                                int i336 = a;
                                i18 = (-2) - (((i336 & 68) + (i336 | 68)) ^ (-1));
                                b = i18 % 128;
                                if (i18 % 2 == 0 ? i335 == 3 : i335 == 2) {
                                    if (y.d == 1) {
                                        i19 = b + 83;
                                        a = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            int i337 = c0015y.f41o;
                                            throw null;
                                        }
                                        i17 = c0015y.f41o;
                                    }
                                }
                                if (z2) {
                                    int i338 = -i17;
                                    i21 = i14 ^ i338;
                                    i22 = i14 & i338;
                                    i20 = 1;
                                } else {
                                    i20 = 1;
                                    int i339 = -(-i17);
                                    int i340 = i14 & i339;
                                    int i341 = -(-(i14 | i339));
                                    i21 = i340 ^ i341;
                                    i22 = i341 & i340;
                                }
                                i23 = i21 + (i22 << i20);
                                if (z2) {
                                    y.k.e(i23);
                                } else {
                                    y.c.e(i23);
                                }
                                if (i15 < i91 || i15 >= i92) {
                                    i24 = 1;
                                } else {
                                    int i342 = a;
                                    int i343 = i342 & 21;
                                    int i344 = (i342 | 21) & (~i343);
                                    int i345 = i343 << 1;
                                    int i346 = (i344 & i345) + (i344 | i345);
                                    b = i346 % 128;
                                    if (i346 % 2 == 0) {
                                        throw null;
                                    }
                                    if (z2) {
                                        int i347 = -(-y.c.h);
                                        int i348 = i23 & i347;
                                        int i349 = (i347 | i23) & (~i348);
                                        i24 = 1;
                                        int i350 = i348 << 1;
                                        i23 = (i349 ^ i350) + ((i349 & i350) << 1);
                                    } else {
                                        i24 = 1;
                                        i23 = (i23 - (~(-y.c.h))) - 1;
                                    }
                                }
                            }
                            int i351 = ((i15 ^ (-127)) - (~(-(-((i15 & (-127)) << i24))))) - i24;
                            int i352 = i351 & 128;
                            int i353 = (i351 ^ 128) | i352;
                            i15 = (i352 ^ i353) + ((i353 & i352) << i24);
                            i14 = i23;
                        }
                    }
                }
                z2 = z;
                i6 = i4;
                i7 = i138;
                i8 = 0;
                if (i5 > i85) {
                    this.n = 2;
                }
                if (i6 > 0) {
                    int i2110 = b + 50;
                    i55 = (i2110 ^ (-1)) + (i2110 << 1);
                    a = i55 % 128;
                    if (i55 % 2 == 0) {
                        throw null;
                    }
                    if (i86 == i92) {
                        this.n = 2;
                    }
                }
                i9 = this.n;
                if (i9 == 1) {
                    i41 = i6;
                    if (i41 > 1) {
                        int i2111 = a + 84;
                        i54 = (i2111 ^ (-1)) + (i2111 << 1);
                        b = i54 % 128;
                        if (i54 % 2 == 0) {
                            int i2112 = i85 / i5;
                            int i2113 = -(~i41);
                            int i2114 = -(((-2) & i2113) + ((-2) | i2113));
                            int i2115 = ((i2112 ^ i2114) | (i2112 & i2114)) << 1;
                            int i2116 = -(((~i2112) & i2114) | ((~i2114) & i2112));
                            i42 = ((i2115 | i2116) << 1) - (i2116 ^ i2115);
                        } else {
                            int i2210 = -(~(-i5));
                            i42 = ((-2) - ((((i85 | i2210) << 1) - (i85 ^ i2210)) ^ (-1))) / ((i41 ^ (-1)) + (i41 << 1));
                        }
                    } else if (i41 == 1) {
                        i42 = (i85 - i5) / 2;
                    } else {
                        i42 = i8;
                    }
                    if (i3 > 0) {
                        i42 = i8;
                    }
                    i43 = i8;
                    i44 = i7;
                    while (i43 < size) {
                        if (z2) {
                            int i2211 = i43 + 2;
                            int i2212 = -((i2211 ^ (-1)) + (i2211 << 1));
                            i45 = ((size & i2212) - (~(-(-(i2212 | size))))) - 1;
                        } else {
                            i45 = i43;
                        }
                        y3 = this.m.get(i45);
                        if (y3.e.Y == 8) {
                            int i2213 = b;
                            int i2214 = i2213 & 25;
                            i53 = i2214 + ((i2213 ^ 25) | i2214);
                            a = i53 % 128;
                            if (i53 % 2 == 0) {
                                y3.k.e(i44);
                                s sVar5 = y3.c;
                                throw null;
                            }
                            y3.k.e(i44);
                            y3.c.e(i44);
                        } else {
                            if (i43 > 0) {
                                int i2215 = b;
                                int i2216 = (i2215 & 95) + (i2215 | 95);
                                a = i2216 % 128;
                                int i2217 = i2216 % 2;
                                i52 = -i42;
                                if (z2) {
                                    i44 = (i44 ^ i52) + ((i52 & i44) << 1);
                                } else {
                                    int i2218 = -i52;
                                    i44 = ((((~i2218) & i44) | ((~i44) & i2218)) - (~(-(-((i2218 & i44) << 1))))) - 1;
                                }
                            }
                            if (i43 > 0) {
                                if (z2) {
                                    int i2219 = -y3.k.h;
                                    int i2310 = i44 & i2219;
                                    int i2311 = (i2219 ^ i44) | i2310;
                                    i50 = i2310 ^ i2311;
                                    i51 = i2311 & i2310;
                                    i49 = 1;
                                } else {
                                    i49 = 1;
                                    int i2312 = y3.k.h;
                                    int i2313 = ((~i2312) & i44) | ((~i44) & i2312);
                                    int i2314 = -(-((i2312 & i44) << 1));
                                    i50 = i2313 ^ i2314;
                                    i51 = i2314 & i2313;
                                }
                                i44 = i50 + (i51 << i49);
                            }
                            if (z2) {
                                y3.c.e(i44);
                            } else {
                                y3.k.e(i44);
                            }
                            c0015y3 = y3.i;
                            i46 = c0015y3.j;
                            if (y3.g == 3) {
                                int i2315 = b;
                                int i2316 = ((i2315 ^ 47) | (i2315 & 47)) << 1;
                                int i2317 = -(((~i2315) & 47) | (i2315 & (-48)));
                                int i2318 = (i2316 & i2317) + (i2317 | i2316);
                                a = i2318 % 128;
                                int i2319 = i2318 % 2;
                                if (y3.d == 1) {
                                    i46 = c0015y3.f41o;
                                    int i2411 = b;
                                    int i2412 = ((((i2411 ^ 121) | (i2411 & 121)) << 1) - (~(-(((~i2411) & 121) | (i2411 & (-122)))))) - 1;
                                    a = i2412 % 128;
                                    int i2413 = i2412 % 2;
                                }
                            }
                            if (z2) {
                                int i2414 = -i46;
                                int i2415 = i44 & i2414;
                                int i2416 = (i2414 ^ i44) | i2415;
                                z3 = true;
                                i44 = ((i2415 | i2416) << 1) - (i2416 ^ i2415);
                            } else {
                                z3 = true;
                                i44 = (i44 - (~i46)) - 1;
                            }
                            if (z2) {
                                y3.k.e(i44);
                            } else {
                                y3.c.e(i44);
                            }
                            y3.j = z3;
                            if (i43 >= i91) {
                            }
                            int i2417 = ((((i43 ^ (-31)) | (i43 & (-31))) << i47) - (~(-((i43 & 30) | ((~i43) & (-31)))))) - i47;
                            int i2418 = i2417 & 32;
                            i43 = i2418 + ((i2417 ^ 32) | i2418);
                        }
                        i47 = 1;
                        int i2419 = ((((i43 ^ (-31)) | (i43 & (-31))) << i47) - (~(-((i43 & 30) | ((~i43) & (-31)))))) - i47;
                        int i24110 = i2419 & 32;
                        i43 = i24110 + ((i2419 ^ 32) | i24110);
                    }
                    return;
                }
                i10 = i6;
                if (i9 == 0) {
                    int i2510 = b;
                    int i2511 = i2510 & 123;
                    i29 = i2511 + ((i2510 ^ 123) | i2511);
                    a = i29 % 128;
                    if (i29 % 2 != 0) {
                        i30 = (i85 % i5) * (i10 >> 1);
                        if (i3 > 0) {
                            i30 = i8;
                        }
                    } else {
                        int i2512 = -i5;
                        int i2513 = (((i85 ^ i2512) | (i85 & i2512)) << 1) - (((~i85) & i2512) | ((~i2512) & i85));
                        int i2514 = i10 & 1;
                        i30 = i2513 / (i2514 + ((i10 ^ 1) | i2514));
                        if (i3 > 0) {
                            i30 = i8;
                        }
                    }
                    i31 = i8;
                    i32 = i7;
                    while (i31 < size) {
                        if (z2) {
                            int i2515 = i31 & 1;
                            int i2516 = -(-((i31 ^ 1) | i2515));
                            int i2517 = -((i2515 ^ i2516) + ((i2515 & i2516) << 1));
                            int i2518 = size & i2517;
                            int i2519 = i2517 | size;
                            i33 = (i2518 ^ i2519) + ((i2519 & i2518) << 1);
                        } else {
                            i33 = i31;
                        }
                        y2 = this.m.get(i33);
                        if (y2.e.Y == 8) {
                            int i2610 = b + 113;
                            a = i2610 % 128;
                            int i2611 = i2610 % 2;
                            y2.k.e(i32);
                            sVar = y2.c;
                            int i2612 = b;
                            i40 = (i2612 & 109) + (i2612 | 109);
                            a = i40 % 128;
                            if (i40 % 2 == 0) {
                                sVar.e(i32);
                                throw null;
                            }
                            sVar.e(i32);
                            i37 = 1;
                        } else {
                            if (z2) {
                                int i2613 = -i30;
                                i34 = ((i32 & i2613) - (~(-(-(i2613 | i32))))) - 1;
                            } else {
                                int i2614 = i32 & i30;
                                int i2615 = (i32 | i30) & (~i2614);
                                int i2616 = i2614 << 1;
                                i34 = ((i2615 | i2616) << 1) - (i2615 ^ i2616);
                            }
                            if (i31 > 0) {
                                int i2617 = b;
                                int i2618 = i2617 & 31;
                                int i2619 = ((i2617 ^ 31) | i2618) << 1;
                                int i2710 = -((i2617 | 31) & (~i2618));
                                int i2711 = ((i2619 | i2710) << 1) - (i2710 ^ i2619);
                                i38 = i2711 % 128;
                                a = i38;
                                int i2712 = i2711 % 2;
                                if (z2) {
                                    int i2713 = i38 ^ 27;
                                    int i2714 = -(-((i38 & 27) << 1));
                                    i39 = (i2713 & i2714) + (i2714 | i2713);
                                    b = i39 % 128;
                                    if (i39 % 2 == 0) {
                                        int i2715 = i34 - (~y2.k.h);
                                        i34 = (i2715 << 1) + (i2715 ^ (-1));
                                    } else {
                                        int i2716 = -y2.k.h;
                                        int i2717 = i34 | i2716;
                                        int i2718 = i2717 << 1;
                                        int i2719 = -((~(i2716 & i34)) & i2717);
                                        i34 = ((i2718 | i2719) << 1) - (i2719 ^ i2718);
                                    }
                                } else {
                                    int i2810 = -(~(-(-y2.k.h)));
                                    i34 = (((i34 | i2810) << 1) - (i2810 ^ i34)) - 1;
                                }
                            }
                            if (!z2) {
                                y2.k.e(i34);
                            } else {
                                int i2811 = b;
                                int i2812 = i2811 & 109;
                                int i2813 = (i2811 ^ 109) | i2812;
                                int i2814 = (i2812 ^ i2813) + ((i2813 & i2812) << 1);
                                a = i2814 % 128;
                                int i2815 = i2814 % 2;
                                y2.c.e(i34);
                            }
                            c0015y2 = y2.i;
                            iMin = c0015y2.j;
                            if (y2.g == 3) {
                                iMin = Math.min(iMin, c0015y2.f41o);
                            }
                            if (z2) {
                                int i2816 = a;
                                int i2817 = i2816 & 107;
                                int i2818 = (((i2816 ^ 107) | i2817) << 1) - ((i2816 | 107) & (~i2817));
                                b = i2818 % 128;
                                int i2819 = i2818 % 2;
                                i36 = i34 - iMin;
                                i35 = 1;
                            } else {
                                int i2910 = i34 ^ iMin;
                                int i2911 = iMin & i34;
                                i35 = 1;
                                int i2912 = i2911 << 1;
                                i36 = ((i2910 | i2912) << 1) - (i2910 ^ i2912);
                            }
                            if (z2) {
                                int i2913 = a + i35;
                                b = i2913 % 128;
                                int i2914 = i2913 % 2;
                                y2.k.e(i36);
                            } else {
                                y2.c.e(i36);
                            }
                            if (i31 < i91) {
                                i37 = 1;
                                i32 = i36;
                            } else {
                                i37 = 1;
                                i32 = i36;
                            }
                        }
                        int i2915 = (i31 | (-115)) << i37;
                        int i2916 = -((i31 & 114) | ((~i31) & (-115)));
                        int i2917 = (i2915 & i2916) + (i2915 | i2916);
                        int i3010 = i2917 ^ 116;
                        int i3011 = ((i2917 & 116) | i3010) << 1;
                        int i3012 = -i3010;
                        i31 = (i3011 ^ i3012) + ((i3012 & i3011) << 1);
                    }
                    return;
                }
                if (i9 == 2) {
                    if (this.h == 0) {
                        int i3013 = a;
                        int i3014 = i3013 & 75;
                        i28 = (((i3013 ^ 75) | i3014) << 1) - ((i3013 | 75) & (~i3014));
                        b = i28 % 128;
                        if (i28 % 2 != 0) {
                            float f10 = this.e.W;
                            obj.hashCode();
                            throw null;
                        }
                        f2 = this.e.W;
                    } else {
                        f2 = this.e.af;
                    }
                    if (!(!z2)) {
                        int i3015 = b;
                        int i3016 = ((i3015 ^ 126) + ((i3015 & 126) << 1)) - 1;
                        a = i3016 % 128;
                        int i3017 = i3016 % 2;
                        f2 = 1.0f - f2;
                    }
                    int i3018 = -i5;
                    float f11 = ((((i85 | i3018) << 1) - (i85 ^ i3018)) * f2) + 0.5f;
                    i11 = a;
                    int i3019 = i11 ^ 121;
                    int i3110 = -(-((i11 & 121) << 1));
                    int i3111 = (i3019 ^ i3110) + ((i3019 & i3110) << 1);
                    b = i3111 % 128;
                    int i3112 = i3111 % 2;
                    i12 = (int) f11;
                    if (i12 >= 0) {
                        i12 = i8;
                    } else {
                        i12 = i8;
                    }
                    i13 = -i12;
                    if (z2) {
                        int i3113 = -(~i13);
                        i14 = ((i7 & i3113) + (i7 | i3113)) - 1;
                    } else {
                        int i3114 = -i13;
                        int i3115 = i7 ^ i3114;
                        int i3116 = -(-((i7 & i3114) << 1));
                        i14 = (i3115 ^ i3116) + ((i3116 & i3115) << 1);
                        int i3117 = i11 + 52;
                        int i3118 = (i3117 ^ (-1)) + (i3117 << 1);
                        b = i3118 % 128;
                        int i3119 = i3118 % 2;
                    }
                    i15 = i8;
                    while (i15 < size) {
                        if (z2) {
                            int i3210 = b;
                            i27 = (i3210 & 11) + (i3210 | 11);
                            a = i27 % 128;
                            if (i27 % 2 != 0) {
                                i16 = size / (i15 << 1);
                            } else {
                                int i3211 = i15 & 1;
                                int i3212 = (size - (~(-(~(-((i3211 - (~((i15 ^ 1) | i3211))) - 1)))))) - 1;
                                i16 = (i3212 << 1) + (i3212 ^ (-1));
                            }
                        } else {
                            i16 = i15;
                        }
                        y = this.m.get(i16);
                        if (y.e.Y == 8) {
                            int i3213 = a;
                            int i3214 = (i3213 | 73) << 1;
                            int i3215 = -(((~i3213) & 73) | (i3213 & (-74)));
                            int i3216 = (i3214 & i3215) + (i3215 | i3214);
                            b = i3216 % 128;
                            int i3217 = i3216 % 2;
                            y.k.e(i14);
                            y.c.e(i14);
                            i23 = i14;
                            i24 = 1;
                        } else {
                            if (i15 > 0) {
                                if (!(!z2)) {
                                    int i3218 = -y.k.h;
                                    int i3219 = i14 & i3218;
                                    int i3310 = (i14 ^ i3218) | i3219;
                                    i14 = ((i3310 & i3219) << 1) + (i3219 ^ i3310);
                                } else {
                                    int i3311 = y.k.h;
                                    i14 = ((i14 | i3311) << 1) - (i14 ^ i3311);
                                }
                            }
                            if (z2) {
                                i25 = b + 73;
                                a = i25 % 128;
                                if (i25 % 2 == 0) {
                                    y.c.e(i14);
                                    throw null;
                                }
                                y.c.e(i14);
                                int i3312 = a;
                                int i3313 = i3312 & 17;
                                i26 = i3313 + ((i3312 ^ 17) | i3313);
                                b = i26 % 128;
                                if (i26 % 2 == 0) {
                                    int i3314 = 2 / 4;
                                }
                            } else {
                                y.k.e(i14);
                            }
                            c0015y = y.i;
                            i17 = c0015y.j;
                            int i3315 = y.g;
                            int i3316 = a;
                            i18 = (-2) - (((i3316 & 68) + (i3316 | 68)) ^ (-1));
                            b = i18 % 128;
                            if (i18 % 2 == 0) {
                                if (y.d == 1) {
                                    i19 = b + 83;
                                    a = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        int i3317 = c0015y.f41o;
                                        throw null;
                                    }
                                    i17 = c0015y.f41o;
                                }
                            } else if (y.d == 1) {
                                i19 = b + 83;
                                a = i19 % 128;
                                if (i19 % 2 != 0) {
                                    int i3318 = c0015y.f41o;
                                    throw null;
                                }
                                i17 = c0015y.f41o;
                            }
                            if (z2) {
                                int i3319 = -i17;
                                i21 = i14 ^ i3319;
                                i22 = i14 & i3319;
                                i20 = 1;
                            } else {
                                i20 = 1;
                                int i3320 = -(-i17);
                                int i3410 = i14 & i3320;
                                int i3411 = -(-(i14 | i3320));
                                i21 = i3410 ^ i3411;
                                i22 = i3411 & i3410;
                            }
                            i23 = i21 + (i22 << i20);
                            if (z2) {
                                y.k.e(i23);
                            } else {
                                y.c.e(i23);
                            }
                            if (i15 < i91) {
                                i24 = 1;
                            } else {
                                i24 = 1;
                            }
                        }
                        int i354 = ((i15 ^ (-127)) - (~(-(-((i15 & (-127)) << i24))))) - i24;
                        int i355 = i354 & 128;
                        int i356 = (i354 ^ 128) | i355;
                        i15 = (i355 ^ i356) + ((i356 & i355) << i24);
                        i14 = i23;
                    }
                }
            }
        }
    }
}
