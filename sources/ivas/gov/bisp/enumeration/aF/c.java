package ivas.gov.bisp.enumeration.aF;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ivas.gov.bisp.enumeration.P.J;
import ivas.gov.bisp.enumeration.p081d.am;

/* JADX INFO: loaded from: classes.dex */
public class c implements J.bdL {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ BottomSheetBehavior d;

    public c(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.d = bottomSheetBehavior;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x020f  */
    @Override // ivas.gov.bisp.enumeration.P.J.bdL
    public am b(View view, am amVar, J.beS bes) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 & 44) + (i4 | 44)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        BottomSheetBehavior bottomSheetBehavior = this.d;
        int iJ = amVar.j();
        int i7 = b;
        int i8 = (i7 & (-44)) | ((~i7) & 43);
        int i9 = (i7 & 43) << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            bottomSheetBehavior.s = iJ;
            J.c(view);
            view.getPaddingBottom();
            throw null;
        }
        bottomSheetBehavior.s = iJ;
        boolean zC = J.c(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior2 = this.d;
        int i11 = a;
        int i12 = i11 & 39;
        int i13 = (i11 | 39) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        if (!(!bottomSheetBehavior2.m)) {
            int i17 = b;
            int i18 = i17 & 125;
            int i19 = -(-(i17 | 125));
            int i20 = (i18 & i19) + (i19 | i18);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                bottomSheetBehavior2.q = amVar.g();
                int i21 = 81 / 0;
            } else {
                bottomSheetBehavior2.q = amVar.g();
            }
            int i22 = bes.d;
            BottomSheetBehavior bottomSheetBehavior3 = this.d;
            int i23 = a;
            int i24 = (((i23 | 82) << 1) - (i23 ^ 82)) - 1;
            b = i24 % 128;
            int i25 = i24 % 2;
            int i26 = bottomSheetBehavior3.q;
            if (i25 == 0) {
                paddingBottom = i22 >> i26;
            } else {
                int i27 = -(-i26);
                int i28 = i22 & i27;
                paddingBottom = ((i22 | i27) & (~i28)) + (i28 << 1);
            }
            int i29 = a;
            int i30 = (-2) - (((i29 ^ 118) + ((i29 & 118) << 1)) ^ (-1));
            b = i30 % 128;
            int i31 = i30 % 2;
        }
        if (!(!this.d.f32o)) {
            int i32 = b;
            int i33 = (((i32 ^ 121) | (i32 & 121)) << 1) - ((i32 & (-122)) | ((~i32) & 121));
            a = i33 % 128;
            int i34 = i33 % 2;
            if (zC) {
                int i35 = ((i32 | 119) << 1) - (i32 ^ 119);
                a = i35 % 128;
                if (i35 % 2 != 0) {
                    int i36 = bes.c;
                    obj.hashCode();
                    throw null;
                }
                i2 = bes.c;
            } else {
                i2 = bes.a;
                int i37 = a;
                int i38 = ((i37 ^ 59) | (i37 & 59)) << 1;
                int i39 = -(((~i37) & 59) | (i37 & (-60)));
                int i40 = (i38 & i39) + (i39 | i38);
                b = i40 % 128;
                int i41 = i40 % 2;
            }
            int i42 = -(-amVar.h());
            paddingLeft = ((i2 | i42) << 1) - (i2 ^ i42);
            int i43 = b;
            int i44 = (((i43 | 86) << 1) - (i43 ^ 86)) - 1;
            a = i44 % 128;
            int i45 = i44 % 2;
        }
        if (this.d.p) {
            int i46 = a;
            int i47 = i46 & 71;
            int i48 = -(-((i46 ^ 71) | i47));
            int i49 = (i47 & i48) + (i48 | i47);
            b = i49 % 128;
            if (i49 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (zC) {
                i = bes.a;
                int i50 = b;
                int i51 = (i50 & (-116)) | ((~i50) & 115);
                int i52 = -(-((i50 & 115) << 1));
                int i53 = (i51 & i52) + (i52 | i51);
                a = i53 % 128;
                int i54 = i53 % 2;
            } else {
                i = bes.c;
                int i55 = b;
                int i56 = ((i55 ^ 6) + ((i55 & 6) << 1)) - 1;
                a = i56 % 128;
                int i57 = i56 % 2;
            }
            int i58 = amVar.i();
            int i59 = -(-i);
            paddingRight = (i58 ^ i59) + ((i59 & i58) << 1);
            int i60 = b;
            int i61 = i60 & 37;
            int i62 = -(-((i60 ^ 37) | i61));
            int i63 = (i61 & i62) + (i62 | i61);
            a = i63 % 128;
            int i64 = i63 % 2;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (this.c) {
            int i65 = b;
            int i66 = (i65 & 78) + (i65 | 78);
            int i67 = (i66 ^ (-1)) + (i66 << 1);
            a = i67 % 128;
            int i68 = i67 % 2;
            BottomSheetBehavior bottomSheetBehavior4 = this.d;
            int i69 = amVar.d.h().g;
            int i70 = a;
            int i71 = (i70 & (-72)) | ((~i70) & 71);
            int i72 = (i70 & 71) << 1;
            int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
            b = i73 % 128;
            if (i73 % 2 == 0) {
                bottomSheetBehavior4.l = i69;
                throw null;
            }
            bottomSheetBehavior4.l = i69;
            int i74 = b;
            int i75 = (i74 ^ 91) + ((i74 & 91) << 1);
            a = i75 % 128;
            int i76 = i75 % 2;
        }
        BottomSheetBehavior bottomSheetBehavior5 = this.d;
        if (bottomSheetBehavior5.m) {
            bottomSheetBehavior5.M(false);
            int i77 = b + 125;
            a = i77 % 128;
            int i78 = i77 % 2;
        } else {
            int i79 = a;
            int i80 = ((((i79 ^ 49) | (i79 & 49)) << 1) - (~(-(((~i79) & 49) | (i79 & (-50)))))) - 1;
            b = i80 % 128;
            int i81 = i80 % 2;
            if (this.c) {
                bottomSheetBehavior5.M(false);
                int i710 = b + 125;
                a = i710 % 128;
                int i711 = i710 % 2;
            }
        }
        int i82 = a;
        int i83 = (i82 & 45) + (i82 | 45);
        b = i83 % 128;
        if (i83 % 2 != 0) {
            return amVar;
        }
        throw null;
    }
}
