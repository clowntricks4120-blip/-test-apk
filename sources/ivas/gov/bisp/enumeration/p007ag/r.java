package ivas.gov.bisp.enumeration.p007ag;

import android.graphics.Path;
import android.support.v4.media.session.IMediaSession;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class r {
    private static int a = 1;
    private static int b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.ag.r.aVv[r9.length];
        r3 = r2 & 117;
        r3 = (r3 - (~(-(-((r2 ^ 117) | r3))))) - 1;
        ivas.gov.bisp.enumeration.p007ag.r.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r4 >= r9.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.ag.r.aVv(r9[r4]);
        r3 = ivas.gov.bisp.enumeration.p007ag.r.a;
        r7 = r3 & 29;
        r6 = ((r3 ^ 29) | r7) << 1;
        r7 = -((~r7) & (r3 | 29));
        r8 = (r6 ^ r7) + ((r6 & r7) << 1);
        ivas.gov.bisp.enumeration.p007ag.r.b = r8 % 128;
        r8 = r8 % 2;
        r1[r4] = r2;
        r4 = (-2) - (((r4 & 2) + (r4 | 2)) ^ (-1));
        r2 = (r3 ^ 101) + ((r3 & 101) << 1);
        ivas.gov.bisp.enumeration.p007ag.r.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p007ag.r.b;
        r2 = r9 & 125;
        r9 = -(-((r9 ^ 125) | r2));
        r3 = ((r2 | r9) << 1) - (r9 ^ r2);
        ivas.gov.bisp.enumeration.p007ag.r.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if ((r3 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r1 = r1 + 72;
        r9 = (r1 ^ (-1)) + (r1 << 1);
        ivas.gov.bisp.enumeration.p007ag.r.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if ((r9 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.ag.r.aVv[] f(ivas.gov.bisp.enumeration.ag.r.aVv[] r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p007ag.r.a
            r2 = r1 ^ 13
            r3 = r1 & 13
            r3 = r3 | r2
            int r3 = r3 << 1
            int r2 = -r2
            int r2 = ~r2
            int r3 = r3 - r2
            int r3 = r3 + (-1)
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p007ag.r.b = r2
            int r3 = r3 % r0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L20
            r3 = 14
            int r3 = r3 / r4
            if (r9 != 0) goto L32
            goto L22
        L20:
            if (r9 != 0) goto L32
        L22:
            int r1 = r1 + 72
            r9 = r1 ^ (-1)
            int r1 = r1 << 1
            int r9 = r9 + r1
            int r1 = r9 % 128
            ivas.gov.bisp.enumeration.p007ag.r.b = r1
            int r9 = r9 % r0
            if (r9 != 0) goto L31
            return r5
        L31:
            throw r5
        L32:
            int r1 = r9.length
            ivas.gov.bisp.enumeration.ag.r$aVv[] r1 = new ivas.gov.bisp.enumeration.ag.r.aVv[r1]
            r3 = r2 & 117(0x75, float:1.64E-43)
            r2 = r2 ^ 117(0x75, float:1.64E-43)
            r2 = r2 | r3
            int r2 = -r2
            int r2 = -r2
            int r2 = ~r2
            int r3 = r3 - r2
            int r3 = r3 + (-1)
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p007ag.r.a = r2
            int r3 = r3 % r0
        L45:
            int r2 = r9.length
            if (r4 >= r2) goto L82
            ivas.gov.bisp.enumeration.ag.r$aVv r2 = new ivas.gov.bisp.enumeration.ag.r$aVv
            r3 = r9[r4]
            r2.<init>(r3)
            int r3 = ivas.gov.bisp.enumeration.p007ag.r.a
            r6 = r3 ^ 29
            r7 = r3 & 29
            r6 = r6 | r7
            int r6 = r6 << 1
            int r7 = ~r7
            r8 = r3 | 29
            r7 = r7 & r8
            int r7 = -r7
            r8 = r6 ^ r7
            r6 = r6 & r7
            int r6 = r6 << 1
            int r8 = r8 + r6
            int r6 = r8 % 128
            ivas.gov.bisp.enumeration.p007ag.r.b = r6
            int r8 = r8 % 2
            r1[r4] = r2
            r2 = r4 & 2
            r4 = r4 | 2
            int r2 = r2 + r4
            r2 = r2 ^ (-1)
            int r4 = (-2) - r2
            r2 = r3 ^ 101(0x65, float:1.42E-43)
            r3 = r3 & 101(0x65, float:1.42E-43)
            int r3 = r3 << 1
            int r2 = r2 + r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p007ag.r.b = r3
            int r2 = r2 % 2
            goto L45
        L82:
            int r9 = ivas.gov.bisp.enumeration.p007ag.r.b
            r2 = r9 & 125(0x7d, float:1.75E-43)
            r9 = r9 ^ 125(0x7d, float:1.75E-43)
            r9 = r9 | r2
            int r9 = -r9
            int r9 = -r9
            r3 = r2 | r9
            int r3 = r3 << 1
            r9 = r9 ^ r2
            int r3 = r3 - r9
            int r9 = r3 % 128
            ivas.gov.bisp.enumeration.p007ag.r.a = r9
            int r3 = r3 % r0
            if (r3 == 0) goto L99
            return r1
        L99:
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p007ag.r.f(ivas.gov.bisp.enumeration.ag.r$aVv[]):ivas.gov.bisp.enumeration.ag.r$aVv[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Path e(String str) {
        int i = 2 % 2;
        Path path = new Path();
        aVv[] avvArrD = d(str);
        if (avvArrD == null) {
            int i2 = a;
            int i3 = (i2 & 13) + (i2 | 13);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i4 = b;
        int i5 = (i4 | 1) << 1;
        int i6 = -(((~i4) & 1) | (i4 & (-2)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        try {
            if (i7 % 2 == 0) {
                aVv.e(avvArrD, path);
                str = 57 / 0;
            } else {
                aVv.e(avvArrD, path);
                str = str;
            }
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(j.r("Error in parsing ", str), e);
        }
    }

    public static class aVv {
        private static int a = 0;
        private static int b = 1;
        public char c;
        public float[] d;

        public aVv(char c, float[] fArr) {
            this.c = c;
            this.d = fArr;
        }

        public aVv(aVv avv) {
            this.c = avv.c;
            float[] fArr = avv.d;
            this.d = r.c(fArr, 0, fArr.length);
        }

        public static void d(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            double d8;
            double d9;
            boolean z3;
            double d10;
            double d11;
            double d12;
            double d13;
            double d14;
            double dSqrt;
            int i = 2 % 2;
            float f8 = f5;
            float f9 = f6;
            while (true) {
                double radians = Math.toRadians(f7);
                double dCos = Math.cos(radians);
                double dSin = Math.sin(radians);
                int i2 = a;
                int i3 = i2 & 111;
                int i4 = ((((i2 ^ 111) | i3) << 1) - (~(-((~i3) & (i2 | 111))))) - 1;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    double d15 = f2;
                    d4 = f8;
                    d = d15 * dSin;
                    d2 = f;
                    d3 = d15;
                } else {
                    double d16 = f2;
                    d = d16 * dSin;
                    d2 = f;
                    d3 = d16;
                    d4 = f8;
                }
                int i5 = i2 & 45;
                int i6 = (~i5) & (i2 | 45);
                int i7 = -(-(i5 << 1));
                int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    d5 = (d / (d2 * dCos)) % d4;
                    d6 = -f;
                    d7 = f9;
                } else {
                    d5 = (d + (d2 * dCos)) / d4;
                    d6 = -f;
                    d7 = f9;
                }
                double d17 = d6;
                double d18 = d5;
                double d19 = d7;
                double d20 = ((d3 * dCos) + (d17 * dSin)) / d19;
                double d21 = d2;
                double d22 = f4;
                int i9 = i2 + 27;
                b = i9 % 128;
                int i10 = i9 % 2;
                double d23 = ((d22 * dSin) + (((double) f3) * dCos)) / d4;
                double d24 = d22 * dCos;
                double d25 = -f3;
                int i11 = (((i2 ^ 97) | (i2 & 97)) << 1) - ((97 & (~i2)) | (i2 & (-98)));
                b = i11 % 128;
                double d26 = (i11 % 2 == 0 ? d24 % (d25 % dSin) : d24 + (d25 * dSin)) / d19;
                double d27 = d18 - d23;
                double d28 = d20 - d26;
                double d29 = (d18 + d23) / 2.0d;
                double d30 = (d20 + d26) / 2.0d;
                int i12 = ((((i2 ^ 63) | (i2 & 63)) << 1) - (~(-((i2 & (-64)) | ((~i2) & 63))))) - 1;
                int i13 = i12 % 128;
                b = i13;
                int i14 = i12 % 2;
                double d31 = (d28 * d28) + (d27 * d27);
                if (d31 == 0.0d) {
                    int i15 = i2 & 45;
                    int i16 = (~i15) & (i2 | 45);
                    int i17 = i15 << 1;
                    int i18 = (i16 & i17) + (i17 | i16);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    return;
                }
                double d32 = (1.0d / d31) - 0.25d;
                if (d32 >= 0.0d) {
                    double dSqrt2 = Math.sqrt(d32);
                    double d33 = d27 * dSqrt2;
                    int i20 = b;
                    int i21 = (-2) - (((i20 ^ 90) + ((i20 & 90) << 1)) ^ (-1));
                    int i22 = i21 % 128;
                    a = i22;
                    int i23 = i21 % 2;
                    double d34 = dSqrt2 * d28;
                    if (z == z2) {
                        int i24 = ((i20 | 71) << 1) - (((~i20) & 71) | (i20 & (-72)));
                        a = i24 % 128;
                        if (i24 % 2 != 0) {
                            d8 = d29 + d34;
                            d9 = d30 / d33;
                        } else {
                            d8 = d29 - d34;
                            d9 = d30 + d33;
                        }
                    } else {
                        d8 = d29 + d34;
                        d9 = d30 - d33;
                        int i25 = (i22 & 13) + (i22 | 13);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                    }
                    double dAtan2 = Math.atan2(d20 - d9, d18 - d8);
                    int i27 = a;
                    int i28 = i27 ^ 49;
                    int i29 = (((i27 & 49) | i28) << 1) - i28;
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    double dAtan3 = Math.atan2(d26 - d9, d23 - d8);
                    int i31 = b;
                    int i32 = ((i31 ^ 61) | (i31 & 61)) << 1;
                    int i33 = -((i31 & (-62)) | ((~i31) & 61));
                    int i34 = (i32 & i33) + (i32 | i33);
                    int i35 = i34 % 128;
                    a = i35;
                    int i36 = i34 % 2;
                    double d35 = dAtan3 - dAtan2;
                    if (d35 >= 0.0d) {
                        int i37 = i31 & 23;
                        int i38 = -(-((i31 ^ 23) | i37));
                        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                        a = i39 % 128;
                        int i40 = i39 % 2;
                        z3 = true;
                    } else {
                        int i41 = i35 + 21;
                        b = i41 % 128;
                        int i42 = i41 % 2;
                        z3 = false;
                    }
                    Object obj = null;
                    if (z2 != z3) {
                        int i43 = b;
                        int i44 = (i43 | 45) << 1;
                        int i45 = -((i43 & (-46)) | ((~i43) & 45));
                        int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                        int i47 = i46 % 128;
                        a = i47;
                        if (i46 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (d35 > 0.0d) {
                            int i48 = i47 + 47;
                            b = i48 % 128;
                            int i49 = i48 % 2;
                            d35 -= 6.283185307179586d;
                            int i50 = (i47 & (-102)) | ((~i47) & 101);
                            int i51 = -(-((i47 & 101) << 1));
                            int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                            b = i52 % 128;
                            int i53 = i52 % 2;
                        } else {
                            d35 += 6.283185307179586d;
                            int i54 = i43 & 53;
                            int i55 = (((i43 ^ 53) | i54) << 1) - ((i43 | 53) & (~i54));
                            a = i55 % 128;
                            int i56 = i55 % 2;
                        }
                    }
                    double d36 = d8 * d4;
                    double d37 = d9 * d19;
                    double d38 = d36 * dCos;
                    int i57 = a;
                    int i58 = i57 & 25;
                    int i59 = -(-((i57 ^ 25) | i58));
                    int i60 = (i58 & i59) + (i59 | i58);
                    b = i60 % 128;
                    if (i60 % 2 == 0) {
                        d10 = d38 * (d37 % dSin);
                        d11 = (d35 % 4.0d) * 3.141592653589793d;
                    } else {
                        d10 = d38 - (d37 * dSin);
                        d11 = (d35 * 4.0d) / 3.141592653589793d;
                    }
                    int iCeil = (int) Math.ceil(Math.abs(d11));
                    int i61 = a;
                    int i62 = i61 & 57;
                    int i63 = ((i61 ^ 57) | i62) << 1;
                    int i64 = -((i61 | 57) & (~i62));
                    int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                    b = i65 % 128;
                    int i66 = i65 % 2;
                    double dCos2 = Math.cos(radians);
                    double dSin2 = Math.sin(radians);
                    double dCos3 = Math.cos(dAtan2);
                    int i67 = a + 99;
                    b = i67 % 128;
                    int i68 = i67 % 2;
                    double dSin3 = Math.sin(dAtan2);
                    double d39 = -d4;
                    double d40 = d39 * dCos2;
                    double d41 = d19 * dSin2;
                    int i69 = b;
                    int i70 = i69 & 1;
                    int i71 = i70 + ((i69 ^ 1) | i70);
                    a = i71 % 128;
                    int i72 = i71 % 2;
                    double d42 = (d40 * dSin3) - (d41 * dCos3);
                    double d43 = d39 * dSin2;
                    int i73 = i69 + 85;
                    int i74 = i73 % 128;
                    a = i74;
                    int i75 = i73 % 2;
                    double d44 = d19 * dCos2;
                    double d45 = (dCos3 * d44) + (dSin3 * d43);
                    int i76 = (-2) - ((((i74 | 44) << 1) - (i74 ^ 44)) ^ (-1));
                    b = i76 % 128;
                    int i77 = i76 % 2;
                    double d46 = d35 / ((double) iCeil);
                    int i78 = i74 ^ 45;
                    int i79 = ((i74 & 45) | i78) << 1;
                    int i80 = -i78;
                    int i81 = (i79 & i80) + (i80 | i79);
                    b = i81 % 128;
                    if (i81 % 2 == 0) {
                        throw null;
                    }
                    double d47 = dAtan2;
                    double d48 = d45;
                    int i82 = 0;
                    double d49 = d3;
                    double d50 = d42;
                    while (i82 < iCeil) {
                        int i83 = (-2) - ((a + 58) ^ (-1));
                        int i84 = iCeil;
                        b = i83 % 128;
                        int i85 = i83 % 2;
                        double d51 = d47 + d46;
                        double dSin4 = Math.sin(d51);
                        double dCos4 = Math.cos(d51);
                        int i86 = b;
                        int i87 = i86 & 125;
                        int i88 = (i86 ^ 125) | i87;
                        int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
                        double d52 = d46;
                        a = i89 % 128;
                        int i90 = i89 % 2;
                        double d53 = (((d4 * dCos2) * dCos4) + d10) - (d41 * dSin4);
                        double d54 = d44 * dSin4;
                        double d55 = d4 * dSin2 * dCos4;
                        double d56 = d37 * dCos;
                        int i91 = i86 + 63;
                        a = i91 % 128;
                        if (i91 % 2 != 0) {
                            d12 = d54 / (d55 % (d56 + (d36 * dSin)));
                            d13 = d40 + dSin4 + (d41 % dCos4);
                            d14 = (dCos4 % d44) / (dSin4 - d43);
                        } else {
                            d12 = d54 + d55 + d56 + (d36 * dSin);
                            d13 = (d40 * dSin4) - (d41 * dCos4);
                            d14 = (dCos4 * d44) + (dSin4 * d43);
                        }
                        double d57 = d43;
                        double d58 = d12;
                        double d59 = d51 - d47;
                        double dTan = Math.tan(d59 / 2.0d);
                        double dSin5 = Math.sin(d59);
                        int i92 = a;
                        double d60 = d10;
                        int i93 = ((i92 ^ 116) + ((i92 & 116) << 1)) - 1;
                        b = i93 % 128;
                        if (i93 % 2 == 0) {
                            dSqrt = ((Math.sqrt(((dTan / 3.0d) - dTan) * 4.0d) - 1.0d) % dSin5) + 3.0d;
                            path.rLineTo(1.0f, 0.0f);
                        } else {
                            dSqrt = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * dSin5) / 3.0d;
                            path.rLineTo(0.0f, 0.0f);
                        }
                        float f10 = (float) ((d50 * dSqrt) + d21);
                        float f11 = (float) ((d48 * dSqrt) + d49);
                        double d61 = d4;
                        float f12 = (float) (d53 - (dSqrt * d13));
                        int i94 = a;
                        int i95 = ((i94 ^ 113) | (i94 & 113)) << 1;
                        int i96 = -((i94 & (-114)) | ((~i94) & 113));
                        int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                        b = i97 % 128;
                        path.cubicTo(f10, f11, f12, (float) (d58 - (i97 % 2 == 0 ? dSqrt % d14 : dSqrt * d14)), (float) d53, (float) d58);
                        int i98 = (i82 & 59) + (i82 | 59);
                        i82 = ((i98 | (-58)) << 1) - (i98 ^ (-58));
                        int i99 = b;
                        int i100 = i99 & 77;
                        int i101 = (i99 | 77) & (~i100);
                        int i102 = i100 << 1;
                        int i103 = ((i101 | i102) << 1) - (i101 ^ i102);
                        a = i103 % 128;
                        int i104 = i103 % 2;
                        d21 = d53;
                        d4 = d61;
                        iCeil = i84;
                        d47 = d51;
                        d48 = d14;
                        d50 = d13;
                        d10 = d60;
                        d46 = d52;
                        d49 = d58;
                        d43 = d57;
                    }
                    int i105 = b + 77;
                    a = i105 % 128;
                    int i106 = i105 % 2;
                    return;
                }
                int i107 = (((i13 ^ 65) | (i13 & 65)) << 1) - ((i13 & (-66)) | ((~i13) & 65));
                a = i107 % 128;
                int i108 = i107 % 2;
                float fSqrt = (float) (Math.sqrt(d31) / 1.99999d);
                int i109 = b;
                int i110 = i109 & 3;
                int i111 = -(-(i109 | 3));
                int i112 = (i110 & i111) + (i111 | i110);
                int i113 = i112 % 128;
                a = i113;
                f8 = i112 % 2 != 0 ? f8 / fSqrt : f8 * fSqrt;
                f9 *= fSqrt;
                int i114 = i113 + 121;
                int i115 = i114 % 128;
                b = i115;
                int i116 = i114 % 2;
                int i117 = i115 + 97;
                a = i117 % 128;
                int i118 = i117 % 2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:104:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:155:0x0458  */
        /* JADX WARN: Code duplicated, block: B:21:0x008f A[PHI: r1 r7
  0x008f: PHI (r1v173 float) = (r1v20 float), (r1v179 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r7v112 float) = (r7v3 float), (r7v113 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:263:0x046c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:26:0x00b1 A[PHI: r1 r7
  0x00b1: PHI (r1v172 float) = (r1v20 float), (r1v179 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r7v111 float) = (r7v3 float), (r7v113 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x00b4 A[PHI: r1 r7
  0x00b4: PHI (r1v24 float) = (r1v20 float), (r1v179 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r7v7 float) = (r7v3 float), (r7v113 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x00b6 A[PHI: r1 r7
  0x00b6: PHI (r1v23 float) = (r1v20 float), (r1v179 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00b6: PHI (r7v6 float) = (r7v3 float), (r7v113 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[PHI: r1 r7
  0x00b8: PHI (r1v22 float) = (r1v20 float), (r1v179 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00b8: PHI (r7v5 float) = (r7v3 float), (r7v113 float) binds: [B:23:0x0095, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00bd A[FALL_THROUGH, PHI: r1 r3 r4 r5 r6 r7
  0x00bd: PHI (r1v21 float) = (r1v20 float), (r1v178 float), (r1v179 float) binds: [B:23:0x0095, B:25:0x0099, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r3v13 float) = (r3v12 float), (r3v177 float), (r3v12 float) binds: [B:23:0x0095, B:25:0x0099, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r4v12 float) = (r4v11 float), (r4v226 float), (r4v11 float) binds: [B:23:0x0095, B:25:0x0099, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r5v2 float) = (r5v1 float), (r5v110 float), (r5v1 float) binds: [B:23:0x0095, B:25:0x0099, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r6v1 float) = (r6v0 float), (r6v96 float), (r6v0 float) binds: [B:23:0x0095, B:25:0x0099, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r7v4 float) = (r7v3 float), (r7v112 float), (r7v113 float) binds: [B:23:0x0095, B:25:0x0099, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
        public static void e(aVv[] avvArr, Path path) {
            char c;
            float[] fArr;
            int i;
            float[] fArr2;
            float f;
            float f2;
            float f3;
            float f4;
            int i2;
            int i3;
            float f5;
            int i4;
            boolean z;
            float f6;
            float f7;
            float f8;
            int i5;
            int i6;
            int i7;
            boolean z2;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            int i8;
            float f16;
            int i9;
            float f17;
            float f18;
            float f19;
            int i10;
            int i11;
            float f20;
            int i12;
            char c2;
            float f21;
            int i13;
            float f22;
            int i14;
            float f23;
            float f24;
            int i15;
            float f25;
            float f26;
            float f27;
            int i16;
            float f28;
            float f29;
            int i17 = 2;
            int i18 = 2 % 2;
            int i19 = a;
            int i20 = 1;
            int i21 = (i19 | 35) << 1;
            int i22 = -(((~i19) & 35) | (i19 & (-36)));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            b = i23 % 128;
            char c3 = 0;
            if (i23 % 2 == 0) {
                c = 19;
                fArr = new float[119];
                i = 1;
            } else {
                c = 'm';
                fArr = new float[6];
                i = 0;
            }
            int i24 = i;
            while (i24 < avvArr.length) {
                int i25 = a;
                int i26 = i25 ^ 19;
                int i27 = ((((i25 & 19) | i26) << i20) - (~(-i26))) - i20;
                b = i27 % 128;
                Object obj = null;
                if (i27 % i17 == 0) {
                    char c4 = avvArr[i24].c;
                    obj.hashCode();
                    throw null;
                }
                aVv avv = avvArr[i24];
                char c5 = avv.c;
                int i28 = (i25 ^ 61) + ((i25 & 61) << i20);
                int i29 = i28 % 128;
                b = i29;
                if (i28 % i17 == 0) {
                    fArr2 = avv.d;
                    f = fArr[i20];
                    f2 = fArr[c3];
                } else {
                    fArr2 = avv.d;
                    f = fArr[c3];
                    f2 = fArr[i20];
                }
                float[] fArr3 = fArr2;
                float f30 = fArr[i17];
                float f31 = fArr[3];
                int i30 = i29 & 25;
                int i31 = ((i29 | 25) & (~i30)) + (i30 << i20);
                a = i31 % 128;
                if (i31 % i17 == 0) {
                    f3 = fArr[4];
                    f4 = fArr[5];
                    switch (c5) {
                        case 'A':
                        case 'a':
                            i2 = 7;
                            break;
                        case 'C':
                        case 'c':
                            i2 = 6;
                            break;
                        case 'H':
                        case 'V':
                        case 'h':
                        case 'v':
                            i2 = i20;
                            break;
                        case 'Q':
                        case 'S':
                        case 'q':
                        case 's':
                            i2 = 4;
                            break;
                        case 'Z':
                        case 'z':
                            f30 = f3;
                            path.close();
                            path.moveTo(f30, f4);
                            int i32 = a;
                            int i33 = (i32 ^ 121) + ((i32 & 121) << i20);
                            b = i33 % 128;
                            int i34 = i33 % i17;
                            f3 = f30;
                            f = f3;
                            f2 = f4;
                            f31 = f2;
                        default:
                            int i35 = a;
                            int i36 = ((i35 & 116) + (i35 | 116)) - 1;
                            b = i36 % 128;
                            int i37 = i36 % i17;
                            i2 = i17;
                            break;
                    }
                } else {
                    f3 = fArr[4];
                    f4 = f30;
                    switch (c5) {
                        case 'A':
                        case 'a':
                            i2 = 7;
                            break;
                        case 'C':
                        case 'c':
                            i2 = 6;
                            break;
                        case 'H':
                        case 'V':
                        case 'h':
                        case 'v':
                            i2 = i20;
                            break;
                        case 'Q':
                        case 'S':
                        case 'q':
                        case 's':
                            i2 = 4;
                            break;
                        case 'Z':
                        case 'z':
                            f30 = f3;
                            path.close();
                            path.moveTo(f30, f4);
                            int i38 = a;
                            int i39 = (i38 ^ 121) + ((i38 & 121) << i20);
                            b = i39 % 128;
                            int i310 = i39 % i17;
                            f3 = f30;
                            f = f3;
                            f2 = f4;
                            f31 = f2;
                        default:
                            int i311 = a;
                            int i312 = ((i311 & 116) + (i311 | 116)) - 1;
                            b = i312 % 128;
                            int i313 = i312 % i17;
                            i2 = i17;
                            break;
                    }
                }
                float f32 = f3;
                float f33 = f31;
                float f34 = f4;
                float f35 = f;
                float f36 = f2;
                int i40 = 0;
                while (i40 < fArr3.length) {
                    if (c5 != 'A') {
                        if (c5 != 'C') {
                            if (c5 != 'H') {
                                if (c5 != 'Q') {
                                    int i41 = a;
                                    int i42 = i41 ^ 97;
                                    int i43 = -(-((i41 & 97) << 1));
                                    int i44 = (i42 & i43) + (i42 | i43);
                                    int i45 = i44 % 128;
                                    b = i45;
                                    if (i44 % 2 != 0 ? c5 == 'V' : c5 == '4') {
                                        i3 = i40;
                                        fArr3 = fArr3;
                                        c5 = c5;
                                        i24 = i24;
                                        i2 = i2;
                                        f32 = f32;
                                        float f37 = f35;
                                        path.lineTo(f37, fArr3[i3]);
                                        f36 = fArr3[i3];
                                        int i46 = a;
                                        int i47 = i46 ^ 53;
                                        int i48 = (((i46 & 53) | i47) << 1) - i47;
                                        b = i48 % 128;
                                        int i49 = i48 % 2;
                                        f35 = f37;
                                    } else if (c5 != 'a') {
                                        if (c5 != 'c') {
                                            int i50 = i41 & 115;
                                            int i51 = -(-((i41 ^ 115) | i50));
                                            int i52 = (i50 & i51) + (i51 | i50);
                                            int i53 = i52 % 128;
                                            b = i53;
                                            if (i52 % 2 != 0 ? c5 == 'h' : c5 == 'I') {
                                                i3 = i40;
                                                int i54 = i24;
                                                float f38 = f32;
                                                float f39 = f35;
                                                float f40 = f36;
                                                int i55 = (-1) - (~(-(-i3)));
                                                path.rLineTo(fArr3[i55], 0.0f);
                                                f22 = fArr3[i55] + f39;
                                                f36 = f40;
                                                i24 = i54;
                                                f32 = f38;
                                            } else if (c5 != 'q') {
                                                int i56 = i53 & 33;
                                                int i57 = i56 + ((i53 ^ 33) | i56);
                                                int i58 = i57 % 128;
                                                a = i58;
                                                if (i57 % 2 == 0 ? c5 == 'v' : c5 == 'x') {
                                                    i3 = i40;
                                                    i24 = i24;
                                                    f29 = f35;
                                                    int i59 = i3 << 1;
                                                    int i60 = -i3;
                                                    int i61 = (i59 & i60) + (i59 | i60);
                                                    path.rLineTo(0.0f, fArr3[i61]);
                                                    f28 = fArr3[i61];
                                                } else {
                                                    if (c5 != 'L') {
                                                        int i62 = i58 | 41;
                                                        int i63 = i62 << 1;
                                                        int i64 = -((~(i58 & 41)) & i62);
                                                        int i65 = (i63 & i64) + (i63 | i64);
                                                        int i66 = i65 % 128;
                                                        b = i66;
                                                        int i67 = i65 % 2;
                                                        if (c5 != 'M') {
                                                            int i68 = i58 & 21;
                                                            int i69 = -(-((i58 ^ 21) | i68));
                                                            int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
                                                            int i71 = i70 % 128;
                                                            b = i71;
                                                            int i72 = i70 % 2;
                                                            i24 = i24;
                                                            if (c5 == 'S') {
                                                                i3 = i40;
                                                                f32 = f32;
                                                                float f41 = f35;
                                                                float f42 = f36;
                                                                if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                                                    float f43 = (f42 * 2.0f) - f33;
                                                                    float f44 = (f41 * 2.0f) - f30;
                                                                    int i73 = i71 & 41;
                                                                    int i74 = i73 + ((i71 ^ 41) | i73);
                                                                    a = i74 % 128;
                                                                    if (i74 % 2 != 0) {
                                                                        obj.hashCode();
                                                                        throw null;
                                                                    }
                                                                    f18 = f43;
                                                                    f19 = f44;
                                                                } else {
                                                                    int i75 = i58 & 5;
                                                                    int i76 = (~i75) & (i58 | 5);
                                                                    int i77 = i75 << 1;
                                                                    int i78 = (i76 & i77) + (i77 | i76);
                                                                    b = i78 % 128;
                                                                    int i79 = i78 % 2;
                                                                    f18 = f42;
                                                                    f19 = f41;
                                                                }
                                                                float f45 = fArr3[i3];
                                                                int i80 = a;
                                                                int i81 = i80 & 105;
                                                                int i82 = (i80 ^ 105) | i81;
                                                                int i83 = (i81 & i82) + (i82 | i81);
                                                                int i84 = i83 % 128;
                                                                b = i84;
                                                                if (i83 % 2 == 0) {
                                                                    i11 = i3 / 0;
                                                                    i10 = 1;
                                                                } else {
                                                                    int i85 = i3 & 1;
                                                                    i10 = 1;
                                                                    int i86 = ((i3 ^ 1) | i85) << 1;
                                                                    int i87 = -((~i85) & (i3 | 1));
                                                                    i11 = ((i86 | i87) << 1) - (i86 ^ i87);
                                                                }
                                                                float f46 = fArr3[i11];
                                                                int i88 = ((i3 ^ 2) | (i3 & 2)) << i10;
                                                                int i89 = ~i3;
                                                                int i90 = -((i3 & (-3)) | (2 & i89));
                                                                int i91 = (i88 & i90) + (i88 | i90);
                                                                int i92 = ((i84 ^ 113) | (i84 & 113)) << 1;
                                                                int i93 = -((113 & (~i84)) | (i84 & (-114)));
                                                                int i94 = (i92 & i93) + (i93 | i92);
                                                                a = i94 % 128;
                                                                if (i94 % 2 != 0) {
                                                                    f20 = fArr3[i91];
                                                                    int i95 = (i3 & (-108)) | (i89 & 107);
                                                                    int i96 = -(-((i3 & 107) << 1));
                                                                    i12 = ((i95 | i96) << 1) - (i95 ^ i96);
                                                                } else {
                                                                    f20 = fArr3[i91];
                                                                    int i97 = i3 & 3;
                                                                    int i98 = ((i3 ^ 3) | i97) << 1;
                                                                    int i99 = -((~i97) & (i3 | 3));
                                                                    i12 = (i98 & i99) + (i98 | i99);
                                                                }
                                                                path.cubicTo(f19, f18, f45, f46, f20, fArr3[i12]);
                                                                float f47 = fArr3[i3];
                                                                float f48 = fArr3[i11];
                                                                f35 = fArr3[i91];
                                                                f36 = fArr3[i12];
                                                                f30 = f47;
                                                                f33 = f48;
                                                            } else if (c5 != 'T') {
                                                                int i100 = i58 & 25;
                                                                int i101 = i58 | 25;
                                                                int i102 = (i100 ^ i101) + ((i100 & i101) << 1);
                                                                int i103 = i102 % 128;
                                                                b = i103;
                                                                if (i102 % 2 != 0 ? c5 == 'l' : c5 == '\'') {
                                                                    i3 = i40;
                                                                    float f49 = f35;
                                                                    int i104 = i3 << 1;
                                                                    int i105 = -i3;
                                                                    int i106 = ((i104 | i105) << 1) - (i104 ^ i105);
                                                                    int i107 = i103 & 9;
                                                                    int i108 = ((i103 ^ 9) | i107) << 1;
                                                                    int i109 = -((~i107) & (i103 | 9));
                                                                    int i110 = ((i108 | i109) << 1) - (i108 ^ i109);
                                                                    a = i110 % 128;
                                                                    if (i110 % 2 != 0) {
                                                                        f27 = fArr3[i106];
                                                                        i16 = (i3 ^ 30) + ((i3 & 30) << 1);
                                                                    } else {
                                                                        f27 = fArr3[i106];
                                                                        int i111 = ((i3 | (-65)) << 1) - (i3 ^ (-65));
                                                                        i16 = ((i111 & 66) << 1) + (i111 ^ 66);
                                                                    }
                                                                    path.rLineTo(f27, fArr3[i16]);
                                                                    float f50 = fArr3[i106] + f49;
                                                                    int i112 = a;
                                                                    int i113 = (i112 & 41) + (i112 | 41);
                                                                    b = i113 % 128;
                                                                    int i114 = i113 % 2;
                                                                    f28 = fArr3[i16];
                                                                    f29 = f50;
                                                                } else if (c5 != 'm') {
                                                                    int i115 = i58 + 105;
                                                                    int i116 = i115 % 128;
                                                                    b = i116;
                                                                    if (i115 % 2 != 0 ? c5 == 's' : c5 == '+') {
                                                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                                                            f25 = f35 - f30;
                                                                            int i117 = i116 & 113;
                                                                            int i118 = (((i116 ^ 113) | i117) << 1) - ((i116 | 113) & (~i117));
                                                                            a = i118 % 128;
                                                                            int i119 = i118 % 2;
                                                                            f26 = f36 - f33;
                                                                        } else {
                                                                            int i120 = (i116 ^ 11) + ((i116 & 11) << 1);
                                                                            a = i120 % 128;
                                                                            if (i120 % 2 != 0) {
                                                                                f26 = 1.0f;
                                                                                f25 = 0.0f;
                                                                            } else {
                                                                                f25 = 0.0f;
                                                                                f26 = 0.0f;
                                                                            }
                                                                        }
                                                                        int i121 = i40 << 1;
                                                                        int i122 = -i40;
                                                                        int i123 = ((i121 | i122) << 1) - (i121 ^ i122);
                                                                        float f51 = fArr3[i123];
                                                                        int i124 = i40 + 1;
                                                                        float f52 = fArr3[i124];
                                                                        float f53 = f36;
                                                                        int i125 = ((i40 & (-3)) | (2 & (~i40))) + ((i40 & 2) << 1);
                                                                        int i126 = a;
                                                                        int i127 = i126 & 95;
                                                                        float f54 = f35;
                                                                        int i128 = (((i126 | 95) & (~i127)) - (~(i127 << 1))) - 1;
                                                                        b = i128 % 128;
                                                                        int i129 = i128 % 2;
                                                                        int i130 = (i40 & 3) + (i40 | 3);
                                                                        i3 = i40;
                                                                        path.rCubicTo(f25, f26, f51, f52, fArr3[i125], fArr3[i130]);
                                                                        f14 = fArr3[i123] + f54;
                                                                        f15 = fArr3[i124] + f53;
                                                                        f35 = f54 + fArr3[i125];
                                                                        int i131 = a;
                                                                        int i132 = ((i131 & 36) + (i131 | 36)) - 1;
                                                                        b = i132 % 128;
                                                                        if (i132 % 2 == 0) {
                                                                            f13 = fArr3[i130];
                                                                            int i133 = 75 / 0;
                                                                        } else {
                                                                            f13 = fArr3[i130];
                                                                        }
                                                                        f9 = f53;
                                                                    } else {
                                                                        if (c5 == 't') {
                                                                            if (c == 'q' || c == 't') {
                                                                                f23 = f35 - f30;
                                                                                f24 = f36 - f33;
                                                                            } else {
                                                                                int i134 = i116 & 113;
                                                                                int i135 = ((i116 | 113) & (~i134)) + (i134 << 1);
                                                                                a = i135 % 128;
                                                                                int i136 = i135 % 2;
                                                                                if (c == 'Q' || c == 'T') {
                                                                                    f23 = f35 - f30;
                                                                                    f24 = f36 - f33;
                                                                                } else {
                                                                                    f24 = 0.0f;
                                                                                    f23 = 0.0f;
                                                                                }
                                                                            }
                                                                            int i137 = (-1) - (~(-(-i40)));
                                                                            float f55 = fArr3[i137];
                                                                            int i138 = a;
                                                                            int i139 = i138 & 99;
                                                                            int i140 = i138 | 99;
                                                                            int i141 = ((i139 | i140) << 1) - (i140 ^ i139);
                                                                            b = i141 % 128;
                                                                            if (i141 % 2 == 0) {
                                                                                i15 = i40 >> 1;
                                                                                path.rQuadTo(f23, f24, f55, fArr3[i15]);
                                                                            } else {
                                                                                int i142 = (i40 & (-2)) | ((~i40) & 1);
                                                                                int i143 = -(-((i40 & 1) << 1));
                                                                                i15 = ((i142 | i143) << 1) - (i142 ^ i143);
                                                                                path.rQuadTo(f23, f24, f55, fArr3[i15]);
                                                                            }
                                                                            float f56 = fArr3[i137] + f35;
                                                                            float f57 = fArr3[i15] + f36;
                                                                            f33 = f24 + f36;
                                                                            float f58 = f23 + f35;
                                                                            f35 = f56;
                                                                            f36 = f57;
                                                                            f30 = f58;
                                                                        }
                                                                        i3 = i40;
                                                                    }
                                                                } else {
                                                                    i3 = i40;
                                                                    float f59 = f32;
                                                                    float f60 = fArr3[(-2) - (((i3 & 1) + (i3 | 1)) ^ (-1))];
                                                                    f35 += f60;
                                                                    float f61 = fArr3[(-2) - ((((i3 | 2) << 1) - (i3 ^ 2)) ^ (-1))];
                                                                    f36 += f61;
                                                                    if (i3 > 0) {
                                                                        int i144 = i58 | 63;
                                                                        int i145 = (i144 << 1) - (i144 & (~(i58 & 63)));
                                                                        b = i145 % 128;
                                                                        if (i145 % 2 == 0) {
                                                                            path.rLineTo(f60, f61);
                                                                            obj.hashCode();
                                                                            throw null;
                                                                        }
                                                                        path.rLineTo(f60, f61);
                                                                        int i146 = b;
                                                                        int i147 = ((i146 ^ 31) - (~((i146 & 31) << 1))) - 1;
                                                                        a = i147 % 128;
                                                                        int i148 = i147 % 2;
                                                                        f32 = f59;
                                                                    } else {
                                                                        path.rMoveTo(f60, f61);
                                                                        int i149 = a;
                                                                        int i150 = (i149 & 63) + (i149 | 63);
                                                                        b = i150 % 128;
                                                                        int i151 = i150 % 2;
                                                                        f34 = f36;
                                                                        f32 = f35;
                                                                        fArr3 = fArr3;
                                                                        c5 = c5;
                                                                        i2 = i2;
                                                                        i24 = i24;
                                                                    }
                                                                }
                                                            } else {
                                                                i3 = i40;
                                                                float f62 = f32;
                                                                float f63 = f35;
                                                                float f64 = f36;
                                                                if (c != 'q') {
                                                                    int i152 = i71 & 33;
                                                                    int i153 = (~i152) & (i71 | 33);
                                                                    int i154 = -(-(i152 << 1));
                                                                    int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                                                                    a = i155 % 128;
                                                                    int i156 = i155 % 2;
                                                                    c2 = 't';
                                                                    if (c != 't' && c != 'Q' && c != 'T') {
                                                                        f33 = f64;
                                                                        f21 = f63;
                                                                    }
                                                                    int i157 = i3 + 1;
                                                                    int i158 = (i157 ^ (-1)) + (i157 << 1);
                                                                    float f65 = fArr3[i158];
                                                                    int i159 = ((((i3 ^ (-18)) | (i3 & (-18))) << 1) - (~(-((i3 & 17) | ((~i3) & (-18)))))) - 1;
                                                                    i13 = ((i159 & 20) + (i159 | 20)) - 1;
                                                                    path.quadTo(f21, f33, f65, fArr3[i13]);
                                                                    f22 = fArr3[i158];
                                                                    int i160 = b;
                                                                    int i161 = (i160 & (-116)) | ((~i160) & 115);
                                                                    int i162 = -(-((i160 & 115) << 1));
                                                                    i14 = (i161 ^ i162) + ((i162 & i161) << 1);
                                                                    a = i14 % 128;
                                                                    if (i14 % 2 == 0) {
                                                                        float f66 = fArr3[i13];
                                                                        throw null;
                                                                    }
                                                                    i24 = i24;
                                                                    f32 = f62;
                                                                    f36 = fArr3[i13];
                                                                    f30 = f21;
                                                                } else {
                                                                    c2 = 't';
                                                                }
                                                                int i163 = a;
                                                                int i164 = (i163 ^ 41) + ((i163 & 41) << 1);
                                                                b = i164 % 128;
                                                                int i165 = i164 % 2;
                                                                f33 = (f64 * 2.0f) - f33;
                                                                f21 = (f63 * 2.0f) - f30;
                                                                int i1510 = i3 + 1;
                                                                int i1511 = (i1510 ^ (-1)) + (i1510 << 1);
                                                                float f67 = fArr3[i1511];
                                                                int i1512 = ((((i3 ^ (-18)) | (i3 & (-18))) << 1) - (~(-((i3 & 17) | ((~i3) & (-18)))))) - 1;
                                                                i13 = ((i1512 & 20) + (i1512 | 20)) - 1;
                                                                path.quadTo(f21, f33, f67, fArr3[i13]);
                                                                f22 = fArr3[i1511];
                                                                int i166 = b;
                                                                int i167 = (i166 & (-116)) | ((~i166) & 115);
                                                                int i168 = -(-((i166 & 115) << 1));
                                                                i14 = (i167 ^ i168) + ((i168 & i167) << 1);
                                                                a = i14 % 128;
                                                                if (i14 % 2 == 0) {
                                                                    float f68 = fArr3[i13];
                                                                    throw null;
                                                                }
                                                                i24 = i24;
                                                                f32 = f62;
                                                                f36 = fArr3[i13];
                                                                f30 = f21;
                                                            }
                                                        } else {
                                                            i3 = i40;
                                                            i24 = i24;
                                                            f32 = f32;
                                                            f35 = fArr3[i3];
                                                            f36 = fArr3[(-2) - ((((i3 | 2) << 1) - (i3 ^ 2)) ^ (-1))];
                                                            if (i3 > 0) {
                                                                int i169 = i66 + 29;
                                                                a = i169 % 128;
                                                                if (i169 % 2 != 0) {
                                                                    path.lineTo(f35, f36);
                                                                    int i170 = 21 / 0;
                                                                } else {
                                                                    path.lineTo(f35, f36);
                                                                }
                                                            } else {
                                                                path.moveTo(f35, f36);
                                                                int i171 = a;
                                                                int i172 = i171 & 23;
                                                                int i173 = (i171 ^ 23) | i172;
                                                                int i174 = (i172 ^ i173) + ((i173 & i172) << 1);
                                                                b = i174 % 128;
                                                                if (i174 % 2 == 0) {
                                                                    int i175 = 76 / 0;
                                                                }
                                                                f34 = f36;
                                                                f32 = f35;
                                                                fArr3 = fArr3;
                                                                c5 = c5;
                                                                i2 = i2;
                                                                i24 = i24;
                                                            }
                                                        }
                                                    } else {
                                                        i3 = i40;
                                                        i24 = i24;
                                                        f32 = f32;
                                                        int i176 = i3 << 1;
                                                        int i177 = -i3;
                                                        int i178 = (i176 & i177) + (i176 | i177);
                                                        float f69 = fArr3[i178];
                                                        int i179 = i3 & (-8);
                                                        int i180 = (i3 ^ (-8)) | i179;
                                                        int i181 = ((i179 | i180) << 1) - (i179 ^ i180);
                                                        int i182 = ((((i181 ^ 9) | (i181 & 9)) << 1) - (~(-((i181 & (-10)) | ((~i181) & 9))))) - 1;
                                                        path.lineTo(f69, fArr3[i182]);
                                                        f35 = fArr3[i178];
                                                        f36 = fArr3[i182];
                                                    }
                                                    i2 = i2;
                                                    i24 = i24;
                                                    f32 = f32;
                                                }
                                                f36 += f28;
                                                int i183 = a;
                                                int i184 = i183 & 11;
                                                int i185 = -(-((i183 ^ 11) | i184));
                                                int i186 = (i184 & i185) + (i185 | i184);
                                                b = i186 % 128;
                                                int i187 = i186 % 2;
                                                i2 = i2;
                                                f35 = f29;
                                                i24 = i24;
                                                f32 = f32;
                                            } else {
                                                i3 = i40;
                                                i24 = i24;
                                                float f70 = f35;
                                                float f71 = f36;
                                                float f72 = fArr3[i3];
                                                int i188 = (((i53 ^ 91) | (i53 & 91)) << 1) - ((i53 & (-92)) | ((~i53) & 91));
                                                a = i188 % 128;
                                                int i189 = i188 % 2;
                                                int i190 = i3 + 1;
                                                float f73 = fArr3[i190];
                                                int i191 = (i53 & 77) + (i53 | 77);
                                                a = i191 % 128;
                                                if (i191 % 2 != 0) {
                                                    i8 = i3 >>> 4;
                                                    f16 = fArr3[i8];
                                                    int i192 = ((i3 ^ 157) - (~((i3 & 157) << 1))) - 1;
                                                    int i193 = i192 & (-42);
                                                    int i194 = (i192 ^ (-42)) | i193;
                                                    i9 = ((i193 | i194) << 1) - (i194 ^ i193);
                                                } else {
                                                    int i195 = i3 & 2;
                                                    i8 = (((~i195) & (i3 | 2)) - (~(-(-(i195 << 1))))) - 1;
                                                    f16 = fArr3[i8];
                                                    i9 = i3 + 3;
                                                }
                                                path.rQuadTo(f72, f73, f16, fArr3[i9]);
                                                f14 = fArr3[i3] + f70;
                                                float f74 = fArr3[i190];
                                                int i196 = b;
                                                int i197 = (i196 ^ 75) + ((i196 & 75) << 1);
                                                a = i197 % 128;
                                                if (i197 % 2 != 0) {
                                                    f15 = f74 % f71;
                                                    f17 = fArr3[i8];
                                                } else {
                                                    f15 = f74 + f71;
                                                    f17 = fArr3[i8];
                                                }
                                                f9 = f71;
                                                f35 = f17 + f70;
                                                f13 = fArr3[i9];
                                            }
                                            f35 = f22;
                                        } else {
                                            i3 = i40;
                                            i24 = i24;
                                            float f75 = f35;
                                            float f76 = f36;
                                            int i198 = i3 + 1;
                                            float f77 = fArr3[(i198 ^ (-1)) + (i198 << 1)];
                                            int i199 = i3 & 1;
                                            float f78 = fArr3[(((~i199) & (i3 | 1)) - (~(i199 << 1))) - 1];
                                            int i200 = ~i3;
                                            int i201 = (i3 & (-3)) | (2 & i200);
                                            int i202 = (i3 & 2) << 1;
                                            int i203 = ((i201 | i202) << 1) - (i201 ^ i202);
                                            float f79 = fArr3[i203];
                                            int i204 = (-2) - (((i3 & 4) + (i3 | 4)) ^ (-1));
                                            float f80 = fArr3[i204];
                                            int i205 = (i3 | 4) << 1;
                                            int i206 = -((i3 & (-5)) | (i200 & 4));
                                            int i207 = (i205 ^ i206) + ((i205 & i206) << 1);
                                            float f81 = fArr3[i207];
                                            int i208 = (i3 & (-95)) | (i200 & 94);
                                            int i209 = (i3 & 94) << 1;
                                            int i210 = ((i208 | i209) << 1) - (i208 ^ i209);
                                            int i211 = i210 & (-89);
                                            int i212 = (~i211) & (i210 | (-89));
                                            int i213 = i211 << 1;
                                            int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
                                            int i215 = i45 & 49;
                                            int i216 = (i45 ^ 49) | i215;
                                            int i217 = (i215 & i216) + (i215 | i216);
                                            a = i217 % 128;
                                            int i218 = i217 % 2;
                                            f9 = f76;
                                            path.rCubicTo(f77, f78, f79, f80, f81, fArr3[i214]);
                                            int i219 = a;
                                            int i220 = i219 & 89;
                                            int i221 = (i219 ^ 89) | i220;
                                            int i222 = (i220 & i221) + (i221 | i220);
                                            int i223 = i222 % 128;
                                            b = i223;
                                            if (i222 % 2 == 0) {
                                                f10 = fArr3[i203] - f75;
                                                f11 = fArr3[i204];
                                            } else {
                                                f10 = fArr3[i203] + f75;
                                                f11 = fArr3[i204];
                                            }
                                            float f82 = f11 + f9;
                                            int i224 = i223 + 89;
                                            a = i224 % 128;
                                            if (i224 % 2 != 0) {
                                                f35 = f75 - fArr3[i207];
                                                f12 = fArr3[i214];
                                            } else {
                                                f35 = f75 + fArr3[i207];
                                                f12 = fArr3[i214];
                                            }
                                            f13 = f12;
                                            f14 = f10;
                                            f15 = f82;
                                        }
                                        f36 = f9 + f13;
                                        f30 = f14;
                                        f33 = f15;
                                        i24 = i24;
                                        f32 = f32;
                                    } else {
                                        i3 = i40;
                                        int i225 = i24;
                                        float f83 = f36;
                                        float f84 = f35;
                                        int i226 = i3 & 5;
                                        int i227 = (i3 ^ 5) | i226;
                                        int i228 = (i226 & i227) + (i226 | i227);
                                        float f85 = fArr3[i228];
                                        int i229 = ((i3 ^ 6) | (i3 & 6)) << 1;
                                        int i230 = ~i3;
                                        int i231 = -((i3 & (-7)) | (6 & i230));
                                        int i232 = (i229 & i231) + (i229 | i231);
                                        float f86 = fArr3[i232];
                                        int i233 = i3 + 1;
                                        float f87 = fArr3[(i233 ^ (-1)) + (i233 << 1)];
                                        float f88 = fArr3[(i3 ^ 1) + ((i3 & 1) << 1)];
                                        float f89 = fArr3[i3 + 2];
                                        int i234 = ((i3 ^ 3) | (i3 & 3)) << 1;
                                        char c6 = c5;
                                        int i235 = -((i3 & (-4)) | (3 & i230));
                                        if (fArr3[(i234 & i235) + (i234 | i235)] != 0.0f) {
                                            int i236 = i45 + 17;
                                            a = i236 % 128;
                                            int i237 = i236 % 2;
                                            i7 = 1;
                                            z2 = true;
                                        } else {
                                            i7 = 1;
                                            int i238 = ((i41 & (-46)) | ((~i41) & 45)) + ((i41 & 45) << 1);
                                            b = i238 % 128;
                                            int i239 = i238 % 2;
                                            z2 = false;
                                        }
                                        boolean z3 = fArr3[((i3 | 4) << i7) - ((i3 & (-5)) | (i230 & 4))] != 0.0f;
                                        fArr3 = fArr3;
                                        c5 = c6;
                                        boolean z4 = z2;
                                        i24 = i225;
                                        d(path, f84, f83, f85 + f84, f86 + f83, f87, f88, f89, z4, z3);
                                        float f90 = fArr3[i228];
                                        int i240 = a;
                                        int i241 = i240 & 119;
                                        int i242 = i240 | 119;
                                        int i243 = (i241 ^ i242) + ((i242 & i241) << 1);
                                        b = i243 % 128;
                                        int i244 = i243 % 2;
                                        f35 = f84 + f90;
                                        f36 = f83 + fArr3[i232];
                                    }
                                } else {
                                    i3 = i40;
                                    fArr3 = fArr3;
                                    float f91 = fArr3[i3];
                                    int i245 = i3 & 1;
                                    int i246 = (i245 - (~((i3 ^ 1) | i245))) - 1;
                                    int i247 = b;
                                    int i248 = (-2) - ((((i247 | 54) << 1) - (i247 ^ 54)) ^ (-1));
                                    a = i248 % 128;
                                    if (i248 % 2 != 0) {
                                        f8 = fArr3[i246];
                                        i6 = i3 % 2;
                                        i5 = 1;
                                    } else {
                                        f8 = fArr3[i246];
                                        int i249 = i3 & 2;
                                        int i250 = -(-((i3 ^ 2) | i249));
                                        int i251 = i249 ^ i250;
                                        int i252 = i249 & i250;
                                        i5 = 1;
                                        i6 = (i252 << 1) + i251;
                                    }
                                    int i253 = (i3 ^ (-30)) + ((i3 & (-30)) << i5);
                                    int i254 = (-2) - (((i253 ^ 34) + ((i253 & 34) << i5)) ^ (-1));
                                    path.quadTo(f91, f8, fArr3[i6], fArr3[i254]);
                                    f6 = fArr3[i3];
                                    f7 = fArr3[i246];
                                    f35 = fArr3[i6];
                                    f36 = fArr3[i254];
                                }
                                int i255 = i3 ^ i2;
                                i40 = (((i3 & i2) | i255) << 1) - i255;
                                i24 = i24;
                                i2 = i2;
                                fArr3 = fArr3;
                                c = c5;
                                c5 = c;
                                i20 = 1;
                            } else {
                                i3 = i40;
                                fArr3 = fArr3;
                                c5 = c5;
                                i24 = i24;
                                i2 = i2;
                                f32 = f32;
                                float f92 = f36;
                                path.lineTo(fArr3[i3], f92);
                                f35 = fArr3[i3];
                                f36 = f92;
                            }
                            f32 = f32;
                            int i256 = i3 ^ i2;
                            i40 = (((i3 & i2) | i256) << 1) - i256;
                            i24 = i24;
                            i2 = i2;
                            fArr3 = fArr3;
                            c = c5;
                            c5 = c;
                            i20 = 1;
                        } else {
                            i3 = i40;
                            fArr3 = fArr3;
                            int i257 = ~i3;
                            float f93 = fArr3[i3];
                            int i258 = i3 & 1;
                            float f94 = fArr3[((~i258) & (i3 | 1)) + (i258 << 1)];
                            int i259 = ((i257 & 2) | (i3 & (-3))) + ((i3 & 2) << 1);
                            float f95 = fArr3[i259];
                            int i260 = (((i3 | 4) << 1) - (i3 ^ 4)) - 1;
                            int i261 = a;
                            int i262 = i261 & 87;
                            int i263 = (i261 ^ 87) | i262;
                            int i264 = (i262 & i263) + (i262 | i263);
                            b = i264 % 128;
                            int i265 = i264 % 2;
                            float f96 = fArr3[i260];
                            int i266 = i3 & 4;
                            int i267 = ((((i3 ^ 4) | i266) << 1) - (~(-((~i266) & (i3 | 4))))) - 1;
                            float f97 = fArr3[i267];
                            int i268 = i3 & 5;
                            int i269 = -(-(i3 | 5));
                            int i270 = (i268 & i269) + (i268 | i269);
                            int i271 = i261 + 39;
                            b = i271 % 128;
                            if (i271 % 2 == 0) {
                                path.cubicTo(f93, f94, f95, f96, f97, fArr3[i270]);
                                float f98 = fArr3[i267];
                                throw null;
                            }
                            path.cubicTo(f93, f94, f95, f96, f97, fArr3[i270]);
                            f35 = fArr3[i267];
                            f36 = fArr3[i270];
                            f6 = fArr3[i259];
                            f7 = fArr3[i260];
                        }
                        f30 = f6;
                        f33 = f7;
                        f32 = f32;
                        int i2510 = i3 ^ i2;
                        i40 = (((i3 & i2) | i2510) << 1) - i2510;
                        i24 = i24;
                        i2 = i2;
                        fArr3 = fArr3;
                        c = c5;
                        c5 = c;
                        i20 = 1;
                    } else {
                        i3 = i40;
                        fArr3 = fArr3;
                        c5 = c5;
                        i24 = i24;
                        float f99 = f36;
                        float f100 = f35;
                        int i272 = (i3 & 5) + (i3 | 5);
                        int i273 = b;
                        int i274 = (i273 & (-12)) | ((~i273) & 11);
                        int i275 = -(-((i273 & 11) << 1));
                        int i276 = ((i274 | i275) << 1) - (i274 ^ i275);
                        a = i276 % 128;
                        if (i276 % 2 != 0) {
                            f5 = fArr3[i272];
                            i4 = i3 >>> 98;
                        } else {
                            f5 = fArr3[i272];
                            i4 = i3 + 6;
                        }
                        float f101 = f5;
                        int i277 = i4;
                        float f102 = fArr3[i277];
                        float f103 = fArr3[(i3 << 1) - i3];
                        int i278 = i3 & 1;
                        int i279 = (i3 ^ 1) | i278;
                        float f104 = fArr3[((i278 | i279) << 1) - (i278 ^ i279)];
                        int i280 = i3 + 3;
                        float f105 = fArr3[(i280 ^ (-1)) + (i280 << 1)];
                        boolean z5 = fArr3[(i3 ^ 3) + ((i3 & 3) << 1)] != 0.0f;
                        if (fArr3[(i3 & 4) + (i3 | 4)] != 0.0f) {
                            int i281 = i273 + 8;
                            int i282 = (i281 ^ (-1)) + (i281 << 1);
                            a = i282 % 128;
                            int i283 = i282 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        d(path, f100, f99, f101, f102, f103, f104, f105, z5, z);
                        f35 = fArr3[i272];
                        f36 = fArr3[i277];
                    }
                    int i284 = b;
                    int i285 = i284 & 123;
                    int i286 = (i284 | 123) & (~i285);
                    int i287 = i285 << 1;
                    int i288 = (i286 & i287) + (i286 | i287);
                    a = i288 % 128;
                    int i289 = i288 % 2;
                    f33 = f36;
                    f30 = f35;
                    f32 = f32;
                    int i2511 = i3 ^ i2;
                    i40 = (((i3 & i2) | i2511) << 1) - i2511;
                    i24 = i24;
                    i2 = i2;
                    fArr3 = fArr3;
                    c = c5;
                    c5 = c;
                    i20 = 1;
                }
                int i290 = i20;
                int i291 = i24;
                fArr[0] = f35;
                fArr[i290] = f36;
                fArr[2] = f30;
                fArr[3] = f33;
                fArr[4] = f32;
                fArr[5] = f34;
                char c7 = avvArr[i291].c;
                int i292 = i291 & 1;
                i24 = (((~i292) & (i291 | 1)) - (~(i292 << 1))) - 1;
                c3 = 0;
                i17 = 2;
                i20 = 1;
                c = c7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r9.length != r10.length) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        r9 = (r6 & (-18)) | ((~r6) & 17);
        r10 = -(-((r6 & 17) << 1));
        r1 = (r9 & r10) + (r9 | r10);
        ivas.gov.bisp.enumeration.p007ag.r.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r1 = ((r6 & (-34)) | ((~r6) & 33)) + ((r6 & 33) << 1);
        ivas.gov.bisp.enumeration.p007ag.r.a = r1 % 128;
        r1 = r1 % 2;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r1 >= r9.length) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p007ag.r.b;
        r6 = r5 & 97;
        r5 = (r5 | 97) & (~r6);
        r6 = r6 << 1;
        r7 = ((r5 | r6) << 1) - (r5 ^ r6);
        ivas.gov.bisp.enumeration.p007ag.r.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if ((r7 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r7 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        if (r9[r1].c != r10[r1].c) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r9[r1].c != r10[r1].c) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r9[r1].d.length != r10[r1].d.length) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p007ag.r.b;
        r6 = r5 & 65;
        r6 = r6 + ((r5 ^ 65) | r6);
        r5 = r6 % 128;
        ivas.gov.bisp.enumeration.p007ag.r.a = r5;
        r6 = r6 % 2;
        r1 = r1 + 1;
        r5 = r5 + 90;
        r6 = (r5 ^ (-1)) + (r5 << 1);
        ivas.gov.bisp.enumeration.p007ag.r.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p007ag.r.b;
        r10 = (((r9 | 80) << 1) - (r9 ^ 80)) - 1;
        ivas.gov.bisp.enumeration.p007ag.r.a = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p007ag.r.b;
        r1 = r9 & 87;
        r10 = (((r9 ^ 87) | r1) << 1) - ((r9 | 87) & (~r1));
        ivas.gov.bisp.enumeration.p007ag.r.a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ec, code lost:
    
        if ((r10 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ee, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (r9.length != r10.length) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(ivas.gov.bisp.enumeration.ag.r.aVv[] r9, ivas.gov.bisp.enumeration.ag.r.aVv[] r10) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p007ag.r.b(ivas.gov.bisp.enumeration.ag.r$aVv[], ivas.gov.bisp.enumeration.ag.r$aVv[]):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r4 = r1 & 35;
        r4 = r4 + ((r1 ^ 35) | r4);
        r1 = r4 % 128;
        ivas.gov.bisp.enumeration.p007ag.r.a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if ((r4 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r4 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r7 > r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r7 > r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r4 = r1 & 57;
        r1 = (r1 | 57) & (~r4);
        r4 = r4 << 1;
        r5 = ((r1 | r4) << 1) - (r1 ^ r4);
        ivas.gov.bisp.enumeration.p007ag.r.b = r5 % 128;
        r5 = r5 % 2;
        r1 = -r7;
        r5 = r8 & r1;
        r4 = ((r8 ^ r1) | r5) << 1;
        r8 = -((r8 | r1) & (~r5));
        r1 = (r4 & r8) + (r8 | r4);
        r8 = java.lang.Math.min(r1, r2 - r7);
        r2 = ivas.gov.bisp.enumeration.p007ag.r.a;
        r4 = (r2 ^ 39) + ((r2 & 39) << 1);
        ivas.gov.bisp.enumeration.p007ag.r.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if ((r4 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r1 = new float[r1];
        java.lang.System.arraycopy(r6, r7, r1, 0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r1 = new float[r1];
        java.lang.System.arraycopy(r6, r7, r1, 0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p007ag.r.b;
        r7 = ((r6 ^ 77) | (r6 & 77)) << 1;
        r6 = -(((~r6) & 77) | (r6 & (-78)));
        r8 = (r7 & r6) + (r6 | r7);
        ivas.gov.bisp.enumeration.p007ag.r.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if ((r8 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        throw new java.lang.ArrayIndexOutOfBoundsException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r7 <= r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r7 <= r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r2 = r6.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float[] c(float[] r6, int r7, int r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p007ag.r.a
            r2 = r1 & 105(0x69, float:1.47E-43)
            r1 = r1 | 105(0x69, float:1.47E-43)
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p007ag.r.b = r1
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L17
            r2 = 4
            int r2 = r2 / r3
            if (r7 > r8) goto L99
            goto L19
        L17:
            if (r7 > r8) goto L99
        L19:
            int r2 = r6.length
            if (r7 < 0) goto L93
            r4 = r1 & 35
            r1 = r1 ^ 35
            r1 = r1 | r4
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p007ag.r.a = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L2f
            r4 = 73
            int r4 = r4 / r3
            if (r7 > r2) goto L93
            goto L31
        L2f:
            if (r7 > r2) goto L93
        L31:
            r4 = r1 & 57
            int r5 = ~r4
            r1 = r1 | 57
            r1 = r1 & r5
            int r4 = r4 << 1
            r5 = r1 | r4
            int r5 = r5 << 1
            r1 = r1 ^ r4
            int r5 = r5 - r1
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.p007ag.r.b = r1
            int r5 = r5 % r0
            int r1 = -r7
            r4 = r8 ^ r1
            r5 = r8 & r1
            r4 = r4 | r5
            int r4 = r4 << 1
            int r5 = ~r5
            r8 = r8 | r1
            r8 = r8 & r5
            int r8 = -r8
            r1 = r4 & r8
            r8 = r8 | r4
            int r1 = r1 + r8
            int r2 = r2 - r7
            int r8 = java.lang.Math.min(r1, r2)
            int r2 = ivas.gov.bisp.enumeration.p007ag.r.a
            r4 = r2 ^ 39
            r2 = r2 & 39
            int r2 = r2 << 1
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p007ag.r.b = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L6f
            float[] r1 = new float[r1]
            java.lang.System.arraycopy(r6, r7, r1, r3, r8)
            goto L74
        L6f:
            float[] r1 = new float[r1]
            java.lang.System.arraycopy(r6, r7, r1, r3, r8)
        L74:
            int r6 = ivas.gov.bisp.enumeration.p007ag.r.b
            r7 = r6 ^ 77
            r8 = r6 & 77
            r7 = r7 | r8
            int r7 = r7 << 1
            r8 = r6 & (-78)
            int r6 = ~r6
            r2 = 77
            r6 = r6 & r2
            r6 = r6 | r8
            int r6 = -r6
            r8 = r7 & r6
            r6 = r6 | r7
            int r8 = r8 + r6
            int r6 = r8 % 128
            ivas.gov.bisp.enumeration.p007ag.r.a = r6
            int r8 = r8 % r0
            if (r8 == 0) goto L91
            return r1
        L91:
            r6 = 0
            throw r6
        L93:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
            r6.<init>()
            throw r6
        L99:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p007ag.r.c(float[], int, int):float[]");
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0399  */
    /* JADX WARN: Code duplicated, block: B:114:0x03de  */
    /* JADX WARN: Code duplicated, block: B:125:0x0427 A[PHI: r4
  0x0427: PHI (r4v8 int A[IMMUTABLE_TYPE]) = (r4v7 int), (r4v9 int) binds: [B:124:0x0425, B:121:0x041d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:28:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x0208 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x020a  */
    /* JADX WARN: Code duplicated, block: B:64:0x021b  */
    /* JADX WARN: Code duplicated, block: B:65:0x021d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0231  */
    /* JADX WARN: Code duplicated, block: B:73:0x0250  */
    /* JADX WARN: Code duplicated, block: B:75:0x0255  */
    /* JADX WARN: Code duplicated, block: B:82:0x0299  */
    /* JADX WARN: Code duplicated, block: B:84:0x02be  */
    /* JADX WARN: Code duplicated, block: B:88:0x02da  */
    public static aVv[] d(String str) {
        int i;
        String strTrim;
        Object obj;
        int i2;
        int i3;
        int i4;
        float[] fArrC;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 2 % 2;
        int i15 = a;
        int i16 = i15 & 33;
        int i17 = 1;
        int i18 = ((~i16) & (i15 | 33)) + (i16 << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        Object obj2 = null;
        int i20 = 0;
        if (str == null) {
            int i21 = i15 & 45;
            int i22 = (i15 | 45) & (~i21);
            int i23 = -(-(i21 << 1));
            int i24 = (i22 & i23) + (i23 | i22);
            b = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 23 / 0;
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i26 = b;
        int i27 = ((i26 ^ 51) | (i26 & 51)) << 1;
        int i28 = -(((~i26) & 51) | (i26 & (-52)));
        int i29 = (i27 & i28) + (i28 | i27);
        a = i29 % 128;
        int i30 = i29 % 2;
        int i31 = 0;
        int i32 = 1;
        while (true) {
            int i33 = 55;
            if (i32 >= str.length()) {
                int i34 = -i31;
                if ((i32 & i34) + (i34 | i32) == 1) {
                    int i35 = a + 89;
                    b = i35 % 128;
                    if (i35 % 2 != 0) {
                        i = 0;
                        int i36 = 50 / 0;
                        if (i31 < str.length()) {
                            aVv avv = new aVv(str.charAt(i31), new float[i]);
                            int i37 = a + 17;
                            b = i37 % 128;
                            int i38 = i37 % 2;
                            arrayList.add(avv);
                            int i39 = b;
                            int i40 = (i39 & 55) + (i39 | 55);
                            a = i40 % 128;
                            int i41 = i40 % 2;
                        }
                    } else {
                        i = 0;
                        if (i31 < str.length()) {
                            aVv avv2 = new aVv(str.charAt(i31), new float[i]);
                            int i310 = a + 17;
                            b = i310 % 128;
                            int i311 = i310 % 2;
                            arrayList.add(avv2);
                            int i312 = b;
                            int i42 = (i312 & 55) + (i312 | 55);
                            a = i42 % 128;
                            int i43 = i42 % 2;
                        }
                    }
                }
                aVv[] avvArr = (aVv[]) arrayList.toArray(new aVv[arrayList.size()]);
                int i44 = a;
                int i45 = i44 & 61;
                int i46 = (i44 ^ 61) | i45;
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                b = i47 % 128;
                int i48 = i47 % 2;
                return avvArr;
            }
            while (i32 < str.length()) {
                int i49 = a + 75;
                b = i49 % 128;
                int i50 = i49 % i13;
                char cCharAt = str.charAt(i32);
                int i51 = cCharAt & 65446;
                if (((i51 - (~(-(-((cCharAt ^ 65446) | i51))))) - i17) * ((cCharAt ^ 65471) + ((cCharAt & 65471) << i17)) > 0) {
                    int i52 = a + 71;
                    b = i52 % 128;
                    int i53 = i52 % i13;
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e') {
                        int i54 = a;
                        int i55 = ((i54 ^ 10) + ((i54 & 10) << i17)) - 1;
                        b = i55 % 128;
                        int i56 = i55 % i13;
                        if (cCharAt == 'E') {
                            strTrim = str.substring(i31, i32).trim();
                            int i57 = a;
                            int i58 = i57 ^ 1;
                            int i59 = (((i57 & i17) | i58) << i17) - i58;
                            b = i59 % 128;
                            int i60 = i59 % i13;
                            if (strTrim.length() > 0) {
                                int i61 = b;
                                int i62 = i61 & 85;
                                int i63 = -(-((i61 ^ 85) | i62));
                                i2 = ((i62 | i63) << i17) - (i63 ^ i62);
                                a = i2 % 128;
                                if (i2 % i13 == 0 ? strTrim.charAt(i20) == 'z' : strTrim.charAt(i17) == 'G') {
                                    obj = obj2;
                                    fArrC = new float[i20];
                                    int i64 = a;
                                    int i65 = i64 & 107;
                                    int i66 = (i64 | 107) & (~i65);
                                    int i67 = -(-(i65 << 1));
                                    int i68 = (i66 & i67) + (i66 | i67);
                                    b = i68 % 128;
                                    int i69 = i68 % 2;
                                } else if (strTrim.charAt(i20) != 'Z') {
                                    int i70 = a;
                                    int i71 = 11;
                                    int i72 = (i70 ^ 11) + ((i70 & 11) << i17);
                                    b = i72 % 128;
                                    int i73 = i72 % i13;
                                    try {
                                        float[] fArr = new float[strTrim.length()];
                                        int length = strTrim.length();
                                        int i74 = b;
                                        int i75 = i74 & 61;
                                        int i76 = ((((i74 ^ 61) | i75) << i17) - (~(-((~i75) & (i74 | 61))))) - i17;
                                        a = i76 % 128;
                                        if (i76 % i13 == 0) {
                                            i4 = i17;
                                            i3 = 0;
                                        } else {
                                            i3 = i17;
                                            i4 = 0;
                                        }
                                        int i77 = i74 & 7;
                                        int i78 = -(-((i74 ^ 7) | i77));
                                        int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                                        a = i79 % 128;
                                        if (i79 % i13 == 0) {
                                            int i80 = 5 % 3;
                                        }
                                        while (i3 < length) {
                                            int i81 = b;
                                            int i82 = i81 & 11;
                                            int i83 = (i81 | i71) & (~i82);
                                            int i84 = i82 << 1;
                                            int i85 = (i83 ^ i84) + ((i83 & i84) << i17);
                                            a = i85 % 128;
                                            int i86 = i85 % i13;
                                            int i87 = i3;
                                            boolean z2 = false;
                                            int i88 = 0;
                                            boolean z3 = false;
                                            boolean z4 = false;
                                            while (true) {
                                                if (i87 < strTrim.length()) {
                                                    int i89 = a;
                                                    int i90 = (i89 | 55) << 1;
                                                    int i91 = -((i89 & (-56)) | ((~i89) & i33));
                                                    int i92 = (i90 ^ i91) + ((i90 & i91) << i17);
                                                    b = i92 % 128;
                                                    int i93 = i92 % i13;
                                                    char cCharAt2 = strTrim.charAt(i87);
                                                    if (cCharAt2 != ' ') {
                                                        int i94 = b;
                                                        int i95 = (i94 & (-122)) | (121 & (~i94));
                                                        int i96 = (i94 & 121) << 1;
                                                        int i97 = (i95 ^ i96) + ((i95 & i96) << i17);
                                                        a = i97 % 128;
                                                        if (i97 % 2 == 0) {
                                                            if (cCharAt2 != 21) {
                                                                i5 = 11;
                                                                int i98 = ((11 & (~i94)) | (i94 & (-12))) + ((i94 & 11) << 1);
                                                                i9 = i98 % 128;
                                                                a = i9;
                                                                int i99 = i98 % 2;
                                                                if (cCharAt2 != 'e') {
                                                                    int i100 = (-2) - ((i9 + 34) ^ (-1));
                                                                    z = z2;
                                                                    i10 = i100 % 128;
                                                                    b = i10;
                                                                    int i101 = i100 % 2;
                                                                    switch (cCharAt2) {
                                                                        case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                                                                            i13 = 2;
                                                                            break;
                                                                        case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                                                                            int i102 = i9 & 67;
                                                                            int i103 = (~i102) & (i9 | 67);
                                                                            i11 = 1;
                                                                            int i104 = i102 << 1;
                                                                            i12 = (i103 & i104) + (i104 | i103);
                                                                            b = i12 % 128;
                                                                            if (i12 % 2 == 0) {
                                                                                throw null;
                                                                            }
                                                                            if (i87 == i3 && (!z4)) {
                                                                                int i105 = b;
                                                                                int i106 = i105 ^ 3;
                                                                                int i107 = -(-((i105 & 3) << i11));
                                                                                int i108 = ((i106 | i107) << i11) - (i107 ^ i106);
                                                                                a = i108 % 128;
                                                                                int i109 = i108 % 2;
                                                                                i13 = 2;
                                                                                z2 = true;
                                                                                int i110 = a + 41;
                                                                                b = i110 % 128;
                                                                                int i111 = i110 % i13;
                                                                                i88 = 1;
                                                                            } else {
                                                                                z2 = z;
                                                                            }
                                                                            int i112 = a;
                                                                            int i113 = ((i112 & 88) + (i112 | 88)) - 1;
                                                                            b = i113 % 128;
                                                                            int i114 = i113 % 2;
                                                                            i6 = 1;
                                                                            z4 = false;
                                                                            if (i88 != i6) {
                                                                                int i115 = a;
                                                                                i7 = (((i115 | 101) << 1) - (~(-(i115 ^ 101)))) - 1;
                                                                                b = i7 % 128;
                                                                                if (i7 % 2 != 0) {
                                                                                    int i116 = 9 / 0;
                                                                                }
                                                                                int i117 = i115 & 125;
                                                                                int i118 = (i115 ^ 125) | i117;
                                                                                int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                                                                                b = i119 % 128;
                                                                                int i120 = i119 % 2;
                                                                            } else {
                                                                                int i121 = (i87 & 2) + (i87 | 2);
                                                                                i87 = (i121 ^ (-1)) + (i121 << i6);
                                                                                int i122 = a;
                                                                                int i123 = ((i122 ^ 109) | (i122 & 109)) << i6;
                                                                                int i124 = -((i122 & (-110)) | ((~i122) & 109));
                                                                                i8 = (i123 & i124) + (i124 | i123);
                                                                                b = i8 % 128;
                                                                                if (i8 % 2 != 0) {
                                                                                    int i125 = 5 / 2;
                                                                                }
                                                                                i13 = 2;
                                                                                i17 = 1;
                                                                                i33 = 55;
                                                                            }
                                                                            break;
                                                                            break;
                                                                        case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                                                                            if (z3) {
                                                                                i11 = 1;
                                                                                int i1010 = b;
                                                                                int i1011 = i1010 ^ 3;
                                                                                int i1012 = -(-((i1010 & 3) << i11));
                                                                                int i1013 = ((i1011 | i1012) << i11) - (i1012 ^ i1011);
                                                                                a = i1013 % 128;
                                                                                int i1014 = i1013 % 2;
                                                                                i13 = 2;
                                                                                z2 = true;
                                                                                int i1110 = a + 41;
                                                                                b = i1110 % 128;
                                                                                int i1111 = i1110 % i13;
                                                                                i88 = 1;
                                                                            } else {
                                                                                int i126 = ((i10 & 92) + (i10 | 92)) - 1;
                                                                                a = i126 % 128;
                                                                                int i127 = i126 % 2;
                                                                                z2 = z;
                                                                                z3 = true;
                                                                            }
                                                                            int i1112 = a;
                                                                            int i1113 = ((i1112 & 88) + (i1112 | 88)) - 1;
                                                                            b = i1113 % 128;
                                                                            int i1114 = i1113 % 2;
                                                                            i6 = 1;
                                                                            z4 = false;
                                                                            if (i88 != i6) {
                                                                                int i1115 = a;
                                                                                i7 = (((i1115 | 101) << 1) - (~(-(i1115 ^ 101)))) - 1;
                                                                                b = i7 % 128;
                                                                                if (i7 % 2 != 0) {
                                                                                    int i1116 = 9 / 0;
                                                                                }
                                                                                int i1117 = i1115 & 125;
                                                                                int i1118 = (i1115 ^ 125) | i1117;
                                                                                int i1119 = ((i1117 | i1118) << 1) - (i1118 ^ i1117);
                                                                                b = i1119 % 128;
                                                                                int i128 = i1119 % 2;
                                                                            } else {
                                                                                int i129 = (i87 & 2) + (i87 | 2);
                                                                                i87 = (i129 ^ (-1)) + (i129 << i6);
                                                                                int i1210 = a;
                                                                                int i1211 = ((i1210 ^ 109) | (i1210 & 109)) << i6;
                                                                                int i1212 = -((i1210 & (-110)) | ((~i1210) & 109));
                                                                                i8 = (i1211 & i1212) + (i1212 | i1211);
                                                                                b = i8 % 128;
                                                                                if (i8 % 2 != 0) {
                                                                                    int i1213 = 5 / 2;
                                                                                }
                                                                                i13 = 2;
                                                                                i17 = 1;
                                                                                i33 = 55;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i130 = (i9 ^ 77) + ((i9 & 77) << 1);
                                                                            b = i130 % 128;
                                                                            int i131 = i130 % 2;
                                                                            z2 = z;
                                                                            int i11110 = a;
                                                                            int i11111 = ((i11110 & 88) + (i11110 | 88)) - 1;
                                                                            b = i11111 % 128;
                                                                            int i11112 = i11111 % 2;
                                                                            i6 = 1;
                                                                            z4 = false;
                                                                            if (i88 != i6) {
                                                                                int i11113 = a;
                                                                                i7 = (((i11113 | 101) << 1) - (~(-(i11113 ^ 101)))) - 1;
                                                                                b = i7 % 128;
                                                                                if (i7 % 2 != 0) {
                                                                                    int i11114 = 9 / 0;
                                                                                }
                                                                                int i11115 = i11113 & 125;
                                                                                int i11116 = (i11113 ^ 125) | i11115;
                                                                                int i11117 = ((i11115 | i11116) << 1) - (i11116 ^ i11115);
                                                                                b = i11117 % 128;
                                                                                int i1214 = i11117 % 2;
                                                                            } else {
                                                                                int i1215 = (i87 & 2) + (i87 | 2);
                                                                                i87 = (i1215 ^ (-1)) + (i1215 << i6);
                                                                                int i1216 = a;
                                                                                int i1217 = ((i1216 ^ 109) | (i1216 & 109)) << i6;
                                                                                int i1218 = -((i1216 & (-110)) | ((~i1216) & 109));
                                                                                i8 = (i1217 & i1218) + (i1218 | i1217);
                                                                                b = i8 % 128;
                                                                                if (i8 % 2 != 0) {
                                                                                    int i1219 = 5 / 2;
                                                                                }
                                                                                i13 = 2;
                                                                                i17 = 1;
                                                                                i33 = 55;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            } else {
                                                                i5 = 11;
                                                            }
                                                            int i132 = a;
                                                            int i133 = i132 & 91;
                                                            int i134 = ((i132 ^ 91) | i133) << 1;
                                                            int i135 = -((i132 | 91) & (~i133));
                                                            int i136 = (i134 & i135) + (i135 | i134);
                                                            b = i136 % 128;
                                                            int i137 = i136 % 2;
                                                            z2 = z2;
                                                            i6 = 1;
                                                            z4 = true;
                                                            if (i88 != i6) {
                                                                int i12110 = (i87 & 2) + (i87 | 2);
                                                                i87 = (i12110 ^ (-1)) + (i12110 << i6);
                                                                int i12111 = a;
                                                                int i12112 = ((i12111 ^ 109) | (i12111 & 109)) << i6;
                                                                int i12113 = -((i12111 & (-110)) | ((~i12111) & 109));
                                                                i8 = (i12112 & i12113) + (i12113 | i12112);
                                                                b = i8 % 128;
                                                                if (i8 % 2 != 0) {
                                                                    int i12114 = 5 / 2;
                                                                }
                                                                i13 = 2;
                                                                i17 = 1;
                                                                i33 = 55;
                                                            } else {
                                                                int i11118 = a;
                                                                i7 = (((i11118 | 101) << 1) - (~(-(i11118 ^ 101)))) - 1;
                                                                b = i7 % 128;
                                                                if (i7 % 2 != 0) {
                                                                    int i11119 = 9 / 0;
                                                                }
                                                                int i111110 = i11118 & 125;
                                                                int i111111 = (i11118 ^ 125) | i111110;
                                                                int i111112 = ((i111110 | i111111) << 1) - (i111111 ^ i111110);
                                                                b = i111112 % 128;
                                                                int i12115 = i111112 % 2;
                                                            }
                                                        } else {
                                                            if (cCharAt2 != 'E') {
                                                                i5 = 11;
                                                                int i910 = ((11 & (~i94)) | (i94 & (-12))) + ((i94 & 11) << 1);
                                                                i9 = i910 % 128;
                                                                a = i9;
                                                                int i911 = i910 % 2;
                                                                if (cCharAt2 != 'e') {
                                                                    int i1015 = (-2) - ((i9 + 34) ^ (-1));
                                                                    z = z2;
                                                                    i10 = i1015 % 128;
                                                                    b = i10;
                                                                    int i1016 = i1015 % 2;
                                                                    switch (cCharAt2) {
                                                                        case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                                                                            i13 = 2;
                                                                            break;
                                                                        case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                                                                            int i1017 = i9 & 67;
                                                                            int i1018 = (~i1017) & (i9 | 67);
                                                                            i11 = 1;
                                                                            int i1019 = i1017 << 1;
                                                                            i12 = (i1018 & i1019) + (i1019 | i1018);
                                                                            b = i12 % 128;
                                                                            if (i12 % 2 == 0) {
                                                                                throw null;
                                                                            }
                                                                            if (i87 == i3) {
                                                                            }
                                                                            z2 = z;
                                                                            int i111113 = a;
                                                                            int i111114 = ((i111113 & 88) + (i111113 | 88)) - 1;
                                                                            b = i111114 % 128;
                                                                            int i111115 = i111114 % 2;
                                                                            i6 = 1;
                                                                            z4 = false;
                                                                            if (i88 != i6) {
                                                                                int i111116 = a;
                                                                                i7 = (((i111116 | 101) << 1) - (~(-(i111116 ^ 101)))) - 1;
                                                                                b = i7 % 128;
                                                                                if (i7 % 2 != 0) {
                                                                                    int i111117 = 9 / 0;
                                                                                }
                                                                                int i111118 = i111116 & 125;
                                                                                int i111119 = (i111116 ^ 125) | i111118;
                                                                                int i1111110 = ((i111118 | i111119) << 1) - (i111119 ^ i111118);
                                                                                b = i1111110 % 128;
                                                                                int i12116 = i1111110 % 2;
                                                                            } else {
                                                                                int i12117 = (i87 & 2) + (i87 | 2);
                                                                                i87 = (i12117 ^ (-1)) + (i12117 << i6);
                                                                                int i12118 = a;
                                                                                int i12119 = ((i12118 ^ 109) | (i12118 & 109)) << i6;
                                                                                int i121110 = -((i12118 & (-110)) | ((~i12118) & 109));
                                                                                i8 = (i12119 & i121110) + (i121110 | i12119);
                                                                                b = i8 % 128;
                                                                                if (i8 % 2 != 0) {
                                                                                    int i121111 = 5 / 2;
                                                                                }
                                                                                i13 = 2;
                                                                                i17 = 1;
                                                                                i33 = 55;
                                                                            }
                                                                            break;
                                                                            break;
                                                                        case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                                                                            if (z3) {
                                                                                int i1220 = ((i10 & 92) + (i10 | 92)) - 1;
                                                                                a = i1220 % 128;
                                                                                int i1221 = i1220 % 2;
                                                                                z2 = z;
                                                                                z3 = true;
                                                                            } else {
                                                                                i11 = 1;
                                                                                int i10110 = b;
                                                                                int i10111 = i10110 ^ 3;
                                                                                int i10112 = -(-((i10110 & 3) << i11));
                                                                                int i10113 = ((i10111 | i10112) << i11) - (i10112 ^ i10111);
                                                                                a = i10113 % 128;
                                                                                int i10114 = i10113 % 2;
                                                                                i13 = 2;
                                                                                z2 = true;
                                                                                int i11120 = a + 41;
                                                                                b = i11120 % 128;
                                                                                int i11121 = i11120 % i13;
                                                                                i88 = 1;
                                                                            }
                                                                            int i1111111 = a;
                                                                            int i1111112 = ((i1111111 & 88) + (i1111111 | 88)) - 1;
                                                                            b = i1111112 % 128;
                                                                            int i1111113 = i1111112 % 2;
                                                                            i6 = 1;
                                                                            z4 = false;
                                                                            if (i88 != i6) {
                                                                                int i1111114 = a;
                                                                                i7 = (((i1111114 | 101) << 1) - (~(-(i1111114 ^ 101)))) - 1;
                                                                                b = i7 % 128;
                                                                                if (i7 % 2 != 0) {
                                                                                    int i1111115 = 9 / 0;
                                                                                }
                                                                                int i1111116 = i1111114 & 125;
                                                                                int i1111117 = (i1111114 ^ 125) | i1111116;
                                                                                int i1111118 = ((i1111116 | i1111117) << 1) - (i1111117 ^ i1111116);
                                                                                b = i1111118 % 128;
                                                                                int i121112 = i1111118 % 2;
                                                                            } else {
                                                                                int i121113 = (i87 & 2) + (i87 | 2);
                                                                                i87 = (i121113 ^ (-1)) + (i121113 << i6);
                                                                                int i121114 = a;
                                                                                int i121115 = ((i121114 ^ 109) | (i121114 & 109)) << i6;
                                                                                int i121116 = -((i121114 & (-110)) | ((~i121114) & 109));
                                                                                i8 = (i121115 & i121116) + (i121116 | i121115);
                                                                                b = i8 % 128;
                                                                                if (i8 % 2 != 0) {
                                                                                    int i121117 = 5 / 2;
                                                                                }
                                                                                i13 = 2;
                                                                                i17 = 1;
                                                                                i33 = 55;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i138 = (i9 ^ 77) + ((i9 & 77) << 1);
                                                                            b = i138 % 128;
                                                                            int i139 = i138 % 2;
                                                                            z2 = z;
                                                                            int i1111119 = a;
                                                                            int i11111110 = ((i1111119 & 88) + (i1111119 | 88)) - 1;
                                                                            b = i11111110 % 128;
                                                                            int i11111111 = i11111110 % 2;
                                                                            i6 = 1;
                                                                            z4 = false;
                                                                            if (i88 != i6) {
                                                                                int i11111112 = a;
                                                                                i7 = (((i11111112 | 101) << 1) - (~(-(i11111112 ^ 101)))) - 1;
                                                                                b = i7 % 128;
                                                                                if (i7 % 2 != 0) {
                                                                                    int i11111113 = 9 / 0;
                                                                                }
                                                                                int i11111114 = i11111112 & 125;
                                                                                int i11111115 = (i11111112 ^ 125) | i11111114;
                                                                                int i11111116 = ((i11111114 | i11111115) << 1) - (i11111115 ^ i11111114);
                                                                                b = i11111116 % 128;
                                                                                int i121118 = i11111116 % 2;
                                                                            } else {
                                                                                int i121119 = (i87 & 2) + (i87 | 2);
                                                                                i87 = (i121119 ^ (-1)) + (i121119 << i6);
                                                                                int i1211110 = a;
                                                                                int i1211111 = ((i1211110 ^ 109) | (i1211110 & 109)) << i6;
                                                                                int i1211112 = -((i1211110 & (-110)) | ((~i1211110) & 109));
                                                                                i8 = (i1211111 & i1211112) + (i1211112 | i1211111);
                                                                                b = i8 % 128;
                                                                                if (i8 % 2 != 0) {
                                                                                    int i1211113 = 5 / 2;
                                                                                }
                                                                                i13 = 2;
                                                                                i17 = 1;
                                                                                i33 = 55;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            } else {
                                                                i5 = 11;
                                                            }
                                                            int i1310 = a;
                                                            int i1311 = i1310 & 91;
                                                            int i1312 = ((i1310 ^ 91) | i1311) << 1;
                                                            int i1313 = -((i1310 | 91) & (~i1311));
                                                            int i1314 = (i1312 & i1313) + (i1313 | i1312);
                                                            b = i1314 % 128;
                                                            int i1315 = i1314 % 2;
                                                            z2 = z2;
                                                            i6 = 1;
                                                            z4 = true;
                                                            if (i88 != i6) {
                                                                int i1211114 = (i87 & 2) + (i87 | 2);
                                                                i87 = (i1211114 ^ (-1)) + (i1211114 << i6);
                                                                int i1211115 = a;
                                                                int i1211116 = ((i1211115 ^ 109) | (i1211115 & 109)) << i6;
                                                                int i1211117 = -((i1211115 & (-110)) | ((~i1211115) & 109));
                                                                i8 = (i1211116 & i1211117) + (i1211117 | i1211116);
                                                                b = i8 % 128;
                                                                if (i8 % 2 != 0) {
                                                                    int i1211118 = 5 / 2;
                                                                }
                                                                i13 = 2;
                                                                i17 = 1;
                                                                i33 = 55;
                                                            } else {
                                                                int i11111117 = a;
                                                                i7 = (((i11111117 | 101) << 1) - (~(-(i11111117 ^ 101)))) - 1;
                                                                b = i7 % 128;
                                                                if (i7 % 2 != 0) {
                                                                    int i11111118 = 9 / 0;
                                                                }
                                                                int i11111119 = i11111117 & 125;
                                                                int i111111110 = (i11111117 ^ 125) | i11111119;
                                                                int i111111111 = ((i11111119 | i111111110) << 1) - (i111111110 ^ i11111119);
                                                                b = i111111111 % 128;
                                                                int i1211119 = i111111111 % 2;
                                                            }
                                                        }
                                                    } else {
                                                        z = z2;
                                                        i5 = 11;
                                                    }
                                                    z2 = z;
                                                    int i11122 = a + 41;
                                                    b = i11122 % 128;
                                                    int i11123 = i11122 % i13;
                                                    i88 = 1;
                                                    int i11111120 = a;
                                                    int i111111112 = ((i11111120 & 88) + (i11111120 | 88)) - 1;
                                                    b = i111111112 % 128;
                                                    int i111111113 = i111111112 % 2;
                                                    i6 = 1;
                                                    z4 = false;
                                                    if (i88 != i6) {
                                                        int i12111110 = (i87 & 2) + (i87 | 2);
                                                        i87 = (i12111110 ^ (-1)) + (i12111110 << i6);
                                                        int i12111111 = a;
                                                        int i12111112 = ((i12111111 ^ 109) | (i12111111 & 109)) << i6;
                                                        int i12111113 = -((i12111111 & (-110)) | ((~i12111111) & 109));
                                                        i8 = (i12111112 & i12111113) + (i12111113 | i12111112);
                                                        b = i8 % 128;
                                                        if (i8 % 2 != 0) {
                                                            int i12111114 = 5 / 2;
                                                        }
                                                        i13 = 2;
                                                        i17 = 1;
                                                        i33 = 55;
                                                    } else {
                                                        int i111111114 = a;
                                                        i7 = (((i111111114 | 101) << 1) - (~(-(i111111114 ^ 101)))) - 1;
                                                        b = i7 % 128;
                                                        if (i7 % 2 != 0) {
                                                            int i111111115 = 9 / 0;
                                                        }
                                                        int i111111116 = i111111114 & 125;
                                                        int i111111117 = (i111111114 ^ 125) | i111111116;
                                                        int i111111118 = ((i111111116 | i111111117) << 1) - (i111111117 ^ i111111116);
                                                        b = i111111118 % 128;
                                                        int i12111115 = i111111118 % 2;
                                                    }
                                                } else {
                                                    i5 = 11;
                                                }
                                            }
                                            if (i3 < i87) {
                                                int i140 = b;
                                                int i141 = i140 | 67;
                                                int i142 = (i141 << 1) - ((~(i140 & 67)) & i141);
                                                a = i142 % 128;
                                                if (i142 % 2 == 0) {
                                                    Float.parseFloat(strTrim.substring(i3, i87));
                                                    throw null;
                                                }
                                                fArr[i4] = Float.parseFloat(strTrim.substring(i3, i87));
                                                i4++;
                                            }
                                            if (!z2) {
                                                int i143 = a;
                                                int i144 = (i143 & (-120)) | ((~i143) & 119);
                                                int i145 = (i143 & 119) << 1;
                                                int i146 = (i144 & i145) + (i145 | i144);
                                                b = i146 % 128;
                                                int i147 = i146 % 2;
                                                int i148 = i87 - 76;
                                                int i149 = (i148 ^ (-1)) + (i148 << 1);
                                                int i150 = (i149 & (-79)) | ((~i149) & 78);
                                                int i151 = (i149 & 78) << 1;
                                                i3 = (i150 ^ i151) + ((i151 & i150) << 1);
                                            } else {
                                                i3 = i87;
                                            }
                                            int i152 = a;
                                            int i153 = (i152 & 3) + (i152 | 3);
                                            b = i153 % 128;
                                            int i154 = i153 % 2;
                                            i71 = i5;
                                            i13 = 2;
                                            i17 = 1;
                                            i33 = 55;
                                        }
                                        obj = null;
                                        fArrC = c(fArr, 0, i4);
                                        int i155 = a;
                                        int i156 = i155 ^ 41;
                                        int i157 = -(-((i155 & 41) << 1));
                                        int i158 = ((i156 | i157) << 1) - (i157 ^ i156);
                                        b = i158 % 128;
                                        int i159 = i158 % 2;
                                    } catch (NumberFormatException e) {
                                        throw new RuntimeException(j.t("error in parsing \"", strTrim, "\""), e);
                                    }
                                } else {
                                    obj = obj2;
                                    fArrC = new float[i20];
                                    int i610 = a;
                                    int i611 = i610 & 107;
                                    int i612 = (i610 | 107) & (~i611);
                                    int i613 = -(-(i611 << 1));
                                    int i614 = (i612 & i613) + (i612 | i613);
                                    b = i614 % 128;
                                    int i615 = i614 % 2;
                                }
                                aVv avv3 = new aVv(strTrim.charAt(0), fArrC);
                                int i160 = b;
                                int i161 = i160 & 67;
                                int i162 = i160 | 67;
                                int i163 = (i161 & i162) + (i162 | i161);
                                a = i163 % 128;
                                int i164 = i163 % 2;
                                arrayList.add(avv3);
                                int i165 = a;
                                int i166 = (i165 & 43) + (i165 | 43);
                                b = i166 % 128;
                                int i167 = i166 % 2;
                            } else {
                                obj = obj2;
                            }
                            int i168 = b;
                            int i169 = i168 & 119;
                            int i170 = -(-((i168 ^ 119) | i169));
                            int i171 = (i169 & i170) + (i170 | i169);
                            a = i171 % 128;
                            int i172 = i171 % 2;
                            i31 = i32;
                            i20 = 0;
                            i17 = 1;
                            i32 = (i32 ^ 1) + ((i32 & 1) << 1);
                            obj2 = obj;
                            i13 = 2;
                        }
                    } else {
                        continue;
                    }
                } else if (cCharAt != 'e') {
                    int i510 = a;
                    int i511 = ((i510 ^ 10) + ((i510 & 10) << i17)) - 1;
                    b = i511 % 128;
                    int i512 = i511 % i13;
                    if (cCharAt == 'E') {
                        strTrim = str.substring(i31, i32).trim();
                        int i513 = a;
                        int i514 = i513 ^ 1;
                        int i515 = (((i513 & i17) | i514) << i17) - i514;
                        b = i515 % 128;
                        int i616 = i515 % i13;
                        if (strTrim.length() > 0) {
                            int i617 = b;
                            int i618 = i617 & 85;
                            int i619 = -(-((i617 ^ 85) | i618));
                            i2 = ((i618 | i619) << i17) - (i619 ^ i618);
                            a = i2 % 128;
                            if (i2 % i13 == 0) {
                            }
                            obj = obj2;
                            fArrC = new float[i20];
                            int i6110 = a;
                            int i6111 = i6110 & 107;
                            int i6112 = (i6110 | 107) & (~i6111);
                            int i6113 = -(-(i6111 << 1));
                            int i6114 = (i6112 & i6113) + (i6112 | i6113);
                            b = i6114 % 128;
                            int i6115 = i6114 % 2;
                            aVv avv4 = new aVv(strTrim.charAt(0), fArrC);
                            int i1610 = b;
                            int i1611 = i1610 & 67;
                            int i1612 = i1610 | 67;
                            int i1613 = (i1611 & i1612) + (i1612 | i1611);
                            a = i1613 % 128;
                            int i1614 = i1613 % 2;
                            arrayList.add(avv4);
                            int i1615 = a;
                            int i1616 = (i1615 & 43) + (i1615 | 43);
                            b = i1616 % 128;
                            int i1617 = i1616 % 2;
                        } else {
                            obj = obj2;
                        }
                        int i1618 = b;
                        int i1619 = i1618 & 119;
                        int i173 = -(-((i1618 ^ 119) | i1619));
                        int i174 = (i1619 & i173) + (i173 | i1619);
                        a = i174 % 128;
                        int i175 = i174 % 2;
                        i31 = i32;
                        i20 = 0;
                        i17 = 1;
                        i32 = (i32 ^ 1) + ((i32 & 1) << 1);
                        obj2 = obj;
                        i13 = 2;
                    }
                } else {
                    continue;
                }
                int i176 = i32 | 1;
                int i177 = i176 << 1;
                int i178 = -((~(i32 & 1)) & i176);
                i32 = ((i177 | i178) << i17) - (i178 ^ i177);
                int i179 = b;
                int i180 = i179 | 19;
                int i181 = i180 << 1;
                int i182 = -((~(i179 & 19)) & i180);
                int i183 = ((i181 | i182) << i17) - (i182 ^ i181);
                a = i183 % 128;
                int i184 = i183 % i13;
            }
            strTrim = str.substring(i31, i32).trim();
            int i516 = a;
            int i517 = i516 ^ 1;
            int i518 = (((i516 & i17) | i517) << i17) - i517;
            b = i518 % 128;
            int i6116 = i518 % i13;
            if (strTrim.length() > 0) {
                int i6117 = b;
                int i6118 = i6117 & 85;
                int i6119 = -(-((i6117 ^ 85) | i6118));
                i2 = ((i6118 | i6119) << i17) - (i6119 ^ i6118);
                a = i2 % 128;
                if (i2 % i13 == 0) {
                }
                obj = obj2;
                fArrC = new float[i20];
                int i61110 = a;
                int i61111 = i61110 & 107;
                int i61112 = (i61110 | 107) & (~i61111);
                int i61113 = -(-(i61111 << 1));
                int i61114 = (i61112 & i61113) + (i61112 | i61113);
                b = i61114 % 128;
                int i61115 = i61114 % 2;
                aVv avv5 = new aVv(strTrim.charAt(0), fArrC);
                int i16110 = b;
                int i16111 = i16110 & 67;
                int i16112 = i16110 | 67;
                int i16113 = (i16111 & i16112) + (i16112 | i16111);
                a = i16113 % 128;
                int i16114 = i16113 % 2;
                arrayList.add(avv5);
                int i16115 = a;
                int i16116 = (i16115 & 43) + (i16115 | 43);
                b = i16116 % 128;
                int i16117 = i16116 % 2;
            } else {
                obj = obj2;
            }
            int i16118 = b;
            int i16119 = i16118 & 119;
            int i1710 = -(-((i16118 ^ 119) | i16119));
            int i1711 = (i16119 & i1710) + (i1710 | i16119);
            a = i1711 % 128;
            int i1712 = i1711 % 2;
            i31 = i32;
            i20 = 0;
            i17 = 1;
            i32 = (i32 ^ 1) + ((i32 & 1) << 1);
            obj2 = obj;
            i13 = 2;
        }
    }
}
