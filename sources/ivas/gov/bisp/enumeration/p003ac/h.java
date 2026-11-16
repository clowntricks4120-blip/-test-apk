package ivas.gov.bisp.enumeration.p003ac;

import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Arrays;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class h implements r.aTJ {
    private static int a = 0;
    private static int b = 1;
    public final r e;
    public final e f;
    public int d = 0;
    public int g = 8;
    public int[] i = new int[8];
    public int[] h = new int[8];
    public float[] j = new float[8];
    public int k = -1;
    public int c = -1;
    public boolean l = false;

    public h(r rVar, e eVar) {
        this.e = rVar;
        this.f = eVar;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public int i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = (((i2 ^ 91) | i3) << 1) - ((i2 | 91) & (~i3));
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return this.d;
        }
        int i5 = 85 / 0;
        return this.d;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public void o() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 ^ 123) | (i4 & 123)) << 1;
        int i6 = -((i4 & (-124)) | ((~i4) & 123));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            i = this.k;
            i2 = 1;
        } else {
            i = this.k;
            i2 = 0;
        }
        int i8 = i4 + 100;
        while (true) {
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (i == -1) {
                break;
            }
            int i11 = b;
            int i12 = i11 + 27;
            a = i12 % 128;
            int i13 = i12 % 2;
            if (i2 >= this.d) {
                break;
            }
            int i14 = i11 + 99;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                float[] fArr = this.j;
                fArr[i] = fArr[i] % (-1.0f);
            } else {
                float[] fArr2 = this.j;
                fArr2[i] = fArr2[i] * (-1.0f);
            }
            i = this.h[i];
            i2 = (-2) - ((-1) ^ (i2 + 2));
            i8 = (i11 ^ 4) + ((i11 & 4) << 1);
        }
        int i15 = b + 5;
        a = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 57 / 0;
        }
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a + 73;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.k;
        String string = BuildConfig.FLAVOR;
        int i5 = 0;
        while (i4 != -1) {
            int i6 = b;
            int i7 = ((i6 | 3) << 1) - (i6 ^ 3);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            if (i5 >= this.d) {
                break;
            }
            int i10 = i8 + 11;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                j.w(j.r(string, " -> "));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            StringBuilder sbW = j.w(j.r(string, " -> "));
            sbW.append(this.j[i4]);
            sbW.append(" : ");
            String string2 = sbW.toString();
            int i11 = b;
            int i12 = i11 & 119;
            int i13 = -(-(i11 | 119));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            StringBuilder sbW2 = j.w(string2);
            t[] tVarArr = (t[]) this.f.f;
            int i16 = b + 9;
            a = i16 % 128;
            int i17 = i16 % 2;
            sbW2.append(tVarArr[this.i[i4]]);
            string = sbW2.toString();
            int i18 = b;
            int i19 = i18 & 75;
            int i20 = i18 | 75;
            int i21 = (i19 & i20) + (i19 | i20);
            a = i21 % 128;
            int i22 = i21 % 2;
            i4 = this.h[i4];
            int i23 = i5 - 15;
            i5 = (i23 | 16) + (i23 & 16);
            int i24 = i18 + 84;
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = a;
        int i28 = (i27 & (-62)) | ((~i27) & 61);
        int i29 = -(-((i27 & 61) << 1));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        b = i30 % 128;
        int i31 = i30 % 2;
        return string;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public t a(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 66) + (i3 | 66)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.k;
        int i7 = (i3 & (-98)) | ((~i3) & 97);
        int i8 = -(-((i3 & 97) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (true) {
            Object obj = null;
            if (i6 == -1) {
                break;
            }
            int i12 = b;
            int i13 = (i12 & (-58)) | ((~i12) & 57);
            int i14 = -(-((i12 & 57) << 1));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            int i16 = i15 % 128;
            a = i16;
            int i17 = i15 % 2;
            if (i11 >= this.d) {
                break;
            }
            int i18 = i16 + 21;
            int i19 = i18 % 128;
            b = i19;
            if (i18 % 2 == 0) {
                throw null;
            }
            if (i11 == i) {
                int i20 = ((((i19 ^ 61) | (i19 & 61)) << 1) - (~(-((i19 & (-62)) | ((~i19) & 61))))) - 1;
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                t[] tVarArr = (t[]) this.f.f;
                int[] iArr = this.i;
                int i21 = a;
                int i22 = i21 ^ 33;
                int i23 = (((i21 & 33) | i22) << 1) - i22;
                b = i23 % 128;
                if (i23 % 2 != 0) {
                    return tVarArr[iArr[i6]];
                }
                t tVar = tVarArr[iArr[i6]];
                obj.hashCode();
                throw null;
            }
            i6 = this.h[i6];
            i11 = ((i11 & 1) << 1) + (i11 ^ 1);
            int i24 = i19 + 77;
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = a;
        int i27 = ((i26 | 41) << 1) - (i26 ^ 41);
        b = i27 % 128;
        int i28 = i27 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0080  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084 A[LOOP:0: B:9:0x003e->B:22:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public boolean c(t tVar) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - (((i3 & 10) + (i3 | 10)) ^ (-1));
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.k;
        if (i7 == -1) {
            int i8 = i5 & 69;
            int i9 = (~i8) & (i5 | 69);
            int i10 = i8 << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            return i11 % 2 == 0;
        }
        int i12 = (i5 ^ 102) + ((i5 & 102) << 1);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i7 != -1) {
            int i16 = a;
            int i17 = ((i16 & 117) - (~(i16 | 117))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = this.d;
            if (i18 == 0) {
                int i20 = 50 / 0;
                if (i15 >= i19) {
                    break;
                }
                if (this.i[i7] == tVar.f) {
                    int i21 = b;
                    int i22 = (-2) - ((((i21 | 72) << 1) - (i21 ^ 72)) ^ (-1));
                    int i23 = i22 % 128;
                    a = i23;
                    int i24 = i22 % 2;
                    i = (i23 ^ 119) + ((i23 & 119) << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i25 = 95 / 0;
                    }
                    return true;
                }
                i7 = this.h[i7];
                i15 = ((i15 | 1) << 1) - (i15 ^ 1);
                int i26 = b;
                int i27 = ((i26 ^ 66) + ((i26 & 66) << 1)) - 1;
                a = i27 % 128;
                int i28 = i27 % 2;
            } else {
                if (i15 >= i19) {
                    break;
                }
                if (this.i[i7] == tVar.f) {
                    int i29 = b;
                    int i210 = (-2) - ((((i29 | 72) << 1) - (i29 ^ 72)) ^ (-1));
                    int i211 = i210 % 128;
                    a = i211;
                    int i212 = i210 % 2;
                    i = (i211 ^ 119) + ((i211 & 119) << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i213 = 95 / 0;
                    }
                    return true;
                }
                i7 = this.h[i7];
                i15 = ((i15 | 1) << 1) - (i15 ^ 1);
                int i214 = b;
                int i215 = ((i214 ^ 66) + ((i214 & 66) << 1)) - 1;
                a = i215 % 128;
                int i216 = i215 % 2;
            }
        }
        int i30 = a;
        int i31 = i30 & 33;
        int i32 = -(-((i30 ^ 33) | i31));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        b = i33 % 128;
        int i34 = i33 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public float h(r rVar, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = ((i2 | 17) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            e(rVar.c);
            t tVar = rVar.c;
            obj.hashCode();
            throw null;
        }
        float fE = e(rVar.c);
        g(rVar.c, z);
        r.aTJ atj = rVar.f;
        int i5 = atj.i();
        int i6 = b;
        int i7 = (i6 & 73) + (i6 | 73);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = (i6 ^ 35) + ((i6 & 35) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < i5) {
            int i12 = a;
            int i13 = ((i12 & 99) - (~(i12 | 99))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            t tVarA = atj.a(i11);
            float fE2 = atj.e(tVarA);
            int i15 = a;
            int i16 = (((i15 & (-64)) | ((~i15) & 63)) - (~((i15 & 63) << 1))) - 1;
            b = i16 % 128;
            int i17 = i16 % 2;
            f(tVarA, fE2 * fE, z);
            i11 = ((i11 & 1) << 1) + (i11 ^ 1);
            int i18 = b;
            int i19 = ((i18 & 114) + (i18 | 114)) - 1;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 5 / 3;
            }
        }
        int i21 = b;
        int i22 = (i21 ^ 117) + ((i21 & 117) << 1);
        a = i22 % 128;
        if (i22 % 2 == 0) {
            return fE;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0094  */
    /* JADX WARN: Code duplicated, block: B:18:0x0095 A[LOOP:0: B:3:0x0033->B:18:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public final float e(t tVar) {
        float f;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-108)) | ((~i3) & 107);
        int i5 = (i3 & 107) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = this.k;
        int i10 = i7 & 7;
        int i11 = ((i7 ^ 7) | i10) << 1;
        int i12 = -((i7 | 7) & (~i10));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i9 != -1) {
            int i16 = b;
            int i17 = ((((i16 ^ 19) | (i16 & 19)) << 1) - (~(-((i16 & (-20)) | ((~i16) & 19))))) - 1;
            a = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 11 / 0;
                if (i15 >= this.d) {
                    break;
                }
                int i19 = i16 + 1;
                a = i19 % 128;
                int i20 = i19 % 2;
                if (this.i[i9] == tVar.f) {
                    int i21 = b;
                    int i22 = ((i21 & 11) - (~(-(-(i21 | 11))))) - 1;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    f = this.j[i9];
                    int i24 = i21 & 41;
                    i = (i24 - (~((i21 ^ 41) | i24))) - 1;
                    a = i % 128;
                    if (i % 2 == 0) {
                        return f;
                    }
                    throw null;
                }
                i9 = this.h[i9];
                int i25 = (((i15 ^ (-42)) | (i15 & (-42))) << 1) - (((~i15) & (-42)) | (i15 & 41));
                i15 = ((i25 ^ 44) + ((i25 & 44) << 1)) - 1;
                int i26 = b;
                int i27 = i26 & 71;
                int i28 = (i26 ^ 71) | i27;
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                a = i29 % 128;
                int i30 = i29 % 2;
            } else {
                if (i15 >= this.d) {
                    break;
                }
                int i110 = i16 + 1;
                a = i110 % 128;
                int i210 = i110 % 2;
                if (this.i[i9] == tVar.f) {
                    int i211 = b;
                    int i212 = ((i211 & 11) - (~(-(-(i211 | 11))))) - 1;
                    a = i212 % 128;
                    int i213 = i212 % 2;
                    f = this.j[i9];
                    int i214 = i211 & 41;
                    i = (i214 - (~((i211 ^ 41) | i214))) - 1;
                    a = i % 128;
                    if (i % 2 == 0) {
                        return f;
                    }
                    throw null;
                }
                i9 = this.h[i9];
                int i215 = (((i15 ^ (-42)) | (i15 & (-42))) << 1) - (((~i15) & (-42)) | (i15 & 41));
                i15 = ((i215 ^ 44) + ((i215 & 44) << 1)) - 1;
                int i216 = b;
                int i217 = i216 & 71;
                int i218 = (i216 ^ 71) | i217;
                int i219 = (i217 ^ i218) + ((i218 & i217) << 1);
                a = i219 % 128;
                int i31 = i219 % 2;
            }
        }
        int i32 = a;
        int i33 = i32 & 87;
        int i34 = ((i32 ^ 87) | i33) << 1;
        int i35 = -((i32 | 87) & (~i33));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        b = i36 % 128;
        if (i36 % 2 != 0) {
            return 0.0f;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public float b(int i) {
        float f;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 107) | (i3 & 107)) << 1;
        int i5 = -(((~i3) & 107) | (i3 & (-108)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = this.k;
        int i10 = i7 + 55;
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (i9 != -1) {
            int i13 = a;
            int i14 = (((i13 ^ 19) | (i13 & 19)) << 1) - ((i13 & (-20)) | ((~i13) & 19));
            b = i14 % 128;
            Object obj = null;
            if (i14 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i12 >= this.d) {
                break;
            }
            int i15 = i13 & 63;
            int i16 = (i13 ^ 63) | i15;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            int i18 = i17 % 128;
            b = i18;
            int i19 = i17 % 2;
            if (i12 == i) {
                int i20 = i13 + 81;
                int i21 = i20 % 128;
                b = i21;
                if (i20 % 2 == 0) {
                    f = this.j[i9];
                    int i22 = 75 / 0;
                } else {
                    f = this.j[i9];
                }
                int i23 = i21 + 41;
                a = i23 % 128;
                if (i23 % 2 == 0) {
                    return f;
                }
                obj.hashCode();
                throw null;
            }
            i9 = this.h[i9];
            i12++;
            int i24 = (((i18 & (-42)) | ((~i18) & 41)) - (~((i18 & 41) << 1))) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = b;
        int i27 = (i26 & (-120)) | ((~i26) & 119);
        int i28 = (i26 & 119) << 1;
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        a = i29 % 128;
        if (i29 % 2 != 0) {
            int i30 = 71 / 0;
        }
        return 0.0f;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public void n(float f) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & (-70)) | ((~i4) & 69);
        int i6 = -(-((i4 & 69) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 != 0) {
            i = this.k;
            i2 = 1;
        } else {
            i = this.k;
            i2 = 0;
        }
        int i9 = i8 & 59;
        int i10 = (i8 | 59) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        while (i != -1) {
            int i14 = a;
            int i15 = i14 & 39;
            int i16 = (~i15) & (i14 | 39);
            int i17 = i15 << 1;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            Object obj = null;
            if (i18 % 2 == 0) {
                throw null;
            }
            if (i2 >= this.d) {
                break;
            }
            int i19 = (-2) - ((-1) ^ ((i14 & 64) + (i14 | 64)));
            int i20 = i19 % 128;
            b = i20;
            if (i19 % 2 == 0) {
                float f2 = this.j[i];
                obj.hashCode();
                throw null;
            }
            float[] fArr = this.j;
            fArr[i] = fArr[i] / f;
            i = this.h[i];
            int i21 = (i2 & (-87)) + (i2 | (-87));
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            int i23 = i22 & 89;
            i2 = ((i22 ^ 89) | i23) + i23;
            int i24 = ((i20 | 111) << 1) - (i20 ^ 111);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = a;
        int i27 = i26 & 73;
        int i28 = (i27 - (~((i26 ^ 73) | i27))) - 1;
        b = i28 % 128;
        int i29 = i28 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public final void clear() {
        int i;
        int i2;
        t[] tVarArr;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 ^ 87) + ((i4 & 87) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            i = this.k;
            i2 = 1;
        } else {
            i = this.k;
            i2 = 0;
        }
        while (i != -1) {
            int i6 = a;
            int i7 = i6 + 93;
            b = i7 % 128;
            int i8 = i7 % 2;
            if (i2 >= this.d) {
                break;
            }
            int i9 = (i6 & (-78)) | ((~i6) & 77);
            int i10 = (i6 & 77) << 1;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                tVarArr = (t[]) this.f.f;
                int i12 = 23 / 0;
            } else {
                tVarArr = (t[]) this.f.f;
            }
            int i13 = b;
            int i14 = i13 & 5;
            int i15 = -(-((i13 ^ 5) | i14));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            t tVar = tVarArr[this.i[i]];
            if (tVar != null) {
                int i19 = i17 + 14;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    tVar.d(this.e);
                    int i21 = 76 / 0;
                } else {
                    tVar.d(this.e);
                }
            }
            i = this.h[i];
            int i22 = ((i2 | 2) << 1) - (i2 ^ 2);
            i2 = (i22 ^ (-1)) + (i22 << 1);
            int i23 = b;
            int i24 = i23 & 19;
            int i25 = ((i23 ^ 19) | i24) << 1;
            int i26 = -((i23 | 19) & (~i24));
            int i27 = (i25 & i26) + (i26 | i25);
            a = i27 % 128;
            int i28 = i27 % 2;
        }
        this.k = -1;
        this.c = -1;
        this.l = false;
        int i29 = b;
        int i30 = ((i29 ^ 27) | (i29 & 27)) << 1;
        int i31 = -(((~i29) & 27) | (i29 & (-28)));
        int i32 = (i30 & i31) + (i31 | i30);
        a = i32 % 128;
        if (i32 % 2 != 0) {
            this.d = 1;
        } else {
            this.d = 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public final float g(t tVar, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 93;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.k;
        if (i4 == -1) {
            int i5 = i2 & 101;
            int i6 = -(-((i2 ^ 101) | i5));
            int i7 = (i5 & i6) + (i5 | i6);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = ((i8 | 55) << 1) - (i8 ^ 55);
            b = i10 % 128;
            int i11 = i10 % 2;
            return 0.0f;
        }
        int i12 = ((i2 | 99) << 1) - (i2 ^ 99);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 5 % 2;
        }
        int i14 = 0;
        int i15 = -1;
        while (i4 != -1) {
            int i16 = a;
            int i17 = i16 ^ 101;
            int i18 = ((i16 & 101) | i17) << 1;
            int i19 = -i17;
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            int i21 = i20 % 128;
            b = i21;
            int i22 = i20 % 2;
            if (i14 >= this.d) {
                break;
            }
            int i23 = i21 + 115;
            a = i23 % 128;
            int i24 = i23 % 2;
            if (this.i[i4] == tVar.f) {
                int i25 = b;
                int i26 = ((((i25 ^ 3) | (i25 & 3)) << 1) - (~(-((i25 & (-4)) | ((~i25) & 3))))) - 1;
                a = i26 % 128;
                int i27 = i26 % 2;
                if (i4 == this.k) {
                    int i28 = (i25 & 109) + (i25 | 109);
                    a = i28 % 128;
                    if (i28 % 2 != 0) {
                        this.k = this.h[i4];
                        throw null;
                    }
                    this.k = this.h[i4];
                    int i29 = i25 & 125;
                    int i30 = (i29 - (~((i25 ^ 125) | i29))) - 1;
                    a = i30 % 128;
                    int i31 = i30 % 2;
                } else {
                    int[] iArr = this.h;
                    int i32 = i25 + 125;
                    a = i32 % 128;
                    if (i32 % 2 != 0) {
                        iArr[i15] = iArr[i4];
                        int i33 = 26 / 0;
                    } else {
                        iArr[i15] = iArr[i4];
                    }
                }
                if (z) {
                    int i34 = a + 98;
                    int i35 = (i34 ^ (-1)) + (i34 << 1);
                    b = i35 % 128;
                    if (i35 % 2 == 0) {
                        tVar.d(this.e);
                        throw null;
                    }
                    tVar.d(this.e);
                    int i36 = a;
                    int i37 = i36 & 123;
                    int i38 = -(-((i36 ^ 123) | i37));
                    int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                    b = i39 % 128;
                    int i40 = i39 % 2;
                }
                int i41 = tVar.f63o;
                tVar.f63o = ((i41 << 1) - i41) - 1;
                int i42 = this.d;
                int i43 = b + 41;
                int i44 = i43 % 128;
                a = i44;
                int i45 = i43 % 2;
                this.d = (i42 - (~((i42 ^ (-1)) | i42))) - 1;
                this.i[i4] = -1;
                if (this.l) {
                    int i46 = (i44 ^ 13) + ((i44 & 13) << 1);
                    b = i46 % 128;
                    if (i46 % 2 == 0) {
                        this.c = i4;
                        throw null;
                    }
                    this.c = i4;
                }
                float f = this.j[i4];
                int i47 = i44 + 15;
                b = i47 % 128;
                int i48 = i47 % 2;
                return f;
            }
            int i49 = this.h[i4];
            int i50 = (i14 & 66) + (i14 | 66);
            int i51 = i50 & (-65);
            i14 = (((i50 | (-65)) & (~i51)) - (~(i51 << 1))) - 1;
            int i52 = a;
            int i53 = ((i52 | 124) << 1) - (i52 ^ 124);
            int i54 = (i53 ^ (-1)) + (i53 << 1);
            int i55 = i54 % 128;
            b = i55;
            int i56 = i54 % 2;
            int i57 = i55 + 117;
            a = i57 % 128;
            int i58 = i57 % 2;
            i15 = i4;
            i4 = i49;
        }
        int i59 = b;
        int i60 = ((i59 | 51) << 1) - (i59 ^ 51);
        a = i60 % 128;
        if (i60 % 2 == 0) {
            return 0.0f;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00db  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x0166  */
    /* JADX WARN: Code duplicated, block: B:48:0x0173  */
    /* JADX WARN: Code duplicated, block: B:51:0x017a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0194 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0195  */
    /* JADX WARN: Code duplicated, block: B:59:0x019a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0204 A[PHI: r9
  0x0204: PHI (r9v47 int[]) = (r9v46 int[]), (r9v52 int[]) binds: [B:73:0x0202, B:70:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public final void d(t tVar, float f) {
        int length;
        int i;
        int[] iArr;
        int i2;
        int[] iArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr3;
        int i11 = 2 % 2;
        int i12 = a;
        int i13 = (i12 & 27) + (i12 | 27);
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        Object obj = null;
        if (f == 0.0f) {
            int i16 = (i14 & (-124)) | ((~i14) & 123);
            int i17 = (i14 & 123) << 1;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            a = i18 % 128;
            int i19 = i18 % 2;
            g(tVar, true);
            int i20 = a;
            int i21 = (-2) - ((((i20 | 84) << 1) - (i20 ^ 84)) ^ (-1));
            b = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i22 = this.k;
        if (i22 == -1) {
            int i23 = (i14 & (-116)) | ((~i14) & 115);
            int i24 = -(-((i14 & 115) << 1));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            int i26 = i25 % 128;
            a = i26;
            int i27 = i25 % 2;
            this.k = 0;
            this.j[0] = f;
            int i28 = (i26 ^ 113) + ((i26 & 113) << 1);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                this.i[0] = tVar.f;
            } else {
                this.i[0] = tVar.f;
            }
            int[] iArr4 = this.h;
            int i29 = b;
            int i30 = i29 & 107;
            int i31 = (i29 ^ 107) | i30;
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                iArr4[0] = -1;
                i8 = tVar.f63o;
            } else {
                iArr4[0] = -1;
                int i33 = tVar.f63o;
                int i34 = i33 & 1;
                i8 = ((i33 | 1) & (~i34)) + (i34 << 1);
            }
            tVar.f63o = i8;
            tVar.c(this.e);
            int i35 = this.d;
            int i36 = a;
            int i37 = ((i36 ^ 71) | (i36 & 71)) << 1;
            int i38 = -((i36 & (-72)) | ((~i36) & 71));
            int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
            b = i39 % 128;
            if (i39 % 2 == 0) {
                this.d = i35 / 0;
                if (!this.l) {
                    int i40 = i36 & 125;
                    int i41 = -(-((i36 ^ 125) | i40));
                    i9 = (i40 & i41) + (i40 | i41);
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        i10 = this.c;
                    } else {
                        int i42 = this.c;
                        i10 = ((i42 | 1) << 1) - (i42 ^ 1);
                    }
                    this.c = i10;
                    iArr3 = this.i;
                    if (i10 >= iArr3.length) {
                        int i43 = ((((i36 ^ 99) | (i36 & 99)) << 1) - (~(-((i36 & (-100)) | ((~i36) & 99))))) - 1;
                        b = i43 % 128;
                        int i44 = i43 % 2;
                        this.l = true;
                        this.c = iArr3.length - 1;
                        int i45 = i36 & 33;
                        int i46 = (((i36 ^ 33) | i45) << 1) - ((i36 | 33) & (~i45));
                        b = i46 % 128;
                        int i47 = i46 % 2;
                    }
                }
            } else {
                this.d = (((i35 | 2) << 1) - (i35 ^ 2)) - 1;
                if (!this.l) {
                    int i48 = i36 & 125;
                    int i49 = -(-((i36 ^ 125) | i48));
                    i9 = (i48 & i49) + (i48 | i49);
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        i10 = this.c;
                    } else {
                        int i410 = this.c;
                        i10 = ((i410 | 1) << 1) - (i410 ^ 1);
                    }
                    this.c = i10;
                    iArr3 = this.i;
                    if (i10 >= iArr3.length) {
                        int i411 = ((((i36 ^ 99) | (i36 & 99)) << 1) - (~(-((i36 & (-100)) | ((~i36) & 99))))) - 1;
                        b = i411 % 128;
                        int i412 = i411 % 2;
                        this.l = true;
                        this.c = iArr3.length - 1;
                        int i413 = i36 & 33;
                        int i414 = (((i36 ^ 33) | i413) << 1) - ((i36 | 33) & (~i413));
                        b = i414 % 128;
                        int i415 = i414 % 2;
                    }
                }
            }
            int i50 = b;
            int i51 = (i50 ^ 89) + ((i50 & 89) << 1);
            a = i51 % 128;
            int i52 = i51 % 2;
            return;
        }
        int i53 = i14 + 19;
        a = i53 % 128;
        int i54 = i53 % 2;
        int i55 = -1;
        int i56 = 0;
        while (true) {
            if (i22 != -1) {
                int i57 = a;
                int i58 = ((i57 & 80) + (i57 | 80)) - 1;
                b = i58 % 128;
                if (i58 % 2 == 0) {
                    int i59 = 5 / 0;
                    if (i56 >= this.d) {
                    }
                    i2 = i57 + 51;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i60 = this.i[i22];
                        obj.hashCode();
                        throw null;
                    }
                    iArr2 = this.i;
                    i3 = iArr2[i22];
                    i4 = i57 + 47;
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        i5 = tVar.f;
                        int i61 = 2 / 0;
                        if (i3 == i5) {
                            this.j[i22] = f;
                            int i62 = a;
                            int i63 = i62 & 15;
                            int i64 = i62 | 15;
                            i6 = (i63 ^ i64) + ((i64 & i63) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                        if (iArr2[i22] < i5) {
                            int i65 = a;
                            int i66 = i65 + 25;
                            b = i66 % 128;
                            int i67 = i66 % 2;
                            int i68 = i65 + 43;
                            b = i68 % 128;
                            int i69 = i68 % 2;
                            i55 = i22;
                        }
                        i22 = this.h[i22];
                        int i70 = i56 - 118;
                        int i71 = (i70 & (-120)) | ((~i70) & 119);
                        int i72 = (i70 & 119) << 1;
                        i56 = (i72 | i71) + (i71 & i72);
                        int i73 = a;
                        i7 = ((i73 | 29) << 1) - (i73 ^ 29);
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i74 = 3 / 4;
                        }
                    } else {
                        i5 = tVar.f;
                        if (i3 == i5) {
                            this.j[i22] = f;
                            int i610 = a;
                            int i611 = i610 & 15;
                            int i612 = i610 | 15;
                            i6 = (i611 ^ i612) + ((i612 & i611) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                        if (iArr2[i22] < i5) {
                            int i613 = a;
                            int i614 = i613 + 25;
                            b = i614 % 128;
                            int i615 = i614 % 2;
                            int i616 = i613 + 43;
                            b = i616 % 128;
                            int i617 = i616 % 2;
                            i55 = i22;
                        }
                        i22 = this.h[i22];
                        int i75 = i56 - 118;
                        int i76 = (i75 & (-120)) | ((~i75) & 119);
                        int i77 = (i75 & 119) << 1;
                        i56 = (i77 | i76) + (i76 & i77);
                        int i78 = a;
                        i7 = ((i78 | 29) << 1) - (i78 ^ 29);
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i79 = 3 / 4;
                        }
                    }
                } else {
                    if (i56 >= this.d) {
                    }
                    i2 = i57 + 51;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i618 = this.i[i22];
                        obj.hashCode();
                        throw null;
                    }
                    iArr2 = this.i;
                    i3 = iArr2[i22];
                    i4 = i57 + 47;
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        i5 = tVar.f;
                        int i619 = 2 / 0;
                        if (i3 == i5) {
                            this.j[i22] = f;
                            int i6110 = a;
                            int i6111 = i6110 & 15;
                            int i6112 = i6110 | 15;
                            i6 = (i6111 ^ i6112) + ((i6112 & i6111) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                        if (iArr2[i22] < i5) {
                            int i6113 = a;
                            int i6114 = i6113 + 25;
                            b = i6114 % 128;
                            int i6115 = i6114 % 2;
                            int i6116 = i6113 + 43;
                            b = i6116 % 128;
                            int i6117 = i6116 % 2;
                            i55 = i22;
                        }
                        i22 = this.h[i22];
                        int i710 = i56 - 118;
                        int i711 = (i710 & (-120)) | ((~i710) & 119);
                        int i712 = (i710 & 119) << 1;
                        i56 = (i712 | i711) + (i711 & i712);
                        int i713 = a;
                        i7 = ((i713 | 29) << 1) - (i713 ^ 29);
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i714 = 3 / 4;
                        }
                    } else {
                        i5 = tVar.f;
                        if (i3 == i5) {
                            this.j[i22] = f;
                            int i6118 = a;
                            int i6119 = i6118 & 15;
                            int i61110 = i6118 | 15;
                            i6 = (i6119 ^ i61110) + ((i61110 & i6119) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                        if (iArr2[i22] < i5) {
                            int i61111 = a;
                            int i61112 = i61111 + 25;
                            b = i61112 % 128;
                            int i61113 = i61112 % 2;
                            int i61114 = i61111 + 43;
                            b = i61114 % 128;
                            int i61115 = i61114 % 2;
                            i55 = i22;
                        }
                        i22 = this.h[i22];
                        int i715 = i56 - 118;
                        int i716 = (i715 & (-120)) | ((~i715) & 119);
                        int i717 = (i715 & 119) << 1;
                        i56 = (i717 | i716) + (i716 & i717);
                        int i718 = a;
                        i7 = ((i718 | 29) << 1) - (i718 ^ 29);
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i719 = 3 / 4;
                        }
                    }
                }
            }
            int length2 = this.c;
            if (this.l) {
                int i80 = b;
                int i81 = i80 & 123;
                int i82 = -(-((i80 ^ 123) | i81));
                int i83 = (i81 & i82) + (i81 | i82);
                a = i83 % 128;
                if (i83 % 2 != 0) {
                    iArr = this.i;
                    int i84 = 12 / 0;
                    if (iArr[length2] != -1) {
                        length2 = iArr.length;
                        int i85 = i80 ^ 55;
                        int i86 = ((((i80 & 55) | i85) << 1) - (~(-i85))) - 1;
                        a = i86 % 128;
                        int i87 = i86 % 2;
                    }
                } else {
                    iArr = this.i;
                    if (iArr[length2] != -1) {
                        length2 = iArr.length;
                        int i88 = i80 ^ 55;
                        int i89 = ((((i80 & 55) | i88) << 1) - (~(-i88))) - 1;
                        a = i89 % 128;
                        int i810 = i89 % 2;
                    }
                }
            } else {
                length2++;
                int i90 = b;
                int i91 = i90 & 77;
                int i92 = -(-((i90 ^ 77) | i91));
                int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                a = i93 % 128;
                int i94 = i93 % 2;
            }
            int[] iArr5 = this.i;
            if (length2 >= iArr5.length) {
                int i95 = a;
                int i96 = i95 & 67;
                int i97 = (i95 ^ 67) | i96;
                int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
                b = i98 % 128;
                int i99 = i98 % 2;
                if (this.d < iArr5.length) {
                    int i100 = (((i95 ^ 117) | (i95 & 117)) << 1) - (((~i95) & 117) | (i95 & (-118)));
                    b = i100 % 128;
                    int i101 = i100 % 2 == 0 ? 1 : 0;
                    while (true) {
                        int[] iArr6 = this.i;
                        if (i101 >= iArr6.length) {
                            break;
                        }
                        int i102 = b;
                        int i103 = (i102 & 37) + (i102 | 37);
                        int i104 = i103 % 128;
                        a = i104;
                        int i105 = i103 % 2;
                        if (iArr6[i101] == -1) {
                            int i106 = (i104 & (-112)) | ((~i104) & 111);
                            int i107 = (i104 & 111) << 1;
                            int i108 = (i106 ^ i107) + ((i106 & i107) << 1);
                            b = i108 % 128;
                            int i109 = i108 % 2;
                            int i110 = i104 + 111;
                            b = i110 % 128;
                            int i111 = i110 % 2;
                            length2 = i101;
                            break;
                        }
                        int i112 = i101 & 12;
                        int i113 = i112 + ((i101 ^ 12) | i112);
                        i101 = ((i113 & (-10)) + (i113 | (-10))) - 1;
                        int i114 = i102 & 75;
                        int i115 = ((((i102 ^ 75) | i114) << 1) - (~(-((i102 | 75) & (~i114))))) - 1;
                        a = i115 % 128;
                        int i116 = i115 % 2;
                    }
                }
            }
            int[] iArr7 = this.i;
            if (length2 >= iArr7.length) {
                int i117 = a;
                int i118 = i117 ^ 109;
                int i119 = (i117 & 109) << 1;
                int i120 = ((i118 | i119) << 1) - (i118 ^ i119);
                b = i120 % 128;
                if (i120 % 2 == 0) {
                    length = iArr7.length;
                    i = this.g >> 4;
                } else {
                    length = iArr7.length;
                    i = this.g * 2;
                }
                this.g = i;
                this.l = false;
                int i121 = ((i117 & (-106)) | ((~i117) & 105)) + ((i117 & 105) << 1);
                b = i121 % 128;
                int i122 = i121 % 2;
                int i123 = (length ^ (-1)) | length;
                this.c = (length & i123) + (i123 | length);
                float[] fArr = this.j;
                int i124 = (((i117 ^ 99) | (i117 & 99)) << 1) - (((~i117) & 99) | (i117 & (-100)));
                b = i124 % 128;
                int i125 = i124 % 2;
                this.j = Arrays.copyOf(fArr, i);
                int[] iArr8 = this.i;
                int i126 = b + 71;
                a = i126 % 128;
                int i127 = i126 % 2;
                this.i = Arrays.copyOf(iArr8, this.g);
                int i128 = b;
                int i129 = ((i128 & (-36)) | ((~i128) & 35)) + ((i128 & 35) << 1);
                a = i129 % 128;
                int i130 = i129 % 2;
                this.h = Arrays.copyOf(this.h, this.g);
                int i131 = b;
                int i132 = i131 & 21;
                int i133 = (i132 - (~((i131 ^ 21) | i132))) - 1;
                a = i133 % 128;
                int i134 = i133 % 2;
                length2 = length;
            }
            this.i[length2] = tVar.f;
            float[] fArr2 = this.j;
            int i135 = b;
            int i136 = (i135 ^ 11) + ((i135 & 11) << 1);
            int i137 = i136 % 128;
            a = i137;
            if (i136 % 2 != 0) {
                fArr2[length2] = f;
                obj.hashCode();
                throw null;
            }
            fArr2[length2] = f;
            if (i55 != -1) {
                int[] iArr9 = this.h;
                int i138 = (i137 | 51) << 1;
                int i139 = -((i137 & (-52)) | ((~i137) & 51));
                int i140 = ((i138 | i139) << 1) - (i138 ^ i139);
                b = i140 % 128;
                int i141 = i140 % 2;
                iArr9[length2] = iArr9[i55];
                iArr9[i55] = length2;
                int i142 = (i137 & 39) + (i137 | 39);
                b = i142 % 128;
                int i143 = i142 % 2;
            } else {
                this.h[length2] = this.k;
                int i144 = ((i135 & (-82)) | ((~i135) & 81)) + ((i135 & 81) << 1);
                a = i144 % 128;
                int i145 = i144 % 2;
                this.k = length2;
                int i146 = i135 & 87;
                int i147 = -(-((i135 ^ 87) | i146));
                int i148 = (i146 & i147) + (i146 | i147);
                a = i148 % 128;
                int i149 = i148 % 2;
            }
            int i150 = tVar.f63o;
            tVar.f63o = ((i150 | 1) << 1) - (i150 ^ 1);
            r rVar = this.e;
            int i151 = b;
            int i152 = i151 & 125;
            int i153 = i152 + ((i151 ^ 125) | i152);
            a = i153 % 128;
            int i154 = i153 % 2;
            tVar.c(rVar);
            int i155 = (-2) - ((this.d + 2) ^ (-1));
            this.d = i155;
            int i156 = b;
            int i157 = i156 + 1;
            a = i157 % 128;
            int i158 = i157 % 2;
            if (!this.l) {
                int i159 = (i156 ^ 77) + ((i156 & 77) << 1);
                a = i159 % 128;
                if (i159 % 2 != 0) {
                    this.c <<= 1;
                } else {
                    int i160 = this.c;
                    int i161 = i160 & 1;
                    this.c = (i161 - (~(-(-((i160 ^ 1) | i161))))) - 1;
                }
                int i162 = i156 & 79;
                int i163 = ((i156 ^ 79) | i162) << 1;
                int i164 = -((~i162) & (i156 | 79));
                int i165 = (i163 ^ i164) + ((i163 & i164) << 1);
                a = i165 % 128;
                int i166 = i165 % 2;
            }
            int[] iArr10 = this.i;
            if (i155 >= iArr10.length) {
                int i167 = i156 & 95;
                int i168 = -(-((i156 ^ 95) | i167));
                int i169 = (i167 ^ i168) + ((i167 & i168) << 1);
                a = i169 % 128;
                int i170 = i169 % 2;
                this.l = true;
                int i171 = i156 & 35;
                int i172 = -(-((i156 ^ 35) | i171));
                int i173 = (i171 ^ i172) + ((i171 & i172) << 1);
                a = i173 % 128;
                int i174 = i173 % 2;
            }
            if (this.c >= iArr10.length) {
                int i175 = i156 + 83;
                a = i175 % 128;
                if (i175 % 2 != 0) {
                    this.l = false;
                    int length3 = iArr10.length;
                    this.c = 0;
                } else {
                    this.l = true;
                    int length4 = iArr10.length;
                    int i176 = ~length4;
                    int i177 = length4 << 1;
                    this.c = ((i176 | i177) << 1) - (i177 ^ i176);
                }
            }
            int i178 = a;
            int i179 = i178 & 27;
            int i180 = (i178 ^ 27) | i179;
            int i181 = (i179 & i180) + (i180 | i179);
            b = i181 % 128;
            if (i181 % 2 == 0) {
                throw null;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x032e  */
    /* JADX WARN: Code duplicated, block: B:98:0x034f  */
    @Override // ivas.gov.bisp.enumeration.ac.r.aTJ
    public void f(t tVar, float f, boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 30) + ((i3 & 30) << 1)) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f <= -0.001f || f >= 0.001f) {
            int i5 = this.k;
            if (i5 == -1) {
                this.k = 0;
                this.j[0] = f;
                this.i[0] = tVar.f;
                this.h[0] = -1;
                int i6 = tVar.f63o;
                int i7 = i6 ^ 1;
                int i8 = ((i6 & 1) | i7) << 1;
                int i9 = -i7;
                tVar.f63o = (i8 ^ i9) + ((i8 & i9) << 1);
                tVar.c(this.e);
                int i10 = this.d;
                int i11 = a;
                int i12 = i11 & 81;
                int i13 = ((((i11 ^ 81) | i12) << 1) - (~(-((~i12) & (i11 | 81))))) - 1;
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    this.d = i10;
                    if (this.l) {
                        return;
                    }
                } else {
                    int i14 = i10 ^ 1;
                    int i15 = -(-((i10 & 1) << 1));
                    this.d = (i14 & i15) + (i15 | i14);
                    if (!(!this.l)) {
                        return;
                    }
                }
                int i16 = i11 + 25;
                int i17 = i16 % 128;
                b = i17;
                int i18 = i16 % 2;
                int i19 = this.c;
                int i20 = ((i19 ^ 1) | (i19 & 1)) << 1;
                int i21 = -(((~i19) & 1) | (i19 & (-2)));
                int i22 = (i20 & i21) + (i21 | i20);
                this.c = i22;
                int i23 = i17 & 89;
                int i24 = (i17 ^ 89) | i23;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                a = i25 % 128;
                int i26 = i25 % 2;
                int[] iArr = this.i;
                if (i22 >= iArr.length) {
                    int i27 = i17 + 83;
                    int i28 = i27 % 128;
                    a = i28;
                    if (i27 % 2 != 0) {
                        this.l = true;
                        this.c = iArr.length;
                    } else {
                        this.l = true;
                        int length = iArr.length;
                        int i29 = ~length;
                        int i30 = length << 1;
                        this.c = (i29 & i30) + (i30 | i29);
                    }
                    int i31 = ((i28 | 93) << 1) - (i28 ^ 93);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    return;
                }
                return;
            }
            int i33 = ((i3 | 87) << 1) - (i3 ^ 87);
            a = i33 % 128;
            int i34 = i33 % 2;
            int i35 = -1;
            int i36 = 0;
            for (int i37 = -1; i5 != i37; i37 = -1) {
                int i38 = b;
                int i39 = (i38 & (-48)) | ((~i38) & 47);
                int i40 = -(-((i38 & 47) << 1));
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                a = i41 % 128;
                int i42 = i41 % 2;
                if (i36 >= this.d) {
                    break;
                }
                int[] iArr2 = this.i;
                int i43 = iArr2[i5];
                int i44 = tVar.f;
                int i45 = b;
                int i46 = (((i45 & (-28)) | ((~i45) & 27)) - (~((i45 & 27) << 1))) - 1;
                a = i46 % 128;
                int i47 = i46 % 2;
                if (i43 == i44) {
                    int i48 = i45 & 53;
                    int i49 = (i48 - (~((i45 ^ 53) | i48))) - 1;
                    a = i49 % 128;
                    int i50 = i49 % 2;
                    float[] fArr = this.j;
                    float f2 = fArr[i5] + f;
                    int i51 = (i45 & 27) + (i45 | 27);
                    a = i51 % 128;
                    int i52 = i51 % 2;
                    if (f2 > -0.001f) {
                        int i53 = i45 & 91;
                        int i54 = (i45 | 91) & (~i53);
                        int i55 = -(-(i53 << 1));
                        int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                        int i57 = i56 % 128;
                        a = i57;
                        int i58 = i56 % 2;
                        if (f2 < 0.001f) {
                            int i59 = ((i57 ^ 20) + ((i57 & 20) << 1)) - 1;
                            int i60 = i59 % 128;
                            b = i60;
                            int i61 = i59 % 2;
                            int i62 = (((i60 ^ 121) | (i60 & 121)) << 1) - (((~i60) & 121) | (i60 & (-122)));
                            a = i62 % 128;
                            int i63 = i62 % 2;
                            f2 = 0.0f;
                        }
                    }
                    fArr[i5] = f2;
                    if (f2 == 0.0f) {
                        int i64 = b;
                        int i65 = i64 ^ 81;
                        int i66 = -(-((i64 & 81) << 1));
                        int i67 = (i65 & i66) + (i66 | i65);
                        int i68 = i67 % 128;
                        a = i68;
                        int i69 = i67 % 2;
                        if (i5 == this.k) {
                            int i70 = ((i68 & (-54)) | ((~i68) & 53)) + ((i68 & 53) << 1);
                            b = i70 % 128;
                            int i71 = i70 % 2;
                            this.k = this.h[i5];
                        } else {
                            int[] iArr3 = this.h;
                            int i72 = (i68 ^ 45) + ((i68 & 45) << 1);
                            b = i72 % 128;
                            if (i72 % 2 == 0) {
                                iArr3[i35] = iArr3[i5];
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            iArr3[i35] = iArr3[i5];
                        }
                        if (z) {
                            int i73 = (((i68 & (-118)) | ((~i68) & 117)) - (~(-(-((i68 & 117) << 1))))) - 1;
                            b = i73 % 128;
                            if (i73 % 2 == 0) {
                                tVar.d(this.e);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            tVar.d(this.e);
                            int i74 = b;
                            int i75 = i74 | 19;
                            int i76 = ((i75 << 1) - (~(-((~(i74 & 19)) & i75)))) - 1;
                            a = i76 % 128;
                            if (i76 % 2 != 0) {
                                int i77 = 4 % 4;
                            }
                        }
                        if (this.l) {
                            int i78 = a;
                            int i79 = (((i78 ^ 63) | (i78 & 63)) << 1) - ((i78 & (-64)) | ((~i78) & 63));
                            b = i79 % 128;
                            if (i79 % 2 == 0) {
                                this.c = i5;
                                int i80 = 5 / 0;
                            } else {
                                this.c = i5;
                            }
                            int i81 = i78 | 33;
                            int i82 = i81 << 1;
                            int i83 = -((~(i78 & 33)) & i81);
                            int i84 = (i82 & i83) + (i83 | i82);
                            b = i84 % 128;
                            int i85 = i84 % 2;
                        }
                        tVar.f63o = (-2) - (tVar.f63o ^ (-1));
                        int i86 = this.d;
                        int i87 = a;
                        int i88 = (i87 | 21) << 1;
                        int i89 = -(i87 ^ 21);
                        int i90 = (i88 & i89) + (i89 | i88);
                        b = i90 % 128;
                        int i91 = i90 % 2;
                        this.d = i86 - 1;
                        return;
                    }
                    return;
                }
                if (iArr2[i5] < i44) {
                    int i92 = ((i45 & 102) + (i45 | 102)) - 1;
                    a = i92 % 128;
                    if (i92 % 2 != 0) {
                        int i93 = 48 / 0;
                    }
                    int i94 = ((i45 ^ 7) - (~(-(-((i45 & 7) << 1))))) - 1;
                    a = i94 % 128;
                    if (i94 % 2 != 0) {
                        int i95 = 5 / 2;
                    }
                    i35 = i5;
                }
                i5 = this.h[i5];
                i36 = ((i36 | 1) << 1) - (i36 ^ 1);
                int i96 = a;
                int i97 = i96 & 31;
                int i98 = (i97 - (~(-(-((i96 ^ 31) | i97))))) - 1;
                b = i98 % 128;
                int i99 = i98 % 2;
            }
            int length2 = this.c;
            if (!this.l) {
                length2 = (length2 ^ (-32)) + ((length2 & (-32)) << 1) + 33;
            } else {
                int[] iArr4 = this.i;
                if (iArr4[length2] != -1) {
                    int i100 = a;
                    int i101 = (i100 & (-52)) | ((~i100) & 51);
                    int i102 = -(-((i100 & 51) << 1));
                    int i103 = (i101 & i102) + (i102 | i101);
                    int i104 = i103 % 128;
                    b = i104;
                    int i105 = i103 % 2;
                    int length3 = iArr4.length;
                    int i106 = ((i104 ^ 48) + ((i104 & 48) << 1)) - 1;
                    a = i106 % 128;
                    int i107 = i106 % 2;
                    length2 = length3;
                }
            }
            int[] iArr5 = this.i;
            int i108 = b;
            int i109 = (i108 ^ 101) + ((i108 & 101) << 1);
            int i110 = i109 % 128;
            a = i110;
            if (i109 % 2 != 0) {
                int length4 = iArr5.length;
                throw null;
            }
            if (length2 >= iArr5.length && this.d < iArr5.length) {
                int i111 = i110 + 17;
                b = i111 % 128;
                int i112 = i111 % 2;
                int i113 = i110 & 17;
                int i114 = ((i110 | 17) & (~i113)) + (i113 << 1);
                b = i114 % 128;
                int i115 = i114 % 2;
                int i116 = 0;
                while (true) {
                    int[] iArr6 = this.i;
                    int i117 = b;
                    int i118 = (i117 & (-90)) | ((~i117) & 89);
                    int i119 = (i117 & 89) << 1;
                    int i120 = (i118 ^ i119) + ((i118 & i119) << 1);
                    int i121 = i120 % 128;
                    a = i121;
                    if (i120 % 2 == 0) {
                        if (i116 >= iArr6.length) {
                            break;
                        }
                        if (iArr6[i116] == -1) {
                            int i122 = ((i117 | 115) << 1) - (i117 ^ 115);
                            int i123 = i122 % 128;
                            a = i123;
                            int i124 = i122 % 2;
                            int i125 = i123 ^ 19;
                            int i126 = (i123 & 19) << 1;
                            int i127 = (i125 ^ i126) + ((i125 & i126) << 1);
                            b = i127 % 128;
                            int i128 = i127 % 2;
                            length2 = i116;
                            break;
                        }
                        i116++;
                        int i129 = i121 & 69;
                        i = (i129 - (~((i121 ^ 69) | i129))) - 1;
                        b = i % 128;
                        if (i % 2 == 0) {
                            int i130 = 4 % 3;
                        }
                    } else {
                        int i131 = 13 / 0;
                        if (i116 >= iArr6.length) {
                            break;
                        }
                        if (iArr6[i116] == -1) {
                            int i1210 = ((i117 | 115) << 1) - (i117 ^ 115);
                            int i1211 = i1210 % 128;
                            a = i1211;
                            int i1212 = i1210 % 2;
                            int i1213 = i1211 ^ 19;
                            int i1214 = (i1211 & 19) << 1;
                            int i1215 = (i1213 ^ i1214) + ((i1213 & i1214) << 1);
                            b = i1215 % 128;
                            int i1216 = i1215 % 2;
                            length2 = i116;
                            break;
                        }
                        i116++;
                        int i1217 = i121 & 69;
                        i = (i1217 - (~((i121 ^ 69) | i1217))) - 1;
                        b = i % 128;
                        if (i % 2 == 0) {
                            int i132 = 4 % 3;
                        }
                    }
                }
            }
            int[] iArr7 = this.i;
            int i133 = b + 69;
            int i134 = i133 % 128;
            a = i134;
            int i135 = i133 % 2;
            if (length2 >= iArr7.length) {
                length2 = iArr7.length;
                int i136 = this.g * 2;
                int i137 = ((i134 | 73) << 1) - (i134 ^ 73);
                int i138 = i137 % 128;
                b = i138;
                int i139 = i137 % 2;
                this.g = i136;
                this.l = false;
                int i140 = i138 & 43;
                int i141 = -(-((i138 ^ 43) | i140));
                int i142 = (i140 ^ i141) + ((i140 & i141) << 1);
                int i143 = i142 % 128;
                a = i143;
                int i144 = i142 % 2;
                int i145 = ~length2;
                int i146 = length2 << 1;
                this.c = (i145 & i146) + (i145 | i146);
                int i147 = (i143 | 29) << 1;
                int i148 = -(((~i143) & 29) | (i143 & (-30)));
                int i149 = (i147 ^ i148) + ((i148 & i147) << 1);
                b = i149 % 128;
                if (i149 % 2 == 0) {
                    this.j = Arrays.copyOf(this.j, i136);
                    int i150 = 8 / 0;
                } else {
                    this.j = Arrays.copyOf(this.j, i136);
                }
                int[] iArrCopyOf = Arrays.copyOf(this.i, this.g);
                int i151 = b;
                int i152 = i151 ^ 45;
                int i153 = (i151 & 45) << 1;
                int i154 = (i152 & i153) + (i153 | i152);
                int i155 = i154 % 128;
                a = i155;
                int i156 = i154 % 2;
                this.i = iArrCopyOf;
                int[] iArr8 = this.h;
                int i157 = this.g;
                int i158 = i155 & 99;
                int i159 = -(-((i155 ^ 99) | i158));
                int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                b = i160 % 128;
                int i161 = i160 % 2;
                this.h = Arrays.copyOf(iArr8, i157);
            }
            this.i[length2] = tVar.f;
            this.j[length2] = f;
            if (i35 != -1) {
                int i162 = b;
                int i163 = i162 & 99;
                int i164 = -(-((i162 ^ 99) | i163));
                int i165 = ((i163 | i164) << 1) - (i164 ^ i163);
                int i166 = i165 % 128;
                a = i166;
                int i167 = i165 % 2;
                int[] iArr9 = this.h;
                int i168 = (i166 & 31) + (i166 | 31);
                int i169 = i168 % 128;
                b = i169;
                int i170 = i168 % 2;
                iArr9[length2] = iArr9[i35];
                iArr9[i35] = length2;
                int i171 = i169 ^ 61;
                int i172 = ((((i169 & 61) | i171) << 1) - (~(-i171))) - 1;
                a = i172 % 128;
                int i173 = i172 % 2;
            } else {
                this.h[length2] = this.k;
                int i174 = a;
                int i175 = i174 + 35;
                b = i175 % 128;
                if (i175 % 2 == 0) {
                    this.k = length2;
                    int i176 = 51 / 0;
                } else {
                    this.k = length2;
                }
                int i177 = (i174 ^ 107) + ((i174 & 107) << 1);
                b = i177 % 128;
                if (i177 % 2 == 0) {
                    int i178 = 3 / 2;
                }
            }
            int i179 = tVar.f63o;
            int i180 = i179 & 1;
            int i181 = (i179 | 1) & (~i180);
            int i182 = i180 << 1;
            tVar.f63o = (i181 ^ i182) + ((i181 & i182) << 1);
            r rVar = this.e;
            int i183 = a;
            int i184 = (i183 & (-46)) | ((~i183) & 45);
            int i185 = -(-((i183 & 45) << 1));
            int i186 = ((i184 | i185) << 1) - (i185 ^ i184);
            b = i186 % 128;
            if (i186 % 2 == 0) {
                tVar.c(rVar);
                this.d = 0;
                if (!this.l) {
                    int i187 = this.c;
                    int i188 = i187 & 1;
                    this.c = i188 + ((i187 ^ 1) | i188);
                    int i189 = a;
                    int i190 = ((i189 ^ 41) - (~((i189 & 41) << 1))) - 1;
                    b = i190 % 128;
                    int i191 = i190 % 2;
                }
            } else {
                tVar.c(rVar);
                int i192 = this.d;
                int i193 = i192 | 1;
                this.d = (i193 << 1) - ((~(i192 & 1)) & i193);
                if (!this.l) {
                    int i1810 = this.c;
                    int i1811 = i1810 & 1;
                    this.c = i1811 + ((i1810 ^ 1) | i1811);
                    int i1812 = a;
                    int i194 = ((i1812 ^ 41) - (~((i1812 & 41) << 1))) - 1;
                    b = i194 % 128;
                    int i195 = i194 % 2;
                }
            }
            int i196 = this.c;
            int[] iArr10 = this.i;
            int i197 = a;
            int i198 = i197 & 97;
            int i199 = ((~i198) & (i197 | 97)) + (i198 << 1);
            b = i199 % 128;
            if (i199 % 2 == 0) {
                int length5 = iArr10.length;
                throw null;
            }
            if (i196 >= iArr10.length) {
                this.l = true;
                int length6 = iArr10.length;
                this.c = (~length6) + (length6 << 1);
                int i200 = (((i197 | 104) << 1) - (i197 ^ 104)) - 1;
                b = i200 % 128;
                int i201 = i200 % 2;
            }
            int i202 = b;
            int i203 = i202 | 45;
            int i204 = (i203 << 1) - ((~(i202 & 45)) & i203);
            a = i204 % 128;
            if (i204 % 2 != 0) {
                int i205 = 54 / 0;
            }
        }
    }
}
