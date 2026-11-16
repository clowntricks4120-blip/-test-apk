package ivas.gov.bisp.enumeration.p003ac;

import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Arrays;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private static int a = 1;
    private static int b = 0;
    public static int c = 1;
    public int d;
    public boolean e;
    public float j;
    public int f = -1;
    public int g = -1;
    public int h = 0;
    public boolean i = false;
    public float[] k = new float[9];
    public float[] l = new float[9];
    public r[] m = new r[16];
    public int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f63o = 0;

    public t(int i) {
        this.d = i;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = ((i2 ^ 49) | i3) << 1;
        int i5 = -((i2 | 49) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        StringBuilder sbW = j.w(BuildConfig.FLAVOR);
        sbW.append(this.f);
        int i8 = b;
        int i9 = i8 & 7;
        int i10 = -(-((i8 ^ 7) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return sbW.toString();
        }
        sbW.toString();
        throw null;
    }

    public final void g(r rVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 89;
        int i4 = (i3 << 1) - (i3 & (~(i2 & 89)));
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.n;
        int i7 = i2 & 23;
        int i8 = i7 + ((i2 ^ 23) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < i6) {
            int i11 = a + 97;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                this.m[i10].o(rVar, false);
                int i12 = (i10 & 147) + (i10 | 147);
                i10 = ((i12 | (-25)) << 1) - (i12 ^ (-25));
            } else {
                this.m[i10].o(rVar, false);
                int i13 = i10 & (-70);
                int i14 = (i10 | (-70)) & (~i13);
                int i15 = -(-(i13 << 1));
                int i16 = (i14 & i15) + (i14 | i15);
                i10 = ((i16 ^ 72) + ((i16 & 72) << 1)) - 1;
            }
        }
        this.n = 0;
        int i17 = a + 53;
        b = i17 % 128;
        int i18 = i17 % 2;
    }

    public final void d(r rVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 63;
        int i4 = ((((i2 ^ 63) | i3) << 1) - (~(-((i2 | 63) & (~i3))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.n;
        int i8 = ((i5 & 117) - (~(i5 | 117))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (true) {
            Object obj = null;
            if (i10 >= i7) {
                int i11 = b;
                int i12 = ((i11 ^ 27) | (i11 & 27)) << 1;
                int i13 = -(((~i11) & 27) | (i11 & (-28)));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i15 = b;
            int i16 = i15 + 95;
            a = i16 % 128;
            if (i16 % 2 == 0) {
                r rVar2 = this.m[i10];
                obj.hashCode();
                throw null;
            }
            if (this.m[i10] == rVar) {
                while (true) {
                    int i17 = (i7 ^ (-1)) | i7;
                    if (i10 >= ((i7 | i17) << 1) - (i17 ^ i7)) {
                        int i18 = this.n;
                        int i19 = i18 ^ (-1);
                        int i20 = (i18 | i19) << 1;
                        int i21 = -i19;
                        this.n = (i20 ^ i21) + ((i20 & i21) << 1);
                        int i22 = b + 93;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        return;
                    }
                    int i24 = b;
                    int i25 = i24 ^ 95;
                    int i26 = -(-((i24 & 95) << 1));
                    int i27 = (i25 & i26) + (i25 | i26);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    r[] rVarArr = this.m;
                    int i29 = i10 & 1;
                    int i30 = ((i10 ^ 1) | i29) << 1;
                    int i31 = -((~i29) & (i10 | 1));
                    int i32 = (i30 | i31) + (i30 & i31);
                    int i33 = (i24 & 57) + (i24 | 57);
                    a = i33 % 128;
                    if (i33 % 2 == 0) {
                        rVarArr[i10] = rVarArr[i32];
                        int i34 = 79 / 0;
                    } else {
                        rVarArr[i10] = rVarArr[i32];
                    }
                    i10 = i32;
                }
            } else {
                i10++;
                int i35 = (i15 | 5) << 1;
                int i36 = -(i15 ^ 5);
                int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                a = i37 % 128;
                if (i37 % 2 == 0) {
                    int i38 = 2 % 4;
                }
            }
        }
    }

    public void f(i iVar, float f) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = -(-((i2 ^ 99) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.j = f;
        this.i = true;
        int i7 = this.n;
        int i8 = ((i2 ^ 123) | (i2 & 123)) << 1;
        int i9 = -((i2 & (-124)) | ((~i2) & 123));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i2 & 5;
        int i13 = -(-((i2 ^ 5) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i16 < i7) {
            int i17 = a;
            int i18 = (((i17 | 11) << 1) - (~(-(i17 ^ 11)))) - 1;
            b = i18 % 128;
            if (i18 % 2 != 0) {
                this.m[i16].n(this, false);
                int i19 = i16 & 23;
                int i20 = ((i16 ^ 23) | i19) << 1;
                int i21 = -((i16 | 23) & (~i19));
                i16 = (i20 & i21) + (i21 | i20);
            } else {
                this.m[i16].n(this, false);
                int i22 = i16 & (-19);
                int i23 = i16 | (-19);
                int i24 = (i22 & i23) + (i23 | i22);
                i16 = ((i24 ^ 21) + ((i24 & 21) << 1)) - 1;
            }
            int i25 = b;
            int i26 = i25 & 5;
            int i27 = (((i25 | 5) & (~i26)) - (~(-(-(i26 << 1))))) - 1;
            a = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 5 / 3;
            }
        }
        this.n = 0;
        int i29 = b;
        int i30 = i29 & 5;
        int i31 = -(-((i29 ^ 5) | i30));
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        a = i32 % 128;
        int i33 = i32 % 2;
    }

    public final void c(r rVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 23) << 1) - (i2 ^ 23);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 47;
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            int i9 = this.n;
            Object obj = null;
            if (i8 >= i9) {
                r[] rVarArr = this.m;
                if (i9 >= rVarArr.length) {
                    int i10 = b;
                    int i11 = i10 & 43;
                    int i12 = i11 + ((i10 ^ 43) | i11);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    this.m = (r[]) Arrays.copyOf(rVarArr, rVarArr.length * 2);
                    int i14 = a + 35;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                }
                r[] rVarArr2 = this.m;
                int i16 = this.n;
                int i17 = a;
                int i18 = ((i17 & 92) + (i17 | 92)) - 1;
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    rVarArr2[i16] = rVar;
                    this.n = i16 % 0;
                } else {
                    rVarArr2[i16] = rVar;
                    int i19 = i16 + 2;
                    this.n = (i19 ^ (-1)) + (i19 << 1);
                }
                int i20 = ((i17 & (-120)) | ((~i17) & 119)) + ((i17 & 119) << 1);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i21 = a;
            int i22 = i21 + 87;
            int i23 = i22 % 128;
            b = i23;
            int i24 = i22 % 2;
            if (this.m[i8] == rVar) {
                int i25 = ((i21 ^ 113) | (i21 & 113)) << 1;
                int i26 = -((i21 & (-114)) | ((~i21) & 113));
                int i27 = (i25 & i26) + (i25 | i26);
                b = i27 % 128;
                if (i27 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i28 = i8 - 27;
            i8 = (i28 | 28) + (i28 & 28);
            int i29 = (-2) - ((((i23 | 118) << 1) - (i23 ^ 118)) ^ (-1));
            a = i29 % 128;
            int i30 = i29 % 2;
        }
    }

    public void e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d = 5;
        this.h = 0;
        this.f = -1;
        int i5 = ((i2 | 89) << 1) - ((i2 & (-90)) | ((~i2) & 89));
        b = i5 % 128;
        int i6 = i5 % 2;
        this.g = -1;
        this.j = 0.0f;
        this.i = false;
        int i7 = this.n;
        int i8 = (((i2 & (-2)) | ((~i2) & 1)) - (~((i2 & 1) << 1))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2 != 0 ? 1 : 0;
        int i10 = i2 & 71;
        int i11 = ((i2 | 71) & (~i10)) + (i10 << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        while (i9 < i7) {
            int i13 = a;
            int i14 = i13 ^ 113;
            int i15 = ((((i13 & 113) | i14) << 1) - (~(-i14))) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            this.m[i9] = null;
            i9 = ((((i9 ^ 1) | (i9 & 1)) << 1) - (~(-(((~i9) & 1) | (i9 & (-2)))))) - 1;
            int i17 = i13 & 23;
            int i18 = ((i13 | 23) & (~i17)) + (i17 << 1);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 5 / 2;
            }
        }
        this.n = 0;
        this.f63o = 0;
        this.e = false;
        int i20 = b;
        int i21 = (i20 | 67) << 1;
        int i22 = -(i20 ^ 67);
        int i23 = (i21 & i22) + (i22 | i21);
        a = i23 % 128;
        if (i23 % 2 == 0) {
            Arrays.fill(this.l, 2.0f);
        } else {
            Arrays.fill(this.l, 0.0f);
        }
        int i24 = a + 79;
        b = i24 % 128;
        int i25 = i24 % 2;
    }
}
