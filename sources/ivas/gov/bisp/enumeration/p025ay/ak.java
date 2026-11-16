package ivas.gov.bisp.enumeration.p025ay;

import android.widget.TextView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ak implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ w.bqO d;
    public final /* synthetic */ w e;

    public ak(w wVar, int i, w.bqO bqo) {
        this.e = wVar;
        this.c = i;
        this.d = bqo;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 109) << 1) - (~(-(((~i2) & 109) | (i2 & (-110)))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.e.i = arrayList;
        int i5 = a;
        int i6 = (((i5 & (-110)) | ((~i5) & 109)) - (~(-(-((i5 & 109) << 1))))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 5;
        }
        int i8 = 0;
        while (i8 < this.e.i.size()) {
            int i9 = a;
            int i10 = i9 & 47;
            int i11 = (i10 - (~((i9 ^ 47) | i10))) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            Item item = this.e.i.get(i8);
            int i13 = a;
            int i14 = ((i13 ^ 117) - (~((i13 & 117) << 1))) - 1;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                item.getOptionId();
                throw null;
            }
            if (item.getOptionId() == this.c) {
                int i15 = a;
                int i16 = i15 ^ 115;
                int i17 = ((i15 & 115) | i16) << 1;
                int i18 = -i16;
                int i19 = (i17 & i18) + (i17 | i18);
                b = i19 % 128;
                int i20 = i19 % 2;
                w wVar = this.e;
                String option = wVar.i.get(i8).getOption();
                int i21 = b + 81;
                a = i21 % 128;
                int i22 = i21 % 2;
                wVar.j = option;
                TextView textView = this.d.y;
                String str = this.e.j;
                int i23 = b;
                int i24 = ((i23 ^ 18) + ((i23 & 18) << 1)) - 1;
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    textView.setText(str);
                    int i25 = 5 / 0;
                } else {
                    textView.setText(str);
                }
                int i26 = b;
                int i27 = ((i26 & 20) + (i26 | 20)) - 1;
                a = i27 % 128;
                if (i27 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i28 = (i8 & 125) + (i8 | 125);
            int i29 = i28 & (-124);
            int i30 = -(-(i28 | (-124)));
            i8 = ((i29 & i30) << 1) + (i29 ^ i30);
            int i31 = a;
            int i32 = i31 | 117;
            int i33 = i32 << 1;
            int i34 = -((~(i31 & 117)) & i32);
            int i35 = (i33 & i34) + (i34 | i33);
            b = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = b;
        int i38 = (((i37 & (-64)) | ((~i37) & 63)) - (~(-(-((i37 & 63) << 1))))) - 1;
        a = i38 % 128;
        int i39 = i38 % 2;
    }
}
