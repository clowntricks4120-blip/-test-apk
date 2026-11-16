package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.x;
import ivas.gov.bisp.enumeration.p100w.r;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends OooO00o {
    public int g;
    public int h;
    public x i;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.OooO00o
    public void g(C0087m c0087m, boolean z) {
        int i = this.h;
        this.g = i;
        if (z) {
            if (i == 5) {
                this.g = 1;
            } else if (i == 6) {
                this.g = 0;
            }
        } else if (i == 5) {
            this.g = 0;
        } else if (i == 6) {
            this.g = 1;
        }
        if (c0087m instanceof x) {
            ((x) c0087m).aj = this.g;
        }
    }

    public int getMargin() {
        return this.i.ak;
    }

    public int getType() {
        return this.h;
    }

    @Override // androidx.constraintlayout.widget.OooO00o
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.i = new x();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.g);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.i.ai = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.i.ak = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.e = this.i;
        i();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.i.ai = z;
    }

    public void setDpMargin(int i) {
        this.i.ak = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.i.ak = i;
    }

    public void setType(int i) {
        this.h = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
