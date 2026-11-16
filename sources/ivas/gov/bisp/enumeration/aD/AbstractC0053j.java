package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooO00o;
import ivas.gov.bisp.enumeration.o000O000.OooO00o.OooO00o;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0053j<MessageType extends OooO00o<MessageType, BuilderType>, BuilderType extends OooO00o.OooO00o<MessageType, BuilderType>> implements aa {
    private static int a = 1;
    private static int b;
    public int memoizedHashCode = 0;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.j$bbr */
    public static abstract class bbr<MessageType extends ivas.gov.bisp.enumeration.o000O000.OooO00o<MessageType, BuilderType>, BuilderType extends ivas.gov.bisp.enumeration.o000O000.OooO00o.OooO00o<MessageType, BuilderType>> implements aa.bbq {
    }

    public int h() {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    public int k(ah ahVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 67) + (i2 | 67);
        a = i3 % 128;
        int i4 = i3 % 2;
        int iH = h();
        if (iH == -1) {
            int i5 = a;
            int i6 = i5 & 123;
            int i7 = (i6 - (~((i5 ^ 123) | i6))) - 1;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                m(ahVar.g(this));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iH = ahVar.g(this);
            m(iH);
        }
        int i8 = a;
        int i9 = i8 & 101;
        int i10 = (i8 ^ 101) | i9;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return iH;
    }

    public void m(int i) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    public final String l(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 101;
        int i4 = -(-((i2 & 101) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Serializing ");
        String name = getClass().getName();
        int i7 = a;
        int i8 = (i7 & (-76)) | ((~i7) & 75);
        int i9 = -(-((i7 & 75) << 1));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            sbW.append(name);
            sbW.append(" to a ");
            throw null;
        }
        sbW.append(name);
        sbW.append(" to a ");
        sbW.append(str);
        sbW.append(" threw an IOException (should never happen).");
        String string = sbW.toString();
        int i11 = b + 126;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        return string;
    }

    @Override // ivas.gov.bisp.enumeration.aD.aa
    public byte[] e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 1;
        int i4 = (((i2 ^ 1) | i3) << 1) - ((i2 | 1) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        try {
            S s = (S) this;
            int iC = s.c();
            byte[] bArr = new byte[iC];
            Logger logger = AbstractC0064u.d;
            AbstractC0064u.bji bjiVar = new AbstractC0064u.bji(bArr, 0, iC);
            int i6 = b;
            int i7 = i6 & 1;
            int i8 = (i6 ^ 1) | i7;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            s.b(bjiVar);
            if (bjiVar.ca() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            int i11 = b;
            int i12 = (i11 & (-38)) | ((~i11) & 37);
            int i13 = (i11 & 37) << 1;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            int i15 = i14 % 128;
            a = i15;
            if (i14 % 2 == 0) {
                throw null;
            }
            int i16 = ((i15 ^ 35) | (i15 & 35)) << 1;
            int i17 = -(((~i15) & 35) | (i15 & (-36)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(l("byte array"), e);
        }
    }

    @Override // ivas.gov.bisp.enumeration.aD.aa
    public AbstractC0069z g() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 62) + ((i2 & 62) << 1)) - 1;
        a = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                int iC = ((S) this).c();
                AbstractC0069z abstractC0069z = AbstractC0069z.c;
                byte[] bArr = new byte[iC];
                throw null;
            }
            S s = (S) this;
            int iC2 = s.c();
            AbstractC0069z abstractC0069z2 = AbstractC0069z.c;
            byte[] bArr2 = new byte[iC2];
            Logger logger = AbstractC0064u.d;
            AbstractC0064u.bji bjiVar = new AbstractC0064u.bji(bArr2, 0, iC2);
            int i4 = b;
            int i5 = (i4 & (-18)) | ((~i4) & 17);
            int i6 = -(-((i4 & 17) << 1));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                s.b(bjiVar);
                bjiVar.ca();
                throw null;
            }
            s.b(bjiVar);
            if (bjiVar.ca() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            AbstractC0069z.bjb bjbVar = new AbstractC0069z.bjb(bArr2);
            int i8 = b;
            int i9 = (i8 & (-120)) | ((~i8) & 119);
            int i10 = (i8 & 119) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 27 / 0;
            }
            return bjbVar;
        } catch (IOException e) {
            throw new RuntimeException(l("ByteString"), e);
        }
    }
}
