package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.bB.R;
import ivas.gov.bisp.enumeration.o000O0O.o000oOoO;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.C0144q;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.U;
import ivas.gov.bisp.enumeration.p035bh.W;
import ivas.gov.bisp.enumeration.p035bh.X;
import ivas.gov.bisp.enumeration.p035bh.Y;
import ivas.gov.bisp.enumeration.p035bh.Z;
import ivas.gov.bisp.enumeration.p035bh.ad;
import ivas.gov.bisp.enumeration.p035bh.n;
import ivas.gov.bisp.enumeration.p102y.C0330o;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public static final E A;
    public static final E B;
    public static final E C;
    public static final o000O000<n> D;
    public static final E E;
    public static final E F;
    public static final E G;
    private static int a = 0;
    private static int b = 1;
    public static final E c;
    public static final E d = new x(Class.class, new U(new bsD()));
    public static final E e = new x(BitSet.class, new U(new bsW()));
    public static final o000O000<Boolean> f;
    public static final E g;
    public static final E h;
    public static final E i;
    public static final E j;
    public static final E k;
    public static final E l;
    public static final o000O000<Number> m;
    public static final o000O000<Number> n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final E f76o;
    public static final o000O000<Number> p;
    public static final E q;
    public static final o000O000<BigDecimal> r;
    public static final E s;
    public static final o000O000<BigInteger> t;
    public static final E u;
    public static final E v;
    public static final E w;
    public static final E x;
    public static final E y;
    public static final E z;

    public class bsA extends o000O000<BigDecimal> {
        private static int a = 1;
        private static int b;

        public Object c(j jVar) {
            BigDecimal bigDecimal;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 105;
            int i4 = i3 + ((i2 ^ 105) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            int iY = jVar.y();
            if (i5 != 0 ? iY != 9 : iY != 118) {
                try {
                    BigDecimal bigDecimal2 = new BigDecimal(jVar.x());
                    int i6 = a;
                    int i7 = (((i6 ^ 1) | (i6 & 1)) << 1) - (((~i6) & 1) | (i6 & (-2)));
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    bigDecimal = bigDecimal2;
                } catch (NumberFormatException e) {
                    throw new X(e);
                }
            } else {
                int i9 = a;
                int i10 = i9 & 103;
                int i11 = (((i9 | 103) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
                b = i11 % 128;
                int i12 = i11 % 2;
                jVar.s();
                int i13 = a + 60;
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                bigDecimal = null;
            }
            int i16 = b;
            int i17 = i16 | 23;
            int i18 = (i17 << 1) - ((~(i16 & 23)) & i17);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 31 / 0;
            }
            return bigDecimal;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                cVar.r((BigDecimal) obj);
            } else {
                cVar.r((BigDecimal) obj);
                throw null;
            }
        }
    }

    public class bsB extends o000O000<BigInteger> {
        private static int a = 0;
        private static int b = 1;

        public Object c(j jVar) {
            BigInteger bigInteger;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 69;
            int i4 = (((i2 | 69) & (~i3)) - (~(i3 << 1))) - 1;
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0 ? jVar.y() != 9 : jVar.y() != 86) {
                try {
                    bigInteger = new BigInteger(jVar.x());
                    int i5 = a;
                    int i6 = i5 & 111;
                    int i7 = (i5 | 111) & (~i6);
                    int i8 = -(-(i6 << 1));
                    int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 3 / 5;
                    }
                } catch (NumberFormatException e) {
                    throw new X(e);
                }
            } else {
                jVar.s();
                int i11 = a;
                int i12 = (-2) - (((i11 & 74) + (i11 | 74)) ^ (-1));
                b = i12 % 128;
                int i13 = i12 % 2;
                bigInteger = null;
            }
            int i14 = a;
            int i15 = i14 & 73;
            int i16 = i15 + ((i14 ^ 73) | i15);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                return bigInteger;
            }
            obj.hashCode();
            throw null;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = b + 31;
            a = i2 % 128;
            int i3 = i2 % 2;
            cVar.r((BigInteger) obj);
            int i4 = b;
            int i5 = (-2) - ((((i4 | 42) << 1) - (i4 ^ 42)) ^ (-1));
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public class bsD extends o000O000<Class> {
        private static int a = 0;
        private static int b = 1;

        public Object c(j jVar) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void d(c cVar, Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Attempted to serialize java.lang.Class: ");
            sbW.append(((Class) obj).getName());
            sbW.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sbW.toString());
        }
    }

    public class bsE extends o000O000<StringBuffer> {
        private static int a = 1;
        private static int b;

        public Object c(j jVar) {
            StringBuffer stringBuffer;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-2)) | ((~i2) & 1)) - (~(-(-((i2 & 1) << 1))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            if (jVar.y() == 9) {
                int i5 = b;
                int i6 = ((i5 ^ 25) | (i5 & 25)) << 1;
                int i7 = -(((~i5) & 25) | (i5 & (-26)));
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                a = i8 % 128;
                int i9 = i8 % 2;
                jVar.s();
                if (i9 == 0) {
                    int i10 = 59 / 0;
                }
                int i11 = a;
                int i12 = i11 ^ 99;
                int i13 = (i11 & 99) << 1;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 3 % 2;
                }
                stringBuffer = null;
            } else {
                stringBuffer = new StringBuffer(jVar.x());
                int i16 = a;
                int i17 = i16 ^ 37;
                int i18 = ((((i16 & 37) | i17) << 1) - (~(-i17))) - 1;
                int i19 = i18 % 128;
                b = i19;
                if (i18 % 2 != 0) {
                    int i20 = 23 / 0;
                }
                int i21 = ((i19 & 121) - (~(i19 | 121))) - 1;
                a = i21 % 128;
                int i22 = i21 % 2;
            }
            int i23 = a + 77;
            b = i23 % 128;
            if (i23 % 2 == 0) {
                return stringBuffer;
            }
            throw null;
        }

        public void d(c cVar, Object obj) throws IOException {
            String string;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            StringBuffer stringBuffer = (StringBuffer) obj;
            if (stringBuffer == null) {
                int i6 = (i4 ^ 17) + ((i4 & 17) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i4 & 85;
                int i9 = (i4 | 85) & (~i8);
                int i10 = i8 << 1;
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 4 / 2;
                }
                string = null;
            } else {
                string = stringBuffer.toString();
                int i13 = b;
                int i14 = (((i13 | 94) << 1) - (i13 ^ 94)) - 1;
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 2 % 4;
                }
            }
            cVar.t(string);
            int i16 = b;
            int i17 = i16 & 11;
            int i18 = ((i16 | 11) & (~i17)) + (i17 << 1);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 62 / 0;
            }
        }
    }

    public class bsF extends o000O000<URL> {
        private static int a = 1;
        private static int b;

        public void d(c cVar, Object obj) throws IOException {
            String externalForm;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 71;
            int i4 = i3 + ((i2 ^ 71) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            URL url = (URL) obj;
            if (url == null) {
                int i6 = i2 + 125;
                b = i6 % 128;
                externalForm = null;
                if (i6 % 2 != 0) {
                    externalForm.hashCode();
                    throw null;
                }
            } else {
                externalForm = url.toExternalForm();
                int i7 = a;
                int i8 = i7 ^ 33;
                int i9 = ((i7 & 33) | i8) << 1;
                int i10 = -i8;
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
            }
            cVar.t(externalForm);
            int i13 = b;
            int i14 = i13 & 117;
            int i15 = -(-((i13 ^ 117) | i14));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x007b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x007c  */
        public Object c(j jVar) {
            URL url;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 ^ 13;
            int i5 = (i3 & 13) << 1;
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            Object obj = null;
            if (jVar.y() != 9) {
                String strX = jVar.x();
                if (!"null".equals(strX)) {
                    url = new URL(strX);
                    int i8 = b;
                    int i9 = ((i8 | 39) << 1) - (i8 ^ 39);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                }
                int i11 = b;
                i = ((i11 | 115) << 1) - (i11 ^ 115);
                a = i % 128;
                if (i % 2 != 0) {
                    return url;
                }
                obj.hashCode();
                throw null;
            }
            int i12 = a + 7;
            b = i12 % 128;
            int i13 = i12 % 2;
            jVar.s();
            int i14 = b;
            int i15 = ((i14 & 42) + (i14 | 42)) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = b;
            int i18 = i17 & 75;
            int i19 = (i17 ^ 75) | i18;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
            url = null;
            int i110 = b;
            i = ((i110 | 115) << 1) - (i110 ^ 115);
            a = i % 128;
            if (i % 2 != 0) {
                return url;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class bsG extends o000O000<URI> {
        private static int a = 1;
        private static int b;

        /* JADX WARN: Code duplicated, block: B:17:0x0092 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x0093  */
        public Object c(j jVar) {
            URI uri;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 107;
            int i5 = (i3 | 107) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0 ? jVar.y() != 9 : jVar.y() != 123) {
                try {
                    String strX = jVar.x();
                    if (!"null".equals(strX)) {
                        uri = new URI(strX);
                        int i8 = a;
                        int i9 = (i8 ^ 107) + ((i8 & 107) << 1);
                        b = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    int i11 = a;
                    int i12 = ((i11 ^ 103) | (i11 & 103)) << 1;
                    int i13 = -(((~i11) & 103) | (i11 & (-104)));
                    i = (i12 ^ i13) + ((i13 & i12) << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        return uri;
                    }
                    throw null;
                } catch (URISyntaxException e) {
                    throw new X(e);
                }
            }
            int i14 = b + 63;
            a = i14 % 128;
            int i15 = i14 % 2;
            jVar.s();
            int i16 = a;
            int i17 = i16 & 125;
            int i18 = -(-((i16 ^ 125) | i17));
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = b;
            int i22 = ((i21 | 115) << 1) - (i21 ^ 115);
            a = i22 % 128;
            int i23 = i22 % 2;
            uri = null;
            int i110 = a;
            int i111 = ((i110 ^ 103) | (i110 & 103)) << 1;
            int i112 = -(((~i110) & 103) | (i110 & (-104)));
            i = (i111 ^ i112) + ((i112 & i111) << 1);
            b = i % 128;
            if (i % 2 == 0) {
                return uri;
            }
            throw null;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 79;
            int i4 = -(-((i2 ^ 79) | i3));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            String aSCIIString = null;
            URI uri = (URI) obj;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (uri == null) {
                int i6 = (i2 & (-120)) | ((~i2) & 119);
                int i7 = -(-((i2 & 119) << 1));
                int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                int i10 = ((i2 ^ 8) + ((i2 & 8) << 1)) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
            } else {
                aSCIIString = uri.toASCIIString();
                int i12 = a;
                int i13 = (i12 ^ 31) + ((i12 & 31) << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            cVar.t(aSCIIString);
            int i15 = a;
            int i16 = (i15 | 95) << 1;
            int i17 = -(((~i15) & 95) | (i15 & (-96)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 37 / 0;
            }
        }
    }

    public class bsH extends o000O000<AtomicInteger> {
        private static int a = 1;
        private static int b;

        public Object c(j jVar) {
            int i = 2 % 2;
            try {
                AtomicInteger atomicInteger = new AtomicInteger(jVar.o());
                int i2 = a;
                int i3 = (i2 ^ 37) + ((i2 & 37) << 1);
                b = i3 % 128;
                int i4 = i3 % 2;
                return atomicInteger;
            } catch (NumberFormatException e) {
                throw new X(e);
            }
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 122) + ((i2 & 122) << 1)) - 1;
            a = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                ((AtomicInteger) obj).get();
                obj2.hashCode();
                throw null;
            }
            cVar.o(((AtomicInteger) obj).get());
            int i4 = a;
            int i5 = (i4 ^ 19) + ((i4 & 19) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public class bsI extends o000O000<AtomicBoolean> {
        private static int a = 1;
        private static int b;

        public Object c(j jVar) {
            int i = 2 % 2;
            AtomicBoolean atomicBoolean = new AtomicBoolean(jVar.n());
            int i2 = b;
            int i3 = i2 ^ 33;
            int i4 = ((i2 & 33) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 26 / 0;
            }
            return atomicBoolean;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 44) + (i2 | 44);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                cVar.s(((AtomicBoolean) obj).get());
                int i5 = 91 / 0;
            } else {
                cVar.s(((AtomicBoolean) obj).get());
            }
            int i6 = b;
            int i7 = i6 & 123;
            int i8 = (i7 - (~(-(-((i6 ^ 123) | i7))))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public static final class bsJ<T extends Enum<T>> extends o000O000<T> {
        private static int a = 0;
        private static int b = 1;
        public final Map<String, T> c = new HashMap();
        public final Map<T, String> d = new HashMap();

        public bsJ(Class<T> cls) {
            Annotation annotation;
            int i;
            try {
                T[] enumConstants = cls.getEnumConstants();
                int length = enumConstants.length;
                int i2 = 2 % 2;
                int i3 = 0;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = b;
                    int i6 = i5 & 81;
                    int i7 = (i5 ^ 81) | i6;
                    int i8 = (i6 & i7) + (i7 | i6);
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    T t = enumConstants[i4];
                    String strName = t.name();
                    int i10 = a;
                    int i11 = i10 ^ 9;
                    int i12 = ((i10 & 9) | i11) << 1;
                    int i13 = -i11;
                    int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        annotation = cls.getField(strName).getAnnotation(R.class);
                        int i15 = 43 / i3;
                    } else {
                        annotation = cls.getField(strName).getAnnotation(R.class);
                    }
                    R r = (R) annotation;
                    if (r != null) {
                        int i16 = a;
                        int i17 = i16 & 109;
                        int i18 = ((i16 ^ 109) | i17) << 1;
                        int i19 = -((i16 | 109) & (~i17));
                        int i20 = (i18 & i19) + (i19 | i18);
                        b = i20 % 128;
                        int i21 = i20 % 2;
                        strName = r.value();
                        String[] strArrAlternate = r.alternate();
                        int i22 = b;
                        int i23 = i22 & 55;
                        int i24 = i23 + ((i22 ^ 55) | i23);
                        a = i24 % 128;
                        int i25 = i24 % 2;
                        int length2 = strArrAlternate.length;
                        int i26 = ((i22 ^ 107) | (i22 & 107)) << 1;
                        int i27 = -(((~i22) & 107) | (i22 & (-108)));
                        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        int i30 = i3;
                        while (i30 < length2) {
                            int i31 = b;
                            int i32 = ((i31 ^ 82) + ((i31 & 82) << 1)) - 1;
                            int i33 = i32 % 128;
                            a = i33;
                            int i34 = i32 % 2;
                            String str = strArrAlternate[i30];
                            Map<String, T> map = this.c;
                            int i35 = (i33 ^ 41) + ((i33 & 41) << 1);
                            b = i35 % 128;
                            if (i35 % 2 == 0) {
                                map.put(str, t);
                                i = ((i30 | 82) << 1) - (i30 ^ 82);
                            } else {
                                map.put(str, t);
                                i = (-2) - ((i30 + 2) ^ (-1));
                            }
                            i30 = i;
                            int i36 = b + 17;
                            a = i36 % 128;
                            int i37 = i36 % 2;
                        }
                    }
                    this.c.put(strName, t);
                    int i38 = a + 5;
                    b = i38 % 128;
                    if (i38 % 2 == 0) {
                        this.d.put(t, strName);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    this.d.put(t, strName);
                    int i39 = ((((i4 ^ 109) | (i4 & 109)) << 1) - (((~i4) & 109) | (i4 & (-110)))) - 107;
                    i4 = (i39 ^ (-1)) + (i39 << 1);
                    int i40 = b;
                    int i41 = i40 & 55;
                    int i42 = -(-((i40 ^ 55) | i41));
                    int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                    a = i43 % 128;
                    int i44 = i43 % 2;
                    i3 = 0;
                }
                int i45 = b;
                int i46 = (i45 | 41) << 1;
                int i47 = -(i45 ^ 41);
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                a = i48 % 128;
                int i49 = i48 % 2;
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        public final void d(c cVar, Object obj) throws IOException {
            String str;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-122)) | ((~i2) & 121);
            int i4 = (i2 & 121) << 1;
            int i5 = (i3 & i4) + (i3 | i4);
            b = i5 % 128;
            int i6 = i5 % 2;
            Enum r7 = (Enum) obj;
            if (r7 == null) {
                int i7 = ((i2 ^ 74) + ((i2 & 74) << 1)) - 1;
                int i8 = i7 % 128;
                b = i8;
                int i9 = i7 % 2;
                int i10 = (i8 ^ 56) + ((i8 & 56) << 1);
                int i11 = (i10 ^ (-1)) + (i10 << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                str = null;
            } else {
                str = this.d.get(r7);
                int i13 = a + 65;
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            cVar.t(str);
            int i15 = a;
            int i16 = i15 ^ 83;
            int i17 = ((i15 & 83) | i16) << 1;
            int i18 = -i16;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            b = i19 % 128;
            int i20 = i19 % 2;
        }

        public final Object c(j jVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 75;
            int i4 = (i2 ^ 75) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            T t = null;
            if (jVar.y() == 9) {
                int i7 = b;
                int i8 = i7 & 67;
                int i9 = ((i7 ^ 67) | i8) << 1;
                int i10 = -((i7 | 67) & (~i8));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                a = i11 % 128;
                int i12 = i11 % 2;
                jVar.s();
                int i13 = a;
                int i14 = i13 & 121;
                int i15 = (i13 | 121) & (~i14);
                int i16 = -(-(i14 << 1));
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                b = i17 % 128;
                int i18 = i17 % 2;
            } else {
                T t2 = this.c.get(jVar.x());
                int i19 = a;
                int i20 = i19 & 15;
                int i21 = i20 + ((i19 ^ 15) | i20);
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    t.hashCode();
                    throw null;
                }
                int i22 = (((i19 ^ 73) | (i19 & 73)) << 1) - (((~i19) & 73) | (i19 & (-74)));
                b = i22 % 128;
                int i23 = i22 % 2;
                t = t2;
            }
            int i24 = a + 47;
            b = i24 % 128;
            int i25 = i24 % 2;
            return t;
        }
    }

    public class bsK extends o000O000<Number> {
        private static int a = 0;
        private static int b = 1;

        public Object c(j jVar) {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 106) << 1) - (i2 ^ 106)) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0 ? jVar.y() != 9 : jVar.y() != 35) {
                try {
                    numValueOf = Integer.valueOf(jVar.o());
                    int i4 = a;
                    int i5 = ((i4 ^ 35) | (i4 & 35)) << 1;
                    int i6 = -((35 & (~i4)) | (i4 & (-36)));
                    int i7 = (i5 & i6) + (i6 | i5);
                    b = i7 % 128;
                    int i8 = i7 % 2;
                } catch (NumberFormatException e) {
                    throw new X(e);
                }
            } else {
                jVar.s();
                int i9 = a;
                int i10 = (i9 & 57) + (i9 | 57);
                b = i10 % 128;
                int i11 = i10 % 2;
                numValueOf = null;
            }
            int i12 = a + 23;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 17 / 0;
            }
            return numValueOf;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-114)) | ((~i2) & 113);
            int i4 = (i2 & 113) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                cVar.r((Number) obj);
                throw null;
            }
            cVar.r((Number) obj);
            int i6 = b;
            int i7 = (i6 & 13) + (i6 | 13);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public class bsL extends o000O000<InetAddress> {
        private static int a = 0;
        private static int b = 1;

        public void d(c cVar, Object obj) throws IOException {
            String hostAddress;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 31;
            int i4 = (((i2 & 31) | i3) << 1) - i3;
            b = i4 % 128;
            int i5 = i4 % 2;
            InetAddress inetAddress = (InetAddress) obj;
            if (inetAddress == null) {
                int i6 = i2 & 57;
                int i7 = (i2 ^ 57) | i6;
                int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                int i9 = i8 % 128;
                b = i9;
                int i10 = i8 % 2;
                int i11 = ((i9 | 61) << 1) - (i9 ^ 61);
                a = i11 % 128;
                int i12 = i11 % 2;
                hostAddress = null;
            } else {
                hostAddress = inetAddress.getHostAddress();
                int i13 = b + 35;
                a = i13 % 128;
                int i14 = i13 % 2;
            }
            cVar.t(hostAddress);
            int i15 = b;
            int i16 = i15 & 53;
            int i17 = ((i15 ^ 53) | i16) << 1;
            int i18 = -((i15 | 53) & (~i16));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            a = i19 % 128;
            int i20 = i19 % 2;
        }

        public Object c(j jVar) throws UnknownHostException {
            InetAddress byName;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 1;
            int i4 = i2 | 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 != 0 ? jVar.y() != 9 : jVar.y() != 25) {
                byName = InetAddress.getByName(jVar.x());
                int i6 = a;
                int i7 = (i6 & 71) + (i6 | 71);
                b = i7 % 128;
                int i8 = i7 % 2;
            } else {
                int i9 = b + 83;
                a = i9 % 128;
                int i10 = i9 % 2;
                jVar.s();
                int i11 = b;
                int i12 = i11 ^ 23;
                int i13 = ((i11 & 23) | i12) << 1;
                int i14 = -i12;
                int i15 = (i13 & i14) + (i13 | i14);
                a = i15 % 128;
                int i16 = i15 % 2;
                byName = null;
            }
            int i17 = a;
            int i18 = (i17 ^ 17) + ((i17 & 17) << 1);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 49 / 0;
            }
            return byName;
        }
    }

    public class bsM extends o000O000<Currency> {
        private static int a = 1;
        private static int b;

        public Object c(j jVar) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 91;
            int i4 = -(-((i2 ^ 91) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            Currency currency = Currency.getInstance(jVar.x());
            int i7 = b;
            int i8 = ((i7 & 124) + (i7 | 124)) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return currency;
            }
            throw null;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a + 25;
            b = i2 % 128;
            int i3 = i2 % 2;
            cVar.t(((Currency) obj).getCurrencyCode());
            int i4 = b;
            int i5 = i4 & 75;
            int i6 = (i4 ^ 75) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public class bsN implements E {
        private static int a = 1;
        private static int b;

        public class bsO extends o000O000<Timestamp> {
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ad c;

            public bsO(bsN bsn, ad adVar) {
                this.c = adVar;
            }

            public Object c(j jVar) {
                Timestamp timestamp;
                int i = 2 % 2;
                int i2 = b;
                int i3 = (i2 & (-118)) | ((~i2) & 117);
                int i4 = (i2 & 117) << 1;
                int i5 = (i3 & i4) + (i4 | i3);
                a = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                Date date = (Date) this.c.c(jVar);
                if (date != null) {
                    timestamp = new Timestamp(date.getTime());
                    int i6 = b;
                    int i7 = (i6 & (-28)) | ((~i6) & 27);
                    int i8 = (i6 & 27) << 1;
                    int i9 = (i7 & i8) + (i8 | i7);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    int i11 = b + 25;
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    timestamp = null;
                }
                int i13 = a;
                int i14 = (i13 ^ 125) + ((i13 & 125) << 1);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    return timestamp;
                }
                obj.hashCode();
                throw null;
            }

            public void d(c cVar, Object obj) {
                int i = 2 % 2;
                int i2 = a;
                int i3 = i2 | 59;
                int i4 = i3 << 1;
                int i5 = -((~(i2 & 59)) & i3);
                int i6 = (i4 & i5) + (i5 | i4);
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    this.c.d(cVar, (Timestamp) obj);
                } else {
                    this.c.d(cVar, (Timestamp) obj);
                    throw null;
                }
            }
        }

        @Override // ivas.gov.bisp.enumeration.p035bh.E
        public <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 107;
            int i4 = -(-(i2 | 107));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            if (typeToken.a != Timestamp.class) {
                int i7 = a;
                int i8 = ((i7 & 86) + (i7 | 86)) - 1;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            Objects.requireNonNull(c);
            bsO bso = new bsO(this, c.h(new TypeToken<>(Date.class)));
            int i9 = a;
            int i10 = i9 & 85;
            int i11 = (i10 - (~(-(-((i9 ^ 85) | i10))))) - 1;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return bso;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class bsR extends o000O000<Number> {
        private static int a = 1;
        private static int b;

        public Object c(j jVar) {
            Short shValueOf;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 43;
            int i4 = (i3 - (~((i2 ^ 43) | i3))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            if (jVar.y() == 9) {
                int i6 = a + 65;
                b = i6 % 128;
                int i7 = i6 % 2;
                jVar.s();
                if (i7 != 0) {
                    throw null;
                }
                shValueOf = null;
            } else {
                try {
                    shValueOf = Short.valueOf((short) jVar.o());
                    int i8 = a;
                    int i9 = (i8 ^ 37) + ((i8 & 37) << 1);
                    b = i9 % 128;
                    int i10 = i9 % 2;
                } catch (NumberFormatException e) {
                    throw new X(e);
                }
            }
            int i11 = b;
            int i12 = (((i11 ^ 17) | (i11 & 17)) << 1) - (((~i11) & 17) | (i11 & (-18)));
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return shValueOf;
            }
            throw null;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-82)) | ((~i2) & 81)) + ((i2 & 81) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            cVar.r((Number) obj);
            int i5 = b;
            int i6 = i5 ^ 111;
            int i7 = (i5 & 111) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public class bsS extends o000O000<Boolean> {
        private static int a = 0;
        private static int b = 1;

        public Object c(j jVar) {
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 113;
            int i4 = -(-((i2 ^ 113) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (jVar.y() == 9) {
                int i7 = b;
                int i8 = i7 & 115;
                int i9 = (i8 - (~(-(-((i7 ^ 115) | i8))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                jVar.s();
                int i11 = b;
                int i12 = i11 & 83;
                int i13 = -(-(i11 | 83));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                a = i14 % 128;
                int i15 = i14 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(jVar.x());
                int i16 = b;
                int i17 = i16 | 55;
                int i18 = (i17 << 1) - ((~(i16 & 55)) & i17);
                a = i18 % 128;
                int i19 = i18 % 2;
            }
            int i20 = b;
            int i21 = (i20 & 21) + (i20 | 21);
            a = i21 % 128;
            int i22 = i21 % 2;
            return boolValueOf;
        }

        public void d(c cVar, Object obj) throws IOException {
            String string;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 51;
            int i4 = ((i2 ^ 51) | i3) << 1;
            int i5 = -((~i3) & (i2 | 51));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                string = "null";
                int i7 = i2 | 75;
                int i8 = i7 << 1;
                int i9 = -((~(i2 & 75)) & i7);
                int i10 = (i8 & i9) + (i9 | i8);
                a = i10 % 128;
                int i11 = i10 % 2;
            } else {
                string = bool.toString();
                int i12 = b;
                int i13 = i12 & 121;
                int i14 = i13 + ((i12 ^ 121) | i13);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            cVar.t(string);
            int i16 = a + 117;
            b = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 32 / 0;
            }
        }
    }

    public class bsT implements E {
        private static int a = 0;
        private static int b = 1;

        /* JADX WARN: Code duplicated, block: B:11:0x0040  */
        /* JADX WARN: Code duplicated, block: B:13:0x0044  */
        /* JADX WARN: Code duplicated, block: B:15:0x004a  */
        /* JADX WARN: Code duplicated, block: B:18:0x0089  */
        /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r6
  0x0030: PHI (r6v9 java.lang.Class<? super T>) = (r6v1 java.lang.Class<? super T>), (r6v20 java.lang.Class<? super T>) binds: [B:8:0x002e, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // ivas.gov.bisp.enumeration.p035bh.E
        public <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
            Class<? super T> superclass;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 115;
            int i5 = (i3 | 115) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                superclass = typeToken.a;
                int i8 = 2 / 0;
                if (Enum.class.isAssignableFrom(superclass)) {
                    int i9 = a;
                    i = ((i9 & 25) - (~(i9 | 25))) - 1;
                    b = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    if (superclass != Enum.class) {
                        if (!superclass.isEnum()) {
                            int i10 = b;
                            int i11 = i10 & 49;
                            int i12 = (i10 ^ 49) | i11;
                            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                            a = i13 % 128;
                            int i14 = i13 % 2;
                            superclass = superclass.getSuperclass();
                            int i15 = b;
                            int i16 = i15 & 19;
                            int i17 = (i15 ^ 19) | i16;
                            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                            a = i18 % 128;
                            int i19 = i18 % 2;
                        }
                        bsJ bsj = new bsJ(superclass);
                        int i20 = a;
                        int i21 = i20 & 11;
                        int i22 = -(-((i20 ^ 11) | i21));
                        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        return bsj;
                    }
                }
            } else {
                superclass = typeToken.a;
                if (Enum.class.isAssignableFrom(superclass)) {
                    int i25 = a;
                    i = ((i25 & 25) - (~(i25 | 25))) - 1;
                    b = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    if (superclass != Enum.class) {
                        if (!superclass.isEnum()) {
                            int i110 = b;
                            int i111 = i110 & 49;
                            int i112 = (i110 ^ 49) | i111;
                            int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                            a = i113 % 128;
                            int i114 = i113 % 2;
                            superclass = superclass.getSuperclass();
                            int i115 = b;
                            int i116 = i115 & 19;
                            int i117 = (i115 ^ 19) | i116;
                            int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                            a = i118 % 128;
                            int i119 = i118 % 2;
                        }
                        bsJ bsj2 = new bsJ(superclass);
                        int i26 = a;
                        int i27 = i26 & 11;
                        int i28 = -(-((i26 ^ 11) | i27));
                        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                        b = i29 % 128;
                        int i210 = i29 % 2;
                        return bsj2;
                    }
                }
            }
            int i30 = a;
            int i31 = i30 & 73;
            int i32 = -(-((i30 ^ 73) | i31));
            int i33 = (i31 & i32) + (i32 | i31);
            b = i33 % 128;
            int i34 = i33 % 2;
            return null;
        }
    }

    public class bsU extends o000O000<Boolean> {
        private static int a = 0;
        private static int b = 1;

        public Object c(j jVar) {
            int iY;
            int i = 2 % 2;
            int i2 = a + 61;
            b = i2 % 128;
            Boolean boolValueOf = null;
            if (i2 % 2 != 0 ? (iY = jVar.y()) == 9 : (iY = jVar.y()) == 79) {
                int i3 = b;
                int i4 = (i3 & (-38)) | ((~i3) & 37);
                int i5 = (i3 & 37) << 1;
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                jVar.s();
                int i8 = b;
                int i9 = ((i8 ^ 115) | (i8 & 115)) << 1;
                int i10 = -(((~i8) & 115) | (i8 & (-116)));
                int i11 = (i9 & i10) + (i10 | i9);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else if (iY == 6) {
                int i13 = b;
                int i14 = i13 & 11;
                int i15 = -(-((i13 ^ 11) | i14));
                int i16 = (i14 & i15) + (i15 | i14);
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    Boolean.valueOf(Boolean.parseBoolean(jVar.x()));
                    boolValueOf.hashCode();
                    throw null;
                }
                boolValueOf = Boolean.valueOf(Boolean.parseBoolean(jVar.x()));
            } else {
                boolValueOf = Boolean.valueOf(jVar.n());
                int i17 = b + 75;
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = a;
            int i20 = ((i19 | 39) << 1) - (i19 ^ 39);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 54 / 0;
            }
            return boolValueOf;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 ^ 89) | (i2 & 89)) << 1) - (((~i2) & 89) | (i2 & (-90)));
            b = i3 % 128;
            int i4 = i3 % 2;
            cVar.q((Boolean) obj);
            int i5 = a;
            int i6 = i5 | 33;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 33)) & i6);
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public class bsV extends o000O000<UUID> {
        private static int a = 0;
        private static int b = 1;

        public void d(c cVar, Object obj) throws IOException {
            String string;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 27;
            int i4 = ((i3 << 1) - (~(-(i3 & (~(i2 & 27)))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            UUID uuid = (UUID) obj;
            if (uuid == null) {
                int i6 = i2 ^ 89;
                int i7 = ((i2 & 89) | i6) << 1;
                int i8 = -i6;
                int i9 = (i7 & i8) + (i8 | i7);
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i2 + 15;
                a = i11 % 128;
                int i12 = i11 % 2;
                string = null;
            } else {
                string = uuid.toString();
                int i13 = a;
                int i14 = ((i13 ^ 46) + ((i13 & 46) << 1)) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            cVar.t(string);
            int i16 = b;
            int i17 = (i16 & (-104)) | ((~i16) & 103);
            int i18 = -(-((i16 & 103) << 1));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 77 / 0;
            }
        }

        public Object c(j jVar) {
            UUID uuidFromString;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 111) + ((i2 & 111) << 1);
            b = i3 % 128;
            if (i3 % 2 != 0 ? jVar.y() != 9 : jVar.y() != 85) {
                uuidFromString = UUID.fromString(jVar.x());
                int i4 = a;
                int i5 = i4 & 5;
                int i6 = (i4 ^ 5) | i5;
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                b = i7 % 128;
                int i8 = i7 % 2;
            } else {
                jVar.s();
                int i9 = b;
                int i10 = (i9 ^ 83) + ((i9 & 83) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                uuidFromString = null;
            }
            int i12 = a;
            int i13 = ((((i12 ^ 33) | (i12 & 33)) << 1) - (~(-(((~i12) & 33) | (i12 & (-34)))))) - 1;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 93 / 0;
            }
            return uuidFromString;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.J$bsu, reason: case insensitive filesystem */
    public class C0221bsu extends o000O000<Number> {
        private static int a = 0;
        private static int b = 1;

        public Object c(j jVar) {
            Long lValueOf;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - (((i2 ^ 84) + ((i2 & 84) << 1)) ^ (-1));
            b = i3 % 128;
            if (i3 % 2 != 0 ? jVar.y() != 9 : jVar.y() != 79) {
                try {
                    lValueOf = Long.valueOf(jVar.q());
                    int i4 = a;
                    int i5 = ((i4 | 109) << 1) - (((~i4) & 109) | (i4 & (-110)));
                    b = i5 % 128;
                    int i6 = i5 % 2;
                } catch (NumberFormatException e) {
                    throw new X(e);
                }
            } else {
                jVar.s();
                int i7 = b;
                int i8 = i7 & 93;
                int i9 = (i7 ^ 93) | i8;
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                lValueOf = null;
            }
            int i12 = b;
            int i13 = (i12 & (-82)) | ((~i12) & 81);
            int i14 = -(-((i12 & 81) << 1));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 91 / 0;
            }
            return lValueOf;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 85;
            int i4 = (((i2 ^ 85) | i3) << 1) - ((i2 | 85) & (~i3));
            b = i4 % 128;
            int i5 = i4 % 2;
            cVar.r((Number) obj);
            int i6 = a + 113;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.J$bsv, reason: case insensitive filesystem */
    public class C0222bsv extends o000O000<Number> {
        private static int a = 0;
        private static int b = 1;

        public Object c(j jVar) {
            Float fValueOf;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 64) + ((i2 & 64) << 1)) - 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0 ? jVar.y() != 9 : jVar.y() != 125) {
                fValueOf = Float.valueOf((float) jVar.p());
                int i4 = a;
                int i5 = i4 & 39;
                int i6 = (i4 | 39) & (~i5);
                int i7 = i5 << 1;
                int i8 = (i6 & i7) + (i6 | i7);
                b = i8 % 128;
                int i9 = i8 % 2;
            } else {
                jVar.s();
                int i10 = b;
                int i11 = i10 ^ 31;
                int i12 = -(-((i10 & 31) << 1));
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                fValueOf = null;
            }
            int i15 = b;
            int i16 = i15 & 45;
            int i17 = -(-((i15 ^ 45) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                return fValueOf;
            }
            obj.hashCode();
            throw null;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 123;
            int i4 = (i2 | 123) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                cVar.r((Number) obj);
                return;
            }
            cVar.r((Number) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.J$bsy, reason: case insensitive filesystem */
    public class C0225bsy extends o000O000<Character> {
        private static int a = 1;
        private static int b;

        public void d(c cVar, Object obj) throws IOException {
            String strValueOf;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 49;
            int i4 = ((i2 & 49) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            Character ch = (Character) obj;
            if (ch == null) {
                int i7 = (-2) - ((i2 + 74) ^ (-1));
                b = i7 % 128;
                int i8 = i7 % 2;
                strValueOf = null;
            } else {
                strValueOf = String.valueOf(ch);
                int i9 = a;
                int i10 = (i9 & 11) + (i9 | 11);
                b = i10 % 128;
                int i11 = i10 % 2;
            }
            cVar.t(strValueOf);
            int i12 = a;
            int i13 = ((i12 | 105) << 1) - (i12 ^ 105);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        public Object c(j jVar) {
            Character chValueOf;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 89;
            int i4 = ((i2 | 89) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 == 0 ? jVar.y() != 9 : jVar.y() != 57) {
                String strX = jVar.x();
                if (strX.length() != 1) {
                    throw new X(ivas.gov.bisp.enumeration.p091n.j.r("Expecting character, got: ", strX));
                }
                int i5 = a;
                int i6 = (i5 ^ 125) + ((i5 & 125) << 1);
                b = i6 % 128;
                int i7 = i6 % 2;
                chValueOf = Character.valueOf(strX.charAt(0));
            } else {
                int i8 = a + 103;
                b = i8 % 128;
                chValueOf = null;
                if (i8 % 2 != 0) {
                    jVar.s();
                    throw null;
                }
                jVar.s();
            }
            int i9 = b;
            int i10 = (i9 ^ 11) + ((i9 & 11) << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 99 / 0;
            }
            return chValueOf;
        }
    }

    public class bsz extends o000O000<String> {
        private static int a = 0;
        private static int b = 1;

        public Object c(j jVar) {
            int iY;
            String strX;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 13) | (i2 & 13)) << 1;
            int i4 = -(((~i2) & 13) | (i2 & (-14)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0 ? (iY = jVar.y()) == 9 : (iY = jVar.y()) == 7) {
                jVar.s();
                int i6 = a;
                int i7 = (((i6 | 118) << 1) - (i6 ^ 118)) - 1;
                b = i7 % 128;
                int i8 = i7 % 2;
                strX = null;
            } else if (iY == 8) {
                int i9 = a;
                int i10 = (i9 ^ 29) + ((i9 & 29) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                strX = Boolean.toString(jVar.n());
                int i12 = a;
                int i13 = ((i12 ^ 117) | (i12 & 117)) << 1;
                int i14 = -(((~i12) & 117) | (i12 & (-118)));
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 2 % 5;
                }
            } else {
                strX = jVar.x();
                int i17 = b + 19;
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = b;
            int i20 = ((i19 ^ 47) - (~(-(-((i19 & 47) << 1))))) - 1;
            a = i20 % 128;
            int i21 = i20 % 2;
            return strX;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 73;
            int i4 = (i2 | 73) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            cVar.t((String) obj);
            int i8 = b + 117;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    static {
        bsU bsu = new bsU();
        f = new bsS();
        g = new M(Boolean.TYPE, Boolean.class, bsu);
        i = new M(Byte.TYPE, Byte.class, new bsY());
        h = new M(Short.TYPE, Short.class, new bsR());
        j = new M(Integer.TYPE, Integer.class, new bsK());
        k = new x(AtomicInteger.class, new U(new bsH()));
        c = new x(AtomicBoolean.class, new U(new bsI()));
        l = new x(AtomicIntegerArray.class, new U(new C0220bst()));
        m = new C0221bsu();
        n = new C0222bsv();
        p = new C0223bsw();
        f76o = new x(Number.class, new C0224bsx());
        q = new M(Character.TYPE, Character.class, new C0225bsy());
        bsz bszVar = new bsz();
        r = new bsA();
        t = new bsB();
        s = new x(String.class, bszVar);
        u = new x(StringBuilder.class, new bsC());
        x = new x(StringBuffer.class, new bsE());
        w = new x(URL.class, new bsF());
        y = new x(URI.class, new bsG());
        z = new C0227m(InetAddress.class, new bsL());
        v = new x(UUID.class, new bsV());
        B = new x(Currency.class, new U(new bsM()));
        A = new bsN();
        C = new N(Calendar.class, GregorianCalendar.class, new bsP());
        E = new x(Locale.class, new bsX());
        bsQ bsq = new bsQ();
        D = bsq;
        F = new C0227m(n.class, bsq);
        G = new bsT();
        int i2 = b + 121;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
    }

    public class bsC extends o000O000<StringBuilder> {
        private static int a = 0;
        private static int b = 1;

        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Code duplicated, block: B:9:0x002c  */
        public void d(c cVar, Object obj) throws IOException {
            String string;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 6) + (i2 | 6)) - 1;
            a = i3 % 128;
            StringBuilder sb = (StringBuilder) obj;
            if (i3 % 2 != 0) {
                int i4 = 66 / 0;
                if (sb == null) {
                    int i5 = (-2) - ((i2 + 6) ^ (-1));
                    a = i5 % 128;
                    int i6 = i5 % 2;
                    string = null;
                } else {
                    string = sb.toString();
                    int i7 = a + 79;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                }
            } else if (sb == null) {
                int i9 = (-2) - ((i2 + 6) ^ (-1));
                a = i9 % 128;
                int i10 = i9 % 2;
                string = null;
            } else {
                string = sb.toString();
                int i11 = a + 79;
                b = i11 % 128;
                int i12 = i11 % 2;
            }
            cVar.t(string);
            int i13 = b;
            int i14 = i13 & 21;
            int i15 = i14 + ((i13 ^ 21) | i14);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
        }

        public Object c(j jVar) {
            StringBuilder sb;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 97;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 97)) & i3);
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (jVar.y() == 9) {
                int i8 = b;
                int i9 = i8 ^ 125;
                int i10 = (i8 & 125) << 1;
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                jVar.s();
                int i13 = a;
                int i14 = i13 & 5;
                int i15 = (i13 | 5) & (~i14);
                int i16 = i14 << 1;
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                sb = null;
            } else {
                StringBuilder sb2 = new StringBuilder(jVar.x());
                int i19 = a;
                int i20 = i19 & 65;
                int i21 = (((i19 | 65) & (~i20)) - (~(i20 << 1))) - 1;
                b = i21 % 128;
                int i22 = i21 % 2;
                sb = sb2;
            }
            int i23 = b;
            int i24 = i23 ^ 59;
            int i25 = ((i23 & 59) | i24) << 1;
            int i26 = -i24;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            a = i27 % 128;
            int i28 = i27 % 2;
            return sb;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.J$bsw, reason: case insensitive filesystem */
    public class C0223bsw extends o000O000<Number> {
        private static int a = 1;
        private static int b;

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 45) + (i2 | 45);
            b = i3 % 128;
            int i4 = i3 % 2;
            cVar.r((Number) obj);
            int i5 = b;
            int i6 = i5 & 103;
            int i7 = (i5 | 103) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        }

        public Object c(j jVar) {
            Double dValueOf;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 76) + ((i2 & 76) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            if (jVar.y() == 9) {
                int i6 = a;
                int i7 = i6 & 65;
                int i8 = ((i6 | 65) & (~i7)) + (i7 << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                jVar.s();
                if (i9 != 0) {
                    int i10 = 18 / 0;
                }
                int i11 = a;
                int i12 = i11 & 65;
                int i13 = (i12 - (~(-(-((i11 ^ 65) | i12))))) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(jVar.p());
                int i15 = b + 17;
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = a;
            int i18 = i17 & 49;
            int i19 = (((i17 | 49) & (~i18)) - (~(-(-(i18 << 1))))) - 1;
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return dValueOf;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.J$bsx, reason: case insensitive filesystem */
    public class C0224bsx extends o000O000<Number> {
        private static int a = 0;
        private static int b = 1;

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 87;
            int i4 = ((i2 ^ 87) | i3) << 1;
            int i5 = -((i2 | 87) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            cVar.r((Number) obj);
            int i8 = b;
            int i9 = (i8 ^ 105) + ((i8 & 105) << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
        public Object c(j jVar) {
            int iY;
            int iC;
            C0330o c0330o;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 77;
            int i4 = (i3 - (~((i2 ^ 77) | i3))) - 1;
            a = i4 % 128;
            if (i4 % 2 == 0 ? (iC = P.c((iY = jVar.y()))) == 5 : (iC = P.c((iY = jVar.y()))) == 5) {
                c0330o = new C0330o(jVar.x());
                int i5 = a;
                int i6 = (i5 & (-26)) | ((~i5) & 25);
                int i7 = (i5 & 25) << 1;
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                b = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = b;
                int i11 = ((i10 ^ 97) - (~(-(-((i10 & 97) << 1))))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                if (iC != 6) {
                    int i13 = ((i10 | 87) << 1) - (i10 ^ 87);
                    a = i13 % 128;
                    if (i13 % 2 == 0 ? iC != 8 : iC != 79) {
                        StringBuilder sb = new StringBuilder();
                        int i14 = a;
                        int i15 = i14 ^ 55;
                        int i16 = (((i14 & 55) | i15) << 1) - i15;
                        b = i16 % 128;
                        if (i16 % 2 == 0) {
                            sb.append("Expecting number, got: ");
                            sb.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
                            throw null;
                        }
                        sb.append("Expecting number, got: ");
                        sb.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
                        throw new X(sb.toString());
                    }
                    int i17 = ((i10 & 70) + (i10 | 70)) - 1;
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    jVar.s();
                    int i19 = a;
                    int i20 = (((i19 | 68) << 1) - (i19 ^ 68)) - 1;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    c0330o = null;
                } else {
                    c0330o = new C0330o(jVar.x());
                    int i22 = a;
                    int i23 = (i22 & (-26)) | ((~i22) & 25);
                    int i24 = (i22 & 25) << 1;
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            int i27 = b;
            int i28 = (i27 & 48) + (i27 | 48);
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            a = i29 % 128;
            if (i29 % 2 == 0) {
                return c0330o;
            }
            throw null;
        }
    }

    public class bsY extends o000O000<Number> {
        private static int a = 0;
        private static int b = 1;

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 21) + (i2 | 21);
            a = i3 % 128;
            int i4 = i3 % 2;
            cVar.r((Number) obj);
            int i5 = a;
            int i6 = (i5 ^ 18) + ((i5 & 18) << 1);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
        }

        public Object c(j jVar) {
            Byte bValueOf;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 87;
            int i4 = i3 + ((i2 ^ 87) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            if (jVar.y() == 9) {
                int i6 = a;
                int i7 = i6 & 79;
                int i8 = (i6 ^ 79) | i7;
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                b = i9 % 128;
                int i10 = i9 % 2;
                jVar.s();
                int i11 = a;
                int i12 = ((i11 | 55) << 1) - (i11 ^ 55);
                b = i12 % 128;
                int i13 = i12 % 2;
                bValueOf = null;
            } else {
                try {
                    bValueOf = Byte.valueOf((byte) jVar.o());
                    int i14 = a;
                    int i15 = ((i14 ^ 65) - (~(-(-((i14 & 65) << 1))))) - 1;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                } catch (NumberFormatException e) {
                    throw new X(e);
                }
            }
            int i17 = a + 47;
            b = i17 % 128;
            int i18 = i17 % 2;
            return bValueOf;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.J$bst, reason: case insensitive filesystem */
    public class C0220bst extends o000O000<AtomicIntegerArray> {
        private static int a = 0;
        private static int b = 1;

        public void d(c cVar, Object obj) throws IOException {
            AtomicIntegerArray atomicIntegerArray;
            int length;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 9;
            int i5 = ((i3 | 9) & (~i4)) + (i4 << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.e();
                length = atomicIntegerArray.length();
                int i6 = 83 / 0;
            } else {
                atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.e();
                length = atomicIntegerArray.length();
            }
            int i7 = a;
            int i8 = (i7 & (-116)) | ((~i7) & 115);
            int i9 = -(-((i7 & 115) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (i12 < length) {
                int i13 = a;
                int i14 = ((i13 | 59) << 1) - (i13 ^ 59);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    cVar.o(atomicIntegerArray.get(i12));
                    int i15 = i12 & 3;
                    int i16 = -(-((i12 ^ 3) | i15));
                    i = (i15 ^ i16) + ((i16 & i15) << 1);
                } else {
                    cVar.o(atomicIntegerArray.get(i12));
                    int i17 = i12 ^ 69;
                    int i18 = ((i12 & 69) | i17) << 1;
                    int i19 = -i17;
                    int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                    int i21 = i20 & (-68);
                    int i22 = (i20 ^ (-68)) | i21;
                    i = ((i21 | i22) << 1) - (i21 ^ i22);
                }
                i12 = i;
            }
            cVar.i();
            int i23 = a;
            int i24 = (-2) - ((((i23 | 56) << 1) - (i23 ^ 56)) ^ (-1));
            b = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = 80 / 0;
            }
        }

        public Object c(j jVar) {
            int i = 2 % 2;
            ArrayList arrayList = new ArrayList();
            jVar.d();
            int i2 = b;
            int i3 = (i2 & (-52)) | ((~i2) & 51);
            int i4 = (i2 & 51) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            while (jVar.c()) {
                int i7 = b;
                int i8 = ((i7 | 45) << 1) - (i7 ^ 45);
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    arrayList.add(Integer.valueOf(jVar.o()));
                    throw null;
                }
                try {
                    arrayList.add(Integer.valueOf(jVar.o()));
                    int i9 = b;
                    int i10 = (i9 & 45) + (i9 | 45);
                    a = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 4 % 3;
                    }
                } catch (NumberFormatException e) {
                    throw new X(e);
                }
                throw new X(e);
            }
            jVar.i();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            int i12 = a + 123;
            int i13 = i12 % 128;
            b = i13;
            int i14 = i12 % 2;
            int i15 = i13 + 79;
            a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 0;
            while (i17 < size) {
                int i18 = (-2) - ((b + 110) ^ (-1));
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    throw null;
                }
                atomicIntegerArray.set(i17, ((Integer) arrayList.get(i17)).intValue());
                i17 = (-2) - (((i17 ^ 2) + ((i17 & 2) << 1)) ^ (-1));
                int i19 = b;
                int i20 = i19 & 43;
                int i21 = ((i19 ^ 43) | i20) << 1;
                int i22 = -((i19 | 43) & (~i20));
                int i23 = (i21 & i22) + (i22 | i21);
                a = i23 % 128;
                int i24 = i23 % 2;
            }
            int i25 = a;
            int i26 = (-2) - (((i25 & 48) + (i25 | 48)) ^ (-1));
            b = i26 % 128;
            if (i26 % 2 != 0) {
                return atomicIntegerArray;
            }
            throw null;
        }
    }

    public class bsW extends o000O000<BitSet> {
        private static int a = 1;
        private static int b;

        public void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 47;
            int i4 = (((i2 ^ 47) | i3) << 1) - ((i2 | 47) & (~i3));
            b = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                cVar.e();
                ((BitSet) obj).length();
                obj2.hashCode();
                throw null;
            }
            BitSet bitSet = (BitSet) obj;
            cVar.e();
            int length = bitSet.length();
            int i5 = a;
            int i6 = (i5 & 47) + (i5 | 47);
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                int i9 = b;
                int i10 = i9 & 75;
                int i11 = i9 | 75;
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    cVar.o(bitSet.get(i8) ? 1L : 0L);
                    obj2.hashCode();
                    throw null;
                }
                cVar.o(bitSet.get(i8) ? 1L : 0L);
                i8++;
                int i13 = b;
                int i14 = i13 & 61;
                int i15 = (i13 | 61) & (~i14);
                int i16 = -(-(i14 << 1));
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            cVar.i();
            int i19 = b;
            int i20 = i19 & 27;
            int i21 = (i19 ^ 27) | i20;
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00e4  */
        public Object c(j jVar) {
            boolean zN;
            int i = 2 % 2;
            BitSet bitSet = new BitSet();
            jVar.d();
            int i2 = b;
            int i3 = ((i2 ^ 47) | (i2 & 47)) << 1;
            int i4 = -(((~i2) & 47) | (i2 & (-48)));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            int iY = jVar.y();
            int i7 = b + 111;
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (iY != 2) {
                int i10 = b;
                int i11 = ((i10 & 22) + (i10 | 22)) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                int iC = P.c(iY);
                int i13 = a;
                int i14 = (i13 & 83) + (i13 | 83);
                int i15 = i14 % 128;
                b = i15;
                int i16 = i14 % 2;
                if (iC != 5) {
                    int i17 = i15 & 119;
                    int i18 = -(-((i15 ^ 119) | i17));
                    int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    if (iC != 6) {
                        int i21 = (i15 ^ 73) + ((i15 & 73) << 1);
                        a = i21 % 128;
                        if (i21 % 2 == 0) {
                            if (iC != 28) {
                                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Invalid bitset value type: ");
                                sbW.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
                                throw new X(sbW.toString());
                            }
                            int i22 = i15 & 77;
                            int i23 = -(-(i15 | 77));
                            int i24 = (i22 & i23) + (i22 | i23);
                            a = i24 % 128;
                            int i25 = i24 % 2;
                            zN = jVar.n();
                            int i26 = a;
                            int i27 = i26 & 19;
                            int i28 = ((i26 ^ 19) | i27) << 1;
                            int i29 = -((i26 | 19) & (~i27));
                            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                            b = i30 % 128;
                            int i31 = i30 % 2;
                        } else {
                            if (iC != 7) {
                                StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("Invalid bitset value type: ");
                                sbW2.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
                                throw new X(sbW2.toString());
                            }
                            int i210 = i15 & 77;
                            int i211 = -(-(i15 | 77));
                            int i212 = (i210 & i211) + (i210 | i211);
                            a = i212 % 128;
                            int i213 = i212 % 2;
                            zN = jVar.n();
                            int i214 = a;
                            int i215 = i214 & 19;
                            int i216 = ((i214 ^ 19) | i215) << 1;
                            int i217 = -((i214 | 19) & (~i215));
                            int i32 = (i216 ^ i217) + ((i217 & i216) << 1);
                            b = i32 % 128;
                            int i33 = i32 % 2;
                        }
                    } else if (jVar.o() != 0) {
                        int i34 = b;
                        int i35 = i34 & 81;
                        int i36 = (i34 ^ 81) | i35;
                        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                        zN = true;
                    } else {
                        int i39 = b;
                        int i40 = ((i39 ^ 114) + ((i39 & 114) << 1)) - 1;
                        a = i40 % 128;
                        int i41 = i40 % 2;
                        zN = false;
                    }
                } else {
                    String strX = jVar.x();
                    try {
                        if (Integer.parseInt(strX) == 0) {
                            int i310 = b;
                            int i42 = ((i310 ^ 114) + ((i310 & 114) << 1)) - 1;
                            a = i42 % 128;
                            int i43 = i42 % 2;
                            zN = false;
                        } else {
                            zN = true;
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (NumberFormatException unused) {
                        throw new X(ivas.gov.bisp.enumeration.p091n.j.r("Error: Expecting: bitset number value (1, 0), Found: ", strX));
                    }
                }
                if (!(!zN)) {
                    int i44 = a;
                    int i45 = i44 & 77;
                    int i46 = i44 | 77;
                    int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                    b = i47 % 128;
                    if (i47 % 2 != 0) {
                        bitSet.set(i9);
                        int i48 = 64 / 0;
                    } else {
                        bitSet.set(i9);
                    }
                }
                int i49 = i9 & 1;
                i9 = (((i9 | 1) & (~i49)) - (~(-(-(i49 << 1))))) - 1;
                iY = jVar.y();
                int i50 = b;
                int i51 = i50 & 115;
                int i52 = ((((i50 ^ 115) | i51) << 1) - (~(-((i50 | 115) & (~i51))))) - 1;
                a = i52 % 128;
                int i53 = i52 % 2;
            }
            jVar.i();
            int i54 = b;
            int i55 = ((i54 & (-92)) | ((~i54) & 91)) + ((i54 & 91) << 1);
            a = i55 % 128;
            int i56 = i55 % 2;
            return bitSet;
        }
    }

    public class bsX extends o000O000<Locale> {
        private static int a = 0;
        private static int b = 1;

        public void d(c cVar, Object obj) throws IOException {
            String string;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 7;
            int i4 = -(-((i2 & 7) << 1));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            a = i5 % 128;
            Object obj2 = null;
            Locale locale = (Locale) obj;
            if (i5 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (locale == null) {
                int i6 = i2 & 63;
                int i7 = ((((i2 ^ 63) | i6) << 1) - (~(-((i2 | 63) & (~i6))))) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                string = null;
            } else {
                string = locale.toString();
                int i9 = b + 15;
                a = i9 % 128;
                int i10 = i9 % 2;
            }
            cVar.t(string);
            int i11 = b + 43;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0157 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:34:0x0159  */
        /* JADX WARN: Code duplicated, block: B:35:0x0168  */
        public Object c(j jVar) {
            String strNextToken;
            String strNextToken2;
            String strNextToken3;
            Locale locale;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 43) | (i2 & 43)) << 1;
            int i4 = -(((~i2) & 43) | (i2 & (-44)));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            if (jVar.y() == 9) {
                int i7 = b;
                int i8 = i7 ^ 81;
                int i9 = ((i7 & 81) | i8) << 1;
                int i10 = -i8;
                int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
                a = i11 % 128;
                int i12 = i11 % 2;
                jVar.s();
                int i13 = b;
                int i14 = ((i13 & 48) + (i13 | 48)) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                locale = null;
            } else {
                StringTokenizer stringTokenizer = new StringTokenizer(jVar.x(), "_");
                int i16 = a + 58;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                if (stringTokenizer.hasMoreElements()) {
                    int i19 = b;
                    int i20 = i19 & 113;
                    int i21 = (((i19 | 113) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
                    a = i21 % 128;
                    if (i21 % 2 != 0) {
                        strNextToken = stringTokenizer.nextToken();
                        int i22 = 86 / 0;
                    } else {
                        strNextToken = stringTokenizer.nextToken();
                    }
                    int i23 = b;
                    int i24 = i23 & 63;
                    int i25 = ((((i23 ^ 63) | i24) << 1) - (~(-((i23 | 63) & (~i24))))) - 1;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                } else {
                    int i27 = b;
                    int i28 = (i27 | 1) << 1;
                    int i29 = -(i27 ^ 1);
                    int i30 = (i28 & i29) + (i29 | i28);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    strNextToken = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    int i32 = a;
                    int i33 = i32 & 37;
                    int i34 = i33 + ((i32 ^ 37) | i33);
                    b = i34 % 128;
                    if (i34 % 2 == 0) {
                        stringTokenizer.nextToken();
                        obj.hashCode();
                        throw null;
                    }
                    strNextToken2 = stringTokenizer.nextToken();
                } else {
                    int i35 = a;
                    int i36 = (i35 & (-38)) | ((~i35) & 37);
                    int i37 = -(-((i35 & 37) << 1));
                    int i38 = (i36 & i37) + (i37 | i36);
                    b = i38 % 128;
                    int i39 = i38 % 2;
                    strNextToken2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    int i40 = b;
                    int i41 = i40 & 125;
                    int i42 = (i40 ^ 125) | i41;
                    int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                    a = i43 % 128;
                    int i44 = i43 % 2;
                    strNextToken3 = stringTokenizer.nextToken();
                    int i45 = b;
                    int i46 = (i45 & 62) + (i45 | 62);
                    int i47 = (i46 ^ (-1)) + (i46 << 1);
                    a = i47 % 128;
                    if (i47 % 2 != 0) {
                        int i48 = 2 % 4;
                    }
                } else {
                    strNextToken3 = null;
                }
                if (strNextToken2 == null) {
                    int i49 = a;
                    int i50 = i49 & 105;
                    int i51 = -(-((i49 ^ 105) | i50));
                    int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                    b = i52 % 128;
                    if (i52 % 2 == 0) {
                        throw null;
                    }
                    if (strNextToken3 == null) {
                        locale = new Locale(strNextToken);
                        int i53 = b;
                        int i54 = ((i53 | 109) << 1) - (i53 ^ 109);
                        a = i54 % 128;
                        int i55 = i54 % 2;
                    } else if (strNextToken3 == null) {
                        locale = new Locale(strNextToken, strNextToken2);
                        int i56 = b + 51;
                        a = i56 % 128;
                        int i57 = i56 % 2;
                    } else {
                        Locale locale2 = new Locale(strNextToken, strNextToken2, strNextToken3);
                        int i58 = b;
                        int i59 = (-2) - ((((i58 | 18) << 1) - (i58 ^ 18)) ^ (-1));
                        a = i59 % 128;
                        int i60 = i59 % 2;
                        locale = locale2;
                    }
                } else if (strNextToken3 == null) {
                    locale = new Locale(strNextToken, strNextToken2);
                    int i510 = b + 51;
                    a = i510 % 128;
                    int i511 = i510 % 2;
                } else {
                    Locale locale3 = new Locale(strNextToken, strNextToken2, strNextToken3);
                    int i512 = b;
                    int i513 = (-2) - ((((i512 | 18) << 1) - (i512 ^ 18)) ^ (-1));
                    a = i513 % 128;
                    int i61 = i513 % 2;
                    locale = locale3;
                }
            }
            int i62 = a;
            int i63 = (i62 & (-16)) | ((~i62) & 15);
            int i64 = -(-((i62 & 15) << 1));
            int i65 = (i63 & i64) + (i64 | i63);
            b = i65 % 128;
            if (i65 % 2 != 0) {
                return locale;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class bsP extends o000O000<Calendar> {
        private static int a = 0;
        private static int b = 1;

        public Object c(j jVar) {
            GregorianCalendar gregorianCalendar;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 77;
            int i4 = (i2 & 77) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (jVar.y() == 9) {
                int i7 = b;
                int i8 = (i7 & 53) + (i7 | 53);
                a = i8 % 128;
                int i9 = i8 % 2;
                jVar.s();
                int i10 = b;
                int i11 = i10 & 55;
                int i12 = ((((i10 ^ 55) | i11) << 1) - (~(-((i10 | 55) & (~i11))))) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
                gregorianCalendar = null;
            } else {
                jVar.e();
                int i14 = b;
                int i15 = i14 & 83;
                int i16 = i15 + ((i14 ^ 83) | i15);
                a = i16 % 128;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = i16 % 2 != 0 ? 1 : 0;
                while (jVar.y() != 4) {
                    int i23 = b;
                    int i24 = (i23 & (-88)) | ((~i23) & 87);
                    int i25 = -(-((i23 & 87) << 1));
                    int i26 = (i24 & i25) + (i25 | i24);
                    a = i26 % 128;
                    int i27 = i26 % 2;
                    String strR = jVar.r();
                    int iO = jVar.o();
                    int i28 = a;
                    int i29 = ((i28 | 59) << 1) - (i28 ^ 59);
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    if (!(!"year".equals(strR))) {
                        int i31 = b;
                        int i32 = i31 & 79;
                        int i33 = i32 + ((i31 ^ 79) | i32);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                        int i35 = ((i31 | 35) << 1) - (i31 ^ 35);
                        a = i35 % 128;
                        int i36 = i35 % 2;
                        i17 = iO;
                    } else if (!(!"month".equals(strR))) {
                        int i37 = b;
                        int i38 = i37 ^ 35;
                        int i39 = ((((i37 & 35) | i38) << 1) - (~(-i38))) - 1;
                        a = i39 % 128;
                        int i40 = i39 % 2;
                        int i41 = (i37 & 35) + (i37 | 35);
                        a = i41 % 128;
                        int i42 = i41 % 2;
                        i18 = iO;
                    } else if ("dayOfMonth".equals(strR)) {
                        int i43 = a;
                        int i44 = i43 & 69;
                        int i45 = (i43 | 69) & (~i44);
                        int i46 = i44 << 1;
                        int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                        int i48 = i47 % 128;
                        b = i48;
                        if (i47 % 2 == 0) {
                            int i49 = 55 / 0;
                        }
                        int i50 = ((i48 ^ 121) | (i48 & 121)) << 1;
                        int i51 = -(((~i48) & 121) | (i48 & (-122)));
                        int i52 = (i50 & i51) + (i51 | i50);
                        a = i52 % 128;
                        if (i52 % 2 != 0) {
                            int i53 = 3 % 3;
                        }
                        i19 = iO;
                    } else if ("hourOfDay".equals(strR)) {
                        int i54 = b;
                        int i55 = (((i54 ^ 97) | (i54 & 97)) << 1) - ((i54 & (-98)) | ((~i54) & 97));
                        a = i55 % 128;
                        int i56 = i55 % 2;
                        int i57 = (i54 ^ 89) + ((i54 & 89) << 1);
                        a = i57 % 128;
                        if (i57 % 2 != 0) {
                            int i58 = 3 / 2;
                        }
                        i20 = iO;
                    } else if (!(!"minute".equals(strR))) {
                        int i59 = a;
                        int i60 = i59 + 13;
                        b = i60 % 128;
                        int i61 = i60 % 2;
                        int i62 = i59 & 77;
                        int i63 = (i59 ^ 77) | i62;
                        int i64 = (i62 & i63) + (i63 | i62);
                        b = i64 % 128;
                        int i65 = i64 % 2;
                        i21 = iO;
                    } else if ("second".equals(strR)) {
                        int i66 = b;
                        int i67 = i66 & 65;
                        int i68 = -(-((i66 ^ 65) | i67));
                        int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                        int i70 = i69 % 128;
                        a = i70;
                        int i71 = i69 % 2;
                        int i72 = ((i70 ^ 90) + ((i70 & 90) << 1)) - 1;
                        b = i72 % 128;
                        int i73 = i72 % 2;
                        i22 = iO;
                    }
                }
                jVar.h();
                gregorianCalendar = new GregorianCalendar(i17, i18, i19, i20, i21, i22);
                int i74 = b;
                int i75 = i74 ^ 117;
                int i76 = (i74 & 117) << 1;
                int i77 = (i75 & i76) + (i76 | i75);
                a = i77 % 128;
                if (i77 % 2 != 0) {
                    throw null;
                }
            }
            int i78 = a;
            int i79 = i78 & 115;
            int i80 = (i78 | 115) & (~i79);
            int i81 = i79 << 1;
            int i82 = (i80 & i81) + (i80 | i81);
            b = i82 % 128;
            if (i82 % 2 != 0) {
                return gregorianCalendar;
            }
            throw null;
        }

        public void d(c cVar, Object obj) throws IOException {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 & 59;
            int i6 = (((~i5) & (i4 | 59)) - (~(i5 << 1))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                int i8 = (((i4 & (-46)) | ((~i4) & 45)) - (~(-(-((i4 & 45) << 1))))) - 1;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    cVar.c();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                cVar.c();
                int i9 = b;
                int i10 = ((i9 & 12) + (i9 | 12)) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            cVar.f();
            cVar.j("year");
            int i12 = calendar.get(1);
            int i13 = a;
            int i14 = (-2) - ((((i13 | 80) << 1) - (i13 ^ 80)) ^ (-1));
            b = i14 % 128;
            long j = i12;
            if (i14 % 2 == 0) {
                cVar.o(j);
                cVar.j("month");
                i = calendar.get(3);
            } else {
                cVar.o(j);
                cVar.j("month");
                i = calendar.get(2);
            }
            cVar.o(i);
            cVar.j("dayOfMonth");
            int i15 = calendar.get(5);
            int i16 = a;
            int i17 = ((i16 & 92) + (i16 | 92)) - 1;
            b = i17 % 128;
            if (i17 % 2 == 0) {
                cVar.o(i15);
                cVar.j("hourOfDay");
                i2 = 40;
            } else {
                cVar.o(i15);
                cVar.j("hourOfDay");
                i2 = 11;
            }
            cVar.o(calendar.get(i2));
            cVar.j("minute");
            int i18 = a + 47;
            b = i18 % 128;
            if (i18 % 2 == 0) {
                cVar.o(calendar.get(57));
            } else {
                cVar.o(calendar.get(12));
            }
            cVar.j("second");
            int i19 = a;
            int i20 = i19 & 3;
            int i21 = (i19 ^ 3) | i20;
            int i22 = (i20 & i21) + (i21 | i20);
            b = i22 % 128;
            int i23 = i22 % 2;
            cVar.o(calendar.get(13));
            cVar.h();
            int i24 = a;
            int i25 = (i24 & (-106)) | ((~i24) & 105);
            int i26 = -(-((i24 & 105) << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = ((i24 & 85) - (~(-(-(i24 | 85))))) - 1;
            b = i29 % 128;
            if (i29 % 2 == 0) {
                int i30 = 29 / 0;
            }
        }
    }

    public class bsQ extends o000O000<n> {
        private static int a = 1;
        private static int b;

        public /* synthetic */ Object c(j jVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 40) + (i2 | 40);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return e(jVar);
            }
            int i5 = 76 / 0;
            return e(jVar);
        }

        public /* synthetic */ void d(c cVar, Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = a + 71;
            b = i2 % 128;
            int i3 = i2 % 2;
            f(cVar, (n) obj);
            int i4 = a;
            int i5 = ((i4 ^ 109) | (i4 & 109)) << 1;
            int i6 = -(((~i4) & 109) | (i4 & (-110)));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 88 / 0;
            }
        }

        public n e(j jVar) {
            String strR;
            n nVarE;
            o000oOoO<String, n> o000oooo;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 97;
            int i4 = (i2 ^ 97) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            int iC = P.c(jVar.y());
            Object obj = null;
            if (iC == 0) {
                W w = new W();
                jVar.d();
                int i7 = a;
                int i8 = i7 ^ 103;
                int i9 = -(-((i7 & 103) << 1));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                while (jVar.c()) {
                    int i12 = a;
                    int i13 = (((i12 ^ 51) | (i12 & 51)) << 1) - (((~i12) & 51) | (i12 & (-52)));
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        w.c.add(e(jVar));
                        int i14 = 88 / 0;
                    } else {
                        w.c.add(e(jVar));
                    }
                    int i15 = a;
                    int i16 = (i15 & 35) + (i15 | 35);
                    b = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                }
                jVar.i();
                int i17 = b;
                int i18 = i17 & 29;
                int i19 = i18 + ((i17 ^ 29) | i18);
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 8 / 0;
                }
                return w;
            }
            int i21 = b;
            int i22 = ((i21 & (-24)) | ((~i21) & 23)) + ((i21 & 23) << 1);
            a = i22 % 128;
            if (i22 % 2 != 0 ? iC == 2 : iC == 2) {
                C0144q c0144q = new C0144q();
                jVar.e();
                int i23 = a + 47;
                b = i23 % 128;
                int i24 = i23 % 2;
                while (jVar.c()) {
                    int i25 = b + 81;
                    a = i25 % 128;
                    if (i25 % 2 == 0) {
                        strR = jVar.r();
                        nVarE = e(jVar);
                        o000oooo = c0144q.c;
                        int i26 = 3 / 0;
                    } else {
                        strR = jVar.r();
                        nVarE = e(jVar);
                        o000oooo = c0144q.c;
                    }
                    o000oooo.put(strR, nVarE);
                    int i27 = a;
                    int i28 = i27 & 13;
                    int i29 = -(-((i27 ^ 13) | i28));
                    int i30 = (i28 & i29) + (i29 | i28);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                }
                jVar.h();
                int i32 = a;
                int i33 = i32 & 5;
                int i34 = (i33 - (~((i32 ^ 5) | i33))) - 1;
                b = i34 % 128;
                if (i34 % 2 == 0) {
                    return c0144q;
                }
                throw null;
            }
            if (iC == 5) {
                Z z = new Z(jVar.x());
                int i35 = b + 37;
                a = i35 % 128;
                if (i35 % 2 != 0) {
                    return z;
                }
                throw null;
            }
            int i36 = i21 & 117;
            int i37 = (((i21 ^ 117) | i36) << 1) - ((~i36) & (i21 | 117));
            a = i37 % 128;
            int i38 = i37 % 2;
            if (iC == 6) {
                Z z2 = new Z(new C0330o(jVar.x()));
                int i39 = a + 19;
                b = i39 % 128;
                if (i39 % 2 != 0) {
                    int i40 = 49 / 0;
                }
                return z2;
            }
            int i41 = i21 & 51;
            int i42 = ((~i41) & (i21 | 51)) + (i41 << 1);
            a = i42 % 128;
            int i43 = i42 % 2;
            if (iC == 7) {
                Z z3 = new Z(Boolean.valueOf(jVar.n()));
                int i44 = a;
                int i45 = (i44 | 63) << 1;
                int i46 = -(((~i44) & 63) | (i44 & (-64)));
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                b = i47 % 128;
                if (i47 % 2 == 0) {
                    return z3;
                }
                obj.hashCode();
                throw null;
            }
            int i48 = i21 + 67;
            a = i48 % 128;
            if (i48 % 2 != 0 ? iC != 8 : iC != 31) {
                throw new IllegalArgumentException();
            }
            jVar.s();
            Y y = Y.c;
            int i49 = b + 111;
            a = i49 % 128;
            int i50 = i49 % 2;
            return y;
        }

        /* JADX WARN: Code duplicated, block: B:115:0x01ce A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:0x01b3 A[LOOP:0: B:54:0x013a->B:74:0x01b3, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        public void f(c cVar, n nVar) throws IOException {
            ivas.gov.bisp.enumeration.p102y.J j;
            ivas.gov.bisp.enumeration.y.J.blF blf;
            boolean z;
            ivas.gov.bisp.enumeration.y.J.blF blf2;
            String str;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 23;
            int i5 = ((((i3 ^ 23) | i4) << 1) - (~(-((i3 | 23) & (~i4))))) - 1;
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            if (nVar != null) {
                int i8 = (((i6 | 120) << 1) - (i6 ^ 120)) - 1;
                int i9 = i8 % 128;
                b = i9;
                Object obj = null;
                if (i8 % 2 != 0) {
                    boolean z2 = nVar instanceof Y;
                    obj.hashCode();
                    throw null;
                }
                if (!(nVar instanceof Y)) {
                    if (nVar instanceof Z) {
                        int i10 = (i9 ^ 45) + ((i9 & 45) << 1);
                        a = i10 % 128;
                        if (i10 % 2 == 0) {
                            Object obj2 = nVar.d().c;
                            throw null;
                        }
                        Z zD = nVar.d();
                        Object obj3 = zD.c;
                        int i11 = b;
                        int i12 = ((i11 ^ 113) | (i11 & 113)) << 1;
                        int i13 = -(((~i11) & 113) | (i11 & (-114)));
                        int i14 = (i12 & i13) + (i13 | i12);
                        int i15 = i14 % 128;
                        a = i15;
                        if (i14 % 2 == 0) {
                            boolean z3 = obj3 instanceof Number;
                            obj.hashCode();
                            throw null;
                        }
                        if (!(!(obj3 instanceof Number))) {
                            int i16 = i15 ^ 89;
                            int i17 = -(-((i15 & 89) << 1));
                            int i18 = (i16 & i17) + (i16 | i17);
                            b = i18 % 128;
                            if (i18 % 2 == 0) {
                                cVar.r(zD.g());
                                return;
                            } else {
                                cVar.r(zD.g());
                                int i19 = 92 / 0;
                                return;
                            }
                        }
                        if (!(obj3 instanceof Boolean)) {
                            cVar.t(zD.h());
                            int i20 = b;
                            int i21 = (i20 & (-34)) | ((~i20) & 33);
                            int i22 = (i20 & 33) << 1;
                            int i23 = (i21 & i22) + (i22 | i21);
                            a = i23 % 128;
                            if (i23 % 2 == 0) {
                                int i24 = 21 / 0;
                                return;
                            }
                            return;
                        }
                        int i25 = i15 + 123;
                        b = i25 % 128;
                        if (i25 % 2 != 0) {
                            cVar.s(zD.f());
                            obj.hashCode();
                            throw null;
                        }
                        cVar.s(zD.f());
                        int i26 = b;
                        int i27 = (((i26 | 110) << 1) - (i26 ^ 110)) - 1;
                        a = i27 % 128;
                        if (i27 % 2 == 0) {
                            int i28 = 56 / 0;
                            return;
                        }
                        return;
                    }
                    if (!(nVar instanceof W)) {
                        boolean z4 = nVar instanceof C0144q;
                        if (!z4) {
                            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Couldn't write ");
                            sbW.append(nVar.getClass());
                            throw new IllegalArgumentException(sbW.toString());
                        }
                        int i29 = i9 + 119;
                        a = i29 % 128;
                        if (i29 % 2 == 0) {
                            cVar.f();
                            obj.hashCode();
                            throw null;
                        }
                        cVar.f();
                        if (!z4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Not a JSON Object: ");
                            sb.append(nVar);
                            throw new IllegalStateException(sb.toString());
                        }
                        ivas.gov.bisp.enumeration.y.J.blB blb = (ivas.gov.bisp.enumeration.y.J.blB) ((C0144q) nVar).c.entrySet();
                        int i30 = a;
                        int i31 = (((i30 | 102) << 1) - (i30 ^ 102)) - 1;
                        b = i31 % 128;
                        if (i31 % 2 != 0) {
                            j = ivas.gov.bisp.enumeration.p102y.J.this;
                            blf = j.g.h;
                            int i32 = 76 / 0;
                        } else {
                            j = ivas.gov.bisp.enumeration.p102y.J.this;
                            blf = j.g.h;
                        }
                        int i33 = a + 5;
                        b = i33 % 128;
                        if (i33 % 2 != 0) {
                            int i34 = j.h;
                            obj.hashCode();
                            throw null;
                        }
                        int i35 = j.h;
                        while (true) {
                            ivas.gov.bisp.enumeration.y.J.blF blf3 = j.g;
                            if (blf != blf3) {
                                int i36 = a;
                                int i37 = (((i36 | 42) << 1) - (i36 ^ 42)) - 1;
                                b = i37 % 128;
                                z = i37 % 2 == 0;
                                int i38 = ((i36 | 107) << 1) - (i36 ^ 107);
                                b = i38 % 128;
                                int i39 = i38 % 2;
                            } else {
                                int i40 = b;
                                int i41 = i40 & 33;
                                int i42 = i41 + ((i40 ^ 33) | i41);
                                a = i42 % 128;
                                int i43 = i42 % 2;
                                z = false;
                            }
                            if (!z) {
                                cVar.h();
                                int i44 = a;
                                int i45 = i44 & 77;
                                int i46 = ((i44 ^ 77) | i45) << 1;
                                int i47 = -((i44 | 77) & (~i45));
                                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                                b = i48 % 128;
                                if (i48 % 2 == 0) {
                                    return;
                                }
                                obj.hashCode();
                                throw null;
                            }
                            int i49 = b;
                            int i50 = i49 & 59;
                            int i51 = i50 + ((i49 ^ 59) | i50);
                            a = i51 % 128;
                            int i52 = i51 % 2;
                            if (blf == blf3) {
                                throw new NoSuchElementException();
                            }
                            int i53 = ((i49 | 107) << 1) - (i49 ^ 107);
                            a = i53 % 128;
                            if (i53 % 2 == 0) {
                                int i54 = 24 / 0;
                                if (j.h != i35) {
                                    throw new ConcurrentModificationException();
                                }
                                int i55 = b + 77;
                                a = i55 % 128;
                                int i56 = i55 % 2;
                                blf2 = blf.h;
                                str = (String) blf.i;
                                int i57 = b;
                                i = (i57 ^ 23) + ((i57 & 23) << 1);
                                a = i % 128;
                                if (i % 2 != 0) {
                                    cVar.j(str);
                                    f(cVar, (n) blf.j);
                                    throw null;
                                }
                                cVar.j(str);
                                f(cVar, (n) blf.j);
                                int i58 = b;
                                int i59 = ((i58 & 115) - (~(i58 | 115))) - 1;
                                a = i59 % 128;
                                int i60 = i59 % 2;
                                blf = blf2;
                            } else {
                                if (j.h != i35) {
                                    throw new ConcurrentModificationException();
                                }
                                int i510 = b + 77;
                                a = i510 % 128;
                                int i511 = i510 % 2;
                                blf2 = blf.h;
                                str = (String) blf.i;
                                int i512 = b;
                                i = (i512 ^ 23) + ((i512 & 23) << 1);
                                a = i % 128;
                                if (i % 2 != 0) {
                                    cVar.j(str);
                                    f(cVar, (n) blf.j);
                                    throw null;
                                }
                                cVar.j(str);
                                f(cVar, (n) blf.j);
                                int i513 = b;
                                int i514 = ((i513 & 115) - (~(i513 | 115))) - 1;
                                a = i514 % 128;
                                int i61 = i514 % 2;
                                blf = blf2;
                            }
                        }
                    } else {
                        int i62 = (i6 & 75) + (i6 | 75);
                        b = i62 % 128;
                        if (i62 % 2 != 0) {
                            cVar.e();
                            nVar.c().iterator();
                            throw null;
                        }
                        cVar.e();
                        Iterator<n> it = nVar.c().iterator();
                        int i63 = a;
                        int i64 = ((i63 & 114) + (i63 | 114)) - 1;
                        b = i64 % 128;
                        while (true) {
                            int i65 = i64 % 2;
                            if (!it.hasNext()) {
                                cVar.i();
                                int i66 = b + 69;
                                a = i66 % 128;
                                int i67 = i66 % 2;
                                return;
                            }
                            int i68 = a;
                            int i69 = ((i68 & 119) - (~(i68 | 119))) - 1;
                            b = i69 % 128;
                            if (i69 % 2 != 0) {
                                f(cVar, it.next());
                                obj.hashCode();
                                throw null;
                            }
                            f(cVar, it.next());
                            int i70 = b;
                            i64 = (i70 ^ 87) + ((i70 & 87) << 1);
                            a = i64 % 128;
                        }
                    }
                }
            }
            cVar.c();
            int i71 = a;
            int i72 = i71 & 105;
            int i73 = (((i71 ^ 105) | i72) << 1) - ((i71 | 105) & (~i72));
            b = i73 % 128;
            int i74 = i73 % 2;
        }
    }
}
