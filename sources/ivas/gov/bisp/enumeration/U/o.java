package ivas.gov.bisp.enumeration.U;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.OooOOO0.o00000OO;
import ivas.gov.bisp.enumeration.o0000OOo.o000oOoO;
import ivas.gov.bisp.enumeration.p088k.Y;

/* JADX INFO: loaded from: classes.dex */
public class o implements AdapterView.OnItemClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ o000oOoO c;

    public o(o000oOoO o000oooo) {
        this.c = o000oooo;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044 A[PHI: r0
  0x0044: PHI (r0v44 ivas.gov.bisp.enumeration.k.Y) = (r0v35 ivas.gov.bisp.enumeration.k.Y), (r0v48 ivas.gov.bisp.enumeration.k.Y) binds: [B:10:0x0042, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:34:0x0115  */
    /* JADX WARN: Code duplicated, block: B:35:0x0132  */
    /* JADX WARN: Code duplicated, block: B:38:0x014b  */
    /* JADX WARN: Code duplicated, block: B:39:0x015f  */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        Y y;
        Y y2;
        Y y3;
        int i2;
        int i3;
        Y y4;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 119;
        int i7 = (i5 ^ 119) | i6;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        if (i < 0) {
            int i10 = i5 ^ 47;
            int i11 = -(-((i5 & 47) << 1));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                y4 = this.c.g;
                int i13 = 43 / 0;
                if (y4.e()) {
                    item = y4.i.getSelectedItem();
                    int i14 = a;
                    int i15 = i14 & 91;
                    int i16 = i15 + ((i14 ^ 91) | i15);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    int i18 = a;
                    int i19 = ((i18 ^ 39) | (i18 & 39)) << 1;
                    int i20 = -(((~i18) & 39) | (i18 & (-40)));
                    int i21 = (i19 & i20) + (i20 | i19);
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    item = null;
                }
            } else {
                y4 = this.c.g;
                if (!(!y4.e())) {
                    item = y4.i.getSelectedItem();
                    int i110 = a;
                    int i111 = i110 & 91;
                    int i112 = i111 + ((i110 ^ 91) | i111);
                    b = i112 % 128;
                    int i113 = i112 % 2;
                } else {
                    int i114 = a;
                    int i115 = ((i114 ^ 39) | (i114 & 39)) << 1;
                    int i23 = -(((~i114) & 39) | (i114 & (-40)));
                    int i24 = (i115 & i23) + (i23 | i115);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    item = null;
                }
            }
        } else {
            item = this.c.getAdapter().getItem(i);
            int i26 = b + 99;
            a = i26 % 128;
            int i27 = i26 % 2;
        }
        o000oOoO.c(this.c, item);
        AdapterView.OnItemClickListener onItemClickListener = this.c.getOnItemClickListener();
        int i28 = a;
        int i29 = ((i28 ^ 121) - (~(-(-((i28 & 121) << 1))))) - 1;
        b = i29 % 128;
        int i30 = i29 % 2;
        if (onItemClickListener != null) {
            int i31 = i28 + 125;
            b = i31 % 128;
            int i32 = i31 % 2;
            if (view != null) {
                int i33 = i28 & 79;
                int i34 = (i28 | 79) & (~i33);
                int i35 = i33 << 1;
                int i36 = (i34 & i35) + (i34 | i35);
                b = i36 % 128;
                int i37 = i36 % 2;
                if (i < 0) {
                    y = this.c.g;
                    if (y.e()) {
                        view = y.i.getSelectedView();
                        int i38 = b;
                        int i39 = i38 & 45;
                        int i40 = -(-((i38 ^ 45) | i39));
                        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                        a = i41 % 128;
                        int i42 = i41 % 2;
                    } else {
                        i2 = a + 75;
                        int i43 = i2 % 128;
                        b = i43;
                        if (i2 % 2 != 0) {
                            int i44 = 95 / 0;
                        }
                        int i45 = i43 ^ 71;
                        i3 = ((((i43 & 71) | i45) << 1) - (~(-i45))) - 1;
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i46 = 4 % 4;
                        }
                        view = null;
                    }
                    y2 = this.c.g;
                    if (y2.e()) {
                        i = y2.i.getSelectedItemPosition();
                        int i47 = a + 35;
                        b = i47 % 128;
                        int i48 = i47 % 2;
                    } else {
                        int i49 = b;
                        int i50 = i49 & 125;
                        int i51 = -(-(i49 | 125));
                        int i52 = (i50 & i51) + (i50 | i51);
                        a = i52 % 128;
                        int i53 = i52 % 2;
                        int i54 = (i49 & 103) + (i49 | 103);
                        a = i54 % 128;
                        int i55 = i54 % 2;
                        i = -1;
                    }
                    y3 = this.c.g;
                    if (y3.e()) {
                        j = y3.i.getSelectedItemId();
                        int i56 = b;
                        int i57 = (i56 & 103) + (i56 | 103);
                        a = i57 % 128;
                        int i58 = i57 % 2;
                    } else {
                        int i59 = a;
                        int i60 = (i59 & (-26)) | ((~i59) & 25);
                        int i61 = -(-((i59 & 25) << 1));
                        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                        int i63 = i62 % 128;
                        b = i63;
                        int i64 = i62 % 2;
                        int i65 = i63 | 23;
                        int i66 = ((i65 << 1) - (~(-((~(i63 & 23)) & i65)))) - 1;
                        a = i66 % 128;
                        int i67 = i66 % 2;
                        j = Long.MIN_VALUE;
                    }
                }
            } else {
                y = this.c.g;
                if (y.e()) {
                    i2 = a + 75;
                    int i410 = i2 % 128;
                    b = i410;
                    if (i2 % 2 != 0) {
                        int i411 = 95 / 0;
                    }
                    int i412 = i410 ^ 71;
                    i3 = ((((i410 & 71) | i412) << 1) - (~(-i412))) - 1;
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i413 = 4 % 4;
                    }
                    view = null;
                } else {
                    view = y.i.getSelectedView();
                    int i310 = b;
                    int i311 = i310 & 45;
                    int i414 = -(-((i310 ^ 45) | i311));
                    int i415 = ((i311 | i414) << 1) - (i414 ^ i311);
                    a = i415 % 128;
                    int i416 = i415 % 2;
                }
                y2 = this.c.g;
                if (y2.e()) {
                    int i417 = b;
                    int i510 = i417 & 125;
                    int i511 = -(-(i417 | 125));
                    int i512 = (i510 & i511) + (i510 | i511);
                    a = i512 % 128;
                    int i513 = i512 % 2;
                    int i514 = (i417 & 103) + (i417 | 103);
                    a = i514 % 128;
                    int i515 = i514 % 2;
                    i = -1;
                } else {
                    i = y2.i.getSelectedItemPosition();
                    int i418 = a + 35;
                    b = i418 % 128;
                    int i419 = i418 % 2;
                }
                y3 = this.c.g;
                if (y3.e()) {
                    j = y3.i.getSelectedItemId();
                    int i516 = b;
                    int i517 = (i516 & 103) + (i516 | 103);
                    a = i517 % 128;
                    int i518 = i517 % 2;
                } else {
                    int i519 = a;
                    int i68 = (i519 & (-26)) | ((~i519) & 25);
                    int i69 = -(-((i519 & 25) << 1));
                    int i610 = ((i68 | i69) << 1) - (i69 ^ i68);
                    int i611 = i610 % 128;
                    b = i611;
                    int i612 = i610 % 2;
                    int i613 = i611 | 23;
                    int i614 = ((i613 << 1) - (~(-((~(i611 & 23)) & i613)))) - 1;
                    a = i614 % 128;
                    int i615 = i614 % 2;
                    j = Long.MIN_VALUE;
                }
            }
            View view2 = view;
            int i70 = i;
            long j2 = j;
            o00000OO o00000oo = this.c.g.i;
            int i71 = b;
            int i72 = i71 & 99;
            int i73 = -(-((i71 ^ 99) | i72));
            int i74 = (i72 & i73) + (i73 | i72);
            a = i74 % 128;
            if (i74 % 2 == 0) {
                onItemClickListener.onItemClick(o00000oo, view2, i70, j2);
                throw null;
            }
            onItemClickListener.onItemClick(o00000oo, view2, i70, j2);
            int i75 = b;
            int i76 = (i75 ^ 5) + ((i75 & 5) << 1);
            a = i76 % 128;
            int i77 = i76 % 2;
        }
        this.c.g.dismiss();
        int i78 = a;
        int i79 = i78 & 73;
        int i80 = (i79 - (~((i78 ^ 73) | i79))) - 1;
        b = i80 % 128;
        int i81 = i80 % 2;
    }
}
