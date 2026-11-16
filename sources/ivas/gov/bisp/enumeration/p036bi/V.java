package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ C d;

    public /* synthetic */ V(C c, int i) {
        this.c = i;
        this.d = c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 62) << 1) - (i3 ^ 62)) - 1;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this.c;
        if (i5 == 0) {
            DashboardActivity.w(this.d.c);
            int i6 = b + 35;
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if (i5 == 1) {
            DashboardActivity.w(this.d.c);
            int i8 = b;
            int i9 = i8 & 71;
            int i10 = -(-((i8 ^ 71) | i9));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i12 = i3 | 83;
        int i13 = (i12 << 1) - ((~(i3 & 83)) & i12);
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        int i16 = (((i14 & (-96)) | ((~i14) & 95)) - (~(-(-((i14 & 95) << 1))))) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
        DashboardActivity.w(this.d.c);
        int i18 = a + 111;
        b = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 13 / 0;
        }
    }
}
