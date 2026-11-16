package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.X;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class u extends o000O000<Date> {
    private static int a = 0;
    private static int b = 1;
    public static final E c = new bsn();
    public final DateFormat d = new SimpleDateFormat("MMM d, yyyy");

    public class bsn implements E {
        private static int a = 1;
        private static int b;

        @Override // ivas.gov.bisp.enumeration.p035bh.E
        public <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 109;
            int i4 = ((i2 | 109) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            u uVar = null;
            if (i4 % 2 != 0) {
                Class<? super T> cls = typeToken.a;
                throw null;
            }
            if (typeToken.a == Date.class) {
                uVar = new u();
                int i5 = a;
                int i6 = ((i5 | 93) << 1) - (i5 ^ 93);
                b = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = b;
                int i9 = i8 ^ 31;
                int i10 = (((i8 & 31) | i9) << 1) - i9;
                a = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = b;
            int i13 = i12 & 17;
            int i14 = (i12 | 17) & (~i13);
            int i15 = i13 << 1;
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
            return uVar;
        }
    }

    static {
        int i = a + 115;
        b = i % 128;
        int i2 = i % 2;
    }

    public final Object c(j jVar) {
        synchronized (this) {
            if (jVar.y() == 9) {
                jVar.s();
                return null;
            }
            try {
                return new Date(this.d.parse(jVar.x()).getTime());
            } catch (ParseException e) {
                throw new X(e);
            }
        }
    }

    public final void d(c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            cVar.t(date == null ? null : this.d.format((java.util.Date) date));
        }
    }
}
