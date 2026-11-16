package ivas.gov.bisp.enumeration.B;

import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class D extends Y {
    private static int a = 0;
    private static int b = 1;
    public static int[] m = new int[2];

    static {
        int i = (43 << 1) - 43;
        b = i % 128;
        int i2 = i % 2;
    }

    public D(C0087m c0087m) {
        super(c0087m);
        this.k.i = 4;
        this.c.i = 5;
        this.h = 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // ivas.gov.bisp.enumeration.B.Y
    public void i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 27;
        int i4 = i3 + ((i2 ^ 27) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        s sVar = this.k;
        if (i5 == 0) {
            int i6 = 32 / 0;
            if (sVar.l) {
                this.e.H = sVar.j;
                int i7 = b + 121;
                a = i7 % 128;
                int i8 = i7 % 2;
            }
        } else if (sVar.l) {
            this.e.H = sVar.j;
            int i9 = b + 121;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = i11 & 3;
        int i13 = -(-((i11 ^ 3) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 90 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r6.e.l == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r6.e.l == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r1 = ivas.gov.bisp.enumeration.B.D.a;
        r2 = r1 ^ 111;
        r1 = (r1 & 111) << 1;
        r4 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.B.D.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r2 = ivas.gov.bisp.enumeration.B.D.b;
        r4 = r2 & 91;
        r2 = (r2 ^ 91) | r4;
        r5 = (r4 ^ r2) + ((r2 & r4) << 1);
        ivas.gov.bisp.enumeration.B.D.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if ((r5 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r0 = 87 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        return false;
     */
    @Override // ivas.gov.bisp.enumeration.B.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.B.D.b
            r2 = r1 ^ 1
            r3 = r1 & 1
            r2 = r2 | r3
            r3 = 1
            int r2 = r2 << r3
            r4 = r1 & (-2)
            int r1 = ~r1
            r1 = r1 & r3
            r1 = r1 | r4
            int r1 = -r1
            r4 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.B.D.a = r1
            int r4 = r4 % r0
            r1 = 113(0x71, float:1.58E-43)
            if (r4 == 0) goto L26
            int r2 = r6.g
            r4 = 4
            if (r2 != r4) goto L7f
            goto L2b
        L26:
            int r2 = r6.g
            r4 = 3
            if (r2 != r4) goto L7f
        L2b:
            int r2 = ivas.gov.bisp.enumeration.B.D.a
            r4 = r2 ^ 113(0x71, float:1.58E-43)
            r5 = r2 & 113(0x71, float:1.58E-43)
            r4 = r4 | r5
            int r4 = r4 << r3
            r5 = r2 & (-114(0xffffffffffffff8e, float:NaN))
            int r2 = ~r2
            r1 = r1 & r2
            r1 = r1 | r5
            int r1 = -r1
            r2 = r4 | r1
            int r2 = r2 << r3
            r1 = r1 ^ r4
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.B.D.b = r1
            int r2 = r2 % r0
            r1 = 0
            if (r2 != 0) goto L50
            ivas.gov.bisp.enumeration.ad.m r2 = r6.e
            int r2 = r2.l
            r4 = 87
            int r4 = r4 / r1
            if (r2 != 0) goto L68
            goto L56
        L50:
            ivas.gov.bisp.enumeration.ad.m r2 = r6.e
            int r2 = r2.l
            if (r2 != 0) goto L68
        L56:
            int r1 = ivas.gov.bisp.enumeration.B.D.a
            r2 = r1 ^ 111(0x6f, float:1.56E-43)
            r1 = r1 & 111(0x6f, float:1.56E-43)
            int r1 = r1 << r3
            r4 = r2 | r1
            int r4 = r4 << r3
            r1 = r1 ^ r2
            int r4 = r4 - r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.B.D.b = r1
            int r4 = r4 % r0
            return r3
        L68:
            int r2 = ivas.gov.bisp.enumeration.B.D.b
            r4 = r2 & 91
            r2 = r2 ^ 91
            r2 = r2 | r4
            r5 = r4 ^ r2
            r2 = r2 & r4
            int r2 = r2 << r3
            int r5 = r5 + r2
            int r2 = r5 % 128
            ivas.gov.bisp.enumeration.B.D.a = r2
            int r5 = r5 % r0
            if (r5 == 0) goto L7e
            r0 = 87
            int r0 = r0 / r1
        L7e:
            return r1
        L7f:
            int r2 = ivas.gov.bisp.enumeration.B.D.b
            r4 = r2 ^ 113(0x71, float:1.58E-43)
            r1 = r1 & r2
            r1 = r1 | r4
            int r1 = r1 << r3
            int r2 = -r4
            r4 = r1 ^ r2
            r1 = r1 & r2
            int r1 = r1 << r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.B.D.a = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L94
            return r3
        L94:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.B.D.m():boolean");
    }

    public String toString() {
        StringBuilder sbW;
        String str;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = ((((i2 ^ 65) | i3) << 1) - (~(-((i2 | 65) & (~i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            sbW = j.w("HorizontalRun ");
            str = this.e.Z;
            int i5 = 61 / 0;
        } else {
            sbW = j.w("HorizontalRun ");
            str = this.e.Z;
        }
        int i6 = b;
        int i7 = (-2) - ((((i6 | 68) << 1) - (i6 ^ 68)) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        sbW.append(str);
        if (i8 == 0) {
            return sbW.toString();
        }
        sbW.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public void h() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 88) << 1) - (i2 ^ 88)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.f = null;
        this.k.d();
        s sVar = this.c;
        int i5 = a;
        int i6 = i5 & 45;
        int i7 = (i6 - (~(-(-((i5 ^ 45) | i6))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        sVar.d();
        this.i.d();
        this.j = false;
        int i9 = a;
        int i10 = i9 ^ 81;
        int i11 = ((i9 & 81) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 & i12) + (i11 | i12);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    public void o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 105) - (~(-(-((i2 & 105) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.j = false;
        this.k.d();
        this.k.l = false;
        this.c.d();
        s sVar = this.c;
        int i5 = a + 7;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            sVar.l = false;
        } else {
            sVar.l = false;
        }
        this.i.l = false;
    }

    public final void p(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = a;
        int i10 = i9 & 99;
        int i11 = ((i9 ^ 99) | i10) << 1;
        int i12 = -((i9 | 99) & (~i10));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        b = i14;
        if (i13 % 2 == 0) {
            int i15 = -(~(-i));
            i6 = ((i2 ^ i15) + ((i15 & i2) << 1)) - 1;
            i7 = i4 << i3;
        } else {
            i6 = (i2 - (~(-i))) - 1;
            int i16 = -i3;
            i7 = ((i16 & i4) << 1) + (i4 ^ i16);
        }
        if (i5 != -1) {
            int i17 = ((i14 ^ 91) | (i14 & 91)) << 1;
            int i18 = -((i14 & (-92)) | ((~i14) & 91));
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            a = i19 % 128;
            int i20 = i19 % 2;
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                int i21 = ((i14 & 3) - (~(-(-(i14 | 3))))) - 1;
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    iArr[1] = i7;
                    return;
                } else {
                    iArr[1] = i7;
                    return;
                }
            }
            int i22 = i14 & 103;
            int i23 = (i14 | 103) & (~i22);
            int i24 = i22 << 1;
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            int i26 = i25 % 128;
            a = i26;
            if (i25 % 2 == 0 ? i5 == 1 : i5 == 1) {
                int i27 = i26 & 5;
                int i28 = i27 + ((i26 ^ 5) | i27);
                int i29 = i28 % 128;
                b = i29;
                int i30 = (int) ((i28 % 2 == 0 ? i6 + f : i6 * f) + 0.5f);
                iArr[0] = i6;
                iArr[1] = i30;
                int i31 = (-2) - (((i29 & 74) + (i29 | 74)) ^ (-1));
                a = i31 % 128;
                if (i31 % 2 != 0) {
                    throw null;
                }
                return;
            }
        } else {
            int i32 = (int) ((i7 * f) + 0.5f);
            int i33 = i14 + 89;
            int i34 = i33 % 128;
            a = i34;
            int i35 = (int) (i33 % 2 != 0 ? (i6 % f) / 0.5f : (i6 / f) + 0.5f);
            if (i32 <= i6) {
                int i36 = i34 & 91;
                int i37 = (~i36) & (i34 | 91);
                int i38 = -(-(i36 << 1));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                b = i39 % 128;
                if (i39 % 2 == 0) {
                    iArr[1] = i32;
                    iArr[1] = i7;
                    return;
                } else {
                    iArr[0] = i32;
                    iArr[1] = i7;
                    return;
                }
            }
            if (i35 <= i7) {
                int i40 = i34 + 90;
                int i41 = (i40 ^ (-1)) + (i40 << 1);
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    iArr[1] = i6;
                    iArr[1] = i35;
                } else {
                    iArr[0] = i6;
                    iArr[1] = i35;
                }
            }
        }
        int i42 = b;
        int i43 = ((((i42 ^ 93) | (i42 & 93)) << 1) - (~(-(((~i42) & 93) | (i42 & (-94)))))) - 1;
        a = i43 % 128;
        if (i43 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:152:0x051f  */
    /* JADX WARN: Code duplicated, block: B:170:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:172:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:174:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:175:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:189:0x064b  */
    /* JADX WARN: Code duplicated, block: B:234:0x079b  */
    /* JADX WARN: Code duplicated, block: B:236:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:238:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:241:0x07ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:242:0x0801  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v140 */
    /* JADX WARN: Type inference failed for: r0v299 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r2v232 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v71 */
    @Override // ivas.gov.bisp.enumeration.B.Y, ivas.gov.bisp.enumeration.B.V
    public void b(V v) {
        int i;
        int i2;
        int iMax;
        int i3;
        C0087m c0087m;
        int i4;
        float f;
        ?? r2;
        ?? r4;
        int iJ;
        int i5;
        int iJ2;
        int i6;
        float f2;
        int i7;
        int iJ3;
        int i8;
        int iJ4;
        int i9;
        s sVar;
        int i10;
        int i11;
        int i12;
        int i13;
        List<s> list;
        float f3;
        float f4;
        int i14;
        float f5;
        int i15 = 2 % 2;
        if (P.c(this.l) == 3) {
            C0087m c0087m2 = this.e;
            n(c0087m2.B, c0087m2.C, 0);
            return;
        }
        C0015y c0015y = this.i;
        Object obj = null;
        if (c0015y.l) {
            i = 1;
        } else {
            int i16 = b;
            int i17 = i16 & 51;
            int i18 = (i16 | 51) & (~i17);
            int i19 = -(-(i17 << 1));
            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            if (this.g == 3) {
                int i22 = a;
                int i23 = i22 & 79;
                int i24 = i23 + ((i22 ^ 79) | i23);
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    c0087m = this.e;
                    i4 = c0087m.l;
                    int i25 = 18 / 0;
                } else {
                    c0087m = this.e;
                    i4 = c0087m.l;
                }
                if (i4 == 2) {
                    i = 1;
                    C0087m c0087m3 = c0087m.N;
                    if (c0087m3 != null) {
                        C0015y c0015y2 = c0087m3.g.i;
                        if (c0015y2.l) {
                            int i26 = (-2) - ((b + 94) ^ (-1));
                            a = i26 % 128;
                            if (i26 % 2 != 0) {
                                f = c0015y2.j % c0087m.q;
                            } else {
                                f = c0015y2.j * c0087m.q;
                            }
                            c0015y.e((int) (f + 0.5f));
                        }
                    }
                } else if (i4 != 3) {
                    i = 1;
                } else {
                    int i27 = c0087m.m;
                    if (i27 != 0) {
                        int i28 = b;
                        int i29 = i28 & 71;
                        int i30 = ((~i29) & (i28 | 71)) + (i29 << 1);
                        a = i30 % 128;
                        int i31 = i30 % 2;
                        if (i27 != 3) {
                            int i32 = (((i28 | 116) << 1) - (i28 ^ 116)) - 1;
                            a = i32 % 128;
                            int i33 = i32 % 2;
                            int i34 = c0087m.R;
                            if (i34 != -1) {
                                if (i34 != 0) {
                                    int i35 = a;
                                    int i36 = i35 ^ 43;
                                    int i37 = ((i35 & 43) | i36) << 1;
                                    int i38 = -i36;
                                    int i39 = (i37 & i38) + (i37 | i38);
                                    b = i39 % 128;
                                    if (i39 % 2 != 0 ? i34 == 1 : i34 == 0) {
                                        f3 = c0087m.i.i.j;
                                        int i40 = b;
                                        int i41 = (((i40 | 72) << 1) - (i40 ^ 72)) - 1;
                                        a = i41 % 128;
                                        if (i41 % 2 != 0) {
                                            float f6 = c0087m.Q;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        f4 = c0087m.Q;
                                    } else {
                                        i14 = 0;
                                    }
                                } else {
                                    f5 = c0087m.i.i.j / c0087m.Q;
                                    i14 = (int) (f5 + 0.5f);
                                }
                                c0015y.e(i14);
                                i = 1;
                            } else {
                                f3 = c0087m.i.i.j;
                                f4 = c0087m.Q;
                            }
                            f5 = f3 * f4;
                            i14 = (int) (f5 + 0.5f);
                            c0015y.e(i14);
                            i = 1;
                        }
                    }
                    X x = c0087m.i;
                    s sVar2 = x.k;
                    s sVar3 = x.c;
                    ?? r0 = c0087m.B.f != null;
                    if (c0087m.A.f != null) {
                        int i42 = b;
                        int i43 = i42 | 43;
                        int i44 = (i43 << 1) - ((~(i42 & 43)) & i43);
                        a = i44 % 128;
                        int i45 = i44 % 2;
                        r2 = true;
                    } else {
                        r2 = false;
                    }
                    ?? r3 = c0087m.C.f != null;
                    if (c0087m.E.f != null) {
                        int i46 = b;
                        int i47 = i46 & 101;
                        int i48 = (((i46 | 101) & (~i47)) - (~(-(-(i47 << 1))))) - 1;
                        a = i48 % 128;
                        int i49 = i48 % 2;
                        r4 = true;
                    } else {
                        r4 = false;
                    }
                    int i50 = c0087m.R;
                    if (r0 == true && (r2 ^ true) != true && r3 == true && r4 == true) {
                        float f7 = c0087m.Q;
                        if (!(!sVar2.l)) {
                            int i51 = b;
                            int i52 = i51 ^ 105;
                            int i53 = (i51 & 105) << 1;
                            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                            a = i54 % 128;
                            int i55 = i54 % 2;
                            if (sVar3.l) {
                                int i56 = a;
                                int i57 = i56 & 17;
                                int i58 = i57 + ((i56 ^ 17) | i57);
                                b = i58 % 128;
                                if (i58 % 2 == 0) {
                                    boolean z = this.k.f;
                                    throw null;
                                }
                                s sVar4 = this.k;
                                if ((!sVar4.f) || !this.c.f) {
                                    return;
                                }
                                int i59 = sVar4.n.get(0).j;
                                int i60 = a;
                                int i61 = i60 & 99;
                                int i62 = ((i60 | 99) & (~i61)) + (i61 << 1);
                                b = i62 % 128;
                                int i63 = i62 % 2;
                                int i64 = this.k.h;
                                int i65 = this.c.n.get(0).j;
                                int i66 = this.c.h;
                                int i67 = sVar2.j;
                                int i68 = sVar2.h;
                                int i69 = sVar3.j;
                                int i70 = sVar3.h;
                                int[] iArr = m;
                                int i71 = -(-i64);
                                int i72 = (i59 ^ i71) + ((i59 & i71) << 1);
                                int i73 = -i66;
                                int i74 = i65 & i73;
                                int i75 = (i73 ^ i65) | i74;
                                int i76 = (i74 & i75) + (i75 | i74);
                                int i77 = a;
                                int i78 = ((i77 ^ 44) + ((i77 & 44) << 1)) - 1;
                                b = i78 % 128;
                                if (i78 % 2 == 0) {
                                    p(iArr, i72, i76, i67 << i68, i69 / i70, f7, i50);
                                } else {
                                    int i79 = -(-i68);
                                    int i80 = ((i67 | i79) << 1) - (i79 ^ i67);
                                    int i81 = -(~(-i70));
                                    p(iArr, i72, i76, i80, ((i69 & i81) + (i81 | i69)) - 1, f7, i50);
                                }
                                C0015y c0015y3 = this.i;
                                int i82 = a + 115;
                                b = i82 % 128;
                                int i83 = i82 % 2;
                                c0015y3.e(iArr[0]);
                                C0015y c0015y4 = this.e.i.i;
                                int i84 = b + 123;
                                a = i84 % 128;
                                int i85 = i84 % 2;
                                c0015y4.e(iArr[1]);
                                return;
                            }
                        }
                        s sVar5 = this.k;
                        if (sVar5.l) {
                            int i86 = b;
                            int i87 = i86 & 77;
                            int i88 = -(-((i86 ^ 77) | i87));
                            int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                            a = i89 % 128;
                            if (i89 % 2 != 0) {
                                boolean z2 = this.c.l;
                                throw null;
                            }
                            s sVar6 = this.c;
                            if (sVar6.l) {
                                if (!sVar2.f || !sVar3.f) {
                                    return;
                                }
                                int i90 = sVar5.j;
                                int i91 = sVar5.h;
                                int i92 = sVar6.j;
                                int i93 = sVar6.h;
                                s sVar7 = sVar2.n.get(0);
                                int i94 = b;
                                int i95 = ((i94 | 29) << 1) - (i94 ^ 29);
                                a = i95 % 128;
                                if (i95 % 2 != 0) {
                                    i12 = sVar7.j;
                                    i13 = sVar2.h;
                                    list = sVar3.n;
                                    int i96 = 5 / 0;
                                } else {
                                    i12 = sVar7.j;
                                    i13 = sVar2.h;
                                    list = sVar3.n;
                                }
                                int i97 = list.get(0).j;
                                int i98 = sVar3.h;
                                int[] iArr2 = m;
                                int i99 = -(-i91);
                                int i100 = -(-i13);
                                int i101 = i12 & i100;
                                p(iArr2, (i90 & i99) + (i99 | i90), i92 - i93, (((i12 ^ i100) | i101) << 1) - ((i100 | i12) & (~i101)), (-2) - ((i97 - (~(-i98))) ^ (-1)), f7, i50);
                                this.i.e(iArr2[0]);
                                C0015y c0015y5 = this.e.i.i;
                                int i102 = b;
                                int i103 = ((i102 & 72) + (i102 | 72)) - 1;
                                a = i103 % 128;
                                int i104 = i103 % 2;
                                c0015y5.e(iArr2[1]);
                            }
                        }
                        s sVar8 = this.k;
                        if ((!sVar8.f) || !this.c.f) {
                            return;
                        }
                        int i105 = b;
                        int i106 = (((i105 | 26) << 1) - (i105 ^ 26)) - 1;
                        a = i106 % 128;
                        int i107 = i106 % 2;
                        if (!sVar2.f) {
                            return;
                        }
                        int i108 = a;
                        int i109 = i108 & 47;
                        int i110 = (i108 ^ 47) | i109;
                        int i111 = (i109 ^ i110) + ((i110 & i109) << 1);
                        b = i111 % 128;
                        int i112 = i111 % 2;
                        if (!sVar3.f) {
                            return;
                        }
                        int i113 = b;
                        int i114 = i113 & 31;
                        int i115 = (i113 | 31) & (~i114);
                        int i116 = -(-(i114 << 1));
                        int i117 = (i115 ^ i116) + ((i115 & i116) << 1);
                        a = i117 % 128;
                        int i118 = i117 % 2;
                        int i119 = sVar8.n.get(0).j;
                        s sVar9 = this.k;
                        int i120 = a;
                        int i121 = ((i120 ^ 34) + ((i120 & 34) << 1)) - 1;
                        b = i121 % 128;
                        if (i121 % 2 == 0) {
                            i9 = sVar9.h;
                            sVar = this.c.n.get(1);
                        } else {
                            i9 = sVar9.h;
                            sVar = this.c.n.get(0);
                        }
                        int i122 = sVar.j;
                        int i123 = this.c.h;
                        s sVar10 = sVar2.n.get(0);
                        int i124 = a;
                        int i125 = ((i124 | 23) << 1) - (i124 ^ 23);
                        b = i125 % 128;
                        if (i125 % 2 == 0) {
                            i10 = sVar10.j;
                            i11 = sVar2.h;
                        } else {
                            i10 = sVar10.j;
                            i11 = sVar2.h;
                        }
                        int i126 = sVar3.n.get(0).j;
                        int i127 = sVar3.h;
                        int[] iArr3 = m;
                        int i128 = -(~(-(-i9)));
                        int i129 = (-2) - (((i119 & i128) + (i119 | i128)) ^ (-1));
                        int i130 = -i123;
                        int i131 = i122 & i130;
                        int i132 = -(-((i130 ^ i122) | i131));
                        int i133 = (i131 & i132) + (i132 | i131);
                        int i134 = i10 ^ i11;
                        int i135 = ((i10 & i11) | i134) << 1;
                        int i136 = -i134;
                        int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                        int i138 = -(~(-i127));
                        p(iArr3, i129, i133, i137, ((i126 & i138) + (i138 | i126)) - 1, f7, i50);
                        this.i.e(iArr3[0]);
                        C0015y c0015y6 = this.e.i.i;
                        int i139 = a;
                        int i140 = i139 & 101;
                        int i141 = (((i139 ^ 101) | i140) << 1) - ((i139 | 101) & (~i140));
                        b = i141 % 128;
                        if (i141 % 2 == 0) {
                            c0015y6.e(iArr3[1]);
                        } else {
                            c0015y6.e(iArr3[1]);
                        }
                        i = 1;
                    } else {
                        i = 1;
                        if (r0 == true) {
                            int i142 = b;
                            int i143 = (i142 ^ 103) + ((i142 & 103) << 1);
                            a = i143 % 128;
                            int i144 = i143 % 2;
                            if (r3 == true) {
                                s sVar11 = this.k;
                                if (sVar11.f) {
                                    int i145 = a;
                                    int i146 = (i145 & 123) + (i145 | 123);
                                    b = i146 % 128;
                                    int i147 = i146 % 2;
                                    if (!(!this.c.f)) {
                                        float f8 = c0087m.Q;
                                        s sVar12 = sVar11.n.get(0);
                                        int i148 = a + 67;
                                        b = i148 % 128;
                                        if (i148 % 2 == 0) {
                                            i7 = sVar12.j + this.k.h;
                                        } else {
                                            int i149 = sVar12.j;
                                            int i150 = -(-this.k.h);
                                            i7 = (i149 | i150) + (i149 & i150);
                                        }
                                        int i151 = this.c.n.get(0).j;
                                        int i152 = -this.c.h;
                                        int i153 = (i151 & i152) + (i151 | i152);
                                        if (i50 != -1) {
                                            int i154 = a;
                                            int i155 = ((i154 ^ 105) | (i154 & 105)) << 1;
                                            int i156 = -(((~i154) & 105) | (i154 & (-106)));
                                            int i157 = (i155 & i156) + (i156 | i155);
                                            b = i157 % 128;
                                            int i158 = i157 % 2;
                                            if (i50 == 0) {
                                                int i159 = -i7;
                                                iJ3 = j(((i153 ^ i159) - (~(-(-((i159 & i153) << 1))))) - 1, 0);
                                                int i160 = b;
                                                int i161 = i160 & 21;
                                                int i162 = i161 + ((i160 ^ 21) | i161);
                                                a = i162 % 128;
                                                int i163 = i162 % 2;
                                                i8 = (int) ((iJ3 * f8) + 0.5f);
                                                iJ4 = j(i8, 1);
                                                if (i8 != iJ4) {
                                                    iJ3 = (int) ((iJ4 / f8) + 0.5f);
                                                }
                                                this.i.e(iJ3);
                                                this.e.i.i.e(iJ4);
                                            } else if (i50 == 1) {
                                                int i164 = -i7;
                                                int i165 = ((~i164) & i153) | ((~i153) & i164);
                                                int i166 = -(-((i164 & i153) << 1));
                                                int iJ5 = j((i165 & i166) + (i166 | i165), 0);
                                                int i167 = (int) ((iJ5 / f8) + 0.5f);
                                                int iJ6 = j(i167, 1);
                                                if (i167 != iJ6) {
                                                    iJ5 = (int) ((iJ6 * f8) + 0.5f);
                                                }
                                                this.i.e(iJ5);
                                                X x2 = this.e.i;
                                                int i168 = b;
                                                int i169 = i168 & 105;
                                                int i170 = -(-((i168 ^ 105) | i169));
                                                int i171 = (i169 & i170) + (i170 | i169);
                                                a = i171 % 128;
                                                if (i171 % 2 != 0) {
                                                    x2.i.e(iJ6);
                                                    Object obj2 = null;
                                                    obj2.hashCode();
                                                    throw null;
                                                }
                                                x2.i.e(iJ6);
                                            }
                                        } else {
                                            int i1510 = -i7;
                                            iJ3 = j(((i153 ^ i1510) - (~(-(-((i1510 & i153) << 1))))) - 1, 0);
                                            int i1610 = b;
                                            int i1611 = i1610 & 21;
                                            int i1612 = i1611 + ((i1610 ^ 21) | i1611);
                                            a = i1612 % 128;
                                            int i1613 = i1612 % 2;
                                            i8 = (int) ((iJ3 * f8) + 0.5f);
                                            iJ4 = j(i8, 1);
                                            if (i8 != iJ4) {
                                                iJ3 = (int) ((iJ4 / f8) + 0.5f);
                                            }
                                            this.i.e(iJ3);
                                            this.e.i.i.e(iJ4);
                                        }
                                    }
                                }
                                int i172 = b;
                                int i173 = (((i172 ^ 19) | (i172 & 19)) << 1) - (((~i172) & 19) | (i172 & (-20)));
                                a = i173 % 128;
                                int i174 = i173 % 2;
                                return;
                            }
                            if (r2 != false && r4 != false) {
                                if (sVar2.f || !sVar3.f) {
                                    return;
                                }
                                float f9 = c0087m.Q;
                                int i175 = sVar2.n.get(0).j;
                                int i176 = sVar2.h;
                                int i177 = i175 & i176;
                                int i178 = (i177 - (~(-(-((i175 ^ i176) | i177))))) - 1;
                                int i179 = sVar3.n.get(0).j;
                                int i180 = -sVar3.h;
                                int i181 = i179 ^ i180;
                                int i182 = ((i179 & i180) | i181) << 1;
                                int i183 = -i181;
                                int i184 = ((i182 | i183) << 1) - (i182 ^ i183);
                                if (i50 == -1) {
                                    int i185 = -i178;
                                    iJ = j(((i184 & i185) - (~(i185 | i184))) - 1, 1);
                                    i5 = (int) ((iJ / f9) + 0.5f);
                                    iJ2 = j(i5, 0);
                                    if (i5 != iJ2) {
                                        int i186 = a;
                                        int i187 = i186 & 123;
                                        i6 = ((((i186 ^ 123) | i187) << 1) - (~(-((i186 | 123) & (~i187))))) - 1;
                                        b = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            f2 = (iJ2 - f9) - 0.5f;
                                        } else {
                                            f2 = (iJ2 * f9) + 0.5f;
                                        }
                                        iJ = (int) f2;
                                    }
                                    this.i.e(iJ2);
                                    X x3 = this.e.i;
                                    int i188 = a;
                                    int i189 = i188 & 125;
                                    int i190 = -(-(i188 | 125));
                                    int i191 = (i189 & i190) + (i190 | i189);
                                    b = i191 % 128;
                                    int i192 = i191 % 2;
                                    x3.i.e(iJ);
                                } else if (i50 == 0) {
                                    int iJ7 = j((i184 - (~(-i178))) - 1, 1);
                                    int i193 = (int) ((iJ7 * f9) + 0.5f);
                                    int i194 = a;
                                    int i195 = i194 & 107;
                                    int i196 = ((i194 | 107) & (~i195)) + (i195 << 1);
                                    b = i196 % 128;
                                    int i197 = i196 % 2;
                                    int iJ8 = j(i193, 0);
                                    if (i193 != iJ8) {
                                        iJ7 = (int) ((iJ8 / f9) + 0.5f);
                                    }
                                    this.i.e(iJ8);
                                    X x4 = this.e.i;
                                    int i198 = b;
                                    int i199 = i198 ^ 7;
                                    int i200 = ((((i198 & 7) | i199) << 1) - (~(-i199))) - 1;
                                    a = i200 % 128;
                                    if (i200 % 2 != 0) {
                                        x4.i.e(iJ7);
                                        int i201 = 85 / 0;
                                    } else {
                                        x4.i.e(iJ7);
                                    }
                                } else if (i50 == 1) {
                                    int i1810 = -i178;
                                    iJ = j(((i184 & i1810) - (~(i1810 | i184))) - 1, 1);
                                    i5 = (int) ((iJ / f9) + 0.5f);
                                    iJ2 = j(i5, 0);
                                    if (i5 != iJ2) {
                                        int i1811 = a;
                                        int i1812 = i1811 & 123;
                                        i6 = ((((i1811 ^ 123) | i1812) << 1) - (~(-((i1811 | 123) & (~i1812))))) - 1;
                                        b = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            f2 = (iJ2 - f9) - 0.5f;
                                        } else {
                                            f2 = (iJ2 * f9) + 0.5f;
                                        }
                                        iJ = (int) f2;
                                    }
                                    this.i.e(iJ2);
                                    X x5 = this.e.i;
                                    int i1813 = a;
                                    int i1814 = i1813 & 125;
                                    int i1910 = -(-(i1813 | 125));
                                    int i1911 = (i1814 & i1910) + (i1910 | i1814);
                                    b = i1911 % 128;
                                    int i1912 = i1911 % 2;
                                    x5.i.e(iJ);
                                }
                            }
                        } else if (r2 != false) {
                            if (sVar2.f) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                }
            } else {
                i = 1;
            }
        }
        s sVar13 = this.k;
        if (((sVar13.f ? 1 : 0) ^ i) != i) {
            s sVar14 = this.c;
            if (((sVar14.f ? 1 : 0) ^ i) != i) {
                if (sVar13.l && sVar14.l) {
                    int i202 = a;
                    int i203 = ((i202 & 38) + (i202 | 38)) - i;
                    b = i203 % 128;
                    if (i203 % 2 == 0) {
                        int i204 = 4 / 0;
                        if (this.i.l) {
                            return;
                        }
                    } else if (this.i.l) {
                        return;
                    }
                }
                if (!this.i.l && this.g == 3) {
                    int i205 = a;
                    int i206 = i205 & 123;
                    int i207 = (i205 | 123) & (~i206);
                    int i208 = -(-(i206 << i));
                    int i209 = (i207 ^ i208) + ((i207 & i208) << i);
                    b = i209 % 128;
                    if (i209 % 2 == 0) {
                        int i210 = this.e.l;
                        throw null;
                    }
                    C0087m c0087m4 = this.e;
                    if (c0087m4.l == 0 && !c0087m4.t()) {
                        s sVar15 = this.k.n.get(0);
                        int i211 = a;
                        int i212 = ((i211 | 108) << i) - (i211 ^ 108);
                        int i213 = (i212 ^ (-1)) + (i212 << i);
                        b = i213 % 128;
                        int i214 = i213 % 2;
                        s sVar16 = this.c.n.get(0);
                        int i215 = b;
                        int i216 = i215 & 83;
                        int i217 = (i215 ^ 83) | i216;
                        int i218 = (i216 & i217) + (i217 | i216);
                        a = i218 % 128;
                        int i219 = i218 % 2;
                        int i220 = sVar15.j;
                        s sVar17 = this.k;
                        int i221 = -(-sVar17.h);
                        int i222 = ((i220 ^ i221) | (i220 & i221)) << i;
                        int i223 = -(((~i220) & i221) | ((~i221) & i220));
                        int i224 = (i222 & i223) + (i223 | i222);
                        int i225 = sVar16.j;
                        int i226 = -(~this.c.h);
                        int i227 = ((i225 ^ i226) + ((i225 & i226) << i)) - i;
                        int i228 = a;
                        int i229 = i228 & 23;
                        int i230 = (((i228 ^ 23) | i229) << i) - ((i228 | 23) & (~i229));
                        b = i230 % 128;
                        int i231 = i230 % 2;
                        sVar17.e(i224);
                        this.c.e(i227);
                        C0015y c0015y7 = this.i;
                        int i232 = a;
                        int i233 = i232 & 25;
                        int i234 = i233 + ((i232 ^ 25) | i233);
                        b = i234 % 128;
                        int i235 = i234 % 2;
                        int i236 = -i224;
                        c0015y7.e((((i227 ^ i236) | (i227 & i236)) << i) - ((i236 & (~i227)) | ((~i236) & i227)));
                        return;
                    }
                }
                if (!this.i.l && this.g == 3) {
                    int i237 = b;
                    int i238 = ((i237 & (-126)) | ((~i237) & 125)) + ((i237 & 125) << i);
                    a = i238 % 128;
                    int i239 = i238 % 2;
                    if (this.d == i) {
                        int i240 = a;
                        int i241 = ((i240 | 113) << i) - (i240 ^ 113);
                        b = i241 % 128;
                        if (i241 % 2 == 0) {
                            int i242 = 19 / 0;
                            if (this.k.n.size() > 0) {
                                if (this.c.n.size() > 0) {
                                    s sVar18 = this.k.n.get(0);
                                    s sVar19 = this.c.n.get(0);
                                    int i243 = sVar18.j;
                                    int i244 = this.k.h;
                                    int i245 = sVar19.j;
                                    int i246 = this.c.h;
                                    int i247 = (i245 ^ i246) + ((i245 & i246) << i);
                                    int i248 = -(-i244);
                                    int i249 = -(((i243 ^ i248) - (~(-(-((i243 & i248) << i))))) - i);
                                    int iMin = Math.min(((i247 | i249) << i) - (i249 ^ i247), this.i.f41o);
                                    C0087m c0087m5 = this.e;
                                    i2 = c0087m5.f65o;
                                    iMax = Math.max(c0087m5.p, iMin);
                                    i3 = a + 13;
                                    b = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        int i250 = 69 / 0;
                                        if (i2 > 0) {
                                            iMax = Math.min(i2, iMax);
                                        }
                                    } else if (i2 > 0) {
                                        iMax = Math.min(i2, iMax);
                                    }
                                    this.i.e(iMax);
                                }
                            }
                        } else if (this.k.n.size() > 0) {
                            if (this.c.n.size() > 0) {
                                s sVar110 = this.k.n.get(0);
                                s sVar111 = this.c.n.get(0);
                                int i2410 = sVar110.j;
                                int i2411 = this.k.h;
                                int i2412 = sVar111.j;
                                int i2413 = this.c.h;
                                int i2414 = (i2412 ^ i2413) + ((i2412 & i2413) << i);
                                int i2415 = -(-i2411);
                                int i2416 = -(((i2410 ^ i2415) - (~(-(-((i2410 & i2415) << i))))) - i);
                                int iMin2 = Math.min(((i2414 | i2416) << i) - (i2416 ^ i2414), this.i.f41o);
                                C0087m c0087m6 = this.e;
                                i2 = c0087m6.f65o;
                                iMax = Math.max(c0087m6.p, iMin2);
                                i3 = a + 13;
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    int i251 = 69 / 0;
                                    if (i2 > 0) {
                                        iMax = Math.min(i2, iMax);
                                    }
                                } else if (i2 > 0) {
                                    iMax = Math.min(i2, iMax);
                                }
                                this.i.e(iMax);
                            }
                        }
                    }
                }
                if (!this.i.l) {
                    int i252 = b - (-1);
                    a = i252 % 128;
                    if (i252 % 2 == 0) {
                        return;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                s sVar20 = this.k.n.get(0);
                s sVar21 = this.c.n.get(0);
                int i253 = sVar20.j;
                s sVar22 = this.k;
                int i254 = sVar22.h;
                int i255 = sVar21.j;
                int i256 = this.c.h;
                C0087m c0087m7 = this.e;
                int i257 = a;
                int i258 = i257 & 59;
                int i259 = (((i257 ^ 59) | i258) << i) - ((i257 | 59) & (~i258));
                b = i259 % 128;
                int i260 = i259 % 2;
                float f10 = c0087m7.W;
                if (sVar20 == sVar21) {
                    int i261 = a + 9;
                    b = i261 % 128;
                    if (i261 % 2 == 0) {
                        throw null;
                    }
                    f10 = 0.5f;
                } else {
                    int i262 = i254 & i253;
                    int i263 = -(-((i254 ^ i253) | i262));
                    i253 = (i262 ^ i263) + ((i262 & i263) << i);
                    i255 = ((i256 | i255) << i) - (i256 ^ i255);
                    int i264 = a;
                    int i265 = (((i264 & (-6)) | ((~i264) & 5)) - (~(-(-((i264 & 5) << i))))) - i;
                    b = i265 % 128;
                    int i266 = i265 % 2;
                }
                float f11 = i253;
                int i267 = -i253;
                int i268 = i255 ^ i267;
                int i269 = ((i267 & i255) | i268) << i;
                int i270 = -i268;
                int i271 = ((i269 | i270) << i) - (i269 ^ i270);
                int i272 = -this.i.j;
                int i273 = i271 | i272;
                int i274 = i273 << 1;
                int i275 = -((~(i272 & i271)) & i273);
                sVar22.e((int) (((((i274 | i275) << i) - (i275 ^ i274)) * f10) + f11 + 0.5f));
                s sVar23 = this.c;
                int i276 = this.k.j;
                C0015y c0015y8 = this.i;
                int i277 = b + 103;
                a = i277 % 128;
                int i278 = i277 % 2;
                int i279 = c0015y8.j;
                int i280 = i276 & i279;
                int i281 = (i276 ^ i279) | i280;
                sVar23.e(((i280 | i281) << i) - (i281 ^ i280));
                int i282 = a;
                int i283 = ((i282 | 63) << i) - (i282 ^ 63);
                b = i283 % 128;
                int i284 = i283 % 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r2.k() == 4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
    
        if (r2.k() == 4) goto L42;
     */
    @Override // ivas.gov.bisp.enumeration.B.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            Method dump skipped, instruction units count: 2073
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.B.D.g():void");
    }
}
