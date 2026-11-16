package ivas.gov.bisp.enumeration.p084g;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new aQa();
    private static int b = 1;
    private static int c;
    public final IntentSender d;
    public final Intent e;
    public final int f;
    public final int g;

    public class aQa implements Parcelable.Creator<p> {
        private static int a = 1;
        private static int b;

        @Override // android.os.Parcelable.Creator
        public p createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            p pVar = new p(parcel);
            int i2 = a;
            int i3 = (i2 & (-54)) | ((~i2) & 53);
            int i4 = -(-((i2 & 53) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return pVar;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public p[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 + 49;
            a = i4 % 128;
            int i5 = i4 % 2;
            p[] pVarArr = new p[i];
            int i6 = ((i3 ^ 1) | (i3 & 1)) << 1;
            int i7 = -(((~i3) & 1) | (i3 & (-2)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return pVarArr;
        }
    }

    static {
        int i = b;
        int i2 = (i & 1) + (i | 1);
        c = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public p(IntentSender intentSender, Intent intent, int i, int i2) {
        this.d = intentSender;
        this.e = intent;
        this.f = i;
        this.g = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 122) << 1) - (i2 ^ 122);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        c = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 89;
        int i7 = (i6 - (~((i2 ^ 89) | i6))) - 1;
        c = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = ((i3 & (-88)) | ((~i3) & 87)) + ((i3 & 87) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        parcel.writeParcelable(this.d, i);
        Intent intent = this.e;
        int i6 = b;
        int i7 = (i6 ^ 99) + ((i6 & 99) << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        parcel.writeParcelable(intent, i);
        if (i8 != 0) {
            parcel.writeInt(this.f);
            obj.hashCode();
            throw null;
        }
        parcel.writeInt(this.f);
        int i9 = b;
        int i10 = i9 & 63;
        int i11 = (i9 | 63) & (~i10);
        int i12 = i10 << 1;
        int i13 = (i11 & i12) + (i11 | i12);
        c = i13 % 128;
        int i14 = i13 % 2;
        parcel.writeInt(this.g);
        if (i14 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public p(Parcel parcel) {
        this.d = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.e = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }
}
