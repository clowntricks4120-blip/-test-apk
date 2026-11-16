package ivas.gov.bisp.enumeration.p051bx;

import android.widget.TextView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class M implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ C0229m.btm d;
    public final /* synthetic */ C0229m e;

    public M(C0229m c0229m, int i, C0229m.btm btmVar) {
        this.e = c0229m;
        this.c = i;
        this.d = btmVar;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 31;
        int i4 = (i2 ^ 31) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.h = arrayList;
        int i7 = a + 37;
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < this.e.h.size()) {
            int i10 = a;
            int i11 = i10 & 29;
            int i12 = (i11 - (~(-(-((i10 ^ 29) | i11))))) - 1;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                this.e.h.get(i9);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.e.h.get(i9).getOptionId() == this.c) {
                int i13 = b;
                int i14 = i13 & 59;
                int i15 = (((i13 | 59) & (~i14)) - (~(i14 << 1))) - 1;
                a = i15 % 128;
                int i16 = i15 % 2;
                C0229m c0229m = this.e;
                Item item = c0229m.h.get(i9);
                int i17 = b;
                int i18 = ((i17 | 38) << 1) - (i17 ^ 38);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                c0229m.k = item.getOption();
                TextView textView = this.d.z;
                int i21 = b;
                int i22 = i21 & 105;
                int i23 = -(-((i21 ^ 105) | i22));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    textView.setText(this.e.k);
                    return;
                } else {
                    textView.setText(this.e.k);
                    int i25 = 43 / 0;
                    return;
                }
            }
            int i26 = i9 & 1;
            i9 = ((i9 | 1) & (~i26)) + (i26 << 1);
            int i27 = b;
            int i28 = (-2) - (((i27 ^ 126) + ((i27 & 126) << 1)) ^ (-1));
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = b + 121;
        a = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 16 / 0;
        }
    }
}
