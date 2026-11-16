package ivas.gov.bisp.enumeration.bK;

import android.content.Context;
import android.content.SharedPreferences;
import ivas.gov.bisp.enumeration.de.c;
import ivas.gov.bisp.enumeration.de.j;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class ah {
    private static int a = 1;
    private static int b;
    public static ah c;
    public SharedPreferences d;
    public SharedPreferences.Editor e;

    public ah(Context context) {
        SharedPreferences sharedPreferencesC;
        Object obj = null;
        try {
            sharedPreferencesC = j.c("ApplicationDetails", c.b(c.c), context.getApplicationContext(), j.bJJ.c, j.bJK.c);
            int i = 2 % 2;
        } catch (IOException | GeneralSecurityException unused) {
            int i2 = b;
            int i3 = i2 & 35;
            int i4 = (((i2 | 35) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            sharedPreferencesC = null;
        }
        this.d = sharedPreferencesC;
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        int i7 = b;
        int i8 = i7 & 99;
        int i9 = (i7 | 99) & (~i8);
        int i10 = i8 << 1;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        this.e = editorEdit;
        int i14 = i12 + 33;
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static ah c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 126) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        ah ahVar = c;
        int i5 = i2 + 79;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return ahVar;
        }
        throw null;
    }

    public int d(String str, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 93;
        int i5 = (i3 | 93) & (~i4);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            this.d.getInt(str, i);
            throw null;
        }
        int i8 = this.d.getInt(str, i);
        int i9 = b + 29;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 39 / 0;
        }
        return i8;
    }

    public String e(String str, String str2) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 70) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = this.d;
        if (i3 != 0) {
            return sharedPreferences.getString(str, str2);
        }
        sharedPreferences.getString(str, str2);
        throw null;
    }

    public void f(String str, String str2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-22)) | ((~i2) & 21);
        int i4 = -(-((i2 & 21) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.e.putString(str, str2);
            throw null;
        }
        this.e.putString(str, str2);
        int i6 = a;
        int i7 = i6 & 79;
        int i8 = ((i6 ^ 79) | i7) << 1;
        int i9 = -((i6 | 79) & (~i7));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        this.e.commit();
        int i12 = b + 33;
        a = i12 % 128;
        int i13 = i12 % 2;
    }
}
