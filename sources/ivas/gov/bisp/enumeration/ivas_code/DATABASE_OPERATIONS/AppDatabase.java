package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS;

import android.content.Context;
import android.provider.Settings;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.J.aI;
import ivas.gov.bisp.enumeration.p096p.h;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SupportFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppDatabase extends aI {
    private static int a = 0;
    private static int b = 1;
    public static AppDatabase l;
    public static String m;
    public static SupportFactory n;

    /* JADX WARN: Code duplicated, block: B:15:0x0038 A[PHI: r2
  0x0038: PHI (r2v14 ivas.gov.bisp.enumeration.BISPApplication) = (r2v13 ivas.gov.bisp.enumeration.BISPApplication), (r2v26 ivas.gov.bisp.enumeration.BISPApplication) binds: [B:14:0x0036, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[Catch: Exception -> 0x00d5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d5, blocks: (B:6:0x0024, B:8:0x002b, B:28:0x008b, B:30:0x00a5, B:33:0x00ba, B:34:0x00bc, B:36:0x00c4, B:35:0x00c1, B:17:0x0043, B:19:0x004f, B:24:0x005d, B:26:0x0078, B:23:0x0053, B:13:0x0031), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[Catch: Exception -> 0x00d5, TRY_ENTER, TryCatch #1 {Exception -> 0x00d5, blocks: (B:6:0x0024, B:8:0x002b, B:28:0x008b, B:30:0x00a5, B:33:0x00ba, B:34:0x00bc, B:36:0x00c4, B:35:0x00c1, B:17:0x0043, B:19:0x004f, B:24:0x005d, B:26:0x0078, B:23:0x0053, B:13:0x0031), top: B:46:0x0022 }] */
    public static AppDatabase l(Context context) {
        BISPApplication bISPApplication;
        int i;
        String string;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 105;
        int i5 = i4 + ((i3 ^ 105) | i4);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (l == null) {
            int i8 = ((i6 ^ 40) + ((i6 & 40) << 1)) - 1;
            int i9 = i8 % 128;
            a = i9;
            try {
                if (i8 % 2 != 0) {
                    bISPApplication = (BISPApplication) context;
                    int i10 = 29 / 0;
                    if (m == null) {
                        i = i9 + 7;
                        b = i % 128;
                        if (i % 2 == 0) {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                            m = string;
                            int i11 = 72 / 0;
                        } else {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                            m = string;
                        }
                        bISPApplication.f42o = string;
                        SupportFactory supportFactory = new SupportFactory(SQLiteDatabase.getBytes(string.toCharArray()));
                        int i12 = a;
                        int i13 = (i12 & 37) + (i12 | 37);
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        n = supportFactory;
                        int i15 = i12 & 39;
                        int i16 = (i12 | 39) & (~i15);
                        int i17 = i15 << 1;
                        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                        b = i18 % 128;
                        int i19 = i18 % 2;
                    }
                } else {
                    bISPApplication = (BISPApplication) context;
                    if (m == null) {
                        i = i9 + 7;
                        b = i % 128;
                        if (i % 2 == 0) {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                            m = string;
                            int i110 = 72 / 0;
                        } else {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                            m = string;
                        }
                        bISPApplication.f42o = string;
                        SupportFactory supportFactory2 = new SupportFactory(SQLiteDatabase.getBytes(string.toCharArray()));
                        int i111 = a;
                        int i112 = (i111 & 37) + (i111 | 37);
                        b = i112 % 128;
                        int i113 = i112 % 2;
                        n = supportFactory2;
                        int i114 = i111 & 39;
                        int i115 = (i111 | 39) & (~i114);
                        int i116 = i114 << 1;
                        int i117 = (i115 ^ i116) + ((i115 & i116) << 1);
                        b = i117 % 128;
                        int i118 = i117 % 2;
                    }
                }
                aI.aZZ azz = new aI.aZZ(context.getApplicationContext(), AppDatabase.class, "enumeration");
                int i20 = (-2) - ((b + 62) ^ (-1));
                a = i20 % 128;
                int i21 = i20 % 2;
                azz.j = true;
                SupportFactory supportFactory3 = n;
                int i22 = a;
                int i23 = i22 & 69;
                int i24 = ((i22 | 69) & (~i23)) + (i23 << 1);
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    azz.h = supportFactory3;
                } else {
                    azz.h = supportFactory3;
                }
                azz.k = false;
                azz.c = true;
                l = (AppDatabase) azz.c();
                int i25 = b + 37;
                a = i25 % 128;
                int i26 = i25 % 2;
            } catch (Exception unused) {
            }
        }
        AppDatabase appDatabase = l;
        int i27 = a;
        int i28 = i27 & 91;
        int i29 = (((i27 | 91) & (~i28)) - (~(i28 << 1))) - 1;
        b = i29 % 128;
        if (i29 % 2 != 0) {
            return appDatabase;
        }
        throw null;
    }

    public abstract h m();
}
