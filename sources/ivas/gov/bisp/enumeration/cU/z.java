package ivas.gov.bisp.enumeration.cU;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class z implements i {
    private static int a = 1;
    private static int b;
    public final File c;
    public final String d;
    public final ClassLoader e;
    public final Map<String, Object> f;
    public final Set<String> g;

    public z(File file) throws IOException {
        Map<String, Object> mapD;
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("File directory doesn't exist: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
        if (!file.isDirectory()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File doesn't refer to a directory: ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
        int i = a;
        int i2 = ((i | 113) << 1) - (i ^ 113);
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.c = file;
            this.d = null;
            this.e = null;
            int i3 = 65 / 0;
        } else {
            this.c = file;
            this.d = null;
            this.e = null;
        }
        int i4 = i + 73;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            mapD = d(j("ZoneInfoMap"));
            this.f = mapD;
            int i5 = 81 / 0;
        } else {
            mapD = d(j("ZoneInfoMap"));
            this.f = mapD;
        }
        TreeSet treeSet = new TreeSet(((ConcurrentHashMap) mapD).keySet());
        int i6 = a;
        int i7 = i6 ^ 113;
        int i8 = ((i6 & 113) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        this.g = Collections.unmodifiableSortedSet(treeSet);
        int i12 = b + 41;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cU.i
    public Set<String> e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 77) << 1) - (i2 ^ 77);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Set<String> set = this.g;
        int i4 = i2 & 5;
        int i5 = i4 + ((i2 ^ 5) | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public static void f(DataInputStream dataInputStream, Map<String, Object> map) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = (((i2 ^ 119) | i3) << 1) - ((i2 | 119) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        int unsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        int i6 = a;
        int i7 = (i6 ^ 27) + ((i6 & 27) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int i10 = 0;
        while (i10 < unsignedShort) {
            int i11 = a;
            int i12 = i11 & 11;
            int i13 = (i11 | 11) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                strArr[i10] = dataInputStream.readUTF().intern();
                int i16 = i10 & (-77);
                int i17 = -(-((i10 ^ (-77)) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                int i19 = i18 & 84;
                i10 = (i19 - (~((i18 ^ 84) | i19))) - 1;
            } else {
                strArr[i10] = dataInputStream.readUTF().intern();
                int i20 = i10 & 1;
                int i21 = i10 | 1;
                i10 = (i20 ^ i21) + ((i21 & i20) << 1);
            }
            int i22 = b;
            int i23 = ((((i22 ^ 89) | (i22 & 89)) << 1) - (~(-(((~i22) & 89) | (i22 & (-90)))))) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        int i25 = a;
        int i26 = i25 & 35;
        int i27 = ((i25 ^ 35) | i26) << 1;
        int i28 = -((i25 | 35) & (~i26));
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        b = i29 % 128;
        int i30 = i29 % 2;
        while (i9 < unsignedShort2) {
            int i31 = a;
            int i32 = ((i31 | 121) << 1) - (i31 ^ 121);
            b = i32 % 128;
            int i33 = i32 % 2;
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                int i34 = b;
                int i35 = ((i34 ^ 84) + ((i34 & 84) << 1)) - 1;
                a = i35 % 128;
                if (i35 % 2 == 0) {
                    int i36 = i9 + 5;
                    int i37 = (i36 ^ (-1)) + (i36 << 1);
                    i9 = ((i37 & 89) + (i37 | 89)) - 1;
                } else {
                    int i38 = i9 & 92;
                    int i39 = (i9 ^ 92) | i38;
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    i9 = (((i40 | (-90)) << 1) - (i40 ^ (-90))) - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
        int i41 = a + 53;
        b = i41 % 128;
        int i42 = i41 % 2;
    }

    public class bGP implements PrivilegedAction<InputStream> {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ String c;

        public bGP(String str) {
            this.c = str;
        }

        @Override // java.security.PrivilegedAction
        public InputStream run() {
            InputStream systemResourceAsStream;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 81) | (i3 & 81)) << 1;
            int i5 = -(((~i3) & 81) | (i3 & (-82)));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                ClassLoader classLoader = z.this.e;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ClassLoader classLoader2 = z.this.e;
            if (classLoader2 != null) {
                systemResourceAsStream = classLoader2.getResourceAsStream(this.c);
                int i7 = a;
                int i8 = ((((i7 ^ 73) | (i7 & 73)) << 1) - (~(-(((~i7) & 73) | (i7 & (-74)))))) - 1;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    i = 5;
                    int i9 = i / 2;
                }
            } else {
                systemResourceAsStream = ClassLoader.getSystemResourceAsStream(this.c);
                int i10 = a;
                int i11 = i10 & 75;
                int i12 = ((i10 | 75) & (~i11)) + (i11 << 1);
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    i = 4;
                    int i13 = i / 2;
                }
            }
            int i14 = a;
            int i15 = i14 & 9;
            int i16 = i14 | 9;
            int i17 = (i15 & i16) + (i16 | i15);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 64 / 0;
            }
            return systemResourceAsStream;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cU.i
    public AbstractC0242a b(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = a + 81;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.f.get(str);
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.f.get(str);
        int i3 = b;
        int i4 = i3 ^ 55;
        int i5 = (((i3 & 55) | i4) << 1) - i4;
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (obj2 == null) {
            int i7 = i6 & 9;
            int i8 = (((~i7) & (i6 | 9)) - (~(-(-(i7 << 1))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        if (!(obj2 instanceof SoftReference)) {
            if (!str.equals(obj2)) {
                AbstractC0242a abstractC0242aB = b((String) obj2);
                int i10 = b;
                int i11 = i10 ^ 93;
                int i12 = ((i10 & 93) | i11) << 1;
                int i13 = -i11;
                int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                a = i14 % 128;
                int i15 = i14 % 2;
                return abstractC0242aB;
            }
            int i16 = a;
            int i17 = (i16 ^ 107) + ((i16 & 107) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            AbstractC0242a abstractC0242aI = i(str);
            int i19 = a;
            int i20 = (((i19 ^ 7) | (i19 & 7)) << 1) - (((~i19) & 7) | (i19 & (-8)));
            b = i20 % 128;
            if (i20 % 2 == 0) {
                return abstractC0242aI;
            }
            obj.hashCode();
            throw null;
        }
        int i21 = (i6 ^ 65) + ((i6 & 65) << 1);
        b = i21 % 128;
        if (i21 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AbstractC0242a abstractC0242a = (AbstractC0242a) ((SoftReference) obj2).get();
        if (abstractC0242a == null) {
            AbstractC0242a abstractC0242aI2 = i(str);
            int i22 = b;
            int i23 = i22 ^ 39;
            int i24 = -(-((i22 & 39) << 1));
            int i25 = (i23 & i24) + (i24 | i23);
            a = i25 % 128;
            int i26 = i25 % 2;
            return abstractC0242aI2;
        }
        int i27 = b;
        int i28 = (((i27 ^ 5) | (i27 & 5)) << 1) - (((~i27) & 5) | (i27 & (-6)));
        a = i28 % 128;
        if (i28 % 2 != 0) {
            return abstractC0242a;
        }
        obj.hashCode();
        throw null;
    }

    public static Map<String, Object> d(InputStream inputStream) {
        int i = 2 % 2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int i2 = a;
        int i3 = i2 & 35;
        int i4 = (((i2 ^ 35) | i3) << 1) - ((i2 | 35) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
        try {
            f(dataInputStream, concurrentHashMap);
            try {
                dataInputStream.close();
                int i6 = a;
                int i7 = (-2) - (((i6 & 74) + (i6 | 74)) ^ (-1));
                b = i7 % 128;
                int i8 = i7 % 2;
            } catch (IOException unused) {
            }
            SoftReference softReference = new SoftReference(AbstractC0242a.c);
            int i9 = a;
            int i10 = (((i9 ^ 65) | (i9 & 65)) << 1) - (((~i9) & 65) | (i9 & (-66)));
            b = i10 % 128;
            int i11 = i10 % 2;
            concurrentHashMap.put("UTC", softReference);
            int i12 = a;
            int i13 = i12 & 71;
            int i14 = (i12 ^ 71) | i13;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            int i16 = i15 % 2;
            return concurrentHashMap;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00c1 A[PHI: r6
  0x00c1: PHI (r6v11 java.lang.ClassLoader) = (r6v10 java.lang.ClassLoader), (r6v16 java.lang.ClassLoader) binds: [B:13:0x00bf, B:10:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x00ec  */
    public final InputStream j(String str) throws IOException {
        InputStream fileInputStream;
        ClassLoader classLoader;
        String string;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 13) << 1) - (i2 ^ 13);
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this.c != null) {
            fileInputStream = new FileInputStream(new File(this.c, str));
            int i5 = b;
            int i6 = ((i5 ^ 24) + ((i5 & 24) << 1)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = ((i5 ^ 77) | (i5 & 77)) << 1;
            int i9 = -(((~i5) & 77) | (i5 & (-78)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
        } else {
            String strConcat = this.d.concat(str);
            bGP bgp = new bGP(strConcat);
            int i12 = a;
            int i13 = ((i12 | 120) << 1) - (i12 ^ 120);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            fileInputStream = (InputStream) AccessController.doPrivileged(bgp);
            if (fileInputStream == null) {
                StringBuilder sb = new StringBuilder(40);
                int i16 = a;
                int i17 = ((i16 & 52) + (i16 | 52)) - 1;
                b = i17 % 128;
                int i18 = i17 % 2;
                sb.append("Resource not found: \"");
                sb.append(strConcat);
                int i19 = b;
                int i20 = ((i19 ^ 41) | (i19 & 41)) << 1;
                int i21 = -(((~i19) & 41) | (i19 & (-42)));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                a = i22 % 128;
                if (i22 % 2 == 0) {
                    sb.append("\" ClassLoader: ");
                    classLoader = this.e;
                    int i23 = 67 / 0;
                    if (classLoader != null) {
                        int i24 = b;
                        int i25 = (i24 | 21) << 1;
                        int i26 = -(i24 ^ 21);
                        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                        string = classLoader.toString();
                        int i29 = b;
                        int i30 = i29 & 101;
                        int i31 = -(-((i29 ^ 101) | i30));
                        int i32 = (i30 & i31) + (i31 | i30);
                        a = i32 % 128;
                        int i33 = i32 % 2;
                    } else {
                        string = "system";
                        int i34 = b;
                        int i35 = i34 & 77;
                        int i36 = -(-((i34 ^ 77) | i35));
                        int i37 = (i35 & i36) + (i36 | i35);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                    }
                } else {
                    sb.append("\" ClassLoader: ");
                    classLoader = this.e;
                    if (classLoader != null) {
                        int i210 = b;
                        int i211 = (i210 | 21) << 1;
                        int i212 = -(i210 ^ 21);
                        int i213 = ((i211 | i212) << 1) - (i212 ^ i211);
                        a = i213 % 128;
                        int i214 = i213 % 2;
                        string = classLoader.toString();
                        int i215 = b;
                        int i39 = i215 & 101;
                        int i310 = -(-((i215 ^ 101) | i39));
                        int i311 = (i39 & i310) + (i310 | i39);
                        a = i311 % 128;
                        int i312 = i311 % 2;
                    } else {
                        string = "system";
                        int i313 = b;
                        int i314 = i313 & 77;
                        int i315 = -(-((i313 ^ 77) | i314));
                        int i316 = (i314 & i315) + (i315 | i314);
                        a = i316 % 128;
                        int i317 = i316 % 2;
                    }
                }
                sb.append(string);
                throw new IOException(sb.toString());
            }
        }
        int i40 = b;
        int i41 = i40 & 95;
        int i42 = ((i40 ^ 95) | i41) << 1;
        int i43 = -((i40 | 95) & (~i41));
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        a = i44 % 128;
        int i45 = i44 % 2;
        return fileInputStream;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final AbstractC0242a i(String str) throws Throwable {
        ?? J;
        AbstractC0242a abstractC0242aB;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 125;
        int i4 = (i3 - (~((i2 ^ 125) | i3))) - 1;
        a = i4 % 128;
        ?? r2 = i4 % 2;
        ?? r1 = 0;
        ?? r3 = 0;
        try {
            try {
                if (r2 == 0) {
                    boolean z = j(str) instanceof DataInput;
                    throw null;
                }
                J = j(str);
                try {
                    if (J instanceof DataInput) {
                        int i5 = (-2) - ((a + 2) ^ (-1));
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            c.b((DataInput) J, str);
                            (r3 == true ? 1 : 0).hashCode();
                            throw null;
                        }
                        abstractC0242aB = c.b((DataInput) J, str);
                        int i6 = b + 59;
                        a = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        DataInputStream dataInputStream = new DataInputStream(J);
                        int i8 = a;
                        int i9 = i8 & 93;
                        int i10 = (i8 ^ 93) | i9;
                        int i11 = (i9 & i10) + (i10 | i9);
                        b = i11 % 128;
                        if (i11 % 2 != 0) {
                            abstractC0242aB = c.b(dataInputStream, str);
                            int i12 = 59 / 0;
                        } else {
                            abstractC0242aB = c.b(dataInputStream, str);
                        }
                    }
                    Map<String, Object> map = this.f;
                    SoftReference softReference = new SoftReference(abstractC0242aB);
                    int i13 = a;
                    int i14 = (i13 & 111) + (i13 | 111);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    map.put(str, softReference);
                    try {
                        J.close();
                        int i16 = b;
                        int i17 = (i16 & 71) + (i16 | 71);
                        a = i17 % 128;
                        int i18 = i17 % 2;
                    } catch (IOException unused) {
                    }
                    int i19 = a;
                    int i20 = i19 & 21;
                    int i21 = -(-(i19 | 21));
                    int i22 = (i20 & i21) + (i21 | i20);
                    b = i22 % 128;
                    if (i22 % 2 == 0) {
                        return abstractC0242aB;
                    }
                    throw null;
                } catch (IOException unused2) {
                    this.f.remove(str);
                    if (J != 0) {
                        int i23 = b;
                        int i24 = i23 | 51;
                        int i25 = i24 << 1;
                        int i26 = -((~(i23 & 51)) & i24);
                        int i27 = (i25 & i26) + (i26 | i25);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                        try {
                            J.close();
                            int i29 = b;
                            int i30 = i29 & 87;
                            int i31 = (i29 | 87) & (~i30);
                            int i32 = i30 << 1;
                            int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                            a = i33 % 128;
                            if (i33 % 2 == 0) {
                                int i34 = 4 % 5;
                            }
                        } catch (IOException unused3) {
                        }
                    }
                    int i35 = a + 75;
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    return null;
                }
            } catch (IOException unused4) {
                J = 0;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    int i37 = b;
                    int i38 = ((i37 & 5) - (~(-(-(i37 | 5))))) - 1;
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    try {
                        r1.close();
                        int i40 = b;
                        int i41 = (i40 ^ 99) + ((i40 & 99) << 1);
                        a = i41 % 128;
                        int i42 = i41 % 2;
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = r2;
            if (r1 != 0) {
                int i310 = b;
                int i311 = ((i310 & 5) - (~(-(-(i310 | 5))))) - 1;
                a = i311 % 128;
                int i312 = i311 % 2;
                r1.close();
                int i43 = b;
                int i44 = (i43 ^ 99) + ((i43 & 99) << 1);
                a = i44 % 128;
                int i45 = i44 % 2;
            }
            throw th;
        }
    }

    public z(String str) {
        if (!str.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            int i = b + 20;
            int i2 = (i ^ (-1)) + (i << 1);
            a = i2 % 128;
            int i3 = i2 % 2;
            sb.append('/');
            str = sb.toString();
            int i4 = a + 30;
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        Object obj = null;
        this.c = null;
        this.d = str;
        ClassLoader classLoader = z.class.getClassLoader();
        int i7 = b;
        int i8 = ((i7 & 67) - (~(i7 | 67))) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            this.e = classLoader;
            d(j("ZoneInfoMap"));
            throw null;
        }
        this.e = classLoader;
        Map<String, Object> mapD = d(j("ZoneInfoMap"));
        this.f = mapD;
        TreeSet treeSet = new TreeSet(((ConcurrentHashMap) mapD).keySet());
        int i9 = b;
        int i10 = (i9 & 8) + (i9 | 8);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            this.g = Collections.unmodifiableSortedSet(treeSet);
        } else {
            this.g = Collections.unmodifiableSortedSet(treeSet);
            obj.hashCode();
            throw null;
        }
    }
}
