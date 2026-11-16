package ivas.gov.bisp.enumeration.J;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import ivas.gov.bisp.enumeration.p019as.l;
import ivas.gov.bisp.enumeration.p066cl.h;
import ivas.gov.bisp.enumeration.p096p.j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class aI {
    private static int a = 1;
    private static int b;

    @Deprecated
    public volatile SupportSQLiteDatabase d;
    public Executor e;
    public SupportSQLiteOpenHelper f;
    public final aF g;
    public boolean h;
    public boolean i;

    @Deprecated
    public List<baa> j;
    public final ReentrantReadWriteLock k = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> c = new ThreadLocal<>();

    public static abstract class baa {
    }

    public static class bab {
        public HashMap<Integer, TreeMap<Integer, l>> a = new HashMap<>();
    }

    public aI() {
        new ConcurrentHashMap();
        this.g = g();
    }

    @Deprecated
    public void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 13) | (i2 & 13)) << 1;
        int i4 = -(((~i2) & 13) | (i2 & (-14)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        SupportSQLiteDatabase writableDatabase = this.f.getWritableDatabase();
        if (i6 != 0) {
            writableDatabase.setTransactionSuccessful();
        } else {
            writableDatabase.setTransactionSuccessful();
            throw null;
        }
    }

    public void d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 109;
        int i4 = ((((i2 & 109) | i3) << 1) - (~(-i3))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (this.i) {
            int i7 = ((i5 & (-84)) | ((~i5) & 83)) + ((i5 & 83) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
        } else {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                int i9 = b + 33;
                a = i9 % 128;
                int i10 = i9 % 2;
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
            int i11 = a;
            int i12 = i11 & 119;
            int i13 = i12 + ((i11 ^ 119) | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = (i11 & 19) + (i11 | 19);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
    }

    public abstract aF g();

    public abstract SupportSQLiteOpenHelper i(aA aAVar);

    public boolean j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 99;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 99)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        boolean zInTransaction = this.f.getWritableDatabase().inTransaction();
        int i8 = a;
        int i9 = (i8 & 39) + (i8 | 39);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return zInTransaction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 43) | (i2 & 43)) << 1;
        int i4 = -(((~i2) & 43) | (i2 & (-44)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            j();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!j()) {
            int i6 = b;
            int i7 = i6 & 59;
            int i8 = ((i6 | 59) & (~i7)) + (i7 << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            if (this.c.get() != null) {
                throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
        int i10 = a;
        int i11 = (i10 ^ 89) + ((i10 & 89) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    @Deprecated
    public void f() {
        int i = 2 % 2;
        int i2 = b + 123;
        a = i2 % 128;
        int i3 = i2 % 2;
        d();
        SupportSQLiteDatabase writableDatabase = this.f.getWritableDatabase();
        int i4 = a + 69;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.g.f(writableDatabase);
        writableDatabase.beginTransaction();
        int i6 = a;
        int i7 = (i6 & 75) + (i6 | 75);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public Cursor k(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            d();
            e();
            throw null;
        }
        d();
        e();
        if (cancellationSignal != null) {
            Cursor cursorQuery = this.f.getWritableDatabase().query(supportSQLiteQuery, cancellationSignal);
            int i4 = a + 25;
            b = i4 % 128;
            int i5 = i4 % 2;
            return cursorQuery;
        }
        Cursor cursorQuery2 = this.f.getWritableDatabase().query(supportSQLiteQuery);
        int i6 = b + 35;
        a = i6 % 128;
        int i7 = i6 % 2;
        return cursorQuery2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x007d  */
    @Deprecated
    public void h() {
        aF aFVar;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-96)) | ((~i3) & 95);
        int i5 = -(-((i3 & 95) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.f.getWritableDatabase().endTransaction();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.f.getWritableDatabase().endTransaction();
        int i7 = b;
        int i8 = i7 & 29;
        int i9 = (i7 | 29) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 31 / 0;
            if (!j()) {
                aFVar = this.g;
                if (aFVar.j.compareAndSet(false, true)) {
                    int i13 = a;
                    int i14 = i13 & 105;
                    int i15 = (i13 ^ 105) | i14;
                    int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    aFVar.h.e.execute(aFVar.m);
                    i = b + 119;
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i18 = 4 % 3;
                    }
                }
            }
        } else if (!j()) {
            aFVar = this.g;
            if (aFVar.j.compareAndSet(false, true)) {
                int i19 = a;
                int i110 = i19 & 105;
                int i111 = (i19 ^ 105) | i110;
                int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
                b = i112 % 128;
                int i113 = i112 % 2;
                aFVar.h.e.execute(aFVar.m);
                i = b + 119;
                a = i % 128;
                if (i % 2 == 0) {
                    int i114 = 4 % 3;
                }
            }
        }
        int i20 = a + 86;
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        b = i21 % 128;
        int i22 = i21 % 2;
    }

    public static class aZZ<T extends aI> {
        private static int a = 1;
        private static int b;
        public boolean c;
        public final Class<T> d;
        public final String e;
        public final Context f;
        public Executor g;
        public SupportSQLiteOpenHelper.OooO0O0 h;
        public Executor i;
        public boolean j;
        public boolean k = true;
        public final bab l = new bab();

        public aZZ(Context context, Class<T> cls, String str) {
            this.f = context;
            this.d = cls;
            this.e = str;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x03c1  */
        /* JADX WARN: Code duplicated, block: B:13:0x0079 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:14:0x007b  */
        /* JADX WARN: Code duplicated, block: B:16:0x008b  */
        /* JADX WARN: Code duplicated, block: B:19:0x0094  */
        /* JADX WARN: Code duplicated, block: B:21:0x0098  */
        /* JADX WARN: Code duplicated, block: B:22:0x00b0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:28:0x00db  */
        /* JADX WARN: Code duplicated, block: B:44:0x0155  */
        /* JADX WARN: Code duplicated, block: B:48:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:50:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:51:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:55:0x022f  */
        /* JADX WARN: Code duplicated, block: B:58:0x023e A[Catch: InstantiationException -> 0x036f, IllegalAccessException -> 0x0386, ClassNotFoundException -> 0x039d, TRY_LEAVE, TryCatch #3 {ClassNotFoundException -> 0x039d, IllegalAccessException -> 0x0386, InstantiationException -> 0x036f, blocks: (B:56:0x0236, B:58:0x023e, B:60:0x0255, B:63:0x0268, B:72:0x02a8, B:65:0x0282, B:67:0x0286), top: B:117:0x0236 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x0268 A[Catch: InstantiationException -> 0x036f, IllegalAccessException -> 0x0386, ClassNotFoundException -> 0x039d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {ClassNotFoundException -> 0x039d, IllegalAccessException -> 0x0386, InstantiationException -> 0x036f, blocks: (B:56:0x0236, B:58:0x023e, B:60:0x0255, B:63:0x0268, B:72:0x02a8, B:65:0x0282, B:67:0x0286), top: B:117:0x0236 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0282 A[Catch: InstantiationException -> 0x036f, IllegalAccessException -> 0x0386, ClassNotFoundException -> 0x039d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {ClassNotFoundException -> 0x039d, IllegalAccessException -> 0x0386, InstantiationException -> 0x036f, blocks: (B:56:0x0236, B:58:0x023e, B:60:0x0255, B:63:0x0268, B:72:0x02a8, B:65:0x0282, B:67:0x0286), top: B:117:0x0236 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x028a  */
        /* JADX WARN: Code duplicated, block: B:75:0x02be  */
        /* JADX WARN: Code duplicated, block: B:77:0x02e2  */
        /* JADX WARN: Code duplicated, block: B:79:0x02e8  */
        /* JADX WARN: Code duplicated, block: B:81:0x02fa  */
        /* JADX WARN: Code duplicated, block: B:82:0x02fe  */
        /* JADX WARN: Code duplicated, block: B:84:0x0301  */
        /* JADX WARN: Code duplicated, block: B:86:0x031a  */
        /* JADX WARN: Code duplicated, block: B:87:0x031d  */
        /* JADX WARN: Code duplicated, block: B:89:0x0330  */
        /* JADX WARN: Code duplicated, block: B:92:0x0351  */
        /* JADX WARN: Code duplicated, block: B:93:0x0358  */
        /* JADX WARN: Code duplicated, block: B:95:0x035d  */
        /* JADX WARN: Code duplicated, block: B:97:0x0366  */
        @SuppressLint({"RestrictedApi"})
        public T c() {
            int i;
            Executor executor;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            Executor executor2;
            aA aAVar;
            String name;
            String canonicalName;
            StringBuilder sb;
            int i7;
            String string;
            String string2;
            Object objNewInstance;
            int i8;
            T t;
            SupportSQLiteOpenHelper supportSQLiteOpenHelperI;
            int i9;
            int i10;
            boolean z;
            int i11;
            int i12;
            int i13;
            StringBuilder sb2;
            int i14;
            int i15;
            int length;
            int i16 = 2 % 2;
            int i17 = a;
            int i18 = i17 & 39;
            int i19 = (i17 ^ 39) | i18;
            int i20 = (i18 & i19) + (i18 | i19);
            b = i20 % 128;
            if (i20 % 2 != 0) {
                throw null;
            }
            Context context = this.f;
            if (context == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            int i21 = i17 + 101;
            int i22 = i21 % 128;
            b = i22;
            int i23 = i21 % 2;
            if (this.d == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            int i24 = i22 & 39;
            int i25 = (~i24) & (i22 | 39);
            int i26 = i24 << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            Executor executor3 = this.g;
            if (executor3 == null) {
                int i29 = i22 & 97;
                int i30 = i29 + ((i22 ^ 97) | i29);
                int i31 = i30 % 128;
                a = i31;
                int i32 = i30 % 2;
                if (this.i == null) {
                    int i33 = i31 & 103;
                    int i34 = (((i31 ^ 103) | i33) << 1) - ((~i33) & (i31 | 103));
                    b = i34 % 128;
                    int i35 = i34 % 2;
                    Executor executor4 = j.e;
                    this.i = executor4;
                    this.g = executor4;
                    int i36 = b + 52;
                    int i37 = (i36 ^ (-1)) + (i36 << 1);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                } else if (executor3 != null) {
                    int i39 = i22 & 83;
                    i3 = (i39 - (~((i22 ^ 83) | i39))) - 1;
                    i4 = i3 % 128;
                    a = i4;
                    if (i3 % 2 == 0) {
                        int i40 = 98 / 0;
                        if (this.i == null) {
                            this.i = executor3;
                            int i41 = i4 & 91;
                            int i42 = (i4 | 91) & (~i41);
                            int i43 = -(-(i41 << 1));
                            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                            b = i44 % 128;
                            int i45 = i44 % 2;
                        } else if (executor3 == null) {
                            int i46 = a;
                            int i47 = i46 | 73;
                            int i48 = (i47 << 1) - ((~(i46 & 73)) & i47);
                            i = i48 % 128;
                            b = i;
                            int i49 = i48 % 2;
                            executor = this.i;
                            if (executor != null) {
                                i2 = ((i & 16) + (i | 16)) - 1;
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    this.g = executor;
                                    int i50 = 19 / 0;
                                } else {
                                    this.g = executor;
                                }
                                int i51 = (i | 95) << 1;
                                int i52 = -(((~i) & 95) | (i & (-96)));
                                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                                a = i53 % 128;
                                int i54 = i53 % 2;
                            }
                        }
                    } else if (this.i == null) {
                        this.i = executor3;
                        int i410 = i4 & 91;
                        int i411 = (i4 | 91) & (~i410);
                        int i412 = -(-(i410 << 1));
                        int i413 = (i411 ^ i412) + ((i412 & i411) << 1);
                        b = i413 % 128;
                        int i414 = i413 % 2;
                    } else if (executor3 == null) {
                        int i415 = a;
                        int i416 = i415 | 73;
                        int i417 = (i416 << 1) - ((~(i415 & 73)) & i416);
                        i = i417 % 128;
                        b = i;
                        int i418 = i417 % 2;
                        executor = this.i;
                        if (executor != null) {
                            i2 = ((i & 16) + (i | 16)) - 1;
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                this.g = executor;
                                int i55 = 19 / 0;
                            } else {
                                this.g = executor;
                            }
                            int i56 = (i | 95) << 1;
                            int i57 = -(((~i) & 95) | (i & (-96)));
                            int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                            a = i58 % 128;
                            int i59 = i58 % 2;
                        }
                    }
                } else if (executor3 == null) {
                    int i419 = a;
                    int i4110 = i419 | 73;
                    int i4111 = (i4110 << 1) - ((~(i419 & 73)) & i4110);
                    i = i4111 % 128;
                    b = i;
                    int i4112 = i4111 % 2;
                    executor = this.i;
                    if (executor != null) {
                        i2 = ((i & 16) + (i | 16)) - 1;
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            this.g = executor;
                            int i510 = 19 / 0;
                        } else {
                            this.g = executor;
                        }
                        int i511 = (i | 95) << 1;
                        int i512 = -(((~i) & 95) | (i & (-96)));
                        int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                        a = i513 % 128;
                        int i514 = i513 % 2;
                    }
                }
            } else if (executor3 != null) {
                int i310 = i22 & 83;
                i3 = (i310 - (~((i22 ^ 83) | i310))) - 1;
                i4 = i3 % 128;
                a = i4;
                if (i3 % 2 == 0) {
                    int i420 = 98 / 0;
                    if (this.i == null) {
                        this.i = executor3;
                        int i4113 = i4 & 91;
                        int i4114 = (i4 | 91) & (~i4113);
                        int i4115 = -(-(i4113 << 1));
                        int i4116 = (i4114 ^ i4115) + ((i4115 & i4114) << 1);
                        b = i4116 % 128;
                        int i4117 = i4116 % 2;
                    } else if (executor3 == null) {
                        int i4118 = a;
                        int i4119 = i4118 | 73;
                        int i41110 = (i4119 << 1) - ((~(i4118 & 73)) & i4119);
                        i = i41110 % 128;
                        b = i;
                        int i41111 = i41110 % 2;
                        executor = this.i;
                        if (executor != null) {
                            i2 = ((i & 16) + (i | 16)) - 1;
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                this.g = executor;
                                int i515 = 19 / 0;
                            } else {
                                this.g = executor;
                            }
                            int i516 = (i | 95) << 1;
                            int i517 = -(((~i) & 95) | (i & (-96)));
                            int i518 = ((i516 | i517) << 1) - (i517 ^ i516);
                            a = i518 % 128;
                            int i519 = i518 % 2;
                        }
                    }
                } else if (this.i == null) {
                    this.i = executor3;
                    int i41112 = i4 & 91;
                    int i41113 = (i4 | 91) & (~i41112);
                    int i41114 = -(-(i41112 << 1));
                    int i41115 = (i41113 ^ i41114) + ((i41114 & i41113) << 1);
                    b = i41115 % 128;
                    int i41116 = i41115 % 2;
                } else if (executor3 == null) {
                    int i41117 = a;
                    int i41118 = i41117 | 73;
                    int i41119 = (i41118 << 1) - ((~(i41117 & 73)) & i41118);
                    i = i41119 % 128;
                    b = i;
                    int i411110 = i41119 % 2;
                    executor = this.i;
                    if (executor != null) {
                        i2 = ((i & 16) + (i | 16)) - 1;
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            this.g = executor;
                            int i5110 = 19 / 0;
                        } else {
                            this.g = executor;
                        }
                        int i5111 = (i | 95) << 1;
                        int i5112 = -(((~i) & 95) | (i & (-96)));
                        int i5113 = ((i5111 | i5112) << 1) - (i5112 ^ i5111);
                        a = i5113 % 128;
                        int i5114 = i5113 % 2;
                    }
                }
            } else if (executor3 == null) {
                int i411111 = a;
                int i411112 = i411111 | 73;
                int i411113 = (i411112 << 1) - ((~(i411111 & 73)) & i411112);
                i = i411113 % 128;
                b = i;
                int i411114 = i411113 % 2;
                executor = this.i;
                if (executor != null) {
                    i2 = ((i & 16) + (i | 16)) - 1;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.g = executor;
                        int i5115 = 19 / 0;
                    } else {
                        this.g = executor;
                    }
                    int i5116 = (i | 95) << 1;
                    int i5117 = -(((~i) & 95) | (i & (-96)));
                    int i5118 = ((i5116 | i5117) << 1) - (i5117 ^ i5116);
                    a = i5118 % 128;
                    int i5119 = i5118 % 2;
                }
            }
            if (this.h == null) {
                this.h = new h();
                int i60 = a;
                int i61 = i60 & 71;
                int i62 = (i61 - (~((i60 ^ 71) | i61))) - 1;
                b = i62 % 128;
                int i63 = i62 % 2;
            }
            String str = this.e;
            SupportSQLiteOpenHelper.OooO0O0 oooO0O0 = this.h;
            int i64 = a;
            int i65 = (i64 & 51) + (i64 | 51);
            b = i65 % 128;
            int i66 = i65 % 2;
            bab babVar = this.l;
            boolean z2 = this.j;
            int i67 = ((i64 | 35) << 1) - (i64 ^ 35);
            b = i67 % 128;
            if (i67 % 2 != 0) {
                throw null;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int i68 = a;
            int i69 = ((i68 | 95) << 1) - (i68 ^ 95);
            b = i69 % 128;
            if (i69 % 2 == 0) {
                if (activityManager != null) {
                    i5 = 3;
                    if (activityManager.isLowRamDevice()) {
                        i6 = i5;
                    }
                }
                executor2 = this.g;
                aAVar = new aA(context, str, oooO0O0, babVar, null, z2, i6, executor2, this.i, false, this.k, this.c, null, null, null);
                int i70 = a;
                int i71 = (i70 ^ 52) + ((i70 & 52) << 1);
                int i72 = (i71 ^ (-1)) + (i71 << 1);
                b = i72 % 128;
                int i73 = i72 % 2;
                Class<T> cls = this.d;
                Package r6 = cls.getPackage();
                int i74 = a;
                int i75 = (((i74 ^ 21) | (i74 & 21)) << 1) - (((~i74) & 21) | (i74 & (-22)));
                b = i75 % 128;
                int i76 = i75 % 2;
                name = r6.getName();
                canonicalName = cls.getCanonicalName();
                int i77 = a;
                int i78 = i77 & 125;
                int i79 = (i77 ^ 125) | i78;
                int i80 = (i78 & i79) + (i79 | i78);
                b = i80 % 128;
                int i81 = i80 % 2;
                if (!name.isEmpty()) {
                    i15 = b + 71;
                    a = i15 % 128;
                    if (i15 % 2 == 0) {
                        length = name.length() / 0;
                    } else {
                        length = name.length() + 1;
                    }
                    canonicalName = canonicalName.substring(length);
                    int i82 = a + 57;
                    b = i82 % 128;
                    int i83 = i82 % 2;
                }
                sb = new StringBuilder();
                int i84 = a + 65;
                b = i84 % 128;
                int i85 = i84 % 2;
                sb.append(canonicalName.replace('.', '_'));
                int i86 = a;
                int i87 = ((i86 ^ 37) | (i86 & 37)) << 1;
                int i88 = -(((~i86) & 37) | (i86 & (-38)));
                i7 = (i87 & i88) + (i88 | i87);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    sb.append("_Impl");
                    sb.toString();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                sb.append("_Impl");
                string = sb.toString();
                if (!name.isEmpty()) {
                    sb2 = new StringBuilder();
                    int i89 = a;
                    int i90 = i89 & 79;
                    int i91 = (i89 ^ 79) | i90;
                    int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
                    b = i92 % 128;
                    int i93 = i92 % 2;
                    sb2.append(name);
                    sb2.append(".");
                    i14 = b + 15;
                    a = i14 % 128;
                    if (i14 % 2 == 0) {
                        sb2.append(string);
                        throw null;
                    }
                    sb2.append(string);
                    string2 = sb2.toString();
                    int i94 = b;
                    int i95 = i94 & 71;
                    int i96 = (i94 ^ 71) | i95;
                    int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                    a = i97 % 128;
                    int i98 = i97 % 2;
                } else {
                    int i99 = a;
                    int i100 = i99 ^ 51;
                    int i101 = (((i99 & 51) | i100) << 1) - i100;
                    b = i101 % 128;
                    int i102 = i101 % 2;
                    int i103 = i99 & 41;
                    int i104 = (i99 ^ 41) | i103;
                    int i105 = (i103 & i104) + (i104 | i103);
                    b = i105 % 128;
                    int i106 = i105 % 2;
                    string2 = string;
                }
                objNewInstance = Class.forName(string2).newInstance();
                int i107 = a;
                i8 = (i107 & 43) + (i107 | 43);
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    ((aI) objNewInstance).i(aAVar);
                    throw null;
                }
                t = (T) objNewInstance;
                supportSQLiteOpenHelperI = t.i(aAVar);
                int i108 = b;
                int i109 = ((i108 ^ 37) | (i108 & 37)) << 1;
                int i110 = -(((~i108) & 37) | (i108 & (-38)));
                i9 = (i109 ^ i110) + ((i110 & i109) << 1);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    t.f = supportSQLiteOpenHelperI;
                    boolean z3 = supportSQLiteOpenHelperI instanceof aH;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                t.f = supportSQLiteOpenHelperI;
                if (supportSQLiteOpenHelperI instanceof aH) {
                    ((aH) supportSQLiteOpenHelperI).g = aAVar;
                    int i111 = a;
                    i13 = (i111 & 95) + (95 | i111);
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        i10 = 3;
                        int i112 = 5 % 3;
                    } else {
                        i10 = 3;
                    }
                } else {
                    i10 = 3;
                }
                if (i6 != i10) {
                    int i113 = a;
                    i12 = (((i113 & (-124)) | ((~i113) & 123)) - (~(-(-((i113 & 123) << 1))))) - 1;
                    int i114 = i12 % 128;
                    b = i114;
                    if (i12 % 2 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i115 = (-2) - (((i114 ^ 38) + ((i114 & 38) << 1)) ^ (-1));
                    a = i115 % 128;
                    int i116 = i115 % 2;
                } else {
                    z = true;
                }
                supportSQLiteOpenHelperI.setWriteAheadLoggingEnabled(z);
                t.j = null;
                t.e = executor2;
                new ArrayDeque();
                int i117 = a;
                i11 = (i117 ^ 77) + ((i117 & 77) << 1);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    t.i = z2;
                    t.h = z;
                    int i118 = 46 / 0;
                } else {
                    t.i = z2;
                    t.h = z;
                }
                return t;
            }
            if (activityManager != null) {
                i5 = 2;
                if (activityManager.isLowRamDevice()) {
                    i6 = i5;
                }
            }
            executor2 = this.g;
            aAVar = new aA(context, str, oooO0O0, babVar, null, z2, i6, executor2, this.i, false, this.k, this.c, null, null, null);
            int i710 = a;
            int i711 = (i710 ^ 52) + ((i710 & 52) << 1);
            int i712 = (i711 ^ (-1)) + (i711 << 1);
            b = i712 % 128;
            int i713 = i712 % 2;
            Class<T> cls2 = this.d;
            Package r7 = cls2.getPackage();
            int i714 = a;
            int i715 = (((i714 ^ 21) | (i714 & 21)) << 1) - (((~i714) & 21) | (i714 & (-22)));
            b = i715 % 128;
            int i716 = i715 % 2;
            name = r7.getName();
            canonicalName = cls2.getCanonicalName();
            int i717 = a;
            int i718 = i717 & 125;
            int i719 = (i717 ^ 125) | i718;
            int i810 = (i718 & i719) + (i719 | i718);
            b = i810 % 128;
            int i811 = i810 % 2;
            if (!name.isEmpty()) {
                i15 = b + 71;
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    length = name.length() / 0;
                } else {
                    length = name.length() + 1;
                }
                canonicalName = canonicalName.substring(length);
                int i812 = a + 57;
                b = i812 % 128;
                int i813 = i812 % 2;
            }
            sb = new StringBuilder();
            int i814 = a + 65;
            b = i814 % 128;
            int i815 = i814 % 2;
            sb.append(canonicalName.replace('.', '_'));
            int i816 = a;
            int i817 = ((i816 ^ 37) | (i816 & 37)) << 1;
            int i818 = -(((~i816) & 37) | (i816 & (-38)));
            i7 = (i817 & i818) + (i818 | i817);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                sb.append("_Impl");
                sb.toString();
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            sb.append("_Impl");
            string = sb.toString();
            try {
                if (!name.isEmpty()) {
                    sb2 = new StringBuilder();
                    int i819 = a;
                    int i910 = i819 & 79;
                    int i911 = (i819 ^ 79) | i910;
                    int i912 = ((i910 | i911) << 1) - (i911 ^ i910);
                    b = i912 % 128;
                    int i913 = i912 % 2;
                    sb2.append(name);
                    sb2.append(".");
                    i14 = b + 15;
                    a = i14 % 128;
                    if (i14 % 2 == 0) {
                        sb2.append(string);
                        throw null;
                    }
                    sb2.append(string);
                    string2 = sb2.toString();
                    int i914 = b;
                    int i915 = i914 & 71;
                    int i916 = (i914 ^ 71) | i915;
                    int i917 = (i915 ^ i916) + ((i916 & i915) << 1);
                    a = i917 % 128;
                    int i918 = i917 % 2;
                } else {
                    int i919 = a;
                    int i1010 = i919 ^ 51;
                    int i1011 = (((i919 & 51) | i1010) << 1) - i1010;
                    b = i1011 % 128;
                    int i1012 = i1011 % 2;
                    int i1013 = i919 & 41;
                    int i1014 = (i919 ^ 41) | i1013;
                    int i1015 = (i1013 & i1014) + (i1014 | i1013);
                    b = i1015 % 128;
                    int i1016 = i1015 % 2;
                    string2 = string;
                }
                objNewInstance = Class.forName(string2).newInstance();
                int i1017 = a;
                i8 = (i1017 & 43) + (i1017 | 43);
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    ((aI) objNewInstance).i(aAVar);
                    throw null;
                }
                t = (T) objNewInstance;
                supportSQLiteOpenHelperI = t.i(aAVar);
                int i1018 = b;
                int i1019 = ((i1018 ^ 37) | (i1018 & 37)) << 1;
                int i119 = -(((~i1018) & 37) | (i1018 & (-38)));
                i9 = (i1019 ^ i119) + ((i119 & i1019) << 1);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    t.f = supportSQLiteOpenHelperI;
                    boolean z4 = supportSQLiteOpenHelperI instanceof aH;
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                t.f = supportSQLiteOpenHelperI;
                if (supportSQLiteOpenHelperI instanceof aH) {
                    ((aH) supportSQLiteOpenHelperI).g = aAVar;
                    int i1110 = a;
                    i13 = (i1110 & 95) + (95 | i1110);
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        i10 = 3;
                        int i1111 = 5 % 3;
                    } else {
                        i10 = 3;
                    }
                } else {
                    i10 = 3;
                }
                if (i6 != i10) {
                    int i1112 = a;
                    i12 = (((i1112 & (-124)) | ((~i1112) & 123)) - (~(-(-((i1112 & 123) << 1))))) - 1;
                    int i1113 = i12 % 128;
                    b = i1113;
                    if (i12 % 2 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i1114 = (-2) - (((i1113 ^ 38) + ((i1113 & 38) << 1)) ^ (-1));
                    a = i1114 % 128;
                    int i1115 = i1114 % 2;
                } else {
                    z = true;
                }
                supportSQLiteOpenHelperI.setWriteAheadLoggingEnabled(z);
                t.j = null;
                t.e = executor2;
                new ArrayDeque();
                int i1116 = a;
                i11 = (i1116 ^ 77) + ((i1116 & 77) << 1);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    t.i = z2;
                    t.h = z;
                    int i1117 = 46 / 0;
                } else {
                    t.i = z2;
                    t.h = z;
                }
                return t;
            } catch (ClassNotFoundException unused) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("cannot find implementation for ");
                sbW.append(cls2.getCanonicalName());
                sbW.append(". ");
                sbW.append(string);
                sbW.append(" does not exist");
                throw new RuntimeException(sbW.toString());
            } catch (IllegalAccessException unused2) {
                StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("Cannot access the constructor");
                sbW2.append(cls2.getCanonicalName());
                throw new RuntimeException(sbW2.toString());
            } catch (InstantiationException unused3) {
                StringBuilder sbW3 = ivas.gov.bisp.enumeration.p091n.j.w("Failed to create an instance of ");
                sbW3.append(cls2.getCanonicalName());
                throw new RuntimeException(sbW3.toString());
            }
            int i120 = a + 59;
            b = i120 % 128;
            int i121 = i120 % 2;
            i6 = 2;
            executor2 = this.g;
            aAVar = new aA(context, str, oooO0O0, babVar, null, z2, i6, executor2, this.i, false, this.k, this.c, null, null, null);
            int i7110 = a;
            int i7111 = (i7110 ^ 52) + ((i7110 & 52) << 1);
            int i7112 = (i7111 ^ (-1)) + (i7111 << 1);
            b = i7112 % 128;
            int i7113 = i7112 % 2;
            Class<T> cls3 = this.d;
            Package r8 = cls3.getPackage();
            int i7114 = a;
            int i7115 = (((i7114 ^ 21) | (i7114 & 21)) << 1) - (((~i7114) & 21) | (i7114 & (-22)));
            b = i7115 % 128;
            int i7116 = i7115 % 2;
            name = r8.getName();
            canonicalName = cls3.getCanonicalName();
            int i7117 = a;
            int i7118 = i7117 & 125;
            int i7119 = (i7117 ^ 125) | i7118;
            int i8110 = (i7118 & i7119) + (i7119 | i7118);
            b = i8110 % 128;
            int i8111 = i8110 % 2;
            if (!name.isEmpty()) {
                i15 = b + 71;
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    length = name.length() / 0;
                } else {
                    length = name.length() + 1;
                }
                canonicalName = canonicalName.substring(length);
                int i8112 = a + 57;
                b = i8112 % 128;
                int i8113 = i8112 % 2;
            }
            sb = new StringBuilder();
            int i8114 = a + 65;
            b = i8114 % 128;
            int i8115 = i8114 % 2;
            sb.append(canonicalName.replace('.', '_'));
            int i8116 = a;
            int i8117 = ((i8116 ^ 37) | (i8116 & 37)) << 1;
            int i8118 = -(((~i8116) & 37) | (i8116 & (-38)));
            i7 = (i8117 & i8118) + (i8118 | i8117);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                sb.append("_Impl");
                sb.toString();
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
            sb.append("_Impl");
            string = sb.toString();
            if (!name.isEmpty()) {
                sb2 = new StringBuilder();
                int i8119 = a;
                int i9110 = i8119 & 79;
                int i9111 = (i8119 ^ 79) | i9110;
                int i9112 = ((i9110 | i9111) << 1) - (i9111 ^ i9110);
                b = i9112 % 128;
                int i9113 = i9112 % 2;
                sb2.append(name);
                sb2.append(".");
                i14 = b + 15;
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    sb2.append(string);
                    throw null;
                }
                sb2.append(string);
                string2 = sb2.toString();
                int i9114 = b;
                int i9115 = i9114 & 71;
                int i9116 = (i9114 ^ 71) | i9115;
                int i9117 = (i9115 ^ i9116) + ((i9116 & i9115) << 1);
                a = i9117 % 128;
                int i9118 = i9117 % 2;
            } else {
                int i9119 = a;
                int i10110 = i9119 ^ 51;
                int i10111 = (((i9119 & 51) | i10110) << 1) - i10110;
                b = i10111 % 128;
                int i10112 = i10111 % 2;
                int i10113 = i9119 & 41;
                int i10114 = (i9119 ^ 41) | i10113;
                int i10115 = (i10113 & i10114) + (i10114 | i10113);
                b = i10115 % 128;
                int i10116 = i10115 % 2;
                string2 = string;
            }
            objNewInstance = Class.forName(string2).newInstance();
            int i10117 = a;
            i8 = (i10117 & 43) + (i10117 | 43);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                ((aI) objNewInstance).i(aAVar);
                throw null;
            }
            t = (T) objNewInstance;
            supportSQLiteOpenHelperI = t.i(aAVar);
            int i10118 = b;
            int i10119 = ((i10118 ^ 37) | (i10118 & 37)) << 1;
            int i1118 = -(((~i10118) & 37) | (i10118 & (-38)));
            i9 = (i10119 ^ i1118) + ((i1118 & i10119) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                t.f = supportSQLiteOpenHelperI;
                boolean z5 = supportSQLiteOpenHelperI instanceof aH;
                Object obj6 = null;
                obj6.hashCode();
                throw null;
            }
            t.f = supportSQLiteOpenHelperI;
            if (supportSQLiteOpenHelperI instanceof aH) {
                ((aH) supportSQLiteOpenHelperI).g = aAVar;
                int i1119 = a;
                i13 = (i1119 & 95) + (95 | i1119);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    i10 = 3;
                    int i11110 = 5 % 3;
                } else {
                    i10 = 3;
                }
            } else {
                i10 = 3;
            }
            if (i6 != i10) {
                int i11111 = a;
                i12 = (((i11111 & (-124)) | ((~i11111) & 123)) - (~(-(-((i11111 & 123) << 1))))) - 1;
                int i11112 = i12 % 128;
                b = i11112;
                if (i12 % 2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i11113 = (-2) - (((i11112 ^ 38) + ((i11112 & 38) << 1)) ^ (-1));
                a = i11113 % 128;
                int i11114 = i11113 % 2;
            } else {
                z = true;
            }
            supportSQLiteOpenHelperI.setWriteAheadLoggingEnabled(z);
            t.j = null;
            t.e = executor2;
            new ArrayDeque();
            int i11115 = a;
            i11 = (i11115 ^ 77) + ((i11115 & 77) << 1);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                t.i = z2;
                t.h = z;
                int i11116 = 46 / 0;
            } else {
                t.i = z2;
                t.h = z;
            }
            return t;
        }
    }
}
