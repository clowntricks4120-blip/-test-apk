package ivas.gov.bisp.enumeration.F;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class q implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ K e;
    public final /* synthetic */ View f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ Fragment h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ ArrayList j;

    public q(Object obj, K k, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.d = obj;
        this.e = k;
        this.f = view;
        int i = a;
        int i2 = (i & 113) + (i | 113);
        b = i2 % 128;
        int i3 = i2 % 2;
        this.h = fragment;
        this.g = arrayList;
        if (i3 == 0) {
            throw null;
        }
        this.i = arrayList2;
        this.j = arrayList3;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 13;
        int i4 = i2 | 13;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        Object obj = this.d;
        Object obj2 = null;
        if (obj != null) {
            int i8 = i6 & 99;
            int i9 = -(-((i6 ^ 99) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                this.e.q(obj, this.f);
                obj2.hashCode();
                throw null;
            }
            this.e.q(obj, this.f);
            int i11 = a + 125;
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            K k = this.e;
            Object obj3 = this.d;
            Fragment fragment = this.h;
            int i14 = i12 & 95;
            int i15 = (i12 ^ 95) | i14;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            int i17 = i16 % 2;
            ArrayList<View> arrayListJ = w.j(k, obj3, fragment, this.g, this.f);
            int i18 = a;
            int i19 = (i18 ^ 1) + ((i18 & 1) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            this.i.addAll(arrayListJ);
            int i21 = b;
            int i22 = i21 & 45;
            int i23 = ((i21 ^ 45) | i22) << 1;
            int i24 = -((i21 | 45) & (~i22));
            int i25 = (i23 & i24) + (i24 | i23);
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        if (this.j != null) {
            int i27 = a;
            int i28 = i27 & 59;
            int i29 = (i27 ^ 59) | i28;
            int i30 = (i28 & i29) + (i29 | i28);
            b = i30 % 128;
            int i31 = i30 % 2;
            if (this.c != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f);
                int i32 = a;
                int i33 = i32 ^ 75;
                int i34 = -(-((i32 & 75) << 1));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                b = i35 % 128;
                int i36 = i35 % 2;
                this.e.r(this.c, this.j, arrayList);
                int i37 = b;
                int i38 = ((i37 | 55) << 1) - (i37 ^ 55);
                a = i38 % 128;
                if (i38 % 2 != 0) {
                    int i39 = 5 % 4;
                }
            }
            this.j.clear();
            this.j.add(this.f);
            int i40 = b;
            int i41 = i40 & 71;
            int i42 = -(-((i40 ^ 71) | i41));
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            a = i43 % 128;
            if (i43 % 2 != 0) {
                throw null;
            }
        }
        int i44 = a;
        int i45 = (((i44 & (-82)) | ((~i44) & 81)) - (~((i44 & 81) << 1))) - 1;
        b = i45 % 128;
        if (i45 % 2 == 0) {
            throw null;
        }
    }
}
