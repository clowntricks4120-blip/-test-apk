package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0276v extends O implements av {
    private static int a = 0;
    private static int b = 1;
    public final int c;
    public final boolean d;
    public final i e;

    public AbstractC0276v(boolean z, int i, i iVar) {
        boolean z2;
        Objects.requireNonNull(iVar, "'obj' cannot be null");
        this.c = i;
        if (z) {
            int i2 = b;
            int i3 = i2 & 45;
            int i4 = (i2 ^ 45) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            z2 = true;
        } else {
            int i7 = a;
            int i8 = ((i7 & 13) - (~(-(-(i7 | 13))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            z2 = false;
        }
        this.d = z2;
        this.e = iVar;
        int i11 = b;
        int i12 = ((i11 & (-120)) | ((~i11) & 119)) + ((i11 & 119) << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public static AbstractC0276v o(Object obj) {
        int i;
        AbstractC0276v abstractC0276vO;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 | 115;
        int i7 = i6 << 1;
        int i8 = -(i6 & (~(i5 & 115)));
        int i9 = (i7 & i8) + (i8 | i7);
        int i10 = i9 % 128;
        a = i10;
        if (i9 % 2 != 0) {
            int i11 = 13 / 0;
            if (obj != null) {
                if (!(obj instanceof AbstractC0276v)) {
                    int i12 = (i10 | 33) << 1;
                    int i13 = -(i10 ^ 33);
                    i = ((i12 | i13) << 1) - (i12 ^ i13);
                    b = i % 128;
                    if (i % 2 != 0) {
                        boolean z = obj instanceof byte[];
                        throw null;
                    }
                    if (obj instanceof byte[]) {
                        StringBuilder sbW = j.w("unknown object in getInstance: ");
                        sbW.append(obj.getClass().getName());
                        throw new IllegalArgumentException(sbW.toString());
                    }
                    try {
                        abstractC0276vO = o(O.c((byte[]) obj));
                        i2 = b;
                        int i14 = i2 & 1;
                        int i15 = i2 | 1;
                        i3 = ((i14 | i15) << 1) - (i14 ^ i15);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        int i16 = i2 & 75;
                        int i17 = (i2 ^ 75) | i16;
                        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                        a = i18 % 128;
                        int i19 = i18 % 2;
                        return abstractC0276vO;
                    } catch (IOException e) {
                        StringBuilder sbW2 = j.w("failed to construct tagged object from byte[]: ");
                        sbW2.append(e.getMessage());
                        throw new IllegalArgumentException(sbW2.toString());
                    }
                }
            }
        } else if (obj != null) {
            if (!(obj instanceof AbstractC0276v)) {
                int i110 = (i10 | 33) << 1;
                int i111 = -(i10 ^ 33);
                i = ((i110 | i111) << 1) - (i110 ^ i111);
                b = i % 128;
                if (i % 2 != 0) {
                    boolean z2 = obj instanceof byte[];
                    throw null;
                }
                if (obj instanceof byte[]) {
                    StringBuilder sbW3 = j.w("unknown object in getInstance: ");
                    sbW3.append(obj.getClass().getName());
                    throw new IllegalArgumentException(sbW3.toString());
                }
                abstractC0276vO = o(O.c((byte[]) obj));
                i2 = b;
                int i112 = i2 & 1;
                int i113 = i2 | 1;
                i3 = ((i112 | i113) << 1) - (i112 ^ i113);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i114 = i2 & 75;
                int i115 = (i2 ^ 75) | i114;
                int i116 = ((i114 | i115) << 1) - (i114 ^ i115);
                a = i116 % 128;
                int i117 = i116 % 2;
                return abstractC0276vO;
            }
        }
        AbstractC0276v abstractC0276v = (AbstractC0276v) obj;
        int i20 = (i5 & (-2)) | ((~i5) & 1);
        int i21 = -(-((i5 & 1) << 1));
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 91 / 0;
        }
        return abstractC0276v;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 105;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 43;
        int i4 = (((i2 | 43) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (!(o2 instanceof AbstractC0276v)) {
            int i7 = (((i5 | 6) << 1) - (i5 ^ 6)) - 1;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 & 81;
            int i11 = i10 + ((i8 ^ 81) | i10);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                return false;
            }
            throw null;
        }
        AbstractC0276v abstractC0276v = (AbstractC0276v) o2;
        if (this.c == abstractC0276v.c) {
            int i12 = ((((i5 ^ 83) | (i5 & 83)) << 1) - (~(-((i5 & (-84)) | ((~i5) & 83))))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            if (this.d != abstractC0276v.d) {
                int i14 = i5 ^ 115;
                int i15 = ((i5 & 115) | i14) << 1;
                int i16 = -i14;
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                int i18 = i17 % 128;
                b = i18;
                int i19 = i17 % 2;
                int i20 = (i18 ^ 49) + ((i18 & 49) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
            } else {
                O oF = this.e.f();
                i iVar = abstractC0276v.e;
                int i22 = a + 119;
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    iVar.f();
                    throw null;
                }
                O oF2 = iVar.f();
                if (oF == oF2 || oF.h(oF2)) {
                    int i23 = a;
                    int i24 = i23 & 37;
                    int i25 = -(-((i23 ^ 37) | i24));
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
        }
        int i28 = a;
        int i29 = i28 & 61;
        int i30 = (i28 | 61) & (~i29);
        int i31 = -(-(i29 << 1));
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        b = i32 % 128;
        if (i32 % 2 == 0) {
            int i33 = 81 / 0;
        }
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 | 125) << 1;
        int i5 = -((i3 & (-126)) | ((~i3) & 125));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = this.c;
        if (this.d) {
            int i10 = i7 + 73;
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i7 + 77;
            b = i12 % 128;
            int i13 = i12 % 2;
            i = 15;
        } else {
            int i14 = ((i3 | 87) << 1) - (i3 ^ 87);
            a = i14 % 128;
            int i15 = i14 % 2;
            i = 240;
        }
        int i16 = i ^ i9;
        O oF = this.e.f();
        int i17 = b;
        int i18 = (i17 & (-96)) | ((~i17) & 95);
        int i19 = -(-((i17 & 95) << 1));
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        int iHashCode = i16 ^ oF.hashCode();
        int i22 = b;
        int i23 = (((i22 & (-106)) | ((~i22) & 105)) - (~((i22 & 105) << 1))) - 1;
        a = i23 % 128;
        if (i23 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        aj ajVar = new aj(this.d, this.c, this.e, 1);
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = i3 + ((i2 ^ 45) | i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return ajVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        aj ajVar = new aj(this.d, this.c, this.e, 0);
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = ((((i2 ^ 19) | i3) << 1) - (~(-((i2 | 19) & (~i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return ajVar;
        }
        throw null;
    }

    public O t() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 37) + (i2 | 37);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.e.f();
            obj.hashCode();
            throw null;
        }
        O oF = this.e.f();
        int i4 = a;
        int i5 = (i4 & (-68)) | ((~i4) & 67);
        int i6 = -(-((i4 & 67) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return oF;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = -(-((i2 & 75) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            j.w("[");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StringBuilder sbW = j.w("[");
        sbW.append(this.c);
        sbW.append("]");
        int i6 = b;
        int i7 = i6 & 3;
        int i8 = -(-((i6 ^ 3) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        sbW.append(this.e);
        String string = sbW.toString();
        int i11 = a + 89;
        b = i11 % 128;
        int i12 = i11 % 2;
        return string;
    }
}
