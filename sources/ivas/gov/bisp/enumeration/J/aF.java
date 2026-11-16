package ivas.gov.bisp.enumeration.J;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import ivas.gov.bisp.enumeration.OooOOOO.OooO0O0;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p090m.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class aF {
    private static int a = 0;
    private static int b = 1;
    public static final String[] c = {"UPDATE", "DELETE", "INSERT"};
    public final String[] f;
    public Map<String, Set<String>> g;
    public final aI h;
    public volatile SupportSQLiteStatement k;
    public aZT l;
    public AtomicBoolean j = new AtomicBoolean(false);
    public volatile boolean i = false;

    @SuppressLint({"RestrictedApi"})
    public final OooO0O0<aZU, aZV> d = new c();
    public Runnable m = new aZS();
    public final HashMap<String, Integer> e = new HashMap<>();

    public static class aZT {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public aZT(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] c() {
            synchronized (this) {
                if (this.d && !this.e) {
                    int length = this.a.length;
                    for (int i = 0; i < length; i = ((i | 1) << 1) - (i ^ 1)) {
                        boolean z = this.a[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i]) {
                            this.c[i] = !z ? 2 : 1;
                        } else {
                            this.c[i] = 0;
                        }
                        zArr[i] = z;
                    }
                    this.e = true;
                    this.d = false;
                    return this.c;
                }
                return null;
            }
        }
    }

    public static abstract class aZU {
        public abstract void a(Set<String> set);
    }

    public static class aZV {
        public final int[] a;
        public final String[] b;
        public final aZU c;
        public final Set<String> d;
    }

    static {
        int i = (1 & 67) + (1 | 67);
        int i2 = i % 128;
        a = i2;
        int i3 = i % 2;
        int i4 = (i2 & (-84)) | ((~i2) & 83);
        int i5 = -(-((i2 & 83) << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public aF(aI aIVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        int i;
        this.h = aIVar;
        this.l = new aZT(strArr.length);
        this.g = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f = new String[length];
        int i2 = 2 % 2;
        int i3 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= length) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                int i4 = a;
                int i5 = ((i4 & 2) + (i4 | 2)) - 1;
                b = i5 % 128;
                int i6 = i5 % 2;
                while (it.hasNext()) {
                    int i7 = a;
                    int i8 = i7 & 9;
                    int i9 = ((i7 ^ 9) | i8) << 1;
                    int i10 = -((i7 | 9) & (~i8));
                    int i11 = (i9 & i10) + (i10 | i9);
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        it.next().getValue();
                        obj.hashCode();
                        throw null;
                    }
                    Map.Entry<String, String> next = it.next();
                    String value = next.getValue();
                    Locale locale = Locale.US;
                    int i12 = b + 33;
                    a = i12 % 128;
                    if (i12 % 2 != 0) {
                        this.e.containsKey(value.toLowerCase(locale));
                        obj.hashCode();
                        throw null;
                    }
                    String lowerCase = value.toLowerCase(locale);
                    if (this.e.containsKey(lowerCase)) {
                        String key = next.getKey();
                        int i13 = b;
                        int i14 = (i13 & 79) + (i13 | 79);
                        a = i14 % 128;
                        int i15 = i14 % 2;
                        String lowerCase2 = key.toLowerCase(locale);
                        HashMap<String, Integer> map3 = this.e;
                        int i16 = b;
                        int i17 = (i16 | 77) << 1;
                        int i18 = -(((~i16) & 77) | (i16 & (-78)));
                        int i19 = (i17 & i18) + (i18 | i17);
                        a = i19 % 128;
                        if (i19 % 2 != 0) {
                            map3.put(lowerCase2, map3.get(lowerCase));
                            int i20 = 40 / 0;
                        } else {
                            map3.put(lowerCase2, map3.get(lowerCase));
                        }
                    }
                }
                int i21 = a;
                int i22 = ((i21 ^ 9) | (i21 & 9)) << 1;
                int i23 = -(((~i21) & 9) | (i21 & (-10)));
                int i24 = (i22 & i23) + (i23 | i22);
                b = i24 % 128;
                int i25 = i24 % 2;
                return;
            }
            int i26 = a + 31;
            b = i26 % 128;
            int i27 = i26 % 2;
            String str = strArr[i3];
            Locale locale2 = Locale.US;
            int i28 = b;
            int i29 = i28 & 71;
            int i30 = -(-((i28 ^ 71) | i29));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            a = i31 % 128;
            int i32 = i31 % 2;
            String lowerCase3 = str.toLowerCase(locale2);
            HashMap<String, Integer> map4 = this.e;
            Integer numValueOf = Integer.valueOf(i3);
            int i33 = b;
            int i34 = (i33 & 10) + (i33 | 10);
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            a = i35 % 128;
            int i36 = i35 % 2;
            map4.put(lowerCase3, numValueOf);
            String str2 = map.get(strArr[i3]);
            int i37 = b;
            int i38 = i37 & 7;
            int i39 = (i37 ^ 7) | i38;
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            int i41 = i40 % 128;
            a = i41;
            if (i40 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str3 = str2;
            if (str3 != null) {
                this.f[i3] = str3.toLowerCase(locale2);
                int i42 = b;
                i = (-2) - (((i42 & 110) + (i42 | 110)) ^ (-1));
                a = i % 128;
            } else {
                this.f[i3] = lowerCase3;
                i = (i41 ^ 89) + ((i41 & 89) << 1);
                b = i % 128;
            }
            int i43 = i % 2;
            i3 = (((i3 | 2) << 1) - (i3 ^ 2)) - 1;
            int i44 = a;
            int i45 = i44 & 99;
            int i46 = (i45 - (~((i44 ^ 99) | i45))) - 1;
            b = i46 % 128;
            int i47 = i46 % 2;
        }
    }

    public void f(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.h.k.readLock();
                lock.lock();
                try {
                    int[] iArrC = this.l.c();
                    if (iArrC == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrC.length;
                    supportSQLiteDatabase.beginTransaction();
                    int i = 0;
                    while (i < length) {
                        try {
                            int i2 = iArrC[i];
                            if (i2 == 1) {
                                d(supportSQLiteDatabase, i);
                            } else if (i2 == 2) {
                                e(supportSQLiteDatabase, i);
                            }
                            int i3 = i & (-111);
                            int i4 = -(-((i ^ (-111)) | i3));
                            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                            int i6 = i5 & 112;
                            int i7 = (i5 ^ 112) | i6;
                            i = (i6 | i7) + (i6 & i7);
                        } catch (Throwable th) {
                            supportSQLiteDatabase.endTransaction();
                            throw th;
                        }
                    }
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                    aZT azt = this.l;
                    synchronized (azt) {
                        azt.e = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }

    public class aZS implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public aZS() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r5v9 */
        @Override // java.lang.Runnable
        public void run() {
            ?? C;
            ReentrantReadWriteLock.ReadLock lock = aF.this.h.k.readLock();
            try {
                try {
                    lock.lock();
                    if (!aF.this.c()) {
                        lock.unlock();
                        return;
                    }
                    if (!aF.this.j.compareAndSet(true, false)) {
                        lock.unlock();
                        return;
                    }
                    if (aF.this.h.j()) {
                        lock.unlock();
                        return;
                    }
                    aI aIVar = aF.this.h;
                    C = aIVar.h;
                    if (C != 0) {
                        try {
                            SupportSQLiteDatabase writableDatabase = aIVar.f.getWritableDatabase();
                            writableDatabase.beginTransaction();
                            try {
                                Set<Integer> setC = c();
                                try {
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                    C = setC;
                                } catch (Throwable th) {
                                    th = th;
                                    writableDatabase.endTransaction();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                        } catch (IllegalStateException e2) {
                            e = e2;
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                        }
                    } else {
                        C = c();
                    }
                    lock.unlock();
                    if (C != 0 || C.isEmpty()) {
                        return;
                    }
                    synchronized (aF.this.d) {
                        Iterator it = aF.this.d.iterator();
                        while (true) {
                            c.aTg atg = (c.aTg) it;
                            if (atg.hasNext()) {
                                aZV azv = (aZV) ((Map.Entry) atg.next()).getValue();
                                int length = azv.a.length;
                                Set<String> hashSet = null;
                                for (int i = 0; i < length; i = ((i & 2) + (i | 2)) - 1) {
                                    if (C.contains(Integer.valueOf(azv.a[i]))) {
                                        if (length == 1) {
                                            hashSet = azv.d;
                                        } else {
                                            if (hashSet == null) {
                                                hashSet = new HashSet<>(length);
                                            }
                                            hashSet.add(azv.b[i]);
                                        }
                                    }
                                }
                                if (hashSet != null) {
                                    azv.c.a(hashSet);
                                }
                            }
                        }
                    }
                    return;
                } catch (SQLiteException | IllegalStateException e3) {
                    e = e3;
                    C = 0;
                }
                lock.unlock();
                if (C != 0) {
                    return;
                } else {
                    return;
                }
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        }

        public final Set<Integer> c() {
            int i = 2 % 2;
            HashSet hashSet = new HashSet();
            Object obj = null;
            Cursor cursorK = aF.this.h.k(new C0321u("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
            int i2 = a;
            int i3 = i2 & 39;
            int i4 = (i2 ^ 39) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 73 / 0;
            }
            while (!(!cursorK.moveToNext())) {
                try {
                    int i7 = a;
                    int i8 = i7 & 59;
                    int i9 = (i8 - (~((i7 ^ 59) | i8))) - 1;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    Integer numValueOf = Integer.valueOf(cursorK.getInt(0));
                    int i11 = b;
                    int i12 = i11 & 33;
                    int i13 = ((((i11 ^ 33) | i12) << 1) - (~(-((i11 | 33) & (~i12))))) - 1;
                    a = i13 % 128;
                    if (i13 % 2 != 0) {
                        hashSet.add(numValueOf);
                        obj.hashCode();
                        throw null;
                    }
                    hashSet.add(numValueOf);
                    int i14 = a + 47;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                } catch (Throwable th) {
                    cursorK.close();
                    throw th;
                }
            }
            cursorK.close();
            if (!hashSet.isEmpty()) {
                int i16 = a + 31;
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    aF.this.k.executeUpdateDelete();
                    int i17 = 17 / 0;
                } else {
                    aF.this.k.executeUpdateDelete();
                }
                int i18 = b;
                int i19 = i18 & 123;
                int i20 = (i18 | 123) & (~i19);
                int i21 = i19 << 1;
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
            }
            int i24 = b;
            int i25 = i24 & 79;
            int i26 = -(-((i24 ^ 79) | i25));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            a = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 66 / 0;
            }
            return hashSet;
        }
    }

    public final void e(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        int i2 = 2 % 2;
        String str = this.f[i];
        StringBuilder sb = new StringBuilder();
        int i3 = b;
        int i4 = (i3 & (-60)) | ((~i3) & 59);
        int i5 = (i3 & 59) << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        String[] strArr = c;
        int length = strArr.length;
        int i8 = i3 & 121;
        int i9 = ((((i3 ^ 121) | i8) << 1) - (~(-((i3 | 121) & (~i8))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (true) {
            Object obj = null;
            if (i11 >= length) {
                int i12 = a + 14;
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i14 = a + 3;
            b = i14 % 128;
            int i15 = i14 % 2;
            String str2 = strArr[i11];
            sb.setLength(0);
            int i16 = a;
            int i17 = (i16 & (-68)) | ((~i16) & 67);
            int i18 = (i16 & 67) << 1;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                sb.append("DROP TRIGGER IF EXISTS ");
                sb.append("`");
                obj.hashCode();
                throw null;
            }
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            int i20 = b;
            int i21 = (((i20 & (-6)) | ((~i20) & 5)) - (~((i20 & 5) << 1))) - 1;
            a = i21 % 128;
            if (i21 % 2 != 0) {
                sb.append("_");
                sb.append(str2);
                obj.hashCode();
                throw null;
            }
            sb.append("_");
            sb.append(str2);
            int i22 = b;
            int i23 = ((i22 | 24) << 1) - (i22 ^ 24);
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            sb.append("`");
            supportSQLiteDatabase.execSQL(sb.toString());
            i11 = ((i11 & 1) << 1) + (i11 ^ 1);
            int i26 = b;
            int i27 = i26 ^ 103;
            int i28 = -(-((i26 & 103) << 1));
            int i29 = (i27 & i28) + (i28 | i27);
            a = i29 % 128;
            int i30 = i29 % 2;
        }
    }

    public boolean c() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = (i3 - (~((i2 ^ 79) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            SupportSQLiteDatabase supportSQLiteDatabase = this.h.d;
            throw null;
        }
        SupportSQLiteDatabase supportSQLiteDatabase2 = this.h.d;
        boolean z2 = false;
        if (supportSQLiteDatabase2 == null || (!supportSQLiteDatabase2.isOpen())) {
            int i5 = a;
            int i6 = i5 | 55;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 55)) & i6);
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        } else {
            int i11 = b;
            int i12 = (i11 ^ 23) + ((i11 & 23) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        }
        if (!z) {
            int i14 = b;
            int i15 = (i14 | 5) << 1;
            int i16 = -((i14 & (-6)) | ((~i14) & 5));
            int i17 = (i15 & i16) + (i15 | i16);
            a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = (((i14 | 66) << 1) - (i14 ^ 66)) - 1;
            a = i19 % 128;
            if (i19 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!this.i) {
            int i20 = b + 70;
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            a = i21 % 128;
            if (i21 % 2 != 0) {
                this.h.f.getWritableDatabase();
                int i22 = 57 / 0;
            } else {
                this.h.f.getWritableDatabase();
            }
        }
        if (!(!this.i)) {
            int i23 = a;
            int i24 = ((i23 ^ 41) | (i23 & 41)) << 1;
            int i25 = -(((~i23) & 41) | (i23 & (-42)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            b = i26 % 128;
            int i27 = i26 % 2;
            return true;
        }
        int i28 = b + 3;
        a = i28 % 128;
        if (i28 % 2 != 0) {
            Log.e("ROOM", "database is not initialized even though it is open");
            z2 = true;
        } else {
            Log.e("ROOM", "database is not initialized even though it is open");
        }
        int i29 = a;
        int i30 = (i29 ^ 75) + ((i29 & 75) << 1);
        b = i30 % 128;
        int i31 = i30 % 2;
        return z2;
    }

    public final void d(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String string;
        String str;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i3 = b;
        int i4 = (i3 & (-116)) | ((~i3) & 115);
        int i5 = (i3 & 115) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        sb.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(i);
        int i8 = b + 93;
        a = i8 % 128;
        int i9 = 0;
        if (i8 % 2 != 0) {
            sb.append(", 0)");
            string = sb.toString();
            int i10 = 81 / 0;
        } else {
            sb.append(", 0)");
            string = sb.toString();
        }
        int i11 = b;
        int i12 = i11 & 35;
        int i13 = i12 + ((i11 ^ 35) | i12);
        a = i13 % 128;
        int i14 = i13 % 2;
        supportSQLiteDatabase.execSQL(string);
        String str2 = this.f[i];
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = c;
        int i15 = b;
        int i16 = i15 & 109;
        int i17 = (i15 | 109) & (~i16);
        int i18 = i16 << 1;
        int i19 = (i17 & i18) + (i17 | i18);
        a = i19 % 128;
        int length = i19 % 2 != 0 ? strArr.length : strArr.length;
        int i20 = 0;
        while (i20 < length) {
            int i21 = a;
            int i22 = (((i21 & (-58)) | ((~i21) & 57)) - (~((i21 & 57) << 1))) - 1;
            b = i22 % 128;
            if (i22 % 2 == 0) {
                str = strArr[i20];
                sb2.setLength(1);
            } else {
                str = strArr[i20];
                sb2.setLength(i9);
            }
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            sb2.append(str2);
            sb2.append("_");
            int i23 = a;
            int i24 = i23 & 5;
            int i25 = i23 | 5;
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            Object obj = null;
            if (i26 % 2 == 0) {
                sb2.append(str);
                sb2.append("`");
                sb2.append(" AFTER ");
                sb2.append(str);
                throw null;
            }
            sb2.append(str);
            sb2.append("`");
            sb2.append(" AFTER ");
            sb2.append(str);
            int i27 = b + 38;
            int i28 = (i27 ^ (-1)) + (i27 << 1);
            a = i28 % 128;
            if (i28 % 2 != 0) {
                sb2.append(" ON `");
                sb2.append(str2);
                sb2.append("` BEGIN UPDATE ");
                throw null;
            }
            sb2.append(" ON `");
            sb2.append(str2);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            int i29 = a;
            int i30 = i29 ^ 21;
            int i31 = -(-((i29 & 21) << 1));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            b = i32 % 128;
            if (i32 % 2 == 0) {
                sb2.append(" WHERE ");
                sb2.append("table_id");
                sb2.append(" = ");
                sb2.append(i);
                obj.hashCode();
                throw null;
            }
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            int i33 = b;
            int i34 = (i33 ^ 17) + ((i33 & 17) << 1);
            a = i34 % 128;
            int i35 = i34 % 2;
            sb2.append("; END");
            supportSQLiteDatabase.execSQL(sb2.toString());
            i20 = (((i20 & (-2)) | ((~i20) & 1)) - (~(-(-((i20 & 1) << 1))))) - 1;
            int i36 = b;
            int i37 = i36 & 125;
            int i38 = (i37 - (~((i36 ^ 125) | i37))) - 1;
            a = i38 % 128;
            if (i38 % 2 != 0) {
                int i39 = 4 % 4;
            }
            i9 = 0;
        }
        int i40 = a;
        int i41 = (i40 & (-68)) | ((~i40) & 67);
        int i42 = -(-((i40 & 67) << 1));
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        b = i43 % 128;
        int i44 = i43 % 2;
    }
}
