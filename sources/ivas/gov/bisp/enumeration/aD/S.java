package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooO0O0;
import ivas.gov.bisp.enumeration.o000O000.o00Ooo;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o.OooO00o;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class S<MessageType extends o0OOO0o<MessageType, BuilderType>, BuilderType extends o0OOO0o.OooO00o<MessageType, BuilderType>> extends ivas.gov.bisp.enumeration.o000O000.OooO00o<MessageType, BuilderType> {
    private static int a = 0;
    private static int b = 1;
    private static Map<Object, o0OOO0o<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public an unknownFields = an.c;
    public int memoizedSerializedSize = -1;

    public static abstract class bbs<MessageType extends o0OOO0o<MessageType, BuilderType>, BuilderType extends o0OOO0o.OooO00o<MessageType, BuilderType>> extends ivas.gov.bisp.enumeration.o000O000.OooO00o.OooO00o<MessageType, BuilderType> {
        private static int a = 0;
        private static int b = 1;
        public final MessageType c;
        public MessageType d;
        public boolean e = false;

        public bbs(MessageType messagetype) {
            this.c = messagetype;
            this.d = (S) messagetype.C(bkM.h, null, null);
        }

        public aa a() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 85) << 1;
            int i4 = -((i2 & (-86)) | ((~i2) & 85));
            int i5 = (i3 & i4) + (i3 | i4);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            MessageType messagetype = this.c;
            int i6 = i2 ^ 63;
            int i7 = ((((i2 & 63) | i6) << 1) - (~(-i6))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return messagetype;
        }

        public BuilderType g(MessageType messagetype) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 19) - (~(i2 | 19))) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                f();
                h(this.d, messagetype);
                int i4 = 7 / 0;
            } else {
                f();
                h(this.d, messagetype);
            }
            int i5 = b;
            int i6 = i5 & 55;
            int i7 = -(-((i5 ^ 55) | i6));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = (((i9 & (-118)) | ((~i9) & 117)) - (~((i9 & 117) << 1))) - 1;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final MessageType c() {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 6) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            S sE = e();
            if (!sE.n()) {
                throw new H();
            }
            int i4 = a;
            int i5 = i4 & 57;
            int i6 = -(-((i4 ^ 57) | i5));
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 & 29;
            int i11 = (i8 | 29) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = (i11 & i12) + (i11 | i12);
            a = i13 % 128;
            int i14 = i13 % 2;
            return sE;
        }

        public MessageType e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 15;
            int i4 = ((i2 | 15) & (~i3)) + (i3 << 1);
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            if (!(!this.e)) {
                int i7 = i5 + 113;
                int i8 = i7 % 128;
                b = i8;
                int i9 = i7 % 2;
                MessageType messagetype = this.d;
                int i10 = i8 + 13;
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 80 / 0;
                }
                return messagetype;
            }
            MessageType messagetype2 = this.d;
            Objects.requireNonNull(messagetype2);
            C0046b c0046b = C0046b.c;
            int i12 = a;
            int i13 = (i12 ^ 63) + ((i12 & 63) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            c0046b.d(messagetype2).h(messagetype2);
            int i15 = b;
            int i16 = (i15 & 19) + (i15 | 19);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                this.e = false;
            } else {
                this.e = true;
            }
            MessageType messagetype3 = this.d;
            int i17 = (i15 ^ 99) + ((i15 & 99) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            return messagetype3;
        }

        public final void h(MessageType messagetype, MessageType messagetype2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - (((i2 ^ 42) + ((i2 & 42) << 1)) ^ (-1));
            b = i3 % 128;
            if (i3 % 2 != 0) {
                C0046b.c.d(messagetype).b(messagetype, messagetype2);
                return;
            }
            C0046b.c.d(messagetype).b(messagetype, messagetype2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void f() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 45;
            int i4 = i3 + ((i2 ^ 45) | i3);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (this.e) {
                int i5 = i2 + 125;
                b = i5 % 128;
                int i6 = i5 % 2;
                MessageType messagetype = this.d;
                bkM bkm = bkM.h;
                int i7 = b;
                int i8 = ((i7 ^ 113) | (i7 & 113)) << 1;
                int i9 = -(((~i7) & 113) | (i7 & (-114)));
                int i10 = (i8 & i9) + (i9 | i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                S s = (S) messagetype.C(bkm, null, null);
                MessageType messagetype2 = this.d;
                int i12 = b;
                int i13 = (i12 ^ 3) + ((i12 & 3) << 1);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    C0046b.c.d(s).b(s, messagetype2);
                    int i14 = 71 / 0;
                } else {
                    C0046b.c.d(s).b(s, messagetype2);
                }
                int i15 = b;
                int i16 = (i15 & (-82)) | ((~i15) & 81);
                int i17 = (i15 & 81) << 1;
                int i18 = (i16 & i17) + (i17 | i16);
                int i19 = i18 % 128;
                a = i19;
                int i20 = i18 % 2;
                this.d = s;
                this.e = false;
                int i21 = (((i19 & (-86)) | ((~i19) & 85)) - (~(-(-((i19 & 85) << 1))))) - 1;
                b = i21 % 128;
                int i22 = i21 % 2;
            }
            int i23 = b;
            int i24 = (i23 & (-38)) | ((~i23) & 37);
            int i25 = -(-((i23 & 37) << 1));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            a = i26 % 128;
            int i27 = i26 % 2;
        }

        public Object clone() {
            MessageType messagetype;
            bkM bkm;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 37;
            int i4 = ((i2 | 37) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                messagetype = this.c;
                bkm = bkM.g;
                int i5 = 99 / 0;
            } else {
                messagetype = this.c;
                bkm = bkM.g;
            }
            int i6 = a + 109;
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            bbs bbsVar = (bbs) messagetype.C(bkm, null, null);
            bbsVar.g(e());
            int i7 = b + 15;
            a = i7 % 128;
            int i8 = i7 % 2;
            return bbsVar;
        }
    }

    public static class bkI<T extends o0OOO0o<T, ?>> extends OooO0O0<T> {
        public final T a;

        public bkI(T t) {
            this.a = t;
        }
    }

    public static final class bkK implements o00Ooo.OooO00o<bkK> {
        private static int a = 0;
        private static int b = 1;

        public final int c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 35;
            int i4 = -(-((i2 ^ 35) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public final aa.bbq g(aa.bbq bbqVar, aa aaVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 2) + (i2 | 2)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            bbs bbsVar = (bbs) bbqVar;
            bbsVar.g((S) aaVar);
            int i5 = a;
            int i6 = i5 & 27;
            int i7 = ((i5 ^ 27) | i6) << 1;
            int i8 = -((~i6) & (i5 | 27));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i10 = i5 & 19;
            int i11 = -(-((i5 ^ 19) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            return bbsVar;
        }

        public final boolean o() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 83;
            int i4 = (((~i3) & (i2 | 83)) - (~(i3 << 1))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = ((i2 ^ 68) + ((i2 & 68) << 1)) - 1;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 81 / 0;
            }
            return false;
        }

        public final aq r() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 59;
            int i4 = i3 + ((i2 ^ 59) | i3);
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        public final boolean t() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-26)) | ((~i2) & 25);
            int i4 = (i2 & 25) << 1;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            boolean z = i5 % 2 == 0;
            int i6 = i2 & 71;
            int i7 = ((i2 ^ 71) | i6) << 1;
            int i8 = -((i2 | 71) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public final au u() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 3;
            int i4 = (((i2 | 3) & (~i3)) - (~(i3 << 1))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            throw null;
        }

        public final int compareTo(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 1;
            int i4 = ((i2 & 1) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                Objects.requireNonNull((bkK) obj);
                return 1;
            }
            Objects.requireNonNull((bkK) obj);
            return 0;
        }
    }

    public static class bkL<ContainingType extends aa, Type> extends ivas.gov.bisp.enumeration.p096p.h {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class bkM {
        private static int a = 1;
        private static int b;
        public static final /* synthetic */ bkM[] c;
        public static final bkM d;
        public static final bkM e;
        public static final bkM f;
        public static final bkM g;
        public static final bkM h;
        public static final bkM i;
        public static final bkM j;

        static {
            bkM bkm = new bkM("GET_MEMOIZED_IS_INITIALIZED", 0);
            d = bkm;
            bkM bkm2 = new bkM("SET_MEMOIZED_IS_INITIALIZED", 1);
            e = bkm2;
            bkM bkm3 = new bkM("BUILD_MESSAGE_INFO", 2);
            f = bkm3;
            bkM bkm4 = new bkM("NEW_MUTABLE_INSTANCE", 3);
            h = bkm4;
            bkM bkm5 = new bkM("NEW_BUILDER", 4);
            g = bkm5;
            bkM bkm6 = new bkM("GET_DEFAULT_INSTANCE", 5);
            i = bkm6;
            bkM bkm7 = new bkM("GET_PARSER", 6);
            j = bkm7;
            bkM[] bkmArr = new bkM[7];
            int i2 = a;
            int i3 = (i2 & 67) + (i2 | 67);
            b = i3 % 128;
            int i4 = i3 % 2;
            bkmArr[0] = bkm;
            bkmArr[1] = bkm2;
            bkmArr[2] = bkm3;
            int i5 = ((i2 & 76) + (i2 | 76)) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                bkmArr[3] = bkm4;
                bkmArr[3] = bkm5;
                bkmArr[3] = bkm6;
                bkmArr[11] = bkm7;
            } else {
                bkmArr[3] = bkm4;
                bkmArr[4] = bkm5;
                bkmArr[5] = bkm6;
                bkmArr[6] = bkm7;
            }
            c = bkmArr;
            int i6 = i2 & 13;
            int i7 = -(-((i2 ^ 13) | i6));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 78 / 0;
            }
        }

        public bkM(String str, int i2) {
            super(str, i2);
        }

        public static bkM valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((((i3 ^ 49) | (i3 & 49)) << 1) - (~(-(((~i3) & 49) | (i3 & (-50)))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            bkM bkm = (bkM) Enum.valueOf(bkM.class, str);
            if (i5 == 0) {
                throw null;
            }
            int i6 = b;
            int i7 = (((i6 | 52) << 1) - (i6 ^ 52)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return bkm;
        }

        public static bkM[] values() {
            bkM[] bkmArr;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 & (-96)) | ((~i3) & 95)) + ((i3 & 95) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            bkM[] bkmArr2 = c;
            if (i5 == 0) {
                bkmArr = (bkM[]) bkmArr2.clone();
                int i6 = 61 / 0;
            } else {
                bkmArr = (bkM[]) bkmArr2.clone();
            }
            int i7 = b;
            int i8 = (((i7 ^ 63) | (i7 & 63)) << 1) - (((~i7) & 63) | (i7 & (-64)));
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return bkmArr;
            }
            throw null;
        }
    }

    static {
        int i = b;
        int i2 = (i ^ 83) + ((i & 83) << 1);
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    public static <T extends o0OOO0o<?, ?>> void s(Class<T> cls, T t) {
        int i = 2 % 2;
        int i2 = a + 41;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            defaultInstanceMap.put(cls, t);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        defaultInstanceMap.put(cls, t);
        int i3 = b;
        int i4 = (i3 & (-110)) | ((~i3) & 109);
        int i5 = (i3 & 109) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 79 / 0;
        }
    }

    public abstract Object C(bkM bkm, Object obj, Object obj2);

    public /* synthetic */ aa a() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = (i3 - (~((i2 ^ 65) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        S sD = D();
        int i6 = a + 103;
        b = i6 % 128;
        int i7 = i6 % 2;
        return sD;
    }

    public int c() {
        int iG;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-18)) | ((~i2) & 17)) + ((i2 & 17) << 1);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.memoizedSerializedSize == -1) {
            int i5 = (i4 & (-24)) | ((~i4) & 23);
            int i6 = -(-((i4 & 23) << 1));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                iG = C0046b.c.d(this).g(this);
                int i8 = 36 / 0;
            } else {
                iG = C0046b.c.d(this).g(this);
            }
            this.memoizedSerializedSize = iG;
            int i9 = a;
            int i10 = i9 | 81;
            int i11 = (i10 << 1) - ((~(i9 & 81)) & i10);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = this.memoizedSerializedSize;
        int i14 = b;
        int i15 = i14 & 123;
        int i16 = i15 + ((i14 ^ 123) | i15);
        a = i16 % 128;
        int i17 = i16 % 2;
        return i13;
    }

    public int h() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 47;
        int i5 = i4 + ((i3 ^ 47) | i4);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 != 0) {
            i = this.memoizedSerializedSize;
            int i7 = 0 / 0;
        } else {
            i = this.memoizedSerializedSize;
        }
        int i8 = i6 + 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a + 23;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = this.memoizedHashCode;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.memoizedHashCode;
        if (i4 != 0) {
            int i5 = b;
            int i6 = (i5 ^ 103) + ((i5 & 103) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 6 / 0;
            }
            return i4;
        }
        int iO = C0046b.c.d(this).o(this);
        int i8 = b;
        int i9 = i8 & 5;
        int i10 = -(-((i8 ^ 5) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        this.memoizedHashCode = iO;
        int i13 = b;
        int i14 = ((i13 ^ 8) + ((i13 & 8) << 1)) - 1;
        a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 22 / 0;
        }
        return iO;
    }

    public void m(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 1) + (i3 | 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.memoizedSerializedSize = i;
        int i6 = i3 + 81;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072 A[PHI: r5
  0x0072: PHI (r5v14 ivas.gov.bisp.enumeration.aD.S$bkM) = (r5v6 ivas.gov.bisp.enumeration.aD.S$bkM), (r5v15 ivas.gov.bisp.enumeration.aD.S$bkM) binds: [B:21:0x0070, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[PHI: r5
  0x0089: PHI (r5v7 ivas.gov.bisp.enumeration.aD.S$bkM) = (r5v6 ivas.gov.bisp.enumeration.aD.S$bkM), (r5v15 ivas.gov.bisp.enumeration.aD.S$bkM) binds: [B:21:0x0070, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    public final boolean n() {
        Object objC;
        boolean zE;
        bkM bkm;
        S<MessageType, BuilderType> s;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 89;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            objC = C(bkM.d, null, null);
            int i4 = 66 / 0;
        } else {
            objC = C(bkM.d, null, null);
        }
        byte bByteValue = ((Byte) objC).byteValue();
        if (bByteValue != 1) {
            int i5 = b;
            int i6 = (-2) - ((((i5 | 8) << 1) - (i5 ^ 8)) ^ (-1));
            a = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (bByteValue == 0) {
                int i7 = i5 & 93;
                int i8 = ((~i7) & (i5 | 93)) + (i7 << 1);
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    zE = true;
                } else {
                    zE = false;
                }
            } else {
                zE = C0046b.c.d(this).e(this);
                int i9 = a + 23;
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    bkm = bkM.e;
                    int i10 = 92 / 0;
                    if (!zE) {
                        int i11 = b;
                        int i12 = ((i11 & 111) - (~(i11 | 111))) - 1;
                        a = i12 % 128;
                        int i13 = i12 % 2;
                        s = null;
                    } else {
                        int i14 = a;
                        i = (-2) - ((((i14 | 70) << 1) - (i14 ^ 70)) ^ (-1));
                        b = i % 128;
                        if (i % 2 == 0) {
                            int i15 = 4 % 3;
                        }
                        s = this;
                    }
                } else {
                    bkm = bkM.e;
                    if (zE) {
                        int i16 = a;
                        i = (-2) - ((((i16 | 70) << 1) - (i16 ^ 70)) ^ (-1));
                        b = i % 128;
                        if (i % 2 == 0) {
                            int i17 = 4 % 3;
                        }
                        s = this;
                    } else {
                        int i18 = b;
                        int i19 = ((i18 & 111) - (~(i18 | 111))) - 1;
                        a = i19 % 128;
                        int i110 = i19 % 2;
                        s = null;
                    }
                }
                C(bkm, s, null);
                int i20 = b;
                int i21 = ((i20 | 26) << 1) - (i20 ^ 26);
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 4 / 4;
                }
            }
        } else {
            zE = true;
        }
        int i24 = b;
        int i25 = (i24 & (-64)) | ((~i24) & 63);
        int i26 = (i24 & 63) << 1;
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        a = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 49 / 0;
        }
        return zE;
    }

    public static abstract class bkJ<MessageType extends o0OOO0o.OooO0OO<MessageType, BuilderType>, BuilderType> extends o0OOO0o<MessageType, BuilderType> implements ab {
        private static int a = 1;
        private static int b;
        public o00Ooo<bkK> extensions = C0056m.c;

        public o00Ooo<bkK> t() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 61;
            int i4 = -(-((i2 ^ 61) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                boolean z = this.extensions.e;
                obj.hashCode();
                throw null;
            }
            o00Ooo<bkK> o00ooo = this.extensions;
            if (o00ooo.e) {
                this.extensions = o00ooo.j();
                int i6 = b;
                int i7 = (i6 ^ 71) + ((i6 & 71) << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
            }
            o00Ooo<bkK> o00ooo2 = this.extensions;
            int i9 = a;
            int i10 = (i9 & 119) + (i9 | 119);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return o00ooo2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static <T extends o0OOO0o<T, ?>> T i(T t) throws C0065v {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = (((i2 | 77) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (!t.n()) {
            throw new C0065v(new H().getMessage());
        }
        int i6 = a;
        int i7 = (i6 ^ 41) + ((i6 & 41) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = (((i6 & (-96)) | ((~i6) & 95)) - (~((i6 & 95) << 1))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        return t;
    }

    public static <T extends o0OOO0o<?, ?>> T j(Class<T> cls) {
        String name;
        ClassLoader classLoader;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 120) + ((i2 & 120) << 1)) - 1;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            defaultInstanceMap.get(cls);
            throw null;
        }
        S sD = defaultInstanceMap.get(cls);
        if (sD == null) {
            int i4 = b;
            int i5 = i4 & 61;
            int i6 = ((i4 ^ 61) | i5) << 1;
            int i7 = -((i4 | 61) & (~i5));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    name = cls.getName();
                    classLoader = cls.getClassLoader();
                } else {
                    name = cls.getName();
                    classLoader = cls.getClassLoader();
                }
                Class.forName(name, true, classLoader);
                Map<Object, o0OOO0o<?, ?>> map = defaultInstanceMap;
                int i9 = b;
                int i10 = i9 & 125;
                int i11 = (i9 ^ 125) | i10;
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                sD = (S) map.get(cls);
                int i14 = b;
                int i15 = ((i14 | 67) << 1) - (((~i14) & 67) | (i14 & (-68)));
                a = i15 % 128;
                int i16 = i15 % 2;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (sD == null) {
            int i17 = a;
            int i18 = ((((i17 ^ 83) | (i17 & 83)) << 1) - (~(-(((~i17) & 83) | (i17 & (-84)))))) - 1;
            b = i18 % 128;
            int i19 = i18 % 2;
            sD = ((S) ar.d(cls)).D();
            int i20 = a + 91;
            int i21 = i20 % 128;
            b = i21;
            int i22 = i20 % 2;
            if (sD == null) {
                throw new IllegalStateException();
            }
            int i23 = (i21 | 27) << 1;
            int i24 = -(i21 ^ 27);
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            a = i25 % 128;
            if (i25 % 2 != 0) {
                defaultInstanceMap.put(cls, sD);
                obj.hashCode();
                throw null;
            }
            defaultInstanceMap.put(cls, sD);
        }
        int i26 = a;
        int i27 = ((((i26 ^ 35) | (i26 & 35)) << 1) - (~(-(((~i26) & 35) | (i26 & (-36)))))) - 1;
        b = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 17 / 0;
        }
        return sD;
    }

    public final <MessageType extends o0OOO0o<MessageType, BuilderType>, BuilderType extends o0OOO0o.OooO00o<MessageType, BuilderType>> BuilderType B() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 85) + (i2 | 85);
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        bbs bbsVar = (bbs) C(bkM.g, null, null);
        int i5 = a;
        int i6 = ((i5 | 49) << 1) - (i5 ^ 49);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return bbsVar;
        }
        obj.hashCode();
        throw null;
    }

    public final MessageType D() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = ((((i2 ^ 29) | i3) << 1) - (~(-((i2 | 29) & (~i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return (S) C(bkM.i, null, null);
        }
        int i5 = 95 / 0;
        return (S) C(bkM.i, null, null);
    }

    public aa.bbq d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = (i2 | 71) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        bbs bbsVar = (bbs) C(bkM.g, null, null);
        int i7 = b + 94;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 31 / 0;
        }
        return bbsVar;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 31) + (i2 | 31);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 ^ 93;
            int i6 = (((i2 & 93) | i5) << 1) - i5;
            a = i6 % 128;
            boolean z = i6 % 2 == 0;
            int i7 = (((i2 | 80) << 1) - (i2 ^ 80)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return z;
        }
        if (!D().getClass().isInstance(obj)) {
            int i9 = b;
            int i10 = (i9 & 119) + (i9 | 119);
            a = i10 % 128;
            return i10 % 2 != 0;
        }
        boolean zA = C0046b.c.d(this).a(this, (S) obj);
        int i11 = b + 45;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 15 / 0;
        }
        return zA;
    }

    public aa.bbq f() {
        int i = 2 % 2;
        int i2 = b + 99;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        bbs bbsVar = (bbs) C(bkM.g, null, null);
        bbsVar.f();
        bbsVar.h(bbsVar.d, this);
        int i3 = a + 29;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 43 / 0;
        }
        return bbsVar;
    }

    public static <T extends o0OOO0o<T, ?>> T p(T t, AbstractC0069z abstractC0069z, J j) throws C0065v {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 33) | (i2 & 33)) << 1) - (((~i2) & 33) | (i2 & (-34)));
        b = i3 % 128;
        int i4 = i3 % 2;
        P pK = abstractC0069z.k();
        S sQ = q(t, pK, j);
        pK.g(0);
        int i5 = b;
        int i6 = ((((i5 ^ 35) | (i5 & 35)) << 1) - (~(-(((~i5) & 35) | (i5 & (-36)))))) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            i(sQ);
            return sQ;
        }
        i(sQ);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void b(AbstractC0064u abstractC0064u) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 15) | (i2 & 15)) << 1) - (((~i2) & 15) | (i2 & (-16)));
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            C0046b.c.d(this);
            C0055l c0055l = abstractC0064u.f;
            throw null;
        }
        ah ahVarD = C0046b.c.d(this);
        C0055l c0055l2 = abstractC0064u.f;
        if (c0055l2 != null) {
            int i4 = b;
            int i5 = i4 & 21;
            int i6 = (((i4 ^ 21) | i5) << 1) - ((~i5) & (i4 | 21));
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 50 / 0;
            }
            int i8 = (-2) - ((i4 + 88) ^ (-1));
            a = i8 % 128;
            int i9 = i8 % 2;
        } else {
            c0055l2 = new C0055l(abstractC0064u);
            int i10 = b;
            int i11 = ((i10 | 5) << 1) - (i10 ^ 5);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 4 / 2;
            }
        }
        ahVarD.c(this, c0055l2);
        int i13 = a;
        int i14 = (((i13 | 2) << 1) - (i13 ^ 2)) - 1;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        String string;
        int i = 2 % 2;
        String string2 = super.toString();
        StringBuilder sb = new StringBuilder();
        int i2 = a;
        int i3 = ((i2 | 119) << 1) - (i2 ^ 119);
        b = i3 % 128;
        int i4 = i3 % 2;
        sb.append("# ");
        sb.append(string2);
        U.d(this, sb, 0);
        int i5 = b;
        int i6 = ((((i5 ^ 117) | (i5 & 117)) << 1) - (~(-(((~i5) & 117) | (i5 & (-118)))))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            string = sb.toString();
            int i7 = 36 / 0;
        } else {
            string = sb.toString();
        }
        int i8 = b;
        int i9 = ((i8 ^ 12) + ((i8 & 12) << 1)) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 5 / 0;
        }
        return string;
    }

    public static <T extends o0OOO0o<T, ?>> T r(T t, byte[] bArr, J j) throws C0065v {
        S s;
        C0046b c0046b;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 7;
        int i5 = (((i3 | 7) & (~i4)) - (~(i4 << 1))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        int length = bArr.length;
        bkM bkm = bkM.h;
        int i7 = b + 13;
        a = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                s = (S) t.C(bkm, null, null);
                c0046b = C0046b.c;
                int i8 = 9 / 0;
            } else {
                s = (S) t.C(bkm, null, null);
                c0046b = C0046b.c;
            }
            ah ahVarD = c0046b.d(s);
            C0049e.biK bik = new C0049e.biK(j);
            int i9 = b + 69;
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = -(-length);
            int i12 = i11 << 1;
            int i13 = -i11;
            ahVarD.f(s, bArr, 0, ((i12 | i13) << 1) - (i13 ^ i12), bik);
            int i14 = a;
            int i15 = (i14 ^ 105) + ((i14 & 105) << 1);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                ahVarD.h(s);
                i = s.memoizedHashCode;
                int i16 = 68 / 0;
            } else {
                ahVarD.h(s);
                i = s.memoizedHashCode;
            }
            if (i != 0) {
                throw new RuntimeException();
            }
            int i17 = a;
            int i18 = i17 & 125;
            int i19 = (i17 | 125) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
            i(s);
            int i23 = b;
            int i24 = (-2) - (((i23 & 26) + (i23 | 26)) ^ (-1));
            a = i24 % 128;
            if (i24 % 2 == 0) {
                return s;
            }
            throw null;
        } catch (IOException e) {
            if (e.getCause() instanceof C0065v) {
                throw ((C0065v) e.getCause());
            }
            throw new C0065v(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw C0065v.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: RuntimeException -> 0x0077, IOException -> 0x0079, PHI: r2
  0x0046: PHI (r2v5 ivas.gov.bisp.enumeration.aD.ah) = (r2v4 ivas.gov.bisp.enumeration.aD.ah), (r2v7 ivas.gov.bisp.enumeration.aD.ah) binds: [B:13:0x0044, B:10:0x003b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {IOException -> 0x0079, RuntimeException -> 0x0077, blocks: (B:5:0x0020, B:8:0x0031, B:18:0x0058, B:20:0x0067, B:14:0x0046, B:12:0x003e, B:28:0x0083, B:29:0x0085, B:30:0x0088), top: B:46:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    public static <T extends o0OOO0o<T, ?>> T q(T t, P p, J j) throws C0065v {
        ah ahVarD;
        C0063t c0063t;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 87;
        int i5 = i3 | 87;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        Object obj = null;
        try {
            if (i6 % 2 != 0) {
                C0046b c0046b = C0046b.c;
                obj.hashCode();
                throw null;
            }
            S s = (S) t.C(bkM.h, null, null);
            C0046b c0046b2 = C0046b.c;
            int i7 = (-2) - ((b + 2) ^ (-1));
            a = i7 % 128;
            if (i7 % 2 != 0) {
                ahVarD = c0046b2.d(s);
                c0063t = p.e;
                int i8 = 15 / 0;
                if (c0063t == null) {
                    c0063t = new C0063t(p);
                    i = a + 119;
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i9 = 3 / 3;
                    }
                }
            } else {
                ahVarD = c0046b2.d(s);
                c0063t = p.e;
                if (c0063t == null) {
                    c0063t = new C0063t(p);
                    i = a + 119;
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i10 = 3 / 3;
                    }
                }
            }
            ahVarD.d(s, c0063t, j);
            int i11 = a;
            int i12 = (i11 & 39) + (i11 | 39);
            b = i12 % 128;
            int i13 = i12 % 2;
            ahVarD.h(s);
            int i14 = b;
            int i15 = (i14 & 51) + (i14 | 51);
            a = i15 % 128;
            int i16 = i15 % 2;
            return s;
        } catch (IOException e) {
            if (!(e.getCause() instanceof C0065v)) {
                throw new C0065v(e.getMessage());
            }
            int i17 = a;
            int i18 = i17 & 3;
            int i19 = (i17 | 3) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
            throw ((C0065v) e.getCause());
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof C0065v)) {
                throw e2;
            }
            int i23 = a + 109;
            b = i23 % 128;
            int i24 = i23 % 2;
            throw ((C0065v) e2.getCause());
        }
    }

    public static Object o(Method method, Object obj, Object... objArr) {
        Object objInvoke;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 112) + ((i2 & 112) << 1)) - 1;
        b = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                objInvoke = method.invoke(obj, objArr);
                int i4 = 13 / 0;
            } else {
                objInvoke = method.invoke(obj, objArr);
            }
            int i5 = b;
            int i6 = ((i5 | 101) << 1) - (i5 ^ 101);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 91 / 0;
            }
            return objInvoke;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (!(cause instanceof Error)) {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            int i8 = b;
            int i9 = (i8 ^ 85) + ((i8 & 85) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                throw ((Error) cause);
            }
            int i10 = 60 / 0;
            throw ((Error) cause);
        }
    }
}
