package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class aw extends Q {
    private static int a = 1;
    private static int b;
    public byte[] d;

    public aw(byte[] bArr) {
        this.d = bArr;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q, ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int iHashCode;
        synchronized (this) {
            p();
            iHashCode = super.hashCode();
        }
        return iHashCode;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        synchronized (this) {
            byte[] bArr = this.d;
            if (bArr != null) {
                aVar.v(z, 48, bArr);
            } else {
                super.m().i(aVar, z);
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q, java.lang.Iterable
    public Iterator<i> iterator() {
        Iterator<i> it;
        synchronized (this) {
            p();
            it = super.iterator();
        }
        return it;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        synchronized (this) {
            byte[] bArr = this.d;
            if (bArr == null) {
                return super.m().j();
            }
            int iB = az.b(bArr.length);
            int length = this.d.length;
            int i = iB & 1;
            int i2 = (iB | 1) & (~i);
            int i3 = -(-(i << 1));
            int i4 = (i2 & i3) + (i2 | i3);
            return ((i4 ^ length) - (~(-(-((length & i4) << 1))))) - 1;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        O oM;
        synchronized (this) {
            p();
            oM = super.m();
        }
        return oM;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q, ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        O oN;
        synchronized (this) {
            p();
            oN = super.n();
        }
        return oN;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q
    public Enumeration r() {
        synchronized (this) {
            byte[] bArr = this.d;
            if (bArr != null) {
                return new ay(bArr);
            }
            return new Q.bAH();
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q
    public int size() {
        int length;
        synchronized (this) {
            p();
            length = this.c.length;
        }
        return length;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q
    public i u(int i) {
        i iVar;
        synchronized (this) {
            p();
            iVar = this.c[i];
        }
        return iVar;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q
    public i[] v() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        a = i3 % 128;
        int i4 = i3 % 2;
        p();
        i[] iVarArr = this.c;
        int i5 = a;
        int i6 = i5 & 107;
        int i7 = i5 | 107;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return iVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0072  */
    /* JADX WARN: Code duplicated, block: B:15:0x0079  */
    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:29:0x0107  */
    /* JADX WARN: Code duplicated, block: B:33:0x0122  */
    /* JADX WARN: Code duplicated, block: B:34:0x0143  */
    /* JADX WARN: Code duplicated, block: B:36:0x0146  */
    /* JADX WARN: Code duplicated, block: B:38:0x0151  */
    /* JADX WARN: Code duplicated, block: B:39:0x0158  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d A[PHI: r1
  0x001d: PHI (r1v5 byte[]) = (r1v4 byte[]), (r1v43 byte[]) binds: [B:8:0x001b, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public final void p() {
        byte[] bArr;
        i[] iVarArr;
        ay ayVar;
        int i;
        int i2;
        O o2;
        int i3;
        int length;
        int i4;
        boolean z;
        int i5;
        int iMax;
        int i6;
        int i7 = 2 % 2;
        int i8 = b + 59;
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            bArr = this.d;
            int i9 = 71 / 0;
            if (bArr != null) {
                iVarArr = new i[10];
                ayVar = new ay(bArr);
                int i10 = b;
                int i11 = i10 | 69;
                int i12 = (i11 << 1) - ((~(i10 & 69)) & i11);
                int i13 = i12 % 128;
                a = i13;
                int i14 = i12 % 2;
                int i15 = ((i13 & 73) - (~(i13 | 73))) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                i = 0;
                while (!(!ayVar.hasMoreElements())) {
                    int i17 = a;
                    int i18 = i17 ^ 73;
                    int i19 = ((((i17 & 73) | i18) << 1) - (~(-i18))) - 1;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    o2 = (O) ayVar.nextElement();
                    int i21 = b;
                    i3 = ((i21 | 91) << 1) - (i21 ^ 91);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        Objects.requireNonNull(o2, "'element' cannot be null");
                        length = iVarArr.length;
                        i4 = i << 1;
                    } else {
                        Objects.requireNonNull(o2, "'element' cannot be null");
                        length = iVarArr.length;
                        int i22 = i & 1;
                        i4 = i22 + ((i ^ 1) | i22);
                    }
                    if (i4 > length) {
                        int i23 = b;
                        int i24 = (-2) - (((i23 & 48) + (i23 | 48)) ^ (-1));
                        a = i24 % 128;
                        int i25 = i24 % 2;
                        z = true;
                    } else {
                        int i26 = b;
                        int i27 = (i26 & (-62)) | ((~i26) & 61);
                        int i28 = (i26 & 61) << 1;
                        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                        a = i29 % 128;
                        int i30 = i29 % 2;
                        z = false;
                    }
                    if (!z) {
                        int i31 = a;
                        i5 = ((i31 & 99) - (~(-(-(i31 | 99))))) - 1;
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            iMax = Math.max(iVarArr.length, 0 % i4);
                        } else {
                            int i32 = i4 >> 1;
                            iMax = Math.max(iVarArr.length, (i32 ^ i4) + ((i32 & i4) << 1));
                        }
                        i[] iVarArr2 = new i[iMax];
                        int i33 = b;
                        int i34 = i33 ^ 91;
                        int i35 = (i33 & 91) << 1;
                        int i36 = (i34 & i35) + (i35 | i34);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        System.arraycopy(iVarArr, 0, iVarArr2, 0, i);
                        int i38 = b;
                        int i39 = (i38 & (-50)) | ((~i38) & 49);
                        int i40 = -(-((i38 & 49) << 1));
                        i6 = (i39 ^ i40) + ((i40 & i39) << 1);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i41 = 5 / 4;
                        }
                        iVarArr = iVarArr2;
                    }
                    iVarArr[i] = o2;
                    int i42 = b;
                    int i43 = (-2) - (((i42 & 26) + (i42 | 26)) ^ (-1));
                    a = i43 % 128;
                    int i44 = i43 % 2;
                    i = i4;
                }
                if (i == 0) {
                    int i45 = b + 97;
                    a = i45 % 128;
                    int i46 = i45 % 2;
                    iVarArr = C0270p.c;
                    int i47 = b;
                    int i48 = (i47 | 17) << 1;
                    int i49 = -(((~i47) & 17) | (i47 & (-18)));
                    int i50 = (i48 & i49) + (i49 | i48);
                    a = i50 % 128;
                    int i51 = i50 % 2;
                } else if (iVarArr.length != i) {
                    i2 = a + 107;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        i[] iVarArr3 = new i[i];
                        System.arraycopy(iVarArr, 1, iVarArr3, 1, i);
                        iVarArr = iVarArr3;
                    } else {
                        i[] iVarArr4 = new i[i];
                        System.arraycopy(iVarArr, 0, iVarArr4, 0, i);
                        iVarArr = iVarArr4;
                    }
                    int i52 = a;
                    int i53 = i52 + 123;
                    b = i53 % 128;
                    int i54 = i53 % 2;
                    int i55 = (i52 & 83) + (i52 | 83);
                    b = i55 % 128;
                    int i56 = i55 % 2;
                }
                this.c = iVarArr;
                this.d = null;
                int i57 = a + 88;
                int i58 = (i57 ^ (-1)) + (i57 << 1);
                b = i58 % 128;
                int i59 = i58 % 2;
            }
        } else {
            bArr = this.d;
            if (bArr != null) {
                iVarArr = new i[10];
                ayVar = new ay(bArr);
                int i110 = b;
                int i111 = i110 | 69;
                int i112 = (i111 << 1) - ((~(i110 & 69)) & i111);
                int i113 = i112 % 128;
                a = i113;
                int i114 = i112 % 2;
                int i115 = ((i113 & 73) - (~(i113 | 73))) - 1;
                b = i115 % 128;
                int i116 = i115 % 2;
                i = 0;
                while (!(!ayVar.hasMoreElements())) {
                    int i117 = a;
                    int i118 = i117 ^ 73;
                    int i119 = ((((i117 & 73) | i118) << 1) - (~(-i118))) - 1;
                    b = i119 % 128;
                    int i210 = i119 % 2;
                    o2 = (O) ayVar.nextElement();
                    int i211 = b;
                    i3 = ((i211 | 91) << 1) - (i211 ^ 91);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        Objects.requireNonNull(o2, "'element' cannot be null");
                        length = iVarArr.length;
                        i4 = i << 1;
                    } else {
                        Objects.requireNonNull(o2, "'element' cannot be null");
                        length = iVarArr.length;
                        int i212 = i & 1;
                        i4 = i212 + ((i ^ 1) | i212);
                    }
                    if (i4 > length) {
                        int i213 = b;
                        int i214 = (-2) - (((i213 & 48) + (i213 | 48)) ^ (-1));
                        a = i214 % 128;
                        int i215 = i214 % 2;
                        z = true;
                    } else {
                        int i216 = b;
                        int i217 = (i216 & (-62)) | ((~i216) & 61);
                        int i218 = (i216 & 61) << 1;
                        int i219 = ((i217 | i218) << 1) - (i218 ^ i217);
                        a = i219 % 128;
                        int i310 = i219 % 2;
                        z = false;
                    }
                    if (!z) {
                        int i311 = a;
                        i5 = ((i311 & 99) - (~(-(-(i311 | 99))))) - 1;
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            iMax = Math.max(iVarArr.length, 0 % i4);
                        } else {
                            int i312 = i4 >> 1;
                            iMax = Math.max(iVarArr.length, (i312 ^ i4) + ((i312 & i4) << 1));
                        }
                        i[] iVarArr5 = new i[iMax];
                        int i313 = b;
                        int i314 = i313 ^ 91;
                        int i315 = (i313 & 91) << 1;
                        int i316 = (i314 & i315) + (i315 | i314);
                        a = i316 % 128;
                        int i317 = i316 % 2;
                        System.arraycopy(iVarArr, 0, iVarArr5, 0, i);
                        int i318 = b;
                        int i319 = (i318 & (-50)) | ((~i318) & 49);
                        int i410 = -(-((i318 & 49) << 1));
                        i6 = (i319 ^ i410) + ((i410 & i319) << 1);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i411 = 5 / 4;
                        }
                        iVarArr = iVarArr5;
                    }
                    iVarArr[i] = o2;
                    int i412 = b;
                    int i413 = (-2) - (((i412 & 26) + (i412 | 26)) ^ (-1));
                    a = i413 % 128;
                    int i414 = i413 % 2;
                    i = i4;
                }
                if (i == 0) {
                    int i415 = b + 97;
                    a = i415 % 128;
                    int i416 = i415 % 2;
                    iVarArr = C0270p.c;
                    int i417 = b;
                    int i418 = (i417 | 17) << 1;
                    int i419 = -(((~i417) & 17) | (i417 & (-18)));
                    int i510 = (i418 & i419) + (i419 | i418);
                    a = i510 % 128;
                    int i511 = i510 % 2;
                } else if (iVarArr.length != i) {
                    i2 = a + 107;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        i[] iVarArr6 = new i[i];
                        System.arraycopy(iVarArr, 1, iVarArr6, 1, i);
                        iVarArr = iVarArr6;
                    } else {
                        i[] iVarArr7 = new i[i];
                        System.arraycopy(iVarArr, 0, iVarArr7, 0, i);
                        iVarArr = iVarArr7;
                    }
                    int i512 = a;
                    int i513 = i512 + 123;
                    b = i513 % 128;
                    int i514 = i513 % 2;
                    int i515 = (i512 & 83) + (i512 | 83);
                    b = i515 % 128;
                    int i516 = i515 % 2;
                }
                this.c = iVarArr;
                this.d = null;
                int i517 = a + 88;
                int i518 = (i517 ^ (-1)) + (i517 << 1);
                b = i518 % 128;
                int i519 = i518 % 2;
            }
        }
        int i60 = a;
        int i61 = i60 & 123;
        int i62 = (((i60 ^ 123) | i61) << 1) - ((i60 | 123) & (~i61));
        b = i62 % 128;
        if (i62 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
