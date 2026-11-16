package ivas.gov.bisp.enumeration.F;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class X {
    private static int a = 0;
    private static int b = 1;
    public final ArrayList<Fragment> c = new ArrayList<>();
    public final HashMap<String, t> d = new HashMap<>();
    public al e;

    public List<Fragment> c() {
        ArrayList arrayList;
        if (this.c.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.c) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    public void d(Fragment fragment) {
        if (this.c.contains(fragment)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment already added: ");
            sb.append(fragment);
            throw new IllegalStateException(sb.toString());
        }
        synchronized (this.c) {
            this.c.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = ((i2 | 119) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.d.values().removeAll(Collections.singleton(null));
        int i6 = a;
        int i7 = i6 & 21;
        int i8 = (((i6 ^ 21) | i7) << 1) - ((i6 | 21) & (~i7));
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        int i11 = i9 & 85;
        int i12 = (i9 | 85) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    public boolean f(String str) {
        int i = 2 % 2;
        int i2 = b;
        boolean z = true;
        int i3 = (i2 ^ 68) + ((i2 & 68) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.d.get(str) != null) {
            int i6 = a;
            int i7 = (i6 & (-92)) | ((~i6) & 91);
            int i8 = (i6 & 91) << 1;
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = b + 99;
            a = i11 % 128;
            int i12 = i11 % 2;
            z = false;
        }
        int i13 = a;
        int i14 = i13 & 69;
        int i15 = i14 + ((i13 ^ 69) | i14);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public t k(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-48)) | ((~i2) & 47)) + ((i2 & 47) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        t tVar = this.d.get(str);
        int i5 = b;
        int i6 = ((i5 & (-106)) | ((~i5) & 105)) + ((i5 & 105) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return tVar;
    }

    public void n(Fragment fragment) {
        synchronized (this.c) {
            this.c.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public Fragment g(String str) {
        int i = 2 % 2;
        int i2 = a + 87;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.d.get(str);
            throw null;
        }
        t tVar = this.d.get(str);
        int i3 = a;
        int i4 = i3 & 93;
        int i5 = (i3 | 93) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (tVar != null) {
            Fragment fragment = tVar.c;
            int i9 = a + 73;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return fragment;
            }
            obj.hashCode();
            throw null;
        }
        int i10 = i8 & 103;
        int i11 = ((i8 ^ 103) | i10) << 1;
        int i12 = -((i8 | 103) & (~i10));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 16 / 0;
        }
        return null;
    }

    public List<t> h() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Collection<t> collectionValues = this.d.values();
        int i2 = b;
        int i3 = (((i2 | 50) << 1) - (i2 ^ 50)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = a;
        int i6 = (i5 ^ 109) + ((i5 & 109) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        for (t tVar : collectionValues) {
            int i8 = a;
            int i9 = (i8 ^ 11) + ((i8 & 11) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            if (tVar != null) {
                int i11 = a;
                int i12 = ((i11 ^ 106) + ((i11 & 106) << 1)) - 1;
                b = i12 % 128;
                int i13 = i12 % 2;
                arrayList.add(tVar);
                int i14 = a;
                int i15 = i14 & 43;
                int i16 = ((i14 | 43) & (~i15)) + (i15 << 1);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 4 % 3;
                }
            }
        }
        int i18 = a + 115;
        b = i18 % 128;
        int i19 = i18 % 2;
        return arrayList;
    }

    public Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 27;
        int i4 = ((i2 & 27) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        Iterator<t> it = this.d.values().iterator();
        int i8 = b;
        int i9 = ((i8 | 39) << 1) - (i8 ^ 39);
        a = i9 % 128;
        int i10 = i9 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i11 = a;
                int i12 = (i11 & 41) + (i11 | 41);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 11 / 0;
                }
                return null;
            }
            int i14 = b;
            int i15 = (i14 ^ 59) + ((i14 & 59) << 1);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                it.next();
                obj.hashCode();
                throw null;
            }
            t next = it.next();
            if (next != null && (fragmentFindFragmentByWho = next.c.findFragmentByWho(str)) != null) {
                int i16 = b;
                int i17 = (i16 | 87) << 1;
                int i18 = -(((~i16) & 87) | (i16 & (-88)));
                int i19 = (i17 & i18) + (i18 | i17);
                int i20 = i19 % 128;
                a = i20;
                int i21 = i19 % 2;
                int i22 = i20 & 23;
                int i23 = (i20 ^ 23) | i22;
                int i24 = (i22 & i23) + (i23 | i22);
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    return fragmentFindFragmentByWho;
                }
                throw null;
            }
        }
    }

    public List<Fragment> j() {
        Iterator<t> it;
        t next;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Collection<t> collectionValues = this.d.values();
        int i2 = b;
        int i3 = ((i2 ^ 74) + ((i2 & 74) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            it = collectionValues.iterator();
            int i4 = 14 / 0;
        } else {
            it = collectionValues.iterator();
        }
        int i5 = b + 125;
        a = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            int i7 = a;
            int i8 = ((i7 | 95) << 1) - (i7 ^ 95);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                next = it.next();
                int i9 = 99 / 0;
                if (next != null) {
                    int i10 = a;
                    int i11 = i10 ^ 67;
                    int i12 = ((i10 & 67) | i11) << 1;
                    int i13 = -i11;
                    int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(next.c);
                    int i16 = b + 29;
                    a = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    arrayList.add(null);
                    int i18 = a;
                    int i19 = i18 ^ 61;
                    int i20 = ((i18 & 61) | i19) << 1;
                    int i21 = -i19;
                    int i22 = (i20 & i21) + (i20 | i21);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
            } else {
                next = it.next();
                if (next != null) {
                    int i110 = a;
                    int i111 = i110 ^ 67;
                    int i112 = ((i110 & 67) | i111) << 1;
                    int i113 = -i111;
                    int i114 = ((i112 | i113) << 1) - (i112 ^ i113);
                    b = i114 % 128;
                    int i115 = i114 % 2;
                    arrayList.add(next.c);
                    int i116 = b + 29;
                    a = i116 % 128;
                    int i117 = i116 % 2;
                } else {
                    arrayList.add(null);
                    int i118 = a;
                    int i119 = i118 ^ 61;
                    int i24 = ((i118 & 61) | i119) << 1;
                    int i25 = -i119;
                    int i26 = (i24 & i25) + (i24 | i25);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                }
            }
        }
        int i28 = a;
        int i29 = (i28 & (-46)) | ((~i28) & 45);
        int i30 = -(-((i28 & 45) << 1));
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        b = i31 % 128;
        int i32 = i31 % 2;
        return arrayList;
    }

    public void m(t tVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 25;
        int i4 = ((i2 & 25) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        Fragment fragment = tVar.c;
        if (fragment.mRetainInstance) {
            int i8 = b;
            int i9 = i8 ^ 103;
            int i10 = (((i8 & 103) | i9) << 1) - i9;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                this.e.f(fragment);
                int i11 = 86 / 0;
            } else {
                this.e.f(fragment);
            }
        }
        if (this.d.put(fragment.mWho, null) == null) {
            int i12 = b + 17;
            a = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        h.b(2);
        int i14 = a;
        int i15 = i14 & 35;
        int i16 = -(-((i14 ^ 35) | i15));
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        int i18 = i17 % 2;
    }

    public void l(t tVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 1) | (i2 & 1)) << 1;
        int i4 = -(((~i2) & 1) | (i2 & (-2)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            f(tVar.c.mWho);
            throw null;
        }
        Fragment fragment = tVar.c;
        if (f(fragment.mWho)) {
            int i6 = b;
            int i7 = i6 & 113;
            int i8 = -(-(i6 | 113));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        this.d.put(fragment.mWho, tVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            int i11 = b;
            int i12 = (i11 & (-114)) | ((~i11) & 113);
            int i13 = -(-((i11 & 113) << 1));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                boolean z = fragment.mRetainInstance;
                throw null;
            }
            if (!fragment.mRetainInstance) {
                this.e.f(fragment);
                int i15 = b;
                int i16 = ((i15 | 7) << 1) - (i15 ^ 7);
                a = i16 % 128;
                int i17 = i16 % 2;
            } else {
                this.e.e(fragment);
                int i18 = a;
                int i19 = ((i18 | 117) << 1) - (i18 ^ 117);
                b = i19 % 128;
                int i20 = i19 % 2;
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
            int i21 = b;
            int i22 = i21 & 19;
            int i23 = (((i21 ^ 19) | i22) << 1) - ((i21 | 19) & (~i22));
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        h.b(2);
        int i25 = b;
        int i26 = ((i25 | 58) << 1) - (i25 ^ 58);
        int i27 = (i26 ^ (-1)) + (i26 << 1);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
