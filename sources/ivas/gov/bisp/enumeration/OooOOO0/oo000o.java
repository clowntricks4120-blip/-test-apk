package ivas.gov.bisp.enumeration.OooOOO0;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p088k.N;
import ivas.gov.bisp.enumeration.p088k.ad;

/* JADX INFO: loaded from: classes.dex */
public class oo000o extends RatingBar {
    public final N a;

    public oo000o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        ad.b(this, getContext());
        N n = new N(this);
        this.a = n;
        n.c(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onMeasure(int i, int i2) {
        synchronized (this) {
            super.onMeasure(i, i2);
            Bitmap bitmap = this.a.e;
            if (bitmap != null) {
                setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
            }
        }
    }
}
