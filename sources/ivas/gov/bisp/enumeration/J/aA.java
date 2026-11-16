package ivas.gov.bisp.enumeration.J;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class aA {
    private static int a = 1;
    private static int b;
    public final boolean c;
    public final SupportSQLiteOpenHelper.OooO0O0 d;
    public final Context e;
    public final String f;
    public final aI.bab g;
    public final int h;
    public final boolean i;
    public final Executor j;
    public final boolean k;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$OooO0O0;Livas/gov/bisp/enumeration/J/aI$bab;Ljava/util/List<Livas/gov/bisp/enumeration/J/aI$baa;>;ZLjava/lang/Object;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set<Ljava/lang/Integer;>;Ljava/lang/String;Ljava/io/File;)V */
    public aA(Context context, String str, SupportSQLiteOpenHelper.OooO0O0 oooO0O0, aI.bab babVar, List list, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set set, String str2, File file) {
        this.d = oooO0O0;
        this.e = context;
        this.f = str;
        this.g = babVar;
        this.i = z;
        this.h = i;
        this.j = executor;
        this.k = z3;
        this.c = z4;
    }

    public boolean c(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 + 107;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        boolean z = false;
        Object obj = null;
        if (i > i2) {
            int i8 = i4 & 53;
            int i9 = (~i8) & (i4 | 53);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = (i4 & 71) + (i4 | 71);
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i4 & 75;
            int i16 = ((i4 ^ 75) | i15) << 1;
            int i17 = -((~i15) & (i4 | 75));
            int i18 = (i16 & i17) + (i16 | i17);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                throw null;
            }
            if (this.c) {
                int i19 = (i4 | 7) << 1;
                int i20 = -((i4 & (-8)) | ((~i4) & 7));
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
        } else {
            int i22 = i6 & 105;
            int i23 = -(-((i6 ^ 105) | i22));
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        if (this.k) {
            z = true;
        } else {
            int i26 = a;
            int i27 = i26 & 13;
            int i28 = i27 + ((i26 ^ 13) | i27);
            b = i28 % 128;
            int i29 = i28 % 2;
            int i30 = i26 & 7;
            int i31 = (((i26 | 7) & (~i30)) - (~(-(-(i30 << 1))))) - 1;
            b = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = b;
        int i34 = ((i33 & (-88)) | ((~i33) & 87)) + ((i33 & 87) << 1);
        a = i34 % 128;
        if (i34 % 2 != 0) {
            return z;
        }
        throw null;
    }
}
