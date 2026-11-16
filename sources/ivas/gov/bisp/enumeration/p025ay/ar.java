package ivas.gov.bisp.enumeration.p025ay;

import android.widget.TextView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ar implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ aq.bqM d;
    public final /* synthetic */ aq e;

    public ar(aq aqVar, int i, aq.bqM bqm) {
        this.e = aqVar;
        this.c = i;
        this.d = bqm;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        aq aqVar;
        Item item;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 17) + ((i3 & 17) << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.e.h = arrayList;
            i = 1;
        } else {
            this.e.h = arrayList;
            i = 0;
        }
        while (i < this.e.h.size()) {
            int i5 = a;
            int i6 = ((i5 ^ 94) + ((i5 & 94) << 1)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            Item item2 = this.e.h.get(i);
            int i8 = a + 17;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                item2.getOptionId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (item2.getOptionId() == this.c) {
                int i9 = a;
                int i10 = i9 & 109;
                int i11 = (i10 - (~((i9 ^ 109) | i10))) - 1;
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    aqVar = this.e;
                    item = aqVar.h.get(i);
                    int i12 = 35 / 0;
                } else {
                    aqVar = this.e;
                    item = aqVar.h.get(i);
                }
                aqVar.k = item.getOption();
                TextView textView = this.d.z;
                int i13 = b;
                int i14 = i13 & 119;
                int i15 = -(-((i13 ^ 119) | i14));
                int i16 = (i14 & i15) + (i15 | i14);
                a = i16 % 128;
                int i17 = i16 % 2;
                textView.setText(this.e.k);
                int i18 = a;
                int i19 = ((i18 ^ 52) + ((i18 & 52) << 1)) - 1;
                b = i19 % 128;
                int i20 = i19 % 2;
                return;
            }
            int i21 = (i | (-109)) << 1;
            int i22 = -(i ^ (-109));
            int i23 = (i21 & i22) + (i22 | i21);
            int i24 = i23 & 110;
            i = (((~i24) & (i23 | 110)) - (~(i24 << 1))) - 1;
            int i25 = a;
            int i26 = ((i25 ^ 34) + ((i25 & 34) << 1)) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = a;
        int i29 = (((i28 ^ 75) | (i28 & 75)) << 1) - (((~i28) & 75) | (i28 & (-76)));
        b = i29 % 128;
        int i30 = i29 % 2;
    }
}
