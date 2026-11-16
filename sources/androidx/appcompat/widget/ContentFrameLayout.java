package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.n;
import ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o;
import ivas.gov.bisp.enumeration.p087j.x;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0320s;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public OooO00o a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;

    public interface OooO00o {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getMinWidthMajor() {
        if (this.b == null) {
            this.b = new TypedValue();
        }
        return this.b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO00o oooO00o = this.a;
        if (oooO00o != null) {
            Objects.requireNonNull(oooO00o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO00o oooO00o = this.a;
        if (oooO00o != null) {
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o = ((x) oooO00o).a;
            InterfaceC0320s interfaceC0320s = layoutInflaterFactory2C0312o.q;
            if (interfaceC0320s != null) {
                interfaceC0320s.p();
            }
            if (layoutInflaterFactory2C0312o.w != null) {
                layoutInflaterFactory2C0312o.k.getDecorView().removeCallbacks(layoutInflaterFactory2C0312o.v);
                if (layoutInflaterFactory2C0312o.w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0312o.w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0312o.w = null;
            }
            layoutInflaterFactory2C0312o.L();
            n nVar = layoutInflaterFactory2C0312o.Q(0).k;
            if (nVar != null) {
                nVar.f(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f : this.d;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        float f = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(f, f);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        Rect rect = this.h;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    Rect rect2 = this.h;
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.e : this.g;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        float f2 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(f2, f2);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        Rect rect3 = this.h;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    Rect rect4 = this.h;
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.c : this.b;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        float f3 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(f3, f3);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        Rect rect5 = this.h;
                        i4 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    Rect rect6 = this.h;
                    i4 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public void setAttachListener(OooO00o oooO00o) {
        this.a = oooO00o;
    }
}
