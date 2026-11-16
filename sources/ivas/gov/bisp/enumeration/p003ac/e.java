package ivas.gov.bisp.enumeration.p003ac;

import android.util.SparseArray;
import ivas.gov.bisp.enumeration.cJ.J;
import ivas.gov.bisp.enumeration.cJ.o;
import ivas.gov.bisp.enumeration.cK.c;
import ivas.gov.bisp.enumeration.p001aa.C0083p;
import ivas.gov.bisp.enumeration.p001aa.r;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p010aj.S;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static int a = 1;
    private static int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ e(c cVar, ivas.gov.bisp.enumeration.cK.e eVar) {
        this.c = cVar;
        this.d = eVar;
        g();
        f();
    }

    public void f() {
        int i;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 85;
        int i6 = ((i4 ^ 85) | i5) << 1;
        int i7 = -((i4 | 85) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            ivas.gov.bisp.enumeration.cK.e[] eVarArr = new ivas.gov.bisp.enumeration.cK.e[((ivas.gov.bisp.enumeration.cK.e) this.d).l()];
            throw null;
        }
        int iL = ((ivas.gov.bisp.enumeration.cK.e) this.d).l();
        ivas.gov.bisp.enumeration.cK.e[] eVarArr2 = new ivas.gov.bisp.enumeration.cK.e[iL];
        int i9 = ~iL;
        int i10 = -(-(iL << 1));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        int i12 = b;
        int i13 = ((i12 | 93) << 1) - (i12 ^ 93);
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i11;
        while (i15 >= 0) {
            ivas.gov.bisp.enumeration.cK.e eVar = new ivas.gov.bisp.enumeration.cK.e(((ivas.gov.bisp.enumeration.cK.e[]) this.e)[i15]);
            int i16 = a;
            int i17 = (i16 ^ 115) + ((i16 & 115) << 1);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                eVarArr2[i15] = eVar;
                int i18 = i15 & 75;
                i15 = ((i15 | 75) & (~i18)) + (i18 << 1);
            } else {
                eVarArr2[i15] = eVar;
                int i19 = i15 & (-7);
                int i20 = ((((i15 ^ (-7)) | i19) << 1) - (~(-((i15 | (-7)) & (~i19))))) - 1;
                int i21 = i20 & 6;
                int i22 = -(-(i20 | 6));
                i15 = (i21 ^ i22) + ((i21 & i22) << 1);
            }
        }
        this.f = new ivas.gov.bisp.enumeration.cK.e[iL];
        int i23 = a;
        int i24 = i23 & 47;
        int i25 = (((i23 | 47) & (~i24)) - (~(i24 << 1))) - 1;
        b = i25 % 128;
        int i26 = i25 % 2;
        while (i11 >= 0) {
            ivas.gov.bisp.enumeration.cK.e[] eVarArr3 = (ivas.gov.bisp.enumeration.cK.e[]) this.f;
            ivas.gov.bisp.enumeration.cK.e eVar2 = new ivas.gov.bisp.enumeration.cK.e((c) this.c, i11);
            int i27 = a;
            int i28 = i27 & 97;
            int i29 = (((i27 ^ 97) | i28) << 1) - ((i27 | 97) & (~i28));
            b = i29 % 128;
            if (i29 % 2 != 0) {
                eVarArr3[i11] = eVar2;
                int i30 = i11 + 11;
                i2 = (i30 & 86) + (i30 | 86);
            } else {
                eVarArr3[i11] = eVar2;
                i2 = (((~i11) | i11) << 1) - (~(-(~i11)));
            }
            i11 = i2 - 1;
        }
        int i31 = b;
        int i32 = (-2) - ((((i31 | 28) << 1) - (i31 ^ 28)) ^ (-1));
        a = i32 % 128;
        int i33 = i32 % 2;
        int i34 = 0;
        while (i34 < iL) {
            int i35 = a;
            int i36 = i35 & 27;
            int i37 = i36 + ((i35 ^ 27) | i36);
            b = i37 % 128;
            int i38 = i37 % 2;
            if (eVarArr2[i34].j(i34) == 0) {
                int i39 = a + 11;
                int i40 = i39 % 128;
                b = i40;
                if (i39 % 2 != 0) {
                    z = true;
                    i = i34;
                } else {
                    i = (i34 ^ 1) + ((i34 & 1) << 1);
                    z = false;
                }
                int i41 = (i40 & 43) + (i40 | 43);
                a = i41 % 128;
                int i42 = i41 % 2;
                while (i < iL) {
                    int i43 = a;
                    int i44 = i43 & 45;
                    int i45 = i43 | 45;
                    int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                    b = i46 % 128;
                    int i47 = i46 % 2;
                    if (eVarArr2[i].j(i34) != 0) {
                        int i48 = a + 93;
                        int i49 = i48 % 128;
                        b = i49;
                        int i50 = i48 % 2;
                        ivas.gov.bisp.enumeration.cK.e eVar3 = eVarArr2[i34];
                        int i51 = (-2) - ((i49 + 98) ^ (-1));
                        int i52 = i51 % 128;
                        a = i52;
                        int i53 = i51 % 2;
                        eVarArr2[i34] = eVarArr2[i];
                        eVarArr2[i] = eVar3;
                        Object obj2 = this.f;
                        int i54 = i52 & 115;
                        int i55 = -(-((i52 ^ 115) | i54));
                        int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
                        b = i56 % 128;
                        int i57 = i56 % 2;
                        ivas.gov.bisp.enumeration.cK.e[] eVarArr4 = (ivas.gov.bisp.enumeration.cK.e[]) obj2;
                        ivas.gov.bisp.enumeration.cK.e eVar4 = eVarArr4[i34];
                        int i58 = (i52 & (-20)) | ((~i52) & 19);
                        int i59 = (i52 & 19) << 1;
                        int i60 = (i58 & i59) + (i59 | i58);
                        int i61 = i60 % 128;
                        b = i61;
                        int i62 = i60 % 2;
                        eVarArr4[i34] = eVarArr4[i];
                        eVarArr4[i] = eVar4;
                        int i63 = ((i61 | 21) << 1) - (i61 ^ 21);
                        a = i63 % 128;
                        boolean z2 = i63 % 2 != 0;
                        int i64 = i61 & 73;
                        int i65 = (~i64) & (i61 | 73);
                        int i66 = i64 << 1;
                        int i67 = (i65 & i66) + (i66 | i65);
                        a = i67 % 128;
                        int i68 = i67 % 2;
                        z = z2;
                        i = iL;
                    }
                    int i69 = i ^ 1;
                    int i70 = (i & 1) << 1;
                    i = (i70 | i69) + (i69 & i70);
                    int i71 = a;
                    int i72 = i71 ^ 121;
                    int i73 = (((i71 & 121) | i72) << 1) - i72;
                    b = i73 % 128;
                    int i74 = i73 % 2;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iJ = eVarArr2[i34].j(i34);
            Object obj3 = this.c;
            int i75 = b + 1;
            a = i75 % 128;
            if (i75 % 2 == 0) {
                ((c) obj3).d(iJ);
                ivas.gov.bisp.enumeration.cK.e eVar5 = eVarArr2[i34];
                throw null;
            }
            int iD = ((c) obj3).d(iJ);
            eVarArr2[i34].m(iD);
            ivas.gov.bisp.enumeration.cK.e[] eVarArr5 = (ivas.gov.bisp.enumeration.cK.e[]) this.f;
            int i76 = b;
            int i77 = (-2) - (((i76 ^ 2) + ((i76 & 2) << 1)) ^ (-1));
            a = i77 % 128;
            int i78 = i77 % 2;
            eVarArr5[i34].m(iD);
            int i79 = a;
            int i80 = ((i79 | 95) << 1) - (((~i79) & 95) | (i79 & (-96)));
            b = i80 % 128;
            int i81 = i80 % 2;
            int i82 = 0;
            while (i82 < iL) {
                int i83 = a;
                int i84 = (((i83 | 42) << 1) - (i83 ^ 42)) - 1;
                int i85 = i84 % 128;
                b = i85;
                int i86 = i84 % 2;
                if (i82 != i34) {
                    int i87 = (i85 & 63) + (i85 | 63);
                    a = i87 % 128;
                    int i88 = i87 % 2;
                    int iJ2 = eVarArr2[i82].j(i34);
                    if (iJ2 != 0) {
                        int i89 = a;
                        int i90 = i89 ^ 49;
                        int i91 = -(-((i89 & 49) << 1));
                        int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
                        b = i92 % 128;
                        int i93 = i92 % 2;
                        ivas.gov.bisp.enumeration.cK.e eVarN = eVarArr2[i34].n(iJ2);
                        int i94 = a;
                        int i95 = ((i94 & 6) + (i94 | 6)) - 1;
                        b = i95 % 128;
                        if (i95 % 2 != 0) {
                            ((ivas.gov.bisp.enumeration.cK.e[]) this.f)[i34].n(iJ2);
                            obj.hashCode();
                            throw null;
                        }
                        ivas.gov.bisp.enumeration.cK.e eVarN2 = ((ivas.gov.bisp.enumeration.cK.e[]) this.f)[i34].n(iJ2);
                        ivas.gov.bisp.enumeration.cK.e eVar6 = eVarArr2[i82];
                        int[] iArr = eVar6.e;
                        int i96 = a;
                        int i97 = ((i96 | 11) << 1) - ((i96 & (-12)) | ((~i96) & 11));
                        b = i97 % 128;
                        if (i97 % 2 != 0) {
                            eVar6.e = eVar6.h(iArr, eVarN.e);
                            obj.hashCode();
                            throw null;
                        }
                        eVar6.e = eVar6.h(iArr, eVarN.e);
                        int i98 = b + 109;
                        a = i98 % 128;
                        int i99 = i98 % 2;
                        eVar6.i();
                        ivas.gov.bisp.enumeration.cK.e[] eVarArr6 = (ivas.gov.bisp.enumeration.cK.e[]) this.f;
                        int i100 = a + 3;
                        b = i100 % 128;
                        int i101 = i100 % 2;
                        ivas.gov.bisp.enumeration.cK.e eVar7 = eVarArr6[i82];
                        int[] iArr2 = eVar7.e;
                        int i102 = a + 119;
                        b = i102 % 128;
                        if (i102 % 2 != 0) {
                            eVar7.e = eVar7.h(iArr2, eVarN2.e);
                            throw null;
                        }
                        eVar7.e = eVar7.h(iArr2, eVarN2.e);
                        int i103 = b;
                        int i104 = i103 & 57;
                        int i105 = i104 + ((i103 ^ 57) | i104);
                        a = i105 % 128;
                        if (i105 % 2 == 0) {
                            eVar7.i();
                            int i106 = 11 / 0;
                        } else {
                            eVar7.i();
                        }
                    } else {
                        continue;
                    }
                }
                i82 = (((i82 ^ 1) | (i82 & 1)) << 1) - (((~i82) & 1) | (i82 & (-2)));
                int i107 = b;
                int i108 = ((i107 ^ 88) + ((i107 & 88) << 1)) - 1;
                a = i108 % 128;
                int i109 = i108 % 2;
            }
            int i110 = (((i34 & 101) | ((~i34) & (-102))) - (~(-(-((i34 & (-102)) << 1))))) - 1;
            int i111 = i110 & 103;
            int i112 = (i110 ^ 103) | i111;
            i34 = (i111 | i112) + (i111 & i112);
            int i113 = b + 65;
            a = i113 % 128;
            int i114 = i113 % 2;
        }
        int i115 = b;
        int i116 = (i115 & (-90)) | ((~i115) & 89);
        int i117 = (i115 & 89) << 1;
        int i118 = (i116 & i117) + (i117 | i116);
        a = i118 % 128;
        if (i118 % 2 == 0) {
            throw null;
        }
    }

    public void h(Object obj, ArrayList arrayList, HashSet hashSet) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 89;
        int i5 = ((i3 | 89) & (~i4)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (arrayList.contains(obj)) {
            int i7 = (-2) - ((a + 52) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        int i8 = a;
        int i9 = (((i8 | 94) << 1) - (i8 ^ 94)) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            hashSet.add(obj);
            throw null;
        }
        hashSet.add(obj);
        t tVar = (t) this.d;
        int i10 = b;
        int i11 = i10 & 41;
        int i12 = (i10 | 41) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        a = i14 % 128;
        int i15 = i14 % 2;
        ArrayList arrayList2 = (ArrayList) tVar.getOrDefault(obj, null);
        if (arrayList2 != null) {
            int i16 = a;
            int i17 = i16 & 85;
            int i18 = i17 + ((i16 ^ 85) | i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            int size = arrayList2.size();
            int i20 = a + 29;
            b = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (i22 < size) {
                int i23 = a;
                int i24 = ((i23 | 37) << 1) - (i23 ^ 37);
                b = i24 % 128;
                int i25 = i24 % 2;
                h(arrayList2.get(i22), arrayList, hashSet);
                int i26 = a;
                int i27 = ((i26 & (-88)) | ((~i26) & 87)) + ((i26 & 87) << 1);
                int i28 = i27 % 128;
                b = i28;
                if (i27 % 2 != 0) {
                    int i29 = i22 & 1;
                    i = (i29 - (~(-(-((i22 ^ 1) | i29))))) - 1;
                } else {
                    int i30 = i22 & 1;
                    i = i30 + ((i22 ^ 1) | i30);
                }
                i22 = i;
                int i31 = ((i28 ^ 40) + ((i28 & 40) << 1)) - 1;
                a = i31 % 128;
                int i32 = i31 % 2;
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
        int i33 = a;
        int i34 = i33 | 105;
        int i35 = i34 << 1;
        int i36 = -((~(i33 & 105)) & i34);
        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
        b = i37 % 128;
        int i38 = i37 % 2;
    }

    public ArrayList j() {
        int i = 2 % 2;
        int i2 = b + 39;
        a = i2 % 128;
        int i3 = i2 % 2;
        ArrayList arrayList = (ArrayList) ((S) this.c).e();
        int i4 = a;
        int i5 = (i4 ^ 67) + ((i4 & 67) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            int i6 = (-2) - ((a + 58) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = b;
        int i9 = ((i8 & 106) + (i8 | 106)) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return arrayList;
        }
        obj.hashCode();
        throw null;
    }

    public void i(ArrayList arrayList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 27;
        int i4 = (i2 & 27) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        arrayList.clear();
        ((S) this.c).g(arrayList);
        int i7 = b;
        int i8 = (((i7 & (-64)) | ((~i7) & 63)) - (~((i7 & 63) << 1))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void e(Object obj) {
        int i = 2 % 2;
        int i2 = a + 63;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        if (((t) this.d).i(obj) >= 0) {
            int i4 = b;
            int i5 = i4 ^ 123;
            int i6 = (((i4 & 123) | i5) << 1) - i5;
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 107;
            b = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = a;
            int i12 = (((i11 & (-14)) | ((~i11) & 13)) - (~(-(-((i11 & 13) << 1))))) - 1;
            int i13 = i12 % 128;
            b = i13;
            int i14 = i12 % 2;
            int i15 = (i13 & (-36)) | ((~i13) & 35);
            int i16 = (i13 & 35) << 1;
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                ((t) this.d).put(obj, null);
                obj2.hashCode();
                throw null;
            }
            ((t) this.d).put(obj, null);
            int i18 = b;
            int i19 = (i18 & 8) + (i18 | 8);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = a;
        int i23 = i22 & 13;
        int i24 = (i22 | 13) & (~i23);
        int i25 = -(-(i23 << 1));
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        b = i26 % 128;
        if (i26 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:38:0x0216 A[PHI: r8 r14
  0x0216: PHI (r8v31 int) = (r8v23 int), (r8v39 int) binds: [B:36:0x01fa, B:33:0x01e3] A[DONT_GENERATE, DONT_INLINE]
  0x0216: PHI (r14v36 int) = (r14v29 int), (r14v40 int) binds: [B:36:0x01fa, B:33:0x01e3] A[DONT_GENERATE, DONT_INLINE]] */
    public void g() {
        int i;
        int i2;
        int i3;
        int i4;
        int iF;
        int[] iArr;
        int i5;
        int[] iArr2;
        int i6 = 2;
        int i7 = 2 % 2;
        int i8 = b + 25;
        a = i8 % 128;
        int i9 = i8 % 2;
        int iL = ((ivas.gov.bisp.enumeration.cK.e) this.d).l();
        int i10 = a;
        int i11 = i10 & 123;
        int i12 = -(-((i10 ^ 123) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        this.e = new ivas.gov.bisp.enumeration.cK.e[iL];
        int i16 = i14 & 121;
        int i17 = (i14 ^ 121) | i16;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (true) {
            i = iL >> 1;
            if (i20 >= i) {
                break;
            }
            int i21 = a;
            int i22 = i21 & 79;
            int i23 = ((i21 ^ 79) | i22) << 1;
            int i24 = -((i21 | 79) & (~i22));
            int i25 = (i23 & i24) + (i24 | i23);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                iArr2 = new int[i20 << 1];
                i5 = i20;
            } else {
                i5 = i20 << 1;
                int i26 = i5 & 1;
                iArr2 = new int[i26 + ((i5 ^ 1) | i26)];
            }
            iArr2[i5] = 1;
            ivas.gov.bisp.enumeration.cK.e[] eVarArr = (ivas.gov.bisp.enumeration.cK.e[]) this.e;
            ivas.gov.bisp.enumeration.cK.e eVar = new ivas.gov.bisp.enumeration.cK.e((c) this.c, iArr2);
            int i27 = b;
            int i28 = (i27 | 105) << 1;
            int i29 = -(i27 ^ 105);
            int i30 = (i28 & i29) + (i29 | i28);
            int i31 = i30 % 128;
            a = i31;
            int i32 = i30 % 2;
            eVarArr[i20] = eVar;
            int i33 = i20 ^ 1;
            i20 = ((((i20 & 1) | i33) << 1) - (~(-i33))) - 1;
            int i34 = i31 ^ 103;
            int i35 = ((i31 & 103) | i34) << 1;
            int i36 = -i34;
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            b = i37 % 128;
            int i38 = i37 % 2;
        }
        while (true) {
            Object obj = null;
            if (i >= iL) {
                int i39 = a;
                int i40 = (i39 & 33) + (i39 | 33);
                b = i40 % 128;
                if (i40 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i41 = i << 1;
            int i42 = i41 & 1;
            int i43 = (~i42) & (i41 | 1);
            int i44 = i42 << 1;
            int[] iArr3 = new int[(i43 ^ i44) + ((i44 & i43) << 1)];
            iArr3[i41] = 1;
            ivas.gov.bisp.enumeration.cK.e eVar2 = new ivas.gov.bisp.enumeration.cK.e((c) this.c, iArr3);
            int i45 = a;
            int i46 = i45 & 77;
            int i47 = i45 | 77;
            int i48 = (i46 & i47) + (i46 | i47);
            b = i48 % 128;
            int i49 = i48 % i6;
            ivas.gov.bisp.enumeration.cK.e[] eVarArr2 = (ivas.gov.bisp.enumeration.cK.e[]) this.e;
            ivas.gov.bisp.enumeration.cK.e eVar3 = (ivas.gov.bisp.enumeration.cK.e) this.d;
            int i50 = i45 + 31;
            b = i50 % 128;
            int i51 = i50 % i6;
            int[] iArr4 = eVar2.e;
            int[] iArr5 = eVar3.e;
            int i52 = a;
            int i53 = (i52 & (-116)) | ((~i52) & 115);
            int i54 = (i52 & 115) << 1;
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            b = i55 % 128;
            int i56 = i55 % i6;
            int iF2 = ivas.gov.bisp.enumeration.cK.e.f(iArr5);
            int i57 = -1;
            if (iF2 == -1) {
                throw new ArithmeticException("Division by zero");
            }
            int i58 = a;
            int i59 = (((i58 ^ 111) | (i58 & 111)) << 1) - ((111 & (~i58)) | (i58 & (-112)));
            b = i59 % 128;
            if (i59 % i6 != 0) {
                int[] iArr6 = new int[iArr4.length];
                ivas.gov.bisp.enumeration.cK.e.f(iArr5);
                obj.hashCode();
                throw null;
            }
            int length = iArr4.length;
            int[] iArrH = new int[length];
            int iF3 = ivas.gov.bisp.enumeration.cK.e.f(iArr5);
            if (iF3 == -1) {
                int i60 = b;
                int i61 = i60 ^ 75;
                int i62 = ((i60 & 75) | i61) << 1;
                int i63 = -i61;
                int i64 = (i62 & i63) + (i62 | i63);
                int i65 = i64 % 128;
                a = i65;
                int i66 = i64 % 2;
                int i67 = (i65 ^ 71) + ((i65 & 71) << 1);
                b = i67 % 128;
                if (i67 % i6 != 0) {
                    int i68 = 4 % 4;
                }
                i2 = 0;
            } else {
                i2 = iArr5[iF3];
                int i69 = b;
                int i70 = (((i69 | 122) << 1) - (i69 ^ 122)) - 1;
                a = i70 % 128;
                int i71 = i70 % i6;
            }
            int iD = eVar2.c.d(i2);
            int i72 = b;
            int i73 = (-2) - (((i72 ^ 30) + ((i72 & 30) << 1)) ^ (-1));
            a = i73 % 128;
            int i74 = i73 % i6;
            System.arraycopy(iArr4, 0, iArrH, 0, length);
            while (iF2 <= ivas.gov.bisp.enumeration.cK.e.f(iArrH)) {
                int i75 = b;
                int i76 = i75 & 23;
                int i77 = ((((i75 ^ 23) | i76) << 1) - (~(-((i75 | 23) & (~i76))))) - 1;
                a = i77 % 128;
                int i78 = i77 % i6;
                c cVar = eVar2.c;
                int iF4 = ivas.gov.bisp.enumeration.cK.e.f(iArrH);
                if (iF4 == i57) {
                    int i79 = a;
                    int i80 = ((i79 | 89) << 1) - (i79 ^ 89);
                    b = i80 % 128;
                    int i81 = i80 % i6;
                    int i82 = i79 & 113;
                    int i83 = ((i79 | 113) & (~i82)) + (i82 << 1);
                    b = i83 % 128;
                    int i84 = i83 % i6;
                    i3 = 0;
                } else {
                    i3 = iArrH[iF4];
                    int i85 = b + 99;
                    a = i85 % 128;
                    int i86 = i85 % i6;
                }
                int iF5 = cVar.f(i3, iD);
                int iF6 = ivas.gov.bisp.enumeration.cK.e.f(iArrH);
                int i87 = b;
                int i88 = i87 & 45;
                int i89 = (i87 ^ 45) | i88;
                int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                a = i90 % 128;
                if (i90 % i6 == 0) {
                    i4 = iF6 * iF2;
                    iF = ivas.gov.bisp.enumeration.cK.e.f(iArr5);
                    if (iF == i57) {
                        int i91 = b;
                        int i92 = i91 + 53;
                        a = i92 % 128;
                        int i93 = i92 % 2;
                        iArr = new int[1];
                        int i94 = ((i91 | 49) << 1) - (i91 ^ 49);
                        a = i94 % 128;
                        int i95 = i94 % 2;
                    } else {
                        int[] iArr7 = new int[(-2) - (((iF - (~i4)) - i57) ^ i57)];
                        int i96 = a + 85;
                        b = i96 % 128;
                        int i97 = i96 % 2;
                        System.arraycopy(iArr5, 0, iArr7, i4, (iF ^ 1) + ((iF & 1) << 1));
                        int i98 = a;
                        int i99 = i98 | 51;
                        int i100 = (i99 << 1) - ((~(i98 & 51)) & i99);
                        b = i100 % 128;
                        int i101 = i100 % 2;
                        iArr = iArr7;
                    }
                } else {
                    int i102 = -iF2;
                    int i103 = iF6 & i102;
                    int i104 = ((iF6 ^ i102) | i103) << 1;
                    int i105 = -((~i103) & (iF6 | i102));
                    i4 = ((i104 | i105) << 1) - (i105 ^ i104);
                    iF = ivas.gov.bisp.enumeration.cK.e.f(iArr5);
                    if (iF == i57) {
                        int i910 = b;
                        int i911 = i910 + 53;
                        a = i911 % 128;
                        int i912 = i911 % 2;
                        iArr = new int[1];
                        int i913 = ((i910 | 49) << 1) - (i910 ^ 49);
                        a = i913 % 128;
                        int i914 = i913 % 2;
                    } else {
                        int[] iArr8 = new int[(-2) - (((iF - (~i4)) - i57) ^ i57)];
                        int i915 = a + 85;
                        b = i915 % 128;
                        int i916 = i915 % 2;
                        System.arraycopy(iArr5, 0, iArr8, i4, (iF ^ 1) + ((iF & 1) << 1));
                        int i917 = a;
                        int i918 = i917 | 51;
                        int i106 = (i918 << 1) - ((~(i917 & 51)) & i918);
                        b = i106 % 128;
                        int i107 = i106 % 2;
                        iArr = iArr8;
                    }
                }
                iArrH = eVar2.h(eVar2.g(iArr, iF5), iArrH);
                int i108 = b;
                int i109 = i108 & 51;
                int i110 = i108 | 51;
                int i111 = (i109 ^ i110) + ((i110 & i109) << 1);
                a = i111 % 128;
                int i112 = i111 % 2;
                i6 = 2;
                i57 = -1;
            }
            ivas.gov.bisp.enumeration.cK.e eVar4 = new ivas.gov.bisp.enumeration.cK.e(eVar2.c, iArrH);
            int i113 = a;
            int i114 = i113 ^ 11;
            int i115 = ((((i113 & 11) | i114) << 1) - (~(-i114))) - 1;
            int i116 = i115 % 128;
            b = i116;
            int i117 = i115 % 2;
            eVarArr2[i] = eVar4;
            int i118 = i & 1;
            int i119 = ((i ^ 1) | i118) << 1;
            int i120 = -((~i118) & (i | 1));
            i = (i119 ^ i120) + ((i119 & i120) << 1);
            int i121 = i116 & 99;
            int i122 = i121 + ((i116 ^ 99) | i121);
            a = i122 % 128;
            int i123 = i122 % 2;
            i6 = 2;
        }
    }

    public e(int i) {
        if (i == 1) {
            this.c = new S(10);
            this.d = new t();
            this.e = new ArrayList();
            this.f = new HashSet();
            return;
        }
        int i2 = a;
        int i3 = i2 & 47;
        int i4 = (i3 - (~(-(-((i2 ^ 47) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0 ? i == 2 : i == 5) {
            this.c = new r();
            this.d = new SparseArray();
            this.e = new C0083p();
            this.f = new r();
            return;
        }
        this.c = new C0086p(256);
        this.d = new C0086p(256);
        this.e = new C0086p(256);
        this.f = new t[32];
    }

    public /* synthetic */ e(J j, o oVar) {
        this.c = j;
        this.d = oVar;
        this.e = null;
        this.f = null;
    }
}
