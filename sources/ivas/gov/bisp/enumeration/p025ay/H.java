package ivas.gov.bisp.enumeration.p025ay;

import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class H implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ f.brv d;
    public final /* synthetic */ f e;

    public H(f fVar, int i, f.brv brvVar) {
        this.e = fVar;
        this.c = i;
        this.d = brvVar;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 35;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.e.i = arrayList;
            i = 1;
        } else {
            this.e.i = arrayList;
            i = 0;
        }
        while (true) {
            Object obj = null;
            if (i >= this.e.i.size()) {
                int i4 = a;
                int i5 = ((i4 ^ 120) + ((i4 & 120) << 1)) - 1;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i6 = b;
            int i7 = (-2) - ((((i6 | 40) << 1) - (i6 ^ 40)) ^ (-1));
            a = i7 % 128;
            int i8 = i7 % 2;
            int optionId = this.e.i.get(i).getOptionId();
            int i9 = b;
            int i10 = (i9 & 49) + (i9 | 49);
            int i11 = i10 % 128;
            a = i11;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (optionId == this.c) {
                f fVar = this.e;
                Item item = fVar.i.get(i);
                int i12 = a + 72;
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    fVar.j = item.getOption();
                    throw null;
                }
                fVar.j = item.getOption();
                f.brv brvVar = this.d;
                int i14 = b;
                int i15 = i14 & 91;
                int i16 = -(-((i14 ^ 91) | i15));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    brvVar.y.setText(this.e.j);
                    int i18 = 71 / 0;
                } else {
                    brvVar.y.setText(this.e.j);
                }
                int i19 = b;
                int i20 = (i19 ^ 58) + ((i19 & 58) << 1);
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                a = i21 % 128;
                int i22 = i21 % 2;
                return;
            }
            i = ((i & 1) << 1) + ((i & (-2)) | ((~i) & 1));
            int i23 = i11 & 101;
            int i24 = i11 | 101;
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
        }
    }
}
