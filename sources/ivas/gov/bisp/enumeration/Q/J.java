package ivas.gov.bisp.enumeration.Q;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Comparable<J>, Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new beo();
    private static int b = 1;
    private static int c;
    public final Calendar d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public String j;

    static {
        int i = b;
        int i2 = i & 61;
        int i3 = -(-((i ^ 61) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    public J(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = O.c(calendar);
        this.d = calendarC;
        this.e = calendarC.get(2);
        this.f = calendarC.get(1);
        this.h = calendarC.getMaximum(7);
        this.g = calendarC.getActualMaximum(5);
        this.i = calendarC.getTimeInMillis();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(J j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 3;
        int i4 = (i3 << 1) - ((~(i2 & 3)) & i3);
        c = i4 % 128;
        int i5 = i4 % 2;
        int iE = e(j);
        int i6 = b + 75;
        c = i6 % 128;
        if (i6 % 2 == 0) {
            return iE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 39;
        int i4 = (i2 ^ 39) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public final int e(J j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 105) - (~(-(-(i2 | 105))))) - 1;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.d.compareTo(j.d);
        }
        this.d.compareTo(j.d);
        throw null;
    }

    public static final class beo implements Parcelable.Creator<J> {
        private static int a = 1;
        private static int b;

        @Override // android.os.Parcelable.Creator
        public final J[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 59;
            int i5 = (i3 ^ 59) | i4;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            J[] jArr = new J[i];
            if (i6 % 2 == 0) {
                int i7 = 99 / 0;
            }
            return jArr;
        }

        @Override // android.os.Parcelable.Creator
        public final J createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = a + 73;
            b = i2 % 128;
            int i3 = i2 % 2;
            J jC = J.c(parcel.readInt(), parcel.readInt());
            int i4 = a;
            int i5 = i4 & 15;
            int i6 = (i4 | 15) & (~i5);
            int i7 = i5 << 1;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            return jC;
        }
    }

    public final int f() {
        int i = 2 % 2;
        int i2 = b + 95;
        c = i2 % 128;
        int i3 = i2 % 2 != 0 ? this.d.get(68) : this.d.get(7);
        int firstDayOfWeek = this.d.getFirstDayOfWeek();
        int i4 = c;
        int i5 = ((i4 ^ 81) | (i4 & 81)) << 1;
        int i6 = -(((~i4) & 81) | (i4 & (-82)));
        int i7 = (i5 & i6) + (i6 | i5);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        int i10 = -firstDayOfWeek;
        int i11 = ((~i10) & i3) | ((~i3) & i10);
        int i12 = -(-((i3 & i10) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        if (i13 < 0) {
            int i14 = (i8 | 31) << 1;
            int i15 = -(i8 ^ 31);
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            c = i16 % 128;
            int i17 = i16 % 2;
            int i18 = -(~this.h);
            i13 = (((i13 | i18) << 1) - (i18 ^ i13)) - 1;
            int i19 = ((i8 & 61) - (~(i8 | 61))) - 1;
            c = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = i8 & 115;
        int i22 = -(-((i8 ^ 115) | i21));
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        c = i23 % 128;
        if (i23 % 2 == 0) {
            return i13;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int h(J j) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 | 7) << 1) - (i5 ^ 7);
        c = i6 % 128;
        int i7 = i6 % 2;
        if (!(this.d instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i8 = i5 + 11;
        c = i8 % 128;
        if (i8 % 2 != 0) {
            i = j.f;
            i2 = this.f;
            i3 = j.e;
            int i9 = 62 / 0;
        } else {
            i = j.f;
            i2 = this.f;
            i3 = j.e;
        }
        int i10 = (((i5 | 46) << 1) - (i5 ^ 46)) - 1;
        c = i10 % 128;
        int i11 = i10 % 2;
        int i12 = -this.e;
        int i13 = (i3 & i12) + (i3 | i12);
        int i14 = -i2;
        int i15 = -(-(((i ^ i14) + ((i14 & i) << 1)) * 12));
        int i16 = ((i13 ^ i15) | (i13 & i15)) << 1;
        int i17 = -((i15 & (~i13)) | ((~i15) & i13));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        int i19 = (((i5 | 70) << 1) - (i5 ^ 70)) - 1;
        c = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 24 / 0;
        }
        return i18;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 71;
        int i4 = i3 + ((i2 ^ 71) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = new Object[2];
        int i6 = this.e;
        int i7 = i2 & 5;
        int i8 = (i2 | 5) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = Integer.valueOf(i6);
        Integer numValueOf = Integer.valueOf(this.f);
        int i12 = c + 111;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            objArr[1] = numValueOf;
            return Arrays.hashCode(objArr);
        }
        objArr[1] = numValueOf;
        Arrays.hashCode(objArr);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final J i(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 35;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 35)) & i4);
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        Calendar calendarC = O.c(this.d);
        calendarC.add(2, i);
        J j = new J(calendarC);
        int i9 = b;
        int i10 = ((i9 | 83) << 1) - (i9 ^ 83);
        c = i10 % 128;
        int i11 = i10 % 2;
        return j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = ((i3 ^ 125) | (i3 & 125)) << 1;
        int i5 = -(((~i3) & 125) | (i3 & (-126)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        parcel.writeInt(this.f);
        parcel.writeInt(this.e);
        int i8 = b;
        int i9 = ((i8 | 101) << 1) - (i8 ^ 101);
        c = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public static J d(long j) {
        int i = 2 % 2;
        Calendar calendarG = O.g();
        calendarG.setTimeInMillis(j);
        J j2 = new J(calendarG);
        int i2 = c;
        int i3 = i2 & 105;
        int i4 = i2 | 105;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 33;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 & 59;
            int i7 = (i2 ^ 59) | i6;
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i2 & 53;
            int i11 = -(-((i2 ^ 53) | i10));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            b = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        boolean z = false;
        if (!(obj instanceof J)) {
            int i14 = i4 + 69;
            c = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        J j = (J) obj;
        if (this.e == j.e) {
            int i16 = ((i4 | 79) << 1) - (i4 ^ 79);
            c = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 77 / 0;
                if (this.f != j.f) {
                    int i18 = ((i4 & 104) + (i4 | 104)) - 1;
                    c = i18 % 128;
                    int i19 = i18 % 2;
                } else {
                    z = true;
                }
            } else if (this.f != j.f) {
                int i110 = ((i4 & 104) + (i4 | 104)) - 1;
                c = i110 % 128;
                int i111 = i110 % 2;
            } else {
                z = true;
            }
        } else {
            int i112 = ((i4 & 104) + (i4 | 104)) - 1;
            c = i112 % 128;
            int i113 = i112 % 2;
        }
        int i20 = c;
        int i21 = (i20 | 65) << 1;
        int i22 = -(((~i20) & 65) | (i20 & (-66)));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        b = i23 % 128;
        int i24 = i23 % 2;
        return z;
    }

    public static J c(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 67;
        int i6 = (i4 ^ 67) | i5;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        Calendar calendarG = O.g();
        calendarG.set(1, i);
        calendarG.set(2, i2);
        J j = new J(calendarG);
        int i9 = b;
        int i10 = (i9 ^ 97) + ((i9 & 97) << 1);
        c = i10 % 128;
        if (i10 % 2 == 0) {
            return j;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public final String g(Context context) {
        long timeInMillis;
        int offset;
        int i;
        String dateTime;
        int i2 = 2 % 2;
        int i3 = b + 93;
        c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
            if (this.j == null) {
                timeInMillis = this.d.getTimeInMillis();
                offset = TimeZone.getDefault().getOffset(timeInMillis);
                int i5 = b;
                i = (((i5 & (-44)) | ((~i5) & 43)) - (~((i5 & 43) << 1))) - 1;
                c = i % 128;
                if (i % 2 != 0) {
                    dateTime = DateUtils.formatDateTime(context, timeInMillis - ((long) offset), 65);
                } else {
                    dateTime = DateUtils.formatDateTime(context, timeInMillis - ((long) offset), 36);
                }
                this.j = dateTime;
                int i6 = c;
                int i7 = i6 & 111;
                int i8 = i7 + ((i6 ^ 111) | i7);
                b = i8 % 128;
                int i9 = i8 % 2;
            }
        } else if (this.j == null) {
            timeInMillis = this.d.getTimeInMillis();
            offset = TimeZone.getDefault().getOffset(timeInMillis);
            int i10 = b;
            i = (((i10 & (-44)) | ((~i10) & 43)) - (~((i10 & 43) << 1))) - 1;
            c = i % 128;
            if (i % 2 != 0) {
                dateTime = DateUtils.formatDateTime(context, timeInMillis - ((long) offset), 65);
            } else {
                dateTime = DateUtils.formatDateTime(context, timeInMillis - ((long) offset), 36);
            }
            this.j = dateTime;
            int i11 = c;
            int i12 = i11 & 111;
            int i13 = i12 + ((i11 ^ 111) | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        String str = this.j;
        int i15 = c;
        int i16 = (((i15 ^ 65) | (i15 & 65)) << 1) - (((~i15) & 65) | (i15 & (-66)));
        b = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 44 / 0;
        }
        return str;
    }
}
