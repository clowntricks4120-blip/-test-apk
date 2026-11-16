package ivas.gov.bisp.enumeration.p003ac;

import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class r implements i.aTI {
    private static int a = 1;
    private static int b;
    public aTJ f;
    public t c = null;
    public float d = 0.0f;
    public ArrayList<t> e = new ArrayList<>();
    public boolean g = false;

    public interface aTJ {
        t a(int i);

        float b(int i);

        boolean c(t tVar);

        void clear();

        void d(t tVar, float f);

        float e(t tVar);

        void f(t tVar, float f, boolean z);

        float g(t tVar, boolean z);

        float h(r rVar, boolean z);

        int i();

        void n(float f);

        void o();
    }

    public r() {
    }

    @Override // ivas.gov.bisp.enumeration.ac.i.aTI
    public t b(i iVar, boolean[] zArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 60) + (i2 | 60)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return d(zArr, null);
        }
        d(zArr, null);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ca  */
    @Override // ivas.gov.bisp.enumeration.ac.i.aTI
    public void e(t tVar) {
        int i;
        float f;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 63) + ((i3 & 63) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = tVar.h;
        if (i6 != 1) {
            int i7 = a;
            int i8 = ((i7 ^ 37) | (i7 & 37)) << 1;
            int i9 = -((i7 & (-38)) | ((~i7) & 37));
            int i10 = (i8 & i9) + (i8 | i9);
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            if (i6 == 2) {
                int i13 = ((i7 | 31) << 1) - (i7 ^ 31);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i14 = (((i7 & (-92)) | ((~i7) & 91)) - (~(-(-((i7 & 91) << 1))))) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
                f = 1000.0f;
            } else if (i6 == 3) {
                int i16 = (i7 & 17) + (i7 | 17);
                b = i16 % 128;
                int i17 = i16 % 2;
                int i18 = i7 + 45;
                b = i18 % 128;
                int i19 = i18 % 2;
                f = 1000000.0f;
            } else if (i6 == 4) {
                int i20 = i7 & 49;
                int i21 = ((~i20) & (i7 | 49)) + (i20 << 1);
                int i22 = i21 % 128;
                b = i22;
                int i23 = i21 % 2;
                int i24 = i22 + 123;
                a = i24 % 128;
                int i25 = i24 % 2;
                f = 1.0E9f;
            } else if (i6 == 5) {
                int i26 = (-2) - (((i11 & 72) + (i11 | 72)) ^ (-1));
                int i27 = i26 % 128;
                a = i27;
                if (i26 % 2 == 0) {
                    int i28 = 60 / 0;
                }
                int i29 = i27 & 39;
                int i30 = (((i27 ^ 39) | i29) << 1) - ((i27 | 39) & (~i29));
                b = i30 % 128;
                int i31 = i30 % 2;
                f = 1.0E12f;
            } else {
                int i32 = a;
                int i33 = i32 ^ 27;
                i = ((((i32 & 27) | i33) << 1) - (~(-i33))) - 1;
                b = i % 128;
                if (i % 2 != 0) {
                    int i34 = 2 % 3;
                }
                f = 1.0f;
            }
        } else {
            int i35 = a;
            int i36 = i35 ^ 27;
            i = ((((i35 & 27) | i36) << 1) - (~(-i36))) - 1;
            b = i % 128;
            if (i % 2 != 0) {
                int i37 = 2 % 3;
            }
            f = 1.0f;
        }
        this.f.d(tVar, f);
        int i38 = b;
        int i39 = i38 & 53;
        int i40 = -(-((i38 ^ 53) | i39));
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        a = i41 % 128;
        int i42 = i41 % 2;
    }

    public r g(i iVar, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 17;
        int i5 = -(-((i3 ^ 17) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            iVar.m(i, "ep");
            throw null;
        }
        this.f.d(iVar.m(i, "ep"), 1.0f);
        aTJ atj = this.f;
        int i7 = b;
        int i8 = i7 ^ 73;
        int i9 = ((i7 & 73) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        atj.d(iVar.m(i, "em"), -1.0f);
        int i13 = a;
        int i14 = ((i13 ^ 38) + ((i13 & 38) << 1)) - 1;
        int i15 = i14 % 128;
        b = i15;
        if (i14 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i16 = i15 ^ 85;
        int i17 = (((i15 & 85) | i16) << 1) - i16;
        a = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 28 / 0;
        }
        return this;
    }

    public r h(t tVar, t tVar2, t tVar3, t tVar4, float f) {
        aTJ atj;
        float f2;
        int i = 2 % 2;
        int i2 = a + 49;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.f.d(tVar, -1.0f);
        int i4 = a;
        int i5 = i4 ^ 113;
        int i6 = (((i4 & 113) | i5) << 1) - i5;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            atj = this.f;
            f2 = 0.0f;
        } else {
            atj = this.f;
            f2 = 1.0f;
        }
        atj.d(tVar2, f2);
        this.f.d(tVar3, f);
        int i7 = b + 115;
        a = i7 % 128;
        int i8 = i7 % 2;
        this.f.d(tVar4, -f);
        int i9 = b;
        int i10 = i9 + 123;
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = ((i9 ^ 122) + ((i9 & 122) << 1)) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean l(t tVar) {
        boolean z;
        int i = 2 % 2;
        int i2 = b + 32;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (tVar.f63o > 1) {
            int i5 = a;
            int i6 = i5 & 15;
            int i7 = -(-((i5 ^ 15) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        } else {
            z = true;
        }
        int i10 = b;
        int i11 = (((i10 ^ 7) | (i10 & 7)) << 1) - (((~i10) & 7) | (i10 & (-8)));
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.ac.i.aTI
    public void clear() {
        float f;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = i3 + ((i2 ^ 117) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.f.clear();
        int i6 = b;
        int i7 = (i6 & 77) + (i6 | 77);
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 == 0) {
            this.c = null;
            f = 2.0f;
        } else {
            this.c = null;
            f = 0.0f;
        }
        this.d = f;
        int i9 = i8 & 57;
        int i10 = -(-((i8 ^ 57) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    public r k(t tVar, t tVar2, t tVar3, t tVar4, float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 22) + ((i2 & 22) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.f.d(tVar3, 0.5f);
        aTJ atj = this.f;
        int i5 = b;
        int i6 = i5 & 91;
        int i7 = ((i5 ^ 91) | i6) << 1;
        int i8 = -((i5 | 91) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        atj.d(tVar4, 0.5f);
        aTJ atj2 = this.f;
        int i11 = a;
        int i12 = (i11 & (-96)) | ((~i11) & 95);
        int i13 = -(-((i11 & 95) << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        atj2.d(tVar, -0.5f);
        this.f.d(tVar2, -0.5f);
        int i16 = a;
        int i17 = i16 & 21;
        int i18 = (i16 ^ 21) | i17;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        int i20 = i19 % 128;
        b = i20;
        int i21 = i19 % 2;
        this.d = -f;
        int i22 = i20 & 37;
        int i23 = (i20 | 37) & (~i22);
        int i24 = i22 << 1;
        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    public void o(r rVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 6) + (i2 | 6)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.f.h(rVar, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fH = this.f.h(rVar, z);
        int i4 = a;
        int i5 = i4 ^ 89;
        int i6 = ((i4 & 89) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        float f = this.d;
        float f2 = rVar.d * fH;
        int i11 = i9 & 77;
        int i12 = ((i9 | 77) & (~i11)) + (i11 << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            this.d = f2 - f;
            if (!(!z)) {
                rVar.c.d(this);
                int i13 = b;
                int i14 = (((i13 | 74) << 1) - (i13 ^ 74)) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        } else {
            this.d = f2 + f;
            if (z) {
                rVar.c.d(this);
                int i16 = b;
                int i17 = (((i16 | 74) << 1) - (i16 ^ 74)) - 1;
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        int i19 = b;
        int i20 = (i19 & (-86)) | ((~i19) & 85);
        int i21 = -(-((i19 & 85) << 1));
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 42 / 0;
        }
    }

    public void n(t tVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 67;
        int i4 = (i2 & 67) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            boolean z2 = tVar.i;
            throw null;
        }
        if (!tVar.i) {
            int i6 = a + 15;
            b = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        float fE = this.f.e(tVar);
        float f = this.d;
        int i8 = a;
        int i9 = ((i8 ^ 76) + ((i8 & 76) << 1)) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        this.d = (tVar.j * fE) + f;
        aTJ atj = this.f;
        int i11 = a;
        int i12 = ((i11 & 107) - (~(-(-(i11 | 107))))) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        atj.g(tVar, z);
        if (z) {
            int i14 = a;
            int i15 = ((i14 & 110) + (i14 | 110)) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            tVar.d(this);
            int i17 = b;
            int i18 = (i17 ^ 31) + ((i17 & 31) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a + 11;
        b = i20 % 128;
        int i21 = i20 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00df  */
    public r i(t tVar, t tVar2, t tVar3, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 119) + (i4 | 119);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (i != 0) {
            int i8 = (i6 ^ 55) + ((i6 & 55) << 1);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            if (i < 0) {
                int i11 = (i9 & 59) + (i9 | 59);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = (i ^ (-1)) | i;
                    int i13 = (i ^ i12) + ((i & i12) << 1);
                    z = false;
                    i = i13;
                } else {
                    i *= -1;
                    z = true;
                }
            } else {
                z = false;
            }
            this.d = i;
            int i14 = i9 + 103;
            b = i14 % 128;
            int i15 = i14 % 2;
            if (!z) {
                int i16 = a;
                int i17 = i16 ^ 71;
                int i18 = -(-((i16 & 71) << 1));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                b = i19 % 128;
                int i20 = i19 % 2;
                this.f.d(tVar, -1.0f);
                int i21 = b + 93;
                a = i21 % 128;
                int i22 = i21 % 2;
                this.f.d(tVar2, 1.0f);
                int i23 = b;
                i2 = (((i23 & (-70)) | ((~i23) & 69)) - (~(-(-((i23 & 69) << 1))))) - 1;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    this.f.d(tVar3, -1.0f);
                    int i24 = 4 / 0;
                } else {
                    this.f.d(tVar3, -1.0f);
                }
                int i25 = b + 75;
                a = i25 % 128;
                int i26 = i25 % 2;
            } else {
                this.f.d(tVar, 1.0f);
                aTJ atj = this.f;
                int i27 = a;
                int i28 = (i27 & 121) + (i27 | 121);
                b = i28 % 128;
                int i29 = i28 % 2;
                atj.d(tVar2, -1.0f);
                aTJ atj2 = this.f;
                int i30 = b;
                int i31 = (-2) - (((i30 ^ 36) + ((i30 & 36) << 1)) ^ (-1));
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    atj2.d(tVar3, 1.0f);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                atj2.d(tVar3, 1.0f);
                int i32 = b;
                int i33 = i32 & 37;
                int i34 = ((i32 ^ 37) | i33) << 1;
                int i35 = -((i32 | 37) & (~i33));
                int i36 = (i34 & i35) + (i35 | i34);
                a = i36 % 128;
                int i37 = i36 % 2;
            }
        } else {
            int i110 = a;
            int i111 = i110 ^ 71;
            int i112 = -(-((i110 & 71) << 1));
            int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
            b = i113 % 128;
            int i210 = i113 % 2;
            this.f.d(tVar, -1.0f);
            int i211 = b + 93;
            a = i211 % 128;
            int i212 = i211 % 2;
            this.f.d(tVar2, 1.0f);
            int i213 = b;
            i2 = (((i213 & (-70)) | ((~i213) & 69)) - (~(-(-((i213 & 69) << 1))))) - 1;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                this.f.d(tVar3, -1.0f);
                int i214 = 4 / 0;
            } else {
                this.f.d(tVar3, -1.0f);
            }
            int i215 = b + 75;
            a = i215 % 128;
            int i216 = i215 % 2;
        }
        int i38 = b;
        int i39 = (((i38 | 13) << 1) - (~(-(i38 ^ 13)))) - 1;
        a = i39 % 128;
        int i40 = i39 % 2;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0114  */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:45:0x012c  */
    public final t d(boolean[] zArr, t tVar) {
        int i;
        int i2;
        float fB;
        t tVarA;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 53;
        int i8 = (i6 | 53) & (~i7);
        int i9 = i7 << 1;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            i = this.f.i();
            i2 = 1;
        } else {
            i = this.f.i();
            i2 = 0;
        }
        int i11 = a;
        int i12 = i11 & 49;
        int i13 = ((i11 ^ 49) | i12) << 1;
        int i14 = -((i11 | 49) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        Object obj = null;
        float f = 0.0f;
        t tVar2 = null;
        while (i2 < i) {
            int i17 = b;
            int i18 = i17 | 123;
            int i19 = ((i18 << 1) - (~(-((~(i17 & 123)) & i18)))) - 1;
            a = i19 % 128;
            if (i19 % 2 == 0) {
                fB = this.f.b(i2);
                int i20 = 98 / 0;
            } else {
                fB = this.f.b(i2);
            }
            if (fB < 0.0f) {
                int i21 = b + 49;
                a = i21 % 128;
                if (i21 % 2 == 0) {
                    tVarA = this.f.a(i2);
                    int i22 = 82 / 0;
                } else {
                    tVarA = this.f.a(i2);
                }
                int i23 = b;
                int i24 = i23 & 53;
                int i25 = ((i23 ^ 53) | i24) << 1;
                int i26 = -((~i24) & (i23 | 53));
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                a = i27 % 128;
                int i28 = i27 % 2;
                if (zArr != null) {
                    int i29 = (i23 & (-96)) | ((~i23) & 95);
                    int i30 = -(-((i23 & 95) << 1));
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    a = i31 % 128;
                    if (i31 % 2 == 0) {
                        i4 = tVarA.f;
                        int i32 = 69 / 0;
                    } else {
                        i4 = tVarA.f;
                    }
                    int i33 = a + 8;
                    int i34 = (i33 ^ (-1)) + (i33 << 1);
                    b = i34 % 128;
                    if (i34 % 2 != 0) {
                        boolean z = zArr[i4];
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!zArr[i4])) {
                    }
                }
                if (tVarA != tVar) {
                    int i35 = a;
                    int i36 = i35 ^ 119;
                    int i37 = -(-((i35 & 119) << 1));
                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                    b = i38 % 128;
                    if (i38 % 2 == 0 ? (i3 = tVarA.d) != 3 : (i3 = tVarA.d) != 5) {
                        int i39 = b;
                        int i40 = (i39 ^ 55) + ((i39 & 55) << 1);
                        a = i40 % 128;
                        int i41 = i40 % 2;
                        if (i3 == 4) {
                            if (fB < f) {
                                int i42 = a;
                                int i43 = i42 + 67;
                                b = i43 % 128;
                                int i44 = i43 % 2;
                                int i45 = i42 + 119;
                                b = i45 % 128;
                                int i46 = i45 % 2;
                                f = fB;
                                tVar2 = tVarA;
                            }
                        }
                    } else if (fB < f) {
                        int i47 = a;
                        int i48 = i47 + 67;
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        int i410 = i47 + 119;
                        b = i410 % 128;
                        int i411 = i410 % 2;
                        f = fB;
                        tVar2 = tVarA;
                    }
                }
            }
            int i50 = i2 + 82;
            i2 = ((i50 & (-81)) << 1) + (i50 ^ (-81));
            int i51 = a;
            int i52 = (i51 ^ 27) + ((i51 & 27) << 1);
            b = i52 % 128;
            if (i52 % 2 != 0) {
                int i53 = 3 / 2;
            }
        }
        int i54 = a;
        int i55 = (i54 ^ 11) + ((i54 & 11) << 1);
        b = i55 % 128;
        if (i55 % 2 != 0) {
            int i56 = 6 / 0;
        }
        return tVar2;
    }

    public r(e eVar) {
        this.f = new h(this, eVar);
    }

    public String toString() {
        String string;
        boolean z;
        t tVarA;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-104)) | ((~i2) & 103)) - (~(-(-((i2 & 103) << 1))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.c == null) {
            int i5 = i4 ^ 105;
            int i6 = (i4 & 105) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            string = "0";
        } else {
            StringBuilder sbW = j.w(BuildConfig.FLAVOR);
            t tVar = this.c;
            int i9 = b + 7;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                sbW.append(tVar);
                sbW.toString();
                obj.hashCode();
                throw null;
            }
            sbW.append(tVar);
            string = sbW.toString();
            int i10 = a;
            int i11 = (((i10 ^ 97) | (i10 & 97)) << 1) - (((~i10) & 97) | (i10 & (-98)));
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        String strR = j.r(string, " = ");
        float f = this.d;
        int i13 = a;
        int i14 = ((i13 ^ 23) - (~((i13 & 23) << 1))) - 1;
        int i15 = i14 % 128;
        b = i15;
        int i16 = i14 % 2;
        int i17 = 0;
        if (f != 0.0f) {
            int i18 = i15 + 61;
            a = i18 % 128;
            int i19 = i18 % 2;
            StringBuilder sbW2 = j.w(strR);
            sbW2.append(this.d);
            int i20 = a;
            int i21 = (((i20 | 6) << 1) - (i20 ^ 6)) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
            strR = sbW2.toString();
            int i23 = b;
            int i24 = i23 & 97;
            int i25 = ((i23 ^ 97) | i24) << 1;
            int i26 = -((i23 | 97) & (~i24));
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
            z = true;
        } else {
            int i29 = i13 & 59;
            int i30 = (i13 | 59) & (~i29);
            int i31 = i29 << 1;
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            b = i32 % 128;
            if (i32 % 2 != 0) {
                int i33 = 3 / 5;
            }
            z = false;
        }
        int i34 = this.f.i();
        int i35 = a;
        int i36 = (((i35 & (-14)) | ((~i35) & 13)) - (~((i35 & 13) << 1))) - 1;
        b = i36 % 128;
        int i37 = i36 % 2;
        int i38 = 0;
        while (i38 < i34) {
            int i39 = b;
            int i40 = i39 & 39;
            int i41 = ((i39 | 39) & (~i40)) + (i40 << 1);
            a = i41 % 128;
            if (i41 % 2 == 0) {
                tVarA = this.f.a(i38);
                int i42 = 13 / i17;
            } else {
                tVarA = this.f.a(i38);
            }
            int i43 = b;
            int i44 = i43 + 59;
            a = i44 % 128;
            int i45 = i44 % 2;
            if (tVarA != null) {
                int i46 = i43 & 19;
                int i47 = i46 + ((i43 ^ 19) | i46);
                a = i47 % 128;
                int i48 = i47 % 2;
                float fB = this.f.b(i38);
                int i49 = b;
                int i50 = i49 & 13;
                int i51 = (~i50) & (i49 | 13);
                int i52 = -(-(i50 << 1));
                int i53 = (i51 & i52) + (i51 | i52);
                a = i53 % 128;
                int i54 = i53 % 2;
                if (fB != 0.0f) {
                    int i55 = (i49 & 10) + (i49 | 10);
                    int i56 = (i55 ^ (-1)) + (i55 << 1);
                    a = i56 % 128;
                    int i57 = i56 % 2;
                    String string2 = tVarA.toString();
                    if (!z) {
                        int i58 = a;
                        int i59 = (i58 ^ 93) + ((i58 & 93) << 1);
                        b = i59 % 128;
                        if (i59 % 2 == 0 ? fB < 0.0f : fB < 2.0f) {
                            strR = j.r(strR, "- ");
                            int i60 = a;
                            int i61 = (((i60 | 103) << 1) - (~(-(((~i60) & 103) | (i60 & (-104)))))) - 1;
                            b = i61 % 128;
                            int i62 = i61 % 2;
                            fB *= -1.0f;
                            int i63 = a;
                            int i64 = i63 & 37;
                            int i65 = (i63 ^ 37) | i64;
                            int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                            b = i66 % 128;
                            int i67 = i66 % 2;
                        }
                    } else if (fB > 0.0f) {
                        int i68 = a;
                        int i69 = i68 & 47;
                        int i70 = i69 + ((i68 ^ 47) | i69);
                        b = i70 % 128;
                        int i71 = i70 % 2;
                        strR = j.r(strR, " + ");
                        int i72 = b + 51;
                        a = i72 % 128;
                        if (i72 % 2 == 0) {
                            int i73 = 2 % 3;
                        }
                    } else {
                        strR = j.r(strR, " - ");
                        int i74 = a;
                        int i75 = i74 & 1;
                        int i76 = ((i74 ^ 1) | i75) << 1;
                        int i77 = -((i74 | 1) & (~i75));
                        int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                        b = i78 % 128;
                        int i79 = i78 % 2;
                        fB *= -1.0f;
                        int i610 = a;
                        int i611 = i610 & 37;
                        int i612 = (i610 ^ 37) | i611;
                        int i613 = (i611 ^ i612) + ((i612 & i611) << 1);
                        b = i613 % 128;
                        int i614 = i613 % 2;
                    }
                    if (fB == 1.0f) {
                        int i80 = b;
                        int i81 = i80 & 109;
                        int i82 = (i81 - (~(-(-((i80 ^ 109) | i81))))) - 1;
                        a = i82 % 128;
                        if (i82 % 2 == 0) {
                            j.r(strR, string2);
                            throw null;
                        }
                        strR = j.r(strR, string2);
                        int i83 = a;
                        int i84 = (i83 & (-44)) | ((~i83) & 43);
                        int i85 = -(-((i83 & 43) << 1));
                        int i86 = (i84 & i85) + (i85 | i84);
                        b = i86 % 128;
                        int i87 = i86 % 2;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strR);
                        int i88 = a;
                        int i89 = ((i88 ^ 27) | (i88 & 27)) << 1;
                        int i90 = -(((~i88) & 27) | (i88 & (-28)));
                        int i91 = (i89 & i90) + (i90 | i89);
                        b = i91 % 128;
                        int i92 = i91 % 2;
                        sb.append(fB);
                        sb.append(" ");
                        int i93 = b;
                        int i94 = i93 & 111;
                        int i95 = ((i93 | 111) & (~i94)) + (i94 << 1);
                        a = i95 % 128;
                        if (i95 % 2 == 0) {
                            sb.append(string2);
                            sb.toString();
                            obj.hashCode();
                            throw null;
                        }
                        sb.append(string2);
                        strR = sb.toString();
                    }
                    int i96 = a;
                    int i97 = ((i96 & 103) - (~(-(-(i96 | 103))))) - 1;
                    b = i97 % 128;
                    int i98 = i97 % 2;
                    z = true;
                } else {
                    continue;
                }
            }
            int i99 = i38 & 49;
            int i100 = i99 + ((i38 ^ 49) | i99);
            int i101 = i100 & (-48);
            i38 = i101 + ((i100 ^ (-48)) | i101);
            int i102 = b;
            int i103 = (i102 ^ 103) + ((i102 & 103) << 1);
            a = i103 % 128;
            int i104 = i103 % 2;
            i17 = 0;
        }
        if (!z) {
            int i105 = a;
            int i106 = (((i105 ^ 9) | (i105 & 9)) << 1) - (((~i105) & 9) | (i105 & (-10)));
            b = i106 % 128;
            int i107 = i106 % 2;
            strR = j.r(strR, "0.0");
            int i108 = a;
            int i109 = (i108 & 102) + (i108 | 102);
            int i110 = (i109 ^ (-1)) + (i109 << 1);
            b = i110 % 128;
            int i111 = i110 % 2;
        }
        int i112 = b;
        int i113 = (i112 & 75) + (i112 | 75);
        a = i113 % 128;
        int i114 = i113 % 2;
        return strR;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b3  */
    public r j(t tVar, t tVar2, t tVar3, int i) {
        aTJ atj;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = b + 77;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (i != 0) {
            int i7 = i5 & 13;
            int i8 = i7 + ((i5 ^ 13) | i7);
            int i9 = i8 % 128;
            b = i9;
            if (i8 % 2 == 0 ? i >= 0 : i >= 0) {
                z = false;
            } else {
                i *= -1;
                int i10 = i9 & 43;
                int i11 = (((~i10) & (i9 | 43)) - (~(i10 << 1))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            }
            this.d = i;
            int i13 = i9 & 71;
            int i14 = (i9 ^ 71) | i13;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            a = i15 % 128;
            int i16 = i15 % 2;
            if (z) {
                this.f.d(tVar, 1.0f);
                int i17 = b;
                int i18 = ((i17 ^ 99) - (~(-(-((i17 & 99) << 1))))) - 1;
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    this.f.d(tVar2, -1.0f);
                    int i19 = 1 / 0;
                } else {
                    this.f.d(tVar2, -1.0f);
                }
                int i20 = a + 5;
                b = i20 % 128;
                int i21 = i20 % 2;
                this.f.d(tVar3, -1.0f);
                int i22 = a;
                int i23 = (i22 ^ 81) + ((i22 & 81) << 1);
                b = i23 % 128;
                int i24 = i23 % 2;
            } else {
                int i25 = a;
                int i26 = (i25 & 25) + (i25 | 25);
                b = i26 % 128;
                int i27 = i26 % 2;
                this.f.d(tVar, -1.0f);
                atj = this.f;
                i2 = b + 59;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    atj.d(tVar2, 0.0f);
                } else {
                    atj.d(tVar2, 1.0f);
                }
                this.f.d(tVar3, 1.0f);
                int i28 = a;
                int i29 = ((i28 | 61) << 1) - (i28 ^ 61);
                b = i29 % 128;
                int i30 = i29 % 2;
            }
        } else {
            int i210 = a;
            int i211 = (i210 & 25) + (i210 | 25);
            b = i211 % 128;
            int i212 = i211 % 2;
            this.f.d(tVar, -1.0f);
            atj = this.f;
            i2 = b + 59;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                atj.d(tVar2, 0.0f);
            } else {
                atj.d(tVar2, 1.0f);
            }
            this.f.d(tVar3, 1.0f);
            int i213 = a;
            int i214 = ((i213 | 61) << 1) - (i213 ^ 61);
            b = i214 % 128;
            int i31 = i214 % 2;
        }
        int i32 = b;
        int i33 = (i32 ^ 105) + ((i32 & 105) << 1);
        a = i33 % 128;
        if (i33 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void m(t tVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 74) << 1) - (i2 ^ 74)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        t tVar2 = this.c;
        if (tVar2 != null) {
            int i6 = i4 & 47;
            int i7 = ((i4 ^ 47) | i6) << 1;
            int i8 = -((i4 | 47) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                this.f.d(tVar2, -1.0f);
                this.c = null;
                throw null;
            }
            this.f.d(tVar2, -1.0f);
            this.c = null;
        }
        float fG = this.f.g(tVar, true) * (-1.0f);
        int i10 = b;
        int i11 = (i10 & (-20)) | ((~i10) & 19);
        int i12 = (i10 & 19) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        this.c = tVar;
        if (i15 != 0 ? fG == 1.0f : fG == 0.0f) {
            int i16 = ((i14 ^ 61) | (i14 & 61)) << 1;
            int i17 = -((i14 & (-62)) | ((~i14) & 61));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            return;
        }
        this.d /= fG;
        this.f.n(fG);
        int i20 = b;
        int i21 = ((i20 ^ 58) + ((i20 & 58) << 1)) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
    }
}
