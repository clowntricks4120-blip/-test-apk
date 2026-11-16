package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ivas.gov.bisp.enumeration.A.e;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.O.r;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] a = {R.attr.colorBackground};
    public static final e b = new r();
    public boolean c;
    public boolean d;
    public int e;
    public final Rect f;
    public int g;
    public final Rect h;
    public final ivas.gov.bisp.enumeration.A.r i;

    public class OooO00o implements ivas.gov.bisp.enumeration.A.r {
        public Drawable a;

        public OooO00o() {
        }

        public boolean b() {
            return CardView.this.getPreventCornerOverlap();
        }

        public void c(int i, int i2, int i3, int i4) {
            CardView.this.h.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f = rect;
        this.h = new Rect();
        OooO00o oooO00o = new OooO00o();
        this.i = oooO00o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.c, ivas.gov.bisp.enumeration.R.attr.cardViewStyle, ivas.gov.bisp.enumeration.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(a);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(ivas.gov.bisp.enumeration.R.color.cardview_light_background) : getResources().getColor(ivas.gov.bisp.enumeration.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.c = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.d = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        r rVar = (r) b;
        ivas.gov.bisp.enumeration.A.i iVar = new ivas.gov.bisp.enumeration.A.i(colorStateListValueOf, dimension);
        oooO00o.a = iVar;
        setBackgroundDrawable(iVar);
        setClipToOutline(true);
        setElevation(dimension2);
        rVar.K(oooO00o, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((r) b).G(this.i).k;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f.left;
    }

    public int getContentPaddingRight() {
        return this.f.right;
    }

    public int getContentPaddingTop() {
        return this.f.top;
    }

    public float getMaxCardElevation() {
        return ((r) b).I(this.i);
    }

    public boolean getPreventCornerOverlap() {
        return this.d;
    }

    public float getRadius() {
        return ((r) b).J(this.i);
    }

    public boolean getUseCompatPadding() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        e eVar = b;
        ivas.gov.bisp.enumeration.A.r rVar = this.i;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ivas.gov.bisp.enumeration.A.i iVarG = ((r) eVar).G(rVar);
        iVarG.d(colorStateListValueOf);
        iVarG.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        ((r) b).K(this.i, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.g = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.e = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.d) {
            this.d = z;
            e eVar = b;
            ivas.gov.bisp.enumeration.A.r rVar = this.i;
            r rVar2 = (r) eVar;
            rVar2.K(rVar, rVar2.G(rVar).i);
        }
    }

    public void setRadius(float f) {
        ivas.gov.bisp.enumeration.A.i iVarG = ((r) b).G(this.i);
        if (f != iVarG.d) {
            iVarG.d = f;
            iVarG.e(null);
            iVarG.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.c != z) {
            this.c = z;
            e eVar = b;
            ivas.gov.bisp.enumeration.A.r rVar = this.i;
            r rVar2 = (r) eVar;
            rVar2.K(rVar, rVar2.G(rVar).i);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ivas.gov.bisp.enumeration.A.i iVarG = ((r) b).G(this.i);
        iVarG.d(colorStateList);
        iVarG.invalidateSelf();
    }
}
