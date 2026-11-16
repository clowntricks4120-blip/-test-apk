package ivas.gov.bisp.enumeration.p023aw;

import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.p022av.C0095o;
import ivas.gov.bisp.enumeration.p022av.C0097t;
import ivas.gov.bisp.enumeration.p022av.S;
import ivas.gov.bisp.enumeration.p022av.T;
import ivas.gov.bisp.enumeration.p022av.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    private static int a = 1;
    private static int b;

    public static class bKC {
        public final String a;
        public final T b;

        public bKC(String str, T t, bKB bkb) {
            this.a = str;
            this.b = t;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    /* JADX WARN: Code duplicated, block: B:8:0x0053  */
    /* JADX WARN: Code duplicated, block: B:9:0x006b  */
    public static void d(long j, o00O0O<?> o00o0o, byte[] bArr, int i) {
        Object objValueOf;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 ^ 79) | (i3 & 79)) << 1) - (((~i3) & 79) | (i3 & (-80)));
        a = i4 % 128;
        int i5 = i4 % 2;
        if (!S.c) {
            int i6 = a;
            int i7 = i6 & 53;
            int i8 = ((i6 | 53) & (~i7)) + (i7 << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            if (j > 3000) {
                Object[] objArr = new Object[5];
                objArr[0] = o00o0o;
                int i10 = b;
                int i11 = i10 & 9;
                int i12 = -(-((i10 ^ 9) | i11));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                objArr[1] = Long.valueOf(j);
                if (bArr != null) {
                    int i15 = b + 85;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    objValueOf = Integer.valueOf(bArr.length);
                    int i17 = a + 55;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    int i19 = b;
                    int i20 = i19 ^ 105;
                    int i21 = (i19 & 105) << 1;
                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    objValueOf = "null";
                }
                objArr[2] = objValueOf;
                Integer numValueOf = Integer.valueOf(i);
                int i24 = a;
                int i25 = (i24 | 119) << 1;
                int i26 = -(((~i24) & 119) | (i24 & (-120)));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                b = i27 % 128;
                int i28 = i27 % 2;
                objArr[3] = numValueOf;
                int i29 = o00o0o.m.b;
                int i30 = b;
                int i31 = ((i30 & (-44)) | ((~i30) & 43)) + ((i30 & 43) << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
                objArr[4] = Integer.valueOf(i29);
                S.c("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                int i33 = a;
                int i34 = (i33 & (-6)) | ((~i33) & 5);
                int i35 = (i33 & 5) << 1;
                int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
                b = i36 % 128;
                int i37 = i36 % 2;
                int i38 = ((i33 ^ 44) + ((i33 & 44) << 1)) - 1;
                b = i38 % 128;
                int i39 = i38 % 2;
            }
        } else {
            Object[] objArr2 = new Object[5];
            objArr2[0] = o00o0o;
            int i110 = b;
            int i111 = i110 & 9;
            int i112 = -(-((i110 ^ 9) | i111));
            int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
            a = i113 % 128;
            int i114 = i113 % 2;
            objArr2[1] = Long.valueOf(j);
            if (bArr != null) {
                int i115 = b + 85;
                a = i115 % 128;
                int i116 = i115 % 2;
                objValueOf = Integer.valueOf(bArr.length);
                int i117 = a + 55;
                b = i117 % 128;
                int i118 = i117 % 2;
            } else {
                int i119 = b;
                int i210 = i119 ^ 105;
                int i211 = (i119 & 105) << 1;
                int i212 = ((i210 | i211) << 1) - (i211 ^ i210);
                a = i212 % 128;
                int i213 = i212 % 2;
                objValueOf = "null";
            }
            objArr2[2] = objValueOf;
            Integer numValueOf2 = Integer.valueOf(i);
            int i214 = a;
            int i215 = (i214 | 119) << 1;
            int i216 = -(((~i214) & 119) | (i214 & (-120)));
            int i217 = ((i215 | i216) << 1) - (i216 ^ i215);
            b = i217 % 128;
            int i218 = i217 % 2;
            objArr2[3] = numValueOf2;
            int i219 = o00o0o.m.b;
            int i310 = b;
            int i311 = ((i310 & (-44)) | ((~i310) & 43)) + ((i310 & 43) << 1);
            a = i311 % 128;
            int i312 = i311 % 2;
            objArr2[4] = Integer.valueOf(i219);
            S.c("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr2);
            int i313 = a;
            int i314 = (i313 & (-6)) | ((~i313) & 5);
            int i315 = (i313 & 5) << 1;
            int i316 = ((i314 | i315) << 1) - (i314 ^ i315);
            b = i316 % 128;
            int i317 = i316 % 2;
            int i318 = ((i313 ^ 44) + ((i313 & 44) << 1)) - 1;
            b = i318 % 128;
            int i319 = i318 % 2;
        }
        int i40 = a;
        int i41 = i40 | 77;
        int i42 = i41 << 1;
        int i43 = -((~(i40 & 77)) & i41);
        int i44 = (i42 & i43) + (i43 | i42);
        b = i44 % 128;
        int i45 = i44 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0127 A[SYNTHETIC] */
    public static C0095o b(o00O0O<?> o00o0o, long j, List<C0097t> list) {
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 57;
        int i5 = (i4 - (~((i3 ^ 57) | i4))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        r.bJP bjp = o00o0o.f68o;
        if (bjp == null) {
            C0095o c0095o = new C0095o(304, null, true, j, list);
            int i7 = b;
            int i8 = ((i7 | 35) << 1) - (i7 ^ 35);
            a = i8 % 128;
            int i9 = i8 % 2;
            return c0095o;
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            int i10 = a;
            int i11 = ((i10 ^ 6) + ((i10 & 6) << 1)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            Iterator<C0097t> it = list.iterator();
            int i13 = b;
            int i14 = ((((i13 ^ 121) | (i13 & 121)) << 1) - (~(-(((~i13) & 121) | (i13 & (-122)))))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            while (it.hasNext()) {
                int i16 = b;
                int i17 = ((i16 ^ 2) + ((i16 & 2) << 1)) - 1;
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    str = it.next().c;
                    int i18 = 56 / 0;
                } else {
                    str = it.next().c;
                }
                int i19 = a;
                int i20 = i19 & 75;
                int i21 = i19 | 75;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                b = i22 % 128;
                int i23 = i22 % 2;
                treeSet.add(str);
                int i24 = b;
                int i25 = (i24 & 53) + (i24 | 53);
                a = i25 % 128;
                int i26 = i25 % 2;
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<C0097t> list2 = bjp.h;
        Object obj = null;
        if (list2 != null) {
            int i27 = a + 3;
            b = i27 % 128;
            int i28 = i27 % 2;
            if (!list2.isEmpty()) {
                int i29 = b + 109;
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    bjp.h.iterator();
                    obj.hashCode();
                    throw null;
                }
                Iterator<C0097t> it2 = bjp.h.iterator();
                while (!(!it2.hasNext())) {
                    int i30 = b + 91;
                    a = i30 % 128;
                    if (i30 % 2 == 0) {
                        String str2 = it2.next().c;
                        throw null;
                    }
                    C0097t next = it2.next();
                    String str3 = next.c;
                    int i31 = a + 105;
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    boolean zContains = treeSet.contains(str3);
                    if (i32 != 0) {
                        int i33 = 61 / 0;
                        if (!zContains) {
                            int i34 = b;
                            i = ((i34 | 69) << 1) - (i34 ^ 69);
                            a = i % 128;
                            if (i % 2 == 0) {
                                arrayList.add(next);
                                int i35 = 10 / 0;
                            } else {
                                arrayList.add(next);
                            }
                        }
                    } else if (!zContains) {
                        int i36 = b;
                        i = ((i36 | 69) << 1) - (i36 ^ 69);
                        a = i % 128;
                        if (i % 2 == 0) {
                            arrayList.add(next);
                            int i37 = 10 / 0;
                        } else {
                            arrayList.add(next);
                        }
                    }
                }
            }
        } else if (!bjp.g.isEmpty()) {
            int i38 = b;
            int i39 = i38 & 123;
            int i40 = i39 + ((i38 ^ 123) | i39);
            a = i40 % 128;
            int i41 = i40 % 2;
            Iterator<Map.Entry<String, String>> it3 = bjp.g.entrySet().iterator();
            int i42 = b;
            int i43 = ((i42 | 37) << 1) - (i42 ^ 37);
            a = i43 % 128;
            int i44 = i43 % 2;
            while (it3.hasNext()) {
                int i45 = b;
                int i46 = (i45 & 23) + (i45 | 23);
                a = i46 % 128;
                if (i46 % 2 == 0) {
                    it3.next();
                    obj.hashCode();
                    throw null;
                }
                Map.Entry<String, String> next2 = it3.next();
                int i47 = a;
                int i48 = i47 & 97;
                int i49 = (((i47 | 97) & (~i48)) - (~(-(-(i48 << 1))))) - 1;
                b = i49 % 128;
                if (i49 % 2 != 0) {
                    int i50 = 3 / 0;
                    if (!treeSet.contains(next2.getKey())) {
                        C0097t c0097t = new C0097t(next2.getKey(), next2.getValue());
                        int i51 = a;
                        int i52 = i51 & 73;
                        int i53 = i52 + ((i51 ^ 73) | i52);
                        b = i53 % 128;
                        int i54 = i53 % 2;
                        arrayList.add(c0097t);
                        int i55 = b;
                        int i56 = ((i55 | 49) << 1) - (i55 ^ 49);
                        a = i56 % 128;
                        int i57 = i56 % 2;
                    }
                } else if (!treeSet.contains(next2.getKey())) {
                    C0097t c0097t2 = new C0097t(next2.getKey(), next2.getValue());
                    int i58 = a;
                    int i59 = i58 & 73;
                    int i510 = i59 + ((i58 ^ 73) | i59);
                    b = i510 % 128;
                    int i511 = i510 % 2;
                    arrayList.add(c0097t2);
                    int i512 = b;
                    int i513 = ((i512 | 49) << 1) - (i512 ^ 49);
                    a = i513 % 128;
                    int i514 = i513 % 2;
                }
            }
        }
        C0095o c0095o2 = new C0095o(304, bjp.a, true, j, arrayList);
        int i60 = b;
        int i61 = i60 & 117;
        int i62 = -(-((i60 ^ 117) | i61));
        int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
        a = i63 % 128;
        int i64 = i63 % 2;
        return c0095o2;
    }

    public static byte[] c(InputStream inputStream, int i, c cVar) throws Throwable {
        byte[] bArrC;
        int i2 = 2 % 2;
        t tVar = new t(cVar, i);
        int i3 = b;
        int i4 = i3 & 23;
        int i5 = i4 + ((i3 ^ 23) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        try {
            bArrC = cVar.c(1024);
            int i7 = a;
            int i8 = i7 & 123;
            int i9 = (i7 | 123) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 & i10) + (i9 | i10);
            b = i11 % 128;
            int i12 = i11 % 2;
            while (true) {
                try {
                    int i13 = inputStream.read(bArrC);
                    if (i13 == -1) {
                        break;
                    }
                    int i14 = b;
                    int i15 = i14 & 87;
                    int i16 = i15 + ((i14 ^ 87) | i15);
                    a = i16 % 128;
                    if (i16 % 2 == 0) {
                        tVar.write(bArrC, 1, i13);
                    } else {
                        tVar.write(bArrC, 0, i13);
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                        int i17 = b;
                        int i18 = i17 & 107;
                        int i19 = -(-(i17 | 107));
                        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                        a = i20 % 128;
                        int i21 = i20 % 2;
                    } catch (IOException unused) {
                        S.e("Error occurred when closing InputStream", new Object[0]);
                    }
                    cVar.d(bArrC);
                    tVar.close();
                    throw th;
                }
            }
            byte[] byteArray = tVar.toByteArray();
            try {
                inputStream.close();
                int i22 = b;
                int i23 = i22 & 111;
                int i24 = -(-((i22 ^ 111) | i23));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                a = i25 % 128;
                int i26 = i25 % 2;
            } catch (IOException unused2) {
                S.e("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.d(bArrC);
            tVar.close();
            int i27 = b + 69;
            a = i27 % 128;
            int i28 = i27 % 2;
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrC = null;
        }
    }
}
