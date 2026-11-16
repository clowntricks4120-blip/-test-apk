package ivas.gov.bisp.enumeration.F;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import ivas.gov.bisp.enumeration.p027b.an;
import ivas.gov.bisp.enumeration.p027b.ap;
import ivas.gov.bisp.enumeration.p027b.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class al extends ap {
    private static int a = 1;
    private static int b;
    public static final w e = new aYC();
    public final boolean h;
    public final HashMap<String, Fragment> f = new HashMap<>();
    public final HashMap<String, al> g = new HashMap<>();
    public final HashMap<String, an> i = new HashMap<>();
    public boolean j = false;
    public boolean k = false;

    public class aYC implements w {
        private static int a = 0;
        private static int b = 1;

        @Override // ivas.gov.bisp.enumeration.p027b.w
        public <T extends ap> T b(Class<T> cls) {
            int i = 2 % 2;
            al alVar = new al(true);
            int i2 = a;
            int i3 = (i2 | 49) << 1;
            int i4 = -(i2 ^ 49);
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            return alVar;
        }
    }

    static {
        int i = b + 121;
        a = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public al(boolean z) {
        this.h = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ((r2 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r5 = 22 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r4.f.containsKey(r5.mWho) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r5 = ivas.gov.bisp.enumeration.F.al.b;
        r1 = r5 & 35;
        r1 = (r1 - (~((r5 ^ 35) | r1))) - 1;
        ivas.gov.bisp.enumeration.F.al.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r4.f.put(r5.mWho, r5);
        r5 = ivas.gov.bisp.enumeration.F.al.a;
        r1 = r5 & 69;
        r1 = (r1 - (~((r5 ^ 69) | r1))) - 1;
        ivas.gov.bisp.enumeration.F.al.b = r1 % 128;
        r1 = r1 % 2;
        androidx.fragment.app.h.b(2);
        r5 = ivas.gov.bisp.enumeration.F.al.a;
        r3 = r5 & 31;
        r1 = (((r5 ^ 31) | r3) << 1) - ((r5 | 31) & (~r3));
        ivas.gov.bisp.enumeration.F.al.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if ((r1 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.k != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.k != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r5 = r2 & 73;
        r1 = (~r5) & (r2 | 73);
        r5 = -(-(r5 << 1));
        r2 = (r1 ^ r5) + ((r5 & r1) << 1);
        ivas.gov.bisp.enumeration.F.al.b = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.fragment.app.Fragment r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.F.al.b
            int r1 = r1 + 115
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.F.al.a = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            boolean r1 = r4.k
            r3 = 13
            int r3 = r3 / 0
            if (r1 == 0) goto L37
            goto L1b
        L17:
            boolean r1 = r4.k
            if (r1 == 0) goto L37
        L1b:
            r5 = r2 & 73
            int r1 = ~r5
            r2 = r2 | 73
            r1 = r1 & r2
            int r5 = r5 << 1
            int r5 = -r5
            int r5 = -r5
            r2 = r1 ^ r5
            r5 = r5 & r1
            int r5 = r5 << 1
            int r2 = r2 + r5
            int r5 = r2 % 128
            ivas.gov.bisp.enumeration.F.al.b = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L36
            r5 = 22
            int r5 = r5 / 0
        L36:
            return
        L37:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r4.f
            java.lang.String r2 = r5.mWho
            boolean r1 = r1.containsKey(r2)
            r2 = 0
            if (r1 == 0) goto L56
            int r5 = ivas.gov.bisp.enumeration.F.al.b
            r1 = r5 & 35
            r5 = r5 ^ 35
            r5 = r5 | r1
            int r5 = ~r5
            int r1 = r1 - r5
            int r1 = r1 + (-1)
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.F.al.a = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L55
            return
        L55:
            throw r2
        L56:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r4.f
            java.lang.String r3 = r5.mWho
            r1.put(r3, r5)
            int r5 = ivas.gov.bisp.enumeration.F.al.a
            r1 = r5 & 69
            r5 = r5 ^ 69
            r5 = r5 | r1
            int r5 = ~r5
            int r1 = r1 - r5
            int r1 = r1 + (-1)
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.F.al.b = r5
            int r1 = r1 % r0
            androidx.fragment.app.h.b(r0)
            int r5 = ivas.gov.bisp.enumeration.F.al.a
            r1 = r5 ^ 31
            r3 = r5 & 31
            r1 = r1 | r3
            int r1 = r1 << 1
            int r3 = ~r3
            r5 = r5 | 31
            r5 = r5 & r3
            int r1 = r1 - r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.F.al.b = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L86
            return
        L86:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.F.al.e(androidx.fragment.app.Fragment):void");
    }

    public final boolean g(Fragment fragment) {
        int i = 2 % 2;
        int i2 = b + 107;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.f.containsKey(fragment.mWho);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.f.containsKey(fragment.mWho)) {
            int i3 = a;
            int i4 = i3 & 37;
            int i5 = (i3 | 37) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            b = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (!this.h) {
            int i9 = a;
            int i10 = ((i9 ^ 70) + ((i9 & 70) << 1)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        int i12 = a;
        int i13 = ((i12 | 80) << 1) - (i12 ^ 80);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return this.j;
        }
        int i15 = 10 / 0;
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0134  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138 A[SYNTHETIC] */
    public final String toString() {
        int i;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        int i3 = a + 46;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        sb.append(Integer.toHexString(iIdentityHashCode));
        sb.append("} Fragments (");
        int i6 = b;
        int i7 = i6 & 23;
        int i8 = (i7 - (~(-(-((i6 ^ 23) | i7))))) - 1;
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            this.f.values().iterator();
            throw null;
        }
        Iterator<Fragment> it = this.f.values().iterator();
        int i9 = a;
        int i10 = (i9 ^ 33) + ((i9 & 33) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        while (!(!it.hasNext())) {
            int i12 = b;
            int i13 = (i12 & (-80)) | ((~i12) & 79);
            int i14 = (i12 & 79) << 1;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                sb.append(it.next());
                obj.hashCode();
                throw null;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                int i16 = b;
                int i17 = i16 & 107;
                int i18 = -(-((i16 ^ 107) | i17));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    sb.append(", ");
                    obj.hashCode();
                    throw null;
                }
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Set<String> setKeySet = this.g.keySet();
        int i20 = a;
        int i21 = (i20 & (-34)) | ((~i20) & 33);
        int i22 = (i20 & 33) << 1;
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        b = i23 % 128;
        int i24 = i23 % 2;
        Iterator<String> it2 = setKeySet.iterator();
        int i25 = b;
        int i26 = i25 & 3;
        int i27 = ((i25 | 3) & (~i26)) + (i26 << 1);
        a = i27 % 128;
        int i28 = i27 % 2;
        while (!(!it2.hasNext())) {
            int i29 = a + 13;
            b = i29 % 128;
            int i30 = i29 % 2;
            sb.append(it2.next());
            int i31 = a;
            int i32 = i31 ^ 41;
            int i33 = -(-((i31 & 41) << 1));
            int i34 = (i32 & i33) + (i33 | i32);
            b = i34 % 128;
            if (i34 % 2 != 0) {
                int i35 = 44 / 0;
                if (it2.hasNext()) {
                    int i36 = b;
                    i = (((i36 & (-4)) | ((~i36) & 3)) - (~(-(-((i36 & 3) << 1))))) - 1;
                    a = i % 128;
                    if (i % 2 != 0) {
                        sb.append(", ");
                        obj.hashCode();
                        throw null;
                    }
                    sb.append(", ");
                } else {
                    continue;
                }
            } else if (it2.hasNext()) {
                int i37 = b;
                i = (((i37 & (-4)) | ((~i37) & 3)) - (~(-(-((i37 & 3) << 1))))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    sb.append(", ");
                    obj.hashCode();
                    throw null;
                }
                sb.append(", ");
            } else {
                continue;
            }
        }
        sb.append(") ViewModelStores (");
        HashMap<String, an> map = this.i;
        int i38 = a;
        int i39 = i38 ^ 31;
        int i40 = (((i38 & 31) | i39) << 1) - i39;
        b = i40 % 128;
        int i41 = i40 % 2;
        Iterator<String> it3 = map.keySet().iterator();
        if (i41 != 0) {
            int i42 = 94 / 0;
        }
        while (!(!it3.hasNext())) {
            int i43 = a;
            int i44 = i43 & 123;
            int i45 = (i43 | 123) & (~i44);
            int i46 = i44 << 1;
            int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
            b = i47 % 128;
            int i48 = i47 % 2;
            sb.append(it3.next());
            int i49 = b;
            int i50 = (i49 & 89) + (i49 | 89);
            a = i50 % 128;
            int i51 = i50 % 2;
            if (it3.hasNext()) {
                int i52 = b;
                int i53 = (((i52 & (-48)) | ((~i52) & 47)) - (~((i52 & 47) << 1))) - 1;
                a = i53 % 128;
                int i54 = i53 % 2;
                sb.append(", ");
                int i55 = a;
                int i56 = i55 & 95;
                int i57 = i56 + ((i55 ^ 95) | i56);
                b = i57 % 128;
                int i58 = i57 % 2;
            }
        }
        sb.append(')');
        String string = sb.toString();
        int i59 = a;
        int i60 = i59 & 123;
        int i61 = -(-((i59 ^ 123) | i60));
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        b = i62 % 128;
        int i63 = i62 % 2;
        return string;
    }

    @Override // ivas.gov.bisp.enumeration.p027b.ap
    public final void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 81;
        int i4 = ((((i2 & 81) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        h.b(i4 % 2 == 0 ? 5 : 3);
        this.j = true;
    }

    public final void f(Fragment fragment) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 27) | (i2 & 27)) << 1;
        int i4 = -(((~i2) & 27) | (i2 & (-28)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this.k) {
            int i8 = ((i6 | 71) << 1) - (((~i6) & 71) | (i6 & (-72)));
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 67 / 0;
                return;
            }
            return;
        }
        if (this.f.remove(fragment.mWho) != null) {
            int i10 = b;
            int i11 = i10 & 109;
            int i12 = ((i10 ^ 109) | i11) << 1;
            int i13 = -((~i11) & (i10 | 109));
            int i14 = (i12 & i13) + (i12 | i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = (-2) - (((i10 ^ 112) + ((i10 & 112) << 1)) ^ (-1));
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            int i19 = (i17 & 67) + (i17 | 67);
            b = i19 % 128;
            int i20 = i19 % 2;
            h.b(2);
            int i21 = a;
            int i22 = (((i21 & (-86)) | ((~i21) & 85)) - (~(-(-((i21 & 85) << 1))))) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
        } else {
            int i24 = a;
            int i25 = i24 & 121;
            int i26 = -(-((i24 ^ 121) | i25));
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = a;
        int i30 = (i29 & (-98)) | ((~i29) & 97);
        int i31 = -(-((i29 & 97) << 1));
        int i32 = (i30 & i31) + (i31 | i30);
        b = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 72 / 0;
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 7;
        int i5 = (i3 | 7) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            this.f.hashCode();
            this.g.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.f.hashCode();
        int iHashCode2 = this.g.hashCode();
        int iHashCode3 = this.i.hashCode();
        int i8 = -(-(iHashCode * 31));
        int i9 = (iHashCode2 ^ i8) + ((i8 & iHashCode2) << 1);
        int i10 = b + 119;
        int i11 = i10 % 128;
        a = i11;
        if (i10 % 2 == 0) {
            int i12 = i9 & 94;
            int i13 = -(-((i9 ^ 94) | i12));
            i = iHashCode3 >> (((i12 | i13) << 1) - (i12 ^ i13));
        } else {
            int i14 = -(~(i9 * 31));
            i = ((iHashCode3 ^ i14) + ((i14 & iHashCode3) << 1)) - 1;
        }
        int i15 = ((i11 & (-124)) | ((~i11) & 123)) + ((i11 & 123) << 1);
        b = i15 % 128;
        if (i15 % 2 == 0) {
            return i;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00c5  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = (i2 | 69) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i9 = ((i7 | 7) << 1) - (i7 ^ 7);
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = (i7 ^ 37) + ((i7 & 37) << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return true;
            }
            throw null;
        }
        boolean z = false;
        if (obj != null) {
            int i12 = ((i7 ^ 91) | (i7 & 91)) << 1;
            int i13 = -(((~i7) & 91) | (i7 & (-92)));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                obj.getClass();
                obj2.hashCode();
                throw null;
            }
            if (al.class == obj.getClass()) {
                int i15 = a + 13;
                int i16 = i15 % 128;
                b = i16;
                int i17 = i15 % 2;
                al alVar = (al) obj;
                HashMap<String, Fragment> map = this.f;
                HashMap<String, Fragment> map2 = alVar.f;
                int i18 = (-2) - (((i16 & 100) + (i16 | 100)) ^ (-1));
                a = i18 % 128;
                int i19 = i18 % 2;
                if (map.equals(map2)) {
                    int i20 = b;
                    int i21 = ((i20 & (-106)) | ((~i20) & 105)) + ((i20 & 105) << 1);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    if (this.g.equals(alVar.g)) {
                        int i23 = b;
                        int i24 = i23 & 35;
                        int i25 = -(-((i23 ^ 35) | i24));
                        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                        int i27 = i26 % 128;
                        a = i27;
                        int i28 = i26 % 2;
                        HashMap<String, an> map3 = this.i;
                        HashMap<String, an> map4 = alVar.i;
                        int i29 = ((i27 & (-18)) | ((~i27) & 17)) + ((i27 & 17) << 1);
                        b = i29 % 128;
                        int i30 = i29 % 2;
                        if (map3.equals(map4)) {
                            z = true;
                        } else {
                            int i31 = b + 125;
                            a = i31 % 128;
                            int i32 = i31 % 2;
                        }
                    } else {
                        int i33 = b + 125;
                        a = i33 % 128;
                        int i34 = i33 % 2;
                    }
                } else {
                    int i35 = b + 125;
                    a = i35 % 128;
                    int i36 = i35 % 2;
                }
                int i37 = a;
                int i38 = (-2) - (((i37 ^ 98) + ((i37 & 98) << 1)) ^ (-1));
                b = i38 % 128;
                int i39 = i38 % 2;
                return z;
            }
        }
        int i40 = b;
        int i41 = i40 & 123;
        int i42 = ((i40 | 123) & (~i41)) + (i41 << 1);
        a = i42 % 128;
        int i43 = i42 % 2;
        return false;
    }
}
