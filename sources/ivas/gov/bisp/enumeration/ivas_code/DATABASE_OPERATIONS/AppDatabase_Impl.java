package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS;

import androidx.sqlite.db.SupportSQLiteDatabase;
import ivas.gov.bisp.enumeration.J.aB;
import ivas.gov.bisp.enumeration.J.aF;
import ivas.gov.bisp.enumeration.bE.S;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private static int a = 1;
    private static int b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile h f96o;

    @Override // ivas.gov.bisp.enumeration.J.aI
    public final aF g() {
        char c;
        int i = 2 % 2;
        HashMap map = new HashMap(0);
        HashMap map2 = new HashMap(0);
        String[] strArr = new String[22];
        int i2 = a;
        int i3 = i2 ^ 77;
        int i4 = -(-((i2 & 77) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            strArr[0] = "user";
            strArr[1] = "survey";
            strArr[5] = "app_details";
            strArr[5] = "locality";
        } else {
            strArr[0] = "user";
            strArr[1] = "survey";
            strArr[2] = "app_details";
            strArr[3] = "locality";
        }
        strArr[4] = "question_options";
        strArr[5] = "not_at_home";
        strArr[6] = "survey_count";
        int i7 = (((i6 ^ 115) | (i6 & 115)) << 1) - ((i6 & (-116)) | ((~i6) & 115));
        a = i7 % 128;
        int i8 = i7 % 2;
        strArr[7] = "sync";
        strArr[8] = "decryptedSurvey";
        strArr[9] = "login_details";
        strArr[10] = "province";
        int i9 = i6 + 13;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            strArr[11] = "district";
            strArr[23] = "tehsil";
            strArr[70] = "uc";
            strArr[17] = "villages";
        } else {
            strArr[11] = "district";
            strArr[12] = "tehsil";
            strArr[13] = "uc";
            strArr[14] = "villages";
        }
        int i10 = i6 + 39;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            strArr[93] = "offlinesurvey";
            strArr[76] = "offline_survey_count";
            strArr[117] = "lib_mobile";
            c = 'z';
        } else {
            strArr[15] = "offlinesurvey";
            strArr[16] = "offline_survey_count";
            strArr[17] = "lib_mobile";
            c = 18;
        }
        strArr[c] = "beneficiary";
        strArr[19] = "nadraFamilyData";
        strArr[20] = "tablet_log_data";
        strArr[21] = "individualNadraDataWithRelation";
        aF aFVar = new aF(this, map, map2, strArr);
        int i11 = a + 111;
        b = i11 % 128;
        int i12 = i11 % 2;
        return aFVar;
    }

    @Override // ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase
    public final h m() {
        h hVar;
        if (this.f96o != null) {
            return this.f96o;
        }
        synchronized (this) {
            if (this.f96o == null) {
                this.f96o = new S(this);
            }
            hVar = this.f96o;
        }
        return hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        throw new java.lang.IllegalArgumentException("Must set a non-null context to create the configuration.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        r4 = new androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration(r2, r3, r1);
        r1 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.a;
        r2 = r1 & 15;
        r1 = (r1 ^ 15) | r2;
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.b = r3 % 128;
        r3 = r3 % 2;
        r7 = r7.d.create(r4);
        r1 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.a;
        r2 = r1 & 67;
        r1 = -(-((r1 ^ 67) | r2));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        return r7;
     */
    @Override // ivas.gov.bisp.enumeration.J.aI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.sqlite.db.SupportSQLiteOpenHelper i(ivas.gov.bisp.enumeration.J.aA r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            ivas.gov.bisp.enumeration.J.aB r1 = new ivas.gov.bisp.enumeration.J.aB
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl$OooO00o r2 = new ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl$OooO00o
            r3 = 4
            r2.<init>(r3)
            java.lang.String r3 = "013795561403b9c291261d6b161cd4f4"
            java.lang.String r4 = "600c2511c6b9e8b9a34ff39db560ae70"
            r1.<init>(r7, r2, r3, r4)
            int r2 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.a
            int r2 = r2 + 113
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.b = r3
            int r2 = r2 % r0
            android.content.Context r2 = r7.e
            java.lang.String r3 = r7.f
            int r4 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.a
            int r4 = r4 + 7
            int r5 = r4 % 128
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.b = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L31
            r4 = 22
            int r4 = r4 / 0
            if (r2 == 0) goto L65
            goto L33
        L31:
            if (r2 == 0) goto L65
        L33:
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration r4 = new androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration
            r4.<init>(r2, r3, r1)
            int r1 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.a
            r2 = r1 & 15
            r1 = r1 ^ 15
            r1 = r1 | r2
            r3 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.b = r1
            int r3 = r3 % r0
            androidx.sqlite.db.SupportSQLiteOpenHelper$OooO0O0 r7 = r7.d
            androidx.sqlite.db.SupportSQLiteOpenHelper r7 = r7.create(r4)
            int r1 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.a
            r2 = r1 & 67
            r1 = r1 ^ 67
            r1 = r1 | r2
            int r1 = -r1
            int r1 = -r1
            r3 = r2 | r1
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.b = r1
            int r3 = r3 % r0
            return r7
        L65:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must set a non-null context to create the configuration."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.i(ivas.gov.bisp.enumeration.J.aA):androidx.sqlite.db.SupportSQLiteOpenHelper");
    }

    public class OooO00o extends aB.aZK {
        private static int b = 1;
        private static int c;

        public OooO00o(int i) {
            super(i);
        }

        @Override // ivas.gov.bisp.enumeration.J.aB.aZK
        public void c(SupportSQLiteDatabase supportSQLiteDatabase) {
            int i = 2 % 2;
            int i2 = b + 27;
            c = i2 % 128;
            int i3 = i2 % 2;
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `user` (`id` TEXT NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `survey` (`id` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `app_details` (`id` TEXT NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
            int i4 = c;
            int i5 = (i4 ^ 79) + ((i4 & 79) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `locality` (`data` TEXT NOT NULL, PRIMARY KEY(`data`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `question_options` (`option_id` INTEGER NOT NULL, `question` TEXT, `option` TEXT, `sort_order` INTEGER NOT NULL, PRIMARY KEY(`option_id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `not_at_home` (`id` INTEGER NOT NULL, `data` TEXT, `count` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                int i6 = 63 / 0;
            } else {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `locality` (`data` TEXT NOT NULL, PRIMARY KEY(`data`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `question_options` (`option_id` INTEGER NOT NULL, `question` TEXT, `option` TEXT, `sort_order` INTEGER NOT NULL, PRIMARY KEY(`option_id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `not_at_home` (`id` INTEGER NOT NULL, `data` TEXT, `count` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            }
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `survey_count` (`id` INTEGER NOT NULL, `sync_count` INTEGER NOT NULL, `not_sync_count` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `sync` (`id` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `decryptedSurvey` (`id` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `login_details` (`id` INTEGER NOT NULL, `user_name` TEXT, `token` TEXT, `expire_session` TEXT, `fu` TEXT, `mu` TEXT, PRIMARY KEY(`id`))");
            int i7 = c;
            int i8 = ((i7 | 111) << 1) - (i7 ^ 111);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `province` (`id` TEXT, `province_id` INTEGER NOT NULL, `province_name` TEXT, PRIMARY KEY(`province_id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `district` (`id` TEXT, `distcode` INTEGER NOT NULL, `divcode` INTEGER NOT NULL, `provcode` INTEGER NOT NULL, `district` TEXT, PRIMARY KEY(`distcode`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `tehsil` (`id` TEXT, `tehsilcode` INTEGER NOT NULL, `distcode` INTEGER NOT NULL, `tehsil` TEXT, PRIMARY KEY(`tehsilcode`))");
                throw null;
            }
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `province` (`id` TEXT, `province_id` INTEGER NOT NULL, `province_name` TEXT, PRIMARY KEY(`province_id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `district` (`id` TEXT, `distcode` INTEGER NOT NULL, `divcode` INTEGER NOT NULL, `provcode` INTEGER NOT NULL, `district` TEXT, PRIMARY KEY(`distcode`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `tehsil` (`id` TEXT, `tehsilcode` INTEGER NOT NULL, `distcode` INTEGER NOT NULL, `tehsil` TEXT, PRIMARY KEY(`tehsilcode`))");
            int i9 = b;
            int i10 = (i9 & (-66)) | ((~i9) & 65);
            int i11 = -(-((i9 & 65) << 1));
            int i12 = (i10 & i11) + (i11 | i10);
            c = i12 % 128;
            if (i12 % 2 != 0) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `uc` (`tehsilcode` INTEGER NOT NULL, `uc` TEXT, `uccode` INTEGER NOT NULL, `ucno` INTEGER NOT NULL, PRIMARY KEY(`uccode`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `villages` (`uccode` INTEGER NOT NULL, `localitycode` INTEGER NOT NULL, `localitytype` TEXT, `locality` TEXT, PRIMARY KEY(`localitycode`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlinesurvey` (`id` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
                int i13 = 0 / 0;
            } else {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `uc` (`tehsilcode` INTEGER NOT NULL, `uc` TEXT, `uccode` INTEGER NOT NULL, `ucno` INTEGER NOT NULL, PRIMARY KEY(`uccode`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `villages` (`uccode` INTEGER NOT NULL, `localitycode` INTEGER NOT NULL, `localitytype` TEXT, `locality` TEXT, PRIMARY KEY(`localitycode`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlinesurvey` (`id` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
            }
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offline_survey_count` (`id` INTEGER NOT NULL, `sync_count` INTEGER NOT NULL, `not_sync_count` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `lib_mobile` (`prefix` TEXT NOT NULL, `provider` TEXT, `operator_code` INTEGER NOT NULL, `idate` TEXT, PRIMARY KEY(`prefix`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `beneficiary` (`cnic` TEXT NOT NULL, `english_name` TEXT, `urdu_name` TEXT, `marital_status` INTEGER NOT NULL, `gender` TEXT, `age` REAL NOT NULL, `dob` TEXT, PRIMARY KEY(`cnic`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `nadraFamilyData` (`cnic` TEXT NOT NULL, `urdu_name` TEXT, PRIMARY KEY(`cnic`))");
            int i14 = c + 25;
            b = i14 % 128;
            int i15 = i14 % 2;
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `tablet_log_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `tablet_log_json` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `individualNadraDataWithRelation` (`cnic` TEXT NOT NULL, `name` TEXT, `relation_with_self` TEXT, `father_name` TEXT, `father_nic` TEXT, `mother_name` TEXT, `mother_nic` TEXT, `spouse_name` TEXT, `spouse_nic` TEXT, PRIMARY KEY(`cnic`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            int i16 = b;
            int i17 = (i16 ^ 95) + ((i16 & 95) << 1);
            c = i17 % 128;
            int i18 = i17 % 2;
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '013795561403b9c291261d6b161cd4f4')");
            int i19 = (-2) - ((b + 16) ^ (-1));
            c = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0a0e, code lost:
        
            if (r9.equals(r4) != false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0a10, code lost:
        
            r0 = new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("lib_mobile(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.lib_mobile).\n Expected:\n", r9, "\n Found:\n", r4));
            r2 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c;
            r4 = r2 & 63;
            r3 = ((r2 ^ 63) | r4) << 1;
            r2 = -((r2 | 63) & (~r4));
            r4 = (r3 & r2) + (r2 | r3);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0a31, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0a32, code lost:
        
            r4 = new java.util.HashMap(7);
            r4.put("cnic", new ivas.gov.bisp.enumeration.at.au.bae("cnic", "TEXT", true, 1, null, 1));
            r4.put("english_name", new ivas.gov.bisp.enumeration.at.au.bae("english_name", "TEXT", false, 0, null, 1));
            r4.put("urdu_name", new ivas.gov.bisp.enumeration.at.au.bae("urdu_name", "TEXT", false, 0, null, 1));
            r4.put("marital_status", new ivas.gov.bisp.enumeration.at.au.bae("marital_status", "INTEGER", true, 0, null, 1));
            r4.put("gender", new ivas.gov.bisp.enumeration.at.au.bae("gender", "TEXT", false, 0, null, 1));
            r4.put("age", new ivas.gov.bisp.enumeration.at.au.bae("age", "REAL", true, 0, null, 1));
            r10 = new ivas.gov.bisp.enumeration.p020at.au("beneficiary", r4, ivas.gov.bisp.enumeration.bD.T.d(r4, "dob", new ivas.gov.bisp.enumeration.at.au.bae("dob", "TEXT", false, 0, null, 1), 0), new java.util.HashSet(0));
            r4 = ivas.gov.bisp.enumeration.p020at.au.c(r32, "beneficiary");
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0af1, code lost:
        
            if (r10.equals(r4) != false) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0af3, code lost:
        
            r0 = new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("beneficiary(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.BeneficiaryEntity).\n Expected:\n", r10, "\n Found:\n", r4));
            r2 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b + 9;
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x0b07, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0b08, code lost:
        
            r4 = new java.util.HashMap(2);
            r4.put("cnic", new ivas.gov.bisp.enumeration.at.au.bae("cnic", "TEXT", true, 1, null, 1));
            r10 = new ivas.gov.bisp.enumeration.p020at.au("nadraFamilyData", r4, ivas.gov.bisp.enumeration.bD.T.d(r4, "urdu_name", new ivas.gov.bisp.enumeration.at.au.bae("urdu_name", "TEXT", false, 0, null, 1), 0), new java.util.HashSet(0));
            r4 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r4 = (-2) - (((r4 & 30) + (r4 | 30)) ^ (-1));
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0b57, code lost:
        
            if ((r4 % 2) != 0) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0b59, code lost:
        
            r4 = ivas.gov.bisp.enumeration.p020at.au.c(r32, "nadraFamilyData");
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0b61, code lost:
        
            if (r10.equals(r4) != false) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x0b63, code lost:
        
            r0 = new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("nadraFamilyData(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.NadraFamilyData).\n Expected:\n", r10, "\n Found:\n", r4));
            r2 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c;
            r3 = (r2 & (-88)) | ((~r2) & 87);
            r2 = (r2 & 87) << 1;
            r4 = ((r3 | r2) << 1) - (r2 ^ r3);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0b83, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0b84, code lost:
        
            r4 = new java.util.HashMap(2);
            r4.put("id", new ivas.gov.bisp.enumeration.at.au.bae("id", "INTEGER", true, 1, null, 1));
            r9 = new ivas.gov.bisp.enumeration.p020at.au("tablet_log_data", r4, ivas.gov.bisp.enumeration.bD.T.d(r4, "tablet_log_json", new ivas.gov.bisp.enumeration.at.au.bae("tablet_log_json", "TEXT", false, 0, null, 1), 0), new java.util.HashSet(0));
            r3 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r4 = (r3 ^ 95) + ((r3 & 95) << 1);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r4 % 128;
            r4 = r4 % 2;
            r3 = ivas.gov.bisp.enumeration.p020at.au.c(r32, "tablet_log_data");
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x0bda, code lost:
        
            if (r9.equals(r3) != false) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x0be7, code lost:
        
            return new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("tablet_log_data(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.TabletLogEntity).\n Expected:\n", r9, "\n Found:\n", r3));
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0be8, code lost:
        
            r3 = new java.util.HashMap(9);
            r3.put("cnic", new ivas.gov.bisp.enumeration.at.au.bae("cnic", "TEXT", true, 1, null, 1));
            r3.put("name", new ivas.gov.bisp.enumeration.at.au.bae("name", "TEXT", false, 0, null, 1));
            r3.put("relation_with_self", new ivas.gov.bisp.enumeration.at.au.bae("relation_with_self", "TEXT", false, 0, null, 1));
            r3.put("father_name", new ivas.gov.bisp.enumeration.at.au.bae("father_name", "TEXT", false, 0, null, 1));
            r3.put("father_nic", new ivas.gov.bisp.enumeration.at.au.bae("father_nic", "TEXT", false, 0, null, 1));
            r3.put("mother_name", new ivas.gov.bisp.enumeration.at.au.bae("mother_name", "TEXT", false, 0, null, 1));
            r3.put("mother_nic", new ivas.gov.bisp.enumeration.at.au.bae("mother_nic", "TEXT", false, 0, null, 1));
            r3.put("spouse_name", new ivas.gov.bisp.enumeration.at.au.bae("spouse_name", "TEXT", false, 0, null, 1));
            r8 = new ivas.gov.bisp.enumeration.p020at.au("individualNadraDataWithRelation", r3, ivas.gov.bisp.enumeration.bD.T.d(r3, "spouse_nic", new ivas.gov.bisp.enumeration.at.au.bae("spouse_nic", "TEXT", false, 0, null, 1), 0), new java.util.HashSet(0));
            r3 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r4 = r3 & 123;
            r3 = -(-((r3 ^ 123) | r4));
            r5 = (r4 ^ r3) + ((r3 & r4) << 1);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x0cc7, code lost:
        
            if ((r5 % 2) != 0) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x0cc9, code lost:
        
            r0 = ivas.gov.bisp.enumeration.p020at.au.c(r32, "individualNadraDataWithRelation");
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x0cd1, code lost:
        
            if (r8.equals(r0) != false) goto L123;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0cd3, code lost:
        
            r2 = new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("individualNadraDataWithRelation(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.IndividualNadraDataWithRelation).\n Expected:\n", r8, "\n Found:\n", r0));
            r0 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b + 22;
            r3 = (r0 ^ (-1)) + (r0 << 1);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0ceb, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0cec, code lost:
        
            r0 = new ivas.gov.bisp.enumeration.J.aB.aZL(true, null);
            r3 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c;
            r4 = r3 & 65;
            r3 = ((r3 | 65) & (~r4)) + (r4 << 1);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x0d00, code lost:
        
            if ((r3 % 2) == 0) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x0d02, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0d03, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x0d04, code lost:
        
            r8.equals(ivas.gov.bisp.enumeration.p020at.au.c(r32, "individualNadraDataWithRelation"));
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0d0b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x0d0c, code lost:
        
            r10.equals(ivas.gov.bisp.enumeration.p020at.au.c(r32, "nadraFamilyData"));
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x0d13, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x06f8, code lost:
        
            if (r15.equals(r4) == false) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0703, code lost:
        
            if (r15.equals(r4) == false) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0705, code lost:
        
            r0 = new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("tehsil(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.tehsil).\n Expected:\n", r15, "\n Found:\n", r4));
            r2 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c;
            r3 = (r2 & (-68)) | ((~r2) & 67);
            r2 = -(-((r2 & 67) << 1));
            r4 = ((r3 | r2) << 1) - (r2 ^ r3);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0725, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0726, code lost:
        
            r4 = new java.util.HashMap(4);
            r4.put("tehsilcode", new ivas.gov.bisp.enumeration.at.au.bae("tehsilcode", "INTEGER", true, 0, null, 1));
            r4.put("uc", new ivas.gov.bisp.enumeration.at.au.bae("uc", "TEXT", false, 0, null, 1));
            r4.put("uccode", new ivas.gov.bisp.enumeration.at.au.bae("uccode", "INTEGER", true, 1, null, 1));
            r13 = new ivas.gov.bisp.enumeration.p020at.au("uc", r4, ivas.gov.bisp.enumeration.bD.T.d(r4, "ucno", new ivas.gov.bisp.enumeration.at.au.bae("ucno", "INTEGER", true, 0, null, 1), 0), new java.util.HashSet(0));
            r4 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r4 = (-2) - ((((r4 | 12) << 1) - (r4 ^ 12)) ^ (-1));
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r4 % 128;
            r4 = r4 % 2;
            r4 = ivas.gov.bisp.enumeration.p020at.au.c(r32, "uc");
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x07b0, code lost:
        
            if (r13.equals(r4) != false) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x07b2, code lost:
        
            r0 = new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("uc(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.uc).\n Expected:\n", r13, "\n Found:\n", r4));
            r2 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r3 = r2 & 25;
            r2 = (((r2 | 25) & (~r3)) - (~(-(-(r3 << 1))))) - 1;
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x07d0, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x07d1, code lost:
        
            r4 = new java.util.HashMap(4);
            r4.put("uccode", new ivas.gov.bisp.enumeration.at.au.bae("uccode", "INTEGER", true, 0, null, 1));
            r4.put("localitycode", new ivas.gov.bisp.enumeration.at.au.bae("localitycode", "INTEGER", true, 1, null, 1));
            r4.put("localitytype", new ivas.gov.bisp.enumeration.at.au.bae("localitytype", "TEXT", false, 0, null, 1));
            r11 = new ivas.gov.bisp.enumeration.p020at.au("villages", r4, ivas.gov.bisp.enumeration.bD.T.d(r4, "locality", new ivas.gov.bisp.enumeration.at.au.bae("locality", "TEXT", false, 0, null, 1), 0), new java.util.HashSet(0));
            r4 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r8 = r4 & 19;
            r4 = (r4 | 19) & (~r8);
            r8 = -(-(r8 << 1));
            r10 = ((r4 | r8) << 1) - (r4 ^ r8);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r10 % 128;
            r10 = r10 % 2;
            r4 = ivas.gov.bisp.enumeration.p020at.au.c(r32, "villages");
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0861, code lost:
        
            if (r11.equals(r4) != false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0863, code lost:
        
            r0 = new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("villages(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.vilages).\n Expected:\n", r11, "\n Found:\n", r4));
            r2 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r3 = ((r2 & (-48)) | ((~r2) & 47)) + ((r2 & 47) << 1);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x087f, code lost:
        
            if ((r3 % 2) == 0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0881, code lost:
        
            r1 = 69 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0884, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0885, code lost:
        
            r4 = new java.util.HashMap(2);
            r4.put("id", new ivas.gov.bisp.enumeration.at.au.bae("id", "INTEGER", true, 1, null, 1));
            r10 = new ivas.gov.bisp.enumeration.p020at.au("offlinesurvey", r4, ivas.gov.bisp.enumeration.bD.T.d(r4, "data", new ivas.gov.bisp.enumeration.at.au.bae("data", "TEXT", false, 0, null, 1), 0), new java.util.HashSet(0));
            r4 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c;
            r5 = ((r4 & 9) - (~(-(-(r4 | 9))))) - 1;
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b = r5 % 128;
            r5 = r5 % 2;
            r4 = ivas.gov.bisp.enumeration.p020at.au.c(r32, "offlinesurvey");
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x08dd, code lost:
        
            if (r10.equals(r4) != false) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x08df, code lost:
        
            r0 = new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("offlinesurvey(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offlinesurvey).\n Expected:\n", r10, "\n Found:\n", r4));
            r3 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r4 = (r3 & (-12)) | ((~r3) & 11);
            r3 = (r3 & 11) << 1;
            r5 = (r4 & r3) + (r3 | r4);
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x08fe, code lost:
        
            if ((r5 % 2) != 0) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0900, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0901, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0902, code lost:
        
            r4 = new java.util.HashMap(3);
            r4.put("id", new ivas.gov.bisp.enumeration.at.au.bae("id", "INTEGER", true, 1, null, 1));
            r4.put("sync_count", new ivas.gov.bisp.enumeration.at.au.bae("sync_count", "INTEGER", true, 0, null, 1));
            r9 = new ivas.gov.bisp.enumeration.p020at.au("offline_survey_count", r4, ivas.gov.bisp.enumeration.bD.T.d(r4, "not_sync_count", new ivas.gov.bisp.enumeration.at.au.bae("not_sync_count", "INTEGER", true, 0, null, 1), 0), new java.util.HashSet(0));
            r4 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b + 79;
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r4 % 128;
            r4 = r4 % 2;
            r4 = ivas.gov.bisp.enumeration.p020at.au.c(r32, "offline_survey_count");
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x096d, code lost:
        
            if (r9.equals(r4) != false) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x096f, code lost:
        
            r0 = new ivas.gov.bisp.enumeration.J.aB.aZL(false, ivas.gov.bisp.enumeration.bD.T.c("offline_survey_count(ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offline_survey_count).\n Expected:\n", r9, "\n Found:\n", r4));
            r2 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r3 = ((r2 & 88) + (r2 | 88)) - 1;
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0987, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0988, code lost:
        
            r4 = new java.util.HashMap(4);
            r4.put("prefix", new ivas.gov.bisp.enumeration.at.au.bae("prefix", "TEXT", true, 1, null, 1));
            r4.put("provider", new ivas.gov.bisp.enumeration.at.au.bae("provider", "TEXT", false, 0, null, 1));
            r4.put("operator_code", new ivas.gov.bisp.enumeration.at.au.bae("operator_code", "INTEGER", true, 0, null, 1));
            r9 = new ivas.gov.bisp.enumeration.p020at.au("lib_mobile", r4, ivas.gov.bisp.enumeration.bD.T.d(r4, "idate", new ivas.gov.bisp.enumeration.at.au.bae("idate", "TEXT", false, 0, null, 1), 0), new java.util.HashSet(0));
            r4 = ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.b;
            r5 = ((r4 & 66) + (r4 | 66)) - 1;
            ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.c = r5 % 128;
            r5 = r5 % 2;
            r4 = ivas.gov.bisp.enumeration.p020at.au.c(r32, "lib_mobile");
         */
        @Override // ivas.gov.bisp.enumeration.J.aB.aZK
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ivas.gov.bisp.enumeration.J.aB.aZL d(androidx.sqlite.db.SupportSQLiteDatabase r32) {
            /*
                Method dump skipped, instruction units count: 3380
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase_Impl.OooO00o.d(androidx.sqlite.db.SupportSQLiteDatabase):ivas.gov.bisp.enumeration.J.aB$aZL");
        }
    }
}
