package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p091n.j;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0263g extends ax {
    private static int a = 0;
    private static int b = 1;
    public static final byte[] e = new byte[0];
    public final int f;
    public int g;

    static {
        int i = 1 & 89;
        int i2 = ((~i) & (1 | 89)) + (i << 1);
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    public C0263g(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f = i;
        this.g = i;
        if (i == 0) {
            int i3 = a;
            int i4 = ((i3 ^ 93) - (~((i3 & 93) << 1))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            c(true);
            int i6 = b;
            int i7 = i6 & 115;
            int i8 = (i6 ^ 115) | i7;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        }
        int i12 = a + 105;
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-66)) | ((~i2) & 65)) - (~((i2 & 65) << 1))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (this.g == 0) {
            int i6 = ((i4 ^ 41) | (i4 & 41)) << 1;
            int i7 = -((i4 & (-42)) | ((~i4) & 41));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = (i4 & (-100)) | ((~i4) & 99);
            int i11 = (i4 & 99) << 1;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return -1;
            }
            obj.hashCode();
            throw null;
        }
        int i13 = this.c.read();
        if (i13 < 0) {
            StringBuilder sbW = j.w("DEF length ");
            int i14 = this.f;
            int i15 = a;
            int i16 = (i15 | 59) << 1;
            int i17 = -(i15 ^ 59);
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            int i19 = i18 % 2;
            sbW.append(i14);
            sbW.append(" object truncated by ");
            if (i19 == 0) {
                obj.hashCode();
                throw null;
            }
            sbW.append(this.g);
            throw new EOFException(sbW.toString());
        }
        int i20 = b;
        int i21 = i20 & 91;
        int i22 = -(-((i20 ^ 91) | i21));
        int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
        a = i23 % 128;
        int i24 = i23 % 2;
        int i25 = this.g;
        if (i24 == 0) {
            int i26 = -(-((i25 ^ (-1)) | i25));
            i25 = ((i25 | i26) << 1) - (i25 ^ i26);
        }
        this.g = i25;
        if (i25 == 0) {
            int i27 = (((i20 & (-40)) | ((~i20) & 39)) - (~((i20 & 39) << 1))) - 1;
            a = i27 % 128;
            int i28 = i27 % 2;
            c(true);
            int i29 = b;
            int i30 = ((i29 ^ 83) | (i29 & 83)) << 1;
            int i31 = -(((~i29) & 83) | (i29 & (-84)));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            a = i32 % 128;
            int i33 = i32 % 2;
        }
        int i34 = b;
        int i35 = ((i34 | 43) << 1) - (i34 ^ 43);
        a = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 28 / 0;
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 >= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r7 >= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r8 = r6.g;
        r9 = -r7;
        r1 = (r8 | r9) << 1;
        r8 = -(((~r8) & r9) | ((~r9) & r8));
        r9 = (r1 & r8) + (r8 | r1);
        r6.g = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r9 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p063ci.C0263g.a;
        r9 = r8 ^ 73;
        r8 = ((r8 & 73) | r9) << 1;
        r9 = -r9;
        r1 = (r8 & r9) + (r8 | r9);
        ivas.gov.bisp.enumeration.p063ci.C0263g.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if ((r1 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        c(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p063ci.C0263g.a;
        r9 = r8 & 39;
        r8 = (r8 ^ 39) | r9;
        r1 = (r9 ^ r8) + ((r8 & r9) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0263g.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p063ci.C0263g.b;
        r9 = r8 & 105;
        r8 = (r8 ^ 105) | r9;
        r1 = (r9 ^ r8) + ((r8 & r9) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0263g.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p091n.j.w("DEF length ");
        r7.append(r6.f);
        r8 = ivas.gov.bisp.enumeration.p063ci.C0263g.a;
        r9 = r8 & 29;
        r8 = (r8 ^ 29) | r9;
        r1 = (r9 ^ r8) + ((r8 & r9) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0263g.b = r1 % 128;
        r1 = r1 % 2;
        r7.append(" object truncated by ");
        r7.append(r6.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        throw new java.io.EOFException(r7.toString());
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0263g.read(byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r1 = r9.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r2 >= r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p063ci.C0263g.b;
        r6 = r1 & 95;
        r5 = ((r1 ^ 95) | r6) << 1;
        r1 = -((r1 | 95) & (~r6));
        r6 = (r5 & r1) + (r1 | r5);
        ivas.gov.bisp.enumeration.p063ci.C0263g.a = r6 % 128;
        r6 = r6 % 2;
        r1 = new byte[r2];
        r5 = ivas.gov.bisp.enumeration.O.i.s(r9.c, r1, 0, r2);
        r6 = ivas.gov.bisp.enumeration.p063ci.C0263g.b;
        r7 = (-2) - ((r6 + 114) ^ (-1));
        ivas.gov.bisp.enumeration.p063ci.C0263g.a = r7 % 128;
        r7 = r7 % 2;
        r5 = -r5;
        r8 = r2 & r5;
        r7 = ((r2 ^ r5) | r8) << 1;
        r2 = -((r2 | r5) & (~r8));
        r5 = (r7 & r2) + (r2 | r7);
        r9.g = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        if (r5 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        r2 = r6 & 49;
        r5 = ((~r2) & (r6 | 49)) + (r2 << 1);
        ivas.gov.bisp.enumeration.p063ci.C0263g.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if ((r5 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        c(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p091n.j.w("DEF length ");
        r1.append(r9.f);
        r2 = ivas.gov.bisp.enumeration.p063ci.C0263g.b;
        r3 = r2 & 115;
        r2 = (r2 | 115) & (~r3);
        r3 = -(-(r3 << 1));
        r4 = (r2 & r3) + (r2 | r3);
        ivas.gov.bisp.enumeration.p063ci.C0263g.a = r4 % 128;
        r4 = r4 % 2;
        r1.append(" object truncated by ");
        r1.append(r9.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        throw new java.io.EOFException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c8, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p091n.j.w("corrupted stream - out of bounds length found: ");
        r2.append(r9.g);
        r3 = ivas.gov.bisp.enumeration.p063ci.C0263g.a;
        r5 = r3 ^ 111;
        r3 = ((r3 & 111) | r5) << 1;
        r5 = -r5;
        r6 = (r3 ^ r5) + ((r3 & r5) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0263g.b = r6 % 128;
        r6 = r6 % 2;
        r2.append(" >= ");
        r2.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f7, code lost:
    
        throw new java.io.IOException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r2 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r2 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r2 = (r1 & 87) + (r1 | 87);
        r1 = r2 % 128;
        ivas.gov.bisp.enumeration.p063ci.C0263g.b = r1;
        r2 = r2 % 2;
        r2 = ivas.gov.bisp.enumeration.p063ci.C0263g.e;
        r3 = (r1 | 67) << 1;
        r1 = -(r1 ^ 67);
        r4 = (r3 & r1) + (r1 | r3);
        ivas.gov.bisp.enumeration.p063ci.C0263g.a = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] d() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0263g.d():byte[]");
    }
}
