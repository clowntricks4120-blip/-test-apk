package ivas.gov.bisp.enumeration.p066cl;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import ivas.gov.bisp.enumeration.J.aB;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements SupportSQLiteOpenHelper {
    private static int a = 0;
    private static int b = 1;
    public final bBa c;

    public c(Context context, String str, SupportSQLiteOpenHelper.OooO00o oooO00o) {
        this.c = new bBa(context, str, new j[1], oooO00o);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        int i = 2 % 2;
        int i2 = b + 23;
        a = i2 % 128;
        int i3 = i2 % 2;
        String databaseName = this.c.getDatabaseName();
        int i4 = a + 5;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return databaseName;
        }
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = (((i2 | 119) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        SupportSQLiteDatabase supportSQLiteDatabaseE = this.c.e();
        int i6 = b + 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return supportSQLiteDatabaseE;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = (i3 - (~(-(-((i2 ^ 3) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.setWriteAheadLoggingEnabled(z);
        int i6 = a;
        int i7 = ((i6 ^ 83) | (i6 & 83)) << 1;
        int i8 = -(((~i6) & 83) | (i6 & (-84)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public static class bBa extends SQLiteOpenHelper {
        private static int a = 0;
        private static int b = 1;
        public final j[] c;
        public final SupportSQLiteOpenHelper.OooO00o d;
        public boolean e;

        public class bBb implements DatabaseErrorHandler {
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ SupportSQLiteOpenHelper.OooO00o c;
            public final /* synthetic */ j[] d;

            public bBb(SupportSQLiteOpenHelper.OooO00o oooO00o, j[] jVarArr) {
                this.c = oooO00o;
                this.d = jVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                j jVarC;
                int i = 2 % 2;
                int i2 = b;
                int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
                int i4 = i3 % 128;
                a = i4;
                int i5 = i3 % 2;
                SupportSQLiteOpenHelper.OooO00o oooO00o = this.c;
                j[] jVarArr = this.d;
                int i6 = i4 + 119;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    jVarC = bBa.c(jVarArr, sQLiteDatabase);
                    Objects.requireNonNull(oooO00o);
                    int i7 = 77 / 0;
                } else {
                    jVarC = bBa.c(jVarArr, sQLiteDatabase);
                    Objects.requireNonNull(oooO00o);
                }
                StringBuilder sb = new StringBuilder();
                int i8 = a + 120;
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                b = i9 % 128;
                List<Pair<String, String>> listC = null;
                if (i9 % 2 == 0) {
                    sb.append("Corruption reported by sqlite on database: ");
                    sb.append(jVarC.d());
                    throw null;
                }
                sb.append("Corruption reported by sqlite on database: ");
                sb.append(jVarC.d());
                int i10 = (-2) - ((a + 8) ^ (-1));
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    Log.e("SupportSQLite", sb.toString());
                    int i11 = 13 / 0;
                } else {
                    Log.e("SupportSQLite", sb.toString());
                }
                if (!jVarC.isOpen()) {
                    int i12 = a;
                    int i13 = (((i12 & (-26)) | ((~i12) & 25)) - (~(-(-((i12 & 25) << 1))))) - 1;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    oooO00o.b(jVarC.d());
                    int i15 = b;
                    int i16 = (i15 & (-44)) | ((~i15) & 43);
                    int i17 = -(-((i15 & 43) << 1));
                    int i18 = (i16 & i17) + (i17 | i16);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    return;
                }
                try {
                    try {
                        listC = jVarC.c();
                        int i20 = a;
                        int i21 = i20 & 7;
                        int i22 = -(-((i20 ^ 7) | i21));
                        int i23 = (i21 & i22) + (i22 | i21);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                    } catch (Throwable th) {
                        if (listC != null) {
                            int i25 = a;
                            int i26 = i25 ^ 95;
                            int i27 = (i25 & 95) << 1;
                            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            Iterator<Pair<String, String>> it = listC.iterator();
                            int i30 = a;
                            int i31 = ((i30 ^ 122) + ((i30 & 122) << 1)) - 1;
                            b = i31 % 128;
                            int i32 = i31 % 2;
                            while (it.hasNext()) {
                                int i33 = a;
                                int i34 = i33 & 3;
                                int i35 = ((((i33 ^ 3) | i34) << 1) - (~(-((i33 | 3) & (~i34))))) - 1;
                                b = i35 % 128;
                                int i36 = i35 % 2;
                                Object obj = it.next().second;
                                int i37 = b;
                                int i38 = (i37 ^ 83) + ((i37 & 83) << 1);
                                a = i38 % 128;
                                if (i38 % 2 != 0) {
                                    oooO00o.b((String) obj);
                                    int i39 = 19 / 0;
                                } else {
                                    oooO00o.b((String) obj);
                                }
                            }
                        } else {
                            oooO00o.b(jVarC.d());
                            int i40 = b;
                            int i41 = i40 & 33;
                            int i42 = i40 | 33;
                            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                            a = i43 % 128;
                            int i44 = i43 % 2;
                        }
                        throw th;
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    jVarC.close();
                    int i45 = b;
                    int i46 = i45 & 9;
                    int i47 = (i45 ^ 9) | i46;
                    int i48 = (i46 & i47) + (i47 | i46);
                    a = i48 % 128;
                    int i49 = i48 % 2;
                } catch (IOException unused2) {
                }
                if (listC != null) {
                    int i50 = b + 71;
                    a = i50 % 128;
                    int i51 = i50 % 2;
                    int i52 = a;
                    int i53 = i52 ^ 25;
                    int i54 = ((i52 & 25) | i53) << 1;
                    int i55 = -i53;
                    int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
                    b = i56 % 128;
                    int i57 = i56 % 2;
                    for (Pair<String, String> pair : listC) {
                        int i58 = a;
                        int i59 = i58 & 39;
                        int i60 = ((i58 | 39) & (~i59)) + (i59 << 1);
                        b = i60 % 128;
                        int i61 = i60 % 2;
                        int i62 = a;
                        int i63 = (i62 ^ 85) + ((i62 & 85) << 1);
                        b = i63 % 128;
                        if (i63 % 2 == 0) {
                            oooO00o.b((String) pair.second);
                            int i64 = 96 / 0;
                        } else {
                            oooO00o.b((String) pair.second);
                        }
                        int i65 = b;
                        int i66 = (-2) - ((((i65 | 50) << 1) - (i65 ^ 50)) ^ (-1));
                        a = i66 % 128;
                        int i67 = i66 % 2;
                    }
                } else {
                    oooO00o.b(jVarC.d());
                    int i68 = a;
                    int i69 = ((i68 ^ 83) | (i68 & 83)) << 1;
                    int i70 = -(((~i68) & 83) | (i68 & (-84)));
                    int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                    b = i71 % 128;
                    int i72 = i71 % 2;
                }
                int i73 = a;
                int i74 = ((i73 | 107) << 1) - (i73 ^ 107);
                b = i74 % 128;
                int i75 = i74 % 2;
            }
        }

        public bBa(Context context, String str, j[] jVarArr, SupportSQLiteOpenHelper.OooO00o oooO00o) {
            super(context, str, null, oooO00o.a, new bBb(oooO00o, jVarArr));
            this.d = oooO00o;
            this.c = jVarArr;
        }

        public static j c(j[] jVarArr, SQLiteDatabase sQLiteDatabase) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 43;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 43)) & i3);
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            j jVar = jVarArr[0];
            if (jVar != null) {
                int i9 = i7 & 3;
                int i10 = (i9 - (~((i7 ^ 3) | i9))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                if (jVar.d == sQLiteDatabase) {
                    int i12 = b;
                    int i13 = ((i12 & (-6)) | ((~i12) & 5)) + ((i12 & 5) << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = i12 & 79;
                    int i16 = ((i12 ^ 79) | i15) << 1;
                    int i17 = -((i12 | 79) & (~i15));
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                } else {
                    int i20 = b + 61;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    jVarArr[0] = new j(sQLiteDatabase);
                    int i22 = a;
                    int i23 = (i22 ^ 89) + ((i22 & 89) << 1);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                }
            } else {
                jVarArr[0] = new j(sQLiteDatabase);
                int i25 = a;
                int i26 = (i25 ^ 89) + ((i25 & 89) << 1);
                b = i26 % 128;
                int i27 = i26 % 2;
            }
            j jVar2 = jVarArr[0];
            int i28 = a;
            int i29 = i28 & 47;
            int i30 = (i28 ^ 47) | i29;
            int i31 = (i29 & i30) + (i30 | i29);
            b = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 19 / 0;
            }
            return jVar2;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            synchronized (this) {
                super.close();
                this.c[0] = null;
            }
        }

        public j d(SQLiteDatabase sQLiteDatabase) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 91;
            int i4 = -(-(i2 | 91));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            j jVarC = c(this.c, sQLiteDatabase);
            int i7 = b;
            int i8 = i7 & 97;
            int i9 = ((i7 ^ 97) | i8) << 1;
            int i10 = -((i7 | 97) & (~i8));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return jVarC;
        }

        public SupportSQLiteDatabase e() {
            synchronized (this) {
                this.e = false;
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (!this.e) {
                    return d(writableDatabase);
                }
                close();
                return e();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            this.e = true;
            SupportSQLiteOpenHelper.OooO00o oooO00o = this.d;
            j[] jVarArr = this.c;
            int i8 = (i6 ^ 105) + ((i6 & 105) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            oooO00o.e(c(jVarArr, sQLiteDatabase), i, i2);
            int i10 = a;
            int i11 = i10 & 85;
            int i12 = (i11 - (~((i10 ^ 85) | i11))) - 1;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 89 / 0;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 87;
            int i4 = i3 + ((i2 ^ 87) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            SupportSQLiteOpenHelper.OooO00o oooO00o = this.d;
            c(this.c, sQLiteDatabase);
            int i6 = a;
            int i7 = i6 & 63;
            int i8 = (i7 - (~((i6 ^ 63) | i7))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            Objects.requireNonNull(oooO00o);
            if (i9 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i10 = b;
            int i11 = ((i10 | 87) << 1) - (i10 ^ 87);
            a = i11 % 128;
            int i12 = i11 % 2;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 25;
            int i4 = -(-((i2 ^ 25) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            SupportSQLiteOpenHelper.OooO00o oooO00o = this.d;
            j jVarC = c(this.c, sQLiteDatabase);
            int i7 = b;
            int i8 = ((i7 ^ 97) | (i7 & 97)) << 1;
            int i9 = -(((~i7) & 97) | (i7 & (-98)));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            oooO00o.c(jVarC);
            int i12 = a + 75;
            b = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 19;
            int i4 = (i2 | 19) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            if (!this.e) {
                int i9 = i7 & 57;
                int i10 = i9 + ((i7 ^ 57) | i9);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    c(this.c, sQLiteDatabase);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                SupportSQLiteOpenHelper.OooO00o oooO00o = this.d;
                j jVarC = c(this.c, sQLiteDatabase);
                int i11 = b;
                int i12 = ((i11 | 23) << 1) - (i11 ^ 23);
                a = i12 % 128;
                int i13 = i12 % 2;
                oooO00o.d(jVarC);
                int i14 = b;
                int i15 = ((i14 ^ 31) | (i14 & 31)) << 1;
                int i16 = -(((~i14) & 31) | (i14 & (-32)));
                int i17 = (i15 & i16) + (i16 | i15);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = a;
            int i20 = ((i19 | 54) << 1) - (i19 ^ 54);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 0 / 0;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 & 105;
            int i6 = (i4 ^ 105) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            this.e = true;
            SupportSQLiteOpenHelper.OooO00o oooO00o = this.d;
            j[] jVarArr = this.c;
            int i10 = i8 + 103;
            b = i10 % 128;
            int i11 = i10 % 2;
            ((aB) oooO00o).e(c(jVarArr, sQLiteDatabase), i, i2);
            int i12 = b;
            int i13 = i12 & 1;
            int i14 = ((i12 | 1) & (~i13)) + (i13 << 1);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 76 / 0;
            }
        }
    }
}
