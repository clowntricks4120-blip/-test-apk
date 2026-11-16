package ivas.gov.bisp.enumeration.aC;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class D implements ivas.gov.bisp.enumeration.aD.R.bcK {
    private static int a = 0;
    private static int b = 1;
    public static final /* synthetic */ D[] c;
    public static final D d;
    public static final D e;
    public static final D f;
    public static final D g;
    public static final D h;
    public static final D i;
    public final int j;

    static {
        D[] dArr;
        D d2 = new D("UNKNOWN_PREFIX", 0, 0);
        d = d2;
        D d3 = new D("TINK", 1, 1);
        e = d3;
        D d4 = new D("LEGACY", 2, 2);
        g = d4;
        D d5 = new D("RAW", 3, 3);
        f = d5;
        D d6 = new D("CRUNCHY", 4, 4);
        h = d6;
        D d7 = new D("UNRECOGNIZED", 5, -1);
        int i2 = b;
        int i3 = ((i2 & (-118)) | ((~i2) & 117)) + ((i2 & 117) << 1);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            i = d7;
            dArr = new D[74];
            dArr[0] = d2;
        } else {
            i = d7;
            dArr = new D[6];
            dArr[0] = d2;
        }
        dArr[1] = d3;
        dArr[2] = d4;
        dArr[3] = d5;
        int i5 = (i4 & (-12)) | ((~i4) & 11);
        int i6 = (i4 & 11) << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            dArr[4] = d6;
            dArr[2] = d7;
        } else {
            dArr[4] = d6;
            dArr[5] = d7;
        }
        c = dArr;
    }

    public D(String str, int i2, int i3) {
        super(str, i2);
        this.j = i3;
    }

    public static D valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 57) | (i3 & 57)) << 1;
        int i5 = -(((~i3) & 57) | (i3 & (-58)));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        D d2 = (D) Enum.valueOf(D.class, str);
        int i8 = a + 29;
        b = i8 % 128;
        int i9 = i8 % 2;
        return d2;
    }

    public static D[] values() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 73;
        int i5 = (((i3 ^ 73) | i4) << 1) - ((i3 | 73) & (~i4));
        b = i5 % 128;
        int i6 = i5 % 2;
        D[] dArr = (D[]) c.clone();
        int i7 = a;
        int i8 = ((i7 | 47) << 1) - (i7 ^ 47);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 66 / 0;
        }
        return dArr;
    }

    public static D d(int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 + 41;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (i2 == 0) {
            D d2 = d;
            int i8 = i6 + 49;
            a = i8 % 128;
            int i9 = i8 % 2;
            return d2;
        }
        int i10 = (i4 ^ 53) + ((i4 & 53) << 1);
        int i11 = i10 % 128;
        b = i11;
        if (i10 % 2 != 0 ? i2 == 1 : i2 == 0) {
            D d3 = e;
            int i12 = i4 & 107;
            int i13 = (((i4 | 107) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 35 / 0;
            }
            return d3;
        }
        if (i2 == 2) {
            D d4 = g;
            int i15 = ((i11 ^ 14) + ((i11 & 14) << 1)) - 1;
            a = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 27 / 0;
            }
            return d4;
        }
        int i17 = ((i4 | 72) << 1) - (i4 ^ 72);
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        Object obj = null;
        if (i2 == 3) {
            D d5 = f;
            int i20 = (i4 ^ 30) + ((i4 & 30) << 1);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                return d5;
            }
            obj.hashCode();
            throw null;
        }
        int i22 = i4 & 63;
        int i23 = i22 + ((i4 ^ 63) | i22);
        b = i23 % 128;
        int i24 = i23 % 2;
        if (i2 != 4) {
            int i25 = (i4 ^ 91) + ((i4 & 91) << 1);
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            int i28 = ((i26 & 17) - (~(i26 | 17))) - 1;
            a = i28 % 128;
            int i29 = i28 % 2;
            return null;
        }
        D d6 = h;
        int i30 = i4 & 69;
        int i31 = (((i4 | 69) & (~i30)) - (~(-(-(i30 << 1))))) - 1;
        b = i31 % 128;
        if (i31 % 2 != 0) {
            return d6;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r4 != ivas.gov.bisp.enumeration.aC.D.i) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r4 != ivas.gov.bisp.enumeration.aC.D.i) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r2 = (r1 ^ 3) + ((r1 & 3) << 1);
        r1 = r2 % 128;
        ivas.gov.bisp.enumeration.aC.D.a = r1;
        r2 = r2 % 2;
        r2 = r4.j;
        r3 = (r1 & 33) + (r1 | 33);
        ivas.gov.bisp.enumeration.aC.D.b = r3 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.aD.R.bcK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aC.D.a
            r2 = r1 | 45
            int r2 = r2 << 1
            r1 = r1 ^ 45
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.aC.D.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L1c
            ivas.gov.bisp.enumeration.aC.D r2 = ivas.gov.bisp.enumeration.aC.D.i
            r3 = 31
            int r3 = r3 / 0
            if (r4 == r2) goto L3d
            goto L20
        L1c:
            ivas.gov.bisp.enumeration.aC.D r2 = ivas.gov.bisp.enumeration.aC.D.i
            if (r4 == r2) goto L3d
        L20:
            r2 = r1 ^ 3
            r1 = r1 & 3
            int r1 = r1 << 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.aC.D.a = r1
            int r2 = r2 % r0
            int r2 = r4.j
            r3 = r1 & 33
            r1 = r1 | 33
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.aC.D.b = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L3b
            return r2
        L3b:
            r0 = 0
            throw r0
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aC.D.c():int");
    }
}
