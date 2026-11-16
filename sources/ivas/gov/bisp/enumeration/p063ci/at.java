package ivas.gov.bisp.enumeration.p063ci;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class at extends ax {
    private static int a = 0;
    private static int b = 1;
    public int e;
    public boolean f;
    public int g;
    public boolean h;

    public at(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f = false;
        this.h = true;
        this.e = inputStream.read();
        int i2 = inputStream.read();
        this.g = i2;
        if (i2 < 0) {
            throw new EOFException();
        }
        d();
        int i3 = b + 13;
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    public final boolean d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = (i2 | 115) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (!this.f) {
            int i9 = i7 + 107;
            a = i9 % 128;
            int i10 = i9 % 2;
            if (this.h) {
                int i11 = i7 ^ 77;
                int i12 = ((i7 & 77) | i11) << 1;
                int i13 = -i11;
                int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
                int i15 = i14 % 128;
                a = i15;
                int i16 = i14 % 2;
                if (this.e == 0) {
                    int i17 = i15 & 81;
                    int i18 = (i15 ^ 81) | i17;
                    int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    if (this.g == 0) {
                        int i21 = ((i15 ^ 109) | (i15 & 109)) << 1;
                        int i22 = -(((~i15) & 109) | (i15 & (-110)));
                        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        this.f = true;
                        c(true);
                        int i25 = b;
                        int i26 = ((i25 | 85) << 1) - (i25 ^ 85);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                    }
                }
            }
        }
        boolean z = this.f;
        int i28 = b;
        int i29 = ((i28 ^ 30) + ((i28 & 30) << 1)) - 1;
        a = i29 % 128;
        if (i29 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 125;
        int i4 = ((i2 | 125) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (!(!d())) {
            int i6 = b;
            int i7 = i6 ^ 29;
            int i8 = ((i6 & 29) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            int i11 = i6 ^ 85;
            int i12 = -(-((i6 & 85) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            return -1;
        }
        int i15 = this.c.read();
        if (i15 < 0) {
            throw new EOFException();
        }
        int i16 = b;
        int i17 = (((i16 | 46) << 1) - (i16 ^ 46)) - 1;
        int i18 = i17 % 128;
        a = i18;
        int i19 = i17 % 2;
        int i20 = this.e;
        this.e = this.g;
        this.g = i15;
        int i21 = i18 & 101;
        int i22 = (i18 ^ 101) | i21;
        int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
        b = i23 % 128;
        int i24 = i23 % 2;
        int i25 = ((i18 & 73) - (~(i18 | 73))) - 1;
        b = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 90 / 0;
        }
        return i20;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if ((!r2) != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if ((!r2) != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        r8 = r1 & 29;
        r9 = (((~r8) & (r1 | 29)) - (~(r8 << 1))) - 1;
        r8 = r9 % 128;
        ivas.gov.bisp.enumeration.p063ci.at.a = r8;
        r9 = r9 % 2;
        r9 = (r8 & 75) + (r8 | 75);
        ivas.gov.bisp.enumeration.p063ci.at.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if ((r9 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r2 = r9 & 2;
        r5 = -(-((r9 ^ 2) | r2));
        r6 = ((r2 | r5) << 1) - (r2 ^ r5);
        r2 = r10 ^ (-2);
        r10 = ((r10 & (-2)) | r2) << 1;
        r2 = -r2;
        r10 = r7.c.read(r8, r6, (r10 & r2) + (r10 | r2));
        r1 = ivas.gov.bisp.enumeration.p063ci.at.a;
        r2 = ((r1 ^ 100) + ((r1 & 100) << 1)) - 1;
        ivas.gov.bisp.enumeration.p063ci.at.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if ((r2 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (r10 < 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        r2 = r1 ^ 85;
        r1 = ((r1 & 85) | r2) << 1;
        r2 = -r2;
        r4 = ((r1 | r2) << 1) - (r1 ^ r2);
        r1 = r4 % 128;
        ivas.gov.bisp.enumeration.p063ci.at.b = r1;
        r4 = r4 % 2;
        r8[r9] = (byte) r7.e;
        r2 = ((r1 & 53) - (~(-(-(r1 | 53))))) - 1;
        ivas.gov.bisp.enumeration.p063ci.at.a = r2 % 128;
        r2 = r2 % 2;
        r8[((r9 & 2) + (r9 | 2)) - 1] = (byte) r7.g;
        r8 = r7.c;
        r9 = ivas.gov.bisp.enumeration.p063ci.at.a;
        r1 = (((r9 | 56) << 1) - (r9 ^ 56)) - 1;
        ivas.gov.bisp.enumeration.p063ci.at.b = r1 % 128;
        r1 = r1 % 2;
        r7.e = r8.read();
        r8 = r7.c.read();
        r9 = ivas.gov.bisp.enumeration.p063ci.at.a;
        r1 = r9 ^ 7;
        r2 = ((r9 & 7) | r1) << 1;
        r1 = -r1;
        r4 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.p063ci.at.b = r4 % 128;
        r4 = r4 % 2;
        r7.g = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010f, code lost:
    
        if (r8 < 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0111, code lost:
    
        r8 = ((r9 & 62) + (r9 | 62)) - 1;
        ivas.gov.bisp.enumeration.p063ci.at.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if ((r8 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0121, code lost:
    
        return r10 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0127, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012d, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012e, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r10 % 2;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.at.read(byte[], int, int):int");
    }
}
