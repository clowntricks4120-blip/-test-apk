package ivas.gov.bisp.enumeration.p077cw;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p064cj.h;
import ivas.gov.bisp.enumeration.p086i.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class A implements h {
    private static int a = 0;
    private static int b = 1;
    public final int c;
    public final S d;
    public final am e;
    public final byte[][] f;

    public A(int i, S s, am amVar, byte[][] bArr) {
        this.c = i;
        this.d = s;
        this.e = amVar;
        this.f = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r9 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r4 = (((r1 & (-104)) | ((~r1) & 103)) - (~(-(-((r1 & 103) << 1))))) - 1;
        ivas.gov.bisp.enumeration.p077cw.A.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (ivas.gov.bisp.enumeration.p077cw.A.class != r9.getClass()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p077cw.A.a;
        r4 = (r1 & 1) + (r1 | 1);
        r1 = r4 % 128;
        ivas.gov.bisp.enumeration.p077cw.A.b = r1;
        r4 = r4 % 2;
        r9 = (ivas.gov.bisp.enumeration.p077cw.A) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r8.c == r9.c) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r9 = r1 & 85;
        r2 = (r1 ^ 85) | r9;
        r4 = (r9 ^ r2) + ((r9 & r2) << 1);
        ivas.gov.bisp.enumeration.p077cw.A.a = r4 % 128;
        r4 = r4 % 2;
        r1 = r1 + 105;
        ivas.gov.bisp.enumeration.p077cw.A.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        r4 = r8.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        r6 = r1 ^ 107;
        r1 = (r1 & 107) << 1;
        r7 = ((r6 | r1) << 1) - (r1 ^ r6);
        ivas.gov.bisp.enumeration.p077cw.A.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r4.equals(r9.d) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p077cw.A.b;
        r2 = r9 & 73;
        r1 = ((((r9 ^ 73) | r2) << 1) - (~(-((r9 | 73) & (~r2))))) - 1;
        ivas.gov.bisp.enumeration.p077cw.A.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r9.d == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p077cw.A.b;
        r1 = (((r9 & (-38)) | ((~r9) & 37)) - (~(-(-((r9 & 37) << 1))))) - 1;
        ivas.gov.bisp.enumeration.p077cw.A.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if ((r1 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        r9 = 19 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        r1 = r8.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p077cw.A.b;
        r6 = r4 ^ 121;
        r4 = ((r4 & 121) | r6) << 1;
        r6 = -r6;
        r7 = ((r4 | r6) << 1) - (r4 ^ r6);
        ivas.gov.bisp.enumeration.p077cw.A.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        if (r1.equals(r9.e) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p077cw.A.b;
        r1 = r9 & 57;
        r9 = r9 | 57;
        r4 = (r1 & r9) + (r9 | r1);
        ivas.gov.bisp.enumeration.p077cw.A.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        if (r9.e == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p077cw.A.b + 106;
        r1 = (r9 ^ (-1)) + (r9 << 1);
        ivas.gov.bisp.enumeration.p077cw.A.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        if ((r1 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0107, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        r9 = java.util.Arrays.deepEquals(r8.f, r9.f);
        r1 = ivas.gov.bisp.enumeration.p077cw.A.a;
        r2 = r1 ^ 87;
        r1 = (r1 & 87) << 1;
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.p077cw.A.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        if ((r3 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        r0 = 7 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p077cw.A.a;
        r1 = ((r9 ^ 59) | (r9 & 59)) << 1;
        r9 = -(((~r9) & 59) | (r9 & (-60)));
        r3 = ((r1 | r9) << 1) - (r9 ^ r1);
        ivas.gov.bisp.enumeration.p077cw.A.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0142, code lost:
    
        if ((r3 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0144, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0145, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r9 = (r4 & 39) + (r4 | 39);
        ivas.gov.bisp.enumeration.p077cw.A.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if ((r9 % 2) != 0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p077cw.A.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 27;
        int i4 = i3 + ((i2 ^ 27) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.c;
        S s = this.d;
        int i7 = i2 & 107;
        int i8 = (~i7) & (i2 | 107);
        int i9 = i7 << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = 0;
        if (i10 % 2 == 0) {
            if (s != null) {
                i11 = 1;
                int iHashCode2 = s.hashCode();
                int i12 = b;
                int i13 = i12 & 13;
                int i14 = (i13 - (~(-(-((i12 ^ 13) | i13))))) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                iHashCode = i11;
                i11 = iHashCode2;
            } else {
                iHashCode = 1;
                int i16 = i2 ^ 119;
                int i17 = ((i2 & 119) | i16) << 1;
                int i18 = -i16;
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
            }
        } else if (s != null) {
            int iHashCode3 = s.hashCode();
            int i110 = b;
            int i111 = i110 & 13;
            int i112 = (i111 - (~(-(-((i110 ^ 13) | i111))))) - 1;
            a = i112 % 128;
            int i113 = i112 % 2;
            iHashCode = i11;
            i11 = iHashCode3;
        } else {
            iHashCode = 0;
            int i114 = i2 ^ 119;
            int i115 = ((i2 & 119) | i114) << 1;
            int i116 = -i114;
            int i117 = (i115 ^ i116) + ((i115 & i116) << 1);
            b = i117 % 128;
            int i21 = i117 % 2;
        }
        am amVar = this.e;
        if (amVar != null) {
            int i22 = a;
            int i23 = ((i22 ^ 117) | (i22 & 117)) << 1;
            int i24 = -(((~i22) & 117) | (i22 & (-118)));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            b = i25 % 128;
            if (i25 % 2 == 0) {
                amVar.hashCode();
                throw null;
            }
            iHashCode = amVar.hashCode();
            int i26 = b;
            int i27 = (i26 | 97) << 1;
            int i28 = -(i26 ^ 97);
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            a = i29 % 128;
            int i30 = i29 % 2;
        }
        int iDeepHashCode = Arrays.deepHashCode(this.f);
        int i31 = i6 * 31;
        int i32 = -(-i11);
        int i33 = i31 & i32;
        int i34 = (i31 ^ i32) | i33;
        int i35 = (i33 & i34) + (i34 | i33);
        int i36 = a;
        int i37 = i36 & 119;
        int i38 = ((i36 ^ 119) | i37) << 1;
        int i39 = -((i36 | 119) & (~i37));
        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
        b = i40 % 128;
        if (i40 % 2 == 0) {
            int i41 = (i35 >>> 31) / iHashCode;
            return iDeepHashCode % ((i41 & 2) + (2 | i41));
        }
        int i42 = (((i35 * 31) - (~(-(-iHashCode)))) - 1) * 31;
        return (((iDeepHashCode | i42) << 1) - (~(-(((~iDeepHashCode) & i42) | ((~i42) & iDeepHashCode))))) - 1;
    }

    public static A c(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        int i = 2 % 2;
        while (!(obj instanceof A)) {
            int i2 = 0;
            if (obj instanceof DataInputStream) {
                int i3 = b;
                int i4 = (i3 | 13) << 1;
                int i5 = -(i3 ^ 13);
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                DataInputStream dataInputStream2 = (DataInputStream) obj;
                int i8 = dataInputStream2.readInt();
                S sC = S.c(obj);
                int i9 = a;
                int i10 = ((i9 | 119) << 1) - (i9 ^ 119);
                b = i10 % 128;
                int i11 = i10 % 2;
                am amVarC = am.c(dataInputStream2.readInt());
                int i12 = amVarC.k;
                int i13 = a;
                int i14 = i13 + 113;
                b = i14 % 128;
                int i15 = i14 % 2;
                byte[][] bArr = new byte[i12][];
                int i16 = (-2) - (((i13 ^ 24) + ((i13 & 24) << 1)) ^ (-1));
                b = i16 % 128;
                int i17 = i16 % 2;
                while (i2 < i12) {
                    int i18 = a;
                    int i19 = (i18 ^ 42) + ((i18 & 42) << 1);
                    int i20 = (i19 ^ (-1)) + (i19 << 1);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = amVarC.j;
                    int i23 = (-2) - ((a + 34) ^ (-1));
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    byte[] bArr2 = new byte[i22];
                    bArr[i2] = bArr2;
                    dataInputStream2.readFully(bArr2);
                    int i25 = b;
                    int i26 = i25 & 65;
                    int i27 = ((i25 ^ 65) | i26) << 1;
                    int i28 = -((~i26) & (i25 | 65));
                    int i29 = (i27 & i28) + (i27 | i28);
                    a = i29 % 128;
                    if (i29 % 2 != 0) {
                        int i30 = i2 & 86;
                        i2 = (i30 - (~((i2 ^ 86) | i30))) - 1;
                    } else {
                        int i31 = ((i2 | (-6)) << 1) - (i2 ^ (-6));
                        i2 = ((i31 | 7) << 1) - (i31 ^ 7);
                    }
                    int i32 = (((i25 & (-20)) | ((~i25) & 19)) - (~(-(-((i25 & 19) << 1))))) - 1;
                    a = i32 % 128;
                    int i33 = i32 % 2;
                }
                A a2 = new A(i8, sC, amVarC, bArr);
                int i34 = b + 45;
                a = i34 % 128;
                int i35 = i34 % 2;
                return a2;
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                    int i36 = a;
                    int i37 = ((i36 | 124) << 1) - (i36 ^ 124);
                    int i38 = (i37 ^ (-1)) + (i37 << 1);
                    b = i38 % 128;
                    int i39 = i38 % 2;
                    try {
                        A aC = c(dataInputStream);
                        dataInputStream.close();
                        int i40 = a;
                        int i41 = (i40 & 1) + (i40 | 1);
                        b = i41 % 128;
                        int i42 = i41 % 2;
                        int i43 = i40 ^ 43;
                        int i44 = ((i40 & 43) | i43) << 1;
                        int i45 = -i43;
                        int i46 = (i44 & i45) + (i44 | i45);
                        b = i46 % 128;
                        if (i46 % 2 != 0) {
                            return aC;
                        }
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            int i47 = a;
                            int i48 = ((i47 ^ 67) - (~(-(-((i47 & 67) << 1))))) - 1;
                            b = i48 % 128;
                            if (i48 % 2 == 0) {
                                dataInputStream.close();
                                throw null;
                            }
                            dataInputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
            } else {
                if (!(obj instanceof InputStream)) {
                    StringBuilder sb = new StringBuilder();
                    int i49 = a + 51;
                    b = i49 % 128;
                    if (i49 % 2 == 0) {
                        sb.append("cannot parse ");
                        sb.append(obj);
                        int i50 = 38 / 0;
                    } else {
                        sb.append("cannot parse ");
                        sb.append(obj);
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                int i51 = b;
                int i52 = (((i51 | 6) << 1) - (i51 ^ 6)) - 1;
                a = i52 % 128;
                if (i52 % 2 != 0) {
                    i.q((InputStream) obj);
                    throw null;
                }
                obj = i.q((InputStream) obj);
                int i53 = b;
                int i54 = i53 & 99;
                int i55 = (i53 | 99) & (~i54);
                int i56 = -(-(i54 << 1));
                int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
                a = i57 % 128;
                int i58 = i57 % 2;
            }
        }
        int i59 = a;
        int i60 = i59 & 69;
        int i61 = -(-(i59 | 69));
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        b = i62 % 128;
        if (i62 % 2 != 0) {
            return (A) obj;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p064cj.h
    public byte[] getEncoded() {
        byte[][] bArr;
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-58)) | ((~i3) & 57);
        int i5 = -(-((i3 & 57) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            a.h().p(this.c);
            obj.hashCode();
            throw null;
        }
        a aVarH = a.h();
        aVarH.p(this.c);
        aVarH.l(this.d.getEncoded());
        int i7 = this.e.i;
        int i8 = a + 118;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        try {
            if (i9 % 2 == 0) {
                aVarH.p(i7);
                bArr = this.f;
                length = bArr.length;
                i = 1;
            } else {
                aVarH.p(i7);
                bArr = this.f;
                length = bArr.length;
                i = 0;
            }
            int i10 = b;
            int i11 = (i10 ^ 31) + ((i10 & 31) << 1);
            int i12 = i11 % 128;
            a = i12;
            int i13 = i11 % 2;
            int i14 = i12 ^ 55;
            int i15 = ((i12 & 55) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 & i16) + (i15 | i16);
            b = i17 % 128;
            int i18 = i17 % 2;
            while (i < length) {
                int i19 = b + 31;
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    byte[] bArr2 = bArr[i];
                    obj.hashCode();
                    throw null;
                }
                ((ByteArrayOutputStream) aVarH.c).write(bArr[i]);
                int i20 = i + 2;
                i = (i20 << 1) + (i20 ^ (-1));
                int i21 = a + 109;
                b = i21 % 128;
                int i22 = i21 % 2;
            }
            byte[] bArrJ = aVarH.j();
            int i23 = b + 87;
            a = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 66 / 0;
            }
            return bArrJ;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
