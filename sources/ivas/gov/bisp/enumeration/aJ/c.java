package ivas.gov.bisp.enumeration.aJ;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class c implements View.OnTouchListener {
    private static int a = 1;
    private static int b;
    public final Dialog c;
    public final int d;
    public final int e;
    public final int f;

    public c(Dialog dialog, Rect rect) {
        this.c = dialog;
        this.d = rect.left;
        this.e = rect.top;
        this.f = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 69;
        a = i3 % 128;
        int i4 = i3 % 2;
        View viewFindViewById = view.findViewById(R.id.content);
        int i5 = this.d;
        int i6 = a + 113;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int left = viewFindViewById.getLeft();
            i = (left & i5) + (i5 | left);
        } else {
            int left2 = viewFindViewById.getLeft();
            int i7 = -(-i5);
            int i8 = left2 | i7;
            i = (i8 << 1) - ((~(i7 & left2)) & i8);
        }
        int width = viewFindViewById.getWidth();
        int top = viewFindViewById.getTop() + this.e;
        int height = viewFindViewById.getHeight();
        float f = i;
        float f2 = top;
        int i9 = -(~i);
        float f3 = (((width | i9) << 1) - (width ^ i9)) - 1;
        int i10 = -(-top);
        int i11 = height & i10;
        int i12 = -(-(height | i10));
        RectF rectF = new RectF(f, f2, f3, ((i11 | i12) << 1) - (i12 ^ i11));
        int i13 = a;
        int i14 = i13 & 45;
        int i15 = i14 + ((i13 ^ 45) | i14);
        b = i15 % 128;
        int i16 = i15 % 2;
        boolean zContains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        Object obj = null;
        if (zContains) {
            int i17 = a;
            int i18 = i17 + 101;
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i17 ^ 45;
            int i21 = (i17 & 45) << 1;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                return false;
            }
            throw null;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            int i23 = a;
            int i24 = i23 & 69;
            int i25 = i24 + ((i23 ^ 69) | i24);
            b = i25 % 128;
            int i26 = i25 % 2;
            motionEventObtain.setAction(4);
            int i27 = a + 85;
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        if (Build.VERSION.SDK_INT < 28) {
            int i29 = a + 7;
            b = i29 % 128;
            int i30 = i29 % 2;
            motionEventObtain.setAction(0);
            int i31 = this.f;
            int i32 = a;
            int i33 = i32 + 21;
            b = i33 % 128;
            int i34 = i33 % 2;
            int i35 = -i31;
            int i36 = i35 ^ (-1);
            int i37 = i32 + 1;
            b = i37 % 128;
            int i38 = i37 % 2;
            motionEventObtain.setLocation(((i35 | i36) << 1) - i36, (-2) - i36);
            int i39 = b;
            int i40 = i39 & 41;
            int i41 = ((i39 ^ 41) | i40) << 1;
            int i42 = -((i39 | 41) & (~i40));
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            a = i43 % 128;
            if (i43 % 2 == 0) {
                int i44 = 5 % 4;
            }
        }
        view.performClick();
        boolean zOnTouchEvent = this.c.onTouchEvent(motionEventObtain);
        int i45 = b;
        int i46 = (i45 ^ 61) + ((i45 & 61) << 1);
        a = i46 % 128;
        if (i46 % 2 != 0) {
            return zOnTouchEvent;
        }
        obj.hashCode();
        throw null;
    }
}
