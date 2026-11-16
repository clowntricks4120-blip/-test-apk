package ivas.gov.bisp.enumeration.J;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import ivas.gov.bisp.enumeration.p020at.aq;
import ivas.gov.bisp.enumeration.p020at.as;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public class aH implements SupportSQLiteOpenHelper {
    private static int a = 0;
    private static int b = 1;
    public final Context c;
    public final String d;
    public final File e;
    public final int f;
    public aA g;
    public final SupportSQLiteOpenHelper h;
    public boolean i;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 97) + (i2 | 97);
        a = i3 % 128;
        int i4 = i3 % 2;
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.h;
        if (i4 == 0) {
            return supportSQLiteOpenHelper.getDatabaseName();
        }
        supportSQLiteOpenHelper.getDatabaseName();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        SupportSQLiteDatabase writableDatabase;
        synchronized (this) {
            if (!this.i) {
                c();
                this.i = true;
            }
            writableDatabase = this.h.getWritableDatabase();
        }
        return writableDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = ((i2 ^ 65) | i3) << 1;
        int i5 = -((i2 | 65) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.h.setWriteAheadLoggingEnabled(z);
        if (i7 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:15:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cc A[Catch: all -> 0x00bf, PHI: r5
  0x00cc: PHI (r5v9 java.nio.channels.FileChannel) = (r5v8 java.nio.channels.FileChannel), (r5v17 java.nio.channels.FileChannel) binds: [B:27:0x00ca, B:21:0x00bc] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x00bf, blocks: (B:19:0x00b8, B:30:0x00e8, B:34:0x0104, B:36:0x0112, B:39:0x0121, B:41:0x0135, B:69:0x01ff, B:70:0x0202, B:28:0x00cc, B:26:0x00c6), top: B:75:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8 A[Catch: all -> 0x00bf, PHI: r5
  0x00e8: PHI (r5v16 java.nio.channels.FileChannel) = (r5v8 java.nio.channels.FileChannel), (r5v17 java.nio.channels.FileChannel) binds: [B:27:0x00ca, B:21:0x00bc] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00bf, blocks: (B:19:0x00b8, B:30:0x00e8, B:34:0x0104, B:36:0x0112, B:39:0x0121, B:41:0x0135, B:69:0x01ff, B:70:0x0202, B:28:0x00cc, B:26:0x00c6), top: B:75:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ff A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #0 {all -> 0x00bf, blocks: (B:19:0x00b8, B:30:0x00e8, B:34:0x0104, B:36:0x0112, B:39:0x0121, B:41:0x0135, B:69:0x01ff, B:70:0x0202, B:28:0x00cc, B:26:0x00c6), top: B:75:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x020a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0135 A[EDGE_INSN: B:76:0x0135->B:41:0x0135 BREAK  A[LOOP:0: B:36:0x0112->B:40:0x0124], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017c, code lost:
    
        if (r1.mkdirs() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0183, code lost:
    
        if (r1.mkdirs() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0186, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("Failed to create directories for ");
        r0.append(r14.getAbsolutePath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019c, code lost:
    
        throw new java.io.IOException(r0.toString());
     */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.FileOutputStream, java.nio.channels.spi.AbstractInterruptibleChannel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.io.File r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.J.aH.b(java.io.File):void");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057 A[PHI: r3
  0x0057: PHI (r3v8 java.io.File) = (r3v7 java.io.File), (r3v27 java.io.File) binds: [B:12:0x0055, B:9:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0066 A[PHI: r3
  0x0066: PHI (r3v26 java.io.File) = (r3v7 java.io.File), (r3v27 java.io.File) binds: [B:12:0x0055, B:9:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void c() {
        String databaseName;
        Context context;
        File databasePath;
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = ((i2 ^ 115) | i3) << 1;
        int i5 = -((i2 | 115) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            databaseName = this.h.getDatabaseName();
            context = this.c;
            int i7 = 2 / 0;
        } else {
            databaseName = this.h.getDatabaseName();
            context = this.c;
        }
        int i8 = a;
        int i9 = i8 & 89;
        int i10 = -(-(i8 | 89));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            databasePath = context.getDatabasePath(databaseName);
            int i12 = 50 / 0;
            if (this.g != null) {
                int i13 = a;
                int i14 = (i13 ^ 35) + ((i13 & 35) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                z = false;
            } else {
                int i16 = a;
                int i17 = (i16 & 103) + (i16 | 103);
                b = i17 % 128;
                int i18 = i17 % 2;
                z = true;
            }
        } else {
            databasePath = context.getDatabasePath(databaseName);
            if (this.g != null) {
                int i19 = a;
                int i110 = (i19 ^ 35) + ((i19 & 35) << 1);
                b = i110 % 128;
                int i111 = i110 % 2;
                z = false;
            } else {
                int i112 = a;
                int i113 = (i112 & 103) + (i112 | 103);
                b = i113 % 128;
                int i114 = i113 % 2;
                z = true;
            }
        }
        as asVar = new as(databaseName, this.c.getFilesDir(), z);
        int i20 = a;
        int i21 = i20 & 45;
        int i22 = i21 + ((i20 ^ 45) | i21);
        b = i22 % 128;
        int i23 = i22 % 2;
        try {
            asVar.e.lock();
            boolean z2 = asVar.f;
            int i24 = b;
            int i25 = i24 & 51;
            int i26 = i24 | 51;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            a = i27 % 128;
            Object obj = null;
            if (i27 % 2 != 0) {
                throw null;
            }
            if (z2) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(asVar.d);
                    int i28 = b + 9;
                    a = i28 % 128;
                    if (i28 % 2 != 0) {
                        FileChannel channel = fileOutputStream.getChannel();
                        asVar.g = channel;
                        channel.lock();
                        obj.hashCode();
                        throw null;
                    }
                    FileChannel channel2 = fileOutputStream.getChannel();
                    asVar.g = channel2;
                    channel2.lock();
                    int i29 = a;
                    int i30 = i29 & 65;
                    int i31 = i30 + ((i29 ^ 65) | i30);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                } catch (IOException e) {
                    throw new IllegalStateException("Unable to grab copy lock.", e);
                }
            }
            if (!databasePath.exists()) {
                int i33 = a;
                int i34 = i33 & 7;
                int i35 = i34 + ((i33 ^ 7) | i34);
                b = i35 % 128;
                try {
                    if (i35 % 2 == 0) {
                        b(databasePath);
                        asVar.c();
                        obj.hashCode();
                        throw null;
                    }
                    b(databasePath);
                    asVar.c();
                    int i36 = b + 83;
                    a = i36 % 128;
                    if (i36 % 2 != 0) {
                        throw null;
                    }
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            }
            if (this.g == null) {
                int i37 = b;
                int i38 = i37 & 7;
                int i39 = (i38 - (~((i37 ^ 7) | i38))) - 1;
                a = i39 % 128;
                if (i39 % 2 == 0) {
                    asVar.c();
                    return;
                } else {
                    asVar.c();
                    obj.hashCode();
                    throw null;
                }
            }
            try {
                int iC = aq.c(databasePath);
                int i40 = this.f;
                if (iC == i40) {
                    int i41 = a;
                    int i42 = (i41 & 39) + (i41 | 39);
                    b = i42 % 128;
                    int i43 = i42 % 2;
                    asVar.c();
                    int i44 = a + 69;
                    b = i44 % 128;
                    int i45 = i44 % 2;
                    return;
                }
                if (this.g.c(iC, i40)) {
                    int i46 = b;
                    int i47 = (-2) - ((((i46 | 40) << 1) - (i46 ^ 40)) ^ (-1));
                    a = i47 % 128;
                    if (i47 % 2 != 0) {
                        asVar.c();
                        throw null;
                    }
                    asVar.c();
                    int i48 = a;
                    int i49 = (((i48 ^ 95) | (i48 & 95)) << 1) - (((~i48) & 95) | (i48 & (-96)));
                    b = i49 % 128;
                    if (i49 % 2 == 0) {
                        int i50 = 33 / 0;
                        return;
                    }
                    return;
                }
                if (this.c.deleteDatabase(databaseName)) {
                    int i51 = b;
                    int i52 = i51 & 61;
                    int i53 = ((i51 ^ 61) | i52) << 1;
                    int i54 = -((i51 | 61) & (~i52));
                    int i55 = (i53 & i54) + (i54 | i53);
                    a = i55 % 128;
                    int i56 = i55 % 2;
                    try {
                        b(databasePath);
                        int i57 = a;
                        int i58 = ((i57 | 9) << 1) - (i57 ^ 9);
                        b = i58 % 128;
                        int i59 = i58 % 2;
                    } catch (IOException unused) {
                    }
                }
                asVar.c();
                int i60 = a;
                int i61 = i60 & 55;
                int i62 = ((i60 | 55) & (~i61)) + (i61 << 1);
                b = i62 % 128;
                if (i62 % 2 == 0) {
                    int i63 = 39 / 0;
                }
            } catch (IOException unused2) {
                asVar.c();
            }
        } catch (Throwable th) {
            asVar.c();
            throw th;
        }
    }
}
