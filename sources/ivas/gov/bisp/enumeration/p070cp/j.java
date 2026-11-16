package ivas.gov.bisp.enumeration.p070cp;

import ivas.gov.bisp.enumeration.p072cr.c;
import ivas.gov.bisp.enumeration.p086i.a;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p100w.r;
import ivas.gov.bisp.enumeration.p101x.C0327p;
import ivas.gov.bisp.enumeration.p101x.h;
import ivas.gov.bisp.enumeration.p101x.z;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 0;
    private static int b = 1;
    public byte[] c;
    public h d;
    public C0321u e;
    public a f;
    public boolean g;
    public int h;
    public boolean i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f89o;
    public byte[] p;
    public byte[] q;
    public byte[] r;
    public int s;
    public byte[] t;
    public int u;
    public long v;
    public byte[] w;
    public long x;
    public int y;
    public long z;

    public j(h hVar) {
        C0321u c0321u = new C0321u(4);
        this.d = hVar;
        this.e = c0321u;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00af  */
    public void c(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (((i5 & (-30)) | ((~i5) & 29)) - (~((i5 & 29) << 1))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        d();
        int i8 = a;
        int i9 = (-2) - (((i8 & 54) + (i8 | 54)) ^ (-1));
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < i2) {
            int i12 = b;
            int i13 = i12 & 109;
            int i14 = i13 + ((i12 ^ 109) | i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            byte[] bArr2 = this.w;
            int i16 = this.y;
            int i17 = ((i12 ^ 51) | (i12 & 51)) << 1;
            int i18 = -((51 & (~i12)) | (i12 & (-52)));
            int i19 = (i17 & i18) + (i18 | i17);
            int i20 = i19 % 128;
            a = i20;
            if (i19 % 2 != 0) {
                bArr2[i16] = bArr[i / i11];
                i3 = ((i16 ^ 95) + ((i16 & 95) << 1)) - 1;
            } else {
                int i21 = -(-i11);
                bArr2[i16] = bArr[(i ^ i21) + ((i21 & i) << 1)];
                int i22 = (-2) - (((i16 & (-46)) + (i16 | (-46))) ^ (-1));
                int i23 = (i22 & (-49)) | ((~i22) & 48);
                int i24 = (i22 & 48) << 1;
                i3 = ((i23 | i24) << 1) - (i24 ^ i23);
            }
            int i25 = i20 | 95;
            int i26 = ((i25 << 1) - (~(-((~(i20 & 95)) & i25)))) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
            this.y = i3;
            if (i27 == 0) {
                if (i3 == 4) {
                    f(this.q, bArr2);
                    this.y = 0;
                    int i28 = a;
                    int i29 = i28 & 25;
                    int i30 = -(-((i28 ^ 25) | i29));
                    int i31 = (i29 & i30) + (i30 | i29);
                    int i32 = i31 % 128;
                    b = i32;
                    int i33 = i31 % 2;
                    this.z += 16;
                    int i34 = i32 & 113;
                    int i35 = (i32 ^ 113) | i34;
                    int i36 = (i34 & i35) + (i35 | i34);
                    a = i36 % 128;
                    int i37 = i36 % 2;
                }
            } else if (i3 == 16) {
                f(this.q, bArr2);
                this.y = 0;
                int i210 = a;
                int i211 = i210 & 25;
                int i38 = -(-((i210 ^ 25) | i211));
                int i39 = (i211 & i38) + (i38 | i211);
                int i310 = i39 % 128;
                b = i310;
                int i311 = i39 % 2;
                this.z += 16;
                int i312 = i310 & 113;
                int i313 = (i310 ^ 113) | i312;
                int i314 = (i312 & i313) + (i313 | i312);
                a = i314 % 128;
                int i315 = i314 % 2;
            }
            i11++;
            int i40 = a;
            int i41 = (((i40 | 64) << 1) - (i40 ^ 64)) - 1;
            b = i41 % 128;
            int i42 = i41 % 2;
        }
        int i43 = a;
        int i44 = i43 ^ 51;
        int i45 = ((i43 & 51) | i44) << 1;
        int i46 = -i44;
        int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
        b = i47 % 128;
        if (i47 % 2 == 0) {
            int i48 = 46 / 0;
        }
    }

    public final void d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = -(-((i2 ^ 45) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.i) {
            int i6 = i2 + 85;
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = i2 ^ 101;
        int i9 = -(-((i2 & 101) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        if (!this.g) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    public final void f(byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 39) - (~((i2 & 39) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        ivas.gov.bisp.enumeration.p096p.h.p(bArr, bArr2);
        C0321u c0321u = this.e;
        if (i4 == 0) {
            c0321u.n(bArr);
            throw null;
        }
        c0321u.n(bArr);
        int i5 = a;
        int i6 = (-2) - ((((i5 | 74) << 1) - (i5 ^ 74)) ^ (-1));
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void g(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = 2 % 2;
        while (true) {
            int i4 = (i2 & 54) + (i2 | 54);
            i2 = (i4 & (-55)) + (i4 | (-55));
            if (i2 < 0) {
                this.e.n(bArr);
                int i5 = b;
                int i6 = ((i5 ^ 118) + ((i5 & 118) << 1)) - 1;
                a = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            int i8 = a;
            int i9 = i8 + 79;
            b = i9 % 128;
            int i10 = i9 % 2;
            byte b2 = bArr[i2];
            int i11 = i ^ i2;
            byte b3 = bArr2[(((i & i2) | i11) << 1) - i11];
            bArr[i2] = (byte) (((~b2) & b3) | ((~b3) & b2));
            int i12 = i8 & 123;
            int i13 = (i12 - (~(-(-((i8 ^ 123) | i12))))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    public int h(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 + 89;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = -(~(-(-this.u)));
        int i9 = (-2) - (((i ^ i8) + ((i & i8) << 1)) ^ (-1));
        if (this.g) {
            int i10 = (((i6 & (-36)) | ((~i6) & 35)) - (~((i6 & 35) << 1))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = -(-this.h);
            if (i11 != 0) {
                return (i9 & i12) + (i9 | i12);
            }
            int i13 = i9 ^ i12;
            int i14 = -(-((i9 & i12) << 1));
            return (i13 & i14) + (i14 | i13);
        }
        int i15 = this.h;
        if (i9 < i15) {
            int i16 = i4 & 29;
            int i17 = ((i4 | 29) & (~i16)) + (i16 << 1);
            int i18 = i17 % 128;
            a = i18;
            int i19 = i17 % 2;
            int i20 = (i18 ^ 21) + ((i18 & 21) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            i2 = 0;
        } else {
            i2 = (i9 - (~(-i15))) - 1;
            int i22 = (i4 & (-96)) | ((~i4) & 95);
            int i23 = -(-((i4 & 95) << 1));
            int i24 = (i22 & i23) + (i23 | i22);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = b;
        int i27 = i26 & 37;
        int i28 = ((i26 | 37) & (~i27)) + (i27 << 1);
        a = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 58 / 0;
        }
        return i2;
    }

    public final void i(byte[] bArr) {
        int i;
        byte b2;
        byte b3;
        int i2;
        char c;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 ^ 106) + ((i5 & 106) << 1);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        int i8 = i7 % 128;
        a = i8;
        Object obj = null;
        if (i7 % 2 != 0) {
            throw null;
        }
        int i9 = this.s;
        if (i9 == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        int i10 = (i8 & 37) + (i8 | 37);
        int i11 = i10 % 128;
        b = i11;
        if (i10 % 2 == 0) {
            this.s = i9 >>> 1;
        } else {
            this.s = (((i9 ^ (-1)) | i9) << 1) - (~i9);
        }
        byte[] bArr2 = this.t;
        int i12 = ((i11 | 11) << 1) - (i11 ^ 11);
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        byte b4 = bArr2[15];
        int i15 = ((b4 & 2) + ((b4 & 255) | 2)) - 1;
        int i16 = i13 + 97;
        b = i16 % 128;
        if (i16 % 2 == 0) {
            bArr2[15] = (byte) i15;
            i = i15 % 32;
            b2 = bArr2[17];
            b3 = 20366;
        } else {
            bArr2[15] = (byte) i15;
            i = i15 >>> 8;
            b2 = bArr2[14];
            b3 = 255;
        }
        int i17 = i13 & 121;
        int i18 = i17 + ((i13 ^ 121) | i17);
        int i19 = i18 % 128;
        b = i19;
        if (i18 % 2 == 0) {
            int i20 = i / (((~b2) & b3) | ((~b3) & b2));
            bArr2[1] = (byte) i20;
            i2 = i20 % 30;
        } else {
            int i21 = b2 & b3;
            int i22 = i & i21;
            int i23 = (i21 | i) & (~i22);
            int i24 = -(-(i22 << 1));
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            bArr2[14] = (byte) i25;
            i2 = i25 >>> 8;
        }
        int i26 = i19 & 21;
        int i27 = (((i19 | 21) & (~i26)) - (~(-(-(i26 << 1))))) - 1;
        int i28 = i27 % 128;
        a = i28;
        if (i27 % 2 != 0) {
            byte b5 = bArr2[114];
            i3 = i2 / (((~b5) & 15093) | (b5 & (-15094)));
            c = ';';
        } else {
            c = '\r';
            int i29 = bArr2[13] & 255;
            int i30 = ((~i29) & i2) | ((~i2) & i29);
            int i31 = -(-((i2 & i29) << 1));
            i3 = (i31 | i30) + (i30 & i31);
        }
        bArr2[c] = (byte) i3;
        int i32 = i3 >>> 8;
        int i33 = i28 & 51;
        int i34 = ((i28 ^ 51) | i33) << 1;
        int i35 = -((~i33) & (i28 | 51));
        int i36 = (i34 & i35) + (i34 | i35);
        b = i36 % 128;
        int i37 = i36 % 2;
        int i38 = -(-(bArr2[12] & 255));
        bArr2[12] = (byte) ((i32 ^ i38) + ((i32 & i38) << 1));
        ivas.gov.bisp.enumeration.dh.j jVar = (ivas.gov.bisp.enumeration.dh.j) this.d;
        int i39 = i28 & 27;
        int i40 = ((i28 | 27) & (~i39)) + (i39 << 1);
        b = i40 % 128;
        int i41 = i40 % 2;
        jVar.e(bArr2, 0, bArr, 0);
        int i42 = b;
        int i43 = ((i42 ^ 19) | (i42 & 19)) << 1;
        int i44 = -(((~i42) & 19) | (i42 & (-20)));
        int i45 = (i43 & i44) + (i44 | i43);
        a = i45 % 128;
        if (i45 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void k() {
        byte[] bArr;
        byte[] bArr2;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & (-22)) | ((~i4) & 21);
        int i6 = (i4 & 21) << 1;
        int i7 = (i5 & i6) + (i6 | i5);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        if (this.z > 0) {
            int i10 = i8 + 13;
            int i11 = i10 % 128;
            a = i11;
            if (i10 % 2 != 0) {
                bArr = this.q;
                bArr2 = this.r;
                i2 = 1;
                i = 115;
            } else {
                bArr = this.q;
                bArr2 = this.r;
                i = 16;
                i2 = 0;
            }
            int i12 = (i11 & (-116)) | ((~i11) & 115);
            int i13 = (i11 & 115) << 1;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            System.arraycopy(bArr, 0, bArr2, i2, i);
            if (i15 == 0) {
                this.v = this.z;
                throw null;
            }
            this.v = this.z;
        }
        int i16 = this.y;
        if (i16 > 0) {
            int i17 = a;
            int i18 = i17 & 87;
            int i19 = ((i17 ^ 87) | i18) << 1;
            int i20 = -((i17 | 87) & (~i18));
            int i21 = (i19 & i20) + (i20 | i19);
            b = i21 % 128;
            int i22 = i21 % 2;
            byte[] bArr3 = this.r;
            byte[] bArr4 = this.w;
            if (i22 == 0) {
                g(bArr3, bArr4, 0, i16);
            } else {
                g(bArr3, bArr4, 0, i16);
            }
            this.v += (long) this.y;
            int i23 = b;
            int i24 = ((i23 ^ 104) + ((i23 & 104) << 1)) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        if (this.v > 0) {
            int i26 = a;
            int i27 = i26 & 113;
            int i28 = ((i26 | 113) & (~i27)) + (i27 << 1);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                System.arraycopy(this.r, 0, this.f89o, 0, 6);
            } else {
                System.arraycopy(this.r, 0, this.f89o, 0, 16);
            }
            int i29 = a;
            int i30 = i29 & 71;
            int i31 = (i29 | 71) & (~i30);
            int i32 = -(-(i30 << 1));
            int i33 = (i31 & i32) + (i31 | i32);
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = a;
        int i36 = ((i35 & 98) + (i35 | 98)) - 1;
        b = i36 % 128;
        if (i36 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if ((r9 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r13 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        if (r20.g == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r20.g == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r20.u == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r3 <= 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p070cp.j.a;
        r9 = r8 ^ 45;
        r13 = (((r8 & 45) | r9) << 1) - r9;
        ivas.gov.bisp.enumeration.p070cp.j.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if ((r13 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        r3 = (-2) - (r3 ^ (-1));
        r9 = r20.n;
        r13 = r20.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r9 = ((r3 ^ (-1)) | r3) << 1;
        r3 = -(~r3);
        r13 = (r9 & r3) + (r3 | r9);
        r9 = r20.n;
        r13 = r20.u;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        r14 = r2 ^ 1;
        r15 = (r2 & 1) << 1;
        r16 = (r14 & r15) + (r14 | r15);
        r9[r13] = r21[r2];
        r2 = r8 & 67;
        r14 = -(-((r8 ^ 67) | r2));
        r15 = ((r2 | r14) << 1) - (r2 ^ r14);
        ivas.gov.bisp.enumeration.p070cp.j.b = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if ((r15 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        r20.u = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r13 != 51) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        r2 = (r13 ^ 1) + ((r13 & 1) << 1);
        r20.u = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (r2 != 16) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        l(r9, 0, r24, r25);
        r2 = ivas.gov.bisp.enumeration.p070cp.j.b;
        r8 = r2 + 21;
        ivas.gov.bisp.enumeration.p070cp.j.a = r8 % 128;
        r8 = r8 % 2;
        r20.u = 0;
        r2 = r2 + 107;
        ivas.gov.bisp.enumeration.p070cp.j.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        if ((r2 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        r2 = 3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        r8 = 16;
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        r2 = r8 & 57;
        r8 = ((r8 | 57) & (~r2)) + (r2 << 1);
        ivas.gov.bisp.enumeration.p070cp.j.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        if ((r8 % 2) != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        r2 = 5 % 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p070cp.j.a;
        r9 = (((r8 | 51) << 1) - (~(-(r8 ^ 51)))) - 1;
        ivas.gov.bisp.enumeration.p070cp.j.b = r9 % 128;
        r9 = r9 % 2;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        if (r3 < 16) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p070cp.j.a + 49;
        ivas.gov.bisp.enumeration.p070cp.j.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
    
        if ((r9 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
    
        l(r21, r2, r24, r25 >>> r8);
        r9 = r2 ^ 59;
        r2 = ((r2 & 59) | r9) << 1;
        r9 = -r9;
        r10 = ((r2 & r9) + (r2 | r9)) + 51;
        r2 = (r10 ^ (-1)) + (r10 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
    
        l(r21, r2, r24, (r25 - (~(-(~(-(-r8)))))) - 2);
        r9 = ((r2 & (-144)) | ((~r2) & 143)) + ((r2 & 143) << 1);
        r2 = r9 ^ (-127);
        r2 = ((((r9 & (-127)) | r2) << 1) - (~(-r2))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013d, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p070cp.j.a + 83;
        ivas.gov.bisp.enumeration.p070cp.j.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0146, code lost:
    
        if ((r9 % 2) != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0148, code lost:
    
        r9 = (r3 & 95) + (r3 | 95);
        r3 = r8 & 93;
        r3 = r3 + ((r8 ^ 93) | r3);
        r8 = r3 & (-49);
        r8 = r8 + ((r3 ^ (-49)) | r8);
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015b, code lost:
    
        r9 = (r3 & 59) + (r3 | 59);
        r3 = (r9 & (-75)) + (r9 | (-75));
        r9 = (((r8 & (-122)) | ((~r8) & 121)) - (~((r8 & 121) << 1))) - 1;
        r8 = r9 & (-105);
        r9 = r9 | (-105);
        r8 = (r8 & r9) + (r8 | r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017c, code lost:
    
        if (r3 <= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017e, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p070cp.j.b + 49;
        ivas.gov.bisp.enumeration.p070cp.j.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0187, code lost:
    
        if ((r4 % 2) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0189, code lost:
    
        java.lang.System.arraycopy(r21, r2, r20.n, 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018f, code lost:
    
        java.lang.System.arraycopy(r21, r2, r20.n, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0194, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p070cp.j.a;
        r2 = (((r1 & (-68)) | ((~r1) & 67)) - (~((r1 & 67) << 1))) - 1;
        ivas.gov.bisp.enumeration.p070cp.j.b = r2 % 128;
        r2 = r2 % 2;
        r20.u = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a9, code lost:
    
        if (r2 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ad, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b2, code lost:
    
        r9 = (r8 ^ 81) + ((r8 & 81) << 1);
        ivas.gov.bisp.enumeration.p070cp.j.a = r9 % 128;
        r9 = r9 % 2;
        r8 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bf, code lost:
    
        if (r9 >= r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if ((r21.length >>> r2) >= r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c1, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p070cp.j.b;
        r14 = r13 & 125;
        r13 = (r13 ^ 125) | r14;
        r15 = ((r14 | r13) << 1) - (r13 ^ r14);
        r13 = r15 % 128;
        ivas.gov.bisp.enumeration.p070cp.j.a = r13;
        r15 = r15 % 2;
        r14 = r20.n;
        r15 = r20.u;
        r16 = r13 & 103;
        r13 = (r13 ^ 103) | r16;
        r13 = (r16 & r13) + (r16 | r13);
        r11 = r13 % 128;
        ivas.gov.bisp.enumeration.p070cp.j.b = r11;
        r13 = r13 % 2;
        r14[r15] = r21[(r2 - (~r9)) - 1];
        r13 = (-2) - (((r15 ^ 2) + ((r15 & 2) << 1)) ^ (-1));
        r15 = (r11 ^ 35) + ((r11 & 35) << 1);
        r11 = r15 % 128;
        ivas.gov.bisp.enumeration.p070cp.j.a = r11;
        r15 = r15 % 2;
        r20.u = r13;
        r15 = r11 + 84;
        r15 = (r15 ^ (-1)) + (r15 << 1);
        ivas.gov.bisp.enumeration.p070cp.j.b = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0212, code lost:
    
        if (r13 != r14.length) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0214, code lost:
    
        r12 = ((r11 ^ 51) | (r11 & 51)) << 1;
        r11 = -(((~r11) & r10) | (r11 & (-52)));
        r13 = (r12 & r11) + (r11 | r12);
        ivas.gov.bisp.enumeration.p070cp.j.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0229, code lost:
    
        if ((r13 % 2) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x022b, code lost:
    
        r11 = r25 >> r8;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x022e, code lost:
    
        l(r14, r12, r24, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0232, code lost:
    
        r12 = 0;
        r11 = ((r25 | r8) << 1) - (r25 ^ r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023a, code lost:
    
        r11 = r20.n;
        r12 = r20.h;
        r13 = ivas.gov.bisp.enumeration.p070cp.j.b;
        r14 = (((r13 ^ 123) | (r13 & 123)) << 1) - ((123 & (~r13)) | (r13 & (-124)));
        ivas.gov.bisp.enumeration.p070cp.j.a = r14 % 128;
        r13 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0256, code lost:
    
        if ((r14 % 2) == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0258, code lost:
    
        r14 = false;
        java.lang.System.arraycopy(r11, 16, r11, 0, r12);
        r20.u = r20.h;
        r11 = 57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0263, code lost:
    
        r14 = false;
        java.lang.System.arraycopy(r11, 16, r11, 0, r12);
        r20.u = r20.h;
        r11 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x026c, code lost:
    
        r12 = ivas.gov.bisp.enumeration.p070cp.j.b;
        r15 = ((r12 | 87) << 1) - (r12 ^ 87);
        r12 = r15 % 128;
        ivas.gov.bisp.enumeration.p070cp.j.a = r12;
        r15 = r15 % 2;
        r15 = ((r8 ^ r11) | (r8 & r11)) << 1;
        r8 = -(((~r8) & r11) | ((~r11) & r8));
        r8 = (r8 | r15) + (r15 & r8);
        r10 = r12 ^ 39;
        r11 = ((r12 & 39) | r10) << 1;
        r10 = -r10;
        r12 = (r11 & r10) + (r10 | r11);
        ivas.gov.bisp.enumeration.p070cp.j.b = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x029b, code lost:
    
        r13 = 16;
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x029e, code lost:
    
        r10 = (r9 ^ (-108)) + ((r9 & (-108)) << 1);
        r9 = (r10 ^ 109) + ((r10 & 109) << 1);
        r10 = ivas.gov.bisp.enumeration.p070cp.j.b;
        r11 = ((r10 ^ 64) + ((r10 & 64) << 1)) - 1;
        ivas.gov.bisp.enumeration.p070cp.j.a = r11 % 128;
        r11 = r11 % 2;
        r10 = 51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02be, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p070cp.j.a;
        r2 = (r1 ^ 108) + ((r1 & 108) << 1);
        r1 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.p070cp.j.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02cf, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p070cp.j.a;
        r2 = (((r1 | 54) << 1) - (r1 ^ 54)) - 1;
        ivas.gov.bisp.enumeration.p070cp.j.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02dd, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02e5, code lost:
    
        throw new ivas.gov.bisp.enumeration.p101x.e("Input buffer too short");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if ((((r8 ^ r9) + ((r8 & r9) << 1)) - 1) >= r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p070cp.j.a;
        r9 = r8 & 105;
        r9 = r9 + ((r8 ^ 105) | r9);
        r8 = r9 % 128;
        ivas.gov.bisp.enumeration.p070cp.j.b = r8;
        r10 = 51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m(byte[] r21, int r22, int r23, byte[] r24, int r25) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p070cp.j.m(byte[], int, int, byte[], int):int");
    }

    public final void l(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = b;
        int i9 = (i8 & 121) + (i8 | 121);
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        if ((bArr2.length - (~(-i2))) - 1 < 16) {
            throw new z("Output buffer too short");
        }
        int i12 = i10 & 1;
        int i13 = ((((i10 ^ 1) | i12) << 1) - (~(-((i10 | 1) & (~i12))))) - 1;
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        if (this.x == 0) {
            int i16 = (i14 & (-112)) | ((~i14) & 111);
            int i17 = -(-((i14 & 111) << 1));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            k();
            int i20 = a + 99;
            b = i20 % 128;
            int i21 = i20 % 2;
        }
        byte[] bArr3 = new byte[16];
        i(bArr3);
        int i22 = a;
        int i23 = ((i22 | 95) << 1) - (i22 ^ 95);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            throw null;
        }
        if (this.g) {
            ivas.gov.bisp.enumeration.p096p.h.m(bArr3, bArr, i);
            byte[] bArr4 = this.f89o;
            int i24 = b;
            int i25 = (i24 ^ 58) + ((i24 & 58) << 1);
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            a = i26 % 128;
            if (i26 % 2 != 0) {
                ivas.gov.bisp.enumeration.p096p.h.p(bArr4, bArr3);
                this.e.n(bArr4);
                int i27 = 29 / 0;
            } else {
                ivas.gov.bisp.enumeration.p096p.h.p(bArr4, bArr3);
                this.e.n(bArr4);
            }
            int i28 = a;
            int i29 = (((i28 | 60) << 1) - (i28 ^ 60)) - 1;
            b = i29 % 128;
            int i30 = i29 % 2;
            System.arraycopy(bArr3, 0, bArr2, i2, 16);
            int i31 = b;
            int i32 = i31 ^ 101;
            int i33 = ((i31 & 101) | i32) << 1;
            int i34 = -i32;
            int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
            a = i35 % 128;
            int i36 = i35 % 2;
        } else {
            byte[] bArr5 = this.f89o;
            ivas.gov.bisp.enumeration.p096p.h.m(bArr5, bArr, i);
            int i37 = a;
            int i38 = ((i37 ^ 113) | (i37 & 113)) << 1;
            int i39 = -(((~i37) & 113) | (i37 & (-114)));
            int i40 = (i38 & i39) + (i39 | i38);
            b = i40 % 128;
            if (i40 % 2 == 0) {
                this.e.n(bArr5);
            } else {
                this.e.n(bArr5);
            }
            int i41 = 0;
            while (true) {
                int i42 = ~i41;
                int i43 = -i42;
                int i44 = ((i2 ^ i43) + ((i43 & i2) << 1)) - 1;
                byte b2 = bArr3[(-(~(-(-i41)))) - 1];
                int i45 = b;
                int i46 = (i45 & 91) + (i45 | 91);
                int i47 = i46 % 128;
                a = i47;
                if (i46 % 2 != 0) {
                    byte b3 = bArr[i >> i41];
                    int i48 = ((~b2) & b3) | ((~b3) & b2);
                    int i49 = b3 & b2;
                    bArr2[i44] = (byte) ((i48 & i49) | (i48 ^ i49));
                    int i50 = ((i41 | 117) << 1) - (i41 ^ 117);
                    i3 = (i50 ^ (-1)) + (i50 << 1);
                } else {
                    int i51 = ((i ^ i41) | (i & i41)) << 1;
                    int i52 = -((i42 & i) | ((~i) & i41));
                    byte b4 = bArr[(i51 ^ i52) + ((i51 & i52) << 1)];
                    bArr2[i44] = (byte) ((b4 & (~b2)) | ((~b4) & b2));
                    int i53 = ((i41 | (-53)) << 1) - (i41 ^ (-53));
                    i3 = ((i53 | 54) << 1) - (i53 ^ 54);
                }
                int i54 = -(-i3);
                int i55 = ~i54;
                int i56 = (i2 - i55) - 1;
                byte b5 = bArr3[(-2) - (~(-(~i3)))];
                int i57 = (i55 & i) | ((~i) & i54);
                int i58 = -(-((i54 & i) << 1));
                byte b6 = bArr[((i57 | i58) << 1) - (i58 ^ i57)];
                int i59 = (~b6) & b5;
                int i60 = b6 & (~b5);
                int i61 = (i60 & i59) | (i59 ^ i60);
                int i62 = (i47 & 111) + (i47 | 111);
                b = i62 % 128;
                if (i62 % 2 == 0) {
                    bArr2[i56] = (byte) i61;
                    int i63 = (((i3 & 17) | ((~i3) & (-18))) - (~(-(-((i3 & (-18)) << 1))))) - 1;
                    i4 = ((i63 & 98) - (~(-(-(i63 | 98))))) - 1;
                    int i64 = -(~(-(-i4)));
                    int i65 = ((i2 | i64) << 1) - (i64 ^ i2);
                    i5 = (i65 ^ (-1)) + (i65 << 1);
                    i6 = 1;
                } else {
                    bArr2[i56] = (byte) i61;
                    i4 = i3 + 1;
                    int i66 = i2 & i4;
                    i5 = (i66 - (~(-(-((i2 ^ i4) | i66))))) - 1;
                    i6 = 0;
                }
                int i67 = -(-i4);
                byte b7 = bArr3[(i6 - (~(-(~i67)))) - 2];
                byte b8 = bArr[((i | i67) << 1) - (i67 ^ i)];
                int i68 = b7 & b8;
                bArr2[i5] = (byte) (((b7 ^ b8) | i68) & (~i68));
                int i69 = ((i4 | 38) << 1) - (i4 ^ 38);
                int i70 = (-2) - ((((i69 | (-36)) << 1) - (i69 ^ (-36))) ^ (-1));
                int i71 = (i47 & (-20)) | ((~i47) & 19);
                int i72 = (i47 & 19) << 1;
                int i73 = (i71 & i72) + (i71 | i72);
                int i74 = i73 % 128;
                b = i74;
                int i75 = i73 % 2;
                int i76 = -i70;
                int i77 = (i2 - (~(-i76))) - 1;
                byte b9 = bArr3[i70];
                int i78 = i74 & 53;
                int i79 = ((((i74 ^ 53) | i78) << 1) - (~(-((i74 | 53) & (~i78))))) - 1;
                int i80 = i79 % 128;
                a = i80;
                if (i79 % 2 != 0) {
                    byte b10 = bArr[(i ^ i76) + ((i76 & i) << 1)];
                    bArr2[i77] = (byte) ((b10 & b9) | (b9 ^ b10));
                    i41 = i70 % 1;
                } else {
                    byte b11 = bArr[i + i70];
                    int i81 = b9 & b11;
                    bArr2[i77] = (byte) (((b11 ^ b9) | i81) & (~i81));
                    i41 = ((i70 ^ 2) + ((i70 & 2) << 1)) - 1;
                }
                int i82 = (i80 & 21) + (i80 | 21);
                b = i82 % 128;
                if (i82 % 2 == 0) {
                    if (i41 >= 102) {
                        break;
                    }
                } else if (i41 >= 16) {
                    break;
                }
            }
        }
        this.x += 16;
        int i83 = b;
        int i84 = (i83 ^ 9) + ((i83 & 9) << 1);
        a = i84 % 128;
        int i85 = i84 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:153:0x069a A[PHI: r5
  0x069a: PHI (r5v40 byte[]) = (r5v39 byte[]), (r5v43 byte[]) binds: [B:152:0x0698, B:148:0x068a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:176:0x0344 A[EDGE_INSN: B:176:0x0344->B:84:0x0344 BREAK  A[LOOP:4: B:67:0x025a->B:79:0x032c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0344 A[EDGE_INSN: B:177:0x0344->B:84:0x0344 BREAK  A[LOOP:4: B:67:0x025a->B:79:0x032c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0227  */
    /* JADX WARN: Code duplicated, block: B:62:0x022d  */
    /* JADX WARN: Code duplicated, block: B:64:0x023c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0241  */
    /* JADX WARN: Code duplicated, block: B:69:0x0262  */
    /* JADX WARN: Code duplicated, block: B:72:0x029f  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:76:0x031f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0334  */
    /* JADX WARN: Code duplicated, block: B:83:0x0341  */
    public int e(byte[] bArr, int i) {
        long j;
        int i2;
        boolean z;
        int i3;
        int length;
        byte[] bArr2;
        boolean z2;
        byte[] bArr3;
        int i4;
        int i5;
        int i6;
        long[] jArr;
        long[] jArr2;
        long j2;
        long j3;
        long j4;
        int i7;
        long j5;
        char c;
        long j6;
        long j7;
        long j8;
        int i8;
        int i9;
        int i10;
        byte[] bArr4;
        byte[] bArr5;
        int i11;
        int i12 = 2 % 2;
        int i13 = b + 105;
        a = i13 % 128;
        int i14 = i13 % 2;
        d();
        long j9 = 0;
        Object obj = null;
        int i15 = 1;
        if (this.x == 0) {
            int i16 = a;
            int i17 = (i16 | 87) << 1;
            int i18 = -(((~i16) & 87) | (i16 & (-88)));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                k();
                obj.hashCode();
                throw null;
            }
            k();
        }
        int i20 = this.u;
        if (this.g) {
            int length2 = bArr.length;
            int i21 = -i;
            int i22 = length2 & i21;
            int i23 = -(-((length2 ^ i21) | i22));
            int i24 = (i22 & i23) + (i23 | i22);
            int i25 = this.h;
            int i26 = -(-i20);
            int i27 = i25 & i26;
            int i28 = (i25 | i26) & (~i27);
            int i29 = -(-(i27 << 1));
            if (i24 < (i28 & i29) + (i28 | i29)) {
                throw new z("Output buffer too short");
            }
        } else {
            int i30 = this.h;
            if (i20 < i30) {
                throw new C0327p("data too short");
            }
            int i31 = b;
            int i32 = ((i31 ^ 90) + ((i31 & 90) << 1)) - 1;
            a = i32 % 128;
            int i33 = i32 % 2;
            int i34 = -(~(-i30));
            i20 = (-2) - (((i20 ^ i34) + ((i20 & i34) << 1)) ^ (-1));
            int length3 = bArr.length;
            int i35 = -i;
            if ((((length3 | i35) << 1) - (~(-(((~length3) & i35) | ((~i35) & length3))))) - 1 < i20) {
                throw new z("Output buffer too short");
            }
        }
        int i36 = 0;
        if (i20 > 0) {
            int i37 = b;
            int i38 = i37 & 13;
            int i39 = (~i38) & (i37 | 13);
            int i40 = -(-(i38 << 1));
            int i41 = (i39 & i40) + (i39 | i40);
            a = i41 % 128;
            int i42 = i41 % 2;
            byte[] bArr6 = this.n;
            byte[] bArr7 = new byte[16];
            i(bArr7);
            if (!this.g) {
                g(this.f89o, bArr6, 0, i20);
                int i43 = b;
                int i44 = (i43 | 99) << 1;
                int i45 = -(i43 ^ 99);
                int i46 = (i44 & i45) + (i44 | i45);
                a = i46 % 128;
                if (i46 % 2 != 0) {
                    ivas.gov.bisp.enumeration.p096p.h.n(bArr6, 0, bArr7, 0, i20);
                } else {
                    ivas.gov.bisp.enumeration.p096p.h.n(bArr6, 0, bArr7, 0, i20);
                }
            } else {
                int i47 = a;
                int i48 = i47 & 7;
                int i49 = ((((i47 ^ 7) | i48) << 1) - (~(-((i47 | 7) & (~i48))))) - 1;
                b = i49 % 128;
                int i50 = i49 % 2;
                ivas.gov.bisp.enumeration.p096p.h.n(bArr6, 0, bArr7, 0, i20);
                byte[] bArr8 = this.f89o;
                int i51 = a;
                int i52 = i51 & 5;
                int i53 = i52 + ((i51 ^ 5) | i52);
                b = i53 % 128;
                int i54 = i53 % 2;
                g(bArr8, bArr6, 0, i20);
                int i55 = a;
                int i56 = i55 & 109;
                int i57 = i55 | 109;
                int i58 = (i56 & i57) + (i57 | i56);
                b = i58 % 128;
                int i59 = i58 % 2;
            }
            System.arraycopy(bArr6, 0, bArr, i, i20);
            this.x += (long) i20;
            int i60 = b;
            int i61 = ((i60 & (-112)) | ((~i60) & 111)) + ((i60 & 111) << 1);
            a = i61 % 128;
            if (i61 % 2 != 0) {
                int i62 = 5 / 2;
            }
        }
        long j10 = this.z;
        int i63 = this.y;
        int i64 = a;
        int i65 = (19 & (~i64)) | (i64 & (-20));
        int i66 = -(-((i64 & 19) << 1));
        int i67 = (i65 & i66) + (i65 | i66);
        int i68 = i67 % 128;
        b = i68;
        if (i67 % 2 == 0) {
            j = j10 * ((long) i63);
            this.z = j;
        } else {
            j = j10 + ((long) i63);
            this.z = j;
        }
        if (j > this.v) {
            if (i63 > 0) {
                int i69 = i68 & 85;
                int i70 = i69 + ((i68 ^ 85) | i69);
                int i71 = i70 % 128;
                a = i71;
                if (i70 % 2 != 0) {
                    bArr4 = this.q;
                    bArr5 = this.w;
                    i11 = 1;
                } else {
                    bArr4 = this.q;
                    bArr5 = this.w;
                    i11 = 0;
                }
                int i72 = i71 ^ 99;
                int i73 = ((i71 & 99) | i72) << 1;
                int i74 = -i72;
                int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
                b = i75 % 128;
                int i76 = i75 % 2;
                g(bArr4, bArr5, i11, i63);
            }
            if (this.v > 0) {
                int i77 = a;
                int i78 = i77 & 83;
                int i79 = (i77 ^ 83) | i78;
                int i80 = (i78 & i79) + (i79 | i78);
                b = i80 % 128;
                if (i80 % 2 == 0) {
                    ivas.gov.bisp.enumeration.p096p.h.p(this.q, this.r);
                    int i81 = 14 / 0;
                } else {
                    ivas.gov.bisp.enumeration.p096p.h.p(this.q, this.r);
                }
            }
            long j11 = ((this.x * 8) + 127) >>> 7;
            byte[] bArr9 = new byte[16];
            if (this.f == null) {
                a aVar = new a(5);
                this.f = aVar;
                int i82 = b;
                int i83 = i82 & 125;
                int i84 = i83 + ((i82 ^ 125) | i83);
                a = i84 % 128;
                int i85 = i84 % 2;
                aVar.c = ivas.gov.bisp.enumeration.p096p.h.c(this.l);
                int i86 = a;
                int i87 = (i86 & 115) + (i86 | 115);
                b = i87 % 128;
                int i88 = i87 % 2;
            }
            a aVar2 = this.f;
            Objects.requireNonNull(aVar2);
            long[] jArr3 = new long[2];
            int i89 = a + 17;
            b = i89 % 128;
            if (i89 % 2 == 0) {
                jArr3[1] = Long.MIN_VALUE;
                if (j11 > 1) {
                    jArr = (long[]) aVar2.c;
                    if (jArr == null) {
                        int i90 = b;
                        i10 = ((i90 | 47) << 1) - (i90 ^ 47);
                        a = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i91 = 65 / 0;
                        }
                        jArr2 = null;
                    } else {
                        jArr2 = (long[]) jArr.clone();
                        int i92 = a;
                        int i93 = i92 & 39;
                        int i94 = (i92 ^ 39) | i93;
                        int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                        b = i95 % 128;
                        int i96 = i95 % 2;
                    }
                    while (true) {
                        if ((j11 & 1) != j9) {
                            ivas.gov.bisp.enumeration.p096p.h.o(jArr3, jArr2);
                        }
                        long[] jArr4 = new long[4];
                        r.G(jArr2[i36], jArr4, i36);
                        long j12 = jArr2[i15];
                        int i97 = b;
                        int i98 = ((i97 ^ 98) + ((i97 & 98) << i15)) - 1;
                        a = i98 % 128;
                        int i99 = i98 % 2;
                        r.G(j12, jArr4, 2);
                        long j13 = jArr4[i36];
                        long j14 = jArr4[1];
                        j2 = jArr4[2];
                        j3 = jArr4[3];
                        j4 = j3 << 57;
                        int i100 = b;
                        i7 = i100 + 85;
                        i2 = i20;
                        a = i7 % 128;
                        if (i7 % 2 != 0) {
                            j5 = j2 & (j4 | (j3 >>> 62) | (j3 >>> 125));
                            c = 1;
                        } else {
                            j5 = j2 ^ (j4 ^ ((j3 << 63) ^ (j3 << 62)));
                            c = 0;
                        }
                        jArr2[c] = j13 ^ ((((j5 >>> 1) ^ j5) ^ (j5 >>> 2)) ^ (j5 >>> 7));
                        int i101 = ((i100 ^ 13) | (i100 & 13)) << 1;
                        int i102 = -((i100 & (-14)) | ((~i100) & 13));
                        int i103 = (i101 ^ i102) + ((i101 & i102) << 1);
                        int i104 = i103 % 128;
                        a = i104;
                        int i105 = i103 % 2;
                        int i106 = i104 + 19;
                        int i107 = i106 % 128;
                        b = i107;
                        int i108 = i106 % 2;
                        j6 = j14 ^ ((((j3 >>> 1) ^ j3) ^ (j3 >>> 2)) ^ (j3 >>> 7));
                        j7 = j5 << 57;
                        j8 = (j5 << 63) ^ (j5 << 62);
                        int i109 = i107 & 113;
                        int i110 = i109 - (~(-(-((i107 ^ 113) | i109))));
                        i8 = 1;
                        i9 = i110 - 1;
                        a = i9 % 128;
                        if (i9 % 2 != 0) {
                            jArr2[1] = j6 % (j7 | j8);
                            j11 >>= 1;
                            if (j11 <= 1) {
                                break;
                            }
                            i15 = 1;
                            i20 = i2;
                            j9 = 0;
                            i36 = 0;
                        } else {
                            jArr2[1] = j6 ^ (j7 ^ j8);
                            j11 >>>= 1;
                            if (j11 <= 0) {
                                break;
                            }
                            i15 = 1;
                            i20 = i2;
                            j9 = 0;
                            i36 = 0;
                        }
                    }
                } else {
                    i2 = i20;
                    i8 = 1;
                }
            } else {
                jArr3[0] = Long.MIN_VALUE;
                if (j11 > 0) {
                    jArr = (long[]) aVar2.c;
                    if (jArr == null) {
                        int i910 = b;
                        i10 = ((i910 | 47) << 1) - (i910 ^ 47);
                        a = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i911 = 65 / 0;
                        }
                        jArr2 = null;
                    } else {
                        jArr2 = (long[]) jArr.clone();
                        int i912 = a;
                        int i913 = i912 & 39;
                        int i914 = (i912 ^ 39) | i913;
                        int i915 = ((i913 | i914) << 1) - (i914 ^ i913);
                        b = i915 % 128;
                        int i916 = i915 % 2;
                    }
                    while (true) {
                        if ((j11 & 1) != j9) {
                            ivas.gov.bisp.enumeration.p096p.h.o(jArr3, jArr2);
                        }
                        long[] jArr5 = new long[4];
                        r.G(jArr2[i36], jArr5, i36);
                        long j15 = jArr2[i15];
                        int i917 = b;
                        int i918 = ((i917 ^ 98) + ((i917 & 98) << i15)) - 1;
                        a = i918 % 128;
                        int i919 = i918 % 2;
                        r.G(j15, jArr5, 2);
                        long j16 = jArr5[i36];
                        long j17 = jArr5[1];
                        j2 = jArr5[2];
                        j3 = jArr5[3];
                        j4 = j3 << 57;
                        int i1010 = b;
                        i7 = i1010 + 85;
                        i2 = i20;
                        a = i7 % 128;
                        if (i7 % 2 != 0) {
                            j5 = j2 & (j4 | (j3 >>> 62) | (j3 >>> 125));
                            c = 1;
                        } else {
                            j5 = j2 ^ (j4 ^ ((j3 << 63) ^ (j3 << 62)));
                            c = 0;
                        }
                        jArr2[c] = j16 ^ ((((j5 >>> 1) ^ j5) ^ (j5 >>> 2)) ^ (j5 >>> 7));
                        int i1011 = ((i1010 ^ 13) | (i1010 & 13)) << 1;
                        int i1012 = -((i1010 & (-14)) | ((~i1010) & 13));
                        int i1013 = (i1011 ^ i1012) + ((i1011 & i1012) << 1);
                        int i1014 = i1013 % 128;
                        a = i1014;
                        int i1015 = i1013 % 2;
                        int i1016 = i1014 + 19;
                        int i1017 = i1016 % 128;
                        b = i1017;
                        int i1018 = i1016 % 2;
                        j6 = j17 ^ ((((j3 >>> 1) ^ j3) ^ (j3 >>> 2)) ^ (j3 >>> 7));
                        j7 = j5 << 57;
                        j8 = (j5 << 63) ^ (j5 << 62);
                        int i1019 = i1017 & 113;
                        int i111 = i1019 - (~(-(-((i1017 ^ 113) | i1019))));
                        i8 = 1;
                        i9 = i111 - 1;
                        a = i9 % 128;
                        if (i9 % 2 != 0) {
                            jArr2[1] = j6 % (j7 | j8);
                            j11 >>= 1;
                            if (j11 <= 1) {
                                break;
                                break;
                            }
                            i15 = 1;
                            i20 = i2;
                            j9 = 0;
                            i36 = 0;
                        } else {
                            jArr2[1] = j6 ^ (j7 ^ j8);
                            j11 >>>= 1;
                            if (j11 <= 0) {
                                break;
                                break;
                            }
                            i15 = 1;
                            i20 = i2;
                            j9 = 0;
                            i36 = 0;
                        }
                    }
                } else {
                    i2 = i20;
                    i8 = 1;
                }
            }
            int i112 = b;
            int i113 = (i112 ^ 91) + ((i112 & 91) << i8);
            a = i113 % 128;
            int i114 = i113 % 2;
            int i115 = 0;
            int i116 = 0;
            while (i115 < 2) {
                ivas.gov.bisp.enumeration.p096p.h.l(jArr3[i115], bArr9, i116);
                int i117 = i116 & 8;
                i116 = (((i116 ^ 8) | i117) << 1) - ((i116 | 8) & (~i117));
                int i118 = i115 ^ 1;
                int i119 = (i115 & 1) << 1;
                i115 = (i119 | i118) + (i118 & i119);
                int i120 = b;
                int i121 = i120 & 15;
                int i122 = -(-(i120 | 15));
                int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                a = i123 % 128;
                int i124 = i123 % 2;
            }
            byte[] bArr10 = this.q;
            long[] jArrC = ivas.gov.bisp.enumeration.p096p.h.c(bArr10);
            int i125 = b;
            int i126 = (i125 ^ 21) + ((i125 & 21) << 1);
            a = i126 % 128;
            if (i126 % 2 != 0) {
                ivas.gov.bisp.enumeration.p096p.h.o(jArrC, ivas.gov.bisp.enumeration.p096p.h.c(bArr9));
            } else {
                ivas.gov.bisp.enumeration.p096p.h.o(jArrC, ivas.gov.bisp.enumeration.p096p.h.c(bArr9));
            }
            int i127 = 0;
            int i128 = 0;
            while (i127 < jArrC.length) {
                int i129 = b;
                int i130 = (i129 & 15) + (i129 | 15);
                a = i130 % 128;
                int i131 = i130 % 2;
                ivas.gov.bisp.enumeration.p096p.h.l(jArrC[i127], bArr10, i128);
                int i132 = i128 ^ (-37);
                int i133 = -(-((i128 & (-37)) << 1));
                int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                int i135 = i134 & 45;
                int i136 = (~i135) & (i134 | 45);
                int i137 = i135 << 1;
                i128 = ((i137 & i136) << 1) + (i136 ^ i137);
                int i138 = b;
                int i139 = i138 & 125;
                int i140 = -(-((i138 ^ 125) | i139));
                int i141 = (i139 ^ i140) + ((i139 & i140) << 1);
                a = i141 % 128;
                int i142 = i141 % 2;
                int i143 = i127 & (-14);
                int i144 = i127 | (-14);
                int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                int i146 = i145 ^ 15;
                int i147 = (i145 & 15) << 1;
                i127 = ((i146 & i147) << 1) + (i146 ^ i147);
                int i148 = i138 & 7;
                int i149 = (i148 - (~((i138 ^ 7) | i148))) - 1;
                a = i149 % 128;
                int i150 = i149 % 2;
            }
            ivas.gov.bisp.enumeration.p096p.h.p(this.f89o, this.q);
            int i151 = a;
            int i152 = ((i151 ^ 105) | (i151 & 105)) << 1;
            int i153 = -(((~i151) & 105) | (i151 & (-106)));
            int i154 = (i152 & i153) + (i153 | i152);
            b = i154 % 128;
            int i155 = i154 % 2;
        } else {
            i2 = i20;
        }
        byte[] bArr11 = new byte[16];
        long j18 = this.z * 8;
        int i156 = b;
        int i157 = (i156 & 37) + (i156 | 37);
        a = i157 % 128;
        int i158 = i157 % 2;
        ivas.gov.bisp.enumeration.p096p.h.l(j18, bArr11, 0);
        ivas.gov.bisp.enumeration.p096p.h.l(this.x * 8, bArr11, 8);
        byte[] bArr12 = this.f89o;
        ivas.gov.bisp.enumeration.p096p.h.p(bArr12, bArr11);
        this.e.n(bArr12);
        byte[] bArr13 = new byte[16];
        h hVar = this.d;
        byte[] bArr14 = this.m;
        int i159 = a;
        int i160 = (i159 ^ 53) + ((i159 & 53) << 1);
        b = i160 % 128;
        if (i160 % 2 == 0) {
            ((ivas.gov.bisp.enumeration.dh.j) hVar).e(bArr14, 0, bArr13, 0);
        } else {
            ((ivas.gov.bisp.enumeration.dh.j) hVar).e(bArr14, 0, bArr13, 0);
        }
        int i161 = a;
        int i162 = i161 ^ 19;
        int i163 = -(-((i161 & 19) << 1));
        int i164 = (i162 & i163) + (i163 | i162);
        b = i164 % 128;
        if (i164 % 2 == 0) {
            ivas.gov.bisp.enumeration.p096p.h.p(bArr13, this.f89o);
            byte[] bArr15 = new byte[this.h];
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.p096p.h.p(bArr13, this.f89o);
        int i165 = this.h;
        byte[] bArr16 = new byte[i165];
        int i166 = a;
        int i167 = (-2) - (((i166 & 102) + (i166 | 102)) ^ (-1));
        b = i167 % 128;
        if (i167 % 2 == 0) {
            this.p = bArr16;
            System.arraycopy(bArr13, 0, bArr16, 1, i165);
        } else {
            this.p = bArr16;
            System.arraycopy(bArr13, 0, bArr16, 0, i165);
        }
        if (this.g) {
            int i168 = a;
            int i169 = (i168 & 31) + (i168 | 31);
            int i170 = i169 % 128;
            b = i170;
            if (i169 % 2 == 0) {
                bArr3 = this.p;
                i4 = i % this.u;
                i5 = this.h;
            } else {
                bArr3 = this.p;
                int i171 = -(-this.u);
                i4 = ((i & i171) << 1) + (i ^ i171);
                i5 = this.h;
            }
            int i172 = i170 + 57;
            a = i172 % 128;
            if (i172 % 2 != 0) {
                System.arraycopy(bArr3, 0, bArr, i4, i5);
                i6 = i2 >>> this.h;
            } else {
                System.arraycopy(bArr3, 0, bArr, i4, i5);
                int i173 = this.h;
                i6 = ((i2 & i173) << 1) + (i2 ^ i173);
            }
            i3 = i6;
        } else {
            int i174 = this.h;
            byte[] bArr17 = new byte[i174];
            int i175 = i2;
            System.arraycopy(this.n, i175, bArr17, 0, i174);
            byte[] bArr18 = this.p;
            if (bArr18 == null) {
                z = false;
            } else if (bArr18 == bArr17) {
                z = true;
            } else {
                if (bArr18.length < i174) {
                    int i176 = b;
                    int i177 = (((i176 ^ 31) | (i176 & 31)) << 1) - (((~i176) & 31) | (i176 & (-32)));
                    a = i177 % 128;
                    if (i177 % 2 != 0) {
                        int length4 = bArr18.length;
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    length = bArr18.length;
                } else {
                    length = i174;
                }
                int length5 = bArr18.length;
                int i178 = (length5 | i174) & (~(length5 & i174));
                for (int i179 = 0; i179 != length; i179++) {
                    int i180 = a;
                    int i181 = (i180 & (-100)) | ((~i180) & 99);
                    int i182 = -(-((i180 & 99) << 1));
                    int i183 = ((i181 | i182) << 1) - (i181 ^ i182);
                    b = i183 % 128;
                    if (i183 % 2 == 0) {
                        i178 &= bArr18[i179] & bArr17[i179];
                    } else {
                        byte b2 = bArr18[i179];
                        byte b3 = bArr17[i179];
                        int i184 = (~b3) & b2;
                        int i185 = (~b2) & b3;
                        int i186 = (i185 & i184) | (i184 ^ i185);
                        int i187 = ((~i186) & i178) | ((~i178) & i186);
                        int i188 = i178 & i186;
                        i178 = (i188 & i187) | (i187 ^ i188);
                    }
                    int i189 = i180 + 121;
                    b = i189 % 128;
                    int i190 = i189 % 2;
                }
                while (length < i174) {
                    int i191 = b;
                    int i192 = ((i191 | 97) << 1) - (i191 ^ 97);
                    a = i192 % 128;
                    int i193 = i192 % 2;
                    byte b4 = bArr17[length];
                    int i194 = ~b4;
                    int i195 = (~i194) & b4;
                    int i196 = (~b4) & i194;
                    int i197 = (i196 & i195) | (i195 ^ i196);
                    i178 = (i178 & i197) | (i178 ^ i197);
                    length = ((length | 1) << 1) - (length ^ 1);
                    int i198 = i191 & 103;
                    int i199 = i198 + ((i191 ^ 103) | i198);
                    a = i199 % 128;
                    int i200 = i199 % 2;
                }
                if (i178 == 0) {
                    int i201 = b;
                    int i202 = i201 & 77;
                    int i203 = -(-((i201 ^ 77) | i202));
                    int i204 = ((i202 | i203) << 1) - (i203 ^ i202);
                    int i205 = i204 % 128;
                    a = i205;
                    int i206 = i204 % 2;
                    int i207 = i205 | 115;
                    int i208 = i207 << 1;
                    int i209 = -((~(i205 & 115)) & i207);
                    int i210 = (i208 ^ i209) + ((i209 & i208) << 1);
                    b = i210 % 128;
                    int i211 = i210 % 2;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                throw new C0327p("mac check in GCM failed");
            }
            i3 = i175;
        }
        Objects.requireNonNull(this.d);
        this.f89o = new byte[16];
        int i212 = a;
        int i213 = i212 & 23;
        int i214 = -(-((i212 ^ 23) | i213));
        int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
        int i216 = i215 % 128;
        b = i216;
        int i217 = i215 % 2;
        this.q = new byte[16];
        this.r = new byte[16];
        int i218 = i216 ^ 49;
        int i219 = ((i216 & 49) | i218) << 1;
        int i220 = -i218;
        int i221 = (i219 ^ i220) + ((i219 & i220) << 1);
        int i222 = i221 % 128;
        a = i222;
        int i223 = i221 % 2;
        this.w = new byte[16];
        this.y = 0;
        int i224 = (((i222 | 1) << 1) - (~(-(i222 ^ 1)))) - 1;
        b = i224 % 128;
        int i225 = i224 % 2;
        this.z = 0L;
        this.v = 0L;
        byte[] bArr19 = this.m;
        int i226 = ((i222 ^ 32) + ((i222 & 32) << 1)) - 1;
        b = i226 % 128;
        int i227 = i226 % 2;
        this.t = ivas.gov.bisp.enumeration.p064cj.j.c(bArr19);
        this.s = -2;
        int i228 = a;
        int i229 = i228 & 53;
        int i230 = (i229 - (~((i228 ^ 53) | i229))) - 1;
        b = i230 % 128;
        if (i230 % 2 == 0) {
            this.u = 0;
            this.x = 1L;
            bArr2 = this.n;
            if (bArr2 != null) {
                int i231 = i228 + 110;
                int i232 = (i231 ^ (-1)) + (i231 << 1);
                b = i232 % 128;
                int i233 = i232 % 2;
                z2 = false;
                Arrays.fill(bArr2, (byte) 0);
            } else {
                z2 = false;
            }
        } else {
            this.u = 0;
            this.x = 0L;
            bArr2 = this.n;
            if (bArr2 != null) {
                int i234 = i228 + 110;
                int i235 = (i234 ^ (-1)) + (i234 << 1);
                b = i235 % 128;
                int i236 = i235 % 2;
                z2 = false;
                Arrays.fill(bArr2, (byte) 0);
            } else {
                z2 = false;
            }
        }
        if (this.g) {
            this.i = z2;
            int i237 = b;
            int i238 = ((i237 | 99) << 1) - (i237 ^ 99);
            a = i238 % 128;
            int i239 = i238 % 2;
        } else {
            byte[] bArr20 = this.c;
            if (bArr20 != null) {
                c(bArr20, 0, bArr20.length);
            }
        }
        return i3;
    }

    public void j(boolean z, ivas.gov.bisp.enumeration.p101x.r rVar) {
        int i;
        byte[] bArr;
        int iMin;
        int i2;
        long j;
        byte b2;
        Class cls;
        char c;
        int iJ;
        char c2;
        int iJ2;
        boolean z2;
        int iD;
        int[] iArr;
        char c3;
        long j2;
        int i3;
        long j3;
        char c4;
        int iJ3;
        int[] iArr2;
        char c5;
        int iJ4;
        int i4;
        int iD2;
        byte[] bArr2;
        int i5 = 2 % 2;
        this.g = z;
        Object obj = null;
        this.p = null;
        int i6 = 1;
        this.i = true;
        int i7 = b;
        int i8 = i7 & 121;
        int i9 = (i7 ^ 121) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        ivas.gov.bisp.enumeration.p072cr.j jVar = (ivas.gov.bisp.enumeration.p072cr.j) rVar;
        byte[] bArrC = ivas.gov.bisp.enumeration.p064cj.j.c(jVar.b);
        this.c = ivas.gov.bisp.enumeration.p064cj.j.c(jVar.a);
        int i12 = a;
        int i13 = ((i12 | 77) << 1) - (i12 ^ 77);
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = jVar.d;
        if (i15 >= 32 && i15 <= 128) {
            int i16 = a;
            int i17 = i16 & 17;
            int i18 = i17 + ((i16 ^ 17) | i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            if (i15 % 8 == 0) {
                int i20 = 8;
                int i21 = i15 / 8;
                this.h = i21;
                c cVar = jVar.c;
                int i22 = b;
                int i23 = (i22 & 7) + (i22 | 7);
                int i24 = i23 % 128;
                a = i24;
                if (i23 % 2 != 0) {
                    throw null;
                }
                if (z) {
                    i = 16;
                } else {
                    i = i21 + 16;
                    int i25 = i24 ^ 79;
                    int i26 = ((i24 & 79) | i25) << 1;
                    int i27 = -i25;
                    int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
                this.n = new byte[i];
                if (bArrC == null || bArrC.length <= 0) {
                    throw new IllegalArgumentException("IV must be at least 1 byte");
                }
                if (!(!z) && (bArr2 = this.k) != null) {
                    int i30 = i24 + 55;
                    b = i30 % 128;
                    if (i30 % 2 == 0) {
                        Arrays.equals(bArr2, bArrC);
                        obj.hashCode();
                        throw null;
                    }
                    if (Arrays.equals(bArr2, bArrC)) {
                        if (cVar == null) {
                            throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                        }
                        int i31 = b;
                        int i32 = i31 ^ 119;
                        int i33 = (i31 & 119) << 1;
                        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                        a = i34 % 128;
                        int i35 = i34 % 2;
                        byte[] bArr3 = this.j;
                        if (bArr3 != null && Arrays.equals(bArr3, cVar.a)) {
                            throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                        }
                    }
                }
                this.k = bArrC;
                if (cVar != null) {
                    this.j = cVar.a;
                    int i36 = b;
                    int i37 = i36 & 99;
                    int i38 = (((i36 ^ 99) | i37) << 1) - ((i36 | 99) & (~i37));
                    a = i38 % 128;
                    int i39 = i38 % 2;
                }
                if (cVar != null) {
                    ivas.gov.bisp.enumeration.dh.j jVar2 = (ivas.gov.bisp.enumeration.dh.j) this.d;
                    Objects.requireNonNull(jVar2);
                    byte[] bArr4 = cVar.a;
                    int length = bArr4.length;
                    if (length >= 16 && length <= 32) {
                        int i40 = b;
                        int i41 = i40 & 49;
                        int i42 = (i40 | 49) & (~i41);
                        int i43 = i41 << 1;
                        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                        int i45 = i44 % 128;
                        a = i45;
                        int i46 = i44 % 2;
                        if ((length & 7) == 0) {
                            int i47 = i45 ^ 39;
                            int i48 = -(-((i45 & 39) << 1));
                            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                            b = i49 % 128;
                            int i50 = i49 % 2;
                            int i51 = length >>> 2;
                            int i52 = i51 ^ 6;
                            int i53 = -(-((i51 & 6) << 1));
                            int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                            jVar2.h = i54;
                            int[] iArr3 = new int[2];
                            int i55 = b;
                            int i56 = i55 ^ 31;
                            int i57 = -(-((i55 & 31) << 1));
                            int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                            a = i58 % 128;
                            if (i58 % 2 != 0) {
                                iArr3[0] = 2;
                                iArr3[0] = i54;
                                cls = Integer.TYPE;
                            } else {
                                iArr3[1] = 4;
                                int i59 = ((i54 ^ 1) | (i54 & 1)) << 1;
                                int i60 = -((i54 & (-2)) | ((~i54) & 1));
                                iArr3[0] = ((i59 | i60) << 1) - (i59 ^ i60);
                                cls = Integer.TYPE;
                            }
                            int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iArr3);
                            if (i51 != 4) {
                                int i61 = b;
                                int i62 = i61 & 45;
                                int i63 = (i61 ^ 45) | i62;
                                int i64 = (i62 & i63) + (i62 | i63);
                                a = i64 % 128;
                                int i65 = i64 % 2;
                                if (i51 == 6) {
                                    int iJ5 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 0);
                                    iArr4[0][0] = iJ5;
                                    int iJ6 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 4);
                                    iArr4[0][1] = iJ6;
                                    int i66 = b;
                                    int i67 = i66 ^ 63;
                                    int i68 = ((((i66 & 63) | i67) << 1) - (~(-i67))) - 1;
                                    a = i68 % 128;
                                    if (i68 % 2 != 0) {
                                        iJ3 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 8);
                                        iArr2 = iArr4[1];
                                        c5 = 4;
                                    } else {
                                        iJ3 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 8);
                                        iArr2 = iArr4[0];
                                        c5 = 2;
                                    }
                                    iArr2[c5] = iJ3;
                                    int iJ7 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 12);
                                    int i69 = b;
                                    int i70 = i69 & 33;
                                    int i71 = (i70 - (~(-(-((i69 ^ 33) | i70))))) - 1;
                                    a = i71 % 128;
                                    if (i71 % 2 != 0) {
                                        iArr4[1][4] = iJ7;
                                        iJ4 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 5);
                                    } else {
                                        iArr4[0][3] = iJ7;
                                        iJ4 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 16);
                                    }
                                    int iJ8 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 20);
                                    int i72 = b;
                                    int i73 = i72 & 19;
                                    int i74 = (i72 ^ 19) | i73;
                                    int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                                    a = i75 % 128;
                                    int i76 = (i75 % 2 != 0 ? 1 : 0) ^ 1;
                                    int i77 = 1;
                                    while (true) {
                                        int[] iArr5 = iArr4[i77];
                                        iArr5[0] = iJ4;
                                        iArr5[i6] = iJ8;
                                        int iD3 = ivas.gov.bisp.enumeration.dh.j.d(ivas.gov.bisp.enumeration.dh.j.c(iJ8, 8));
                                        int i78 = i76 << 1;
                                        int i79 = iD3 & i76;
                                        int i80 = ((iD3 ^ i76) | i79) & (~i79);
                                        int i81 = (iJ5 | i80) & (~(iJ5 & i80));
                                        int[] iArr6 = iArr4[i77];
                                        iArr6[2] = i81;
                                        int i82 = (iJ6 | i81) & (~(iJ6 & i81));
                                        iArr6[3] = i82;
                                        int i83 = iJ3 & i82;
                                        int i84 = ((iJ3 ^ i82) | i83) & (~i83);
                                        int i85 = i77 & 1;
                                        int[] iArr7 = iArr4[(i85 - (~(-(-((i77 ^ 1) | i85))))) - i6];
                                        iArr7[0] = i84;
                                        int i86 = b;
                                        int i87 = i86 & 75;
                                        int i88 = (~i87) & (i86 | 75);
                                        int i89 = i87 << 1;
                                        int i90 = (i88 ^ i89) + ((i88 & i89) << 1);
                                        int i91 = i90 % 128;
                                        a = i91;
                                        int i92 = i90 % 2;
                                        int i93 = ((~i84) & iJ7) | ((~iJ7) & i84);
                                        iArr7[1] = i93;
                                        int i94 = iJ4 ^ i93;
                                        int i95 = i91 ^ 101;
                                        int i96 = -(-((i91 & 101) << 1));
                                        int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                                        b = i97 % 128;
                                        if (i97 % 2 == 0) {
                                            iArr7[2] = i94;
                                            int i98 = iJ8 ^ i94;
                                            int i99 = iJ8 & i94;
                                            i4 = (i99 & i98) | (i98 ^ i99);
                                            iArr7[5] = i4;
                                            iD2 = ivas.gov.bisp.enumeration.dh.j.d(ivas.gov.bisp.enumeration.dh.j.c(i4, 35));
                                            i76 = i78 % 1;
                                        } else {
                                            iArr7[2] = i94;
                                            i4 = ((~iJ8) & i94) | ((~i94) & iJ8);
                                            iArr7[3] = i4;
                                            iD2 = ivas.gov.bisp.enumeration.dh.j.d(ivas.gov.bisp.enumeration.dh.j.c(i4, 8));
                                            i76 <<= 2;
                                        }
                                        int i100 = (~i78) & iD2;
                                        int i101 = (~iD2) & i78;
                                        int i102 = (i101 & i100) | (i100 ^ i101);
                                        int i103 = (~i102) & i81;
                                        int i104 = (~i81) & i102;
                                        iJ5 = (i104 & i103) | (i103 ^ i104);
                                        int i105 = i77 & 2;
                                        int[] iArr8 = iArr4[((~i105) & (i77 | 2)) + (i105 << 1)];
                                        iArr8[0] = iJ5;
                                        int i106 = b;
                                        int i107 = (i106 & (-84)) | ((~i106) & 83);
                                        int i108 = (i106 & 83) << 1;
                                        int i109 = (i107 ^ i108) + ((i107 & i108) << 1);
                                        a = i109 % 128;
                                        if (i109 % 2 != 0) {
                                            iJ6 = i82 & iJ5;
                                            iArr8[0] = iJ6;
                                            iJ3 = (i84 & iJ6) | (i84 ^ iJ6);
                                            iArr8[3] = iJ3;
                                        } else {
                                            iJ6 = (i82 | iJ5) & (~(i82 & iJ5));
                                            iArr8[1] = iJ6;
                                            int i110 = i84 & iJ6;
                                            iJ3 = ((i84 ^ iJ6) | i110) & (~i110);
                                            iArr8[2] = iJ3;
                                        }
                                        int i111 = (i93 | iJ3) & (~(i93 & iJ3));
                                        iArr8[3] = i111;
                                        int i112 = i77 ^ 56;
                                        int i113 = -(-((i77 & 56) << 1));
                                        int i114 = (((i112 | i113) << 1) - (i112 ^ i113)) - 52;
                                        i77 = (i114 << 1) + (i114 ^ (-1));
                                        if (i77 >= 13) {
                                            break;
                                        }
                                        int i115 = (((i106 | 66) << 1) - (i106 ^ 66)) - 1;
                                        a = i115 % 128;
                                        int i116 = i115 % 2;
                                        iJ4 = (i94 | i111) & (~(i94 & i111));
                                        int i117 = i4 & iJ4;
                                        iJ8 = ((i4 ^ iJ4) | i117) & (~i117);
                                        int i118 = ((i106 ^ 10) + ((i106 & 10) << 1)) - 1;
                                        a = i118 % 128;
                                        int i119 = i118 % 2;
                                        iJ7 = i111;
                                        i6 = 1;
                                    }
                                    z2 = true;
                                } else {
                                    if (i51 != 8) {
                                        throw new IllegalStateException("Should never get here");
                                    }
                                    int iJ9 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 0);
                                    iArr4[0][0] = iJ9;
                                    int i120 = b;
                                    int i121 = i120 ^ 107;
                                    int i122 = -(-((i120 & 107) << 1));
                                    int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                                    a = i123 % 128;
                                    int i124 = i123 % 2;
                                    int iJ10 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 4);
                                    iArr4[0][1] = iJ10;
                                    int iJ11 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 8);
                                    iArr4[0][2] = iJ11;
                                    int iJ12 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 12);
                                    iArr4[0][3] = iJ12;
                                    int iJ13 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 16);
                                    iArr4[1][0] = iJ13;
                                    int iJ14 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 20);
                                    iArr4[1][1] = iJ14;
                                    int iJ15 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 24);
                                    iArr4[1][2] = iJ15;
                                    int iJ16 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 28);
                                    int[] iArr9 = iArr4[1];
                                    int i125 = b;
                                    int i126 = i125 ^ 79;
                                    int i127 = ((i126 | (i125 & 79)) << 1) - i126;
                                    a = i127 % 128;
                                    int i128 = i127 % 2;
                                    iArr9[3] = iJ16;
                                    int i129 = 2;
                                    int i130 = 1;
                                    int i131 = iJ13;
                                    while (true) {
                                        int iD4 = ivas.gov.bisp.enumeration.dh.j.d(ivas.gov.bisp.enumeration.dh.j.c(iJ16, i20));
                                        int i132 = i130 << 1;
                                        int i133 = iD4 & i130;
                                        int i134 = (~i133) & (i133 | (iD4 ^ i130));
                                        iJ9 = (iJ9 | i134) & (~(iJ9 & i134));
                                        int i135 = b;
                                        int i136 = i135 & 59;
                                        int i137 = (((i135 ^ 59) | i136) << 1) - ((i135 | 59) & (~i136));
                                        a = i137 % 128;
                                        int i138 = i137 % 2;
                                        int[] iArr10 = iArr4[i129];
                                        iArr10[0] = iJ9;
                                        int i139 = iJ10 & iJ9;
                                        iJ10 = ((iJ10 ^ iJ9) | i139) & (~i139);
                                        iArr10[1] = iJ10;
                                        int i140 = iJ11 & iJ10;
                                        iJ11 = (~i140) & (i140 | (iJ11 ^ iJ10));
                                        iArr10[2] = iJ11;
                                        int i141 = (~iJ11) & iJ12;
                                        int i142 = (~iJ12) & iJ11;
                                        iJ12 = (i141 ^ i142) | (i141 & i142);
                                        iArr10[3] = iJ12;
                                        int i143 = (i129 ^ 1) + ((i129 & 1) << 1);
                                        if (i143 >= 15) {
                                            break;
                                        }
                                        int iD5 = ivas.gov.bisp.enumeration.dh.j.d(iJ12);
                                        int i144 = (~iD5) & i131;
                                        int i145 = (~i131) & iD5;
                                        i131 = (i145 & i144) | (i144 ^ i145);
                                        int[] iArr11 = iArr4[i143];
                                        iArr11[0] = i131;
                                        int i146 = (~i131) & iJ14;
                                        int i147 = (~iJ14) & i131;
                                        iJ14 = (i146 ^ i147) | (i146 & i147);
                                        iArr11[1] = iJ14;
                                        int i148 = (~iJ14) & iJ15;
                                        int i149 = (~iJ15) & iJ14;
                                        iJ15 = (i149 & i148) | (i148 ^ i149);
                                        iArr11[2] = iJ15;
                                        int i150 = iJ16 & iJ15;
                                        iJ16 = ((iJ16 ^ iJ15) | i150) & (~i150);
                                        iArr11[3] = iJ16;
                                        int i151 = i143 & 1;
                                        i129 = i151 + ((i143 ^ 1) | i151);
                                        i130 = i132;
                                        i20 = 8;
                                    }
                                    z2 = true;
                                }
                            } else {
                                int iJ17 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 0);
                                int[] iArr12 = iArr4[0];
                                int i152 = b;
                                int i153 = (i152 ^ 87) + ((i152 & 87) << 1);
                                a = i153 % 128;
                                if (i153 % 2 != 0) {
                                    c = 0;
                                    iArr12[0] = iJ17;
                                    iJ = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 5);
                                } else {
                                    c = 0;
                                    iArr12[0] = iJ17;
                                    iJ = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 4);
                                }
                                iArr4[c][1] = iJ;
                                int iJ18 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 8);
                                int i154 = a;
                                int i155 = (((i154 ^ 81) | (i154 & 81)) << 1) - ((i154 & (-82)) | ((~i154) & 81));
                                b = i155 % 128;
                                if (i155 % 2 == 0) {
                                    c2 = 0;
                                    iArr4[0][2] = iJ18;
                                    iJ2 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 111);
                                } else {
                                    c2 = 0;
                                    iArr4[0][2] = iJ18;
                                    iJ2 = ivas.gov.bisp.enumeration.p096p.h.j(bArr4, 12);
                                }
                                iArr4[c2][3] = iJ2;
                                int i156 = b + 79;
                                a = i156 % 128;
                                int i157 = i156 % 2;
                                int i158 = 1;
                                while (i158 <= 10) {
                                    int i159 = a;
                                    int i160 = (i159 & (-8)) | ((~i159) & 7);
                                    int i161 = -(-((i159 & 7) << 1));
                                    int i162 = (i160 ^ i161) + ((i161 & i160) << 1);
                                    b = i162 % 128;
                                    if (i162 % 2 == 0) {
                                        iD = ivas.gov.bisp.enumeration.dh.j.d(ivas.gov.bisp.enumeration.dh.j.c(iJ2, 58));
                                        iArr = ivas.gov.bisp.enumeration.dh.j.e;
                                    } else {
                                        iD = ivas.gov.bisp.enumeration.dh.j.d(ivas.gov.bisp.enumeration.dh.j.c(iJ2, 8));
                                        iArr = ivas.gov.bisp.enumeration.dh.j.e;
                                    }
                                    int i163 = iArr[(((i158 ^ (-1)) | i158) << 1) - (~i158)];
                                    int i164 = ((~iD) & i163) | ((~i163) & iD);
                                    iJ17 = (iJ17 | i164) & (~(iJ17 & i164));
                                    int[] iArr13 = iArr4[i158];
                                    iArr13[0] = iJ17;
                                    iJ = ((~iJ) & iJ17) | ((~iJ17) & iJ);
                                    iArr13[1] = iJ;
                                    int i165 = (~iJ) & iJ18;
                                    int i166 = (~iJ18) & iJ;
                                    iJ18 = (i166 & i165) | (i165 ^ i166);
                                    iArr13[2] = iJ18;
                                    int i167 = (~iJ18) & iJ2;
                                    int i168 = (~iJ2) & iJ18;
                                    iJ2 = (i168 & i167) | (i167 ^ i168);
                                    iArr13[3] = iJ2;
                                    int i169 = (i158 & (-2)) | ((~i158) & 1);
                                    int i170 = (i158 & 1) << 1;
                                    i158 = ((i170 & i169) << 1) + (i169 ^ i170);
                                }
                                z2 = true;
                            }
                            jVar2.i = iArr4;
                            jVar2.n = z2;
                            byte[] bArr5 = new byte[16];
                            this.l = bArr5;
                            ((ivas.gov.bisp.enumeration.dh.j) this.d).e(bArr5, 0, bArr5, 0);
                            C0321u c0321u = this.e;
                            int i171 = b;
                            int i172 = i171 & 17;
                            int i173 = ((i171 | 17) & (~i172)) + (i172 << 1);
                            a = i173 % 128;
                            int i174 = i173 % 2;
                            byte[] bArr6 = this.l;
                            if (((long[][]) c0321u.d) == null) {
                                int i175 = a;
                                int i176 = i175 & 55;
                                int i177 = ((i175 ^ 55) | i176) << 1;
                                int i178 = -((i175 | 55) & (~i176));
                                int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
                                b = i179 % 128;
                                int i180 = i179 % 2;
                                c0321u.d = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
                                int i181 = b;
                                int i182 = i181 & 81;
                                int i183 = (i181 | 81) & (~i182);
                                int i184 = -(-(i182 << 1));
                                int i185 = ((i183 | i184) << 1) - (i183 ^ i184);
                                a = i185 % 128;
                                int i186 = i185 % 2;
                            } else {
                                if (!Arrays.equals((byte[]) c0321u.c, bArr6)) {
                                }
                                this.f = null;
                            }
                            byte[] bArrC2 = ivas.gov.bisp.enumeration.p064cj.j.c(bArr6);
                            c0321u.c = bArrC2;
                            Object obj2 = c0321u.d;
                            int i187 = a;
                            int i188 = i187 & 73;
                            int i189 = (i187 ^ 73) | i188;
                            int i190 = i188 ^ i189;
                            int i191 = i189 & i188;
                            int i192 = 1;
                            int i193 = i190 + (i191 << 1);
                            b = i193 % 128;
                            int i194 = i193 % 2;
                            long[] jArr = ((long[][]) obj2)[1];
                            int i195 = 0;
                            int i196 = 0;
                            while (i195 < jArr.length) {
                                int i197 = b + 92;
                                int i198 = (i197 ^ (-1)) + (i197 << i192);
                                a = i198 % 128;
                                if (i198 % 2 != 0) {
                                    jArr[i195] = ivas.gov.bisp.enumeration.p096p.h.f(bArrC2, i196);
                                    int i199 = i196 + 124;
                                    int i200 = (i199 ^ (-1)) + (i199 << 1);
                                    int i201 = (i200 | (-79)) << 1;
                                    int i202 = -(((~i200) & (-79)) | (i200 & 78));
                                    i196 = ((i201 | i202) << 1) - (i202 ^ i201);
                                } else {
                                    jArr[i195] = ivas.gov.bisp.enumeration.p096p.h.f(bArrC2, i196);
                                    i196 += 8;
                                }
                                int i203 = i195 & 1;
                                int i204 = -(-((i195 ^ 1) | i203));
                                i195 = (i204 | i203) + (i203 & i204);
                                i192 = 1;
                            }
                            long[] jArr2 = ((long[][]) c0321u.d)[1];
                            int i205 = a;
                            int i206 = ((i205 & (-26)) | ((~i205) & 25)) + ((i205 & 25) << 1);
                            b = i206 % 128;
                            int i207 = i206 % 2;
                            long j4 = jArr2[0];
                            long j5 = jArr2[1];
                            int i208 = i205 + 61;
                            b = i208 % 128;
                            int i209 = i208 % 2;
                            long j6 = j5 << 57;
                            jArr2[0] = ((j6 >>> 2) ^ (((j4 >>> 7) ^ j6) ^ (j6 >>> 1))) ^ (j6 >>> 7);
                            jArr2[1] = (j4 << 57) | (j5 >>> 7);
                            int i210 = 2;
                            while (i210 < 256) {
                                int i211 = b + 9;
                                a = i211 % 128;
                                int i212 = i211 % 2;
                                long[][] jArr3 = (long[][]) c0321u.d;
                                long[] jArr4 = jArr3[i210 >> 1];
                                int i213 = a;
                                int i214 = ((((i213 ^ 101) | (i213 & 101)) << 1) - (~(-((i213 & (-102)) | ((~i213) & 101))))) - 1;
                                b = i214 % 128;
                                int i215 = i214 % 2;
                                long[] jArr5 = jArr3[i210];
                                long j7 = jArr4[0];
                                long j8 = jArr4[1];
                                int i216 = (-2) - ((i213 + 6) ^ (-1));
                                int i217 = i216 % 128;
                                b = i217;
                                if (i216 % 2 == 0) {
                                    j2 = j7 << 74;
                                    c3 = '?';
                                } else {
                                    c3 = '?';
                                    j2 = j7 >> 63;
                                }
                                long j9 = ((j7 ^ ((-2233785415175766016L) & j2)) << 1) | (j8 >>> c3);
                                jArr5[0] = j9;
                                long j10 = (-j2) | (j8 << 1);
                                jArr5[1] = j10;
                                long[] jArr6 = jArr3[1];
                                int i218 = ((i217 ^ 13) - (~(-(-((i217 & 13) << 1))))) - 1;
                                a = i218 % 128;
                                int i219 = i218 % 2;
                                int i220 = i210 ^ 1;
                                int i221 = ((i210 & 1) | i220) << 1;
                                int i222 = -i220;
                                long[] jArr7 = jArr3[((i221 | i222) << 1) - (i222 ^ i221)];
                                int i223 = i217 & 7;
                                int i224 = ((((i217 ^ 7) | i223) << 1) - (~(-((i217 | 7) & (~i223))))) - 1;
                                a = i224 % 128;
                                if (i224 % 2 != 0) {
                                    jArr7[0] = j9 * jArr6[0];
                                    j10 = jArr5[0];
                                    j3 = jArr6[0];
                                    c4 = 0;
                                    i3 = 1;
                                } else {
                                    jArr7[0] = jArr6[0] ^ j9;
                                    i3 = 1;
                                    j3 = jArr6[1];
                                    c4 = 1;
                                }
                                jArr7[c4] = j10 ^ j3;
                                int i225 = ((i210 | (-116)) << i3) - (i210 ^ (-116));
                                i210 = ((i225 | 118) << i3) - (i225 ^ 118);
                            }
                            this.f = null;
                        }
                    }
                    throw new IllegalArgumentException("Key length not 128/192/256 bits.");
                }
                if (this.l == null) {
                    throw new IllegalArgumentException("Key must be specified in initial init");
                }
                byte[] bArr7 = new byte[16];
                this.m = bArr7;
                byte[] bArr8 = this.k;
                int i226 = a;
                int i227 = i226 + 107;
                int i228 = i227 % 128;
                b = i228;
                int i229 = i227 % 2;
                if (bArr8.length == 12) {
                    int i230 = i228 & 89;
                    int i231 = (~i230) & (i228 | 89);
                    int i232 = -(-(i230 << 1));
                    int i233 = (i231 & i232) + (i232 | i231);
                    a = i233 % 128;
                    if (i233 % 2 != 0) {
                        b2 = 1;
                        System.arraycopy(bArr8, 1, bArr7, 0, bArr8.length);
                    } else {
                        b2 = 1;
                        System.arraycopy(bArr8, 0, bArr7, 0, bArr8.length);
                    }
                    this.m[15] = b2;
                } else {
                    int length2 = bArr8.length;
                    int i234 = i226 + 44;
                    int i235 = (i234 ^ (-1)) + (i234 << 1);
                    b = i235 % 128;
                    int i236 = i235 % 2;
                    int i237 = 0;
                    while (i237 < length2) {
                        int i238 = a;
                        int i239 = (i238 | 23) << 1;
                        int i240 = -(i238 ^ 23);
                        int i241 = ((i239 | i240) << 1) - (i240 ^ i239);
                        b = i241 % 128;
                        if (i241 % 2 == 0) {
                            iMin = Math.min(length2 * i237, 36);
                        } else {
                            int i242 = -i237;
                            iMin = Math.min((((length2 ^ i242) | (length2 & i242)) << 1) - ((i242 & (~length2)) | ((~i242) & length2)), 16);
                        }
                        g(bArr7, bArr8, i237, iMin);
                        int i243 = i237 & 14;
                        int i244 = (i237 ^ 14) | i243;
                        int i245 = (i243 ^ i244) + ((i244 & i243) << 1);
                        int i246 = i245 & 2;
                        int i247 = (i245 | 2) & (~i246);
                        int i248 = -(-(i246 << 1));
                        i237 = (i248 | i247) + (i247 & i248);
                        int i249 = b;
                        int i250 = i249 & 35;
                        int i251 = ((i249 ^ 35) | i250) << 1;
                        int i252 = -((i249 | 35) & (~i250));
                        int i253 = (i251 & i252) + (i252 | i251);
                        a = i253 % 128;
                        int i254 = i253 % 2;
                    }
                    byte[] bArr9 = new byte[16];
                    long length3 = this.k.length;
                    int i255 = (-2) - ((a + 78) ^ (-1));
                    b = i255 % 128;
                    if (i255 % 2 == 0) {
                        ivas.gov.bisp.enumeration.p096p.h.l(length3 | 8, bArr9, 13);
                        bArr = this.m;
                    } else {
                        ivas.gov.bisp.enumeration.p096p.h.l(length3 * 8, bArr9, 8);
                        bArr = this.m;
                    }
                    ivas.gov.bisp.enumeration.p096p.h.p(bArr, bArr9);
                    this.e.n(bArr);
                }
                this.f89o = new byte[16];
                int i256 = b + 109;
                int i257 = i256 % 128;
                a = i257;
                int i258 = i256 % 2;
                this.q = new byte[16];
                this.r = new byte[16];
                byte[] bArr10 = new byte[16];
                int i259 = i257 + 62;
                int i260 = (i259 ^ (-1)) + (i259 << 1);
                b = i260 % 128;
                if (i260 % 2 == 0) {
                    this.w = bArr10;
                    this.y = 1;
                    this.z = 1L;
                    j = 1;
                    i2 = 0;
                } else {
                    this.w = bArr10;
                    i2 = 0;
                    this.y = 0;
                    this.z = 0L;
                    j = 0;
                }
                this.v = j;
                this.t = ivas.gov.bisp.enumeration.p064cj.j.c(this.m);
                this.s = -2;
                this.u = i2;
                this.x = 0L;
                int i261 = a;
                int i262 = (((i261 ^ 15) | (i261 & 15)) << 1) - ((i261 & (-16)) | ((~i261) & 15));
                b = i262 % 128;
                int i263 = i262 % 2;
                byte[] bArr11 = this.c;
                if (bArr11 != null) {
                    int i264 = ((i261 | 97) << 1) - (((~i261) & 97) | (i261 & (-98)));
                    b = i264 % 128;
                    if (i264 % 2 == 0) {
                        c(bArr11, 0, bArr11.length);
                    } else {
                        c(bArr11, 0, bArr11.length);
                    }
                }
                int i265 = a;
                int i266 = i265 & 49;
                int i267 = (i265 ^ 49) | i266;
                int i268 = (i266 ^ i267) + ((i267 & i266) << 1);
                b = i268 % 128;
                int i269 = i268 % 2;
                return;
            }
        }
        throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("Invalid value for MAC size: ", i15));
    }
}
