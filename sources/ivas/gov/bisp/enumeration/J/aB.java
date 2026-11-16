package ivas.gov.bisp.enumeration.J;

import android.database.Cursor;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class aB extends SupportSQLiteOpenHelper.OooO00o {
    private static int b = 1;
    private static int c;
    public aA d;
    public final aZK e;

    public static abstract class aZK {
        public final int a;

        public aZK(int i) {
            this.a = i;
        }

        public abstract void c(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract aZL d(SupportSQLiteDatabase supportSQLiteDatabase);
    }

    public static class aZL {
        public final boolean a;
        public final String b;

        public aZL(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public aB(aA aAVar, aZK azk, String str, String str2) {
        super(azk.a);
        this.d = aAVar;
        this.e = azk;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public void d(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorQuery.moveToFirst() && cursorQuery.getInt(0) != 0;
            cursorQuery.close();
            if (z) {
                Cursor cursorQuery2 = supportSQLiteDatabase.query(new C0321u("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorQuery2.moveToFirst() ? cursorQuery2.getString(0) : null;
                    cursorQuery2.close();
                    if (!"013795561403b9c291261d6b161cd4f4".equals(string) && !"600c2511c6b9e8b9a34ff39db560ae70".equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    cursorQuery2.close();
                    throw th;
                }
            } else {
                aZL azlD = this.e.d(supportSQLiteDatabase);
                if (!azlD.a) {
                    StringBuilder sbW = j.w("Pre-packaged database has an invalid schema: ");
                    sbW.append(azlD.b);
                    throw new IllegalStateException(sbW.toString());
                }
                Objects.requireNonNull(this.e);
                f(supportSQLiteDatabase);
            }
            AppDatabase_Impl.OooO00o oooO00o = (AppDatabase_Impl.OooO00o) this.e;
            AppDatabase_Impl.this.d = supportSQLiteDatabase;
            aF aFVar = AppDatabase_Impl.this.g;
            synchronized (aFVar) {
                if (aFVar.i) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                } else {
                    supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
                    supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
                    supportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                    aFVar.f(supportSQLiteDatabase);
                    aFVar.k = supportSQLiteDatabase.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                    aFVar.i = true;
                }
            }
            List<aI.baa> list = AppDatabase_Impl.this.j;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i = ((i ^ 2) + ((i & 2) << 1)) - 1) {
                    Objects.requireNonNull(AppDatabase_Impl.this.j.get(i));
                }
            }
            this.d = null;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public final void f(SupportSQLiteDatabase supportSQLiteDatabase) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = ((i2 ^ 119) | i3) << 1;
        int i5 = -((i2 | 119) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        c = i6 % 128;
        int i7 = i6 % 2;
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        int i8 = c;
        int i9 = (i8 & (-114)) | ((~i8) & 113);
        int i10 = -(-((i8 & 113) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '013795561403b9c291261d6b161cd4f4')");
        } else {
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '013795561403b9c291261d6b161cd4f4')");
            int i12 = 74 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x037f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0394  */
    /* JADX WARN: Code duplicated, block: B:108:0x039b  */
    /* JADX WARN: Code duplicated, block: B:113:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:115:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:120:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:14:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:157:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:159:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0298 A[EDGE_INSN: B:169:0x0298->B:75:0x0298 BREAK  A[LOOP:1: B:161:0x0269->B:74:0x0286], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x007b  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:32:0x0104  */
    /* JADX WARN: Code duplicated, block: B:36:0x011f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0155  */
    /* JADX WARN: Code duplicated, block: B:43:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0179  */
    /* JADX WARN: Code duplicated, block: B:46:0x0185  */
    /* JADX WARN: Code duplicated, block: B:49:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f7 A[LOOP:4: B:18:0x0095->B:60:0x01f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x021e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0249  */
    /* JADX WARN: Code duplicated, block: B:67:0x0252  */
    /* JADX WARN: Code duplicated, block: B:72:0x0270  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b6 A[LOOP:2: B:77:0x02b6->B:176:0x02b6, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:79:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0314  */
    /* JADX WARN: Code duplicated, block: B:94:0x0345 A[LOOP:3: B:92:0x033f->B:94:0x0345, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0366  */
    /* JADX WARN: Code duplicated, block: B:99:0x0379  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r6
  0x0029: PHI (r6v3 ivas.gov.bisp.enumeration.J.aA) = (r6v2 ivas.gov.bisp.enumeration.J.aA), (r6v97 ivas.gov.bisp.enumeration.J.aA) binds: [B:8:0x0027, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03d9, code lost:
    
        if (r5 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03e0, code lost:
    
        if (r6.c(r20, r21) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03e2, code lost:
    
        r2 = ivas.gov.bisp.enumeration.J.aB.b;
        r5 = r2 & 113;
        r3 = ((r2 ^ 113) | r5) << 1;
        r2 = -((r2 | 113) & (~r5));
        r5 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.J.aB.c = r5 % 128;
        r5 = r5 % 2;
        r2 = (ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o) r18.e;
        java.util.Objects.requireNonNull(r2);
        r19.execSQL("DROP TABLE IF EXISTS `user`");
        r19.execSQL("DROP TABLE IF EXISTS `survey`");
        r3 = ivas.gov.bisp.enumeration.J.aB.c;
        r5 = (r3 ^ 3) + ((r3 & 3) << 1);
        ivas.gov.bisp.enumeration.J.aB.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x041e, code lost:
    
        if ((r5 % 2) != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0420, code lost:
    
        r19.execSQL("DROP TABLE IF EXISTS `app_details`");
        r19.execSQL("DROP TABLE IF EXISTS `locality`");
        r19.execSQL("DROP TABLE IF EXISTS `question_options`");
        r3 = 53 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x042e, code lost:
    
        r19.execSQL("DROP TABLE IF EXISTS `app_details`");
        r19.execSQL("DROP TABLE IF EXISTS `locality`");
        r19.execSQL("DROP TABLE IF EXISTS `question_options`");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0437, code lost:
    
        r19.execSQL("DROP TABLE IF EXISTS `not_at_home`");
        r19.execSQL("DROP TABLE IF EXISTS `survey_count`");
        r19.execSQL("DROP TABLE IF EXISTS `sync`");
        r3 = ivas.gov.bisp.enumeration.J.aB.b;
        r5 = r3 & 45;
        r3 = r3 | 45;
        r6 = ((r5 | r3) << 1) - (r3 ^ r5);
        ivas.gov.bisp.enumeration.J.aB.c = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x045a, code lost:
    
        if ((r6 % 2) != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x045c, code lost:
    
        r19.execSQL("DROP TABLE IF EXISTS `decryptedSurvey`");
        r19.execSQL("DROP TABLE IF EXISTS `login_details`");
        r19.execSQL("DROP TABLE IF EXISTS `province`");
        r19.execSQL("DROP TABLE IF EXISTS `district`");
        r19.execSQL("DROP TABLE IF EXISTS `tehsil`");
        r19.execSQL("DROP TABLE IF EXISTS `uc`");
        r19.execSQL("DROP TABLE IF EXISTS `villages`");
        r3 = ivas.gov.bisp.enumeration.J.aB.c;
        r5 = ((r3 ^ 33) | (r3 & 33)) << 1;
        r3 = -(((~r3) & 33) | (r3 & (-34)));
        r6 = (r5 & r3) + (r3 | r5);
        ivas.gov.bisp.enumeration.J.aB.b = r6 % 128;
        r6 = r6 % 2;
        r19.execSQL("DROP TABLE IF EXISTS `offlinesurvey`");
        r19.execSQL("DROP TABLE IF EXISTS `offline_survey_count`");
        r19.execSQL("DROP TABLE IF EXISTS `lib_mobile`");
        r3 = ivas.gov.bisp.enumeration.J.aB.b;
        r5 = r3 & 23;
        r3 = (r3 ^ 23) | r5;
        r6 = ((r5 | r3) << 1) - (r3 ^ r5);
        ivas.gov.bisp.enumeration.J.aB.c = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04b6, code lost:
    
        if ((r6 % 2) != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04b8, code lost:
    
        r19.execSQL("DROP TABLE IF EXISTS `beneficiary`");
        r19.execSQL("DROP TABLE IF EXISTS `nadraFamilyData`");
        r19.execSQL("DROP TABLE IF EXISTS `tablet_log_data`");
        r19.execSQL("DROP TABLE IF EXISTS `individualNadraDataWithRelation`");
        r3 = ivas.gov.bisp.enumeration.J.aB.b + 9;
        ivas.gov.bisp.enumeration.J.aB.c = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04d3, code lost:
    
        if ((r3 % 2) == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04d5, code lost:
    
        r3 = r2.d.j;
        r6 = 0;
        r5 = 65 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04dd, code lost:
    
        if (r3 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04e0, code lost:
    
        r6 = 0;
        r3 = r2.d.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04e5, code lost:
    
        if (r3 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04e7, code lost:
    
        r3 = r3.size();
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04ec, code lost:
    
        if (r10 >= r3) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04ee, code lost:
    
        r5 = ivas.gov.bisp.enumeration.J.aB.b;
        r6 = ((r5 | 51) << 1) - (r5 ^ 51);
        ivas.gov.bisp.enumeration.J.aB.c = r6 % 128;
        r6 = r6 % 2;
        r5 = r2.d.j.get(r10);
        r6 = (-2) - ((ivas.gov.bisp.enumeration.J.aB.c + 50) ^ (-1));
        ivas.gov.bisp.enumeration.J.aB.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0510, code lost:
    
        if ((r6 % 2) != 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0512, code lost:
    
        java.util.Objects.requireNonNull(r5);
        r5 = ((r10 & 41) + (r10 | 41)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x051f, code lost:
    
        java.util.Objects.requireNonNull(r5);
        r6 = r10 & 1;
        r5 = (((r10 ^ 1) | r6) << 1) - ((~r6) & (r10 | 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x052f, code lost:
    
        r10 = r5;
        r5 = ivas.gov.bisp.enumeration.J.aB.c;
        r6 = r5 & 95;
        r5 = (r5 | 95) & (~r6);
        r6 = r6 << 1;
        r7 = (r5 ^ r6) + ((r5 & r6) << 1);
        ivas.gov.bisp.enumeration.J.aB.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0543, code lost:
    
        if ((r7 % 2) != 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0545, code lost:
    
        r8 = 3 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x054b, code lost:
    
        r18.e.c(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0550, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0551, code lost:
    
        r19.execSQL("DROP TABLE IF EXISTS `beneficiary`");
        r19.execSQL("DROP TABLE IF EXISTS `nadraFamilyData`");
        r19.execSQL("DROP TABLE IF EXISTS `tablet_log_data`");
        r19.execSQL("DROP TABLE IF EXISTS `individualNadraDataWithRelation`");
        r2 = null;
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0567, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0568, code lost:
    
        r2 = null;
        r19.execSQL("DROP TABLE IF EXISTS `decryptedSurvey`");
        r19.execSQL("DROP TABLE IF EXISTS `login_details`");
        r19.execSQL("DROP TABLE IF EXISTS `province`");
        r19.execSQL("DROP TABLE IF EXISTS `district`");
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x057c, code lost:
    
        throw null;
     */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(androidx.sqlite.db.SupportSQLiteDatabase r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.J.aB.e(androidx.sqlite.db.SupportSQLiteDatabase, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0057  */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public void c(SupportSQLiteDatabase supportSQLiteDatabase) {
        boolean z;
        int size;
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 | 17) << 1;
        int i4 = -(((~i2) & 17) | (i2 & (-18)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        try {
            if (i5 % 2 == 0) {
                supportSQLiteDatabase.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'").moveToFirst();
                obj.hashCode();
                throw null;
            }
            Cursor cursorQuery = supportSQLiteDatabase.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            int i6 = 0;
            if (cursorQuery.moveToFirst()) {
                int i7 = c;
                int i8 = (i7 ^ 39) + ((i7 & 39) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                if (cursorQuery.getInt(0) == 0) {
                    int i10 = c + 15;
                    int i11 = i10 % 128;
                    b = i11;
                    int i12 = i10 % 2;
                    int i13 = i11 & 95;
                    int i14 = (i11 ^ 95) | i13;
                    int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                    c = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    int i17 = c;
                    int i18 = (i17 ^ 115) + ((i17 & 115) << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    z = false;
                }
            } else {
                int i110 = c;
                int i111 = (i110 ^ 115) + ((i110 & 115) << 1);
                b = i111 % 128;
                int i112 = i111 % 2;
                z = false;
            }
            cursorQuery.close();
            this.e.c(supportSQLiteDatabase);
            int i20 = c;
            int i21 = i20 + 23;
            b = i21 % 128;
            int i22 = i21 % 2;
            if (!z) {
                int i23 = (i20 & 83) + (i20 | 83);
                b = i23 % 128;
                int i24 = i23 % 2;
                aZL azlD = this.e.d(supportSQLiteDatabase);
                if (!azlD.a) {
                    int i25 = c;
                    int i26 = ((i25 | 67) << 1) - (i25 ^ 67);
                    b = i26 % 128;
                    if (i26 % 2 == 0) {
                        j.w("Pre-packaged database has an invalid schema: ").append(azlD.b);
                        throw null;
                    }
                    StringBuilder sbW = j.w("Pre-packaged database has an invalid schema: ");
                    sbW.append(azlD.b);
                    throw new IllegalStateException(sbW.toString());
                }
            }
            f(supportSQLiteDatabase);
            AppDatabase_Impl.OooO00o oooO00o = (AppDatabase_Impl.OooO00o) this.e;
            AppDatabase_Impl appDatabase_Impl = AppDatabase_Impl.this;
            int i27 = c;
            int i28 = i27 ^ 117;
            int i29 = -(-((i27 & 117) << 1));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            b = i30 % 128;
            int i31 = i30 % 2;
            List<aI.baa> list = appDatabase_Impl.j;
            if (list != null) {
                int i32 = b;
                int i33 = i32 & 71;
                int i34 = ((((i32 ^ 71) | i33) << 1) - (~(-((i32 | 71) & (~i33))))) - 1;
                c = i34 % 128;
                if (i34 % 2 != 0) {
                    size = list.size();
                    i6 = 1;
                } else {
                    size = list.size();
                }
                int i35 = b;
                int i36 = i35 & 111;
                int i37 = -(-((i35 ^ 111) | i36));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                c = i38 % 128;
                int i39 = i38 % 2;
                while (i6 < size) {
                    int i40 = b;
                    int i41 = (i40 | 63) << 1;
                    int i42 = -(((~i40) & 63) | (i40 & (-64)));
                    int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                    c = i43 % 128;
                    if (i43 % 2 != 0) {
                        AppDatabase_Impl.this.j.get(i6);
                        obj.hashCode();
                        throw null;
                    }
                    Objects.requireNonNull(AppDatabase_Impl.this.j.get(i6));
                    int i44 = i6 & (-76);
                    int i45 = (i6 | (-76)) & (~i44);
                    int i46 = i44 << 1;
                    int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                    i6 = (((i47 & (-78)) | ((~i47) & 77)) - (~((i47 & 77) << 1))) - 1;
                    int i48 = b;
                    int i49 = (i48 ^ 56) + ((i48 & 56) << 1);
                    int i50 = (i49 ^ (-1)) + (i49 << 1);
                    c = i50 % 128;
                    int i51 = i50 % 2;
                }
            }
            int i52 = b;
            int i53 = ((i52 & 110) + (i52 | 110)) - 1;
            c = i53 % 128;
            int i54 = i53 % 2;
        } catch (Throwable th) {
            "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'".close();
            throw th;
        }
    }
}
