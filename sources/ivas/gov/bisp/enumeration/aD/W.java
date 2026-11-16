package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooO0OO;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class W extends OooO0OO<Long> implements RandomAccess, af {
    private static int a = 1;
    private static int b;
    public long[] d;
    public int e;

    static {
        W w = new W(new long[0], 0);
        int i = b;
        int i2 = i & 79;
        int i3 = (i2 - (~((i ^ 79) | i2))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        w.c = false;
        int i5 = b;
        int i6 = ((i5 & 72) + (i5 | 72)) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public W() {
        this.d = new long[10];
        this.e = 0;
    }

    public final void e(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 117) + (i3 | 117);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (i >= 0) {
            int i7 = (i5 & 75) + (i5 | 75);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (i < this.e) {
                int i9 = ((i5 ^ 1) | (i5 & 1)) << 1;
                int i10 = -(((~i5) & 1) | (i5 & (-2)));
                int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException(i(i));
    }

    public final R.biN g(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 88) + ((i3 & 88) << 1)) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (i < this.e) {
            throw new IllegalArgumentException();
        }
        W w = new W(Arrays.copyOf(this.d, i), this.e);
        int i5 = a;
        int i6 = (i5 & 119) + (i5 | 119);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return w;
        }
        obj.hashCode();
        throw null;
    }

    public final String i(int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        int i3 = a;
        int i4 = (i3 & (-68)) | ((~i3) & 67);
        int i5 = (i3 & 67) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            sb.append(i);
            sb.append(", Size:");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sb.append(i);
        sb.append(", Size:");
        int i7 = a;
        int i8 = i7 & 57;
        int i9 = -(-((i7 ^ 57) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        sb.append(this.e);
        String string = sb.toString();
        int i12 = b;
        int i13 = ((i12 | 111) << 1) - (i12 ^ 111);
        a = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ab, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b3, code lost:
    
        throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r8 >= r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r8 >= r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.W.a;
        r2 = ((r1 ^ 76) + ((r1 & 76) << 1)) - 1;
        ivas.gov.bisp.enumeration.aD.W.b = r2 % 128;
        r2 = r2 % 2;
        r2 = r6.d;
        r3 = r6.e;
        r4 = -r8;
        r5 = r3 & r4;
        r5 = r5 + ((r3 ^ r4) | r5);
        r4 = r1 & 23;
        r3 = ((r1 ^ 23) | r4) << 1;
        r1 = -((r1 | 23) & (~r4));
        r4 = ((r3 | r1) << 1) - (r1 ^ r3);
        ivas.gov.bisp.enumeration.aD.W.b = r4 % 128;
        r4 = r4 % 2;
        java.lang.System.arraycopy(r2, r8, r2, r7, r5);
        r1 = r6.e;
        r7 = -r7;
        r3 = r8 & r7;
        r2 = ((r8 ^ r7) | r3) << 1;
        r7 = -((r7 | r8) & (~r3));
        r7 = -((r2 ^ r7) + ((r7 & r2) << 1));
        r6.e = (r1 & r7) + (r7 | r1);
        r7 = ivas.gov.bisp.enumeration.aD.W.a + 57;
        ivas.gov.bisp.enumeration.aD.W.b = r7 % 128;
        r7 = r7 % 2;
        r7 = ((java.util.AbstractList) r6).modCount;
        r8 = r7 & 1;
        ((java.util.AbstractList) r6).modCount = (((r7 | 1) & (~r8)) - (~(r8 << 1))) - 1;
        r7 = ivas.gov.bisp.enumeration.aD.W.b;
        r8 = ((r7 ^ 61) | (r7 & 61)) << 1;
        r7 = -(((~r7) & 61) | (r7 & (-62)));
        r1 = (r8 ^ r7) + ((r7 & r8) << 1);
        ivas.gov.bisp.enumeration.aD.W.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a7, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void removeRange(int r7, int r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.W.b
            r2 = r1 ^ 27
            r3 = r1 & 27
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = ~r3
            r1 = r1 | 27
            r1 = r1 & r3
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.aD.W.a = r1
            int r2 = r2 % r0
            r6.d()
            if (r2 != 0) goto L22
            r1 = 46
            int r1 = r1 / 0
            if (r8 < r7) goto Lac
            goto L24
        L22:
            if (r8 < r7) goto Lac
        L24:
            int r1 = ivas.gov.bisp.enumeration.aD.W.a
            r2 = r1 ^ 76
            r3 = r1 & 76
            int r3 = r3 << 1
            int r2 = r2 + r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.aD.W.b = r3
            int r2 = r2 % r0
            long[] r2 = r6.d
            int r3 = r6.e
            int r4 = -r8
            r5 = r3 & r4
            r3 = r3 ^ r4
            r3 = r3 | r5
            int r5 = r5 + r3
            r3 = r1 ^ 23
            r4 = r1 & 23
            r3 = r3 | r4
            int r3 = r3 << 1
            int r4 = ~r4
            r1 = r1 | 23
            r1 = r1 & r4
            int r1 = -r1
            r4 = r3 | r1
            int r4 = r4 << 1
            r1 = r1 ^ r3
            int r4 = r4 - r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.aD.W.b = r1
            int r4 = r4 % r0
            java.lang.System.arraycopy(r2, r8, r2, r7, r5)
            int r1 = r6.e
            int r7 = -r7
            r2 = r8 ^ r7
            r3 = r8 & r7
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = ~r3
            r7 = r7 | r8
            r7 = r7 & r3
            int r7 = -r7
            r8 = r2 ^ r7
            r7 = r7 & r2
            int r7 = r7 << 1
            int r8 = r8 + r7
            int r7 = -r8
            r8 = r1 & r7
            r7 = r7 | r1
            int r8 = r8 + r7
            r6.e = r8
            int r7 = ivas.gov.bisp.enumeration.aD.W.a
            int r7 = r7 + 57
            int r8 = r7 % 128
            ivas.gov.bisp.enumeration.aD.W.b = r8
            int r7 = r7 % r0
            int r7 = r6.modCount
            r8 = r7 & 1
            int r1 = ~r8
            r7 = r7 | 1
            r7 = r7 & r1
            int r8 = r8 << 1
            int r8 = ~r8
            int r7 = r7 - r8
            int r7 = r7 + (-1)
            r6.modCount = r7
            int r7 = ivas.gov.bisp.enumeration.aD.W.b
            r8 = r7 ^ 61
            r1 = r7 & 61
            r8 = r8 | r1
            int r8 = r8 << 1
            r1 = r7 & (-62)
            int r7 = ~r7
            r7 = r7 & 61
            r7 = r7 | r1
            int r7 = -r7
            r1 = r8 ^ r7
            r7 = r7 & r8
            int r7 = r7 << 1
            int r1 = r1 + r7
            int r7 = r1 % 128
            ivas.gov.bisp.enumeration.aD.W.a = r7
            int r1 = r1 % r0
            if (r1 == 0) goto Laa
            return
        Laa:
            r7 = 0
            throw r7
        Lac:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r8 = "toIndex < fromIndex"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.W.removeRange(int, int):void");
    }

    public final int size() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 50) + (i2 | 50)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.e;
        }
        throw null;
    }

    public final long h(int i) {
        long j;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 15;
        int i5 = -(-((i3 ^ 15) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            e(i);
            j = this.d[i];
            int i7 = 34 / 0;
        } else {
            e(i);
            j = this.d[i];
        }
        int i8 = a + 117;
        b = i8 % 128;
        int i9 = i8 % 2;
        return j;
    }

    public final int hashCode() {
        int i;
        long j;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 87;
        int i5 = ((i3 ^ 87) | i4) << 1;
        int i6 = -((i3 | 87) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2 != 0 ? 1 : 0;
        int i9 = 1;
        while (i8 < this.e) {
            int i10 = b;
            int i11 = ((i10 ^ 43) | (i10 & 43)) << 1;
            int i12 = -(((~i10) & 43) | (i10 & (-44)));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                i = i9 % 71;
                j = this.d[i8];
            } else {
                i = i9 * 31;
                j = this.d[i8];
            }
            int iC = R.c(j);
            i9 = ((i & iC) - (~(i | iC))) - 1;
            int i14 = ((i8 | 77) << 1) - (i8 ^ 77);
            i8 = (i14 ^ (-76)) + ((i14 & (-76)) << 1);
            int i15 = a;
            int i16 = ((i15 | 3) << 1) - (i15 ^ 3);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = a + 90;
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 8 / 0;
        }
        return i9;
    }

    public final Object get(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 25) | (i3 & 25)) << 1;
        int i5 = -(((~i3) & 25) | (i3 & (-26)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            e(i);
            Long.valueOf(this.d[i]);
            throw null;
        }
        e(i);
        Long lValueOf = Long.valueOf(this.d[i]);
        int i7 = a + 61;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return lValueOf;
        }
        throw null;
    }

    public W(long[] jArr, int i) {
        this.d = jArr;
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x007d  */
    /* JADX WARN: Code duplicated, block: B:15:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:16:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:20:0x0122  */
    /* JADX WARN: Code duplicated, block: B:21:0x0126  */
    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    public final void add(int i, Object obj) {
        int i2;
        int i3;
        long[] jArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = a;
        int i11 = (i10 & 103) + (i10 | 103);
        b = i11 % 128;
        int i12 = i11 % 2;
        long jLongValue = ((Long) obj).longValue();
        d();
        int i13 = a;
        int i14 = i13 + 84;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 67 / 0;
            if (i >= 0) {
                i2 = this.e;
                if (i <= i2) {
                    int i17 = (-2) - (((i13 & 122) + (i13 | 122)) ^ (-1));
                    i3 = i17 % 128;
                    b = i3;
                    int i18 = i17 % 2;
                    jArr = this.d;
                    if (i2 < jArr.length) {
                        int i19 = ((i3 ^ 59) - (~(-(-((i3 & 59) << 1))))) - 1;
                        a = i19 % 128;
                        int i20 = i19 % 2;
                        int i21 = ((i ^ 1) | (i & 1)) << 1;
                        int i22 = -((i & (-2)) | ((~i) & 1));
                        int i23 = (i21 & i22) + (i21 | i22);
                        int i24 = -i;
                        int i25 = i2 & i24;
                        System.arraycopy(jArr, i, jArr, i23, i25 + ((i24 ^ i2) | i25));
                        int i26 = b;
                        int i27 = (i26 & 109) + (i26 | 109);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                    } else {
                        long[] jArr2 = new long[ivas.gov.bisp.enumeration.p091n.j.C(i2, 3, 2, 1)];
                        int i29 = a;
                        int i30 = i29 & 3;
                        int i31 = ((i29 ^ 3) | i30) << 1;
                        int i32 = -((3 | i29) & (~i30));
                        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                        b = i33 % 128;
                        int i34 = i33 % 2;
                        System.arraycopy(jArr, 0, jArr2, 0, i);
                        long[] jArr3 = this.d;
                        int i35 = b;
                        int i36 = i35 & 39;
                        int i37 = (i35 ^ 39) | i36;
                        i4 = ((i36 | i37) << 1) - (i37 ^ i36);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            i5 = (-2) - ((((i | 1) << 1) - (i ^ 1)) ^ (-1));
                            i6 = this.e >> i;
                        } else {
                            int i38 = i & 1;
                            int i39 = -(-((i ^ 1) | i38));
                            i5 = (i38 | i39) + (i38 & i39);
                            int i40 = this.e;
                            int i41 = -i;
                            int i42 = i40 & i41;
                            i6 = (i42 - (~(-(-((i40 ^ i41) | i42))))) - 1;
                        }
                        System.arraycopy(jArr3, i, jArr2, i5, i6);
                        this.d = jArr2;
                        int i43 = a + 17;
                        b = i43 % 128;
                        int i44 = i43 % 2;
                    }
                    this.d[i] = jLongValue;
                    int i45 = this.e;
                    int i46 = a;
                    int i47 = (((i46 ^ 87) | (i46 & 87)) << 1) - (((~i46) & 87) | (i46 & (-88)));
                    b = i47 % 128;
                    int i48 = i47 % 2;
                    int i49 = i45 & 1;
                    this.e = (i49 - (~(-(-((i45 ^ 1) | i49))))) - 1;
                    i7 = ((AbstractList) this).modCount;
                    int i50 = b;
                    int i51 = i50 & 63;
                    int i52 = -(-((i50 ^ 63) | i51));
                    i8 = (i51 ^ i52) + ((i52 & i51) << 1);
                    a = i8 % 128;
                    if (i8 % 2 == 0) {
                        ((AbstractList) this).modCount = i7 >>> 1;
                    } else {
                        int i53 = (i7 | 1) << 1;
                        int i54 = -(((~i7) & 1) | (i7 & (-2)));
                        ((AbstractList) this).modCount = ((i53 | i54) << 1) - (i54 ^ i53);
                    }
                    int i55 = a;
                    int i56 = i55 & 69;
                    int i57 = ((((i55 ^ 69) | i56) << 1) - (~(-((i55 | 69) & (~i56))))) - 1;
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    return;
                }
            }
        } else if (i >= 0) {
            i2 = this.e;
            if (i <= i2) {
                int i110 = (-2) - (((i13 & 122) + (i13 | 122)) ^ (-1));
                i3 = i110 % 128;
                b = i3;
                int i111 = i110 % 2;
                jArr = this.d;
                if (i2 < jArr.length) {
                    int i112 = ((i3 ^ 59) - (~(-(-((i3 & 59) << 1))))) - 1;
                    a = i112 % 128;
                    int i210 = i112 % 2;
                    int i211 = ((i ^ 1) | (i & 1)) << 1;
                    int i212 = -((i & (-2)) | ((~i) & 1));
                    int i213 = (i211 & i212) + (i211 | i212);
                    int i214 = -i;
                    int i215 = i2 & i214;
                    System.arraycopy(jArr, i, jArr, i213, i215 + ((i214 ^ i2) | i215));
                    int i216 = b;
                    int i217 = (i216 & 109) + (i216 | 109);
                    a = i217 % 128;
                    int i218 = i217 % 2;
                } else {
                    long[] jArr4 = new long[ivas.gov.bisp.enumeration.p091n.j.C(i2, 3, 2, 1)];
                    int i219 = a;
                    int i310 = i219 & 3;
                    int i311 = ((i219 ^ 3) | i310) << 1;
                    int i312 = -((3 | i219) & (~i310));
                    int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                    b = i313 % 128;
                    int i314 = i313 % 2;
                    System.arraycopy(jArr, 0, jArr4, 0, i);
                    long[] jArr5 = this.d;
                    int i315 = b;
                    int i316 = i315 & 39;
                    int i317 = (i315 ^ 39) | i316;
                    i4 = ((i316 | i317) << 1) - (i317 ^ i316);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        i5 = (-2) - ((((i | 1) << 1) - (i ^ 1)) ^ (-1));
                        i6 = this.e >> i;
                    } else {
                        int i318 = i & 1;
                        int i319 = -(-((i ^ 1) | i318));
                        i5 = (i318 | i319) + (i318 & i319);
                        int i410 = this.e;
                        int i411 = -i;
                        int i412 = i410 & i411;
                        i6 = (i412 - (~(-(-((i410 ^ i411) | i412))))) - 1;
                    }
                    System.arraycopy(jArr5, i, jArr4, i5, i6);
                    this.d = jArr4;
                    int i413 = a + 17;
                    b = i413 % 128;
                    int i414 = i413 % 2;
                }
                this.d[i] = jLongValue;
                int i415 = this.e;
                int i416 = a;
                int i417 = (((i416 ^ 87) | (i416 & 87)) << 1) - (((~i416) & 87) | (i416 & (-88)));
                b = i417 % 128;
                int i418 = i417 % 2;
                int i419 = i415 & 1;
                this.e = (i419 - (~(-(-((i415 ^ 1) | i419))))) - 1;
                i7 = ((AbstractList) this).modCount;
                int i59 = b;
                int i510 = i59 & 63;
                int i511 = -(-((i59 ^ 63) | i510));
                i8 = (i510 ^ i511) + ((i511 & i510) << 1);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    ((AbstractList) this).modCount = i7 >>> 1;
                } else {
                    int i512 = (i7 | 1) << 1;
                    int i513 = -(((~i7) & 1) | (i7 & (-2)));
                    ((AbstractList) this).modCount = ((i512 | i513) << 1) - (i513 ^ i512);
                }
                int i514 = a;
                int i515 = i514 & 69;
                int i516 = ((((i514 ^ 69) | i515) << 1) - (~(-((i514 | 69) & (~i515))))) - 1;
                b = i516 % 128;
                int i517 = i516 % 2;
                return;
            }
        }
        throw new IndexOutOfBoundsException(i(i));
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-14)) | ((~i2) & 13)) + ((i2 & 13) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 69;
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = (-2) - (((i6 ^ 50) + ((i6 & 50) << 1)) ^ (-1));
            a = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(obj instanceof W)) {
            int i10 = i2 & 101;
            int i11 = (i2 | 101) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            boolean zEquals = super.equals(obj);
            int i15 = (-2) - ((a + 76) ^ (-1));
            b = i15 % 128;
            int i16 = i15 % 2;
            return zEquals;
        }
        W w = (W) obj;
        if (this.e != w.e) {
            int i17 = ((i2 ^ 55) | (i2 & 55)) << 1;
            int i18 = -((i2 & (-56)) | ((~i2) & 55));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i2 & 95;
            int i22 = (i21 - (~(-(-((i2 ^ 95) | i21))))) - 1;
            b = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 5 / 0;
            }
            return false;
        }
        long[] jArr = w.d;
        int i24 = ((i2 | 33) << 1) - (i2 ^ 33);
        b = i24 % 128;
        int i25 = i24 % 2;
        int i26 = 0;
        while (i26 < this.e) {
            int i27 = b;
            int i28 = i27 + 59;
            a = i28 % 128;
            if (i28 % 2 == 0) {
                long j = this.d[i26];
                long j2 = jArr[i26];
                throw null;
            }
            if (this.d[i26] != jArr[i26]) {
                int i29 = ((i27 ^ 69) | (i27 & 69)) << 1;
                int i30 = -((i27 & (-70)) | ((~i27) & 69));
                int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
                return false;
            }
            i26 = (((i26 | 2) << 1) - (i26 ^ 2)) - 1;
            int i33 = i27 + 89;
            a = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = b;
        int i36 = i35 & 109;
        int i37 = (i35 | 109) & (~i36);
        int i38 = i36 << 1;
        int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
        a = i39 % 128;
        int i40 = i39 % 2;
        return true;
    }

    public final void f(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = i3 + ((i2 ^ 123) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        d();
        int i6 = this.e;
        long[] jArr = this.d;
        int i7 = b;
        int i8 = i7 & 9;
        int i9 = (i7 | 9) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int length = jArr.length;
            throw null;
        }
        if (i6 == jArr.length) {
            long[] jArr2 = new long[ivas.gov.bisp.enumeration.p091n.j.C(i6, 3, 2, 1)];
            int i12 = b;
            int i13 = i12 & 53;
            int i14 = -(-((i12 ^ 53) | i13));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                System.arraycopy(jArr, 1, jArr2, 0, i6);
            } else {
                System.arraycopy(jArr, 0, jArr2, 0, i6);
            }
            this.d = jArr2;
        }
        long[] jArr3 = this.d;
        int i16 = this.e;
        int i17 = a;
        int i18 = (i17 & 31) + (i17 | 31);
        int i19 = i18 % 128;
        b = i19;
        if (i18 % 2 != 0) {
            this.e = i16;
            jArr3[i16] = j;
        } else {
            int i20 = i16 & 1;
            this.e = (i20 - (~(-(-((i16 ^ 1) | i20))))) - 1;
            jArr3[i16] = j;
        }
        int i21 = ((i19 & 88) + (i19 | 88)) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    public final Object set(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 64) << 1) - (i3 ^ 64);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        long jLongValue = ((Long) obj).longValue();
        d();
        int i7 = a;
        int i8 = (i7 & 27) + (i7 | 27);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            e(i);
            long j = this.d[i];
            throw null;
        }
        e(i);
        long[] jArr = this.d;
        long j2 = jArr[i];
        jArr[i] = jLongValue;
        Long lValueOf = Long.valueOf(j2);
        int i9 = b + 11;
        a = i9 % 128;
        int i10 = i9 % 2;
        return lValueOf;
    }

    public final boolean remove(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-122)) | ((~i2) & 121);
        int i4 = (i2 & 121) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        d();
        int i7 = i6 != 0 ? 1 : 0;
        int i8 = b;
        int i9 = (i8 ^ 87) + ((i8 & 87) << 1);
        a = i9 % 128;
        while (true) {
            int i10 = i9 % 2;
            Object obj2 = null;
            if (i7 >= this.e) {
                int i11 = b;
                int i12 = ((i11 & 10) + (i11 | 10)) - 1;
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            int i13 = a;
            int i14 = i13 & 71;
            int i15 = ((i13 | 71) & (~i14)) + (i14 << 1);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                obj.equals(Long.valueOf(this.d[i7]));
                obj2.hashCode();
                throw null;
            }
            if (!(!obj.equals(Long.valueOf(this.d[i7])))) {
                long[] jArr = this.d;
                int i16 = i7 & 1;
                int i17 = this.e;
                int i18 = a;
                int i19 = i18 & 125;
                int i20 = (((i18 | 125) & (~i19)) - (~(i19 << 1))) - 1;
                b = i20 % 128;
                int i21 = i20 % 2;
                int i22 = -i7;
                int i23 = i17 & i22;
                int i24 = -(-((i17 ^ i22) | i23));
                System.arraycopy(jArr, i16 + ((i7 ^ 1) | i16), jArr, i7, (-2) - ((((i23 | i24) << 1) - (i24 ^ i23)) ^ (-1)));
                this.e = (-2) - (this.e ^ (-1));
                int i25 = a;
                int i26 = ((i25 ^ 102) + ((i25 & 102) << 1)) - 1;
                b = i26 % 128;
                int i27 = i26 % 2;
                int i28 = ((AbstractList) this).modCount;
                if (i27 != 0) {
                    ((AbstractList) this).modCount = i28 >> 1;
                } else {
                    int i29 = (i28 | 1) << 1;
                    int i30 = -(i28 ^ 1);
                    ((AbstractList) this).modCount = (i29 ^ i30) + ((i30 & i29) << 1);
                }
                return true;
            }
            i7++;
            int i31 = a;
            i9 = ((i31 & (-24)) | ((~i31) & 23)) + ((i31 & 23) << 1);
            b = i9 % 128;
        }
    }

    public final Object remove(int i) {
        long[] jArr;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a + 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            d();
            e(i);
            jArr = this.d;
            int i6 = 23 / 0;
        } else {
            d();
            e(i);
            jArr = this.d;
        }
        long j = jArr[i];
        int i7 = this.e;
        if (i < ((i7 ^ (-1)) - (~(i7 << 1))) - 1) {
            int i8 = b;
            int i9 = i8 + 53;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                i2 = i % 1;
                i3 = (i7 * i) % 1;
            } else {
                i2 = ((((i ^ 1) | (i & 1)) << 1) - (~(-((i & (-2)) | ((~i) & 1))))) - 1;
                int i10 = -i;
                int i11 = (((~i10) & i7) | ((~i7) & i10)) + ((i7 & i10) << 1);
                int i12 = -(-((i11 ^ (-1)) | i11));
                i3 = ((i12 & i11) << 1) + (i11 ^ i12);
            }
            int i13 = i8 & 61;
            int i14 = (((i8 ^ 61) | i13) << 1) - ((i8 | 61) & (~i13));
            a = i14 % 128;
            int i15 = i14 % 2;
            System.arraycopy(jArr, i2, jArr, i, i3);
            int i16 = b;
            int i17 = (i16 ^ 22) + ((i16 & 22) << 1);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        this.e--;
        int i20 = ((AbstractList) this).modCount;
        int i21 = a;
        int i22 = i21 & 23;
        int i23 = (i22 - (~((i21 ^ 23) | i22))) - 1;
        b = i23 % 128;
        if (i23 % 2 != 0) {
            ((AbstractList) this).modCount = i20 << 1;
        } else {
            int i24 = i20 ^ 1;
            int i25 = -(-((i20 & 1) << 1));
            ((AbstractList) this).modCount = (i24 & i25) + (i25 | i24);
        }
        return Long.valueOf(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        r10 = (ivas.gov.bisp.enumeration.aD.W) r10;
        r2 = r10.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (r2 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        r10 = r3 ^ 89;
        r2 = -(-((r3 & 89) << 1));
        r5 = (r10 ^ r2) + ((r10 & r2) << 1);
        ivas.gov.bisp.enumeration.aD.W.b = r5 % 128;
        r5 = r5 % 2;
        r3 = r3 + 119;
        ivas.gov.bisp.enumeration.aD.W.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        r5 = r9.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if ((2147483646 - (~(-r5))) < r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        r6 = r3 & 81;
        r6 = r6 + ((r3 ^ 81) | r6);
        ivas.gov.bisp.enumeration.aD.W.b = r6 % 128;
        r6 = r6 % 2;
        r2 = -(-r2);
        r6 = r5 & r2;
        r2 = -(-((r2 ^ r5) | r6));
        r5 = (r6 & r2) + (r2 | r6);
        r2 = r9.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (r5 <= r2.length) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r3 = r3 + 35;
        ivas.gov.bisp.enumeration.aD.W.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        if ((r3 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        r9.d = java.util.Arrays.copyOf(r2, r5);
        r2 = ivas.gov.bisp.enumeration.aD.W.b;
        r3 = (r2 & 59) + (r2 | 59);
        ivas.gov.bisp.enumeration.aD.W.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        r9.d = java.util.Arrays.copyOf(r2, r5);
        r10 = null;
        r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        r2 = r10.d;
        r3 = r9.d;
        r6 = r9.e;
        r7 = ivas.gov.bisp.enumeration.aD.W.a;
        r8 = (r7 & 59) + (r7 | 59);
        ivas.gov.bisp.enumeration.aD.W.b = r8 % 128;
        r8 = r8 % 2;
        java.lang.System.arraycopy(r2, 0, r3, r6, r10.e);
        r9.e = r5;
        r10 = ivas.gov.bisp.enumeration.aD.W.a;
        r2 = (r10 ^ 89) + ((r10 & 89) << 1);
        ivas.gov.bisp.enumeration.aD.W.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:
    
        if ((r2 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        ((java.util.AbstractList) r9).modCount >>>= 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        r10 = ((java.util.AbstractList) r9).modCount;
        ((java.util.AbstractList) r9).modCount = ((r10 | 1) << 1) - (((~r10) & 1) | (r10 & (-2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.W.b;
        r2 = ((r10 ^ 124) + ((r10 & 124) << 1)) - 1;
        ivas.gov.bisp.enumeration.aD.W.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0103, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0109, code lost:
    
        throw new java.lang.OutOfMemoryError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.aD.W) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.aD.W) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r10 = super.addAll(r10);
        r2 = ivas.gov.bisp.enumeration.aD.W.b;
        r3 = (r2 & 116) + (r2 | 116);
        r2 = (r3 ^ (-1)) + (r3 << 1);
        ivas.gov.bisp.enumeration.aD.W.a = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean addAll(java.util.Collection<? extends java.lang.Long> r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.W.addAll(java.util.Collection):boolean");
    }

    public final boolean add(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 & 88) + (i2 | 88)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            f(((Long) obj).longValue());
            int i4 = 50 / 0;
        } else {
            f(((Long) obj).longValue());
        }
        int i5 = a;
        int i6 = (i5 & (-56)) | ((~i5) & 55);
        int i7 = -(-((i5 & 55) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }
}
