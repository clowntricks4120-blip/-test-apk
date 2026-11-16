package ivas.gov.bisp.enumeration.bE;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteStatement;
import ivas.gov.bisp.enumeration.J.aC;
import ivas.gov.bisp.enumeration.J.aD;
import ivas.gov.bisp.enumeration.J.aG;
import ivas.gov.bisp.enumeration.J.aI;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.BeneficiaryEntity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.IndividualNadraDataWithRelation;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.NadraFamilyData;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.TabletLogEntity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.district;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.lib_mobile;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.locality;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.not_at_home;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offline_survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offlinesurvey;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.question_options;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.sync;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.tehsil;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.uc;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.vilages;
import ivas.gov.bisp.enumeration.p020at.aq;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class S extends h {
    private static int a = 0;
    private static int b = 1;
    public final aC A;
    public final aC B;
    public final aC C;
    public final aC D;
    public final aC E;
    public final aC F;
    public final aC G;
    public final aC H;
    public final aC I;
    public final aC J;
    public final aC K;
    public final aC L;
    public final aC M;
    public final aC N;
    public final aC O;
    public final aD d;
    public final aI e;
    public final aD f;
    public final aD g;
    public final aD h;
    public final aD i;
    public final aD j;
    public final aD k;
    public final aD l;
    public final aD m;
    public final aD n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final aD f70o;
    public final aD p;
    public final aD q;
    public final aD r;
    public final aD s;
    public final aD t;
    public final aC u;
    public final aC v;
    public final aD w;
    public final aC x;
    public final aC y;
    public final aC z;

    public class buA extends aC {
        private static int a = 1;
        private static int b;

        public buA(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 17;
            int i4 = i3 + ((i2 ^ 17) | i3);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return "delete  FROM sync";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class buB extends aC {
        private static int a = 0;
        private static int b = 1;

        public buB(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 99;
            int i4 = (i2 | 99) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return "delete from offlinesurvey where id=?";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class buC extends aC {
        private static int a = 1;
        private static int b;

        public buC(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - ((i2 + 50) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 & 123;
            int i6 = -(-((i2 ^ 123) | i5));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            return "update offline_survey_count set sync_count=?,not_sync_count=? where id=?";
        }
    }

    public class buE extends aD {
        private static int a = 0;
        private static int b = 1;

        public buE(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 20) + (i2 | 20);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return "INSERT OR IGNORE INTO `province` (`id`,`province_id`,`province_name`) VALUES (?,?,?)";
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
        
            if (r8 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
        
            if (r8 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
        
            r8 = ivas.gov.bisp.enumeration.bE.S.buE.b;
            r2 = (r8 ^ 25) + ((r8 & 25) << 1);
            ivas.gov.bisp.enumeration.bE.S.buE.a = r2 % 128;
            r2 = r2 % 2;
            r7.bindNull(3);
            r7 = ivas.gov.bisp.enumeration.bE.S.buE.a;
            r8 = r7 & 67;
            r8 = r8 + ((r7 ^ 67) | r8);
            ivas.gov.bisp.enumeration.bE.S.buE.b = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
        
            if ((r8 % 2) == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
        
            r7.bindString(3, r8);
            r7 = ivas.gov.bisp.enumeration.bE.S.buE.a;
            r8 = (r7 ^ 95) + ((r7 & 95) << 1);
            ivas.gov.bisp.enumeration.bE.S.buE.b = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
        
            return;
         */
        @Override // ivas.gov.bisp.enumeration.J.aD
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(androidx.sqlite.db.SupportSQLiteStatement r7, java.lang.Object r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.bE.S.buE.a
                r2 = r1 & 93
                r1 = r1 ^ 93
                r1 = r1 | r2
                r3 = r2 & r1
                r1 = r1 | r2
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.bE.S.buE.b = r1
                int r3 = r3 % r0
                ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province r8 = (ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province) r8
                java.lang.String r1 = r8.id
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L4b
                int r1 = ivas.gov.bisp.enumeration.bE.S.buE.b
                r4 = r1 | 47
                int r5 = r4 << 1
                r1 = r1 & 47
                int r1 = ~r1
                r1 = r1 & r4
                int r1 = -r1
                r4 = r5 | r1
                int r4 = r4 << r3
                r1 = r1 ^ r5
                int r4 = r4 - r1
                int r1 = r4 % 128
                ivas.gov.bisp.enumeration.bE.S.buE.a = r1
                int r4 = r4 % r0
                if (r4 == 0) goto L36
                r7.bindNull(r2)
                goto L39
            L36:
                r7.bindNull(r3)
            L39:
                int r1 = ivas.gov.bisp.enumeration.bE.S.buE.a
                r4 = r1 ^ 101(0x65, float:1.42E-43)
                r1 = r1 & 101(0x65, float:1.42E-43)
                int r1 = r1 << r3
                r5 = r4 ^ r1
                r1 = r1 & r4
                int r1 = r1 << r3
                int r5 = r5 + r1
                int r1 = r5 % 128
                ivas.gov.bisp.enumeration.bE.S.buE.b = r1
                int r5 = r5 % r0
                goto L5b
            L4b:
                r7.bindString(r3, r1)
                int r1 = ivas.gov.bisp.enumeration.bE.S.buE.a
                r4 = r1 | 113(0x71, float:1.58E-43)
                int r4 = r4 << r3
                r1 = r1 ^ 113(0x71, float:1.58E-43)
                int r4 = r4 - r1
                int r1 = r4 % 128
                ivas.gov.bisp.enumeration.bE.S.buE.b = r1
                int r4 = r4 % r0
            L5b:
                int r1 = r8.province_id
                long r4 = (long) r1
                r7.bindLong(r0, r4)
                int r1 = ivas.gov.bisp.enumeration.bE.S.buE.a
                r4 = r1 & 75
                r1 = r1 | 75
                int r1 = -r1
                int r1 = -r1
                r5 = r4 ^ r1
                r1 = r1 & r4
                int r1 = r1 << r3
                int r5 = r5 + r1
                int r1 = r5 % 128
                ivas.gov.bisp.enumeration.bE.S.buE.b = r1
                int r5 = r5 % r0
                r1 = 3
                if (r5 != 0) goto L7e
                java.lang.String r8 = r8.province_name
                r4 = 56
                int r4 = r4 / r2
                if (r8 != 0) goto La4
                goto L82
            L7e:
                java.lang.String r8 = r8.province_name
                if (r8 != 0) goto La4
            L82:
                int r8 = ivas.gov.bisp.enumeration.bE.S.buE.b
                r2 = r8 ^ 25
                r8 = r8 & 25
                int r8 = r8 << r3
                int r2 = r2 + r8
                int r8 = r2 % 128
                ivas.gov.bisp.enumeration.bE.S.buE.a = r8
                int r2 = r2 % r0
                r7.bindNull(r1)
                int r7 = ivas.gov.bisp.enumeration.bE.S.buE.a
                r8 = r7 & 67
                r7 = r7 ^ 67
                r7 = r7 | r8
                int r8 = r8 + r7
                int r7 = r8 % 128
                ivas.gov.bisp.enumeration.bE.S.buE.b = r7
                int r8 = r8 % r0
                if (r8 == 0) goto La2
                return
            La2:
                r7 = 0
                throw r7
            La4:
                r7.bindString(r1, r8)
                int r7 = ivas.gov.bisp.enumeration.bE.S.buE.a
                r8 = r7 ^ 95
                r7 = r7 & 95
                int r7 = r7 << r3
                int r8 = r8 + r7
                int r7 = r8 % 128
                ivas.gov.bisp.enumeration.bE.S.buE.b = r7
                int r8 = r8 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bE.S.buE.h(androidx.sqlite.db.SupportSQLiteStatement, java.lang.Object):void");
        }
    }

    public class buG extends aC {
        private static int a = 1;
        private static int b;

        public buG(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 73;
            int i4 = (i2 & 73) << 1;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = ((i2 & 95) - (~(i2 | 95))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return "update not_at_home set count=?,data=? where id=?";
        }
    }

    public class buH extends aC {
        private static int a = 1;
        private static int b;

        public buH(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 63) + (i2 | 63);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            int i6 = (-2) - ((((i4 | 60) << 1) - (i4 ^ 60)) ^ (-1));
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return "DELETE FROM nadraFamilyData";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class buI extends aC {
        private static int a = 0;
        private static int b = 1;

        public buI(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 5) << 1;
            int i4 = -(i2 ^ 5);
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return "update survey set data=? where id=?";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class buJ extends aC {
        private static int a = 0;
        private static int b = 1;

        public buJ(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a + 9;
            int i3 = i2 % 128;
            b = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 & 63;
            int i5 = (i3 ^ 63) | i4;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return "delete  FROM locality";
        }
    }

    public class buK extends aC {
        private static int a = 0;
        private static int b = 1;

        public buK(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 17) + (i2 | 17);
            int i4 = i3 % 128;
            a = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = ((i4 ^ 62) + ((i4 & 62) << 1)) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return "delete  FROM province";
            }
            throw null;
        }
    }

    public class buL extends aC {
        private static int a = 0;
        private static int b = 1;

        public buL(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 92) + ((i2 & 92) << 1)) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return "delete  FROM district";
            }
            throw null;
        }
    }

    public class buM extends aC {
        private static int a = 1;
        private static int b;

        public buM(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 60) + ((i2 & 60) << 1)) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = (i2 & 47) + (i2 | 47);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return "delete from not_at_home where id=?";
            }
            throw null;
        }
    }

    public class buN extends aC {
        private static int a = 1;
        private static int b;

        public buN(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - ((((i2 | 44) << 1) - (i2 ^ 44)) ^ (-1));
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            int i6 = ((i4 ^ 16) + ((i4 & 16) << 1)) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 13 / 0;
            }
            return "delete  FROM question_options";
        }
    }

    public class buO extends aC {
        private static int a = 0;
        private static int b = 1;

        public buO(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 103;
            int i4 = i2 | 103;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            int i8 = (i6 ^ 1) + ((i6 & 1) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            return "delete  FROM uc";
        }
    }

    public class buP extends aC {
        private static int a = 1;
        private static int b;

        public buP(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b + 89;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            int i5 = i3 & 121;
            int i6 = i5 + ((i3 ^ 121) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            return "delete  FROM villages";
        }
    }

    public class buQ extends aC {
        private static int a = 0;
        private static int b = 1;

        public buQ(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a + 11;
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            int i5 = (i3 & 83) + (i3 | 83);
            a = i5 % 128;
            int i6 = i5 % 2;
            return "DELETE FROM beneficiary";
        }
    }

    public class buR extends aC {
        private static int a = 1;
        private static int b;

        public buR(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 121) << 1) - (i2 ^ 121);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 29 / 0;
            }
            int i5 = i2 | 59;
            int i6 = (i5 << 1) - ((~(i2 & 59)) & i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            return "delete  FROM tehsil";
        }
    }

    public class buT extends aC {
        private static int a = 0;
        private static int b = 1;

        public buT(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            int i6 = ((i4 ^ 21) | (i4 & 21)) << 1;
            int i7 = -(((~i4) & 21) | (i4 & (-22)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            return "delete  FROM lib_mobile";
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$bun, reason: case insensitive filesystem */
    public class C0111bun extends aD {
        private static int a = 0;
        private static int b = 1;

        public C0111bun(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 47;
            int i4 = (i2 | 47) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return "INSERT OR IGNORE INTO `question_options` (`option_id`,`question`,`option`,`sort_order`) VALUES (?,?,?,?)";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            question_options question_optionsVar;
            int i;
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = i5 & 81;
            int i7 = -(-((i5 ^ 81) | i6));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                question_optionsVar = (question_options) obj;
                supportSQLiteStatement.bindLong(0, question_optionsVar.option_id);
            } else {
                question_optionsVar = (question_options) obj;
                supportSQLiteStatement.bindLong(1, question_optionsVar.option_id);
            }
            int i9 = a;
            int i10 = i9 & 1;
            int i11 = (i9 | 1) & (~i10);
            int i12 = i10 << 1;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            String str = question_optionsVar.question;
            if (str == null) {
                int i15 = a;
                int i16 = (i15 & (-126)) | ((~i15) & 125);
                int i17 = (i15 & 125) << 1;
                int i18 = (i16 & i17) + (i17 | i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                supportSQLiteStatement.bindNull(2);
                int i20 = b;
                int i21 = (i20 & (-76)) | ((~i20) & 75);
                int i22 = (i20 & 75) << 1;
                i = (i21 ^ i22) + ((i22 & i21) << 1);
                a = i % 128;
            } else {
                supportSQLiteStatement.bindString(2, str);
                int i23 = a;
                int i24 = i23 & 29;
                int i25 = (i23 ^ 29) | i24;
                i = (i24 & i25) + (i25 | i24);
                b = i % 128;
            }
            int i26 = i % 2;
            String str2 = question_optionsVar.option;
            if (str2 == null) {
                int i27 = a;
                int i28 = i27 & 49;
                int i29 = (((i27 | 49) & (~i28)) - (~(i28 << 1))) - 1;
                b = i29 % 128;
                int i30 = i29 % 2;
                supportSQLiteStatement.bindNull(3);
                int i31 = b;
                int i32 = i31 & 109;
                i2 = (((i31 ^ 109) | i32) << 1) - ((i31 | 109) & (~i32));
                i3 = i2 % 128;
            } else {
                supportSQLiteStatement.bindString(3, str2);
                int i33 = b;
                i2 = ((i33 & 110) + (i33 | 110)) - 1;
                i3 = i2 % 128;
            }
            a = i3;
            int i34 = i2 % 2;
            supportSQLiteStatement.bindLong(4, question_optionsVar.sort_order);
            int i35 = b + 109;
            a = i35 % 128;
            if (i35 % 2 != 0) {
                int i36 = 71 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$but, reason: case insensitive filesystem */
    public class C0117but extends aD {
        private static int a = 0;
        private static int b = 1;

        public C0117but(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 17;
            int i4 = (i3 - (~((i2 ^ 17) | i3))) - 1;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
            int i6 = (i2 & 51) + (i2 | 51);
            b = i6 % 128;
            int i7 = i6 % 2;
            return "INSERT OR IGNORE INTO `offline_survey_count` (`id`,`sync_count`,`not_sync_count`) VALUES (?,?,?)";
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            offline_survey_count offline_survey_countVar;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 25;
            int i4 = ((i2 & 25) | i3) << 1;
            int i5 = -i3;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                offline_survey_countVar = (offline_survey_count) obj;
                supportSQLiteStatement.bindLong(0, offline_survey_countVar.id);
            } else {
                offline_survey_countVar = (offline_survey_count) obj;
                supportSQLiteStatement.bindLong(1, offline_survey_countVar.id);
            }
            supportSQLiteStatement.bindLong(2, offline_survey_countVar.sync_count);
            int i7 = offline_survey_countVar.not_sync_count;
            int i8 = b;
            int i9 = (((i8 & (-106)) | ((~i8) & 105)) - (~(-(-((i8 & 105) << 1))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            supportSQLiteStatement.bindLong(3, i7);
            int i11 = b;
            int i12 = (i11 & 121) + (i11 | 121);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public class buv extends aC {
        private static int a = 1;
        private static int b;

        public buv(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 82) + (i2 | 82)) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                return "DELETE FROM individualNadraDataWithRelation";
            }
            int i4 = 98 / 0;
            return "DELETE FROM individualNadraDataWithRelation";
        }
    }

    public class buw extends aC {
        private static int a = 1;
        private static int b;

        public buw(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-84)) | ((~i2) & 83);
            int i4 = -(-((i2 & 83) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = (i6 & (-114)) | ((~i6) & 113);
            int i9 = (i6 & 113) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return "DELETE FROM tablet_log_data WHERE id = ?";
            }
            throw null;
        }
    }

    public class bux extends aC {
        private static int a = 1;
        private static int b;

        public bux(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & (-122)) | ((~i2) & 121)) + ((i2 & 121) << 1);
            int i4 = i3 % 128;
            b = i4;
            if (i3 % 2 != 0) {
                int i5 = 10 / 0;
            }
            int i6 = i4 + 55;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return "update survey_count set sync_count=?,not_sync_count=? where id=?";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class buy extends aC {
        private static int a = 1;
        private static int b;

        public buy(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                return "delete from survey where id=?";
            }
            int i4 = 50 / 0;
            return "delete from survey where id=?";
        }
    }

    public S(aI aIVar) {
        this.e = aIVar;
        this.f = new C0115bur(this, aIVar);
        this.h = new buu(this, aIVar);
        this.g = new buS(this, aIVar);
        this.i = new buz(this, aIVar);
        new AtomicBoolean(false);
        this.j = new buF(this, aIVar);
        new AtomicBoolean(false);
        this.d = new buD(this, aIVar);
        this.k = new buE(this, aIVar);
        this.l = new C0107buj(this, aIVar);
        this.m = new C0108buk(this, aIVar);
        this.f70o = new C0109bul(this, aIVar);
        this.n = new C0110bum(this, aIVar);
        this.p = new C0111bun(this, aIVar);
        this.q = new C0112buo(this, aIVar);
        new AtomicBoolean(false);
        this.s = new C0113bup(this, aIVar);
        this.r = new C0114buq(this, aIVar);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.t = new C0116bus(this, aIVar);
        this.w = new C0117but(this, aIVar);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.v = new buv(this, aIVar);
        this.x = new buw(this, aIVar);
        new AtomicBoolean(false);
        this.y = new buH(this, aIVar);
        this.u = new buQ(this, aIVar);
        this.A = new buI(this, aIVar);
        this.z = new buJ(this, aIVar);
        this.B = new buK(this, aIVar);
        this.D = new buL(this, aIVar);
        this.C = new buR(this, aIVar);
        this.E = new buO(this, aIVar);
        this.F = new buP(this, aIVar);
        this.H = new buN(this, aIVar);
        this.I = new buT(this, aIVar);
        this.J = new buM(this, aIVar);
        this.G = new buG(this, aIVar);
        this.K = new bux(this, aIVar);
        this.L = new buy(this, aIVar);
        this.N = new buA(this, aIVar);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.M = new buB(this, aIVar);
        this.O = new buC(this, aIVar);
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void E() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 1) + (i2 | 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.y.c();
        int i5 = a;
        int i6 = ((i5 ^ 114) + ((i5 & 114) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        this.e.f();
        try {
            supportSQLiteStatementC.executeUpdateDelete();
            int i8 = a;
            int i9 = i8 & 89;
            int i10 = i9 + ((i8 ^ 89) | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            this.e.c();
            aI aIVar = this.e;
            int i12 = b;
            int i13 = ((i12 ^ 61) | (i12 & 61)) << 1;
            int i14 = -(((~i12) & 61) | (i12 & (-62)));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            aIVar.h();
            aC aCVar = this.y;
            if (supportSQLiteStatementC == aCVar.e) {
                int i17 = b;
                int i18 = i17 & 43;
                int i19 = (i17 | 43) & (~i18);
                int i20 = i18 << 1;
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    aCVar.c.set(true);
                } else {
                    aCVar.c.set(false);
                }
            }
            int i22 = b;
            int i23 = ((i22 & 48) + (i22 | 48)) - 1;
            a = i23 % 128;
            if (i23 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            this.y.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void F() {
        int i = 2 % 2;
        int i2 = a + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.u.c();
        int i4 = a;
        int i5 = (i4 | 51) << 1;
        int i6 = -(((~i4) & 51) | (i4 & (-52)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        try {
            if (i7 % 2 == 0) {
                this.e.f();
                supportSQLiteStatementC.executeUpdateDelete();
                int i8 = 42 / 0;
            } else {
                this.e.f();
                supportSQLiteStatementC.executeUpdateDelete();
            }
            int i9 = a;
            int i10 = (-2) - (((i9 & 34) + (i9 | 34)) ^ (-1));
            b = i10 % 128;
            int i11 = i10 % 2;
            this.e.c();
            this.e.h();
            int i12 = b;
            int i13 = (((i12 | 106) << 1) - (i12 ^ 106)) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            aC aCVar = this.u;
            if (supportSQLiteStatementC == aCVar.e) {
                int i15 = a;
                int i16 = i15 & 25;
                int i17 = i15 | 25;
                int i18 = (i16 & i17) + (i17 | i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                aCVar.c.set(false);
                int i20 = b;
                int i21 = ((i20 & (-100)) | ((~i20) & 99)) + ((i20 & 99) << 1);
                a = i21 % 128;
                int i22 = i21 % 2;
            }
            int i23 = b + 61;
            a = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 58 / 0;
            }
        } catch (Throwable th) {
            this.e.h();
            this.u.f(supportSQLiteStatementC);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[PHI: r2
  0x0040: PHI (r2v11 ivas.gov.bisp.enumeration.J.aG) = (r2v8 ivas.gov.bisp.enumeration.J.aG), (r2v12 ivas.gov.bisp.enumeration.J.aG) binds: [B:8:0x002a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd A[Catch: all -> 0x00fb, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00fb, blocks: (B:16:0x0084, B:19:0x009d, B:24:0x00ad, B:27:0x00bd, B:29:0x00d9, B:30:0x00e2, B:22:0x00a7), top: B:39:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9 A[Catch: all -> 0x00fb, TRY_ENTER, TryCatch #0 {all -> 0x00fb, blocks: (B:16:0x0084, B:19:0x009d, B:24:0x00ad, B:27:0x00bd, B:29:0x00d9, B:30:0x00e2, B:22:0x00a7), top: B:39:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r2
  0x002c: PHI (r2v9 ivas.gov.bisp.enumeration.J.aG) = (r2v8 ivas.gov.bisp.enumeration.J.aG), (r2v12 ivas.gov.bisp.enumeration.J.aG) binds: [B:8:0x002a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final NadraFamilyData af(String str) {
        aG aGVarD;
        NadraFamilyData nadraFamilyData;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 121;
        int i5 = ((((i3 ^ 121) | i4) << 1) - (~(-((i3 | 121) & (~i4))))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            aGVarD = aG.d("SELECT * FROM nadraFamilyData WHERE cnic = ?", 1);
            if (str == null) {
                aGVarD.bindNull(1);
                int i6 = a;
                int i7 = i6 | 63;
                int i8 = (i7 << 1) - ((~(i6 & 63)) & i7);
                b = i8 % 128;
                int i9 = i8 % 2;
            } else {
                aGVarD.bindString(1, str);
                int i10 = a;
                int i11 = i10 & 95;
                int i12 = -(-((i10 ^ 95) | i11));
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            aGVarD = aG.d("SELECT * FROM nadraFamilyData WHERE cnic = ?", 1);
            if (str == null) {
                aGVarD.bindNull(1);
                int i15 = a;
                int i16 = i15 | 63;
                int i17 = (i16 << 1) - ((~(i15 & 63)) & i16);
                b = i17 % 128;
                int i18 = i17 % 2;
            } else {
                aGVarD.bindString(1, str);
                int i19 = a;
                int i110 = i19 & 95;
                int i111 = -(-((i19 ^ 95) | i110));
                int i112 = (i110 & i111) + (i111 | i110);
                b = i112 % 128;
                int i113 = i112 % 2;
            }
        }
        this.e.e();
        aI aIVar = this.e;
        int i20 = b;
        int i21 = (((i20 | 40) << 1) - (i20 ^ 40)) - 1;
        a = i21 % 128;
        Object obj = null;
        Cursor cursorB = i21 % 2 != 0 ? aq.b(aIVar, aGVarD, false, null) : aq.b(aIVar, aGVarD, false, null);
        int i22 = a;
        int i23 = (i22 ^ 115) + ((i22 & 115) << 1);
        b = i23 % 128;
        int i24 = i23 % 2;
        try {
            int iW = r.w(cursorB, "cnic");
            int iW2 = r.w(cursorB, "urdu_name");
            int i25 = a;
            int i26 = i25 & 97;
            int i27 = i26 + ((i25 ^ 97) | i26);
            b = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 12 / 0;
                if (cursorB.moveToFirst()) {
                    nadraFamilyData = new NadraFamilyData();
                    i = a + 71;
                    b = i % 128;
                    if (i % 2 != 0) {
                        nadraFamilyData.nic = cursorB.getString(iW);
                        obj.hashCode();
                        throw null;
                    }
                    nadraFamilyData.nic = cursorB.getString(iW);
                    nadraFamilyData.urduName = cursorB.getString(iW2);
                    int i29 = a;
                    int i30 = i29 & 111;
                    int i31 = ((i29 | 111) & (~i30)) + (i30 << 1);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                } else {
                    nadraFamilyData = null;
                }
            } else if (cursorB.moveToFirst()) {
                nadraFamilyData = new NadraFamilyData();
                i = a + 71;
                b = i % 128;
                if (i % 2 != 0) {
                    nadraFamilyData.nic = cursorB.getString(iW);
                    obj.hashCode();
                    throw null;
                }
                nadraFamilyData.nic = cursorB.getString(iW);
                nadraFamilyData.urduName = cursorB.getString(iW2);
                int i210 = a;
                int i33 = i210 & 111;
                int i34 = ((i210 | 111) & (~i33)) + (i33 << 1);
                b = i34 % 128;
                int i35 = i34 % 2;
            } else {
                nadraFamilyData = null;
            }
            cursorB.close();
            aGVarD.h();
            int i36 = a;
            int i37 = ((i36 | 73) << 1) - (i36 ^ 73);
            b = i37 % 128;
            if (i37 % 2 != 0) {
                return nadraFamilyData;
            }
            throw null;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final long bm(TabletLogEntity tabletLogEntity) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = (i2 ^ 53) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.e.e();
            this.e.f();
            int i6 = 10 / 0;
        } else {
            this.e.e();
            this.e.f();
        }
        int i7 = b;
        int i8 = ((i7 & 84) + (i7 | 84)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        try {
            long j = this.h.j(tabletLogEntity);
            aI aIVar = this.e;
            int i10 = b;
            int i11 = i10 | 111;
            int i12 = ((i11 << 1) - (~(-((~(i10 & 111)) & i11)))) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                aIVar.c();
                this.e.h();
                int i13 = 67 / 0;
            } else {
                aIVar.c();
                this.e.h();
            }
            int i14 = a;
            int i15 = i14 & 85;
            int i16 = (i14 ^ 85) | i15;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                return j;
            }
            throw null;
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void bs(offline_survey_count offline_survey_countVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 59;
        int i4 = (((i2 | 59) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.e.e();
        this.e.f();
        int i6 = b;
        int i7 = (-2) - ((((i6 | 62) << 1) - (i6 ^ 62)) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        try {
            this.w.i(offline_survey_countVar);
            aI aIVar = this.e;
            int i9 = a + 101;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                aIVar.c();
                this.e.h();
            } else {
                aIVar.c();
                this.e.h();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    public class buF extends aD {
        private static int a = 1;
        private static int b;

        public buF(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 80) << 1) - (i2 ^ 80);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return "INSERT OR IGNORE INTO `survey` (`id`,`data`) VALUES (?,?)";
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 1;
            int i4 = (i2 ^ 1) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            survey surveyVar = (survey) obj;
            supportSQLiteStatement.bindLong(1, surveyVar.id);
            int i7 = b;
            int i8 = (i7 & 63) + (i7 | 63);
            a = i8 % 128;
            int i9 = i8 % 2;
            String str = surveyVar.data;
            if (str == null) {
                int i10 = b + 103;
                a = i10 % 128;
                int i11 = i10 % 2;
                supportSQLiteStatement.bindNull(2);
                int i12 = b;
                int i13 = ((i12 ^ 58) + ((i12 & 58) << 1)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                return;
            }
            supportSQLiteStatement.bindString(2, str);
            int i15 = a;
            int i16 = i15 & 99;
            int i17 = ((i15 ^ 99) | i16) << 1;
            int i18 = -((i15 | 99) & (~i16));
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 78 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$bul, reason: case insensitive filesystem */
    public class C0109bul extends aD {
        private static int a = 1;
        private static int b;

        public C0109bul(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 52) << 1) - (i2 ^ 52)) - 1;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            int i6 = ((i4 | 55) << 1) - (i4 ^ 55);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return "INSERT OR IGNORE INTO `uc` (`tehsilcode`,`uc`,`uccode`,`ucno`) VALUES (?,?,?,?)";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004b A[PHI: r1
  0x004b: PHI (r1v22 java.lang.String) = (r1v10 java.lang.String), (r1v26 java.lang.String) binds: [B:8:0x0036, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:9:0x0038  */
        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            String str;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 75) + (i2 | 75);
            b = i3 % 128;
            int i4 = i3 % 2;
            uc ucVar = (uc) obj;
            supportSQLiteStatement.bindLong(1, ucVar.tehsilcode);
            int i5 = a;
            int i6 = i5 & 1;
            int i7 = (((i5 ^ 1) | i6) << 1) - ((i5 | 1) & (~i6));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                str = ucVar.uc;
                int i8 = 48 / 0;
                if (str == null) {
                    supportSQLiteStatement.bindNull(2);
                    int i9 = b;
                    int i10 = i9 & 91;
                    int i11 = (i10 - (~((i9 ^ 91) | i10))) - 1;
                    a = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    supportSQLiteStatement.bindString(2, str);
                    int i13 = a + 121;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else {
                str = ucVar.uc;
                if (str == null) {
                    supportSQLiteStatement.bindNull(2);
                    int i15 = b;
                    int i16 = i15 & 91;
                    int i17 = (i16 - (~((i15 ^ 91) | i16))) - 1;
                    a = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    supportSQLiteStatement.bindString(2, str);
                    int i19 = a + 121;
                    b = i19 % 128;
                    int i110 = i19 % 2;
                }
            }
            supportSQLiteStatement.bindLong(3, ucVar.uccode);
            int i20 = a;
            int i21 = (i20 & 93) + (i20 | 93);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                supportSQLiteStatement.bindLong(2, ucVar.ucno);
            } else {
                supportSQLiteStatement.bindLong(4, ucVar.ucno);
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void C() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 23;
        int i4 = (i2 ^ 23) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.z.c();
        int i7 = b;
        int i8 = i7 ^ 33;
        int i9 = ((i7 & 33) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                this.e.f();
                supportSQLiteStatementC.executeUpdateDelete();
                throw null;
            }
            this.e.f();
            supportSQLiteStatementC.executeUpdateDelete();
            int i12 = b + 105;
            a = i12 % 128;
            int i13 = i12 % 2;
            this.e.c();
            this.e.h();
            int i14 = a;
            int i15 = (((i14 | 36) << 1) - (i14 ^ 36)) - 1;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                SupportSQLiteStatement supportSQLiteStatement = this.z.e;
                throw null;
            }
            aC aCVar = this.z;
            if (supportSQLiteStatementC == aCVar.e) {
                aCVar.c.set(false);
                int i16 = a;
                int i17 = i16 & 15;
                int i18 = -(-(i16 | 15));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                b = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = a + 123;
            b = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 88 / 0;
            }
        } catch (Throwable th) {
            this.e.h();
            this.z.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void G() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 53) | (i2 & 53)) << 1;
        int i4 = -(((~i2) & 53) | (i2 & (-54)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.B.c();
        int i7 = a;
        int i8 = (i7 & 87) + (i7 | 87);
        b = i8 % 128;
        int i9 = i8 % 2;
        this.e.f();
        try {
            supportSQLiteStatementC.executeUpdateDelete();
            int i10 = b;
            int i11 = (i10 & (-62)) | ((~i10) & 61);
            int i12 = (i10 & 61) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            this.e.c();
            this.e.h();
            int i15 = b;
            int i16 = ((i15 | 53) << 1) - (i15 ^ 53);
            a = i16 % 128;
            int i17 = i16 % 2;
            aC aCVar = this.B;
            if (supportSQLiteStatementC == aCVar.e) {
                int i18 = a;
                int i19 = ((i18 ^ 104) + ((i18 & 104) << 1)) - 1;
                b = i19 % 128;
                int i20 = i19 % 2;
                AtomicBoolean atomicBoolean = aCVar.c;
                if (i20 == 0) {
                    atomicBoolean.set(true);
                } else {
                    atomicBoolean.set(false);
                }
            }
            int i21 = b;
            int i22 = (i21 ^ 5) + ((i21 & 5) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
        } catch (Throwable th) {
            this.e.h();
            this.B.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void aw(List<uc> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 83) << 1) - (i2 ^ 83);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.e.e();
            throw null;
        }
        this.e.e();
        this.e.f();
        try {
            this.f70o.g(list);
            int i4 = a;
            int i5 = ((i4 & (-66)) | ((~i4) & 65)) + ((i4 & 65) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.e.c();
            aI aIVar = this.e;
            int i7 = a;
            int i8 = ((i7 | 25) << 1) - (i7 ^ 25);
            b = i8 % 128;
            int i9 = i8 % 2;
            aIVar.h();
            int i10 = b;
            int i11 = (i10 ^ 115) + ((i10 & 115) << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final long bc(tehsil tehsilVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.e.e();
            this.e.f();
            throw null;
        }
        this.e.e();
        this.e.f();
        try {
            long j = this.m.j(tehsilVar);
            this.e.c();
            int i4 = a;
            int i5 = ((((i4 ^ 101) | (i4 & 101)) << 1) - (~(-(((~i4) & 101) | (i4 & (-102)))))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            this.e.h();
            int i7 = b;
            int i8 = i7 & 53;
            int i9 = (i7 ^ 53) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            return j;
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void bi(BeneficiaryEntity beneficiaryEntity) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 22) + ((i2 & 22) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.e.e();
            this.e.f();
            throw null;
        }
        this.e.e();
        this.e.f();
        int i4 = b;
        int i5 = (i4 ^ 11) + ((i4 & 11) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        try {
            this.i.i(beneficiaryEntity);
            this.e.c();
            int i7 = b;
            int i8 = (i7 & 13) + (i7 | 13);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                this.e.h();
            } else {
                this.e.h();
                int i9 = 66 / 0;
            }
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void bo(ArrayList<question_options> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 47) << 1) - (i2 ^ 47);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.e.e();
        aI aIVar = this.e;
        int i5 = a;
        int i6 = (i5 & 5) + (i5 | 5);
        b = i6 % 128;
        try {
            if (i6 % 2 == 0) {
                aIVar.f();
                this.p.g(arrayList);
                throw null;
            }
            aIVar.f();
            this.p.g(arrayList);
            this.e.c();
            aI aIVar2 = this.e;
            int i7 = a;
            int i8 = i7 ^ 77;
            int i9 = ((i7 & 77) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 & i10) + (i9 | i10);
            b = i11 % 128;
            int i12 = i11 % 2;
            aIVar2.h();
            int i13 = b;
            int i14 = (i13 | 59) << 1;
            int i15 = -(((~i13) & 59) | (i13 & (-60)));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 81 / 0;
            }
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    public class buD extends aD {
        private static int a = 0;
        private static int b = 1;

        public buD(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 59;
            int i4 = (i2 & 59) << 1;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = (i2 & 21) + (i2 | 21);
            b = i7 % 128;
            int i8 = i7 % 2;
            return "INSERT OR IGNORE INTO `locality` (`data`) VALUES (?)";
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            String str = ((locality) obj).data;
            if (str == null) {
                int i5 = a;
                int i6 = ((i5 & 126) + (i5 | 126)) - 1;
                b = i6 % 128;
                int i7 = i6 % 2;
                supportSQLiteStatement.bindNull(1);
                return;
            }
            supportSQLiteStatement.bindString(1, str);
            int i8 = a;
            int i9 = ((i8 ^ 107) - (~(-(-((i8 & 107) << 1))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$bum, reason: case insensitive filesystem */
    public class C0110bum extends aD {
        private static int a = 1;
        private static int b;

        public C0110bum(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 & 101;
            int i6 = (i5 - (~((i2 ^ 101) | i5))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return "INSERT OR IGNORE INTO `villages` (`uccode`,`localitycode`,`localitytype`,`locality`) VALUES (?,?,?,?)";
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            long j;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 89;
            int i5 = ((i3 ^ 89) | i4) << 1;
            int i6 = -((i3 | 89) & (~i4));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            vilages vilagesVar = (vilages) obj;
            int i9 = vilagesVar.uccode;
            int i10 = b;
            int i11 = i10 & 1;
            int i12 = ((((i10 ^ 1) | i11) << 1) - (~(-((i10 | 1) & (~i11))))) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                supportSQLiteStatement.bindLong(1, i9);
                j = vilagesVar.localitycode;
                i = 5;
            } else {
                supportSQLiteStatement.bindLong(1, i9);
                j = vilagesVar.localitycode;
                i = 2;
            }
            int i13 = b + 43;
            a = i13 % 128;
            int i14 = i13 % 2;
            supportSQLiteStatement.bindLong(i, j);
            String str = vilagesVar.localitytype;
            if (str == null) {
                int i15 = a + 125;
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindNull(3);
                }
                int i16 = a;
                int i17 = i16 ^ 43;
                int i18 = ((i16 & 43) | i17) << 1;
                int i19 = -i17;
                int i20 = (i18 & i19) + (i18 | i19);
                b = i20 % 128;
                int i21 = i20 % 2;
            } else {
                supportSQLiteStatement.bindString(3, str);
                int i22 = a;
                int i23 = i22 & 25;
                int i24 = i22 | 25;
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                b = i25 % 128;
                int i26 = i25 % 2;
            }
            String str2 = vilagesVar.locality;
            if (str2 != null) {
                supportSQLiteStatement.bindString(4, str2);
                int i27 = a;
                int i28 = (((i27 ^ 73) | (i27 & 73)) << 1) - (((~i27) & 73) | (i27 & (-74)));
                b = i28 % 128;
                if (i28 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i29 = a;
            int i30 = ((i29 & (-68)) | ((~i29) & 67)) + ((i29 & 67) << 1);
            b = i30 % 128;
            int i31 = i30 % 2;
            supportSQLiteStatement.bindNull(4);
            int i32 = b;
            int i33 = i32 & 31;
            int i34 = (((i32 ^ 31) | i33) << 1) - ((i32 | 31) & (~i33));
            a = i34 % 128;
            int i35 = i34 % 2;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$bup, reason: case insensitive filesystem */
    public class C0113bup extends aD {
        private static int a = 0;
        private static int b = 1;

        public C0113bup(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 113) + ((i2 & 113) << 1);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return "INSERT OR IGNORE INTO `survey_count` (`id`,`sync_count`,`not_sync_count`) VALUES (?,?,?)";
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            long j;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (-2) - (((i3 ^ 52) + ((i3 & 52) << 1)) ^ (-1));
            a = i4 % 128;
            int i5 = i4 % 2;
            survey_count survey_countVar = (survey_count) obj;
            supportSQLiteStatement.bindLong(1, survey_countVar.id);
            int i6 = b;
            int i7 = i6 & 99;
            int i8 = (i6 ^ 99) | i7;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            supportSQLiteStatement.bindLong(2, survey_countVar.sync_count);
            int i11 = b;
            int i12 = ((i11 & 2) + (i11 | 2)) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                j = survey_countVar.not_sync_count;
                i = 5;
            } else {
                j = survey_countVar.not_sync_count;
                i = 3;
            }
            supportSQLiteStatement.bindLong(i, j);
            int i13 = a;
            int i14 = i13 & 15;
            int i15 = ((((i13 ^ 15) | i14) << 1) - (~(-((i13 | 15) & (~i14))))) - 1;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$buq, reason: case insensitive filesystem */
    public class C0114buq extends aD {
        private static int a = 0;
        private static int b = 1;

        public C0114buq(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 7;
            int i4 = (i2 ^ 7) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return "INSERT OR IGNORE INTO `sync` (`id`,`data`) VALUES (?,?)";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            sync syncVar;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 37;
            int i4 = -(-((i2 ^ 37) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                syncVar = (sync) obj;
                supportSQLiteStatement.bindLong(0, syncVar.id);
            } else {
                syncVar = (sync) obj;
                supportSQLiteStatement.bindLong(1, syncVar.id);
            }
            String str = syncVar.data;
            if (str != null) {
                supportSQLiteStatement.bindString(2, str);
                int i6 = b;
                int i7 = i6 & 17;
                int i8 = i7 + ((i6 ^ 17) | i7);
                a = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            int i10 = b;
            int i11 = (i10 & (-120)) | ((~i10) & 119);
            int i12 = (i10 & 119) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            supportSQLiteStatement.bindNull(2);
            int i15 = b;
            int i16 = i15 & 37;
            int i17 = (((i15 ^ 37) | i16) << 1) - ((i15 | 37) & (~i16));
            a = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$bus, reason: case insensitive filesystem */
    public class C0116bus extends aD {
        private static int a = 1;
        private static int b;

        public C0116bus(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 121) | (i2 & 121)) << 1;
            int i4 = -(((~i2) & 121) | (i2 & (-122)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return "INSERT OR IGNORE INTO `offlinesurvey` (`id`,`data`) VALUES (?,?)";
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 86) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            offlinesurvey offlinesurveyVar = (offlinesurvey) obj;
            supportSQLiteStatement.bindLong(1, offlinesurveyVar.id);
            int i4 = b;
            int i5 = ((i4 & 25) - (~(-(-(i4 | 25))))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            String str = offlinesurveyVar.data;
            if (str == null) {
                int i7 = (-2) - ((a + 10) ^ (-1));
                b = i7 % 128;
                int i8 = i7 % 2;
                supportSQLiteStatement.bindNull(2);
                int i9 = a;
                int i10 = ((i9 & (-100)) | ((~i9) & 99)) + ((i9 & 99) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            supportSQLiteStatement.bindString(2, str);
            int i12 = b;
            int i13 = i12 & 21;
            int i14 = i13 + ((i12 ^ 21) | i13);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 27 / 0;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void D() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 47) + ((i2 & 47) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.N.c();
        int i5 = a;
        int i6 = ((i5 ^ 75) | (i5 & 75)) << 1;
        int i7 = -(((~i5) & 75) | (i5 & (-76)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        Object obj = null;
        try {
            if (i8 % 2 == 0) {
                this.e.f();
                supportSQLiteStatementC.executeUpdateDelete();
                obj.hashCode();
                throw null;
            }
            this.e.f();
            supportSQLiteStatementC.executeUpdateDelete();
            this.e.c();
            this.e.h();
            aC aCVar = this.N;
            int i9 = a;
            int i10 = (i9 ^ 109) + ((i9 & 109) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                SupportSQLiteStatement supportSQLiteStatement = aCVar.e;
                obj.hashCode();
                throw null;
            }
            if (supportSQLiteStatementC == aCVar.e) {
                aCVar.c.set(false);
                int i11 = a;
                int i12 = (-2) - (((i11 & 62) + (i11 | 62)) ^ (-1));
                b = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = a;
            int i15 = ((((i14 ^ 39) | (i14 & 39)) << 1) - (~(-(((~i14) & 39) | (i14 & (-40)))))) - 1;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            this.e.h();
            this.N.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void H() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 70) ^ (-1));
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.e.e();
            obj.hashCode();
            throw null;
        }
        this.e.e();
        aC aCVar = this.H;
        int i3 = a;
        int i4 = (i3 & (-82)) | ((~i3) & 81);
        int i5 = -(-((i3 & 81) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            aCVar.c();
            this.e.f();
            obj.hashCode();
            throw null;
        }
        SupportSQLiteStatement supportSQLiteStatementC = aCVar.c();
        this.e.f();
        try {
            supportSQLiteStatementC.executeUpdateDelete();
            aI aIVar = this.e;
            int i7 = a;
            int i8 = (-2) - (((i7 & 30) + (i7 | 30)) ^ (-1));
            b = i8 % 128;
            if (i8 % 2 == 0) {
                aIVar.c();
                this.e.h();
                int i9 = 78 / 0;
            } else {
                aIVar.c();
                this.e.h();
            }
            aC aCVar2 = this.H;
            if (supportSQLiteStatementC == aCVar2.e) {
                int i10 = b;
                int i11 = (((i10 ^ 65) | (i10 & 65)) << 1) - (((~i10) & 65) | (i10 & (-66)));
                a = i11 % 128;
                int i12 = i11 % 2;
                aCVar2.c.set(false);
                int i13 = b;
                int i14 = i13 | 89;
                int i15 = i14 << 1;
                int i16 = -((~(i13 & 89)) & i14);
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = b;
            int i20 = i19 & 35;
            int i21 = -(-((i19 ^ 35) | i20));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            this.H.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final int aS(long j, int i, int i2) {
        SupportSQLiteStatement supportSQLiteStatementC;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 | 112) << 1) - (i4 ^ 112);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.e.e();
            supportSQLiteStatementC = this.K.c();
            int i7 = 99 / 0;
        } else {
            this.e.e();
            supportSQLiteStatementC = this.K.c();
        }
        int i8 = b;
        int i9 = i8 ^ 87;
        int i10 = (i8 & 87) << 1;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            supportSQLiteStatementC.bindLong(0, i);
        } else {
            supportSQLiteStatementC.bindLong(1, i);
        }
        int i12 = b + 27;
        a = i12 % 128;
        int i13 = i12 % 2;
        supportSQLiteStatementC.bindLong(2, i2);
        supportSQLiteStatementC.bindLong(3, j);
        this.e.f();
        int i14 = a;
        int i15 = ((i14 ^ 36) + ((i14 & 36) << 1)) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementC.executeUpdateDelete();
            this.e.c();
            aI aIVar = this.e;
            int i17 = a;
            int i18 = (i17 ^ 113) + ((i17 & 113) << 1);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                aIVar.h();
                SupportSQLiteStatement supportSQLiteStatement = this.K.e;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            aIVar.h();
            aC aCVar = this.K;
            if (supportSQLiteStatementC == aCVar.e) {
                int i19 = a;
                int i20 = i19 & 87;
                int i21 = i19 | 87;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                b = i22 % 128;
                int i23 = i22 % 2;
                aCVar.c.set(false);
            }
            int i24 = a;
            int i25 = i24 & 45;
            int i26 = (i25 - (~(-(-((i24 ^ 45) | i25))))) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
            return iExecuteUpdateDelete;
        } catch (Throwable th) {
            this.e.h();
            aC aCVar2 = this.K;
            if (supportSQLiteStatementC == aCVar2.e) {
                aCVar2.c.set(false);
                int i28 = a;
                int i29 = i28 | 121;
                int i30 = i29 << 1;
                int i31 = -((~(i28 & 121)) & i29);
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                b = i32 % 128;
                int i33 = i32 % 2;
            }
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<lib_mobile> ao() {
        int i = 2 % 2;
        int i2 = b + 37;
        a = i2 % 128;
        int i3 = i2 % 2;
        aG aGVarD = aG.d("SELECT * FROM lib_mobile GROUP BY provider ORDER BY provider ASC", 0);
        aI aIVar = this.e;
        int i4 = b;
        int i5 = (i4 & (-66)) | ((~i4) & 65);
        int i6 = (i4 & 65) << 1;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            aIVar.e();
        } else {
            aIVar.e();
        }
        aI aIVar2 = this.e;
        int i8 = a;
        int i9 = i8 & 75;
        int i10 = ((i8 ^ 75) | i9) << 1;
        int i11 = -((i8 | 75) & (~i9));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        Cursor cursorB = aq.b(aIVar2, aGVarD, false, null);
        try {
            int iW = r.w(cursorB, "prefix");
            int i14 = a;
            int i15 = ((i14 ^ 63) | (i14 & 63)) << 1;
            int i16 = -(((~i14) & 63) | (i14 & (-64)));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
            int iW2 = r.w(cursorB, "provider");
            int i19 = a + 93;
            b = i19 % 128;
            int i20 = i19 % 2;
            int iW3 = r.w(cursorB, "operator_code");
            int iW4 = r.w(cursorB, "idate");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i21 = b + 99;
            a = i21 % 128;
            int i22 = i21 % 2;
            while (cursorB.moveToNext()) {
                int i23 = b;
                int i24 = ((i23 | 121) << 1) - (i23 ^ 121);
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    cursorB.getString(iW);
                    cursorB.getString(iW2);
                    throw null;
                }
                String string = cursorB.getString(iW);
                String string2 = cursorB.getString(iW2);
                int i25 = b;
                int i26 = i25 & 3;
                int i27 = (i25 | 3) & (~i26);
                int i28 = -(-(i26 << 1));
                int i29 = (i27 & i28) + (i27 | i28);
                a = i29 % 128;
                int i30 = i29 % 2;
                lib_mobile lib_mobileVar = new lib_mobile(string, string2, cursorB.getInt(iW3), cursorB.getString(iW4));
                int i31 = b;
                int i32 = i31 ^ 87;
                int i33 = (i31 & 87) << 1;
                int i34 = (i32 & i33) + (i33 | i32);
                a = i34 % 128;
                int i35 = i34 % 2;
                arrayList.add(lib_mobileVar);
                int i36 = a;
                int i37 = ((i36 & 100) + (i36 | 100)) - 1;
                b = i37 % 128;
                int i38 = i37 % 2;
            }
            cursorB.close();
            aGVarD.h();
            int i39 = b;
            int i40 = i39 & 63;
            int i41 = -(-((i39 ^ 63) | i40));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            a = i42 % 128;
            int i43 = i42 % 2;
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void bp(survey surveyVar) {
        aD aDVar;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 2) + ((i2 & 2) << 1)) - 1;
        b = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                this.e.e();
                this.e.f();
                aDVar = this.j;
                int i4 = 47 / 0;
            } else {
                this.e.e();
                this.e.f();
                aDVar = this.j;
            }
            int i5 = a;
            int i6 = i5 ^ 59;
            int i7 = ((i5 & 59) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            aDVar.i(surveyVar);
            this.e.c();
            this.e.h();
            int i11 = b;
            int i12 = ((i11 ^ 49) | (i11 & 49)) << 1;
            int i13 = -(((~i11) & 49) | (i11 & (-50)));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            a = i14 % 128;
            int i15 = i14 % 2;
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    public class buS extends aD {
        private static int a = 0;
        private static int b = 1;

        public buS(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 59;
            int i4 = (i2 & 59) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return "INSERT OR REPLACE INTO `nadraFamilyData` (`cnic`,`urdu_name`) VALUES (?,?)";
            }
            int i6 = 65 / 0;
            return "INSERT OR REPLACE INTO `nadraFamilyData` (`cnic`,`urdu_name`) VALUES (?,?)";
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = b + 88;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            a = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                String str = ((NadraFamilyData) obj).nic;
                obj2.hashCode();
                throw null;
            }
            NadraFamilyData nadraFamilyData = (NadraFamilyData) obj;
            String str2 = nadraFamilyData.nic;
            if (str2 == null) {
                int i4 = a;
                int i5 = i4 ^ 99;
                int i6 = (i4 & 99) << 1;
                int i7 = (i5 & i6) + (i6 | i5);
                b = i7 % 128;
                int i8 = i7 % 2;
                supportSQLiteStatement.bindNull(1);
                int i9 = a + 125;
                b = i9 % 128;
                int i10 = i9 % 2;
            } else {
                supportSQLiteStatement.bindString(1, str2);
                int i11 = a;
                int i12 = i11 ^ 45;
                int i13 = -(-((i11 & 45) << 1));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            String str3 = nadraFamilyData.urduName;
            if (str3 != null) {
                supportSQLiteStatement.bindString(2, str3);
                int i16 = a;
                int i17 = (i16 ^ 55) + ((i16 & 55) << 1);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i18 = a;
            int i19 = i18 & 95;
            int i20 = -(-((i18 ^ 95) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            b = i21 % 128;
            int i22 = i21 % 2;
            supportSQLiteStatement.bindNull(2);
            int i23 = a;
            int i24 = i23 & 85;
            int i25 = (i23 | 85) & (~i24);
            int i26 = -(-(i24 << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            b = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 43 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$buk, reason: case insensitive filesystem */
    public class C0108buk extends aD {
        private static int a = 1;
        private static int b;

        public C0108buk(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 81;
            int i4 = (i2 | 81) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return "INSERT OR IGNORE INTO `tehsil` (`id`,`tehsilcode`,`distcode`,`tehsil`) VALUES (?,?,?,?)";
            }
            int i7 = 33 / 0;
            return "INSERT OR IGNORE INTO `tehsil` (`id`,`tehsilcode`,`distcode`,`tehsil`) VALUES (?,?,?,?)";
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-102)) | ((~i2) & 101);
            int i4 = (i2 & 101) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                String str = ((tehsil) obj).id;
                throw null;
            }
            tehsil tehsilVar = (tehsil) obj;
            String str2 = tehsilVar.id;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(1);
                int i6 = b;
                int i7 = i6 & 53;
                int i8 = i7 + ((i6 ^ 53) | i7);
                a = i8 % 128;
                int i9 = i8 % 2;
            } else {
                supportSQLiteStatement.bindString(1, str2);
                int i10 = b;
                int i11 = (i10 ^ 97) + ((i10 & 97) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            supportSQLiteStatement.bindLong(2, tehsilVar.tehsilcode);
            int i13 = a;
            int i14 = i13 & 37;
            int i15 = i13 | 37;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            int i17 = i16 % 2;
            supportSQLiteStatement.bindLong(3, tehsilVar.distcode);
            int i18 = a;
            int i19 = ((i18 ^ 38) + ((i18 & 38) << 1)) - 1;
            b = i19 % 128;
            if (i19 % 2 != 0) {
                String str3 = tehsilVar.tehsil;
                throw null;
            }
            String str4 = tehsilVar.tehsil;
            if (str4 != null) {
                supportSQLiteStatement.bindString(4, str4);
                int i20 = a;
                int i21 = ((i20 | 35) << 1) - (i20 ^ 35);
                b = i21 % 128;
                int i22 = i21 % 2;
                return;
            }
            supportSQLiteStatement.bindNull(4);
            int i23 = a;
            int i24 = (((i23 & (-50)) | ((~i23) & 49)) - (~(-(-((i23 & 49) << 1))))) - 1;
            b = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 47 / 0;
            }
        }
    }

    public class buu extends aD {
        private static int a = 1;
        private static int b;

        public buu(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 97) + (i2 | 97);
            int i4 = i3 % 128;
            b = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 49;
            a = i5 % 128;
            int i6 = i5 % 2;
            return "INSERT OR REPLACE INTO `tablet_log_data` (`id`,`tablet_log_json`) VALUES (nullif(?, 0),?)";
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-22)) | ((~i2) & 21);
            int i4 = -(-((i2 & 21) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            TabletLogEntity tabletLogEntity = i5 % 2 == 0 ? (TabletLogEntity) obj : (TabletLogEntity) obj;
            supportSQLiteStatement.bindLong(1, tabletLogEntity.id);
            String str = tabletLogEntity.tabletLogJson;
            if (str != null) {
                supportSQLiteStatement.bindString(2, str);
                int i6 = b;
                int i7 = i6 & 71;
                int i8 = (i6 | 71) & (~i7);
                int i9 = i7 << 1;
                int i10 = (i8 & i9) + (i8 | i9);
                a = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            int i12 = b;
            int i13 = i12 & 115;
            int i14 = ((i12 ^ 115) | i13) << 1;
            int i15 = -((i12 | 115) & (~i13));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
            supportSQLiteStatement.bindNull(2);
            int i18 = a;
            int i19 = i18 ^ 73;
            int i20 = ((((i18 & 73) | i19) << 1) - (~(-i19))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<locality> U() {
        int i = 2 % 2;
        int i2 = b + 13;
        a = i2 % 128;
        aG aGVarD = i2 % 2 != 0 ? aG.d("SELECT * FROM locality", 1) : aG.d("SELECT * FROM locality", 0);
        this.e.e();
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        try {
            int iW = r.w(cursorB, "data");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i3 = b;
            int i4 = i3 & 5;
            int i5 = (i3 ^ 5) | i4;
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            while (cursorB.moveToNext()) {
                locality localityVar = new locality(cursorB.getString(iW));
                int i8 = b;
                int i9 = i8 & 95;
                int i10 = i8 | 95;
                int i11 = (i9 & i10) + (i10 | i9);
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    arrayList.add(localityVar);
                    throw null;
                }
                arrayList.add(localityVar);
            }
            cursorB.close();
            aGVarD.h();
            int i12 = b;
            int i13 = ((i12 & 91) - (~(-(-(i12 | 91))))) - 1;
            a = i13 % 128;
            if (i13 % 2 == 0) {
                return arrayList;
            }
            throw null;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final long bl(district districtVar) {
        long j;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 111) + (i2 | 111);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.e.e();
            this.e.f();
            try {
                int i4 = 46 / 0;
            } catch (Throwable th) {
                this.e.h();
                throw th;
            }
        } else {
            this.e.e();
            this.e.f();
        }
        int i5 = b;
        int i6 = i5 & 91;
        int i7 = (i6 - (~((i5 ^ 91) | i6))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            j = this.l.j(districtVar);
            this.e.c();
            int i8 = 97 / 0;
        } else {
            j = this.l.j(districtVar);
            this.e.c();
        }
        int i9 = b;
        int i10 = i9 & 57;
        int i11 = -(-(i9 | 57));
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        this.e.h();
        int i14 = a;
        int i15 = ((i14 & 24) + (i14 | 24)) - 1;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void I() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = (i2 ^ 115) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.e();
        aC aCVar = this.E;
        int i7 = a;
        int i8 = ((i7 | 101) << 1) - (i7 ^ 101);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            aCVar.c();
            this.e.f();
            throw null;
        }
        SupportSQLiteStatement supportSQLiteStatementC = aCVar.c();
        this.e.f();
        int i9 = a;
        int i10 = ((i9 ^ 111) | (i9 & 111)) << 1;
        int i11 = -(((~i9) & 111) | (i9 & (-112)));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        try {
            if (i12 % 2 == 0) {
                supportSQLiteStatementC.executeUpdateDelete();
                obj.hashCode();
                throw null;
            }
            supportSQLiteStatementC.executeUpdateDelete();
            this.e.c();
            this.e.h();
            int i13 = b;
            int i14 = i13 & 53;
            int i15 = -(-((i13 ^ 53) | i14));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                SupportSQLiteStatement supportSQLiteStatement = this.E.e;
                obj.hashCode();
                throw null;
            }
            aC aCVar2 = this.E;
            if (supportSQLiteStatementC == aCVar2.e) {
                aCVar2.c.set(false);
                int i17 = a;
                int i18 = ((i17 | 27) << 1) - (i17 ^ 27);
                b = i18 % 128;
                int i19 = i18 % 2;
            }
            int i20 = b;
            int i21 = (i20 & 89) + (i20 | 89);
            a = i21 % 128;
            int i22 = i21 % 2;
        } catch (Throwable th) {
            this.e.h();
            this.E.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void J() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 37) + (i2 | 37);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.C.c();
        int i5 = a;
        int i6 = (i5 & 91) + (i5 | 91);
        b = i6 % 128;
        Object obj = null;
        try {
            if (i6 % 2 == 0) {
                this.e.f();
                supportSQLiteStatementC.executeUpdateDelete();
                throw null;
            }
            this.e.f();
            supportSQLiteStatementC.executeUpdateDelete();
            int i7 = b;
            int i8 = (((i7 | 12) << 1) - (i7 ^ 12)) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                this.e.c();
                this.e.h();
                obj.hashCode();
                throw null;
            }
            this.e.c();
            this.e.h();
            aC aCVar = this.C;
            if (supportSQLiteStatementC == aCVar.e) {
                int i9 = b;
                int i10 = i9 & 79;
                int i11 = (i10 - (~(-(-((i9 ^ 79) | i10))))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                AtomicBoolean atomicBoolean = aCVar.c;
                if (i12 != 0) {
                    atomicBoolean.set(true);
                } else {
                    atomicBoolean.set(false);
                }
            }
            int i13 = b;
            int i14 = ((i13 ^ 125) | (i13 & 125)) << 1;
            int i15 = -(((~i13) & 125) | (i13 & (-126)));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
        } catch (Throwable th) {
            this.e.h();
            this.C.f(supportSQLiteStatementC);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void K() {
        aI aIVar;
        int i;
        AtomicBoolean atomicBoolean;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 75;
        int i5 = -(-((i3 ^ 75) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.I.c();
        int i8 = a;
        int i9 = i8 & 5;
        int i10 = ((i8 ^ 5) | i9) << 1;
        int i11 = -((i8 | 5) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        try {
            if (i12 % 2 == 0) {
                this.e.f();
                supportSQLiteStatementC.executeUpdateDelete();
                aIVar = this.e;
                int i13 = 95 / 0;
            } else {
                this.e.f();
                supportSQLiteStatementC.executeUpdateDelete();
                aIVar = this.e;
            }
            int i14 = b;
            int i15 = (i14 & 107) + (i14 | 107);
            a = i15 % 128;
            int i16 = i15 % 2;
            aIVar.c();
            this.e.h();
            aC aCVar = this.I;
            int i17 = b;
            int i18 = i17 & 63;
            int i19 = ((i17 ^ 63) | i18) << 1;
            int i20 = -((i17 | 63) & (~i18));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            a = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 22 / 0;
                if (supportSQLiteStatementC == aCVar.e) {
                    int i23 = b;
                    int i24 = i23 & 55;
                    int i25 = (((i23 ^ 55) | i24) << 1) - ((i23 | 55) & (~i24));
                    a = i25 % 128;
                    i = i25 % 2;
                    atomicBoolean = aCVar.c;
                    if (i != 0) {
                        atomicBoolean.set(true);
                    } else {
                        atomicBoolean.set(false);
                    }
                    int i26 = a;
                    int i27 = (i26 & (-122)) | ((~i26) & 121);
                    int i28 = -(-((i26 & 121) << 1));
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    b = i29 % 128;
                    int i30 = i29 % 2;
                }
            } else if (supportSQLiteStatementC == aCVar.e) {
                int i210 = b;
                int i211 = i210 & 55;
                int i212 = (((i210 ^ 55) | i211) << 1) - ((i210 | 55) & (~i211));
                a = i212 % 128;
                i = i212 % 2;
                atomicBoolean = aCVar.c;
                if (i != 0) {
                    atomicBoolean.set(true);
                } else {
                    atomicBoolean.set(false);
                }
                int i213 = a;
                int i214 = (i213 & (-122)) | ((~i213) & 121);
                int i215 = -(-((i213 & 121) << 1));
                int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
                b = i216 % 128;
                int i31 = i216 % 2;
            }
            int i32 = a;
            int i33 = i32 & 33;
            int i34 = -(-(i32 | 33));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            b = i35 % 128;
            int i36 = i35 % 2;
        } catch (Throwable th) {
            this.e.h();
            this.I.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void L(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 105;
        int i4 = -(-((i2 ^ 105) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.L.c();
        int i7 = b;
        int i8 = ((i7 ^ 14) + ((i7 & 14) << 1)) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            supportSQLiteStatementC.bindLong(1, j);
            this.e.f();
        } else {
            supportSQLiteStatementC.bindLong(1, j);
            this.e.f();
        }
        try {
            supportSQLiteStatementC.executeUpdateDelete();
            int i9 = b;
            int i10 = ((i9 ^ 62) + ((i9 & 62) << 1)) - 1;
            a = i10 % 128;
            Object obj = null;
            if (i10 % 2 != 0) {
                this.e.c();
                this.e.h();
                throw null;
            }
            this.e.c();
            this.e.h();
            int i11 = b;
            int i12 = ((i11 | 99) << 1) - (i11 ^ 99);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                SupportSQLiteStatement supportSQLiteStatement = this.L.e;
                obj.hashCode();
                throw null;
            }
            aC aCVar = this.L;
            if (supportSQLiteStatementC == aCVar.e) {
                int i13 = a;
                int i14 = i13 & 61;
                int i15 = ((i13 ^ 61) | i14) << 1;
                int i16 = -((i13 | 61) & (~i14));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                aCVar.c.set(false);
            }
            int i19 = (-2) - ((a + 106) ^ (-1));
            b = i19 % 128;
            int i20 = i19 % 2;
        } catch (Throwable th) {
            this.e.h();
            aC aCVar2 = this.L;
            if (supportSQLiteStatementC == aCVar2.e) {
                aCVar2.c.set(false);
                int i21 = b;
                int i22 = ((i21 ^ 83) | (i21 & 83)) << 1;
                int i23 = -(((~i21) & 83) | (i21 & (-84)));
                int i24 = (i22 & i23) + (i23 | i22);
                a = i24 % 128;
                int i25 = i24 % 2;
            }
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<province> Z() {
        String string;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 55;
        int i5 = -(-(i3 | 55));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        aG aGVarD = aG.d("SELECT * FROM province", 0);
        this.e.e();
        int i8 = b;
        int i9 = i8 & 35;
        int i10 = ((i8 ^ 35) | i9) << 1;
        int i11 = -((i8 | 35) & (~i9));
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i14 = a;
        int i15 = i14 ^ 15;
        int i16 = (i14 & 15) << 1;
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        try {
            if (i17 % 2 == 0) {
                r.w(cursorB, "id");
                r.w(cursorB, "province_id");
                throw null;
            }
            int iW = r.w(cursorB, "id");
            int iW2 = r.w(cursorB, "province_id");
            int iW3 = r.w(cursorB, "province_name");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i18 = b;
            int i19 = (i18 & 59) + (i18 | 59);
            a = i19 % 128;
            int i20 = i19 % 2;
            while (!(!cursorB.moveToNext())) {
                int i21 = b;
                int i22 = i21 & 107;
                int i23 = -(-(i21 | 107));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    string = cursorB.getString(iW);
                    i = cursorB.getInt(iW2);
                    int i25 = 50 / 0;
                } else {
                    string = cursorB.getString(iW);
                    i = cursorB.getInt(iW2);
                }
                province provinceVar = new province(string, i, cursorB.getString(iW3));
                int i26 = a;
                int i27 = i26 & 93;
                int i28 = (i27 - (~((i26 ^ 93) | i27))) - 1;
                b = i28 % 128;
                int i29 = i28 % 2;
                arrayList.add(provinceVar);
                int i30 = b;
                int i31 = i30 ^ 21;
                int i32 = -(-((i30 & 21) << 1));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                a = i33 % 128;
                int i34 = i33 % 2;
            }
            cursorB.close();
            aGVarD.h();
            int i35 = b;
            int i36 = i35 & 89;
            int i37 = (i35 | 89) & (~i36);
            int i38 = i36 << 1;
            int i39 = (i37 & i38) + (i37 | i38);
            a = i39 % 128;
            if (i39 % 2 != 0) {
                int i40 = 34 / 0;
            }
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032 A[PHI: r1
  0x0032: PHI (r1v13 ivas.gov.bisp.enumeration.J.aG) = (r1v5 ivas.gov.bisp.enumeration.J.aG), (r1v14 ivas.gov.bisp.enumeration.J.aG) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1
  0x0021: PHI (r1v6 ivas.gov.bisp.enumeration.J.aG) = (r1v5 ivas.gov.bisp.enumeration.J.aG), (r1v14 ivas.gov.bisp.enumeration.J.aG) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<String> am(String str) {
        aG aGVarD;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 11) + (i2 | 11);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            aGVarD = aG.d("SELECT prefix FROM lib_mobile WHERE provider = ?", 1);
            if (str == null) {
                aGVarD.bindNull(1);
                int i4 = b;
                int i5 = (i4 ^ 81) + ((i4 & 81) << 1);
                a = i5 % 128;
                int i6 = i5 % 2;
            } else {
                aGVarD.bindString(1, str);
                int i7 = a;
                int i8 = (i7 ^ 55) + ((i7 & 55) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            aGVarD = aG.d("SELECT prefix FROM lib_mobile WHERE provider = ?", 1);
            if (str == null) {
                aGVarD.bindNull(1);
                int i10 = b;
                int i11 = (i10 ^ 81) + ((i10 & 81) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                aGVarD.bindString(1, str);
                int i13 = a;
                int i14 = (i13 ^ 55) + ((i13 & 55) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        this.e.e();
        Object obj = null;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i16 = a;
            int i17 = (i16 | 67) << 1;
            int i18 = -(((~i16) & 67) | (i16 & (-68)));
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            while (true) {
                int i20 = i19 % 2;
                if (!cursorB.moveToNext()) {
                    cursorB.close();
                    aGVarD.h();
                    int i21 = a;
                    int i22 = i21 & 27;
                    int i23 = (((i21 ^ 27) | i22) << 1) - ((i21 | 27) & (~i22));
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    return arrayList;
                }
                int i25 = b;
                int i26 = i25 & 125;
                int i27 = (i25 ^ 125) | i26;
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                a = i28 % 128;
                int i29 = i28 % 2;
                arrayList.add(cursorB.getString(0));
                int i30 = a;
                int i31 = (((i30 | 68) << 1) - (i30 ^ 68)) - 1;
                int i32 = i31 % 128;
                b = i32;
                if (i31 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i33 = (i32 | 23) << 1;
                int i34 = -(((~i32) & 23) | (i32 & (-24)));
                i19 = (i33 ^ i34) + ((i34 & i33) << 1);
                a = i19 % 128;
            }
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final long ax(vilages vilagesVar) {
        int i = 2 % 2;
        int i2 = b + 11;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.e.e();
            this.e.f();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.e.e();
        this.e.f();
        try {
            long j = this.n.j(vilagesVar);
            this.e.c();
            int i3 = b;
            int i4 = (((i3 & (-68)) | ((~i3) & 67)) - (~((i3 & 67) << 1))) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                this.e.h();
                int i5 = 54 / 0;
            } else {
                this.e.h();
            }
            return j;
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void ay(List<vilages> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-18)) | ((~i2) & 17)) + ((i2 & 17) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.e.e();
        aI aIVar = this.e;
        int i5 = b;
        int i6 = i5 & 51;
        int i7 = (i5 ^ 51) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        try {
            if (i8 % 2 != 0) {
                aIVar.f();
                this.n.g(list);
                throw null;
            }
            aIVar.f();
            this.n.g(list);
            this.e.c();
            aI aIVar2 = this.e;
            int i9 = a;
            int i10 = i9 & 51;
            int i11 = (i9 ^ 51) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            aIVar2.h();
            int i14 = b;
            int i15 = (i14 ^ 55) + ((i14 & 55) << 1);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void bk(locality localityVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = -(-((i2 ^ 121) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        try {
            if (i5 % 2 == 0) {
                this.e.e();
                this.e.f();
                throw null;
            }
            this.e.e();
            this.e.f();
            int i6 = a;
            int i7 = i6 & 121;
            int i8 = (((i6 | 121) & (~i7)) - (~(-(-(i7 << 1))))) - 1;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                this.d.i(localityVar);
                this.e.c();
                obj.hashCode();
                throw null;
            }
            this.d.i(localityVar);
            this.e.c();
            int i9 = a;
            int i10 = ((i9 ^ 65) - (~((i9 & 65) << 1))) - 1;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                this.e.h();
            } else {
                this.e.h();
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void br(offlinesurvey offlinesurveyVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (i3 - (~((i2 ^ 67) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.e.e();
        this.e.f();
        int i6 = b;
        int i7 = (i6 & 111) + (i6 | 111);
        a = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                this.t.i(offlinesurveyVar);
                this.e.c();
                int i8 = 75 / 0;
            } else {
                this.t.i(offlinesurveyVar);
                this.e.c();
            }
            this.e.h();
            int i9 = b + 107;
            a = i9 % 128;
            int i10 = i9 % 2;
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final long bt(province provinceVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        a = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.e.e();
                this.e.f();
                throw null;
            }
            this.e.e();
            this.e.f();
            aD aDVar = this.k;
            int i4 = b;
            int i5 = i4 ^ 9;
            int i6 = (i4 & 9) << 1;
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                aDVar.j(provinceVar);
                this.e.c();
                throw null;
            }
            long j = aDVar.j(provinceVar);
            this.e.c();
            this.e.h();
            int i8 = a;
            int i9 = (i8 & 101) + (i8 | 101);
            b = i9 % 128;
            int i10 = i9 % 2;
            return j;
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void bv(sync syncVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 105) + (i2 | 105);
        b = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                this.e.e();
                this.e.f();
                obj.hashCode();
                throw null;
            }
            this.e.e();
            this.e.f();
            int i4 = a + 71;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                this.r.i(syncVar);
                this.e.c();
                throw null;
            }
            this.r.i(syncVar);
            this.e.c();
            int i5 = b + 7;
            a = i5 % 128;
            int i6 = i5 % 2;
            this.e.h();
            int i7 = a;
            int i8 = ((i7 ^ 77) | (i7 & 77)) << 1;
            int i9 = -(((~i7) & 77) | (i7 & (-78)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void A() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 65) + (i2 | 65);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.v.c();
        int i5 = b;
        int i6 = i5 & 119;
        int i7 = (i5 | 119) & (~i6);
        int i8 = i6 << 1;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        try {
            if (i9 % 2 != 0) {
                this.e.f();
                supportSQLiteStatementC.executeUpdateDelete();
                int i10 = 20 / 0;
            } else {
                this.e.f();
                supportSQLiteStatementC.executeUpdateDelete();
            }
            int i11 = a;
            int i12 = ((i11 | 23) << 1) - (i11 ^ 23);
            b = i12 % 128;
            int i13 = i12 % 2;
            this.e.c();
            aI aIVar = this.e;
            int i14 = a;
            int i15 = ((i14 | 77) << 1) - (i14 ^ 77);
            b = i15 % 128;
            int i16 = i15 % 2;
            aIVar.h();
            aC aCVar = this.v;
            if (supportSQLiteStatementC == aCVar.e) {
                int i17 = b;
                int i18 = ((i17 ^ 45) | (i17 & 45)) << 1;
                int i19 = -(((~i17) & 45) | (i17 & (-46)));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                a = i20 % 128;
                int i21 = i20 % 2;
                aCVar.c.set(false);
                int i22 = b;
                int i23 = i22 & 105;
                int i24 = (i22 | 105) & (~i23);
                int i25 = -(-(i23 << 1));
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                a = i26 % 128;
                int i27 = i26 % 2;
            }
            int i28 = a + 59;
            b = i28 % 128;
            int i29 = i28 % 2;
        } catch (Throwable th) {
            this.e.h();
            this.v.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void B() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 65) + (i2 | 65);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.e.e();
            this.D.c();
            throw null;
        }
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.D.c();
        this.e.f();
        try {
            supportSQLiteStatementC.executeUpdateDelete();
            int i4 = b;
            int i5 = (((i4 | 108) << 1) - (i4 ^ 108)) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                this.e.c();
                this.e.h();
                int i6 = 6 / 0;
            } else {
                this.e.c();
                this.e.h();
            }
            aC aCVar = this.D;
            if (supportSQLiteStatementC == aCVar.e) {
                int i7 = b;
                int i8 = i7 & 97;
                int i9 = ((((i7 ^ 97) | i8) << 1) - (~(-((i7 | 97) & (~i8))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                aCVar.c.set(false);
                int i11 = (-2) - ((a + 32) ^ (-1));
                b = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = b + 35;
            a = i13 % 128;
            int i14 = i13 % 2;
        } catch (Throwable th) {
            this.e.h();
            this.D.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<tehsil> ai(int i) {
        int iW;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 121) - (~(i3 | 121))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        aG aGVarD = aG.d("SELECT * FROM tehsil where distcode=?", 1);
        int i6 = b;
        int i7 = (i6 & 108) + (i6 | 108);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        aGVarD.bindLong(1, i);
        aI aIVar = this.e;
        int i10 = a;
        int i11 = (i10 & 85) + (i10 | 85);
        b = i11 % 128;
        int i12 = i11 % 2;
        aIVar.e();
        int i13 = 0;
        Object obj = null;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i14 = a;
        int i15 = i14 & 49;
        int i16 = i14 | 49;
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        try {
            if (i17 % 2 == 0) {
                iW = r.w(cursorB, "id");
                int i18 = 39 / 0;
            } else {
                iW = r.w(cursorB, "id");
            }
            int i19 = b;
            int i20 = ((i19 | 39) << 1) - (i19 ^ 39);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                r.w(cursorB, "tehsilcode");
                obj.hashCode();
                throw null;
            }
            int iW2 = r.w(cursorB, "tehsilcode");
            int i21 = a + 49;
            b = i21 % 128;
            int i22 = i21 % 2;
            int iW3 = r.w(cursorB, "distcode");
            int iW4 = r.w(cursorB, "tehsil");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i23 = a;
            int i24 = (i23 & 125) + (i23 | 125);
            b = i24 % 128;
            int i25 = i24 % 2;
            while (cursorB.moveToNext()) {
                int i26 = b;
                int i27 = ((i26 ^ 45) | (i26 & 45)) << 1;
                int i28 = -(((~i26) & 45) | (i26 & (-46)));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                a = i29 % 128;
                if (i29 % 2 != 0) {
                    cursorB.getString(iW);
                    cursorB.getInt(iW2);
                    obj.hashCode();
                    throw null;
                }
                String string = cursorB.getString(iW);
                int i30 = cursorB.getInt(iW2);
                int i31 = b;
                int i32 = (29 & (~i31)) | (i31 & (-30));
                int i33 = (i31 & 29) << 1;
                int i34 = (i32 & i33) + (i32 | i33);
                a = i34 % 128;
                int i35 = i34 % 2;
                tehsil tehsilVar = new tehsil(string, i30, cursorB.getInt(iW3), cursorB.getString(iW4));
                int i36 = (-2) - ((a + 100) ^ (-1));
                b = i36 % 128;
                int i37 = i36 % 2;
                arrayList.add(tehsilVar);
                int i38 = b;
                int i39 = i38 ^ 69;
                int i40 = ((i38 & 69) | i39) << 1;
                int i41 = -i39;
                int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
                a = i42 % 128;
                int i43 = i42 % 2;
                i13 = 0;
            }
            cursorB.close();
            aGVarD.h();
            int i44 = b;
            int i45 = i44 & 109;
            int i46 = (i45 - (~(-(-((i44 ^ 109) | i45))))) - 1;
            a = i46 % 128;
            if (i46 % 2 != 0) {
                int i47 = 4 / i13;
            }
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final long[] av(ArrayList<lib_mobile> arrayList) {
        lib_mobile next;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = (i2 | 123) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            this.e.e();
            obj.hashCode();
            throw null;
        }
        this.e.e();
        this.e.f();
        try {
            aD aDVar = this.q;
            SupportSQLiteStatement supportSQLiteStatementC = aDVar.c();
            int i7 = b;
            int i8 = (((i7 | 74) << 1) - (i7 ^ 74)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            try {
                long[] jArr = new long[arrayList.size()];
                int i10 = a;
                int i11 = ((i10 ^ 83) - (~(-(-((i10 & 83) << 1))))) - 1;
                b = i11 % 128;
                int i12 = i11 % 2;
                Iterator<lib_mobile> it = arrayList.iterator();
                int i13 = b + 13;
                a = i13 % 128;
                int i14 = i13 % 2;
                int i15 = 0;
                while (!(!it.hasNext())) {
                    int i16 = a;
                    int i17 = i16 & 63;
                    int i18 = (i16 | 63) & (~i17);
                    int i19 = i17 << 1;
                    int i20 = (i18 & i19) + (i18 | i19);
                    b = i20 % 128;
                    if (i20 % 2 == 0) {
                        next = it.next();
                        int i21 = 49 / 0;
                    } else {
                        next = it.next();
                    }
                    aDVar.h(supportSQLiteStatementC, next);
                    long jExecuteInsert = supportSQLiteStatementC.executeInsert();
                    int i22 = b + 100;
                    int i23 = (i22 ^ (-1)) + (i22 << 1);
                    int i24 = i23 % 128;
                    a = i24;
                    int i25 = i23 % 2;
                    jArr[i15] = jExecuteInsert;
                    i15 = ((i15 ^ 1) - (~((i15 & 1) << 1))) - 1;
                    int i26 = (i24 & (-8)) | ((~i24) & 7);
                    int i27 = (i24 & 7) << 1;
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
                aDVar.f(supportSQLiteStatementC);
                this.e.c();
                aI aIVar = this.e;
                int i30 = a;
                int i31 = i30 & 83;
                int i32 = i30 | 83;
                int i33 = (i31 & i32) + (i32 | i31);
                b = i33 % 128;
                if (i33 % 2 == 0) {
                    aIVar.h();
                    throw null;
                }
                aIVar.h();
                int i34 = b;
                int i35 = ((i34 ^ 87) | (i34 & 87)) << 1;
                int i36 = -(((~i34) & 87) | (i34 & (-88)));
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                a = i37 % 128;
                int i38 = i37 % 2;
                return jArr;
            } catch (Throwable th) {
                aDVar.f(supportSQLiteStatementC);
                throw th;
            }
        } catch (Throwable th2) {
            this.e.h();
            throw th2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void bj(NadraFamilyData nadraFamilyData) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 123) + ((i2 & 123) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.e.e();
            this.e.f();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.e.e();
        this.e.f();
        try {
            this.g.i(nadraFamilyData);
            aI aIVar = this.e;
            int i4 = b;
            int i5 = i4 & 19;
            int i6 = (i4 | 19) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            aIVar.c();
            this.e.h();
            int i10 = a + 89;
            b = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void bn(survey_count survey_countVar) {
        int i = 2 % 2;
        int i2 = a + 117;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.e.e();
        aI aIVar = this.e;
        int i4 = a + 101;
        b = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                aIVar.f();
                this.s.i(survey_countVar);
                int i5 = 23 / 0;
            } else {
                aIVar.f();
                this.s.i(survey_countVar);
            }
            int i6 = b;
            int i7 = (((i6 | 124) << 1) - (i6 ^ 124)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            this.e.c();
            aI aIVar2 = this.e;
            int i9 = b;
            int i10 = i9 & 29;
            int i11 = (((i9 | 29) & (~i10)) - (~(i10 << 1))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            aIVar2.h();
            int i13 = b;
            int i14 = i13 ^ 89;
            int i15 = -(-((i13 & 89) << 1));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void bu(List<IndividualNadraDataWithRelation> list) {
        aD aDVar;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 122) + (i2 | 122)) - 1;
        b = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                this.e.e();
                this.e.f();
                aDVar = this.f;
                int i4 = 46 / 0;
            } else {
                this.e.e();
                this.e.f();
                aDVar = this.f;
            }
            aDVar.g(list);
            this.e.c();
            this.e.h();
            int i5 = a;
            int i6 = i5 | 5;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 5)) & i6);
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$buj, reason: case insensitive filesystem */
    public class C0107buj extends aD {
        private static int a = 1;
        private static int b;

        public C0107buj(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 118) << 1) - (i2 ^ 118)) - 1;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                return "INSERT OR IGNORE INTO `district` (`id`,`distcode`,`divcode`,`provcode`,`district`) VALUES (?,?,?,?,?)";
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 31) + (i2 | 31);
            a = i3 % 128;
            int i4 = i3 % 2;
            district districtVar = (district) obj;
            String str = districtVar.id;
            if (str == null) {
                int i5 = a;
                int i6 = i5 & 35;
                int i7 = -(-((i5 ^ 35) | i6));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
                int i10 = b;
                int i11 = (i10 & (-32)) | ((~i10) & 31);
                int i12 = -(-((i10 & 31) << 1));
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
            supportSQLiteStatement.bindLong(2, districtVar.distcode);
            int i15 = b;
            int i16 = ((i15 ^ 110) + ((i15 & 110) << 1)) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            supportSQLiteStatement.bindLong(3, districtVar.divcode);
            int i18 = districtVar.provcode;
            int i19 = b;
            int i20 = i19 & 19;
            int i21 = ((i19 ^ 19) | i20) << 1;
            int i22 = -((i19 | 19) & (~i20));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            supportSQLiteStatement.bindLong(4, i18);
            String str2 = districtVar.district;
            if (str2 == null) {
                int i25 = b;
                int i26 = i25 & 7;
                int i27 = ((i25 ^ 7) | i26) << 1;
                int i28 = -((i25 | 7) & (~i26));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                a = i29 % 128;
                int i30 = i29 % 2;
                supportSQLiteStatement.bindNull(5);
                return;
            }
            supportSQLiteStatement.bindString(5, str2);
            int i31 = a;
            int i32 = (i31 & (-120)) | ((~i31) & 119);
            int i33 = (i31 & 119) << 1;
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            b = i34 % 128;
            if (i34 % 2 != 0) {
                int i35 = 74 / 0;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void N(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 50) + ((i3 & 50) << 1)) - 1;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            this.e.e();
            this.x.c();
            obj.hashCode();
            throw null;
        }
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.x.c();
        int i5 = b;
        int i6 = i5 & 5;
        int i7 = i6 + ((i5 ^ 5) | i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            supportSQLiteStatementC.bindLong(0, i);
        } else {
            supportSQLiteStatementC.bindLong(1, i);
        }
        int i8 = b;
        int i9 = i8 & 1;
        int i10 = ((((i8 ^ 1) | i9) << 1) - (~(-((i8 | 1) & (~i9))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        this.e.f();
        try {
            supportSQLiteStatementC.executeUpdateDelete();
            int i12 = a;
            int i13 = i12 ^ 119;
            int i14 = -(-((i12 & 119) << 1));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            this.e.c();
            this.e.h();
            int i17 = b;
            int i18 = ((i17 ^ 13) | (i17 & 13)) << 1;
            int i19 = -(((~i17) & 13) | (i17 & (-14)));
            int i20 = (i18 & i19) + (i19 | i18);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                SupportSQLiteStatement supportSQLiteStatement = this.x.e;
                obj.hashCode();
                throw null;
            }
            aC aCVar = this.x;
            if (supportSQLiteStatementC == aCVar.e) {
                int i21 = a;
                int i22 = (i21 & 81) + (i21 | 81);
                b = i22 % 128;
                int i23 = i22 % 2;
                aCVar.c.set(false);
            }
            int i24 = a;
            int i25 = ((i24 & 105) - (~(i24 | 105))) - 1;
            b = i25 % 128;
            if (i25 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            aC aCVar2 = this.x;
            if (supportSQLiteStatementC == aCVar2.e) {
                aCVar2.c.set(false);
                int i26 = a;
                int i27 = (i26 ^ 106) + ((i26 & 106) << 1);
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
            }
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final int aq() {
        aG aGVarD;
        aI aIVar;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 83) | (i3 & 83)) << 1;
        int i5 = -(((~i3) & 83) | (i3 & (-84)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            aGVarD = aG.d("SELECT Count(*) FROM villages", 1);
            aIVar = this.e;
            i = 1;
        } else {
            aGVarD = aG.d("SELECT Count(*) FROM villages", 0);
            aIVar = this.e;
            i = 0;
        }
        int i7 = a;
        int i8 = i7 & 89;
        int i9 = i8 + ((i7 ^ 89) | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        aIVar.e();
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i11 = b;
        int i12 = ((i11 ^ 22) + ((i11 & 22) << 1)) - 1;
        a = i12 % 128;
        try {
            if (i12 % 2 != 0) {
                int i13 = 50 / 0;
                if (cursorB.moveToFirst()) {
                    int i14 = b;
                    int i15 = (-2) - (((i14 ^ 86) + ((i14 & 86) << 1)) ^ (-1));
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    i = cursorB.getInt(0);
                    int i17 = a;
                    int i18 = (-2) - (((i17 & 44) + (i17 | 44)) ^ (-1));
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }
            } else if (!(!cursorB.moveToFirst())) {
                int i110 = b;
                int i111 = (-2) - (((i110 ^ 86) + ((i110 & 86) << 1)) ^ (-1));
                a = i111 % 128;
                int i112 = i111 % 2;
                i = cursorB.getInt(0);
                int i113 = a;
                int i114 = (-2) - (((i113 & 44) + (i113 | 44)) ^ (-1));
                b = i114 % 128;
                int i115 = i114 % 2;
            }
            cursorB.close();
            aGVarD.h();
            int i20 = a;
            int i21 = i20 ^ 59;
            int i22 = -(-((i20 & 59) << 1));
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            int i24 = i23 % 2;
            return i;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<BeneficiaryEntity> ar() {
        boolean z;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = a + 69;
        b = i3 % 128;
        int i4 = i3 % 2;
        aG aGVarD = aG.d("SELECT * FROM beneficiary", 0);
        this.e.e();
        int i5 = b;
        int i6 = (((i5 & (-104)) | ((~i5) & 103)) - (~(-(-((i5 & 103) << 1))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i8 = b;
        int i9 = (i8 & 15) + (i8 | 15);
        a = i9 % 128;
        try {
            if (i9 % 2 != 0) {
                r.w(cursorB, "cnic");
                r.w(cursorB, "english_name");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iW = r.w(cursorB, "cnic");
            int iW2 = r.w(cursorB, "english_name");
            int iW3 = r.w(cursorB, "urdu_name");
            int i10 = a;
            int i11 = ((i10 | 39) << 1) - (i10 ^ 39);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                r.w(cursorB, "marital_status");
                r.w(cursorB, "gender");
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int iW4 = r.w(cursorB, "marital_status");
            int iW5 = r.w(cursorB, "gender");
            int iW6 = r.w(cursorB, "age");
            int iW7 = r.w(cursorB, "dob");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i12 = a;
            int i13 = (((i12 | 38) << 1) - (i12 ^ 38)) - 1;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 4;
            }
            while (cursorB.moveToNext()) {
                BeneficiaryEntity beneficiaryEntity = new BeneficiaryEntity();
                String string = cursorB.getString(iW);
                int i15 = a;
                int i16 = ((i15 | 67) << 1) - (i15 ^ 67);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    beneficiaryEntity.nic = string;
                    beneficiaryEntity.englishName = cursorB.getString(iW2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                beneficiaryEntity.nic = string;
                beneficiaryEntity.englishName = cursorB.getString(iW2);
                beneficiaryEntity.urduName = cursorB.getString(iW3);
                int i17 = a;
                int i18 = ((i17 ^ 116) + ((i17 & 116) << 1)) - 1;
                b = i18 % 128;
                int i19 = i18 % 2;
                beneficiaryEntity.maritalStatus = cursorB.getInt(iW4);
                int i20 = a + 81;
                b = i20 % 128;
                if (i20 % i == 0) {
                    beneficiaryEntity.gender = cursorB.getString(iW5);
                    throw null;
                }
                beneficiaryEntity.gender = cursorB.getString(iW5);
                beneficiaryEntity.age = cursorB.getDouble(iW6);
                String string2 = cursorB.getString(iW7);
                int i21 = b;
                int i22 = i21 & 17;
                int i23 = (i21 ^ 17) | i22;
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    beneficiaryEntity.dob = string2;
                    arrayList.add(beneficiaryEntity);
                    z = false;
                    int i25 = 72 / 0;
                } else {
                    z = false;
                    beneficiaryEntity.dob = string2;
                    arrayList.add(beneficiaryEntity);
                }
                int i26 = b;
                int i27 = i26 & 105;
                int i28 = (i26 | 105) & (~i27);
                int i29 = i27 << 1;
                int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                a = i30 % 128;
                int i31 = i30 % 2;
                i = 2;
            }
            cursorB.close();
            aGVarD.h();
            int i32 = b;
            int i33 = ((((i32 ^ 75) | (i32 & 75)) << 1) - (~(-(((~i32) & 75) | (i32 & (-76)))))) - 1;
            int i34 = i33 % 128;
            a = i34;
            int i35 = i33 % 2;
            int i36 = (i34 & 31) + (i34 | 31);
            b = i36 % 128;
            if (i36 % 2 != 0) {
                return arrayList;
            }
            throw null;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<IndividualNadraDataWithRelation> Q() {
        String string;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (i3 - (~((i2 ^ 25) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        aG aGVarD = aG.d("SELECT * FROM individualNadraDataWithRelation", 0);
        this.e.e();
        int i6 = a;
        int i7 = ((i6 ^ 65) - (~((i6 & 65) << 1))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i9 = b;
        int i10 = i9 & 39;
        int i11 = ((i9 ^ 39) | i10) << 1;
        int i12 = -((i9 | 39) & (~i10));
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        try {
            int iW = r.w(cursorB, "cnic");
            int iW2 = r.w(cursorB, "name");
            int i15 = a;
            int i16 = ((i15 | 11) << 1) - (((~i15) & 11) | (i15 & (-12)));
            b = i16 % 128;
            int i17 = i16 % 2;
            int iW3 = r.w(cursorB, "relation_with_self");
            int iW4 = r.w(cursorB, "father_name");
            int i18 = a;
            int i19 = (i18 ^ 29) + ((i18 & 29) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            int iW5 = r.w(cursorB, "father_nic");
            int iW6 = r.w(cursorB, "mother_name");
            int i21 = b;
            int i22 = (i21 & 61) + (i21 | 61);
            a = i22 % 128;
            int i23 = i22 % 2;
            int iW7 = r.w(cursorB, "mother_nic");
            int iW8 = r.w(cursorB, "spouse_name");
            int iW9 = r.w(cursorB, "spouse_nic");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i24 = a;
            int i25 = i24 ^ 37;
            int i26 = (i24 & 37) << 1;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
            while (cursorB.moveToNext()) {
                IndividualNadraDataWithRelation individualNadraDataWithRelation = new IndividualNadraDataWithRelation();
                String string2 = cursorB.getString(iW);
                int i29 = b;
                int i30 = i29 | 43;
                int i31 = ((i30 << 1) - (~(-((~(i29 & 43)) & i30)))) - 1;
                a = i31 % 128;
                int i32 = i31 % 2;
                individualNadraDataWithRelation.cnic = string2;
                individualNadraDataWithRelation.name = cursorB.getString(iW2);
                int i33 = b + 57;
                a = i33 % 128;
                if (i33 % 2 != 0) {
                    individualNadraDataWithRelation.relationWithSelf = cursorB.getString(iW3);
                    string = cursorB.getString(iW4);
                    int i34 = 67 / 0;
                } else {
                    individualNadraDataWithRelation.relationWithSelf = cursorB.getString(iW3);
                    string = cursorB.getString(iW4);
                }
                individualNadraDataWithRelation.fatherName = string;
                individualNadraDataWithRelation.fatherNic = cursorB.getString(iW5);
                int i35 = a;
                int i36 = (i35 & 117) + (i35 | 117);
                b = i36 % 128;
                int i37 = i36 % 2;
                individualNadraDataWithRelation.motherName = cursorB.getString(iW6);
                int i38 = a + 59;
                b = i38 % 128;
                if (i38 % 2 == 0) {
                    individualNadraDataWithRelation.motherNic = cursorB.getString(iW7);
                    cursorB.getString(iW8);
                    throw null;
                }
                individualNadraDataWithRelation.motherNic = cursorB.getString(iW7);
                String string3 = cursorB.getString(iW8);
                int i39 = b;
                int i40 = i39 & 13;
                int i41 = iW;
                int i42 = (((i39 | 13) & (~i40)) - (~(-(-(i40 << 1))))) - 1;
                a = i42 % 128;
                int i43 = i42 % 2;
                individualNadraDataWithRelation.spouseName = string3;
                individualNadraDataWithRelation.spouseNic = cursorB.getString(iW9);
                int i44 = a;
                int i45 = i44 & 37;
                int i46 = ((i44 ^ 37) | i45) << 1;
                int i47 = -((i44 | 37) & (~i45));
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                b = i48 % 128;
                if (i48 % 2 == 0) {
                    arrayList.add(individualNadraDataWithRelation);
                    throw null;
                }
                arrayList.add(individualNadraDataWithRelation);
                iW = i41;
            }
            cursorB.close();
            aGVarD.h();
            int i49 = a + 101;
            b = i49 % 128;
            if (i49 % 2 == 0) {
                int i50 = 79 / 0;
            }
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<not_at_home> X() {
        long j;
        String string;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 87;
        int i4 = ((i2 & 87) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        aG aGVarD = aG.d("SELECT * FROM not_at_home", 0);
        this.e.e();
        int i8 = b;
        int i9 = ((i8 & (-14)) | ((~i8) & 13)) + ((i8 & 13) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        try {
            int iW = r.w(cursorB, "id");
            int iW2 = r.w(cursorB, "data");
            int iW3 = r.w(cursorB, "count");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i11 = b;
            int i12 = ((i11 | 81) << 1) - (i11 ^ 81);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 5 % 2;
            }
            while (cursorB.moveToNext()) {
                int i14 = a;
                int i15 = (i14 ^ 63) + ((i14 & 63) << 1);
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    j = cursorB.getLong(iW);
                    string = cursorB.getString(iW2);
                    int i16 = 5 / 0;
                } else {
                    j = cursorB.getLong(iW);
                    string = cursorB.getString(iW2);
                }
                not_at_home not_at_homeVar = new not_at_home(j, string, cursorB.getInt(iW3));
                int i17 = b + 11;
                a = i17 % 128;
                int i18 = i17 % 2;
                arrayList.add(not_at_homeVar);
                int i19 = a;
                int i20 = i19 & 79;
                int i21 = ((((i19 ^ 79) | i20) << 1) - (~(-((i19 | 79) & (~i20))))) - 1;
                b = i21 % 128;
                int i22 = i21 % 2;
            }
            cursorB.close();
            aGVarD.h();
            int i23 = a;
            int i24 = (i23 & (-6)) | ((~i23) & 5);
            int i25 = (i23 & 5) << 1;
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            int i27 = i26 % 2;
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [android.database.Cursor, ivas.gov.bisp.enumeration.J.aI] */
    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<offlinesurvey> Y() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 7;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 7)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        aG aGVarD = i6 % 2 != 0 ? aG.d("SELECT id, data FROM offlinesurvey order by length(data) limit 1", 1) : aG.d("SELECT id, data FROM offlinesurvey order by length(data) limit 1", 0);
        this.e.e();
        int i7 = b;
        int i8 = i7 & 85;
        int i9 = (i7 ^ 85) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        this.e.f();
        try {
            ?? r2 = this.e;
            int i12 = a;
            int i13 = ((i12 & 38) + (i12 | 38)) - 1;
            b = i13 % 128;
            Object obj = null;
            try {
                if (i13 % 2 == 0) {
                    r.w(aq.b(r2, aGVarD, false, null), "id");
                    obj.hashCode();
                    throw null;
                }
                Cursor cursorB = aq.b(r2, aGVarD, false, null);
                int iW = r.w(cursorB, "id");
                int iW2 = r.w(cursorB, "data");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                int i14 = a;
                int i15 = i14 ^ 9;
                int i16 = ((((i14 & 9) | i15) << 1) - (~(-i15))) - 1;
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 3 % 5;
                }
                while (!(!cursorB.moveToNext())) {
                    int i18 = b;
                    int i19 = i18 & 111;
                    int i20 = ((i18 | 111) & (~i19)) + (i19 << 1);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    offlinesurvey offlinesurveyVar = new offlinesurvey(cursorB.getLong(iW), cursorB.getString(iW2));
                    int i22 = a;
                    int i23 = i22 & 31;
                    int i24 = (i23 - (~((i22 ^ 31) | i23))) - 1;
                    b = i24 % 128;
                    if (i24 % 2 == 0) {
                        arrayList.add(offlinesurveyVar);
                        int i25 = 62 / 0;
                    } else {
                        arrayList.add(offlinesurveyVar);
                    }
                    int i26 = a;
                    int i27 = (i26 ^ 32) + ((i26 & 32) << 1);
                    int i28 = (i27 ^ (-1)) + (i27 << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
                this.e.c();
                cursorB.close();
                int i30 = b;
                int i31 = ((i30 | 91) << 1) - (i30 ^ 91);
                a = i31 % 128;
                int i32 = i31 % 2;
                aGVarD.h();
                this.e.h();
                int i33 = a;
                int i34 = i33 & 125;
                int i35 = -(-((i33 ^ 125) | i34));
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                b = i36 % 128;
                if (i36 % 2 != 0) {
                    return arrayList;
                }
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                r2.close();
                aGVarD.h();
                throw th;
            }
        } catch (Throwable th2) {
            this.e.h();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$buo, reason: case insensitive filesystem */
    public class C0112buo extends aD {
        private static int a = 1;
        private static int b;

        public C0112buo(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b + 37;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            int i5 = i3 & 125;
            int i6 = (i5 - (~((i3 ^ 125) | i5))) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 81 / 0;
            }
            return "INSERT OR REPLACE INTO `lib_mobile` (`prefix`,`provider`,`operator_code`,`idate`) VALUES (?,?,?,?)";
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 94) + (i2 | 94)) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                String str = ((lib_mobile) obj).prefix;
                throw null;
            }
            lib_mobile lib_mobileVar = (lib_mobile) obj;
            String str2 = lib_mobileVar.prefix;
            if (str2 == null) {
                int i4 = a;
                int i5 = i4 & 111;
                int i6 = i4 | 111;
                int i7 = (i5 & i6) + (i6 | i5);
                b = i7 % 128;
                int i8 = i7 % 2;
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str2);
                int i9 = a;
                int i10 = i9 & 23;
                int i11 = (i10 - (~(-(-((i9 ^ 23) | i10))))) - 1;
                b = i11 % 128;
                int i12 = i11 % 2;
            }
            String str3 = lib_mobileVar.provider;
            if (str3 == null) {
                int i13 = a;
                int i14 = ((i13 | 121) << 1) - (i13 ^ 121);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindNull(2);
                }
            } else {
                supportSQLiteStatement.bindString(2, str3);
                int i15 = a + 25;
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 3 % 3;
                }
            }
            supportSQLiteStatement.bindLong(3, lib_mobileVar.operatorCode);
            int i17 = a + 51;
            b = i17 % 128;
            int i18 = i17 % 2;
            String str4 = lib_mobileVar.idate;
            if (str4 != null) {
                supportSQLiteStatement.bindString(4, str4);
                int i19 = b;
                int i20 = ((i19 & 49) - (~(-(-(i19 | 49))))) - 1;
                a = i20 % 128;
                int i21 = i20 % 2;
                return;
            }
            int i22 = b;
            int i23 = (((i22 ^ 49) | (i22 & 49)) << 1) - (((~i22) & 49) | (i22 & (-50)));
            a = i23 % 128;
            if (i23 % 2 == 0) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindNull(4);
            }
            int i24 = a;
            int i25 = i24 & 85;
            int i26 = ((((i24 ^ 85) | i25) << 1) - (~(-((i24 | 85) & (~i25))))) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<TabletLogEntity> ab() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = ((((i2 ^ 3) | i3) << 1) - (~(-((i2 | 3) & (~i3))))) - 1;
        a = i4 % 128;
        aG aGVarD = i4 % 2 != 0 ? aG.d("SELECT * FROM tablet_log_data ", 0) : aG.d("SELECT * FROM tablet_log_data ", 0);
        this.e.e();
        int i5 = b;
        int i6 = i5 & 49;
        int i7 = i6 + ((i5 ^ 49) | i6);
        a = i7 % 128;
        Cursor cursorB = i7 % 2 != 0 ? aq.b(this.e, aGVarD, true, null) : aq.b(this.e, aGVarD, false, null);
        try {
            int iW = r.w(cursorB, "id");
            int iW2 = r.w(cursorB, "tablet_log_json");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i8 = a;
            int i9 = (i8 ^ 109) + ((i8 & 109) << 1);
            b = i9 % 128;
            while (true) {
                int i10 = i9 % 2;
                if (!cursorB.moveToNext()) {
                    cursorB.close();
                    aGVarD.h();
                    int i11 = a + 53;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    return arrayList;
                }
                TabletLogEntity tabletLogEntity = new TabletLogEntity();
                int i13 = b;
                int i14 = (i13 ^ 71) + ((i13 & 71) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                tabletLogEntity.id = cursorB.getInt(iW);
                int i16 = a;
                int i17 = i16 ^ 53;
                int i18 = (i16 & 53) << 1;
                int i19 = (i17 & i18) + (i18 | i17);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    tabletLogEntity.tabletLogJson = cursorB.getString(iW2);
                    int i20 = 20 / 0;
                } else {
                    tabletLogEntity.tabletLogJson = cursorB.getString(iW2);
                }
                int i21 = a + 103;
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    arrayList.add(tabletLogEntity);
                    throw null;
                }
                arrayList.add(tabletLogEntity);
                int i22 = a + 108;
                i9 = (i22 ^ (-1)) + (i22 << 1);
                b = i9 % 128;
            }
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bE.S$bur, reason: case insensitive filesystem */
    public class C0115bur extends aD {
        private static int a = 1;
        private static int b;

        public C0115bur(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-66)) | ((~i2) & 65);
            int i4 = -(-((i2 & 65) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 33;
            a = i8 % 128;
            int i9 = i8 % 2;
            return "INSERT OR REPLACE INTO `individualNadraDataWithRelation` (`cnic`,`name`,`relation_with_self`,`father_name`,`father_nic`,`mother_name`,`mother_nic`,`spouse_name`,`spouse_nic`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            IndividualNadraDataWithRelation individualNadraDataWithRelation = (IndividualNadraDataWithRelation) obj;
            String str = individualNadraDataWithRelation.cnic;
            if (str == null) {
                int i5 = b;
                int i6 = i5 & 9;
                int i7 = -(-(i5 | 9));
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                a = i8 % 128;
                int i9 = i8 % 2;
                supportSQLiteStatement.bindNull(1);
                int i10 = a;
                int i11 = i10 & 103;
                int i12 = i11 + ((i10 ^ 103) | i11);
                b = i12 % 128;
                int i13 = i12 % 2;
            } else {
                supportSQLiteStatement.bindString(1, str);
                int i14 = a;
                int i15 = i14 & 111;
                int i16 = ((((i14 ^ 111) | i15) << 1) - (~(-((i14 | 111) & (~i15))))) - 1;
                b = i16 % 128;
                int i17 = i16 % 2;
            }
            String str2 = individualNadraDataWithRelation.name;
            if (str2 == null) {
                int i18 = a;
                int i19 = (i18 & 45) + (i18 | 45);
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindNull(2);
                }
            } else {
                supportSQLiteStatement.bindString(2, str2);
                int i20 = b;
                int i21 = (-2) - (((i20 & 104) + (i20 | 104)) ^ (-1));
                a = i21 % 128;
                int i22 = i21 % 2;
            }
            String str3 = individualNadraDataWithRelation.relationWithSelf;
            if (str3 == null) {
                int i23 = a + 32;
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
                supportSQLiteStatement.bindNull(3);
                int i26 = a;
                int i27 = i26 & 1;
                int i28 = i27 + ((i26 ^ 1) | i27);
                b = i28 % 128;
                int i29 = i28 % 2;
            } else {
                supportSQLiteStatement.bindString(3, str3);
                int i30 = a;
                int i31 = (((i30 ^ 83) | (i30 & 83)) << 1) - (((~i30) & 83) | (i30 & (-84)));
                b = i31 % 128;
                int i32 = i31 % 2;
            }
            String str4 = individualNadraDataWithRelation.fatherName;
            if (str4 == null) {
                int i33 = b;
                int i34 = (i33 & (-68)) | ((~i33) & 67);
                int i35 = (i33 & 67) << 1;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                a = i36 % 128;
                int i37 = i36 % 2;
                supportSQLiteStatement.bindNull(4);
                int i38 = b;
                int i39 = (i38 & (-112)) | ((~i38) & 111);
                int i40 = (i38 & 111) << 1;
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                a = i41 % 128;
                int i42 = i41 % 2;
            } else {
                supportSQLiteStatement.bindString(4, str4);
                int i43 = b;
                int i44 = i43 & 31;
                int i45 = (i43 | 31) & (~i44);
                int i46 = -(-(i44 << 1));
                int i47 = (i45 & i46) + (i45 | i46);
                a = i47 % 128;
                int i48 = i47 % 2;
            }
            String str5 = individualNadraDataWithRelation.fatherNic;
            if (str5 == null) {
                int i49 = a;
                int i50 = (i49 ^ 15) + ((i49 & 15) << 1);
                b = i50 % 128;
                int i51 = i50 % 2;
                supportSQLiteStatement.bindNull(5);
                int i52 = b + 84;
                int i53 = (i52 ^ (-1)) + (i52 << 1);
                a = i53 % 128;
                if (i53 % 2 == 0) {
                    int i54 = 5 % 3;
                }
            } else {
                supportSQLiteStatement.bindString(5, str5);
                int i55 = a;
                int i56 = ((i55 ^ 79) | (i55 & 79)) << 1;
                int i57 = -(((~i55) & 79) | (i55 & (-80)));
                int i58 = (i56 & i57) + (i57 | i56);
                b = i58 % 128;
                int i59 = i58 % 2;
            }
            String str6 = individualNadraDataWithRelation.motherName;
            if (str6 == null) {
                int i60 = (-2) - ((b + 10) ^ (-1));
                a = i60 % 128;
                int i61 = i60 % 2;
                supportSQLiteStatement.bindNull(6);
                int i62 = b;
                int i63 = i62 & 79;
                int i64 = ((i62 ^ 79) | i63) << 1;
                int i65 = -((i62 | 79) & (~i63));
                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                a = i66 % 128;
                int i67 = i66 % 2;
            } else {
                supportSQLiteStatement.bindString(6, str6);
                int i68 = a;
                int i69 = i68 & 7;
                int i70 = ((i68 | 7) & (~i69)) + (i69 << 1);
                b = i70 % 128;
                int i71 = i70 % 2;
            }
            String str7 = individualNadraDataWithRelation.motherNic;
            if (str7 == null) {
                int i72 = b;
                int i73 = i72 & 35;
                int i74 = i73 + ((i72 ^ 35) | i73);
                a = i74 % 128;
                int i75 = i74 % 2;
                supportSQLiteStatement.bindNull(7);
                int i76 = b + 117;
                a = i76 % 128;
                if (i76 % 2 == 0) {
                    int i77 = 3 % 4;
                }
            } else {
                supportSQLiteStatement.bindString(7, str7);
                int i78 = a;
                int i79 = i78 & 45;
                int i80 = ((i78 ^ 45) | i79) << 1;
                int i81 = -((i78 | 45) & (~i79));
                int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                b = i82 % 128;
                int i83 = i82 % 2;
            }
            String str8 = individualNadraDataWithRelation.spouseName;
            if (str8 == null) {
                int i84 = b;
                int i85 = i84 & 75;
                int i86 = i85 + ((i84 ^ 75) | i85);
                a = i86 % 128;
                if (i86 % 2 == 0) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindNull(8);
                }
            } else {
                supportSQLiteStatement.bindString(8, str8);
                int i87 = a;
                int i88 = ((i87 ^ 25) | (i87 & 25)) << 1;
                int i89 = -(((~i87) & 25) | (i87 & (-26)));
                int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                b = i90 % 128;
                int i91 = i90 % 2;
            }
            String str9 = individualNadraDataWithRelation.spouseNic;
            if (str9 != null) {
                supportSQLiteStatement.bindString(9, str9);
                int i92 = a;
                int i93 = i92 & 105;
                int i94 = -(-((i92 ^ 105) | i93));
                int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                b = i95 % 128;
                int i96 = i95 % 2;
                return;
            }
            int i97 = b + 119;
            a = i97 % 128;
            int i98 = i97 % 2;
            supportSQLiteStatement.bindNull(9);
            int i99 = b;
            int i100 = ((i99 | 51) << 1) - (i99 ^ 51);
            a = i100 % 128;
            if (i100 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<offline_survey_count> W() {
        int i = 2 % 2;
        int i2 = a + 25;
        b = i2 % 128;
        aG aGVarD = i2 % 2 == 0 ? aG.d("SELECT * FROM offline_survey_count", 1) : aG.d("SELECT * FROM offline_survey_count", 0);
        aI aIVar = this.e;
        int i3 = b;
        int i4 = i3 & 81;
        int i5 = i3 | 81;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        aIVar.e();
        Object obj = null;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i8 = (-2) - ((b + 36) ^ (-1));
        a = i8 % 128;
        int i9 = i8 % 2;
        try {
            int iW = r.w(cursorB, "id");
            int i10 = a + 115;
            b = i10 % 128;
            int i11 = i10 % 2;
            int iW2 = r.w(cursorB, "sync_count");
            int iW3 = r.w(cursorB, "not_sync_count");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i12 = a;
            int i13 = ((i12 & 88) + (i12 | 88)) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            while (cursorB.moveToNext()) {
                int i15 = b + 19;
                a = i15 % 128;
                int i16 = i15 % 2;
                offline_survey_count offline_survey_countVar = new offline_survey_count(cursorB.getLong(iW), cursorB.getInt(iW2), cursorB.getInt(iW3));
                int i17 = b;
                int i18 = i17 & 29;
                int i19 = i18 + ((i17 ^ 29) | i18);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    arrayList.add(offline_survey_countVar);
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(offline_survey_countVar);
            }
            cursorB.close();
            aGVarD.h();
            int i20 = b;
            int i21 = ((i20 ^ 65) | (i20 & 65)) << 1;
            int i22 = -(((~i20) & 65) | (i20 & (-66)));
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            int i24 = i23 % 2;
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<uc> aj(int i) {
        aI aIVar;
        int iW;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 81) << 1) - (i3 ^ 81);
        b = i4 % 128;
        aG aGVarD = i4 % 2 == 0 ? aG.d("SELECT * FROM uc where tehsilcode=?", 0) : aG.d("SELECT * FROM uc where tehsilcode=?", 1);
        aGVarD.bindLong(1, i);
        aI aIVar2 = this.e;
        int i5 = b;
        int i6 = (i5 & 83) + (i5 | 83);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            aIVar2.e();
            aIVar = this.e;
        } else {
            aIVar2.e();
            aIVar = this.e;
        }
        Cursor cursorB = aq.b(aIVar, aGVarD, false, null);
        int i7 = a + 71;
        b = i7 % 128;
        int i8 = 37;
        try {
            if (i7 % 2 == 0) {
                iW = r.w(cursorB, "tehsilcode");
                int i9 = 37 / 0;
            } else {
                iW = r.w(cursorB, "tehsilcode");
            }
            int iW2 = r.w(cursorB, "uc");
            int i10 = a;
            int i11 = (-2) - (((i10 ^ 104) + ((i10 & 104) << 1)) ^ (-1));
            b = i11 % 128;
            int i12 = i11 % 2;
            int iW3 = r.w(cursorB, "uccode");
            int iW4 = r.w(cursorB, "ucno");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i13 = b;
            int i14 = (((i13 ^ 13) | (i13 & 13)) << 1) - (((~i13) & 13) | (i13 & (-14)));
            a = i14 % 128;
            int i15 = i14 % 2;
            while (cursorB.moveToNext()) {
                int i16 = b;
                int i17 = i16 & 37;
                int i18 = (i16 | i8) & (~i17);
                int i19 = i17 << 1;
                int i20 = (i18 & i19) + (i18 | i19);
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    cursorB.getInt(iW);
                    cursorB.getString(iW2);
                    throw null;
                }
                int i21 = cursorB.getInt(iW);
                String string = cursorB.getString(iW2);
                int i22 = b;
                int i23 = ((57 & (~i22)) | (i22 & (-58))) + ((i22 & 57) << 1);
                a = i23 % 128;
                int i24 = i23 % 2;
                uc ucVar = new uc(string, i21, cursorB.getInt(iW3), cursorB.getInt(iW4));
                int i25 = b;
                int i26 = ((i25 & (-16)) | ((~i25) & 15)) + ((i25 & 15) << 1);
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    arrayList.add(ucVar);
                    throw null;
                }
                arrayList.add(ucVar);
                i8 = 37;
            }
            cursorB.close();
            aGVarD.h();
            int i27 = a;
            int i28 = i27 & 113;
            int i29 = (i27 | 113) & (~i28);
            int i30 = -(-(i28 << 1));
            int i31 = (i29 & i30) + (i29 | i30);
            b = i31 % 128;
            int i32 = i31 % 2;
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final long an() {
        long j;
        int i = 2 % 2;
        int i2 = a + 5;
        b = i2 % 128;
        int i3 = i2 % 2;
        aG aGVarD = aG.d("SELECT length(data) FROM survey order by length(data) limit 1", 0);
        aI aIVar = this.e;
        int i4 = a;
        int i5 = ((i4 | 69) << 1) - (i4 ^ 69);
        b = i5 % 128;
        int i6 = i5 % 2;
        aIVar.e();
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i7 = b;
        int i8 = ((i7 | 53) << 1) - (i7 ^ 53);
        a = i8 % 128;
        int i9 = i8 % 2;
        try {
            if (!cursorB.moveToFirst()) {
                int i10 = a;
                int i11 = (i10 & 27) + (i10 | 27);
                b = i11 % 128;
                int i12 = i11 % 2;
                j = 0;
            } else {
                int i13 = a;
                int i14 = ((i13 & 94) + (i13 | 94)) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
                j = cursorB.getLong(0);
                int i16 = b + 64;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            cursorB.close();
            aGVarD.h();
            int i19 = b;
            int i20 = i19 & 85;
            int i21 = (i19 ^ 85) | i20;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 42 / 0;
            }
            return j;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void M() {
        int i = 2 % 2;
        int i2 = a + 91;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.F.c();
        int i4 = b + 115;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.e.f();
        try {
            supportSQLiteStatementC.executeUpdateDelete();
            int i6 = a;
            int i7 = i6 & 83;
            int i8 = -(-((i6 ^ 83) | i7));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            Object obj = null;
            if (i9 % 2 == 0) {
                this.e.c();
                this.e.h();
                obj.hashCode();
                throw null;
            }
            this.e.c();
            this.e.h();
            int i10 = a;
            int i11 = ((i10 | 61) << 1) - (i10 ^ 61);
            b = i11 % 128;
            int i12 = i11 % 2;
            aC aCVar = this.F;
            if (supportSQLiteStatementC == aCVar.e) {
                int i13 = b + 107;
                a = i13 % 128;
                int i14 = i13 % 2;
                aCVar.c.set(false);
                int i15 = a + 87;
                b = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = a;
            int i18 = i17 & 9;
            int i19 = ((i17 | 9) & (~i18)) + (i18 << 1);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.e.h();
            this.F.f(supportSQLiteStatementC);
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<NadraFamilyData> V() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 85;
        int i4 = ((i2 & 85) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        aG aGVarD = i6 % 2 == 0 ? aG.d("SELECT * FROM nadraFamilyData ", 0) : aG.d("SELECT * FROM nadraFamilyData ", 0);
        this.e.e();
        Object obj = null;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i7 = b;
        int i8 = i7 & 83;
        int i9 = ((((i7 ^ 83) | i8) << 1) - (~(-((i7 | 83) & (~i8))))) - 1;
        a = i9 % 128;
        try {
            if (i9 % 2 != 0) {
                r.w(cursorB, "cnic");
                r.w(cursorB, "urdu_name");
                obj.hashCode();
                throw null;
            }
            int iW = r.w(cursorB, "cnic");
            int iW2 = r.w(cursorB, "urdu_name");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i10 = a + 125;
            b = i10 % 128;
            int i11 = i10 % 2;
            while (cursorB.moveToNext()) {
                NadraFamilyData nadraFamilyData = new NadraFamilyData();
                int i12 = b + 29;
                a = i12 % 128;
                int i13 = i12 % 2;
                nadraFamilyData.nic = cursorB.getString(iW);
                String string = cursorB.getString(iW2);
                int i14 = a;
                int i15 = i14 & 35;
                int i16 = (i14 | 35) & (~i15);
                int i17 = -(-(i15 << 1));
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    nadraFamilyData.urduName = string;
                    arrayList.add(nadraFamilyData);
                    throw null;
                }
                nadraFamilyData.urduName = string;
                arrayList.add(nadraFamilyData);
            }
            cursorB.close();
            aGVarD.h();
            int i19 = b;
            int i20 = i19 ^ 45;
            int i21 = ((i19 & 45) | i20) << 1;
            int i22 = -i20;
            int i23 = (i21 & i22) + (i21 | i22);
            a = i23 % 128;
            if (i23 % 2 == 0) {
                return arrayList;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<question_options> ah(String str) {
        int iW;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = (i2 ^ 23) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        aG aGVarD = aG.d("SELECT * FROM question_options where question=? order by sort_order asc", 1);
        if (str == null) {
            int i7 = b;
            int i8 = ((i7 & 94) + (i7 | 94)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            aGVarD.bindNull(1);
            int i10 = b;
            int i11 = (i10 & (-88)) | ((~i10) & 87);
            int i12 = -(-((i10 & 87) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
        } else {
            aGVarD.bindString(1, str);
            int i15 = a;
            int i16 = ((i15 ^ 57) | (i15 & 57)) << 1;
            int i17 = -(((~i15) & 57) | (i15 & (-58)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        this.e.e();
        aI aIVar = this.e;
        int i20 = b;
        int i21 = i20 & 103;
        int i22 = i21 + ((i20 ^ 103) | i21);
        a = i22 % 128;
        int i23 = i22 % 2;
        Cursor cursorB = aq.b(aIVar, aGVarD, false, null);
        int i24 = a;
        int i25 = ((i24 & 73) - (~(-(-(i24 | 73))))) - 1;
        b = i25 % 128;
        int i26 = i25 % 2;
        try {
            int iW2 = r.w(cursorB, "option_id");
            int iW3 = r.w(cursorB, "question");
            int i27 = b;
            int i28 = (i27 ^ 32) + ((i27 & 32) << 1);
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            a = i29 % 128;
            if (i29 % 2 != 0) {
                iW = r.w(cursorB, "option");
                int i30 = 42 / 0;
            } else {
                iW = r.w(cursorB, "option");
            }
            int iW4 = r.w(cursorB, "sort_order");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i31 = b;
            int i32 = (-2) - ((((i31 | 86) << 1) - (i31 ^ 86)) ^ (-1));
            a = i32 % 128;
            int i33 = i32 % 2;
            while (cursorB.moveToNext()) {
                int i34 = a;
                int i35 = i34 & 125;
                int i36 = (((i34 ^ 125) | i35) << 1) - ((i34 | 125) & (~i35));
                b = i36 % 128;
                if (i36 % 2 == 0) {
                    cursorB.getInt(iW2);
                    throw null;
                }
                int i37 = cursorB.getInt(iW2);
                String string = cursorB.getString(iW3);
                String string2 = cursorB.getString(iW);
                int i38 = b;
                int i39 = i38 & 119;
                int i40 = (((~i39) & (i38 | 119)) - (~(-(-(i39 << 1))))) - 1;
                a = i40 % 128;
                int i41 = i40 % 2;
                question_options question_optionsVar = new question_options(i37, string, string2, cursorB.getInt(iW4));
                int i42 = a + 9;
                b = i42 % 128;
                int i43 = i42 % 2;
                arrayList.add(question_optionsVar);
                int i44 = a;
                int i45 = ((i44 | 51) << 1) - (i44 ^ 51);
                b = i45 % 128;
                int i46 = i45 % 2;
            }
            cursorB.close();
            aGVarD.h();
            int i47 = a;
            int i48 = i47 & 85;
            int i49 = -(-((i47 ^ 85) | i48));
            int i50 = (i48 & i49) + (i49 | i48);
            b = i50 % 128;
            if (i50 % 2 != 0) {
                return arrayList;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<vilages> ak(int i) {
        aI aIVar;
        int i2 = 2 % 2;
        int i3 = b + 9;
        a = i3 % 128;
        int i4 = i3 % 2;
        aG aGVarD = aG.d("SELECT * FROM villages where uccode=?", 1);
        long j = i;
        int i5 = b + 95;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            aGVarD.bindLong(0, j);
            aIVar = this.e;
        } else {
            aGVarD.bindLong(1, j);
            aIVar = this.e;
        }
        aIVar.e();
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        try {
            int iW = r.w(cursorB, "uccode");
            int i6 = a;
            int i7 = (((i6 & (-94)) | ((~i6) & 93)) - (~((i6 & 93) << 1))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            int iW2 = r.w(cursorB, "localitycode");
            int iW3 = r.w(cursorB, "localitytype");
            int iW4 = r.w(cursorB, "locality");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i9 = a;
            int i10 = i9 & 61;
            int i11 = -(-((i9 ^ 61) | i10));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 / 4;
            }
            while (!(!cursorB.moveToNext())) {
                int i14 = b;
                int i15 = (i14 & 31) + (i14 | 31);
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    cursorB.getInt(iW);
                    throw null;
                }
                int i16 = cursorB.getInt(iW);
                long j2 = cursorB.getLong(iW2);
                String string = cursorB.getString(iW3);
                int i17 = a;
                int i18 = ((i17 ^ 57) | (i17 & 57)) << 1;
                int i19 = -(((~i17) & 57) | (i17 & (-58)));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                b = i20 % 128;
                int i21 = i20 % 2;
                vilages vilagesVar = new vilages(i16, j2, string, cursorB.getString(iW4));
                int i22 = b + 71;
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    arrayList.add(vilagesVar);
                    throw null;
                }
                arrayList.add(vilagesVar);
            }
            cursorB.close();
            aGVarD.h();
            int i23 = b;
            int i24 = i23 & 77;
            int i25 = -(-(i23 | 77));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            if (i26 % 2 == 0) {
                return arrayList;
            }
            throw null;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    public class buz extends aD {
        private static int a = 1;
        private static int b;

        public buz(S s, aI aIVar) {
            super(aIVar);
        }

        @Override // ivas.gov.bisp.enumeration.J.aC
        public String e() {
            int i = 2 % 2;
            int i2 = b + 85;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            int i5 = i3 & 125;
            int i6 = i5 + ((i3 ^ 125) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            return "INSERT OR REPLACE INTO `beneficiary` (`cnic`,`english_name`,`urdu_name`,`marital_status`,`gender`,`age`,`dob`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // ivas.gov.bisp.enumeration.J.aD
        public void h(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 88) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            BeneficiaryEntity beneficiaryEntity = (BeneficiaryEntity) obj;
            String str = beneficiaryEntity.nic;
            if (str == null) {
                int i4 = b + 66;
                int i5 = (i4 ^ (-1)) + (i4 << 1);
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    supportSQLiteStatement.bindNull(0);
                } else {
                    supportSQLiteStatement.bindNull(1);
                }
            } else {
                supportSQLiteStatement.bindString(1, str);
                int i6 = a + 123;
                b = i6 % 128;
                int i7 = i6 % 2;
            }
            String str2 = beneficiaryEntity.englishName;
            if (str2 == null) {
                int i8 = a;
                int i9 = i8 & 95;
                int i10 = ((i8 | 95) & (~i9)) + (i9 << 1);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindNull(2);
                }
            } else {
                supportSQLiteStatement.bindString(2, str2);
                int i11 = a;
                int i12 = i11 & 17;
                int i13 = i11 | 17;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            String str3 = beneficiaryEntity.urduName;
            if (str3 == null) {
                int i16 = b + 83;
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindNull(3);
                }
            } else {
                supportSQLiteStatement.bindString(3, str3);
                int i17 = b;
                int i18 = ((i17 ^ 108) + ((i17 & 108) << 1)) - 1;
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 5 % 2;
                }
            }
            supportSQLiteStatement.bindLong(4, beneficiaryEntity.maritalStatus);
            String str4 = beneficiaryEntity.gender;
            int i20 = a;
            int i21 = ((i20 ^ 95) | (i20 & 95)) << 1;
            int i22 = -(((~i20) & 95) | (i20 & (-96)));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (str4 == null) {
                supportSQLiteStatement.bindNull(5);
                int i24 = b;
                int i25 = i24 ^ 83;
                int i26 = ((i24 & 83) | i25) << 1;
                int i27 = -i25;
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                a = i28 % 128;
                int i29 = i28 % 2;
            } else {
                supportSQLiteStatement.bindString(5, str4);
                int i30 = b;
                int i31 = i30 & 31;
                int i32 = (i31 - (~((i30 ^ 31) | i31))) - 1;
                a = i32 % 128;
                int i33 = i32 % 2;
            }
            supportSQLiteStatement.bindDouble(6, beneficiaryEntity.age);
            int i34 = a;
            int i35 = i34 & 123;
            int i36 = (i34 ^ 123) | i35;
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            b = i37 % 128;
            int i38 = i37 % 2;
            String str5 = beneficiaryEntity.dob;
            if (str5 != null) {
                supportSQLiteStatement.bindString(7, str5);
                int i39 = a;
                int i40 = i39 & 79;
                int i41 = ((i39 | 79) & (~i40)) + (i40 << 1);
                b = i41 % 128;
                int i42 = i41 % 2;
                return;
            }
            int i43 = a;
            int i44 = (i43 & (-32)) | ((~i43) & 31);
            int i45 = -(-((i43 & 31) << 1));
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            b = i46 % 128;
            if (i46 % 2 != 0) {
                supportSQLiteStatement.bindNull(32);
            } else {
                supportSQLiteStatement.bindNull(7);
            }
            int i47 = a + 29;
            b = i47 % 128;
            int i48 = i47 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<survey_count> P() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 35) << 1) - (i2 ^ 35);
        b = i3 % 128;
        int i4 = i3 % 2;
        aG aGVarD = aG.d("SELECT * FROM survey_count", 0);
        this.e.e();
        Object obj = null;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i5 = b;
        int i6 = i5 & 83;
        int i7 = (((i5 | 83) & (~i6)) - (~(i6 << 1))) - 1;
        a = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                r.w(cursorB, "id");
                obj.hashCode();
                throw null;
            }
            int iW = r.w(cursorB, "id");
            int iW2 = r.w(cursorB, "sync_count");
            int iW3 = r.w(cursorB, "not_sync_count");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i8 = a;
            int i9 = ((i8 | 85) << 1) - (i8 ^ 85);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 4;
            }
            while (cursorB.moveToNext()) {
                int i11 = b;
                int i12 = (((i11 | 112) << 1) - (i11 ^ 112)) - 1;
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    cursorB.getLong(iW);
                    obj.hashCode();
                    throw null;
                }
                survey_count survey_countVar = new survey_count(cursorB.getLong(iW), cursorB.getInt(iW2), cursorB.getInt(iW3));
                int i13 = b + 41;
                a = i13 % 128;
                int i14 = i13 % 2;
                arrayList.add(survey_countVar);
                int i15 = a;
                int i16 = i15 & 81;
                int i17 = (((i15 ^ 81) | i16) << 1) - ((i15 | 81) & (~i16));
                b = i17 % 128;
                int i18 = i17 % 2;
            }
            cursorB.close();
            aGVarD.h();
            int i19 = a;
            int i20 = i19 & 123;
            int i21 = (i19 | 123) & (~i20);
            int i22 = i20 << 1;
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                return arrayList;
            }
            throw null;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final int aN(long j, String str) {
        int i = 2 % 2;
        int i2 = b + 23;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.e.e();
            this.A.c();
            throw null;
        }
        this.e.e();
        SupportSQLiteStatement supportSQLiteStatementC = this.A.c();
        if (str == null) {
            int i3 = a;
            int i4 = (-2) - ((((i3 | 106) << 1) - (i3 ^ 106)) ^ (-1));
            b = i4 % 128;
            int i5 = i4 % 2;
            supportSQLiteStatementC.bindNull(1);
            int i6 = b;
            int i7 = ((i6 | 41) << 1) - (i6 ^ 41);
            a = i7 % 128;
            int i8 = i7 % 2;
        } else {
            supportSQLiteStatementC.bindString(1, str);
            int i9 = b;
            int i10 = i9 & 115;
            int i11 = -(-((i9 ^ 115) | i10));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        supportSQLiteStatementC.bindLong(2, j);
        aI aIVar = this.e;
        int i14 = a;
        int i15 = i14 ^ 7;
        int i16 = ((((i14 & 7) | i15) << 1) - (~(-i15))) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
        aIVar.f();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementC.executeUpdateDelete();
            int i18 = a;
            int i19 = ((i18 ^ 123) | (i18 & 123)) << 1;
            int i20 = -(((~i18) & 123) | (i18 & (-124)));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                this.e.c();
                throw null;
            }
            this.e.c();
            aI aIVar2 = this.e;
            int i22 = b;
            int i23 = (i22 ^ 13) + ((i22 & 13) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            aIVar2.h();
            aC aCVar = this.A;
            int i25 = a;
            int i26 = (i25 & 75) + (i25 | 75);
            b = i26 % 128;
            int i27 = i26 % 2;
            if (supportSQLiteStatementC == aCVar.e) {
                int i28 = a + 101;
                b = i28 % 128;
                int i29 = i28 % 2;
                aCVar.c.set(false);
                int i30 = a;
                int i31 = i30 ^ 91;
                int i32 = -(-((i30 & 91) << 1));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                b = i33 % 128;
                int i34 = i33 % 2;
            }
            int i35 = b;
            int i36 = i35 & 53;
            int i37 = (i36 - (~(-(-((i35 ^ 53) | i36))))) - 1;
            a = i37 % 128;
            if (i37 % 2 == 0) {
                return iExecuteUpdateDelete;
            }
            throw null;
        } catch (Throwable th) {
            this.e.h();
            aC aCVar2 = this.A;
            if (supportSQLiteStatementC == aCVar2.e) {
                aCVar2.c.set(false);
                int i38 = b;
                int i39 = (i38 ^ 91) + ((i38 & 91) << 1);
                a = i39 % 128;
                int i40 = i39 % 2;
            }
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final int aQ(long j, int i, int i2) {
        SupportSQLiteStatement supportSQLiteStatementC;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 49;
        int i6 = (((i4 | 49) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            this.e.e();
            supportSQLiteStatementC = this.O.c();
            int i7 = 16 / 0;
        } else {
            this.e.e();
            supportSQLiteStatementC = this.O.c();
        }
        int i8 = b;
        int i9 = i8 & 111;
        int i10 = (i8 ^ 111) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        supportSQLiteStatementC.bindLong(1, i);
        int i13 = (-2) - ((a + 112) ^ (-1));
        b = i13 % 128;
        int i14 = i13 % 2;
        supportSQLiteStatementC.bindLong(2, i2);
        int i15 = a;
        int i16 = (i15 ^ 73) + ((i15 & 73) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        supportSQLiteStatementC.bindLong(3, j);
        this.e.f();
        int i18 = (-2) - ((b + 44) ^ (-1));
        a = i18 % 128;
        int i19 = i18 % 2;
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementC.executeUpdateDelete();
            this.e.c();
            int i20 = b;
            int i21 = i20 & 105;
            int i22 = -(-((i20 ^ 105) | i21));
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            Object obj = null;
            if (i23 % 2 != 0) {
                this.e.h();
                throw null;
            }
            this.e.h();
            aC aCVar = this.O;
            int i24 = b;
            int i25 = i24 & 23;
            int i26 = ((i24 ^ 23) | i25) << 1;
            int i27 = -((i24 | 23) & (~i25));
            int i28 = (i26 & i27) + (i27 | i26);
            a = i28 % 128;
            if (i28 % 2 != 0) {
                SupportSQLiteStatement supportSQLiteStatement = aCVar.e;
                throw null;
            }
            if (supportSQLiteStatementC == aCVar.e) {
                aCVar.c.set(false);
                int i29 = b;
                int i30 = i29 & 57;
                int i31 = ((i29 | 57) & (~i30)) + (i30 << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
            }
            int i33 = b;
            int i34 = i33 & 103;
            int i35 = (((i33 ^ 103) | i34) << 1) - ((i33 | 103) & (~i34));
            a = i35 % 128;
            if (i35 % 2 == 0) {
                return iExecuteUpdateDelete;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            this.e.h();
            aC aCVar2 = this.O;
            if (supportSQLiteStatementC == aCVar2.e) {
                aCVar2.c.set(false);
                int i36 = a;
                int i37 = i36 & 59;
                int i38 = ((i36 ^ 59) | i37) << 1;
                int i39 = -((i36 | 59) & (~i37));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                b = i40 % 128;
                int i41 = i40 % 2;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c A[PHI: r1
  0x003c: PHI (r1v11 ivas.gov.bisp.enumeration.J.aG) = (r1v5 ivas.gov.bisp.enumeration.J.aG), (r1v12 ivas.gov.bisp.enumeration.J.aG) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r1
  0x0022: PHI (r1v6 ivas.gov.bisp.enumeration.J.aG) = (r1v5 ivas.gov.bisp.enumeration.J.aG), (r1v12 ivas.gov.bisp.enumeration.J.aG) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final not_at_home r(String str, String str2, String str3) {
        aG aGVarD;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 119) + (i2 | 119);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            aGVarD = aG.d("SELECT * FROM not_at_home where data like ? and  data like ? and  data like ?", 2);
            if (str == null) {
                int i4 = (-2) - ((a + 14) ^ (-1));
                b = i4 % 128;
                int i5 = i4 % 2;
                aGVarD.bindNull(1);
                int i6 = a + 111;
                b = i6 % 128;
                int i7 = i6 % 2;
            } else {
                aGVarD.bindString(1, str);
                int i8 = a;
                int i9 = i8 & 45;
                int i10 = ((i8 | 45) & (~i9)) + (i9 << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            aGVarD = aG.d("SELECT * FROM not_at_home where data like ? and  data like ? and  data like ?", 3);
            if (str == null) {
                int i12 = (-2) - ((a + 14) ^ (-1));
                b = i12 % 128;
                int i13 = i12 % 2;
                aGVarD.bindNull(1);
                int i14 = a + 111;
                b = i14 % 128;
                int i15 = i14 % 2;
            } else {
                aGVarD.bindString(1, str);
                int i16 = a;
                int i17 = i16 & 45;
                int i18 = ((i16 | 45) & (~i17)) + (i17 << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        if (str2 == null) {
            int i20 = b;
            int i21 = ((i20 ^ 118) + ((i20 & 118) << 1)) - 1;
            a = i21 % 128;
            if (i21 % 2 != 0) {
                aGVarD.bindNull(5);
            } else {
                aGVarD.bindNull(2);
            }
        } else {
            aGVarD.bindString(2, str2);
            int i22 = a;
            int i23 = i22 & 101;
            int i24 = i23 + ((i22 ^ 101) | i23);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        if (str3 == null) {
            int i26 = a;
            int i27 = i26 & 75;
            int i28 = i27 + ((i26 ^ 75) | i27);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                aGVarD.bindNull(2);
            } else {
                aGVarD.bindNull(3);
            }
            int i29 = b;
            int i30 = ((i29 | 73) << 1) - (i29 ^ 73);
            a = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 3 % 5;
            }
        } else {
            aGVarD.bindString(3, str3);
            int i32 = b;
            int i33 = ((i32 ^ 11) | (i32 & 11)) << 1;
            int i34 = -(((~i32) & 11) | (i32 & (-12)));
            int i35 = (i33 & i34) + (i34 | i33);
            a = i35 % 128;
            int i36 = i35 % 2;
        }
        this.e.e();
        aI aIVar = this.e;
        int i37 = (-2) - ((a + 60) ^ (-1));
        b = i37 % 128;
        int i38 = i37 % 2;
        not_at_home not_at_homeVar = null;
        Cursor cursorB = aq.b(aIVar, aGVarD, false, null);
        try {
            int iW = r.w(cursorB, "id");
            int i39 = a;
            int i40 = (i39 ^ 125) + ((i39 & 125) << 1);
            b = i40 % 128;
            if (i40 % 2 == 0) {
                r.w(cursorB, "data");
                r.w(cursorB, "count");
                not_at_homeVar.hashCode();
                throw null;
            }
            int iW2 = r.w(cursorB, "data");
            int iW3 = r.w(cursorB, "count");
            if (cursorB.moveToFirst()) {
                int i41 = b;
                int i42 = (i41 ^ 123) + ((i41 & 123) << 1);
                a = i42 % 128;
                if (i42 % 2 != 0) {
                    cursorB.getLong(iW);
                    cursorB.getString(iW2);
                    throw null;
                }
                not_at_home not_at_homeVar2 = new not_at_home(cursorB.getLong(iW), cursorB.getString(iW2), cursorB.getInt(iW3));
                int i43 = a + 95;
                int i44 = i43 % 128;
                b = i44;
                int i45 = i43 % 2;
                int i46 = i44 + 83;
                a = i46 % 128;
                int i47 = i46 % 2;
                not_at_homeVar = not_at_homeVar2;
            }
            cursorB.close();
            aGVarD.h();
            int i48 = b;
            int i49 = i48 & 49;
            int i50 = ((i48 ^ 49) | i49) << 1;
            int i51 = -((i48 | 49) & (~i49));
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            a = i52 % 128;
            if (i52 % 2 != 0) {
                int i53 = 16 / 0;
            }
            return not_at_homeVar;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final BeneficiaryEntity ad(String str) {
        BeneficiaryEntity beneficiaryEntity;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 86) + (i2 | 86)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        aG aGVarD = aG.d("SELECT * FROM beneficiary WHERE cnic = ?", 1);
        if (str == null) {
            int i5 = a + 15;
            b = i5 % 128;
            int i6 = i5 % 2;
            aGVarD.bindNull(1);
        } else {
            aGVarD.bindString(1, str);
            int i7 = a;
            int i8 = i7 & 5;
            int i9 = i7 | 5;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        this.e.e();
        aI aIVar = this.e;
        int i12 = b;
        int i13 = ((i12 | 35) << 1) - (i12 ^ 35);
        a = i13 % 128;
        Object obj = null;
        Cursor cursorB = i13 % 2 != 0 ? aq.b(aIVar, aGVarD, true, null) : aq.b(aIVar, aGVarD, false, null);
        try {
            int iW = r.w(cursorB, "cnic");
            int iW2 = r.w(cursorB, "english_name");
            int i14 = b;
            int i15 = ((i14 ^ 50) + ((i14 & 50) << 1)) - 1;
            a = i15 % 128;
            if (i15 % 2 != 0) {
                r.w(cursorB, "urdu_name");
                r.w(cursorB, "marital_status");
                throw null;
            }
            int iW3 = r.w(cursorB, "urdu_name");
            int iW4 = r.w(cursorB, "marital_status");
            int iW5 = r.w(cursorB, "gender");
            int i16 = a;
            int i17 = ((i16 & 66) + (i16 | 66)) - 1;
            b = i17 % 128;
            if (i17 % 2 == 0) {
                r.w(cursorB, "age");
                r.w(cursorB, "dob");
                obj.hashCode();
                throw null;
            }
            int iW6 = r.w(cursorB, "age");
            int iW7 = r.w(cursorB, "dob");
            if (cursorB.moveToFirst()) {
                beneficiaryEntity = new BeneficiaryEntity();
                String string = cursorB.getString(iW);
                int i18 = b;
                int i19 = ((i18 & (-2)) | ((~i18) & 1)) + ((i18 & 1) << 1);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    beneficiaryEntity.nic = string;
                    beneficiaryEntity.englishName = cursorB.getString(iW2);
                    throw null;
                }
                beneficiaryEntity.nic = string;
                beneficiaryEntity.englishName = cursorB.getString(iW2);
                int i20 = b;
                int i21 = i20 & 5;
                int i22 = (i20 ^ 5) | i21;
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                a = i23 % 128;
                if (i23 % 2 != 0) {
                    beneficiaryEntity.urduName = cursorB.getString(iW3);
                    int i24 = 71 / 0;
                } else {
                    beneficiaryEntity.urduName = cursorB.getString(iW3);
                }
                beneficiaryEntity.maritalStatus = cursorB.getInt(iW4);
                int i25 = a;
                int i26 = i25 & 97;
                int i27 = (i25 | 97) & (~i26);
                int i28 = -(-(i26 << 1));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    beneficiaryEntity.gender = cursorB.getString(iW5);
                    cursorB.getDouble(iW6);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                beneficiaryEntity.gender = cursorB.getString(iW5);
                double d = cursorB.getDouble(iW6);
                int i30 = a;
                int i31 = ((i30 ^ 78) + ((i30 & 78) << 1)) - 1;
                b = i31 % 128;
                if (i31 % 2 == 0) {
                    beneficiaryEntity.age = d;
                    beneficiaryEntity.dob = cursorB.getString(iW7);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                beneficiaryEntity.age = d;
                beneficiaryEntity.dob = cursorB.getString(iW7);
                int i32 = b;
                int i33 = ((i32 & 54) + (i32 | 54)) - 1;
                a = i33 % 128;
                int i34 = i33 % 2;
            } else {
                beneficiaryEntity = null;
            }
            cursorB.close();
            aGVarD.h();
            int i35 = a;
            int i36 = (-2) - (((i35 ^ 82) + ((i35 & 82) << 1)) ^ (-1));
            b = i36 % 128;
            if (i36 % 2 == 0) {
                throw null;
            }
            int i37 = ((((i35 ^ 55) | (i35 & 55)) << 1) - (~(-(((~i35) & 55) | (i35 & (-56)))))) - 1;
            b = i37 % 128;
            if (i37 % 2 == 0) {
                int i38 = 77 / 0;
            }
            return beneficiaryEntity;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<district> ag(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 99) << 1) - (~(-(((~i3) & 99) | (i3 & (-100)))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        aG aGVarD = aG.d("SELECT * FROM district where provcode=?", 1);
        int i6 = b;
        int i7 = (i6 ^ 65) + ((i6 & 65) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        aGVarD.bindLong(1, i);
        this.e.e();
        int i9 = b + 81;
        a = i9 % 128;
        int i10 = i9 % 2;
        Object obj = null;
        Cursor cursorB = aq.b(this.e, aGVarD, false, null);
        int i11 = b;
        int i12 = (i11 & 89) + (i11 | 89);
        a = i12 % 128;
        try {
            if (i12 % 2 != 0) {
                r.w(cursorB, "id");
                r.w(cursorB, "distcode");
                throw null;
            }
            int iW = r.w(cursorB, "id");
            int iW2 = r.w(cursorB, "distcode");
            int i13 = b;
            int i14 = i13 & 35;
            int i15 = (i13 | 35) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 & i16) + (i15 | i16);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                r.w(cursorB, "divcode");
                throw null;
            }
            int iW3 = r.w(cursorB, "divcode");
            int iW4 = r.w(cursorB, "provcode");
            int iW5 = r.w(cursorB, "district");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            int i18 = b;
            int i19 = ((i18 & (-114)) | ((~i18) & 113)) + ((i18 & 113) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            while (cursorB.moveToNext()) {
                int i21 = b;
                int i22 = ((i21 | 53) << 1) - (i21 ^ 53);
                a = i22 % 128;
                int i23 = i22 % 2;
                String string = cursorB.getString(iW);
                int i24 = cursorB.getInt(iW2);
                int i25 = a;
                int i26 = ((i25 | 92) << 1) - (i25 ^ 92);
                int i27 = (i26 ^ (-1)) + (i26 << 1);
                b = i27 % 128;
                if (i27 % 2 == 0) {
                    cursorB.getInt(iW3);
                    throw null;
                }
                int i28 = cursorB.getInt(iW3);
                int i29 = b;
                int i30 = i29 ^ 119;
                int i31 = ((i29 & 119) | i30) << 1;
                int i32 = -i30;
                int i33 = (i31 & i32) + (i31 | i32);
                a = i33 % 128;
                if (i33 % 2 != 0) {
                    cursorB.getInt(iW4);
                    cursorB.getString(iW5);
                    obj.hashCode();
                    throw null;
                }
                district districtVar = new district(string, i24, i28, cursorB.getInt(iW4), cursorB.getString(iW5));
                int i34 = a + 109;
                b = i34 % 128;
                int i35 = i34 % 2;
                arrayList.add(districtVar);
                int i36 = a;
                int i37 = i36 & 51;
                int i38 = i36 | 51;
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                b = i39 % 128;
                int i40 = i39 % 2;
            }
            cursorB.close();
            aGVarD.h();
            int i41 = a;
            int i42 = i41 & 71;
            int i43 = (i42 - (~((i41 ^ 71) | i42))) - 1;
            b = i43 % 128;
            if (i43 % 2 != 0) {
                return arrayList;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final List<survey> ac() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 77;
        int i4 = ((((i2 & 77) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Cursor cursor = null;
        aG aGVarD = aG.d("SELECT id, data FROM survey order by length(data) limit 1", 0);
        this.e.e();
        int i6 = a;
        int i7 = ((i6 & (-34)) | ((~i6) & 33)) + ((i6 & 33) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            this.e.f();
        } else {
            this.e.f();
        }
        try {
            aI aIVar = this.e;
            int i8 = b + 39;
            a = i8 % 128;
            Object obj = null;
            try {
                if (i8 % 2 != 0) {
                    r.w(aq.b(aIVar, aGVarD, false, null), "id");
                    obj.hashCode();
                    throw null;
                }
                Cursor cursorB = aq.b(aIVar, aGVarD, false, null);
                int iW = r.w(cursorB, "id");
                int iW2 = r.w(cursorB, "data");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                int i9 = b;
                int i10 = i9 ^ 107;
                int i11 = ((((i9 & 107) | i10) << 1) - (~(-i10))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                while (cursorB.moveToNext()) {
                    int i13 = b;
                    int i14 = (i13 | 13) << 1;
                    int i15 = -(((~i13) & 13) | (i13 & (-14)));
                    int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                    a = i16 % 128;
                    if (i16 % 2 != 0) {
                        cursorB.getLong(iW);
                        obj.hashCode();
                        throw null;
                    }
                    survey surveyVar = new survey(cursorB.getLong(iW), cursorB.getString(iW2));
                    int i17 = b;
                    int i18 = i17 & 11;
                    int i19 = -(-((i17 ^ 11) | i18));
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    arrayList.add(surveyVar);
                    int i22 = a;
                    int i23 = (i22 ^ 117) + ((i22 & 117) << 1);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                }
                this.e.c();
                cursorB.close();
                int i25 = b;
                int i26 = ((i25 & 42) + (i25 | 42)) - 1;
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    aGVarD.h();
                    this.e.h();
                    obj.hashCode();
                    throw null;
                }
                aGVarD.h();
                this.e.h();
                int i27 = b;
                int i28 = (i27 ^ 101) + ((i27 & 101) << 1);
                int i29 = i28 % 128;
                a = i29;
                int i30 = i28 % 2;
                int i31 = i29 | 105;
                int i32 = i31 << 1;
                int i33 = -((~(i29 & 105)) & i31);
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                b = i34 % 128;
                if (i34 % 2 != 0) {
                    return arrayList;
                }
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                cursor.close();
                aGVarD.h();
                throw th;
            }
        } catch (Throwable th2) {
            this.e.h();
            throw th2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final IndividualNadraDataWithRelation bf(String str) {
        IndividualNadraDataWithRelation individualNadraDataWithRelation;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 95;
        int i4 = i3 + ((i2 ^ 95) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        aG aGVarD = aG.d("SELECT * FROM individualNadraDataWithRelation WHERE cnic = ? LIMIT 1", 1);
        if (str == null) {
            int i6 = b;
            int i7 = i6 ^ 49;
            int i8 = (i6 & 49) << 1;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            aGVarD.bindNull(1);
            int i11 = a;
            int i12 = i11 & 115;
            int i13 = ((i11 ^ 115) | i12) << 1;
            int i14 = -((i11 | 115) & (~i12));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
        } else {
            aGVarD.bindString(1, str);
            int i17 = b;
            int i18 = ((i17 | 117) << 1) - (i17 ^ 117);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        this.e.e();
        aI aIVar = this.e;
        int i20 = b;
        int i21 = i20 ^ 91;
        int i22 = (i20 & 91) << 1;
        int i23 = (i21 & i22) + (i22 | i21);
        a = i23 % 128;
        int i24 = i23 % 2;
        Cursor cursorB = aq.b(aIVar, aGVarD, false, null);
        try {
            int iW = r.w(cursorB, "cnic");
            int i25 = a;
            int i26 = ((i25 ^ 71) | (i25 & 71)) << 1;
            int i27 = -(((~i25) & 71) | (i25 & (-72)));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                r.w(cursorB, "name");
                r.w(cursorB, "relation_with_self");
                throw null;
            }
            int iW2 = r.w(cursorB, "name");
            int iW3 = r.w(cursorB, "relation_with_self");
            int iW4 = r.w(cursorB, "father_name");
            int i29 = a + 105;
            b = i29 % 128;
            if (i29 % 2 == 0) {
                r.w(cursorB, "father_nic");
                r.w(cursorB, "mother_name");
                throw null;
            }
            int iW5 = r.w(cursorB, "father_nic");
            int iW6 = r.w(cursorB, "mother_name");
            int i30 = b;
            int i31 = (((i30 & (-64)) | ((~i30) & 63)) - (~(-(-((i30 & 63) << 1))))) - 1;
            a = i31 % 128;
            int i32 = i31 % 2;
            int iW7 = r.w(cursorB, "mother_nic");
            int iW8 = r.w(cursorB, "spouse_name");
            int i33 = a;
            int i34 = i33 ^ 57;
            int i35 = ((((i33 & 57) | i34) << 1) - (~(-i34))) - 1;
            b = i35 % 128;
            if (i35 % 2 == 0) {
                r.w(cursorB, "spouse_nic");
                cursorB.moveToFirst();
                throw null;
            }
            int iW9 = r.w(cursorB, "spouse_nic");
            if (cursorB.moveToFirst()) {
                individualNadraDataWithRelation = new IndividualNadraDataWithRelation();
                String string = cursorB.getString(iW);
                int i36 = a;
                int i37 = ((i36 | 35) << 1) - (i36 ^ 35);
                b = i37 % 128;
                int i38 = i37 % 2;
                individualNadraDataWithRelation.cnic = string;
                individualNadraDataWithRelation.name = cursorB.getString(iW2);
                int i39 = a;
                int i40 = ((i39 ^ 48) + ((i39 & 48) << 1)) - 1;
                b = i40 % 128;
                int i41 = i40 % 2;
                individualNadraDataWithRelation.relationWithSelf = cursorB.getString(iW3);
                int i42 = a;
                int i43 = ((i42 ^ 49) | (i42 & 49)) << 1;
                int i44 = -(((~i42) & 49) | (i42 & (-50)));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                b = i45 % 128;
                if (i45 % 2 == 0) {
                    individualNadraDataWithRelation.fatherName = cursorB.getString(iW4);
                    cursorB.getString(iW5);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                individualNadraDataWithRelation.fatherName = cursorB.getString(iW4);
                String string2 = cursorB.getString(iW5);
                int i46 = b;
                int i47 = ((i46 & (-98)) | ((~i46) & 97)) + ((i46 & 97) << 1);
                a = i47 % 128;
                int i48 = i47 % 2;
                individualNadraDataWithRelation.fatherNic = string2;
                individualNadraDataWithRelation.motherName = cursorB.getString(iW6);
                int i49 = a;
                int i50 = (i49 & (-32)) | ((~i49) & 31);
                int i51 = (i49 & 31) << 1;
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                b = i52 % 128;
                if (i52 % 2 == 0) {
                    individualNadraDataWithRelation.motherNic = cursorB.getString(iW7);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                individualNadraDataWithRelation.motherNic = cursorB.getString(iW7);
                individualNadraDataWithRelation.spouseName = cursorB.getString(iW8);
                String string3 = cursorB.getString(iW9);
                int i53 = a;
                int i54 = (i53 | 105) << 1;
                int i55 = -(i53 ^ 105);
                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                b = i56 % 128;
                if (i56 % 2 == 0) {
                    individualNadraDataWithRelation.spouseNic = string3;
                    throw null;
                }
                individualNadraDataWithRelation.spouseNic = string3;
            } else {
                individualNadraDataWithRelation = null;
            }
            cursorB.close();
            aGVarD.h();
            int i57 = a;
            int i58 = (((i57 | 49) << 1) - (~(-(((~i57) & 49) | (i57 & (-50)))))) - 1;
            b = i58 % 128;
            if (i58 % 2 != 0) {
                return individualNadraDataWithRelation;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        } catch (Throwable th) {
            cursorB.close();
            aGVarD.h();
            throw th;
        }
    }
}
