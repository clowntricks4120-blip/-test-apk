package ivas.gov.bisp.enumeration.p035bh;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000000O;
import ivas.gov.bisp.enumeration.o000O0o.o00000O0;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p050bw.C0226j;
import ivas.gov.bisp.enumeration.p050bw.C0228p;
import ivas.gov.bisp.enumeration.p050bw.J;
import ivas.gov.bisp.enumeration.p050bw.M;
import ivas.gov.bisp.enumeration.p050bw.c;
import ivas.gov.bisp.enumeration.p050bw.h;
import ivas.gov.bisp.enumeration.p050bw.t;
import ivas.gov.bisp.enumeration.p050bw.u;
import ivas.gov.bisp.enumeration.p050bw.x;
import ivas.gov.bisp.enumeration.p050bw.z;
import ivas.gov.bisp.enumeration.p102y.l;
import ivas.gov.bisp.enumeration.p102y.r;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class C {
    private static int a = 1;
    private static int b;
    public static final TypeToken<?> c = new TypeToken<>(Object.class);
    public final boolean d;
    public final ThreadLocal<Map<TypeToken<?>, o000000O.OooO00o<?>>> e;
    public final Map<TypeToken<?>, o000O000<?>> f;
    public final r g;
    public final ivas.gov.bisp.enumeration.p050bw.r h;
    public final Map<Type, o00000O0<?>> i;
    public final List<E> j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<E> f73o;
    public final List<E> p;

    public static class bnV<T> extends o000O000<T> {
        private static int a = 0;
        private static int b = 1;
        public o000O000<T> c;

        public T c(j jVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 57;
            a = i3 % 128;
            int i4 = i3 % 2;
            o000O000<T> o000o000 = this.c;
            if (o000o000 == null) {
                throw new IllegalStateException();
            }
            int i5 = i2 & 1;
            int i6 = ((i2 | 1) & (~i5)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            T t = (T) o000o000.c(jVar);
            int i8 = a + 121;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return t;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
        
            r5 = 64 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            throw new java.lang.IllegalStateException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r1 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        
            if (r1 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            r1.d(r5, r6);
            r5 = ivas.gov.bisp.enumeration.bh.C.bnV.a;
            r6 = ((r5 ^ 104) + ((r5 & 104) << 1)) - 1;
            ivas.gov.bisp.enumeration.bh.C.bnV.b = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        
            if ((r6 % 2) != 0) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(ivas.gov.bisp.enumeration.p032be.c r5, T r6) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.bh.C.bnV.a
                r2 = r1 & 35
                int r3 = ~r2
                r1 = r1 | 35
                r1 = r1 & r3
                int r2 = r2 << 1
                int r2 = -r2
                int r2 = -r2
                r3 = r1 ^ r2
                r1 = r1 & r2
                int r1 = r1 << 1
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.bh.C.bnV.b = r1
                int r3 = r3 % r0
                ivas.gov.bisp.enumeration.o000O0o.o000O000<T> r1 = r4.c
                if (r3 != 0) goto L25
                r2 = 57
                int r2 = r2 / 0
                if (r1 == 0) goto L41
                goto L27
            L25:
                if (r1 == 0) goto L41
            L27:
                r1.d(r5, r6)
                int r5 = ivas.gov.bisp.enumeration.bh.C.bnV.a
                r6 = r5 ^ 104(0x68, float:1.46E-43)
                r5 = r5 & 104(0x68, float:1.46E-43)
                int r5 = r5 << 1
                int r6 = r6 + r5
                int r6 = r6 + (-1)
                int r5 = r6 % 128
                ivas.gov.bisp.enumeration.bh.C.bnV.b = r5
                int r6 = r6 % r0
                if (r6 != 0) goto L40
                r5 = 64
                int r5 = r5 / 0
            L40:
                return
            L41:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bh.C.bnV.d(ivas.gov.bisp.enumeration.be.c, java.lang.Object):void");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C() {
        l lVar = l.c;
        S s = S.c;
        Map mapEmptyMap = Collections.emptyMap();
        ab abVar = ab.c;
        int i = b;
        int i2 = ((i ^ 77) | (i & 77)) << 1;
        int i3 = -(((~i) & 77) | (i & (-78)));
        int i4 = (i2 & i3) + (i3 | i2);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            Collections.emptyList();
            Collections.emptyList();
            Collections.emptyList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        int i5 = b;
        int i6 = (((i5 & (-20)) | ((~i5) & 19)) - (~(-(-((i5 & 19) << 1))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        this(lVar, s, mapEmptyMap, false, false, false, true, false, false, false, abVar, null, 2, 2, listEmptyList, listEmptyList2, listEmptyList3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public static void d(double d) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 46) + ((i3 & 46) << 1)) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
            if (!Double.isNaN(d)) {
                if (!Double.isInfinite(d)) {
                    int i6 = b;
                    i = ((i6 & 4) + (i6 | 4)) - 1;
                    a = i % 128;
                    if (i % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else if (!Double.isNaN(d)) {
            if (!Double.isInfinite(d)) {
                int i7 = b;
                i = ((i7 & 4) + (i7 | 4)) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        throw new IllegalArgumentException(sb.toString());
    }

    static {
        int i = a + 15;
        b = i % 128;
        int i2 = i % 2;
    }

    public final <T> T f(String str, Class<T> cls) {
        GenericDeclaration genericDeclaration;
        int i = 2 % 2;
        int i2 = b + 51;
        a = i2 % 128;
        int i3 = i2 % 2;
        Object objG = g(str, cls);
        if (cls != Integer.TYPE) {
            Object obj = null;
            if (cls == Float.TYPE) {
                int i4 = a + 115;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                cls = (Class<T>) Float.class;
            } else if (cls == Byte.TYPE) {
                int i5 = b;
                int i6 = ((i5 ^ 24) + ((i5 & 24) << 1)) - 1;
                int i7 = i6 % 128;
                a = i7;
                if (i6 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                genericDeclaration = Byte.class;
                int i8 = i7 & 49;
                int i9 = ((((i7 ^ 49) | i8) << 1) - (~(-((i7 | 49) & (~i8))))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
            } else if (cls == Double.TYPE) {
                int i11 = b;
                int i12 = i11 & 109;
                int i13 = (~i12) & (i11 | 109);
                int i14 = -(-(i12 << 1));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    genericDeclaration = Double.class;
                    int i16 = 27 / 0;
                } else {
                    genericDeclaration = Double.class;
                }
                int i17 = i11 ^ 121;
                int i18 = ((i11 & 121) | i17) << 1;
                int i19 = -i17;
                int i20 = (i18 & i19) + (i18 | i19);
                a = i20 % 128;
                int i21 = i20 % 2;
            } else if (cls == Long.TYPE) {
                int i22 = b;
                int i23 = i22 & 73;
                int i24 = (i22 ^ 73) | i23;
                int i25 = (i23 & i24) + (i24 | i23);
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                cls = (Class<T>) Long.class;
            } else if (cls == Character.TYPE) {
                int i26 = a;
                int i27 = i26 & 61;
                int i28 = (i26 ^ 61) | i27;
                int i29 = (i27 & i28) + (i28 | i27);
                int i30 = i29 % 128;
                b = i30;
                if (i29 % 2 != 0) {
                    genericDeclaration = Character.class;
                    int i31 = 86 / 0;
                } else {
                    genericDeclaration = Character.class;
                }
                int i32 = i30 + 121;
                a = i32 % 128;
                int i33 = i32 % 2;
            } else if (cls == Boolean.TYPE) {
                int i34 = b;
                int i35 = i34 & 13;
                int i36 = i35 + ((i34 ^ 13) | i35);
                a = i36 % 128;
                if (i36 % 2 == 0) {
                    throw null;
                }
                cls = (Class<T>) Boolean.class;
            } else if (cls == Short.TYPE) {
                int i37 = a;
                int i38 = (-2) - (((i37 & 14) + (i37 | 14)) ^ (-1));
                b = i38 % 128;
                int i39 = i38 % 2;
                genericDeclaration = Short.class;
                int i40 = (i37 & 95) + (i37 | 95);
                b = i40 % 128;
                if (i40 % 2 != 0) {
                    int i41 = 4 % 5;
                }
            } else if (cls == Void.TYPE) {
                int i42 = a;
                int i43 = ((i42 | 77) << 1) - (i42 ^ 77);
                int i44 = i43 % 128;
                b = i44;
                int i45 = i43 % 2;
                genericDeclaration = Void.class;
                int i46 = i44 | 11;
                int i47 = ((i46 << 1) - (~(-((~(i44 & 11)) & i46)))) - 1;
                a = i47 % 128;
                int i48 = i47 % 2;
            }
            T tCast = cls.cast(objG);
            int i49 = b + 77;
            a = i49 % 128;
            int i50 = i49 % 2;
            return tCast;
        }
        int i51 = a;
        int i52 = (i51 & 30) + (i51 | 30);
        int i53 = (i52 ^ (-1)) + (i52 << 1);
        b = i53 % 128;
        int i54 = i53 % 2;
        genericDeclaration = Integer.class;
        int i55 = i51 + 71;
        b = i55 % 128;
        int i56 = i55 % 2;
        cls = (Class<T>) genericDeclaration;
        T tCast2 = cls.cast(objG);
        int i410 = b + 77;
        a = i410 % 128;
        int i57 = i410 % 2;
        return tCast2;
    }

    public final String k(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = ((i2 ^ 27) | i3) << 1;
        int i5 = -((i2 | 27) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter = new StringWriter();
            int i8 = a;
            int i9 = (-2) - (((i8 ^ 48) + ((i8 & 48) << 1)) ^ (-1));
            b = i9 % 128;
            try {
                if (i9 % 2 != 0) {
                    e(obj, cls, i(stringWriter));
                    stringWriter.toString();
                    throw null;
                }
                e(obj, cls, i(stringWriter));
                String string = stringWriter.toString();
                int i10 = b;
                int i11 = ((i10 | 62) << 1) - (i10 ^ 62);
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                return string;
            } catch (IOException e) {
                throw new X(e);
            }
        }
        Y y = Y.c;
        StringWriter stringWriter2 = new StringWriter();
        int i14 = a;
        int i15 = (i14 & (-104)) | ((~i14) & 103);
        int i16 = -(-((i14 & 103) << 1));
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        try {
            if (i17 % 2 != 0) {
                l(y, i(stringWriter2));
                int i18 = 7 / 0;
            } else {
                l(y, i(stringWriter2));
            }
            int i19 = a;
            int i20 = (((i19 & (-108)) | ((~i19) & 107)) - (~(-(-((i19 & 107) << 1))))) - 1;
            b = i20 % 128;
            if (i20 % 2 == 0) {
                return stringWriter2.toString();
            }
            int i21 = 97 / 0;
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new X(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    public final <T> o000O000<T> j(E e, TypeToken<T> typeToken) {
        int i;
        E next;
        ad adVarB;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 63;
        int i8 = ((i6 ^ 63) | i7) << 1;
        int i9 = -((i6 | 63) & (~i7));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 75 / 0;
            if (!this.j.contains(e)) {
                int i12 = a;
                int i13 = (i12 & (-40)) | ((~i12) & 39);
                int i14 = (i12 & 39) << 1;
                i = ((i13 | i14) << 1) - (i14 ^ i13);
                b = i % 128;
                if (i % 2 != 0) {
                    e = this.h;
                    int i15 = 44 / 0;
                } else {
                    e = this.h;
                }
            }
        } else if (!this.j.contains(e)) {
            int i16 = a;
            int i17 = (i16 & (-40)) | ((~i16) & 39);
            int i18 = (i16 & 39) << 1;
            i = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i % 128;
            if (i % 2 != 0) {
                e = this.h;
                int i19 = 44 / 0;
            } else {
                e = this.h;
            }
        }
        Iterator<E> it = this.j.iterator();
        int i20 = b;
        int i21 = (((i20 | 70) << 1) - (i20 ^ 70)) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
        boolean z = false;
        while (!(!it.hasNext())) {
            int i23 = b;
            int i24 = ((i23 & (-80)) | ((~i23) & 79)) + ((i23 & 79) << 1);
            a = i24 % 128;
            Object obj = null;
            if (i24 % 2 == 0) {
                next = it.next();
                int i25 = 50 / 0;
                if (z) {
                    adVarB = next.b(this, typeToken);
                    if (adVarB != null) {
                        int i26 = b;
                        int i27 = ((i26 & 21) - (~(-(-(i26 | 21))))) - 1;
                        a = i27 % 128;
                        int i28 = i27 % 2;
                        int i29 = i26 & 43;
                        int i30 = (i26 | 43) & (~i29);
                        int i31 = i29 << 1;
                        i2 = (i30 & i31) + (i30 | i31);
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            return adVarB;
                        }
                        throw null;
                    }
                } else {
                    i3 = a;
                    int i32 = ((i3 | 102) << 1) - (i3 ^ 102);
                    i4 = (i32 ^ (-1)) + (i32 << 1);
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (next == e) {
                        int i33 = i3 & 117;
                        int i34 = -(-((i3 ^ 117) | i33));
                        int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        z = true;
                    }
                }
            } else {
                next = it.next();
                if (z) {
                    adVarB = next.b(this, typeToken);
                    if (adVarB != null) {
                        int i210 = b;
                        int i211 = ((i210 & 21) - (~(-(-(i210 | 21))))) - 1;
                        a = i211 % 128;
                        int i212 = i211 % 2;
                        int i213 = i210 & 43;
                        int i37 = (i210 | 43) & (~i213);
                        int i38 = i213 << 1;
                        i2 = (i37 & i38) + (i37 | i38);
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            return adVarB;
                        }
                        throw null;
                    }
                } else {
                    i3 = a;
                    int i39 = ((i3 | 102) << 1) - (i3 ^ 102);
                    i4 = (i39 ^ (-1)) + (i39 << 1);
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (next == e) {
                        int i310 = i3 & 117;
                        int i311 = -(-((i3 ^ 117) | i310));
                        int i312 = ((i310 | i311) << 1) - (i310 ^ i311);
                        b = i312 % 128;
                        int i313 = i312 % 2;
                        z = true;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GSON cannot serialize ");
        sb.append(typeToken);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x013b A[PHI: r7
  0x013b: PHI (r7v19 java.lang.Class) = (r7v18 java.lang.Class), (r7v33 java.lang.Class) binds: [B:19:0x0139, B:16:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x014e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0163  */
    /* JADX WARN: Code duplicated, block: B:25:0x016a A[PHI: r7
  0x016a: PHI (r7v32 java.lang.Class) = (r7v18 java.lang.Class), (r7v33 java.lang.Class) binds: [B:19:0x0139, B:16:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    public C(l lVar, L l, Map<Type, o00000O0<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ab abVar, String str, int i, int i2, List<E> list, List<E> list2, List<E> list3) {
        o000O000<Number> a2;
        o000O000<Number> r;
        Class cls;
        int i3;
        C0146v c0146v;
        this.e = new ThreadLocal<>();
        this.f = new ConcurrentHashMap();
        this.i = map;
        r rVar = new r(map);
        this.g = rVar;
        this.k = z;
        this.l = z3;
        this.d = z4;
        this.m = z5;
        this.n = z6;
        this.f73o = list;
        this.p = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(J.F);
        arrayList.add(z.c);
        arrayList.add(lVar);
        arrayList.addAll(list3);
        arrayList.add(J.s);
        arrayList.add(J.j);
        arrayList.add(J.g);
        arrayList.add(J.i);
        arrayList.add(J.h);
        if (abVar == ab.c) {
            a2 = J.m;
            int i4 = b;
            int i5 = ((i4 & 102) + (i4 | 102)) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } else {
            a2 = new A();
            int i7 = b;
            int i8 = ((((i7 ^ 109) | (i7 & 109)) << 1) - (~(-(((~i7) & 109) | (i7 & (-110)))))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        }
        M m = new M(Long.TYPE, Long.class, a2);
        int i11 = a;
        int i12 = i11 & 111;
        int i13 = i12 + ((i11 ^ 111) | i12);
        b = i13 % 128;
        int i14 = i13 % 2;
        arrayList.add(m);
        Class cls2 = Double.TYPE;
        int i15 = a;
        int i16 = (-2) - ((i15 + 68) ^ (-1));
        b = i16 % 128;
        int i17 = i16 % 2;
        if (z7) {
            int i18 = ((i15 | 40) << 1) - (i15 ^ 40);
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            r = J.p;
            int i21 = b;
            int i22 = i21 & 119;
            int i23 = (i22 - (~(-(-((i21 ^ 119) | i22))))) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
            int i25 = 2 % 2;
        } else {
            r = new R(this);
            int i26 = a;
            int i27 = i26 & 79;
            int i28 = (i26 | 79) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = 2 % 2;
        }
        M m2 = new M(cls2, Double.class, r);
        int i33 = a;
        int i34 = ((i33 & 62) + (i33 | 62)) - 1;
        b = i34 % 128;
        if (i34 % 2 != 0) {
            arrayList.add(m2);
            cls = Float.TYPE;
            int i35 = 87 / 0;
            if (z7) {
                int i36 = a;
                int i37 = i36 & 29;
                i3 = (i37 - (~(-(-((i36 ^ 29) | i37))))) - 1;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    o000O000<Number> o000o000 = J.n;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                c0146v = J.n;
                int i38 = a;
                int i39 = i38 & 29;
                int i40 = (i38 ^ 29) | i39;
                int i41 = (i39 & i40) + (i40 | i39);
                b = i41 % 128;
                int i42 = i41 % 2;
                int i43 = 2 % 2;
            } else {
                c0146v = new C0146v(this);
                int i44 = a + 39;
                b = i44 % 128;
                int i45 = i44 % 2;
                int i46 = 2 % 2;
            }
        } else {
            arrayList.add(m2);
            cls = Float.TYPE;
            if (!(!z7)) {
                int i310 = a;
                int i311 = i310 & 29;
                i3 = (i311 - (~(-(-((i310 ^ 29) | i311))))) - 1;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    o000O000<Number> o000o001 = J.n;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                c0146v = J.n;
                int i312 = a;
                int i313 = i312 & 29;
                int i47 = (i312 ^ 29) | i313;
                int i48 = (i313 & i47) + (i47 | i313);
                b = i48 % 128;
                int i49 = i48 % 2;
                int i410 = 2 % 2;
            } else {
                c0146v = new C0146v(this);
                int i411 = a + 39;
                b = i411 % 128;
                int i412 = i411 % 2;
                int i413 = 2 % 2;
            }
        }
        arrayList.add(new M(cls, Float.class, c0146v));
        arrayList.add(J.f76o);
        arrayList.add(J.k);
        arrayList.add(J.c);
        arrayList.add(new x(AtomicLong.class, new U(new am(a2))));
        arrayList.add(new x(AtomicLongArray.class, new U(new V(a2))));
        arrayList.add(J.l);
        arrayList.add(J.q);
        arrayList.add(J.u);
        arrayList.add(J.x);
        arrayList.add(new x(BigDecimal.class, J.r));
        arrayList.add(new x(BigInteger.class, J.t));
        arrayList.add(J.w);
        arrayList.add(J.y);
        arrayList.add(J.v);
        int i50 = a;
        int i51 = i50 & 33;
        int i52 = (i50 ^ 33) | i51;
        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
        b = i53 % 128;
        int i54 = i53 % 2;
        arrayList.add(J.B);
        arrayList.add(J.E);
        arrayList.add(J.z);
        arrayList.add(J.e);
        arrayList.add(h.c);
        arrayList.add(J.C);
        arrayList.add(ivas.gov.bisp.enumeration.p050bw.l.c);
        arrayList.add(u.c);
        arrayList.add(J.A);
        arrayList.add(C0226j.c);
        arrayList.add(J.d);
        arrayList.add(new c(rVar));
        arrayList.add(new C0228p(rVar, z2));
        ivas.gov.bisp.enumeration.p050bw.r rVar2 = new ivas.gov.bisp.enumeration.p050bw.r(rVar);
        this.h = rVar2;
        arrayList.add(rVar2);
        arrayList.add(J.G);
        arrayList.add(new t(rVar, l, lVar, rVar2));
        this.j = Collections.unmodifiableList(arrayList);
        int i55 = b;
        int i56 = (-2) - (((i55 & 110) + (i55 | 110)) ^ (-1));
        a = i56 % 128;
        int i57 = i56 % 2;
    }

    public final ivas.gov.bisp.enumeration.p032be.c i(Writer writer) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (this.l) {
            int i6 = i4 & 69;
            int i7 = (((i4 | 69) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            writer.write(")]}'\n");
            int i9 = b;
            int i10 = i9 & 45;
            int i11 = -(-((i9 ^ 45) | i10));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        ivas.gov.bisp.enumeration.p032be.c cVar = new ivas.gov.bisp.enumeration.p032be.c(writer);
        if (this.m) {
            int i14 = b;
            int i15 = ((i14 | 91) << 1) - (i14 ^ 91);
            a = i15 % 128;
            int i16 = i15 % 2;
            cVar.j = "  ";
            cVar.i = ": ";
            int i17 = b;
            int i18 = i17 & 9;
            int i19 = i18 + ((i17 ^ 9) | i18);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        cVar.m = this.k;
        int i21 = b;
        int i22 = i21 & 105;
        int i23 = ((i21 ^ 105) | i22) << 1;
        int i24 = -((i21 | 105) & (~i22));
        int i25 = (i23 & i24) + (i24 | i23);
        a = i25 % 128;
        int i26 = i25 % 2;
        return cVar;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        boolean z = this.k;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (i3 - (~((i2 ^ 51) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        sb.append(z);
        sb.append(",factories:");
        int i6 = b + 57;
        a = i6 % 128;
        int i7 = i6 % 2;
        sb.append(this.j);
        int i8 = b;
        int i9 = (((i8 | 63) << 1) - (~(-(i8 ^ 63)))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        sb.append(",instanceCreators:");
        sb.append(this.g);
        int i11 = a;
        int i12 = i11 & 97;
        int i13 = i12 + ((i11 ^ 97) | i12);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            sb.append("}");
            sb.toString();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sb.append("}");
        String string = sb.toString();
        int i14 = b;
        int i15 = i14 & 57;
        int i16 = (i14 | 57) & (~i15);
        int i17 = i15 << 1;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        a = i18 % 128;
        int i19 = i18 % 2;
        return string;
    }

    public final void e(Object obj, Type type, ivas.gov.bisp.enumeration.p032be.c cVar) {
        int i = 2 % 2;
        ad adVarH = h(new TypeToken(type));
        int i2 = b;
        int i3 = ((i2 & (-66)) | ((~i2) & 65)) + ((i2 & 65) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = cVar.k;
        cVar.k = true;
        boolean z2 = cVar.l;
        int i5 = a + 125;
        b = i5 % 128;
        int i6 = i5 % 2;
        cVar.l = this.d;
        boolean z3 = cVar.m;
        int i7 = a;
        int i8 = i7 & 95;
        int i9 = (i7 ^ 95) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                cVar.m = this.k;
                try {
                    int i11 = 89 / 0;
                } catch (IOException e) {
                    throw new X(e);
                } catch (AssertionError e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("AssertionError (GSON 2.8.6): ");
                    sb.append(e2.getMessage());
                    AssertionError assertionError = new AssertionError(sb.toString());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } else {
                cVar.m = this.k;
            }
            int i12 = b;
            int i13 = i12 & 91;
            int i14 = ((i12 ^ 91) | i13) << 1;
            int i15 = -((i12 | 91) & (~i13));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            a = i16 % 128;
            if (i16 % 2 == 0) {
                adVarH.d(cVar, obj);
                cVar.k = z;
                cVar.l = z2;
                int i17 = 84 / 0;
            } else {
                adVarH.d(cVar, obj);
                cVar.k = z;
                cVar.l = z2;
            }
            int i18 = a + 25;
            b = i18 % 128;
            if (i18 % 2 == 0) {
                cVar.m = z3;
            } else {
                cVar.m = z3;
                throw null;
            }
        } catch (Throwable th) {
            cVar.k = z;
            cVar.l = z2;
            cVar.m = z3;
            int i19 = b;
            int i20 = ((i19 | 121) << 1) - (i19 ^ 121);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                throw th;
            }
            throw null;
        }
    }

    public final <T> o000O000<T> h(TypeToken<T> typeToken) {
        boolean z;
        Map<TypeToken<?>, o000O000<?>> map;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f.get(typeToken);
            throw null;
        }
        ad adVar = this.f.get(typeToken);
        if (adVar != null) {
            int i4 = b;
            int i5 = ((i4 ^ 18) + ((i4 & 18) << 1)) - 1;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return adVar;
        }
        Map<TypeToken<?>, o000000O.OooO00o<?>> map2 = this.e.get();
        int i7 = (-2) - ((a + 58) ^ (-1));
        b = i7 % 128;
        int i8 = i7 % 2;
        if (map2 == null) {
            map2 = new HashMap<>();
            this.e.set(map2);
            int i9 = b;
            int i10 = (i9 & (-32)) | ((~i9) & 31);
            int i11 = -(-((i9 & 31) << 1));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = (i9 & 33) + (i9 | 33);
            a = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        bnV bnv = map2.get(typeToken);
        if (bnv != null) {
            int i16 = b + 109;
            int i17 = i16 % 128;
            a = i17;
            if (i16 % 2 == 0) {
                throw null;
            }
            int i18 = i17 & 103;
            int i19 = i18 + ((i17 ^ 103) | i18);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return bnv;
            }
            obj.hashCode();
            throw null;
        }
        try {
            bnV bnv2 = new bnV();
            map2.put(typeToken, bnv2);
            int i20 = b;
            int i21 = i20 ^ 5;
            int i22 = (((i20 & 5) | i21) << 1) - i21;
            a = i22 % 128;
            int i23 = i22 % 2;
            Iterator<E> it = this.j.iterator();
            int i24 = a;
            int i25 = i24 & 25;
            int i26 = (i25 - (~(-(-((i24 ^ 25) | i25))))) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
            while (it.hasNext()) {
                int i28 = b;
                int i29 = i28 & 13;
                int i30 = ((((i28 ^ 13) | i29) << 1) - (~(-((i28 | 13) & (~i29))))) - 1;
                a = i30 % 128;
                if (i30 % 2 == 0) {
                    it.next();
                    obj.hashCode();
                    throw null;
                }
                E next = it.next();
                int i31 = a;
                int i32 = (i31 ^ 85) + ((i31 & 85) << 1);
                b = i32 % 128;
                if (i32 % 2 != 0) {
                    next.b(this, typeToken);
                    obj.hashCode();
                    throw null;
                }
                ad adVarB = next.b(this, typeToken);
                if (adVarB != null) {
                    int i33 = b;
                    int i34 = (i33 & 37) + (i33 | 37);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    if (bnv2.c != null) {
                        throw new AssertionError();
                    }
                    int i36 = a;
                    int i37 = ((i36 ^ 50) + ((i36 & 50) << 1)) - 1;
                    b = i37 % 128;
                    if (i37 % 2 != 0) {
                        bnv2.c = adVarB;
                        map = this.f;
                        int i38 = 43 / 0;
                    } else {
                        bnv2.c = adVarB;
                        map = this.f;
                    }
                    map.put(typeToken, adVarB);
                    map2.remove(typeToken);
                    int i39 = a;
                    int i40 = i39 & 13;
                    int i41 = -(-((i39 ^ 13) | i40));
                    int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                    int i43 = i42 % 128;
                    b = i43;
                    int i44 = i42 % 2;
                    if (!(!z)) {
                        int i45 = i43 + 11;
                        a = i45 % 128;
                        int i46 = i45 % 2;
                        this.e.remove();
                        int i47 = a;
                        int i48 = (i47 & 89) + (i47 | 89);
                        b = i48 % 128;
                        int i49 = i48 % 2;
                    }
                    int i50 = a;
                    int i51 = ((i50 ^ 23) - (~(-(-((i50 & 23) << 1))))) - 1;
                    b = i51 % 128;
                    int i52 = i51 % 2;
                    return adVarB;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("GSON (2.8.6) cannot handle ");
            sb.append(typeToken);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
            int i53 = b;
            int i54 = i53 ^ 45;
            int i55 = -(-((i53 & 45) << 1));
            int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
            a = i56 % 128;
            int i57 = i56 % 2;
            throw illegalArgumentException;
        } catch (Throwable th) {
            map2.remove(typeToken);
            if (z) {
                this.e.remove();
                int i58 = b;
                int i59 = i58 ^ 57;
                int i60 = (i58 & 57) << 1;
                int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                a = i61 % 128;
                int i62 = i61 % 2;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010d, code lost:
    
        if (r9.y() == 10) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T g(java.lang.String r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p035bh.C.g(java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    public final void l(n nVar, ivas.gov.bisp.enumeration.p032be.c cVar) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 75;
        int i4 = (((i2 | 75) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        boolean z3 = cVar.k;
        cVar.k = true;
        int i6 = a;
        int i7 = ((i6 | 97) << 1) - (i6 ^ 97);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            z = cVar.l;
            z2 = this.d;
            int i8 = 0 / 0;
        } else {
            z = cVar.l;
            z2 = this.d;
        }
        int i9 = b + 21;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            cVar.l = z2;
            boolean z4 = cVar.m;
            throw null;
        }
        cVar.l = z2;
        boolean z5 = cVar.m;
        cVar.m = this.k;
        int i10 = a;
        int i11 = i10 & 55;
        int i12 = i11 + ((i10 ^ 55) | i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        try {
            try {
                J.bsQ bsq = J.D;
                int i14 = a;
                int i15 = i14 & 59;
                int i16 = ((i14 ^ 59) | i15) << 1;
                int i17 = -((i14 | 59) & (~i15));
                int i18 = (i16 & i17) + (i17 | i16);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    bsq.f(cVar, nVar);
                    cVar.k = z3;
                    int i19 = 92 / 0;
                } else {
                    bsq.f(cVar, nVar);
                    cVar.k = z3;
                }
                int i20 = b;
                int i21 = i20 & 45;
                int i22 = ((i20 ^ 45) | i21) << 1;
                int i23 = -((i20 | 45) & (~i21));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                cVar.l = z;
                cVar.m = z5;
                int i26 = b;
                int i27 = i26 & 123;
                int i28 = (((i26 ^ 123) | i27) << 1) - ((i26 | 123) & (~i27));
                a = i28 % 128;
                int i29 = i28 % 2;
            } catch (IOException e) {
                throw new X(e);
            } catch (AssertionError e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("AssertionError (GSON 2.8.6): ");
                sb.append(e2.getMessage());
                AssertionError assertionError = new AssertionError(sb.toString());
                int i30 = b;
                int i31 = i30 & 1;
                int i32 = ((i30 ^ 1) | i31) << 1;
                int i33 = -((i30 | 1) & (~i31));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                a = i34 % 128;
                int i35 = i34 % 2;
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            cVar.k = z3;
            cVar.l = z;
            int i36 = b;
            int i37 = ((i36 & (-86)) | ((~i36) & 85)) + ((i36 & 85) << 1);
            a = i37 % 128;
            if (i37 % 2 != 0) {
                cVar.m = z5;
                throw th;
            }
            cVar.m = z5;
            int i38 = 3 / 0;
            throw th;
        }
    }
}
