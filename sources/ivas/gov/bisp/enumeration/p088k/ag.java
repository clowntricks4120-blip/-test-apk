package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public class ag {
    private static int a = 0;
    private static int b = 1;
    public final Context c;
    public final View d;
    public final TextView e;
    public final WindowManager.LayoutParams f;
    public final int[] g;
    public final Rect h;
    public final int[] i;

    public ag(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f = layoutParams;
        this.h = new Rect();
        this.g = new int[2];
        this.i = new int[2];
        this.c = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.d = viewInflate;
        this.e = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(ag.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 25;
        int i4 = ((((i2 ^ 25) | i3) << 1) - (~(-((i2 | 25) & (~i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.d.getParent() == null) {
            int i6 = a;
            int i7 = (i6 & (-110)) | ((~i6) & 109);
            int i8 = -(-((i6 & 109) << 1));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i6 + 55;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 40 / 0;
                return;
            }
            return;
        }
        int i13 = b;
        int i14 = i13 + 1;
        a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i13 + 31;
        a = i16 % 128;
        int i17 = i16 % 2;
        WindowManager windowManager = (WindowManager) this.c.getSystemService("window");
        int i18 = b;
        int i19 = (i18 & (-30)) | ((~i18) & 29);
        int i20 = -(-((i18 & 29) << 1));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        if (i21 % 2 == 0) {
            windowManager.removeView(this.d);
        } else {
            windowManager.removeView(this.d);
            int i22 = 89 / 0;
        }
    }
}
