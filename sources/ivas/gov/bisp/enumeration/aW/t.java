package ivas.gov.bisp.enumeration.aW;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.view.menu.w;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.P.C0021p;
import ivas.gov.bisp.enumeration.aM.C0073m;
import ivas.gov.bisp.enumeration.dc.j;
import ivas.gov.bisp.enumeration.p095o0000oO.OooOO0;
import ivas.gov.bisp.enumeration.p095o0000oO.OooOOO;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class t implements androidx.appcompat.view.menu.p {
    private static int a = 0;
    private static int b = 1;
    public OooOOO c;
    public boolean d = false;
    public int e;

    public static class bhn implements Parcelable {
        public static final Parcelable.Creator<bhn> CREATOR = new bho();
        private static int b = 1;
        private static int c;
        public int d;
        public C0021p e;

        public static final class bho implements Parcelable.Creator<bhn> {
            private static int a = 0;
            private static int b = 1;

            @Override // android.os.Parcelable.Creator
            public final bhn createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                bhn bhnVar = new bhn(parcel);
                int i2 = (-2) - ((a + 32) ^ (-1));
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    return bhnVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public final bhn[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 41;
                int i5 = -(-(i3 | 41));
                int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                a = i6 % 128;
                Object obj = null;
                bhn[] bhnVarArr = new bhn[i];
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i7 = ((i3 & (-8)) | ((~i3) & 7)) + ((i3 & 7) << 1);
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    return bhnVarArr;
                }
                throw null;
            }
        }

        static {
            int i = c + 15;
            b = i % 128;
            int i2 = i % 2;
        }

        public bhn() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            int i = 2 % 2;
            int i2 = c;
            int i3 = ((i2 | 43) << 1) - (i2 ^ 43);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            int i6 = i4 & 35;
            int i7 = (i4 ^ 35) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            c = i8 % 128;
            if (i8 % 2 == 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public bhn(Parcel parcel) {
            this.d = parcel.readInt();
            this.e = (C0021p) parcel.readParcelable(bhn.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0021p c0021p;
            int i2 = 2 % 2;
            int i3 = c;
            int i4 = i3 ^ 95;
            int i5 = (((i3 & 95) | i4) << 1) - i4;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(this.d);
                c0021p = this.e;
                int i6 = 22 / 0;
            } else {
                parcel.writeInt(this.d);
                c0021p = this.e;
            }
            parcel.writeParcelable(c0021p, 0);
            int i7 = c;
            int i8 = i7 & 77;
            int i9 = -(-((i7 ^ 77) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void b(n nVar, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 85;
        int i4 = (i3 - (~((i2 ^ 85) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public int c() {
        int i = 2 % 2;
        int i2 = a + 92;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = this.e;
        int i6 = i4 & 39;
        int i7 = (i4 ^ 39) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return i5;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 43;
        int i4 = (i2 & 43) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        return !(i5 % 2 != 0);
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean h(n nVar, u uVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 48) + ((i2 & 48) << 1)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean o(n nVar, u uVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 53) + (i2 | 53);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = (i4 & 103) + (i4 | 103);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean r(w wVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 113;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 113)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        boolean z = i6 % 2 != 0;
        int i7 = ((i2 & (-72)) | ((~i2) & 71)) + ((i2 & 71) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // androidx.appcompat.view.menu.p
    public void g(Context context, n nVar) {
        int i = 2 % 2;
        int i2 = a + 45;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.c.E = nVar;
            return;
        }
        this.c.E = nVar;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.view.menu.p
    public Parcelable a() {
        int i = 2 % 2;
        bhn bhnVar = new bhn();
        OooOOO oooOOO = this.c;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = (i2 ^ 53) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            bhnVar.d = oooOOO.getSelectedItemId();
            this.c.getBadgeDrawables();
            throw null;
        }
        bhnVar.d = oooOOO.getSelectedItemId();
        SparseArray<j> badgeDrawables = this.c.getBadgeDrawables();
        C0021p c0021p = new C0021p();
        int i6 = a;
        int i7 = (i6 ^ 31) + ((i6 & 31) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 & 71;
        int i10 = (i6 | 71) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 2 / 4;
        }
        int i14 = 0;
        while (i14 < badgeDrawables.size()) {
            int i15 = b;
            int i16 = (i15 & 39) + (i15 | 39);
            a = i16 % 128;
            int i17 = i16 % 2;
            int iKeyAt = badgeDrawables.keyAt(i14);
            j jVarValueAt = badgeDrawables.valueAt(i14);
            int i18 = a + 20;
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            int i20 = i19 % 128;
            b = i20;
            if (i19 % 2 == 0) {
                throw null;
            }
            if (jVarValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            int i21 = ((i20 & 118) + (i20 | 118)) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
            c0021p.put(iKeyAt, jVarValueAt.c);
            int i23 = b;
            int i24 = i23 & 29;
            int i25 = -(-((i23 ^ 29) | i24));
            int i26 = (i24 & i25) + (i24 | i25);
            a = i26 % 128;
            int i27 = i26 % 2;
            i14 = ((i14 & 1) << 1) + ((i14 & (-2)) | ((~i14) & 1));
            int i28 = i23 + 37;
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        bhnVar.e = c0021p;
        int i30 = b;
        int i31 = i30 & 79;
        int i32 = (((i30 | 79) & (~i31)) - (~(-(-(i31 << 1))))) - 1;
        a = i32 % 128;
        if (i32 % 2 == 0) {
            return bhnVar;
        }
        throw null;
    }

    @Override // androidx.appcompat.view.menu.p
    public void q(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = (i2 ^ 103) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.d) {
            int i6 = i2 & 63;
            int i7 = (i2 ^ 63) | i6;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 93 / 0;
                return;
            }
            return;
        }
        if (z) {
            int i10 = i2 ^ 91;
            int i11 = ((i2 & 91) | i10) << 1;
            int i12 = -i10;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            int i14 = i13 % 2;
            this.c.f();
            int i15 = a;
            int i16 = (i15 ^ 83) + ((i15 & 83) << 1);
            b = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
            return;
        }
        OooOOO oooOOO = this.c;
        n nVar = oooOOO.E;
        if (nVar != null) {
            int i17 = b;
            int i18 = i17 & 39;
            int i19 = (((i17 | 39) & (~i18)) - (~(-(-(i18 << 1))))) - 1;
            a = i19 % 128;
            int i20 = i19 % 2;
            if (oooOOO.k != null) {
                int i21 = b + 53;
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    nVar.size();
                    int length = oooOOO.k.length;
                    throw null;
                }
                int size = nVar.size();
                if (size != oooOOO.k.length) {
                    oooOOO.f();
                    int i22 = a + 27;
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    return;
                }
                int i24 = oooOOO.l;
                int i25 = b;
                int i26 = (((i25 & (-28)) | ((~i25) & 27)) - (~(-(-((i25 & 27) << 1))))) - 1;
                a = i26 % 128;
                int i27 = i26 % 2;
                int i28 = 0;
                while (i28 < size) {
                    int i29 = b;
                    int i30 = (i29 ^ 101) + ((i29 & 101) << 1);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    MenuItem item = oooOOO.E.getItem(i28);
                    if (!(!item.isChecked())) {
                        int i32 = (-2) - ((a + 94) ^ (-1));
                        b = i32 % 128;
                        if (i32 % 2 == 0) {
                            oooOOO.l = item.getItemId();
                            int i33 = 91 / 0;
                        } else {
                            oooOOO.l = item.getItemId();
                        }
                        int i34 = a + 101;
                        b = i34 % 128;
                        int i35 = i34 % 2;
                        oooOOO.e = i28;
                        int i36 = b;
                        int i37 = i36 & 11;
                        int i38 = ((i36 ^ 11) | i37) << 1;
                        int i39 = -((i36 | 11) & (~i37));
                        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                        a = i40 % 128;
                        int i41 = i40 % 2;
                    }
                    i28 = (-2) - ((i28 + 2) ^ (-1));
                    int i42 = a;
                    int i43 = (i42 ^ 13) + ((i42 & 13) << 1);
                    b = i43 % 128;
                    int i44 = i43 % 2;
                }
                if (i24 != oooOOO.l) {
                    int i45 = a;
                    int i46 = ((i45 | 52) << 1) - (i45 ^ 52);
                    int i47 = (i46 ^ (-1)) + (i46 << 1);
                    b = i47 % 128;
                    int i48 = i47 % 2;
                    C0073m.b(oooOOO, oooOOO.f);
                    int i49 = b;
                    int i50 = i49 & 101;
                    int i51 = (i49 ^ 101) | i50;
                    int i52 = (i50 & i51) + (i51 | i50);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                }
                int i54 = oooOOO.i;
                int size2 = oooOOO.E.n().size();
                int i55 = a;
                int i56 = i55 & 51;
                int i57 = (i55 | 51) & (~i56);
                int i58 = i56 << 1;
                int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
                b = i59 % 128;
                int i60 = i59 % 2;
                boolean zJ = oooOOO.j(i54, size2);
                int i61 = (-2) - ((b + 78) ^ (-1));
                a = i61 % 128;
                int i62 = i61 % 2;
                int i63 = 0;
                while (i63 < size) {
                    int i64 = a + 49;
                    b = i64 % 128;
                    int i65 = i64 % 2;
                    oooOOO.F.d = true;
                    oooOOO.k[i63].setLabelVisibilityMode(oooOOO.i);
                    int i66 = a;
                    int i67 = (i66 & 107) + (i66 | 107);
                    b = i67 % 128;
                    if (i67 % 2 == 0) {
                        oooOOO.k[i63].setShifting(zJ);
                        OooOO0[] oooOO0Arr = oooOOO.k;
                        obj.hashCode();
                        throw null;
                    }
                    oooOOO.k[i63].setShifting(zJ);
                    OooOO0[] oooOO0Arr2 = oooOOO.k;
                    int i68 = a;
                    int i69 = i68 & 1;
                    int i70 = -(-((i68 ^ 1) | i69));
                    int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                    b = i71 % 128;
                    if (i71 % 2 == 0) {
                        OooOO0 oooOO0 = oooOO0Arr2[i63];
                        obj.hashCode();
                        throw null;
                    }
                    oooOO0Arr2[i63].d((u) oooOOO.E.getItem(i63), 0);
                    oooOOO.F.d = false;
                    int i72 = a;
                    int i73 = i72 & 113;
                    int i74 = (~i73) & (i72 | 113);
                    int i75 = i73 << 1;
                    int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                    b = i76 % 128;
                    if (i76 % 2 == 0) {
                        i63 += 40;
                    } else {
                        int i77 = i63 & 1;
                        int i78 = ((i63 ^ 1) | i77) << 1;
                        int i79 = -((i63 | 1) & (~i77));
                        i63 = (i78 ^ i79) + ((i79 & i78) << 1);
                    }
                    int i80 = ((i72 & (-4)) | ((~i72) & 3)) + ((i72 & 3) << 1);
                    b = i80 % 128;
                    int i81 = i80 % 2;
                }
            }
        }
        int i82 = b;
        int i83 = i82 & 21;
        int i84 = (i82 | 21) & (~i83);
        int i85 = -(-(i83 << 1));
        int i86 = (i84 & i85) + (i84 | i85);
        a = i86 % 128;
        int i87 = i86 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x046c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0455 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:21:0x00af  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c6 A[LOOP:0: B:10:0x0050->B:23:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0131  */
    /* JADX WARN: Code duplicated, block: B:30:0x013d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0149  */
    /* JADX WARN: Code duplicated, block: B:35:0x015d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0165  */
    /* JADX WARN: Code duplicated, block: B:39:0x0176  */
    /* JADX WARN: Code duplicated, block: B:40:0x017d  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x024e  */
    /* JADX WARN: Code duplicated, block: B:55:0x025a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0265  */
    /* JADX WARN: Code duplicated, block: B:62:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:73:0x032f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0333  */
    /* JADX WARN: Code duplicated, block: B:76:0x0348  */
    /* JADX WARN: Code duplicated, block: B:79:0x0370  */
    /* JADX WARN: Code duplicated, block: B:86:0x039c  */
    /* JADX WARN: Code duplicated, block: B:87:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:90:0x040c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0420  */
    /* JADX WARN: Code duplicated, block: B:93:0x042a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // androidx.appcompat.view.menu.p
    public void n(Parcelable parcelable) {
        OooOOO oooOOO;
        int i;
        int size;
        int i2;
        Context context;
        C0021p c0021p;
        SparseArray<j> sparseArray;
        int i3;
        int i4;
        int iKeyAt;
        Parcelable parcelableValueAt;
        j.bIE bie;
        j jVar;
        int i5;
        Object obj;
        int i6;
        j.bIE bie2;
        int i7;
        int i8;
        int i9;
        ColorStateList colorStateListValueOf;
        C0019p c0019p;
        int i10;
        int i11;
        j.bIE bie3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        j.bIE bie4;
        int i17;
        WeakReference<View> weakReference;
        View view;
        int i18;
        WeakReference<FrameLayout> weakReference2;
        FrameLayout frameLayout;
        int i19;
        int i20;
        int iMax;
        j.bIE bie5;
        int i21;
        int i22;
        int i23;
        int i24;
        double d;
        int i25;
        MenuItem item;
        int i26;
        int i27 = 2 % 2;
        int i28 = b;
        int i29 = ((i28 & (-74)) | ((~i28) & 73)) + ((i28 & 73) << 1);
        a = i29 % 128;
        int i30 = 0;
        if (i29 % 2 != 0) {
            int i31 = 12 / 0;
            if (parcelable instanceof bhn) {
                oooOOO = this.c;
                bhn bhnVar = (bhn) parcelable;
                i = bhnVar.d;
                int i32 = a;
                int i33 = i32 & 59;
                int i34 = -(-(i32 | 59));
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                b = i35 % 128;
                int i36 = i35 % 2;
                size = oooOOO.E.size();
                int i37 = a + 5;
                b = i37 % 128;
                int i38 = i37 % 2;
                i2 = 0;
                while (i2 < size) {
                    int i39 = a;
                    i25 = ((i39 & (-126)) | ((~i39) & 125)) + ((i39 & 125) << 1);
                    b = i25 % 128;
                    if (i25 % 2 == 0) {
                        item = oooOOO.E.getItem(i2);
                        int i40 = 77 / 0;
                    } else {
                        item = oooOOO.E.getItem(i2);
                    }
                    int i41 = b;
                    int i42 = i41 & 21;
                    int i43 = (i41 | 21) & (~i42);
                    int i44 = i42 << 1;
                    int i45 = (i43 & i44) + (i43 | i44);
                    a = i45 % 128;
                    int i46 = i45 % 2;
                    if (i == item.getItemId()) {
                        int i47 = b;
                        int i48 = i47 & 125;
                        int i49 = ((i47 ^ 125) | i48) << 1;
                        int i50 = -((i47 | 125) & (~i48));
                        i26 = (i49 & i50) + (i50 | i49);
                        a = i26 % 128;
                        if (i26 % 2 != 0) {
                            oooOOO.l = i;
                            oooOOO.e = i2;
                            int i51 = 62 / 0;
                        } else {
                            oooOOO.l = i;
                            oooOOO.e = i2;
                        }
                        item.setChecked(true);
                        int i52 = b;
                        int i53 = ((i52 & (-40)) | ((~i52) & 39)) + ((i52 & 39) << 1);
                        a = i53 % 128;
                        int i54 = i53 % 2;
                        break;
                    }
                    int i55 = i2 & 72;
                    int i56 = (i2 | 72) & (~i55);
                    int i57 = i55 << 1;
                    int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                    int i59 = i58 & (-71);
                    i2 = ((((i58 ^ (-71)) | i59) << 1) - (~(-((~i59) & (i58 | (-71)))))) - 1;
                    int i60 = b;
                    int i61 = i60 & 21;
                    int i62 = i60 | 21;
                    int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                    a = i63 % 128;
                    int i64 = i63 % 2;
                }
                context = this.c.getContext();
                c0021p = bhnVar.e;
                sparseArray = new SparseArray<>(c0021p.size());
                int i65 = b + 55;
                int i66 = i65 % 128;
                a = i66;
                int i67 = i65 % 2;
                int i68 = i66 & 69;
                int i69 = i68 + ((i66 ^ 69) | i68);
                b = i69 % 128;
                int i70 = i69 % 2;
                i3 = 0;
                while (i3 < c0021p.size()) {
                    int i71 = a;
                    i4 = ((i71 & (-8)) | ((~i71) & 7)) + ((i71 & 7) << 1);
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        iKeyAt = c0021p.keyAt(i3);
                        parcelableValueAt = c0021p.valueAt(i3);
                        int i72 = 55 / i30;
                    } else {
                        iKeyAt = c0021p.keyAt(i3);
                        parcelableValueAt = c0021p.valueAt(i3);
                    }
                    bie = (j.bIE) parcelableValueAt;
                    if (bie != null) {
                        throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                    }
                    jVar = new j(context);
                    int i73 = b;
                    i5 = (i73 & 83) + (i73 | 83);
                    a = i5 % 128;
                    obj = null;
                    if (i5 % 2 == 0) {
                        int i74 = bie.h;
                        int i75 = jVar.c.h;
                        obj.hashCode();
                        throw null;
                    }
                    i6 = bie.h;
                    bie2 = jVar.c;
                    if (bie2.h != i6) {
                        int i76 = a;
                        i24 = ((i76 | 73) << 1) - (i76 ^ 73);
                        b = i24 % 128;
                        if (i24 % 2 == 0) {
                            bie2.h = i6;
                            d = ((double) i6) + 0.0d;
                        } else {
                            bie2.h = i6;
                            d = ((double) i6) - 1.0d;
                        }
                        int i77 = a;
                        int i78 = i77 ^ 21;
                        int i79 = -(-((i77 & 21) << 1));
                        int i80 = (i78 & i79) + (i79 | i78);
                        b = i80 % 128;
                        int i81 = i80 % 2;
                        jVar.m = ((int) Math.pow(10.0d, d)) - 1;
                        ivas.gov.bisp.enumeration.P.t tVar = jVar.f;
                        int i82 = a;
                        int i83 = i82 & 53;
                        int i84 = (((i82 | 53) & (~i83)) - (~(i83 << 1))) - 1;
                        b = i84 % 128;
                        int i85 = i84 % 2;
                        tVar.f = true;
                        jVar.i();
                        jVar.invalidateSelf();
                        int i86 = b;
                        int i87 = ((i86 & 82) + (i86 | 82)) - 1;
                        a = i87 % 128;
                        int i88 = i87 % 2;
                    }
                    i7 = bie.i;
                    if (i7 != -1) {
                        int i89 = a;
                        int i90 = (i89 & 3) + (i89 | 3);
                        b = i90 % 128;
                        int i91 = i90 % 2;
                        iMax = Math.max(0, i7);
                        bie5 = jVar.c;
                        i21 = bie5.i;
                        int i92 = b;
                        int i93 = i92 & 57;
                        int i94 = (i92 ^ 57) | i93;
                        i22 = (i93 & i94) + (i93 | i94);
                        i23 = i22 % 128;
                        a = i23;
                        if (i22 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (i21 != iMax) {
                            int i95 = i23 & 53;
                            int i96 = -(-(i23 | 53));
                            int i97 = (i95 & i96) + (i96 | i95);
                            b = i97 % 128;
                            int i98 = i97 % 2;
                            bie5.i = iMax;
                            jVar.f.f = true;
                            int i99 = b;
                            int i100 = i99 & 121;
                            int i101 = -(-((i99 ^ 121) | i100));
                            int i102 = (i100 ^ i101) + ((i101 & i100) << 1);
                            a = i102 % 128;
                            int i103 = i102 % 2;
                            jVar.i();
                            jVar.invalidateSelf();
                            int i104 = a;
                            int i105 = (((i104 | 120) << 1) - (i104 ^ 120)) - 1;
                            b = i105 % 128;
                            int i106 = i105 % 2;
                        }
                    }
                    i8 = bie.e;
                    jVar.c.e = i8;
                    i9 = b + 123;
                    a = i9 % 128;
                    if (i9 % 2 == 0) {
                        ColorStateList.valueOf(i8);
                        C0019p.bfp bfpVar = jVar.e.e;
                        obj.hashCode();
                        throw null;
                    }
                    colorStateListValueOf = ColorStateList.valueOf(i8);
                    c0019p = jVar.e;
                    if (c0019p.e.g != colorStateListValueOf) {
                        i20 = b + 103;
                        a = i20 % 128;
                        if (i20 % 2 == 0) {
                            c0019p.u(colorStateListValueOf);
                            jVar.invalidateSelf();
                            throw null;
                        }
                        c0019p.u(colorStateListValueOf);
                        jVar.invalidateSelf();
                        int i107 = b;
                        int i108 = ((i107 & (-124)) | ((~i107) & 123)) + ((i107 & 123) << 1);
                        a = i108 % 128;
                        int i109 = i108 % 2;
                    }
                    i10 = bie.f;
                    jVar.c.f = i10;
                    int i110 = (-2) - ((a + 38) ^ (-1));
                    b = i110 % 128;
                    int i111 = i110 % 2;
                    if (jVar.f.c.getColor() != i10) {
                        int i112 = b;
                        int i113 = i112 & 53;
                        int i114 = i113 + ((i112 ^ 53) | i113);
                        a = i114 % 128;
                        int i115 = i114 % 2;
                        jVar.f.c.setColor(i10);
                        int i116 = a + 37;
                        b = i116 % 128;
                        int i117 = i116 % 2;
                        jVar.invalidateSelf();
                        int i118 = b;
                        int i119 = i118 & 39;
                        int i120 = -(-(i118 | 39));
                        int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                        a = i121 % 128;
                        int i122 = i121 % 2;
                    }
                    i11 = bie.l;
                    bie3 = jVar.c;
                    i12 = bie3.l;
                    i13 = b;
                    int i123 = ((i13 | 29) << 1) - (i13 ^ 29);
                    a = i123 % 128;
                    int i124 = i123 % 2;
                    if (i12 != i11) {
                        i17 = (((i13 | 51) << 1) - (~(-(i13 ^ 51)))) - 1;
                        a = i17 % 128;
                        if (i17 % 2 == 0) {
                            bie3.l = i11;
                            WeakReference<View> weakReference3 = jVar.q;
                            throw null;
                        }
                        bie3.l = i11;
                        weakReference = jVar.q;
                        if (weakReference != null && weakReference.get() != null) {
                            int i125 = a;
                            int i126 = ((i125 | 11) << 1) - (i125 ^ 11);
                            b = i126 % 128;
                            int i127 = i126 % 2;
                            view = jVar.q.get();
                            int i128 = b;
                            int i129 = i128 & 93;
                            int i130 = -(-(i128 | 93));
                            i18 = (i129 ^ i130) + ((i130 & i129) << 1);
                            a = i18 % 128;
                            if (i18 % 2 == 0) {
                                WeakReference<FrameLayout> weakReference4 = jVar.r;
                                throw null;
                            }
                            weakReference2 = jVar.r;
                            if (weakReference2 != null) {
                                frameLayout = weakReference2.get();
                                int i131 = a;
                                int i132 = (((i131 | 96) << 1) - (i131 ^ 96)) - 1;
                                b = i132 % 128;
                                int i133 = i132 % 2;
                            } else {
                                int i134 = a + 77;
                                b = i134 % 128;
                                int i135 = i134 % 2;
                                frameLayout = null;
                            }
                            jVar.g(view, frameLayout);
                            int i136 = b;
                            int i137 = ((i136 ^ 5) | (i136 & 5)) << 1;
                            int i138 = -(((~i136) & 5) | (i136 & (-6)));
                            i19 = ((i137 | i138) << 1) - (i138 ^ i137);
                            a = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i139 = 4 % 4;
                            }
                        }
                    }
                    jVar.c.n = bie.n;
                    jVar.i();
                    int i140 = a;
                    int i141 = (i140 & (-40)) | ((~i140) & 39);
                    int i142 = (i140 & 39) << 1;
                    i14 = (i141 & i142) + (i142 | i141);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        jVar.c.p = bie.p;
                        jVar.i();
                        int i143 = 28 / 0;
                    } else {
                        jVar.c.p = bie.p;
                        jVar.i();
                    }
                    int i144 = b;
                    int i145 = i144 ^ 83;
                    int i146 = ((i144 & 83) | i145) << 1;
                    int i147 = -i145;
                    int i148 = ((i146 | i147) << 1) - (i146 ^ i147);
                    a = i148 % 128;
                    int i149 = i148 % 2;
                    jVar.c.f95o = bie.f95o;
                    jVar.i();
                    int i150 = a;
                    int i151 = i150 & 119;
                    int i152 = i151 + ((i150 ^ 119) | i151);
                    b = i152 % 128;
                    int i153 = i152 % 2;
                    jVar.c.q = bie.q;
                    jVar.i();
                    int i154 = a;
                    int i155 = i154 ^ 17;
                    int i156 = (((i154 & 17) | i155) << 1) - i155;
                    b = i156 % 128;
                    int i157 = i156 % 2;
                    jVar.c.r = bie.r;
                    jVar.i();
                    int i158 = a;
                    i15 = (((i158 | 108) << 1) - (i158 ^ 108)) - 1;
                    b = i15 % 128;
                    if (i15 % 2 != 0) {
                        jVar.c.s = bie.s;
                        jVar.i();
                        throw null;
                    }
                    jVar.c.s = bie.s;
                    jVar.i();
                    i16 = b + 51;
                    a = i16 % 128;
                    if (i16 % 2 != 0) {
                        z = bie.m;
                        jVar.setVisible(z, false);
                        bie4 = jVar.c;
                    } else {
                        z = bie.m;
                        jVar.setVisible(z, false);
                        bie4 = jVar.c;
                    }
                    bie4.m = z;
                    sparseArray.put(iKeyAt, jVar);
                    int i159 = i3 & 1;
                    int i160 = (i3 ^ 1) | i159;
                    i3 = ((i159 | i160) << 1) - (i159 ^ i160);
                    int i161 = b;
                    int i162 = (((i161 | 34) << 1) - (i161 ^ 34)) - 1;
                    a = i162 % 128;
                    int i163 = i162 % 2;
                    context = context;
                    i30 = 0;
                }
                this.c.setBadgeDrawables(sparseArray);
                int i164 = a;
                int i165 = ((i164 | 105) << 1) - (i164 ^ 105);
                b = i165 % 128;
                int i166 = i165 % 2;
            }
        } else if (parcelable instanceof bhn) {
            oooOOO = this.c;
            bhn bhnVar2 = (bhn) parcelable;
            i = bhnVar2.d;
            int i310 = a;
            int i311 = i310 & 59;
            int i312 = -(-(i310 | 59));
            int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
            b = i313 % 128;
            int i314 = i313 % 2;
            size = oooOOO.E.size();
            int i315 = a + 5;
            b = i315 % 128;
            int i316 = i315 % 2;
            i2 = 0;
            while (i2 < size) {
                int i317 = a;
                i25 = ((i317 & (-126)) | ((~i317) & 125)) + ((i317 & 125) << 1);
                b = i25 % 128;
                if (i25 % 2 == 0) {
                    item = oooOOO.E.getItem(i2);
                    int i410 = 77 / 0;
                } else {
                    item = oooOOO.E.getItem(i2);
                }
                int i411 = b;
                int i412 = i411 & 21;
                int i413 = (i411 | 21) & (~i412);
                int i414 = i412 << 1;
                int i415 = (i413 & i414) + (i413 | i414);
                a = i415 % 128;
                int i416 = i415 % 2;
                if (i == item.getItemId()) {
                    int i417 = b;
                    int i418 = i417 & 125;
                    int i419 = ((i417 ^ 125) | i418) << 1;
                    int i510 = -((i417 | 125) & (~i418));
                    i26 = (i419 & i510) + (i510 | i419);
                    a = i26 % 128;
                    if (i26 % 2 != 0) {
                        oooOOO.l = i;
                        oooOOO.e = i2;
                        int i511 = 62 / 0;
                    } else {
                        oooOOO.l = i;
                        oooOOO.e = i2;
                    }
                    item.setChecked(true);
                    int i512 = b;
                    int i513 = ((i512 & (-40)) | ((~i512) & 39)) + ((i512 & 39) << 1);
                    a = i513 % 128;
                    int i514 = i513 % 2;
                    break;
                }
                int i515 = i2 & 72;
                int i516 = (i2 | 72) & (~i515);
                int i517 = i515 << 1;
                int i518 = ((i516 | i517) << 1) - (i516 ^ i517);
                int i519 = i518 & (-71);
                i2 = ((((i518 ^ (-71)) | i519) << 1) - (~(-((~i519) & (i518 | (-71)))))) - 1;
                int i610 = b;
                int i611 = i610 & 21;
                int i612 = i610 | 21;
                int i613 = (i611 ^ i612) + ((i612 & i611) << 1);
                a = i613 % 128;
                int i614 = i613 % 2;
            }
            context = this.c.getContext();
            c0021p = bhnVar2.e;
            sparseArray = new SparseArray<>(c0021p.size());
            int i615 = b + 55;
            int i616 = i615 % 128;
            a = i616;
            int i617 = i615 % 2;
            int i618 = i616 & 69;
            int i619 = i618 + ((i616 ^ 69) | i618);
            b = i619 % 128;
            int i710 = i619 % 2;
            i3 = 0;
            while (i3 < c0021p.size()) {
                int i711 = a;
                i4 = ((i711 & (-8)) | ((~i711) & 7)) + ((i711 & 7) << 1);
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    iKeyAt = c0021p.keyAt(i3);
                    parcelableValueAt = c0021p.valueAt(i3);
                    int i712 = 55 / i30;
                } else {
                    iKeyAt = c0021p.keyAt(i3);
                    parcelableValueAt = c0021p.valueAt(i3);
                }
                bie = (j.bIE) parcelableValueAt;
                if (bie != null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                jVar = new j(context);
                int i713 = b;
                i5 = (i713 & 83) + (i713 | 83);
                a = i5 % 128;
                obj = null;
                if (i5 % 2 == 0) {
                    int i714 = bie.h;
                    int i715 = jVar.c.h;
                    obj.hashCode();
                    throw null;
                }
                i6 = bie.h;
                bie2 = jVar.c;
                if (bie2.h != i6) {
                    int i716 = a;
                    i24 = ((i716 | 73) << 1) - (i716 ^ 73);
                    b = i24 % 128;
                    if (i24 % 2 == 0) {
                        bie2.h = i6;
                        d = ((double) i6) + 0.0d;
                    } else {
                        bie2.h = i6;
                        d = ((double) i6) - 1.0d;
                    }
                    int i717 = a;
                    int i718 = i717 ^ 21;
                    int i719 = -(-((i717 & 21) << 1));
                    int i810 = (i718 & i719) + (i719 | i718);
                    b = i810 % 128;
                    int i811 = i810 % 2;
                    jVar.m = ((int) Math.pow(10.0d, d)) - 1;
                    ivas.gov.bisp.enumeration.P.t tVar2 = jVar.f;
                    int i812 = a;
                    int i813 = i812 & 53;
                    int i814 = (((i812 | 53) & (~i813)) - (~(i813 << 1))) - 1;
                    b = i814 % 128;
                    int i815 = i814 % 2;
                    tVar2.f = true;
                    jVar.i();
                    jVar.invalidateSelf();
                    int i816 = b;
                    int i817 = ((i816 & 82) + (i816 | 82)) - 1;
                    a = i817 % 128;
                    int i818 = i817 % 2;
                }
                i7 = bie.i;
                if (i7 != -1) {
                    int i819 = a;
                    int i910 = (i819 & 3) + (i819 | 3);
                    b = i910 % 128;
                    int i911 = i910 % 2;
                    iMax = Math.max(0, i7);
                    bie5 = jVar.c;
                    i21 = bie5.i;
                    int i912 = b;
                    int i913 = i912 & 57;
                    int i914 = (i912 ^ 57) | i913;
                    i22 = (i913 & i914) + (i913 | i914);
                    i23 = i22 % 128;
                    a = i23;
                    if (i22 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i21 != iMax) {
                        int i915 = i23 & 53;
                        int i916 = -(-(i23 | 53));
                        int i917 = (i915 & i916) + (i916 | i915);
                        b = i917 % 128;
                        int i918 = i917 % 2;
                        bie5.i = iMax;
                        jVar.f.f = true;
                        int i919 = b;
                        int i1010 = i919 & 121;
                        int i1011 = -(-((i919 ^ 121) | i1010));
                        int i1012 = (i1010 ^ i1011) + ((i1011 & i1010) << 1);
                        a = i1012 % 128;
                        int i1013 = i1012 % 2;
                        jVar.i();
                        jVar.invalidateSelf();
                        int i1014 = a;
                        int i1015 = (((i1014 | 120) << 1) - (i1014 ^ 120)) - 1;
                        b = i1015 % 128;
                        int i1016 = i1015 % 2;
                    }
                }
                i8 = bie.e;
                jVar.c.e = i8;
                i9 = b + 123;
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    ColorStateList.valueOf(i8);
                    C0019p.bfp bfpVar2 = jVar.e.e;
                    obj.hashCode();
                    throw null;
                }
                colorStateListValueOf = ColorStateList.valueOf(i8);
                c0019p = jVar.e;
                if (c0019p.e.g != colorStateListValueOf) {
                    i20 = b + 103;
                    a = i20 % 128;
                    if (i20 % 2 == 0) {
                        c0019p.u(colorStateListValueOf);
                        jVar.invalidateSelf();
                        throw null;
                    }
                    c0019p.u(colorStateListValueOf);
                    jVar.invalidateSelf();
                    int i1017 = b;
                    int i1018 = ((i1017 & (-124)) | ((~i1017) & 123)) + ((i1017 & 123) << 1);
                    a = i1018 % 128;
                    int i1019 = i1018 % 2;
                }
                i10 = bie.f;
                jVar.c.f = i10;
                int i1110 = (-2) - ((a + 38) ^ (-1));
                b = i1110 % 128;
                int i1111 = i1110 % 2;
                if (jVar.f.c.getColor() != i10) {
                    int i1112 = b;
                    int i1113 = i1112 & 53;
                    int i1114 = i1113 + ((i1112 ^ 53) | i1113);
                    a = i1114 % 128;
                    int i1115 = i1114 % 2;
                    jVar.f.c.setColor(i10);
                    int i1116 = a + 37;
                    b = i1116 % 128;
                    int i1117 = i1116 % 2;
                    jVar.invalidateSelf();
                    int i1118 = b;
                    int i1119 = i1118 & 39;
                    int i1210 = -(-(i1118 | 39));
                    int i1211 = ((i1119 | i1210) << 1) - (i1210 ^ i1119);
                    a = i1211 % 128;
                    int i1212 = i1211 % 2;
                }
                i11 = bie.l;
                bie3 = jVar.c;
                i12 = bie3.l;
                i13 = b;
                int i1213 = ((i13 | 29) << 1) - (i13 ^ 29);
                a = i1213 % 128;
                int i1214 = i1213 % 2;
                if (i12 != i11) {
                    i17 = (((i13 | 51) << 1) - (~(-(i13 ^ 51)))) - 1;
                    a = i17 % 128;
                    if (i17 % 2 == 0) {
                        bie3.l = i11;
                        WeakReference<View> weakReference5 = jVar.q;
                        throw null;
                    }
                    bie3.l = i11;
                    weakReference = jVar.q;
                    if (weakReference != null) {
                        int i1215 = a;
                        int i1216 = ((i1215 | 11) << 1) - (i1215 ^ 11);
                        b = i1216 % 128;
                        int i1217 = i1216 % 2;
                        view = jVar.q.get();
                        int i1218 = b;
                        int i1219 = i1218 & 93;
                        int i1310 = -(-(i1218 | 93));
                        i18 = (i1219 ^ i1310) + ((i1310 & i1219) << 1);
                        a = i18 % 128;
                        if (i18 % 2 == 0) {
                            WeakReference<FrameLayout> weakReference6 = jVar.r;
                            throw null;
                        }
                        weakReference2 = jVar.r;
                        if (weakReference2 != null) {
                            frameLayout = weakReference2.get();
                            int i1311 = a;
                            int i1312 = (((i1311 | 96) << 1) - (i1311 ^ 96)) - 1;
                            b = i1312 % 128;
                            int i1313 = i1312 % 2;
                        } else {
                            int i1314 = a + 77;
                            b = i1314 % 128;
                            int i1315 = i1314 % 2;
                            frameLayout = null;
                        }
                        jVar.g(view, frameLayout);
                        int i1316 = b;
                        int i1317 = ((i1316 ^ 5) | (i1316 & 5)) << 1;
                        int i1318 = -(((~i1316) & 5) | (i1316 & (-6)));
                        i19 = ((i1317 | i1318) << 1) - (i1318 ^ i1317);
                        a = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i1319 = 4 % 4;
                        }
                    }
                }
                jVar.c.n = bie.n;
                jVar.i();
                int i1410 = a;
                int i1411 = (i1410 & (-40)) | ((~i1410) & 39);
                int i1412 = (i1410 & 39) << 1;
                i14 = (i1411 & i1412) + (i1412 | i1411);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    jVar.c.p = bie.p;
                    jVar.i();
                    int i1413 = 28 / 0;
                } else {
                    jVar.c.p = bie.p;
                    jVar.i();
                }
                int i1414 = b;
                int i1415 = i1414 ^ 83;
                int i1416 = ((i1414 & 83) | i1415) << 1;
                int i1417 = -i1415;
                int i1418 = ((i1416 | i1417) << 1) - (i1416 ^ i1417);
                a = i1418 % 128;
                int i1419 = i1418 % 2;
                jVar.c.f95o = bie.f95o;
                jVar.i();
                int i1510 = a;
                int i1511 = i1510 & 119;
                int i1512 = i1511 + ((i1510 ^ 119) | i1511);
                b = i1512 % 128;
                int i1513 = i1512 % 2;
                jVar.c.q = bie.q;
                jVar.i();
                int i1514 = a;
                int i1515 = i1514 ^ 17;
                int i1516 = (((i1514 & 17) | i1515) << 1) - i1515;
                b = i1516 % 128;
                int i1517 = i1516 % 2;
                jVar.c.r = bie.r;
                jVar.i();
                int i1518 = a;
                i15 = (((i1518 | 108) << 1) - (i1518 ^ 108)) - 1;
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    jVar.c.s = bie.s;
                    jVar.i();
                    throw null;
                }
                jVar.c.s = bie.s;
                jVar.i();
                i16 = b + 51;
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    z = bie.m;
                    jVar.setVisible(z, false);
                    bie4 = jVar.c;
                } else {
                    z = bie.m;
                    jVar.setVisible(z, false);
                    bie4 = jVar.c;
                }
                bie4.m = z;
                sparseArray.put(iKeyAt, jVar);
                int i1519 = i3 & 1;
                int i167 = (i3 ^ 1) | i1519;
                i3 = ((i1519 | i167) << 1) - (i1519 ^ i167);
                int i168 = b;
                int i169 = (((i168 | 34) << 1) - (i168 ^ 34)) - 1;
                a = i169 % 128;
                int i1610 = i169 % 2;
                context = context;
                i30 = 0;
            }
            this.c.setBadgeDrawables(sparseArray);
            int i1611 = a;
            int i1612 = ((i1611 | 105) << 1) - (i1611 ^ 105);
            b = i1612 % 128;
            int i1613 = i1612 % 2;
        }
        int i170 = a + 68;
        int i171 = (i170 ^ (-1)) + (i170 << 1);
        b = i171 % 128;
        if (i171 % 2 == 0) {
            int i172 = 75 / 0;
        }
    }
}
