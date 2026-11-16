package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.cQ.e;
import ivas.gov.bisp.enumeration.p096p.h;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cP.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0244m extends e implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public final long c;

    public C0244m() {
        AtomicReference<Map<String, AbstractC0242a>> atomicReference = u.c;
        this.c = System.currentTimeMillis();
    }

    @Override // ivas.gov.bisp.enumeration.cP.R
    public final h b() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 61;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 61)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            ivas.gov.bisp.enumeration.cR.N n = ivas.gov.bisp.enumeration.cR.N.Q;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.cR.N n2 = ivas.gov.bisp.enumeration.cR.N.Q;
        int i7 = a;
        int i8 = i7 & 53;
        int i9 = (i7 ^ 53) | i8;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return n2;
    }

    @Override // ivas.gov.bisp.enumeration.cP.R
    public final long s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.c;
        int i4 = (i2 & (-20)) | ((~i2) & 19);
        int i5 = -(-((i2 & 19) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cQ.e, ivas.gov.bisp.enumeration.cP.R
    public final C0244m y() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = (((i2 ^ 3) | i3) << 1) - ((i2 | 3) & (~i3));
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return this;
    }

    public C0244m(long j) {
        this.c = j;
    }
}
