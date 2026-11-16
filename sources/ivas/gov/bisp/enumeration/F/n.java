package ivas.gov.bisp.enumeration.F;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new aYt();
    private static int b = 1;
    private static int c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final int h;
    public final int i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Bundle m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f43o;
    public final int p;

    public class aYt implements Parcelable.Creator<n> {
        private static int a = 0;
        private static int b = 1;

        @Override // android.os.Parcelable.Creator
        public n createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            n nVar = new n(parcel);
            int i2 = b;
            int i3 = i2 & 77;
            int i4 = (i2 | 77) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 25 / 0;
            }
            return nVar;
        }

        @Override // android.os.Parcelable.Creator
        public n[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 & (-66)) | ((~i3) & 65)) - (~(-(-((i3 & 65) << 1))))) - 1;
            a = i4 % 128;
            n[] nVarArr = new n[i];
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            int i6 = i3 + 125;
            a = i6 % 128;
            int i7 = i6 % 2;
            return nVarArr;
        }
    }

    static {
        int i = c;
        int i2 = i & 43;
        int i3 = i2 + ((i ^ 43) | i2);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
    }

    public n(Fragment fragment) {
        this.e = fragment.getClass().getName();
        this.f = fragment.mWho;
        this.g = fragment.mFromLayout;
        this.i = fragment.mFragmentId;
        this.h = fragment.mContainerId;
        this.j = fragment.mTag;
        this.k = fragment.mRetainInstance;
        this.d = fragment.mRemoving;
        this.l = fragment.mDetached;
        this.m = fragment.mArguments;
        this.n = fragment.mHidden;
        this.p = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 1;
        int i4 = i3 + ((i2 ^ 1) | i3);
        c = i4 % 128;
        return i4 % 2 != 0 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 18) + (i3 | 18);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        c = i5 % 128;
        int i6 = i5 % 2;
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        int i7 = c + 103;
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.i);
            obj.hashCode();
            throw null;
        }
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.i);
        int i8 = c + 59;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            parcel.writeInt(this.h);
            parcel.writeString(this.j);
            int i9 = 8 / 0;
        } else {
            parcel.writeInt(this.h);
            parcel.writeString(this.j);
        }
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        int i10 = c;
        int i11 = ((i10 | 87) << 1) - (i10 ^ 87);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeBundle(this.m);
            throw null;
        }
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.m);
        int i12 = b;
        int i13 = (i12 ^ 59) + ((i12 & 59) << 1);
        c = i13 % 128;
        if (i13 % 2 != 0) {
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeBundle(this.f43o);
            throw null;
        }
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeBundle(this.f43o);
        int i14 = c;
        int i15 = i14 ^ 1;
        int i16 = ((i14 & 1) | i15) << 1;
        int i17 = -i15;
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        parcel.writeInt(this.p);
        int i20 = b + 78;
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        c = i21 % 128;
        if (i21 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder(128);
        int i3 = b + 35;
        c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            sb.append("FragmentState{");
            sb.append(this.e);
            throw null;
        }
        sb.append("FragmentState{");
        sb.append(this.e);
        sb.append(" (");
        sb.append(this.f);
        int i4 = b;
        int i5 = (i4 & 81) + (i4 | 81);
        c = i5 % 128;
        if (i5 % 2 != 0) {
            sb.append(")}:");
            throw null;
        }
        sb.append(")}:");
        if (this.g) {
            int i6 = b;
            int i7 = i6 & 21;
            int i8 = (i6 ^ 21) | i7;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            c = i9 % 128;
            if (i9 % 2 != 0) {
                sb.append(" fromLayout");
                obj.hashCode();
                throw null;
            }
            sb.append(" fromLayout");
            int i10 = b;
            int i11 = (i10 & 57) + (i10 | 57);
            c = i11 % 128;
            int i12 = i11 % 2;
        }
        if (this.h != 0) {
            int i13 = b;
            int i14 = (((i13 | 15) << 1) - (~(-(i13 ^ 15)))) - 1;
            c = i14 % 128;
            if (i14 % 2 != 0) {
                sb.append(" id=0x");
                i = this.h;
                int i15 = 65 / 0;
            } else {
                sb.append(" id=0x");
                i = this.h;
            }
            sb.append(Integer.toHexString(i));
            int i16 = b;
            int i17 = i16 & 69;
            int i18 = -(-((i16 ^ 69) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            c = i19 % 128;
            int i20 = i19 % 2;
        }
        String str = this.j;
        if (str != null) {
            int i21 = c;
            int i22 = ((i21 & 38) + (i21 | 38)) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
            if (!str.isEmpty()) {
                int i24 = c + 71;
                b = i24 % 128;
                int i25 = i24 % 2;
                sb.append(" tag=");
                sb.append(this.j);
                int i26 = c;
                int i27 = (((i26 ^ 71) | (i26 & 71)) << 1) - (((~i26) & 71) | (i26 & (-72)));
                b = i27 % 128;
                if (i27 % 2 == 0) {
                    throw null;
                }
            }
        }
        if (!(!this.k)) {
            int i28 = c + 99;
            b = i28 % 128;
            if (i28 % 2 == 0) {
                sb.append(" retainInstance");
                int i29 = 55 / 0;
            } else {
                sb.append(" retainInstance");
            }
            int i30 = b;
            int i31 = i30 & 95;
            int i32 = ((((i30 ^ 95) | i31) << 1) - (~(-((i30 | 95) & (~i31))))) - 1;
            c = i32 % 128;
            int i33 = i32 % 2;
        }
        if (!(!this.d)) {
            int i34 = c + 113;
            b = i34 % 128;
            if (i34 % 2 == 0) {
                sb.append(" removing");
                throw null;
            }
            sb.append(" removing");
            int i35 = b + 32;
            int i36 = (i35 ^ (-1)) + (i35 << 1);
            c = i36 % 128;
            int i37 = i36 % 2;
        }
        if (this.l) {
            int i38 = c;
            int i39 = i38 & 83;
            int i40 = (((i38 | 83) & (~i39)) - (~(i39 << 1))) - 1;
            b = i40 % 128;
            int i41 = i40 % 2;
            sb.append(" detached");
            if (i41 == 0) {
                throw null;
            }
            int i42 = c;
            int i43 = ((i42 | 107) << 1) - (((~i42) & 107) | (i42 & (-108)));
            b = i43 % 128;
            int i44 = i43 % 2;
        }
        if (this.n) {
            int i45 = b;
            int i46 = ((i45 | 17) << 1) - (i45 ^ 17);
            c = i46 % 128;
            int i47 = i46 % 2;
            sb.append(" hidden");
            int i48 = c + 81;
            b = i48 % 128;
            int i49 = i48 % 2;
        }
        String string = sb.toString();
        int i50 = b;
        int i51 = i50 & 95;
        int i52 = -(-((i50 ^ 95) | i51));
        int i53 = (i51 & i52) + (i52 | i51);
        c = i53 % 128;
        if (i53 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public n(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.e = parcel.readString();
        this.f = parcel.readString();
        if (parcel.readInt() != 0) {
            int i = b;
            int i2 = (((i & (-60)) | ((~i) & 59)) - (~(-(-((i & 59) << 1))))) - 1;
            c = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = true;
        } else {
            int i5 = c;
            int i6 = i5 & 69;
            int i7 = (i5 ^ 69) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            z = false;
        }
        this.g = z;
        this.i = parcel.readInt();
        int i11 = c + 35;
        b = i11 % 128;
        int i12 = i11 % 2;
        this.h = parcel.readInt();
        String string = parcel.readString();
        int i13 = c;
        int i14 = i13 & 7;
        int i15 = (i14 - (~((i13 ^ 7) | i14))) - 1;
        b = i15 % 128;
        if (i15 % 2 == 0) {
            this.j = string;
            parcel.readInt();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.j = string;
        if (parcel.readInt() != 0) {
            int i16 = c;
            int i17 = (i16 ^ 96) + ((i16 & 96) << 1);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = (i16 & 125) + (i16 | 125);
            b = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 2 % 2;
            }
            z2 = true;
        } else {
            int i22 = b;
            int i23 = i22 & 119;
            int i24 = (i22 ^ 119) | i23;
            int i25 = (i23 & i24) + (i24 | i23);
            c = i25 % 128;
            int i26 = i25 % 2;
            int i27 = 2 % 2;
            z2 = false;
        }
        this.k = z2;
        if (parcel.readInt() != 0) {
            int i28 = b + 39;
            c = i28 % 128;
            int i29 = i28 % 2;
            int i30 = 2 % 2;
            z3 = true;
        } else {
            int i31 = c + 47;
            b = i31 % 128;
            if (i31 % 2 != 0) {
                int i32 = 2 % 2;
            }
            z3 = false;
        }
        this.d = z3;
        if (parcel.readInt() != 0) {
            int i33 = b;
            int i34 = (i33 & (-20)) | ((~i33) & 19);
            int i35 = -(-((i33 & 19) << 1));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            c = i36 % 128;
            int i37 = i36 % 2;
            int i38 = 2 % 2;
            z4 = true;
        } else {
            int i39 = c;
            int i40 = (i39 ^ 77) + ((i39 & 77) << 1);
            b = i40 % 128;
            if (i40 % 2 == 0) {
                int i41 = 4 / 5;
            } else {
                int i42 = 2 % 2;
            }
            z4 = false;
        }
        this.l = z4;
        this.m = parcel.readBundle();
        if (parcel.readInt() != 0) {
            int i43 = c;
            int i44 = i43 ^ 27;
            int i45 = ((i43 & 27) | i44) << 1;
            int i46 = -i44;
            int i47 = (i45 & i46) + (i45 | i46);
            b = i47 % 128;
            z5 = i47 % 2 != 0;
            int i48 = 2 % 2;
        } else {
            int i49 = b;
            int i50 = ((i49 | 8) << 1) - (i49 ^ 8);
            int i51 = (i50 ^ (-1)) + (i50 << 1);
            c = i51 % 128;
            if (i51 % 2 != 0) {
                int i52 = 3 % 4;
            } else {
                int i53 = 2 % 2;
            }
            z5 = false;
        }
        this.n = z5;
        this.f43o = parcel.readBundle();
        int i54 = b;
        int i55 = i54 & 17;
        int i56 = -(-((i54 ^ 17) | i55));
        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
        c = i57 % 128;
        if (i57 % 2 != 0) {
            this.p = parcel.readInt();
            int i58 = 46 / 0;
        } else {
            this.p = parcel.readInt();
        }
        int i59 = c + 65;
        b = i59 % 128;
        int i60 = i59 % 2;
    }
}
