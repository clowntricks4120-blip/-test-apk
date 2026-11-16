package ivas.gov.bisp.enumeration.bH;

import ivas.gov.bisp.enumeration.bG.B;
import ivas.gov.bisp.enumeration.bG.F;
import ivas.gov.bisp.enumeration.bG.ae;
import ivas.gov.bisp.enumeration.bG.ai;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class P {
    private static int a = 0;
    private static int b = 1;
    public ArrayList<ArrayList<t>> c = new ArrayList<>();
    public List<l> d = new ArrayList();
    public List<u> e = new ArrayList();
    public HashMap<Integer, B> f = new HashMap<>();
    public HashMap<String, t> g = new HashMap<>();

    public final String d(int i, int i2) {
        String string;
        int i3 = 2 % 2;
        int i4 = (-2) - ((b + 102) ^ (-1));
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (i < 0) {
            int i7 = (-2) - (((i5 ^ 90) + ((i5 & 90) << 1)) ^ (-1));
            b = i7 % 128;
            int i8 = i7 % 2;
            if (i2 > 0) {
                int i9 = (i5 ^ 111) + ((i5 & 111) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                String strO = j.o("-50,", i2);
                int i11 = b;
                int i12 = ((i11 | 39) << 1) - (i11 ^ 39);
                a = i12 % 128;
                int i13 = i12 % 2;
                return strO;
            }
        }
        Object obj = null;
        if (i > 0) {
            int i14 = ((i5 ^ 57) | (i5 & 57)) << 1;
            int i15 = -(((~i5) & 57) | (i5 & (-58)));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            if (i16 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i2 < 0) {
                String strO2 = j.o("-50,", i);
                int i17 = a;
                int i18 = i17 & 125;
                int i19 = -(-((i17 ^ 125) | i18));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                b = i20 % 128;
                int i21 = i20 % 2;
                return strO2;
            }
        }
        if (i < 0) {
            int i22 = b + 33;
            int i23 = i22 % 128;
            a = i23;
            if (i22 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i2 < 0) {
                int i24 = i23 & 91;
                int i25 = -(-(i23 | 91));
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    return "-50, -50";
                }
                throw null;
            }
        }
        if (i < i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            int i27 = a + 94;
            int i28 = (i27 ^ (-1)) + (i27 << 1);
            b = i28 % 128;
            int i29 = i28 % 2;
            sb.append(",");
            sb.append(i2);
            int i30 = b;
            int i31 = i30 & 87;
            int i32 = i31 + ((i30 ^ 87) | i31);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                sb.toString();
                obj.hashCode();
                throw null;
            }
            String string2 = sb.toString();
            int i33 = a;
            int i34 = ((((i33 ^ 7) | (i33 & 7)) << 1) - (~(-(((~i33) & 7) | (i33 & (-8)))))) - 1;
            b = i34 % 128;
            int i35 = i34 % 2;
            return string2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i2);
        int i36 = b;
        int i37 = ((i36 ^ 55) | (i36 & 55)) << 1;
        int i38 = -(((~i36) & 55) | (i36 & (-56)));
        int i39 = (i37 & i38) + (i38 | i37);
        a = i39 % 128;
        int i40 = i39 % 2;
        sb2.append(",");
        sb2.append(i);
        int i41 = b + 19;
        a = i41 % 128;
        if (i41 % 2 != 0) {
            string = sb2.toString();
            int i42 = 64 / 0;
        } else {
            string = sb2.toString();
        }
        int i43 = b;
        int i44 = i43 & 35;
        int i45 = -(-((i43 ^ 35) | i44));
        int i46 = (i44 & i45) + (i45 | i44);
        a = i46 % 128;
        int i47 = i46 % 2;
        return string;
    }

    public class bvG implements Comparator<B> {
        private static int a = 0;
        private static int b = 1;

        public bvG(P p) {
        }

        @Override // java.util.Comparator
        public int compare(B b2, B b3) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 43;
            int i4 = i2 | 43;
            int i5 = 1;
            int i6 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i6 % 128;
            int i7 = i6 % 2;
            B b4 = b2;
            B b5 = b3;
            int i8 = b4.f;
            int i9 = a;
            int i10 = ((i9 ^ 2) + ((i9 & 2) << 1)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i8 * 100;
            int i13 = -(-b4.g);
            int i14 = ((~i13) & i12) | ((~i12) & i13);
            int i15 = -(-((i13 & i12) << 1));
            int i16 = (i14 & i15) + (i15 | i14);
            int i17 = b5.f * 100;
            int i18 = b5.g;
            int i19 = a + 103;
            int i20 = i19 % 128;
            b = i20;
            int i21 = i19 % 2;
            int i22 = i17 - (~(-(-i18)));
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            if (i16 > i23) {
                int i24 = i20 & 117;
                int i25 = (i24 - (~((i20 ^ 117) | i24))) - 1;
                int i26 = i25 % 128;
                a = i26;
                int i27 = i25 % 2;
                int i28 = i26 + 87;
                b = i28 % 128;
                int i29 = i28 % 2;
                i5 = -1;
            } else if (i16 < i23) {
                int i30 = ((i20 | 114) << 1) - (i20 ^ 114);
                int i31 = (i30 ^ (-1)) + (i30 << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
                int i33 = i20 & 45;
                int i34 = (i20 ^ 45) | i33;
                int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                a = i35 % 128;
                int i36 = i35 % 2;
            } else {
                int i37 = i20 & 123;
                int i38 = (i37 - (~(-(-((i20 ^ 123) | i37))))) - 1;
                a = i38 % 128;
                if (i38 % 2 != 0) {
                    int i39 = 5 / 5;
                }
                i5 = 0;
            }
            int i40 = a + 47;
            b = i40 % 128;
            if (i40 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x034e  */
    public final void c(t tVar, int i) throws Throwable {
        ArrayList<t> arrayList;
        int i2;
        String str;
        int i3;
        int i4;
        t tVar2;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = ((((i6 ^ 7) | (i6 & 7)) << 1) - (~(-(((~i6) & 7) | (i6 & (-8)))))) - 1;
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        Throwable th = null;
        if (tVar == null) {
            int i10 = (i8 & 7) + (i8 | 7);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            th.hashCode();
            throw null;
        }
        if (tVar.d) {
            int i11 = a;
            int i12 = i11 & 11;
            int i13 = i12 + ((i11 ^ 11) | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        tVar.d = true;
        int i15 = 23;
        if (i == this.c.size()) {
            arrayList = new ArrayList<>();
            ArrayList<ArrayList<t>> arrayList2 = this.c;
            int i16 = a;
            int i17 = i16 ^ 19;
            int i18 = -(-((i16 & 19) << 1));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                arrayList2.add(arrayList);
                throw null;
            }
            arrayList2.add(arrayList);
            int i20 = b;
            int i21 = (((i20 | 32) << 1) - (i20 ^ 32)) - 1;
            a = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 4 % 5;
            }
        } else if (i < this.c.size()) {
            int i23 = b + 105;
            a = i23 % 128;
            int i24 = i23 % 2;
            arrayList = this.c.get(i);
            int i25 = b;
            int i26 = i25 & 81;
            int i27 = ((i25 ^ 81) | i26) << 1;
            int i28 = -((i25 | 81) & (~i26));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            a = i29 % 128;
            int i30 = i29 % 2;
        } else {
            arrayList = new ArrayList<>();
            int i31 = a;
            int i32 = ((i31 | 23) << 1) - (i31 ^ 23);
            b = i32 % 128;
            if (i32 % 2 == 0) {
                int i33 = 3 / 2;
            }
        }
        arrayList.add(tVar);
        List<B> list = tVar.c;
        bvG bvg = new bvG(this);
        int i34 = a;
        int i35 = i34 & 47;
        int i36 = (i35 - (~(-(-((i34 ^ 47) | i35))))) - 1;
        b = i36 % 128;
        int i37 = i36 % 2;
        Collections.sort(list, bvg);
        int i38 = a;
        int i39 = (-2) - (((i38 ^ 24) + ((i38 & 24) << 1)) ^ (-1));
        b = i39 % 128;
        int i40 = i39 % 2;
        int i41 = 0;
        while (i41 < tVar.c.size()) {
            int i42 = a;
            int i43 = i42 & 49;
            int i44 = (i42 | 49) & (~i43);
            int i45 = -(-(i43 << 1));
            int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
            b = i46 % 128;
            int i47 = i46 % 2;
            B b2 = tVar.c.get(i41);
            int i48 = b;
            int i49 = (((i48 | 92) << 1) - (i48 ^ 92)) - 1;
            a = i49 % 128;
            if (i49 % 2 != 0) {
                i2 = b2.d;
                str = b2.h;
                int i50 = 52 / 0;
            } else {
                i2 = b2.d;
                str = b2.h;
            }
            int i51 = a;
            int i52 = i51 & 53;
            int i53 = -(-((i51 ^ 53) | i52));
            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
            b = i54 % 128;
            int i55 = i54 % 2;
            if (str.equals("male")) {
                int i56 = a;
                int i57 = i56 & 5;
                int i58 = (i57 - (~((i56 ^ 5) | i57))) - 1;
                b = i58 % 128;
                if (i58 % 2 == 0) {
                    ((F) b2).a.size();
                    th.hashCode();
                    throw th;
                }
                List<ae> list2 = ((F) b2).a;
                if (list2.size() == 0) {
                    int i59 = a;
                    int i60 = (i59 & (-24)) | ((~i59) & i15);
                    int i61 = (i59 & i15) << 1;
                    int i62 = (i60 & i61) + (i61 | i60);
                    b = i62 % 128;
                    int i63 = i62 % 2;
                    String strD = d(i2, -50);
                    HashMap<String, t> map = this.g;
                    int i64 = b;
                    int i65 = i64 & 99;
                    int i66 = ((i64 ^ 99) | i65) << 1;
                    int i67 = -((i64 | 99) & (~i65));
                    int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                    a = i68 % 128;
                    int i69 = i68 % 2;
                    t tVar3 = map.get(strD);
                    int i70 = a;
                    int i71 = ((i70 | 31) << 1) - (i70 ^ 31);
                    b = i71 % 128;
                    if (i71 % 2 == 0) {
                        c(tVar3, i);
                    } else {
                        int i72 = i & 1;
                        c(tVar3, (((i ^ 1) | i72) << 1) - ((~i72) & (i | 1)));
                    }
                } else {
                    int i73 = b;
                    int i74 = i73 & 121;
                    int i75 = (i74 - (~(-(-((i73 ^ 121) | i74))))) - 1;
                    a = i75 % 128;
                    int i76 = i75 % 2;
                    int i77 = 0;
                    while (i77 < list2.size()) {
                        int i78 = a;
                        int i79 = i78 & 55;
                        int i80 = -(-((i78 ^ 55) | i79));
                        int i81 = (i79 & i80) + (i80 | i79);
                        b = i81 % 128;
                        if (i81 % 2 == 0) {
                            int i82 = list2.get(i77).d;
                            th.hashCode();
                            throw th;
                        }
                        int i83 = list2.get(i77).d;
                        int i84 = b;
                        int i85 = i84 & 69;
                        int i86 = (i85 - (~(-(-((i84 ^ 69) | i85))))) - 1;
                        a = i86 % 128;
                        int i87 = i86 % 2;
                        HashMap<Integer, B> map2 = this.f;
                        Integer numValueOf = Integer.valueOf(i83);
                        int i88 = a;
                        int i89 = (i88 & (-74)) | (73 & (~i88));
                        int i90 = -(-((i88 & 73) << 1));
                        int i91 = (i89 ^ i90) + ((i89 & i90) << 1);
                        b = i91 % 128;
                        if (i91 % 2 == 0) {
                            map2.get(numValueOf);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (map2.get(numValueOf) == null) {
                            int i92 = b;
                            int i93 = (((i92 | 118) << 1) - (i92 ^ 118)) - 1;
                            a = i93 % 128;
                            int i94 = i93 % 2;
                            i83 = -1;
                        }
                        String strD2 = d(i2, i83);
                        HashMap<String, t> map3 = this.g;
                        int i95 = a;
                        int i96 = (i95 & 121) + (i95 | 121);
                        b = i96 % 128;
                        if (i96 % 2 == 0) {
                            tVar2 = map3.get(strD2);
                            int i97 = 33 / 0;
                        } else {
                            tVar2 = map3.get(strD2);
                        }
                        int i98 = a;
                        int i99 = (((i98 ^ 15) | (i98 & 15)) << 1) - (((~i98) & 15) | (i98 & (-16)));
                        b = i99 % 128;
                        int i100 = i99 % 2;
                        c(tVar2, ((i | 1) << 1) - ((i & (-2)) | ((~i) & 1)));
                        int i101 = i77 ^ 1;
                        int i102 = ((i77 & 1) | i101) << 1;
                        int i103 = -i101;
                        i77 = (i102 & i103) + (i103 | i102);
                        int i104 = a;
                        int i105 = ((i104 ^ 118) + ((i104 & 118) << 1)) - 1;
                        b = i105 % 128;
                        int i106 = i105 % 2;
                        th = null;
                        i15 = 23;
                    }
                }
                i4 = i15;
            } else {
                if (str.equals("female")) {
                    int i107 = b;
                    int i108 = i107 & 43;
                    int i109 = ((i107 ^ 43) | i108) << 1;
                    int i110 = -((i107 | 43) & (~i108));
                    int i111 = (i109 & i110) + (i110 | i109);
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    F f = ((ae) b2).a;
                    if (f != null) {
                        int i113 = a;
                        int i114 = i113 & 21;
                        int i115 = (i113 ^ 21) | i114;
                        int i116 = (i114 & i115) + (i115 | i114);
                        b = i116 % 128;
                        if (i116 % 2 == 0) {
                            int i117 = f.d;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        i3 = f.d;
                    } else {
                        int i118 = b + 99;
                        a = i118 % 128;
                        int i119 = i118 % 2;
                        i3 = 0;
                    }
                } else if (str.equals("transgender")) {
                    int i120 = a;
                    int i121 = (i120 & 99) + (i120 | 99);
                    b = i121 % 128;
                    if (i121 % 2 == 0) {
                        B b3 = ((ai) b2).a;
                        throw null;
                    }
                    B b4 = ((ai) b2).a;
                    if (b4 != null) {
                        i3 = b4.d;
                        int i122 = b;
                        int i123 = i122 & 115;
                        int i124 = (i122 | 115) & (~i123);
                        int i125 = i123 << 1;
                        int i126 = (i124 & i125) + (i124 | i125);
                        a = i126 % 128;
                        int i127 = i126 % 2;
                    } else {
                        int i1110 = b + 99;
                        a = i1110 % 128;
                        int i1111 = i1110 % 2;
                        i3 = 0;
                    }
                } else {
                    int i1112 = b + 99;
                    a = i1112 % 128;
                    int i1113 = i1112 % 2;
                    i3 = 0;
                }
                if (this.f.get(Integer.valueOf(i3)) == null) {
                    int i128 = a;
                    int i129 = i128 + 19;
                    b = i129 % 128;
                    int i130 = i129 % 2;
                    int i131 = i128 & 105;
                    int i132 = ((i128 ^ 105) | i131) << 1;
                    int i133 = -((i128 | 105) & (~i131));
                    int i134 = (i132 & i133) + (i133 | i132);
                    b = i134 % 128;
                    int i135 = i134 % 2;
                    i3 = -1;
                }
                String strD3 = d(i2, i3);
                HashMap<String, t> map4 = this.g;
                int i136 = a;
                int i137 = (i136 | 23) << 1;
                i4 = 23;
                int i138 = -(i136 ^ 23);
                int i139 = (i137 & i138) + (i138 | i137);
                b = i139 % 128;
                int i140 = i139 % 2;
                t tVar4 = map4.get(strD3);
                int i141 = b;
                int i142 = ((i141 | 118) << 1) - (i141 ^ 118);
                int i143 = (i142 ^ (-1)) + (i142 << 1);
                a = i143 % 128;
                int i144 = i143 % 2;
                c(tVar4, i + 1);
                int i145 = a;
                int i146 = (i145 & 77) + (i145 | 77);
                b = i146 % 128;
                int i147 = i146 % 2;
            }
            i41++;
            int i148 = a;
            int i149 = i148 ^ 21;
            int i150 = ((i148 & 21) | i149) << 1;
            int i151 = -i149;
            int i152 = (i150 ^ i151) + ((i150 & i151) << 1);
            b = i152 % 128;
            int i153 = i152 % 2;
            i15 = i4;
            th = null;
        }
        int i154 = a;
        int i155 = i154 & 51;
        int i156 = i155 + ((i154 ^ 51) | i155);
        b = i156 % 128;
        if (i156 % 2 == 0) {
            throw null;
        }
    }
}
