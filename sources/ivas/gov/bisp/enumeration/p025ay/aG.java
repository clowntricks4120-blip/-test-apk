package ivas.gov.bisp.enumeration.p025ay;

import android.widget.TextView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class aG implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ aT.brq d;
    public final /* synthetic */ aT e;

    public aG(aT aTVar, int i, aT.brq brqVar) {
        this.e = aTVar;
        this.c = i;
        this.d = brqVar;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        Item item;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 75;
        int i5 = (((i3 & 75) | i4) << 1) - i4;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.e.h = arrayList;
            i = 1;
        } else {
            this.e.h = arrayList;
            i = 0;
        }
        int i6 = b;
        int i7 = (i6 & 75) + (i6 | 75);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 3 / 3;
        }
        while (true) {
            Object obj = null;
            if (i >= this.e.h.size()) {
                int i9 = a;
                int i10 = i9 & 95;
                int i11 = ((i9 ^ 95) | i10) << 1;
                int i12 = -((i9 | 95) & (~i10));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i14 = a;
            int i15 = i14 & 71;
            int i16 = (i14 ^ 71) | i15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
            ArrayList<Item> arrayList2 = this.e.h;
            if (i18 != 0) {
                item = arrayList2.get(i);
                int i19 = 0 / 0;
            } else {
                item = arrayList2.get(i);
            }
            if (item.getOptionId() == this.c) {
                int i20 = a + 121;
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    this.e.h.get(i);
                    throw null;
                }
                aT aTVar = this.e;
                aTVar.k = aTVar.h.get(i).getOption();
                TextView textView = this.d.u;
                int i21 = a;
                int i22 = i21 & 95;
                int i23 = ((i21 ^ 95) | i22) << 1;
                int i24 = -((i21 | 95) & (~i22));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    textView.setText(this.e.k);
                    obj.hashCode();
                    throw null;
                }
                textView.setText(this.e.k);
                int i26 = b + 107;
                a = i26 % 128;
                if (i26 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i27 = (i ^ (-83)) + ((i & (-83)) << 1);
            int i28 = i27 & 84;
            i = i28 + ((i27 ^ 84) | i28);
            int i29 = b;
            int i30 = (i29 & 7) + (i29 | 7);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
    }
}
