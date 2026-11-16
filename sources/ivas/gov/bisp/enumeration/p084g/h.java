package ivas.gov.bisp.enumeration.p084g;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new aPY();
    private static int b = 1;
    private static int c;
    public final int d;
    public final Intent e;

    public class aPY implements Parcelable.Creator<h> {
        private static int a = 0;
        private static int b = 1;

        @Override // android.os.Parcelable.Creator
        public h createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            h hVar = new h(parcel);
            int i2 = a;
            int i3 = (((i2 | 14) << 1) - (i2 ^ 14)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            return hVar;
        }

        @Override // android.os.Parcelable.Creator
        public h[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 91;
            int i5 = (i4 - (~(-(-((i3 ^ 91) | i4))))) - 1;
            a = i5 % 128;
            h[] hVarArr = new h[i];
            if (i5 % 2 == 0) {
                return hVarArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = c + 77;
        b = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public h(int i, Intent intent) {
        this.d = i;
        this.e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 53) + (i2 | 53);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 85;
        c = i6 % 128;
        int i7 = i6 % 2;
        return 0;
    }

    public final String toString() {
        String strValueOf;
        char c2;
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 96) + (i2 | 96);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            j.w("ActivityResult{resultCode=");
            throw null;
        }
        StringBuilder sbW = j.w("ActivityResult{resultCode=");
        int i5 = this.d;
        int i6 = c;
        int i7 = (i6 ^ 68) + ((i6 & 68) << 1);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        if (i5 != -1) {
            int i11 = i9 + 102;
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            c = i12 % 128;
            int i13 = i12 % 2;
            if (i5 != 0) {
                int i14 = i9 & 41;
                int i15 = (i9 | 41) & (~i14);
                int i16 = -(-(i14 << 1));
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                c = i17 % 128;
                if (i17 % 2 != 0) {
                    String.valueOf(i5);
                    throw null;
                }
                strValueOf = String.valueOf(i5);
            } else {
                int i18 = i9 & 9;
                int i19 = (~i18) & (i9 | 9);
                int i20 = i18 << 1;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                c = i21 % 128;
                int i22 = i21 % 2;
                strValueOf = "RESULT_CANCELED";
            }
        } else {
            int i23 = i9 & 7;
            int i24 = i23 + ((i9 ^ 7) | i23);
            c = i24 % 128;
            int i25 = i24 % 2;
            strValueOf = "RESULT_OK";
        }
        sbW.append(strValueOf);
        sbW.append(", data=");
        int i26 = b;
        int i27 = (-2) - (((i26 & 108) + (i26 | 108)) ^ (-1));
        c = i27 % 128;
        if (i27 % 2 != 0) {
            sbW.append(this.e);
            c2 = 6;
        } else {
            sbW.append(this.e);
            c2 = '}';
        }
        sbW.append(c2);
        String string = sbW.toString();
        int i28 = b;
        int i29 = (i28 ^ 40) + ((i28 & 40) << 1);
        int i30 = (i29 ^ (-1)) + (i29 << 1);
        c = i30 % 128;
        int i31 = i30 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        Intent intent;
        int i3;
        int i4 = 2 % 2;
        int i5 = c;
        int i6 = i5 & 9;
        int i7 = ((i5 | 9) & (~i6)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        parcel.writeInt(this.d);
        if (this.e == null) {
            int i9 = c;
            int i10 = i9 & 25;
            int i11 = -(-((i9 ^ 25) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            intent = this.e;
            if (intent != null) {
                int i13 = b;
                int i14 = (i13 ^ 70) + ((i13 & 70) << 1);
                int i15 = (i14 ^ (-1)) + (i14 << 1);
                c = i15 % 128;
                i3 = i15 % 2;
                intent.writeToParcel(parcel, i);
                if (i3 != 0) {
                    int i16 = 38 / 0;
                }
            }
            int i17 = b;
            int i18 = i17 & 31;
            int i19 = -(-(i17 | 31));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            c = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = b;
        int i23 = i22 & 53;
        int i24 = ((i22 | 53) & (~i23)) + (i23 << 1);
        c = i24 % 128;
        int i25 = i24 % 2;
        i2 = 1;
        parcel.writeInt(i2);
        intent = this.e;
        if (intent != null) {
            int i110 = b;
            int i111 = (i110 ^ 70) + ((i110 & 70) << 1);
            int i112 = (i111 ^ (-1)) + (i111 << 1);
            c = i112 % 128;
            i3 = i112 % 2;
            intent.writeToParcel(parcel, i);
            if (i3 != 0) {
                int i113 = 38 / 0;
            }
        }
        int i114 = b;
        int i115 = i114 & 31;
        int i116 = -(-(i114 | 31));
        int i26 = ((i115 | i116) << 1) - (i116 ^ i115);
        c = i26 % 128;
        int i27 = i26 % 2;
    }

    public h(Parcel parcel) {
        this.d = parcel.readInt();
        Intent intent = null;
        if (parcel.readInt() == 0) {
            int i = b;
            int i2 = i & 125;
            int i3 = -(-(i | 125));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            c = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } else {
            Intent intent2 = (Intent) Intent.CREATOR.createFromParcel(parcel);
            int i6 = c;
            int i7 = (i6 ^ 119) + ((i6 & 119) << 1);
            int i8 = i7 % 128;
            b = i8;
            if (i7 % 2 == 0) {
                intent.hashCode();
                throw null;
            }
            int i9 = ((i8 & 108) + (i8 | 108)) - 1;
            c = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 2;
            }
            intent = intent2;
        }
        this.e = intent;
        int i11 = c + 21;
        b = i11 % 128;
        int i12 = i11 % 2;
    }
}
