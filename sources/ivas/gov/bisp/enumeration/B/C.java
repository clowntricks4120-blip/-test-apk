package ivas.gov.bisp.enumeration.B;

import androidx.constraintlayout.widget.ConstraintLayout;
import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.N;
import ivas.gov.bisp.enumeration.p004ad.O;
import ivas.gov.bisp.enumeration.p004ad.Q;
import ivas.gov.bisp.enumeration.p004ad.S;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class C {
    private static int a = 1;
    private static int b;
    public O c;
    public O f;
    public A.aJL g;
    public A.aUq i;
    public ArrayList<n> j;
    public boolean d = true;
    public boolean e = true;
    public ArrayList<Y> h = new ArrayList<>();

    public C(O o2) {
        new ArrayList();
        this.g = null;
        this.i = new A.aUq();
        this.j = new ArrayList<>();
        this.c = o2;
        this.f = o2;
    }

    public final void h(Y y, int i, ArrayList<n> arrayList) {
        Iterator<V> it;
        s sVar;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-70)) | ((~i3) & 69)) + ((i3 & 69) << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            it = y.k.m.iterator();
            int i5 = 94 / 0;
        } else {
            it = y.k.m.iterator();
        }
        int i6 = a;
        int i7 = i6 & 51;
        int i8 = -(-((i6 ^ 51) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i11 = b;
                int i12 = i11 ^ 93;
                int i13 = (i11 & 93) << 1;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 83 / 0;
                }
                for (V v : y.c.m) {
                    int i16 = a;
                    int i17 = i16 & 91;
                    int i18 = ((i16 | 91) & (~i17)) + (i17 << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    if (!(!(v instanceof s))) {
                        int i20 = a;
                        int i21 = i20 ^ 87;
                        int i22 = (i20 & 87) << 1;
                        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        s sVar2 = (s) v;
                        s sVar3 = y.k;
                        int i25 = a;
                        int i26 = (i25 ^ 3) + ((i25 & 3) << 1);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        c(sVar2, i, 1, sVar3, arrayList, null);
                        int i28 = b;
                        int i29 = i28 & 85;
                        int i30 = ((i28 | 85) & (~i29)) + (i29 << 1);
                        a = i30 % 128;
                        int i31 = i30 % 2;
                    } else if (v instanceof Y) {
                        int i32 = a;
                        int i33 = i32 & 55;
                        int i34 = (i32 | 55) & (~i33);
                        int i35 = i33 << 1;
                        int i36 = (i34 & i35) + (i34 | i35);
                        b = i36 % 128;
                        if (i36 % 2 != 0) {
                            sVar = ((Y) v).c;
                            int i37 = 74 / 0;
                        } else {
                            sVar = ((Y) v).c;
                        }
                        s sVar4 = sVar;
                        int i38 = a;
                        int i39 = i38 & 47;
                        int i40 = i39 + ((i38 ^ 47) | i39);
                        b = i40 % 128;
                        int i41 = i40 % 2;
                        c(sVar4, i, 1, y.k, arrayList, null);
                        int i42 = a;
                        int i43 = ((i42 & 123) - (~(i42 | 123))) - 1;
                        b = i43 % 128;
                        if (i43 % 2 != 0) {
                            int i44 = 4 / 4;
                        }
                    }
                }
                if (i == 1) {
                    int i45 = a;
                    int i46 = i45 & 109;
                    int i47 = (i45 | 109) & (~i46);
                    int i48 = -(-(i46 << 1));
                    int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                    b = i49 % 128;
                    if (i49 % 2 != 0) {
                        ((X) y).m.m.iterator();
                        throw null;
                    }
                    Iterator<V> it2 = ((X) y).m.m.iterator();
                    int i50 = b;
                    int i51 = i50 & 11;
                    int i52 = (i50 ^ 11) | i51;
                    int i53 = (i51 & i52) + (i52 | i51);
                    int i54 = i53 % 128;
                    a = i54;
                    if (i53 % 2 == 0) {
                        int i55 = 98 / 0;
                    }
                    int i56 = i54 & 117;
                    int i57 = (i54 | 117) & (~i56);
                    int i58 = -(-(i56 << 1));
                    int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
                    b = i59 % 128;
                    int i60 = i59 % 2;
                    while (it2.hasNext()) {
                        int i61 = a;
                        int i62 = ((i61 ^ 35) - (~((i61 & 35) << 1))) - 1;
                        b = i62 % 128;
                        if (i62 % 2 != 0) {
                            boolean z = it2.next() instanceof s;
                            obj.hashCode();
                            throw null;
                        }
                        V next = it2.next();
                        if (next instanceof s) {
                            s sVar5 = (s) next;
                            int i63 = b;
                            int i64 = i63 & 115;
                            int i65 = (i63 | 115) & (~i64);
                            int i66 = i64 << 1;
                            int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                            a = i67 % 128;
                            if (i67 % 2 == 0) {
                                c(sVar5, i, 2, null, arrayList, null);
                                obj.hashCode();
                                throw null;
                            }
                            c(sVar5, i, 2, null, arrayList, null);
                        }
                    }
                }
                int i68 = b;
                int i69 = i68 & 31;
                int i70 = ((((i68 ^ 31) | i69) << 1) - (~(-((i68 | 31) & (~i69))))) - 1;
                a = i70 % 128;
                if (i70 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i71 = b;
            int i72 = i71 & 109;
            int i73 = (i71 | 109) & (~i72);
            int i74 = i72 << 1;
            int i75 = ((i73 | i74) << 1) - (i73 ^ i74);
            a = i75 % 128;
            if (i75 % 2 == 0) {
                it.next();
                obj.hashCode();
                throw null;
            }
            V next2 = it.next();
            if (next2 instanceof s) {
                int i76 = b;
                int i77 = ((i76 & (-54)) | ((~i76) & 53)) + ((i76 & 53) << 1);
                a = i77 % 128;
                int i78 = i77 % 2;
                s sVar6 = (s) next2;
                s sVar7 = y.c;
                int i79 = a;
                int i80 = i79 | 67;
                int i81 = i80 << 1;
                int i82 = -((~(i79 & 67)) & i80);
                int i83 = (i81 & i82) + (i82 | i81);
                b = i83 % 128;
                if (i83 % 2 != 0) {
                    c(sVar6, i, 0, sVar7, arrayList, null);
                    obj.hashCode();
                    throw null;
                }
                c(sVar6, i, 0, sVar7, arrayList, null);
                int i84 = b + 41;
                a = i84 % 128;
                int i85 = i84 % 2;
            } else if (!(!(next2 instanceof Y))) {
                int i86 = a + 107;
                b = i86 % 128;
                int i87 = i86 % 2;
                s sVar8 = ((Y) next2).k;
                int i88 = (-2) - ((b + 126) ^ (-1));
                a = i88 % 128;
                int i89 = i88 % 2;
                c(sVar8, i, 0, y.c, arrayList, null);
                int i90 = a;
                int i91 = i90 & 69;
                int i92 = (i90 | 69) & (~i91);
                int i93 = -(-(i91 << 1));
                int i94 = (i92 & i93) + (i92 | i93);
                b = i94 % 128;
                if (i94 % 2 != 0) {
                    int i95 = 3 % 3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0153  */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:70:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x025b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0270  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0323  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0028 A[SYNTHETIC] */
    public void i() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        C0015y c0015y;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        C0015y c0015y2;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = i10 & 59;
        int i12 = (i10 ^ 59) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            this.c.ag.iterator();
            throw null;
        }
        Iterator<C0087m> it = this.c.ag.iterator();
        int i14 = b + 61;
        a = i14 % 128;
        int i15 = i14 % 2;
        while (it.hasNext()) {
            int i16 = b;
            int i17 = i16 & 1;
            int i18 = (i17 - (~((i16 ^ 1) | i17))) - 1;
            a = i18 % 128;
            if (i18 % 2 == 0) {
                Object obj = null;
                it.next();
                obj.hashCode();
                throw null;
            }
            C0087m next = it.next();
            if (!next.d) {
                int i19 = b + 59;
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    int[] iArr = next.M;
                    i = iArr[1];
                    i2 = iArr[0];
                } else {
                    int[] iArr2 = next.M;
                    i = iArr2[0];
                    i2 = iArr2[1];
                }
                int i20 = i2;
                int i21 = i;
                int i22 = a;
                int i23 = ((i22 & 74) + (i22 | 74)) - 1;
                b = i23 % 128;
                int i24 = i23 % 2;
                int i25 = next.l;
                int i26 = next.m;
                if (i21 != 2) {
                    int i27 = b;
                    int i28 = (i27 & (-64)) | ((~i27) & 63);
                    int i29 = -(-((i27 & 63) << 1));
                    int i30 = (i28 & i29) + (i29 | i28);
                    int i31 = i30 % 128;
                    a = i31;
                    if (i30 % 2 != 0 ? i21 == 3 : i21 == 4) {
                        if (i25 == 1) {
                            int i32 = a;
                            int i33 = i32 & 95;
                            int i34 = (i33 - (~(-(-((i32 ^ 95) | i33))))) - 1;
                            b = i34 % 128;
                            int i35 = i34 % 2;
                            z = true;
                        }
                    }
                    int i36 = i31 ^ 97;
                    int i37 = (i31 & 97) << 1;
                    int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                    b = i38 % 128;
                    int i39 = i38 % 2;
                    z = false;
                } else {
                    int i310 = a;
                    int i311 = i310 & 95;
                    int i312 = (i311 - (~(-(-((i310 ^ 95) | i311))))) - 1;
                    b = i312 % 128;
                    int i313 = i312 % 2;
                    z = true;
                }
                if (i20 != 2) {
                    int i40 = a;
                    int i41 = i40 & 125;
                    int i42 = i41 + ((i40 ^ 125) | i41);
                    b = i42 % 128;
                    int i43 = i42 % 2;
                    if (i20 == 3) {
                        int i44 = ((i40 ^ 91) | (i40 & 91)) << 1;
                        int i45 = -((91 & (~i40)) | (i40 & (-92)));
                        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                        b = i46 % 128;
                        int i47 = i46 % 2;
                        if (i26 == 1) {
                            int i48 = b;
                            int i49 = i48 & 9;
                            int i50 = (i49 - (~((i48 ^ 9) | i49))) - 1;
                            a = i50 % 128;
                            int i51 = i50 % 2;
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else {
                    int i410 = b;
                    int i411 = i410 & 9;
                    int i52 = (i411 - (~((i410 ^ 9) | i411))) - 1;
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    z2 = true;
                }
                C0015y c0015y3 = next.g.i;
                boolean z4 = c0015y3.l;
                int i54 = b;
                int i55 = (i54 & 1) + (i54 | 1);
                a = i55 % 128;
                if (i55 % 2 == 0) {
                    c0015y = next.i.i;
                    z3 = c0015y.l;
                    int i56 = 92 / 0;
                } else {
                    c0015y = next.i.i;
                    z3 = c0015y.l;
                }
                int i57 = b;
                int i58 = i57 + 23;
                a = i58 % 128;
                if (i58 % 2 == 0) {
                    int i59 = 99 / 0;
                    if (z4) {
                        if (!(!z3)) {
                            int i60 = ((i57 ^ 17) | (i57 & 17)) << 1;
                            int i61 = -((i57 & (-18)) | ((~i57) & 17));
                            i3 = ((i60 | i61) << 1) - (i60 ^ i61);
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                i4 = c0015y3.j;
                                i5 = c0015y.j;
                                i6 = 0;
                            } else {
                                i4 = c0015y3.j;
                                i5 = c0015y.j;
                                i6 = 1;
                            }
                            g(next, i6, i4, 1, i5);
                            next.d = true;
                            int i62 = a + 25;
                            b = i62 % 128;
                            int i63 = i62 % 2;
                        }
                    }
                    if (next.d) {
                        int i64 = a;
                        int i65 = i64 & 87;
                        int i66 = (i65 - (~(-(-((i64 ^ 87) | i65))))) - 1;
                        b = i66 % 128;
                        int i67 = i66 % 2;
                        c0015y2 = next.i.n;
                        if (c0015y2 != null) {
                            int i68 = b;
                            i7 = ((i68 & (-78)) | ((~i68) & 77)) + ((i68 & 77) << 1);
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                c0015y2.e(next.T);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            c0015y2.e(next.T);
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (!(!z4)) {
                        if (!(!z3)) {
                            int i69 = ((i57 ^ 17) | (i57 & 17)) << 1;
                            int i610 = -((i57 & (-18)) | ((~i57) & 17));
                            i3 = ((i69 | i610) << 1) - (i69 ^ i610);
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                i4 = c0015y3.j;
                                i5 = c0015y.j;
                                i6 = 0;
                            } else {
                                i4 = c0015y3.j;
                                i5 = c0015y.j;
                                i6 = 1;
                            }
                            g(next, i6, i4, 1, i5);
                            next.d = true;
                            int i611 = a + 25;
                            b = i611 % 128;
                            int i612 = i611 % 2;
                        }
                    }
                    if (next.d) {
                        int i613 = a;
                        int i614 = i613 & 87;
                        int i615 = (i614 - (~(-(-((i613 ^ 87) | i614))))) - 1;
                        b = i615 % 128;
                        int i616 = i615 % 2;
                        c0015y2 = next.i.n;
                        if (c0015y2 != null) {
                            int i617 = b;
                            i7 = ((i617 & (-78)) | ((~i617) & 77)) + ((i617 & 77) << 1);
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                c0015y2.e(next.T);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            c0015y2.e(next.T);
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                if (z4) {
                    int i70 = ((i57 | 43) << 1) - (i57 ^ 43);
                    int i71 = i70 % 128;
                    a = i71;
                    int i72 = i70 % 2;
                    if (z2) {
                        int i73 = (i71 ^ 125) + ((i71 & 125) << 1);
                        b = i73 % 128;
                        int i74 = i73 % 2;
                        int i75 = c0015y3.j;
                        int i76 = c0015y.j;
                        int i77 = b;
                        int i78 = i77 & 67;
                        int i79 = ((i77 ^ 67) | i78) << 1;
                        int i80 = -((i77 | 67) & (~i78));
                        int i81 = (i79 & i80) + (i80 | i79);
                        a = i81 % 128;
                        int i82 = i81 % 2;
                        g(next, 1, i75, 2, i76);
                        if (i20 == 3) {
                            int i83 = b;
                            int i84 = (((i83 | 45) << 1) - (~(-(((~i83) & 45) | (i83 & (-46)))))) - 1;
                            a = i84 % 128;
                            if (i84 % 2 == 0) {
                                C0015y c0015y4 = next.i.i;
                                next.c();
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            C0015y c0015y5 = next.i.i;
                            int iC = next.c();
                            int i85 = a;
                            int i86 = ((i85 | 106) << 1) - (i85 ^ 106);
                            int i87 = (i86 ^ (-1)) + (i86 << 1);
                            b = i87 % 128;
                            int i88 = i87 % 2;
                            c0015y5.f41o = iC;
                            int i89 = b;
                            int i90 = i89 ^ 39;
                            int i91 = ((i89 & 39) | i90) << 1;
                            int i92 = -i90;
                            int i93 = (i91 & i92) + (i91 | i92);
                            a = i93 % 128;
                            int i94 = i93 % 2;
                        } else {
                            next.i.i.e(next.c());
                            int i95 = a + 29;
                            b = i95 % 128;
                            int i96 = i95 % 2;
                            next.d = true;
                            int i97 = a;
                            int i98 = i97 & 53;
                            int i99 = (((i97 ^ 53) | i98) << 1) - ((~i98) & (i97 | 53));
                            b = i99 % 128;
                            if (i99 % 2 != 0) {
                                int i100 = 4 / 5;
                            }
                        }
                    } else if (z3) {
                        i8 = a;
                        int i101 = i8 & 47;
                        int i102 = (((i8 ^ 47) | i101) << 1) - ((~i101) & (i8 | 47));
                        b = i102 % 128;
                        int i103 = i102 % 2;
                        if (z) {
                            int i104 = i8 & 47;
                            int i105 = (i104 - (~((i8 ^ 47) | i104))) - 1;
                            b = i105 % 128;
                            int i106 = i105 % 2;
                            int i107 = c0015y3.j;
                            int i108 = b;
                            int i109 = (-2) - ((((i108 | 28) << 1) - (i108 ^ 28)) ^ (-1));
                            a = i109 % 128;
                            int i110 = i109 % 2;
                            g(next, 2, i107, 1, c0015y.j);
                            if (i21 == 3) {
                                int i111 = b;
                                int i112 = i111 & 107;
                                int i113 = ((i111 | 107) & (~i112)) + (i112 << 1);
                                a = i113 % 128;
                                int i114 = i113 % 2;
                                next.g.i.f41o = next.p();
                                int i115 = a;
                                int i116 = (i115 ^ 87) + ((i115 & 87) << 1);
                                b = i116 % 128;
                                int i117 = i116 % 2;
                            } else {
                                C0015y c0015y6 = next.g.i;
                                int iP = next.p();
                                int i118 = a;
                                int i119 = i118 & 77;
                                int i120 = -(-(i118 | 77));
                                int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                                b = i121 % 128;
                                int i122 = i121 % 2;
                                c0015y6.e(iP);
                                next.d = true;
                                int i123 = a;
                                int i124 = ((i123 | 35) << 1) - (i123 ^ 35);
                                b = i124 % 128;
                                int i125 = i124 % 2;
                            }
                        }
                    }
                } else if (z3) {
                    i8 = a;
                    int i1010 = i8 & 47;
                    int i1011 = (((i8 ^ 47) | i1010) << 1) - ((~i1010) & (i8 | 47));
                    b = i1011 % 128;
                    int i1012 = i1011 % 2;
                    if (z) {
                        int i1013 = i8 & 47;
                        int i1014 = (i1013 - (~((i8 ^ 47) | i1013))) - 1;
                        b = i1014 % 128;
                        int i1015 = i1014 % 2;
                        int i1016 = c0015y3.j;
                        int i1017 = b;
                        int i1018 = (-2) - ((((i1017 | 28) << 1) - (i1017 ^ 28)) ^ (-1));
                        a = i1018 % 128;
                        int i1110 = i1018 % 2;
                        g(next, 2, i1016, 1, c0015y.j);
                        if (i21 == 3) {
                            int i1111 = b;
                            int i1112 = i1111 & 107;
                            int i1113 = ((i1111 | 107) & (~i1112)) + (i1112 << 1);
                            a = i1113 % 128;
                            int i1114 = i1113 % 2;
                            next.g.i.f41o = next.p();
                            int i1115 = a;
                            int i1116 = (i1115 ^ 87) + ((i1115 & 87) << 1);
                            b = i1116 % 128;
                            int i1117 = i1116 % 2;
                        } else {
                            C0015y c0015y7 = next.g.i;
                            int iP2 = next.p();
                            int i1118 = a;
                            int i1119 = i1118 & 77;
                            int i126 = -(-(i1118 | 77));
                            int i127 = ((i1119 | i126) << 1) - (i126 ^ i1119);
                            b = i127 % 128;
                            int i128 = i127 % 2;
                            c0015y7.e(iP2);
                            next.d = true;
                            int i129 = a;
                            int i1210 = ((i129 | 35) << 1) - (i129 ^ 35);
                            b = i1210 % 128;
                            int i1211 = i1210 % 2;
                        }
                    }
                }
                if (next.d) {
                    int i618 = a;
                    int i619 = i618 & 87;
                    int i6110 = (i619 - (~(-(-((i618 ^ 87) | i619))))) - 1;
                    b = i6110 % 128;
                    int i6111 = i6110 % 2;
                    c0015y2 = next.i.n;
                    if (c0015y2 != null) {
                        int i6112 = b;
                        i7 = ((i6112 & (-78)) | ((~i6112) & 77)) + ((i6112 & 77) << 1);
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            c0015y2.e(next.T);
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                        c0015y2.e(next.T);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        int i130 = a;
        int i131 = (i130 ^ 1) + ((i130 & 1) << 1);
        b = i131 % 128;
        if (i131 % 2 != 0) {
            int i132 = 49 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:12:0x00b1  */
    public final void g(C0087m c0087m, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = a + 33;
        b = i6 % 128;
        int i7 = i6 % 2;
        A.aUq auq = this.i;
        auq.b = i;
        int i8 = a;
        int i9 = (((i8 | 10) << 1) - (i8 ^ 10)) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        auq.c = i3;
        auq.d = i2;
        int i11 = a;
        int i12 = ((i11 & (-116)) | ((~i11) & 115)) + ((i11 & 115) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        auq.e = i4;
        ConstraintLayout.OooO0O0 oooO0O0 = (ConstraintLayout.OooO0O0) this.g;
        int i14 = b + 105;
        a = i14 % 128;
        int i15 = i14 % 2;
        oooO0O0.b(c0087m, auq);
        int i16 = this.i.g;
        int i17 = a;
        int i18 = i17 & 95;
        int i19 = (i17 | 95) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        b = i21 % 128;
        int i22 = i21 % 2;
        c0087m.D(i16);
        c0087m.y(this.i.f);
        int i23 = b;
        int i24 = i23 & 27;
        int i25 = (i23 | 27) & (~i24);
        int i26 = i24 << 1;
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            boolean z = this.i.i;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        A.aUq auq2 = this.i;
        c0087m.z = auq2.i;
        int i28 = auq2.h;
        int i29 = a;
        int i30 = (((i29 | 72) << 1) - (i29 ^ 72)) - 1;
        b = i30 % 128;
        boolean z2 = false;
        if (i30 % 2 != 0) {
            c0087m.T = i28;
            int i31 = 1 / 0;
            if (i28 > 0) {
                int i32 = b;
                int i33 = (i32 ^ 19) + ((i32 & 19) << 1);
                a = i33 % 128;
                int i34 = i33 % 2;
                z2 = true;
            } else {
                int i35 = b;
                int i36 = ((i35 | 31) << 1) - (i35 ^ 31);
                a = i36 % 128;
                int i37 = i36 % 2;
            }
        } else {
            c0087m.T = i28;
            if (i28 > 0) {
                int i38 = b;
                int i39 = (i38 ^ 19) + ((i38 & 19) << 1);
                a = i39 % 128;
                int i310 = i39 % 2;
                z2 = true;
            } else {
                int i311 = b;
                int i312 = ((i311 | 31) << 1) - (i311 ^ 31);
                a = i312 % 128;
                int i313 = i312 % 2;
            }
        }
        c0087m.z = z2;
        int i40 = a;
        int i41 = (i40 ^ 75) + ((i40 & 75) << 1);
        b = i41 % 128;
        int i42 = i41 % 2;
    }

    public void e() {
        ArrayList<Y> arrayList;
        D d;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 95) - (~(-(-(i2 | 95))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            arrayList = this.h;
            arrayList.clear();
            d = this.f.g;
            int i4 = 68 / 0;
        } else {
            arrayList = this.h;
            arrayList.clear();
            d = this.f.g;
        }
        int i5 = b;
        int i6 = i5 & 7;
        int i7 = (i5 | 7) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            d.h();
            this.f.i.h();
            throw null;
        }
        d.h();
        this.f.i.h();
        arrayList.add(this.f.g);
        O o2 = this.f;
        int i10 = a;
        int i11 = (i10 & 71) + (i10 | 71);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            arrayList.add(o2.i);
            ArrayList<C0087m> arrayList2 = this.f.ag;
            throw null;
        }
        arrayList.add(o2.i);
        int i12 = a;
        int i13 = (i12 & 41) + (i12 | 41);
        b = i13 % 128;
        int i14 = i13 % 2;
        HashSet hashSet = null;
        for (C0087m c0087m : this.f.ag) {
            int i15 = a + 19;
            b = i15 % 128;
            int i16 = i15 % 2;
            if (c0087m instanceof Q) {
                arrayList.add(new W(c0087m));
                int i17 = a + 117;
                b = i17 % 128;
                int i18 = i17 % 2;
            } else {
                if (c0087m.t()) {
                    int i19 = b;
                    int i20 = (i19 ^ 87) + ((i19 & 87) << 1);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    if (c0087m.e == null) {
                        am amVar = new am(c0087m, 0);
                        int i22 = a;
                        int i23 = i22 ^ 7;
                        int i24 = ((i22 & 7) | i23) << 1;
                        int i25 = -i23;
                        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        c0087m.e = amVar;
                        int i28 = a;
                        int i29 = i28 & 103;
                        int i30 = -(-(i28 | 103));
                        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                        b = i31 % 128;
                        int i32 = i31 % 2;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        int i33 = b;
                        int i34 = (i33 | 43) << 1;
                        int i35 = -(((~i33) & 43) | (i33 & (-44)));
                        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                    }
                    hashSet.add(c0087m.e);
                    int i38 = a;
                    int i39 = i38 & 45;
                    int i40 = (((i38 ^ 45) | i39) << 1) - ((i38 | 45) & (~i39));
                    b = i40 % 128;
                    int i41 = i40 % 2;
                } else {
                    arrayList.add(c0087m.g);
                    int i42 = b;
                    int i43 = (i42 & 7) + (i42 | 7);
                    a = i43 % 128;
                    int i44 = i43 % 2;
                }
                if (c0087m.w()) {
                    int i45 = b;
                    int i46 = i45 & 61;
                    int i47 = (i46 - (~(-(-((i45 ^ 61) | i46))))) - 1;
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    if (c0087m.f == null) {
                        c0087m.f = new am(c0087m, 1);
                        int i49 = b;
                        int i50 = i49 & 45;
                        int i51 = (i49 | 45) & (~i50);
                        int i52 = i50 << 1;
                        int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
                        a = i53 % 128;
                        int i54 = i53 % 2;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        int i55 = a;
                        int i56 = (i55 & (-56)) | ((~i55) & 55);
                        int i57 = -(-((i55 & 55) << 1));
                        int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                        b = i58 % 128;
                        int i59 = i58 % 2;
                    }
                    hashSet.add(c0087m.f);
                    int i60 = a;
                    int i61 = (i60 & 93) + (i60 | 93);
                    b = i61 % 128;
                    int i62 = i61 % 2;
                } else {
                    arrayList.add(c0087m.i);
                    int i63 = b;
                    int i64 = (i63 & 7) + (i63 | 7);
                    a = i64 % 128;
                    int i65 = i64 % 2;
                }
                if (c0087m instanceof S) {
                    arrayList.add(new al(c0087m));
                    int i66 = b;
                    int i67 = (((i66 ^ 9) | (i66 & 9)) << 1) - (((~i66) & 9) | (i66 & (-10)));
                    a = i67 % 128;
                    int i68 = i67 % 2;
                }
            }
        }
        if (hashSet != null) {
            int i69 = a;
            int i70 = ((i69 & 27) - (~(-(-(i69 | 27))))) - 1;
            b = i70 % 128;
            if (i70 % 2 != 0) {
                arrayList.addAll(hashSet);
                obj.hashCode();
                throw null;
            }
            arrayList.addAll(hashSet);
            int i71 = b;
            int i72 = ((i71 ^ 91) | (i71 & 91)) << 1;
            int i73 = -(((~i71) & 91) | (i71 & (-92)));
            int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
            a = i74 % 128;
            int i75 = i74 % 2;
        }
        Iterator<Y> it = arrayList.iterator();
        int i76 = a;
        int i77 = i76 & 33;
        int i78 = i76 | 33;
        int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
        b = i79 % 128;
        int i80 = i79 % 2;
        while (it.hasNext()) {
            int i81 = b;
            int i82 = i81 & 103;
            int i83 = (i81 | 103) & (~i82);
            int i84 = -(-(i82 << 1));
            int i85 = ((i83 | i84) << 1) - (i83 ^ i84);
            a = i85 % 128;
            int i86 = i85 % 2;
            it.next().h();
            int i87 = b + 57;
            a = i87 % 128;
            int i88 = i87 % 2;
        }
        int i89 = a;
        int i90 = ((i89 | 5) << 1) - (i89 ^ 5);
        b = i90 % 128;
        int i91 = i90 % 2;
        for (Y y : arrayList) {
            int i92 = a + 13;
            b = i92 % 128;
            int i93 = i92 % 2;
            if (y.e != this.f) {
                int i94 = a;
                int i95 = i94 & 45;
                int i96 = (i95 - (~(-(-((i94 ^ 45) | i95))))) - 1;
                b = i96 % 128;
                if (i96 % 2 != 0) {
                    y.g();
                    obj.hashCode();
                    throw null;
                }
                y.g();
            }
        }
        this.j.clear();
        n.c = 0;
        int i97 = a;
        int i98 = (i97 & (-10)) | ((~i97) & 9);
        int i99 = -(-((i97 & 9) << 1));
        int i100 = (i98 & i99) + (i99 | i98);
        b = i100 % 128;
        int i101 = i100 % 2;
        h(this.c.g, 0, this.j);
        X x = this.c.i;
        int i102 = a;
        int i103 = i102 & 29;
        int i104 = (i102 | 29) & (~i103);
        int i105 = i103 << 1;
        int i106 = (i104 & i105) + (i104 | i105);
        b = i106 % 128;
        int i107 = i106 % 2;
        h(x, 1, this.j);
        this.d = false;
        int i108 = b;
        int i109 = ((i108 | 48) << 1) - (i108 ^ 48);
        int i110 = (i109 ^ (-1)) + (i109 << 1);
        a = i110 % 128;
        int i111 = i110 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0425 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0427  */
    /* JADX WARN: Code duplicated, block: B:104:0x0489  */
    /* JADX WARN: Code duplicated, block: B:105:0x0492  */
    /* JADX WARN: Code duplicated, block: B:107:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:109:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:121:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x041d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x0102  */
    /* JADX WARN: Code duplicated, block: B:30:0x012e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0177  */
    /* JADX WARN: Code duplicated, block: B:35:0x0181  */
    /* JADX WARN: Code duplicated, block: B:36:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x019e  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x01da  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0209 A[PHI: r19 r23
  0x0209: PHI (r19v9 int) = (r19v8 int), (r19v11 int) binds: [B:52:0x0207, B:49:0x01fc] A[DONT_GENERATE, DONT_INLINE]
  0x0209: PHI (r23v1 long) = (r23v0 long), (r23v3 long) binds: [B:52:0x0207, B:49:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0248  */
    /* JADX WARN: Code duplicated, block: B:59:0x0253  */
    /* JADX WARN: Code duplicated, block: B:61:0x0257  */
    /* JADX WARN: Code duplicated, block: B:64:0x0276  */
    /* JADX WARN: Code duplicated, block: B:66:0x0297  */
    /* JADX WARN: Code duplicated, block: B:68:0x029a  */
    /* JADX WARN: Code duplicated, block: B:69:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x032c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0360  */
    /* JADX WARN: Code duplicated, block: B:79:0x0368  */
    /* JADX WARN: Code duplicated, block: B:82:0x0392  */
    /* JADX WARN: Code duplicated, block: B:87:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:90:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0413  */
    public final int f(O o2, int i) {
        Y y;
        Y y2;
        boolean zContains;
        boolean zContains2;
        int i2;
        long jL;
        int i3;
        long j;
        long jD;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        int i10;
        long j4;
        long j5;
        int i11;
        C0087m c0087m;
        float f;
        int i12;
        long j6;
        long j7;
        float fE;
        int i13;
        long j8;
        Y y3;
        long j9;
        int i14;
        long j10;
        int i15;
        int i16;
        long jMax;
        long j11;
        Y y4;
        int i17;
        int i18;
        long jL2;
        Y y5;
        long j12;
        long j13;
        int i19;
        long jMax2;
        int i20;
        s sVar;
        long jD2;
        int i21;
        int i22;
        int i23;
        int i24 = 2;
        int i25 = 2 % 2;
        int i26 = a;
        int i27 = i26 ^ 49;
        int i28 = 1;
        int i29 = -(-((i26 & 49) << 1));
        int i30 = (i27 ^ i29) + ((i29 & i27) << 1);
        b = i30 % 128;
        int i31 = i30 % 2;
        int size = this.j.size();
        int i32 = b;
        int i33 = (i32 & (-106)) | ((~i32) & 105);
        int i34 = (i32 & 105) << 1;
        int i35 = (i33 & i34) + (i34 | i33);
        a = i35 % 128;
        int i36 = i35 % 2;
        int i37 = 0;
        long jMax3 = 0;
        while (i37 < size) {
            int i38 = a;
            int i39 = i38 & 117;
            int i40 = -(-((i38 ^ 117) | i39));
            int i41 = (i39 & i40) + (i40 | i39);
            b = i41 % 128;
            Object obj = null;
            if (i41 % i24 != 0) {
                this.j.get(i37);
                throw null;
            }
            n nVar = this.j.get(i37);
            Y y6 = nVar.d;
            if ((y6 instanceof am) == i28) {
                int i42 = a;
                int i43 = i42 & 3;
                int i44 = -(-((i42 ^ 3) | i43));
                int i45 = (i43 & i44) + (i44 | i43);
                b = i45 % 128;
                int i46 = i45 % i24;
                if (((am) y6).h != i) {
                    int i47 = b;
                    int i48 = i47 & 103;
                    int i49 = (i48 - (~(-(-((i47 ^ 103) | i48))))) - i28;
                    a = i49 % 128;
                    int i50 = i49 % i24;
                    i4 = size;
                    i9 = i37;
                    jMax = 0;
                } else {
                    if (i == 0) {
                        int i51 = b;
                        int i52 = i51 & 85;
                        i23 = (i52 - (~(-(-((i51 ^ 85) | i52))))) - i28;
                        a = i23 % 128;
                        if (i23 % i24 == 0) {
                            D d = o2.g;
                            obj.hashCode();
                            throw null;
                        }
                        y = o2.g;
                    } else {
                        y = o2.i;
                        int i53 = a;
                        int i54 = i53 | 59;
                        int i55 = i54 << 1;
                        int i56 = -((~(i53 & 59)) & i54);
                        int i57 = (i55 & i56) + (i55 | i56);
                        b = i57 % 128;
                        int i58 = i57 % i24;
                    }
                    s sVar2 = y.k;
                    if (i == 0) {
                        int i59 = b;
                        int i60 = (((i59 | 76) << i28) - (i59 ^ 76)) - 1;
                        a = i60 % 128;
                        int i61 = i60 % i24;
                        y2 = o2.g;
                        int i62 = b;
                        int i63 = (((i62 ^ 95) | (i62 & 95)) << 1) - ((i62 & (-96)) | (95 & (~i62)));
                        a = i63 % 128;
                        int i64 = i63 % i24;
                    } else {
                        y2 = o2.i;
                        int i65 = b;
                        int i66 = (i65 ^ 75) + ((i65 & 75) << i28);
                        a = i66 % 128;
                        int i67 = i66 % i24;
                    }
                    s sVar3 = y2.c;
                    s sVar4 = y6.k;
                    int i68 = a;
                    int i69 = i68 & 17;
                    int i70 = -(-((i68 ^ 17) | i69));
                    int i71 = ((i69 | i70) << i28) - (i70 ^ i69);
                    b = i71 % 128;
                    int i72 = i71 % 2;
                    zContains = sVar4.n.contains(sVar2);
                    zContains2 = nVar.d.c.n.contains(sVar3);
                    int i73 = b;
                    i2 = ((i73 & 49) - (~(-(-(i73 | 49))))) - i28;
                    a = i2 % 128;
                    if (i2 % i24 == 0) {
                        nVar.d.l();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    jL = nVar.d.l();
                    if (!zContains) {
                        i4 = size;
                        i9 = i37;
                        j11 = jMax3;
                        if (zContains) {
                            int i74 = a;
                            int i75 = i74 ^ 99;
                            int i76 = -(-((i74 & 99) << 1));
                            i20 = (i75 & i76) + (i76 | i75);
                            b = i20 % 128;
                            if (i20 % 2 != 0) {
                                sVar = nVar.d.k;
                                int i77 = 77 / 0;
                            } else {
                                sVar = nVar.d.k;
                            }
                            int i78 = b + 121;
                            a = i78 % 128;
                            int i79 = i78 % 2;
                            jD2 = nVar.d(sVar, sVar.h);
                            int i80 = a;
                            i21 = ((i80 & 84) + (i80 | 84)) - 1;
                            b = i21 % 128;
                            if (i21 % 2 != 0) {
                                int i81 = nVar.d.k.h;
                                throw null;
                            }
                            long j14 = nVar.d.k.h;
                            int i82 = b;
                            int i83 = (((i82 ^ 63) | (i82 & 63)) << 1) - (((~i82) & 63) | (i82 & (-64)));
                            a = i83 % 128;
                            int i84 = i83 % 2;
                            jMax = Math.max(jD2, j14 + jL);
                            i22 = a + 39;
                            b = i22 % 128;
                            if (i22 % 2 != 0) {
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            jMax3 = j11;
                            i28 = 1;
                        } else if (zContains2) {
                            int i85 = b;
                            int i86 = ((((i85 ^ 109) | (i85 & 109)) << 1) - (~(-(((~i85) & 109) | (i85 & (-110)))))) - 1;
                            a = i86 % 128;
                            int i87 = i86 % 2;
                            s sVar5 = nVar.d.c;
                            int i88 = b;
                            int i89 = ((i88 | 125) << 1) - (i88 ^ 125);
                            a = i89 % 128;
                            int i90 = i89 % 2;
                            long jC = nVar.c(sVar5, sVar5.h);
                            s sVar6 = nVar.d.c;
                            int i91 = a;
                            int i92 = i91 ^ 15;
                            int i93 = ((i91 & 15) | i92) << 1;
                            int i94 = -i92;
                            int i95 = (i93 & i94) + (i93 | i94);
                            b = i95 % 128;
                            int i96 = i95 % 2;
                            j12 = -jC;
                            j13 = ((long) (-sVar6.h)) + jL;
                            int i97 = b;
                            i19 = (i97 ^ 9) + ((i97 & 9) << 1);
                            a = i19 % 128;
                            if (i19 % 2 == 0) {
                                jMax2 = Math.max(j12, j13);
                                int i98 = 68 / 0;
                            } else {
                                jMax2 = Math.max(j12, j13);
                            }
                            jMax = jMax2;
                            int i99 = b + 91;
                            a = i99 % 128;
                            int i100 = i99 % 2;
                            jMax3 = j11;
                            i28 = 1;
                        } else {
                            y4 = nVar.d;
                            i17 = y4.k.h;
                            i18 = b + 51;
                            a = i18 % 128;
                            if (i18 % 2 == 0) {
                                jL2 = y4.l() - ((long) i17);
                                y5 = nVar.d;
                            } else {
                                jL2 = y4.l() + ((long) i17);
                                y5 = nVar.d;
                            }
                            jMax = jL2 - ((long) y5.c.h);
                            int i101 = b;
                            int i102 = i101 ^ 97;
                            i28 = 1;
                            int i103 = ((i101 & 97) | i102) << 1;
                            int i104 = -i102;
                            int i105 = (i103 ^ i104) + ((i103 & i104) << 1);
                            a = i105 % 128;
                            int i106 = i105 % 2;
                            jMax3 = j11;
                        }
                    } else {
                        int i107 = a;
                        int i108 = i107 & 73;
                        i3 = (i108 - (~((i107 ^ 73) | i108))) - i28;
                        b = i3 % 128;
                        if (i3 % i24 != 0) {
                            jD = nVar.d(nVar.d.k, 1L);
                            j = 0;
                        } else {
                            j = 0;
                            jD = nVar.d(nVar.d.k, 0L);
                        }
                        i4 = size;
                        long jC2 = nVar.c(nVar.d.c, j);
                        int i109 = a;
                        i5 = (i109 & 23) + (i109 | 23);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            j2 = jD ^ jL;
                        } else {
                            j2 = jD - jL;
                        }
                        Y y7 = nVar.d;
                        i6 = y7.c.h;
                        int i110 = a;
                        i7 = (i110 ^ 101) + ((i110 & 101) << 1);
                        i8 = i7 % 128;
                        b = i8;
                        if (i7 % 2 != 0) {
                            i9 = i37;
                            j3 = jMax3;
                            int i111 = 6 / 0;
                            if (j2 >= (-i6)) {
                                j2 += (long) i6;
                                int i112 = i8 & 71;
                                int i113 = -(-((i8 ^ 71) | i112));
                                int i114 = (i112 & i113) + (i113 | i112);
                                a = i114 % 128;
                                int i115 = i114 % 2;
                            }
                        } else {
                            i9 = i37;
                            j3 = jMax3;
                            if (j2 >= (-i6)) {
                                j2 += (long) i6;
                                int i116 = i8 & 71;
                                int i117 = -(-((i8 ^ 71) | i116));
                                int i118 = (i116 & i117) + (i117 | i116);
                                a = i118 % 128;
                                int i119 = i118 % 2;
                            }
                        }
                        int i120 = y7.k.h;
                        int i121 = a;
                        int i122 = i121 & 87;
                        int i123 = (i121 ^ 87) | i122;
                        int i124 = (i122 & i123) + (i123 | i122);
                        i10 = i124 % 128;
                        b = i10;
                        int i125 = i124 % 2;
                        j4 = i120;
                        j5 = ((-jC2) - jL) - j4;
                        i11 = ((i10 | 57) << 1) - ((i10 & (-58)) | ((~i10) & 57));
                        a = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i126 = 75 / 0;
                            if (j5 >= j4) {
                                int i127 = (-2) - ((i10 + 86) ^ (-1));
                                a = i127 % 128;
                                int i128 = i127 % 2;
                                j5 -= j4;
                                int i129 = (-2) - ((i10 + 126) ^ (-1));
                                a = i129 % 128;
                                int i130 = i129 % 2;
                            }
                        } else if (j5 >= j4) {
                            int i1210 = (-2) - ((i10 + 86) ^ (-1));
                            a = i1210 % 128;
                            int i1211 = i1210 % 2;
                            j5 -= j4;
                            int i1212 = (-2) - ((i10 + 126) ^ (-1));
                            a = i1212 % 128;
                            int i131 = i1212 % 2;
                        }
                        c0087m = y7.e;
                        Objects.requireNonNull(c0087m);
                        if (i == 0) {
                            int i132 = b;
                            int i133 = i132 & 39;
                            int i134 = (i133 - (~((i132 ^ 39) | i133))) - 1;
                            a = i134 % 128;
                            int i135 = i134 % 2;
                            f = c0087m.W;
                            int i136 = b;
                            i12 = (i136 & 125) + (i136 | 125);
                        } else {
                            if (i == 1) {
                                int i137 = b;
                                int i138 = (i137 ^ 29) + ((i137 & 29) << 1);
                                a = i138 % 128;
                                int i139 = i138 % 2;
                                f = c0087m.af;
                                int i140 = b;
                                int i141 = i140 & 25;
                                i12 = ((((i140 ^ 25) | i141) << 1) - (~(-((i140 | 25) & (~i141))))) - 1;
                            } else {
                                f = -1.0f;
                            }
                            if (f > 0.0f) {
                                int i142 = b;
                                int i143 = i142 + 97;
                                a = i143 % 128;
                                int i144 = i143 % 2;
                                float f2 = j2 / (1.0f - f);
                                int i145 = i142 + 117;
                                a = i145 % 128;
                                int i146 = i145 % 2;
                                j6 = (long) (f2 + (j5 / f));
                                int i147 = (-2) - ((i142 + 78) ^ (-1));
                                a = i147 % 128;
                                int i148 = i147 % 2;
                            } else {
                                int i149 = a + 11;
                                b = i149 % 128;
                                int i150 = i149 % 2;
                                j6 = 0;
                            }
                            float f3 = j6;
                            int i151 = a;
                            int i152 = i151 & 89;
                            int i153 = ((i151 ^ 89) | i152) << 1;
                            int i154 = -((i151 | 89) & (~i152));
                            int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                            b = i155 % 128;
                            int i156 = i155 % 2;
                            j7 = (long) ((f3 * f) + 0.5f);
                            fE = j.e(1.0f, f, f3, 0.5f);
                            int i157 = b;
                            int i158 = i157 & 27;
                            i13 = i158 + ((i157 ^ 27) | i158);
                            a = i13 % 128;
                            if (i13 % 2 != 0) {
                                Y y8 = nVar.d;
                                throw null;
                            }
                            j8 = (long) fE;
                            y3 = nVar.d;
                            int i159 = a;
                            int i160 = ((i159 | 30) << 1) - (i159 ^ 30);
                            int i161 = (i160 ^ (-1)) + (i160 << 1);
                            b = i161 % 128;
                            int i162 = i161 % 2;
                            j9 = y3.k.h;
                            int i163 = b;
                            int i164 = i163 & 109;
                            i14 = ((((i163 ^ 109) | i164) << 1) - (~(-((i163 | 109) & (~i164))))) - 1;
                            a = i14 % 128;
                            if (i14 % 2 == 0) {
                                j10 = j9 / ((j7 ^ jL) % j8);
                                i15 = y3.c.h;
                            } else {
                                j10 = j9 + j7 + jL + j8;
                                i15 = y3.c.h;
                            }
                            int i165 = a;
                            int i166 = i165 ^ 29;
                            int i167 = (((i165 & 29) | i166) << 1) - i166;
                            b = i167 % 128;
                            int i168 = i167 % 2;
                            long j15 = j10 - ((long) i15);
                            int i169 = i165 & 73;
                            int i170 = (i165 ^ 73) | i169;
                            i16 = (i169 & i170) + (i169 | i170);
                            b = i16 % 128;
                            if (i16 % 2 != 0) {
                                int i171 = 3 / 5;
                            }
                            jMax = j15;
                            jMax3 = j3;
                            i28 = 1;
                        }
                        a = i12 % 128;
                        int i172 = i12 % 2;
                        if (f > 0.0f) {
                            int i1410 = b;
                            int i1411 = i1410 + 97;
                            a = i1411 % 128;
                            int i1412 = i1411 % 2;
                            float f4 = j2 / (1.0f - f);
                            int i1413 = i1410 + 117;
                            a = i1413 % 128;
                            int i1414 = i1413 % 2;
                            j6 = (long) (f4 + (j5 / f));
                            int i1415 = (-2) - ((i1410 + 78) ^ (-1));
                            a = i1415 % 128;
                            int i1416 = i1415 % 2;
                        } else {
                            int i1417 = a + 11;
                            b = i1417 % 128;
                            int i1510 = i1417 % 2;
                            j6 = 0;
                        }
                        float f5 = j6;
                        int i1511 = a;
                        int i1512 = i1511 & 89;
                        int i1513 = ((i1511 ^ 89) | i1512) << 1;
                        int i1514 = -((i1511 | 89) & (~i1512));
                        int i1515 = (i1513 ^ i1514) + ((i1514 & i1513) << 1);
                        b = i1515 % 128;
                        int i1516 = i1515 % 2;
                        j7 = (long) ((f5 * f) + 0.5f);
                        fE = j.e(1.0f, f, f5, 0.5f);
                        int i1517 = b;
                        int i1518 = i1517 & 27;
                        i13 = i1518 + ((i1517 ^ 27) | i1518);
                        a = i13 % 128;
                        if (i13 % 2 != 0) {
                            Y y9 = nVar.d;
                            throw null;
                        }
                        j8 = (long) fE;
                        y3 = nVar.d;
                        int i1519 = a;
                        int i1610 = ((i1519 | 30) << 1) - (i1519 ^ 30);
                        int i1611 = (i1610 ^ (-1)) + (i1610 << 1);
                        b = i1611 % 128;
                        int i1612 = i1611 % 2;
                        j9 = y3.k.h;
                        int i1613 = b;
                        int i1614 = i1613 & 109;
                        i14 = ((((i1613 ^ 109) | i1614) << 1) - (~(-((i1613 | 109) & (~i1614))))) - 1;
                        a = i14 % 128;
                        if (i14 % 2 == 0) {
                            j10 = j9 / ((j7 ^ jL) % j8);
                            i15 = y3.c.h;
                        } else {
                            j10 = j9 + j7 + jL + j8;
                            i15 = y3.c.h;
                        }
                        int i1615 = a;
                        int i1616 = i1615 ^ 29;
                        int i1617 = (((i1615 & 29) | i1616) << 1) - i1616;
                        b = i1617 % 128;
                        int i1618 = i1617 % 2;
                        long j16 = j10 - ((long) i15);
                        int i1619 = i1615 & 73;
                        int i173 = (i1615 ^ 73) | i1619;
                        i16 = (i1619 & i173) + (i1619 | i173);
                        b = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i174 = 3 / 5;
                        }
                        jMax = j16;
                        jMax3 = j3;
                        i28 = 1;
                    }
                }
            } else if (i == 0) {
                int i175 = a;
                int i176 = i175 & 33;
                int i177 = (i175 ^ 33) | i176;
                int i178 = (i176 & i177) + (i176 | i177);
                int i179 = i178 % 128;
                b = i179;
                int i180 = i178 % i24;
                if (y6 instanceof D) {
                    if (i == 0) {
                        int i510 = b;
                        int i511 = i510 & 85;
                        i23 = (i511 - (~(-(-((i510 ^ 85) | i511))))) - i28;
                        a = i23 % 128;
                        if (i23 % i24 == 0) {
                            D d2 = o2.g;
                            obj.hashCode();
                            throw null;
                        }
                        y = o2.g;
                    } else {
                        y = o2.i;
                        int i512 = a;
                        int i513 = i512 | 59;
                        int i514 = i513 << 1;
                        int i515 = -((~(i512 & 59)) & i513);
                        int i516 = (i514 & i515) + (i514 | i515);
                        b = i516 % 128;
                        int i517 = i516 % i24;
                    }
                    s sVar7 = y.k;
                    if (i == 0) {
                        int i518 = b;
                        int i610 = (((i518 | 76) << i28) - (i518 ^ 76)) - 1;
                        a = i610 % 128;
                        int i611 = i610 % i24;
                        y2 = o2.g;
                        int i612 = b;
                        int i613 = (((i612 ^ 95) | (i612 & 95)) << 1) - ((i612 & (-96)) | (95 & (~i612)));
                        a = i613 % 128;
                        int i614 = i613 % i24;
                    } else {
                        y2 = o2.i;
                        int i615 = b;
                        int i616 = (i615 ^ 75) + ((i615 & 75) << i28);
                        a = i616 % 128;
                        int i617 = i616 % i24;
                    }
                    s sVar8 = y2.c;
                    s sVar9 = y6.k;
                    int i618 = a;
                    int i619 = i618 & 17;
                    int i710 = -(-((i618 ^ 17) | i619));
                    int i711 = ((i619 | i710) << i28) - (i710 ^ i619);
                    b = i711 % 128;
                    int i712 = i711 % 2;
                    zContains = sVar9.n.contains(sVar7);
                    zContains2 = nVar.d.c.n.contains(sVar8);
                    int i713 = b;
                    i2 = ((i713 & 49) - (~(-(-(i713 | 49))))) - i28;
                    a = i2 % 128;
                    if (i2 % i24 == 0) {
                        nVar.d.l();
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    jL = nVar.d.l();
                    if ((!zContains) && zContains2) {
                        int i1010 = a;
                        int i1011 = i1010 & 73;
                        i3 = (i1011 - (~((i1010 ^ 73) | i1011))) - i28;
                        b = i3 % 128;
                        if (i3 % i24 != 0) {
                            jD = nVar.d(nVar.d.k, 1L);
                            j = 0;
                        } else {
                            j = 0;
                            jD = nVar.d(nVar.d.k, 0L);
                        }
                        i4 = size;
                        long jC3 = nVar.c(nVar.d.c, j);
                        int i1012 = a;
                        i5 = (i1012 & 23) + (i1012 | 23);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            j2 = jD ^ jL;
                        } else {
                            j2 = jD - jL;
                        }
                        Y y10 = nVar.d;
                        i6 = y10.c.h;
                        int i1110 = a;
                        i7 = (i1110 ^ 101) + ((i1110 & 101) << 1);
                        i8 = i7 % 128;
                        b = i8;
                        if (i7 % 2 != 0) {
                            i9 = i37;
                            j3 = jMax3;
                            int i1111 = 6 / 0;
                            if (j2 >= (-i6)) {
                                j2 += (long) i6;
                                int i1112 = i8 & 71;
                                int i1113 = -(-((i8 ^ 71) | i1112));
                                int i1114 = (i1112 & i1113) + (i1113 | i1112);
                                a = i1114 % 128;
                                int i1115 = i1114 % 2;
                            }
                        } else {
                            i9 = i37;
                            j3 = jMax3;
                            if (j2 >= (-i6)) {
                                j2 += (long) i6;
                                int i1116 = i8 & 71;
                                int i1117 = -(-((i8 ^ 71) | i1116));
                                int i1118 = (i1116 & i1117) + (i1117 | i1116);
                                a = i1118 % 128;
                                int i1119 = i1118 % 2;
                            }
                        }
                        int i1213 = y10.k.h;
                        int i1214 = a;
                        int i1215 = i1214 & 87;
                        int i1216 = (i1214 ^ 87) | i1215;
                        int i1217 = (i1215 & i1216) + (i1216 | i1215);
                        i10 = i1217 % 128;
                        b = i10;
                        int i1218 = i1217 % 2;
                        j4 = i1213;
                        j5 = ((-jC3) - jL) - j4;
                        i11 = ((i10 | 57) << 1) - ((i10 & (-58)) | ((~i10) & 57));
                        a = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i1219 = 75 / 0;
                            if (j5 >= j4) {
                                int i12110 = (-2) - ((i10 + 86) ^ (-1));
                                a = i12110 % 128;
                                int i12111 = i12110 % 2;
                                j5 -= j4;
                                int i12112 = (-2) - ((i10 + 126) ^ (-1));
                                a = i12112 % 128;
                                int i1310 = i12112 % 2;
                            }
                        } else if (j5 >= j4) {
                            int i12113 = (-2) - ((i10 + 86) ^ (-1));
                            a = i12113 % 128;
                            int i12114 = i12113 % 2;
                            j5 -= j4;
                            int i12115 = (-2) - ((i10 + 126) ^ (-1));
                            a = i12115 % 128;
                            int i1311 = i12115 % 2;
                        }
                        c0087m = y10.e;
                        Objects.requireNonNull(c0087m);
                        if (i == 0) {
                            int i1312 = b;
                            int i1313 = i1312 & 39;
                            int i1314 = (i1313 - (~((i1312 ^ 39) | i1313))) - 1;
                            a = i1314 % 128;
                            int i1315 = i1314 % 2;
                            f = c0087m.W;
                            int i1316 = b;
                            i12 = (i1316 & 125) + (i1316 | 125);
                        } else {
                            if (i == 1) {
                                int i1317 = b;
                                int i1318 = (i1317 ^ 29) + ((i1317 & 29) << 1);
                                a = i1318 % 128;
                                int i1319 = i1318 % 2;
                                f = c0087m.af;
                                int i1418 = b;
                                int i1419 = i1418 & 25;
                                i12 = ((((i1418 ^ 25) | i1419) << 1) - (~(-((i1418 | 25) & (~i1419))))) - 1;
                            } else {
                                f = -1.0f;
                            }
                            if (f > 0.0f) {
                                int i14110 = b;
                                int i14111 = i14110 + 97;
                                a = i14111 % 128;
                                int i14112 = i14111 % 2;
                                float f6 = j2 / (1.0f - f);
                                int i14113 = i14110 + 117;
                                a = i14113 % 128;
                                int i14114 = i14113 % 2;
                                j6 = (long) (f6 + (j5 / f));
                                int i14115 = (-2) - ((i14110 + 78) ^ (-1));
                                a = i14115 % 128;
                                int i14116 = i14115 % 2;
                            } else {
                                int i14117 = a + 11;
                                b = i14117 % 128;
                                int i15110 = i14117 % 2;
                                j6 = 0;
                            }
                            float f7 = j6;
                            int i15111 = a;
                            int i15112 = i15111 & 89;
                            int i15113 = ((i15111 ^ 89) | i15112) << 1;
                            int i15114 = -((i15111 | 89) & (~i15112));
                            int i15115 = (i15113 ^ i15114) + ((i15114 & i15113) << 1);
                            b = i15115 % 128;
                            int i15116 = i15115 % 2;
                            j7 = (long) ((f7 * f) + 0.5f);
                            fE = j.e(1.0f, f, f7, 0.5f);
                            int i15117 = b;
                            int i15118 = i15117 & 27;
                            i13 = i15118 + ((i15117 ^ 27) | i15118);
                            a = i13 % 128;
                            if (i13 % 2 != 0) {
                                Y y11 = nVar.d;
                                throw null;
                            }
                            j8 = (long) fE;
                            y3 = nVar.d;
                            int i15119 = a;
                            int i16110 = ((i15119 | 30) << 1) - (i15119 ^ 30);
                            int i16111 = (i16110 ^ (-1)) + (i16110 << 1);
                            b = i16111 % 128;
                            int i16112 = i16111 % 2;
                            j9 = y3.k.h;
                            int i16113 = b;
                            int i16114 = i16113 & 109;
                            i14 = ((((i16113 ^ 109) | i16114) << 1) - (~(-((i16113 | 109) & (~i16114))))) - 1;
                            a = i14 % 128;
                            if (i14 % 2 == 0) {
                                j10 = j9 / ((j7 ^ jL) % j8);
                                i15 = y3.c.h;
                            } else {
                                j10 = j9 + j7 + jL + j8;
                                i15 = y3.c.h;
                            }
                            int i16115 = a;
                            int i16116 = i16115 ^ 29;
                            int i16117 = (((i16115 & 29) | i16116) << 1) - i16116;
                            b = i16117 % 128;
                            int i16118 = i16117 % 2;
                            long j17 = j10 - ((long) i15);
                            int i16119 = i16115 & 73;
                            int i1710 = (i16115 ^ 73) | i16119;
                            i16 = (i16119 & i1710) + (i16119 | i1710);
                            b = i16 % 128;
                            if (i16 % 2 != 0) {
                                int i1711 = 3 / 5;
                            }
                            jMax = j17;
                            jMax3 = j3;
                        }
                        a = i12 % 128;
                        int i1712 = i12 % 2;
                        if (f > 0.0f) {
                            int i14118 = b;
                            int i14119 = i14118 + 97;
                            a = i14119 % 128;
                            int i141110 = i14119 % 2;
                            float f8 = j2 / (1.0f - f);
                            int i141111 = i14118 + 117;
                            a = i141111 % 128;
                            int i141112 = i141111 % 2;
                            j6 = (long) (f8 + (j5 / f));
                            int i141113 = (-2) - ((i14118 + 78) ^ (-1));
                            a = i141113 % 128;
                            int i141114 = i141113 % 2;
                        } else {
                            int i141115 = a + 11;
                            b = i141115 % 128;
                            int i151110 = i141115 % 2;
                            j6 = 0;
                        }
                        float f9 = j6;
                        int i151111 = a;
                        int i151112 = i151111 & 89;
                        int i151113 = ((i151111 ^ 89) | i151112) << 1;
                        int i151114 = -((i151111 | 89) & (~i151112));
                        int i151115 = (i151113 ^ i151114) + ((i151114 & i151113) << 1);
                        b = i151115 % 128;
                        int i151116 = i151115 % 2;
                        j7 = (long) ((f9 * f) + 0.5f);
                        fE = j.e(1.0f, f, f9, 0.5f);
                        int i151117 = b;
                        int i151118 = i151117 & 27;
                        i13 = i151118 + ((i151117 ^ 27) | i151118);
                        a = i13 % 128;
                        if (i13 % 2 != 0) {
                            Y y12 = nVar.d;
                            throw null;
                        }
                        j8 = (long) fE;
                        y3 = nVar.d;
                        int i151119 = a;
                        int i161110 = ((i151119 | 30) << 1) - (i151119 ^ 30);
                        int i161111 = (i161110 ^ (-1)) + (i161110 << 1);
                        b = i161111 % 128;
                        int i161112 = i161111 % 2;
                        j9 = y3.k.h;
                        int i161113 = b;
                        int i161114 = i161113 & 109;
                        i14 = ((((i161113 ^ 109) | i161114) << 1) - (~(-((i161113 | 109) & (~i161114))))) - 1;
                        a = i14 % 128;
                        if (i14 % 2 == 0) {
                            j10 = j9 / ((j7 ^ jL) % j8);
                            i15 = y3.c.h;
                        } else {
                            j10 = j9 + j7 + jL + j8;
                            i15 = y3.c.h;
                        }
                        int i161115 = a;
                        int i161116 = i161115 ^ 29;
                        int i161117 = (((i161115 & 29) | i161116) << 1) - i161116;
                        b = i161117 % 128;
                        int i161118 = i161117 % 2;
                        long j18 = j10 - ((long) i15);
                        int i161119 = i161115 & 73;
                        int i1713 = (i161115 ^ 73) | i161119;
                        i16 = (i161119 & i1713) + (i161119 | i1713);
                        b = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i1714 = 3 / 5;
                        }
                        jMax = j18;
                        jMax3 = j3;
                    } else {
                        i4 = size;
                        i9 = i37;
                        j11 = jMax3;
                        if (zContains) {
                            int i714 = a;
                            int i715 = i714 ^ 99;
                            int i716 = -(-((i714 & 99) << 1));
                            i20 = (i715 & i716) + (i716 | i715);
                            b = i20 % 128;
                            if (i20 % 2 != 0) {
                                sVar = nVar.d.k;
                                int i717 = 77 / 0;
                            } else {
                                sVar = nVar.d.k;
                            }
                            int i718 = b + 121;
                            a = i718 % 128;
                            int i719 = i718 % 2;
                            jD2 = nVar.d(sVar, sVar.h);
                            int i810 = a;
                            i21 = ((i810 & 84) + (i810 | 84)) - 1;
                            b = i21 % 128;
                            if (i21 % 2 != 0) {
                                int i811 = nVar.d.k.h;
                                throw null;
                            }
                            long j19 = nVar.d.k.h;
                            int i812 = b;
                            int i813 = (((i812 ^ 63) | (i812 & 63)) << 1) - (((~i812) & 63) | (i812 & (-64)));
                            a = i813 % 128;
                            int i814 = i813 % 2;
                            jMax = Math.max(jD2, j19 + jL);
                            i22 = a + 39;
                            b = i22 % 128;
                            if (i22 % 2 != 0) {
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            jMax3 = j11;
                        } else if (zContains2) {
                            int i815 = b;
                            int i816 = ((((i815 ^ 109) | (i815 & 109)) << 1) - (~(-(((~i815) & 109) | (i815 & (-110)))))) - 1;
                            a = i816 % 128;
                            int i817 = i816 % 2;
                            s sVar10 = nVar.d.c;
                            int i818 = b;
                            int i819 = ((i818 | 125) << 1) - (i818 ^ 125);
                            a = i819 % 128;
                            int i910 = i819 % 2;
                            long jC4 = nVar.c(sVar10, sVar10.h);
                            s sVar11 = nVar.d.c;
                            int i911 = a;
                            int i912 = i911 ^ 15;
                            int i913 = ((i911 & 15) | i912) << 1;
                            int i914 = -i912;
                            int i915 = (i913 & i914) + (i913 | i914);
                            b = i915 % 128;
                            int i916 = i915 % 2;
                            j12 = -jC4;
                            j13 = ((long) (-sVar11.h)) + jL;
                            int i917 = b;
                            i19 = (i917 ^ 9) + ((i917 & 9) << 1);
                            a = i19 % 128;
                            if (i19 % 2 == 0) {
                                jMax2 = Math.max(j12, j13);
                                int i918 = 68 / 0;
                            } else {
                                jMax2 = Math.max(j12, j13);
                            }
                            jMax = jMax2;
                            int i919 = b + 91;
                            a = i919 % 128;
                            int i1013 = i919 % 2;
                            jMax3 = j11;
                            i28 = 1;
                        } else {
                            y4 = nVar.d;
                            i17 = y4.k.h;
                            i18 = b + 51;
                            a = i18 % 128;
                            if (i18 % 2 == 0) {
                                jL2 = y4.l() - ((long) i17);
                                y5 = nVar.d;
                            } else {
                                jL2 = y4.l() + ((long) i17);
                                y5 = nVar.d;
                            }
                            jMax = jL2 - ((long) y5.c.h);
                            int i1014 = b;
                            int i1015 = i1014 ^ 97;
                            i28 = 1;
                            int i1016 = ((i1014 & 97) | i1015) << 1;
                            int i1017 = -i1015;
                            int i1018 = (i1016 ^ i1017) + ((i1016 & i1017) << 1);
                            a = i1018 % 128;
                            int i1019 = i1018 % 2;
                            jMax3 = j11;
                        }
                    }
                    i28 = 1;
                } else {
                    int i181 = i179 & 15;
                    int i182 = -(-((i179 ^ 15) | i181));
                    int i183 = ((i181 | i182) << i28) - (i182 ^ i181);
                    a = i183 % 128;
                    int i184 = i183 % i24;
                    i4 = size;
                    i9 = i37;
                    jMax = 0;
                }
            } else if ((y6 instanceof X) != i28) {
                i4 = size;
                i9 = i37;
                jMax = 0;
            } else {
                if (i == 0) {
                    int i519 = b;
                    int i5110 = i519 & 85;
                    i23 = (i5110 - (~(-(-((i519 ^ 85) | i5110))))) - i28;
                    a = i23 % 128;
                    if (i23 % i24 == 0) {
                        D d3 = o2.g;
                        obj.hashCode();
                        throw null;
                    }
                    y = o2.g;
                } else {
                    y = o2.i;
                    int i5111 = a;
                    int i5112 = i5111 | 59;
                    int i5113 = i5112 << 1;
                    int i5114 = -((~(i5111 & 59)) & i5112);
                    int i5115 = (i5113 & i5114) + (i5113 | i5114);
                    b = i5115 % 128;
                    int i5116 = i5115 % i24;
                }
                s sVar12 = y.k;
                if (i == 0) {
                    int i5117 = b;
                    int i6110 = (((i5117 | 76) << i28) - (i5117 ^ 76)) - 1;
                    a = i6110 % 128;
                    int i6111 = i6110 % i24;
                    y2 = o2.g;
                    int i6112 = b;
                    int i6113 = (((i6112 ^ 95) | (i6112 & 95)) << 1) - ((i6112 & (-96)) | (95 & (~i6112)));
                    a = i6113 % 128;
                    int i6114 = i6113 % i24;
                } else {
                    y2 = o2.i;
                    int i6115 = b;
                    int i6116 = (i6115 ^ 75) + ((i6115 & 75) << i28);
                    a = i6116 % 128;
                    int i6117 = i6116 % i24;
                }
                s sVar13 = y2.c;
                s sVar14 = y6.k;
                int i6118 = a;
                int i6119 = i6118 & 17;
                int i7110 = -(-((i6118 ^ 17) | i6119));
                int i7111 = ((i6119 | i7110) << i28) - (i7110 ^ i6119);
                b = i7111 % 128;
                int i7112 = i7111 % 2;
                zContains = sVar14.n.contains(sVar12);
                zContains2 = nVar.d.c.n.contains(sVar13);
                int i7113 = b;
                i2 = ((i7113 & 49) - (~(-(-(i7113 | 49))))) - i28;
                a = i2 % 128;
                if (i2 % i24 == 0) {
                    nVar.d.l();
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
                jL = nVar.d.l();
                if (!zContains) {
                    i4 = size;
                    i9 = i37;
                    j11 = jMax3;
                    if (zContains) {
                        int i7114 = a;
                        int i7115 = i7114 ^ 99;
                        int i7116 = -(-((i7114 & 99) << 1));
                        i20 = (i7115 & i7116) + (i7116 | i7115);
                        b = i20 % 128;
                        if (i20 % 2 != 0) {
                            sVar = nVar.d.k;
                            int i7117 = 77 / 0;
                        } else {
                            sVar = nVar.d.k;
                        }
                        int i7118 = b + 121;
                        a = i7118 % 128;
                        int i7119 = i7118 % 2;
                        jD2 = nVar.d(sVar, sVar.h);
                        int i8110 = a;
                        i21 = ((i8110 & 84) + (i8110 | 84)) - 1;
                        b = i21 % 128;
                        if (i21 % 2 != 0) {
                            int i8111 = nVar.d.k.h;
                            throw null;
                        }
                        long j110 = nVar.d.k.h;
                        int i8112 = b;
                        int i8113 = (((i8112 ^ 63) | (i8112 & 63)) << 1) - (((~i8112) & 63) | (i8112 & (-64)));
                        a = i8113 % 128;
                        int i8114 = i8113 % 2;
                        jMax = Math.max(jD2, j110 + jL);
                        i22 = a + 39;
                        b = i22 % 128;
                        if (i22 % 2 != 0) {
                            Object obj7 = null;
                            obj7.hashCode();
                            throw null;
                        }
                        jMax3 = j11;
                        i28 = 1;
                    } else if (zContains2) {
                        int i8115 = b;
                        int i8116 = ((((i8115 ^ 109) | (i8115 & 109)) << 1) - (~(-(((~i8115) & 109) | (i8115 & (-110)))))) - 1;
                        a = i8116 % 128;
                        int i8117 = i8116 % 2;
                        s sVar15 = nVar.d.c;
                        int i8118 = b;
                        int i8119 = ((i8118 | 125) << 1) - (i8118 ^ 125);
                        a = i8119 % 128;
                        int i9110 = i8119 % 2;
                        long jC5 = nVar.c(sVar15, sVar15.h);
                        s sVar16 = nVar.d.c;
                        int i9111 = a;
                        int i9112 = i9111 ^ 15;
                        int i9113 = ((i9111 & 15) | i9112) << 1;
                        int i9114 = -i9112;
                        int i9115 = (i9113 & i9114) + (i9113 | i9114);
                        b = i9115 % 128;
                        int i9116 = i9115 % 2;
                        j12 = -jC5;
                        j13 = ((long) (-sVar16.h)) + jL;
                        int i9117 = b;
                        i19 = (i9117 ^ 9) + ((i9117 & 9) << 1);
                        a = i19 % 128;
                        if (i19 % 2 == 0) {
                            jMax2 = Math.max(j12, j13);
                            int i9118 = 68 / 0;
                        } else {
                            jMax2 = Math.max(j12, j13);
                        }
                        jMax = jMax2;
                        int i9119 = b + 91;
                        a = i9119 % 128;
                        int i10110 = i9119 % 2;
                        jMax3 = j11;
                        i28 = 1;
                    } else {
                        y4 = nVar.d;
                        i17 = y4.k.h;
                        i18 = b + 51;
                        a = i18 % 128;
                        if (i18 % 2 == 0) {
                            jL2 = y4.l() - ((long) i17);
                            y5 = nVar.d;
                        } else {
                            jL2 = y4.l() + ((long) i17);
                            y5 = nVar.d;
                        }
                        jMax = jL2 - ((long) y5.c.h);
                        int i10111 = b;
                        int i10112 = i10111 ^ 97;
                        i28 = 1;
                        int i10113 = ((i10111 & 97) | i10112) << 1;
                        int i10114 = -i10112;
                        int i10115 = (i10113 ^ i10114) + ((i10113 & i10114) << 1);
                        a = i10115 % 128;
                        int i10116 = i10115 % 2;
                        jMax3 = j11;
                    }
                } else {
                    int i10117 = a;
                    int i10118 = i10117 & 73;
                    i3 = (i10118 - (~((i10117 ^ 73) | i10118))) - i28;
                    b = i3 % 128;
                    if (i3 % i24 != 0) {
                        jD = nVar.d(nVar.d.k, 1L);
                        j = 0;
                    } else {
                        j = 0;
                        jD = nVar.d(nVar.d.k, 0L);
                    }
                    i4 = size;
                    long jC6 = nVar.c(nVar.d.c, j);
                    int i10119 = a;
                    i5 = (i10119 & 23) + (i10119 | 23);
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        j2 = jD ^ jL;
                    } else {
                        j2 = jD - jL;
                    }
                    Y y13 = nVar.d;
                    i6 = y13.c.h;
                    int i11110 = a;
                    i7 = (i11110 ^ 101) + ((i11110 & 101) << 1);
                    i8 = i7 % 128;
                    b = i8;
                    if (i7 % 2 != 0) {
                        i9 = i37;
                        j3 = jMax3;
                        int i11111 = 6 / 0;
                        if (j2 >= (-i6)) {
                            j2 += (long) i6;
                            int i11112 = i8 & 71;
                            int i11113 = -(-((i8 ^ 71) | i11112));
                            int i11114 = (i11112 & i11113) + (i11113 | i11112);
                            a = i11114 % 128;
                            int i11115 = i11114 % 2;
                        }
                    } else {
                        i9 = i37;
                        j3 = jMax3;
                        if (j2 >= (-i6)) {
                            j2 += (long) i6;
                            int i11116 = i8 & 71;
                            int i11117 = -(-((i8 ^ 71) | i11116));
                            int i11118 = (i11116 & i11117) + (i11117 | i11116);
                            a = i11118 % 128;
                            int i11119 = i11118 % 2;
                        }
                    }
                    int i12116 = y13.k.h;
                    int i12117 = a;
                    int i12118 = i12117 & 87;
                    int i12119 = (i12117 ^ 87) | i12118;
                    int i12120 = (i12118 & i12119) + (i12119 | i12118);
                    i10 = i12120 % 128;
                    b = i10;
                    int i12121 = i12120 % 2;
                    j4 = i12116;
                    j5 = ((-jC6) - jL) - j4;
                    i11 = ((i10 | 57) << 1) - ((i10 & (-58)) | ((~i10) & 57));
                    a = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12122 = 75 / 0;
                        if (j5 >= j4) {
                            int i121110 = (-2) - ((i10 + 86) ^ (-1));
                            a = i121110 % 128;
                            int i121111 = i121110 % 2;
                            j5 -= j4;
                            int i121112 = (-2) - ((i10 + 126) ^ (-1));
                            a = i121112 % 128;
                            int i13110 = i121112 % 2;
                        }
                    } else if (j5 >= j4) {
                        int i121113 = (-2) - ((i10 + 86) ^ (-1));
                        a = i121113 % 128;
                        int i121114 = i121113 % 2;
                        j5 -= j4;
                        int i121115 = (-2) - ((i10 + 126) ^ (-1));
                        a = i121115 % 128;
                        int i13111 = i121115 % 2;
                    }
                    c0087m = y13.e;
                    Objects.requireNonNull(c0087m);
                    if (i == 0) {
                        int i13112 = b;
                        int i13113 = i13112 & 39;
                        int i13114 = (i13113 - (~((i13112 ^ 39) | i13113))) - 1;
                        a = i13114 % 128;
                        int i13115 = i13114 % 2;
                        f = c0087m.W;
                        int i13116 = b;
                        i12 = (i13116 & 125) + (i13116 | 125);
                    } else {
                        if (i == 1) {
                            int i13117 = b;
                            int i13118 = (i13117 ^ 29) + ((i13117 & 29) << 1);
                            a = i13118 % 128;
                            int i13119 = i13118 % 2;
                            f = c0087m.af;
                            int i14120 = b;
                            int i14121 = i14120 & 25;
                            i12 = ((((i14120 ^ 25) | i14121) << 1) - (~(-((i14120 | 25) & (~i14121))))) - 1;
                        } else {
                            f = -1.0f;
                        }
                        if (f > 0.0f) {
                            int i141116 = b;
                            int i141117 = i141116 + 97;
                            a = i141117 % 128;
                            int i141118 = i141117 % 2;
                            float f10 = j2 / (1.0f - f);
                            int i141119 = i141116 + 117;
                            a = i141119 % 128;
                            int i1411110 = i141119 % 2;
                            j6 = (long) (f10 + (j5 / f));
                            int i1411111 = (-2) - ((i141116 + 78) ^ (-1));
                            a = i1411111 % 128;
                            int i1411112 = i1411111 % 2;
                        } else {
                            int i1411113 = a + 11;
                            b = i1411113 % 128;
                            int i1511110 = i1411113 % 2;
                            j6 = 0;
                        }
                        float f11 = j6;
                        int i1511111 = a;
                        int i1511112 = i1511111 & 89;
                        int i1511113 = ((i1511111 ^ 89) | i1511112) << 1;
                        int i1511114 = -((i1511111 | 89) & (~i1511112));
                        int i1511115 = (i1511113 ^ i1511114) + ((i1511114 & i1511113) << 1);
                        b = i1511115 % 128;
                        int i1511116 = i1511115 % 2;
                        j7 = (long) ((f11 * f) + 0.5f);
                        fE = j.e(1.0f, f, f11, 0.5f);
                        int i1511117 = b;
                        int i1511118 = i1511117 & 27;
                        i13 = i1511118 + ((i1511117 ^ 27) | i1511118);
                        a = i13 % 128;
                        if (i13 % 2 != 0) {
                            Y y14 = nVar.d;
                            throw null;
                        }
                        j8 = (long) fE;
                        y3 = nVar.d;
                        int i1511119 = a;
                        int i1611110 = ((i1511119 | 30) << 1) - (i1511119 ^ 30);
                        int i1611111 = (i1611110 ^ (-1)) + (i1611110 << 1);
                        b = i1611111 % 128;
                        int i1611112 = i1611111 % 2;
                        j9 = y3.k.h;
                        int i1611113 = b;
                        int i1611114 = i1611113 & 109;
                        i14 = ((((i1611113 ^ 109) | i1611114) << 1) - (~(-((i1611113 | 109) & (~i1611114))))) - 1;
                        a = i14 % 128;
                        if (i14 % 2 == 0) {
                            j10 = j9 / ((j7 ^ jL) % j8);
                            i15 = y3.c.h;
                        } else {
                            j10 = j9 + j7 + jL + j8;
                            i15 = y3.c.h;
                        }
                        int i1611115 = a;
                        int i1611116 = i1611115 ^ 29;
                        int i1611117 = (((i1611115 & 29) | i1611116) << 1) - i1611116;
                        b = i1611117 % 128;
                        int i1611118 = i1611117 % 2;
                        long j111 = j10 - ((long) i15);
                        int i1611119 = i1611115 & 73;
                        int i1715 = (i1611115 ^ 73) | i1611119;
                        i16 = (i1611119 & i1715) + (i1611119 | i1715);
                        b = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i1716 = 3 / 5;
                        }
                        jMax = j111;
                        jMax3 = j3;
                        i28 = 1;
                    }
                    a = i12 % 128;
                    int i1717 = i12 % 2;
                    if (f > 0.0f) {
                        int i1411114 = b;
                        int i1411115 = i1411114 + 97;
                        a = i1411115 % 128;
                        int i1411116 = i1411115 % 2;
                        float f12 = j2 / (1.0f - f);
                        int i1411117 = i1411114 + 117;
                        a = i1411117 % 128;
                        int i1411118 = i1411117 % 2;
                        j6 = (long) (f12 + (j5 / f));
                        int i1411119 = (-2) - ((i1411114 + 78) ^ (-1));
                        a = i1411119 % 128;
                        int i14111110 = i1411119 % 2;
                    } else {
                        int i14111111 = a + 11;
                        b = i14111111 % 128;
                        int i15111110 = i14111111 % 2;
                        j6 = 0;
                    }
                    float f13 = j6;
                    int i15111111 = a;
                    int i15111112 = i15111111 & 89;
                    int i15111113 = ((i15111111 ^ 89) | i15111112) << 1;
                    int i15111114 = -((i15111111 | 89) & (~i15111112));
                    int i15111115 = (i15111113 ^ i15111114) + ((i15111114 & i15111113) << 1);
                    b = i15111115 % 128;
                    int i15111116 = i15111115 % 2;
                    j7 = (long) ((f13 * f) + 0.5f);
                    fE = j.e(1.0f, f, f13, 0.5f);
                    int i15111117 = b;
                    int i15111118 = i15111117 & 27;
                    i13 = i15111118 + ((i15111117 ^ 27) | i15111118);
                    a = i13 % 128;
                    if (i13 % 2 != 0) {
                        Y y15 = nVar.d;
                        throw null;
                    }
                    j8 = (long) fE;
                    y3 = nVar.d;
                    int i15111119 = a;
                    int i16111110 = ((i15111119 | 30) << 1) - (i15111119 ^ 30);
                    int i16111111 = (i16111110 ^ (-1)) + (i16111110 << 1);
                    b = i16111111 % 128;
                    int i16111112 = i16111111 % 2;
                    j9 = y3.k.h;
                    int i16111113 = b;
                    int i16111114 = i16111113 & 109;
                    i14 = ((((i16111113 ^ 109) | i16111114) << 1) - (~(-((i16111113 | 109) & (~i16111114))))) - 1;
                    a = i14 % 128;
                    if (i14 % 2 == 0) {
                        j10 = j9 / ((j7 ^ jL) % j8);
                        i15 = y3.c.h;
                    } else {
                        j10 = j9 + j7 + jL + j8;
                        i15 = y3.c.h;
                    }
                    int i16111115 = a;
                    int i16111116 = i16111115 ^ 29;
                    int i16111117 = (((i16111115 & 29) | i16111116) << 1) - i16111116;
                    b = i16111117 % 128;
                    int i16111118 = i16111117 % 2;
                    long j112 = j10 - ((long) i15);
                    int i16111119 = i16111115 & 73;
                    int i1718 = (i16111115 ^ 73) | i16111119;
                    i16 = (i16111119 & i1718) + (i16111119 | i1718);
                    b = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i1719 = 3 / 5;
                    }
                    jMax = j112;
                    jMax3 = j3;
                    i28 = 1;
                }
            }
            jMax3 = Math.max(jMax3, jMax);
            int i185 = (((i9 | (-98)) << i28) - (i9 ^ (-98))) + 99;
            int i186 = a;
            int i187 = i186 & 21;
            int i188 = -(-(i186 | 21));
            int i189 = (i187 & i188) + (i188 | i187);
            b = i189 % 128;
            int i190 = i189 % 2;
            i37 = i185;
            size = i4;
            i24 = 2;
            i28 = 1;
        }
        int i191 = (int) jMax3;
        int i192 = b;
        int i193 = ((i192 | 97) << 1) - (i192 ^ 97);
        a = i193 % 128;
        int i194 = i193 % 2;
        return i191;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0042 A[PHI: r1
  0x0042: PHI (r1v14 ivas.gov.bisp.enumeration.ad.O) = (r1v13 ivas.gov.bisp.enumeration.ad.O), (r1v175 ivas.gov.bisp.enumeration.ad.O) binds: [B:10:0x0040, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x0122  */
    /* JADX WARN: Code duplicated, block: B:40:0x0143  */
    /* JADX WARN: Code duplicated, block: B:47:0x0183  */
    /* JADX WARN: Code duplicated, block: B:49:0x0194  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x020d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0231 A[LOOP:3: B:65:0x022b->B:67:0x0231, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x029d  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x02db  */
    /* JADX WARN: Code duplicated, block: B:79:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0321  */
    /* JADX WARN: Code duplicated, block: B:87:0x032f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0363  */
    /* JADX WARN: Code duplicated, block: B:97:0x0366  */
    public final void c(s sVar, int i, int i2, s sVar2, ArrayList<n> arrayList, n nVar) {
        O o2;
        n nVar2;
        int i3;
        Iterator<V> it;
        int i4;
        Iterator<s> it2;
        int i5;
        Iterator<s> it3;
        int i6;
        int i7;
        s next;
        int i8;
        int i9;
        Iterator<V> it4;
        int i10;
        V next2;
        int i11;
        int i12;
        int i13;
        V next3;
        n nVar3;
        int i14;
        int i15;
        int i16 = 2 % 2;
        int i17 = b;
        int i18 = i17 ^ 37;
        int i19 = (i17 & 37) << 1;
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        Y y = sVar.g;
        Object obj = null;
        if (y.f == null) {
            int i22 = a + 64;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                o2 = this.c;
                int i24 = 24 / 0;
                if (y != o2.g) {
                    if (y != o2.i) {
                        int i25 = a + 43;
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        if (nVar == null) {
                            nVar3 = new n(y, i2);
                            arrayList.add(nVar3);
                            i14 = b;
                            i15 = i14 + 69;
                            a = i15 % 128;
                            if (i15 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            int i27 = ((i14 | 105) << 1) - (i14 ^ 105);
                            a = i27 % 128;
                            int i28 = i27 % 2;
                            nVar2 = nVar3;
                        } else {
                            nVar2 = nVar;
                        }
                        y.f = nVar2;
                        nVar2.e.add(y);
                        int i29 = b;
                        int i30 = (i29 & (-54)) | ((~i29) & 53);
                        int i31 = (i29 & 53) << 1;
                        i3 = (i30 ^ i31) + ((i31 & i30) << 1);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            y.k.m.iterator();
                            obj.hashCode();
                            throw null;
                        }
                        it = y.k.m.iterator();
                        int i32 = b;
                        i4 = (((i32 & (-44)) | ((~i32) & 43)) - (~(-(-((i32 & 43) << 1))))) - 1;
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i33 = 5 / 3;
                        }
                        while (it.hasNext()) {
                            int i34 = a;
                            i13 = ((i34 | 115) << 1) - (i34 ^ 115);
                            b = i13 % 128;
                            if (i13 % 2 == 0) {
                                boolean z = it.next() instanceof s;
                                throw null;
                            }
                            next3 = it.next();
                            if (next3 instanceof s) {
                                c((s) next3, i, 0, sVar2, arrayList, nVar2);
                                int i35 = a;
                                int i36 = i35 & 37;
                                int i37 = (i35 ^ 37) | i36;
                                int i38 = (i36 & i37) + (i37 | i36);
                                b = i38 % 128;
                                int i39 = i38 % 2;
                            }
                        }
                        int i40 = b;
                        int i41 = (i40 & 27) + (i40 | 27);
                        a = i41 % 128;
                        int i42 = i41 % 2;
                        for (V v : y.c.m) {
                            int i43 = a;
                            int i44 = (i43 & 87) + (i43 | 87);
                            b = i44 % 128;
                            int i45 = i44 % 2;
                            int i46 = b;
                            i11 = ((i46 & 90) + (i46 | 90)) - 1;
                            i12 = i11 % 128;
                            a = i12;
                            if (i11 % 2 != 0) {
                                boolean z2 = v instanceof s;
                                obj.hashCode();
                                throw null;
                            }
                            if (!(v instanceof s)) {
                                s sVar3 = (s) v;
                                int i47 = i12 & 67;
                                int i48 = ((i12 ^ 67) | i47) << 1;
                                int i49 = -((i12 | 67) & (~i47));
                                int i50 = (i48 & i49) + (i48 | i49);
                                b = i50 % 128;
                                int i51 = i50 % 2;
                                c(sVar3, i, 1, sVar2, arrayList, nVar2);
                                int i52 = a;
                                int i53 = ((i52 | 119) << 1) - (i52 ^ 119);
                                b = i53 % 128;
                                int i54 = i53 % 2;
                            }
                        }
                        if (i == 1) {
                            int i55 = b;
                            int i56 = ((i55 & 22) + (i55 | 22)) - 1;
                            i8 = i56 % 128;
                            a = i8;
                            int i57 = i56 % 2;
                            if (y instanceof X) {
                                int i58 = i8 & 95;
                                int i59 = (i8 | 95) & (~i58);
                                int i60 = -(-(i58 << 1));
                                i9 = (i59 & i60) + (i59 | i60);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    ((X) y).m.m.iterator();
                                    obj.hashCode();
                                    throw null;
                                }
                                it4 = ((X) y).m.m.iterator();
                                int i61 = b;
                                int i62 = ((i61 & 20) + (i61 | 20)) - 1;
                                a = i62 % 128;
                                int i63 = i62 % 2;
                                while (!(!it4.hasNext())) {
                                    i10 = a + 89;
                                    b = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        boolean z3 = it4.next() instanceof s;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    next2 = it4.next();
                                    if (next2 instanceof s) {
                                        c((s) next2, i, 2, sVar2, arrayList, nVar2);
                                        int i64 = b;
                                        int i65 = i64 & 85;
                                        int i66 = -(-((i64 ^ 85) | i65));
                                        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                                        a = i67 % 128;
                                        int i68 = i67 % 2;
                                    }
                                }
                            }
                        }
                        int i69 = a + 107;
                        b = i69 % 128;
                        int i70 = i69 % 2;
                        for (s sVar4 : y.k.n) {
                            int i71 = b + 59;
                            a = i71 % 128;
                            int i72 = i71 % 2;
                            int i73 = a;
                            int i74 = (i73 & 97) + (i73 | 97);
                            b = i74 % 128;
                            int i75 = i74 % 2;
                            c(sVar4, i, 0, sVar2, arrayList, nVar2);
                            int i76 = b;
                            int i77 = ((i76 ^ 115) | (i76 & 115)) << 1;
                            int i78 = -((115 & (~i76)) | (i76 & (-116)));
                            int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                            a = i79 % 128;
                            int i80 = i79 % 2;
                        }
                        it2 = y.c.n.iterator();
                        int i81 = b;
                        int i82 = ((i81 ^ 91) | (i81 & 91)) << 1;
                        int i83 = -((91 & (~i81)) | (i81 & (-92)));
                        int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                        a = i84 % 128;
                        int i85 = i84 % 2;
                        while (it2.hasNext()) {
                            int i86 = a;
                            int i87 = i86 & 75;
                            i7 = i87 + ((i86 ^ 75) | i87);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                next = it2.next();
                                int i88 = 11 / 0;
                            } else {
                                next = it2.next();
                            }
                            s sVar5 = next;
                            int i89 = b;
                            int i90 = ((i89 | 95) << 1) - (i89 ^ 95);
                            a = i90 % 128;
                            int i91 = i90 % 2;
                            c(sVar5, i, 1, sVar2, arrayList, nVar2);
                        }
                        if (i == 1) {
                            int i92 = a;
                            int i93 = i92 & 27;
                            int i94 = (i92 | 27) & (~i93);
                            int i95 = -(-(i93 << 1));
                            i5 = (i94 & i95) + (i94 | i95);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                boolean z4 = y instanceof X;
                                throw null;
                            }
                            if (!(!(y instanceof X))) {
                                it3 = ((X) y).m.n.iterator();
                                int i96 = b;
                                int i97 = (-2) - (((i96 ^ 44) + ((i96 & 44) << 1)) ^ (-1));
                                int i98 = i97 % 128;
                                a = i98;
                                int i99 = i97 % 2;
                                int i100 = i98 + 49;
                                b = i100 % 128;
                                int i101 = i100 % 2;
                                while (!(!it3.hasNext())) {
                                    int i102 = a;
                                    i6 = (i102 & 39) + (i102 | 39);
                                    b = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        it3.next();
                                        throw null;
                                    }
                                    c(it3.next(), i, 2, sVar2, arrayList, nVar2);
                                    int i103 = a;
                                    int i104 = i103 & 91;
                                    int i105 = (i103 | 91) & (~i104);
                                    int i106 = -(-(i104 << 1));
                                    int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
                                    b = i107 % 128;
                                    int i108 = i107 % 2;
                                }
                            }
                        }
                    }
                }
            } else {
                o2 = this.c;
                if (y != o2.g) {
                    if (y != o2.i) {
                        int i210 = a + 43;
                        b = i210 % 128;
                        int i211 = i210 % 2;
                        if (nVar == null) {
                            nVar3 = new n(y, i2);
                            arrayList.add(nVar3);
                            i14 = b;
                            i15 = i14 + 69;
                            a = i15 % 128;
                            if (i15 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            int i212 = ((i14 | 105) << 1) - (i14 ^ 105);
                            a = i212 % 128;
                            int i213 = i212 % 2;
                            nVar2 = nVar3;
                        } else {
                            nVar2 = nVar;
                        }
                        y.f = nVar2;
                        nVar2.e.add(y);
                        int i214 = b;
                        int i310 = (i214 & (-54)) | ((~i214) & 53);
                        int i311 = (i214 & 53) << 1;
                        i3 = (i310 ^ i311) + ((i311 & i310) << 1);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            y.k.m.iterator();
                            obj.hashCode();
                            throw null;
                        }
                        it = y.k.m.iterator();
                        int i312 = b;
                        i4 = (((i312 & (-44)) | ((~i312) & 43)) - (~(-(-((i312 & 43) << 1))))) - 1;
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i313 = 5 / 3;
                        }
                        while (it.hasNext()) {
                            int i314 = a;
                            i13 = ((i314 | 115) << 1) - (i314 ^ 115);
                            b = i13 % 128;
                            if (i13 % 2 == 0) {
                                boolean z5 = it.next() instanceof s;
                                throw null;
                            }
                            next3 = it.next();
                            if (next3 instanceof s) {
                                c((s) next3, i, 0, sVar2, arrayList, nVar2);
                                int i315 = a;
                                int i316 = i315 & 37;
                                int i317 = (i315 ^ 37) | i316;
                                int i318 = (i316 & i317) + (i317 | i316);
                                b = i318 % 128;
                                int i319 = i318 % 2;
                            }
                        }
                        int i410 = b;
                        int i411 = (i410 & 27) + (i410 | 27);
                        a = i411 % 128;
                        int i412 = i411 % 2;
                        while (r15.hasNext()) {
                            int i413 = a;
                            int i414 = (i413 & 87) + (i413 | 87);
                            b = i414 % 128;
                            int i415 = i414 % 2;
                            int i416 = b;
                            i11 = ((i416 & 90) + (i416 | 90)) - 1;
                            i12 = i11 % 128;
                            a = i12;
                            if (i11 % 2 != 0) {
                                boolean z6 = v instanceof s;
                                obj.hashCode();
                                throw null;
                            }
                            if (!(v instanceof s)) {
                                s sVar6 = (s) v;
                                int i417 = i12 & 67;
                                int i418 = ((i12 ^ 67) | i417) << 1;
                                int i419 = -((i12 | 67) & (~i417));
                                int i510 = (i418 & i419) + (i418 | i419);
                                b = i510 % 128;
                                int i511 = i510 % 2;
                                c(sVar6, i, 1, sVar2, arrayList, nVar2);
                                int i512 = a;
                                int i513 = ((i512 | 119) << 1) - (i512 ^ 119);
                                b = i513 % 128;
                                int i514 = i513 % 2;
                            }
                        }
                        if (i == 1) {
                            int i515 = b;
                            int i516 = ((i515 & 22) + (i515 | 22)) - 1;
                            i8 = i516 % 128;
                            a = i8;
                            int i517 = i516 % 2;
                            if (y instanceof X) {
                                int i518 = i8 & 95;
                                int i519 = (i8 | 95) & (~i518);
                                int i610 = -(-(i518 << 1));
                                i9 = (i519 & i610) + (i519 | i610);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    ((X) y).m.m.iterator();
                                    obj.hashCode();
                                    throw null;
                                }
                                it4 = ((X) y).m.m.iterator();
                                int i611 = b;
                                int i612 = ((i611 & 20) + (i611 | 20)) - 1;
                                a = i612 % 128;
                                int i613 = i612 % 2;
                                while (!(!it4.hasNext())) {
                                    i10 = a + 89;
                                    b = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        boolean z7 = it4.next() instanceof s;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    next2 = it4.next();
                                    if (next2 instanceof s) {
                                        c((s) next2, i, 2, sVar2, arrayList, nVar2);
                                        int i614 = b;
                                        int i615 = i614 & 85;
                                        int i616 = -(-((i614 ^ 85) | i615));
                                        int i617 = (i615 ^ i616) + ((i616 & i615) << 1);
                                        a = i617 % 128;
                                        int i618 = i617 % 2;
                                    }
                                }
                            }
                        }
                        int i619 = a + 107;
                        b = i619 % 128;
                        int i710 = i619 % 2;
                        while (r15.hasNext()) {
                            int i711 = b + 59;
                            a = i711 % 128;
                            int i712 = i711 % 2;
                            int i713 = a;
                            int i714 = (i713 & 97) + (i713 | 97);
                            b = i714 % 128;
                            int i715 = i714 % 2;
                            c(sVar4, i, 0, sVar2, arrayList, nVar2);
                            int i716 = b;
                            int i717 = ((i716 ^ 115) | (i716 & 115)) << 1;
                            int i718 = -((115 & (~i716)) | (i716 & (-116)));
                            int i719 = (i717 ^ i718) + ((i718 & i717) << 1);
                            a = i719 % 128;
                            int i810 = i719 % 2;
                        }
                        it2 = y.c.n.iterator();
                        int i811 = b;
                        int i812 = ((i811 ^ 91) | (i811 & 91)) << 1;
                        int i813 = -((91 & (~i811)) | (i811 & (-92)));
                        int i814 = ((i812 | i813) << 1) - (i813 ^ i812);
                        a = i814 % 128;
                        int i815 = i814 % 2;
                        while (it2.hasNext()) {
                            int i816 = a;
                            int i817 = i816 & 75;
                            i7 = i817 + ((i816 ^ 75) | i817);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                next = it2.next();
                                int i818 = 11 / 0;
                            } else {
                                next = it2.next();
                            }
                            s sVar7 = next;
                            int i819 = b;
                            int i910 = ((i819 | 95) << 1) - (i819 ^ 95);
                            a = i910 % 128;
                            int i911 = i910 % 2;
                            c(sVar7, i, 1, sVar2, arrayList, nVar2);
                        }
                        if (i == 1) {
                            int i912 = a;
                            int i913 = i912 & 27;
                            int i914 = (i912 | 27) & (~i913);
                            int i915 = -(-(i913 << 1));
                            i5 = (i914 & i915) + (i914 | i915);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                boolean z8 = y instanceof X;
                                throw null;
                            }
                            if (!(!(y instanceof X))) {
                                it3 = ((X) y).m.n.iterator();
                                int i916 = b;
                                int i917 = (-2) - (((i916 ^ 44) + ((i916 & 44) << 1)) ^ (-1));
                                int i918 = i917 % 128;
                                a = i918;
                                int i919 = i917 % 2;
                                int i109 = i918 + 49;
                                b = i109 % 128;
                                int i1010 = i109 % 2;
                                while (!(!it3.hasNext())) {
                                    int i1011 = a;
                                    i6 = (i1011 & 39) + (i1011 | 39);
                                    b = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        it3.next();
                                        throw null;
                                    }
                                    c(it3.next(), i, 2, sVar2, arrayList, nVar2);
                                    int i1012 = a;
                                    int i1013 = i1012 & 91;
                                    int i1014 = (i1012 | 91) & (~i1013);
                                    int i1015 = -(-(i1013 << 1));
                                    int i1016 = (i1014 ^ i1015) + ((i1014 & i1015) << 1);
                                    b = i1016 % 128;
                                    int i1017 = i1016 % 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i110 = b + 1;
        a = i110 % 128;
        if (i110 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:103:0x0208  */
    /* JADX WARN: Code duplicated, block: B:104:0x020c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0281  */
    /* JADX WARN: Code duplicated, block: B:112:0x0285  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:121:0x031c  */
    /* JADX WARN: Code duplicated, block: B:122:0x032a  */
    /* JADX WARN: Code duplicated, block: B:126:0x034b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0392  */
    /* JADX WARN: Code duplicated, block: B:134:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x03b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x0401  */
    /* JADX WARN: Code duplicated, block: B:153:0x0448  */
    /* JADX WARN: Code duplicated, block: B:154:0x044c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0480  */
    /* JADX WARN: Code duplicated, block: B:162:0x0487  */
    /* JADX WARN: Code duplicated, block: B:164:0x048d A[PHI: r6
  0x048d: PHI (r6v90 int[]) = (r6v78 int[]), (r6v92 int[]) binds: [B:163:0x048b, B:160:0x0484] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:168:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:169:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:172:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:173:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:180:0x0503  */
    /* JADX WARN: Code duplicated, block: B:192:0x0550 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x056e  */
    /* JADX WARN: Code duplicated, block: B:213:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:214:0x0607  */
    /* JADX WARN: Code duplicated, block: B:218:0x0632  */
    /* JADX WARN: Code duplicated, block: B:219:0x064b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0653  */
    /* JADX WARN: Code duplicated, block: B:223:0x0677  */
    /* JADX WARN: Code duplicated, block: B:232:0x062c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0351 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x050a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x054b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x054e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x05db A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0567 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x057e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0548 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x054e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x052e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x04f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0434 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:302:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:311:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01db  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ee  */
    public final boolean d(O o2) {
        int i;
        int i2;
        int iP;
        int i3;
        int i4;
        int iC;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0015y c0015y;
        int i10;
        C0015y c0015y2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int iP2;
        float fC;
        int i16;
        float f;
        int i17;
        int i18;
        int i19;
        N[] nArr;
        int i20;
        int i21;
        int i22;
        int i23;
        float f2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        D d;
        int i31;
        N[] nArr2;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38 = 2 % 2;
        for (C0087m c0087m : o2.ag) {
            int[] iArr2 = c0087m.M;
            int i39 = iArr2[0];
            int i40 = a;
            int i41 = i40 & 83;
            int i42 = (i40 ^ 83) | i41;
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            b = i43 % 128;
            int i44 = i43 % 2;
            int i45 = iArr2[1];
            if (c0087m.Y == 8) {
                int i46 = a;
                int i47 = (((i46 | 66) << 1) - (i46 ^ 66)) - 1;
                b = i47 % 128;
                int i48 = i47 % 2;
                c0087m.d = true;
                int i49 = a + 103;
                b = i49 % 128;
                if (i49 % 2 != 0) {
                    int i50 = 2 % 5;
                }
            } else {
                float f3 = c0087m.q;
                if (f3 < 1.0f && i39 == 3) {
                    c0087m.l = 2;
                }
                float f4 = c0087m.s;
                if (f4 < 1.0f && i45 == 3) {
                    int i51 = a;
                    int i52 = i51 & 75;
                    int i53 = (i51 | 75) & (~i52);
                    int i54 = -(-(i52 << 1));
                    int i55 = (i53 & i54) + (i53 | i54);
                    b = i55 % 128;
                    int i56 = i55 % 2;
                    c0087m.m = 2;
                }
                if (c0087m.Q > 0.0f) {
                    int i57 = a;
                    int i58 = ((i57 | 87) << 1) - (i57 ^ 87);
                    int i59 = i58 % 128;
                    b = i59;
                    int i60 = i58 % 2;
                    if (i39 == 3) {
                        if (i45 != 2) {
                            int i61 = i59 ^ 95;
                            int i62 = ((i59 & 95) | i61) << 1;
                            int i63 = -i61;
                            int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                            a = i64 % 128;
                            if (i64 % 2 != 0 ? i45 != 1 : i45 != 0) {
                                if (i45 == 3) {
                                    int i65 = ((i59 | 55) << 1) - (i59 ^ 55);
                                    a = i65 % 128;
                                    int i66 = i65 % 2;
                                    if (i39 != 2) {
                                    }
                                    c0087m.m = 3;
                                } else if (i39 == 3) {
                                    i37 = a;
                                    int i67 = i37 & 83;
                                    int i68 = (i67 - (~(-(-((i37 ^ 83) | i67))))) - 1;
                                    b = i68 % 128;
                                    int i69 = i68 % 2;
                                    if (i45 == 3) {
                                        int i70 = (i37 ^ 39) + ((i37 & 39) << 1);
                                        b = i70 % 128;
                                        int i71 = i70 % 2;
                                        if (c0087m.l == 0) {
                                            c0087m.l = 3;
                                        }
                                        if (c0087m.m == 0) {
                                            c0087m.m = 3;
                                        }
                                    }
                                }
                            }
                        }
                        c0087m.l = 3;
                    } else if (i45 == 3) {
                        int i610 = ((i59 | 55) << 1) - (i59 ^ 55);
                        a = i610 % 128;
                        int i611 = i610 % 2;
                        if (i39 != 2 || i39 == 1) {
                            c0087m.m = 3;
                        } else if (i39 == 3) {
                            i37 = a;
                            int i612 = i37 & 83;
                            int i613 = (i612 - (~(-(-((i37 ^ 83) | i612))))) - 1;
                            b = i613 % 128;
                            int i614 = i613 % 2;
                            if (i45 == 3) {
                                int i72 = (i37 ^ 39) + ((i37 & 39) << 1);
                                b = i72 % 128;
                                int i73 = i72 % 2;
                                if (c0087m.l == 0) {
                                    c0087m.l = 3;
                                }
                                if (c0087m.m == 0) {
                                    c0087m.m = 3;
                                }
                            }
                        }
                    } else if (i39 == 3) {
                        i37 = a;
                        int i615 = i37 & 83;
                        int i616 = (i615 - (~(-(-((i37 ^ 83) | i615))))) - 1;
                        b = i616 % 128;
                        int i617 = i616 % 2;
                        if (i45 == 3) {
                            int i74 = (i37 ^ 39) + ((i37 & 39) << 1);
                            b = i74 % 128;
                            int i75 = i74 % 2;
                            if (c0087m.l == 0) {
                                c0087m.l = 3;
                            }
                            if (c0087m.m == 0) {
                                c0087m.m = 3;
                            }
                        }
                    }
                }
                if (i39 == 3 && c0087m.l == 1) {
                    if (c0087m.B.f != null) {
                        int i76 = b + 45;
                        a = i76 % 128;
                        if (i76 % 2 == 0) {
                            N n = c0087m.C.f;
                            throw null;
                        }
                        if (c0087m.C.f != null) {
                            i = i39;
                        }
                    }
                    i = 2;
                } else {
                    i = i39;
                }
                if (i45 == 3 && c0087m.m == 1) {
                    int i77 = a;
                    int i78 = i77 & 117;
                    int i79 = (i78 - (~(-(-((i77 ^ 117) | i78))))) - 1;
                    b = i79 % 128;
                    if (i79 % 2 != 0) {
                        int i80 = 14 / 0;
                        if (c0087m.A.f != null) {
                            int i81 = b;
                            int i82 = ((i81 | 113) << 1) - (i81 ^ 113);
                            a = i82 % 128;
                            int i83 = i82 % 2;
                            if (c0087m.E.f == null) {
                                i2 = i45;
                            }
                        }
                    } else if (c0087m.A.f != null) {
                        int i84 = b;
                        int i85 = ((i84 | 113) << 1) - (i84 ^ 113);
                        a = i85 % 128;
                        int i86 = i85 % 2;
                        if (c0087m.E.f == null) {
                            i2 = i45;
                        }
                    }
                    int i87 = b;
                    int i88 = i87 | 17;
                    int i89 = ((i88 << 1) - (~(-((~(i87 & 17)) & i88)))) - 1;
                    a = i89 % 128;
                    int i90 = i89 % 2;
                    i2 = 2;
                } else {
                    i2 = i45;
                }
                D d2 = c0087m.g;
                d2.g = i;
                int i91 = c0087m.l;
                d2.d = i91;
                X x = c0087m.i;
                x.g = i2;
                int i92 = c0087m.m;
                int i93 = b;
                int i94 = (-2) - (((i93 ^ 90) + ((i93 & 90) << 1)) ^ (-1));
                a = i94 % 128;
                int i95 = i94 % 2;
                x.d = i92;
                if (i != 4) {
                    int i96 = b;
                    int i97 = ((i96 | 77) << 1) - (i96 ^ 77);
                    a = i97 % 128;
                    if (i97 % 2 != 0 ? i == 1 : i == 0) {
                        if (i2 == 4 && i2 != 1) {
                            int i98 = a;
                            int i99 = i98 & 41;
                            int i100 = (i99 - (~(-(-((i98 ^ 41) | i99))))) - 1;
                            b = i100 % 128;
                            if (i100 % 2 != 0) {
                                if (i2 != 4) {
                                    i7 = 3;
                                    if (i == 3) {
                                        if (i2 != 2) {
                                            int i101 = b;
                                            int i102 = (i101 ^ 75) + ((i101 & 75) << 1);
                                            a = i102 % 128;
                                            int i103 = i102 % 2;
                                            if (i2 == 1) {
                                                if (i91 == 3) {
                                                    i25 = b;
                                                    int i104 = (i25 & 87) + (i25 | 87);
                                                    a = i104 % 128;
                                                    int i105 = i104 % 2;
                                                    if (i2 == 2) {
                                                        i26 = i25 + 71;
                                                        a = i26 % 128;
                                                        if (i26 % 2 == 0) {
                                                            i27 = 4;
                                                            i28 = 0;
                                                            i29 = 5;
                                                        } else {
                                                            i27 = 2;
                                                            i28 = 0;
                                                            i29 = 2;
                                                        }
                                                        g(c0087m, i27, i28, i29, 0);
                                                    }
                                                    int iC2 = c0087m.c();
                                                    int i106 = a;
                                                    int i107 = i106 ^ 113;
                                                    int i108 = -(-((i106 & 113) << 1));
                                                    int i109 = (i107 ^ i108) + ((i108 & i107) << 1);
                                                    b = i109 % 128;
                                                    int i110 = i109 % 2;
                                                    g(c0087m, 1, (int) ((iC2 * c0087m.Q) + 0.5f), 1, iC2);
                                                    c0087m.g.i.e(c0087m.p());
                                                    C0015y c0015y3 = c0087m.i.i;
                                                    int i111 = b;
                                                    int i112 = i111 & 29;
                                                    int i113 = -(-(i111 | 29));
                                                    int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                                                    a = i114 % 128;
                                                    int i115 = i114 % 2;
                                                    c0015y3.e(c0087m.c());
                                                    c0087m.d = true;
                                                } else if (i91 == 1) {
                                                    int i116 = b;
                                                    int i117 = i116 & 115;
                                                    int i118 = (i116 | 115) & (~i117);
                                                    int i119 = i117 << 1;
                                                    i33 = ((i118 | i119) << 1) - (i118 ^ i119);
                                                    a = i33 % 128;
                                                    if (i33 % 2 == 0) {
                                                        i34 = 2;
                                                        i35 = 0;
                                                        i36 = 1;
                                                    } else {
                                                        i34 = 2;
                                                        i35 = 0;
                                                        i36 = 0;
                                                    }
                                                    g(c0087m, i34, i35, i2, i36);
                                                    c0087m.g.i.f41o = c0087m.p();
                                                    int i120 = a;
                                                    int i121 = (-2) - ((-1) ^ ((i120 & 50) + (i120 | 50)));
                                                    b = i121 % 128;
                                                    int i122 = i121 % 2;
                                                } else if (i91 == 2) {
                                                    int i123 = a;
                                                    int i124 = (i123 & (-2)) | ((~i123) & 1);
                                                    int i125 = (i123 & 1) << 1;
                                                    int i126 = (i124 & i125) + (i125 | i124);
                                                    b = i126 % 128;
                                                    int i127 = i126 % 2;
                                                    i30 = o2.M[0];
                                                    if (i30 != 1) {
                                                        int i128 = a;
                                                        int i129 = i128 ^ 83;
                                                        int i130 = ((i128 & 83) | i129) << 1;
                                                        int i131 = -i129;
                                                        int i132 = (i130 & i131) + (i130 | i131);
                                                        b = i132 % 128;
                                                        int i133 = i132 % 2;
                                                        if (i30 != 4) {
                                                        }
                                                    }
                                                    int iP3 = (int) ((f3 * o2.p()) + 0.5f);
                                                    int i134 = a;
                                                    int i135 = ((i134 ^ 15) | (i134 & 15)) << 1;
                                                    int i136 = -(((~i134) & 15) | (i134 & (-16)));
                                                    int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                                                    b = i137 % 128;
                                                    int i138 = i137 % 2;
                                                    g(c0087m, 1, iP3, i2, c0087m.c());
                                                    d = c0087m.g;
                                                    int i139 = b;
                                                    int i140 = i139 & 57;
                                                    int i141 = i139 | 57;
                                                    i31 = (i140 & i141) + (i141 | i140);
                                                    a = i31 % 128;
                                                    if (i31 % 2 == 0) {
                                                        d.i.e(c0087m.p());
                                                        int i142 = 42 / 0;
                                                    } else {
                                                        d.i.e(c0087m.p());
                                                    }
                                                    c0087m.i.i.e(c0087m.c());
                                                    c0087m.d = true;
                                                } else {
                                                    nArr2 = c0087m.K;
                                                    if (nArr2[0].f != null || nArr2[1].f == null) {
                                                        g(c0087m, 2, 0, i2, 0);
                                                        c0087m.g.i.e(c0087m.p());
                                                        c0087m.i.i.e(c0087m.c());
                                                        c0087m.d = true;
                                                        int i143 = a;
                                                        int i144 = (i143 | 115) << 1;
                                                        int i145 = -((115 & (~i143)) | (i143 & (-116)));
                                                        i32 = ((i144 | i145) << 1) - (i145 ^ i144);
                                                        b = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            int i146 = 3 % 4;
                                                        }
                                                    }
                                                }
                                            }
                                            i7 = 3;
                                        } else if (i91 == 3) {
                                            i25 = b;
                                            int i1010 = (i25 & 87) + (i25 | 87);
                                            a = i1010 % 128;
                                            int i1011 = i1010 % 2;
                                            if (i2 == 2) {
                                                i26 = i25 + 71;
                                                a = i26 % 128;
                                                if (i26 % 2 == 0) {
                                                    i27 = 4;
                                                    i28 = 0;
                                                    i29 = 5;
                                                } else {
                                                    i27 = 2;
                                                    i28 = 0;
                                                    i29 = 2;
                                                }
                                                g(c0087m, i27, i28, i29, 0);
                                            }
                                            int iC3 = c0087m.c();
                                            int i1012 = a;
                                            int i1013 = i1012 ^ 113;
                                            int i1014 = -(-((i1012 & 113) << 1));
                                            int i1015 = (i1013 ^ i1014) + ((i1014 & i1013) << 1);
                                            b = i1015 % 128;
                                            int i1110 = i1015 % 2;
                                            g(c0087m, 1, (int) ((iC3 * c0087m.Q) + 0.5f), 1, iC3);
                                            c0087m.g.i.e(c0087m.p());
                                            C0015y c0015y4 = c0087m.i.i;
                                            int i1111 = b;
                                            int i1112 = i1111 & 29;
                                            int i1113 = -(-(i1111 | 29));
                                            int i1114 = ((i1112 | i1113) << 1) - (i1113 ^ i1112);
                                            a = i1114 % 128;
                                            int i1115 = i1114 % 2;
                                            c0015y4.e(c0087m.c());
                                            c0087m.d = true;
                                        } else if (i91 == 1) {
                                            int i1116 = b;
                                            int i1117 = i1116 & 115;
                                            int i1118 = (i1116 | 115) & (~i1117);
                                            int i1119 = i1117 << 1;
                                            i33 = ((i1118 | i1119) << 1) - (i1118 ^ i1119);
                                            a = i33 % 128;
                                            if (i33 % 2 == 0) {
                                                i34 = 2;
                                                i35 = 0;
                                                i36 = 1;
                                            } else {
                                                i34 = 2;
                                                i35 = 0;
                                                i36 = 0;
                                            }
                                            g(c0087m, i34, i35, i2, i36);
                                            c0087m.g.i.f41o = c0087m.p();
                                            int i1210 = a;
                                            int i1211 = (-2) - ((-1) ^ ((i1210 & 50) + (i1210 | 50)));
                                            b = i1211 % 128;
                                            int i1212 = i1211 % 2;
                                        } else if (i91 == 2) {
                                            int i1213 = a;
                                            int i1214 = (i1213 & (-2)) | ((~i1213) & 1);
                                            int i1215 = (i1213 & 1) << 1;
                                            int i1216 = (i1214 & i1215) + (i1215 | i1214);
                                            b = i1216 % 128;
                                            int i1217 = i1216 % 2;
                                            i30 = o2.M[0];
                                            if (i30 != 1) {
                                                int i1218 = a;
                                                int i1219 = i1218 ^ 83;
                                                int i1310 = ((i1218 & 83) | i1219) << 1;
                                                int i1311 = -i1219;
                                                int i1312 = (i1310 & i1311) + (i1310 | i1311);
                                                b = i1312 % 128;
                                                int i1313 = i1312 % 2;
                                                if (i30 != 4) {
                                                    i7 = 3;
                                                }
                                            }
                                            int iP4 = (int) ((f3 * o2.p()) + 0.5f);
                                            int i1314 = a;
                                            int i1315 = ((i1314 ^ 15) | (i1314 & 15)) << 1;
                                            int i1316 = -(((~i1314) & 15) | (i1314 & (-16)));
                                            int i1317 = (i1315 ^ i1316) + ((i1316 & i1315) << 1);
                                            b = i1317 % 128;
                                            int i1318 = i1317 % 2;
                                            g(c0087m, 1, iP4, i2, c0087m.c());
                                            d = c0087m.g;
                                            int i1319 = b;
                                            int i147 = i1319 & 57;
                                            int i148 = i1319 | 57;
                                            i31 = (i147 & i148) + (i148 | i147);
                                            a = i31 % 128;
                                            if (i31 % 2 == 0) {
                                                d.i.e(c0087m.p());
                                                int i149 = 42 / 0;
                                            } else {
                                                d.i.e(c0087m.p());
                                            }
                                            c0087m.i.i.e(c0087m.c());
                                            c0087m.d = true;
                                        } else {
                                            nArr2 = c0087m.K;
                                            if (nArr2[0].f != null) {
                                            }
                                            g(c0087m, 2, 0, i2, 0);
                                            c0087m.g.i.e(c0087m.p());
                                            c0087m.i.i.e(c0087m.c());
                                            c0087m.d = true;
                                            int i1410 = a;
                                            int i1411 = (i1410 | 115) << 1;
                                            int i1412 = -((115 & (~i1410)) | (i1410 & (-116)));
                                            i32 = ((i1411 | i1412) << 1) - (i1412 ^ i1411);
                                            b = i32 % 128;
                                            if (i32 % 2 != 0) {
                                                int i1413 = 3 % 4;
                                            }
                                        }
                                    }
                                    if (i2 == i7) {
                                        i14 = a;
                                        int i150 = (i14 & 7) + (i14 | 7);
                                        b = i150 % 128;
                                        int i151 = i150 % 2;
                                        if (i != 2) {
                                            int i152 = i14 & 25;
                                            int i153 = -(-(i14 | 25));
                                            i24 = (i152 ^ i153) + ((i152 & i153) << 1);
                                            b = i24 % 128;
                                            if (i24 % 2 != 0) {
                                                if (i == 0) {
                                                    if (i92 == 3) {
                                                        int i154 = i14 + 39;
                                                        b = i154 % 128;
                                                        int i155 = i154 % 2;
                                                        if (i == 2) {
                                                            g(c0087m, 2, 0, 2, 0);
                                                            int i156 = b;
                                                            int i157 = ((i156 | 117) << 1) - (((~i156) & 117) | (i156 & (-118)));
                                                            a = i157 % 128;
                                                            int i158 = i157 % 2;
                                                        }
                                                        int iP5 = c0087m.p();
                                                        f2 = c0087m.Q;
                                                        int i159 = a;
                                                        int i160 = i159 ^ 99;
                                                        int i161 = ((i159 & 99) | i160) << 1;
                                                        int i162 = -i160;
                                                        int i163 = (i161 ^ i162) + ((i161 & i162) << 1);
                                                        b = i163 % 128;
                                                        int i164 = i163 % 2;
                                                        if (c0087m.R == -1) {
                                                            f2 = 1.0f / f2;
                                                        }
                                                        g(c0087m, 1, iP5, 1, (int) ((iP5 * f2) + 0.5f));
                                                        c0087m.g.i.e(c0087m.p());
                                                        int i165 = a + 21;
                                                        b = i165 % 128;
                                                        int i166 = i165 % 2;
                                                        c0087m.i.i.e(c0087m.c());
                                                        c0087m.d = true;
                                                    } else if (i92 == 1) {
                                                        int i167 = i14 & 5;
                                                        int i168 = (i14 ^ 5) | i167;
                                                        i20 = ((i167 | i168) << 1) - (i167 ^ i168);
                                                        b = i20 % 128;
                                                        if (i20 % 2 != 0) {
                                                            i21 = 1;
                                                            i22 = 4;
                                                            i23 = 1;
                                                        } else {
                                                            i21 = 0;
                                                            i22 = 2;
                                                            i23 = 0;
                                                        }
                                                        g(c0087m, i, i21, i22, i23);
                                                        c0087m.i.i.f41o = c0087m.c();
                                                    } else if (i92 == 2) {
                                                        int i169 = ((i14 ^ 65) | (i14 & 65)) << 1;
                                                        int i170 = -((65 & (~i14)) | (i14 & (-66)));
                                                        i15 = (i169 ^ i170) + ((i170 & i169) << 1);
                                                        b = i15 % 128;
                                                        if (i15 % 2 != 0) {
                                                            iArr = o2.M;
                                                            if (iArr[1] != 0) {
                                                                if (iArr[1] == 4) {
                                                                }
                                                            }
                                                        } else {
                                                            iArr = o2.M;
                                                            if (iArr[1] != 1) {
                                                                if (iArr[1] == 4) {
                                                                }
                                                            }
                                                        }
                                                        iP2 = c0087m.p();
                                                        fC = o2.c();
                                                        int i171 = b;
                                                        i16 = ((i171 | 33) << 1) - (i171 ^ 33);
                                                        int i172 = i16 % 128;
                                                        a = i172;
                                                        if (i16 % 2 == 0) {
                                                            f = f4 + fC;
                                                        } else {
                                                            f = f4 * fC;
                                                        }
                                                        i17 = (int) (f + 0.5f);
                                                        int i173 = i172 & 63;
                                                        i18 = i173 + ((i172 ^ 63) | i173);
                                                        b = i18 % 128;
                                                        if (i18 % 2 != 0) {
                                                            g(c0087m, i, iP2, 0, i17);
                                                        } else {
                                                            g(c0087m, i, iP2, 1, i17);
                                                        }
                                                        c0087m.g.i.e(c0087m.p());
                                                        c0087m.i.i.e(c0087m.c());
                                                        i19 = a + 35;
                                                        b = i19 % 128;
                                                        if (i19 % 2 != 0) {
                                                            c0087m.d = false;
                                                        } else {
                                                            c0087m.d = true;
                                                        }
                                                    } else {
                                                        nArr = c0087m.K;
                                                        if (nArr[2].f != null || nArr[3].f == null) {
                                                            g(c0087m, 2, 0, i2, 0);
                                                            c0087m.g.i.e(c0087m.p());
                                                            c0087m.i.i.e(c0087m.c());
                                                            c0087m.d = true;
                                                        }
                                                    }
                                                }
                                            } else if (i == 1) {
                                                if (i92 == 3) {
                                                    int i1510 = i14 + 39;
                                                    b = i1510 % 128;
                                                    int i1511 = i1510 % 2;
                                                    if (i == 2) {
                                                        g(c0087m, 2, 0, 2, 0);
                                                        int i1512 = b;
                                                        int i1513 = ((i1512 | 117) << 1) - (((~i1512) & 117) | (i1512 & (-118)));
                                                        a = i1513 % 128;
                                                        int i1514 = i1513 % 2;
                                                    }
                                                    int iP6 = c0087m.p();
                                                    f2 = c0087m.Q;
                                                    int i1515 = a;
                                                    int i1610 = i1515 ^ 99;
                                                    int i1611 = ((i1515 & 99) | i1610) << 1;
                                                    int i1612 = -i1610;
                                                    int i1613 = (i1611 ^ i1612) + ((i1611 & i1612) << 1);
                                                    b = i1613 % 128;
                                                    int i1614 = i1613 % 2;
                                                    if (c0087m.R == -1) {
                                                        f2 = 1.0f / f2;
                                                    }
                                                    g(c0087m, 1, iP6, 1, (int) ((iP6 * f2) + 0.5f));
                                                    c0087m.g.i.e(c0087m.p());
                                                    int i1615 = a + 21;
                                                    b = i1615 % 128;
                                                    int i1616 = i1615 % 2;
                                                    c0087m.i.i.e(c0087m.c());
                                                    c0087m.d = true;
                                                } else if (i92 == 1) {
                                                    int i1617 = i14 & 5;
                                                    int i1618 = (i14 ^ 5) | i1617;
                                                    i20 = ((i1617 | i1618) << 1) - (i1617 ^ i1618);
                                                    b = i20 % 128;
                                                    if (i20 % 2 != 0) {
                                                        i21 = 1;
                                                        i22 = 4;
                                                        i23 = 1;
                                                    } else {
                                                        i21 = 0;
                                                        i22 = 2;
                                                        i23 = 0;
                                                    }
                                                    g(c0087m, i, i21, i22, i23);
                                                    c0087m.i.i.f41o = c0087m.c();
                                                } else if (i92 == 2) {
                                                    int i1619 = ((i14 ^ 65) | (i14 & 65)) << 1;
                                                    int i174 = -((65 & (~i14)) | (i14 & (-66)));
                                                    i15 = (i1619 ^ i174) + ((i174 & i1619) << 1);
                                                    b = i15 % 128;
                                                    if (i15 % 2 != 0) {
                                                        iArr = o2.M;
                                                        if (iArr[1] != 0) {
                                                            if (iArr[1] == 4) {
                                                            }
                                                        }
                                                    } else {
                                                        iArr = o2.M;
                                                        if (iArr[1] != 1) {
                                                            if (iArr[1] == 4) {
                                                            }
                                                        }
                                                    }
                                                    iP2 = c0087m.p();
                                                    fC = o2.c();
                                                    int i175 = b;
                                                    i16 = ((i175 | 33) << 1) - (i175 ^ 33);
                                                    int i176 = i16 % 128;
                                                    a = i176;
                                                    if (i16 % 2 == 0) {
                                                        f = f4 + fC;
                                                    } else {
                                                        f = f4 * fC;
                                                    }
                                                    i17 = (int) (f + 0.5f);
                                                    int i177 = i176 & 63;
                                                    i18 = i177 + ((i176 ^ 63) | i177);
                                                    b = i18 % 128;
                                                    if (i18 % 2 != 0) {
                                                        g(c0087m, i, iP2, 0, i17);
                                                    } else {
                                                        g(c0087m, i, iP2, 1, i17);
                                                    }
                                                    c0087m.g.i.e(c0087m.p());
                                                    c0087m.i.i.e(c0087m.c());
                                                    i19 = a + 35;
                                                    b = i19 % 128;
                                                    if (i19 % 2 != 0) {
                                                        c0087m.d = false;
                                                    } else {
                                                        c0087m.d = true;
                                                    }
                                                } else {
                                                    nArr = c0087m.K;
                                                    if (nArr[2].f != null) {
                                                    }
                                                    g(c0087m, 2, 0, i2, 0);
                                                    c0087m.g.i.e(c0087m.p());
                                                    c0087m.i.i.e(c0087m.c());
                                                    c0087m.d = true;
                                                }
                                            }
                                            i8 = 3;
                                        } else if (i92 == 3) {
                                            int i1516 = i14 + 39;
                                            b = i1516 % 128;
                                            int i1517 = i1516 % 2;
                                            if (i == 2) {
                                                g(c0087m, 2, 0, 2, 0);
                                                int i1518 = b;
                                                int i1519 = ((i1518 | 117) << 1) - (((~i1518) & 117) | (i1518 & (-118)));
                                                a = i1519 % 128;
                                                int i15110 = i1519 % 2;
                                            }
                                            int iP7 = c0087m.p();
                                            f2 = c0087m.Q;
                                            int i15111 = a;
                                            int i16110 = i15111 ^ 99;
                                            int i16111 = ((i15111 & 99) | i16110) << 1;
                                            int i16112 = -i16110;
                                            int i16113 = (i16111 ^ i16112) + ((i16111 & i16112) << 1);
                                            b = i16113 % 128;
                                            int i16114 = i16113 % 2;
                                            if (c0087m.R == -1) {
                                                f2 = 1.0f / f2;
                                            }
                                            g(c0087m, 1, iP7, 1, (int) ((iP7 * f2) + 0.5f));
                                            c0087m.g.i.e(c0087m.p());
                                            int i16115 = a + 21;
                                            b = i16115 % 128;
                                            int i16116 = i16115 % 2;
                                            c0087m.i.i.e(c0087m.c());
                                            c0087m.d = true;
                                        } else if (i92 == 1) {
                                            int i16117 = i14 & 5;
                                            int i16118 = (i14 ^ 5) | i16117;
                                            i20 = ((i16117 | i16118) << 1) - (i16117 ^ i16118);
                                            b = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                i21 = 1;
                                                i22 = 4;
                                                i23 = 1;
                                            } else {
                                                i21 = 0;
                                                i22 = 2;
                                                i23 = 0;
                                            }
                                            g(c0087m, i, i21, i22, i23);
                                            c0087m.i.i.f41o = c0087m.c();
                                        } else if (i92 == 2) {
                                            int i16119 = ((i14 ^ 65) | (i14 & 65)) << 1;
                                            int i178 = -((65 & (~i14)) | (i14 & (-66)));
                                            i15 = (i16119 ^ i178) + ((i178 & i16119) << 1);
                                            b = i15 % 128;
                                            if (i15 % 2 != 0) {
                                                iArr = o2.M;
                                                if (iArr[1] != 0) {
                                                    if (iArr[1] == 4) {
                                                        i8 = 3;
                                                    }
                                                }
                                            } else {
                                                iArr = o2.M;
                                                if (iArr[1] != 1) {
                                                    if (iArr[1] == 4) {
                                                        i8 = 3;
                                                    }
                                                }
                                            }
                                            iP2 = c0087m.p();
                                            fC = o2.c();
                                            int i179 = b;
                                            i16 = ((i179 | 33) << 1) - (i179 ^ 33);
                                            int i1710 = i16 % 128;
                                            a = i1710;
                                            if (i16 % 2 == 0) {
                                                f = f4 + fC;
                                            } else {
                                                f = f4 * fC;
                                            }
                                            i17 = (int) (f + 0.5f);
                                            int i1711 = i1710 & 63;
                                            i18 = i1711 + ((i1710 ^ 63) | i1711);
                                            b = i18 % 128;
                                            if (i18 % 2 != 0) {
                                                g(c0087m, i, iP2, 0, i17);
                                            } else {
                                                g(c0087m, i, iP2, 1, i17);
                                            }
                                            c0087m.g.i.e(c0087m.p());
                                            c0087m.i.i.e(c0087m.c());
                                            i19 = a + 35;
                                            b = i19 % 128;
                                            if (i19 % 2 != 0) {
                                                c0087m.d = false;
                                            } else {
                                                c0087m.d = true;
                                            }
                                        } else {
                                            nArr = c0087m.K;
                                            if (nArr[2].f != null) {
                                            }
                                            g(c0087m, 2, 0, i2, 0);
                                            c0087m.g.i.e(c0087m.p());
                                            c0087m.i.i.e(c0087m.c());
                                            c0087m.d = true;
                                        }
                                    } else {
                                        i8 = i7;
                                    }
                                    if (i == i8) {
                                        int i180 = a;
                                        int i181 = (i180 & (-92)) | ((~i180) & 91);
                                        int i182 = (i180 & 91) << 1;
                                        i9 = ((i181 | i182) << 1) - (i182 ^ i181);
                                        int i183 = i9 % 128;
                                        b = i183;
                                        if (i9 % 2 != 0) {
                                            if (i2 == 2) {
                                                if (i91 != 1 || i92 == 1) {
                                                    g(c0087m, 2, 0, 2, 0);
                                                    c0015y = c0087m.g.i;
                                                    int i184 = a;
                                                    i10 = (i184 ^ 5) + ((i184 & 5) << 1);
                                                    b = i10 % 128;
                                                    if (i10 % 2 != 0) {
                                                        c0015y.f41o = c0087m.p();
                                                        c0015y2 = c0087m.i.i;
                                                        int i185 = 14 / 0;
                                                    } else {
                                                        c0015y.f41o = c0087m.p();
                                                        c0015y2 = c0087m.i.i;
                                                    }
                                                    int i186 = a;
                                                    int i187 = (((i186 & (-68)) | ((~i186) & 67)) - (~((i186 & 67) << 1))) - 1;
                                                    b = i187 % 128;
                                                    int i188 = i187 % 2;
                                                    c0015y2.f41o = c0087m.c();
                                                } else {
                                                    int i189 = (i183 ^ 91) + ((i183 & 91) << 1);
                                                    a = i189 % 128;
                                                    if (i189 % 2 == 0) {
                                                        if (i92 == 5) {
                                                            if (i91 != 2) {
                                                                int[] iArr3 = o2.M;
                                                                i11 = iArr3[0];
                                                                if (i11 != 1) {
                                                                    int i190 = b;
                                                                    int i191 = i190 & 19;
                                                                    i13 = i191 + ((i190 ^ 19) | i191);
                                                                    a = i13 % 128;
                                                                    if (i13 % 2 == 0) {
                                                                        if (i11 == 0) {
                                                                        }
                                                                    } else if (i11 == 1) {
                                                                    }
                                                                }
                                                                i12 = iArr3[1];
                                                                if (i12 != 1 || i12 == 1) {
                                                                    int iP8 = (int) ((f3 * o2.p()) + 0.5f);
                                                                    int i192 = b;
                                                                    int i193 = (i192 ^ 1) + ((i192 & 1) << 1);
                                                                    a = i193 % 128;
                                                                    int i194 = i193 % 2;
                                                                    int iC4 = (int) ((f4 * o2.c()) + 0.5f);
                                                                    int i195 = a;
                                                                    int i196 = ((i195 | 35) << 1) - (((~i195) & 35) | (i195 & (-36)));
                                                                    b = i196 % 128;
                                                                    int i197 = i196 % 2;
                                                                    g(c0087m, 1, iP8, 1, iC4);
                                                                    c0087m.g.i.e(c0087m.p());
                                                                    c0087m.i.i.e(c0087m.c());
                                                                    c0087m.d = true;
                                                                }
                                                            }
                                                        }
                                                    } else if (i92 == 2) {
                                                        if (i91 != 2) {
                                                            int[] iArr4 = o2.M;
                                                            i11 = iArr4[0];
                                                            if (i11 != 1) {
                                                                int i198 = b;
                                                                int i199 = i198 & 19;
                                                                i13 = i199 + ((i198 ^ 19) | i199);
                                                                a = i13 % 128;
                                                                if (i13 % 2 == 0) {
                                                                    if (i11 == 0) {
                                                                    }
                                                                } else if (i11 == 1) {
                                                                }
                                                            }
                                                            i12 = iArr4[1];
                                                            if (i12 != 1) {
                                                            }
                                                            int iP9 = (int) ((f3 * o2.p()) + 0.5f);
                                                            int i1910 = b;
                                                            int i1911 = (i1910 ^ 1) + ((i1910 & 1) << 1);
                                                            a = i1911 % 128;
                                                            int i1912 = i1911 % 2;
                                                            int iC5 = (int) ((f4 * o2.c()) + 0.5f);
                                                            int i1913 = a;
                                                            int i1914 = ((i1913 | 35) << 1) - (((~i1913) & 35) | (i1913 & (-36)));
                                                            b = i1914 % 128;
                                                            int i1915 = i1914 % 2;
                                                            g(c0087m, 1, iP9, 1, iC5);
                                                            c0087m.g.i.e(c0087m.p());
                                                            c0087m.i.i.e(c0087m.c());
                                                            c0087m.d = true;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (i2 == 3) {
                                            if (i91 != 1) {
                                            }
                                            g(c0087m, 2, 0, 2, 0);
                                            c0015y = c0087m.g.i;
                                            int i1810 = a;
                                            i10 = (i1810 ^ 5) + ((i1810 & 5) << 1);
                                            b = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                c0015y.f41o = c0087m.p();
                                                c0015y2 = c0087m.i.i;
                                                int i1811 = 14 / 0;
                                            } else {
                                                c0015y.f41o = c0087m.p();
                                                c0015y2 = c0087m.i.i;
                                            }
                                            int i1812 = a;
                                            int i1813 = (((i1812 & (-68)) | ((~i1812) & 67)) - (~((i1812 & 67) << 1))) - 1;
                                            b = i1813 % 128;
                                            int i1814 = i1813 % 2;
                                            c0015y2.f41o = c0087m.c();
                                        }
                                    }
                                }
                            } else if (i2 != 2) {
                                i7 = 3;
                                if (i == 3) {
                                    if (i2 != 2) {
                                        int i1016 = b;
                                        int i1017 = (i1016 ^ 75) + ((i1016 & 75) << 1);
                                        a = i1017 % 128;
                                        int i1018 = i1017 % 2;
                                        if (i2 == 1) {
                                            if (i91 == 3) {
                                                i25 = b;
                                                int i1019 = (i25 & 87) + (i25 | 87);
                                                a = i1019 % 128;
                                                int i10110 = i1019 % 2;
                                                if (i2 == 2) {
                                                    i26 = i25 + 71;
                                                    a = i26 % 128;
                                                    if (i26 % 2 == 0) {
                                                        i27 = 4;
                                                        i28 = 0;
                                                        i29 = 5;
                                                    } else {
                                                        i27 = 2;
                                                        i28 = 0;
                                                        i29 = 2;
                                                    }
                                                    g(c0087m, i27, i28, i29, 0);
                                                }
                                                int iC6 = c0087m.c();
                                                int i10111 = a;
                                                int i10112 = i10111 ^ 113;
                                                int i10113 = -(-((i10111 & 113) << 1));
                                                int i10114 = (i10112 ^ i10113) + ((i10113 & i10112) << 1);
                                                b = i10114 % 128;
                                                int i11110 = i10114 % 2;
                                                g(c0087m, 1, (int) ((iC6 * c0087m.Q) + 0.5f), 1, iC6);
                                                c0087m.g.i.e(c0087m.p());
                                                C0015y c0015y5 = c0087m.i.i;
                                                int i11111 = b;
                                                int i11112 = i11111 & 29;
                                                int i11113 = -(-(i11111 | 29));
                                                int i11114 = ((i11112 | i11113) << 1) - (i11113 ^ i11112);
                                                a = i11114 % 128;
                                                int i11115 = i11114 % 2;
                                                c0015y5.e(c0087m.c());
                                                c0087m.d = true;
                                            } else if (i91 == 1) {
                                                int i11116 = b;
                                                int i11117 = i11116 & 115;
                                                int i11118 = (i11116 | 115) & (~i11117);
                                                int i11119 = i11117 << 1;
                                                i33 = ((i11118 | i11119) << 1) - (i11118 ^ i11119);
                                                a = i33 % 128;
                                                if (i33 % 2 == 0) {
                                                    i34 = 2;
                                                    i35 = 0;
                                                    i36 = 1;
                                                } else {
                                                    i34 = 2;
                                                    i35 = 0;
                                                    i36 = 0;
                                                }
                                                g(c0087m, i34, i35, i2, i36);
                                                c0087m.g.i.f41o = c0087m.p();
                                                int i12110 = a;
                                                int i12111 = (-2) - ((-1) ^ ((i12110 & 50) + (i12110 | 50)));
                                                b = i12111 % 128;
                                                int i12112 = i12111 % 2;
                                            } else if (i91 == 2) {
                                                int i12113 = a;
                                                int i12114 = (i12113 & (-2)) | ((~i12113) & 1);
                                                int i12115 = (i12113 & 1) << 1;
                                                int i12116 = (i12114 & i12115) + (i12115 | i12114);
                                                b = i12116 % 128;
                                                int i12117 = i12116 % 2;
                                                i30 = o2.M[0];
                                                if (i30 != 1) {
                                                    int i12118 = a;
                                                    int i12119 = i12118 ^ 83;
                                                    int i13110 = ((i12118 & 83) | i12119) << 1;
                                                    int i13111 = -i12119;
                                                    int i13112 = (i13110 & i13111) + (i13110 | i13111);
                                                    b = i13112 % 128;
                                                    int i13113 = i13112 % 2;
                                                    if (i30 != 4) {
                                                    }
                                                }
                                                int iP10 = (int) ((f3 * o2.p()) + 0.5f);
                                                int i13114 = a;
                                                int i13115 = ((i13114 ^ 15) | (i13114 & 15)) << 1;
                                                int i13116 = -(((~i13114) & 15) | (i13114 & (-16)));
                                                int i13117 = (i13115 ^ i13116) + ((i13116 & i13115) << 1);
                                                b = i13117 % 128;
                                                int i13118 = i13117 % 2;
                                                g(c0087m, 1, iP10, i2, c0087m.c());
                                                d = c0087m.g;
                                                int i13119 = b;
                                                int i1414 = i13119 & 57;
                                                int i1415 = i13119 | 57;
                                                i31 = (i1414 & i1415) + (i1415 | i1414);
                                                a = i31 % 128;
                                                if (i31 % 2 == 0) {
                                                    d.i.e(c0087m.p());
                                                    int i1416 = 42 / 0;
                                                } else {
                                                    d.i.e(c0087m.p());
                                                }
                                                c0087m.i.i.e(c0087m.c());
                                                c0087m.d = true;
                                            } else {
                                                nArr2 = c0087m.K;
                                                if (nArr2[0].f != null) {
                                                }
                                                g(c0087m, 2, 0, i2, 0);
                                                c0087m.g.i.e(c0087m.p());
                                                c0087m.i.i.e(c0087m.c());
                                                c0087m.d = true;
                                                int i1417 = a;
                                                int i1418 = (i1417 | 115) << 1;
                                                int i1419 = -((115 & (~i1417)) | (i1417 & (-116)));
                                                i32 = ((i1418 | i1419) << 1) - (i1419 ^ i1418);
                                                b = i32 % 128;
                                                if (i32 % 2 != 0) {
                                                    int i14110 = 3 % 4;
                                                }
                                            }
                                        }
                                        i7 = 3;
                                    } else if (i91 == 3) {
                                        i25 = b;
                                        int i10115 = (i25 & 87) + (i25 | 87);
                                        a = i10115 % 128;
                                        int i10116 = i10115 % 2;
                                        if (i2 == 2) {
                                            i26 = i25 + 71;
                                            a = i26 % 128;
                                            if (i26 % 2 == 0) {
                                                i27 = 4;
                                                i28 = 0;
                                                i29 = 5;
                                            } else {
                                                i27 = 2;
                                                i28 = 0;
                                                i29 = 2;
                                            }
                                            g(c0087m, i27, i28, i29, 0);
                                        }
                                        int iC7 = c0087m.c();
                                        int i10117 = a;
                                        int i10118 = i10117 ^ 113;
                                        int i10119 = -(-((i10117 & 113) << 1));
                                        int i101110 = (i10118 ^ i10119) + ((i10119 & i10118) << 1);
                                        b = i101110 % 128;
                                        int i111110 = i101110 % 2;
                                        g(c0087m, 1, (int) ((iC7 * c0087m.Q) + 0.5f), 1, iC7);
                                        c0087m.g.i.e(c0087m.p());
                                        C0015y c0015y6 = c0087m.i.i;
                                        int i111111 = b;
                                        int i111112 = i111111 & 29;
                                        int i111113 = -(-(i111111 | 29));
                                        int i111114 = ((i111112 | i111113) << 1) - (i111113 ^ i111112);
                                        a = i111114 % 128;
                                        int i111115 = i111114 % 2;
                                        c0015y6.e(c0087m.c());
                                        c0087m.d = true;
                                    } else if (i91 == 1) {
                                        int i111116 = b;
                                        int i111117 = i111116 & 115;
                                        int i111118 = (i111116 | 115) & (~i111117);
                                        int i111119 = i111117 << 1;
                                        i33 = ((i111118 | i111119) << 1) - (i111118 ^ i111119);
                                        a = i33 % 128;
                                        if (i33 % 2 == 0) {
                                            i34 = 2;
                                            i35 = 0;
                                            i36 = 1;
                                        } else {
                                            i34 = 2;
                                            i35 = 0;
                                            i36 = 0;
                                        }
                                        g(c0087m, i34, i35, i2, i36);
                                        c0087m.g.i.f41o = c0087m.p();
                                        int i121110 = a;
                                        int i121111 = (-2) - ((-1) ^ ((i121110 & 50) + (i121110 | 50)));
                                        b = i121111 % 128;
                                        int i121112 = i121111 % 2;
                                    } else if (i91 == 2) {
                                        int i121113 = a;
                                        int i121114 = (i121113 & (-2)) | ((~i121113) & 1);
                                        int i121115 = (i121113 & 1) << 1;
                                        int i121116 = (i121114 & i121115) + (i121115 | i121114);
                                        b = i121116 % 128;
                                        int i121117 = i121116 % 2;
                                        i30 = o2.M[0];
                                        if (i30 != 1) {
                                            int i121118 = a;
                                            int i121119 = i121118 ^ 83;
                                            int i131110 = ((i121118 & 83) | i121119) << 1;
                                            int i131111 = -i121119;
                                            int i131112 = (i131110 & i131111) + (i131110 | i131111);
                                            b = i131112 % 128;
                                            int i131113 = i131112 % 2;
                                            if (i30 != 4) {
                                                i7 = 3;
                                            }
                                        }
                                        int iP11 = (int) ((f3 * o2.p()) + 0.5f);
                                        int i131114 = a;
                                        int i131115 = ((i131114 ^ 15) | (i131114 & 15)) << 1;
                                        int i131116 = -(((~i131114) & 15) | (i131114 & (-16)));
                                        int i131117 = (i131115 ^ i131116) + ((i131116 & i131115) << 1);
                                        b = i131117 % 128;
                                        int i131118 = i131117 % 2;
                                        g(c0087m, 1, iP11, i2, c0087m.c());
                                        d = c0087m.g;
                                        int i131119 = b;
                                        int i14111 = i131119 & 57;
                                        int i14112 = i131119 | 57;
                                        i31 = (i14111 & i14112) + (i14112 | i14111);
                                        a = i31 % 128;
                                        if (i31 % 2 == 0) {
                                            d.i.e(c0087m.p());
                                            int i14113 = 42 / 0;
                                        } else {
                                            d.i.e(c0087m.p());
                                        }
                                        c0087m.i.i.e(c0087m.c());
                                        c0087m.d = true;
                                    } else {
                                        nArr2 = c0087m.K;
                                        if (nArr2[0].f != null) {
                                        }
                                        g(c0087m, 2, 0, i2, 0);
                                        c0087m.g.i.e(c0087m.p());
                                        c0087m.i.i.e(c0087m.c());
                                        c0087m.d = true;
                                        int i14114 = a;
                                        int i14115 = (i14114 | 115) << 1;
                                        int i14116 = -((115 & (~i14114)) | (i14114 & (-116)));
                                        i32 = ((i14115 | i14116) << 1) - (i14116 ^ i14115);
                                        b = i32 % 128;
                                        if (i32 % 2 != 0) {
                                            int i14117 = 3 % 4;
                                        }
                                    }
                                }
                                if (i2 == i7) {
                                    i14 = a;
                                    int i1520 = (i14 & 7) + (i14 | 7);
                                    b = i1520 % 128;
                                    int i1521 = i1520 % 2;
                                    if (i != 2) {
                                        int i1522 = i14 & 25;
                                        int i1523 = -(-(i14 | 25));
                                        i24 = (i1522 ^ i1523) + ((i1522 & i1523) << 1);
                                        b = i24 % 128;
                                        if (i24 % 2 != 0) {
                                            if (i == 0) {
                                                if (i92 == 3) {
                                                    int i15112 = i14 + 39;
                                                    b = i15112 % 128;
                                                    int i15113 = i15112 % 2;
                                                    if (i == 2) {
                                                        g(c0087m, 2, 0, 2, 0);
                                                        int i15114 = b;
                                                        int i15115 = ((i15114 | 117) << 1) - (((~i15114) & 117) | (i15114 & (-118)));
                                                        a = i15115 % 128;
                                                        int i15116 = i15115 % 2;
                                                    }
                                                    int iP12 = c0087m.p();
                                                    f2 = c0087m.Q;
                                                    int i15117 = a;
                                                    int i161110 = i15117 ^ 99;
                                                    int i161111 = ((i15117 & 99) | i161110) << 1;
                                                    int i161112 = -i161110;
                                                    int i161113 = (i161111 ^ i161112) + ((i161111 & i161112) << 1);
                                                    b = i161113 % 128;
                                                    int i161114 = i161113 % 2;
                                                    if (c0087m.R == -1) {
                                                        f2 = 1.0f / f2;
                                                    }
                                                    g(c0087m, 1, iP12, 1, (int) ((iP12 * f2) + 0.5f));
                                                    c0087m.g.i.e(c0087m.p());
                                                    int i161115 = a + 21;
                                                    b = i161115 % 128;
                                                    int i161116 = i161115 % 2;
                                                    c0087m.i.i.e(c0087m.c());
                                                    c0087m.d = true;
                                                } else if (i92 == 1) {
                                                    int i161117 = i14 & 5;
                                                    int i161118 = (i14 ^ 5) | i161117;
                                                    i20 = ((i161117 | i161118) << 1) - (i161117 ^ i161118);
                                                    b = i20 % 128;
                                                    if (i20 % 2 != 0) {
                                                        i21 = 1;
                                                        i22 = 4;
                                                        i23 = 1;
                                                    } else {
                                                        i21 = 0;
                                                        i22 = 2;
                                                        i23 = 0;
                                                    }
                                                    g(c0087m, i, i21, i22, i23);
                                                    c0087m.i.i.f41o = c0087m.c();
                                                } else if (i92 == 2) {
                                                    int i161119 = ((i14 ^ 65) | (i14 & 65)) << 1;
                                                    int i1712 = -((65 & (~i14)) | (i14 & (-66)));
                                                    i15 = (i161119 ^ i1712) + ((i1712 & i161119) << 1);
                                                    b = i15 % 128;
                                                    if (i15 % 2 != 0) {
                                                        iArr = o2.M;
                                                        if (iArr[1] != 0) {
                                                            if (iArr[1] == 4) {
                                                            }
                                                        }
                                                    } else {
                                                        iArr = o2.M;
                                                        if (iArr[1] != 1) {
                                                            if (iArr[1] == 4) {
                                                            }
                                                        }
                                                    }
                                                    iP2 = c0087m.p();
                                                    fC = o2.c();
                                                    int i1713 = b;
                                                    i16 = ((i1713 | 33) << 1) - (i1713 ^ 33);
                                                    int i1714 = i16 % 128;
                                                    a = i1714;
                                                    if (i16 % 2 == 0) {
                                                        f = f4 + fC;
                                                    } else {
                                                        f = f4 * fC;
                                                    }
                                                    i17 = (int) (f + 0.5f);
                                                    int i1715 = i1714 & 63;
                                                    i18 = i1715 + ((i1714 ^ 63) | i1715);
                                                    b = i18 % 128;
                                                    if (i18 % 2 != 0) {
                                                        g(c0087m, i, iP2, 0, i17);
                                                    } else {
                                                        g(c0087m, i, iP2, 1, i17);
                                                    }
                                                    c0087m.g.i.e(c0087m.p());
                                                    c0087m.i.i.e(c0087m.c());
                                                    i19 = a + 35;
                                                    b = i19 % 128;
                                                    if (i19 % 2 != 0) {
                                                        c0087m.d = false;
                                                    } else {
                                                        c0087m.d = true;
                                                    }
                                                } else {
                                                    nArr = c0087m.K;
                                                    if (nArr[2].f != null) {
                                                    }
                                                    g(c0087m, 2, 0, i2, 0);
                                                    c0087m.g.i.e(c0087m.p());
                                                    c0087m.i.i.e(c0087m.c());
                                                    c0087m.d = true;
                                                }
                                            }
                                        } else if (i == 1) {
                                            if (i92 == 3) {
                                                int i15118 = i14 + 39;
                                                b = i15118 % 128;
                                                int i15119 = i15118 % 2;
                                                if (i == 2) {
                                                    g(c0087m, 2, 0, 2, 0);
                                                    int i151110 = b;
                                                    int i151111 = ((i151110 | 117) << 1) - (((~i151110) & 117) | (i151110 & (-118)));
                                                    a = i151111 % 128;
                                                    int i151112 = i151111 % 2;
                                                }
                                                int iP13 = c0087m.p();
                                                f2 = c0087m.Q;
                                                int i151113 = a;
                                                int i1611110 = i151113 ^ 99;
                                                int i1611111 = ((i151113 & 99) | i1611110) << 1;
                                                int i1611112 = -i1611110;
                                                int i1611113 = (i1611111 ^ i1611112) + ((i1611111 & i1611112) << 1);
                                                b = i1611113 % 128;
                                                int i1611114 = i1611113 % 2;
                                                if (c0087m.R == -1) {
                                                    f2 = 1.0f / f2;
                                                }
                                                g(c0087m, 1, iP13, 1, (int) ((iP13 * f2) + 0.5f));
                                                c0087m.g.i.e(c0087m.p());
                                                int i1611115 = a + 21;
                                                b = i1611115 % 128;
                                                int i1611116 = i1611115 % 2;
                                                c0087m.i.i.e(c0087m.c());
                                                c0087m.d = true;
                                            } else if (i92 == 1) {
                                                int i1611117 = i14 & 5;
                                                int i1611118 = (i14 ^ 5) | i1611117;
                                                i20 = ((i1611117 | i1611118) << 1) - (i1611117 ^ i1611118);
                                                b = i20 % 128;
                                                if (i20 % 2 != 0) {
                                                    i21 = 1;
                                                    i22 = 4;
                                                    i23 = 1;
                                                } else {
                                                    i21 = 0;
                                                    i22 = 2;
                                                    i23 = 0;
                                                }
                                                g(c0087m, i, i21, i22, i23);
                                                c0087m.i.i.f41o = c0087m.c();
                                            } else if (i92 == 2) {
                                                int i1611119 = ((i14 ^ 65) | (i14 & 65)) << 1;
                                                int i1716 = -((65 & (~i14)) | (i14 & (-66)));
                                                i15 = (i1611119 ^ i1716) + ((i1716 & i1611119) << 1);
                                                b = i15 % 128;
                                                if (i15 % 2 != 0) {
                                                    iArr = o2.M;
                                                    if (iArr[1] != 0) {
                                                        if (iArr[1] == 4) {
                                                        }
                                                    }
                                                } else {
                                                    iArr = o2.M;
                                                    if (iArr[1] != 1) {
                                                        if (iArr[1] == 4) {
                                                        }
                                                    }
                                                }
                                                iP2 = c0087m.p();
                                                fC = o2.c();
                                                int i1717 = b;
                                                i16 = ((i1717 | 33) << 1) - (i1717 ^ 33);
                                                int i1718 = i16 % 128;
                                                a = i1718;
                                                if (i16 % 2 == 0) {
                                                    f = f4 + fC;
                                                } else {
                                                    f = f4 * fC;
                                                }
                                                i17 = (int) (f + 0.5f);
                                                int i1719 = i1718 & 63;
                                                i18 = i1719 + ((i1718 ^ 63) | i1719);
                                                b = i18 % 128;
                                                if (i18 % 2 != 0) {
                                                    g(c0087m, i, iP2, 0, i17);
                                                } else {
                                                    g(c0087m, i, iP2, 1, i17);
                                                }
                                                c0087m.g.i.e(c0087m.p());
                                                c0087m.i.i.e(c0087m.c());
                                                i19 = a + 35;
                                                b = i19 % 128;
                                                if (i19 % 2 != 0) {
                                                    c0087m.d = false;
                                                } else {
                                                    c0087m.d = true;
                                                }
                                            } else {
                                                nArr = c0087m.K;
                                                if (nArr[2].f != null) {
                                                }
                                                g(c0087m, 2, 0, i2, 0);
                                                c0087m.g.i.e(c0087m.p());
                                                c0087m.i.i.e(c0087m.c());
                                                c0087m.d = true;
                                            }
                                        }
                                        i8 = 3;
                                    } else if (i92 == 3) {
                                        int i151114 = i14 + 39;
                                        b = i151114 % 128;
                                        int i151115 = i151114 % 2;
                                        if (i == 2) {
                                            g(c0087m, 2, 0, 2, 0);
                                            int i151116 = b;
                                            int i151117 = ((i151116 | 117) << 1) - (((~i151116) & 117) | (i151116 & (-118)));
                                            a = i151117 % 128;
                                            int i151118 = i151117 % 2;
                                        }
                                        int iP14 = c0087m.p();
                                        f2 = c0087m.Q;
                                        int i151119 = a;
                                        int i16111110 = i151119 ^ 99;
                                        int i16111111 = ((i151119 & 99) | i16111110) << 1;
                                        int i16111112 = -i16111110;
                                        int i16111113 = (i16111111 ^ i16111112) + ((i16111111 & i16111112) << 1);
                                        b = i16111113 % 128;
                                        int i16111114 = i16111113 % 2;
                                        if (c0087m.R == -1) {
                                            f2 = 1.0f / f2;
                                        }
                                        g(c0087m, 1, iP14, 1, (int) ((iP14 * f2) + 0.5f));
                                        c0087m.g.i.e(c0087m.p());
                                        int i16111115 = a + 21;
                                        b = i16111115 % 128;
                                        int i16111116 = i16111115 % 2;
                                        c0087m.i.i.e(c0087m.c());
                                        c0087m.d = true;
                                    } else if (i92 == 1) {
                                        int i16111117 = i14 & 5;
                                        int i16111118 = (i14 ^ 5) | i16111117;
                                        i20 = ((i16111117 | i16111118) << 1) - (i16111117 ^ i16111118);
                                        b = i20 % 128;
                                        if (i20 % 2 != 0) {
                                            i21 = 1;
                                            i22 = 4;
                                            i23 = 1;
                                        } else {
                                            i21 = 0;
                                            i22 = 2;
                                            i23 = 0;
                                        }
                                        g(c0087m, i, i21, i22, i23);
                                        c0087m.i.i.f41o = c0087m.c();
                                    } else if (i92 == 2) {
                                        int i16111119 = ((i14 ^ 65) | (i14 & 65)) << 1;
                                        int i17110 = -((65 & (~i14)) | (i14 & (-66)));
                                        i15 = (i16111119 ^ i17110) + ((i17110 & i16111119) << 1);
                                        b = i15 % 128;
                                        if (i15 % 2 != 0) {
                                            iArr = o2.M;
                                            if (iArr[1] != 0) {
                                                if (iArr[1] == 4) {
                                                    i8 = 3;
                                                }
                                            }
                                        } else {
                                            iArr = o2.M;
                                            if (iArr[1] != 1) {
                                                if (iArr[1] == 4) {
                                                    i8 = 3;
                                                }
                                            }
                                        }
                                        iP2 = c0087m.p();
                                        fC = o2.c();
                                        int i17111 = b;
                                        i16 = ((i17111 | 33) << 1) - (i17111 ^ 33);
                                        int i17112 = i16 % 128;
                                        a = i17112;
                                        if (i16 % 2 == 0) {
                                            f = f4 + fC;
                                        } else {
                                            f = f4 * fC;
                                        }
                                        i17 = (int) (f + 0.5f);
                                        int i17113 = i17112 & 63;
                                        i18 = i17113 + ((i17112 ^ 63) | i17113);
                                        b = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            g(c0087m, i, iP2, 0, i17);
                                        } else {
                                            g(c0087m, i, iP2, 1, i17);
                                        }
                                        c0087m.g.i.e(c0087m.p());
                                        c0087m.i.i.e(c0087m.c());
                                        i19 = a + 35;
                                        b = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            c0087m.d = false;
                                        } else {
                                            c0087m.d = true;
                                        }
                                    } else {
                                        nArr = c0087m.K;
                                        if (nArr[2].f != null) {
                                        }
                                        g(c0087m, 2, 0, i2, 0);
                                        c0087m.g.i.e(c0087m.p());
                                        c0087m.i.i.e(c0087m.c());
                                        c0087m.d = true;
                                    }
                                } else {
                                    i8 = i7;
                                }
                                if (i == i8) {
                                    int i1815 = a;
                                    int i1816 = (i1815 & (-92)) | ((~i1815) & 91);
                                    int i1817 = (i1815 & 91) << 1;
                                    i9 = ((i1816 | i1817) << 1) - (i1817 ^ i1816);
                                    int i1818 = i9 % 128;
                                    b = i1818;
                                    if (i9 % 2 != 0) {
                                        if (i2 == 2) {
                                            if (i91 != 1) {
                                            }
                                            g(c0087m, 2, 0, 2, 0);
                                            c0015y = c0087m.g.i;
                                            int i1819 = a;
                                            i10 = (i1819 ^ 5) + ((i1819 & 5) << 1);
                                            b = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                c0015y.f41o = c0087m.p();
                                                c0015y2 = c0087m.i.i;
                                                int i18110 = 14 / 0;
                                            } else {
                                                c0015y.f41o = c0087m.p();
                                                c0015y2 = c0087m.i.i;
                                            }
                                            int i18111 = a;
                                            int i18112 = (((i18111 & (-68)) | ((~i18111) & 67)) - (~((i18111 & 67) << 1))) - 1;
                                            b = i18112 % 128;
                                            int i18113 = i18112 % 2;
                                            c0015y2.f41o = c0087m.c();
                                        }
                                    } else if (i2 == 3) {
                                        if (i91 != 1) {
                                        }
                                        g(c0087m, 2, 0, 2, 0);
                                        c0015y = c0087m.g.i;
                                        int i18114 = a;
                                        i10 = (i18114 ^ 5) + ((i18114 & 5) << 1);
                                        b = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            c0015y.f41o = c0087m.p();
                                            c0015y2 = c0087m.i.i;
                                            int i18115 = 14 / 0;
                                        } else {
                                            c0015y.f41o = c0087m.p();
                                            c0015y2 = c0087m.i.i;
                                        }
                                        int i18116 = a;
                                        int i18117 = (((i18116 & (-68)) | ((~i18116) & 67)) - (~((i18116 & 67) << 1))) - 1;
                                        b = i18117 % 128;
                                        int i18118 = i18117 % 2;
                                        c0015y2.f41o = c0087m.c();
                                    }
                                }
                            }
                        }
                        iP = c0087m.p();
                        if (i == 4) {
                            int iP15 = o2.p();
                            int i200 = -(~(-c0087m.B.h));
                            i3 = ((((iP15 | i200) << 1) - (iP15 ^ i200)) - 1) - c0087m.C.h;
                            i4 = 1;
                        } else {
                            i3 = iP;
                            i4 = i;
                        }
                        iC = c0087m.c();
                        if (i2 == 4) {
                            int iC8 = o2.c();
                            int i201 = -c0087m.A.h;
                            int i202 = iC8 ^ i201;
                            int i203 = ((iC8 & i201) | i202) << 1;
                            int i204 = -i202;
                            int i205 = (i203 & i204) + (i203 | i204);
                            int i206 = -c0087m.E.h;
                            int i207 = i205 & i206;
                            i5 = (((i206 | i205) & (~i207)) - (~(i207 << 1))) - 1;
                            i6 = 1;
                        } else {
                            i5 = iC;
                            i6 = i2;
                        }
                        g(c0087m, i4, i3, i6, i5);
                        c0087m.g.i.e(c0087m.p());
                        int i208 = a + 45;
                        b = i208 % 128;
                        int i209 = i208 % 2;
                        c0087m.i.i.e(c0087m.c());
                        c0087m.d = true;
                        int i210 = a;
                        int i211 = i210 ^ 91;
                        int i212 = (((i210 & 91) | i211) << 1) - i211;
                        b = i212 % 128;
                        int i213 = i212 % 2;
                    } else {
                        int i214 = i96 + 9;
                        a = i214 % 128;
                        if (i214 % 2 == 0) {
                            if (i == 5) {
                                if (i2 == 4) {
                                }
                                iP = c0087m.p();
                                if (i == 4) {
                                    int iP16 = o2.p();
                                    int i2010 = -(~(-c0087m.B.h));
                                    i3 = ((((iP16 | i2010) << 1) - (iP16 ^ i2010)) - 1) - c0087m.C.h;
                                    i4 = 1;
                                } else {
                                    i3 = iP;
                                    i4 = i;
                                }
                                iC = c0087m.c();
                                if (i2 == 4) {
                                    int iC9 = o2.c();
                                    int i2011 = -c0087m.A.h;
                                    int i2012 = iC9 ^ i2011;
                                    int i2013 = ((iC9 & i2011) | i2012) << 1;
                                    int i2014 = -i2012;
                                    int i2015 = (i2013 & i2014) + (i2013 | i2014);
                                    int i2016 = -c0087m.E.h;
                                    int i2017 = i2015 & i2016;
                                    i5 = (((i2016 | i2015) & (~i2017)) - (~(i2017 << 1))) - 1;
                                    i6 = 1;
                                } else {
                                    i5 = iC;
                                    i6 = i2;
                                }
                                g(c0087m, i4, i3, i6, i5);
                                c0087m.g.i.e(c0087m.p());
                                int i2018 = a + 45;
                                b = i2018 % 128;
                                int i2019 = i2018 % 2;
                                c0087m.i.i.e(c0087m.c());
                                c0087m.d = true;
                                int i215 = a;
                                int i216 = i215 ^ 91;
                                int i217 = (((i215 & 91) | i216) << 1) - i216;
                                b = i217 % 128;
                                int i218 = i217 % 2;
                            }
                        } else if (i == 2) {
                            if (i2 == 4) {
                            }
                            iP = c0087m.p();
                            if (i == 4) {
                                int iP17 = o2.p();
                                int i20110 = -(~(-c0087m.B.h));
                                i3 = ((((iP17 | i20110) << 1) - (iP17 ^ i20110)) - 1) - c0087m.C.h;
                                i4 = 1;
                            } else {
                                i3 = iP;
                                i4 = i;
                            }
                            iC = c0087m.c();
                            if (i2 == 4) {
                                int iC10 = o2.c();
                                int i20111 = -c0087m.A.h;
                                int i20112 = iC10 ^ i20111;
                                int i20113 = ((iC10 & i20111) | i20112) << 1;
                                int i20114 = -i20112;
                                int i20115 = (i20113 & i20114) + (i20113 | i20114);
                                int i20116 = -c0087m.E.h;
                                int i20117 = i20115 & i20116;
                                i5 = (((i20116 | i20115) & (~i20117)) - (~(i20117 << 1))) - 1;
                                i6 = 1;
                            } else {
                                i5 = iC;
                                i6 = i2;
                            }
                            g(c0087m, i4, i3, i6, i5);
                            c0087m.g.i.e(c0087m.p());
                            int i20118 = a + 45;
                            b = i20118 % 128;
                            int i20119 = i20118 % 2;
                            c0087m.i.i.e(c0087m.c());
                            c0087m.d = true;
                            int i219 = a;
                            int i2110 = i219 ^ 91;
                            int i2111 = (((i219 & 91) | i2110) << 1) - i2110;
                            b = i2111 % 128;
                            int i2112 = i2111 % 2;
                        }
                        i7 = 3;
                        if (i == 3) {
                            if (i2 != 2) {
                                int i10120 = b;
                                int i10121 = (i10120 ^ 75) + ((i10120 & 75) << 1);
                                a = i10121 % 128;
                                int i10122 = i10121 % 2;
                                if (i2 == 1) {
                                    if (i91 == 3) {
                                        i25 = b;
                                        int i101111 = (i25 & 87) + (i25 | 87);
                                        a = i101111 % 128;
                                        int i101112 = i101111 % 2;
                                        if (i2 == 2) {
                                            i26 = i25 + 71;
                                            a = i26 % 128;
                                            if (i26 % 2 == 0) {
                                                i27 = 4;
                                                i28 = 0;
                                                i29 = 5;
                                            } else {
                                                i27 = 2;
                                                i28 = 0;
                                                i29 = 2;
                                            }
                                            g(c0087m, i27, i28, i29, 0);
                                        }
                                        int iC11 = c0087m.c();
                                        int i101113 = a;
                                        int i101114 = i101113 ^ 113;
                                        int i101115 = -(-((i101113 & 113) << 1));
                                        int i101116 = (i101114 ^ i101115) + ((i101115 & i101114) << 1);
                                        b = i101116 % 128;
                                        int i1111110 = i101116 % 2;
                                        g(c0087m, 1, (int) ((iC11 * c0087m.Q) + 0.5f), 1, iC11);
                                        c0087m.g.i.e(c0087m.p());
                                        C0015y c0015y7 = c0087m.i.i;
                                        int i1111111 = b;
                                        int i1111112 = i1111111 & 29;
                                        int i1111113 = -(-(i1111111 | 29));
                                        int i1111114 = ((i1111112 | i1111113) << 1) - (i1111113 ^ i1111112);
                                        a = i1111114 % 128;
                                        int i1111115 = i1111114 % 2;
                                        c0015y7.e(c0087m.c());
                                        c0087m.d = true;
                                    } else if (i91 == 1) {
                                        int i1111116 = b;
                                        int i1111117 = i1111116 & 115;
                                        int i1111118 = (i1111116 | 115) & (~i1111117);
                                        int i1111119 = i1111117 << 1;
                                        i33 = ((i1111118 | i1111119) << 1) - (i1111118 ^ i1111119);
                                        a = i33 % 128;
                                        if (i33 % 2 == 0) {
                                            i34 = 2;
                                            i35 = 0;
                                            i36 = 1;
                                        } else {
                                            i34 = 2;
                                            i35 = 0;
                                            i36 = 0;
                                        }
                                        g(c0087m, i34, i35, i2, i36);
                                        c0087m.g.i.f41o = c0087m.p();
                                        int i1211110 = a;
                                        int i1211111 = (-2) - ((-1) ^ ((i1211110 & 50) + (i1211110 | 50)));
                                        b = i1211111 % 128;
                                        int i1211112 = i1211111 % 2;
                                    } else if (i91 == 2) {
                                        int i1211113 = a;
                                        int i1211114 = (i1211113 & (-2)) | ((~i1211113) & 1);
                                        int i1211115 = (i1211113 & 1) << 1;
                                        int i1211116 = (i1211114 & i1211115) + (i1211115 | i1211114);
                                        b = i1211116 % 128;
                                        int i1211117 = i1211116 % 2;
                                        i30 = o2.M[0];
                                        if (i30 != 1) {
                                            int i1211118 = a;
                                            int i1211119 = i1211118 ^ 83;
                                            int i1311110 = ((i1211118 & 83) | i1211119) << 1;
                                            int i1311111 = -i1211119;
                                            int i1311112 = (i1311110 & i1311111) + (i1311110 | i1311111);
                                            b = i1311112 % 128;
                                            int i1311113 = i1311112 % 2;
                                            if (i30 != 4) {
                                            }
                                        }
                                        int iP18 = (int) ((f3 * o2.p()) + 0.5f);
                                        int i1311114 = a;
                                        int i1311115 = ((i1311114 ^ 15) | (i1311114 & 15)) << 1;
                                        int i1311116 = -(((~i1311114) & 15) | (i1311114 & (-16)));
                                        int i1311117 = (i1311115 ^ i1311116) + ((i1311116 & i1311115) << 1);
                                        b = i1311117 % 128;
                                        int i1311118 = i1311117 % 2;
                                        g(c0087m, 1, iP18, i2, c0087m.c());
                                        d = c0087m.g;
                                        int i1311119 = b;
                                        int i14118 = i1311119 & 57;
                                        int i14119 = i1311119 | 57;
                                        i31 = (i14118 & i14119) + (i14119 | i14118);
                                        a = i31 % 128;
                                        if (i31 % 2 == 0) {
                                            d.i.e(c0087m.p());
                                            int i141110 = 42 / 0;
                                        } else {
                                            d.i.e(c0087m.p());
                                        }
                                        c0087m.i.i.e(c0087m.c());
                                        c0087m.d = true;
                                    } else {
                                        nArr2 = c0087m.K;
                                        if (nArr2[0].f != null) {
                                        }
                                        g(c0087m, 2, 0, i2, 0);
                                        c0087m.g.i.e(c0087m.p());
                                        c0087m.i.i.e(c0087m.c());
                                        c0087m.d = true;
                                        int i141111 = a;
                                        int i141112 = (i141111 | 115) << 1;
                                        int i141113 = -((115 & (~i141111)) | (i141111 & (-116)));
                                        i32 = ((i141112 | i141113) << 1) - (i141113 ^ i141112);
                                        b = i32 % 128;
                                        if (i32 % 2 != 0) {
                                            int i141114 = 3 % 4;
                                        }
                                    }
                                }
                                i7 = 3;
                            } else if (i91 == 3) {
                                i25 = b;
                                int i101117 = (i25 & 87) + (i25 | 87);
                                a = i101117 % 128;
                                int i101118 = i101117 % 2;
                                if (i2 == 2) {
                                    i26 = i25 + 71;
                                    a = i26 % 128;
                                    if (i26 % 2 == 0) {
                                        i27 = 4;
                                        i28 = 0;
                                        i29 = 5;
                                    } else {
                                        i27 = 2;
                                        i28 = 0;
                                        i29 = 2;
                                    }
                                    g(c0087m, i27, i28, i29, 0);
                                }
                                int iC12 = c0087m.c();
                                int i101119 = a;
                                int i1011110 = i101119 ^ 113;
                                int i1011111 = -(-((i101119 & 113) << 1));
                                int i1011112 = (i1011110 ^ i1011111) + ((i1011111 & i1011110) << 1);
                                b = i1011112 % 128;
                                int i11111110 = i1011112 % 2;
                                g(c0087m, 1, (int) ((iC12 * c0087m.Q) + 0.5f), 1, iC12);
                                c0087m.g.i.e(c0087m.p());
                                C0015y c0015y8 = c0087m.i.i;
                                int i11111111 = b;
                                int i11111112 = i11111111 & 29;
                                int i11111113 = -(-(i11111111 | 29));
                                int i11111114 = ((i11111112 | i11111113) << 1) - (i11111113 ^ i11111112);
                                a = i11111114 % 128;
                                int i11111115 = i11111114 % 2;
                                c0015y8.e(c0087m.c());
                                c0087m.d = true;
                            } else if (i91 == 1) {
                                int i11111116 = b;
                                int i11111117 = i11111116 & 115;
                                int i11111118 = (i11111116 | 115) & (~i11111117);
                                int i11111119 = i11111117 << 1;
                                i33 = ((i11111118 | i11111119) << 1) - (i11111118 ^ i11111119);
                                a = i33 % 128;
                                if (i33 % 2 == 0) {
                                    i34 = 2;
                                    i35 = 0;
                                    i36 = 1;
                                } else {
                                    i34 = 2;
                                    i35 = 0;
                                    i36 = 0;
                                }
                                g(c0087m, i34, i35, i2, i36);
                                c0087m.g.i.f41o = c0087m.p();
                                int i12111110 = a;
                                int i12111111 = (-2) - ((-1) ^ ((i12111110 & 50) + (i12111110 | 50)));
                                b = i12111111 % 128;
                                int i12111112 = i12111111 % 2;
                            } else if (i91 == 2) {
                                int i12111113 = a;
                                int i12111114 = (i12111113 & (-2)) | ((~i12111113) & 1);
                                int i12111115 = (i12111113 & 1) << 1;
                                int i12111116 = (i12111114 & i12111115) + (i12111115 | i12111114);
                                b = i12111116 % 128;
                                int i12111117 = i12111116 % 2;
                                i30 = o2.M[0];
                                if (i30 != 1) {
                                    int i12111118 = a;
                                    int i12111119 = i12111118 ^ 83;
                                    int i13111110 = ((i12111118 & 83) | i12111119) << 1;
                                    int i13111111 = -i12111119;
                                    int i13111112 = (i13111110 & i13111111) + (i13111110 | i13111111);
                                    b = i13111112 % 128;
                                    int i13111113 = i13111112 % 2;
                                    if (i30 != 4) {
                                        i7 = 3;
                                    }
                                }
                                int iP19 = (int) ((f3 * o2.p()) + 0.5f);
                                int i13111114 = a;
                                int i13111115 = ((i13111114 ^ 15) | (i13111114 & 15)) << 1;
                                int i13111116 = -(((~i13111114) & 15) | (i13111114 & (-16)));
                                int i13111117 = (i13111115 ^ i13111116) + ((i13111116 & i13111115) << 1);
                                b = i13111117 % 128;
                                int i13111118 = i13111117 % 2;
                                g(c0087m, 1, iP19, i2, c0087m.c());
                                d = c0087m.g;
                                int i13111119 = b;
                                int i141115 = i13111119 & 57;
                                int i141116 = i13111119 | 57;
                                i31 = (i141115 & i141116) + (i141116 | i141115);
                                a = i31 % 128;
                                if (i31 % 2 == 0) {
                                    d.i.e(c0087m.p());
                                    int i141117 = 42 / 0;
                                } else {
                                    d.i.e(c0087m.p());
                                }
                                c0087m.i.i.e(c0087m.c());
                                c0087m.d = true;
                            } else {
                                nArr2 = c0087m.K;
                                if (nArr2[0].f != null) {
                                }
                                g(c0087m, 2, 0, i2, 0);
                                c0087m.g.i.e(c0087m.p());
                                c0087m.i.i.e(c0087m.c());
                                c0087m.d = true;
                                int i141118 = a;
                                int i141119 = (i141118 | 115) << 1;
                                int i1411110 = -((115 & (~i141118)) | (i141118 & (-116)));
                                i32 = ((i141119 | i1411110) << 1) - (i1411110 ^ i141119);
                                b = i32 % 128;
                                if (i32 % 2 != 0) {
                                    int i1411111 = 3 % 4;
                                }
                            }
                        }
                        if (i2 == i7) {
                            i14 = a;
                            int i1524 = (i14 & 7) + (i14 | 7);
                            b = i1524 % 128;
                            int i1525 = i1524 % 2;
                            if (i != 2) {
                                int i1526 = i14 & 25;
                                int i1527 = -(-(i14 | 25));
                                i24 = (i1526 ^ i1527) + ((i1526 & i1527) << 1);
                                b = i24 % 128;
                                if (i24 % 2 != 0) {
                                    if (i == 0) {
                                        if (i92 == 3) {
                                            int i1511110 = i14 + 39;
                                            b = i1511110 % 128;
                                            int i1511111 = i1511110 % 2;
                                            if (i == 2) {
                                                g(c0087m, 2, 0, 2, 0);
                                                int i1511112 = b;
                                                int i1511113 = ((i1511112 | 117) << 1) - (((~i1511112) & 117) | (i1511112 & (-118)));
                                                a = i1511113 % 128;
                                                int i1511114 = i1511113 % 2;
                                            }
                                            int iP110 = c0087m.p();
                                            f2 = c0087m.Q;
                                            int i1511115 = a;
                                            int i161111110 = i1511115 ^ 99;
                                            int i161111111 = ((i1511115 & 99) | i161111110) << 1;
                                            int i161111112 = -i161111110;
                                            int i161111113 = (i161111111 ^ i161111112) + ((i161111111 & i161111112) << 1);
                                            b = i161111113 % 128;
                                            int i161111114 = i161111113 % 2;
                                            if (c0087m.R == -1) {
                                                f2 = 1.0f / f2;
                                            }
                                            g(c0087m, 1, iP110, 1, (int) ((iP110 * f2) + 0.5f));
                                            c0087m.g.i.e(c0087m.p());
                                            int i161111115 = a + 21;
                                            b = i161111115 % 128;
                                            int i161111116 = i161111115 % 2;
                                            c0087m.i.i.e(c0087m.c());
                                            c0087m.d = true;
                                        } else if (i92 == 1) {
                                            int i161111117 = i14 & 5;
                                            int i161111118 = (i14 ^ 5) | i161111117;
                                            i20 = ((i161111117 | i161111118) << 1) - (i161111117 ^ i161111118);
                                            b = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                i21 = 1;
                                                i22 = 4;
                                                i23 = 1;
                                            } else {
                                                i21 = 0;
                                                i22 = 2;
                                                i23 = 0;
                                            }
                                            g(c0087m, i, i21, i22, i23);
                                            c0087m.i.i.f41o = c0087m.c();
                                        } else if (i92 == 2) {
                                            int i161111119 = ((i14 ^ 65) | (i14 & 65)) << 1;
                                            int i17114 = -((65 & (~i14)) | (i14 & (-66)));
                                            i15 = (i161111119 ^ i17114) + ((i17114 & i161111119) << 1);
                                            b = i15 % 128;
                                            if (i15 % 2 != 0) {
                                                iArr = o2.M;
                                                if (iArr[1] != 0) {
                                                    if (iArr[1] == 4) {
                                                    }
                                                }
                                            } else {
                                                iArr = o2.M;
                                                if (iArr[1] != 1) {
                                                    if (iArr[1] == 4) {
                                                    }
                                                }
                                            }
                                            iP2 = c0087m.p();
                                            fC = o2.c();
                                            int i17115 = b;
                                            i16 = ((i17115 | 33) << 1) - (i17115 ^ 33);
                                            int i17116 = i16 % 128;
                                            a = i17116;
                                            if (i16 % 2 == 0) {
                                                f = f4 + fC;
                                            } else {
                                                f = f4 * fC;
                                            }
                                            i17 = (int) (f + 0.5f);
                                            int i17117 = i17116 & 63;
                                            i18 = i17117 + ((i17116 ^ 63) | i17117);
                                            b = i18 % 128;
                                            if (i18 % 2 != 0) {
                                                g(c0087m, i, iP2, 0, i17);
                                            } else {
                                                g(c0087m, i, iP2, 1, i17);
                                            }
                                            c0087m.g.i.e(c0087m.p());
                                            c0087m.i.i.e(c0087m.c());
                                            i19 = a + 35;
                                            b = i19 % 128;
                                            if (i19 % 2 != 0) {
                                                c0087m.d = false;
                                            } else {
                                                c0087m.d = true;
                                            }
                                        } else {
                                            nArr = c0087m.K;
                                            if (nArr[2].f != null) {
                                            }
                                            g(c0087m, 2, 0, i2, 0);
                                            c0087m.g.i.e(c0087m.p());
                                            c0087m.i.i.e(c0087m.c());
                                            c0087m.d = true;
                                        }
                                    }
                                } else if (i == 1) {
                                    if (i92 == 3) {
                                        int i1511116 = i14 + 39;
                                        b = i1511116 % 128;
                                        int i1511117 = i1511116 % 2;
                                        if (i == 2) {
                                            g(c0087m, 2, 0, 2, 0);
                                            int i1511118 = b;
                                            int i1511119 = ((i1511118 | 117) << 1) - (((~i1511118) & 117) | (i1511118 & (-118)));
                                            a = i1511119 % 128;
                                            int i15111110 = i1511119 % 2;
                                        }
                                        int iP111 = c0087m.p();
                                        f2 = c0087m.Q;
                                        int i15111111 = a;
                                        int i1611111110 = i15111111 ^ 99;
                                        int i1611111111 = ((i15111111 & 99) | i1611111110) << 1;
                                        int i1611111112 = -i1611111110;
                                        int i1611111113 = (i1611111111 ^ i1611111112) + ((i1611111111 & i1611111112) << 1);
                                        b = i1611111113 % 128;
                                        int i1611111114 = i1611111113 % 2;
                                        if (c0087m.R == -1) {
                                            f2 = 1.0f / f2;
                                        }
                                        g(c0087m, 1, iP111, 1, (int) ((iP111 * f2) + 0.5f));
                                        c0087m.g.i.e(c0087m.p());
                                        int i1611111115 = a + 21;
                                        b = i1611111115 % 128;
                                        int i1611111116 = i1611111115 % 2;
                                        c0087m.i.i.e(c0087m.c());
                                        c0087m.d = true;
                                    } else if (i92 == 1) {
                                        int i1611111117 = i14 & 5;
                                        int i1611111118 = (i14 ^ 5) | i1611111117;
                                        i20 = ((i1611111117 | i1611111118) << 1) - (i1611111117 ^ i1611111118);
                                        b = i20 % 128;
                                        if (i20 % 2 != 0) {
                                            i21 = 1;
                                            i22 = 4;
                                            i23 = 1;
                                        } else {
                                            i21 = 0;
                                            i22 = 2;
                                            i23 = 0;
                                        }
                                        g(c0087m, i, i21, i22, i23);
                                        c0087m.i.i.f41o = c0087m.c();
                                    } else if (i92 == 2) {
                                        int i1611111119 = ((i14 ^ 65) | (i14 & 65)) << 1;
                                        int i17118 = -((65 & (~i14)) | (i14 & (-66)));
                                        i15 = (i1611111119 ^ i17118) + ((i17118 & i1611111119) << 1);
                                        b = i15 % 128;
                                        if (i15 % 2 != 0) {
                                            iArr = o2.M;
                                            if (iArr[1] != 0) {
                                                if (iArr[1] == 4) {
                                                }
                                            }
                                        } else {
                                            iArr = o2.M;
                                            if (iArr[1] != 1) {
                                                if (iArr[1] == 4) {
                                                }
                                            }
                                        }
                                        iP2 = c0087m.p();
                                        fC = o2.c();
                                        int i17119 = b;
                                        i16 = ((i17119 | 33) << 1) - (i17119 ^ 33);
                                        int i171110 = i16 % 128;
                                        a = i171110;
                                        if (i16 % 2 == 0) {
                                            f = f4 + fC;
                                        } else {
                                            f = f4 * fC;
                                        }
                                        i17 = (int) (f + 0.5f);
                                        int i171111 = i171110 & 63;
                                        i18 = i171111 + ((i171110 ^ 63) | i171111);
                                        b = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            g(c0087m, i, iP2, 0, i17);
                                        } else {
                                            g(c0087m, i, iP2, 1, i17);
                                        }
                                        c0087m.g.i.e(c0087m.p());
                                        c0087m.i.i.e(c0087m.c());
                                        i19 = a + 35;
                                        b = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            c0087m.d = false;
                                        } else {
                                            c0087m.d = true;
                                        }
                                    } else {
                                        nArr = c0087m.K;
                                        if (nArr[2].f != null) {
                                        }
                                        g(c0087m, 2, 0, i2, 0);
                                        c0087m.g.i.e(c0087m.p());
                                        c0087m.i.i.e(c0087m.c());
                                        c0087m.d = true;
                                    }
                                }
                                i8 = 3;
                            } else if (i92 == 3) {
                                int i15111112 = i14 + 39;
                                b = i15111112 % 128;
                                int i15111113 = i15111112 % 2;
                                if (i == 2) {
                                    g(c0087m, 2, 0, 2, 0);
                                    int i15111114 = b;
                                    int i15111115 = ((i15111114 | 117) << 1) - (((~i15111114) & 117) | (i15111114 & (-118)));
                                    a = i15111115 % 128;
                                    int i15111116 = i15111115 % 2;
                                }
                                int iP112 = c0087m.p();
                                f2 = c0087m.Q;
                                int i15111117 = a;
                                int i16111111110 = i15111117 ^ 99;
                                int i16111111111 = ((i15111117 & 99) | i16111111110) << 1;
                                int i16111111112 = -i16111111110;
                                int i16111111113 = (i16111111111 ^ i16111111112) + ((i16111111111 & i16111111112) << 1);
                                b = i16111111113 % 128;
                                int i16111111114 = i16111111113 % 2;
                                if (c0087m.R == -1) {
                                    f2 = 1.0f / f2;
                                }
                                g(c0087m, 1, iP112, 1, (int) ((iP112 * f2) + 0.5f));
                                c0087m.g.i.e(c0087m.p());
                                int i16111111115 = a + 21;
                                b = i16111111115 % 128;
                                int i16111111116 = i16111111115 % 2;
                                c0087m.i.i.e(c0087m.c());
                                c0087m.d = true;
                            } else if (i92 == 1) {
                                int i16111111117 = i14 & 5;
                                int i16111111118 = (i14 ^ 5) | i16111111117;
                                i20 = ((i16111111117 | i16111111118) << 1) - (i16111111117 ^ i16111111118);
                                b = i20 % 128;
                                if (i20 % 2 != 0) {
                                    i21 = 1;
                                    i22 = 4;
                                    i23 = 1;
                                } else {
                                    i21 = 0;
                                    i22 = 2;
                                    i23 = 0;
                                }
                                g(c0087m, i, i21, i22, i23);
                                c0087m.i.i.f41o = c0087m.c();
                            } else if (i92 == 2) {
                                int i16111111119 = ((i14 ^ 65) | (i14 & 65)) << 1;
                                int i171112 = -((65 & (~i14)) | (i14 & (-66)));
                                i15 = (i16111111119 ^ i171112) + ((i171112 & i16111111119) << 1);
                                b = i15 % 128;
                                if (i15 % 2 != 0) {
                                    iArr = o2.M;
                                    if (iArr[1] != 0) {
                                        if (iArr[1] == 4) {
                                            i8 = 3;
                                        }
                                    }
                                } else {
                                    iArr = o2.M;
                                    if (iArr[1] != 1) {
                                        if (iArr[1] == 4) {
                                            i8 = 3;
                                        }
                                    }
                                }
                                iP2 = c0087m.p();
                                fC = o2.c();
                                int i171113 = b;
                                i16 = ((i171113 | 33) << 1) - (i171113 ^ 33);
                                int i171114 = i16 % 128;
                                a = i171114;
                                if (i16 % 2 == 0) {
                                    f = f4 + fC;
                                } else {
                                    f = f4 * fC;
                                }
                                i17 = (int) (f + 0.5f);
                                int i171115 = i171114 & 63;
                                i18 = i171115 + ((i171114 ^ 63) | i171115);
                                b = i18 % 128;
                                if (i18 % 2 != 0) {
                                    g(c0087m, i, iP2, 0, i17);
                                } else {
                                    g(c0087m, i, iP2, 1, i17);
                                }
                                c0087m.g.i.e(c0087m.p());
                                c0087m.i.i.e(c0087m.c());
                                i19 = a + 35;
                                b = i19 % 128;
                                if (i19 % 2 != 0) {
                                    c0087m.d = false;
                                } else {
                                    c0087m.d = true;
                                }
                            } else {
                                nArr = c0087m.K;
                                if (nArr[2].f != null) {
                                }
                                g(c0087m, 2, 0, i2, 0);
                                c0087m.g.i.e(c0087m.p());
                                c0087m.i.i.e(c0087m.c());
                                c0087m.d = true;
                            }
                        } else {
                            i8 = i7;
                        }
                        if (i == i8) {
                            int i18119 = a;
                            int i18120 = (i18119 & (-92)) | ((~i18119) & 91);
                            int i18121 = (i18119 & 91) << 1;
                            i9 = ((i18120 | i18121) << 1) - (i18121 ^ i18120);
                            int i18122 = i9 % 128;
                            b = i18122;
                            if (i9 % 2 != 0) {
                                if (i2 == 2) {
                                    if (i91 != 1) {
                                    }
                                    g(c0087m, 2, 0, 2, 0);
                                    c0015y = c0087m.g.i;
                                    int i181110 = a;
                                    i10 = (i181110 ^ 5) + ((i181110 & 5) << 1);
                                    b = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        c0015y.f41o = c0087m.p();
                                        c0015y2 = c0087m.i.i;
                                        int i181111 = 14 / 0;
                                    } else {
                                        c0015y.f41o = c0087m.p();
                                        c0015y2 = c0087m.i.i;
                                    }
                                    int i181112 = a;
                                    int i181113 = (((i181112 & (-68)) | ((~i181112) & 67)) - (~((i181112 & 67) << 1))) - 1;
                                    b = i181113 % 128;
                                    int i181114 = i181113 % 2;
                                    c0015y2.f41o = c0087m.c();
                                }
                            } else if (i2 == 3) {
                                if (i91 != 1) {
                                }
                                g(c0087m, 2, 0, 2, 0);
                                c0015y = c0087m.g.i;
                                int i181115 = a;
                                i10 = (i181115 ^ 5) + ((i181115 & 5) << 1);
                                b = i10 % 128;
                                if (i10 % 2 != 0) {
                                    c0015y.f41o = c0087m.p();
                                    c0015y2 = c0087m.i.i;
                                    int i181116 = 14 / 0;
                                } else {
                                    c0015y.f41o = c0087m.p();
                                    c0015y2 = c0087m.i.i;
                                }
                                int i181117 = a;
                                int i181118 = (((i181117 & (-68)) | ((~i181117) & 67)) - (~((i181117 & 67) << 1))) - 1;
                                b = i181118 % 128;
                                int i181119 = i181118 % 2;
                                c0015y2.f41o = c0087m.c();
                            }
                        }
                    }
                } else {
                    if (i2 == 4) {
                    }
                    iP = c0087m.p();
                    if (i == 4) {
                        int iP113 = o2.p();
                        int i201110 = -(~(-c0087m.B.h));
                        i3 = ((((iP113 | i201110) << 1) - (iP113 ^ i201110)) - 1) - c0087m.C.h;
                        i4 = 1;
                    } else {
                        i3 = iP;
                        i4 = i;
                    }
                    iC = c0087m.c();
                    if (i2 == 4) {
                        int iC13 = o2.c();
                        int i201111 = -c0087m.A.h;
                        int i201112 = iC13 ^ i201111;
                        int i201113 = ((iC13 & i201111) | i201112) << 1;
                        int i201114 = -i201112;
                        int i201115 = (i201113 & i201114) + (i201113 | i201114);
                        int i201116 = -c0087m.E.h;
                        int i201117 = i201115 & i201116;
                        i5 = (((i201116 | i201115) & (~i201117)) - (~(i201117 << 1))) - 1;
                        i6 = 1;
                    } else {
                        i5 = iC;
                        i6 = i2;
                    }
                    g(c0087m, i4, i3, i6, i5);
                    c0087m.g.i.e(c0087m.p());
                    int i201118 = a + 45;
                    b = i201118 % 128;
                    int i201119 = i201118 % 2;
                    c0087m.i.i.e(c0087m.c());
                    c0087m.d = true;
                    int i2113 = a;
                    int i2114 = i2113 ^ 91;
                    int i2115 = (((i2113 & 91) | i2114) << 1) - i2114;
                    b = i2115 % 128;
                    int i2116 = i2115 % 2;
                }
            }
        }
        int i220 = a;
        int i221 = ((i220 ^ 89) | (i220 & 89)) << 1;
        int i222 = -(((~i220) & 89) | (i220 & (-90)));
        int i223 = ((i221 | i222) << 1) - (i222 ^ i221);
        b = i223 % 128;
        int i224 = i223 % 2;
        return false;
    }
}
