package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aS.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080o<KeyProtoT extends aa> {
    private static int a = 1;
    private static int b;
    public final Class<KeyProtoT> c;
    public final Map<Class<?>, Oooo0.OooO0O0<?, KeyProtoT>> d;
    public final Class<?> e;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aS.o$bfY */
    public static abstract class bfY<PrimitiveT, KeyT> {
        public final Class<PrimitiveT> a;

        public bfY(Class<PrimitiveT> cls) {
            this.a = cls;
        }

        public abstract PrimitiveT c(KeyT keyt);
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aS.o$bgb */
    public static abstract class bgb<KeyFormatProtoT extends aa, KeyT> {
        public final Class<KeyFormatProtoT> a;

        public bgb(Class<KeyFormatProtoT> cls) {
            this.a = cls;
        }

        public abstract KeyT c(KeyFormatProtoT keyformatprotot);

        public abstract KeyFormatProtoT d(AbstractC0069z abstractC0069z);

        public abstract void e(KeyFormatProtoT keyformatprotot);
    }

    @SafeVarargs
    public AbstractC0080o(Class<KeyProtoT> cls, Oooo0.OooO0O0<?, KeyProtoT>... oooO0O0Arr) {
        this.c = cls;
        HashMap map = new HashMap();
        int length = oooO0O0Arr.length;
        int i = 2 % 2;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= length) {
                if (oooO0O0Arr.length > 0) {
                    int i3 = a + 115;
                    b = i3 % 128;
                    int i4 = i3 % 2;
                    this.e = oooO0O0Arr[0].a;
                    int i5 = a;
                    int i6 = ((((i5 ^ 49) | (i5 & 49)) << 1) - (~(-(((~i5) & 49) | (i5 & (-50)))))) - 1;
                    b = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 2 / 4;
                    }
                } else {
                    this.e = Void.class;
                    int i8 = a;
                    int i9 = i8 & 81;
                    int i10 = (i9 - (~((i8 ^ 81) | i9))) - 1;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                }
                this.d = Collections.unmodifiableMap(map);
                int i12 = b + 69;
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i13 = a;
            int i14 = ((i13 | 91) << 1) - (i13 ^ 91);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                map.containsKey(oooO0O0Arr[i2].a);
                obj.hashCode();
                throw null;
            }
            Oooo0.OooO0O0<?, KeyProtoT> oooO0O0 = oooO0O0Arr[i2];
            if (map.containsKey(oooO0O0.a)) {
                StringBuilder sbW = j.w("KeyTypeManager constructed with duplicate factories for primitive ");
                sbW.append(oooO0O0.a.getCanonicalName());
                throw new IllegalArgumentException(sbW.toString());
            }
            int i15 = b;
            int i16 = i15 & 41;
            int i17 = (i15 ^ 41) | i16;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            map.put(oooO0O0.a, oooO0O0);
            int i20 = a;
            int i21 = ((i20 ^ 75) - (~((i20 & 75) << 1))) - 1;
            int i22 = i21 % 128;
            b = i22;
            int i23 = i21 % 2;
            int i24 = i2 ^ 1;
            int i25 = -(-((i2 & 1) << 1));
            i2 = ((i24 | i25) << 1) - (i25 ^ i24);
            int i26 = (-2) - ((((i22 | 116) << 1) - (i22 ^ 116)) ^ (-1));
            a = i26 % 128;
            int i27 = i26 % 2;
        }
    }

    public abstract String c();

    public abstract Oooo0.OooO00o<?, KeyProtoT> e();

    public abstract ivas.gov.bisp.enumeration.aC.R.bdl f();

    public abstract void g(KeyProtoT keyprotot);

    public abstract KeyProtoT h(AbstractC0069z abstractC0069z);

    public final <P> P d(KeyProtoT keyprotot, Class<P> cls) {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 22) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
        bfY bfy = this.d.get(cls);
        if (bfy == null) {
            StringBuilder sbW = j.w("Requested primitive class ");
            sbW.append(cls.getCanonicalName());
            sbW.append(" not supported.");
            throw new IllegalArgumentException(sbW.toString());
        }
        int i4 = a + 61;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            bfy.c(keyprotot);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        P p = (P) bfy.c(keyprotot);
        int i5 = a;
        int i6 = i5 & 77;
        int i7 = (i6 - (~(-(-((i5 ^ 77) | i6))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        return p;
    }
}
