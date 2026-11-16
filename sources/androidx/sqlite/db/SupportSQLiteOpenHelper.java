package androidx.sqlite.db;

import android.content.Context;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public interface SupportSQLiteOpenHelper {

    public static class Configuration {
        public final Context a;
        public final String b;
        public final OooO00o c;

        public Configuration(Context context, String str, OooO00o oooO00o) {
            this.a = context;
            this.b = str;
            this.c = oooO00o;
        }
    }

    public static abstract class OooO00o {
        public final int a;

        public OooO00o(int i) {
            this.a = i;
        }

        public final void b(String str) {
            if (str.equalsIgnoreCase(SQLiteDatabase.MEMORY) || str.trim().length() == 0) {
                return;
            }
            try {
                android.database.sqlite.SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }

        public abstract void c(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void d(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void e(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);
    }

    public interface OooO0O0 {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    String getDatabaseName();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
