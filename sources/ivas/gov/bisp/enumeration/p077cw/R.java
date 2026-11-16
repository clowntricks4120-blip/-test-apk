package ivas.gov.bisp.enumeration.p077cw;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p086i.a;
import ivas.gov.bisp.enumeration.p101x.i;
import java.io.IOException;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class R extends L {
    public static bCd R = null;
    public static bCd[] S = null;
    private static int a = 0x00000000;
    private static int b = 0x00000001;
    public final int T;
    public final am U;
    public final byte[] V;
    public final T W;
    public final byte[] X;
    public final int Y;
    public final i Z;
    public int aa;
    public v ab;
    public final Map<bCd, byte[]> ac;

    public static class bCd {
        private static int a = 0x00000000;
        private static int b = 0x00000001;
        public final int c;

        public bCd(int i) {
            this.c = i;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 69;
            int i4 = (i2 | 69) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            int i7 = i6 % 128;
            a = i7;
            boolean z = false;
            if (i6 % 2 == 0 ? (obj instanceof bCd) : (obj instanceof bCd)) {
                if (((bCd) obj).c == this.c) {
                    int i8 = i7 ^ 3;
                    int i9 = ((i7 & 3) | i8) << 1;
                    int i10 = -i8;
                    int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                    int i12 = i11 % 128;
                    b = i12;
                    int i13 = i11 % 2;
                    int i14 = i12 & 111;
                    int i15 = ((i12 ^ 111) | i14) << 1;
                    int i16 = -((i12 | 111) & (~i14));
                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                }
            }
            int i19 = a;
            int i20 = (i19 | 55) << 1;
            int i21 = -(((~i19) & 55) | (i19 & (-56)));
            int i22 = (i20 & i21) + (i21 | i20);
            b = i22 % 128;
            int i23 = i22 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 21;
            int i4 = (~i3) & (i2 | 21);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            int i7 = this.c;
            int i8 = i2 & 79;
            int i9 = i2 | 79;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            return i7;
        }
    }

    static {
        bCd bcd = new bCd(1);
        R = bcd;
        int i = a;
        int i2 = ((i & 114) + (i | 114)) - 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        bCd[] bcdArr = new bCd[129];
        S = bcdArr;
        bcdArr[1] = bcd;
        int i4 = i & 91;
        int i5 = ((((i ^ 91) | i4) << 1) - (~(-((i | 91) & (~i4))))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 2;
        } else {
            int i7 = 2 % 2;
        }
        int i8 = 2;
        while (true) {
            bCd[] bcdArr2 = S;
            if (i8 >= bcdArr2.length) {
                break;
            }
            bcdArr2[i8] = new bCd(i8);
            int i9 = ((i8 | 2) << 1) - (i8 ^ 2);
            i8 = (i9 ^ (-1)) + (i9 << 1);
            int i10 = a;
            int i11 = i10 & 11;
            int i12 = (i10 | 11) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            b = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
        }
        int i17 = b;
        int i18 = i17 & 113;
        int i19 = (((i17 | 113) & (~i18)) - (~(i18 << 1))) - 1;
        a = i19 % 128;
        if (i19 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public R(am amVar, T t, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.U = amVar;
        this.W = t;
        this.aa = i;
        this.V = j.c(bArr);
        this.T = i2;
        this.X = j.c(bArr2);
        int i3 = amVar.k;
        int i4 = i3 & 1;
        int i5 = (i3 | 1) & (~i4);
        int i6 = -(-(i4 << 1));
        this.Y = 1 << ((i5 & i6) + (i5 | i6));
        this.ac = new WeakHashMap();
        this.Z = m.b(amVar.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r1 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r1 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p077cw.am.c(r11.readInt());
        r1 = r11.readInt();
        r3 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r5 = r3 & 41;
        r3 = -(-((r3 ^ 41) | r5));
        r6 = ((r5 | r3) << 1) - (r3 ^ r5);
        ivas.gov.bisp.enumeration.p077cw.R.b = r6 % 128;
        r6 = r6 % 2;
        r5 = ivas.gov.bisp.enumeration.p077cw.T.c(r1);
        r7 = new byte[16];
        r1 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r6 = r1 & 91;
        r3 = ((r1 ^ 91) | r6) << 1;
        r1 = -((r1 | 91) & (~r6));
        r6 = ((r3 | r1) << 1) - (r1 ^ r3);
        ivas.gov.bisp.enumeration.p077cw.R.a = r6 % 128;
        r6 = r6 % 2;
        r11.readFully(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r6 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        r6 = r11.readInt();
        r8 = r11.readInt();
        r1 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r3 = ((r1 | 97) << 1) - (r1 ^ 97);
        ivas.gov.bisp.enumeration.p077cw.R.a = r3 % 128;
        r3 = r3 % 2;
        r1 = r11.readInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (r1 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r9 = r3 & 7;
        r3 = (((r3 | 7) & (~r9)) - (~(r9 << 1))) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if ((r3 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (r1 > r11.available()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        r9 = new byte[r1];
        r11.readFully(r9);
        r11 = new ivas.gov.bisp.enumeration.p077cw.R(r4, r5, r6, r7, r8, r9);
        r1 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r2 = (r1 & 79) + (r1 | 79);
        ivas.gov.bisp.enumeration.p077cw.R.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c0, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("secret length exceeded ");
        r0.append(r11.available());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        throw new java.io.IOException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        r11.available();
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        throw new java.lang.IllegalStateException("secret length less than zero");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        r11.readInt();
        r11.readInt();
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ef, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        throw new java.lang.IllegalStateException("expected version 0 lms private key");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p077cw.R c(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p077cw.R.c(java.lang.Object):ivas.gov.bisp.enumeration.cw.R");
    }

    public byte[] F(int i) throws IOException {
        bCd bcd;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 61) << 1) - (i3 ^ 61);
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (i >= this.Y) {
            byte[] bArrL = L(i);
            int i6 = a;
            int i7 = (-2) - (((i6 ^ 52) + ((i6 & 52) << 1)) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return bArrL;
            }
            obj.hashCode();
            throw null;
        }
        int i8 = ((i3 & (-92)) | ((~i3) & 91)) + ((i3 & 91) << 1);
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        bCd[] bcdArr = S;
        if (i < bcdArr.length) {
            int i11 = ((i9 & 88) + (i9 | 88)) - 1;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                bCd bcd2 = bcdArr[i];
                obj.hashCode();
                throw null;
            }
            bcd = bcdArr[i];
            int i12 = i9 + 13;
            b = i12 % 128;
            int i13 = i12 % 2;
        } else {
            bCd bcd3 = new bCd(i);
            int i14 = b + 45;
            a = i14 % 128;
            int i15 = i14 % 2;
            bcd = bcd3;
        }
        byte[] bArrM = M(bcd);
        int i16 = a;
        int i17 = (i16 & (-2)) | ((~i16) & 1);
        int i18 = -(-((i16 & 1) << 1));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        b = i19 % 128;
        int i20 = i19 % 2;
        return bArrM;
    }

    public final byte[] M(bCd bcd) {
        synchronized (this.ac) {
            byte[] bArr = this.ac.get(bcd);
            if (bArr != null) {
                return bArr;
            }
            byte[] bArrL = L(bcd.c);
            this.ac.put(bcd, bArrL);
            return bArrL;
        }
    }

    public byte[] N() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = ((i2 | 71) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArrC = j.c(this.V);
        int i6 = b + 51;
        a = i6 % 128;
        int i7 = i6 % 2;
        return bArrC;
    }

    public v O() {
        v vVar;
        synchronized (this) {
            if (this.ab == null) {
                this.ab = new v(this.U, this.W, M(R), this.V);
            }
            vVar = this.ab;
        }
        return vVar;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = -(-((i2 ^ 83) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            j.h(this.V);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = this.aa;
        int iH = j.h(this.V);
        am amVar = this.U;
        if (amVar != null) {
            int i7 = b + 46;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            iHashCode = amVar.hashCode();
            if (i9 != 0) {
                int i10 = 89 / 0;
            }
            int i11 = b + 91;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 5 / 5;
            }
        } else {
            int i13 = b;
            int i14 = i13 & 119;
            int i15 = (i13 | 119) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 & i16) + (i15 | i16);
            a = i17 % 128;
            int i18 = i17 % 2;
            iHashCode = 0;
        }
        T t = this.W;
        if (t != null) {
            int i19 = a;
            int i20 = i19 & 115;
            int i21 = (i20 - (~(-(-((i19 ^ 115) | i20))))) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
            iHashCode2 = t.hashCode();
            int i23 = a;
            int i24 = i23 & 115;
            int i25 = i23 | 115;
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            int i27 = i26 % 2;
        } else {
            int i28 = (-2) - ((b + 46) ^ (-1));
            a = i28 % 128;
            int i29 = i28 % 2;
            iHashCode2 = 0;
        }
        int i30 = this.T;
        int iH2 = j.h(this.X);
        int i31 = a;
        int i32 = i31 & 87;
        int i33 = ((i31 | 87) & (~i32)) + (i32 << 1);
        int i34 = i33 % 128;
        b = i34;
        int i35 = i33 % 2;
        v vVar = this.ab;
        if (vVar != null) {
            int i36 = i34 ^ 103;
            int i37 = ((i34 & 103) | i36) << 1;
            int i38 = -i36;
            int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
            a = i39 % 128;
            int i40 = i39 % 2;
            iHashCode3 = vVar.hashCode();
            int i41 = a;
            int i42 = ((i41 ^ 61) | (i41 & 61)) << 1;
            int i43 = -(((~i41) & 61) | (i41 & (-62)));
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            b = i44 % 128;
            int i45 = i44 % 2;
        } else {
            iHashCode3 = 0;
        }
        int i46 = -(-(i6 * 31));
        int i47 = iH & i46;
        int i48 = (i46 ^ iH) | i47;
        int i49 = ((i47 ^ i48) + ((i48 & i47) << 1)) * 31;
        int i50 = -(~iHashCode);
        int i51 = ((i49 ^ i50) + ((i50 & i49) << 1)) - 1;
        int i52 = b;
        int i53 = i52 | 39;
        int i54 = i53 << 1;
        int i55 = -((~(i52 & 39)) & i53);
        int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
        int i57 = i56 % 128;
        a = i57;
        int i58 = i56 % 2;
        int i59 = i51 * 31;
        int i60 = (i59 | iHashCode2) << 1;
        int i61 = -(((~i59) & iHashCode2) | ((~iHashCode2) & i59));
        int i62 = (((i60 | i61) << 1) - (i60 ^ i61)) * 31;
        int i63 = (iH2 + ((((i62 | i30) << 1) - (i62 ^ i30)) * 31)) * 31;
        int i64 = i57 & 109;
        int i65 = (~i64) & (i57 | 109);
        int i66 = -(-(i64 << 1));
        int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
        b = i67 % 128;
        int i68 = i67 % 2;
        int i69 = -(-iHashCode3);
        int i70 = (i63 & i69) + (i69 | i63);
        int i71 = (i57 & 87) + (i57 | 87);
        b = i71 % 128;
        if (i71 % 2 == 0) {
            int i72 = 0 / 0;
        }
        return i70;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r8 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r5 = r1 & 51;
        r4 = ((r1 ^ 51) | r5) << 1;
        r1 = -((r1 | 51) & (~r5));
        r5 = (r4 & r1) + (r1 | r4);
        ivas.gov.bisp.enumeration.p077cw.R.a = r5 % 128;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if ((r5 % 2) != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (ivas.gov.bisp.enumeration.p077cw.R.class != r8.getClass()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r5 = r4 & 81;
        r5 = (r5 - (~((r4 ^ 81) | r5))) - 1;
        r4 = r5 % 128;
        ivas.gov.bisp.enumeration.p077cw.R.b = r4;
        r5 = r5 % 2;
        r8 = (ivas.gov.bisp.enumeration.p077cw.R) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r7.aa == r8.aa) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        r8 = (((r4 | 89) << 1) - (~(-(r4 ^ 89)))) - 1;
        r1 = r8 % 128;
        ivas.gov.bisp.enumeration.p077cw.R.a = r1;
        r8 = r8 % 2;
        r8 = r1 & 37;
        r8 = (r8 - (~(-(-((r1 ^ 37) | r8))))) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if ((r8 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        r8 = 55 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r7.T == r8.T) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        r8 = ((r4 & (-102)) | ((~r4) & 101)) + ((r4 & 101) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.a = r8 % 128;
        r8 = r8 % 2;
        r8 = (((r4 ^ 97) | (r4 & 97)) << 1) - ((r4 & (-98)) | ((~r4) & 97));
        ivas.gov.bisp.enumeration.p077cw.R.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        if ((r8 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        r8 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        if (java.util.Arrays.equals(r7.V, r8.V) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r1 = r8 & 103;
        r8 = (r8 ^ 103) | r1;
        r4 = (r1 & r8) + (r8 | r1);
        ivas.gov.bisp.enumeration.p077cw.R.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        if ((r4 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        r4 = r7.U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        if (r4 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r6 = r5 & 83;
        r6 = r6 + ((r5 ^ 83) | r6);
        ivas.gov.bisp.enumeration.p077cw.R.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        if ((r6 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (r4.equals(r8.U) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r1 = r8 & 75;
        r8 = -(-(r8 | 75));
        r4 = (r1 ^ r8) + ((r8 & r1) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0106, code lost:
    
        r4.equals(r8.U);
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        if (r8.U == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p077cw.R.b + 81;
        ivas.gov.bisp.enumeration.p077cw.R.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
    
        r4 = r7.W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
    
        if (r4 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r6 = (r5 ^ 37) + ((r5 & 37) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
    
        if ((r6 % 2) != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
    
        if (r4.equals(r8.W) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r1 = ((r8 & 47) - (~(r8 | 47))) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0146, code lost:
    
        if ((r1 % 2) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r8 = 5 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
    
        r4.equals(r8.W);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0153, code lost:
    
        if (r8.W == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p077cw.R.a + 35;
        ivas.gov.bisp.enumeration.p077cw.R.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
    
        if ((r8 % 2) != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        r8 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0163, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016c, code lost:
    
        if (java.util.Arrays.equals(r7.X, r8.X) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r1 = ((r8 ^ 40) + ((r8 & 40) << 1)) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r1 % 128;
        r1 = r1 % 2;
        r1 = ((r8 ^ 69) - (~(-(-((r8 & 69) << 1))))) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
    
        if ((r1 % 2) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018d, code lost:
    
        r8 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0190, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0191, code lost:
    
        r2 = r7.ab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
    
        if (r2 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r5 = (r4 ^ 59) + ((r4 & 59) << 1);
        r4 = r5 % 128;
        ivas.gov.bisp.enumeration.p077cw.R.a = r4;
        r5 = r5 % 2;
        r8 = r8.ab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a4, code lost:
    
        if (r8 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a6, code lost:
    
        r5 = r4 & 19;
        r4 = -(-(r4 | 19));
        r6 = ((r5 | r4) << 1) - (r4 ^ r5);
        ivas.gov.bisp.enumeration.p077cw.R.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b6, code lost:
    
        if ((r6 % 2) == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b8, code lost:
    
        r8 = r2.equals(r8);
        r1 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r2 = (r1 & 106) + (r1 | 106);
        r1 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.p077cw.R.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cc, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cd, code lost:
    
        r2.equals(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d1, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r2 = ((r8 | 97) << 1) - (r8 ^ 97);
        ivas.gov.bisp.enumeration.p077cw.R.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01de, code lost:
    
        if ((r2 % 2) != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e1, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e5, code lost:
    
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e9, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r1 = r8 & 29;
        r8 = r8 | 29;
        r4 = (r1 ^ r8) + ((r8 & r1) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r8 = r1 & 25;
        r8 = (r8 - (~((r1 ^ 25) | r8))) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p077cw.R.equals(java.lang.Object):boolean");
    }

    @Override // ivas.gov.bisp.enumeration.p077cw.L, ivas.gov.bisp.enumeration.p064cj.h
    public byte[] getEncoded() {
        a aVarH;
        am amVar;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 79;
        int i4 = -(-(i2 | 79));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            aVarH = a.h();
            aVarH.p(0);
            amVar = this.U;
        } else {
            aVarH = a.h();
            aVarH.p(0);
            amVar = this.U;
        }
        int i6 = b;
        int i7 = i6 & 109;
        int i8 = (i6 | 109) & (~i7);
        int i9 = i7 << 1;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            aVarH.p(amVar.i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        aVarH.p(amVar.i);
        aVarH.p(this.W.h);
        byte[] bArr = this.V;
        int i11 = a;
        int i12 = ((i11 & 86) + (i11 | 86)) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        aVarH.l(bArr);
        aVarH.p(this.aa);
        int i14 = a;
        int i15 = (i14 ^ 75) + ((i14 & 75) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        aVarH.p(this.T);
        byte[] bArr2 = this.X;
        int i17 = b;
        int i18 = (i17 & 13) + (i17 | 13);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            aVarH.p(bArr2.length);
            aVarH.l(this.X);
            int i19 = 87 / 0;
        } else {
            aVarH.p(bArr2.length);
            aVarH.l(this.X);
        }
        byte[] bArrJ = aVarH.j();
        int i20 = a;
        int i21 = (i20 ^ 114) + ((i20 & 114) << 1);
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
        return bArrJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x05a3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x05a4, code lost:
    
        ivas.gov.bisp.enumeration.p100w.r.h(r0, r25.Z);
        r25.Z.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x05af, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        ivas.gov.bisp.enumeration.p100w.r.h(N(), r25.Z);
        r3 = r25.Z;
        r11 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r12 = r11 & 37;
        r12 = (r12 - (~(-(-((r11 ^ 37) | r12))))) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.b = r12 % 128;
        r12 = r12 % 2;
        ivas.gov.bisp.enumeration.p100w.r.ae(r26, r3);
        r3 = r25.Z;
        r3.e((byte) -126);
        r12 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r13 = (r12 ^ 83) + ((r12 & 83) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.a = r13 % 128;
        r13 = r13 % 2;
        r3.e((byte) -126);
        r3 = r25.W;
        r11 = N();
        r12 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r13 = (((r12 | 76) << 1) - (r12 ^ 76)) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.b = r13 % 128;
        r13 = r13 % 2;
        r10 = -r10;
        r12 = r26 & r10;
        r12 = r12 + ((r26 ^ r10) | r12);
        r1 = ivas.gov.bisp.enumeration.p064cj.j.c(r25.X);
        r10 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r13 = r10 & 51;
        r13 = (r13 - (~((r10 ^ 51) | r13))) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009a, code lost:
    
        if ((r13 % 2) != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009c, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p077cw.m.b(r3.l);
        r13 = ivas.gov.bisp.enumeration.p086i.a.h();
        r13.l(r11);
        r13.p(r12);
        r14 = r13.c;
        r15 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r16 = (r15 ^ 30) + ((r15 & 30) << 1);
        r15 = (r16 ^ (-1)) + (r16 << 1);
        ivas.gov.bisp.enumeration.p077cw.R.b = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c4, code lost:
    
        if ((r15 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c6, code lost:
    
        ((java.io.ByteArrayOutputStream) r14).write(127);
        r14 = (java.io.ByteArrayOutputStream) r13.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d2, code lost:
    
        ((java.io.ByteArrayOutputStream) r14).write(-128);
        r14 = (java.io.ByteArrayOutputStream) r13.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00db, code lost:
    
        r15 = ivas.gov.bisp.enumeration.p077cw.R.a + 85;
        ivas.gov.bisp.enumeration.p077cw.R.b = r15 % 128;
        r15 = r15 % 2;
        r14.write(-128);
        r4 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r7 = (r4 & (-14)) | ((~r4) & 13);
        r4 = (r4 & 13) << 1;
        r14 = (r7 & r4) + (r4 | r7);
        ivas.gov.bisp.enumeration.p077cw.R.a = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0108, code lost:
    
        if (((java.io.ByteArrayOutputStream) r13.c).size() >= 22) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010a, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r7 = r4 ^ 63;
        r4 = ((r4 & 63) | r7) << 1;
        r7 = -r7;
        r4 = (r4 ^ r7) + ((r4 & r7) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.a = r4 % 128;
        r4 = r4 % 2;
        ((java.io.ByteArrayOutputStream) r13.c).write(0);
        r4 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r6 = (((~r4) & 33) | (r4 & (-34))) + ((r4 & 33) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0134, code lost:
    
        if ((r6 % 2) == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0136, code lost:
    
        r15 = 4 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0138, code lost:
    
        r4 = r13.j();
        r6 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r13 = (r6 ^ 125) + ((r6 & 125) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.a = r13 % 128;
        r13 = r13 % 2;
        r10.f(r4, 0, r4.length);
        r4 = ivas.gov.bisp.enumeration.p077cw.m.b(r3.l);
        r6 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r7 = ((~r6) & 33) | (r6 & (-34));
        r6 = -(-((r6 & 33) << 1));
        r13 = (r7 ^ r6) + ((r6 & r7) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.b = r13 % 128;
        r13 = r13 % 2;
        r6 = ivas.gov.bisp.enumeration.p086i.a.h();
        r6.l(r11);
        r7 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r13 = ((r7 ^ 20) + ((r7 & 20) << 1)) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x017f, code lost:
    
        if ((r13 % 2) != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0181, code lost:
    
        r6.p(r12);
        r7 = r4.d();
        r13 = ivas.gov.bisp.enumeration.p077cw.R.a - (-125);
        ivas.gov.bisp.enumeration.p077cw.R.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0190, code lost:
    
        if ((r13 % 2) == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0192, code lost:
    
        r5 = ((java.io.ByteArrayOutputStream) r6.c).size();
        r13 = ivas.gov.bisp.enumeration.p077cw.R.b + 77;
        ivas.gov.bisp.enumeration.p077cw.R.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a5, code lost:
    
        if ((r13 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01a9, code lost:
    
        if (r5 >= (r7 + 23)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ac, code lost:
    
        r13 = r7 & 23;
        r14 = (~r13) & (r7 | 23);
        r13 = r13 << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01bb, code lost:
    
        if (r5 >= (((r14 | r13) << 1) - (r13 ^ r14))) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01bd, code lost:
    
        ((java.io.ByteArrayOutputStream) r6.c).write(0);
        r5 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r13 = (((r5 | 114) << 1) - (r5 ^ 114)) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d2, code lost:
    
        if ((r13 % 2) == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d4, code lost:
    
        r5 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d9, code lost:
    
        r5 = r6.j();
        r6 = ivas.gov.bisp.enumeration.p077cw.m.b(r3.l);
        r7 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r13 = r7 & 7;
        r7 = -(-(r7 | 7));
        r14 = (r13 & r7) + (r7 | r13);
        ivas.gov.bisp.enumeration.p077cw.R.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f4, code lost:
    
        if ((r14 % 2) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f6, code lost:
    
        r7 = r3.k;
        r13 = r3.i;
        r3 = r3.j;
        r14 = 35 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0200, code lost:
    
        r7 = r3.k;
        r13 = r3.i;
        r3 = r3.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0206, code lost:
    
        r14 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r15 = r14 & 65;
        r8 = (((~r15) & (r14 | 65)) - (~(r15 << 1))) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r8 % 128;
        r8 = r8 % 2;
        r8 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021a, code lost:
    
        if (r8 >= r7) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x021c, code lost:
    
        r15 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r9 = ((r15 | 25) << 1) - ((r15 & (-26)) | ((~r15) & 25));
        r0 = r9 % 128;
        ivas.gov.bisp.enumeration.p077cw.R.a = r0;
        r9 = r9 % r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0234, code lost:
    
        if (r8 >= ((-2) - (r7 ^ (-1)))) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0236, code lost:
    
        r9 = ((r0 ^ 62) + ((r0 & 62) << 1)) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.b = r9 % 128;
        r9 = r9 % r2;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0245, code lost:
    
        r0 = ((r15 ^ 17) | (r15 & 17)) << 1;
        r9 = -((r15 & (-18)) | ((~r15) & 17));
        r15 = (r0 & r9) + (r0 | r9);
        ivas.gov.bisp.enumeration.p077cw.R.a = r15 % 128;
        r15 = r15 % r2;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0262, code lost:
    
        if (r5.length < r6.d()) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0264, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r15 = r9 & 117;
        r15 = r15 + ((r9 ^ 117) | r15);
        ivas.gov.bisp.enumeration.p077cw.R.a = r15 % 128;
        r15 = r15 % r2;
        r6.f(r11, 0, r11.length);
        r9 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r15 = r9 & 61;
        r15 = r15 + ((r9 ^ 61) | r15);
        ivas.gov.bisp.enumeration.p077cw.R.a = r15 % 128;
        r15 = r15 % r2;
        r6.e((byte) (r12 >>> 24));
        r15 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r2 = r15 & 71;
        r21 = ((r15 ^ 71) | r2) << 1;
        r2 = -((~r2) & (r15 | 71));
        r15 = (r21 & r2) + (r21 | r2);
        ivas.gov.bisp.enumeration.p077cw.R.a = r15 % 128;
        r15 = r15 % 2;
        r6.e((byte) (r12 >>> 16));
        r6.e((byte) (r12 >>> 8));
        r2 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r9 = r2 & 19;
        r9 = r9 + ((r2 ^ 19) | r9);
        ivas.gov.bisp.enumeration.p077cw.R.b = r9 % 128;
        r9 = r9 % 2;
        r6.e((byte) r12);
        r2 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r9 = (r2 | 33) << 1;
        r2 = -((r2 & (-34)) | (33 & (~r2)));
        r2 = ((r9 | r2) << 1) - (r2 ^ r9);
        ivas.gov.bisp.enumeration.p077cw.R.b = r2 % 128;
        r2 = r2 % 2;
        r6.e((byte) (r14 >>> 8));
        r6.e((byte) r14);
        r2 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r9 = ((r2 & 76) + (r2 | 76)) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r9 % 128;
        r9 = r9 % 2;
        r6.e((byte) -1);
        r2 = r1.length;
        r9 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r15 = (r9 & 17) + (r9 | 17);
        ivas.gov.bisp.enumeration.p077cw.R.b = r15 % 128;
        r15 = r15 % 2;
        r6.f(r1, 0, r2);
        r6.b(r5, 23);
        r9 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r2 = (((77 & (~r9)) | (r9 & (-78))) - (~((r9 & 77) << 1))) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x032c, code lost:
    
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x032e, code lost:
    
        r2 = r9 & 9;
        r0 = ((r9 ^ 9) | r2) << 1;
        r2 = -((~r2) & (r9 | 9));
        r0 = (r0 ^ r2) + ((r0 & r2) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0347, code lost:
    
        if ((r0 % 2) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0349, code lost:
    
        r14 = r14 % 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x034c, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x034e, code lost:
    
        r0 = (short) r8;
        r15 = r9 & 19;
        r9 = -(-((r9 ^ 19) | r15));
        r9 = (r15 ^ r9) + ((r9 & r15) << 1);
        r15 = r9 % 128;
        ivas.gov.bisp.enumeration.p077cw.R.b = r15;
        r9 = r9 % 2;
        r5[20] = (byte) (r0 >>> 8);
        r5[21] = (byte) r0;
        r15 = r15 + 121;
        ivas.gov.bisp.enumeration.p077cw.R.a = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0377, code lost:
    
        if ((r15 % 2) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0379, code lost:
    
        r15 = 4 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x037e, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (r26 >= r10) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x037f, code lost:
    
        r15 = 1 << r3;
        r9 = (r15 ^ (-1)) | r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x038a, code lost:
    
        if (r2 >= ((r15 & r9) + (r9 | r15))) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x038c, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r0 = r9 & 79;
        r15 = ((r9 ^ 79) | r0) << 1;
        r0 = -((~r0) & (r9 | 79));
        r0 = (r15 & r0) + (r0 | r15);
        ivas.gov.bisp.enumeration.p077cw.R.a = r0 % 128;
        r0 = r0 % 2;
        r5[22] = (byte) r2;
        r0 = ((r9 & 94) + (r9 | 94)) - 1;
        ivas.gov.bisp.enumeration.p077cw.R.a = r0 % 128;
        r0 = r0 % 2;
        r4.f(r5, 0, r5.length);
        r0 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r9 = (r0 & (-26)) | (25 & (~r0));
        r0 = (r0 & 25) << 1;
        r15 = (r9 & r0) + (r0 | r9);
        ivas.gov.bisp.enumeration.p077cw.R.b = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03d7, code lost:
    
        if ((r15 % 2) != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03d9, code lost:
    
        r4.b(r5, 99);
        r2 = r2 + 196;
        r2 = ((r2 | (-99)) << 1) - (r2 ^ (-99));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x03ea, code lost:
    
        r4.b(r5, 23);
        r0 = ((r2 ^ 35) + ((r2 & 35) << 1)) - 1;
        r2 = r0 & (-33);
        r2 = (r2 - (~(-(-((r0 ^ (-33)) | r2))))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0403, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r0 = (35 & (~r9)) | (r9 & (-36));
        r9 = -(-((r9 & 35) << 1));
        r0 = (r0 ^ r9) + ((r0 & r9) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0422, code lost:
    
        r10.f(r5, 23, r13);
        r0 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r2 = (r0 & 46) + (r0 | 46);
        r0 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.p077cw.R.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0439, code lost:
    
        if ((r0 % 2) != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x043b, code lost:
    
        r8 = r8 + 135;
        r0 = (r8 & (-59)) + (r8 | (-59));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0442, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0444, code lost:
    
        r0 = (((r8 ^ (-102)) | (r8 & (-102))) << 1) - (((~r8) & (-102)) | (r8 & 101));
        r8 = ((r0 | 104) << 1) - (r0 ^ 104);
        r0 = (r8 ^ (-1)) + (r8 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x045d, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x046a, code lost:
    
        throw new java.lang.IllegalArgumentException("target length is less than digest size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x046b, code lost:
    
        r0 = r10.d();
        r1 = new byte[r0];
        r2 = (-2) - ((ivas.gov.bisp.enumeration.p077cw.R.b + 72) ^ (-1));
        ivas.gov.bisp.enumeration.p077cw.R.a = r2 % 128;
        r2 = r2 % 2;
        r10.b(r1, 0);
        r3 = r25.Z;
        r4 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r5 = (r4 | 105) << 1;
        r4 = -(((~r4) & 105) | (r4 & (-106)));
        r6 = (r5 & r4) + (r4 | r5);
        ivas.gov.bisp.enumeration.p077cw.R.b = r6 % 128;
        r6 = r6 % 2;
        r3.f(r1, 0, r0);
        r0 = r25.Z.d();
        r1 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r3 = (r1 ^ 109) + ((r1 & 109) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.a = r3 % 128;
        r3 = r3 % 2;
        r0 = new byte[r0];
        r25.Z.b(r0, 0);
        r1 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r3 = ((r1 & 12) + (r1 | 12)) - 1;
        r1 = r3 % 128;
        ivas.gov.bisp.enumeration.p077cw.R.a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x04cf, code lost:
    
        if ((r3 % 2) == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x04d1, code lost:
    
        r3 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04d5, code lost:
    
        r3 = (r1 ^ 33) + ((r1 & 33) << 1);
        ivas.gov.bisp.enumeration.p077cw.R.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x04e3, code lost:
    
        if ((r3 % 2) != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x04e5, code lost:
    
        r4 = 91 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x04ea, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x04ed, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x04ee, code lost:
    
        r0 = null;
        r6.p(r12);
        r4.d();
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x04f9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x04fa, code lost:
    
        r0 = null;
        ivas.gov.bisp.enumeration.p077cw.m.b(r3.l);
        ivas.gov.bisp.enumeration.p086i.a.h();
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0507, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0508, code lost:
    
        r0 = r26 * 2;
        r3 = F(r0);
        r0 = F(r0 - (-1));
        r4 = ivas.gov.bisp.enumeration.p077cw.R.a + 91;
        ivas.gov.bisp.enumeration.p077cw.R.b = r4 % 128;
        r4 = r4 % 2;
        ivas.gov.bisp.enumeration.p100w.r.h(N(), r25.Z);
        r4 = r25.Z;
        r6 = ivas.gov.bisp.enumeration.p077cw.R.a + 19;
        ivas.gov.bisp.enumeration.p077cw.R.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0534, code lost:
    
        if ((r6 % 2) != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0536, code lost:
    
        ivas.gov.bisp.enumeration.p100w.r.ae(r26, r4);
        r1 = r25.Z;
        r1.e((byte) 75);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0541, code lost:
    
        ivas.gov.bisp.enumeration.p100w.r.ae(r26, r4);
        r1 = r25.Z;
        r1.e((byte) -125);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0549, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p077cw.R.b;
        r6 = r4 & 83;
        r4 = -(-((r4 ^ 83) | r6));
        r7 = (r6 & r4) + (r4 | r6);
        ivas.gov.bisp.enumeration.p077cw.R.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x055c, code lost:
    
        if ((r7 % 2) == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x055e, code lost:
    
        r1.e((byte) 68);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0563, code lost:
    
        ivas.gov.bisp.enumeration.p100w.r.h(r3, r25.Z);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0569, code lost:
    
        r1.e((byte) -125);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x056d, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p077cw.R.b + 9;
        ivas.gov.bisp.enumeration.p077cw.R.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0577, code lost:
    
        if ((r1 % 2) != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0579, code lost:
    
        ivas.gov.bisp.enumeration.p100w.r.h(r0, r25.Z);
        r0 = new byte[r25.Z.d()];
        r25.Z.b(r0, 0);
        r1 = ivas.gov.bisp.enumeration.p077cw.R.a;
        r3 = (((r1 ^ 111) | (r1 & 111)) << 1) - (((~r1) & 111) | (r1 & (-112)));
        ivas.gov.bisp.enumeration.p077cw.R.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r26 >= r10) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] L(int r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p077cw.R.L(int):byte[]");
    }
}
