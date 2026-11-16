package ivas.gov.bisp.enumeration.p012al;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.h;

/* JADX INFO: loaded from: classes.dex */
public class Z implements K {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ View c;

    public Z(View view) {
        this.c = view;
    }

    public boolean c(aa aaVar, int i, Bundle bundle) {
        h.aWm awo;
        boolean z;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 79) << 1) - (~(-(((~i3) & 79) | (i3 & (-80)))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = Build.VERSION.SDK_INT;
        int i7 = a;
        int i8 = i7 & 53;
        int i9 = i7 | 53;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        if (i6 >= 25) {
            int i13 = i11 + 73;
            int i14 = i13 % 128;
            a = i14;
            if (i13 % 2 != 0 && (i & 1) != 0) {
                int i15 = (((i14 | 10) << 1) - (i14 ^ 10)) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                try {
                    aaVar.a.b();
                    aa.aXK axk = aaVar.a;
                    int i17 = a;
                    int i18 = i17 & 17;
                    int i19 = -(-((i17 ^ 17) | i18));
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    InputContentInfo inputContentInfo = (InputContentInfo) axk.d();
                    if (bundle == null) {
                        bundle = new Bundle();
                        int i22 = b;
                        int i23 = i22 & 107;
                        int i24 = -(-(i22 | 107));
                        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                        a = i25 % 128;
                        int i26 = i25 % 2;
                    } else {
                        Bundle bundle2 = new Bundle(bundle);
                        int i27 = a;
                        int i28 = i27 & 117;
                        int i29 = (i28 - (~((i27 ^ 117) | i28))) - 1;
                        b = i29 % 128;
                        int i30 = i29 % 2;
                        bundle = bundle2;
                    }
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                    int i31 = a;
                    int i32 = (i31 ^ 15) + ((i31 & 15) << 1);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        ClipData clipData = new ClipData(aaVar.a.c(), new ClipData.Item(aaVar.a.a()));
        int i34 = b + 89;
        a = i34 % 128;
        int i35 = i34 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            awo = new h.aWn(clipData, 2);
            int i36 = a;
            int i37 = (i36 & 73) + (i36 | 73);
            b = i37 % 128;
            int i38 = i37 % 2;
        } else {
            awo = new h.aWo(clipData, 2);
            int i39 = b + 57;
            a = i39 % 128;
            int i40 = i39 % 2;
        }
        awo.e(aaVar.a.e());
        int i41 = a;
        int i42 = ((i41 & (-36)) | ((~i41) & 35)) + ((i41 & 35) << 1);
        b = i42 % 128;
        int i43 = i42 % 2;
        awo.setExtras(bundle);
        h hVarB = awo.b();
        int i44 = b;
        int i45 = (((i44 & (-100)) | ((~i44) & 99)) - (~(-(-((i44 & 99) << 1))))) - 1;
        a = i45 % 128;
        if (i45 % 2 == 0) {
            T.m(this.c, hVarB);
            throw null;
        }
        if (T.m(this.c, hVarB) == null) {
            int i46 = b + 11;
            int i47 = i46 % 128;
            a = i47;
            int i48 = i46 % 2;
            int i49 = ((i47 ^ 54) + ((i47 & 54) << 1)) - 1;
            b = i49 % 128;
            int i50 = i49 % 2;
            z = true;
        } else {
            z = false;
        }
        int i51 = a;
        int i52 = i51 & 39;
        int i53 = (i52 - (~(-(-((i51 ^ 39) | i52))))) - 1;
        b = i53 % 128;
        if (i53 % 2 != 0) {
            int i54 = 59 / 0;
        }
        return z;
    }
}
