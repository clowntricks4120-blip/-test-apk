package ivas.gov.bisp.enumeration.p025ay;

import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class G implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ f.brv d;
    public final /* synthetic */ f e;

    public G(f fVar, int i, f.brv brvVar) {
        this.e = fVar;
        this.c = i;
        this.d = brvVar;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        Item item;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = (i2 | 121) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.e.h = arrayList;
        int i8 = i7 == 0 ? 1 : 0;
        int i9 = b;
        int i10 = (i9 ^ 93) + ((i9 & 93) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 3 % 5;
        }
        while (i8 < this.e.h.size()) {
            int i12 = b;
            int i13 = i12 & 45;
            int i14 = (i13 - (~(-(-((i12 ^ 45) | i13))))) - 1;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                item = this.e.h.get(i8);
                int i15 = 93 / 0;
            } else {
                item = this.e.h.get(i8);
            }
            int i16 = a;
            int i17 = (((i16 ^ 51) | (i16 & 51)) << 1) - (((~i16) & 51) | (i16 & (-52)));
            b = i17 % 128;
            int i18 = i17 % 2;
            if (item.getOptionId() == this.c) {
                int i19 = b;
                int i20 = ((i19 | 1) << 1) - (i19 ^ 1);
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    this.e.h.get(i8);
                    throw null;
                }
                f fVar = this.e;
                Item item2 = fVar.h.get(i8);
                int i21 = a;
                int i22 = i21 ^ 33;
                int i23 = ((((i21 & 33) | i22) << 1) - (~(-i22))) - 1;
                b = i23 % 128;
                if (i23 % 2 == 0) {
                    fVar.k = item2.getOption();
                    throw null;
                }
                fVar.k = item2.getOption();
                f.brv brvVar = this.d;
                int i24 = b;
                int i25 = (i24 ^ 33) + ((i24 & 33) << 1);
                a = i25 % 128;
                int i26 = i25 % 2;
                brvVar.z.setText(this.e.k);
                int i27 = b;
                int i28 = i27 & 115;
                int i29 = (i27 | 115) & (~i28);
                int i30 = i28 << 1;
                int i31 = (i29 & i30) + (i29 | i30);
                a = i31 % 128;
                int i32 = i31 % 2;
                return;
            }
            int i33 = i8 ^ (-2);
            int i34 = (i8 & (-2)) << 1;
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            i8 = ((i35 ^ 4) + ((i35 & 4) << 1)) - 1;
            int i36 = a;
            int i37 = (-2) - ((((i36 | 66) << 1) - (i36 ^ 66)) ^ (-1));
            b = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = (-2) - ((b + 34) ^ (-1));
        a = i39 % 128;
        if (i39 % 2 != 0) {
            int i40 = 70 / 0;
        }
    }
}
