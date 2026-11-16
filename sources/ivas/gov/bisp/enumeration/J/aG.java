package ivas.gov.bisp.enumeration.J;

import androidx.sqlite.db.SupportSQLiteQuery;
import ivas.gov.bisp.enumeration.K.J;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class aG implements SupportSQLiteQuery, J {
    private static int a = 1;
    private static int b;
    public static final TreeMap<Integer, aG> c = new TreeMap<>();
    public int d;
    public volatile String e;
    public final long[] f;
    public final double[] g;
    public final byte[][] h;
    public final String[] i;
    public final int[] j;
    public final int k;

    static {
        int i = a;
        int i2 = i & 13;
        int i3 = i | 13;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public aG(int i) {
        this.k = i;
        int i2 = ((i | 1) << 1) - (i ^ 1);
        this.j = new int[i2];
        this.f = new long[i2];
        this.g = new double[i2];
        this.i = new String[i2];
        this.h = new byte[i2][];
    }

    public static aG d(String str, int i) {
        TreeMap<Integer, aG> treeMap = c;
        synchronized (treeMap) {
            Map.Entry<Integer, aG> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                aG aGVar = new aG(i);
                aGVar.e = str;
                aGVar.d = i;
                return aGVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            aG value = entryCeilingEntry.getValue();
            value.e = str;
            value.d = i;
            return value;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int b() {
        int i = 2 % 2;
        int i2 = a + 85;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.d;
        int i6 = i3 & 21;
        int i7 = (i3 ^ 21) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 61 / 0;
        }
        return i5;
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindDouble(int i, double d) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 81) + (i3 | 81);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.j[i] = 3;
        this.g[i] = d;
        int i7 = (i5 & (-96)) | ((~i5) & 95);
        int i8 = -(-((i5 & 95) << 1));
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindNull(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 66) + (i3 | 66)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.j[i] = 1;
        int i6 = (i3 ^ 47) + ((i3 & 47) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String c() {
        String str;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 6) + ((i2 & 6) << 1)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.e;
            int i4 = 54 / 0;
        } else {
            str = this.e;
        }
        int i5 = a;
        int i6 = i5 & 105;
        int i7 = -(-((i5 ^ 105) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = 2 % 2;
        int i2 = a + 83;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void e(J j) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 123;
        int i5 = -(-(i3 | 123));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2 != 0 ? 0 : 1;
        while (i7 <= this.d) {
            int i8 = b;
            int i9 = i8 & 83;
            int i10 = i9 + ((i8 ^ 83) | i9);
            int i11 = i10 % 128;
            a = i11;
            if (i10 % 2 != 0 ? (i = this.j[i7]) == 1 : (i = this.j[i7]) == 1) {
                j.bindNull(i7);
                int i12 = a;
                int i13 = (i12 & 121) + (i12 | 121);
                b = i13 % 128;
                int i14 = i13 % 2;
            } else if (i != 2) {
                int i15 = (i11 ^ 57) + ((i11 & 57) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
                if (i != 3) {
                    int i17 = i11 & 47;
                    int i18 = (((~i17) & (i11 | 47)) - (~(i17 << 1))) - 1;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    if (i != 4) {
                        int i20 = (i11 ^ 41) + ((i11 & 41) << 1);
                        int i21 = i20 % 128;
                        b = i21;
                        int i22 = i20 % 2;
                        if (i == 5) {
                            int i23 = i21 & 17;
                            int i24 = ((i21 | 17) & (~i23)) + (i23 << 1);
                            a = i24 % 128;
                            int i25 = i24 % 2;
                            j.bindBlob(i7, this.h[i7]);
                            int i26 = a;
                            int i27 = i26 ^ 107;
                            int i28 = (i26 & 107) << 1;
                            int i29 = (i27 & i28) + (i28 | i27);
                            b = i29 % 128;
                            int i30 = i29 % 2;
                        }
                    } else {
                        j.bindString(i7, this.i[i7]);
                        int i31 = b + 53;
                        a = i31 % 128;
                        int i32 = i31 % 2;
                    }
                } else {
                    j.bindDouble(i7, this.g[i7]);
                    int i33 = a + 101;
                    b = i33 % 128;
                    int i34 = i33 % 2;
                }
            } else {
                j.bindLong(i7, this.f[i7]);
                int i35 = a;
                int i36 = (((i35 | 100) << 1) - (i35 ^ 100)) - 1;
                b = i36 % 128;
                if (i36 % 2 != 0) {
                    int i37 = 3 / 2;
                }
            }
            i7 = (((i7 | 2) << 1) - (i7 ^ 2)) - 1;
            int i38 = b;
            int i39 = ((i38 ^ 119) | (i38 & 119)) << 1;
            int i40 = -(((~i38) & 119) | (i38 & (-120)));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            a = i41 % 128;
            int i42 = i41 % 2;
        }
        int i43 = b;
        int i44 = i43 & 51;
        int i45 = ((((i43 ^ 51) | i44) << 1) - (~(-((i43 | 51) & (~i44))))) - 1;
        a = i45 % 128;
        int i46 = i45 % 2;
    }

    public void h() {
        TreeMap<Integer, aG> treeMap = c;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.k), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (size > 0) {
                    it.next();
                    it.remove();
                    int i = ~size;
                    int i2 = -(-(size << 1));
                    size = ((i | i2) << 1) - (i2 ^ i);
                }
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindBlob(int i, byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - (((i3 ^ 122) + ((i3 & 122) << 1)) ^ (-1));
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            this.j[i] = 3;
        } else {
            this.j[i] = 5;
        }
        this.h[i] = bArr;
        int i6 = (-2) - ((i5 + 78) ^ (-1));
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 56 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindLong(int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 15) | (i3 & 15)) << 1) - ((i3 & (-16)) | ((~i3) & 15));
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.j[i] = 5;
            this.f[i] = j;
        } else {
            this.j[i] = 2;
            this.f[i] = j;
        }
        int i5 = i3 ^ 7;
        int i6 = ((i3 & 7) | i5) << 1;
        int i7 = -i5;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindString(int i, String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-28)) | ((~i3) & 27)) + ((i3 & 27) << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.j[i] = 4;
        } else {
            this.j[i] = 4;
        }
        this.i[i] = str;
        int i5 = ((i3 ^ 3) | (i3 & 3)) << 1;
        int i6 = -((i3 & (-4)) | ((~i3) & 3));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        int i8 = i7 % 2;
    }
}
