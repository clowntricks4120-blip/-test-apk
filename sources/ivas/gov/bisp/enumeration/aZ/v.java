package ivas.gov.bisp.enumeration.aZ;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ivas.gov.bisp.enumeration.aS.M;

/* JADX INFO: loaded from: classes.dex */
public final class v implements M {
    private static int a = 1;
    private static int b;
    public final SharedPreferences.Editor c;
    public final String d;

    public v(Context context, String str, String str2) {
        this.d = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 != null) {
            this.c = applicationContext.getSharedPreferences(str2, 0).edit();
            int i = a;
            int i2 = ((i ^ 114) + ((i & 114) << 1)) - 1;
            b = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.c = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        int i4 = a;
        int i5 = i4 & 21;
        int i6 = ((((i4 ^ 21) | i5) << 1) - (~(-((i4 | 21) & (~i5))))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }
}
