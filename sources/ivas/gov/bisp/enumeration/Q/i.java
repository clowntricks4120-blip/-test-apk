package ivas.gov.bisp.enumeration.Q;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.Oooo0o0.o0ooOOo;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i extends RecyclerView.OooOo {
    private static int a = 1;
    private static int b;
    public final Calendar c = O.g();
    public final Calendar d = O.g();
    public final /* synthetic */ com.google.android.material.datepicker.h e;

    public i(com.google.android.material.datepicker.h hVar) {
        this.e = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0Oo0oo o0oo0oo) {
        GridLayoutManager gridLayoutManager;
        r rVar;
        int i;
        int i2;
        View viewV;
        int i3;
        GridLayoutManager gridLayoutManager2;
        int width;
        float f;
        float f2;
        int left;
        int width2;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 109;
        int i8 = i7 - (~(-(-((i6 ^ 109) | i7))));
        int i9 = 1;
        int i10 = i8 - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        if (recyclerView.getAdapter() instanceof T) {
            int i13 = b;
            int i14 = (i13 ^ 105) + ((i13 & 105) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            if (!(!(recyclerView.getLayoutManager() instanceof GridLayoutManager))) {
                int i16 = b;
                int i17 = i16 & 1;
                int i18 = ((((i16 ^ 1) | i17) << 1) - (~(-((i16 | 1) & (~i17))))) - 1;
                a = i18 % 128;
                int i19 = i18 % 2;
                T t = (T) recyclerView.getAdapter();
                RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
                int i20 = a;
                int i21 = ((i20 | 39) << 1) - (i20 ^ 39);
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    gridLayoutManager = (GridLayoutManager) layoutManager;
                    rVar = this.e.e;
                    int i22 = 34 / 0;
                } else {
                    gridLayoutManager = (GridLayoutManager) layoutManager;
                    rVar = this.e.e;
                }
                Iterator<o0ooOOo<Long, Long>> it = rVar.i().iterator();
                int i23 = b;
                int i24 = (i23 ^ 21) + ((i23 & 21) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                while (((it.hasNext() ? 1 : 0) ^ i9) == 0) {
                    int i26 = a;
                    int i27 = ((((i26 ^ 63) | (i26 & 63)) << i9) - (~(-(((~i26) & 63) | (i26 & (-64)))))) - i9;
                    b = i27 % 128;
                    int i28 = i27 % i4;
                    ivas.gov.bisp.enumeration.p010aj.T next = it.next();
                    F f3 = next.c;
                    int i29 = b;
                    int i30 = (((i29 | 54) << i9) - (i29 ^ 54)) - 1;
                    a = i30 % 128;
                    if (i30 % i4 == 0) {
                        throw null;
                    }
                    if (f3 != 0) {
                        int i31 = ((i29 & (-16)) | ((~i29) & 15)) + ((i29 & 15) << i9);
                        a = i31 % 128;
                        int i32 = i31 % i4;
                        if (next.d != 0) {
                            int i33 = b;
                            int i34 = i33 & 17;
                            int i35 = -(-((i33 ^ 17) | i34));
                            int i36 = (i34 & i35) + (i35 | i34);
                            a = i36 % 128;
                            if (i36 % i4 == 0) {
                                this.c.setTimeInMillis(((Long) f3).longValue());
                                throw null;
                            }
                            this.c.setTimeInMillis(((Long) f3).longValue());
                            int i37 = a;
                            int i38 = ((i37 ^ 4) + ((i37 & 4) << i9)) - i9;
                            b = i38 % 128;
                            int i39 = i38 % i4;
                            Calendar calendar = this.d;
                            long jLongValue = ((Long) next.d).longValue();
                            int i40 = a;
                            int i41 = i40 ^ 53;
                            int i42 = -(-((i40 & 53) << i9));
                            int i43 = (i41 ^ i42) + ((i42 & i41) << i9);
                            b = i43 % 128;
                            int i44 = i43 % i4;
                            calendar.setTimeInMillis(jLongValue);
                            int iH = t.h(this.c.get(i9));
                            int i45 = b;
                            int i46 = (i45 ^ 79) + ((i45 & 79) << i9);
                            a = i46 % 128;
                            int iH2 = t.h(i46 % i4 == 0 ? this.d.get(i12) : this.d.get(i9));
                            int i47 = a;
                            int i48 = i47 & 73;
                            int i49 = i47 | 73;
                            int i50 = ((i48 | i49) << i9) - (i49 ^ i48);
                            b = i50 % 128;
                            int i51 = i50 % i4;
                            View viewV2 = gridLayoutManager.v(iH);
                            View viewV3 = gridLayoutManager.v(iH2);
                            int i52 = a;
                            int i53 = i52 & 15;
                            int i54 = -(-((i52 ^ 15) | i53));
                            int i55 = ((i53 | i54) << i9) - (i54 ^ i53);
                            b = i55 % 128;
                            if (i55 % i4 != 0) {
                                i = gridLayoutManager.G;
                                i2 = iH >> i;
                            } else {
                                i = gridLayoutManager.G;
                                i2 = iH / i;
                            }
                            int i56 = iH2 / i;
                            int i57 = b;
                            int i58 = i57 & 89;
                            int i59 = -(-((i57 ^ 89) | i58));
                            int i60 = ((i58 | i59) << i9) - (i59 ^ i58);
                            a = i60 % 128;
                            int i61 = i60 % i4;
                            int i62 = i2;
                            while (i62 <= i56) {
                                int i63 = b;
                                int i64 = (i63 & (-50)) | ((~i63) & 49);
                                int i65 = -(-((i63 & 49) << i9));
                                int i66 = ((i64 | i65) << i9) - (i65 ^ i64);
                                a = i66 % 128;
                                int i67 = i66 % i4;
                                int i68 = gridLayoutManager.G;
                                int i69 = b;
                                int i70 = (i69 & 111) + (i69 | 111);
                                a = i70 % 128;
                                if (i70 % i4 != 0 ? (viewV = gridLayoutManager.v(i68 * i62)) == null : (viewV = gridLayoutManager.v(i68 / i62)) == null) {
                                    t = t;
                                    gridLayoutManager2 = gridLayoutManager;
                                } else {
                                    int top = viewV.getTop();
                                    c cVar = this.e.i.d;
                                    int i71 = b;
                                    int i72 = (((i71 & (-24)) | (23 & (~i71))) - (~((i71 & 23) << i9))) - i9;
                                    a = i72 % 128;
                                    if (i72 % 2 == 0) {
                                        Object obj = null;
                                        int i73 = cVar.c.top;
                                        viewV.getBottom();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    int i74 = cVar.c.top;
                                    int bottom = viewV.getBottom();
                                    int i75 = b;
                                    int i76 = (i75 ^ 29) + ((i75 & 29) << i9);
                                    a = i76 % 128;
                                    if (i76 % 2 == 0) {
                                        int i77 = this.e.i.d.c.bottom;
                                        throw null;
                                    }
                                    int i78 = this.e.i.d.c.bottom;
                                    if (i62 == i2) {
                                        int i79 = a;
                                        int i80 = i79 & 121;
                                        int i81 = -(-((i79 ^ 121) | i80));
                                        int i82 = (i80 & i81) + (i80 | i81);
                                        b = i82 % 128;
                                        int i83 = i82 % i4;
                                        int left2 = viewV2.getLeft();
                                        int width3 = viewV2.getWidth();
                                        int i84 = b;
                                        int i85 = (((i84 & (-102)) | ((~i84) & 101)) - (~(-(-((i84 & 101) << 1))))) - 1;
                                        int i86 = i85 % 128;
                                        a = i86;
                                        if (i85 % 2 == 0) {
                                            int i87 = width3 & (-2);
                                            int i88 = -(-((width3 ^ (-2)) | i87));
                                            i3 = (((i87 | i88) << 1) - (i87 ^ i88)) / left2;
                                        } else {
                                            int i89 = width3 / 2;
                                            int i90 = -(~(-(-left2)));
                                            i3 = (-2) - (((i89 & i90) + (i90 | i89)) ^ (-1));
                                        }
                                        int i91 = ((i86 & 51) - (~(i86 | 51))) - 1;
                                        b = i91 % 128;
                                        int i92 = i91 % 2;
                                    } else {
                                        int i93 = a;
                                        int i94 = (i93 & 95) + (i93 | 95);
                                        b = i94 % 128;
                                        if (i94 % 2 != 0) {
                                            int i95 = 3 / 4;
                                        }
                                        i3 = 0;
                                    }
                                    if (i62 == i56) {
                                        int i96 = a;
                                        int i97 = (((i96 ^ 9) | (i96 & 9)) << 1) - (((~i96) & 9) | (i96 & (-10)));
                                        b = i97 % 128;
                                        if (i97 % 2 != 0) {
                                            left = viewV3.getLeft();
                                            width2 = viewV3.getWidth();
                                            int i98 = 3 / 0;
                                        } else {
                                            left = viewV3.getLeft();
                                            width2 = viewV3.getWidth();
                                        }
                                        int i99 = b + 116;
                                        int i100 = (i99 ^ (-1)) + (i99 << 1);
                                        gridLayoutManager2 = gridLayoutManager;
                                        a = i100 % 128;
                                        if (i100 % 2 == 0) {
                                            width = (width2 % 2) * left;
                                        } else {
                                            int i101 = width2 / 2;
                                            int i102 = -(-left);
                                            int i103 = i101 & i102;
                                            width = (i103 - (~((i102 ^ i101) | i103))) - 1;
                                        }
                                    } else {
                                        gridLayoutManager2 = gridLayoutManager;
                                        width = recyclerView.getWidth();
                                        int i104 = b;
                                        int i105 = i104 & 57;
                                        int i106 = i104 | 57;
                                        int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                                        a = i107 % 128;
                                        int i108 = i107 % 2;
                                    }
                                    float f4 = i3;
                                    float f5 = (((top | i74) << 1) - (~(-((i74 & (~top)) | ((~i74) & top))))) - 1;
                                    int i109 = a;
                                    int i110 = (i109 & 35) + (i109 | 35);
                                    b = i110 % 128;
                                    if (i110 % 2 != 0) {
                                        f = width;
                                        f2 = bottom * i78;
                                    } else {
                                        f = width;
                                        int i111 = -i78;
                                        f2 = ((bottom & i111) - (~(-(-(i111 | bottom))))) - 1;
                                    }
                                    com.google.android.material.datepicker.h hVar = this.e;
                                    float f6 = f;
                                    float f7 = f2;
                                    int i112 = i109 + 81;
                                    b = i112 % 128;
                                    int i113 = i112 % 2;
                                    h hVar2 = hVar.i;
                                    int i114 = a;
                                    int i115 = (((i114 | 126) << 1) - (i114 ^ 126)) - 1;
                                    b = i115 % 128;
                                    int i116 = i115 % 2;
                                    canvas.drawRect(f4, f5, f6, f7, hVar2.h);
                                    if (i116 != 0) {
                                        throw null;
                                    }
                                }
                                i62++;
                                int i117 = b;
                                int i118 = i117 & 55;
                                int i119 = (i117 | 55) & (~i118);
                                int i120 = i118 << 1;
                                int i121 = ((i119 | i120) << 1) - (i119 ^ i120);
                                a = i121 % 128;
                                int i122 = i121 % 2;
                                i9 = 1;
                                gridLayoutManager = gridLayoutManager2;
                                t = t;
                                i4 = 2;
                                i12 = 0;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        int i123 = a;
        int i124 = (-2) - (((i123 & 114) + (i123 | 114)) ^ (-1));
        b = i124 % 128;
        if (i124 % 2 != 0) {
            int i125 = 36 / 0;
        }
    }
}
