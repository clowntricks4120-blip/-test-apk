package ivas.gov.bisp.enumeration.p001aa;

import ivas.gov.bisp.enumeration.OooOOoo.OooOo00;
import ivas.gov.bisp.enumeration.p006af.h;

/* JADX INFO: loaded from: classes.dex */
public class u<E> implements Cloneable {
    private static int a = 1;
    private static int b;
    public static final Object c = new Object();
    public int[] d;
    public Object[] e;
    public int f;

    static {
        int i = a;
        int i2 = ((i ^ 89) | (i & 89)) << 1;
        int i3 = -(((~i) & 89) | (i & (-90)));
        int i4 = (i2 & i3) + (i3 | i2);
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public u() {
        int iD = h.d(10);
        this.d = new int[iD];
        this.e = new Object[iD];
    }

    public /* synthetic */ Object clone() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            d();
            throw null;
        }
        OooOo00<E> oooOo00D = d();
        int i4 = a;
        int i5 = i4 & 97;
        int i6 = i4 | 97;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return oooOo00D;
        }
        obj.hashCode();
        throw null;
    }

    public E e(int i) {
        int i2 = 2 % 2;
        int i3 = a + 6;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        E eF = f(i, null);
        int i6 = a;
        int i7 = (i6 ^ 33) + ((i6 & 33) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return eF;
    }

    public void g(int i, E e) {
        int[] iArr;
        int i2;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 | 9) << 1) - (i5 ^ 9);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            h.e(this.d, this.f, i);
            throw null;
        }
        int iE = h.e(this.d, this.f, i);
        if (iE >= 0) {
            int i7 = a;
            int i8 = ((i7 ^ 45) - (~((i7 & 45) << 1))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            this.e[iE] = e;
            int i10 = ((i7 ^ 105) | (i7 & 105)) << 1;
            int i11 = -(((~i7) & 105) | (i7 & (-106)));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        int i14 = ~iE;
        int i15 = this.f;
        int i16 = b;
        int i17 = ((i16 & 72) + (i16 | 72)) - 1;
        a = i17 % 128;
        if (i17 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i14 < i15) {
            int i18 = i16 & 41;
            int i19 = (~i18) & (i16 | 41);
            int i20 = -(-(i18 << 1));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                Object obj2 = this.e[i14];
                obj.hashCode();
                throw null;
            }
            Object[] objArr3 = this.e;
            if (objArr3[i14] == c) {
                int i22 = (i16 & (-48)) | ((~i16) & 47);
                int i23 = -(-((i16 & 47) << 1));
                int i24 = (i22 & i23) + (i22 | i23);
                int i25 = i24 % 128;
                a = i25;
                int i26 = i24 % 2;
                this.d[i14] = i;
                objArr3[i14] = e;
                int i27 = i25 & 51;
                int i28 = (i25 ^ 51) | i27;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    int i30 = 26 / 0;
                    return;
                }
                return;
            }
        }
        if (i15 >= this.d.length) {
            int i31 = a;
            int i32 = (i31 ^ 121) + ((i31 & 121) << 1);
            b = i32 % 128;
            int i33 = i32 % 2;
            int iD = h.d(((i15 & 2) + (i15 | 2)) - 1);
            int[] iArr3 = new int[iD];
            int i34 = a;
            int i35 = i34 ^ 45;
            int i36 = ((i34 & 45) | i35) << 1;
            int i37 = -i35;
            int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
            int i39 = i38 % 128;
            b = i39;
            if (i38 % 2 != 0) {
                objArr = new Object[iD];
                iArr2 = this.d;
                int i40 = 43 / 0;
            } else {
                objArr = new Object[iD];
                iArr2 = this.d;
            }
            int i41 = (i39 ^ 21) + ((i39 & 21) << 1);
            a = i41 % 128;
            int i42 = i41 % 2;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            int i43 = b;
            int i44 = (i43 & 3) + (i43 | 3);
            a = i44 % 128;
            if (i44 % 2 == 0) {
                objArr2 = this.e;
                i3 = 1;
            } else {
                objArr2 = this.e;
                i3 = 0;
            }
            int i45 = i43 & 23;
            int i46 = (((i43 | 23) & (~i45)) - (~(i45 << 1))) - 1;
            a = i46 % 128;
            int i47 = i46 % 2;
            System.arraycopy(objArr2, 0, objArr, i3, objArr2.length);
            this.d = iArr3;
            int i48 = b + 49;
            a = i48 % 128;
            if (i48 % 2 == 0) {
                this.e = objArr;
                throw null;
            }
            this.e = objArr;
        }
        int i49 = this.f;
        int i50 = -i14;
        int i51 = i49 & i50;
        int i52 = (i49 ^ i50) | i51;
        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
        if (i53 != 0) {
            int i54 = a + 115;
            int i55 = i54 % 128;
            b = i55;
            if (i54 % 2 != 0) {
                iArr = this.d;
                i2 = i14 % 1;
            } else {
                iArr = this.d;
                i2 = (((i14 & (-2)) | ((~i14) & 1)) - (~(-(-((i14 & 1) << 1))))) - 1;
            }
            int i56 = ((i55 ^ 95) | (i55 & 95)) << 1;
            int i57 = -(((~i55) & 95) | (i55 & (-96)));
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            a = i58 % 128;
            if (i58 % 2 == 0) {
                System.arraycopy(iArr, i14, iArr, i2, i53);
                throw null;
            }
            System.arraycopy(iArr, i14, iArr, i2, i53);
            Object[] objArr4 = this.e;
            int i59 = this.f;
            int i60 = i59 & i50;
            int i61 = -(-((i50 ^ i59) | i60));
            System.arraycopy(objArr4, i14, objArr4, i2, ((i60 | i61) << 1) - (i61 ^ i60));
            int i62 = a;
            int i63 = i62 & 11;
            int i64 = (i62 | 11) & (~i63);
            int i65 = -(-(i63 << 1));
            int i66 = (i64 & i65) + (i64 | i65);
            b = i66 % 128;
            int i67 = i66 % 2;
        }
        this.d[i14] = i;
        Object[] objArr5 = this.e;
        int i68 = a;
        int i69 = i68 & 49;
        int i70 = (((i68 ^ 49) | i69) << 1) - ((~i69) & (i68 | 49));
        b = i70 % 128;
        int i71 = i70 % 2;
        objArr5[i14] = e;
        this.f++;
        int i72 = i68 + 89;
        b = i72 % 128;
        if (i72 % 2 != 0) {
            throw null;
        }
    }

    public int h(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 83) << 1) - (i3 ^ 83);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            int i6 = this.d[i];
            throw null;
        }
        int i7 = this.d[i];
        int i8 = ((i5 ^ 90) + ((i5 & 90) << 1)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public int i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 29) | (i2 & 29)) << 1;
        int i4 = -(((~i2) & 29) | (i2 & (-30)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = this.f;
        int i9 = i6 & 87;
        int i10 = -(-((i6 ^ 87) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return i8;
    }

    public E j(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-64)) | ((~i3) & 63)) + ((i3 & 63) << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            Object obj2 = this.e[i];
            throw null;
        }
        E e = (E) this.e[i];
        int i5 = i3 & 97;
        int i6 = i5 + ((i3 ^ 97) | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return e;
        }
        obj.hashCode();
        throw null;
    }

    public OooOo00<E> d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = -(-((i2 ^ 53) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        try {
            u uVar = (u) super.clone();
            int[] iArr = this.d;
            int i7 = b;
            int i8 = i7 & 43;
            int i9 = -(-((i7 ^ 43) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            Object obj = null;
            if (i10 % 2 == 0) {
                uVar.d = (int[]) iArr.clone();
                obj.hashCode();
                throw null;
            }
            uVar.d = (int[]) iArr.clone();
            uVar.e = (Object[]) this.e.clone();
            int i11 = b;
            int i12 = (i11 ^ 117) + ((i11 & 117) << 1);
            int i13 = i12 % 128;
            a = i13;
            if (i12 % 2 == 0) {
                throw null;
            }
            int i14 = (-2) - ((i13 + 66) ^ (-1));
            b = i14 % 128;
            int i15 = i14 % 2;
            return uVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E f(int i, E e) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 73;
        int i5 = (i3 | 73) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int iE = h.e(this.d, this.f, i);
        int i9 = b;
        int i10 = ((i9 & 110) + (i9 | 110)) - 1;
        int i11 = i10 % 128;
        a = i11;
        int i12 = i10 % 2;
        if (iE >= 0) {
            int i13 = i11 ^ 13;
            int i14 = -(-((i11 & 13) << 1));
            int i15 = (i13 & i14) + (i13 | i14);
            b = i15 % 128;
            int i16 = i15 % 2;
            E e2 = (E) this.e[iE];
            if (e2 != c) {
                int i17 = i11 + 59;
                int i18 = i17 % 128;
                b = i18;
                Object obj = null;
                if (i17 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i19 = (i18 & 65) + (i18 | 65);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    return e2;
                }
                throw null;
            }
        }
        int i20 = (i11 & 60) + (i11 | 60);
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        b = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 89 / 0;
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        return "{}";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r2 = new java.lang.StringBuilder(r11.f * 28);
        r6 = ivas.gov.bisp.enumeration.p001aa.u.a;
        r7 = (((r6 | 2) << 1) - (r6 ^ 2)) - 1;
        ivas.gov.bisp.enumeration.p001aa.u.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if ((r7 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        r2.append('l');
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r2.append('{');
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p001aa.u.a;
        r8 = r7 & 37;
        r7 = ((r7 | 37) & (~r8)) + (r8 << 1);
        ivas.gov.bisp.enumeration.p001aa.u.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r6 >= r11.f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p001aa.u.a;
        r8 = ((r7 & 55) - (~(-(-(r7 | 55))))) - 1;
        ivas.gov.bisp.enumeration.p001aa.u.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r6 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r7 = r7 + 21;
        ivas.gov.bisp.enumeration.p001aa.u.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if ((r7 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        r2.append(", ");
        r7 = 41 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        r2.append(h(r6));
        r7 = ivas.gov.bisp.enumeration.p001aa.u.a;
        r9 = r7 & 19;
        r8 = ((r7 ^ 19) | r9) << 1;
        r7 = -((r7 | 19) & (~r9));
        r9 = (r8 ^ r7) + ((r7 & r8) << 1);
        ivas.gov.bisp.enumeration.p001aa.u.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        if ((r9 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        r7 = 'm';
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        r2.append(r7);
        r7 = j(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        r7 = '=';
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p001aa.u.b;
        r9 = r8 & 63;
        r8 = (r8 ^ 63) | r9;
        r10 = (r9 & r8) + (r8 | r9);
        r8 = r10 % 128;
        ivas.gov.bisp.enumeration.p001aa.u.a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        if ((r10 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
    
        if (r7 == r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r9 = (r8 & (-64)) | ((~r8) & 63);
        r8 = (r8 & 63) << 1;
        r10 = (r9 & r8) + (r8 | r9);
        ivas.gov.bisp.enumeration.p001aa.u.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        if ((r10 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fd, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0101, code lost:
    
        r2.append("(this Map)");
        r7 = ivas.gov.bisp.enumeration.p001aa.u.a + 11;
        ivas.gov.bisp.enumeration.p001aa.u.b = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
    
        r7 = r6 & 1;
        r6 = (r7 - (~(-(-((r6 ^ 1) | r7))))) - 1;
        r7 = ivas.gov.bisp.enumeration.p001aa.u.b;
        r7 = (-2) - ((((r7 | 36) << 1) - (r7 ^ 36)) ^ (-1));
        ivas.gov.bisp.enumeration.p001aa.u.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012d, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0130, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0131, code lost:
    
        r2.append('}');
        r1 = r2.toString();
        r2 = ivas.gov.bisp.enumeration.p001aa.u.b;
        r4 = r2 & 89;
        r2 = (r2 ^ 89) | r4;
        r5 = (r4 ^ r2) + ((r2 & r4) << 1);
        ivas.gov.bisp.enumeration.p001aa.u.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (i() <= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (i() <= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p001aa.u.b;
        r4 = (r2 & (-42)) | ((~r2) & 41);
        r1 = (41 & r2) << 1;
        r2 = ((r4 | r1) << 1) - (r1 ^ r4);
        ivas.gov.bisp.enumeration.p001aa.u.a = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p001aa.u.toString():java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c A[PHI: r1
  0x001c: PHI (r1v5 int) = (r1v4 int), (r1v15 int) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    public void c(int i, E e) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 57;
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            i2 = this.f;
            int i7 = 20 / 0;
            if (i2 != 0) {
                if (i <= this.d[((i2 ^ (-1)) | i2) + i2]) {
                    int i8 = i6 & 33;
                    i3 = (i8 - (~(-(-((i6 ^ 33) | i8))))) - 1;
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        g(i, e);
                        throw null;
                    }
                    g(i, e);
                    int i9 = a + 54;
                    int i10 = (i9 ^ (-1)) + (i9 << 1);
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    return;
                }
            }
        } else {
            i2 = this.f;
            if (i2 != 0) {
                if (i <= this.d[((i2 ^ (-1)) | i2) + i2]) {
                    int i12 = i6 & 33;
                    i3 = (i12 - (~(-(-((i6 ^ 33) | i12))))) - 1;
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        g(i, e);
                        throw null;
                    }
                    g(i, e);
                    int i13 = a + 54;
                    int i14 = (i13 ^ (-1)) + (i13 << 1);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    return;
                }
            }
        }
        if (i2 >= this.d.length) {
            int i16 = i6 & 115;
            int i17 = -(-(i6 | 115));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i2 ^ 1;
            int i21 = -(-((i2 & 1) << 1));
            int iD = h.d((i20 & i21) + (i20 | i21));
            int[] iArr = new int[iD];
            int i22 = a;
            int i23 = i22 & 13;
            int i24 = i22 | 13;
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            Object[] objArr = new Object[iD];
            int[] iArr2 = this.d;
            int i28 = (i26 ^ 19) + ((i26 & 19) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.e;
            int i30 = b;
            int i31 = i30 & 21;
            int i32 = (i31 - (~((i30 ^ 21) | i31))) - 1;
            a = i32 % 128;
            if (i32 % 2 == 0) {
                System.arraycopy(objArr2, 0, objArr, 1, objArr2.length);
            } else {
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            }
            this.d = iArr;
            this.e = objArr;
            int i33 = a;
            int i34 = (i33 & 120) + (i33 | 120);
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            b = i35 % 128;
            int i36 = i35 % 2;
        }
        this.d[i2] = i;
        this.e[i2] = e;
        int i37 = b;
        int i38 = i37 & 81;
        int i39 = (((i37 ^ 81) | i38) << 1) - ((i37 | 81) & (~i38));
        int i40 = i39 % 128;
        a = i40;
        int i41 = i39 % 2;
        this.f = i2 + 1;
        int i42 = i40 | 23;
        int i43 = (i42 << 1) - ((~(i40 & 23)) & i42);
        b = i43 % 128;
        int i44 = i43 % 2;
    }
}
