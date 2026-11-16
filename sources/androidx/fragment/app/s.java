package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new aLh();
    public ArrayList<h.aLL> b;
    public ArrayList<ivas.gov.bisp.enumeration.F.n> c;
    public ArrayList<String> d;
    public b[] e;
    public String f;
    public int g;
    public ArrayList<String> h;
    public ArrayList<Bundle> i;

    public class aLh implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public s[] newArray(int i) {
            return new s[i];
        }
    }

    public s() {
        this.f = null;
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.c);
        parcel.writeStringList(this.d);
        parcel.writeTypedArray(this.e, i);
        parcel.writeInt(this.g);
        parcel.writeString(this.f);
        parcel.writeStringList(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeTypedList(this.b);
    }

    public s(Parcel parcel) {
        this.f = null;
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.c = parcel.createTypedArrayList(ivas.gov.bisp.enumeration.F.n.CREATOR);
        this.d = parcel.createStringArrayList();
        this.e = (b[]) parcel.createTypedArray(b.CREATOR);
        this.g = parcel.readInt();
        this.f = parcel.readString();
        this.h = parcel.createStringArrayList();
        this.i = parcel.createTypedArrayList(Bundle.CREATOR);
        this.b = parcel.createTypedArrayList(h.aLL.CREATOR);
    }
}
