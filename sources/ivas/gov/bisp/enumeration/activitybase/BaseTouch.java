package ivas.gov.bisp.enumeration.activitybase;

import android.util.Log;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTouch extends BaseAuth {
    private static int p = 0;
    private static int q = 1;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 53;
        int i4 = -(-((i2 ^ 53) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        q = i5 % 128;
        if (i5 % 2 == 0) {
            motionEvent.getAction();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (motionEvent.getAction() == 0) {
            this.W.c();
            int i6 = p;
            int i7 = ((i6 ^ 29) | (i6 & 29)) << 1;
            int i8 = -(((~i6) & 29) | (i6 & (-30)));
            int i9 = (i7 & i8) + (i8 | i7);
            q = i9 % 128;
            int i10 = i9 % 2;
        }
        this.W.d = Boolean.TRUE;
        int i11 = p + 83;
        q = i11 % 128;
        int i12 = i11 % 2;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int i13 = q + 97;
        p = i13 % 128;
        int i14 = i13 % 2;
        return zDispatchTouchEvent;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r1
  0x002b: PHI (r1v6 ivas.gov.bisp.enumeration.activitybase.c) = (r1v5 ivas.gov.bisp.enumeration.activitybase.c), (r1v14 ivas.gov.bisp.enumeration.activitybase.c) binds: [B:8:0x0029, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        c cVar;
        int i;
        int i2 = 2 % 2;
        int i3 = q;
        int i4 = i3 & 1;
        int i5 = (((i3 ^ 1) | i4) << 1) - ((i3 | 1) & (~i4));
        p = i5 % 128;
        if (i5 % 2 != 0) {
            super.onResume();
            cVar = this.W;
            int i6 = 81 / 0;
            if (cVar != null) {
                i = q + 67;
                p = i % 128;
                if (i % 2 == 0) {
                    cVar.c();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                cVar.c();
            }
        } else {
            super.onResume();
            cVar = this.W;
            if (cVar != null) {
                i = q + 67;
                p = i % 128;
                if (i % 2 == 0) {
                    cVar.c();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                cVar.c();
            }
        }
        int i7 = p;
        int i8 = i7 & 49;
        int i9 = -(-((i7 ^ 49) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        q = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((i2 ^ 82) + ((i2 & 82) << 1)) - 1;
        p = i3 % 128;
        int i4 = i3 % 2;
        super.onPause();
        c cVar = this.W;
        if (cVar != null) {
            int i5 = q;
            int i6 = (i5 & 23) + (i5 | 23);
            p = i6 % 128;
            int i7 = i6 % 2;
            cVar.d();
            int i8 = p + 13;
            q = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = q;
        int i11 = i10 & 95;
        int i12 = ((i10 | 95) & (~i11)) + (i11 << 1);
        p = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((i2 ^ 23) | (i2 & 23)) << 1;
        int i4 = -(((~i2) & 23) | (i2 & (-24)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        p = i5 % 128;
        if (i5 % 2 != 0) {
            Log.e("main::", "setData");
            this.W.c();
            throw null;
        }
        Log.e("main::", "setData");
        this.W.c();
        int i6 = q;
        int i7 = i6 & 45;
        int i8 = (i6 ^ 45) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        p = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 66 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v8 ivas.gov.bisp.enumeration.activitybase.c) = (r1v7 ivas.gov.bisp.enumeration.activitybase.c), (r1v19 ivas.gov.bisp.enumeration.activitybase.c) binds: [B:8:0x0025, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        c cVar;
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 75;
        int i4 = -(-(i2 | 75));
        int i5 = (i3 & i4) + (i4 | i3);
        p = i5 % 128;
        if (i5 % 2 != 0) {
            super.onDestroy();
            cVar = this.W;
            int i6 = 2 / 0;
            if (cVar != null) {
                int i7 = q;
                int i8 = (i7 & 45) + (i7 | 45);
                p = i8 % 128;
                int i9 = i8 % 2;
                cVar.d();
                int i10 = q;
                int i11 = i10 & 83;
                int i12 = (i11 - (~((i10 ^ 83) | i11))) - 1;
                p = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            super.onDestroy();
            cVar = this.W;
            if (cVar != null) {
                int i14 = q;
                int i15 = (i14 & 45) + (i14 | 45);
                p = i15 % 128;
                int i16 = i15 % 2;
                cVar.d();
                int i17 = q;
                int i18 = i17 & 83;
                int i19 = (i18 - (~((i17 ^ 83) | i18))) - 1;
                p = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        int i20 = q;
        int i21 = (i20 & 84) + (i20 | 84);
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        p = i22 % 128;
        int i23 = i22 % 2;
    }
}
