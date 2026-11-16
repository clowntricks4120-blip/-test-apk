package ivas.gov.bisp.enumeration.p050bw;

import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.X;
import ivas.gov.bisp.enumeration.p035bh.ad;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0227m implements E {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Class c;
    public final /* synthetic */ ad d;

    public C0227m(Class cls, ad adVar) {
        this.c = cls;
        this.d = adVar;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 70) + ((i2 & 70) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        StringBuilder sbW = j.w("Factory[typeHierarchy=");
        sbW.append(this.c.getName());
        int i6 = a;
        int i7 = (i6 & (-70)) | ((~i6) & 69);
        int i8 = -(-((i6 & 69) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        sbW.append(",adapter=");
        if (i10 == 0) {
            sbW.append(this.d);
            throw null;
        }
        sbW.append(this.d);
        sbW.append("]");
        String string = sbW.toString();
        int i11 = b;
        int i12 = i11 & 61;
        int i13 = i12 + ((i11 ^ 61) | i12);
        a = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.m$btc */
    public class btc extends o000O000<Object> {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Class c;

        public btc(Class cls) {
            this.c = cls;
        }

        public void d(c cVar, Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
            a = i3 % 128;
            int i4 = i3 % 2;
            C0227m.this.d.d(cVar, obj);
            int i5 = a;
            int i6 = (i5 & 29) + (i5 | 29);
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        public Object c(ivas.gov.bisp.enumeration.p032be.j jVar) {
            StringBuilder sbW;
            String name;
            int i = 2 % 2;
            int i2 = b + 71;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                C0227m.this.d.c(jVar);
                throw null;
            }
            Object objC = C0227m.this.d.c(jVar);
            if (objC == null || this.c.isInstance(objC)) {
                int i3 = b + 111;
                a = i3 % 128;
                int i4 = i3 % 2;
                return objC;
            }
            int i5 = b;
            int i6 = (-2) - (((i5 & 98) + (i5 | 98)) ^ (-1));
            a = i6 % 128;
            if (i6 % 2 == 0) {
                sbW = j.w("Expected a ");
                name = this.c.getName();
                int i7 = 47 / 0;
            } else {
                sbW = j.w("Expected a ");
                name = this.c.getName();
            }
            int i8 = a;
            int i9 = i8 ^ 109;
            int i10 = -(-((i8 & 109) << 1));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                sbW.append(name);
                sbW.append(" but was ");
                throw null;
            }
            sbW.append(name);
            sbW.append(" but was ");
            sbW.append(objC.getClass().getName());
            throw new X(sbW.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p050bw.C0227m.a;
        r0 = r5 & 39;
        r1 = (((~r0) & (r5 | 39)) - (~(-(-(r0 << 1))))) - 1;
        ivas.gov.bisp.enumeration.p050bw.C0227m.b = r1 % 128;
        r1 = r1 % 2;
        r0 = r5 & 113;
        r5 = -(-((r5 ^ 113) | r0));
        r1 = (r0 & r5) + (r5 | r0);
        ivas.gov.bisp.enumeration.p050bw.C0227m.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r3.c.isAssignableFrom(r5) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r3.c.isAssignableFrom(r5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r0 = new ivas.gov.bisp.enumeration.p050bw.C0227m.btc(r3, r5);
        r5 = ivas.gov.bisp.enumeration.p050bw.C0227m.a;
        r1 = (r5 | 19) << 1;
        r5 = -(((~r5) & 19) | (r5 & (-20)));
        r2 = (r1 & r5) + (r5 | r1);
        ivas.gov.bisp.enumeration.p050bw.C0227m.b = r2 % 128;
        r2 = r2 % 2;
     */
    @Override // ivas.gov.bisp.enumeration.p035bh.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T2> ivas.gov.bisp.enumeration.o000O0o.o000O000<T2> b(ivas.gov.bisp.enumeration.p035bh.C r4, com.google.gson.reflect.TypeToken<T2> r5) {
        /*
            r3 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = ivas.gov.bisp.enumeration.p050bw.C0227m.a
            r1 = r0 & 93
            r0 = r0 ^ 93
            r0 = r0 | r1
            int r1 = r1 + r0
            int r0 = r1 % 128
            ivas.gov.bisp.enumeration.p050bw.C0227m.b = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L21
            java.lang.Class<? super T> r5 = r5.a
            java.lang.Class r0 = r3.c
            boolean r0 = r0.isAssignableFrom(r5)
            r1 = 68
            int r1 = r1 / 0
            if (r0 != 0) goto L2b
            goto L47
        L21:
            java.lang.Class<? super T> r5 = r5.a
            java.lang.Class r0 = r3.c
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L47
        L2b:
            ivas.gov.bisp.enumeration.bw.m$btc r0 = new ivas.gov.bisp.enumeration.bw.m$btc
            r0.<init>(r5)
            int r5 = ivas.gov.bisp.enumeration.p050bw.C0227m.a
            r1 = r5 | 19
            int r1 = r1 << 1
            r2 = r5 & (-20)
            int r5 = ~r5
            r5 = r5 & 19
            r5 = r5 | r2
            int r5 = -r5
            r2 = r1 & r5
            r5 = r5 | r1
            int r2 = r2 + r5
            int r5 = r2 % 128
            ivas.gov.bisp.enumeration.p050bw.C0227m.b = r5
            int r2 = r2 % r4
            return r0
        L47:
            int r5 = ivas.gov.bisp.enumeration.p050bw.C0227m.a
            r0 = r5 & 39
            int r1 = ~r0
            r2 = r5 | 39
            r1 = r1 & r2
            int r0 = r0 << 1
            int r0 = -r0
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 + (-1)
            int r0 = r1 % 128
            ivas.gov.bisp.enumeration.p050bw.C0227m.b = r0
            int r1 = r1 % r4
            r0 = r5 & 113(0x71, float:1.58E-43)
            r5 = r5 ^ 113(0x71, float:1.58E-43)
            r5 = r5 | r0
            int r5 = -r5
            int r5 = -r5
            r1 = r0 & r5
            r5 = r5 | r0
            int r1 = r1 + r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.p050bw.C0227m.b = r5
            int r1 = r1 % r4
            r4 = 0
            if (r1 == 0) goto L70
            return r4
        L70:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p050bw.C0227m.b(ivas.gov.bisp.enumeration.bh.C, com.google.gson.reflect.TypeToken):ivas.gov.bisp.enumeration.bh.ad");
    }
}
