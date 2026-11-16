package ivas.gov.bisp.enumeration.p097r;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.view.menu.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements o, p, AdapterView.OnItemClickListener {
    private static int a = 0;
    private static int b = 1;
    public Rect c;

    public static boolean k(n nVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 93;
        int i4 = -(-((i2 & 93) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int size = nVar.size();
        int i7 = a;
        int i8 = i7 & 3;
        int i9 = ((i7 | 3) & (~i8)) + (i8 << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        boolean z = false;
        int i11 = 0;
        while (i11 < size) {
            int i12 = b;
            int i13 = i12 & 125;
            int i14 = (i12 ^ 125) | i13;
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                nVar.getItem(i11).isVisible();
                throw null;
            }
            MenuItem item = nVar.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                int i16 = b;
                int i17 = i16 & 5;
                int i18 = -(-((i16 ^ 5) | i17));
                int i19 = (i17 & i18) + (i17 | i18);
                a = i19 % 128;
                int i20 = i19 % 2;
                int i21 = (i16 ^ 15) + ((i16 & 15) << 1);
                a = i21 % 128;
                int i22 = i21 % 2;
                z = true;
                break;
            }
            i11 = ((i11 & 2) + (i11 | 2)) - 1;
            int i23 = b;
            int i24 = (i23 ^ 21) + ((i23 & 21) << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = a;
        int i27 = ((i26 & (-122)) | ((~i26) & 121)) + ((i26 & 121) << 1);
        b = i27 % 128;
        int i28 = i27 % 2;
        return z;
    }

    @Override // androidx.appcompat.view.menu.p
    public int c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = -(-((i2 ^ 99) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = (i6 & 21) + (i6 | 21);
        a = i8 % 128;
        int i9 = i8 % 2;
        return 0;
    }

    @Override // androidx.appcompat.view.menu.p
    public void g(Context context, n nVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 65) + (i2 | 65);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean h(n nVar, u uVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 55;
        int i7 = (i6 - (~((i4 ^ 55) | i6))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean o(n nVar, u uVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = (i2 ^ 27) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 113;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public abstract void s(n nVar);

    public abstract void t(boolean z);

    public abstract void u(View view);

    public abstract void v(int i);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(int i);

    public abstract void y(boolean z);

    public abstract void z(int i);

    /* JADX WARN: Code duplicated, block: B:10:0x004c A[PHI: r5
  0x004c: PHI (r5v11 android.widget.ListAdapter) = (r5v2 android.widget.ListAdapter), (r5v13 android.widget.ListAdapter) binds: [B:8:0x002e, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0090  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:21:0x00be  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r5
  0x0030: PHI (r5v3 android.widget.ListAdapter) = (r5v2 android.widget.ListAdapter), (r5v13 android.widget.ListAdapter) binds: [B:8:0x002e, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter;
        s sVar;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 91;
        int i6 = (i4 ^ 91) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = 0;
        if (i7 % 2 != 0) {
            listAdapter = (ListAdapter) adapterView.getAdapter();
            int i9 = 66 / 0;
            if (listAdapter instanceof HeaderViewListAdapter) {
                sVar = (s) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
                int i10 = b;
                int i11 = ((i10 & (-22)) | ((~i10) & 21)) + ((i10 & 21) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                sVar = (s) listAdapter;
                int i13 = a;
                int i14 = i13 & 123;
                int i15 = (i13 | 123) & (~i14);
                int i16 = -(-(i14 << 1));
                int i17 = (i15 & i16) + (i15 | i16);
                b = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            listAdapter = (ListAdapter) adapterView.getAdapter();
            if (listAdapter instanceof HeaderViewListAdapter) {
                sVar = (s) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
                int i19 = b;
                int i110 = ((i19 & (-22)) | ((~i19) & 21)) + ((i19 & 21) << 1);
                a = i110 % 128;
                int i111 = i110 % 2;
            } else {
                sVar = (s) listAdapter;
                int i112 = a;
                int i113 = i112 & 123;
                int i114 = (i112 | 123) & (~i113);
                int i115 = -(-(i113 << 1));
                int i116 = (i114 & i115) + (i114 | i115);
                b = i116 % 128;
                int i117 = i116 % 2;
            }
        }
        n nVar = sVar.a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        int i20 = a;
        int i21 = i20 ^ 83;
        int i22 = ((i20 & 83) | i21) << 1;
        int i23 = -i21;
        int i24 = (i22 & i23) + (i23 | i22);
        b = i24 % 128;
        boolean z = this instanceof f;
        if (i24 % 2 != 0) {
            if ((((~(z ? 1 : 0)) & 1) | ((z ? 1 : 0) & (-2))) != 0) {
                int i25 = (((i20 ^ 57) | (i20 & 57)) << 1) - (((~i20) & 57) | (i20 & (-58)));
                b = i25 % 128;
                int i26 = i25 % 2;
            } else {
                int i27 = i20 & 3;
                int i28 = ((i20 ^ 3) | i27) << 1;
                int i29 = -((i20 | 3) & (~i27));
                i2 = (i28 ^ i29) + ((i29 & i28) << 1);
                b = i2 % 128;
                i8 = 4;
                if (i2 % 2 == 0) {
                    int i30 = 4 / 5;
                }
            }
        } else if (((z ? 1 : 0) & 1) != 0) {
            int i210 = (((i20 ^ 57) | (i20 & 57)) << 1) - (((~i20) & 57) | (i20 & (-58)));
            b = i210 % 128;
            int i211 = i210 % 2;
        } else {
            int i212 = i20 & 3;
            int i213 = ((i20 ^ 3) | i212) << 1;
            int i214 = -((i20 | 3) & (~i212));
            i2 = (i213 ^ i214) + ((i214 & i213) << 1);
            b = i2 % 128;
            i8 = 4;
            if (i2 % 2 == 0) {
                int i31 = 4 / 5;
            }
        }
        nVar.s(menuItem, this, i8);
        int i32 = b;
        int i33 = (i32 & 61) + (i32 | 61);
        a = i33 % 128;
        if (i33 % 2 != 0) {
            throw null;
        }
    }

    public static int j(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 97;
        int i5 = ((i3 & 97) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i10 = a;
        int i11 = i10 & 55;
        int i12 = ((i10 | 55) & (~i11)) + (i11 << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        s sVar = (s) listAdapter;
        int count = sVar.getCount();
        int i14 = a;
        int i15 = (i14 | 91) << 1;
        int i16 = -(i14 ^ 91);
        int i17 = (i15 & i16) + (i16 | i15);
        int i18 = i17 % 128;
        b = i18;
        int i19 = i17 % 2;
        int i20 = ((i18 & (-76)) | ((~i18) & 75)) + ((i18 & 75) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        View view = null;
        FrameLayout frameLayout = null;
        while (i22 < count) {
            int i25 = b;
            int i26 = (((i25 | 46) << 1) - (i25 ^ 46)) - 1;
            a = i26 % 128;
            int i27 = i26 % 2;
            int itemViewType = sVar.getItemViewType(i22);
            if (i27 != 0) {
                int i28 = 89 / i9;
            }
            int i29 = b;
            int i30 = i29 & 35;
            int i31 = (((i29 ^ 35) | i30) << 1) - ((~i30) & (i29 | 35));
            int i32 = i31 % 128;
            a = i32;
            int i33 = i31 % 2;
            if (itemViewType != i24) {
                int i34 = i32 + 97;
                b = i34 % 128;
                int i35 = i34 % 2;
                int i36 = i32 ^ 3;
                int i37 = (((i32 & 3) | i36) << 1) - i36;
                b = i37 % 128;
                int i38 = i37 % 2;
                view = null;
                i24 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
                int i39 = a;
                int i40 = i39 & 113;
                int i41 = -(-((i39 ^ 113) | i40));
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                b = i42 % 128;
                int i43 = i42 % 2;
            }
            view = sVar.getView(i22, view, frameLayout);
            int i44 = b;
            int i45 = ((i44 & 106) + (i44 | 106)) - 1;
            a = i45 % 128;
            if (i45 % 2 != 0) {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                view.getMeasuredWidth();
                throw null;
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                int i46 = b;
                int i47 = (i46 & 123) + (i46 | 123);
                a = i47 % 128;
                if (i47 % 2 == 0) {
                    return i;
                }
                throw null;
            }
            if (measuredWidth > i23) {
                int i48 = a;
                int i49 = (i48 | 27) << 1;
                int i50 = -(i48 ^ 27);
                int i51 = (i49 & i50) + (i49 | i50);
                b = i51 % 128;
                int i52 = i51 % 2;
                int i53 = (i48 & 11) + (i48 | 11);
                b = i53 % 128;
                int i54 = i53 % 2;
                i23 = measuredWidth;
            }
            int i55 = i22 | 1;
            int i56 = i55 << 1;
            int i57 = -((~(i22 & 1)) & i55);
            i22 = (i57 | i56) + (i56 & i57);
            int i58 = a;
            int i59 = i58 & 95;
            int i60 = -(-((i58 ^ 95) | i59));
            int i61 = (i59 & i60) + (i59 | i60);
            b = i61 % 128;
            int i62 = i61 % 2;
            int i63 = i58 & 19;
            int i64 = -(-((i58 ^ 19) | i63));
            int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
            b = i65 % 128;
            int i66 = i65 % 2;
            i9 = 0;
        }
        int i67 = b + 67;
        a = i67 % 128;
        if (i67 % 2 != 0) {
            int i68 = 3 / 0;
        }
        return i23;
    }
}
