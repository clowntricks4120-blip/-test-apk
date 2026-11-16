package ivas.gov.bisp.enumeration.aD;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class an {
    private static int a = 1;
    private static int b;
    public static final an c;
    public int d;
    public int[] e;
    public Object[] f;
    public int g;
    public boolean h;

    static {
        an anVar = new an(0, new int[0], new Object[0], false);
        int i = a;
        int i2 = i & 87;
        int i3 = (i ^ 87) | i2;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        c = anVar;
        int i6 = i ^ 39;
        int i7 = (i & 39) << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 80 / 0;
        }
    }

    public an() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:17:0x0084  */
    public final void g(int i, Object obj) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 37;
        int i6 = ((i4 ^ 37) | i5) << 1;
        int i7 = -((i4 | 37) & (~i5));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        if (!this.h) {
            throw new UnsupportedOperationException();
        }
        int i11 = (i9 & (-68)) | ((~i9) & 67);
        int i12 = -(-((i9 & 67) << 1));
        int i13 = (i11 & i12) + (i11 | i12);
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = this.d;
        int[] iArr = this.e;
        if (i14 == 0) {
            int i16 = 47 / 0;
        }
        int i17 = ((i9 & (-48)) | ((~i9) & 47)) + ((i9 & 47) << 1);
        int i18 = i17 % 128;
        a = i18;
        if (i17 % 2 == 0) {
            int i19 = 13 / 0;
            if (i15 == iArr.length) {
                if (i15 < 4) {
                    int i20 = (-2) - (((i9 ^ 14) + ((i9 & 14) << 1)) ^ (-1));
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = i9 & 79;
                    int i23 = (i9 ^ 79) | i22;
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    i2 = 8;
                } else {
                    i2 = i15 >> 1;
                    int i26 = (i18 ^ 72) + ((i18 & 72) << 1);
                    int i27 = (i26 ^ (-1)) + (i26 << 1);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                }
                int i29 = i15 & i2;
                int i30 = ((((i15 ^ i2) | i29) << 1) - (~(-((i2 | i15) & (~i29))))) - 1;
                this.e = Arrays.copyOf(iArr, i30);
                int i31 = b;
                int i32 = (((i31 & (-82)) | ((~i31) & 81)) - (~(-(-((i31 & 81) << 1))))) - 1;
                a = i32 % 128;
                int i33 = i32 % 2;
                this.f = Arrays.copyOf(this.f, i30);
                int i34 = b;
                int i35 = i34 & 45;
                int i36 = ((i34 | 45) & (~i35)) + (i35 << 1);
                a = i36 % 128;
                int i37 = i36 % 2;
            }
        } else if (i15 == iArr.length) {
            if (i15 < 4) {
                int i210 = (-2) - (((i9 ^ 14) + ((i9 & 14) << 1)) ^ (-1));
                a = i210 % 128;
                int i211 = i210 % 2;
                int i212 = i9 & 79;
                int i213 = (i9 ^ 79) | i212;
                int i214 = (i212 ^ i213) + ((i213 & i212) << 1);
                a = i214 % 128;
                int i215 = i214 % 2;
                i2 = 8;
            } else {
                i2 = i15 >> 1;
                int i216 = (i18 ^ 72) + ((i18 & 72) << 1);
                int i217 = (i216 ^ (-1)) + (i216 << 1);
                b = i217 % 128;
                int i218 = i217 % 2;
            }
            int i219 = i15 & i2;
            int i38 = ((((i15 ^ i2) | i219) << 1) - (~(-((i2 | i15) & (~i219))))) - 1;
            this.e = Arrays.copyOf(iArr, i38);
            int i39 = b;
            int i310 = (((i39 & (-82)) | ((~i39) & 81)) - (~(-(-((i39 & 81) << 1))))) - 1;
            a = i310 % 128;
            int i311 = i310 % 2;
            this.f = Arrays.copyOf(this.f, i38);
            int i312 = b;
            int i313 = i312 & 45;
            int i314 = ((i312 | 45) & (~i313)) + (i313 << 1);
            a = i314 % 128;
            int i315 = i314 % 2;
        }
        int[] iArr2 = this.e;
        int i40 = this.d;
        int i41 = b;
        int i42 = (((i41 | 35) << 1) - (~(-(i41 ^ 35)))) - 1;
        a = i42 % 128;
        int i43 = i42 % 2;
        iArr2[i40] = i;
        this.f[i40] = obj;
        int i44 = (i41 & 85) + (i41 | 85);
        int i45 = i44 % 128;
        a = i45;
        int i46 = i44 % 2;
        int i47 = i40 & 1;
        int i48 = (i40 ^ 1) | i47;
        this.d = ((i47 | i48) << 1) - (i47 ^ i48);
        int i49 = ((i45 | 57) << 1) - (i45 ^ 57);
        b = i49 % 128;
        int i50 = i49 % 2;
    }

    public an(int i, int[] iArr, Object[] objArr, boolean z) {
        this.g = -1;
        this.d = i;
        this.e = iArr;
        this.f = objArr;
        this.h = z;
    }

    public static an d() {
        int i = 2 % 2;
        an anVar = new an(0, new int[8], new Object[8], true);
        int i2 = b;
        int i3 = (i2 ^ 121) + ((i2 & 121) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        return anVar;
    }

    public final int hashCode() {
        int i;
        int[] iArr;
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = 17;
        int i5 = (i3 & (-18)) | ((~i3) & 17);
        int i6 = -(-((i3 & 17) << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            i = this.d;
            iArr = this.e;
            iHashCode = 42;
        } else {
            i = this.d;
            iArr = this.e;
            iHashCode = 17;
        }
        int i8 = i3 & 11;
        int i9 = -(-(i3 | 11));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        int i13 = 0;
        while (i13 < i) {
            int i14 = a;
            int i15 = ((i14 & 8) + (i14 | 8)) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i4 * 31;
            int i18 = iArr[i13];
            int i19 = i17 & i18;
            i4 = ((i17 ^ i18) | i19) + i19;
            int i20 = i13 & 1;
            int i21 = (i13 | 1) & (~i20);
            int i22 = -(-(i20 << 1));
            i13 = (i21 | i22) + (i21 & i22);
            int i23 = (-2) - (((i14 & 50) + (i14 | 50)) ^ (-1));
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        Object[] objArr = this.f;
        int i25 = this.d;
        int i26 = a;
        int i27 = i26 & 25;
        int i28 = (~i27) & (i26 | 25);
        int i29 = -(-(i27 << 1));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        b = i30 % 128;
        int i31 = i30 % 2;
        int i32 = i26 ^ 21;
        int i33 = (((i26 & 21) | i32) << 1) - i32;
        b = i33 % 128;
        int i34 = i33 % 2;
        while (i12 < i25) {
            int i35 = b;
            int i36 = i35 & 11;
            int i37 = i36 + ((i35 ^ 11) | i36);
            a = i37 % 128;
            iHashCode = i37 % 2 == 0 ? (iHashCode * 29) % objArr[i12].hashCode() : ((iHashCode * 31) - (~(-(~objArr[i12].hashCode())))) - 2;
            int i38 = a;
            int i39 = i38 & 65;
            int i40 = i39 + ((i38 ^ 65) | i39);
            b = i40 % 128;
            if (i40 % 2 != 0) {
                int i41 = i12 & 1;
                int i42 = i12 | 1;
                int i43 = (i41 & i42) + (i42 | i41);
                i12 = ((i43 & 18) + (i43 | 18)) - 1;
            } else {
                int i44 = i12 ^ 59;
                int i45 = (i12 & 59) << 1;
                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                int i47 = ((i46 | (-57)) << 1) - (i46 ^ (-57));
                i12 = (i47 ^ (-1)) + (i47 << 1);
            }
        }
        int i48 = i & 527;
        int i49 = (((i | 527) & (~i48)) + (i48 << 1)) * 31;
        int i50 = i49 ^ i4;
        int i51 = (((((i49 & i4) | i50) << 1) - (~(-i50))) - 1) * 31;
        int i52 = (i51 ^ iHashCode) + ((i51 & iHashCode) << 1);
        int i53 = b;
        int i54 = (i53 & 75) + (i53 | 75);
        a = i54 % 128;
        int i55 = i54 % 2;
        return i52;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if ((r5 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r9 == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r9 == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r9 == 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r5 = ((((r1 ^ 5) | (r1 & 5)) << 1) - (~(-((r1 & (-6)) | ((~r1) & 5))))) - 1;
        ivas.gov.bisp.enumeration.aD.an.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if ((r5 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r9 == 4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r9 == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r5 = r1 ^ 79;
        r1 = (r1 & 79) << 1;
        r6 = (r5 & r1) + (r1 | r5);
        ivas.gov.bisp.enumeration.aD.an.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if ((r6 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r9 != 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r9 != 5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r9 = ((java.lang.Integer) r10).intValue();
        r10 = ((ivas.gov.bisp.enumeration.aD.C0055l) r11).c;
        r11 = ivas.gov.bisp.enumeration.aD.an.b;
        r1 = r11 & 45;
        r11 = r11 | 45;
        r5 = ((r1 | r11) << 1) - (r11 ^ r1);
        ivas.gov.bisp.enumeration.aD.an.a = r5 % 128;
        r5 = r5 % 2;
        r10.ce(r3, r9);
        r9 = ivas.gov.bisp.enumeration.aD.an.a;
        r10 = (r9 & (-12)) | ((~r9) & 11);
        r9 = -(-((r9 & 11) << 1));
        r11 = (r10 & r9) + (r9 | r10);
        ivas.gov.bisp.enumeration.aD.an.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if ((r11 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        throw new java.lang.RuntimeException(ivas.gov.bisp.enumeration.aD.C0065v.g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        r9 = (ivas.gov.bisp.enumeration.aD.C0055l) r11;
        r9.c.co(r3, 3);
        r1 = ivas.gov.bisp.enumeration.aD.an.b;
        r5 = r1 & 97;
        r2 = ((r1 ^ 97) | r5) << 1;
        r1 = -((r1 | 97) & (~r5));
        r5 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.aD.an.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if ((r5 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        ((ivas.gov.bisp.enumeration.aD.an) r10).h(r11);
        r9 = r9.c;
        r10 = 34 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        ((ivas.gov.bisp.enumeration.aD.an) r10).h(r11);
        r9 = r9.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.an.a;
        r11 = r10 ^ 41;
        r10 = ((((r10 & 41) | r11) << 1) - (~(-r11))) - 1;
        ivas.gov.bisp.enumeration.aD.an.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0102, code lost:
    
        if ((r10 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        r9.co(r3, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
    
        r9.co(r3, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010b, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aD.an.b;
        r10 = r9 & 41;
        r9 = -(-((r9 ^ 41) | r10));
        r11 = ((r10 | r9) << 1) - (r9 ^ r10);
        ivas.gov.bisp.enumeration.aD.an.a = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011f, code lost:
    
        r10 = (ivas.gov.bisp.enumeration.aD.AbstractC0069z) r10;
        r9 = ((ivas.gov.bisp.enumeration.aD.C0055l) r11).c;
        r11 = ivas.gov.bisp.enumeration.aD.an.b;
        r5 = r11 & 123;
        r1 = ((r11 ^ 123) | r5) << 1;
        r11 = -((r11 | 123) & (~r5));
        r5 = (r1 ^ r11) + ((r11 & r1) << 1);
        ivas.gov.bisp.enumeration.aD.an.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013c, code lost:
    
        if ((r5 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013e, code lost:
    
        r9.cc(r3, r10);
        r9 = 8 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0146, code lost:
    
        r9.cc(r3, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0149, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aD.an.a;
        r10 = r9 & 87;
        r10 = r10 + ((r9 ^ 87) | r10);
        ivas.gov.bisp.enumeration.aD.an.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0156, code lost:
    
        if ((r10 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0158, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015a, code lost:
    
        r9 = ((java.lang.Long) r10).longValue();
        r11 = ((ivas.gov.bisp.enumeration.aD.C0055l) r11).c;
        r1 = ivas.gov.bisp.enumeration.aD.an.a + 24;
        r5 = (r1 ^ (-1)) + (r1 << 1);
        ivas.gov.bisp.enumeration.aD.an.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0171, code lost:
    
        if ((r5 % 2) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
    
        r11.cg(r3, r9);
        r9 = ivas.gov.bisp.enumeration.aD.an.b;
        r10 = r9 ^ 109;
        r9 = (((r9 & 109) | r10) << 1) - r10;
        ivas.gov.bisp.enumeration.aD.an.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0184, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0185, code lost:
    
        r11.cg(r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0188, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0189, code lost:
    
        r9 = ((java.lang.Long) r10).longValue();
        r11 = (ivas.gov.bisp.enumeration.aD.C0055l) r11;
        r1 = ivas.gov.bisp.enumeration.aD.an.a + 77;
        ivas.gov.bisp.enumeration.aD.an.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019a, code lost:
    
        if ((r1 % 2) != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019c, code lost:
    
        r11.c.cr(r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r9 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a2, code lost:
    
        r11.c.cr(r3, r9);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r9 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r5 = r1 & 49;
        r5 = (r5 - (~(-(-((r1 ^ 49) | r5))))) - 1;
        ivas.gov.bisp.enumeration.aD.an.a = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(int r9, java.lang.Object r10, ivas.gov.bisp.enumeration.aD.InterfaceC0051g r11) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.an.e(int, java.lang.Object, ivas.gov.bisp.enumeration.aD.g):void");
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = i3 + ((i2 ^ 111) | i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (this == obj) {
            int i7 = (-2) - ((((i5 | 118) << 1) - (i5 ^ 118)) ^ (-1));
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 117;
            a = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (obj == null) {
            int i12 = i2 + 39;
            a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i2 & 35;
            int i15 = (i2 | 35) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (!(obj instanceof an)) {
            int i19 = ((i5 ^ 35) | (i5 & 35)) << 1;
            int i20 = -((i5 & (-36)) | (35 & (~i5)));
            int i21 = (i19 & i20) + (i19 | i20);
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i5 & 13;
            int i24 = (i5 ^ 13) | i23;
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
            return false;
        }
        an anVar = (an) obj;
        int i27 = this.d;
        Object obj2 = null;
        if (i27 == anVar.d) {
            int i28 = (i5 & 75) + (i5 | 75);
            int i29 = i28 % 128;
            b = i29;
            int i30 = i28 % 2;
            int[] iArr = this.e;
            int[] iArr2 = anVar.e;
            int i31 = (((i29 | 126) << 1) - (i29 ^ 126)) - 1;
            a = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 60 / 0;
            }
            int i33 = i29 & 113;
            int i34 = (((i29 | 113) & (~i33)) - (~(-(-(i33 << 1))))) - 1;
            a = i34 % 128;
            int i35 = i34 % 2;
            int i36 = 0;
            while (true) {
                if (i36 >= i27) {
                    int i37 = b;
                    int i38 = (i37 ^ 51) + ((i37 & 51) << 1);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    z = true;
                    break;
                }
                int i40 = b;
                int i41 = (((i40 | 28) << 1) - (i40 ^ 28)) - 1;
                int i42 = i41 % 128;
                a = i42;
                int i43 = i41 % 2;
                if (iArr[i36] != iArr2[i36]) {
                    int i44 = i42 & 33;
                    int i45 = (((i42 ^ 33) | i44) << 1) - ((~i44) & (i42 | 33));
                    int i46 = i45 % 128;
                    b = i46;
                    int i47 = i45 % 2;
                    int i48 = i46 & 55;
                    int i49 = (i46 | 55) & (~i48);
                    int i50 = i48 << 1;
                    int i51 = (i49 & i50) + (i50 | i49);
                    a = i51 % 128;
                    int i52 = i51 % 2;
                    z = false;
                    break;
                }
                int i53 = i36 | 1;
                int i54 = i53 << 1;
                int i55 = -((~(i36 & 1)) & i53);
                i36 = ((i54 | i55) << 1) - (i55 ^ i54);
                int i56 = i40 & 5;
                int i57 = (((i40 ^ 5) | i56) << 1) - ((i40 | 5) & (~i56));
                a = i57 % 128;
                if (i57 % 2 == 0) {
                    int i58 = 5 % 3;
                }
            }
            if (!(!z)) {
                int i59 = b;
                int i60 = i59 & 21;
                int i61 = (i59 ^ 21) | i60;
                int i62 = (i60 & i61) + (i60 | i61);
                a = i62 % 128;
                if (i62 % 2 == 0) {
                    Object[] objArr = anVar.f;
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr2 = this.f;
                Object[] objArr3 = anVar.f;
                int i63 = this.d;
                int i64 = i59 ^ 45;
                int i65 = ((i59 & 45) | i64) << 1;
                int i66 = -i64;
                int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
                a = i67 % 128;
                int i68 = i67 % 2;
                int i69 = 0;
                while (true) {
                    if (i69 >= i63) {
                        int i70 = a;
                        int i71 = i70 & 81;
                        int i72 = ((i70 ^ 81) | i71) << 1;
                        int i73 = -((i70 | 81) & (~i71));
                        int i74 = (i72 & i73) + (i73 | i72);
                        b = i74 % 128;
                        int i75 = i74 % 2;
                        z2 = true;
                        break;
                    }
                    int i76 = b + 104;
                    int i77 = (i76 ^ (-1)) + (i76 << 1);
                    a = i77 % 128;
                    if (i77 % 2 == 0) {
                        objArr2[i69].equals(objArr3[i69]);
                        throw null;
                    }
                    if (!objArr2[i69].equals(objArr3[i69])) {
                        int i78 = b;
                        int i79 = ((i78 ^ 75) | (i78 & 75)) << 1;
                        int i80 = -((i78 & (-76)) | ((~i78) & 75));
                        int i81 = (i79 & i80) + (i79 | i80);
                        a = i81 % 128;
                        int i82 = i81 % 2;
                        int i83 = ((i78 & 40) + (i78 | 40)) - 1;
                        a = i83 % 128;
                        int i84 = i83 % 2;
                        z2 = false;
                        break;
                    }
                    int i85 = i69 & 1;
                    int i86 = ((i69 ^ 1) | i85) << 1;
                    int i87 = -((i69 | 1) & (~i85));
                    i69 = ((i87 & i86) << 1) + (i86 ^ i87);
                    int i88 = b + 55;
                    a = i88 % 128;
                    if (i88 % 2 == 0) {
                        int i89 = 2 % 5;
                    }
                }
                if (!(!z2)) {
                    int i90 = b + 1;
                    int i91 = i90 % 128;
                    a = i91;
                    int i92 = i90 % 2;
                    int i93 = i91 + 3;
                    b = i93 % 128;
                    if (i93 % 2 == 0) {
                        return true;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
        }
        int i94 = a;
        int i95 = i94 & 47;
        int i96 = (((i94 ^ 47) | i95) << 1) - ((i94 | 47) & (~i95));
        b = i96 % 128;
        if (i96 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final void h(InterfaceC0051g interfaceC0051g) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 91) + (i2 | 91);
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.d == 0) {
            int i5 = ((i2 | 5) << 1) - (i2 ^ 5);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        Objects.requireNonNull(interfaceC0051g);
        int i6 = b;
        int i7 = ((i6 ^ 86) + ((i6 & 86) << 1)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < this.d) {
            int i10 = a;
            int i11 = i10 ^ 37;
            int i12 = (((i10 & 37) | i11) << 1) - i11;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                e(this.e[i9], this.f[i9], interfaceC0051g);
                throw null;
            }
            e(this.e[i9], this.f[i9], interfaceC0051g);
            int i13 = i9 & 1;
            int i14 = (i9 ^ 1) | i13;
            i9 = (i14 | i13) + (i13 & i14);
            int i15 = a;
            int i16 = i15 & 59;
            int i17 = i16 + ((i15 ^ 59) | i16);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = a;
        int i20 = ((i19 | 5) << 1) - (((~i19) & 5) | (i19 & (-6)));
        b = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r2 = r1 & 19;
        r2 = r2 + ((r1 ^ 19) | r2);
        ivas.gov.bisp.enumeration.aD.an.b = r2 % 128;
        r2 = r2 % 2;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r5 >= r13.d) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.an.a;
        r3 = r2 + 85;
        ivas.gov.bisp.enumeration.aD.an.b = r3 % 128;
        r3 = r3 % 2;
        r3 = r13.e[r5];
        r7 = r3 >>> 3;
        r8 = r2 ^ 91;
        r9 = ((r2 & 91) | r8) << 1;
        r8 = -r8;
        r10 = (r9 ^ r8) + ((r8 & r9) << 1);
        ivas.gov.bisp.enumeration.aD.an.b = r10 % 128;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if ((r10 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        r3 = r3 & 110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r3 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r3 = r3 & 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r3 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        r9 = (((r2 | 11) << 1) - (~(-((r2 & (-12)) | ((~r2) & 11))))) - 1;
        ivas.gov.bisp.enumeration.aD.an.b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r3 == 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        r10 = r2 + 101;
        ivas.gov.bisp.enumeration.aD.an.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if ((r10 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r3 == 3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r3 == 2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        r10 = r2 + 67;
        ivas.gov.bisp.enumeration.aD.an.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r3 == 3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r10 = ((r2 ^ 94) + ((r2 & 94) << 1)) - 1;
        ivas.gov.bisp.enumeration.aD.an.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if ((r10 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r3 != 5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        if (r3 != 5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        r9 = r2 & 77;
        r3 = ((r2 ^ 77) | r9) << 1;
        r2 = -((r2 | 77) & (~r9));
        r9 = (r3 ^ r2) + ((r2 & r3) << 1);
        ivas.gov.bisp.enumeration.aD.an.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if ((r9 % 2) != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bC(r7, ((java.lang.Integer) r13.f[r5]).intValue());
        r3 = (-2) - ((ivas.gov.bisp.enumeration.aD.an.b + 32) ^ (-1));
        ivas.gov.bisp.enumeration.aD.an.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        ivas.gov.bisp.enumeration.aD.AbstractC0064u.bC(r7, ((java.lang.Integer) r13.f[r5]).intValue());
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        throw new java.lang.IllegalStateException(ivas.gov.bisp.enumeration.aD.C0065v.g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(r7);
        r3 = (ivas.gov.bisp.enumeration.aD.an) r13.f[r5];
        r7 = ivas.gov.bisp.enumeration.aD.an.b + 13;
        ivas.gov.bisp.enumeration.aD.an.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
    
        if ((r7 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        r3 = (r3.f() / (r2 % 3)) / r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
    
        r3 = r3.f();
        r2 = -(~(r2 * 2));
        r2 = (-2) - ((((r3 | r2) << 1) - (r2 ^ r3)) ^ (-1));
        r3 = ((r2 ^ r1) | (r2 & r1)) << 1;
        r1 = -((r1 & (~r2)) | ((~r1) & r2));
        r3 = (r3 & r1) + (r1 | r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013c, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.an.a;
        r2 = (((r1 ^ 81) | (r1 & 81)) << 1) - (((~r1) & 81) | (r1 & (-82)));
        ivas.gov.bisp.enumeration.aD.an.b = r2 % 128;
        r2 = r2 % 2;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0154, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bE(r7, (ivas.gov.bisp.enumeration.aD.AbstractC0069z) r13.f[r5]);
        r3 = ivas.gov.bisp.enumeration.aD.an.b + 59;
        ivas.gov.bisp.enumeration.aD.an.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0169, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bx(r7, ((java.lang.Long) r13.f[r5]).longValue());
        r3 = ivas.gov.bisp.enumeration.aD.an.a;
        r7 = (-2) - ((((r3 | 100) << 1) - (r3 ^ 100)) ^ (-1));
        ivas.gov.bisp.enumeration.aD.an.b = r7 % 128;
        r7 = r7 % 2;
        r7 = r3 ^ 21;
        r3 = ((r3 & 21) | r7) << 1;
        r7 = -r7;
        r8 = (r3 & r7) + (r3 | r7);
        ivas.gov.bisp.enumeration.aD.an.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0198, code lost:
    
        if ((r8 % 2) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019a, code lost:
    
        r3 = 4 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019d, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bV(r7, ((java.lang.Long) r13.f[r5]).longValue());
        r3 = ivas.gov.bisp.enumeration.aD.an.b;
        r7 = (r3 & (-26)) | ((~r3) & 25);
        r3 = (r3 & 25) << 1;
        r9 = (r7 ^ r3) + ((r3 & r7) << 1);
        r3 = r9 % 128;
        ivas.gov.bisp.enumeration.aD.an.a = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c0, code lost:
    
        if ((r9 % 2) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c2, code lost:
    
        r7 = ((r3 & 88) + (r3 | 88)) - 1;
        ivas.gov.bisp.enumeration.aD.an.b = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01cd, code lost:
    
        r3 = r2 | r1;
        r7 = r3 << 1;
        r1 = -((~(r1 & r2)) & r3);
        r2 = (r7 & r1) + (r1 | r7);
        r1 = ivas.gov.bisp.enumeration.aD.an.a;
        r3 = (r1 | 99) << 1;
        r1 = -(((~r1) & 99) | (r1 & (-100)));
        r7 = (r3 ^ r1) + ((r1 & r3) << 1);
        ivas.gov.bisp.enumeration.aD.an.b = r7 % 128;
        r7 = r7 % 2;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f0, code lost:
    
        r5 = r5 + 1;
        r2 = ivas.gov.bisp.enumeration.aD.an.b;
        r3 = ((r2 | 47) << 1) - (((~r2) & 47) | (r2 & (-48)));
        ivas.gov.bisp.enumeration.aD.an.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0206, code lost:
    
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0209, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x020a, code lost:
    
        r13.g = r1;
        r2 = ivas.gov.bisp.enumeration.aD.an.b;
        r3 = r2 & 71;
        r3 = (r3 - (~((r2 ^ 71) | r3))) - 1;
        ivas.gov.bisp.enumeration.aD.an.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x021b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r3 != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r3 != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = r2 & 95;
        r1 = (r1 - (~((r2 ^ 95) | r1))) - 1;
        ivas.gov.bisp.enumeration.aD.an.a = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f() {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.an.f():int");
    }
}
