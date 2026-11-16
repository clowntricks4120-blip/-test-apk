package ivas.gov.bisp.enumeration.p001aa;

import ivas.gov.bisp.enumeration.OooOOoo.OooOO0O;
import ivas.gov.bisp.enumeration.p006af.h;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aa.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0083p<E> implements Cloneable {
    private static int a = 0;
    private static int b = 1;
    public static final Object c = new Object();
    public boolean d = false;
    public long[] e;
    public Object[] f;
    public int g;

    static {
        int i = b + 55;
        a = i % 128;
        int i2 = i % 2;
    }

    public C0083p() {
        int iK = h.k(10);
        this.e = new long[iK];
        this.f = new Object[iK];
    }

    public /* synthetic */ Object clone() {
        int i = 2 % 2;
        int i2 = b + 49;
        a = i2 % 128;
        int i3 = i2 % 2;
        OooOO0O<E> oooOO0OF = f();
        int i4 = b + 61;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return oooOO0OF;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public E i(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 92) + (i2 | 92)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return h(j, null);
        }
        h(j, null);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public int k() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 68) + (i2 | 68);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.d;
        if (i5 == 0) {
            int i6 = 20 / 0;
            if (z) {
                int i7 = i2 + 81;
                b = i7 % 128;
                int i8 = i7 % 2;
                g();
                int i9 = b;
                int i10 = ((i9 | 83) << 1) - (i9 ^ 83);
                a = i10 % 128;
                int i11 = i10 % 2;
            }
        } else if (z) {
            int i12 = i2 + 81;
            b = i12 % 128;
            int i13 = i12 % 2;
            g();
            int i14 = b;
            int i15 = ((i14 | 83) << 1) - (i14 ^ 83);
            a = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = this.g;
        int i18 = b;
        int i19 = i18 & 95;
        int i20 = ((i18 | 95) & (~i19)) + (i19 << 1);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            return i17;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public E c(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 47;
        a = i4 % 128;
        int i5 = i4 % 2;
        if (!(!this.d)) {
            int i6 = i3 & 103;
            int i7 = i6 + ((i3 ^ 103) | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            g();
            int i9 = a;
            int i10 = ((i9 ^ 29) | (i9 & 29)) << 1;
            int i11 = -(((~i9) & 29) | (i9 & (-30)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        E e = (E) this.f[i];
        int i14 = a;
        int i15 = i14 ^ 79;
        int i16 = -(-((i14 & 79) << 1));
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            return e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 122) << 1) - (i2 ^ 122)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.g;
        Object[] objArr = this.f;
        int i7 = i4 + 35;
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < i6) {
            int i10 = b;
            int i11 = i10 & 105;
            int i12 = (i10 | 105) & (~i11);
            int i13 = i11 << 1;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                objArr[i9] = null;
                int i15 = i9 & 60;
                int i16 = ((i9 | 60) & (~i15)) + (i15 << 1);
                i9 = ((i16 & (-51)) - (~(-(-(i16 | (-51)))))) - 1;
            } else {
                objArr[i9] = null;
                int i17 = i9 ^ 1;
                int i18 = (i9 & 1) << 1;
                i9 = (i17 & i18) + (i18 | i17);
            }
        }
        this.g = 0;
        this.d = false;
        int i19 = a;
        int i20 = (i19 & 47) + (i19 | 47);
        b = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 2 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0112 A[PHI: r6
  0x0112: PHI (r6v7 E) = (r6v6 E), (r6v23 E) binds: [B:31:0x0110, B:28:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0122  */
    public String toString() {
        E eC;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 82) << 1) - (i2 ^ 82);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (k() <= 0) {
            int i6 = a;
            int i7 = ((i6 | 9) << 1) - (i6 ^ 9);
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 99;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return "{}";
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        int i10 = a;
        int i11 = ((i10 ^ 57) | (i10 & 57)) << 1;
        int i12 = -(((~i10) & 57) | (i10 & (-58)));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        sb.append('{');
        int i15 = a;
        int i16 = (i15 ^ 95) + ((i15 & 95) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < this.g) {
            int i19 = a;
            int i20 = ((i19 & 25) - (~(-(-(i19 | 25))))) - 1;
            int i21 = i20 % 128;
            b = i21;
            int i22 = i20 % 2;
            if (i18 > 0) {
                int i23 = (((i21 ^ 3) | (i21 & 3)) << 1) - (((~i21) & 3) | (i21 & (-4)));
                a = i23 % 128;
                int i24 = i23 % 2;
                sb.append(", ");
                if (i24 != 0) {
                    int i25 = 11 / 0;
                }
                int i26 = b + 9;
                a = i26 % 128;
                int i27 = i26 % 2;
            }
            if (this.d) {
                int i28 = b;
                int i29 = (-2) - (((i28 ^ 56) + ((i28 & 56) << 1)) ^ (-1));
                a = i29 % 128;
                if (i29 % 2 != 0) {
                    g();
                    obj.hashCode();
                    throw null;
                }
                g();
                int i30 = a;
                int i31 = i30 & 125;
                int i32 = (i30 | 125) & (~i31);
                int i33 = i31 << 1;
                int i34 = (i32 & i33) + (i32 | i33);
                b = i34 % 128;
                int i35 = i34 % 2;
            }
            sb.append(this.e[i18]);
            int i36 = b;
            int i37 = ((i36 | 71) << 1) - (i36 ^ 71);
            a = i37 % 128;
            if (i37 % 2 != 0) {
                sb.append('w');
                eC = c(i18);
                if (eC != this) {
                    sb.append(eC);
                    int i38 = a;
                    int i39 = (i38 & 83) + (i38 | 83);
                    b = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    sb.append("(this Map)");
                    int i41 = b;
                    int i42 = i41 ^ 61;
                    int i43 = (61 & i41) << 1;
                    int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                }
            } else {
                sb.append('=');
                eC = c(i18);
                if (eC != this) {
                    sb.append(eC);
                    int i310 = a;
                    int i311 = (i310 & 83) + (i310 | 83);
                    b = i311 % 128;
                    int i46 = i311 % 2;
                } else {
                    sb.append("(this Map)");
                    int i47 = b;
                    int i48 = i47 ^ 61;
                    int i49 = (61 & i47) << 1;
                    int i410 = ((i48 | i49) << 1) - (i49 ^ i48);
                    a = i410 % 128;
                    int i411 = i410 % 2;
                }
            }
            int i50 = i18 | 48;
            int i51 = (i50 << 1) - ((~(i18 & 48)) & i50);
            i18 = ((i51 & (-46)) + (i51 | (-46))) - 1;
            int i52 = a;
            int i53 = (i52 & 111) + (i52 | 111);
            b = i53 % 128;
            if (i53 % 2 == 0) {
                int i54 = 5 % 4;
            }
        }
        sb.append('}');
        String string = sb.toString();
        int i55 = a + 59;
        b = i55 % 128;
        if (i55 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public E h(long j, E e) {
        int iF;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 43;
        int i4 = ((((i2 ^ 43) | i3) << 1) - (~(-((i2 | 43) & (~i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            iF = h.f(this.e, this.g, j);
            int i5 = 83 / 0;
        } else {
            iF = h.f(this.e, this.g, j);
        }
        int i6 = a;
        int i7 = (i6 & (-74)) | ((~i6) & 73);
        int i8 = -(-((i6 & 73) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        if (iF >= 0) {
            int i12 = i10 | 83;
            int i13 = ((i12 << 1) - (~(-(i12 & (~(i10 & 83)))))) - 1;
            a = i13 % 128;
            Object obj = null;
            if (i13 % 2 != 0) {
                Object obj2 = this.f[iF];
                obj.hashCode();
                throw null;
            }
            E e2 = (E) this.f[iF];
            if (e2 != c) {
                int i14 = i10 | 7;
                int i15 = i14 << 1;
                int i16 = -((~(i10 & 7)) & i14);
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                int i18 = i17 % 128;
                a = i18;
                if (i17 % 2 != 0) {
                    int i19 = 35 / 0;
                }
                int i20 = i18 + 37;
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    return e2;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i21 = (i10 ^ 75) + ((i10 & 75) << 1);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 90 / 0;
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r13 <= r12.e[(((r5 | r2) << 1) - (~(-r5))) - 1]) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        j(r13, r15);
        r13 = ivas.gov.bisp.enumeration.p001aa.C0083p.b + 73;
        ivas.gov.bisp.enumeration.p001aa.C0083p.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if ((r13 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r13 <= r12.e[r2]) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(long r13, E r15) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p001aa.C0083p.d(long, java.lang.Object):void");
    }

    public OooOO0O<E> f() {
        C0083p c0083p;
        Object objClone;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 106) + (i2 | 106);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                c0083p = (C0083p) super.clone();
                objClone = this.e.clone();
                int i5 = 3 / 0;
            } else {
                c0083p = (C0083p) super.clone();
                objClone = this.e.clone();
            }
            int i6 = b + 29;
            a = i6 % 128;
            int i7 = i6 % 2;
            c0083p.e = (long[]) objClone;
            Object[] objArr = (Object[]) this.f.clone();
            int i8 = a;
            int i9 = (((i8 & (-48)) | ((~i8) & 47)) - (~((i8 & 47) << 1))) - 1;
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            c0083p.f = objArr;
            int i12 = i10 ^ 33;
            int i13 = (((i10 & 33) | i12) << 1) - i12;
            a = i13 % 128;
            int i14 = i13 % 2;
            return c0083p;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r7[r1] == ivas.gov.bisp.enumeration.p001aa.C0083p.c) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r7[r1] == ivas.gov.bisp.enumeration.p001aa.C0083p.c) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r4 = (((r5 | 74) << 1) - (r5 ^ 74)) - 1;
        r5 = r4 % 128;
        ivas.gov.bisp.enumeration.p001aa.C0083p.b = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if ((r4 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        r12.e[r1] = r13;
        r13 = r5 & 109;
        r14 = (((~r13) & (r5 | 109)) - (~(r13 << 1))) - 1;
        ivas.gov.bisp.enumeration.p001aa.C0083p.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if ((r14 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r7[r1] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        r7[r1] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        r12.e[r1] = r13;
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(long r13, E r15) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p001aa.C0083p.j(long, java.lang.Object):void");
    }

    public final void g() {
        Object[] objArr;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 39;
        int i5 = (((i3 ^ 39) | i4) << 1) - ((~i4) & (i3 | 39));
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.g;
        long[] jArr = this.e;
        int i8 = (i3 ^ 69) + ((i3 & 69) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            objArr = this.f;
            i = 1;
        } else {
            objArr = this.f;
            i = 0;
        }
        int i9 = i3 & 61;
        int i10 = (i3 | 61) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        while (true) {
            Object obj = null;
            if (i14 >= i7) {
                this.d = false;
                this.g = i;
                int i15 = a;
                int i16 = ((i15 ^ 53) | (i15 & 53)) << 1;
                int i17 = -(((~i15) & 53) | (i15 & (-54)));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i19 = b + 97;
            int i20 = i19 % 128;
            a = i20;
            if (i19 % 2 != 0) {
                Object obj2 = objArr[i14];
                throw null;
            }
            Object obj3 = objArr[i14];
            if (obj3 != c) {
                if (i14 != i) {
                    int i21 = i20 & 51;
                    int i22 = i20 | 51;
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    int i24 = i23 % 128;
                    b = i24;
                    if (i23 % 2 == 0) {
                        jArr[i] = jArr[i14];
                        int i25 = 69 / 0;
                    } else {
                        jArr[i] = jArr[i14];
                    }
                    int i26 = i24 & 97;
                    int i27 = (((i24 | 97) & (~i26)) - (~(-(-(i26 << 1))))) - 1;
                    a = i27 % 128;
                    if (i27 % 2 != 0) {
                        objArr[i] = obj3;
                        objArr[i14] = null;
                        obj.hashCode();
                        throw null;
                    }
                    objArr[i] = obj3;
                    objArr[i14] = null;
                }
                int i28 = (((i & (-2)) | ((~i) & 1)) - (~((i & 1) << 1))) - 1;
                int i29 = a;
                int i30 = (((i29 & (-48)) | ((~i29) & 47)) - (~((i29 & 47) << 1))) - 1;
                b = i30 % 128;
                int i31 = i30 % 2;
                i = i28;
            }
            i14++;
            int i32 = a;
            int i33 = i32 & 79;
            int i34 = (i32 | 79) & (~i33);
            int i35 = i33 << 1;
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            b = i36 % 128;
            int i37 = i36 % 2;
        }
    }
}
