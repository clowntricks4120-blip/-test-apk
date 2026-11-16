package ivas.gov.bisp.enumeration.B;

import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.x;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class al extends Y {
    private static int a = 1;
    private static int b;

    public al(C0087m c0087m) {
        super(c0087m);
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public boolean m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = (~i3) & (i2 | 83);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 + 30;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final void o(s sVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-102)) | ((~i2) & 101)) + ((i2 & 101) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.k.m.add(sVar);
            int i4 = 37 / 0;
        } else {
            this.k.m.add(sVar);
        }
        int i5 = a;
        int i6 = i5 | 33;
        int i7 = ((i6 << 1) - (~(-((~(i5 & 33)) & i6)))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            sVar.n.add(this.k);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sVar.n.add(this.k);
        int i8 = b;
        int i9 = i8 & 81;
        int i10 = (i8 ^ 81) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public void h() {
        int i = 2 % 2;
        int i2 = b + 89;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.f = null;
            this.k.d();
        } else {
            this.f = null;
            this.k.d();
            int i3 = 49 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0131  */
    /* JADX WARN: Code duplicated, block: B:27:0x013c  */
    @Override // ivas.gov.bisp.enumeration.B.Y, ivas.gov.bisp.enumeration.B.V
    public void b(V v) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 25;
        int i6 = (i4 ^ 25) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        x xVar = (x) this.e;
        int i9 = xVar.aj;
        Iterator<s> it = this.k.n.iterator();
        int i10 = b;
        int i11 = (((i10 & (-68)) | ((~i10) & 67)) - (~((i10 & 67) << 1))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = (i10 & (-120)) | ((~i10) & 119);
        int i14 = -(-((i10 & 119) << 1));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = -1;
        int i18 = 0;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                if (i9 != 0) {
                    int i19 = b;
                    int i20 = ((i19 | 38) << 1) - (i19 ^ 38);
                    int i21 = (i20 ^ (-1)) + (i20 << 1);
                    int i22 = i21 % 128;
                    a = i22;
                    int i23 = i21 % 2;
                    if (i9 != 2) {
                        int i24 = i22 & 11;
                        int i25 = (((i22 ^ 11) | i24) << 1) - ((~i24) & (i22 | 11));
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        s sVar = this.k;
                        int i27 = xVar.ak;
                        int i28 = (-2) - ((a + 16) ^ (-1));
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        int i30 = ((i18 ^ i27) | (i18 & i27)) << 1;
                        int i31 = -((i27 & (~i18)) | ((~i27) & i18));
                        sVar.e(((i30 | i31) << 1) - (i31 ^ i30));
                        int i32 = b;
                        int i33 = i32 & 121;
                        int i34 = i33 + ((i32 ^ 121) | i33);
                        a = i34 % 128;
                        if (i34 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
                s sVar2 = this.k;
                int i35 = xVar.ak;
                int i36 = b;
                int i37 = (i36 | 67) << 1;
                int i38 = -(((~i36) & 67) | (i36 & (-68)));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                a = i39 % 128;
                int i40 = i39 % 2;
                int i41 = -(-i35);
                int i42 = i17 & i41;
                sVar2.e((i42 - (~((i41 ^ i17) | i42))) - 1);
                int i43 = a;
                int i44 = (i43 & 101) + (i43 | 101);
                b = i44 % 128;
                int i45 = i44 % 2;
                return;
            }
            int i46 = b;
            int i47 = ((i46 | 17) << 1) - (i46 ^ 17);
            a = i47 % 128;
            if (i47 % 2 == 0) {
                i = it.next().j;
                int i48 = 15 / 0;
            } else {
                i = it.next().j;
            }
            if (i17 != -1) {
                int i49 = a;
                int i50 = i49 & 99;
                int i51 = -(-(i49 | 99));
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                b = i52 % 128;
                if (i52 % 2 != 0) {
                    throw null;
                }
                if (i < i17) {
                    i2 = a + 115;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i53 = 5 % 3;
                    }
                    i17 = i;
                }
            } else {
                i2 = a + 115;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    int i54 = 5 % 3;
                }
                i17 = i;
            }
            if (i18 < i) {
                int i55 = b;
                int i56 = (i55 & 111) + (i55 | 111);
                int i57 = i56 % 128;
                a = i57;
                if (i56 % 2 == 0) {
                    int i58 = 91 / 0;
                }
                int i59 = i57 ^ 29;
                int i60 = ((i57 & 29) | i59) << 1;
                int i61 = -i59;
                int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                b = i62 % 128;
                int i63 = i62 % 2;
                i18 = i;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public void i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 8) + ((i2 & 8) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        C0087m c0087m = this.e;
        if (c0087m instanceof x) {
            int i6 = a;
            int i7 = i6 & 35;
            int i8 = (i6 | 35) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((x) c0087m).aj;
            if (i12 != 0) {
                int i13 = b;
                int i14 = (i13 & (-82)) | ((~i13) & 81);
                int i15 = -(-((i13 & 81) << 1));
                int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                if (i12 != 1) {
                    int i18 = (i13 & (-104)) | ((~i13) & 103);
                    int i19 = -(-((i13 & 103) << 1));
                    int i20 = (i18 & i19) + (i18 | i19);
                    a = i20 % 128;
                    if (i20 % 2 == 0) {
                        c0087m.U = this.k.j;
                        throw null;
                    }
                    c0087m.U = this.k.j;
                    int i21 = b;
                    int i22 = (i21 & (-100)) | ((~i21) & 99);
                    int i23 = (i21 & 99) << 1;
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    a = i24 % 128;
                    if (i24 % 2 == 0) {
                        int i25 = 11 / 0;
                        return;
                    }
                    return;
                }
            }
            c0087m.H = this.k.j;
            int i26 = b;
            int i27 = (i26 & 79) + (i26 | 79);
            a = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = b;
        int i30 = (i29 ^ 47) + ((i29 & 47) << 1);
        a = i30 % 128;
        if (i30 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0359  */
    /* JADX WARN: Code duplicated, block: B:103:0x036d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0388  */
    /* JADX WARN: Code duplicated, block: B:107:0x039e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x03a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:112:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:11:0x0051  */
    /* JADX WARN: Code duplicated, block: B:122:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX WARN: Code duplicated, block: B:140:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00be  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x0165  */
    /* JADX WARN: Code duplicated, block: B:45:0x017e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0188  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:70:0x0265  */
    /* JADX WARN: Code duplicated, block: B:71:0x0270  */
    /* JADX WARN: Code duplicated, block: B:73:0x027a  */
    /* JADX WARN: Code duplicated, block: B:75:0x028c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0291  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r2
  0x0025: PHI (r2v4 ivas.gov.bisp.enumeration.ad.m) = (r2v3 ivas.gov.bisp.enumeration.ad.m), (r2v44 ivas.gov.bisp.enumeration.ad.m) binds: [B:8:0x0023, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.B.Y
    public void g() {
        C0087m c0087m;
        s sVar;
        x xVar;
        int i;
        boolean z;
        Object obj;
        int i2;
        C0087m c0087m2;
        s sVar2;
        List<s> list;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C0087m c0087m3;
        s sVar3;
        List<V> list2;
        s sVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0087m c0087m4;
        s sVar5;
        List<V> list3;
        int i15;
        s sVar6;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C0087m c0087m5;
        s sVar7;
        int i21;
        int i22;
        int i23 = 2 % 2;
        int i24 = a;
        int i25 = (i24 ^ 37) + ((i24 & 37) << 1);
        b = i25 % 128;
        int i26 = 0;
        if (i25 % 2 != 0) {
            c0087m = this.e;
            int i27 = 79 / 0;
            if (c0087m instanceof x) {
                sVar = this.k;
                sVar.e = true;
                int i28 = b;
                int i29 = i28 & 11;
                int i30 = (i29 - (~((i28 ^ 11) | i29))) - 1;
                a = i30 % 128;
                int i31 = i30 % 2;
                xVar = (x) c0087m;
                i = xVar.aj;
                int i32 = a;
                int i33 = (i32 & 63) + (i32 | 63);
                b = i33 % 128;
                int i34 = i33 % 2;
                z = xVar.ai;
                obj = null;
                if (i != 0) {
                    i6 = a;
                    int i35 = (-2) - (((i6 & 16) + (i6 | 16)) ^ (-1));
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    if (i != 1) {
                        sVar.i = 5;
                        i7 = (-2) - ((b + 30) ^ (-1));
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i37 = 4 % 4;
                        }
                        while (i26 < xVar.ah) {
                            int i38 = a;
                            int i39 = i38 & 17;
                            i8 = (i39 - (~(-(-((i38 ^ 17) | i39))))) - 1;
                            b = i8 % 128;
                            if (i8 % 2 == 0) {
                                C0087m c0087m6 = xVar.ag[i26];
                                throw null;
                            }
                            c0087m3 = xVar.ag[i26];
                            if (z) {
                                sVar3 = c0087m3.g.c;
                                list2 = sVar3.m;
                                sVar4 = this.k;
                                i9 = b + 87;
                                a = i9 % 128;
                                if (i9 % 2 != 0) {
                                    list2.add(sVar4);
                                    this.k.n.add(sVar3);
                                    throw null;
                                }
                                list2.add(sVar4);
                                this.k.n.add(sVar3);
                                int i40 = a;
                                int i41 = (-2) - (((i40 ^ 28) + ((i40 & 28) << 1)) ^ (-1));
                                b = i41 % 128;
                                int i42 = i41 % 2;
                            } else {
                                int i43 = a;
                                int i44 = i43 & 83;
                                int i45 = ((i43 ^ 83) | i44) << 1;
                                int i46 = -((i43 | 83) & (~i44));
                                i10 = (i45 ^ i46) + ((i46 & i45) << 1);
                                b = i10 % 128;
                                if (i10 % 2 != 0) {
                                    if (c0087m3.Y != 89) {
                                        sVar3 = c0087m3.g.c;
                                        list2 = sVar3.m;
                                        sVar4 = this.k;
                                        i9 = b + 87;
                                        a = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            list2.add(sVar4);
                                            this.k.n.add(sVar3);
                                            throw null;
                                        }
                                        list2.add(sVar4);
                                        this.k.n.add(sVar3);
                                        int i47 = a;
                                        int i48 = (-2) - (((i47 ^ 28) + ((i47 & 28) << 1)) ^ (-1));
                                        b = i48 % 128;
                                        int i49 = i48 % 2;
                                    } else {
                                        continue;
                                    }
                                } else if (c0087m3.Y != 8) {
                                    sVar3 = c0087m3.g.c;
                                    list2 = sVar3.m;
                                    sVar4 = this.k;
                                    i9 = b + 87;
                                    a = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        list2.add(sVar4);
                                        this.k.n.add(sVar3);
                                        throw null;
                                    }
                                    list2.add(sVar4);
                                    this.k.n.add(sVar3);
                                    int i410 = a;
                                    int i411 = (-2) - (((i410 ^ 28) + ((i410 & 28) << 1)) ^ (-1));
                                    b = i411 % 128;
                                    int i412 = i411 % 2;
                                } else {
                                    continue;
                                }
                            }
                            int i50 = (i26 & (-28)) + (i26 | (-28));
                            i26 = ((i50 | 29) << 1) - (i50 ^ 29);
                            int i51 = a;
                            int i52 = (i51 ^ 89) + ((i51 & 89) << 1);
                            b = i52 % 128;
                            int i53 = i52 % 2;
                        }
                        o(this.e.g.k);
                        int i54 = a;
                        int i55 = i54 & 117;
                        int i56 = (i54 ^ 117) | i55;
                        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                        b = i57 % 128;
                        int i58 = i57 % 2;
                        o(this.e.g.c);
                        int i59 = a;
                        int i60 = i59 & 81;
                        int i61 = ((i59 | 81) & (~i60)) + (i60 << 1);
                        b = i61 % 128;
                        int i62 = i61 % 2;
                        return;
                    }
                    int i63 = ((i6 & (-96)) | ((~i6) & 95)) + ((i6 & 95) << 1);
                    i11 = i63 % 128;
                    b = i11;
                    int i64 = i63 % 2;
                    if (i != 2) {
                        sVar.i = 6;
                        int i65 = b;
                        int i66 = i65 & 91;
                        int i67 = (i65 ^ 91) | i66;
                        int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                        a = i68 % 128;
                        int i69 = i68 % 2;
                        i12 = 0;
                        while (i12 < xVar.ah) {
                            int i70 = b;
                            int i71 = i70 & 55;
                            int i72 = -(-((i70 ^ 55) | i71));
                            i14 = ((i71 | i72) << 1) - (i72 ^ i71);
                            a = i14 % 128;
                            if (i14 % 2 != 0) {
                                C0087m c0087m7 = xVar.ag[i12];
                                throw null;
                            }
                            c0087m4 = xVar.ag[i12];
                            if ((!z) || c0087m4.Y != 8) {
                                sVar5 = c0087m4.i.k;
                                list3 = sVar5.m;
                                int i73 = a;
                                i15 = (i73 & 107) + (i73 | 107);
                                b = i15 % 128;
                                if (i15 % 2 != 0) {
                                    list3.add(this.k);
                                    s sVar8 = this.k;
                                    obj.hashCode();
                                    throw null;
                                }
                                list3.add(this.k);
                                sVar6 = this.k;
                                int i74 = a;
                                int i75 = i74 & 83;
                                i16 = ((((i74 ^ 83) | i75) << 1) - (~(-((i74 | 83) & (~i75))))) - 1;
                                b = i16 % 128;
                                if (i16 % 2 != 0) {
                                    sVar6.n.add(sVar5);
                                    throw null;
                                }
                                sVar6.n.add(sVar5);
                                int i76 = b;
                                int i77 = (-2) - (((i76 ^ 18) + ((i76 & 18) << 1)) ^ (-1));
                                a = i77 % 128;
                                int i78 = i77 % 2;
                            }
                            int i79 = i12 & (-60);
                            int i80 = ((i12 ^ (-60)) | i79) << 1;
                            int i81 = -((i12 | (-60)) & (~i79));
                            int i82 = (i80 & i81) + (i81 | i80);
                            int i83 = i82 & 61;
                            i12 = i83 + ((i82 ^ 61) | i83);
                            int i84 = b;
                            int i85 = i84 & 19;
                            int i86 = (i84 | 19) & (~i85);
                            int i87 = -(-(i85 << 1));
                            int i88 = ((i86 | i87) << 1) - (i86 ^ i87);
                            a = i88 % 128;
                            int i89 = i88 % 2;
                        }
                        o(this.e.i.k);
                        i13 = (-2) - ((b + 102) ^ (-1));
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            o(this.e.i.c);
                            return;
                        } else {
                            o(this.e.i.c);
                            int i90 = 89 / 0;
                            return;
                        }
                    }
                    i17 = (-2) - ((((i11 | 26) << 1) - (i11 ^ 26)) ^ (-1));
                    a = i17 % 128;
                    if (i17 % 2 == 0 ? i == 3 : i == 3) {
                        sVar.i = 7;
                        int i91 = b;
                        int i92 = i91 & 15;
                        int i93 = (i91 | 15) & (~i92);
                        int i94 = -(-(i92 << 1));
                        int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
                        a = i95 % 128;
                        int i96 = i95 % 2;
                        i18 = 0;
                        while (i18 < xVar.ah) {
                            int i97 = a;
                            int i98 = i97 & 121;
                            int i99 = -(-((i97 ^ 121) | i98));
                            i20 = (i98 ^ i99) + ((i99 & i98) << 1);
                            b = i20 % 128;
                            if (i20 % 2 != 0) {
                                C0087m c0087m8 = xVar.ag[i18];
                                throw null;
                            }
                            c0087m5 = xVar.ag[i18];
                            if (z || c0087m5.Y != 8) {
                                sVar7 = c0087m5.i.c;
                                int i100 = a;
                                int i101 = i100 & 125;
                                i21 = ((i100 | 125) & (~i101)) + (i101 << 1);
                                b = i21 % 128;
                                if (i21 % 2 != 0) {
                                    sVar7.m.add(this.k);
                                    obj.hashCode();
                                    throw null;
                                }
                                sVar7.m.add(this.k);
                                int i102 = a;
                                int i103 = (i102 & (-122)) | ((~i102) & 121);
                                int i104 = (i102 & 121) << 1;
                                i22 = (i103 ^ i104) + ((i104 & i103) << 1);
                                b = i22 % 128;
                                if (i22 % 2 != 0) {
                                    this.k.n.add(sVar7);
                                    int i105 = 6 / 0;
                                } else {
                                    this.k.n.add(sVar7);
                                }
                                int i106 = b;
                                int i107 = ((i106 ^ 36) + ((i106 & 36) << 1)) - 1;
                                a = i107 % 128;
                                int i108 = i107 % 2;
                            }
                            i18 = (((i18 | 1) << 1) - (~(-(((~i18) & 1) | (i18 & (-2)))))) - 1;
                            int i109 = a;
                            int i110 = ((i109 | 82) << 1) - (i109 ^ 82);
                            int i111 = (i110 ^ (-1)) + (i110 << 1);
                            b = i111 % 128;
                            int i112 = i111 % 2;
                        }
                        o(this.e.i.k);
                        int i113 = a;
                        int i114 = (i113 & 120) + (i113 | 120);
                        i19 = (i114 ^ (-1)) + (i114 << 1);
                        b = i19 % 128;
                        if (i19 % 2 != 0) {
                            o(this.e.i.c);
                            throw null;
                        }
                        o(this.e.i.c);
                        int i115 = b;
                        int i116 = i115 & 91;
                        int i117 = ((i115 | 91) & (~i116)) + (i116 << 1);
                        a = i117 % 128;
                        int i118 = i117 % 2;
                        return;
                    }
                } else {
                    sVar.i = 4;
                    int i119 = a + 12;
                    int i120 = (i119 ^ (-1)) + (i119 << 1);
                    b = i120 % 128;
                    int i121 = i120 % 2;
                    i2 = 0;
                    while (i2 < xVar.ah) {
                        int i122 = b;
                        int i123 = i122 ^ 81;
                        int i124 = -(-((i122 & 81) << 1));
                        int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
                        a = i125 % 128;
                        int i126 = i125 % 2;
                        c0087m2 = xVar.ag[i2];
                        if (!z) {
                            int i127 = b;
                            int i128 = i127 & 3;
                            int i129 = -(-((i127 ^ 3) | i128));
                            int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
                            a = i130 % 128;
                            i4 = i130 % 2;
                            i5 = c0087m2.Y;
                            if (i4 == 0) {
                                if (i5 != 37) {
                                    sVar2 = c0087m2.g.k;
                                    List<V> list4 = sVar2.m;
                                    int i131 = b;
                                    int i132 = (i131 & (-80)) | ((~i131) & 79);
                                    int i133 = -(-((i131 & 79) << 1));
                                    int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                                    a = i134 % 128;
                                    int i135 = i134 % 2;
                                    list4.add(this.k);
                                    list = this.k.n;
                                    i3 = b + 123;
                                    a = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        list.add(sVar2);
                                        throw null;
                                    }
                                    list.add(sVar2);
                                    int i136 = a + 43;
                                    b = i136 % 128;
                                    int i137 = i136 % 2;
                                } else {
                                    continue;
                                }
                            } else if (i5 != 8) {
                                sVar2 = c0087m2.g.k;
                                List<V> list5 = sVar2.m;
                                int i138 = b;
                                int i139 = (i138 & (-80)) | ((~i138) & 79);
                                int i1310 = -(-((i138 & 79) << 1));
                                int i1311 = (i139 ^ i1310) + ((i1310 & i139) << 1);
                                a = i1311 % 128;
                                int i1312 = i1311 % 2;
                                list5.add(this.k);
                                list = this.k.n;
                                i3 = b + 123;
                                a = i3 % 128;
                                if (i3 % 2 != 0) {
                                    list.add(sVar2);
                                    throw null;
                                }
                                list.add(sVar2);
                                int i1313 = a + 43;
                                b = i1313 % 128;
                                int i1314 = i1313 % 2;
                            } else {
                                continue;
                            }
                        } else {
                            sVar2 = c0087m2.g.k;
                            List<V> list6 = sVar2.m;
                            int i1315 = b;
                            int i1316 = (i1315 & (-80)) | ((~i1315) & 79);
                            int i1317 = -(-((i1315 & 79) << 1));
                            int i1318 = (i1316 ^ i1317) + ((i1317 & i1316) << 1);
                            a = i1318 % 128;
                            int i1319 = i1318 % 2;
                            list6.add(this.k);
                            list = this.k.n;
                            i3 = b + 123;
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                list.add(sVar2);
                                throw null;
                            }
                            list.add(sVar2);
                            int i13110 = a + 43;
                            b = i13110 % 128;
                            int i13111 = i13110 % 2;
                        }
                        i2++;
                        int i140 = a;
                        int i141 = ((i140 ^ 39) - (~((i140 & 39) << 1))) - 1;
                        b = i141 % 128;
                        int i142 = i141 % 2;
                    }
                    o(this.e.g.k);
                    int i143 = b;
                    int i144 = ((i143 & 118) + (i143 | 118)) - 1;
                    a = i144 % 128;
                    int i145 = i144 % 2;
                    o(this.e.g.c);
                    int i146 = a + 7;
                    b = i146 % 128;
                    int i147 = i146 % 2;
                }
            }
        } else {
            c0087m = this.e;
            if (c0087m instanceof x) {
                sVar = this.k;
                sVar.e = true;
                int i210 = b;
                int i211 = i210 & 11;
                int i310 = (i211 - (~((i210 ^ 11) | i211))) - 1;
                a = i310 % 128;
                int i311 = i310 % 2;
                xVar = (x) c0087m;
                i = xVar.aj;
                int i312 = a;
                int i313 = (i312 & 63) + (i312 | 63);
                b = i313 % 128;
                int i314 = i313 % 2;
                z = xVar.ai;
                obj = null;
                if (i != 0) {
                    i6 = a;
                    int i315 = (-2) - (((i6 & 16) + (i6 | 16)) ^ (-1));
                    b = i315 % 128;
                    int i316 = i315 % 2;
                    if (i != 1) {
                        sVar.i = 5;
                        i7 = (-2) - ((b + 30) ^ (-1));
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i317 = 4 % 4;
                        }
                        while (i26 < xVar.ah) {
                            int i318 = a;
                            int i319 = i318 & 17;
                            i8 = (i319 - (~(-(-((i318 ^ 17) | i319))))) - 1;
                            b = i8 % 128;
                            if (i8 % 2 == 0) {
                                C0087m c0087m9 = xVar.ag[i26];
                                throw null;
                            }
                            c0087m3 = xVar.ag[i26];
                            if (z) {
                                sVar3 = c0087m3.g.c;
                                list2 = sVar3.m;
                                sVar4 = this.k;
                                i9 = b + 87;
                                a = i9 % 128;
                                if (i9 % 2 != 0) {
                                    list2.add(sVar4);
                                    this.k.n.add(sVar3);
                                    throw null;
                                }
                                list2.add(sVar4);
                                this.k.n.add(sVar3);
                                int i413 = a;
                                int i414 = (-2) - (((i413 ^ 28) + ((i413 & 28) << 1)) ^ (-1));
                                b = i414 % 128;
                                int i415 = i414 % 2;
                            } else {
                                int i416 = a;
                                int i417 = i416 & 83;
                                int i418 = ((i416 ^ 83) | i417) << 1;
                                int i419 = -((i416 | 83) & (~i417));
                                i10 = (i418 ^ i419) + ((i419 & i418) << 1);
                                b = i10 % 128;
                                if (i10 % 2 != 0) {
                                    if (c0087m3.Y != 89) {
                                        sVar3 = c0087m3.g.c;
                                        list2 = sVar3.m;
                                        sVar4 = this.k;
                                        i9 = b + 87;
                                        a = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            list2.add(sVar4);
                                            this.k.n.add(sVar3);
                                            throw null;
                                        }
                                        list2.add(sVar4);
                                        this.k.n.add(sVar3);
                                        int i4110 = a;
                                        int i4111 = (-2) - (((i4110 ^ 28) + ((i4110 & 28) << 1)) ^ (-1));
                                        b = i4111 % 128;
                                        int i4112 = i4111 % 2;
                                    } else {
                                        continue;
                                    }
                                } else if (c0087m3.Y != 8) {
                                    sVar3 = c0087m3.g.c;
                                    list2 = sVar3.m;
                                    sVar4 = this.k;
                                    i9 = b + 87;
                                    a = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        list2.add(sVar4);
                                        this.k.n.add(sVar3);
                                        throw null;
                                    }
                                    list2.add(sVar4);
                                    this.k.n.add(sVar3);
                                    int i4113 = a;
                                    int i4114 = (-2) - (((i4113 ^ 28) + ((i4113 & 28) << 1)) ^ (-1));
                                    b = i4114 % 128;
                                    int i4115 = i4114 % 2;
                                } else {
                                    continue;
                                }
                            }
                            int i510 = (i26 & (-28)) + (i26 | (-28));
                            i26 = ((i510 | 29) << 1) - (i510 ^ 29);
                            int i511 = a;
                            int i512 = (i511 ^ 89) + ((i511 & 89) << 1);
                            b = i512 % 128;
                            int i513 = i512 % 2;
                        }
                        o(this.e.g.k);
                        int i514 = a;
                        int i515 = i514 & 117;
                        int i516 = (i514 ^ 117) | i515;
                        int i517 = ((i515 | i516) << 1) - (i516 ^ i515);
                        b = i517 % 128;
                        int i518 = i517 % 2;
                        o(this.e.g.c);
                        int i519 = a;
                        int i610 = i519 & 81;
                        int i611 = ((i519 | 81) & (~i610)) + (i610 << 1);
                        b = i611 % 128;
                        int i612 = i611 % 2;
                        return;
                    }
                    int i613 = ((i6 & (-96)) | ((~i6) & 95)) + ((i6 & 95) << 1);
                    i11 = i613 % 128;
                    b = i11;
                    int i614 = i613 % 2;
                    if (i != 2) {
                        sVar.i = 6;
                        int i615 = b;
                        int i616 = i615 & 91;
                        int i617 = (i615 ^ 91) | i616;
                        int i618 = (i616 ^ i617) + ((i617 & i616) << 1);
                        a = i618 % 128;
                        int i619 = i618 % 2;
                        i12 = 0;
                        while (i12 < xVar.ah) {
                            int i710 = b;
                            int i711 = i710 & 55;
                            int i712 = -(-((i710 ^ 55) | i711));
                            i14 = ((i711 | i712) << 1) - (i712 ^ i711);
                            a = i14 % 128;
                            if (i14 % 2 != 0) {
                                C0087m c0087m10 = xVar.ag[i12];
                                throw null;
                            }
                            c0087m4 = xVar.ag[i12];
                            if (!z) {
                                sVar5 = c0087m4.i.k;
                                list3 = sVar5.m;
                                int i713 = a;
                                i15 = (i713 & 107) + (i713 | 107);
                                b = i15 % 128;
                                if (i15 % 2 != 0) {
                                    list3.add(this.k);
                                    s sVar9 = this.k;
                                    obj.hashCode();
                                    throw null;
                                }
                                list3.add(this.k);
                                sVar6 = this.k;
                                int i714 = a;
                                int i715 = i714 & 83;
                                i16 = ((((i714 ^ 83) | i715) << 1) - (~(-((i714 | 83) & (~i715))))) - 1;
                                b = i16 % 128;
                                if (i16 % 2 != 0) {
                                    sVar6.n.add(sVar5);
                                    throw null;
                                }
                                sVar6.n.add(sVar5);
                                int i716 = b;
                                int i717 = (-2) - (((i716 ^ 18) + ((i716 & 18) << 1)) ^ (-1));
                                a = i717 % 128;
                                int i718 = i717 % 2;
                            } else {
                                sVar5 = c0087m4.i.k;
                                list3 = sVar5.m;
                                int i719 = a;
                                i15 = (i719 & 107) + (i719 | 107);
                                b = i15 % 128;
                                if (i15 % 2 != 0) {
                                    list3.add(this.k);
                                    s sVar10 = this.k;
                                    obj.hashCode();
                                    throw null;
                                }
                                list3.add(this.k);
                                sVar6 = this.k;
                                int i7110 = a;
                                int i7111 = i7110 & 83;
                                i16 = ((((i7110 ^ 83) | i7111) << 1) - (~(-((i7110 | 83) & (~i7111))))) - 1;
                                b = i16 % 128;
                                if (i16 % 2 != 0) {
                                    sVar6.n.add(sVar5);
                                    throw null;
                                }
                                sVar6.n.add(sVar5);
                                int i7112 = b;
                                int i7113 = (-2) - (((i7112 ^ 18) + ((i7112 & 18) << 1)) ^ (-1));
                                a = i7113 % 128;
                                int i7114 = i7113 % 2;
                            }
                            int i720 = i12 & (-60);
                            int i810 = ((i12 ^ (-60)) | i720) << 1;
                            int i811 = -((i12 | (-60)) & (~i720));
                            int i812 = (i810 & i811) + (i811 | i810);
                            int i813 = i812 & 61;
                            i12 = i813 + ((i812 ^ 61) | i813);
                            int i814 = b;
                            int i815 = i814 & 19;
                            int i816 = (i814 | 19) & (~i815);
                            int i817 = -(-(i815 << 1));
                            int i818 = ((i816 | i817) << 1) - (i816 ^ i817);
                            a = i818 % 128;
                            int i819 = i818 % 2;
                        }
                        o(this.e.i.k);
                        i13 = (-2) - ((b + 102) ^ (-1));
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            o(this.e.i.c);
                            return;
                        } else {
                            o(this.e.i.c);
                            int i910 = 89 / 0;
                            return;
                        }
                    }
                    i17 = (-2) - ((((i11 | 26) << 1) - (i11 ^ 26)) ^ (-1));
                    a = i17 % 128;
                    if (i17 % 2 == 0) {
                        sVar.i = 7;
                        int i911 = b;
                        int i912 = i911 & 15;
                        int i913 = (i911 | 15) & (~i912);
                        int i914 = -(-(i912 << 1));
                        int i915 = ((i913 | i914) << 1) - (i913 ^ i914);
                        a = i915 % 128;
                        int i916 = i915 % 2;
                        i18 = 0;
                        while (i18 < xVar.ah) {
                            int i917 = a;
                            int i918 = i917 & 121;
                            int i919 = -(-((i917 ^ 121) | i918));
                            i20 = (i918 ^ i919) + ((i919 & i918) << 1);
                            b = i20 % 128;
                            if (i20 % 2 != 0) {
                                C0087m c0087m11 = xVar.ag[i18];
                                throw null;
                            }
                            c0087m5 = xVar.ag[i18];
                            if (z) {
                                sVar7 = c0087m5.i.c;
                                int i1010 = a;
                                int i1011 = i1010 & 125;
                                i21 = ((i1010 | 125) & (~i1011)) + (i1011 << 1);
                                b = i21 % 128;
                                if (i21 % 2 != 0) {
                                    sVar7.m.add(this.k);
                                    obj.hashCode();
                                    throw null;
                                }
                                sVar7.m.add(this.k);
                                int i1012 = a;
                                int i1013 = (i1012 & (-122)) | ((~i1012) & 121);
                                int i1014 = (i1012 & 121) << 1;
                                i22 = (i1013 ^ i1014) + ((i1014 & i1013) << 1);
                                b = i22 % 128;
                                if (i22 % 2 != 0) {
                                    this.k.n.add(sVar7);
                                    int i1015 = 6 / 0;
                                } else {
                                    this.k.n.add(sVar7);
                                }
                                int i1016 = b;
                                int i1017 = ((i1016 ^ 36) + ((i1016 & 36) << 1)) - 1;
                                a = i1017 % 128;
                                int i1018 = i1017 % 2;
                            } else {
                                sVar7 = c0087m5.i.c;
                                int i1019 = a;
                                int i10110 = i1019 & 125;
                                i21 = ((i1019 | 125) & (~i10110)) + (i10110 << 1);
                                b = i21 % 128;
                                if (i21 % 2 != 0) {
                                    sVar7.m.add(this.k);
                                    obj.hashCode();
                                    throw null;
                                }
                                sVar7.m.add(this.k);
                                int i10111 = a;
                                int i10112 = (i10111 & (-122)) | ((~i10111) & 121);
                                int i10113 = (i10111 & 121) << 1;
                                i22 = (i10112 ^ i10113) + ((i10113 & i10112) << 1);
                                b = i22 % 128;
                                if (i22 % 2 != 0) {
                                    this.k.n.add(sVar7);
                                    int i10114 = 6 / 0;
                                } else {
                                    this.k.n.add(sVar7);
                                }
                                int i10115 = b;
                                int i10116 = ((i10115 ^ 36) + ((i10115 & 36) << 1)) - 1;
                                a = i10116 % 128;
                                int i10117 = i10116 % 2;
                            }
                            i18 = (((i18 | 1) << 1) - (~(-(((~i18) & 1) | (i18 & (-2)))))) - 1;
                            int i1020 = a;
                            int i1110 = ((i1020 | 82) << 1) - (i1020 ^ 82);
                            int i1111 = (i1110 ^ (-1)) + (i1110 << 1);
                            b = i1111 % 128;
                            int i1112 = i1111 % 2;
                        }
                        o(this.e.i.k);
                        int i1113 = a;
                        int i1114 = (i1113 & 120) + (i1113 | 120);
                        i19 = (i1114 ^ (-1)) + (i1114 << 1);
                        b = i19 % 128;
                        if (i19 % 2 != 0) {
                            o(this.e.i.c);
                            throw null;
                        }
                        o(this.e.i.c);
                        int i1115 = b;
                        int i1116 = i1115 & 91;
                        int i1117 = ((i1115 | 91) & (~i1116)) + (i1116 << 1);
                        a = i1117 % 128;
                        int i1118 = i1117 % 2;
                        return;
                    }
                    sVar.i = 7;
                    int i9110 = b;
                    int i9111 = i9110 & 15;
                    int i9112 = (i9110 | 15) & (~i9111);
                    int i9113 = -(-(i9111 << 1));
                    int i9114 = ((i9112 | i9113) << 1) - (i9112 ^ i9113);
                    a = i9114 % 128;
                    int i9115 = i9114 % 2;
                    i18 = 0;
                    while (i18 < xVar.ah) {
                        int i9116 = a;
                        int i9117 = i9116 & 121;
                        int i9118 = -(-((i9116 ^ 121) | i9117));
                        i20 = (i9117 ^ i9118) + ((i9118 & i9117) << 1);
                        b = i20 % 128;
                        if (i20 % 2 != 0) {
                            C0087m c0087m12 = xVar.ag[i18];
                            throw null;
                        }
                        c0087m5 = xVar.ag[i18];
                        if (z) {
                            sVar7 = c0087m5.i.c;
                            int i10118 = a;
                            int i10119 = i10118 & 125;
                            i21 = ((i10118 | 125) & (~i10119)) + (i10119 << 1);
                            b = i21 % 128;
                            if (i21 % 2 != 0) {
                                sVar7.m.add(this.k);
                                obj.hashCode();
                                throw null;
                            }
                            sVar7.m.add(this.k);
                            int i101110 = a;
                            int i101111 = (i101110 & (-122)) | ((~i101110) & 121);
                            int i101112 = (i101110 & 121) << 1;
                            i22 = (i101111 ^ i101112) + ((i101112 & i101111) << 1);
                            b = i22 % 128;
                            if (i22 % 2 != 0) {
                                this.k.n.add(sVar7);
                                int i101113 = 6 / 0;
                            } else {
                                this.k.n.add(sVar7);
                            }
                            int i101114 = b;
                            int i101115 = ((i101114 ^ 36) + ((i101114 & 36) << 1)) - 1;
                            a = i101115 % 128;
                            int i101116 = i101115 % 2;
                        } else {
                            sVar7 = c0087m5.i.c;
                            int i101117 = a;
                            int i101118 = i101117 & 125;
                            i21 = ((i101117 | 125) & (~i101118)) + (i101118 << 1);
                            b = i21 % 128;
                            if (i21 % 2 != 0) {
                                sVar7.m.add(this.k);
                                obj.hashCode();
                                throw null;
                            }
                            sVar7.m.add(this.k);
                            int i101119 = a;
                            int i1011110 = (i101119 & (-122)) | ((~i101119) & 121);
                            int i1011111 = (i101119 & 121) << 1;
                            i22 = (i1011110 ^ i1011111) + ((i1011111 & i1011110) << 1);
                            b = i22 % 128;
                            if (i22 % 2 != 0) {
                                this.k.n.add(sVar7);
                                int i1011112 = 6 / 0;
                            } else {
                                this.k.n.add(sVar7);
                            }
                            int i1011113 = b;
                            int i1011114 = ((i1011113 ^ 36) + ((i1011113 & 36) << 1)) - 1;
                            a = i1011114 % 128;
                            int i1011115 = i1011114 % 2;
                        }
                        i18 = (((i18 | 1) << 1) - (~(-(((~i18) & 1) | (i18 & (-2)))))) - 1;
                        int i1021 = a;
                        int i1119 = ((i1021 | 82) << 1) - (i1021 ^ 82);
                        int i11110 = (i1119 ^ (-1)) + (i1119 << 1);
                        b = i11110 % 128;
                        int i11111 = i11110 % 2;
                    }
                    o(this.e.i.k);
                    int i11112 = a;
                    int i11113 = (i11112 & 120) + (i11112 | 120);
                    i19 = (i11113 ^ (-1)) + (i11113 << 1);
                    b = i19 % 128;
                    if (i19 % 2 != 0) {
                        o(this.e.i.c);
                        throw null;
                    }
                    o(this.e.i.c);
                    int i11114 = b;
                    int i11115 = i11114 & 91;
                    int i11116 = ((i11114 | 91) & (~i11115)) + (i11115 << 1);
                    a = i11116 % 128;
                    int i11117 = i11116 % 2;
                    return;
                }
                sVar.i = 4;
                int i1120 = a + 12;
                int i1210 = (i1120 ^ (-1)) + (i1120 << 1);
                b = i1210 % 128;
                int i1211 = i1210 % 2;
                i2 = 0;
                while (i2 < xVar.ah) {
                    int i1212 = b;
                    int i1213 = i1212 ^ 81;
                    int i1214 = -(-((i1212 & 81) << 1));
                    int i1215 = ((i1213 | i1214) << 1) - (i1214 ^ i1213);
                    a = i1215 % 128;
                    int i1216 = i1215 % 2;
                    c0087m2 = xVar.ag[i2];
                    if (!z) {
                        int i1217 = b;
                        int i1218 = i1217 & 3;
                        int i1219 = -(-((i1217 ^ 3) | i1218));
                        int i1320 = (i1218 ^ i1219) + ((i1219 & i1218) << 1);
                        a = i1320 % 128;
                        i4 = i1320 % 2;
                        i5 = c0087m2.Y;
                        if (i4 == 0) {
                            if (i5 != 37) {
                                sVar2 = c0087m2.g.k;
                                List<V> list7 = sVar2.m;
                                int i13112 = b;
                                int i13113 = (i13112 & (-80)) | ((~i13112) & 79);
                                int i13114 = -(-((i13112 & 79) << 1));
                                int i13115 = (i13113 ^ i13114) + ((i13114 & i13113) << 1);
                                a = i13115 % 128;
                                int i13116 = i13115 % 2;
                                list7.add(this.k);
                                list = this.k.n;
                                i3 = b + 123;
                                a = i3 % 128;
                                if (i3 % 2 != 0) {
                                    list.add(sVar2);
                                    throw null;
                                }
                                list.add(sVar2);
                                int i13117 = a + 43;
                                b = i13117 % 128;
                                int i13118 = i13117 % 2;
                            } else {
                                continue;
                            }
                        } else if (i5 != 8) {
                            sVar2 = c0087m2.g.k;
                            List<V> list8 = sVar2.m;
                            int i13119 = b;
                            int i131110 = (i13119 & (-80)) | ((~i13119) & 79);
                            int i131111 = -(-((i13119 & 79) << 1));
                            int i131112 = (i131110 ^ i131111) + ((i131111 & i131110) << 1);
                            a = i131112 % 128;
                            int i131113 = i131112 % 2;
                            list8.add(this.k);
                            list = this.k.n;
                            i3 = b + 123;
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                list.add(sVar2);
                                throw null;
                            }
                            list.add(sVar2);
                            int i131114 = a + 43;
                            b = i131114 % 128;
                            int i131115 = i131114 % 2;
                        } else {
                            continue;
                        }
                    } else {
                        sVar2 = c0087m2.g.k;
                        List<V> list9 = sVar2.m;
                        int i131116 = b;
                        int i131117 = (i131116 & (-80)) | ((~i131116) & 79);
                        int i131118 = -(-((i131116 & 79) << 1));
                        int i131119 = (i131117 ^ i131118) + ((i131118 & i131117) << 1);
                        a = i131119 % 128;
                        int i1311110 = i131119 % 2;
                        list9.add(this.k);
                        list = this.k.n;
                        i3 = b + 123;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            list.add(sVar2);
                            throw null;
                        }
                        list.add(sVar2);
                        int i1311111 = a + 43;
                        b = i1311111 % 128;
                        int i1311112 = i1311111 % 2;
                    }
                    i2++;
                    int i148 = a;
                    int i149 = ((i148 ^ 39) - (~((i148 & 39) << 1))) - 1;
                    b = i149 % 128;
                    int i1410 = i149 % 2;
                }
                o(this.e.g.k);
                int i1411 = b;
                int i1412 = ((i1411 & 118) + (i1411 | 118)) - 1;
                a = i1412 % 128;
                int i1413 = i1412 % 2;
                o(this.e.g.c);
                int i1414 = a + 7;
                b = i1414 % 128;
                int i1415 = i1414 % 2;
            }
        }
        int i150 = a;
        int i151 = i150 & 31;
        int i152 = (i151 - (~(-(-((i150 ^ 31) | i151))))) - 1;
        b = i152 % 128;
        if (i152 % 2 != 0) {
            int i153 = 59 / 0;
        }
    }
}
