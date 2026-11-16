package ivas.gov.bisp.enumeration.F;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.F.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0018y {
    private static int a = 0;
    private static int b = 1;
    public final CopyOnWriteArrayList<aYy> c = new CopyOnWriteArrayList<>();
    public final h d;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.F.y$aYy */
    public static final class aYy {
    }

    public C0018y(h hVar) {
        this.d = hVar;
    }

    public void n(Fragment fragment, boolean z) {
        aYy next;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 67) | (i2 & 67)) << 1;
        int i4 = -(((~i2) & 67) | (i2 & (-68)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            Fragment fragment2 = this.d.s;
            obj.hashCode();
            throw null;
        }
        Fragment fragment3 = this.d.s;
        if (fragment3 != null) {
            fragment3.getParentFragmentManager().m.n(fragment, true);
            int i6 = a + 9;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        Iterator<aYy> it = this.c.iterator();
        int i8 = b;
        int i9 = (-2) - ((((i8 | 54) << 1) - (i8 ^ 54)) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
        while (it.hasNext()) {
            int i11 = a;
            int i12 = i11 & 117;
            int i13 = -(-(i11 | 117));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                next = it.next();
                int i15 = 28 / 0;
                if (!z) {
                    Objects.requireNonNull(next);
                    throw null;
                }
                Objects.requireNonNull(next);
                int i16 = b;
                int i17 = i16 & 27;
                int i18 = -(-(i16 | 27));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                a = i19 % 128;
                int i20 = i19 % 2;
            } else {
                next = it.next();
                if (!z) {
                    Objects.requireNonNull(next);
                    throw null;
                }
                Objects.requireNonNull(next);
                int i110 = b;
                int i111 = i110 & 27;
                int i112 = -(-(i110 | 27));
                int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                a = i113 % 128;
                int i21 = i113 % 2;
            }
        }
        int i22 = a + 111;
        b = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }

    public void j(Fragment fragment, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = -(-(i2 | 71));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        h hVar = this.d;
        Context context = hVar.r.b;
        int i7 = a;
        int i8 = i7 & 107;
        int i9 = -(-((i7 ^ 107) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        Fragment fragment2 = hVar.s;
        if (fragment2 != null) {
            int i12 = b;
            int i13 = i12 ^ 27;
            int i14 = -(-((i12 & 27) << 1));
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            int i16 = i15 % 2;
            fragment2.getParentFragmentManager().m.j(fragment, true);
        }
        int i17 = b;
        int i18 = i17 & 95;
        int i19 = (i17 | 95) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 & i20) + (i19 | i20);
        a = i21 % 128;
        int i22 = i21 % 2;
        for (aYy ayy : this.c) {
            int i23 = b;
            int i24 = ((i23 ^ 61) | (i23 & 61)) << 1;
            int i25 = -(((~i23) & 61) | (i23 & (-62)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
            if (!z) {
                Objects.requireNonNull(ayy);
                throw null;
            }
            int i28 = a;
            int i29 = ((i28 ^ 112) + ((i28 & 112) << 1)) - 1;
            b = i29 % 128;
            if (i29 % 2 == 0) {
                Objects.requireNonNull(ayy);
                int i30 = 44 / 0;
            } else {
                Objects.requireNonNull(ayy);
            }
            int i31 = b;
            int i32 = (i31 & 105) + (i31 | 105);
            a = i32 % 128;
            int i33 = i32 % 2;
        }
        int i34 = a;
        int i35 = ((i34 ^ 80) + ((i34 & 80) << 1)) - 1;
        b = i35 % 128;
        int i36 = i35 % 2;
    }

    public void c(Fragment fragment, boolean z) {
        int i = 2 % 2;
        int i2 = b + 35;
        a = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragment2 = this.d.s;
        if (fragment2 != null) {
            int i4 = a;
            int i5 = i4 & 111;
            int i6 = i5 + ((i4 ^ 111) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            fragment2.getParentFragmentManager().m.c(fragment, true);
            int i8 = a;
            int i9 = (i8 & 25) + (i8 | 25);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        Iterator<aYy> it = this.c.iterator();
        int i11 = a;
        int i12 = (((i11 | 78) << 1) - (i11 ^ 78)) - 1;
        b = i12 % 128;
        while (true) {
            int i13 = i12 % 2;
            if (!it.hasNext()) {
                int i14 = a;
                int i15 = i14 & 125;
                int i16 = (i14 | 125) & (~i15);
                int i17 = -(-(i15 << 1));
                int i18 = (i16 & i17) + (i16 | i17);
                b = i18 % 128;
                int i19 = i18 % 2;
                return;
            }
            int i20 = b;
            int i21 = ((i20 ^ 59) | (i20 & 59)) << 1;
            int i22 = -(((~i20) & 59) | (i20 & (-60)));
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            int i24 = i23 % 2;
            aYy next = it.next();
            if (!z) {
                Objects.requireNonNull(next);
                throw null;
            }
            int i25 = a;
            int i26 = (-2) - ((((i25 | 20) << 1) - (i25 ^ 20)) ^ (-1));
            b = i26 % 128;
            int i27 = i26 % 2;
            Objects.requireNonNull(next);
            int i28 = a;
            i12 = (i28 ^ 13) + ((i28 & 13) << 1);
            b = i12 % 128;
        }
    }

    public void m(Fragment fragment, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 75;
        int i4 = ((i2 ^ 75) | i3) << 1;
        int i5 = -((i2 | 75) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        Fragment fragment2 = this.d.s;
        if (fragment2 != null) {
            int i8 = a;
            int i9 = (i8 | 9) << 1;
            int i10 = -(((~i8) & 9) | (i8 & (-10)));
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                fragment2.getParentFragmentManager().m.m(fragment, false);
            } else {
                fragment2.getParentFragmentManager().m.m(fragment, true);
            }
        }
        Iterator<aYy> it = this.c.iterator();
        int i12 = b;
        int i13 = i12 & 63;
        int i14 = ((i12 | 63) & (~i13)) + (i13 << 1);
        a = i14 % 128;
        while (true) {
            int i15 = i14 % 2;
            if (!it.hasNext()) {
                int i16 = a;
                int i17 = ((i16 | 80) << 1) - (i16 ^ 80);
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                return;
            }
            int i20 = b;
            int i21 = ((i20 ^ 47) | (i20 & 47)) << 1;
            int i22 = -(((~i20) & 47) | (i20 & (-48)));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            a = i23 % 128;
            if (i23 % 2 != 0) {
                it.next();
                throw null;
            }
            aYy next = it.next();
            if (!z) {
                Objects.requireNonNull(next);
                throw null;
            }
            Objects.requireNonNull(next);
            int i24 = b;
            int i25 = i24 & 77;
            i14 = (((i24 | 77) & (~i25)) - (~(-(-(i25 << 1))))) - 1;
            a = i14 % 128;
        }
    }

    public void p(Fragment fragment, View view, Bundle bundle, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 101) + ((i2 & 101) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Fragment fragment2 = this.d.s;
        if (fragment2 != null) {
            int i5 = b;
            int i6 = i5 & 25;
            int i7 = (i5 ^ 25) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                fragment2.getParentFragmentManager().m.p(fragment, view, bundle, false);
            } else {
                fragment2.getParentFragmentManager().m.p(fragment, view, bundle, true);
            }
        }
        Iterator<aYy> it = this.c.iterator();
        int i9 = b + 57;
        a = i9 % 128;
        int i10 = i9 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i11 = a + 119;
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i12 = a;
            int i13 = (i12 ^ 19) + ((i12 & 19) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            aYy next = it.next();
            if (!z) {
                Objects.requireNonNull(next);
                throw null;
            }
            int i15 = b + 65;
            a = i15 % 128;
            int i16 = i15 % 2;
            Objects.requireNonNull(next);
            int i17 = a;
            int i18 = (i17 ^ 13) + ((i17 & 13) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    public void d(Fragment fragment, Bundle bundle, boolean z) {
        int i = 2 % 2;
        int i2 = a + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragment2 = this.d.s;
        if (fragment2 != null) {
            int i4 = b + 47;
            a = i4 % 128;
            (i4 % 2 != 0 ? fragment2.getParentFragmentManager() : fragment2.getParentFragmentManager()).m.d(fragment, bundle, true);
            int i5 = b;
            int i6 = i5 & 41;
            int i7 = (i5 | 41) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 & i8) + (i7 | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = (((i11 | 120) << 1) - (i11 ^ 120)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        for (aYy ayy : this.c) {
            int i14 = a;
            int i15 = i14 & 5;
            int i16 = i15 + ((i14 ^ 5) | i15);
            b = i16 % 128;
            int i17 = i16 % 2;
            if (!z) {
                Objects.requireNonNull(ayy);
                throw null;
            }
            int i18 = a + 85;
            b = i18 % 128;
            int i19 = i18 % 2;
            Objects.requireNonNull(ayy);
            int i20 = b;
            int i21 = (i20 ^ 47) + ((i20 & 47) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = b;
        int i24 = i23 & 87;
        int i25 = ((i23 ^ 87) | i24) << 1;
        int i26 = -((i23 | 87) & (~i24));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        a = i27 % 128;
        if (i27 % 2 != 0) {
            throw null;
        }
    }

    public void k(Fragment fragment, Bundle bundle, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = i3 + ((i2 ^ 77) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        Fragment fragment2 = this.d.s;
        if (fragment2 != null) {
            int i6 = a + 73;
            b = i6 % 128;
            int i7 = i6 % 2;
            fragment2.getParentFragmentManager().m.k(fragment, bundle, true);
            int i8 = a;
            int i9 = i8 ^ 61;
            int i10 = (i8 & 61) << 1;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a + 21;
        b = i13 % 128;
        int i14 = i13 % 2;
        for (aYy ayy : this.c) {
            int i15 = a;
            int i16 = ((i15 | 119) << 1) - (i15 ^ 119);
            b = i16 % 128;
            int i17 = i16 % 2;
            if (!z) {
                Objects.requireNonNull(ayy);
                throw null;
            }
            int i18 = a;
            int i19 = (i18 & (-80)) | ((~i18) & 79);
            int i20 = -(-((i18 & 79) << 1));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
            Objects.requireNonNull(ayy);
            int i23 = b;
            int i24 = i23 & 109;
            int i25 = i24 + ((i23 ^ 109) | i24);
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = b + 67;
        a = i27 % 128;
        int i28 = i27 % 2;
    }

    public void o(Fragment fragment, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-50)) | ((~i2) & 49)) - (~((i2 & 49) << 1))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Fragment fragment2 = this.d.s;
            obj.hashCode();
            throw null;
        }
        Fragment fragment3 = this.d.s;
        if (fragment3 != null) {
            int i4 = (-2) - ((b + 18) ^ (-1));
            a = i4 % 128;
            int i5 = i4 % 2;
            fragment3.getParentFragmentManager().m.o(fragment, true);
            int i6 = a + 67;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        Iterator<aYy> it = this.c.iterator();
        int i8 = b;
        int i9 = i8 & 105;
        int i10 = i8 | 105;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        while (it.hasNext()) {
            int i13 = b + 19;
            a = i13 % 128;
            if (i13 % 2 != 0) {
                it.next();
                obj.hashCode();
                throw null;
            }
            aYy next = it.next();
            if (!z) {
                Objects.requireNonNull(next);
                throw null;
            }
            int i14 = b + 75;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                Objects.requireNonNull(next);
                obj.hashCode();
                throw null;
            }
            Objects.requireNonNull(next);
        }
        int i15 = b;
        int i16 = i15 & 45;
        int i17 = (i15 | 45) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 25 / 0;
        }
    }

    public void e(Fragment fragment, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = -(-(i2 | 113));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        h hVar = this.d;
        Context context = hVar.r.b;
        Fragment fragment2 = hVar.s;
        int i7 = b;
        int i8 = (i7 & (-88)) | ((~i7) & 87);
        int i9 = (i7 & 87) << 1;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (fragment2 != null) {
            int i11 = i7 & 39;
            int i12 = (i11 - (~(-(-((i7 ^ 39) | i11))))) - 1;
            a = i12 % 128;
            (i12 % 2 != 0 ? fragment2.getParentFragmentManager() : fragment2.getParentFragmentManager()).m.e(fragment, true);
        }
        int i13 = a;
        int i14 = i13 & 1;
        int i15 = ((i13 ^ 1) | i14) << 1;
        int i16 = -((i13 | 1) & (~i14));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
        for (aYy ayy : this.c) {
            int i19 = b;
            int i20 = (i19 & 117) + (i19 | 117);
            a = i20 % 128;
            int i21 = i20 % 2;
            if (i21 != 0) {
                int i22 = 28 / 0;
                if (!z) {
                    Objects.requireNonNull(ayy);
                    throw null;
                }
                int i23 = b;
                int i24 = ((i23 & 42) + (i23 | 42)) - 1;
                a = i24 % 128;
                int i25 = i24 % 2;
                Objects.requireNonNull(ayy);
                int i26 = a;
                int i27 = ((i26 | 113) << 1) - (i26 ^ 113);
                b = i27 % 128;
                int i28 = i27 % 2;
            } else {
                if (!z) {
                    Objects.requireNonNull(ayy);
                    throw null;
                }
                int i29 = b;
                int i210 = ((i29 & 42) + (i29 | 42)) - 1;
                a = i210 % 128;
                int i211 = i210 % 2;
                Objects.requireNonNull(ayy);
                int i212 = a;
                int i213 = ((i212 | 113) << 1) - (i212 ^ 113);
                b = i213 % 128;
                int i214 = i213 % 2;
            }
        }
        int i30 = b;
        int i31 = i30 & 11;
        int i32 = -(-((i30 ^ 11) | i31));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        a = i33 % 128;
        int i34 = i33 % 2;
    }

    public void f(Fragment fragment, Bundle bundle, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-94)) | ((~i2) & 93)) + ((i2 & 93) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Fragment fragment2 = this.d.s;
        if (fragment2 != null) {
            int i5 = b;
            int i6 = i5 & 19;
            int i7 = -(-((i5 ^ 19) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            fragment2.getParentFragmentManager().m.f(fragment, bundle, true);
            int i10 = a;
            int i11 = ((i10 & 114) + (i10 | 114)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = (i13 & 73) + (i13 | 73);
        a = i14 % 128;
        int i15 = i14 % 2;
        for (aYy ayy : this.c) {
            int i16 = b;
            int i17 = (i16 ^ 105) + ((i16 & 105) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            if (!z) {
                Objects.requireNonNull(ayy);
                throw null;
            }
            int i19 = a + 81;
            b = i19 % 128;
            int i20 = i19 % 2;
            Objects.requireNonNull(ayy);
            int i21 = a;
            int i22 = i21 & 27;
            int i23 = (i22 - (~(-(-((i21 ^ 27) | i22))))) - 1;
            b = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 4 / 2;
            }
        }
        int i25 = a + 65;
        b = i25 % 128;
        int i26 = i25 % 2;
    }

    public void g(Fragment fragment, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = i2 | 115;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Fragment fragment2 = this.d.s;
        if (fragment2 != null) {
            int i7 = a + 57;
            b = i7 % 128;
            int i8 = i7 % 2;
            fragment2.getParentFragmentManager().m.g(fragment, true);
            int i9 = b;
            int i10 = (i9 ^ 117) + ((i9 & 117) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        Iterator<aYy> it = this.c.iterator();
        int i12 = a;
        int i13 = i12 & 21;
        int i14 = ((i12 ^ 21) | i13) << 1;
        int i15 = -((i12 | 21) & (~i13));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i18 = b;
                int i19 = i18 & 119;
                int i20 = ((i18 ^ 119) | i19) << 1;
                int i21 = -((i18 | 119) & (~i19));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                a = i22 % 128;
                if (i22 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i23 = a;
            int i24 = (((i23 | 81) << 1) - (~(-(((~i23) & 81) | (i23 & (-82)))))) - 1;
            b = i24 % 128;
            int i25 = i24 % 2;
            aYy next = it.next();
            if (!z) {
                Objects.requireNonNull(next);
                throw null;
            }
            int i26 = b;
            int i27 = ((i26 & 72) + (i26 | 72)) - 1;
            a = i27 % 128;
            int i28 = i27 % 2;
            Objects.requireNonNull(next);
            int i29 = b;
            int i30 = i29 & 109;
            int i31 = -(-((i29 ^ 109) | i30));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                int i33 = 3 % 5;
            }
        }
    }

    public void h(Fragment fragment, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 29) + (i2 | 29);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Fragment fragment2 = this.d.s;
            obj.hashCode();
            throw null;
        }
        Fragment fragment3 = this.d.s;
        if (fragment3 != null) {
            fragment3.getParentFragmentManager().m.h(fragment, true);
            int i4 = b + 3;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 4;
            }
        }
        Iterator<aYy> it = this.c.iterator();
        int i6 = b + 21;
        a = i6 % 128;
        int i7 = i6 % 2;
        while (it.hasNext()) {
            int i8 = a + 21;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                it.next();
                obj.hashCode();
                throw null;
            }
            aYy next = it.next();
            if (!z) {
                Objects.requireNonNull(next);
                throw null;
            }
            int i9 = b;
            int i10 = (i9 | 75) << 1;
            int i11 = -(i9 ^ 75);
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            Objects.requireNonNull(next);
            int i14 = b;
            int i15 = i14 & 9;
            int i16 = (i15 - (~(-(-((i14 ^ 9) | i15))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b;
        int i19 = i18 & 59;
        int i20 = (((i18 ^ 59) | i19) << 1) - ((i18 | 59) & (~i19));
        a = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 67 / 0;
        }
    }

    public void i(Fragment fragment, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = ((i2 | 3) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        Fragment fragment2 = this.d.s;
        if (fragment2 != null) {
            int i6 = a;
            int i7 = i6 | 115;
            int i8 = i7 << 1;
            int i9 = -((~(i6 & 115)) & i7);
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            fragment2.getParentFragmentManager().m.i(fragment, true);
        }
        Iterator<aYy> it = this.c.iterator();
        int i12 = a + 37;
        while (true) {
            b = i12 % 128;
            int i13 = i12 % 2;
            if (!it.hasNext()) {
                int i14 = a;
                int i15 = (i14 ^ 7) + ((i14 & 7) << 1);
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i16 = a;
            int i17 = i16 & 81;
            int i18 = (i16 ^ 81) | i17;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            int i20 = i19 % 2;
            aYy next = it.next();
            if (!z) {
                Objects.requireNonNull(next);
                throw null;
            }
            int i21 = a;
            int i22 = (i21 & 107) + (i21 | 107);
            b = i22 % 128;
            int i23 = i22 % 2;
            Objects.requireNonNull(next);
            i12 = a + 55;
        }
    }

    public void l(Fragment fragment, Bundle bundle, boolean z) {
        aYy next;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 107) | (i2 & 107)) << 1) - (~(-(((~i2) & 107) | (i2 & (-108)))))) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Fragment fragment2 = this.d.s;
            throw null;
        }
        Fragment fragment3 = this.d.s;
        if (fragment3 != null) {
            int i4 = a;
            int i5 = (((i4 | 60) << 1) - (i4 ^ 60)) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            fragment3.getParentFragmentManager().m.l(fragment, bundle, true);
            int i7 = a + 69;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        Iterator<aYy> it = this.c.iterator();
        int i9 = a;
        int i10 = i9 & 39;
        int i11 = ((i9 ^ 39) | i10) << 1;
        int i12 = -((i9 | 39) & (~i10));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 5 / 2;
        }
        while (it.hasNext()) {
            int i15 = b;
            int i16 = ((i15 | 92) << 1) - (i15 ^ 92);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                next = it.next();
                int i18 = 13 / 0;
                if (!z) {
                    Objects.requireNonNull(next);
                    throw null;
                }
                Objects.requireNonNull(next);
                int i19 = a;
                int i20 = (i19 ^ 121) + ((i19 & 121) << 1);
                b = i20 % 128;
                int i21 = i20 % 2;
            } else {
                next = it.next();
                if (!z) {
                    Objects.requireNonNull(next);
                    throw null;
                }
                Objects.requireNonNull(next);
                int i110 = a;
                int i22 = (i110 ^ 121) + ((i110 & 121) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        int i24 = a;
        int i25 = ((i24 | 35) << 1) - (i24 ^ 35);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 77 / 0;
        }
    }
}
