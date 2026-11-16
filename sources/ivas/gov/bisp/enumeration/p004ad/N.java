package ivas.gov.bisp.enumeration.p004ad;

import ivas.gov.bisp.enumeration.p003ac.t;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class N {
    private static int a = 0;
    private static int b = 1;
    public final C0087m d;
    public final aTW e;
    public N f;
    public t i;
    public HashSet<N> c = null;
    public int h = 0;
    public int g = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class aTW {
        private static int a = 1;
        private static int b;
        public static final aTW c;
        public static final aTW d;
        public static final aTW e;
        public static final aTW f;
        public static final aTW g;
        public static final aTW h;
        public static final aTW i;
        public static final aTW j;
        public static final /* synthetic */ aTW[] k;

        static {
            char c2;
            aTW atw = new aTW("NONE", 0);
            aTW atw2 = new aTW("LEFT", 1);
            d = atw2;
            aTW atw3 = new aTW("TOP", 2);
            e = atw3;
            aTW atw4 = new aTW("RIGHT", 3);
            f = atw4;
            aTW atw5 = new aTW("BOTTOM", 4);
            h = atw5;
            aTW atw6 = new aTW("BASELINE", 5);
            g = atw6;
            aTW atw7 = new aTW("CENTER", 6);
            i = atw7;
            aTW atw8 = new aTW("CENTER_X", 7);
            j = atw8;
            aTW atw9 = new aTW("CENTER_Y", 8);
            c = atw9;
            aTW[] atwArr = new aTW[9];
            int i2 = a;
            int i3 = i2 & 75;
            int i4 = -(-((i2 ^ 75) | i3));
            int i5 = (i3 & i4) + (i3 | i4);
            b = i5 % 128;
            int i6 = i5 % 2;
            atwArr[0] = atw;
            atwArr[1] = atw2;
            atwArr[2] = atw3;
            atwArr[3] = atw4;
            int i7 = i2 + 47;
            int i8 = i7 % 128;
            b = i8;
            if (i7 % 2 != 0) {
                atwArr[4] = atw5;
                atwArr[5] = atw6;
                atwArr[45] = atw7;
                atwArr[72] = atw8;
                c2 = 2;
            } else {
                atwArr[4] = atw5;
                atwArr[5] = atw6;
                atwArr[6] = atw7;
                atwArr[7] = atw8;
                c2 = '\b';
            }
            atwArr[c2] = atw9;
            k = atwArr;
            int i9 = i8 + 51;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        }

        public aTW(String str, int i2) {
            super(str, i2);
        }

        public static aTW valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 ^ 101;
            int i5 = -(-((i3 & 101) << 1));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            aTW atw = (aTW) Enum.valueOf(aTW.class, str);
            if (i7 != 0) {
                int i8 = 43 / 0;
            }
            return atw;
        }

        public static aTW[] values() {
            aTW[] atwArr;
            int i2 = 2 % 2;
            int i3 = a + 13;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                atwArr = (aTW[]) k.clone();
                int i4 = 81 / 0;
            } else {
                atwArr = (aTW[]) k.clone();
            }
            int i5 = b;
            int i6 = i5 & 109;
            int i7 = (i5 ^ 109) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            return atwArr;
        }
    }

    public N(C0087m c0087m, aTW atw) {
        this.d = c0087m;
        this.e = atw;
    }

    public boolean f() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 17) << 1) - (i2 ^ 17);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.f != null) {
            int i4 = (((i2 | 8) << 1) - (i2 ^ 8)) - 1;
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 125;
            b = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = ((i2 & (-78)) | ((~i2) & 77)) + ((i2 & 77) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        int i11 = b;
        int i12 = i11 & 105;
        int i13 = ((i11 ^ 105) | i12) << 1;
        int i14 = -((i11 | 105) & (~i12));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public void g() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 61;
        int i4 = (i2 | 61) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        t tVar = this.i;
        if (tVar != null) {
            tVar.e();
            int i8 = a;
            int i9 = (i8 & (-88)) | ((~i8) & 87);
            int i10 = -(-((i8 & 87) << 1));
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 0 / 0;
                return;
            }
            return;
        }
        this.i = new t(1);
        int i13 = a;
        int i14 = ((i13 ^ 91) | (i13 & 91)) << 1;
        int i15 = -(((~i13) & 91) | (i13 & (-92)));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int d() {
        int i = 2 % 2;
        int i2 = a + 43;
        b = i2 % 128;
        if (i2 % 2 != 0 ? this.d.Y == 8 : this.d.Y == 100) {
            int i3 = a;
            int i4 = i3 & 51;
            int i5 = ((i3 ^ 51) | i4) << 1;
            int i6 = -((i3 | 51) & (~i4));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 17 / 0;
            }
            return 0;
        }
        int i9 = this.g;
        if (i9 >= 0) {
            int i10 = b;
            int i11 = ((i10 | 119) << 1) - (i10 ^ 119);
            a = i11 % 128;
            int i12 = i11 % 2;
            N n = this.f;
            if (n != null) {
                int i13 = (i10 & 27) + (i10 | 27);
                a = i13 % 128;
                int i14 = i13 % 2;
                if (n.d.Y == 8) {
                    int i15 = a;
                    int i16 = (((i15 | 34) << 1) - (i15 ^ 34)) - 1;
                    int i17 = i16 % 128;
                    b = i17;
                    int i18 = i16 % 2;
                    int i19 = ((i17 ^ 120) + ((i17 & 120) << 1)) - 1;
                    a = i19 % 128;
                    if (i19 % 2 == 0) {
                        return i9;
                    }
                    throw null;
                }
            }
        }
        int i20 = this.h;
        int i21 = b;
        int i22 = (-2) - ((((i21 | 80) << 1) - (i21 ^ 80)) ^ (-1));
        a = i22 % 128;
        int i23 = i22 % 2;
        return i20;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        String str = this.d.Z;
        int i2 = a;
        int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            sb.append(str);
            sb.append(":");
            int i4 = 9 / 0;
        } else {
            sb.append(str);
            sb.append(":");
        }
        sb.append(this.e.toString());
        String string = sb.toString();
        int i5 = a;
        int i6 = i5 & 51;
        int i7 = -(-((i5 ^ 51) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 29 / 0;
        }
        return string;
    }

    public boolean e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = -(-(i2 | 37));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        HashSet<N> hashSet = this.c;
        if (hashSet == null) {
            int i8 = (-2) - (((i6 ^ 40) + ((i6 & 40) << 1)) ^ (-1));
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 23;
            b = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        Iterator<N> it = hashSet.iterator();
        int i13 = b;
        int i14 = (i13 & 119) + (i13 | 119);
        a = i14 % 128;
        int i15 = i14 % 2;
        while (it.hasNext()) {
            int i16 = a;
            int i17 = ((i16 ^ 87) | (i16 & 87)) << 1;
            int i18 = -(((~i16) & 87) | (i16 & (-88)));
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            N n = null;
            if (i19 % 2 == 0) {
                it.next();
                throw null;
            }
            N next = it.next();
            switch (next.e.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    int i20 = a;
                    int i21 = (((i20 | 10) << 1) - (i20 ^ 10)) - 1;
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    break;
                case 1:
                    n = next.d.C;
                    int i23 = b + 51;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    break;
                case 2:
                    n = next.d.E;
                    int i25 = a;
                    int i26 = i25 & 89;
                    int i27 = i26 + ((i25 ^ 89) | i26);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    break;
                case 3:
                    n = next.d.B;
                    int i29 = b;
                    int i30 = i29 & 27;
                    int i31 = ((i29 | 27) & (~i30)) + (i30 << 1);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    break;
                case 4:
                    n = next.d.A;
                    int i33 = b;
                    int i34 = i33 & 85;
                    int i35 = (((i33 ^ 85) | i34) << 1) - ((i33 | 85) & (~i34));
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    break;
                default:
                    throw new AssertionError(next.e.name());
            }
            if (n.f()) {
                int i37 = a;
                int i38 = ((i37 & 102) + (i37 | 102)) - 1;
                b = i38 % 128;
                int i39 = i38 % 2;
                return true;
            }
        }
        int i40 = a + 43;
        b = i40 % 128;
        int i41 = i40 % 2;
        return false;
    }

    public void h() {
        int i = 2 % 2;
        int i2 = b + 53;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        N n = this.f;
        if (n != null) {
            int i5 = i3 ^ 17;
            int i6 = -(-((i3 & 17) << 1));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            HashSet<N> hashSet = n.c;
            if (hashSet != null) {
                int i10 = i8 + 25;
                a = i10 % 128;
                int i11 = i10 % 2;
                hashSet.remove(this);
                int i12 = b;
                int i13 = i12 & 11;
                int i14 = i13 + ((i12 ^ 11) | i13);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        this.f = null;
        this.h = 0;
        this.g = -1;
        int i16 = b;
        int i17 = i16 & 85;
        int i18 = (i16 | 85) & (~i17);
        int i19 = -(-(i17 << 1));
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0228  */
    /* JADX WARN: Code duplicated, block: B:94:0x024e  */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ef, code lost:
    
        if (r7 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0210, code lost:
    
        if (r14 == r11) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(ivas.gov.bisp.enumeration.p004ad.N r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p004ad.N.c(ivas.gov.bisp.enumeration.ad.N, int, int, boolean):boolean");
    }
}
