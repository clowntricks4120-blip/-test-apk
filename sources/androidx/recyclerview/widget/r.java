package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class r extends RecyclerView.o0OOO0o {
    public PointF j;
    public final DisplayMetrics k;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean l = false;
    public int m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30o = 0;

    public r(Context context) {
        this.k = context.getResources().getDisplayMetrics();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // androidx.recyclerview.widget.RecyclerView.o0OOO0o
    public void c(View view, RecyclerView.o0Oo0oo o0oo0oo, RecyclerView.o0OOO0o.OooO00o oooO00o) {
        int i;
        int iE;
        int i2;
        PointF pointF = this.j;
        int iE2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                i = f > 0.0f ? 1 : -1;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        RecyclerView.Oooo000 oooo000 = this.c;
        if (oooo000 == null || !oooo000.k()) {
            iE = 0;
        } else {
            RecyclerView.Oooo0 oooo0 = (RecyclerView.Oooo0) view.getLayoutParams();
            iE = e(oooo000.D(view) - ((ViewGroup.MarginLayoutParams) oooo0).leftMargin, oooo000.J(view) + ((ViewGroup.MarginLayoutParams) oooo0).rightMargin, oooo000.Q(), oooo000.m - oooo000.R(), i);
        }
        PointF pointF2 = this.j;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        RecyclerView.Oooo000 oooo001 = this.c;
        if (oooo001 != null && oooo001.j()) {
            RecyclerView.Oooo0 oooo1 = (RecyclerView.Oooo0) view.getLayoutParams();
            iE2 = e(oooo001.K(view) - ((ViewGroup.MarginLayoutParams) oooo1).topMargin, oooo001.C(view) + ((ViewGroup.MarginLayoutParams) oooo1).bottomMargin, oooo001.H(), oooo001.f26o - oooo001.O(), i2);
        }
        int iCeil = (int) Math.ceil(((double) f((int) Math.sqrt((iE2 * iE2) + (iE * iE)))) / 0.3356d);
        if (iCeil > 0) {
            oooO00o.c(-iE, -iE2, iCeil, this.h);
        }
    }

    public int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int f(int i) {
        float fAbs = Math.abs(i);
        if (!this.l) {
            this.n = g(this.k);
            this.l = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public float g(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }
}
