package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.bB.L;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;

/* JADX INFO: loaded from: classes.dex */
public final class r implements E {
    private static int a = 0;
    private static int b = 1;
    public final ivas.gov.bisp.enumeration.p102y.r c;

    public r(ivas.gov.bisp.enumeration.p102y.r rVar) {
        this.c = rVar;
    }

    @Override // ivas.gov.bisp.enumeration.p035bh.E
    public final <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-110)) | ((~i2) & 109);
        int i4 = -(-((i2 & 109) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        L l = (L) typeToken.a.getAnnotation(L.class);
        Object obj = null;
        if (l != null) {
            o000O000<T> o000o000 = (o000O000<T>) d(this.c, c, typeToken, l);
            int i7 = b + 109;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return o000o000;
            }
            obj.hashCode();
            throw null;
        }
        int i8 = b;
        int i9 = i8 & 105;
        int i10 = i8 | 105;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01de  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        if ((r1 instanceof ivas.gov.bisp.enumeration.p035bh.D) != true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        if ((r1 instanceof ivas.gov.bisp.enumeration.p035bh.D) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        r2 = r9 & 73;
        r4 = (~r2) & (r9 | 73);
        r2 = r2 << 1;
        r7 = ((r4 | r2) << 1) - (r2 ^ r4);
        ivas.gov.bisp.enumeration.p050bw.r.b = r7 % 128;
        r7 = r7 % 2;
        r2 = ivas.gov.bisp.enumeration.p091n.j.w("Invalid attempt to bind an instance of ");
        r1 = r1.getClass().getName();
        r4 = ivas.gov.bisp.enumeration.p050bw.r.b;
        r7 = (r4 & (-40)) | ((~r4) & 39);
        r4 = (r4 & 39) << 1;
        r8 = ((r7 | r4) << 1) - (r4 ^ r7);
        ivas.gov.bisp.enumeration.p050bw.r.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        if ((r8 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        r2.append(r1);
        r2.append(" as a @JsonAdapter for ");
        r1 = ivas.gov.bisp.enumeration.p050bw.r.a;
        r4 = r1 | 93;
        r5 = r4 << 1;
        r1 = -((~(r1 & 93)) & r4);
        r4 = (r5 ^ r1) + ((r1 & r5) << 1);
        ivas.gov.bisp.enumeration.p050bw.r.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
    
        if ((r4 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f0, code lost:
    
        r2.append(r16.toString());
        r2.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        r0 = 79 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        r2.append(r16.toString());
        r2.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0112, code lost:
    
        throw new java.lang.IllegalArgumentException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        r2.append(r1);
        r2.append(" as a @JsonAdapter for ");
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011c, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.o000O0o.o000O000<?> d(ivas.gov.bisp.enumeration.p102y.r r14, ivas.gov.bisp.enumeration.p035bh.C r15, com.google.gson.reflect.TypeToken<?> r16, ivas.gov.bisp.enumeration.bB.L r17) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p050bw.r.d(ivas.gov.bisp.enumeration.y.r, ivas.gov.bisp.enumeration.bh.C, com.google.gson.reflect.TypeToken, ivas.gov.bisp.enumeration.bB.L):ivas.gov.bisp.enumeration.bh.ad");
    }
}
