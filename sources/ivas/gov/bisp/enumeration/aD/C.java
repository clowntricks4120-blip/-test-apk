package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooO0OO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class C extends OooO0OO<String> implements InterfaceC0062s, RandomAccess {
    private static int a = 1;
    private static int b;
    public final List<Object> d;

    public C(int i) {
        this.d = new ArrayList(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends String> collection) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 121;
        int i4 = i3 + ((i2 ^ 121) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        int size = size();
        if (i5 != 0) {
            return addAll(size, collection);
        }
        addAll(size, collection);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.InterfaceC0062s
    public Object d(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 55) + ((i3 & 55) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = this.d.get(i);
        int i6 = a + 101;
        b = i6 % 128;
        int i7 = i6 % 2;
        return obj;
    }

    public R.biN g(int i) {
        int i2 = 2 % 2;
        int i3 = b + 3;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            size();
            throw null;
        }
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.d);
        C c = new C((ArrayList<Object>) arrayList);
        int i4 = a;
        int i5 = (i4 ^ 57) + ((i4 & 57) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return c;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.InterfaceC0062s
    public List<?> n() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = ((i2 | 55) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        List<?> listUnmodifiableList = Collections.unmodifiableList(this.d);
        int i6 = a;
        int i7 = i6 & 109;
        int i8 = ((i6 ^ 109) | i7) << 1;
        int i9 = -((i6 | 109) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return listUnmodifiableList;
    }

    @Override // java.util.List
    public Object remove(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 3) | (i3 & 3)) << 1;
        int i5 = -(((~i3) & 3) | (i3 & (-4)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        d();
        Object objRemove = this.d.remove(i);
        int i8 = b;
        int i9 = i8 & 27;
        int i10 = i9 + ((i8 ^ 27) | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = ((AbstractList) this).modCount;
        ((AbstractList) this).modCount = ((i12 ^ 2) + ((i12 & 2) << 1)) - 1;
        String strE = e(objRemove);
        int i13 = a;
        int i14 = i13 ^ 29;
        int i15 = ((((i13 & 29) | i14) << 1) - (~(-i14))) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
        return strE;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 24) + (i2 | 24)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int size = this.d.size();
        int i5 = b;
        int i6 = i5 ^ 37;
        int i7 = (i5 & 37) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        new C(10).c = false;
        int i = a;
        int i2 = i ^ 97;
        int i3 = ((i & 97) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String e(Object obj) {
        String strM;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 31) - (~((i2 & 31) << 1))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof String;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(!(obj instanceof String))) {
            int i4 = (((i2 | 16) << 1) - (i2 ^ 16)) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            String str = (String) obj;
            int i6 = i2 + 53;
            a = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }
        if (!(obj instanceof AbstractC0069z)) {
            String str2 = new String((byte[]) obj, R.c);
            int i8 = b;
            int i9 = (i8 & 113) + (i8 | 113);
            a = i9 % 128;
            int i10 = i9 % 2;
            return str2;
        }
        int i11 = i2 + 43;
        a = i11 % 128;
        int i12 = i11 % 2;
        AbstractC0069z abstractC0069z = (AbstractC0069z) obj;
        Objects.requireNonNull(abstractC0069z);
        Charset charset = R.c;
        int i13 = b;
        int i14 = (i13 & 87) + (i13 | 87);
        a = i14 % 128;
        int i15 = i14 % 2;
        if (abstractC0069z.size() == 0) {
            int i16 = (-2) - ((b + 118) ^ (-1));
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            int i19 = ((i17 | 7) << 1) - (i17 ^ 7);
            b = i19 % 128;
            int i20 = i19 % 2;
            strM = BuildConfig.FLAVOR;
        } else {
            strM = abstractC0069z.m(charset);
            int i21 = a + 97;
            b = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 2 / 2;
            }
        }
        int i23 = b;
        int i24 = i23 ^ 89;
        int i25 = ((i23 & 89) | i24) << 1;
        int i26 = -i24;
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        a = i27 % 128;
        int i28 = i27 % 2;
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.C.b;
        r2 = ((r1 | 93) << 1) - (r1 ^ 93);
        ivas.gov.bisp.enumeration.aD.C.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.c != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.c != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.aD.ao(r4);
        r2 = ivas.gov.bisp.enumeration.aD.C.a + 61;
        ivas.gov.bisp.enumeration.aD.C.b = r2 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.aD.InterfaceC0062s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.aD.InterfaceC0062s b() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.C.b
            int r1 = r1 + 81
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.aD.C.a = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            boolean r1 = r4.c
            r2 = 32
            int r2 = r2 / 0
            if (r1 == 0) goto L31
            goto L1b
        L17:
            boolean r1 = r4.c
            if (r1 == 0) goto L31
        L1b:
            ivas.gov.bisp.enumeration.aD.ao r1 = new ivas.gov.bisp.enumeration.aD.ao
            r1.<init>(r4)
            int r2 = ivas.gov.bisp.enumeration.aD.C.a
            int r2 = r2 + 61
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.aD.C.b = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L2c
            return r1
        L2c:
            r0 = 0
            r0.hashCode()
            throw r0
        L31:
            int r1 = ivas.gov.bisp.enumeration.aD.C.b
            r2 = r1 | 93
            int r2 = r2 << 1
            r1 = r1 ^ 93
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.aD.C.a = r1
            int r2 = r2 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C.b():ivas.gov.bisp.enumeration.aD.s");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 12) + (i2 | 12)) - 1;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            d();
            this.d.clear();
            obj.hashCode();
            throw null;
        }
        d();
        this.d.clear();
        int i4 = b;
        int i5 = ((i4 & (-96)) | ((~i4) & 95)) + ((i4 & 95) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = ((AbstractList) this).modCount;
        int i8 = i7 & 1;
        ((AbstractList) this).modCount = (((i7 ^ 1) | i8) << 1) - ((i7 | 1) & (~i8));
        int i9 = a + 13;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[PHI: r3
  0x0053: PHI (r3v9 java.lang.Object) = (r3v4 java.lang.Object), (r3v39 java.lang.Object) binds: [B:8:0x002f, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:34:0x0103  */
    /* JADX WARN: Code duplicated, block: B:44:0x014c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0165  */
    /* JADX WARN: Code duplicated, block: B:47:0x017e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r3
  0x0031: PHI (r3v5 java.lang.Object) = (r3v4 java.lang.Object), (r3v39 java.lang.Object) binds: [B:8:0x002f, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.List
    public Object get(int i) {
        Object obj;
        int i2;
        int i3;
        String str;
        String str2;
        int i4;
        int i5;
        AbstractC0069z abstractC0069z;
        Charset charset;
        int i6;
        String strM;
        int i7;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = i9 & 41;
        int i11 = (i9 ^ 41) | i10;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        boolean z = false;
        Object obj2 = null;
        if (i12 % 2 == 0) {
            obj = this.d.get(i);
            int i13 = 45 / 0;
            if (obj instanceof String) {
                int i14 = a;
                i2 = ((i14 ^ 7) - (~((i14 & 7) << 1))) - 1;
                i3 = i2 % 128;
                b = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                str = (String) obj;
                int i15 = (i3 & 3) + (i3 | 3);
                a = i15 % 128;
                int i16 = i15 % 2;
            } else if (obj instanceof AbstractC0069z) {
                int i17 = b;
                int i18 = i17 & 25;
                int i19 = i17 | 25;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                a = i20 % 128;
                int i21 = i20 % 2;
                abstractC0069z = (AbstractC0069z) obj;
                Objects.requireNonNull(abstractC0069z);
                charset = R.c;
                int i22 = b;
                int i23 = i22 & 21;
                i6 = (((i22 | 21) & (~i23)) - (~(-(-(i23 << 1))))) - 1;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    int i24 = 1 / 0;
                    if (abstractC0069z.size() == 0) {
                        int i25 = b;
                        int i26 = i25 & 71;
                        int i27 = -(-((i25 ^ 71) | i26));
                        int i28 = (i26 & i27) + (i27 | i26);
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        strM = BuildConfig.FLAVOR;
                    } else {
                        strM = abstractC0069z.m(charset);
                        int i30 = b;
                        int i31 = i30 & 97;
                        int i32 = -(-((i30 ^ 97) | i31));
                        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                    }
                } else if (abstractC0069z.size() == 0) {
                    int i210 = b;
                    int i211 = i210 & 71;
                    int i212 = -(-((i210 ^ 71) | i211));
                    int i213 = (i211 & i212) + (i212 | i211);
                    a = i213 % 128;
                    int i214 = i213 % 2;
                    strM = BuildConfig.FLAVOR;
                } else {
                    strM = abstractC0069z.m(charset);
                    int i35 = b;
                    int i36 = i35 & 97;
                    int i37 = -(-((i35 ^ 97) | i36));
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                }
                if (abstractC0069z.i()) {
                    int i40 = a;
                    int i41 = i40 & 29;
                    int i42 = ((i40 ^ 29) | i41) << 1;
                    int i43 = -((i40 | 29) & (~i41));
                    i7 = (i42 & i43) + (i43 | i42);
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        this.d.set(i, strM);
                        obj2.hashCode();
                        throw null;
                    }
                    this.d.set(i, strM);
                    int i44 = b;
                    int i45 = (((i44 & (-56)) | ((~i44) & 55)) - (~(-(-((i44 & 55) << 1))))) - 1;
                    a = i45 % 128;
                    int i46 = i45 % 2;
                }
                str = strM;
            } else {
                byte[] bArr = (byte[]) obj;
                str2 = new String(bArr, R.c);
                int i47 = b;
                int i48 = (i47 & 69) + (i47 | 69);
                a = i48 % 128;
                int i49 = i48 % 2;
                as.bkT bkt = as.c;
                int length = bArr.length;
                i4 = b + 53;
                a = i4 % 128;
                if (i4 % 2 == 0 ? bkt.e(0, bArr, 0, length) == 0 : bkt.e(1, bArr, 1, length) == 0) {
                    int i50 = a;
                    int i51 = i50 & 121;
                    int i52 = ((((i50 ^ 121) | i51) << 1) - (~(-((i50 | 121) & (~i51))))) - 1;
                    b = i52 % 128;
                    int i53 = i52 % 2;
                    z = true;
                }
                if (!(!z)) {
                    int i54 = b;
                    int i55 = i54 & 31;
                    int i56 = ((i54 ^ 31) | i55) << 1;
                    int i57 = -((i54 | 31) & (~i55));
                    i5 = (i56 ^ i57) + ((i57 & i56) << 1);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        this.d.set(i, str2);
                        obj2.hashCode();
                        throw null;
                    }
                    this.d.set(i, str2);
                    int i58 = b + 39;
                    int i59 = i58 % 128;
                    a = i59;
                    int i60 = i58 % 2;
                    int i61 = (i59 & 119) + (i59 | 119);
                    b = i61 % 128;
                    int i62 = i61 % 2;
                }
                str = str2;
            }
        } else {
            obj = this.d.get(i);
            if (obj instanceof String) {
                int i110 = a;
                i2 = ((i110 ^ 7) - (~((i110 & 7) << 1))) - 1;
                i3 = i2 % 128;
                b = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                str = (String) obj;
                int i111 = (i3 & 3) + (i3 | 3);
                a = i111 % 128;
                int i112 = i111 % 2;
            } else if (obj instanceof AbstractC0069z) {
                int i113 = b;
                int i114 = i113 & 25;
                int i115 = i113 | 25;
                int i215 = ((i114 | i115) << 1) - (i115 ^ i114);
                a = i215 % 128;
                int i216 = i215 % 2;
                abstractC0069z = (AbstractC0069z) obj;
                Objects.requireNonNull(abstractC0069z);
                charset = R.c;
                int i217 = b;
                int i218 = i217 & 21;
                i6 = (((i217 | 21) & (~i218)) - (~(-(-(i218 << 1))))) - 1;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    int i219 = 1 / 0;
                    if (abstractC0069z.size() == 0) {
                        int i2110 = b;
                        int i2111 = i2110 & 71;
                        int i2112 = -(-((i2110 ^ 71) | i2111));
                        int i2113 = (i2111 & i2112) + (i2112 | i2111);
                        a = i2113 % 128;
                        int i2114 = i2113 % 2;
                        strM = BuildConfig.FLAVOR;
                    } else {
                        strM = abstractC0069z.m(charset);
                        int i310 = b;
                        int i311 = i310 & 97;
                        int i312 = -(-((i310 ^ 97) | i311));
                        int i313 = ((i311 | i312) << 1) - (i312 ^ i311);
                        a = i313 % 128;
                        int i314 = i313 % 2;
                    }
                } else if (abstractC0069z.size() == 0) {
                    int i2115 = b;
                    int i2116 = i2115 & 71;
                    int i2117 = -(-((i2115 ^ 71) | i2116));
                    int i2118 = (i2116 & i2117) + (i2117 | i2116);
                    a = i2118 % 128;
                    int i2119 = i2118 % 2;
                    strM = BuildConfig.FLAVOR;
                } else {
                    strM = abstractC0069z.m(charset);
                    int i315 = b;
                    int i316 = i315 & 97;
                    int i317 = -(-((i315 ^ 97) | i316));
                    int i318 = ((i316 | i317) << 1) - (i317 ^ i316);
                    a = i318 % 128;
                    int i319 = i318 % 2;
                }
                if (abstractC0069z.i()) {
                    int i410 = a;
                    int i411 = i410 & 29;
                    int i412 = ((i410 ^ 29) | i411) << 1;
                    int i413 = -((i410 | 29) & (~i411));
                    i7 = (i412 & i413) + (i413 | i412);
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        this.d.set(i, strM);
                        obj2.hashCode();
                        throw null;
                    }
                    this.d.set(i, strM);
                    int i414 = b;
                    int i415 = (((i414 & (-56)) | ((~i414) & 55)) - (~(-(-((i414 & 55) << 1))))) - 1;
                    a = i415 % 128;
                    int i416 = i415 % 2;
                }
                str = strM;
            } else {
                byte[] bArr2 = (byte[]) obj;
                str2 = new String(bArr2, R.c);
                int i417 = b;
                int i418 = (i417 & 69) + (i417 | 69);
                a = i418 % 128;
                int i419 = i418 % 2;
                as.bkT bkt2 = as.c;
                int length2 = bArr2.length;
                i4 = b + 53;
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i510 = a;
                    int i511 = i510 & 121;
                    int i512 = ((((i510 ^ 121) | i511) << 1) - (~(-((i510 | 121) & (~i511))))) - 1;
                    b = i512 % 128;
                    int i513 = i512 % 2;
                    z = true;
                } else {
                    int i514 = a;
                    int i515 = i514 & 121;
                    int i516 = ((((i514 ^ 121) | i515) << 1) - (~(-((i514 | 121) & (~i515))))) - 1;
                    b = i516 % 128;
                    int i517 = i516 % 2;
                    z = true;
                }
                if (!(!z)) {
                    int i518 = b;
                    int i519 = i518 & 31;
                    int i520 = ((i518 ^ 31) | i519) << 1;
                    int i521 = -((i518 | 31) & (~i519));
                    i5 = (i520 ^ i521) + ((i521 & i520) << 1);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        this.d.set(i, str2);
                        obj2.hashCode();
                        throw null;
                    }
                    this.d.set(i, str2);
                    int i522 = b + 39;
                    int i523 = i522 % 128;
                    a = i523;
                    int i63 = i522 % 2;
                    int i64 = (i523 & 119) + (i523 | 119);
                    b = i64 % 128;
                    int i65 = i64 % 2;
                }
                str = str2;
            }
        }
        int i66 = a;
        int i67 = i66 ^ 49;
        int i68 = (((i66 & 49) | i67) << 1) - i67;
        b = i68 % 128;
        if (i68 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-112)) | ((~i3) & 111);
        int i5 = -(-((i3 & 111) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        d();
        List<Object> list = this.d;
        int i8 = b;
        int i9 = i8 & 41;
        int i10 = (i8 ^ 41) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        list.add(i, (String) obj);
        int i13 = ((AbstractList) this).modCount;
        int i14 = b;
        int i15 = ((((i14 ^ 61) | (i14 & 61)) << 1) - (~(-(((~i14) & 61) | (i14 & (-62)))))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = i13 & 1;
        int i18 = -(-((i13 ^ 1) | i17));
        ((AbstractList) this).modCount = ((i17 | i18) << 1) - (i18 ^ i17);
        int i19 = b;
        int i20 = ((i19 & (-70)) | ((~i19) & 69)) + ((i19 & 69) << 1);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 64 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 61;
        int i5 = (i3 | 61) & (~i4);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            d();
            int i8 = 14 / 0;
            if (!(!(collection instanceof InterfaceC0062s))) {
                int i9 = b;
                int i10 = i9 ^ 69;
                int i11 = ((i9 & 69) | i10) << 1;
                int i12 = -i10;
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                collection = ((InterfaceC0062s) collection).n();
                int i15 = b;
                int i16 = ((i15 | 69) << 1) - (i15 ^ 69);
                a = i16 % 128;
                int i17 = i16 % 2;
            }
        } else {
            d();
            if (!(!(collection instanceof InterfaceC0062s))) {
                int i18 = b;
                int i19 = i18 ^ 69;
                int i110 = ((i18 & 69) | i19) << 1;
                int i111 = -i19;
                int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                a = i112 % 128;
                int i113 = i112 % 2;
                collection = ((InterfaceC0062s) collection).n();
                int i114 = b;
                int i115 = ((i114 | 69) << 1) - (i114 ^ 69);
                a = i115 % 128;
                int i116 = i115 % 2;
            }
        }
        boolean zAddAll = this.d.addAll(i, collection);
        int i20 = a;
        int i21 = ((i20 ^ 112) + ((i20 & 112) << 1)) - 1;
        b = i21 % 128;
        if (i21 % 2 != 0) {
            ((AbstractList) this).modCount >>>= 1;
        } else {
            int i22 = ((AbstractList) this).modCount;
            ((AbstractList) this).modCount = (((i22 | 2) << 1) - (i22 ^ 2)) - 1;
        }
        int i23 = b;
        int i24 = (-2) - ((((i23 | 12) << 1) - (i23 ^ 12)) ^ (-1));
        a = i24 % 128;
        int i25 = i24 % 2;
        return zAddAll;
    }

    @Override // ivas.gov.bisp.enumeration.aD.InterfaceC0062s
    public void h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = i3 + ((i2 ^ 103) | i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            d();
            this.d.add(abstractC0069z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        d();
        this.d.add(abstractC0069z);
        int i5 = ((AbstractList) this).modCount;
        int i6 = i5 & 1;
        ((AbstractList) this).modCount = (i6 - (~((i5 ^ 1) | i6))) - 1;
        int i7 = b;
        int i8 = (i7 & (-112)) | ((~i7) & 111);
        int i9 = -(-((i7 & 111) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public C(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b + 65;
        a = i3 % 128;
        int i4 = i3 % 2;
        d();
        List<Object> list = this.d;
        int i5 = a + 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        String strE = e(list.set(i, (String) obj));
        int i7 = b;
        int i8 = i7 & 83;
        int i9 = ((i7 ^ 83) | i8) << 1;
        int i10 = -((i7 | 83) & (~i8));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        return strE;
    }
}
