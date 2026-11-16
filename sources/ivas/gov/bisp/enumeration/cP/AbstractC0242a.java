package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.cJ.c;
import ivas.gov.bisp.enumeration.cJ.h;
import ivas.gov.bisp.enumeration.cU.e;
import ivas.gov.bisp.enumeration.cU.i;
import ivas.gov.bisp.enumeration.cU.p;
import ivas.gov.bisp.enumeration.cU.r;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cP.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0242a implements Serializable {
    private static int a = 1;
    private static int b;
    public final String g;
    public static final AbstractC0242a c = V.h;
    public static final AtomicReference<i> d = new AtomicReference<>();
    public static final AtomicReference<e> f = new AtomicReference<>();
    public static final AtomicReference<AbstractC0242a> e = new AtomicReference<>();

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cP.a$bFj */
    public static final class bFj {
        private static int a = 0;
        private static int b = 1;
        public static final Map<String, String> c;
        public static final c d;

        static {
            HashMap map = new HashMap();
            map.put("GMT", "UTC");
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            int i = a;
            int i2 = i & 11;
            int i3 = -(-((i ^ 11) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            int i5 = i4 % 2;
            map.put("ECT", "CET");
            map.put("EET", "EET");
            map.put("MIT", "Pacific/Apia");
            map.put("HST", "Pacific/Honolulu");
            map.put("AST", "America/Anchorage");
            int i6 = b;
            int i7 = (i6 & 1) + (i6 | 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            map.put("PST", "America/Los_Angeles");
            map.put("MST", "America/Denver");
            map.put("PNT", "America/Phoenix");
            map.put("CST", "America/Chicago");
            map.put("EST", "America/New_York");
            int i9 = a;
            int i10 = (((i9 | 8) << 1) - (i9 ^ 8)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            map.put("IET", "America/Indiana/Indianapolis");
            map.put("PRT", "America/Puerto_Rico");
            map.put("CNT", "America/St_Johns");
            map.put("AGT", "America/Argentina/Buenos_Aires");
            map.put("BET", "America/Sao_Paulo");
            int i12 = a;
            int i13 = (i12 & (-74)) | ((~i12) & 73);
            int i14 = -(-((i12 & 73) << 1));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
                int i16 = 40 / 0;
            } else {
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
            }
            map.put("IST", "Asia/Kolkata");
            map.put("BST", "Asia/Dhaka");
            map.put("VST", "Asia/Ho_Chi_Minh");
            map.put("CTT", "Asia/Shanghai");
            map.put("JST", "Asia/Tokyo");
            int i17 = b;
            int i18 = i17 ^ 49;
            int i19 = ((i17 & 49) | i18) << 1;
            int i20 = -i18;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            a = i21 % 128;
            int i22 = i21 % 2;
            map.put("ACT", "Australia/Darwin");
            map.put("AET", "Australia/Sydney");
            map.put("SST", "Pacific/Guadalcanal");
            map.put("NST", "Pacific/Auckland");
            c = Collections.unmodifiableMap(map);
            C0243l c0243l = new C0243l();
            h hVar = new h();
            hVar.u(null, true, 2, 4);
            d = hVar.x().j(c0243l);
            int i23 = a + 76;
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
    }

    static {
        int i = b;
        int i2 = ((i ^ 105) | (i & 105)) << 1;
        int i3 = -(((~i) & 105) | (i & (-106)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    public AbstractC0242a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.g = str;
        int i = a;
        int i2 = (i & 57) + (i | 57);
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static i g() {
        String property;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 45;
        int i5 = (i3 | 45) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            d.get();
            throw null;
        }
        i pVar = d.get();
        if (pVar == null) {
            try {
                String property2 = System.getProperty("org.joda.time.DateTimeZone.Provider");
                if (property2 != null) {
                    int i8 = b;
                    int i9 = i8 & 115;
                    int i10 = -(-((i8 ^ 115) | i9));
                    int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                    a = i11 % 128;
                    try {
                        Class<?> cls = Class.forName(property2, false, i11 % 2 == 0 ? AbstractC0242a.class.getClassLoader() : AbstractC0242a.class.getClassLoader());
                        if (!i.class.isAssignableFrom(cls)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("System property referred to class that does not implement ");
                            sb.append(i.class);
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
                            int i12 = a;
                            int i13 = i12 & 107;
                            int i14 = ((i12 | 107) & (~i13)) + (i13 << 1);
                            b = i14 % 128;
                            int i15 = i14 % 2;
                            throw illegalArgumentException;
                        }
                        int i16 = a;
                        int i17 = i16 ^ 75;
                        int i18 = (i16 & 75) << 1;
                        int i19 = (i17 & i18) + (i18 | i17);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        Constructor constructor = cls.asSubclass(i.class).getConstructor(new Class[0]);
                        int i21 = b + 115;
                        a = i21 % 128;
                        if (i21 % 2 == 0) {
                            i((i) constructor.newInstance(new Object[0]));
                            throw null;
                        }
                        pVar = (i) constructor.newInstance(new Object[0]);
                        i(pVar);
                        int i22 = a;
                        int i23 = i22 & 21;
                        int i24 = -(-((i22 ^ 21) | i23));
                        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                        int i26 = i25 % 128;
                        b = i26;
                        if (i25 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i27 = i26 + 105;
                        a = i27 % 128;
                        int i28 = i27 % 2;
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    try {
                        property = System.getProperty("org.joda.time.DateTimeZone.Folder");
                        if (property != null) {
                            try {
                                ivas.gov.bisp.enumeration.cU.z zVar = new ivas.gov.bisp.enumeration.cU.z(new File(property));
                                int i29 = a + 85;
                                b = i29 % 128;
                                int i30 = i29 % 2;
                                i(zVar);
                                int i31 = a;
                                i = ((i31 & (-66)) | ((~i31) & 65)) + ((i31 & 65) << 1);
                                b = i % 128;
                                if (i % 2 != 0) {
                                    int i32 = 4 % 4;
                                }
                                pVar = zVar;
                            } catch (Exception e3) {
                                throw new RuntimeException(e3);
                            }
                        } else {
                            try {
                                pVar = new ivas.gov.bisp.enumeration.cU.z("org/joda/time/tz/data");
                                int i33 = b;
                                int i34 = i33 & 33;
                                int i35 = -(-((i33 ^ 33) | i34));
                                int i36 = (i34 & i35) + (i35 | i34);
                                a = i36 % 128;
                                int i37 = i36 % 2;
                                i(pVar);
                                int i38 = a;
                                int i39 = (i38 & 47) + (i38 | 47);
                                b = i39 % 128;
                                int i40 = i39 % 2;
                            } catch (Exception unused) {
                                pVar = new p();
                            }
                        }
                    } catch (SecurityException unused2) {
                        pVar = new ivas.gov.bisp.enumeration.cU.z("org/joda/time/tz/data");
                        int i310 = b;
                        int i311 = i310 & 33;
                        int i312 = -(-((i310 ^ 33) | i311));
                        int i313 = (i311 & i312) + (i312 | i311);
                        a = i313 % 128;
                        int i314 = i313 % 2;
                        i(pVar);
                        int i315 = a;
                        int i316 = (i315 & 47) + (i315 | 47);
                        b = i316 % 128;
                        int i41 = i316 % 2;
                    }
                }
            } catch (SecurityException unused3) {
                property = System.getProperty("org.joda.time.DateTimeZone.Folder");
                if (property != null) {
                    ivas.gov.bisp.enumeration.cU.z zVar2 = new ivas.gov.bisp.enumeration.cU.z(new File(property));
                    int i210 = a + 85;
                    b = i210 % 128;
                    int i317 = i210 % 2;
                    i(zVar2);
                    int i318 = a;
                    i = ((i318 & (-66)) | ((~i318) & 65)) + ((i318 & 65) << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i319 = 4 % 4;
                    }
                    pVar = zVar2;
                } else {
                    pVar = new ivas.gov.bisp.enumeration.cU.z("org/joda/time/tz/data");
                    int i3110 = b;
                    int i3111 = i3110 & 33;
                    int i3112 = -(-((i3110 ^ 33) | i3111));
                    int i3113 = (i3111 & i3112) + (i3112 | i3111);
                    a = i3113 % 128;
                    int i3114 = i3113 % 2;
                    i(pVar);
                    int i3115 = a;
                    int i3116 = (i3115 & 47) + (i3115 | 47);
                    b = i3116 % 128;
                    int i42 = i3116 % 2;
                }
            }
            AtomicReference<i> atomicReference = d;
            if (!atomicReference.compareAndSet(null, pVar)) {
                int i43 = b;
                int i44 = i43 & 31;
                int i45 = -(-(i43 | 31));
                int i46 = (i44 & i45) + (i45 | i44);
                a = i46 % 128;
                if (i46 % 2 == 0) {
                    atomicReference.get();
                    throw null;
                }
                pVar = atomicReference.get();
            }
        }
        int i47 = a + 51;
        b = i47 % 128;
        int i48 = i47 % 2;
        return pVar;
    }

    public abstract boolean equals(Object obj);

    public long k(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (i3 - (~(-(-((i2 ^ 25) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        long jN = n(j);
        long j2 = j + jN;
        int i6 = b;
        int i7 = (i6 & 65) + (i6 | 65);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        if ((j ^ j2) < 0) {
            int i10 = i8 + 21;
            b = i10 % 128;
            if (i10 % 2 == 0 ? (j ^ jN) >= 0 : (j & jN) >= 0) {
                throw new ArithmeticException("Adding time zone offset caused overflow");
            }
        }
        int i11 = b;
        int i12 = i11 & 33;
        int i13 = -(-((i11 ^ 33) | i12));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        return j2;
    }

    public abstract String m(long j);

    public abstract int n(long j);

    public abstract int p(long j);

    public abstract boolean q();

    public abstract long r(long j);

    public abstract long s(long j);

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 61) | (i2 & 61)) << 1) - (((~i2) & 61) | (i2 & (-62)));
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.g;
        int i5 = i4 + 93;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[Catch: RuntimeException -> 0x005e, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x005e, blocks: (B:10:0x002f, B:14:0x0050, B:15:0x0055, B:16:0x0058, B:17:0x005b), top: B:42:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[Catch: RuntimeException -> 0x005e, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x005e, blocks: (B:10:0x002f, B:14:0x0050, B:15:0x0055, B:16:0x0058, B:17:0x005b), top: B:42:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r1
  0x002e: PHI (r1v9 ivas.gov.bisp.enumeration.cP.a) = (r1v8 ivas.gov.bisp.enumeration.cP.a), (r1v36 ivas.gov.bisp.enumeration.cP.a) binds: [B:8:0x002c, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static AbstractC0242a f() {
        AbstractC0242a abstractC0242aE;
        Object obj;
        AtomicReference<AbstractC0242a> atomicReference;
        int i;
        int i2;
        String property;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 39;
        int i7 = (i5 ^ 39) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            abstractC0242aE = e.get();
            int i9 = 87 / 0;
            if (abstractC0242aE == null) {
                obj = null;
                try {
                    property = System.getProperty("user.timezone");
                    if (property != null) {
                        int i10 = b;
                        int i11 = (i10 & (-66)) | ((~i10) & 65);
                        int i12 = (i10 & 65) << 1;
                        i3 = ((i11 | i12) << 1) - (i12 ^ i11);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            d(property);
                            obj.hashCode();
                            throw null;
                        }
                        abstractC0242aE = d(property);
                    }
                } catch (RuntimeException unused) {
                }
                if (abstractC0242aE == null) {
                    int i13 = a;
                    int i14 = (i13 & (-74)) | ((~i13) & 73);
                    int i15 = -(-((i13 & 73) << 1));
                    int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    try {
                        abstractC0242aE = e(TimeZone.getDefault());
                        int i18 = b;
                        int i19 = i18 & 101;
                        int i20 = (i18 ^ 101) | i19;
                        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                if (abstractC0242aE == null) {
                    int i23 = a;
                    int i24 = i23 & 83;
                    i2 = ((((i23 ^ 83) | i24) << 1) - (~(-((i23 | 83) & (~i24))))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        abstractC0242aE = c;
                        int i25 = 55 / 0;
                    } else {
                        abstractC0242aE = c;
                    }
                }
                atomicReference = e;
                if (!atomicReference.compareAndSet(null, abstractC0242aE)) {
                    int i26 = b;
                    int i27 = i26 & 41;
                    int i28 = -(-((i26 ^ 41) | i27));
                    i = (i27 & i28) + (i28 | i27);
                    a = i % 128;
                    if (i % 2 != 0) {
                        atomicReference.get();
                        throw null;
                    }
                    abstractC0242aE = atomicReference.get();
                }
            }
        } else {
            abstractC0242aE = e.get();
            if (abstractC0242aE == null) {
                obj = null;
                property = System.getProperty("user.timezone");
                if (property != null) {
                    int i110 = b;
                    int i111 = (i110 & (-66)) | ((~i110) & 65);
                    int i112 = (i110 & 65) << 1;
                    i3 = ((i111 | i112) << 1) - (i112 ^ i111);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        d(property);
                        obj.hashCode();
                        throw null;
                    }
                    abstractC0242aE = d(property);
                }
                if (abstractC0242aE == null) {
                    int i113 = a;
                    int i114 = (i113 & (-74)) | ((~i113) & 73);
                    int i115 = -(-((i113 & 73) << 1));
                    int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                    b = i116 % 128;
                    int i117 = i116 % 2;
                    abstractC0242aE = e(TimeZone.getDefault());
                    int i118 = b;
                    int i119 = i118 & 101;
                    int i29 = (i118 ^ 101) | i119;
                    int i210 = ((i119 | i29) << 1) - (i29 ^ i119);
                    a = i210 % 128;
                    int i211 = i210 % 2;
                }
                if (abstractC0242aE == null) {
                    int i212 = a;
                    int i213 = i212 & 83;
                    i2 = ((((i212 ^ 83) | i213) << 1) - (~(-((i212 | 83) & (~i213))))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        abstractC0242aE = c;
                        int i214 = 55 / 0;
                    } else {
                        abstractC0242aE = c;
                    }
                }
                atomicReference = e;
                if (!atomicReference.compareAndSet(null, abstractC0242aE)) {
                    int i215 = b;
                    int i216 = i215 & 41;
                    int i217 = -(-((i215 ^ 41) | i216));
                    i = (i216 & i217) + (i217 | i216);
                    a = i % 128;
                    if (i % 2 != 0) {
                        atomicReference.get();
                        throw null;
                    }
                    abstractC0242aE = atomicReference.get();
                }
            }
        }
        int i30 = b;
        int i31 = (((i30 | 67) << 1) - (~(-(i30 ^ 67)))) - 1;
        a = i31 % 128;
        int i32 = i31 % 2;
        return abstractC0242aE;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 17;
        int i4 = ((i2 & 17) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            iHashCode = this.g.hashCode() % 113;
        } else {
            int iHashCode2 = this.g.hashCode();
            int i7 = iHashCode2 ^ 57;
            int i8 = -(-((iHashCode2 & 57) << 1));
            iHashCode = ((i8 & i7) << 1) + (i7 ^ i8);
        }
        int i9 = a;
        int i10 = i9 & 111;
        int i11 = (i10 - (~((i9 ^ 111) | i10))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:14:0x005f A[Catch: Exception -> 0x006a, TRY_ENTER, TryCatch #1 {Exception -> 0x006a, blocks: (B:14:0x005f, B:19:0x0076, B:22:0x0089, B:24:0x009e, B:26:0x00bc, B:28:0x00eb, B:18:0x006d), top: B:45:0x005d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x006d A[Catch: Exception -> 0x006a, TryCatch #1 {Exception -> 0x006a, blocks: (B:14:0x005f, B:19:0x0076, B:22:0x0089, B:24:0x009e, B:26:0x00bc, B:28:0x00eb, B:18:0x006d), top: B:45:0x005d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc A[Catch: Exception -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x006a, blocks: (B:14:0x005f, B:19:0x0076, B:22:0x0089, B:24:0x009e, B:26:0x00bc, B:28:0x00eb, B:18:0x006d), top: B:45:0x005d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:33:0x0109  */
    /* JADX WARN: Code duplicated, block: B:36:0x010e  */
    /* JADX WARN: Code duplicated, block: B:39:0x012c  */
    /* JADX WARN: Code duplicated, block: B:40:0x014c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    public static e c() {
        e eVar;
        int i;
        e hVar;
        AtomicReference<e> atomicReference;
        String property;
        int i2;
        Class<?> cls;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (-2) - ((((i4 | 94) << 1) - (i4 ^ 94)) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            eVar = f.get();
            int i6 = 11 / 0;
            if (eVar == null) {
                int i7 = a;
                int i8 = i7 & 71;
                int i9 = ((i7 | 71) & (~i8)) + (i8 << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                try {
                    property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
                    if (property != null) {
                        int i11 = b;
                        int i12 = i11 ^ 39;
                        int i13 = -(-((i11 & 39) << 1));
                        i2 = (i12 ^ i13) + ((i13 & i12) << 1);
                        a = i2 % 128;
                        try {
                            if (i2 % 2 == 0) {
                                cls = Class.forName(property, true, AbstractC0242a.class.getClassLoader());
                            } else {
                                cls = Class.forName(property, false, AbstractC0242a.class.getClassLoader());
                            }
                            if (e.class.isAssignableFrom(cls)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("System property referred to class that does not implement ");
                                sb.append(e.class);
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
                                int i14 = a;
                                int i15 = i14 & 65;
                                int i16 = ((i14 ^ 65) | i15) << 1;
                                int i17 = -((i14 | 65) & (~i15));
                                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                                b = i18 % 128;
                                int i19 = i18 % 2;
                                throw illegalArgumentException;
                            }
                            int i20 = b;
                            int i21 = ((i20 | 23) << 1) - (i20 ^ 23);
                            a = i21 % 128;
                            int i22 = i21 % 2;
                            Constructor constructor = cls.asSubclass(e.class).getConstructor(new Class[0]);
                            int i23 = b + 45;
                            a = i23 % 128;
                            int i24 = i23 % 2;
                            hVar = (e) constructor.newInstance(new Object[0]);
                            int i25 = b;
                            int i26 = (((i25 ^ 115) | (i25 & 115)) << 1) - (((~i25) & 115) | (i25 & (-116)));
                            a = i26 % 128;
                            int i27 = i26 % 2;
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        int i28 = a;
                        int i29 = i28 & 91;
                        int i30 = (i28 | 91) & (~i29);
                        int i31 = -(-(i29 << 1));
                        i = (i30 ^ i31) + ((i30 & i31) << 1);
                        b = i % 128;
                        if (i % 2 != 0) {
                            int i32 = 2 % 3;
                        }
                        hVar = null;
                    }
                } catch (SecurityException unused) {
                }
                if (hVar == null) {
                    hVar = new ivas.gov.bisp.enumeration.cU.h();
                    int i33 = b;
                    int i34 = i33 & 49;
                    int i35 = -(-(i33 | 49));
                    int i36 = (i34 & i35) + (i35 | i34);
                    a = i36 % 128;
                    int i37 = i36 % 2;
                }
                atomicReference = f;
                if (atomicReference.compareAndSet(null, hVar)) {
                    eVar = hVar;
                } else {
                    int i38 = b + 95;
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    eVar = atomicReference.get();
                    int i40 = b;
                    int i41 = ((i40 & 49) - (~(-(-(i40 | 49))))) - 1;
                    a = i41 % 128;
                    int i42 = i41 % 2;
                }
            }
        } else {
            eVar = f.get();
            if (eVar == null) {
                int i43 = a;
                int i44 = i43 & 71;
                int i45 = ((i43 | 71) & (~i44)) + (i44 << 1);
                b = i45 % 128;
                int i110 = i45 % 2;
                property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
                if (property != null) {
                    int i111 = b;
                    int i112 = i111 ^ 39;
                    int i113 = -(-((i111 & 39) << 1));
                    i2 = (i112 ^ i113) + ((i113 & i112) << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        cls = Class.forName(property, true, AbstractC0242a.class.getClassLoader());
                    } else {
                        cls = Class.forName(property, false, AbstractC0242a.class.getClassLoader());
                    }
                    if (e.class.isAssignableFrom(cls)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("System property referred to class that does not implement ");
                        sb2.append(e.class);
                        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(sb2.toString());
                        int i114 = a;
                        int i115 = i114 & 65;
                        int i116 = ((i114 ^ 65) | i115) << 1;
                        int i117 = -((i114 | 65) & (~i115));
                        int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
                        b = i118 % 128;
                        int i119 = i118 % 2;
                        throw illegalArgumentException2;
                    }
                    int i210 = b;
                    int i211 = ((i210 | 23) << 1) - (i210 ^ 23);
                    a = i211 % 128;
                    int i212 = i211 % 2;
                    Constructor constructor2 = cls.asSubclass(e.class).getConstructor(new Class[0]);
                    int i213 = b + 45;
                    a = i213 % 128;
                    int i214 = i213 % 2;
                    hVar = (e) constructor2.newInstance(new Object[0]);
                    int i215 = b;
                    int i216 = (((i215 ^ 115) | (i215 & 115)) << 1) - (((~i215) & 115) | (i215 & (-116)));
                    a = i216 % 128;
                    int i217 = i216 % 2;
                } else {
                    int i218 = a;
                    int i219 = i218 & 91;
                    int i310 = (i218 | 91) & (~i219);
                    int i311 = -(-(i219 << 1));
                    i = (i310 ^ i311) + ((i310 & i311) << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i312 = 2 % 3;
                    }
                    hVar = null;
                }
                if (hVar == null) {
                    hVar = new ivas.gov.bisp.enumeration.cU.h();
                    int i313 = b;
                    int i314 = i313 & 49;
                    int i315 = -(-(i313 | 49));
                    int i316 = (i314 & i315) + (i315 | i314);
                    a = i316 % 128;
                    int i317 = i316 % 2;
                }
                atomicReference = f;
                if (atomicReference.compareAndSet(null, hVar)) {
                    int i318 = b + 95;
                    a = i318 % 128;
                    int i319 = i318 % 2;
                    eVar = atomicReference.get();
                    int i46 = b;
                    int i47 = ((i46 & 49) - (~(-(-(i46 | 49))))) - 1;
                    a = i47 % 128;
                    int i48 = i47 % 2;
                } else {
                    eVar = hVar;
                }
            }
        }
        int i49 = a;
        int i50 = i49 ^ 81;
        int i51 = -(-((i49 & 81) << 1));
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        b = i52 % 128;
        int i53 = i52 % 2;
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r1.size() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r2 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.a;
        r3 = r2 & 25;
        r2 = ((r2 | 25) & (~r3)) + (r3 << 1);
        ivas.gov.bisp.enumeration.cP.AbstractC0242a.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if ((r2 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        r2 = 13 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r1.contains("UTC") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r1.contains("UTC") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.c;
        r2 = r5.b("UTC");
        r3 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.b + 117;
        ivas.gov.bisp.enumeration.cP.AbstractC0242a.a = r3 % 128;
        r3 = r3 % 2;
        java.util.Objects.requireNonNull((ivas.gov.bisp.enumeration.cP.V) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if ((r2 instanceof ivas.gov.bisp.enumeration.cP.V) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.b;
        r2 = r1 & 117;
        r3 = ((~r2) & (r1 | 117)) + (r2 << 1);
        ivas.gov.bisp.enumeration.cP.AbstractC0242a.a = r3 % 128;
        r3 = r3 % 2;
        r1 = (-2) - ((r1 + 8) ^ (-1));
        ivas.gov.bisp.enumeration.cP.AbstractC0242a.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid UTC zone provided");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        throw new java.lang.IllegalArgumentException("The provider doesn't support UTC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (r1.size() != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.cU.i i(ivas.gov.bisp.enumeration.cU.i r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.a
            r2 = r1 ^ 67
            r1 = r1 & 67
            int r1 = r1 << 1
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cP.AbstractC0242a.b = r1
            int r2 = r2 % r0
            java.util.Set r1 = r5.e()
            if (r1 == 0) goto Lb1
            int r2 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.b
            r3 = r2 ^ 27
            r4 = r2 & 27
            r3 = r3 | r4
            int r3 = r3 << 1
            int r4 = ~r4
            r2 = r2 | 27
            r2 = r2 & r4
            int r2 = -r2
            r4 = r3 ^ r2
            r2 = r2 & r3
            int r2 = r2 << 1
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.cP.AbstractC0242a.a = r2
            int r4 = r4 % r0
            if (r4 != 0) goto L42
            int r2 = r1.size()
            r3 = 92
            int r3 = r3 / 0
            if (r2 == 0) goto Lb1
            goto L48
        L42:
            int r2 = r1.size()
            if (r2 == 0) goto Lb1
        L48:
            int r2 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.a
            r3 = r2 & 25
            int r4 = ~r3
            r2 = r2 | 25
            r2 = r2 & r4
            int r3 = r3 << 1
            int r2 = r2 + r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.cP.AbstractC0242a.b = r3
            int r2 = r2 % r0
            java.lang.String r3 = "UTC"
            if (r2 == 0) goto L67
            boolean r1 = r1.contains(r3)
            r2 = 13
            int r2 = r2 / 0
            if (r1 == 0) goto La9
            goto L6d
        L67:
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto La9
        L6d:
            ivas.gov.bisp.enumeration.cP.a r1 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.c
            ivas.gov.bisp.enumeration.cP.a r2 = r5.b(r3)
            int r3 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.b
            int r3 = r3 + 117
            int r4 = r3 % 128
            ivas.gov.bisp.enumeration.cP.AbstractC0242a.a = r4
            int r3 = r3 % r0
            ivas.gov.bisp.enumeration.cP.V r1 = (ivas.gov.bisp.enumeration.cP.V) r1
            java.util.Objects.requireNonNull(r1)
            boolean r1 = r2 instanceof ivas.gov.bisp.enumeration.cP.V
            if (r1 == 0) goto La1
            int r1 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.b
            r2 = r1 & 117(0x75, float:1.64E-43)
            int r3 = ~r2
            r4 = r1 | 117(0x75, float:1.64E-43)
            r3 = r3 & r4
            int r2 = r2 << 1
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.cP.AbstractC0242a.a = r2
            int r3 = r3 % r0
            int r1 = r1 + 8
            r1 = r1 ^ (-1)
            int r1 = (-2) - r1
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cP.AbstractC0242a.a = r2
            int r1 = r1 % r0
            return r5
        La1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid UTC zone provided"
            r5.<init>(r0)
            throw r5
        La9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The provider doesn't support UTC"
            r5.<init>(r0)
            throw r5
        Lb1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The provider doesn't have any available ids"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cP.AbstractC0242a.i(ivas.gov.bisp.enumeration.cU.i):ivas.gov.bisp.enumeration.cU.i");
    }

    public long l(AbstractC0242a abstractC0242a, long j) {
        int i = 2 % 2;
        int i2 = b + 53;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        if (abstractC0242a == null) {
            int i5 = i3 & 79;
            int i6 = (~i5) & (i3 | 79);
            int i7 = i5 << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            abstractC0242a = f();
            int i10 = a;
            int i11 = i10 & 21;
            int i12 = (i10 | 21) & (~i11);
            int i13 = i11 << 1;
            int i14 = (i12 & i13) + (i12 | i13);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        AbstractC0242a abstractC0242a2 = abstractC0242a;
        Object obj = null;
        if (abstractC0242a2 != this) {
            long jK = k(j);
            int i16 = b + 91;
            a = i16 % 128;
            if (i16 % 2 != 0) {
                return abstractC0242a2.j(jK, false, j);
            }
            abstractC0242a2.j(jK, false, j);
            obj.hashCode();
            throw null;
        }
        int i17 = a;
        int i18 = ((i17 ^ 69) | (i17 & 69)) << 1;
        int i19 = -(((~i17) & 69) | (i17 & (-70)));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        b = i20 % 128;
        if (i20 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public static AbstractC0242a e(TimeZone timeZone) {
        AbstractC0242a abstractC0242aB;
        AbstractC0242a abstractC0242a;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 33;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (timeZone == null) {
            int i5 = ((i2 ^ 22) + ((i2 & 22) << 1)) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            AbstractC0242a abstractC0242aF = f();
            int i7 = b;
            int i8 = (i7 ^ 76) + ((i7 & 76) << 1);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return abstractC0242aF;
        }
        String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        int i11 = b;
        int i12 = i11 & 77;
        int i13 = i12 + ((i11 ^ 77) | i12);
        a = i13 % 128;
        int i14 = i13 % 2;
        Object obj = null;
        if (!(!id.equals("UTC"))) {
            int i15 = a;
            int i16 = (((i15 | 66) << 1) - (i15 ^ 66)) - 1;
            int i17 = i16 % 128;
            b = i17;
            int i18 = i16 % 2;
            AbstractC0242a abstractC0242a2 = c;
            int i19 = i17 + 121;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                return abstractC0242a2;
            }
            throw null;
        }
        String str = bFj.c.get(id);
        int i20 = b + 25;
        a = i20 % 128;
        int i21 = i20 % 2;
        i iVarG = g();
        if (str != null) {
            int i22 = a;
            int i23 = i22 & 69;
            int i24 = i23 + ((i22 ^ 69) | i23);
            b = i24 % 128;
            if (i24 % 2 != 0) {
                iVarG.b(str);
                obj.hashCode();
                throw null;
            }
            abstractC0242aB = iVarG.b(str);
            int i25 = b;
            int i26 = ((i25 & 60) + (i25 | 60)) - 1;
            a = i26 % 128;
            int i27 = i26 % 2;
        } else {
            int i28 = a + 59;
            b = i28 % 128;
            int i29 = i28 % 2;
            abstractC0242aB = null;
        }
        if (abstractC0242aB == null) {
            int i30 = b + 43;
            a = i30 % 128;
            int i31 = i30 % 2;
            abstractC0242aB = iVarG.b(id);
            int i32 = b;
            int i33 = (i32 | 41) << 1;
            int i34 = -(((~i32) & 41) | (i32 & (-42)));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            a = i35 % 128;
            int i36 = i35 % 2;
        }
        if (abstractC0242aB != null) {
            int i37 = b + 99;
            a = i37 % 128;
            if (i37 % 2 != 0) {
                return abstractC0242aB;
            }
            throw null;
        }
        if (str == null) {
            int i38 = a;
            int i39 = (((i38 & (-56)) | ((~i38) & 55)) - (~((i38 & 55) << 1))) - 1;
            b = i39 % 128;
            if (i39 % 2 != 0) {
                id.startsWith("GMT+");
                obj.hashCode();
                throw null;
            }
            if (!(!id.startsWith("GMT+")) || id.startsWith("GMT-")) {
                String strSubstring = id.substring(3);
                int length = strSubstring.length();
                int i40 = b;
                int i41 = i40 & 103;
                int i42 = (i40 ^ 103) | i41;
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                a = i43 % 128;
                if (i43 % 2 != 0 ? length > 2 : length > 5) {
                    char cCharAt = strSubstring.charAt(1);
                    if (cCharAt > '9') {
                        int i44 = a;
                        int i45 = (i44 & (-32)) | ((~i44) & 31);
                        int i46 = -(-((i44 & 31) << 1));
                        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                        b = i47 % 128;
                        int i48 = i47 % 2;
                        if (Character.isDigit(cCharAt)) {
                            StringBuilder sb = new StringBuilder(strSubstring);
                            int i49 = b + 15;
                            a = i49 % 128;
                            int i50 = i49 % 2;
                            int i51 = 0;
                            while (i51 < sb.length()) {
                                int i52 = b;
                                int i53 = i52 & 39;
                                int i54 = (i52 | 39) & (~i53);
                                int i55 = i53 << 1;
                                int i56 = (i54 & i55) + (i54 | i55);
                                a = i56 % 128;
                                int i57 = i56 % 2;
                                int iDigit = Character.digit(sb.charAt(i51), 10);
                                if (iDigit >= 0) {
                                    int i58 = b + 60;
                                    int i59 = (i58 ^ (-1)) + (i58 << 1);
                                    a = i59 % 128;
                                    sb.setCharAt(i51, (char) (i59 % 2 == 0 ? iDigit << 13 : iDigit + 48));
                                    int i60 = a;
                                    int i61 = (i60 & 69) + (i60 | 69);
                                    b = i61 % 128;
                                    int i62 = i61 % 2;
                                }
                                i51++;
                                int i63 = b;
                                int i64 = i63 & 55;
                                int i65 = -(-((i63 ^ 55) | i64));
                                int i66 = (i64 & i65) + (i65 | i64);
                                a = i66 % 128;
                                int i67 = i66 % 2;
                            }
                            strSubstring = sb.toString();
                            int i68 = a;
                            int i69 = i68 ^ 37;
                            int i70 = (((i68 & 37) | i69) << 1) - i69;
                            b = i70 % 128;
                            int i71 = i70 % 2;
                        }
                    }
                }
                int i72 = -((int) bFj.d.e(strSubstring));
                long j = i72;
                int i73 = b + 29;
                int i74 = i73 % 128;
                a = i74;
                int i75 = i73 % 2;
                if (j == 0) {
                    int i76 = (i74 & 123) + (i74 | 123);
                    int i77 = i76 % 128;
                    b = i77;
                    if (i76 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    AbstractC0242a abstractC0242a3 = c;
                    int i78 = ((i77 | 5) << 1) - (((~i77) & 5) | (i77 & (-6)));
                    a = i78 % 128;
                    if (i78 % 2 != 0) {
                        return abstractC0242a3;
                    }
                    throw null;
                }
                String strH = h(i72);
                if (i72 == 0) {
                    int i79 = a;
                    int i80 = i79 & 5;
                    int i81 = ((i79 | 5) & (~i80)) + (i80 << 1);
                    int i82 = i81 % 128;
                    b = i82;
                    int i83 = i81 % 2;
                    abstractC0242a = c;
                    int i84 = i82 ^ 37;
                    int i85 = ((((i82 & 37) | i84) << 1) - (~(-i84))) - 1;
                    a = i85 % 128;
                    if (i85 % 2 == 0) {
                        int i86 = 3 / 4;
                    }
                } else {
                    r rVar = new r(strH, null, i72, i72);
                    int i87 = b + 98;
                    int i88 = (i87 ^ (-1)) + (i87 << 1);
                    a = i88 % 128;
                    int i89 = i88 % 2;
                    abstractC0242a = rVar;
                }
                int i90 = a + 1;
                b = i90 % 128;
                if (i90 % 2 == 0) {
                    return abstractC0242a;
                }
                throw null;
            }
        }
        throw new IllegalArgumentException(j.t("The datetime zone id '", id, "' is not recognised"));
    }

    public int o(long j) {
        int iN;
        long j2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 76) + (i2 | 76)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            iN = n(j);
            j2 = j / ((long) iN);
        } else {
            iN = n(j);
            j2 = j - ((long) iN);
        }
        int i4 = a;
        int i5 = i4 & 119;
        int i6 = ((i4 ^ 119) | i5) << 1;
        int i7 = -((i4 | 119) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int iN2 = n(j2);
        Object obj = null;
        if (iN != iN2) {
            int i10 = a + 41;
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            int i13 = -iN2;
            int i14 = ((iN ^ i13) | (iN & i13)) << 1;
            int i15 = -((i13 & (~iN)) | ((~i13) & iN));
            if ((i14 ^ i15) + ((i15 & i14) << 1) < 0) {
                int i16 = i11 + 114;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
                long jR = r(j2);
                int i19 = a;
                int i20 = i19 ^ 39;
                int i21 = ((((i19 & 39) | i20) << 1) - (~(-i20))) - 1;
                int i22 = i21 % 128;
                b = i22;
                if (i21 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                long j3 = Long.MAX_VALUE;
                if (jR == j2) {
                    int i23 = (((i22 | 50) << 1) - (i22 ^ 50)) - 1;
                    int i24 = i23 % 128;
                    a = i24;
                    if (i23 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i25 = i24 | 109;
                    int i26 = ((i25 << 1) - (~(-(i25 & (~(i24 & 109)))))) - 1;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    jR = Long.MAX_VALUE;
                }
                long j4 = j - ((long) iN2);
                long jR2 = r(j4);
                int i28 = b;
                int i29 = i28 & 17;
                int i30 = (i28 | 17) & (~i29);
                int i31 = i29 << 1;
                int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                int i33 = i32 % 128;
                a = i33;
                if (i32 % 2 == 0) {
                    throw null;
                }
                if (jR2 == j4) {
                    int i34 = (((i33 | 38) << 1) - (i33 ^ 38)) - 1;
                    int i35 = i34 % 128;
                    b = i35;
                    int i36 = i34 % 2;
                    int i37 = i35 & 115;
                    int i38 = (((i35 ^ 115) | i37) << 1) - ((i35 | 115) & (~i37));
                    a = i38 % 128;
                    int i39 = i38 % 2;
                } else {
                    j3 = jR2;
                }
                if (jR != j3) {
                    int i40 = a;
                    int i41 = i40 & 79;
                    int i42 = -(-((i40 ^ 79) | i41));
                    int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                    b = i43 % 128;
                    int i44 = i43 % 2;
                    int i45 = (i40 & 23) + (i40 | 23);
                    b = i45 % 128;
                    int i46 = i45 % 2;
                    return iN;
                }
            }
        } else if (iN >= 0) {
            int i47 = b;
            int i48 = ((i47 | 76) << 1) - (i47 ^ 76);
            int i49 = (i48 ^ (-1)) + (i48 << 1);
            a = i49 % 128;
            if (i49 % 2 == 0) {
                s(j2);
                obj.hashCode();
                throw null;
            }
            long jS = s(j2);
            if (jS < j2) {
                int iN3 = n(jS);
                long j5 = j2 - jS;
                int i50 = -iN;
                int i51 = iN3 & i50;
                int i52 = -(-((i50 ^ iN3) | i51));
                long j6 = ((i51 | i52) << 1) - (i52 ^ i51);
                int i53 = b;
                int i54 = i53 & 33;
                int i55 = (~i54) & (i53 | 33);
                int i56 = -(-(i54 << 1));
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                a = i57 % 128;
                int i58 = i57 % 2;
                if (j5 <= j6) {
                    int i59 = i53 ^ 43;
                    int i60 = -(-((i53 & 43) << 1));
                    int i61 = (i59 & i60) + (i59 | i60);
                    int i62 = i61 % 128;
                    a = i62;
                    int i63 = i61 % 2;
                    int i64 = (-2) - ((i62 + 98) ^ (-1));
                    b = i64 % 128;
                    int i65 = i64 % 2;
                    return iN3;
                }
            }
        }
        int i66 = (-2) - ((a + 10) ^ (-1));
        b = i66 % 128;
        int i67 = i66 % 2;
        return iN2;
    }

    public static String h(int i) {
        int i2;
        String string;
        int i3 = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            int i4 = b;
            int i5 = ((i4 | 49) << 1) - (i4 ^ 49);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                stringBuffer.append('m');
            } else {
                stringBuffer.append('+');
            }
        } else {
            stringBuffer.append('-');
            i = -i;
            int i6 = a;
            int i7 = ((i6 ^ 63) - (~((i6 & 63) << 1))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = i / 3600000;
        int i10 = ivas.gov.bisp.enumeration.cJ.z.d;
        try {
            ivas.gov.bisp.enumeration.cJ.z.b(stringBuffer, i9, 2);
            int i11 = b;
            int i12 = i11 & 1;
            int i13 = (i11 | 1) & (~i12);
            int i14 = i12 << 1;
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            int i16 = i15 % 2;
        } catch (IOException unused) {
        }
        int i17 = (i - (~(-(i9 * 3600000)))) - 1;
        int i18 = b;
        int i19 = ((i18 | 89) << 1) - (i18 ^ 89);
        a = i19 % 128;
        if (i19 % 2 == 0) {
            i2 = i17 >>> 60000;
            stringBuffer.append('(');
        } else {
            i2 = i17 / 60000;
            stringBuffer.append(':');
        }
        int i20 = a + 29;
        b = i20 % 128;
        int i21 = i20 % 2;
        try {
            ivas.gov.bisp.enumeration.cJ.z.b(stringBuffer, i2, 2);
            int i22 = a + 112;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
        } catch (IOException unused2) {
        }
        int i25 = -(i2 * 60000);
        int i26 = i17 ^ i25;
        int i27 = ((i17 & i25) | i26) << 1;
        int i28 = -i26;
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        Object obj = null;
        if (i29 == 0) {
            int i30 = a;
            int i31 = (i30 & 119) + (i30 | 119);
            b = i31 % 128;
            if (i31 % 2 == 0) {
                return stringBuffer.toString();
            }
            stringBuffer.toString();
            throw null;
        }
        int i32 = i29 / 1000;
        stringBuffer.append(':');
        int i33 = b;
        int i34 = i33 ^ 45;
        int i35 = ((((45 & i33) | i34) << 1) - (~(-i34))) - 1;
        a = i35 % 128;
        int i36 = i35 % 2;
        try {
            ivas.gov.bisp.enumeration.cJ.z.b(stringBuffer, i32, 2);
            int i37 = a + 77;
            b = i37 % 128;
            int i38 = i37 % 2;
        } catch (IOException unused3) {
        }
        int i39 = (i29 - (~(-(i32 * 1000)))) - 1;
        if (i39 != 0) {
            stringBuffer.append('.');
            try {
                ivas.gov.bisp.enumeration.cJ.z.b(stringBuffer, i39, 3);
                int i40 = a;
                int i41 = ((i40 | 111) << 1) - (i40 ^ 111);
                b = i41 % 128;
                int i42 = i41 % 2;
            } catch (IOException unused4) {
            }
            String string2 = stringBuffer.toString();
            int i43 = b;
            int i44 = ((i43 & 120) + (i43 | 120)) - 1;
            a = i44 % 128;
            if (i44 % 2 != 0) {
                return string2;
            }
            throw null;
        }
        int i45 = b + 45;
        a = i45 % 128;
        if (i45 % 2 == 0) {
            string = stringBuffer.toString();
            int i46 = 96 / 0;
        } else {
            string = stringBuffer.toString();
        }
        int i47 = a;
        int i48 = i47 & 43;
        int i49 = (43 | i47) & (~i48);
        int i50 = -(-(i48 << 1));
        int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
        b = i51 % 128;
        if (i51 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:24:0x0106  */
    /* JADX WARN: Code duplicated, block: B:26:0x010f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0111  */
    /* JADX WARN: Code duplicated, block: B:29:0x0115  */
    /* JADX WARN: Code duplicated, block: B:32:0x011e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0139  */
    /* JADX WARN: Code duplicated, block: B:38:0x0141  */
    /* JADX WARN: Code duplicated, block: B:40:0x0145  */
    public long j(long j, boolean z, long j2) {
        long jR;
        int i;
        long j3;
        long jR2;
        int i2;
        long j4;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 & 107;
        int i9 = ((i7 ^ 107) | i8) << 1;
        int i10 = -((i7 | 107) & (~i8));
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        int iN = n(j2);
        int i13 = b;
        int i14 = (i13 & 25) + (i13 | 25);
        a = i14 % 128;
        int i15 = i14 % 2;
        long j5 = j - ((long) iN);
        Object obj = null;
        if (n(j5) == iN) {
            int i16 = a;
            int i17 = i16 & 77;
            int i18 = (((i16 ^ 77) | i17) << 1) - ((~i17) & (i16 | 77));
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i16 & 47;
            int i21 = (i16 ^ 47) | i20;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                return j5;
            }
            throw null;
        }
        int iN2 = n(j);
        long j6 = j - ((long) iN2);
        int i23 = a;
        int i24 = ((i23 ^ 39) - (~(-(-((i23 & 39) << 1))))) - 1;
        b = i24 % 128;
        if (i24 % 2 != 0) {
            n(j6);
            throw null;
        }
        int iN3 = n(j6);
        int i25 = b;
        int i26 = i25 & 107;
        int i27 = (i26 - (~(-(-((i25 ^ 107) | i26))))) - 1;
        int i28 = i27 % 128;
        a = i28;
        if (i27 % 2 == 0) {
            throw null;
        }
        if (iN2 == iN3) {
            int i29 = b;
            int i30 = (i29 & 63) + (i29 | 63);
            a = i30 % 128;
            int i31 = i30 % 2;
            iN2 = iN3;
        } else if (z) {
            jR = r(j6);
            int i32 = a;
            int i33 = i32 & 25;
            int i34 = (i32 | 25) & (~i33);
            int i35 = i33 << 1;
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            i = i36 % 128;
            b = i;
            int i37 = i36 % 2;
            if (jR == j6) {
                int i38 = i & 97;
                i5 = i38 + ((i ^ 97) | i38);
                a = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                int i39 = i & 91;
                int i40 = (i ^ 91) | i39;
                int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
                a = i41 % 128;
                int i42 = i41 % 2;
                jR = Long.MAX_VALUE;
            }
            j3 = j - ((long) iN3);
            jR2 = r(j3);
            i2 = a;
            int i43 = (i2 | 9) << 1;
            int i44 = -(i2 ^ 9);
            int i45 = (i43 & i44) + (i43 | i44);
            b = i45 % 128;
            int i46 = i45 % 2;
            if (jR2 != j3) {
                i4 = i2 + 39;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                j4 = jR2;
            } else {
                j4 = Long.MAX_VALUE;
            }
            if (jR != j4) {
                int i47 = (i2 & (-66)) | ((~i2) & 65);
                int i48 = -(-((i2 & 65) << 1));
                i3 = (i47 & i48) + (i47 | i48);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (z) {
                    throw new N(j, this.g);
                }
            } else {
                int i210 = b;
                int i310 = (i210 & 63) + (i210 | 63);
                a = i310 % 128;
                int i311 = i310 % 2;
                iN2 = iN3;
            }
        } else {
            int i49 = i28 + 84;
            int i50 = (i49 ^ (-1)) + (i49 << 1);
            b = i50 % 128;
            int i51 = i50 % 2;
            if (iN2 < 0) {
                jR = r(j6);
                int i312 = a;
                int i313 = i312 & 25;
                int i314 = (i312 | 25) & (~i313);
                int i315 = i313 << 1;
                int i316 = ((i314 | i315) << 1) - (i314 ^ i315);
                i = i316 % 128;
                b = i;
                int i317 = i316 % 2;
                if (jR == j6) {
                    int i318 = i & 97;
                    i5 = i318 + ((i ^ 97) | i318);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    int i319 = i & 91;
                    int i410 = (i ^ 91) | i319;
                    int i411 = ((i319 | i410) << 1) - (i319 ^ i410);
                    a = i411 % 128;
                    int i412 = i411 % 2;
                    jR = Long.MAX_VALUE;
                }
                j3 = j - ((long) iN3);
                jR2 = r(j3);
                i2 = a;
                int i413 = (i2 | 9) << 1;
                int i414 = -(i2 ^ 9);
                int i415 = (i413 & i414) + (i413 | i414);
                b = i415 % 128;
                int i416 = i415 % 2;
                if (jR2 != j3) {
                    i4 = i2 + 39;
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    j4 = jR2;
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (jR != j4) {
                    int i417 = (i2 & (-66)) | ((~i2) & 65);
                    int i418 = -(-((i2 & 65) << 1));
                    i3 = (i417 & i418) + (i417 | i418);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (z) {
                        throw new N(j, this.g);
                    }
                } else {
                    int i211 = b;
                    int i3110 = (i211 & 63) + (i211 | 63);
                    a = i3110 % 128;
                    int i3111 = i3110 % 2;
                    iN2 = iN3;
                }
            } else {
                int i212 = b;
                int i3112 = (i212 & 63) + (i212 | 63);
                a = i3112 % 128;
                int i3113 = i3112 % 2;
                iN2 = iN3;
            }
        }
        long j7 = iN2;
        long j8 = j - j7;
        long j9 = j ^ j8;
        int i52 = a;
        int i53 = (((i52 ^ 115) | (i52 & 115)) << 1) - ((i52 & (-116)) | ((~i52) & 115));
        b = i53 % 128;
        int i54 = i53 % 2;
        if (j9 < 0) {
            int i55 = i52 | 19;
            int i56 = ((i55 << 1) - (~(-(i55 & (~(i52 & 19)))))) - 1;
            b = i56 % 128;
            if (i56 % 2 == 0 ? (j ^ j7) < 0 : j / j7 < 0) {
                throw new ArithmeticException("Subtracting time zone offset caused overflow");
            }
        }
        int i57 = b + 15;
        a = i57 % 128;
        int i58 = i57 % 2;
        return j8;
    }

    @FromString
    public static AbstractC0242a d(String str) {
        AbstractC0242a abstractC0242a;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-100)) | ((~i2) & 99);
        int i4 = -(-((i2 & 99) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            AbstractC0242a abstractC0242aF = f();
            int i6 = a + 59;
            b = i6 % 128;
            int i7 = i6 % 2;
            return abstractC0242aF;
        }
        if (str.equals("UTC")) {
            int i8 = a;
            int i9 = (i8 & (-72)) | ((~i8) & 71);
            int i10 = (i8 & 71) << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            AbstractC0242a abstractC0242a2 = c;
            int i14 = (i12 & 39) + (i12 | 39);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                return abstractC0242a2;
            }
            obj.hashCode();
            throw null;
        }
        AbstractC0242a abstractC0242aB = g().b(str);
        if (abstractC0242aB != null) {
            int i15 = a;
            int i16 = i15 & 25;
            int i17 = (i16 - (~((i15 ^ 25) | i16))) - 1;
            int i18 = i17 % 128;
            b = i18;
            if (i17 % 2 != 0) {
                int i19 = 57 / 0;
            }
            int i20 = i18 ^ 69;
            int i21 = (i18 & 69) << 1;
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            int i23 = i22 % 2;
            return abstractC0242aB;
        }
        if (!str.startsWith("+")) {
            int i24 = a;
            int i25 = ((i24 ^ 119) | (i24 & 119)) << 1;
            int i26 = -(((~i24) & 119) | (i24 & (-120)));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                str.startsWith("-");
                obj.hashCode();
                throw null;
            }
            if (!str.startsWith("-")) {
                throw new IllegalArgumentException(j.t("The datetime zone id '", str, "' is not recognised"));
            }
        }
        int i28 = -((int) bFj.d.e(str));
        int i29 = b;
        int i30 = ((i29 ^ 3) | (i29 & 3)) << 1;
        int i31 = -(((~i29) & 3) | (i29 & (-4)));
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        int i33 = i32 % 128;
        a = i33;
        int i34 = i32 % 2;
        if (i28 == 0) {
            int i35 = i33 + 67;
            int i36 = i35 % 128;
            b = i36;
            if (i35 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            AbstractC0242a abstractC0242a3 = c;
            int i37 = i36 & 115;
            int i38 = i37 + ((i36 ^ 115) | i37);
            a = i38 % 128;
            int i39 = i38 % 2;
            return abstractC0242a3;
        }
        String strH = h(i28);
        if (i28 == 0) {
            int i40 = b;
            int i41 = ((i40 | 57) << 1) - (i40 ^ 57);
            int i42 = i41 % 128;
            a = i42;
            int i43 = i41 % 2;
            abstractC0242a = c;
            int i44 = ((i42 ^ 41) | (i42 & 41)) << 1;
            int i45 = -(((~i42) & 41) | (i42 & (-42)));
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            b = i46 % 128;
            int i47 = i46 % 2;
        } else {
            r rVar = new r(strH, null, i28, i28);
            int i48 = b;
            int i49 = i48 & 113;
            int i50 = (i48 ^ 113) | i49;
            int i51 = (i49 & i50) + (i50 | i49);
            a = i51 % 128;
            int i52 = i51 % 2;
            abstractC0242a = rVar;
        }
        int i53 = a + 22;
        int i54 = (i53 ^ (-1)) + (i53 << 1);
        b = i54 % 128;
        int i55 = i54 % 2;
        return abstractC0242a;
    }
}
