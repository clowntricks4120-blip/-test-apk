package ivas.gov.bisp.enumeration.bN;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bS.aU;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class D extends al {
    private static int a = 0;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0046 A[DONT_INVERT, PHI: r1 r5
  0x0046: PHI (r1v21 java.util.Collection) = (r1v20 java.util.Collection), (r1v57 java.util.Collection) binds: [B:10:0x0044, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r5v23 int) = (r5v22 int), (r5v35 int) binds: [B:10:0x0044, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:0x007f  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a7  */
    public static final <T> List<T> aq(Iterable<? extends T> iterable) {
        ArrayList arrayList;
        Collection collection;
        int size;
        Object next;
        List<T> listT;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-6)) | ((~i2) & 5)) - (~((i2 & 5) << 1))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        r.n(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        Object obj = null;
        if (!z) {
            if (!z) {
                arrayList = new ArrayList();
                Iterator<? extends T> it = iterable.iterator();
                int i5 = b;
                int i6 = i5 & 121;
                int i7 = ((i5 ^ 121) | i6) << 1;
                int i8 = -((~i6) & (i5 | 121));
                int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i5 & 59;
                int i12 = (((i5 | 59) & (~i11)) - (~(i11 << 1))) - 1;
                a = i12 % 128;
                while (true) {
                    int i13 = i12 % 2;
                    if (!it.hasNext()) {
                        break;
                    }
                    int i14 = a;
                    int i15 = (((i14 & (-34)) | ((~i14) & 33)) - (~((i14 & 33) << 1))) - 1;
                    b = i15 % 128;
                    if (i15 % 2 == 0) {
                        arrayList.add(it.next());
                        throw null;
                    }
                    arrayList.add(it.next());
                    int i16 = b;
                    i12 = (-2) - (((i16 & 88) + (i16 | 88)) ^ (-1));
                    a = i12 % 128;
                }
            } else {
                arrayList = new ArrayList((Collection) iterable);
                int i17 = b;
                int i18 = (-2) - (((i17 ^ 48) + ((i17 & 48) << 1)) ^ (-1));
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 47 / 0;
                }
            }
            List<T> listV = ivas.gov.bisp.enumeration.p100w.r.V(arrayList);
            int i20 = b;
            int i21 = i20 & 39;
            int i22 = i21 + ((i20 ^ 39) | i21);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                return listV;
            }
            throw null;
        }
        int i23 = a;
        int i24 = (i23 ^ 15) + ((i23 & 15) << 1);
        b = i24 % 128;
        if (i24 % 2 == 0) {
            collection = (Collection) iterable;
            size = collection.size();
            int i25 = 92 / 0;
            if (size == 0) {
                listT = X.c;
                int i26 = b;
                int i27 = i26 ^ 83;
                int i28 = ((i26 & 83) | i27) << 1;
                int i29 = -i27;
                int i30 = (i28 & i29) + (i28 | i29);
                a = i30 % 128;
                int i31 = i30 % 2;
            } else if (size != 1) {
                listT = new ArrayList<>((Collection<? extends T>) collection);
                int i32 = a;
                int i33 = ((i32 & 113) - (~(i32 | 113))) - 1;
                b = i33 % 128;
                int i34 = i33 % 2;
            } else {
                if (iterable instanceof List) {
                    int i35 = b + 81;
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    next = ((List) iterable).get(0);
                    int i37 = a;
                    int i38 = i37 & 29;
                    int i39 = (i38 - (~((i37 ^ 29) | i38))) - 1;
                    b = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    next = iterable.iterator().next();
                    int i41 = b;
                    int i42 = i41 & 105;
                    int i43 = (((i41 ^ 105) | i42) << 1) - ((i41 | 105) & (~i42));
                    a = i43 % 128;
                    int i44 = i43 % 2;
                }
                listT = ivas.gov.bisp.enumeration.p100w.r.T(next);
                int i45 = b + 47;
                a = i45 % 128;
                int i46 = i45 % 2;
            }
        } else {
            collection = (Collection) iterable;
            size = collection.size();
            if (size == 0) {
                listT = X.c;
                int i210 = b;
                int i211 = i210 ^ 83;
                int i212 = ((i210 & 83) | i211) << 1;
                int i213 = -i211;
                int i310 = (i212 & i213) + (i212 | i213);
                a = i310 % 128;
                int i311 = i310 % 2;
            } else if (size != 1) {
                listT = new ArrayList<>((Collection<? extends T>) collection);
                int i312 = a;
                int i313 = ((i312 & 113) - (~(i312 | 113))) - 1;
                b = i313 % 128;
                int i314 = i313 % 2;
            } else {
                if (iterable instanceof List) {
                    int i315 = b + 81;
                    a = i315 % 128;
                    int i316 = i315 % 2;
                    next = ((List) iterable).get(0);
                    int i317 = a;
                    int i318 = i317 & 29;
                    int i319 = (i318 - (~((i317 ^ 29) | i318))) - 1;
                    b = i319 % 128;
                    int i47 = i319 % 2;
                } else {
                    next = iterable.iterator().next();
                    int i48 = b;
                    int i49 = i48 & 105;
                    int i410 = (((i48 ^ 105) | i49) << 1) - ((i48 | 105) & (~i49));
                    a = i410 % 128;
                    int i411 = i410 % 2;
                }
                listT = ivas.gov.bisp.enumeration.p100w.r.T(next);
                int i412 = b + 47;
                a = i412 % 128;
                int i413 = i412 % 2;
            }
        }
        int i50 = b;
        int i51 = ((i50 ^ 19) | (i50 & 19)) << 1;
        int i52 = -(((~i50) & 19) | (i50 & (-20)));
        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
        a = i53 % 128;
        if (i53 % 2 == 0) {
            return listT;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r9 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r9 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r8 = ((r1 ^ 94) + ((r1 & 94) << 1)) - 1;
        ivas.gov.bisp.enumeration.bN.D.a = r8 % 128;
        r8 = r8 % 2;
        r8 = ivas.gov.bisp.enumeration.bN.X.c;
        r9 = ivas.gov.bisp.enumeration.bN.D.a;
        r1 = ((r9 ^ 19) | (r9 & 19)) << 1;
        r9 = -(((~r9) & 19) | (r9 & (-20)));
        r2 = (r1 & r9) + (r9 | r1);
        ivas.gov.bisp.enumeration.bN.D.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if ((r2 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r1 = r8.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r9 < r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        r9 = ivas.gov.bisp.enumeration.bN.D.a;
        r1 = r9 ^ 109;
        r9 = ((r9 & 109) | r1) << 1;
        r1 = -r1;
        r2 = ((r9 | r1) << 1) - (r9 ^ r1);
        ivas.gov.bisp.enumeration.bN.D.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if ((r2 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r8 = aq(r8);
        r9 = ivas.gov.bisp.enumeration.bN.D.a + 70;
        r1 = (r9 ^ (-1)) + (r9 << 1);
        ivas.gov.bisp.enumeration.bN.D.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if ((r1 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r9 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        aq(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r9 != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        r9 = ivas.gov.bisp.enumeration.bN.D.b + 61;
        ivas.gov.bisp.enumeration.bN.D.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if ((r9 % 2) != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (r8.isEmpty() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        r9 = ivas.gov.bisp.enumeration.bN.D.b;
        r1 = r9 & 125;
        r9 = (r9 | 125) & (~r1);
        r1 = r1 << 1;
        r2 = ((r9 | r1) << 1) - (r9 ^ r1);
        ivas.gov.bisp.enumeration.bN.D.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if ((r2 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        r9 = r8.size();
        r1 = ivas.gov.bisp.enumeration.bN.D.a;
        r2 = ((r1 ^ 9) | (r1 & 9)) << 1;
        r1 = -(((~r1) & 9) | (r1 & (-10)));
        r4 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.bN.D.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        if ((r4 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        r8 = r8.get(r9 >>> 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f1, code lost:
    
        r0 = ~r9;
        r9 = -(-(r9 << 1));
        r8 = r8.get(((r0 | r9) << 1) - (r9 ^ r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0102, code lost:
    
        return ivas.gov.bisp.enumeration.p100w.r.T(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0103, code lost:
    
        r8.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
    
        throw new java.util.NoSuchElementException("List is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        r8.isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
    
        r2 = new java.util.ArrayList(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011a, code lost:
    
        if ((r8 instanceof java.util.RandomAccess) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011c, code lost:
    
        r5 = ivas.gov.bisp.enumeration.bN.D.b + 46;
        r6 = (r5 ^ (-1)) + (r5 << 1);
        r5 = r6 % 128;
        ivas.gov.bisp.enumeration.bN.D.a = r5;
        r6 = r6 % 2;
        r9 = -(~(-r9));
        r6 = ((r1 & r9) + (r9 | r1)) - 1;
        r9 = r5 ^ 75;
        r5 = ((r5 & 75) | r9) << 1;
        r9 = -r9;
        r7 = (r5 ^ r9) + ((r9 & r5) << 1);
        ivas.gov.bisp.enumeration.bN.D.b = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:
    
        if (r6 >= r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0144, code lost:
    
        r9 = ivas.gov.bisp.enumeration.bN.D.a;
        r5 = r9 ^ 59;
        r9 = (r9 & 59) << 1;
        r7 = (r5 ^ r9) + ((r9 & r5) << 1);
        ivas.gov.bisp.enumeration.bN.D.b = r7 % 128;
        r7 = r7 % 2;
        r2.add(r8.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015c, code lost:
    
        if (r7 != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015e, code lost:
    
        r9 = 65 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0161, code lost:
    
        r9 = r6 & 1;
        r5 = (r6 ^ 1) | r9;
        r6 = (r9 ^ r5) + ((r9 & r5) << 1);
        r9 = ivas.gov.bisp.enumeration.bN.D.a;
        r5 = (r9 & 75) + (r9 | 75);
        ivas.gov.bisp.enumeration.bN.D.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0178, code lost:
    
        r1 = r1 - (~(-r9));
        r8 = r8.listIterator((r1 ^ (-1)) + (r1 << 1));
        r9 = ivas.gov.bisp.enumeration.bN.D.b;
        r1 = r9 & 27;
        r9 = (r9 ^ 27) | r1;
        r4 = (r1 & r9) + (r9 | r1);
        ivas.gov.bisp.enumeration.bN.D.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0197, code lost:
    
        if (r8.hasNext() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0199, code lost:
    
        r9 = ivas.gov.bisp.enumeration.bN.D.a + 61;
        ivas.gov.bisp.enumeration.bN.D.b = r9 % 128;
        r9 = r9 % 2;
        r2.add(r8.next());
        r9 = ivas.gov.bisp.enumeration.bN.D.b;
        r4 = r9 & 25;
        r1 = ((r9 ^ 25) | r4) << 1;
        r9 = -((r9 | 25) & (~r4));
        r4 = ((r1 | r9) << 1) - (r9 ^ r1);
        ivas.gov.bisp.enumeration.bN.D.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c0, code lost:
    
        if ((r4 % 2) != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c4, code lost:
    
        r8 = ivas.gov.bisp.enumeration.bN.D.b;
        r9 = r8 & 87;
        r8 = -(-((r8 ^ 87) | r9));
        r1 = ((r9 | r8) << 1) - (r8 ^ r9);
        ivas.gov.bisp.enumeration.bN.D.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d7, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.util.List<T> as(java.util.List<? extends T> r8, int r9) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bN.D.as(java.util.List, int):java.util.List");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0191 A[PHI: r11 r14
  0x0191: PHI (r11v16 int) = (r11v15 int), (r11v25 int) binds: [B:48:0x018f, B:45:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0191: PHI (r14v8 java.lang.Object) = (r14v7 java.lang.Object), (r14v17 java.lang.Object) binds: [B:48:0x018f, B:45:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b7  */
    public static String ar(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, aU aUVar, int i2) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        String str;
        aU aUVar2;
        Iterator it;
        int i4;
        Object next;
        int i5;
        boolean z;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = (i7 ^ 84) + ((i7 & 84) << 1);
        int i9 = -1;
        int i10 = i8 - 1;
        int i11 = i10 % 128;
        a = i11;
        int i12 = i10 % 2;
        Object obj = null;
        if ((i2 & 1) != 0) {
            int i13 = i11 & 125;
            int i14 = (((~i13) & (i11 | 125)) - (~(i13 << 1))) - 1;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        int i15 = i2 & 2;
        String str2 = BuildConfig.FLAVOR;
        if (i15 != 0) {
            int i16 = (i11 ^ 87) + ((i11 & 87) << 1);
            b = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
            charSequence6 = BuildConfig.FLAVOR;
        } else {
            int i17 = i11 & 21;
            int i18 = (~i17) & (i11 | 21);
            int i19 = i17 << 1;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            charSequence6 = null;
        }
        if ((i2 & 4) == 0) {
            int i22 = (i11 ^ 9) + ((i11 & 9) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
            int i24 = i11 & 49;
            int i25 = (~i24) & (i11 | 49);
            int i26 = i24 << 1;
            int i27 = (i25 & i26) + (i26 | i25);
            b = i27 % 128;
            int i28 = i27 % 2;
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            int i29 = (((i11 ^ 79) | (i11 & 79)) << 1) - ((i11 & (-80)) | ((~i11) & 79));
            b = i29 % 128;
            int i30 = i29 % 2;
            int i31 = (i11 ^ 125) + ((i11 & 125) << 1);
            b = i31 % 128;
            int i32 = i31 % 2;
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            int i33 = b;
            int i34 = i33 ^ 111;
            int i35 = (((i33 & 111) | i34) << 1) - i34;
            a = i35 % 128;
            if (i35 % 2 != 0) {
                throw null;
            }
            int i36 = i33 + 83;
            a = i36 % 128;
            int i37 = i36 % 2;
            str = "...";
        } else {
            int i38 = i11 + 93;
            b = i38 % 128;
            int i39 = i38 % 2;
            str = null;
        }
        if ((i2 & 32) != 0) {
            int i40 = b;
            int i41 = i40 | 17;
            int i42 = i41 << 1;
            int i43 = -((~(i40 & 17)) & i41);
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            int i45 = i44 % 128;
            a = i45;
            int i46 = i44 % 2;
            int i47 = i45 & 45;
            int i48 = ((i45 ^ 45) | i47) << 1;
            int i49 = -((i45 | 45) & (~i47));
            int i50 = (i48 & i49) + (i49 | i48);
            b = i50 % 128;
            int i51 = i50 % 2;
            aUVar2 = null;
        } else {
            aUVar2 = aUVar;
        }
        r.n(charSequence5, "separator");
        r.n(charSequence6, "prefix");
        r.n(str2, "postfix");
        r.n(str, "truncated");
        StringBuilder sb = new StringBuilder();
        int i52 = (-2) - ((a + 30) ^ (-1));
        b = i52 % 128;
        if (i52 % 2 == 0) {
            sb.append(charSequence6);
            it = iterable.iterator();
            i4 = 1;
        } else {
            sb.append(charSequence6);
            it = iterable.iterator();
            i4 = 0;
        }
        int i53 = a;
        int i54 = ((i53 ^ 70) + ((i53 & 70) << 1)) - 1;
        b = i54 % 128;
        int i55 = i54 % 2;
        while (it.hasNext()) {
            int i56 = b;
            int i57 = (i56 ^ 107) + ((i56 & 107) << 1);
            a = i57 % 128;
            if (i57 % 2 != 0) {
                next = it.next();
                int i58 = ((i4 ^ (-2)) | (i4 & (-2))) << 1;
                int i59 = -((i4 & 1) | ((~i4) & (-2)));
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                int i61 = i60 & 107;
                int i62 = -(-((i60 ^ 107) | i61));
                i4 = (i61 & i62) + (i61 | i62);
                if (i4 > 1) {
                    int i63 = b;
                    int i64 = i63 & 115;
                    int i65 = -(-(i63 | 115));
                    int i66 = ((i64 | i65) << 1) - (i64 ^ i65);
                    a = i66 % 128;
                    int i67 = i66 % 2;
                    sb.append(charSequence5);
                    int i68 = b;
                    i5 = (i68 & 71) + (i68 | 71);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i69 = 3 / 5;
                    }
                }
            } else {
                next = it.next();
                int i70 = i4 - 116;
                int i71 = i70 & 117;
                int i72 = -(-((i70 ^ 117) | i71));
                i4 = (i71 & i72) + (i72 | i71);
                if (i4 > 1) {
                    int i610 = b;
                    int i611 = i610 & 115;
                    int i612 = -(-(i610 | 115));
                    int i613 = ((i611 | i612) << 1) - (i611 ^ i612);
                    a = i613 % 128;
                    int i614 = i613 % 2;
                    sb.append(charSequence5);
                    int i615 = b;
                    i5 = (i615 & 71) + (i615 | 71);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i616 = 3 / 5;
                    }
                }
            }
            if (i3 >= 0) {
                int i73 = b;
                int i74 = (i73 ^ 105) + ((i73 & 105) << 1);
                a = i74 % 128;
                if (i74 % 2 != 0) {
                    throw null;
                }
                if (i4 > i3) {
                    break;
                }
            }
            if (aUVar2 != null) {
                int i75 = b;
                int i76 = (i75 & 82) + (i75 | 82) + i9;
                a = i76 % 128;
                if (i76 % 2 != 0) {
                    sb.append((CharSequence) aUVar2.e(next));
                    int i77 = 1 / 0;
                } else {
                    sb.append((CharSequence) aUVar2.e(next));
                }
                int i78 = b;
                int i79 = i78 & 37;
                int i80 = -(-((i78 ^ 37) | i79));
                int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                a = i81 % 128;
                int i82 = i81 % 2;
            } else {
                if (next != null) {
                    int i83 = a;
                    int i84 = (((~i83) & 105) | (i83 & (-106))) + ((i83 & 105) << 1);
                    b = i84 % 128;
                    if (i84 % 2 == 0) {
                        boolean z2 = next instanceof CharSequence;
                        throw null;
                    }
                    z = next instanceof CharSequence;
                    int i85 = i83 & 101;
                    int i86 = ((i83 ^ 101) | i85) << 1;
                    int i87 = -((i83 | 101) & (~i85));
                    int i88 = ((i86 | i87) << 1) - (i86 ^ i87);
                    b = i88 % 128;
                    int i89 = i88 % 2;
                } else {
                    z = true;
                }
                if (z) {
                    int i90 = a;
                    int i91 = i90 | 23;
                    int i92 = ((i91 << 1) - (~(-((~(i90 & 23)) & i91)))) - 1;
                    b = i92 % 128;
                    int i93 = i92 % 2;
                    sb.append((CharSequence) next);
                    int i94 = a;
                    int i95 = (i94 ^ 93) + ((i94 & 93) << 1);
                    b = i95 % 128;
                    if (i95 % 2 == 0) {
                        int i96 = 5 % 5;
                    }
                } else if (next instanceof Character) {
                    int i97 = b;
                    int i98 = i97 | 43;
                    int i99 = (i98 << 1) - ((~(i97 & 43)) & i98);
                    a = i99 % 128;
                    if (i99 % 2 != 0) {
                        sb.append(((Character) next).charValue());
                        int i100 = 68 / 0;
                    } else {
                        sb.append(((Character) next).charValue());
                    }
                    int i101 = a;
                    int i102 = (i101 ^ 17) + ((i101 & 17) << 1);
                    b = i102 % 128;
                    int i103 = i102 % 2;
                } else {
                    sb.append((CharSequence) String.valueOf(next));
                    int i104 = a;
                    int i105 = (i104 ^ 119) + ((i104 & 119) << 1);
                    b = i105 % 128;
                    int i106 = i105 % 2;
                }
            }
            i9 = -1;
        }
        if (i3 >= 0) {
            int i107 = a + 97;
            int i108 = i107 % 128;
            b = i108;
            int i109 = i107 % 2;
            if (i4 > i3) {
                int i110 = (i108 & 62) + (i108 | 62);
                int i111 = (i110 ^ (-1)) + (i110 << 1);
                a = i111 % 128;
                if (i111 % 2 != 0) {
                    sb.append((CharSequence) str);
                    obj.hashCode();
                    throw null;
                }
                sb.append((CharSequence) str);
                int i112 = b;
                int i113 = ((i112 & 88) + (i112 | 88)) - 1;
                a = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        sb.append((CharSequence) str2);
        String string = sb.toString();
        int i115 = a;
        int i116 = i115 ^ 89;
        int i117 = -(-((i115 & 89) << 1));
        int i118 = (i116 & i117) + (i117 | i116);
        b = i118 % 128;
        if (i118 % 2 == 0) {
            r.m(string, "joinTo(StringBuilder(), …ed, transform).toString()");
            int i119 = 99 / 0;
        } else {
            r.m(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        }
        int i120 = a;
        int i121 = (((i120 | 37) << 1) - (~(-(((~i120) & 37) | (i120 & (-38)))))) - 1;
        b = i121 % 128;
        int i122 = i121 % 2;
        return string;
    }
}
