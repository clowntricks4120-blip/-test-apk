package ivas.gov.bisp.enumeration.p025ay;

import android.widget.TextView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ap implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ w.bqO d;
    public final /* synthetic */ w e;

    public ap(w wVar, int i, w.bqO bqo) {
        this.e = wVar;
        this.c = i;
        this.d = bqo;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        Object obj;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = ((i2 ^ 103) | i3) << 1;
        int i5 = -((i2 | 103) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.e.h = arrayList;
        int i8 = a;
        int i9 = i8 & 5;
        int i10 = (((i8 ^ 5) | i9) << 1) - ((i8 | 5) & (~i9));
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            if (i12 >= this.e.h.size()) {
                int i13 = a;
                int i14 = ((i13 ^ 107) | (i13 & 107)) << 1;
                int i15 = -(((~i13) & 107) | (i13 & (-108)));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                b = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 34 / 0;
                    return;
                }
                return;
            }
            int i18 = a + 67;
            b = i18 % 128;
            obj = null;
            if (i18 % 2 != 0) {
                this.e.h.get(i12);
                obj.hashCode();
                throw null;
            }
            Item item = this.e.h.get(i12);
            int i19 = a;
            int i20 = i19 & 79;
            int i21 = (((i19 | 79) & (~i20)) - (~(i20 << 1))) - 1;
            b = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 12 / 0;
                if (item.getOptionId() == this.c) {
                    break;
                }
                int i23 = (i12 | 1) << 1;
                int i24 = -(i12 ^ 1);
                i12 = (i24 | i23) + (i23 & i24);
                int i25 = b;
                int i26 = i25 & 57;
                int i27 = ((i25 | 57) & (~i26)) + (i26 << 1);
                a = i27 % 128;
                int i28 = i27 % 2;
            } else {
                if (item.getOptionId() == this.c) {
                    break;
                }
                int i29 = (i12 | 1) << 1;
                int i210 = -(i12 ^ 1);
                i12 = (i210 | i29) + (i29 & i210);
                int i211 = b;
                int i212 = i211 & 57;
                int i213 = ((i211 | 57) & (~i212)) + (i212 << 1);
                a = i213 % 128;
                int i214 = i213 % 2;
            }
        }
        w wVar = this.e;
        Item item2 = wVar.h.get(i12);
        int i30 = a;
        int i31 = i30 & 77;
        int i32 = i30 | 77;
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        b = i33 % 128;
        if (i33 % 2 != 0) {
            wVar.k = item2.getOption();
            TextView textView = this.d.z;
            obj.hashCode();
            throw null;
        }
        wVar.k = item2.getOption();
        TextView textView2 = this.d.z;
        int i34 = b;
        int i35 = (i34 & 53) + (i34 | 53);
        a = i35 % 128;
        int i36 = i35 % 2;
        textView2.setText(this.e.k);
        int i37 = b;
        int i38 = (i37 ^ 29) + ((i37 & 29) << 1);
        a = i38 % 128;
        int i39 = i38 % 2;
    }
}
