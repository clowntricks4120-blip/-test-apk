package ivas.gov.bisp.enumeration.p025ay;

import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class au implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ C0100at.bqZ d;
    public final /* synthetic */ C0100at e;

    public au(C0100at c0100at, int i, C0100at.bqZ bqz) {
        this.e = c0100at;
        this.c = i;
        this.d = bqz;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 9) | (i2 & 9)) << 1;
        int i4 = -(((~i2) & 9) | (i2 & (-10)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.i = arrayList;
        int i7 = b;
        int i8 = ((((i7 ^ 27) | (i7 & 27)) << 1) - (~(-(((~i7) & 27) | (i7 & (-28)))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < this.e.i.size()) {
            int i11 = a;
            int i12 = i11 & 3;
            int i13 = -(-((i11 ^ 3) | i12));
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            Object obj = null;
            if (i14 % 2 != 0) {
                this.e.i.get(i10).getOptionId();
                obj.hashCode();
                throw null;
            }
            int optionId = this.e.i.get(i10).getOptionId();
            int i15 = a;
            int i16 = (i15 & 53) + (i15 | 53);
            int i17 = i16 % 128;
            b = i17;
            if (i16 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (optionId == this.c) {
                C0100at c0100at = this.e;
                Item item = c0100at.i.get(i10);
                int i18 = b;
                int i19 = ((i18 & 28) + (i18 | 28)) - 1;
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    c0100at.j = item.getOption();
                    obj.hashCode();
                    throw null;
                }
                c0100at.j = item.getOption();
                this.d.y.setText(this.e.j);
                int i20 = b;
                int i21 = i20 ^ 11;
                int i22 = (i20 & 11) << 1;
                int i23 = (i21 & i22) + (i22 | i21);
                a = i23 % 128;
                int i24 = i23 % 2;
                return;
            }
            i10 = ((i10 & 2) + (i10 | 2)) - 1;
            int i25 = i17 + 1;
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = a;
        int i28 = (i27 & 43) + (i27 | 43);
        b = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 86 / 0;
        }
    }
}
