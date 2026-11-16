package ivas.gov.bisp.enumeration.p003ac;

import ivas.gov.bisp.enumeration.p004ad.N;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private static int a = 0;
    private static int b = 1;
    public static int c = 1000;
    public static boolean d = true;
    public static long e;
    public static long f;
    public aTI i;
    public r[] m;
    public final e q;
    public aTI s;
    public int h = 0;
    public int j = 32;
    public int k = 32;
    public boolean l = false;
    public boolean[] n = new boolean[32];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f62o = 1;
    public int g = 0;
    public int p = 32;
    public t[] r = new t[c];
    public int t = 0;

    public interface aTI {
        t b(i iVar, boolean[] zArr);

        void clear();

        void e(t tVar);
    }

    public class aTM extends r {
        public aTM(i iVar, e eVar) {
            this.f = new u(this, eVar);
        }
    }

    public i() {
        Object obj = null;
        this.m = null;
        this.m = new r[32];
        u();
        e eVar = new e(0);
        this.q = eVar;
        this.i = new z(eVar);
        if (d) {
            this.s = new aTM(this, eVar);
            int i = b;
            int i2 = ((i ^ 32) + ((32 & i) << 1)) - 1;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 8 / 0;
                return;
            }
            return;
        }
        this.s = new r(eVar);
        int i4 = a;
        int i5 = i4 & 73;
        int i6 = -(-((i4 ^ 73) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x015d  */
    public r g(t tVar, t tVar2, int i, int i2) {
        int i3;
        r.aTJ atj;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        int i6 = i;
        int i7 = 2 % 2;
        int i8 = a;
        int i9 = i8 & 95;
        int i10 = -(-((i8 ^ 95) | i9));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        Object obj = null;
        if (i2 == 8) {
            int i13 = (i8 ^ 25) + ((i8 & 25) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            if (tVar2.i) {
                int i15 = a;
                int i16 = i15 & 69;
                int i17 = (i16 - (~((i15 ^ 69) | i16))) - 1;
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = tVar.g;
                    throw null;
                }
                if (tVar.g == -1) {
                    int i19 = b;
                    int i20 = (((i19 | 28) << 1) - (i19 ^ 28)) - 1;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    tVar.f(this, tVar2.j + i6);
                    int i22 = b;
                    int i23 = (i22 ^ 87) + ((i22 & 87) << 1);
                    int i24 = i23 % 128;
                    a = i24;
                    if (i23 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i25 = i24 & 17;
                    int i26 = (i25 - (~((i24 ^ 17) | i25))) - 1;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    return null;
                }
            }
        }
        r rVarP = p();
        if (i6 != 0) {
            int i28 = a;
            int i29 = (i28 ^ 107) + ((i28 & 107) << 1);
            b = i29 % 128;
            if (i29 % 2 != 0 ? i6 >= 0 : i6 >= 0) {
                z2 = false;
            } else {
                int i30 = i28 & 1;
                int i31 = (i28 ^ 1) | i30;
                int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                b = i32 % 128;
                if (i32 % 2 == 0) {
                    int i33 = i6 & 1;
                    i5 = (((i6 ^ 1) | i33) << 1) - ((i6 | 1) & (~i33));
                    z = false;
                } else {
                    i5 = i6 * (-1);
                    z = true;
                }
                int i34 = i5;
                z2 = z;
                i6 = i34;
            }
            rVarP.d = i6;
            int i35 = a + 103;
            b = i35 % 128;
            int i36 = i35 % 2;
            if (z2) {
                rVarP.f.d(tVar, 1.0f);
                int i37 = b;
                int i38 = ((i37 ^ 54) + ((i37 & 54) << 1)) - 1;
                a = i38 % 128;
                if (i38 % 2 != 0) {
                    rVarP.f.d(tVar2, -1.0f);
                    obj.hashCode();
                    throw null;
                }
                rVarP.f.d(tVar2, -1.0f);
            } else {
                i3 = b + 123;
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    rVarP.f.d(tVar, -1.0f);
                    r.aTJ atj2 = rVarP.f;
                    throw null;
                }
                rVarP.f.d(tVar, -1.0f);
                atj = rVarP.f;
                int i39 = a;
                i4 = ((i39 & 106) + (i39 | 106)) - 1;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    atj.d(tVar2, 1.0f);
                } else {
                    atj.d(tVar2, 1.0f);
                }
            }
        } else {
            i3 = b + 123;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                rVarP.f.d(tVar, -1.0f);
                r.aTJ atj3 = rVarP.f;
                throw null;
            }
            rVarP.f.d(tVar, -1.0f);
            atj = rVarP.f;
            int i310 = a;
            i4 = ((i310 & 106) + (i310 | 106)) - 1;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                atj.d(tVar2, 1.0f);
            } else {
                atj.d(tVar2, 1.0f);
            }
        }
        if (i2 != 8) {
            int i40 = a;
            int i41 = (i40 & 21) + (i40 | 21);
            b = i41 % 128;
            int i42 = i41 % 2;
            rVarP.g(this, i2);
            int i43 = a;
            int i44 = (i43 ^ 101) + ((i43 & 101) << 1);
            b = i44 % 128;
            int i45 = i44 % 2;
        }
        f(rVarP);
        int i46 = a;
        int i47 = ((i46 | 37) << 1) - (i46 ^ 37);
        b = i47 % 128;
        if (i47 % 2 == 0) {
            int i48 = 72 / 0;
        }
        return rVarP;
    }

    public void h(t tVar, t tVar2, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 | 17) << 1) - (i4 ^ 17);
        a = i5 % 128;
        int i6 = i5 % 2;
        r rVarP = p();
        t tVarO = o();
        tVarO.h = 0;
        rVarP.j(tVar, tVar2, tVarO, i);
        int i7 = a;
        int i8 = i7 & 39;
        int i9 = ((~i8) & (i7 | 39)) + (i8 << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        if (i2 != 8) {
            int i11 = (i7 ^ 33) + ((i7 & 33) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                rVarP.f.e(tVarO);
                throw null;
            }
            float fE = rVarP.f.e(tVarO);
            int i12 = a;
            int i13 = (i12 ^ 115) + ((i12 & 115) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            t tVarM = m(i2, null);
            int i15 = b;
            int i16 = ((i15 & 82) + (i15 | 82)) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            rVarP.f.d(tVarM, (int) (fE * (-1.0f)));
            int i18 = a;
            int i19 = i18 & 23;
            int i20 = -(-((i18 ^ 23) | i19));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
        }
        f(rVarP);
        int i23 = b;
        int i24 = (i23 ^ 73) + ((i23 & 73) << 1);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
    }

    public int q(Object obj) {
        int i = 2 % 2;
        int i2 = a + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        t tVar = ((N) obj).i;
        if (tVar == null) {
            int i4 = (-2) - ((b + 90) ^ (-1));
            a = i4 % 128;
            if (i4 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int i5 = a + 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (int) (tVar.j + 0.5f);
        int i8 = b;
        int i9 = i8 & 93;
        int i10 = (((i8 ^ 93) | i9) << 1) - ((i8 | 93) & (~i9));
        a = i10 % 128;
        int i11 = i10 % 2;
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    public final void c(r rVar) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 27) << 1) - (i3 ^ 27);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (d) {
            r[] rVarArr = this.m;
            int i6 = this.g;
            int i7 = ((i3 ^ 123) | (i3 & 123)) << 1;
            int i8 = -(((~i3) & 123) | (i3 & (-124)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            int i10 = i9 % 128;
            b = i10;
            if (i9 % 2 == 0) {
                int i11 = 79 / 0;
                if (rVarArr[i6] != null) {
                    int i12 = (i10 & (-50)) | ((~i10) & 49);
                    int i13 = (i10 & 49) << 1;
                    int i14 = (i12 & i13) + (i13 | i12);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    ((C0086p) this.q.c).d(rVarArr[i6]);
                    int i16 = b;
                    int i17 = (i16 & (-92)) | ((~i16) & 91);
                    int i18 = (i16 & 91) << 1;
                    i = (i17 ^ i18) + ((i18 & i17) << 1);
                    a = i % 128;
                    if (i % 2 != 0) {
                        int i19 = 89 / 0;
                    }
                }
            } else if (rVarArr[i6] != null) {
                int i110 = (i10 & (-50)) | ((~i10) & 49);
                int i111 = (i10 & 49) << 1;
                int i112 = (i110 & i111) + (i111 | i110);
                a = i112 % 128;
                int i113 = i112 % 2;
                ((C0086p) this.q.c).d(rVarArr[i6]);
                int i114 = b;
                int i115 = (i114 & (-92)) | ((~i114) & 91);
                int i116 = (i114 & 91) << 1;
                i = (i115 ^ i116) + ((i116 & i115) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    int i117 = 89 / 0;
                }
            }
        } else {
            r[] rVarArr2 = this.m;
            int i20 = this.g;
            if (rVarArr2[i20] != null) {
                int i21 = i5 + 13;
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    ((C0086p) this.q.d).d(rVarArr2[i20]);
                    int i22 = 91 / 0;
                } else {
                    ((C0086p) this.q.d).d(rVarArr2[i20]);
                }
                int i23 = a + 49;
                int i24 = i23 % 128;
                b = i24;
                int i25 = i23 % 2;
                int i26 = (((i24 ^ 73) | (i24 & 73)) << 1) - (((~i24) & 73) | (i24 & (-74)));
                a = i26 % 128;
                int i27 = i26 % 2;
            }
        }
        r[] rVarArr3 = this.m;
        int i28 = this.g;
        int i29 = b;
        int i30 = (((i29 | 22) << 1) - (i29 ^ 22)) - 1;
        a = i30 % 128;
        int i31 = i30 % 2;
        rVarArr3[i28] = rVar;
        t tVar = rVar.c;
        tVar.g = i28;
        int i32 = a;
        int i33 = ((i32 ^ 120) + ((i32 & 120) << 1)) - 1;
        b = i33 % 128;
        if (i33 % 2 == 0) {
            this.g = i28 >>> 1;
        } else {
            this.g = (i28 & 1) + (i28 | 1);
        }
        tVar.g(rVar);
        int i34 = b;
        int i35 = i34 & 81;
        int i36 = i35 + ((i34 ^ 81) | i35);
        a = i36 % 128;
        int i37 = i36 % 2;
    }

    public final void l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = (i2 | 115) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2 == 0 ? 1 : 0;
        int i9 = ((i7 | 73) << 1) - (i7 ^ 73);
        a = i9 % 128;
        int i10 = i9 % 2;
        while (i8 < this.g) {
            int i11 = a + 41;
            b = i11 % 128;
            int i12 = i11 % 2;
            r rVar = this.m[i8];
            t tVar = rVar.c;
            float f2 = rVar.d;
            int i13 = b;
            int i14 = (i13 | 69) << 1;
            int i15 = -(i13 ^ 69);
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
            tVar.j = f2;
            if (i17 != 0) {
                int i18 = i8 & 54;
                int i19 = (i8 | 54) & (~i18);
                int i20 = -(-(i18 << 1));
                i8 = (i19 ^ i20) + ((i20 & i19) << 1);
            } else {
                int i21 = i8 & 49;
                int i22 = (i21 - (~(-(-((i8 ^ 49) | i21))))) - 1;
                i8 = (i22 ^ (-48)) + ((i22 & (-48)) << 1);
            }
            int i23 = a;
            int i24 = i23 | 125;
            int i25 = i24 << 1;
            int i26 = -((~(i23 & 125)) & i24);
            int i27 = (i25 & i26) + (i26 | i25);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = a + 57;
        b = i29 % 128;
        if (i29 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x0050  */
    public void k(t tVar, t tVar2, t tVar3, t tVar4, float f2, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 | 103) << 1;
        int i6 = -(((~i4) & 103) | (i4 & (-104)));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        r rVarP = p();
        int i9 = b + 76;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            rVarP.h(tVar, tVar2, tVar3, tVar4, f2);
            if (i != 115) {
                rVarP.g(this, i);
                int i11 = b;
                int i12 = i11 & 33;
                i2 = (i12 - (~(-(-((i11 ^ 33) | i12))))) - 1;
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i13 = 4 / 4;
                }
            }
        } else {
            rVarP.h(tVar, tVar2, tVar3, tVar4, f2);
            if (i != 8) {
                rVarP.g(this, i);
                int i14 = b;
                int i15 = i14 & 33;
                i2 = (i15 - (~(-(-((i14 ^ 33) | i15))))) - 1;
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i16 = 4 / 4;
                }
            }
        }
        f(rVarP);
        int i17 = b + 59;
        a = i17 % 128;
        int i18 = i17 % 2;
    }

    public final void r() {
        e eVar;
        t[] tVarArr;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 59;
        b = i3 % 128;
        int i4 = i3 % 2 == 0 ? this.j % 3 : this.j * 2;
        this.j = i4;
        this.m = (r[]) Arrays.copyOf(this.m, i4);
        int i5 = b + 61;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            eVar = this.q;
            tVarArr = (t[]) eVar.f;
            i = this.j;
            int i6 = 27 / 0;
        } else {
            eVar = this.q;
            tVarArr = (t[]) eVar.f;
            i = this.j;
        }
        eVar.f = (t[]) Arrays.copyOf(tVarArr, i);
        int i7 = this.j;
        int i8 = a;
        int i9 = ((((i8 ^ 55) | (i8 & 55)) << 1) - (~(-(((~i8) & 55) | (i8 & (-56)))))) - 1;
        int i10 = i9 % 128;
        b = i10;
        Object obj = null;
        if (i9 % 2 == 0) {
            this.n = new boolean[i7];
            this.k = i7;
            obj.hashCode();
            throw null;
        }
        this.n = new boolean[i7];
        this.k = i7;
        int i11 = i10 & 5;
        int i12 = (((i10 ^ 5) | i11) << 1) - ((i10 | 5) & (~i11));
        int i13 = i12 % 128;
        a = i13;
        if (i12 % 2 != 0) {
            this.p = i7;
            int i14 = 13 / 0;
        } else {
            this.p = i7;
        }
        int i15 = (i13 & 51) + (i13 | 51);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public t o() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 39;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = this.f62o;
            int i6 = (i5 & 1) + (i5 | 1);
            if ((i6 ^ (-1)) + (i6 << 1) >= this.k) {
                int i7 = i3 & 79;
                int i8 = (i3 ^ 79) | i7;
                int i9 = (i7 & i8) + (i8 | i7);
                a = i9 % 128;
                i = i9 % 2;
                r();
                if (i != 0) {
                    int i10 = 0 / 0;
                }
            }
        } else {
            int i11 = this.f62o;
            if (((i11 ^ 2) + ((i11 & 2) << 1)) - 1 >= this.k) {
                int i12 = i3 & 79;
                int i13 = (i3 ^ 79) | i12;
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                i = i14 % 2;
                r();
                if (i != 0) {
                    int i15 = 0 / 0;
                }
            }
        }
        t tVarD = d(3, null);
        int i16 = this.h;
        int i17 = i16 ^ 1;
        int i18 = -(-((i16 & 1) << 1));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        int i20 = a;
        int i21 = i20 & 109;
        int i22 = -(-((i20 ^ 109) | i21));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            this.h = i19;
            int i24 = this.f62o;
            this.f62o = ((i24 & 1) - (~(i24 | 1))) - 1;
        } else {
            this.h = i19;
            this.f62o++;
        }
        tVarD.f = i19;
        int i25 = a;
        int i26 = i25 & 25;
        int i27 = i25 | 25;
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            ((t[]) this.q.f)[i19] = tVarD;
            int i29 = 98 / 0;
        } else {
            ((t[]) this.q.f)[i19] = tVarD;
        }
        return tVarD;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x0117 A[EDGE_INSN: B:40:0x0117->B:36:0x0117 BREAK  A[LOOP:0: B:26:0x00af->B:35:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0117 A[EDGE_INSN: B:45:0x0117->B:36:0x0117 BREAK  A[LOOP:1: B:15:0x0040->B:22:0x0089], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0089 A[SYNTHETIC] */
    public final void u() {
        int i;
        int i2;
        int i3;
        r[] rVarArr;
        int i4;
        int i5;
        r rVar;
        r[] rVarArr2;
        int i6;
        r rVar2;
        int i7;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = i9 & 113;
        int i11 = i10 + ((i9 ^ 113) | i10);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            if (!d) {
                i = 0;
                while (true) {
                    rVarArr2 = this.m;
                    if (i < rVarArr2.length) {
                        break;
                        break;
                    }
                    i6 = b;
                    int i12 = (((i6 | 7) << 1) - (~(-((i6 & (-8)) | ((~i6) & 7))))) - 1;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    rVar2 = rVarArr2[i];
                    if (rVar2 != null) {
                        i7 = ((i6 & (-50)) | ((~i6) & 49)) + ((i6 & 49) << 1);
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            ((C0086p) this.q.d).d(rVar2);
                            throw null;
                        }
                        ((C0086p) this.q.d).d(rVar2);
                    }
                    this.m[i] = null;
                    int i14 = (i | 1) << 1;
                    int i15 = -(((~i) & 1) | (i & (-2)));
                    i = (i15 | i14) + (i14 & i15);
                    int i16 = b;
                    int i17 = i16 & 27;
                    int i18 = -(-((i16 ^ 27) | i17));
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                }
            } else {
                int i21 = i9 & 95;
                i2 = (i21 - (~(-(-((i9 ^ 95) | i21))))) - 1;
                int i22 = i2 % 128;
                a = i22;
                if (i2 % 2 != 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i23 = ((i22 | 7) << 1) - (i22 ^ 7);
                b = i23 % 128;
                int i24 = i23 % 2;
                while (true) {
                    rVarArr = this.m;
                    if (i3 < rVarArr.length) {
                        break;
                        break;
                    }
                    i4 = b;
                    int i25 = i4 & 111;
                    int i26 = (~i25) & (i4 | 111);
                    int i27 = -(-(i25 << 1));
                    i5 = ((i26 | i27) << 1) - (i27 ^ i26);
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        r rVar3 = rVarArr[i3];
                        throw null;
                    }
                    rVar = rVarArr[i3];
                    if (rVar != null) {
                        int i28 = i4 & 69;
                        int i29 = (i4 | 69) & (~i28);
                        int i30 = -(-(i28 << 1));
                        int i31 = (i29 & i30) + (i29 | i30);
                        a = i31 % 128;
                        int i32 = i31 % 2;
                        ((C0086p) this.q.c).d(rVar);
                        int i33 = a;
                        int i34 = (((i33 | 74) << 1) - (i33 ^ 74)) - 1;
                        b = i34 % 128;
                        int i35 = i34 % 2;
                    }
                    this.m[i3] = null;
                    int i36 = i3 & 1;
                    i3 = (((i3 ^ 1) | i36) << 1) - ((i3 | 1) & (~i36));
                    int i37 = b;
                    int i38 = i37 & 69;
                    int i39 = i37 | 69;
                    int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                    a = i40 % 128;
                    int i41 = i40 % 2;
                }
            }
        } else if (!d) {
            i = 1;
            while (true) {
                rVarArr2 = this.m;
                if (i < rVarArr2.length) {
                    break;
                }
                i6 = b;
                int i110 = (((i6 | 7) << 1) - (~(-((i6 & (-8)) | ((~i6) & 7))))) - 1;
                a = i110 % 128;
                int i111 = i110 % 2;
                rVar2 = rVarArr2[i];
                if (rVar2 != null) {
                    i7 = ((i6 & (-50)) | ((~i6) & 49)) + ((i6 & 49) << 1);
                    a = i7 % 128;
                    if (i7 % 2 == 0) {
                        ((C0086p) this.q.d).d(rVar2);
                        throw null;
                    }
                    ((C0086p) this.q.d).d(rVar2);
                }
                this.m[i] = null;
                int i112 = (i | 1) << 1;
                int i113 = -(((~i) & 1) | (i & (-2)));
                i = (i113 | i112) + (i112 & i113);
                int i114 = b;
                int i115 = i114 & 27;
                int i116 = -(-((i114 ^ 27) | i115));
                int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                a = i117 % 128;
                int i210 = i117 % 2;
            }
        } else {
            int i211 = i9 & 95;
            i2 = (i211 - (~(-(-((i9 ^ 95) | i211))))) - 1;
            int i212 = i2 % 128;
            a = i212;
            if (i2 % 2 != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i213 = ((i212 | 7) << 1) - (i212 ^ 7);
            b = i213 % 128;
            int i214 = i213 % 2;
            while (true) {
                rVarArr = this.m;
                if (i3 < rVarArr.length) {
                    break;
                }
                i4 = b;
                int i215 = i4 & 111;
                int i216 = (~i215) & (i4 | 111);
                int i217 = -(-(i215 << 1));
                i5 = ((i216 | i217) << 1) - (i217 ^ i216);
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    r rVar4 = rVarArr[i3];
                    throw null;
                }
                rVar = rVarArr[i3];
                if (rVar != null) {
                    int i218 = i4 & 69;
                    int i219 = (i4 | 69) & (~i218);
                    int i310 = -(-(i218 << 1));
                    int i311 = (i219 & i310) + (i219 | i310);
                    a = i311 % 128;
                    int i312 = i311 % 2;
                    ((C0086p) this.q.c).d(rVar);
                    int i313 = a;
                    int i314 = (((i313 | 74) << 1) - (i313 ^ 74)) - 1;
                    b = i314 % 128;
                    int i315 = i314 % 2;
                }
                this.m[i3] = null;
                int i316 = i3 & 1;
                i3 = (((i3 ^ 1) | i316) << 1) - ((i3 | 1) & (~i316));
                int i317 = b;
                int i318 = i317 & 69;
                int i319 = i317 | 69;
                int i42 = ((i318 | i319) << 1) - (i319 ^ i318);
                a = i42 % 128;
                int i43 = i42 % 2;
            }
        }
        int i44 = a;
        int i45 = (i44 & (-2)) | ((~i44) & 1);
        int i46 = (i44 & 1) << 1;
        int i47 = (i45 & i46) + (i46 | i45);
        b = i47 % 128;
        if (i47 % 2 == 0) {
            int i48 = 41 / 0;
        }
    }

    public void j(t tVar, t tVar2, int i, int i2) {
        r rVarP;
        t tVarO;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 103) + (i4 | 103);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            rVarP = p();
            tVarO = o();
            tVarO.h = 1;
        } else {
            rVarP = p();
            tVarO = o();
            tVarO.h = 0;
        }
        rVarP.i(tVar, tVar2, tVarO, i);
        Object obj = null;
        if (i2 != 8) {
            int i6 = b + 63;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                rVarP.f.e(tVarO);
                obj.hashCode();
                throw null;
            }
            float fE = rVarP.f.e(tVarO);
            int i7 = b;
            int i8 = (i7 ^ 38) + ((i7 & 38) << 1);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = (int) (i9 % 2 != 0 ? fE / (-1.0f) : fE * (-1.0f));
            t tVarM = m(i2, null);
            int i11 = b;
            int i12 = (((i11 & (-122)) | ((~i11) & 121)) - (~(-(-((i11 & 121) << 1))))) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                rVarP.f.d(tVarM, i10);
                int i13 = 68 / 0;
            } else {
                rVarP.f.d(tVarM, i10);
            }
        }
        f(rVarP);
        int i14 = b;
        int i15 = ((i14 | 49) << 1) - (i14 ^ 49);
        a = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public t m(int i, String str) {
        e eVar;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 29;
        int i5 = (((i3 ^ 29) | i4) << 1) - ((i3 | 29) & (~i4));
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = this.f62o;
            if ((-2) - (((i6 ^ 2) + ((i6 & 2) << 1)) ^ (-1)) >= this.k) {
                r();
                int i7 = b;
                int i8 = (i7 & 75) + (i7 | 75);
                a = i8 % 128;
                int i9 = i8 % 2;
            }
        } else if (this.k <= 0) {
            r();
            int i10 = b;
            int i11 = (i10 & 75) + (i10 | 75);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        t tVarD = d(4, str);
        int i13 = this.h;
        int i14 = (((i13 & (-2)) | ((~i13) & 1)) - (~((i13 & 1) << 1))) - 1;
        int i15 = a;
        int i16 = (i15 & 115) + (i15 | 115);
        int i17 = i16 % 128;
        b = i17;
        int i18 = i16 % 2;
        this.h = i14;
        int i19 = this.f62o;
        int i20 = i19 ^ 1;
        int i21 = (i19 & 1) << 1;
        this.f62o = (i20 ^ i21) + ((i21 & i20) << 1);
        int i22 = (-2) - ((((i17 | 116) << 1) - (i17 ^ 116)) ^ (-1));
        a = i22 % 128;
        if (i22 % 2 != 0) {
            tVarD.f = i14;
            tVarD.h = i;
            eVar = this.q;
            int i23 = 22 / 0;
        } else {
            tVarD.f = i14;
            tVarD.h = i;
            eVar = this.q;
        }
        int i24 = b;
        int i25 = (((i24 | 3) << 1) - (~(-(((~i24) & 3) | (i24 & (-4)))))) - 1;
        a = i25 % 128;
        if (i25 % 2 != 0) {
            ((t[]) eVar.f)[i14] = tVarD;
            throw null;
        }
        ((t[]) eVar.f)[i14] = tVarD;
        aTI ati = this.i;
        int i26 = b;
        int i27 = i26 & 35;
        int i28 = i27 + ((i26 ^ 35) | i27);
        a = i28 % 128;
        int i29 = i28 % 2;
        ati.e(tVarD);
        int i30 = a;
        int i31 = i30 & 43;
        int i32 = ((i30 | 43) & (~i31)) + (i31 << 1);
        b = i32 % 128;
        if (i32 % 2 == 0) {
            int i33 = 43 / 0;
        }
        return tVarD;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:13:0x006e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0071  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x008f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0094  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:26:0x0108  */
    /* JADX WARN: Code duplicated, block: B:27:0x010d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public r p() {
        r atm;
        int i;
        int i2;
        long j;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 ^ 49;
        int i7 = (((i5 & 49) | i6) << 1) - i6;
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 != 0) {
            int i9 = 92 / 0;
            if (d) {
                int i10 = ((i8 ^ 104) + ((i8 & 104) << 1)) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                atm = (r) ((C0086p) this.q.c).c();
                int i12 = b;
                int i13 = ((i12 ^ 96) + ((i12 & 96) << 1)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                if (atm == null) {
                    atm = new aTM(this, this.q);
                    int i15 = b;
                    int i16 = (i15 & (-22)) | ((~i15) & 21);
                    int i17 = (i15 & 21) << 1;
                    i2 = (i16 ^ i17) + ((i17 & i16) << 1);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        j = 0;
                    } else {
                        j = e + 1;
                    }
                    e = j;
                } else {
                    atm.c = null;
                    atm.f.clear();
                    int i18 = a;
                    i = (((i18 | 122) << 1) - (i18 ^ 122)) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        atm.d = 2.0f;
                        atm.g = true;
                    } else {
                        atm.d = 0.0f;
                        atm.g = false;
                    }
                    int i19 = a;
                    int i20 = ((((i19 ^ 91) | (i19 & 91)) << 1) - (~(-(((~i19) & 91) | (i19 & (-92)))))) - 1;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                }
            } else {
                Object objC = ((C0086p) this.q.d).c();
                int i22 = a + 117;
                b = i22 % 128;
                int i23 = i22 % 2;
                atm = (r) objC;
                if (atm == null) {
                    atm = new r(this.q);
                    long j2 = f;
                    int i24 = b;
                    int i25 = i24 & 99;
                    int i26 = (((i24 ^ 99) | i25) << 1) - ((~i25) & (i24 | 99));
                    a = i26 % 128;
                    int i27 = i26 % 2;
                    f = j2 + 1;
                    int i28 = ((i24 & 118) + (i24 | 118)) - 1;
                    a = i28 % 128;
                    int i29 = i28 % 2;
                } else {
                    atm.c = null;
                    atm.f.clear();
                    int i30 = b;
                    i3 = ((i30 & 30) + (i30 | 30)) - 1;
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        atm.d = 2.0f;
                        atm.g = true;
                    } else {
                        atm.d = 0.0f;
                        atm.g = false;
                    }
                }
            }
        } else if (d) {
            int i110 = ((i8 ^ 104) + ((i8 & 104) << 1)) - 1;
            b = i110 % 128;
            int i111 = i110 % 2;
            atm = (r) ((C0086p) this.q.c).c();
            int i112 = b;
            int i113 = ((i112 ^ 96) + ((i112 & 96) << 1)) - 1;
            a = i113 % 128;
            int i114 = i113 % 2;
            if (atm == null) {
                atm = new aTM(this, this.q);
                int i115 = b;
                int i116 = (i115 & (-22)) | ((~i115) & 21);
                int i117 = (i115 & 21) << 1;
                i2 = (i116 ^ i117) + ((i117 & i116) << 1);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    j = 0;
                } else {
                    j = e + 1;
                }
                e = j;
            } else {
                atm.c = null;
                atm.f.clear();
                int i118 = a;
                i = (((i118 | 122) << 1) - (i118 ^ 122)) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    atm.d = 2.0f;
                    atm.g = true;
                } else {
                    atm.d = 0.0f;
                    atm.g = false;
                }
                int i119 = a;
                int i210 = ((((i119 ^ 91) | (i119 & 91)) << 1) - (~(-(((~i119) & 91) | (i119 & (-92)))))) - 1;
                b = i210 % 128;
                int i211 = i210 % 2;
            }
        } else {
            Object objC2 = ((C0086p) this.q.d).c();
            int i212 = a + 117;
            b = i212 % 128;
            int i213 = i212 % 2;
            atm = (r) objC2;
            if (atm == null) {
                atm = new r(this.q);
                long j3 = f;
                int i214 = b;
                int i215 = i214 & 99;
                int i216 = (((i214 ^ 99) | i215) << 1) - ((~i215) & (i214 | 99));
                a = i216 % 128;
                int i217 = i216 % 2;
                f = j3 + 1;
                int i218 = ((i214 & 118) + (i214 | 118)) - 1;
                a = i218 % 128;
                int i219 = i218 % 2;
            } else {
                atm.c = null;
                atm.f.clear();
                int i31 = b;
                i3 = ((i31 & 30) + (i31 | 30)) - 1;
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    atm.d = 2.0f;
                    atm.g = true;
                } else {
                    atm.d = 0.0f;
                    atm.g = false;
                }
            }
        }
        int i32 = t.c;
        int i33 = i32 ^ 1;
        t.c = (((i32 & 1) | i33) << 1) - i33;
        int i34 = (-2) - ((a + 106) ^ (-1));
        b = i34 % 128;
        int i35 = i34 % 2;
        return atm;
    }

    public final t d(int i, String str) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 22) + ((i3 & 22) << 1)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Object objC = ((C0086p) this.q.e).c();
        int i6 = a + 42;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        t tVar = (t) objC;
        if (tVar == null) {
            tVar = new t(i);
            tVar.d = i;
            int i8 = a;
            int i9 = (i8 ^ 67) + ((i8 & 67) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        } else {
            tVar.e();
            tVar.d = i;
            int i11 = a;
            int i12 = i11 & 1;
            int i13 = (i11 | 1) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 2 % 5;
            }
        }
        int i17 = this.t;
        int i18 = c;
        if (i17 >= i18) {
            int i19 = a;
            int i20 = (-2) - (((i19 & 62) + (i19 | 62)) ^ (-1));
            b = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i18 * 2;
            c = i22;
            t[] tVarArr = this.r;
            int i23 = ((i19 & 32) + (i19 | 32)) - 1;
            b = i23 % 128;
            int i24 = i23 % 2;
            this.r = (t[]) Arrays.copyOf(tVarArr, i22);
            int i25 = a;
            int i26 = i25 & 59;
            int i27 = (i25 ^ 59) | i26;
            int i28 = (i26 & i27) + (i27 | i26);
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        t[] tVarArr2 = this.r;
        int i30 = this.t;
        int i31 = i30 & 1;
        int i32 = ((i30 ^ 1) | i31) << 1;
        int i33 = -((~i31) & (i30 | 1));
        this.t = ((i32 | i33) << 1) - (i32 ^ i33);
        int i34 = b;
        int i35 = i34 & 103;
        int i36 = i35 + ((i34 ^ 103) | i35);
        a = i36 % 128;
        int i37 = i36 % 2;
        tVarArr2[i30] = tVar;
        int i38 = i34 ^ 59;
        int i39 = ((i34 & 59) | i38) << 1;
        int i40 = -i38;
        int i41 = (i39 & i40) + (i40 | i39);
        a = i41 % 128;
        if (i41 % 2 == 0) {
            return tVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x0136  */
    public t n(Object obj) {
        int i;
        int i2;
        t tVar;
        int i3 = 2 % 2;
        int i4 = a + 65;
        int i5 = i4 % 128;
        b = i5;
        t tVar2 = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (obj == null) {
            int i6 = ((i5 & 90) + (i5 | 90)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            tVar2.hashCode();
            throw null;
        }
        int i7 = this.f62o;
        int i8 = (i7 ^ 2) + ((i7 & 2) << 1);
        if ((i8 ^ (-1)) + (i8 << 1) >= this.k) {
            int i9 = i5 + 3;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                r();
                tVar2.hashCode();
                throw null;
            }
            r();
            int i10 = a;
            int i11 = i10 & 107;
            int i12 = (i11 - (~((i10 ^ 107) | i11))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        if (obj instanceof N) {
            int i14 = b;
            int i15 = ((((i14 ^ 119) | (i14 & 119)) << 1) - (~(-(((~i14) & 119) | (i14 & (-120)))))) - 1;
            a = i15 % 128;
            if (i15 % 2 != 0) {
                t tVar3 = ((N) obj).i;
                tVar2.hashCode();
                throw null;
            }
            N n = (N) obj;
            t tVar4 = n.i;
            if (tVar4 == null) {
                int i16 = b;
                int i17 = ((i16 | 25) << 1) - (i16 ^ 25);
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    n.g();
                    tVar = n.i;
                    int i18 = 34 / 0;
                } else {
                    n.g();
                    tVar = n.i;
                }
                tVar4 = tVar;
                int i19 = b + 120;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
            }
            int i22 = tVar4.f;
            if (i22 != -1) {
                int i23 = a;
                int i24 = i23 & 1;
                int i25 = ((i23 ^ 1) | i24) << 1;
                int i26 = -((~i24) & (i23 | 1));
                int i27 = (i25 & i26) + (i25 | i26);
                b = i27 % 128;
                if (i27 % 2 == 0) {
                    throw null;
                }
                if (i22 <= this.h) {
                    int i28 = ((i23 ^ 25) | (i23 & 25)) << 1;
                    int i29 = -((25 & (~i23)) | (i23 & (-26)));
                    int i30 = (i28 & i29) + (i29 | i28);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    if (((t[]) this.q.f)[i22] == null) {
                        if (i22 != -1) {
                            int i32 = b;
                            int i33 = ((i32 ^ 49) | (i32 & 49)) << 1;
                            int i34 = -(((~i32) & 49) | (i32 & (-50)));
                            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                            a = i35 % 128;
                            i2 = i35 % 2;
                            tVar4.e();
                            if (i2 != 0) {
                                tVar2.hashCode();
                                throw null;
                            }
                        }
                        int i36 = this.h;
                        int i37 = (((i36 ^ 1) | (i36 & 1)) << 1) - (((~i36) & 1) | (i36 & (-2)));
                        this.h = i37;
                        int i38 = b;
                        int i39 = i38 & 57;
                        int i40 = -(-(i38 | 57));
                        i = (i39 ^ i40) + ((i40 & i39) << 1);
                        a = i % 128;
                        if (i % 2 != 0) {
                            this.f62o = this.f62o;
                        } else {
                            int i41 = this.f62o;
                            this.f62o = (((i41 & (-2)) | ((~i41) & 1)) - (~((i41 & 1) << 1))) - 1;
                        }
                        tVar4.f = i37;
                        tVar4.d = 1;
                        e eVar = this.q;
                        int i42 = a;
                        int i43 = ((i42 ^ 58) + ((i42 & 58) << 1)) - 1;
                        b = i43 % 128;
                        int i44 = i43 % 2;
                        ((t[]) eVar.f)[i37] = tVar4;
                        int i45 = b;
                        int i46 = i45 & 35;
                        int i47 = -(-(i45 | 35));
                        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                        a = i48 % 128;
                        int i49 = i48 % 2;
                    }
                } else {
                    if (i22 != -1) {
                        int i310 = b;
                        int i311 = ((i310 ^ 49) | (i310 & 49)) << 1;
                        int i312 = -(((~i310) & 49) | (i310 & (-50)));
                        int i313 = ((i311 | i312) << 1) - (i312 ^ i311);
                        a = i313 % 128;
                        i2 = i313 % 2;
                        tVar4.e();
                        if (i2 != 0) {
                            tVar2.hashCode();
                            throw null;
                        }
                    }
                    int i314 = this.h;
                    int i315 = (((i314 ^ 1) | (i314 & 1)) << 1) - (((~i314) & 1) | (i314 & (-2)));
                    this.h = i315;
                    int i316 = b;
                    int i317 = i316 & 57;
                    int i410 = -(-(i316 | 57));
                    i = (i317 ^ i410) + ((i410 & i317) << 1);
                    a = i % 128;
                    if (i % 2 != 0) {
                        this.f62o = this.f62o;
                    } else {
                        int i411 = this.f62o;
                        this.f62o = (((i411 & (-2)) | ((~i411) & 1)) - (~((i411 & 1) << 1))) - 1;
                    }
                    tVar4.f = i315;
                    tVar4.d = 1;
                    e eVar2 = this.q;
                    int i412 = a;
                    int i413 = ((i412 ^ 58) + ((i412 & 58) << 1)) - 1;
                    b = i413 % 128;
                    int i414 = i413 % 2;
                    ((t[]) eVar2.f)[i315] = tVar4;
                    int i415 = b;
                    int i416 = i415 & 35;
                    int i417 = -(-(i415 | 35));
                    int i418 = ((i416 | i417) << 1) - (i417 ^ i416);
                    a = i418 % 128;
                    int i419 = i418 % 2;
                }
            } else {
                if (i22 != -1) {
                    int i318 = b;
                    int i319 = ((i318 ^ 49) | (i318 & 49)) << 1;
                    int i3110 = -(((~i318) & 49) | (i318 & (-50)));
                    int i3111 = ((i319 | i3110) << 1) - (i3110 ^ i319);
                    a = i3111 % 128;
                    i2 = i3111 % 2;
                    tVar4.e();
                    if (i2 != 0) {
                        tVar2.hashCode();
                        throw null;
                    }
                }
                int i3112 = this.h;
                int i3113 = (((i3112 ^ 1) | (i3112 & 1)) << 1) - (((~i3112) & 1) | (i3112 & (-2)));
                this.h = i3113;
                int i3114 = b;
                int i3115 = i3114 & 57;
                int i4110 = -(-(i3114 | 57));
                i = (i3115 ^ i4110) + ((i4110 & i3115) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    this.f62o = this.f62o;
                } else {
                    int i4111 = this.f62o;
                    this.f62o = (((i4111 & (-2)) | ((~i4111) & 1)) - (~((i4111 & 1) << 1))) - 1;
                }
                tVar4.f = i3113;
                tVar4.d = 1;
                e eVar3 = this.q;
                int i4112 = a;
                int i4113 = ((i4112 ^ 58) + ((i4112 & 58) << 1)) - 1;
                b = i4113 % 128;
                int i4114 = i4113 % 2;
                ((t[]) eVar3.f)[i3113] = tVar4;
                int i4115 = b;
                int i4116 = i4115 & 35;
                int i4117 = -(-(i4115 | 35));
                int i4118 = ((i4116 | i4117) << 1) - (i4117 ^ i4116);
                a = i4118 % 128;
                int i4119 = i4118 % 2;
            }
            tVar2 = tVar4;
        }
        int i50 = a;
        int i51 = ((i50 & (-52)) | ((~i50) & 51)) + ((i50 & 51) << 1);
        b = i51 % 128;
        if (i51 % 2 == 0) {
            int i52 = 33 / 0;
        }
        return tVar2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:122:0x0346  */
    /* JADX WARN: Code duplicated, block: B:162:0x049c  */
    /* JADX WARN: Code duplicated, block: B:164:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:166:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:169:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0264  */
    /* JADX WARN: Code duplicated, block: B:84:0x0271  */
    /* JADX WARN: Code duplicated, block: B:86:0x0277  */
    /* JADX WARN: Code duplicated, block: B:89:0x0287  */
    /* JADX WARN: Code duplicated, block: B:92:0x029d  */
    public void f(r rVar) {
        boolean z;
        boolean z2;
        t tVarD;
        boolean zL;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (i6 & 115) + (i6 | 115);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        int i10 = this.g;
        int i11 = ((i10 ^ 1) | (i10 & 1)) << 1;
        int i12 = -(((~i10) & 1) | (i10 & (-2)));
        if ((i11 & i12) + (i12 | i11) < this.p) {
            int i13 = (i8 ^ 65) + ((i8 & 65) << 1);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = this.f62o;
                if ((i14 ^ (-1)) + (i14 << 1) >= this.k) {
                    r();
                }
            } else {
                int i15 = this.f62o;
                if (((i15 & (-2)) | ((~i15) & 1)) + ((i15 & 1) << 1) >= this.k) {
                    r();
                }
            }
        } else {
            r();
        }
        if (rVar.g) {
            int i16 = b;
            int i17 = i16 & 117;
            int i18 = -(-((i16 ^ 117) | i17));
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            int i20 = i19 % 2;
        } else {
            int i21 = b;
            int i22 = (-2) - ((i21 + 106) ^ (-1));
            a = i22 % 128;
            int i23 = i22 % 2;
            Object obj = null;
            if (this.m.length != 0) {
                int i24 = (i21 & 83) + (i21 | 83);
                a = i24 % 128;
                int i25 = i24 % 2;
                boolean z3 = false;
                while (!z3) {
                    int i26 = rVar.f.i();
                    int i27 = b;
                    int i28 = ((i27 ^ 59) - (~(-(-((i27 & 59) << 1))))) - 1;
                    a = i28 % 128;
                    if (i28 % 2 != 0) {
                        throw null;
                    }
                    int i29 = 0;
                    while (i29 < i26) {
                        int i30 = b;
                        int i31 = i30 ^ 111;
                        int i32 = (i30 & 111) << 1;
                        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                        t tVarA = rVar.f.a(i29);
                        if (tVarA.g == -1) {
                            int i35 = a;
                            int i36 = ((i35 | 13) << 1) - (i35 ^ 13);
                            b = i36 % 128;
                            int i37 = i36 % 2;
                            if (tVarA.i) {
                                rVar.e.add(tVarA);
                            }
                        } else {
                            rVar.e.add(tVarA);
                        }
                        int i38 = i29 ^ 95;
                        int i39 = ((i29 & 95) | i38) << 1;
                        int i40 = -i38;
                        int i41 = ((i39 ^ i40) + ((i39 & i40) << 1)) - 93;
                        i29 = (i41 ^ (-1)) + (i41 << 1);
                    }
                    if (rVar.e.size() > 0) {
                        int i42 = b;
                        int i43 = (i42 & 39) + (i42 | 39);
                        a = i43 % 128;
                        if (i43 % 2 != 0) {
                            rVar.e.iterator();
                            obj.hashCode();
                            throw null;
                        }
                        for (t tVar : rVar.e) {
                            int i44 = b + 105;
                            a = i44 % 128;
                            int i45 = i44 % 2;
                            int i46 = a + 99;
                            b = i46 % 128;
                            if (i46 % 2 == 0) {
                                int i47 = 44 / 0;
                                if (tVar.i) {
                                    rVar.n(tVar, true);
                                } else {
                                    r rVar2 = this.m[tVar.g];
                                    int i48 = b;
                                    int i49 = i48 & 75;
                                    int i50 = ((i48 ^ 75) | i49) << 1;
                                    int i51 = -((i48 | 75) & (~i49));
                                    int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                                    a = i52 % 128;
                                    int i53 = i52 % 2;
                                    rVar.o(rVar2, true);
                                }
                            } else if (!tVar.i) {
                                r rVar3 = this.m[tVar.g];
                                int i410 = b;
                                int i411 = i410 & 75;
                                int i54 = ((i410 ^ 75) | i411) << 1;
                                int i55 = -((i410 | 75) & (~i411));
                                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                                a = i56 % 128;
                                int i57 = i56 % 2;
                                rVar.o(rVar3, true);
                            } else {
                                rVar.n(tVar, true);
                            }
                        }
                        rVar.e.clear();
                    } else {
                        int i58 = a + 83;
                        b = i58 % 128;
                        int i59 = i58 % 2;
                        z3 = true;
                    }
                }
            }
            if (rVar.c == null) {
                int i60 = a;
                int i61 = ((i60 & 104) + (i60 | 104)) - 1;
                b = i61 % 128;
                int i62 = i61 % 2;
                if (rVar.d == 0.0f) {
                    int i63 = a;
                    int i64 = (i63 ^ 57) + ((i63 & 57) << 1);
                    b = i64 % 128;
                    int i65 = i64 % 2;
                    if (rVar.f.i() == 0) {
                        int i66 = b;
                        int i67 = (i66 ^ 119) + ((i66 & 119) << 1);
                        a = i67 % 128;
                        int i68 = i67 % 2;
                        return;
                    }
                }
            }
            float f2 = rVar.d;
            if (f2 < 0.0f) {
                int i69 = b;
                int i70 = ((i69 ^ 85) | (i69 & 85)) << 1;
                int i71 = -(((~i69) & 85) | (i69 & (-86)));
                int i72 = (i70 & i71) + (i71 | i70);
                a = i72 % 128;
                int i73 = i72 % 2;
                rVar.d = f2 * (-1.0f);
                rVar.f.o();
            }
            int i74 = rVar.f.i();
            int i75 = a;
            int i76 = i75 & 47;
            int i77 = ((i75 ^ 47) | i76) << 1;
            int i78 = -((~i76) & (i75 | 47));
            int i79 = (i77 ^ i78) + ((i77 & i78) << 1);
            b = i79 % 128;
            int i80 = i79 % 2;
            int i81 = i75 & 117;
            int i82 = -(-((i75 ^ 117) | i81));
            int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
            b = i83 % 128;
            int i84 = i83 % 2;
            float f3 = 0.0f;
            float f4 = 0.0f;
            int i85 = 0;
            boolean z4 = false;
            boolean z5 = false;
            t tVar2 = null;
            t tVar3 = null;
            while (i85 < i74) {
                int i86 = a;
                int i87 = i86 & 55;
                int i88 = (i87 - (~(-(-((i86 ^ 55) | i87))))) - 1;
                b = i88 % 128;
                if (i88 % 2 == 0) {
                    rVar.f.b(i85);
                    throw null;
                }
                float fB = rVar.f.b(i85);
                t tVarA2 = rVar.f.a(i85);
                int i89 = tVarA2.d;
                int i90 = b;
                int i91 = (i90 & 117) + (i90 | 117);
                int i92 = i91 % 128;
                a = i92;
                int i93 = i91 % 2;
                if (i89 == 1) {
                    int i94 = i90 + 49;
                    int i95 = i94 % 128;
                    a = i95;
                    int i96 = i94 % 2;
                    if (tVar2 != null && f3 <= fB) {
                        int i97 = i95 + 67;
                        b = i97 % 128;
                        if (i97 % 2 == 0) {
                            int i98 = 61 / 0;
                            if (z4) {
                                continue;
                            } else {
                                int i99 = i95 + 38;
                                i2 = (i99 ^ (-1)) + (i99 << 1);
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    rVar.l(tVarA2);
                                    throw null;
                                }
                                if (rVar.l(tVarA2)) {
                                    z4 = true;
                                    int i100 = a;
                                    i3 = ((i100 | 21) << 1) - (i100 ^ 21);
                                    b = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        int i101 = 54 / 0;
                                    }
                                    int i102 = i100 & 101;
                                    i4 = (((i100 ^ 101) | i102) << 1) - ((i100 | 101) & (~i102));
                                    b = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        int i103 = 5 % 4;
                                    }
                                    f3 = fB;
                                    tVar2 = tVarA2;
                                }
                            }
                        } else if (!(!z4)) {
                            continue;
                        } else {
                            int i910 = i95 + 38;
                            i2 = (i910 ^ (-1)) + (i910 << 1);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                rVar.l(tVarA2);
                                throw null;
                            }
                            if (rVar.l(tVarA2)) {
                                z4 = true;
                                int i104 = a;
                                i3 = ((i104 | 21) << 1) - (i104 ^ 21);
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    int i105 = 54 / 0;
                                }
                                int i106 = i104 & 101;
                                i4 = (((i104 ^ 101) | i106) << 1) - ((i104 | 101) & (~i106));
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i107 = 5 % 4;
                                }
                                f3 = fB;
                                tVar2 = tVarA2;
                            }
                        }
                    } else {
                        boolean zL2 = rVar.l(tVarA2);
                        z4 = zL2;
                        int i108 = a;
                        i3 = ((i108 | 21) << 1) - (i108 ^ 21);
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i109 = 54 / 0;
                        }
                        int i1010 = i108 & 101;
                        i4 = (((i108 ^ 101) | i1010) << 1) - ((i108 | 101) & (~i1010));
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i1011 = 5 % 4;
                        }
                        f3 = fB;
                        tVar2 = tVarA2;
                    }
                } else {
                    int i110 = i92 & 1;
                    int i111 = i110 + ((i92 ^ 1) | i110);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    if (tVar2 == null) {
                        int i113 = i92 & 121;
                        int i114 = ((i92 | 121) & (~i113)) + (i113 << 1);
                        int i115 = i114 % 128;
                        b = i115;
                        if (i114 % 2 == 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (fB >= 0.0f) {
                            continue;
                        } else {
                            if (tVar3 == null) {
                                zL = rVar.l(tVarA2);
                            } else if (f4 > fB) {
                                int i116 = (i115 ^ 84) + ((i115 & 84) << 1);
                                int i117 = (i116 ^ (-1)) + (i116 << 1);
                                a = i117 % 128;
                                if (i117 % 2 != 0) {
                                    rVar.l(tVarA2);
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                zL = rVar.l(tVarA2);
                            } else {
                                int i118 = i115 ^ 7;
                                int i119 = (i115 & 7) << 1;
                                int i120 = (i118 & i119) + (i119 | i118);
                                int i121 = i120 % 128;
                                a = i121;
                                int i122 = i120 % 2;
                                if (z5) {
                                    continue;
                                } else {
                                    int i123 = i121 & 105;
                                    int i124 = (i123 - (~((i121 ^ 105) | i123))) - 1;
                                    b = i124 % 128;
                                    int i125 = i124 % 2;
                                    int i126 = ((i121 | 51) << 1) - (((~i121) & 51) | (i121 & (-52)));
                                    b = i126 % 128;
                                    if (i126 % 2 == 0) {
                                        rVar.l(tVarA2);
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    if (rVar.l(tVarA2)) {
                                        z5 = true;
                                        int i127 = a;
                                        int i128 = i127 & 47;
                                        int i129 = ((i127 ^ 47) | i128) << 1;
                                        int i130 = -((i127 | 47) & (~i128));
                                        i = ((i129 | i130) << 1) - (i130 ^ i129);
                                        int i131 = i % 128;
                                        b = i131;
                                        if (i % 2 == 0) {
                                            int i132 = 19 / 0;
                                        }
                                        int i133 = i131 + 61;
                                        a = i133 % 128;
                                        int i134 = i133 % 2;
                                        f4 = fB;
                                        tVar3 = tVarA2;
                                    }
                                }
                            }
                            z5 = zL;
                            int i1210 = a;
                            int i1211 = i1210 & 47;
                            int i1212 = ((i1210 ^ 47) | i1211) << 1;
                            int i135 = -((i1210 | 47) & (~i1211));
                            i = ((i1212 | i135) << 1) - (i135 ^ i1212);
                            int i136 = i % 128;
                            b = i136;
                            if (i % 2 == 0) {
                                int i137 = 19 / 0;
                            }
                            int i138 = i136 + 61;
                            a = i138 % 128;
                            int i139 = i138 % 2;
                            f4 = fB;
                            tVar3 = tVarA2;
                        }
                    } else {
                        continue;
                    }
                }
                int i140 = i85 & 1;
                int i141 = (~i140) & (i85 | 1);
                int i142 = i140 << 1;
                i85 = (i141 & i142) + (i142 | i141);
                int i143 = b;
                int i144 = ((i143 & 115) - (~(-(-(i143 | 115))))) - 1;
                a = i144 % 128;
                int i145 = i144 % 2;
            }
            if (tVar2 == null) {
                int i146 = a;
                int i147 = i146 & 15;
                int i148 = (i146 ^ 15) | i147;
                int i149 = ((i147 | i148) << 1) - (i147 ^ i148);
                b = i149 % 128;
                if (i149 % 2 == 0) {
                    throw null;
                }
                int i150 = i146 ^ 89;
                int i151 = -(-((i146 & 89) << 1));
                int i152 = (i150 ^ i151) + ((i151 & i150) << 1);
                b = i152 % 128;
                int i153 = i152 % 2;
                tVar2 = tVar3;
            }
            if (tVar2 == null) {
                z = true;
            } else {
                rVar.m(tVar2);
                z = false;
            }
            if (rVar.f.i() == 0) {
                rVar.g = true;
            }
            if (z) {
                int i154 = this.f62o;
                if ((((i154 | 2) << 1) - (i154 ^ 2)) - 1 >= this.k) {
                    r();
                }
                t tVarD2 = d(3, null);
                int i155 = this.h;
                int i156 = i155 & 1;
                int i157 = i156 + ((i155 ^ 1) | i156);
                this.h = i157;
                int i158 = this.f62o;
                int i159 = i158 & 1;
                this.f62o = (((i158 | 1) & (~i159)) - (~(i159 << 1))) - 1;
                tVarD2.f = i157;
                int i160 = b;
                int i161 = (i160 & 29) + (i160 | 29);
                a = i161 % 128;
                int i162 = i161 % 2;
                t[] tVarArr = (t[]) this.q.f;
                int i163 = a;
                int i164 = i163 & 101;
                int i165 = (i163 | 101) & (~i164);
                int i166 = -(-(i164 << 1));
                int i167 = ((i165 | i166) << 1) - (i165 ^ i166);
                b = i167 % 128;
                if (i167 % 2 == 0) {
                    Object obj5 = null;
                    tVarArr[i157] = tVarD2;
                    rVar.c = tVarD2;
                    c(rVar);
                    obj5.hashCode();
                    throw null;
                }
                tVarArr[i157] = tVarD2;
                rVar.c = tVarD2;
                c(rVar);
                r rVar4 = (r) this.s;
                Objects.requireNonNull(rVar4);
                int i168 = b;
                int i169 = ((i168 & 59) - (~(i168 | 59))) - 1;
                a = i169 % 128;
                if (i169 % 2 != 0) {
                    rVar4.c = null;
                    rVar4.f.clear();
                    throw null;
                }
                rVar4.c = null;
                rVar4.f.clear();
                for (int i170 = 0; i170 < rVar.f.i(); i170++) {
                    int i171 = a;
                    int i172 = (i171 | 9) << 1;
                    int i173 = -(i171 ^ 9);
                    int i174 = (i172 ^ i173) + ((i173 & i172) << 1);
                    b = i174 % 128;
                    int i175 = i174 % 2;
                    rVar4.f.f(rVar.f.a(i170), rVar.f.b(i170), true);
                }
                s(this.s);
                int i176 = b;
                int i177 = ((i176 & (-82)) | ((~i176) & 81)) + ((i176 & 81) << 1);
                a = i177 % 128;
                if (i177 % 2 != 0) {
                    int i178 = 92 / 0;
                    if (tVarD2.g == -1) {
                        if (rVar.c == tVarD2) {
                            int i179 = a;
                            int i180 = i179 & 113;
                            int i181 = -(-((i179 ^ 113) | i180));
                            int i182 = ((i180 | i181) << 1) - (i181 ^ i180);
                            b = i182 % 128;
                            int i183 = i182 % 2;
                            tVarD = rVar.d(null, tVarD2);
                            if (tVarD != null) {
                                rVar.m(tVarD);
                            }
                        }
                        if (!rVar.g) {
                            rVar.c.g(rVar);
                        }
                        this.g--;
                    }
                } else if (tVarD2.g == -1) {
                    if (rVar.c == tVarD2) {
                        int i1710 = a;
                        int i184 = i1710 & 113;
                        int i185 = -(-((i1710 ^ 113) | i184));
                        int i186 = ((i184 | i185) << 1) - (i185 ^ i184);
                        b = i186 % 128;
                        int i187 = i186 % 2;
                        tVarD = rVar.d(null, tVarD2);
                        if (tVarD != null) {
                            rVar.m(tVarD);
                        }
                    }
                    if (!rVar.g) {
                        rVar.c.g(rVar);
                    }
                    this.g--;
                }
                z2 = true;
            } else {
                int i188 = a;
                int i189 = i188 & 123;
                int i190 = i189 + ((i188 ^ 123) | i189);
                b = i190 % 128;
                int i191 = i190 % 2;
                z2 = false;
            }
            t tVar4 = rVar.c;
            if (tVar4 == null) {
                return;
            }
            int i192 = b;
            int i193 = (i192 & 107) + (i192 | 107);
            a = i193 % 128;
            int i194 = i193 % 2;
            if (tVar4.d != 1) {
                int i195 = a;
                int i196 = (-2) - ((-1) ^ ((i195 & 98) + (i195 | 98)));
                b = i196 % 128;
                int i197 = i196 % 2;
                if (rVar.d < 0.0f) {
                    return;
                }
                int i198 = a;
                int i199 = i198 & 77;
                int i200 = (~i199) & (i198 | 77);
                int i201 = i199 << 1;
                int i202 = ((i200 | i201) << 1) - (i201 ^ i200);
                b = i202 % 128;
                int i203 = i202 % 2;
                int i204 = i198 & 79;
                int i205 = (i198 ^ 79) | i204;
                int i206 = (i204 ^ i205) + ((i205 & i204) << 1);
                b = i206 % 128;
                int i207 = i206 % 2;
            }
            if (z2) {
                return;
            }
        }
        int i208 = b;
        int i209 = ((i208 ^ 119) | (i208 & 119)) << 1;
        int i210 = -(((~i208) & 119) | (i208 & (-120)));
        int i211 = ((i209 | i210) << 1) - (i210 ^ i209);
        a = i211 % 128;
        int i212 = i211 % 2;
        c(rVar);
        int i213 = b;
        int i214 = ((i213 | 24) << 1) - (i213 ^ 24);
        int i215 = (i214 ^ (-1)) + (i214 << 1);
        a = i215 % 128;
        int i216 = i215 % 2;
    }

    public void i(t tVar, int i) {
        int i2 = 2 % 2;
        int i3 = a + 107;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = tVar.g;
        if (i5 == -1) {
            int i6 = b + 123;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                tVar.f(this, i);
                return;
            } else {
                tVar.f(this, i);
                throw null;
            }
        }
        if (i5 == -1) {
            r rVarP = p();
            rVarP.c = tVar;
            float f2 = i;
            int i7 = b;
            int i8 = i7 & 97;
            int i9 = (i7 | 97) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 & i10) + (i9 | i10);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                tVar.j = f2;
            } else {
                tVar.j = f2;
            }
            rVarP.d = f2;
            rVarP.g = true;
            f(rVarP);
            int i12 = b;
            int i13 = (i12 & 87) + (i12 | 87);
            a = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        int i15 = b;
        int i16 = i15 & 57;
        int i17 = (i16 - (~((i15 ^ 57) | i16))) - 1;
        a = i17 % 128;
        int i18 = i17 % 2;
        r rVar = this.m[i5];
        if (rVar.g) {
            int i19 = b + 65;
            a = i19 % 128;
            if (i19 % 2 == 0) {
                rVar.d = i;
                return;
            } else {
                rVar.d = i;
                int i20 = 10 / 0;
                return;
            }
        }
        if (rVar.f.i() == 0) {
            int i21 = a;
            int i22 = i21 ^ 55;
            int i23 = ((((i21 & 55) | i22) << 1) - (~(-i22))) - 1;
            b = i23 % 128;
            int i24 = i23 % 2;
            rVar.g = true;
            rVar.d = i;
            int i25 = b;
            int i26 = ((i25 | 101) << 1) - (i25 ^ 101);
            a = i26 % 128;
            int i27 = i26 % 2;
            return;
        }
        r rVarP2 = p();
        if (i < 0) {
            int i28 = b;
            int i29 = i28 & 25;
            int i30 = ((i28 | 25) & (~i29)) + (i29 << 1);
            a = i30 % 128;
            rVarP2.d = i30 % 2 != 0 ? i >>> (-1) : i * (-1);
            r.aTJ atj = rVarP2.f;
            int i31 = a;
            int i32 = i31 & 95;
            int i33 = i31 | 95;
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            b = i34 % 128;
            int i35 = i34 % 2;
            atj.d(tVar, 1.0f);
            int i36 = a;
            int i37 = (i36 | 91) << 1;
            int i38 = -(i36 ^ 91);
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            b = i39 % 128;
            if (i39 % 2 == 0) {
                int i40 = 5 / 2;
            }
        } else {
            rVarP2.d = i;
            r.aTJ atj2 = rVarP2.f;
            int i41 = a;
            int i42 = i41 & 107;
            int i43 = i41 | 107;
            int i44 = (i42 & i43) + (i43 | i42);
            b = i44 % 128;
            if (i44 % 2 == 0) {
                atj2.d(tVar, -1.0f);
                int i45 = 40 / 0;
            } else {
                atj2.d(tVar, -1.0f);
            }
            int i46 = a;
            int i47 = i46 & 79;
            int i48 = i46 | 79;
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            b = i49 % 128;
            if (i49 % 2 == 0) {
                int i50 = 2 % 4;
            }
        }
        f(rVarP2);
        int i51 = b;
        int i52 = (i51 & (-124)) | ((~i51) & 123);
        int i53 = -(-((i51 & 123) << 1));
        int i54 = (i52 & i53) + (i53 | i52);
        a = i54 % 128;
        if (i54 % 2 != 0) {
            throw null;
        }
    }

    public final int s(aTI ati) {
        int i;
        int i2;
        t tVar;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 43) | (i4 & 43)) << 1;
        int i6 = -(((~i4) & 43) | (i4 & (-44)));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = 0;
        int i9 = i7 % 2 == 0 ? 1 : 0;
        while (i9 < this.f62o) {
            int i10 = b;
            int i11 = (i10 ^ 59) + ((i10 & 59) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            this.n[i9] = false;
            int i13 = i9 & 27;
            int i14 = i9 | 27;
            int i15 = ((i13 ^ i14) + ((i14 & i13) << 1)) - 25;
            i9 = (i15 ^ (-1)) + (i15 << 1);
            int i16 = i10 & 3;
            int i17 = (i10 | 3) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = (i17 & i18) + (i17 | i18);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = a;
        int i22 = i21 & 79;
        int i23 = -(-((i21 ^ 79) | i22));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
        boolean z = false;
        int i26 = 0;
        while (true) {
            Object obj = null;
            if (!(!z)) {
                int i27 = a;
                int i28 = i27 & 69;
                int i29 = ((((i27 ^ 69) | i28) << 1) - (~(-((i27 | 69) & (~i28))))) - 1;
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    return i26;
                }
                obj.hashCode();
                throw null;
            }
            int i30 = b;
            int i31 = i30 & 75;
            int i32 = i30 | 75;
            int i33 = (i31 & i32) + (i32 | i31);
            int i34 = i33 % 128;
            a = i34;
            int i35 = -1;
            if (i33 % 2 != 0) {
                i26 = (-2) - ((i26 + 1) ^ (-1));
                i = this.f62o;
            } else {
                int i36 = (i26 & (-2)) | ((~i26) & 1);
                int i37 = -(-((i26 & 1) << 1));
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                i = this.f62o;
                i26 = i38;
            }
            int i39 = i34 & 17;
            int i40 = (i34 | 17) & (~i39);
            int i41 = i39 << 1;
            int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
            int i43 = i42 % 128;
            b = i43;
            int i44 = i42 % 2;
            if (i26 >= i * 2) {
                int i45 = i43 & 15;
                int i46 = (i45 - (~(-(-((i43 ^ 15) | i45))))) - 1;
                int i47 = i46 % 128;
                a = i47;
                int i48 = i46 % 2;
                int i49 = ((i47 | 91) << 1) - (i47 ^ 91);
                b = i49 % 128;
                if (i49 % 2 != 0) {
                    return i26;
                }
                obj.hashCode();
                throw null;
            }
            t tVar2 = ((r) ati).c;
            if (tVar2 != null) {
                int i50 = a;
                int i51 = (i50 ^ 81) + ((i50 & 81) << 1);
                b = i51 % 128;
                if (i51 % 2 == 0) {
                    this.n[tVar2.f] = true;
                } else {
                    this.n[tVar2.f] = true;
                }
            }
            t tVarB = ati.b(this, this.n);
            if (tVarB != null) {
                int i52 = a;
                int i53 = i52 & 121;
                int i54 = (((i52 ^ 121) | i53) << 1) - ((i52 | 121) & (~i53));
                b = i54 % 128;
                int i55 = i54 % 2;
                boolean[] zArr = this.n;
                int i56 = tVarB.f;
                int i57 = a;
                int i58 = ((i57 ^ 41) | (i57 & 41)) << 1;
                int i59 = -((i57 & (-42)) | (41 & (~i57)));
                int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
                b = i60 % 128;
                int i61 = i60 % 2;
                if (zArr[i56]) {
                    int i62 = i57 + 77;
                    int i63 = i62 % 128;
                    b = i63;
                    int i64 = i62 % 2;
                    int i65 = (((i63 ^ 37) | (i63 & 37)) << 1) - (((~i63) & 37) | (i63 & (-38)));
                    a = i65 % 128;
                    int i66 = i65 % 2;
                    return i26;
                }
                zArr[i56] = true;
                int i67 = (i57 ^ 69) + ((i57 & 69) << 1);
                b = i67 % 128;
                int i68 = i67 % 2;
            }
            if (tVarB != null) {
                int i69 = a;
                int i70 = i69 & 23;
                int i71 = ((i69 ^ 23) | i70) << 1;
                int i72 = -((i69 | 23) & (~i70));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                int i74 = i73 % 128;
                b = i74;
                int i75 = i73 % 2;
                int i76 = (i74 & (-102)) | ((~i74) & 101);
                int i77 = -(-((i74 & 101) << 1));
                int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                a = i78 % 128;
                int i79 = i78 % 2;
                float f2 = Float.MAX_VALUE;
                int i80 = i8;
                int i81 = -1;
                while (i80 < this.g) {
                    int i82 = a + 53;
                    b = i82 % 128;
                    if (i82 % 2 == 0) {
                        int i83 = this.m[i80].c.d;
                        throw null;
                    }
                    r rVar = this.m[i80];
                    if (rVar.c.d == 1) {
                        int i84 = b;
                        int i85 = (((i84 | 22) << 1) - (i84 ^ 22)) + i35;
                        a = i85 % 128;
                        if (i85 % 2 != 0) {
                            int i86 = 55 / i8;
                        }
                    } else if (rVar.g) {
                        int i87 = b;
                        int i88 = (i87 ^ 70) + ((i87 & 70) << 1) + i35;
                        int i89 = i88 % 128;
                        a = i89;
                        int i90 = i88 % 2;
                        int i91 = ((((i89 ^ 67) | (i89 & 67)) << 1) - (~(-(((~i89) & 67) | (i89 & (-68)))))) - 1;
                        b = i91 % 128;
                        int i92 = i91 % 2;
                    } else {
                        r.aTJ atj = rVar.f;
                        int i93 = a + 15;
                        b = i93 % 128;
                        if (i93 % 2 == 0) {
                            atj.c(tVarB);
                            obj.hashCode();
                            throw null;
                        }
                        if (!(!atj.c(tVarB))) {
                            float fE = rVar.f.e(tVarB);
                            int i94 = a;
                            int i95 = (i94 & 61) + (i94 | 61);
                            b = i95 % 128;
                            float f3 = i95 % 2 == 0 ? 2.0f : 0.0f;
                            int i96 = i94 & 65;
                            int i97 = (i94 ^ 65) | i96;
                            int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                            int i99 = i98 % 128;
                            b = i99;
                            int i100 = i98 % 2;
                            if (fE < f3) {
                                int i101 = i99 & 25;
                                int i102 = (i101 - (~((i99 ^ 25) | i101))) - 1;
                                a = i102 % 128;
                                int i103 = i102 % 2;
                                float f4 = (-rVar.d) / fE;
                                if (f4 < f2) {
                                    int i104 = b;
                                    int i105 = ((i104 & (-50)) | ((~i104) & 49)) + ((i104 & 49) << 1);
                                    a = i105 % 128;
                                    int i106 = i105 % 2;
                                    int i107 = i104 ^ 101;
                                    int i108 = (i104 & 101) << 1;
                                    int i109 = (i107 & i108) + (i108 | i107);
                                    a = i109 % 128;
                                    if (i109 % 2 != 0) {
                                        int i110 = 3 % 4;
                                    }
                                    f2 = f4;
                                    i81 = i80;
                                }
                            }
                        }
                    }
                    i80++;
                    int i111 = b;
                    int i112 = i111 & 101;
                    int i113 = ((((i111 ^ 101) | i112) << 1) - (~(-((i111 | 101) & (~i112))))) - 1;
                    a = i113 % 128;
                    int i114 = i113 % 2;
                    i8 = 0;
                    i35 = -1;
                }
                if (i81 >= 0) {
                    int i115 = a;
                    int i116 = i115 & 43;
                    int i117 = i116 + ((i115 ^ 43) | i116);
                    b = i117 % 128;
                    int i118 = i117 % 2;
                    r rVar2 = this.m[i81];
                    t tVar3 = rVar2.c;
                    int i119 = b;
                    int i120 = i119 ^ 89;
                    int i121 = -(-((i119 & 89) << 1));
                    int i122 = ((i120 | i121) << 1) - (i121 ^ i120);
                    a = i122 % 128;
                    if (i122 % 2 != 0) {
                        tVar3.g = -1;
                        rVar2.m(tVarB);
                        tVar = rVar2.c;
                        i2 = 0;
                        int i123 = 96 / 0;
                    } else {
                        i2 = 0;
                        tVar3.g = -1;
                        rVar2.m(tVarB);
                        tVar = rVar2.c;
                    }
                    int i124 = a;
                    int i125 = i124 | 27;
                    int i126 = ((i125 << 1) - (~(-((~(i124 & 27)) & i125)))) - 1;
                    b = i126 % 128;
                    if (i126 % 2 == 0) {
                        tVar.g = i81;
                        tVar.g(rVar2);
                        obj.hashCode();
                        throw null;
                    }
                    tVar.g = i81;
                    tVar.g(rVar2);
                    int i127 = b;
                    int i128 = ((i127 ^ 69) | (i127 & 69)) << 1;
                    int i129 = -(((~i127) & 69) | (i127 & (-70)));
                    int i130 = ((i128 | i129) << 1) - (i129 ^ i128);
                    a = i130 % 128;
                    int i131 = i130 % 2;
                } else {
                    i2 = 0;
                }
            } else {
                i2 = i8;
                int i132 = a;
                int i133 = i132 & 73;
                int i134 = -(-(i132 | 73));
                int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                b = i135 % 128;
                int i136 = i135 % 2;
                z = true;
            }
            i8 = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x02fe A[EDGE_INSN: B:121:0x02fe->B:76:0x02fe BREAK  A[LOOP:3: B:38:0x019b->B:75:0x02cc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x021e A[EDGE_INSN: B:122:0x021e->B:50:0x021e BREAK  A[LOOP:4: B:54:0x023a->B:74:0x02ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x021e A[EDGE_INSN: B:123:0x021e->B:50:0x021e BREAK  A[LOOP:4: B:54:0x023a->B:74:0x02ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:20:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:32:0x0137  */
    /* JADX WARN: Code duplicated, block: B:34:0x0157  */
    /* JADX WARN: Code duplicated, block: B:35:0x015c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0177  */
    /* JADX WARN: Code duplicated, block: B:40:0x01af  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x0215  */
    /* JADX WARN: Code duplicated, block: B:53:0x0227 A[PHI: r9
  0x0227: PHI (r9v43 float) = (r9v34 float), (r9v45 float) binds: [B:46:0x01eb, B:43:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0253  */
    /* JADX WARN: Code duplicated, block: B:59:0x0258  */
    /* JADX WARN: Code duplicated, block: B:63:0x0269  */
    /* JADX WARN: Code duplicated, block: B:66:0x0273  */
    /* JADX WARN: Code duplicated, block: B:68:0x027c A[PHI: r2
  0x027c: PHI (r2v91 float) = (r2v90 float), (r2v106 float) binds: [B:67:0x027a, B:64:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0291 A[PHI: r2
  0x0291: PHI (r2v103 float) = (r2v90 float), (r2v106 float) binds: [B:67:0x027a, B:64:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0295 A[PHI: r2
  0x0295: PHI (r2v101 float) = (r2v91 float), (r2v102 float) binds: [B:69:0x028e, B:72:0x0293] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x032d A[LOOP:2: B:22:0x00f2->B:78:0x032d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x034e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0375  */
    /* JADX WARN: Code duplicated, block: B:86:0x0381  */
    /* JADX WARN: Code duplicated, block: B:89:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:90:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:92:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x03da  */
    /* JADX WARN: Code duplicated, block: B:98:0x040e  */
    public void t(aTI ati) {
        float f2;
        boolean z;
        int i;
        int i2;
        int i3;
        float f3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        t tVar;
        int i10;
        Object obj;
        t tVar2;
        int i11;
        r rVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        t tVar3;
        int i17;
        float fE;
        int i18;
        int i19;
        r rVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        float f4;
        int i24;
        int i25 = 2;
        int i26 = 2 % 2;
        int i27 = a;
        int i28 = i27 + 12;
        int i29 = 1;
        int i30 = (i28 ^ (-1)) + (i28 << 1);
        b = i30 % 128;
        int i31 = i30 % 2;
        int i32 = 19;
        int i33 = (((i27 & (-20)) | ((~i27) & 19)) - (~(-(-((i27 & 19) << 1))))) - 1;
        b = i33 % 128;
        int i34 = i33 % 2;
        int i35 = 0;
        while (true) {
            if (i35 >= this.g) {
                int i36 = a;
                int i37 = (i36 ^ 25) + ((i36 & 25) << 1);
                b = i37 % 128;
                int i38 = i37 % 2;
                break;
            }
            int i39 = a;
            int i40 = ((i39 & 54) + (i39 | 54)) - i29;
            b = i40 % 128;
            if (i40 % 2 == 0) {
                int i41 = this.m[i35].c.d;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            r[] rVarArr = this.m;
            int i42 = rVarArr[i35].c.d;
            int i43 = a;
            int i44 = i43 & 39;
            int i45 = (i43 | 39) & (~i44);
            int i46 = -(-(i44 << i29));
            int i47 = (i45 ^ i46) + ((i45 & i46) << i29);
            b = i47 % 128;
            if (i47 % i25 == 0) {
                if (i42 != i29) {
                    f2 = 0.0f;
                    if (rVarArr[i35].d < 0.0f) {
                        int i48 = a;
                        int i49 = ((i48 ^ 125) - (~((i48 & 125) << i29))) - i29;
                        int i50 = i49 % 128;
                        b = i50;
                        int i51 = i49 % i25;
                        int i52 = i50 & 59;
                        int i53 = (((i50 ^ 59) | i52) << i29) - ((i50 | 59) & (~i52));
                        int i54 = i53 % 128;
                        a = i54;
                        int i55 = i53 % i25;
                        int i56 = i54 & 93;
                        int i57 = (i54 | 93) & (~i56);
                        int i58 = -(-(i56 << i29));
                        int i59 = (i57 ^ i58) + ((i57 & i58) << i29);
                        int i60 = i59 % 128;
                        b = i60;
                        int i61 = i59 % i25;
                        int i62 = i60 ^ 105;
                        int i63 = -(-((i60 & 105) << i29));
                        int i64 = (i62 & i63) + (i63 | i62);
                        a = i64 % 128;
                        int i65 = i64 % i25;
                        z = false;
                        i = 0;
                        while (!z) {
                            int i66 = b;
                            int i67 = i66 ^ 123;
                            int i68 = -(-((i66 & 123) << i29));
                            i2 = (i67 & i68) + (i68 | i67);
                            int i69 = i2 % 128;
                            a = i69;
                            if (i2 % i25 != 0) {
                                i = (i - (~((i ^ (-1)) | i))) - i29;
                            } else {
                                i = (i & 1) + (i | 1);
                            }
                            int i70 = i69 & 25;
                            int i71 = (i69 ^ 25) | i70;
                            int i72 = (i70 & i71) + (i70 | i71);
                            b = i72 % 128;
                            int i73 = i72 % i25;
                            int i74 = ((i69 & 46) + (i69 | 46)) - i29;
                            b = i74 % 128;
                            int i75 = i74 % i25;
                            i3 = -1;
                            f3 = Float.MAX_VALUE;
                            i4 = -1;
                            i5 = -1;
                            i6 = 0;
                            i7 = 0;
                            while (i6 < this.g) {
                                int i76 = a;
                                int i77 = (-2) - ((((i76 | 44) << 1) - (i76 ^ 44)) ^ (-1));
                                b = i77 % 128;
                                int i78 = i77 % i25;
                                rVar = this.m[i6];
                                int i79 = rVar.c.d;
                                int i80 = b;
                                i12 = (-2) - ((i80 + 76) ^ (-1));
                                a = i12 % 128;
                                if (i12 % i25 == 0 ? i79 == i29 : i79 == 0) {
                                    int i81 = (i80 & 113) + (i80 | 113);
                                    a = i81 % 128;
                                    int i82 = i81 % i25;
                                } else if (!rVar.g) {
                                    int i83 = a;
                                    int i84 = i83 & 71;
                                    int i85 = (i83 | 71) & (~i84);
                                    int i86 = -(-(i84 << 1));
                                    int i87 = (i85 & i86) + (i85 | i86);
                                    b = i87 % 128;
                                    int i88 = i87 % i25;
                                    if (rVar.d < f2) {
                                        int i89 = b;
                                        int i90 = i89 ^ 51;
                                        int i91 = ((i89 & 51) | i90) << i29;
                                        int i92 = -i90;
                                        int i93 = (i91 & i92) + (i91 | i92);
                                        int i94 = i93 % 128;
                                        a = i94;
                                        int i95 = i93 % i25;
                                        int i96 = (i94 & (-20)) | ((~i94) & i32);
                                        int i97 = (i94 & 19) << i29;
                                        int i98 = (i96 & i97) + (i97 | i96);
                                        b = i98 % 128;
                                        int i99 = i98 % i25;
                                        i15 = i29;
                                        while (true) {
                                            i16 = a;
                                            int i100 = i16 & 63;
                                            int i101 = (i100 - (~((i16 ^ 63) | i100))) - i29;
                                            b = i101 % 128;
                                            int i102 = i101 % i25;
                                            if (i15 >= this.f62o) {
                                                break;
                                            }
                                            int i103 = ((i16 & 125) - (~(i16 | 125))) - i29;
                                            b = i103 % 128;
                                            int i104 = i103 % i25;
                                            tVar3 = ((t[]) this.q.f)[i15];
                                            int i105 = b;
                                            int i106 = i105 ^ 67;
                                            int i107 = (i105 & 67) << i29;
                                            i17 = (i106 & i107) + (i107 | i106);
                                            a = i17 % 128;
                                            if (i17 % i25 != 0) {
                                                fE = rVar.f.e(tVar3);
                                                if (fE <= 2.0f) {
                                                    int i108 = a;
                                                    int i109 = i108 & 27;
                                                    int i110 = (((i108 ^ 27) | i109) << i29) - ((~i109) & (i108 | 27));
                                                    b = i110 % 128;
                                                    int i111 = i110 % i25;
                                                    int i112 = (i108 & (-16)) | ((~i108) & 15);
                                                    int i113 = (i108 & 15) << i29;
                                                    i18 = (i112 ^ i113) + ((i113 & i112) << i29);
                                                    i19 = i18 % 128;
                                                    b = i19;
                                                    if (i18 % i25 != 0) {
                                                        Object obj3 = null;
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                    int i114 = i19 + 21;
                                                    a = i114 % 128;
                                                    int i115 = i114 % i25;
                                                    rVar2 = rVar;
                                                } else {
                                                    int i116 = b;
                                                    int i117 = i116 & 65;
                                                    int i118 = (i117 - (~((i116 ^ 65) | i117))) - 1;
                                                    a = i118 % 128;
                                                    int i119 = i118 % i25;
                                                    i20 = 0;
                                                    while (true) {
                                                        i21 = a;
                                                        int i120 = (i21 ^ 118) + ((i21 & 118) << 1);
                                                        i22 = (i120 ^ (-1)) + (i120 << 1);
                                                        rVar2 = rVar;
                                                        b = i22 % 128;
                                                        if (i22 % i25 == 0) {
                                                            if (i20 >= 122) {
                                                                break;
                                                            }
                                                            int i121 = i21 & 85;
                                                            i23 = i121 + ((i21 ^ 85) | i121);
                                                            b = i23 % 128;
                                                            if (i23 % i25 == 0) {
                                                                f4 = tVar3.k[i20] - fE;
                                                                if (f4 < f3) {
                                                                    int i122 = a;
                                                                    int i123 = (i122 ^ 73) + ((i122 & 73) << 1);
                                                                    b = i123 % 128;
                                                                    int i124 = i123 % i25;
                                                                    if (i20 != i7) {
                                                                        int i125 = a;
                                                                        int i126 = i125 & 23;
                                                                        int i127 = (i125 ^ 23) | i126;
                                                                        int i128 = ((i126 | i127) << 1) - (i127 ^ i126);
                                                                        b = i128 % 128;
                                                                        int i129 = i128 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i1210 = a;
                                                                    int i1211 = i1210 & 23;
                                                                    int i1212 = (i1210 ^ 23) | i1211;
                                                                    int i1213 = ((i1211 | i1212) << 1) - (i1212 ^ i1211);
                                                                    b = i1213 % 128;
                                                                    int i1214 = i1213 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            } else {
                                                                f4 = tVar3.k[i20] / fE;
                                                                if (f4 < f3) {
                                                                    int i1215 = a;
                                                                    int i1216 = (i1215 ^ 73) + ((i1215 & 73) << 1);
                                                                    b = i1216 % 128;
                                                                    int i1217 = i1216 % i25;
                                                                    if (i20 != i7) {
                                                                        int i1218 = a;
                                                                        int i1219 = i1218 & 23;
                                                                        int i12110 = (i1218 ^ 23) | i1219;
                                                                        int i12111 = ((i1219 | i12110) << 1) - (i12110 ^ i1219);
                                                                        b = i12111 % 128;
                                                                        int i12112 = i12111 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i12113 = a;
                                                                    int i12114 = i12113 & 23;
                                                                    int i12115 = (i12113 ^ 23) | i12114;
                                                                    int i12116 = ((i12114 | i12115) << 1) - (i12115 ^ i12114);
                                                                    b = i12116 % 128;
                                                                    int i12117 = i12116 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            int i130 = i20 & 1;
                                                            int i131 = i20 | 1;
                                                            i20 = (i130 ^ i131) + ((i130 & i131) << 1);
                                                            int i132 = a;
                                                            int i133 = i132 & 27;
                                                            int i134 = ((~i133) & (i132 | 27)) + (i133 << 1);
                                                            b = i134 % 128;
                                                            int i135 = i134 % 2;
                                                            rVar = rVar2;
                                                            i25 = 2;
                                                        } else {
                                                            if (i20 >= 9) {
                                                                break;
                                                            }
                                                            int i1220 = i21 & 85;
                                                            i23 = i1220 + ((i21 ^ 85) | i1220);
                                                            b = i23 % 128;
                                                            if (i23 % i25 == 0) {
                                                                f4 = tVar3.k[i20] - fE;
                                                                if (f4 < f3) {
                                                                    int i12118 = a;
                                                                    int i12119 = (i12118 ^ 73) + ((i12118 & 73) << 1);
                                                                    b = i12119 % 128;
                                                                    int i12120 = i12119 % i25;
                                                                    if (i20 != i7) {
                                                                        int i121110 = a;
                                                                        int i121111 = i121110 & 23;
                                                                        int i121112 = (i121110 ^ 23) | i121111;
                                                                        int i121113 = ((i121111 | i121112) << 1) - (i121112 ^ i121111);
                                                                        b = i121113 % 128;
                                                                        int i121114 = i121113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i121115 = a;
                                                                    int i121116 = i121115 & 23;
                                                                    int i121117 = (i121115 ^ 23) | i121116;
                                                                    int i121118 = ((i121116 | i121117) << 1) - (i121117 ^ i121116);
                                                                    b = i121118 % 128;
                                                                    int i121119 = i121118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            } else {
                                                                f4 = tVar3.k[i20] / fE;
                                                                if (f4 < f3) {
                                                                    int i121120 = a;
                                                                    int i121121 = (i121120 ^ 73) + ((i121120 & 73) << 1);
                                                                    b = i121121 % 128;
                                                                    int i12121 = i121121 % i25;
                                                                    if (i20 != i7) {
                                                                        int i1211110 = a;
                                                                        int i1211111 = i1211110 & 23;
                                                                        int i1211112 = (i1211110 ^ 23) | i1211111;
                                                                        int i1211113 = ((i1211111 | i1211112) << 1) - (i1211112 ^ i1211111);
                                                                        b = i1211113 % 128;
                                                                        int i1211114 = i1211113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i1211115 = a;
                                                                    int i1211116 = i1211115 & 23;
                                                                    int i1211117 = (i1211115 ^ 23) | i1211116;
                                                                    int i1211118 = ((i1211116 | i1211117) << 1) - (i1211117 ^ i1211116);
                                                                    b = i1211118 % 128;
                                                                    int i1211119 = i1211118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            int i136 = i20 & 1;
                                                            int i137 = i20 | 1;
                                                            i20 = (i136 ^ i137) + ((i136 & i137) << 1);
                                                            int i138 = a;
                                                            int i139 = i138 & 27;
                                                            int i1310 = ((~i139) & (i138 | 27)) + (i139 << 1);
                                                            b = i1310 % 128;
                                                            int i1311 = i1310 % 2;
                                                            rVar = rVar2;
                                                            i25 = 2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                fE = rVar.f.e(tVar3);
                                                if (fE <= f2) {
                                                    int i1010 = a;
                                                    int i1011 = i1010 & 27;
                                                    int i1110 = (((i1010 ^ 27) | i1011) << i29) - ((~i1011) & (i1010 | 27));
                                                    b = i1110 % 128;
                                                    int i1111 = i1110 % i25;
                                                    int i1112 = (i1010 & (-16)) | ((~i1010) & 15);
                                                    int i1113 = (i1010 & 15) << i29;
                                                    i18 = (i1112 ^ i1113) + ((i1113 & i1112) << i29);
                                                    i19 = i18 % 128;
                                                    b = i19;
                                                    if (i18 % i25 != 0) {
                                                        Object obj4 = null;
                                                        obj4.hashCode();
                                                        throw null;
                                                    }
                                                    int i1114 = i19 + 21;
                                                    a = i1114 % 128;
                                                    int i1115 = i1114 % i25;
                                                    rVar2 = rVar;
                                                } else {
                                                    int i1116 = b;
                                                    int i1117 = i1116 & 65;
                                                    int i1118 = (i1117 - (~((i1116 ^ 65) | i1117))) - 1;
                                                    a = i1118 % 128;
                                                    int i1119 = i1118 % i25;
                                                    i20 = 0;
                                                    while (true) {
                                                        i21 = a;
                                                        int i1221 = (i21 ^ 118) + ((i21 & 118) << 1);
                                                        i22 = (i1221 ^ (-1)) + (i1221 << 1);
                                                        rVar2 = rVar;
                                                        b = i22 % 128;
                                                        if (i22 % i25 == 0) {
                                                            if (i20 >= 122) {
                                                                break;
                                                                break;
                                                            }
                                                            int i1222 = i21 & 85;
                                                            i23 = i1222 + ((i21 ^ 85) | i1222);
                                                            b = i23 % 128;
                                                            if (i23 % i25 == 0) {
                                                                f4 = tVar3.k[i20] - fE;
                                                                if (f4 < f3) {
                                                                    int i121122 = a;
                                                                    int i121123 = (i121122 ^ 73) + ((i121122 & 73) << 1);
                                                                    b = i121123 % 128;
                                                                    int i12122 = i121123 % i25;
                                                                    if (i20 != i7) {
                                                                        int i12111110 = a;
                                                                        int i12111111 = i12111110 & 23;
                                                                        int i12111112 = (i12111110 ^ 23) | i12111111;
                                                                        int i12111113 = ((i12111111 | i12111112) << 1) - (i12111112 ^ i12111111);
                                                                        b = i12111113 % 128;
                                                                        int i12111114 = i12111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i12111115 = a;
                                                                    int i12111116 = i12111115 & 23;
                                                                    int i12111117 = (i12111115 ^ 23) | i12111116;
                                                                    int i12111118 = ((i12111116 | i12111117) << 1) - (i12111117 ^ i12111116);
                                                                    b = i12111118 % 128;
                                                                    int i12111119 = i12111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            } else {
                                                                f4 = tVar3.k[i20] / fE;
                                                                if (f4 < f3) {
                                                                    int i121124 = a;
                                                                    int i121125 = (i121124 ^ 73) + ((i121124 & 73) << 1);
                                                                    b = i121125 % 128;
                                                                    int i12123 = i121125 % i25;
                                                                    if (i20 != i7) {
                                                                        int i121111110 = a;
                                                                        int i121111111 = i121111110 & 23;
                                                                        int i121111112 = (i121111110 ^ 23) | i121111111;
                                                                        int i121111113 = ((i121111111 | i121111112) << 1) - (i121111112 ^ i121111111);
                                                                        b = i121111113 % 128;
                                                                        int i121111114 = i121111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i121111115 = a;
                                                                    int i121111116 = i121111115 & 23;
                                                                    int i121111117 = (i121111115 ^ 23) | i121111116;
                                                                    int i121111118 = ((i121111116 | i121111117) << 1) - (i121111117 ^ i121111116);
                                                                    b = i121111118 % 128;
                                                                    int i121111119 = i121111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            int i1312 = i20 & 1;
                                                            int i1313 = i20 | 1;
                                                            i20 = (i1312 ^ i1313) + ((i1312 & i1313) << 1);
                                                            int i1314 = a;
                                                            int i1315 = i1314 & 27;
                                                            int i1316 = ((~i1315) & (i1314 | 27)) + (i1315 << 1);
                                                            b = i1316 % 128;
                                                            int i1317 = i1316 % 2;
                                                            rVar = rVar2;
                                                            i25 = 2;
                                                        } else {
                                                            if (i20 >= 9) {
                                                                break;
                                                                break;
                                                            }
                                                            int i1223 = i21 & 85;
                                                            i23 = i1223 + ((i21 ^ 85) | i1223);
                                                            b = i23 % 128;
                                                            if (i23 % i25 == 0) {
                                                                f4 = tVar3.k[i20] - fE;
                                                                if (f4 < f3) {
                                                                    int i121126 = a;
                                                                    int i121127 = (i121126 ^ 73) + ((i121126 & 73) << 1);
                                                                    b = i121127 % 128;
                                                                    int i12124 = i121127 % i25;
                                                                    if (i20 != i7) {
                                                                        int i1211111110 = a;
                                                                        int i1211111111 = i1211111110 & 23;
                                                                        int i1211111112 = (i1211111110 ^ 23) | i1211111111;
                                                                        int i1211111113 = ((i1211111111 | i1211111112) << 1) - (i1211111112 ^ i1211111111);
                                                                        b = i1211111113 % 128;
                                                                        int i1211111114 = i1211111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i1211111115 = a;
                                                                    int i1211111116 = i1211111115 & 23;
                                                                    int i1211111117 = (i1211111115 ^ 23) | i1211111116;
                                                                    int i1211111118 = ((i1211111116 | i1211111117) << 1) - (i1211111117 ^ i1211111116);
                                                                    b = i1211111118 % 128;
                                                                    int i1211111119 = i1211111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            } else {
                                                                f4 = tVar3.k[i20] / fE;
                                                                if (f4 < f3) {
                                                                    int i121128 = a;
                                                                    int i121129 = (i121128 ^ 73) + ((i121128 & 73) << 1);
                                                                    b = i121129 % 128;
                                                                    int i12125 = i121129 % i25;
                                                                    if (i20 != i7) {
                                                                        int i12111111110 = a;
                                                                        int i12111111111 = i12111111110 & 23;
                                                                        int i12111111112 = (i12111111110 ^ 23) | i12111111111;
                                                                        int i12111111113 = ((i12111111111 | i12111111112) << 1) - (i12111111112 ^ i12111111111);
                                                                        b = i12111111113 % 128;
                                                                        int i12111111114 = i12111111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i12111111115 = a;
                                                                    int i12111111116 = i12111111115 & 23;
                                                                    int i12111111117 = (i12111111115 ^ 23) | i12111111116;
                                                                    int i12111111118 = ((i12111111116 | i12111111117) << 1) - (i12111111117 ^ i12111111116);
                                                                    b = i12111111118 % 128;
                                                                    int i12111111119 = i12111111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            int i1318 = i20 & 1;
                                                            int i1319 = i20 | 1;
                                                            i20 = (i1318 ^ i1319) + ((i1318 & i1319) << 1);
                                                            int i13110 = a;
                                                            int i13111 = i13110 & 27;
                                                            int i13112 = ((~i13111) & (i13110 | 27)) + (i13111 << 1);
                                                            b = i13112 % 128;
                                                            int i13113 = i13112 % 2;
                                                            rVar = rVar2;
                                                            i25 = 2;
                                                        }
                                                    }
                                                }
                                            }
                                            int i140 = i15 & 1;
                                            i15 = ((~i140) & (i15 | 1)) + (i140 << 1);
                                            int i141 = a;
                                            int i142 = (i141 & (-96)) | ((~i141) & 95);
                                            int i143 = -(-((i141 & 95) << 1));
                                            int i144 = ((i142 | i143) << 1) - (i143 ^ i142);
                                            int i145 = i144 % 128;
                                            b = i145;
                                            int i146 = i144 % 2;
                                            int i147 = i145 + 19;
                                            a = i147 % 128;
                                            int i148 = i147 % 2;
                                            rVar = rVar2;
                                            i25 = 2;
                                            i29 = 1;
                                            f2 = 0.0f;
                                        }
                                    }
                                } else {
                                    int i149 = b;
                                    int i150 = ((i149 & (-74)) | ((~i149) & 73)) + ((i149 & 73) << i29);
                                    int i151 = i150 % 128;
                                    a = i151;
                                    int i152 = i150 % i25;
                                    int i153 = i151 ^ 27;
                                    int i154 = (i151 & 27) << i29;
                                    i24 = (i153 & i154) + (i154 | i153);
                                    b = i24 % 128;
                                    if (i24 % 2 == 0) {
                                        int i155 = 5 % 3;
                                    }
                                }
                                int i156 = (i6 & (-38)) + (i6 | (-38));
                                int i157 = (i156 ^ (-1)) + (i156 << 1);
                                int i158 = i157 ^ 40;
                                int i159 = (i157 & 40) << 1;
                                i6 = ((i158 | i159) << 1) - (i158 ^ i159);
                                i13 = a;
                                int i160 = i13 & 31;
                                int i161 = ((i13 ^ 31) | i160) << 1;
                                int i162 = -((~i160) & (i13 | 31));
                                i14 = ((i161 | i162) << 1) - (i161 ^ i162);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                                int i163 = i13 ^ 99;
                                int i164 = (i13 & 99) << 1;
                                int i165 = (i163 ^ i164) + ((i164 & i163) << 1);
                                b = i165 % 128;
                                int i166 = i165 % 2;
                                i25 = 2;
                                i29 = 1;
                                i32 = 19;
                                f2 = 0.0f;
                                i3 = -1;
                            }
                            if (i4 != i3) {
                                int i167 = a;
                                int i168 = ((i167 | 115) << 1) - (i167 ^ 115);
                                b = i168 % 128;
                                int i169 = i168 % 2;
                                r rVar3 = this.m[i4];
                                tVar = rVar3.c;
                                int i170 = a;
                                i10 = ((i170 | 9) << 1) - (i170 ^ 9);
                                b = i10 % 128;
                                if (i10 % 2 == 0) {
                                    tVar.g = -1;
                                    obj = this.q.f;
                                    int i171 = 51 / 0;
                                } else {
                                    tVar.g = -1;
                                    obj = this.q.f;
                                }
                                int i172 = a;
                                int i173 = i172 & 7;
                                int i174 = -(-((i172 ^ 7) | i173));
                                int i175 = ((i173 | i174) << 1) - (i174 ^ i173);
                                b = i175 % 128;
                                int i176 = i175 % 2;
                                rVar3.m(((t[]) obj)[i5]);
                                tVar2 = rVar3.c;
                                int i177 = a;
                                i11 = ((i177 & 35) - (~(-(-(i177 | 35))))) - 1;
                                b = i11 % 128;
                                if (i11 % 2 == 0) {
                                    tVar2.g = i4;
                                    int i178 = 49 / 0;
                                } else {
                                    tVar2.g = i4;
                                }
                                tVar2.g(rVar3);
                                int i179 = a + 97;
                                b = i179 % 128;
                                i8 = 2;
                                int i180 = i179 % 2;
                            } else {
                                i8 = 2;
                                z = true;
                            }
                            if (i > this.f62o / i8) {
                                int i181 = b;
                                int i182 = (((i181 ^ 29) | (i181 & 29)) << 1) - (((~i181) & 29) | (i181 & (-30)));
                                int i183 = i182 % 128;
                                a = i183;
                                int i184 = i182 % 2;
                                int i185 = (i183 ^ 63) + ((i183 & 63) << 1);
                                b = i185 % 128;
                                int i186 = i185 % 2;
                                z = true;
                            }
                            int i187 = a;
                            i9 = (i187 ^ 111) + ((i187 & 111) << 1);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i188 = 4 / 2;
                            }
                            i25 = 2;
                            i29 = 1;
                            i32 = 19;
                            f2 = 0.0f;
                        }
                        break;
                    }
                } else {
                    continue;
                }
            } else if (i42 != i29) {
                f2 = 0.0f;
                if (rVarArr[i35].d < 0.0f) {
                    int i410 = a;
                    int i411 = ((i410 ^ 125) - (~((i410 & 125) << i29))) - i29;
                    int i510 = i411 % 128;
                    b = i510;
                    int i511 = i411 % i25;
                    int i512 = i510 & 59;
                    int i513 = (((i510 ^ 59) | i512) << i29) - ((i510 | 59) & (~i512));
                    int i514 = i513 % 128;
                    a = i514;
                    int i515 = i513 % i25;
                    int i516 = i514 & 93;
                    int i517 = (i514 | 93) & (~i516);
                    int i518 = -(-(i516 << i29));
                    int i519 = (i517 ^ i518) + ((i517 & i518) << i29);
                    int i610 = i519 % 128;
                    b = i610;
                    int i611 = i519 % i25;
                    int i612 = i610 ^ 105;
                    int i613 = -(-((i610 & 105) << i29));
                    int i614 = (i612 & i613) + (i613 | i612);
                    a = i614 % 128;
                    int i615 = i614 % i25;
                    z = false;
                    i = 0;
                    while (!z) {
                        int i616 = b;
                        int i617 = i616 ^ 123;
                        int i618 = -(-((i616 & 123) << i29));
                        i2 = (i617 & i618) + (i618 | i617);
                        int i619 = i2 % 128;
                        a = i619;
                        if (i2 % i25 != 0) {
                            i = (i - (~((i ^ (-1)) | i))) - i29;
                        } else {
                            i = (i & 1) + (i | 1);
                        }
                        int i710 = i619 & 25;
                        int i711 = (i619 ^ 25) | i710;
                        int i712 = (i710 & i711) + (i710 | i711);
                        b = i712 % 128;
                        int i713 = i712 % i25;
                        int i714 = ((i619 & 46) + (i619 | 46)) - i29;
                        b = i714 % 128;
                        int i715 = i714 % i25;
                        i3 = -1;
                        f3 = Float.MAX_VALUE;
                        i4 = -1;
                        i5 = -1;
                        i6 = 0;
                        i7 = 0;
                        while (i6 < this.g) {
                            int i716 = a;
                            int i717 = (-2) - ((((i716 | 44) << 1) - (i716 ^ 44)) ^ (-1));
                            b = i717 % 128;
                            int i718 = i717 % i25;
                            rVar = this.m[i6];
                            int i719 = rVar.c.d;
                            int i810 = b;
                            i12 = (-2) - ((i810 + 76) ^ (-1));
                            a = i12 % 128;
                            if (i12 % i25 == 0) {
                                if (!rVar.g) {
                                    int i811 = a;
                                    int i812 = i811 & 71;
                                    int i813 = (i811 | 71) & (~i812);
                                    int i814 = -(-(i812 << 1));
                                    int i815 = (i813 & i814) + (i813 | i814);
                                    b = i815 % 128;
                                    int i816 = i815 % i25;
                                    if (rVar.d < f2) {
                                        int i817 = b;
                                        int i910 = i817 ^ 51;
                                        int i911 = ((i817 & 51) | i910) << i29;
                                        int i912 = -i910;
                                        int i913 = (i911 & i912) + (i911 | i912);
                                        int i914 = i913 % 128;
                                        a = i914;
                                        int i915 = i913 % i25;
                                        int i916 = (i914 & (-20)) | ((~i914) & i32);
                                        int i917 = (i914 & 19) << i29;
                                        int i918 = (i916 & i917) + (i917 | i916);
                                        b = i918 % 128;
                                        int i919 = i918 % i25;
                                        i15 = i29;
                                        while (true) {
                                            i16 = a;
                                            int i1012 = i16 & 63;
                                            int i1013 = (i1012 - (~((i16 ^ 63) | i1012))) - i29;
                                            b = i1013 % 128;
                                            int i1014 = i1013 % i25;
                                            if (i15 >= this.f62o) {
                                                break;
                                                break;
                                            }
                                            int i1015 = ((i16 & 125) - (~(i16 | 125))) - i29;
                                            b = i1015 % 128;
                                            int i1016 = i1015 % i25;
                                            tVar3 = ((t[]) this.q.f)[i15];
                                            int i1017 = b;
                                            int i1018 = i1017 ^ 67;
                                            int i1019 = (i1017 & 67) << i29;
                                            i17 = (i1018 & i1019) + (i1019 | i1018);
                                            a = i17 % 128;
                                            if (i17 % i25 != 0) {
                                                fE = rVar.f.e(tVar3);
                                                if (fE <= 2.0f) {
                                                    int i10110 = a;
                                                    int i10111 = i10110 & 27;
                                                    int i11110 = (((i10110 ^ 27) | i10111) << i29) - ((~i10111) & (i10110 | 27));
                                                    b = i11110 % 128;
                                                    int i11111 = i11110 % i25;
                                                    int i11112 = (i10110 & (-16)) | ((~i10110) & 15);
                                                    int i11113 = (i10110 & 15) << i29;
                                                    i18 = (i11112 ^ i11113) + ((i11113 & i11112) << i29);
                                                    i19 = i18 % 128;
                                                    b = i19;
                                                    if (i18 % i25 != 0) {
                                                        Object obj6 = null;
                                                        obj6.hashCode();
                                                        throw null;
                                                    }
                                                    int i11114 = i19 + 21;
                                                    a = i11114 % 128;
                                                    int i11115 = i11114 % i25;
                                                    rVar2 = rVar;
                                                } else {
                                                    int i11116 = b;
                                                    int i11117 = i11116 & 65;
                                                    int i11118 = (i11117 - (~((i11116 ^ 65) | i11117))) - 1;
                                                    a = i11118 % 128;
                                                    int i11119 = i11118 % i25;
                                                    i20 = 0;
                                                    while (true) {
                                                        i21 = a;
                                                        int i1224 = (i21 ^ 118) + ((i21 & 118) << 1);
                                                        i22 = (i1224 ^ (-1)) + (i1224 << 1);
                                                        rVar2 = rVar;
                                                        b = i22 % 128;
                                                        if (i22 % i25 == 0) {
                                                            if (i20 >= 122) {
                                                                break;
                                                                break;
                                                            }
                                                            int i1225 = i21 & 85;
                                                            i23 = i1225 + ((i21 ^ 85) | i1225);
                                                            b = i23 % 128;
                                                            if (i23 % i25 == 0) {
                                                                f4 = tVar3.k[i20] - fE;
                                                                if (f4 < f3) {
                                                                    int i1211210 = a;
                                                                    int i1211211 = (i1211210 ^ 73) + ((i1211210 & 73) << 1);
                                                                    b = i1211211 % 128;
                                                                    int i12126 = i1211211 % i25;
                                                                    if (i20 != i7) {
                                                                        int i121111111110 = a;
                                                                        int i121111111111 = i121111111110 & 23;
                                                                        int i121111111112 = (i121111111110 ^ 23) | i121111111111;
                                                                        int i121111111113 = ((i121111111111 | i121111111112) << 1) - (i121111111112 ^ i121111111111);
                                                                        b = i121111111113 % 128;
                                                                        int i121111111114 = i121111111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i121111111115 = a;
                                                                    int i121111111116 = i121111111115 & 23;
                                                                    int i121111111117 = (i121111111115 ^ 23) | i121111111116;
                                                                    int i121111111118 = ((i121111111116 | i121111111117) << 1) - (i121111111117 ^ i121111111116);
                                                                    b = i121111111118 % 128;
                                                                    int i121111111119 = i121111111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            } else {
                                                                f4 = tVar3.k[i20] / fE;
                                                                if (f4 < f3) {
                                                                    int i1211212 = a;
                                                                    int i1211213 = (i1211212 ^ 73) + ((i1211212 & 73) << 1);
                                                                    b = i1211213 % 128;
                                                                    int i12127 = i1211213 % i25;
                                                                    if (i20 != i7) {
                                                                        int i1211111111110 = a;
                                                                        int i1211111111111 = i1211111111110 & 23;
                                                                        int i1211111111112 = (i1211111111110 ^ 23) | i1211111111111;
                                                                        int i1211111111113 = ((i1211111111111 | i1211111111112) << 1) - (i1211111111112 ^ i1211111111111);
                                                                        b = i1211111111113 % 128;
                                                                        int i1211111111114 = i1211111111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i1211111111115 = a;
                                                                    int i1211111111116 = i1211111111115 & 23;
                                                                    int i1211111111117 = (i1211111111115 ^ 23) | i1211111111116;
                                                                    int i1211111111118 = ((i1211111111116 | i1211111111117) << 1) - (i1211111111117 ^ i1211111111116);
                                                                    b = i1211111111118 % 128;
                                                                    int i1211111111119 = i1211111111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            int i13114 = i20 & 1;
                                                            int i13115 = i20 | 1;
                                                            i20 = (i13114 ^ i13115) + ((i13114 & i13115) << 1);
                                                            int i13116 = a;
                                                            int i13117 = i13116 & 27;
                                                            int i13118 = ((~i13117) & (i13116 | 27)) + (i13117 << 1);
                                                            b = i13118 % 128;
                                                            int i13119 = i13118 % 2;
                                                            rVar = rVar2;
                                                            i25 = 2;
                                                        } else {
                                                            if (i20 >= 9) {
                                                                break;
                                                                break;
                                                            }
                                                            int i1226 = i21 & 85;
                                                            i23 = i1226 + ((i21 ^ 85) | i1226);
                                                            b = i23 % 128;
                                                            if (i23 % i25 == 0) {
                                                                f4 = tVar3.k[i20] - fE;
                                                                if (f4 < f3) {
                                                                    int i1211214 = a;
                                                                    int i1211215 = (i1211214 ^ 73) + ((i1211214 & 73) << 1);
                                                                    b = i1211215 % 128;
                                                                    int i12128 = i1211215 % i25;
                                                                    if (i20 != i7) {
                                                                        int i12111111111110 = a;
                                                                        int i12111111111111 = i12111111111110 & 23;
                                                                        int i12111111111112 = (i12111111111110 ^ 23) | i12111111111111;
                                                                        int i12111111111113 = ((i12111111111111 | i12111111111112) << 1) - (i12111111111112 ^ i12111111111111);
                                                                        b = i12111111111113 % 128;
                                                                        int i12111111111114 = i12111111111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i12111111111115 = a;
                                                                    int i12111111111116 = i12111111111115 & 23;
                                                                    int i12111111111117 = (i12111111111115 ^ 23) | i12111111111116;
                                                                    int i12111111111118 = ((i12111111111116 | i12111111111117) << 1) - (i12111111111117 ^ i12111111111116);
                                                                    b = i12111111111118 % 128;
                                                                    int i12111111111119 = i12111111111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            } else {
                                                                f4 = tVar3.k[i20] / fE;
                                                                if (f4 < f3) {
                                                                    int i1211216 = a;
                                                                    int i1211217 = (i1211216 ^ 73) + ((i1211216 & 73) << 1);
                                                                    b = i1211217 % 128;
                                                                    int i12129 = i1211217 % i25;
                                                                    if (i20 != i7) {
                                                                        int i121111111111110 = a;
                                                                        int i121111111111111 = i121111111111110 & 23;
                                                                        int i121111111111112 = (i121111111111110 ^ 23) | i121111111111111;
                                                                        int i121111111111113 = ((i121111111111111 | i121111111111112) << 1) - (i121111111111112 ^ i121111111111111);
                                                                        b = i121111111111113 % 128;
                                                                        int i121111111111114 = i121111111111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i121111111111115 = a;
                                                                    int i121111111111116 = i121111111111115 & 23;
                                                                    int i121111111111117 = (i121111111111115 ^ 23) | i121111111111116;
                                                                    int i121111111111118 = ((i121111111111116 | i121111111111117) << 1) - (i121111111111117 ^ i121111111111116);
                                                                    b = i121111111111118 % 128;
                                                                    int i121111111111119 = i121111111111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            int i131110 = i20 & 1;
                                                            int i131111 = i20 | 1;
                                                            i20 = (i131110 ^ i131111) + ((i131110 & i131111) << 1);
                                                            int i131112 = a;
                                                            int i131113 = i131112 & 27;
                                                            int i131114 = ((~i131113) & (i131112 | 27)) + (i131113 << 1);
                                                            b = i131114 % 128;
                                                            int i131115 = i131114 % 2;
                                                            rVar = rVar2;
                                                            i25 = 2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                fE = rVar.f.e(tVar3);
                                                if (fE <= f2) {
                                                    int i10112 = a;
                                                    int i10113 = i10112 & 27;
                                                    int i111110 = (((i10112 ^ 27) | i10113) << i29) - ((~i10113) & (i10112 | 27));
                                                    b = i111110 % 128;
                                                    int i111111 = i111110 % i25;
                                                    int i111112 = (i10112 & (-16)) | ((~i10112) & 15);
                                                    int i111113 = (i10112 & 15) << i29;
                                                    i18 = (i111112 ^ i111113) + ((i111113 & i111112) << i29);
                                                    i19 = i18 % 128;
                                                    b = i19;
                                                    if (i18 % i25 != 0) {
                                                        Object obj7 = null;
                                                        obj7.hashCode();
                                                        throw null;
                                                    }
                                                    int i111114 = i19 + 21;
                                                    a = i111114 % 128;
                                                    int i111115 = i111114 % i25;
                                                    rVar2 = rVar;
                                                } else {
                                                    int i111116 = b;
                                                    int i111117 = i111116 & 65;
                                                    int i111118 = (i111117 - (~((i111116 ^ 65) | i111117))) - 1;
                                                    a = i111118 % 128;
                                                    int i111119 = i111118 % i25;
                                                    i20 = 0;
                                                    while (true) {
                                                        i21 = a;
                                                        int i1227 = (i21 ^ 118) + ((i21 & 118) << 1);
                                                        i22 = (i1227 ^ (-1)) + (i1227 << 1);
                                                        rVar2 = rVar;
                                                        b = i22 % 128;
                                                        if (i22 % i25 == 0) {
                                                            if (i20 >= 122) {
                                                                break;
                                                                break;
                                                            }
                                                            int i1228 = i21 & 85;
                                                            i23 = i1228 + ((i21 ^ 85) | i1228);
                                                            b = i23 % 128;
                                                            if (i23 % i25 == 0) {
                                                                f4 = tVar3.k[i20] - fE;
                                                                if (f4 < f3) {
                                                                    int i1211218 = a;
                                                                    int i1211219 = (i1211218 ^ 73) + ((i1211218 & 73) << 1);
                                                                    b = i1211219 % 128;
                                                                    int i121210 = i1211219 % i25;
                                                                    if (i20 != i7) {
                                                                        int i1211111111111110 = a;
                                                                        int i1211111111111111 = i1211111111111110 & 23;
                                                                        int i1211111111111112 = (i1211111111111110 ^ 23) | i1211111111111111;
                                                                        int i1211111111111113 = ((i1211111111111111 | i1211111111111112) << 1) - (i1211111111111112 ^ i1211111111111111);
                                                                        b = i1211111111111113 % 128;
                                                                        int i1211111111111114 = i1211111111111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i1211111111111115 = a;
                                                                    int i1211111111111116 = i1211111111111115 & 23;
                                                                    int i1211111111111117 = (i1211111111111115 ^ 23) | i1211111111111116;
                                                                    int i1211111111111118 = ((i1211111111111116 | i1211111111111117) << 1) - (i1211111111111117 ^ i1211111111111116);
                                                                    b = i1211111111111118 % 128;
                                                                    int i1211111111111119 = i1211111111111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            } else {
                                                                f4 = tVar3.k[i20] / fE;
                                                                if (f4 < f3) {
                                                                    int i12112110 = a;
                                                                    int i12112111 = (i12112110 ^ 73) + ((i12112110 & 73) << 1);
                                                                    b = i12112111 % 128;
                                                                    int i121211 = i12112111 % i25;
                                                                    if (i20 != i7) {
                                                                        int i12111111111111110 = a;
                                                                        int i12111111111111111 = i12111111111111110 & 23;
                                                                        int i12111111111111112 = (i12111111111111110 ^ 23) | i12111111111111111;
                                                                        int i12111111111111113 = ((i12111111111111111 | i12111111111111112) << 1) - (i12111111111111112 ^ i12111111111111111);
                                                                        b = i12111111111111113 % 128;
                                                                        int i12111111111111114 = i12111111111111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i12111111111111115 = a;
                                                                    int i12111111111111116 = i12111111111111115 & 23;
                                                                    int i12111111111111117 = (i12111111111111115 ^ 23) | i12111111111111116;
                                                                    int i12111111111111118 = ((i12111111111111116 | i12111111111111117) << 1) - (i12111111111111117 ^ i12111111111111116);
                                                                    b = i12111111111111118 % 128;
                                                                    int i12111111111111119 = i12111111111111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            int i131116 = i20 & 1;
                                                            int i131117 = i20 | 1;
                                                            i20 = (i131116 ^ i131117) + ((i131116 & i131117) << 1);
                                                            int i131118 = a;
                                                            int i131119 = i131118 & 27;
                                                            int i1311110 = ((~i131119) & (i131118 | 27)) + (i131119 << 1);
                                                            b = i1311110 % 128;
                                                            int i1311111 = i1311110 % 2;
                                                            rVar = rVar2;
                                                            i25 = 2;
                                                        } else {
                                                            if (i20 >= 9) {
                                                                break;
                                                                break;
                                                            }
                                                            int i1229 = i21 & 85;
                                                            i23 = i1229 + ((i21 ^ 85) | i1229);
                                                            b = i23 % 128;
                                                            if (i23 % i25 == 0) {
                                                                f4 = tVar3.k[i20] - fE;
                                                                if (f4 < f3) {
                                                                    int i12112112 = a;
                                                                    int i12112113 = (i12112112 ^ 73) + ((i12112112 & 73) << 1);
                                                                    b = i12112113 % 128;
                                                                    int i121212 = i12112113 % i25;
                                                                    if (i20 != i7) {
                                                                        int i121111111111111110 = a;
                                                                        int i121111111111111111 = i121111111111111110 & 23;
                                                                        int i121111111111111112 = (i121111111111111110 ^ 23) | i121111111111111111;
                                                                        int i121111111111111113 = ((i121111111111111111 | i121111111111111112) << 1) - (i121111111111111112 ^ i121111111111111111);
                                                                        b = i121111111111111113 % 128;
                                                                        int i121111111111111114 = i121111111111111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i121111111111111115 = a;
                                                                    int i121111111111111116 = i121111111111111115 & 23;
                                                                    int i121111111111111117 = (i121111111111111115 ^ 23) | i121111111111111116;
                                                                    int i121111111111111118 = ((i121111111111111116 | i121111111111111117) << 1) - (i121111111111111117 ^ i121111111111111116);
                                                                    b = i121111111111111118 % 128;
                                                                    int i121111111111111119 = i121111111111111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            } else {
                                                                f4 = tVar3.k[i20] / fE;
                                                                if (f4 < f3) {
                                                                    int i12112114 = a;
                                                                    int i12112115 = (i12112114 ^ 73) + ((i12112114 & 73) << 1);
                                                                    b = i12112115 % 128;
                                                                    int i121213 = i12112115 % i25;
                                                                    if (i20 != i7) {
                                                                        int i1211111111111111110 = a;
                                                                        int i1211111111111111111 = i1211111111111111110 & 23;
                                                                        int i1211111111111111112 = (i1211111111111111110 ^ 23) | i1211111111111111111;
                                                                        int i1211111111111111113 = ((i1211111111111111111 | i1211111111111111112) << 1) - (i1211111111111111112 ^ i1211111111111111111);
                                                                        b = i1211111111111111113 % 128;
                                                                        int i1211111111111111114 = i1211111111111111113 % i25;
                                                                        f3 = f4;
                                                                        i5 = i15;
                                                                        i7 = i20;
                                                                        i4 = i6;
                                                                    }
                                                                }
                                                                if (i20 > i7) {
                                                                    int i1211111111111111115 = a;
                                                                    int i1211111111111111116 = i1211111111111111115 & 23;
                                                                    int i1211111111111111117 = (i1211111111111111115 ^ 23) | i1211111111111111116;
                                                                    int i1211111111111111118 = ((i1211111111111111116 | i1211111111111111117) << 1) - (i1211111111111111117 ^ i1211111111111111116);
                                                                    b = i1211111111111111118 % 128;
                                                                    int i1211111111111111119 = i1211111111111111118 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            int i1311112 = i20 & 1;
                                                            int i1311113 = i20 | 1;
                                                            i20 = (i1311112 ^ i1311113) + ((i1311112 & i1311113) << 1);
                                                            int i1311114 = a;
                                                            int i1311115 = i1311114 & 27;
                                                            int i1311116 = ((~i1311115) & (i1311114 | 27)) + (i1311115 << 1);
                                                            b = i1311116 % 128;
                                                            int i1311117 = i1311116 % 2;
                                                            rVar = rVar2;
                                                            i25 = 2;
                                                        }
                                                    }
                                                }
                                            }
                                            int i1410 = i15 & 1;
                                            i15 = ((~i1410) & (i15 | 1)) + (i1410 << 1);
                                            int i1411 = a;
                                            int i1412 = (i1411 & (-96)) | ((~i1411) & 95);
                                            int i1413 = -(-((i1411 & 95) << 1));
                                            int i1414 = ((i1412 | i1413) << 1) - (i1413 ^ i1412);
                                            int i1415 = i1414 % 128;
                                            b = i1415;
                                            int i1416 = i1414 % 2;
                                            int i1417 = i1415 + 19;
                                            a = i1417 % 128;
                                            int i1418 = i1417 % 2;
                                            rVar = rVar2;
                                            i25 = 2;
                                            i29 = 1;
                                            f2 = 0.0f;
                                        }
                                    }
                                } else {
                                    int i1419 = b;
                                    int i1510 = ((i1419 & (-74)) | ((~i1419) & 73)) + ((i1419 & 73) << i29);
                                    int i1511 = i1510 % 128;
                                    a = i1511;
                                    int i1512 = i1510 % i25;
                                    int i1513 = i1511 ^ 27;
                                    int i1514 = (i1511 & 27) << i29;
                                    i24 = (i1513 & i1514) + (i1514 | i1513);
                                    b = i24 % 128;
                                    if (i24 % 2 == 0) {
                                        int i1515 = 5 % 3;
                                    }
                                }
                            } else if (!rVar.g) {
                                int i818 = a;
                                int i819 = i818 & 71;
                                int i8110 = (i818 | 71) & (~i819);
                                int i8111 = -(-(i819 << 1));
                                int i8112 = (i8110 & i8111) + (i8110 | i8111);
                                b = i8112 % 128;
                                int i8113 = i8112 % i25;
                                if (rVar.d < f2) {
                                    int i8114 = b;
                                    int i9110 = i8114 ^ 51;
                                    int i9111 = ((i8114 & 51) | i9110) << i29;
                                    int i9112 = -i9110;
                                    int i9113 = (i9111 & i9112) + (i9111 | i9112);
                                    int i9114 = i9113 % 128;
                                    a = i9114;
                                    int i9115 = i9113 % i25;
                                    int i9116 = (i9114 & (-20)) | ((~i9114) & i32);
                                    int i9117 = (i9114 & 19) << i29;
                                    int i9118 = (i9116 & i9117) + (i9117 | i9116);
                                    b = i9118 % 128;
                                    int i9119 = i9118 % i25;
                                    i15 = i29;
                                    while (true) {
                                        i16 = a;
                                        int i10114 = i16 & 63;
                                        int i10115 = (i10114 - (~((i16 ^ 63) | i10114))) - i29;
                                        b = i10115 % 128;
                                        int i10116 = i10115 % i25;
                                        if (i15 >= this.f62o) {
                                            break;
                                            break;
                                        }
                                        int i10117 = ((i16 & 125) - (~(i16 | 125))) - i29;
                                        b = i10117 % 128;
                                        int i10118 = i10117 % i25;
                                        tVar3 = ((t[]) this.q.f)[i15];
                                        int i10119 = b;
                                        int i10120 = i10119 ^ 67;
                                        int i10121 = (i10119 & 67) << i29;
                                        i17 = (i10120 & i10121) + (i10121 | i10120);
                                        a = i17 % 128;
                                        if (i17 % i25 != 0) {
                                            fE = rVar.f.e(tVar3);
                                            if (fE <= 2.0f) {
                                                int i101110 = a;
                                                int i101111 = i101110 & 27;
                                                int i1111110 = (((i101110 ^ 27) | i101111) << i29) - ((~i101111) & (i101110 | 27));
                                                b = i1111110 % 128;
                                                int i1111111 = i1111110 % i25;
                                                int i1111112 = (i101110 & (-16)) | ((~i101110) & 15);
                                                int i1111113 = (i101110 & 15) << i29;
                                                i18 = (i1111112 ^ i1111113) + ((i1111113 & i1111112) << i29);
                                                i19 = i18 % 128;
                                                b = i19;
                                                if (i18 % i25 != 0) {
                                                    Object obj8 = null;
                                                    obj8.hashCode();
                                                    throw null;
                                                }
                                                int i1111114 = i19 + 21;
                                                a = i1111114 % 128;
                                                int i1111115 = i1111114 % i25;
                                                rVar2 = rVar;
                                            } else {
                                                int i1111116 = b;
                                                int i1111117 = i1111116 & 65;
                                                int i1111118 = (i1111117 - (~((i1111116 ^ 65) | i1111117))) - 1;
                                                a = i1111118 % 128;
                                                int i1111119 = i1111118 % i25;
                                                i20 = 0;
                                                while (true) {
                                                    i21 = a;
                                                    int i12210 = (i21 ^ 118) + ((i21 & 118) << 1);
                                                    i22 = (i12210 ^ (-1)) + (i12210 << 1);
                                                    rVar2 = rVar;
                                                    b = i22 % 128;
                                                    if (i22 % i25 == 0) {
                                                        if (i20 >= 122) {
                                                            break;
                                                            break;
                                                        }
                                                        int i12211 = i21 & 85;
                                                        i23 = i12211 + ((i21 ^ 85) | i12211);
                                                        b = i23 % 128;
                                                        if (i23 % i25 == 0) {
                                                            f4 = tVar3.k[i20] - fE;
                                                            if (f4 < f3) {
                                                                int i12112116 = a;
                                                                int i12112117 = (i12112116 ^ 73) + ((i12112116 & 73) << 1);
                                                                b = i12112117 % 128;
                                                                int i121214 = i12112117 % i25;
                                                                if (i20 != i7) {
                                                                    int i12111111111111111110 = a;
                                                                    int i12111111111111111111 = i12111111111111111110 & 23;
                                                                    int i12111111111111111112 = (i12111111111111111110 ^ 23) | i12111111111111111111;
                                                                    int i12111111111111111113 = ((i12111111111111111111 | i12111111111111111112) << 1) - (i12111111111111111112 ^ i12111111111111111111);
                                                                    b = i12111111111111111113 % 128;
                                                                    int i12111111111111111114 = i12111111111111111113 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            if (i20 > i7) {
                                                                int i12111111111111111115 = a;
                                                                int i12111111111111111116 = i12111111111111111115 & 23;
                                                                int i12111111111111111117 = (i12111111111111111115 ^ 23) | i12111111111111111116;
                                                                int i12111111111111111118 = ((i12111111111111111116 | i12111111111111111117) << 1) - (i12111111111111111117 ^ i12111111111111111116);
                                                                b = i12111111111111111118 % 128;
                                                                int i12111111111111111119 = i12111111111111111118 % i25;
                                                                f3 = f4;
                                                                i5 = i15;
                                                                i7 = i20;
                                                                i4 = i6;
                                                            }
                                                        } else {
                                                            f4 = tVar3.k[i20] / fE;
                                                            if (f4 < f3) {
                                                                int i12112118 = a;
                                                                int i12112119 = (i12112118 ^ 73) + ((i12112118 & 73) << 1);
                                                                b = i12112119 % 128;
                                                                int i121215 = i12112119 % i25;
                                                                if (i20 != i7) {
                                                                    int i121111111111111111110 = a;
                                                                    int i121111111111111111111 = i121111111111111111110 & 23;
                                                                    int i121111111111111111112 = (i121111111111111111110 ^ 23) | i121111111111111111111;
                                                                    int i121111111111111111113 = ((i121111111111111111111 | i121111111111111111112) << 1) - (i121111111111111111112 ^ i121111111111111111111);
                                                                    b = i121111111111111111113 % 128;
                                                                    int i121111111111111111114 = i121111111111111111113 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            if (i20 > i7) {
                                                                int i121111111111111111115 = a;
                                                                int i121111111111111111116 = i121111111111111111115 & 23;
                                                                int i121111111111111111117 = (i121111111111111111115 ^ 23) | i121111111111111111116;
                                                                int i121111111111111111118 = ((i121111111111111111116 | i121111111111111111117) << 1) - (i121111111111111111117 ^ i121111111111111111116);
                                                                b = i121111111111111111118 % 128;
                                                                int i121111111111111111119 = i121111111111111111118 % i25;
                                                                f3 = f4;
                                                                i5 = i15;
                                                                i7 = i20;
                                                                i4 = i6;
                                                            }
                                                        }
                                                        int i1311118 = i20 & 1;
                                                        int i1311119 = i20 | 1;
                                                        i20 = (i1311118 ^ i1311119) + ((i1311118 & i1311119) << 1);
                                                        int i13111110 = a;
                                                        int i13111111 = i13111110 & 27;
                                                        int i13111112 = ((~i13111111) & (i13111110 | 27)) + (i13111111 << 1);
                                                        b = i13111112 % 128;
                                                        int i13111113 = i13111112 % 2;
                                                        rVar = rVar2;
                                                        i25 = 2;
                                                    } else {
                                                        if (i20 >= 9) {
                                                            break;
                                                            break;
                                                        }
                                                        int i12212 = i21 & 85;
                                                        i23 = i12212 + ((i21 ^ 85) | i12212);
                                                        b = i23 % 128;
                                                        if (i23 % i25 == 0) {
                                                            f4 = tVar3.k[i20] - fE;
                                                            if (f4 < f3) {
                                                                int i121121110 = a;
                                                                int i121121111 = (i121121110 ^ 73) + ((i121121110 & 73) << 1);
                                                                b = i121121111 % 128;
                                                                int i121216 = i121121111 % i25;
                                                                if (i20 != i7) {
                                                                    int i1211111111111111111110 = a;
                                                                    int i1211111111111111111111 = i1211111111111111111110 & 23;
                                                                    int i1211111111111111111112 = (i1211111111111111111110 ^ 23) | i1211111111111111111111;
                                                                    int i1211111111111111111113 = ((i1211111111111111111111 | i1211111111111111111112) << 1) - (i1211111111111111111112 ^ i1211111111111111111111);
                                                                    b = i1211111111111111111113 % 128;
                                                                    int i1211111111111111111114 = i1211111111111111111113 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            if (i20 > i7) {
                                                                int i1211111111111111111115 = a;
                                                                int i1211111111111111111116 = i1211111111111111111115 & 23;
                                                                int i1211111111111111111117 = (i1211111111111111111115 ^ 23) | i1211111111111111111116;
                                                                int i1211111111111111111118 = ((i1211111111111111111116 | i1211111111111111111117) << 1) - (i1211111111111111111117 ^ i1211111111111111111116);
                                                                b = i1211111111111111111118 % 128;
                                                                int i1211111111111111111119 = i1211111111111111111118 % i25;
                                                                f3 = f4;
                                                                i5 = i15;
                                                                i7 = i20;
                                                                i4 = i6;
                                                            }
                                                        } else {
                                                            f4 = tVar3.k[i20] / fE;
                                                            if (f4 < f3) {
                                                                int i121121112 = a;
                                                                int i121121113 = (i121121112 ^ 73) + ((i121121112 & 73) << 1);
                                                                b = i121121113 % 128;
                                                                int i121217 = i121121113 % i25;
                                                                if (i20 != i7) {
                                                                    int i12111111111111111111110 = a;
                                                                    int i12111111111111111111111 = i12111111111111111111110 & 23;
                                                                    int i12111111111111111111112 = (i12111111111111111111110 ^ 23) | i12111111111111111111111;
                                                                    int i12111111111111111111113 = ((i12111111111111111111111 | i12111111111111111111112) << 1) - (i12111111111111111111112 ^ i12111111111111111111111);
                                                                    b = i12111111111111111111113 % 128;
                                                                    int i12111111111111111111114 = i12111111111111111111113 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            if (i20 > i7) {
                                                                int i12111111111111111111115 = a;
                                                                int i12111111111111111111116 = i12111111111111111111115 & 23;
                                                                int i12111111111111111111117 = (i12111111111111111111115 ^ 23) | i12111111111111111111116;
                                                                int i12111111111111111111118 = ((i12111111111111111111116 | i12111111111111111111117) << 1) - (i12111111111111111111117 ^ i12111111111111111111116);
                                                                b = i12111111111111111111118 % 128;
                                                                int i12111111111111111111119 = i12111111111111111111118 % i25;
                                                                f3 = f4;
                                                                i5 = i15;
                                                                i7 = i20;
                                                                i4 = i6;
                                                            }
                                                        }
                                                        int i13111114 = i20 & 1;
                                                        int i13111115 = i20 | 1;
                                                        i20 = (i13111114 ^ i13111115) + ((i13111114 & i13111115) << 1);
                                                        int i13111116 = a;
                                                        int i13111117 = i13111116 & 27;
                                                        int i13111118 = ((~i13111117) & (i13111116 | 27)) + (i13111117 << 1);
                                                        b = i13111118 % 128;
                                                        int i13111119 = i13111118 % 2;
                                                        rVar = rVar2;
                                                        i25 = 2;
                                                    }
                                                }
                                            }
                                        } else {
                                            fE = rVar.f.e(tVar3);
                                            if (fE <= f2) {
                                                int i101112 = a;
                                                int i101113 = i101112 & 27;
                                                int i11111110 = (((i101112 ^ 27) | i101113) << i29) - ((~i101113) & (i101112 | 27));
                                                b = i11111110 % 128;
                                                int i11111111 = i11111110 % i25;
                                                int i11111112 = (i101112 & (-16)) | ((~i101112) & 15);
                                                int i11111113 = (i101112 & 15) << i29;
                                                i18 = (i11111112 ^ i11111113) + ((i11111113 & i11111112) << i29);
                                                i19 = i18 % 128;
                                                b = i19;
                                                if (i18 % i25 != 0) {
                                                    Object obj9 = null;
                                                    obj9.hashCode();
                                                    throw null;
                                                }
                                                int i11111114 = i19 + 21;
                                                a = i11111114 % 128;
                                                int i11111115 = i11111114 % i25;
                                                rVar2 = rVar;
                                            } else {
                                                int i11111116 = b;
                                                int i11111117 = i11111116 & 65;
                                                int i11111118 = (i11111117 - (~((i11111116 ^ 65) | i11111117))) - 1;
                                                a = i11111118 % 128;
                                                int i11111119 = i11111118 % i25;
                                                i20 = 0;
                                                while (true) {
                                                    i21 = a;
                                                    int i12213 = (i21 ^ 118) + ((i21 & 118) << 1);
                                                    i22 = (i12213 ^ (-1)) + (i12213 << 1);
                                                    rVar2 = rVar;
                                                    b = i22 % 128;
                                                    if (i22 % i25 == 0) {
                                                        if (i20 >= 122) {
                                                            break;
                                                            break;
                                                        }
                                                        int i12214 = i21 & 85;
                                                        i23 = i12214 + ((i21 ^ 85) | i12214);
                                                        b = i23 % 128;
                                                        if (i23 % i25 == 0) {
                                                            f4 = tVar3.k[i20] - fE;
                                                            if (f4 < f3) {
                                                                int i121121114 = a;
                                                                int i121121115 = (i121121114 ^ 73) + ((i121121114 & 73) << 1);
                                                                b = i121121115 % 128;
                                                                int i121218 = i121121115 % i25;
                                                                if (i20 != i7) {
                                                                    int i121111111111111111111110 = a;
                                                                    int i121111111111111111111111 = i121111111111111111111110 & 23;
                                                                    int i121111111111111111111112 = (i121111111111111111111110 ^ 23) | i121111111111111111111111;
                                                                    int i121111111111111111111113 = ((i121111111111111111111111 | i121111111111111111111112) << 1) - (i121111111111111111111112 ^ i121111111111111111111111);
                                                                    b = i121111111111111111111113 % 128;
                                                                    int i121111111111111111111114 = i121111111111111111111113 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            if (i20 > i7) {
                                                                int i121111111111111111111115 = a;
                                                                int i121111111111111111111116 = i121111111111111111111115 & 23;
                                                                int i121111111111111111111117 = (i121111111111111111111115 ^ 23) | i121111111111111111111116;
                                                                int i121111111111111111111118 = ((i121111111111111111111116 | i121111111111111111111117) << 1) - (i121111111111111111111117 ^ i121111111111111111111116);
                                                                b = i121111111111111111111118 % 128;
                                                                int i121111111111111111111119 = i121111111111111111111118 % i25;
                                                                f3 = f4;
                                                                i5 = i15;
                                                                i7 = i20;
                                                                i4 = i6;
                                                            }
                                                        } else {
                                                            f4 = tVar3.k[i20] / fE;
                                                            if (f4 < f3) {
                                                                int i121121116 = a;
                                                                int i121121117 = (i121121116 ^ 73) + ((i121121116 & 73) << 1);
                                                                b = i121121117 % 128;
                                                                int i121219 = i121121117 % i25;
                                                                if (i20 != i7) {
                                                                    int i1211111111111111111111110 = a;
                                                                    int i1211111111111111111111111 = i1211111111111111111111110 & 23;
                                                                    int i1211111111111111111111112 = (i1211111111111111111111110 ^ 23) | i1211111111111111111111111;
                                                                    int i1211111111111111111111113 = ((i1211111111111111111111111 | i1211111111111111111111112) << 1) - (i1211111111111111111111112 ^ i1211111111111111111111111);
                                                                    b = i1211111111111111111111113 % 128;
                                                                    int i1211111111111111111111114 = i1211111111111111111111113 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            if (i20 > i7) {
                                                                int i1211111111111111111111115 = a;
                                                                int i1211111111111111111111116 = i1211111111111111111111115 & 23;
                                                                int i1211111111111111111111117 = (i1211111111111111111111115 ^ 23) | i1211111111111111111111116;
                                                                int i1211111111111111111111118 = ((i1211111111111111111111116 | i1211111111111111111111117) << 1) - (i1211111111111111111111117 ^ i1211111111111111111111116);
                                                                b = i1211111111111111111111118 % 128;
                                                                int i1211111111111111111111119 = i1211111111111111111111118 % i25;
                                                                f3 = f4;
                                                                i5 = i15;
                                                                i7 = i20;
                                                                i4 = i6;
                                                            }
                                                        }
                                                        int i131111110 = i20 & 1;
                                                        int i131111111 = i20 | 1;
                                                        i20 = (i131111110 ^ i131111111) + ((i131111110 & i131111111) << 1);
                                                        int i131111112 = a;
                                                        int i131111113 = i131111112 & 27;
                                                        int i131111114 = ((~i131111113) & (i131111112 | 27)) + (i131111113 << 1);
                                                        b = i131111114 % 128;
                                                        int i131111115 = i131111114 % 2;
                                                        rVar = rVar2;
                                                        i25 = 2;
                                                    } else {
                                                        if (i20 >= 9) {
                                                            break;
                                                            break;
                                                        }
                                                        int i12215 = i21 & 85;
                                                        i23 = i12215 + ((i21 ^ 85) | i12215);
                                                        b = i23 % 128;
                                                        if (i23 % i25 == 0) {
                                                            f4 = tVar3.k[i20] - fE;
                                                            if (f4 < f3) {
                                                                int i121121118 = a;
                                                                int i121121119 = (i121121118 ^ 73) + ((i121121118 & 73) << 1);
                                                                b = i121121119 % 128;
                                                                int i1212110 = i121121119 % i25;
                                                                if (i20 != i7) {
                                                                    int i12111111111111111111111110 = a;
                                                                    int i12111111111111111111111111 = i12111111111111111111111110 & 23;
                                                                    int i12111111111111111111111112 = (i12111111111111111111111110 ^ 23) | i12111111111111111111111111;
                                                                    int i12111111111111111111111113 = ((i12111111111111111111111111 | i12111111111111111111111112) << 1) - (i12111111111111111111111112 ^ i12111111111111111111111111);
                                                                    b = i12111111111111111111111113 % 128;
                                                                    int i12111111111111111111111114 = i12111111111111111111111113 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            if (i20 > i7) {
                                                                int i12111111111111111111111115 = a;
                                                                int i12111111111111111111111116 = i12111111111111111111111115 & 23;
                                                                int i12111111111111111111111117 = (i12111111111111111111111115 ^ 23) | i12111111111111111111111116;
                                                                int i12111111111111111111111118 = ((i12111111111111111111111116 | i12111111111111111111111117) << 1) - (i12111111111111111111111117 ^ i12111111111111111111111116);
                                                                b = i12111111111111111111111118 % 128;
                                                                int i12111111111111111111111119 = i12111111111111111111111118 % i25;
                                                                f3 = f4;
                                                                i5 = i15;
                                                                i7 = i20;
                                                                i4 = i6;
                                                            }
                                                        } else {
                                                            f4 = tVar3.k[i20] / fE;
                                                            if (f4 < f3) {
                                                                int i1211211110 = a;
                                                                int i1211211111 = (i1211211110 ^ 73) + ((i1211211110 & 73) << 1);
                                                                b = i1211211111 % 128;
                                                                int i1212111 = i1211211111 % i25;
                                                                if (i20 != i7) {
                                                                    int i121111111111111111111111110 = a;
                                                                    int i121111111111111111111111111 = i121111111111111111111111110 & 23;
                                                                    int i121111111111111111111111112 = (i121111111111111111111111110 ^ 23) | i121111111111111111111111111;
                                                                    int i121111111111111111111111113 = ((i121111111111111111111111111 | i121111111111111111111111112) << 1) - (i121111111111111111111111112 ^ i121111111111111111111111111);
                                                                    b = i121111111111111111111111113 % 128;
                                                                    int i121111111111111111111111114 = i121111111111111111111111113 % i25;
                                                                    f3 = f4;
                                                                    i5 = i15;
                                                                    i7 = i20;
                                                                    i4 = i6;
                                                                }
                                                            }
                                                            if (i20 > i7) {
                                                                int i121111111111111111111111115 = a;
                                                                int i121111111111111111111111116 = i121111111111111111111111115 & 23;
                                                                int i121111111111111111111111117 = (i121111111111111111111111115 ^ 23) | i121111111111111111111111116;
                                                                int i121111111111111111111111118 = ((i121111111111111111111111116 | i121111111111111111111111117) << 1) - (i121111111111111111111111117 ^ i121111111111111111111111116);
                                                                b = i121111111111111111111111118 % 128;
                                                                int i121111111111111111111111119 = i121111111111111111111111118 % i25;
                                                                f3 = f4;
                                                                i5 = i15;
                                                                i7 = i20;
                                                                i4 = i6;
                                                            }
                                                        }
                                                        int i131111116 = i20 & 1;
                                                        int i131111117 = i20 | 1;
                                                        i20 = (i131111116 ^ i131111117) + ((i131111116 & i131111117) << 1);
                                                        int i131111118 = a;
                                                        int i131111119 = i131111118 & 27;
                                                        int i1311111110 = ((~i131111119) & (i131111118 | 27)) + (i131111119 << 1);
                                                        b = i1311111110 % 128;
                                                        int i1311111111 = i1311111110 % 2;
                                                        rVar = rVar2;
                                                        i25 = 2;
                                                    }
                                                }
                                            }
                                        }
                                        int i14110 = i15 & 1;
                                        i15 = ((~i14110) & (i15 | 1)) + (i14110 << 1);
                                        int i14111 = a;
                                        int i14112 = (i14111 & (-96)) | ((~i14111) & 95);
                                        int i14113 = -(-((i14111 & 95) << 1));
                                        int i14114 = ((i14112 | i14113) << 1) - (i14113 ^ i14112);
                                        int i14115 = i14114 % 128;
                                        b = i14115;
                                        int i14116 = i14114 % 2;
                                        int i14117 = i14115 + 19;
                                        a = i14117 % 128;
                                        int i14118 = i14117 % 2;
                                        rVar = rVar2;
                                        i25 = 2;
                                        i29 = 1;
                                        f2 = 0.0f;
                                    }
                                }
                            } else {
                                int i14119 = b;
                                int i1516 = ((i14119 & (-74)) | ((~i14119) & 73)) + ((i14119 & 73) << i29);
                                int i1517 = i1516 % 128;
                                a = i1517;
                                int i1518 = i1516 % i25;
                                int i1519 = i1517 ^ 27;
                                int i15110 = (i1517 & 27) << i29;
                                i24 = (i1519 & i15110) + (i15110 | i1519);
                                b = i24 % 128;
                                if (i24 % 2 == 0) {
                                    int i15111 = 5 % 3;
                                }
                            }
                            int i1520 = (i6 & (-38)) + (i6 | (-38));
                            int i1521 = (i1520 ^ (-1)) + (i1520 << 1);
                            int i1522 = i1521 ^ 40;
                            int i1523 = (i1521 & 40) << 1;
                            i6 = ((i1522 | i1523) << 1) - (i1522 ^ i1523);
                            i13 = a;
                            int i1610 = i13 & 31;
                            int i1611 = ((i13 ^ 31) | i1610) << 1;
                            int i1612 = -((~i1610) & (i13 | 31));
                            i14 = ((i1611 | i1612) << 1) - (i1611 ^ i1612);
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                Object obj10 = null;
                                obj10.hashCode();
                                throw null;
                            }
                            int i1613 = i13 ^ 99;
                            int i1614 = (i13 & 99) << 1;
                            int i1615 = (i1613 ^ i1614) + ((i1614 & i1613) << 1);
                            b = i1615 % 128;
                            int i1616 = i1615 % 2;
                            i25 = 2;
                            i29 = 1;
                            i32 = 19;
                            f2 = 0.0f;
                            i3 = -1;
                        }
                        if (i4 != i3) {
                            int i1617 = a;
                            int i1618 = ((i1617 | 115) << 1) - (i1617 ^ 115);
                            b = i1618 % 128;
                            int i1619 = i1618 % 2;
                            r rVar4 = this.m[i4];
                            tVar = rVar4.c;
                            int i1710 = a;
                            i10 = ((i1710 | 9) << 1) - (i1710 ^ 9);
                            b = i10 % 128;
                            if (i10 % 2 == 0) {
                                tVar.g = -1;
                                obj = this.q.f;
                                int i1711 = 51 / 0;
                            } else {
                                tVar.g = -1;
                                obj = this.q.f;
                            }
                            int i1712 = a;
                            int i1713 = i1712 & 7;
                            int i1714 = -(-((i1712 ^ 7) | i1713));
                            int i1715 = ((i1713 | i1714) << 1) - (i1714 ^ i1713);
                            b = i1715 % 128;
                            int i1716 = i1715 % 2;
                            rVar4.m(((t[]) obj)[i5]);
                            tVar2 = rVar4.c;
                            int i1717 = a;
                            i11 = ((i1717 & 35) - (~(-(-(i1717 | 35))))) - 1;
                            b = i11 % 128;
                            if (i11 % 2 == 0) {
                                tVar2.g = i4;
                                int i1718 = 49 / 0;
                            } else {
                                tVar2.g = i4;
                            }
                            tVar2.g(rVar4);
                            int i1719 = a + 97;
                            b = i1719 % 128;
                            i8 = 2;
                            int i189 = i1719 % 2;
                        } else {
                            i8 = 2;
                            z = true;
                        }
                        if (i > this.f62o / i8) {
                            int i1810 = b;
                            int i1811 = (((i1810 ^ 29) | (i1810 & 29)) << 1) - (((~i1810) & 29) | (i1810 & (-30)));
                            int i1812 = i1811 % 128;
                            a = i1812;
                            int i1813 = i1811 % 2;
                            int i1814 = (i1812 ^ 63) + ((i1812 & 63) << 1);
                            b = i1814 % 128;
                            int i1815 = i1814 % 2;
                            z = true;
                        }
                        int i1816 = a;
                        i9 = (i1816 ^ 111) + ((i1816 & 111) << 1);
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i1817 = 4 / 2;
                        }
                        i25 = 2;
                        i29 = 1;
                        i32 = 19;
                        f2 = 0.0f;
                    }
                    break;
                    break;
                }
            } else {
                continue;
            }
            int i190 = (i35 & (-2)) | ((~i35) & 1);
            int i191 = -(-((i35 & 1) << 1));
            i35 = (i190 ^ i191) + ((i190 & i191) << 1);
            int i192 = a;
            int i193 = (((i192 ^ 7) | (i192 & 7)) << 1) - (((~i192) & 7) | (i192 & (-8)));
            b = i193 % 128;
            int i194 = i193 % 2;
            i25 = 2;
            i29 = 1;
            i32 = 19;
        }
        s(ati);
        l();
        int i195 = b;
        int i196 = (((i195 | 26) << 1) - (i195 ^ 26)) - 1;
        a = i196 % 128;
        if (i196 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0278  */
    public void e(t tVar, t tVar2, int i, float f2, t tVar3, t tVar4, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 ^ 99) | (i5 & 99)) << 1;
        int i7 = -(((~i5) & 99) | (i5 & (-100)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            p();
            obj.hashCode();
            throw null;
        }
        r rVarP = p();
        if (tVar2 == tVar3) {
            rVarP.f.d(tVar, 1.0f);
            int i9 = a + 41;
            b = i9 % 128;
            int i10 = i9 % 2;
            rVarP.f.d(tVar4, 1.0f);
            int i11 = b + 79;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                rVarP.f.d(tVar2, -2.0f);
                obj.hashCode();
                throw null;
            }
            rVarP.f.d(tVar2, -2.0f);
            int i12 = a;
            int i13 = i12 & 93;
            int i14 = (i12 ^ 93) | i13;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
        } else if (f2 == 0.5f) {
            int i17 = a;
            int i18 = i17 & 97;
            int i19 = (((i17 | 97) & (~i18)) - (~(i18 << 1))) - 1;
            b = i19 % 128;
            if (i19 % 2 == 0) {
                rVarP.f.d(tVar, 0.0f);
            } else {
                rVarP.f.d(tVar, 1.0f);
            }
            int i20 = a;
            int i21 = (i20 ^ 38) + ((i20 & 38) << 1);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
            rVarP.f.d(tVar2, -1.0f);
            int i24 = a;
            int i25 = ((i24 ^ 23) | (i24 & 23)) << 1;
            int i26 = -(((~i24) & 23) | (i24 & (-24)));
            int i27 = (i25 & i26) + (i26 | i25);
            b = i27 % 128;
            int i28 = i27 % 2;
            rVarP.f.d(tVar3, -1.0f);
            int i29 = b;
            int i30 = ((i29 & 125) - (~(-(-(i29 | 125))))) - 1;
            a = i30 % 128;
            int i31 = i30 % 2;
            rVarP.f.d(tVar4, 1.0f);
            int i32 = a;
            int i33 = i32 & 27;
            int i34 = (((i32 | 27) & (~i33)) - (~(i33 << 1))) - 1;
            b = i34 % 128;
            if (i34 % 2 == 0) {
                throw null;
            }
            if (i > 0 || i2 > 0) {
                int i35 = -i;
                int i36 = -(-i2);
                int i37 = ((i35 ^ i36) | (i35 & i36)) << 1;
                int i38 = -(((~i35) & i36) | ((~i36) & i35));
                rVarP.d = ((i37 | i38) << 1) - (i38 ^ i37);
                int i39 = a;
                int i40 = ((i39 & (-72)) | ((~i39) & 71)) + ((i39 & 71) << 1);
                b = i40 % 128;
                if (i40 % 2 == 0) {
                    int i41 = 4 / 3;
                }
            }
        } else if (f2 <= 0.0f) {
            int i42 = b;
            int i43 = i42 & 27;
            int i44 = (i42 | 27) & (~i43);
            int i45 = -(-(i43 << 1));
            int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
            a = i46 % 128;
            if (i46 % 2 != 0) {
                rVarP.f.d(tVar, -1.0f);
                r.aTJ atj = rVarP.f;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            rVarP.f.d(tVar, -1.0f);
            r.aTJ atj2 = rVarP.f;
            int i47 = b + 4;
            int i48 = (i47 ^ (-1)) + (i47 << 1);
            a = i48 % 128;
            int i49 = i48 % 2;
            atj2.d(tVar2, 1.0f);
            rVarP.d = i;
            int i50 = b;
            int i51 = ((i50 ^ 59) | (i50 & 59)) << 1;
            int i52 = -(((~i50) & 59) | (i50 & (-60)));
            int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
            a = i53 % 128;
            int i54 = i53 % 2;
        } else if (f2 >= 1.0f) {
            int i55 = a;
            int i56 = (i55 ^ 39) + ((i55 & 39) << 1);
            b = i56 % 128;
            if (i56 % 2 == 0) {
                rVarP.f.d(tVar4, -1.0f);
                throw null;
            }
            rVarP.f.d(tVar4, -1.0f);
            int i57 = b;
            int i58 = (((i57 ^ 13) | (i57 & 13)) << 1) - (((~i57) & 13) | (i57 & (-14)));
            a = i58 % 128;
            if (i58 % 2 != 0) {
                rVarP.f.d(tVar3, 1.0f);
            } else {
                rVarP.f.d(tVar3, 1.0f);
            }
            rVarP.d = -i2;
            int i59 = a;
            int i60 = i59 ^ 19;
            int i61 = -(-((i59 & 19) << 1));
            int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
            b = i62 % 128;
            int i63 = i62 % 2;
        } else {
            r.aTJ atj3 = rVarP.f;
            float f3 = 1.0f - f2;
            int i64 = b;
            int i65 = ((i64 ^ 82) + ((i64 & 82) << 1)) - 1;
            a = i65 % 128;
            if (i65 % 2 != 0) {
                atj3.d(tVar, f3 * 1.0f);
            } else {
                atj3.d(tVar, f3 * 1.0f);
            }
            r.aTJ atj4 = rVarP.f;
            int i66 = b;
            int i67 = i66 & 23;
            int i68 = (i66 | 23) & (~i67);
            int i69 = -(-(i67 << 1));
            int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
            a = i70 % 128;
            if (i70 % 2 != 0) {
                atj4.d(tVar2, f3 - (-1.0f));
            } else {
                atj4.d(tVar2, f3 * (-1.0f));
            }
            rVarP.f.d(tVar3, f2 * (-1.0f));
            r.aTJ atj5 = rVarP.f;
            int i71 = b + 85;
            a = i71 % 128;
            int i72 = i71 % 2;
            atj5.d(tVar4, f2 * 1.0f);
            if (i <= 0) {
                int i73 = a;
                int i74 = i73 | 47;
                int i75 = i74 << 1;
                int i76 = -((~(i73 & 47)) & i74);
                int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                b = i77 % 128;
                int i78 = i77 % 2;
                if (i2 > 0) {
                    int i79 = b;
                    int i80 = i79 & 45;
                    int i81 = ((i79 | 45) & (~i80)) + (i80 << 1);
                    a = i81 % 128;
                    int i82 = i81 % 2;
                    rVarP.d = (i2 * f2) + ((-i) * f3);
                    int i83 = b;
                    int i84 = (((i83 | 68) << 1) - (i83 ^ 68)) - 1;
                    a = i84 % 128;
                    int i85 = i84 % 2;
                }
            } else {
                int i710 = b;
                int i86 = i710 & 45;
                int i87 = ((i710 | 45) & (~i86)) + (i86 << 1);
                a = i87 % 128;
                int i88 = i87 % 2;
                rVarP.d = (i2 * f2) + ((-i) * f3);
                int i89 = b;
                int i810 = (((i89 | 68) << 1) - (i89 ^ 68)) - 1;
                a = i810 % 128;
                int i811 = i810 % 2;
            }
        }
        if (i3 != 8) {
            int i90 = a;
            int i91 = ((i90 ^ 18) + ((i90 & 18) << 1)) - 1;
            b = i91 % 128;
            if (i91 % 2 == 0) {
                rVarP.g(this, i3);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            rVarP.g(this, i3);
        }
        f(rVarP);
        int i92 = b;
        int i93 = i92 & 65;
        int i94 = i92 | 65;
        int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
        a = i95 % 128;
        if (i95 % 2 != 0) {
            throw null;
        }
    }

    public void v() {
        e eVar;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 23;
        int i5 = (((~i4) & (i3 | 23)) - (~(i4 << 1))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2 != 0 ? 1 : 0;
        int i7 = (i3 ^ 121) + ((i3 & 121) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 4 % 4;
        }
        while (true) {
            eVar = this.q;
            Object obj = eVar.f;
            int i9 = b;
            int i10 = i9 + 11;
            a = i10 % 128;
            int i11 = i10 % 2;
            t[] tVarArr = (t[]) obj;
            if (i6 >= tVarArr.length) {
                break;
            }
            int i12 = ((i9 | 51) << 1) - (i9 ^ 51);
            a = i12 % 128;
            int i13 = i12 % 2;
            t tVar = tVarArr[i6];
            if (tVar != null) {
                int i14 = ((i9 ^ 47) | (i9 & 47)) << 1;
                int i15 = -(((~i9) & 47) | (i9 & (-48)));
                int i16 = (i14 & i15) + (i14 | i15);
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    tVar.e();
                    int i17 = 94 / 0;
                } else {
                    tVar.e();
                }
                int i18 = a;
                int i19 = i18 & 47;
                int i20 = i19 + ((i18 ^ 47) | i19);
                b = i20 % 128;
                int i21 = i20 % 2;
            }
            i6 = (((i6 | 2) << 1) - (i6 ^ 2)) - 1;
            int i22 = b;
            int i23 = ((i22 ^ 109) | (i22 & 109)) << 1;
            int i24 = -(((~i22) & 109) | (i22 & (-110)));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            a = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 5 % 4;
            }
        }
        C0086p c0086p = (C0086p) eVar.e;
        int i27 = a;
        int i28 = (((i27 & (-80)) | ((~i27) & 79)) - (~(-(-((i27 & 79) << 1))))) - 1;
        b = i28 % 128;
        int i29 = i28 % 2;
        t[] tVarArr2 = this.r;
        int length = this.t;
        int i30 = ((i27 | 29) << 1) - (i27 ^ 29);
        b = i30 % 128;
        int i31 = i30 % 2;
        Objects.requireNonNull(c0086p);
        if (length > tVarArr2.length) {
            int i32 = a;
            int i33 = i32 & 65;
            int i34 = (i33 - (~((i32 ^ 65) | i33))) - 1;
            b = i34 % 128;
            int i35 = i34 % 2;
            length = tVarArr2.length;
            int i36 = i32 & 27;
            int i37 = (i36 - (~(-(-((i32 ^ 27) | i36))))) - 1;
            b = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = a;
        int i40 = ((((i39 ^ 99) | (i39 & 99)) << 1) - (~(-(((~i39) & 99) | (i39 & (-100)))))) - 1;
        b = i40 % 128;
        int i41 = i40 % 2;
        int i42 = 0;
        while (true) {
            Object obj2 = null;
            if (i42 >= length) {
                this.t = 0;
                Object obj3 = this.q.f;
                int i43 = a + 39;
                b = i43 % 128;
                int i44 = i43 % 2;
                Arrays.fill((t[]) obj3, (Object) null);
                this.h = 0;
                int i45 = a;
                int i46 = i45 & 7;
                int i47 = ((((i45 ^ 7) | i46) << 1) - (~(-((i45 | 7) & (~i46))))) - 1;
                b = i47 % 128;
                int i48 = i47 % 2;
                this.i.clear();
                int i49 = a;
                int i50 = i49 & 23;
                int i51 = i50 + ((i49 ^ 23) | i50);
                b = i51 % 128;
                if (i51 % 2 == 0) {
                    this.f62o = 1;
                } else {
                    this.f62o = 1;
                }
                int i52 = 0;
                while (i52 < this.g) {
                    int i53 = b;
                    int i54 = i53 & 51;
                    int i55 = (((i53 | 51) & (~i54)) - (~(-(-(i54 << 1))))) - 1;
                    a = i55 % 128;
                    int i56 = i55 % 2;
                    Objects.requireNonNull(this.m[i52]);
                    int i57 = i52 & 1;
                    int i58 = (i52 ^ 1) | i57;
                    i52 = ((i58 & i57) << 1) + (i57 ^ i58);
                    int i59 = a;
                    int i60 = ((i59 | 33) << 1) - (i59 ^ 33);
                    b = i60 % 128;
                    int i61 = i60 % 2;
                }
                u();
                this.g = 0;
                if (!d) {
                    this.s = new r(this.q);
                    int i62 = b + 94;
                    int i63 = (i62 ^ (-1)) + (i62 << 1);
                    a = i63 % 128;
                    if (i63 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                this.s = new aTM(this, this.q);
                int i64 = a;
                int i65 = ((i64 ^ 78) + ((i64 & 78) << 1)) - 1;
                b = i65 % 128;
                if (i65 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
            int i66 = b;
            int i67 = i66 & 47;
            int i68 = i66 | 47;
            int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
            a = i69 % 128;
            if (i69 % 2 != 0) {
                t tVar2 = tVarArr2[i42];
                int i70 = c0086p.d;
                Object[] objArr = c0086p.c;
                obj2.hashCode();
                throw null;
            }
            t tVar3 = tVarArr2[i42];
            int i71 = c0086p.d;
            Object[] objArr2 = c0086p.c;
            if (i71 < objArr2.length) {
                int i72 = b;
                int i73 = (i72 & 77) + (i72 | 77);
                a = i73 % 128;
                if (i73 % 2 != 0) {
                    objArr2[i71] = tVar3;
                    i = i71 % 1;
                } else {
                    objArr2[i71] = tVar3;
                    int i74 = i71 & 1;
                    i = (i74 - (~((i71 ^ 1) | i74))) - 1;
                }
                int i75 = (i72 & (-26)) | ((~i72) & 25);
                int i76 = (i72 & 25) << 1;
                int i77 = ((i75 | i76) << 1) - (i75 ^ i76);
                a = i77 % 128;
                int i78 = i77 % 2;
                c0086p.d = i;
                int i79 = a;
                int i80 = i79 & 35;
                int i81 = ((i79 | 35) & (~i80)) + (i80 << 1);
                b = i81 % 128;
                int i82 = i81 % 2;
            }
            int i83 = i42 & 1;
            int i84 = (i42 | 1) & (~i83);
            int i85 = -(-(i83 << 1));
            i42 = ((i84 | i85) << 1) - (i84 ^ i85);
            int i86 = a;
            int i87 = (i86 & 103) + (i86 | 103);
            b = i87 % 128;
            int i88 = i87 % 2;
        }
    }
}
