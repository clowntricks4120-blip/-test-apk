package ivas.gov.bisp.enumeration.O;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class u {
    private static int a = 1;
    private static int b;
    public final a[] d = new a[4];
    public final Matrix[] e = new Matrix[4];
    public final Matrix[] f = new Matrix[4];
    public final PointF g = new PointF();
    public final Path i = new Path();
    public final Path h = new Path();
    public final a j = new a();
    public final float[] k = new float[2];
    public final float[] c = new float[2];
    public final Path l = new Path();
    public final Path m = new Path();
    public boolean n = true;

    public interface bfn {
    }

    public static class bfv {
        private static int a = 1;
        private static int b;
        public static final u c = new u();

        static {
            int i = a;
            int i2 = i & 89;
            int i3 = (i2 - (~(-(-((i ^ 89) | i2))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public u() {
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < 4) {
            this.d[i2] = new a();
            this.e[i2] = new Matrix();
            this.f[i2] = new Matrix();
            int i3 = a;
            int i4 = i3 ^ 65;
            int i5 = ((i3 & 65) | i4) << 1;
            int i6 = -i4;
            int i7 = (i5 & i6) + (i5 | i6);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            i2 = (i2 | 1) + (i2 & 1);
            int i10 = ((i8 & (-44)) | ((~i8) & 43)) + ((i8 & 43) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = b;
        int i13 = ((i12 | 57) << 1) - (i12 ^ 57);
        a = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0070  */
    public final boolean d(Path path, int i) {
        boolean z;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 2) << 1) - (i3 ^ 2);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.m.reset();
        this.d[i].e(this.e[i], this.m);
        RectF rectF = new RectF();
        int i7 = a;
        int i8 = ((i7 & 70) + (i7 | 70)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        path.computeBounds(rectF, true);
        this.m.computeBounds(rectF, true);
        int i10 = b;
        int i11 = i10 & 45;
        int i12 = (i10 | 45) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            path.op(this.m, Path.Op.INTERSECT);
            z = false;
        } else {
            path.op(this.m, Path.Op.INTERSECT);
            z = true;
        }
        path.computeBounds(rectF, z);
        if (!rectF.isEmpty()) {
            z2 = true;
        } else {
            int i15 = b;
            int i16 = i15 & 5;
            int i17 = (((i15 ^ 5) | i16) << 1) - ((i15 | 5) & (~i16));
            a = i17 % 128;
            if (i17 % 2 != 0 ? rectF.width() <= 1.0f : rectF.width() <= 1.0f) {
                int i18 = b;
                int i19 = ((i18 | 81) << 1) - (i18 ^ 81);
                a = i19 % 128;
                int i20 = i19 % 2;
            } else if (rectF.height() > 1.0f) {
                int i21 = b;
                int i22 = (i21 & (-116)) | ((~i21) & 115);
                int i23 = (i21 & 115) << 1;
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    z2 = true;
                }
            } else {
                int i110 = b;
                int i111 = ((i110 | 81) << 1) - (i110 ^ 81);
                a = i111 % 128;
                int i25 = i111 % 2;
            }
            z2 = false;
        }
        int i26 = a;
        int i27 = i26 & 49;
        int i28 = ((i26 | 49) & (~i27)) + (i27 << 1);
        b = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 89 / 0;
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0598  */
    /* JADX WARN: Code duplicated, block: B:126:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:92:0x042d  */
    public void c(t tVar, float f, RectF rectF, bfn bfnVar, Path path) {
        a aVar;
        char c;
        float fAbs;
        i iVar;
        char c2;
        int i;
        char c3;
        char c4;
        float[] fArr;
        a aVar2;
        h hVar;
        r rVar;
        int i2 = 2 % 2;
        path.rewind();
        this.i.rewind();
        this.h.rewind();
        this.h.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            int i4 = 4;
            int i5 = 3;
            if (i3 >= 4) {
                int i6 = 0;
                while (i6 < i4) {
                    int i7 = a;
                    int i8 = (i7 ^ 76) + ((i7 & 76) << 1);
                    int i9 = (i8 ^ (-1)) + (i8 << 1);
                    b = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    float[] fArr2 = this.k;
                    a[] aVarArr = this.d;
                    fArr2[0] = aVarArr[i6].c;
                    int i10 = b;
                    int i11 = i10 & 67;
                    int i12 = -(-((i10 ^ 67) | i11));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    fArr2[1] = aVarArr[i6].d;
                    Matrix[] matrixArr = this.e;
                    int i15 = a;
                    int i16 = i15 & 9;
                    int i17 = (i15 ^ 9) | i16;
                    int i18 = (i16 & i17) + (i17 | i16);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    matrixArr[i6].mapPoints(fArr2);
                    if (i6 == 0) {
                        int i20 = a;
                        int i21 = i20 & 97;
                        int i22 = -(-((i20 ^ 97) | i21));
                        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        float[] fArr3 = this.k;
                        float f2 = fArr3[0];
                        int i25 = i20 + 47;
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        path.moveTo(f2, fArr3[1]);
                    } else {
                        float[] fArr4 = this.k;
                        path.lineTo(fArr4[0], fArr4[1]);
                        int i27 = a;
                        int i28 = i27 & 21;
                        int i29 = (i27 ^ 21) | i28;
                        int i30 = (i28 & i29) + (i29 | i28);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                    }
                    a aVar3 = this.d[i6];
                    Matrix matrix = this.e[i6];
                    int i32 = a;
                    int i33 = i32 ^ 93;
                    int i34 = (i32 & 93) << 1;
                    int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    aVar3.e(matrix, path);
                    if (bfnVar != null) {
                        a aVar4 = this.d[i6];
                        Matrix[] matrixArr2 = this.e;
                        int i37 = b;
                        int i38 = i37 | 113;
                        int i39 = ((i38 << 1) - (~(-((~(i37 & 113)) & i38)))) - 1;
                        a = i39 % 128;
                        int i40 = i39 % 2;
                        Matrix matrix2 = matrixArr2[i6];
                        C0019p.bfo bfoVar = (C0019p.bfo) bfnVar;
                        BitSet bitSet = C0019p.this.i;
                        int i41 = a;
                        int i42 = i41 | 117;
                        int i43 = (i42 << 1) - ((~(i41 & 117)) & i42);
                        b = i43 % 128;
                        int i44 = i43 % 2;
                        Objects.requireNonNull(aVar4);
                        if (i44 != 0) {
                            bitSet.set(i6, true);
                        } else {
                            bitSet.set(i6, false);
                        }
                        a.bfx[] bfxVarArr = C0019p.this.f;
                        aVar4.d(aVar4.g);
                        l lVar = new l(aVar4, new ArrayList(aVar4.j), new Matrix(matrix2));
                        int i45 = b;
                        int i46 = i45 | 35;
                        int i47 = i46 << 1;
                        int i48 = -((~(i45 & 35)) & i46);
                        int i49 = (i47 & i48) + (i48 | i47);
                        a = i49 % 128;
                        int i50 = i49 % 2;
                        bfxVarArr[i6] = lVar;
                    }
                    int i51 = ((i6 & 2) + (i6 | 2)) - 1;
                    int i52 = i51 % 4;
                    float[] fArr5 = this.k;
                    a[] aVarArr2 = this.d;
                    float f3 = aVarArr2[i6].e;
                    int i53 = a + 9;
                    b = i53 % 128;
                    if (i53 % 2 != 0) {
                        fArr5[1] = f3;
                        fArr5[0] = aVarArr2[i6].f;
                    } else {
                        fArr5[0] = f3;
                        fArr5[1] = aVarArr2[i6].f;
                    }
                    this.e[i6].mapPoints(fArr5);
                    float[] fArr6 = this.c;
                    a[] aVarArr3 = this.d;
                    fArr6[0] = aVarArr3[i52].c;
                    fArr6[1] = aVarArr3[i52].d;
                    this.e[i52].mapPoints(fArr6);
                    float[] fArr7 = this.k;
                    float f4 = fArr7[0];
                    float[] fArr8 = this.c;
                    float fMax = Math.max(((float) Math.hypot(f4 - fArr8[0], fArr7[1] - fArr8[1])) - 0.001f, 0.0f);
                    float[] fArr9 = this.k;
                    int i54 = b;
                    int i55 = ((((i54 ^ 119) | (i54 & 119)) << 1) - (~(-((i54 & (-120)) | (119 & (~i54)))))) - 1;
                    a = i55 % 128;
                    if (i55 % 2 == 0) {
                        a[] aVarArr4 = this.d;
                        fArr9[0] = aVarArr4[i6].e;
                        aVar = aVarArr4[i6];
                        c = 0;
                    } else {
                        a[] aVarArr5 = this.d;
                        fArr9[0] = aVarArr5[i6].e;
                        aVar = aVarArr5[i6];
                        c = 1;
                    }
                    fArr9[c] = aVar.f;
                    this.e[i6].mapPoints(fArr9);
                    if (i6 != 1) {
                        int i56 = b;
                        int i57 = ((i56 & 67) - (~(-(-(i56 | 67))))) - 1;
                        a = i57 % 128;
                        int i58 = i57 % 2;
                        if (i6 != i5) {
                            fAbs = Math.abs(rectF.centerY() - this.k[1]);
                            int i59 = b;
                            int i60 = (i59 & 57) + (i59 | 57);
                            a = i60 % 128;
                            if (i60 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        } else {
                            fAbs = Math.abs(rectF.centerX() - this.k[0]);
                        }
                    } else {
                        fAbs = Math.abs(rectF.centerX() - this.k[0]);
                    }
                    this.j.g(0.0f, 0.0f, 270.0f, 0.0f);
                    int i61 = a;
                    int i62 = i61 & 5;
                    int i63 = (((~i62) & (i61 | 5)) - (~(-(-(i62 << 1))))) - 1;
                    b = i63 % 128;
                    if (i63 % 2 == 0 ? i6 == 1 : i6 == 1) {
                        iVar = tVar.n;
                        int i64 = b;
                        int i65 = ((i64 ^ 115) | (i64 & 115)) << 1;
                        c2 = 's';
                        int i66 = -((i64 & (-116)) | (115 & (~i64)));
                        int i67 = (i65 & i66) + (i66 | i65);
                        a = i67 % 128;
                        int i68 = i67 % 2;
                    } else {
                        int i69 = (((i61 ^ 9) | (i61 & 9)) << 1) - ((9 & (~i61)) | (i61 & (-10)));
                        int i70 = i69 % 128;
                        b = i70;
                        int i71 = i69 % 2;
                        if (i6 == 2) {
                            iVar = tVar.f49o;
                        } else if (i6 != i5) {
                            int i72 = i70 & 83;
                            int i73 = -(-((i70 ^ 83) | i72));
                            int i74 = (i72 & i73) + (i73 | i72);
                            a = i74 % 128;
                            if (i74 % 2 == 0) {
                                iVar = tVar.m;
                                int i75 = 97 / 0;
                            } else {
                                iVar = tVar.m;
                            }
                        } else {
                            iVar = tVar.d;
                        }
                        c2 = 's';
                    }
                    iVar.u(fMax, fAbs, f, this.j);
                    int i76 = a;
                    int i77 = (i76 & 125) + (i76 | 125);
                    b = i77 % 128;
                    int i78 = i77 % 2;
                    this.l.reset();
                    this.j.e(this.f[i6], this.l);
                    if (this.n) {
                        int i79 = a;
                        int i80 = ((i79 ^ 9) | (i79 & 9)) << 1;
                        int i81 = -((9 & (~i79)) | (i79 & (-10)));
                        int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                        b = i82 % 128;
                        int i83 = i82 % 2;
                        if (!d(this.l, i6)) {
                            int i84 = b;
                            int i85 = i84 & 1;
                            int i86 = -(-((i84 ^ 1) | i85));
                            int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                            a = i87 % 128;
                            int i88 = i87 % 2;
                            if (!d(this.l, i52)) {
                                a aVar5 = this.j;
                                Matrix matrix3 = this.f[i6];
                                int i89 = b;
                                int i90 = i89 & 35;
                                int i91 = ((i89 ^ 35) | i90) << 1;
                                int i92 = -((i89 | 35) & (~i90));
                                int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                                a = i93 % 128;
                                int i94 = i93 % 2;
                                aVar5.e(matrix3, path);
                                i = a + 37;
                                b = i % 128;
                                if (i % 2 != 0) {
                                    int i95 = 5 % i5;
                                }
                            }
                        }
                        Path path2 = this.l;
                        path2.op(path2, this.h, Path.Op.DIFFERENCE);
                        int i96 = b;
                        int i97 = i96 & 45;
                        int i98 = ((i96 | 45) & (~i97)) + (i97 << 1);
                        a = i98 % 128;
                        if (i98 % 2 == 0) {
                            fArr = this.k;
                            aVar2 = this.j;
                            c4 = 0;
                            int i99 = 82 / 0;
                        } else {
                            c4 = 0;
                            fArr = this.k;
                            aVar2 = this.j;
                        }
                        fArr[c4] = aVar2.c;
                        fArr[1] = aVar2.d;
                        Matrix[] matrixArr3 = this.f;
                        int i100 = b;
                        int i101 = ((i100 & (-112)) | ((~i100) & 111)) + ((i100 & 111) << 1);
                        a = i101 % 128;
                        int i102 = i101 % 2;
                        matrixArr3[i6].mapPoints(fArr);
                        Path path3 = this.i;
                        float[] fArr10 = this.k;
                        int i103 = b;
                        int i104 = ((i103 | 91) << 1) - (i103 ^ 91);
                        a = i104 % 128;
                        int i105 = i104 % 2;
                        path3.moveTo(fArr10[0], fArr10[1]);
                        int i106 = b + 47;
                        a = i106 % 128;
                        if (i106 % 2 == 0) {
                            Matrix matrix4 = this.f[i6];
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        this.j.e(this.f[i6], this.i);
                    } else {
                        a aVar6 = this.j;
                        Matrix matrix5 = this.f[i6];
                        int i810 = b;
                        int i910 = i810 & 35;
                        int i911 = ((i810 ^ 35) | i910) << 1;
                        int i912 = -((i810 | 35) & (~i910));
                        int i913 = ((i911 | i912) << 1) - (i912 ^ i911);
                        a = i913 % 128;
                        int i914 = i913 % 2;
                        aVar6.e(matrix5, path);
                        i = a + 37;
                        b = i % 128;
                        if (i % 2 != 0) {
                            int i915 = 5 % i5;
                        }
                    }
                    if (bfnVar != null) {
                        int i107 = b;
                        int i108 = i107 ^ 75;
                        int i109 = ((i107 & 75) | i108) << 1;
                        int i110 = -i108;
                        int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                        a = i111 % 128;
                        int i112 = i111 % 2;
                        a aVar7 = this.j;
                        Matrix matrix6 = this.f[i6];
                        int i113 = (i107 & (-52)) | ((~i107) & 51);
                        int i114 = (i107 & 51) << 1;
                        int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                        a = i115 % 128;
                        int i116 = i115 % 2;
                        C0019p.bfo bfoVar2 = (C0019p.bfo) bfnVar;
                        BitSet bitSet2 = C0019p.this.i;
                        int i117 = a;
                        int i118 = ((~i117) & 35) | (i117 & (-36));
                        int i119 = (i117 & 35) << 1;
                        int i120 = (i118 & i119) + (i118 | i119);
                        b = i120 % 128;
                        int i121 = i120 % 2;
                        Objects.requireNonNull(aVar7);
                        bitSet2.set((i6 & 4) + (i6 | 4), false);
                        a.bfx[] bfxVarArr2 = C0019p.this.g;
                        aVar7.d(aVar7.g);
                        bfxVarArr2[i6] = new l(aVar7, new ArrayList(aVar7.j), new Matrix(matrix6));
                        int i122 = b;
                        c3 = '\r';
                        int i123 = (((i122 & (-14)) | ((~i122) & 13)) - (~((i122 & 13) << 1))) - 1;
                        a = i123 % 128;
                        int i124 = i123 % 2;
                    } else {
                        c3 = '\r';
                    }
                    i6 = i51;
                    i4 = 4;
                    i5 = 3;
                }
                path.close();
                this.i.close();
                Path path4 = this.i;
                int i125 = b;
                int i126 = i125 & 83;
                int i127 = (i125 | 83) & (~i126);
                int i128 = i126 << 1;
                int i129 = (i127 & i128) + (i127 | i128);
                a = i129 % 128;
                int i130 = i129 % 2;
                if (path4.isEmpty()) {
                    return;
                }
                path.op(this.i, Path.Op.UNION);
                int i131 = b;
                int i132 = i131 & 117;
                int i133 = i132 + ((i131 ^ 117) | i132);
                a = i133 % 128;
                if (i133 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i134 = a;
            int i135 = i134 & 111;
            int i136 = (i135 - (~((i134 ^ 111) | i135))) - 1;
            b = i136 % 128;
            if (i136 % 2 == 0 ? i3 == 1 : i3 == 0) {
                hVar = tVar.k;
                int i137 = a;
                int i138 = i137 & 65;
                int i139 = (i137 | 65) & (~i138);
                int i140 = i138 << 1;
                int i141 = (i139 & i140) + (i139 | i140);
                b = i141 % 128;
                int i142 = i141 % 2;
            } else if (i3 != 2) {
                int i143 = i134 + 21;
                b = i143 % 128;
                int i144 = i143 % 2;
                if (i3 != 3) {
                    hVar = tVar.i;
                    int i145 = b;
                    int i146 = i145 & 25;
                    int i147 = (~i146) & (i145 | 25);
                    int i148 = i146 << 1;
                    int i149 = (i147 & i148) + (i147 | i148);
                    a = i149 % 128;
                    if (i149 % 2 == 0) {
                        int i150 = 4 / 3;
                    }
                } else {
                    hVar = tVar.j;
                }
            } else {
                hVar = tVar.l;
            }
            if (i3 == 1) {
                rVar = tVar.g;
                int i151 = b + 90;
                int i152 = (i151 ^ (-1)) + (i151 << 1);
                a = i152 % 128;
                int i153 = i152 % 2;
            } else if (i3 != 2) {
                int i154 = a;
                int i155 = ((i154 & 13) - (~(i154 | 13))) - 1;
                b = i155 % 128;
                rVar = (i155 % 2 == 0 ? i3 == 3 : i3 == 4) ? tVar.e : tVar.f;
            } else {
                rVar = tVar.h;
            }
            a aVar8 = this.d[i3];
            Objects.requireNonNull(rVar);
            rVar.H(aVar8, 90.0f, f, hVar.b(rectF));
            int i156 = i3 + 1;
            float f5 = i156 * 90;
            int i157 = a;
            int i158 = i157 & 89;
            int i159 = i158 + ((i157 ^ 89) | i158);
            b = i159 % 128;
            if (i159 % 2 != 0) {
                this.e[i3].reset();
                throw null;
            }
            this.e[i3].reset();
            PointF pointF = this.g;
            if (i3 != 1) {
                int i160 = a + 101;
                int i161 = i160 % 128;
                b = i161;
                int i162 = i160 % 2;
                if (i3 != 2) {
                    int i163 = ((i161 ^ 19) | (i161 & 19)) << 1;
                    int i164 = -((19 & (~i161)) | (i161 & (-20)));
                    int i165 = (i163 & i164) + (i163 | i164);
                    a = i165 % 128;
                    if (i165 % 2 != 0 ? i3 == 3 : i3 == 3) {
                        pointF.set(rectF.left, rectF.top);
                        int i166 = a + 41;
                        b = i166 % 128;
                        int i167 = i166 % 2;
                    } else {
                        pointF.set(rectF.right, rectF.top);
                        int i168 = b + 115;
                        a = i168 % 128;
                        int i169 = i168 % 2;
                    }
                } else {
                    pointF.set(rectF.left, rectF.bottom);
                    int i170 = b;
                    int i171 = i170 & 123;
                    int i172 = ((((i170 ^ 123) | i171) << 1) - (~(-((i170 | 123) & (~i171))))) - 1;
                    a = i172 % 128;
                    int i173 = i172 % 2;
                }
            } else {
                pointF.set(rectF.right, rectF.bottom);
                int i174 = a;
                int i175 = (i174 ^ 57) + ((i174 & 57) << 1);
                b = i175 % 128;
                int i176 = i175 % 2;
            }
            Matrix matrix7 = this.e[i3];
            PointF pointF2 = this.g;
            float f6 = pointF2.x;
            int i177 = b;
            int i178 = i177 & 103;
            int i179 = (((i177 | 103) & (~i178)) - (~(-(-(i178 << 1))))) - 1;
            a = i179 % 128;
            if (i179 % 2 == 0) {
                Object obj3 = null;
                matrix7.setTranslate(f6, pointF2.y);
                this.e[i3].preRotate(f5);
                obj3.hashCode();
                throw null;
            }
            matrix7.setTranslate(f6, pointF2.y);
            this.e[i3].preRotate(f5);
            float[] fArr11 = this.k;
            a[] aVarArr6 = this.d;
            float f7 = aVarArr6[i3].e;
            int i180 = a + 97;
            b = i180 % 128;
            int i181 = i180 % 2;
            fArr11[0] = f7;
            fArr11[1] = aVarArr6[i3].f;
            this.e[i3].mapPoints(fArr11);
            Matrix[] matrixArr4 = this.f;
            int i182 = b;
            int i183 = (-2) - (((i182 & 6) + (i182 | 6)) ^ (-1));
            a = i183 % 128;
            if (i183 % 2 == 0) {
                matrixArr4[i3].reset();
                Matrix matrix8 = this.f[i3];
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            matrixArr4[i3].reset();
            Matrix matrix9 = this.f[i3];
            float[] fArr12 = this.k;
            matrix9.setTranslate(fArr12[0], fArr12[1]);
            Matrix matrix10 = this.f[i3];
            int i184 = a;
            int i185 = i184 & 107;
            int i186 = (i184 ^ 107) | i185;
            int i187 = ((i185 | i186) << 1) - (i186 ^ i185);
            b = i187 % 128;
            if (i187 % 2 != 0) {
                matrix10.preRotate(f5);
                int i188 = 16 / 0;
            } else {
                matrix10.preRotate(f5);
            }
            i3 = i156;
        }
    }
}
