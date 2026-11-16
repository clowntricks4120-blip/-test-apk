package ivas.gov.bisp.enumeration.cJ;

import android.support.v4.media.session.IMediaSession;
import ivas.gov.bisp.enumeration.cP.A;
import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import ivas.gov.bisp.enumeration.cP.T;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static int a = 0;
    private static int b = 1;
    public ArrayList<Object> c = new ArrayList<>();
    public Object d;

    public static abstract class bDS implements l, t {
        private static int a = 0;
        private static int b = 1;
        public final AbstractC0246t c;
        public final int d;
        public final boolean e;

        public bDS(AbstractC0246t abstractC0246t, int i, boolean z) {
            this.c = abstractC0246t;
            this.d = i;
            this.e = z;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-126)) | ((~i2) & 125);
            int i4 = -(-((i2 & 125) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            a = i6;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i7 = this.d;
            int i8 = ((i6 & 124) + (i6 | 124)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return i7;
        }

        /* JADX WARN: Code duplicated, block: B:133:0x01c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x0158  */
        /* JADX WARN: Code duplicated, block: B:49:0x0163  */
        /* JADX WARN: Code duplicated, block: B:51:0x0172  */
        /* JADX WARN: Code duplicated, block: B:52:0x0183  */
        /* JADX WARN: Code duplicated, block: B:96:0x0352  */
        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int j(e eVar, CharSequence charSequence, int i) {
            int i2;
            int length;
            int i3;
            int i4;
            int i5;
            char cCharAt;
            int i6;
            CharSequence charSequenceSubSequence;
            boolean z;
            int i7;
            int i8;
            int i9;
            int length2;
            int i10 = 2 % 2;
            int i11 = a;
            int i12 = (((i11 | 66) << 1) - (i11 ^ 66)) - 1;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                i2 = this.d;
                length = charSequence.length() << i;
            } else {
                i2 = this.d;
                length = charSequence.length() - i;
            }
            int iMin = Math.min(i2, length);
            int i13 = b;
            int i14 = (i13 | 23) << 1;
            int i15 = -(i13 ^ 23);
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            int i19 = (i17 ^ 85) + ((i17 & 85) << 1);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 5 % 4;
            }
            boolean z2 = false;
            boolean z3 = false;
            int i21 = 0;
            while (true) {
                if (i21 < iMin) {
                    int i22 = a;
                    int i23 = i22 & 59;
                    int i24 = (i23 - (~(-(-((i22 ^ 59) | i23))))) - 1;
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    int i26 = -(-i21);
                    int i27 = (((~i26) & i) | ((~i) & i26)) + ((i26 & i) << 1);
                    char cCharAt2 = charSequence.charAt(i27);
                    int i28 = b;
                    int i29 = (i28 & (-70)) | (69 & (~i28));
                    int i30 = -(-((i28 & 69) << 1));
                    int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                    int i32 = i31 % 128;
                    a = i32;
                    if (i31 % 2 != 0) {
                        throw null;
                    }
                    if (i21 == 0) {
                        int i33 = (((i32 | 10) << 1) - (i32 ^ 10)) - 1;
                        b = i33 % 128;
                        int i34 = i33 % 2;
                        if (cCharAt2 != '-') {
                            int i35 = i32 + 97;
                            b = i35 % 128;
                            if (i35 % 2 != 0 ? cCharAt2 == '+' : cCharAt2 == 'z') {
                            }
                        }
                        if (this.e) {
                            int i36 = i32 + 37;
                            int i37 = i36 % 128;
                            b = i37;
                            if (i36 % 2 == 0) {
                                if (cCharAt2 == 16) {
                                    z = false;
                                    int i38 = i32 + 65;
                                    b = i38 % 128;
                                    int i39 = i38 % 2;
                                    z2 = true;
                                } else {
                                    z = false;
                                    int i40 = i37 | 55;
                                    int i41 = i40 << 1;
                                    int i42 = -(i40 & (~(i37 & 55)));
                                    int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                                    a = i43 % 128;
                                    int i44 = i43 % 2;
                                    z2 = false;
                                }
                            } else if (cCharAt2 == '-') {
                                z = true;
                                int i310 = i32 + 65;
                                b = i310 % 128;
                                int i311 = i310 % 2;
                                z2 = true;
                            } else {
                                z = true;
                                int i45 = i37 | 55;
                                int i46 = i45 << 1;
                                int i47 = -(i45 & (~(i37 & 55)));
                                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                                a = i48 % 128;
                                int i49 = i48 % 2;
                                z2 = false;
                            }
                            if (cCharAt2 != '+') {
                                int i50 = b;
                                int i51 = i50 ^ 61;
                                int i52 = ((i50 & 61) | i51) << 1;
                                int i53 = -i51;
                                int i54 = (i52 & i53) + (i53 | i52);
                                a = i54 % 128;
                                int i55 = i54 % 2;
                                int i56 = (i50 & (-24)) | ((~i50) & 23);
                                int i57 = (i50 & 23) << 1;
                                int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                                a = i58 % 128;
                                int i59 = i58 % 2;
                                z3 = false;
                            } else {
                                z3 = z;
                            }
                            int i60 = ((i21 | 1) << 1) - (i21 ^ 1);
                            if (i60 < iMin) {
                                int i61 = b;
                                int i62 = i61 ^ 85;
                                int i63 = (((i61 & 85) | i62) << 1) - i62;
                                a = i63 % 128;
                                int i64 = i63 % 2;
                                int i65 = i27 ^ 1;
                                char cCharAt3 = charSequence.charAt(((((i27 & 1) | i65) << 1) - (~(-i65))) - 1);
                                int i66 = a;
                                int i67 = ((i66 & 110) + (i66 | 110)) - 1;
                                int i68 = i67 % 128;
                                b = i68;
                                if (i67 % 2 == 0) {
                                    if (cCharAt3 >= 'n') {
                                        int i69 = i68 + 95;
                                        i7 = i69 % 128;
                                        a = i7;
                                        int i70 = i69 % 2;
                                        if (cCharAt3 <= '9') {
                                            i8 = (((i7 | 124) << 1) - (i7 ^ 124)) - 1;
                                            b = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                i9 = (((iMin ^ (-1)) | iMin) << 1) - (~iMin);
                                                length2 = (charSequence.length() - (~(-(~(-i))))) - 2;
                                            } else {
                                                i9 = ((iMin & 1) - (~(-(-(iMin | 1))))) - 1;
                                                length2 = (charSequence.length() - (~(-i))) - 1;
                                            }
                                            int i71 = b;
                                            int i72 = i71 & 53;
                                            int i73 = ((i71 ^ 53) | i72) << 1;
                                            int i74 = -((i71 | 53) & (~i72));
                                            int i75 = (i73 & i74) + (i74 | i73);
                                            a = i75 % 128;
                                            int i76 = i75 % 2;
                                            iMin = Math.min(i9, length2);
                                            int i77 = b;
                                            int i78 = (i77 & (-58)) | ((~i77) & 57);
                                            int i79 = (i77 & 57) << 1;
                                            int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                                            a = i80 % 128;
                                            int i81 = i80 % 2;
                                            i21 = i60;
                                        }
                                    }
                                } else if (cCharAt3 >= '0') {
                                    int i610 = i68 + 95;
                                    i7 = i610 % 128;
                                    a = i7;
                                    int i710 = i610 % 2;
                                    if (cCharAt3 <= '9') {
                                        i8 = (((i7 | 124) << 1) - (i7 ^ 124)) - 1;
                                        b = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            i9 = (((iMin ^ (-1)) | iMin) << 1) - (~iMin);
                                            length2 = (charSequence.length() - (~(-(~(-i))))) - 2;
                                        } else {
                                            i9 = ((iMin & 1) - (~(-(-(iMin | 1))))) - 1;
                                            length2 = (charSequence.length() - (~(-i))) - 1;
                                        }
                                        int i711 = b;
                                        int i712 = i711 & 53;
                                        int i713 = ((i711 ^ 53) | i712) << 1;
                                        int i714 = -((i711 | 53) & (~i712));
                                        int i715 = (i713 & i714) + (i714 | i713);
                                        a = i715 % 128;
                                        int i716 = i715 % 2;
                                        iMin = Math.min(i9, length2);
                                        int i717 = b;
                                        int i718 = (i717 & (-58)) | ((~i717) & 57);
                                        int i719 = (i717 & 57) << 1;
                                        int i82 = ((i718 | i719) << 1) - (i719 ^ i718);
                                        a = i82 % 128;
                                        int i83 = i82 % 2;
                                        i21 = i60;
                                    }
                                }
                            }
                            int i84 = a;
                            int i85 = ((i84 & (-120)) | ((~i84) & 119)) + ((i84 & 119) << 1);
                            b = i85 % 128;
                            if (i85 % 2 == 0) {
                                int i86 = 4 % 4;
                            }
                        }
                    }
                    if (cCharAt2 >= '0') {
                        int i87 = b;
                        int i88 = ((i87 ^ 98) + ((i87 & 98) << 1)) - 1;
                        int i89 = i88 % 128;
                        a = i89;
                        int i90 = i88 % 2;
                        if (cCharAt2 > '9') {
                            int i91 = ((i89 ^ 121) | (i89 & 121)) << 1;
                            int i92 = -((i89 & (-122)) | ((~i89) & 121));
                            int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
                            int i94 = i93 % 128;
                            b = i94;
                            int i95 = i93 % 2;
                            int i96 = i94 ^ 77;
                            int i97 = -(-((i94 & 77) << 1));
                            int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                            a = i98 % 128;
                            int i99 = i98 % 2;
                        } else {
                            int i100 = i21 & 31;
                            int i101 = (i21 ^ 31) | i100;
                            int i102 = (i100 ^ i101) + ((i100 & i101) << 1);
                            int i103 = (i102 | (-30)) << 1;
                            int i104 = -((i102 & 29) | ((~i102) & (-30)));
                            i21 = (i103 & i104) + (i103 | i104);
                            int i105 = i89 & 113;
                            int i106 = -(-(i89 | 113));
                            int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                            b = i107 % 128;
                            int i108 = i107 % 2;
                        }
                    }
                }
                if (i21 == 0) {
                    int i109 = b;
                    int i110 = i109 & 107;
                    int i111 = (i109 ^ 107) | i110;
                    int i112 = (i110 & i111) + (i111 | i110);
                    a = i112 % 128;
                    return i112 % 2 != 0 ? (~i) | i : (~i) & (i | (~i));
                }
                if (i21 >= 9) {
                    int i113 = b;
                    int i114 = i113 & 45;
                    int i115 = (i114 - (~((i113 ^ 45) | i114))) - 1;
                    a = i115 % 128;
                    int i116 = i115 % 2;
                    if (z3) {
                        int i117 = ((i113 & 111) - (~(i113 | 111))) - 1;
                        a = i117 % 128;
                        if (i117 % 2 != 0) {
                            int i118 = -i21;
                            int i119 = i & i118;
                            int i120 = (i118 | i) & (~i119);
                            int i121 = i119 << 1;
                            i5 = (i120 & i121) + (i120 | i121);
                            int i122 = i << 1;
                            int i123 = -i;
                            charSequenceSubSequence = charSequence.subSequence((i122 ^ i123) + ((i123 & i122) << 1), i5);
                        } else {
                            int i124 = i & i21;
                            int i125 = (~i124) & (i | i21);
                            int i126 = -(-(i124 << 1));
                            i5 = (i125 & i126) + (i126 | i125);
                            charSequenceSubSequence = charSequence.subSequence((i & 1) + (i | 1), i5);
                        }
                        i4 = Integer.parseInt(charSequenceSubSequence.toString());
                        int i127 = a;
                        int i128 = i127 & 3;
                        int i129 = (i127 ^ 3) | i128;
                        i6 = ((i128 | i129) << 1) - (i129 ^ i128);
                        b = i6 % 128;
                    } else {
                        int i130 = ((i ^ i21) | (i & i21)) << 1;
                        int i131 = -(((~i21) & i) | ((~i) & i21));
                        i5 = (i130 ^ i131) + ((i130 & i131) << 1);
                        CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, i5);
                        int i132 = a;
                        int i133 = (i132 ^ 115) + ((i132 & 115) << 1);
                        b = i133 % 128;
                        if (i133 % 2 == 0) {
                            Integer.parseInt(charSequenceSubSequence2.toString());
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        i4 = Integer.parseInt(charSequenceSubSequence2.toString());
                        int i134 = b;
                        int i135 = i134 ^ 11;
                        int i136 = ((i134 & 11) | i135) << 1;
                        int i137 = -i135;
                        i6 = (i136 ^ i137) + ((i136 & i137) << 1);
                        a = i6 % 128;
                    }
                    int i138 = i6 % 2;
                } else {
                    if (z2) {
                        int i139 = i | 1;
                        int i140 = i139 << 1;
                        int i141 = -(i139 & (~(i & 1)));
                        i3 = (i140 & i141) + (i141 | i140);
                        int i142 = a;
                        int i143 = ((i142 & (-66)) | ((~i142) & 65)) + ((i142 & 65) << 1);
                        b = i143 % 128;
                        int i144 = i143 % 2;
                    } else {
                        int i145 = b;
                        int i146 = i145 ^ 19;
                        int i147 = (i145 & 19) << 1;
                        int i148 = (i146 ^ i147) + ((i147 & i146) << 1);
                        int i149 = i148 % 128;
                        a = i149;
                        int i150 = i148 % 2;
                        if (z3) {
                            int i1310 = i | 1;
                            int i1410 = i1310 << 1;
                            int i1411 = -(i1310 & (~(i & 1)));
                            i3 = (i1410 & i1411) + (i1411 | i1410);
                            int i1412 = a;
                            int i1413 = ((i1412 & (-66)) | ((~i1412) & 65)) + ((i1412 & 65) << 1);
                            b = i1413 % 128;
                            int i1414 = i1413 % 2;
                        } else {
                            int i151 = i149 + 109;
                            b = i151 % 128;
                            if (i151 % 2 == 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            int i152 = ((i149 & 15) - (~(i149 | 15))) - 1;
                            b = i152 % 128;
                            int i153 = i152 % 2;
                            i3 = i;
                        }
                    }
                    int i154 = (i3 & 1) + (i3 | 1);
                    try {
                        char cCharAt4 = charSequence.charAt(i3);
                        int i155 = a;
                        int i156 = i155 ^ 23;
                        int i157 = -(-((i155 & 23) << 1));
                        int i158 = (i156 ^ i157) + ((i157 & i156) << 1);
                        int i159 = i158 % 128;
                        b = i159;
                        int i160 = i158 % 2;
                        int i161 = cCharAt4 & 65488;
                        int i162 = i161 + ((cCharAt4 ^ 65488) | i161);
                        int i163 = -(~(-(-i21)));
                        int i164 = (i & i163) + (i | i163);
                        int i165 = (i164 ^ (-1)) + (i164 << 1);
                        int i166 = i159 + 113;
                        int i167 = i166 % 128;
                        a = i167;
                        if (i166 % 2 != 0) {
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        int i168 = ((i167 & (-4)) | ((~i167) & 3)) + ((i167 & 3) << 1);
                        b = i168 % 128;
                        int i169 = i168 % 2;
                        while (i154 < i165) {
                            int i170 = b;
                            int i171 = (i170 ^ 103) + ((i170 & 103) << 1);
                            a = i171 % 128;
                            if (i171 % 2 != 0) {
                                cCharAt = charSequence.charAt(i154);
                                int i172 = i154 & 37;
                                int i173 = (i154 ^ 37) | i172;
                                i154 = (i172 ^ i173) + ((i173 & i172) << 1);
                            } else {
                                cCharAt = charSequence.charAt(i154);
                                i154++;
                            }
                            int i174 = (-2) - ((a + 14) ^ (-1));
                            int i175 = i174 % 128;
                            b = i175;
                            int i176 = i174 % 2;
                            int i177 = i162 << 3;
                            int i178 = i162 << 1;
                            int i179 = i177 & i178;
                            int i180 = -(-((i177 ^ i178) | i179));
                            int i181 = -(-((i179 ^ i180) + ((i180 & i179) << 1)));
                            int i182 = ((cCharAt | i181) << 1) - (cCharAt ^ i181);
                            int i183 = i175 + 71;
                            a = i183 % 128;
                            i162 = i183 % 2 != 0 ? i182 >> 48 : (i182 & (-48)) + (i182 | (-48));
                        }
                        if (z2) {
                            int i184 = b + 65;
                            a = i184 % 128;
                            if (i184 % 2 != 0) {
                                throw null;
                            }
                            i4 = -i162;
                        } else {
                            i4 = i162;
                        }
                        int i185 = a;
                        int i186 = i185 | 27;
                        int i187 = i186 << 1;
                        int i188 = -((~(i185 & 27)) & i186);
                        int i189 = (i187 ^ i188) + ((i188 & i187) << 1);
                        b = i189 % 128;
                        int i190 = i189 % 2;
                        i5 = i165;
                    } catch (StringIndexOutOfBoundsException unused) {
                        return ~i;
                    }
                }
                eVar.h(this.c, i4);
                int i191 = a;
                int i192 = i191 & 75;
                int i193 = ((i191 ^ 75) | i192) << 1;
                int i194 = -((i191 | 75) & (~i192));
                int i195 = ((i193 | i194) << 1) - (i194 ^ i193);
                b = i195 % 128;
                int i196 = i195 % 2;
                return i5;
            }
        }
    }

    public static class bDT extends bDS {
        private static int a = 0;
        private static int b = 1;
        public final int f;

        public bDT(AbstractC0246t abstractC0246t, int i, boolean z, int i2) {
            super(abstractC0246t, i, z);
            this.f = i2;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void f(Appendable appendable, A a2, Locale locale) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 76) + (i2 | 76);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            if (a2.h(this.c)) {
                int i6 = a + 63;
                b = i6 % 128;
                int i7 = i6 % 2;
                try {
                    int iV = a2.v(this.c);
                    int i8 = b;
                    int i9 = (i8 ^ 7) + ((i8 & 7) << 1);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    z.b(appendable, iV, this.f);
                    int i11 = b + 62;
                    int i12 = (i11 ^ (-1)) + (i11 << 1);
                    a = i12 % 128;
                    if (i12 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (RuntimeException unused) {
                }
            }
            h.c(appendable, this.f);
            int i13 = b;
            int i14 = i13 ^ 51;
            int i15 = ((i13 & 51) | i14) << 1;
            int i16 = -i14;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            int i18 = i17 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 125;
            int i4 = ((i2 | 125) & (~i3)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.d;
            if (i5 == 0) {
                return i6;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i, AbstractC0242a abstractC0242a, Locale locale) throws IOException {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 | 56) << 1) - (i3 ^ 56)) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            try {
                ivas.gov.bisp.enumeration.cP.P pC = this.c.c(hVar);
                int i6 = b + 45;
                a = i6 % 128;
                int i7 = i6 % 2;
                z.b(appendable, pC.f(j), this.f);
                int i8 = b;
                int i9 = i8 ^ 13;
                int i10 = (((i8 & 13) | i9) << 1) - i9;
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RuntimeException unused) {
                h.c(appendable, this.f);
            }
        }
    }

    public static class bDX implements l, t {
        private static int a = 0;
        private static int b = 1;
        public final String c;

        public bDX(String str) {
            this.c = str;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i = 2 % 2;
            int i2 = b + 39;
            a = i2 % 128;
            int i3 = i2 % 2;
            int length = this.c.length();
            int i4 = a;
            int i5 = ((i4 & (-84)) | ((~i4) & 83)) + ((i4 & 83) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            return length;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void f(Appendable appendable, A a2, Locale locale) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 69) + (i2 | 69);
            b = i3 % 128;
            int i4 = i3 % 2;
            appendable.append(this.c);
            int i5 = b;
            int i6 = (i5 & 37) + (i5 | 37);
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i = 2 % 2;
            int i2 = b + 15;
            a = i2 % 128;
            int i3 = i2 % 2;
            int length = this.c.length();
            int i4 = a;
            int i5 = ((((i4 ^ 39) | (i4 & 39)) << 1) - (~(-(((~i4) & 39) | (i4 & (-40)))))) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
            return length;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i, AbstractC0242a abstractC0242a, Locale locale) throws IOException {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 9;
            int i5 = -(-((i3 ^ 9) | i4));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            appendable.append(this.c);
            int i8 = b + 111;
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int j(e eVar, CharSequence charSequence, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 83;
            int i5 = (i4 - (~(-(-((i3 ^ 83) | i4))))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            if (!h.d(charSequence, i, this.c)) {
                int i7 = ~i;
                int i8 = a + 103;
                b = i8 % 128;
                int i9 = i8 % 2;
                return i7;
            }
            int i10 = a;
            int i11 = ((i10 | 91) << 1) - (i10 ^ 91);
            b = i11 % 128;
            int length = i11 % 2 == 0 ? this.c.length() >>> i : this.c.length() + i;
            int i12 = (-2) - ((b + 18) ^ (-1));
            a = i12 % 128;
            int i13 = i12 % 2;
            return length;
        }
    }

    public static class bEb implements l, t {
        private static int a = 1;
        private static int b;
        public final String c;
        public final String d;
        public final boolean e;
        public final int f;
        public final int g;

        public bEb(String str, String str2, boolean z, int i, int i2) {
            this.c = str;
            this.d = str2;
            this.e = z;
            if (i <= 0 || i2 < i) {
                throw new IllegalArgumentException();
            }
            int i3 = a;
            int i4 = i3 & 75;
            int i5 = -(-((i3 ^ 75) | i4));
            int i6 = (i4 & i5) + (i5 | i4);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 == 0 ? i > 4 : i > 3) {
                int i8 = i7 ^ 37;
                int i9 = (i7 & 37) << 1;
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
                i = 4;
                i2 = 4;
            }
            this.g = i;
            this.f = i2;
            int i13 = a;
            int i14 = i13 & 15;
            int i15 = i14 + ((i13 ^ 15) | i14);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-18)) | ((~i2) & 17)) - (~(-(-((i2 & 17) << 1))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            int iP = p();
            int i5 = b;
            int i6 = i5 & 43;
            int i7 = ((i5 ^ 43) | i6) << 1;
            int i8 = -((i5 | 43) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return iP;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void f(Appendable appendable, A a2, Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 31;
            int i4 = ((i2 ^ 31) | i3) << 1;
            int i5 = -((i2 | 31) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 13 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0070 A[PHI: r4
  0x0070: PHI (r4v6 char) = (r4v5 char), (r4v16 char) binds: [B:13:0x006e, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0074 A[LOOP:0: B:6:0x0031->B:16:0x0074, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:25:0x00b1 A[EDGE_INSN: B:25:0x00b1->B:17:0x00b1 BREAK  A[LOOP:0: B:6:0x0031->B:16:0x0074], SYNTHETIC] */
        public final int c(CharSequence charSequence, int i, int i2) {
            char cCharAt;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 & 49;
            int i6 = -(-((i4 ^ 49) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            int iMin = Math.min((charSequence.length() - (~(-i))) - 1, i2);
            int i9 = b + 75;
            a = i9 % 128;
            int i10 = i9 % 2 == 0 ? 1 : 0;
            while (iMin > 0) {
                int i11 = a;
                int i12 = (i11 & (-112)) | ((~i11) & 111);
                int i13 = (i11 & 111) << 1;
                int i14 = (i12 & i13) + (i13 | i12);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = -(~i10);
                    cCharAt = charSequence.charAt((((i | i15) << 1) - (i15 ^ i)) - 1);
                    if (cCharAt < '0') {
                        break;
                    }
                    if (cCharAt <= '9') {
                        break;
                        break;
                    }
                    int i16 = b;
                    int i17 = i16 & 37;
                    int i18 = ((~i17) & (i16 | 37)) + (i17 << 1);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    int i20 = i10 & (-109);
                    int i21 = (i10 ^ (-109)) | i20;
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    int i23 = (i22 & (-111)) | ((~i22) & 110);
                    int i24 = -(-((i22 & 110) << 1));
                    i10 = ((i23 | i24) << 1) - (i23 ^ i24);
                    int i25 = -(~iMin);
                    iMin = (i25 | (-2)) + ((-2) & i25);
                    int i26 = (i16 & 31) + (i16 | 31);
                    a = i26 % 128;
                    int i27 = i26 % 2;
                } else {
                    int i28 = -(~(-i10));
                    cCharAt = charSequence.charAt((-2) - (((i & i28) + (i28 | i)) ^ (-1)));
                    if (cCharAt < '=') {
                        break;
                    }
                    if (cCharAt <= '9') {
                        break;
                    }
                    int i110 = b;
                    int i111 = i110 & 37;
                    int i112 = ((~i111) & (i110 | 37)) + (i111 << 1);
                    a = i112 % 128;
                    int i113 = i112 % 2;
                    int i29 = i10 & (-109);
                    int i210 = (i10 ^ (-109)) | i29;
                    int i211 = (i29 ^ i210) + ((i210 & i29) << 1);
                    int i212 = (i211 & (-111)) | ((~i211) & 110);
                    int i213 = -(-((i211 & 110) << 1));
                    i10 = ((i212 | i213) << 1) - (i212 ^ i213);
                    int i214 = -(~iMin);
                    iMin = (i214 | (-2)) + ((-2) & i214);
                    int i215 = (i110 & 31) + (i110 | 31);
                    a = i215 % 128;
                    int i216 = i215 % 2;
                }
            }
            int i30 = a;
            int i31 = i30 & 123;
            int i32 = (i30 | 123) & (~i31);
            int i33 = i31 << 1;
            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
            b = i34 % 128;
            if (i34 % 2 == 0) {
                return i10;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x003f A[PHI: r2 r4
  0x003f: PHI (r2v6 int) = (r2v5 int), (r2v22 int) binds: [B:8:0x003c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r4v11 int) = (r4v10 int), (r4v16 int) binds: [B:8:0x003c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i;
            int length;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 13) | (i3 & 13)) << 1;
            int i5 = -((i3 & (-14)) | ((~i3) & 13));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                i = this.g;
                length = 0;
                if (this.e) {
                    int i7 = i - 1;
                    length = (length & i7) + (i7 | length);
                    int i8 = i3 + 27;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else {
                i = this.g;
                int i10 = i ^ 1;
                int i11 = -(-((i & 1) << 1));
                length = ((i10 & i11) + (i10 | i11)) << 1;
                if (!(!this.e)) {
                    int i12 = i - 1;
                    length = (length & i12) + (i12 | length);
                    int i13 = i3 + 27;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            String str = this.c;
            if (str != null) {
                int i15 = (i3 ^ 15) + ((i3 & 15) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
                if (str.length() > length) {
                    int i17 = b;
                    int i18 = (i17 & (-100)) | ((~i17) & 99);
                    int i19 = (i17 & 99) << 1;
                    int i20 = (i18 & i19) + (i19 | i18);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    length = this.c.length();
                    int i22 = b;
                    int i23 = i22 & 93;
                    int i24 = (i23 - (~(-(-((i22 ^ 93) | i23))))) - 1;
                    a = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            int i26 = b;
            int i27 = ((i26 | 101) << 1) - (i26 ^ 101);
            a = i27 % 128;
            if (i27 % 2 != 0) {
                return length;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0274  */
        /* JADX WARN: Code duplicated, block: B:103:0x027c  */
        /* JADX WARN: Code duplicated, block: B:105:0x029d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:106:0x029e  */
        /* JADX WARN: Code duplicated, block: B:107:0x029f  */
        /* JADX WARN: Code duplicated, block: B:109:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:111:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:112:0x02f1  */
        /* JADX WARN: Code duplicated, block: B:114:0x02f5  */
        /* JADX WARN: Code duplicated, block: B:117:0x02fa  */
        /* JADX WARN: Code duplicated, block: B:119:0x030e  */
        /* JADX WARN: Code duplicated, block: B:11:0x0050  */
        /* JADX WARN: Code duplicated, block: B:121:0x0319  */
        /* JADX WARN: Code duplicated, block: B:122:0x031e  */
        /* JADX WARN: Code duplicated, block: B:123:0x0349 A[PHI: r5 r12
  0x0349: PHI (r5v46 int) = (r5v45 int), (r5v94 int) binds: [B:115:0x02f7, B:122:0x031e] A[DONT_GENERATE, DONT_INLINE]
  0x0349: PHI (r12v7 int) = (r12v6 int), (r12v33 int) binds: [B:115:0x02f7, B:122:0x031e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:125:0x034f  */
        /* JADX WARN: Code duplicated, block: B:127:0x035e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:128:0x0360  */
        /* JADX WARN: Code duplicated, block: B:129:0x0369  */
        /* JADX WARN: Code duplicated, block: B:130:0x036a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:131:0x036c  */
        /* JADX WARN: Code duplicated, block: B:133:0x0386  */
        /* JADX WARN: Code duplicated, block: B:135:0x038e  */
        /* JADX WARN: Code duplicated, block: B:137:0x0390  */
        /* JADX WARN: Code duplicated, block: B:139:0x03a7  */
        /* JADX WARN: Code duplicated, block: B:13:0x0065  */
        /* JADX WARN: Code duplicated, block: B:140:0x03cd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:141:0x03cf  */
        /* JADX WARN: Code duplicated, block: B:143:0x03e8  */
        /* JADX WARN: Code duplicated, block: B:145:0x03fe  */
        /* JADX WARN: Code duplicated, block: B:148:0x0407  */
        /* JADX WARN: Code duplicated, block: B:14:0x0067  */
        /* JADX WARN: Code duplicated, block: B:154:0x0451 A[PHI: r5
  0x0451: PHI (r5v52 int) = (r5v51 int), (r5v82 int) binds: [B:140:0x03cd, B:153:0x0438] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:156:0x0458  */
        /* JADX WARN: Code duplicated, block: B:158:0x0469 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:159:0x046b  */
        /* JADX WARN: Code duplicated, block: B:160:0x0487  */
        /* JADX WARN: Code duplicated, block: B:162:0x048b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:163:0x048d  */
        /* JADX WARN: Code duplicated, block: B:165:0x04a3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:166:0x04a4  */
        /* JADX WARN: Code duplicated, block: B:167:0x04a5  */
        /* JADX WARN: Code duplicated, block: B:169:0x04c9  */
        /* JADX WARN: Code duplicated, block: B:16:0x006d  */
        /* JADX WARN: Code duplicated, block: B:172:0x04d2  */
        /* JADX WARN: Code duplicated, block: B:174:0x04f6 A[PHI: r3
  0x04f6: PHI (r3v24 int) = (r3v23 int), (r3v36 int) binds: [B:173:0x04f4, B:170:0x04cf] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:176:0x0540  */
        /* JADX WARN: Code duplicated, block: B:177:0x0566 A[PHI: r3
  0x0566: PHI (r3v35 int) = (r3v23 int), (r3v36 int) binds: [B:173:0x04f4, B:170:0x04cf] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x0082  */
        /* JADX WARN: Code duplicated, block: B:22:0x0086  */
        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:74:0x01bb A[PHI: r5
  0x01bb: PHI (r5v40 int) = (r5v39 int), (r5v98 int) binds: [B:73:0x01b9, B:70:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:77:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:79:0x01d5 A[PHI: r5 r9
  0x01d5: PHI (r5v42 int) = (r5v39 int), (r5v98 int) binds: [B:73:0x01b9, B:70:0x01a5] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r9v11 int) = (r9v6 int), (r9v91 int) binds: [B:73:0x01b9, B:70:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:81:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:83:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:86:0x0211 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:87:0x0213  */
        /* JADX WARN: Code duplicated, block: B:89:0x0220  */
        /* JADX WARN: Code duplicated, block: B:92:0x0239  */
        /* JADX WARN: Code duplicated, block: B:94:0x024c  */
        /* JADX WARN: Code duplicated, block: B:95:0x0255 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:96:0x0257  */
        /* JADX WARN: Code duplicated, block: B:98:0x0271 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:99:0x0272  */
        /* JADX WARN: Code duplicated, block: B:9:0x004a A[PHI: r10
  0x004a: PHI (r10v4 java.lang.Integer) = (r10v3 int), (r10v79 int) binds: [B:8:0x0048, B:5:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
        
            if (r5 != '+') goto L18;
         */
        @Override // ivas.gov.bisp.enumeration.cJ.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int j(ivas.gov.bisp.enumeration.cJ.e r19, java.lang.CharSequence r20, int r21) {
            /*
                Method dump skipped, instruction units count: 1428
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.h.bEb.j(ivas.gov.bisp.enumeration.cJ.e, java.lang.CharSequence, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        
            if (r9 != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            r10 = r7 & 69;
            r11 = (r7 ^ 69) | r10;
            r1 = ((r10 | r11) << 1) - (r10 ^ r11);
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if ((r1 % 2) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            r10 = r4.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        
            if (r10 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            r9 = (r7 & 5) + (r7 | 5);
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        
            if ((r9 % 2) != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            r5.append(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            r5.append(r10);
            r8.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        
            r8.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        
            if (r9 < 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
        
            r10 = ((r7 ^ 76) + ((r7 & 76) << 1)) - 1;
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        
            if ((r10 % 2) == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        
            r7 = '@';
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        
            r5.append(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
        
            r7 = '+';
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        
            r5.append('-');
            r9 = -r9;
            r7 = ivas.gov.bisp.enumeration.cJ.h.bEb.a;
            r10 = r7 & 63;
            r7 = -(-((r7 ^ 63) | r10));
            r11 = ((r10 | r7) << 1) - (r7 ^ r10);
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        
            r10 = r9 / 3600000;
            ivas.gov.bisp.enumeration.cJ.z.b(r5, r10, 2);
            r11 = ivas.gov.bisp.enumeration.cJ.h.bEb.a;
            r1 = r11 + 57;
            r2 = r1 % 128;
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
        
            if ((r1 % 2) == 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
        
            if (r4.f != 1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
        
            if (r4.f != 1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
        
            r2 = r2 + 55;
            ivas.gov.bisp.enumeration.cJ.h.bEb.a = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
        
            r7 = -(r10 * 3600000);
            r10 = r9 & r7;
            r7 = (r7 ^ r9) | r10;
            r9 = (r10 ^ r7) + ((r7 & r10) << 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
        
            if (r9 != 0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
        
            r7 = ((r11 ^ 101) | (r11 & 101)) << 1;
            r10 = -((r11 & (-102)) | ((~r11) & 101));
            r1 = ((r7 | r10) << 1) - (r7 ^ r10);
            r7 = r1 % 128;
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r7;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
        
            if (r4.g > 1) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
        
            r5 = ((r7 & (-126)) | ((~r7) & 125)) + ((r7 & 125) << 1);
            ivas.gov.bisp.enumeration.cJ.h.bEb.a = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
        
            if ((r5 % 2) != 0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
        
            r5 = 71 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
        
            r10 = r9 / 60000;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010b, code lost:
        
            if (r4.e == true) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
        
            r1 = r11 ^ 87;
            r11 = ((r11 & 87) | r1) << 1;
            r1 = -r1;
            r3 = (r11 ^ r1) + ((r11 & r1) << 1);
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r3 % 128;
            r3 = r3 % 2;
            r5.append(':');
            r11 = ivas.gov.bisp.enumeration.cJ.h.bEb.a;
            r1 = ((r11 & 118) + (r11 | 118)) - 1;
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x012f, code lost:
        
            ivas.gov.bisp.enumeration.cJ.z.b(r5, r10, 2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0134, code lost:
        
            if (r4.f != 2) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0136, code lost:
        
            r5 = ivas.gov.bisp.enumeration.cJ.h.bEb.a;
            r7 = r5 | 101;
            r8 = r7 << 1;
            r5 = -((~(r5 & 101)) & r7);
            r7 = ((r8 | r5) << 1) - (r5 ^ r8);
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
        
            if ((r7 % 2) == 0) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x014d, code lost:
        
            r5 = 41 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0151, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0152, code lost:
        
            r7 = -(r10 * 60000);
            r10 = (r9 | r7) << 1;
            r7 = -(r7 ^ r9);
            r9 = (r10 ^ r7) + ((r7 & r10) << 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        
            if (r10 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x015e, code lost:
        
            if (r9 != 0) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0160, code lost:
        
            r7 = ivas.gov.bisp.enumeration.cJ.h.bEb.b;
            r10 = (r7 & (-82)) | ((~r7) & 81);
            r11 = -(-((r7 & 81) << 1));
            r1 = (r10 & r11) + (r10 | r11);
            ivas.gov.bisp.enumeration.cJ.h.bEb.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0179, code lost:
        
            if (r4.g > 2) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x017b, code lost:
        
            r7 = r7 + 115;
            ivas.gov.bisp.enumeration.cJ.h.bEb.a = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0182, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0183, code lost:
        
            r7 = r9 / 1000;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0188, code lost:
        
            if ((!r4.e) == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x018b, code lost:
        
            r10 = ivas.gov.bisp.enumeration.cJ.h.bEb.a;
            r11 = r10 & 97;
            r10 = -(-((r10 ^ 97) | r11));
            r1 = ((r11 | r10) << 1) - (r10 ^ r11);
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r1 % 128;
            r1 = r1 % 2;
            r5.append(':');
            r10 = ivas.gov.bisp.enumeration.cJ.h.bEb.a;
            r11 = (r10 & (-106)) | ((~r10) & 105);
            r10 = (r10 & 105) << 1;
            r1 = ((r11 | r10) << 1) - (r10 ^ r11);
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01b6, code lost:
        
            ivas.gov.bisp.enumeration.cJ.z.b(r5, r7, 2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01bc, code lost:
        
            if (r4.f != 3) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01be, code lost:
        
            r5 = ivas.gov.bisp.enumeration.cJ.h.bEb.a;
            r7 = r5 ^ 29;
            r5 = (((r5 & 29) | r7) << 1) - r7;
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01cc, code lost:
        
            if ((r5 % 2) != 0) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x01ce, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01cf, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x01d0, code lost:
        
            r7 = -(~(-(r7 * 1000)));
            r10 = (((r9 | r7) << 1) - (r7 ^ r9)) - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x01db, code lost:
        
            if (r10 != 0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01dd, code lost:
        
            r7 = ivas.gov.bisp.enumeration.cJ.h.bEb.b;
            r9 = r7 & 101;
            r1 = r7 | 101;
            r2 = (r9 ^ r1) + ((r9 & r1) << 1);
            ivas.gov.bisp.enumeration.cJ.h.bEb.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x01ed, code lost:
        
            if ((r2 % 2) != 0) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        
            if (r10 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01f2, code lost:
        
            if (r4.g > 4) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01f7, code lost:
        
            if (r4.g > 3) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01f9, code lost:
        
            r5 = r7 & 93;
            r7 = (r7 | 93) & (~r5);
            r5 = -(-(r5 << 1));
            r9 = ((r7 | r5) << 1) - (r5 ^ r7);
            ivas.gov.bisp.enumeration.cJ.h.bEb.a = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x020c, code lost:
        
            if ((r9 % 2) == 0) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x020e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x020f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0212, code lost:
        
            if (r4.e == false) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            r5 = (r7 & (-126)) | ((~r7) & 125);
            r7 = -(-((r7 & 125) << 1));
            r9 = (r5 ^ r7) + ((r5 & r7) << 1);
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0214, code lost:
        
            r7 = ivas.gov.bisp.enumeration.cJ.h.bEb.b;
            r8 = (r7 ^ 11) + ((r7 & 11) << 1);
            ivas.gov.bisp.enumeration.cJ.h.bEb.a = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0221, code lost:
        
            if ((r8 % 2) != 0) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0223, code lost:
        
            r7 = '{';
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0226, code lost:
        
            r7 = '.';
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0228, code lost:
        
            r5.append(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x022b, code lost:
        
            ivas.gov.bisp.enumeration.cJ.z.b(r5, r10, 3);
            r5 = ivas.gov.bisp.enumeration.cJ.h.bEb.a;
            r7 = r5 ^ 1;
            r5 = (r5 & 1) << 1;
            r8 = (r7 ^ r5) + ((r5 & r7) << 1);
            ivas.gov.bisp.enumeration.cJ.h.bEb.b = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x023e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        
            if ((r9 % 2) != 0) goto L11;
         */
        @Override // ivas.gov.bisp.enumeration.cJ.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void q(java.lang.Appendable r5, long r6, ivas.gov.bisp.enumeration.p096p.h r8, int r9, ivas.gov.bisp.enumeration.cP.AbstractC0242a r10, java.util.Locale r11) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 575
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.h.bEb.q(java.lang.Appendable, long, ivas.gov.bisp.enumeration.p.h, int, ivas.gov.bisp.enumeration.cP.a, java.util.Locale):void");
        }
    }

    public static class bEc implements l, t {
        private static int a = 1;
        private static int b;
        public final AbstractC0246t c;
        public final int d;
        public final boolean e;

        public bEc(AbstractC0246t abstractC0246t, int i, boolean z) {
            this.c = abstractC0246t;
            this.d = i;
            this.e = z;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 + 21;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.e) {
                int i5 = (-2) - ((i3 + 28) ^ (-1));
                b = i5 % 128;
                i = i5 % 2 != 0 ? 5 : 4;
            } else {
                int i6 = i3 | 95;
                int i7 = i6 << 1;
                int i8 = -(i6 & (~(i3 & 95)));
                int i9 = (i7 & i8) + (i8 | i7);
                b = i9 % 128;
                int i10 = i9 % 2;
                i = 2;
            }
            int i11 = ((i3 | 87) << 1) - (i3 ^ 87);
            b = i11 % 128;
            int i12 = i11 % 2;
            return i;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 79;
            int i4 = (i2 ^ 79) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2 == 0 ? 4 : 2;
            int i8 = (i6 & 113) + (i6 | 113);
            b = i8 % 128;
            int i9 = i8 % 2;
            return i7;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0047 A[PHI: r7
  0x0047: PHI (r7v17 int) = (r7v16 int), (r7v21 int) binds: [B:14:0x0045, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void f(Appendable appendable, A a2, Locale locale) throws IOException {
            int i;
            int iV;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & 2) + (i3 | 2);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                a2.h(this.c);
                throw null;
            }
            if (!a2.h(this.c)) {
                int i6 = a;
                int i7 = ((i6 & 92) + (i6 | 92)) - 1;
                b = i7 % 128;
                int i8 = i7 % 2;
                i = -1;
            } else {
                int i9 = b;
                int i10 = i9 & 15;
                int i11 = (((i9 | 15) & (~i10)) - (~(i10 << 1))) - 1;
                a = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        iV = a2.v(this.c);
                        int i12 = 35 / 0;
                        if (iV < 0) {
                            iV = -iV;
                            int i13 = b;
                            int i14 = i13 & 67;
                            int i15 = (i13 ^ 67) | i14;
                            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                            a = i16 % 128;
                            int i17 = i16 % 2;
                        }
                    } else {
                        iV = a2.v(this.c);
                        if (iV < 0) {
                            iV = -iV;
                            int i18 = b;
                            int i19 = i18 & 67;
                            int i110 = (i18 ^ 67) | i19;
                            int i111 = (i19 ^ i110) + ((i110 & i19) << 1);
                            a = i111 % 128;
                            int i112 = i111 % 2;
                        }
                    }
                    i = iV % 100;
                    int i20 = a;
                    int i21 = (i20 ^ 117) + ((i20 & 117) << 1);
                    b = i21 % 128;
                    int i22 = i21 % 2;
                } catch (RuntimeException unused) {
                    int i23 = a;
                    int i24 = ((i23 & 92) + (i23 | 92)) - 1;
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    i = -1;
                }
            }
            if (i >= 0) {
                z.b(appendable, i, 2);
                int i26 = b + 7;
                a = i26 % 128;
                int i27 = i26 % 2;
                return;
            }
            int i28 = b;
            int i29 = i28 & 99;
            int i30 = i29 + ((i28 ^ 99) | i29);
            a = i30 % 128;
            int i31 = i30 % 2;
            appendable.append((char) 65533);
            int i32 = b;
            int i33 = (i32 ^ 57) + ((i32 & 57) << 1);
            a = i33 % 128;
            int i34 = i33 % 2;
            appendable.append((char) 65533);
            int i35 = a;
            int i36 = i35 & 29;
            int i37 = (i36 - (~(-(-((i35 ^ 29) | i36))))) - 1;
            b = i37 % 128;
            if (i37 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:129:0x013c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:135:0x00b5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:49:0x0185  */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01c4, code lost:
        
            if (r5 == 2) goto L58;
         */
        @Override // ivas.gov.bisp.enumeration.cJ.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int j(ivas.gov.bisp.enumeration.cJ.e r21, java.lang.CharSequence r22, int r23) {
            /*
                Method dump skipped, instruction units count: 1251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.h.bEc.j(ivas.gov.bisp.enumeration.cJ.e, java.lang.CharSequence, int):int");
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i, AbstractC0242a abstractC0242a, Locale locale) throws IOException {
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = (i4 & 86) + (i4 | 86);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            try {
                int iF = this.c.c(hVar).f(j);
                int i8 = b;
                int i9 = (((i8 ^ 59) | (i8 & 59)) << 1) - ((i8 & (-60)) | ((~i8) & 59));
                a = i9 % 128;
                int i10 = i9 % 2;
                if (iF < 0) {
                    int i11 = (((i8 | 91) << 1) - (~(-(i8 ^ 91)))) - 1;
                    int i12 = i11 % 128;
                    a = i12;
                    int i13 = i11 % 2;
                    iF = -iF;
                    int i14 = (i12 | 59) << 1;
                    int i15 = -(((~i12) & 59) | (i12 & (-60)));
                    int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                }
                i2 = iF % 100;
                int i18 = a;
                int i19 = (i18 | 99) << 1;
                int i20 = -(i18 ^ 99);
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i21 % 128;
                int i22 = i21 % 2;
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            if (i2 >= 0) {
                z.b(appendable, i2, 2);
                int i23 = (-2) - ((a + 32) ^ (-1));
                b = i23 % 128;
                int i24 = i23 % 2;
                return;
            }
            int i25 = a;
            int i26 = (((i25 & (-100)) | ((~i25) & 99)) - (~((i25 & 99) << 1))) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
            appendable.append((char) 65533);
            appendable.append((char) 65533);
            int i28 = a;
            int i29 = (i28 | 115) << 1;
            int i30 = -(((~i28) & 115) | (i28 & (-116)));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            int i32 = i31 % 128;
            b = i32;
            int i33 = i31 % 2;
            int i34 = (i32 & (-106)) | ((~i32) & 105);
            int i35 = (i32 & 105) << 1;
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            a = i36 % 128;
            if (i36 % 2 == 0) {
                throw null;
            }
        }
    }

    public static void c(Appendable appendable, int i) throws IOException {
        int i2 = 2 % 2;
        while (true) {
            int i3 = (i & 33) | ((~i) & (-34));
            int i4 = (i & (-34)) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = (i5 | 33) << 1;
            int i7 = -((i5 & (-34)) | ((~i5) & 33));
            i = (i6 | i7) + (i6 & i7);
            if (i < 0) {
                int i8 = a;
                int i9 = (i8 ^ 77) + ((i8 & 77) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
            int i11 = b;
            int i12 = (((i11 & (-10)) | ((~i11) & 9)) - (~((i11 & 9) << 1))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            appendable.append((char) 65533);
            if (i13 != 0) {
                throw null;
            }
            int i14 = a;
            int i15 = i14 & 77;
            int i16 = -(-((i14 ^ 77) | i15));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 2 / 5;
            }
        }
    }

    public h n(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 35;
        b = i4 % 128;
        int i5 = i4 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        m(AbstractC0246t.w, i, i2);
        int i6 = a;
        int i7 = i6 & 23;
        int i8 = (((i6 ^ 23) | i7) << 1) - ((i6 | 23) & (~i7));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public h p(r rVar) {
        t[] tVarArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = -(-((i2 ^ 119) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (rVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
        int i7 = i2 + 85;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            tVarArr = new t[3];
            tVarArr[1] = i.c(rVar);
        } else {
            tVarArr = new t[2];
            tVarArr[0] = i.c(rVar);
        }
        tVarArr[1] = null;
        bDW bdw = new bDW(tVarArr);
        int i8 = b;
        int i9 = i8 & 79;
        int i10 = (i8 ^ 79) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        j(null, bdw);
        int i13 = b + 59;
        a = i13 % 128;
        int i14 = i13 % 2;
        return this;
    }

    public h r(AbstractC0246t abstractC0246t) {
        int i = 2 % 2;
        bDY bdy = new bDY(abstractC0246t, false);
        this.d = null;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = i3 + ((i2 ^ 81) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.add(bdy);
        ArrayList<Object> arrayList = this.c;
        int i6 = b;
        int i7 = i6 ^ 5;
        int i8 = ((i6 & 5) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            arrayList.add(bdy);
            return this;
        }
        arrayList.add(bdy);
        throw null;
    }

    public h t(String str, String str2, boolean z, int i, int i2) {
        int i3 = 2 % 2;
        bEb beb = new bEb(null, str2, z, i, i2);
        int i4 = b;
        int i5 = i4 & 103;
        int i6 = -(-((i4 ^ 103) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            this.d = null;
            this.c.add(beb);
            throw null;
        }
        this.d = null;
        this.c.add(beb);
        this.c.add(beb);
        int i8 = b;
        int i9 = i8 & 71;
        int i10 = -(-((i8 ^ 71) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public h v(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 89;
        int i6 = ((((i4 ^ 89) | i5) << 1) - (~(-((i4 | 89) & (~i5))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        h hVarS = s(AbstractC0246t.l, i, i2);
        int i8 = b;
        int i9 = (((i8 | 30) << 1) - (i8 ^ 30)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        return hVarS;
    }

    public h w(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 5;
        int i6 = (i4 | 5) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        h hVarS = s(AbstractC0246t.h, i, i2);
        int i10 = a;
        int i11 = (((i10 & (-108)) | ((~i10) & 107)) - (~(-(-((i10 & 107) << 1))))) - 1;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return hVarS;
        }
        throw null;
    }

    public static class bEd extends bDS {
        private static int a = 0;
        private static int b = 1;

        public bEd(AbstractC0246t abstractC0246t, int i, boolean z) {
            super(abstractC0246t, i, z);
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 63) + ((i2 & 63) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.d;
            int i6 = a + 125;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i, AbstractC0242a abstractC0242a, Locale locale) throws IOException {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 59;
            int i5 = (i4 - (~((i3 ^ 59) | i4))) - 1;
            a = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    this.c.c(hVar);
                    throw null;
                }
                z.c(appendable, this.c.c(hVar).f(j));
                int i6 = b;
                int i7 = (i6 & (-72)) | ((~i6) & 71);
                int i8 = -(-((i6 & 71) << 1));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                a = i9 % 128;
                int i10 = i9 % 2;
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void f(Appendable appendable, A a2, Locale locale) throws IOException {
            int i = 2 % 2;
            int i2 = a + 121;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                a2.h(this.c);
                throw null;
            }
            if (!a2.h(this.c)) {
                appendable.append((char) 65533);
                int i3 = a;
                int i4 = i3 & 51;
                int i5 = (i3 ^ 51) | i4;
                int i6 = (i4 & i5) + (i5 | i4);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i7 = a;
            int i8 = ((i7 ^ 15) | (i7 & 15)) << 1;
            int i9 = -(((~i7) & 15) | (i7 & (-16)));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            try {
                z.c(appendable, a2.v(this.c));
                int i12 = a;
                int i13 = ((i12 | 101) << 1) - (i12 ^ 101);
                b = i13 % 128;
                int i14 = i13 % 2;
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        if ((r13 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        r5 = ivas.gov.bisp.enumeration.cJ.h.a;
        r6 = (r5 ^ 125) + ((r5 & 125) << 1);
        ivas.gov.bisp.enumeration.cJ.h.b = r6 % 128;
        r6 = r6 % 2;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r5 >= r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        r6 = ivas.gov.bisp.enumeration.cJ.h.b;
        r7 = r6 & 123;
        r6 = ((r6 | 123) & (~r7)) + (r7 << 1);
        ivas.gov.bisp.enumeration.cJ.h.a = r6 % 128;
        r6 = r6 % 2;
        r6 = r12 | r5;
        r6 = r11.charAt(((r6 << 1) - (~(-(r6 & (~(r12 & r5)))))) - 1);
        r7 = ivas.gov.bisp.enumeration.cJ.h.b;
        r8 = r7 ^ 63;
        r7 = -(-((r7 & 63) << 1));
        r9 = (r8 & r7) + (r7 | r8);
        ivas.gov.bisp.enumeration.cJ.h.a = r9 % 128;
        r9 = r9 % 2;
        r7 = r13.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
    
        if (r9 == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        r8 = 94 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (r6 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (r6 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        r8 = ivas.gov.bisp.enumeration.cJ.h.a;
        r10 = r8 & 65;
        r9 = (((r8 ^ 65) | r10) << 1) - ((r8 | 65) & (~r10));
        ivas.gov.bisp.enumeration.cJ.h.b = r9 % 128;
        r9 = r9 % 2;
        r6 = java.lang.Character.toUpperCase(r6);
        r7 = java.lang.Character.toUpperCase(r7);
        r8 = ivas.gov.bisp.enumeration.cJ.h.a + 11;
        r9 = r8 % 128;
        ivas.gov.bisp.enumeration.cJ.h.b = r9;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        if (r6 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d6, code lost:
    
        r8 = (r9 & 49) + (r9 | 49);
        ivas.gov.bisp.enumeration.cJ.h.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
    
        if (java.lang.Character.toLowerCase(r6) == java.lang.Character.toLowerCase(r7)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
    
        r11 = ivas.gov.bisp.enumeration.cJ.h.b;
        r12 = (r11 ^ 33) + ((r11 & 33) << 1);
        r11 = r12 % 128;
        ivas.gov.bisp.enumeration.cJ.h.a = r11;
        r12 = r12 % 2;
        r12 = ((r11 | 35) << 1) - (r11 ^ 35);
        ivas.gov.bisp.enumeration.cJ.h.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0103, code lost:
    
        if ((r12 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0105, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0106, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0109, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
    
        r6 = r5 | 20;
        r7 = r6 << 1;
        r5 = -((~(r5 & 20)) & r6);
        r6 = ((r7 | r5) << 1) - (r5 ^ r7);
        r5 = (((r6 | (-18)) << 1) - (r6 ^ (-18))) - 1;
        r6 = ivas.gov.bisp.enumeration.cJ.h.a;
        r7 = r6 & 43;
        r6 = ((r6 | 43) & (~r7)) + (r7 << 1);
        ivas.gov.bisp.enumeration.cJ.h.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0131, code lost:
    
        r11 = ivas.gov.bisp.enumeration.cJ.h.a + 75;
        ivas.gov.bisp.enumeration.cJ.h.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013a, code lost:
    
        if ((r11 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if ((r11.length() >>> r12) < r2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (((((r5 | r6) << 1) - (r5 ^ r6)) - 1) < r2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r11 = ivas.gov.bisp.enumeration.cJ.h.b;
        r12 = (r11 & (-104)) | ((~r11) & 103);
        r13 = -(-((r11 & 103) << 1));
        r2 = (r12 ^ r13) + ((r12 & r13) << 1);
        ivas.gov.bisp.enumeration.cJ.h.a = r2 % 128;
        r2 = r2 % 2;
        r12 = r11 ^ 3;
        r11 = -(-((r11 & 3) << 1));
        r13 = ((r12 | r11) << 1) - (r11 ^ r12);
        ivas.gov.bisp.enumeration.cJ.h.a = r13 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.lang.CharSequence r11, int r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.h.d(java.lang.CharSequence, int, java.lang.String):boolean");
    }

    public static boolean e(CharSequence charSequence, int i, String str) {
        int length;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 | 57;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 57)) & i4);
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 != 0 ? (charSequence.length() - (~(-i))) - 1 < (length = str.length()) : (charSequence.length() >> i) < (length = str.length())) {
            int i8 = a;
            int i9 = i8 & 63;
            int i10 = -(-((i8 ^ 63) | i9));
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        int i13 = b;
        int i14 = i13 & 47;
        int i15 = (i14 - (~((i13 ^ 47) | i14))) - 1;
        a = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 2 / 2;
        }
        int i17 = 0;
        while (i17 < length) {
            int i18 = b;
            int i19 = i18 & 45;
            int i20 = (((i18 ^ 45) | i19) << 1) - ((i18 | 45) & (~i19));
            a = i20 % 128;
            int i21 = i20 % 2;
            int i22 = ((~i17) & i) | ((~i) & i17);
            int i23 = -(-((i & i17) << 1));
            if (charSequence.charAt((i22 & i23) + (i22 | i23)) != str.charAt(i17)) {
                int i24 = a;
                int i25 = (-2) - ((((i24 | 104) << 1) - (i24 ^ 104)) ^ (-1));
                int i26 = i25 % 128;
                b = i26;
                boolean z = i25 % 2 == 0;
                int i27 = ((i26 ^ 115) | (i26 & 115)) << 1;
                int i28 = -(((~i26) & 115) | (i26 & (-116)));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                a = i29 % 128;
                int i30 = i29 % 2;
                return z;
            }
            i17 = (i17 | 1) + (i17 & 1);
            int i31 = b + 5;
            a = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = a + 81;
        b = i33 % 128;
        if (i33 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r A() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 53) + (i2 | 53);
        a = i3 % 128;
        int i4 = i3 % 2;
        Object objY = y();
        if (!z(objY)) {
            throw new UnsupportedOperationException("Parsing is not supported");
        }
        int i5 = a + 80;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            u.c((t) objY);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r rVarC = u.c((t) objY);
        int i7 = b;
        int i8 = (i7 ^ 51) + ((i7 & 51) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return rVarC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r4 = 71 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        throw new java.lang.IllegalArgumentException("No parser supplied");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = ((r2 | 27) << 1) - (r2 ^ 27);
        ivas.gov.bisp.enumeration.cJ.h.b = r1 % 128;
        r1 = r1 % 2;
        j(null, ivas.gov.bisp.enumeration.cJ.i.c(r4));
        r4 = ivas.gov.bisp.enumeration.cJ.h.a;
        r1 = r4 & 119;
        r4 = -(-((r4 ^ 119) | r1));
        r2 = (r1 & r4) + (r4 | r1);
        ivas.gov.bisp.enumeration.cJ.h.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.cJ.h h(ivas.gov.bisp.enumeration.cJ.r r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cJ.h.b
            int r1 = r1 + 11
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cJ.h.a = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 20
            int r1 = r1 / 0
            if (r4 == 0) goto L44
            goto L17
        L15:
            if (r4 == 0) goto L44
        L17:
            r1 = r2 | 27
            int r1 = r1 << 1
            r2 = r2 ^ 27
            int r1 = r1 - r2
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cJ.h.b = r2
            int r1 = r1 % r0
            ivas.gov.bisp.enumeration.cJ.t r4 = ivas.gov.bisp.enumeration.cJ.i.c(r4)
            r1 = 0
            r3.j(r1, r4)
            int r4 = ivas.gov.bisp.enumeration.cJ.h.a
            r1 = r4 & 119(0x77, float:1.67E-43)
            r4 = r4 ^ 119(0x77, float:1.67E-43)
            r4 = r4 | r1
            int r4 = -r4
            int r4 = -r4
            r2 = r1 & r4
            r4 = r4 | r1
            int r2 = r2 + r4
            int r4 = r2 % 128
            ivas.gov.bisp.enumeration.cJ.h.b = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L43
            r4 = 71
            int r4 = r4 / 0
        L43:
            return r3
        L44:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No parser supplied"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.h.h(ivas.gov.bisp.enumeration.cJ.r):ivas.gov.bisp.enumeration.cJ.h");
    }

    public final h j(l lVar, t tVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 25;
        int i4 = (((i2 ^ 25) | i3) << 1) - ((i2 | 25) & (~i3));
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            this.d = null;
            this.c.add(lVar);
            obj.hashCode();
            throw null;
        }
        this.d = null;
        this.c.add(lVar);
        this.c.add(tVar);
        int i5 = b;
        int i6 = (i5 & 115) + (i5 | 115);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 39 / 0;
        }
        return this;
    }

    public static class bDR implements l, t {
        private static int a = 1;
        private static int b;
        public final l[] c;
        public final t[] d;
        public final int e;
        public final int f;

        /* JADX WARN: Code duplicated, block: B:50:0x023f  */
        public bDR(List<Object> list) {
            t tVar;
            int iD;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            int i = 2 % 2;
            int i2 = 0;
            while (true) {
                Object obj = null;
                if (i2 >= size) {
                    if (!arrayList.contains(null)) {
                        int i3 = a;
                        int i4 = i3 & 49;
                        int i5 = -(-((i3 ^ 49) | i4));
                        int i6 = (i4 & i5) + (i5 | i4);
                        b = i6 % 128;
                        int i7 = i6 % 2;
                        if (arrayList.isEmpty()) {
                            this.c = null;
                            this.e = 0;
                            int i8 = a;
                            int i9 = i8 & 101;
                            int i10 = i9 + ((i8 ^ 101) | i9);
                            b = i10 % 128;
                            int i11 = i10 % 2;
                        } else {
                            int i12 = a;
                            int i13 = i12 & 103;
                            int i14 = (((i12 ^ 103) | i13) << 1) - ((i12 | 103) & (~i13));
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                l[] lVarArr = new l[arrayList.size()];
                                throw null;
                            }
                            int size2 = arrayList.size();
                            this.c = new l[size2];
                            int i15 = b + 22;
                            int i16 = (i15 ^ (-1)) + (i15 << 1);
                            a = i16 % 128;
                            int i17 = i16 % 2;
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < size2) {
                                int i20 = b;
                                int i21 = ((i20 | 111) << 1) - (i20 ^ 111);
                                a = i21 % 128;
                                int i22 = i21 % 2;
                                l lVar = (l) arrayList.get(i18);
                                int iP = lVar.p();
                                int i23 = b + 10;
                                int i24 = (i23 ^ (-1)) + (i23 << 1);
                                int i25 = i24 % 128;
                                a = i25;
                                int i26 = i24 % 2;
                                i19 += iP;
                                this.c[i18] = lVar;
                                i18 = (i18 ^ (-45)) + ((i18 & (-45)) << 1) + 46;
                                int i27 = i25 + 1;
                                b = i27 % 128;
                                int i28 = i27 % 2;
                            }
                            this.e = i19;
                            int i29 = a;
                            int i30 = i29 & 3;
                            int i31 = (i29 ^ 3) | i30;
                            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                            b = i32 % 128;
                            int i33 = i32 % 2;
                        }
                    } else {
                        this.c = null;
                        this.e = 0;
                        int i34 = a;
                        int i35 = i34 & 101;
                        int i110 = i35 + ((i34 ^ 101) | i35);
                        b = i110 % 128;
                        int i111 = i110 % 2;
                    }
                    if (!arrayList2.contains(null)) {
                        int i36 = b + 23;
                        a = i36 % 128;
                        if (i36 % 2 == 0) {
                            arrayList2.isEmpty();
                            throw null;
                        }
                        if (!arrayList2.isEmpty()) {
                            int size3 = arrayList2.size();
                            this.d = new t[size3];
                            int i37 = b;
                            int i38 = (((i37 | 120) << 1) - (i37 ^ 120)) - 1;
                            int i39 = i38 % 128;
                            a = i39;
                            int i40 = i38 % 2 == 0 ? 1 : 0;
                            int i41 = i40;
                            int i42 = i39 & 113;
                            int i43 = ((i39 ^ 113) | i42) << 1;
                            int i44 = -((i39 | 113) & (~i42));
                            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                            b = i45 % 128;
                            int i46 = i45 % 2;
                            while (i40 < size3) {
                                int i47 = b;
                                int i48 = (i47 & 60) + (i47 | 60);
                                int i49 = (i48 ^ (-1)) + (i48 << 1);
                                a = i49 % 128;
                                if (i49 % 2 == 0) {
                                    tVar = (t) arrayList2.get(i40);
                                    iD = tVar.d();
                                    int i50 = 64 / 0;
                                } else {
                                    tVar = (t) arrayList2.get(i40);
                                    iD = tVar.d();
                                }
                                int i51 = b;
                                int i52 = (i51 ^ 51) + ((i51 & 51) << 1);
                                a = i52 % 128;
                                int i53 = i52 % 2;
                                int i54 = -(~(-(-iD)));
                                i41 = (-2) - (((i41 ^ i54) + ((i41 & i54) << 1)) ^ (-1));
                                this.d[i40] = tVar;
                                int i55 = i40 & (-126);
                                int i56 = (i40 | (-126)) & (~i55);
                                int i57 = -(-(i55 << 1));
                                i40 = (i56 ^ i57) + ((i57 & i56) << 1) + 127;
                                int i58 = i51 & 125;
                                int i59 = (i58 - (~(-(-((i51 ^ 125) | i58))))) - 1;
                                a = i59 % 128;
                                int i60 = i59 % 2;
                            }
                            this.f = i41;
                            int i61 = b;
                            int i62 = i61 & 85;
                            int i63 = -(-(i61 | 85));
                            int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                            a = i64 % 128;
                            int i65 = i64 % 2;
                            return;
                        }
                    }
                    this.d = null;
                    this.f = 0;
                    int i66 = a;
                    int i67 = i66 & 117;
                    int i68 = ((i66 ^ 117) | i67) << 1;
                    int i69 = -((i66 | 117) & (~i67));
                    int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                    b = i70 % 128;
                    if (i70 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                int i71 = b;
                int i72 = i71 & 97;
                int i73 = (i71 | 97) & (~i72);
                int i74 = i72 << 1;
                int i75 = ((i73 | i74) << 1) - (i73 ^ i74);
                a = i75 % 128;
                int i76 = i75 % 2;
                Object obj2 = list.get(i2);
                if (obj2 instanceof bDR) {
                    int i77 = b;
                    int i78 = ((i77 ^ 70) + ((i77 & 70) << 1)) - 1;
                    a = i78 % 128;
                    if (i78 % 2 == 0) {
                        l[] lVarArr2 = ((bDR) obj2).c;
                        obj.hashCode();
                        throw null;
                    }
                    l[] lVarArr3 = ((bDR) obj2).c;
                    if (lVarArr3 != null) {
                        int i79 = ((i77 ^ 71) | (i77 & 71)) << 1;
                        int i80 = -((i77 & (-72)) | ((~i77) & 71));
                        int i81 = (i79 & i80) + (i79 | i80);
                        a = i81 % 128;
                        int i82 = i81 % 2;
                        int i83 = ((i77 & (-70)) | ((~i77) & 69)) + ((i77 & 69) << 1);
                        a = i83 % 128;
                        int i84 = i83 % 2;
                        int i85 = 0;
                        while (i85 < lVarArr3.length) {
                            int i86 = b;
                            int i87 = i86 & 81;
                            int i88 = -(-((i86 ^ 81) | i87));
                            int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                            a = i89 % 128;
                            if (i89 % 2 == 0) {
                                arrayList.add(lVarArr3[i85]);
                                int i90 = i85 & 73;
                                int i91 = -(-((i85 ^ 73) | i90));
                                i85 = (i90 ^ i91) + ((i91 & i90) << 1);
                            } else {
                                arrayList.add(lVarArr3[i85]);
                                int i92 = i85 & 1;
                                i85 = (((i85 | 1) & (~i92)) - (~(-(-(i92 << 1))))) - 1;
                            }
                            int i93 = a;
                            int i94 = i93 & 71;
                            int i95 = (i94 - (~((i93 ^ 71) | i94))) - 1;
                            b = i95 % 128;
                            int i96 = i95 % 2;
                        }
                    }
                } else {
                    arrayList.add(obj2);
                    int i97 = b;
                    int i98 = i97 ^ 107;
                    int i99 = -(-((i97 & 107) << 1));
                    int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
                    a = i100 % 128;
                    int i101 = i100 % 2;
                }
                int i102 = ((i2 ^ 1) | (i2 & 1)) << 1;
                int i103 = -((i2 & (-2)) | ((~i2) & 1));
                Object obj3 = list.get(((i102 | i103) << 1) - (i102 ^ i103));
                if (obj3 instanceof bDR) {
                    int i104 = b;
                    int i105 = i104 & 33;
                    int i106 = (i104 | 33) & (~i105);
                    int i107 = -(-(i105 << 1));
                    int i108 = (i106 ^ i107) + ((i106 & i107) << 1);
                    int i109 = i108 % 128;
                    a = i109;
                    int i112 = i108 % 2;
                    t[] tVarArr = ((bDR) obj3).d;
                    if (tVarArr != null) {
                        int i113 = ((((i109 ^ 9) | (i109 & 9)) << 1) - (~(-(((~i109) & 9) | (i109 & (-10)))))) - 1;
                        b = i113 % 128;
                        int i114 = i113 % 2;
                        int i115 = 0;
                        while (i115 < tVarArr.length) {
                            int i116 = a + 119;
                            b = i116 % 128;
                            if (i116 % 2 != 0) {
                                arrayList2.add(tVarArr[i115]);
                                int i117 = i115 & 108;
                                int i118 = -(-((i115 ^ 108) | i117));
                                i115 = (i117 ^ i118) + ((i118 & i117) << 1);
                            } else {
                                arrayList2.add(tVarArr[i115]);
                                int i119 = (((i115 | 87) << 1) - (~(-(((~i115) & 87) | (i115 & (-88)))))) - 1;
                                i115 = (((i119 | (-85)) << 1) - (i119 ^ (-85))) - 1;
                            }
                        }
                    }
                } else {
                    arrayList2.add(obj3);
                    int i120 = a;
                    int i121 = i120 & 109;
                    int i122 = (i120 ^ 109) | i121;
                    int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                    b = i123 % 128;
                    int i124 = i123 % 2;
                }
                int i125 = ((i2 | 89) << 1) - (i2 ^ 89);
                i2 = (i125 ^ (-87)) + ((i125 & (-87)) << 1);
                int i126 = a;
                int i127 = i126 & 11;
                int i128 = (((i126 ^ 11) | i127) << 1) - ((i126 | 11) & (~i127));
                b = i128 % 128;
                if (i128 % 2 != 0) {
                    int i129 = 3 / 3;
                }
            }
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 + 59;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                i = this.f;
                int i5 = 4 / 0;
            } else {
                i = this.f;
            }
            int i6 = ((i3 & (-122)) | ((~i3) & 121)) + ((i3 & 121) << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return i;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        
            r11 = r1 & 117;
            r1 = (r1 ^ 117) | r11;
            r4 = (r11 & r1) + (r11 | r1);
            ivas.gov.bisp.enumeration.cJ.h.bDR.a = r4 % 128;
            r4 = r4 % 2;
            r11 = java.util.Locale.getDefault();
            r1 = ivas.gov.bisp.enumeration.cJ.h.bDR.a;
            r4 = (r1 & 21) + (r1 | 21);
            ivas.gov.bisp.enumeration.cJ.h.bDR.b = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        
            r1 = r2.length;
            r4 = ivas.gov.bisp.enumeration.cJ.h.bDR.b + 47;
            ivas.gov.bisp.enumeration.cJ.h.bDR.a = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
        
            if ((r4 % 2) != 0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
        
            r4 = 3 / 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r3 >= r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        
            r4 = ivas.gov.bisp.enumeration.cJ.h.bDR.b;
            r5 = r4 & 25;
            r4 = (r4 | 25) & (~r5);
            r5 = r5 << 1;
            r6 = ((r4 | r5) << 1) - (r4 ^ r5);
            ivas.gov.bisp.enumeration.cJ.h.bDR.a = r6 % 128;
            r6 = r6 % 2;
            r2[r3].f(r9, r10, r11);
            r4 = ivas.gov.bisp.enumeration.cJ.h.bDR.b;
            r5 = r4 & 41;
            r6 = (~r5) & (r4 | 41);
            r5 = -(-(r5 << 1));
            r7 = ((r6 | r5) << 1) - (r5 ^ r6);
            ivas.gov.bisp.enumeration.cJ.h.bDR.a = r7 % 128;
            r7 = r7 % 2;
            r6 = r3 & 1;
            r5 = ((r3 ^ 1) | r6) << 1;
            r3 = -((r3 | 1) & (~r6));
            r3 = ((r5 | r3) << 1) - (r3 ^ r5);
            r5 = r4 & 87;
            r5 = r5 + ((r4 ^ 87) | r5);
            ivas.gov.bisp.enumeration.cJ.h.bDR.a = r5 % 128;
            r5 = r5 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
        
            r9 = ivas.gov.bisp.enumeration.cJ.h.bDR.b + 107;
            ivas.gov.bisp.enumeration.cJ.h.bDR.a = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
        
            if ((r9 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
        
            r9 = null;
            r9.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
        
            throw new java.lang.UnsupportedOperationException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r2 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        
            if (r2 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            if (r11 != null) goto L11;
         */
        @Override // ivas.gov.bisp.enumeration.cJ.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void f(java.lang.Appendable r9, ivas.gov.bisp.enumeration.cP.A r10, java.util.Locale r11) {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.cJ.h.bDR.a
                r2 = r1 | 110(0x6e, float:1.54E-43)
                int r2 = r2 << 1
                r1 = r1 ^ 110(0x6e, float:1.54E-43)
                int r2 = r2 - r1
                int r2 = r2 + (-1)
                int r1 = r2 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDR.b = r1
                int r2 = r2 % r0
                r3 = 0
                if (r2 == 0) goto L1e
                ivas.gov.bisp.enumeration.cJ.l[] r2 = r8.c
                r4 = 14
                int r4 = r4 / r3
                if (r2 == 0) goto Lb4
                goto L22
            L1e:
                ivas.gov.bisp.enumeration.cJ.l[] r2 = r8.c
                if (r2 == 0) goto Lb4
            L22:
                if (r11 != 0) goto L42
                r11 = r1 & 117(0x75, float:1.64E-43)
                r1 = r1 ^ 117(0x75, float:1.64E-43)
                r1 = r1 | r11
                r4 = r11 & r1
                r11 = r11 | r1
                int r4 = r4 + r11
                int r11 = r4 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDR.a = r11
                int r4 = r4 % r0
                java.util.Locale r11 = java.util.Locale.getDefault()
                int r1 = ivas.gov.bisp.enumeration.cJ.h.bDR.a
                r4 = r1 & 21
                r1 = r1 | 21
                int r4 = r4 + r1
                int r1 = r4 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDR.b = r1
                int r4 = r4 % r0
            L42:
                int r1 = r2.length
                int r4 = ivas.gov.bisp.enumeration.cJ.h.bDR.b
                int r4 = r4 + 47
                int r5 = r4 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDR.a = r5
                int r4 = r4 % r0
                if (r4 != 0) goto L50
                r4 = 3
                int r4 = r4 / r4
            L50:
                if (r3 >= r1) goto La3
                int r4 = ivas.gov.bisp.enumeration.cJ.h.bDR.b
                r5 = r4 & 25
                int r6 = ~r5
                r4 = r4 | 25
                r4 = r4 & r6
                int r5 = r5 << 1
                r6 = r4 | r5
                int r6 = r6 << 1
                r4 = r4 ^ r5
                int r6 = r6 - r4
                int r4 = r6 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDR.a = r4
                int r6 = r6 % r0
                r4 = r2[r3]
                r4.f(r9, r10, r11)
                int r4 = ivas.gov.bisp.enumeration.cJ.h.bDR.b
                r5 = r4 & 41
                int r6 = ~r5
                r7 = r4 | 41
                r6 = r6 & r7
                int r5 = r5 << 1
                int r5 = -r5
                int r5 = -r5
                r7 = r6 | r5
                int r7 = r7 << 1
                r5 = r5 ^ r6
                int r7 = r7 - r5
                int r5 = r7 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDR.a = r5
                int r7 = r7 % 2
                r5 = r3 ^ 1
                r6 = r3 & 1
                r5 = r5 | r6
                int r5 = r5 << 1
                int r6 = ~r6
                r3 = r3 | 1
                r3 = r3 & r6
                int r3 = -r3
                r6 = r5 | r3
                int r6 = r6 << 1
                r3 = r3 ^ r5
                int r3 = r6 - r3
                r5 = r4 & 87
                r4 = r4 ^ 87
                r4 = r4 | r5
                int r5 = r5 + r4
                int r4 = r5 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDR.a = r4
                int r5 = r5 % r0
                goto L50
            La3:
                int r9 = ivas.gov.bisp.enumeration.cJ.h.bDR.b
                int r9 = r9 + 107
                int r10 = r9 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDR.a = r10
                int r9 = r9 % r0
                if (r9 == 0) goto Laf
                return
            Laf:
                r9 = 0
                r9.hashCode()
                throw r9
            Lb4:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.h.bDR.f(java.lang.Appendable, ivas.gov.bisp.enumeration.cP.A, java.util.Locale):void");
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 7;
            int i4 = ((i2 ^ 7) | i3) << 1;
            int i5 = -((i2 | 7) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return this.e;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int j(e eVar, CharSequence charSequence, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 + 95;
            a = i4 % 128;
            int i5 = i4 % 2;
            t[] tVarArr = this.d;
            if (tVarArr == null) {
                throw new UnsupportedOperationException();
            }
            int i6 = (-2) - ((((i3 | 122) << 1) - (i3 ^ 122)) ^ (-1));
            a = i6 % 128;
            int i7 = i6 % 2;
            int length = tVarArr.length;
            int i8 = ((i3 | 49) << 1) - (i3 ^ 49);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = b;
                int i12 = i11 & 59;
                int i13 = (i11 ^ 59) | i12;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                int i15 = i14 % 128;
                a = i15;
                int i16 = i14 % 2;
                if (i < 0) {
                    break;
                }
                int i17 = i15 + 39;
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    i = tVarArr[i10].j(eVar, charSequence, i);
                    int i18 = 40 / 0;
                } else {
                    i = tVarArr[i10].j(eVar, charSequence, i);
                }
                int i19 = b;
                int i20 = (((i19 | 52) << 1) - (i19 ^ 52)) - 1;
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = i10 & 76;
                    int i22 = -(-((i10 ^ 76) | i21));
                    i10 = ((i21 | i22) << 1) - (i22 ^ i21);
                } else {
                    i10 = (((i10 | 2) << 1) - (i10 ^ 2)) - 1;
                }
            }
            int i23 = b;
            int i24 = i23 ^ 5;
            int i25 = ((i23 & 5) | i24) << 1;
            int i26 = -i24;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            a = i27 % 128;
            if (i27 % 2 != 0) {
                return i;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i, AbstractC0242a abstractC0242a, Locale locale) {
            Locale locale2;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 111;
            int i5 = (~i4) & (i3 | 111);
            int i6 = -(-(i4 << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            l[] lVarArr = this.c;
            if (lVarArr == null) {
                throw new UnsupportedOperationException();
            }
            int i9 = i3 ^ 125;
            int i10 = ((i3 & 125) | i9) << 1;
            int i11 = -i9;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (locale == null) {
                int i13 = i3 + 5;
                b = i13 % 128;
                int i14 = i13 % 2;
                locale2 = Locale.getDefault();
                int i15 = b;
                int i16 = (((i15 ^ 35) | (i15 & 35)) << 1) - (((~i15) & 35) | (i15 & (-36)));
                a = i16 % 128;
                int i17 = i16 % 2;
            } else {
                locale2 = locale;
            }
            int length = lVarArr.length;
            int i18 = b;
            int i19 = (i18 ^ 103) + ((i18 & 103) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 0;
            while (i21 < length) {
                int i22 = b + 117;
                int i23 = i22 % 128;
                a = i23;
                int i24 = i22 % 2;
                l lVar = lVarArr[i21];
                int i25 = i23 & 97;
                int i26 = -(-((i23 ^ 97) | i25));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                b = i27 % 128;
                int i28 = i27 % 2;
                lVar.q(appendable, j, hVar, i, abstractC0242a, locale2);
                i21++;
                int i29 = a;
                int i30 = (i29 & (-16)) | ((~i29) & 15);
                int i31 = (i29 & 15) << 1;
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                b = i32 % 128;
                int i33 = i32 % 2;
            }
            int i34 = b + 59;
            a = i34 % 128;
            int i35 = i34 % 2;
        }
    }

    public static class bDU extends bDT {
        private static int a = 0;
        private static int b = 1;

        public bDU(AbstractC0246t abstractC0246t, int i, boolean z) {
            super(abstractC0246t, i, z, i);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
        @Override // ivas.gov.bisp.enumeration.cJ.h.bDS, ivas.gov.bisp.enumeration.cJ.t
        public int j(e eVar, CharSequence charSequence, int i) {
            int i2;
            char cCharAt;
            int i3;
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = i5 & 25;
            int i7 = ((i5 ^ 25) | i6) << 1;
            int i8 = -((i5 | 25) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            int iJ = super.j(eVar, charSequence, i);
            Object obj = null;
            if (iJ < 0) {
                int i11 = a + 87;
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    return iJ;
                }
                obj.hashCode();
                throw null;
            }
            int i12 = this.d;
            int i13 = ((i12 | i) << 1) - (i12 ^ i);
            if (iJ != i13) {
                int i14 = b;
                int i15 = ((i14 ^ 86) + ((i14 & 86) << 1)) - 1;
                a = i15 % 128;
                int i16 = i15 % 2;
                if (this.e) {
                    int i17 = a;
                    int i18 = ((i17 ^ 47) | (i17 & 47)) << 1;
                    int i19 = -(((~i17) & 47) | (i17 & (-48)));
                    int i20 = (i18 & i19) + (i19 | i18);
                    b = i20 % 128;
                    if (i20 % 2 != 0 ? (cCharAt = charSequence.charAt(i)) == '-' : (cCharAt = charSequence.charAt(i)) == 'I') {
                        i13 = (i13 ^ 1) + ((i13 & 1) << 1);
                        int i21 = a;
                        int i22 = ((i21 ^ 9) | (i21 & 9)) << 1;
                        int i23 = -(((~i21) & 9) | (i21 & (-10)));
                        i3 = (i22 ^ i23) + ((i23 & i22) << 1);
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i24 = 4 % 4;
                        }
                    } else {
                        int i25 = b + 1;
                        a = i25 % 128;
                        if (i25 % 2 == 0 ? cCharAt == '+' : cCharAt == 'D') {
                            i13 = (i13 ^ 1) + ((i13 & 1) << 1);
                            int i26 = a;
                            int i27 = ((i26 ^ 9) | (i26 & 9)) << 1;
                            int i28 = -(((~i26) & 9) | (i26 & (-10)));
                            i3 = (i27 ^ i28) + ((i28 & i27) << 1);
                            b = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i29 = 4 % 4;
                            }
                        }
                    }
                }
                if (iJ > i13) {
                    int i30 = b;
                    int i31 = ((i30 & (-84)) | ((~i30) & 83)) + ((i30 & 83) << 1);
                    a = i31 % 128;
                    if (i31 % 2 != 0) {
                        int i32 = ((i13 & 1) - (~(i13 | 1))) - 1;
                        int i33 = ~i32;
                        i2 = (i32 & i33) | (i33 ^ i32);
                    } else {
                        int i34 = ((i13 | 1) << 1) - (i13 ^ 1);
                        i2 = (i34 | (~i34)) & (~i34);
                    }
                    int i35 = (i30 & 79) + (i30 | 79);
                    a = i35 % 128;
                    if (i35 % 2 == 0) {
                        return i2;
                    }
                    throw null;
                }
                if (iJ < i13) {
                    int i36 = b;
                    int i37 = i36 & 7;
                    int i38 = -(-((i36 ^ 7) | i37));
                    int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                    int i40 = i39 % 128;
                    a = i40;
                    int i41 = i39 % 2;
                    iJ = ~iJ;
                    int i42 = (i40 & 97) + (i40 | 97);
                    b = i42 % 128;
                    int i43 = i42 % 2;
                }
            }
            int i44 = b;
            int i45 = (i44 ^ 61) + ((i44 & 61) << 1);
            a = i45 % 128;
            int i46 = i45 % 2;
            return iJ;
        }
    }

    public static class bDV implements l, t {
        private static int a = 0;
        private static int b = 1;
        public final AbstractC0246t c;
        public int d;
        public int e;

        public bDV(AbstractC0246t abstractC0246t, int i, int i2) {
            this.c = abstractC0246t;
            if (i2 > 18) {
                int i3 = a;
                int i4 = i3 & 125;
                int i5 = i4 + ((i3 ^ 125) | i4);
                b = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                i2 = 18;
            }
            this.d = i;
            this.e = i2;
            int i8 = a;
            int i9 = (-2) - (((i8 & 104) + (i8 | 104)) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 100) << 1) - (i2 ^ 100)) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return this.e;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void f(Appendable appendable, A a2, Locale locale) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 68) + ((i2 & 68) << 1)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            long jAP = a2.b().aP(a2, 0L);
            int i5 = a;
            int i6 = (i5 & 18) + (i5 | 18);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            ivas.gov.bisp.enumeration.p096p.h hVarB = a2.b();
            int i9 = a;
            int i10 = (i9 ^ 4) + ((i9 & 4) << 1);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            c(appendable, jAP, hVarB);
            int i13 = b;
            int i14 = i13 & 13;
            int i15 = (i13 | 13) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 79;
            int i4 = (i2 ^ 79) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return this.e;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i, AbstractC0242a abstractC0242a, Locale locale) throws IOException {
            int i2 = 2 % 2;
            int i3 = b + 5;
            a = i3 % 128;
            int i4 = i3 % 2;
            c(appendable, j, hVar);
            if (i4 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:80:0x030d  */
        /* JADX WARN: Code duplicated, block: B:82:0x032c  */
        /* JADX WARN: Code duplicated, block: B:84:0x033f  */
        /* JADX WARN: Code duplicated, block: B:85:0x034a  */
        public void c(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar) throws IOException {
            long j2;
            long j3;
            char c;
            long j4;
            int i;
            String string;
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = ((i5 ^ 94) + ((i5 & 94) << 1)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            ivas.gov.bisp.enumeration.cP.P pC = this.c.c(hVar);
            int i8 = a;
            int i9 = i8 & 7;
            int i10 = (i9 - (~(-(-((i8 ^ 7) | i9))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = this.d;
            try {
                long jT = pC.t(j);
                int i13 = b;
                int i14 = ((i13 ^ 2) + ((i13 & 2) << 1)) - 1;
                a = i14 % 128;
                if (i14 % 2 == 0 ? jT == 0 : jT == 0) {
                    while (true) {
                        int i15 = i12 & 110;
                        int i16 = ((i12 ^ 110) | i15) << 1;
                        int i17 = -((~i15) & (i12 | 110));
                        int i18 = (i16 & i17) + (i16 | i17);
                        i12 = (-2) - ((((i18 | (-110)) << 1) - (i18 ^ (-110))) ^ (-1));
                        if (i12 < 0) {
                            break;
                        }
                        int i19 = b;
                        int i20 = i19 & 27;
                        int i21 = (i19 ^ 27) | i20;
                        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                        a = i22 % 128;
                        if (i22 % 2 != 0) {
                            appendable.append('Q');
                        } else {
                            appendable.append('0');
                        }
                        int i23 = a;
                        int i24 = (i23 & (-28)) | ((~i23) & 27);
                        int i25 = (i23 & 27) << 1;
                        int i26 = (i24 & i25) + (i25 | i24);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                    }
                    int i28 = b;
                    int i29 = (i28 ^ 31) + ((i28 & 31) << 1);
                    a = i29 % 128;
                    if (i29 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                long jH = pC.m().h();
                int i30 = a;
                int i31 = ((i30 | 33) << 1) - (i30 ^ 33);
                b = i31 % 128;
                int i32 = i31 % 2;
                int i33 = this.e;
                int i34 = ((i30 & (-82)) | ((~i30) & 81)) + ((i30 & 81) << 1);
                b = i34 % 128;
                int i35 = i34 % 2;
                while (true) {
                    switch (i33) {
                        case 1:
                            int i36 = (-2) - ((b + 106) ^ (-1));
                            a = i36 % 128;
                            int i37 = i36 % 2;
                            j2 = 10;
                            break;
                        case 2:
                            int i38 = b;
                            int i39 = (i38 ^ 89) + ((i38 & 89) << 1);
                            a = i39 % 128;
                            if (i39 % 2 != 0) {
                                int i40 = 3 / 4;
                            }
                            j2 = 100;
                            break;
                        case 3:
                            int i41 = b;
                            int i42 = (i41 & 7) + (i41 | 7);
                            a = i42 % 128;
                            int i43 = i42 % 2;
                            j2 = 1000;
                            break;
                        case 4:
                            j2 = 10000;
                            break;
                        case 5:
                            int i44 = b;
                            int i45 = (i44 | 125) << 1;
                            int i46 = -(i44 ^ 125);
                            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                            a = i47 % 128;
                            int i48 = i47 % 2;
                            j2 = 100000;
                            break;
                        case 6:
                            j2 = 1000000;
                            break;
                        case 7:
                            int i49 = b + 55;
                            a = i49 % 128;
                            int i50 = i49 % 2;
                            j2 = 10000000;
                            break;
                        case 8:
                            int i51 = b;
                            int i52 = i51 & 59;
                            int i53 = (i51 | 59) & (~i52);
                            int i54 = i52 << 1;
                            int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
                            a = i55 % 128;
                            int i56 = i55 % 2;
                            j2 = 100000000;
                            break;
                        case 9:
                            j2 = 1000000000;
                            break;
                        case 10:
                            j2 = 10000000000L;
                            break;
                        case 11:
                            j2 = 100000000000L;
                            break;
                        case 12:
                            int i57 = b;
                            int i58 = ((i57 | 97) << 1) - (i57 ^ 97);
                            a = i58 % 128;
                            int i59 = i58 % 2;
                            j2 = 1000000000000L;
                            break;
                        case 13:
                            int i60 = b;
                            int i61 = ((i60 & 10) + (i60 | 10)) - 1;
                            a = i61 % 128;
                            int i62 = i61 % 2;
                            j2 = 10000000000000L;
                            break;
                        case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                            j2 = 100000000000000L;
                            break;
                        case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                            j2 = 1000000000000000L;
                            break;
                        case 16:
                            j2 = 10000000000000000L;
                            break;
                        case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                            int i63 = b + 125;
                            a = i63 % 128;
                            int i64 = i63 % 2;
                            j2 = 100000000000000000L;
                            break;
                        case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                            int i65 = a;
                            int i66 = (i65 & (-12)) | ((~i65) & 11);
                            int i67 = -(-((i65 & 11) << 1));
                            int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                            b = i68 % 128;
                            if (i68 % 2 == 0) {
                                int i69 = 2 / 2;
                            }
                            j2 = 1000000000000000000L;
                            break;
                        default:
                            int i70 = b + 37;
                            a = i70 % 128;
                            int i71 = i70 % 2;
                            j2 = 1;
                            break;
                    }
                    if ((jH * j2) / j2 == jH) {
                        int i72 = a;
                        int i73 = (i72 ^ 45) + ((i72 & 45) << 1);
                        b = i73 % 128;
                        int i74 = i73 % 2;
                        long[] jArr = new long[2];
                        long j5 = (jT * j2) / jH;
                        int i75 = (i72 ^ 67) + ((i72 & 67) << 1);
                        b = i75 % 128;
                        if (i75 % 2 == 0) {
                            jArr[0] = j5;
                            j3 = i33;
                            c = 0;
                        } else {
                            jArr[0] = j5;
                            j3 = i33;
                            c = 1;
                        }
                        int i76 = ((i72 ^ 66) + ((i72 & 66) << 1)) - 1;
                        int i77 = i76 % 128;
                        b = i77;
                        if (i76 % 2 == 0) {
                            jArr[c] = j3;
                            j4 = jArr[0];
                            i = (int) j4;
                        } else {
                            jArr[c] = j3;
                            j4 = jArr[0];
                            i = (int) jArr[1];
                        }
                        if ((2147483647L & j4) == j4) {
                            int i78 = i77 & 31;
                            int i79 = (((i77 ^ 31) | i78) << 1) - ((i77 | 31) & (~i78));
                            a = i79 % 128;
                            int i80 = i79 % 2;
                            string = Integer.toString((int) j4);
                        } else {
                            string = Long.toString(j4);
                            int i81 = a;
                            int i82 = (i81 & 119) + (i81 | 119);
                            b = i82 % 128;
                            int i83 = i82 % 2;
                        }
                        int length = string.length();
                        while (length < i) {
                            int i84 = a;
                            int i85 = i84 & 79;
                            int i86 = (i84 | 79) & (~i85);
                            int i87 = -(-(i85 << 1));
                            int i88 = (i86 & i87) + (i86 | i87);
                            b = i88 % 128;
                            int i89 = i88 % 2;
                            appendable.append('0');
                            int i90 = i12 & (-53);
                            int i91 = ((i12 ^ (-53)) | i90) << 1;
                            int i92 = -((i12 | (-53)) & (~i90));
                            int i93 = (i91 & i92) + (i91 | i92);
                            i12 = (((i93 & (-53)) | ((~i93) & 52)) - (~(-(-((i93 & 52) << 1))))) - 1;
                            int i94 = ((i ^ (-48)) | (i & (-48))) << 1;
                            int i95 = -(((~i) & (-48)) | (i & 47));
                            i = (i94 & i95) + (i94 | i95) + 47;
                        }
                        if (i12 < i) {
                            while (i12 < i) {
                                int i96 = a;
                                int i97 = (i96 & 81) + (i96 | 81);
                                b = i97 % 128;
                                int i98 = i97 % 2;
                                if (length > 1) {
                                    int i99 = i96 + 81;
                                    b = i99 % 128;
                                    int i100 = i99 % 2;
                                    if (string.charAt(length - 1) == '0') {
                                        int i101 = a;
                                        int i102 = i101 ^ 5;
                                        int i103 = -(-((i101 & 5) << 1));
                                        int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                                        b = i104 % 128;
                                        if (i104 % 2 == 0) {
                                            i = ((i & 106) << 1) + ((i & (-107)) | ((~i) & 106));
                                            int i105 = length + 164;
                                            int i106 = (i105 & 54) | ((~i105) & (-55));
                                            int i107 = (i105 & (-55)) << 1;
                                            length = (i107 | i106) + (i106 & i107);
                                        } else {
                                            int i108 = ((((i ^ (-40)) | (i & (-40))) << 1) - (~(-(((~i) & (-40)) | (i & 39))))) - 1;
                                            i = ((i108 & 40) + (i108 | 40)) - 1;
                                            length += (~length) | length;
                                        }
                                    }
                                }
                                if (length < string.length()) {
                                    int i109 = a;
                                    int i110 = i109 & 45;
                                    int i111 = (i109 | 45) & (~i110);
                                    int i112 = -(-(i110 << 1));
                                    int i113 = (i111 ^ i112) + ((i111 & i112) << 1);
                                    int i114 = i113 % 128;
                                    b = i114;
                                    int i115 = i113 % 2;
                                    int i116 = i114 + 61;
                                    a = i116 % 128;
                                    int i117 = i116 % 2;
                                    i2 = 0;
                                    while (i2 < length) {
                                        int i118 = b;
                                        i3 = ((i118 ^ 61) - (~(-(-((i118 & 61) << 1))))) - 1;
                                        a = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            appendable.append(string.charAt(i2));
                                            int i119 = 62 / 0;
                                        } else {
                                            appendable.append(string.charAt(i2));
                                        }
                                        int i120 = (i2 & (-2)) | ((~i2) & 1);
                                        int i121 = (i2 & 1) << 1;
                                        i2 = ((i120 | i121) << 1) - (i121 ^ i120);
                                        int i122 = b;
                                        int i123 = (i122 ^ 41) + ((i122 & 41) << 1);
                                        a = i123 % 128;
                                        int i124 = i123 % 2;
                                    }
                                    int i125 = b;
                                    int i126 = i125 & 69;
                                    int i127 = (i125 | 69) & (~i126);
                                    int i128 = i126 << 1;
                                    int i129 = (i127 & i128) + (i127 | i128);
                                    a = i129 % 128;
                                    int i130 = i129 % 2;
                                    return;
                                }
                            }
                            if (length < string.length()) {
                                int i1010 = a;
                                int i1110 = i1010 & 45;
                                int i1111 = (i1010 | 45) & (~i1110);
                                int i1112 = -(-(i1110 << 1));
                                int i1113 = (i1111 ^ i1112) + ((i1111 & i1112) << 1);
                                int i1114 = i1113 % 128;
                                b = i1114;
                                int i1115 = i1113 % 2;
                                int i1116 = i1114 + 61;
                                a = i1116 % 128;
                                int i1117 = i1116 % 2;
                                i2 = 0;
                                while (i2 < length) {
                                    int i1118 = b;
                                    i3 = ((i1118 ^ 61) - (~(-(-((i1118 & 61) << 1))))) - 1;
                                    a = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        appendable.append(string.charAt(i2));
                                        int i1119 = 62 / 0;
                                    } else {
                                        appendable.append(string.charAt(i2));
                                    }
                                    int i1210 = (i2 & (-2)) | ((~i2) & 1);
                                    int i1211 = (i2 & 1) << 1;
                                    i2 = ((i1210 | i1211) << 1) - (i1211 ^ i1210);
                                    int i1212 = b;
                                    int i1213 = (i1212 ^ 41) + ((i1212 & 41) << 1);
                                    a = i1213 % 128;
                                    int i1214 = i1213 % 2;
                                }
                                int i1215 = b;
                                int i1216 = i1215 & 69;
                                int i1217 = (i1215 | 69) & (~i1216);
                                int i1218 = i1216 << 1;
                                int i1219 = (i1217 & i1218) + (i1217 | i1218);
                                a = i1219 % 128;
                                int i131 = i1219 % 2;
                                return;
                            }
                        }
                        appendable.append(string);
                        int i132 = a;
                        int i133 = (i132 ^ 21) + ((i132 & 21) << 1);
                        b = i133 % 128;
                        int i134 = i133 % 2;
                        return;
                    }
                    i33--;
                }
            } catch (RuntimeException unused) {
                h.c(appendable, i12);
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x00c3 A[PHI: r10
  0x00c3: PHI (r10v27 char) = (r10v26 char), (r10v35 char) binds: [B:16:0x00c1, B:13:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:21:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:23:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:26:0x011c  */
        /* JADX WARN: Code duplicated, block: B:55:0x0124 A[EDGE_INSN: B:55:0x0124->B:28:0x0124 BREAK  A[LOOP:0: B:9:0x007f->B:27:0x011e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x011e A[SYNTHETIC] */
        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int j(e eVar, CharSequence charSequence, int i) {
            int iMin;
            char cCharAt;
            int i2;
            int i3;
            int i4;
            int i5 = 2 % 2;
            int i6 = b;
            int i7 = ((i6 & 54) + (i6 | 54)) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                ivas.gov.bisp.enumeration.p096p.h hVar = eVar.d;
                throw null;
            }
            ivas.gov.bisp.enumeration.cP.P pC = this.c.c(eVar.d);
            int i8 = this.e;
            int length = charSequence.length();
            int i9 = b;
            int i10 = (i9 | 11) << 1;
            int i11 = -(((~i9) & 11) | (i9 & (-12)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                iMin = Math.min(i8, length << i);
            } else {
                int i13 = -i;
                int i14 = length & i13;
                int i15 = ((length ^ i13) | i14) << 1;
                int i16 = -((length | i13) & (~i14));
                iMin = Math.min(i8, ((i15 | i16) << 1) - (i16 ^ i15));
            }
            long jH = pC.m().h();
            int i17 = b;
            int i18 = ((i17 & 47) - (~(-(-(i17 | 47))))) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
            long j = 10;
            long j2 = jH * 10;
            long j3 = 0;
            int i20 = 0;
            while (i20 < iMin) {
                int i21 = b;
                int i22 = ((i21 ^ 111) | (i21 & 111)) << 1;
                int i23 = -((i21 & (-112)) | ((~i21) & 111));
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = -(-i20);
                    int i26 = i ^ i25;
                    int i27 = ((i25 & i) | i26) << 1;
                    int i28 = -i26;
                    cCharAt = charSequence.charAt((i27 & i28) + (i27 | i28));
                    if (cCharAt < '0') {
                        break;
                    }
                    if (cCharAt <= '9') {
                        break;
                        break;
                    }
                    int i29 = b;
                    i2 = i29 + 39;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i30 = (i20 & (-108)) | ((~i20) & 107);
                        int i31 = -(-((i20 & 107) << 1));
                        i3 = (i30 ^ i31) + ((i30 & i31) << 1);
                        j2 += 10;
                    } else {
                        int i32 = i20 & 1;
                        int i33 = ((i20 ^ 1) | i32) << 1;
                        int i34 = -((i20 | 1) & (~i32));
                        i3 = (i33 & i34) + (i33 | i34);
                        j2 /= 10;
                    }
                    i20 = i3;
                    int i35 = cCharAt ^ (-48);
                    int i36 = -(-((cCharAt & (-48)) << 1));
                    j3 += ((long) ((i35 ^ i36) + ((i35 & i36) << 1))) * j2;
                    i4 = (i29 & 121) + (i29 | 121);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i37 = 2 % 3;
                    }
                    j = 10;
                } else {
                    cCharAt = charSequence.charAt(i >>> i20);
                    if (cCharAt < 28) {
                        break;
                    }
                    if (cCharAt <= '9') {
                        break;
                    }
                    int i210 = b;
                    i2 = i210 + 39;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i38 = (i20 & (-108)) | ((~i20) & 107);
                        int i39 = -(-((i20 & 107) << 1));
                        i3 = (i38 ^ i39) + ((i38 & i39) << 1);
                        j2 += 10;
                    } else {
                        int i310 = i20 & 1;
                        int i311 = ((i20 ^ 1) | i310) << 1;
                        int i312 = -((i20 | 1) & (~i310));
                        i3 = (i311 & i312) + (i311 | i312);
                        j2 /= 10;
                    }
                    i20 = i3;
                    int i313 = cCharAt ^ (-48);
                    int i314 = -(-((cCharAt & (-48)) << 1));
                    j3 += ((long) ((i313 ^ i314) + ((i313 & i314) << 1))) * j2;
                    i4 = (i210 & 121) + (i210 | 121);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i315 = 2 % 3;
                    }
                    j = 10;
                }
            }
            long j4 = j3 / j;
            if (i20 == 0) {
                int i40 = a;
                int i41 = i40 & 43;
                int i42 = i40 | 43;
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                int i44 = i43 % 128;
                b = i44;
                int i45 = i43 % 2 == 0 ? ~i : (~i) & (i | (~i));
                int i46 = (i44 & (-120)) | ((~i44) & 119);
                int i47 = (i44 & 119) << 1;
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                a = i48 % 128;
                if (i48 % 2 == 0) {
                    return i45;
                }
                throw null;
            }
            if (j4 > 2147483647L) {
                int i49 = b + 101;
                a = i49 % 128;
                return i49 % 2 != 0 ? ~i : (~i) & ((~i) | i);
            }
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            ivas.gov.bisp.enumeration.cS.t tVar = new ivas.gov.bisp.enumeration.cS.t(AbstractC0246t.y, ivas.gov.bisp.enumeration.cS.z.c, pC.m());
            int i50 = b + 117;
            a = i50 % 128;
            int i51 = i50 % 2;
            e.bDJ bdjE = eVar.e();
            int i52 = b;
            int i53 = (i52 ^ 67) + ((i52 & 67) << 1);
            a = i53 % 128;
            int i54 = i53 % 2;
            bdjE.c = tVar;
            bdjE.d = (int) j4;
            int i55 = b;
            int i56 = i55 & 11;
            int i57 = (i55 | 11) & (~i56);
            int i58 = i56 << 1;
            int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
            a = i59 % 128;
            int i60 = i59 % 2;
            bdjE.e = null;
            bdjE.f = null;
            int i61 = ((~i20) & i) | ((~i) & i20);
            int i62 = -(-((i & i20) << 1));
            int i63 = (i61 & i62) + (i61 | i62);
            int i64 = a;
            int i65 = i64 & 9;
            int i66 = (((i64 | 9) & (~i65)) - (~(i65 << 1))) - 1;
            b = i66 % 128;
            if (i66 % 2 == 0) {
                int i67 = 64 / 0;
            }
            return i63;
        }
    }

    public static class bDW implements t {
        private static int a = 0;
        private static int b = 1;
        public final t[] c;
        public final int d;

        public bDW(t[] tVarArr) {
            int iD;
            this.c = tVarArr;
            int length = tVarArr.length;
            int i = 2 % 2;
            int i2 = 0;
            while (true) {
                length = (-2) - (length ^ (-1));
                if (length < 0) {
                    this.d = i2;
                    int i3 = b;
                    int i4 = (i3 & 43) + (i3 | 43);
                    a = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                int i6 = a + 93;
                b = i6 % 128;
                Object obj = null;
                if (i6 % 2 == 0) {
                    t tVar = tVarArr[length];
                    obj.hashCode();
                    throw null;
                }
                t tVar2 = tVarArr[length];
                if (tVar2 != null && (iD = tVar2.d()) > i2) {
                    int i7 = a;
                    int i8 = ((i7 ^ 117) | (i7 & 117)) << 1;
                    int i9 = -(((~i7) & 117) | (i7 & (-118)));
                    int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                    int i11 = i10 % 128;
                    b = i11;
                    if (i10 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i12 = (-2) - (((i11 & 54) + (i11 | 54)) ^ (-1));
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    i2 = iD;
                }
            }
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-34)) | ((~i2) & 33);
            int i4 = (i2 & 33) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return this.d;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:104:0x013b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[PHI: r10
  0x00e4: PHI (r10v38 int) = (r10v37 int), (r10v46 int) binds: [B:42:0x00e2, B:39:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:47:0x010c  */
        /* JADX WARN: Code duplicated, block: B:48:0x012c  */
        /* JADX WARN: Code duplicated, block: B:67:0x0190  */
        /* JADX WARN: Code duplicated, block: B:69:0x0199  */
        /* JADX WARN: Code duplicated, block: B:95:0x019b A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0208, code lost:
        
            if (r9 != 0) goto L87;
         */
        @Override // ivas.gov.bisp.enumeration.cJ.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int j(ivas.gov.bisp.enumeration.cJ.e r20, java.lang.CharSequence r21, int r22) {
            /*
                Method dump skipped, instruction units count: 617
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.h.bDW.j(ivas.gov.bisp.enumeration.cJ.e, java.lang.CharSequence, int):int");
        }
    }

    public static class bDY implements l, t {
        private static int a = 0;
        private static int b = 1;
        public static Map<Locale, Map<AbstractC0246t, Object[]>> c = new ConcurrentHashMap();
        public final AbstractC0246t d;
        public final boolean e;

        static {
            int i = b + 47;
            a = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public bDY(AbstractC0246t abstractC0246t, boolean z) {
            this.d = abstractC0246t;
            this.e = z;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 67;
            int i4 = (((i2 & 67) | i3) << 1) - i3;
            a = i4 % 128;
            int i5 = i4 % 2;
            int iP = p();
            int i6 = a + 91;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return iP;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 ^ 47;
            int i5 = -(-((i3 & 47) << 1));
            int i6 = (i4 & i5) + (i4 | i5);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            if (!(!this.e)) {
                int i9 = i3 & 43;
                int i10 = (((i3 ^ 43) | i9) << 1) - ((~i9) & (i3 | 43));
                a = i10 % 128;
                int i11 = i10 % 2;
                int i12 = (i3 ^ 9) + ((i3 & 9) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                i = 6;
            } else {
                int i14 = (((i7 | 55) << 1) - (~(-(((~i7) & 55) | (i7 & (-56)))))) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
                i = 20;
            }
            int i16 = b;
            int i17 = i16 & 43;
            int i18 = (i16 | 43) & (~i17);
            int i19 = i17 << 1;
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                return i;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i, AbstractC0242a abstractC0242a, Locale locale) throws IOException {
            String strH;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 ^ 71;
            int i5 = ((i3 & 71) | i4) << 1;
            int i6 = -i4;
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            b = i7 % 128;
            int i8 = i7 % 2;
            try {
                ivas.gov.bisp.enumeration.cP.P pC = this.d.c(hVar);
                int i9 = a;
                int i10 = i9 & 117;
                int i11 = (i9 ^ 117) | i10;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                b = i12 % 128;
                int i13 = i12 % 2;
                if (!this.e) {
                    strH = pC.c(j, locale);
                    int i14 = b;
                    int i15 = (i14 ^ 67) + ((i14 & 67) << 1);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    int i17 = (i9 ^ 99) + ((i9 & 99) << 1);
                    b = i17 % 128;
                    if (i17 % 2 == 0) {
                        pC.h(j, locale);
                        throw null;
                    }
                    strH = pC.h(j, locale);
                    int i18 = b;
                    int i19 = i18 & 23;
                    int i20 = -(-((i18 ^ 23) | i19));
                    int i21 = (i19 & i20) + (i20 | i19);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                }
                appendable.append(strH);
                int i23 = a;
                int i24 = ((i23 & 116) + (i23 | 116)) - 1;
                b = i24 % 128;
                int i25 = i24 % 2;
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void f(Appendable appendable, A a2, Locale locale) throws IOException {
            String strK;
            ivas.gov.bisp.enumeration.cP.P pC;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 111) + (i2 | 111);
            b = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object obj = null;
                if (a2.h(this.d)) {
                    int i5 = b;
                    int i6 = (i5 ^ 91) + ((i5 & 91) << 1);
                    a = i6 % 128;
                    if (i6 % 2 != 0) {
                        pC = this.d.c(a2.b());
                        int i7 = 81 / 0;
                    } else {
                        pC = this.d.c(a2.b());
                    }
                    int i8 = b;
                    int i9 = i8 & 63;
                    int i10 = (i8 | 63) & (~i9);
                    int i11 = i9 << 1;
                    int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                    a = i12 % 128;
                    if (i12 % 2 != 0) {
                        throw null;
                    }
                    if (this.e) {
                        strK = pC.i(a2, locale);
                        int i13 = b;
                        int i14 = i13 & 95;
                        int i15 = (i13 ^ 95) | i14;
                        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                        a = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        strK = pC.k(a2, locale);
                        int i18 = b;
                        int i19 = (i18 & (-16)) | ((~i18) & 15);
                        int i20 = (i18 & 15) << 1;
                        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                    }
                } else {
                    int i23 = a + 89;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    strK = "�";
                }
                appendable.append(strK);
                int i25 = b;
                int i26 = i25 ^ 99;
                int i27 = ((i25 & 99) | i26) << 1;
                int i28 = -i26;
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        /* JADX WARN: Code duplicated, block: B:55:0x02e9  */
        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int j(e eVar, CharSequence charSequence, int i) {
            Locale locale;
            ConcurrentHashMap concurrentHashMap;
            int iIntValue;
            Map map;
            String string;
            int i2;
            long j;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = 1;
            int i7 = ((i5 | 83) << 1) - (i5 ^ 83);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                locale = eVar.f;
                concurrentHashMap = (ConcurrentHashMap) c;
                int i8 = 85 / 0;
            } else {
                locale = eVar.f;
                concurrentHashMap = (ConcurrentHashMap) c;
            }
            Map concurrentHashMap2 = (Map) concurrentHashMap.get(locale);
            Object obj = null;
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap();
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) c;
                int i9 = a;
                int i10 = (((i9 | 15) << 1) - (~(-(i9 ^ 15)))) - 1;
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    concurrentHashMap3.put(locale, concurrentHashMap2);
                    obj.hashCode();
                    throw null;
                }
                concurrentHashMap3.put(locale, concurrentHashMap2);
                int i11 = b;
                int i12 = i11 & 109;
                int i13 = ((i11 ^ 109) | i12) << 1;
                int i14 = -((i11 | 109) & (~i12));
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            Object[] objArr = (Object[]) concurrentHashMap2.get(this.d);
            int i17 = b;
            int i18 = (i17 & 21) + (i17 | 21);
            a = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap(32);
                T t = new T(0L, AbstractC0242a.c);
                int i19 = a;
                int i20 = (i19 & 53) + (i19 | 53);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    throw null;
                }
                AbstractC0246t abstractC0246t = this.d;
                if (abstractC0246t == null) {
                    throw new IllegalArgumentException("The DateTimeFieldType must not be null");
                }
                ivas.gov.bisp.enumeration.cP.P pC = abstractC0246t.c(t.d);
                int i21 = a;
                int i22 = ((i21 ^ 9) | (i21 & 9)) << 1;
                int i23 = -((i21 & (-10)) | (9 & (~i21)));
                int i24 = (i22 & i23) + (i22 | i23);
                b = i24 % 128;
                int i25 = i24 % 2;
                if (!pC.x()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Field '");
                    sb.append(abstractC0246t);
                    sb.append("' is not supported");
                    throw new IllegalArgumentException(sb.toString());
                }
                int i26 = a + 71;
                b = i26 % 128;
                int i27 = i26 % 2;
                int iQ = pC.q();
                int iR = pC.r();
                int i28 = b + 65;
                int i29 = i28 % 128;
                a = i29;
                int i30 = i28 % 2;
                if ((iR - (~(-iQ))) - 1 > 32) {
                    int i31 = i29 & 125;
                    int i32 = (i29 ^ 125) | i31;
                    int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                    b = i33 % 128;
                    return i33 % 2 == 0 ? i : ~i;
                }
                int iP = pC.p(locale);
                int i34 = b;
                int i35 = i34 ^ 27;
                int i36 = (((i34 & 27) | i35) << 1) - i35;
                a = i36 % 128;
                if (i36 % 2 != 0) {
                    int i37 = 3 / 5;
                }
                while (iQ <= iR) {
                    int i38 = a;
                    int i39 = (i38 & 123) + (i38 | 123);
                    b = i39 % 128;
                    if (i39 % i3 == 0) {
                        t.c = pC.A(t.c, iQ);
                        j = t.c;
                        int i40 = 0 / 0;
                    } else {
                        t.c = pC.A(t.c, iQ);
                        j = t.c;
                    }
                    String strH = pC.h(j, locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap4.put(strH, bool);
                    int i41 = a;
                    int i42 = (i41 & (-50)) | ((~i41) & 49);
                    int i43 = (i41 & 49) << i6;
                    int i44 = (i42 & i43) + (i43 | i42);
                    b = i44 % 128;
                    int i45 = i44 % 2;
                    Map map2 = concurrentHashMap2;
                    String lowerCase = pC.h(t.c, locale).toLowerCase(locale);
                    int i46 = b;
                    int i47 = (i46 ^ 69) + ((i46 & 69) << 1);
                    a = i47 % 128;
                    if (i47 % 2 != 0) {
                        concurrentHashMap4.put(lowerCase, bool);
                        pC.h(t.c, locale);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    concurrentHashMap4.put(lowerCase, bool);
                    concurrentHashMap4.put(pC.h(t.c, locale).toUpperCase(locale), bool);
                    String strC = pC.c(t.c, locale);
                    int i48 = b;
                    int i49 = iP;
                    int i50 = i48 & 47;
                    int i51 = ((i48 ^ 47) | i50) << 1;
                    int i52 = -((i48 | 47) & (~i50));
                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                    a = i53 % 128;
                    int i54 = i53 % 2;
                    concurrentHashMap4.put(strC, bool);
                    String strC2 = pC.c(t.c, locale);
                    int i55 = a;
                    int i56 = ((i55 & 35) - (~(i55 | 35))) - 1;
                    b = i56 % 128;
                    int i57 = i56 % 2;
                    concurrentHashMap4.put(strC2.toLowerCase(locale), bool);
                    String strC3 = pC.c(t.c, locale);
                    int i58 = a;
                    int i59 = i58 ^ 107;
                    int i60 = ((((i58 & 107) | i59) << 1) - (~(-i59))) - 1;
                    b = i60 % 128;
                    int i61 = i60 % 2;
                    concurrentHashMap4.put(strC3.toUpperCase(locale), bool);
                    int i62 = iQ & 1;
                    iQ = (((~i62) & (iQ | 1)) - (~(i62 << 1))) - 1;
                    int i63 = b;
                    int i64 = (i63 & 43) + (i63 | 43);
                    a = i64 % 128;
                    int i65 = i64 % 2;
                    concurrentHashMap2 = map2;
                    iP = i49;
                    i3 = 2;
                    i6 = 1;
                }
                int i66 = iP;
                Map map3 = concurrentHashMap2;
                if (!"en".equals(locale.getLanguage())) {
                    iIntValue = i66;
                } else {
                    int i67 = b;
                    int i68 = i67 & 1;
                    int i69 = (i68 - (~((i67 ^ 1) | i68))) - 1;
                    a = i69 % 128;
                    int i70 = i69 % 2;
                    AbstractC0246t abstractC0246t2 = this.d;
                    AbstractC0246t abstractC0246t3 = AbstractC0246t.d;
                    if (abstractC0246t2 == AbstractC0246t.d) {
                        int i71 = b;
                        int i72 = (((i71 | 14) << 1) - (i71 ^ 14)) - 1;
                        a = i72 % 128;
                        int i73 = i72 % 2;
                        Boolean bool2 = Boolean.TRUE;
                        int i74 = b;
                        int i75 = i74 & 47;
                        int i76 = (i74 | 47) & (~i75);
                        int i77 = i75 << 1;
                        int i78 = ((i76 | i77) << 1) - (i76 ^ i77);
                        a = i78 % 128;
                        if (i78 % 2 != 0) {
                            concurrentHashMap4.put("BCE", bool2);
                            concurrentHashMap4.put("bce", bool2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        concurrentHashMap4.put("BCE", bool2);
                        concurrentHashMap4.put("bce", bool2);
                        int i79 = a;
                        int i80 = (((i79 & (-56)) | ((~i79) & 55)) - (~(-(-((i79 & 55) << 1))))) - 1;
                        b = i80 % 128;
                        int i81 = i80 % 2;
                        concurrentHashMap4.put("CE", bool2);
                        int i82 = a + 19;
                        b = i82 % 128;
                        int i83 = i82 % 2;
                        concurrentHashMap4.put("ce", bool2);
                        int i84 = a;
                        int i85 = i84 + 107;
                        b = i85 % 128;
                        int i86 = i85 % 2;
                        int i87 = (i84 & (-76)) | ((~i84) & 75);
                        int i88 = (i84 & 75) << 1;
                        int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                        b = i89 % 128;
                        if (i89 % 2 == 0) {
                            int i90 = 2 / 4;
                        }
                        iIntValue = 3;
                    } else {
                        iIntValue = i66;
                    }
                }
                Object[] objArr2 = new Object[2];
                objArr2[0] = concurrentHashMap4;
                int i91 = b;
                int i92 = (i91 & 9) + (i91 | 9);
                a = i92 % 128;
                if (i92 % 2 != 0) {
                    i2 = 1;
                    objArr2[1] = Integer.valueOf(iIntValue);
                } else {
                    i2 = 1;
                    objArr2[1] = Integer.valueOf(iIntValue);
                }
                AbstractC0246t abstractC0246t4 = this.d;
                int i93 = b;
                int i94 = ((i93 ^ 68) + ((i93 & 68) << i2)) - i2;
                a = i94 % 128;
                int i95 = i94 % 2;
                map3.put(abstractC0246t4, objArr2);
                int i96 = b + 31;
                a = i96 % 128;
                int i97 = i96 % 2;
                map = concurrentHashMap4;
            } else {
                Map map4 = (Map) objArr[0];
                Integer num = (Integer) objArr[1];
                int i98 = i17 & 83;
                int i99 = (i17 ^ 83) | i98;
                int i100 = ((i98 | i99) << 1) - (i98 ^ i99);
                a = i100 % 128;
                if (i100 % 2 != 0) {
                    iIntValue = num.intValue();
                    int i101 = 31 / 0;
                } else {
                    iIntValue = num.intValue();
                }
                int i102 = a;
                int i103 = i102 & 19;
                int i104 = (i102 | 19) & (~i103);
                int i105 = -(-(i103 << 1));
                int i106 = ((i104 | i105) << 1) - (i104 ^ i105);
                b = i106 % 128;
                int i107 = i106 % 2;
                map = map4;
            }
            int i108 = i & iIntValue;
            int i109 = -(-(iIntValue | i));
            int iMin = Math.min(charSequence.length(), ((i108 | i109) << 1) - (i109 ^ i108));
            int i110 = a;
            int i111 = ((i110 & (-78)) | ((~i110) & 77)) + ((i110 & 77) << 1);
            b = i111 % 128;
            int i112 = i111 % 2;
            while (iMin > i) {
                int i113 = a;
                int i114 = i113 & 41;
                int i115 = -(-(i113 | 41));
                int i116 = (i114 & i115) + (i115 | i114);
                b = i116 % 128;
                if (i116 % 2 == 0) {
                    string = charSequence.subSequence(i, iMin).toString();
                    int i117 = 6 / 0;
                } else {
                    string = charSequence.subSequence(i, iMin).toString();
                }
                int i118 = a + 59;
                b = i118 % 128;
                if (i118 % 2 == 0) {
                    map.containsKey(string);
                    throw null;
                }
                if (map.containsKey(string)) {
                    int i119 = a;
                    int i120 = i119 & 107;
                    int i121 = ((i119 ^ 107) | i120) << 1;
                    int i122 = -((i119 | 107) & (~i120));
                    int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                    b = i123 % 128;
                    int i124 = i123 % 2;
                    AbstractC0246t abstractC0246t5 = this.d;
                    e.bDJ bdjE = eVar.e();
                    ivas.gov.bisp.enumeration.p096p.h hVar = eVar.d;
                    int i125 = b;
                    int i126 = i125 & 61;
                    int i127 = ((((i125 ^ 61) | i126) << 1) - (~(-((i125 | 61) & (~i126))))) - 1;
                    a = i127 % 128;
                    int i128 = i127 % 2;
                    bdjE.c = abstractC0246t5.c(hVar);
                    bdjE.d = 0;
                    int i129 = b;
                    int i130 = ((i129 ^ 72) + ((i129 & 72) << 1)) - 1;
                    a = i130 % 128;
                    if (i130 % 2 != 0) {
                        bdjE.e = string;
                        bdjE.f = locale;
                        int i131 = 74 / 0;
                    } else {
                        bdjE.e = string;
                        bdjE.f = locale;
                    }
                    return iMin;
                }
                iMin = (iMin << 1) + (iMin ^ (-1));
                int i132 = a;
                int i133 = i132 & 69;
                int i134 = ((i132 | 69) & (~i133)) + (i133 << 1);
                b = i134 % 128;
                int i135 = i134 % 2;
            }
            int i136 = ~i;
            int i137 = a;
            int i138 = ((i137 ^ 42) + ((i137 & 42) << 1)) - 1;
            b = i138 % 128;
            int i139 = i138 % 2;
            return i136;
        }
    }

    public h f(char c) {
        int i = 2 % 2;
        bDQ bdq = new bDQ(c);
        this.d = null;
        ArrayList<Object> arrayList = this.c;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 104) << 1) - (i2 ^ 104)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            arrayList.add(bdq);
            this.c.add(bdq);
            int i4 = 53 / 0;
        } else {
            arrayList.add(bdq);
            this.c.add(bdq);
        }
        return this;
    }

    public h g(c cVar) {
        int i = 2 % 2;
        int i2 = a + 28;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (cVar == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        int i6 = i4 ^ 5;
        int i7 = ((((i4 & 5) | i6) << 1) - (~(-i6))) - 1;
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            l lVar = cVar.c;
            t tVar = cVar.d;
            obj.hashCode();
            throw null;
        }
        l lVar2 = cVar.c;
        t tVar2 = cVar.d;
        int i8 = a;
        int i9 = i8 & 19;
        int i10 = (i8 ^ 19) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            j(lVar2, tVar2);
            return this;
        }
        j(lVar2, tVar2);
        throw null;
    }

    public h k(AbstractC0246t abstractC0246t, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 67) | (i3 & 67)) << 1) - (((~i3) & 67) | (i3 & (-68)));
        b = i4 % 128;
        int i5 = i4 % 2;
        if (i <= 0) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("Illegal number of digits: ", i));
        }
        bDU bdu = new bDU(abstractC0246t, i, false);
        int i6 = a;
        int i7 = i6 & 57;
        int i8 = (i6 | 57) & (~i7);
        int i9 = i7 << 1;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            this.d = null;
            this.c.add(bdu);
            int i11 = 46 / 0;
        } else {
            this.d = null;
            this.c.add(bdu);
        }
        this.c.add(bdu);
        int i12 = b;
        int i13 = i12 & 71;
        int i14 = i13 + ((i12 ^ 71) | i13);
        a = i14 % 128;
        int i15 = i14 % 2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r9 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r1 = r2 & 49;
        r1 = (r1 - (~(-(-((r2 ^ 49) | r1))))) - 1;
        ivas.gov.bisp.enumeration.cJ.h.b = r1 % 128;
        r1 = r1 % 2;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r8 > 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r8 = new ivas.gov.bisp.enumeration.cJ.h.bEd(r7, r9, false);
        r6.d = null;
        r7 = ivas.gov.bisp.enumeration.cJ.h.b + 21;
        ivas.gov.bisp.enumeration.cJ.h.a = r7 % 128;
        r7 = r7 % 2;
        r6.c.add(r8);
        r6.c.add(r8);
        r7 = ivas.gov.bisp.enumeration.cJ.h.a;
        r8 = r7 & 55;
        r7 = (r7 | 55) & (~r8);
        r8 = r8 << 1;
        r9 = (r7 & r8) + (r7 | r8);
        ivas.gov.bisp.enumeration.cJ.h.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        if ((r9 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        r4 = 1 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.cJ.h.bDT(r7, r9, false, r8);
        r6.d = null;
        r7 = ivas.gov.bisp.enumeration.cJ.h.a;
        r8 = r7 & 7;
        r7 = r7 | 7;
        r9 = ((r8 | r7) << 1) - (r7 ^ r8);
        ivas.gov.bisp.enumeration.cJ.h.b = r9 % 128;
        r9 = r9 % 2;
        r6.c.add(r2);
        r6.c.add(r2);
        r7 = ivas.gov.bisp.enumeration.cJ.h.b;
        r8 = ((r7 & 32) + (r7 | 32)) - 1;
        ivas.gov.bisp.enumeration.cJ.h.a = r8 % 128;
        r8 = r8 % 2;
        r8 = r7 & 99;
        r7 = (r7 ^ 99) | r8;
        r9 = (r8 & r7) + (r7 | r8);
        ivas.gov.bisp.enumeration.cJ.h.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
    
        if ((r9 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (r9 > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.cJ.h l(ivas.gov.bisp.enumeration.cP.AbstractC0246t r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.h.l(ivas.gov.bisp.enumeration.cP.t, int, int):ivas.gov.bisp.enumeration.cJ.h");
    }

    public h q(AbstractC0246t abstractC0246t) {
        int i = 2 % 2;
        bDY bdy = new bDY(abstractC0246t, true);
        this.d = null;
        int i2 = a;
        int i3 = (i2 ^ 21) + ((i2 & 21) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.add(bdy);
        ArrayList<Object> arrayList = this.c;
        int i5 = b;
        int i6 = (i5 & (-44)) | ((~i5) & 43);
        int i7 = -(-((i5 & 43) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        arrayList.add(bdy);
        int i10 = b;
        int i11 = i10 & 119;
        int i12 = -(-((i10 ^ 119) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 85 / 0;
        }
        return this;
    }

    public h u(String str, boolean z, int i, int i2) {
        int i3 = 2 % 2;
        bEb beb = new bEb(str, str, z, i, i2);
        int i4 = b;
        int i5 = (i4 | 21) << 1;
        int i6 = -(((~i4) & 21) | (i4 & (-22)));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            this.d = null;
            this.c.add(beb);
            int i8 = 74 / 0;
        } else {
            this.d = null;
            this.c.add(beb);
        }
        int i9 = b;
        int i10 = i9 ^ 87;
        int i11 = ((i9 & 87) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        a = i13 % 128;
        int i14 = i13 % 2;
        this.c.add(beb);
        int i15 = a;
        int i16 = (i15 | 117) << 1;
        int i17 = -(((~i15) & 117) | (i15 & (-118)));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        return this;
    }

    public final boolean z(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        boolean z = true;
        int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (!(obj instanceof t)) {
            int i6 = (i4 & 94) + (i4 | 94);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i2 & 77;
        int i10 = i2 | 77;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        if (!(obj instanceof bDR)) {
            int i13 = (-2) - (((i2 ^ 18) + ((i2 & 18) << 1)) ^ (-1));
            b = i13 % 128;
            int i14 = i13 % 2;
            return true;
        }
        int i15 = i2 + 111;
        b = i15 % 128;
        int i16 = i15 % 2;
        if (((bDR) obj).d != null) {
            int i17 = a;
            int i18 = i17 & 27;
            int i19 = (i18 - (~((i17 ^ 27) | i18))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i17 ^ 45;
            int i22 = ((i17 & 45) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 & i23) + (i22 | i23);
            b = i24 % 128;
            int i25 = i24 % 2;
        } else {
            z = false;
        }
        int i26 = a;
        int i27 = i26 & 83;
        int i28 = i27 + ((i26 ^ 83) | i27);
        b = i28 % 128;
        if (i28 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public enum bDZ implements l, t {
        INSTANCE;

        private static int a = 1;
        private static int b;
        public static final List<String> d;
        public static final Map<String, List<String>> e;
        public static final int f;
        public static final List<String> g;
        public static final int h;

        static {
            int i2 = a;
            int i3 = (((i2 | 36) << 1) - (i2 ^ 36)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            ArrayList arrayList = new ArrayList();
            int i5 = a;
            int i6 = ((i5 | 9) << 1) - (i5 ^ 9);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                g = arrayList;
                AbstractC0242a.g().e();
                obj.hashCode();
                throw null;
            }
            g = arrayList;
            ArrayList arrayList2 = new ArrayList(AbstractC0242a.g().e());
            d = arrayList2;
            Collections.sort(arrayList2);
            e = new HashMap();
            int i7 = b;
            int i8 = i7 & 101;
            int i9 = ((((i7 ^ 101) | i8) << 1) - (~(-((i7 | 101) & (~i8))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            Iterator it = arrayList2.iterator();
            int i11 = a;
            int i12 = i11 ^ 115;
            int i13 = ((i11 & 115) | i12) << 1;
            int i14 = -i12;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 2 % 2;
            }
            int iMax = 0;
            int iMax2 = 0;
            while (!(!it.hasNext())) {
                int i17 = b + 41;
                a = i17 % 128;
                int i18 = i17 % 2;
                String str = (String) it.next();
                int i19 = b;
                int i20 = i19 & 49;
                int i21 = ((i19 ^ 49) | i20) << 1;
                int i22 = -((i19 | 49) & (~i20));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                a = i23 % 128;
                int i24 = i23 % 2;
                int iIndexOf = str.indexOf(47);
                if (iIndexOf >= 0) {
                    int i25 = a;
                    int i26 = i25 & 107;
                    int i27 = i26 + ((i25 ^ 107) | i26);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    if (iIndexOf < str.length()) {
                        int i29 = a;
                        int i30 = (((i29 ^ 13) | (i29 & 13)) << 1) - ((i29 & (-14)) | ((~i29) & 13));
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        iIndexOf++;
                        int i32 = i29 + 47;
                        b = i32 % 128;
                        if (i32 % 2 == 0) {
                            int i33 = 2 % 2;
                        }
                    }
                    iMax2 = Math.max(iMax2, iIndexOf);
                    int i34 = iIndexOf ^ 1;
                    int i35 = (((iIndexOf & 1) | i34) << 1) - i34;
                    int i36 = a;
                    int i37 = (i36 & 55) + (i36 | 55);
                    b = i37 % 128;
                    if (i37 % 2 != 0) {
                        str.substring(0, i35);
                        str.substring(iIndexOf);
                        obj.hashCode();
                        throw null;
                    }
                    String strSubstring = str.substring(0, i35);
                    String strSubstring2 = str.substring(iIndexOf);
                    Map<String, List<String>> map = e;
                    int i38 = a;
                    int i39 = ((i38 & 97) - (~(i38 | 97))) - 1;
                    b = i39 % 128;
                    int i40 = i39 % 2;
                    if (!map.containsKey(strSubstring)) {
                        map.put(strSubstring, new ArrayList());
                        int i41 = a;
                        int i42 = i41 & 51;
                        int i43 = (i42 - (~(-(-((i41 ^ 51) | i42))))) - 1;
                        int i44 = i43 % 128;
                        b = i44;
                        int i45 = i43 % 2;
                        int i46 = ((i44 ^ 43) | (i44 & 43)) << 1;
                        int i47 = -(((~i44) & 43) | (i44 & (-44)));
                        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                        a = i48 % 128;
                        if (i48 % 2 != 0) {
                            int i49 = 2 % 2;
                        }
                    }
                    List<String> list = map.get(strSubstring);
                    int i50 = b;
                    int i51 = (i50 & 103) + (i50 | 103);
                    a = i51 % 128;
                    int i52 = i51 % 2;
                    list.add(strSubstring2);
                    int i53 = b + 93;
                    a = i53 % 128;
                    int i54 = i53 % 2;
                    int i55 = 2 % 2;
                } else {
                    g.add(str);
                    int i56 = b;
                    int i57 = i56 & 25;
                    int i58 = ((i56 ^ 25) | i57) << 1;
                    int i59 = -((i56 | 25) & (~i57));
                    int i60 = (i58 & i59) + (i59 | i58);
                    a = i60 % 128;
                    if (i60 % 2 != 0) {
                        int i61 = 2 % 2;
                    }
                }
                iMax = Math.max(iMax, str.length());
                int i62 = a;
                int i63 = ((i62 & 78) + (i62 | 78)) - 1;
                b = i63 % 128;
                int i64 = i63 % 2;
                int i65 = 2 % 2;
            }
            f = iMax;
            h = iMax2;
            int i66 = a;
            int i67 = (i66 & 111) + (i66 | 111);
            b = i67 % 128;
            int i68 = i67 % 2;
        }

        public static bDZ valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 | 61) << 1) - (~(-(((~i3) & 61) | (i3 & (-62)))))) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return (bDZ) Enum.valueOf(bDZ.class, str);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static bDZ[] valuesCustom() {
            bDZ[] bdzArr;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 41;
            int i5 = (i4 - (~((i3 ^ 41) | i4))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            bDZ[] bdzArrValuesCustom = values();
            if (i6 == 0) {
                bdzArr = (bDZ[]) bdzArrValuesCustom.clone();
                int i7 = 39 / 0;
            } else {
                bdzArr = (bDZ[]) bdzArrValuesCustom.clone();
            }
            int i8 = a;
            int i9 = i8 ^ 117;
            int i10 = (((i8 & 117) | i9) << 1) - i9;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return bdzArr;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public final int d() {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 | 21) << 1) - (i3 ^ 21);
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = f;
            int i7 = i3 & 67;
            int i8 = (((i3 | 67) & (~i7)) - (~(i7 << 1))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            return i6;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public final void f(Appendable appendable, A a2, Locale locale) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 51;
            int i5 = (i3 ^ 51) | i4;
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public final int p() {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 53;
            int i5 = (i3 | 53) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = f;
            int i11 = i8 & 119;
            int i12 = (i8 ^ 119) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                return i10;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public final void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i2, AbstractC0242a abstractC0242a, Locale locale) throws IOException {
            String str;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = (i4 ^ 63) + ((i4 & 63) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (abstractC0242a != null) {
                str = abstractC0242a.g;
                int i6 = b;
                int i7 = i6 | 83;
                int i8 = i7 << 1;
                int i9 = -((~(i6 & 83)) & i7);
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
            } else {
                int i12 = i4 + 30;
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
                str = BuildConfig.FLAVOR;
            }
            appendable.append(str);
            int i15 = b;
            int i16 = (((i15 ^ 37) | (i15 & 37)) << 1) - (((~i15) & 37) | (i15 & (-38)));
            a = i16 % 128;
            int i17 = i16 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:56:0x01f2  */
        @Override // ivas.gov.bisp.enumeration.cJ.t
        public final int j(e eVar, CharSequence charSequence, int i2) {
            List<String> list;
            int length;
            Object obj;
            int i3;
            String string;
            List<String> list2;
            int i4;
            int i5;
            String string2;
            int i6 = 2 % 2;
            int i7 = b;
            int i8 = i7 & 3;
            int i9 = -(-(i7 | 3));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                list = g;
                length = charSequence.length();
                int i11 = 75 / 0;
            } else {
                list = g;
                length = charSequence.length();
            }
            int i12 = h;
            int i13 = ~i2;
            int i14 = i12 & i2;
            int iMin = Math.min(length, (i14 - (~((i12 ^ i2) | i14))) - 1);
            int i15 = b;
            int i16 = ((i15 ^ 111) | (i15 & 111)) << 1;
            int i17 = -(((~i15) & 111) | (i15 & (-112)));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            int i19 = i18 % 128;
            a = i19;
            int i20 = i18 % 2;
            int i21 = i19 + 105;
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i2;
            while (true) {
                obj = null;
                if (i23 >= iMin) {
                    int i24 = a;
                    int i25 = i24 & 125;
                    int i26 = (i25 - (~((i24 ^ 125) | i25))) - 1;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    i3 = i2;
                    List<String> list3 = list;
                    string = BuildConfig.FLAVOR;
                    list2 = list3;
                    break;
                }
                int i28 = b + 67;
                a = i28 % 128;
                int i29 = i28 % 2;
                if (charSequence.charAt(i23) == '/') {
                    int i30 = b;
                    int i31 = (i30 & 41) + (i30 | 41);
                    a = i31 % 128;
                    if (i31 % 2 == 0) {
                        int i32 = i23 & 1;
                        int i33 = (i23 ^ 1) | i32;
                        i5 = (i32 & i33) + (i32 | i33);
                    } else {
                        int i34 = (i23 & (-2)) | ((~i23) & 1);
                        int i35 = (i23 & 1) << 1;
                        i5 = ((i34 | i35) << 1) - (i34 ^ i35);
                    }
                    string = charSequence.subSequence(i2, i5).toString();
                    int length2 = string.length();
                    int i36 = length2 & i2;
                    int i37 = (length2 | i2) & (~i36);
                    int i38 = i36 << 1;
                    i3 = (i37 & i38) + (i37 | i38);
                    int i39 = a;
                    int i40 = i39 & 3;
                    int i41 = (((i39 ^ 3) | i40) << 1) - ((~i40) & (i39 | 3));
                    int i42 = i41 % 128;
                    b = i42;
                    if (i41 % 2 != 0) {
                        throw null;
                    }
                    if (i23 < length) {
                        int i43 = (i42 & 73) + (i42 | 73);
                        a = i43 % 128;
                        if (i43 % 2 == 0) {
                            ivas.gov.bisp.enumeration.p091n.j.w(string);
                            charSequence.charAt(i5);
                            obj.hashCode();
                            throw null;
                        }
                        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(string);
                        sbW.append(charSequence.charAt(i5));
                        string2 = sbW.toString();
                        int i44 = a;
                        int i45 = i44 & 53;
                        int i46 = (i44 ^ 53) | i45;
                        int i47 = (i45 & i46) + (i46 | i45);
                        b = i47 % 128;
                        int i48 = i47 % 2;
                    } else {
                        int i49 = (i39 ^ 113) + ((i39 & 113) << 1);
                        b = i49 % 128;
                        int i50 = i49 % 2;
                        string2 = string;
                    }
                    list2 = (List) ((HashMap) e).get(string2);
                    int i51 = a;
                    int i52 = ((i51 | 49) << 1) - ((i51 & (-50)) | ((~i51) & 49));
                    b = i52 % 128;
                    int i53 = i52 % 2;
                    if (list2 != null) {
                        break;
                    }
                    int i54 = (i51 & 38) + (i51 | 38);
                    int i55 = (i54 ^ (-1)) + (i54 << 1);
                    int i56 = i55 % 128;
                    b = i56;
                    int i57 = i55 % 2 != 0 ? i2 : (~i2) & (i2 | i13);
                    int i58 = (i56 | 97) << 1;
                    int i59 = -(((~i56) & 97) | (i56 & (-98)));
                    int i60 = (i58 & i59) + (i59 | i58);
                    a = i60 % 128;
                    if (i60 % 2 != 0) {
                        return i57;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i61 = i23 ^ (-127);
                int i62 = (i23 & (-127)) << 1;
                i23 = (i61 ^ i62) + ((i61 & i62) << 1) + 128;
                int i63 = b + 89;
                a = i63 % 128;
                int i64 = i63 % 2;
            }
            int i65 = b + 79;
            a = i65 % 128;
            int i66 = i65 % 2;
            String str = null;
            int i67 = 0;
            while (i67 < list2.size()) {
                int i68 = a;
                int i69 = ((i68 | 77) << 1) - (i68 ^ 77);
                b = i69 % 128;
                int i70 = i69 % 2;
                String str2 = list2.get(i67);
                int i71 = b;
                int i72 = (i71 ^ 98) + ((i71 & 98) << 1);
                int i73 = (i72 ^ (-1)) + (i72 << 1);
                int i74 = i73 % 128;
                a = i74;
                if (i73 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i75 = i74 + 75;
                b = i75 % 128;
                if (i75 % 2 != 0) {
                    h.e(charSequence, i3, str2);
                    throw null;
                }
                if (h.e(charSequence, i3, str2)) {
                    if (str != null) {
                        int i76 = b;
                        int i77 = i76 & 57;
                        int i78 = -(-((i76 ^ 57) | i77));
                        int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                        a = i79 % 128;
                        if (i79 % 2 == 0) {
                            str2.length();
                            throw null;
                        }
                        if (str2.length() > str.length()) {
                            int i80 = b;
                            int i81 = i80 & 105;
                            int i82 = ((i80 ^ 105) | i81) << 1;
                            int i83 = -((i80 | 105) & (~i81));
                            int i84 = (i82 & i83) + (i83 | i82);
                            a = i84 % 128;
                            int i85 = i84 % 2;
                            str = str2;
                        }
                    } else {
                        int i86 = b;
                        int i87 = i86 & 105;
                        int i88 = ((i86 ^ 105) | i87) << 1;
                        int i89 = -((i86 | 105) & (~i87));
                        int i810 = (i88 & i89) + (i89 | i88);
                        a = i810 % 128;
                        int i811 = i810 % 2;
                        str = str2;
                    }
                }
                i67 = (((i67 | (-104)) << 1) - (i67 ^ (-104))) + 105;
                int i90 = b;
                int i91 = i90 ^ 79;
                int i92 = ((((i90 & 79) | i91) << 1) - (~(-i91))) - 1;
                a = i92 % 128;
                int i93 = i92 % 2;
            }
            if (str == null) {
                int i94 = (~i2) & (i13 | i2);
                int i95 = b;
                int i96 = i95 & 57;
                int i97 = ((((i95 ^ 57) | i96) << 1) - (~(-((i95 | 57) & (~i96))))) - 1;
                a = i97 % 128;
                if (i97 % 2 == 0) {
                    int i98 = 28 / 0;
                }
                return i94;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            int i99 = b + 53;
            a = i99 % 128;
            if (i99 % 2 == 0) {
                sb.append(str);
                AbstractC0242a.d(sb.toString());
                throw null;
            }
            sb.append(str);
            AbstractC0242a abstractC0242aD = AbstractC0242a.d(sb.toString());
            int i100 = a;
            int i101 = (((i100 | 92) << 1) - (i100 ^ 92)) - 1;
            b = i101 % 128;
            int i102 = i101 % 2;
            eVar.m = null;
            eVar.i = abstractC0242aD;
            int length3 = str.length();
            int i103 = b;
            int i104 = (((i103 ^ 47) | (i103 & 47)) << 1) - (((~i103) & 47) | (i103 & (-48)));
            int i105 = i104 % 128;
            a = i105;
            if (i104 % 2 == 0) {
                i4 = length3 >>> i3;
            } else {
                int i106 = -(-i3);
                int i107 = ((length3 ^ i106) | (length3 & i106)) << 1;
                int i108 = -(((~length3) & i106) | ((~i106) & length3));
                i4 = ((i107 | i108) << 1) - (i108 ^ i107);
            }
            int i109 = (i105 & (-108)) | ((~i105) & 107);
            int i110 = -(-((i105 & 107) << 1));
            int i111 = (i109 ^ i110) + ((i110 & i109) << 1);
            b = i111 % 128;
            int i112 = i111 % 2;
            return i4;
        }
    }

    public h m(AbstractC0246t abstractC0246t, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 20;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i2 < i) {
            int i7 = i6 + 73;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            i2 = i;
        }
        if (i >= 0) {
            int i8 = (i6 & 24) + (i6 | 24);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (i2 > 0) {
                bDV bdv = new bDV(abstractC0246t, i, i2);
                int i11 = b;
                int i12 = (((i11 | 18) << 1) - (i11 ^ 18)) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
                this.d = null;
                this.c.add(bdv);
                ArrayList<Object> arrayList = this.c;
                int i14 = b;
                int i15 = ((i14 & (-102)) | ((~i14) & 101)) + ((i14 & 101) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                arrayList.add(bdv);
                int i17 = b;
                int i18 = ((i17 ^ 87) - (~((i17 & 87) << 1))) - 1;
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            }
        }
        throw new IllegalArgumentException();
    }

    public static class bDQ implements l, t {
        private static int a = 0;
        private static int b = 1;
        public final char c;

        public bDQ(char c) {
            this.c = c;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 73;
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 73;
            a = i5 % 128;
            int i6 = i5 % 2;
            return 1;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void f(Appendable appendable, A a2, Locale locale) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-36)) | ((~i2) & 35);
            int i4 = (i2 & 35) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            appendable.append(this.c);
            int i7 = b;
            int i8 = i7 & 91;
            int i9 = (((i7 ^ 91) | i8) << 1) - ((i7 | 91) & (~i8));
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 13 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 35;
            int i4 = -(-((i2 ^ 35) | i3));
            int i5 = (i3 & i4) + (i3 | i4);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = ((i2 ^ 124) + ((i2 & 124) << 1)) - 1;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return 1;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i, AbstractC0242a abstractC0242a, Locale locale) throws IOException {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 119;
            int i5 = (i3 | 119) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            appendable.append(this.c);
            if (i8 != 0) {
                int i9 = 99 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        
            if (java.lang.Character.toLowerCase(r6) != java.lang.Character.toLowerCase(r0)) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
        
            if (java.lang.Character.toLowerCase(r6) != java.lang.Character.toLowerCase(r0)) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        
            r6 = ivas.gov.bisp.enumeration.cJ.h.bDQ.b;
            r0 = ((r6 & 32) + (r6 | 32)) - 1;
            ivas.gov.bisp.enumeration.cJ.h.bDQ.a = r0 % 128;
            r0 = r0 % 2;
            r7 = ~r7;
            r6 = r6 + 91;
            ivas.gov.bisp.enumeration.cJ.h.bDQ.a = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            return r7;
         */
        @Override // ivas.gov.bisp.enumeration.cJ.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int j(ivas.gov.bisp.enumeration.cJ.e r5, java.lang.CharSequence r6, int r7) {
            /*
                r4 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = ivas.gov.bisp.enumeration.cJ.h.bDQ.b
                r1 = r0 & 103(0x67, float:1.44E-43)
                r0 = r0 ^ 103(0x67, float:1.44E-43)
                r0 = r0 | r1
                int r1 = r1 + r0
                int r0 = r1 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDQ.a = r0
                int r1 = r1 % r5
                int r0 = r6.length()
                if (r7 < r0) goto L33
                int r6 = ivas.gov.bisp.enumeration.cJ.h.bDQ.a
                r0 = r6 & 59
                r6 = r6 ^ 59
                r6 = r6 | r0
                int r0 = r0 + r6
                int r6 = r0 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDQ.b = r6
                int r0 = r0 % r5
                int r7 = ~r7
                r0 = r6 & 77
                r6 = r6 | 77
                int r0 = r0 + r6
                int r6 = r0 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDQ.a = r6
                int r0 = r0 % r5
                if (r0 != 0) goto L31
                return r7
            L31:
                r5 = 0
                throw r5
            L33:
                char r6 = r6.charAt(r7)
                char r0 = r4.c
                if (r6 == r0) goto L9a
                int r1 = ivas.gov.bisp.enumeration.cJ.h.bDQ.b
                r2 = r1 ^ 89
                r1 = r1 & 89
                int r1 = r1 << 1
                int r2 = r2 + r1
                int r1 = r2 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDQ.a = r1
                int r2 = r2 % r5
                char r6 = java.lang.Character.toUpperCase(r6)
                char r0 = java.lang.Character.toUpperCase(r0)
                if (r6 == r0) goto L9a
                int r1 = ivas.gov.bisp.enumeration.cJ.h.bDQ.a
                r2 = r1 & 41
                int r3 = ~r2
                r1 = r1 | 41
                r1 = r1 & r3
                int r2 = r2 << 1
                r3 = r1 | r2
                int r3 = r3 << 1
                r1 = r1 ^ r2
                int r3 = r3 - r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDQ.b = r1
                int r3 = r3 % r5
                if (r3 != 0) goto L79
                char r6 = java.lang.Character.toLowerCase(r6)
                char r0 = java.lang.Character.toLowerCase(r0)
                r1 = 18
                int r1 = r1 / 0
                if (r6 == r0) goto L9a
                goto L83
            L79:
                char r6 = java.lang.Character.toLowerCase(r6)
                char r0 = java.lang.Character.toLowerCase(r0)
                if (r6 == r0) goto L9a
            L83:
                int r6 = ivas.gov.bisp.enumeration.cJ.h.bDQ.b
                r0 = r6 & 32
                r1 = r6 | 32
                int r0 = r0 + r1
                int r0 = r0 + (-1)
                int r1 = r0 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDQ.a = r1
                int r0 = r0 % r5
                int r7 = ~r7
                int r6 = r6 + 91
                int r0 = r6 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDQ.a = r0
                int r6 = r6 % r5
                return r7
            L9a:
                r6 = r7 & 1
                r7 = r7 ^ 1
                r7 = r7 | r6
                int r7 = -r7
                int r7 = -r7
                r0 = r6 ^ r7
                r6 = r6 & r7
                int r6 = r6 << 1
                int r0 = r0 + r6
                int r6 = ivas.gov.bisp.enumeration.cJ.h.bDQ.a
                r7 = r6 & 99
                int r1 = ~r7
                r6 = r6 | 99
                r6 = r6 & r1
                int r7 = r7 << 1
                r1 = r6 & r7
                r6 = r6 | r7
                int r1 = r1 + r6
                int r6 = r1 % 128
                ivas.gov.bisp.enumeration.cJ.h.bDQ.b = r6
                int r1 = r1 % r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.h.bDQ.j(ivas.gov.bisp.enumeration.cJ.e, java.lang.CharSequence, int):int");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067 A[PHI: r5
  0x0067: PHI (r5v23 java.lang.Object) = (r5v18 java.lang.Object), (r5v28 java.lang.Object) binds: [B:19:0x006d, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006f A[DONT_INVERT, PHI: r5
  0x006f: PHI (r5v19 java.lang.Object) = (r5v18 java.lang.Object), (r5v28 java.lang.Object) binds: [B:19:0x006d, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    public final Object y() {
        Object obj;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 2) << 1) - (i2 ^ 2)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object obj3 = this.d;
        if (obj3 == null) {
            int i4 = i2 & 3;
            int i5 = -(-((i2 ^ 3) | i4));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (this.c.size() == 2) {
                int i8 = a;
                int i9 = i8 & 105;
                int i10 = (i8 ^ 105) | i9;
                int i11 = (i9 & i10) + (i10 | i9);
                b = i11 % 128;
                Object obj4 = (i11 % 2 == 0 ? this.c : this.c).get(0);
                ArrayList<Object> arrayList = this.c;
                int i12 = b;
                int i13 = (((i12 | 42) << 1) - (i12 ^ 42)) - 1;
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    obj = arrayList.get(0);
                    if (obj4 == null) {
                        obj3 = obj;
                        int i14 = a;
                        int i15 = ((i14 & (-26)) | ((~i14) & 25)) + ((i14 & 25) << 1);
                        b = i15 % 128;
                        int i16 = i15 % 2;
                    } else if (obj4 != obj) {
                        int i17 = b;
                        int i18 = (((i17 & (-106)) | ((~i17) & 105)) - (~((105 & i17) << 1))) - 1;
                        a = i18 % 128;
                        int i19 = i18 % 2;
                        if (obj == null) {
                            int i20 = a;
                            int i21 = (i20 & 81) + (i20 | 81);
                            b = i21 % 128;
                            int i22 = i21 % 2;
                            obj3 = obj4;
                        }
                    } else {
                        int i23 = a;
                        int i24 = (i23 & 81) + (i23 | 81);
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        obj3 = obj4;
                    }
                } else {
                    obj = arrayList.get(1);
                    if (obj4 == null) {
                        obj3 = obj;
                        int i110 = a;
                        int i111 = ((i110 & (-26)) | ((~i110) & 25)) + ((i110 & 25) << 1);
                        b = i111 % 128;
                        int i112 = i111 % 2;
                    } else if (obj4 != obj) {
                        int i113 = b;
                        int i114 = (((i113 & (-106)) | ((~i113) & 105)) - (~((105 & i113) << 1))) - 1;
                        a = i114 % 128;
                        int i115 = i114 % 2;
                        if (obj == null) {
                            int i26 = a;
                            int i27 = (i26 & 81) + (i26 | 81);
                            b = i27 % 128;
                            int i28 = i27 % 2;
                            obj3 = obj4;
                        }
                    } else {
                        int i29 = a;
                        int i210 = (i29 & 81) + (i29 | 81);
                        b = i210 % 128;
                        int i211 = i210 % 2;
                        obj3 = obj4;
                    }
                }
            }
            if (obj3 == null) {
                bDR bdr = new bDR(this.c);
                int i30 = b;
                int i31 = (i30 & 12) + (i30 | 12);
                int i32 = (i31 ^ (-1)) + (i31 << 1);
                a = i32 % 128;
                int i33 = i32 % 2;
                obj3 = bdr;
            }
            this.d = obj3;
            int i34 = b;
            int i35 = ((((i34 ^ 9) | (i34 & 9)) << 1) - (~(-(((~i34) & 9) | (i34 & (-10)))))) - 1;
            a = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = b;
        int i38 = (((i37 & (-20)) | ((~i37) & 19)) - (~((i37 & 19) << 1))) - 1;
        a = i38 % 128;
        if (i38 % 2 != 0) {
            int i39 = 99 / 0;
        }
        return obj3;
    }

    public h i(InterfaceC0241p interfaceC0241p, r[] rVarArr) {
        int length;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = 0;
        Object obj = null;
        if (i3 % 2 != 0 ? (length = rVarArr.length) == 1 : (length = rVarArr.length) == 0) {
            int i6 = i4 | 65;
            int i7 = i6 << 1;
            int i8 = -(i6 & (~(i4 & 65)));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0 ? rVarArr[0] == null : rVarArr[1] == null) {
                throw new IllegalArgumentException("No parser supplied");
            }
            j(null, i.c(rVarArr[0]));
            int i10 = b + 49;
            a = i10 % 128;
            int i11 = i10 % 2;
            return this;
        }
        t[] tVarArr = new t[length];
        int i12 = i2 & 19;
        int i13 = ((((i2 ^ 19) | i12) << 1) - (~(-((i2 | 19) & (~i12))))) - 1;
        b = i13 % 128;
        while (true) {
            int i14 = i13 % 2;
            if (i5 >= ((length ^ (-1)) | length) + length) {
                tVarArr[i5] = i.c(rVarArr[i5]);
                bDW bdw = new bDW(tVarArr);
                int i15 = a;
                int i16 = i15 & 105;
                int i17 = (((i15 ^ 105) | i16) << 1) - ((i15 | 105) & (~i16));
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    j(null, bdw);
                    obj.hashCode();
                    throw null;
                }
                j(null, bdw);
                int i18 = a;
                int i19 = (i18 & (-98)) | ((~i18) & 97);
                int i20 = -(-((i18 & 97) << 1));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            }
            int i22 = b + 50;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            t tVarC = i.c(rVarArr[i5]);
            tVarArr[i5] = tVarC;
            if (tVarC == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            int i25 = a;
            int i26 = ((i25 ^ 119) | (i25 & 119)) << 1;
            int i27 = -(((~i25) & 119) | (i25 & (-120)));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            int i29 = i28 % 128;
            b = i29;
            i5 = i28 % 2 == 0 ? i5 + 104 : (i5 ^ 1) + ((i5 & 1) << 1);
            i13 = (((i29 & (-46)) | ((~i29) & 45)) - (~(-(-((i29 & 45) << 1))))) - 1;
            a = i13 % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0089  */
    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r2
  0x0024: PHI (r2v4 int) = (r2v3 int), (r2v16 int) binds: [B:8:0x0022, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public h o(String str) {
        int length;
        Object obj;
        bDQ bdq;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 15;
        int i5 = i4 + ((i3 ^ 15) | i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            length = str.length();
            int i6 = 51 / 0;
            if (length != 0) {
                obj = null;
                if (length != 1) {
                    bDX bdx = new bDX(str);
                    this.d = null;
                    ArrayList<Object> arrayList = this.c;
                    int i7 = b;
                    int i8 = ((i7 ^ 106) + ((i7 & 106) << 1)) - 1;
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList.add(bdx);
                    this.c.add(bdx);
                    int i10 = a;
                    int i11 = i10 & 67;
                    int i12 = -(-(i10 | 67));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    return this;
                }
                bdq = new bDQ(str.charAt(0));
                int i15 = a;
                int i16 = ((i15 & (-80)) | ((~i15) & 79)) + ((i15 & 79) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                this.d = null;
                this.c.add(bdq);
                int i18 = b;
                i = (i18 & 45) + (i18 | 45);
                a = i % 128;
                if (i % 2 == 0) {
                    this.c.add(bdq);
                    obj.hashCode();
                    throw null;
                }
                this.c.add(bdq);
            }
        } else {
            length = str.length();
            if (length != 0) {
                obj = null;
                if (length != 1) {
                    bDX bdx2 = new bDX(str);
                    this.d = null;
                    ArrayList<Object> arrayList2 = this.c;
                    int i19 = b;
                    int i20 = ((i19 ^ 106) + ((i19 & 106) << 1)) - 1;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    arrayList2.add(bdx2);
                    this.c.add(bdx2);
                    int i110 = a;
                    int i111 = i110 & 67;
                    int i112 = -(-(i110 | 67));
                    int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                    b = i113 % 128;
                    int i114 = i113 % 2;
                    return this;
                }
                bdq = new bDQ(str.charAt(0));
                int i115 = a;
                int i116 = ((i115 & (-80)) | ((~i115) & 79)) + ((i115 & 79) << 1);
                b = i116 % 128;
                int i117 = i116 % 2;
                this.d = null;
                this.c.add(bdq);
                int i118 = b;
                i = (i118 & 45) + (i118 | 45);
                a = i % 128;
                if (i % 2 == 0) {
                    this.c.add(bdq);
                    obj.hashCode();
                    throw null;
                }
                this.c.add(bdq);
            }
        }
        int i22 = a;
        int i23 = i22 & 15;
        int i24 = ((i22 | 15) & (~i23)) + (i23 << 1);
        b = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 51 / 0;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public h s(AbstractC0246t abstractC0246t, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 83;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            int i6 = 98 / 0;
            if (i2 < i) {
                int i7 = i5 ^ 123;
                int i8 = ((i5 & 123) | i7) << 1;
                int i9 = -i7;
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                i2 = i;
            }
        } else if (i2 < i) {
            int i12 = i5 ^ 123;
            int i13 = ((i5 & 123) | i12) << 1;
            int i14 = -i12;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            int i16 = i15 % 2;
            i2 = i;
        }
        if (i >= 0) {
            int i17 = (((i5 | 12) << 1) - (i5 ^ 12)) - 1;
            a = i17 % 128;
            Object obj = null;
            if (i17 % 2 != 0) {
                throw null;
            }
            if (i2 > 0) {
                if (i > 1) {
                    bDT bdt = new bDT(abstractC0246t, i2, true, i);
                    int i18 = a + 5;
                    b = i18 % 128;
                    if (i18 % 2 == 0) {
                        this.d = null;
                        this.c.add(bdt);
                        int i19 = 92 / 0;
                    } else {
                        this.d = null;
                        this.c.add(bdt);
                    }
                    int i20 = a + 35;
                    b = i20 % 128;
                    if (i20 % 2 == 0) {
                        this.c.add(bdt);
                        int i21 = 33 / 0;
                    } else {
                        this.c.add(bdt);
                    }
                    return this;
                }
                bEd bed = new bEd(abstractC0246t, i2, true);
                int i22 = a;
                int i23 = (-2) - ((((i22 | 98) << 1) - (i22 ^ 98)) ^ (-1));
                int i24 = i23 % 128;
                b = i24;
                if (i23 % 2 == 0) {
                    this.d = null;
                    obj.hashCode();
                    throw null;
                }
                this.d = null;
                ArrayList<Object> arrayList = this.c;
                int i25 = i24 ^ 5;
                int i26 = -(-((i24 & 5) << 1));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                a = i27 % 128;
                if (i27 % 2 != 0) {
                    arrayList.add(bed);
                    this.c.add(bed);
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(bed);
                this.c.add(bed);
                int i28 = b;
                int i29 = (i28 & 125) + (i28 | 125);
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    return this;
                }
                throw null;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0036  */
    public c x() {
        boolean z;
        l lVar;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 110) + ((i2 & 110) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object objY = y();
        boolean z2 = objY instanceof l;
        int i5 = b;
        int i6 = i5 & 59;
        int i7 = ((i5 ^ 59) | i6) << 1;
        int i8 = -((~i6) & (i5 | 59));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        t tVar = null;
        if (i9 % 2 != 0) {
            tVar.hashCode();
            throw null;
        }
        if (!z2) {
            z = false;
        } else {
            if (!(!(objY instanceof bDR))) {
                int i10 = (-2) - ((i5 + 92) ^ (-1));
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    if (((bDR) objY).c != null) {
                    }
                } else if (((bDR) objY).c == null) {
                    z = false;
                }
                int i11 = a;
                int i12 = (i11 & 91) + (i11 | 91);
                b = i12 % 128;
                int i13 = i12 % 2;
            } else {
                int i14 = a;
                int i15 = (i14 & 91) + (i14 | 91);
                b = i15 % 128;
                int i16 = i15 % 2;
            }
            z = true;
        }
        if (z) {
            int i17 = a;
            int i18 = (i17 & (-8)) | ((~i17) & 7);
            int i19 = -(-((i17 & 7) << 1));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            int i21 = i20 % 128;
            b = i21;
            int i22 = i20 % 2;
            lVar = (l) objY;
            int i23 = i21 | 49;
            int i24 = (i23 << 1) - ((~(i21 & 49)) & i23);
            a = i24 % 128;
            int i25 = i24 % 2;
        } else {
            int i26 = b;
            int i27 = i26 & 7;
            int i28 = i27 + ((i26 ^ 7) | i27);
            a = i28 % 128;
            int i29 = i28 % 2;
            lVar = null;
        }
        if (z(objY)) {
            int i30 = b;
            int i31 = (i30 ^ 43) + ((i30 & 43) << 1);
            a = i31 % 128;
            if (i31 % 2 != 0) {
                tVar.hashCode();
                throw null;
            }
            tVar = (t) objY;
        }
        if (lVar == null) {
            int i32 = a;
            int i33 = ((i32 ^ 73) - (~(-(-((i32 & 73) << 1))))) - 1;
            b = i33 % 128;
            int i34 = i33 % 2;
            if (tVar == null) {
                throw new UnsupportedOperationException("Both printing and parsing not supported");
            }
        }
        c cVar = new c(lVar, tVar);
        int i35 = a;
        int i36 = ((i35 & 108) + (i35 | 108)) - 1;
        b = i36 % 128;
        if (i36 % 2 == 0) {
            int i37 = 68 / 0;
        }
        return cVar;
    }

    public static class bEa implements l, t {
        private static int a = 1;
        private static int b;
        public final Map<String, AbstractC0242a> c;
        public final int d;

        public bEa(int i, Map<String, AbstractC0242a> map) {
            this.d = i;
            this.c = map;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int d() {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 ^ 69;
            int i5 = -(-((i3 & 69) << 1));
            int i6 = (i4 & i5) + (i4 | i5);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 == 0 ? this.d != 1 : this.d != 0) {
                int i8 = i3 + 63;
                b = i8 % 128;
                int i9 = i8 % 2;
                i = 20;
            } else {
                int i10 = i7 & 75;
                int i11 = i10 + ((i7 ^ 75) | i10);
                a = i11 % 128;
                int i12 = i11 % 2;
                int i13 = i7 ^ 103;
                int i14 = -(-((i7 & 103) << 1));
                int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                a = i15 % 128;
                int i16 = i15 % 2;
                i = 4;
            }
            int i17 = a;
            int i18 = (-2) - ((((i17 | 18) << 1) - (i17 ^ 18)) ^ (-1));
            b = i18 % 128;
            int i19 = i18 % 2;
            return i;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void f(Appendable appendable, A a2, Locale locale) {
            int i = 2 % 2;
            int i2 = a + 24;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.cJ.l
        public int p() {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & (-34)) | ((~i3) & 33);
            int i5 = (i3 & 33) << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            if (this.d == 1) {
                int i9 = ((i3 | 63) << 1) - (i3 ^ 63);
                int i10 = i9 % 128;
                b = i10;
                i = i9 % 2 != 0 ? 2 : 4;
                int i11 = (i10 & 97) + (i10 | 97);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = ((i7 & 14) + (i7 | 14)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                i = 20;
            }
            int i15 = a + 5;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 42 / 0;
            }
            return i;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.t
        public int j(e eVar, CharSequence charSequence, int i) {
            String next;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 ^ 73;
            int i5 = (i3 & 73) << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            Map<String, AbstractC0242a> mapUnmodifiableMap = this.c;
            Object obj = null;
            if (mapUnmodifiableMap == null) {
                int i8 = i3 + 109;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    ivas.gov.bisp.enumeration.cP.u.c.get();
                    throw null;
                }
                AtomicReference<Map<String, AbstractC0242a>> atomicReference = ivas.gov.bisp.enumeration.cP.u.c;
                mapUnmodifiableMap = atomicReference.get();
                int i9 = b;
                int i10 = (((i9 | 84) << 1) - (i9 ^ 84)) - 1;
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                if (mapUnmodifiableMap == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    AbstractC0242a abstractC0242a = AbstractC0242a.c;
                    int i11 = a;
                    int i12 = ((i11 ^ 91) - (~((i11 & 91) << 1))) - 1;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    linkedHashMap.put("UT", abstractC0242a);
                    linkedHashMap.put("UTC", abstractC0242a);
                    int i14 = b;
                    int i15 = ((i14 ^ 65) | (i14 & 65)) << 1;
                    int i16 = -(((~i14) & 65) | (i14 & (-66)));
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    linkedHashMap.put("GMT", abstractC0242a);
                    int i19 = b + 47;
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    ivas.gov.bisp.enumeration.cP.u.e(linkedHashMap, "EST", "America/New_York");
                    ivas.gov.bisp.enumeration.cP.u.e(linkedHashMap, "EDT", "America/New_York");
                    int i21 = b;
                    int i22 = i21 & 1;
                    int i23 = (i21 ^ 1) | i22;
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    ivas.gov.bisp.enumeration.cP.u.e(linkedHashMap, "CST", "America/Chicago");
                    ivas.gov.bisp.enumeration.cP.u.e(linkedHashMap, "CDT", "America/Chicago");
                    int i26 = b;
                    int i27 = i26 & 105;
                    int i28 = i27 + ((i26 ^ 105) | i27);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    ivas.gov.bisp.enumeration.cP.u.e(linkedHashMap, "MST", "America/Denver");
                    ivas.gov.bisp.enumeration.cP.u.e(linkedHashMap, "MDT", "America/Denver");
                    int i30 = (-2) - ((a + 40) ^ (-1));
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    ivas.gov.bisp.enumeration.cP.u.e(linkedHashMap, "PST", "America/Los_Angeles");
                    ivas.gov.bisp.enumeration.cP.u.e(linkedHashMap, "PDT", "America/Los_Angeles");
                    mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                    int i32 = a + 74;
                    int i33 = (i32 ^ (-1)) + (i32 << 1);
                    b = i33 % 128;
                    if (i33 % 2 != 0) {
                        atomicReference.compareAndSet(null, mapUnmodifiableMap);
                        obj.hashCode();
                        throw null;
                    }
                    if (!atomicReference.compareAndSet(null, mapUnmodifiableMap)) {
                        mapUnmodifiableMap = atomicReference.get();
                        int i34 = a;
                        int i35 = i34 & 95;
                        int i36 = -(-((i34 ^ 95) | i35));
                        int i37 = (i35 & i36) + (i36 | i35);
                        b = i37 % 128;
                        int i38 = i37 % 2;
                    }
                }
            }
            Iterator<String> it = mapUnmodifiableMap.keySet().iterator();
            int i39 = (-2) - ((b + 44) ^ (-1));
            a = i39 % 128;
            if (i39 % 2 == 0) {
                int i40 = 3 % 3;
            }
            String str = null;
            while (!(!it.hasNext())) {
                int i41 = a;
                int i42 = i41 | 117;
                int i43 = i42 << 1;
                int i44 = -((~(i41 & 117)) & i42);
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                b = i45 % 128;
                if (i45 % 2 != 0) {
                    next = it.next();
                    int i46 = 35 / 0;
                } else {
                    next = it.next();
                }
                if (h.e(charSequence, i, next)) {
                    int i47 = a;
                    int i48 = i47 | 55;
                    int i49 = (i48 << 1) - (i48 & (~(i47 & 55)));
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    if (str != null) {
                        int i51 = ((i47 | 26) << 1) - (i47 ^ 26);
                        int i52 = (i51 ^ (-1)) + (i51 << 1);
                        b = i52 % 128;
                        int i53 = i52 % 2;
                        if (next.length() > str.length()) {
                        }
                    }
                    int i54 = b + 97;
                    a = i54 % 128;
                    int i55 = i54 % 2;
                    str = next;
                }
            }
            if (str == null) {
                int i56 = (~i) & ((~i) | i);
                int i57 = b;
                int i58 = i57 & 33;
                int i59 = -(-((i57 ^ 33) | i58));
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                a = i60 % 128;
                if (i60 % 2 == 0) {
                    int i61 = 27 / 0;
                }
                return i56;
            }
            int i62 = a;
            int i63 = i62 & 61;
            int i64 = -(-((i62 ^ 61) | i63));
            int i65 = (i63 & i64) + (i64 | i63);
            b = i65 % 128;
            int i66 = i65 % 2;
            AbstractC0242a abstractC0242a2 = mapUnmodifiableMap.get(str);
            int i67 = a;
            int i68 = i67 & 85;
            int i69 = -(-((i67 ^ 85) | i68));
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            b = i70 % 128;
            if (i70 % 2 != 0) {
                eVar.m = null;
                eVar.i = abstractC0242a2;
                str.length();
                obj.hashCode();
                throw null;
            }
            eVar.m = null;
            eVar.i = abstractC0242a2;
            int length = str.length();
            int i71 = -(-i);
            int i72 = length ^ i71;
            int i73 = (length & i71) << 1;
            int i74 = (i72 & i73) + (i73 | i72);
            int i75 = a + 91;
            b = i75 % 128;
            if (i75 % 2 != 0) {
                int i76 = 48 / 0;
            }
            return i74;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:35:0x0114  */
        @Override // ivas.gov.bisp.enumeration.cJ.l
        public void q(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar, int i, AbstractC0242a abstractC0242a, Locale locale) throws IOException {
            String strH;
            Locale locale2;
            String strE;
            Locale locale3;
            String strB;
            boolean z;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = ((i4 & (-24)) | ((~i4) & 23)) + ((i4 & 23) << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            long j2 = j - ((long) i);
            if (abstractC0242a != null) {
                int i8 = i6 & 11;
                int i9 = (((i6 ^ 11) | i8) << 1) - ((~i8) & (i6 | 11));
                int i10 = i9 % 128;
                a = i10;
                int i11 = i9 % 2;
                int i12 = this.d;
                boolean z2 = false;
                if (i12 != 0) {
                    int i13 = (((i10 | 96) << 1) - (i10 ^ 96)) - 1;
                    int i14 = i13 % 128;
                    b = i14;
                    if (i13 % 2 == 0 ? i12 == 1 : i12 == 0) {
                        int i15 = i14 & 83;
                        int i16 = (i14 | 83) & (~i15);
                        int i17 = -(-(i15 << 1));
                        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                        a = i18 % 128;
                        if (i18 % 2 == 0) {
                            throw null;
                        }
                        if (locale == null) {
                            locale3 = Locale.getDefault();
                            int i19 = b;
                            int i20 = (i19 & 47) + (i19 | 47);
                            a = i20 % 128;
                            int i21 = i20 % 2;
                        } else {
                            locale3 = locale;
                        }
                        String strM = abstractC0242a.m(j2);
                        if (strM == null) {
                            int i22 = b;
                            int i23 = i22 ^ 89;
                            int i24 = (((i22 & 89) | i23) << 1) - i23;
                            a = i24 % 128;
                            if (i24 % 2 == 0) {
                                String str = abstractC0242a.g;
                                throw null;
                            }
                            strH = abstractC0242a.g;
                            int i25 = b;
                            int i26 = i25 & 65;
                            int i27 = i26 + ((i25 ^ 65) | i26);
                            a = i27 % 128;
                            int i28 = i27 % 2;
                        } else {
                            ivas.gov.bisp.enumeration.cU.e eVarC = AbstractC0242a.c();
                            if (eVarC instanceof ivas.gov.bisp.enumeration.cU.h) {
                                int i29 = b;
                                int i30 = i29 & 29;
                                int i31 = i30 + ((i29 ^ 29) | i30);
                                a = i31 % 128;
                                int i32 = i31 % 2;
                                ivas.gov.bisp.enumeration.cU.h hVar2 = (ivas.gov.bisp.enumeration.cU.h) eVarC;
                                String str2 = abstractC0242a.g;
                                int i33 = a;
                                int i34 = ((~i33) & 105) | (i33 & (-106));
                                int i35 = (i33 & 105) << 1;
                                int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                                b = i36 % 128;
                                if (i36 % 2 != 0) {
                                    int i37 = 82 / 0;
                                    if (abstractC0242a.n(j2) == abstractC0242a.p(j2)) {
                                        int i38 = a;
                                        int i39 = i38 & 1;
                                        int i40 = i38 | 1;
                                        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                                        b = i41 % 128;
                                        int i42 = i41 % 2;
                                        z = true;
                                    } else {
                                        int i43 = b;
                                        int i44 = ((i43 ^ 43) | (i43 & 43)) << 1;
                                        int i45 = -((43 & (~i43)) | (i43 & (-44)));
                                        i2 = (i44 & i45) + (i45 | i44);
                                        a = i2 % 128;
                                        if (i2 % 2 == 0) {
                                            int i46 = 4 % 4;
                                        }
                                        z = false;
                                    }
                                } else if (abstractC0242a.n(j2) == abstractC0242a.p(j2)) {
                                    int i310 = a;
                                    int i311 = i310 & 1;
                                    int i47 = i310 | 1;
                                    int i48 = (i311 ^ i47) + ((i47 & i311) << 1);
                                    b = i48 % 128;
                                    int i49 = i48 % 2;
                                    z = true;
                                } else {
                                    int i410 = b;
                                    int i411 = ((i410 ^ 43) | (i410 & 43)) << 1;
                                    int i412 = -((43 & (~i410)) | (i410 & (-44)));
                                    i2 = (i411 & i412) + (i412 | i411);
                                    a = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        int i413 = 4 % 4;
                                    }
                                    z = false;
                                }
                                String[] strArrH = hVar2.h(locale3, str2, strM, z);
                                int i50 = a;
                                int i51 = i50 + 49;
                                int i52 = i51 % 128;
                                b = i52;
                                if (i51 % 2 != 0) {
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (strArrH == null) {
                                    int i53 = ((i50 | 75) << 1) - (i50 ^ 75);
                                    b = i53 % 128;
                                    if (i53 % 2 != 0) {
                                        int i54 = 4 / 4;
                                    }
                                    strB = null;
                                } else {
                                    String str3 = strArrH[0];
                                    int i55 = ((i52 | 5) << 1) - (i52 ^ 5);
                                    a = i55 % 128;
                                    if (i55 % 2 == 0) {
                                        int i56 = 3 / 3;
                                    }
                                    strB = str3;
                                }
                            } else {
                                String str4 = abstractC0242a.g;
                                int i57 = a;
                                int i58 = i57 & 11;
                                int i59 = (i58 - (~((i57 ^ 11) | i58))) - 1;
                                b = i59 % 128;
                                if (i59 % 2 != 0) {
                                    eVarC.b(locale3, str4, strM);
                                    throw null;
                                }
                                strB = eVarC.b(locale3, str4, strM);
                                int i60 = a;
                                int i61 = i60 & 61;
                                int i62 = -(-((i60 ^ 61) | i61));
                                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                                b = i63 % 128;
                                if (i63 % 2 != 0) {
                                    int i64 = 2 % 4;
                                }
                            }
                            if (strB != null) {
                                strH = strB;
                                int i65 = a + 103;
                                b = i65 % 128;
                                int i66 = i65 % 2;
                            } else {
                                strH = AbstractC0242a.h(abstractC0242a.n(j2));
                                int i67 = b + 101;
                                a = i67 % 128;
                                int i68 = i67 % 2;
                            }
                        }
                    }
                } else {
                    if (locale == null) {
                        int i69 = i6 ^ 21;
                        int i70 = -(-((i6 & 21) << 1));
                        int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                        a = i71 % 128;
                        if (i71 % 2 == 0) {
                            locale2 = Locale.getDefault();
                            int i72 = 51 / 0;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        int i73 = a;
                        int i74 = (i73 & 31) + (i73 | 31);
                        b = i74 % 128;
                        int i75 = i74 % 2;
                    } else {
                        locale2 = locale;
                    }
                    String strM2 = abstractC0242a.m(j2);
                    if (strM2 == null) {
                        int i76 = b + 87;
                        a = i76 % 128;
                        if (i76 % 2 == 0) {
                            String str5 = abstractC0242a.g;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        strH = abstractC0242a.g;
                        int i77 = b;
                        int i78 = i77 & 123;
                        int i79 = i77 | 123;
                        int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                        a = i80 % 128;
                        int i81 = i80 % 2;
                    } else {
                        ivas.gov.bisp.enumeration.cU.e eVarC2 = AbstractC0242a.c();
                        if (!(eVarC2 instanceof ivas.gov.bisp.enumeration.cU.h)) {
                            strE = eVarC2.e(locale2, abstractC0242a.g, strM2);
                            int i82 = b;
                            int i83 = ((i82 & 82) + (i82 | 82)) - 1;
                            a = i83 % 128;
                            if (i83 % 2 == 0) {
                                throw null;
                            }
                            int i84 = i82 & 121;
                            int i85 = ((i82 ^ 121) | i84) << 1;
                            int i86 = -((i82 | 121) & (~i84));
                            int i87 = (i85 & i86) + (i86 | i85);
                            a = i87 % 128;
                            if (i87 % 2 == 0) {
                                int i88 = 5 / 5;
                            }
                        } else {
                            int i89 = b;
                            int i90 = i89 & 87;
                            int i91 = -(-(i89 | 87));
                            int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
                            a = i92 % 128;
                            ivas.gov.bisp.enumeration.cU.h hVar3 = (ivas.gov.bisp.enumeration.cU.h) eVarC2;
                            if (i92 % 2 == 0) {
                                String str6 = abstractC0242a.g;
                                throw null;
                            }
                            String str7 = abstractC0242a.g;
                            if (abstractC0242a.n(j2) == abstractC0242a.p(j2)) {
                                int i93 = b;
                                int i94 = i93 & 49;
                                int i95 = ((i93 ^ 49) | i94) << 1;
                                int i96 = -((i93 | 49) & (~i94));
                                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                                a = i97 % 128;
                                int i98 = i97 % 2;
                                z2 = true;
                            }
                            String[] strArrH2 = hVar3.h(locale2, str7, strM2, z2);
                            if (strArrH2 == null) {
                                int i99 = b + 58;
                                int i100 = (i99 ^ (-1)) + (i99 << 1);
                                int i101 = i100 % 128;
                                a = i101;
                                int i102 = i100 % 2;
                                int i103 = ((i101 ^ 84) + ((i101 & 84) << 1)) - 1;
                                b = i103 % 128;
                                int i104 = i103 % 2;
                                strE = null;
                            } else {
                                strE = strArrH2[1];
                                int i105 = a;
                                int i106 = i105 & 87;
                                int i107 = i106 + ((i105 ^ 87) | i106);
                                b = i107 % 128;
                                int i108 = i107 % 2;
                            }
                        }
                        if (strE == null) {
                            int i109 = a;
                            int i110 = i109 ^ 93;
                            int i111 = ((i109 & 93) | i110) << 1;
                            int i112 = -i110;
                            int i113 = (i111 ^ i112) + ((i111 & i112) << 1);
                            b = i113 % 128;
                            if (i113 % 2 != 0) {
                                AbstractC0242a.h(abstractC0242a.n(j2));
                                throw null;
                            }
                            strH = AbstractC0242a.h(abstractC0242a.n(j2));
                        } else {
                            strH = strE;
                            int i610 = a + 103;
                            b = i610 % 128;
                            int i611 = i610 % 2;
                        }
                    }
                }
                appendable.append(strH);
                int i114 = b;
                int i115 = (((i114 | 116) << 1) - (i114 ^ 116)) - 1;
                a = i115 % 128;
                int i116 = i115 % 2;
            }
            strH = BuildConfig.FLAVOR;
            appendable.append(strH);
            int i117 = b;
            int i118 = (((i117 | 116) << 1) - (i117 ^ 116)) - 1;
            a = i118 % 128;
            int i119 = i118 % 2;
        }
    }
}
