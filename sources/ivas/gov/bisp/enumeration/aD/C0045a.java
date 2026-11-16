package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooO0OO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0045a extends OooO0OO<Double> implements RandomAccess, af {
    private static int a = 0;
    private static int b = 1;
    public double[] d;
    public int e;

    static {
        new C0045a(new double[0], 0).c = false;
        int i = a;
        int i2 = i ^ 47;
        int i3 = ((i & 47) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public C0045a() {
        this.d = new double[10];
        this.e = 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r5 < r4.e) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r5 < r4.e) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r5 = ((r1 & 3) - (~(-(-(r1 | 3))))) - 1;
        ivas.gov.bisp.enumeration.aD.C0045a.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if ((r5 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r5 = 99 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.C0045a.b
            r2 = r1 | 41
            int r3 = r2 << 1
            r1 = r1 & 41
            int r1 = ~r1
            r1 = r1 & r2
            int r1 = -r1
            r2 = r3 & r1
            r1 = r1 | r3
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.aD.C0045a.a = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L20
            r2 = 53
            int r2 = r2 / 0
            if (r5 < 0) goto L54
            goto L22
        L20:
            if (r5 < 0) goto L54
        L22:
            r2 = r1 ^ 58
            r3 = r1 & 58
            int r3 = r3 << 1
            int r2 = r2 + r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.aD.C0045a.b = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L3a
            int r2 = r4.e
            r3 = 2
            int r3 = r3 / 0
            if (r5 >= r2) goto L54
            goto L3e
        L3a:
            int r2 = r4.e
            if (r5 >= r2) goto L54
        L3e:
            r5 = r1 & 3
            r1 = r1 | 3
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r5 = r5 - r1
            int r5 = r5 + (-1)
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.aD.C0045a.b = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L53
            r5 = 99
            int r5 = r5 / 0
        L53:
            return
        L54:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = r4.h(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0045a.e(int):void");
    }

    public final String h(int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i3 = b + 73;
        a = i3 % 128;
        int i4 = i3 % 2;
        sb.append("Index:");
        sb.append(i);
        int i5 = a;
        int i6 = (i5 & (-38)) | ((~i5) & 37);
        int i7 = (i5 & 37) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        sb.append(", Size:");
        int i10 = this.e;
        int i11 = b;
        int i12 = i11 & 85;
        int i13 = (i11 | 85) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            sb.append(i10);
            return sb.toString();
        }
        sb.append(i10);
        sb.toString();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 55) << 1;
        int i4 = -(((~i2) & 55) | (i2 & (-56)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = ((i6 ^ 7) | (i6 & 7)) << 1;
        int i9 = -(((~i6) & 7) | (i6 & (-8)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 3 / 2;
        }
        int i12 = 0;
        int i13 = 1;
        while (i12 < this.e) {
            int i14 = b + 29;
            a = i14 % 128;
            int i15 = i14 % 2;
            long jDoubleToLongBits = Double.doubleToLongBits(this.d[i12]);
            int i16 = a;
            int i17 = (i16 ^ 63) + ((i16 & 63) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i13 * 31;
            int i20 = -(-R.c(jDoubleToLongBits));
            int i21 = i19 & i20;
            int i22 = ((i19 ^ i20) | i21) << 1;
            int i23 = -((i19 | i20) & (~i21));
            i13 = (i23 | i22) + (i22 & i23);
            int i24 = ((i12 & (-110)) + (i12 | (-110))) - 1;
            int i25 = i24 & 112;
            i12 = ((((i24 ^ 112) | i25) << 1) - (~(-((i24 | 112) & (~i25))))) - 1;
            int i26 = b;
            int i27 = i26 ^ 119;
            int i28 = (((i26 & 119) | i27) << 1) - i27;
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = b;
        int i31 = i30 & 3;
        int i32 = (i30 ^ 3) | i31;
        int i33 = (i31 & i32) + (i32 | i31);
        a = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 95 / 0;
        }
        return i13;
    }

    public final int size() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 65) << 1) - ((i2 & (-66)) | ((~i2) & 65));
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.e;
        int i6 = (i2 & 57) + (i2 | 57);
        a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:24:0x013e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0144  */
    public final void add(int i, Object obj) {
        double dDoubleValue;
        int i2;
        int i3;
        int i4;
        double[] dArr;
        double[] dArr2;
        double[] dArr3;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = ((i9 | 13) << 1) - (i9 ^ 13);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            dDoubleValue = ((Double) obj).doubleValue();
            d();
            int i11 = 63 / 0;
        } else {
            dDoubleValue = ((Double) obj).doubleValue();
            d();
        }
        int i12 = a;
        int i13 = i12 & 63;
        int i14 = (i12 | 63) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        int i17 = i16 % 128;
        b = i17;
        if (i16 % 2 == 0) {
            int i18 = 96 / 0;
            if (i >= 0) {
                int i19 = i17 ^ 121;
                int i20 = ((((i17 & 121) | i19) << 1) - (~(-i19))) - 1;
                a = i20 % 128;
                int i21 = i20 % 2;
                i2 = this.e;
                if (i <= i2) {
                    i3 = (((i17 & (-98)) | ((~i17) & 97)) - (~(-(-((i17 & 97) << 1))))) - 1;
                    i4 = i3 % 128;
                    a = i4;
                    if (i3 % 2 == 0) {
                        int length = this.d.length;
                        throw null;
                    }
                    dArr = this.d;
                    if (i2 < dArr.length) {
                        int i22 = i4 & 69;
                        int i23 = -(-((i4 ^ 69) | i22));
                        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        int i26 = (i | 1) << 1;
                        int i27 = -((i & (-2)) | ((~i) & 1));
                        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                        int i29 = -i;
                        int i30 = i2 & i29;
                        int i31 = ((i2 ^ i29) | i30) << 1;
                        int i32 = -((i29 | i2) & (~i30));
                        System.arraycopy(dArr, i, dArr, i28, ((i31 | i32) << 1) - (i32 ^ i31));
                        int i33 = b;
                        int i34 = ((i33 | 73) << 1) - (i33 ^ 73);
                        a = i34 % 128;
                        int i35 = i34 % 2;
                    } else {
                        dArr2 = new double[ivas.gov.bisp.enumeration.p091n.j.C(i2, 3, 2, 1)];
                        int i36 = a + 45;
                        b = i36 % 128;
                        int i37 = i36 % 2;
                        System.arraycopy(dArr, 0, dArr2, 0, i);
                        dArr3 = this.d;
                        int i38 = a;
                        int i39 = i38 & 69;
                        int i40 = ((((i38 ^ 69) | i39) << 1) - (~(-((~i39) & (i38 | 69))))) - 1;
                        b = i40 % 128;
                        int i41 = i40 % 2;
                        i5 = (i ^ 1) + ((i & 1) << 1);
                        int i42 = this.e;
                        int i43 = -(~(-i));
                        i6 = ((i42 & i43) + (i42 | i43)) - 1;
                        int i44 = i38 & 95;
                        i7 = i44 + ((i38 ^ 95) | i44);
                        b = i7 % 128;
                        if (i7 % 2 != 0) {
                            System.arraycopy(dArr3, i, dArr2, i5, i6);
                            this.d = dArr2;
                            throw null;
                        }
                        System.arraycopy(dArr3, i, dArr2, i5, i6);
                        this.d = dArr2;
                    }
                    this.d[i] = dDoubleValue;
                    int i45 = this.e;
                    int i46 = i45 & 1;
                    int i47 = (i45 | 1) & (~i46);
                    int i48 = i46 << 1;
                    int i49 = (i47 & i48) + (i47 | i48);
                    int i50 = a;
                    int i51 = i50 & 45;
                    int i52 = ((i50 ^ 45) | i51) << 1;
                    int i53 = -((i50 | 45) & (~i51));
                    int i54 = (i52 & i53) + (i53 | i52);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                    this.e = i49;
                    ((AbstractList) this).modCount++;
                    int i56 = b;
                    int i57 = i56 & 65;
                    int i58 = ((i56 | 65) & (~i57)) + (i57 << 1);
                    a = i58 % 128;
                    int i59 = i58 % 2;
                    return;
                }
            }
        } else if (i >= 0) {
            int i110 = i17 ^ 121;
            int i210 = ((((i17 & 121) | i110) << 1) - (~(-i110))) - 1;
            a = i210 % 128;
            int i211 = i210 % 2;
            i2 = this.e;
            if (i <= i2) {
                i3 = (((i17 & (-98)) | ((~i17) & 97)) - (~(-(-((i17 & 97) << 1))))) - 1;
                i4 = i3 % 128;
                a = i4;
                if (i3 % 2 == 0) {
                    int length2 = this.d.length;
                    throw null;
                }
                dArr = this.d;
                if (i2 < dArr.length) {
                    int i212 = i4 & 69;
                    int i213 = -(-((i4 ^ 69) | i212));
                    int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
                    b = i214 % 128;
                    int i215 = i214 % 2;
                    int i216 = (i | 1) << 1;
                    int i217 = -((i & (-2)) | ((~i) & 1));
                    int i218 = ((i216 | i217) << 1) - (i216 ^ i217);
                    int i219 = -i;
                    int i310 = i2 & i219;
                    int i311 = ((i2 ^ i219) | i310) << 1;
                    int i312 = -((i219 | i2) & (~i310));
                    System.arraycopy(dArr, i, dArr, i218, ((i311 | i312) << 1) - (i312 ^ i311));
                    int i313 = b;
                    int i314 = ((i313 | 73) << 1) - (i313 ^ 73);
                    a = i314 % 128;
                    int i315 = i314 % 2;
                } else {
                    dArr2 = new double[ivas.gov.bisp.enumeration.p091n.j.C(i2, 3, 2, 1)];
                    int i316 = a + 45;
                    b = i316 % 128;
                    int i317 = i316 % 2;
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    dArr3 = this.d;
                    int i318 = a;
                    int i319 = i318 & 69;
                    int i410 = ((((i318 ^ 69) | i319) << 1) - (~(-((~i319) & (i318 | 69))))) - 1;
                    b = i410 % 128;
                    int i411 = i410 % 2;
                    i5 = (i ^ 1) + ((i & 1) << 1);
                    int i412 = this.e;
                    int i413 = -(~(-i));
                    i6 = ((i412 & i413) + (i412 | i413)) - 1;
                    int i414 = i318 & 95;
                    i7 = i414 + ((i318 ^ 95) | i414);
                    b = i7 % 128;
                    if (i7 % 2 != 0) {
                        System.arraycopy(dArr3, i, dArr2, i5, i6);
                        this.d = dArr2;
                        throw null;
                    }
                    System.arraycopy(dArr3, i, dArr2, i5, i6);
                    this.d = dArr2;
                }
                this.d[i] = dDoubleValue;
                int i415 = this.e;
                int i416 = i415 & 1;
                int i417 = (i415 | 1) & (~i416);
                int i418 = i416 << 1;
                int i419 = (i417 & i418) + (i417 | i418);
                int i510 = a;
                int i511 = i510 & 45;
                int i512 = ((i510 ^ 45) | i511) << 1;
                int i513 = -((i510 | 45) & (~i511));
                int i514 = (i512 & i513) + (i513 | i512);
                b = i514 % 128;
                int i515 = i514 % 2;
                this.e = i419;
                ((AbstractList) this).modCount++;
                int i516 = b;
                int i517 = i516 & 65;
                int i518 = ((i516 | 65) & (~i517)) + (i517 << 1);
                a = i518 % 128;
                int i519 = i518 % 2;
                return;
            }
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    public final R.biN g(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 35) + ((i3 & 35) << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i < this.e) {
            throw new IllegalArgumentException();
        }
        C0045a c0045a = new C0045a(Arrays.copyOf(this.d, i), this.e);
        int i5 = b;
        int i6 = ((i5 ^ 85) | (i5 & 85)) << 1;
        int i7 = -(((~i5) & 85) | (i5 & (-86)));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return c0045a;
    }

    public final Object get(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-82)) | ((~i3) & 81);
        int i5 = (i3 & 81) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            e(i);
            Double.valueOf(this.d[i]);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        e(i);
        Double dValueOf = Double.valueOf(this.d[i]);
        int i7 = b;
        int i8 = i7 & 39;
        int i9 = (i7 | 39) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        return dValueOf;
    }

    public final boolean remove(Object obj) {
        double[] dArr;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 3) + ((i3 & 3) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        d();
        int i6 = b;
        int i7 = i6 & 13;
        int i8 = i6 | 13;
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < this.e) {
            int i12 = a + 61;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                obj.equals(Double.valueOf(this.d[i11]));
                throw null;
            }
            if (!(!obj.equals(Double.valueOf(this.d[i11])))) {
                int i13 = b;
                int i14 = i13 & 95;
                int i15 = (i13 ^ 95) | i14;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    dArr = this.d;
                    i = i11;
                } else {
                    dArr = this.d;
                    int i17 = i11 & 1;
                    int i18 = (i11 ^ 1) | i17;
                    i = (i17 & i18) + (i17 | i18);
                }
                int i19 = this.e;
                int i20 = -i11;
                int i21 = i19 & i20;
                int i22 = -(-(i19 | i20));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = ~i23;
                int i25 = -(-(i23 << 1));
                System.arraycopy(dArr, i, dArr, i11, (i24 & i25) + (i24 | i25));
                int i26 = b;
                int i27 = i26 ^ 55;
                int i28 = (((i26 & 55) | i27) << 1) - i27;
                a = i28 % 128;
                if (i28 % 2 != 0) {
                    this.e = this.e;
                } else {
                    int i29 = this.e;
                    int i30 = i29 ^ (-1);
                    int i31 = (i29 | i30) << 1;
                    int i32 = -i30;
                    this.e = ((i31 | i32) << 1) - (i31 ^ i32);
                }
                int i33 = ((AbstractList) this).modCount;
                int i34 = a;
                int i35 = i34 & 119;
                int i36 = -(-(i34 | 119));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                b = i37 % 128;
                if (i37 % 2 == 0) {
                    ((AbstractList) this).modCount = i33 >>> 1;
                } else {
                    ((AbstractList) this).modCount = ((i33 | 1) << 1) - (i33 ^ 1);
                }
                return true;
            }
            int i38 = (i11 & (-62)) | ((~i11) & 61);
            int i39 = (i11 & 61) << 1;
            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
            int i41 = i40 & (-60);
            i11 = (((~i41) & (i40 | (-60))) - (~(i41 << 1))) - 1;
            int i42 = a;
            int i43 = i42 & 27;
            int i44 = ((i42 | 27) & (~i43)) + (i43 << 1);
            b = i44 % 128;
            int i45 = i44 % 2;
        }
        int i46 = b;
        int i47 = i46 & 13;
        int i48 = (i47 - (~(-(-((i46 ^ 13) | i47))))) - 1;
        a = i48 % 128;
        int i49 = i48 % 2;
        return false;
    }

    public C0045a(double[] dArr, int i) {
        this.d = dArr;
        this.e = i;
    }

    public final void f(double d) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 15) - (~((i2 & 15) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        d();
        int i5 = this.e;
        double[] dArr = this.d;
        int i6 = b;
        int i7 = i6 + 119;
        a = i7 % 128;
        int i8 = i7 % 2;
        if (i5 == dArr.length) {
            int i9 = (i6 & (-48)) | ((~i6) & 47);
            int i10 = -(-((i6 & 47) << 1));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            double[] dArr2 = new double[ivas.gov.bisp.enumeration.p091n.j.C(i5, 3, 2, 1)];
            int i13 = a;
            int i14 = ((i13 ^ 76) + ((i13 & 76) << 1)) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            System.arraycopy(dArr, 0, dArr2, 0, i5);
            this.d = dArr2;
            int i16 = b;
            int i17 = (i16 & 33) + (i16 | 33);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        double[] dArr3 = this.d;
        int i19 = this.e;
        int i20 = b;
        int i21 = (((i20 | 80) << 1) - (i20 ^ 80)) - 1;
        int i22 = i21 % 128;
        a = i22;
        if (i21 % 2 != 0) {
            this.e = (((i19 | 1) << 1) - (i19 ^ 1)) - 1;
            dArr3[i19] = d;
        } else {
            int i23 = (i19 & 2) + (i19 | 2);
            this.e = (i23 ^ (-1)) + (i23 << 1);
            dArr3[i19] = d;
        }
        int i24 = (i22 ^ 107) + ((i22 & 107) << 1);
        b = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 43 / 0;
        }
    }

    public final void removeRange(int i, int i2) {
        double[] dArr;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 113;
        int i7 = (((i5 | 113) & (~i6)) - (~(i6 << 1))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int i9 = a + 25;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            dArr = this.d;
            i3 = this.e;
            int i10 = 45 / 0;
        } else {
            dArr = this.d;
            i3 = this.e;
        }
        int i11 = -i2;
        int i12 = ((~i11) & i3) | ((~i3) & i11);
        int i13 = (i3 & i11) << 1;
        System.arraycopy(dArr, i2, dArr, i, ((i12 | i13) << 1) - (i13 ^ i12));
        int i14 = this.e;
        int i15 = -i;
        int i16 = i2 & i15;
        int i17 = (i15 | i2) & (~i16);
        int i18 = i16 << 1;
        int i19 = -((i17 & i18) + (i17 | i18));
        this.e = (((~i19) & i14) | ((~i14) & i19)) + ((i19 & i14) << 1);
        int i20 = b;
        int i21 = i20 & 63;
        int i22 = (i20 | 63) & (~i21);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            ((AbstractList) this).modCount = ((AbstractList) this).modCount;
        } else {
            int i25 = ((AbstractList) this).modCount;
            ((AbstractList) this).modCount = (i25 & 1) + (i25 | 1);
        }
        int i26 = a;
        int i27 = ((i26 & 9) - (~(i26 | 9))) - 1;
        b = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 86 / 0;
        }
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 117) | (i2 & 117)) << 1) - ((i2 & (-118)) | ((~i2) & 117));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 & 49;
            int i7 = ((~i6) & (i4 | 49)) + (i6 << 1);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 77;
            a = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (!(obj instanceof C0045a)) {
            int i12 = ((i4 | 5) << 1) - (i4 ^ 5);
            b = i12 % 128;
            int i13 = i12 % 2;
            boolean zEquals = super.equals(obj);
            int i14 = b;
            int i15 = (i14 ^ 31) + ((i14 & 31) << 1);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                return zEquals;
            }
            throw null;
        }
        C0045a c0045a = (C0045a) obj;
        if (this.e != c0045a.e) {
            int i16 = (i4 & (-120)) | ((~i4) & 119);
            int i17 = (i4 & 119) << 1;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i4 ^ 87;
            int i21 = -(-((i4 & 87) << 1));
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                return false;
            }
            throw null;
        }
        double[] dArr = c0045a.d;
        int i23 = i2 & 35;
        int i24 = (i2 ^ 35) | i23;
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        int i26 = i25 % 2;
        int i27 = 0;
        while (true) {
            if (i27 >= this.e) {
                int i28 = a;
                int i29 = i28 & 71;
                int i30 = i28 | 71;
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
                return true;
            }
            int i33 = a;
            int i34 = i33 & 115;
            int i35 = -(-((i33 ^ 115) | i34));
            int i36 = (i34 & i35) + (i35 | i34);
            b = i36 % 128;
            if (i36 % 2 == 0) {
                int i37 = 89 / 0;
                if (Double.doubleToLongBits(this.d[i27]) != Double.doubleToLongBits(dArr[i27])) {
                    break;
                }
                int i38 = (((i27 ^ (-7)) | (i27 & (-7))) << 1) - (((~i27) & (-7)) | (i27 & 6));
                int i39 = ((i38 ^ 8) | (i38 & 8)) << 1;
                int i40 = -(((~i38) & 8) | (i38 & (-9)));
                i27 = ((i39 | i40) << 1) - (i39 ^ i40);
                int i41 = b + 37;
                a = i41 % 128;
                int i42 = i41 % 2;
            } else {
                if (Double.doubleToLongBits(this.d[i27]) != Double.doubleToLongBits(dArr[i27])) {
                    break;
                }
                int i310 = (((i27 ^ (-7)) | (i27 & (-7))) << 1) - (((~i27) & (-7)) | (i27 & 6));
                int i311 = ((i310 ^ 8) | (i310 & 8)) << 1;
                int i43 = -(((~i310) & 8) | (i310 & (-9)));
                i27 = ((i311 | i43) << 1) - (i311 ^ i43);
                int i44 = b + 37;
                a = i44 % 128;
                int i45 = i44 % 2;
            }
        }
        int i46 = b;
        int i47 = ((i46 ^ 68) + ((i46 & 68) << 1)) - 1;
        a = i47 % 128;
        return !(i47 % 2 == 0);
    }

    public final Object set(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-20)) | ((~i3) & 19)) + ((i3 & 19) << 1);
        b = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            ((Double) obj).doubleValue();
            d();
            obj2.hashCode();
            throw null;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        int i5 = b + 59;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            e(i);
            double d = this.d[i];
            throw null;
        }
        e(i);
        double[] dArr = this.d;
        double d2 = dArr[i];
        dArr[i] = dDoubleValue;
        Double dValueOf = Double.valueOf(d2);
        int i6 = b;
        int i7 = ((i6 ^ 59) | (i6 & 59)) << 1;
        int i8 = -(((~i6) & 59) | (i6 & (-60)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return dValueOf;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = ((i2 | 35) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            d();
            Charset charset = R.c;
            Objects.requireNonNull(collection);
            throw null;
        }
        d();
        Charset charset2 = R.c;
        Objects.requireNonNull(collection);
        int i5 = a;
        int i6 = i5 + 11;
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (!(collection instanceof C0045a)) {
            int i9 = i7 + 9;
            a = i9 % 128;
            int i10 = i9 % 2;
            boolean zAddAll = super.addAll(collection);
            int i11 = a;
            int i12 = i11 & 99;
            int i13 = -(-((i11 ^ 99) | i12));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            return zAddAll;
        }
        C0045a c0045a = (C0045a) collection;
        int i16 = c0045a.e;
        if (i16 == 0) {
            int i17 = ((i5 | 65) << 1) - (i5 ^ 65);
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i5 & 53;
            int i20 = ((((i5 ^ 53) | i19) << 1) - (~(-((i5 | 53) & (~i19))))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
            return false;
        }
        int i22 = this.e;
        if (2147483645 - (~(-(~(-i22)))) < i16) {
            throw new OutOfMemoryError();
        }
        int i23 = (i7 & (-94)) | ((~i7) & 93);
        int i24 = -(-((i7 & 93) << 1));
        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
        a = i25 % 128;
        int i26 = i25 % 2;
        int i27 = ((~i16) & i22) | ((~i22) & i16);
        int i28 = -(-((i22 & i16) << 1));
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        double[] dArr = this.d;
        if (i29 > dArr.length) {
            int i30 = i7 & 27;
            int i31 = (i7 | 27) & (~i30);
            int i32 = -(-(i30 << 1));
            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
            a = i33 % 128;
            if (i33 % 2 != 0) {
                this.d = Arrays.copyOf(dArr, i29);
                throw null;
            }
            this.d = Arrays.copyOf(dArr, i29);
        }
        double[] dArr2 = c0045a.d;
        double[] dArr3 = this.d;
        int i34 = this.e;
        int i35 = a + 39;
        b = i35 % 128;
        int i36 = i35 % 2;
        System.arraycopy(dArr2, 0, dArr3, i34, c0045a.e);
        this.e = i29;
        int i37 = ((AbstractList) this).modCount;
        int i38 = a;
        int i39 = i38 & 37;
        int i40 = -(-(i38 | 37));
        int i41 = (i39 & i40) + (i40 | i39);
        b = i41 % 128;
        if (i41 % 2 == 0) {
            ((AbstractList) this).modCount = i37 >>> 1;
            return false;
        }
        int i42 = ((i37 | 2) << 1) - (i37 ^ 2);
        ((AbstractList) this).modCount = (i42 ^ (-1)) + (i42 << 1);
        return true;
    }

    public final Object remove(int i) {
        int i2 = 2 % 2;
        int i3 = a + 29;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            d();
            e(i);
            obj.hashCode();
            throw null;
        }
        d();
        e(i);
        double[] dArr = this.d;
        int i4 = a;
        int i5 = i4 & 123;
        int i6 = i4 | 123;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        double d = dArr[i];
        int i10 = this.e;
        int i11 = i8 & 11;
        int i12 = i11 + ((i8 ^ 11) | i11);
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        int i15 = (i10 ^ (-1)) | i10;
        if (i < (i10 ^ i15) + ((i15 & i10) << 1)) {
            int i16 = ((i13 & 78) + (i13 | 78)) - 1;
            int i17 = i16 % 128;
            b = i17;
            int i18 = i16 % 2;
            int i19 = ((i & (-2)) | ((~i) & 1)) + ((i & 1) << 1);
            int i20 = -i;
            int i21 = (i10 ^ i20) + ((i10 & i20) << 1);
            int i22 = (i17 & 42) + (i17 | 42);
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            System.arraycopy(dArr, i19, dArr, i, (~i21) + (i21 << 1));
            int i25 = a;
            int i26 = i25 & 7;
            int i27 = ((i25 ^ 7) | i26) << 1;
            int i28 = -((i25 | 7) & (~i26));
            int i29 = (i27 & i28) + (i28 | i27);
            b = i29 % 128;
            if (i29 % 2 == 0) {
                int i30 = 5 % 5;
            }
        }
        int i31 = this.e;
        this.e = (i31 ^ (-1)) + (i31 << 1);
        int i32 = b;
        int i33 = (i32 & 89) + (i32 | 89);
        a = i33 % 128;
        if (i33 % 2 != 0) {
            ((AbstractList) this).modCount >>= 1;
        } else {
            int i34 = ((AbstractList) this).modCount;
            int i35 = i34 & 1;
            int i36 = -(-((i34 ^ 1) | i35));
            ((AbstractList) this).modCount = (i35 & i36) + (i36 | i35);
        }
        int i37 = b;
        int i38 = i37 & 67;
        int i39 = (i37 | 67) & (~i38);
        int i40 = i38 << 1;
        int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
        a = i41 % 128;
        if (i41 % 2 == 0) {
            return Double.valueOf(d);
        }
        Double.valueOf(d);
        throw null;
    }

    public final boolean add(Object obj) {
        int i = 2 % 2;
        int i2 = a + 47;
        b = i2 % 128;
        f((i2 % 2 == 0 ? (Double) obj : (Double) obj).doubleValue());
        return true;
    }
}
