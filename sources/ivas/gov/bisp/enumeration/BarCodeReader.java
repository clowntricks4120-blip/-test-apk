package ivas.gov.bisp.enumeration;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes.dex */
public class BarCodeReader extends AppCompatActivity {
    private static int p = 0;
    private static int q = 1;
    public View r;
    public ObjectAnimator s;
    public View t;

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 67;
        int i4 = -(-((i2 ^ 67) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        q = i5 % 128;
        int i6 = i5 % 2;
        super.onPause();
        int i7 = p;
        int i8 = (i7 & (-126)) | ((~i7) & 125);
        int i9 = -(-((i7 & 125) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        q = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((i2 ^ 1) | (i2 & 1)) << 1;
        int i4 = -(((~i2) & 1) | (i2 & (-2)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        p = i5 % 128;
        if (i5 % 2 != 0) {
            super.onResume();
            int i6 = 6 / 0;
        } else {
            super.onResume();
        }
        int i7 = q + 35;
        p = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i = 2 % 2;
            int i2 = a + 7;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                BarCodeReader.this.r.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                throw null;
            }
            BarCodeReader.this.r.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            BarCodeReader.this.r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int height = BarCodeReader.this.r.getHeight();
            int i3 = b;
            int i4 = ((i3 | 29) << 1) - (((~i3) & 29) | (i3 & (-30)));
            a = i4 % 128;
            int i5 = i4 % 2;
            BarCodeReader barCodeReader = BarCodeReader.this;
            View view = barCodeReader.t;
            int i6 = b + 122;
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            barCodeReader.s = ObjectAnimator.ofFloat(view, "translationY", 0.0f, height);
            int i9 = b;
            int i10 = (i9 ^ 87) + ((i9 & 87) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                BarCodeReader.this.s.setRepeatMode(3);
            } else {
                BarCodeReader.this.s.setRepeatMode(2);
            }
            BarCodeReader.this.s.setRepeatCount(-1);
            ObjectAnimator objectAnimator = BarCodeReader.this.s;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            int i11 = a;
            int i12 = i11 & 25;
            int i13 = i12 + ((i11 ^ 25) | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            objectAnimator.setInterpolator(accelerateDecelerateInterpolator);
            BarCodeReader.this.s.setDuration(3000L);
            int i15 = a + 111;
            b = i15 % 128;
            int i16 = i15 % 2;
            BarCodeReader.this.s.start();
            int i17 = b;
            int i18 = i17 & 1;
            int i19 = (i17 ^ 1) | i18;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 ^ 99;
        int i4 = ((i2 & 99) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        p = i6 % 128;
        int i7 = i6 % 2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_bar_code_reader);
        int i8 = q;
        int i9 = ((i8 | 35) << 1) - (i8 ^ 35);
        p = i9 % 128;
        Object obj = null;
        if (i9 % 2 != 0) {
            this.r = findViewById(R.id.scannerLayout);
            this.t = findViewById(R.id.scannerBar);
            obj.hashCode();
            throw null;
        }
        this.r = findViewById(R.id.scannerLayout);
        this.t = findViewById(R.id.scannerBar);
        this.s = null;
        ViewTreeObserver viewTreeObserver = this.r.getViewTreeObserver();
        OooO00o oooO00o = new OooO00o();
        int i10 = q + 57;
        p = i10 % 128;
        int i11 = i10 % 2;
        viewTreeObserver.addOnGlobalLayoutListener(oooO00o);
        if (i11 != 0) {
            throw null;
        }
        int i12 = q + 73;
        p = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
