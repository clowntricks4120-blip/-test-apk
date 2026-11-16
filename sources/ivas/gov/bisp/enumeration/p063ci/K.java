package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class K extends AbstractC0272r {
    private static int a = 0;
    private static int b = 1;

    public K(i iVar) {
        super(iVar.f().g("DER"), 0);
    }

    public K(byte[] bArr) {
        super(bArr, 0);
    }

    public K(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r2 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r2 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r6 = (ivas.gov.bisp.enumeration.p063ci.G) r6;
        r1 = new ivas.gov.bisp.enumeration.p063ci.K(r6.d, r6.e);
        r6 = ivas.gov.bisp.enumeration.p063ci.K.b;
        r2 = (r6 & (-92)) | ((~r6) & 91);
        r6 = -(-((r6 & 91) << 1));
        r3 = (r2 ^ r6) + ((r6 & r2) << 1);
        ivas.gov.bisp.enumeration.p063ci.K.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if ((r3 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r2 = (r1 & (-42)) | ((~r1) & 41);
        r1 = -(-((r1 & 41) << 1));
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.p063ci.K.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if ((r3 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        r6 = (ivas.gov.bisp.enumeration.p063ci.K) ivas.gov.bisp.enumeration.p063ci.O.c((byte[]) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p063ci.K.a;
        r2 = r1 & 17;
        r2 = (r2 - (~((r1 ^ 17) | r2))) - 1;
        ivas.gov.bisp.enumeration.p063ci.K.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if ((r2 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        r0 = 99 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        r6 = (ivas.gov.bisp.enumeration.p063ci.K) ivas.gov.bisp.enumeration.p063ci.O.c((byte[]) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("encoding error in getInstance: ");
        r0.append(r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("illegal object in getInstance: ");
        r0.append(r6.getClass().getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p063ci.K q(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.K.q(java.lang.Object):ivas.gov.bisp.enumeration.ci.K");
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 39;
        int i4 = ((((i2 ^ 39) | i3) << 1) - (~(-((i2 | 39) & (~i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int length = this.d.length;
        int i6 = length & 1;
        int iB = az.b(i6 + ((length ^ 1) | i6)) + 1;
        byte[] bArr = this.d;
        int i7 = b;
        int i8 = i7 & 31;
        int i9 = -(-((i7 ^ 31) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        int length2 = bArr.length;
        if (i11 != 0) {
            return (-1) - (~(-(-(iB << length2))));
        }
        int i12 = -(-length2);
        int i13 = ((iB ^ i12) | (iB & i12)) << 1;
        int i14 = -((i12 & (~iB)) | ((~i12) & iB));
        int i15 = (i13 & i14) + (i14 | i13);
        return (((i15 & (-2)) | ((~i15) & 1)) - (~((i15 & 1) << 1))) - 1;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0272r, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 19;
        int i4 = ((i2 & 19) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0272r, ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-112)) | ((~i2) & 111);
        int i4 = (i2 & 111) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 5;
        int i9 = i8 + ((i6 ^ 5) | i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 21;
        int i5 = (((i3 ^ 21) | i4) << 1) - ((i3 | 21) & (~i4));
        b = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = this.d;
        int length = bArr.length;
        if (length != 0) {
            int i7 = b;
            int i8 = i7 & 63;
            int i9 = -(-((i7 ^ 63) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = this.e;
            if (i12 != 0) {
                int i13 = b;
                int i14 = i13 | 13;
                int i15 = i14 << 1;
                int i16 = -(i14 & (~(i13 & 13)));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                a = i17 % 128;
                int i18 = i17 % 2;
                int i19 = ((length | (-103)) << 1) - (length ^ (-103));
                int i20 = ((i19 | 102) << 1) - (i19 ^ 102);
                byte b2 = bArr[i20];
                int i21 = i13 & 9;
                int i22 = -(-((i13 ^ 9) | i21));
                int i23 = (i21 & i22) + (i22 | i21);
                int i24 = i23 % 128;
                a = i24;
                int i25 = i23 % 2;
                int i26 = 255 << i12;
                if (b2 != ((byte) (b2 & i26))) {
                    int i27 = ((i24 | 95) << 1) - (i24 ^ 95);
                    int i28 = i27 % 128;
                    b = i28;
                    if (i27 % 2 == 0) {
                        int i29 = 30147 >> i12;
                        int i30 = b2 & i29;
                        int i31 = (b2 | i29) & (~i30);
                        i = (i31 & i30) | (i31 ^ i30);
                    } else {
                        i = b2 & i26;
                    }
                    byte b3 = (byte) i;
                    int i32 = ((i28 & 18) + (i28 | 18)) - 1;
                    a = i32 % 128;
                    Object obj = null;
                    if (i32 % 2 != 0) {
                        throw null;
                    }
                    byte b4 = (byte) i12;
                    if (z) {
                        ((OutputStream) aVar.c).write(3);
                        int i33 = b;
                        int i34 = i33 & 123;
                        int i35 = (i34 - (~(-(-((i33 ^ 123) | i34))))) - 1;
                        a = i35 % 128;
                        int i36 = i35 % 2;
                    }
                    int i37 = i20 & 2;
                    aVar.w(i37 + ((i20 ^ 2) | i37));
                    Object obj2 = aVar.c;
                    int i38 = b;
                    int i39 = ((i38 | 39) << 1) - (i38 ^ 39);
                    a = i39 % 128;
                    if (i39 % 2 != 0) {
                        ((OutputStream) obj2).write(b4);
                        Object obj3 = aVar.c;
                        throw null;
                    }
                    ((OutputStream) obj2).write(b4);
                    Object obj4 = aVar.c;
                    int i40 = a;
                    int i41 = i40 ^ 113;
                    int i42 = (i40 & 113) << 1;
                    int i43 = (i41 & i42) + (i42 | i41);
                    b = i43 % 128;
                    if (i43 % 2 == 0) {
                        ((OutputStream) obj4).write(bArr, 1, i20);
                    } else {
                        ((OutputStream) obj4).write(bArr, 0, i20);
                    }
                    ((OutputStream) aVar.c).write(b3);
                    int i44 = b;
                    int i45 = i44 & 13;
                    int i46 = (i44 | 13) & (~i45);
                    int i47 = -(-(i45 << 1));
                    int i48 = (i46 & i47) + (i46 | i47);
                    a = i48 % 128;
                    if (i48 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        aVar.s(z, 3, (byte) this.e, bArr);
        int i49 = b;
        int i50 = i49 & 41;
        int i51 = (i49 ^ 41) | i50;
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        a = i52 % 128;
        int i53 = i52 % 2;
    }
}
