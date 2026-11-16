package ivas.gov.bisp.enumeration.p020at;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteQuery;
import ivas.gov.bisp.enumeration.J.aI;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public class aq {
    private static int a = 0;
    private static int b = 1;

    public static Cursor b(aI aIVar, SupportSQLiteQuery supportSQLiteQuery, boolean z, CancellationSignal cancellationSignal) {
        int numRows;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 97) | (i2 & 97)) << 1;
        int i4 = -(((~i2) & 97) | (i2 & (-98)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        Cursor cursorK = aIVar.k(supportSQLiteQuery, null);
        if (z) {
            int i7 = b;
            int i8 = i7 + 13;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                boolean z2 = cursorK instanceof AbstractWindowedCursor;
                throw null;
            }
            if (cursorK instanceof AbstractWindowedCursor) {
                int i9 = i7 & 41;
                int i10 = (i9 - (~(-(-((i7 ^ 41) | i9))))) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
                AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorK;
                int count = abstractWindowedCursor.getCount();
                if (!(!abstractWindowedCursor.hasWindow())) {
                    int i12 = b;
                    int i13 = i12 & 91;
                    int i14 = -(-(i12 | 91));
                    int i15 = (i13 & i14) + (i14 | i13);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    numRows = abstractWindowedCursor.getWindow().getNumRows();
                    int i17 = b;
                    int i18 = i17 & 107;
                    int i19 = (((i17 | 107) & (~i18)) - (~(i18 << 1))) - 1;
                    a = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    int i21 = a;
                    int i22 = i21 & 83;
                    int i23 = ((i21 ^ 83) | i22) << 1;
                    int i24 = -((i21 | 83) & (~i22));
                    int i25 = (i23 & i24) + (i24 | i23);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    numRows = count;
                }
                if (numRows < count) {
                    try {
                        MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                        int i27 = a + 101;
                        b = i27 % 128;
                        int i28 = i27 % 2;
                        while (true) {
                            int i29 = 0;
                            if (!abstractWindowedCursor.moveToNext()) {
                                abstractWindowedCursor.close();
                                int i30 = b;
                                int i31 = (i30 & 69) + (i30 | 69);
                                a = i31 % 128;
                                if (i31 % 2 != 0) {
                                    int i32 = 81 / 0;
                                }
                                return matrixCursor;
                            }
                            int i33 = b;
                            int i34 = ((i33 ^ 107) | (i33 & 107)) << 1;
                            int i35 = -(((~i33) & 107) | (i33 & (-108)));
                            int i36 = (i34 & i35) + (i35 | i34);
                            a = i36 % 128;
                            Object[] objArr = new Object[i36 % 2 != 0 ? abstractWindowedCursor.getColumnCount() : abstractWindowedCursor.getColumnCount()];
                            int i37 = a + 27;
                            b = i37 % 128;
                            int i38 = i37 % 2;
                            while (i29 < abstractWindowedCursor.getColumnCount()) {
                                int i39 = b + 41;
                                a = i39 % 128;
                                if (i39 % 2 != 0) {
                                    abstractWindowedCursor.getType(i29);
                                    obj.hashCode();
                                    throw null;
                                }
                                int type = abstractWindowedCursor.getType(i29);
                                if (type == 0) {
                                    objArr[i29] = null;
                                    int i40 = a;
                                    int i41 = ((i40 | 73) << 1) - (((~i40) & 73) | (i40 & (-74)));
                                    b = i41 % 128;
                                    int i42 = i41 % 2;
                                } else if (type != 1) {
                                    int i43 = b;
                                    int i44 = i43 & 51;
                                    int i45 = (i43 ^ 51) | i44;
                                    int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                                    a = i46 % 128;
                                    int i47 = i46 % 2;
                                    if (type != 2) {
                                        int i48 = (i43 & 115) + (i43 | 115);
                                        int i49 = i48 % 128;
                                        a = i49;
                                        if (i48 % 2 == 0 ? type == 3 : type == 5) {
                                            objArr[i29] = abstractWindowedCursor.getString(i29);
                                            int i50 = a + 89;
                                            b = i50 % 128;
                                            int i51 = i50 % 2;
                                        } else {
                                            int i52 = (i49 & (-82)) | ((~i49) & 81);
                                            int i53 = (i49 & 81) << 1;
                                            int i54 = (i52 & i53) + (i53 | i52);
                                            int i55 = i54 % 128;
                                            b = i55;
                                            int i56 = i54 % 2;
                                            if (type != 4) {
                                                throw new IllegalStateException();
                                            }
                                            int i57 = i55 & 11;
                                            int i58 = (i55 | 11) & (~i57);
                                            int i59 = i57 << 1;
                                            int i60 = (i58 & i59) + (i59 | i58);
                                            a = i60 % 128;
                                            int i61 = i60 % 2;
                                            objArr[i29] = abstractWindowedCursor.getBlob(i29);
                                            int i62 = b;
                                            int i63 = i62 & 39;
                                            int i64 = (i62 | 39) & (~i63);
                                            int i65 = i63 << 1;
                                            int i66 = (i64 & i65) + (i64 | i65);
                                            a = i66 % 128;
                                            int i67 = i66 % 2;
                                        }
                                    } else {
                                        objArr[i29] = Double.valueOf(abstractWindowedCursor.getDouble(i29));
                                        int i68 = a;
                                        int i69 = ((i68 | 41) << 1) - (i68 ^ 41);
                                        b = i69 % 128;
                                        int i70 = i69 % 2;
                                    }
                                } else {
                                    objArr[i29] = Long.valueOf(abstractWindowedCursor.getLong(i29));
                                    int i71 = b;
                                    int i72 = i71 & 75;
                                    int i73 = (i71 | 75) & (~i72);
                                    int i74 = i72 << 1;
                                    int i75 = (i73 & i74) + (i73 | i74);
                                    a = i75 % 128;
                                    int i76 = i75 % 2;
                                }
                                int i77 = i29 & 29;
                                int i78 = (i29 | 29) & (~i77);
                                int i79 = i77 << 1;
                                int i80 = (i78 & i79) + (i78 | i79);
                                i29 = (((i80 | (-28)) << 1) - (~(-(i80 ^ (-28))))) - 1;
                                int i81 = a;
                                int i82 = i81 ^ 51;
                                int i83 = -(-((i81 & 51) << 1));
                                int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                                b = i84 % 128;
                                int i85 = i84 % 2;
                            }
                            matrixCursor.addRow(objArr);
                            int i86 = a;
                            int i87 = (i86 ^ 29) + ((i86 & 29) << 1);
                            b = i87 % 128;
                            int i88 = i87 % 2;
                        }
                    } catch (Throwable th) {
                        abstractWindowedCursor.close();
                        throw th;
                    }
                }
            }
        }
        int i89 = b;
        int i90 = (i89 ^ 55) + ((i89 & 55) << 1);
        a = i90 % 128;
        int i91 = i90 % 2;
        return cursorK;
    }

    public static int c(File file) throws Throwable {
        int i = 2 % 2;
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileInputStream fileInputStream = new FileInputStream(file);
            int i2 = a;
            int i3 = i2 & 121;
            int i4 = i3 + ((i2 ^ 121) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            FileChannel channel = fileInputStream.getChannel();
            int i6 = a;
            int i7 = (i6 & 63) + (i6 | 63);
            b = i7 % 128;
            int i8 = i7 % 2;
            try {
                channel.tryLock(60L, 4L, true);
                channel.position(60L);
                int i9 = b;
                int i10 = i9 & 9;
                int i11 = (i9 ^ 9) | i10;
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                if (channel.read(byteBufferAllocate) != 4) {
                    IOException iOException = new IOException("Bad database header, unable to read 4 bytes at offset 60");
                    int i14 = b;
                    int i15 = ((i14 | 107) << 1) - (i14 ^ 107);
                    a = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw iOException;
                    }
                    fileChannel.hashCode();
                    throw null;
                }
                int i16 = a;
                int i17 = (i16 & 73) + (i16 | 73);
                b = i17 % 128;
                int i18 = i17 % 2;
                byteBufferAllocate.rewind();
                int i19 = byteBufferAllocate.getInt();
                int i20 = a;
                int i21 = i20 & 73;
                int i22 = (((i20 | 73) & (~i21)) - (~(i21 << 1))) - 1;
                b = i22 % 128;
                int i23 = i22 % 2;
                channel.close();
                int i24 = b + 13;
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 63 / 0;
                }
                return i19;
            } catch (Throwable th) {
                th = th;
                fileChannel = channel;
                if (fileChannel != null) {
                    fileChannel.close();
                    int i26 = a;
                    int i27 = i26 & 103;
                    int i28 = (i26 | 103) & (~i27);
                    int i29 = i27 << 1;
                    int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
