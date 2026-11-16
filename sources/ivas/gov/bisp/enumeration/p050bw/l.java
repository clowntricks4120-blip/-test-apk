package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.X;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o000O000<Time> {
    private static int a = 0;
    private static int b = 1;
    public static final E c = new bsl();
    public final DateFormat d = new SimpleDateFormat("hh:mm:ss a");

    public class bsl implements E {
        private static int a = 1;
        private static int b;

        @Override // ivas.gov.bisp.enumeration.p035bh.E
        public <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
            l lVar;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
            a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if (typeToken.a == Time.class) {
                lVar = new l();
                int i5 = a;
                int i6 = i5 & 91;
                int i7 = (i5 ^ 91) | i6;
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = a;
                int i11 = (i10 ^ 119) + ((i10 & 119) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                lVar = null;
            }
            int i13 = b;
            int i14 = ((i13 & 5) - (~(i13 | 5))) - 1;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                return lVar;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = b;
        int i2 = ((i ^ 125) - (~(-(-((i & 125) << 1))))) - 1;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object c(j jVar) {
        synchronized (this) {
            if (jVar.y() == 9) {
                jVar.s();
                return null;
            }
            try {
                return new Time(this.d.parse(jVar.x()).getTime());
            } catch (ParseException e) {
                throw new X(e);
            }
        }
    }

    public final void d(c cVar, Object obj) {
        Time time = (Time) obj;
        synchronized (this) {
            cVar.t(time == null ? null : this.d.format((Date) time));
        }
    }
}
