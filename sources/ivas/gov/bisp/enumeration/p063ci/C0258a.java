package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.e;
import ivas.gov.bisp.enumeration.p064cj.i;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.r;
import ivas.gov.bisp.enumeration.p086i.a;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0258a extends O {
    private static int a = 1;
    private static int b;
    public final byte[] c;
    public final int d;

    public C0258a(long j) {
        this.c = BigInteger.valueOf(j).toByteArray();
        this.d = 0;
    }

    public C0258a(BigInteger bigInteger) {
        this.c = bigInteger.toByteArray();
        this.d = 0;
    }

    public C0258a(byte[] bArr, boolean z) {
        byte[] bArrC;
        if (r(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        if (!z) {
            int i = b;
            int i2 = (((i | 112) << 1) - (i ^ 112)) - 1;
            a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            bArrC = bArr;
        } else {
            int i5 = b;
            int i6 = i5 & 15;
            int i7 = ((i5 | 15) & (~i6)) + (i6 << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                j.c(bArr);
                throw null;
            }
            bArrC = j.c(bArr);
            int i8 = 2 % 2;
        }
        this.c = bArrC;
        this.d = s(bArr);
        int i9 = a;
        int i10 = (i9 ^ 69) + ((i9 & 69) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public static C0258a p(Object obj) {
        int i;
        C0258a c0258a;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((((i4 ^ 101) | (i4 & 101)) << 1) - (~(-((i4 & (-102)) | ((~i4) & 101))))) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
            if (obj != null) {
                if (!(obj instanceof C0258a)) {
                    int i7 = i4 & 99;
                    i = (((i4 ^ 99) | i7) << 1) - ((i4 | 99) & (~i7));
                    a = i % 128;
                    if (i % 2 != 0) {
                        boolean z = obj instanceof byte[];
                        throw null;
                    }
                    if (obj instanceof byte[]) {
                        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("illegal object in getInstance: ");
                        sbW.append(obj.getClass().getName());
                        throw new IllegalArgumentException(sbW.toString());
                    }
                    try {
                        c0258a = (C0258a) O.c((byte[]) obj);
                        int i8 = a;
                        int i9 = (i8 & (-118)) | ((~i8) & 117);
                        int i10 = (i8 & 117) << 1;
                        i2 = (i9 ^ i10) + ((i10 & i9) << 1);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            return c0258a;
                        }
                        throw null;
                    } catch (Exception e) {
                        StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("encoding error in getInstance: ");
                        sbW2.append(e.toString());
                        throw new IllegalArgumentException(sbW2.toString());
                    }
                }
            }
        } else if (obj != null) {
            if (!(obj instanceof C0258a)) {
                int i11 = i4 & 99;
                i = (((i4 ^ 99) | i11) << 1) - ((i4 | 99) & (~i11));
                a = i % 128;
                if (i % 2 != 0) {
                    boolean z2 = obj instanceof byte[];
                    throw null;
                }
                if (obj instanceof byte[]) {
                    StringBuilder sbW3 = ivas.gov.bisp.enumeration.p091n.j.w("illegal object in getInstance: ");
                    sbW3.append(obj.getClass().getName());
                    throw new IllegalArgumentException(sbW3.toString());
                }
                c0258a = (C0258a) O.c((byte[]) obj);
                int i12 = a;
                int i13 = (i12 & (-118)) | ((~i12) & 117);
                int i14 = (i12 & 117) << 1;
                i2 = (i13 ^ i14) + ((i14 & i13) << 1);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    return c0258a;
                }
                throw null;
            }
        }
        C0258a c0258a2 = (C0258a) obj;
        int i15 = i4 | 105;
        int i16 = i15 << 1;
        int i17 = -((~(i4 & 105)) & i15);
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        return c0258a2;
    }

    public static int q(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 23;
        b = i4 % 128;
        int i5 = i4 % 2;
        int length = bArr.length;
        int i6 = length & (-4);
        int i7 = ((length ^ (-4)) | i6) << 1;
        int i8 = -((~i6) & (length | (-4)));
        int iMax = Math.max(i, ((i7 | i8) << 1) - (i7 ^ i8));
        int i9 = b;
        int i10 = i9 & 59;
        int i11 = i10 + ((i9 ^ 59) | i10);
        a = i11 % 128;
        int i12 = i11 % 2 == 0 ? bArr[iMax] : bArr[iMax];
        while (true) {
            int i13 = i2 & i12;
            while (true) {
                iMax++;
                if (iMax >= length) {
                    int i14 = b + 83;
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    return i13;
                }
                int i16 = a;
                int i17 = (-2) - ((((i16 | 34) << 1) - (i16 ^ 34)) ^ (-1));
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    break;
                }
                int i18 = i13 << 8;
                int i19 = bArr[iMax] & 255;
                i13 = (i18 & i19) | (i18 ^ i19);
            }
            i2 = i13 * 88;
            int i20 = bArr[iMax];
            i12 = (i20 & 20862) | (i20 ^ 20862);
        }
    }

    public static int s(byte[] bArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = ((((i2 ^ 123) | i3) << 1) - (~(-((~i3) & (i2 | 123))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int length = bArr.length;
        int i6 = ((i2 & 64) + (i2 | 64)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (i8 < ((length << 1) - length) - 1) {
            int i9 = b;
            int i10 = (-2) - (((i9 & 72) + (i9 | 72)) ^ (-1));
            a = i10 % 128;
            int i11 = i10 % 2;
            byte b2 = bArr[i8];
            int i12 = (i8 ^ 1) + ((i8 & 1) << 1);
            int i13 = i9 + 83;
            a = i13 % 128;
            int i14 = i13 % 2;
            if (b2 != (bArr[i12] >> 7)) {
                break;
            }
            int i15 = i9 & 99;
            int i16 = (((i9 ^ 99) | i15) << 1) - ((i9 | 99) & (~i15));
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            int i19 = i17 & 23;
            int i20 = ((i17 ^ 23) | i19) << 1;
            int i21 = -((i17 | 23) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            b = i22 % 128;
            int i23 = i22 % 2;
            i8 = i12;
        }
        int i24 = b;
        int i25 = i24 & 61;
        int i26 = (i24 ^ 61) | i25;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 51 / 0;
        }
        return i8;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 38) + (i2 | 38);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            boolean z = o2 instanceof C0258a;
            obj.hashCode();
            throw null;
        }
        if (!(o2 instanceof C0258a)) {
            int i6 = i5 & 117;
            int i7 = (i5 ^ 117) | i6;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            b = i8 % 128;
            return !(i8 % 2 == 0);
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((C0258a) o2).c;
        int i9 = i2 ^ 61;
        int i10 = (((i2 & 61) | i9) << 1) - i9;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            Arrays.equals(bArr, bArr2);
            obj.hashCode();
            throw null;
        }
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i11 = a;
        int i12 = i11 & 71;
        int i13 = ((i11 ^ 71) | i12) << 1;
        int i14 = -((i11 | 71) & (~i12));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        if (i15 % 2 == 0) {
            return zEquals;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a + 65;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            j.h(this.c);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iH = j.h(this.c);
        int i3 = a;
        int i4 = i3 & 1;
        int i5 = (i3 ^ 1) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        return iH;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = b + 49;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            aVar.v(z, 5, this.c);
        } else {
            aVar.v(z, 2, this.c);
        }
        int i3 = b;
        int i4 = i3 & 119;
        int i5 = (i4 - (~(-(-((i3 ^ 119) | i4))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 123;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            int iB = az.b(this.c.length);
            i = (iB ^ (-1)) + (iB << 1);
        } else {
            int iB2 = az.b(this.c.length);
            i = (-2) - ((((iB2 | 2) << 1) - (iB2 ^ 2)) ^ (-1));
        }
        int i4 = -(-this.c.length);
        int i5 = (i & i4) + (i4 | i);
        int i6 = a;
        int i7 = i6 & 85;
        int i8 = (i6 ^ 85) | i7;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 35) << 1;
        int i4 = -((i2 & (-36)) | ((~i2) & 35));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (i2 & 31) + (i2 | 31);
        a = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int y() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 75;
        int i4 = (i2 ^ 75) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = this.c;
        int length = bArr.length;
        int i7 = this.d;
        int i8 = length - (~(-i7));
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        int i10 = (-2) - ((i2 + 52) ^ (-1));
        a = i10 % 128;
        if (i10 % 2 != 0 ? i9 > 4 : i9 > 2) {
            throw new ArithmeticException("ASN.1 Integer out of int range");
        }
        int iQ = q(bArr, i7, -1);
        int i11 = b;
        int i12 = (((i11 & (-86)) | ((~i11) & 85)) - (~((i11 & 85) << 1))) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return iQ;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long z() {
        byte[] bArr;
        int length;
        int i;
        int length2;
        int iMax;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 37;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            bArr = this.c;
            length = bArr.length;
            i = this.d;
            int i5 = 29 / 0;
        } else {
            bArr = this.c;
            length = bArr.length;
            i = this.d;
        }
        int i6 = -i;
        int i7 = length & i6;
        if (i7 + ((length ^ i6) | i7) > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int i8 = i3 ^ 103;
        int i9 = (((i3 & 103) | i8) << 1) - i8;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            length2 = bArr.length;
            int i10 = length2 & 8;
            iMax = Math.max(i, i10 + ((length2 ^ 8) | i10));
        } else {
            length2 = bArr.length;
            int i11 = length2 & (-8);
            int i12 = length2 | (-8);
            iMax = Math.max(i, ((i11 | i12) << 1) - (i11 ^ i12));
        }
        int i13 = b + 83;
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        long j = bArr[iMax];
        int i16 = ((i14 & 108) + (i14 | 108)) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            iMax = (iMax | 1) + (iMax & 1);
            if (iMax >= length2) {
                break;
            }
            int i18 = b;
            int i19 = (i18 & 11) + (i18 | 11);
            int i20 = i19 % 128;
            a = i20;
            j = i19 % 2 == 0 ? (j << 68) - ((long) (bArr[iMax] ^ 1461)) : (j << 8) | ((long) (bArr[iMax] & 255));
            int i21 = (i20 ^ 39) + ((i20 & 39) << 1);
            int i22 = i21 % 128;
            b = i22;
            int i23 = i21 % 2;
            int i24 = ((i22 | 47) << 1) - (((~i22) & 47) | (i22 & (-48)));
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = b + 121;
        a = i26 % 128;
        if (i26 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public static C0258a o(AbstractC0276v abstractC0276v, boolean z) {
        C0258a c0258a;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 77;
        int i5 = -(-((i3 ^ 77) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        O oT = abstractC0276v.t();
        if (i7 != 0) {
            int i8 = 66 / 0;
            if (!z) {
                int i9 = b;
                int i10 = i9 & 69;
                int i11 = i9 | 69;
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                int i13 = i12 % 2;
                if (!(oT instanceof C0258a)) {
                    c0258a = new C0258a(M.p(oT).c, true);
                    int i14 = a;
                    i = (((i14 ^ 29) | (i14 & 29)) << 1) - (((~i14) & 29) | (i14 & (-30)));
                    b = i % 128;
                    if (i % 2 == 0) {
                        return c0258a;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else if (!z) {
            int i15 = b;
            int i16 = i15 & 69;
            int i17 = i15 | 69;
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            int i19 = i18 % 2;
            if (!(oT instanceof C0258a)) {
                c0258a = new C0258a(M.p(oT).c, true);
                int i110 = a;
                i = (((i110 ^ 29) | (i110 & 29)) << 1) - (((~i110) & 29) | (i110 & (-30)));
                b = i % 128;
                if (i % 2 == 0) {
                    return c0258a;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        C0258a c0258aP = p(oT);
        int i20 = b;
        int i21 = i20 & 1;
        int i22 = (i21 - (~(-(-((i20 ^ 1) | i21))))) - 1;
        a = i22 % 128;
        int i23 = i22 % 2;
        return c0258aP;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0093 A[Catch: AccessControlException -> 0x016f, TRY_LEAVE, TryCatch #0 {AccessControlException -> 0x016f, blocks: (B:9:0x0049, B:12:0x0062, B:14:0x006a, B:17:0x008b, B:19:0x0093, B:23:0x00c4, B:27:0x00d6, B:32:0x00ed, B:35:0x00f6, B:37:0x00fe, B:41:0x0117, B:43:0x011f, B:47:0x0134, B:49:0x013c, B:53:0x0150, B:57:0x0165), top: B:77:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe A[Catch: AccessControlException -> 0x016f, TRY_LEAVE, TryCatch #0 {AccessControlException -> 0x016f, blocks: (B:9:0x0049, B:12:0x0062, B:14:0x006a, B:17:0x008b, B:19:0x0093, B:23:0x00c4, B:27:0x00d6, B:32:0x00ed, B:35:0x00f6, B:37:0x00fe, B:41:0x0117, B:43:0x011f, B:47:0x0134, B:49:0x013c, B:53:0x0150, B:57:0x0165), top: B:77:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f A[Catch: AccessControlException -> 0x016f, TRY_LEAVE, TryCatch #0 {AccessControlException -> 0x016f, blocks: (B:9:0x0049, B:12:0x0062, B:14:0x006a, B:17:0x008b, B:19:0x0093, B:23:0x00c4, B:27:0x00d6, B:32:0x00ed, B:35:0x00f6, B:37:0x00fe, B:41:0x0117, B:43:0x011f, B:47:0x0134, B:49:0x013c, B:53:0x0150, B:57:0x0165), top: B:77:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x013c A[Catch: AccessControlException -> 0x016f, TRY_LEAVE, TryCatch #0 {AccessControlException -> 0x016f, blocks: (B:9:0x0049, B:12:0x0062, B:14:0x006a, B:17:0x008b, B:19:0x0093, B:23:0x00c4, B:27:0x00d6, B:32:0x00ed, B:35:0x00f6, B:37:0x00fe, B:41:0x0117, B:43:0x011f, B:47:0x0134, B:49:0x013c, B:53:0x0150, B:57:0x0165), top: B:77:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    public static boolean r(byte[] bArr) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 61;
        int i4 = -(-(i2 | 61));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int length = bArr.length;
        if (length == 0) {
            int i7 = i2 + 29;
            b = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = i2 & 21;
        int i10 = (i2 ^ 21) | i9;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        Object obj = null;
        if (length == 1) {
            int i14 = (i2 ^ 119) + ((i2 & 119) << 1);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        int i15 = ((i12 ^ 72) + ((i12 & 72) << 1)) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        if (bArr[0] == (bArr[1] >> 7)) {
            ThreadLocal threadLocal = i.c;
            try {
                r rVar = new r("org.bouncycastle.asn1.allow_unsafe_integer");
                int i17 = a;
                int i18 = i17 & 25;
                int i19 = (i17 | 25) & (~i18);
                int i20 = i18 << 1;
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                String str = (String) AccessController.doPrivileged(rVar);
                if (str == null) {
                    Map map = (Map) i.c.get();
                    if (map != null) {
                        int i22 = b;
                        int i23 = i22 & 71;
                        int i24 = ((i22 ^ 71) | i23) << 1;
                        int i25 = -((i22 | 71) & (~i23));
                        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        str = (String) map.get("org.bouncycastle.asn1.allow_unsafe_integer");
                        if (str == null) {
                            str = (String) AccessController.doPrivileged(new e("org.bouncycastle.asn1.allow_unsafe_integer"));
                            int i28 = b;
                            int i29 = (i28 ^ 111) + ((i28 & 111) << 1);
                            int i30 = i29 % 128;
                            a = i30;
                            int i31 = i29 % 2;
                            int i32 = i30 & 45;
                            int i33 = i32 + ((i30 ^ 45) | i32);
                            b = i33 % 128;
                            int i34 = i33 % 2;
                        }
                    } else {
                        str = (String) AccessController.doPrivileged(new e("org.bouncycastle.asn1.allow_unsafe_integer"));
                        int i210 = b;
                        int i211 = (i210 ^ 111) + ((i210 & 111) << 1);
                        int i35 = i211 % 128;
                        a = i35;
                        int i36 = i211 % 2;
                        int i37 = i35 & 45;
                        int i38 = i37 + ((i35 ^ 45) | i37);
                        b = i38 % 128;
                        int i39 = i38 % 2;
                    }
                }
                if (str != null) {
                    int i40 = b;
                    int i41 = (i40 & 5) + (i40 | 5);
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    if (str.length() != 4) {
                        int i43 = a + 125;
                        b = i43 % 128;
                        int i44 = i43 % 2;
                    } else if (str.charAt(0) != 't') {
                        int i45 = a;
                        int i46 = i45 & 15;
                        int i47 = i46 + ((i45 ^ 15) | i46);
                        b = i47 % 128;
                        if (i47 % 2 != 0) {
                            if (str.charAt(1) == 'l') {
                                if (str.charAt(1) != 'r') {
                                    int i48 = b;
                                    int i49 = i48 & 75;
                                    int i50 = (((i48 | 75) & (~i49)) - (~(i49 << 1))) - 1;
                                    a = i50 % 128;
                                    int i51 = i50 % 2;
                                    if (str.charAt(1) == 'R') {
                                        if (str.charAt(2) != 'u') {
                                            int i52 = b;
                                            int i53 = i52 & 63;
                                            int i54 = i53 + ((i52 ^ 63) | i53);
                                            a = i54 % 128;
                                            int i55 = i54 % 2;
                                            if (str.charAt(2) == 'U') {
                                                if (str.charAt(3) != 'e') {
                                                    int i56 = a;
                                                    int i57 = (i56 ^ 3) + ((i56 & 3) << 1);
                                                    b = i57 % 128;
                                                    int i58 = i57 % 2;
                                                    if (str.charAt(3) == 'E') {
                                                    }
                                                }
                                                int i59 = a;
                                                int i60 = (i59 & 55) + (i59 | 55);
                                                b = i60 % 128;
                                                int i61 = i60 % 2;
                                                int i62 = b;
                                                int i63 = i62 & 107;
                                                int i64 = (((i62 ^ 107) | i63) << 1) - ((i62 | 107) & (~i63));
                                                a = i64 % 128;
                                                int i65 = i64 % 2;
                                                z = false;
                                            }
                                        } else {
                                            if (str.charAt(3) != 'e') {
                                                int i510 = a;
                                                int i511 = (i510 ^ 3) + ((i510 & 3) << 1);
                                                b = i511 % 128;
                                                int i512 = i511 % 2;
                                                if (str.charAt(3) == 'E') {
                                                }
                                            }
                                            int i513 = a;
                                            int i66 = (i513 & 55) + (i513 | 55);
                                            b = i66 % 128;
                                            int i67 = i66 % 2;
                                            int i68 = b;
                                            int i69 = i68 & 107;
                                            int i610 = (((i68 ^ 107) | i69) << 1) - ((i68 | 107) & (~i69));
                                            a = i610 % 128;
                                            int i611 = i610 % 2;
                                            z = false;
                                        }
                                    }
                                } else if (str.charAt(2) != 'u') {
                                    int i514 = b;
                                    int i515 = i514 & 63;
                                    int i516 = i515 + ((i514 ^ 63) | i515);
                                    a = i516 % 128;
                                    int i517 = i516 % 2;
                                    if (str.charAt(2) == 'U') {
                                        if (str.charAt(3) != 'e') {
                                            int i518 = a;
                                            int i519 = (i518 ^ 3) + ((i518 & 3) << 1);
                                            b = i519 % 128;
                                            int i5110 = i519 % 2;
                                            if (str.charAt(3) == 'E') {
                                            }
                                        }
                                        int i5111 = a;
                                        int i612 = (i5111 & 55) + (i5111 | 55);
                                        b = i612 % 128;
                                        int i613 = i612 % 2;
                                        int i614 = b;
                                        int i615 = i614 & 107;
                                        int i616 = (((i614 ^ 107) | i615) << 1) - ((i614 | 107) & (~i615));
                                        a = i616 % 128;
                                        int i617 = i616 % 2;
                                        z = false;
                                    }
                                } else {
                                    if (str.charAt(3) != 'e') {
                                        int i5112 = a;
                                        int i5113 = (i5112 ^ 3) + ((i5112 & 3) << 1);
                                        b = i5113 % 128;
                                        int i5114 = i5113 % 2;
                                        if (str.charAt(3) == 'E') {
                                        }
                                    }
                                    int i5115 = a;
                                    int i618 = (i5115 & 55) + (i5115 | 55);
                                    b = i618 % 128;
                                    int i619 = i618 % 2;
                                    int i6110 = b;
                                    int i6111 = i6110 & 107;
                                    int i6112 = (((i6110 ^ 107) | i6111) << 1) - ((i6110 | 107) & (~i6111));
                                    a = i6112 % 128;
                                    int i6113 = i6112 % 2;
                                    z = false;
                                }
                            }
                        } else if (str.charAt(0) == 'T') {
                            if (str.charAt(1) != 'r') {
                                int i410 = b;
                                int i411 = i410 & 75;
                                int i520 = (((i410 | 75) & (~i411)) - (~(i411 << 1))) - 1;
                                a = i520 % 128;
                                int i521 = i520 % 2;
                                if (str.charAt(1) == 'R') {
                                    if (str.charAt(2) != 'u') {
                                        int i5116 = b;
                                        int i5117 = i5116 & 63;
                                        int i5118 = i5117 + ((i5116 ^ 63) | i5117);
                                        a = i5118 % 128;
                                        int i5119 = i5118 % 2;
                                        if (str.charAt(2) == 'U') {
                                            if (str.charAt(3) != 'e') {
                                                int i51110 = a;
                                                int i51111 = (i51110 ^ 3) + ((i51110 & 3) << 1);
                                                b = i51111 % 128;
                                                int i51112 = i51111 % 2;
                                                if (str.charAt(3) == 'E') {
                                                }
                                            }
                                            int i51113 = a;
                                            int i6114 = (i51113 & 55) + (i51113 | 55);
                                            b = i6114 % 128;
                                            int i6115 = i6114 % 2;
                                            int i6116 = b;
                                            int i6117 = i6116 & 107;
                                            int i6118 = (((i6116 ^ 107) | i6117) << 1) - ((i6116 | 107) & (~i6117));
                                            a = i6118 % 128;
                                            int i6119 = i6118 % 2;
                                            z = false;
                                        }
                                    } else {
                                        if (str.charAt(3) != 'e') {
                                            int i51114 = a;
                                            int i51115 = (i51114 ^ 3) + ((i51114 & 3) << 1);
                                            b = i51115 % 128;
                                            int i51116 = i51115 % 2;
                                            if (str.charAt(3) == 'E') {
                                            }
                                        }
                                        int i51117 = a;
                                        int i61110 = (i51117 & 55) + (i51117 | 55);
                                        b = i61110 % 128;
                                        int i61111 = i61110 % 2;
                                        int i61112 = b;
                                        int i61113 = i61112 & 107;
                                        int i61114 = (((i61112 ^ 107) | i61113) << 1) - ((i61112 | 107) & (~i61113));
                                        a = i61114 % 128;
                                        int i61115 = i61114 % 2;
                                        z = false;
                                    }
                                }
                            } else if (str.charAt(2) != 'u') {
                                int i51118 = b;
                                int i51119 = i51118 & 63;
                                int i51120 = i51119 + ((i51118 ^ 63) | i51119);
                                a = i51120 % 128;
                                int i51121 = i51120 % 2;
                                if (str.charAt(2) == 'U') {
                                    if (str.charAt(3) != 'e') {
                                        int i511110 = a;
                                        int i511111 = (i511110 ^ 3) + ((i511110 & 3) << 1);
                                        b = i511111 % 128;
                                        int i511112 = i511111 % 2;
                                        if (str.charAt(3) == 'E') {
                                        }
                                    }
                                    int i511113 = a;
                                    int i61116 = (i511113 & 55) + (i511113 | 55);
                                    b = i61116 % 128;
                                    int i61117 = i61116 % 2;
                                    int i61118 = b;
                                    int i61119 = i61118 & 107;
                                    int i611110 = (((i61118 ^ 107) | i61119) << 1) - ((i61118 | 107) & (~i61119));
                                    a = i611110 % 128;
                                    int i611111 = i611110 % 2;
                                    z = false;
                                }
                            } else {
                                if (str.charAt(3) != 'e') {
                                    int i511114 = a;
                                    int i511115 = (i511114 ^ 3) + ((i511114 & 3) << 1);
                                    b = i511115 % 128;
                                    int i511116 = i511115 % 2;
                                    if (str.charAt(3) == 'E') {
                                    }
                                }
                                int i511117 = a;
                                int i611112 = (i511117 & 55) + (i511117 | 55);
                                b = i611112 % 128;
                                int i611113 = i611112 % 2;
                                int i611114 = b;
                                int i611115 = i611114 & 107;
                                int i611116 = (((i611114 ^ 107) | i611115) << 1) - ((i611114 | 107) & (~i611115));
                                a = i611116 % 128;
                                int i611117 = i611116 % 2;
                                z = false;
                            }
                        }
                    } else if (str.charAt(1) != 'r') {
                        int i412 = b;
                        int i413 = i412 & 75;
                        int i522 = (((i412 | 75) & (~i413)) - (~(i413 << 1))) - 1;
                        a = i522 % 128;
                        int i523 = i522 % 2;
                        if (str.charAt(1) == 'R') {
                            if (str.charAt(2) != 'u') {
                                int i511118 = b;
                                int i511119 = i511118 & 63;
                                int i51122 = i511119 + ((i511118 ^ 63) | i511119);
                                a = i51122 % 128;
                                int i51123 = i51122 % 2;
                                if (str.charAt(2) == 'U') {
                                    if (str.charAt(3) != 'e') {
                                        int i5111110 = a;
                                        int i5111111 = (i5111110 ^ 3) + ((i5111110 & 3) << 1);
                                        b = i5111111 % 128;
                                        int i5111112 = i5111111 % 2;
                                        if (str.charAt(3) == 'E') {
                                        }
                                    }
                                    int i5111113 = a;
                                    int i611118 = (i5111113 & 55) + (i5111113 | 55);
                                    b = i611118 % 128;
                                    int i611119 = i611118 % 2;
                                    int i6111110 = b;
                                    int i6111111 = i6111110 & 107;
                                    int i6111112 = (((i6111110 ^ 107) | i6111111) << 1) - ((i6111110 | 107) & (~i6111111));
                                    a = i6111112 % 128;
                                    int i6111113 = i6111112 % 2;
                                    z = false;
                                }
                            } else {
                                if (str.charAt(3) != 'e') {
                                    int i5111114 = a;
                                    int i5111115 = (i5111114 ^ 3) + ((i5111114 & 3) << 1);
                                    b = i5111115 % 128;
                                    int i5111116 = i5111115 % 2;
                                    if (str.charAt(3) == 'E') {
                                    }
                                }
                                int i5111117 = a;
                                int i6111114 = (i5111117 & 55) + (i5111117 | 55);
                                b = i6111114 % 128;
                                int i6111115 = i6111114 % 2;
                                int i6111116 = b;
                                int i6111117 = i6111116 & 107;
                                int i6111118 = (((i6111116 ^ 107) | i6111117) << 1) - ((i6111116 | 107) & (~i6111117));
                                a = i6111118 % 128;
                                int i6111119 = i6111118 % 2;
                                z = false;
                            }
                        }
                    } else if (str.charAt(2) != 'u') {
                        int i5111118 = b;
                        int i5111119 = i5111118 & 63;
                        int i51124 = i5111119 + ((i5111118 ^ 63) | i5111119);
                        a = i51124 % 128;
                        int i51125 = i51124 % 2;
                        if (str.charAt(2) == 'U') {
                            if (str.charAt(3) != 'e') {
                                int i51111110 = a;
                                int i51111111 = (i51111110 ^ 3) + ((i51111110 & 3) << 1);
                                b = i51111111 % 128;
                                int i51111112 = i51111111 % 2;
                                if (str.charAt(3) == 'E') {
                                }
                            }
                            int i51111113 = a;
                            int i61111110 = (i51111113 & 55) + (i51111113 | 55);
                            b = i61111110 % 128;
                            int i61111111 = i61111110 % 2;
                            int i61111112 = b;
                            int i61111113 = i61111112 & 107;
                            int i61111114 = (((i61111112 ^ 107) | i61111113) << 1) - ((i61111112 | 107) & (~i61111113));
                            a = i61111114 % 128;
                            int i61111115 = i61111114 % 2;
                            z = false;
                        }
                    } else {
                        if (str.charAt(3) != 'e') {
                            int i51111114 = a;
                            int i51111115 = (i51111114 ^ 3) + ((i51111114 & 3) << 1);
                            b = i51111115 % 128;
                            int i51111116 = i51111115 % 2;
                            if (str.charAt(3) == 'E') {
                            }
                        }
                        int i51111117 = a;
                        int i61111116 = (i51111117 & 55) + (i51111117 | 55);
                        b = i61111116 % 128;
                        int i61111117 = i61111116 % 2;
                        int i61111118 = b;
                        int i61111119 = i61111118 & 107;
                        int i611111110 = (((i61111118 ^ 107) | i61111119) << 1) - ((i61111118 | 107) & (~i61111119));
                        a = i611111110 % 128;
                        int i611111111 = i611111110 % 2;
                        z = false;
                    }
                }
                int i70 = a;
                int i71 = i70 & 55;
                int i72 = ((i70 | 55) & (~i71)) + (i71 << 1);
                b = i72 % 128;
                if (i72 % 2 != 0) {
                    int i73 = 5 / 3;
                }
                z = true;
            } catch (AccessControlException unused) {
            }
        } else {
            int i611111112 = b;
            int i611111113 = i611111112 & 107;
            int i611111114 = (((i611111112 ^ 107) | i611111113) << 1) - ((i611111112 | 107) & (~i611111113));
            a = i611111114 % 128;
            int i611111115 = i611111114 % 2;
            z = false;
        }
        int i74 = a;
        int i75 = i74 & 89;
        int i76 = ((i74 ^ 89) | i75) << 1;
        int i77 = -((i74 | 89) & (~i75));
        int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
        b = i78 % 128;
        if (i78 % 2 != 0) {
            int i79 = 25 / 0;
        }
        return z;
    }

    public String toString() {
        int i = 2 % 2;
        String string = new BigInteger(this.c).toString();
        int i2 = a;
        int i3 = ((i2 | 33) << 1) - (i2 ^ 33);
        b = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    public boolean x(BigInteger bigInteger) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 91;
        int i4 = (i2 & 91) << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (bigInteger != null) {
            int i7 = i2 + 21;
            b = i7 % 128;
            int i8 = i7 % 2;
            int iQ = q(this.c, this.d, -1);
            int i9 = b;
            int i10 = ((i9 & 88) + (i9 | 88)) - 1;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                bigInteger.intValue();
                throw null;
            }
            if (iQ != bigInteger.intValue() || (!new BigInteger(this.c).equals(bigInteger))) {
                int i11 = b + 3;
                a = i11 % 128;
                int i12 = i11 % 2;
                z = false;
            } else {
                int i13 = a;
                int i14 = ((i13 | 87) << 1) - (i13 ^ 87);
                b = i14 % 128;
                int i15 = i14 % 2;
                int i16 = (i13 & 6) + (i13 | 6);
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                z = true;
            }
        } else {
            int i19 = b + 3;
            a = i19 % 128;
            int i110 = i19 % 2;
            z = false;
        }
        int i20 = b + 26;
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        return z;
    }
}
