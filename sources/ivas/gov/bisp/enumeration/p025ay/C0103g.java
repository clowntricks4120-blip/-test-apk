package ivas.gov.bisp.enumeration.p025ay;

import android.widget.TextView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ay.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0103g implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ C0100at.bqZ d;
    public final /* synthetic */ C0100at e;

    public C0103g(C0100at c0100at, int i, C0100at.bqZ bqz) {
        this.e = c0100at;
        this.c = i;
        this.d = bqz;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        Item item;
        int i = 2 % 2;
        int i2 = b + 109;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.e.h = arrayList;
        int i4 = a;
        int i5 = i4 & 109;
        int i6 = (i4 | 109) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < this.e.h.size()) {
            int i11 = b;
            int i12 = (i11 | 87) << 1;
            int i13 = -(((~i11) & 87) | (i11 & (-88)));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                item = this.e.h.get(i10);
                int i15 = 19 / 0;
            } else {
                item = this.e.h.get(i10);
            }
            if (item.getOptionId() == this.c) {
                int i16 = a;
                int i17 = (i16 & (-124)) | ((~i16) & 123);
                int i18 = (i16 & 123) << 1;
                int i19 = (i17 & i18) + (i18 | i17);
                b = i19 % 128;
                Object obj = null;
                if (i19 % 2 == 0) {
                    this.e.h.get(i10).getOption();
                    obj.hashCode();
                    throw null;
                }
                C0100at c0100at = this.e;
                c0100at.k = c0100at.h.get(i10).getOption();
                TextView textView = this.d.z;
                String str = this.e.k;
                int i20 = b;
                int i21 = i20 & 31;
                int i22 = (((i20 | 31) & (~i21)) - (~(i21 << 1))) - 1;
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    textView.setText(str);
                    obj.hashCode();
                    throw null;
                }
                textView.setText(str);
                int i23 = a;
                int i24 = i23 & 89;
                int i25 = i24 + ((i23 ^ 89) | i24);
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            i10 = (-2) - ((i10 + 2) ^ (-1));
            int i26 = a;
            int i27 = i26 ^ 95;
            int i28 = (i26 & 95) << 1;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            b = i29 % 128;
            if (i29 % 2 == 0) {
                int i30 = 4 / 4;
            }
        }
        int i31 = a;
        int i32 = ((i31 | 39) << 1) - (((~i31) & 39) | (i31 & (-40)));
        b = i32 % 128;
        int i33 = i32 % 2;
    }
}
