package ivas.gov.bisp.enumeration.p004ad;

import ivas.gov.bisp.enumeration.p003ac.i;

/* JADX INFO: loaded from: classes.dex */
public class Q extends C0087m {
    private static int a = 0;
    private static int b = 1;
    public float ag = -1.0f;
    public int ah = -1;
    public int aj = -1;
    public N ai = this.A;
    public int ak = 0;

    public Q() {
        int i = 0;
        this.L.clear();
        this.L.add(this.ai);
        int length = this.K.length;
        int i2 = 2 % 2;
        while (i < length) {
            int i3 = a;
            int i4 = i3 & 23;
            int i5 = (i4 - (~(-(-((i3 ^ 23) | i4))))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            N[] nArr = this.K;
            if (i6 == 0) {
                nArr[i] = this.ai;
                int i7 = i ^ (-96);
                int i8 = ((i & (-96)) | i7) << 1;
                int i9 = -i7;
                int i10 = (i8 & i9) + (i8 | i9);
                int i11 = ((i10 ^ 110) | (i10 & 110)) << 1;
                int i12 = -((i10 & (-111)) | ((~i10) & 110));
                i = (i11 & i12) + (i11 | i12);
            } else {
                nArr[i] = this.ai;
                i = (-2) - ((((i | 2) << 1) - (i ^ 2)) ^ (-1));
            }
            int i13 = a + 111;
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = ((i15 ^ 43) | (i15 & 43)) << 1;
        int i17 = -(((~i15) & 43) | (i15 & (-44)));
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    public boolean e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 27) << 1;
        int i4 = -(((~i2) & 27) | (i2 & (-28)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        return !(i5 % 2 == 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    public N g(N.aTW atw) {
        N n;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 ^ 37) | (i5 & 37)) << 1;
        int i7 = -(((~i5) & 37) | (i5 & (-38)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        Object obj = null;
        int iOrdinal = atw.ordinal();
        if (i9 == 0) {
            switch (iOrdinal) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    int i10 = b;
                    int i11 = (((i10 & (-124)) | ((~i10) & 123)) - (~(-(-((i10 & 123) << 1))))) - 1;
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    return null;
                case 1:
                case 3:
                    if (this.ak == 1) {
                        int i13 = b;
                        int i14 = i13 + 21;
                        a = i14 % 128;
                        int i15 = i14 % 2;
                        n = this.ai;
                        i = (i13 & 15) + (i13 | 15);
                        a = i % 128;
                        if (i % 2 == 0) {
                            return n;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    break;
                case 2:
                case 4:
                    if (this.ak == 0) {
                        i2 = b + 61;
                        i3 = i2 % 128;
                        a = i3;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                        N n2 = this.ai;
                        int i16 = i3 + 71;
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        return n2;
                    }
                    break;
                default:
                    int i18 = b;
                    int i19 = i18 ^ 89;
                    int i20 = (i18 & 89) << 1;
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    break;
            }
        } else {
            int i23 = 54 / 0;
            switch (iOrdinal) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    int i110 = b;
                    int i111 = (((i110 & (-124)) | ((~i110) & 123)) - (~(-(-((i110 & 123) << 1))))) - 1;
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    return null;
                case 1:
                case 3:
                    if (this.ak == 1) {
                        int i113 = b;
                        int i114 = i113 + 21;
                        a = i114 % 128;
                        int i115 = i114 % 2;
                        n = this.ai;
                        i = (i113 & 15) + (i113 | 15);
                        a = i % 128;
                        if (i % 2 == 0) {
                            return n;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    break;
                case 2:
                case 4:
                    if (this.ak == 0) {
                        i2 = b + 61;
                        i3 = i2 % 128;
                        a = i3;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                        N n3 = this.ai;
                        int i116 = i3 + 71;
                        b = i116 % 128;
                        int i117 = i116 % 2;
                        return n3;
                    }
                    break;
                default:
                    int i118 = b;
                    int i119 = i118 ^ 89;
                    int i24 = (i118 & 89) << 1;
                    int i25 = ((i119 | i24) << 1) - (i24 ^ i119);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    break;
            }
        }
        throw new AssertionError(atw.name());
    }

    public void F(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 25;
        int i5 = (i3 | 25) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i9 = 0;
        if (this.ak == i) {
            int i10 = (i8 | 31) << 1;
            int i11 = -(i8 ^ 31);
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 67 / 0;
                return;
            }
            return;
        }
        this.ak = i;
        this.L.clear();
        int i14 = this.ak;
        int i15 = a;
        int i16 = i15 & 121;
        int i17 = ((i15 ^ 121) | i16) << 1;
        int i18 = -((i15 | 121) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        b = i19 % 128;
        if (i19 % 2 != 0 ? i14 != 1 : i14 != 1) {
            this.ai = this.A;
            int i20 = a;
            int i21 = i20 & 115;
            int i22 = i21 + ((i20 ^ 115) | i21);
            b = i22 % 128;
            int i23 = i22 % 2;
        } else {
            this.ai = this.B;
            int i24 = a;
            int i25 = (((i24 ^ 121) | (i24 & 121)) << 1) - (((~i24) & 121) | (i24 & (-122)));
            b = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 5 / 5;
            }
        }
        this.L.add(this.ai);
        N[] nArr = this.K;
        int i27 = b + 23;
        int i28 = i27 % 128;
        a = i28;
        int i29 = i27 % 2;
        int length = nArr.length;
        int i30 = i28 & 97;
        int i31 = ((i28 ^ 97) | i30) << 1;
        int i32 = -((i28 | 97) & (~i30));
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        b = i33 % 128;
        int i34 = i33 % 2;
        while (i9 < length) {
            int i35 = b + 103;
            a = i35 % 128;
            int i36 = i35 % 2;
            this.K[i9] = this.ai;
            int i37 = i9 & 1;
            i9 = i37 + ((i9 ^ 1) | i37);
            int i38 = a;
            int i39 = i38 & 107;
            int i40 = (i38 | 107) & (~i39);
            int i41 = i39 << 1;
            int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
            b = i42 % 128;
            int i43 = i42 % 2;
        }
        int i44 = a;
        int i45 = i44 ^ 81;
        int i46 = -(-((i44 & 81) << 1));
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        b = i47 % 128;
        int i48 = i47 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    public void E(i iVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 73) + ((i2 & 73) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this.N == null) {
            int i5 = a;
            int i6 = i5 & 107;
            int i7 = (i5 ^ 107) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 67 / 0;
                return;
            }
            return;
        }
        int iQ = iVar.q(this.ai);
        int i10 = this.ak;
        int i11 = a;
        int i12 = (i11 ^ 56) + ((i11 & 56) << 1);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        if (i10 != 1) {
            this.H = 0;
            this.U = iQ;
            C0087m c0087m = this.N;
            int i16 = b;
            int i17 = i16 & 53;
            int i18 = ((i16 | 53) & (~i17)) + (i17 << 1);
            a = i18 % 128;
            if (i18 % 2 != 0) {
                D(c0087m.p());
            } else {
                D(c0087m.p());
            }
            y(0);
            int i19 = b;
            int i20 = i19 & 1;
            int i21 = -(-(i19 | 1));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            a = i22 % 128;
            int i23 = i22 % 2;
            return;
        }
        int i24 = i14 ^ 9;
        int i25 = (i14 & 9) << 1;
        int i26 = (i24 & i25) + (i24 | i25);
        a = i26 % 128;
        int i27 = i26 % 2;
        this.H = iQ;
        this.U = 0;
        C0087m c0087m2 = this.N;
        int i28 = a + 77;
        b = i28 % 128;
        int i29 = i28 % 2;
        y(c0087m2.c());
        D(0);
        int i30 = a;
        int i31 = ((i30 ^ 83) | (i30 & 83)) << 1;
        int i32 = -(((~i30) & 83) | (i30 & (-84)));
        int i33 = (i31 & i32) + (i32 | i31);
        b = i33 % 128;
        int i34 = i33 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if ((r3 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r7 = r4.g(ivas.gov.bisp.enumeration.ad.N.aTW.d);
        r8 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r9 = r8 & 73;
        r8 = ((r8 | 73) & (~r9)) + (r9 << 1);
        ivas.gov.bisp.enumeration.p004ad.Q.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if ((r8 % 2) != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        r8 = r4.g(ivas.gov.bisp.enumeration.ad.N.aTW.f);
        r9 = r17.N;
        r10 = ivas.gov.bisp.enumeration.p004ad.Q.a + 39;
        ivas.gov.bisp.enumeration.p004ad.Q.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if ((r10 % 2) == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r9 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r9.M[0] != 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p004ad.Q.a + 29;
        ivas.gov.bisp.enumeration.p004ad.Q.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if ((r9 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r11 = r9 & 33;
        r10 = ((((r9 ^ 33) | r11) << 1) - (~(-((r9 | 33) & (~r11))))) - 1;
        ivas.gov.bisp.enumeration.p004ad.Q.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (r17.ak != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r8 = (r7 & 111) + (r7 | 111);
        ivas.gov.bisp.enumeration.p004ad.Q.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if ((r8 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r7 = r4.g(ivas.gov.bisp.enumeration.ad.N.aTW.e);
        r8 = 65 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        r7 = r4.g(ivas.gov.bisp.enumeration.ad.N.aTW.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        r8 = r4.g(ivas.gov.bisp.enumeration.ad.N.aTW.h);
        r4 = r17.N;
        r9 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r10 = r9 | 97;
        r11 = r10 << 1;
        r10 = -(r10 & (~(r9 & 97)));
        r12 = (r11 ^ r10) + ((r10 & r11) << 1);
        ivas.gov.bisp.enumeration.p004ad.Q.a = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        if ((r12 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (r4 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        r9 = r9 + 5;
        ivas.gov.bisp.enumeration.p004ad.Q.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ea, code lost:
    
        if ((r9 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        if (r4.M[1] != 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        if (r4.M[1] != 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r10 = r4 & 107;
        r9 = ((r4 ^ 107) | r10) << 1;
        r4 = -((r4 | 107) & (~r10));
        r10 = (r9 & r4) + (r4 | r9);
        ivas.gov.bisp.enumeration.p004ad.Q.b = r10 % 128;
        r10 = r10 % 2;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r9 = r4 & 67;
        r4 = -(-((r4 ^ 67) | r9));
        r10 = ((r9 | r4) << 1) - (r4 ^ r9);
        ivas.gov.bisp.enumeration.p004ad.Q.b = r10 % 128;
        r10 = r10 % 2;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012f, code lost:
    
        if (r17.ah == (-1)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0131, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r12 = r4 & 89;
        r4 = (r4 ^ 89) | r12;
        r14 = ((r12 | r4) << 1) - (r4 ^ r12);
        ivas.gov.bisp.enumeration.p004ad.Q.a = r14 % 128;
        r14 = r14 % 2;
        r4 = r18.n(r17.ai);
        r7 = r18.n(r7);
        r12 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r14 = ((r12 & 90) + (r12 | 90)) - 1;
        ivas.gov.bisp.enumeration.p004ad.Q.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
    
        if ((r14 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
    
        r18.g(r4, r7, r17.ah, 127);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0163, code lost:
    
        r18.g(r4, r7, r17.ah, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
    
        if (r9 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016a, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r7 = ((r5 & 122) + (r5 | 122)) - 1;
        ivas.gov.bisp.enumeration.p004ad.Q.a = r7 % 128;
        r7 = r7 % 2;
        r18.h(r18.n(r8), r4, 0, 5);
        r1 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r4 = (r1 ^ 25) + ((r1 & 25) << 1);
        ivas.gov.bisp.enumeration.p004ad.Q.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018b, code lost:
    
        if ((r4 % 2) == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018d, code lost:
    
        r11 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0191, code lost:
    
        if (r17.aj == (-1)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0193, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r12 = r4 & 99;
        r12 = (r12 - (~((r4 ^ 99) | r12))) - 1;
        ivas.gov.bisp.enumeration.p004ad.Q.a = r12 % 128;
        r12 = r12 % 2;
        r4 = r18.n(r17.ai);
        r12 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r14 = (((r12 ^ 109) | (r12 & 109)) << 1) - ((109 & (~r12)) | (r12 & (-110)));
        ivas.gov.bisp.enumeration.p004ad.Q.b = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01be, code lost:
    
        if ((r14 % 2) != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c0, code lost:
    
        r8 = r18.n(r8);
        r12 = r17.aj;
        r14 = 62 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ca, code lost:
    
        r8 = r18.n(r8);
        r12 = r17.aj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d0, code lost:
    
        r14 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r15 = (r14 | 91) << 1;
        r14 = -(r14 ^ 91);
        r14 = (r15 ^ r14) + ((r14 & r15) << 1);
        ivas.gov.bisp.enumeration.p004ad.Q.a = r14 % 128;
        r14 = r14 % 2;
        r18.g(r4, r8, -r12, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e7, code lost:
    
        if (r9 == true) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01eb, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r10 = r9 & 71;
        r9 = -(-((r9 ^ 71) | r10));
        r11 = (r10 & r9) + (r9 | r10);
        ivas.gov.bisp.enumeration.p004ad.Q.a = r11 % 128;
        r11 = r11 % 2;
        r18.h(r4, r18.n(r7), 0, 5);
        r7 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r9 = r7 & 17;
        r7 = (r7 ^ 17) | r9;
        r10 = (r9 ^ r7) + ((r7 & r9) << 1);
        ivas.gov.bisp.enumeration.p004ad.Q.b = r10 % 128;
        r10 = r10 % 2;
        r18.h(r8, r4, 0, 5);
        r1 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r4 = (r1 & 1) + (r1 | 1);
        ivas.gov.bisp.enumeration.p004ad.Q.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0223, code lost:
    
        if ((r4 % 2) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0225, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0226, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022d, code lost:
    
        if (r17.ag == (-1.0f)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022f, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r9 = ((r4 | 87) << 1) - (r4 ^ 87);
        ivas.gov.bisp.enumeration.p004ad.Q.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x023c, code lost:
    
        if ((r9 % 2) == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x023e, code lost:
    
        r4 = r18.n(r17.ai);
        r8 = r18.n(r8);
        r9 = r17.ag;
        r10 = r18.p();
        r12 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r14 = ((r12 & 48) + (r12 | 48)) - 1;
        ivas.gov.bisp.enumeration.p004ad.Q.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x025b, code lost:
    
        if ((r14 % 2) == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x025d, code lost:
    
        r10.f.d(r4, -1.0f);
        r4 = 30 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0266, code lost:
    
        r10.f.d(r4, -1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x026b, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r6 = (((r4 ^ 121) | (r4 & 121)) << 1) - (((~r4) & 121) | (r4 & (-122)));
        ivas.gov.bisp.enumeration.p004ad.Q.a = r6 % 128;
        r6 = r6 % 2;
        r10.f.d(r8, r9);
        r4 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r6 = (r4 & 57) + (r4 | 57);
        ivas.gov.bisp.enumeration.p004ad.Q.a = r6 % 128;
        r6 = r6 % 2;
        r18.f(r10);
        r1 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r4 = ((r1 | 77) << 1) - (r1 ^ 77);
        ivas.gov.bisp.enumeration.p004ad.Q.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a1, code lost:
    
        if ((r4 % 2) != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a3, code lost:
    
        r1 = 4 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02a6, code lost:
    
        r18.n(r17.ai);
        r18.n(r8);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02b2, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p004ad.Q.a;
        r6 = r1 & 47;
        r3 = (((r1 ^ 47) | r6) << 1) - ((r1 | 47) & (~r6));
        ivas.gov.bisp.enumeration.p004ad.Q.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c4, code lost:
    
        if ((r3 % 2) == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c8, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02cb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02cc, code lost:
    
        r4.g(ivas.gov.bisp.enumeration.ad.N.aTW.f);
        r1 = r17.N;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p004ad.Q.b;
        r6 = r1 & 35;
        r4 = ((r1 ^ 35) | r6) << 1;
        r1 = -((r1 | 35) & (~r6));
        r3 = ((r4 | r1) << 1) - (r1 ^ r4);
        ivas.gov.bisp.enumeration.p004ad.Q.a = r3 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(ivas.gov.bisp.enumeration.p003ac.i r18) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p004ad.Q.d(ivas.gov.bisp.enumeration.ac.i):void");
    }
}
