package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import ivas.gov.bisp.enumeration.Q.J;
import ivas.gov.bisp.enumeration.Q.O;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new aOf();
    public final J b;
    public final J c;
    public final aOh d;
    public final int e;
    public J f;
    public final int g;

    public static final class aOf implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j((J) parcel.readParcelable(J.class.getClassLoader()), (J) parcel.readParcelable(J.class.getClassLoader()), (aOh) parcel.readParcelable(aOh.class.getClassLoader()), (J) parcel.readParcelable(J.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i) {
            return new j[i];
        }
    }

    public static final class aOg {
        public long c;
        public long d;
        public Long e;
        public aOh f;
        public static final long b = O.b(J.c(1900, 0).i);
        public static final long a = O.b(J.c(2100, 11).i);

        public aOg(j jVar) {
            this.c = b;
            this.d = a;
            this.f = new c(Long.MIN_VALUE);
            this.c = jVar.b.i;
            this.d = jVar.c.i;
            this.e = Long.valueOf(jVar.f.i);
            this.f = jVar.d;
        }
    }

    public interface aOh extends Parcelable {
        boolean p(long j);
    }

    public j(J j, J j2, aOh aoh, J j3, aOf aof) {
        this.b = j;
        this.c = j2;
        this.f = j3;
        this.d = aoh;
        if (j3 != null && j.d.compareTo(j3.d) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (j3 != null && j3.d.compareTo(j2.d) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.g = j.h(j2) + 1;
        this.e = (j2.f - j.f) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.b.equals(jVar.b) && this.c.equals(jVar.c) && Objects.equals(this.f, jVar.f) && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.f, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
