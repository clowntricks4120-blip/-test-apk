package ivas.gov.bisp.enumeration.p003ac;

import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Arrays;
import java.util.Comparator;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class z extends r {
    private static int a = 1;
    private static int b;
    public aTQ h;
    public t[] i;
    public t[] j;
    public int k;

    public class aTP implements Comparator<t> {
        private static int a = 1;
        private static int b;

        public aTP(z zVar) {
        }

        @Override // java.util.Comparator
        public int compare(t tVar, t tVar2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 67;
            int i4 = ((((i2 ^ 67) | i3) << 1) - (~(-((i2 | 67) & (~i3))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = tVar.f;
            int i7 = a;
            int i8 = i7 & 91;
            int i9 = (i7 ^ 91) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = -tVar2.f;
            int i13 = i6 & i12;
            int i14 = ((i6 ^ i12) | i13) << 1;
            int i15 = -((i6 | i12) & (~i13));
            int i16 = (i14 & i15) + (i15 | i14);
            int i17 = b;
            int i18 = i17 ^ 85;
            int i19 = (((i17 & 85) | i18) << 1) - i18;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                return i16;
            }
            throw null;
        }
    }

    public class aTQ implements Comparable {
        private static int a = 0;
        private static int b = 1;
        public t c;

        public aTQ(z zVar) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            int i = 2 % 2;
            int i2 = b + 65;
            a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.c.f;
            int i5 = ((t) obj).f;
            int i6 = b;
            int i7 = (i6 ^ 87) + ((i6 & 87) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = -i5;
            int i10 = (((~i9) & i4) | ((~i4) & i9)) + ((i9 & i4) << 1);
            int i11 = i6 ^ 119;
            int i12 = (((i6 & 119) | i11) << 1) - i11;
            a = i12 % 128;
            int i13 = i12 % 2;
            return i10;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 121;
            int i4 = (i3 - (~(-(-((i2 ^ 121) | i3))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            String string = "[ ";
            if (this.c != null) {
                int i6 = i2 & 37;
                int i7 = ((((i2 ^ 37) | i6) << 1) - (~(-((~i6) & (i2 | 37))))) - 1;
                a = i7 % 128;
                int i8 = i7 % 2 != 0 ? 1 : 0;
                int i9 = i2 + 57;
                a = i9 % 128;
                while (true) {
                    int i10 = i9 % 2;
                    if (i8 >= 9) {
                        break;
                    }
                    int i11 = a + 71;
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        j.w(string);
                        float[] fArr = this.c.l;
                        obj.hashCode();
                        throw null;
                    }
                    StringBuilder sbW = j.w(string);
                    sbW.append(this.c.l[i8]);
                    sbW.append(" ");
                    int i12 = b + 15;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    string = sbW.toString();
                    int i14 = i8 & 75;
                    int i15 = -(-((i8 ^ 75) | i14));
                    int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                    int i17 = i16 & (-74);
                    i8 = (i17 - (~(-(-((i16 ^ (-74)) | i17))))) - 1;
                    i9 = a + 59;
                    b = i9 % 128;
                }
            }
            StringBuilder sbB = P.b(string, "] ");
            t tVar = this.c;
            int i18 = a;
            int i19 = (i18 ^ 25) + ((i18 & 25) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            sbB.append(tVar);
            String string2 = sbB.toString();
            int i21 = b + 53;
            a = i21 % 128;
            if (i21 % 2 == 0) {
                return string2;
            }
            throw null;
        }
    }

    public z(e eVar) {
        super(eVar);
        this.i = new t[128];
        this.j = new t[128];
        this.k = 0;
        this.h = new aTQ(this);
    }

    @Override // ivas.gov.bisp.enumeration.p003ac.r, ivas.gov.bisp.enumeration.ac.i.aTI
    public void clear() {
        float f;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-8)) | ((~i2) & 7)) + ((i2 & 7) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.k = 0;
            f = 1.0f;
        } else {
            this.k = 0;
            f = 0.0f;
        }
        this.d = f;
    }

    @Override // ivas.gov.bisp.enumeration.p003ac.r
    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 19) | (i2 & 19)) << 1;
        int i4 = -(((~i2) & 19) | (i2 & (-20)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            P.b(BuildConfig.FLAVOR, " goal -> (").append(this.d);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StringBuilder sbB = P.b(BuildConfig.FLAVOR, " goal -> (");
        sbB.append(this.d);
        int i6 = a;
        int i7 = ((i6 & (-40)) | ((~i6) & 39)) + ((i6 & 39) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        sbB.append(") : ");
        String string = sbB.toString();
        int i9 = a;
        int i10 = (i9 & 101) + (i9 | 101);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 2;
        }
        int i12 = 0;
        while (i12 < this.k) {
            int i13 = b;
            int i14 = ((i13 ^ 126) + ((i13 & 126) << 1)) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            t tVar = this.i[i12];
            aTQ atq = this.h;
            int i16 = ((i13 & 82) + (i13 | 82)) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            atq.c = tVar;
            StringBuilder sbW = j.w(string);
            aTQ atq2 = this.h;
            int i18 = b + 7;
            a = i18 % 128;
            int i19 = i18 % 2;
            sbW.append(atq2);
            sbW.append(" ");
            int i20 = b;
            int i21 = ((i20 ^ 27) | (i20 & 27)) << 1;
            int i22 = -(((~i20) & 27) | (i20 & (-28)));
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            int i24 = i23 % 2;
            string = sbW.toString();
            int i25 = (i12 ^ 46) + ((i12 & 46) << 1);
            i12 = (i25 & (-45)) + (i25 | (-45));
            int i26 = a;
            int i27 = i26 & 15;
            int i28 = -(-((i26 ^ 15) | i27));
            int i29 = (i27 & i28) + (i28 | i27);
            b = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = b;
        int i32 = (((i31 ^ 45) | (i31 & 45)) << 1) - (((~i31) & 45) | (i31 & (-46)));
        a = i32 % 128;
        if (i32 % 2 == 0) {
            int i33 = 33 / 0;
        }
        return string;
    }

    public final void p(t tVar) {
        t[] tVarArr;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = (~i3) & (i2 | 125);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.k;
        t[] tVarArr2 = this.i;
        if (((i8 | 1) << 1) - (i8 ^ 1) > tVarArr2.length) {
            int i9 = ((i2 ^ 111) | (i2 & 111)) << 1;
            int i10 = -(((~i2) & 111) | (i2 & (-112)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                tVarArr = (t[]) Arrays.copyOf(tVarArr2, tVarArr2.length / 3);
                this.i = tVarArr;
            } else {
                tVarArr = (t[]) Arrays.copyOf(tVarArr2, tVarArr2.length * 2);
                this.i = tVarArr;
            }
            int i12 = a;
            int i13 = (((i12 | 103) << 1) - (~(-(i12 ^ 103)))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            this.j = (t[]) Arrays.copyOf(tVarArr, tVarArr.length * 2);
            int i15 = b;
            int i16 = i15 & 33;
            int i17 = i16 + ((i15 ^ 33) | i16);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        t[] tVarArr3 = this.i;
        int i19 = this.k;
        tVarArr3[i19] = tVar;
        int i20 = b;
        int i21 = i20 & 11;
        int i22 = (i20 | 11) & (~i21);
        int i23 = i21 << 1;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        int i25 = i24 % 128;
        a = i25;
        int i26 = i24 % 2;
        int i27 = (i19 ^ 55) + ((i19 & 55) << 1);
        int i28 = (i27 & (-54)) + (i27 | (-54));
        this.k = i28;
        Object obj = null;
        if (i28 > 1) {
            int i29 = ((i25 ^ 1) | (i25 & 1)) << 1;
            int i30 = -(((~i25) & 1) | (i25 & (-2)));
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            b = i31 % 128;
            int i32 = i31 % 2;
            if (tVarArr3[((~i28) - (~(-(-(i28 << 1))))) - 1].f > tVar.f) {
                int i33 = a;
                int i34 = i33 ^ 19;
                int i35 = ((((i33 & 19) | i34) << 1) - (~(-i34))) - 1;
                b = i35 % 128;
                int i36 = i35 % 2;
                int i37 = 0;
                while (true) {
                    int i38 = this.k;
                    if (i37 >= i38) {
                        Arrays.sort(this.j, 0, i38, new aTP(this));
                        int i39 = b + 115;
                        int i40 = i39 % 128;
                        a = i40;
                        int i41 = i39 % 2 == 0 ? 1 : 0;
                        int i42 = i40 & 65;
                        int i43 = ((i40 ^ 65) | i42) << 1;
                        int i44 = -((i40 | 65) & (~i42));
                        int i45 = (i43 & i44) + (i43 | i44);
                        b = i45 % 128;
                        int i46 = i45 % 2;
                        while (i41 < this.k) {
                            int i47 = a;
                            int i48 = i47 & 9;
                            int i49 = (i47 | 9) & (~i48);
                            int i50 = i48 << 1;
                            int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                            int i52 = i51 % 128;
                            b = i52;
                            int i53 = i51 % 2;
                            this.i[i41] = this.j[i41];
                            i41++;
                            int i54 = ((i52 & 8) + (i52 | 8)) - 1;
                            a = i54 % 128;
                            int i55 = i54 % 2;
                        }
                        break;
                    }
                    int i56 = b + 123;
                    int i57 = i56 % 128;
                    a = i57;
                    if (i56 % 2 == 0) {
                        this.j[i37] = this.i[i37];
                        throw null;
                    }
                    this.j[i37] = this.i[i37];
                    int i58 = i57 & 17;
                    int i59 = (i57 ^ 17) | i58;
                    int i60 = (i58 & i59) + (i58 | i59);
                    int i61 = i60 % 128;
                    b = i61;
                    int i62 = i60 % 2;
                    int i63 = i37 & 1;
                    int i64 = (i37 | 1) & (~i63);
                    int i65 = i63 << 1;
                    i37 = ((i64 | i65) << 1) - (i64 ^ i65);
                    int i66 = i61 & 119;
                    int i67 = -(-((i61 ^ 119) | i66));
                    int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                    a = i68 % 128;
                    int i69 = i68 % 2;
                }
            }
        }
        tVar.e = true;
        tVar.c(this);
        int i70 = a;
        int i71 = ((i70 ^ 115) | (i70 & 115)) << 1;
        int i72 = -(((~i70) & 115) | (i70 & (-116)));
        int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
        b = i73 % 128;
        if (i73 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p003ac.r, ivas.gov.bisp.enumeration.ac.i.aTI
    public void e(t tVar) {
        float[] fArr;
        float f;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 55;
        int i4 = i2 | 55;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.h.c = tVar;
            fArr = tVar.l;
            f = 1.0f;
        } else {
            this.h.c = tVar;
            fArr = tVar.l;
            f = 0.0f;
        }
        Arrays.fill(fArr, f);
        tVar.l[tVar.h] = 1.0f;
        int i6 = b;
        int i7 = i6 ^ 117;
        int i8 = -(-((i6 & 117) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        Object obj = null;
        p(tVar);
        if (i10 == 0) {
            obj.hashCode();
            throw null;
        }
        int i11 = b;
        int i12 = i11 & 63;
        int i13 = ((i11 ^ 63) | i12) << 1;
        int i14 = -((i11 | 63) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    public final void f(t tVar) {
        t[] tVarArr;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 83;
        a = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        while (i4 < this.k) {
            int i5 = b;
            int i6 = (i5 ^ 115) + ((i5 & 115) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (this.i[i4] == tVar) {
                while (true) {
                    int i8 = this.k;
                    int i9 = ((i8 ^ (-1)) | i8) << 1;
                    int i10 = -(~i8);
                    if (i4 >= (i9 ^ i10) + ((i9 & i10) << 1)) {
                        this.k = i8 - 1;
                        tVar.e = false;
                        int i11 = b;
                        int i12 = (i11 & 93) + (i11 | 93);
                        a = i12 % 128;
                        int i13 = i12 % 2;
                        return;
                    }
                    int i14 = a;
                    int i15 = i14 & 61;
                    int i16 = (i14 ^ 61) | i15;
                    int i17 = (i15 & i16) + (i15 | i16);
                    b = i17 % 128;
                    if (i17 % 2 != 0) {
                        tVarArr = this.i;
                        i = i4;
                    } else {
                        tVarArr = this.i;
                        i = i4 + 1;
                    }
                    int i18 = (((i14 & (-92)) | ((~i14) & 91)) - (~((i14 & 91) << 1))) - 1;
                    b = i18 % 128;
                    if (i18 % 2 != 0) {
                        tVarArr[i4] = tVarArr[i];
                        int i19 = 92 / 0;
                    } else {
                        tVarArr[i4] = tVarArr[i];
                    }
                    i4 = i;
                }
            } else {
                int i20 = i4 + 38;
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                int i22 = i21 & (-36);
                int i23 = (i21 ^ (-36)) | i22;
                i4 = (i22 | i23) + (i22 & i23);
                int i24 = (i5 ^ 57) + ((i5 & 57) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        int i26 = a + 31;
        b = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 61 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x014e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0164  */
    /* JADX WARN: Code duplicated, block: B:39:0x0166  */
    /* JADX WARN: Code duplicated, block: B:42:0x0171  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a3 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.p003ac.r, ivas.gov.bisp.enumeration.ac.i.aTI
    public t b(i iVar, boolean[] zArr) {
        float f;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 105;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 51;
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        int i9 = -1;
        while (true) {
            Object obj = null;
            if (i8 >= this.k) {
                if (i9 != -1) {
                    t tVar = this.i[i9];
                    int i10 = b;
                    int i11 = (i10 & 119) + (i10 | 119);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    return tVar;
                }
                int i13 = b;
                int i14 = (i13 & (-64)) | ((~i13) & 63);
                int i15 = -(-((i13 & 63) << 1));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                int i17 = i16 % 128;
                a = i17;
                int i18 = i16 % 2;
                int i19 = i17 & 97;
                int i20 = (((i17 ^ 97) | i19) << 1) - ((i17 | 97) & (~i19));
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i21 = b;
            int i22 = (i21 ^ 55) + ((i21 & 55) << 1);
            int i23 = i22 % 128;
            a = i23;
            int i24 = i22 % 2;
            t[] tVarArr = this.i;
            t tVar2 = tVarArr[i8];
            int i25 = i23 + 16;
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            b = i26 % 128;
            int i27 = i26 % 2;
            if (!zArr[tVar2.f]) {
                int i28 = b;
                int i29 = (i28 | 21) << 1;
                int i30 = -(i28 ^ 21);
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
                aTQ atq = this.h;
                atq.c = tVar2;
                int i33 = a;
                int i34 = ((i33 & 86) + (i33 | 86)) - 1;
                int i35 = i34 % 128;
                b = i35;
                int i36 = i34 % 2;
                int i37 = 8;
                if (i9 == -1) {
                    while (true) {
                        if (i37 >= 0) {
                            int i38 = b;
                            int i39 = i38 & 17;
                            int i40 = -(-((i38 ^ 17) | i39));
                            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                            a = i41 % 128;
                            int i42 = i41 % 2;
                            float f2 = atq.c.l[i37];
                            if (f2 <= 0.0f) {
                                int i43 = b;
                                int i44 = i43 + 105;
                                int i45 = i44 % 128;
                                a = i45;
                                if (i44 % 2 == 0) {
                                    if (f2 < 2.0f) {
                                        int i46 = (i43 & (-82)) | ((~i43) & 81);
                                        int i47 = (i43 & 81) << 1;
                                        int i48 = (i46 & i47) + (i46 | i47);
                                        int i49 = i48 % 128;
                                        a = i49;
                                        int i50 = i48 % 2;
                                        int i51 = ((i49 | 49) << 1) - (i49 ^ 49);
                                        b = i51 % 128;
                                        int i52 = i51 % 2;
                                    } else {
                                        int i53 = ~i37;
                                        int i54 = (i53 | i37) << 1;
                                        int i55 = -i53;
                                        i37 = (i54 ^ i55) + ((i55 & i54) << 1);
                                        int i56 = i45 + 115;
                                        b = i56 % 128;
                                        int i57 = i56 % 2;
                                    }
                                } else if (f2 < 0.0f) {
                                    int i410 = (i43 & (-82)) | ((~i43) & 81);
                                    int i411 = (i43 & 81) << 1;
                                    int i412 = (i410 & i411) + (i410 | i411);
                                    int i413 = i412 % 128;
                                    a = i413;
                                    int i58 = i412 % 2;
                                    int i59 = ((i413 | 49) << 1) - (i413 ^ 49);
                                    b = i59 % 128;
                                    int i510 = i59 % 2;
                                } else {
                                    int i511 = ~i37;
                                    int i512 = (i511 | i37) << 1;
                                    int i513 = -i511;
                                    i37 = (i512 ^ i513) + ((i513 & i512) << 1);
                                    int i514 = i45 + 115;
                                    b = i514 % 128;
                                    int i515 = i514 % 2;
                                }
                                int i60 = b;
                                int i61 = (i60 & (-98)) | ((~i60) & 97);
                                int i62 = (i60 & 97) << 1;
                                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                                a = i63 % 128;
                                int i64 = i63 % 2;
                                i9 = i8;
                            }
                        }
                        int i65 = a;
                        int i66 = (i65 ^ 115) + ((i65 & 115) << 1);
                        b = i66 % 128;
                        int i67 = i66 % 2;
                    }
                } else {
                    t tVar3 = tVarArr[i9];
                    int i68 = i35 ^ 15;
                    int i69 = ((i35 & 15) | i68) << 1;
                    int i70 = -i68;
                    int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
                    a = i71 % 128;
                    int i72 = i71 % 2;
                    while (true) {
                        if (i37 >= 0) {
                            int i73 = a;
                            int i74 = (((i73 & (-124)) | ((~i73) & 123)) - (~(-(-((i73 & 123) << 1))))) - 1;
                            b = i74 % 128;
                            if (i74 % 2 != 0) {
                                float f3 = tVar3.l[i37];
                                t tVar4 = atq.c;
                                obj.hashCode();
                                throw null;
                            }
                            float f4 = tVar3.l[i37];
                            t tVar5 = atq.c;
                            int i75 = b + 97;
                            a = i75 % 128;
                            if (i75 % 2 == 0) {
                                f = tVar5.l[i37];
                                int i76 = 29 / 0;
                                if (f == f4) {
                                    int i77 = (i37 & (-93)) + (i37 | (-93));
                                    i37 = ((i77 | 92) << 1) - (i77 ^ 92);
                                    int i78 = b;
                                    int i79 = ((i78 | 51) << 1) - (i78 ^ 51);
                                    a = i79 % 128;
                                    int i80 = i79 % 2;
                                } else if (f < f4) {
                                    int i81 = a;
                                    int i82 = i81 ^ 115;
                                    int i83 = ((i81 & 115) | i82) << 1;
                                    int i84 = -i82;
                                    i = ((i83 | i84) << 1) - (i84 ^ i83);
                                    b = i % 128;
                                    if (i % 2 != 0) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    int i85 = i81 + 95;
                                    b = i85 % 128;
                                    int i86 = i85 % 2;
                                    if (z) {
                                        int i610 = b;
                                        int i611 = (i610 & (-98)) | ((~i610) & 97);
                                        int i612 = (i610 & 97) << 1;
                                        int i613 = (i611 ^ i612) + ((i612 & i611) << 1);
                                        a = i613 % 128;
                                        int i614 = i613 % 2;
                                        i9 = i8;
                                    }
                                }
                            } else {
                                f = tVar5.l[i37];
                                if (f == f4) {
                                    int i710 = (i37 & (-93)) + (i37 | (-93));
                                    i37 = ((i710 | 92) << 1) - (i710 ^ 92);
                                    int i711 = b;
                                    int i712 = ((i711 | 51) << 1) - (i711 ^ 51);
                                    a = i712 % 128;
                                    int i87 = i712 % 2;
                                } else if (f < f4) {
                                    int i88 = a;
                                    int i89 = i88 ^ 115;
                                    int i810 = ((i88 & 115) | i89) << 1;
                                    int i811 = -i89;
                                    i = ((i810 | i811) << 1) - (i811 ^ i810);
                                    b = i % 128;
                                    if (i % 2 != 0) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    int i812 = i88 + 95;
                                    b = i812 % 128;
                                    int i813 = i812 % 2;
                                    if (z) {
                                        int i615 = b;
                                        int i616 = (i615 & (-98)) | ((~i615) & 97);
                                        int i617 = (i615 & 97) << 1;
                                        int i618 = (i616 ^ i617) + ((i617 & i616) << 1);
                                        a = i618 % 128;
                                        int i619 = i618 % 2;
                                        i9 = i8;
                                    }
                                }
                            }
                        }
                        int i90 = a;
                        int i91 = ((i90 ^ 79) - (~(-(-((i90 & 79) << 1))))) - 1;
                        b = i91 % 128;
                        int i92 = i91 % 2;
                    }
                }
            }
            int i93 = i8 ^ 1;
            int i94 = (i8 & 1) << 1;
            i8 = (i94 | i93) + (i93 & i94);
            int i95 = a;
            int i96 = i95 & 109;
            int i97 = ((i95 | 109) & (~i96)) + (i96 << 1);
            b = i97 % 128;
            int i98 = i97 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:27:0x0126  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f0 A[PHI: r9
  0x01f0: PHI (r9v20 float) = (r9v19 float), (r9v41 float) binds: [B:45:0x01ee, B:41:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x021f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0239  */
    /* JADX WARN: Code duplicated, block: B:80:0x0254 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.p003ac.r
    public void o(r rVar, boolean z) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 79;
        int i7 = 1;
        int i8 = ((((i5 ^ 79) | i6) << 1) - (~(-((i5 | 79) & (~i6))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        t tVar = rVar.c;
        if (tVar == null) {
            int i10 = b;
            int i11 = i10 & 47;
            int i12 = (i10 ^ 47) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        r.aTJ atj = rVar.f;
        int i15 = atj.i();
        int i16 = b;
        int i17 = (i16 & 101) + (i16 | 101);
        a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i19 < i15) {
            int i20 = a;
            int i21 = i20 & 23;
            int i22 = ((i20 ^ 23) | i21) << i7;
            int i23 = -((i20 | 23) & (~i21));
            int i24 = (i22 ^ i23) + ((i23 & i22) << i7);
            b = i24 % 128;
            if (i24 % 2 != 0) {
                Object obj = null;
                atj.a(i19);
                obj.hashCode();
                throw null;
            }
            t tVarA = atj.a(i19);
            float fB = atj.b(i19);
            int i25 = a;
            int i26 = ((i25 | 25) << i7) - (i25 ^ 25);
            b = i26 % 128;
            if (i26 % 2 != 0) {
                this.h.c = tVarA;
                throw null;
            }
            aTQ atq = this.h;
            atq.c = tVarA;
            if (tVarA.e) {
                int i27 = a;
                int i28 = i27 & 15;
                int i29 = (i28 - (~(-(-((i27 ^ 15) | i28))))) - i7;
                b = i29 % 128;
                int i30 = i29 % 2;
                int i31 = i7;
                int i32 = 0;
                for (int i33 = 9; i32 < i33; i33 = 9) {
                    int i34 = a;
                    int i35 = i34 & 51;
                    int i36 = (i35 - (~(-(-((i34 ^ 51) | i35))))) - 1;
                    b = i36 % 128;
                    if (i36 % 2 != 0) {
                        float f3 = atq.c.l[i32];
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    float[] fArr = atq.c.l;
                    float f4 = fArr[i32];
                    int i37 = b + 83;
                    a = i37 % 128;
                    int i38 = i37 % 2;
                    float f5 = tVar.l[i32] * fB;
                    int i39 = b;
                    int i40 = (i39 & 121) + (i39 | 121);
                    a = i40 % 128;
                    if (i40 % 2 == 0) {
                        float f6 = f5 * f4;
                        fArr[i32] = f6;
                        if (Math.abs(f6) < 1.0E-4f) {
                            int i41 = b;
                            int i42 = i41 & 45;
                            int i43 = ((i41 ^ 45) | i42) << 1;
                            int i44 = -((i41 | 45) & (~i42));
                            int i45 = (i43 & i44) + (i44 | i43);
                            a = i45 % 128;
                            int i46 = i45 % 2;
                            atq.c.l[i32] = 0.0f;
                            int i47 = b;
                            int i48 = (i47 & (-10)) | ((~i47) & 9);
                            int i49 = -(-((i47 & 9) << 1));
                            int i50 = (i48 & i49) + (i49 | i48);
                            a = i50 % 128;
                            int i51 = i50 % 2;
                        } else {
                            int i52 = b;
                            int i53 = (i52 ^ 95) + ((i52 & 95) << 1);
                            a = i53 % 128;
                            int i54 = i53 % 2;
                            i31 = 0;
                        }
                    } else {
                        float f7 = f5 + f4;
                        fArr[i32] = f7;
                        if (Math.abs(f7) < 1.0E-4f) {
                            int i410 = b;
                            int i411 = i410 & 45;
                            int i412 = ((i410 ^ 45) | i411) << 1;
                            int i413 = -((i410 | 45) & (~i411));
                            int i414 = (i412 & i413) + (i413 | i412);
                            a = i414 % 128;
                            int i415 = i414 % 2;
                            atq.c.l[i32] = 0.0f;
                            int i416 = b;
                            int i417 = (i416 & (-10)) | ((~i416) & 9);
                            int i418 = -(-((i416 & 9) << 1));
                            int i55 = (i417 & i418) + (i418 | i417);
                            a = i55 % 128;
                            int i56 = i55 % 2;
                        } else {
                            int i57 = b;
                            int i58 = (i57 ^ 95) + ((i57 & 95) << 1);
                            a = i58 % 128;
                            int i59 = i58 % 2;
                            i31 = 0;
                        }
                    }
                    int i60 = i32 ^ 96;
                    int i61 = ((((i32 & 96) | i60) << 1) - (~(-i60))) - 1;
                    int i62 = i61 & (-95);
                    int i63 = i61 | (-95);
                    i32 = (i62 & i63) + (i62 | i63);
                    int i64 = b + 37;
                    a = i64 % 128;
                    int i65 = i64 % 2;
                }
                if ((i31 ^ 1) != 1) {
                    int i66 = b;
                    int i67 = (i66 ^ 69) + ((i66 & 69) << 1);
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    z zVar = z.this;
                    t tVar2 = atq.c;
                    int i69 = b + 117;
                    a = i69 % 128;
                    int i70 = i69 % 2;
                    zVar.f(tVar2);
                    int i71 = b;
                    i3 = 1;
                    int i72 = ((((i71 ^ 51) | (i71 & 51)) << 1) - (~(-(((~i71) & 51) | (i71 & (-52)))))) - 1;
                    a = i72 % 128;
                    int i73 = i72 % 2;
                } else {
                    i3 = 1;
                }
                int i74 = a;
                int i75 = i74 & 1;
                int i76 = (i74 ^ i3) | i75;
                int i77 = (i75 & i76) + (i76 | i75);
                b = i77 % 128;
                int i78 = i77 % 2;
            } else {
                int i79 = a;
                int i80 = 1;
                int i81 = (((i79 | 114) << 1) - (i79 ^ 114)) - 1;
                b = i81 % 128;
                int i82 = i81 % 2;
                int i83 = 0;
                int i84 = 9;
                while (i83 < i84) {
                    int i85 = b;
                    int i86 = (-2) - ((((i85 | 88) << i80) - (i85 ^ 88)) ^ (-1));
                    a = i86 % 128;
                    if (i86 % 2 == 0) {
                        f = tVar.l[i83];
                        if (f != 1.0f) {
                            f2 = f * fB;
                            if (Math.abs(f2) < 1.0E-4f) {
                                int i87 = b;
                                int i88 = (((i87 ^ 43) | (i87 & 43)) << 1) - ((i87 & (-44)) | ((~i87) & 43));
                                a = i88 % 128;
                                int i89 = i88 % 2;
                                i2 = i87 + 93;
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i90 = 2 % 5;
                                }
                                f2 = 0.0f;
                            }
                            atq.c.l[i83] = f2;
                            int i91 = b + 116;
                            i = (i91 ^ (-1)) + (i91 << 1);
                            a = i % 128;
                            if (i % 2 == 0) {
                                int i92 = 5 % 4;
                            }
                        } else {
                            atq.c.l[i83] = 0.0f;
                            int i93 = a;
                            int i94 = ((i93 & (-52)) | ((~i93) & 51)) + ((i93 & 51) << 1);
                            b = i94 % 128;
                            int i95 = i94 % 2;
                        }
                    } else {
                        f = tVar.l[i83];
                        if (f != 0.0f) {
                            f2 = f * fB;
                            if (Math.abs(f2) < 1.0E-4f) {
                                int i810 = b;
                                int i811 = (((i810 ^ 43) | (i810 & 43)) << 1) - ((i810 & (-44)) | ((~i810) & 43));
                                a = i811 % 128;
                                int i812 = i811 % 2;
                                i2 = i810 + 93;
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i96 = 2 % 5;
                                }
                                f2 = 0.0f;
                            }
                            atq.c.l[i83] = f2;
                            int i97 = b + 116;
                            i = (i97 ^ (-1)) + (i97 << 1);
                            a = i % 128;
                            if (i % 2 == 0) {
                                int i98 = 5 % 4;
                            }
                        } else {
                            atq.c.l[i83] = 0.0f;
                            int i99 = a;
                            int i910 = ((i99 & (-52)) | ((~i99) & 51)) + ((i99 & 51) << 1);
                            b = i910 % 128;
                            int i911 = i910 % 2;
                        }
                    }
                    int i100 = i83 & 57;
                    int i101 = (i100 - (~((i83 ^ 57) | i100))) - 1;
                    int i102 = i101 & (-56);
                    int i103 = ((i101 | (-56)) & (~i102)) + (i102 << 1);
                    int i104 = b;
                    int i105 = (i104 ^ 107) + ((i104 & 107) << 1);
                    a = i105 % 128;
                    int i106 = i105 % 2;
                    i83 = i103;
                    i84 = 9;
                    i80 = 1;
                }
                int i107 = a;
                int i108 = ((i107 ^ 125) | (i107 & 125)) << 1;
                int i109 = -(((~i107) & 125) | (i107 & (-126)));
                int i110 = (i108 & i109) + (i109 | i108);
                b = i110 % 128;
                int i111 = i110 % 2;
                p(tVarA);
                int i112 = b;
                int i113 = i112 & 83;
                int i114 = (i112 | 83) & (~i113);
                int i115 = -(-(i113 << 1));
                int i116 = (i114 & i115) + (i114 | i115);
                a = i116 % 128;
                int i117 = i116 % 2;
            }
            float f8 = this.d;
            float f9 = rVar.d * fB;
            int i118 = a + 111;
            b = i118 % 128;
            if (i118 % 2 != 0) {
                this.d = f9 % f8;
                int i119 = i19 & (-34);
                int i120 = (i119 - (~(-(-((i19 ^ (-34)) | i119))))) - 1;
                int i121 = i120 & 97;
                i19 = (i121 - (~((i120 ^ 97) | i121))) - 1;
            } else {
                this.d = f9 + f8;
                i19 = (((i19 ^ 1) | (i19 & 1)) << 1) - ((i19 & (-2)) | ((~i19) & 1));
            }
            i7 = 1;
        }
        f(tVar);
        int i122 = b;
        int i123 = (i122 & (-52)) | ((~i122) & 51);
        int i124 = (i122 & 51) << 1;
        int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
        a = i125 % 128;
        int i126 = i125 % 2;
    }
}
