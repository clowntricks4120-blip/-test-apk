package ivas.gov.bisp.enumeration.cC;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class v {
    private static int a = 0;
    private static int b = 1;

    public static class bDr extends ObjectInputStream {
        private static int a = 0;
        private static int b = 1;
        public static final Set c;
        public final Class d;
        public boolean e;

        static {
            HashSet hashSet = new HashSet();
            c = hashSet;
            hashSet.add("java.util.TreeMap");
            int i = a + 29;
            b = i % 128;
            int i2 = i % 2;
            Object obj = null;
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            if (i2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = b;
            int i4 = (i3 & 43) + (i3 | 43);
            a = i4 % 128;
            int i5 = i4 % 2;
            hashSet.add("ivas.gov.bisp.enumeration.cC.r");
            hashSet.add("java.util.ArrayList");
            if (i5 != 0) {
                throw null;
            }
            hashSet.add("ivas.gov.bisp.enumeration.cC.O");
            hashSet.add("[B");
            int i6 = b + 13;
            a = i6 % 128;
            int i7 = i6 % 2;
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            int i8 = b;
            int i9 = ((i8 & (-48)) | ((~i8) & 47)) + ((i8 & 47) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            if (i10 != 0) {
                throw null;
            }
            int i11 = b;
            int i12 = (i11 & (-24)) | ((~i11) & 23);
            int i13 = (i11 & 23) << 1;
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
            hashSet.add("ivas.gov.bisp.enumeration.cC.i");
            int i16 = a;
            int i17 = ((i16 & 120) + (i16 | 120)) - 1;
            b = i17 % 128;
            if (i17 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public bDr(Class cls, InputStream inputStream) {
            super(inputStream);
            this.e = false;
            this.d = cls;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 51;
            int i4 = (((i2 & 51) | i3) << 1) - i3;
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (!this.e) {
                int i5 = i2 & 75;
                int i6 = ((i2 | 75) & (~i5)) + (i5 << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                if (!objectStreamClass.getName().equals(this.d.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                int i8 = a;
                int i9 = (i8 & 123) + (i8 | 123);
                int i10 = i9 % 128;
                b = i10;
                int i11 = i9 % 2;
                this.e = true;
                int i12 = (((i10 ^ 105) | (i10 & 105)) << 1) - (((~i10) & 105) | (i10 & (-106)));
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 4 / 2;
                }
            } else {
                Set set = c;
                String name = objectStreamClass.getName();
                HashSet hashSet = (HashSet) set;
                int i14 = a + 29;
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    hashSet.contains(name);
                    obj.hashCode();
                    throw null;
                }
                if (!hashSet.contains(name)) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            }
            Class<?> clsResolveClass = super.resolveClass(objectStreamClass);
            int i15 = b;
            int i16 = (i15 & (-18)) | ((~i15) & 17);
            int i17 = -(-((i15 & 17) << 1));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                return clsResolveClass;
            }
            throw null;
        }
    }

    public static int b(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 103;
        int i5 = (i3 & 103) << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i3 & 39;
        int i9 = (i3 | 39) & (~i8);
        int i10 = i8 << 1;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                break;
            }
            int i14 = b;
            int i15 = ((i14 | 97) << 1) - (i14 ^ 97);
            a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i13 & 1;
            i13 = (i17 - (~((i13 ^ 1) | i17))) - 1;
            int i18 = (((i14 | 86) << 1) - (i14 ^ 86)) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a;
        int i21 = (i20 & (-20)) | ((~i20) & 19);
        int i22 = -(-((i20 & 19) << 1));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 48 / 0;
        }
        return i13;
    }

    public static long c(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 ^ 103) + ((i5 & 103) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        Objects.requireNonNull(bArr, "in == null");
        long j2 = i7 != 0 ? 1L : 0L;
        int i8 = b;
        int i9 = i8 & 89;
        int i10 = (i9 - (~(-(-((i8 ^ 89) | i9))))) - 1;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 4;
        }
        int i12 = i;
        while (true) {
            int i13 = -(-i2);
            int i14 = ((~i13) & i) | ((~i) & i13);
            int i15 = -(-((i13 & i) << 1));
            if (i12 >= ((i14 | i15) << 1) - (i15 ^ i14)) {
                break;
            }
            int i16 = a;
            int i17 = i16 & 103;
            int i18 = (((i16 ^ 103) | i17) << 1) - ((i16 | 103) & (~i17));
            int i19 = i18 % 128;
            b = i19;
            if (i18 % 2 == 0) {
                j = j2 << 71;
                byte b2 = bArr[i12];
                int i20 = b2 & 7560;
                i3 = ((b2 ^ 7560) | i20) & (~i20);
            } else {
                j = j2 << 8;
                i3 = bArr[i12] & 255;
            }
            j2 = j | ((long) i3);
            i12 = ((i12 | 1) << 1) - (i12 ^ 1);
            int i21 = i19 & 121;
            int i22 = (i19 ^ 121) | i21;
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = a;
        int i26 = (i25 & (-64)) | ((~i25) & 63);
        int i27 = -(-((i25 & 63) << 1));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 1 / 0;
        }
        return j2;
    }

    public static byte[] d(byte[] bArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = i3 + ((i2 ^ 41) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        Objects.requireNonNull(bArr, "in == null");
        byte[] bArr2 = new byte[bArr.length];
        int i6 = a;
        int i7 = i6 & 45;
        int i8 = (i6 | 45) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i12 = a;
        int i13 = ((i12 & 109) - (~(i12 | 109))) - 1;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    public static byte[][] e(byte[][] bArr) {
        byte[] bArr2;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 5;
        int i5 = (((i3 ^ 5) | i4) << 1) - ((i3 | 5) & (~i4));
        a = i5 % 128;
        if (i5 % 2 != 0) {
            i(bArr);
            throw null;
        }
        if (i(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr3 = new byte[bArr.length][];
        int i6 = b;
        int i7 = (i6 ^ 51) + ((i6 & 51) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < bArr.length) {
            int i10 = a + 33;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                bArr3[i9] = new byte[bArr[i9].length];
                bArr2 = bArr[i9];
                i = 1;
            } else {
                bArr3[i9] = new byte[bArr[i9].length];
                bArr2 = bArr[i9];
                i = 0;
            }
            System.arraycopy(bArr2, i, bArr3[i9], 0, bArr[i9].length);
            int i11 = i9 & 1;
            int i12 = ((i9 ^ 1) | i11) << 1;
            int i13 = -((i9 | 1) & (~i11));
            i9 = ((i12 | i13) << 1) - (i13 ^ i12);
            int i14 = a;
            int i15 = i14 ^ 101;
            int i16 = -(-((i14 & 101) << 1));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = b;
        int i20 = (i19 ^ 3) + ((i19 & 3) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        r3 = (r2 ^ 19) + ((r2 & 19) << 1);
        ivas.gov.bisp.enumeration.cC.v.a = r3 % 128;
        r3 = r3 % 2;
        r3 = r2 ^ 11;
        r2 = ((((r2 & 11) | r3) << 1) - (~(-r3))) - 1;
        ivas.gov.bisp.enumeration.cC.v.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if (r1 >= r7.length) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        r2 = ivas.gov.bisp.enumeration.cC.v.a;
        r3 = (r2 ^ 115) + ((r2 & 115) << 1);
        ivas.gov.bisp.enumeration.cC.v.b = r3 % 128;
        r3 = r3 % 2;
        r4 = r8 & r1;
        r3 = ((r8 ^ r1) | r4) << 1;
        r4 = -((~r4) & (r8 | r1));
        r6[(r3 & r4) + (r3 | r4)] = r7[r1];
        r1 = (((r1 | (-106)) << 1) - (r1 ^ (-106))) + 107;
        r3 = r2 & 93;
        r3 = (r3 - (~((r2 ^ 93) | r3))) - 1;
        ivas.gov.bisp.enumeration.cC.v.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a5, code lost:
    
        r6 = ivas.gov.bisp.enumeration.cC.v.a;
        r8 = r6 & 39;
        r7 = (((r6 ^ 39) | r8) << 1) - ((r6 | 39) & (~r8));
        ivas.gov.bisp.enumeration.cC.v.b = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c0, code lost:
    
        throw new java.lang.IllegalArgumentException("src length + offset must not be greater than size of destination");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c8, code lost:
    
        throw new java.lang.IllegalArgumentException("offset hast to be >= 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r8 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r8 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r2 = ivas.gov.bisp.enumeration.cC.v.a;
        r3 = (((r2 ^ 73) | (r2 & 73)) << 1) - (((~r2) & 73) | (r2 & (-74)));
        r2 = r3 % 128;
        ivas.gov.bisp.enumeration.cC.v.b = r2;
        r3 = r3 % 2;
        r3 = r7.length;
        r4 = -(~r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (((-2) - (((r3 ^ r4) + ((r3 & r4) << 1)) ^ (-1))) > r6.length) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(byte[] r6, byte[] r7, int r8) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cC.v.f(byte[], byte[], int):void");
    }

    public static byte[] g(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 81;
        int i6 = (((i4 ^ 81) | i5) << 1) - ((~i5) & (i4 | 81));
        b = i6 % 128;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        int i7 = i4 | 107;
        int i8 = i7 << 1;
        int i9 = -((~(i4 & 107)) & i7);
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        int i13 = ((~i2) & i) | ((~i) & i2);
        int i14 = (i & i2) << 1;
        if ((i13 & i14) + (i13 | i14) > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        int i15 = i11 & 35;
        int i16 = (i15 - (~(-(-((i11 ^ 35) | i15))))) - 1;
        int i17 = i16 % 128;
        a = i17;
        int i18 = i16 % 2;
        byte[] bArr2 = new byte[i2];
        int i19 = i17 + 117;
        b = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 3 / 2;
        }
        int i21 = 0;
        while (i21 < i2) {
            int i22 = b;
            int i23 = (i22 ^ 43) + ((i22 & 43) << 1);
            int i24 = i23 % 128;
            a = i24;
            if (i23 % 2 != 0) {
                bArr2[i21] = bArr[i * i21];
                int i25 = i21 ^ 70;
                int i26 = ((i21 & 70) | i25) << 1;
                int i27 = -i25;
                i21 = (i26 ^ i27) + ((i26 & i27) << 1);
            } else {
                int i28 = -(-i21);
                int i29 = i & i28;
                int i30 = -(-((i28 ^ i) | i29));
                bArr2[i21] = bArr[((i29 | i30) << 1) - (i30 ^ i29)];
                i21 = (((i21 | 2) << 1) - (i21 ^ 2)) - 1;
            }
            int i31 = ((i24 ^ 34) + ((i24 & 34) << 1)) - 1;
            b = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 4 / 4;
            }
        }
        int i33 = b;
        int i34 = ((i33 ^ 11) - (~(-(-((i33 & 11) << 1))))) - 1;
        a = i34 % 128;
        int i35 = i34 % 2;
        return bArr2;
    }

    public static Object h(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        int i = 2 % 2;
        bDr bdr = new bDr(cls, new ByteArrayInputStream(bArr));
        int i2 = b;
        int i3 = ((i2 ^ 10) + ((i2 & 10) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            bdr.readObject();
            bdr.available();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object object = bdr.readObject();
        if (bdr.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (!cls.isInstance(object)) {
            throw new IOException("unexpected class found in ObjectInputStream");
        }
        int i4 = b;
        int i5 = ((i4 & 100) + (i4 | 100)) - 1;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 105;
        int i9 = i8 + ((i6 ^ 105) | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        return object;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r8 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r1 = r2 & 87;
        r1 = r1 + ((r2 ^ 87) | r1);
        ivas.gov.bisp.enumeration.cC.v.b = r1 % 128;
        r1 = r1 % 2;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r1 >= r8.length) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        r2 = ivas.gov.bisp.enumeration.cC.v.b;
        r6 = (r2 & 31) + (r2 | 31);
        r7 = r6 % 128;
        ivas.gov.bisp.enumeration.cC.v.a = r7;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r8[r1] != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = r2 + 73;
        r8 = r2 % 128;
        ivas.gov.bisp.enumeration.cC.v.a = r8;
        r2 = r2 % 2;
        r8 = r8 + 61;
        ivas.gov.bisp.enumeration.cC.v.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if ((r8 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r2 = r1 & (-9);
        r1 = -(-((r1 ^ (-9)) | r2));
        r5 = (r2 & r1) + (r1 | r2);
        r1 = ((r5 & 11) + (r5 | 11)) - 1;
        r7 = r7 + 39;
        ivas.gov.bisp.enumeration.cC.v.b = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        r8 = ivas.gov.bisp.enumeration.cC.v.b;
        r1 = r8 ^ 25;
        r8 = ((r8 & 25) | r1) << 1;
        r1 = -r1;
        r2 = (r8 & r1) + (r8 | r1);
        ivas.gov.bisp.enumeration.cC.v.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if ((r2 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r8 = r2 & 9;
        r1 = (~r8) & (r2 | 9);
        r8 = -(-(r8 << 1));
        r5 = ((r1 | r8) << 1) - (r8 ^ r1);
        ivas.gov.bisp.enumeration.cC.v.b = r5 % 128;
        r5 = r5 % 2;
        r2 = r2 + 88;
        r8 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.cC.v.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if ((r8 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(byte[][] r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cC.v.b
            r2 = r1 ^ 76
            r1 = r1 & 76
            r3 = 1
            int r1 = r1 << r3
            int r2 = r2 + r1
            r1 = r2 ^ (-1)
            int r1 = (-2) - r1
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cC.v.a = r2
            int r1 = r1 % r0
            r4 = 0
            if (r1 == 0) goto L1e
            r1 = 85
            int r1 = r1 / r4
            if (r8 != 0) goto L45
            goto L20
        L1e:
            if (r8 != 0) goto L45
        L20:
            r8 = r2 & 9
            int r1 = ~r8
            r5 = r2 | 9
            r1 = r1 & r5
            int r8 = r8 << r3
            int r8 = -r8
            int r8 = -r8
            r5 = r1 | r8
            int r5 = r5 << r3
            r8 = r8 ^ r1
            int r5 = r5 - r8
            int r8 = r5 % 128
            ivas.gov.bisp.enumeration.cC.v.b = r8
            int r5 = r5 % r0
            int r2 = r2 + 88
            r8 = r2 ^ (-1)
            int r1 = r2 << 1
            int r8 = r8 + r1
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.cC.v.b = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L44
            r8 = 20
            int r8 = r8 / r4
        L44:
            return r3
        L45:
            r1 = r2 & 87
            r2 = r2 ^ 87
            r2 = r2 | r1
            int r1 = r1 + r2
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cC.v.b = r2
            int r1 = r1 % r0
            r1 = r4
        L51:
            int r2 = r8.length
            r5 = 0
            if (r1 >= r2) goto L92
            int r2 = ivas.gov.bisp.enumeration.cC.v.b
            r6 = r2 & 31
            r7 = r2 | 31
            int r6 = r6 + r7
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.cC.v.a = r7
            int r6 = r6 % 2
            r6 = r8[r1]
            if (r6 != 0) goto L78
            int r2 = r2 + 73
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.cC.v.a = r8
            int r2 = r2 % r0
            int r8 = r8 + 61
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.cC.v.b = r1
            int r8 = r8 % r0
            if (r8 == 0) goto L77
            return r3
        L77:
            throw r5
        L78:
            r2 = r1 & (-9)
            r1 = r1 ^ (-9)
            r1 = r1 | r2
            int r1 = -r1
            int r1 = -r1
            r5 = r2 & r1
            r1 = r1 | r2
            int r5 = r5 + r1
            r1 = r5 & 11
            r2 = r5 | 11
            int r1 = r1 + r2
            int r1 = r1 - r3
            int r7 = r7 + 39
            int r2 = r7 % 128
            ivas.gov.bisp.enumeration.cC.v.b = r2
            int r7 = r7 % 2
            goto L51
        L92:
            int r8 = ivas.gov.bisp.enumeration.cC.v.b
            r1 = r8 ^ 25
            r8 = r8 & 25
            r8 = r8 | r1
            int r8 = r8 << r3
            int r1 = -r1
            r2 = r8 & r1
            r8 = r8 | r1
            int r2 = r2 + r8
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.cC.v.a = r8
            int r2 = r2 % r0
            if (r2 != 0) goto La7
            return r4
        La7:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cC.v.i(byte[][]):boolean");
    }

    public static boolean j(int i, long j) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 85;
        int i5 = (i3 | 85) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        if (j < 0) {
            throw new IllegalStateException("index must not be negative");
        }
        int i10 = i8 | 59;
        int i11 = i10 << 1;
        int i12 = -(i10 & (~(i8 & 59)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        if (j < (1 << i)) {
            int i16 = (i8 & (-126)) | ((~i8) & 125);
            int i17 = (i8 & 125) << 1;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            int i19 = i18 % 128;
            b = i19;
            int i20 = i18 % 2;
            int i21 = ((((i19 ^ 97) | (i19 & 97)) << 1) - (~(-(((~i19) & 97) | (i19 & (-98)))))) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
            z = true;
        } else {
            int i23 = ((i14 ^ 23) | (i14 & 23)) << 1;
            int i24 = -((i14 & (-24)) | ((~i14) & 23));
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            a = i25 % 128;
            int i26 = i25 % 2;
            z = false;
        }
        int i27 = b;
        int i28 = i27 & 93;
        int i29 = (((i27 ^ 93) | i28) << 1) - ((i27 | 93) & (~i28));
        a = i29 % 128;
        int i30 = i29 % 2;
        return z;
    }

    public static byte[] k(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 67) + ((i3 & 67) << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        byte[] bArr = new byte[i];
        int i7 = i + 31;
        int i8 = (i7 & (-32)) + (i7 | (-32));
        int i9 = i5 + 3;
        a = i9 % 128;
        int i10 = i9 % 2;
        while (i8 >= 0) {
            int i11 = b;
            int i12 = ((i11 ^ 107) | (i11 & 107)) << 1;
            int i13 = -(((~i11) & 107) | (i11 & (-108)));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            byte b2 = (byte) j;
            if (i14 % 2 != 0) {
                bArr[i8] = b2;
                j <<= 34;
                int i15 = i8 & 25;
                i8 = ((~i15) & (i8 | 25)) + (i15 << 1);
            } else {
                bArr[i8] = b2;
                j >>>= 8;
                int i16 = i8 + 109;
                int i17 = i16 & (-110);
                i8 = ((((i16 ^ (-110)) | i17) << 1) - (~(-((~i17) & (i16 | (-110)))))) - 1;
            }
        }
        int i18 = a;
        int i19 = ((i18 | 41) << 1) - (i18 ^ 41);
        b = i19 % 128;
        int i20 = i19 % 2;
        return bArr;
    }
}
