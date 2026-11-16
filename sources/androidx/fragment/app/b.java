package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new aKJ();
    public final int b;
    public final int[] c;
    public final ArrayList<String> d;
    public final int[] e;
    public final int f;
    public final int[] g;
    public final String h;
    public final int i;
    public final CharSequence j;
    public final int k;
    public final CharSequence l;
    public final ArrayList<String> m;
    public final ArrayList<String> n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f22o;

    public class aKJ implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(a aVar) {
        int size = aVar.b.size();
        this.c = new int[size * 5];
        if (!aVar.h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.d = new ArrayList<>(size);
        this.e = new int[size];
        this.g = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            g.aLk alk = aVar.b.get(i);
            int i3 = i2 + 1;
            this.c[i2] = alk.a;
            ArrayList<String> arrayList = this.d;
            Fragment fragment = alk.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.c;
            iArr[i3] = alk.c;
            iArr[i2 + 2] = alk.d;
            iArr[i2 + 3] = alk.f;
            iArr[i2 + 4] = alk.e;
            this.e[i] = alk.g.ordinal();
            this.g[i] = alk.h.ordinal();
            i++;
            i2 += 5;
        }
        this.f = aVar.f;
        this.h = aVar.i;
        this.i = aVar.q;
        this.b = aVar.a;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.n = aVar.n;
        this.m = aVar.m;
        this.f22o = aVar.f23o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.c);
        parcel.writeStringList(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.g);
        parcel.writeInt(this.f);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.b);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.f22o ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.c = parcel.createIntArray();
        this.d = parcel.createStringArrayList();
        this.e = parcel.createIntArray();
        this.g = parcel.createIntArray();
        this.f = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.b = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.f22o = parcel.readInt() != 0;
    }
}
