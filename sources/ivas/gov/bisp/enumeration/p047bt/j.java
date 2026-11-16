package ivas.gov.bisp.enumeration.p047bt;

import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ r.brG d;
    public final /* synthetic */ r e;

    public j(r rVar, int i, r.brG brg) {
        this.e = rVar;
        this.c = i;
        this.d = brg;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 45) | (i2 & 45)) << 1;
        int i4 = -(((~i2) & 45) | (i2 & (-46)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.i = arrayList;
        int i7 = 0;
        while (i7 < this.e.i.size()) {
            int i8 = b;
            int i9 = (((i8 | 30) << 1) - (i8 ^ 30)) - 1;
            a = i9 % 128;
            Object obj = null;
            if (i9 % 2 != 0) {
                this.e.i.get(i7);
                obj.hashCode();
                throw null;
            }
            if (this.e.i.get(i7).getOptionId() == this.c) {
                int i10 = a + 121;
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    this.e.i.get(i7);
                    throw null;
                }
                r rVar = this.e;
                rVar.j = rVar.i.get(i7).getOption();
                r.brG brg = this.d;
                int i11 = a;
                int i12 = i11 & 123;
                int i13 = (i11 ^ 123) | i12;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    brg.y.setText(this.e.j);
                    return;
                } else {
                    brg.y.setText(this.e.j);
                    int i15 = 22 / 0;
                    return;
                }
            }
            int i16 = i7 & (-4);
            int i17 = ((i7 | (-4)) & (~i16)) + (i16 << 1);
            int i18 = (i17 | 5) << 1;
            int i19 = -(((~i17) & 5) | (i17 & (-6)));
            i7 = (i19 | i18) + (i18 & i19);
            int i20 = b + 29;
            a = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 2 % 3;
            }
        }
        int i22 = (-2) - ((a + 42) ^ (-1));
        b = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 96 / 0;
        }
    }
}
