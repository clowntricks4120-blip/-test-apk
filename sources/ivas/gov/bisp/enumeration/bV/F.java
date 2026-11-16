package ivas.gov.bisp.enumeration.bV;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bL.aE;
import ivas.gov.bisp.enumeration.bO.l;
import ivas.gov.bisp.enumeration.bU.z;
import ivas.gov.bisp.enumeration.o000o0oo.o00OO00O;
import ivas.gov.bisp.enumeration.o000oo0o.o0O000Oo;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class F extends l implements o0O000Oo<CharSequence, Integer, o00OO00O<? extends Integer, ? extends Integer>> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ List<String> c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(List<String> list, boolean z) {
        super(2);
        this.c = list;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0380 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0382  */
    /* JADX WARN: Code duplicated, block: B:103:0x0399  */
    /* JADX WARN: Code duplicated, block: B:104:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:106:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:107:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:111:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:112:0x0412  */
    /* JADX WARN: Code duplicated, block: B:114:0x0419  */
    /* JADX WARN: Code duplicated, block: B:117:0x042e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x042f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x005f A[PHI: r3
  0x005f: PHI (r3v14 boolean) = (r3v13 boolean), (r3v128 boolean) binds: [B:12:0x005d, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    /* JADX WARN: Code duplicated, block: B:21:0x00af  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0156  */
    /* JADX WARN: Code duplicated, block: B:42:0x0167  */
    /* JADX WARN: Code duplicated, block: B:44:0x017a  */
    /* JADX WARN: Code duplicated, block: B:48:0x019d  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f4 A[LOOP:1: B:46:0x0196->B:55:0x01f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0229 A[LOOP:0: B:45:0x0186->B:61:0x0229, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0259  */
    /* JADX WARN: Code duplicated, block: B:71:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x027c  */
    /* JADX WARN: Code duplicated, block: B:74:0x028d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x028f  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x02db  */
    /* JADX WARN: Code duplicated, block: B:86:0x02f1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(Object obj, Object obj2) {
        List<String> list;
        boolean z;
        int size;
        int i;
        String str;
        int iAz;
        aE aEVar;
        aE aEVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Iterator<T> it;
        int i8;
        Object next;
        String str2;
        int i9;
        int i10;
        String str3;
        int i11;
        int i12;
        int i13;
        Iterator<T> it2;
        Object next2;
        String str4;
        String str5;
        int i14;
        String str6;
        int i15;
        int i16 = 2 % 2;
        int i17 = b;
        int i18 = (i17 & 125) + (i17 | 125);
        a = i18 % 128;
        int i19 = i18 % 2;
        CharSequence charSequence = (CharSequence) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i20 = a;
        int i21 = ((i20 & (-98)) | ((~i20) & 97)) + ((i20 & 97) << 1);
        b = i21 % 128;
        int i22 = 0;
        if (i21 % 2 == 0) {
            r.n(charSequence, "$this$$receiver");
            list = this.c;
            int i23 = 71 / 0;
        } else {
            r.n(charSequence, "$this$$receiver");
            list = this.c;
        }
        List<String> list2 = list;
        int i24 = a;
        int i25 = ((i24 & 48) + (i24 | 48)) - 1;
        b = i25 % 128;
        Object obj3 = null;
        if (i25 % 2 != 0) {
            z = this.d;
            if (!z) {
                if (list2.size() == 1) {
                    int i26 = b;
                    int i27 = i26 ^ 25;
                    int i28 = -(-((i26 & 25) << 1));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    size = list2.size();
                    if (size != 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    i = a;
                    int i31 = i + 105;
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    if (size == 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    int i33 = i & 97;
                    int i34 = (i ^ 97) | i33;
                    int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    str = list2.get(0);
                    int i37 = b;
                    int i38 = (i37 & 81) + (i37 | 81);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    iAz = B.az(charSequence, str, iIntValue, false);
                    if (iAz >= 0) {
                        int i40 = b;
                        int i41 = ((i40 | 75) << 1) - (i40 ^ 75);
                        a = i41 % 128;
                        int i42 = i41 % 2;
                        aEVar = null;
                        break;
                    }
                    aEVar = new aE(Integer.valueOf(iAz), str);
                    int i43 = a;
                    int i44 = ((i43 ^ 57) | (i43 & 57)) << 1;
                    int i45 = -(((~i43) & 57) | (i43 & (-58)));
                    int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                    b = i46 % 128;
                    int i47 = i46 % 2;
                }
            }
            if (aEVar != null) {
                int i48 = a;
                int i49 = i48 & 113;
                int i50 = (i48 ^ 113) | i49;
                i3 = (i49 & i50) + (i50 | i49);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    A a2 = aEVar.c;
                    throw null;
                }
                aEVar2 = new aE(aEVar.c, Integer.valueOf(((String) aEVar.d).length()));
                int i51 = a;
                int i52 = (i51 ^ 99) + ((i51 & 99) << 1);
                int i53 = i52 % 128;
                b = i53;
                int i54 = i52 % 2;
                int i55 = i53 & 121;
                int i56 = (i53 ^ 121) | i55;
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                a = i57 % 128;
                int i58 = i57 % 2;
            } else {
                aEVar2 = null;
            }
            int i59 = b;
            int i60 = i59 & 51;
            int i61 = -(-((i59 ^ 51) | i60));
            i2 = (i60 & i61) + (i61 | i60);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                return aEVar2;
            }
            throw null;
        }
        z = this.d;
        int i62 = 35 / 0;
        if (!z) {
            if (list2.size() == 1) {
                int i210 = b;
                int i211 = i210 ^ 25;
                int i212 = -(-((i210 & 25) << 1));
                int i213 = ((i211 | i212) << 1) - (i212 ^ i211);
                a = i213 % 128;
                int i310 = i213 % 2;
                size = list2.size();
                if (size != 0) {
                    throw new NoSuchElementException("List is empty.");
                }
                i = a;
                int i311 = i + 105;
                b = i311 % 128;
                int i312 = i311 % 2;
                if (size == 1) {
                    throw new IllegalArgumentException("List has more than one element.");
                }
                int i313 = i & 97;
                int i314 = (i ^ 97) | i313;
                int i315 = ((i313 | i314) << 1) - (i313 ^ i314);
                b = i315 % 128;
                int i316 = i315 % 2;
                str = list2.get(0);
                int i317 = b;
                int i318 = (i317 & 81) + (i317 | 81);
                a = i318 % 128;
                int i319 = i318 % 2;
                iAz = B.az(charSequence, str, iIntValue, false);
                if (iAz >= 0) {
                    int i410 = b;
                    int i411 = ((i410 | 75) << 1) - (i410 ^ 75);
                    a = i411 % 128;
                    int i412 = i411 % 2;
                    aEVar = null;
                    break;
                }
                aEVar = new aE(Integer.valueOf(iAz), str);
                int i413 = a;
                int i414 = ((i413 ^ 57) | (i413 & 57)) << 1;
                int i415 = -(((~i413) & 57) | (i413 & (-58)));
                int i416 = ((i414 | i415) << 1) - (i415 ^ i414);
                b = i416 % 128;
                int i417 = i416 % 2;
            }
        }
        if (aEVar != null) {
            int i418 = a;
            int i419 = i418 & 113;
            int i510 = (i418 ^ 113) | i419;
            i3 = (i419 & i510) + (i510 | i419);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                A a3 = aEVar.c;
                throw null;
            }
            aEVar2 = new aE(aEVar.c, Integer.valueOf(((String) aEVar.d).length()));
            int i511 = a;
            int i512 = (i511 ^ 99) + ((i511 & 99) << 1);
            int i513 = i512 % 128;
            b = i513;
            int i514 = i512 % 2;
            int i515 = i513 & 121;
            int i516 = (i513 ^ 121) | i515;
            int i517 = ((i515 | i516) << 1) - (i516 ^ i515);
            a = i517 % 128;
            int i518 = i517 % 2;
        } else {
            aEVar2 = null;
        }
        int i519 = b;
        int i63 = i519 & 51;
        int i64 = -(-((i519 ^ 51) | i63));
        i2 = (i63 & i64) + (i64 | i63);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return aEVar2;
        }
        throw null;
        boolean z2 = z;
        if (iIntValue < 0) {
            int i65 = b;
            int i66 = i65 ^ 123;
            int i67 = ((i65 & 123) | i66) << 1;
            int i68 = -i66;
            int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
            a = i69 % 128;
            int i70 = i69 % 2 != 0 ? 1 : 0;
            int i71 = ((i65 ^ 42) + ((i65 & 42) << 1)) - 1;
            a = i71 % 128;
            int i72 = i71 % 2;
            iIntValue = i70;
        }
        z zVar = new z(iIntValue, charSequence.length());
        int i73 = b;
        int i74 = ((i73 & 106) + (i73 | 106)) - 1;
        int i75 = i74 % 128;
        a = i75;
        int i76 = i74 % 2;
        if (!(charSequence instanceof String)) {
            int i77 = zVar.d;
            int i78 = zVar.e;
            if (i78 > 0) {
                int i79 = b;
                int i80 = i79 & 27;
                int i81 = ((i79 | 27) & (~i80)) + (i80 << 1);
                a = i81 % 128;
                if (i81 % 2 != 0) {
                    int i82 = 73 / 0;
                    if (iIntValue > i77) {
                        if (i78 < 0) {
                            int i83 = b;
                            int i84 = i83 & 5;
                            i4 = ((i83 | 5) & (~i84)) + (i84 << 1);
                            i5 = i4 % 128;
                            a = i5;
                            if (i4 % 2 != 0) {
                                throw null;
                            }
                            if (i77 <= iIntValue) {
                                int i85 = i5 & 95;
                                int i86 = (~i85) & (i5 | 95);
                                int i87 = -(-(i85 << 1));
                                int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                                b = i88 % 128;
                                int i89 = i88 % 2;
                                int i90 = i5 & 115;
                                int i91 = ((i5 ^ 115) | i90) << 1;
                                int i92 = -((i5 | 115) & (~i90));
                                i6 = ((i91 | i92) << 1) - (i91 ^ i92);
                                b = i6 % 128;
                                if (i6 % 2 == 0) {
                                    int i93 = 2 % 3;
                                }
                            }
                        }
                    }
                } else if (iIntValue > i77) {
                    if (i78 < 0) {
                        int i810 = b;
                        int i811 = i810 & 5;
                        i4 = ((i810 | 5) & (~i811)) + (i811 << 1);
                        i5 = i4 % 128;
                        a = i5;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        if (i77 <= iIntValue) {
                            int i812 = i5 & 95;
                            int i813 = (~i812) & (i5 | 95);
                            int i814 = -(-(i812 << 1));
                            int i815 = ((i813 | i814) << 1) - (i814 ^ i813);
                            b = i815 % 128;
                            int i816 = i815 % 2;
                            int i94 = i5 & 115;
                            int i95 = ((i5 ^ 115) | i94) << 1;
                            int i96 = -((i5 | 115) & (~i94));
                            i6 = ((i95 | i96) << 1) - (i95 ^ i96);
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i97 = 2 % 3;
                            }
                        }
                    }
                }
                i7 = iIntValue;
                while (true) {
                    it = list2.iterator();
                    int i98 = b;
                    int i99 = i98 & 105;
                    i8 = (i99 - (~((i98 ^ 105) | i99))) - 1;
                    a = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i100 = 4 / 5;
                    }
                    while (true) {
                        if (!(!it.hasNext())) {
                            int i101 = b + 19;
                            a = i101 % 128;
                            int i102 = i101 % 2;
                            next = null;
                            break;
                        }
                        int i103 = a;
                        int i104 = i103 & 41;
                        int i105 = -(-((i103 ^ 41) | i104));
                        i10 = (i104 ^ i105) + ((i105 & i104) << 1);
                        b = i10 % 128;
                        if (i10 % 2 != 0) {
                            obj3.hashCode();
                            throw null;
                        }
                        next = it.next();
                        str3 = (String) next;
                        int i106 = b;
                        i11 = (((i106 & (-120)) | ((~i106) & 119)) - (~((i106 & 119) << 1))) - 1;
                        a = i11 % 128;
                        if (i11 % 2 != 0) {
                            if (B.av(str3, 0, charSequence, i7, str3.length(), z2)) {
                                int i107 = a;
                                int i108 = (((i107 & (-92)) | ((~i107) & 91)) - (~((i107 & 91) << 1))) - 1;
                                b = i108 % 128;
                                int i109 = i108 % 2;
                                break;
                            }
                        } else {
                            if (B.av(str3, 0, charSequence, i7, str3.length(), z2)) {
                                int i1010 = a;
                                int i1011 = (((i1010 & (-92)) | ((~i1010) & 91)) - (~((i1010 & 91) << 1))) - 1;
                                b = i1011 % 128;
                                int i1012 = i1011 % 2;
                                break;
                            }
                        }
                    }
                    str2 = (String) next;
                    if (str2 != null) {
                        aEVar = new aE(Integer.valueOf(i7), str2);
                        int i110 = a + 1;
                        int i111 = i110 % 128;
                        b = i111;
                        int i112 = i110 % 2;
                        int i113 = i111 & 87;
                        int i114 = ((((i111 ^ 87) | i113) << 1) - (~(-((i111 | 87) & (~i113))))) - 1;
                        a = i114 % 128;
                        int i115 = i114 % 2;
                        break;
                    }
                    if (i7 != i77) {
                        int i116 = a;
                        i9 = (((i116 | 29) << 1) - (~(-(((~i116) & 29) | (i116 & (-30)))))) - 1;
                        int i117 = i9 % 128;
                        b = i117;
                        if (i9 % 2 == 0) {
                            i7 = (-2) - ((i7 - (~(-i78))) ^ (-1));
                        } else {
                            int i118 = -(-i78);
                            int i119 = ((~i118) & i7) | ((~i7) & i118);
                            int i120 = -(-((i118 & i7) << 1));
                            i7 = (i119 & i120) + (i120 | i119);
                        }
                        int i121 = ((i117 | 123) << 1) - (i117 ^ 123);
                        a = i121 % 128;
                        int i122 = i121 % 2;
                    }
                }
            } else if (i78 < 0) {
                int i817 = b;
                int i818 = i817 & 5;
                i4 = ((i817 | 5) & (~i818)) + (i818 << 1);
                i5 = i4 % 128;
                a = i5;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (i77 <= iIntValue) {
                    int i819 = i5 & 95;
                    int i8110 = (~i819) & (i5 | 95);
                    int i8111 = -(-(i819 << 1));
                    int i8112 = ((i8110 | i8111) << 1) - (i8111 ^ i8110);
                    b = i8112 % 128;
                    int i8113 = i8112 % 2;
                    int i910 = i5 & 115;
                    int i911 = ((i5 ^ 115) | i910) << 1;
                    int i912 = -((i5 | 115) & (~i910));
                    i6 = ((i911 | i912) << 1) - (i911 ^ i912);
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i913 = 2 % 3;
                    }
                    i7 = iIntValue;
                    while (true) {
                        it = list2.iterator();
                        int i914 = b;
                        int i915 = i914 & 105;
                        i8 = (i915 - (~((i914 ^ 105) | i915))) - 1;
                        a = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i1013 = 4 / 5;
                        }
                        while (true) {
                            if (!(!it.hasNext())) {
                                int i1014 = b + 19;
                                a = i1014 % 128;
                                int i1015 = i1014 % 2;
                                next = null;
                                break;
                            }
                            int i1016 = a;
                            int i1017 = i1016 & 41;
                            int i1018 = -(-((i1016 ^ 41) | i1017));
                            i10 = (i1017 ^ i1018) + ((i1018 & i1017) << 1);
                            b = i10 % 128;
                            if (i10 % 2 != 0) {
                                obj3.hashCode();
                                throw null;
                            }
                            next = it.next();
                            str3 = (String) next;
                            int i1019 = b;
                            i11 = (((i1019 & (-120)) | ((~i1019) & 119)) - (~((i1019 & 119) << 1))) - 1;
                            a = i11 % 128;
                            if (i11 % 2 != 0) {
                                if (B.av(str3, 0, charSequence, i7, str3.length(), z2)) {
                                    int i10110 = a;
                                    int i10111 = (((i10110 & (-92)) | ((~i10110) & 91)) - (~((i10110 & 91) << 1))) - 1;
                                    b = i10111 % 128;
                                    int i10112 = i10111 % 2;
                                    break;
                                }
                            } else {
                                if (B.av(str3, 0, charSequence, i7, str3.length(), z2)) {
                                    int i10113 = a;
                                    int i10114 = (((i10113 & (-92)) | ((~i10113) & 91)) - (~((i10113 & 91) << 1))) - 1;
                                    b = i10114 % 128;
                                    int i10115 = i10114 % 2;
                                    break;
                                }
                            }
                        }
                        str2 = (String) next;
                        if (str2 != null) {
                            aEVar = new aE(Integer.valueOf(i7), str2);
                            int i1110 = a + 1;
                            int i1111 = i1110 % 128;
                            b = i1111;
                            int i1112 = i1110 % 2;
                            int i1113 = i1111 & 87;
                            int i1114 = ((((i1111 ^ 87) | i1113) << 1) - (~(-((i1111 | 87) & (~i1113))))) - 1;
                            a = i1114 % 128;
                            int i1115 = i1114 % 2;
                            break;
                        }
                        if (i7 != i77) {
                            int i1116 = a;
                            i9 = (((i1116 | 29) << 1) - (~(-(((~i1116) & 29) | (i1116 & (-30)))))) - 1;
                            int i1117 = i9 % 128;
                            b = i1117;
                            if (i9 % 2 == 0) {
                                i7 = (-2) - ((i7 - (~(-i78))) ^ (-1));
                            } else {
                                int i1118 = -(-i78);
                                int i1119 = ((~i1118) & i7) | ((~i7) & i1118);
                                int i123 = -(-((i1118 & i7) << 1));
                                i7 = (i1119 & i123) + (i123 | i1119);
                            }
                            int i124 = ((i1117 | 123) << 1) - (i1117 ^ 123);
                            a = i124 % 128;
                            int i125 = i124 % 2;
                        }
                    }
                }
            }
            int i4110 = b;
            int i4111 = ((i4110 | 75) << 1) - (i4110 ^ 75);
            a = i4111 % 128;
            int i4112 = i4111 % 2;
            aEVar = null;
            break;
        }
        int i126 = i75 | 75;
        int i127 = i126 << 1;
        int i128 = -((~(i75 & 75)) & i126);
        int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
        b = i129 % 128;
        int i130 = i129 % 2;
        int i131 = zVar.d;
        int i132 = zVar.e;
        if (i132 > 0) {
            int i133 = b;
            int i134 = i133 & 37;
            int i135 = (i133 | 37) & (~i134);
            int i136 = i134 << 1;
            int i137 = (i135 ^ i136) + ((i135 & i136) << 1);
            a = i137 % 128;
            int i138 = i137 % 2;
            if (iIntValue <= i131) {
                while (true) {
                    it2 = list2.iterator();
                    int i139 = a;
                    int i140 = (i139 & 69) + (i139 | 69);
                    b = i140 % 128;
                    int i141 = i140 % 2;
                    while (true) {
                        if (!it2.hasNext()) {
                            int i142 = b + 9;
                            a = i142 % 128;
                            int i143 = i142 % 2;
                            next2 = null;
                            break;
                        }
                        int i144 = a + 75;
                        b = i144 % 128;
                        int i145 = i144 % 2;
                        next2 = it2.next();
                        str5 = (String) next2;
                        int i146 = b;
                        i14 = (-2) - ((i146 + 102) ^ (-1));
                        a = i14 % 128;
                        if (i14 % 2 != 0) {
                            str6 = (String) charSequence;
                            i15 = 1;
                        } else {
                            str6 = (String) charSequence;
                            i15 = i22;
                        }
                        int i147 = i146 & 3;
                        int i148 = i147 + ((i146 ^ 3) | i147);
                        a = i148 % 128;
                        int i149 = i148 % 2;
                        if (ae.as(str5, i15, str6, iIntValue, str5.length(), z2)) {
                            int i150 = a;
                            int i151 = i150 & 49;
                            int i152 = (i150 ^ 49) | i151;
                            int i153 = (i151 & i152) + (i152 | i151);
                            b = i153 % 128;
                            int i154 = i153 % 2;
                            break;
                        }
                        i22 = 0;
                    }
                    str4 = (String) next2;
                    if (str4 != null) {
                        aEVar = new aE(Integer.valueOf(iIntValue), str4);
                        int i155 = a + 43;
                        int i156 = i155 % 128;
                        b = i156;
                        int i157 = i155 % 2;
                        int i158 = i156 & 89;
                        int i159 = -(-(i156 | 89));
                        int i160 = (i158 & i159) + (i158 | i159);
                        a = i160 % 128;
                        int i161 = i160 % 2;
                        break;
                    }
                    if (iIntValue != i131) {
                        int i162 = a;
                        int i163 = (((i162 ^ 19) | (i162 & 19)) << 1) - (((~i162) & 19) | (i162 & (-20)));
                        int i164 = i163 % 128;
                        b = i164;
                        int i165 = i163 % 2;
                        int i166 = -(~i132);
                        iIntValue = ((iIntValue & i166) + (iIntValue | i166)) - 1;
                        int i167 = i164 ^ 21;
                        int i168 = ((i164 & 21) | i167) << 1;
                        int i169 = -i167;
                        int i170 = (i168 ^ i169) + ((i168 & i169) << 1);
                        a = i170 % 128;
                        int i171 = i170 % 2;
                        i22 = 0;
                    }
                }
            } else if (i132 < 0) {
                int i172 = a;
                int i173 = i172 & 85;
                int i174 = (i173 - (~((i172 ^ 85) | i173))) - 1;
                i12 = i174 % 128;
                b = i12;
                int i175 = i174 % 2;
                if (i131 <= iIntValue) {
                    int i176 = i12 & 53;
                    int i177 = -(-((i12 ^ 53) | i176));
                    i13 = ((i176 | i177) << 1) - (i176 ^ i177);
                    a = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    int i178 = ((i12 ^ 102) + ((i12 & 102) << 1)) - 1;
                    a = i178 % 128;
                    int i179 = i178 % 2;
                    while (true) {
                        it2 = list2.iterator();
                        int i1310 = a;
                        int i1410 = (i1310 & 69) + (i1310 | 69);
                        b = i1410 % 128;
                        int i1411 = i1410 % 2;
                        while (true) {
                            if (!it2.hasNext()) {
                                int i1412 = b + 9;
                                a = i1412 % 128;
                                int i1413 = i1412 % 2;
                                next2 = null;
                                break;
                            }
                            int i1414 = a + 75;
                            b = i1414 % 128;
                            int i1415 = i1414 % 2;
                            next2 = it2.next();
                            str5 = (String) next2;
                            int i1416 = b;
                            i14 = (-2) - ((i1416 + 102) ^ (-1));
                            a = i14 % 128;
                            if (i14 % 2 != 0) {
                                str6 = (String) charSequence;
                                i15 = 1;
                            } else {
                                str6 = (String) charSequence;
                                i15 = i22;
                            }
                            int i1417 = i1416 & 3;
                            int i1418 = i1417 + ((i1416 ^ 3) | i1417);
                            a = i1418 % 128;
                            int i1419 = i1418 % 2;
                            if (ae.as(str5, i15, str6, iIntValue, str5.length(), z2)) {
                                int i1510 = a;
                                int i1511 = i1510 & 49;
                                int i1512 = (i1510 ^ 49) | i1511;
                                int i1513 = (i1511 & i1512) + (i1512 | i1511);
                                b = i1513 % 128;
                                int i1514 = i1513 % 2;
                                break;
                            }
                            i22 = 0;
                        }
                        str4 = (String) next2;
                        if (str4 != null) {
                            aEVar = new aE(Integer.valueOf(iIntValue), str4);
                            int i1515 = a + 43;
                            int i1516 = i1515 % 128;
                            b = i1516;
                            int i1517 = i1515 % 2;
                            int i1518 = i1516 & 89;
                            int i1519 = -(-(i1516 | 89));
                            int i1610 = (i1518 & i1519) + (i1518 | i1519);
                            a = i1610 % 128;
                            int i1611 = i1610 % 2;
                            break;
                        }
                        if (iIntValue != i131) {
                            int i1612 = a;
                            int i1613 = (((i1612 ^ 19) | (i1612 & 19)) << 1) - (((~i1612) & 19) | (i1612 & (-20)));
                            int i1614 = i1613 % 128;
                            b = i1614;
                            int i1615 = i1613 % 2;
                            int i1616 = -(~i132);
                            iIntValue = ((iIntValue & i1616) + (iIntValue | i1616)) - 1;
                            int i1617 = i1614 ^ 21;
                            int i1618 = ((i1614 & 21) | i1617) << 1;
                            int i1619 = -i1617;
                            int i1710 = (i1618 ^ i1619) + ((i1618 & i1619) << 1);
                            a = i1710 % 128;
                            int i1711 = i1710 % 2;
                            i22 = 0;
                        }
                    }
                }
            }
        } else if (i132 < 0) {
            int i1712 = a;
            int i1713 = i1712 & 85;
            int i1714 = (i1713 - (~((i1712 ^ 85) | i1713))) - 1;
            i12 = i1714 % 128;
            b = i12;
            int i1715 = i1714 % 2;
            if (i131 <= iIntValue) {
                int i1716 = i12 & 53;
                int i1717 = -(-((i12 ^ 53) | i1716));
                i13 = ((i1716 | i1717) << 1) - (i1716 ^ i1717);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                int i1718 = ((i12 ^ 102) + ((i12 & 102) << 1)) - 1;
                a = i1718 % 128;
                int i1719 = i1718 % 2;
                while (true) {
                    it2 = list2.iterator();
                    int i1311 = a;
                    int i14110 = (i1311 & 69) + (i1311 | 69);
                    b = i14110 % 128;
                    int i14111 = i14110 % 2;
                    while (true) {
                        if (!it2.hasNext()) {
                            int i14112 = b + 9;
                            a = i14112 % 128;
                            int i14113 = i14112 % 2;
                            next2 = null;
                            break;
                        }
                        int i14114 = a + 75;
                        b = i14114 % 128;
                        int i14115 = i14114 % 2;
                        next2 = it2.next();
                        str5 = (String) next2;
                        int i14116 = b;
                        i14 = (-2) - ((i14116 + 102) ^ (-1));
                        a = i14 % 128;
                        if (i14 % 2 != 0) {
                            str6 = (String) charSequence;
                            i15 = 1;
                        } else {
                            str6 = (String) charSequence;
                            i15 = i22;
                        }
                        int i14117 = i14116 & 3;
                        int i14118 = i14117 + ((i14116 ^ 3) | i14117);
                        a = i14118 % 128;
                        int i14119 = i14118 % 2;
                        if (ae.as(str5, i15, str6, iIntValue, str5.length(), z2)) {
                            int i15110 = a;
                            int i15111 = i15110 & 49;
                            int i15112 = (i15110 ^ 49) | i15111;
                            int i15113 = (i15111 & i15112) + (i15112 | i15111);
                            b = i15113 % 128;
                            int i15114 = i15113 % 2;
                            break;
                        }
                        i22 = 0;
                    }
                    str4 = (String) next2;
                    if (str4 != null) {
                        aEVar = new aE(Integer.valueOf(iIntValue), str4);
                        int i15115 = a + 43;
                        int i15116 = i15115 % 128;
                        b = i15116;
                        int i15117 = i15115 % 2;
                        int i15118 = i15116 & 89;
                        int i15119 = -(-(i15116 | 89));
                        int i16110 = (i15118 & i15119) + (i15118 | i15119);
                        a = i16110 % 128;
                        int i16111 = i16110 % 2;
                        break;
                    }
                    if (iIntValue != i131) {
                        int i16112 = a;
                        int i16113 = (((i16112 ^ 19) | (i16112 & 19)) << 1) - (((~i16112) & 19) | (i16112 & (-20)));
                        int i16114 = i16113 % 128;
                        b = i16114;
                        int i16115 = i16113 % 2;
                        int i16116 = -(~i132);
                        iIntValue = ((iIntValue & i16116) + (iIntValue | i16116)) - 1;
                        int i16117 = i16114 ^ 21;
                        int i16118 = ((i16114 & 21) | i16117) << 1;
                        int i16119 = -i16117;
                        int i17110 = (i16118 ^ i16119) + ((i16118 & i16119) << 1);
                        a = i17110 % 128;
                        int i17111 = i17110 % 2;
                        i22 = 0;
                    }
                }
            }
        }
        int i4113 = b;
        int i4114 = ((i4113 | 75) << 1) - (i4113 ^ 75);
        a = i4114 % 128;
        int i4115 = i4114 % 2;
        aEVar = null;
        break;
        if (aEVar != null) {
            int i4116 = a;
            int i4117 = i4116 & 113;
            int i5110 = (i4116 ^ 113) | i4117;
            i3 = (i4117 & i5110) + (i5110 | i4117);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                A a4 = aEVar.c;
                throw null;
            }
            aEVar2 = new aE(aEVar.c, Integer.valueOf(((String) aEVar.d).length()));
            int i5111 = a;
            int i5112 = (i5111 ^ 99) + ((i5111 & 99) << 1);
            int i5113 = i5112 % 128;
            b = i5113;
            int i5114 = i5112 % 2;
            int i5115 = i5113 & 121;
            int i5116 = (i5113 ^ 121) | i5115;
            int i5117 = ((i5115 | i5116) << 1) - (i5116 ^ i5115);
            a = i5117 % 128;
            int i5118 = i5117 % 2;
        } else {
            aEVar2 = null;
        }
        int i5119 = b;
        int i610 = i5119 & 51;
        int i611 = -(-((i5119 ^ 51) | i610));
        i2 = (i610 & i611) + (i611 | i610);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return aEVar2;
        }
        throw null;
    }
}
