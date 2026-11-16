package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class OooO0OO extends ViewGroup {
    public b a;

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aJS(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aJS(getContext(), attributeSet);
    }

    public b getConstraintSet() {
        if (this.a == null) {
            this.a = new b();
        }
        b bVar = this.a;
        Objects.requireNonNull(bVar);
        int childCount = getChildCount();
        bVar.e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            aJS ajs = (aJS) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!bVar.e.containsKey(Integer.valueOf(id))) {
                bVar.e.put(Integer.valueOf(id), new b.aJN());
            }
            b.aJN ajn = bVar.e.get(Integer.valueOf(id));
            if (childAt instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) childAt;
                ajn.d(id, ajs);
                if (oooO00o instanceof Barrier) {
                    b.aJO ajo = ajn.d;
                    ajo.ad = 1;
                    Barrier barrier = (Barrier) oooO00o;
                    ajo.ab = barrier.getType();
                    ajn.d.ae = barrier.getReferencedIds();
                    ajn.d.ac = barrier.getMargin();
                }
            }
            ajn.d(id, ajs);
        }
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.OooO00o(layoutParams);
    }

    public static class aJS extends ConstraintLayout.OooO00o {
        public float am;
        public boolean an;
        public float ao;
        public float ap;
        public float aq;
        public float ar;
        public float as;
        public float at;
        public float au;
        public float av;
        public float aw;
        public float ax;
        public float ay;

        public aJS(int i, int i2) {
            super(i, i2);
            this.am = 1.0f;
            this.an = false;
            this.ao = 0.0f;
            this.ap = 0.0f;
            this.as = 0.0f;
            this.ay = 0.0f;
            this.ar = 1.0f;
            this.aq = 1.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.at = 0.0f;
            this.au = 0.0f;
        }

        public aJS(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.am = 1.0f;
            this.an = false;
            this.ao = 0.0f;
            this.ap = 0.0f;
            this.as = 0.0f;
            this.ay = 0.0f;
            this.ar = 1.0f;
            this.aq = 1.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.at = 0.0f;
            this.au = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.am = typedArrayObtainStyledAttributes.getFloat(index, this.am);
                } else if (index == 28) {
                    this.ao = typedArrayObtainStyledAttributes.getFloat(index, this.ao);
                    this.an = true;
                } else if (index == 23) {
                    this.as = typedArrayObtainStyledAttributes.getFloat(index, this.as);
                } else if (index == 24) {
                    this.ay = typedArrayObtainStyledAttributes.getFloat(index, this.ay);
                } else if (index == 22) {
                    this.ap = typedArrayObtainStyledAttributes.getFloat(index, this.ap);
                } else if (index == 20) {
                    this.ar = typedArrayObtainStyledAttributes.getFloat(index, this.ar);
                } else if (index == 21) {
                    this.aq = typedArrayObtainStyledAttributes.getFloat(index, this.aq);
                } else if (index == 16) {
                    this.av = typedArrayObtainStyledAttributes.getFloat(index, this.av);
                } else if (index == 17) {
                    this.aw = typedArrayObtainStyledAttributes.getFloat(index, this.aw);
                } else if (index == 18) {
                    this.ax = typedArrayObtainStyledAttributes.getFloat(index, this.ax);
                } else if (index == 19) {
                    this.at = typedArrayObtainStyledAttributes.getFloat(index, this.at);
                } else if (index == 27) {
                    this.au = typedArrayObtainStyledAttributes.getFloat(index, this.au);
                }
            }
        }
    }
}
