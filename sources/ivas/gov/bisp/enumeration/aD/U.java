package ivas.gov.bisp.enumeration.aD;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class U {
    private static int a = 0;
    private static int b = 1;

    public static final String b(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i2 = b;
        int i3 = (i2 & (-126)) | ((~i2) & 125);
        int i4 = (i2 & 125) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < str.length()) {
            int i8 = a;
            int i9 = ((i8 | 21) << 1) - (i8 ^ 21);
            b = i9 % 128;
            int i10 = i9 % 2;
            char cCharAt = str.charAt(i7);
            if (!(!Character.isUpperCase(cCharAt))) {
                int i11 = b;
                int i12 = i11 & 111;
                int i13 = (i11 ^ 111) | i12;
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                int i15 = i14 % 2;
                sb.append("_");
                int i16 = b;
                int i17 = i16 | 113;
                int i18 = (i17 << 1) - ((~(i16 & 113)) & i17);
                a = i18 % 128;
                int i19 = i18 % 2;
            }
            sb.append(Character.toLowerCase(cCharAt));
            int i20 = (i7 & (-2)) | ((~i7) & 1);
            int i21 = (i7 & 1) << 1;
            i7 = ((i21 & i20) << 1) + (i20 ^ i21);
            int i22 = a;
            int i23 = ((i22 & (-72)) | ((~i22) & 71)) + ((i22 & 71) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        String string = sb.toString();
        int i25 = b;
        int i26 = (i25 ^ 111) + ((i25 & 111) << 1);
        a = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 24 / 0;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0427  */
    /* JADX WARN: Code duplicated, block: B:104:0x042d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x042f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0433  */
    /* JADX WARN: Code duplicated, block: B:108:0x044f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0453  */
    /* JADX WARN: Code duplicated, block: B:112:0x0466  */
    /* JADX WARN: Code duplicated, block: B:117:0x047b  */
    /* JADX WARN: Code duplicated, block: B:119:0x047f  */
    /* JADX WARN: Code duplicated, block: B:122:0x048d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0492  */
    /* JADX WARN: Code duplicated, block: B:126:0x0496  */
    /* JADX WARN: Code duplicated, block: B:127:0x049d  */
    /* JADX WARN: Code duplicated, block: B:129:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:134:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:137:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:139:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:146:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:148:0x050b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0529  */
    /* JADX WARN: Code duplicated, block: B:153:0x053a  */
    /* JADX WARN: Code duplicated, block: B:154:0x053d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0557  */
    /* JADX WARN: Code duplicated, block: B:158:0x055c  */
    /* JADX WARN: Code duplicated, block: B:161:0x057b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x059d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x059d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x059d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x059d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00cc A[PHI: r7
  0x00cc: PHI (r7v115 java.lang.String) = (r7v10 java.lang.String), (r7v117 java.lang.String) binds: [B:24:0x00ca, B:21:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ce A[PHI: r7
  0x00ce: PHI (r7v11 java.lang.String) = (r7v10 java.lang.String), (r7v117 java.lang.String) binds: [B:24:0x00ca, B:21:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01d0 A[PHI: r15
  0x01d0: PHI (r15v42 int A[IMMUTABLE_TYPE]) = (r15v41 int), (r15v43 int) binds: [B:47:0x01ce, B:44:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x0320  */
    /* JADX WARN: Code duplicated, block: B:81:0x033d  */
    /* JADX WARN: Code duplicated, block: B:83:0x034c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0352  */
    /* JADX WARN: Code duplicated, block: B:87:0x0379  */
    /* JADX WARN: Code duplicated, block: B:89:0x0396  */
    /* JADX WARN: Code duplicated, block: B:90:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:93:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x040a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0412  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x046d, code lost:
    
        if (((java.lang.Integer) r9).intValue() == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0489, code lost:
    
        if (((java.lang.Float) r9).floatValue() == 0.0f) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04cb, code lost:
    
        if (r9 == ((ivas.gov.bisp.enumeration.aD.aa) r9).a()) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04ed, code lost:
    
        if (((java.lang.Enum) r9).ordinal() == 0) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v120 */
    /* JADX WARN: Type inference failed for: r7v121 */
    /* JADX WARN: Type inference failed for: r7v122 */
    /* JADX WARN: Type inference failed for: r7v82 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(ivas.gov.bisp.enumeration.aD.aa r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instruction units count: 1704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.U.d(ivas.gov.bisp.enumeration.aD.aa, java.lang.StringBuilder, int):void");
    }

    public static final void c(StringBuilder sb, int i, String str, Object obj) {
        Map.Entry entry;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 87;
        int i6 = (i4 ^ 87) | i5;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        Object obj2 = null;
        if (obj instanceof List) {
            int i9 = i4 & 25;
            int i10 = i4 | 25;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                ((List) obj).iterator();
                throw null;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                int i12 = a;
                int i13 = i12 & 121;
                int i14 = (i12 | 121) & (~i13);
                int i15 = i13 << 1;
                int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                b = i16 % 128;
                int i17 = i16 % 2;
                c(sb, i, str, it.next());
                int i18 = b;
                int i19 = ((i18 & 38) + (i18 | 38)) - 1;
                a = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = a;
            int i22 = i21 | 81;
            int i23 = i22 << 1;
            int i24 = -((~(i21 & 81)) & i22);
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
        int i26 = 0;
        if (!(!(obj instanceof Map))) {
            int i27 = i4 + 75;
            a = i27 % 128;
            if (i27 % 2 != 0) {
                ((Map) obj).entrySet().iterator();
                obj2.hashCode();
                throw null;
            }
            Iterator it2 = ((Map) obj).entrySet().iterator();
            int i28 = b + 34;
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
            while (it2.hasNext()) {
                int i31 = b;
                int i32 = (((i31 & (-12)) | ((~i31) & 11)) - (~((i31 & 11) << 1))) - 1;
                a = i32 % 128;
                if (i32 % 2 != 0) {
                    throw null;
                }
                Map.Entry entry2 = (Map.Entry) it2.next();
                int i33 = b;
                int i34 = ((i33 & (-68)) | ((~i33) & 67)) + ((i33 & 67) << 1);
                a = i34 % 128;
                if (i34 % 2 != 0) {
                    c(sb, i, str, entry2);
                    int i35 = 36 / 0;
                } else {
                    c(sb, i, str, entry2);
                }
            }
            int i36 = a;
            int i37 = (i36 & (-56)) | ((~i36) & 55);
            int i38 = -(-((i36 & 55) << 1));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            b = i39 % 128;
            int i40 = i39 % 2;
            return;
        }
        sb.append('\n');
        int i41 = b;
        int i42 = i41 & 55;
        int i43 = ((i41 | 55) & (~i42)) + (i42 << 1);
        a = i43 % 128;
        int i44 = i43 % 2;
        int i45 = 0;
        while (i45 < i) {
            int i46 = b;
            int i47 = (i46 & 47) + (i46 | 47);
            a = i47 % 128;
            int i48 = i47 % 2;
            sb.append(' ');
            i45 = ((i45 | 1) << 1) - (i45 ^ 1);
            int i49 = b;
            int i50 = (i49 & 109) + (109 | i49);
            a = i50 % 128;
            int i51 = i50 % 2;
        }
        sb.append(str);
        if (!(!(obj instanceof String))) {
            int i52 = b;
            int i53 = ((i52 | 27) << 1) - (i52 ^ 27);
            a = i53 % 128;
            int i54 = i53 % 2;
            sb.append(": \"");
            AbstractC0069z abstractC0069z = AbstractC0069z.c;
            String strS = ivas.gov.bisp.enumeration.O.r.s(new AbstractC0069z.bjb(((String) obj).getBytes(R.c)));
            int i55 = b;
            int i56 = i55 & 113;
            int i57 = (i55 ^ 113) | i56;
            int i58 = (i56 & i57) + (i57 | i56);
            a = i58 % 128;
            if (i58 % 2 != 0) {
                sb.append(strS);
                sb.append('m');
            } else {
                sb.append(strS);
                sb.append('\"');
            }
            int i59 = b;
            int i60 = i59 & 103;
            int i61 = (i60 - (~((i59 ^ 103) | i60))) - 1;
            a = i61 % 128;
            if (i61 % 2 != 0) {
                int i62 = 83 / 0;
                return;
            }
            return;
        }
        if (!(!(obj instanceof AbstractC0069z))) {
            int i63 = a;
            int i64 = i63 ^ 67;
            int i65 = (((i63 & 67) | i64) << 1) - i64;
            b = i65 % 128;
            int i66 = i65 % 2;
            sb.append(": \"");
            String strS2 = ivas.gov.bisp.enumeration.O.r.s((AbstractC0069z) obj);
            int i67 = a + 123;
            b = i67 % 128;
            int i68 = i67 % 2;
            sb.append(strS2);
            sb.append('\"');
            int i69 = b;
            int i70 = i69 | 107;
            int i71 = (i70 << 1) - ((~(i69 & 107)) & i70);
            a = i71 % 128;
            if (i71 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!(obj instanceof S)) {
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                String string = obj.toString();
                int i72 = b;
                int i73 = i72 & 81;
                int i74 = ((i72 | 81) & (~i73)) + (i73 << 1);
                a = i74 % 128;
                if (i74 % 2 != 0) {
                    sb.append(string);
                    int i75 = 14 / 0;
                } else {
                    sb.append(string);
                }
                int i76 = b + 43;
                a = i76 % 128;
                int i77 = i76 % 2;
                return;
            }
            int i78 = a;
            int i79 = ((i78 ^ 77) - (~(-(-((i78 & 77) << 1))))) - 1;
            b = i79 % 128;
            if (i79 % 2 == 0) {
                sb.append(" {");
                entry = (Map.Entry) obj;
                i2 = i / 2;
            } else {
                sb.append(" {");
                entry = (Map.Entry) obj;
                int i80 = i & 2;
                i2 = (i80 << 1) + ((~i80) & (i | 2));
            }
            int i81 = a;
            int i82 = (i81 ^ 15) + ((i81 & 15) << 1);
            b = i82 % 128;
            if (i82 % 2 == 0) {
                c(sb, i2, "key", entry.getKey());
                throw null;
            }
            c(sb, i2, "key", entry.getKey());
            c(sb, i2, "value", entry.getValue());
            sb.append("\n");
            int i83 = b;
            int i84 = i83 ^ 13;
            int i85 = (((i83 & 13) | i84) << 1) - i84;
            int i86 = i85 % 128;
            a = i86;
            int i87 = i85 % 2;
            int i88 = i86 & 89;
            int i89 = -(-(i86 | 89));
            int i90 = (i88 ^ i89) + ((i88 & i89) << 1);
            b = i90 % 128;
            if (i90 % 2 == 0) {
                int i91 = 4 / 5;
            }
            while (i26 < i) {
                int i92 = b;
                int i93 = (-2) - (((i92 ^ 112) + ((i92 & 112) << 1)) ^ (-1));
                a = i93 % 128;
                int i94 = i93 % 2;
                sb.append(' ');
                int i95 = i26 & 1;
                i26 = ((~i95) & (i26 | 1)) + (i95 << 1);
                int i96 = a;
                int i97 = ((i96 | 23) << 1) - (i96 ^ 23);
                b = i97 % 128;
                int i98 = i97 % 2;
            }
            sb.append("}");
            int i99 = a;
            int i100 = (i99 ^ 71) + ((i99 & 71) << 1);
            b = i100 % 128;
            int i101 = i100 % 2;
            return;
        }
        int i102 = b;
        int i103 = i102 ^ 107;
        int i104 = ((((i102 & 107) | i103) << 1) - (~(-i103))) - 1;
        a = i104 % 128;
        if (i104 % 2 != 0) {
            sb.append(" {");
            obj2.hashCode();
            throw null;
        }
        sb.append(" {");
        d((S) obj, sb, (((i & (-3)) | ((~i) & 2)) - (~((i & 2) << 1))) - 1);
        sb.append("\n");
        int i105 = b + 106;
        int i106 = (i105 ^ (-1)) + (i105 << 1);
        int i107 = i106 % 128;
        a = i107;
        int i108 = i106 % 2;
        int i109 = i107 & 113;
        int i110 = (i107 | 113) & (~i109);
        int i111 = i109 << 1;
        int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
        b = i112 % 128;
        while (true) {
            int i113 = i112 % 2;
            if (i26 >= i) {
                sb.append("}");
                int i114 = a;
                int i115 = (((i114 | 119) << 1) - (~(-(i114 ^ 119)))) - 1;
                b = i115 % 128;
                int i116 = i115 % 2;
                return;
            }
            int i117 = b + 93;
            a = i117 % 128;
            int i118 = i117 % 2;
            sb.append(' ');
            i26 = (i26 ^ 1) + ((i26 & 1) << 1);
            int i119 = b;
            int i120 = i119 & 59;
            int i121 = -(-((i119 ^ 59) | i120));
            i112 = ((i120 | i121) << 1) - (i121 ^ i120);
            a = i112 % 128;
        }
    }
}
