package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p100w.r;
import ivas.gov.bisp.enumeration.p102y.a;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o000O000<Date> {
    private static int a = 1;
    private static int b;
    public static final E c = new brY();
    public final List<DateFormat> d;

    public class brY implements E {
        private static int a = 1;
        private static int b;

        /* JADX WARN: Code duplicated, block: B:11:0x0048  */
        /* JADX WARN: Code duplicated, block: B:12:0x004c  */
        /* JADX WARN: Code duplicated, block: B:9:0x002e  */
        @Override // ivas.gov.bisp.enumeration.p035bh.E
        public <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
            o000O000<T> hVar;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 99;
            int i5 = (i3 | 99) & (~i4);
            int i6 = -(-(i4 << 1));
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                int i8 = 23 / 0;
                if (typeToken.a == Date.class) {
                    hVar = new h();
                    int i9 = a;
                    int i10 = i9 & 69;
                    i = (((i9 ^ 69) | i10) << 1) - ((i9 | 69) & (~i10));
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i11 = 4 % 5;
                    }
                } else {
                    int i12 = a;
                    int i13 = i12 & 111;
                    int i14 = (i12 | 111) & (~i13);
                    int i15 = -(-(i13 << 1));
                    int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    hVar = null;
                }
            } else if (typeToken.a == Date.class) {
                hVar = new h();
                int i18 = a;
                int i19 = i18 & 69;
                i = (((i18 ^ 69) | i19) << 1) - ((i18 | 69) & (~i19));
                b = i % 128;
                if (i % 2 != 0) {
                    int i110 = 4 % 5;
                }
            } else {
                int i111 = a;
                int i112 = i111 & 111;
                int i113 = (i111 | 111) & (~i112);
                int i114 = -(-(i112 << 1));
                int i115 = ((i113 | i114) << 1) - (i113 ^ i114);
                b = i115 % 128;
                int i116 = i115 % 2;
                hVar = null;
            }
            int i20 = a;
            int i21 = ((i20 & (-56)) | ((~i20) & 55)) + ((i20 & 55) << 1);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                return hVar;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = a;
        int i2 = i & 21;
        int i3 = (i | 21) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public h() {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
            int i = b;
            int i2 = i & 115;
            int i3 = ((i | 115) & (~i2)) + (i2 << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 5;
            } else {
                int i5 = 2 % 2;
            }
        }
        if (a.c >= 9) {
            int i6 = a;
            int i7 = (i6 | 125) << 1;
            int i8 = -(i6 ^ 125);
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i6 & 3;
            int i12 = ((i6 ^ 3) | i11) << 1;
            int i13 = -((i6 | 3) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            int i15 = i14 % 128;
            b = i15;
            if (i14 % 2 == 0) {
                int i16 = 2 % 2;
            }
            int i17 = i15 + 113;
            a = i17 % 128;
            int i18 = i17 % 2;
            arrayList.add(r.S(2, 2));
            int i19 = a;
            int i20 = (((i19 & (-106)) | ((~i19) & 105)) - (~((i19 & 105) << 1))) - 1;
            b = i20 % 128;
            if (i20 % 2 == 0) {
            }
            int i21 = a;
            int i22 = (i21 & 15) + (i21 | 15);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = b;
        int i25 = i24 & 77;
        int i26 = ((i24 | 77) & (~i25)) + (i25 << 1);
        a = i26 % 128;
        int i27 = i26 % 2;
        int i28 = 2 % 2;
        int i29 = a;
        int i210 = (i29 & 15) + (i29 | 15);
        b = i210 % 128;
        int i211 = i210 % 2;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(ivas.gov.bisp.enumeration.p032be.j r3) {
        /*
            r2 = this;
            int r0 = r3.y()
            r1 = 9
            if (r0 != r1) goto Ld
            r3.s()
            r3 = 0
            goto L35
        Ld:
            java.lang.String r3 = r3.x()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.d     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3d
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3d
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L3d
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L3d
            monitor-exit(r2)
            goto L35
        L2a:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L36 java.lang.Throwable -> L3d
            r1 = 0
            r0.<init>(r1)     // Catch: java.text.ParseException -> L36 java.lang.Throwable -> L3d
            java.util.Date r3 = ivas.gov.bisp.enumeration.p033bf.j.c(r3, r0)     // Catch: java.text.ParseException -> L36 java.lang.Throwable -> L3d
            monitor-exit(r2)
        L35:
            return r3
        L36:
            r0 = move-exception
            ivas.gov.bisp.enumeration.bh.X r1 = new ivas.gov.bisp.enumeration.bh.X     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3d
            throw r1     // Catch: java.lang.Throwable -> L3d
        L3d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p050bw.h.c(ivas.gov.bisp.enumeration.be.j):java.lang.Object");
    }

    public final void d(c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            try {
                if (date == null) {
                    cVar.c();
                } else {
                    cVar.t(this.d.get(0).format(date));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
