package ivas.gov.bisp.enumeration.p077cw;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p086i.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class O extends L {
    private static int a = 0;
    private static int b = 1;
    public List<A> R;
    public final boolean S;
    public final int T;
    public List<R> U;
    public final long V;
    public long W;

    public O(int i, List<R> list, List<A> list2, long j, long j2, boolean z) {
        super(true);
        this.W = 0L;
        this.T = i;
        this.U = Collections.unmodifiableList(list);
        this.R = Collections.unmodifiableList(list2);
        this.W = j;
        this.V = j2;
        this.S = z;
    }

    public static O c(Object obj) throws Throwable {
        long j;
        boolean z;
        DataInputStream dataInputStream;
        int i = 2 % 2;
        Object objQ = obj;
        while (true) {
            Object obj2 = null;
            if (objQ instanceof O) {
                int i2 = b;
                int i3 = (i2 & 53) + (i2 | 53);
                int i4 = i3 % 128;
                a = i4;
                O o2 = (O) objQ;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i5 = (i4 ^ 35) + ((i4 & 35) << 1);
                b = i5 % 128;
                int i6 = i5 % 2;
                return o2;
            }
            int i7 = 0;
            if (objQ instanceof DataInputStream) {
                int i8 = b;
                int i9 = i8 & 67;
                int i10 = -(-((i8 ^ 67) | i9));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                DataInputStream dataInputStream2 = (DataInputStream) objQ;
                if (dataInputStream2.readInt() != 0) {
                    throw new IllegalStateException("unknown version for hss private key");
                }
                int i13 = b;
                int i14 = i13 ^ 69;
                int i15 = -(-((i13 & 69) << 1));
                int i16 = (i14 & i15) + (i15 | i14);
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    dataInputStream2.readInt();
                    dataInputStream2.readLong();
                    throw null;
                }
                int i17 = dataInputStream2.readInt();
                long j2 = dataInputStream2.readLong();
                int i18 = b;
                int i19 = (((i18 ^ 71) | (i18 & 71)) << 1) - (((~i18) & 71) | (i18 & (-72)));
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    j = dataInputStream2.readLong();
                    z = dataInputStream2.readBoolean();
                    int i20 = 1 / 0;
                } else {
                    j = dataInputStream2.readLong();
                    z = dataInputStream2.readBoolean();
                }
                boolean z2 = z;
                long j3 = j;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i21 = b;
                int i22 = i21 & 65;
                int i23 = (i21 ^ 65) | i22;
                int i24 = (i22 & i23) + (i23 | i22);
                a = i24 % 128;
                int i25 = i24 % 2 != 0 ? 1 : 0;
                while (i25 < i17) {
                    int i26 = b + 47;
                    a = i26 % 128;
                    int i27 = i26 % 2;
                    arrayList.add(R.c(objQ));
                    int i28 = i25 & (-9);
                    int i29 = ((i25 | (-9)) & (~i28)) + (i28 << 1);
                    int i30 = i29 & 10;
                    int i31 = i29 | 10;
                    i25 = ((i30 | i31) << 1) - (i31 ^ i30);
                    int i32 = a;
                    int i33 = ((i32 | 2) << 1) - (i32 ^ 2);
                    int i34 = (i33 ^ (-1)) + (i33 << 1);
                    b = i34 % 128;
                    int i35 = i34 % 2;
                }
                while (i7 < i17 - 1) {
                    int i36 = b + 49;
                    a = i36 % 128;
                    if (i36 % 2 != 0) {
                        arrayList2.add(A.c(objQ));
                        int i37 = i7 | 81;
                        int i38 = i37 << 1;
                        int i39 = -(i37 & (~(i7 & 81)));
                        i7 = (i38 & i39) + (i39 | i38);
                    } else {
                        arrayList2.add(A.c(objQ));
                        int i40 = i7 & 1;
                        i7 = (i40 - (~((i7 ^ 1) | i40))) - 1;
                    }
                    int i41 = a + 51;
                    b = i41 % 128;
                    int i42 = i41 % 2;
                }
                O o3 = new O(i17, arrayList, arrayList2, j2, j3, z2);
                int i43 = (-2) - ((b + 124) ^ (-1));
                a = i43 % 128;
                int i44 = i43 % 2;
                return o3;
            }
            if (objQ instanceof byte[]) {
                try {
                    dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) objQ));
                    int i45 = a;
                    int i46 = (i45 & 116) + (i45 | 116);
                    int i47 = (i46 ^ (-1)) + (i46 << 1);
                    b = i47 % 128;
                    try {
                        if (i47 % 2 == 0) {
                            c(dataInputStream);
                            dataInputStream.close();
                            throw null;
                        }
                        O oC = c(dataInputStream);
                        dataInputStream.close();
                        int i48 = a + 91;
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        return oC;
                    } catch (Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            int i50 = a + 21;
                            b = i50 % 128;
                            int i51 = i50 % 2;
                            dataInputStream.close();
                            if (i51 == 0) {
                                throw null;
                            }
                            int i52 = a;
                            int i53 = i52 ^ 65;
                            int i54 = ((i52 & 65) | i53) << 1;
                            int i55 = -i53;
                            int i56 = (i54 & i55) + (i54 | i55);
                            b = i56 % 128;
                            int i57 = i56 % 2;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
            } else {
                if (!(objQ instanceof InputStream)) {
                    StringBuilder sb = new StringBuilder();
                    int i58 = b + 54;
                    int i59 = (i58 ^ (-1)) + (i58 << 1);
                    a = i59 % 128;
                    int i60 = i59 % 2;
                    sb.append("cannot parse ");
                    sb.append(objQ);
                    if (i60 == 0) {
                        throw new IllegalArgumentException(sb.toString());
                    }
                    obj2.hashCode();
                    throw null;
                }
                int i61 = b + 103;
                a = i61 % 128;
                int i62 = i61 % 2;
                objQ = i.q((InputStream) objQ);
                if (i62 != 0) {
                    int i63 = 57 / 0;
                }
                int i64 = a;
                int i65 = ((i64 ^ 125) | (i64 & 125)) << 1;
                int i66 = -(((~i64) & 125) | (i64 & (-126)));
                int i67 = (i65 & i66) + (i66 | i65);
                b = i67 % 128;
                int i68 = i67 % 2;
            }
        }
    }

    public Object clone() throws Throwable {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 59) | (i2 & 59)) << 1) - (((~i2) & 59) | (i2 & (-60)));
        b = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                return c(getEncoded());
            }
            c(getEncoded());
            throw null;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 79;
        int i4 = -(-((i2 ^ 79) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this == obj) {
            int i8 = i6 & 119;
            int i9 = i8 + ((i6 ^ 119) | i8);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            int i12 = i10 & 7;
            int i13 = (((i10 | 7) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            return true;
        }
        Object obj2 = null;
        if (obj != null) {
            int i15 = ((i2 | 91) << 1) - (i2 ^ 91);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                obj.getClass();
                throw null;
            }
            if (O.class == obj.getClass()) {
                O o2 = (O) obj;
                if (this.T != o2.T) {
                    int i16 = b;
                    int i17 = i16 & 21;
                    int i18 = -(-((i16 ^ 21) | i17));
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    int i20 = i19 % 128;
                    a = i20;
                    int i21 = i19 % 2;
                    int i22 = i20 ^ 33;
                    int i23 = ((i20 & 33) | i22) << 1;
                    int i24 = -i22;
                    int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                    b = i25 % 128;
                    if (i25 % 2 == 0) {
                        int i26 = 79 / 0;
                    }
                    return false;
                }
                if (this.S != o2.S) {
                    int i27 = a;
                    int i28 = i27 ^ 39;
                    int i29 = (i27 & 39) << 1;
                    int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    int i32 = (i27 & (-120)) | ((~i27) & 119);
                    int i33 = -(-((i27 & 119) << 1));
                    int i34 = (i32 & i33) + (i33 | i32);
                    b = i34 % 128;
                    if (i34 % 2 != 0) {
                        return false;
                    }
                    obj2.hashCode();
                    throw null;
                }
                if (this.V != o2.V) {
                    int i35 = b;
                    int i36 = i35 ^ 27;
                    int i37 = (((i35 & 27) | i36) << 1) - i36;
                    a = i37 % 128;
                    int i38 = i37 % 2;
                    int i39 = ((i35 | 29) << 1) - (i35 ^ 29);
                    a = i39 % 128;
                    int i40 = i39 % 2;
                    return false;
                }
                if (this.W != o2.W) {
                    int i41 = a;
                    int i42 = i41 & 103;
                    int i43 = ((i41 ^ 103) | i42) << 1;
                    int i44 = -((i41 | 103) & (~i42));
                    int i45 = (i43 & i44) + (i44 | i43);
                    int i46 = i45 % 128;
                    b = i46;
                    int i47 = i45 % 2;
                    int i48 = (i46 & (-94)) | ((~i46) & 93);
                    int i49 = -(-((i46 & 93) << 1));
                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                    a = i50 % 128;
                    int i51 = i50 % 2;
                    return false;
                }
                if (this.U.equals(o2.U)) {
                    boolean zEquals = this.R.equals(o2.R);
                    int i52 = b;
                    int i53 = i52 ^ 33;
                    int i54 = ((((i52 & 33) | i53) << 1) - (~(-i53))) - 1;
                    a = i54 % 128;
                    if (i54 % 2 == 0) {
                        return zEquals;
                    }
                    obj2.hashCode();
                    throw null;
                }
                int i55 = b;
                int i56 = (i55 & (-50)) | ((~i55) & 49);
                int i57 = (i55 & 49) << 1;
                int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                int i59 = i58 % 128;
                a = i59;
                int i60 = i58 % 2;
                int i61 = (i59 | 89) << 1;
                int i62 = -(i59 ^ 89);
                int i63 = (i61 & i62) + (i62 | i61);
                b = i63 % 128;
                int i64 = i63 % 2;
                return false;
            }
        }
        int i65 = b;
        int i66 = ((i65 | 100) << 1) - (i65 ^ 100);
        int i67 = (i66 ^ (-1)) + (i66 << 1);
        a = i67 % 128;
        if (i67 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p077cw.L, ivas.gov.bisp.enumeration.p064cj.h
    public byte[] getEncoded() {
        byte[] bArrJ;
        synchronized (this) {
            a aVarH = a.h();
            aVarH.p(0);
            aVarH.p(this.T);
            long j = this.W;
            aVarH.p((int) (j >>> 32));
            aVarH.p((int) j);
            long j2 = this.V;
            aVarH.p((int) (j2 >>> 32));
            aVarH.p((int) j2);
            ((ByteArrayOutputStream) aVarH.c).write(this.S ? 1 : 0);
            Iterator<R> it = this.U.iterator();
            while (it.hasNext()) {
                aVarH.k(it.next());
            }
            Iterator<A> it2 = this.R.iterator();
            while (it2.hasNext()) {
                aVarH.k(it2.next());
            }
            bArrJ = aVarH.j();
        }
        return bArrJ;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 125) | (i2 & 125)) << 1;
        int i4 = -((i2 & (-126)) | ((~i2) & 125));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.T;
        boolean z = this.S;
        List<R> list = this.U;
        int i8 = ((i2 ^ 3) | (i2 & 3)) << 1;
        int i9 = -(((~i2) & 3) | (i2 & (-4)));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode = list.hashCode();
        int iHashCode2 = this.R.hashCode();
        if (i11 == 0) {
            int i12 = 80 / 0;
        }
        long j = this.V;
        int i13 = a + 121;
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        long j2 = this.W;
        int i16 = (((i14 | 84) << 1) - (i14 ^ 84)) - 1;
        a = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i7 * 31;
        int i19 = -(-(z ? 1 : 0));
        int i20 = i18 | i19;
        int i21 = i20 << 1;
        int i22 = -((~(i18 & i19)) & i20);
        int i23 = -(~(-(-(((i21 & i22) + (i22 | i21)) * 31))));
        int i24 = (iHashCode & i23) + (iHashCode | i23);
        int i25 = ((i24 ^ (-1)) + (i24 << 1)) * 31;
        int i26 = i14 & 61;
        int i27 = ((((i14 ^ 61) | i26) << 1) - (~(-((~i26) & (i14 | 61))))) - 1;
        int i28 = i27 % 128;
        a = i28;
        int i29 = i27 % 2;
        int i30 = -(~(-(-i25)));
        int i31 = ((((iHashCode2 | i30) << 1) - (i30 ^ iHashCode2)) - 1) * 31;
        int i32 = -(-((int) (j ^ (j >>> 32))));
        int i33 = i31 & i32;
        int i34 = (((i32 | i31) & (~i33)) + (i33 << 1)) * 31;
        int i35 = i28 & 17;
        int i36 = (i28 ^ 17) | i35;
        int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
        b = i37 % 128;
        int i38 = i37 % 2;
        int i39 = (int) ((j2 >>> 32) ^ j2);
        int i40 = i34 ^ i39;
        int i41 = -(-((i34 & i39) << 1));
        int i42 = (i40 & i41) + (i41 | i40);
        int i43 = ((i28 | 89) << 1) - (i28 ^ 89);
        b = i43 % 128;
        if (i43 % 2 != 0) {
            return i42;
        }
        throw null;
    }
}
