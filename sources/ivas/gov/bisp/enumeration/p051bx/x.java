package ivas.gov.bisp.enumeration.p051bx;

import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class x implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ C0229m.btm d;
    public final /* synthetic */ C0229m e;

    public x(C0229m c0229m, int i, C0229m.btm btmVar) {
        this.e = c0229m;
        this.c = i;
        this.d = btmVar;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b + 51;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.e.i = arrayList;
        int i4 = a;
        int i5 = i4 & 107;
        int i6 = -(-(i4 | 107));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < this.e.i.size()) {
            int i10 = a;
            int i11 = ((i10 & 40) + (i10 | 40)) - 1;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                this.e.i.get(i9);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.e.i.get(i9).getOptionId() == this.c) {
                int i12 = b;
                int i13 = i12 & 7;
                int i14 = (i12 ^ 7) | i13;
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                C0229m c0229m = this.e;
                Item item = c0229m.i.get(i9);
                int i17 = b + 55;
                a = i17 % 128;
                int i18 = i17 % 2;
                c0229m.j = item.getOption();
                C0229m.btm btmVar = this.d;
                int i19 = a;
                int i20 = ((i19 ^ 83) | (i19 & 83)) << 1;
                int i21 = -(((~i19) & 83) | (i19 & (-84)));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    btmVar.y.setText(this.e.j);
                    return;
                } else {
                    btmVar.y.setText(this.e.j);
                    int i23 = 97 / 0;
                    return;
                }
            }
            int i24 = i9 & 64;
            int i25 = (i9 | 64) & (~i24);
            int i26 = i24 << 1;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            int i28 = i27 & (-63);
            int i29 = (i27 ^ (-63)) | i28;
            i9 = ((i28 | i29) << 1) - (i28 ^ i29);
            int i30 = b;
            int i31 = ((i30 ^ 47) | (i30 & 47)) << 1;
            int i32 = -(((~i30) & 47) | (i30 & (-48)));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            a = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = (-2) - ((a + 34) ^ (-1));
        b = i35 % 128;
        int i36 = i35 % 2;
    }
}
