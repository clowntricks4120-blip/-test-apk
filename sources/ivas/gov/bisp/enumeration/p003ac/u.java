package ivas.gov.bisp.enumeration.p003ac;

import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class u implements r.aTJ {
    private static int a = 1;
    private static int b;
    public final r l;
    public final e m;
    public int d = 16;
    public int[] e = new int[16];
    public int[] f = new int[16];
    public int[] g = new int[16];
    public float[] i = new float[16];
    public int[] h = new int[16];
    public int[] j = new int[16];
    public int k = 0;
    public int c = -1;

    public u(r rVar, e eVar) {
        this.l = rVar;
        this.m = eVar;
        clear();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x004c  */
    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public boolean c(t tVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 51;
        int i4 = -(-((i2 ^ 51) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        boolean z = false;
        int iQ = q(tVar);
        if (i6 == 0) {
            int i7 = 93 / 0;
            if (iQ != -1) {
                int i8 = a;
                int i9 = i8 & 125;
                int i10 = (i8 | 125) & (~i9);
                int i11 = i9 << 1;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                int i13 = i12 % 128;
                b = i13;
                int i14 = i12 % 2;
                int i15 = i13 & 113;
                int i16 = (i13 | 113) & (~i15);
                int i17 = i15 << 1;
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                a = i18 % 128;
                int i19 = i18 % 2;
                z = true;
            } else {
                int i20 = b;
                int i21 = i20 & 29;
                int i22 = (i21 - (~((i20 ^ 29) | i21))) - 1;
                a = i22 % 128;
                int i23 = i22 % 2;
            }
        } else if (iQ != -1) {
            int i24 = a;
            int i25 = i24 & 125;
            int i110 = (i24 | 125) & (~i25);
            int i111 = i25 << 1;
            int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
            int i113 = i112 % 128;
            b = i113;
            int i114 = i112 % 2;
            int i115 = i113 & 113;
            int i116 = (i113 | 113) & (~i115);
            int i117 = i115 << 1;
            int i118 = ((i116 | i117) << 1) - (i116 ^ i117);
            a = i118 % 128;
            int i119 = i118 % 2;
            z = true;
        } else {
            int i26 = b;
            int i27 = i26 & 29;
            int i28 = (i27 - (~((i26 ^ 29) | i27))) - 1;
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = a;
        int i31 = i30 ^ 67;
        int i32 = (((i30 & 67) | i31) << 1) - i31;
        b = i32 % 128;
        int i33 = i32 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public float e(t tVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 59) + ((i2 & 59) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int iQ = q(tVar);
        if (iQ == -1) {
            int i5 = a + 11;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return 0.0f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = a;
        int i7 = ((i6 | 58) << 1) - (i6 ^ 58);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        float f = this.i[iQ];
        int i10 = ((i6 & 52) + (i6 | 52)) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        return f;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public int i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (i2 ^ 25) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i6 = this.k;
        int i7 = ((i2 ^ 123) | (i2 & 123)) << 1;
        int i8 = -(((~i2) & 123) | (i2 & (-124)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i6;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public void n(float f) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 109;
        int i4 = -(-((i2 ^ 109) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.k;
        int i8 = this.c;
        int i9 = (-2) - ((i2 + 40) ^ (-1));
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < i7) {
            int i12 = a;
            int i13 = i12 & 59;
            int i14 = (i12 | 59) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            int i17 = i16 % 128;
            b = i17;
            int i18 = i16 % 2;
            float[] fArr = this.i;
            float f2 = fArr[i8] / f;
            int i19 = i17 & 85;
            int i20 = -(-((i17 ^ 85) | i19));
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
            fArr[i8] = f2;
            i8 = this.j[i8];
            if (i8 == -1) {
                break;
            }
            int i23 = i17 & 3;
            int i24 = -(-((i17 ^ 3) | i23));
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            a = i25 % 128;
            int i26 = i25 % 2;
            i11 = ((i11 & 1) << 1) + ((i11 & (-2)) | ((~i11) & 1));
            int i27 = ((i17 | 97) << 1) - (i17 ^ 97);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 4 % 5;
            }
        }
        int i29 = b;
        int i30 = (i29 & 6) + (i29 | 6);
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        a = i31 % 128;
        int i32 = i31 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public void o() {
        float f;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = i3 + ((i2 ^ 17) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.k;
        int i7 = this.c;
        int i8 = i2 ^ 13;
        int i9 = ((((i2 & 13) | i8) << 1) - (~(-i8))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < i6) {
            int i12 = a;
            int i13 = ((i12 ^ 107) | (i12 & 107)) << 1;
            int i14 = -(((~i12) & 107) | (i12 & (-108)));
            int i15 = (i13 & i14) + (i14 | i13);
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            float[] fArr = this.i;
            if (i17 != 0) {
                f = fArr[i7];
                int i18 = 18 / 0;
            } else {
                f = fArr[i7];
            }
            int i19 = i16 & 49;
            int i20 = (i16 | 49) & (~i19);
            int i21 = -(-(i19 << 1));
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            int i23 = i22 % 128;
            a = i23;
            int i24 = i22 % 2;
            fArr[i7] = f * (-1.0f);
            i7 = this.j[i7];
            if (i7 == -1) {
                break;
            }
            int i25 = ((i23 ^ 28) + ((i23 & 28) << 1)) - 1;
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            int i28 = i11 + 115;
            int i29 = i28 & (-114);
            int i30 = -(-((i28 ^ (-114)) | i29));
            i11 = (i30 | i29) + (i29 & i30);
            int i31 = i26 & 29;
            int i32 = (i26 ^ 29) | i31;
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            a = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = b + 29;
        a = i35 % 128;
        if (i35 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    /* JADX WARN: Code duplicated, block: B:20:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public t a(int i) {
        t[] tVarArr;
        int[] iArr;
        int i2;
        int i3;
        t tVar;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 ^ 111;
        int i8 = -(-((i6 & 111) << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        int i12 = this.k;
        Object obj = null;
        if (i12 == 0) {
            int i13 = (i6 & 87) + (i6 | 87);
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i6 + 95;
            a = i15 % 128;
            int i16 = i15 % 2;
            return null;
        }
        int i17 = this.c;
        int i18 = i10 & 83;
        int i19 = (i10 ^ 83) | i18;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = 0;
        while (true) {
            if (i22 < i12) {
                int i23 = a;
                int i24 = (i23 & 7) + (i23 | 7);
                b = i24 % 128;
                int i25 = i24 % 2;
                if (i22 == i) {
                    int i26 = i23 + 97;
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 63 / 0;
                        if (i17 != -1) {
                            tVarArr = (t[]) this.m.f;
                            iArr = this.g;
                            int i28 = a;
                            int i29 = i28 & 91;
                            int i30 = (i28 ^ 91) | i29;
                            i2 = ((i29 | i30) << 1) - (i30 ^ i29);
                            i3 = i2 % 128;
                            b = i3;
                            if (i2 % 2 == 0) {
                                t tVar2 = tVarArr[iArr[i17]];
                                obj.hashCode();
                                throw null;
                            }
                            tVar = tVarArr[iArr[i17]];
                            int i31 = i3 & 115;
                            i4 = (i31 - (~((i3 ^ 115) | i31))) - 1;
                            a = i4 % 128;
                            if (i4 % 2 != 0) {
                                return tVar;
                            }
                            throw null;
                        }
                    } else if (i17 != -1) {
                        tVarArr = (t[]) this.m.f;
                        iArr = this.g;
                        int i210 = a;
                        int i211 = i210 & 91;
                        int i32 = (i210 ^ 91) | i211;
                        i2 = ((i211 | i32) << 1) - (i32 ^ i211);
                        i3 = i2 % 128;
                        b = i3;
                        if (i2 % 2 == 0) {
                            t tVar3 = tVarArr[iArr[i17]];
                            obj.hashCode();
                            throw null;
                        }
                        tVar = tVarArr[iArr[i17]];
                        int i33 = i3 & 115;
                        i4 = (i33 - (~((i3 ^ 115) | i33))) - 1;
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            return tVar;
                        }
                        throw null;
                    }
                }
                i17 = this.j[i17];
                if (i17 != -1) {
                    int i34 = (i23 & (-90)) | ((~i23) & 89);
                    int i35 = -(-((i23 & 89) << 1));
                    int i36 = (i34 & i35) + (i35 | i34);
                    b = i36 % 128;
                    if (i36 % 2 != 0) {
                        int i37 = i22 & 97;
                        int i38 = (i22 ^ 97) | i37;
                        i22 = ((i37 | i38) << 1) - (i38 ^ i37);
                    } else {
                        int i39 = (-2) - (((i22 & 1) + (i22 | 1)) ^ (-1));
                        int i40 = i39 ^ 1;
                        i22 = ((((i39 & 1) | i40) << 1) - (~(-i40))) - 1;
                    }
                }
            }
            int i41 = b;
            int i42 = (((i41 & (-76)) | ((~i41) & 75)) - (~((i41 & 75) << 1))) - 1;
            a = i42 % 128;
            if (i42 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b A[LOOP:0: B:6:0x0029->B:22:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public float b(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.k;
        int i8 = this.c;
        int i9 = (((i4 | 124) << 1) - (i4 ^ 124)) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 2 / 2;
        }
        int i11 = 0;
        while (true) {
            if (i11 < i7) {
                i2 = b;
                int i12 = i2 & 27;
                int i13 = (((i2 ^ 27) | i12) << 1) - ((~i12) & (i2 | 27));
                int i14 = i13 % 128;
                a = i14;
                if (i13 % 2 == 0) {
                    int i15 = 95 / 0;
                    if (i11 == i) {
                        break;
                    }
                    i8 = this.j[i8];
                    if (i8 != -1) {
                        int i16 = i14 + 93;
                        int i17 = i16 % 128;
                        b = i17;
                        int i18 = i16 % 2;
                        i11++;
                        int i19 = (i17 ^ 87) + ((i17 & 87) << 1);
                        a = i19 % 128;
                        int i20 = i19 % 2;
                    }
                } else {
                    if (i11 == i) {
                        break;
                    }
                    i8 = this.j[i8];
                    if (i8 != -1) {
                        int i110 = i14 + 93;
                        int i111 = i110 % 128;
                        b = i111;
                        int i112 = i110 % 2;
                        i11++;
                        int i113 = (i111 ^ 87) + ((i111 & 87) << 1);
                        a = i113 % 128;
                        int i21 = i113 % 2;
                    }
                }
            }
            int i22 = (-2) - ((a + 90) ^ (-1));
            b = i22 % 128;
            int i23 = i22 % 2;
            return 0.0f;
        }
        int i24 = ((i2 & 103) - (~(-(-(i2 | 103))))) - 1;
        a = i24 % 128;
        if (i24 % 2 != 0) {
            return this.i[i8];
        }
        float f = this.i[i8];
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d A[PHI: r4
  0x004d: PHI (r4v27 ivas.gov.bisp.enumeration.ac.t) = (r4v16 ivas.gov.bisp.enumeration.ac.t), (r4v33 ivas.gov.bisp.enumeration.ac.t) binds: [B:13:0x004b, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public void clear() {
        t tVarA;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 39) << 1) - (i2 ^ 39);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.k;
        int i7 = i4 & 53;
        int i8 = (((i4 ^ 53) | i7) << 1) - ((i4 | 53) & (~i7));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 3 / 4;
        }
        int i10 = 0;
        while (i10 < i6) {
            int i11 = b;
            int i12 = ((i11 | 3) << 1) - (i11 ^ 3);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                tVarA = a(i10);
                int i13 = 79 / 0;
                if (tVarA != null) {
                    int i14 = a;
                    int i15 = (i14 & 45) + (i14 | 45);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    tVarA.d(this.l);
                    int i17 = a;
                    int i18 = i17 & 91;
                    int i19 = (i18 - (~((i17 ^ 91) | i18))) - 1;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                }
            } else {
                tVarA = a(i10);
                if (tVarA != null) {
                    int i110 = a;
                    int i111 = (i110 & 45) + (i110 | 45);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    tVarA.d(this.l);
                    int i113 = a;
                    int i114 = i113 & 91;
                    int i115 = (i114 - (~((i113 ^ 91) | i114))) - 1;
                    b = i115 % 128;
                    int i21 = i115 % 2;
                }
            }
            int i22 = ((i10 | 41) << 1) - (i10 ^ 41);
            i10 = (i22 ^ (-40)) + ((i22 & (-40)) << 1);
            int i23 = b;
            int i24 = i23 & 29;
            int i25 = i23 | 29;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = b;
        int i29 = i28 & 41;
        int i30 = (i28 ^ 41) | i29;
        int i31 = (i29 & i30) + (i30 | i29);
        a = i31 % 128;
        int i32 = i31 % 2;
        int i33 = 0;
        while (i33 < this.d) {
            int i34 = b;
            int i35 = (i34 & 85) + (i34 | 85);
            int i36 = i35 % 128;
            a = i36;
            int i37 = i35 % 2;
            this.g[i33] = -1;
            this.f[i33] = -1;
            int i38 = i33 & 1;
            int i39 = (i33 | 1) & (~i38);
            int i40 = i38 << 1;
            i33 = (i39 | i40) + (i39 & i40);
            int i41 = ((i36 | 76) << 1) - (i36 ^ 76);
            int i42 = (i41 ^ (-1)) + (i41 << 1);
            b = i42 % 128;
            int i43 = i42 % 2;
        }
        int i44 = a;
        int i45 = i44 ^ 5;
        int i46 = -(-((i44 & 5) << 1));
        int i47 = (i45 & i46) + (i46 | i45);
        b = i47 % 128;
        if (i47 % 2 != 0) {
            int i48 = 5 / 4;
        }
        int i49 = 0;
        while (i49 < 16) {
            int i50 = b;
            int i51 = (i50 & (-84)) | ((~i50) & 83);
            int i52 = -(-((i50 & 83) << 1));
            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
            a = i53 % 128;
            if (i53 % 2 == 0) {
                this.e[i49] = -1;
                i49 += 109;
            } else {
                this.e[i49] = -1;
                i49++;
            }
        }
        this.k = 0;
        this.c = -1;
        int i54 = a;
        int i55 = ((i54 ^ 120) + ((i54 & 120) << 1)) - 1;
        b = i55 % 128;
        int i56 = i55 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public void f(t tVar, float f, boolean z) {
        float f2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = -(-((i2 ^ 83) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (f > -0.001f) {
            int i7 = i2 + 27;
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            if (f < 0.001f) {
                int i10 = i8 + 99;
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        int iQ = q(tVar);
        if (iQ == -1) {
            int i11 = b;
            int i12 = (i11 & 55) + (i11 | 55);
            a = i12 % 128;
            int i13 = i12 % 2;
            d(tVar, f);
            if (i13 == 0) {
                obj.hashCode();
                throw null;
            }
            int i14 = b + 97;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        float[] fArr = this.i;
        int i15 = b;
        int i16 = i15 & 37;
        int i17 = (i15 ^ 37) | i16;
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            f2 = fArr[iQ] % f;
            fArr[iQ] = f2;
        } else {
            f2 = fArr[iQ] + f;
            fArr[iQ] = f2;
        }
        int i19 = i15 & 81;
        int i20 = (i15 ^ 81) | i19;
        int i21 = (i19 & i20) + (i19 | i20);
        int i22 = i21 % 128;
        a = i22;
        int i23 = i21 % 2;
        if (f2 > -0.001f) {
            int i24 = i22 + 3;
            int i25 = i24 % 128;
            b = i25;
            int i26 = i24 % 2;
            if (fArr[iQ] < 0.001f) {
                int i27 = ((i25 & 62) + (i25 | 62)) - 1;
                a = i27 % 128;
                if (i27 % 2 == 0) {
                    fArr[iQ] = 1.0f;
                } else {
                    fArr[iQ] = 0.0f;
                }
                g(tVar, z);
                int i28 = b;
                int i29 = i28 & 117;
                int i30 = ((i28 | 117) & (~i29)) + (i29 << 1);
                a = i30 % 128;
                int i31 = i30 % 2;
            }
        }
        int i32 = a;
        int i33 = (i32 ^ 73) + ((i32 & 73) << 1);
        b = i33 % 128;
        int i34 = i33 % 2;
    }

    public final void p(t tVar, int i) {
        int[] iArr;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 53;
        int i5 = (i3 | 53) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = tVar.f % 16;
        int[] iArr2 = this.e;
        int i10 = a + 125;
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        int i13 = iArr2[i9];
        if (i13 == -1) {
            int i14 = ((i11 ^ 106) + ((i11 & 106) << 1)) - 1;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                iArr2[i9] = i;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iArr2[i9] = i;
            int i15 = ((i11 ^ 37) | (i11 & 37)) << 1;
            int i16 = -((i11 & (-38)) | ((~i11) & 37));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            int i18 = i17 % 2;
        } else {
            while (true) {
                iArr = this.f;
                int i19 = iArr[i13];
                if (i19 == -1) {
                    break;
                }
                int i20 = a;
                int i21 = i20 & 101;
                int i22 = -(-((i20 ^ 101) | i21));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i24 = i23 % 128;
                b = i24;
                int i25 = i23 % 2;
                int i26 = ((i24 ^ 35) - (~((i24 & 35) << 1))) - 1;
                a = i26 % 128;
                int i27 = i26 % 2;
                i13 = i19;
            }
            iArr[i13] = i;
            int i28 = b;
            int i29 = i28 & 81;
            int i30 = (i29 - (~((i28 ^ 81) | i29))) - 1;
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        this.f[i] = -1;
        int i32 = a;
        int i33 = i32 & 5;
        int i34 = (i33 - (~(-(-((i32 ^ 5) | i33))))) - 1;
        b = i34 % 128;
        int i35 = i34 % 2;
    }

    public final void r(int i, t tVar, float f) {
        int[] iArr;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - (((i3 ^ 48) + ((i3 & 48) << 1)) ^ (-1));
        a = i4 % 128;
        int i5 = i4 % 2;
        this.g[i] = tVar.f;
        float[] fArr = this.i;
        int i6 = a + 9;
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            fArr[i] = f;
            this.h[i] = -1;
            iArr = this.j;
            int i8 = 64 / 0;
        } else {
            fArr[i] = f;
            this.h[i] = -1;
            iArr = this.j;
        }
        int i9 = (i7 ^ 81) + ((i7 & 81) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        iArr[i] = -1;
        tVar.c(this.l);
        int i11 = tVar.f63o;
        int i12 = a;
        int i13 = (i12 & 29) + (i12 | 29);
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i11 & 1;
        int i16 = (i11 | 1) & (~i15);
        int i17 = -(-(i15 << 1));
        tVar.f63o = (i16 ^ i17) + ((i16 & i17) << 1);
        int i18 = this.k;
        int i19 = i18 & 1;
        this.k = (((i18 ^ 1) | i19) << 1) - ((i18 | 1) & (~i19));
        int i20 = b;
        int i21 = (i20 & (-52)) | ((~i20) & 51);
        int i22 = -(-((i20 & 51) << 1));
        int i23 = (i21 & i22) + (i22 | i21);
        a = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 30 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public float g(t tVar, boolean z) {
        int[] iArr;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 10) + (i3 | 10)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int iQ = q(tVar);
        Object obj = null;
        if (iQ == -1) {
            int i6 = a;
            int i7 = (i6 & 53) + (i6 | 53);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 & 17;
            int i11 = i10 + ((i8 ^ 17) | i10);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return 0.0f;
            }
            obj.hashCode();
            throw null;
        }
        int i12 = tVar.f;
        int i13 = i12 % 16;
        int i14 = a;
        int i15 = i14 & 101;
        int i16 = (i14 ^ 101) | i15;
        int i17 = (i15 & i16) + (i15 | i16);
        b = i17 % 128;
        int i18 = i17 % 2;
        int[] iArr2 = this.e;
        int i19 = iArr2[i13];
        int i20 = i14 + 91;
        b = i20 % 128;
        int i21 = i20 % 2;
        if (i19 != -1) {
            int i22 = i14 & 93;
            int i23 = (i22 - (~(-(-((i14 ^ 93) | i22))))) - 1;
            int i24 = i23 % 128;
            b = i24;
            int i25 = i23 % 2;
            if (this.g[i19] == i12) {
                int i26 = i24 & 7;
                int i27 = i26 + ((i24 ^ 7) | i26);
                int i28 = i27 % 128;
                a = i28;
                int i29 = i27 % 2;
                int[] iArr3 = this.f;
                iArr2[i13] = iArr3[i19];
                int i30 = i28 + 21;
                int i31 = i30 % 128;
                b = i31;
                int i32 = i30 % 2;
                iArr3[i19] = -1;
                int i33 = (((i31 | 59) << 1) - (~(-(((~i31) & 59) | (i31 & (-60)))))) - 1;
                a = i33 % 128;
                int i34 = i33 % 2;
            } else {
                while (true) {
                    iArr = this.f;
                    i = iArr[i19];
                    if (i == -1) {
                        break;
                    }
                    int i35 = a;
                    int i36 = i35 & 1;
                    int i37 = (i36 - (~((i35 ^ 1) | i36))) - 1;
                    int i38 = i37 % 128;
                    b = i38;
                    if (i37 % 2 != 0) {
                        int i39 = this.g[i];
                        obj.hashCode();
                        throw null;
                    }
                    if (this.g[i] == i12) {
                        break;
                    }
                    int i40 = (i38 & 11) + (i38 | 11);
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    int i42 = (i38 & 71) + (i38 | 71);
                    a = i42 % 128;
                    int i43 = i42 % 2;
                    i19 = i;
                }
                if (i != -1) {
                    int i44 = (-2) - ((b + 90) ^ (-1));
                    int i45 = i44 % 128;
                    a = i45;
                    if (i44 % 2 == 0) {
                        int i46 = this.g[i];
                        throw null;
                    }
                    if (this.g[i] == i12) {
                        iArr[i19] = iArr[i];
                        iArr[i] = -1;
                        int i47 = ((i45 | 49) << 1) - (i45 ^ 49);
                        b = i47 % 128;
                        int i48 = i47 % 2;
                    }
                }
            }
        }
        float f = this.i[iQ];
        if (this.c == iQ) {
            int i49 = b + 37;
            int i50 = i49 % 128;
            a = i50;
            int i51 = i49 % 2;
            this.c = this.j[iQ];
            int i52 = i50 & 113;
            int i53 = -(-(i50 | 113));
            int i54 = (i52 & i53) + (i52 | i53);
            b = i54 % 128;
            int i55 = i54 % 2;
        }
        this.g[iQ] = -1;
        int[] iArr4 = this.h;
        int i56 = (-2) - ((b + 66) ^ (-1));
        int i57 = i56 % 128;
        a = i57;
        if (i56 % 2 == 0) {
            int i58 = iArr4[iQ];
            throw null;
        }
        int i59 = iArr4[iQ];
        if (i59 != -1) {
            int i60 = i57 + 46;
            int i61 = (i60 ^ (-1)) + (i60 << 1);
            b = i61 % 128;
            if (i61 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int[] iArr5 = this.j;
            iArr5[i59] = iArr5[iQ];
            int i62 = ((i57 & (-40)) | ((~i57) & 39)) + ((i57 & 39) << 1);
            b = i62 % 128;
            if (i62 % 2 != 0) {
                int i63 = 3 % 3;
            }
        }
        int i64 = this.j[iQ];
        if (i64 != -1) {
            int i65 = b;
            int i66 = i65 + 83;
            a = i66 % 128;
            int i67 = i66 % 2;
            iArr4[i64] = iArr4[iQ];
            int i68 = ((i65 ^ 111) | (i65 & 111)) << 1;
            int i69 = -((i65 & (-112)) | ((~i65) & 111));
            int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
            a = i70 % 128;
            int i71 = i70 % 2;
        }
        this.k--;
        int i72 = a;
        int i73 = (i72 ^ 35) + ((i72 & 35) << 1);
        b = i73 % 128;
        int i74 = i73 % 2;
        int i75 = tVar.f63o;
        int i76 = i75 ^ (-1);
        int i77 = -(-(i75 << 1));
        tVar.f63o = (i76 ^ i77) + ((i77 & i76) << 1);
        if (!(!z)) {
            int i78 = b;
            int i79 = (((i78 & (-2)) | ((~i78) & 1)) - (~(-(-((i78 & 1) << 1))))) - 1;
            a = i79 % 128;
            int i80 = i79 % 2;
            tVar.d(this.l);
            int i81 = a + 21;
            b = i81 % 128;
            int i82 = i81 % 2;
        }
        int i83 = a;
        int i84 = (((i83 | 82) << 1) - (i83 ^ 82)) - 1;
        b = i84 % 128;
        int i85 = i84 % 2;
        return f;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public float h(r rVar, boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 119;
        int i5 = (i3 & 119) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        float fE = e(rVar.c);
        t tVar = rVar.c;
        int i8 = b + 51;
        a = i8 % 128;
        int i9 = i8 % 2;
        g(tVar, z);
        u uVar = (u) rVar.f;
        int i10 = b;
        int i11 = ((i10 | 21) << 1) - (i10 ^ 21);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        int i14 = uVar.k;
        int i15 = i12 + 92;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            Object obj = null;
            if (i18 >= i14) {
                int i20 = b + 91;
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    return fE;
                }
                throw null;
            }
            int i21 = b;
            int i22 = (-2) - ((((i21 | 58) << 1) - (i21 ^ 58)) ^ (-1));
            a = i22 % 128;
            if (i22 % 2 == 0) {
                int[] iArr = uVar.g;
                throw null;
            }
            int[] iArr2 = uVar.g;
            int i23 = (((i21 & (-34)) | ((~i21) & 33)) - (~((i21 & 33) << 1))) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
            if (iArr2[i19] != -1) {
                int i25 = ((i21 ^ 52) + ((i21 & 52) << 1)) - 1;
                int i26 = i25 % 128;
                a = i26;
                if (i25 % 2 == 0) {
                    float f = uVar.i[i19];
                    throw null;
                }
                float f2 = uVar.i[i19];
                e eVar = this.m;
                int i27 = i26 | 17;
                int i28 = (i27 << 1) - ((~(i26 & 17)) & i27);
                b = i28 % 128;
                if (i28 % 2 != 0) {
                    t tVar2 = ((t[]) eVar.f)[iArr2[i19]];
                    obj.hashCode();
                    throw null;
                }
                t tVar3 = ((t[]) eVar.f)[iArr2[i19]];
                int i29 = b;
                int i30 = (i29 ^ 55) + ((i29 & 55) << 1);
                a = i30 % 128;
                f(tVar3, i30 % 2 == 0 ? f2 / fE : f2 * fE, z);
                int i31 = b;
                int i32 = i31 & 37;
                int i33 = (~i32) & (i31 | 37);
                int i34 = i32 << 1;
                int i35 = (i33 & i34) + (i34 | i33);
                a = i35 % 128;
                if (i35 % 2 == 0) {
                    i = ((i18 | 1) << 1) - (((~i18) & 1) | (i18 & (-2)));
                } else {
                    i = ((i18 ^ 2) + ((i18 & 2) << 1)) - 1;
                }
                int i36 = i31 & 65;
                int i37 = i36 + ((i31 ^ 65) | i36);
                a = i37 % 128;
                int i38 = i37 % 2;
                i18 = i;
            }
            i19++;
            int i39 = b;
            int i40 = (i39 ^ 83) + ((i39 & 83) << 1);
            a = i40 % 128;
            int i41 = i40 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        if (r1 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r1 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r11 = r6 & 11;
        r11 = (r11 - (~(-(-((r6 ^ 11) | r11))))) - 1;
        r1 = r11 % 128;
        ivas.gov.bisp.enumeration.p003ac.u.a = r1;
        r11 = r11 % 2;
        r11 = r1 & 13;
        r1 = (((r1 | 13) & (~r11)) - (~(-(-(r11 << 1))))) - 1;
        ivas.gov.bisp.enumeration.p003ac.u.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if ((r1 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r10.g[r1] != r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        r5 = r5 + 55;
        r11 = r5 % 128;
        ivas.gov.bisp.enumeration.p003ac.u.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if ((r5 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        r2 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r2 = (((r11 | 54) << 1) - (r11 ^ 54)) - 1;
        ivas.gov.bisp.enumeration.p003ac.u.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if ((r2 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        r11 = 78 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        r1 = r10.f[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r1 == (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p003ac.u.b;
        r5 = (r2 ^ 25) + ((r2 & 25) << 1);
        ivas.gov.bisp.enumeration.p003ac.u.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        if (r10.g[r1] == r11) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        r5 = ((r2 | 67) << 1) - (r2 ^ 67);
        ivas.gov.bisp.enumeration.p003ac.u.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if ((r5 % 2) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        r2 = 31 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        if (r1 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p003ac.u.b;
        r1 = ((r11 & 98) + (r11 | 98)) - 1;
        r11 = r1 % 128;
        ivas.gov.bisp.enumeration.p003ac.u.a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        if ((r1 % 2) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        r1 = ((r11 & (-16)) | ((~r11) & 15)) + ((r11 & 15) << 1);
        ivas.gov.bisp.enumeration.p003ac.u.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0102, code lost:
    
        if ((r1 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
    
        r11 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0109, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0111, code lost:
    
        if (r10.g[r1] != r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p003ac.u.b;
        r2 = (r11 & (-112)) | ((~r11) & 111);
        r11 = (r11 & 111) << 1;
        r4 = (r2 & r11) + (r11 | r2);
        r11 = r4 % 128;
        ivas.gov.bisp.enumeration.p003ac.u.a = r11;
        r4 = r4 % 2;
        r2 = ((r11 & (-114)) | ((~r11) & 113)) + ((r11 & 113) << 1);
        ivas.gov.bisp.enumeration.p003ac.u.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0138, code lost:
    
        if ((r2 % 2) != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p003ac.u.b;
        r1 = ((r11 ^ 87) | (r11 & 87)) << 1;
        r11 = -(((~r11) & 87) | (r11 & (-88)));
        r2 = ((r1 | r11) << 1) - (r11 ^ r1);
        ivas.gov.bisp.enumeration.p003ac.u.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015b, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int q(ivas.gov.bisp.enumeration.p003ac.t r11) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p003ac.u.q(ivas.gov.bisp.enumeration.ac.t):int");
    }

    public String toString() {
        String strR;
        int[] iArr;
        String strR2;
        String strR3;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int iHashCode = hashCode();
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = (i2 ^ 123) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        sb.append(iHashCode);
        sb.append(" { ");
        int i7 = b;
        int i8 = ((i7 ^ 48) + ((i7 & 48) << 1)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        String string = sb.toString();
        int i10 = this.k;
        int i11 = a;
        int i12 = i11 & 7;
        int i13 = (i12 - (~(-(-((i11 ^ 7) | i12))))) - 1;
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i15 < i10) {
            int i16 = b;
            int i17 = (i16 ^ 69) + ((i16 & 69) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            t tVarA = a(i15);
            if (tVarA != null) {
                StringBuilder sb2 = new StringBuilder();
                int i19 = a;
                int i20 = i19 & 119;
                int i21 = ((i19 | 119) & (~i20)) + (i20 << 1);
                b = i21 % 128;
                Object obj = null;
                if (i21 % 2 != 0) {
                    sb2.append(string);
                    sb2.append(tVarA);
                    throw null;
                }
                sb2.append(string);
                sb2.append(tVarA);
                sb2.append(" = ");
                float fB = b(i15);
                int i22 = b + 105;
                a = i22 % 128;
                int i23 = i22 % 2;
                sb2.append(fB);
                sb2.append(" ");
                int i24 = b;
                int i25 = (-2) - (((i24 & 4) + (i24 | 4)) ^ (-1));
                a = i25 % 128;
                int i26 = i25 % 2;
                String string2 = sb2.toString();
                int iQ = q(tVarA);
                int i27 = b;
                int i28 = (i27 & 11) + (i27 | 11);
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    strR = j.r(string2, "[p: ");
                    iArr = this.h;
                    int i29 = 52 / 0;
                } else {
                    strR = j.r(string2, "[p: ");
                    iArr = this.h;
                }
                if (iArr[iQ] != -1) {
                    int i30 = a;
                    int i31 = (((i30 | 68) << 1) - (i30 ^ 68)) - 1;
                    b = i31 % 128;
                    if (i31 % 2 != 0) {
                        j.w(strR);
                        Object obj2 = this.m.f;
                        throw null;
                    }
                    StringBuilder sbW = j.w(strR);
                    Object obj3 = this.m.f;
                    int i32 = b;
                    int i33 = (i32 & 7) + (i32 | 7);
                    int i34 = i33 % 128;
                    a = i34;
                    int i35 = i33 % 2;
                    int[] iArr2 = this.g;
                    int i36 = this.h[iQ];
                    int i37 = ((i34 & 34) + (i34 | 34)) - 1;
                    b = i37 % 128;
                    int i38 = i37 % 2;
                    sbW.append(((t[]) obj3)[iArr2[i36]]);
                    strR2 = sbW.toString();
                    int i39 = b;
                    int i40 = i39 & 75;
                    int i41 = -(-((i39 ^ 75) | i40));
                    int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                    a = i42 % 128;
                    int i43 = i42 % 2;
                } else {
                    strR2 = j.r(strR, "none");
                    int i44 = b;
                    int i45 = (i44 ^ 45) + ((i44 & 45) << 1);
                    a = i45 % 128;
                    int i46 = i45 % 2;
                }
                String strR4 = j.r(strR2, ", n: ");
                int[] iArr3 = this.j;
                int i47 = b;
                int i48 = i47 + 83;
                a = i48 % 128;
                if (i48 % 2 == 0) {
                    int i49 = iArr3[iQ];
                    obj.hashCode();
                    throw null;
                }
                if (iArr3[iQ] != -1) {
                    int i50 = i47 & 111;
                    int i51 = -(-((i47 ^ 111) | i50));
                    int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    StringBuilder sbW2 = j.w(strR4);
                    e eVar = this.m;
                    int i54 = b;
                    int i55 = i54 ^ 61;
                    int i56 = -(-((i54 & 61) << 1));
                    int i57 = (i55 & i56) + (i56 | i55);
                    a = i57 % 128;
                    int i58 = i57 % 2;
                    t[] tVarArr = (t[]) eVar.f;
                    int[] iArr4 = this.g;
                    int[] iArr5 = this.j;
                    int i59 = a + 109;
                    b = i59 % 128;
                    if (i59 % 2 != 0) {
                        sbW2.append(tVarArr[iArr4[iArr5[iQ]]]);
                        strR3 = sbW2.toString();
                        int i60 = 50 / 0;
                    } else {
                        sbW2.append(tVarArr[iArr4[iArr5[iQ]]]);
                        strR3 = sbW2.toString();
                    }
                    int i61 = b;
                    int i62 = ((i61 & (-10)) | ((~i61) & 9)) + ((i61 & 9) << 1);
                    a = i62 % 128;
                    if (i62 % 2 == 0) {
                        int i63 = 2 / 0;
                    }
                    int i64 = (i61 | 91) << 1;
                    int i65 = -(((~i61) & 91) | (i61 & (-92)));
                    int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                    a = i66 % 128;
                    int i67 = i66 % 2;
                } else {
                    strR3 = j.r(strR4, "none");
                    int i68 = a;
                    int i69 = i68 ^ 25;
                    int i70 = (((i68 & 25) | i69) << 1) - i69;
                    b = i70 % 128;
                    int i71 = i70 % 2;
                }
                string = j.r(strR3, "]");
                int i72 = b;
                int i73 = ((i72 ^ 51) | (i72 & 51)) << 1;
                int i74 = -(((~i72) & 51) | (i72 & (-52)));
                int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                a = i75 % 128;
                int i76 = i75 % 2;
            }
            int i77 = i15 + 120;
            i15 = (-2) - ((((i77 ^ (-1)) + (i77 << 1)) - 117) ^ (-1));
            int i78 = b + 35;
            a = i78 % 128;
            int i79 = i78 % 2;
        }
        String strR5 = j.r(string, " }");
        int i80 = a;
        int i81 = i80 & 113;
        int i82 = -(-((i80 ^ 113) | i81));
        int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
        b = i83 % 128;
        int i84 = i83 % 2;
        return strR5;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0107  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119  */
    /* JADX WARN: Code duplicated, block: B:36:0x012e  */
    /* JADX WARN: Code duplicated, block: B:39:0x014f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0162  */
    /* JADX WARN: Code duplicated, block: B:42:0x0170  */
    /* JADX WARN: Code duplicated, block: B:45:0x0190  */
    /* JADX WARN: Code duplicated, block: B:47:0x019f A[LOOP:2: B:44:0x018e->B:47:0x019f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x01e1  */
    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public void d(t tVar, float f) {
        int i;
        int i2;
        int[] iArrCopyOf;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        int i9;
        int i10;
        int i11 = 2 % 2;
        int i12 = b;
        int i13 = i12 + 39;
        a = i13 % 128;
        int i14 = i13 % 2;
        if (f > -0.001f) {
            int i15 = ((i12 | 29) << 1) - (i12 ^ 29);
            int i16 = i15 % 128;
            a = i16;
            int i17 = i15 % 2;
            if (f < 0.001f) {
                int i18 = i16 & 43;
                int i19 = ((~i18) & (i16 | 43)) + (i18 << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
                g(tVar, true);
                int i21 = a;
                int i22 = (i21 | 33) << 1;
                int i23 = -(((~i21) & 33) | (i21 & (-34)));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
                return;
            }
        }
        int i26 = 0;
        Object obj = null;
        if (this.k == 0) {
            int i27 = i12 & 59;
            int i28 = (i12 | 59) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            a = i30 % 128;
            if (i30 % 2 == 0) {
                r(1, tVar, f);
                p(tVar, 1);
            } else {
                r(0, tVar, f);
                p(tVar, 0);
            }
            int i31 = a;
            int i32 = i31 & 33;
            int i33 = (i31 ^ 33) | i32;
            int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
            b = i34 % 128;
            int i35 = i34 % 2;
            this.c = 0;
            int i36 = (i31 | 63) << 1;
            int i37 = -(((~i31) & 63) | (i31 & (-64)));
            int i38 = (i36 & i37) + (i37 | i36);
            b = i38 % 128;
            if (i38 % 2 != 0) {
                throw null;
            }
            return;
        }
        int iQ = q(tVar);
        if (iQ != -1) {
            int i39 = b;
            int i40 = i39 & 79;
            int i41 = -(-((i39 ^ 79) | i40));
            int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
            a = i42 % 128;
            if (i42 % 2 == 0) {
                this.i[iQ] = f;
                obj.hashCode();
                throw null;
            }
            this.i[iQ] = f;
            int i43 = i39 & 1;
            int i44 = ((i39 | 1) & (~i43)) + (i43 << 1);
            a = i44 % 128;
            int i45 = i44 % 2;
            return;
        }
        int i46 = this.k;
        int i47 = this.d;
        int i48 = a;
        int i49 = i48 & 61;
        int i50 = (~i49) & (i48 | 61);
        int i51 = i49 << 1;
        int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
        b = i52 % 128;
        if (i52 % 2 == 0) {
            if ((((i46 ^ 1) | (i46 & 1)) << 1) - (((~i46) & 1) | (i46 & (-2))) >= i47) {
                int i53 = i48 & 55;
                int i54 = -(-((i48 ^ 55) | i53));
                i = (i53 & i54) + (i53 | i54);
                b = i % 128;
                if (i % 2 != 0) {
                    int i55 = i47 | 5;
                    int i56 = i55 << 1;
                    int i57 = -(i55 & (~(i47 & 5)));
                    i2 = (i56 ^ i57) + ((i57 & i56) << 1);
                    iArrCopyOf = Arrays.copyOf(this.g, i2);
                } else {
                    i2 = i47 * 2;
                    iArrCopyOf = Arrays.copyOf(this.g, i2);
                }
                this.g = iArrCopyOf;
                this.i = Arrays.copyOf(this.i, i2);
                int i58 = a;
                i3 = ((i58 ^ 76) + ((i58 & 76) << 1)) - 1;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    this.h = Arrays.copyOf(this.h, i2);
                    obj.hashCode();
                    throw null;
                }
                this.h = Arrays.copyOf(this.h, i2);
                i4 = a + 91;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    this.j = Arrays.copyOf(this.j, i2);
                    iArr = this.f;
                    int i59 = 46 / 0;
                } else {
                    this.j = Arrays.copyOf(this.j, i2);
                    iArr = this.f;
                }
                this.f = Arrays.copyOf(iArr, i2);
                i5 = this.d;
                int i60 = a;
                int i61 = (i60 & 65) + (i60 | 65);
                b = i61 % 128;
                int i62 = i61 % 2;
                while (i5 < i2) {
                    i6 = b;
                    i7 = ((i6 & 8) + (i6 | 8)) - 1;
                    a = i7 % 128;
                    if (i7 % 2 != 0) {
                        this.g[i5] = -1;
                        throw null;
                    }
                    this.g[i5] = -1;
                    int[] iArr3 = this.f;
                    int i63 = i6 + 79;
                    int i64 = i63 % 128;
                    a = i64;
                    int i65 = i63 % 2;
                    iArr3[i5] = -1;
                    int i66 = (i5 & 49) + (i5 | 49);
                    i5 = (i66 & (-48)) + (i66 | (-48));
                    int i67 = ((i64 | 119) << 1) - (i64 ^ 119);
                    b = i67 % 128;
                    int i68 = i67 % 2;
                }
                this.d = i2;
                int i69 = a;
                int i70 = i69 & 79;
                int i71 = (i69 | 79) & (~i70);
                int i72 = -(-(i70 << 1));
                int i73 = (i71 ^ i72) + ((i71 & i72) << 1);
                b = i73 % 128;
                int i74 = i73 % 2;
            }
        } else if (i46 / 0 >= i47) {
            int i510 = i48 & 55;
            int i511 = -(-((i48 ^ 55) | i510));
            i = (i510 & i511) + (i510 | i511);
            b = i % 128;
            if (i % 2 != 0) {
                int i512 = i47 | 5;
                int i513 = i512 << 1;
                int i514 = -(i512 & (~(i47 & 5)));
                i2 = (i513 ^ i514) + ((i514 & i513) << 1);
                iArrCopyOf = Arrays.copyOf(this.g, i2);
            } else {
                i2 = i47 * 2;
                iArrCopyOf = Arrays.copyOf(this.g, i2);
            }
            this.g = iArrCopyOf;
            this.i = Arrays.copyOf(this.i, i2);
            int i515 = a;
            i3 = ((i515 ^ 76) + ((i515 & 76) << 1)) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                this.h = Arrays.copyOf(this.h, i2);
                obj.hashCode();
                throw null;
            }
            this.h = Arrays.copyOf(this.h, i2);
            i4 = a + 91;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                this.j = Arrays.copyOf(this.j, i2);
                iArr = this.f;
                int i516 = 46 / 0;
            } else {
                this.j = Arrays.copyOf(this.j, i2);
                iArr = this.f;
            }
            this.f = Arrays.copyOf(iArr, i2);
            i5 = this.d;
            int i610 = a;
            int i611 = (i610 & 65) + (i610 | 65);
            b = i611 % 128;
            int i612 = i611 % 2;
            while (i5 < i2) {
                i6 = b;
                i7 = ((i6 & 8) + (i6 | 8)) - 1;
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    this.g[i5] = -1;
                    throw null;
                }
                this.g[i5] = -1;
                int[] iArr4 = this.f;
                int i613 = i6 + 79;
                int i614 = i613 % 128;
                a = i614;
                int i615 = i613 % 2;
                iArr4[i5] = -1;
                int i616 = (i5 & 49) + (i5 | 49);
                i5 = (i616 & (-48)) + (i616 | (-48));
                int i617 = ((i614 | 119) << 1) - (i614 ^ 119);
                b = i617 % 128;
                int i618 = i617 % 2;
            }
            this.d = i2;
            int i619 = a;
            int i75 = i619 & 79;
            int i76 = (i619 | 79) & (~i75);
            int i77 = -(-(i75 << 1));
            int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
            b = i78 % 128;
            int i79 = i78 % 2;
        }
        int i80 = this.k;
        int i81 = this.c;
        int i82 = b;
        int i83 = ((i82 | 51) << 1) - (i82 ^ 51);
        a = i83 % 128;
        if (i83 % 2 == 0) {
            throw null;
        }
        int i84 = -1;
        int i85 = 0;
        while (i85 < i80) {
            int i86 = b;
            int i87 = i86 & 123;
            int i88 = -(-((i86 ^ 123) | i87));
            int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
            a = i89 % 128;
            if (i89 % 2 == 0) {
                iArr2 = this.g;
                i9 = iArr2[i81];
                i10 = tVar.f;
                int i90 = 18 / i26;
            } else {
                iArr2 = this.g;
                i9 = iArr2[i81];
                i10 = tVar.f;
            }
            int i91 = b;
            int i92 = i91 & 115;
            int i93 = (~i92) & (i91 | 115);
            int i94 = -(-(i92 << 1));
            int i95 = (i93 ^ i94) + ((i93 & i94) << 1);
            a = i95 % 128;
            if (i95 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i9 == i10) {
                int i96 = i91 & 99;
                int i97 = ((i91 ^ 99) | i96) << 1;
                int i98 = -((~i96) & (i91 | 99));
                int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                a = i99 % 128;
                int i100 = i99 % 2;
                this.i[i81] = f;
                int i101 = (((i91 | 24) << 1) - (i91 ^ 24)) - 1;
                a = i101 % 128;
                int i102 = i101 % 2;
                return;
            }
            if (iArr2[i81] < i10) {
                int i103 = i91 & 23;
                int i104 = ((~i103) & (i91 | 23)) + (i103 << 1);
                a = i104 % 128;
                if (i104 % 2 == 0) {
                    throw null;
                }
                i84 = i81;
            }
            i81 = this.j[i81];
            if (i81 == -1) {
                int i105 = a + 39;
                int i106 = i105 % 128;
                b = i106;
                int i107 = i105 % 2;
                int i108 = ((i106 & 104) + (i106 | 104)) - 1;
                a = i108 % 128;
                int i109 = i108 % 2;
                break;
            }
            int i110 = i85 ^ 1;
            i85 = (((i85 & 1) | i110) << 1) - i110;
            int i111 = a;
            int i112 = i111 & 69;
            int i113 = ((((i111 ^ 69) | i112) << 1) - (~(-((i111 | 69) & (~i112))))) - 1;
            b = i113 % 128;
            int i114 = i113 % 2;
            i26 = 0;
        }
        int i115 = 0;
        while (true) {
            if (i115 >= this.d) {
                int i116 = b;
                int i117 = i116 & 99;
                int i118 = (i116 ^ 99) | i117;
                int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                a = i119 % 128;
                int i120 = i119 % 2;
                i8 = -1;
                break;
            }
            int i121 = b;
            int i122 = i121 + 31;
            a = i122 % 128;
            int i123 = i122 % 2;
            if (this.g[i115] == -1) {
                i8 = i115;
                break;
            }
            int i124 = (-2) - ((((i121 | 16) << 1) - (i121 ^ 16)) ^ (-1));
            a = i124 % 128;
            if (i124 % 2 == 0) {
                int i125 = i115 & (-45);
                int i126 = -(-((i115 ^ (-45)) | i125));
                int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                int i128 = i127 & 100;
                i115 = ((((i127 ^ 100) | i128) << 1) - (~(-((~i128) & (i127 | 100))))) - 1;
            } else {
                i115 = (((i115 | 2) << 1) - (i115 ^ 2)) - 1;
            }
        }
        r(i8, tVar, f);
        if (i84 != -1) {
            int i129 = b;
            int i130 = i129 ^ 99;
            int i131 = -(-((i129 & 99) << 1));
            int i132 = ((i130 | i131) << 1) - (i130 ^ i131);
            a = i132 % 128;
            if (i132 % 2 == 0) {
                this.h[i8] = i84;
                throw null;
            }
            this.h[i8] = i84;
            int[] iArr5 = this.j;
            iArr5[i8] = iArr5[i84];
            int i133 = i129 & 57;
            int i134 = i133 + ((i129 ^ 57) | i133);
            a = i134 % 128;
            if (i134 % 2 == 0) {
                iArr5[i84] = i8;
                int i135 = 2 / 0;
            } else {
                iArr5[i84] = i8;
            }
        } else {
            this.h[i8] = -1;
            if (this.k > 0) {
                int i136 = a;
                int i137 = i136 & 47;
                int i138 = (((i136 ^ 47) | i137) << 1) - ((i136 | 47) & (~i137));
                int i139 = i138 % 128;
                b = i139;
                if (i138 % 2 != 0) {
                    this.j[i8] = this.c;
                    obj.hashCode();
                    throw null;
                }
                this.j[i8] = this.c;
                int i140 = i139 | 27;
                int i141 = ((i140 << 1) - (~(-((~(i139 & 27)) & i140)))) - 1;
                int i142 = i141 % 128;
                a = i142;
                int i143 = i141 % 2;
                this.c = i8;
                int i144 = i142 & 47;
                int i145 = ((i142 ^ 47) | i144) << 1;
                int i146 = -((i142 | 47) & (~i144));
                int i147 = ((i145 | i146) << 1) - (i146 ^ i145);
                b = i147 % 128;
                int i148 = i147 % 2;
            } else {
                this.j[i8] = -1;
                int i149 = a + 87;
                b = i149 % 128;
                int i150 = i149 % 2;
            }
        }
        int i151 = this.j[i8];
        if (i151 != -1) {
            int i152 = a;
            int i153 = i152 + 121;
            b = i153 % 128;
            int i154 = i153 % 2;
            this.h[i151] = i8;
            int i155 = i152 ^ 105;
            int i156 = -(-((i152 & 105) << 1));
            int i157 = ((i155 | i156) << 1) - (i155 ^ i156);
            b = i157 % 128;
            int i158 = i157 % 2;
        }
        p(tVar, i8);
        int i159 = a;
        int i160 = (i159 ^ 21) + ((i159 & 21) << 1);
        b = i160 % 128;
        int i161 = i160 % 2;
    }
}
