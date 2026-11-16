package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o0OO00O;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class R {
    private static int a = 0x00000000;
    private static int b = 0x00000001;
    public static final Charset c = Charset.forName("UTF-8");
    public static final byte[] d;

    public interface bcK {
        int c();
    }

    public interface biN<E> extends List<E>, RandomAccess {
        void c();

        o0OO00O.OooO0OO<E> g(int i);

        boolean o();
    }

    public interface bkH {
        boolean b(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        int i = b;
        int i2 = ((i | 97) << 1) - (i ^ 97);
        a = i2 % 128;
        int i3 = i2 % 2;
        d = bArr;
        ByteBuffer.wrap(bArr);
        int i4 = b;
        int i5 = ((i4 ^ 52) + ((i4 & 52) << 1)) - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            P.e(bArr, 0, 0, false);
        } else {
            P.e(bArr, 0, 0, false);
        }
        int i6 = b;
        int i7 = i6 | 117;
        int i8 = (i7 << 1) - ((~(i6 & 117)) & i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 96 / 0;
        }
    }

    public static int b(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 55;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (z) {
            int i7 = ((i3 | 105) << 1) - (i3 ^ 105);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = (((i8 & (-18)) | ((~i8) & 17)) - (~(-(-((i8 & 17) << 1))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            i = 1231;
        } else {
            int i12 = i5 & 15;
            int i13 = (~i12) & (i5 | 15);
            int i14 = -(-(i12 << 1));
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            int i16 = i15 % 2;
            i = 1237;
        }
        int i17 = b;
        int i18 = (i17 & (-24)) | ((~i17) & 23);
        int i19 = -(-((i17 & 23) << 1));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public static int c(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 123;
        b = i3 % 128;
        int i4 = (int) (i3 % 2 == 0 ? j | (j >>> 74) : j ^ (j >>> 32));
        int i5 = i2 + 101;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public static Object d(Object obj, Object obj2) {
        S.bbs bbsVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 75) | (i2 & 75)) << 1) - (~(-(((~i2) & 75) | (i2 & (-76)))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        aa.bbq bbqVarF = ((aa) obj).f();
        aa aaVar = (aa) obj2;
        int i5 = a;
        int i6 = (i5 & (-118)) | ((~i5) & 117);
        int i7 = (i5 & 117) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            AbstractC0053j.bbr bbrVar = (AbstractC0053j.bbr) bbqVarF;
            Objects.requireNonNull(bbrVar);
            bbsVar = (S.bbs) bbrVar;
            int i9 = 59 / 0;
        } else {
            AbstractC0053j.bbr bbrVar2 = (AbstractC0053j.bbr) bbqVarF;
            Objects.requireNonNull(bbrVar2);
            bbsVar = (S.bbs) bbrVar2;
        }
        int i10 = a + 5;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            bbsVar.c.getClass().isInstance(aaVar);
            throw null;
        }
        if (!bbsVar.c.getClass().isInstance(aaVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        S s = (S) ((AbstractC0053j) aaVar);
        bbsVar.f();
        MessageType messagetype = bbsVar.d;
        int i11 = b;
        int i12 = i11 & 69;
        int i13 = (i12 - (~((i11 ^ 69) | i12))) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            bbsVar.h(messagetype, s);
            bbsVar.e();
            throw null;
        }
        bbsVar.h(messagetype, s);
        S sE = bbsVar.e();
        int i14 = a;
        int i15 = i14 & 103;
        int i16 = (((i14 | 103) & (~i15)) - (~(i15 << 1))) - 1;
        b = i16 % 128;
        if (i16 % 2 != 0) {
            return sE;
        }
        throw null;
    }
}
