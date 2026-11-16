package ivas.gov.bisp.enumeration.p009ai;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private static int a = 1;
    private static int b;
    public static final Comparator<byte[]> c = new aVK();

    static {
        int i = b;
        int i2 = i & 121;
        int i3 = (((i ^ 121) | i2) << 1) - ((i | 121) & (~i2));
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    public class aVK implements Comparator<byte[]> {
        private static int a = 1;
        private static int b;

        /* JADX WARN: Code duplicated, block: B:20:0x00ec  */
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int length;
            int length2;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = ((i4 ^ 110) + ((i4 & 110) << 1)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                int i7 = (((i4 & (-12)) | ((~i4) & 11)) - (~((i4 & 11) << 1))) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 0;
                while (true) {
                    if (i9 >= bArr3.length) {
                        i = 0;
                        break;
                    }
                    int i10 = a;
                    int i11 = ((i10 ^ 101) | (i10 & 101)) << 1;
                    int i12 = -((i10 & (-102)) | ((~i10) & 101));
                    int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        byte b2 = bArr3[i9];
                        byte b3 = bArr4[i9];
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    byte b4 = bArr3[i9];
                    byte b5 = bArr4[i9];
                    if (b4 != b5) {
                        int i14 = i10 & 85;
                        int i15 = -(-((i10 ^ 85) | i14));
                        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = ((i10 ^ 93) | (i10 & 93)) << 1;
                        int i19 = -((i10 & (-94)) | ((~i10) & 93));
                        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                        b = i20 % 128;
                        int i21 = i20 % 2;
                        length = b4;
                        length2 = b5;
                    } else {
                        int i22 = i9 - 123;
                        int i23 = i22 & 124;
                        i9 = ((i22 ^ 124) | i23) + i23;
                        int i24 = ((i10 | 7) << 1) - (i10 ^ 7);
                        b = i24 % 128;
                        int i25 = i24 % 2;
                    }
                }
                int i26 = b;
                i2 = ((i26 | 47) << 1) - (i26 ^ 47);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i27 = 47 / 0;
                }
                return i;
            }
            int i28 = i4 & 63;
            int i29 = i4 | 63;
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            int i31 = i30 % 128;
            a = i31;
            int i32 = i30 % 2;
            length = bArr3.length;
            length2 = bArr4.length;
            int i33 = i31 + 51;
            b = i33 % 128;
            int i34 = i33 % 2;
            int i35 = -length2;
            int i36 = length & i35;
            int i37 = (length ^ i35) | i36;
            i = (i36 ^ i37) + ((i37 & i36) << 1);
            int i38 = b;
            int i39 = i38 & 57;
            int i40 = (((i38 | 57) & (~i39)) - (~(i39 << 1))) - 1;
            a = i40 % 128;
            int i41 = i40 % 2;
            int i210 = b;
            i2 = ((i210 | 47) << 1) - (i210 ^ 47);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                int i211 = 47 / 0;
            }
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x040e, code lost:
    
        r23 = r12;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0412, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r12 = (r11 & (-78)) | ((~r11) & 77);
        r11 = (r11 & 77) << 1;
        r13 = ((r12 | r11) << 1) - (r11 ^ r12);
        ivas.gov.bisp.enumeration.p009ai.t.a = r13 % 128;
        r13 = r13 % 2;
        r11 = -1;
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x042b, code lost:
    
        if (r0 != r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x042d, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r13 = r11 & 71;
        r12 = (((r11 ^ 71) | r13) << 1) - ((r11 | 71) & (~r13));
        ivas.gov.bisp.enumeration.p009ai.t.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0440, code lost:
    
        if ((r12 % 2) == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0442, code lost:
    
        r11 = r9.getLong(r5);
        r13 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x044b, code lost:
    
        r11 = r9.getLong(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x044f, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p009ai.t.b + 72;
        r14 = (r13 ^ (-1)) + (r13 << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x045d, code lost:
    
        if ((r14 % 2) == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x045f, code lost:
    
        r11 = android.content.ContentUris.withAppendedId(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0464, code lost:
    
        android.content.ContentUris.withAppendedId(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0468, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0469, code lost:
    
        r11 = r9.getLong(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x046d, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r14 = ((r13 & (-88)) | (87 & (~r13))) + ((r13 & 87) << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0481, code lost:
    
        r11 = android.content.ContentUris.withAppendedId(r2, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0485, code lost:
    
        r12 = ivas.gov.bisp.enumeration.p009ai.t.b + 19;
        ivas.gov.bisp.enumeration.p009ai.t.a = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x048e, code lost:
    
        r22 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0491, code lost:
    
        if (r4 == (-1)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0493, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r12 = (((r11 | 94) << 1) - (r11 ^ 94)) - 1;
        ivas.gov.bisp.enumeration.p009ai.t.a = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04a2, code lost:
    
        r11 = r9.getInt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        if (r13 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04a6, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04aa, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r12 = (r11 ^ 41) + ((r11 & 41) << 1);
        ivas.gov.bisp.enumeration.p009ai.t.b = r12 % 128;
        r12 = r12 % 2;
        r11 = 400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04bb, code lost:
    
        if (r10 == (-1)) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04bd, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r12 = (r11 & 58) + (r11 | 58);
        r11 = (r12 ^ (-1)) + (r12 << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04ce, code lost:
    
        if ((r11 % 2) != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04d4, code lost:
    
        if (r9.getInt(r10) != 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04db, code lost:
    
        if (r9.getInt(r10) != 1) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04dd, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r12 = (-2) - ((((r11 | 54) << 1) - (r11 ^ 54)) ^ (-1));
        ivas.gov.bisp.enumeration.p009ai.t.a = r12 % 128;
        r12 = r12 % 2;
        r12 = ((r11 & 1) - (~(r11 | 1))) - 1;
        ivas.gov.bisp.enumeration.p009ai.t.a = r12 % 128;
        r12 = r12 % 2;
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04ff, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r12 = (r11 ^ 39) + ((r11 & 39) << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r12 % 128;
        r12 = r12 % 2;
        r25 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x050f, code lost:
    
        r11 = new ivas.gov.bisp.enumeration.p009ai.N(r22, r23, r24, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0516, code lost:
    
        r12 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r13 = (r12 & (-62)) | ((~r12) & 61);
        r12 = (r12 & 61) << 1;
        r14 = ((r13 | r12) << 1) - (r12 ^ r13);
        ivas.gov.bisp.enumeration.p009ai.t.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x052c, code lost:
    
        if ((r14 % 2) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x052e, code lost:
    
        r6.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0533, code lost:
    
        r6.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0537, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0538, code lost:
    
        r9.getColumnIndex("font_weight");
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x053f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0540, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0541, code lost:
    
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0543, code lost:
    
        if (r9 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0545, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r0 = (-2) - ((-1) ^ (((r0 | 48) << 1) - (r0 ^ 48)));
        ivas.gov.bisp.enumeration.p009ai.t.b = r0 % 128;
        r0 = r0 % 2;
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0568, code lost:
    
        return new ivas.gov.bisp.enumeration.p009ai.M(0, (ivas.gov.bisp.enumeration.p009ai.N[]) r6.toArray(new ivas.gov.bisp.enumeration.p009ai.N[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0569, code lost:
    
        r9.query(r7, r11, "query = ?", r13, null, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0572, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0576, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0577, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r13.equals(r14) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0578, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0579, code lost:
    
        if (r12 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x057b, code lost:
    
        r12.close();
        r1 = ivas.gov.bisp.enumeration.p009ai.t.b + 43;
        ivas.gov.bisp.enumeration.p009ai.t.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0588, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0589, code lost:
    
        r1 = new java.lang.StringBuilder();
        r2 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r3 = (((r2 & (-14)) | ((~r2) & 13)) - (~(-(-((r2 & 13) << 1))))) - 1;
        ivas.gov.bisp.enumeration.p009ai.t.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05a6, code lost:
    
        if ((r3 % 2) != 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x05a8, code lost:
    
        r1.append("Found content provider ");
        r1.append(r10);
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x05b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x05b3, code lost:
    
        r1.append("Found content provider ");
        r1.append(r10);
        r1.append(", but package was not ");
        r1.append(r28.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x05cc, code lost:
    
        throw new android.content.pm.PackageManager.NameNotFoundException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        r7 = r7.getPackageInfo(r11.packageName, 64).signatures;
        r10 = new java.util.ArrayList();
        r13 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r14 = (r13 & (-30)) | (29 & (~r13));
        r13 = (r13 & 29) << 1;
        r15 = ((r14 | r13) << 1) - (r13 ^ r14);
        ivas.gov.bisp.enumeration.p009ai.t.a = r15 % 128;
        r15 = r15 % 2;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (r13 >= r7.length) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        r14 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r18 = (r14 | 53) << 1;
        r14 = -((r14 & (-54)) | ((~r14) & 53));
        r15 = ((r18 | r14) << 1) - (r18 ^ r14);
        ivas.gov.bisp.enumeration.p009ai.t.a = r15 % 128;
        r15 = r15 % 2;
        r10.add(r7[r13].toByteArray());
        r13 = ((r13 ^ 2) + ((r13 & 2) << 1)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d5, code lost:
    
        java.util.Collections.sort(r10, ivas.gov.bisp.enumeration.p009ai.t.c);
        r7 = r28.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
    
        if (r7 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00de, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r13 = (r7 | 67) << 1;
        r7 = -(r7 ^ 67);
        r14 = (r13 ^ r7) + ((r7 & r13) << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r14 % 128;
        r14 = r14 % 2;
        r7 = ivas.gov.bisp.enumeration.p002ab.M.c(r9, 0);
        r9 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r13 = ((r9 ^ 53) | (r9 & 53)) << 1;
        r9 = -(((~r9) & 53) | (r9 & (-54)));
        r14 = (r13 & r9) + (r9 | r13);
        ivas.gov.bisp.enumeration.p009ai.t.a = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010b, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r13 = r9 & 27;
        r9 = ((r9 | 27) & (~r13)) + (r13 << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r9 % 128;
        r9 = r9 % 2;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x011f, code lost:
    
        if (r9 >= r7.size()) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0121, code lost:
    
        r13 = new java.util.ArrayList(r7.get(r9));
        r14 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r15 = r14 ^ 121;
        r14 = ((r14 & 121) | r15) << 1;
        r15 = -r15;
        r14 = (r14 ^ r15) + ((r14 & r15) << 1);
        ivas.gov.bisp.enumeration.p009ai.t.b = r14 % 128;
        r14 = r14 % r5;
        java.util.Collections.sort(r13, ivas.gov.bisp.enumeration.p009ai.t.c);
        r14 = r10.size();
        r15 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r15 = (r15 & 75) + (r15 | 75);
        ivas.gov.bisp.enumeration.p009ai.t.b = r15 % 128;
        r15 = r15 % r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x015a, code lost:
    
        if (r14 != r13.size()) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015c, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r14 = r6 & 13;
        r6 = -(-(r6 | 13));
        r15 = (r14 & r6) + (r6 | r14);
        ivas.gov.bisp.enumeration.p009ai.t.a = r15 % 128;
        r15 = r15 % r5;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0173, code lost:
    
        if (r6 >= r10.size()) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0175, code lost:
    
        r14 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r15 = r14 & 119;
        r12 = ((~r15) & (r14 | 119)) + (r15 << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r12 % 128;
        r12 = r12 % r5;
        r12 = (byte[]) r10.get(r6);
        r14 = r13.get(r6);
        r15 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r5 = (((r15 & (-100)) | (99 & (~r15))) - (~((r15 & 99) << 1))) - 1;
        ivas.gov.bisp.enumeration.p009ai.t.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a6, code lost:
    
        if ((r5 % 2) != 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ae, code lost:
    
        if (java.util.Arrays.equals(r12, (byte[]) r14) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b1, code lost:
    
        r5 = (((r6 | 2) << 1) - (r6 ^ 2)) - 1;
        r6 = ivas.gov.bisp.enumeration.p009ai.t.b + 40;
        r12 = (r6 ^ (-1)) + (r6 << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r12 % 128;
        r12 = r12 % 2;
        r6 = r5;
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ca, code lost:
    
        java.util.Arrays.equals(r12, (byte[]) r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d1, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r6 = r5 & 125;
        r6 = r6 + ((r5 ^ 125) | r6);
        ivas.gov.bisp.enumeration.p009ai.t.a = r6 % 128;
        r6 = r6 % 2;
        r6 = ((r5 & 50) + (r5 | 50)) - 1;
        ivas.gov.bisp.enumeration.p009ai.t.a = r6 % 128;
        r6 = r6 % 2;
        r6 = (r5 & (-52)) | ((~r5) & 51);
        r5 = -(-((r5 & 51) << 1));
        r7 = ((r6 | r5) << 1) - (r5 ^ r6);
        ivas.gov.bisp.enumeration.p009ai.t.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0201, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r6 = ((r5 | 109) << 1) - (r5 ^ 109);
        ivas.gov.bisp.enumeration.p009ai.t.b = r6 % 128;
        r6 = r6 % 2;
        r5 = ((r9 ^ 1) | (r9 & 1)) << 1;
        r6 = -((r9 & (-2)) | ((~r9) & 1));
        r9 = (r5 & r6) + (r5 | r6);
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0223, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p009ai.t.a + 83;
        ivas.gov.bisp.enumeration.p009ai.t.b = r5 % 128;
        r5 = r5 % 2;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x022e, code lost:
    
        if (r11 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0230, code lost:
    
        r0 = new ivas.gov.bisp.enumeration.p009ai.M(1, null);
        r1 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r3 = r1 & 51;
        r2 = ((r1 ^ 51) | r3) << 1;
        r1 = -((r1 | 51) & (~r3));
        r3 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.p009ai.t.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x024d, code lost:
    
        if ((r3 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x024f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0251, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0252, code lost:
    
        r5 = r11.authority;
        r6 = new java.util.ArrayList();
        r7 = new android.net.Uri.Builder().scheme("content").authority(r5).build();
        r9 = new android.net.Uri.Builder();
        r10 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r11 = r10 & 103;
        r10 = (r10 | 103) & (~r11);
        r11 = -(-(r11 << 1));
        r12 = (r10 & r11) + (r10 | r11);
        ivas.gov.bisp.enumeration.p009ai.t.b = r12 % 128;
        r12 = r12 % 2;
        r2 = r9.scheme("content").authority(r5).appendPath("file").build();
        r5 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r9 = r5 + 43;
        ivas.gov.bisp.enumeration.p009ai.t.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02a5, code lost:
    
        if ((r9 % 2) != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a7, code lost:
    
        r9 = new java.lang.String[7];
        r9[0] = "_id";
        r9[0] = "file_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02af, code lost:
    
        r9 = new java.lang.String[7];
        r9[0] = "_id";
        r9[1] = "file_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02b6, code lost:
    
        r11 = r9;
        r9 = (r5 ^ 5) + ((r5 & 5) << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02c3, code lost:
    
        r11[2] = "font_ttc_index";
        r11[3] = "font_variation_settings";
        r11[4] = "font_weight";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02cd, code lost:
    
        r9 = r5 & 109;
        r5 = -(-((r5 ^ 109) | r9));
        r10 = ((r9 | r5) << 1) - (r5 ^ r9);
        ivas.gov.bisp.enumeration.p009ai.t.a = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02df, code lost:
    
        r11[5] = "font_italic";
        r11[6] = "result_code";
        r9 = r27.getContentResolver();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02eb, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p009ai.t.a + 123;
        ivas.gov.bisp.enumeration.p009ai.t.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02f5, code lost:
    
        r13 = new java.lang.String[]{r28.e};
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02fc, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r10 = r0 & 73;
        r5 = ((r0 ^ 73) | r10) << 1;
        r0 = -((r0 | 73) & (~r10));
        r10 = (r5 ^ r0) + ((r0 & r5) << 1);
        ivas.gov.bisp.enumeration.p009ai.t.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0314, code lost:
    
        if ((r10 % 2) != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0316, code lost:
    
        r9 = r9.query(r7, r11, "query = ?", r13, null, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0323, code lost:
    
        if (r9 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0325, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r11 = ((r10 ^ 21) - (~((r10 & 21) << 1))) - 1;
        ivas.gov.bisp.enumeration.p009ai.t.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0335, code lost:
    
        if ((r11 % 2) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0337, code lost:
    
        r11 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x033f, code lost:
    
        if (r9.getCount() <= 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0346, code lost:
    
        if (r9.getCount() <= 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0348, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p009ai.t.a + 63;
        ivas.gov.bisp.enumeration.p009ai.t.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0352, code lost:
    
        if ((r6 % 2) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0354, code lost:
    
        r3 = r9.getColumnIndex("result_code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0358, code lost:
    
        r6 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x035d, code lost:
    
        r3 = r9.getColumnIndex("result_code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0361, code lost:
    
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0366, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p009ai.t.b - (-1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0370, code lost:
    
        r5 = r9.getColumnIndex("_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0374, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r11 = r10 & 117;
        r10 = -(-((r10 ^ 117) | r11));
        r12 = (r11 & r10) + (r10 | r11);
        ivas.gov.bisp.enumeration.p009ai.t.b = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0387, code lost:
    
        r0 = r9.getColumnIndex("file_id");
        r1 = r9.getColumnIndex("font_ttc_index");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x038f, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r11 = ((r10 ^ 9) | (r10 & 9)) << 1;
        r10 = -(((~r10) & 9) | (r10 & (-10)));
        r12 = (r11 ^ r10) + ((r10 & r11) << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03aa, code lost:
    
        if ((r12 % 2) == 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03ac, code lost:
    
        r4 = r9.getColumnIndex("font_weight");
        r10 = r9.getColumnIndex("font_italic");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03ba, code lost:
    
        if (r9.moveToNext() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03bc, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p009ai.t.a;
        r12 = (r11 & 8) + (r11 | 8);
        r11 = (r12 ^ (-1)) + (r12 << 1);
        ivas.gov.bisp.enumeration.p009ai.t.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03cd, code lost:
    
        if ((r11 % 2) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03cf, code lost:
    
        r11 = 87 / 0;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03d4, code lost:
    
        if (r3 == (-1)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03d7, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03d8, code lost:
    
        if (r3 == (-1)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03de, code lost:
    
        r26 = r9.getInt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03e1, code lost:
    
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03e3, code lost:
    
        if (r1 == r11) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03e5, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p009ai.t.b;
        r12 = (r11 & (-56)) | ((~r11) & 55);
        r11 = (r11 & 55) << 1;
        r13 = (r12 ^ r11) + ((r11 & r12) << 1);
        ivas.gov.bisp.enumeration.p009ai.t.a = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03fb, code lost:
    
        r12 = r9.getInt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03ff, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p009ai.t.b + 95;
        ivas.gov.bisp.enumeration.p009ai.t.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0408, code lost:
    
        if ((r13 % 2) != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x040d, code lost:
    
        r11 = 40 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p009ai.M b(android.content.Context r27, ivas.gov.bisp.enumeration.p009ai.u r28, android.os.CancellationSignal r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p009ai.t.b(android.content.Context, ivas.gov.bisp.enumeration.ai.u, android.os.CancellationSignal):ivas.gov.bisp.enumeration.ai.M");
    }
}
