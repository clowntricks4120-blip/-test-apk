package ivas.gov.bisp.enumeration.p063ci;

import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0270p {
    private static int a = 1;
    private static int b;
    public static final i[] c = new i[0];
    public i[] d;
    public int e;
    public boolean f;

    static {
        int i = (-1) - (~(-(-67)));
        a = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    public C0270p(int i) {
        i[] iVarArr;
        int i2;
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        if (i != 0) {
            iVarArr = new i[i];
            int i3 = b;
            int i4 = i3 ^ 9;
            int i5 = -(-((i3 & 9) << 1));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 5;
            }
            this.d = iVarArr;
            this.e = 0;
            this.f = false;
            i2 = a + 117;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = a;
        int i9 = i8 & 65;
        int i10 = (i8 ^ 65) | i9;
        int i11 = (i9 & i10) + (i9 | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        iVarArr = c;
        int i13 = i8 & 37;
        int i14 = (i13 - (~((i8 ^ 37) | i13))) - 1;
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 2 % 2;
        this.d = iVarArr;
        this.e = 0;
        this.f = false;
        i2 = a + 117;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append(r5);
        r5 = (-2) - ((ivas.gov.bisp.enumeration.p063ci.C0270p.a + 50) ^ (-1));
        ivas.gov.bisp.enumeration.p063ci.C0270p.b = r5 % 128;
        r5 = r5 % 2;
        r1.append(" >= ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r5 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1.append(r4.e);
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r1.append(r4.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        throw new java.lang.ArrayIndexOutOfBoundsException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r5 < r4.e) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r5 < r4.e) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r5 = r4.d[r5];
        r1 = r1 + 7;
        ivas.gov.bisp.enumeration.p063ci.C0270p.a = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.p063ci.i d(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p063ci.C0270p.a
            r2 = r1 | 21
            int r2 = r2 << 1
            r1 = r1 ^ 21
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p063ci.C0270p.b = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L1c
            int r2 = r4.e
            r3 = 55
            int r3 = r3 / 0
            if (r5 >= r2) goto L2c
            goto L20
        L1c:
            int r2 = r4.e
            if (r5 >= r2) goto L2c
        L20:
            ivas.gov.bisp.enumeration.ci.i[] r2 = r4.d
            r5 = r2[r5]
            int r1 = r1 + 7
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p063ci.C0270p.a = r2
            int r1 = r1 % r0
            return r5
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            int r5 = ivas.gov.bisp.enumeration.p063ci.C0270p.a
            int r5 = r5 + 50
            r5 = r5 ^ (-1)
            int r5 = (-2) - r5
            int r2 = r5 % 128
            ivas.gov.bisp.enumeration.p063ci.C0270p.b = r2
            int r5 = r5 % r0
            java.lang.String r0 = " >= "
            r1.append(r0)
            if (r5 == 0) goto L52
            int r5 = r4.e
            r1.append(r5)
            r5 = 0
            r5.hashCode()
            throw r5
        L52:
            int r5 = r4.e
            r1.append(r5)
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0270p.d(int):ivas.gov.bisp.enumeration.ci.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r1 = r7.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r1.length != r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r2 = r2 + 65;
        ivas.gov.bisp.enumeration.p063ci.C0270p.b = r2 % 128;
        r2 = r2 % 2;
        r7.f = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.i[r3];
        java.lang.System.arraycopy(r1, 0, r2, 0, r3);
        r1 = ivas.gov.bisp.enumeration.p063ci.C0270p.b;
        r3 = r1 & 9;
        r1 = -(-((r1 ^ 9) | r3));
        r6 = ((r3 | r1) << 1) - (r1 ^ r3);
        r1 = r6 % 128;
        ivas.gov.bisp.enumeration.p063ci.C0270p.a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if ((r6 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        r3 = r1 ^ 45;
        r1 = (r1 & 45) << 1;
        r4 = (r3 & r1) + (r1 | r3);
        ivas.gov.bisp.enumeration.p063ci.C0270p.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if ((r4 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        r0 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r3 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r3 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p063ci.C0270p.c;
        r1 = (-2) - (((r1 & 92) + (r1 | 92)) ^ (-1));
        ivas.gov.bisp.enumeration.p063ci.C0270p.a = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.p063ci.i[] e() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p063ci.C0270p.b
            r2 = r1 ^ 124(0x7c, float:1.74E-43)
            r3 = r1 & 124(0x7c, float:1.74E-43)
            r4 = 1
            int r3 = r3 << r4
            int r2 = r2 + r3
            r3 = r2 ^ (-1)
            int r2 = r2 << r4
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p063ci.C0270p.a = r2
            int r3 = r3 % r0
            r5 = 0
            if (r3 != 0) goto L1f
            int r3 = r7.e
            r6 = 6
            int r6 = r6 / r5
            if (r3 != 0) goto L34
            goto L23
        L1f:
            int r3 = r7.e
            if (r3 != 0) goto L34
        L23:
            ivas.gov.bisp.enumeration.ci.i[] r2 = ivas.gov.bisp.enumeration.p063ci.C0270p.c
            r3 = r1 & 92
            r1 = r1 | 92
            int r3 = r3 + r1
            r1 = r3 ^ (-1)
            int r1 = (-2) - r1
            int r3 = r1 % 128
            ivas.gov.bisp.enumeration.p063ci.C0270p.a = r3
            int r1 = r1 % r0
            return r2
        L34:
            ivas.gov.bisp.enumeration.ci.i[] r1 = r7.d
            int r6 = r1.length
            if (r6 != r3) goto L43
            int r2 = r2 + 65
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p063ci.C0270p.b = r3
            int r2 = r2 % r0
            r7.f = r4
            return r1
        L43:
            ivas.gov.bisp.enumeration.ci.i[] r2 = new ivas.gov.bisp.enumeration.p063ci.i[r3]
            java.lang.System.arraycopy(r1, r5, r2, r5, r3)
            int r1 = ivas.gov.bisp.enumeration.p063ci.C0270p.b
            r3 = r1 & 9
            r1 = r1 ^ 9
            r1 = r1 | r3
            int r1 = -r1
            int r1 = -r1
            r6 = r3 | r1
            int r6 = r6 << r4
            r1 = r1 ^ r3
            int r6 = r6 - r1
            int r1 = r6 % 128
            ivas.gov.bisp.enumeration.p063ci.C0270p.a = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L71
            r3 = r1 ^ 45
            r1 = r1 & 45
            int r1 = r1 << r4
            r4 = r3 & r1
            r1 = r1 | r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p063ci.C0270p.b = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L70
            r0 = 88
            int r0 = r0 / r5
        L70:
            return r2
        L71:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0270p.e():ivas.gov.bisp.enumeration.ci.i[]");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a A[PHI: r4
  0x004a: PHI (r4v2 int) = (r4v1 int), (r4v9 int) binds: [B:11:0x0048, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0044 A[PHI: r4
  0x0044: PHI (r4v4 int) = (r4v1 int), (r4v9 int) binds: [B:11:0x0048, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    public void c(i iVar) {
        int i;
        int i2;
        int length;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 | 7) << 1) - (i5 ^ 7);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            Objects.requireNonNull(iVar, "'element' cannot be null");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Objects.requireNonNull(iVar, "'element' cannot be null");
        i[] iVarArr = this.d;
        int length2 = iVarArr.length;
        int i7 = this.e;
        int i8 = b;
        int i9 = ((i8 | 64) << 1) - (i8 ^ 64);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = (i7 ^ 105) + ((i7 & 105) << 1);
            i = ((i11 & 30) | ((~i11) & (-31))) + ((i11 & (-31)) << 1);
            if (i <= length2) {
                int i12 = ((i8 | 31) << 1) - (i8 ^ 31);
                a = i12 % 128;
                int i13 = i12 % 2;
                i2 = 0;
            } else {
                i2 = 1;
            }
        } else {
            i = i7 + 1;
            if (i <= length2) {
                int i14 = ((i8 | 31) << 1) - (i8 ^ 31);
                a = i14 % 128;
                int i15 = i14 % 2;
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        boolean z = this.f;
        int i16 = (((~i2) & (z ? 1 : 0)) == true ? 1 : 0) | ((~(z ? 1 : 0)) & i2);
        int i17 = i2 & (z ? 1 : 0);
        if (((i17 & i16) | (i16 ^ i17)) != 0) {
            int i18 = a;
            int i19 = i18 & 49;
            int i20 = (i19 - (~((i18 ^ 49) | i19))) - 1;
            b = i20 % 128;
            if (i20 % 2 != 0) {
                length = iVarArr.length;
                i3 = i * i;
            } else {
                length = iVarArr.length;
                i3 = (i >> 1) + i;
            }
            i[] iVarArr2 = new i[Math.max(length, i3)];
            i[] iVarArr3 = this.d;
            int i21 = b + 113;
            a = i21 % 128;
            int i22 = i21 % 2;
            System.arraycopy(iVarArr3, 0, iVarArr2, 0, this.e);
            int i23 = b;
            int i24 = ((i23 ^ 32) + ((i23 & 32) << 1)) - 1;
            a = i24 % 128;
            if (i24 % 2 == 0) {
                this.d = iVarArr2;
                this.f = true;
            } else {
                this.d = iVarArr2;
                this.f = false;
            }
        }
        this.d[this.e] = iVar;
        this.e = i;
        int i25 = b;
        int i26 = i25 & 125;
        int i27 = (i25 ^ 125) | i26;
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        a = i28 % 128;
        int i29 = i28 % 2;
    }
}
