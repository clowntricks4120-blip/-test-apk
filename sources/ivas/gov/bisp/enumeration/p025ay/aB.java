package ivas.gov.bisp.enumeration.p025ay;

import android.widget.ImageView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class aB implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ aT.brq d;
    public final /* synthetic */ aT e;

    public aB(aT aTVar, int i, aT.brq brqVar) {
        this.e = aTVar;
        this.c = i;
        this.d = brqVar;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        aT aTVar;
        Item item;
        ImageView imageView;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 | 15) << 1;
        int i6 = -(i4 ^ 15);
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            this.e.i = arrayList;
            i = 1;
        } else {
            this.e.i = arrayList;
            i = 0;
        }
        while (i < this.e.i.size()) {
            int i8 = a;
            int i9 = i8 & 87;
            int i10 = i8 | 87;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                this.e.i.get(i);
                throw null;
            }
            Item item2 = this.e.i.get(i);
            int i12 = b;
            int i13 = (((i12 ^ 83) | (i12 & 83)) << 1) - (((~i12) & 83) | (i12 & (-84)));
            a = i13 % 128;
            int i14 = i13 % 2;
            if (item2.getOptionId() == this.c) {
                int i15 = b;
                int i16 = i15 & 9;
                int i17 = ((i15 | 9) & (~i16)) + (i16 << 1);
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    aTVar = this.e;
                    item = aTVar.i.get(i);
                    int i18 = 58 / 0;
                } else {
                    aTVar = this.e;
                    item = aTVar.i.get(i);
                }
                int i19 = a;
                int i20 = (((i19 & (-104)) | ((~i19) & 103)) - (~((i19 & 103) << 1))) - 1;
                b = i20 % 128;
                int i21 = i20 % 2;
                aTVar.j = item.getOption();
                aT.brq brqVar = this.d;
                int i22 = b;
                int i23 = ((i22 | 9) << 1) - (i22 ^ 9);
                a = i23 % 128;
                if (i23 % 2 != 0) {
                    brqVar.z.setText(this.e.j);
                    throw null;
                }
                brqVar.z.setText(this.e.j);
                Item item3 = this.e.i.get(i);
                int i24 = b;
                int i25 = i24 & 39;
                int i26 = i25 + ((i24 ^ 39) | i25);
                a = i26 % 128;
                int i27 = i26 % 2;
                if (item3.getOptionId() != 186) {
                    break;
                }
                int i28 = b;
                int i29 = i28 & 41;
                int i30 = i29 + ((i28 ^ 41) | i29);
                a = i30 % 128;
                if (i30 % 2 != 0) {
                    imageView = this.d.B;
                    i2 = 56;
                } else {
                    imageView = this.d.B;
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                return;
            }
            i++;
            int i31 = a;
            int i32 = i31 & 55;
            int i33 = ((i31 | 55) & (~i32)) + (i32 << 1);
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = b;
        int i36 = i35 & 83;
        int i37 = (i35 ^ 83) | i36;
        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
        a = i38 % 128;
        int i39 = i38 % 2;
    }
}
