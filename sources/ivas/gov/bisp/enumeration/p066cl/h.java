package ivas.gov.bisp.enumeration.p066cl;

import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
public final class h implements SupportSQLiteOpenHelper.OooO0O0 {
    private static int a = 0;
    private static int b = 1;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO0O0
    public final SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        int i = 2 % 2;
        c cVar = new c(configuration.a, configuration.b, configuration.c);
        int i2 = b;
        int i3 = ((i2 | 79) << 1) - (i2 ^ 79);
        a = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }
}
