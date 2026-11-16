package ivas.gov.bisp.enumeration.cQ;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.u;
import ivas.gov.bisp.enumeration.cR.N;
import ivas.gov.bisp.enumeration.p096p.h;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends r implements Serializable {
    private static int a = 1;
    private static int b;
    public volatile long c;
    public volatile h d;

    public i() {
        AtomicReference<Map<String, AbstractC0242a>> atomicReference = u.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.d = N.bz();
        this.c = jCurrentTimeMillis;
        g();
    }

    @Override // ivas.gov.bisp.enumeration.cP.R
    public h b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = -(-(i2 | 19));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return this.d;
        }
        int i6 = 10 / 0;
        return this.d;
    }

    @Override // ivas.gov.bisp.enumeration.cP.R
    public long s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 57;
        int i4 = ((i2 & 57) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.c;
        int i7 = b;
        int i8 = (i7 & 97) + (i7 | 97);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return j;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0042  */
    public final void g() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 79;
        int i4 = -(-((i2 & 79) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (this.c != Long.MIN_VALUE) {
            int i7 = b;
            int i8 = (((i7 & (-26)) | ((~i7) & 25)) - (~(-(-((i7 & 25) << 1))))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            if (this.c == Long.MAX_VALUE) {
                this.d = this.d.ba();
                int i10 = b;
                int i11 = i10 & 33;
                int i12 = (i10 ^ 33) | i11;
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            this.d = this.d.ba();
            int i15 = b;
            int i16 = i15 & 33;
            int i17 = (i15 ^ 33) | i16;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = b;
        int i21 = ((i20 ^ 87) | (i20 & 87)) << 1;
        int i22 = -(((~i20) & 87) | (i20 & (-88)));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public i(long j, AbstractC0242a abstractC0242a) {
        N nBy = N.by(abstractC0242a);
        AtomicReference<Map<String, AbstractC0242a>> atomicReference = u.c;
        this.d = nBy;
        this.c = j;
        g();
    }

    /* JADX WARN: Code duplicated, block: B:198:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[LOOP:0: B:27:0x00bf->B:202:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x04ee -> B:166:0x04f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x04ee -> B:167:0x04f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x04f3 -> B:166:0x04f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x04f3 -> B:167:0x04f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public i(java.lang.Object r23, ivas.gov.bisp.enumeration.p096p.h r24) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cQ.i.<init>(java.lang.Object, ivas.gov.bisp.enumeration.p.h):void");
    }

    public i(int i, int i2, int i3, int i4, int i5, int i6, int i7, h hVar) {
        this.d = u.b(hVar);
        this.c = this.d.ae(i, i2, i3, i4, i5, i6, i7);
        g();
    }
}
