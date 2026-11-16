package ivas.gov.bisp.enumeration.I;

import android.content.Context;
import android.content.Intent;
import ivas.gov.bisp.enumeration.OooO0o0.OooO0o;
import ivas.gov.bisp.enumeration.p084g.h;

/* JADX INFO: loaded from: classes.dex */
public final class i extends OooO0o<Intent, h> {
    private static int a = 1;
    private static int b;

    public final Intent c(Context context, Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-114)) | ((~i2) & 113);
        int i4 = (i2 & 113) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        Intent intent = (Intent) obj;
        int i8 = ((i6 ^ 67) | (i6 & 67)) << 1;
        int i9 = -(((~i6) & 67) | (i6 & (-68)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return intent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final Object e(int i, Intent intent) {
        int i2 = 2 % 2;
        h hVar = new h(i, intent);
        int i3 = b;
        int i4 = i3 & 83;
        int i5 = (i3 | 83) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 57 / 0;
        }
        return hVar;
    }
}
