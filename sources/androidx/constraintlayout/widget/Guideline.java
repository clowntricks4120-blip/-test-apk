package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        oooO00o.b = i;
        setLayoutParams(oooO00o);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        oooO00o.c = i;
        setLayoutParams(oooO00o);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        oooO00o.d = f;
        setLayoutParams(oooO00o);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
