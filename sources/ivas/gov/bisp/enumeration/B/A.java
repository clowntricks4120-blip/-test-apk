package ivas.gov.bisp.enumeration.B;

import androidx.constraintlayout.widget.ConstraintLayout;
import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.O;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class A {
    private static int a = 1;
    private static int b;
    public final ArrayList<C0087m> c = new ArrayList<>();
    public aUq d = new aUq();
    public O e;

    public interface aJL {
    }

    public static class aUq {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public boolean j;
    }

    public A(O o2) {
        this.e = o2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0043  */
    public final void d(O o2, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 87) + (i4 | 87);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = o2.V;
        int i8 = o2.S;
        o2.z(0);
        int i9 = b;
        int i10 = i9 & 61;
        int i11 = (i9 ^ 61) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        o2.A(0);
        o2.P = i;
        int i14 = o2.V;
        int i15 = a;
        int i16 = (i15 & 81) + (i15 | 81);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 2 / 0;
            if (i < i14) {
                o2.P = i14;
                int i18 = a;
                int i19 = (((i18 | 126) << 1) - (i18 ^ 126)) - 1;
                b = i19 % 128;
                int i20 = i19 % 2;
            }
        } else if (i < i14) {
            o2.P = i14;
            int i110 = a;
            int i111 = (((i110 | 126) << 1) - (i110 ^ 126)) - 1;
            b = i111 % 128;
            int i21 = i111 % 2;
        }
        o2.O = i2;
        int i22 = o2.S;
        Object obj = null;
        if (i2 < i22) {
            int i23 = b;
            int i24 = i23 & 35;
            int i25 = -(-(i23 | 35));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            a = i26 % 128;
            if (i26 % 2 == 0) {
                o2.O = i22;
                throw null;
            }
            o2.O = i22;
            int i27 = b;
            int i28 = ((i27 ^ 11) | (i27 & 11)) << 1;
            int i29 = -(((~i27) & 11) | (i27 & (-12)));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        o2.z(i7);
        o2.A(i8);
        O o3 = this.e;
        int i32 = b;
        int i33 = (((i32 ^ 115) | (i32 & 115)) << 1) - (((~i32) & 115) | (i32 & (-116)));
        a = i33 % 128;
        if (i33 % 2 == 0) {
            o3.F();
            obj.hashCode();
            throw null;
        }
        o3.F();
        int i34 = b + 103;
        a = i34 % 128;
        int i35 = i34 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009d  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a9 A[PHI: r5
  0x00a9: PHI (r5v10 boolean) = (r5v9 boolean), (r5v14 boolean) binds: [B:20:0x00a0, B:16:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x016e  */
    public final boolean c(aJL ajl, C0087m c0087m, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 29;
        int i5 = ((i3 & 29) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        this.d.b = c0087m.k();
        int i9 = b;
        int i10 = i9 ^ 67;
        int i11 = ((i9 & 67) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        a = i13 % 128;
        Object obj = null;
        if (i13 % 2 == 0) {
            this.d.c = c0087m.n();
            throw null;
        }
        this.d.c = c0087m.n();
        aUq auq = this.d;
        int i14 = a;
        int i15 = ((i14 ^ 58) + ((i14 & 58) << 1)) - 1;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            auq.d = c0087m.p();
            obj.hashCode();
            throw null;
        }
        auq.d = c0087m.p();
        this.d.e = c0087m.c();
        aUq auq2 = this.d;
        int i16 = b + 113;
        a = i16 % 128;
        int i17 = i16 % 2;
        auq2.a = false;
        auq2.j = z;
        int i18 = a;
        int i19 = i18 & 57;
        int i20 = -(-(i18 | 57));
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        if (i21 % 2 != 0) {
            if (auq2.b == 2) {
                z2 = false;
                int i22 = b;
                int i23 = i22 & 21;
                i = i23 + ((i22 ^ 21) | i23);
                a = i % 128;
                if (i % 2 == 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z2 = false;
                int i24 = b + 7;
                a = i24 % 128;
                int i25 = i24 % 2;
                z3 = false;
            }
        } else if (auq2.b == 3) {
            z2 = true;
            int i26 = b;
            int i27 = i26 & 21;
            i = i27 + ((i26 ^ 21) | i27);
            a = i % 128;
            if (i % 2 == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z2 = true;
            int i28 = b + 7;
            a = i28 % 128;
            int i29 = i28 % 2;
            z3 = false;
        }
        if (auq2.c == 3) {
            int i30 = a;
            int i31 = ((i30 ^ 8) + ((i30 & 8) << 1)) - 1;
            b = i31 % 128;
            int i32 = i31 % 2;
            int i33 = (i30 & (-76)) | ((~i30) & 75);
            int i34 = -(-((i30 & 75) << 1));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            b = i35 % 128;
            int i36 = i35 % 2;
            z4 = true;
        } else {
            int i37 = b;
            int i38 = i37 & 117;
            int i39 = i38 + ((i37 ^ 117) | i38);
            a = i39 % 128;
            int i40 = i39 % 2;
            z4 = false;
        }
        if (z3) {
            int i41 = a;
            int i42 = (i41 & 47) + (i41 | 47);
            b = i42 % 128;
            if (i42 % 2 == 0 ? c0087m.Q <= 0.0f : c0087m.Q <= 0.0f) {
                int i43 = a + 106;
                int i44 = (i43 ^ (-1)) + (i43 << 1);
                b = i44 % 128;
                int i45 = i44 % 2;
                z5 = false;
            } else {
                int i46 = a;
                int i47 = i46 ^ 93;
                int i48 = ((i46 & 93) | i47) << 1;
                int i49 = -i47;
                int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
                int i51 = i50 % 128;
                b = i51;
                int i52 = i50 % 2;
                int i53 = i51 & 7;
                int i54 = i53 + ((i51 ^ 7) | i53);
                a = i54 % 128;
                int i55 = i54 % 2;
                z5 = true;
            }
        } else {
            int i410 = a + 106;
            int i411 = (i410 ^ (-1)) + (i410 << 1);
            b = i411 % 128;
            int i412 = i411 % 2;
            z5 = false;
        }
        if (z4) {
            int i56 = b;
            int i57 = i56 & 11;
            int i58 = (((i56 ^ 11) | i57) << 1) - ((i56 | 11) & (~i57));
            a = i58 % 128;
            if (i58 % 2 != 0 ? c0087m.Q <= 0.0f : c0087m.Q <= 0.0f) {
                int i59 = a;
                int i60 = i59 | 83;
                int i61 = ((i60 << 1) - (~(-((~(i59 & 83)) & i60)))) - 1;
                b = i61 % 128;
                int i62 = i61 % 2;
                z6 = false;
            } else {
                int i63 = a;
                int i64 = i63 + 97;
                b = i64 % 128;
                int i65 = i64 % 2;
                int i66 = i63 | 7;
                int i67 = i66 << 1;
                int i68 = -((~(i63 & 7)) & i66);
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                b = i69 % 128;
                int i70 = i69 % 2;
                z6 = true;
            }
        } else {
            int i510 = a;
            int i610 = i510 | 83;
            int i611 = ((i610 << 1) - (~(-((~(i510 & 83)) & i610)))) - 1;
            b = i611 % 128;
            int i612 = i611 % 2;
            z6 = false;
        }
        if (!(!z5)) {
            int i71 = a;
            int i72 = i71 & 37;
            int i73 = i72 + ((i71 ^ 37) | i72);
            b = i73 % 128;
            int i74 = i73 % 2;
            if (c0087m.n[0] == 4) {
                int i75 = b;
                int i76 = i75 & 91;
                int i77 = (i75 | 91) & (~i76);
                int i78 = -(-(i76 << 1));
                int i79 = (i77 & i78) + (i77 | i78);
                a = i79 % 128;
                int i80 = i79 % 2;
                auq2.b = 1;
                int i81 = b;
                int i82 = (i81 & (-100)) | ((~i81) & 99);
                int i83 = (i81 & 99) << 1;
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                a = i84 % 128;
                int i85 = i84 % 2;
            }
        }
        if (z6) {
            int i86 = a;
            int i87 = i86 & 57;
            int i88 = (i86 ^ 57) | i87;
            int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
            b = i89 % 128;
            int i90 = i89 % 2;
            if (c0087m.n[1] == 4) {
                int i91 = b;
                int i92 = (i91 ^ 47) + ((i91 & 47) << 1);
                a = i92 % 128;
                int i93 = i92 % 2;
                auq2.c = 1;
                int i94 = a;
                int i95 = ((i94 | 1) << 1) - (i94 ^ 1);
                b = i95 % 128;
                int i96 = i95 % 2;
            }
        }
        ((ConstraintLayout.OooO0O0) ajl).b(c0087m, auq2);
        int i97 = a + 67;
        b = i97 % 128;
        int i98 = i97 % 2;
        c0087m.D(this.d.g);
        aUq auq3 = this.d;
        int i99 = b;
        int i100 = i99 & 15;
        int i101 = i100 + ((i99 ^ 15) | i100);
        a = i101 % 128;
        int i102 = i101 % 2;
        c0087m.y(auq3.f);
        aUq auq4 = this.d;
        int i103 = a + 43;
        b = i103 % 128;
        if (i103 % 2 != 0) {
            c0087m.z = auq4.i;
            int i104 = 59 / 0;
        } else {
            c0087m.z = auq4.i;
        }
        int i105 = a;
        int i106 = i105 & 47;
        int i107 = ((i105 ^ 47) | i106) << 1;
        int i108 = -((i105 | 47) & (~i106));
        int i109 = (i107 & i108) + (i108 | i107);
        b = i109 % 128;
        if (i109 % 2 != 0) {
            c0087m.T = auq4.h;
            throw null;
        }
        int i110 = auq4.h;
        c0087m.T = i110;
        if (i110 <= 0) {
            int i111 = b;
            int i112 = i111 ^ 93;
            int i113 = ((i111 & 93) | i112) << 1;
            int i114 = -i112;
            int i115 = (i113 & i114) + (i113 | i114);
            a = i115 % 128;
            int i116 = i115 % 2;
            z2 = false;
        }
        c0087m.z = z2;
        auq4.j = false;
        boolean z7 = auq4.a;
        int i117 = a;
        int i118 = i117 ^ 113;
        int i119 = (((i117 & 113) | i118) << 1) - i118;
        b = i119 % 128;
        int i120 = i119 % 2;
        return z7;
    }
}
