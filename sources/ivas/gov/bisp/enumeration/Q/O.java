package ivas.gov.bisp.enumeration.Q;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class O {
    private static int a = 1;
    private static int b;
    public static AtomicReference<C0022m> c = new AtomicReference<>();

    static {
        int i = a;
        int i2 = i & 101;
        int i3 = i | 101;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    public static TimeZone d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = (i2 | 81) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        int i8 = a;
        int i9 = i8 & 109;
        int i10 = -(-((i8 ^ 109) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return timeZone;
    }

    public static Calendar g() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = -(-((i2 ^ 101) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Calendar calendarF = f(null);
        int i7 = a;
        int i8 = i7 ^ 87;
        int i9 = ((i7 & 87) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 20 / 0;
        }
        return calendarF;
    }

    public static Calendar e() {
        Calendar calendar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 105;
        int i4 = ((i3 << 1) - (~(-((~(i2 & 105)) & i3)))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        C0022m c0022m = c.get();
        if (c0022m == null) {
            int i6 = b;
            int i7 = (i6 & 73) + (i6 | 73);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                c0022m = C0022m.c;
                int i8 = 89 / 0;
            } else {
                c0022m = C0022m.c;
            }
        }
        TimeZone timeZone = c0022m.e;
        if (timeZone == null) {
            int i9 = b;
            int i10 = ((i9 | 85) << 1) - (i9 ^ 85);
            a = i10 % 128;
            int i11 = i10 % 2;
            calendar = Calendar.getInstance();
            int i12 = b;
            int i13 = i12 & 45;
            int i14 = (i13 - (~((i12 ^ 45) | i13))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
        } else {
            calendar = Calendar.getInstance(timeZone);
            int i16 = a;
            int i17 = (((i16 & (-60)) | ((~i16) & 59)) - (~((i16 & 59) << 1))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        Long l = c0022m.d;
        if (l != null) {
            int i19 = a + 115;
            b = i19 % 128;
            int i20 = i19 % 2;
            calendar.setTimeInMillis(l.longValue());
            int i21 = (-2) - ((a + 100) ^ (-1));
            b = i21 % 128;
            int i22 = i21 % 2;
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        int i23 = (-2) - ((b + 80) ^ (-1));
        a = i23 % 128;
        int i24 = i23 % 2;
        calendar.set(13, 0);
        calendar.set(14, 0);
        TimeZone timeZoneD = d();
        int i25 = b;
        int i26 = (i25 & 118) + (i25 | 118);
        int i27 = (i26 ^ (-1)) + (i26 << 1);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            calendar.setTimeZone(timeZoneD);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        calendar.setTimeZone(timeZoneD);
        int i28 = b;
        int i29 = i28 & 105;
        int i30 = i28 | 105;
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        a = i31 % 128;
        int i32 = i31 % 2;
        return calendar;
    }

    public static Calendar c(Calendar calendar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 1) << 1) - (i2 ^ 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        Calendar calendarF = f(calendar);
        Calendar calendarG = g();
        int i5 = calendarF.get(1);
        int i6 = a;
        int i7 = i6 & 31;
        int i8 = (i6 ^ 31) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = calendarF.get(2);
        int i12 = calendarF.get(5);
        int i13 = b;
        int i14 = ((i13 & 25) - (~(i13 | 25))) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
        Object obj = null;
        calendarG.set(i5, i11, i12);
        if (i15 == 0) {
            obj.hashCode();
            throw null;
        }
        int i16 = a;
        int i17 = (((i16 ^ 125) | (i16 & 125)) << 1) - (((~i16) & 125) | (i16 & (-126)));
        b = i17 % 128;
        if (i17 % 2 == 0) {
            return calendarG;
        }
        throw null;
    }

    public static Calendar f(Calendar calendar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 61;
        int i4 = -(-((i2 ^ 61) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Calendar calendar2 = Calendar.getInstance(d());
        if (calendar == null) {
            int i7 = a;
            int i8 = (i7 & (-76)) | ((~i7) & 75);
            int i9 = -(-((i7 & 75) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                calendar2.clear();
                throw null;
            }
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
            int i11 = a;
            int i12 = ((i11 | 87) << 1) - (i11 ^ 87);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 4 % 5;
            }
        }
        int i14 = b;
        int i15 = ((i14 & 101) - (~(i14 | 101))) - 1;
        a = i15 % 128;
        if (i15 % 2 != 0) {
            return calendar2;
        }
        throw null;
    }

    public static long b(long j) {
        Calendar calendarC;
        int i = 2 % 2;
        int i2 = a + 83;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Calendar calendarG = g();
            calendarG.setTimeInMillis(j);
            calendarC = c(calendarG);
            int i3 = 87 / 0;
        } else {
            Calendar calendarG2 = g();
            calendarG2.setTimeInMillis(j);
            calendarC = c(calendarG2);
        }
        int i4 = a;
        int i5 = (i4 & 21) + (i4 | 21);
        b = i5 % 128;
        int i6 = i5 % 2;
        long timeInMillis = calendarC.getTimeInMillis();
        if (i6 != 0) {
            int i7 = 48 / 0;
        }
        return timeInMillis;
    }
}
