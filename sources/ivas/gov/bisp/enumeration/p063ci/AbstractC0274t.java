package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0274t extends O {
    private static int a = 0;
    private static int b = 1;
    public C0278x c;
    public C0258a d;
    public O e;
    public O f;
    public int g;

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[PHI: r3
  0x00cb: PHI (r3v7 ivas.gov.bisp.enumeration.ci.O) = (r3v6 ivas.gov.bisp.enumeration.ci.O), (r3v8 ivas.gov.bisp.enumeration.ci.O) binds: [B:41:0x00c9, B:38:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r6.k(r1) != true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r3.k(r1) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        if (r3.k(r1) != true) goto L44;
     */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(ivas.gov.bisp.enumeration.p063ci.O r9) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.h(ivas.gov.bisp.enumeration.ci.O):boolean");
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 37) + (i3 | 37);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        C0278x c0278x = this.c;
        int i7 = 0;
        if (c0278x != null) {
            int i8 = i3 & 97;
            int i9 = -(-((i3 ^ 97) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            int iHashCode = c0278x.hashCode();
            if (i11 != 0) {
                int i12 = 12 / 0;
            }
            i7 = iHashCode;
            int i13 = b;
            int i14 = i13 ^ 79;
            int i15 = -(-((i13 & 79) << 1));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
        } else {
            int i18 = ((i5 & (-122)) | ((~i5) & 121)) + ((i5 & 121) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        C0258a c0258a = this.d;
        if (c0258a != null) {
            int i20 = a;
            int i21 = ((((i20 ^ 9) | (i20 & 9)) << 1) - (~(-(((~i20) & 9) | (i20 & (-10)))))) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
            int iHashCode2 = c0258a.hashCode();
            i7 = ((~iHashCode2) & i7) | (iHashCode2 & (~i7));
            int i23 = a;
            int i24 = (-2) - (((i23 & 12) + (i23 | 12)) ^ (-1));
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        O o2 = this.e;
        if (o2 != null) {
            int i26 = b;
            int i27 = ((i26 & 74) + (i26 | 74)) - 1;
            a = i27 % 128;
            int i28 = i27 % 2;
            int iHashCode3 = o2.hashCode();
            if (i28 != 0) {
                int i29 = i7 & iHashCode3;
                i = ((iHashCode3 ^ i7) | i29) & (~i29);
            } else {
                int i30 = (~iHashCode3) & i7;
                int i31 = iHashCode3 & (~i7);
                i = (i31 & i30) | (i30 ^ i31);
            }
            i7 = i;
        }
        int iHashCode4 = this.f.hashCode();
        int i32 = (~iHashCode4) & i7;
        int i33 = iHashCode4 & (~i7);
        int i34 = (i33 & i32) | (i32 ^ i33);
        int i35 = b;
        int i36 = ((i35 & 122) + (i35 | 122)) - 1;
        a = i36 % 128;
        int i37 = i36 % 2;
        return i34;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 63;
        int i4 = (i2 & 63) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int length = getEncoded().length;
            throw null;
        }
        int length2 = getEncoded().length;
        int i6 = a;
        int i7 = i6 ^ 111;
        int i8 = -(-((i6 & 111) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return length2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 86) ^ (-1));
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = i3 & 9;
        int i6 = -(-((i3 ^ 9) | i5));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        an anVar = new an(this.c, this.d, this.e, this.g, this.f);
        int i2 = a;
        int i3 = i2 ^ 11;
        int i4 = ((((i2 & 11) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return anVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        aa aaVar = new aa(this.c, this.d, this.e, this.g, this.f);
        int i2 = b;
        int i3 = (i2 & 7) + (i2 | 7);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return aaVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        r7 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        throw new java.lang.IllegalArgumentException("too few objects in input vector");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r6.e > r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r6.e > r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.a;
        r2 = ((r1 | 19) << 1) - (((~r1) & 19) | (r1 & (-20)));
        ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.b = r2 % 128;
        r2 = r2 % 2;
        r6 = r6.d(r7).f();
        r7 = ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.b;
        r1 = (((r7 | 27) << 1) - (~(-(r7 ^ 27)))) - 1;
        ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.a = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.p063ci.O o(ivas.gov.bisp.enumeration.p063ci.C0270p r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.a
            r2 = r1 ^ 23
            r3 = r1 & 23
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-24)
            int r1 = ~r1
            r4 = 23
            r1 = r1 & r4
            r1 = r1 | r3
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L24
            int r1 = r6.e
            r2 = 47
            int r2 = r2 / 0
            if (r1 <= r7) goto L5b
            goto L28
        L24:
            int r1 = r6.e
            if (r1 <= r7) goto L5b
        L28:
            int r1 = ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.a
            r2 = r1 | 19
            int r2 = r2 << 1
            r3 = r1 & (-20)
            int r1 = ~r1
            r1 = r1 & 19
            r1 = r1 | r3
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.b = r1
            int r2 = r2 % r0
            ivas.gov.bisp.enumeration.ci.i r6 = r6.d(r7)
            ivas.gov.bisp.enumeration.ci.O r6 = r6.f()
            int r7 = ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.b
            r1 = r7 | 27
            int r1 = r1 << 1
            r7 = r7 ^ 27
            int r7 = -r7
            int r7 = ~r7
            int r1 = r1 - r7
            int r1 = r1 + (-1)
            int r7 = r1 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.a = r7
            int r1 = r1 % r0
            if (r1 == 0) goto L5a
            r7 = 15
            int r7 = r7 / 0
        L5a:
            return r6
        L5b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "too few objects in input vector"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.o(ivas.gov.bisp.enumeration.ci.p, int):ivas.gov.bisp.enumeration.ci.O");
    }

    public final void p(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 35;
        int i5 = (((i3 & 35) | i4) << 1) - i4;
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(j.o("invalid encoding value: ", i));
        }
        int i7 = (i6 & 99) + (i6 | 99);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.g = i;
        if (i8 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if ((r1 instanceof ivas.gov.bisp.enumeration.p063ci.AbstractC0276v) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        if ((r1 instanceof ivas.gov.bisp.enumeration.p063ci.AbstractC0276v) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        r0 = r11 & 105;
        r0 = r0 + ((r11 ^ 105) | r0);
        ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.b = r0 % 128;
        r1 = (ivas.gov.bisp.enumeration.p063ci.AbstractC0276v) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
    
        if ((r0 % 2) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        p(r1.c);
        r11 = ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.b;
        r0 = r11 & 57;
        r11 = (r11 | 57) & (~r0);
        r0 = r0 << 1;
        r2 = (r11 & r0) + (r11 | r0);
        ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.a = r2 % 128;
        r2 = r2 % 2;
        r10.f = r1.t();
        r11 = ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.b + 75;
        ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.a = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
    
        p(r1.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0123, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012b, code lost:
    
        throw new java.lang.IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC0274t(ivas.gov.bisp.enumeration.p063ci.C0270p r11) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.AbstractC0274t.<init>(ivas.gov.bisp.enumeration.ci.p):void");
    }

    public AbstractC0274t(C0278x c0278x, C0258a c0258a, O o2, int i, O o3) {
        this.c = c0278x;
        this.d = c0258a;
        this.e = o2;
        p(i);
        Objects.requireNonNull(o3);
        this.f = o3;
    }
}
