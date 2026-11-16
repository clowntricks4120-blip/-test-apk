package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.aC.A;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.o0000o0o.OooOo00;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.o0000o0o.o0ooOOo;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class R {
    private static int a = 0x00000001;
    private static int b;
    public static final Logger c = Logger.getLogger(R.class.getName());
    public static final ConcurrentMap<String, bgZ> d = new ConcurrentHashMap();
    public static final ConcurrentMap<String, Object> e = new ConcurrentHashMap();
    public static final ConcurrentMap<String, Boolean> f = new ConcurrentHashMap();
    public static final ConcurrentMap<Class<?>, o0ooOOo<?, ?>> g;

    public interface bgZ {
        <P> OooOo00<P> b(Class<P> cls);

        OooOo00<?> c();

        Class<?> d();

        Set<Class<?>> e();
    }

    static {
        new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        int i = b;
        int i2 = i & 39;
        int i3 = (i | 39) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            g = concurrentHashMap;
        } else {
            g = concurrentHashMap;
            throw null;
        }
    }

    public static void c(String str, Class<?> cls, boolean z) {
        synchronized (R.class) {
            ConcurrentMap<String, bgZ> concurrentMap = d;
            if (((ConcurrentHashMap) concurrentMap).containsKey(str)) {
                bgZ bgz = (bgZ) ((ConcurrentHashMap) concurrentMap).get(str);
                if (!bgz.d().equals(cls)) {
                    Logger logger = c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempted overwrite of a registered key manager for key type ");
                    sb.append(str);
                    logger.warning(sb.toString());
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, bgz.d().getName(), cls.getName()));
                }
                if (z && !((Boolean) ((ConcurrentHashMap) f).get(str)).booleanValue()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("New keys are already disallowed for key type ");
                    sb2.append(str);
                    throw new GeneralSecurityException(sb2.toString());
                }
            }
        }
    }

    public static bgZ d(String str) {
        bgZ bgz;
        synchronized (R.class) {
            ConcurrentMap<String, bgZ> concurrentMap = d;
            if (!((ConcurrentHashMap) concurrentMap).containsKey(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("No key manager found for key type ");
                sb.append(str);
                throw new GeneralSecurityException(sb.toString());
            }
            bgz = (bgZ) ((ConcurrentHashMap) concurrentMap).get(str);
        }
        return bgz;
    }

    public static <P> P e(String str, byte[] bArr, Class<P> cls) {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 86) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
        AbstractC0069z abstractC0069z = AbstractC0069z.c;
        AbstractC0069z abstractC0069zE = AbstractC0069z.e(bArr, 0, bArr.length);
        int i4 = a;
        int i5 = i4 & 61;
        int i6 = (i4 ^ 61) | i5;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        P p = (P) f(str, abstractC0069zE, cls);
        int i9 = a;
        int i10 = (i9 | 101) << 1;
        int i11 = -(((~i9) & 101) | (i9 & (-102)));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return p;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <KeyProtoT extends aa> void g(Oooo0<KeyProtoT> oooo0, boolean z) {
        synchronized (R.class) {
            String strC = oooo0.c();
            c(strC, oooo0.getClass(), z);
            ConcurrentMap<String, bgZ> concurrentMap = d;
            if (!((ConcurrentHashMap) concurrentMap).containsKey(strC)) {
                ((ConcurrentHashMap) concurrentMap).put(strC, new S(oooo0));
                ((ConcurrentHashMap) e).put(strC, new L(oooo0));
            }
            ((ConcurrentHashMap) f).put(strC, Boolean.valueOf(z));
        }
    }

    public static ivas.gov.bisp.enumeration.aC.R h(A a2) {
        ivas.gov.bisp.enumeration.aC.R rE;
        synchronized (R.class) {
            C0078l c0078lC = d(a2.A()).c();
            if (!((Boolean) ((ConcurrentHashMap) f).get(a2.A())).booleanValue()) {
                StringBuilder sb = new StringBuilder();
                sb.append("newKey-operation not permitted for key type ");
                sb.append(a2.A());
                throw new GeneralSecurityException(sb.toString());
            }
            rE = c0078lC.e(a2.F());
        }
        return rE;
    }

    public static <B, P> void i(o0ooOOo<B, P> o0ooooo) {
        synchronized (R.class) {
            Class<P> clsC = o0ooooo.c();
            ConcurrentMap<Class<?>, o0ooOOo<?, ?>> concurrentMap = g;
            if (((ConcurrentHashMap) concurrentMap).containsKey(clsC)) {
                T t = (T) ((ConcurrentHashMap) concurrentMap).get(clsC);
                if (!o0ooooo.getClass().equals(t.getClass())) {
                    Logger logger = c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempted overwrite of a registered SetWrapper for type ");
                    sb.append(clsC);
                    logger.warning(sb.toString());
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsC.getName(), t.getClass().getName(), o0ooooo.getClass().getName()));
                }
            }
            ((ConcurrentHashMap) concurrentMap).put(clsC, o0ooooo);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0112 A[PHI: r4
  0x0112: PHI (r4v13 java.lang.Class<?>) = (r4v12 java.lang.Class<?>), (r4v20 java.lang.Class<?>) binds: [B:28:0x010f, B:25:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x012c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0133  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <P> P f(java.lang.String r7, ivas.gov.bisp.enumeration.aD.AbstractC0069z r8, java.lang.Class<P> r9) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aS.R.f(java.lang.String, ivas.gov.bisp.enumeration.aD.z, java.lang.Class):java.lang.Object");
    }
}
