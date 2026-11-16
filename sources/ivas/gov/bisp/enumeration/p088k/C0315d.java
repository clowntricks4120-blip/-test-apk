package ivas.gov.bisp.enumeration.p088k;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0315d {
    private static int a = 1;
    private static int b;

    public static void b(View view, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 109;
        int i4 = -(-((i2 ^ 109) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 26) {
            int i7 = a;
            int i8 = i7 & 49;
            int i9 = (i7 ^ 49) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                view.setTooltipText(charSequence);
                throw null;
            }
            view.setTooltipText(charSequence);
            int i11 = b + 87;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        ac acVar = ac.c;
        if (acVar != null) {
            int i12 = a;
            int i13 = ((i12 ^ 90) + ((i12 & 90) << 1)) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            if (acVar.f == view) {
                int i15 = b + 5;
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    ac.c(null);
                    obj.hashCode();
                    throw null;
                }
                ac.c(null);
                int i16 = a + 63;
                b = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ac(view, charSequence);
            int i18 = b;
            int i19 = (i18 & 15) + (i18 | 15);
            a = i19 % 128;
            int i20 = i19 % 2;
            return;
        }
        int i21 = a;
        int i22 = i21 & 17;
        int i23 = i22 + ((i21 ^ 17) | i22);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            ac acVar2 = ac.d;
            throw null;
        }
        ac acVar3 = ac.d;
        if (acVar3 != null) {
            int i24 = a;
            int i25 = i24 & 91;
            int i26 = (i24 ^ 91) | i25;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            b = i27 % 128;
            int i28 = i27 % 2;
            if (acVar3.f == view) {
                int i29 = a;
                int i30 = i29 & 17;
                int i31 = (i29 | 17) & (~i30);
                int i32 = -(-(i30 << 1));
                int i33 = (i31 & i32) + (i31 | i32);
                b = i33 % 128;
                int i34 = i33 % 2;
                acVar3.e();
                int i35 = b;
                int i36 = i35 & 73;
                int i37 = ((i35 ^ 73) | i36) << 1;
                int i38 = -((i35 | 73) & (~i36));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                a = i39 % 128;
                int i40 = i39 % 2;
            }
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
        int i41 = a;
        int i42 = i41 ^ 95;
        int i43 = (i41 & 95) << 1;
        int i44 = (i42 & i43) + (i43 | i42);
        b = i44 % 128;
        int i45 = i44 % 2;
    }
}
