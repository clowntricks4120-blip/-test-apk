package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p100w.r;
import ivas.gov.bisp.enumeration.p102y.a;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends o000O000<Date> {
    private static int a = 0;
    private static int b = 1;
    public final Class<? extends Date> c;
    public final List<DateFormat> d;

    public Q(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        e(cls);
        this.c = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
            int i3 = a;
            int i4 = (((i3 | 88) << 1) - (i3 ^ 88)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        if (a.c >= 9) {
            int i7 = b;
            int i8 = i7 + 113;
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            int i11 = i7 + 69;
            a = i11 % 128;
            int i12 = i11 % 2;
            arrayList.add(r.S(i, i2));
            int i13 = b;
            int i14 = (i13 & 27) + (i13 | 27);
            a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
        } else {
            int i17 = a;
            int i18 = i17 & 89;
            int i19 = (i17 | 89) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 2 % 2;
        }
        int i24 = b;
        int i25 = i24 & 61;
        int i26 = i24 | 61;
        int i27 = (i25 & i26) + (i26 | i25);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Class<? extends Date> e(Class<? extends Date> cls) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = (i3 - (~((i2 ^ 113) | i3))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Object obj = null;
        if (cls != Date.class) {
            int i7 = i5 + 69;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (cls != java.sql.Date.class && cls != Timestamp.class) {
                StringBuilder sb = new StringBuilder();
                sb.append("Date type must be one of ");
                int i8 = a;
                int i9 = ((i8 ^ 94) + ((i8 & 94) << 1)) - 1;
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    sb.append(Date.class);
                    sb.append(", ");
                    obj.hashCode();
                    throw null;
                }
                sb.append(Date.class);
                sb.append(", ");
                int i10 = a;
                int i11 = i10 & 69;
                int i12 = -(-(i10 | 69));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    sb.append(Timestamp.class);
                    sb.append(", or ");
                    int i14 = 22 / 0;
                } else {
                    sb.append(Timestamp.class);
                    sb.append(", or ");
                }
                sb.append(java.sql.Date.class);
                sb.append(" but was ");
                sb.append(cls);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int i15 = i5 & 5;
        int i16 = (i5 | 5) & (~i15);
        int i17 = i15 << 1;
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            return cls;
        }
        obj.hashCode();
        throw null;
    }

    public final Object c(j jVar) {
        Date dateC;
        Object date;
        if (jVar.y() == 9) {
            jVar.s();
            return null;
        }
        String strX = jVar.x();
        synchronized (this.d) {
            Iterator<DateFormat> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    try {
                        dateC = ivas.gov.bisp.enumeration.p033bf.j.c(strX, new ParsePosition(0));
                        break;
                    } catch (ParseException e) {
                        throw new X(strX, e);
                    }
                }
                try {
                    dateC = it.next().parse(strX);
                    break;
                } catch (ParseException unused) {
                }
            }
        }
        Class<? extends Date> cls = this.c;
        if (cls == Date.class) {
            return dateC;
        }
        if (cls == Timestamp.class) {
            date = new Timestamp(dateC.getTime());
        } else {
            if (cls != java.sql.Date.class) {
                throw new AssertionError();
            }
            date = new java.sql.Date(dateC.getTime());
        }
        return date;
    }

    public final void d(c cVar, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            cVar.c();
            return;
        }
        synchronized (this.d) {
            cVar.t(this.d.get(0).format(date));
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 117) | (i2 & 117)) << 1) - (((~i2) & 117) | (i2 & (-118)));
        a = i3 % 128;
        DateFormat dateFormat = i3 % 2 != 0 ? this.d.get(1) : this.d.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            int i4 = b;
            int i5 = ((i4 | 121) << 1) - (i4 ^ 121);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                ivas.gov.bisp.enumeration.p091n.j.w("DefaultDateTypeAdapter(");
                ((SimpleDateFormat) dateFormat).toPattern();
                throw null;
            }
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("DefaultDateTypeAdapter(");
            sbW.append(((SimpleDateFormat) dateFormat).toPattern());
            sbW.append(')');
            int i6 = b;
            int i7 = (i6 ^ 103) + ((i6 & 103) << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return sbW.toString();
            }
            int i8 = 94 / 0;
            return sbW.toString();
        }
        StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("DefaultDateTypeAdapter(");
        String simpleName = dateFormat.getClass().getSimpleName();
        int i9 = a;
        int i10 = i9 ^ 123;
        int i11 = ((i9 & 123) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        b = i13 % 128;
        int i14 = i13 % 2;
        sbW2.append(simpleName);
        if (i14 == 0) {
            sbW2.append('*');
        } else {
            sbW2.append(')');
        }
        String string = sbW2.toString();
        int i15 = b;
        int i16 = ((i15 ^ 10) + ((i15 & 10) << 1)) - 1;
        a = i16 % 128;
        int i17 = i16 % 2;
        return string;
    }
}
