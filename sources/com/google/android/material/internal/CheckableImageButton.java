package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import ivas.gov.bisp.enumeration.OooOOO0.Oooo000;
import ivas.gov.bisp.enumeration.P.C0020j;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p103z.l;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends Oooo000 implements Checkable {
    public static final int[] a = {R.attr.state_checked};
    public boolean b;
    public boolean f;
    public boolean g;

    public static class OooO00o extends l {
        public static final Parcelable.Creator<OooO00o> CREATOR = new C0006OooO00o();
        public boolean b;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0006OooO00o implements Parcelable.ClassLoaderCreator<OooO00o> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final OooO00o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new OooO00o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OooO00o[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new OooO00o(parcel, null);
            }
        }

        public OooO00o(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public OooO00o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = parcel.readInt() == 1;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.imageButtonStyle);
        this.b = true;
        this.g = true;
        T.q(this, new C0020j(this));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = a;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooO00o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooO00o oooO00o = (OooO00o) parcelable;
        super.onRestoreInstanceState(oooO00o.e);
        setChecked(oooO00o.b);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        OooO00o oooO00o = new OooO00o(super.onSaveInstanceState());
        oooO00o.b = this.f;
        return oooO00o;
    }

    public void setCheckable(boolean z) {
        if (this.b != z) {
            this.b = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.b || this.f == z) {
            return;
        }
        this.f = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.g = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.g) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f);
    }
}
